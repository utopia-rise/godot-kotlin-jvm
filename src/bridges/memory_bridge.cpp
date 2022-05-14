#include <modules/kotlin_jvm/src/logging.h>
#include <modules/kotlin_jvm/src/ref_db.h>
#include <core/object/object.h>
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
    return instance == ObjectDB::get_instance(static_cast<ObjectID>(static_cast<uint64_t>(instance_id)));
}

bool MemoryBridge::unref(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jint p_counter) {
    if (auto* reference{reinterpret_cast<RefCounted*>(static_cast<uintptr_t>(p_raw_ptr))}) {
        auto counter = static_cast<uint32_t>(p_counter);
        RefDB::get_instance().remove_ref(reference, counter);
    }
    return true;
}

bool MemoryBridge::unref_native_core_type(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jint var_type) {
    Variant::Type variant_type{static_cast<Variant::Type>(var_type)};
    bool has_free{false};
    switch (variant_type) {
        case Variant::RID:
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
        case Variant::STRING_NAME:
            memdelete(reinterpret_cast<StringName*>(p_raw_ptr));
            break;
        case Variant::NODE_PATH:
            memdelete(reinterpret_cast<NodePath*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::PACKED_BYTE_ARRAY:
            memdelete(reinterpret_cast<PackedByteArray*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::PACKED_INT32_ARRAY:
            memdelete(reinterpret_cast<PackedInt32Array*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::PACKED_INT64_ARRAY:
            memdelete(reinterpret_cast<PackedInt64Array*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::PACKED_FLOAT32_ARRAY:
            memdelete(reinterpret_cast<PackedFloat32Array*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::PACKED_FLOAT64_ARRAY:
            memdelete(reinterpret_cast<PackedFloat64Array*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::PACKED_STRING_ARRAY:
            memdelete(reinterpret_cast<PackedStringArray*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::PACKED_VECTOR2_ARRAY:
            memdelete(reinterpret_cast<PackedVector2Array*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::PACKED_VECTOR3_ARRAY:
            memdelete(reinterpret_cast<PackedVector3Array*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::PACKED_COLOR_ARRAY:
            memdelete(reinterpret_cast<PackedColorArray*>(p_raw_ptr));
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
    JVM_CRASH_NOW_MSG("JVM instances are leaking.");
#endif
}
