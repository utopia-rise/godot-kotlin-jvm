#include "bootstrap.h"

JNI_INIT_STATICS_FOR_CLASS(Bootstrap)

Bootstrap::Bootstrap(jni::JObject p_wrapped, jni::JObject p_class_loader) :
  JavaInstanceWrapper("godot.runtime.Bootstrap", p_wrapped, p_class_loader) {}

void Bootstrap::register_hooks(
  jni::Env& p_env,
  LoadClassesHook p_load_classes_hook,
  UnloadClassesHook p_unload_classes_hook,
  RegisterManagedEngineTypesHook p_register_managed_engine_types_hook,
  RegisterUserTypesNamesHook p_user_types_names_hook,
  RegisterUserTypesMembersHook p_user_types_nmembers_hook
) {
    jni::JNativeMethod load_class_hook_method {
      const_cast<char*>("loadClasses"),
      const_cast<char*>("([Lgodot/core/KtClass;)V"),
      (void*) p_load_classes_hook};

    jni::JNativeMethod unload_class_hook_method {
      const_cast<char*>("unloadClasses"),
      const_cast<char*>("([Lgodot/core/KtClass;)V"),
      (void*) p_unload_classes_hook};

    jni::JNativeMethod register_managed_engine_types_method {
      const_cast<char*>("registerManagedEngineTypes"),
      const_cast<char*>("([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/Integer;)V"),
      (void*) p_register_managed_engine_types_hook};

    jni::JNativeMethod register_user_types_names {
      const_cast<char*>("registerUserTypesNames"),
      const_cast<char*>("([Ljava/lang/String;)V"),
      (void*) p_user_types_names_hook};

    jni::JNativeMethod register_user_types_members {
      const_cast<char*>("registerUserTypesMembers"),
      const_cast<char*>("()V"),
      (void*) p_user_types_nmembers_hook};

    Vector<jni::JNativeMethod> methods;
    methods.push_back(load_class_hook_method);
    methods.push_back(unload_class_hook_method);
    methods.push_back(register_managed_engine_types_method);
    methods.push_back(register_user_types_names);
    methods.push_back(register_user_types_members);
    j_class.register_natives(p_env, methods);
}

void Bootstrap::init(jni::Env& p_env, bool p_is_editor, const String& p_project_path, const String& p_jar_path, const String& p_jar_file, const jni::JObject& p_class_loader) {
    jni::MethodId init_method = get_method_id(p_env, jni_methods.INIT);
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
    jni::MethodId finish_method = get_method_id(p_env, jni_methods.FINISH);
    wrapped.call_void_method(p_env, finish_method);
}
