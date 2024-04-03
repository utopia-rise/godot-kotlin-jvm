#include "kt_constructor.h"

#include "gd_kotlin.h"

KtConstructor::KtConstructor(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped),
  parameter_count(0) {
    jni::Env env {jni::Jvm::current_env()};
    parameter_count = static_cast<int>(wrapped.call_int_method(env, GET_PARAMETER_COUNT));
}

KtObject* KtConstructor::create_instance(const Variant** p_args, Object* p_owner) {
    jni::Env env {jni::Jvm::current_env()};
    TransferContext::get_instance().write_args(env, p_args, parameter_count);

    uint64_t id = p_owner->get_instance_id();
    jvalue args[2] = {jni::to_jni_arg(p_owner), jni::to_jni_arg(id)};
    jni::JObject j_kt_object = wrapped.call_object_method(env, CONSTRUCT, args);
    return memnew(KtObject(j_kt_object, p_owner->is_ref_counted()));
}