#include "java_method_signature.h"

jni::JavaMethodSignature::JavaMethodSignature(const char* p_name, const char* p_signature) :
        name(p_name), signature(p_signature), method_id(nullptr) {

}

void jni::JavaMethodSignature::init(Env& env, JClass cls) {
    method_id = cls.get_method_id(env, name, signature);
}