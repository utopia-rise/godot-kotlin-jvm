#include "jvm_configuration.h"

#include "core/io/json.h"

JvmConfiguration::JvmConfiguration() :
  vm_type {jni::Jvm::Type::NONE},
  jvm_debug_port {-1},
  jvm_debug_address {""},
  jvm_jmx_port {-1},
  jvm_args {""},
  wait_for_debugger {false},
  max_string_size {0},
  force_gc {false},
  disable_gc {false},
  disable_leak_warning_on_close {false} {}

bool JvmConfiguration::parse_configuration_json(const String& json_string, JvmConfiguration& json_config) {
    bool is_invalid = false;
    JSON json;
    Error error {json.parse(json_string)};
    Variant result {json.get_data()};

    if (error != OK || result.get_type() != Variant::DICTIONARY) {
        LOG_ERROR("Error parsing Godot Kotlin configuration file! Falling back to default configuration");
        return false;
    }

    Dictionary json_dict = result;
    if (json_dict.has(VM_TYPE_JSON_IDENTIFIER)) {
        String value = json_dict[VM_TYPE_JSON_IDENTIFIER];
        if (value == AUTO_STRING) {
            json_config.vm_type = jni::Jvm::NONE;
        } else if (value == JVM_STRING) {
            json_config.vm_type = jni::Jvm::JVM;
        } else if (value == GRAAL_NATIVE_IMAGE_STRING) {
            json_config.vm_type = jni::Jvm::GRAAL_NATIVE_IMAGE;
        } else if (value == ART_STRING) {
            json_config.vm_type = jni::Jvm::ART;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Wrong JVM type in configuration file: %s. It will be ignored", value));
        }
    } else if (json_dict.has(DEBUG_PORT_JSON_IDENTIFIER)) {
        uint16_t port = json_dict[DEBUG_PORT_JSON_IDENTIFIER];
        if (port >= 0 && port <= 65535) {
            json_config.jvm_debug_port = port;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid JVM port value in configuration file: %s. It will be ignored", port));
        }
    } else if (json_dict.has(DEBUG_ADDRESS_JSON_IDENTIFIER)) {
        String address = json_dict[DEBUG_ADDRESS_JSON_IDENTIFIER];
        if (address.is_valid_ip_address()) {
            json_config.jvm_debug_address = address;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid JVM address value in configuration file: %s. It will be ignored", address));
        }
    } else if (json_dict.has(WAIT_FOR_DEBUGGER_JSON_IDENTIFIER)) {
        String boolean = json_dict[WAIT_FOR_DEBUGGER_JSON_IDENTIFIER];
        if (boolean == TRUE_STRING) {
            json_config.wait_for_debugger = true;
        } else if (boolean == FALSE_STRING) {
            json_config.wait_for_debugger = false;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid Waiting for Debugger value in configuration file: %s. It will be ignored", boolean));
        }
    } else if (json_dict.has(JMX_PORT_JSON_IDENTIFIER)) {
        uint16_t port = json_dict[JMX_PORT_JSON_IDENTIFIER];
        if (port >= 0 && port <= 65535) {
            json_config.jvm_jmx_port = port;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid JMX port value in configuration file: %s. It will be ignored", port));
        }
    } else if (json_dict.has(MAX_STRING_SIZE_JSON_IDENTIFIER)) {
        String size = json_dict[MAX_STRING_SIZE_JSON_IDENTIFIER];
        if (size.is_valid_int()) {
            json_config.jvm_jmx_port = size.to_int();
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid Maximum String Size value in configuration file: %s. It will be ignored", size));
        }
    } else if (json_dict.has(FORCE_GC_JSON_IDENTIFIER)) {
        String boolean = json_dict[FORCE_GC_JSON_IDENTIFIER];
        if (boolean == TRUE_STRING) {
            json_config.force_gc = true;
        } else if (boolean == FALSE_STRING) {
            json_config.force_gc = false;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid Force GC value in configuration file: %s. It will be ignored", boolean));
        }
    } else if (json_dict.has(DISABLE_GC_JSON_IDENTIFIER)) {
        String boolean = json_dict[DISABLE_GC_JSON_IDENTIFIER];
        if (boolean == TRUE_STRING) {
            json_config.disable_gc = true;
        } else if (boolean == FALSE_STRING) {
            json_config.disable_gc = false;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid Disable GC value in configuration file: %s. It will be ignored", boolean));
        }
    } else if (json_dict.has(DISABLE_LEAK_WARNING_JSON_IDENTIFIER)) {
        String boolean = json_dict[DISABLE_LEAK_WARNING_JSON_IDENTIFIER];
        if (boolean == TRUE_STRING) {
            json_config.disable_leak_warning_on_close = true;
        } else if (boolean == FALSE_STRING) {
            json_config.disable_leak_warning_on_close = false;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid Disable Leak Warning value in configuration file: %s. It will be ignored", boolean));
        }
    } else if (json_dict.has(JVM_ARGUMENTS_JSON_IDENTIFIER)) {
        json_config.jvm_args = json_dict[JVM_ARGUMENTS_JSON_IDENTIFIER];
    }

    return is_invalid;
}

String JvmConfiguration::export_configuration_to_json(const JvmConfiguration& configuration) {
    // This function assumes all values are valid.
    Dictionary json;

    String vm_type_value;
    switch (configuration.vm_type) {
        case jni::Jvm::NONE:
            vm_type_value = AUTO_STRING;
            break;
        case jni::Jvm::Type::JVM:
            vm_type_value = JVM_STRING;
            break;
        case jni::Jvm::Type::GRAAL_NATIVE_IMAGE:
            vm_type_value = GRAAL_NATIVE_IMAGE_STRING;
            break;
        case jni::Jvm::Type::ART:
            vm_type_value = ART_STRING;
            break;
    }
    json[VM_TYPE_JSON_IDENTIFIER] = vm_type_value;

    if (configuration.jvm_debug_port >= 0) { json[DEBUG_PORT_JSON_IDENTIFIER] = configuration.jvm_debug_port; }

    if (!configuration.jvm_debug_address.is_empty()) {
        json[DEBUG_ADDRESS_JSON_IDENTIFIER] = configuration.jvm_debug_address;
    }

    json[WAIT_FOR_DEBUGGER_JSON_IDENTIFIER] = configuration.wait_for_debugger;

    if (configuration.jvm_jmx_port >= 0) { json[DEBUG_PORT_JSON_IDENTIFIER] = configuration.jvm_jmx_port; }

    json[MAX_STRING_SIZE_JSON_IDENTIFIER] = configuration.max_string_size;

    json[FORCE_GC_JSON_IDENTIFIER] = configuration.force_gc;
    json[DISABLE_GC_JSON_IDENTIFIER] = configuration.disable_gc;
    json[DISABLE_LEAK_WARNING_JSON_IDENTIFIER] = configuration.disable_leak_warning_on_close;
    json[DISABLE_LEAK_WARNING_JSON_IDENTIFIER] = configuration.disable_leak_warning_on_close;
    json[JVM_ARGUMENTS_JSON_IDENTIFIER] = configuration.jvm_args;

    return Variant(json).to_json_string();
}

Error split_argument(const String& cmd_arg, String& identifier, String& value) {
    Vector<String> jvm_debug_split {cmd_arg.split("=")};

    if (jvm_debug_split.size() == 2) {
        identifier = jvm_debug_split[0];
        value = jvm_debug_split[1];
    } else if (jvm_debug_split.size() == 1) {
        identifier = jvm_debug_split[0];
        value = "";
    } else {
        LOG_ERROR(vformat("Can't parse command-line argument: %s", cmd_arg));
        return Error::ERR_PARSE_ERROR;
    }
    return OK;
}

bool get_cmd_bool_or_default(const String& value, bool default_if_empty) {
    if (value.is_empty()) {
        return default_if_empty;
    } else if (value == TRUE_STRING) {
        return true;
    } else if (value == FALSE_STRING) {
        return false;
    } else {
        LOG_ERROR(vformat("Command line argument can't be parsed as a boolean value: %s. It will be treated as false", value));
        return false;
    }
}

void JvmConfiguration::parse_command_line(const List<String>& args, HashMap<String, Variant>& configuration_map) {
    // We use a HashMap instead of JvmConfiguration so we can still make the difference between a JvmConfiguration
    // default value and the absence of the matching command line argument. Knowing this is essential when merging with
    // the json configuration later.

    // Keep in sync with https://godot-kotl.in/en/latest/advanced/commandline-args/
    for (const auto& arg : args) {
        String identifier;
        String value;
        if (split_argument(arg, identifier, value) != Error::OK) { continue; }

        if (identifier == VM_TYPE_CMD_IDENTIFIER) {
            if (value == AUTO_STRING) {
                configuration_map[VM_TYPE_CMD_IDENTIFIER] = jni::Jvm::NONE;
            } else if (value == JVM_STRING) {
                configuration_map[VM_TYPE_CMD_IDENTIFIER] = jni::Jvm::JVM;
            } else if (value == GRAAL_NATIVE_IMAGE_STRING) {
                configuration_map[VM_TYPE_CMD_IDENTIFIER] = jni::Jvm::GRAAL_NATIVE_IMAGE;
            } else if (value == ART_STRING) {
                configuration_map[VM_TYPE_CMD_IDENTIFIER] = jni::Jvm::ART;
            } else {
                LOG_WARNING("Wrong JVM type in command line arguments. It will be ignored");
            }
        } else if (identifier == DEBUG_PORT_CMD_IDENTIFIER) {
            uint16_t port = -1;
            if (value.is_valid_int()) { port = value.to_int(); }
            if (port >= 0 && port <= 65535) {
                configuration_map[DEBUG_PORT_CMD_IDENTIFIER] = port;
            } else {
                LOG_WARNING(vformat("Invalid JVM port value in command line arguments: %s. It will be ignored", port));
            }
        } else if (identifier == DEBUG_ADDRESS_CMD_IDENTIFIER) {
            if (value.is_valid_ip_address()) {
                configuration_map[DEBUG_ADDRESS_CMD_IDENTIFIER] = value;
            } else {
                LOG_WARNING(vformat("Invalid JVM address value command line arguments: %s. It will be ignored", value));
            }
        } else if (identifier == WAIT_FOR_DEBUGGER_CMD_IDENTIFIER) {
            configuration_map[WAIT_FOR_DEBUGGER_CMD_IDENTIFIER] = get_cmd_bool_or_default(value, TRUE_STRING);
        } else if (identifier == JMX_PORT_CMD_IDENTIFIER) {
            uint16_t port = -1;
            if (value.is_valid_int()) { port = value.to_int(); }
            if (port >= 0 && port <= 65535) {
                configuration_map[JMX_PORT_CMD_IDENTIFIER] = port;
            } else {
                LOG_WARNING(vformat("Invalid JMX port value command line arguments: %s. It will be ignored", port));
            }
        } else if (identifier == MAX_STRING_SIZE_CMD_IDENTIFIER) {
            uint16_t size = -1;
            if (value.is_valid_int()) { size = value.to_int(); }
            if (value.is_valid_int() && size >= 0) {
                configuration_map[MAX_STRING_SIZE_CMD_IDENTIFIER] = size;
            } else {
                LOG_WARNING(vformat("Invalid Maximum String Size value in configuration file: %s. It will be ignored", size));
            }
        } else if (identifier == FORCE_GC_CMD_IDENTIFIER) {
            configuration_map[FORCE_GC_CMD_IDENTIFIER] = get_cmd_bool_or_default(value, TRUE_STRING);
        } else if (identifier == DISABLE_GC_CMD_IDENTIFIER) {
            configuration_map[DISABLE_GC_CMD_IDENTIFIER] = get_cmd_bool_or_default(value, TRUE_STRING);
        } else if (identifier == DISABLE_LEAK_WARNING_CMD_IDENTIFIER) {
            configuration_map[DISABLE_LEAK_WARNING_CMD_IDENTIFIER] = get_cmd_bool_or_default(value, TRUE_STRING);
        }
    }
}

template<typename T>
void replace_json_value_by_cmd_value(const HashMap<String, Variant>& map, T& json_value, const String& cmd_key) {
    if (map.has(cmd_key)) { json_value = VariantCaster<T>::cast(map[cmd_key]); }
}

void JvmConfiguration::merge_with_command_line(JvmConfiguration& json_config, const HashMap<String, Variant>& cmd_map) {
    replace_json_value_by_cmd_value(cmd_map, json_config.vm_type, VM_TYPE_CMD_IDENTIFIER);
    replace_json_value_by_cmd_value(cmd_map, json_config.jvm_debug_port, DEBUG_PORT_CMD_IDENTIFIER);
    replace_json_value_by_cmd_value(cmd_map, json_config.jvm_debug_address, DEBUG_ADDRESS_CMD_IDENTIFIER);
    replace_json_value_by_cmd_value(cmd_map, json_config.wait_for_debugger, WAIT_FOR_DEBUGGER_CMD_IDENTIFIER);
    replace_json_value_by_cmd_value(cmd_map, json_config.jvm_jmx_port, JMX_PORT_CMD_IDENTIFIER);
    replace_json_value_by_cmd_value(cmd_map, json_config.max_string_size, MAX_STRING_SIZE_CMD_IDENTIFIER);
    replace_json_value_by_cmd_value(cmd_map, json_config.force_gc, FORCE_GC_CMD_IDENTIFIER);
    replace_json_value_by_cmd_value(cmd_map, json_config.disable_gc, DISABLE_GC_CMD_IDENTIFIER);
    replace_json_value_by_cmd_value(cmd_map, json_config.disable_leak_warning_on_close, DISABLE_LEAK_WARNING_CMD_IDENTIFIER);
}

void JvmConfiguration::sanitize_and_log_configuration(JvmConfiguration& config) {
    // Initialize remote jvm debug if one of jvm debug arguments is encountered.
    if (config.jvm_debug_port >= 0 || !config.jvm_debug_address.is_empty()) {
        if (config.jvm_debug_address.is_empty()) {
            config.jvm_debug_address = DEFAULT_JVM_ADDRESS;
        } else if (config.jvm_debug_port == -1) {
            config.jvm_debug_port = DEFAULT_JVM_PORT;
        }
    }

    if (config.max_string_size != 0) {
        LOG_WARNING(vformat(
          "Warning ! The max string size was changed to %s which modify the size of the buffer,"
          " this is not a recommended practice",
          config.max_string_size
        ));
    }

    // Initialize if jvm GC should be forced
    if (config.force_gc) {
        config.disable_gc = false;
        LOG_WARNING("GC is started in force mode, this should only be done for debugging purpose");
    }

    if (config.disable_gc) {
        LOG_WARNING("GC thread was disable. --jvm-disable-gc should only be used for debugging purpose");
    }

    if (config.disable_leak_warning_on_close) { LOG_WARNING("You won't be notified if you Kotlin code has leaks"); }

    if (!config.jvm_args.is_empty()) {
        LOG_WARNING(vformat("Custom JVM args are provided, be sure they are valid: %s", config.jvm_args));
    }

#ifdef __ANDROID__
    if (config.vm_type == jni::Jvm::Type::NONE) {
        config.vm_type = jni::Jvm::Type::ART;
        LOG_INFO("You are running on Android. Switching VM mode to ART");
    } else if (config.vm_type != jni::Jvm::Type::ART) {
        config.vm_type = jni::Jvm::Type::ART;
        LOG_WARNING("You are running on Android. Switching VM mode to ART");
    }
#elif IOS_ENABLED
    if (config.vm_type == jni::Jvm::Type::NONE) {
        config.vm_type = jni::Jvm::Type::GRAAL_NATIVE_IMAGE;
        LOG_INFO("You are running on iOS. Switching VM mode to Graal native_image");
    } else if (config.vm_type != jni::Jvm::Type::GRAAL_NATIVE_IMAGE) {
        config.vm_type = jni::Jvm::Type::GRAAL_NATIVE_IMAGE;
        LOG_WARNING("You are running on iOS. Switching VM mode to Graal native_image");
    }
#else
    if (config.vm_type == jni::Jvm::Type::NONE) {
        config.vm_type = jni::Jvm::Type::JVM;
        LOG_INFO("You are running on iOS. Switching VM mode to JVM");
    } else if (config.vm_type == jni::Jvm::Type::ART) {
        config.vm_type = jni::Jvm::Type::JVM;
        LOG_WARNING("You can't run ART on desktop. Switching VM mode to JVM");
    }
#endif

#ifdef DEBUG_ENABLED
    switch (config.vm_type) {
        case jni::Jvm::JVM:
            LOG_INFO(vformat("Using jvm type: %s", JVM_STRING));
            break;
        case jni::Jvm::GRAAL_NATIVE_IMAGE:
            LOG_INFO(vformat("Using jvm type: %s", GRAAL_NATIVE_IMAGE_STRING));
            break;
        case jni::Jvm::ART:
            LOG_INFO(vformat("Using jvm type: %s", ART_STRING));
            break;
        case jni::Jvm::NONE:
            // Should never happen.
            break;
    }
#endif
}