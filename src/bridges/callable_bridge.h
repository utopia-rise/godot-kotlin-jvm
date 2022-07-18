#ifndef GODOT_JVM_CALLABLE_BRIDGE_H
#define GODOT_JVM_CALLABLE_BRIDGE_H


#include <modules/kotlin_jvm/src/java_instance_wrapper.h>

namespace bridges {
    class CallableBridge : public JavaInstanceWrapper<CallableBridge> {
    public:
        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);

        static uintptr_t engine_call_constructor_object_string_name(JNIEnv* p_raw_env, jobject p_instance);

        static uintptr_t
        engine_call_constructor_kt_custom_callable(JNIEnv* p_raw_env, jobject p_instance,
                                                   jobject p_kt_custom_callable_instance);

        static uintptr_t engine_call_copy_constructor(JNIEnv* p_raw_env, jobject p_instance);

        static void engine_call_call(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_call_deferred(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        CallableBridge(jni::JObject p_wrapped, jni::JObject p_class_loader);
        ~CallableBridge() = default;

        DECLARE_JNI_METHODS()
    };
}


#endif //GODOT_JVM_CALLABLE_BRIDGE_H
