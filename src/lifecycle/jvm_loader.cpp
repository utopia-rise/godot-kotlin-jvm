#if defined WINDOWS_ENABLED || defined X11_ENABLED || defined MACOS_ENABLED

#include "core/config/project_settings.h"
#include "core/os/os.h"
#include "lifecycle/jni_constants.h"
#include "lifecycle/jvm_loader.h"

#include <cassert>

#ifndef NO_USE_STDLIB
#include <locale>
#endif

void* JvmLoader::jvmLib {nullptr};

void JvmLoader::load_jvm_lib() {
    String libPath {get_jvm_lib_path()};

    if (OS::get_singleton()->open_dynamic_library(libPath, jvmLib) != OK) {
        LOG_ERROR(String("Failed to load the jvm dynamic library from path ") + libPath + "!");
#ifdef DEBUG_ENABLED
        OS::get_singleton()->alert(
          String("Failed to load the jvm dynamic library from path ") + libPath + "!",
          "Failure while creating jvm"
        );
#endif
        exit(1);
    }
}

void JvmLoader::close_jvm() {
    jni::Jvm::destroy();
    if (OS::get_singleton()->close_dynamic_library(jvmLib) != OK) {
        LOG_ERROR("Failed to close the jvm dynamic library!");
    }
}

jni::CreateJavaVM JvmLoader::get_create_jvm_function() {
#ifdef IOS_ENABLED
    return &JNI_CreateJavaVM;
#else
    if (jvmLib == nullptr) { load_jvm_lib(); }
    void* createJavaVMSymbolHandle;
    if (OS::get_singleton()->get_dynamic_library_symbol_handle(jvmLib, "JNI_CreateJavaVM", createJavaVMSymbolHandle) != OK) {
        LOG_ERROR("Failed to get JNI_CreateJavaVM symbol handle");
#ifdef DEBUG_ENABLED
        OS::get_singleton()->alert(
          "Failed to get JNI_CreateJavaVM symbol handle",
          "Failure while creating jvm"
        );
#endif
        exit(1);
    }
    return reinterpret_cast<jni::CreateJavaVM>(createJavaVMSymbolHandle);
#endif
}


String JvmLoader::get_jvm_lib_path() {
    String embeddedJrePath {get_embedded_jre_path()};
    if (!FileAccess::exists(embeddedJrePath)) {
        // Cannot find graal usercode, so no JVM can be found, make crash.
        if (jni::Jvm::get_type() == jni::JvmType::GRAAL_NATIVE_IMAGE) {
#ifdef DEBUG_ENABLED
            OS::get_singleton()->alert(
              "This usually happens when you define that your project should be executed using graalvm but did not successfully compile your project and thus usercode.(sh, dll, dylib) cannot be found.",
              "Cannot find Graal VM user code native image"
              );
#endif
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

String JvmLoader::get_path_to_locally_installed_jvm() {
    String javaHome {OS::get_singleton()->get_environment("JAVA_HOME")};

    if (javaHome.is_empty()) {
        LOG_ERROR("JAVA_HOME is not defined! Exiting...");
#ifdef DEBUG_ENABLED
#ifdef MACOS_ENABLED
        OS::get_singleton()->alert(
          "The environment variable JAVA_HOME is not found and there is no embedded jvm. If you launched the editor ",
          "through a double click on Godot.app, also make sure that JAVA_HOME is set through launchctl: `launchctl setenv JAVA_HOME </path/to/jdk>`"
        );
#else
        OS::get_singleton()->alert(
          "The environment variable JAVA_HOME is not found and there is no embedded jvm.",
          "JAVA_HOME is not defined"
        );
#endif
#endif
        exit(1);
    }

    String pathToLocallyInstalledJvmLib {javaHome + FILE_SEPARATOR + LIB_JVM_RELATIVE_PATH};

#ifdef DEBUG_ENABLED
    LOG_VERBOSE(vformat("Trying to use locally installed jdk at %s", pathToLocallyInstalledJvmLib));
#endif

    if (!FileAccess::exists(pathToLocallyInstalledJvmLib)) {
        LOG_ERROR(vformat("No jvm found at %s! Exiting...", pathToLocallyInstalledJvmLib));
#ifdef DEBUG_ENABLED
        OS::get_singleton()->alert(
          vformat("No jvm found at %s! Make sure JAVA_HOME points to the correct directory", pathToLocallyInstalledJvmLib),
          "Failure while creating jvm"
        );
#endif
        exit(1);
    }
    return pathToLocallyInstalledJvmLib;
}

String JvmLoader::get_embedded_jre_path() {
    String jre_path;
    if (jni::Jvm::get_type() == jni::JvmType::GRAAL_NATIVE_IMAGE) {
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

JavaVM* JvmLoader::create_jvm(const InitArgs& initArgs, jni::JvmType type) {
    size_t nOptions {initArgs.options.size()};
    auto* options = new JavaVMOption[nOptions];
    JavaVMInitArgs args;
    args.version = initArgs.version;
    args.nOptions = nOptions;
    args.options = options;

    for (auto i = 0; i < nOptions; i++) {
        args.options[i].optionString = (char*) initArgs.options[i].ptr();
    }

    JavaVM* java_vm {nullptr};
    JNIEnv* jni_env {nullptr};

#ifndef NO_USE_STDLIB
    std::locale global;
#endif

    jint result {JvmLoader::get_create_jvm_function()(&java_vm, reinterpret_cast<void**>(&jni_env), &args)};

    // Set std::local::global to value it was before creating JVM.
    // See https://github.com/utopia-rise/godot-kotlin-jvm/issues/166
    // and https://github.com/utopia-rise/godot-kotlin-jvm/issues/170
#ifndef NO_USE_STDLIB
    std::locale::global(global);
#endif

    delete[] options;
    JVM_CRASH_COND_MSG(result != JNI_OK, "Failed to create a new vm!");
    jni::Jvm::initialize(java_vm, type, initArgs.version);
    return java_vm;
}
