#ifndef GODOT_JVM_JVM_SCRIPT_MANAGER_H
#define GODOT_JVM_JVM_SCRIPT_MANAGER_H

#include "jvm_script.h"

class JvmScriptManager {
    Vector<Ref<NamedScript>> named_scripts;
    HashMap<StringName, Ref<NamedScript>> named_scripts_map;

    HashMap<String, StringName> filepath_to_name_map;

    Vector<Ref<PathScript>> path_scripts;
    HashMap<String, Ref<PathScript>> path_scripts_map;

    JvmScriptManager() = default;
    ~JvmScriptManager() = default;

public:
    JvmScriptManager(const JvmScriptManager&) = delete;
    void operator=(const JvmScriptManager&) = delete;
    JvmScriptManager& operator=(JvmScriptManager&&) noexcept = delete;
    JvmScriptManager(JvmScriptManager&&) noexcept = delete;

    static JvmScriptManager& get_instance();

    void create_and_update_scripts(Vector<KtClass*>& classes);

    Ref<NamedScript> get_script_from_name(const StringName& name) const;
    const Ref<NamedScript>& get_named_script_for_index(int p_index) const;
    Ref<PathScript> get_script_from_path(const String& p_path) const;

    template<class SCRIPT>
    Ref<SCRIPT> get_or_create_script(const String& p_path);

    void clear();

#ifdef TOOLS_ENABLED
    void update_all_scripts();
#endif
};

template<class SCRIPT>
Ref<SCRIPT> JvmScriptManager::get_or_create_script(const String& p_path) {
    if constexpr (!std::is_base_of<JvmScript, SCRIPT>()) return {};
    // Placeholder scripts have to be registered in the TypeManager in order to be transformed in valid scripts when the jar is built.

    Ref<SCRIPT> script;
    if constexpr (std::is_base_of<NamedScript, SCRIPT>()) {
        // Named scripts are created and cached when loading the usercode, we create a placeholder if missing.
        String script_name = JvmScript::get_script_file_name(p_path);
        script = get_script_from_name(script_name);
        if (script.is_null()) {
            script.instantiate();
            named_scripts_map[script_name] = script;
            named_scripts.push_back(script);
#ifdef DEBUG_ENABLED
            LOG_WARNING(vformat("Loaded an unregistered JVM Script named %s", script_name));
#endif
        }
    } else if constexpr (std::is_base_of<PathScript, SCRIPT>()) {
        // Path Scripts are created on the fly used the mapping from path to name. If mapping can't be found, we create a placeholder.
        script = get_script_from_path(p_path);
        if (script.is_null()) {
            script.instantiate();
            if (filepath_to_name_map.has(p_path)) {
                script->kotlin_class = named_scripts_map[filepath_to_name_map[p_path]]->kotlin_class;
            }
#ifdef DEBUG_ENABLED
            else {
                LOG_WARNING(vformat("Loaded an unregistered JVM Script with path %s", p_path));
            }
#endif
            path_scripts_map[p_path] = script;
            path_scripts.push_back(script);
        }
    }
    return script;
}

#endif// GODOT_JVM_JVM_SCRIPT_MANAGER_H
