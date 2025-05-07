#include "gdj_script.h"

#include "api/language/gdj_language.h"

using namespace godot;

ScriptLanguage* GdjScript::_get_language() const {
    return GdjLanguage::get_instance();
}

void GdjScript::_bind_methods() {}