#ifndef GODOT_JVM_CLASS_LOADER_H
#define GODOT_JVM_CLASS_LOADER_H

#include "jni/wrapper.h"

class ClassLoader {
private:
    jni::JObject wrapped {};

    explicit ClassLoader(jni::Env& p_env, jni::JObject p_wrapped);
    ~ClassLoader();

public:
    ClassLoader() = delete;
    ClassLoader(const ClassLoader&) = delete;
    void operator=(const ClassLoader&) = delete;
    ClassLoader(ClassLoader&& instance) = delete;
    void operator=(ClassLoader& $) = delete;

    jni::JClass load_class(jni::Env& env, const char* name);
    void set_as_context_loader(jni::Env& env);

    static ClassLoader* create_instance(jni::Env& env, const String& full_jar_path, const jni::JObject& p_parent_loader);
};

#endif// GODOT_JVM_CLASS_LOADER_H
