#include "bootstrap.h"
#include <core/print_string.h>


JNI_INIT_STATICS_FOR_CLASS(Bootstrap)

Bootstrap::Bootstrap(jni::JObject p_wrapped, jni::JObject p_class_loader) : JavaInstanceWrapper(
        "godot.runtime.Bootstrap", p_wrapped, p_class_loader) {
}

void
Bootstrap::register_hooks(jni::Env& p_env, LoadClassesHook p_load_classes_hook, UnloadClassesHook p_unload_classes_hook,
                          RegisterManagedEngineTypesHook p_register_managed_engine_types_hook,
                          RegisterUserTypesNamesHook p_user_types_names_hook, RegisterUserTypesMembersHook p_user_types_nmembers_hook) {
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
            "([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/Integer;)V",
            (void*) p_register_managed_engine_types_hook
    };

    jni::JNativeMethod register_user_types_names {
            "registerUserTypesNames",
            "([Ljava/lang/String;)V",
            (void*) p_user_types_names_hook
    };

    jni::JNativeMethod register_user_types_members {
            "registerUserTypesMembers",
            "()V",
            (void*) p_user_types_nmembers_hook
    };

    Vector<jni::JNativeMethod> methods;
    methods.push_back(load_class_hook_method);
    methods.push_back(unload_class_hook_method);
    methods.push_back(register_managed_engine_types_method);
    methods.push_back(register_user_types_names);
    methods.push_back(register_user_types_members);
    j_class.register_natives(p_env, methods);
}

void Bootstrap::init(jni::Env& p_env) {
    jni::MethodId init_method = get_method_id(p_env, jni_methods.INIT);
    wrapped.call_void_method(p_env, init_method);
}

void Bootstrap::finish(jni::Env& p_env) {
    jni::MethodId finish_method = get_method_id(p_env, jni_methods.FINISH);
    wrapped.call_void_method(p_env, finish_method);
}
