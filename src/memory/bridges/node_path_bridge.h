#ifndef GODOT_JVM_NODE_PATH_BRIDGE_H
#define GODOT_JVM_NODE_PATH_BRIDGE_H

#include "java_instance_wrapper.h"

namespace bridges {

    class NodePathBridge : JavaInstanceWrapper {
    public:
        NodePathBridge(jni::JObject p_wrapped);
        ~NodePathBridge() = default;

        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);
        static uintptr_t engine_call_constructor_string(JNIEnv* p_raw_env, jobject p_instance);
        static uintptr_t engine_call_constructor_node_path(JNIEnv* p_raw_env, jobject p_instance);

        static void engine_call_path(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_getAsPropertyPath(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_getName(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_getNameCount(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_getSubname(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_getSubnameCount(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_isAbsolute(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_hash(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_isEmpty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_getConcatenatedNames(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_getConcatenatedSubnames(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_equals(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        // clang-format off
        DECLARE_JNI_METHODS()
        // clang-format on
    };
}// namespace bridges

#endif// GODOT_JVM_NODE_PATH_BRIDGE_H
