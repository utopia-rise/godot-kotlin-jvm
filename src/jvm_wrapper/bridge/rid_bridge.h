#ifndef GODOT_JVM_RIDBRIDGE_H
#define GODOT_JVM_RIDBRIDGE_H

#include "jvm_wrapper/jvm_singleton_wrapper.h"

namespace bridges {

    JVM_SINGLETON_WRAPPER(RidBridge, "godot.core.Rid$Bridge") {
        SINGLETON_CLASS(RidBridge)

        // clang-format off
        INIT_JNI_BINDINGS(
            INIT_NATIVE_METHOD("engine_call_constructor","()J", RidBridge::engine_call_constructor)
            INIT_NATIVE_METHOD("engine_call_constructor","(J)J", RidBridge::engine_call_constructor_arg)
            INIT_NATIVE_METHOD("engine_call_getID", ("(J)V"), RidBridge::engine_call_getID)
            INIT_NATIVE_METHOD("engine_call_isValid","(J)V", RidBridge::engine_call_isValid)
            INIT_NATIVE_METHOD("engine_call_compareTo","(J)V", RidBridge::engine_call_compareTo)
            INIT_NATIVE_METHOD("engine_call_equals", ("(J)V"), RidBridge::engine_call_equals)
          )
        // clang-format on

    public:

        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);
        static uintptr_t engine_call_constructor_arg(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_getID(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_isValid(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_compareTo(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_equals(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
    };
}// namespace bridge

#endif// GODOT_JVM_RIDBRIDGE_H
