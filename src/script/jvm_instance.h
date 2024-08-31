#ifndef GODOT_JVM_JVM_INSTANCE_H
#define GODOT_JVM_JVM_INSTANCE_H

#include "core/object/script_language.h"
#include "jvm_script.h"
#include "jvm_wrapper/registration/kt_class.h"
#include "jvm_wrapper/memory/memory_manager.h"

class JvmInstance : public ScriptInstance {
    friend class MemoryManager;
private:
    Object* owner;
    KtObject* kt_object;
    KtClass* kt_class;
    Ref<JvmScript> script;
    SafeFlag to_demote_flag;
    bool delete_flag;

    void demote_reference();
    void promote_reference();

public:
    JvmInstance(jni::Env& p_env, Object* p_owner, KtObject* p_kt_object, JvmScript* p_script);
    ~JvmInstance() override;

    bool set(const StringName& p_name, const Variant& p_value) override;
    bool get(const StringName& p_name, Variant& r_ret) const override;
#ifdef TOOLS_ENABLED
    bool get_or_default(const StringName& p_name, Variant& r_ret) const;
#endif
    void get_property_list(List<PropertyInfo>* p_properties) const override;
    Variant::Type get_property_type(const StringName& p_name, bool* r_is_valid) const override;
    Object* get_owner() override;
    void get_property_state(List<Pair<StringName, Variant>>& state) override;
    void get_method_list(List<MethodInfo>* p_list) const override;
    bool has_method(const StringName& p_method) const override;
    Variant callp(const StringName& p_method, const Variant** p_args, int p_argcount, Callable::CallError& r_error) override;
    void notification(int p_notification, bool p_reversed) override;
    virtual void validate_property(PropertyInfo& p_property) const override;
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

#endif// GODOT_JVM_JVM_INSTANCE_H
