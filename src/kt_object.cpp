#include "kt_object.h"

KtObject::KtObject(const jni::JObject &p_wrapped, const jni::JObject &p_class_loader, jni::JObject *p_ktClass)
        : JavaInstanceWrapper("godot.core.KtObject", p_wrapped, p_class_loader), ktClass(p_ktClass) {}

const jni::JObject &KtObject::get_wrapped() const {
    return wrapped;
}
