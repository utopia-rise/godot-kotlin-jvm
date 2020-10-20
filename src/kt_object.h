#ifndef GODOT_JVM_KT_OBJECT_H
#define GODOT_JVM_KT_OBJECT_H

#include <core/string_name.h>
#include <core/variant.h>
#include <core/reference.h>
#include "jni/wrapper.h"
#include "java_instance_wrapper.h"

class KtObject : public JavaInstanceWrapper {

private:
    StringName kt_class_name;
    HashMap<StringName, REF> refs;
public:
    KtObject(jni::JObject p_wrapped, jni::JObject p_class_loader, const StringName& p_ktClass);
    ~KtObject();

    const jni::JObject& get_wrapped() const;

    const StringName& get_class_name() const;

    void append_or_update_ref(const StringName& field, const REF& ref);
    REF* get_ref_for_field(const StringName& field);
};

#endif //GODOT_JVM_KT_OBJECT_H
