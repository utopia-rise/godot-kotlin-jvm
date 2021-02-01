#include "bootstrap.h"
#include <core/print_string.h>


JNI_INIT_STATICS_FOR_CLASS(Bootstrap)

Bootstrap::Bootstrap(jni::JObject p_wrapped, jni::JObject p_class_loader) : JavaInstanceWrapper(
        "godot.runtime.Bootstrap", p_wrapped, p_class_loader) {
}

void
Bootstrap::register_hooks(jni::Env& p_env, ProvideSrcDirsHook p_provide_src_dirs_hook, LoadClassesHook p_load_classes_hook, UnloadClassesHook p_unload_classes_hook,
                          RegisterManagedEngineTypes p_register_managed_engine_types_hook) {
    jni::JNativeMethod provide_src_dirs_hook_method {
            "registerSrcDirs",
            "([Ljava/lang/String;)V",
            (void*) p_provide_src_dirs_hook
    };

    jni::JNativeMethod load_class_hook_method {
            "loadClasses",
            "([Lgodot/core/KtClass;)V",
            (void*) p_load_classes_hook
    };

    jni::JNativeMethod unload_class_hook_method {
            "unloadClasses",
            "([Lgodot/core/KtClass;)V",
            (void*) p_unload_classes_hook
    };

    jni::JNativeMethod register_managed_engine_types_method{
            "registerManagedEngineTypes",
            "([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/Integer;)V",
            (void*) p_register_managed_engine_types_hook
    };

    Vector<jni::JNativeMethod> methods;
    methods.push_back(provide_src_dirs_hook_method);
    methods.push_back(load_class_hook_method);
    methods.push_back(unload_class_hook_method);
    methods.push_back(register_managed_engine_types_method);
    j_class.register_natives(p_env, methods);
}

void Bootstrap::init(jni::Env& p_env, bool p_is_editor, const String& p_project_path) {
    jni::MethodId init_method = get_method_id(p_env, jni_methods.INIT);
    jni::JObject str = p_env.new_string(p_project_path.utf8().get_data());
    jvalue args[2] = {jni::to_jni_arg(p_is_editor), jni::to_jni_arg(str)};
    wrapped.call_void_method(p_env, init_method, args);
}

void Bootstrap::finish(jni::Env& p_env) {
    jni::MethodId finish_method = get_method_id(p_env, jni_methods.FINISH);
    wrapped.call_void_method(p_env, finish_method);
}
