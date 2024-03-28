#include "jvm_language.h"

#include "gd_kotlin.h"
#include "godotkotlin_defs.h"
#include "kotlin_script.h"

JvmLanguage* JvmLanguage::get_instance() {
    static JvmLanguage* instance {memnew(JvmLanguage)};
    return instance;
}

void JvmLanguage::init() {
    GDKotlin::get_instance().init();
}

void JvmLanguage::frame() {}

void JvmLanguage::finish() {
    GDKotlin::get_instance().finish();
}

void JvmLanguage::thread_enter() {
    // TODO: Remove this ifdef and its content while reworking GDKotlin and moving out logic of finding JVM.
#ifdef DEBUG_ENABLED
    if (!jni::Jvm::is_initialized()) {
        LOG_ERROR("JavaVM is not initialized, please make sure your project contains an embedded JVM or JAVA_HOME "
                  "environment variable is setup");
        return;
    }
#endif

    jni::Jvm::attach();
}

void JvmLanguage::thread_exit() {
    // TODO: Remove this ifdef and its content while reworking GDKotlin and moving out logic of finding JVM.
#ifdef DEBUG_ENABLED
    if (!jni::Jvm::is_initialized()) {
        LOG_ERROR("JavaVM is not initialized, please make sure your project contains an embedded JVM or JAVA_HOME "
                  "environment variable is setup");
        return;
    }
#endif

    jni::Jvm::detach();
}

String JvmLanguage::get_name() const {
    return GODOT_JVM_LANGUAGE_NAME;
}

String JvmLanguage::get_type() const {
    return GODOT_JVM_SCRIPT_NAME;
}

String JvmLanguage::get_extension() const {
    return GODOT_JVM_REGISTRATION_FILE_EXTENSION;
}

void JvmLanguage::get_recognized_extensions(List<String>* p_extensions) const {
    p_extensions->push_back(GODOT_JVM_REGISTRATION_FILE_EXTENSION);
}

bool JvmLanguage::handles_global_class_type(const String& p_type) const {
    return p_type == GODOT_JVM_SCRIPT_NAME;
}

bool JvmLanguage::has_named_classes() const {
    return true;
}

bool JvmLanguage::supports_builtin_mode() const {
    return false;
}

Script* JvmLanguage::create_script() const {
    return memnew(KotlinScript);
}

String JvmLanguage::get_global_class_name(const String& p_path, String* r_base_type, String* r_icon_path) const {
    if (p_path.begins_with(GODOT_ENTRY_PATH) || !p_path.ends_with(GODOT_JVM_REGISTRATION_FILE_EXTENSION)) { return {}; }

    String script_name = KotlinScript::get_script_file_name(p_path);
    Ref<KotlinScript> script = TypeManager::get_instance().get_user_script_from_name(script_name);
    if (!script.is_null() && script.is_valid()) {
        if (r_base_type) {
            if (script->get_base_script().is_null()) {
                *r_base_type = script->get_instance_base_type();
            } else {
                *r_base_type = script->get_base_script()->get_global_name();
            }
        }
        return script->get_global_name();
    }

    return {};
}

void JvmLanguage::get_reserved_words(List<String>* p_words) const {
    static const char* _reserved_words[] = {// RESERVED KEYWORDS
                                            "registeredName",
                                            "fqName",
                                            "relativeSourcePath ",
                                            "baseType ",
                                            "supertypes",
                                            "signals",
                                            "properties",
                                            "functions ",
                                            nullptr
    };
    const char** w = _reserved_words;
    while (*w) {
        p_words->push_back(*w);
        w++;
    }
}

bool JvmLanguage::is_control_flow_keyword(String p_keyword) const {
    return false;
}

void JvmLanguage::get_comment_delimiters(List<String>* p_delimiters) const {
    p_delimiters->push_back("//");
}

void JvmLanguage::get_doc_comment_delimiters(List<String>* p_delimiters) const {}

void JvmLanguage::get_string_delimiters(List<String>* p_delimiters) const {}

String JvmLanguage::get_template(const String& p_class_name, const String& p_base_class_name) const {
    String kotlinClassTemplate {
      "// THIS FILE IS GENERATED! DO NOT EDIT OR DELETE IT. EDIT OR DELETE THE ASSOCIATED SOURCE CODE FILE INSTEAD\n"
      "// Note: You can however freely move this file inside your godot project if you want. Keep in mind however, "
      "that if you rename the originating source code file, this file will be deleted and regenerated as a new file "
      "instead of being updated! Other modifications to the source file however, will result in this file being "
      "updated.\n"
      "\n"
      "registeredName = %CLASS%\n"
      "fqName = " GODOT_KOTLIN_PACKAGE ".%CLASS%\n"
      "relativeSourcePath = \"\"\n"
      "baseType = %BASE%\n"
      "supertypes = [\n"
      "    godot.%BASE%\n"
      "]\n"
      "signals = []\n"
      "properties = []\n"
      "functions = []\n"
    };
    return kotlinClassTemplate.replace("%BASE%", p_base_class_name).replace("%CLASS%", p_class_name);
}

Ref<Script> JvmLanguage::make_template(const String& p_template, const String& p_class_name, const String& p_base_class_name) const {
    Ref<KotlinScript> kotlin_script;
    kotlin_script.instantiate();
    kotlin_script->set_source_code(get_template(p_class_name, p_base_class_name));
    kotlin_script->set_name(p_class_name);
    return kotlin_script;
}

Vector<ScriptLanguage::ScriptTemplate> JvmLanguage::get_built_in_templates(StringName p_object) {
    return {};
}

bool JvmLanguage::is_using_templates() {
    return false;
}

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
    List<String> keywords;
    get_reserved_words(&keywords);
    if (keywords.find(p_path.get_file().get_basename())) {
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

int JvmLanguage::profiling_get_accumulated_data(ProfilingInfo* p_info_arr, int p_info_max) {
    return 0;
}

int JvmLanguage::profiling_get_frame_data(ProfilingInfo* p_info_arr, int p_info_max) {
    return 0;
}

void JvmLanguage::reload_all_scripts() {}

void JvmLanguage::reload_tool_script(const Ref<Script>& p_script, bool p_soft_reload) {}
