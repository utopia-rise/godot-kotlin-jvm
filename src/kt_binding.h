#ifndef GODOT_JVM_KT_BINDING_H
#define GODOT_JVM_KT_BINDING_H

#include "java_instance_wrapper.h"
#include "jni/wrapper.h"

class KtBinding : public JavaInstanceWrapper {
public:
    KtBinding(jni::JObject p_wrapped);
    ~KtBinding();
};

#endif// GODOT_JVM_KT_BINDING_H
