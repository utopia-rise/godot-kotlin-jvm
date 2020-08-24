#include "kt_object.h"

KtObject::KtObject(jni::JObject p_wrapped, jni::JObject p_class_loader) : JavaInstanceWrapper("godot.core.KtObject", p_wrapped, p_class_loader) {}
