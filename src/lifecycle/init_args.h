#ifndef GODOT_LOADER_INIT_ARGS_H
#define GODOT_LOADER_INIT_ARGS_H

#include <core/string//ustring.h>
#include <core/templates/local_vector.h>
#include <jni.h>

class JvmLoader;

class InitArgs {
    friend class JvmLoader;
    LocalVector<String> options;

public:
    jint version {JNI_VERSION_1_8};

    InitArgs() = default;
    InitArgs(const InitArgs&) = default;

    void option(const char* option);
};

#endif// GODOT_LOADER_INIT_ARGS_H
