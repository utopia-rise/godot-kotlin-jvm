#ifdef __ANDROID__

#include <platform/android/thread_jandroid.h>
#include "../jvm.h"

namespace jni {
    JavaVM* Jvm::vm = nullptr;
    Env* Jvm::env = nullptr;
    jint Jvm::version = 0;

    void Jvm::init(const InitArgs& initArgs) {
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
        return Env(ThreadAndroid::get_env());
    }
}

#endif
