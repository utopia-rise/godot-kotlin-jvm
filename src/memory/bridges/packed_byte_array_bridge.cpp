#include "packed_byte_array_bridge.h"

#include "bridges_utils.h"
#include "constants.h"
#include "gd_kotlin.h"

using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(PackedByteArrayBridge)

PackedByteArrayBridge::StringNames PackedByteArrayBridge::string_names;

PackedByteArrayBridge::PackedByteArrayBridge(jni::JObject p_wrapped, jni::JObject p_class_loader) :
  JavaInstanceWrapper(PACKED_BYTE_ARRAY_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader) {
    jni::JNativeMethod engine_call_constructor_method {
      const_cast<char*>("engine_call_constructor"),
      const_cast<char*>("()J"),
      (void*) PackedByteArrayBridge::engine_call_constructor};
    jni::JNativeMethod engine_call_constructor_packed_byte_array_method {
            const_cast<char*>("engine_call_constructor_packed_byte_array"),
            const_cast<char*>("()J"),
            (void*) PackedByteArrayBridge::engine_call_constructor_packed_byte_array};
    jni::JNativeMethod engine_call_constructor_array_method {
            const_cast<char*>("engine_call_constructor_array"),
            const_cast<char*>("()J"),
            (void*) PackedByteArrayBridge::engine_call_constructor_array};

    jni::JNativeMethod engine_call_append_method {
      const_cast<char*>("engine_call_append"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_append};
    jni::JNativeMethod engine_call_appendArray_method {
      const_cast<char*>("engine_call_appendArray"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_appendArray};
    jni::JNativeMethod engine_call_bsearch_method {
            const_cast<char*>("engine_call_bsearch"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_bsearch};
    jni::JNativeMethod engine_call_clear_method {
            const_cast<char*>("engine_call_clear"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_clear};
    jni::JNativeMethod engine_call_compress_method {
      const_cast<char*>("engine_call_compress"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_compress};
    jni::JNativeMethod engine_call_count_method {
            const_cast<char*>("engine_call_count"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_count};
    jni::JNativeMethod  engine_call_decode_double_method{
        const_cast<char*>("engine_call_decode_double"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_decode_double
    };
    jni::JNativeMethod  engine_call_decode_float_method{
        const_cast<char*>("engine_call_decode_float"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_decode_float
    };
    jni::JNativeMethod  engine_call_decode_half_method{
        const_cast<char*>("engine_call_decode_half"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_decode_half
    };
    jni::JNativeMethod  engine_call_decode_s16_method{
        const_cast<char*>("engine_call_decode_s16"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_decode_s16
    };
    jni::JNativeMethod  engine_call_decode_s32_method{
        const_cast<char*>("engine_call_decode_s32"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_decode_s32
    };
    jni::JNativeMethod  engine_call_decode_s64_method{
        const_cast<char*>("engine_call_decode_s64"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_decode_s64
    };
    jni::JNativeMethod  engine_call_decode_s8_method{
        const_cast<char*>("engine_call_decode_s8"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_decode_s8
    };
    jni::JNativeMethod  engine_call_decode_u16_method{
        const_cast<char*>("engine_call_decode_u16"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_decode_u16
    };
    jni::JNativeMethod  engine_call_decode_u32_method{
        const_cast<char*>("engine_call_decode_u32"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_decode_u32
    };
    jni::JNativeMethod  engine_call_decode_u64_method{
        const_cast<char*>("engine_call_decode_u64"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_decode_u64
    };
    jni::JNativeMethod  engine_call_decode_u8_method{
        const_cast<char*>("engine_call_decode_u8"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_decode_u8
    };
    jni::JNativeMethod  engine_call_decode_var_method{
        const_cast<char*>("engine_call_decode_var"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_decode_var
    };
    jni::JNativeMethod  engine_call_decode_var_size_method{
            const_cast<char*>("engine_call_decode_var_size"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_decode_var_size
    };
    jni::JNativeMethod engine_call_decompress_method {
      const_cast<char*>("engine_call_decompress"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_decompress};
    jni::JNativeMethod engine_call_decompress_dynamic_method {
            const_cast<char*>("engine_call_decompress_dynamic"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_decompress_dynamic};
    jni::JNativeMethod engine_call_duplicate_method {
            const_cast<char*>("engine_call_duplicate"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_duplicate};
    jni::JNativeMethod engine_call_encode_double_method {
        const_cast<char*>("engine_call_encode_double"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_encode_double
    };
    jni::JNativeMethod engine_call_encode_float_method {
        const_cast<char*>("engine_call_encode_float"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_encode_float
    };
    jni::JNativeMethod engine_call_encode_half_method {
        const_cast<char*>("engine_call_encode_half"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_encode_half
    };
    jni::JNativeMethod engine_call_encode_s16_method {
        const_cast<char*>("engine_call_encode_s16"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_encode_s16
    };
    jni::JNativeMethod engine_call_encode_s32_method {
        const_cast<char*>("engine_call_encode_s32"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_encode_s32
    };
    jni::JNativeMethod engine_call_encode_s64_method {
        const_cast<char*>("engine_call_encode_s64"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_encode_s64
    };
    jni::JNativeMethod engine_call_encode_s8_method {
        const_cast<char*>("engine_call_encode_s8"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_encode_s8
    };
    jni::JNativeMethod engine_call_encode_u16_method {
        const_cast<char*>("engine_call_encode_u16"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_encode_u16
    };
    jni::JNativeMethod engine_call_encode_u32_method {
        const_cast<char*>("engine_call_encode_u32"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_encode_u32
    };
    jni::JNativeMethod engine_call_encode_u64_method {
        const_cast<char*>("engine_call_encode_u64"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_encode_u64
    };
    jni::JNativeMethod engine_call_encode_u8_method {
        const_cast<char*>("engine_call_encode_u8"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_encode_u8
    };
    jni::JNativeMethod engine_call_encode_var_method {
        const_cast<char*>("engine_call_encode_var"),
        const_cast<char*>("(J)V"),
        (void*) PackedByteArrayBridge::engine_call_encode_var
    };
    jni::JNativeMethod engine_call_fill_method {
            const_cast<char*>("engine_call_fill"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_fill
    };
    jni::JNativeMethod engine_call_find_method {
            const_cast<char*>("engine_call_find"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_find
    };
    jni::JNativeMethod engine_call_is_empty_method {
      const_cast<char*>("engine_call_is_empty"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_is_empty};
    jni::JNativeMethod engine_call_get_string_from_ascii_method {
      const_cast<char*>("engine_call_get_string_from_ascii"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_get_string_from_ascii};
    jni::JNativeMethod engine_call_get_string_from_utf16_method {
            const_cast<char*>("engine_call_get_string_from_utf16"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_get_string_from_utf16};
    jni::JNativeMethod engine_call_get_string_from_utf32_method {
            const_cast<char*>("engine_call_get_string_from_utf32"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_get_string_from_utf32};
    jni::JNativeMethod engine_call_get_string_from_utf8_method {
      const_cast<char*>("engine_call_get_string_from_utf8"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_get_string_from_utf8};
    jni::JNativeMethod engine_call_has_method {
            const_cast<char*>("engine_call_has"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_has};
    jni::JNativeMethod engine_call_has_encoded_var_method {
            const_cast<char*>("engine_call_has_encoded_var"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_has_encoded_var};
    jni::JNativeMethod engine_call_hex_encode_method {
      const_cast<char*>("engine_call_hex_encode"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_hex_encode};
    jni::JNativeMethod engine_call_get_method {
      const_cast<char*>("engine_call_get"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_get};
    jni::JNativeMethod engine_call_insert_method {
      const_cast<char*>("engine_call_insert"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_insert};
    jni::JNativeMethod engine_call_reverse_method {
      const_cast<char*>("engine_call_reverse"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_reverse};
    jni::JNativeMethod engine_call_rfind_method {
            const_cast<char*>("engine_call_rfind"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_rfind};
    jni::JNativeMethod engine_call_pushback_method {
      const_cast<char*>("engine_call_pushback"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_pushback};
    jni::JNativeMethod engine_call_remove_at_method {
      const_cast<char*>("engine_call_remove_at"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_remove_at};
    jni::JNativeMethod engine_call_resize_method {
      const_cast<char*>("engine_call_resize"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_resize};
    jni::JNativeMethod engine_call_set_method {
      const_cast<char*>("engine_call_set"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_set};
    jni::JNativeMethod engine_call_size_method {
      const_cast<char*>("engine_call_size"),
      const_cast<char*>("(J)V"),
      (void*) PackedByteArrayBridge::engine_call_size};
    jni::JNativeMethod engine_call_slice_method {
            const_cast<char*>("engine_call_slice"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_slice};
    jni::JNativeMethod engine_call_sort_method {
            const_cast<char*>("engine_call_sort"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_sort};
    jni::JNativeMethod engine_call_to_float32_array_method {
            const_cast<char*>("engine_call_to_float32_array"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_to_float32_array};
    jni::JNativeMethod engine_call_to_float64_array_method {
            const_cast<char*>("engine_call_to_float64_array"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_to_float64_array};
    jni::JNativeMethod engine_call_to_int32_array_method {
            const_cast<char*>("engine_call_to_int32_array"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_to_int32_array};
    jni::JNativeMethod engine_call_to_int64_array_method {
            const_cast<char*>("engine_call_to_int64_array"),
            const_cast<char*>("(J)V"),
            (void*) PackedByteArrayBridge::engine_call_to_int64_array};

    Vector<jni::JNativeMethod> methods;
    methods.push_back(engine_call_constructor_method);
    methods.push_back(engine_call_constructor_packed_byte_array_method);
    methods.push_back(engine_call_constructor_array_method);

    methods.push_back(engine_call_append_method);
    methods.push_back(engine_call_appendArray_method);
    methods.push_back(engine_call_bsearch_method);
    methods.push_back(engine_call_clear_method);
    methods.push_back(engine_call_compress_method);
    methods.push_back(engine_call_count_method);
    methods.push_back(engine_call_decode_double_method);
    methods.push_back(engine_call_decode_float_method);
    methods.push_back(engine_call_decode_half_method);
    methods.push_back(engine_call_decode_s16_method);
    methods.push_back(engine_call_decode_s32_method);
    methods.push_back(engine_call_decode_s64_method);
    methods.push_back(engine_call_decode_s8_method);
    methods.push_back(engine_call_decode_u16_method);
    methods.push_back(engine_call_decode_u32_method);
    methods.push_back(engine_call_decode_u64_method);
    methods.push_back(engine_call_decode_u8_method);
    methods.push_back(engine_call_decode_var_method);
    methods.push_back(engine_call_decode_var_size_method);
    methods.push_back(engine_call_decompress_method);
    methods.push_back(engine_call_decompress_dynamic_method);
    methods.push_back(engine_call_duplicate_method);
    methods.push_back(engine_call_encode_double_method);
    methods.push_back(engine_call_encode_float_method);
    methods.push_back(engine_call_encode_half_method);
    methods.push_back(engine_call_encode_s16_method);
    methods.push_back(engine_call_encode_s32_method);
    methods.push_back(engine_call_encode_s64_method);
    methods.push_back(engine_call_encode_s8_method);
    methods.push_back(engine_call_encode_u16_method);
    methods.push_back(engine_call_encode_u32_method);
    methods.push_back(engine_call_encode_u64_method);
    methods.push_back(engine_call_encode_u8_method);
    methods.push_back(engine_call_encode_var_method);
    methods.push_back(engine_call_fill_method);
    methods.push_back(engine_call_find_method);
    methods.push_back(engine_call_is_empty_method);
    methods.push_back(engine_call_get_string_from_ascii_method);
    methods.push_back(engine_call_get_string_from_utf16_method);
    methods.push_back(engine_call_get_string_from_utf32_method);
    methods.push_back(engine_call_get_string_from_utf8_method);
    methods.push_back(engine_call_has_method);
    methods.push_back(engine_call_has_encoded_var_method);
    methods.push_back(engine_call_hex_encode_method);
    methods.push_back(engine_call_get_method);
    methods.push_back(engine_call_insert_method);
    methods.push_back(engine_call_reverse_method);
    methods.push_back(engine_call_rfind_method);
    methods.push_back(engine_call_pushback_method);
    methods.push_back(engine_call_remove_at_method);
    methods.push_back(engine_call_resize_method);
    methods.push_back(engine_call_set_method);
    methods.push_back(engine_call_size_method);
    methods.push_back(engine_call_slice_method);
    methods.push_back(engine_call_sort_method);
    methods.push_back(engine_call_to_float32_array_method);
    methods.push_back(engine_call_to_float64_array_method);
    methods.push_back(engine_call_to_int32_array_method);
    methods.push_back(engine_call_to_int64_array_method);

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

    jni::Env env {jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}

uintptr_t PackedByteArrayBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(PackedByteArray));
}

uintptr_t PackedByteArrayBridge::engine_call_constructor_packed_byte_array(JNIEnv* p_raw_env, jobject p_instance) {
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
    Variant ret {
            from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->bsearch(
                    args[0].operator uint8_t(),
                    args[1].operator bool()
            )
    };
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

    Variant ret {
            from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->count(args[0].operator uint8_t())
    };
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_double(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret { instance.call(string_names.func_decode_double_name, args[0]) };
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_float(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret { instance.call(string_names.func_decode_float_name, args[0]) };
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_half(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret { instance.call(string_names.func_decode_half_name, args[0]) };
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_s16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret { instance.call(string_names.func_decode_s16_name, args[0]) };
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_s32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret { instance.call(string_names.func_decode_s32_name, args[0]) };
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_s64(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret { instance.call(string_names.func_decode_s64_name, args[0]) };
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_s8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret { instance.call(string_names.func_decode_s8_name, args[0]) };
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_u16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret { instance.call(string_names.func_decode_u16_name, args[0]) };
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_u32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret { instance.call(string_names.func_decode_u32_name, args[0]) };
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_u64(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret { instance.call(string_names.func_decode_u64_name, args[0]) };
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_u8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret { instance.call(string_names.func_decode_u8_name, args[0]) };
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_var(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret { instance.call(string_names.func_decode_var_name, args[0], args[1]) };
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_decode_var_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};

    Variant ret { instance.call(string_names.func_decode_var_size_name, args[0], args[1]) };
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
    Variant ret {
            from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->find(args[0].operator uint8_t())
    };
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
    Variant instance { *from_uint_to_ptr<PackedByteArray>(p_raw_ptr) };
    instance.call(string_names.func_get_string_from_utf16_name);
}

void PackedByteArrayBridge::engine_call_get_string_from_utf32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    Variant instance { *from_uint_to_ptr<PackedByteArray>(p_raw_ptr) };
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

    Variant ret {
        from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->rfind(args[0].operator uint8_t(), args->operator int())
    };
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

    Variant ret {
            from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->slice(args[0].operator int(), args[1].operator int())
    };
    transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_sort(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<PackedByteArray>(p_raw_ptr)->sort();
}

void PackedByteArrayBridge::engine_call_to_float32_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    Variant ret {
            instance.call(string_names.func_to_float32_array_name)
    };
    GDKotlin::get_instance().transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_to_float64_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    Variant ret {
            instance.call(string_names.func_to_float64_array_name)
    };
    GDKotlin::get_instance().transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_to_int32_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    Variant ret {
            instance.call(string_names.func_to_int32_array_name)
    };
    GDKotlin::get_instance().transfer_context->write_return_value(env, ret);
}

void PackedByteArrayBridge::engine_call_to_int64_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant instance {*from_uint_to_ptr<PackedByteArray>(p_raw_ptr)};
    Variant ret {
            instance.call(string_names.func_to_int64_array_name)
    };
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
