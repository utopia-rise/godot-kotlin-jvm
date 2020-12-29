#include <core/os/os.h>
#include "jvm_config.h"

// If changed, remember to change also TransferContext::bufferCapacity on JVM side
const int DEFAULT_SHARED_BUFFER_SIZE{20'000'000};
const int DEFAULT_JVM_GARBAGE_COLLECTOR_THREAD_PERIOD{500};

JvmConfig::JvmConfig(const String& p_jvm_debug_port, const String& p_jvm_debug_address, const String& p_jvm_jmx_port,
                     bool p_is_gc_force_mode, bool p_is_gc_activated, long p_gc_thread_period_interval,
                     int p_jvm_to_engine_shared_buffer_size, bool p_should_display_leaked_jvm_instances_on_close)
        : jvm_debug_port(p_jvm_debug_port), jvm_debug_address(p_jvm_debug_address), jvm_jmx_port(p_jvm_jmx_port),
          is_gc_force_mode(p_is_gc_force_mode), is_gc_activated(p_is_gc_activated),
          gc_thread_period_interval(p_gc_thread_period_interval),
          jvm_to_engine_shared_buffer_size(p_jvm_to_engine_shared_buffer_size),
          should_display_leaked_jvm_instances_on_close(p_should_display_leaked_jvm_instances_on_close) {

}

JvmConfig JvmConfig::from_godot_command_line_args() {
    String jvm_debug_port;
    String jvm_debug_address;
    String jvm_jmx_port;
    bool is_gc_force_mode{false};
    bool is_gc_activated{true};
    long gc_thread_period_interval{DEFAULT_JVM_GARBAGE_COLLECTOR_THREAD_PERIOD};
    int jvm_to_engine_shared_buffer_size{DEFAULT_SHARED_BUFFER_SIZE};
    bool should_display_leaked_jvm_instances_on_close{true};

    const List<String>& cmdline_args{OS::get_singleton()->get_cmdline_args()};
    for (int i = 0; i < cmdline_args.size(); ++i) {
        const String& cmd_arg{cmdline_args[i]};
        if (cmd_arg.find("--jvm-debug-port") >= 0) {
            if (split_jvm_debug_argument(cmd_arg, jvm_debug_port) == OK) {
                if (jvm_debug_port.empty()) {
                    jvm_debug_port = "5005";
                }
            } else {
                break;
            }
        } else if (cmd_arg.find("--jvm-debug-address") >= 0) {
            if (split_jvm_debug_argument(cmd_arg, jvm_debug_address) == OK) {
                if (jvm_debug_address.empty()) {
                    jvm_debug_address = "*";
                }
            } else {
                break;
            }
        } else if (cmd_arg.find("--jvm-jmx-port") >= 0) {
            if (split_jvm_debug_argument(cmd_arg, jvm_jmx_port) == OK) {
                if (jvm_jmx_port.empty()) {
                    jvm_jmx_port = "9010";
                }
            }
        } else if (cmd_arg.find("--jvm-gc-thread-period-millis") >= 0) {
            String result;
            if (split_jvm_debug_argument(cmd_arg, result) == OK) {
                gc_thread_period_interval = result.to_int64();
            }
        } else if (cmd_arg.find("--jvm-to-engine-shared-buffer-size") >= 0) {
            String result;
            if (split_jvm_debug_argument(cmd_arg, result) == OK) {
                jvm_to_engine_shared_buffer_size = result.to_int();
                //TODO: Link to documentation
                WARN_PRINT(vformat("Warning ! Buffer capacity was changed to %s, this is not a recommended practice",
                                   result))
            }
        } else if (cmd_arg == "--jvm-force-gc") {
            is_gc_force_mode = true;
            //TODO: Link to documentation
            WARN_PRINT("GC is started in force mode, this should only be done for debugging purpose")
        } else if (cmd_arg == "--jvm-disable-gc") {
            is_gc_activated = false;
            //TODO: Link to documentation
            WARN_PRINT("GC thread was disable. --jvm-disable-gc should only be used for debugging purpose")
        } else if (cmd_arg == "--jvm-disable-closing-leaks-warning") {
            WARN_PRINT("JVM leaked instances will not be displayed in console (see --jvm-disable-closing-leaks-warning)")
            should_display_leaked_jvm_instances_on_close = false;
        }
    }

    if (!jvm_debug_port.empty() || !jvm_debug_address.empty()) {
        if (jvm_debug_address.empty()) {
            jvm_debug_address = "*";
        } else if (jvm_debug_port.empty()) {
            jvm_debug_port = "5005";
        }
    }

    return JvmConfig(jvm_debug_port, jvm_debug_address, jvm_jmx_port, is_gc_force_mode, is_gc_activated,
                     gc_thread_period_interval, jvm_to_engine_shared_buffer_size,
                     should_display_leaked_jvm_instances_on_close);
}

Error JvmConfig::split_jvm_debug_argument(const String& cmd_arg, String& result) {
    Vector<String> jvm_debug_split{cmd_arg.split("=")};

    if (jvm_debug_split.size() == 2) {
        result = jvm_debug_split[1];
    } else if (jvm_debug_split.size() != 1) {
        print_error(vformat("Unrecognized --jvm-debug arg pattern: %s", cmd_arg));
        return FAILED;
    }
    return OK;
}