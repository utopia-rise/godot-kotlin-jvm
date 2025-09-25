#include "callable_bridge.h"

#include "bridges_utils.h"
#include "constraints.h"
#include "jvm_wrapper/kotlin_callable_custom.h"
#include "jvm_wrapper/memory/transfer_context.h"
#include "variant_allocator.h"

using namespace bridges;

uintptr_t CallableBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(VariantAllocator::alloc(Callable()));
}

uintptr_t CallableBridge::engine_call_constructor_object_string_name(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    return reinterpret_cast<uintptr_t>(VariantAllocator::alloc(Callable(args[0].operator Object*(), args[1].operator StringName())));
}

uintptr_t CallableBridge::engine_call_constructor_kt_custom_callable(JNIEnv* p_raw_env, jobject p_instance,
                                                                     jobject p_kt_custom_callable_instance,
                                                                     jint p_variant_type_ordinal, jint p_hash_code,
                                                                     jboolean p_has_on_destroy) {
    jni::Env env {p_raw_env};
    return reinterpret_cast<uintptr_t>(
        VariantAllocator::alloc(Callable(memnew(KotlinCallableCustom(env, p_kt_custom_callable_instance, static_cast<Variant::Type>(p_variant_type_ordinal), p_hash_code, p_has_on_destroy))))
    );
}

uintptr_t CallableBridge::engine_call_copy_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    return reinterpret_cast<uintptr_t>(VariantAllocator::alloc(Callable(args[0].operator Callable())));
}

void CallableBridge::engine_call_bind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant args[MAX_FUNCTION_ARG_COUNT];
    uint32_t args_size {TransferContext::get_instance().read_args(env, args)};

    const Variant* args_ptr[MAX_FUNCTION_ARG_COUNT];
    for (uint32_t i = 0; i < args_size; ++i) {
        args_ptr[i] = &args[i];
    }

    Variant result = from_uint_to_ptr<Callable>(p_raw_ptr)->bindp(args_ptr, args_size);
    TransferContext::get_instance().write_return_value(env, result);
}

void CallableBridge::engine_call_bindv(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant result = from_uint_to_ptr<Callable>(p_raw_ptr)->bindv(args[0]);
    TransferContext::get_instance().write_return_value(env, result);
}

void CallableBridge::engine_call_call(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant args[MAX_FUNCTION_ARG_COUNT];
    uint32_t args_size {TransferContext::get_instance().read_args(env, args)};

    const Variant* args_ptr[MAX_FUNCTION_ARG_COUNT];
    for (uint32_t i = 0; i < args_size; ++i) {
        args_ptr[i] = &args[i];
    }

    Variant result;
    Callable::CallError error;
    from_uint_to_ptr<Callable>(p_raw_ptr)->callp(args_ptr, args_size, result, error);
    TransferContext::get_instance().write_return_value(env, result);
}

void CallableBridge::engine_call_call_deferred(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant args[MAX_FUNCTION_ARG_COUNT];
    uint32_t args_size {TransferContext::get_instance().read_args(env, args)};

    const Variant* args_ptr[MAX_FUNCTION_ARG_COUNT];
    for (uint32_t i = 0; i < args_size; ++i) {
        args_ptr[i] = &args[i];
    }

    from_uint_to_ptr<Callable>(p_raw_ptr)->call_deferredp(args_ptr, args_size);
}

void CallableBridge::engine_call_callv(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant result = from_uint_to_ptr<Callable>(p_raw_ptr)->callv(args[0]);
    TransferContext::get_instance().write_return_value(env, result);
}

void CallableBridge::engine_call_get_bound_arguments(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result = from_uint_to_ptr<Callable>(p_raw_ptr)->get_bound_arguments();
    TransferContext::get_instance().write_return_value(env, result);
}

void CallableBridge::engine_call_get_bound_arguments_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result = from_uint_to_ptr<Callable>(p_raw_ptr)->get_bound_arguments_count();
    TransferContext::get_instance().write_return_value(env, result);
}

void CallableBridge::engine_call_get_method(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result = from_uint_to_ptr<Callable>(p_raw_ptr)->get_method();
    TransferContext::get_instance().write_return_value(env, result);
}

void CallableBridge::engine_call_get_object(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result = from_uint_to_ptr<Callable>(p_raw_ptr)->get_object();
    TransferContext::get_instance().write_return_value(env, result);
}

void CallableBridge::engine_call_get_object_id(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result = from_uint_to_ptr<Callable>(p_raw_ptr)->get_object_id();
    TransferContext::get_instance().write_return_value(env, result);
}

void CallableBridge::engine_call_hash(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result =from_uint_to_ptr<Callable>(p_raw_ptr)->hash();
    TransferContext::get_instance().write_return_value(env, result);
}

void CallableBridge::engine_call_is_custom(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result =from_uint_to_ptr<Callable>(p_raw_ptr)->is_custom();
    TransferContext::get_instance().write_return_value(env, result);
}

void CallableBridge::engine_call_is_null(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result =from_uint_to_ptr<Callable>(p_raw_ptr)->is_null();
    TransferContext::get_instance().write_return_value(env, result);
}

void CallableBridge::engine_call_is_standard(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result =from_uint_to_ptr<Callable>(p_raw_ptr)->is_standard();
    TransferContext::get_instance().write_return_value(env, result);
}

void CallableBridge::engine_call_is_valid(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant result =from_uint_to_ptr<Callable>(p_raw_ptr)->is_valid();
    TransferContext::get_instance().write_return_value(env, result);
}

void CallableBridge::engine_call_rpc(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant args[MAX_FUNCTION_ARG_COUNT];
    uint32_t args_size {TransferContext::get_instance().read_args(env, args)};

    const Variant* args_ptr[MAX_FUNCTION_ARG_COUNT];
    for (uint32_t i = 0; i < args_size; ++i) {
        args_ptr[i] = &args[i];
    }
    Variant instance = *from_uint_to_ptr<Callable>(p_raw_ptr);
    instance.call(SNAME("rpc"), args_ptr);
}

void CallableBridge::engine_call_rpc_id(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant args[MAX_FUNCTION_ARG_COUNT];
    uint32_t args_size {TransferContext::get_instance().read_args(env, args)};

    const Variant* args_ptr[MAX_FUNCTION_ARG_COUNT];
    for (uint32_t i = 0; i < args_size; ++i) {
        args_ptr[i] = &args[i];
    }

    Variant instance = *from_uint_to_ptr<Callable>(p_raw_ptr);
    instance.call(SNAME("rpc_id"), args_ptr);
}

void CallableBridge::engine_call_unbind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant result =from_uint_to_ptr<Callable>(p_raw_ptr)->unbind(args[0]);
    TransferContext::get_instance().write_return_value(env, result);
}

CallableBridge::~CallableBridge() = default;