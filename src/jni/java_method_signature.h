#ifndef GODOT_JVM_JAVA_METHOD_SIGNATURE_H
#define GODOT_JVM_JAVA_METHOD_SIGNATURE_H

#include "types.h"

namespace jni {
    struct JavaMethodSignature {
        char* name = nullptr;
        char* signature = nullptr;
        MethodId method_id;

        JavaMethodSignature() = default;
        ~JavaMethodSignature() = default;

        void init(Env& env, JClass cls);
    };
}// namespace jni

#endif// GODOT_JVM_JAVA_METHOD_SIGNATURE_H
