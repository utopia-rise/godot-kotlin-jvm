#ifndef GODOT_JVM_PACKED_BYTE_ARRAY_BRIDGE_H
#define GODOT_JVM_PACKED_BYTE_ARRAY_BRIDGE_H

#include "java_instance_wrapper.h"

namespace bridges {

    class PackedByteArrayBridge : JavaInstanceWrapper<PackedByteArrayBridge> {
    private:
        struct StringNames {
            StringName func_compress_name;
            StringName func_decompress_name;
            StringName func_get_string_from_ascii_name;
            StringName func_get_string_from_utf8_name;
            StringName func_hex_encode_name;
        };

        static StringNames string_names;

    public:
        PackedByteArrayBridge(jni::JObject p_wrapped, jni::JObject p_class_loader);

        ~PackedByteArrayBridge();

        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);

        static void engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_compress(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_decompress(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_get_string_from_ascii(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_get_string_from_utf8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_hex_encode(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_reverse(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_pushback(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_remove_at(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        // clang-format off
        DECLARE_JNI_METHODS()
        // clang-format on
    };

}// namespace bridges

#endif
