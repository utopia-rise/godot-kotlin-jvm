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
}

bool MemoryBridge::check_instance(JNIEnv p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    auto* instance{reinterpret_cast<Object*>(static_cast<uintptr_t>(p_raw_ptr))};
    return ObjectDB::instance_validate(instance);
}

bool MemoryBridge::unref(JNIEnv p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    auto* reference{reinterpret_cast<Reference*>(static_cast<uintptr_t>(p_raw_ptr))};
    if (reference->unreference()) {
        memdelete(reference);
        return true;
    } else {
        return false;
    }
}

bool MemoryBridge::ref(JNIEnv p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    auto* reference{reinterpret_cast<Reference*>(static_cast<uintptr_t>(p_raw_ptr))};
    return reference->init_ref();
}
