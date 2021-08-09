#ifndef GODOT_JVM_GD_KOTLIN_H
#define GODOT_JVM_GD_KOTLIN_H

#include "jni/wrapper.h"
#include "bootstrap.h"
#include "kt_class.h"
#include "core/map.h"
#include "core/ustring.h"
#include "transfer_context.h"
#include "modules/kotlin_jvm/src/bridges/memory_bridge.h"
#include "kotlin_script.h"
#include "gd_kotlin_configuration.h"

class GDKotlin {
private:
    GDKotlin();

    ~GDKotlin() = default;

    Map<StringName, KtClass*> classes;

    Bootstrap* bootstrap;

    bool is_gc_started;

    GdKotlinConfiguration configuration;

    Error _split_jvm_debug_argument(const String& cmd_arg, String& result);

    static void _check_and_copy_jar(const String& jar_name);
    static jni::JObject _prepare_class_loader(jni::Env& p_env, jni::Jvm::Type type);

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
};


#endif //GODOT_JVM_GD_KOTLIN_H
