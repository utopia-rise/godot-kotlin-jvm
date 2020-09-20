#ifndef GODOT_JVM_KT_OBJECT_H
#define GODOT_JVM_KT_OBJECT_H

#include <core/string_name.h>
#include <core/variant.h>
#include "jni/wrapper.h"
#include "java_instance_wrapper.h"

class KtObject : public JavaInstanceWrapper {

private:
    StringName kt_class_name;
public:
    KtObject(jni::JObject p_wrapped, jni::JObject p_class_loader, const StringName& p_ktClass);
    ~KtObject();

    const jni::JObject& get_wrapped() const;

    const StringName& get_class_name() const;
};

#endif //GODOT_JVM_KT_OBJECT_H
