#include <core/object.h>
#include <core/reference.h>
#include <modules/kotlin_jvm/src/logging.h>
#include <modules/kotlin_jvm/src/ref_db.h>
#include "memory_bridge.h"
#include "constants.h"

using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(MemoryBridge)

MemoryBridge::MemoryBridge(jni::JObject p_wrapped, jni::JObject p_class_loader) :
        JavaInstanceWrapper(MEMORY_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader) {
    jni::JNativeMethod check_instance_method{
            "checkInstance",
            "(JJ)Z",
            (void*) MemoryBridge::check_instance
    };

    jni::JNativeMethod unref_method{
            "unref",
            "(JI)Z",
            (void*) MemoryBridge::unref
    };


    jni::JNativeMethod unref_native_core_type_method{
            "unrefNativeCoreType",
            "(JI)Z",
            (void*) MemoryBridge::unref_native_core_type
    };

    jni::JNativeMethod notify_leak_method{
            "notifyLeak",
            "()V",
            (void*) MemoryBridge::notify_leak
    };

    Vector<jni::JNativeMethod> methods;
    methods.push_back(check_instance_method);
    methods.push_back(unref_method);
    methods.push_back(unref_native_core_type_method);
    methods.push_back(notify_leak_method);

    jni::Env env{jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}

bool MemoryBridge::check_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jlong instance_id) {
    auto* instance{reinterpret_cast<Object*>(static_cast<uintptr_t>(p_raw_ptr))};
    return ObjectDB::instance_validate(instance) && instance->get_instance_id() == static_cast<ObjectID>(instance_id);
}

bool MemoryBridge::unref(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jint p_counter) {
    if (auto* reference{reinterpret_cast<Reference*>(static_cast<uintptr_t>(p_raw_ptr))}) {
        auto counter = static_cast<uint32_t>(p_counter);
        RefDB::get_instance().remove_ref(reference, counter);
    }
    return true;
}

bool MemoryBridge::unref_native_core_type(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jint var_type) {
    Variant::Type variant_type{static_cast<Variant::Type>(var_type)};
    bool has_free{false};
    switch (variant_type) {
        case Variant::_RID:
            memdelete(reinterpret_cast<RID*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::DICTIONARY:
            memdelete(reinterpret_cast<Dictionary*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::ARRAY:
            memdelete(reinterpret_cast<Array*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::NODE_PATH:
            memdelete(reinterpret_cast<NodePath*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::POOL_BYTE_ARRAY:
            memdelete(reinterpret_cast<PoolByteArray*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::POOL_INT_ARRAY:
            memdelete(reinterpret_cast<PoolIntArray*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::POOL_REAL_ARRAY:
            memdelete(reinterpret_cast<PoolRealArray*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::POOL_STRING_ARRAY:
            memdelete(reinterpret_cast<PoolStringArray*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::POOL_VECTOR2_ARRAY:
            memdelete(reinterpret_cast<PoolVector2Array*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::POOL_VECTOR3_ARRAY:
            memdelete(reinterpret_cast<PoolVector3Array*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::POOL_COLOR_ARRAY:
            memdelete(reinterpret_cast<PoolColorArray*>(p_raw_ptr));
            has_free = true;
            break;
        default:
            break;
    }

    jni::Env env{p_raw_env};
    jni::JObject local_ref{p_instance};
    local_ref.delete_local_ref(env);
    return has_free;
}

void MemoryBridge::notify_leak(JNIEnv* p_raw_env, jobject p_instance) {
#ifdef DEBUG_ENABLED
#ifdef TOOLS_ENABLED
    LOG_WARNING("JVM instances are leaking.");
#else
    JVM_CRASH_NOW_MSG("JVM instances are leaking.");
#endif // TOOLS_ENABLED
#endif // DEBUG_ENABLED
}
