#ifndef GODOT_LOADER_INIT_ARGS_H
#define GODOT_LOADER_INIT_ARGS_H
#include <jni.h>

#include <string>
#include <vector>

namespace jni {
    class InitArgs {
    public:
        jint version;

        InitArgs();
        InitArgs(const InitArgs&) = default;

        void option(const std::string& option);
        void option(const char* option);

    private:
        std::vector<std::string> options;
        friend class Jvm;
    };

}// namespace jni

#endif// GODOT_LOADER_INIT_ARGS_H
