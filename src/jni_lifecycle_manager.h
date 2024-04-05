#ifndef GODOT_JVM_JNI_LIFECYCLE_MANAGER_H
#define GODOT_JVM_JNI_LIFECYCLE_MANAGER_H

#include "jni/env.h"

class JniLifecycleManager {
public:
    static void initialize_jni_classes(jni::Env& p_env);
    static void destroy_jni_classes();
};

#endif// GODOT_JVM_JNI_LIFECYCLE_MANAGER_H
