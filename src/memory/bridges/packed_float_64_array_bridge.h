#ifndef GODOT_JVM_PACKED_FLOAT_64_ARRAY_BRIDGE_H
#define GODOT_JVM_PACKED_FLOAT_64_ARRAY_BRIDGE_H

namespace bridges {

    class PackedFloat64ArrayBridge : JavaInstanceWrapper<PackedFloat64ArrayBridge> {
    public:
        PackedFloat64ArrayBridge(jni::JObject p_wrapped, jni::JObject p_class_loader);
        ~PackedFloat64ArrayBridge() = default;

        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);

        static void engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
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
}

#endif //GODOT_JVM_PACKED_FLOAT_64_ARRAY_BRIDGE_H
