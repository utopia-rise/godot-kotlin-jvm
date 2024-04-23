#ifndef GODOT_LOADER_INIT_ARGS_H
#define GODOT_LOADER_INIT_ARGS_H

#include "jvm_user_configuration.h"

#include <core/string//ustring.h>
#include <core/templates/local_vector.h>
#include <jni.h>

class JvmManager;
class GDKotlin;


class JvmOptions {
    friend class JvmManager;
    friend class GDKotlin;

#ifdef __ANDROID__
    int version {JNI_VERSION_1_6};
#else
    int version {JNI_VERSION_1_8};
#endif

    LocalVector<CharString> options;

    void add_jni_checks();
    void add_debug_options(uint16_t p_port, String& p_address, bool p_wait);
    void add_jmx_option(uint16_t p_port);
    void add_custom_options(const String& custom_options);

public:
    JvmOptions() = default;
};

#endif// GODOT_LOADER_INIT_ARGS_H
