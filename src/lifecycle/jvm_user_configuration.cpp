#include "jvm_user_configuration.h"

#include "core/io/json.h"

bool JvmUserConfiguration::parse_configuration_json(const String& json_string, JvmUserConfiguration& json_config) {
    bool is_invalid = false;
    JSON json;
    Error error {json.parse(json_string)};
    Variant result {json.get_data()};

    if (error != OK || result.get_type() != Variant::DICTIONARY) {
        LOG_ERROR("Error parsing Godot Kotlin configuration file! Falling back to default configuration");
        return true;
    }

    Dictionary json_dict = result;
    if (json_dict.has(VM_TYPE_JSON_IDENTIFIER)) {
        String value = json_dict[VM_TYPE_JSON_IDENTIFIER];
        LOG_DEV_VERBOSE(vformat("Value for json argument: %s -> %s", VM_TYPE_JSON_IDENTIFIER, value))
        if (value == AUTO_STRING) {
            json_config.vm_type = jni::JvmType::NONE;
        } else if (value == JVM_STRING) {
            json_config.vm_type = jni::JvmType::JVM;
        } else if (value == GRAAL_NATIVE_IMAGE_STRING) {
            json_config.vm_type = jni::JvmType::GRAAL_NATIVE_IMAGE;
        } else if (value == ART_STRING) {
            json_config.vm_type = jni::JvmType::ART;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Wrong JVM type in configuration file: %s. It will be ignored", value));
        }
        json_dict.erase(VM_TYPE_JSON_IDENTIFIER);
    }
    if (json_dict.has(USE_DEBUG_JSON_IDENTIFIER)) {
        String boolean = json_dict[USE_DEBUG_JSON_IDENTIFIER];
        LOG_DEV_VERBOSE(vformat("Value for json argument: %s -> %s", USE_DEBUG_JSON_IDENTIFIER, boolean));
        if (boolean == TRUE_STRING) {
            json_config.use_debug = true;
        } else if (boolean == FALSE_STRING) {
            json_config.use_debug = false;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid Use Debug value in configuration file: %s. It will be ignored", boolean));
        }
        json_dict.erase(USE_DEBUG_JSON_IDENTIFIER);
    }
    if (json_dict.has(DEBUG_PORT_JSON_IDENTIFIER)) {
        int32_t port = json_dict[DEBUG_PORT_JSON_IDENTIFIER];
        LOG_DEV_VERBOSE(vformat("Value for json argument: %s -> %s", DEBUG_PORT_JSON_IDENTIFIER, port));
        if (port >= 0 && port <= 65535) {
            json_config.jvm_debug_port = port;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid JVM port value in configuration file: %s. It will be ignored", port));
        }
        json_dict.erase(DEBUG_PORT_JSON_IDENTIFIER);
    }
    if (json_dict.has(DEBUG_ADDRESS_JSON_IDENTIFIER)) {
        String address = json_dict[DEBUG_ADDRESS_JSON_IDENTIFIER];
        LOG_DEV_VERBOSE(vformat("Value for json argument: %s -> %s", DEBUG_ADDRESS_JSON_IDENTIFIER, address));
        if (address.is_valid_ip_address() || address.is_empty()) {
            json_config.jvm_debug_address = address;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid JVM address value in configuration file: %s. It will be ignored", address));
        }
        json_dict.erase(DEBUG_ADDRESS_JSON_IDENTIFIER);
    }
    if (json_dict.has(WAIT_FOR_DEBUGGER_JSON_IDENTIFIER)) {
        String boolean = json_dict[WAIT_FOR_DEBUGGER_JSON_IDENTIFIER];
        LOG_DEV_VERBOSE(vformat("Value for json argument: %s -> %s", WAIT_FOR_DEBUGGER_JSON_IDENTIFIER, boolean));
        if (boolean == TRUE_STRING) {
            json_config.wait_for_debugger = true;
        } else if (boolean == FALSE_STRING) {
            json_config.wait_for_debugger = false;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid Waiting for Debugger value in configuration file: %s. It will be ignored", boolean));
        }
        json_dict.erase(WAIT_FOR_DEBUGGER_JSON_IDENTIFIER);
    }
    if (json_dict.has(JMX_PORT_JSON_IDENTIFIER)) {
        int32_t port = json_dict[JMX_PORT_JSON_IDENTIFIER];
        LOG_DEV_VERBOSE(vformat("Value for json argument: %s -> %s", JMX_PORT_JSON_IDENTIFIER, port));
        if (port >= -1 && port <= 65535) {
            json_config.jvm_jmx_port = port;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid JMX port value in configuration file: %s. It will be ignored", port));
        }
        json_dict.erase(JMX_PORT_JSON_IDENTIFIER);
    }
    if (json_dict.has(MAX_STRING_SIZE_JSON_IDENTIFIER)) {
        int32_t size = json_dict[MAX_STRING_SIZE_JSON_IDENTIFIER];
        LOG_DEV_VERBOSE(vformat("Value for json argument: %s -> %s", MAX_STRING_SIZE_JSON_IDENTIFIER, size));
        if (size >= -1) {
            json_config.max_string_size = size;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid Maximum String Size value in configuration file: %s. It will be ignored", size));
        }
        json_dict.erase(MAX_STRING_SIZE_JSON_IDENTIFIER);
    }
    if (json_dict.has(FORCE_GC_JSON_IDENTIFIER)) {
        String boolean = json_dict[FORCE_GC_JSON_IDENTIFIER];
        LOG_DEV_VERBOSE(vformat("Value for json argument: %s -> %s", FORCE_GC_JSON_IDENTIFIER, boolean));
        if (boolean == TRUE_STRING) {
            json_config.force_gc = true;
        } else if (boolean == FALSE_STRING) {
            json_config.force_gc = false;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid Force GC value in configuration file: %s. It will be ignored", boolean));
        }
        json_dict.erase(FORCE_GC_JSON_IDENTIFIER);
    }
    if (json_dict.has(DISABLE_GC_JSON_IDENTIFIER)) {
        String boolean = json_dict[DISABLE_GC_JSON_IDENTIFIER];
        LOG_DEV_VERBOSE(vformat("Value for json argument: %s -> %s", DISABLE_GC_JSON_IDENTIFIER, boolean));
        if (boolean == TRUE_STRING) {
            json_config.disable_gc = true;
        } else if (boolean == FALSE_STRING) {
            json_config.disable_gc = false;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid Disable GC value in configuration file: %s. It will be ignored", boolean));
        }
        json_dict.erase(DISABLE_GC_JSON_IDENTIFIER);
    }
    if (json_dict.has(DISABLE_LEAK_WARNING_JSON_IDENTIFIER)) {
        String boolean = json_dict[DISABLE_LEAK_WARNING_JSON_IDENTIFIER];
        LOG_DEV_VERBOSE(vformat("Value for json argument: %s -> %s", DISABLE_LEAK_WARNING_JSON_IDENTIFIER, boolean));
        if (boolean == TRUE_STRING) {
            json_config.disable_leak_warning_on_close = true;
        } else if (boolean == FALSE_STRING) {
            json_config.disable_leak_warning_on_close = false;
        } else {
            is_invalid = true;
            LOG_WARNING(vformat("Invalid Disable Leak Warning value in configuration file: %s. It will be ignored", boolean));
        }
        json_dict.erase(DISABLE_LEAK_WARNING_JSON_IDENTIFIER);
    }
    if (json_dict.has(JVM_ARGUMENTS_JSON_IDENTIFIER)) {
        json_config.jvm_args = json_dict[JVM_ARGUMENTS_JSON_IDENTIFIER];
        LOG_DEV_VERBOSE(vformat("Value for json argument: %s -> %s", JVM_ARGUMENTS_JSON_IDENTIFIER, json_config.jvm_args))
        json_dict.erase(JVM_ARGUMENTS_JSON_IDENTIFIER);
    }

    if (!json_dict.is_empty()) {
        Array keys = json_dict.keys();
        for (int i = 0; i < keys.size(); i++) {
            String key = keys[i];
            String value = json_dict[key];
            LOG_WARNING(vformat("Invalid json configuration argument name: %s", key));
        }
        is_invalid = true;
    }

    if (!json_dict.has(VERSION_JSON_IDENTIFIER) || json_dict[VERSION_JSON_IDENTIFIER] != JSON_ARGUMENT_VERSION) {
        LOG_WARNING("Your existing jvm json configuration file was made for an older version of this binding. A new "
                    "will one will be created. Your previous settings should remain if compatible.");
        is_invalid = true;
    }

    return is_invalid;
}

String JvmUserConfiguration::export_configuration_to_json(const JvmUserConfiguration& configuration) {
    // This function assumes all values are valid.
    Dictionary json;

    String vm_type_value;
    switch (configuration.vm_type) {
        case jni::JvmType::NONE:
            vm_type_value = AUTO_STRING;
            break;
        case jni::JvmType::JVM:
            vm_type_value = JVM_STRING;
            break;
        case jni::JvmType::GRAAL_NATIVE_IMAGE:
            vm_type_value = GRAAL_NATIVE_IMAGE_STRING;
            break;
        case jni::JvmType::ART:
            vm_type_value = ART_STRING;
            break;
    }
    json[VERSION_JSON_IDENTIFIER] = JSON_ARGUMENT_VERSION;
    json[VM_TYPE_JSON_IDENTIFIER] = vm_type_value;

    json[USE_DEBUG_JSON_IDENTIFIER] = configuration.use_debug;
    json[DEBUG_PORT_JSON_IDENTIFIER] = configuration.jvm_debug_port;
    json[DEBUG_ADDRESS_JSON_IDENTIFIER] = configuration.jvm_debug_address;
    json[WAIT_FOR_DEBUGGER_JSON_IDENTIFIER] = configuration.wait_for_debugger;

    json[JMX_PORT_JSON_IDENTIFIER] = configuration.jvm_jmx_port;

    json[MAX_STRING_SIZE_JSON_IDENTIFIER] = configuration.max_string_size;

    json[FORCE_GC_JSON_IDENTIFIER] = configuration.force_gc;
    json[DISABLE_GC_JSON_IDENTIFIER] = configuration.disable_gc;
    json[DISABLE_LEAK_WARNING_JSON_IDENTIFIER] = configuration.disable_leak_warning_on_close;

    json[JVM_ARGUMENTS_JSON_IDENTIFIER] = configuration.jvm_args;

    return JSON::stringify(json, "    ", true, false);
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

void JvmUserConfiguration::parse_command_line(const List<String>& args, HashMap<String, Variant>& configuration_map) {
    // We use a HashMap instead of JvmUserConfiguration so we can still make the difference between a
    // JvmUserConfiguration default value and the absence of the matching command line argument. Knowing this is
    // essential when merging with the json configuration later.

    // Keep in sync with https://godot-kotl.in/en/latest/advanced/commandline-args/
    for (const auto& arg : args) {
        String identifier;
        String value;
        if (split_argument(arg, identifier, value) != Error::OK) { continue; }

        if (identifier == VM_TYPE_CMD_IDENTIFIER) {
            if (value == AUTO_STRING) {
                configuration_map[VM_TYPE_CMD_IDENTIFIER] = jni::JvmType::NONE;
            } else if (value == JVM_STRING) {
                configuration_map[VM_TYPE_CMD_IDENTIFIER] = jni::JvmType::JVM;
            } else if (value == GRAAL_NATIVE_IMAGE_STRING) {
                configuration_map[VM_TYPE_CMD_IDENTIFIER] = jni::JvmType::GRAAL_NATIVE_IMAGE;
            } else if (value == ART_STRING) {
                configuration_map[VM_TYPE_CMD_IDENTIFIER] = jni::JvmType::ART;
            } else {
                LOG_WARNING(vformat("Wrong JVM type in command line arguments: %s. It will be ignored", value));
            }
        } else if (identifier == USE_DEBUG_CMD_IDENTIFIER) {
            configuration_map[USE_DEBUG_CMD_IDENTIFIER] = get_cmd_bool_or_default(value, TRUE_STRING);
        } else if (identifier == DEBUG_PORT_CMD_IDENTIFIER) {
            int64_t port = -1;
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
            int64_t port = -1;
            if (value.is_valid_int()) { port = value.to_int(); }
            if (port >= 0 && port <= 65535) {
                configuration_map[JMX_PORT_CMD_IDENTIFIER] = port;
            } else {
                LOG_WARNING(vformat("Invalid JMX port value command line arguments: %s. It will be ignored", port));
            }
        } else if (identifier == MAX_STRING_SIZE_CMD_IDENTIFIER) {
            int64_t size = -1;
            if (value.is_valid_int()) { size = value.to_int(); }
            if (value.is_valid_int() && size >= -1) {
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

        for (const auto& map_element : configuration_map) {
            LOG_DEV_VERBOSE(vformat("Value for commandline argument: %s -> %s", map_element.key, map_element.value))
        }
    }
}

template<typename T>
void replace_json_value_by_cmd_value(const HashMap<String, Variant>& map, T& json_value, const String& cmd_key) {
    if (map.has(cmd_key)) { json_value = VariantCaster<T>::cast(map[cmd_key]); }
}

void JvmUserConfiguration::merge_with_command_line(JvmUserConfiguration& json_config, const HashMap<String, Variant>& cmd_map) {
    replace_json_value_by_cmd_value(cmd_map, json_config.vm_type, VM_TYPE_CMD_IDENTIFIER);

    replace_json_value_by_cmd_value(cmd_map, json_config.jvm_debug_port, DEBUG_PORT_CMD_IDENTIFIER);
    replace_json_value_by_cmd_value(cmd_map, json_config.jvm_debug_address, DEBUG_ADDRESS_CMD_IDENTIFIER);
    replace_json_value_by_cmd_value(cmd_map, json_config.wait_for_debugger, WAIT_FOR_DEBUGGER_CMD_IDENTIFIER);

    if (cmd_map.has(DEBUG_PORT_CMD_IDENTIFIER) || cmd_map.has(DEBUG_ADDRESS_CMD_IDENTIFIER) || cmd_map.has(WAIT_FOR_DEBUGGER_CMD_IDENTIFIER)) {
        // Set use debug to true if any of the 3 previous arguments are used.
        // Will be overridden if the actual argument is used.
        json_config.use_debug = true;
    }
    replace_json_value_by_cmd_value(cmd_map, json_config.use_debug, DEBUG_PORT_CMD_IDENTIFIER);

    replace_json_value_by_cmd_value(cmd_map, json_config.jvm_jmx_port, JMX_PORT_CMD_IDENTIFIER);
    replace_json_value_by_cmd_value(cmd_map, json_config.max_string_size, MAX_STRING_SIZE_CMD_IDENTIFIER);
    replace_json_value_by_cmd_value(cmd_map, json_config.force_gc, FORCE_GC_CMD_IDENTIFIER);
    replace_json_value_by_cmd_value(cmd_map, json_config.disable_gc, DISABLE_GC_CMD_IDENTIFIER);
    replace_json_value_by_cmd_value(cmd_map, json_config.disable_leak_warning_on_close, DISABLE_LEAK_WARNING_CMD_IDENTIFIER);
}

void JvmUserConfiguration::sanitize_and_log_configuration(JvmUserConfiguration& config) {
    if (config.max_string_size != -1) {
        LOG_WARNING(vformat(
          "The max string size was changed to %s which can modify the size of the shared buffer. "
          "Be aware that it might impact performance and memory usage.",
          config.max_string_size
        ));
    }

    // Initialize if jvm GC should be forced
    if (config.force_gc) {
        config.disable_gc = false;
        LOG_WARNING("GC is started in force mode, this should only be done for debugging purpose");
    } else if (config.disable_gc) {
        LOG_WARNING("GC thread was disable. this should only be used for debugging purpose");
    }

    if (config.disable_leak_warning_on_close) {
        LOG_WARNING("You won't be notified if your Kotlin code got instances leaking");
    }

    if (!config.jvm_args.is_empty()) {
        LOG_WARNING(vformat("Custom JVM arguments are provided, be sure they are valid: %s", config.jvm_args));
    }

#ifdef __ANDROID__
    if (config.vm_type == jni::JvmType::NONE) {
        config.vm_type = jni::JvmType::ART;
        LOG_INFO("You are running on Android. VM automatically set to ART");
    } else if (config.vm_type != jni::JvmType::ART) {
        config.vm_type = jni::JvmType::ART;
        LOG_WARNING("You are running on Android. Switching VM to ART");
    }
#elif IOS_ENABLED
    if (config.vm_type == jni::JvmType::NONE) {
        config.vm_type = jni::JvmType::GRAAL_NATIVE_IMAGE;
        LOG_INFO("You are running on iOS. VM automatically set to Graal native_image");
    } else if (config.vm_type != jni::JvmType::GRAAL_NATIVE_IMAGE) {
        config.vm_type = jni::JvmType::GRAAL_NATIVE_IMAGE;
        LOG_WARNING("You are running on iOS. Switching VM to Graal native_image");
    }
#else
    if (config.vm_type == jni::JvmType::NONE) {
        config.vm_type = jni::JvmType::JVM;
        LOG_INFO("You are running on desktop. VM automatically set to JVM");
    } else if (config.vm_type == jni::JvmType::ART) {
        config.vm_type = jni::JvmType::JVM;
        LOG_WARNING("You can't run ART on desktop. Switching VM to JVM");
    }
#endif
    else {
        switch (config.vm_type) {
            case jni::JvmType::JVM:
                LOG_INFO(vformat("VM set to %s", JVM_STRING));
                break;
            case jni::JvmType::GRAAL_NATIVE_IMAGE:
                LOG_INFO(vformat("VM set to %s", GRAAL_NATIVE_IMAGE_STRING));
                break;
            case jni::JvmType::ART:
                LOG_INFO(vformat("VM set to %s", ART_STRING));
                break;
            case jni::JvmType::NONE:
                // Should never happen.
                break;
        }
    }
}