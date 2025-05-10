#ifndef GODOT_JVM_KOTLIN_CALLABLE_CUSTOM_H
#define GODOT_JVM_KOTLIN_CALLABLE_CUSTOM_H

#include "jvm_wrapper/jvm_instance_wrapper.h"
#include "core/variant/callable.h"

JVM_INSTANCE_WRAPPER(LambdaCallable, "godot.core.LambdaCallable") {
    JVM_CLASS(LambdaCallable)
    // clang-format off

    JNI_VOID_METHOD(INVOKE_NO_RETURN)
    JNI_OBJECT_METHOD(INVOKE_WITH_RETURN)
    JNI_INT_METHOD(GET_RETURN_VARIANT_TYPE)
    JNI_VOID_METHOD(ON_CANCEL)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(INVOKE_NO_RETURN, "invokeNoReturn", "()V")
        INIT_JNI_METHOD(INVOKE_WITH_RETURN, "invokeWithReturn", "()Ljava/lang/Object;")
        INIT_JNI_METHOD(GET_RETURN_VARIANT_TYPE, "getReturnVariantType", "()I")
        INIT_JNI_METHOD(ON_CANCEL, "onCancel", "()V")
    )

    // clang-format on

public:
    void invoke(jni::Env& p_env, const Variant** p_args, int args_count, Variant& r_ret) const;
    void on_destroy(jni::Env& p_env) const;
    int get_hash_code() const;
    bool equals(const LambdaCallable& other) const;

    LambdaCallable(jni::Env& p_env, jni::JObject p_wrapped, Variant::Type return_type, int p_hash_code, bool p_has_on_cancel);

private:
    int hash_code;
    bool has_return_value;
    bool has_on_cancel;
    mutable bool has_been_called;
};

class KotlinCallableCustom : public CallableCustom {
public:
    void call(const Variant** p_arguments, int p_argcount, Variant& r_return_value, Callable::CallError& r_call_error) const override;

    uint32_t hash() const override;
    String get_as_text() const override;
    CompareEqualFunc get_compare_equal_func() const override;
    CompareLessFunc get_compare_less_func() const override;
    ObjectID get_object() const override;

    KotlinCallableCustom(jni::Env& p_env, jni::JObject p_wrapped, Variant::Type return_type, int p_hash_code, bool p_has_on_destroy);
    ~KotlinCallableCustom();

private:
    LambdaCallable kt_callable;

    static bool compare_equal(const CallableCustom* p_a, const CallableCustom* p_b);
    static bool compare_less(const CallableCustom* p_a, const CallableCustom* p_b);
};


#endif //GODOT_JVM_KOTLIN_CALLABLE_CUSTOM_H
