#ifndef GODOT_JVM_KOTLIN_INSTANCE_H
#define GODOT_JVM_KOTLIN_INSTANCE_H
#include "core/script_language.h"
#include "kt_object.h"
#include "kt_class.h"

class KotlinInstance : public ScriptInstance {
private:
    const jni::JObject &jObject;
public:
    explicit KotlinInstance(const jni::JObject &wrappedObject);
    ~KotlinInstance() override = default;

    bool set(const StringName& p_name, const Variant& p_value) override;

    bool get(const StringName& p_name, Variant& r_ret) const override;

    void get_property_list(List<PropertyInfo>* p_properties) const override;

    Variant::Type get_property_type(const StringName& p_name, bool* r_is_valid) const override;

    Object* get_owner() override;

    void get_property_state(List<Pair<StringName, Variant>>& state) override;

    void get_method_list(List<MethodInfo>* p_list) const override;

    bool has_method(const StringName& p_method) const override;

    Variant call(const StringName& p_method, const Variant& p_arg1, const Variant& p_arg2, const Variant& p_arg3,
                 const Variant& p_arg4, const Variant& p_arg5) override;

    Variant
    call(const StringName& p_method, const Variant** p_args, int p_argcount, Variant::CallError& r_error) override;

    void
    call_multilevel(const StringName& p_method, const Variant& p_arg1, const Variant& p_arg2, const Variant& p_arg3,
                    const Variant& p_arg4, const Variant& p_arg5) override;

    void call_multilevel(const StringName& p_method, const Variant** p_args, int p_argcount) override;

    void call_multilevel_reversed(const StringName& p_method, const Variant** p_args, int p_argcount) override;

    void notification(int p_notification) override;

    String to_string(bool* r_valid) override;

    void refcount_incremented() override;

    bool refcount_decremented() override;

    Ref<Script> get_script() const override;

    bool is_placeholder() const override;

    void property_set_fallback(const StringName& p_name, const Variant& p_value, bool* r_valid) override;

    Variant property_get_fallback(const StringName& p_name, bool* r_valid) override;

    MultiplayerAPI::RPCMode get_rpc_mode(const StringName& p_method) const override;

    MultiplayerAPI::RPCMode get_rset_mode(const StringName& p_variable) const override;

    ScriptLanguage* get_language() override;
};


#endif //GODOT_JVM_KOTLIN_INSTANCE_H
