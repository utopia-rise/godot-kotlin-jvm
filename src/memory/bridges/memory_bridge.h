#ifndef GODOT_JVM_MEMORY_BRIDGE_H
#define GODOT_JVM_MEMORY_BRIDGE_H


#include <jni.h>
#include <modules/kotlin_jvm/src/jni/types.h>
#include <modules/kotlin_jvm/src/java_instance_wrapper.h>

namespace bridges {

    struct MemoryBridge : public JavaInstanceWrapper<MemoryBridge> {
        MemoryBridge(jni::JObject p_wrapped, jni::JObject p_class_loader);

        ~MemoryBridge() = default;

        static bool check_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jlong instance_id);

        static void bind_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jobject p_object, jobject p_class_loader);

        static void destroy_ref(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static bool unref_native_core_type(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jint var_type);

        static void notify_leak(JNIEnv* p_raw_env, jobject p_instance);
    DECLARE_JNI_METHODS()
    };

}

#endif //GODOT_JVM_MEMORY_BRIDGE_H
