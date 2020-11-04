#include <core/class_db.h>
#include "kt_variant.h"
#include "gd_kotlin.h"

// must match the value order of godot_variant_type
static void (* TO_KT_VARIANT_FROM[27 /* Variant::Type count */])(wire::Value&, const Variant&);

static Variant (* TO_GODOT_VARIANT_FROM[27 /* KVariant::TypeCase count */])(const wire::Value&);

static Variant::Type WIRE_TYPE_CASE_TO_VARIANT_TYPE[17];

static HashMap<StringName, int> JAVA_ENGINE_TYPES_CONSTRUCTORS;

KtVariant::KtVariant(wire::Value value) : value(value) {}

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

KtVariant::KtVariant(const Variant& variant) {
    Variant::Type type = variant.get_type();
    TO_KT_VARIANT_FROM[type](value, variant);
}

const wire::Value& KtVariant::get_value() const {
    return value;
}

Variant from_kvariant_tokNilValue(const wire::Value& src) {
    return Variant();
}

Variant from_kvariant_tokLongValue(const wire::Value& src) {
    return Variant(src.long_value());
}

Variant from_kvariant_tokRealValue(const wire::Value& src) {
    return Variant(src.real_value());
}

Variant from_kvariant_tokStringValue(const wire::Value& src) {
    return Variant(String(src.string_value().c_str()));
}

Variant from_kvariant_tokBoolValue(const wire::Value& src) {
    return Variant(src.bool_value());
}

inline Vector2 to_godot_vector2(const wire::Vector2& data) {
    return {data.x(), data.y()};
}

Variant from_kvariant_tokVector2Value(const wire::Value& src) {
    return Variant(to_godot_vector2(src.vector2_value()));
}

Variant from_kvariant_tokRect2Value(const wire::Value& src) {
    return Variant(
            Rect2(to_godot_vector2(src.rect2_value().position()), to_godot_vector2(src.rect2_value().size()))
    );
}

inline Vector3 to_godot_vector3(const wire::Vector3& data) {
    return {data.x(), data.y(), data.z()};
}

Variant from_kvariant_tokVector3Value(const wire::Value& src) {
    return Variant(to_godot_vector3(src.vector3_value()));
}

Variant from_kvariant_tokTransform2DValue(const wire::Value& src) {
    Transform2D transform2d;
    transform2d.set_axis(0, to_godot_vector2(src.transform2d_value().x()));
    transform2d.set_axis(1, to_godot_vector2(src.transform2d_value().y()));
    transform2d.set_origin(to_godot_vector2(src.transform2d_value().origin()));
    return Variant(transform2d);
}

Variant from_kvariant_tokPlaneValue(const wire::Value& src) {
    return Variant(
            Plane(to_godot_vector3(src.plane_value().normal()), src.plane_value().d())
    );
}

Variant from_kvariant_tokQuatValue(const wire::Value& src) {
    return Variant(
            Quat(src.quat_value().x(), src.quat_value().y(), src.quat_value().z(), src.quat_value().w())
    );
}

Variant from_kvariant_tokAabbValue(const wire::Value& src) {
    return Variant(
            AABB(to_godot_vector3(src.aabb_value().position()), to_godot_vector3(src.aabb_value().size()))
    );
}

inline Basis to_godot_basis(const wire::Basis& data) {
    return {to_godot_vector3(data.x()), to_godot_vector3(data.y()), to_godot_vector3(data.z())};
}

Variant from_kvariant_tokBasisValue(const wire::Value& src) {
    return Variant(to_godot_basis(src.basis_value()));
}

Variant from_kvariant_tokTransformValue(const wire::Value& src) {
    return Variant(
            Transform(to_godot_basis(src.transform_value().basis()), to_godot_vector3(src.transform_value().origin()))
    );
}

Variant from_kvariant_tokVariantArrayValue(const wire::Value& src) {
    return Array();
}

Variant from_kvariant_toKObjectValue(const wire::Value& src) {
    if (src.object_value().is_ref()) {
        REF ref{REF(reinterpret_cast<Reference*>(src.object_value().ptr()))};
        return Variant(ref.get_ref_ptr());
    } else {
        return Variant(reinterpret_cast<Object*>(src.object_value().ptr()));
    }
}

Variant KtVariant::to_godot_variant() const {
    return TO_GODOT_VARIANT_FROM[value.type_case()](value);
}

void KtVariant::initMethodArray() {
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

    TO_GODOT_VARIANT_FROM[wire::Value::kNilValue] = from_kvariant_tokNilValue;
    TO_GODOT_VARIANT_FROM[wire::Value::kBoolValue] = from_kvariant_tokBoolValue;
    TO_GODOT_VARIANT_FROM[wire::Value::kLongValue] = from_kvariant_tokLongValue;
    TO_GODOT_VARIANT_FROM[wire::Value::kRealValue] = from_kvariant_tokRealValue;
    TO_GODOT_VARIANT_FROM[wire::Value::kStringValue] = from_kvariant_tokStringValue;
    TO_GODOT_VARIANT_FROM[wire::Value::kVector2Value] = from_kvariant_tokVector2Value;
    TO_GODOT_VARIANT_FROM[wire::Value::kRect2Value] = from_kvariant_tokRect2Value;
    TO_GODOT_VARIANT_FROM[wire::Value::kVector3Value] = from_kvariant_tokVector3Value;
    TO_GODOT_VARIANT_FROM[wire::Value::kTransform2DValue] = from_kvariant_tokTransform2DValue;
    TO_GODOT_VARIANT_FROM[wire::Value::kPlaneValue] = from_kvariant_tokPlaneValue;
    TO_GODOT_VARIANT_FROM[wire::Value::kQuatValue] = from_kvariant_tokQuatValue;
    TO_GODOT_VARIANT_FROM[wire::Value::kAabbValue] = from_kvariant_tokAabbValue;
    TO_GODOT_VARIANT_FROM[wire::Value::kBasisValue] = from_kvariant_tokBasisValue;
    TO_GODOT_VARIANT_FROM[wire::Value::kTransformValue] = from_kvariant_tokTransformValue;
    TO_GODOT_VARIANT_FROM[wire::Value::kVariantArrayValue] = from_kvariant_tokVariantArrayValue;
    TO_GODOT_VARIANT_FROM[wire::Value::kObjectValue] = from_kvariant_toKObjectValue;

    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kNilValue] = Variant::Type::NIL;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kBoolValue] = Variant::Type::BOOL;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kLongValue] = Variant::Type::INT;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kRealValue] = Variant::Type::REAL;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kStringValue] = Variant::Type::STRING;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kVector2Value] = Variant::Type::VECTOR2;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kRect2Value] = Variant::Type::RECT2;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kVector3Value] = Variant::Type::VECTOR3;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kTransform2DValue] = Variant::Type::TRANSFORM2D;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kPlaneValue] = Variant::Type::PLANE;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kQuatValue] = Variant::Type::QUAT;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kAabbValue] = Variant::Type::AABB;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kBasisValue] = Variant::Type::BASIS;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kTransformValue] = Variant::Type::TRANSFORM;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kVariantArrayValue] = Variant::Type::ARRAY;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kObjectValue] = Variant::Type::OBJECT;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::kVariantArrayValue] = Variant::Type::ARRAY;
    WIRE_TYPE_CASE_TO_VARIANT_TYPE[wire::Value::TYPE_NOT_SET] = Variant::Type::VARIANT_MAX;
}

Variant::Type KtVariant::fromWireTypeToVariantType(wire::Value::TypeCase typeCase) {
    return WIRE_TYPE_CASE_TO_VARIANT_TYPE[typeCase];
}

void KtVariant::register_engine_types(JNIEnv* p_env, jobject p_this, jobjectArray p_engine_types_names) {
    print_line("Starting to register managed engine types...");
    jni::Env env(p_env);
    jni::JObjectArray types_names{p_engine_types_names};

    for (int i = 0; i < types_names.length(env); i++) {
        const String& class_name{env.from_jstring(static_cast<jni::JString>(types_names.get(env, i)))};
        JAVA_ENGINE_TYPES_CONSTRUCTORS[class_name] = i;
        print_verbose(vformat("Registered %s engine type with index %s.", class_name, i));
    }
    print_line("Done registering managed engine types...");
}

void KtVariant::clear_engine_types() {
    JAVA_ENGINE_TYPES_CONSTRUCTORS.clear();
}
