#ifndef GODOT_JVM_PACKED_BYTE_ARRAY_BRIDGE_H
#define GODOT_JVM_PACKED_BYTE_ARRAY_BRIDGE_H

#include "jvm_wrapper/jvm_instance_wrapper.h"

namespace bridges {

    class PackedByteArrayBridge : JvmInstanceWrapper {
    private:
        struct StringNames {
            StringName func_compress_name;
            StringName func_decompress_name;
            StringName func_decompress_dynamic_name;
            StringName func_get_string_from_ascii_name;
            StringName func_get_string_from_utf16_name;
            StringName func_get_string_from_utf32_name;
            StringName func_get_string_from_utf8_name;
            StringName func_has_encoded_var_name;
            StringName func_hex_encode_name;

            StringName func_decode_double_name;
            StringName func_decode_float_name;
            StringName func_decode_half_name;
            StringName func_decode_s16_name;
            StringName func_decode_s32_name;
            StringName func_decode_s64_name;
            StringName func_decode_s8_name;
            StringName func_decode_u16_name;
            StringName func_decode_u32_name;
            StringName func_decode_u64_name;
            StringName func_decode_u8_name;
            StringName func_decode_var_name;
            StringName func_decode_var_size_name;

            StringName func_encode_double_name;
            StringName func_encode_float_name;
            StringName func_encode_half_name;
            StringName func_encode_s16_name;
            StringName func_encode_s32_name;
            StringName func_encode_s64_name;
            StringName func_encode_s8_name;
            StringName func_encode_u16_name;
            StringName func_encode_u32_name;
            StringName func_encode_u64_name;
            StringName func_encode_u8_name;
            StringName func_encode_var_name;

            StringName func_to_float32_array_name;
            StringName func_to_float64_array_name;
            StringName func_to_int32_array_name;
            StringName func_to_int64_array_name;
        };

        static StringNames string_names;

    public:
        PackedByteArrayBridge(jni::JObject p_wrapped);

        ~PackedByteArrayBridge();

        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);

        static uintptr_t engine_call_constructor_packed_array(JNIEnv* p_raw_env, jobject p_instance);

        static uintptr_t engine_call_constructor_array(JNIEnv* p_raw_env, jobject p_instance);

        static void engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_bsearch(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_compress(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_decode_double(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_decode_float(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_decode_half(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_decode_s16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_decode_s32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_decode_s64(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_decode_s8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_decode_u16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_decode_u32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_decode_u64(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_decode_u8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_decode_var(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_decode_var_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_decompress(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_decompress_dynamic(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_encode_double(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_encode_float(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_encode_half(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_encode_s16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_encode_s32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_encode_s64(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_encode_s8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_encode_u16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_encode_u32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_encode_u64(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_encode_u8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_encode_var(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_get_string_from_utf16(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_get_string_from_utf32(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_fill(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_find(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_get_string_from_ascii(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_get_string_from_utf8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_has_encoded_var(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_hex_encode(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_reverse(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_rfind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_pushback(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_remove_at(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_slice(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_sort(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_to_float32_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_to_float64_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_to_int32_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_to_int64_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        // clang-format off
        DECLARE_JNI_METHODS()
        // clang-format on
    };

}// namespace bridge

#endif
