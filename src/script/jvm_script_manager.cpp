
#include "jvm_script_manager.h"

#include "script/language/gdj_script.h"

void JvmScriptManager::create_and_update_scripts(Vector<KtClass*>& classes) {
    LOG_DEV("Loading JVM Scripts...");

#if defined(DEBUG_ENABLED) && !defined(TOOLS_ENABLED)
    JVM_ERR_FAIL_COND_MSG(named_user_scripts.size() != 0, "JVM scripts are being initialized more than once.");
#endif

    Vector<Ref<NamedScript>> scripts;
    // We first deal with named scripts.

#ifdef TOOLS_ENABLED
    // Clear all containers and keeping a cache for comparison.
    HashMap<StringName, Ref<NamedScript>> script_cache = named_user_scripts_map;
    named_user_scripts.clear();
    named_user_scripts_map.clear();
    filepath_to_name_map.clear();
#endif

    for (KtClass* kotlin_class : classes) {
        String script_name = kotlin_class->registered_class_name;
        Ref<GdjScript> script;
#ifdef TOOLS_ENABLED
        // First check if the scripts already exist
        if (script_cache.has(script_name)) {
            script = script_cache[script_name];
            delete script->kotlin_class;
            script->kotlin_class = kotlin_class;
            script_cache.erase(script_name);
            LOG_DEV_VERBOSE(vformat("JVM Script updated: %s", script_name));
        } else {
#endif
            script.instantiate();
            script->kotlin_class = kotlin_class;
            LOG_DEV_VERBOSE(vformat("JVM Script created: %s", script_name));
#ifdef TOOLS_ENABLED
        }
#endif
        scripts.push_back(Ref(script));
    }

    for (const Ref<NamedScript>& script : scripts) {
        named_user_scripts.push_back(script);
        named_user_scripts_map[script->get_global_name()] = script;

        String source_path = "res://" + script->kotlin_class->relative_source_path;
        if (FileAccess::exists(source_path)) {
            filepath_to_name_map[source_path] = script->kotlin_class->registered_class_name;
        }
    }

#ifdef TOOLS_ENABLED
    // Only scripts left in the cache are the ones that have been removed or placeholders without associated KtClass
    // We simply delete their kotlin_class if they got one
    for (const KeyValue<StringName, Ref<NamedScript>>& keyValue : script_cache) {
        Ref<JvmScript> ref = keyValue.value;
        if (ref->kotlin_class) {
            LOG_DEV_VERBOSE(vformat("JVM Script deleted: %s", ref->kotlin_class->registered_class_name));
            delete ref->kotlin_class;
            ref->kotlin_class = nullptr;
        }

        // We only add them back if they are in use, otherwise we let the Script die.
        if (!ref->placeholders.is_empty()) { scripts.push_back(ref); }
    }

    // Now we deal with path script reloading.
    Vector<Ref<PathScript>> path_script_cache = path_user_scripts;
    path_user_scripts.clear();
    for (Ref<PathScript>& script : path_script_cache) {
        String path = script->get_path();
        // No need to delete the KotlinClass, it has already been done with the namedScript that shares it.
        script->kotlin_class = nullptr;
        if (filepath_to_name_map.has(path)) {
            script->kotlin_class = named_user_scripts_map[filepath_to_name_map[path]]->kotlin_class;
            path_user_scripts.push_back(script);
        }
    }
#endif
}

const Ref<NamedScript>& JvmScriptManager::get_user_script_for_index(int p_index) const {
    // No check. Meant to be a fast operation
    return named_user_scripts[p_index];
}

Ref<NamedScript> JvmScriptManager::get_user_script_from_name(const StringName& name) const {
    if (HashMap<StringName, Ref<NamedScript>>::ConstIterator element = named_user_scripts_map.find(name)) {
        return element->value;
    }
    return Ref<JvmScript>();
}

#ifdef TOOLS_ENABLED
void JvmScriptManager::update_all_exports_if_dirty() {
    if (!scripts_dirty) return;
    for (const Ref<NamedScript>& script : named_user_scripts) {
        script->update_exports();
    }
    for (const Ref<PathScript>& script : path_user_scripts) {
        script->update_exports();
    }
    scripts_dirty = false;
}
#endif

void JvmScriptManager::clear() {
    named_user_scripts.clear();
    named_user_scripts_map.clear();
    path_user_scripts.clear();
    filepath_to_name_map.clear();
}

JvmScriptManager& JvmScriptManager::get_instance() {
    static JvmScriptManager instance;
    return instance;
}

