#ifndef GODOT_JVM_KT_VARIANT_H
#define GODOT_JVM_KT_VARIANT_H

#include "binding/kotlin_binding_manager.h"
#include "jni/wrapper.h"
#include "jvm_wrapper/memory/long_string_queue.h"
#include "jvm_wrapper/memory/type_manager.h"
#include "logging.h"
#include "shared_buffer.h"
#include "variant_allocator.h"

#include <core/io/marshalls.h>
#include <core/os/os.h>
#include <core/variant/variant.h>

constexpr const int BOOL_SIZE = 4;
constexpr const int PTR_SIZE = 8;
constexpr const int INT_SIZE = 4;

class VariantToBuffer {
    template<Variant::Type variantType, class T>
    static void write_core_type(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, variantType);

        *reinterpret_cast<T*>(des->get_cursor()) = src;
        des->increment_position(sizeof(T));
    }

    template<class TNativeCoreType>
    inline static void write_pointer(SharedBuffer* des, TNativeCoreType native_core_type) {
        des->increment_position(
          encode_uint64(reinterpret_cast<uintptr_t>(VariantAllocator::alloc(TNativeCoreType(native_core_type))), des->get_cursor())
        );
    }

    template<Variant::Type variantType, class TNativeCoreType, TNativeCoreType (Variant::* converter)() const>
    static void write_native_core_type(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, variantType);
        write_pointer(des, (src.*converter)());
    }

    static void set_variant_type(SharedBuffer* des, Variant::Type variant_type) {
        des->increment_position(encode_uint32(variant_type, des->get_cursor()));
    }

    static void write_nil(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::NIL);
    }

    static void write_bool(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::BOOL);
        des->increment_position(encode_uint32(src.operator bool(), des->get_cursor()));
    }

    static void write_string(SharedBuffer* des, const Variant& src) {
        String str {src};
        const CharString& char_string {str.utf8()};
        set_variant_type(des, Variant::Type::STRING);
        int size = char_string.size();
        if (unlikely(size > LongStringQueue::max_string_size)) {
            des->increment_position(encode_uint32(true, des->get_cursor()));
            jni::Env env = jni::Jvm::current_env();
            LongStringQueue::get_instance().send_string_to_jvm(env, str);
        } else {
            des->increment_position(encode_uint32(false, des->get_cursor()));
            des->increment_position(encode_uint32(char_string.size(), des->get_cursor()));
            if (likely(size > 0)) { des->increment_position(encode_cstring(char_string, des->get_cursor())); }
        }
    }

    static void write_array(SharedBuffer* des, const Variant& src) {
        Array arr = src.operator Array();
        uint64_t type = arr.get_typed_builtin();
        set_variant_type(des, Variant::Type::ARRAY);
        des->increment_position(encode_uint64(reinterpret_cast<uintptr_t>(VariantAllocator::alloc(Array(arr))), des->get_cursor()));
        des->increment_position(encode_uint64(type, des->get_cursor()));
    }

    static void write_dictionary(SharedBuffer* des, const Variant& src) {
        Dictionary dict = src.operator Dictionary();
        uint64_t key_type = dict.get_typed_key_builtin();
        uint64_t value_type = dict.get_typed_value_builtin();
        set_variant_type(des, Variant::Type::DICTIONARY);
        des->increment_position(encode_uint64(reinterpret_cast<uintptr_t>(VariantAllocator::alloc(Dictionary(dict))), des->get_cursor()));
        des->increment_position(encode_uint64(key_type, des->get_cursor()));
        des->increment_position(encode_uint64(value_type, des->get_cursor()));
    }

    static void append_object(SharedBuffer* des, Object* ptr) {
        if (ptr == nullptr) {
            des->increment_position(encode_uint32(0, des->get_cursor()));
            des->increment_position(encode_uint64(0, des->get_cursor()));
            des->increment_position(encode_uint64(0, des->get_cursor()));
            return;
        }

        // Create a binding if it doesn't exist yet.
        KotlinBinding* binding = KotlinBindingManager::get_instance_binding(ptr);
        int constructorID = binding->get_constructor_id();

        des->increment_position(encode_uint32(constructorID, des->get_cursor()));
        des->increment_position(encode_uint64(reinterpret_cast<uintptr_t>(ptr), des->get_cursor()));
        des->increment_position(encode_uint64(ptr->get_instance_id(), des->get_cursor()));
    }

    static void write_object(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::OBJECT);
        append_object(des, src);
    }


    static void write_signal(SharedBuffer* des, const Variant& src) {
        Signal signal {src.operator Signal()};
        set_variant_type(des, Variant::Type::SIGNAL);
        append_object(des, signal.get_object());
        write_pointer<StringName>(des, signal.get_name());
    }

public:

    static void write_variant(const Variant& variant, SharedBuffer* byte_buffer) {
        // must match the value order of godot_variant_type
        static void (*variant_writers[Variant::VARIANT_MAX])(SharedBuffer*, const Variant&) = {
            &VariantToBuffer::write_nil,

            // atomic types
            &VariantToBuffer::write_bool,
            &VariantToBuffer::write_core_type<Variant::INT, uint64_t>,
            &VariantToBuffer::write_core_type<Variant::FLOAT, double>,
            &VariantToBuffer::write_string,

            // math types
            &VariantToBuffer::write_core_type<Variant::VECTOR2, Vector2>,
            &VariantToBuffer::write_core_type<Variant::VECTOR2I, Vector2i>,
            &VariantToBuffer::write_core_type<Variant::RECT2, Rect2>,
            &VariantToBuffer::write_core_type<Variant::RECT2I, Rect2i>,
            &VariantToBuffer::write_core_type<Variant::VECTOR3, Vector3>,
            &VariantToBuffer::write_core_type<Variant::VECTOR3I, Vector3i>,
            &VariantToBuffer::write_core_type<Variant::TRANSFORM2D, Transform2D>,
            &VariantToBuffer::write_core_type<Variant::VECTOR4, Vector4>,
            &VariantToBuffer::write_core_type<Variant::VECTOR4I, Vector4i>,
            &VariantToBuffer::write_core_type<Variant::PLANE, Plane>,
            &VariantToBuffer::write_core_type<Variant::QUATERNION, Quaternion>,
            &VariantToBuffer::write_core_type<Variant::AABB, AABB>,
            &VariantToBuffer::write_core_type<Variant::BASIS, Basis>,
            &VariantToBuffer::write_core_type<Variant::TRANSFORM3D, Transform3D>,
            &VariantToBuffer::write_core_type<Variant::PROJECTION, Projection>,

            // misc types
            &VariantToBuffer::write_core_type<Variant::COLOR, Color>,
            &VariantToBuffer::write_native_core_type<Variant::STRING_NAME, StringName,&Variant::operator StringName>,
            &VariantToBuffer::write_native_core_type<Variant::NODE_PATH, NodePath,&Variant::operator NodePath>,
            &VariantToBuffer::write_core_type<Variant::RID, RID>,
            &VariantToBuffer::write_object,
            &VariantToBuffer::write_native_core_type<Variant::CALLABLE, Callable, &Variant::operator Callable>,
            &VariantToBuffer::write_signal,
            &VariantToBuffer::write_dictionary,
            &VariantToBuffer::write_array,

            // typed arrays
            &VariantToBuffer::write_native_core_type<Variant::PACKED_BYTE_ARRAY,PackedByteArray, &Variant::operator PackedByteArray>,
            &VariantToBuffer::write_native_core_type<Variant::PACKED_INT32_ARRAY,PackedInt32Array, &Variant::operator PackedInt32Array>,
            &VariantToBuffer::write_native_core_type<Variant::PACKED_INT64_ARRAY,PackedInt64Array, &Variant::operator PackedInt64Array>,
            &VariantToBuffer::write_native_core_type<Variant::PACKED_FLOAT32_ARRAY,PackedFloat32Array, &Variant::operator PackedFloat32Array>,
            &VariantToBuffer::write_native_core_type<Variant::PACKED_FLOAT64_ARRAY,PackedFloat64Array, &Variant::operator PackedFloat64Array>,
            &VariantToBuffer::write_native_core_type<Variant::PACKED_STRING_ARRAY,PackedStringArray, &Variant::operator PackedStringArray>,
            &VariantToBuffer::write_native_core_type<Variant::PACKED_VECTOR2_ARRAY,PackedVector2Array, &Variant::operator PackedVector2Array>,
            &VariantToBuffer::write_native_core_type<Variant::PACKED_VECTOR3_ARRAY,PackedVector3Array, &Variant::operator PackedVector3Array>,
            &VariantToBuffer::write_native_core_type<Variant::PACKED_COLOR_ARRAY,PackedColorArray, &Variant::operator PackedColorArray>,
            &VariantToBuffer::write_native_core_type<Variant::PACKED_VECTOR4_ARRAY,PackedVector4Array, &Variant::operator PackedVector4Array>
        };

        Variant::Type type = variant.get_type();
        variant_writers[type](byte_buffer, variant);
    }
};


class BufferToVariant {
    template<class T>
    static Variant read_core_type(SharedBuffer* byte_buffer) {
        auto result {reinterpret_cast<T*>(byte_buffer->get_cursor())};
        byte_buffer->increment_position(sizeof(T));
        return Variant(*result);
    }

    template<class T>
    static inline T* read_pointer(SharedBuffer* byte_buffer) {
        auto ptr {static_cast<uintptr_t>(decode_uint64(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(PTR_SIZE);
        return reinterpret_cast<T*>(ptr);
    }

    template<class T>
    static Variant read_native_core_type(SharedBuffer* byte_buffer) {
        return *read_pointer<T>(byte_buffer);
    }

    static Variant read_nil(SharedBuffer* byte_buffer) {
        return Variant();
    }

    static Variant read_bool(SharedBuffer* byte_buffer) {
        bool b {static_cast<bool>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(BOOL_SIZE);
        return Variant(b);
    }

    static Variant read_string(SharedBuffer* byte_buffer) {
        bool is_long {static_cast<bool>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(BOOL_SIZE);
        if (unlikely(is_long)) {
            String str = LongStringQueue::get_instance().poll_string();
            return Variant(str);
        } else {
            uint32_t size {decode_uint32(byte_buffer->get_cursor())};
            byte_buffer->increment_position(INT_SIZE);
            String str = String::utf8(reinterpret_cast<const char*>(byte_buffer->get_cursor()), size);
            byte_buffer->increment_position(size);
            return Variant(str);
        }
    }

    static inline Object* to_godot_object(SharedBuffer* byte_buffer) {
        auto ptr {static_cast<uintptr_t>(decode_uint64(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(PTR_SIZE);
        return reinterpret_cast<Object*>(ptr);
    }

    static Variant read_object(SharedBuffer* byte_buffer) {
        return Variant(to_godot_object(byte_buffer));
    }

    static Variant read_signal(SharedBuffer* byte_buffer) {
        const Object* object {to_godot_object(byte_buffer)};
        const StringName name {*read_pointer<StringName>(byte_buffer)};
        return Variant(Signal(object, name));
    }


public:

    static void read_variant(SharedBuffer* byte_buffer, Variant& res) {
        static Variant (*variant_readers[Variant::VARIANT_MAX])(SharedBuffer*) = {
          &BufferToVariant::read_nil,

          // atomic types
          &BufferToVariant::read_bool,
          &BufferToVariant::read_core_type<uint64_t>,
          &BufferToVariant::read_core_type<double>,
          &BufferToVariant::read_string,

          // math types
          &BufferToVariant::read_core_type<Vector2>,
          &BufferToVariant::read_core_type<Vector2i>,
          &BufferToVariant::read_core_type<Rect2>,
          &BufferToVariant::read_core_type<Rect2i>,
          &BufferToVariant::read_core_type<Vector3>,
          &BufferToVariant::read_core_type<Vector3i>,
          &BufferToVariant::read_core_type<Transform2D>,
          &BufferToVariant::read_core_type<Vector4>,
          &BufferToVariant::read_core_type<Vector4i>,
          &BufferToVariant::read_core_type<Plane>,
          &BufferToVariant::read_core_type<Quaternion>,
          &BufferToVariant::read_core_type<AABB>,
          &BufferToVariant::read_core_type<Basis>,
          &BufferToVariant::read_core_type<Transform3D>,
          &BufferToVariant::read_core_type<Projection>,

          // misc types
          &BufferToVariant::read_core_type<Color>,
          &BufferToVariant::read_native_core_type<StringName>,
          &BufferToVariant::read_native_core_type<NodePath>,
          &BufferToVariant::read_core_type<RID>,
          &BufferToVariant::read_object,
          &BufferToVariant::read_native_core_type<Callable>,
          &BufferToVariant::read_signal,
          &BufferToVariant::read_native_core_type<Dictionary>,
          &BufferToVariant::read_native_core_type<Array>,

          // typed arrays
          &BufferToVariant::read_native_core_type<PackedByteArray>,
          &BufferToVariant::read_native_core_type<PackedInt32Array>,
          &BufferToVariant::read_native_core_type<PackedInt64Array>,
          &BufferToVariant::read_native_core_type<PackedFloat32Array>,
          &BufferToVariant::read_native_core_type<PackedFloat64Array>,
          &BufferToVariant::read_native_core_type<PackedStringArray>,
          &BufferToVariant::read_native_core_type<PackedVector2Array>,
          &BufferToVariant::read_native_core_type<PackedVector3Array>,
          &BufferToVariant::read_native_core_type<PackedColorArray>,
          &BufferToVariant::read_native_core_type<PackedVector4Array>
        };

        uint32_t variant_type_int {decode_uint32(byte_buffer->get_cursor())};
        byte_buffer->increment_position(4);
        res = variant_readers[variant_type_int](byte_buffer);
    }
};

#endif// GODOT_JVM_KT_VARIANT_H
