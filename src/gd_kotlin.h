#ifndef GODOT_JVM_GD_KOTLIN_H
#define GODOT_JVM_GD_KOTLIN_H

#include "jni/wrapper.h"
#include "jvm_wrapper/bootstrap.h"
#include "jvm_wrapper/memory/transfer_context.h"
#include "jvm_wrapper/registration/kt_class.h"
#include "lifecycle/jvm_configuration.h"

#include <core/string/ustring.h>

class GDKotlin {
private:
    GDKotlin();
    ~GDKotlin() = default;

    Bootstrap* bootstrap;
    bool is_gc_started;
    JvmConfiguration configuration;

    static void _check_and_copy_jar(const String& jar_name);
    static jni::JObject _prepare_class_loader(jni::Env& p_env, jni::JvmType type);

    bool check_configuration();

    bool is_initialized;

    Vector<Pair<String, String>> configuration_errors;

    static void fetchJvmConfiguration(JvmConfiguration& jvm_configuration);

public:
    GDKotlin(const GDKotlin&) = delete;
    GDKotlin& operator=(const GDKotlin&) = delete;

    static GDKotlin& get_instance();

    const JvmConfiguration& get_configuration();

    void init();
    void finish();

    void register_classes(jni::Env& p_env, jni::JObjectArray p_classes);

    bool initialized() const;
    const Vector<Pair<String, String>>& get_configuration_errors() const;
};

#endif// GODOT_JVM_GD_KOTLIN_H
