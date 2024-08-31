#ifndef GODOT_JVM_KT_VARIANT_H
#define GODOT_JVM_KT_VARIANT_H

#include "binding/kotlin_binding_manager.h"
#include "jni/wrapper.h"
#include "jvm_wrapper/memory/long_string_queue.h"
#include "jvm_wrapper/memory/type_manager.h"
#include "logging.h"
#include "shared_buffer.h"

#include <core/io/marshalls.h>
#include <core/os/os.h>
#include <core/variant/variant.h>

namespace ktvariant {

    constexpr const int BOOL_SIZE = 4;

    constexpr const int PTR_SIZE = 8;

    constexpr const int INT_SIZE = 4;

    static void set_variant_type(SharedBuffer* des, Variant::Type variant_type) {
        des->increment_position(encode_uint32(variant_type, des->get_cursor()));
    }

    static void to_kvariant_fromNIL(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::NIL);
    }

    static void to_kvariant_fromSTRING(SharedBuffer* des, const Variant& src) {
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

    static void to_kvariant_fromBOOL(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::BOOL);
        des->increment_position(encode_uint32(src.operator bool(), des->get_cursor()));
    }

    template<Variant::Type variantType, class T>
    static void to_kvariant_fromCORETYPE(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, variantType);

        *reinterpret_cast<T*>(des->get_cursor()) = src;
        des->increment_position(sizeof(T));
    }

    template<class TNativeCoreType>
    inline static void append_nativecoretype(SharedBuffer* des, TNativeCoreType native_core_type) {
        des->increment_position(
          encode_uint64(reinterpret_cast<uintptr_t>(memnew(TNativeCoreType(native_core_type))), des->get_cursor())
        );
    }

    template<Variant::Type variantType, class TNativeCoreType, TNativeCoreType (Variant::*converter)() const>
    static void to_kvariant_fromNATIVECORETYPE(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, variantType);
        append_nativecoretype(des, (src.*converter)());
    }

    static void append_object(SharedBuffer* des, Object* ptr) {
        // TODO : Investigate on nullable management of Godot. Is Object the only nullable type ?
        if (!ptr) {
            to_kvariant_fromNIL(des, ptr);
            return;
        }

        // Create a binding if it doesn't exist yet.
        KotlinBinding* binding = KotlinBindingManager::get_instance_binding(ptr);
        int constructorID = binding->get_constructor_id();

        set_variant_type(des, Variant::Type::OBJECT);
        des->increment_position(encode_uint32(constructorID, des->get_cursor()));
        des->increment_position(encode_uint64(reinterpret_cast<uintptr_t>(ptr), des->get_cursor()));
        des->increment_position(encode_uint64(ptr->get_instance_id(), des->get_cursor()));
    }

    static void to_kvariant_fromSIGNAL(SharedBuffer* des, const Variant& src) {
        Signal signal {src.operator Signal()};
        set_variant_type(des, Variant::Type::SIGNAL);
        append_object(des, signal.get_object());
        append_nativecoretype<StringName>(des, signal.get_name());
    }

    static void to_kvariant_fromOBJECT(SharedBuffer* des, const Variant& src) {
        append_object(des, src);
    }

    static void init_to_kt_methods(void (*to_kt_array[Variant::Type::VARIANT_MAX])(SharedBuffer*, const Variant&)) {
        to_kt_array[Variant::NIL] = to_kvariant_fromNIL;
        to_kt_array[Variant::BOOL] = to_kvariant_fromBOOL;
        to_kt_array[Variant::INT] = to_kvariant_fromCORETYPE<Variant::INT, uint64_t>;
        to_kt_array[Variant::FLOAT] = to_kvariant_fromCORETYPE<Variant::FLOAT, double>;
        to_kt_array[Variant::STRING] = to_kvariant_fromSTRING;
        to_kt_array[Variant::VECTOR2] = to_kvariant_fromCORETYPE<Variant::VECTOR2, Vector2>;
        to_kt_array[Variant::VECTOR2I] = to_kvariant_fromCORETYPE<Variant::VECTOR2I, Vector2i>;
        to_kt_array[Variant::RECT2] = to_kvariant_fromCORETYPE<Variant::RECT2, Rect2>;
        to_kt_array[Variant::RECT2I] = to_kvariant_fromCORETYPE<Variant::RECT2I, Rect2i>;
        to_kt_array[Variant::VECTOR3] = to_kvariant_fromCORETYPE<Variant::VECTOR3, Vector3>;
        to_kt_array[Variant::VECTOR3I] = to_kvariant_fromCORETYPE<Variant::VECTOR3I, Vector3i>;
        to_kt_array[Variant::TRANSFORM2D] = to_kvariant_fromCORETYPE<Variant::TRANSFORM2D, Transform2D>;
        to_kt_array[Variant::VECTOR4] = to_kvariant_fromCORETYPE<Variant::VECTOR4, Vector4>;
        to_kt_array[Variant::VECTOR4I] = to_kvariant_fromCORETYPE<Variant::VECTOR4I, Vector4i>;
        to_kt_array[Variant::PLANE] = to_kvariant_fromCORETYPE<Variant::PLANE, Plane>;
        to_kt_array[Variant::QUATERNION] = to_kvariant_fromCORETYPE<Variant::QUATERNION, Quaternion>;
        to_kt_array[Variant::AABB] = to_kvariant_fromCORETYPE<Variant::AABB, AABB>;
        to_kt_array[Variant::BASIS] = to_kvariant_fromCORETYPE<Variant::BASIS, Basis>;
        to_kt_array[Variant::TRANSFORM3D] = to_kvariant_fromCORETYPE<Variant::TRANSFORM3D, Transform3D>;
        to_kt_array[Variant::PROJECTION] = to_kvariant_fromCORETYPE<Variant::PROJECTION, Projection>;
        to_kt_array[Variant::COLOR] = to_kvariant_fromCORETYPE<Variant::COLOR, Color>;
        to_kt_array[Variant::CALLABLE] = to_kvariant_fromNATIVECORETYPE < Variant::CALLABLE, Callable, &Variant::operator Callable>;
        to_kt_array[Variant::SIGNAL] = to_kvariant_fromSIGNAL;
        to_kt_array[Variant::DICTIONARY] = to_kvariant_fromNATIVECORETYPE < Variant::DICTIONARY, Dictionary,
        &Variant::operator Dictionary>;
        to_kt_array[Variant::ARRAY] = to_kvariant_fromNATIVECORETYPE < Variant::ARRAY, Array, &Variant::operator Array>;
        to_kt_array[Variant::STRING_NAME] = to_kvariant_fromNATIVECORETYPE < Variant::STRING_NAME, StringName,
        &Variant::operator StringName>;
        to_kt_array[Variant::NODE_PATH] = to_kvariant_fromNATIVECORETYPE < Variant::NODE_PATH, NodePath,
        &Variant::operator NodePath>;
        to_kt_array[Variant::RID] = to_kvariant_fromNATIVECORETYPE < Variant::RID, RID, &Variant::operator ::RID>;
        to_kt_array[Variant::PACKED_BYTE_ARRAY] = to_kvariant_fromNATIVECORETYPE < Variant::PACKED_BYTE_ARRAY,
        PackedByteArray, &Variant::operator PackedByteArray>;
        to_kt_array[Variant::PACKED_INT32_ARRAY] = to_kvariant_fromNATIVECORETYPE < Variant::PACKED_INT32_ARRAY,
        PackedInt32Array, &Variant::operator PackedInt32Array>;
        to_kt_array[Variant::PACKED_INT64_ARRAY] = to_kvariant_fromNATIVECORETYPE < Variant::PACKED_INT64_ARRAY,
        PackedInt64Array, &Variant::operator PackedInt64Array>;
        to_kt_array[Variant::PACKED_FLOAT32_ARRAY] = to_kvariant_fromNATIVECORETYPE < Variant::PACKED_FLOAT32_ARRAY,
        PackedFloat32Array, &Variant::operator PackedFloat32Array>;
        to_kt_array[Variant::PACKED_FLOAT64_ARRAY] = to_kvariant_fromNATIVECORETYPE < Variant::PACKED_FLOAT64_ARRAY,
        PackedFloat64Array, &Variant::operator PackedFloat64Array>;
        to_kt_array[Variant::PACKED_STRING_ARRAY] = to_kvariant_fromNATIVECORETYPE < Variant::PACKED_STRING_ARRAY,
        PackedStringArray, &Variant::operator PackedStringArray>;
        to_kt_array[Variant::PACKED_VECTOR2_ARRAY] = to_kvariant_fromNATIVECORETYPE < Variant::PACKED_VECTOR2_ARRAY,
        PackedVector2Array, &Variant::operator PackedVector2Array>;
        to_kt_array[Variant::PACKED_VECTOR3_ARRAY] = to_kvariant_fromNATIVECORETYPE < Variant::PACKED_VECTOR3_ARRAY,
        PackedVector3Array, &Variant::operator PackedVector3Array>;
        to_kt_array[Variant::PACKED_COLOR_ARRAY] = to_kvariant_fromNATIVECORETYPE < Variant::PACKED_COLOR_ARRAY,
        PackedColorArray, &Variant::operator PackedColorArray>;
        to_kt_array[Variant::OBJECT] = to_kvariant_fromOBJECT;
    }

    static void send_variant_to_buffer(const Variant& variant, SharedBuffer* byte_buffer) {
        // must match the value order of godot_variant_type
        static void (*TO_KT_VARIANT_FROM[Variant::Type::VARIANT_MAX])(SharedBuffer*, const Variant&);
        if (unlikely(!TO_KT_VARIANT_FROM[0])) { init_to_kt_methods(TO_KT_VARIANT_FROM); }
        Variant::Type type = variant.get_type();
        TO_KT_VARIANT_FROM[type](byte_buffer, variant);
    }

    static Variant from_kvariant_tokNilValue(SharedBuffer* byte_buffer) {
        return Variant();
    }

    static Variant from_kvariant_tokStringValue(SharedBuffer* byte_buffer) {
        bool is_long {static_cast<bool>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(BOOL_SIZE);
        if (unlikely(is_long)) {
            String str = LongStringQueue::get_instance().poll_string();
            return Variant(str);
        } else {
            uint32_t size {decode_uint32(byte_buffer->get_cursor())};
            byte_buffer->increment_position(INT_SIZE);
            String str;
            str.parse_utf8(reinterpret_cast<const char*>(byte_buffer->get_cursor()), size);
            byte_buffer->increment_position(size);
            return Variant(str);
        }
    }

    static Variant from_kvariant_tokBoolValue(SharedBuffer* byte_buffer) {
        bool b {static_cast<bool>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(BOOL_SIZE);
        return Variant(b);
    }

    template<class T>
    static Variant from_kvariant_to_kVariantCoreTypeValue(SharedBuffer* byte_buffer) {
        auto result { reinterpret_cast<T*>(byte_buffer->get_cursor()) };
        byte_buffer->increment_position(sizeof(T));
        return *result;
    }

    static inline Object* to_godot_object(SharedBuffer* byte_buffer) {
        auto ptr {static_cast<uintptr_t>(decode_uint64(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(PTR_SIZE);
        return reinterpret_cast<Object*>(ptr);
    }

    template<class T>
    static inline T* to_native_core_type(SharedBuffer* byte_buffer) {
        auto ptr {static_cast<uintptr_t>(decode_uint64(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(PTR_SIZE);
        return reinterpret_cast<T*>(ptr);
    }

    static Variant from_kvariant_toKSignalValue(SharedBuffer* byte_buffer) {
        const Object* object {to_godot_object(byte_buffer)};
        const StringName name {*to_native_core_type<StringName>(byte_buffer)};
        return Variant(Signal(object, name));
    }

    template<class T>
    static Variant from_kvariant_tokVariantNativeCoreTypeValue(SharedBuffer* byte_buffer) {
        return Variant(*to_native_core_type<T>(byte_buffer));
    }

    static Variant from_kvariant_tKCallableValue(SharedBuffer* byte_buffer) {
        bool is_custom {static_cast<bool>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(BOOL_SIZE);

        if (is_custom) {
            return Callable(to_native_core_type<CallableCustom>(byte_buffer));
        }

        return from_kvariant_tokVariantNativeCoreTypeValue<Callable>(byte_buffer);
    }

    static Variant from_kvariant_toKObjectValue(SharedBuffer* byte_buffer) {
        return Variant(to_godot_object(byte_buffer));
    }

    static void init_to_gd_methods(Variant (*to_gd_array[Variant::Type::VARIANT_MAX])(SharedBuffer* byte_buffer)) {
        to_gd_array[Variant::NIL] = from_kvariant_tokNilValue;
        to_gd_array[Variant::BOOL] = from_kvariant_tokBoolValue;
        to_gd_array[Variant::INT] = from_kvariant_to_kVariantCoreTypeValue<uint64_t>;
        to_gd_array[Variant::FLOAT] = from_kvariant_to_kVariantCoreTypeValue<double>;
        to_gd_array[Variant::STRING] = from_kvariant_tokStringValue;
        to_gd_array[Variant::VECTOR2] = from_kvariant_to_kVariantCoreTypeValue<Vector2>;
        to_gd_array[Variant::VECTOR2I] = from_kvariant_to_kVariantCoreTypeValue<Vector2i>;
        to_gd_array[Variant::RECT2] = from_kvariant_to_kVariantCoreTypeValue<Rect2>;
        to_gd_array[Variant::RECT2I] = from_kvariant_to_kVariantCoreTypeValue<Rect2i>;
        to_gd_array[Variant::VECTOR3] = from_kvariant_to_kVariantCoreTypeValue<Vector3>;
        to_gd_array[Variant::VECTOR3I] = from_kvariant_to_kVariantCoreTypeValue<Vector3i>;
        to_gd_array[Variant::TRANSFORM2D] = from_kvariant_to_kVariantCoreTypeValue<Transform2D>;
        to_gd_array[Variant::VECTOR4] = from_kvariant_to_kVariantCoreTypeValue<Vector4>;
        to_gd_array[Variant::VECTOR4I] = from_kvariant_to_kVariantCoreTypeValue<Vector4i>;
        to_gd_array[Variant::PLANE] = from_kvariant_to_kVariantCoreTypeValue<Plane>;
        to_gd_array[Variant::QUATERNION] = from_kvariant_to_kVariantCoreTypeValue<Quaternion>;
        to_gd_array[Variant::AABB] = from_kvariant_to_kVariantCoreTypeValue<AABB>;
        to_gd_array[Variant::BASIS] = from_kvariant_to_kVariantCoreTypeValue<Basis>;
        to_gd_array[Variant::TRANSFORM3D] = from_kvariant_to_kVariantCoreTypeValue<Transform3D>;
        to_gd_array[Variant::PROJECTION] = from_kvariant_to_kVariantCoreTypeValue<Projection>;
        to_gd_array[Variant::COLOR] = from_kvariant_to_kVariantCoreTypeValue<Color>;
        to_gd_array[Variant::CALLABLE] = from_kvariant_tKCallableValue;
        to_gd_array[Variant::SIGNAL] = from_kvariant_toKSignalValue;
        to_gd_array[Variant::DICTIONARY] = from_kvariant_tokVariantNativeCoreTypeValue<Dictionary>;
        to_gd_array[Variant::ARRAY] = from_kvariant_tokVariantNativeCoreTypeValue<Array>;
        to_gd_array[Variant::STRING_NAME] = from_kvariant_tokVariantNativeCoreTypeValue<StringName>;
        to_gd_array[Variant::NODE_PATH] = from_kvariant_tokVariantNativeCoreTypeValue<NodePath>;
        to_gd_array[Variant::RID] = from_kvariant_tokVariantNativeCoreTypeValue<RID>;
        to_gd_array[Variant::PACKED_BYTE_ARRAY] = from_kvariant_tokVariantNativeCoreTypeValue<PackedByteArray>;
        to_gd_array[Variant::PACKED_INT32_ARRAY] = from_kvariant_tokVariantNativeCoreTypeValue<PackedInt32Array>;
        to_gd_array[Variant::PACKED_INT64_ARRAY] = from_kvariant_tokVariantNativeCoreTypeValue<PackedInt64Array>;
        to_gd_array[Variant::PACKED_FLOAT32_ARRAY] = from_kvariant_tokVariantNativeCoreTypeValue<PackedFloat32Array>;
        to_gd_array[Variant::PACKED_FLOAT64_ARRAY] = from_kvariant_tokVariantNativeCoreTypeValue<PackedFloat64Array>;
        to_gd_array[Variant::PACKED_STRING_ARRAY] = from_kvariant_tokVariantNativeCoreTypeValue<PackedStringArray>;
        to_gd_array[Variant::PACKED_VECTOR2_ARRAY] = from_kvariant_tokVariantNativeCoreTypeValue<PackedVector2Array>;
        to_gd_array[Variant::PACKED_VECTOR3_ARRAY] = from_kvariant_tokVariantNativeCoreTypeValue<PackedVector3Array>;
        to_gd_array[Variant::PACKED_COLOR_ARRAY] = from_kvariant_tokVariantNativeCoreTypeValue<PackedColorArray>;
        to_gd_array[Variant::OBJECT] = from_kvariant_toKObjectValue;
    }

    static void get_variant_from_buffer(SharedBuffer* byte_buffer, Variant& res) {
        static Variant (*TO_GODOT_VARIANT_FROM[Variant::Type::VARIANT_MAX])(SharedBuffer* byte_buffer);
        if (unlikely(!TO_GODOT_VARIANT_FROM[0])) { init_to_gd_methods(TO_GODOT_VARIANT_FROM); }
        uint32_t variant_type_int {decode_uint32(byte_buffer->get_cursor())};
        byte_buffer->increment_position(4);
        res = TO_GODOT_VARIANT_FROM[static_cast<Variant::Type>(variant_type_int)](byte_buffer);
    }

}// namespace ktvariant

#endif// GODOT_JVM_KT_VARIANT_H
