#include "type_manager.h"

#include <core/io/resource_loader.h>
#include <modules/kotlin_jvm/src/jni/class_loader.h>

TypeManager& TypeManager::get_instance() {
    static TypeManager instance;
    return instance;
}

void TypeManager::clear() {
    engine_type_names.clear();
    java_engine_types_constructors.clear();
    engine_singleton_names.clear();
    engine_type_method.clear();
    user_scripts.clear();
}

int TypeManager::get_java_engine_type_constructor_index_for_type(const StringName& p_type_name) const {
    return java_engine_types_constructors[p_type_name];
}

bool TypeManager::java_engine_type_constructor_for_type_exists(const StringName& p_type_name) const {
    return java_engine_types_constructors.has(p_type_name);
}

const StringName& TypeManager::get_engine_type_for_index(int p_index) const {
    return engine_type_names[p_index];
}

MethodBind* TypeManager::get_engine_type_method_for_index(int p_index) const {
    return engine_type_method[p_index];
}

const String& TypeManager::get_engine_singleton_name_for_index(int p_index) const {
    return engine_singleton_names[p_index];
}

const Ref<KotlinScript>& TypeManager::get_user_script_for_index(int p_index) const {
    return user_scripts[p_index];
}

void TypeManager::register_engine_types(jni::Env& p_env, jni::JObjectArray& p_engine_types) {
    for (int i = 0; i < p_engine_types.length(p_env); ++i) {
        jni::JObject type = p_engine_types.get(p_env, i);
        const String& class_name = p_env.from_jstring(static_cast<jni::JString>(type));
        engine_type_names.insert(i, class_name);
        java_engine_types_constructors[class_name] = i;
#ifdef DEBUG_ENABLED
        LOG_VERBOSE(vformat("Registered %s engine type with index %s.", class_name, i));
#endif
        type.delete_local_ref(p_env);
    }
}

void TypeManager::register_engine_singletons(jni::Env& p_env, jni::JObjectArray& p_singletons) {
    for (int i = 0; i < p_singletons.length(p_env); ++i) {
        jni::JObject name = p_singletons.get(p_env, i);
        const String& singleton_name {p_env.from_jstring(static_cast<jni::JString>(name))};
        engine_singleton_names.insert(i, singleton_name);
        name.delete_local_ref(p_env);
    }
}

void TypeManager::register_methods(jni::Env& p_env, jni::JObjectArray& method_names, jni::JObjectArray& types_of_methods) {
    jni::JClass integer_class {p_env.load_class("java.lang.Integer", ClassLoader::get_default_loader())};
    jni::MethodId integer_get_value_method {integer_class.get_method_id(p_env, "intValue", "()I")};
    for (int i = 0; i < method_names.length(p_env); i++) {
        jni::JObject type = types_of_methods.get(p_env, i);
        jni::JObject name = method_names.get(p_env, i);
        int type_of_method {static_cast<int>(type.call_int_method(p_env, integer_get_value_method))};
        engine_type_method.insert(i, ClassDB::get_method(engine_type_names[type_of_method], p_env.from_jstring(name)));
        name.delete_local_ref(p_env);
        type.delete_local_ref(p_env);
    }
    integer_class.delete_local_ref(p_env);
}

void TypeManager::register_user_types(jni::Env& p_env, jni::JObjectArray& p_types) {
    LOG_VERBOSE("Starting to register user types...");
    for (int i = 0; i < p_types.length(p_env); ++i) {
        const String& script_path {p_env.from_jstring(static_cast<jni::JString>(p_types.get(p_env, i)))};
        user_scripts.insert(i, ResourceLoader::load(script_path, "KotlinScript"));
#ifdef DEBUG_ENABLED
        LOG_VERBOSE(vformat("Registered %s user type with index %s.", script_path, i));
#endif
    }
    LOG_VERBOSE("Done registering user types.");
}