
#include "jvm_script_manager.h"

#include <core/io/resource_loader.h>

#include "language/names.h"
#include "lifecycle/paths.h"

void JvmScriptManager::create_and_update_scripts(Vector<KtClass*>& classes) {
#if defined(DEBUG_ENABLED) && !defined(TOOLS_ENABLED)
    JVM_ERR_FAIL_COND_MSG(named_scripts.size() != 0, "JVM scripts are being initialized more than once.");
#endif

#ifdef TOOLS_ENABLED
    // Clear all containers and keeping a cache for comparison.
    HashMap<StringName, Ref<NamedScript>> named_script_cache = named_scripts_map;
    named_scripts.clear();
    named_scripts_map.clear();

    HashMap<StringName, String> name_to_filepath_cache = name_to_filepath_map;
    name_to_filepath_map.clear();

    HashMap<String, Ref<PathScript>> path_script_cache = path_scripts_map;
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

            Ref<PathScript> path_script;
#ifdef TOOLS_ENABLED

            // Try to find if a matching PathScript exist
            if(path_script_cache.has(script_path)){
                // First we try with the name provided by the KtClass;
                path_script = path_script_cache[script_path];
            } else if(name_to_filepath_cache.has(script_name)){
                // Second we try using the path in cache. Necessary if the Kotlin file has been moved since the previous loading.
                path_script = path_script_cache[name_to_filepath_cache[script_name]];
            }

            if (path_script.is_valid()) {
                path_script->kotlin_class = kotlin_class;

                path_script_cache.erase(script_name);
                path_scripts.push_back(path_script);
                path_scripts_map[script_path] = path_script;

                path_script->set_path(script_path, true);
            } else {
#endif
                path_script = Ref<PathScript>(ResourceLoader::load(script_path));
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
        Ref<NamedScript> script {keyValue.value};
        StringName name {keyValue.key};
        if (script->kotlin_class) {
            JVM_DEV_VERBOSE("JVM Script deleted: %s", script->kotlin_class->registered_class_name);
            delete script->kotlin_class;
            script->kotlin_class = nullptr;
        }

        // We only add them back if placeholders are in use in the editor. That way they can be updated if back in the next reload.
        // Without that a separate Script instance would be created and nodes not updated.
        // Otherwise, we let the script die.
        if (!script->placeholders.is_empty()) {
            named_scripts.push_back(script);
            named_scripts_map[name] = script;
        }
    }

    // We do the same with PathScripts
    for (const KeyValue<String, Ref<PathScript>>& keyValue : path_script_cache) {
        Ref<PathScript> script {keyValue.value};
        String path {keyValue.key};
        if (script->kotlin_class) {
            // No need to delete the KotlinClass, it has already been done with the NamedScript that shares it.
            script->kotlin_class = nullptr;
        }

        // We only add them back if placeholders are in use in the editor. That way they can be updated if back in the next reload.
        // Without that a separate Script instance would be created and nodes not updated.
        // Otherwise, we let the script die.
        if (!script->placeholders.is_empty()) {
            path_scripts.push_back(script);
            path_scripts_map[path] = script;
        }
    }

    update_all_scripts();
#endif

    JVM_DEV_LOG("JVM are now loaded.");
}

const Ref<NamedScript>& JvmScriptManager::get_named_script_for_index(int p_index) const {
    // No check. Meant to be a fast operation
    return named_scripts[p_index];
}

Ref<NamedScript> JvmScriptManager::get_script_from_name(const StringName& name) const {
    if (HashMap<StringName, Ref<NamedScript>>::ConstIterator element = named_scripts_map.find(name)) {
        return element->value;
    }
    return {};
}

Ref<PathScript> JvmScriptManager::get_script_from_path(const String& p_path) const {
    if (HashMap<String, Ref<PathScript>>::ConstIterator element = path_scripts_map.find(p_path)) {
        return element->value;
    }
    return {};
}

#ifdef TOOLS_ENABLED
void JvmScriptManager::update_all_scripts() {
    for (const Ref<NamedScript>& script : named_scripts) {
        // We have to delay the call to update_script. The engine is not fully initialized and scripts can cause undefined behaviors.
        JvmScript* ptr = script.ptr();
        ptr->export_dirty_flag = true;
        MessageQueue::get_singleton()->push_callable(callable_mp(ptr, &JvmScript::update_script));
    }
    for (const Ref<PathScript>& script : path_scripts) {
        // We have to delay the call to update_script. The engine is not fully initialized and scripts can cause undefined behaviors.
        JvmScript* ptr = script.ptr();
        ptr->export_dirty_flag = true;
        MessageQueue::get_singleton()->push_callable(callable_mp(ptr, &JvmScript::update_script));
    }
}
#endif

void JvmScriptManager::clear() {
    named_scripts.clear();
    named_scripts_map.clear();
    name_to_filepath_map.clear();
    path_scripts.clear();
    path_scripts_map.clear();
}

JvmScriptManager& JvmScriptManager::get_instance() {
    static JvmScriptManager instance;
    return instance;
}