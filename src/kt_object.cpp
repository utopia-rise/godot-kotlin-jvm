#include "kt_object.h"
#include "kt_class.h"

KtObject::KtObject(jni::JObject p_wrapped, jni::JObject p_class_loader, const StringName& p_ktClass)
        : JavaInstanceWrapper("godot.core.KtObject", p_wrapped, p_class_loader), kt_class_name(p_ktClass) {}

const jni::JObject &KtObject::get_wrapped() const {
    return wrapped;
}

const StringName& KtObject::get_class_name() const {
    return kt_class_name;
}
