#ifndef GODOT_JVM_KT_OBJECT_H
#define GODOT_JVM_KT_OBJECT_H

#include <core/string_name.h>
#include "jni/wrapper.h"
#include "java_instance_wrapper.h"

class KtObject : public JavaInstanceWrapper {

private:
    const StringName& kt_class_name;
public:
    KtObject(jni::JObject p_wrapped, jni::JObject p_class_loader, const StringName& p_ktClass);
    ~KtObject() = default;

    const jni::JObject &get_wrapped() const;
    Variant call_method(const StringName& p_method, const Variant** p_args) const;

    const StringName& get_class_name() const;
};

#endif //GODOT_JVM_KT_OBJECT_H
