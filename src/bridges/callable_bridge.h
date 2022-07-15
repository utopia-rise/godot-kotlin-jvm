#ifndef GODOT_JVM_CALLABLE_BRIDGE_H
#define GODOT_JVM_CALLABLE_BRIDGE_H


#include <modules/kotlin_jvm/src/java_instance_wrapper.h>

namespace bridges {
    class CallableBridge : public JavaInstanceWrapper<CallableBridge> {
    public:
        static uintptr_t
        engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance, jint param_type,
                                jobject p_kt_custom_callable_instance, jobject p_class_loader);

        static void engine_call_call(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_call_deferred(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        CallableBridge(jni::JObject p_wrapped, jni::JObject p_class_loader);
        ~CallableBridge() = default;

        DECLARE_JNI_METHODS()
    };
}


#endif //GODOT_JVM_CALLABLE_BRIDGE_H
