#include "kt_custom_callable.h"

#include "gd_kotlin.h"
#include "kotlin_language.h"

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    KtCustomCallable,
    INIT_JNI_METHOD(SEND_TARGET_TO_NATIVE)
    INIT_JNI_METHOD(CALL_TARGETED)
    INIT_JNI_METHOD(CALL_NOT_TARGETED)
    INIT_JNI_METHOD(HASHCODE)
    INIT_JNI_METHOD(EQUALS)
)

// clang-format on

uint32_t KtCustomCallable::hash() const {
    return hashcode;
}

String KtCustomCallable::get_as_text() const {
    return "KtCustomCallable::call";
}

CallableCustom::CompareEqualFunc KtCustomCallable::get_compare_equal_func() const {
    return &KtCustomCallable::compare_equal;
}

CallableCustom::CompareLessFunc KtCustomCallable::get_compare_less_func() const {
    return &KtCustomCallable::compare_less;
}

ObjectID KtCustomCallable::get_object() const {
    static ObjectID custom_callable_middleman_id {KotlinLanguage::get_instance()->get_custom_callable_middleman()->get_instance_id()};
    if (target) {
        return target->get_instance_id();
    } else {
        return custom_callable_middleman_id;
    }
}

void KtCustomCallable::call(const Variant** p_arguments, int p_argcount, Variant& r_return_value, Callable::CallError& r_call_error) const {
    r_call_error.error = Callable::CallError::CALL_ERROR_INVALID_METHOD;
    r_return_value = Variant();

    jni::Env env {jni::Jvm::current_env()};
    if (target) {
        jni::MethodId call_targeted_method_id {jni_methods.CALL_TARGETED.method_id};
        TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
        transfer_context->write_args(env, p_arguments, p_argcount);
        wrapped.call_void_method(env, call_targeted_method_id);
        transfer_context->read_return_value(env, r_return_value);
    } else {
        jni::MethodId call_non_targeted_method_id {jni_methods.CALL_NOT_TARGETED.method_id};
        wrapped.call_void_method(env, call_non_targeted_method_id);
        GDKotlin::get_instance().transfer_context->read_return_value(env, r_return_value);
    }
}

bool KtCustomCallable::compare_equal(const CallableCustom* p_a, const CallableCustom* p_b) {
    const auto* delegate_a {static_cast<const KtCustomCallable*>(p_a)};
    const auto* delegate_b {static_cast<const KtCustomCallable*>(p_b)};

    if (delegate_a == delegate_b) { return true; }

    jni::Env env {jni::Jvm::current_env()};
    if (env.is_same_object(delegate_a->wrapped, delegate_b->wrapped)) { return true; }
    return delegate_a->equals(delegate_b);
}

bool KtCustomCallable::compare_less(const CallableCustom* p_a, const CallableCustom* p_b) {
    if (compare_equal(p_a, p_b)) { return false; }
    return p_a < p_b;
}

bool KtCustomCallable::equals(const KtCustomCallable* other) const {
    jni::Env env {jni::Jvm::current_env()};
    jni::MethodId equal_method_id {jni_methods.EQUALS.method_id};
    jvalue equal_args[1] = {jni::to_jni_arg(other->wrapped)};
    return static_cast<bool>(wrapped.call_boolean_method(env, equal_method_id, equal_args));
}

KtCustomCallable::KtCustomCallable(jni::JObject p_wrapped) : JavaInstanceWrapper(p_wrapped) {
    jni::Env env {jni::Jvm::current_env()};
    jni::MethodId hashcode_method_id {jni_methods.HASHCODE.method_id};
    hashcode = p_wrapped.call_int_method(env, hashcode_method_id);

    jni::MethodId send_target_to_native_method_id {jni_methods.SEND_TARGET_TO_NATIVE.method_id};
    p_wrapped.call_void_method(env, send_target_to_native_method_id);
    Variant ret;
    GDKotlin::get_instance().transfer_context->read_return_value(env, ret);
    target = ret;
}