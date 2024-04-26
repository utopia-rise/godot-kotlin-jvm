#ifndef GODOT_JVM_JVM_SCRIPT_MANAGER_H
#define GODOT_JVM_JVM_SCRIPT_MANAGER_H

#include "jvm_script.h"

class JvmScriptManager {
#ifdef TOOLS_ENABLED
    bool scripts_dirty = false;
#endif

    Vector<Ref<NamedScript>> named_user_scripts;
    HashMap<StringName, Ref<NamedScript>> named_user_scripts_map;

    Vector<Ref<PathScript>> path_user_scripts;
    HashMap<String, StringName> filepath_to_name_map;

    JvmScriptManager() = default;
    ~JvmScriptManager() = default;

public:
    JvmScriptManager(const JvmScriptManager&) = delete;
    void operator=(const JvmScriptManager&) = delete;
    JvmScriptManager& operator=(JvmScriptManager&&) noexcept = delete;
    JvmScriptManager(JvmScriptManager&&) noexcept = delete;

    static JvmScriptManager& get_instance();

    void create_and_update_scripts(Vector<KtClass*>& classes);
    const Ref<NamedScript>& get_user_script_for_index(int p_index) const;
    Ref<NamedScript> get_user_script_from_name(const StringName& name) const;
    void clear();

    template<class C>
    Ref<C> create_script(const String& p_path);

#ifdef TOOLS_ENABLED
    void update_all_exports_if_dirty();
#endif
};

template<class C>
Ref<C> JvmScriptManager::create_script(const String& p_path) {
    if constexpr (!std::is_base_of<JvmScript, C>()) return {};
    // Placeholder scripts have to be registered in the TypeManager in order to be transformed in valid scripts when the jar is built.
    Ref<C> ref;
    ref.instantiate();
    if constexpr (std::is_base_of<NamedScript, C>()) {
        named_user_scripts_map[ref->get_global_name()] = ref;
        named_user_scripts.push_back(ref);
    } else if constexpr (std::is_base_of<PathScript, C>()) {
        if (filepath_to_name_map.has(p_path)) {
            ref->kotlin_class = named_user_scripts_map[filepath_to_name_map[p_path]]->kotlin_class;
            path_user_scripts.push_back(ref);
        }
    }
    return ref;
}

#endif// GODOT_JVM_JVM_SCRIPT_MANAGER_H
