#include "kt_property.h"

#include "gd_kotlin.h"
#include "jni/class_loader.h"

JNI_INIT_STATICS_FOR_CLASS(KtPropertyInfo)
JNI_INIT_STATICS_FOR_CLASS(KtProperty)

KtPropertyInfo::KtPropertyInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader) :
  JavaInstanceWrapper("godot.core.KtPropertyInfo", p_wrapped, p_class_loader) {
    jni::Env env {jni::Jvm::current_env()};

    jni::MethodId getTypeMethod {get_method_id(env, jni_methods.GET_TYPE)};
    type = static_cast<Variant::Type>(wrapped.call_int_method(env, getTypeMethod));

    jni::MethodId getNameMethod {get_method_id(env, jni_methods.GET_NAME)};
    jni::JString jname = wrapped.call_object_method(env, getNameMethod);
    name = env.from_jstring(jname);

    jni::MethodId getClassNameMethod {get_method_id(env, jni_methods.GET_CLASS_NAME)};
    jni::JString jclass_name = wrapped.call_object_method(env, getClassNameMethod);
    class_name = env.from_jstring(jclass_name);

    jni::MethodId getPropertyHintMethod {get_method_id(env, jni_methods.GET_HINT)};
    hint = static_cast<PropertyHint>(wrapped.call_int_method(env, getPropertyHintMethod));

    jni::MethodId getHintStringMethod {get_method_id(env, jni_methods.GET_HINT_STRING)};
    jni::JString jhint_string = wrapped.call_object_method(env, getHintStringMethod);
    hint_string = env.from_jstring(jhint_string);

    jni::MethodId getVisibleInEditorMethod {get_method_id(env, jni_methods.GET_VISIBLE_IN_EDITOR)};
    visible_in_editor = wrapped.call_boolean_method(env, getVisibleInEditorMethod);

    jhint_string.delete_local_ref(env);
    jclass_name.delete_local_ref(env);
    jname.delete_local_ref(env);
    p_wrapped.delete_local_ref(env);
}

PropertyInfo KtPropertyInfo::toPropertyInfo() {
    PropertyInfo info;
    info.type = type;
    info.name = name;
    info.class_name = class_name;
    info.hint = hint;
    info.hint_string = hint_string;
    if (visible_in_editor) {
        info.usage = PropertyUsageFlags::PROPERTY_USAGE_DEFAULT;
    } else {
        info.usage = PropertyUsageFlags::PROPERTY_USAGE_NO_EDITOR;
    }
    return info;
}

KtProperty::KtProperty(jni::JObject p_wrapped, jni::JObject& p_class_loader) :
  JavaInstanceWrapper("godot.core.KtProperty", p_wrapped, p_class_loader) {
    jni::Env env {jni::Jvm::current_env()};
    jni::MethodId getKtPropertyInfoMethod {get_method_id(env, jni_methods.GET_KT_PROPERTY_INFO)};
    propertyInfo = new KtPropertyInfo(wrapped.call_object_method(env, getKtPropertyInfoMethod), ClassLoader::get_default_loader());
    jni::MethodId getIsRefMethod {get_method_id(env, jni_methods.IS_REF)};
    is_ref = wrapped.call_boolean_method(env, getIsRefMethod);
    p_wrapped.delete_local_ref(env);
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

void KtProperty::call_get(KtObject* instance, Variant& r_ret) {
    jni::Env env {jni::Jvm::current_env()};
    jni::MethodId get_call_method_id {get_method_id(env, jni_methods.CALL_GET)};
    jvalue call_args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    wrapped.call_void_method(env, get_call_method_id, call_args);
    GDKotlin::get_instance().transfer_context->read_return_value(env, r_ret);
}

void KtProperty::call_set(KtObject* instance, const Variant& p_value) {
    jni::Env env {jni::Jvm::current_env()};
    jni::MethodId setCallMethodId {get_method_id(env, jni_methods.CALL_SET)};
    const Variant* arg[1] = {&p_value};
    GDKotlin::get_instance().transfer_context->write_args(env, arg, 1);
    jvalue args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    wrapped.call_void_method(env, setCallMethodId, args);
}

#ifdef TOOLS_ENABLED
void KtProperty::safe_call_get(KtObject* instance, Variant& r_ret) {
    jni::Env env {jni::Jvm::current_env()};
    jni::MethodId get_call_method_id {get_method_id(env, jni_methods.CALL_GET)};
    jvalue call_args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    wrapped.call_void_method_noexcept(env, get_call_method_id, call_args);
    if (env.exception_check()) {
        Callable::CallError error;
        Variant::construct(propertyInfo->type, r_ret, {}, 0, error);
        env.exception_clear();
        return;
    }
    GDKotlin::get_instance().transfer_context->read_return_value(env, r_ret);
}
#endif
