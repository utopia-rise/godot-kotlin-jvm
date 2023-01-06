#include "memory_bridge.h"

#include "constants.h"
#include "core/object/object.h"
#include "logging.h"
#include "memory/kotlin_binding_manager.h"

using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(MemoryBridge)

MemoryBridge::MemoryBridge(jni::JObject p_wrapped, jni::JObject p_class_loader) :
  JavaInstanceWrapper(MEMORY_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader) {
    jni::JNativeMethod check_instance_method {const_cast<char*>("checkInstance"), const_cast<char*>("(JJ)Z"), (void*) MemoryBridge::check_instance};

    jni::JNativeMethod decrement_ref_counter_method {
      const_cast<char*>("decrementRefCounter"),
      const_cast<char*>("(J)V"),
      (void*) MemoryBridge::decrement_ref_counter};

    jni::JNativeMethod bind_instance_method {
      const_cast<char*>("bindInstance"),
      const_cast<char*>("(JLgodot/core/KtObject;Ljava/lang/ClassLoader;)V"),
      (void*) MemoryBridge::bind_instance};

    jni::JNativeMethod unref_native_core_type_method {
      const_cast<char*>("unrefNativeCoreType"),
      const_cast<char*>("(JI)Z"),
      (void*) MemoryBridge::unref_native_core_type};

    jni::JNativeMethod notify_leak_method {const_cast<char*>("notifyLeak"), const_cast<char*>("()V"), (void*) MemoryBridge::notify_leak};

    Vector<jni::JNativeMethod> methods;
    methods.push_back(check_instance_method);
    methods.push_back(decrement_ref_counter_method);
    methods.push_back(bind_instance_method);
    methods.push_back(unref_native_core_type_method);
    methods.push_back(notify_leak_method);

    jni::Env env {jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}

bool MemoryBridge::check_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jlong instance_id) {
    auto* instance {reinterpret_cast<Object*>(static_cast<uintptr_t>(p_raw_ptr))};
    return instance == ObjectDB::get_instance(static_cast<ObjectID>(static_cast<uint64_t>(instance_id)));
}

void MemoryBridge::bind_instance(JNIEnv* p_raw_env, jobject p_instance, jlong instance_id, jobject p_object, jobject p_class_loader) {
    auto* obj {ObjectDB::get_instance(static_cast<ObjectID>(static_cast<uint64_t>(instance_id)))};
    if (obj) {
        KtObject* ktObject {new KtObject(jni::JObject(p_object), jni::JObject(p_class_loader))};
        if (!KotlinBindingManager::bind_object(obj, ktObject)) { delete ktObject; }
    }
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
