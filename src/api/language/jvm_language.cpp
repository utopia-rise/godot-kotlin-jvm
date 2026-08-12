#include "jvm_language.h"

#include "engine/ustring.h"
#include "api/script/jvm_script.h"

#include <classes/resource_loader.hpp>

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
    if (keywords.find(p_path.get_file().get_basename()) != -1) {
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

Dictionary JvmLanguage::_get_global_class_name(const String& p_path) const {
    Ref<JvmScript> script = ResourceLoader::get_singleton()->load(p_path);
    if (script.is_null() || !script->_is_valid()) { return {}; }

    Dictionary result;
    Ref<Script> base_script = script->_get_base_script();
    result["base_type"] = base_script.is_valid() ? base_script->get_global_name() : script->_get_instance_base_type();
    result["is_abstract"] = script->_is_abstract();
    result["is_tool"] = script->_is_tool();
    result["name"] = script->_get_global_name();
    return result;
}

// Dummy Implementations

Error JvmLanguage::_open_in_external_editor(const Ref<Script>& p_script, int p_line, int p_col) {
    return Error::ERR_UNAVAILABLE;
}

bool JvmLanguage::_overrides_external_editor() {
    return false;
}

String JvmLanguage::_auto_indent_code(const String &p_code, int32_t p_from_line, int32_t p_to_line) const {
    return p_code;
}

void JvmLanguage::_init() {}
void JvmLanguage::_frame() {}
void JvmLanguage::_finish() {}
void JvmLanguage::_thread_enter() {}
void JvmLanguage::_thread_exit() {}
TypedArray<Dictionary> JvmLanguage::_debug_get_current_stack_info() { return {}; }
Dictionary JvmLanguage::_debug_get_stack_level_locals(int32_t, int32_t, int32_t) { return {}; }
Dictionary JvmLanguage::_debug_get_stack_level_members(int32_t, int32_t, int32_t) { return {}; }
Dictionary JvmLanguage::_debug_get_globals(int32_t, int32_t) { return {}; }
void JvmLanguage::_reload_all_scripts() {}
void JvmLanguage::_add_global_constant(const StringName&, const Variant&) {}
void JvmLanguage::_add_named_global_constant(const StringName&, const Variant&) {}
TypedArray<Dictionary> JvmLanguage::_get_public_functions() const { return {}; }
Dictionary JvmLanguage::_get_public_constants() const { return {}; }
TypedArray<Dictionary> JvmLanguage::_get_public_annotations() const { return {}; }

// TODO: Dummy to make reloading work again because of https://github.com/godotengine/godot/issues/104540. Should still be truly implemented at some point
bool JvmLanguage::_supports_documentation() const {
    return true;
}
