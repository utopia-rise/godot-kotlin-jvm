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

    JNI_METHOD(MANAGE_MEMORY)
    JNI_METHOD(SET_DISPLAY)
    JNI_METHOD(PRE_CLEAN_UP)
    JNI_METHOD(CHECK_CLEAN_UP)
    JNI_METHOD(POST_CLEAN_UP)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(MANAGE_MEMORY, "syncMemory", "([J)[J")
        INIT_JNI_METHOD(PRE_CLEAN_UP, "preCleanup", "()V")
        INIT_JNI_METHOD(CHECK_CLEAN_UP, "checkCleanup", "()B")
        INIT_JNI_METHOD(POST_CLEAN_UP, "postCleanup", "()V")
        INIT_NATIVE_METHOD("checkInstance", "(JJ)Z", MemoryManager::check_instance)
        INIT_NATIVE_METHOD("decrementRefCounter", "(J)V", MemoryManager::decrement_ref_counter)
        INIT_NATIVE_METHOD("unrefNativeCoreType", "(JI)Z", MemoryManager::unref_native_core_type)
      )

    Mutex dead_objects_mutex;
    LocalVector<ObjectID> dead_objects;
    Mutex to_demote_mutex;
    LocalVector<JvmInstance*> to_demote_objects;

    static bool check_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jlong instance_id);

    static void decrement_ref_counter(JNIEnv* p_raw_env, jobject p_instance, jlong instance_id);

    static bool unref_native_core_type(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jint var_type);

public:
    void queue_dead_object(Object* obj);
    void queue_demotion(JvmInstance* script_instance);
    void try_promotion(JvmInstance* script_instance);
    bool sync_memory(jni::Env& p_env);
    void clean_up(jni::Env& p_env);
};
// clang-format on
#endif// GODOT_JVM_MEMORY_MANAGER_H
