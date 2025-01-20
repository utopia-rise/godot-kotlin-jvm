#include "jvm_resource_format_loader.h"

#include "language/names.h"
#include "script/jvm_script.h"
#include "script/jvm_script_manager.h"
#include "script/language/gdj_script.h"
#include "script/language/java_script.h"
#include "script/language/kotlin_script.h"

void JvmResourceFormatLoader::get_recognized_extensions(List<String>* p_extensions) const {
    p_extensions->push_back(GODOT_JVM_REGISTRATION_FILE_EXTENSION);
    p_extensions->push_back(GODOT_KOTLIN_SCRIPT_EXTENSION);
    p_extensions->push_back(GODOT_JAVA_SCRIPT_EXTENSION);
}

String JvmResourceFormatLoader::get_resource_type(const String& p_path) const {
    String ext = p_path.get_extension().to_lower();

    if (ext == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        return GODOT_JVM_SCRIPT_NAME;
    } else if (ext == GODOT_KOTLIN_SCRIPT_EXTENSION) {
        return GODOT_KOTLIN_SCRIPT_NAME;
    } else if (ext == GODOT_JAVA_SCRIPT_EXTENSION) {
        return GODOT_JAVA_SCRIPT_NAME;
    }
    return "";
}

bool JvmResourceFormatLoader::handles_type(const String& p_type) const {
    return p_type == "Script" || p_type == GODOT_KOTLIN_SCRIPT_NAME || p_type == GODOT_JVM_SCRIPT_NAME || p_type == GODOT_JAVA_SCRIPT_NAME;
}

#ifdef TOOLS_ENABLED
Error read_all_file_utf8(const String& p_path, String& r_content) {
    Vector<uint8_t> source_file;
    Error err;
    Ref<FileAccess> file_access {FileAccess::open(p_path, FileAccess::READ, &err)};
    JVM_ERR_FAIL_COND_V_MSG(err != OK, err, "Cannot open file '" + p_path + "'.");

    uint64_t len = file_access->get_length();
    source_file.resize(len + 1);
    uint8_t* w = source_file.ptrw();
    uint64_t r = file_access->get_buffer(w, len);
    ERR_FAIL_COND_V(r != len, ERR_CANT_OPEN);
    w[len] = 0;

    String source;
    if (source.parse_utf8((const char*) w)) { ERR_FAIL_V(ERR_INVALID_DATA); }

    r_content = source;
    return OK;
}
#endif

Ref<Resource> JvmResourceFormatLoader::load(const String& p_path, const String& p_original_path, Error* r_error, bool p_use_sub_threads, float* r_progress, CacheMode p_cache_mode) {
    Ref<JvmScript> jvm_script;

    String extension = p_path.get_extension();
    bool script_is_new = true;
    bool is_source;
    if (extension == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_script<GdjScript>(p_path, &script_is_new);
        is_source = false;
    } else if (extension == GODOT_KOTLIN_SCRIPT_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_script<KotlinScript>(p_path, &script_is_new);
        is_source = true;
    } else if (extension == GODOT_JAVA_SCRIPT_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_script<JavaScript>(p_path, &script_is_new);
        is_source = true;
    } else {
        if (r_error) { *r_error = Error::ERR_FILE_UNRECOGNIZED; }
        return nullptr;
    }

    if (jvm_script.is_valid()) {
#ifdef TOOLS_ENABLED
        String source_code;
        Error load_err {read_all_file_utf8(p_path, source_code)};
        if (r_error) { *r_error = load_err; }
        jvm_script->set_source_code(source_code);

        if (is_source) {
            JVM_LOG_INFO(vformat("fqdn: %s", dynamic_cast<SourceScript*>(jvm_script.ptr())->get_functional_name()));
        }

        if (!script_is_new && is_source) {
            String path = jvm_script->get_path();
            MessageQueue::get_singleton()->push_callable(
              callable_mp(JvmScriptManager::get_instance(), &JvmScriptManager::invalidate_source).bind(path)
            );
        }
#endif
    } else {
        if (r_error) { *r_error = Error::ERR_UNAVAILABLE; }
    }

    return jvm_script;
}