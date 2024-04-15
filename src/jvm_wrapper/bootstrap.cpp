#include "bootstrap.h"

#include "gd_kotlin.h"
#include "jvm_wrapper/memory/type_manager.h"
#include "script/jvm_script_manager.h"

void Bootstrap::load_classes(JNIEnv* p_env, jobject p_this, jobjectArray p_classes) {
    jni::Env env(p_env);
    jni::JObjectArray jni_classes {p_classes};
    jni::JObject j_object {p_this};

    Vector<KtClass*> classes;
    for (auto i = 0; i < jni_classes.length(env); i++) {
        KtClass* kt_class = new KtClass(env, jni_classes.get(env, i));
        kt_class->fetch_members(env);
        classes.append(kt_class);
        LOG_DEV_VERBOSE(vformat("Loaded class %s : %s", kt_class->registered_class_name, kt_class->base_godot_class));
    }

    j_object.delete_local_ref(env);
    jni_classes.delete_local_ref(env);

    JvmScriptManager::get_instance().create_and_update_scripts(classes);
}

void Bootstrap::register_engine_type(JNIEnv* p_env, jobject p_this, jobjectArray p_classes_names, jobjectArray p_singleton_names) {
#ifdef DEV_ENABLED
    LOG_VERBOSE("Starting to register managed engine types...");
#endif
    jni::Env env(p_env);

    jni::JObjectArray engine_types {p_classes_names};
    TypeManager::get_instance().register_engine_types(env, engine_types);

    jni::JObjectArray singleton_names {p_singleton_names};
    TypeManager::get_instance().register_engine_singletons(env, singleton_names);

    jni::JObject j_object {p_this};
    j_object.delete_local_ref(env);
    engine_types.delete_local_ref(env);
    singleton_names.delete_local_ref(env);
#ifdef DEV_ENABLED
    LOG_VERBOSE("Done registering managed engine types...");
#endif
}

Bootstrap::Bootstrap(jni::Env& p_env, jni::JObject p_wrapped) : JvmInstanceWrapper(p_env, p_wrapped) {}

void Bootstrap::init(jni::Env& p_env, const String& p_project_path, const String& p_jar_file, const jni::JObject& p_class_loader) {
    LOCAL_FRAME(2);
    jni::JObject project_path = p_env.new_string(p_project_path.utf8().get_data());
    jni::JObject jar_file {p_env.new_string(p_jar_file.utf8().get_data())};
    jvalue args[5] = {jni::to_jni_arg(project_path), jni::to_jni_arg(jar_file), jni::to_jni_arg(p_class_loader)};
    wrapped.call_void_method(p_env, INIT, args);
}

void Bootstrap::finish(jni::Env& p_env) {
    wrapped.call_void_method(p_env, FINISH);
}