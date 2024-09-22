#include "gd_print_bridge.h"

#include "jvm_wrapper/memory/transfer_context.h"

using namespace bridges;

void GDPrintBridge::print(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    print_line(args[0].operator String());
}

void GDPrintBridge::print_rich(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    print_line_rich(args[0].operator String());
}

void GDPrintBridge::print_verbose2(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    print_verbose(args[0].operator String());
}

void GDPrintBridge::print_err(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    print_error(args[0].operator String());
}

void GDPrintBridge::print_raw(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    OS::get_singleton()->print("%s", (args[0].operator String()).utf8().get_data());
}

void GDPrintBridge::push_error(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    ERR_PRINT(args[0].operator String());
}

void GDPrintBridge::push_warning(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    WARN_PRINT(args[0].operator String());
}

GDPrintBridge::~GDPrintBridge() = default;