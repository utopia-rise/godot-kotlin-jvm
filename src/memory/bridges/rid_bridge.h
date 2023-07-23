#ifndef GODOT_JVM_RIDBRIDGE_H
#define GODOT_JVM_RIDBRIDGE_H

#include "java_instance_wrapper.h"

namespace bridges {

    class RidBridge : JavaInstanceWrapper<RidBridge> {
    public:
        RidBridge(jni::JObject p_wrapped);
        ~RidBridge() = default;

        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);
        static uintptr_t engine_call_constructor_arg(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_getID(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_isValid(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_compareTo(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_equals(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        // clang-format off
        DECLARE_JNI_METHODS()
        // clang-format on
    };
}// namespace bridges

#endif// GODOT_JVM_RIDBRIDGE_H
