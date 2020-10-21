#ifndef GODOT_JVM_KT_VARIANT_H
#define GODOT_JVM_KT_VARIANT_H
#include "wire/wire.pb.h"
#include "core/variant.h"
#include "jni/wrapper.h"
#include "java_instance_wrapper.h"
#include "kt_property.h"

class KtVariant {
private:
    wire::Value value;

public:
    KtVariant() = default;
    KtVariant(wire::Value value);
    KtVariant(const Variant& variant);
    KtVariant(const Variant& variant, const KtPropertyInfo* argInfo);
    ~KtVariant() = default;

    static void initMethodArray();
    static Variant::Type fromWireTypeToVariantType(wire::Value::TypeCase typeCase);
    static void register_engine_types(JNIEnv* p_env, jobject p_this, jobjectArray p_engine_types_names);
    static void register_user_types(JNIEnv* p_env, jobject p_this, jobjectArray p_user_type_names);
    static void clear_engine_types();
    static void clear_user_types();

    const wire::Value& get_value() const;
    Variant to_godot_variant() const;
};


#endif //GODOT_JVM_KT_VARIANT_H
