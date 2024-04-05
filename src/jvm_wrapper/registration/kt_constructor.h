#ifndef GODOT_JVM_KT_CONSTRUCTOR_H
#define GODOT_JVM_KT_CONSTRUCTOR_H

#include "jvm_wrapper/jvm_instance_wrapper.h"
#include "kt_object.h"

JVM_INSTANCE_WRAPPER(KtConstructor, "godot.core.KtConstructor") {
    // clang-format off
    JNI_METHOD(GET_PARAMETER_COUNT)
    JNI_METHOD(CONSTRUCT)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(GET_PARAMETER_COUNT, "getParameterCount", "()I")
        INIT_JNI_METHOD(CONSTRUCT, "construct", "(JJ)Lgodot/core/KtObject;")
    )
    // clang-format on

public:
    explicit KtConstructor(jni::Env& p_env, jni::JObject p_wrapped);
    ~KtConstructor() = default;
    KtObject* create_instance(jni::Env& env, const Variant** p_args, Object* p_owner);

private:
    int parameter_count;
};

#endif// GODOT_JVM_KT_CONSTRUCTOR_H
