#include "jvm_language.h"

using namespace godot;

void JvmLanguage::init() {}

void JvmLanguage::frame() {}

void JvmLanguage::finish() {}

bool JvmLanguage::validate(
  const String& p_script,
  const String& p_path,
  List<String>* r_functions,
  List<ScriptLanguage::ScriptError>* r_errors,
  List<ScriptLanguage::Warning>* r_warnings,
  HashSet<int>* r_safe_lines
) const {
    return true;
}

String JvmLanguage::validate_path(const String& p_path) const {
    Vector <String> keywords = get_reserved_words();
    if (keywords.find(p_path.get_file().get_basename()) != -1) {
        String alert {"Please don't use reserved keywords as file name."};
        return
#ifdef TOOLS_ENABLED
          TTR(alert)
#else
          RTR(alert)
#endif
            ;
    }
    return "";
}

// Dummy Implementations

int JvmLanguage::find_function(const String& p_function, const String& p_code) const {
    return 0;
}

String JvmLanguage::make_function(const String& p_class, const String& p_name, const PackedStringArray& p_args) const {
    return {};
}

Error JvmLanguage::open_in_external_editor(const Ref<Script>& p_script, int p_line, int p_col) {
    return ScriptLanguage::open_in_external_editor(p_script, p_line, p_col);
}

bool JvmLanguage::overrides_external_editor() {
    return false;
}

Error JvmLanguage::complete_code(const String& p_code, const String& p_path, Object* p_owner, List<CodeCompletionOption>* r_options, bool& r_force, String& r_call_hint) {
    return ScriptLanguage::complete_code(p_code, p_path, p_owner, r_options, r_force, r_call_hint);
}

Error JvmLanguage::lookup_code(const String& p_code, const String& p_symbol, const String& p_path, Object* p_owner, LookupResult& r_result) {
    return ScriptLanguage::lookup_code(p_code, p_symbol, p_path, p_owner, r_result);
}

void JvmLanguage::auto_indent_code(String& p_code, int p_from_line, int p_to_line) const {}

void JvmLanguage::add_global_constant(const StringName& p_variable, const Variant& p_value) {}

void JvmLanguage::add_named_global_constant(const StringName& p_name, const Variant& p_value) {}

void JvmLanguage::remove_named_global_constant(const StringName& p_name) {}

void JvmLanguage::get_public_functions(List<MethodInfo>* p_functions) const {}

void JvmLanguage::get_public_constants(List<Pair<String, Variant>>* p_constants) const {}

void JvmLanguage::get_public_annotations(List<MethodInfo>* p_annotations) const {}

String JvmLanguage::debug_get_error() const {
    return {};
}

int JvmLanguage::debug_get_stack_level_count() const {
    return 0;
}

int JvmLanguage::debug_get_stack_level_line(int p_level) const {
    return 0;
}

String JvmLanguage::debug_get_stack_level_function(int p_level) const {
    return {};
}

String JvmLanguage::debug_get_stack_level_source(int p_level) const {
    return {};
}

void JvmLanguage::debug_get_stack_level_locals(int p_level, List<String>* p_locals, List<Variant>* p_values, int p_max_subitems, int p_max_depth) {
}

void JvmLanguage::debug_get_stack_level_members(int p_level, List<String>* p_members, List<Variant>* p_values, int p_max_subitems, int p_max_depth) {
}

void JvmLanguage::debug_get_globals(List<String>* p_globals, List<Variant>* p_values, int p_max_subitems, int p_max_depth) {}

String JvmLanguage::debug_parse_stack_level_expression(int p_level, const String& p_expression, int p_max_subitems, int p_max_depth) {
    return {};
}

void JvmLanguage::profiling_start() {}

void JvmLanguage::profiling_stop() {}

void JvmLanguage::profiling_set_save_native_calls(bool p_enable) {}

int JvmLanguage::profiling_get_accumulated_data(ProfilingInfo* p_info_arr, int p_info_max) {
    return 0;
}

int JvmLanguage::profiling_get_frame_data(ProfilingInfo* p_info_arr, int p_info_max) {
    return 0;
}

void JvmLanguage::reload_scripts(const Array& p_scripts, bool p_soft_reload) {}

void JvmLanguage::reload_all_scripts() {}

void JvmLanguage::reload_tool_script(const Ref<Script>& p_script, bool p_soft_reload) {}

// TODO: Dummy to make reloading work again because of https://github.com/godotengine/godot/issues/104540. Should still be truly implemented at some point
bool JvmLanguage::supports_documentation() const {
    return true;
}
