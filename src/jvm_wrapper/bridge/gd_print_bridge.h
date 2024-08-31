#ifndef GODOT_JVM_GP_PRINT_BRIDGE_H
#define GODOT_JVM_GP_PRINT_BRIDGE_H

#include "jvm_wrapper/jvm_singleton_wrapper.h"

namespace bridges {

    JVM_SINGLETON_WRAPPER(GDPrintBridge, "godot.global.GDPrint$Bridge") {
        SINGLETON_CLASS(GDPrintBridge)

        // clang-format off
        JNI_METHOD(PRINT_STACKTRACE)

        INIT_JNI_BINDINGS(
            INIT_JNI_METHOD(PRINT_STACKTRACE, "getStacktrace", "()[Ljava/lang/String;")
            INIT_NATIVE_METHOD("print", "()V", GDPrintBridge::print)
            INIT_NATIVE_METHOD("printRich", "()V", GDPrintBridge::print_rich)
            INIT_NATIVE_METHOD("printVerbose", "()V", GDPrintBridge::print_verbose2)
            INIT_NATIVE_METHOD("printErr", "()V", GDPrintBridge::print_err)
            INIT_NATIVE_METHOD("printRaw", "()V", GDPrintBridge::print_raw)
            INIT_NATIVE_METHOD("pushError", "()V", GDPrintBridge::push_error)
            INIT_NATIVE_METHOD("pushWarning", "()V", GDPrintBridge::push_warning)
          )
        // clang-format on

    public:
        static void print(JNIEnv* p_raw_env, jobject p_instance);
        static void print_rich(JNIEnv* p_raw_env, jobject p_instance);
        static void print_verbose2(JNIEnv* p_raw_env, jobject p_instance); // Can't be named normally this because a godot macro of the same name is already included.
        static void print_err(JNIEnv* p_raw_env, jobject p_instance);
        static void print_raw(JNIEnv* p_raw_env, jobject p_instance);
        static void push_error(JNIEnv* p_raw_env, jobject p_instance);
        static void push_warning(JNIEnv* p_raw_env, jobject p_instance);

        // TODO: Use this method to get the JVM stacktrace when Godot will add the features to script https://github.com/godotengine/godot/pull/91006
        String get_jvm_stacktrace(jni::Env& p_env);
    };

}// namespace bridge

#endif// GODOT_JVM_GP_PRINT_BRIDGE_H
