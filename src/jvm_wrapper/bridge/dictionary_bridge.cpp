#include "dictionary_bridge.h"

#include "bridges_utils.h"
#include "constraints.h"
#include "jvm_wrapper/memory/transfer_context.h"

using namespace bridges;

uintptr_t DictionaryBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(Dictionary));
}

void DictionaryBridge::engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<Dictionary>(p_raw_ptr)->clear();
}

void DictionaryBridge::engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->duplicate(args[0].operator bool())};
    TransferContext::get_instance().write_return_value(env, variant);
}

// TODO/4.0: modify naming in jvm code
void DictionaryBridge::engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->is_empty()};
    TransferContext::get_instance().write_return_value(env, variant);
}

void DictionaryBridge::engine_call_erase(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<Dictionary>(p_raw_ptr)->erase(args[0]);
}

void DictionaryBridge::engine_call_find_key(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant ret {from_uint_to_ptr<Dictionary>(p_raw_ptr)->find_key(args[0])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void DictionaryBridge::engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->get(args[0], args[1])};
    TransferContext::get_instance().write_return_value(env, variant);
}

void DictionaryBridge::engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->has(args[0])};
    TransferContext::get_instance().write_return_value(env, variant);
}

void DictionaryBridge::engine_call_hasAll(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->has_all(args[0])};
    TransferContext::get_instance().write_return_value(env, variant);
}

void DictionaryBridge::engine_call_hash(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->hash()};
    TransferContext::get_instance().write_return_value(env, variant);
}

void DictionaryBridge::engine_call_is_read_only(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant ret {from_uint_to_ptr<Dictionary>(p_raw_ptr)->is_read_only()};
    TransferContext::get_instance().write_return_value(env, ret);
}

void DictionaryBridge::engine_call_keys(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->keys()};
    TransferContext::get_instance().write_return_value(env, variant);
}

void DictionaryBridge::engine_call_make_read_only(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<Dictionary>(p_raw_ptr)->make_read_only();
}

void DictionaryBridge::engine_call_merge(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<Dictionary>(p_raw_ptr)->merge(args[0], args[1]);
}

void DictionaryBridge::engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->size()};
    TransferContext::get_instance().write_return_value(env, variant);
}

void DictionaryBridge::engine_call_values(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->values()};
    TransferContext::get_instance().write_return_value(env, variant);
}

void DictionaryBridge::engine_call_operator_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant variant {from_uint_to_ptr<Dictionary>(p_raw_ptr)->operator[](args[0])};
    TransferContext::get_instance().write_return_value(env, variant);
}

void DictionaryBridge::engine_call_operator_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<Dictionary>(p_raw_ptr)->operator[](args[0]) = args[1];
}

void DictionaryBridge::engine_call_equals(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant variant {*from_uint_to_ptr<Dictionary>(p_raw_ptr) == args[0].operator Dictionary()};
    TransferContext::get_instance().write_return_value(env, variant);
}

DictionaryBridge::~DictionaryBridge() = default;