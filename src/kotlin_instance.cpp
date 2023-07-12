#include "kotlin_instance.h"

#include "core/core_string_names.h"
#include "gd_kotlin.h"
#include "kotlin_language.h"
#include "kt_class.h"

KotlinInstance::KotlinInstance(Object* p_owner, KtObject* p_kt_object, KotlinScript* p_script) :
  owner(p_owner),
  kt_object(p_kt_object),
  script(p_script)
{}

KotlinInstance::~KotlinInstance() {
    if(delete_flag){
        GDKotlin::get_instance().transfer_context->remove_script_instance(owner->get_instance_id());
    }

}

Object* KotlinInstance::get_owner() {
    return owner;
}

bool KotlinInstance::set(const StringName& p_name, const Variant& p_value) {
    jni::LocalFrame localFrame(1000);

    KtProperty* ktProperty {kt_class->get_property(p_name)};
    if (ktProperty) {
        ktProperty->call_set(kt_object, p_value);
        return true;
    } else {
        return false;
    }
}

bool KotlinInstance::get(const StringName& p_name, Variant& r_ret) const {
    jni::LocalFrame localFrame(1000);

    KtProperty* ktProperty {kt_class->get_property(p_name)};
    if (ktProperty) {
        ktProperty->call_get(kt_object, r_ret);
        return true;
    } else {
        return false;
    }
}

#ifdef TOOLS_ENABLED
bool KotlinInstance::get_or_default(const StringName& p_name, Variant& r_ret) const {
    jni::LocalFrame localFrame(1000);

    KtProperty* ktProperty {kt_class->get_property(p_name)};
    if (ktProperty) {
        ktProperty->safe_call_get(kt_object, r_ret);
        return true;
    } else {
        return false;
    }
}
#endif

void KotlinInstance::get_property_list(List<PropertyInfo>* p_properties) const {
    kt_class->get_property_list(p_properties);
}

Variant::Type KotlinInstance::get_property_type(const StringName& p_name, bool* r_is_valid) const {
    return Variant::VECTOR3;
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

Variant KotlinInstance::callp(const StringName& p_method, const Variant** p_args, int p_argcount, Callable::CallError& r_error) {
    KtFunction* function {kt_class->get_method(p_method)};
    Variant ret_var;
    if (function) {
        function->invoke(kt_object, p_args, p_argcount, ret_var);
    } else {
        r_error.error = Callable::CallError::CALL_ERROR_INVALID_METHOD;
    }
    return ret_var;
}

void KotlinInstance::notification(int p_notification) {
    switch (p_notification) {
        case Object::NOTIFICATION_PREDELETE: {
            delete_flag = false;
        } break;
    }

    KtFunction* function {kt_class->get_method(CoreStringNames::get_singleton()->notification)};

    if (function) {
        Variant ret_var;
        Variant value = p_notification;
        const Variant *args[1] = { &value };
        function->invoke(kt_object, args, 1, ret_var);
    }
}

String KotlinInstance::to_string(bool* r_valid) {
    return ScriptInstance::to_string(r_valid);
}

void KotlinInstance::refcount_incremented() {}

bool KotlinInstance::refcount_decremented() {}

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

const Variant KotlinInstance::get_rpc_config() const {
    return kt_class->get_rpc_config();
}

ScriptLanguage* KotlinInstance::get_language() {
    return KotlinLanguage::get_instance();
}

bool KotlinInstance::property_can_revert(const StringName& p_name) const {
    // TODO/4.0: Implement
    return false;
}

bool KotlinInstance::property_get_revert(const StringName& p_name, Variant& r_ret) const {
    // TODO/4.0: Implement
    return false;
}
