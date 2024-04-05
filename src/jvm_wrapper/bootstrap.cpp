#include "bootstrap.h"

#include "gd_kotlin.h"

void Bootstrap::load_classes(JNIEnv* p_env, jobject p_this, jobjectArray p_classes) {
    jni::Env env(p_env);
    jni::JObjectArray classes {jni::JObjectArray(p_classes)};
    jni::JObject j_object {p_this};

    GDKotlin::get_instance().register_classes(env, classes);

    j_object.delete_local_ref(env);
    classes.delete_local_ref(env);
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

Bootstrap::Bootstrap(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {}


void Bootstrap::init(jni::Env& p_env, bool p_is_editor, const String& p_project_path, const String& p_jar_path, const String& p_jar_file, const jni::JObject& p_class_loader) {
    LOCAL_FRAME(3);
    jni::JObject project_path = p_env.new_string(p_project_path.utf8().get_data());
    jni::JObject jar_path = p_env.new_string(p_jar_path.utf8().get_data());
    jni::JObject jar_file {p_env.new_string(p_jar_file.utf8().get_data())};
    jvalue args[5] = {
      jni::to_jni_arg(p_is_editor),
      jni::to_jni_arg(project_path),
      jni::to_jni_arg(jar_path),
      jni::to_jni_arg(jar_file),
      jni::to_jni_arg(p_class_loader)};
    wrapped.call_void_method(p_env, INIT, args);
}

void Bootstrap::finish(jni::Env& p_env) {
    wrapped.call_void_method(p_env, FINISH);
}