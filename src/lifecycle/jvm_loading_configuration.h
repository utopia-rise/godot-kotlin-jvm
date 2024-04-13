#ifndef GODOT_LOADER_INIT_ARGS_H
#define GODOT_LOADER_INIT_ARGS_H

#include "jvm_user_configuration.h"

#include <core/string//ustring.h>
#include <core/templates/local_vector.h>
#include <jni.h>

class JvmManager;
class GDKotlin;

enum JvmLoadingType {
    NONE,
    STATIC,// For iOS but can also be used in the future if we want to expand the model to other OS.
    DYNAMIC,// For Hotspot or Graal Native Image on non-iOS systems.
    PROVIDED,// For ART, we don't have to load the JVM, it's already there.
};

class JvmLoadingConfiguration {
    friend class JvmManager;
    friend class GDKotlin;

#ifdef __ANDROID__
    int version {JNI_VERSION_1_6};
#else
    int version {JNI_VERSION_1_8};
#endif
    JvmLoadingType loading_type {NONE};
    bool code_included_in_vm {false};

    LocalVector<String> options;

    void add_jni_checks();
    void add_debug_options(uint16_t p_port, String& p_address, bool p_wait);
    void add_jmx_option(uint16_t p_port);
    void add_custom_options(const String& custom_options);

public:
    JvmLoadingConfiguration() = default;

    static void create(JvmUserConfiguration& user_configuration, JvmLoadingConfiguration& loading_configuration);
    static void add_options(JvmUserConfiguration& user_configuration, JvmLoadingConfiguration& loading_configuration);
};

#endif// GODOT_LOADER_INIT_ARGS_H
