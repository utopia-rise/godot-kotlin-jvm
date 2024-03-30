#ifndef GODOT_JVM_KOTLIN_LANGUAGE_H
#define GODOT_JVM_KOTLIN_LANGUAGE_H

#include <core/object/script_language.h>

class KotlinLanguage : public ScriptLanguage {
public:
    KotlinLanguage() = default;
    ~KotlinLanguage() override = default;
    KotlinLanguage(const KotlinLanguage&) = delete;
    void operator=(const KotlinLanguage&) = delete;

    static KotlinLanguage* get_instance();

    void init() override;
    void frame() override;
    void finish() override;

    void thread_enter() override;
    void thread_exit() override;

    String get_name() const override;
    String get_type() const override;
    String get_extension() const override;
    void get_recognized_extensions(List<String>* p_extensions) const override;

    bool handles_global_class_type(const String& p_type) const override;
    String get_global_class_name(const String& p_path, String* r_base_type, String* r_icon_path) const override;
    bool has_named_classes() const override;
    bool supports_builtin_mode() const override;
    Script* create_script() const override;

    void get_reserved_words(List<String>* p_words) const override;
    bool is_control_flow_keyword(String p_keyword) const override;
    void get_comment_delimiters(List<String>* p_delimiters) const override;
    void get_doc_comment_delimiters(List<String>* p_delimiters) const override;
    void get_string_delimiters(List<String>* p_delimiters) const override;
    Ref<Script> make_template(const String& p_template, const String& p_class_name, const String& p_base_class_name) const override;
    Vector<ScriptTemplate> get_built_in_templates(StringName p_object) override;
    bool is_using_templates() override;

    bool validate(
      const String& p_script,
      const String& p_path,
      List<String>* r_functions,
      List<ScriptLanguage::ScriptError>* r_errors = nullptr,
      List<ScriptLanguage::Warning>* r_warnings = nullptr,
      HashSet<int>* r_safe_lines = nullptr
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
    int profiling_get_accumulated_data(ProfilingInfo* p_info_arr, int p_info_max) override;
    int profiling_get_frame_data(ProfilingInfo* p_info_arr, int p_info_max) override;

    void reload_all_scripts() override;
    void reload_tool_script(const Ref<Script>& p_script, bool p_soft_reload) override;
};

#endif// GODOT_JVM_KOTLIN_LANGUAGE_H
