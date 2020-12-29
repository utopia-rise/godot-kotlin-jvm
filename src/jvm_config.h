#ifndef GODOT_JVM_JVM_CONFIG_H
#define GODOT_JVM_JVM_CONFIG_H


#include <core/ustring.h>
#include <core/list.h>
#include <modules/kotlin_jvm/src/jni/init_args.h>

struct JvmConfig {

    /**
     * Jvm debug port. Default value will be 5005 if no port is specified or if --jvm-debug-address is encountered.
     *
     * Use --jvm-debug-port or --jvm-debug-port=XXXXX
     */
    String jvm_debug_port;

    /**
     * Jvm debug address. Default value will be * if no value is specified or if --jvm-debug-port is encountered.
     *
     * Use --jvm-debug-address or --jvm-debug-address=address
     */
    String jvm_debug_address;

    /**
     * Jvm jmx address. Default value will be 9010 if no value is specified.
     *
     * Use --jvm-jmx-port or --jvm-jmx-port=XXXXX
     */
    String jvm_jmx_port;

    /**
     * Set if Jvm garbage collector will be forced. Should only be set to true for debug purpose.
     *
     * Use --jvm-force-gc
     */
    bool is_gc_force_mode;

    /**
     * Set if Jvm garbage collection of godot ref counted object should be activated. Should only be set to false for
     * debug purpose.
     *
     * Use --jvm-disable-gc
     */
    bool is_gc_activated;

    /**
     * Override jvm garbage collection thread of ref counted godot object period interval.
     *
     * Use --jvm-gc-thread-period-millis=millis
     */
    long gc_thread_period_interval;

    /**
     * Override default shared buffer (between engine and JVM) size. This should be used only for debug purpose.
     *
     * Use --jvm-to-engine-shared-buffer-size
     */
    int jvm_to_engine_shared_buffer_size;

    /**
     * Disable JVM instances leak warning on engine closing. Here for debug.
     *
     * Use --jvm-disable-closing-leaks-warning
     */
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
