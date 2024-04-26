#include "kt_property.h"

#include "jvm_wrapper/memory/transfer_context.h"

KtPropertyInfo::KtPropertyInfo(jni::Env& p_env, jni::JObject p_wrapped) : JvmInstanceWrapper(p_env, p_wrapped) {
    type = static_cast<Variant::Type>(wrapped.call_int_method(p_env, GET_TYPE));

    jni::JString jname {wrapped.call_object_method(p_env, GET_NAME)};
    name = p_env.from_jstring(jname);

    jni::JString jclass_name {wrapped.call_object_method(p_env, GET_CLASS_NAME)};
    class_name = p_env.from_jstring(jclass_name);

    hint = static_cast<PropertyHint>(wrapped.call_int_method(p_env, GET_HINT));

    jni::JString jhint_string {wrapped.call_object_method(p_env, GET_HINT_STRING)};
    hint_string = p_env.from_jstring(jhint_string);

    visible_in_editor = wrapped.call_boolean_method(p_env, GET_VISIBLE_IN_EDITOR);

    jhint_string.delete_local_ref(p_env);
    jclass_name.delete_local_ref(p_env);
    jname.delete_local_ref(p_env);
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

KtProperty::KtProperty(jni::Env& p_env, jni::JObject p_wrapped) : JvmInstanceWrapper(p_env, p_wrapped) {
    propertyInfo = new KtPropertyInfo(p_env, wrapped.call_object_method(p_env, GET_KT_PROPERTY_INFO));
    is_ref = wrapped.call_boolean_method(p_env, IS_REF);
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

void KtProperty::call_get(jni::Env& p_env, KtObject* instance, Variant& r_ret) {
    jvalue call_args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    wrapped.call_void_method(p_env, CALL_GET, call_args);
    TransferContext::get_instance().read_return_value(p_env, r_ret);
}

void KtProperty::call_set(jni::Env& p_env, KtObject* instance, const Variant& p_value) {
    const Variant* arg[1] = {&p_value};
    TransferContext::get_instance().write_args(p_env, arg, 1);
    jvalue args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    wrapped.call_void_method(p_env, CALL_SET, args);
}

#ifdef TOOLS_ENABLED
void KtProperty::safe_call_get(jni::Env& p_env, KtObject* instance, Variant& r_ret) {
    jvalue call_args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    wrapped.call_void_method_noexcept(p_env, CALL_GET, call_args);
    if (p_env.exception_check()) {
        Callable::CallError error;
        Variant::construct(propertyInfo->type, r_ret, {}, 0, error);
        p_env.exception_clear();
        return;
    }
    TransferContext::get_instance().read_return_value(p_env, r_ret);
}
#endif
