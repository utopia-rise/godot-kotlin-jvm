#ifdef __ANDROID__

#include "../jvm.h"

#include <platform/android/thread_jandroid.h>

namespace jni {
    JavaVM* Jvm::vm = nullptr;
    Env* Jvm::env = nullptr;
    jint Jvm::version = 0;
    Jvm::Type Jvm::vm_type {Jvm::ART};

    void Jvm::init(const InitArgs& initArgs, Type type) {
        // Do nothing, jvm is already there.
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
}// namespace jni

#endif
