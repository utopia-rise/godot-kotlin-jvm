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
    // clang-format on

public:

    static void load_classes(JNIEnv* p_env, jobject p_this, jobjectArray p_classes);
    static void register_engine_type(
      JNIEnv* p_env, jobject p_this, jobjectArray p_classes_names,
      jobjectArray p_singleton_names
    );

    Bootstrap(jni::Env& p_env, jni::JObject p_wrapped);
    ~Bootstrap() = default;

    void init(jni::Env& p_env, bool p_is_editor, const String& p_project_path, const String& p_jar_path, const String& p_jar_file, const jni::JObject& p_class_loader);
    void finish(jni::Env& p_env);
};

#endif// GODOT_JVM_BOOTSTRAP_H
