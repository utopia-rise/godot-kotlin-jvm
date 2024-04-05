#ifndef GODOT_JVM_MEMORY_MANAGER_H
#define GODOT_JVM_MEMORY_MANAGER_H

#include "jni/types.h"
#include "jvm_wrapper/jvm_singleton_wrapper.h"

#include <jni.h>

// clang-format off
JVM_SINGLETON_WRAPPER(MemoryManager, "godot.core.memory.MemoryManager") {
    SINGLETON_CLASS(MemoryManager)

    JNI_METHOD(START)
    JNI_METHOD(SET_DISPLAY)
    JNI_METHOD(CLEAN_UP)
    JNI_METHOD(IS_CLOSED)
    JNI_METHOD(CLOSE)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(START, "start", "(Z)V")
        INIT_JNI_METHOD(SET_DISPLAY, "setShouldDisplayLeakInstancesOnClose", "(Z)V")
        INIT_JNI_METHOD(CLEAN_UP, "cleanUp", "()V")
        INIT_JNI_METHOD(IS_CLOSED, "isClosed", "()Z")
        INIT_JNI_METHOD(CLOSE, "close", "()V")
        INIT_NATIVE_METHOD("checkInstance", "(JJ)Z", MemoryManager::check_instance)
        INIT_NATIVE_METHOD("decrementRefCounter", "(J)V", MemoryManager::decrement_ref_counter)
        INIT_NATIVE_METHOD("bindInstance", "(JLgodot/core/memory/GodotBinding;)V", MemoryManager::bind_instance)
        INIT_NATIVE_METHOD("unbindInstance", "(J)V", MemoryManager::unbind_instance)
        INIT_NATIVE_METHOD("unrefNativeCoreType", "(JI)Z", MemoryManager::unref_native_core_type)
        INIT_NATIVE_METHOD("notifyLeak", "()V", MemoryManager::notify_leak)
      )

    static bool check_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jlong instance_id);

    static void bind_instance(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jobject p_object);

    static void unbind_instance(JNIEnv* p_raw_env, jobject p_instance, jlong instance_id);

    static void decrement_ref_counter(JNIEnv* p_raw_env, jobject p_instance, jlong instance_id);

    static bool unref_native_core_type(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jint var_type);

    static void notify_leak(JNIEnv* p_raw_env, jobject p_instance);

public:
    void start(jni::Env& p_env, bool force_gc);
    void setDisplayLeaks(jni::Env& p_env, bool b);
    void clean_up(jni::Env& p_env);
    bool is_closed(jni::Env& p_env);
    void close(jni::Env& p_env);
};
// clang-format on
#endif// GODOT_JVM_MEMORY_MANAGER_H
