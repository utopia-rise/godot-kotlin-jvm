#include "memory_manager.h"

#include "binding/kotlin_binding_manager.h"

#include <core/os/os.h>

bool MemoryManager::check_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jlong instance_id) {
    auto* instance {reinterpret_cast<Object*>(static_cast<uintptr_t>(p_raw_ptr))};
    return instance == ObjectDB::get_instance(static_cast<ObjectID>(static_cast<uint64_t>(instance_id)));
}

void MemoryManager::decrement_ref_counter(JNIEnv* p_raw_env, jobject p_instance, jlong instance_id) {
    Object* obj = ObjectDB::get_instance(static_cast<ObjectID>(static_cast<uint64_t>(instance_id)));
    KotlinBindingManager::decrement_counter(reinterpret_cast<RefCounted*>(obj));
}

bool MemoryManager::unref_native_core_type(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jint var_type) {
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
        case Variant::PACKED_VECTOR4_ARRAY:
            memdelete(reinterpret_cast<PackedVector4Array*>(p_raw_ptr));
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

bool MemoryManager::sync_memory(jni::Env& p_env) {
    bool active = false;

    // Read the list of references to demote, we do it at the end of a frame instead of the constant ping-pong happening each call.
    to_demote_mutex.lock();
    if (to_demote_objects.size() > 0) { active = true; }
    for (JvmInstance* script_instance : to_demote_objects) {
        script_instance->demote_reference();
    }
    to_demote_objects.clear();
    to_demote_mutex.unlock();

    // Read the list of dead objects and copy them to the JVM.
    dead_objects_mutex.lock();
    jint size = static_cast<jsize>(dead_objects.size());
    if (size > 0) { active = true; }
    jni::JLongArray arr {p_env, size};
    arr.set_array_elements(p_env, reinterpret_cast<const jlong*>(dead_objects.ptr()), size);
    dead_objects.clear();
    dead_objects_mutex.unlock();

    // Call the JVM side sending all the list of all dead objects and receiving the list of references to decrement
    jvalue args[1] = {jni::to_jni_arg(arr)};
    jni::JLongArray refs_to_decrement {wrapped.call_object_method(p_env, MANAGE_MEMORY, args)};

    Vector<uint64_t> vec;
    size = arr.length(p_env);
    if (size > 0) { active = true; }
    vec.resize(size);
    arr.get_array_elements(p_env, reinterpret_cast<jlong*>(vec.ptrw()), size);
    refs_to_decrement.delete_local_ref(p_env);

    for (uint64_t id : vec) {
        Object* obj = ObjectDB::get_instance(static_cast<ObjectID>(id));
        KotlinBindingManager::decrement_counter(reinterpret_cast<RefCounted*>(obj));
    }

    return active;
}

void MemoryManager::clean_up(jni::Env& p_env) {
    LOG_VERBOSE("Cleaning JVM Memory...")

    wrapped.call_void_method(p_env, PRE_CLEAN_UP);

    uint64_t start = OS::get_singleton()->get_ticks_msec();
    while (!wrapped.call_boolean_method(p_env, CHECK_CLEAN_UP)) {
        if (sync_memory(p_env)) { start = OS::get_singleton()->get_ticks_msec(); }
        // Wait 5s at most.
        if (OS::get_singleton()->get_ticks_msec() - start > 5000) { break; }
    }

    wrapped.call_void_method(p_env, POST_CLEAN_UP);
    LOG_VERBOSE("JVM Memory cleaned")
}

void MemoryManager::queue_dead_object(Object* obj) {
    dead_objects_mutex.lock();
    dead_objects.push_back(obj->get_instance_id());
    dead_objects_mutex.unlock();
}

void MemoryManager::queue_demotion(JvmInstance* script_instance) {
    to_demote_mutex.lock();
    to_demote_objects.push_back(script_instance);
    to_demote_mutex.unlock();
}

void MemoryManager::try_promotion(JvmInstance* script_instance) {
    to_demote_mutex.lock();
    script_instance->promote_reference();
    to_demote_mutex.unlock();
}

MemoryManager::~MemoryManager() = default;