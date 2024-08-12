#ifndef GODOT_JVM_KOTLIN_LANGUAGE_H
#define GODOT_JVM_KOTLIN_LANGUAGE_H

#include "jvm_language.h"

#include <core/object/script_language.h>

class KotlinLanguage : public JvmLanguage {
public:
    KotlinLanguage() = default;
    ~KotlinLanguage() override = default;
    KotlinLanguage(const KotlinLanguage&) = delete;
    void operator=(const KotlinLanguage&) = delete;

    static KotlinLanguage* get_instance();

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
    bool is_control_flow_keyword(const String& p_keyword) const override;
    void get_comment_delimiters(List<String>* p_delimiters) const override;
    void get_doc_comment_delimiters(List<String>* p_delimiters) const override;
    void get_string_delimiters(List<String>* p_delimiters) const override;
    Ref<Script> make_template(const String& p_template, const String& p_class_name, const String& p_base_class_name) const override;
    Vector<ScriptTemplate> get_built_in_templates(const StringName& p_object) override;
    bool is_using_templates() override;
};

#endif// GODOT_JVM_KOTLIN_LANGUAGE_H
