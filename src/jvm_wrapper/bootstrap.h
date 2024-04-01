#ifndef GODOT_JVM_BOOTSTRAP_H
#define GODOT_JVM_BOOTSTRAP_H

#include "jvm_wrapper/jvm_instance_wrapper.h"

JVM_INSTANCE_WRAPPER(Bootstrap, "godot.runtime.Bootstrap") {

    // clang-format off
    JNI_METHOD(INIT)
    JNI_METHOD(FINISH)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(INIT, "init", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V")
        INIT_JNI_METHOD(FINISH, "finish", "()V")
        INIT_NATIVE_METHOD("loadClasses", "([Lgodot/core/KtClass;)V", Bootstrap::load_classes)
        INIT_NATIVE_METHOD("registerManagedEngineTypes", "([Ljava/lang/String;[Ljava/lang/String;)V", Bootstrap::register_engine_type)
    )

public:

    typedef void (*LoadClassesHook)(JNIEnv* p_env, jobject p_this, jobjectArray classes);
    typedef void (*RegisterManagedEngineTypesHook)(
      JNIEnv* p_env, jobject p_this, jobjectArray classes_names,
      jobjectArray singleton_names
      );
    // clang-format on

    static LoadClassesHook load_classes;
    static RegisterManagedEngineTypesHook register_engine_type;

    static void register_hooks(LoadClassesHook p_load_classes_hook, RegisterManagedEngineTypesHook p_register_managed_engine_types_hook);

    explicit Bootstrap(jni::JObject p_wrapped);
    ~Bootstrap() = default;

    void init(jni::Env& p_env, bool p_is_editor, const String& p_project_path, const String& p_jar_path, const String& p_jar_file, const jni::JObject& p_class_loader);
    void finish(jni::Env& p_env);
};

#endif// GODOT_JVM_BOOTSTRAP_H
