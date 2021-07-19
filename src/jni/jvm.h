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
            HOTSPOT,
            GRAAL,
            ART
        };
        Jvm(const Jvm&) = delete;
        void operator=(const Jvm&) = delete;

        static void init(const InitArgs& initArgs, Type type);
        static void destroy();

        static Env attach();
        static void detach();

        static Env current_env();

        static Type get_type();

    private:
        Jvm() = default;
        static JavaVM* vm;
        static Env* env;
        static jint version;
        static Type vm_type;

        static JavaVM* create(const InitArgs& initArgs);
        static JavaVM* get_existing();
    };
}

#endif //GODOT_LOADER_JVM_H
