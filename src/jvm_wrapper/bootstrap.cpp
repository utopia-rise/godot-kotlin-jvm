#include "bootstrap.h"


Bootstrap::LoadClassesHook Bootstrap::load_classes {};
Bootstrap::RegisterManagedEngineTypesHook Bootstrap::register_engine_type {};

Bootstrap::Bootstrap(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {}

void Bootstrap::register_hooks(LoadClassesHook p_load_classes_hook, RegisterManagedEngineTypesHook p_register_managed_engine_types_hook) {
    Bootstrap::load_classes = p_load_classes_hook;
    Bootstrap::register_engine_type = p_register_managed_engine_types_hook;
}

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
    CALL_JVM_METHOD_WITH_ARG(p_env, INIT, args);
}

void Bootstrap::finish(jni::Env& p_env) {
    CALL_JVM_METHOD(p_env, FINISH);
}
