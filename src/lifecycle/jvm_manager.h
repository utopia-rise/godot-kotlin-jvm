#ifndef GODOT_JVM_JVM_MANAGER_H
#define GODOT_JVM_JVM_MANAGER_H

#include "jni/env.h"
#include "jvm_loading_configuration.h"
#include "jvm_user_configuration.h"

class JvmManager {
public:
    static void initialize_or_get_jvm(JvmUserConfiguration& user_configuration, JvmLoadingConfiguration& loading_configuration);
    static void load_bootstrap();
    static void load_usercode();
    static void initialize_jni_classes(jni::Env& p_env);
    static void destroy_jni_classes();
    static void close_jvm(JvmLoadingConfiguration& loading_configuration);
};

#endif// GODOT_JVM_JVM_MANAGER_H
