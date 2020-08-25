#include "jvm_loader.h"

#include <core/engine.h>
#include <core/os/os.h>

void *jni::JvmLoader::jvmLib = nullptr;

void jni::JvmLoader::loadJvmLib() {
    const char *libPath = getJvmLibPath();

    if (OS::get_singleton()->open_dynamic_library(libPath, jvmLib) != OK) {
        ERR_PRINT(String("Failed to load the jvm dynamic library from path ") + libPath + "!")
        exit(1);
    }
}

void jni::JvmLoader::closeJvmLib() {
    if (OS::get_singleton()->close_dynamic_library(jvmLib) != OK) {
        ERR_PRINT("Failed to close the jvm dynamic library!")
    }
}

jni::CreateJavaVM jni::JvmLoader::getCreateJvmFunction() {
    if (jvmLib == nullptr) {
        loadJvmLib();
    }
    void *createJavaVMSymbolHandle;
    if (OS::get_singleton()->get_dynamic_library_symbol_handle(jvmLib, "JNI_CreateJavaVM", createJavaVMSymbolHandle) != OK) {
        ERR_PRINT("Failed to get JNI_CreateJavaVM symbol handle")
        exit(1);
    }
    return reinterpret_cast<CreateJavaVM>(createJavaVMSymbolHandle);
}

jni::GetCreatedJavaVMs jni::JvmLoader::getGetCreatedJavaVMsFunction() {
    if (jvmLib == nullptr) {
        loadJvmLib();
    }
    void *getCreatedJavaVMsSymbolHandle;
    if (OS::get_singleton()->get_dynamic_library_symbol_handle(jvmLib, "JNI_GetCreatedJavaVMs", getCreatedJavaVMsSymbolHandle) != OK) {
        ERR_PRINT("Failed to get JNI_GetCreatedJavaVMs symbol handle")
        exit(1);
    }
    return reinterpret_cast<GetCreatedJavaVMs>(getCreatedJavaVMsSymbolHandle);
}

const char *jni::JvmLoader::getJvmLibPath() {
#ifdef __linux__
    String relativePath{"lib/server/libjvm.so"};
    String fileSeparator{"/"};
#elif TARGET_OS_MAC
    String relativePath {"lib/server/libjvm.dylib"};
    String fileSeparator {"/"};
#elif defined _WIN32 || defined _WIN64
    String relativePath {"bin\\server\\jvm.dll"};
    String fileSeparator {"\\"};
#endif

    String embeddedJrePath{"jre/"};

    if (Engine::get_singleton()->is_editor_hint()) {

        String message = "No embedded jvm found on path: jre" + fileSeparator + relativePath + "!";
        String javaHome = getenv("JAVA_HOME");

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
