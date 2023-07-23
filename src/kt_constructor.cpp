#include "kt_constructor.h"

#include "gd_kotlin.h"

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    KtConstructor,
    INIT_JNI_METHOD(GET_PARAMETER_COUNT)
    INIT_JNI_METHOD(CONSTRUCT)
)

// clang-format on

KtConstructor::KtConstructor(jni::JObject p_wrapped) :
  JavaInstanceWrapper(p_wrapped),
  parameter_count(0) {
    jni::Env env {jni::Jvm::current_env()};
    jni::MethodId get_parameter_count_method {jni_methods.GET_PARAMETER_COUNT.method_id};
    parameter_count = static_cast<int>(wrapped.call_int_method(env, get_parameter_count_method));
}

KtObject* KtConstructor::create_instance(const Variant** p_args, Object* p_owner) {
    jni::Env env {jni::Jvm::current_env()};
    GDKotlin::get_instance().transfer_context->write_args(env, p_args, parameter_count);

    uint64_t id = p_owner->get_instance_id();
    jvalue args[2] = {jni::to_jni_arg(p_owner), jni::to_jni_arg(id)};
    jni::MethodId constructor_method {jni_methods.CONSTRUCT.method_id};
    jni::JObject j_kt_object {wrapped.call_object_method(env, constructor_method, args)};
    return memnew(KtObject(j_kt_object, p_owner->is_ref_counted()));
}