//
// Created by cedric on 19.08.20.
//

#ifndef __ANDROID__

#ifndef GODOT_LOADER_JVM_LOADER_H
#define GODOT_LOADER_JVM_LOADER_H

#include "jvm.h"

#ifdef __linux__
#define LIB_JVM_RELATIVE_PATH "lib/server/libjvm.so"
#define LIB_GRAAL_VM_RELATIVE_PATH "usercode.so"
#define FILE_SEPARATOR "/"
#elif __APPLE__
#include <TargetConditionals.h>
#if TARGET_OS_MAC
#define LIB_JVM_RELATIVE_PATH "lib/server/libjvm.dylib"
#define LIB_GRAAL_VM_RELATIVE_PATH "usercode.dylib"
#define FILE_SEPARATOR "/"
#endif
#elif defined _WIN32 || defined _WIN64
#define FILE_SEPARATOR "\\"
#define LIB_JVM_RELATIVE_PATH "bin\\server\\jvm.dll"
#define LIB_GRAAL_VM_RELATIVE_PATH "usercode.dll"
#endif

namespace jni {
    class JvmLoader {
    public:
        static CreateJavaVM get_create_jvm_function();
        static GetCreatedJavaVMs get_get_created_java_vm_function();
        static void close_jvm_lib();

    private:
        static void* jvmLib;
        static void load_jvm_lib();
        static String get_jvm_lib_path();
        static String get_path_to_locally_installed_jvm();
        static String get_embedded_jre_path();
    };
}// namespace jni

#endif// GODOT_LOADER_JVM_LOADER_H

#endif
