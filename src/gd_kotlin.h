#ifndef GODOT_JVM_GD_KOTLIN_H
#define GODOT_JVM_GD_KOTLIN_H

#include "jni/wrapper.h"
#include "jvm_wrapper/bootstrap.h"
#include "jvm_wrapper/memory/transfer_context.h"
#include "jvm_wrapper/registration/kt_class.h"
#include "lifecycle/jvm_user_configuration.h"

#include <core/string/ustring.h>

class GDKotlin {
    bool is_initialized {false};
    bool is_gc_started {false};

    JvmUserConfiguration user_configuration {};
    JvmLoadingConfiguration loading_configuration {};

    Bootstrap* bootstrap;

    static void _check_and_copy_jar(const String& jar_name);
    static jni::JObject _prepare_class_loader(jni::Env& p_env, jni::JvmType type);

    void fetch_user_configuration();
    void fetch_loading_configuration();

    bool check_configuration();

public:
    GDKotlin() = default;
    ~GDKotlin() = default;
    GDKotlin(const GDKotlin&) = delete;
    GDKotlin& operator=(const GDKotlin&) = delete;

    static GDKotlin& get_instance();

    const JvmUserConfiguration& get_configuration();

    void init();
    void finish();

    void register_classes(jni::Env& p_env, jni::JObjectArray p_classes);

    bool initialized() const;
};

#endif// GODOT_JVM_GD_KOTLIN_H
