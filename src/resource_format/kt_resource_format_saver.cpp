#include "kt_resource_format_saver.h"

#include "godotkotlin_defs.h"
#include "kotlin_language.h"
#include "kotlin_script.h"

void KtResourceFormatSaver::get_recognized_extensions(const Ref<Resource>& p_resource, List<String>* p_extensions) const {
    if (Object::cast_to<KotlinScript>(p_resource.ptr())) { p_extensions->push_back(GODOT_KOTLIN_REGISTRATION_FILE_EXTENSION); }
}

bool KtResourceFormatSaver::recognize(const Ref<Resource>& p_resource) const {
    return Object::cast_to<KotlinScript>(p_resource.ptr()) != nullptr;
}

Error KtResourceFormatSaver::save(const Ref<Resource>& p_resource, const String& p_path, uint32_t p_flags) {
    Ref<KotlinScript> kotlin_script = p_resource;
    ERR_FAIL_COND_V(kotlin_script.is_null(), ERR_INVALID_PARAMETER);

    String package {p_path.replace("src/main/kotlin/", "")
                      .trim_prefix("res://")
                      .trim_suffix(kotlin_script->get_name() + "." + KotlinLanguage::get_instance()->get_extension())
                      .trim_suffix("/")
                      .replace("/", ".")};

    if (!package.is_empty()) { package = "package " + package + "\n\n"; }

    String source = kotlin_script->get_source_code().replace("%PACKAGE%", package);

    Error err;
    Ref<FileAccess> file {FileAccess::open(p_path, FileAccess::WRITE, &err)};
    JVM_ERR_FAIL_COND_V_MSG(err != OK, err, "Cannot save Kotlin script file '" + p_path + "'.");
    file->store_string(source);

    if (file->get_error() != OK && file->get_error() != ERR_FILE_EOF) { return ERR_CANT_CREATE; }

    return OK;
}
