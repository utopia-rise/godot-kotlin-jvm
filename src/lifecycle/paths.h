#ifndef GODOT_JVM_PATHS_H
#define GODOT_JVM_PATHS_H

#ifdef X11_ENABLED

static constexpr const char* RELATIVE_JVM_LIB_PATH {"lib/server/libjvm.so"};
static constexpr const char* BOOTSTRAP_FILE {"godot-bootstrap.jar"};
static constexpr const char* USER_CODE_FILE {"main.jar"};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {"usercode.so"};

#elif MACOS_ENABLED

#include <TargetConditionals.h>

static constexpr const char* RELATIVE_JVM_LIB_PATH {"lib/server/libjvm.dylib"};
static constexpr const char* BOOTSTRAP_FILE {"godot-bootstrap.jar"};
static constexpr const char* USER_CODE_FILE {"main.jar"};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {"usercode.dylib"};

#elif WINDOWS_ENABLED

static constexpr const char* RELATIVE_JVM_LIB_PATH {"bin/server/jvm.dll"};
static constexpr const char* BOOTSTRAP_FILE {"godot-bootstrap.jar"};
static constexpr const char* USER_CODE_FILE {"main.jar"};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {"usercode.dll"};

#elif __ANDROID__

#include <platform/android/java_godot_wrapper.h>
#include <platform/android/os_android.h>

static constexpr const char* RELATIVE_JVM_LIB_PATH {""};
static constexpr const char* BOOTSTRAP_FILE {"godot-bootstrap-dex.jar"};
static constexpr const char* USER_CODE_FILE {"main-dex.jar"};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {""};

#elif IOS_ENABLED

static constexpr const char* RELATIVE_JVM_LIB_PATH {""};
static constexpr const char* BOOTSTRAP_FILE {""};
static constexpr const char* USER_CODE_FILE {""};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {"usercode.so"};

#endif

static constexpr const char* EMBEDDED_JRE_ARM_DIRECTORY {"jre-arm64"};
static constexpr const char* EMBEDDED_JRE_AMD_DIRECTORY {"jre-amd64"};

#ifdef __arm64__
static constexpr const char* EMBEDDED_JRE_DIRECTORY {EMBEDDED_JRE_ARM_DIRECTORY};
#else
static constexpr const char* EMBEDDED_JRE_DIRECTORY {EMBEDDED_JRE_AMD_DIRECTORY};
#endif

static constexpr const char* ENTRY_DIRECTORY {"res://build/generated/ksp"};
static constexpr const char* BUILD_DIRECTORY {"res://build/libs/"};
static constexpr const char* USER_DIRECTORY {"user://"};
static constexpr const char* RES_DIRECTORY {"res://"};

static constexpr const char* JVM_CONFIGURATION_PATH {"res://godot_kotlin_configuration.json"};

#endif// GODOT_JVM_PATHS_H
