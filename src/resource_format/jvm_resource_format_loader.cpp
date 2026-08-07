#include "jvm_resource_format_loader.h"

#include "hash.h"
#include "language/names.h"
#include "script/jvm_script.h"
#include "script/jvm_script_manager.h"
#include "script/source_script_parser.h"

#include <core/io/file_access.h>

void JvmResourceFormatLoader::get_recognized_extensions(List<String>* p_extensions) const {
    p_extensions->push_back(GODOT_JVM_REGISTRATION_FILE_EXTENSION);
    p_extensions->push_back(GODOT_KOTLIN_SCRIPT_EXTENSION);
    p_extensions->push_back(GODOT_JAVA_SCRIPT_EXTENSION);
    p_extensions->push_back(GODOT_SCALA_SCRIPT_EXTENSION);
}

String JvmResourceFormatLoader::get_resource_type(const String& p_path) const {
    if (const String ext = p_path.get_extension().to_lower(); ext == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
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
    return p_type == "Script" || p_type == GODOT_JVM_SCRIPT_NAME || p_type == GODOT_KOTLIN_SCRIPT_NAME
        || p_type == GODOT_JAVA_SCRIPT_NAME || p_type == GODOT_SCALA_SCRIPT_NAME;
}

Ref<Resource> JvmResourceFormatLoader::load(const String& p_path, const String& p_original_path, Error* r_error, bool p_use_sub_threads, float* r_progress, CacheMode p_cache_mode) {
    // This loader resolves the canonical JvmScript when the resource first enters the cache.
    // Changes to an already cached script are handled directly by JvmScript::reload_from_file().
    // Explicit CACHE_MODE_IGNORE loads can still reach here, so the manager must reuse an existing script.
    Ref<JvmScript> jvm_script;
    String source_code;

    if (p_cache_mode == CACHE_MODE_IGNORE) {
        Ref<JvmScript> cached_script = ResourceCache::get_ref(p_path);
        if (cached_script.is_valid()) {
            cached_script->reload_from_file();
            return cached_script;
        }
    }

    // In case a virtual path has been saved on file.
    if (p_path.begins_with(GODOT_JVM_VIRTUAL_PATH_PREFIX)) {
        jvm_script = JvmScriptManager::get_instance()->get_script_from_registered_name(JvmScript::get_script_file_name(p_path));
        if (jvm_script.is_null()) {
            if (r_error) { *r_error = ERR_FILE_NOT_FOUND; }
            return {};
        }
        return jvm_script;
    }

    // Now for actual physical scripts.
    Error read_error = read_source_script_file(p_path, source_code);
    if (r_error) { *r_error = read_error; }
    if (read_error != OK) { return {}; }

    const StringName fq_name = parse_source_script_fqname(source_code, p_path);
    jvm_script = JvmScriptManager::get_instance()->create_and_bind_physical_script(p_path, fq_name);

    if (jvm_script.is_valid()) {
        jvm_script->set_source_code(source_code);
#ifdef TOOLS_ENABLED
        jvm_script->set_last_source_modified_time(FileAccess::get_modified_time(p_path));
#endif
    } else {
        if (r_error) { *r_error = ERR_UNAVAILABLE; }
    }

    return jvm_script;
}

ResourceUID::ID JvmResourceFormatLoader::get_resource_uid(const String& p_path) const {
    const String extension = p_path.get_extension();
    ResourceUID::ID id = ResourceUID::INVALID_ID;
    Error parse_error = OK;

    const bool is_kotlin_source = extension == GODOT_KOTLIN_SCRIPT_EXTENSION;
    const bool is_java_source = extension == GODOT_JAVA_SCRIPT_EXTENSION;
    const bool is_scala_source = extension == GODOT_SCALA_SCRIPT_EXTENSION;
    const bool is_source = is_kotlin_source || is_java_source || is_scala_source;

    if (extension == GODOT_JVM_REGISTRATION_FILE_EXTENSION || is_source) {
        String source_code;
        parse_error = read_source_script_file(p_path, source_code);
        if (parse_error != OK) { return id; }

        const StringName fq_name = parse_source_script_fqname(source_code, p_path);
        if (fq_name.is_empty()) { return id; }

        String seed;
        if (extension == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
            seed = GDJ_UUID_HASH_SEED;
        } else if (is_java_source) {
            seed = JAVA_UUID_HASH_SEED;
        } else if (is_scala_source) {
            seed = SCALA_UUID_HASH_SEED;
        } else {
            seed = KOTLIN_UUID_HASH_SEED;
        }

        id = (String(fq_name) + seed).hash64();
        id &= 0x7FFFFFFFFFFFFFFF;
    }

    return id;
}

bool JvmResourceFormatLoader::has_custom_uid_support() const {
    return true;
}
