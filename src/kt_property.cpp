#include "kt_property.h"
#include "kt_variant.h"
#include "gd_kotlin.h"

JNI_INIT_STATICS_FOR_CLASS(KtPropertyInfo)
JNI_INIT_STATICS_FOR_CLASS(KtProperty)

KtPropertyInfo::KtPropertyInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader)
        : JavaInstanceWrapper("godot.core.KtPropertyInfo", p_wrapped, p_class_loader) {
    jni::Env env { jni::Jvm::current_env() };
    jni::MethodId getTypeMethod{get_method_id(env, jni_methods.GET_TYPE)};
    type = static_cast<Variant::Type>(wrapped.call_int_method(env, getTypeMethod));
    jni::MethodId getNameMethod{get_method_id(env, jni_methods.GET_NAME)};
    name = env.from_jstring(wrapped.call_object_method(env, getNameMethod));
    jni::MethodId getClassNameMethod{get_method_id(env, jni_methods.GET_CLASS_NAME)};
    class_name = env.from_jstring(wrapped.call_object_method(env, getClassNameMethod));
    jni::MethodId getPropertyHintMethod{get_method_id(env, jni_methods.GET_HINT)};
    hint = static_cast<PropertyHint>(wrapped.call_int_method(env, getPropertyHintMethod));
    jni::MethodId getHintStringMethod{get_method_id(env, jni_methods.GET_HINT_STRING)};
    hint_string = env.from_jstring(wrapped.call_object_method(env, getHintStringMethod));
}

PropertyInfo KtPropertyInfo::toPropertyInfo() {
    PropertyInfo info;
    info.type = type;
    info.name = name;
    info.class_name = class_name;
    info.hint = hint;
    info.hint_string = hint_string;
    return info;
}

KtProperty::KtProperty(jni::JObject p_wrapped, jni::JObject& p_class_loader)
        : JavaInstanceWrapper("godot.core.KtProperty", p_wrapped, p_class_loader),
        is_default_value_initialized(false) {
    jni::Env env { jni::Jvm::current_env() };
    jni::MethodId getKtPropertyInfoMethod{get_method_id(env, jni_methods.GET_KT_PROPERTY_INFO)};
    propertyInfo = new KtPropertyInfo(wrapped.call_object_method(env, getKtPropertyInfoMethod),
                                      GDKotlin::get_instance().get_class_loader());
    jni::MethodId getIsRefMethod{get_method_id(env, jni_methods.IS_REF)};
    is_ref = wrapped.call_boolean_method(env, getIsRefMethod);
    initialize_default_value();
}

KtProperty::~KtProperty() {
    delete propertyInfo;
}

StringName KtProperty::get_name() const {
    return propertyInfo->name;
}

PropertyInfo KtProperty::get_member_info() {
    return propertyInfo->toPropertyInfo();
}

void KtProperty::callGet(KtObject* instance, Variant& r_ret) {
    jni::Env env{jni::Jvm::current_env()};
    jni::MethodId get_call_method_id{get_method_id(env, jni_methods.CALL_GET)};
    jvalue call_args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    bool refresh_buffer = wrapped.call_boolean_method(env, get_call_method_id, call_args);
    r_ret = GDKotlin::get_instance().transfer_context->read_return_value(env);
}

void KtProperty::setCall(KtObject* instance, const Variant& p_value) {
    jni::Env env{jni::Jvm::current_env()};
    jni::MethodId setCallMethodId {get_method_id(env, jni_methods.CALL_SET)};
    Vector<Variant> arg;
    arg.push_back(p_value);
    GDKotlin::get_instance().transfer_context->write_args(env, arg, 0);
    jvalue args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    wrapped.call_void_method(env, setCallMethodId, args);
}

void KtProperty::get_default_value(Variant& r_value) {
    r_value = default_value;
}

void KtProperty::initialize_default_value() {
    if (!is_default_value_initialized) {
        jni::Env env {jni::Jvm::current_env()};
        Vector<Variant> args;
        GDKotlin::get_instance().transfer_context->write_args(env, args, 0);
        jni::MethodId get_default_value_method{get_method_id(env, jni_methods.GET_DEFAULT_VALUE)};
        bool refresh{static_cast<bool>(wrapped.call_boolean_method(env, get_default_value_method))};
        default_value = GDKotlin::get_instance().transfer_context->read_return_value(env);
        is_default_value_initialized = true;
    }
}
