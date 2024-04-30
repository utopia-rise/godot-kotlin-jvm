#ifndef GODOT_JVM_PATHS_H
#define GODOT_JVM_PATHS_H

static constexpr const char* DESKTOP_BOOTSTRAP_FILE {"godot-bootstrap.jar"};
static constexpr const char* DESKTOP_USER_CODE_FILE {"main.jar"};

static constexpr const char* LINUX_RELATIVE_JVM_LIB_PATH {"lib/server/libjvm.so"};
static constexpr const char* LINUX_GRAAL_NATIVE_IMAGE_FILE {"usercode.so"};

static constexpr const char* MACOS_RELATIVE_JVM_LIB_PATH {"lib/server/libjvm.dylib"};
static constexpr const char* MACOS_GRAAL_NATIVE_IMAGE_FILE {"usercode.dylib"};

static constexpr const char* WINDOWS_RELATIVE_JVM_LIB_PATH {"bin/server/jvm.dll"};
static constexpr const char* WINDOWS_GRAAL_NATIVE_IMAGE_FILE {"usercode.dll"};

static constexpr const char* ANDROID_RELATIVE_JVM_LIB_PATH {""};
static constexpr const char* ANDROID_BOOTSTRAP_FILE {"godot-bootstrap-dex.jar"};
static constexpr const char* ANDROID_USER_CODE_FILE {"main-dex.jar"};
static constexpr const char* ANDROID_GRAAL_NATIVE_IMAGE_FILE {""};

static constexpr const char* IOS_RELATIVE_JVM_LIB_PATH {""};
static constexpr const char* IOS_BOOTSTRAP_FILE {""};
static constexpr const char* IOS_USER_CODE_FILE {""};
static constexpr const char* IOS_GRAAL_NATIVE_IMAGE_FILE {"usercode.a"};

static constexpr const char* LINUX_EMBEDDED_JRE_ARM_DIRECTORY {"jre-arm64-linux"};
static constexpr const char* LINUX_EMBEDDED_JRE_AMD_DIRECTORY {"jre-amd64-linux"};

static constexpr const char* WINDOWS_EMBEDDED_JRE_ARM_DIRECTORY {"jre-arm64-windows"};
static constexpr const char* WINDOWS_EMBEDDED_JRE_AMD_DIRECTORY {"jre-amd64-windows"};

static constexpr const char* MACOS_EMBEDDED_JRE_ARM_DIRECTORY {"jre-arm64-macos"};
static constexpr const char* MACOS_EMBEDDED_JRE_AMD_DIRECTORY {"jre-amd64-macos"};

#ifdef X11_ENABLED
#ifdef __arm64__
static constexpr const char* HOST_EMBEDDED_JRE_DIRECTORY {LINUX_EMBEDDED_JRE_ARM_DIRECTORY};
#else
static constexpr const char* HOST_EMBEDDED_JRE_DIRECTORY {LINUX_EMBEDDED_JRE_AMD_DIRECTORY};
#endif

#elif WINDOWS_ENABLED
#ifdef __arm64__
static constexpr const char* HOST_EMBEDDED_JRE_DIRECTORY {WINDOWS_EMBEDDED_JRE_ARM_DIRECTORY};
#else
static constexpr const char* HOST_EMBEDDED_JRE_DIRECTORY {WINDOWS_EMBEDDED_JRE_AMD_DIRECTORY};
#endif

#elif MACOS_ENABLED
#ifdef __arm64__
static constexpr const char* HOST_EMBEDDED_JRE_DIRECTORY {MACOS_EMBEDDED_JRE_ARM_DIRECTORY};
#else
static constexpr const char* HOST_EMBEDDED_JRE_DIRECTORY {MACOS_EMBEDDED_JRE_AMD_DIRECTORY};
#endif
#endif

#ifdef X11_ENABLED

static constexpr const char* RELATIVE_JVM_LIB_PATH {LINUX_RELATIVE_JVM_LIB_PATH};
static constexpr const char* BOOTSTRAP_FILE {DESKTOP_BOOTSTRAP_FILE};
static constexpr const char* USER_CODE_FILE {DESKTOP_USER_CODE_FILE};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {LINUX_GRAAL_NATIVE_IMAGE_FILE};

#elif MACOS_ENABLED

#include <TargetConditionals.h>

static constexpr const char* RELATIVE_JVM_LIB_PATH {MACOS_RELATIVE_JVM_LIB_PATH};
static constexpr const char* BOOTSTRAP_FILE {DESKTOP_BOOTSTRAP_FILE};
static constexpr const char* USER_CODE_FILE {DESKTOP_USER_CODE_FILE};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {MACOS_GRAAL_NATIVE_IMAGE_FILE};

#elif WINDOWS_ENABLED

static constexpr const char* RELATIVE_JVM_LIB_PATH {WINDOWS_RELATIVE_JVM_LIB_PATH};
static constexpr const char* BOOTSTRAP_FILE {DESKTOP_BOOTSTRAP_FILE};
static constexpr const char* USER_CODE_FILE {DESKTOP_USER_CODE_FILE};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {WINDOWS_GRAAL_NATIVE_IMAGE_FILE};

#elif __ANDROID__

#include <platform/android/java_godot_wrapper.h>
#include <platform/android/os_android.h>

static constexpr const char* RELATIVE_JVM_LIB_PATH {ANDROID_RELATIVE_JVM_LIB_PATH};
static constexpr const char* BOOTSTRAP_FILE {ANDROID_BOOTSTRAP_FILE};
static constexpr const char* USER_CODE_FILE {ANDROID_USER_CODE_FILE};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {ANDROID_GRAAL_NATIVE_IMAGE_FILE};

#elif IOS_ENABLED

static constexpr const char* RELATIVE_JVM_LIB_PATH {IOS_RELATIVE_JVM_LIB_PATH};
static constexpr const char* BOOTSTRAP_FILE {IOS_BOOTSTRAP_FILE};
static constexpr const char* USER_CODE_FILE {IOS_USER_CODE_FILE};
static constexpr const char* GRAAL_NATIVE_IMAGE_FILE {IOS_GRAAL_NATIVE_IMAGE_FILE};

#endif

static constexpr const char* ENTRY_DIRECTORY {"res://build/generated/ksp"};
static constexpr const char* BUILD_DIRECTORY {"res://build/libs/"};
static constexpr const char* USER_DIRECTORY {"user://"};
static constexpr const char* RES_DIRECTORY {"res://"};
static constexpr const char* JVM_DIRECTORY {"jvm"};

static constexpr const char* JVM_CONFIGURATION_PATH {"res://godot_kotlin_configuration.json"};

#endif// GODOT_JVM_PATHS_H
