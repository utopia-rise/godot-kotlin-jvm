#ifndef GODOT_JVM_JVM_SCRIPT_MANAGER_H
#define GODOT_JVM_JVM_SCRIPT_MANAGER_H

#include "jvm_script.h"

// TODO: Transform this class into JarResource when moving to CPP reloading.
class JvmScriptManager: public Object {
    friend class Memory;

    Vector<Ref<NamedScript>> named_scripts;
    HashMap<StringName, Ref<NamedScript>> named_scripts_map;

    HashMap<String, StringName> filepath_to_name_map;
    HashMap<StringName, String> name_to_filepath_map;

    Vector<Ref<SourceScript>> path_scripts;
    HashMap<String, Ref<SourceScript>> path_scripts_map;

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
    Ref<NamedScript> get_named_script_from_pathScript(Ref<SourceScript> pathScript) const;
    Ref<SourceScript> get_script_from_path(const String& p_path) const;

    template<class SCRIPT>
    Ref<SCRIPT> get_or_create_script(const String& p_path, bool* created);

    static void finalize();

#ifdef TOOLS_ENABLED
    int64_t get_last_reload();

    void invalidate_source(String path);
#endif
};

template<class SCRIPT>
Ref<SCRIPT> JvmScriptManager::get_or_create_script(const String& p_path, bool* created) {
    if constexpr (!std::is_base_of<JvmScript, SCRIPT>()) { return {}; }
    // Placeholder scripts have to be registered in the TypeManager in order to be transformed in valid scripts when the jar is built.

    *created = false;
    Ref<SCRIPT> jvm_script;
    if constexpr (std::is_base_of<NamedScript, SCRIPT>()) {
        // Named scripts are created and cached when loading the usercode, we create a placeholder if missing.
        String script_name = JvmScript::get_script_file_name(p_path);
        jvm_script = get_script_from_name(script_name);
        if (jvm_script.is_null()) {
            jvm_script.instantiate();
            *created = true;
            named_scripts_map[script_name] = jvm_script;
            named_scripts.push_back(jvm_script);
        }
    } else if constexpr (std::is_base_of<SourceScript, SCRIPT>()) {
        // Path Scripts are created and cached when loading the usercode, we create a placeholder if missing.
        jvm_script = get_script_from_path(p_path);
        if (jvm_script.is_null()) {
            jvm_script.instantiate();
            *created = true;
            path_scripts_map[p_path] = jvm_script;
            path_scripts.push_back(jvm_script);
        }
    }
    return jvm_script;
}

#endif// GODOT_JVM_JVM_SCRIPT_MANAGER_H
