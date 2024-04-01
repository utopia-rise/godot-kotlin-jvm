#include "kt_object.h"

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
  KtObject,
  INIT_JNI_METHOD(ON_DESTROY)
  )

// clang-format on

KtObject::KtObject(jni::JObject p_wrapped, bool p_is_ref) : JvmInstanceWrapper(p_wrapped), is_ref(p_is_ref) {}

KtObject::~KtObject() {
    if (is_ref) { return; }
    jni::Env env {jni::Jvm::current_env()};
    jni::MethodId on_destroy_method = jni_methods.ON_DESTROY.method_id;
    wrapped.call_void_method(env, on_destroy_method);
}

const jni::JObject& KtObject::get_wrapped() const {
    return wrapped;
}