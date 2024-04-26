#include "gd_print_bridge.h"

#include "jvm_wrapper/memory/transfer_context.h"

using namespace bridges;

void GDPrintBridge::print(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    print_line(args[0].operator String());
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

GDPrintBridge::~GDPrintBridge() = default;