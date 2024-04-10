#ifndef __ANDROID__

#ifndef GODOT_LOADER_JVM_LOADER_H
#define GODOT_LOADER_JVM_LOADER_H

#include "jni/jvm.h"
#include "jvm_loading_configuration.h"

#ifdef X11_ENABLED
#define LIB_JVM_RELATIVE_PATH "lib/server/libjvm.so"
#define LIB_GRAAL_VM_RELATIVE_PATH "usercode.so"
#define FILE_SEPARATOR "/"
#elif MACOS_ENABLED
#include <TargetConditionals.h>
#define LIB_JVM_RELATIVE_PATH "lib/server/libjvm.dylib"
#define LIB_GRAAL_VM_RELATIVE_PATH "usercode.dylib"
#define FILE_SEPARATOR "/"
#elif WINDOWS_ENABLED
#define FILE_SEPARATOR "\\"
#define LIB_JVM_RELATIVE_PATH "bin\\server\\jvm.dll"
#define LIB_GRAAL_VM_RELATIVE_PATH "usercode.dll"
#endif

class JvmLoader {
public:
    static JavaVM* create_jvm(const JvmLoadingConfiguration& initArgs, jni::JvmType type);
    static jni::CreateJavaVM get_create_jvm_function();
    static void close_jvm();

private:
    static void* jvmLib;
    static void load_jvm_lib();
    static String get_jvm_lib_path();
    static String get_path_to_locally_installed_jvm();
    static String get_embedded_jre_path();
};

#endif// GODOT_LOADER_JVM_LOADER_H

#endif
