#include "kt_class.h"

KtClass::KtClass(jni::JObject p_wrapped, jni::JObject& p_class_loader) : JavaInstanceWrapper("godot.core.KtClass", p_wrapped, p_class_loader) {
    auto env = jni::Jvm::current_env();
    name = get_name(env);
    super_class = get_super_class(env);
}

KtObject* KtClass::create_instance(jni::Env& env, const Variant** p_args, int p_arg_count, Object* p_owner) const {
    auto new_method = get_method_id(env, "new", "(J[Lgodot/core/KtVariant;)Lgodot/core/KtObject;");
    // TODO: send args
    auto j_kt_object = wrapped.call_object_method(env, new_method, {reinterpret_cast<long>(p_owner)});
    return new KtObject(j_kt_object, class_loader);
}

StringName KtClass::get_name(jni::Env& env) {
    auto getter =  get_method_id(env, "getName", "()Ljava/lang/String;");
    jni::JObject ret = wrapped.call_object_method(env, getter);
    return StringName(env.from_jstring(jni::JString((jstring) ret.obj)));
}

StringName KtClass::get_super_class(jni::Env& env) {
    auto getter =  get_method_id(env, "getSuperClass", "()Ljava/lang/String;");
    jni::JObject ret = wrapped.call_object_method(env, getter);
    return StringName(env.from_jstring(jni::JString((jstring) ret.obj)));
}
