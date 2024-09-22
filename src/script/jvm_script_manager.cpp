
#include "jvm_script_manager.h"

#include "lifecycle/paths.h"
#include "script/language/gdj_script.h"

void JvmScriptManager::create_and_update_scripts(Vector<KtClass*>& classes) {
#if defined(DEBUG_ENABLED) && !defined(TOOLS_ENABLED)
    JVM_ERR_FAIL_COND_MSG(named_scripts.size() != 0, "JVM scripts are being initialized more than once.");
#endif

#ifdef TOOLS_ENABLED
    // Clear all containers and keeping a cache for comparison.
    HashMap<StringName, Ref<NamedScript>> named_script_cache = named_scripts_map;
    named_scripts.clear();
    named_scripts_map.clear();

    filepath_to_name_map.clear();

    Vector<Ref<PathScript>> path_script_cache = path_scripts;
    path_scripts.clear();
    path_scripts_map.clear();
#endif

    JVM_DEV_LOG("Loading JVM Scripts...");

    // Named Script
    for (KtClass* kotlin_class : classes) {
        String script_name = kotlin_class->registered_class_name;

        Ref<GdjScript> named_script;
#ifdef TOOLS_ENABLED
        // First check if the scripts already exist
        if (named_script_cache.has(script_name)) {
            named_script = named_script_cache[script_name];

            delete named_script->kotlin_class;
            named_script->kotlin_class = kotlin_class;

            named_script_cache.erase(script_name);

            JVM_DEV_VERBOSE("JVM Script updated: %s", script_name);
        } else {
#endif
            named_script.instantiate();
            named_script->kotlin_class = kotlin_class;

            JVM_DEV_VERBOSE("JVM Script created: %s", script_name);
#ifdef TOOLS_ENABLED
        }
#endif
        // Add mapping from path to name for PathScripts.
        String source_path = RES_DIRECTORY + kotlin_class->relative_source_path;
        if (FileAccess::exists(source_path)) {
            filepath_to_name_map[source_path] = kotlin_class->registered_class_name;
        }

        named_scripts.push_back(named_script);
        named_scripts_map[script_name] = named_script;
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

    // Now we deal with path script reloading.
    for (Ref<PathScript>& script : path_script_cache) {
        String path = script->get_path();
        // No need to delete the KotlinClass, it has already been done with the NamedScript that shares it.
        script->kotlin_class = nullptr;
        if (filepath_to_name_map.has(path)) {
            script->kotlin_class = named_scripts_map[filepath_to_name_map[path]]->kotlin_class;

        } else if (script->placeholders.is_empty()) {
            continue;
        }
        // Only scripts used in placeholder or with a mapping to a Named Script are kept.
        path_scripts.push_back(script);
        path_scripts_map[path] = script;
    }

    update_all_scripts();
#endif
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
        script->update_script();
    }
    for (const Ref<PathScript>& script : path_scripts) {
        script->update_script();
    }
}
#endif

void JvmScriptManager::clear() {
    named_scripts.clear();
    named_scripts_map.clear();
    filepath_to_name_map.clear();
    path_scripts.clear();
    path_scripts_map.clear();
}

JvmScriptManager& JvmScriptManager::get_instance() {
    static JvmScriptManager instance;
    return instance;
}