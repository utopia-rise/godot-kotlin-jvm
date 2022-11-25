#ifndef GODOT_JVM_TYPE_MANAGER_H
#define GODOT_JVM_TYPE_MANAGER_H


#include <core/string_name.h>
#include <core/hash_map.h>
#include <modules/kotlin_jvm/src/jni/env.h>
#include "kotlin_script.h"

class TypeManager {
public:
    void clear();
    int get_java_engine_type_constructor_index_for_type(const StringName& p_type_name) const;
    bool java_engine_type_constructor_for_type_exists(const StringName& p_type_name) const;
    const StringName& get_engine_type_for_index(int p_index) const;
    MethodBind* get_engine_type_method_for_index(int p_index) const;
    const String& get_engine_singleton_name_for_index(int p_index) const;
    const Ref<KotlinScript>& get_user_script_for_index(int p_index) const;

    void register_engine_types(jni::Env& p_env, jni::JObjectArray& p_engine_types);
    void register_engine_singletons(jni::Env& p_env, jni::JObjectArray& p_singletons);
    void register_methods(jni::Env& p_env, jni::JObjectArray& method_names, jni::JObjectArray& types_of_methods);
    void register_user_types(jni::Env& p_env, jni::JObjectArray& p_types);

    TypeManager(const TypeManager&) = delete;

    static TypeManager& get_instance();

    TypeManager& operator=(const TypeManager&) = delete;

private:
    Vector<StringName> engine_type_names;
    HashMap<StringName, int> java_engine_types_constructors;
    Vector<String> engine_singleton_names;
    Vector<MethodBind*> engine_type_method;

    Vector<Ref<KotlinScript>> user_scripts;

    TypeManager() = default;
    ~TypeManager() = default;
};


#endif //GODOT_JVM_TYPE_MANAGER_H
