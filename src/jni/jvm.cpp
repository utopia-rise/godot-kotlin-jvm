#include "logging.h"

#ifdef __ANDROID__
#include <platform/android/thread_jandroid.h>
#endif

#include "jni/jvm.h"

namespace jni {
    static thread_local Env* env {nullptr};
    Jvm* Jvm::_instance {nullptr};

    Jvm::Jvm(JavaVM* vm, JvmType vm_type, jint version) : vm {vm}, version {version}, vm_type {vm_type} {}

    void Jvm::initialize(JavaVM* p_vm, JvmType p_type, jint p_version) {
        _instance = new Jvm(p_vm, p_type, p_version);
    }

    void Jvm::destroy() {
        _instance->vm->DetachCurrentThread();
        _instance->vm->DestroyJavaVM();
        _instance = nullptr;
    }

    void Jvm::attach() {
        JNIEnv* r_env;
        //TODO: change for AttachCurrentThread when https://github.com/godotengine/godot/issues/95809 is resolved
#ifdef __ANDROID__
        jint result = _instance->vm->AttachCurrentThreadAsDaemon(&r_env, nullptr);
#else
        jint result = _instance->vm->AttachCurrentThreadAsDaemon((void**) &r_env, nullptr);
#endif
        JVM_DEV_ASSERT(result == JNI_OK, "Failed to attach vm to current thread!");
        env = new Env(r_env);
    }

    void Jvm::detach() {
        jint result = _instance->vm->DetachCurrentThread();
        JVM_DEV_ASSERT(result == JNI_OK, "Failed to detach vm to current thread!");
        delete env;
        env = nullptr;
    }

    Env Jvm::current_env() {
        if (unlikely(!env)) {
            JNIEnv* r_env;
            jint result = _instance->vm->GetEnv((void**) &r_env, _instance->version);
            JVM_DEV_ASSERT(result != JNI_EDETACHED, "Current thread is not attached!");
            env = new Env(r_env);
        }
        return *env;
    }

    JvmType Jvm::get_type() {
        return _instance->vm_type;
    }
}// namespace jni
