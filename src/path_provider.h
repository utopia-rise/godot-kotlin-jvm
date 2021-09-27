#ifndef GODOT_JVM_PATH_PROVIDER_H
#define GODOT_JVM_PATH_PROVIDER_H


#include <core/ustring.h>
#include <modules/kotlin_jvm/src/jni/jvm.h>

class PathProvider {

public:
    PathProvider(const PathProvider&) = delete;

    PathProvider& operator=(const PathProvider&) = delete;

    static constexpr const char* usercode_name{"usercode"};
    static constexpr const char* jar_extension{".jar"};
    static constexpr const char* jar_extension_android{"-dex.jar"};
    static constexpr const char* dynamic_library_extension_linux{".so"};
    static constexpr const char* dynamic_library_extension_osx{".dylib"};
    static constexpr const char* dynamic_library_extension_win{".dll"};

#ifdef TOOLS_ENABLED
    static String provide_build_lock_dir_path();
    static String provide_build_lock_file_path();
    static String provide_build_usercode_path();
#endif
    static String provide_runtime_usercode_path();
    static String get_usercode_name();
    static String get_host_dependent_dynamics_lib_extension();
    static String get_usercode_extension_for_vm_type(jni::Jvm::Type vm_type);

private:
    PathProvider() = default;

    ~PathProvider() = default;

};


#endif //GODOT_JVM_PATH_PROVIDER_H
