#ifndef GODOT_JVM_MEMORY_MANAGER_H
#define GODOT_JVM_MEMORY_MANAGER_H

#include "jni/types.h"
#include "jvm_wrapper/jvm_singleton_wrapper.h"

#include <jni.h>

// clang-format off
JVM_SINGLETON_WRAPPER(MemoryManager, "godot.core.memory.MemoryManager") {
    SINGLETON_CLASS(MemoryManager)

    JNI_METHOD(MANAGE_MEMORY)
    JNI_METHOD(SET_DISPLAY)
    JNI_METHOD(CLEAN_UP)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(MANAGE_MEMORY, "syncMemory", "([J)[J")
        INIT_JNI_METHOD(SET_DISPLAY, "setShouldDisplayLeakInstancesOnClose", "(Z)V")
        INIT_JNI_METHOD(CLEAN_UP, "cleanUp", "()V")
        INIT_NATIVE_METHOD("checkInstance", "(JJ)Z", MemoryManager::check_instance)
        INIT_NATIVE_METHOD("decrementRefCounter", "(J)V", MemoryManager::decrement_ref_counter)
        INIT_NATIVE_METHOD("unrefNativeCoreType", "(JI)Z", MemoryManager::unref_native_core_type)
      )

    Mutex mutex;
    LocalVector<ObjectID> deadObjects;

    static bool check_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jlong instance_id);

    static void decrement_ref_counter(JNIEnv* p_raw_env, jobject p_instance, jlong instance_id);

    static bool unref_native_core_type(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jint var_type);

public:
    void registerDeadObject(Object* obj);
    void syncMemory(jni::Env& p_env);
    void setDisplayLeaks(jni::Env& p_env, bool b);
    void clean_up(jni::Env& p_env);
};
// clang-format on
#endif// GODOT_JVM_MEMORY_MANAGER_H
