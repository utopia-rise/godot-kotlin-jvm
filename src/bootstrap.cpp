#include "bootstrap.h"
#include <core/print_string.h>

Bootstrap::Bootstrap(jni::JObject p_wrapped, jni::JObject p_class_loader) : JavaInstanceWrapper(
        "godot.runtime.Bootstrap", p_wrapped, p_class_loader) {
}

void Bootstrap::register_hooks(jni::Env& p_env, Bootstrap::LoadClassesHook p_load_classes_hook,
                               Bootstrap::UnloadClassesHook p_unload_classes_hook) {
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

    Vector<jni::JNativeMethod> methods;
    methods.push_back(load_class_hook_method);
    methods.push_back(unload_class_hook_method);
    get_class(p_env).register_natives(p_env, methods);
}

void Bootstrap::init(jni::Env& p_env, bool p_is_editor, const String& p_project_path) {
    jni::MethodId init_method = get_class(p_env).get_method_id(p_env, "init", "(ZLjava/lang/String;)V");
    jni::JObject str = p_env.new_string(p_project_path.utf8().get_data());
    wrapped.call_void_method(p_env, init_method, {static_cast<jboolean>(p_is_editor), str});
}

void Bootstrap::finish(jni::Env& p_env) {
    jni::MethodId finish_method = get_class(p_env).get_method_id(p_env, "finish", "()V");
    wrapped.call_void_method(p_env, finish_method);
}