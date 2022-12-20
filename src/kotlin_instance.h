#ifndef GODOT_JVM_KOTLIN_INSTANCE_H
#define GODOT_JVM_KOTLIN_INSTANCE_H

#include "kotlin_script.h"
#include "kt_class.h"
#include "memory/kotlin_binding_manager.h"

#include <core/object/script_language.h>

class KotlinInstance : public ScriptInstance {
private:
    KotlinBinding* binding;
    KtClass* kt_class;
    Ref<KotlinScript> script;

public:
    KotlinInstance(KtObject* p_wrapped_object, Object* p_owner, KtClass* p_kt_class, KotlinScript* p_script);
    ~KotlinInstance() override;

    bool set(const StringName& p_name, const Variant& p_value) override;

    bool get(const StringName& p_name, Variant& r_ret) const override;

    void get_property_list(List<PropertyInfo>* p_properties) const override;

    Variant::Type get_property_type(const StringName& p_name, bool* r_is_valid) const override;

    Object* get_owner() override;

    void get_property_state(List<Pair<StringName, Variant>>& state) override;

    void get_method_list(List<MethodInfo>* p_list) const override;

    bool has_method(const StringName& p_method) const override;

    Variant callp(const StringName& p_method, const Variant** p_args, int p_argcount, Callable::CallError& r_error) override;

    void notification(int p_notification) override;

    String to_string(bool* r_valid) override;

    void refcount_incremented() override;

    bool refcount_decremented() override;

    Ref<Script> get_script() const override;

    bool is_placeholder() const override;

    void property_set_fallback(const StringName& p_name, const Variant& p_value, bool* r_valid) override;

    Variant property_get_fallback(const StringName& p_name, bool* r_valid) override;

    // Variant is of type Dictionary
    const Variant get_rpc_config() const override;

    ScriptLanguage* get_language() override;

    bool property_can_revert(const StringName& p_name) const override;
    bool property_get_revert(const StringName& p_name, Variant& r_ret) const override;
};

#endif// GODOT_JVM_KOTLIN_INSTANCE_H
