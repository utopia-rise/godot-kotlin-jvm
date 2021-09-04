#ifndef GODOT_JVM_JAR_PATH_PROVIDER_H
#define GODOT_JVM_JAR_PATH_PROVIDER_H


#include <core/ustring.h>
#include <modules/kotlin_jvm/src/jni/jvm.h>

#define USERCODE_NAME "usercode"
#define USERCODE_JAR_EXTENSION ".jar"
#define USERCODE_ANDROID_EXTENSION "-dex.jar"

#ifdef __linux__
#define LIB_GRAAL_VM_EXTENSION ".so"
#elif __APPLE__
#include <TargetConditionals.h>
    #if TARGET_OS_MAC
        #define LIB_GRAAL_VM_EXTENSION ".dylib"
    #endif
#elif defined _WIN32 || defined _WIN64
#define LIB_GRAAL_VM_EXTENSION ".dll"
#endif

class PathProvider {

public:
    PathProvider(const PathProvider&) = delete;

    PathProvider& operator=(const PathProvider&) = delete;

    static String provide_build_lock_dir_path();
    static String provide_build_lock_file_path();
    static String provide_runtime_usercode_path();
    static String provide_build_usercode_path();
    static bool copy_usercode_jar_if_necessary();
    static String get_usercode_name();
    static String get_usercode_name_for_vm_type(jni::Jvm::Type vm_type);

private:
    PathProvider() = default;

    ~PathProvider() = default;

};


#endif //GODOT_JVM_JAR_PATH_PROVIDER_H
