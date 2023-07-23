#ifndef GODOT_JVM_STRING_NAME_BRIDGE_H
#define GODOT_JVM_STRING_NAME_BRIDGE_H

#include "java_instance_wrapper.h"

namespace bridges {
    class StringNameBridge : public JavaInstanceWrapper<StringNameBridge> {
    public:
        StringNameBridge(jni::JObject p_wrapped);
        ~StringNameBridge() = default;

        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);
        static uintptr_t engine_call_copy_constructor(JNIEnv* p_raw_env, jobject p_instance);
        static uintptr_t engine_call_constructor_string(JNIEnv* p_raw_env, jobject p_instance);

        static void engine_call_operator_string(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        // clang-format off
        DECLARE_JNI_METHODS()
        // clang-format on
    };
}// namespace bridges

#endif// GODOT_JVM_STRING_NAME_BRIDGE_H
