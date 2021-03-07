#if defined _WIN32 || defined _WIN64 || defined __linux__ || defined __APPLE__

#include "../init_args.h"

namespace jni {
    void InitArgs::option(const char *option) {
        options.emplace_back(std::string(option));
    }

    void InitArgs::option(const std::string& option) {
        options.emplace_back(option);
    }

    InitArgs::InitArgs() : version(JNI_VERSION_1_8) {

    }
}

#endif