#ifndef GODOT_JVM_JVM_SCRIPT_MANAGER_H
#define GODOT_JVM_JVM_SCRIPT_MANAGER_H

#include "jvm_script.h"

#include <core/object/ref_counted.h>

// TODO: Transform this class into JarResource when moving to CPP reloading.
class JvmScriptManager: public Object {
    static JvmScriptManager* singleton;

    HashMap<StringName, Ref<JvmScript>> registered_name_to_script;
    HashMap<StringName, Ref<WeakRef>> fqdn_to_script;

    Ref<JvmScript> create_virtual_script(KtClass* p_kotlin_class);
    Ref<JvmScript> get_script_from_fqdn(const StringName& p_fqdn) const;
    void set_script_for_fqdn(const StringName& p_fqdn, JvmScript* p_script);

#ifdef TOOLS_ENABLED
    HashMap<StringName, int> fqdn_to_class_index;
    uint64_t last_jar_modified_time = 0;
    void update_script(JvmScript* p_script, KtClass* p_kotlin_class);
    void replace_virtual_script(JvmScript* p_physical_script, JvmScript* p_virtual_script);
    void update_all_scripts();
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
    static void finalize();

    void initialize_scripts(const Vector<KtClass*>& classes);

    Ref<JvmScript> get_script_from_registered_name(const StringName& p_name) const;
    Ref<JvmScript> create_and_bind_physical_script(const String& p_path, const StringName& p_fqdn);

#ifdef TOOLS_ENABLED
    void update_physical_script(JvmScript* p_script, const StringName& p_fqdn);
    uint64_t get_last_jar_modified_time() const;
    static void untrack_physical_script(JvmScript* p_script);
#endif

};

#endif// GODOT_JVM_JVM_SCRIPT_MANAGER_H
