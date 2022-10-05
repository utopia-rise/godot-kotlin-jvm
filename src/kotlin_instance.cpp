#include "kotlin_instance.h"
#include "kotlin_language.h"
#include "kt_class.h"

KotlinInstance::KotlinInstance(KtObject* p_wrapped_object, Object* p_owner, KtClass* p_kt_class, Script* p_script)
        : wrapped_object(p_wrapped_object),
          owner(nullptr), kt_class(p_kt_class), script(p_script) {
    set_owner(p_owner);
}

KotlinInstance::~KotlinInstance() {
    delete wrapped_object;
}

bool KotlinInstance::set(const StringName& p_name, const Variant& p_value) {
    jni::LocalFrame localFrame(1000);

    KtProperty* ktProperty { kt_class->get_property(p_name) };
    if (ktProperty) {
        ktProperty->setCall(wrapped_object, p_value);
        return true;
    } else {
        return false;
    }
}

bool KotlinInstance::get(const StringName& p_name, Variant& r_ret) const {
    jni::LocalFrame localFrame(1000);

    KtProperty* ktProperty { kt_class->get_property(p_name) };
    if (ktProperty) {
        ktProperty->callGet(wrapped_object, r_ret);
        return true;
    } else {
        return false;
    }
}

void KotlinInstance::get_property_list(List<PropertyInfo>* p_properties) const {
    kt_class->get_property_list(p_properties);
}

Variant::Type KotlinInstance::get_property_type(const StringName& p_name, bool* r_is_valid) const {
    return Variant::VECTOR3;
}

Object* KotlinInstance::get_owner() {
    return owner;
}

void KotlinInstance::set_owner(Object *object) {
    owner = object;
}

void KotlinInstance::get_property_state(List<Pair<StringName, Variant>>& state) {
    ScriptInstance::get_property_state(state);
}

void KotlinInstance::get_method_list(List<MethodInfo>* p_list) const {
    kt_class->get_method_list(p_list);
}

bool KotlinInstance::has_method(const StringName& p_method) const {
    return kt_class->get_method(p_method) != nullptr;
}

Variant
KotlinInstance::call(const StringName& p_method, const Variant& p_arg1, const Variant& p_arg2, const Variant& p_arg3,
                     const Variant& p_arg4, const Variant& p_arg5, const Variant& p_arg6, const Variant& p_arg7, const Variant& p_arg8) {
    return ScriptInstance::call(p_method, p_arg1, p_arg2, p_arg3, p_arg4, p_arg5, p_arg6, p_arg7, p_arg8);
}

Variant KotlinInstance::call(const StringName& p_method, const Variant** p_args, int p_argcount, Variant::CallError& r_error) {
    jni::LocalFrame local_frame(100);

    KtFunction* function { kt_class->get_method(p_method) };
    Variant ret_var;
    if (function) {
        function->invoke(this->wrapped_object, p_args, p_argcount, ret_var);
    } else {
        r_error.error = Variant::CallError::CALL_ERROR_INVALID_METHOD;
    }
    return ret_var;
}

void KotlinInstance::call_multilevel(const StringName& p_method, const Variant& p_arg1, const Variant& p_arg2,
                                     const Variant& p_arg3, const Variant& p_arg4, const Variant& p_arg5, const Variant& p_arg6, const Variant& p_arg7, const Variant& p_arg8) {
    ScriptInstance::call_multilevel(p_method, p_arg1, p_arg2, p_arg3, p_arg4, p_arg5, p_arg6, p_arg7, p_arg8);
}

void KotlinInstance::call_multilevel(const StringName& p_method, const Variant** p_args, int p_argcount) {
    ScriptInstance::call_multilevel(p_method, p_args, p_argcount);
}

void KotlinInstance::call_multilevel_reversed(const StringName& p_method, const Variant** p_args, int p_argcount) {
    ScriptInstance::call_multilevel_reversed(p_method, p_args, p_argcount);
}

void KotlinInstance::notification(int p_notification) {

}

String KotlinInstance::to_string(bool* r_valid) {
    return ScriptInstance::to_string(r_valid);
}

void KotlinInstance::refcount_incremented() {
    ScriptInstance::refcount_incremented();
}

bool KotlinInstance::refcount_decremented() {
    return ScriptInstance::refcount_decremented();
}

Ref<Script> KotlinInstance::get_script() const {
    return script;
}

bool KotlinInstance::is_placeholder() const {
    return ScriptInstance::is_placeholder();
}

void KotlinInstance::property_set_fallback(const StringName& p_name, const Variant& p_value, bool* r_valid) {
    ScriptInstance::property_set_fallback(p_name, p_value, r_valid);
}

Variant KotlinInstance::property_get_fallback(const StringName& p_name, bool* r_valid) {
    return ScriptInstance::property_get_fallback(p_name, r_valid);
}

MultiplayerAPI::RPCMode KotlinInstance::get_rpc_mode(const StringName& p_method) const {
    KtFunction* function { kt_class->get_method(p_method) };

    if (function) {
        return function->get_rpc_mode();
    } else {
        return MultiplayerAPI::RPC_MODE_DISABLED;
    }
}

MultiplayerAPI::RPCMode KotlinInstance::get_rset_mode(const StringName& p_variable) const {
    KtProperty* ktProperty { kt_class->get_property(p_variable) };
    if (ktProperty) {
        return ktProperty->get_rpc_mode();
    } else {
        return MultiplayerAPI::RPC_MODE_DISABLED;
    }
}

ScriptLanguage* KotlinInstance::get_language() {
    return &KotlinLanguage::get_instance();
}
