#include "android_jvm_context.h"


static inline JavaVM* java_vm {nullptr};


JavaVM* AndroidJvmContext::get_java_vm() {
    return java_vm;
}

extern "C" JNIEXPORT jboolean JNICALL
Java_com_utopiarise_godotjvm_GodotJvmPlugin_nativeInitialize(JNIEnv* p_env, jobject) {
    p_env->GetJavaVM(&java_vm);
    return true;
}
