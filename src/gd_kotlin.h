#ifndef GODOT_JVM_GD_KOTLIN_H
#define GODOT_JVM_GD_KOTLIN_H
#include "jni/wrapper.h"
#include "bootstrap.h"
#include "kt_class.h"
#include "core/map.h"
#include "core/ustring.h"
#include "transfer_context.h"
#include "modules/kotlin_jvm/src/bridges/memory_bridge.h"

class GDKotlin {
private:
    GDKotlin();
    ~GDKotlin() = default;

    Map<StringName, KtClass*> classes;

    jni::JObject class_loader;
    Bootstrap* bootstrap;

    bool is_gc_started;

    Error split_jvm_debug_argument(const String& cmd_arg, String& result);
public:
    String scripts_root;
    TransferContext* transfer_context;
    Vector<StringName> engine_type_names;
    Vector<MethodBind*> engine_type_method;
    Vector<String> engine_singleton_names;

    Vector<StringName> user_type_names;

    GDKotlin(const GDKotlin&) = delete;

    static GDKotlin& get_instance();

    GDKotlin& operator=(const GDKotlin&) = delete;

    void init();
    void finish();

    jni::JObject& get_class_loader();

    void register_classes(jni::Env& p_env, jni::JObjectArray p_classes);
    void unregister_classes(jni::Env& p_env, jni::JObjectArray p_classes);

    KtClass* find_class(const String& p_script_path);
    KtClass* find_class_by_name(const String& class_name);

};


#endif //GODOT_JVM_GD_KOTLIN_H
