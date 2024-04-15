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
public:
    // Values should be in the correct initialization order, the number matters.
    enum State {
        NOT_STARTED = 0,// Default stated;
        JVM_LIBRARY_LOADED = 1,// Only for Dynamic loading
        JVM_STARTED = 2,// Or retrieved in the case of Android
        BOOTSTRAP_LOADED = 3,
        CORE_LIBRARY_INITIALIZED = 4,
        JVM_SCRIPTS_INITIALIZED = 5,
    };

private:
    State state {State::NOT_STARTED};

    JvmUserConfiguration user_configuration {};
    JvmOptions jvm_options {};

    ClassLoader* bootstrap_class_loader {nullptr};
    Bootstrap* bootstrap {nullptr};

    void fetch_user_configuration();
    void set_jvm_options();

#ifndef TOOLS_ENABLED
    static String copy_new_file_to_user_dir(const String& file_name);
#endif

#ifdef DYNAMIC_JVM
    void* jvm_dynamic_library_handle {nullptr};
    bool load_dynamic_lib();
#ifdef TOOLS_ENABLED
    static String get_path_to_environment_jvm();
#endif
    static String get_path_to_embedded_jvm();
    static String get_path_to_native_image();
    void unload_dynamic_lib();
#endif

    bool load_bootstrap();
    bool initialize_core_library();

public:
    GDKotlin() = default;
    ~GDKotlin() = default;
    GDKotlin(const GDKotlin&) = delete;
    GDKotlin& operator=(const GDKotlin&) = delete;

    static GDKotlin& get_instance();
    const JvmUserConfiguration& get_configuration();
    State get_state() const;

    State init();
    void load_user_code();
    void finish();

    void register_classes(jni::Env& p_env, jni::JObjectArray p_classes);
};

#endif// GODOT_JVM_GD_KOTLIN_H
