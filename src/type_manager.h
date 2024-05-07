#ifndef GODOT_JVM_TYPE_MANAGER_H
#define GODOT_JVM_TYPE_MANAGER_H

#include "java_singleton_wrapper.h"
#include "jni/env.h"
#include "script/jvm_script.h"

#include <core/string/string_name.h>
#include <core/templates/hash_map.h>

class TypeManager : public JavaSingletonWrapper<TypeManager> {
public:
    void clear();
    int get_java_engine_type_constructor_index_for_type(const StringName& p_type_name) const;
    bool java_engine_type_constructor_for_type_exists(const StringName& p_type_name) const;
    const StringName& get_engine_type_for_index(int p_index) const;
    const String& get_engine_singleton_name_for_index(int p_index) const;
    const Ref<NamedScript>& get_user_script_for_index(int p_index) const;
    Ref<NamedScript> get_user_script_from_name(const StringName& name) const;

    void register_engine_types(jni::Env& p_env, jni::JObjectArray& p_engine_types);
    void register_engine_singletons(jni::Env& p_env, jni::JObjectArray& p_singletons);
    void create_and_update_scripts(Vector<KtClass*>& classes);

    template<class C>
    Ref<C> create_script(const String& p_path);

#ifdef TOOLS_ENABLED
    void update_all_exports_if_dirty();
#endif

    static uintptr_t get_method_bind_ptr(JNIEnv* p_raw_env, jobject j_instance, jstring p_class_name, jstring p_method_name);

    static TypeManager* init();

    ~TypeManager() = default;

    TypeManager(const TypeManager&) = delete;
    TypeManager& operator=(const TypeManager&) = delete;

    // clang-format off
    DECLARE_JNI_METHODS()
    // clang-format on

private:
    Vector<StringName> engine_type_names;
    HashMap<StringName, int> java_engine_types_constructors;
    Vector<String> engine_singleton_names;

    Vector<Ref<NamedScript>> named_user_scripts;
    HashMap<StringName, Ref<NamedScript>> named_user_scripts_map;

    Vector<Ref<PathScript>> path_user_scripts;
    HashMap<String, StringName> filepath_to_name_map;

    TypeManager(jni::JObject p_wrapped);
};

template<class C>
Ref<C> TypeManager::create_script(const String& p_path) {
    if constexpr(!std::is_base_of<JvmScript, C>()) return {};
    // Placeholder scripts have to be registered in the TypeManager in order to be transformed in valid scripts when the jar is built.
    Ref<C> ref;
    ref.instantiate();
    if constexpr(std::is_base_of<NamedScript, C>()) {
        named_user_scripts_map[ref->get_global_name()] = ref;
        named_user_scripts.push_back(ref);
    } else if constexpr(std::is_base_of<PathScript, C>()) {
        if (filepath_to_name_map.has(p_path)) {
            ref->kotlin_class = named_user_scripts_map[filepath_to_name_map[p_path]]->kotlin_class;
            path_user_scripts.push_back(ref);
        }
    }
    return ref;
}

#endif// GODOT_JVM_TYPE_MANAGER_H
