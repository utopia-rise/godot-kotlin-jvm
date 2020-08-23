#include "jvm_loader.h"

#ifdef __linux__
#include <dlfcn.h>
#include <core/engine.h>
#elif __APPLE__
#include "TargetConditionals.h"
#ifdef TARGET_OS_MAC
#include <dlfcn.h>
#endif
#elif defined _WIN32 || defined _WIN64
#include <Windows.h>
#endif

void *jni::JvmLoader::jvmLib = nullptr;

void jni::JvmLoader::loadJvmLib() {
    const char *libPath = getJvmLibPath();
#ifdef __linux__
    jvmLib = dlopen(libPath, RTLD_NOW);
    if (jvmLib == nullptr) {
        ERR_PRINT("Failed to load libjvm.so!")
        exit(1);
    }
#elif TARGET_OS_MAC
    jvmLib = dlopen(libPath, RTLD_NOW);
    if (jvmLib == nullptr) {
        ERR_PRINT("Failed to load libjvm.dylib!")
        exit(1);
    }
#elif defined _WIN32 || defined _WIN64
    jvmLib = LoadLibrary(libPath);
    DWORD lastErrorCode = GetLastError();
    if (lastErrorCode == 126) {
        // "The specified module could not be found."
        // load vcruntime140.dll from the bundled JRE, then try again
        WARN_PRINT("Failed to load jvm.dll. Trying to load vcruntime140.dll first ...")

        HINSTANCE hinstVCR = LoadLibrary("jre\\bin\\vcruntime140.dll");
        if (hinstVCR != nullptr) {
            jvmLib = LoadLibrary(jvmDLLPath);
            if (jvmLib == nullptr) {
                ERR_PRINT("Failed to load jvm.dll.")
                exit(1);
            }
        } else {
            ERR_PRINT("Failed to load vcruntime140.dll.")
            exit(1);
        }
    }
    printf("Error: %d\n", lastErrorCode);
#endif
}

jni::CreateJavaVM jni::JvmLoader::getCreateJvmFunction() {
    if (jvmLib == nullptr) {
        loadJvmLib();
    }
#if defined __linux__ || defined TARGET_OS_MAC
    return (CreateJavaVM) dlsym(jvmLib, "JNI_CreateJavaVM");
#elif defined _WIN32 || defined _WIN64
    return (CreateJavaVM) GetProcAddress(jvmLib, "JNI_CreateJavaVM");
#endif
}

jni::GetCreatedJavaVMs jni::JvmLoader::getGetCreatedJavaVMsFunction() {
    if (jvmLib == nullptr) {
        loadJvmLib();
    }
#if defined __linux__ || defined TARGET_OS_MAC
    return (GetCreatedJavaVMs) dlsym(jvmLib, "JNI_GetCreatedJavaVMs");
#elif defined _WIN32 || defined _WIN64
    return (GetCreatedJavaVMs) GetProcAddress(jvmLib, "JNI_GetCreatedJavaVMs");
#endif
}

const char *jni::JvmLoader::getJvmLibPath() {
#ifdef __linux__
    const char *relativePath = "lib/server/libjvm.so";
    const char *fileSeparator = "/";
#elif TARGET_OS_MAC
    const char* relativePath = "lib/server/libjvm.dylib";
    const char* fileSeparator = "/";
#elif defined _WIN32 || defined _WIN64
    const char* relativePath = "bin\\server\\jvm.dll";
    const char* fileSeparator = "\\";
#endif

    String embeddedJrePath = String("jre/");

    if (Engine::get_singleton()->is_editor_hint()) {

        String message = String("No embedded jvm found on path: ")
                         + "jre"
                         + fileSeparator
                         + relativePath
                         + "!";

        String javaHome = String(getenv("JAVA_HOME"));

        if (javaHome.empty()) {
            ERR_PRINT(message + " And JAVA_HOME is not defined! Exiting...")
            exit(1);
        }

        String pathToLocallyInstalledJvmLib = javaHome + fileSeparator + relativePath;

        message += " Trying to use locally installed jdk at " + pathToLocallyInstalledJvmLib;
        WARN_PRINT(message.utf8().get_data())
        return pathToLocallyInstalledJvmLib.utf8().ptr();
    } else {
        return (embeddedJrePath + relativePath).utf8().ptr();
    }
}
