#include "kt_object.h"
#include "kt_class.h"
#include "gd_kotlin.h"

KtObject::KtObject(jni::JObject p_wrapped, jni::JObject p_class_loader, const StringName& p_ktClass)
        : JavaInstanceWrapper("godot.core.KtObject", p_wrapped, p_class_loader), kt_class_name(p_ktClass) {}

const jni::JObject &KtObject::get_wrapped() const {
    return wrapped;
}

Variant KtObject::call_method(const StringName& p_method, const Variant** p_args, Variant::CallError& r_error) const {
    jni::LocalFrame local_frame(100);

    KtFunction* function {GDKotlin::get_instance().find_class_by_name(kt_class_name)->get_method(p_method) };
    Variant ret_var;
    if (function) {
        ret_var = function->invoke(wrapped, p_args);
    } else {
        r_error.error = Variant::CallError::CALL_ERROR_INVALID_METHOD;
    }

    return ret_var;
}

const StringName& KtObject::get_class_name() const {
    return kt_class_name;
}
