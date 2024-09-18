#include "type_manager.h"

void TypeManager::clear() {
    engine_type_names.clear();
    java_engine_types_constructors.clear();
    engine_singleton_names.clear();
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

const String& TypeManager::get_engine_singleton_name_for_index(int p_index) const {
    return engine_singleton_names[p_index];
}

void TypeManager::register_engine_types(jni::Env& p_env, jni::JObjectArray& p_engine_types) {
    for (int i = 0; i < p_engine_types.length(p_env); ++i) {
        jni::JObject type = p_engine_types.get(p_env, i);
        const String& class_name = p_env.from_jstring(static_cast<jni::JString>(type));
        engine_type_names.insert(i, class_name);
        java_engine_types_constructors[class_name] = i;
#ifdef DEV_ENABLED
        JVM_LOG_VERBOSE("Registered %s engine type with index %s.", class_name, i);
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

uintptr_t TypeManager::get_method_bind_ptr(JNIEnv* p_raw_env, jobject j_instance, jstring p_class_name, jstring p_method_name, jlong hash) {
    jni::Env env {p_raw_env};
    String class_name {env.from_jstring(jni::JString(p_class_name))};
    String method_name {env.from_jstring(jni::JString(p_method_name))};

    MethodBind* bind {ClassDB::get_method(class_name, method_name)};

    JVM_ERR_FAIL_COND_V_MSG(!bind, 0, "Method %s from Class %s doesn't exist. Check that your JVM Godot-Kotlin library matches this Godot version.", method_name, class_name);
    JVM_ERR_FAIL_COND_V_MSG(bind->get_hash() != hash, 0, "Hash mismatch for Method %s from Class %s. Check that your JVM Godot-Kotlin library matches this Godot version.", method_name, class_name);

    return reinterpret_cast<uintptr_t>(bind);

}

TypeManager::~TypeManager() = default;