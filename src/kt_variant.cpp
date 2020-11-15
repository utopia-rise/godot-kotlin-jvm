#include <core/class_db.h>
#include <core/io/marshalls.h>
#include "kt_variant.h"
#include "gd_kotlin.h"


// must match the value order of godot_variant_type
static void (* TO_KT_VARIANT_FROM[27 /* Variant::Type count */])(wire::Value&, const Variant&);

static Variant (* TO_GODOT_VARIANT_FROM[27 /* KVariant::TypeCase count */])(SharedBuffer& byte_buffer);

static HashMap<StringName, int> JAVA_ENGINE_TYPES_CONSTRUCTORS;

void to_kvariant_fromNIL(wire::Value& des, const Variant& src) {
    des.set_nil_value(0);
}

void to_kvariant_fromINT(wire::Value& des, const Variant& src) {
    des.set_long_value(src);
}

void to_kvariant_fromREAL(wire::Value& des, const Variant& src) {
    des.set_real_value(src);
}

void to_kvariant_fromSTRING(wire::Value& des, const Variant& src) {
    String str = src;
    des.set_string_value(str.utf8().get_data());
}

void to_kvariant_fromBOOL(wire::Value& des, const Variant& src) {
    des.set_bool_value(src);
}

inline wire::Vector2* to_wire_vector2(const Vector2& from) {
    auto vec2 = wire::Vector2::default_instance().New();
    vec2->set_x(from.x);
    vec2->set_y(from.y);
    return vec2;
}

void to_kvariant_fromVECTOR2(wire::Value& des, const Variant& src) {
    des.set_allocated_vector2_value(to_wire_vector2(src));
}

void to_kvariant_fromRECT2(wire::Value& des, const Variant& src) {
    auto wire_rect2 = wire::Rect2::default_instance().New();
    Rect2 src_rect2 = src;
    wire_rect2->set_allocated_position(to_wire_vector2(src_rect2.position));
    wire_rect2->set_allocated_size(to_wire_vector2(src_rect2.size));
    des.set_allocated_rect2_value(wire_rect2);
}

inline wire::Vector3* to_wire_vector3(const Vector3& from) {
    auto vec3 = wire::Vector3::default_instance().New();
    vec3->set_x(from.x);
    vec3->set_y(from.y);
    vec3->set_z(from.z);
    return vec3;
}

void to_kvariant_fromVECTOR3(wire::Value& des, const Variant& src) {
    des.set_allocated_vector3_value(to_wire_vector3(src));
}

void to_kvariant_fromTRANSFORM2D(wire::Value& des, const Variant& src) {
    auto transform_2d = wire::Transform2D::default_instance().New();
    Transform2D src_transform_2d = src;
    transform_2d->set_allocated_x(to_wire_vector2(src_transform_2d.get_axis(0)));
    transform_2d->set_allocated_y(to_wire_vector2(src_transform_2d.get_axis(1)));
    transform_2d->set_allocated_origin(to_wire_vector2(src_transform_2d.get_origin()));
    des.set_allocated_transform2d_value(transform_2d);
}

void to_kvariant_fromPLANE(wire::Value& des, const Variant& src) {
    auto plane = wire::Plane::default_instance().New();
    Plane src_plane = src;
    plane->set_allocated_normal(to_wire_vector3(src_plane.normal));
    plane->set_d(src_plane.d);
    des.set_allocated_plane_value(plane);
}

void to_kvariant_fromQUAT(wire::Value& des, const Variant& src) {
    auto quat = wire::Quat::default_instance().New();
    Quat src_quat = src;
    quat->set_x(src_quat.x);
    quat->set_y(src_quat.y);
    quat->set_z(src_quat.z);
    quat->set_w(src_quat.w);
    des.set_allocated_quat_value(quat);
}

void to_kvariant_fromAABB(wire::Value& des, const Variant& src) {
    auto aabb = wire::AABB::default_instance().New();
    AABB src_aabb = src;
    aabb->set_allocated_position(to_wire_vector3(src_aabb.position));
    aabb->set_allocated_size(to_wire_vector3(src_aabb.size));
    des.set_allocated_aabb_value(aabb);
}

inline wire::Basis* to_wire_basis(const Basis& data) {
    auto basis = wire::Basis::default_instance().New();
    basis->set_allocated_x(to_wire_vector3(data.get_axis(0)));
    basis->set_allocated_y(to_wire_vector3(data.get_axis(1)));
    basis->set_allocated_z(to_wire_vector3(data.get_axis(2)));
    return basis;
}

void to_kvariant_fromBASIS(wire::Value& des, const Variant& src) {
    des.set_allocated_basis_value(to_wire_basis(src));
}

void to_kvariant_fromTRANSFORM(wire::Value& des, const Variant& src) {
    auto transform = wire::Transform::default_instance().New();
    Transform src_transform = src;
    transform->set_allocated_basis(to_wire_basis(src_transform.basis));
    transform->set_allocated_origin(to_wire_vector3(src_transform.origin));
    des.set_allocated_transform_value(transform);
}

void to_kvariant_fromARRAY(wire::Value& des, const Variant& src) {
    wire::VariantArray* variant_array {wire::VariantArray::default_instance().New()};
    des.set_allocated_variant_array_value(variant_array);
}

void to_kvariant_fromOBJECT(wire::Value& des, const Variant& src) {
    Object* ptr = src;
    wire::Object* obj_value{wire::Object::default_instance().New()};
    obj_value->set_ptr(reinterpret_cast<uintptr_t>(ptr));
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

    obj_value->set_engine_constructor_index(JAVA_ENGINE_TYPES_CONSTRUCTORS[class_name]);
    obj_value->set_is_ref(src.is_ref());
    obj_value->set_instance_id(ptr->get_instance_id());
    des.set_allocated_object_value(obj_value);
}

void ktvariant::send_variant_to_buffer(const Variant& variant, SharedBuffer& byte_buffer) {
    Variant::Type type = variant.get_type();
    TO_KT_VARIANT_FROM[type](value, variant);
}

Variant from_kvariant_tokNilValue(SharedBuffer& byte_buffer) {
    return Variant();
}

Variant from_kvariant_tokLongValue(SharedBuffer& byte_buffer) {
    uint64_t ulong{decode_uint64(byte_buffer.get_cursor())};
    byte_buffer.increment_position(8);
    return Variant(ulong);
}

Variant from_kvariant_tokRealValue(SharedBuffer& byte_buffer) {
    double real{decode_double(byte_buffer.get_cursor())};
    byte_buffer.increment_position(8);
    return Variant(real);
}

Variant from_kvariant_tokStringValue(SharedBuffer& byte_buffer) {
    uint32_t size{decode_uint32(byte_buffer.get_cursor())};
    byte_buffer.increment_position(4);
    char str[size];
    for (int i = 0; i < size; ++i) {
        str[i] = *byte_buffer.get_cursor();
    }
    byte_buffer.increment_position(size);
    return Variant(String(str));
}

Variant from_kvariant_tokBoolValue(SharedBuffer& byte_buffer) {
    bool b{static_cast<bool>(decode_uint32(byte_buffer.get_cursor()))};
    byte_buffer.increment_position(4);
    return Variant(b);
}

inline Vector2 to_godot_vector2(SharedBuffer &byte_buffer) {
    float x{decode_float(byte_buffer.get_cursor())};
    byte_buffer.increment_position(4);
    float y{decode_float(byte_buffer.get_cursor())};
    byte_buffer.increment_position(4);
    return {x, y};
}

Variant from_kvariant_tokVector2Value(SharedBuffer& byte_buffer) {
    return Variant(to_godot_vector2(byte_buffer));
}

Variant from_kvariant_tokRect2Value(SharedBuffer& byte_buffer) {
    return Variant(
            Rect2(to_godot_vector2(byte_buffer), to_godot_vector2(byte_buffer))
    );
}

inline Vector3 to_godot_vector3(SharedBuffer &byte_buffer) {
    float x{decode_float(byte_buffer.get_cursor())};
    byte_buffer.increment_position(4);
    float y{decode_float(byte_buffer.get_cursor())};
    byte_buffer.increment_position(4);
    float z{decode_float(byte_buffer.get_cursor())};
    return {x, y, z};
}

Variant from_kvariant_tokVector3Value(SharedBuffer& byte_buffer) {
    return Variant(to_godot_vector3(byte_buffer));
}

Variant from_kvariant_tokTransform2DValue(SharedBuffer& byte_buffer) {
    Transform2D transform2d;
    transform2d.set_axis(0, to_godot_vector2(byte_buffer));
    transform2d.set_axis(1, to_godot_vector2(byte_buffer));
    transform2d.set_origin(to_godot_vector2(byte_buffer));
    return Variant(transform2d);
}

Variant from_kvariant_tokPlaneValue(SharedBuffer& byte_buffer) {
    Vector3 norm{to_godot_vector3(byte_buffer)};
    float d{decode_float(byte_buffer.get_cursor())};
    byte_buffer.increment_position(4);
    return Variant(
            Plane(norm, d)
    );
}

Variant from_kvariant_tokQuatValue(SharedBuffer& byte_buffer) {
    float x{decode_float(byte_buffer.get_cursor())};
    byte_buffer.increment_position(4);
    float y{decode_float(byte_buffer.get_cursor())};
    byte_buffer.increment_position(4);
    float z{decode_float(byte_buffer.get_cursor())};
    byte_buffer.increment_position(4);
    float w{decode_float(byte_buffer.get_cursor())};
    byte_buffer.increment_position(4);
    return Variant(
            Quat(x, y, z, w)
    );
}

Variant from_kvariant_tokAabbValue(SharedBuffer& byte_buffer) {
    return Variant(
            AABB(to_godot_vector3(byte_buffer), to_godot_vector3(byte_buffer))
    );
}

inline Basis to_godot_basis(SharedBuffer &byte_buffer) {
    return {
        to_godot_vector3(byte_buffer),
        to_godot_vector3(byte_buffer),
        to_godot_vector3(byte_buffer)
    };
}

Variant from_kvariant_tokBasisValue(SharedBuffer& byte_buffer) {
    return Variant(to_godot_basis(byte_buffer));
}

Variant from_kvariant_tokTransformValue(SharedBuffer& byte_buffer) {
    return Variant(
            Transform(to_godot_basis(byte_buffer), to_godot_vector3(byte_buffer))
    );
}

Variant from_kvariant_tokVariantArrayValue(SharedBuffer& byte_buffer) {
    return Array();
}

Variant from_kvariant_toKObjectValue(SharedBuffer& byte_buffer) {
    uint64_t ptr{decode_uint64(byte_buffer.get_cursor())};
    byte_buffer.increment_position(12);
    bool is_ref{static_cast<bool>(decode_uint32(byte_buffer.get_cursor()))};
    byte_buffer.increment_position(12);
    if (is_ref) {
        REF ref{REF(reinterpret_cast<Reference*>(ptr))};
        return Variant(ref.get_ref_ptr());
    } else {
        return Variant(reinterpret_cast<Object*>(ptr));
    }
}

void ktvariant::get_variant_from_buffer(SharedBuffer& byte_buffer, Variant& res) {
    uint32_t variant_type_int{decode_uint32(byte_buffer.get_cursor())};
    byte_buffer.increment_position(4);
    res = TO_GODOT_VARIANT_FROM[static_cast<Variant::Type>(variant_type_int)](byte_buffer);
}

void ktvariant::initMethodArray() {
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

void ktvariant::register_engine_types(jni::Env& env, jni::JObjectArray p_engine_types_names) {
    print_line("Starting to register managed engine types...");

    for (int i = 0; i < p_engine_types_names.length(env); i++) {
        const String& class_name{env.from_jstring(static_cast<jni::JString>(p_engine_types_names.get(env, i)))};
        JAVA_ENGINE_TYPES_CONSTRUCTORS[class_name] = i;
        GDKotlin::get_instance().engine_type_names.insert(i, class_name);
        print_verbose(vformat("Registered %s engine type with index %s.", class_name, i));
    }
    print_line("Done registering managed engine types...");
}

void ktvariant::clear_engine_types() {
    JAVA_ENGINE_TYPES_CONSTRUCTORS.clear();
}