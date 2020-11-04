#include "kt_object.h"
#include "kt_class.h"

KtObject::KtObject(jni::JObject p_wrapped, jni::JObject p_class_loader, const StringName& p_ktClass)
        : JavaInstanceWrapper("godot.core.KtObject", p_wrapped, p_class_loader), kt_class_name(p_ktClass) {
    jni::Env env { jni::Jvm::current_env() };
    p_wrapped.delete_local_ref(env);
}

KtObject::~KtObject() {
    jni::Env env { jni::Jvm::current_env() };
    jni::MethodId on_destroy_method = get_class(env).get_method_id(env, "_onDestroy", "()V");
    wrapped.call_void_method(env, on_destroy_method);
}

const jni::JObject &KtObject::get_wrapped() const {
    return wrapped;
}

const StringName& KtObject::get_class_name() const {
    return kt_class_name;
}