#include <core/object.h>
#include <core/reference.h>
#include "memory_bridge.h"

MemoryBridge::MemoryBridge(jni::JObject p_wrapped, jni::JObject p_class_loader) :
        JavaInstanceWrapper("godot.core.GarbageCollector$MemoryBridge", p_wrapped, p_class_loader) {
    jni::JNativeMethod check_instance_method{
            "checkInstance",
            "(J)Z",
            (void*) MemoryBridge::check_instance
    };

    jni::JNativeMethod unref_method{
            "unref",
            "(J)Z",
            (void*) MemoryBridge::unref
    };

    jni::JNativeMethod ref_method{
            "ref",
            "(J)Z",
            (void*) MemoryBridge::ref
    };

    Vector<jni::JNativeMethod> methods;
    methods.push_back(check_instance_method);
    methods.push_back(unref_method);
    methods.push_back(ref_method);

    jni::Env env{jni::Jvm::current_env()};
    get_class(env).register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}

bool MemoryBridge::check_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    auto* instance{reinterpret_cast<Object*>(static_cast<uintptr_t>(p_raw_ptr))};
    jni::Env env(p_raw_env);
    jni::JObject local_ref{p_instance};
    local_ref.delete_local_ref(env);
    return ObjectDB::instance_validate(instance);
}

bool MemoryBridge::unref(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    auto* reference{reinterpret_cast<Reference*>(static_cast<uintptr_t>(p_raw_ptr))};
    jni::Env env(p_raw_env);
    jni::JObject loacl_ref{p_instance};
    loacl_ref.delete_local_ref(env);
    if (reference->unreference()) {
        memdelete(reference);
        return true;
    } else {
        print_verbose(vformat("Will not memdelete %s", static_cast<uintptr_t>(p_raw_ptr)));
        return false;
    }
}

bool MemoryBridge::ref(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    auto* reference{reinterpret_cast<Reference*>(static_cast<uintptr_t>(p_raw_ptr))};
    jni::Env env(p_raw_env);
    jni::JObject local_ref{p_instance};
    local_ref.delete_local_ref(env);
    return reference->init_ref();
}
