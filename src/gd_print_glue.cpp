#include "gd_print_glue.h"
#include "gd_kotlin.h"
#include <core/print_string.h>

JNI_INIT_STATICS_FOR_CLASS(GDPrintGlue)

GDPrintGlue::GDPrintGlue(jni::JObject p_wrapped, jni::JObject p_class_loader)
        : JavaInstanceWrapper("godot.core.GDPrintGlue", p_wrapped, p_class_loader) {
    jni::JNativeMethod print_method{
            "print",
            "(Ljava/lang/String;)V",
            (void *) GDPrintGlue::print
    };

    jni::JNativeMethod print_err_method{
            "printErr",
            "(Ljava/lang/String;)V",
            (void *) GDPrintGlue::print_err
    };

    jni::JNativeMethod print_raw_method{
            "printRaw",
            "(Ljava/lang/String;)V",
            (void *) GDPrintGlue::print_raw
    };

    Vector<jni::JNativeMethod> methods;
    methods.push_back(print_method);
    methods.push_back(print_err_method);
    methods.push_back(print_raw_method);
    jni::Env env{jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
}

void GDPrintGlue::print(JNIEnv *p_env, jobject p_this, jstring p_message) {
    jni::Env env(p_env);
    print_line(env.from_jstring(jni::JString{p_message}));
    jni::JObject j_object{p_this};
    j_object.delete_local_ref(env);
}

void GDPrintGlue::print_err(JNIEnv *p_env, jobject p_this, jstring p_message) {
    jni::Env env(p_env);
    print_error(env.from_jstring(jni::JString{p_message}));
    jni::JObject j_object{p_this};
    j_object.delete_local_ref(env);
}

void GDPrintGlue::print_raw(JNIEnv *p_env, jobject p_this, jstring p_message) {
    jni::Env env(p_env);
    OS::get_singleton()->print("%s", env.from_jstring(jni::JString{p_message}).utf8().get_data());
    jni::JObject j_object{p_this};
    j_object.delete_local_ref(env);
}
