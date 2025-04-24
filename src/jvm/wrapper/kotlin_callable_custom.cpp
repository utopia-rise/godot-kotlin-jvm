#include "kotlin_callable_custom.h"

#include "godot_jvm.h"
#include "jvm/wrapper/memory/transfer_context.h"

void LambdaCallable::invoke(jni::Env& p_env, const godot::Variant** p_args, int args_count, godot::Variant& r_ret) const {
    TransferContext& transfer_context{TransferContext::get_instance()};
    transfer_context.write_args(p_env, p_args, args_count);

    if (has_return_value) {
        jni::JObject ret{wrapped.call_object_method<false>(p_env, INVOKE_WITH_RETURN)};
        transfer_context.read_return_value(p_env, r_ret);
        ret.delete_local_ref(p_env);

        return;
    }

    wrapped.call_void_method<false>(p_env, INVOKE_NO_RETURN);

    has_been_called = true;
}

void LambdaCallable::on_destroy(jni::Env& p_env) const {
    if (!has_on_cancel || has_been_called) {
        return;
    }

    wrapped.call_void_method<false>(p_env, ON_CANCEL);
}

int LambdaCallable::get_hash_code() const {
    return hash_code;
}

bool LambdaCallable::equals(const LambdaCallable& other) const {
    jni::Env env{jni::Jvm::current_env()};
    return wrapped.is_same_object(env, other.wrapped);
}

LambdaCallable::LambdaCallable(jni::Env& p_env, jni::JObject p_wrapped, godot::Variant::Type return_type, int p_hash_code,
                               bool p_has_on_cancel) : JvmInstanceWrapper(p_env, p_wrapped) {
    has_return_value = return_type != godot::Variant::NIL;

    hash_code = p_hash_code;
    has_on_cancel = p_has_on_cancel;
    has_been_called = false;
}


void KotlinCallableCustom::call(const godot::Variant** p_arguments, int p_argcount, godot::Variant& r_return_value,
                                Callable::CallError& r_call_error) const {
    jni::Env env{jni::Jvm::current_env()};
    kt_callable.invoke(env, p_arguments, p_argcount, r_return_value);
}

uint32_t KotlinCallableCustom::hash() const {
    return kt_callable.get_hash_code();
}

godot::String KotlinCallableCustom::get_as_text() const {
    return "KotlinCallableCustom::invoke";
}

ObjectID KotlinCallableCustom::get_object() const {
    return GodotJvm::get_instance().get_callable_middleman()->get_instance_id();
}

CallableCustom::CompareEqualFunc KotlinCallableCustom::get_compare_equal_func() const {
    return &KotlinCallableCustom::compare_equal;
}

CallableCustom::CompareLessFunc KotlinCallableCustom::get_compare_less_func() const {
    return &KotlinCallableCustom::compare_less;
}

bool KotlinCallableCustom::compare_equal(const CallableCustom* p_a, const CallableCustom* p_b) {
    auto a{dynamic_cast<const KotlinCallableCustom*>(p_a)};
    auto b{dynamic_cast<const KotlinCallableCustom*>(p_b)};

    if (!a || !b) {
        return false;
    }

    return a->kt_callable.equals(b->kt_callable);
}

bool KotlinCallableCustom::compare_less(const CallableCustom* p_a, const CallableCustom* p_b) {
    return !compare_equal(p_a, p_b) && p_a < p_b;
}

KotlinCallableCustom::KotlinCallableCustom(jni::Env& p_env, jni::JObject p_wrapped, godot::Variant::Type return_type,
                                           int p_hash_code, bool p_has_on_destroy) : CallableCustom(),
                                                                                     kt_callable(p_env, p_wrapped,
                                                                                                 return_type,
                                                                                                 p_hash_code,
                                                                                                 p_has_on_destroy) {

}

KotlinCallableCustom::~KotlinCallableCustom() {
    jni::Env env{jni::Jvm::current_env()};
    kt_callable.on_destroy(env);
}
