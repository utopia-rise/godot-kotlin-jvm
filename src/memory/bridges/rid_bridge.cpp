#include "gd_kotlin.h"
#include "rid_bridge.h"
#include "constants.h"
#include "bridges_utils.h"

using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(RidBridge)

RidBridge::RidBridge(jni::JObject p_wrapped, jni::JObject p_class_loader)
    : JavaInstanceWrapper(RID_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader) {
    jni::JNativeMethod engine_call_constructor_method{
            const_cast<char*>("engine_call_constructor"),
            const_cast<char*>("()J"),
            (void*) RidBridge::engine_call_constructor
    };
    jni::JNativeMethod engine_call_constructor_arg_method{
            const_cast<char*>("engine_call_constructor"),
            const_cast<char*>("(J)J"),
            (void*) RidBridge::engine_call_constructor_arg
    };

    jni::JNativeMethod engine_call_getID_method{
            const_cast<char*>("engine_call_getID"),
            const_cast<char*>("(J)V"),
            (void*) RidBridge::engine_call_getID
    };
    jni::JNativeMethod engine_call_compareTo_method{
            const_cast<char*>("engine_call_compareTo"),
            const_cast<char*>("(J)V"),
            (void*) RidBridge::engine_call_compareTo
    };
    jni::JNativeMethod engine_call_equals_method{
            const_cast<char*>("engine_call_equals"),
            const_cast<char*>("(J)V"),
            (void*) RidBridge::engine_call_equals
    };

    Vector<jni::JNativeMethod> methods;

    methods.push_back(engine_call_constructor_method);
    methods.push_back(engine_call_constructor_arg_method);
    methods.push_back(engine_call_getID_method);
    methods.push_back(engine_call_compareTo_method);
    methods.push_back(engine_call_equals_method);

    jni::Env env{jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}

uintptr_t RidBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(RID));
}

uintptr_t RidBridge::engine_call_constructor_arg(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    if (auto* ref{from_uint_to_ptr<Resource>(p_raw_ptr)}) {
        return reinterpret_cast<uintptr_t>(memnew(RID(ref->get_rid())));
    } else {
        return reinterpret_cast<uintptr_t>(memnew(RID));
    }
}

void RidBridge::engine_call_getID(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<RID>(p_raw_ptr)->get_id()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void RidBridge::engine_call_compareTo(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    Variant args[1] = {};
    transfer_context->read_args(env, args);
    Variant variant{*from_uint_to_ptr<RID>(p_raw_ptr) < args[0].operator ::RID()};
    transfer_context->write_return_value(env, variant);
}

void RidBridge::engine_call_equals(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    Variant args[1] = {};
    transfer_context->read_args(env, args);
    Variant variant{*from_uint_to_ptr<RID>(p_raw_ptr) == args[0].operator ::RID()};
    transfer_context->write_return_value(env, variant);
}
