
#include "jvm_script_manager.h"

#include "lifecycle/paths.h"

#include <core/io/resource_loader.h>

void JvmScriptManager::create_and_update_scripts(Vector<KtClass*>& classes) {
#if defined(DEBUG_ENABLED) && !defined(TOOLS_ENABLED)
    JVM_ERR_FAIL_COND_MSG(named_scripts.size() != 0, "JVM scripts are being initialized more than once.");
#endif

#ifdef TOOLS_ENABLED
    last_reload = OS::get_singleton()->get_unix_time();

#endif

    JVM_DEV_LOG("Loading JVM Scripts...");

#ifdef TOOLS_ENABLED
    HashMap<StringName, KtClass*> new_name_to_kt_class;
    HashMap<StringName, KtClass*> new_fqdn_to_kt_class;
#endif

    HashMap<StringName, KtClass*>& name_to_kt_class_ref =
#ifdef TOOLS_ENABLED
            new_name_to_kt_class
#else
            name_to_kt_class
#endif
            ;

    HashMap<StringName, KtClass*>& fqdn_to_kt_class_ref =
#ifdef TOOLS_ENABLED
            new_fqdn_to_kt_class
#else
            fqdn_to_kt_class
#endif
    ;

#ifdef TOOLS_ENABLED
    for (const Ref<WeakRef>& weak_ref: named_scripts) {
        if (auto* named_script { Object::cast_to<NamedScript>(weak_ref->get_ref()) }) {
            named_script->kotlin_class = nullptr;
        }
    }

    for (const Ref<WeakRef>& weak_ref: source_scripts) {
        if (auto* source_script {Object::cast_to<SourceScript>(weak_ref->get_ref()) }) {
            source_script->kotlin_class = nullptr;
        }
    }
#endif

    for (KtClass* kotlin_class : classes) {
        name_to_kt_class_ref[kotlin_class->registered_class_name] = kotlin_class;
        fqdn_to_kt_class_ref[kotlin_class->fqdn] = kotlin_class;

#ifdef TOOLS_ENABLED

        if (Ref<WeakRef>* weak_ref {named_scripts_map.getptr(kotlin_class->registered_class_name)}) {
            if (auto* named_script {Object::cast_to<NamedScript>(weak_ref->ptr()->get_ref())}) {
                named_script->kotlin_class = kotlin_class;
            }
        }

        if (Ref<WeakRef>* weak_ref {source_scripts_map.getptr(kotlin_class->fqdn)}) {
            if (auto* source_script {Object::cast_to<SourceScript>(weak_ref->ptr()->get_ref())}) {
                source_script->kotlin_class = kotlin_class;
            }
        }

#endif
    }

#ifdef TOOLS_ENABLED
    for (const KeyValue<StringName, KtClass*>& entry: fqdn_to_kt_class) {
        delete entry.value;
    }
    fqdn_to_kt_class = new_fqdn_to_kt_class;
    name_to_kt_class = new_name_to_kt_class;

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
    if (HashMap<StringName, Ref<WeakRef>>::ConstIterator element = named_scripts_map.find(name)) {
        return Ref<NamedScript>(element->value->get_ref());
    }
    return {};
}

Ref<SourceScript> JvmScriptManager::get_script_from_fqdn(const StringName& p_fqdn) const {
    if (HashMap<StringName, Ref<WeakRef>>::ConstIterator element = source_scripts_map.find(p_fqdn)) {
        return Ref<SourceScript>(element->value->get_ref());
    }
    return {};
}

KtClass* JvmScriptManager::get_kt_class_from_name(const String& p_name) const {
    if (HashMap<StringName, KtClass*>::ConstIterator element = name_to_kt_class.find(p_name)) {
        return element->value;
    }

    return {};
}

#ifdef TOOLS_ENABLED
void JvmScriptManager::update_all_scripts(uint64_t update_time) {
    for (const Ref<WeakRef>& weak_ref: named_scripts) {
        if (auto* named_script { Object::cast_to<NamedScript>(weak_ref->get_ref()) }) {
            named_script->update_script_exports();
            named_script->set_last_time_source_modified(update_time);
        }
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

    for (const KeyValue<StringName, KtClass*>& entry: singleton->fqdn_to_kt_class) {
        delete entry.value;
    }
    singleton->fqdn_to_kt_class.clear();
    singleton->name_to_kt_class.clear();

    memdelete(singleton);
}

JvmScriptManager* JvmScriptManager::get_instance() {
    static JvmScriptManager* instance {memnew(JvmScriptManager)};
    return instance;
}
