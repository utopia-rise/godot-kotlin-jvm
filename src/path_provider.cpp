
#include <core/project_settings.h>
#include <core/os/dir_access.h>
#include "path_provider.h"
#include "gd_kotlin.h"

String PathProvider::provide_runtime_usercode_path() {
#ifdef TOOLS_ENABLED
    String build_lock_dir_path = provide_build_lock_dir_path();
#if defined(__linux__) || defined(__APPLE__)
    String usercode_jar_path{build_lock_dir_path + "/" + get_usercode_name()};
#elif defined _WIN32 || defined _WIN64
    String usercode_jar_path{build_lock_dir_path + "\\" + get_usercode_name()};
#endif
    return usercode_jar_path;
#else //TOOLS_ENABLED
    return ProjectSettings::get_singleton()->globalize_path("user://" + get_usercode_name());
#endif //TOOLS_ENABLED
}

bool PathProvider::copy_usercode_jar_if_necessary() {
    String build_usercode_path = provide_build_usercode_path();
    String runtime_usercode_path = provide_runtime_usercode_path();

#ifndef TOOLS_ENABLED
    if (!FileAccess::exists(runtime_usercode_path) || FileAccess::get_md5(runtime_usercode_path) != FileAccess::get_md5(build_usercode_path)) {
#ifdef DEBUG_ENABLED
        LOG_INFO(vformat("%s has changed, will copy it from res...", get_usercode_name()));
#endif

        Error err;
        DirAccess* dir_access{DirAccess::open("res://build/libs", &err)};

#ifdef DEBUG_ENABLED
        JVM_CRASH_COND_MSG(err != OK, vformat("Cannot open %s in res. Error was %s", get_usercode_name(), err))
#endif

        dir_access->copy(build_usercode_path, runtime_usercode_path);
        memdelete(dir_access);
        return true;
    }
    return false;
#else
    String build_lock_dir_path = provide_build_lock_dir_path();
    String build_lock_file_path = provide_build_lock_file_path();

    if (!DirAccess::exists(build_lock_dir_path)) {
        DirAccess* build_lock_dir{DirAccess::create_for_path(build_lock_dir_path)};
        print_line(build_lock_dir_path);
        build_lock_dir->make_dir_recursive(build_lock_dir_path);
        memdelete(build_lock_dir);
    }

    if (!FileAccess::exists(build_lock_file_path)) {
        String original_main_jar_md5{FileAccess::get_md5(build_usercode_path)};
        String main_jar_md5{FileAccess::get_md5(runtime_usercode_path)};

        if (original_main_jar_md5 != main_jar_md5) {
            // teardown any usercode which might be loaded from the old usercode at this path. Is a no op if no usercode was loaded. Only present in TOOLS_ENABLED anyways
            GDKotlin::get_instance().teardown_usercode();

            DirAccess* build_lock_dir{DirAccess::create_for_path(build_lock_dir_path)};
            LOG_INFO(vformat("from path: %s", build_usercode_path))
            LOG_INFO(vformat("to path: %s", runtime_usercode_path))
            JVM_CRASH_COND_MSG(build_lock_dir->copy(build_usercode_path, runtime_usercode_path) != OK,
                               "Could not copy");
            memdelete(build_lock_dir);

            return true;
        }
    }
#endif
    return false;
}

String PathProvider::get_usercode_name() {
#ifdef __ANDROID__
    return String{usercode_name} + jar_extension_android;
#else
    String name;
    if (GDKotlin::get_instance().get_configuration().get_vm_type() == jni::Jvm::GRAAL_NATIVE_IMAGE) {
        name = String{usercode_name} + get_host_dependent_dynamics_lib_extension();
    } else {
        name = String{usercode_name} + jar_extension;
    }
    return name;
#endif
}

String PathProvider::provide_build_usercode_path() {
    return "res://build/libs/" + get_usercode_name();
}

String PathProvider::provide_build_lock_dir_path() {
#if defined(__linux__) || defined(__APPLE__)
    String tmp_dir{"/tmp"};
    Vector<String> project_dir_path_splitted{ProjectSettings::get_singleton()->globalize_path("res://").split("/")};
    String project_dir_name{project_dir_path_splitted[project_dir_path_splitted.size() - 2]};
    String build_lock_dir_path{tmp_dir + "/" + project_dir_name + "_buildLockDir"};
#elif defined _WIN32 || defined _WIN64
    String tmp_dir{OS::get_singleton()->get_environment("TMP")};
Vector<String> project_dir_path_splitted = ProjectSettings::get_singleton()->globalize_path("res://..").split("\\");
String project_dir_name{project_dir_path_splitted[project_dir_path_splitted.size() - 2]};
String build_lock_dir_path{tmp_dir + "\\" + project_dir_name + "_buildLockDir"};
#endif
    return build_lock_dir_path;
}

String PathProvider::provide_build_lock_file_path() {
    String build_lock_dir_path = provide_build_lock_dir_path();
#if defined(__linux__) || defined(__APPLE__)
    String build_lock_file_path{build_lock_dir_path + "/buildLock.lock"};
#elif defined _WIN32 || defined _WIN64
    String build_lock_file_path{build_lock_dir_path + "\\buildLock.lock"};
#endif
    return build_lock_file_path;
}

String PathProvider::get_host_dependent_dynamics_lib_extension() {
#ifdef __linux__
    return dynamic_library_extension_linux;
#elif __APPLE__
#include <TargetConditionals.h>
#if TARGET_OS_MAC
    return dynamic_library_extension_osx;
#endif
#elif defined _WIN32 || defined _WIN64
return dynamic_library_extension_win;
#endif
}

String PathProvider::get_usercode_extension_for_vm_type(jni::Jvm::Type vm_type) {
    switch (vm_type) {
        case jni::Jvm::JVM:
            return jar_extension;
        case jni::Jvm::ART:
            return jar_extension_android;
        case jni::Jvm::GRAAL_NATIVE_IMAGE:
#ifdef __linux__
            return dynamic_library_extension_linux;
#elif __APPLE__
#include <TargetConditionals.h>
#if TARGET_OS_MAC
            return dynamic_library_extension_osx;
#endif
#elif defined _WIN32 || defined _WIN64
            return dynamic_library_extension_win;
#endif
        default:
            LOG_ERROR("Unknown VM type, returning jar extension.")
            return jar_extension;
    }
}
