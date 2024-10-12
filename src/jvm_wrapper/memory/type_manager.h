#ifndef GODOT_JVM_TYPE_MANAGER_H
#define GODOT_JVM_TYPE_MANAGER_H

#include "core/string/string_name.h"
#include "core/templates/hash_map.h"
#include "jni/env.h"
#include "jvm_wrapper/jvm_singleton_wrapper.h"

// clang-format off
JVM_SINGLETON_WRAPPER(TypeManager, "godot.core.TypeManager") {
    SINGLETON_CLASS(TypeManager)

    INIT_JNI_BINDINGS(
        INIT_NATIVE_METHOD("getMethodBindPtr", "(Ljava/lang/String;Ljava/lang/String;J)J",TypeManager::get_method_bind_ptr)
    )

public:
    void clear();
    int get_java_engine_type_constructor_index_for_type(const StringName& p_type_name) const;
    bool java_engine_type_constructor_for_type_exists(const StringName& p_type_name) const;
    const StringName& get_engine_type_for_index(int p_index) const;
    const String& get_engine_singleton_name_for_index(int p_index) const;

    void register_engine_types(jni::Env& p_env, jni::JObjectArray & p_engine_types);
    void register_engine_singletons(jni::Env& p_env, jni::JObjectArray & p_singletons);

    static uintptr_t get_method_bind_ptr(JNIEnv * p_raw_env, jobject j_instance, jstring p_class_name, jstring p_method_name, jlong hash);

private:
    Vector<StringName> engine_type_names;
    HashMap<StringName, int> java_engine_types_constructors;
    Vector<String> engine_singleton_names;
};

// clang-format on
#endif// GODOT_JVM_TYPE_MANAGER_H
