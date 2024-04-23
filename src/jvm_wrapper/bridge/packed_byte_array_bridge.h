#ifndef GODOT_JVM_PACKED_BYTE_ARRAY_BRIDGE_H
#define GODOT_JVM_PACKED_BYTE_ARRAY_BRIDGE_H

#include "jvm_wrapper/jvm_singleton_wrapper.h"

namespace bridges {

    JVM_SINGLETON_WRAPPER(PackedByteArrayBridge, "godot.core.PackedByteArray$Bridge") {
        SINGLETON_CLASS(PackedByteArrayBridge)

        // clang-format off
        INIT_JNI_BINDINGS(
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

            INIT_NATIVE_METHOD("engine_convert_to_godot", "([B)J", PackedByteArrayBridge::engine_convert_to_godot)
            INIT_NATIVE_METHOD("engine_convert_to_jvm", "([J)B", PackedByteArrayBridge::engine_convert_to_jvm)
        )
        // clang-format on

    public:
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

        static uintptr_t engine_convert_to_godot(JNIEnv* p_raw_env, jobject p_instance, jbyteArray p_array);
        static jbyteArray engine_convert_to_jvm(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
    };

}// namespace bridge

#endif
