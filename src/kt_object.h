#ifndef GODOT_JVM_KT_OBJECT_H
#define GODOT_JVM_KT_OBJECT_H

#include "jni/wrapper.h"
#include "java_instance_wrapper.h"

class KtObject : public JavaInstanceWrapper {

private:
    const jni::JObject ktClass;
public:
    KtObject(jni::JObject p_wrapped, jni::JObject p_class_loader, jni::JObject p_ktClass);
    ~KtObject() = default;

    const jni::JObject &get_wrapped() const;
};

#endif //GODOT_JVM_KT_OBJECT_H
