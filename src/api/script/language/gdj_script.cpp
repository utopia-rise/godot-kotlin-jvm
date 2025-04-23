#include "gdj_script.h"

#include "language/gdj_language.h"

ScriptLanguage* GdjScript::get_language() const {
    return GdjLanguage::get_instance();
}

void GdjScript::set_path(const String& p_path, bool p_take_over) {
    Resource::set_path(p_path, p_take_over);
}

void GdjScript::_bind_methods() {}