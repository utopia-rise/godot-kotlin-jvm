#include "gd_kotlin.h"

#include "jvm_wrapper/memory/memory_manager.h"
#include "jvm_wrapper/memory/transfer_context.h"
#include "lifecycle/class_loader.h"
#include "lifecycle/jvm_manager.h"

#include <core/config/project_settings.h>
#include <core/io/resource_loader.h>
#include <main/main.h>

GDKotlin& GDKotlin::get_instance() {
    static GDKotlin instance;
    return instance;
}

void GDKotlin::fetch_user_configuration() {
    bool invalid_file_content = false;
    bool configuration_file_exist = FileAccess::exists(JVM_CONFIGURATION_PATH);

    if (configuration_file_exist) {
        Ref<FileAccess> file_access = FileAccess::open(JVM_CONFIGURATION_PATH, FileAccess::READ);
        String content = file_access->get_as_utf8_string();

        // The function is going to mutate the provided user_configuration with the valid values found in the file.
        // If some of the values parsed in the file are invalid, it will return true;
        LOG_VERBOSE("Parsing JSON user_configuration file...")
        invalid_file_content = JvmUserConfiguration::parse_configuration_json(content, user_configuration);
        if (invalid_file_content) {
            LOG_WARNING("user_configuration file is malformed. One or several settings might not be applied.");
        }
    } else {
        // No need for a warning, it's most likely the first time the project is run.
        LOG_INFO("No JVM user_configuration file found. Default settings for your platform will be used.");
    }

#ifdef TOOLS_ENABLED
    // If user_configuration is missing or malformed, then we write a new one.
    // Valid values from the json file should be in the instance already, so they won't be lost when writing to disk.
    if (invalid_file_content || !configuration_file_exist) {
        Ref<FileAccess> file_access = FileAccess::open(JVM_CONFIGURATION_PATH, FileAccess::WRITE);
        String json = JvmUserConfiguration::export_configuration_to_json(user_configuration);
        LOG_INFO(vformat("Writing a new user_configuration file to disk at %s", JVM_CONFIGURATION_PATH));
        file_access->store_string(json);
    }
#endif

    HashMap<String, Variant> cmd_argument_map;
    LOG_VERBOSE("Parsing commandline arguments...")
    JvmUserConfiguration::parse_command_line(OS::get_singleton()->get_cmdline_args(), cmd_argument_map);
    LOG_VERBOSE("Creating final JVM user_configuration...")
    JvmUserConfiguration::merge_with_command_line(user_configuration, cmd_argument_map);
    JvmUserConfiguration::sanitize_and_log_configuration(user_configuration);
}

void GDKotlin::fetch_loading_configuration() {
    JvmLoadingConfiguration::create(user_configuration, loading_configuration);
    JvmLoadingConfiguration::add_options(user_configuration, loading_configuration);
}

#ifdef TOOLS_ENABLED

String GDKotlin::get_path_to_environment_jvm() {
    String javaHome {OS::get_singleton()->get_environment("JAVA_HOME")};
    if (javaHome.is_empty()) { return javaHome; }
    return javaHome.path_join(RELATIVE_JVM_LIB_PATH);
}

String GDKotlin::get_path_to_embedded_jvm() {
    return String(RES_DIRECTORY) + String(EMBEDDED_JRE_DIRECTORY) + String(RELATIVE_JVM_LIB_PATH);
}

String GDKotlin::get_path_to_native_image() {
    return String(BUILD_DIRECTORY) + String(GRAAL_NATIVE_IMAGE_FILE);
}

#else

#include <core/io/dir_access.h>

String GDKotlin::copy_new_file_to_user_dir(const String& file_name) {
    String file_res_path {String(BUILD_DIRECTORY) + file_name};
    String file_user_path {String(USER_DIRECTORY) + file_name};

    if (!FileAccess::exists(file_user_path) || FileAccess::get_md5(file_user_path) != FileAccess::get_md5(file_res_path)) {
        LOG_VERBOSE(vformat("%s file has changed. Copying it from res:// to user://.", file_name));

        Error err;
        Ref<DirAccess> dir_access {DirAccess::open(BUILD_DIRECTORY, &err)};

        JVM_ERR_FAIL_COND_V_MSG(err != OK, "", vformat("Cannot open %s file in res://.", file_name));

        dir_access->copy(file_res_path, file_user_path);
    }
    return file_user_path;
}

String GDKotlin::get_path_to_embedded_jvm() {
    return OS::get_singleton()->get_executable_path().get_base_dir() +
#if defined(MACOS_ENABLED)
           String("../PlugIns/") +
#endif
           String(EMBEDDED_JRE_DIRECTORY) + String(RELATIVE_JVM_LIB_PATH);
}

String GDKotlin::get_path_to_native_image() {
    return copy_new_file_to_user_dir(GRAAL_NATIVE_IMAGE_FILE);
}

#endif

void GDKotlin::load_dynamic_lib() {
    if (loading_configuration.loading_type != JvmLoadingType::DYNAMIC) { return; }

    String path_to_jvm_lib;
    switch (user_configuration.vm_type) {
        case jni::JvmType::JVM:
            if (String embedded_jvm = get_path_to_embedded_jvm(); FileAccess::exists(embedded_jvm)) {
                path_to_jvm_lib = embedded_jvm;
            }
#ifdef TOOLS_ENABLED
            else if (String environment_jvm = get_path_to_environment_jvm();
                     !environment_jvm.is_empty() && FileAccess::exists(environment_jvm)) {
                LOG_WARNING(vformat("Godot-JVM: You really should embed a JRE in your project with jlink! See the "
                                    "documentation if you don't know how to do that"));
                path_to_jvm_lib = environment_jvm;
            } else {
#ifdef MACOS_ENABLED
                JVM_CRASH_NOW_MSG(
                  "The environment variable JAVA_HOME is not found and there is no embedded JRE. If you "
                  "launched the editor through a double click on Godot.app, also make sure that JAVA_HOME "
                  "is set through launchctl: `launchctl setenv JAVA_HOME </path/to/jdk>`"
                );
#else
                JVM_CRASH_NOW_MSG("The environment variable JAVA_HOME is not found and there is no embedded JRE.");
#endif
            }
#else
            else {
                JVM_CRASH_NOW_MSG("No embedded JRE found!");
            }
#endif

            break;
        case jni::JvmType::GRAAL_NATIVE_IMAGE:
            if (String native_jvm = get_path_to_native_image(); FileAccess::exists(native_jvm)) {
                path_to_jvm_lib = native_jvm;
            } else {
                JVM_CRASH_NOW_MSG("Cannot find Graal VM user code native image! /n This usually happens when you "
                                  "define that your project should be executed using graalvm but did not successfully "
                                  "compile your project and thus usercode.(sh, dll, dylib) cannot be found.");
            }
            break;
        default:
            // Sanity check. Should never happen
            JVM_CRASH_NOW_MSG("Tried to load a VM that's neither the JVM nor Graal Native Image");
    }

    if (OS::get_singleton()->open_dynamic_library(path_to_jvm_lib, jvm_dynamic_library_handle) != OK) {
        JVM_CRASH_NOW_MSG(vformat("Failed to load the jvm dynamic library from path %s!", path_to_jvm_lib));
    }
}

ClassLoader* GDKotlin::load_bootstrap()  const {
    if (loading_configuration.code_included_in_vm) { return nullptr;}

    jni::Env env {jni::Jvm::current_env()};
#ifdef TOOLS_ENABLED
    String bootstrap_jar {OS::get_singleton()->get_executable_path().get_base_dir().path_join(BOOTSTRAP_FILE)};
    constexpr const char* error_text {"No godot-bootstrap.jar found! This file needs to stay alongside the godot editor executable!"};
#else
    String bootstrap_jar {ProjectSettings::get_singleton()->globalize_path(copy_new_file_to_user_dir(BOOTSTRAP_FILE))};
    constexpr const char* error_text {"No godot-bootstrap.jar found!"};
#endif

    JVM_CRASH_COND_MSG(!FileAccess::exists(bootstrap_jar), error_text);
    LOG_INFO(vformat("Loading bootstrap jar: %s", bootstrap_jar));


    ClassLoader* class_loader = ClassLoader::create_instance(env, bootstrap_jar, jni::JObject(nullptr));
    class_loader->set_as_context_loader(env);
    return class_loader;
}

void GDKotlin::initialize_core_library(ClassLoader* class_loader) {
    jni::Env env {jni::Jvm::current_env()};
    JvmManager::initialize_jni_classes(env, class_loader);

    if (user_configuration.max_string_size != 0) {
        LongStringQueue::get_instance().set_string_max_size(env, user_configuration.max_string_size);
    }

    if (!user_configuration.disable_gc) {
        if (user_configuration.force_gc) { LOG_DEV("Starting GC thread with force mode."); }

        MemoryManager::get_instance().start(env, user_configuration.force_gc);
        LOG_DEV("GC thread started.");

        is_gc_started = true;
    }

    if (user_configuration.disable_leak_warning_on_close) { MemoryManager::get_instance().setDisplayLeaks(env, false); }

    bootstrap = Bootstrap::create_instance(env, class_loader);
}

void GDKotlin::init() {
    fetch_user_configuration();
    fetch_loading_configuration();

    load_dynamic_lib();
    JvmManager::initialize_or_get_jvm(user_configuration, loading_configuration);

    ClassLoader* class_loader {load_bootstrap()};
    initialize_core_library(class_loader);

#ifdef __ANDROID__
    String main_jar_file {"main-dex.jar"};
    copy_new_file_to_user_dir(main_jar_file);
#else
    String main_jar_file;
    if (user_configuration.vm_type == jni::JvmType::GRAAL_NATIVE_IMAGE) {
        main_jar_file = "graal_usercode";
    } else {
        main_jar_file = "main.jar";
        // copy_new_file_to_user_dir(main_jar_file);
    }
#endif





#ifdef TOOLS_ENABLED
    String jar_path {ProjectSettings::get_singleton()->globalize_path("res://build/libs/")};
#else
    String jar_path {ProjectSettings::get_singleton()->globalize_path("user://")};
#endif

    String project_path {ProjectSettings::get_singleton()->globalize_path("res://")};

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
      ClassLoader::provide_loader(env, main_jar, wrapped)
#else
      jni::JObject()
#endif
    );
}

void GDKotlin::unload_dynamic_lib() {
    if (OS::get_singleton()->close_dynamic_library(jvm_dynamic_library_handle) != OK) {
        JVM_CRASH_NOW_MSG("Failed to close the jvm dynamic library!");
    }
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
        LOG_DEV("JVM GC thread was closed");
        MemoryManager::get_instance().clean_up(env);
    }

    JvmManager::destroy_jni_classes();

    ClassLoader::delete_default_loader(env);
    JvmManager::close_jvm(loading_configuration);

    if (loading_configuration.loading_type == JvmLoadingType::DYNAMIC) { unload_dynamic_lib(); }
}

void GDKotlin::register_classes(jni::Env& p_env, jni::JObjectArray p_classes) {
    LOG_DEV("Loading classes ...");

    jni::Env env {jni::Jvm::current_env()};
    Vector<KtClass*> classes;
    for (auto i = 0; i < p_classes.length(p_env); i++) {
        KtClass* kt_class = new KtClass(env, p_classes.get(p_env, i));
        kt_class->fetch_members(env);
        classes.append(kt_class);
        LOG_DEV_VERBOSE(vformat("Loaded class %s : %s", kt_class->registered_class_name, kt_class->base_godot_class));
    }
    TypeManager::get_instance().create_and_update_scripts(classes);
}

const JvmUserConfiguration& GDKotlin::get_configuration() {
    return user_configuration;
}
