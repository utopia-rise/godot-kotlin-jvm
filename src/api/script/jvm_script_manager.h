#ifndef GODOT_JVM_JVM_SCRIPT_MANAGER_H
#define GODOT_JVM_JVM_SCRIPT_MANAGER_H

#include "jvm_script.h"
#include "resource_format/jvm_resource_format_loader.h"

// TODO: Transform this class into JarResource when moving to CPP reloading.
class JvmScriptManager: public Object {
    friend class Memory;

    Vector<Ref<NamedScript>> named_scripts;
    HashMap<StringName, Ref<NamedScript>> named_scripts_map;

    HashMap<String, StringName> fqdn_to_name_map;
    HashMap<StringName, String> name_to_fqdn_map;

    Vector<Ref<WeakRef>> source_scripts;
    HashMap<StringName, Ref<WeakRef>> source_scripts_map;

    HashMap<StringName, KtClass*> fqdn_to_kt_class;

#ifdef TOOLS_ENABLED
    uint64_t last_reload = 0;
    void update_all_scripts(uint64_t update_time);
#endif

public:
    // Must be public, or we can't use memnew and memdelete.
    JvmScriptManager() = default;
    ~JvmScriptManager() = default;

    JvmScriptManager(const JvmScriptManager&) = delete;
    void operator=(const JvmScriptManager&) = delete;
    JvmScriptManager& operator=(JvmScriptManager&&) noexcept = delete;
    JvmScriptManager(JvmScriptManager&&) noexcept = delete;

    static JvmScriptManager* get_instance();

    void create_and_update_scripts(Vector<KtClass*>& classes);

    Ref<NamedScript> get_script_from_name(const StringName& name) const;
    Ref<NamedScript> get_named_script_from_index(int p_index) const;
    Ref<NamedScript> get_named_script_from_source_script(Ref<SourceScript> p_source_script) const;
    Ref<SourceScript> get_script_from_fqdn(const StringName& p_fqdn) const;

    template<class SCRIPT>
    Ref<SCRIPT> get_or_create_named_script(const String& p_path, bool* created);
    template<class SCRIPT>
    Ref<SCRIPT> get_or_create_source_script(const String& p_path, bool* created, Error* r_error);

    static void finalize();

#ifdef TOOLS_ENABLED
    int64_t get_last_reload();

    void invalidate_source(const Ref<SourceScript>& source_script);
#endif
};

template<class SCRIPT>
Ref<SCRIPT> JvmScriptManager::get_or_create_named_script(const String& p_path, bool* created) {
    if constexpr (!std::is_base_of<NamedScript, SCRIPT>()) { return {}; }
    // Placeholder scripts have to be registered in the TypeManager in order to be transformed in valid scripts when the jar is built.

    *created = false;
    Ref<SCRIPT> jvm_script;
    // Named scripts are created and cached when loading the usercode, we create a placeholder if missing.
    String script_name = JvmScript::get_script_file_name(p_path);
    jvm_script = get_script_from_name(script_name);
    if (jvm_script.is_null()) {
        jvm_script.instantiate();
        *created = true;
        named_scripts_map[script_name] = jvm_script;
        named_scripts.push_back(jvm_script);
    }
    return jvm_script;
}

template<class SCRIPT>
Ref<SCRIPT> JvmScriptManager::get_or_create_source_script(const String& p_path, bool* created, Error* r_error) {
    if constexpr (!std::is_base_of<JvmScript, SCRIPT>()) { return {}; }
    // Placeholder scripts have to be registered in the TypeManager in order to be transformed in valid scripts when the jar is built.

    *created = false;
    // If a named script weak ref is already created and valid, we return it, otherwise we create the script
    String source_code;
    StringName fqdn { SourceScript::parse_source_to_fqdn(p_path, source_code, r_error) };
    Ref<SCRIPT> jvm_script = get_script_from_fqdn(fqdn);
    if (jvm_script.is_null()) {
        jvm_script.instantiate();
        jvm_script->kotlin_class = fqdn_to_kt_class[fqdn];
        *created = true;

        jvm_script->set_source_code(source_code);
        jvm_script->_functional_name = fqdn;

        Ref<WeakRef> weak_ref;
        weak_ref.instantiate();
        weak_ref->set_ref(jvm_script);

        source_scripts_map[jvm_script->get_functional_name()] = weak_ref;
        source_scripts.push_back(weak_ref);
    }
    return jvm_script;
}

#endif// GODOT_JVM_JVM_SCRIPT_MANAGER_H
