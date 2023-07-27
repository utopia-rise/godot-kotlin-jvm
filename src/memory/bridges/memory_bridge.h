#ifndef GODOT_JVM_MEMORY_BRIDGE_H
#define GODOT_JVM_MEMORY_BRIDGE_H

#include "java_instance_wrapper.h"
#include "jni/types.h"

#include <jni.h>

namespace bridges {

    struct MemoryBridge : public JavaInstanceWrapper {
        MemoryBridge(jni::JObject p_wrapped);

        ~MemoryBridge() = default;

        static bool check_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jlong instance_id);

        static void bind_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jobject p_object);

        static void decrement_ref_counter(JNIEnv* p_raw_env, jobject p_instance, jlong instance_id);

        static bool unref_native_core_type(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jint var_type);

        static void notify_leak(JNIEnv* p_raw_env, jobject p_instance);

        // clang-format off
        DECLARE_JNI_METHODS()
        // clang-format on
    };

}// namespace bridges

#endif// GODOT_JVM_MEMORY_BRIDGE_H
