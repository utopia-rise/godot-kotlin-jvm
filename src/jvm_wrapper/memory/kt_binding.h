#ifndef GODOT_JVM_KT_BINDING_H
#define GODOT_JVM_KT_BINDING_H

#include "jni/wrapper.h"
#include "jvm_wrapper/jvm_instance_wrapper.h"

class KtBinding : public JvmInstanceWrapper {
public:
    explicit KtBinding(jni::JObject p_wrapped);
    ~KtBinding();
};

#endif// GODOT_JVM_KT_BINDING_H
