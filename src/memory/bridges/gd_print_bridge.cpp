#include "gd_print_bridge.h"

#include "constants.h"
#include "gd_kotlin.h"

using namespace bridges;

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    GDPrintBridge,
    INIT_NATIVE_METHOD(print_method, "print", "()V", GDPrintBridge::print)
    INIT_NATIVE_METHOD(print_err_method, "printErr", "()V", GDPrintBridge::print_err)
    INIT_NATIVE_METHOD(print_raw_method, "printRaw", "()V", GDPrintBridge::print_raw)
  )

// clang-format on

GDPrintBridge::GDPrintBridge(jni::JObject p_wrapped) : JavaInstanceWrapper(p_wrapped) {}

void GDPrintBridge::print(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    print_line(args[0].operator String());
}

void GDPrintBridge::print_err(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    print_error(args[0].operator String());
}

void GDPrintBridge::print_raw(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    OS::get_singleton()->print("%s", (args[0].operator String()).utf8().get_data());
}
