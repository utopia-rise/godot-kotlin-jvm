
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

#endif

    JVM_DEV_LOG("Loading JVM Scripts...");

    // ####NAMED SCRIPT#######
    for (KtClass* kotlin_class : classes) {
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
#endif



    // ####SOURCE SCRIPT#######
#ifdef TOOLS_ENABLED
    HashMap<StringName, KtClass*> new_fqdn_to_kt_class;
#endif
    HashMap<StringName, KtClass*>& fqdn_to_kt_class_ref =
#ifdef TOOLS_ENABLED
            new_fqdn_to_kt_class
#else
            fqdn_to_kt_class
#endif
    ;

#ifdef TOOLS_ENABLED
    for (const Ref<WeakRef>& weak_ref: source_scripts) {
        if (auto* source_script {Object::cast_to<SourceScript>(weak_ref->get_ref()) }) {
            source_script->kotlin_class = nullptr;
        }
    }
#endif

    for (KtClass* kotlin_class : classes) {
        fqdn_to_kt_class_ref[kotlin_class->fqdn] = kotlin_class;
        fqdn_to_name_map[kotlin_class->fqdn] = kotlin_class->registered_class_name;

#ifdef TOOLS_ENABLED

        if (Ref<WeakRef>* weak_ref {source_scripts_map.getptr(kotlin_class->fqdn)}) {
            if (auto* source_script {Object::cast_to<SourceScript>(weak_ref->ptr()->get_ref())}) {
                source_script->kotlin_class = kotlin_class;
            }
        }

#endif
    }

#ifdef TOOLS_ENABLED
    fqdn_to_kt_class = new_fqdn_to_kt_class;

    // We have to delay the call to update_script_exports. The engine is not fully initialized and scripts can cause undefined behaviors.
    MessageQueue::get_singleton()->push_callable(callable_mp(this, &JvmScriptManager::update_all_scripts).bind(last_reload));
#endif

    JVM_DEV_LOG("JVM scripts are now loaded.");
}

Ref<NamedScript> JvmScriptManager::get_named_script_from_index(int p_index) const {
    // No check. Meant to be a fast operation
    return named_scripts[p_index];
}

Ref<NamedScript> JvmScriptManager::get_named_script_from_source_script(Ref<SourceScript> p_source_script) const {
    String path = p_source_script->get_functional_name();

    if (fqdn_to_name_map.has(path)) {
        StringName name = fqdn_to_name_map[path];
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

Ref<SourceScript> JvmScriptManager::get_script_from_fqdn(const StringName& p_fqdn) const {
    if (HashMap<StringName, Ref<WeakRef>>::ConstIterator element = source_scripts_map.find(p_fqdn)) {
        return Ref<SourceScript>(element->value->get_ref());
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

    for (const Ref<WeakRef>& weak_ref: source_scripts) {
        if (auto* source_script {Object::cast_to<SourceScript>(weak_ref->get_ref()) }) {
            source_script->update_script_exports();
            source_script->set_last_time_source_modified(update_time);
        }
    }
}

void JvmScriptManager::invalidate_source(const Ref<SourceScript>& source_script) {
    if (source_script.is_null()) { return; }

    uint64_t last_modified = source_script->get_last_modified_time();

    // If the jvm_script is already in cache, it means the Godot editor has reloaded it because the sources have changed.
    source_script->set_last_time_source_modified(last_modified);

    // Update the .gdj if it exists.
    Ref<NamedScript> named_script = JvmScriptManager::get_instance()->get_named_script_from_source_script(source_script);
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
    singleton->name_to_fqdn_map.clear();
    singleton->fqdn_to_name_map.clear();
    singleton->source_scripts.clear();
    singleton->source_scripts_map.clear();

    singleton->fqdn_to_kt_class.clear();
    memdelete(singleton);
}

JvmScriptManager* JvmScriptManager::get_instance() {
    static JvmScriptManager* instance {memnew(JvmScriptManager)};
    return instance;
}
