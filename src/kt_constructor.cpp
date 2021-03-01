#include "kt_constructor.h"
#include "gd_kotlin.h"

JNI_INIT_STATICS_FOR_CLASS(KtConstructor)

KtConstructor::KtConstructor(jni::JObject p_wrapped, jni::JObject &p_class_loader) :
        JavaInstanceWrapper<KtConstructor>("godot.core.KtConstructor", p_wrapped, p_class_loader),
                parameter_count(0) {
    jni::Env env{jni::Jvm::current_env()};
    jni::MethodId get_parameter_count_method{get_method_id(env, jni_methods.GET_PARAMETER_COUNT)};
    parameter_count = static_cast<int>(wrapped.call_int_method(env, get_parameter_count_method));
}

KtObject* KtConstructor::create_instance(const Variant **p_args, Object *p_owner) {
    jni::Env env{jni::Jvm::current_env()};
    GDKotlin::get_instance().transfer_context->write_args(env, p_args, parameter_count);
    jvalue args[2] = {
            jni::to_jni_arg(p_owner),
            jni::to_jni_arg(p_owner->get_instance_id())
    };
    jni::MethodId constructor_method{get_method_id(env, jni_methods.CONSTRUCT)};
    jni::JObject j_kt_object{wrapped.call_object_method(env, constructor_method, args)};
    return new KtObject(j_kt_object, class_loader);
}
