#ifndef GODOT_JVM_TYPE_MANAGER_H
#define GODOT_JVM_TYPE_MANAGER_H

#include "java_singleton_wrapper.h"
#include "jni/env.h"
#include "kotlin_script.h"

#include <core/string/string_name.h>
#include <core/templates/hash_map.h>

class TypeManager : public JavaSingletonWrapper<TypeManager> {
public:
    void clear();
    int get_java_engine_type_constructor_index_for_type(const StringName& p_type_name) const;
    bool java_engine_type_constructor_for_type_exists(const StringName& p_type_name) const;
    const StringName& get_engine_type_for_index(int p_index) const;
    const String& get_engine_singleton_name_for_index(int p_index) const;
    const Ref<KotlinScript>& get_user_script_for_index(int p_index) const;
    const Ref<KotlinScript> get_user_script_from_name(StringName name) const;

    void register_engine_types(jni::Env& p_env, jni::JObjectArray& p_engine_types);
    void register_engine_singletons(jni::Env& p_env, jni::JObjectArray& p_singletons);
    void create_and_update_scripts(Vector<KtClass*>& classes);
    template<bool named>
    Ref<KotlinScript> create_script(const String& p_path);

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

    Vector<Ref<KotlinScript>> named_user_scripts;
    HashMap<StringName, Ref<KotlinScript>> named_user_scripts_map;

    Vector<Ref<KotlinScript>> path_user_scripts;
    HashMap<String, StringName> filepath_to_name_map;

    TypeManager(jni::JObject p_wrapped);
};

template<bool named>
Ref<KotlinScript> TypeManager::create_script(const String& p_path) {
    // Placeholder scripts have to be registered in the TypeManager in order to be transformed in valid scripts when the jar is built.
    Ref<KotlinScript> ref;
    ref.instantiate();
    ref->set_path(p_path, true);
    if (named) {
        named_user_scripts_map[ref->get_global_name()] = ref;
        named_user_scripts.push_back(ref);
    } else {
        if (filepath_to_name_map.has(p_path)) {
            ref->kotlin_class = named_user_scripts_map[filepath_to_name_map[p_path]]->kotlin_class;
            path_user_scripts.push_back(ref);
        }
    }
    return ref;
}

#endif// GODOT_JVM_TYPE_MANAGER_H
