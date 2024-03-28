#include "jvm_resource_format_saver.h"

#include "godotkotlin_defs.h"
#include "kotlin_script.h"
#include "language/kotlin_language.h"

void JvmResourceFormatSaver::get_recognized_extensions(const Ref<Resource>& p_resource, List<String>* p_extensions) const {
    if (recognize(p_resource)) {
        p_extensions->push_back(GODOT_KOTLIN_SCRIPT_EXTENSION);
        p_extensions->push_back(GODOT_JVM_REGISTRATION_FILE_EXTENSION);
    }
}

bool JvmResourceFormatSaver::recognize(const Ref<Resource>& p_resource) const {
    return Object::cast_to<KotlinScript>(p_resource.ptr()) != nullptr;
}

Error JvmResourceFormatSaver::save(const Ref<Resource>& p_resource, const String& p_path, uint32_t p_flags) {
    Ref<KotlinScript> kotlin_script = p_resource;
    ERR_FAIL_COND_V(kotlin_script.is_null(), ERR_INVALID_PARAMETER);

    String package {p_path.replace("src/main/kotlin/", "")
                      .trim_prefix("res://")
                      .trim_suffix(kotlin_script->get_name() + "." + KotlinLanguage::get_instance()->get_extension())
                      .trim_suffix("/")
                      .replace("/", ".")};

    if (!package.is_empty()) { package = "package " + package; }

    String source = kotlin_script->get_source_code().replace("%PACKAGE%", package).strip_edges(true, false);

    if (!FileAccess::exists(p_path) && p_path.get_extension() == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        LOG_WARNING("It's not recommended to create .gdj files directly as they are generated automatically from .kt "
                    "sources when building your project.\n"
                    "Create a .kt with a matching registered class if you don't want this file to get deleted the next "
                    "time you build.");
    }

    Error err;
    Ref<FileAccess> file {FileAccess::open(p_path, FileAccess::WRITE, &err)};
    JVM_ERR_FAIL_COND_V_MSG(err != OK, err, "Cannot save Kotlin script file '" + p_path + "'.");
    file->store_string(source);

    if (file->get_error() != OK && file->get_error() != ERR_FILE_EOF) { return ERR_CANT_CREATE; }

    return OK;
}
