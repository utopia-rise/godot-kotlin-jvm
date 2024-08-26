#include "memory_manager.h"

#include "binding/kotlin_binding_manager.h"



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

void MemoryManager::syncMemory(jni::Env& p_env) {
    // Read the list of dead objects and copy them to the JVM.
    mutex.lock();
    jint size = static_cast<jsize>(deadObjects.size());
    jni::JLongArray arr {p_env, size};
    arr.set_array_elements(p_env, reinterpret_cast<const jlong*>(deadObjects.ptr()), size);
    deadObjects.clear();
    mutex.unlock();

    // Call the JVM side sending all the list of all dead objects and receiving the list of references to decrement
    jvalue args[1] = {jni::to_jni_arg(arr)};
    jni::JLongArray refs_to_decrement{wrapped.call_object_method(p_env, MANAGE_MEMORY, args)};

    Vector<uint64_t> vec;
    size = arr.length(p_env);
    vec.resize(size);
    arr.get_array_elements(p_env, reinterpret_cast<jlong*>(vec.ptrw()), size);
    refs_to_decrement.delete_local_ref(p_env);

    for (uint64_t id: vec) {
        Object* obj = ObjectDB::get_instance(static_cast<ObjectID>(id));
        KotlinBindingManager::decrement_counter(reinterpret_cast<RefCounted*>(obj));
    }
}

void MemoryManager::setDisplayLeaks(jni::Env& p_env, bool b) {
    jvalue args[1] = {jni::to_jni_arg(b)};
    wrapped.call_void_method(p_env, SET_DISPLAY, args);
}

void MemoryManager::clean_up(jni::Env& p_env) {
    wrapped.call_void_method(p_env, CLEAN_UP);
}

void MemoryManager::registerDeadObject(Object* obj) {
    mutex.lock();
    deadObjects.push_back(obj->get_instance_id());
    mutex.unlock();
}

MemoryManager::~MemoryManager() = default;