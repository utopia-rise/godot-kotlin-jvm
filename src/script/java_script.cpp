#include "java_script.h"

#include "language/java_language.h"
#include "language/names.h"

ScriptLanguage* JavaScript::get_language() const {
    return JavaLanguage::get_instance();
}

void JavaScript::set_path(const String& p_path, bool p_take_over) {
    if (source.contains(PACKAGE_TEMPLATE)) {
        String package {p_path.replace("src/main/java/", "")
                          .trim_prefix("res://")
                          .trim_suffix(get_name() + "." + JavaLanguage::get_instance()->get_extension())
                          .trim_suffix("/")
                          .replace("/", ".")};

        if (!package.is_empty()) { package = "package " + package + ";";}

        source = source.replace(PACKAGE_TEMPLATE, package).strip_edges(true, false);
    }
    Resource::set_path(p_path, p_take_over);
}

void JavaScript::_bind_methods() {}