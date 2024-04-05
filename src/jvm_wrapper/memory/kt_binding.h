#ifndef GODOT_JVM_KT_BINDING_H
#define GODOT_JVM_KT_BINDING_H

#include "jni/wrapper.h"
#include "jvm_wrapper/jvm_instance_wrapper.h"

JVM_INSTANCE_WRAPPER(KtBinding, "godot.core.memory.GodotBinding") {
public:
    explicit KtBinding(jni::Env& p_env, jni::JObject p_wrapped);
    ~KtBinding();
};

#endif// GODOT_JVM_KT_BINDING_H
