#ifndef GODOT_JVM_GD_KOTLIN_H
#define GODOT_JVM_GD_KOTLIN_H

#include "bootstrap.h"
#include "gd_kotlin_configuration.h"
#include "jni/wrapper.h"
#include "kotlin_script.h"
#include "kt_class.h"
#include "memory/transfer_context.h"

#include <core/string/ustring.h>

class GDKotlin {
private:
    GDKotlin();

    ~GDKotlin() = default;

    HashMap<StringName, KtClass*> classes;

    Bootstrap* bootstrap;

    bool is_gc_started;

    GdKotlinConfiguration configuration;

    Error _split_jvm_debug_argument(const String& cmd_arg, String& result);

    static void _check_and_copy_jar(const String& jar_name);
    static jni::JObject _prepare_class_loader(jni::Env& p_env, jni::Jvm::Type type);

    bool check_configuration();

    bool is_initialized;

    Vector<Pair<String, String>> configuration_errors;

public:
    TransferContext* transfer_context;
    Vector<StringName> engine_type_names;
    Vector<MethodBind*> engine_type_method;
    Vector<String> engine_singleton_names;

    Vector<Ref<KotlinScript>> user_scripts;

    GDKotlin(const GDKotlin&) = delete;

    static GDKotlin& get_instance();

    GDKotlin& operator=(const GDKotlin&) = delete;

    void init();

    void finish();

    void register_classes(jni::Env& p_env, jni::JObjectArray p_classes);

    void register_members(jni::Env& p_env);

    void unregister_classes(jni::Env& p_env, jni::JObjectArray p_classes);

    KtClass* find_class(const StringName& p_script_path);

    const GdKotlinConfiguration& get_configuration();

    bool initialized() const;

    const Vector<Pair<String, String>>& get_configuration_errors() const;
};

#endif// GODOT_JVM_GD_KOTLIN_H
