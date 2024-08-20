#ifndef KOTLIN_JVM_LANGUAGE_H
#define KOTLIN_JVM_LANGUAGE_H

#include <core/object/script_language.h>

class JvmLanguage : public ScriptLanguage {
public:
    void init() override;
    void frame() override;
    void finish() override;

    bool validate(
      const String& p_script,
      const String& p_path,
      List<String>* r_functions,
      List<ScriptLanguage::ScriptError>* r_errors,
      List<ScriptLanguage::Warning>* r_warnings,
      HashSet<int>* r_safe_lines
    ) const override;
    String validate_path(const String& p_path) const override;

    // Dummy Implementations
    int find_function(const String& p_function, const String& p_code) const override;
    String make_function(const String& p_class, const String& p_name, const PackedStringArray& p_args) const override;
    Error open_in_external_editor(const Ref<Script>& p_script, int p_line, int p_col) override;
    bool overrides_external_editor() override;

    Error complete_code(const String& p_code, const String& p_path, Object* p_owner, List<CodeCompletionOption>* r_options, bool& r_force, String& r_call_hint) override;
    Error lookup_code(const String& p_code, const String& p_symbol, const String& p_path, Object* p_owner, LookupResult& r_result) override;
    void auto_indent_code(String& p_code, int p_from_line, int p_to_line) const override;
    void add_global_constant(const StringName& p_variable, const Variant& p_value) override;
    void add_named_global_constant(const StringName& p_name, const Variant& p_value) override;
    void remove_named_global_constant(const StringName& p_name) override;

    void get_public_functions(List<MethodInfo>* p_functions) const override;
    void get_public_constants(List<Pair<String, Variant>>* p_constants) const override;
    void get_public_annotations(List<MethodInfo>* p_annotations) const override;

    String debug_get_error() const override;
    int debug_get_stack_level_count() const override;
    int debug_get_stack_level_line(int p_level) const override;
    String debug_get_stack_level_function(int p_level) const override;
    String debug_get_stack_level_source(int p_level) const override;
    void debug_get_stack_level_locals(int p_level, List<String>* p_locals, List<Variant>* p_values, int p_max_subitems, int p_max_depth) override;
    void debug_get_stack_level_members(int p_level, List<String>* p_members, List<Variant>* p_values, int p_max_subitems, int p_max_depth) override;
    void debug_get_globals(List<String>* p_globals, List<Variant>* p_values, int p_max_subitems, int p_max_depth) override;
    String debug_parse_stack_level_expression(int p_level, const String& p_expression, int p_max_subitems, int p_max_depth) override;

    void profiling_start() override;
    void profiling_stop() override;
    void profiling_set_save_native_calls(bool p_enable) override;
    int profiling_get_accumulated_data(ProfilingInfo* p_info_arr, int p_info_max) override;
    int profiling_get_frame_data(ProfilingInfo* p_info_arr, int p_info_max) override;

    void reload_scripts(const Array &p_scripts, bool p_soft_reload) override;
    void reload_all_scripts() override;
    void reload_tool_script(const Ref<Script>& p_script, bool p_soft_reload) override;
};

#endif// KOTLIN_JVM_LANGUAGE_H
