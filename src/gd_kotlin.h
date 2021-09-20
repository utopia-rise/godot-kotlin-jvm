#ifndef GODOT_JVM_GD_KOTLIN_H
#define GODOT_JVM_GD_KOTLIN_H

#include <modules/kotlin_jvm/src/jni/jvm.h>
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

    bool is_usercode_loaded;

    GdKotlinConfiguration configuration;

    static jni::JObject _prepare_class_loader(jni::Env& p_env, jni::Jvm::Type type, const String& usercode_jar);

    bool check_configuration();

    bool is_initialized;

    Vector<Pair<String, String>> configuration_errors;

#ifdef TOOLS_ENABLED
    uint64_t copied_user_jar_modification_time = 0;
#endif

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

    void init_usercode();
    void teardown_usercode();

    void finish();

    void register_classes(jni::Env& p_env, jni::JObjectArray p_classes);

    void register_members(jni::Env& p_env);

    void unregister_classes(jni::Env& p_env, jni::JObjectArray p_classes);

    KtClass* find_class(const StringName& p_script_path);

    const GdKotlinConfiguration& get_configuration();

    bool initialized() const;

    const Vector<Pair<String, String>>& get_configuration_errors() const;

    bool copy_usercode_jar_if_necessary();
};


#endif //GODOT_JVM_GD_KOTLIN_H
