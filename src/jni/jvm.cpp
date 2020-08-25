#include <cassert>
#include "jvm_loader.h"
#include "jvm.h"

namespace jni {
    JavaVM* Jvm::vm = nullptr;
    Env* Jvm::env = nullptr;
    int Jvm::version = 0;

    void Jvm::init(const InitArgs& initArgs) {
        auto res = get_existing();
        if (res == nullptr) {
            res = create(initArgs);
        }
        assert(res != nullptr);
        vm = res;
        version = initArgs.version;
    }

    void Jvm::destroy() {
        vm->DetachCurrentThread();
        vm->DestroyJavaVM();
        JvmLoader::closeJvmLib();
    }

    JavaVM* Jvm::create(const InitArgs& initArgs) {
        auto nOptions = initArgs.options.size();
        JavaVMOption options[nOptions];
        JavaVMInitArgs args;
        args.version = initArgs.version;
        args.nOptions = nOptions;
        args.options = options;

        for (auto i = 0; i < nOptions; i++) {
            args.options[i].optionString = (char*) initArgs.options[i].c_str();
        }

        JavaVM* vm;
        JNIEnv* env;
        auto result = JvmLoader::getCreateJvmFunction()(&vm, (void**) &env, (void*) &args);
        if (result != JNI_OK) {
            throw JniError("Failed to create a new vm!");
        }
        return vm;
    }

    JavaVM* Jvm::get_existing() {
        JavaVM* buffer[1];
        int count;
        auto result = JvmLoader::getGetCreatedJavaVMsFunction()(buffer, 1, &count);
        if (result != JNI_OK) {
            throw JniError("Failed to retrieve existing vm!");
        }
        if (count > 0) {
            return buffer[0];
        }
        return nullptr;
    }

    Env Jvm::attach() {
        JNIEnv* r_env;
        auto result = vm->GetEnv((void**) &r_env, version);
        if (result == JNI_EDETACHED) {
            result = vm->AttachCurrentThread((void**) &r_env, nullptr);
            if (result != JNI_OK) {
                throw JniError("Failed to attach vm to current thread!");
            }
        }
        Jvm::env = new Env(r_env);
        return Env(r_env);
    }

    void Jvm::detach() {
        auto result = vm->DetachCurrentThread();
        if (result != JNI_OK) {
            throw JniError("Failed to detach vm to current thread!");
        }
        delete Jvm::env;
        Jvm::env = nullptr;
    }

    Env Jvm::current_env() {
        JNIEnv* r_env;
        auto result = vm->GetEnv((void**) &r_env, version);
        if (result == JNI_EDETACHED) {
            throw JniError("Current thread is not attached!");
        }
        return attach();
    }
}