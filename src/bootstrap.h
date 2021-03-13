#ifndef GODOT_JVM_BOOTSTRAP_H
#define GODOT_JVM_BOOTSTRAP_H


#include "java_instance_wrapper.h"

class Bootstrap : public JavaInstanceWrapper<Bootstrap> {
public:
    typedef void (*LoadClassesHook)(JNIEnv* p_env, jobject p_this, jobjectArray classes);
    typedef void (*UnloadClassesHook)(JNIEnv* p_env, jobject p_this, jobjectArray classes);
    typedef void (*RegisterManagedEngineTypesHook)(JNIEnv* p_env, jobject p_this, jobjectArray classes_names,
                                                   jobjectArray singleton_names, jobjectArray method_names,
                                                   jobjectArray types_of_methods);
    typedef void (*RegisterUserTypesNamesHook)(JNIEnv* p_env, jobject p_this, jobjectArray classes_names);

    Bootstrap(jni::JObject p_wrapped, jni::JObject p_class_loader);
    ~Bootstrap() = default;

    void register_hooks(jni::Env& p_env, LoadClassesHook p_load_classes_hook, UnloadClassesHook p_unload_classes_hook,
                        RegisterManagedEngineTypesHook p_register_managed_engine_types_hook,
                        RegisterUserTypesNamesHook p_user_types_names_hook);
    void init(jni::Env& p_env, bool p_is_editor, const String& p_project_path, const String& p_jar_file,
              const jni::JObject& p_class_loader);
    void finish(jni::Env& p_env);

DECLARE_JNI_METHODS(
        JNI_METHOD(INIT, "init", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V")
        JNI_METHOD(FINISH, "finish", "()V")
)
};


#endif //GODOT_JVM_BOOTSTRAP_H
