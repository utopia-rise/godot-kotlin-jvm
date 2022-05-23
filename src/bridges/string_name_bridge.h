#ifndef GODOT_JVM_STRING_NAME_BRIDGE_H
#define GODOT_JVM_STRING_NAME_BRIDGE_H


#include <modules/kotlin_jvm/src/java_instance_wrapper.h>

namespace bridges {
    class StringNameBridge : public JavaInstanceWrapper<StringNameBridge> {
    public:
        StringNameBridge(jni::JObject p_wrapped, jni::JObject p_class_loader);
        ~StringNameBridge() = default;

        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance, jint param_type);

        DECLARE_JNI_METHODS()
    };
}


#endif //GODOT_JVM_STRING_NAME_BRIDGE_H
