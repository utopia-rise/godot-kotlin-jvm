#ifndef GODOT_JVM_GDJ_LANGUAGE_H
#define GODOT_JVM_GDJ_LANGUAGE_H

#include "jvm_language.h"

class GdjLanguage : public JvmLanguage {
public:
    GdjLanguage() = default;
    ~GdjLanguage() override = default;
    GdjLanguage(const GdjLanguage&) = delete;
    void operator=(const GdjLanguage&) = delete;

    static GdjLanguage* get_instance();

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
};

#endif// GODOT_JVM_GDJ_LANGUAGE_H
