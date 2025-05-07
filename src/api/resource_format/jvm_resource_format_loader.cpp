#include "jvm_resource_format_loader.h"

#include "api/language/names.h"
#include "api/script/jvm_script.h"
#include "api/script/jvm_script_manager.h"
#include "api/script/language/gdj_script.h"
#include "api/script/language/java_script.h"
#include "api/script/language/kotlin_script.h"
#include "api/script/language/scala_script.h"
#include "engine/ustring.h"
#include "engine/utilities.h"
#include "hash.h"

#include <classes/file_access.hpp>
#include <classes/resource_uid.hpp>

using namespace godot;

PackedStringArray JvmResourceFormatLoader::_get_recognized_extensions() const {
    PackedStringArray extensions;
    extensions.push_back(GODOT_JVM_REGISTRATION_FILE_EXTENSION);
    extensions.push_back(GODOT_KOTLIN_SCRIPT_EXTENSION);
    extensions.push_back(GODOT_JAVA_SCRIPT_EXTENSION);
    extensions.push_back(GODOT_SCALA_SCRIPT_EXTENSION);
    return extensions;
}

String JvmResourceFormatLoader::_get_resource_type(const String& p_path) const {
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

bool JvmResourceFormatLoader::_handles_type(const StringName& p_type) const {
    return p_type == SNAME("Script")
           || p_type == SNAME(GODOT_JVM_SCRIPT_NAME)
           || p_type == SNAME(GODOT_KOTLIN_SCRIPT_NAME)
           || p_type == SNAME(GODOT_JAVA_SCRIPT_NAME)
           || p_type == SNAME(GODOT_SCALA_SCRIPT_NAME);
}

Error JvmResourceFormatLoader::read_all_file_utf8(const String& p_path, String& r_content) {
    Vector<uint8_t> source_file;
    Ref<FileAccess> file_access {FileAccess::open(p_path, FileAccess::READ)};
    Error err = FileAccess::get_open_error();
    JVM_ERR_FAIL_COND_V_MSG(err != OK, err, "Cannot open file '" + p_path + "'.");

    const String source = file_access->get_as_utf8_string();
    if (!source.is_valid_string()) { ERR_FAIL_V(ERR_INVALID_DATA); }

    r_content = source;
    return OK;
}

Variant JvmResourceFormatLoader::_load(const String& p_path, const String& p_original_path, bool p_use_sub_threads, int32_t p_cache_mode) {
    Ref<JvmScript> jvm_script;

    String extension = p_path.get_extension();
    bool script_is_new = true;
    bool is_source;
    Error error;
    if (extension == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_named_script<GdjScript>(p_path, &script_is_new);
        is_source = false;
    } else if (extension == GODOT_KOTLIN_SCRIPT_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_source_script<KotlinScript>(p_path, &script_is_new, &error);
        is_source = true;
    } else if (extension == GODOT_JAVA_SCRIPT_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_source_script<JavaScript>(p_path, &script_is_new, &error);
        is_source = true;
    } else if (extension == GODOT_SCALA_SCRIPT_EXTENSION) {
        jvm_script = JvmScriptManager::get_instance()->get_or_create_source_script<ScalaScript>(p_path, &script_is_new, &error);
    } else {
        return nullptr;
    }

#ifdef TOOLS_ENABLED
    if (jvm_script.is_valid() && !script_is_new && is_source) {
        callable_mp(JvmScriptManager::get_instance(), &JvmScriptManager::invalidate_source).bind(Ref<SourceScript>(jvm_script))
          .call_deferred();
    }
#endif

    return jvm_script;
}

int64_t JvmResourceFormatLoader::_get_resource_uid(const String& p_path) const {
    String extension = p_path.get_extension();
    int64_t id = ResourceUID::INVALID_ID;
    if (extension == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        id = (int64_t) hash64(JvmScript::get_script_file_name(p_path) + UUID_HASH_SEED);
        id &= 0x7FFFFFFFFFFFFFFF;
    } else if (extension == GODOT_KOTLIN_SCRIPT_EXTENSION || extension == GODOT_JAVA_SCRIPT_EXTENSION || extension == GODOT_SCALA_SCRIPT_EXTENSION) {
        String source;
        Error error;
        id = (int64_t) hash64(String(SourceScript::parse_source_to_fqdn(p_path, source, &error)) + UUID_HASH_SEED);
        id &= 0x7FFFFFFFFFFFFFFF;
    }
    return id;
}