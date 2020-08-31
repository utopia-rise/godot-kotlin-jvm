#include <modules/kotlin_jvm/src/wire/wire.pb.h>
#include "kt_property_info.h"
#include "kt_variant.h"

KtPropertyInfo::KtPropertyInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader)
    : JavaInstanceWrapper("godot.core.KtPropertyInfo", p_wrapped, p_class_loader) {
    jni::Env env = jni::Jvm::current_env();
    jni::MethodId getTypeMethod { get_method_id(env, "getType", "()I") };
    type = KtVariant::fromWireType(static_cast<wire::Value::TypeCase>(wrapped.call_int_method(env, getTypeMethod)));
    jni::MethodId getNameMethod { get_method_id(env, "getName", "()Ljava/lang/String;") };
    name = env.from_jstring(wrapped.call_object_method(env, getNameMethod));
    jni::MethodId getClassNameMethod { get_method_id(env, "getClassName", "()Ljava/lang/String;") };
    class_name = env.from_jstring(wrapped.call_object_method(env, getClassNameMethod));
    jni::MethodId getPropertyHintMethod { get_method_id(env, "getHint", "()I") };
    propertyHint = static_cast<PropertyHint>(wrapped.call_int_method(env, getPropertyHintMethod));
    jni::MethodId getHintStringMethod { get_method_id(env, "getHintString", "()Ljava/lang/String;") };
    hint_string = env.from_jstring(wrapped.call_object_method(env, getHintStringMethod));
}

String KtPropertyInfo::getName() const {
    return name;
}

String KtPropertyInfo::getClassName() const {
    return class_name;
}

String KtPropertyInfo::getHintString() const {
    return hint_string;
}
