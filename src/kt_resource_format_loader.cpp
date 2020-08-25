#include "kt_resource_format_loader.h"
#include "kotlin_language.h"
#include "kotlin_script.h"

RES KtResourceFormatLoader::load(const String& p_path, const String& p_original_path, Error* r_error) {
    KotlinScript* script = memnew(KotlinScript);
    Ref<KotlinScript> ref(script);
    ref->set_path(p_original_path);
    ref->reload(false);

    if (r_error) {
        *r_error = OK;
    }
    return ref;
}

void KtResourceFormatLoader::get_recognized_extensions(List<String>* p_extensions) const {
    KotlinLanguage::get_instance().get_recognized_extensions(p_extensions);
}

bool KtResourceFormatLoader::handles_type(const String& p_type) const {
    return p_type == KotlinLanguage::get_instance().get_type();
}

String KtResourceFormatLoader::get_resource_type(const String& p_path) const {
    return p_path.get_extension().to_lower() == "kt" ? KotlinLanguage::get_instance().get_type() : "";
}
