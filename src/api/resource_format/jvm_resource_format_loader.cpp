#include "jvm_resource_format_loader.h"

#include "hash.h"
#include "api/language/names.h"
#include "api/script/jvm_script.h"
#include "api/script/jvm_script_manager.h"
#include "api/script/language/gdj_script.h"
#include "api/script/language/java_script.h"
#include "api/script/language/kotlin_script.h"
#include "api/script/language/scala_script.h"

void JvmResourceFormatLoader::get_recognized_extensions(List<String>* p_extensions) const {
    p_extensions->push_back(GODOT_JVM_REGISTRATION_FILE_EXTENSION);
    p_extensions->push_back(GODOT_KOTLIN_SCRIPT_EXTENSION);
    p_extensions->push_back(GODOT_JAVA_SCRIPT_EXTENSION);
    p_extensions->push_back(GODOT_SCALA_SCRIPT_EXTENSION);
}

String JvmResourceFormatLoader::get_resource_type(const String& p_path) const {
    String ext = p_path.get_extension().to_lower();

    if (ext == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        return GODOT_JVM_SCRIPT_NAME;
    } else if (ext == GODOT_KOTLIN_SCRIPT_EXTENSION) {
        return GODOT_KOTLIN_SCRIPT_NAME;
    } else if (ext == GODOT_JAVA_SCRIPT_EXTENSION) {
        return GODOT_JAVA_SCRIPT_NAME;
    } else if (ext == GODOT_SCALA_SCRIPT_EXTENSION) {
        return GODOT_SCALA_SCRIPT_NAME;
    }
    return "";
}

bool JvmResourceFormatLoader::handles_type(const String& p_type) const {
    return p_type == "Script"
           || p_type == GODOT_JVM_SCRIPT_NAME
           || p_type == GODOT_KOTLIN_SCRIPT_NAME
           || p_type == GODOT_JAVA_SCRIPT_NAME
           || p_type == GODOT_SCALA_SCRIPT_NAME;
}

Error JvmResourceFormatLoader::read_all_file_utf8(const String& p_path, String& r_content) {
    Vector<uint8_t> source_file;
    Error err;
    Ref<FileAccess> file_access {FileAccess::open(p_path, FileAccess::READ, &err)};
    JVM_ERR_FAIL_COND_V_MSG(err != OK, err, "Cannot open file '" + p_path + "'.");

    const String source = file_access->get_as_utf8_string();
    if (!source.is_valid_string()) { ERR_FAIL_V(ERR_INVALID_DATA); }

    r_content = source;
    return OK;
}

Ref<Resource> JvmResourceFormatLoader::load(const String& p_path, const String& p_original_path, Error* r_error, bool p_use_sub_threads, float* r_progress, CacheMode p_cache_mode) {
    Ref<JvmScript> jvm_script;

    String extension = p_path.get_extension();
    bool script_is_new = true;
    bool is_source;
    if (extension == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_named_script<GdjScript>(p_path, &script_is_new);
        is_source = false;
    } else if (extension == GODOT_KOTLIN_SCRIPT_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_source_script<KotlinScript>(p_path, &script_is_new, r_error);
        is_source = true;
    } else if (extension == GODOT_JAVA_SCRIPT_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_source_script<JavaScript>(p_path, &script_is_new, r_error);
        is_source = true;
    } else if (extension == GODOT_SCALA_SCRIPT_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_source_script<ScalaScript>(p_path, &script_is_new, r_error);
    } else {
        if (r_error) { *r_error = Error::ERR_FILE_UNRECOGNIZED; }
        return nullptr;
    }

    if (jvm_script.is_valid()) {
#ifdef TOOLS_ENABLED
        if (!script_is_new && is_source) {
            MessageQueue::get_singleton()->push_callable(
              callable_mp(JvmScriptManager::get_instance(), &JvmScriptManager::invalidate_source).bind(Ref<SourceScript>(jvm_script))
            );
        }
#endif
    } else {
        if (r_error) { *r_error = Error::ERR_UNAVAILABLE; }
    }

    return jvm_script;
}

ResourceUID::ID JvmResourceFormatLoader::get_resource_uid(const String& p_path) const {
    String extension = p_path.get_extension();
    ResourceUID::ID id = ResourceUID::INVALID_ID;
    if (extension == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        id = (JvmScript::get_script_file_name(p_path) + UUID_HASH_SEED).hash64();
        id &= 0x7FFFFFFFFFFFFFFF;
    } else if (extension == GODOT_KOTLIN_SCRIPT_EXTENSION || extension == GODOT_JAVA_SCRIPT_EXTENSION || extension == GODOT_SCALA_SCRIPT_EXTENSION) {
        String source;
        Error error;
        id = (String(SourceScript::parse_source_to_fqdn(p_path, source, &error)) + UUID_HASH_SEED).hash64();
        id &= 0x7FFFFFFFFFFFFFFF;
    }
    return id;
}

bool JvmResourceFormatLoader::has_custom_uid_support() const {
    return true;
}
