#include "kt_object.h"
#include "kt_class.h"

KtObject::KtObject(jni::JObject p_wrapped, jni::JObject p_class_loader, const StringName& p_ktClass)
        : JavaInstanceWrapper("godot.core.KtObject", p_wrapped, p_class_loader), kt_class_name(p_ktClass) {}

KtObject::~KtObject() {
    //Unload linked REF
    List<StringName> keys;
    refs.get_key_list(&keys);
    for (int i = 0; i < keys.size(); ++i) {
        refs[keys[i]].unref();
    }

    jni::Env env { jni::Jvm::current_env() };
    jni::MethodId on_destroy_method = get_class(env).get_method_id(env, "_onDestroy", "()V");
    wrapped.call_void_method(env, on_destroy_method);
}

const jni::JObject &KtObject::get_wrapped() const {
    return wrapped;
}

const StringName& KtObject::get_class_name() const {
    return kt_class_name;
}

void KtObject::append_or_update_ref(const StringName& field, const REF& ref) {
    if (REF* r{refs.getptr(field)}) {
        r->unref();
    }
    refs[field] = ref;
}

REF* KtObject::get_ref_for_field(const StringName& field) {
    return refs.getptr(field);
}