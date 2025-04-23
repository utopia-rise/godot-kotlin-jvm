#include "scala_script.h"
#include "language/names.h"
#include "language/scala_language.h"

ScriptLanguage* ScalaScript::get_language() const {
    return ScalaLanguage::get_instance();
}

void ScalaScript::set_path(const String& p_path, bool p_take_over) {
    if (source.contains(PACKAGE_TEMPLATE)) {
        String package {p_path.replace("src/main/scala/", "")
                                .trim_prefix("res://")
                                .trim_suffix(get_name() + "." + ScalaLanguage::get_instance()->get_extension())
                                .trim_suffix("/")
                                .replace("/", ".")};

        if (!package.is_empty()) { package = "package " + package + ";";}

        source = source.replace(PACKAGE_TEMPLATE, package).strip_edges(true, false);
    }
    Resource::set_path(p_path, p_take_over);
}

void ScalaScript::_bind_methods() {}
