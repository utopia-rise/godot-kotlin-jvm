#include <core/project_settings.h>
#include "kotlin_language.h"
#include "kotlin_script.h"
#include "gd_kotlin.h"
#include "godotkotlin_defs.h"

static const String GODOT_ENTRY_PATH{"res://build/godot-entry"};

KotlinLanguage& KotlinLanguage::get_instance() {
    static KotlinLanguage instance;
    return instance;
}

String KotlinLanguage::get_name() const {
    return "Kotlin";
}

void KotlinLanguage::init() {
    GDKotlin::get_instance().init();
}

String KotlinLanguage::get_type() const {
    return "KotlinScript";
}

String KotlinLanguage::get_extension() const {
    return "kt";
}

Error KotlinLanguage::execute_file(const String& p_path) {
    //??
    return OK;
}

void KotlinLanguage::finish() {
    GDKotlin::get_instance().finish();
}

void KotlinLanguage::get_reserved_words(List<String>* p_words) const {
    static const char* _reserved_words[] = {
            //RESERVED KEYWORDS
            "as",
            "as?",
            "break",
            "class",
            "continue",
            "do",
            "else",
            "false",
            "for",
            "fun",
            "if",
            "in",
            "!in",
            "interface",
            "is",
            "!is",
            "null",
            "object",
            "package",
            "return",
            "super",
            "this",
            "throw",
            "true",
            "try",
            "typealias",
            "typeof",
            "val",
            "var",
            "when",
            "while",

            //SOFT KEYWORDS
            "by",
            "catch",
            "constructor",
            "delegate",
            "dynamic",
            "field",
            "file",
            "finally",
            "get",
            "import",
            "init",
            "param",
            "property",
            "receiveris",
            "set",
            "setparam",
            "where",

            //MODIFIERS KEYWORDS
            "actual",
            "abstract",
            "annotation",
            "companion",
            "const",
            "crossinline",
            "data",
            "enum",
            "expect",
            "external",
            "final",
            "infix",
            "inline",
            "inner",
            "internal",
            "lateinit",
            "noinline",
            "open",
            "operator",
            "out",
            "override",
            "private",
            "protected",
            "public",
            "reified",
            "sealed",
            "suspend",
            "tailrec",
            "vararg",

            //SPECIAL IDENTIFIERS
            "it",

            nullptr
    };

    const char **w = _reserved_words;

    while (*w) {
        p_words->push_back(*w);
        w++;
    }
}

void KotlinLanguage::get_comment_delimiters(List<String>* p_delimiters) const {
    p_delimiters->push_back("//");
    p_delimiters->push_back("/* */");
}

void KotlinLanguage::get_string_delimiters(List<String>* p_delimiters) const {
    p_delimiters->push_back("' '");
    p_delimiters->push_back("\" \"");
}

Ref<Script> KotlinLanguage::get_template(const String& p_class_name, const String& p_base_class_name) const {
    String kotlinClassTemplate {
        "package fixme\n"
        "\n"
        "import " GODOT_KOTLIN_PACKAGE ".%BASE%\n"
        "import godot.annotation.RegisterClass\n"
        "import godot.annotation.RegisterFunction\n"
        "\n"
        "@RegisterClass\n"
        "class %CLASS% : %BASE%() {\n"
        "\n"
        "    // Declare member variables here. Examples:\n"
        "    // val a = 2;\n"
        "    // val b = \"text\";\n"
        "\n"
        "    // Called when the node enters the scene tree for the first time.\n"
        "    @RegisterFunction\n"
        "    override fun _ready() {\n"
        "        \n"
        "    }\n"
        "\n"
        "    // Called every frame. 'delta' is the elapsed time since the previous frame.\n"
        "    @RegisterFunction\n"
        "    override fun _process(delta: Double) {\n"
        "        \n"
        "    }\n"
        "}\n"
    };
    kotlinClassTemplate = kotlinClassTemplate.replace("%BASE%", p_base_class_name).replace("%CLASS%", p_class_name);
    Ref<KotlinScript> script;
    script.instance();
    script->set_source_code(kotlinClassTemplate);
    script->set_name(p_class_name);
    return script;
}

void KotlinLanguage::make_template(const String& p_class_name, const String& p_base_class_name, Ref<Script>& p_script) {
    p_script->set_source_code(
            p_script->get_source_code()
            .replace("%BASE%", p_base_class_name)
            .replace("%CLASS%", p_class_name)
            .replace("%TS%", GODOT_KOTLIN_IDENTATION)
    );
}

bool KotlinLanguage::is_using_templates() {
    return true;
}

bool KotlinLanguage::validate(const String &p_script, int &r_line_error, int &r_col_error, String &r_test_error,
                              const String &p_path, List<String> *r_functions, List<Warning> *r_warnings,
                              Set<int> *r_safe_lines) const {
    return true;
}

String KotlinLanguage::validate_path(const String& p_path) const {
    List<String> keywords;
    get_reserved_words(&keywords);
    if (keywords.find(p_path.get_file().get_basename())) {
        return TTR("Please don't use reserved keywords as file name.");
    }
    return "";
}

Script* KotlinLanguage::create_script() const {
    return memnew(KotlinScript);
}

bool KotlinLanguage::has_named_classes() const {
    return false;
}

bool KotlinLanguage::supports_builtin_mode() const {
    return false;
}

bool KotlinLanguage::can_inherit_from_file() {
    return ScriptLanguage::can_inherit_from_file();
}

int KotlinLanguage::find_function(const String& p_function, const String& p_code) const {
    return 0;
}

String KotlinLanguage::make_function(const String& p_class, const String& p_name, const PoolStringArray& p_args) const {
    //TODO : need to think about how to get arguments types.
    return String();
}

Error KotlinLanguage::open_in_external_editor(const Ref<Script>& p_script, int p_line, int p_col) {
    return ScriptLanguage::open_in_external_editor(p_script, p_line, p_col);
}

bool KotlinLanguage::overrides_external_editor() {
    return ScriptLanguage::overrides_external_editor();
}

Error KotlinLanguage::complete_code(const String& p_code, const String& p_path, Object* p_owner,
                                    List<ScriptCodeCompletionOption>* r_options, bool& r_force, String& r_call_hint) {
    return ScriptLanguage::complete_code(p_code, p_path, p_owner, r_options, r_force, r_call_hint);
}

Error KotlinLanguage::lookup_code(const String& p_code, const String& p_symbol, const String& p_path, Object* p_owner,
                                  ScriptLanguage::LookupResult& r_result) {
    return ScriptLanguage::lookup_code(p_code, p_symbol, p_path, p_owner, r_result);
}

void KotlinLanguage::auto_indent_code(String& p_code, int p_from_line, int p_to_line) const {

}

void KotlinLanguage::add_global_constant(const StringName& p_variable, const Variant& p_value) {

}

void KotlinLanguage::add_named_global_constant(const StringName& p_name, const Variant& p_value) {
    ScriptLanguage::add_named_global_constant(p_name, p_value);
}

void KotlinLanguage::remove_named_global_constant(const StringName& p_name) {
    ScriptLanguage::remove_named_global_constant(p_name);
}

void KotlinLanguage::thread_enter() {
    ScriptLanguage::thread_enter();
}

void KotlinLanguage::thread_exit() {
    ScriptLanguage::thread_exit();
}

String KotlinLanguage::debug_get_error() const {
    return String();
}

int KotlinLanguage::debug_get_stack_level_count() const {
    return 0;
}

int KotlinLanguage::debug_get_stack_level_line(int p_level) const {
    return 0;
}

String KotlinLanguage::debug_get_stack_level_function(int p_level) const {
    return String();
}

String KotlinLanguage::debug_get_stack_level_source(int p_level) const {
    return String();
}

void KotlinLanguage::debug_get_stack_level_locals(int p_level, List<String>* p_locals, List<Variant>* p_values,
                                                  int p_max_subitems, int p_max_depth) {

}

void KotlinLanguage::debug_get_stack_level_members(int p_level, List<String>* p_members, List<Variant>* p_values,
                                                   int p_max_subitems, int p_max_depth) {

}

ScriptInstance* KotlinLanguage::debug_get_stack_level_instance(int p_level) {
    return ScriptLanguage::debug_get_stack_level_instance(p_level);
}

void KotlinLanguage::debug_get_globals(List<String>* p_globals, List<Variant>* p_values, int p_max_subitems,
                                       int p_max_depth) {

}

String KotlinLanguage::debug_parse_stack_level_expression(int p_level, const String& p_expression, int p_max_subitems,
                                                          int p_max_depth) {
    return String();
}

Vector<ScriptLanguage::StackInfo> KotlinLanguage::debug_get_current_stack_info() {
    return ScriptLanguage::debug_get_current_stack_info();
}

void KotlinLanguage::reload_all_scripts() {

}

void KotlinLanguage::reload_tool_script(const Ref<Script>& p_script, bool p_soft_reload) {

}

void KotlinLanguage::get_recognized_extensions(List<String>* p_extensions) const {
    p_extensions->push_back("kt");
}

void KotlinLanguage::get_public_functions(List<MethodInfo>* p_functions) const {

}

void KotlinLanguage::get_public_constants(List<Pair<String, Variant>>* p_constants) const {

}

void KotlinLanguage::profiling_start() {

}

void KotlinLanguage::profiling_stop() {

}

int KotlinLanguage::profiling_get_accumulated_data(ScriptLanguage::ProfilingInfo* p_info_arr, int p_info_max) {
    return 0;
}

int KotlinLanguage::profiling_get_frame_data(ScriptLanguage::ProfilingInfo* p_info_arr, int p_info_max) {
    return 0;
}

void* KotlinLanguage::alloc_instance_binding_data(Object* p_object) {
    return ScriptLanguage::alloc_instance_binding_data(p_object);
}

void KotlinLanguage::free_instance_binding_data(void* p_data) {
    ScriptLanguage::free_instance_binding_data(p_data);
}

void KotlinLanguage::refcount_incremented_instance_binding(Object* p_object) {
    ScriptLanguage::refcount_incremented_instance_binding(p_object);
}

bool KotlinLanguage::refcount_decremented_instance_binding(Object* p_object) {
    return ScriptLanguage::refcount_decremented_instance_binding(p_object);
}

void KotlinLanguage::frame() {
    ScriptLanguage::frame();
}

bool KotlinLanguage::handles_global_class_type(const String& p_type) const {
    return p_type == "KotlinScript";
}

String KotlinLanguage::get_global_class_name(const String& p_path, String* r_base_type, String* r_icon_path) const {
    if (p_path.begins_with(GODOT_ENTRY_PATH)) {
        return String();
    }

    if (KtClass* clazz{GDKotlin::get_instance().find_class(p_path)}) {
        if (r_base_type) {
            *r_base_type = clazz->base_godot_class;
        }

        return clazz->registered_class_name;
    }

    return String();
}
