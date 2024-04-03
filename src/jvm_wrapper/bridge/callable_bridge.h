#ifndef GODOT_JVM_CALLABLE_BRIDGE_H
#define GODOT_JVM_CALLABLE_BRIDGE_H

#include "jvm_wrapper/jvm_singleton_wrapper.h"

namespace bridges {
    JVM_SINGLETON_WRAPPER(CallableBridge, "godot.core.Callable$Bridge") {
        SINGLETON_CLASS(CallableBridge)

        // clang-format off
        INIT_JNI_BINDINGS(
            INIT_NATIVE_METHOD("engine_call_constructor", "()J", CallableBridge::engine_call_constructor)
            INIT_NATIVE_METHOD("engine_call_constructor_object_string_name", "()J", CallableBridge::engine_call_constructor_object_string_name)
            //INIT_NATIVE_METHOD("engine_call_constructor_kt_custom_callable", "(Lgodot/core/KtCustomCallable;)J", CallableBridge::engine_call_constructor_kt_custom_callable)
            INIT_NATIVE_METHOD("engine_call_copy_constructor", "()J", CallableBridge::engine_call_copy_constructor)
            INIT_NATIVE_METHOD("engine_call_bind", "(J)V", CallableBridge::engine_call_bind)
            INIT_NATIVE_METHOD("engine_call_bindv", "(J)V", CallableBridge::engine_call_bindv)
            INIT_NATIVE_METHOD("engine_call_call", "(J)V", CallableBridge::engine_call_call)
            INIT_NATIVE_METHOD("engine_call_call_deferred", "(J)V", CallableBridge::engine_call_call_deferred)
            INIT_NATIVE_METHOD("engine_call_callv", "(J)V", CallableBridge::engine_call_callv)
            INIT_NATIVE_METHOD("engine_call_get_bound_arguments", "(J)V", CallableBridge::engine_call_get_bound_arguments)
            INIT_NATIVE_METHOD("engine_call_get_bound_arguments_count", "(J)V", CallableBridge::engine_call_get_bound_arguments_count)
            INIT_NATIVE_METHOD("engine_call_get_method", "(J)V", CallableBridge::engine_call_get_method)
            INIT_NATIVE_METHOD("engine_call_get_object", "(J)V", CallableBridge::engine_call_get_object)
            INIT_NATIVE_METHOD("engine_call_get_object_id", "(J)V", CallableBridge::engine_call_get_object_id)
            INIT_NATIVE_METHOD("engine_call_hash", "(J)V", CallableBridge::engine_call_hash)
            INIT_NATIVE_METHOD("engine_call_is_custom", "(J)V", CallableBridge::engine_call_is_custom)
            INIT_NATIVE_METHOD("engine_call_is_null", "(J)V",CallableBridge::engine_call_is_null)
            INIT_NATIVE_METHOD("engine_call_is_standard", "(J)V", CallableBridge::engine_call_is_standard)
            INIT_NATIVE_METHOD("engine_call_is_valid", "(J)V", CallableBridge::engine_call_is_valid)
            INIT_NATIVE_METHOD("engine_call_rpc", "(J)V", CallableBridge::engine_call_rpc)
            INIT_NATIVE_METHOD("engine_call_rpc_id", "(J)V",CallableBridge::engine_call_rpc_id)
            INIT_NATIVE_METHOD("engine_call_unbind", "(J)V", CallableBridge::engine_call_unbind)
        )
        // clang-format on

    public:
        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);

        static uintptr_t engine_call_constructor_object_string_name(JNIEnv* p_raw_env, jobject p_instance);

        //TODO: Enable that code again when KtCustomCallable is back
        //static uintptr_t engine_call_constructor_kt_custom_callable(JNIEnv* p_raw_env, jobject p_instance, jobject p_kt_custom_callable_instance);

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
    };
}// namespace bridge

#endif// GODOT_JVM_CALLABLE_BRIDGE_H
