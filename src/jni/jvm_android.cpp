#ifdef __ANDROID__

#include "../jvm.h"

#include <platform/android/thread_jandroid.h>

namespace jni {
    JavaVM* Jvm::vm = nullptr;
    jint Jvm::version = 0;
    Jvm::Type Jvm::vm_type {Jvm::NONE};

    void Jvm::init(const InitArgs& initArgs, Type type) {
        vm_type = type;
    }

    void Jvm::destroy() {
        // This is not our responsability
    }

    JavaVM* Jvm::create(const InitArgs& initArgs) {
        // Already existing Jvm
        return nullptr;
    }

    JavaVM* Jvm::get_existing() {
        // Cannot retreive it from android support code.
        return nullptr;
    }

    Env Jvm::attach() {
        // ThreadAndroid::get_env() attach if not already attached.
        return current_env();
    }

    void Jvm::detach() {
        // Not our responsability
    }

    Env Jvm::current_env() {
        // Call android support get_env method.
        return Env(get_jni_env());
    }

    Jvm::Type Jvm::get_type() {
        return vm_type;
    }

    bool Jvm::is_initialized() {
        return true;
    }
}// namespace jni

#endif
