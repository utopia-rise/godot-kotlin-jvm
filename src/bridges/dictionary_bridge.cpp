#include <modules/kotlin_jvm/src/gd_kotlin.h>
#include "dictionary_bridge.h"
#include "constants.h"
#include "bridges_utils.h"

using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(DictionaryBridge)

DictionaryBridge::DictionaryBridge(jni::JObject p_wrapped, jni::JObject p_class_loader)
    : JavaInstanceWrapper(DICTIONARY_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader){
    jni::JNativeMethod engine_call_constructor_method {
            "engine_call_constructor",
            "()J",
            (void*) DictionaryBridge::engine_call_constructor
    };

    jni::JNativeMethod engine_call_clear_method {
        "engine_call_clear",
        "(J)V",
        (void*) DictionaryBridge::engine_call_clear
    };
    jni::JNativeMethod engine_call_duplicate_method {
        "engine_call_duplicate",
        "(J)V",
        (void*) DictionaryBridge::engine_call_duplicate
    };
    jni::JNativeMethod engine_call_empty_method {
        "engine_call_empty",
        "(J)V",
        (void*) DictionaryBridge::engine_call_empty
    };
    jni::JNativeMethod engine_call_erase_method {
        "engine_call_erase",
        "(J)V",
        (void*) DictionaryBridge::engine_call_erase
    };
    jni::JNativeMethod engine_call_get_method {
        "engine_call_get",
        "(J)V",
        (void*) DictionaryBridge::engine_call_get
    };
    jni::JNativeMethod engine_call_has_method {
        "engine_call_has",
        "(J)V",
        (void*) DictionaryBridge::engine_call_has
    };
    jni::JNativeMethod engine_call_hasAll_method {
        "engine_call_hasAll",
        "(J)V",
        (void*) DictionaryBridge::engine_call_hasAll
    };
    jni::JNativeMethod engine_call_hash_method {
        "engine_call_hash",
        "(J)V",
        (void*) DictionaryBridge::engine_call_hash
    };
    jni::JNativeMethod engine_call_keys_method {
        "engine_call_keys",
        "(J)V",
        (void*) DictionaryBridge::engine_call_keys
    };
    jni::JNativeMethod engine_call_size_method {
        "engine_call_size",
        "(J)V",
        (void*) DictionaryBridge::engine_call_size
    };
    jni::JNativeMethod engine_call_values_method {
        "engine_call_values",
        "(J)V",
        (void*) DictionaryBridge::engine_call_values
    };
    jni::JNativeMethod engine_call_operator_get_method {
        "engine_call_operator_get",
        "(J)V",
        (void*) DictionaryBridge::engine_call_operator_get
    };
    jni::JNativeMethod engine_call_operator_set_method {
        "engine_call_operator_set",
        "(J)V",
        (void*) DictionaryBridge::engine_call_operator_set
    };
    jni::JNativeMethod engine_call_equals_method {
        "engine_call_equals",
        "(J)V",
        (void*) DictionaryBridge::engine_call_equals
    };

    Vector<jni::JNativeMethod> methods;
    methods.push_back(engine_call_constructor_method);
    methods.push_back(engine_call_clear_method);
    methods.push_back(engine_call_duplicate_method);
    methods.push_back(engine_call_empty_method);
    methods.push_back(engine_call_erase_method);
    methods.push_back(engine_call_get_method);
    methods.push_back(engine_call_has_method);
    methods.push_back(engine_call_hasAll_method);
    methods.push_back(engine_call_hash_method);
    methods.push_back(engine_call_keys_method);
    methods.push_back(engine_call_size_method);
    methods.push_back(engine_call_values_method);
    methods.push_back(engine_call_operator_get_method);
    methods.push_back(engine_call_operator_set_method);
    methods.push_back(engine_call_equals_method);

    jni::Env env{jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}

uintptr_t DictionaryBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(new Dictionary());
}

void DictionaryBridge::engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<Dictionary>(p_raw_ptr)->clear();
}

void DictionaryBridge::engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{jni::Jvm::current_env()};
    Variant args[1] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<Dictionary>(p_raw_ptr)->duplicate(args[0].operator bool())};
    transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{jni::Jvm::current_env()};
    Variant variant{from_uint_to_ptr<Dictionary>(p_raw_ptr)->empty()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_erase(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{jni::Jvm::current_env()};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Dictionary>(p_raw_ptr)->erase(args[0]);
}

void DictionaryBridge::engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{jni::Jvm::current_env()};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    Variant args[2] = {};
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<Dictionary>(p_raw_ptr)->get(args[0], args[1])};
    transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{jni::Jvm::current_env()};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    Variant args[1] = {};
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<Dictionary>(p_raw_ptr)->has(args[0])};
    transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_hasAll(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{jni::Jvm::current_env()};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    Variant args[1] = {};
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<Dictionary>(p_raw_ptr)->has_all(args[0])};
    transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_hash(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{jni::Jvm::current_env()};
    Variant variant{from_uint_to_ptr<Dictionary>(p_raw_ptr)->hash()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_keys(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{jni::Jvm::current_env()};
    Variant variant{from_uint_to_ptr<Dictionary>(p_raw_ptr)->keys()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{jni::Jvm::current_env()};
    Variant variant{from_uint_to_ptr<Dictionary>(p_raw_ptr)->size()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_values(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{jni::Jvm::current_env()};
    Variant variant{from_uint_to_ptr<Dictionary>(p_raw_ptr)->values()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_operator_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{jni::Jvm::current_env()};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    Variant args[1] = {};
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<Dictionary>(p_raw_ptr)[args[0]]};
    transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_operator_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{jni::Jvm::current_env()};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Dictionary>(p_raw_ptr)[args[0]] = args[1];
}

void DictionaryBridge::engine_call_equals(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{jni::Jvm::current_env()};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    Variant args[1] = {};
    transfer_context->read_args(env, args);
    Variant variant{*from_uint_to_ptr<Dictionary>(p_raw_ptr) == args[0].operator Dictionary()};
    transfer_context->write_return_value(env, variant);
}
