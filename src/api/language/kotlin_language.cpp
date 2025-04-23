#include "kotlin_language.h"

#include "names.h"
#include "api/script/language/kotlin_script.h"

#include <core/io/resource_loader.hpp>

constexpr const char* KOTLIN_TEMPLATE = PACKAGE_TEMPLATE
  "\n"
  "\n"
  "import " GODOT_KOTLIN_PACKAGE "." BASE_TEMPLATE "\n"
  "import godot.annotation.RegisterClass\n"
  "import godot.annotation.RegisterFunction\n"
  "\n"
  "@RegisterClass\n"
  "class " CLASS_TEMPLATE ": " BASE_TEMPLATE "() {\n"
  "\n"
  "    // Declare member variables here. Examples:\n"
  "    // val a = 2\n"
  "    // val b = \"text\"\n"
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
  "}\n";

KotlinLanguage* KotlinLanguage::get_instance() {
    static KotlinLanguage* instance {memnew(KotlinLanguage)};
    return instance;
}

String KotlinLanguage::get_name() const {
    return GODOT_KOTLIN_LANGUAGE_NAME;
}

String KotlinLanguage::get_type() const {
    return GODOT_KOTLIN_SCRIPT_NAME;
}

String KotlinLanguage::get_extension() const {
    return GODOT_KOTLIN_SCRIPT_EXTENSION;
}

void KotlinLanguage::get_recognized_extensions(List<String>* p_extensions) const {
    p_extensions->push_back(GODOT_KOTLIN_SCRIPT_EXTENSION);
}

Vector<String> KotlinLanguage::get_reserved_words() const {
    static const Vector<String> ret = {// RESERVED KEYWORDS
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
        // SOFT KEYWORDS
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
        // MODIFIERS KEYWORDS
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
        // SPECIAL IDENTIFIERS
        "it",
    };

    return ret;
}

bool KotlinLanguage::is_control_flow_keyword(const String& p_keyword) const {
    return p_keyword == "break" || p_keyword == "catch" || p_keyword == "continue" || p_keyword == "do"
        || p_keyword == "else" || p_keyword == "finally" || p_keyword == "for" || p_keyword == "if" || p_keyword == "return"
        || p_keyword == "when" || p_keyword == "throw" || p_keyword == "try" || p_keyword == "while";
}

Vector<String> KotlinLanguage::get_comment_delimiters() const {
    static const Vector<String> ret = {"//", "/* */"};
    return ret;
}

Vector<String> KotlinLanguage::get_doc_comment_delimiters() const {
    static const Vector<String> ret = {"/** */"};
    return ret;
}

Vector<String> KotlinLanguage::get_string_delimiters() const {
    static const Vector<String> ret = {"' '", "\" \""};
    return ret;
}

Ref<Script> KotlinLanguage::make_template(const String& p_template, const String& p_class_name, const String& p_base_class_name) const {
    Ref<KotlinScript> kotlin_script;
    kotlin_script.instantiate();
    String processed_template {p_template.replace(CLASS_TEMPLATE, p_class_name.to_pascal_case())};
    kotlin_script->set_source_code(processed_template);
    kotlin_script->set_name(p_class_name);
    return kotlin_script;
}

Vector<ScriptLanguage::ScriptTemplate> KotlinLanguage::get_built_in_templates(const StringName& p_object) {
    Vector<ScriptLanguage::ScriptTemplate> templates;
    if (ClassDB::is_parent_class(p_object, "Node")) {
        ScriptLanguage::ScriptTemplate script_template {
          String(p_object),
          String("Default"),
          String("Base template for Node based scripts with default Godot cycle methods"),
          String(KOTLIN_TEMPLATE).replace(BASE_TEMPLATE, p_object)
        };
        templates.append(script_template);
    }
    return templates;
}

bool KotlinLanguage::is_using_templates() {
    return true;
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

String KotlinLanguage::get_global_class_name(const String& p_path, String* r_base_type, String* r_icon_path, bool *r_is_abstract, bool *r_is_too) const {
    return {};
}

bool KotlinLanguage::handles_global_class_type(const String& p_type) const {
    return false;
}
