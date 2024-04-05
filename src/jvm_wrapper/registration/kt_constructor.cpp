#include "kt_constructor.h"

#include "gd_kotlin.h"

KtConstructor::KtConstructor(jni::Env& p_env, jni::JObject p_wrapped) : JvmInstanceWrapper(p_env, p_wrapped),
  parameter_count(0) {
    parameter_count = static_cast<int>(wrapped.call_int_method(p_env, GET_PARAMETER_COUNT));
}

KtObject* KtConstructor::create_instance(jni::Env& p_env, const Variant** p_args, Object* p_owner) {
    TransferContext::get_instance().write_args(p_env, p_args, parameter_count);

    uint64_t id = p_owner->get_instance_id();
    jvalue args[2] = {jni::to_jni_arg(p_owner), jni::to_jni_arg(id)};
    jni::JObject j_kt_object = wrapped.call_object_method(p_env, CONSTRUCT, args);
    return memnew(KtObject(p_env, j_kt_object, p_owner->is_ref_counted()));
}