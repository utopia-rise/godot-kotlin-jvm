#include "dictionary_bridge.h"

#include "bridges_utils.h"
#include "constants.h"
#include "gd_kotlin.h"

using namespace bridges;

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    DictionaryBridge,
    INIT_NATIVE_METHOD(engine_call_constructor_method, "engine_call_constructor", "()J", DictionaryBridge::engine_call_constructor)
    INIT_NATIVE_METHOD(engine_call_clear_method, "engine_call_clear", "(J)V", DictionaryBridge::engine_call_clear)
    INIT_NATIVE_METHOD(engine_call_duplicate_method, "engine_call_duplicate", "(J)V", DictionaryBridge::engine_call_duplicate)
    INIT_NATIVE_METHOD(engine_call_is_empty_method, "engine_call_is_empty","(J)V", DictionaryBridge::engine_call_is_empty)
    INIT_NATIVE_METHOD(engine_call_erase_method, "engine_call_erase", "(J)V", DictionaryBridge::engine_call_erase)
    INIT_NATIVE_METHOD(engine_call_find_key_method, "engine_call_find_key", "(J)V", DictionaryBridge::engine_call_find_key)
    INIT_NATIVE_METHOD(engine_call_get_method, "engine_call_get", "(J)V", DictionaryBridge::engine_call_get)
    INIT_NATIVE_METHOD(engine_call_has_method, "engine_call_has", "(J)V", DictionaryBridge::engine_call_has)
    INIT_NATIVE_METHOD(engine_call_hasAll_method, "engine_call_hasAll", "(J)V", DictionaryBridge::engine_call_hasAll)
    INIT_NATIVE_METHOD(engine_call_hash_method, "engine_call_hash", "(J)V", DictionaryBridge::engine_call_hash)
    INIT_NATIVE_METHOD(engine_call_is_read_only_method, "engine_call_is_read_only", "(J)V", DictionaryBridge::engine_call_is_read_only)
    INIT_NATIVE_METHOD(engine_call_keys_method, "engine_call_keys", "(J)V", DictionaryBridge::engine_call_keys)
    INIT_NATIVE_METHOD(engine_call_make_read_only_method, "engine_call_make_read_only", "(J)V", DictionaryBridge::engine_call_make_read_only)
    INIT_NATIVE_METHOD(engine_call_merge_method, "engine_call_merge", "(J)V", DictionaryBridge::engine_call_merge)
    INIT_NATIVE_METHOD(engine_call_size_method, "engine_call_size", "(J)V", DictionaryBridge::engine_call_size)
    INIT_NATIVE_METHOD(engine_call_values_method, "engine_call_values", "(J)V", DictionaryBridge::engine_call_values)
    INIT_NATIVE_METHOD(engine_call_operator_get_method, "engine_call_operator_get", "(J)V", DictionaryBridge::engine_call_operator_get)
    INIT_NATIVE_METHOD(engine_call_operator_set_method, "engine_call_operator_set", "(J)V", DictionaryBridge::engine_call_operator_set)
    INIT_NATIVE_METHOD(engine_call_equals_method, "engine_call_equals", "(J)V", DictionaryBridge::engine_call_equals)
  )

// clang-format on

DictionaryBridge::DictionaryBridge(jni::JObject p_wrapped) : JavaInstanceWrapper(p_wrapped) {}

uintptr_t DictionaryBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(Dictionary));
}

void DictionaryBridge::engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<Dictionary>(p_raw_ptr)->clear();
}

void DictionaryBridge::engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->duplicate(args[0].operator bool())};
    transfer_context->write_return_value(env, variant);
}

// TODO/4.0: modify naming in jvm code
void DictionaryBridge::engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->is_empty()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_erase(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Dictionary>(p_raw_ptr)->erase(args[0]);
}

void DictionaryBridge::engine_call_find_key(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant ret {from_uint_to_ptr<Dictionary>(p_raw_ptr)->find_key(args[0])};
    transfer_context->write_return_value(env, ret);
}

void DictionaryBridge::engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    Variant args[2] = {};
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->get(args[0], args[1])};
    transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    Variant args[1] = {};
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->has(args[0])};
    transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_hasAll(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    Variant args[1] = {};
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->has_all(args[0])};
    transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_hash(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->hash()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_is_read_only(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant ret {from_uint_to_ptr<Dictionary>(p_raw_ptr)->is_read_only()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, ret);
}

void DictionaryBridge::engine_call_keys(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->keys()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_make_read_only(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<Dictionary>(p_raw_ptr)->make_read_only();
}

void DictionaryBridge::engine_call_merge(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Dictionary>(p_raw_ptr)->merge(args[0], args[1]);
}

void DictionaryBridge::engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->size()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_values(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->values()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_operator_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    Variant args[1] = {};
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->operator[](args[0])};
    transfer_context->write_return_value(env, variant);
}

void DictionaryBridge::engine_call_operator_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Dictionary>(p_raw_ptr)->operator[](args[0]) = args[1];
}

void DictionaryBridge::engine_call_equals(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    Variant args[1] = {};
    transfer_context->read_args(env, args);
    Variant variant {*from_uint_to_ptr<Dictionary>(p_raw_ptr) == args[0].operator Dictionary()};
    transfer_context->write_return_value(env, variant);
}
