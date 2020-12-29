#ifndef GODOT_JVM_JVM_CONFIG_H
#define GODOT_JVM_JVM_CONFIG_H


#include <core/ustring.h>
#include <core/list.h>
#include <modules/kotlin_jvm/src/jni/init_args.h>

struct JvmConfig {
    String jvm_debug_port;
    String jvm_debug_address;
    String jvm_jmx_port;
    bool is_gc_force_mode;
    bool is_gc_activated;
    long gc_thread_period_interval;
    int jvm_to_engine_shared_buffer_size;
    bool should_display_leaked_jvm_instances_on_close;

    static JvmConfig from_godot_command_line_args();

    ~JvmConfig() = default;
    JvmConfig() = delete;

private:
    JvmConfig(
            const String& p_jvm_debug_port,
            const String& p_jvm_debug_address,
            const String& p_jvm_jmx_port,
            bool p_is_gc_force_mode,
            bool p_is_gc_activated,
            long p_gc_thread_period_interval,
            int p_jvm_to_engine_shared_buffer_size,
            bool p_should_display_leaked_jvm_instances_on_close
    );

    static Error split_jvm_debug_argument(const String& cmd_arg, String& result);
};


#endif //GODOT_JVM_JVM_CONFIG_H
