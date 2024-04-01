#include "rid_bridge.h"

#include "bridges_utils.h"
#include "gd_kotlin.h"

using namespace bridges;

uintptr_t RidBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(RID));
}

uintptr_t RidBridge::engine_call_constructor_arg(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    if (auto* rid {from_uint_to_ptr<RID>(p_raw_ptr)}) {
        return reinterpret_cast<uintptr_t>(memnew(RID(*rid)));
    } else {
        return reinterpret_cast<uintptr_t>(memnew(RID));
    }
}

void RidBridge::engine_call_getID(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<RID>(p_raw_ptr)->get_id()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void RidBridge::engine_call_isValid(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<RID>(p_raw_ptr)->is_valid()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void RidBridge::engine_call_compareTo(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    Variant args[1] = {};
    transfer_context->read_args(env, args);
    Variant variant {*from_uint_to_ptr<RID>(p_raw_ptr) < args[0].operator ::RID()};
    transfer_context->write_return_value(env, variant);
}

void RidBridge::engine_call_equals(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    Variant args[1] = {};
    transfer_context->read_args(env, args);
    Variant variant {*from_uint_to_ptr<RID>(p_raw_ptr) == args[0].operator ::RID()};
    transfer_context->write_return_value(env, variant);
}
