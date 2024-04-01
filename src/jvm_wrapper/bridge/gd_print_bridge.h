#ifndef GODOT_JVM_GP_PRINT_BRIDGE_H
#define GODOT_JVM_GP_PRINT_BRIDGE_H

#include "jvm_wrapper/jvm_singleton_wrapper.h"

namespace bridges {

    JVM_SINGLETON_WRAPPER(GDPrintBridge, "godot.global.GDPrint$Bridge") {
        SINGLETON_CLASS(GDPrintBridge)

        // clang-format off
        INIT_JNI_BINDINGS(
            INIT_NATIVE_METHOD("print", "()V", GDPrintBridge::print)
            INIT_NATIVE_METHOD("printErr", "()V", GDPrintBridge::print_err)
            INIT_NATIVE_METHOD("printRaw", "()V", GDPrintBridge::print_raw)
          )
        // clang-format on

    public:
        static void print(JNIEnv* p_raw_env, jobject p_instance);
        static void print_err(JNIEnv* p_raw_env, jobject p_instance);
        static void print_raw(JNIEnv* p_raw_env, jobject p_instance);
    };

}// namespace bridge

#endif// GODOT_JVM_GP_PRINT_BRIDGE_H
