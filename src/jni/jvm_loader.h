//
// Created by cedric on 19.08.20.
//

#ifndef GODOT_LOADER_JVM_LOADER_H
#define GODOT_LOADER_JVM_LOADER_H

#include "jvm.h"

namespace jni {
    class JvmLoader {
    public:
        static CreateJavaVM getCreateJvmFunction();
        static GetCreatedJavaVMs getGetCreatedJavaVMsFunction();

    private:
        static void *jvmLib;
        static void loadJvmLib();
    };
}


#endif //GODOT_LOADER_JVM_LOADER_H
