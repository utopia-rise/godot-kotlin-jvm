#include <core/object.h>
#include <core/reference.h>
#include "memory_bridge.h"

bool MemoryBridge::check_instance(JNIEnv p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    auto* instance{reinterpret_cast<Object*>(static_cast<uintptr_t>(p_raw_ptr))};
    return ObjectDB::instance_validate(instance);
}

void MemoryBridge::unref(JNIEnv p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    auto* reference{reinterpret_cast<Reference*>(static_cast<uintptr_t>(p_raw_ptr))};
    reference->unreference();
}
