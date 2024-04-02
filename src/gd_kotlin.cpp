#include "gd_kotlin.h"

#include "jni/class_loader.h"
#include "jni_lifecycle_manager.h"
#include "jvm_wrapper/memory/transfer_context.h"
#include "jvm_wrapper/memory/memory_manager.h"

#include <core/config/project_settings.h>
#include <core/io/resource_loader.h>
#include <main/main.h>

#ifndef TOOLS_ENABLED

#include <core/io/dir_access.h>

#endif

#ifdef __ANDROID__

#include <platform/android/java_godot_wrapper.h>
#include <platform/android/os_android.h>

#endif

static constexpr const char* gd_kotlin_configuration_path {"res://godot_kotlin_configuration.json"};

GDKotlin& GDKotlin::get_instance() {
    static GDKotlin instance;
    return instance;
}

void GDKotlin::init() {
    if (!check_configuration()) { return; }

    jni::InitArgs args;
#ifndef __ANDROID__
    args.version = JNI_VERSION_1_8;
#endif
#ifdef DEBUG_ENABLED
    args.option("-Xcheck:jni");
#endif

    String jvm_type_argument {
#ifdef __ANDROID__
      "art"
#elif defined IOS_ENABLED
      GdKotlinConfiguration::graal_native_image_string_identifier
#else
      ""
#endif
    };

    // Initialize remote jvm debug if one of jvm debug arguments is encountered.
    // Initialize if jvm GC should be forced
    String jvm_debug_port;
    String jvm_debug_address;
    String jvm_jmx_port;
    bool is_gc_force_mode {false};
    bool is_gc_activated {true};
    bool is_waiting_for_debugger {true};
    bool should_display_leaked_jvm_instances_on_close {true};
    const List<String>& cmdline_args {OS::get_singleton()->get_cmdline_args()};
    for (int i = 0; i < cmdline_args.size(); ++i) {
        const String cmd_arg {cmdline_args[i]};
        if (cmd_arg.find("--dump-extension-api") >= 0) {
            return;
        } else if (cmd_arg.find("--java-vm-type") >= 0) {
            _split_jvm_debug_argument(cmd_arg, jvm_type_argument);
#ifdef __ANDROID__
            LOG_WARNING("You're running android, will use ART.");
#elif IOS_ENABLED
            LOG_WARNING("You're running ios, will use graal native-image.");
#endif
        } else if (cmd_arg.find("--jvm-debug-port") >= 0) {
            if (_split_jvm_debug_argument(cmd_arg, jvm_debug_port) == OK) {
                if (jvm_debug_port.is_empty()) { jvm_debug_port = "5005"; }
            } else {
                break;
            }
        } else if (cmd_arg.find("--jvm-debug-address") >= 0) {
            if (_split_jvm_debug_argument(cmd_arg, jvm_debug_address) == OK) {
                if (jvm_debug_address.is_empty()) { jvm_debug_address = "*"; }
            } else {
                break;
            }
        } else if (cmd_arg.find("--wait-for-debugger") >= 0) {
            String is_waiting_for_debugger_as_string;
            if (_split_jvm_debug_argument(cmd_arg, is_waiting_for_debugger_as_string) == OK) {
                is_waiting_for_debugger = is_waiting_for_debugger_as_string == "true";
            } else {
                break;
            }
        } else if (cmd_arg.find("--jvm-jmx-port") >= 0) {
            if (_split_jvm_debug_argument(cmd_arg, jvm_jmx_port) == OK) {
                if (jvm_jmx_port.is_empty()) { jvm_jmx_port = "9010"; }
            }
        } else if (cmd_arg.find("--jvm-to-engine-max-string-size") >= 0) {
            String result;
            if (_split_jvm_debug_argument(cmd_arg, result) == OK) {
                configuration.set_max_string_size(result.to_int());
                // https://godot-kotl.in/en/latest/advanced/commandline-args/
                LOG_WARNING(vformat("Warning ! The max string size was changed to %s which modify the size of the buffer, this is not a recommended practice", result)
                );
            }
        } else if (cmd_arg == "--jvm-force-gc") {
            is_gc_force_mode = true;
            // TODO: Link to documentation
            LOG_WARNING("GC is started in force mode, this should only be done for debugging purpose");
        } else if (cmd_arg == "--jvm-disable-gc") {
            is_gc_activated = false;
            // TODO: Link to documentation
            LOG_WARNING("GC thread was disable. --jvm-disable-gc should only be used for debugging purpose");
        } else if (cmd_arg == "--jvm-disable-closing-leaks-warning") {
            LOG_WARNING("JVM leaked instances will not be displayed in console (see "
                        "--jvm-disable-closing-leaks-warning)");
            should_display_leaked_jvm_instances_on_close = false;
        }
    }

    if (!jvm_debug_port.is_empty() || !jvm_debug_address.is_empty()) {
        if (jvm_debug_address.is_empty()) {
            jvm_debug_address = "*";
        } else if (jvm_debug_port.is_empty()) {
            jvm_debug_port = "5005";
        }

        String suspend;
        if (is_waiting_for_debugger) {
            suspend = "y";
        } else {
            suspend = "n";
        }

        String debug_command {
          "-agentlib:jdwp=transport=dt_socket,server=y,suspend=" + suspend + ",address=" + jvm_debug_address + ":" + jvm_debug_port
        };
        args.option(debug_command.utf8());
    }

    if (!jvm_jmx_port.is_empty()) {
        String port_command {"-Dcom.sun.management.jmxremote.port=" + jvm_jmx_port};
        String rmi_port {"-Dcom.sun.management.jmxremote.rmi.port=" + jvm_jmx_port};
        args.option("-Djava.rmi.server.hostname=127.0.0.1");
        args.option("-Dcom.sun.management.jmxremote");
        args.option(port_command.utf8());
        args.option(rmi_port.utf8());
        args.option("-Dcom.sun.management.jmxremote.local.only=false");
        args.option("-Dcom.sun.management.jmxremote.authenticate=false");
        args.option("-Dcom.sun.management.jmxremote.ssl=false");
#ifdef DEBUG_ENABLED
        LOG_VERBOSE(vformat("Started JMX on port: %s", jvm_jmx_port));
#endif
    }
#ifdef IOS_ENABLED
    configuration.set_vm_type(jni::Jvm::GRAAL_NATIVE_IMAGE);
#elif !defined(__ANDROID__)
    if (jvm_type_argument == GdKotlinConfiguration::jvm_string_identifier) {
        configuration.set_vm_type(jni::Jvm::JVM);
    } else if (jvm_type_argument == GdKotlinConfiguration::graal_native_image_string_identifier) {
        configuration.set_vm_type(jni::Jvm::GRAAL_NATIVE_IMAGE);
    }

    if (configuration.get_vm_type() == jni::Jvm::GRAAL_NATIVE_IMAGE) {
        _check_and_copy_jar(LIB_GRAAL_VM_RELATIVE_PATH);
    }
#else
    configuration.set_vm_type(jni::Jvm::ART);
#endif

    jni::Jvm::init(args, configuration.get_vm_type());
    LOG_INFO("Starting JVM ...");

#ifdef DEBUG_ENABLED
    switch (configuration.get_vm_type()) {
        case jni::Jvm::JVM:
            LOG_INFO(vformat("Using jvm type: %s", GdKotlinConfiguration::jvm_string_identifier));
            break;
        case jni::Jvm::GRAAL_NATIVE_IMAGE:
            LOG_INFO(vformat("Using jvm type: %s", GdKotlinConfiguration::graal_native_image_string_identifier));
            break;
        case jni::Jvm::ART:
            LOG_INFO(vformat("Using jvm type: %s", GdKotlinConfiguration::art_string_identifier));
            break;
    }
#endif

    auto project_settings = ProjectSettings::get_singleton();

    jni::Env env {jni::Jvm::current_env()};

    jni::JObject class_loader {_prepare_class_loader(env, configuration.get_vm_type())};

#ifdef __ANDROID__
    String main_jar_file {"main-dex.jar"};
    _check_and_copy_jar(main_jar_file);
#else
    String main_jar_file;
    if (configuration.get_vm_type() == jni::Jvm::GRAAL_NATIVE_IMAGE) {
        main_jar_file = "graal_usercode";
    } else {
        main_jar_file = "main.jar";
        _check_and_copy_jar(main_jar_file);
    }
#endif

    JniLifecycleManager::initialize_jni_classes(env);

    int max_string_size {configuration.get_max_string_size()};
    if (max_string_size != LongStringQueue::max_string_size) {
        LongStringQueue::get_instance().set_string_max_size(env, max_string_size);
    }

    if (is_gc_activated) {
        if (is_gc_force_mode) {
#ifdef DEBUG_ENABLED
            LOG_VERBOSE("Starting GC thread with force mode.");
#endif
        }

        MemoryManager::get_instance().start(env, is_gc_force_mode);
#ifdef DEBUG_ENABLED
        LOG_VERBOSE("GC thread started.");
#endif
        is_gc_started = true;
    }

    if (!should_display_leaked_jvm_instances_on_close) {
        MemoryManager::get_instance().setDisplayLeaks(env, false);
    }

    bootstrap = Bootstrap::create_instance(env);

#ifdef TOOLS_ENABLED
    String jar_path {project_settings->globalize_path("res://build/libs/")};
#else
    String jar_path {project_settings->globalize_path("user://")};
#endif

    String project_path {project_settings->globalize_path("res://")};

#ifdef __ANDROID__
    String main_jar {ProjectSettings::get_singleton()->globalize_path(vformat("user://%s", main_jar_file))};
#endif

    bootstrap->init(
      env,
      Engine::get_singleton()->is_editor_hint(),
      project_path,
      jar_path,
      main_jar_file,
#ifdef __ANDROID__
      ClassLoader::provide_loader(env, main_jar, class_loader)
#else
      jni::JObject()
#endif
    );
    is_initialized = true;
}

void GDKotlin::finish() {
    auto env = jni::Jvm::current_env();

    bootstrap->finish(env);

    delete bootstrap;
    bootstrap = nullptr;

    TypeManager::get_instance().clear();

    if (is_gc_started) {
        MemoryManager::get_instance().close(env);

        while (!MemoryManager::get_instance().is_closed(env)) {
            OS::get_singleton()->delay_usec(600000);
        }
#ifdef DEBUG_ENABLED
        LOG_VERBOSE("JVM GC thread was closed");
#endif
        MemoryManager::get_instance().clean_up(env);
    }

    JniLifecycleManager::destroy_jni_classes();

    ClassLoader::delete_default_loader(env);
    jni::Jvm::destroy();
    LOG_INFO("Shutting down JVM ...");
}

void GDKotlin::register_classes(jni::Env& p_env, jni::JObjectArray p_classes) {
#ifdef DEV_ENABLED
    LOG_INFO("Loading classes ...");
#endif

    jni::Env env {jni::Jvm::current_env()};
    Vector<KtClass*> classes;
    for (auto i = 0; i < p_classes.length(p_env); i++) {
        KtClass* kt_class = new KtClass(env, p_classes.get(p_env, i));
        kt_class->fetch_members(env);
        classes.append(kt_class);
#ifdef DEV_ENABLED
        LOG_VERBOSE(vformat("Loaded class %s : %s", kt_class->registered_class_name, kt_class->base_godot_class));
#endif
    }
    TypeManager::get_instance().create_and_update_scripts(classes);
}

const GdKotlinConfiguration& GDKotlin::get_configuration() {
    return configuration;
}

Error GDKotlin::_split_jvm_debug_argument(const String& cmd_arg, String& result) {
    Vector<String> jvm_debug_split {cmd_arg.split("=")};

    if (jvm_debug_split.size() == 2) {
        result = jvm_debug_split[1];
    } else if (jvm_debug_split.size() != 1) {
        print_error(vformat("Unrecognized --jvm-debug arg pattern: %s", cmd_arg));
        return FAILED;
    }
    return OK;
}

void GDKotlin::_check_and_copy_jar(const String& jar_name) {
#ifndef TOOLS_ENABLED
    String libs_res_path {"res://build/libs"};
    String jar_user_path {vformat("user://%s", jar_name)};
    String jar_res_path {vformat("%s/%s", libs_res_path, jar_name)};

    if (!FileAccess::exists(jar_user_path) || FileAccess::get_md5(jar_user_path) != FileAccess::get_md5(jar_res_path)) {
#ifdef DEBUG_ENABLED
        LOG_INFO(vformat("%s jar has changed, will copy it from res...", jar_name));
#endif

        Error err;
        Ref<DirAccess> dir_access {DirAccess::open(libs_res_path, &err)};

#ifdef DEBUG_ENABLED
        JVM_CRASH_COND_MSG(err != OK, vformat("Cannot open %s jar in res.", jar_name));
#endif

        dir_access->copy(jar_res_path, jar_user_path);
    }
#endif
}

jni::JObject GDKotlin::_prepare_class_loader(jni::Env& p_env, jni::Jvm::Type type) {
    if (type == jni::Jvm::GRAAL_NATIVE_IMAGE) { return {}; }
#ifdef __ANDROID__
    String bootstrap_jar_file {"godot-bootstrap-dex.jar"};
    String main_jar_file {"main-dex.jar"};
#else
    String bootstrap_jar_file {"godot-bootstrap.jar"};
#endif

    _check_and_copy_jar(bootstrap_jar_file);

#ifdef TOOLS_ENABLED
    String bootstrap_jar {OS::get_singleton()->get_executable_path().get_base_dir() + "/godot-bootstrap.jar"};
#else
    String bootstrap_jar {ProjectSettings::get_singleton()->globalize_path(vformat("user://%s", bootstrap_jar_file))};
#endif

#ifdef TOOLS_ENABLED
    JVM_CRASH_COND_MSG(!FileAccess::exists(bootstrap_jar), "No godot-bootstrap.jar found! This file needs to stay alongside the godot editor executable!");
#elif DEBUG_ENABLED
    JVM_CRASH_COND_MSG(!FileAccess::exists(bootstrap_jar), "No godot-bootstrap.jar found!");
#endif

    LOG_INFO(vformat("Loading bootstrap jar: %s", bootstrap_jar));

    jni::JObject class_loader {ClassLoader::provide_loader(p_env, bootstrap_jar, jni::JObject(nullptr))};
    ClassLoader::set_default_loader(class_loader);
    class_loader.delete_local_ref(p_env);

    class_loader = ClassLoader::get_default_loader();

    return class_loader;
}

GDKotlin::GDKotlin() :
  bootstrap(nullptr),
  is_gc_started(false),
  configuration(GdKotlinConfiguration::load_gd_kotlin_configuration_or_default(gd_kotlin_configuration_path)),
  is_initialized(false) {}

bool GDKotlin::check_configuration() {
    bool has_configuration_error = false;
    if (Engine::get_singleton()->is_editor_hint() && OS::get_singleton()->get_environment("JAVA_HOME").is_empty()) {
        LOG_WARNING("JAVA_HOME not defined. Godot-JVM module won't be loaded!");
        configuration_errors.push_back(
          {"JAVA_HOME not defined",
           "JAVA_HOME environment variable is not defined. This is necessary for Godot-Jvm to work while you develop "
           "on your machine."}
        );

#ifdef MACOS_ENABLED
        OS::get_singleton()->alert(
          "The environment variable JAVA_HOME is not found. If you launched the editor "
          "through a double click on Godot.app, also make sure that JAVA_HOME is set through launchctl: `launchctl setenv JAVA_HOME </path/to/jdk>`",
          ""
        );
#else
        OS::get_singleton()->alert(
          "The environment variable JAVA_HOME is not found.",
          "JAVA_HOME not defined. Godot-JVM module won't be loaded!"
        );
#endif

        exit(1); // TODO: remove once we refactor gd_kotlin and move init checks
        has_configuration_error = true;
    }
    return !has_configuration_error;
}

bool GDKotlin::initialized() const {
    return is_initialized;
}

const Vector<Pair<String, String>>& GDKotlin::get_configuration_errors() const {
    return configuration_errors;
}
