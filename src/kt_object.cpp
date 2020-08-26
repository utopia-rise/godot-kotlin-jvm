#include "kt_object.h"

KtObject::KtObject(jni::JObject p_wrapped, jni::JObject p_class_loader, jni::JObject p_ktClass)
        : JavaInstanceWrapper("godot.core.KtObject", p_wrapped, p_class_loader), ktClass(p_ktClass) {}

const jni::JObject &KtObject::get_wrapped() const {
    return wrapped;
}
