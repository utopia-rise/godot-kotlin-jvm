#ifndef GODOT_JVM_MEMORY_BRIDGE_H
#define GODOT_JVM_MEMORY_BRIDGE_H


#include <jni.h>
#include <modules/kotlin_jvm/src/jni/types.h>
#include "modules/kotlin_jvm/src/java_instance_wrapper.h"

namespace bridges {

    struct MemoryBridge : public JavaInstanceWrapper<MemoryBridge> {
        MemoryBridge(jni::JObject p_wrapped, jni::JObject p_class_loader);

        ~MemoryBridge() = default;

        static bool check_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jlong instance_id);

        static bool unref(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static bool ref(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

    DECLARE_JNI_METHODS()
    };

}

#endif //GODOT_JVM_MEMORY_BRIDGE_H
