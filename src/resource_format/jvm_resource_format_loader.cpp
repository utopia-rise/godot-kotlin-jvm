#include "jvm_resource_format_loader.h"

#include "godotkotlin_defs.h"
#include "kotlin_script.h"
#include "type_manager.h"

void JvmResourceFormatLoader::get_recognized_extensions(List<String>* p_extensions) const {
    p_extensions->push_back(GODOT_JVM_REGISTRATION_FILE_EXTENSION);
    p_extensions->push_back(GODOT_KOTLIN_SCRIPT_EXTENSION);
}

String JvmResourceFormatLoader::get_resource_type(const String& p_path) const {
    String ext = p_path.get_extension().to_lower();

    if (ext == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        return GODOT_KOTLIN_SCRIPT_NAME;
    } else if (ext == GODOT_KOTLIN_SCRIPT_EXTENSION) {
        return GODOT_KOTLIN_SCRIPT_NAME;
    }
    return "";
}

bool JvmResourceFormatLoader::handles_type(const String& p_type) const {
    return p_type == "Script" || p_type == GODOT_KOTLIN_SCRIPT_NAME || p_type == GODOT_JVM_SCRIPT_NAME;
}

Error kt_read_all_file_utf8(const String& p_path, String& r_content) {
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

Ref<Resource> JvmResourceFormatLoader::load(const String& p_path, const String& p_original_path, Error* r_error, bool p_use_sub_threads, float* r_progress, CacheMode p_cache_mode) {
    Ref<KotlinScript> ref;

    String extension = p_path.get_extension();
    if (extension == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        // We don't import Kotlin scripts so p_path == p_original_path
        String script_name = KotlinScript::get_script_file_name(p_path);
        ref = TypeManager::get_instance().get_user_script_from_name(script_name);
        if (ref.is_null()) {
#ifdef TOOLS_ENABLED
            // If we reach that location, it means that the script file being loaded hasn't been built into the .jar.
            // We create a script placeholder instead. When reloading, it will be properly updated with the correct KtClass.
            ref = TypeManager::get_instance().create_script(p_path, false);
#elif DEBUG_ENABLED
            // All scripts are supposed to be already in cache when not in the editor.
            if (r_error) { *r_error = Error::ERR_UNAVAILABLE; }
            return Ref<KotlinScript>();
#endif
        }
    } else if (extension == GODOT_KOTLIN_SCRIPT_EXTENSION) {
        // Path scripts are always created from the resource_loader and set in the resource cache afterward.
        // If we reach that location, it means the script doesn't exist.
        ref = TypeManager::get_instance().create_script(p_path, true);
    }

    String source_code;
    Error load_err {kt_read_all_file_utf8(p_path, source_code)};

    ref->set_source_code(source_code);
    ref->set_path(p_path, true);
    ref->update_exports();

    if (r_error) { *r_error = load_err; }
    return ref;
}