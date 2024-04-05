#include "packed_byte_array_bridge.h"

#include "bridges_utils.h"
#include "gd_kotlin.h"

using namespace bridges;

uintptr_t PackedByteArrayBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(PackedByteArray));
}

uintptr_t PackedByteArrayBridge::engine_call_constructor_packed_array(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(PackedByteArray(args[0].operator PackedByteArray())));
}

uintptr_t PackedByteArrayBridge::engine_call_constructor_array(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(PackedByteArray(args[0].operator Vector<uint8_t>())));
}

void PackedByteArrayBridge::engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->append(args[0].operator uint8_t());
}

void PackedByteArrayBridge::engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->append_array(args[0].operator PackedByteArray());
}

void PackedByteArrayBridge::engine_call_bsearch(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant ret {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->bsearch(args[0].operator uint8_t(), args[1].operator bool())};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->clear();
}

void PackedByteArrayBridge::engine_call_compress(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant pool {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret = pool.call(SNAME("compress"), args[0]);

    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant ret {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->count(args[0].operator uint8_t())};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_double(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(SNAME("decode_double"), args[0])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_float(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(SNAME("decode_float"), args[0])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_half(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(SNAME("decode_half"), args[0])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_s16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(SNAME("decode_s16"), args[0])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_s32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(SNAME("decode_s32"), args[0])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_s64(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(SNAME("decode_s64"), args[0])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_s8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(SNAME("decode_s8"), args[0])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_u16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(SNAME("decode_u16"), args[0])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_u32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(SNAME("decode_u32"), args[0])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_u64(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(SNAME("decode_u64"), args[0])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_u8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(SNAME("decode_u8"), args[0])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_var(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(SNAME("decode_var"), args[0], args[1])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_var_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret {instance.call(SNAME("decode_var_size"), args[0], args[1])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decompress(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant pool {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret = pool.call(SNAME("decompress"), args[0], args[1]);

    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decompress_dynamic(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant pool {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    auto t = args[0];

    Variant ret = pool.call(SNAME("decompress_dynamic"), args[0], args[1]);

    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant ret {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->duplicate()};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_encode_double(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(SNAME("encode_double"), args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_float(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(SNAME("encode_float"), args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_half(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(SNAME("encode_half"), args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_s16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(SNAME("encode_s16"), args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_s32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(SNAME("encode_s32"), args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_s64(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(SNAME("encode_s64"), args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_s8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(SNAME("encode_s8"), args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_u16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(SNAME("encode_u16"), args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_u32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(SNAME("encode_u32"), args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_u64(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(SNAME("encode_u64"), args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_u8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(SNAME("encode_u8"), args[0], args[1]);
}

void PackedByteArrayBridge::engine_call_encode_var(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[3] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(SNAME("encode_u8"), args[0], args[1], args[2]);
}

void PackedByteArrayBridge::engine_call_fill(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->fill(args[0].operator uint8_t());
}

void PackedByteArrayBridge::engine_call_find(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant ret {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->find(args[0].operator uint8_t())};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context = &TransferContext::get_instance();
    Variant variant {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->is_empty()};
    TransferContext::get_instance().write_return_value(env, variant);
}

void PackedByteArrayBridge::engine_call_get_string_from_ascii(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant pool {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret = pool.call(SNAME("get_string_from_ascii"));

    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_get_string_from_utf16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(SNAME("get_string_from_utf16"));
}

void PackedByteArrayBridge::engine_call_get_string_from_utf32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    instance.call(SNAME("get_string_from_utf32"));
}

void PackedByteArrayBridge::engine_call_get_string_from_utf8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant pool {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret = pool.call(SNAME("get_string_from_utf8"));

    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant ret {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->has(args[0].operator uint8_t())};
    TransferContext::get_instance().read_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_has_encoded_var(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    Variant ret {instance.call(SNAME("has_encoded_var"), args[0], args[1])};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_hex_encode(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};

    Variant pool {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret = pool.call(SNAME("hex_encode"));

    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    Variant variant {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->operator[](args[0].operator unsigned int())};
    TransferContext::get_instance().write_return_value(env, variant);
}

void PackedByteArrayBridge::engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->insert(args[0].operator unsigned int(), args[1].operator uint8_t());
}

void PackedByteArrayBridge::engine_call_reverse(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->reverse();
}

void PackedByteArrayBridge::engine_call_rfind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant ret {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->rfind(args[0].operator uint8_t(), args->operator int())};
}

void PackedByteArrayBridge::engine_call_pushback(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->push_back(args[0].operator uint8_t());
}

void PackedByteArrayBridge::engine_call_remove_at(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->remove_at(args[0].operator unsigned int());
}

void PackedByteArrayBridge::engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->resize(args[0].operator unsigned int());
}

void PackedByteArrayBridge::engine_call_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->set(args[0].operator unsigned int(), args[1].operator uint8_t());
}

void PackedByteArrayBridge::engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->size()};
    TransferContext::get_instance().write_return_value(env, variant);
}

void PackedByteArrayBridge::engine_call_slice(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext::get_instance().read_args(env, args);

    Variant ret {from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->slice(args[0].operator int(), args[1].operator int())};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_sort(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->sort();
}

void PackedByteArrayBridge::engine_call_to_float32_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    Variant ret {instance.call(SNAME("to_float32_array"))};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_to_float64_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    Variant ret {instance.call(SNAME("to_float64_array"))};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_to_int32_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    Variant ret {instance.call(SNAME("to_int32_array"))};
    TransferContext::get_instance().write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_to_int64_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    Variant ret {instance.call(SNAME("to_int64_array"))};
    TransferContext::get_instance().write_return_value(env, ret);
}

PackedByteArrayBridge::~PackedByteArrayBridge() = default;