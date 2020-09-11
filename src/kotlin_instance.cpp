#include "kotlin_instance.h"
#include "kotlin_language.h"
#include "kt_class.h"
#include "gd_kotlin.h"

KotlinInstance::KotlinInstance(KtObject *p_wrappedObject) : wrappedObject(p_wrappedObject), owner(nullptr) {

}

KotlinInstance::~KotlinInstance() {
    delete wrappedObject;
}

KotlinInstance::KotlinInstance(KtObject *wrappedObject, Object *owner) : KotlinInstance(wrappedObject) {
    set_owner(owner);
}

bool KotlinInstance::set(const StringName& p_name, const Variant& p_value) {
    return false;
}

bool KotlinInstance::get(const StringName& p_name, Variant& r_ret) const {
    return false;
}

void KotlinInstance::get_property_list(List<PropertyInfo>* p_properties) const {

}

Variant::Type KotlinInstance::get_property_type(const StringName& p_name, bool* r_is_valid) const {
    return Variant::VECTOR3;
}

Object* KotlinInstance::get_owner() {
    return owner;
}

void KotlinInstance::set_owner(Object *object) {
    owner = object;
    owner->set_script_instance(this);
}

void KotlinInstance::get_property_state(List<Pair<StringName, Variant>>& state) {
    ScriptInstance::get_property_state(state);
}

void KotlinInstance::get_method_list(List<MethodInfo>* p_list) const {
    KtClass* kotlinClass { GDKotlin::get_instance().find_class_by_name(wrappedObject->get_class_name()) };
    if (kotlinClass) {
        kotlinClass->get_method_list(p_list);
    }
}

bool KotlinInstance::has_method(const StringName& p_method) const {
    return GDKotlin::get_instance().find_class_by_name(wrappedObject->get_class_name())->get_method(p_method) != nullptr;
}

Variant
KotlinInstance::call(const StringName& p_method, const Variant& p_arg1, const Variant& p_arg2, const Variant& p_arg3,
                     const Variant& p_arg4, const Variant& p_arg5) {
    return ScriptInstance::call(p_method, p_arg1, p_arg2, p_arg3, p_arg4, p_arg5);
}

Variant KotlinInstance::call(const StringName& p_method, const Variant** p_args, int p_argcount, Variant::CallError& r_error) {
    return wrappedObject->call_method(p_method, p_args, r_error);
}

void KotlinInstance::call_multilevel(const StringName& p_method, const Variant& p_arg1, const Variant& p_arg2,
                                     const Variant& p_arg3, const Variant& p_arg4, const Variant& p_arg5) {
    ScriptInstance::call_multilevel(p_method, p_arg1, p_arg2, p_arg3, p_arg4, p_arg5);
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
    return Ref<Script>();
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
    return MultiplayerAPI::RPC_MODE_DISABLED;
}

MultiplayerAPI::RPCMode KotlinInstance::get_rset_mode(const StringName& p_variable) const {
    return MultiplayerAPI::RPC_MODE_DISABLED;
}

ScriptLanguage* KotlinInstance::get_language() {
    return &KotlinLanguage::get_instance();
}
