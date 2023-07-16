#if defined WINDOWS_ENABLED || defined X11_ENABLED || defined MACOS_ENABLED || defined IOS_ENABLED

#include "../init_args.h"

namespace jni {
    void InitArgs::option(const char* option) {
        options.emplace_back(std::string(option));
    }

    void InitArgs::option(const std::string& option) {
        options.emplace_back(option);
    }

    InitArgs::InitArgs() : version(JNI_VERSION_1_8) {}
}// namespace jni

#endif