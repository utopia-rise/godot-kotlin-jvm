#ifndef GODOT_LOADER_JVM_H
#define GODOT_LOADER_JVM_H
#include "jni.h"
#include "init_args.h"
#include "env.h"

namespace jni {
    typedef jint(JNICALL *CreateJavaVM)(JavaVM **, void **, void *);
    typedef jint(JNICALL *GetCreatedJavaVMs)(JavaVM **, jsize, jsize *);

    class Jvm {
    public:
        enum Type {
#ifndef __ANDROID__
            HOTSPOT,
            GRAAL,
#endif
#ifdef __ANDROID__
            ART
#endif
        };
        Jvm(const Jvm&) = delete;
        void operator=(const Jvm&) = delete;

        static void init(const InitArgs& initArgs, Type type);
        static void destroy();

        static Env attach();
        static void detach();

        static Env current_env();

    private:
        Jvm() = default;
        static JavaVM* vm;
        static Env* env;
        static jint version;

        static JavaVM* create(const InitArgs&, Type type);
        static JavaVM* get_existing(Type vm_type);
    };
}

#endif //GODOT_LOADER_JVM_H
