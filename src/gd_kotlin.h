#ifndef GODOT_JVM_GD_KOTLIN_H
#define GODOT_JVM_GD_KOTLIN_H

#include "jvm_wrapper/bootstrap.h"
#include "lifecycle/jvm_manager.h"
#include "lifecycle/jvm_options.h"
#include "lifecycle/jvm_user_configuration.h"
#include "resource_format/java_archive.h"

#include <core/string/ustring.h>

class GDKotlin {
    friend class GdjLanguage;

public:
    // Values should be in the correct initialization order, the number matters.
    enum State {
        NOT_STARTED = 0,// Default state;
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
    Ref<JavaArchive> jar;
    Object* callable_middleman; //TODO: delete when https://github.com/godotengine/godot/issues/95231 is resolved

    void fetch_user_configuration();
    void set_jvm_options();

#ifndef TOOLS_ENABLED
    static String copy_new_file_to_user_dir(const String& file_name);
#endif

#ifdef DYNAMIC_JVM
    void* jvm_dynamic_library_handle {nullptr};
    bool load_dynamic_lib();
    void unload_dynamic_lib();
#ifdef TOOLS_ENABLED
    static String get_path_to_environment_jvm();
#endif
    static String get_path_to_embedded_jvm();
    static String get_path_to_native_image();
#endif

    bool load_bootstrap();
    void unload_boostrap();

    bool initialize_core_library();
    void finalize_core_library() const;

    bool load_user_code();
    void unload_user_code();

public:
    GDKotlin() = default;
    ~GDKotlin() = default;
    GDKotlin(const GDKotlin&) = delete;
    GDKotlin& operator=(const GDKotlin&) = delete;

    static GDKotlin& get_instance();
    const JvmUserConfiguration& get_configuration();
    State get_state();

    void initialize_up_to(State target_state);
    void finalize_down_to(State target_state);

#ifdef DYNAMIC_JVM
    void reload_user_code();
#endif

    //TODO: delete when https://github.com/godotengine/godot/issues/95231 is resolved
    Object* get_callable_middleman() const;

#ifdef DEBUG_ENABLED
    void validate_state();
#endif
};

#endif// GODOT_JVM_GD_KOTLIN_H
