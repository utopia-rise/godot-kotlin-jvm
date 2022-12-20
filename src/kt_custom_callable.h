#ifndef GODOT_JVM_KT_CUSTOM_CALLABLE_H
#define GODOT_JVM_KT_CUSTOM_CALLABLE_H

#include "java_instance_wrapper.h"

class KtCustomCallable : public JavaInstanceWrapper<KtCustomCallable>,
                         public CallableCustom {
public:
    uint32_t hash() const override;
    String get_as_text() const override;
    CompareEqualFunc get_compare_equal_func() const override;
    CompareLessFunc get_compare_less_func() const override;
    ObjectID get_object() const override;
    void call(const Variant** p_arguments, int p_argcount, Variant& r_return_value, Callable::CallError& r_call_error) const override;

    static bool compare_equal(const CallableCustom* p_a, const CallableCustom* p_b);
    static bool compare_less(const CallableCustom* p_a, const CallableCustom* p_b);

    KtCustomCallable(jni::JObject p_wrapped, jni::JObject p_class_loader);
    ~KtCustomCallable() = default;

private:
    int hashcode;
    Object* target;

    bool equals(const KtCustomCallable* other) const;

    // clang-format off
    DECLARE_JNI_METHODS(
                JNI_METHOD(SEND_TARGET_TO_NATIVE, "sendTargetToNative", "()V")
                JNI_METHOD(CALL_TARGETED, "callTargeted", "()V")
                JNI_METHOD(CALL_NOT_TARGETED, "callNotTargeted", "()V")
                JNI_METHOD(HASHCODE, "hashcode", "()I")
                JNI_METHOD(EQUALS, "equals", "(Ljava/lang/Object;)Z")
        )
    // clang-format on
};

#endif// GODOT_JVM_KT_CUSTOM_CALLABLE_H
