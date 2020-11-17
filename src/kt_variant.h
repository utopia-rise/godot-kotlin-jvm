#ifndef GODOT_JVM_KT_VARIANT_H
#define GODOT_JVM_KT_VARIANT_H


#include <core/io/marshalls.h>
#include "core/variant.h"
#include "jni/wrapper.h"
#include "shared_buffer.h"

namespace ktvariant {

    const int LONG_SIZE = 8;
    const int REAL_SIZE = 8;
    const int BOOL_SIZE = 4;

    const int PTR_SIZE = 8;

    const int INT_SIZE = 4;
    const int FLOAT_SIZE = 4;


    // must match the value order of godot_variant_type
    static void (* TO_KT_VARIANT_FROM[27 /* Variant::Type count */])(SharedBuffer*, const Variant&);

    static Variant (* TO_GODOT_VARIANT_FROM[27 /* KVariant::TypeCase count */])(SharedBuffer* byte_buffer);

    static HashMap<StringName, int> JAVA_ENGINE_TYPES_CONSTRUCTORS;

    static void get_variant_from_buffer(SharedBuffer* byte_buffer, Variant& res) {
        uint32_t variant_type_int{decode_uint32(byte_buffer->get_cursor())};
        byte_buffer->increment_position(4);
        res = TO_GODOT_VARIANT_FROM[static_cast<Variant::Type>(variant_type_int)](byte_buffer);
    }

    static void set_variant_type(SharedBuffer* des, Variant::Type variant_type) {
        des->increment_position(encode_uint32(variant_type, des->get_cursor()));
    }

    static void to_kvariant_fromNIL(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::NIL);
    }

    static void to_kvariant_fromINT(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::INT);
        des->increment_position(encode_uint32(src.operator int64_t(), des->get_cursor()));
    }

    static void to_kvariant_fromREAL(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::REAL);
        des->increment_position(encode_double(src.operator double_t(), des->get_cursor()));
    }

    static void to_kvariant_fromSTRING(SharedBuffer* des, const Variant& src) {
        String str{src};
        set_variant_type(des, Variant::Type::STRING);
        const CharString& charSequence = str.utf8();
        des->increment_position(encode_uint32(charSequence.size(), des->get_cursor()));
        des->increment_position(encode_cstring(charSequence, des->get_cursor()));
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

    static void to_kvariant_fromRECT2(SharedBuffer* des, const Variant& src) {
        Rect2 src_rect2{src};
        set_variant_type(des, Variant::Type::RECT2);
        append_vector2(des, src_rect2.position);
        append_vector2(des, src_rect2.size);
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

    static void to_kvariant_fromTRANSFORM2D(SharedBuffer* des, const Variant& src) {
        Transform2D src_transform_2d{src};
        set_variant_type(des, Variant::Type::TRANSFORM2D);
        append_vector2(des, src_transform_2d.get_axis(0));
        append_vector2(des, src_transform_2d.get_axis(1));
        append_vector2(des, src_transform_2d.get_origin());
    }

    static void to_kvariant_fromPLANE(SharedBuffer* des, const Variant& src) {
        Plane src_plane{src};
        set_variant_type(des, Variant::Type::PLANE);
        append_vector3(des, src_plane.normal);
        des->increment_position(encode_float(src_plane.d, des->get_cursor()));
    }

    static void to_kvariant_fromQUAT(SharedBuffer* des, const Variant& src) {
        Quat src_quat{src.operator Quat()};
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
        append_vector3(des, data.get_axis(0));
        append_vector3(des, data.get_axis(1));
        append_vector3(des, data.get_axis(2));
    }

    static void to_kvariant_fromBASIS(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::BASIS);
        append_basis(des, src);
    }

    static void to_kvariant_fromTRANSFORM(SharedBuffer* des, const Variant& src) {
        Transform src_transform{src.operator Transform()};
        set_variant_type(des, Variant::Type::TRANSFORM);
        append_basis(des, src_transform.basis);
        append_vector3(des, src_transform.origin);
    }

    static void to_kvariant_fromARRAY(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::ARRAY);
        //TODO
    }

    static void to_kvariant_fromOBJECT(SharedBuffer* des, const Variant& src) {
        Object* ptr{src};
        set_variant_type(des, Variant::Type::OBJECT);

        //TODO: Manage 32 bits systems.
        des->increment_position(encode_uint64(reinterpret_cast<uintptr_t>(ptr), des->get_cursor()));

        String class_name {ptr->get_class()};

        if (!JAVA_ENGINE_TYPES_CONSTRUCTORS.has(class_name)) {
            class_name = ClassDB::get_parent_class(class_name);

            while (class_name.empty()) {
                if (!JAVA_ENGINE_TYPES_CONSTRUCTORS.has(class_name)) {
                    class_name = ClassDB::get_parent_class(class_name);
                } else {
                    break;
                }
            }
        }

        des->increment_position(encode_uint32(JAVA_ENGINE_TYPES_CONSTRUCTORS[class_name], des->get_cursor()));
        des->increment_position(encode_uint32(src.is_ref(), des->get_cursor()));
        des->increment_position(encode_uint64(ptr->get_instance_id(), des->get_cursor()));
    }

    static void send_variant_to_buffer(const Variant& variant, SharedBuffer* byte_buffer) {
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

    static Variant from_kvariant_tokRealValue(SharedBuffer* byte_buffer) {
        double real{decode_double(byte_buffer->get_cursor())};
        byte_buffer->increment_position(REAL_SIZE);
        return Variant(real);
    }

    static Variant from_kvariant_tokStringValue(SharedBuffer* byte_buffer) {
        uint32_t size{decode_uint32(byte_buffer->get_cursor())};
        byte_buffer->increment_position(INT_SIZE);
        String str;
        str.parse_utf8(reinterpret_cast<const char*>(byte_buffer->get_cursor()), size);
        byte_buffer->increment_position(size);
        return Variant(str);
    }

    static Variant from_kvariant_tokBoolValue(SharedBuffer* byte_buffer) {
        bool b{static_cast<bool>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(BOOL_SIZE);
        return Variant(b);
    }

    static inline Vector2 to_godot_vector2(SharedBuffer* byte_buffer) {
        float x{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT_SIZE);
        float y{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT_SIZE);
        return {x, y};
    }

    static Variant from_kvariant_tokVector2Value(SharedBuffer* byte_buffer) {
        return Variant(to_godot_vector2(byte_buffer));
    }

    static Variant from_kvariant_tokRect2Value(SharedBuffer* byte_buffer) {
        return Variant(
                Rect2(to_godot_vector2(byte_buffer), to_godot_vector2(byte_buffer))
        );
    }

    static inline Vector3 to_godot_vector3(SharedBuffer* byte_buffer) {
        float x{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(4);
        float y{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(4);
        float z{decode_float(byte_buffer->get_cursor())};
        return {x, y, z};
    }

    static Variant from_kvariant_tokVector3Value(SharedBuffer* byte_buffer) {
        return Variant(to_godot_vector3(byte_buffer));
    }

    static Variant from_kvariant_tokTransform2DValue(SharedBuffer* byte_buffer) {
        Transform2D transform2d;
        transform2d.set_axis(0, to_godot_vector2(byte_buffer));
        transform2d.set_axis(1, to_godot_vector2(byte_buffer));
        transform2d.set_origin(to_godot_vector2(byte_buffer));
        return Variant(transform2d);
    }

    static Variant from_kvariant_tokPlaneValue(SharedBuffer* byte_buffer) {
        Vector3 norm{to_godot_vector3(byte_buffer)};
        float d{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT_SIZE);
        return Variant(
                Plane(norm, d)
        );
    }

    static Variant from_kvariant_tokQuatValue(SharedBuffer* byte_buffer) {
        float x{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT_SIZE);
        float y{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT_SIZE);
        float z{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT_SIZE);
        float w{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT_SIZE);
        return Variant(
                Quat(x, y, z, w)
        );
    }

    static Variant from_kvariant_tokAabbValue(SharedBuffer* byte_buffer) {
        return Variant(
                AABB(to_godot_vector3(byte_buffer), to_godot_vector3(byte_buffer))
        );
    }

    static inline Basis to_godot_basis(SharedBuffer* byte_buffer) {
        return {
                to_godot_vector3(byte_buffer),
                to_godot_vector3(byte_buffer),
                to_godot_vector3(byte_buffer)
        };
    }

    static Variant from_kvariant_tokBasisValue(SharedBuffer* byte_buffer) {
        return Variant(to_godot_basis(byte_buffer));
    }

    static Variant from_kvariant_tokTransformValue(SharedBuffer* byte_buffer) {
        return Variant(
                Transform(to_godot_basis(byte_buffer), to_godot_vector3(byte_buffer))
        );
    }

    static Variant from_kvariant_tokVariantArrayValue(SharedBuffer* byte_buffer) {
        return Array();
    }

    static Variant from_kvariant_toKObjectValue(SharedBuffer* byte_buffer) {
        uint64_t ptr{decode_uint64(byte_buffer->get_cursor())};
        byte_buffer->increment_position(PTR_SIZE);
        bool is_ref{static_cast<bool>(decode_uint32(byte_buffer->get_cursor()))};
        byte_buffer->increment_position(BOOL_SIZE);
        if (is_ref) {
            REF ref{REF(reinterpret_cast<Reference*>(ptr))};
            return Variant(ref.get_ref_ptr());
        } else {
            return Variant(reinterpret_cast<Object*>(ptr));
        }
    }

    static void initMethodArray() {
        TO_KT_VARIANT_FROM[Variant::NIL] = to_kvariant_fromNIL;
        TO_KT_VARIANT_FROM[Variant::BOOL] = to_kvariant_fromBOOL;
        TO_KT_VARIANT_FROM[Variant::INT] = to_kvariant_fromINT;
        TO_KT_VARIANT_FROM[Variant::REAL] = to_kvariant_fromREAL;
        TO_KT_VARIANT_FROM[Variant::STRING] = to_kvariant_fromSTRING;
        TO_KT_VARIANT_FROM[Variant::VECTOR2] = to_kvariant_fromVECTOR2;
        TO_KT_VARIANT_FROM[Variant::RECT2] = to_kvariant_fromRECT2;
        TO_KT_VARIANT_FROM[Variant::VECTOR3] = to_kvariant_fromVECTOR3;
        TO_KT_VARIANT_FROM[Variant::TRANSFORM2D] = to_kvariant_fromTRANSFORM2D;
        TO_KT_VARIANT_FROM[Variant::PLANE] = to_kvariant_fromPLANE;
        TO_KT_VARIANT_FROM[Variant::QUAT] = to_kvariant_fromQUAT;
        TO_KT_VARIANT_FROM[Variant::AABB] = to_kvariant_fromAABB;
        TO_KT_VARIANT_FROM[Variant::BASIS] = to_kvariant_fromBASIS;
        TO_KT_VARIANT_FROM[Variant::TRANSFORM] = to_kvariant_fromTRANSFORM;
        TO_KT_VARIANT_FROM[Variant::ARRAY] = to_kvariant_fromARRAY;
        TO_KT_VARIANT_FROM[Variant::OBJECT] = to_kvariant_fromOBJECT;

        TO_GODOT_VARIANT_FROM[Variant::NIL] = from_kvariant_tokNilValue;
        TO_GODOT_VARIANT_FROM[Variant::BOOL] = from_kvariant_tokBoolValue;
        TO_GODOT_VARIANT_FROM[Variant::INT] = from_kvariant_tokLongValue;
        TO_GODOT_VARIANT_FROM[Variant::REAL] = from_kvariant_tokRealValue;
        TO_GODOT_VARIANT_FROM[Variant::STRING] = from_kvariant_tokStringValue;
        TO_GODOT_VARIANT_FROM[Variant::VECTOR2] = from_kvariant_tokVector2Value;
        TO_GODOT_VARIANT_FROM[Variant::RECT2] = from_kvariant_tokRect2Value;
        TO_GODOT_VARIANT_FROM[Variant::VECTOR3] = from_kvariant_tokVector3Value;
        TO_GODOT_VARIANT_FROM[Variant::TRANSFORM2D] = from_kvariant_tokTransform2DValue;
        TO_GODOT_VARIANT_FROM[Variant::PLANE] = from_kvariant_tokPlaneValue;
        TO_GODOT_VARIANT_FROM[Variant::QUAT] = from_kvariant_tokQuatValue;
        TO_GODOT_VARIANT_FROM[Variant::AABB] = from_kvariant_tokAabbValue;
        TO_GODOT_VARIANT_FROM[Variant::BASIS] = from_kvariant_tokBasisValue;
        TO_GODOT_VARIANT_FROM[Variant::TRANSFORM] = from_kvariant_tokTransformValue;
        TO_GODOT_VARIANT_FROM[Variant::ARRAY] = from_kvariant_tokVariantArrayValue;
        TO_GODOT_VARIANT_FROM[Variant::OBJECT] = from_kvariant_toKObjectValue;
    }

    static void register_engine_types(jni::Env& p_env, const String& engine_type_name, int index) {
        JAVA_ENGINE_TYPES_CONSTRUCTORS[engine_type_name] = index;
    }

    static void clear_engine_types() {
        JAVA_ENGINE_TYPES_CONSTRUCTORS.clear();
    }
}


#endif //GODOT_JVM_KT_VARIANT_H
