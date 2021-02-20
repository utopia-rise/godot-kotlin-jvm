#include "kt_object.h"


JNI_INIT_STATICS_FOR_CLASS(KtObject)

KtObject::KtObject(jni::JObject p_wrapped, jni::JObject p_class_loader)
        : JavaInstanceWrapper("godot.core.KtObject", p_wrapped, p_class_loader) {
    jni::Env env { jni::Jvm::current_env() };
    p_wrapped.delete_local_ref(env);
}

KtObject::~KtObject() {
    jni::Env env { jni::Jvm::current_env() };
    jni::MethodId on_destroy_method = get_method_id(env, jni_methods.ON_DESTROY);
    wrapped.call_void_method(env, on_destroy_method);
}

const jni::JObject &KtObject::get_wrapped() const {
    return wrapped;
}