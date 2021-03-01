#ifndef GODOT_JVM_KT_CONSTRUCTOR_H
#define GODOT_JVM_KT_CONSTRUCTOR_H


#include "java_instance_wrapper.h"
#include "kt_object.h"

class KtConstructor : public JavaInstanceWrapper<KtConstructor> {
public:
    KtConstructor(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtConstructor() = default;
    KtObject *create_instance(const Variant **p_args, Object *p_owner);

private:
    int parameter_count;

DECLARE_JNI_METHODS(
        JNI_METHOD(GET_PARAMETER_COUNT, "getParameterCount", "()I")
        JNI_METHOD(CONSTRUCT, "construct", "(JJ)Lgodot/core/KtObject;")
)

};


#endif //GODOT_JVM_KT_CONSTRUCTOR_H
