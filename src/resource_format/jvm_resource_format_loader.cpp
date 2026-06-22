#include "jvm_resource_format_loader.h"

#include "hash.h"
#include "language/names.h"
#include "script/jvm_script.h"
#include "script/jvm_script_manager.h"
#include "script/source_script_parser.h"
#include "script/language/gdj_script.h"
#include "script/language/java_script.h"
#include "script/language/kotlin_script.h"
#include "script/language/scala_script.h"

#include <core/io/file_access.h>
#include <core/object/callable_mp.h>
#include <core/object/message_queue.h>

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
    String source_code;
    bool script_is_new = true;
    bool is_source;

    // Virtual jvm:// paths have no backing file on disk — only read the source
    // when the path points to a real resource.
    if (!p_path.begins_with(GODOT_JVM_VIRTUAL_PATH_PREFIX)) {
        Error read_error = read_all_file_utf8(p_path, source_code);
        if (r_error) {
            *r_error = read_error;
        }
        if (read_error != OK) {
            return nullptr;
        }
    }

    if (extension == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_named_script<GdjScript>(p_path, &script_is_new);
        is_source = false;
    } else if (extension == GODOT_KOTLIN_SCRIPT_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_source_script<KotlinScript>(source_code, p_path, &script_is_new);
        is_source = true;
    } else if (extension == GODOT_JAVA_SCRIPT_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_source_script<JavaScript>(source_code, p_path, &script_is_new);
        is_source = true;
    } else if (extension == GODOT_SCALA_SCRIPT_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_source_script<ScalaScript>(source_code, p_path, &script_is_new);
        is_source = true;
    } else {
        if (r_error) { *r_error = Error::ERR_FILE_UNRECOGNIZED; }
        return nullptr;
    }

    if (jvm_script.is_valid()) {
        jvm_script->set_source_code(source_code);

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
    String source_code;
    Error parse_error = OK;

    bool is_kotlin_source = extension == GODOT_KOTLIN_SCRIPT_EXTENSION;
    bool is_java_source = extension == GODOT_JAVA_SCRIPT_EXTENSION;
    bool is_scala_source = extension == GODOT_SCALA_SCRIPT_EXTENSION;
    bool is_source = is_kotlin_source || is_java_source || is_scala_source;

    if (extension == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        id = (JvmScript::get_script_file_name(p_path) + GDJ_UUID_HASH_SEED).hash64();
        id &= 0x7FFFFFFFFFFFFFFF;
    } else if (is_source) {
        parse_error = read_all_file_utf8(p_path, source_code);
        if (parse_error != OK) { return id; }

        StringName fq_name = parse_source_script_info(source_code, p_path);
        if (fq_name.is_empty()) { return id; }

        String seed;
        if (is_java_source) {
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
