#ifndef GODOT_JVM_JVM_SCRIPT_H
#define GODOT_JVM_JVM_SCRIPT_H

#include "core/object/script_language.h"
#include "jvm_wrapper/registration/kt_class.h"

class JvmInstance;

class JvmScript : public Script {
    GDCLASS(JvmScript, Script);

    friend class JvmInstance;
    friend class JvmScriptManager;

protected:
    KtClass* kotlin_class;
    String source;

    template<bool isCreator>
    ScriptInstance* _instance_create(const Variant** p_args, int p_arg_count, Object* p_this);
    Object* _object_create(const Variant** p_args, int p_arg_count);

public:
    JvmScript();
    ~JvmScript() override;

    Variant _new(const Variant** p_args, int p_arg_count, Callable::CallError& r_error);
    bool can_instantiate() const override;
    bool inherits_script(const Ref<Script>& p_script) const override;
    Ref<Script> get_base_script() const override;
    StringName get_instance_base_type() const override;
    ScriptInstance* instance_create(Object* p_this) override;
    bool instance_has(const Object* p_this) const override;
    bool has_source_code() const override;
    String get_source_code() const override;
    void set_source_code(const String& p_code) override;
    Error reload(bool p_keep_state) override;
    bool has_method(const StringName& p_method) const override;
    MethodInfo get_method_info(const StringName& p_method) const override;
    bool is_tool() const override;
    bool is_valid() const override;
    bool is_placeholder_fallback_enabled() const override;
    bool is_abstract() const override;
    bool has_script_signal(const StringName& p_signal) const override;
    void get_script_signal_list(List<MethodInfo>* r_signals) const override;
    bool get_property_default_value(const StringName& p_property, Variant& r_value) const override;
    void get_script_method_list(List<MethodInfo>* p_list) const override;
    void get_script_property_list(List<PropertyInfo>* p_list) const override;
    void get_script_exported_property_list(List<PropertyInfo>* p_list) const;
    void get_constants(HashMap<StringName, Variant> *p_constants) override;
    void get_members(HashSet<StringName> *p_members) override;
    const Variant get_rpc_config() const override;

    _FORCE_INLINE_ static String get_script_file_name(const String& path) {
        return path.get_file().trim_suffix(path.get_extension()).trim_suffix(".");
    }

#ifdef TOOLS_ENABLED
    // This concerns placeholders script instances only

private:
    HashSet<PlaceHolderScriptInstance*> placeholders;
    HashMap<StringName, Variant> exported_members_default_value_cache;
    uint64_t last_time_source_modified = 0;
    bool export_dirty_flag = true;

    void _placeholder_erased(PlaceHolderScriptInstance* p_placeholder) override;

public:
    PlaceHolderScriptInstance* placeholder_instance_create(Object* p_this) override;
    uint64_t get_last_time_source_modified();
    void set_last_time_source_modified(uint64_t p_time);

    Vector<DocData::ClassDoc> get_documentation() const override;
    PropertyInfo get_class_category() const override;
    String get_class_icon_path() const override;
    StringName get_doc_class_name() const override;

    void update_script_exports();
#endif

protected:
    static void _bind_methods();
};

class PathScript : public JvmScript {
    GDSOFTCLASS(PathScript, JvmScript);
public:
    PathScript() = default;
    ~PathScript() override = default;
    StringName get_global_name() const override;
};

class NamedScript : public JvmScript {
    GDSOFTCLASS(NamedScript, JvmScript);
public:
    NamedScript() = default;
    ~NamedScript() override;
    StringName get_global_name() const override;
};

#endif// GODOT_JVM_JVM_SCRIPT_H
