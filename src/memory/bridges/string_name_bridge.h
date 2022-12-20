#ifndef GODOT_JVM_STRING_NAME_BRIDGE_H
#define GODOT_JVM_STRING_NAME_BRIDGE_H


#include "java_instance_wrapper.h"

namespace bridges {
    class StringNameBridge : public JavaInstanceWrapper<StringNameBridge> {
    public:
        StringNameBridge(jni::JObject p_wrapped, jni::JObject p_class_loader);
        ~StringNameBridge() = default;

        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);
        static uintptr_t engine_call_copy_constructor(JNIEnv* p_raw_env, jobject p_instance);
        static uintptr_t engine_call_constructor_string(JNIEnv* p_raw_env, jobject p_instance);

        // clang-format off
        DECLARE_JNI_METHODS()
        // clang-format on
    };
}


#endif //GODOT_JVM_STRING_NAME_BRIDGE_H
