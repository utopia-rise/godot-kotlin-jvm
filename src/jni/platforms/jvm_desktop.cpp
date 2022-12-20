#if defined WINDOWS_ENABLED || defined X11_ENABLED || defined MACOS_ENABLED

#include <cassert>
#include "logging.h"

#ifndef NO_USE_STDLIB
#include <locale>
#endif

#include "../jvm_loader.h"

namespace jni {
    JavaVM* Jvm::vm = nullptr;
    Env* Jvm::env = nullptr;
    jint Jvm::version = 0;
    Jvm::Type Jvm::vm_type{Jvm::JVM};

    void Jvm::init(const InitArgs& initArgs, Type type) {
        vm_type = type;
        JavaVM* res{get_existing()};
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
        JvmLoader::close_jvm_lib();
    }

    JavaVM* Jvm::create(const InitArgs& initArgs) {
        size_t nOptions { initArgs.options.size() };
        auto *options = new JavaVMOption[nOptions];
        JavaVMInitArgs args;
        args.version = initArgs.version;
        args.nOptions = nOptions;
        args.options = options;

        for (auto i = 0; i < nOptions; i++) {
            args.options[i].optionString = (char*) initArgs.options[i].c_str();
        }

        JavaVM* java_vm{nullptr};
        JNIEnv* jni_env{nullptr};

#ifndef NO_USE_STDLIB
        std::locale global;
#endif

        jint result{JvmLoader::get_create_jvm_function()(&java_vm, reinterpret_cast<void**>(&jni_env), &args)};

        // Set std::local::global to value it was before creating JVM.
        // See https://github.com/utopia-rise/godot-kotlin-jvm/issues/166
        // and https://github.com/utopia-rise/godot-kotlin-jvm/issues/170
#ifndef NO_USE_STDLIB
        std::locale::global(global);
#endif

        delete[] options;
        JVM_CRASH_COND_MSG(result != JNI_OK, "Failed to create a new vm!");
        return java_vm;
    }

    JavaVM* Jvm::get_existing() {
        JavaVM* buffer[1];
        jsize count;
        auto result = JvmLoader::get_get_created_java_vm_function()(buffer, 1, &count);
        JVM_CRASH_COND_MSG(result != JNI_OK, "Failed to retrieve existing vm!");
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
            JVM_CRASH_COND_MSG(result != JNI_OK, "Failed to attach vm to current thread!");
        }
        Jvm::env = new Env(r_env);
        return Env(r_env);
    }

    void Jvm::detach() {
        auto result = vm->DetachCurrentThread();
        JVM_CRASH_COND_MSG(result != JNI_OK, "Failed to detach vm to current thread!");
        delete Jvm::env;
        Jvm::env = nullptr;
    }

    Env Jvm::current_env() {
        JNIEnv* r_env;
        auto result = vm->GetEnv((void**) &r_env, version);
        JVM_CRASH_COND_MSG(result == JNI_EDETACHED, "Current thread is not attached!");
        return Env(r_env);
    }

    Jvm::Type Jvm::get_type() {
        return vm_type;
    }
}

#endif
