#ifndef GODOT_JVM_KT_PROPERTY_H
#define GODOT_JVM_KT_PROPERTY_H

#include <core/object.h>
#include "jni/wrapper.h"
#include "java_instance_wrapper.h"

struct KtPropertyInfo : public JavaInstanceWrapper {
    KtPropertyInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtPropertyInfo() = default;

    Variant::Type type;
    String name;
    StringName class_name;
    PropertyHint hint;
    String hint_string;

    PropertyInfo toPropertyInfo();
};

class KtProperty : JavaInstanceWrapper {

private:
    KtPropertyInfo* propertyInfo;

public:
    KtProperty(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtProperty();

    StringName get_name() const;

    PropertyInfo get_member_info();
};


#endif //GODOT_JVM_KT_PROPERTY_H
