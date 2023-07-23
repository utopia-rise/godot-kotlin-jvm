#ifndef GODOT_JVM_GP_PRINT_BRIDGE_H
#define GODOT_JVM_GP_PRINT_BRIDGE_H

#include "java_instance_wrapper.h"

namespace bridges {

    class GDPrintBridge : public JavaInstanceWrapper {
    public:
        GDPrintBridge(jni::JObject p_wrapped);
        ~GDPrintBridge() = default;

        static void print(JNIEnv* p_raw_env, jobject p_instance);
        static void print_err(JNIEnv* p_raw_env, jobject p_instance);
        static void print_raw(JNIEnv* p_raw_env, jobject p_instance);

        // clang-format off
    DECLARE_JNI_METHODS()
        // clang-format on
    };

}// namespace bridges

#endif// GODOT_JVM_GP_PRINT_BRIDGE_H
