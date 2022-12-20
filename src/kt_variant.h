#ifndef GODOT_JVM_KT_VARIANT_H
#define GODOT_JVM_KT_VARIANT_H

#include <core/variant/variant.h>
#include "jni/wrapper.h"
#include "kt_custom_callable.h"
#include "logging.h"
#include "long_string_queue.h"
#include "memory/kotlin_binding_manager.h"
#include "memory/shared_buffer.h"
#include "type_manager.h"
#include <core/io/marshalls.h>
#include <core/os/os.h>

//TODO/4.0 implement new types
namespace ktvariant {

    const int LONG_SIZE = 8;
    const int FLOAT64_SIZE = 8;
    const int BOOL_SIZE = 4;

    const int PTR_SIZE = 8;

    const int INT_SIZE = 4;
    const int FLOAT32_SIZE = 4;


    static void set_variant_type(SharedBuffer* des, Variant::Type variant_type) {
        des->increment_position(encode_uint32(variant_type, des->get_cursor()));
    }

    static void to_kvariant_fromNIL(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::NIL);
    }

    static void to_kvariant_fromINT(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::INT);
        des->increment_position(encode_uint64(static_cast<int64_t>(src), des->get_cursor()));
    }

    static void to_kvariant_fromFLOAT(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::FLOAT);
        des->increment_position(encode_double(src.operator double_t(), des->get_cursor()));
    }

    static void to_kvariant_fromSTRING(SharedBuffer* des, const Variant& src) {
        String str{src};
        const CharString& char_string{str.utf8()};
        set_variant_type(des, Variant::Type::STRING);
        int size = char_string.size();
        if (unlikely(size > LongStringQueue::max_string_size)) {
            des->increment_position(encode_uint32(true, des->get_cursor()));
            LongStringQueue::get_instance().send_string_to_jvm(str);
        } else {
            des->increment_position(encode_uint32(false, des->get_cursor()));
            des->increment_position(encode_uint32(char_string.size(), des->get_cursor()));
            if (likely(size > 0)) {
                des->increment_position(encode_cstring(char_string, des->get_cursor()));
            }
        }
    }

    static void to_kvariant_fromBOOL(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::BOOL);
        des->increment_position(encode_uint32(src.operator bool(), des->get_cursor()));
    }

    static inline void append_vector2(SharedBuffer* des, const Vector2& from) {
        des->increment_position(encode_float(from.x, des->get_cursor()));
        des->increment_position(encode_float(from.y, des->get_cursor()));
    }

    static void to_kvariant_fromVECTOR2(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::VECTOR2);
        append_vector2(des, src);
    }

    static inline void append_vector2i(SharedBuffer* des, const Vector2i& from) {
        des->increment_position(encode_uint32(from.x, des->get_cursor()));
        des->increment_position(encode_uint32(from.y, des->get_cursor()));
    }

    static void to_kvariant_fromVECTOR2I(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::VECTOR2I);
        append_vector2i(des, src);
    }

    static void to_kvariant_fromRECT2(SharedBuffer* des, const Variant& src) {
        Rect2 src_rect2{src};
        set_variant_type(des, Variant::Type::RECT2);
        append_vector2(des, src_rect2.position);
        append_vector2(des, src_rect2.size);
    }

    static void to_kvariant_fromRECT2I(SharedBuffer* des, const Variant& src) {
        Rect2i rect2i{src};
        set_variant_type(des, Variant::Type::RECT2I);
        append_vector2i(des, rect2i.position);
        append_vector2i(des, rect2i.size);
    }

    static inline void append_vector3(SharedBuffer* des, const Vector3& from) {
        des->increment_position(encode_float(from.x, des->get_cursor()));
        des->increment_position(encode_float(from.y, des->get_cursor()));
        des->increment_position(encode_float(from.z, des->get_cursor()));
    }

    static void to_kvariant_fromVECTOR3(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::VECTOR3);
        append_vector3(des, src);
    }

    static inline void append_vector3i(SharedBuffer* des, const Vector3i& from) {
        des->increment_position(encode_uint32(from.x, des->get_cursor()));
        des->increment_position(encode_uint32(from.y, des->get_cursor()));
        des->increment_position(encode_uint32(from.z, des->get_cursor()));
    }

    static void to_kvariant_fromVECTOR3I(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::VECTOR3I);
        append_vector3i(des, src);
    }

    static void to_kvariant_fromTRANSFORM2D(SharedBuffer* des, const Variant& src) {
        Transform2D src_transform_2d{src};
        set_variant_type(des, Variant::Type::TRANSFORM2D);
        append_vector2(des, src_transform_2d[0]);
        append_vector2(des, src_transform_2d[1]);
        append_vector2(des, src_transform_2d.get_origin());
    }

    static inline void append_vector4(SharedBuffer* des, const Vector4& from) {
        des->increment_position(encode_float(from.x, des->get_cursor()));
        des->increment_position(encode_float(from.y, des->get_cursor()));
        des->increment_position(encode_float(from.z, des->get_cursor()));
        des->increment_position(encode_float(from.w, des->get_cursor()));
    }

    static void to_kvariant_fromVECTOR4(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::VECTOR4);
        append_vector4(des, src);
    }

    static inline void append_vector4i(SharedBuffer* des, const Vector4i& from) {
        des->increment_position(encode_uint32(from.x, des->get_cursor()));
        des->increment_position(encode_uint32(from.y, des->get_cursor()));
        des->increment_position(encode_uint32(from.z, des->get_cursor()));
        des->increment_position(encode_uint32(from.w, des->get_cursor()));
    }

    static void to_kvariant_fromVECTOR4I(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::VECTOR4I);
        append_vector4i(des, src);
    }

    static void to_kvariant_fromPLANE(SharedBuffer* des, const Variant& src) {
        Plane src_plane{src.operator Plane()};
        set_variant_type(des, Variant::Type::PLANE);
        append_vector3(des, src_plane.normal);
        des->increment_position(encode_float(src_plane.d, des->get_cursor()));
    }

    static void to_kvariant_fromQUATERNION(SharedBuffer* des, const Variant& src) {
        Quaternion src_quat{src.operator Quaternion()};
        set_variant_type(des, Variant::Type::QUATERNION);
        des->increment_position(encode_float(src_quat.x, des->get_cursor()));
        des->increment_position(encode_float(src_quat.y, des->get_cursor()));
        des->increment_position(encode_float(src_quat.z, des->get_cursor()));
        des->increment_position(encode_float(src_quat.w, des->get_cursor()));
    }

    static void to_kvariant_fromAABB(SharedBuffer* des, const Variant& src) {
        AABB src_aabb{src};
        set_variant_type(des, Variant::Type::AABB);
        append_vector3(des, src_aabb.position);
        append_vector3(des, src_aabb.size);
    }

    static inline void append_basis(SharedBuffer* des, const Basis& data) {
        append_vector3(des, data.rows[0]);
        append_vector3(des, data.rows[1]);
        append_vector3(des, data.rows[2]);
    }

    static void to_kvariant_fromBASIS(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::BASIS);
        append_basis(des, src);
    }

    static void to_kvariant_fromTRANSFORM3D(SharedBuffer* des, const Variant& src) {
        Transform3D src_transform{src.operator Transform3D()};
        set_variant_type(des, Variant::Type::TRANSFORM3D);
        append_basis(des, src_transform.basis);
        append_vector3(des, src_transform.origin);
    }

    static void to_kvariant_fromCOLOR(SharedBuffer* des, const Variant& src) {
        Color src_color{src.operator Color()};
        set_variant_type(des, Variant::Type::COLOR);
        des->increment_position(encode_float(src_color.r, des->get_cursor()));
        des->increment_position(encode_float(src_color.g, des->get_cursor()));
        des->increment_position(encode_float(src_color.b, des->get_cursor()));
        des->increment_position(encode_float(src_color.a, des->get_cursor()));
    }

    template<class TNativeCoreType>
    inline static void append_nativecoretype(SharedBuffer* des, TNativeCoreType native_core_type) {
        des->increment_position(
                encode_uint64(reinterpret_cast<uintptr_t>(memnew(TNativeCoreType(native_core_type))),
                              des->get_cursor())
        );
    }

    template<Variant::Type variantType, class TNativeCoreType, TNativeCoreType (Variant::* converter)() const>
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

		//Create a binding if it doesn't exist yet.
		KotlinBinding* binding = KotlinBindingManager::get_instance_binding(ptr);

		//We only need to retrieve the constructor if the binding is not ready yet.
		int constructorID = 0;
		if(!binding->is_ready()){
			StringName class_name{ptr->get_class_name()};
            do {
                if (!TypeManager::get_instance().JAVA_ENGINE_TYPES_CONSTRUCTORS.has(class_name)) {
                    class_name = ClassDB::get_parent_class(class_name);
                } else {
                    break;
                }
            } while(class_name != StringName());
            constructorID = TypeManager::get_instance().JAVA_ENGINE_TYPES_CONSTRUCTORS[class_name];
		}

		uint64_t id = ptr->get_instance_id();

        set_variant_type(des, Variant::Type::OBJECT);

        des->increment_position(encode_uint64(
                reinterpret_cast<uintptr_t>(ptr),
                des->get_cursor()));
        des->increment_position(encode_uint32(
                constructorID,
                des->get_cursor()));
        des->increment_position(encode_uint64(
                id,
                des->get_cursor()));
    }

    static void to_kvariant_fromOBJECT(SharedBuffer* des, const Variant& src) {
        append_object(des, src);
    }

    static void to_kvariant_from_CALLABLE(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::CALLABLE);
        Callable src_callable{src.operator Callable()};

        bool is_callable_custom{src_callable.is_custom()};
        des->increment_position(encode_uint32(is_callable_custom, des->get_cursor()));
        append_nativecoretype(des, src_callable);
        if (!is_callable_custom) {
            append_object(des, src_callable.get_object());
            append_nativecoretype(des, src_callable.get_method());
        }
    }

    static void init_to_kt_methods(void (* to_kt_array[Variant::Type::VARIANT_MAX])(SharedBuffer*, const Variant&)) {
        to_kt_array[Variant::NIL] = to_kvariant_fromNIL;
        to_kt_array[Variant::BOOL] = to_kvariant_fromBOOL;
        to_kt_array[Variant::INT] = to_kvariant_fromINT;
        to_kt_array[Variant::FLOAT] = to_kvariant_fromFLOAT;
        to_kt_array[Variant::STRING] = to_kvariant_fromSTRING;
        to_kt_array[Variant::VECTOR2] = to_kvariant_fromVECTOR2;
        to_kt_array[Variant::VECTOR2I] = to_kvariant_fromVECTOR2I;
        to_kt_array[Variant::RECT2] = to_kvariant_fromRECT2;
        to_kt_array[Variant::RECT2I] = to_kvariant_fromRECT2I;
        to_kt_array[Variant::VECTOR3] = to_kvariant_fromVECTOR3;
        to_kt_array[Variant::VECTOR3I] = to_kvariant_fromVECTOR3I;
        to_kt_array[Variant::TRANSFORM2D] = to_kvariant_fromTRANSFORM2D;
        to_kt_array[Variant::VECTOR4] = to_kvariant_fromVECTOR4;
        to_kt_array[Variant::VECTOR4I] = to_kvariant_fromVECTOR4I;
        to_kt_array[Variant::PLANE] = to_kvariant_fromPLANE;
        to_kt_array[Variant::QUATERNION] = to_kvariant_fromQUATERNION;
        to_kt_array[Variant::AABB] = to_kvariant_fromAABB;
        to_kt_array[Variant::BASIS] = to_kvariant_fromBASIS;
        to_kt_array[Variant::TRANSFORM3D] = to_kvariant_fromTRANSFORM3D;
        to_kt_array[Variant::COLOR] = to_kvariant_fromCOLOR;
        to_kt_array[Variant::STRING_NAME] = to_kvariant_from_CALLABLE;
        to_kt_array[Variant::DICTIONARY] = to_kvariant_fromNATIVECORETYPE<Variant::DICTIONARY, Dictionary, &Variant::operator Dictionary>;
        to_kt_array[Variant::ARRAY] = to_kvariant_fromNATIVECORETYPE<Variant::ARRAY, Array, &Variant::operator Array>;
        to_kt_array[Variant::STRING_NAME] = to_kvariant_fromNATIVECORETYPE<Variant::STRING_NAME, StringName, &Variant::operator StringName>;
        to_kt_array[Variant::NODE_PATH] = to_kvariant_fromNATIVECORETYPE<Variant::NODE_PATH, NodePath, &Variant::operator NodePath>;
        to_kt_array[Variant::RID] = to_kvariant_fromNATIVECORETYPE<Variant::RID, RID, &Variant::operator ::RID>;
        to_kt_array[Variant::PACKED_BYTE_ARRAY] = to_kvariant_fromNATIVECORETYPE<Variant::PACKED_BYTE_ARRAY, PackedByteArray, &Variant::operator PackedByteArray>;
        to_kt_array[Variant::PACKED_INT32_ARRAY] = to_kvariant_fromNATIVECORETYPE<Variant::PACKED_INT32_ARRAY, PackedInt32Array, &Variant::operator PackedInt32Array>;
        to_kt_array[Variant::PACKED_INT64_ARRAY] = to_kvariant_fromNATIVECORETYPE<Variant::PACKED_INT64_ARRAY, PackedInt64Array, &Variant::operator PackedInt64Array>;
        to_kt_array[Variant::PACKED_FLOAT32_ARRAY] = to_kvariant_fromNATIVECORETYPE<Variant::PACKED_FLOAT32_ARRAY, PackedFloat32Array, &Variant::operator PackedFloat32Array>;
        to_kt_array[Variant::PACKED_FLOAT64_ARRAY] = to_kvariant_fromNATIVECORETYPE<Variant::PACKED_FLOAT64_ARRAY, PackedFloat64Array, &Variant::operator PackedFloat64Array>;
        to_kt_array[Variant::PACKED_STRING_ARRAY] = to_kvariant_fromNATIVECORETYPE<Variant::PACKED_STRING_ARRAY, PackedStringArray, &Variant::operator PackedStringArray>;
        to_kt_array[Variant::PACKED_VECTOR2_ARRAY] = to_kvariant_fromNATIVECORETYPE<Variant::PACKED_VECTOR2_ARRAY, PackedVector2Array, &Variant::operator PackedVector2Array>;
        to_kt_array[Variant::PACKED_VECTOR3_ARRAY] = to_kvariant_fromNATIVECORETYPE<Variant::PACKED_VECTOR3_ARRAY, PackedVector3Array, &Variant::operator PackedVector3Array>;
        to_kt_array[Variant::PACKED_COLOR_ARRAY] = to_kvariant_fromNATIVECORETYPE<Variant::PACKED_COLOR_ARRAY, PackedColorArray, &Variant::operator PackedColorArray>;
        to_kt_array[Variant::OBJECT] = to_kvariant_fromOBJECT;
    }

    static void send_variant_to_buffer(const Variant& variant, SharedBuffer* byte_buffer) {
        // must match the value order of godot_variant_type
        static void (* TO_KT_VARIANT_FROM[Variant::Type::VARIANT_MAX])(SharedBuffer*, const Variant&);
        if (unlikely(!TO_KT_VARIANT_FROM[0])) {
            init_to_kt_methods(TO_KT_VARIANT_FROM);
        }
        Variant::Type type = variant.get_type();
        TO_KT_VARIANT_FROM[type](byte_buffer, variant);
    }

    static Variant from_kvariant_tokNilValue(SharedBuffer* byte_buffer) {
        return Variant();
    }

    static Variant from_kvariant_tokLongValue(SharedBuffer* byte_buffer) {
        uint64_t ulong{decode_uint64(byte_buffer->get_cursor())};
        byte_buffer->increment_position(LONG_SIZE);
        return Variant(ulong);
    }

    static Variant from_kvariant_tokFloat64Value(SharedBuffer* byte_buffer) {
        double real{decode_double(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT64_SIZE);
        return Variant(real);
    }

    static Variant from_kvariant_tokStringValue(SharedBuffer* byte_buffer) {
        bool is_long{static_cast<bool>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(BOOL_SIZE);
        if (unlikely(is_long)) {
            String str = LongStringQueue::get_instance().poll_string();
            return Variant(str);
        } else {
            uint32_t size{decode_uint32(byte_buffer->get_cursor())};
            byte_buffer->increment_position(INT_SIZE);
            String str;
            str.parse_utf8(reinterpret_cast<const char*>(byte_buffer->get_cursor()), size);
            byte_buffer->increment_position(size);
            return Variant(str);
        }
    }

    static Variant from_kvariant_tokBoolValue(SharedBuffer* byte_buffer) {
        bool b{static_cast<bool>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(BOOL_SIZE);
        return Variant(b);
    }

    static inline Vector2 to_godot_vector2(SharedBuffer* byte_buffer) {
        float x{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT32_SIZE);
        float y{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT32_SIZE);
        return {x, y};
    }

    static Variant from_kvariant_tokVector2Value(SharedBuffer* byte_buffer) {
        return Variant(to_godot_vector2(byte_buffer));
    }

    static inline Vector2i to_godot_vector2i(SharedBuffer* byte_buffer) {
        auto x{static_cast<int32_t>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(INT_SIZE);
        auto y{static_cast<int32_t>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(INT_SIZE);
        return {x, y};
    }

    static Variant from_kvariant_tokVector2iValue(SharedBuffer* byte_buffer) {
        return Variant(to_godot_vector2i(byte_buffer));
    }

    static Variant from_kvariant_tokRect2Value(SharedBuffer* byte_buffer) {
        const Vector2 pos{to_godot_vector2(byte_buffer)};
        const Vector2 size{to_godot_vector2(byte_buffer)};
        return Variant(
                Rect2(pos, size)
        );
    }

    static Variant from_kvariant_tokRect2iValue(SharedBuffer* byte_buffer) {
        const Vector2i pos{to_godot_vector2i(byte_buffer)};
        const Vector2i size{to_godot_vector2i(byte_buffer)};
        return Variant(
                Rect2i(pos, size)
        );
    }

    static inline Vector3 to_godot_vector3(SharedBuffer* byte_buffer) {
        float x{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(4);
        float y{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(4);
        float z{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(4);
        return {x, y, z};
    }

    static Variant from_kvariant_tokVector3Value(SharedBuffer* byte_buffer) {
        return Variant(to_godot_vector3(byte_buffer));
    }

    static inline Vector3i to_godot_vector3i(SharedBuffer* byte_buffer) {
        auto x{static_cast<int32_t>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(INT_SIZE);
        auto y{static_cast<int32_t>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(INT_SIZE);
        auto z{static_cast<int32_t>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(INT_SIZE);
        return {x, y, z};
    }

    static Variant from_kvariant_tokVector3iValue(SharedBuffer* byte_buffer) {
        return Variant(to_godot_vector3i(byte_buffer));
    }

    static Variant from_kvariant_tokTransform2DValue(SharedBuffer* byte_buffer) {
        Transform2D transform2d;
        transform2d[0] = to_godot_vector2(byte_buffer);
        transform2d[1] = to_godot_vector2(byte_buffer);
        transform2d.set_origin(to_godot_vector2(byte_buffer));
        return Variant(transform2d);
    }

    static inline Vector4 to_godot_vector4(SharedBuffer* byte_buffer) {
        float x{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(4);
        float y{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(4);
        float z{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(4);
        float w{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(4);
        return {x, y, z, w};
    }

    static Variant from_kvariant_tokVector4Value(SharedBuffer* byte_buffer) {
        return Variant(to_godot_vector4(byte_buffer));
    }

    static inline Vector4i to_godot_vector4i(SharedBuffer* byte_buffer) {
        auto x{static_cast<int32_t>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(INT_SIZE);
        auto y{static_cast<int32_t>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(INT_SIZE);
        auto z{static_cast<int32_t>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(INT_SIZE);
        auto w{static_cast<int32_t>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(INT_SIZE);
        return {x, y, z, w};
    }

    static Variant from_kvariant_tokVector4iValue(SharedBuffer* byte_buffer) {
        return Variant(to_godot_vector4i(byte_buffer));
    }

    static Variant from_kvariant_tokPlaneValue(SharedBuffer* byte_buffer) {
        Vector3 norm{to_godot_vector3(byte_buffer)};
        float d{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT32_SIZE);
        return Variant(
                Plane(norm, d)
        );
    }

    static Variant from_kvariant_tokQuaternionValue(SharedBuffer* byte_buffer) {
        float x{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT32_SIZE);
        float y{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT32_SIZE);
        float z{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT32_SIZE);
        float w{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT32_SIZE);
        return Variant(
                Quaternion(x, y, z, w)
        );
    }

    static Variant from_kvariant_tokAabbValue(SharedBuffer* byte_buffer) {
        const Vector3& pos{to_godot_vector3(byte_buffer)};
        const Vector3& size{to_godot_vector3(byte_buffer)};
        return Variant(
                AABB(pos, size)
        );
    }

    static inline Basis to_godot_basis(SharedBuffer* byte_buffer) {
        const Vector3& row0 = to_godot_vector3(byte_buffer);
        const Vector3& row1 = to_godot_vector3(byte_buffer);
        const Vector3& row2 = to_godot_vector3(byte_buffer);
        return {row0, row1, row2};
    }

    static Variant from_kvariant_tokBasisValue(SharedBuffer* byte_buffer) {
        return Variant(to_godot_basis(byte_buffer));
    }

    static Variant from_kvariant_tokTransform3DValue(SharedBuffer* byte_buffer) {
        const Basis& basis{to_godot_basis(byte_buffer)};
        const Vector3& origin{to_godot_vector3(byte_buffer)};
        return Variant(
                Transform3D(basis, origin)
        );
    }

    static Variant from_kvariant_tokColorValue(SharedBuffer* byte_buffer) {
        float r{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT32_SIZE);
        float g{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT32_SIZE);
        float b{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT32_SIZE);
        float a{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT32_SIZE);
        return Variant(Color(r, g, b, a));
    }

    template<class T>
    static Variant from_kvariant_tokVariantNativeCoreTypeValue(SharedBuffer* byte_buffer) {
        auto ptr{static_cast<uintptr_t>(decode_uint64(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(PTR_SIZE);
        return Variant(*reinterpret_cast<T*>(ptr));
    }

    static Variant from_kvariant_toKObjectValue(SharedBuffer* byte_buffer) {
        auto ptr{static_cast<uintptr_t>(decode_uint64(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(PTR_SIZE);
		return Variant(reinterpret_cast<Object*>(ptr));
    }

    static void init_to_gd_methods(Variant (* to_gd_array[Variant::Type::VARIANT_MAX])(SharedBuffer* byte_buffer)) {
        to_gd_array[Variant::NIL] = from_kvariant_tokNilValue;
        to_gd_array[Variant::BOOL] = from_kvariant_tokBoolValue;
        to_gd_array[Variant::INT] = from_kvariant_tokLongValue;
        to_gd_array[Variant::FLOAT] = from_kvariant_tokFloat64Value;
        to_gd_array[Variant::STRING] = from_kvariant_tokStringValue;
        to_gd_array[Variant::VECTOR2] = from_kvariant_tokVector2Value;
        to_gd_array[Variant::VECTOR2I] = from_kvariant_tokVector2iValue;
        to_gd_array[Variant::RECT2] = from_kvariant_tokRect2Value;
        to_gd_array[Variant::RECT2I] = from_kvariant_tokRect2iValue;
        to_gd_array[Variant::VECTOR3] = from_kvariant_tokVector3Value;
        to_gd_array[Variant::VECTOR3I] = from_kvariant_tokVector3iValue;
        to_gd_array[Variant::TRANSFORM2D] = from_kvariant_tokTransform2DValue;
        to_gd_array[Variant::VECTOR4] = from_kvariant_tokVector4Value;
        to_gd_array[Variant::VECTOR4I] = from_kvariant_tokVector4iValue;
        to_gd_array[Variant::PLANE] = from_kvariant_tokPlaneValue;
        to_gd_array[Variant::QUATERNION] = from_kvariant_tokQuaternionValue;
        to_gd_array[Variant::AABB] = from_kvariant_tokAabbValue;
        to_gd_array[Variant::BASIS] = from_kvariant_tokBasisValue;
        to_gd_array[Variant::TRANSFORM3D] = from_kvariant_tokTransform3DValue;
        to_gd_array[Variant::COLOR] = from_kvariant_tokColorValue;
        to_gd_array[Variant::CALLABLE] = from_kvariant_tokVariantNativeCoreTypeValue<Callable>;
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
        static Variant (* TO_GODOT_VARIANT_FROM[Variant::Type::VARIANT_MAX])(SharedBuffer* byte_buffer);
        if (unlikely(!TO_GODOT_VARIANT_FROM[0])) {
            init_to_gd_methods(TO_GODOT_VARIANT_FROM);
        }
        uint32_t variant_type_int{decode_uint32(byte_buffer->get_cursor())};
        byte_buffer->increment_position(4);
        res = TO_GODOT_VARIANT_FROM[static_cast<Variant::Type>(variant_type_int)](byte_buffer);
    }

}


#endif //GODOT_JVM_KT_VARIANT_H
