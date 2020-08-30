#ifndef GODOT_JVM_GD_KOTLIN_H
#define GODOT_JVM_GD_KOTLIN_H
#include "jni/wrapper.h"
#include "bootstrap.h"
#include "kt_class.h"
#include "core/map.h"
#include "core/ustring.h"
#include "transfer_context.h"

class GDKotlin {
private:
    GDKotlin() = default;
    ~GDKotlin() = default;

    Map<StringName, KtClass*> classes;

    jni::JObject class_loader;
    Bootstrap* bootstrap;
public:
    String scripts_root;
    TransferContext* transfer_context;

    GDKotlin(const GDKotlin&) = delete;

    static GDKotlin& get_instance();

    GDKotlin& operator=(const GDKotlin&) = delete;

    void init();
    void finish();

    jni::JObject& get_class_loader();

    void register_classes(jni::Env& p_env, jni::JObjectArray p_classes);
    void unregister_classes(jni::Env& p_env, jni::JObjectArray p_classes);

    KtClass* find_class(const String& p_script_path);
};


#endif //GODOT_JVM_GD_KOTLIN_H
