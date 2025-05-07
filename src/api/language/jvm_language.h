#ifndef KOTLIN_JVM_LANGUAGE_H
#define KOTLIN_JVM_LANGUAGE_H

#include "classes/script_language_extension.hpp"

namespace godot {
    class JvmLanguage : public ScriptLanguageExtension {
    public:
        Dictionary _validate(
          const String &p_script,
          const String &p_path,
          bool p_validate_functions,
          bool p_validate_errors,
          bool p_validate_warnings,
          bool p_validate_safe_lines
        ) const override;
        String _validate_path(const String& p_path) const override;

        // Dummy Implementations
        bool _supports_documentation() const override;
        Error _open_in_external_editor(const Ref<Script>& p_script, int p_line, int p_col) override;

        String _auto_indent_code(const String &p_code, int32_t p_from_line, int32_t p_to_line) const override;
    };
}
#endif// KOTLIN_JVM_LANGUAGE_H
