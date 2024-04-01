#include "java_method_signature.h"

jni::JavaMethodSignature::JavaMethodSignature() :
  name(nullptr),
  signature(nullptr),
  method_id(nullptr) {}

void jni::JavaMethodSignature::init(Env& env, JClass cls) {
    method_id = cls.get_method_id(env, name, signature);
}