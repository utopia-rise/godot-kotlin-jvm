#include "gd_kotlin.h"

#include "jni/class_loader.h"
#include "memory/bridges_manager.h"

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

void load_classes_hook(JNIEnv* p_env, jobject p_this, jobjectArray p_classes) {
    jni::Env env(p_env);
    jni::JObjectArray classes {jni::JObjectArray(p_classes)};
    jni::JObject j_object {p_this};

    GDKotlin::get_instance().register_classes(env, classes);

    j_object.delete_local_ref(env);
    classes.delete_local_ref(env);
}

void register_engine_types_hook(JNIEnv* p_env, jobject p_this, jobjectArray p_engine_types, jobjectArray p_singleton_names, jobjectArray p_method_names, jobjectArray p_types_of_methods) {
#ifdef DEV_ENABLED
    LOG_VERBOSE("Starting to register managed engine types...");
#endif
    jni::Env env(p_env);

    jni::JObjectArray engine_types {p_engine_types};
    TypeManager::get_instance().register_engine_types(env, engine_types);

    jni::JObjectArray singleton_names {p_singleton_names};
    TypeManager::get_instance().register_engine_singletons(env, singleton_names);

    jni::JObjectArray method_names {p_method_names};
    jni::JObjectArray types_of_methods {p_types_of_methods};
    TypeManager::get_instance().register_methods(env, method_names, types_of_methods);

    jni::JObject j_object {p_this};
    j_object.delete_local_ref(env);
    engine_types.delete_local_ref(env);
    singleton_names.delete_local_ref(env);
    method_names.delete_local_ref(env);
    types_of_methods.delete_local_ref(env);
#ifdef DEV_ENABLED
    LOG_VERBOSE("Done registering managed engine types...");
#endif
}

void GDKotlin::init() {
    if (Engine::get_singleton()->is_project_manager_hint()) {
#ifdef DEBUG_ENABLED
        LOG_VERBOSE("Detected that we're in the project manager. Won't initialize kotlin lang.");
#endif
        return;
    }

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
          "-agentlib:jdwp=transport=dt_socket,server=y,suspend=" + suspend + ",address=" + jvm_debug_address + ":" + jvm_debug_port};
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

    initialize_classes();

    jni::JClass transfer_ctx_cls = env.load_class("godot.core.memory.TransferContext", class_loader);
    jni::FieldId transfer_ctx_instance_field = transfer_ctx_cls.get_static_field_id(env, "INSTANCE", "Lgodot/core/memory/TransferContext;");
    jni::JObject transfer_ctx_instance = transfer_ctx_cls.get_static_object_field(env, transfer_ctx_instance_field);
    JVM_CRASH_COND_MSG(transfer_ctx_instance.is_null(), "Failed to retrieve TransferContext instance");
    transfer_context = new TransferContext(transfer_ctx_instance);

    LongStringQueue::get_instance();
    int max_string_size {configuration.get_max_string_size()};
    if (max_string_size != LongStringQueue::max_string_size) {
        LongStringQueue::get_instance().set_string_max_size(max_string_size);
    }

    // Garbage Collector
    jni::JClass garbage_collector_cls {env.load_class("godot.core.memory.MemoryManager", class_loader)};
    jni::FieldId garbage_collector_instance_field {
      garbage_collector_cls.get_static_field_id(env, "INSTANCE", "Lgodot/core/memory/MemoryManager;")};
    jni::JObject garbage_collector_instance {garbage_collector_cls.get_static_object_field(env, garbage_collector_instance_field)};
    JVM_CRASH_COND_MSG(garbage_collector_instance.is_null(), "Failed to retrieve MemoryManager instance");

    BridgesManager::get_instance().initialize_bridges(env, class_loader);

    if (is_gc_activated) {
        if (is_gc_force_mode) {
#ifdef DEBUG_ENABLED
            LOG_VERBOSE("Starting GC thread with force mode.");
#endif
        }
        jni::MethodId start_method_id {garbage_collector_cls.get_method_id(env, "start", "(Z)V")};
        jvalue start_args[2] = {jni::to_jni_arg(is_gc_force_mode)};
        garbage_collector_instance.call_void_method(env, start_method_id, start_args);
#ifdef DEBUG_ENABLED
        LOG_VERBOSE("GC thread started.");
#endif
        is_gc_started = true;
    }

    if (!should_display_leaked_jvm_instances_on_close) {
        jni::MethodId set_should_display_method_id {
          garbage_collector_cls.get_method_id(env, "setShouldDisplayLeakInstancesOnClose", "(Z)V")};
        jvalue d_arg[1] = {jni::to_jni_arg(false)};
        garbage_collector_instance.call_void_method(env, set_should_display_method_id, d_arg);
    }

    jni::JClass bootstrap_cls = env.load_class("godot.runtime.Bootstrap", class_loader);
    jni::MethodId ctor = bootstrap_cls.get_constructor_method_id(env, "()V");
    jni::JObject instance = bootstrap_cls.new_instance(env, ctor);
    bootstrap = new Bootstrap(instance);
    Bootstrap::register_hooks(load_classes_hook, register_engine_types_hook);
    Bootstrap::initialize_class("godot.runtime.Bootstrap");
    bool is_editor = Engine::get_singleton()->is_editor_hint();

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
      is_editor,
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
    if (Engine::get_singleton()->is_project_manager_hint()) {
#ifdef DEBUG_ENABLED
        LOG_VERBOSE("Detected that we're in the project manager. No cleanup necessary");
#endif
        return;
    }
    auto env = jni::Jvm::current_env();

    bootstrap->finish(env);

    delete transfer_context;
    transfer_context = nullptr;
    delete bootstrap;
    bootstrap = nullptr;

    TypeManager::get_instance().clear();

    if (is_gc_started) {
        jni::JClass garbage_collector_cls {env.load_class("godot.core.memory.MemoryManager", ClassLoader::get_default_loader())};
        jni::FieldId garbage_collector_instance_field {
          garbage_collector_cls.get_static_field_id(env, "INSTANCE", "Lgodot/core/memory/MemoryManager;")};
        jni::JObject garbage_collector_instance {garbage_collector_cls.get_static_object_field(env, garbage_collector_instance_field)};
        JVM_CRASH_COND_MSG(garbage_collector_instance.is_null(), "Failed to retrieve MemoryManager instance");
        jni::MethodId close_method_id {garbage_collector_cls.get_method_id(env, "close", "()V")};
        garbage_collector_instance.call_void_method(env, close_method_id);
        jni::MethodId has_closed_method_id {garbage_collector_cls.get_method_id(env, "isClosed", "()Z")};
        while (!garbage_collector_instance.call_boolean_method(env, has_closed_method_id)) {
            OS::get_singleton()->delay_usec(600000);
        }
#ifdef DEBUG_ENABLED
        LOG_VERBOSE("JVM GC thread was closed");
#endif
        jni::MethodId clean_up_method_id {garbage_collector_cls.get_method_id(env, "cleanUp", "()V")};
        garbage_collector_instance.call_void_method(env, clean_up_method_id);
    }

    LongStringQueue::destroy();
    BridgesManager::get_instance().delete_bridges();

    ClassLoader::delete_default_loader(env);
    jni::Jvm::destroy();
    LOG_INFO("Shutting down JVM ...");
}

void GDKotlin::register_classes(jni::Env& p_env, jni::JObjectArray p_classes) {
#ifdef DEV_ENABLED
    LOG_INFO("Loading classes ...");
#endif
    Vector<KtClass*> classes;
    for (auto i = 0; i < p_classes.length(p_env); i++) {
        KtClass* kt_class = new KtClass(p_classes.get(p_env, i));
        kt_class->fetch_members();
        classes.append(kt_class);
#ifdef DEV_ENABLED
        LOG_VERBOSE(vformat("Loaded class %s : %s, as %s", kt_class->registered_class_name, kt_class->base_godot_class));
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
    if (type == jni::Jvm::GRAAL_NATIVE_IMAGE) { return jni::JObject(); }
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
  is_initialized(false),
  transfer_context(nullptr) {}

bool GDKotlin::check_configuration() {
    bool has_configuration_error = false;
    if (Engine::get_singleton()->is_editor_hint() && OS::get_singleton()->get_environment("JAVA_HOME").is_empty()) {
        LOG_WARNING("JAVA_HOME not defined. Godot-JVM module won't be loaded!");
        configuration_errors.push_back(
          {"JAVA_HOME not defined",
           "JAVA_HOME environment variable is not defined. This is necessary for Godot-Jvm to work while you develop "
           "on your machine.\n"
           "You can continue to use the editor but all Godot-Jvm related functionality remains disabled until you "
           "define JAVA_HOME and restart the editor."}
        );
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

void GDKotlin::initialize_classes() {
    TransferContext::initialize_class("godot.core.memory.TransferContext");
    LongStringQueue::initialize_class("godot.core.LongStringQueue");

    KtObject::initialize_class("godot.core.KtObject");

    KtPropertyInfo::initialize_class("godot.core.KtPropertyInfo");
    KtProperty::initialize_class("godot.core.KtProperty");
    KtConstructor::initialize_class("godot.core.KtConstructor");
    KtSignalInfo::initialize_class("godot.core.KtSignalInfo");
    KtRpcConfig::initialize_class("godot.core.KtRpcConfig");
    KtFunctionInfo::initialize_class("godot.core.KtFunctionInfo");
    KtFunction::initialize_class("godot.core.KtFunction");
    KtClass::initialize_class("godot.core.KtClass");
}
