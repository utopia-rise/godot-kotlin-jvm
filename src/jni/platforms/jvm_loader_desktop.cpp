#if defined WINDOWS_ENABLED || defined X11_ENABLED || defined MACOS_ENABLED

#include "modules/kotlin_jvm/src/jni/jvm_loader.h"

#include <jni/jni_constants.h>

#include <core/config/project_settings.h>
#include <core/os/os.h>

void* jni::JvmLoader::jvmLib {nullptr};

void jni::JvmLoader::load_jvm_lib() {
    String libPath {get_jvm_lib_path()};

    if (OS::get_singleton()->open_dynamic_library(libPath, jvmLib) != OK) {
        LOG_ERROR(String("Failed to load the jvm dynamic library from path ") + libPath + "!");
        exit(1);
    }
}

void jni::JvmLoader::close_jvm_lib() {
    if (OS::get_singleton()->close_dynamic_library(jvmLib) != OK) {
        LOG_ERROR("Failed to close the jvm dynamic library!");
    }
}

jni::CreateJavaVM jni::JvmLoader::get_create_jvm_function() {
    if (jvmLib == nullptr) { load_jvm_lib(); }
    void* createJavaVMSymbolHandle;
    if (OS::get_singleton()->get_dynamic_library_symbol_handle(jvmLib, "JNI_CreateJavaVM", createJavaVMSymbolHandle) != OK) {
        LOG_ERROR("Failed to get JNI_CreateJavaVM symbol handle");
        exit(1);
    }
    return reinterpret_cast<CreateJavaVM>(createJavaVMSymbolHandle);
}

jni::GetCreatedJavaVMs jni::JvmLoader::get_get_created_java_vm_function() {
    if (jvmLib == nullptr) { load_jvm_lib(); }
    void* getCreatedJavaVMsSymbolHandle;
    if (OS::get_singleton()->get_dynamic_library_symbol_handle(jvmLib, "JNI_GetCreatedJavaVMs", getCreatedJavaVMsSymbolHandle) != OK) {
        LOG_ERROR("Failed to get JNI_GetCreatedJavaVMs symbol handle");
        exit(1);
    }
    return reinterpret_cast<GetCreatedJavaVMs>(getCreatedJavaVMsSymbolHandle);
}

String jni::JvmLoader::get_jvm_lib_path() {
    String embeddedJrePath {get_embedded_jre_path()};
    if (!FileAccess::exists(embeddedJrePath)) {
        // Cannot find graal usercode, so no JVM can be found, make crash.
        if (Jvm::get_type() == Jvm::GRAAL_NATIVE_IMAGE) {
            JVM_CRASH_NOW_MSG("Cannot find Graal VM user code native image");
        }

#if !defined(TOOLS_ENABLED)
        // Cannot find JVM (here hotspot) while not in TOOL mode, make crash.
        JVM_CRASH_NOW_MSG(vformat("Cannot find embedded JVM on path: %s", embeddedJrePath));
#endif
        LOG_WARNING(vformat("Godot-JVM: No embedded jvm found on path: %s!", embeddedJrePath));
#ifdef DEBUG_ENABLED
        LOG_WARNING(vformat("Godot-JVM: You really should embedd a jre in your game with jlink! See the documentation "
                            "if you don't know how to do that"));
#endif

        // Can only happen in TOOL mode, with hotspot.
        return get_path_to_locally_installed_jvm();
    }
    return embeddedJrePath;
}

String jni::JvmLoader::get_path_to_locally_installed_jvm() {
    String javaHome {OS::get_singleton()->get_environment("JAVA_HOME")};

    if (javaHome.is_empty()) {
        LOG_ERROR("JAVA_HOME is not defined! Exiting...");
        exit(1);
    }

    String pathToLocallyInstalledJvmLib {javaHome + FILE_SEPARATOR + LIB_JVM_RELATIVE_PATH};

#ifdef DEBUG_ENABLED
    LOG_VERBOSE(vformat("Trying to use locally installed jdk at %s", pathToLocallyInstalledJvmLib));
#endif

    if (!FileAccess::exists(pathToLocallyInstalledJvmLib)) {
        LOG_ERROR(vformat("No jvm found at %s! Exiting...", pathToLocallyInstalledJvmLib));
        exit(1);
    }
    return pathToLocallyInstalledJvmLib;
}

String jni::JvmLoader::get_embedded_jre_path() {
    String jre_path;
    if (Jvm::get_type() == Jvm::GRAAL_NATIVE_IMAGE) {
        String user_code_dir {
#ifdef TOOLS_ENABLED
          "res://build/libs/"
#else
          "user://"
#endif
        };
        jre_path = vformat("%s%s", user_code_dir, LIB_GRAAL_VM_RELATIVE_PATH);
    } else {
        String jre_folder {vformat(
          "%s%s",
#ifdef TOOLS_ENABLED
          "res://"
#elif defined(MACOS_ENABLED)
          "../PlugIns/"
#else
          ""
#endif
          ,
          jni::JniConstants::CURRENT_RUNTIME_JRE
        )};
        String jre_location {
#ifdef TOOLS_ENABLED
          ""
#else
          OS::get_singleton()->get_executable_path().get_base_dir()
#endif
        };
        jre_path = jre_location.path_join(jre_folder).path_join(LIB_JVM_RELATIVE_PATH);
    }
    return ProjectSettings::get_singleton()->globalize_path(jre_path);
}

#endif
