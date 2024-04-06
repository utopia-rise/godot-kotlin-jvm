#include "gd_kotlin.h"

#include "jni/class_loader.h"
#include "jvm_wrapper/memory/memory_manager.h"
#include "jvm_wrapper/memory/transfer_context.h"
#include "lifecycle/jni_lifecycle_manager.h"

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

static constexpr const char* jvm_configuration_path {"res://godot_kotlin_configuration.json"};

GDKotlin::GDKotlin() : bootstrap(nullptr), is_gc_started(false), configuration({}), is_initialized(false) {}

GDKotlin& GDKotlin::get_instance() {
    static GDKotlin instance;
    return instance;
}

void GDKotlin::fetchJvmConfiguration(JvmConfiguration& jvm_configuration) {
    bool invalid_file_content = false;
    bool configuration_file_exist = FileAccess::exists(jvm_configuration_path);

    if (configuration_file_exist) {
        Ref<FileAccess> file_access = FileAccess::open(jvm_configuration_path, FileAccess::READ);
        String content = file_access->get_as_utf8_string();

        // The function is going to mutate the provided configuration with the valid values found in the file.
        // If some of the values parsed in the file are invalid, it will return true;
        invalid_file_content = JvmConfiguration::parse_configuration_json(content, jvm_configuration);
        if (invalid_file_content) {
            LOG_WARNING("Configuration file is malformed. One or several settings won't be applied.");
        }
    } else {
        // No need for a warning, it's most likely the first time the project is run.
        LOG_INFO("No JVM configuration file found. Default settings for your platform will be used.");
    }

#ifdef TOOLS_ENABLED
    // If configuration is missing or malformed, then we write a new one.
    // Valid values from the json file should be in the instance already, so they won't be lost when writing to disk.
    if (invalid_file_content || !configuration_file_exist) {
        Ref<FileAccess> file_access = FileAccess::open(jvm_configuration_path, FileAccess::WRITE);
        String json = JvmConfiguration::export_configuration_to_json(jvm_configuration);
        LOG_INFO(vformat("Writing a new configuration file to disk at %s", jvm_configuration_path));
        file_access->store_string(json);
    }
#endif

    HashMap<String, Variant> cmd_argument_map;
    JvmConfiguration::parse_command_line(OS::get_singleton()->get_cmdline_args(), cmd_argument_map);
    JvmConfiguration::merge_with_command_line(jvm_configuration, cmd_argument_map);
    JvmConfiguration::sanitize_and_log_configuration(jvm_configuration);
}

void GDKotlin::init() {
    fetchJvmConfiguration(configuration);

    if (!check_configuration()) { return; }

    jni::InitArgs args;
#ifndef __ANDROID__
    args.version = JNI_VERSION_1_8;
#endif
#ifdef DEBUG_ENABLED
    args.option("-Xcheck:jni");
#endif

    if (configuration.jvm_debug_port != -1) {
        String jvm_debug_port = String::num_int64(configuration.jvm_debug_port);
        String jvm_debug_address = configuration.jvm_debug_address;

        String suspend;
        if (configuration.wait_for_debugger) {
            suspend = "y";
        } else {
            suspend = "n";
        }

        String debug_command {
          "-agentlib:jdwp=transport=dt_socket,server=y,suspend=" + suspend + ",address=" + jvm_debug_address + ":" + jvm_debug_port
        };
        args.option(debug_command.utf8());
    }

    if (configuration.jvm_jmx_port >= 0) {
        String jvm_jmx_port = String::num_int64(configuration.jvm_jmx_port);
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

#ifndef __ANDROID__
    if (configuration.vm_type == jni::Jvm::GRAAL_NATIVE_IMAGE) { _check_and_copy_jar(LIB_GRAAL_VM_RELATIVE_PATH); }
#endif

    if (!Engine::get_singleton()->is_editor_hint()) { args.option(configuration.jvm_args.utf8()); }

    jni::Jvm::init(args, configuration.vm_type);
    LOG_INFO("Starting JVM ...");

    auto project_settings = ProjectSettings::get_singleton();

    jni::Env env {jni::Jvm::current_env()};

    jni::JObject class_loader {_prepare_class_loader(env, configuration.vm_type)};

#ifdef __ANDROID__
    String main_jar_file {"main-dex.jar"};
    _check_and_copy_jar(main_jar_file);
#else
    String main_jar_file;
    if (configuration.vm_type == jni::Jvm::GRAAL_NATIVE_IMAGE) {
        main_jar_file = "graal_usercode";
    } else {
        main_jar_file = "main.jar";
        _check_and_copy_jar(main_jar_file);
    }
#endif

    JniLifecycleManager::initialize_jni_classes(env);

    int max_string_size {configuration.max_string_size};
    if (max_string_size != LongStringQueue::max_string_size) {
        LongStringQueue::get_instance().set_string_max_size(env, max_string_size);
    }

    if (!configuration.disable_gc) {
        if (configuration.force_gc) {
#ifdef DEBUG_ENABLED
            LOG_VERBOSE("Starting GC thread with force mode.");
#endif
        }

        MemoryManager::get_instance().start(env, configuration.force_gc);
#ifdef DEBUG_ENABLED
        LOG_VERBOSE("GC thread started.");
#endif
        is_gc_started = true;
    }

    if (configuration.disable_leak_warning_on_close) { MemoryManager::get_instance().setDisplayLeaks(env, false); }

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

const JvmConfiguration& GDKotlin::get_configuration() {
    return configuration;
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
          "through a double click on Godot.app, also make sure that JAVA_HOME is set through launchctl: `launchctl "
          "setenv JAVA_HOME </path/to/jdk>`",
          ""
        );
#else
        OS::get_singleton()->alert("The environment variable JAVA_HOME is not found.", "JAVA_HOME not defined. Godot-JVM module won't be loaded!");
#endif

        exit(1);// TODO: remove once we refactor gd_kotlin and move init checks
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
