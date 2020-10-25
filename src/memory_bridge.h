#ifndef GODOT_JVM_MEMORY_BRIDGE_H
#define GODOT_JVM_MEMORY_BRIDGE_H


#include <jni.h>

class MemoryBridge {
    static bool check_instance(JNIEnv p_raw_env, jobject p_instance, jlong p_raw_ptr);
    static void unref(JNIEnv p_raw_env, jobject p_instance, jlong p_raw_ptr);
};


#endif //GODOT_JVM_MEMORY_BRIDGE_H
