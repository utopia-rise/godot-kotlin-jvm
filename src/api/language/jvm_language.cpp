#include "jvm_language.h"

#include "engine/ustring.h"

using namespace godot;

Dictionary JvmLanguage::_validate(
  const String &p_script,
  const String &p_path,
  bool p_validate_functions,
  bool p_validate_errors,
  bool p_validate_warnings,
  bool p_validate_safe_lines
) const {
    Dictionary ret;
    ret["valid"] = true;
    return ret;
}

String JvmLanguage::_validate_path(const String& p_path) const {
    PackedStringArray keywords = _get_reserved_words();
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

Error JvmLanguage::_open_in_external_editor(const Ref<Script>& p_script, int p_line, int p_col) {
    return Error::ERR_UNAVAILABLE;
}

String JvmLanguage::_auto_indent_code(const String &p_code, int32_t p_from_line, int32_t p_to_line) const {
    return p_code;
}

// TODO: Dummy to make reloading work again because of https://github.com/godotengine/godot/issues/104540. Should still be truly implemented at some point
bool JvmLanguage::_supports_documentation() const {
    return true;
}
