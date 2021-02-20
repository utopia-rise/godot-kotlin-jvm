#ifndef GODOT_JVM_KT_OBJECT_H
#define GODOT_JVM_KT_OBJECT_H

#include <core/string_name.h>
#include <core/variant.h>
#include <core/reference.h>
#include "jni/wrapper.h"
#include "java_instance_wrapper.h"

class KtObject : public JavaInstanceWrapper<KtObject> {
public:
    KtObject(jni::JObject p_wrapped, jni::JObject p_class_loader);
    ~KtObject();

    const jni::JObject& get_wrapped() const;

DECLARE_JNI_METHODS(
        JNI_METHOD(ON_DESTROY, "_onDestroy", "()V")
)
};

#endif //GODOT_JVM_KT_OBJECT_H
