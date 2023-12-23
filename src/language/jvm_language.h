#ifndef KOTLIN_JVM_LANGUAGE_H
#define KOTLIN_JVM_LANGUAGE_H

#include "core/object/script_language.h"

class JvmLanguage : public ScriptLanguage {
public:
    JvmLanguage();
    ~JvmLanguage() override = default;
    JvmLanguage(const JvmLanguage&) = delete;
    void operator=(const JvmLanguage&) = delete;

    static JvmLanguage* get_instance();

    String get_extension() const override;
    String get_name() const override;
    String get_type() const override;

    void get_recognized_extensions(List<String>* p_extensions) const override;


    String get_template(const String& p_class_name, const String& p_base_class_name) const;

    Ref<Script> make_template(const String& p_template, const String& p_class_name, const String& p_base_class_name) const override;

    Vector<ScriptTemplate> get_built_in_templates(StringName p_object) override;

    bool is_using_templates() override;

    Script* create_script() const override;

    bool has_named_classes() const override;

    bool supports_builtin_mode() const override;


    void thread_enter() override;

    void thread_exit() override;

    void frame() override;

    void reload_all_scripts() override;

    void reload_tool_script(const Ref<Script>& p_script, bool p_soft_reload) override;




    bool handles_global_class_type(const String& p_type) const override;

    String get_global_class_name(const String& p_path, String* r_base_type, String* r_icon_path) const override;
};

#endif// KOTLIN_JVM_LANGUAGE_H

