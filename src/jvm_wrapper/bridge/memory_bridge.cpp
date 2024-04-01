#include "memory_bridge.h"

#include "binding/kotlin_binding_manager.h"
#include "constants.h"
#include "core/object/object.h"
#include "jvm_wrapper/memory/kt_binding.h"
#include "logging.h"
#include "binding/kotlin_binding_manager.h"

using namespace bridges;

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    MemoryBridge,
    INIT_NATIVE_METHOD("checkInstance", "(JJ)Z", MemoryBridge::check_instance)
    INIT_NATIVE_METHOD("decrementRefCounter", "(J)V", MemoryBridge::decrement_ref_counter)
    INIT_NATIVE_METHOD("bindInstance", "(JLgodot/core/memory/GodotBinding;)V", MemoryBridge::bind_instance)
    INIT_NATIVE_METHOD("unbindInstance", "(J)V", MemoryBridge::unbind_instance)
    INIT_NATIVE_METHOD("unrefNativeCoreType", "(JI)Z", MemoryBridge::unref_native_core_type)
    INIT_NATIVE_METHOD("notifyLeak", "()V", MemoryBridge::notify_leak)
  )

// clang-format on

MemoryBridge::MemoryBridge(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {}

bool MemoryBridge::check_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jlong instance_id) {
    auto* instance {reinterpret_cast<Object*>(static_cast<uintptr_t>(p_raw_ptr))};
    return instance == ObjectDB::get_instance(static_cast<ObjectID>(static_cast<uint64_t>(instance_id)));
}

void MemoryBridge::bind_instance(JNIEnv* p_raw_env, jobject p_instance, jlong instance_id, jobject p_object) {
    ObjectID id {static_cast<uint64_t>(instance_id)};
    jni::JObject j_object {p_object};
    KotlinBindingManager::bind_object(id, j_object);
}

void MemoryBridge::unbind_instance(JNIEnv* p_raw_env, jobject p_instance, jlong instance_id) {
    ObjectID id {static_cast<uint64_t>(instance_id)};
    KotlinBindingManager::unbind_object(id);
}

void MemoryBridge::decrement_ref_counter(JNIEnv* p_raw_env, jobject p_instance, jlong instance_id) {
    Object* obj = ObjectDB::get_instance(static_cast<ObjectID>(static_cast<uint64_t>(instance_id)));
    RefCounted* ref = reinterpret_cast<RefCounted*>(obj);
    if (ref && ref->unreference()) { memdelete(ref); }
}

bool MemoryBridge::unref_native_core_type(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jint var_type) {
    Variant::Type variant_type {static_cast<Variant::Type>(var_type)};
    bool has_free {false};
    switch (variant_type) {
        case Variant::RID:
            memdelete(reinterpret_cast<RID*>(p_raw_ptr));
            has_free = true;
            break;
        case Variant::CALLABLE:
            memdelete(reinterpret_cast<Callable*>(p_raw_ptr));
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
            has_free = true;
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

    jni::Env env {p_raw_env};
    jni::JObject local_ref {p_instance};
    local_ref.delete_local_ref(env);
    return has_free;
}

void MemoryBridge::notify_leak(JNIEnv* p_raw_env, jobject p_instance) {
#ifdef DEBUG_ENABLED
    JVM_CRASH_NOW_MSG("JVM instances are leaking.");
#endif
}
