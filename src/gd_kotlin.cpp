#include "gd_kotlin.h"

#include "jvm_wrapper/memory/long_string_queue.h"
#include "jvm_wrapper/memory/memory_manager.h"
#include "jvm_wrapper/memory/type_manager.h"
#include "lifecycle/paths.h"
#include "script/jvm_script_manager.h"

#include <core/config/project_settings.h>
#include <core/io/resource_loader.h>
#include <main/main.h>

GDKotlin& GDKotlin::get_instance() {
    static GDKotlin instance;
    return instance;
}

const JvmUserConfiguration& GDKotlin::get_configuration() {
    return user_configuration;
}

#ifdef DYNAMIC_JVM
bool GDKotlin::load_dynamic_lib() {
    String path_to_jvm_lib;
    switch (user_configuration.vm_type) {
        case jni::JvmType::JVM:
            if (String embedded_jvm = get_path_to_embedded_jvm(); FileAccess::exists(embedded_jvm)) {
                path_to_jvm_lib = embedded_jvm;
            }
#ifdef TOOLS_ENABLED
            else if (String environment_jvm = get_path_to_environment_jvm();
                     !environment_jvm.is_empty() && FileAccess::exists(environment_jvm)) {
                JVM_LOG_WARNING("Godot-JVM: You really should embed a JRE in your project with jlink! See the "
                                "documentation if you don't know how to do that");
                path_to_jvm_lib = environment_jvm;
            } else {
#ifdef MACOS_ENABLED
                JVM_ERR_FAIL_V_MSG(
                  false,
                  "The environment variable JAVA_HOME is not found and there is no embedded JRE. If you "
                  "launched the editor through a double click on Godot.app, also make sure that JAVA_HOME "
                  "is set through launchctl: `launchctl setenv JAVA_HOME </path/to/jdk>`"
                );
#else
                JVM_ERR_FAIL_V_MSG(false, "The environment variable JAVA_HOME is not found and there is no embedded JRE.");
#endif
            }
#else
            else {
                JVM_ERR_FAIL_V_MSG(false, "No embedded JRE found at: %s!", get_path_to_embedded_jvm());
            }
#endif

            break;
        case jni::JvmType::GRAAL_NATIVE_IMAGE:
            if (String native_jvm = get_path_to_native_image(); FileAccess::exists(native_jvm)) {
                path_to_jvm_lib = native_jvm;
            } else {
                JVM_ERR_FAIL_V_MSG(
                  false,
                  "Cannot find Graal VM user code native image! /n This usually happens when you "
                  "define that your project should be executed using graalvm but did not "
                  "successfully "
                  "compile your project and thus usercode.(sh, dll, dylib) cannot be found."
                );
            }
            break;
        default:
            // Sanity check. Should never happen
            JVM_DEV_ASSERT(false, "Tried to load a VM that's neither the JVM nor Graal Native Image");
    }

    if (OS::get_singleton()->open_dynamic_library(path_to_jvm_lib, jvm_dynamic_library_handle) != OK) {
        JVM_ERR_FAIL_V_MSG(false, vformat("Failed to load the jvm dynamic library from path %s!", path_to_jvm_lib));
    }
    return true;
}

#ifdef TOOLS_ENABLED
String GDKotlin::get_path_to_embedded_jvm() {
    String godot_path {String(HOST_EMBEDDED_JRE_DIRECTORY).path_join(RELATIVE_JVM_LIB_PATH)};
    return ProjectSettings::get_singleton()->globalize_path(godot_path);
}

String GDKotlin::get_path_to_native_image() {
    return ProjectSettings::get_singleton()->globalize_path(GRAAL_NATIVE_IMAGE_FILE);
}

String GDKotlin::get_path_to_environment_jvm() {
    String javaHome {OS::get_singleton()->get_environment("JAVA_HOME")};
    if (javaHome.is_empty()) { return javaHome; }
    return javaHome.path_join(RELATIVE_JVM_LIB_PATH);
}

#else

String GDKotlin::get_path_to_embedded_jvm() {
    return OS::get_singleton()
      ->get_executable_path()
      .get_base_dir()
#if defined(MACOS_ENABLED)
      .path_join("../PlugIns/")
#endif
      .path_join(HOST_EMBEDDED_JRE_DIRECTORY)
      .path_join(RELATIVE_JVM_LIB_PATH);
}

String GDKotlin::get_path_to_native_image() {
    return ProjectSettings::get_singleton()->globalize_path(copy_new_file_to_user_dir(GRAAL_NATIVE_IMAGE_FILE));
}
#endif

void GDKotlin::unload_dynamic_lib() {
    if (OS::get_singleton()->close_dynamic_library(jvm_dynamic_library_handle) != OK) {
        JVM_ERR_FAIL_MSG("Failed to close the jvm dynamic library!");
    }
}
#endif

void GDKotlin::fetch_user_configuration() {
    bool invalid_file_content = false;
    bool configuration_file_exist = FileAccess::exists(JVM_CONFIGURATION_PATH);

    if (configuration_file_exist) {
        Ref<FileAccess> file_access = FileAccess::open(JVM_CONFIGURATION_PATH, FileAccess::READ);
        String content = file_access->get_as_utf8_string();

        // The function is going to mutate the provided configuration with the valid values found in the file.
        // If some of the values parsed in the file are invalid, it will return true;
        JVM_LOG_VERBOSE("Parsing JSON configuration file...");
        invalid_file_content = JvmUserConfiguration::parse_configuration_json(content, user_configuration);
        if (invalid_file_content) {
            JVM_LOG_WARNING("Configuration file is malformed. One or several settings might not be applied.");
        }
    } else {
        // No need for a warning, it's most likely the first time the project is run.
        JVM_LOG_INFO("No JVM user_configuration file found. Default settings for your platform will be used.");
    }

#ifdef TOOLS_ENABLED
    // If configuration is missing or malformed, then we write a new one.
    // Valid values from the json file should be in the instance already, so they won't be lost when writing to disk.
    if (invalid_file_content || !configuration_file_exist) {
        Ref<FileAccess> file_access = FileAccess::open(JVM_CONFIGURATION_PATH, FileAccess::WRITE);
        String json = JvmUserConfiguration::export_configuration_to_json(user_configuration);
        JVM_LOG_INFO("Writing a new configuration file to disk at %s", JVM_CONFIGURATION_PATH);
        file_access->store_string(json);
    }
#endif

    HashMap<String, Variant> cmd_argument_map;
    JVM_LOG_VERBOSE("Parsing commandline arguments...");
    JvmUserConfiguration::parse_command_line(OS::get_singleton()->get_cmdline_args(), cmd_argument_map);
    JVM_LOG_VERBOSE("Creating final JVM Configuration...");
    JvmUserConfiguration::merge_with_command_line(user_configuration, cmd_argument_map);
    JvmUserConfiguration::sanitize_and_log_configuration(user_configuration);
}

void GDKotlin::set_jvm_options() {
#ifdef DEV_ENABLED
    jvm_options.add_jni_checks();
#endif

#ifdef DEBUG_ENABLED
    if (user_configuration.use_debug) {
        jvm_options.add_debug_options(
          user_configuration.jvm_debug_port,
          user_configuration.jvm_debug_address,
          user_configuration.wait_for_debugger
        );
    }
#endif

    if (user_configuration.jvm_jmx_port >= 0) { jvm_options.add_jmx_option(user_configuration.jvm_jmx_port); }

    if (!Engine::get_singleton()->is_editor_hint() && !user_configuration.jvm_args.is_empty()) {
        JVM_LOG_WARNING("You are using custom arguments for the JVM. Make sure they are valid or you risk the JVM to "
                        "not "
                        "launch properly");
        jvm_options.add_custom_options(user_configuration.jvm_args);
    }
}

#ifndef TOOLS_ENABLED

#include <core/io/dir_access.h>

#ifdef __ANDROID__
#include <unistd.h>
#endif

String GDKotlin::copy_new_file_to_user_dir(const String& file_name) {
    String file_res_path {String(RES_DIRECTORY) + file_name};
    String file_user_path {String(USER_DIRECTORY) + file_name};

#ifndef __ANDROID__
    if (!FileAccess::exists(file_user_path) || FileAccess::get_md5(file_user_path) != FileAccess::get_md5(file_res_path)) {
        JVM_LOG_VERBOSE("%s file has changed. Copying it from %s to %s.", file_name, file_res_path, file_user_path);
#else
    // as per suggestion of https://developer.android.com/about/versions/14/behavior-changes-14#safer-dynamic-code-loading, we first delete existing files and then copy them again
    // if we don't do this, subsequent app starts where the files already exist, error out

    String file_user_path_global {ProjectSettings::get_singleton()->globalize_path(file_user_path)};
    unlink(file_user_path_global.utf8().get_data());// we do not really care about errors here
#endif
        Ref<DirAccess> dir_access {DirAccess::open(USER_DIRECTORY)};
        dir_access->make_dir("jvm");
        dir_access->copy(file_res_path, file_user_path);
#ifndef __ANDROID__
    }
#endif

    return file_user_path;
}

#endif

bool GDKotlin::load_bootstrap() {
    if (user_configuration.vm_type == jni::JvmType::GRAAL_NATIVE_IMAGE) {
        return true;// Bootstrap already part of the image
    }

    jni::Env env {jni::Jvm::current_env()};
#ifdef TOOLS_ENABLED
    String bootstrap_jar {OS::get_singleton()->get_executable_path().get_base_dir().path_join(EDITOR_BOOTSTRAP_PATH)};
    constexpr const char* error_text {"No godot-bootstrap.jar found! This file needs to stay alongside the godot "
                                      "editor executable!"};
#else
    String bootstrap_jar {ProjectSettings::get_singleton()->globalize_path(copy_new_file_to_user_dir(BOOTSTRAP_FILE))};
    constexpr const char* error_text {"No godot-bootstrap.jar found!"};
#endif

    JVM_ERR_FAIL_COND_V_MSG(!FileAccess::exists(bootstrap_jar), false, error_text);
    JVM_LOG_VERBOSE("Loading bootstrap jar: %s", bootstrap_jar);

    bootstrap_class_loader = ClassLoader::create_instance(env, bootstrap_jar, jni::JObject(nullptr));
    bootstrap_class_loader->set_as_context_loader(env);
    return true;
}

bool GDKotlin::initialize_core_library() {
    callable_middleman = memnew(Object);
    jni::Env env {jni::Jvm::current_env()};

    if (!JvmManager::initialize_jvm_wrappers(env, bootstrap_class_loader)) { return false; }

    if (user_configuration.max_string_size != -1) {
        LongStringQueue::get_instance().set_string_max_size(env, user_configuration.max_string_size);
    }

    bootstrap = Bootstrap::create_instance(env, bootstrap_class_loader);
    return true;
}

bool GDKotlin::load_user_code() {
#ifdef TOOLS_ENABLED
    String project_path {ProjectSettings::get_singleton()->globalize_path(RES_DIRECTORY)};
#else
    String project_path {""};
#endif

    jni::Env env {jni::Jvm::current_env()};
    if (user_configuration.vm_type == jni::JvmType::GRAAL_NATIVE_IMAGE) {
        bootstrap->init(env, project_path, "", jni::JObject(nullptr));
        return true;
    } else {
#ifdef TOOLS_ENABLED
        String user_code_path {String(RES_DIRECTORY).path_join(USER_CODE_FILE)};
#else
        String user_code_path {copy_new_file_to_user_dir(USER_CODE_FILE)};
#endif

        if (!FileAccess::exists(user_code_path)) {
            String message {"No main.jar detected at %s. No classes will be loaded. Build the gradle "
                            "project to load classes"};
#ifdef TOOLS_ENABLED
            JVM_LOG_WARNING(message, user_code_path);
            return false;
#elif defined DEBUG_ENABLED
            JVM_ERR_FAIL_V_MSG(false, message, user_code_path);
#endif
        }

        JVM_LOG_VERBOSE("Loading usercode file at: %s", user_code_path);
        jar.instantiate();
        jar->set_path(user_code_path, true);

        ClassLoader* user_class_loader = ClassLoader::create_instance(
          env,
          ProjectSettings::get_singleton()->globalize_path(user_code_path),
          bootstrap_class_loader->get_wrapped()
        );

        bootstrap->init(
          env,
          project_path,
          ProjectSettings::get_singleton()->globalize_path(user_code_path),
          user_class_loader->get_wrapped()
        );
        delete user_class_loader;
        return FileAccess::exists(user_code_path);
    }
}

void GDKotlin::unload_user_code() {
    jni::Env env {jni::Jvm::current_env()};
    bootstrap->finish(env);
    TypeManager::get_instance().clear();
    jar.unref();
}

void GDKotlin::finalize_core_library() {
    jni::Env env {jni::Jvm::current_env()};

    MemoryManager::get_instance().clean_up(env);

    JvmManager::finalize_jvm_wrappers(env, bootstrap_class_loader);
    memdelete(callable_middleman);
    callable_middleman = nullptr;
}

void GDKotlin::unload_boostrap() {
    delete bootstrap;
    bootstrap = nullptr;
    delete bootstrap_class_loader;
    bootstrap_class_loader = nullptr;
}

#define SET_LOADING_STATE(cond, new_state, target_state) \
    if (state < State::new_state) {                      \
        if (!cond) { return; }                           \
        state = State::new_state;                        \
        if (new_state == target_state) { return; }       \
    }

void GDKotlin::initialize_up_to(State target_state) {
    if (state == State::NOT_STARTED) {
        fetch_user_configuration();
        set_jvm_options();
    }

#ifdef DYNAMIC_JVM
    SET_LOADING_STATE(load_dynamic_lib(), JVM_LIBRARY_LOADED, target_state)
    SET_LOADING_STATE(JvmManager::initialize_or_get_jvm(jvm_dynamic_library_handle, user_configuration, jvm_options), JVM_STARTED, target_state)
#else
    SET_LOADING_STATE(JvmManager::initialize_or_get_jvm(nullptr, user_configuration, jvm_options), JVM_STARTED, target_state)
#endif
    SET_LOADING_STATE(load_bootstrap(), BOOTSTRAP_LOADED, target_state)
    SET_LOADING_STATE(initialize_core_library(), CORE_LIBRARY_INITIALIZED, target_state)
    SET_LOADING_STATE(load_user_code(), JVM_SCRIPTS_INITIALIZED, target_state)
}

#define UNSET_LOADING_STATE(function, new_state, target_state) \
    if (state > State::new_state) {                            \
        function;                                              \
        state = State::new_state;                              \
        if (new_state == target_state) { return; }             \
    }

void GDKotlin::finalize_down_to(State target_state) {
    UNSET_LOADING_STATE(unload_user_code(), CORE_LIBRARY_INITIALIZED, target_state)
    UNSET_LOADING_STATE(finalize_core_library(), BOOTSTRAP_LOADED, target_state)
    UNSET_LOADING_STATE(unload_boostrap(), JVM_STARTED, target_state)
#ifdef DYNAMIC_JVM
    UNSET_LOADING_STATE(JvmManager::close_jvm(), JVM_LIBRARY_LOADED, target_state)
    UNSET_LOADING_STATE(unload_dynamic_lib(), NOT_STARTED, target_state)
#else
    UNSET_LOADING_STATE(JvmManager::close_jvm(), NOT_STARTED, target_state)
#endif
}

#ifdef DYNAMIC_JVM
void GDKotlin::reload_user_code() {
    if (user_configuration.vm_type == jni::JvmType::JVM) {
        finalize_down_to(BOOTSTRAP_LOADED);
        initialize_up_to(JVM_SCRIPTS_INITIALIZED);
    }
}
#endif

Object* GDKotlin::get_callable_middleman() const {
    return callable_middleman;
}

#ifdef DEBUG_ENABLED
void GDKotlin::validate_state() {
    bool invalid {false};

    String warning {"Godot Kotlin/JVM module couldn't be fully initialized.\n"
                    "Java and Kotlin scripts will still appear in the editor but won't be functional.\n"
                    "The cause was:\n"};
    String cause {"No cause identified."};
    String pre_hint {"\nOne possible solution is:\n"};
    String hint {"No solution suggested."};

    if (state == State::NOT_STARTED) {
        invalid = true;
#ifdef DYNAMIC_JVM
        if (user_configuration.vm_type == jni::JVM) {
            cause = "Couldn't open JVM dynamic library.";
            hint =
              "Make sure the JAVA_HOME environment variable is set or add an embedded JRE to your project using jlink.";
        } else if (user_configuration.vm_type == jni::GRAAL_NATIVE_IMAGE) {
            cause = "Couldn't open Graal Native Image.";
            hint = "Make sure you have built your JVM project with Graal native image enabled in your gradle build.";
        }
#endif
    }

    if (state == State::JVM_LIBRARY_LOADED) {
        invalid = true;
        cause = "Couldn't start the JVM.";
        hint = "Check your configuration file and command-line arguments for any invalid setting, including your "
               "custom jvm arguments.";
    }

    if (state == State::JVM_STARTED) {
        invalid = true;
#ifdef DYNAMIC_JVM
        if (user_configuration.vm_type == jni::JVM) {
            cause = "Couldn't find the bootstrap.jar.";
            hint = "Don't forget to set a up-to-date boostrap.jar next to the editor executable.";
        }
#endif
    }

    if (state == State::BOOTSTRAP_LOADED) {
        invalid = true;
        cause = "The Godot Kotlin core library couldn't be initialized.";
        hint = "The Godot Kotlin version you use in your JVM project might not match the Godot executable.";
    }

    // Don't invalidate the state because everything is either loaded or the Kotlin project has simply not be built.
    if (state == State::CORE_LIBRARY_INITIALIZED || state == State::JVM_SCRIPTS_INITIALIZED) { return; }

    if (invalid) {
        finalize_down_to(NOT_STARTED);
        OS::get_singleton()->alert(warning + cause + pre_hint + hint, "Kotlin/JVM module initialization error");
    }
}

#endif