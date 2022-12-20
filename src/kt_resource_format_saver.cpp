#include "kt_resource_format_saver.h"

#include "kotlin_language.h"
#include "kotlin_script.h"

void KtResourceFormatSaver::get_recognized_extensions(const Ref<Resource>& p_resource, List<String>* p_extensions) const {
    if (Object::cast_to<KotlinScript>(p_resource.ptr())) {
        KotlinLanguage::get_instance().get_recognized_extensions(p_extensions);
    }
}

bool KtResourceFormatSaver::recognize(const Ref<Resource>& p_resource) const {
    return Object::cast_to<KotlinScript>(p_resource.ptr()) != nullptr;
}

Error KtResourceFormatSaver::save(const Ref<Resource>& p_resource, const String& p_path, uint32_t p_flags) {
    Ref<KotlinScript> script = p_resource;
    ERR_FAIL_COND_V(script.is_null(), ERR_INVALID_PARAMETER);
    String source = script->get_source_code();
    Error err;
    Ref<FileAccess> file {FileAccess::open(p_path, FileAccess::WRITE, &err)};
    JVM_ERR_FAIL_COND_V_MSG(err != OK, err, "Cannot save Kotlin script file '" + p_path + "'.");
    file->store_string(source);

    if (file->get_error() != OK && file->get_error() != ERR_FILE_EOF) { return ERR_CANT_CREATE; }

    return OK;
}
