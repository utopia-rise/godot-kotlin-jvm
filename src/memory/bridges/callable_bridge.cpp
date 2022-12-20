#include "gd_kotlin.h"
#include "jni/class_loader.h"
#include "callable_bridge.h"
#include "constants.h"
#include "bridges_utils.h"

using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(CallableBridge)

uintptr_t CallableBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(Callable));
}

uintptr_t CallableBridge::engine_call_constructor_object_string_name(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env{p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(
            memnew(Callable(args[0].operator Object *(), args[1].operator StringName()))
    );
}

uintptr_t CallableBridge::engine_call_constructor_kt_custom_callable(JNIEnv* p_raw_env, jobject p_instance,
                                                                     jobject p_kt_custom_callable_instance) {
    return reinterpret_cast<uintptr_t>(
            memnew(Callable(
                    memnew(KtCustomCallable(p_kt_custom_callable_instance, ClassLoader::get_default_loader()))
            ))
    );
}

uintptr_t CallableBridge::engine_call_copy_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(Callable(args[0].operator Callable())));
}

void CallableBridge::engine_call_call(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    uint32_t args_size{GDKotlin::get_instance().transfer_context->read_args_size(env)};

    Variant arg_store[5];
    const Variant* arg_pointers[5];
    for (int i = 0; i < args_size; ++i) {
        arg_store[i] = GDKotlin::get_instance().transfer_context->read_single_arg(env);
        arg_pointers[i] = &arg_store[i];
    }
    Variant result;
    Callable::CallError error;
    from_uint_to_ptr<Callable>(p_raw_ptr)->callp(arg_pointers, args_size, result, error);
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void CallableBridge::engine_call_call_deferred(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    uint32_t args_size{GDKotlin::get_instance().transfer_context->read_args_size(env)};

    Variant arg_store[5];
    const Variant* arg_pointers[5];
    for (int i = 0; i < args_size; ++i) {
        arg_store[i] = GDKotlin::get_instance().transfer_context->read_single_arg(env);
        arg_pointers[i] = &arg_store[i];
    }
    from_uint_to_ptr<Callable>(p_raw_ptr)->call_deferredp(arg_pointers, args_size);
}

CallableBridge::CallableBridge(jni::JObject p_wrapped, jni::JObject p_class_loader) :
        JavaInstanceWrapper<CallableBridge>(CALLABLE_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader){
    jni::JNativeMethod engine_call_constructor_method{
        const_cast<char*>("engine_call_constructor"),
        const_cast<char*>("()J"),
        (void *) CallableBridge::engine_call_constructor
    };

    jni::JNativeMethod engine_call_constructor_object_string_name_method{
        const_cast<char*>("engine_call_constructor_object_string_name"),
        const_cast<char*>("()J"),
        (void *) CallableBridge::engine_call_constructor_object_string_name
    };

    jni::JNativeMethod engine_call_constructor_kt_custom_callable_method{
        const_cast<char*>("engine_call_constructor_kt_custom_callable"),
        const_cast<char*>("(Lgodot/core/KtCustomCallable;)J"),
        (void *) CallableBridge::engine_call_constructor_kt_custom_callable
    };

    jni::JNativeMethod engine_call_copy_constructor_method{
        const_cast<char*>("engine_call_copy_constructor"),
        const_cast<char*>("()J"),
        (void *) CallableBridge::engine_call_copy_constructor
    };

    jni::JNativeMethod engine_call_call_method{
        const_cast<char*>("engine_call_call"),
        const_cast<char*>("(J)V"),
        (void *) CallableBridge::engine_call_call
    };

    jni::JNativeMethod engine_call_call_deferred_method{
        const_cast<char*>("engine_call_call_deferred"),
        const_cast<char*>("(J)V"),
        (void *) CallableBridge::engine_call_call_deferred
    };

    Vector<jni::JNativeMethod> methods;
    methods.push_back(engine_call_constructor_method);
    methods.push_back(engine_call_constructor_object_string_name_method);
    methods.push_back(engine_call_constructor_kt_custom_callable_method);
    methods.push_back(engine_call_copy_constructor_method);

    methods.push_back(engine_call_call_method);
    methods.push_back(engine_call_call_deferred_method);

    jni::Env env{jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}