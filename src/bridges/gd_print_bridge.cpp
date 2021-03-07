#include <core/reference.h>
#include <modules/kotlin_jvm/src/gd_kotlin.h>
#include "gd_print_bridge.h"
#include "constants.h"
#include "bridges_utils.h"

using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(GDPrintBridge)

GDPrintBridge::GDPrintBridge(jni::JObject p_wrapped, jni::JObject p_class_loader)
    : JavaInstanceWrapper(GD_PRINT_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader) {
    jni::JNativeMethod print_method{
            "print",
            "()V",
            (void *) GDPrintBridge::print
    };

    jni::JNativeMethod print_err_method{
            "printErr",
            "()V",
            (void *) GDPrintBridge::print_err
    };

    jni::JNativeMethod print_raw_method{
            "printRaw",
            "()V",
            (void *) GDPrintBridge::print_raw
    };

    Vector<jni::JNativeMethod> methods;
    methods.push_back(print_method);
    methods.push_back(print_err_method);
    methods.push_back(print_raw_method);

    jni::Env env{jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}

void GDPrintBridge::print(JNIEnv *p_raw_env, jobject p_instance) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    print_line(args[0].operator String());
}

void GDPrintBridge::print_err(JNIEnv *p_raw_env, jobject p_instance) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    print_error(args[0].operator String());
}

void GDPrintBridge::print_raw(JNIEnv *p_raw_env, jobject p_instance) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    OS::get_singleton()->print("%s", (args[0].operator String()).utf8().get_data());
}
