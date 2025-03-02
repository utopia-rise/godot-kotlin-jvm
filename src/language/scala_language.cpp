#include "scala_language.h"

#include "names.h"
#include "script/language/scala_script.h"

#include <core/io/resource_loader.h>

constexpr const char* SCALA_TEMPLATE = PACKAGE_TEMPLATE
                                      "\n"
                                      "\n"
                                      "import " GODOT_KOTLIN_PACKAGE "." BASE_TEMPLATE "\n"
                                      "import godot.annotation.{RegisterClass, RegisterFunction}\n"
                                      "\n"
                                      "@RegisterClass\n"
                                      "class " CLASS_TEMPLATE " extends " BASE_TEMPLATE " {\n"
                                      "\n"
                                      "    // Declare member variables here. Examples:\n"
                                      "    // val a: Int = 2;\n"
                                      "    // val b: String = \"text\";\n"
                                      "\n"
                                      "    // Called when the node enters the scene tree for the first time.\n"
                                      "    @RegisterFunction\n"
                                      "    override def _ready(): Unit = {\n"
                                      "        \n"
                                      "    }\n"
                                      "\n"
                                      "    // Called every frame. 'delta' is the elapsed time since the previous frame.\n"
                                      "    @RegisterFunction\n"
                                      "    override def _process(double delta): Unit = {\n"
                                      "        \n"
                                      "    }\n"
                                      "}\n";

ScalaLanguage* ScalaLanguage::get_instance() {
    static ScalaLanguage* instance {memnew(ScalaLanguage)};
    return instance;
}

String ScalaLanguage::get_name() const {
    return GODOT_SCALA_LANGUAGE_NAME;
}

String ScalaLanguage::get_type() const {
    return GODOT_SCALA_SCRIPT_NAME;
}

String ScalaLanguage::get_extension() const {
    return GODOT_SCALA_SCRIPT_EXTENSION;
}

void ScalaLanguage::get_recognized_extensions(List<String>* p_extensions) const {
    p_extensions->push_back(GODOT_SCALA_SCRIPT_EXTENSION);
}

void ScalaLanguage::get_reserved_words(List<String>* p_words) const {
    static const char* _reserved_words[] = {
            "abstract",
            "case",
            "catch",
            "class",
            "def",
            "do",
            "else",
            "extends",
            "false",
            "final",
            "finally",
            "for",
            "forSome",
            "if",
            "implicit",
            "import",
            "lazy",
            "match",
            "new",
            "null",
            "object",
            "override",
            "package",
            "private",
            "protected",
            "return",
            "sealed",
            "super",
            "this",
            "throw",
            "trait",
            "try",
            "true",
            "type",
            "val",
            "var",
            "while",
            "with",
            "yield",
            nullptr
    };

    const char** w = _reserved_words;

    while (*w) {
        p_words->push_back(*w);
        w++;
    }
}

bool ScalaLanguage::is_control_flow_keyword(const String& p_keyword) const {
    return p_keyword == "break" || p_keyword == "catch" || p_keyword == "continue" || p_keyword == "do"
           || p_keyword == "else" || p_keyword == "finally" || p_keyword == "for" || p_keyword == "if" || p_keyword == "return"
           || p_keyword == "match" || p_keyword == "throw" || p_keyword == "try" || p_keyword == "while" || p_keyword == "yield";
}

void ScalaLanguage::get_comment_delimiters(List<String>* p_delimiters) const {
    p_delimiters->push_back("//");
    p_delimiters->push_back("/* */");
}

void ScalaLanguage::get_doc_comment_delimiters(List<String>* p_delimiters) const {
    p_delimiters->push_back("/** */");
}

void ScalaLanguage::get_string_delimiters(List<String>* p_delimiters) const {
    p_delimiters->push_back("' '");
    p_delimiters->push_back("\" \"");
    p_delimiters->push_back("\"\"\" \"\"\"");
}

Ref<Script> ScalaLanguage::make_template(const String& p_template, const String& p_class_name, const String& p_base_class_name) const {
    Ref<ScalaScript> scala_script;
    scala_script.instantiate();
    String processed_template {p_template.replace(CLASS_TEMPLATE, p_class_name.to_pascal_case())};
    scala_script->set_source_code(processed_template);
    scala_script->set_name(p_class_name);
    return scala_script;
}

Vector<ScriptLanguage::ScriptTemplate> ScalaLanguage::get_built_in_templates(const StringName& p_object) {
    Vector<ScriptLanguage::ScriptTemplate> templates;
    if (ClassDB::is_parent_class(p_object, "Node")) {
        ScriptLanguage::ScriptTemplate script_template {
                String(p_object),
                String("Default"),
                String("Base template for Node based scripts with default Godot cycle methods"),
                String(SCALA_TEMPLATE).replace(BASE_TEMPLATE, p_object)
        };
        templates.append(script_template);
    }
    return templates;
}

bool ScalaLanguage::is_using_templates() {
    return true;
}

Script* ScalaLanguage::create_script() const {
    return memnew(ScalaScript);
}

bool ScalaLanguage::has_named_classes() const {
    return false;
}

bool ScalaLanguage::supports_builtin_mode() const {
    return false;
}

String ScalaLanguage::get_global_class_name(const String& p_path, String* r_base_type, String* r_icon_path) const {
    return {};
}

bool ScalaLanguage::handles_global_class_type(const String& p_type) const {
    return false;
}
