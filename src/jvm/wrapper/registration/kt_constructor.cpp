#include "kt_constructor.h"

#include "jvm/wrapper/memory/transfer_context.h"

KtConstructor::KtConstructor(jni::Env& p_env, jni::JObject p_wrapped) : JvmInstanceWrapper(p_env, p_wrapped) {}

KtObject* KtConstructor::create_instance(jni::Env& p_env, Object* p_owner) {
    uint64_t id = p_owner->get_instance_id();
    jvalue args[2] = {jni::to_jni_arg(p_owner), jni::to_jni_arg(id)};
    jni::JObject j_kt_object = wrapped.call_object_method(p_env, CONSTRUCT, args);
    return memnew(KtObject(p_env, j_kt_object, p_owner->is_ref_counted()));
}