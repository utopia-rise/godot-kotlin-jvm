#include "memory_manager.h"

#include "binding/kotlin_binding_manager.h"
#include "script/jvm_script_manager.h"
#include "shared_buffer.h"
#include "transfer_context.h"
#include "type_manager.h"

static LocalVector<uint64_t> ids;
static LocalVector<uintptr_t> pointers;
static LocalVector<uint32_t> variant_types;

bool MemoryManager::check_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jlong instance_id) {
    auto* instance {reinterpret_cast<Object*>(static_cast<uintptr_t>(p_raw_ptr))};
    return instance == ObjectDB::get_instance(static_cast<ObjectID>(static_cast<uint64_t>(instance_id)));
}

void MemoryManager::release_binding(JNIEnv* p_raw_env, jobject p_instance, jlong instance_id) {
    Object* obj = ObjectDB::get_instance(static_cast<ObjectID>(static_cast<uint64_t>(instance_id)));
    if (obj == nullptr) { return; }

    KotlinBindingManager::free_binding(obj);
    if (obj->is_ref_counted()) {
        RefCounted* ref = reinterpret_cast<RefCounted*>(obj);
        if (ref->unreference()) { memdelete(ref); }
    }
}

void MemoryManager::unref_native_core_types(JNIEnv* p_raw_env, jobject p_instance, jobject p_ptr_array, jobject p_var_type_array) {
    jni::Env env {p_raw_env};
    jni::JLongArray ptr_array {p_ptr_array};
    jni::JIntArray var_type_array {p_var_type_array};

    jint size = ptr_array.length(env);
    pointers.resize(size);
    variant_types.resize(size);

    ptr_array.get_array_elements(env, reinterpret_cast<jlong*>(pointers.ptr()), size);
    var_type_array.get_array_elements(env, reinterpret_cast<jint*>(variant_types.ptr()), size);

    for(int i = 0; i < size; ++i){
        uintptr_t p_raw_ptr = pointers[i];
        uint32_t var_type = variant_types[i];

        Variant::Type variant_type {static_cast<Variant::Type>(var_type)};
        switch (variant_type) {
            case Variant::CALLABLE:
                memdelete(reinterpret_cast<Callable*>(p_raw_ptr));
                break;
            case Variant::DICTIONARY:
                memdelete(reinterpret_cast<Dictionary*>(p_raw_ptr));
                break;
            case Variant::ARRAY:
                memdelete(reinterpret_cast<Array*>(p_raw_ptr));
                break;
            case Variant::STRING_NAME:
                memdelete(reinterpret_cast<StringName*>(p_raw_ptr));
                break;
            case Variant::NODE_PATH:
                memdelete(reinterpret_cast<NodePath*>(p_raw_ptr));
                break;
            case Variant::PACKED_BYTE_ARRAY:
                memdelete(reinterpret_cast<PackedByteArray*>(p_raw_ptr));
                break;
            case Variant::PACKED_INT32_ARRAY:
                memdelete(reinterpret_cast<PackedInt32Array*>(p_raw_ptr));
                break;
            case Variant::PACKED_INT64_ARRAY:
                memdelete(reinterpret_cast<PackedInt64Array*>(p_raw_ptr));
                break;
            case Variant::PACKED_FLOAT32_ARRAY:
                memdelete(reinterpret_cast<PackedFloat32Array*>(p_raw_ptr));
                break;
            case Variant::PACKED_FLOAT64_ARRAY:
                memdelete(reinterpret_cast<PackedFloat64Array*>(p_raw_ptr));
                break;
            case Variant::PACKED_STRING_ARRAY:
                memdelete(reinterpret_cast<PackedStringArray*>(p_raw_ptr));
                break;
            case Variant::PACKED_VECTOR2_ARRAY:
                memdelete(reinterpret_cast<PackedVector2Array*>(p_raw_ptr));
                break;
            case Variant::PACKED_VECTOR3_ARRAY:
                memdelete(reinterpret_cast<PackedVector3Array*>(p_raw_ptr));
                break;
            case Variant::PACKED_VECTOR4_ARRAY:
                memdelete(reinterpret_cast<PackedVector4Array*>(p_raw_ptr));
                break;
            case Variant::PACKED_COLOR_ARRAY:
                memdelete(reinterpret_cast<PackedColorArray*>(p_raw_ptr));
                break;
            default:
                break;
        }
    }

    pointers.clear();
    variant_types.clear();
}

void MemoryManager::query_sync(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    MemoryManager::get_instance().sync_memory(env);
}

void MemoryManager::create_native_object(JNIEnv* p_raw_env, jobject p_instance, jint p_class_index, jobject p_object, jint p_script_index) {
    const StringName& class_name {TypeManager::get_instance().get_engine_type_for_index(static_cast<int>(p_class_index))};
    Object* ptr = ClassDB::instantiate(class_name);

    auto raw_ptr = reinterpret_cast<uintptr_t>(ptr);

#ifdef DEBUG_ENABLED
    JVM_ERR_FAIL_COND_MSG(!ptr, "Failed to instantiate class %s", class_name);
#endif

    jni::Env env {p_raw_env};

    KotlinBindingManager::set_instance_binding(ptr);
    int script_index {static_cast<int>(p_script_index)};
    if (script_index != -1) {
        KtObject* kt_object = memnew(KtObject(env, jni::JObject(p_object), ptr->is_ref_counted()));
        Ref<JvmScript> kotlin_script {JvmScriptManager::get_instance()->get_named_script_from_index(script_index)};
        JvmInstance* script = memnew(JvmInstance(env, ptr, kt_object, kotlin_script.ptr()));
        ptr->set_script_instance(script);
    }

    TransferContext::get_instance().write_object_data(env, raw_ptr, ptr->get_instance_id());
}

void MemoryManager::get_singleton(JNIEnv* p_raw_env, jobject p_instance, jint p_class_index) {
    const String& singleton_name {TypeManager::get_instance().get_engine_singleton_name_for_index(static_cast<int>(p_class_index))};
    Object* singleton {Engine::get_singleton()->get_singleton_object(singleton_name)};

    jni::Env env {p_raw_env};
    TransferContext::get_instance().write_object_data(env, reinterpret_cast<uintptr_t>(singleton), singleton->get_instance_id());
}

void MemoryManager::free_object(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    auto* owner = reinterpret_cast<Object*>(static_cast<uintptr_t>(p_raw_ptr));

#ifdef DEBUG_ENABLED
    JVM_ERR_FAIL_COND_MSG(owner->is_ref_counted(), "Can't 'free' a RefCounted Object.");
#endif

    memdelete(owner);
}

void MemoryManager::sync_memory(jni::Env& p_env) {

    // Read the list of references to demote, we do it at the end of a frame instead of the constant ping-pong happening each call.
    to_demote_mutex.lock();
    for (JvmInstance* script_instance : to_demote_objects) {
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
        RefCounted* ref = reinterpret_cast<RefCounted*>(ObjectDB::get_instance(static_cast<ObjectID>(id)));
        KotlinBindingManager::free_binding(ref);
        if (ref->unreference()) { memdelete(ref); }
    }

    ids.clear();
}

void MemoryManager::clean_up(jni::Env& p_env) {
    JVM_LOG_VERBOSE("Cleaning JVM Memory...");
    wrapped.call_void_method(p_env, CLEAN_UP);
    JVM_LOG_VERBOSE("JVM Memory cleaned!");
}

void MemoryManager::queue_dead_object(Object* obj) {
    dead_objects_mutex.lock();
    dead_objects.push_back(obj->get_instance_id());
    dead_objects_mutex.unlock();
}

void MemoryManager::queue_demotion(JvmInstance* script_instance) {
    to_demote_mutex.lock();
    to_demote_objects.insert(script_instance);
    to_demote_mutex.unlock();
}

void MemoryManager::cancel_demotion(JvmInstance* script_instance) {
    to_demote_mutex.lock();
    to_demote_objects.erase(script_instance);
    to_demote_mutex.unlock();
}

void MemoryManager::try_promotion(JvmInstance* script_instance) {
    to_demote_mutex.lock();
    script_instance->promote_reference();
    to_demote_mutex.unlock();
}

void MemoryManager::script_instance_removed(jni::Env& p_env, uint64_t id, uint32_t constructor_index) {
    jvalue args[2] = {jni::to_jni_arg(id), jni::to_jni_arg(constructor_index)};
    wrapped.call_void_method(p_env, REMOVE_SCRIPT, args);
}

void MemoryManager::direct_object_deletion(jni::Env& p_env, Object* p_obj) {
    jvalue args[1] = {jni::to_jni_arg(p_obj->get_instance_id().operator uint64_t())};
    wrapped.call_void_method(p_env, DELETE_OBJECT, args);
    memdelete(p_obj);
}

MemoryManager::~MemoryManager() = default;

