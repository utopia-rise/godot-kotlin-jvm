#include "kt_variant.h"

KtVariant::KtVariant(wire::Value value) : value(value) {}

const wire::Value& KtVariant::get_value() const {
    return value;
}

Variant KtVariant::to_godot_variant() const {
    return Variant();
}
