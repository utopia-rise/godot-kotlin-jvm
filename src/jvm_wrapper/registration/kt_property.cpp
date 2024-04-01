#include "kt_property.h"

#include "gd_kotlin.h"
#include "jni/class_loader.h"

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    KtPropertyInfo,
    INIT_JNI_METHOD(GET_TYPE)
    INIT_JNI_METHOD(GET_NAME)
    INIT_JNI_METHOD(GET_CLASS_NAME)
    INIT_JNI_METHOD(GET_HINT)
    INIT_JNI_METHOD(GET_HINT_STRING)
    INIT_JNI_METHOD(GET_VISIBLE_IN_EDITOR)
)

JNI_INIT_STATICS_FOR_CLASS(
    KtProperty,
    INIT_JNI_METHOD(GET_KT_PROPERTY_INFO)
    INIT_JNI_METHOD(IS_REF)
    INIT_JNI_METHOD(CALL_GET)
    INIT_JNI_METHOD(CALL_SET)
)

// clang-format on

KtPropertyInfo::KtPropertyInfo(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {
    jni::Env env {jni::Jvm::current_env()};

    jni::MethodId getTypeMethod {jni_methods.GET_TYPE.method_id};
    type = static_cast<Variant::Type>(wrapped.call_int_method(env, getTypeMethod));

    jni::MethodId getNameMethod {jni_methods.GET_NAME.method_id};
    jni::JString jname = wrapped.call_object_method(env, getNameMethod);
    name = env.from_jstring(jname);

    jni::MethodId getClassNameMethod {jni_methods.GET_CLASS_NAME.method_id};
    jni::JString jclass_name = wrapped.call_object_method(env, getClassNameMethod);
    class_name = env.from_jstring(jclass_name);

    jni::MethodId getPropertyHintMethod {jni_methods.GET_HINT.method_id};
    hint = static_cast<PropertyHint>(wrapped.call_int_method(env, getPropertyHintMethod));

    jni::MethodId getHintStringMethod {jni_methods.GET_HINT_STRING.method_id};
    jni::JString jhint_string = wrapped.call_object_method(env, getHintStringMethod);
    hint_string = env.from_jstring(jhint_string);

    jni::MethodId getVisibleInEditorMethod {jni_methods.GET_VISIBLE_IN_EDITOR.method_id};
    visible_in_editor = wrapped.call_boolean_method(env, getVisibleInEditorMethod);

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
    jni::MethodId getKtPropertyInfoMethod {jni_methods.GET_KT_PROPERTY_INFO.method_id};
    propertyInfo = new KtPropertyInfo(wrapped.call_object_method(env, getKtPropertyInfoMethod));
    jni::MethodId getIsRefMethod {jni_methods.IS_REF.method_id};
    is_ref = wrapped.call_boolean_method(env, getIsRefMethod);
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
    jni::MethodId get_call_method_id {jni_methods.CALL_GET.method_id};
    jvalue call_args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    wrapped.call_void_method(env, get_call_method_id, call_args);
    GDKotlin::get_instance().transfer_context->read_return_value(env, r_ret);
}

void KtProperty::call_set(KtObject* instance, const Variant& p_value) {
    jni::Env env {jni::Jvm::current_env()};
    jni::MethodId setCallMethodId {jni_methods.CALL_SET.method_id};
    const Variant* arg[1] = {&p_value};
    GDKotlin::get_instance().transfer_context->write_args(env, arg, 1);
    jvalue args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    wrapped.call_void_method(env, setCallMethodId, args);
}

#ifdef TOOLS_ENABLED
void KtProperty::safe_call_get(KtObject* instance, Variant& r_ret) {
    jni::Env env {jni::Jvm::current_env()};
    jni::MethodId get_call_method_id {jni_methods.CALL_GET.method_id};
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
