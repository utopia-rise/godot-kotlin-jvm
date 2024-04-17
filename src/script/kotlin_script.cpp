#include "kotlin_script.h"

#include "language/kotlin_language.h"
#include "language/names.h"

ScriptLanguage* KotlinScript::get_language() const {
    return KotlinLanguage::get_instance();
}

void KotlinScript::set_path(const String& p_path, bool p_take_over) {
    if (source.contains(PACKAGE_TEMPLATE)) {
        String package {p_path.replace("src/main/kotlin/", "")
                          .trim_prefix("res://")
                          .trim_suffix(get_name() + "." + KotlinLanguage::get_instance()->get_extension())
                          .trim_suffix("/")
                          .replace("/", ".")};

        if (!package.is_empty()) { package = "package " + package; }

        source = source.replace(PACKAGE_TEMPLATE, package).strip_edges(true, false);
    }
    Resource::set_path(p_path, p_take_over);
}

void KotlinScript::_bind_methods() {}