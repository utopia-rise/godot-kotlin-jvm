#include "kotlin_script.h"
#include "kotlin_language.h"
#include "kotlin_instance.h"
#include "gd_kotlin.h"

bool KotlinScript::can_instance() const {
    return true;
}

Ref<Script> KotlinScript::get_base_script() const {
    return Ref<Script>();
}

StringName KotlinScript::get_instance_base_type() const {
    KtClass* kotlinClass = get_kotlin_class();
    if (kotlinClass) {
        return kotlinClass->super_class;
    }
    // not found
    return StringName();
}

ScriptInstance* KotlinScript::instance_create(Object* p_this) {
    print_verbose(vformat("Try to create %s instance.", get_kotlin_class()->name));
    jni::Env env = jni::Jvm::current_env();
    KtObject *wrapped = get_kotlin_class()->create_instance(env, nullptr, 0, p_this);
    return memnew(KotlinInstance(wrapped, p_this));
}

bool KotlinScript::instance_has(const Object* p_this) const {
    return false;
}

bool KotlinScript::has_source_code() const {
    return false;
}

String KotlinScript::get_source_code() const {
    return source;
}

void KotlinScript::set_source_code(const String& p_code) {
    if (source == p_code) return;
    source = p_code;

    //TODO : deal with tool mode
}

Error KotlinScript::reload(bool p_keep_state) {
    return ERR_UNAVAILABLE;
}

bool KotlinScript::has_method(const StringName& p_method) const {
    KtClass* kotlinClass = get_kotlin_class();
    return kotlinClass ? kotlinClass->get_method(p_method) != nullptr : false;
}

MethodInfo KotlinScript::get_method_info(const StringName& p_method) const {
    KtClass* kotlinClass = get_kotlin_class();
    if (!kotlinClass) {
        return MethodInfo();
    }

    KtClass* it { kotlinClass };
    while (it) {
        KtFunction* method {kotlinClass->get_method(p_method)};
        if (method) {
            return method->get_method_info();
        }
        it = GDKotlin::get_instance().find_class(kotlinClass->super_class);
    }
    return MethodInfo();
}

bool KotlinScript::is_tool() const {
    return false;
}

bool KotlinScript::is_valid() const {
    return false;
}

ScriptLanguage* KotlinScript::get_language() const {
    return &KotlinLanguage::get_instance();
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
    KtClass* kotlinClass = get_kotlin_class();
    if (kotlinClass) {
        kotlinClass->get_method_list(p_list);
    }
}

void KotlinScript::get_script_property_list(List<PropertyInfo>* p_list) const {

}

KtClass* KotlinScript::get_kotlin_class() const {
    return GDKotlin::get_instance().find_class(get_path());
}
