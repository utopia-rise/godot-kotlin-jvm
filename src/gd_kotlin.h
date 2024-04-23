#ifndef GODOT_JVM_GD_KOTLIN_H
#define GODOT_JVM_GD_KOTLIN_H

#include "jni/wrapper.h"
#include "jvm_wrapper/bootstrap.h"
#include "jvm_wrapper/memory/transfer_context.h"
#include "jvm_wrapper/registration/kt_class.h"
#include "lifecycle/jvm_options.h"
#include "lifecycle/jvm_user_configuration.h"

#include <core/string/ustring.h>

class GDKotlin {
    bool is_gc_started {false};

    JvmUserConfiguration user_configuration {};
    JvmOptions jvm_options {};

    Bootstrap* bootstrap {nullptr};

    void fetch_user_configuration();
    void set_jvm_options();

#ifndef TOOLS_ENABLED
    static String copy_new_file_to_user_dir(const String& file_name);
#endif

#ifdef DYNAMIC_JVM
    void* jvm_dynamic_library_handle {nullptr};
    void load_dynamic_lib();
#ifdef TOOLS_ENABLED
    static String get_path_to_environment_jvm();
#endif
    static String get_path_to_embedded_jvm();
    static String get_path_to_native_image();
    void unload_dynamic_lib();
#endif

    ClassLoader* load_bootstrap() const;
    void initialize_core_library(ClassLoader* class_loader);
    void load_user_code(ClassLoader* bootstrap_class_loader);

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
};

#endif// GODOT_JVM_GD_KOTLIN_H
