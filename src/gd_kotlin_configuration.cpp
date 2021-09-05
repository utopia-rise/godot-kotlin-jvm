#include "gd_kotlin_configuration.h"
#include "long_string_queue.h"

#include <core/io/json.h>
#include <core/os/file_access.h>
#include <core/os/os.h>

String GdKotlinConfiguration::to_json() {
    Dictionary result;

    String vm_type_value;
    switch (vm_type) {
        case jni::Jvm::Type::JVM:
            vm_type_value = jvm_string_identifier;
            break;
        case jni::Jvm::Type::GRAAL_NATIVE_IMAGE:
            vm_type_value = graal_native_image_string_identifier;
            break;
        case jni::Jvm::Type::ART:
            vm_type_value = art_string_identifier;
            break;
    }

    result[vm_type_identifier] = vm_type_value;
    result[max_string_size_identifier] = max_string_size;
    result[jvm_debug_port_identifier] = jvm_debug_port;
    result[jvm_debug_address_identifier] = jvm_debug_address;
    result[jvm_jmx_port_identifier] = jvm_jmx_port;
    result[is_waiting_for_debugger_identifier] = is_waiting_for_debugger;
    result[max_string_size_identifier] = max_string_size;
    result[jvm_force_gc_identifier] = is_gc_force_mode;
    result[jvm_disable_gc_identifier] = !is_gc_activated;
    result[jvm_disable_closing_leaks_identifier] = should_display_leaked_jvm_instances_on_close;

    String json = JSON::print(result);
    LOG_VERBOSE(vformat("Output json: %s", json))
    return json;
}

GdKotlinConfiguration GdKotlinConfiguration::from_json(const String& json_string) {
    Variant result;
    String err_string;
    int err_line;

    LOG_VERBOSE(vformat("Parsing %s", json_string))
    Error error{JSON::parse(json_string, result, err_string, err_line)};

    if (error != OK || result.get_type() != Variant::DICTIONARY) {
        LOG_ERROR("Error parsing Godot Kotlin configuration ! Falling back to default configuration");
        return {};
    }

    GdKotlinConfiguration configuration;

    const Dictionary& dictionary{result.operator Dictionary()};

    const String& vm{dictionary[vm_type_identifier]};
    configuration.vm_type = vm_type_from_string(vm);

    Variant max_string_size_variant{dictionary[max_string_size_identifier]};
    if (max_string_size_variant.get_type() == Variant::INT) {
        configuration.max_string_size = max_string_size_variant;
    }

    Variant jvm_debug_port{dictionary[jvm_debug_port_identifier]};
    if (jvm_debug_port && jvm_debug_port.get_type() == Variant::STRING) {
        configuration.jvm_debug_port = jvm_debug_port;
    }

    Variant jvm_debug_address{dictionary[jvm_debug_address_identifier]};
    if (jvm_debug_address && jvm_debug_address.get_type() == Variant::STRING) {
        configuration.jvm_debug_address = jvm_debug_address;
    }

    Variant jvm_jmx_port{dictionary[jvm_jmx_port_identifier]};
    if (jvm_jmx_port && jvm_jmx_port.get_type() == Variant::STRING) {
        configuration.jvm_jmx_port = jvm_jmx_port;
    }

    Variant is_waiting_for_debugger{dictionary[is_waiting_for_debugger_identifier]};
    if (is_waiting_for_debugger && is_waiting_for_debugger.get_type() == Variant::BOOL) {
        configuration.is_waiting_for_debugger = jvm_jmx_port;
    }

    Variant max_string_size{dictionary[max_string_size_identifier]};
    if (max_string_size && max_string_size.get_type() == Variant::INT) {
        configuration.max_string_size = max_string_size;
    }

    Variant jvm_force_gc{dictionary[jvm_force_gc_identifier]};
    if (jvm_force_gc && jvm_force_gc.get_type() == Variant::BOOL) {
        configuration.is_gc_force_mode = jvm_force_gc;
    }

    Variant jvm_disable_gc{dictionary[jvm_disable_gc_identifier]};
    if (jvm_disable_gc && jvm_disable_gc.get_type() == Variant::BOOL) {
        configuration.is_gc_activated = !jvm_disable_gc;
    }

    Variant jvm_disable_closing_leaks{dictionary[jvm_disable_closing_leaks_identifier]};
    if (jvm_disable_closing_leaks && jvm_disable_closing_leaks.get_type() == Variant::BOOL) {
        configuration.should_display_leaked_jvm_instances_on_close = jvm_disable_closing_leaks;
    }

    return configuration;
}

jni::Jvm::Type GdKotlinConfiguration::get_vm_type() const {
    return vm_type;
}

void GdKotlinConfiguration::set_vm_type(jni::Jvm::Type p_type) {
    vm_type = p_type;
}

int GdKotlinConfiguration::get_max_string_size() const {
    return max_string_size;
}

void GdKotlinConfiguration::set_max_string_size(int p_max_string_size) {
    max_string_size = p_max_string_size;
}

GdKotlinConfiguration::GdKotlinConfiguration() : vm_type(jni::Jvm::JVM),
                                                 max_string_size(LongStringQueue::max_string_size) {

}

GdKotlinConfiguration::GdKotlinConfiguration(jni::Jvm::Type p_vm_type, int p_max_string_size)
        : vm_type(p_vm_type), max_string_size(p_max_string_size) {

}

/**
 * Used to load the module configuration.
 * Loads the initial configuration from the json configurations and overrides the values which are passed with cmd line args
 * To be used primarily for TOOLS_ENABLED (editor mode)
 */
GdKotlinConfiguration GdKotlinConfiguration::load_gd_kotlin_configuration_from_json_and_args() {
    GdKotlinConfiguration configuration = load_from_json();
    override_json_config_with_cmd_args(&configuration);
    return configuration;
}

/**
 * Used to load the module configuration.
 * Loads the configuration from the json configurations and ignores the values which are passed with cmd line args
 * To be used primarily for exports
 */
GdKotlinConfiguration GdKotlinConfiguration::load_gd_kotlin_configuration_from_json() {
    return load_from_json();
}

const String& GdKotlinConfiguration::get_jvm_debug_port() const {
    return jvm_debug_port;
}

const String& GdKotlinConfiguration::get_jvm_debug_address() const {
    return jvm_debug_address;
}

const String& GdKotlinConfiguration::get_jvm_jmx_port() const {
    return jvm_jmx_port;
}

bool GdKotlinConfiguration::get_is_waiting_for_debugger() const {
    return is_waiting_for_debugger;
}

bool GdKotlinConfiguration::get_gc_force_mode() const {
    return is_gc_force_mode;
}

void GdKotlinConfiguration::set_gc_force_mode(bool gc_force_mode) {
    is_gc_force_mode = gc_force_mode;
}

bool GdKotlinConfiguration::get_gc_activated() const {
    return is_gc_activated;
}

void GdKotlinConfiguration::set_gc_activated(bool gc_activated) {
    is_gc_activated = gc_activated;
}

bool GdKotlinConfiguration::get_should_display_leaked_jvm_instances_on_close() const {
    return should_display_leaked_jvm_instances_on_close;
}

void GdKotlinConfiguration::set_should_display_leaked_jvm_instances_on_close(
        bool display_leaked_jvm_instances_on_close
) {
    should_display_leaked_jvm_instances_on_close = display_leaked_jvm_instances_on_close;
}

Error GdKotlinConfiguration::split_jvm_debug_argument(const String& cmd_arg, String& result) {
    Vector<String> jvm_debug_split{cmd_arg.split("=")};

    if (jvm_debug_split.size() == 2) {
        result = jvm_debug_split[1];
    } else if (jvm_debug_split.size() != 1) {
        print_error(vformat("Unrecognized --jvm-debug arg pattern: %s", cmd_arg));
        return FAILED;
    }
    return OK;
}

void GdKotlinConfiguration::assemble_jinit_args(jni::InitArgs* args) {
    if (!jvm_debug_port.empty() || !jvm_debug_address.empty()) {
        if (jvm_debug_address.empty()) {
            jvm_debug_address = "*";
        } else if (jvm_debug_port.empty()) {
            jvm_debug_port = "5005";
        }

        String suspend;
        if (is_waiting_for_debugger) {
            suspend = "y";
        } else {
            suspend = "n";
        }

        String debug_command{
                "-agentlib:jdwp=transport=dt_socket,server=y,suspend=" + suspend + ",address=" + jvm_debug_address +
                ":" +
                jvm_debug_port};
        args->option(debug_command.utf8());
    }

    if (!jvm_jmx_port.empty()) {
        String port_command{"-Dcom.sun.management.jmxremote.port=" + jvm_jmx_port};
        String rmi_port{"-Dcom.sun.management.jmxremote.rmi.port=" + jvm_jmx_port};
        args->option("-Djava.rmi.server.hostname=127.0.0.1");
        args->option("-Dcom.sun.management.jmxremote");
        args->option(port_command.utf8());
        args->option(rmi_port.utf8());
        args->option("-Dcom.sun.management.jmxremote.local.only=false");
        args->option("-Dcom.sun.management.jmxremote.authenticate=false");
        args->option("-Dcom.sun.management.jmxremote.ssl=false");
#ifdef DEBUG_ENABLED
        LOG_VERBOSE(vformat("Started JMX on port: %s", jvm_jmx_port))
#endif
    }
}

jni::Jvm::Type GdKotlinConfiguration::vm_type_from_string(const String& vm_type_as_string) {
    if (vm_type_as_string == jvm_string_identifier) {
        return jni::Jvm::JVM;
    } else if (vm_type_as_string == graal_native_image_string_identifier) {
        return jni::Jvm::GRAAL_NATIVE_IMAGE;
    } else if (vm_type_as_string == art_string_identifier) {
        return jni::Jvm::ART;
    } else {
        LOG_WARNING("Wrong JVM type in config, fallback to classic JVM !")
        return jni::Jvm::JVM;
    }
}

GdKotlinConfiguration GdKotlinConfiguration::load_from_json() {
    GdKotlinConfiguration configuration;
    if (FileAccess::exists(gd_kotlin_configuration_path)) {
        FileAccessRef configuration_access_read{FileAccess::open(gd_kotlin_configuration_path, FileAccess::READ)};
        configuration = GdKotlinConfiguration::from_json(configuration_access_read->get_as_utf8_string());
        configuration_access_read->close();
    } else {
#ifdef TOOLS_ENABLED
        FileAccessRef file = FileAccess::open(gd_kotlin_configuration_path, FileAccess::WRITE);
        configuration = GdKotlinConfiguration();
        file->store_string(configuration.to_json());
        file->close();
#else
        LOG_ERROR(vformat("Cannot find Godot Kotlin configuration file at: %s. Falling back to default configuration.", gd_kotlin_configuration_path))
        configuration = GdKotlinConfiguration();
#endif
    }
#ifdef __ANDROID__
    configuration.set_vm_type(jni::Jvm::ART);
#endif
    return configuration;
}

void GdKotlinConfiguration::override_json_config_with_cmd_args(GdKotlinConfiguration* r_configuration) {
    const List<String>& cmdline_args{OS::get_singleton()->get_cmdline_args()};
    const String& arg_prefix{"--"};

    for (int i = 0; i < cmdline_args.size(); ++i) {
        const String cmd_arg{cmdline_args[i]};
        if (cmd_arg.find(arg_prefix + vm_type_identifier) >= 0) {
            String vm_type_as_string;
            if (split_jvm_debug_argument(cmd_arg, vm_type_as_string) == OK) {
#ifdef __ANDROID__
                LOG_WARNING(vformat("You manually defined vm type %s. Since we're running on android, we'll use ART regardless of manual configuration", vm_type_as_string))
#endif
            } else {
                break;
            }
        } else if (cmd_arg.find(arg_prefix + jvm_debug_port_identifier) >= 0) {
            if (split_jvm_debug_argument(cmd_arg, r_configuration->jvm_debug_port) == OK) {
                if (r_configuration->jvm_debug_port.empty()) {
                    r_configuration->jvm_debug_port = "5005";
                }
            } else {
                break;
            }
        } else if (cmd_arg.find(arg_prefix + jvm_debug_address_identifier) >= 0) {
            if (split_jvm_debug_argument(cmd_arg, r_configuration->jvm_debug_address) == OK) {
                if (r_configuration->jvm_debug_address.empty()) {
                    r_configuration->jvm_debug_address = "*";
                }
            } else {
                break;
            }
        } else if (cmd_arg.find(arg_prefix + is_waiting_for_debugger_identifier) >= 0) {
            String is_waiting_for_debugger_as_string;
            if (split_jvm_debug_argument(cmd_arg, is_waiting_for_debugger_as_string) == OK) {
                r_configuration->is_waiting_for_debugger = is_waiting_for_debugger_as_string == "true";
            } else {
                break;
            }
        } else if (cmd_arg.find(arg_prefix + jvm_jmx_port_identifier) >= 0) {
            if (split_jvm_debug_argument(cmd_arg, r_configuration->jvm_jmx_port) == OK) {
                if (r_configuration->jvm_jmx_port.empty()) {
                    r_configuration->jvm_jmx_port = "9010";
                }
            }
        } else if (cmd_arg.find(arg_prefix + max_string_size_identifier) >= 0) {
            String result;
            if (split_jvm_debug_argument(cmd_arg, result) == OK) {
                r_configuration->max_string_size = result.to_int();
                //https://godot-kotl.in/en/latest/advanced/commandline-args/
                LOG_WARNING(
                        vformat("Warning ! The max string size was changed to %s which modify the size of the buffer, this is not a recommended practice",
                                result)
                )
            }
        } else if (cmd_arg == arg_prefix + jvm_force_gc_identifier) {
            r_configuration->is_gc_force_mode = true;
            //TODO: Link to documentation
            LOG_WARNING("GC is started in force mode, this should only be done for debugging purpose")
        } else if (cmd_arg == arg_prefix + jvm_disable_gc_identifier) {
            r_configuration->is_gc_activated = false;
            //TODO: Link to documentation
            LOG_WARNING(vformat("GC thread was disable. %s should only be used for debugging purpose",
                                arg_prefix + jvm_disable_gc_identifier))
        } else if (cmd_arg == arg_prefix + jvm_disable_closing_leaks_identifier) {
            LOG_WARNING(
                    vformat(
                            "JVM leaked instances will not be displayed in console (see %s)",
                            arg_prefix + jvm_disable_closing_leaks_identifier
                    )
            )
            r_configuration->should_display_leaked_jvm_instances_on_close = false;
        }
    }
}
