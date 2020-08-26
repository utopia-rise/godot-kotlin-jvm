#include "kt_variant.h"

KtVariant::KtVariant(wire::Value value) : value(value) {}

#define to_kt_variant_from(type) \
    const int to_kvariant_from##type##_index = Variant::type; \
    void to_kvariant_from##type(wire::Value& des, const Variant& src)
#define to_kt_variant_from_index(type) \
    [to_kvariant_from##type##_index] = to_kvariant_from##type

to_kt_variant_from(NIL) {
    des.set_nil_value(0);
}

to_kt_variant_from(INT) {
    des.set_long_value(src);
}

to_kt_variant_from(REAL) {
    des.set_real_value(src);
}

to_kt_variant_from(STRING) {
    String str = src;
    des.set_string_value(str.utf8().get_data());
}

to_kt_variant_from(BOOL) {
    des.set_bool_value(src);
}

inline wire::Vector2* to_wire_vector2(const Vector2& from) {
    auto vec2 = wire::Vector2::default_instance().New();
    vec2->set_x(from.x);
    vec2->set_y(from.y);
    return vec2;
}

to_kt_variant_from(VECTOR2) {
    des.set_allocated_vector2_value(to_wire_vector2(src));
}

to_kt_variant_from(RECT2) {
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

to_kt_variant_from(VECTOR3) {
    des.set_allocated_vector3_value(to_wire_vector3(src));
}

to_kt_variant_from(TRANSFORM2D) {
    auto transform_2d = wire::Transform2D::default_instance().New();
    Transform2D src_transform_2d = src;
    transform_2d->set_allocated_x(to_wire_vector2(src_transform_2d.get_axis(0)));
    transform_2d->set_allocated_y(to_wire_vector2(src_transform_2d.get_axis(1)));
    transform_2d->set_allocated_origin(to_wire_vector2(src_transform_2d.get_origin()));
    des.set_allocated_transform2d_value(transform_2d);
}

to_kt_variant_from(PLANE) {
    auto plane = wire::Plane::default_instance().New();
    Plane src_plane = src;
    plane->set_allocated_normal(to_wire_vector3(src_plane.normal));
    plane->set_d(src_plane.d);
    des.set_allocated_plane_value(plane);
}

to_kt_variant_from(QUAT) {
    auto quat = wire::Quat::default_instance().New();
    Quat src_quat = src;
    quat->set_x(src_quat.x);
    quat->set_y(src_quat.y);
    quat->set_z(src_quat.z);
    quat->set_w(src_quat.w);
    des.set_allocated_quat_value(quat);
}

to_kt_variant_from(AABB) {
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

to_kt_variant_from(BASIS) {
    des.set_allocated_basis_value(to_wire_basis(src));
}

to_kt_variant_from(TRANSFORM) {
        auto transform = wire::Transform::default_instance().New();
        Transform src_transform = src;
        transform->set_allocated_basis(to_wire_basis(src_transform.basis));
        transform->set_allocated_origin(to_wire_vector3(src_transform.origin));
        des.set_allocated_transform_value(transform);
}

// must match the value order of godot_variant_type
static void(*TO_KT_VARIANT_FROM[27 /* Variant::Type count */])(wire::Value&, const Variant&) = {
        to_kt_variant_from_index(NIL),
        to_kt_variant_from_index(BOOL),
        to_kt_variant_from_index(INT),
        to_kt_variant_from_index(REAL),
        to_kt_variant_from_index(STRING),
        to_kt_variant_from_index(VECTOR2),
        to_kt_variant_from_index(RECT2),
        to_kt_variant_from_index(VECTOR3),
        to_kt_variant_from_index(TRANSFORM2D),
        to_kt_variant_from_index(PLANE),
        to_kt_variant_from_index(QUAT),
        to_kt_variant_from_index(AABB),
        to_kt_variant_from_index(BASIS),
        to_kt_variant_from_index(TRANSFORM),
};

KtVariant::KtVariant(const Variant& variant) {
    Variant::Type type = variant.get_type();
    TO_KT_VARIANT_FROM[type](value, variant);
}

const wire::Value& KtVariant::get_value() const {
    return value;
}

#define to_godot_variant_from(type) \
    const int from_kvariant_to##type##_index = wire::Value::type - 1; \
    Variant from_kvariant_to##type(const wire::Value& src)
#define to_godot_variant_from_index(type) \
    [from_kvariant_to##type##_index] = from_kvariant_to##type

to_godot_variant_from(kNilValue) {
    return Variant();
}

to_godot_variant_from(kLongValue) {
    return Variant(src.long_value());
}

to_godot_variant_from(kRealValue) {
    return Variant(src.real_value());
}

to_godot_variant_from(kStringValue) {
    return Variant(String(src.string_value().c_str()));
}

to_godot_variant_from(kBoolValue) {
    return Variant(src.bool_value());
}

inline Vector2 to_godot_vector2(const wire::Vector2& data) {
    return {data.x(), data.y()};
}

to_godot_variant_from(kVector2Value) {
    return Variant(to_godot_vector2(src.vector2_value()));
}

to_godot_variant_from(kRect2Value) {
    return Variant(
            Rect2(to_godot_vector2(src.rect2_value().position()), to_godot_vector2(src.rect2_value().size()))
    );
}

inline Vector3 to_godot_vector3(const wire::Vector3& data) {
    return {data.x(), data.y(), data.z()};
}

to_godot_variant_from(kVector3Value) {
    return Variant(to_godot_vector3(src.vector3_value()));
}

to_godot_variant_from(kTransform2DValue) {
    Transform2D transform2d;
    transform2d.set_axis(0, to_godot_vector2(src.transform2d_value().x()));
    transform2d.set_axis(1, to_godot_vector2(src.transform2d_value().y()));
    transform2d.set_origin(to_godot_vector2(src.transform2d_value().origin()));
    return Variant(transform2d);
}

to_godot_variant_from(kPlaneValue) {
    return Variant(
            Plane(to_godot_vector3(src.plane_value().normal()), src.plane_value().d())
    );
}

to_godot_variant_from(kQuatValue) {
    return Variant(
            Quat(src.quat_value().x(), src.quat_value().y(), src.quat_value().z(), src.quat_value().w())
    );
}

to_godot_variant_from(kAabbValue) {
    return Variant(
            AABB(to_godot_vector3(src.aabb_value().position()), to_godot_vector3(src.aabb_value().size()))
    );
}

inline Basis to_godot_basis(const wire::Basis& data) {
    return {to_godot_vector3(data.x()), to_godot_vector3(data.y()), to_godot_vector3(data.z())};
}

to_godot_variant_from(kBasisValue) {
    return Variant(to_godot_basis(src.basis_value()));
}

to_godot_variant_from(kTransformValue) {
    return Variant(
            Transform(to_godot_basis(src.transform_value().basis()), to_godot_vector3(src.transform_value().origin()))
    );
}

// must match the value order of KVariant::TypeCase
static Variant(*TO_GODOT_VARIANT_FROM[27 /* KVariant::TypeCase count */])(const wire::Value&) = {
        to_godot_variant_from_index(kNilValue),
        to_godot_variant_from_index(kBoolValue),
        to_godot_variant_from_index(kLongValue),
        to_godot_variant_from_index(kRealValue),
        to_godot_variant_from_index(kStringValue),
        to_godot_variant_from_index(kVector2Value),
        to_godot_variant_from_index(kRect2Value),
        to_godot_variant_from_index(kVector3Value),
        to_godot_variant_from_index(kTransform2DValue),
        to_godot_variant_from_index(kPlaneValue),
        to_godot_variant_from_index(kQuatValue),
        to_godot_variant_from_index(kAabbValue),
        to_godot_variant_from_index(kBasisValue),
        to_godot_variant_from_index(kTransformValue),
};

Variant KtVariant::to_godot_variant() const {
    return TO_GODOT_VARIANT_FROM[value.type_case()](value);
}
