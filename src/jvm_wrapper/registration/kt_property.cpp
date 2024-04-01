#include "kt_property.h"

#include "gd_kotlin.h"
#include "jni/class_loader.h"

// clang-format off




// clang-format on

KtPropertyInfo::KtPropertyInfo(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {
    jni::Env env {jni::Jvm::current_env()};


    type = static_cast<Variant::Type>(wrapped.call_int_method(env, GET_TYPE));

    jni::JString jname = CALL_JVM_METHOD(env, GET_NAME);
    name = env.from_jstring(jname);

    jni::JString jclass_name = CALL_JVM_METHOD(env, GET_CLASS_NAME);
    class_name = env.from_jstring(jclass_name);

    hint = static_cast<PropertyHint>(wrapped.call_int_method(env, GET_HINT));

    jni::JString jhint_string = CALL_JVM_METHOD(env, GET_HINT_STRING);
    hint_string = env.from_jstring(jhint_string);

    visible_in_editor = wrapped.call_boolean_method(env, GET_VISIBLE_IN_EDITOR);

    jhint_string.delete_local_ref(env);
    jclass_name.delete_local_ref(env);
    jname.delete_local_ref(env);
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

KtProperty::KtProperty(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {
    jni::Env env {jni::Jvm::current_env()};
    propertyInfo = new KtPropertyInfo(CALL_JVM_METHOD(env, GET_KT_PROPERTY_INFO));
    is_ref = wrapped.call_boolean_method(env, IS_REF);
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
    jvalue call_args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    wrapped.call_void_method(env, CALL_GET, call_args);
    GDKotlin::get_instance().transfer_context->read_return_value(env, r_ret);
}

void KtProperty::call_set(KtObject* instance, const Variant& p_value) {
    jni::Env env {jni::Jvm::current_env()};
    const Variant* arg[1] = {&p_value};
    GDKotlin::get_instance().transfer_context->write_args(env, arg, 1);
    jvalue args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    wrapped.call_void_method(env, CALL_SET, args);
}

#ifdef TOOLS_ENABLED
void KtProperty::safe_call_get(KtObject* instance, Variant& r_ret) {
    jni::Env env {jni::Jvm::current_env()};
    jvalue call_args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    wrapped.call_void_method_noexcept(env, CALL_GET, call_args);
    if (env.exception_check()) {
        Callable::CallError error;
        Variant::construct(propertyInfo->type, r_ret, {}, 0, error);
        env.exception_clear();
        return;
    }
    GDKotlin::get_instance().transfer_context->read_return_value(env, r_ret);
}
#endif
