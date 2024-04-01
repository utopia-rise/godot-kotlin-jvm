#include "packed_byte_array_bridge.h"

#include "bridges_utils.h"
#include "constants.h"
#include "gd_kotlin.h"

using namespace bridges;

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    PackedByteArrayBridge,
    INIT_NATIVE_METHOD("engine_call_constructor", "()J", PackedByteArrayBridge::engine_call_constructor)
    INIT_NATIVE_METHOD("engine_call_constructor_packed_array", "()J", PackedByteArrayBridge::engine_call_constructor_packed_array)
    INIT_NATIVE_METHOD("engine_call_constructor_array", "()J", PackedByteArrayBridge::engine_call_constructor_array)
    INIT_NATIVE_METHOD("engine_call_append", "(J)V", PackedByteArrayBridge::engine_call_append)
    INIT_NATIVE_METHOD("engine_call_appendArray", "(J)V", PackedByteArrayBridge::engine_call_appendArray)
    INIT_NATIVE_METHOD("engine_call_bsearch", "(J)V", PackedByteArrayBridge::engine_call_bsearch)
    INIT_NATIVE_METHOD("engine_call_clear", "(J)V", PackedByteArrayBridge::engine_call_clear)
    INIT_NATIVE_METHOD("engine_call_compress", "(J)V", PackedByteArrayBridge::engine_call_compress)
    INIT_NATIVE_METHOD("engine_call_count", "(J)V", PackedByteArrayBridge::engine_call_count)
    INIT_NATIVE_METHOD("engine_call_decode_double", "(J)V", PackedByteArrayBridge::engine_call_decode_double)
    INIT_NATIVE_METHOD("engine_call_decode_float", "(J)V", PackedByteArrayBridge::engine_call_decode_float)
    INIT_NATIVE_METHOD("engine_call_decode_half", "(J)V", PackedByteArrayBridge::engine_call_decode_half)
    INIT_NATIVE_METHOD("engine_call_decode_s16", "(J)V", PackedByteArrayBridge::engine_call_decode_s16)
    INIT_NATIVE_METHOD("engine_call_decode_s32", "(J)V", PackedByteArrayBridge::engine_call_decode_s32)
    INIT_NATIVE_METHOD("engine_call_decode_s64", "(J)V", PackedByteArrayBridge::engine_call_decode_s64)
    INIT_NATIVE_METHOD("engine_call_decode_s8", "(J)V", PackedByteArrayBridge::engine_call_decode_s8)
    INIT_NATIVE_METHOD("engine_call_decode_u16", "(J)V", PackedByteArrayBridge::engine_call_decode_u16)
    INIT_NATIVE_METHOD("engine_call_decode_u32", "(J)V", PackedByteArrayBridge::engine_call_decode_u32)
    INIT_NATIVE_METHOD("engine_call_decode_u64", "(J)V", PackedByteArrayBridge::engine_call_decode_u64)
    INIT_NATIVE_METHOD("engine_call_decode_u8", "(J)V", PackedByteArrayBridge::engine_call_decode_u8)
    INIT_NATIVE_METHOD("engine_call_decode_var", "(J)V", PackedByteArrayBridge::engine_call_decode_var)
    INIT_NATIVE_METHOD("engine_call_decode_var_size", "(J)V", PackedByteArrayBridge::engine_call_decode_var_size)
    INIT_NATIVE_METHOD("engine_call_decompress", "(J)V", PackedByteArrayBridge::engine_call_decompress)
    INIT_NATIVE_METHOD("engine_call_decompress_dynamic", "(J)V", PackedByteArrayBridge::engine_call_decompress_dynamic)
    INIT_NATIVE_METHOD("engine_call_duplicate", "(J)V", PackedByteArrayBridge::engine_call_duplicate)
    INIT_NATIVE_METHOD("engine_call_encode_double", "(J)V", PackedByteArrayBridge::engine_call_encode_double)
    INIT_NATIVE_METHOD("engine_call_encode_float", "(J)V", PackedByteArrayBridge::engine_call_encode_float)
    INIT_NATIVE_METHOD("engine_call_encode_half", "(J)V", PackedByteArrayBridge::engine_call_encode_half)
    INIT_NATIVE_METHOD("engine_call_encode_s16", "(J)V", PackedByteArrayBridge::engine_call_encode_s16)
    INIT_NATIVE_METHOD("engine_call_encode_s32", "(J)V", PackedByteArrayBridge::engine_call_encode_s32)
    INIT_NATIVE_METHOD("engine_call_encode_s64", "(J)V", PackedByteArrayBridge::engine_call_encode_s64)
    INIT_NATIVE_METHOD("engine_call_encode_s8", "(J)V", PackedByteArrayBridge::engine_call_encode_s8)
    INIT_NATIVE_METHOD("engine_call_encode_u16", "(J)V", PackedByteArrayBridge::engine_call_encode_u16)
    INIT_NATIVE_METHOD("engine_call_encode_u32", "(J)V", PackedByteArrayBridge::engine_call_encode_u32)
    INIT_NATIVE_METHOD("engine_call_encode_u64", "(J)V", PackedByteArrayBridge::engine_call_encode_u64)
    INIT_NATIVE_METHOD("engine_call_encode_u8", "(J)V", PackedByteArrayBridge::engine_call_encode_u8)
    INIT_NATIVE_METHOD("engine_call_encode_var", "(J)V", PackedByteArrayBridge::engine_call_encode_var)
    INIT_NATIVE_METHOD("engine_call_fill", "(J)V", PackedByteArrayBridge::engine_call_fill)
    INIT_NATIVE_METHOD("engine_call_find", "(J)V", PackedByteArrayBridge::engine_call_find)
    INIT_NATIVE_METHOD("engine_call_is_empty", "(J)V", PackedByteArrayBridge::engine_call_is_empty)
    INIT_NATIVE_METHOD("engine_call_get_string_from_ascii", "(J)V", PackedByteArrayBridge::engine_call_get_string_from_ascii)
    INIT_NATIVE_METHOD("engine_call_get_string_from_utf16", "(J)V", PackedByteArrayBridge::engine_call_get_string_from_utf16)
    INIT_NATIVE_METHOD("engine_call_get_string_from_utf32", "(J)V", PackedByteArrayBridge::engine_call_get_string_from_utf32)
    INIT_NATIVE_METHOD("engine_call_get_string_from_utf8", "(J)V", PackedByteArrayBridge::engine_call_get_string_from_utf8)
    INIT_NATIVE_METHOD("engine_call_has", "(J)V", PackedByteArrayBridge::engine_call_has)
    INIT_NATIVE_METHOD("engine_call_has_encoded_var", "(J)V", PackedByteArrayBridge::engine_call_has_encoded_var)
    INIT_NATIVE_METHOD("engine_call_hex_encode", "(J)V", PackedByteArrayBridge::engine_call_hex_encode)
    INIT_NATIVE_METHOD("engine_call_get", "(J)V", PackedByteArrayBridge::engine_call_get)
    INIT_NATIVE_METHOD("engine_call_insert", "(J)V", PackedByteArrayBridge::engine_call_insert)
    INIT_NATIVE_METHOD("engine_call_reverse", "(J)V", PackedByteArrayBridge::engine_call_reverse)
    INIT_NATIVE_METHOD("engine_call_rfind", "(J)V", PackedByteArrayBridge::engine_call_rfind)
    INIT_NATIVE_METHOD("engine_call_pushback", "(J)V", PackedByteArrayBridge::engine_call_pushback)
    INIT_NATIVE_METHOD("engine_call_remove_at", "(J)V", PackedByteArrayBridge::engine_call_remove_at)
    INIT_NATIVE_METHOD("engine_call_resize", "(J)V", PackedByteArrayBridge::engine_call_resize)
    INIT_NATIVE_METHOD("engine_call_set", "(J)V", PackedByteArrayBridge::engine_call_set)
    INIT_NATIVE_METHOD("engine_call_size", "(J)V", PackedByteArrayBridge::engine_call_size)
    INIT_NATIVE_METHOD("engine_call_slice", "(J)V", PackedByteArrayBridge::engine_call_slice)
    INIT_NATIVE_METHOD("engine_call_sort", "(J)V", PackedByteArrayBridge::engine_call_sort)
    INIT_NATIVE_METHOD("engine_call_to_float32_array", "(J)V", PackedByteArrayBridge::engine_call_to_float32_array)
    INIT_NATIVE_METHOD("engine_call_to_float64_array", "(J)V", PackedByteArrayBridge::engine_call_to_float64_array)
    INIT_NATIVE_METHOD("engine_call_to_int32_array", "(J)V", PackedByteArrayBridge::engine_call_to_int32_array)
    INIT_NATIVE_METHOD("engine_call_to_int64_array", "(J)V", PackedByteArrayBridge::engine_call_to_int64_array)
)
// clang-format on

PackedByteArrayBridge::StringNames PackedByteArrayBridge::string_names;

PackedByteArrayBridge::PackedByteArrayBridge(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {
    string_names.func_compress_name = _scs_create("compress");
    string_names.func_decompress_name = _scs_create("decompress");
    string_names.func_decompress_dynamic_name = _scs_create("decompress_dynamic");
    string_names.func_get_string_from_ascii_name = _scs_create("get_string_from_ascii");
    string_names.func_get_string_from_utf16_name = _scs_create("get_string_from_utf16");
    string_names.func_get_string_from_utf32_name = _scs_create("get_string_from_utf32");
    string_names.func_get_string_from_utf8_name = _scs_create("get_string_from_utf8");
    string_names.func_has_encoded_var_name = StringName("has_encoded_var");
    string_names.func_hex_encode_name = _scs_create("hex_encode");

    string_names.func_decode_double_name = _scs_create("decode_double");
    string_names.func_decode_float_name = _scs_create("decode_float");
    string_names.func_decode_half_name = _scs_create("decode_half");
    string_names.func_decode_s16_name = _scs_create("decode_s16");
    string_names.func_decode_s32_name = _scs_create("decode_s32");
    string_names.func_decode_s64_name = _scs_create("decode_s64");
    string_names.func_decode_s8_name = _scs_create("decode_s8");
    string_names.func_decode_u16_name = _scs_create("decode_u16");
    string_names.func_decode_u32_name = _scs_create("decode_u32");
    string_names.func_decode_u64_name = _scs_create("decode_u64");
    string_names.func_decode_u8_name = _scs_create("decode_u8");
    string_names.func_decode_var_name = _scs_create("decode_var");
    string_names.func_decode_var_size_name = _scs_create("decode_var_size");

    string_names.func_encode_double_name = StringName("encode_double");
    string_names.func_encode_float_name = StringName("encode_float");
    string_names.func_encode_half_name = StringName("encode_half");
    string_names.func_encode_s16_name = StringName("encode_s16");
    string_names.func_encode_s32_name = StringName("encode_s32");
    string_names.func_encode_s64_name = StringName("encode_s64");
    string_names.func_encode_s8_name = StringName("encode_s8");
    string_names.func_encode_u16_name = StringName("encode_u16");
    string_names.func_encode_u32_name = StringName("encode_u32");
    string_names.func_encode_u64_name = StringName("encode_u64");
    string_names.func_encode_u8_name = StringName("encode_u8");
    string_names.func_encode_var_name = StringName("encode_var");

    string_names.func_to_float32_array_name = StringName("to_float32_array");
    string_names.func_to_float64_array_name = StringName("to_float64_array");
    string_names.func_to_int32_array_name = StringName("to_int32_array");
    string_names.func_to_int64_array_name = StringName("to_int64_array");
}

uintptr_t PackedByteArrayBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(PackedByteArray));
}

uintptr_t PackedByteArrayBridge::engine_call_constructor_packed_array(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(PackedByteArray(args[0].operator PackedByteArray())));
}

uintptr_t PackedByteArrayBridge::engine_call_constructor_array(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(PackedByteArray(args[0].operator Vector<uint8_t>())));
}

void PackedByteArrayBridge::engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->append(args[0].operator uint8_t());
}

void PackedByteArrayBridge::engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->append_array(args[0].operator PackedByteArray());
}

void PackedByteArrayBridge::engine_call_bsearch(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant ret {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->bsearch(args[0].operator uint8_t(), args[1].operator bool())};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->clear();
}

void PackedByteArrayBridge::engine_call_compress(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant pool {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret = pool.call(string_names.func_compress_name, args[0]);

    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant ret {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->count(args[0].operator uint8_t())};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_double(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(string_names.func_decode_double_name, args[0])};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_float(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(string_names.func_decode_float_name, args[0])};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_half(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(string_names.func_decode_half_name, args[0])};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_s16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(string_names.func_decode_s16_name, args[0])};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_s32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(string_names.func_decode_s32_name, args[0])};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_s64(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(string_names.func_decode_s64_name, args[0])};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_s8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(string_names.func_decode_s8_name, args[0])};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_u16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(string_names.func_decode_u16_name, args[0])};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_u32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(string_names.func_decode_u32_name, args[0])};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_u64(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(string_names.func_decode_u64_name, args[0])};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_u8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(string_names.func_decode_u8_name, args[0])};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_var(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(string_names.func_decode_var_name, args[0], args[1])};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_var_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(string_names.func_decode_var_size_name, args[0], args[1])};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decompress(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant pool {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret = pool.call(string_names.func_decompress_name, args[0], args[1]);

    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decompress_dynamic(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant pool {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    auto t = args[0];

    Variant ret = pool.call(string_names.func_decompress_dynamic_name, args[0], args[1]);

    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant ret {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->duplicate()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_encode_double(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(string_names.func_encode_double_name, args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_float(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(string_names.func_encode_float_name, args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_half(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(string_names.func_encode_half_name, args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_s16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(string_names.func_encode_s16_name, args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_s32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(string_names.func_encode_s32_name, args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_s64(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(string_names.func_encode_s64_name, args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_s8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(string_names.func_encode_s8_name, args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_u16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(string_names.func_encode_u16_name, args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_u32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(string_names.func_encode_u32_name, args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_u64(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(string_names.func_encode_u64_name, args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_u8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(string_names.func_encode_u8_name, args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_var(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[3] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(string_names.func_encode_u8_name, args[0], args[1], args[2]);
}

void PackedByteArrayBridge::engine_call_fill(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->fill(args[0].operator uint8_t());
}

void PackedByteArrayBridge::engine_call_find(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant ret {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->find(args[0].operator uint8_t())};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    Variant variant {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->is_empty()};
    transfer_context->write_return_value(env, variant);
}

void PackedByteArrayBridge::engine_call_get_string_from_ascii(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};

    Variant pool {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret = pool.call(string_names.func_get_string_from_ascii_name);

    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_get_string_from_utf16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(string_names.func_get_string_from_utf16_name);
}

void PackedByteArrayBridge::engine_call_get_string_from_utf32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(string_names.func_get_string_from_utf32_name);
}

void PackedByteArrayBridge::engine_call_get_string_from_utf8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};

    Variant pool {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret = pool.call(string_names.func_get_string_from_utf8_name);

    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant ret {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->has(args[0].operator uint8_t())};
    transfer_context->read_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_has_encoded_var(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    Variant ret {instance.call(string_names.func_has_encoded_var_name, args[0], args[1])};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_hex_encode(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};

    Variant pool {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret = pool.call(string_names.func_hex_encode_name);

    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->operator[](args[0].operator unsigned int())};
    transfer_context->write_return_value(env, variant);
}

void PackedByteArrayBridge::engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->insert(args[0].operator unsigned int(), args[1].operator uint8_t());
}

void PackedByteArrayBridge::engine_call_reverse(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->reverse();
}

void PackedByteArrayBridge::engine_call_rfind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant ret {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->rfind(args[0].operator uint8_t(), args->operator int())};
}

void PackedByteArrayBridge::engine_call_pushback(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->push_back(args[0].operator uint8_t());
}

void PackedByteArrayBridge::engine_call_remove_at(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->remove_at(args[0].operator unsigned int());
}

void PackedByteArrayBridge::engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->resize(args[0].operator unsigned int());
}

void PackedByteArrayBridge::engine_call_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->set(args[0].operator unsigned int(), args[1].operator uint8_t());
}

void PackedByteArrayBridge::engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->size()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void PackedByteArrayBridge::engine_call_slice(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant ret {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->slice(args[0].operator int(), args[1].operator int())};
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_sort(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->sort();
}

void PackedByteArrayBridge::engine_call_to_float32_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    Variant ret {instance.call(string_names.func_to_float32_array_name)};
    GDKotlin::get_instance().transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_to_float64_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    Variant ret {instance.call(string_names.func_to_float64_array_name)};
    GDKotlin::get_instance().transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_to_int32_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    Variant ret {instance.call(string_names.func_to_int32_array_name)};
    GDKotlin::get_instance().transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_to_int64_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    Variant ret {instance.call(string_names.func_to_int64_array_name)};
    GDKotlin::get_instance().transfer_context->write_return_value(env, ret);
}

PackedByteArrayBridge::~PackedByteArrayBridge() {
    string_names.func_compress_name = StringName();
    string_names.func_decompress_name = StringName();
    string_names.func_decompress_dynamic_name = StringName();
    string_names.func_get_string_from_ascii_name = StringName();
    string_names.func_get_string_from_utf16_name = StringName();
    string_names.func_get_string_from_utf32_name = StringName();
    string_names.func_get_string_from_utf8_name = StringName();
    string_names.func_has_encoded_var_name = StringName();
    string_names.func_hex_encode_name = StringName();

    string_names.func_encode_double_name = StringName();
    string_names.func_encode_float_name = StringName();
    string_names.func_encode_half_name = StringName();
    string_names.func_encode_s16_name = StringName();
    string_names.func_encode_s32_name = StringName();
    string_names.func_encode_s64_name = StringName();
    string_names.func_encode_s8_name = StringName();
    string_names.func_encode_u16_name = StringName();
    string_names.func_encode_u32_name = StringName();
    string_names.func_encode_u64_name = StringName();
    string_names.func_encode_u8_name = StringName();
    string_names.func_encode_var_name = StringName();

    string_names.func_encode_double_name = StringName();
    string_names.func_encode_float_name = StringName();
    string_names.func_encode_half_name = StringName();
    string_names.func_encode_s16_name = StringName();
    string_names.func_encode_s32_name = StringName();
    string_names.func_encode_s64_name = StringName();
    string_names.func_encode_s8_name = StringName();
    string_names.func_encode_u16_name = StringName();
    string_names.func_encode_u32_name = StringName();
    string_names.func_encode_u64_name = StringName();
    string_names.func_encode_u8_name = StringName();
    string_names.func_encode_var_name = StringName();

    string_names.func_to_float32_array_name = StringName();
    string_names.func_to_float64_array_name = StringName();
    string_names.func_to_int32_array_name = StringName();
    string_names.func_to_int64_array_name = StringName();
}
