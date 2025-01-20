
#include "jvm_script_manager.h"

#include "lifecycle/paths.h"

#include <core/io/resource_loader.h>

void JvmScriptManager::create_and_update_scripts(Vector<KtClass*>& classes) {
#if defined(DEBUG_ENABLED) && !defined(TOOLS_ENABLED)
    JVM_ERR_FAIL_COND_MSG(named_scripts.size() != 0, "JVM scripts are being initialized more than once.");
#endif

#ifdef TOOLS_ENABLED
    last_reload = OS::get_singleton()->get_unix_time();

    // Clear all containers and keeping a cache for comparison.
    HashMap<StringName, Ref<NamedScript>> named_script_cache = named_scripts_map;
    named_scripts.clear();
    named_scripts_map.clear();

    HashMap<StringName, String> name_to_filepath_cache = name_to_filepath_map;
    name_to_filepath_map.clear();
    filepath_to_name_map.clear();

    HashMap<String, Ref<SourceScript>> path_script_cache = path_scripts_map;
    path_scripts.clear();
    path_scripts_map.clear();
#endif

    JVM_DEV_LOG("Loading JVM Scripts...");

    for (KtClass* kotlin_class : classes) {
        // ####NAMED SCRIPT#######
        String script_name = kotlin_class->registered_class_name;
        String script_path = RES_DIRECTORY + kotlin_class->compilation_time_relative_registration_file_path;

        Ref<NamedScript> named_script;
#ifdef TOOLS_ENABLED
        // First check if the scripts already exist
        if (named_script_cache.has(script_name)) {
            named_script = named_script_cache[script_name];

            delete named_script->kotlin_class;
            named_script->kotlin_class = kotlin_class;

            named_script_cache.erase(script_name);
            named_scripts.push_back(named_script);
            named_scripts_map[script_name] = named_script;

            named_script->export_dirty_flag = true;
            named_script->set_path(script_path, true);

            JVM_DEV_VERBOSE("JVM Script updated: %s", script_name);
        } else {
#endif
            named_script = Ref<NamedScript>(ResourceLoader::load(script_path));
            named_script->kotlin_class = kotlin_class;

            JVM_DEV_VERBOSE("JVM Script created: %s", script_name);
#ifdef TOOLS_ENABLED
        }
#endif

        // ####PATH SCRIPT#######
        script_path = RES_DIRECTORY + kotlin_class->relative_source_path;
        // We check if the file even exist, the KtClass can come from a library or module.
        if (FileAccess::exists(script_path)) {
            name_to_filepath_map[kotlin_class->registered_class_name] = script_path;
            filepath_to_name_map[script_path] = kotlin_class->registered_class_name;

            Ref<SourceScript> path_script;
#ifdef TOOLS_ENABLED
            // Try to find if a matching PathScript exist
            if (name_to_filepath_cache.has(script_name)) {
                // First we try using the path in cache. Necessary if the Kotlin file has been moved since the previous loading.
                script_path = name_to_filepath_cache[script_name];// Use the old path so we can properly remove its entry in the cache.
                path_script = path_script_cache[script_path];
            } else if (path_script_cache.has(script_path)) {
                // Second we try with the name provided by the KtClass directly;
                path_script = path_script_cache[script_path];
            }

            if (path_script.is_valid()) {
                path_script->kotlin_class = kotlin_class;

                path_script_cache.erase(script_path);
                path_scripts.push_back(path_script);
                path_scripts_map[script_path] = path_script;

                path_script->export_dirty_flag = true;
                path_script->set_path(script_path, true);
            } else {
#endif
                path_script = Ref<SourceScript>(ResourceLoader::load(script_path));
                path_script->kotlin_class = kotlin_class;
#ifdef TOOLS_ENABLED
            }
#endif
        }
    }

#ifdef TOOLS_ENABLED
    // Only scripts left in the cache are the ones that have been removed or placeholders without associated KtClass
    // We simply remove their kotlin_class if they got one.
    for (const KeyValue<StringName, Ref<NamedScript>>& keyValue : named_script_cache) {
        Ref<NamedScript> named_script {keyValue.value};
        StringName name {keyValue.key};
        if (named_script->kotlin_class) {
            JVM_DEV_VERBOSE("JVM Script deleted: %s", named_script->kotlin_class->registered_class_name);
            delete named_script->kotlin_class;
            named_script->kotlin_class = nullptr;
        }

        // We only add them back if placeholders are in use in the editor. That way they can be updated if back in the next reload.
        // Without that a separate Script instance would be created and nodes not updated.
        // Otherwise, we let the named_script die.
        if (!named_script->placeholders.is_empty()) {
            named_scripts.push_back(named_script);
            named_scripts_map[name] = named_script;
            named_script->export_dirty_flag = true;
        }
    }

    // We do the same with PathScripts
    for (const KeyValue<String, Ref<SourceScript>>& keyValue : path_script_cache) {
        Ref<SourceScript> path_script {keyValue.value};
        String path {keyValue.key};
        // No need to delete the KotlinClass, it has already been done with the NamedScript that shares it.
        path_script->kotlin_class = nullptr;

        // We only add them back if placeholders are in use in the editor. That way they can be updated if back in the next reload.
        // Without that a separate Script instance would be created and nodes not updated.
        // Otherwise, we let the path_script die.
        if (!path_script->placeholders.is_empty()) {
            path_scripts.push_back(path_script);
            path_scripts_map[path] = path_script;
            path_script->export_dirty_flag = true;
        }
    }

    // We have to delay the call to update_script_exports. The engine is not fully initialized and scripts can cause undefined behaviors.
    MessageQueue::get_singleton()->push_callable(callable_mp(this, &JvmScriptManager::update_all_scripts).bind(last_reload));
#endif
    JVM_DEV_LOG("JVM scripts are now loaded.");
}

Ref<NamedScript> JvmScriptManager::get_named_script_from_index(int p_index) const {
    // No check. Meant to be a fast operation
    return named_scripts[p_index];
}

Ref<NamedScript> JvmScriptManager::get_named_script_from_pathScript(Ref<SourceScript> pathScript) const {
    String path = pathScript->get_path();

    if (filepath_to_name_map.has(path)) {
        StringName name = filepath_to_name_map[path];
        return named_scripts_map[name];
    }
    return {};
}

Ref<NamedScript> JvmScriptManager::get_script_from_name(const StringName& name) const {
    if (HashMap<StringName, Ref<NamedScript>>::ConstIterator element = named_scripts_map.find(name)) {
        return element->value;
    }
    return {};
}

Ref<SourceScript> JvmScriptManager::get_script_from_path(const String& p_path) const {
    if (HashMap<String, Ref<SourceScript>>::ConstIterator element = path_scripts_map.find(p_path)) {
        return element->value;
    }
    return {};
}

#ifdef TOOLS_ENABLED
void JvmScriptManager::update_all_scripts(uint64_t update_time) {
    for (const Ref<NamedScript>& named_script : named_scripts) {
        JvmScript* ptr = named_script.ptr();
        ptr->update_script_exports();
        ptr->set_last_time_source_modified(update_time);
    }
    for (const Ref<SourceScript>& path_script : path_scripts) {
        JvmScript* ptr = path_script.ptr();
        ptr->update_script_exports();
        ptr->set_last_time_source_modified(update_time);
    }
}

void JvmScriptManager::invalidate_source(String path) {
    Ref<SourceScript> path_script = get_script_from_path(path);
    if (path_script.is_null()) { return; }

    uint64_t last_modified = path_script->get_last_modified_time();

    // If the jvm_script is already in cache, it means the Godot editor has reloaded it because the sources have changed.
    path_script->set_last_time_source_modified(last_modified);

    // Update the .gdj if it exists.
    Ref<NamedScript> named_script = JvmScriptManager::get_instance()->get_named_script_from_pathScript(path_script);
    if (named_script.is_valid()) { named_script->set_last_time_source_modified(last_modified); }
}

int64_t JvmScriptManager::get_last_reload() {
    return last_reload;
}
#endif

void JvmScriptManager::finalize() {
    JvmScriptManager* singleton = get_instance();

    singleton->named_scripts.clear();
    singleton->named_scripts_map.clear();
    singleton->name_to_filepath_map.clear();
    singleton->filepath_to_name_map.clear();
    singleton->path_scripts.clear();
    singleton->path_scripts_map.clear();

    memdelete(singleton);
}

JvmScriptManager* JvmScriptManager::get_instance() {
    static JvmScriptManager* instance {memnew(JvmScriptManager)};
    return instance;
}
