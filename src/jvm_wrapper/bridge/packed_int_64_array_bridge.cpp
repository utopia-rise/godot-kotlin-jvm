#include "packed_int_64_array_bridge.h"

#include "bridges_utils.h"
#include "gd_kotlin.h"

using namespace bridges;

uintptr_t PackedInt64IntArrayBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(PackedInt64Array));
}

uintptr_t PackedInt64IntArrayBridge::engine_call_constructor_packed_array(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(PackedInt64Array(args[0].operator PackedInt64Array())));
}

uintptr_t PackedInt64IntArrayBridge::engine_call_constructor_array(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(PackedInt64Array(args[0].operator Vector<int64_t>())));
}

uintptr_t PackedInt64IntArrayBridge::engine_convert_long_array(JNIEnv* p_raw_env, jobject p_instance, jlongArray p_long_array) {
    jni::Env env {p_raw_env};
    jni::JLongArray arr {p_long_array};

    jint size {arr.length(env)};

    Vector<int64_t > vec;
    vec.resize(size);
    arr.get_array_elements(env, reinterpret_cast<jlong*>(vec.ptrw()), size);

    return reinterpret_cast<uintptr_t>(memnew(PackedInt64Array(vec)));
}

void PackedInt64IntArrayBridge::engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->append(args[0].operator signed int());
}

void PackedInt64IntArrayBridge::engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->append_array(args[0].operator PackedInt64Array());
}

void PackedInt64IntArrayBridge::engine_call_bsearch(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant ret {from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->bsearch(args[0].operator int64_t(), args[1].operator bool())};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedInt64IntArrayBridge::engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->clear();
}

void PackedInt64IntArrayBridge::engine_call_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant ret {from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->count(args[0].operator int64_t())};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedInt64IntArrayBridge::engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant ret {from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->duplicate()};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedInt64IntArrayBridge::engine_call_fill(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->fill(args[0].operator int64_t());
}

void PackedInt64IntArrayBridge::engine_call_find(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant ret {from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->find(args[0].operator int64_t())};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedInt64IntArrayBridge::engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant variant {from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->operator[](args[0].operator unsigned int())};
    TransferContext::get_instance().write_return_value(env, variant);
}

void PackedInt64IntArrayBridge::engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant ret {from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->has(args[0].operator int64_t())};
    TransferContext::get_instance().read_return_value(env, ret);
}

void PackedInt64IntArrayBridge::engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->insert(args[0].operator unsigned int(), args[1].operator signed int());
}

void PackedInt64IntArrayBridge::engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->is_empty()};
    TransferContext::get_instance().write_return_value(env, variant);
}

void PackedInt64IntArrayBridge::engine_call_reverse(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->reverse();
}

void PackedInt64IntArrayBridge::engine_call_pushback(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->push_back(args[0].operator signed int());
}

void PackedInt64IntArrayBridge::engine_call_remove_at(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->remove_at(args[0].operator unsigned int());
}

void PackedInt64IntArrayBridge::engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->resize(args[0].operator unsigned int());
}

void PackedInt64IntArrayBridge::engine_call_rfind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant ret {from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->rfind(args[0].operator int64_t(), args->operator int())};
}

void PackedInt64IntArrayBridge::engine_call_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->set(args[0].operator unsigned int(), args[1].operator signed int());
}

void PackedInt64IntArrayBridge::engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->size()};
    TransferContext::get_instance().write_return_value(env, variant);
}

void PackedInt64IntArrayBridge::engine_call_slice(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant ret {from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->slice(args[0].operator int(), args[1].operator int())};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedInt64IntArrayBridge::engine_call_sort(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->sort();
}

void PackedInt64IntArrayBridge::engine_call_to_byte_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant ret {from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)->to_byte_array()};
    TransferContext::get_instance().write_return_value(env, ret);
}

PackedInt64IntArrayBridge::~PackedInt64IntArrayBridge() = default;