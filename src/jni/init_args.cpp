#include "init_args.h"

namespace jni {
    void InitArgs::option(const char *option) {
        options.emplace_back(std::string(option));
    }

    void InitArgs::option(const std::string& option) {
        options.emplace_back(option);
    }
}
