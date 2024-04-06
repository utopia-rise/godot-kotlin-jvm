#ifndef GODOT_JVM_JVM_CONFIGURATION_H
#define GODOT_JVM_JVM_CONFIGURATION_H

#include "jni/jvm.h"

// JSON IDENTIFIER
static constexpr const char* VM_TYPE_JSON_IDENTIFIER {"vm_type"};
static constexpr const char* DEBUG_PORT_JSON_IDENTIFIER {"debug-port"};
static constexpr const char* DEBUG_ADDRESS_JSON_IDENTIFIER {"debug_address"};
static constexpr const char* WAIT_FOR_DEBUGGER_JSON_IDENTIFIER {"wait_for_debugger"};
static constexpr const char* JMX_PORT_JSON_IDENTIFIER {"jmx_port"};
static constexpr const char* MAX_STRING_SIZE_JSON_IDENTIFIER {"max_string_size"};
static constexpr const char* FORCE_GC_JSON_IDENTIFIER {"force_gc"};
static constexpr const char* DISABLE_GC_JSON_IDENTIFIER {"disable_gc"};
static constexpr const char* DISABLE_LEAK_WARNING_JSON_IDENTIFIER {"disable_closing_leaks_warning"};

// COMMAND LINE IDENTIFIER
static constexpr const char* VM_TYPE_CMD_IDENTIFIER {"--java-vm-type"};
static constexpr const char* DEBUG_PORT_CMD_IDENTIFIER {"--jvm-debug-port"};
static constexpr const char* DEBUG_ADDRESS_CMD_IDENTIFIER {"--jvm-debug-address"};
static constexpr const char* WAIT_FOR_DEBUGGER_CMD_IDENTIFIER {"--wait-for-debugger"};
static constexpr const char* JMX_PORT_CMD_IDENTIFIER {"--jvm-jmx-port"};
static constexpr const char* MAX_STRING_SIZE_CMD_IDENTIFIER {"--jvm-to-engine-max-string-size"};
static constexpr const char* FORCE_GC_CMD_IDENTIFIER {"--jvm-force-gc"};
static constexpr const char* DISABLE_GC_CMD_IDENTIFIER {"--jvm-disable-gc"};
static constexpr const char* DISABLE_LEAK_WARNING_CMD_IDENTIFIER {"--jvm-disable-closing-leaks-warning"};

// VALUE
static constexpr const char* AUTO_STRING {"auto"};
static constexpr const char* JVM_STRING {"jvm"};
static constexpr const char* GRAAL_NATIVE_IMAGE_STRING {"graal_native_image"};
static constexpr const char* ART_STRING {"art"};
static constexpr const char* TRUE_STRING {"true"};
static constexpr const char* FALSE_STRING {"false"};

// DEFAULT
static constexpr const uint64_t DEFAULT_JVM_PORT {5005};
static constexpr const char* DEFAULT_JVM_ADDRESS {"*"};

struct JvmConfiguration {
    jni::Jvm::Type vm_type;

    int64_t jvm_debug_port;
    String jvm_debug_address;
    int64_t jvm_jmx_port;
    bool wait_for_debugger;

    // 0 means "auto". The module will let the LongStringQueue::max_string_size as it is.
    uint16_t max_string_size;

    bool force_gc;
    bool disable_gc;

    bool disable_leak_warning_on_close;

    JvmConfiguration();
    ~JvmConfiguration() = default;

    static bool parse_configuration_json(const String& json_string, JvmConfiguration& json_config);
    static String export_configuration_to_json(const JvmConfiguration& configuration);

    static void parse_command_line(const List<String>& args, HashMap<String, Variant>& configuration_map);

    static void merge_with_command_line(JvmConfiguration& json_config, const HashMap<String, Variant>& cmd_map);
    static void sanitize_and_log_configuration(JvmConfiguration& config);
};

#endif// GODOT_JVM_JVM_CONFIGURATION_H
