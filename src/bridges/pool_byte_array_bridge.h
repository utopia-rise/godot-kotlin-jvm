#ifndef GODOT_JVM_POOL_BYTE_ARRAY_BRIDGE_H
#define GODOT_JVM_POOL_BYTE_ARRAY_BRIDGE_H


namespace bridges {

    class PoolByteArrayBridge : JavaInstanceWrapper<PoolByteArrayBridge> {
    private:

        struct StringNames{
            StringName func_compress_name;
            StringName func_decompress_name;
            StringName func_get_string_from_ascii_name;
            StringName func_get_string_from_utf8_name;
            StringName func_hex_encode_name;
        };

        static StringNames string_names;

    public:
        PoolByteArrayBridge(jni::JObject p_wrapped, jni::JObject p_class_loader);

        ~PoolByteArrayBridge();

        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);

        static void engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_compress(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_decompress(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_get_string_from_ascii(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_get_string_from_utf8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_hex_encode(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_invert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_pushback(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_remove(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        static void engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

    DECLARE_JNI_METHODS()
    };

}


#endif
