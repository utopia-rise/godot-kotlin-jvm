#ifndef GODOT_JVM_KT_VARIANT_H
#define GODOT_JVM_KT_VARIANT_H


#include <core/io/marshalls.h>
#include <core/os/os.h>
#include "core/variant.h"
#include "jni/wrapper.h"
#include "shared_buffer.h"
#include "type_manager.h"

namespace ktvariant {

    const int LONG_SIZE = 8;
    const int REAL_SIZE = 8;
    const int BOOL_SIZE = 4;

    const int PTR_SIZE = 8;

    const int INT_SIZE = 4;
    const int FLOAT_SIZE = 4;


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

    static void to_kvariant_fromREAL(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::REAL);
        des->increment_position(encode_double(src.operator double_t(), des->get_cursor()));
    }

    static void to_kvariant_fromSTRING(SharedBuffer* des, const Variant& src) {
        String str{src};
        const CharString& char_string{str.utf8()};
        set_variant_type(des, Variant::Type::STRING);
        des->increment_position(encode_uint32(char_string.size(), des->get_cursor()));
        des->increment_position(encode_cstring(char_string, des->get_cursor()));
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

    static void to_kvariant_fromCOLOR(SharedBuffer* des, const Variant& src) {
        Color src_color{src.operator Color()};
        set_variant_type(des, Variant::Type::COLOR);
        des->increment_position(encode_float(src_color.r, des->get_cursor()));
        des->increment_position(encode_float(src_color.g, des->get_cursor()));
        des->increment_position(encode_float(src_color.b, des->get_cursor()));
        des->increment_position(encode_float(src_color.a, des->get_cursor()));
    }

    template <class T>
    static void to_kvariant_fromNATIVECORETYPE(SharedBuffer* des, const Variant& src) {
        des->increment_position(
                encode_uint64(reinterpret_cast<uintptr_t>(new T(src.operator T())), des->get_cursor())
        );
    }

    static void to_kvariant_fromDICTIONARY(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::DICTIONARY);
        to_kvariant_fromNATIVECORETYPE<Dictionary>(des, src);
    }

    static void to_kvariant_fromARRAY(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::ARRAY);
        to_kvariant_fromNATIVECORETYPE<Array>(des, src);
    }

    static void to_kvariant_fromNODEPATH(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::NODE_PATH);
        to_kvariant_fromNATIVECORETYPE<NodePath>(des, src);
    }

    static void to_kvariant_fromRID(SharedBuffer* des, const Variant& src) {
        set_variant_type(des, Variant::Type::_RID);
        to_kvariant_fromNATIVECORETYPE<RID>(des, src);
    }

    static void to_kvariant_fromOBJECT(SharedBuffer* des, const Variant& src) {
        Object* ptr{src};
        set_variant_type(des, Variant::Type::OBJECT);

        //TODO: Manage 32 bits systems.
        des->increment_position(encode_uint64(reinterpret_cast<uintptr_t>(ptr), des->get_cursor()));

        String class_name {ptr->get_class()};

        if (!TypeManager::get_instance().JAVA_ENGINE_TYPES_CONSTRUCTORS.has(class_name)) {
            class_name = ClassDB::get_parent_class(class_name);

            while (class_name.empty()) {
                if (!TypeManager::get_instance().JAVA_ENGINE_TYPES_CONSTRUCTORS.has(class_name)) {
                    class_name = ClassDB::get_parent_class(class_name);
                } else {
                    break;
                }
            }
        }

        des->increment_position(encode_uint32(TypeManager::get_instance().JAVA_ENGINE_TYPES_CONSTRUCTORS[class_name], des->get_cursor()));
        des->increment_position(encode_uint32(src.is_ref(), des->get_cursor()));
        des->increment_position(encode_uint64(ptr->get_instance_id(), des->get_cursor()));
    }

    static void init_to_kt_methods(void (* to_kt_array[Variant::Type::VARIANT_MAX])(SharedBuffer*, const Variant&)) {
        to_kt_array[Variant::NIL] = to_kvariant_fromNIL;
        to_kt_array[Variant::BOOL] = to_kvariant_fromBOOL;
        to_kt_array[Variant::INT] = to_kvariant_fromINT;
        to_kt_array[Variant::REAL] = to_kvariant_fromREAL;
        to_kt_array[Variant::STRING] = to_kvariant_fromSTRING;
        to_kt_array[Variant::VECTOR2] = to_kvariant_fromVECTOR2;
        to_kt_array[Variant::RECT2] = to_kvariant_fromRECT2;
        to_kt_array[Variant::VECTOR3] = to_kvariant_fromVECTOR3;
        to_kt_array[Variant::TRANSFORM2D] = to_kvariant_fromTRANSFORM2D;
        to_kt_array[Variant::PLANE] = to_kvariant_fromPLANE;
        to_kt_array[Variant::QUAT] = to_kvariant_fromQUAT;
        to_kt_array[Variant::AABB] = to_kvariant_fromAABB;
        to_kt_array[Variant::BASIS] = to_kvariant_fromBASIS;
        to_kt_array[Variant::TRANSFORM] = to_kvariant_fromTRANSFORM;
        to_kt_array[Variant::COLOR] = to_kvariant_fromCOLOR;
        to_kt_array[Variant::DICTIONARY] = to_kvariant_fromDICTIONARY;
        to_kt_array[Variant::ARRAY] = to_kvariant_fromARRAY;
        to_kt_array[Variant::NODE_PATH] = to_kvariant_fromNODEPATH;
        to_kt_array[Variant::_RID] = to_kvariant_fromRID;
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

    static Variant from_kvariant_tokColorValue(SharedBuffer* byte_buffer) {
        float r{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT_SIZE);
        float g{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT_SIZE);
        float b{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT_SIZE);
        float a{decode_float(byte_buffer->get_cursor())};
        byte_buffer->increment_position(FLOAT_SIZE);
        return Variant(Color(r, g, b, a));
    }

    template <class T>
    static Variant from_kvariant_tokVariantNativeCoreTypeValue(SharedBuffer* byte_buffer) {
        uint64_t ptr{decode_uint64(byte_buffer->get_cursor())};
        byte_buffer->increment_position(PTR_SIZE);
        return Variant(*reinterpret_cast<T*>(ptr));
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

    static void init_to_gd_methods(Variant (* to_gd_array[Variant::Type::VARIANT_MAX])(SharedBuffer* byte_buffer)) {
        to_gd_array[Variant::NIL] = from_kvariant_tokNilValue;
        to_gd_array[Variant::BOOL] = from_kvariant_tokBoolValue;
        to_gd_array[Variant::INT] = from_kvariant_tokLongValue;
        to_gd_array[Variant::REAL] = from_kvariant_tokRealValue;
        to_gd_array[Variant::STRING] = from_kvariant_tokStringValue;
        to_gd_array[Variant::VECTOR2] = from_kvariant_tokVector2Value;
        to_gd_array[Variant::RECT2] = from_kvariant_tokRect2Value;
        to_gd_array[Variant::VECTOR3] = from_kvariant_tokVector3Value;
        to_gd_array[Variant::TRANSFORM2D] = from_kvariant_tokTransform2DValue;
        to_gd_array[Variant::PLANE] = from_kvariant_tokPlaneValue;
        to_gd_array[Variant::QUAT] = from_kvariant_tokQuatValue;
        to_gd_array[Variant::AABB] = from_kvariant_tokAabbValue;
        to_gd_array[Variant::BASIS] = from_kvariant_tokBasisValue;
        to_gd_array[Variant::TRANSFORM] = from_kvariant_tokTransformValue;
        to_gd_array[Variant::COLOR] = from_kvariant_tokColorValue;
        to_gd_array[Variant::DICTIONARY] = from_kvariant_tokVariantNativeCoreTypeValue<Dictionary>;
        to_gd_array[Variant::ARRAY] = from_kvariant_tokVariantNativeCoreTypeValue<Array>;
        to_gd_array[Variant::NODE_PATH] = from_kvariant_tokVariantNativeCoreTypeValue<NodePath>;
        to_gd_array[Variant::_RID] = from_kvariant_tokVariantNativeCoreTypeValue<RID>;
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
