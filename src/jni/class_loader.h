#ifndef GODOT_JVM_CLASS_LOADER_H
#define GODOT_JVM_CLASS_LOADER_H

#include "wrapper.h"

class ClassLoader {
private:
    jni::JObject class_loader;

    ClassLoader();
    ~ClassLoader() = default;

    _FORCE_INLINE_ static ClassLoader& get_instance();

public:
    ClassLoader(const ClassLoader&) = delete;
    void operator=(const ClassLoader&) = delete;

    ClassLoader(ClassLoader&& instance) = delete;
    void operator=(ClassLoader& $) = delete;

    static void set_default_loader(jni::JObject& p_class_loader);

    static jni::JObject& get_default_loader();

    static jni::JObject provide_loader(jni::Env& env, const String& full_jar_path, const jni::JObject& p_parent_loader);

    static void delete_default_loader(jni::Env& env);
};

#endif// GODOT_JVM_CLASS_LOADER_H
