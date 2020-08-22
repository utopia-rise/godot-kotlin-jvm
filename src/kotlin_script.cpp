#include "kotlin_script.h"

#include "kotlin_language.h"
#include "kotlin_instance.h"

bool KotlinScript::can_instance() const {
    return false;
}

Ref<Script> KotlinScript::get_base_script() const {
    return Ref<Script>();
}

StringName KotlinScript::get_instance_base_type() const {
    return StringName();
}

ScriptInstance* KotlinScript::instance_create(Object* p_this) {
    return memnew(KotlinInstance);
}

bool KotlinScript::instance_has(const Object* p_this) const {
    return false;
}

bool KotlinScript::has_source_code() const {
    return false;
}

String KotlinScript::get_source_code() const {
    return String();
}

void KotlinScript::set_source_code(const String& p_code) {

}

Error KotlinScript::reload(bool p_keep_state) {
    return ERR_UNAVAILABLE;
}

bool KotlinScript::has_method(const StringName& p_method) const {
    return false;
}

MethodInfo KotlinScript::get_method_info(const StringName& p_method) const {
    return MethodInfo();
}

bool KotlinScript::is_tool() const {
    return false;
}

bool KotlinScript::is_valid() const {
    return false;
}

ScriptLanguage* KotlinScript::get_language() const {
    return &KotlinLanguage::instance();
}

bool KotlinScript::has_script_signal(const StringName& p_signal) const {
    return false;
}

void KotlinScript::get_script_signal_list(List<MethodInfo>* r_signals) const {

}

bool KotlinScript::get_property_default_value(const StringName& p_property, Variant& r_value) const {
    return false;
}

void KotlinScript::get_script_method_list(List<MethodInfo>* p_list) const {

}

void KotlinScript::get_script_property_list(List<PropertyInfo>* p_list) const {

}
