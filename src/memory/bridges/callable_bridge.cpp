#include "callable_bridge.h"

#include "bridges_utils.h"
#include "constants.h"
#include "gd_kotlin.h"
#include "jni/class_loader.h"

using namespace bridges;

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    CallableBridge,
    INIT_NATIVE_METHOD("engine_call_constructor", "()J", CallableBridge::engine_call_constructor)
    INIT_NATIVE_METHOD("engine_call_constructor_object_string_name", "()J", CallableBridge::engine_call_constructor_object_string_name)
    //INIT_NATIVE_METHOD("engine_call_constructor_kt_custom_callable", "(Lgodot/core/KtCustomCallable;)J", CallableBridge::engine_call_constructor_kt_custom_callable)
    INIT_NATIVE_METHOD("engine_call_copy_constructor", "()J", CallableBridge::engine_call_copy_constructor)
    INIT_NATIVE_METHOD("engine_call_bind", "(J)V", CallableBridge::engine_call_bind)
    INIT_NATIVE_METHOD("engine_call_bindv", "(J)V", CallableBridge::engine_call_bindv)
    INIT_NATIVE_METHOD("engine_call_call", "(J)V", CallableBridge::engine_call_call)
    INIT_NATIVE_METHOD("engine_call_call_deferred", "(J)V", CallableBridge::engine_call_call_deferred)
    INIT_NATIVE_METHOD("engine_call_callv", "(J)V", CallableBridge::engine_call_callv)
    INIT_NATIVE_METHOD("engine_call_get_bound_arguments", "(J)V", CallableBridge::engine_call_get_bound_arguments)
    INIT_NATIVE_METHOD("engine_call_get_bound_arguments_count", "(J)V", CallableBridge::engine_call_get_bound_arguments_count)
    INIT_NATIVE_METHOD("engine_call_get_method", "(J)V", CallableBridge::engine_call_get_method)
    INIT_NATIVE_METHOD("engine_call_get_object", "(J)V", CallableBridge::engine_call_get_object)
    INIT_NATIVE_METHOD("engine_call_get_object_id", "(J)V", CallableBridge::engine_call_get_object_id)
    INIT_NATIVE_METHOD("engine_call_hash", "(J)V", CallableBridge::engine_call_hash)
    INIT_NATIVE_METHOD("engine_call_is_custom", "(J)V", CallableBridge::engine_call_is_custom)
    INIT_NATIVE_METHOD("engine_call_is_null", "(J)V",CallableBridge::engine_call_is_null)
    INIT_NATIVE_METHOD("engine_call_is_standard", "(J)V", CallableBridge::engine_call_is_standard)
    INIT_NATIVE_METHOD("engine_call_is_valid", "(J)V", CallableBridge::engine_call_is_valid)
    INIT_NATIVE_METHOD("engine_call_rpc", "(J)V", CallableBridge::engine_call_rpc)
    INIT_NATIVE_METHOD("engine_call_rpc_id", "(J)V",CallableBridge::engine_call_rpc_id)
    INIT_NATIVE_METHOD("engine_call_unbind", "(J)V", CallableBridge::engine_call_unbind)
  )
// clang-format on

CallableBridge::StringNames CallableBridge::string_names;

uintptr_t CallableBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(Callable));
}

uintptr_t CallableBridge::engine_call_constructor_object_string_name(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(Callable(args[0].operator Object*(), args[1].operator StringName())));
}

//TODO: Enable that code again when KtCustomCallable is back
//uintptr_t CallableBridge::engine_call_constructor_kt_custom_callable(JNIEnv* p_raw_env, jobject p_instance, jobject p_kt_custom_callable_instance) {
//    return reinterpret_cast<uintptr_t>(
//      memnew(Callable(memnew(KtCustomCallable(p_kt_custom_callable_instance))))
//    );
//}

uintptr_t CallableBridge::engine_call_copy_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(Callable(args[0].operator Callable())));
}

void CallableBridge::engine_call_bind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};

    Variant args[MAX_FUNCTION_ARG_COUNT];
    uint32_t args_size {transfer_context->read_args(env, args)};

    const Variant* args_ptr[MAX_FUNCTION_ARG_COUNT];
    for (uint32_t i = 0; i < args_size; ++i) {
        args_ptr[i] = &args[i];
    }

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->bindp(args_ptr, args_size)};
    transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_bindv(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->bindv(args[0])};
    transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_call(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};

    Variant args[MAX_FUNCTION_ARG_COUNT];
    uint32_t args_size {transfer_context->read_args(env, args)};

    const Variant* args_ptr[MAX_FUNCTION_ARG_COUNT];
    for (uint32_t i = 0; i < args_size; ++i) {
        args_ptr[i] = &args[i];
    }

    Variant result;
    Callable::CallError error;
    from_uint_to_ptr<Callable>(p_raw_ptr)->callp(args_ptr, args_size, result, error);
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_call_deferred(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};

    Variant args[MAX_FUNCTION_ARG_COUNT];
    uint32_t args_size {transfer_context->read_args(env, args)};

    const Variant* args_ptr[MAX_FUNCTION_ARG_COUNT];
    for (uint32_t i = 0; i < args_size; ++i) {
        args_ptr[i] = &args[i];
    }

    from_uint_to_ptr<Callable>(p_raw_ptr)->call_deferredp(args_ptr, args_size);
}

void CallableBridge::engine_call_callv(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->callv(args[0])};
    transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_get_bound_arguments(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->get_bound_arguments()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_get_bound_arguments_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->get_bound_arguments_count()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_get_method(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->get_method()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_get_object(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->get_object()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_get_object_id(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->get_object_id()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_hash(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->hash()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_is_custom(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->is_custom()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_is_null(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->is_null()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_is_standard(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->is_standard()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_is_valid(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->is_valid()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_rpc(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};

    Variant args[MAX_FUNCTION_ARG_COUNT];
    uint32_t args_size {transfer_context->read_args(env, args)};

    const Variant* args_ptr[MAX_FUNCTION_ARG_COUNT];
    for (uint32_t i = 0; i < args_size; ++i) {
        args_ptr[i] = &args[i];
    }
    Variant instance {*from_uint_to_ptr<Callable>(p_raw_ptr)};
    instance.call(string_names.func_rpc, args_ptr);
}

void CallableBridge::engine_call_rpc_id(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};

    Variant args[MAX_FUNCTION_ARG_COUNT];
    uint32_t args_size {transfer_context->read_args(env, args)};

    const Variant* args_ptr[MAX_FUNCTION_ARG_COUNT];
    for (uint32_t i = 0; i < args_size; ++i) {
        args_ptr[i] = &args[i];
    }

    Variant instance {*from_uint_to_ptr<Callable>(p_raw_ptr)};
    instance.call(string_names.func_rpc_id, args_ptr);
}

void CallableBridge::engine_call_unbind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->unbind(args[0])};
    transfer_context->write_return_value(env, result);
}

CallableBridge::CallableBridge(jni::JObject p_wrapped) : JavaInstanceWrapper(p_wrapped) {
    string_names.func_rpc = _scs_create("rpc");
    string_names.func_rpc_id = _scs_create("rpc_id");
}