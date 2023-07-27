#include "packed_vector2_array_bridge.h"

#include "bridges_utils.h"
#include "constants.h"
#include "gd_kotlin.h"

using namespace bridges;

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    PackedVector2ArrayBridge,
    INIT_NATIVE_METHOD("engine_call_constructor", "()J", PackedVector2ArrayBridge::engine_call_constructor)
    INIT_NATIVE_METHOD("engine_call_constructor_packed_array", "()J", PackedVector2ArrayBridge::engine_call_constructor_packed_array)
    INIT_NATIVE_METHOD("engine_call_constructor_array", "()J", PackedVector2ArrayBridge::engine_call_constructor_array)
    INIT_NATIVE_METHOD("engine_call_append", "(J)V", PackedVector2ArrayBridge::engine_call_append)
    INIT_NATIVE_METHOD("engine_call_appendArray", "(J)V", PackedVector2ArrayBridge::engine_call_appendArray)
    INIT_NATIVE_METHOD("engine_call_bsearch", "(J)V", PackedVector2ArrayBridge::engine_call_bsearch)
    INIT_NATIVE_METHOD("engine_call_clear", "(J)V", PackedVector2ArrayBridge::engine_call_clear)
    INIT_NATIVE_METHOD("engine_call_count", "(J)V", PackedVector2ArrayBridge::engine_call_count)
    INIT_NATIVE_METHOD("engine_call_duplicate", "(J)V", PackedVector2ArrayBridge::engine_call_duplicate)
    INIT_NATIVE_METHOD("engine_call_fill", "(J)V", PackedVector2ArrayBridge::engine_call_fill)
    INIT_NATIVE_METHOD("engine_call_find", "(J)V", PackedVector2ArrayBridge::engine_call_find)
    INIT_NATIVE_METHOD("engine_call_is_empty", "(J)V", PackedVector2ArrayBridge::engine_call_is_empty)
    INIT_NATIVE_METHOD("engine_call_get", "(J)V", PackedVector2ArrayBridge::engine_call_get)
    INIT_NATIVE_METHOD("engine_call_has", "(J)V", PackedVector2ArrayBridge::engine_call_has)
    INIT_NATIVE_METHOD("engine_call_insert", "(J)V", PackedVector2ArrayBridge::engine_call_insert)
    INIT_NATIVE_METHOD("engine_call_reverse", "(J)V", PackedVector2ArrayBridge::engine_call_reverse)
    INIT_NATIVE_METHOD("engine_call_pushback", "(J)V", PackedVector2ArrayBridge::engine_call_pushback)
    INIT_NATIVE_METHOD("engine_call_remove_at", "(J)V", PackedVector2ArrayBridge::engine_call_remove_at)
    INIT_NATIVE_METHOD("engine_call_resize", "(J)V", PackedVector2ArrayBridge::engine_call_resize)
    INIT_NATIVE_METHOD("engine_call_rfind", "(J)V", PackedVector2ArrayBridge::engine_call_rfind)
    INIT_NATIVE_METHOD("engine_call_set", "(J)V", PackedVector2ArrayBridge::engine_call_set)
    INIT_NATIVE_METHOD("engine_call_size", "(J)V", PackedVector2ArrayBridge::engine_call_size)
    INIT_NATIVE_METHOD("engine_call_slice", "(J)V", PackedVector2ArrayBridge::engine_call_slice)
    INIT_NATIVE_METHOD("engine_call_sort", "(J)V", PackedVector2ArrayBridge::engine_call_sort)
    INIT_NATIVE_METHOD("engine_call_to_byte_array", "(J)V", PackedVector2ArrayBridge::engine_call_to_byte_array)
  )

// clang-format on

PackedVector2ArrayBridge::PackedVector2ArrayBridge(jni::JObject p_wrapped) : JavaInstanceWrapper(p_wrapped) {}

uintptr_t PackedVector2ArrayBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(PackedVector2Array));
}

uintptr_t PackedVector2ArrayBridge::engine_call_constructor_packed_array(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(PackedVector2Array(args[0].operator PackedVector2Array())));
}

uintptr_t PackedVector2ArrayBridge::engine_call_constructor_array(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(PackedVector2Array(args[0].operator Vector<Vector2>())));
}

void PackedVector2ArrayBridge::engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->append(args[0].operator Vector2());
}

void PackedVector2ArrayBridge::engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->append_array(args[0].operator PackedVector2Array());
}

void PackedVector2ArrayBridge::engine_call_bsearch(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant ret {from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->bsearch(args[0].operator Vector2(), args[1].operator bool())};
    transfer_context->write_return_value(env, ret);
}

void PackedVector2ArrayBridge::engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->clear();
}

void PackedVector2ArrayBridge::engine_call_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant ret {from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->count(args[0].operator Vector2())};
    transfer_context->write_return_value(env, ret);
}

void PackedVector2ArrayBridge::engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant ret {from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->duplicate()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, ret);
}

void PackedVector2ArrayBridge::engine_call_fill(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->fill(args[0].operator Vector2());
}

void PackedVector2ArrayBridge::engine_call_find(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant ret {from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->find(args[0].operator Vector2())};
    transfer_context->write_return_value(env, ret);
}

void PackedVector2ArrayBridge::engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->operator[](args[0].operator unsigned int())};
    transfer_context->write_return_value(env, variant);
}

void PackedVector2ArrayBridge::engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant ret {from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->has(args[0].operator Vector2())};
    transfer_context->read_return_value(env, ret);
}

void PackedVector2ArrayBridge::engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->insert(args[0].operator unsigned int(), args[1].operator Vector2());
}

void PackedVector2ArrayBridge::engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    Variant variant {from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->is_empty()};
    transfer_context->write_return_value(env, variant);
}

void PackedVector2ArrayBridge::engine_call_reverse(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->reverse();
}

void PackedVector2ArrayBridge::engine_call_pushback(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->push_back(args[0].operator Vector2());
}

void PackedVector2ArrayBridge::engine_call_remove_at(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->remove_at(args[0].operator unsigned int());
}

void PackedVector2ArrayBridge::engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->resize(args[0].operator unsigned int());
}

void PackedVector2ArrayBridge::engine_call_rfind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant ret {from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->rfind(args[0].operator Vector2(), args->operator int())};
}

void PackedVector2ArrayBridge::engine_call_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->set(args[0].operator unsigned int(), args[1].operator Vector2());
}

void PackedVector2ArrayBridge::engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->size()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void PackedVector2ArrayBridge::engine_call_slice(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant ret {from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->slice(args[0].operator int(), args[1].operator int())};
    transfer_context->write_return_value(env, ret);
}

void PackedVector2ArrayBridge::engine_call_sort(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->sort();
}

void PackedVector2ArrayBridge::engine_call_to_byte_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant ret {from_uint_to_ptr<PackedVector2Array>(p_raw_ptr)->to_byte_array()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, ret);
}