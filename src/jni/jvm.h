#ifndef GODOT_LOADER_JVM_H
#define GODOT_LOADER_JVM_H
#include "env.h"
#include "init_args.h"
#include "jni.h"

namespace jni {
    typedef jint(JNICALL* CreateJavaVM)(JavaVM**, void**, void*);
    typedef jint(JNICALL* GetCreatedJavaVMs)(JavaVM**, jsize, jsize*);

#define LOCAL_FRAME(size) jni::LocalFrame frame = jni::LocalFrame(size)

    class Jvm {
    public:
        enum Type {
            NONE = 0,
            JVM = 1,
            GRAAL_NATIVE_IMAGE = 2,
            ART = 3,
        };

        Jvm(const Jvm&) = delete;
        void operator=(const Jvm&) = delete;

        static void init(const InitArgs& initArgs, Type type);
        static void destroy();

        static Env attach();
        static void detach();

        static Env current_env();

        static Type get_type();

        static bool is_initialized();

    private:
        Jvm() = default;
        static JavaVM* vm;
        static jint version;
        static Type vm_type;

        static JavaVM* create(const InitArgs& initArgs);
        static JavaVM* get_existing();
    };
}// namespace jni

VARIANT_ENUM_CAST(jni::Jvm::Type)

#endif// GODOT_LOADER_JVM_H
