//For android InitArgs implem is dummy. All is initialized by engine platform support.

#ifdef __ANDROID__

#include "../init_args.h"

namespace jni {
    void InitArgs::option(const char *option) {

    }

    void InitArgs::option(const std::string& option) {

    }

    InitArgs::InitArgs() : version() {

    }
}

#endif
