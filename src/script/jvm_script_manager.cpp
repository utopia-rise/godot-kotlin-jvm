#include "jvm_script_manager.h"

#include "jvm_wrapper/memory/type_manager.h"
#include "language/names.h"

#include <core/object/callable_mp.h>
#include <core/object/message_queue.h>

static Ref<JvmScript> _create_script_for_path(const String& p_path) {
    const String extension = p_path.get_extension().to_lower();

    if (extension == GODOT_KOTLIN_SCRIPT_EXTENSION) {
        Ref<KotlinScript> script;
        script.instantiate();
        return script;
    }
    if (extension == GODOT_JAVA_SCRIPT_EXTENSION) {
        Ref<JavaScript> script;
        script.instantiate();
        return script;
    }
    if (extension == GODOT_SCALA_SCRIPT_EXTENSION) {
        Ref<ScalaScript> script;
        script.instantiate();
        return script;
    }

    if (p_path.is_empty() || extension == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        Ref<GdjScript> script;
        script.instantiate();
        return script;
    }

    JVM_ERR_FAIL_V_MSG({}, "Unsupported JVM script extension: %s", extension);
}

static bool _is_source_path(const String& p_path) {
    const String extension = p_path.get_extension().to_lower();
    return extension == GODOT_KOTLIN_SCRIPT_EXTENSION || extension == GODOT_JAVA_SCRIPT_EXTENSION
        || extension == GODOT_SCALA_SCRIPT_EXTENSION;
}

void JvmScriptManager::create_and_update_scripts(const Vector<KtClass*>& classes) {
#if defined(DEBUG_ENABLED) && !defined(TOOLS_ENABLED)
    JVM_ERR_FAIL_COND_MSG(registered_name_to_script.size() != 0, "JVM scripts are being initialized more than once.");
#endif

#ifdef TOOLS_ENABLED
    last_reload = OS::get_singleton()->get_unix_time();

    // Rebuild the maps from this reload's KtClasses. The old entries are retained
    // temporarily so their Script instances can be reused or invalidated below.
    HashMap<StringName, Ref<JvmScript>> script_cache(registered_name_to_script);
    HashMap<String, Ref<JvmScript>> source_cache(source_path_to_script);
    registered_name_to_script.clear();
    source_path_to_script.clear();

#endif

    JVM_DEV_LOG("Loading JVM Scripts...");

    jni::Env env {jni::Jvm::current_env()};

    // ####JVM SCRIPT#######
    for (int i = 0; i < classes.size(); i++) {
        KtClass* kotlin_class = classes[i];
        const StringName script_name = kotlin_class->registered_class_name;
        Ref<JvmScript> jvm_script;

#ifdef TOOLS_ENABLED
        if (const HashMap<StringName, Ref<JvmScript>>::ConstIterator script = script_cache.find(script_name)) {
            // Registered name is the identity of an already resolved script.
            jvm_script = script->value;
            script_cache.erase(script_name);
        } else if (!kotlin_class->source_file_path.is_empty()) {
            const HashMap<String, Ref<JvmScript>>::ConstIterator source_script = source_cache.find(kotlin_class->source_file_path);
            if (source_script) {
                // A source file loaded before its first successful build has no
                // registered name yet. Promote that unresolved source script by path.
                if (!source_script->value->is_valid()) { jvm_script = source_script->value; }
            }
        }

        if (jvm_script.is_valid()) {
            delete jvm_script->kotlin_class;
            jvm_script->kotlin_class = kotlin_class;

            jvm_script->export_dirty_flag = true;
            // Do not overwrite the existing path on reload — preserve whatever path
            // (res:// or jvm://) the script was previously loaded with.
            JVM_DEV_VERBOSE("JVM Script updated: %s", script_name);
        } else {
#endif
            jvm_script = _create_script_for_path(kotlin_class->source_file_path);
            const String path = kotlin_class->source_file_path.is_empty()
                                ? String(GODOT_JVM_VIRTUAL_PATH_PREFIX) + String(script_name) + "." + GODOT_JVM_REGISTRATION_FILE_EXTENSION
                                : kotlin_class->source_file_path;
            jvm_script->set_path(path, true);
            jvm_script->kotlin_class = kotlin_class;
            JVM_DEV_VERBOSE("JVM Script created: %s", script_name);
#ifdef TOOLS_ENABLED
        }
#endif

        registered_name_to_script[script_name] = jvm_script;
        if (!kotlin_class->source_file_path.is_empty()) {
            // The source path promotes a pre-build source script and later follows
            // editor moves through JvmScript's path setters.
            source_path_to_script[kotlin_class->source_file_path] = jvm_script;
        }
        TypeManager::get_instance().assign_script_to_class(env, i, jvm_script);
    }

#ifdef TOOLS_ENABLED
    // Entries left in the registered-name cache were absent from the new jar.
    // Keep only scripts that still back editor placeholders; their KtClass is
    // removed so they remain a best-effort invalid script until a later build.
    HashSet<JvmScript*> processed_scripts;
    for (const KeyValue<StringName, Ref<JvmScript>>& keyValue : script_cache) {
        Ref<JvmScript> jvm_script {keyValue.value};
        JvmScript* ptr = jvm_script.ptr();
        if (!ptr || processed_scripts.has(ptr)) { continue; }
        processed_scripts.insert(ptr);

        const StringName script_name {keyValue.key};
        const String source_path {jvm_script->kotlin_class ? jvm_script->kotlin_class->source_file_path : String()};
        if (jvm_script->kotlin_class) {
            JVM_DEV_VERBOSE("JVM Script deleted: %s", jvm_script->kotlin_class->registered_class_name);
            delete jvm_script->kotlin_class;
            jvm_script->kotlin_class = nullptr;
        }

        // We only add them back if placeholders are in use in the editor. That way they can be updated if back in the next reload.
        // Without that a separate Script instance would be created and nodes not updated.
        // Otherwise, we let the jvm_script die.
        if (!jvm_script->placeholders.is_empty()) {
            registered_name_to_script[script_name] = jvm_script;
            if (!source_path.is_empty()) { source_path_to_script[source_path] = jvm_script; }
            jvm_script->export_dirty_flag = true;
        }
    }

    for (const KeyValue<String, Ref<JvmScript>>& key_value : source_cache) {
        Ref<JvmScript> script = key_value.value;
        // Preserve unresolved source scripts that are attached to editor
        // placeholders, even though they never had a registered name to cache.
        if (!script->is_valid() && !script->placeholders.is_empty() && !source_path_to_script.has(key_value.key)) {
            source_path_to_script[key_value.key] = script;
        }
    }
#endif

#ifdef TOOLS_ENABLED
    // We have to delay the call to update_script_exports. The engine is not fully initialized and scripts can cause undefined behaviors.
    MessageQueue::get_singleton()->push_callable(callable_mp(this, &JvmScriptManager::update_all_scripts).bind(last_reload));
#endif

    JVM_DEV_LOG("JVM scripts are now loaded.");
}

Ref<JvmScript> JvmScriptManager::get_or_create_script_from_path(const String& p_path, bool* created) {
    *created = false;

    if (const HashMap<String, Ref<JvmScript>>::ConstIterator script = source_path_to_script.find(p_path)) {
        return script->value;
    }

#ifdef TOOLS_ENABLED
    Ref<JvmScript> jvm_script = _create_script_for_path(p_path);
    *created = true;
    return jvm_script;
#else
    return {};
#endif
}

void JvmScriptManager::script_path_changed(JvmScript* p_script, const String& p_old_path, const String& p_new_path) {
    if (_is_source_path(p_old_path)) {
        const HashMap<String, Ref<JvmScript>>::Iterator old_script = source_path_to_script.find(p_old_path);
        if (old_script && old_script->value.ptr() == p_script) { source_path_to_script.erase(p_old_path); }
    }

    if (_is_source_path(p_new_path)) { source_path_to_script[p_new_path] = Ref<JvmScript>(p_script); }
}

Ref<JvmScript> JvmScriptManager::get_or_create_script_from_name(const String& p_path, bool* created) {
    *created = false;

    const StringName script_name = JvmScript::get_script_file_name(p_path);
    if (const HashMap<StringName, Ref<JvmScript>>::ConstIterator script = registered_name_to_script.find(script_name)) {
        return script->value;
    }

#ifdef TOOLS_ENABLED
    Ref<GdjScript> script;
    script.instantiate();
    *created = true;
    registered_name_to_script[script_name] = script;
    return script;
#else
    return {};
#endif
}

Ref<JvmScript> JvmScriptManager::get_script_from_registered_name(const StringName& p_name) const {
    const HashMap<StringName, Ref<JvmScript>>::ConstIterator script = registered_name_to_script.find(p_name);
    return script ? script->value : Ref<JvmScript>();
}

#ifdef TOOLS_ENABLED
void JvmScriptManager::update_all_scripts(uint64_t update_time) {
    HashSet<JvmScript*> processed_scripts;
    for (const KeyValue<StringName, Ref<JvmScript>>& key_value : registered_name_to_script) {
        Ref<JvmScript> script = key_value.value;
        JvmScript* ptr = script.ptr();
        if (!ptr || processed_scripts.has(ptr)) { continue; }
        processed_scripts.insert(ptr);
        ptr->update_script_exports();
        ptr->set_last_time_source_modified(update_time);
    }
}

int64_t JvmScriptManager::get_last_reload() const {
    return last_reload;
}
#endif

void JvmScriptManager::finalize() {
    JvmScriptManager* singleton = get_instance();

    singleton->registered_name_to_script.clear();
    singleton->source_path_to_script.clear();
    memdelete(singleton);
}

JvmScriptManager* JvmScriptManager::get_instance() {
    static JvmScriptManager* instance {memnew(JvmScriptManager)};
    return instance;
}
