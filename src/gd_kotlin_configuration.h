#ifndef GODOT_JVM_GD_KOTLIN_CONFIGURATION_H
#define GODOT_JVM_GD_KOTLIN_CONFIGURATION_H

#include "jni/jvm.h"

class GdKotlinConfiguration {
public:
    String to_json();
    static GdKotlinConfiguration from_json(const String& json_string);
    static GdKotlinConfiguration load_gd_kotlin_configuration_or_default(const String& configuration_path);

    jni::Jvm::Type get_vm_type() const;
    void set_vm_type(jni::Jvm::Type p_type);

    int get_max_string_size() const;
    void set_max_string_size(int p_max_string_size);

    String get_scene_jvm_args() const;
    void set_jvm_scene_args(String p_scene_jvm_args);

    ~GdKotlinConfiguration() = default;

    static constexpr const char* jvm_string_identifier {"jvm"};
    static constexpr const char* graal_native_image_string_identifier {"graal_native_image"};
    static constexpr const char* art_string_identifier {"art"};

    GdKotlinConfiguration();

private:
    jni::Jvm::Type vm_type;
    int max_string_size;
    String scene_jvm_args;

    static constexpr const char* vm_type_identifier {"vm_type"};
    static constexpr const char* max_string_size_identifier {"max_string_size"};
    static constexpr const char* scene_jvm_args_identifier {"scene_jvm_args"};

    GdKotlinConfiguration(jni::Jvm::Type p_vm_type, int p_max_string_size, String p_scene_jvm_args);
};

#endif// GODOT_JVM_GD_KOTLIN_CONFIGURATION_H
