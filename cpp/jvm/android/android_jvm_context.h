#ifndef GODOT_JVM_ANDROID_JVM_CONTEXT_H
#define GODOT_JVM_ANDROID_JVM_CONTEXT_H

#include <jni.h>

class AndroidJvmContext {
public:
    static bool initialize(JNIEnv* p_env);
    static JavaVM* get_java_vm();
};

#endif // GODOT_JVM_ANDROID_JVM_CONTEXT_H
