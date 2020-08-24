#ifndef GODOT_JVM_KT_OBJECT_H
#define GODOT_JVM_KT_OBJECT_H
#include "jni/jvm.h"
#include "java_instance_wrapper.h"

class KtObject : public JavaInstanceWrapper {
public:
    KtObject(jni::JObject p_wrapped, jni::JObject p_class_loader);
    ~KtObject() = default;
};

#endif //GODOT_JVM_KT_OBJECT_H
