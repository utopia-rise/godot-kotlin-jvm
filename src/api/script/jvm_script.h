#ifndef GODOT_JVM_JVM_SCRIPT_H
#define GODOT_JVM_JVM_SCRIPT_H

#include "jvm/wrapper/registration/kt_class.h"
#include "jvm_placeholder_instance.h"
#include "templates/hash_set.hpp"

#include <classes/script_extension.hpp>
#include <classes/script_language_extension.hpp>

namespace godot {

    class JvmInstance;

    class JvmScript : public ScriptExtension {
        GDCLASS(JvmScript, ScriptExtension);

        friend class JvmInstance;
        friend class JvmScriptManager;

    protected:
        KtClass* kotlin_class;
        String source;

        Object* _object_create();

    public:
        JvmScript();
        ~JvmScript() override;

        Variant _new();
        bool _can_instantiate() const override;
        bool _inherits_script(const Ref<Script>& p_script) const override;
        Ref<Script> _get_base_script() const override;
        StringName _get_instance_base_type() const override;
        void* _instance_create(Object* p_this) const override;
        bool _instance_has(Object* p_this) const override;
        bool _has_source_code() const override;
        String _get_source_code() const override;
        void _set_source_code(const String& p_code) override;
        Error _reload(bool p_keep_state) override;
        bool _has_method(const StringName& p_method) const override;
        Dictionary _get_method_info(const StringName& p_method) const override;
        bool _is_tool() const override;
        bool _is_valid() const override;
        bool _is_placeholder_fallback_enabled() const override;
        bool _is_abstract() const override;
        bool _has_script_signal(const StringName& p_signal) const override;
        TypedArray<Dictionary> _get_script_signal_list() const override;
        Variant _get_property_default_value(const StringName& p_property) const override;
        TypedArray<Dictionary> _get_script_method_list() const override;
        TypedArray<Dictionary> _get_script_property_list() const override;
        void get_script_exported_property_list(List<PropertyInfo>* p_list) const;
        Variant _get_rpc_config() const override;

        _FORCE_INLINE_ static String get_script_file_name(const String& path) {
            return path.get_file().trim_suffix(path.get_extension()).trim_suffix(".");
        }

#ifdef TOOLS_ENABLED
        // This concerns placeholders script instances only

    private:
        mutable HashMap<GDExtensionScriptInstancePtr, JvmPlaceHolderInstance::JvmPlaceHolderInstanceData*> placeholders;
        HashMap<StringName, Variant> exported_members_default_value_cache;
        double last_time_source_modified = 0;
        bool export_dirty_flag = true;

        void _get_script_property_info_list(List<PropertyInfo>* p_list) const;

    public:
        void* _placeholder_instance_create(Object* p_this) const override;
        double get_last_time_source_modified() const;
        void set_last_time_source_modified(double p_time);

        TypedArray<Dictionary> _get_documentation() const override;
        String _get_class_icon_path() const override;
        StringName _get_doc_class_name() const override;

        void update_script_exports();

        void _placeholder_erased(void* p_placeholder) override;
        virtual void _format_template(const String& p_path);
#endif

    protected:
        static void _bind_methods();
    };

    class SourceScript : public JvmScript {
        GDCLASS(SourceScript, JvmScript)
        friend class JvmScriptManager;

    public:
        SourceScript() = default;
        ~SourceScript() override = default;
        StringName get_functional_name() const;
        StringName _get_global_name() const override;
        static StringName parse_source_to_fqdn(const String& p_path, String& r_source, Error* r_error);

    protected:
        static constexpr const char* PACKAGE_KEYWORD = "package";
        static constexpr const char* CLASS_KEYWORD = "class";
        static constexpr const char* REGISTER_CLASS_ANNOTATION = "@RegisterClass";
        static bool is_whitespace_or_linebreak(char32_t character);
        static bool is_package_end(char32_t character);
        static bool is_class_name_end(char32_t character);
        static bool skip_spaces_and_newlines(const String& source, int64_t& start_index);
        static bool skip_comments(const String& source, const String& p_path, int64_t& start_index);

    private:
        StringName _functional_name;
    };

    class NamedScript : public JvmScript {
        GDCLASS(NamedScript, JvmScript)
    public:
        NamedScript() = default;
        ~NamedScript() override;
        StringName _get_global_name() const override;
    };
} // namespace godot
#endif // GODOT_JVM_JVM_SCRIPT_H
