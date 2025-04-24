#ifndef GODOT_JVM_JVM_MANAGER_H
#define GODOT_JVM_JVM_MANAGER_H

#include "class_loader.h"
#include "jvm/jni/env.h"
#include "jvm_options.h"
#include "jvm_user_configuration.h"

#if defined WINDOWS_ENABLED || defined X11_ENABLED || defined MACOS_ENABLED
#define DYNAMIC_JVM
#elif defined __ANDROID__
#define PROVIDED_JVM
#elif defined IOS_ENABLED
#define STATIC_JVM
#endif

class JvmManager {
public:
    static bool initialize_or_get_jvm(void* lib_handle, JvmUserConfiguration& user_configuration, JvmOptions& jvm_options);
    static bool initialize_jvm_wrappers(jni::Env& p_env, ClassLoader* class_loader);
    static void finalize_jvm_wrappers(jni::Env& p_env, ClassLoader* class_loader);
    static void close_jvm();
};

#endif// GODOT_JVM_JVM_MANAGER_H
