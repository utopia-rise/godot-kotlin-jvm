#ifndef GODOT_JVM_BOOTSTRAP_H
#define GODOT_JVM_BOOTSTRAP_H


#include "java_instance_wrapper.h"

class Bootstrap : public JavaInstanceWrapper<Bootstrap> {
public:
    typedef void (*LoadClassesHook)(JNIEnv* p_env, jobject p_this, jobjectArray classes);
    typedef void (*UnloadClassesHook)(JNIEnv* p_env, jobject p_this, jobjectArray classes);
    typedef void (*RegisterManagedEngineTypes)(JNIEnv* p_env, jobject p_this, jobjectArray classes_names,
            jobjectArray singleton_names, jobjectArray method_names, jobjectArray types_of_methods);

    Bootstrap(jni::JObject p_wrapped, jni::JObject p_class_loader);
    ~Bootstrap() = default;

    void register_hooks(jni::Env& p_env, LoadClassesHook p_load_classes_hook, UnloadClassesHook p_unload_classes_hook,
                        RegisterManagedEngineTypes p_register_managed_engine_types_hook);
    void init(jni::Env& env, bool p_is_editor, const String& p_project_dir);
    void finish(jni::Env& p_env);

DECLARE_JNI_METHODS(
        JNI_METHOD(INIT, "init", "(ZLjava/lang/String;)V")
        JNI_METHOD(FINISH, "finish", "()V")
)
};


#endif //GODOT_JVM_BOOTSTRAP_H
