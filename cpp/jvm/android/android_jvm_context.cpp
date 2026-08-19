#include "android_jvm_context.h"

#include <atomic>

namespace {
    std::atomic<JavaVM*> java_vm {nullptr};
}

bool AndroidJvmContext::initialize(JNIEnv* p_env) {
    JavaVM* provided_vm {nullptr};
    if (p_env == nullptr || p_env->GetJavaVM(&provided_vm) != JNI_OK || provided_vm == nullptr) { return false; }

    JavaVM* expected {nullptr};
    return java_vm.compare_exchange_strong(expected, provided_vm) || expected == provided_vm;
}

JavaVM* AndroidJvmContext::get_java_vm() {
    return java_vm.load();
}

extern "C" JNIEXPORT jboolean JNICALL
Java_com_utopiarise_godotjvm_GodotJvmPlugin_nativeInitialize(JNIEnv* p_env, jobject) {
    return AndroidJvmContext::initialize(p_env) ? JNI_TRUE : JNI_FALSE;
}
