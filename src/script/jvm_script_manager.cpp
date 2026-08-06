#include "jvm_script_manager.h"

#include "jvm_wrapper/memory/type_manager.h"
#include "language/names.h"

#include <core/io/file_access.h>
#include <core/object/callable_mp.h>
#include <core/object/message_queue.h>
#include <core/os/os.h>

JvmScriptManager* JvmScriptManager::singleton = nullptr;

JvmScriptManager* JvmScriptManager::get_instance() {
    if (!singleton) { singleton = memnew(JvmScriptManager); }
    return singleton;
}

void JvmScriptManager::finalize() {
    JvmScriptManager* manager = singleton;
    singleton = nullptr;
    memdelete(manager);
}

static Ref<JvmScript> _create_script_for_extension(const String& p_extension) {
    const String extension = p_extension.to_lower();

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

    if (extension == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        Ref<GdjScript> script;
        script.instantiate();
        return script;
    }

    JVM_ERR_FAIL_V_MSG({}, "Unsupported JVM script extension: %s", extension);
}

Ref<JvmScript> JvmScriptManager::get_script_from_fqdn(const StringName& p_fqdn) const {
    if (const HashMap<StringName, Ref<WeakRef>>::ConstIterator script = fqdn_to_script.find(p_fqdn)) {
        return script->value->get_ref();
    }
    return {};
}

void JvmScriptManager::set_script_for_fqdn(const StringName& p_fqdn, JvmScript* p_script) {
    Ref<WeakRef> script;
    script.instantiate();
    script->set_obj(p_script);
    fqdn_to_script[p_fqdn] = script;
}

Ref<JvmScript> JvmScriptManager::get_script_from_registered_name(const StringName& p_name) const {
    const HashMap<StringName, Ref<JvmScript>>::ConstIterator script = registered_name_to_script.find(p_name);
    return script ? script->value : Ref<JvmScript>();
}

Ref<JvmScript> JvmScriptManager::create_virtual_script(KtClass* p_kotlin_class) {
    const String extension = p_kotlin_class->source_file_name.is_empty()
                             ? GODOT_JVM_REGISTRATION_FILE_EXTENSION
                             : p_kotlin_class->source_file_name.get_extension().to_lower();
    Ref<JvmScript> jvm_script = _create_script_for_extension(extension);
    const String path = String(GODOT_JVM_VIRTUAL_PATH_PREFIX) + String(p_kotlin_class->registered_class_name) + "." + extension;
    jvm_script->set_path(path, true);
    jvm_script->kotlin_class = p_kotlin_class;

    registered_name_to_script[p_kotlin_class->registered_class_name] = jvm_script;
    set_script_for_fqdn(p_kotlin_class->fqdn, jvm_script.ptr());
    JVM_DEV_VERBOSE("JVM Script created: %s", p_kotlin_class->registered_class_name);
    return jvm_script;
}

#ifdef TOOLS_ENABLED
void JvmScriptManager::update_script(JvmScript* p_script, KtClass* p_kotlin_class) {
    p_script->kotlin_class = p_kotlin_class;
    p_script->export_dirty_flag = true;

    registered_name_to_script[p_kotlin_class->registered_class_name] = Ref<JvmScript>(p_script);
    set_script_for_fqdn(p_kotlin_class->fqdn, p_script);
    JVM_DEV_VERBOSE("JVM Script updated: %s", p_kotlin_class->registered_class_name);
}
#endif

void JvmScriptManager::initialize_scripts(const Vector<KtClass*>& classes) {
#ifdef TOOLS_ENABLED
    last_jar_modified_time = OS::get_singleton()->get_unix_time();

    // The registered names and type indices describe only the current JAR.
    registered_name_to_script.clear();
    fqdn_to_class_index.clear();

    // Reset the previous JAR model while retaining each script as an FQCN candidate.
    for (const KeyValue<StringName, Ref<WeakRef>>& key_value : fqdn_to_script) {
        Ref<JvmScript> script = key_value.value->get_ref();
        if (script.is_valid()) {
            delete script->kotlin_class;
            script->kotlin_class = nullptr;
        }
    }
#endif

    JVM_DEV_LOG("Loading JVM Scripts...");
    jni::Env env {jni::Jvm::current_env()};

    // Bind each new KtClass to its canonical script by FQCN.
    int class_index = 0;
    for (KtClass* kotlin_class : classes) {
        Ref<JvmScript> jvm_script;

#ifdef TOOLS_ENABLED
        fqdn_to_class_index[kotlin_class->fqdn] = class_index;

        // The FQCN identifies the same script regardless of whether it is physical or virtual.
        jvm_script = get_script_from_fqdn(kotlin_class->fqdn);
        if (jvm_script.is_valid()) {
            // Bind this JAR class to the existing physical or virtual script.
            update_script(jvm_script.ptr(), kotlin_class);
        } else
#endif
        {
            // No physical or previous virtual script matched, so this class needs a new virtual script.
            jvm_script = create_virtual_script(kotlin_class);
        }

        TypeManager::get_instance().assign_script_to_class(env, class_index++, jvm_script);
    }

#ifdef TOOLS_ENABLED
    // Drop weak entries left by virtual scripts released when the old registered names were cleared.
    Vector<StringName> dead_fqdns;
    for (const KeyValue<StringName, Ref<WeakRef>>& key_value : fqdn_to_script) {
        if (key_value.value->get_ref().is_null()) { dead_fqdns.append(key_value.key); }
    }
    for (const StringName& fqdn : dead_fqdns) {
        fqdn_to_script.erase(fqdn);
    }

    // We have to delay the call to update_script_exports. The engine is not fully initialized and scripts can cause undefined behaviors.
    MessageQueue::get_singleton()->push_callable(callable_mp(this, &JvmScriptManager::update_all_scripts));
#endif

    JVM_DEV_LOG("JVM scripts are now loaded.");
}

#ifdef TOOLS_ENABLED
void JvmScriptManager::update_all_scripts() {
    for (const KeyValue<StringName, Ref<JvmScript>>& key_value : registered_name_to_script) {
        key_value.value->update_script_exports();
        key_value.value->update_source_sync_warning();
    }
}

uint64_t JvmScriptManager::get_last_jar_modified_time() const {
    return last_jar_modified_time;
}
#endif

Ref<JvmScript> JvmScriptManager::create_and_bind_physical_script(const String& p_path, const StringName& p_fqdn) {
    Ref<JvmScript> jvm_script;

    // Reuse the script already known for this source class, including a virtual one.
    if (!p_fqdn.is_empty()) {
        jvm_script = get_script_from_fqdn(p_fqdn);
        if (jvm_script.is_valid()) {
#ifdef TOOLS_ENABLED
            const String existing_path = jvm_script->get_path();
            if (!existing_path.begins_with(GODOT_JVM_VIRTUAL_PATH_PREFIX) && existing_path != p_path
                && FileAccess::exists(existing_path)) {
                JVM_ERR_FAIL_V_MSG({}, "JVM script %s is already associated with physical file %s and cannot also use %s.", p_fqdn, existing_path, p_path);
            }
#endif
        }
    }

#ifdef TOOLS_ENABLED
    // No script is known yet, so create the resource type matching the source extension.
    if (jvm_script.is_null()) { jvm_script = _create_script_for_extension(p_path.get_extension()); }

    // The returned script now represents this real source resource.
    jvm_script->last_physical_fqdn = p_fqdn;
    if (!p_fqdn.is_empty()) { set_script_for_fqdn(p_fqdn, jvm_script.ptr()); }
#endif
    return jvm_script;
}

#ifdef TOOLS_ENABLED
void JvmScriptManager::replace_virtual_script(JvmScript* p_physical_script, JvmScript* p_virtual_script) {
    p_physical_script->kotlin_class = p_virtual_script->kotlin_class;
    p_virtual_script->kotlin_class = nullptr;
    p_physical_script->export_dirty_flag = true;

    p_virtual_script->move_placeholders_to(p_physical_script);

    const StringName fqdn = p_physical_script->last_physical_fqdn;
    registered_name_to_script[p_physical_script->kotlin_class->registered_class_name] = Ref<JvmScript>(p_physical_script);
    set_script_for_fqdn(fqdn, p_physical_script);

    const auto class_index = fqdn_to_class_index.find(fqdn);
    jni::Env env {jni::Jvm::current_env()};
    TypeManager::get_instance().assign_script_to_class(env, class_index->value, Ref<JvmScript>(p_physical_script));
}

void JvmScriptManager::update_physical_script(JvmScript* p_script, const StringName& p_fqdn) {
    // Source refresh already happened; no reconciliation is needed while this physical script stays canonical.
    if (p_script->last_physical_fqdn == p_fqdn && (p_fqdn.is_empty() || get_script_from_fqdn(p_fqdn).ptr() == p_script)) {
        return;
    }

    // Remove the old identity before assigning the source's newly parsed FQCN.
    if (!p_script->last_physical_fqdn.is_empty()) {
        if (get_script_from_fqdn(p_script->last_physical_fqdn).ptr() == p_script) {
            fqdn_to_script.erase(p_script->last_physical_fqdn);
        }
    }

    // The old JAR class still needs a script when this source now represents another class.
    if (p_script->kotlin_class && p_script->kotlin_class->fqdn != p_fqdn) {
        KtClass* kotlin_class = p_script->kotlin_class;
        p_script->kotlin_class = nullptr;
        const int class_index = fqdn_to_class_index.find(kotlin_class->fqdn)->value;
        Ref<JvmScript> virtual_script = create_virtual_script(kotlin_class);
        jni::Env env {jni::Jvm::current_env()};
        TypeManager::get_instance().assign_script_to_class(env, class_index, virtual_script);
    }

    p_script->last_physical_fqdn = p_fqdn;
    // Incomplete source has no stable identity to reconcile yet.
    if (p_fqdn.is_empty()) { return; }

    // Reconcile this physical source with the script currently identified by its new FQCN.
    Ref<JvmScript> existing = get_script_from_fqdn(p_fqdn);
    if (existing.is_valid() && existing.ptr() != p_script
        && !existing->get_path().begins_with(GODOT_JVM_VIRTUAL_PATH_PREFIX) && FileAccess::exists(existing->get_path())) {
        ERR_PRINT(vformat(
          "JVM script %s is already associated with physical file %s and cannot also use %s.",
          p_fqdn,
          existing->get_path(),
          p_script->get_path()
        ));
        return;
    }

    // A virtual match is promoted to this physical resource; otherwise this physical script becomes canonical.
    if (existing.is_valid() && existing.ptr() != p_script && existing->kotlin_class
        && existing->get_path().begins_with(GODOT_JVM_VIRTUAL_PATH_PREFIX)) {
        replace_virtual_script(p_script, existing.ptr());
    } else {
        set_script_for_fqdn(p_fqdn, p_script);
    }
}

void JvmScriptManager::untrack_physical_script(JvmScript* p_script) {
    if (!singleton) { return; }

    if (!p_script->last_physical_fqdn.is_empty()) {
        if (singleton->get_script_from_fqdn(p_script->last_physical_fqdn).ptr() == p_script) {
            singleton->fqdn_to_script.erase(p_script->last_physical_fqdn);
        }
    }
}
#endif
