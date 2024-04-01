#ifndef GODOT_JVM_BOOTSTRAP_H
#define GODOT_JVM_BOOTSTRAP_H

#include "jvm_wrapper/jvm_instance_wrapper.h"

class Bootstrap : public JvmInstanceWrapper {
public:
    // clang-format off
    typedef void (*LoadClassesHook)(JNIEnv* p_env, jobject p_this, jobjectArray classes);
    typedef void (*RegisterManagedEngineTypesHook)(
      JNIEnv* p_env, jobject p_this, jobjectArray classes_names,
      jobjectArray singleton_names
      );
    // clang-format on

    static LoadClassesHook load_classes;
    static RegisterManagedEngineTypesHook register_engine_type;

    static void register_hooks(LoadClassesHook p_load_classes_hook, RegisterManagedEngineTypesHook p_register_managed_engine_types_hook);

    Bootstrap(jni::JObject p_wrapped);
    ~Bootstrap() = default;

    void init(jni::Env& p_env, bool p_is_editor, const String& p_project_path, const String& p_jar_path, const String& p_jar_file, const jni::JObject& p_class_loader);
    void finish(jni::Env& p_env);

    // clang-format off
    DECLARE_JNI_METHODS(
            JNI_METHOD(INIT, "init", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V")
            JNI_METHOD(FINISH, "finish", "()V")
    )
    // clang-format on
};

#endif// GODOT_JVM_BOOTSTRAP_H
