#ifndef GODOT_JVM_GD_KOTLIN_CONFIGURATION_H
#define GODOT_JVM_GD_KOTLIN_CONFIGURATION_H


#include <core/reference.h>
#include <modules/kotlin_jvm/src/jni/jvm.h>
#include "long_string_queue.h"

class GdKotlinConfiguration {

public:
    String to_json();
    static constexpr const char* gd_kotlin_configuration_path{"res://godot_kotlin_configuration.json"};
    static GdKotlinConfiguration load_gd_kotlin_configuration_from_json_and_args();
    void assemble_jinit_args(jni::InitArgs* args);

    jni::Jvm::Type get_vm_type() const;
    void set_vm_type(jni::Jvm::Type p_type);

    const String& get_jvm_debug_port() const; // No setter as it would have no effect after the vm is already started

    const String& get_jvm_debug_address() const; // No setter as it would have no effect after the vm is already started

    const String& get_jvm_jmx_port() const; // No setter as it would have no effect after the vm is already started

    bool get_is_waiting_for_debugger() const; // No setter as it would have no effect after the vm is already started

    bool get_gc_force_mode() const;
    void set_gc_force_mode(bool gc_force_mode);

    bool get_gc_activated() const;
    void set_gc_activated(bool gc_activated);

    int get_max_string_size() const;
    void set_max_string_size(int p_max_string_size);

    bool get_should_display_leaked_jvm_instances_on_close() const;
    void set_should_display_leaked_jvm_instances_on_close(bool display_leaked_jvm_instances_on_close);

    ~GdKotlinConfiguration() = default;

    GdKotlinConfiguration();

private:

    jni::Jvm::Type vm_type{jni::Jvm::JVM};
    String jvm_debug_port;
    String jvm_debug_address;
    String jvm_jmx_port;
    bool is_waiting_for_debugger{true};
    bool is_gc_force_mode{false};
    bool is_gc_activated{true};
    int max_string_size{LongStringQueue::max_string_size};
    bool should_display_leaked_jvm_instances_on_close{true};

    static constexpr const char* vm_type_identifier{"vm_type"};
    static constexpr const char* jvm_debug_port_identifier{"jvm_debug_port"};
    static constexpr const char* jvm_debug_address_identifier{"jvm_debug_address"};
    static constexpr const char* jvm_jmx_port_identifier{"jvm_jmx_port"};
    static constexpr const char* is_waiting_for_debugger_identifier{"is_waiting_for_debugger"};
    static constexpr const char* max_string_size_identifier{"max_string_size"};
    static constexpr const char* jvm_force_gc_identifier{"jvm-force-gc"};
    static constexpr const char* jvm_disable_gc_identifier{"jvm-disable-gc"};
    static constexpr const char* jvm_disable_closing_leaks_identifier{"jvm-disable-closing-leaks-warning"};

    static constexpr const char* jvm_string_identifier{"jvm"};
    static constexpr const char* graal_native_image_string_identifier{"graal_native_image"};
    static constexpr const char* art_string_identifier{"art"};

    static GdKotlinConfiguration from_json(const String& json_string);

    static Error split_jvm_debug_argument(const String& cmd_arg, String& result);

    static jni::Jvm::Type vm_type_from_string(const String& vm_type_as_string);

    GdKotlinConfiguration(jni::Jvm::Type p_vm_type, int p_max_string_size);
};


#endif //GODOT_JVM_GD_KOTLIN_CONFIGURATION_H
