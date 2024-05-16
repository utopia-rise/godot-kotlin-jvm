#include "kt_object.h"

KtObject::KtObject(jni::Env& p_env, jni::JObject p_wrapped, bool p_is_ref) : JvmInstanceWrapper(p_env, p_wrapped), is_ref(p_is_ref) {}

KtObject::~KtObject() {
    if (is_ref) { return; }
    jni::Env env {jni::Jvm::current_env()};
    wrapped.call_void_method(env, ON_DESTROY);
}