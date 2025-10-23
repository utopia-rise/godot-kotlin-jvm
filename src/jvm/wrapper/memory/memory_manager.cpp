#include "memory_manager.h"

#include "api/script/jvm_script_manager.h"
#include "core/jvm_binding_manager.h"
#include "core/variant_allocator.h"
#include "engine/utilities.h"

static godot::LocalVector<uint64_t> ids;
static godot::LocalVector<uintptr_t> pointers;
static godot::LocalVector<uint32_t> variant_types;

bool MemoryManager::check_instance(JNIEnv*, jobject, jlong p_raw_ptr, jlong instance_id) {
    auto* instance {reinterpret_cast<godot::Object*>(static_cast<uintptr_t>(p_raw_ptr))};
    return instance == godot::ObjectDB::get_instance(static_cast<godot::ObjectID>(static_cast<uint64_t>(instance_id)));
}

void MemoryManager::release_binding(JNIEnv*, jobject, jlong instance_id) {
    godot::Object* obj = godot::ObjectDB::get_instance(static_cast<godot::ObjectID>(static_cast<uint64_t>(instance_id)));
    if (obj == nullptr) { return; }

    godot::JvmBindingManager::free_binding(obj);
    if (is_ref_counted(obj)) {
        godot::RefCounted* ref = reinterpret_cast<godot::RefCounted*>(obj);
        if (ref->unreference()) { memdelete(ref); }
    }
}

void MemoryManager::unref_native_core_types(JNIEnv* p_raw_env, jobject, jobject p_ptr_array, jobject p_var_type_array) {
    jni::Env env {p_raw_env};
    jni::JLongArray ptr_array {p_ptr_array};
    jni::JIntArray var_type_array {p_var_type_array};

    jint size = ptr_array.length(env);
    pointers.resize(size);
    variant_types.resize(size);

    ptr_array.get_array_elements(env, reinterpret_cast<jlong*>(pointers.ptr()), size);
    var_type_array.get_array_elements(env, reinterpret_cast<jint*>(variant_types.ptr()), size);

    for (int i = 0; i < size; ++i) {
        uintptr_t p_raw_ptr = pointers[i];
        uint32_t var_type = variant_types[i];

        godot::Variant::Type variant_type {static_cast<godot::Variant::Type>(var_type)};
        switch (variant_type) {
            case godot::Variant::CALLABLE:
                VariantAllocator::free(reinterpret_cast<godot::Callable*>(p_raw_ptr));
                break;
            case godot::Variant::DICTIONARY:
                VariantAllocator::free(reinterpret_cast<godot::Dictionary*>(p_raw_ptr));
                break;
            case godot::Variant::ARRAY:
                VariantAllocator::free(reinterpret_cast<godot::Array*>(p_raw_ptr));
                break;
            case godot::Variant::STRING_NAME:
                VariantAllocator::free(reinterpret_cast<godot::StringName*>(p_raw_ptr));
                break;
            case godot::Variant::NODE_PATH:
                VariantAllocator::free(reinterpret_cast<godot::NodePath*>(p_raw_ptr));
                break;
            case godot::Variant::PACKED_BYTE_ARRAY:
                VariantAllocator::free(reinterpret_cast<godot::PackedByteArray*>(p_raw_ptr));
                break;
            case godot::Variant::PACKED_INT32_ARRAY:
                VariantAllocator::free(reinterpret_cast<godot::PackedInt32Array*>(p_raw_ptr));
                break;
            case godot::Variant::PACKED_INT64_ARRAY:
                VariantAllocator::free(reinterpret_cast<godot::PackedInt64Array*>(p_raw_ptr));
                break;
            case godot::Variant::PACKED_FLOAT32_ARRAY:
                VariantAllocator::free(reinterpret_cast<godot::PackedFloat32Array*>(p_raw_ptr));
                break;
            case godot::Variant::PACKED_FLOAT64_ARRAY:
                VariantAllocator::free(reinterpret_cast<godot::PackedFloat64Array*>(p_raw_ptr));
                break;
            case godot::Variant::PACKED_STRING_ARRAY:
                VariantAllocator::free(reinterpret_cast<godot::PackedStringArray*>(p_raw_ptr));
                break;
            case godot::Variant::PACKED_VECTOR2_ARRAY:
                VariantAllocator::free(reinterpret_cast<godot::PackedVector2Array*>(p_raw_ptr));
                break;
            case godot::Variant::PACKED_VECTOR3_ARRAY:
                VariantAllocator::free(reinterpret_cast<godot::PackedVector3Array*>(p_raw_ptr));
                break;
            case godot::Variant::PACKED_VECTOR4_ARRAY:
                VariantAllocator::free(reinterpret_cast<godot::PackedVector4Array*>(p_raw_ptr));
                break;
            case godot::Variant::PACKED_COLOR_ARRAY:
                VariantAllocator::free(reinterpret_cast<godot::PackedColorArray*>(p_raw_ptr));
                break;
            default:
                break;
        }
    }

    pointers.clear();
    variant_types.clear();
}

void MemoryManager::query_sync(JNIEnv* p_raw_env, jobject) {
    jni::Env env {p_raw_env};
    MemoryManager::get_instance().sync_memory(env);
}

void MemoryManager::sync_memory(jni::Env& p_env) {
    // Read the list of references to demote, we do it at the end of a frame instead of the constant ping-pong happening each call.
    to_demote_mutex.lock();
    for (godot::JvmInstance* script_instance : to_demote_objects) {
        script_instance->demote_reference();
    }
    to_demote_objects.clear();
    to_demote_mutex.unlock();

    // Read the list of dead objects and copy them to the JVM.
    dead_objects_mutex.lock();
    jint size = static_cast<jsize>(dead_objects.size());
    jni::JLongArray arr {p_env, size};
    arr.set_array_elements(p_env, reinterpret_cast<const jlong*>(dead_objects.ptr()), size);
    dead_objects.clear();
    dead_objects_mutex.unlock();

    // Call the JVM side sending all the list of all dead objects and receiving the list of references to decrement
    jvalue args[1] = {jni::to_jni_arg(arr)};
    jni::JLongArray refs_to_decrement {wrapped.call_object_method(p_env, SYNC_MEMORY, args)};
    arr.delete_local_ref(p_env);

    size = refs_to_decrement.length(p_env);
    ids.resize(size);
    refs_to_decrement.get_array_elements(p_env, reinterpret_cast<jlong*>(ids.ptr()), size);
    refs_to_decrement.delete_local_ref(p_env);

    for (uint64_t id : ids) {
        godot::RefCounted* ref =
          reinterpret_cast<godot::RefCounted*>(godot::ObjectDB::get_instance(static_cast<godot::ObjectID>(id)));
        godot::JvmBindingManager::free_binding(ref);
        if (ref->unreference()) { memdelete(ref); }
    }

    ids.clear();
}

void MemoryManager::clean_up(jni::Env& p_env) {
    JVM_LOG_VERBOSE("Cleaning JVM Memory...");
    wrapped.call_void_method(p_env, CLEAN_UP);
    JVM_LOG_VERBOSE("JVM Memory cleaned!");
}

void MemoryManager::queue_dead_object(godot::Object* obj) {
    dead_objects_mutex.lock();
    dead_objects.push_back(godot::ObjectID(obj->get_instance_id()));
    dead_objects_mutex.unlock();
}

void MemoryManager::queue_demotion(godot::JvmInstance* script_instance) {
    to_demote_mutex.lock();
    to_demote_objects.insert(script_instance);
    to_demote_mutex.unlock();
}

void MemoryManager::cancel_demotion(godot::JvmInstance* script_instance) {
    to_demote_mutex.lock();
    to_demote_objects.erase(script_instance);
    to_demote_mutex.unlock();
}

void MemoryManager::try_promotion(godot::JvmInstance* script_instance) {
    to_demote_mutex.lock();
    script_instance->promote_reference();
    to_demote_mutex.unlock();
}

void MemoryManager::direct_object_deletion(jni::Env& p_env, godot::Object* p_obj) {
    jvalue args[1] = {jni::to_jni_arg(p_obj->get_instance_id())};
    wrapped.call_void_method(p_env, DELETE_OBJECT, args);
    memdelete(p_obj);
}

MemoryManager::~MemoryManager() = default;
