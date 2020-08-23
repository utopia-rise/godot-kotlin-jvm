#include "jvm_loader.h"

#ifdef __linux__
#include <dlfcn.h>
#include <iostream>

#elif __APPLE__
#include "TargetConditionals.h"
    #ifdef TARGET_OS_MAC
        #include <dlfcn.h>
    #endif
#elif defined _WIN32 || defined _WIN64
#include <Windows.h>
#endif

void* jni::JvmLoader::jvmLib = nullptr;

void jni::JvmLoader::loadJvmLib() {
#ifdef __linux__
    const char *libPath = "jre/lib/server/libjvm.so";
    jvmLib = dlopen(libPath, RTLD_NOW);
    if (jvmLib == nullptr) {
        std::cout << "Failed to load libjvm.so!" << std::endl;
        exit(1);
    }
#elif TARGET_OS_MAC
    const char *libPath = "jre/lib/server/libjvm.dylib";
    jvmLib = dlopen(libPath, RTLD_NOW);
    if (jvmLib == nullptr) {
        std::cout << "Failed to load libjvm.so!" << std::endl;
        exit(1);
    }
#elif defined _WIN32 || defined _WIN64
    const char *libPath = "jre\\bin\\server\\jvm.dll";
    jvmLib = LoadLibrary(libPath);
    DWORD lastErrorCode = GetLastError();
    if (lastErrorCode == 126) {
        // "The specified module could not be found."
        // load vcruntime140.dll from the bundled JRE, then try again
        std::cout << "Failed to load jvm.dll. Trying to load vcruntime140.dll first ..." << std::endl;

        HINSTANCE hinstVCR = LoadLibrary("jre\\bin\\vcruntime140.dll");
        if (hinstVCR != nullptr) {
            jvmLib = LoadLibrary(jvmDLLPath);
            if (jvmLib == nullptr) {
                std::cout << "Failed to load jvm.dll." << std::endl;
                exit(1);
            }
        } else {
            std::cout << "Failed to load vcruntime140.dll." << std::endl;
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
