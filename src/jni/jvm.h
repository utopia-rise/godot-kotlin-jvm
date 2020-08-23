#ifndef GODOT_LOADER_JVM_H
#define GODOT_LOADER_JVM_H
#include <jni.h>
#include "init_args.h"
#include "exceptions.h"
#include "env.h"

namespace jni {
    typedef jint(JNICALL *CreateJavaVM)(JavaVM **, void **, void *);
    typedef jint(JNICALL *GetCreatedJavaVMs)(JavaVM **, jsize, jsize *);

    class Jvm {
    public:
        Jvm(const Jvm&) = delete;
        void operator=(const Jvm&) = delete;

        static void init(const InitArgs&);
        static void destroy();

        static Env& attach();
        static void detach();

        static Env& currentEnv();

    private:
        Jvm() = default;
        static JavaVM* vm;
        static Env* env;
        static jint version;

        static JavaVM* create(const InitArgs&);
        static JavaVM* getExisting();
    };
}

#endif //GODOT_LOADER_JVM_H
