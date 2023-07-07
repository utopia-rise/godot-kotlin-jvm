#ifndef GODOT_JVM_CALLABLE_BRIDGE_H
#define GODOT_JVM_CALLABLE_BRIDGE_H

#include "java_instance_wrapper.h"

namespace bridges {
    class CallableBridge : public JavaInstanceWrapper<CallableBridge> {
    private:
        struct StringNames {
            StringName func_rpc;
            StringName func_rpc_id;
        };

        static StringNames string_names;

    public:
        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);

        static uintptr_t engine_call_constructor_object_string_name(JNIEnv* p_raw_env, jobject p_instance);

        static uintptr_t engine_call_constructor_kt_custom_callable(JNIEnv* p_raw_env, jobject p_instance, jobject p_kt_custom_callable_instance);

        static uintptr_t engine_call_copy_constructor(JNIEnv* p_raw_env, jobject p_instance);

        static void engine_call_bind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_bindv(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_call(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_call_deferred(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_callv(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_get_bound_arguments(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_get_bound_arguments_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_get_method(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_get_object(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_get_object_id(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_hash(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_is_custom(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_is_null(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_is_standard(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_is_valid(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_rpc(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_rpc_id(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_unbind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        CallableBridge(jni::JObject p_wrapped, jni::JObject p_class_loader);
        ~CallableBridge() = default;

        // clang-format off
        DECLARE_JNI_METHODS()
        // clang-format on
    };
}// namespace bridges

#endif// GODOT_JVM_CALLABLE_BRIDGE_H
