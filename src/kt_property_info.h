#ifndef GODOT_JVM_KT_PROPERTY_INFO_H
#define GODOT_JVM_KT_PROPERTY_INFO_H


#include <core/string_name.h>
#include <core/object.h>
#include "jni/wrapper.h"
#include "java_instance_wrapper.h"

class KtPropertyInfo : public JavaInstanceWrapper {
private:
    Variant::Type type;
    String name;
    String class_name;
    PropertyHint propertyHint;
    String hint_string;
    //TODO property string and type

public:
    KtPropertyInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtPropertyInfo() = default;

    String getName() const;
    String getClassName() const;
    String getHintString() const;
};


#endif //GODOT_JVM_KT_PROPERTY_INFO_H
