#include "java_language.h"

#include "names.h"
#include "script/language/java_script.h"

#include <core/io/resource_loader.h>

constexpr const char* JAVA_TEMPLATE = PACKAGE_TEMPLATE
  "\n"
  "\n"
  "import " GODOT_KOTLIN_PACKAGE "." BASE_TEMPLATE ";\n"
  "import godot.annotation.RegisterClass;\n"
  "import godot.annotation.RegisterFunction;\n"
  "\n"
  "@RegisterClass\n"
  "public class " CLASS_TEMPLATE " extends " BASE_TEMPLATE " {\n"
  "\n"
  "    // Declare member variables here. Examples:\n"
  "    // private int a = 2;\n"
  "    // private String b = \"text\";\n"
  "\n"
  "    // Called when the node enters the scene tree for the first time.\n"
  "    @RegisterFunction\n"
  "    @Override\n"
  "    public void _ready() {\n"
  "        \n"
  "    }\n"
  "\n"
  "    // Called every frame. 'delta' is the elapsed time since the previous frame.\n"
  "    @RegisterFunction\n"
  "    @Override\n"
  "    public void _process(double delta) {\n"
  "        \n"
  "    }\n"
  "}\n";

JavaLanguage* JavaLanguage::get_instance() {
    static JavaLanguage* instance {memnew(JavaLanguage)};
    return instance;
}

String JavaLanguage::get_name() const {
    return GODOT_JAVA_LANGUAGE_NAME;
}

String JavaLanguage::get_type() const {
    return GODOT_JAVA_SCRIPT_NAME;
}

String JavaLanguage::get_extension() const {
    return GODOT_JAVA_SCRIPT_EXTENSION;
}

void JavaLanguage::get_recognized_extensions(List<String>* p_extensions) const {
    p_extensions->push_back(GODOT_JAVA_SCRIPT_EXTENSION);
}

void JavaLanguage::get_reserved_words(List<String>* p_words) const {
    static const char* _reserved_words[] = {
                                            "abstract",
                                            "assert",
                                            "boolean",
                                            "break",
                                            "byte",
                                            "case",
                                            "catch",
                                            "char",
                                            "class",
                                            "const",
                                            "continue",
                                            "default",
                                            "do",
                                            "double",
                                            "else",
                                            "enum",
                                            "extends",
                                            "final",
                                            "finally",
                                            "float",
                                            "for",
                                            "if",
                                            "implements",
                                            "import",
                                            "instanceof",
                                            "int",
                                            "interface",
                                            "long",
                                            "native",
                                            "new",
                                            "package",
                                            "private",
                                            "protected",
                                            "public",
                                            "return",
                                            "short",
                                            "static",
                                            "strictfp",
                                            "super",
                                            "switch",
                                            "synchronized",
                                            "this",
                                            "throw",
                                            "throws",
                                            "transient",
                                            "try",
                                            "void",
                                            "volatile",
                                            "while",
                                            nullptr
    };

    const char** w = _reserved_words;

    while (*w) {
        p_words->push_back(*w);
        w++;
    }
}

bool JavaLanguage::is_control_flow_keyword(const String& p_keyword) const {
    return p_keyword == "break" || p_keyword == "catch" || p_keyword == "continue" || p_keyword == "do"
        || p_keyword == "else" || p_keyword == "finally" || p_keyword == "for" || p_keyword == "if" || p_keyword == "return"
        || p_keyword == "when" || p_keyword == "throw" || p_keyword == "try" || p_keyword == "while";
}

void JavaLanguage::get_comment_delimiters(List<String>* p_delimiters) const {
    p_delimiters->push_back("//");
    p_delimiters->push_back("/* */");
}

void JavaLanguage::get_doc_comment_delimiters(List<String>* p_delimiters) const {
    p_delimiters->push_back("/** */");
}

void JavaLanguage::get_string_delimiters(List<String>* p_delimiters) const {
    p_delimiters->push_back("' '");
    p_delimiters->push_back("\" \"");
}

Ref<Script> JavaLanguage::make_template(const String& p_template, const String& p_class_name, const String& p_base_class_name) const {
    Ref<JavaScript> java_script;
    java_script.instantiate();
    String processed_template {p_template.replace(CLASS_TEMPLATE, p_class_name.to_pascal_case())};
    java_script->set_source_code(processed_template);
    java_script->set_name(p_class_name);
    return java_script;
}

Vector<ScriptLanguage::ScriptTemplate> JavaLanguage::get_built_in_templates(const StringName& p_object) {
    Vector<ScriptLanguage::ScriptTemplate> templates;
    if (ClassDB::is_parent_class(p_object, "Node")) {
        ScriptLanguage::ScriptTemplate script_template {
          String(p_object),
          String("Default"),
          String("Base template for Node based scripts with default Godot cycle methods"),
          String(JAVA_TEMPLATE).replace(BASE_TEMPLATE, p_object)
        };
        templates.append(script_template);
    }
    return templates;
}

bool JavaLanguage::is_using_templates() {
    return true;
}

Script* JavaLanguage::create_script() const {
    return memnew(JavaScript);
}

bool JavaLanguage::has_named_classes() const {
    return false;
}

bool JavaLanguage::supports_builtin_mode() const {
    return false;
}

String JavaLanguage::get_global_class_name(const String& p_path, String* r_base_type, String* r_icon_path, bool *r_is_abstract, bool *r_is_too) const {
    return {};
}

bool JavaLanguage::handles_global_class_type(const String& p_type) const {
    return false;
}