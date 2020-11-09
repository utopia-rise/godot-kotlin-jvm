#ifndef GODOT_JVM_JAVA_METHOD_SIGNATURE_H
#define GODOT_JVM_JAVA_METHOD_SIGNATURE_H


#include "types.h"

namespace jni {
    struct JavaMethodSignature {
        const char* name;
        const char* signature;
        MethodId method_id;

        JavaMethodSignature() = delete;
        JavaMethodSignature(const char* p_name, const char* p_signature);
        ~JavaMethodSignature() = default;

        void init(Env& env, JClass cls);
    };
}


#endif //GODOT_JVM_JAVA_METHOD_SIGNATURE_H
