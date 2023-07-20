#include "callable_bridge.h"

#include "bridges_utils.h"
#include "constants.h"
#include "gd_kotlin.h"
#include "jni/class_loader.h"

using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(CallableBridge)

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

uintptr_t CallableBridge::engine_call_constructor_kt_custom_callable(JNIEnv* p_raw_env, jobject p_instance, jobject p_kt_custom_callable_instance) {
    return reinterpret_cast<uintptr_t>(
      memnew(Callable(memnew(KtCustomCallable(p_kt_custom_callable_instance, ClassLoader::get_default_loader()))))
    );
}

uintptr_t CallableBridge::engine_call_copy_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(Callable(args[0].operator Callable())));
}

void CallableBridge::engine_call_bind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    uint32_t args_size {transfer_context->read_args_size(env)};
    Variant arg_store[5];
    const Variant* arg_pointers[5];
    for (uint32_t i = 0; i < args_size; ++i) {
        arg_store[i] = transfer_context->read_single_arg(env);
        arg_pointers[i] = &arg_store[i];
    }
    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->bindp(arg_pointers, args_size)};
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
    uint32_t args_size {GDKotlin::get_instance().transfer_context->read_args_size(env)};

    Variant arg_store[5];
    const Variant* arg_pointers[5];
    for (uint32_t i = 0; i < args_size; ++i) {
        arg_store[i] = GDKotlin::get_instance().transfer_context->read_single_arg(env);
        arg_pointers[i] = &arg_store[i];
    }
    Variant result;
    Callable::CallError error;
    from_uint_to_ptr<Callable>(p_raw_ptr)->callp(arg_pointers, args_size, result, error);
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_call_deferred(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    uint32_t args_size {GDKotlin::get_instance().transfer_context->read_args_size(env)};

    Variant arg_store[5];
    const Variant* arg_pointers[5];
    for (uint32_t i = 0; i < args_size; ++i) {
        arg_store[i] = GDKotlin::get_instance().transfer_context->read_single_arg(env);
        arg_pointers[i] = &arg_store[i];
    }
    from_uint_to_ptr<Callable>(p_raw_ptr)->call_deferredp(arg_pointers, args_size);
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
    uint32_t args_size {GDKotlin::get_instance().transfer_context->read_args_size(env)};

    Variant arg_store[5];
    const Variant* arg_pointers[5];
    for (uint32_t i = 0; i < args_size; ++i) {
        arg_store[i] = GDKotlin::get_instance().transfer_context->read_single_arg(env);
        arg_pointers[i] = &arg_store[i];
    }
    Variant instance {*from_uint_to_ptr<Callable>(p_raw_ptr)};
    instance.call(string_names.func_rpc, arg_pointers);
}

void CallableBridge::engine_call_rpc_id(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    uint32_t args_size {GDKotlin::get_instance().transfer_context->read_args_size(env)};

    Variant arg_store[5];
    const Variant* arg_pointers[5];
    for (uint32_t i = 0; i < args_size; ++i) {
        arg_store[i] = GDKotlin::get_instance().transfer_context->read_single_arg(env);
        arg_pointers[i] = &arg_store[i];
    }
    Variant instance {*from_uint_to_ptr<Callable>(p_raw_ptr)};
    instance.call(string_names.func_rpc_id, arg_pointers);
}

void CallableBridge::engine_call_unbind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant result {from_uint_to_ptr<Callable>(p_raw_ptr)->unbind(args[0])};
    transfer_context->write_return_value(env, result);
}

CallableBridge::CallableBridge(jni::JObject p_wrapped, jni::JObject p_class_loader) :
  JavaInstanceWrapper<CallableBridge>(CALLABLE_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader) {
    jni::JNativeMethod engine_call_constructor_method {
      const_cast<char*>("engine_call_constructor"),
      const_cast<char*>("()J"),
      (void*) CallableBridge::engine_call_constructor};

    jni::JNativeMethod engine_call_constructor_object_string_name_method {
      const_cast<char*>("engine_call_constructor_object_string_name"),
      const_cast<char*>("()J"),
      (void*) CallableBridge::engine_call_constructor_object_string_name};

    jni::JNativeMethod engine_call_constructor_kt_custom_callable_method {
      const_cast<char*>("engine_call_constructor_kt_custom_callable"),
      const_cast<char*>("(Lgodot/core/KtCustomCallable;)J"),
      (void*) CallableBridge::engine_call_constructor_kt_custom_callable};

    jni::JNativeMethod engine_call_copy_constructor_method {
      const_cast<char*>("engine_call_copy_constructor"),
      const_cast<char*>("()J"),
      (void*) CallableBridge::engine_call_copy_constructor};

    jni::JNativeMethod engine_call_bind_method {const_cast<char*>("engine_call_bind"), const_cast<char*>("(J)V"), (void*) CallableBridge::engine_call_bind};

    jni::JNativeMethod engine_call_bindv_method {
      const_cast<char*>("engine_call_bindv"),
      const_cast<char*>("(J)V"),
      (void*) CallableBridge::engine_call_bindv};

    jni::JNativeMethod engine_call_call_method {const_cast<char*>("engine_call_call"), const_cast<char*>("(J)V"), (void*) CallableBridge::engine_call_call};

    jni::JNativeMethod engine_call_call_deferred_method {
      const_cast<char*>("engine_call_call_deferred"),
      const_cast<char*>("(J)V"),
      (void*) CallableBridge::engine_call_call_deferred};

    jni::JNativeMethod engine_call_callv_method {
      const_cast<char*>("engine_call_callv"),
      const_cast<char*>("(J)V"),
      (void*) CallableBridge::engine_call_callv};

    jni::JNativeMethod engine_call_get_bound_arguments_method {
      const_cast<char*>("engine_call_get_bound_arguments"),
      const_cast<char*>("(J)V"),
      (void*) CallableBridge::engine_call_get_bound_arguments};

    jni::JNativeMethod engine_call_get_bound_arguments_count_method {
      const_cast<char*>("engine_call_get_bound_arguments_count"),
      const_cast<char*>("(J)V"),
      (void*) CallableBridge::engine_call_get_bound_arguments_count};

    jni::JNativeMethod engine_call_get_method_method {
      const_cast<char*>("engine_call_get_method"),
      const_cast<char*>("(J)V"),
      (void*) CallableBridge::engine_call_get_method};

    jni::JNativeMethod engine_call_get_object_method {
      const_cast<char*>("engine_call_get_object"),
      const_cast<char*>("(J)V"),
      (void*) CallableBridge::engine_call_get_object};

    jni::JNativeMethod engine_call_get_object_id_method {
      const_cast<char*>("engine_call_get_object_id"),
      const_cast<char*>("(J)V"),
      (void*) CallableBridge::engine_call_get_object_id};

    jni::JNativeMethod engine_call_hash_method {const_cast<char*>("engine_call_hash"), const_cast<char*>("(J)V"), (void*) CallableBridge::engine_call_hash};

    jni::JNativeMethod engine_call_is_custom_method {
      const_cast<char*>("engine_call_is_custom"),
      const_cast<char*>("(J)V"),
      (void*) CallableBridge::engine_call_is_custom};

    jni::JNativeMethod engine_call_is_null_method {
      const_cast<char*>("engine_call_is_null"),
      const_cast<char*>("(J)V"),
      (void*) CallableBridge::engine_call_is_null};

    jni::JNativeMethod engine_call_is_standard_method {
      const_cast<char*>("engine_call_is_standard"),
      const_cast<char*>("(J)V"),
      (void*) CallableBridge::engine_call_is_standard};

    jni::JNativeMethod engine_call_is_valid_method {
      const_cast<char*>("engine_call_is_valid"),
      const_cast<char*>("(J)V"),
      (void*) CallableBridge::engine_call_is_valid};

    jni::JNativeMethod engine_call_rpc_method {const_cast<char*>("engine_call_rpc"), const_cast<char*>("(J)V"), (void*) CallableBridge::engine_call_rpc};

    jni::JNativeMethod engine_call_rpc_id_method {
      const_cast<char*>("engine_call_rpc_id"),
      const_cast<char*>("(J)V"),
      (void*) CallableBridge::engine_call_rpc_id};

    jni::JNativeMethod engine_call_unbind_method {
      const_cast<char*>("engine_call_unbind"),
      const_cast<char*>("(J)V"),
      (void*) CallableBridge::engine_call_unbind};

    Vector<jni::JNativeMethod> methods;
    methods.push_back(engine_call_constructor_method);
    methods.push_back(engine_call_constructor_object_string_name_method);
    methods.push_back(engine_call_constructor_kt_custom_callable_method);
    methods.push_back(engine_call_copy_constructor_method);

    methods.push_back(engine_call_bind_method);
    methods.push_back(engine_call_bindv_method);
    methods.push_back(engine_call_call_method);
    methods.push_back(engine_call_call_deferred_method);
    methods.push_back(engine_call_callv_method);
    methods.push_back(engine_call_get_bound_arguments_method);
    methods.push_back(engine_call_get_bound_arguments_count_method);
    methods.push_back(engine_call_get_method_method);
    methods.push_back(engine_call_get_object_method);
    methods.push_back(engine_call_get_object_id_method);
    methods.push_back(engine_call_hash_method);
    methods.push_back(engine_call_is_custom_method);
    methods.push_back(engine_call_is_null_method);
    methods.push_back(engine_call_is_standard_method);
    methods.push_back(engine_call_is_valid_method);
    methods.push_back(engine_call_rpc_method);
    methods.push_back(engine_call_rpc_id_method);
    methods.push_back(engine_call_unbind_method);

    string_names.func_rpc = _scs_create("rpc");
    string_names.func_rpc_id = _scs_create("rpc_id");

    jni::Env env {jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}