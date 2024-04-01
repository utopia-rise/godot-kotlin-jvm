#include "kt_object.h"

KtObject::KtObject(jni::JObject p_wrapped, bool p_is_ref) : JvmInstanceWrapper(p_wrapped), is_ref(p_is_ref) {}

KtObject::~KtObject() {
    if (is_ref) { return; }
    jni::Env env {jni::Jvm::current_env()};
    CALL_JVM_METHOD(env, ON_DESTROY);
}