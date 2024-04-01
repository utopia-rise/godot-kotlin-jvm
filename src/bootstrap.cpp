#include "bootstrap.h"

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    Bootstrap,
    INIT_JNI_METHOD(INIT)
    INIT_JNI_METHOD(FINISH)
    INIT_NATIVE_METHOD("loadClasses", "([Lgodot/core/KtClass;)V", Bootstrap::load_classes)
    INIT_NATIVE_METHOD("registerManagedEngineTypes", "([Ljava/lang/String;[Ljava/lang/String;)V", Bootstrap::register_engine_type)
)
// clang-format on

Bootstrap::LoadClassesHook Bootstrap::load_classes {};
Bootstrap::RegisterManagedEngineTypesHook Bootstrap::register_engine_type {};

Bootstrap::Bootstrap(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {}

void Bootstrap::register_hooks(LoadClassesHook p_load_classes_hook, RegisterManagedEngineTypesHook p_register_managed_engine_types_hook) {
    Bootstrap::load_classes = p_load_classes_hook;
    Bootstrap::register_engine_type = p_register_managed_engine_types_hook;
}

void Bootstrap::init(jni::Env& p_env, bool p_is_editor, const String& p_project_path, const String& p_jar_path, const String& p_jar_file, const jni::JObject& p_class_loader) {
    LOCAL_FRAME(3);
    jni::MethodId init_method = jni_methods.INIT.method_id;
    jni::JObject project_path = p_env.new_string(p_project_path.utf8().get_data());
    jni::JObject jar_path = p_env.new_string(p_jar_path.utf8().get_data());
    jni::JObject jar_file {p_env.new_string(p_jar_file.utf8().get_data())};
    jvalue args[5] = {
      jni::to_jni_arg(p_is_editor),
      jni::to_jni_arg(project_path),
      jni::to_jni_arg(jar_path),
      jni::to_jni_arg(jar_file),
      jni::to_jni_arg(p_class_loader)};
    wrapped.call_void_method(p_env, init_method, args);
}

void Bootstrap::finish(jni::Env& p_env) {
    jni::MethodId finish_method = jni_methods.FINISH.method_id;
    wrapped.call_void_method(p_env, finish_method);
}
