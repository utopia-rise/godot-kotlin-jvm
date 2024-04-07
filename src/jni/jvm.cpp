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
        _instance = new Jvm(p_vm,p_type,p_version);
    }

    void Jvm::destroy() {
        if (_instance->vm) {
            _instance->vm->DetachCurrentThread();
            _instance->vm->DestroyJavaVM();
        }
    }

    void Jvm::attach() {
        if (_instance->vm) {
            JNIEnv* r_env;
            auto result = _instance->vm->AttachCurrentThread((void**) &r_env, nullptr);
            JVM_CRASH_COND_MSG(result != JNI_OK, "Failed to attach vm to current thread!");
            env = new Env(r_env);
        }
    }

    void Jvm::detach() {
        if (_instance->vm) {
            auto result = _instance->vm->DetachCurrentThread();
            JVM_CRASH_COND_MSG(result != JNI_OK, "Failed to detach vm to current thread!");
            delete env;
            env = nullptr;
        }
    }

    Env Jvm::current_env() {
#ifdef __ANDROID__
        return Env(get_jni_env());
#else
        if (unlikely(!env)) {
            JNIEnv* r_env;
            auto result = _instance->vm->GetEnv((void**) &r_env, _instance->version);
            JVM_CRASH_COND_MSG(result == JNI_EDETACHED, "Current thread is not attached!");
            env = new Env(r_env);
        }
        return *env;
#endif
    }

    JvmType Jvm::get_type() {
        return _instance->vm_type;
    }
}// namespace jni
