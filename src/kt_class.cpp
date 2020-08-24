#include "kt_class.h"

KtClass::KtClass(jni::JObject p_wrapped, jni::JObject& p_class_loader) : JavaInstanceWrapper("godot.core.KtClass", p_wrapped, p_class_loader) {}

KtObject* KtClass::create_instance(jni::Env& env, const Variant** p_args, int p_arg_count, Object* p_owner) {
    auto new_method = get_method_id(env, "new", "(J[Lgodot/core/KtVariant;)Lgodot/core/KtObject;");
    // TODO: send args
    auto j_kt_object = get_class(env).callObjectMethod(env, new_method, {reinterpret_cast<long>(p_owner)});
    return new KtObject(j_kt_object, class_loader);;
}
