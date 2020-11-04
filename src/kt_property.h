#ifndef GODOT_JVM_KT_PROPERTY_H
#define GODOT_JVM_KT_PROPERTY_H

#include <core/object.h>
#include "jni/wrapper.h"
#include "java_instance_wrapper.h"
#include "kt_object.h"

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
    Variant default_value;
    bool is_default_value_initialized;
    bool is_ref;

    void initialize_default_value();

public:
    KtProperty(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtProperty();

    StringName get_name() const;

    PropertyInfo get_member_info();

    void callGet(KtObject* instance, Variant& r_ret);
    void setCall(KtObject* instance, const Variant& p_value);

    void get_default_value(Variant& r_value);
};


#endif //GODOT_JVM_KT_PROPERTY_H
