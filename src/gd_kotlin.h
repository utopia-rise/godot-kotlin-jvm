#ifndef GODOT_JVM_GD_KOTLIN_H
#define GODOT_JVM_GD_KOTLIN_H

#include "jni/wrapper.h"
#include "jvm_wrapper/bootstrap.h"
#include "jvm_wrapper/memory/transfer_context.h"
#include "jvm_wrapper/registration/kt_class.h"
#include "lifecycle/jvm_loading_configuration.h"
#include "lifecycle/jvm_user_configuration.h"

#include <core/string/ustring.h>

#ifdef X11_ENABLED

static constexpr const char* RELATIVE_JVM_LIB_PATH {"lib/server/libjvm.so"};
static constexpr const char* BOOTSTRAP_FILE {"godot-bootstrap.jar"};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {"usercode.so"};

#elif MACOS_ENABLED

#include <TargetConditionals.h>

static constexpr const char* RELATIVE_JVM_LIB_PATH {"lib/server/libjvm.dylib"};
static constexpr const char* BOOTSTRAP_FILE {"godot-bootstrap.jar"};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {"usercode.dylib"};

#elif WINDOWS_ENABLED

static constexpr const char* RELATIVE_JVM_LIB_PATH {"bin/server/jvm.dll"};
static constexpr const char* BOOTSTRAP_FILE {"godot-bootstrap.jar"};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {"usercode.dll"};

#elif __ANDROID__

#include <platform/android/java_godot_wrapper.h>
#include <platform/android/os_android.h>

static constexpr const char* RELATIVE_JVM_LIB_PATH {"lib/server/libjvm.so"};
static constexpr const char* BOOTSTRAP_FILE {"godot-bootstrap-dex.jar"};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {"usercode.so"};

#elif IOS_ENABLED

static constexpr const char* RELATIVE_JVM_LIB_PATH {"lib/server/libjvm.so"};
static constexpr const char* BOOTSTRAP_FILE {""};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {"usercode.so"};

#endif

static constexpr const char* EMBEDDED_JRE_ARM_DIRECTORY {"jre-arm64/"};
static constexpr const char* EMBEDDED_JRE_AMD_DIRECTORY {"jre-amd64/"};

#ifdef __arm64__
static constexpr const char* EMBEDDED_JRE_DIRECTORY {EMBEDDED_JRE_ARM_DIRECTORY};
#else
static constexpr const char* EMBEDDED_JRE_DIRECTORY {EMBEDDED_JRE_AMD_DIRECTORY};
#endif

static constexpr const char* BUILD_DIRECTORY {"res://build/libs/"};
static constexpr const char* USER_DIRECTORY {"user://"};
static constexpr const char* RES_DIRECTORY {"res://"};


static constexpr const char* JVM_CONFIGURATION_PATH {"res://godot_kotlin_configuration.json"};

class GDKotlin {
    bool is_gc_started {false};

    JvmUserConfiguration user_configuration {};
    JvmLoadingConfiguration loading_configuration {};
    void* jvm_dynamic_library_handle {nullptr};

    Bootstrap* bootstrap {nullptr};

    void fetch_user_configuration();
    void fetch_loading_configuration();

#ifdef TOOLS_ENABLED
    static String get_path_to_environment_jvm();
#else
    static String copy_new_file_to_user_dir(const String& file_name);
#endif

    static String get_path_to_embedded_jvm();
    static String get_path_to_native_image();

    void load_dynamic_lib();
    void unload_dynamic_lib();

    ClassLoader* load_bootstrap() const;
    void initialize_core_library(ClassLoader* class_loader);


public:
    GDKotlin() = default;
    ~GDKotlin() = default;
    GDKotlin(const GDKotlin&) = delete;
    GDKotlin& operator=(const GDKotlin&) = delete;

    static GDKotlin& get_instance();

    const JvmUserConfiguration& get_configuration();

    void init();
    void finish();

    void register_classes(jni::Env& p_env, jni::JObjectArray p_classes);
};

#endif// GODOT_JVM_GD_KOTLIN_H
