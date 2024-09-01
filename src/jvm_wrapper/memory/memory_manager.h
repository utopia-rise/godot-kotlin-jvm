#ifndef GODOT_JVM_MEMORY_MANAGER_H
#define GODOT_JVM_MEMORY_MANAGER_H

#include "jni/types.h"
#include "jvm_wrapper/jvm_singleton_wrapper.h"
#include "jvm_wrapper/registration/kt_object.h"
#include "script/jvm_instance.h"

#include <jni.h>

// clang-format off
JVM_SINGLETON_WRAPPER(MemoryManager, "godot.core.memory.MemoryManager") {
    SINGLETON_CLASS(MemoryManager)

    JNI_METHOD(SYNC_MEMORY)
    JNI_METHOD(SET_DISPLAY)
    JNI_METHOD(CLEAN_UP)
    JNI_METHOD(REMOVE_SCRIPT)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(SYNC_MEMORY, "syncMemory", "([J)[J")
        INIT_JNI_METHOD(CLEAN_UP, "cleanUp", "()V")
        INIT_JNI_METHOD(REMOVE_SCRIPT, "removeScriptInstance", "(J)V")
        INIT_NATIVE_METHOD("checkInstance", "(JJ)Z", MemoryManager::check_instance)
        INIT_NATIVE_METHOD("unrefNativeCoreType", "(JI)Z", MemoryManager::unref_native_core_type)
        INIT_NATIVE_METHOD("querySync", "()V", MemoryManager::query_sync)
        INIT_NATIVE_METHOD("createNativeObject", "(ILgodot/core/KtObject;I)V", MemoryManager::create_native_object)
        INIT_NATIVE_METHOD("getSingleton", "(I)V", MemoryManager::get_singleton)
        INIT_NATIVE_METHOD("freeObject", "(J)V", MemoryManager::free_object)
        INIT_NATIVE_METHOD("releaseBinding", "(J)V", MemoryManager::release_binding)
      )

    Mutex dead_objects_mutex;
    LocalVector<ObjectID> dead_objects;
    Mutex to_demote_mutex;
    HashSet<JvmInstance*> to_demote_objects;

    static bool check_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jlong instance_id);
    static bool unref_native_core_type(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jint var_type);
    static void query_sync(JNIEnv* p_raw_env, jobject p_instance);
    static void create_native_object(JNIEnv* p_raw_env, jobject instance, jint p_class_index, jobject p_object, jint p_script_index);
    static void get_singleton(JNIEnv* p_raw_env, jobject p_instance, jint p_class_index);
    static void free_object(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
    static void release_binding(JNIEnv* p_raw_env, jobject p_instance, jlong instance_id);

public:
    void remove_script_instance(jni::Env& p_env, uint64_t id);
    void queue_dead_object(Object* obj);
    void queue_demotion(JvmInstance* script_instance);
    void cancel_demotion(JvmInstance* script_instance);
    void try_promotion(JvmInstance* script_instance);
    bool sync_memory(jni::Env& p_env);
    void clean_up(jni::Env& p_env);
};

// clang-format on
#endif// GODOT_JVM_MEMORY_MANAGER_H
