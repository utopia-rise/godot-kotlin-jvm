#ifndef GODOT_JVM_JVM_MANAGER_H
#define GODOT_JVM_JVM_MANAGER_H

#include "jni/env.h"

class JvmManager {
public:
    static void initialize_jni_classes(jni::Env& p_env);
    static void destroy_jni_classes();
};

#endif// GODOT_JVM_JVM_MANAGER_H
