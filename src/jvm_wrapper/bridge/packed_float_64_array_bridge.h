#ifndef GODOT_JVM_PACKED_FLOAT_64_ARRAY_BRIDGE_H
#define GODOT_JVM_PACKED_FLOAT_64_ARRAY_BRIDGE_H

#include "jvm_wrapper/jvm_singleton_wrapper.h"

namespace bridges {

    JVM_SINGLETON_WRAPPER(PackedFloat64ArrayBridge, "godot.core.PackedFloat64Array$Bridge") {
        SINGLETON_CLASS(PackedFloat64ArrayBridge)

        // clang-format off
        INIT_JNI_BINDINGS(
            INIT_NATIVE_METHOD("engine_call_constructor", "()J", PackedFloat64ArrayBridge::engine_call_constructor)
            INIT_NATIVE_METHOD("engine_call_constructor_packed_array", "()J", PackedFloat64ArrayBridge::engine_call_constructor_packed_array)
            INIT_NATIVE_METHOD("engine_call_constructor_array", "()J", PackedFloat64ArrayBridge::engine_call_constructor_array)
            INIT_NATIVE_METHOD("engine_convert_double_array", "([D)J", PackedFloat64ArrayBridge::engine_convert_double_array)
            INIT_NATIVE_METHOD("engine_call_append", "(J)V", PackedFloat64ArrayBridge::engine_call_append)
            INIT_NATIVE_METHOD("engine_call_appendArray", "(J)V", PackedFloat64ArrayBridge::engine_call_appendArray)
            INIT_NATIVE_METHOD("engine_call_bsearch", "(J)V", PackedFloat64ArrayBridge::engine_call_bsearch)
            INIT_NATIVE_METHOD("engine_call_clear", "(J)V", PackedFloat64ArrayBridge::engine_call_clear)
            INIT_NATIVE_METHOD("engine_call_count", "(J)V", PackedFloat64ArrayBridge::engine_call_count)
            INIT_NATIVE_METHOD("engine_call_duplicate", "(J)V", PackedFloat64ArrayBridge::engine_call_duplicate)
            INIT_NATIVE_METHOD("engine_call_fill", "(J)V", PackedFloat64ArrayBridge::engine_call_fill)
            INIT_NATIVE_METHOD("engine_call_find", "(J)V", PackedFloat64ArrayBridge::engine_call_find)
            INIT_NATIVE_METHOD("engine_call_is_empty", "(J)V", PackedFloat64ArrayBridge::engine_call_is_empty)
            INIT_NATIVE_METHOD("engine_call_get", "(J)V", PackedFloat64ArrayBridge::engine_call_get)
            INIT_NATIVE_METHOD("engine_call_has", "(J)V", PackedFloat64ArrayBridge::engine_call_has)
            INIT_NATIVE_METHOD("engine_call_insert", "(J)V", PackedFloat64ArrayBridge::engine_call_insert)
            INIT_NATIVE_METHOD("engine_call_reverse", "(J)V", PackedFloat64ArrayBridge::engine_call_reverse)
            INIT_NATIVE_METHOD("engine_call_pushback", "(J)V", PackedFloat64ArrayBridge::engine_call_pushback)
            INIT_NATIVE_METHOD("engine_call_remove_at", "(J)V", PackedFloat64ArrayBridge::engine_call_remove_at)
            INIT_NATIVE_METHOD("engine_call_resize", "(J)V", PackedFloat64ArrayBridge::engine_call_resize)
            INIT_NATIVE_METHOD("engine_call_rfind", "(J)V", PackedFloat64ArrayBridge::engine_call_rfind)
            INIT_NATIVE_METHOD("engine_call_set", "(J)V", PackedFloat64ArrayBridge::engine_call_set)
            INIT_NATIVE_METHOD("engine_call_size", "(J)V", PackedFloat64ArrayBridge::engine_call_size)
            INIT_NATIVE_METHOD("engine_call_slice", "(J)V", PackedFloat64ArrayBridge::engine_call_slice)
            INIT_NATIVE_METHOD("engine_call_sort", "(J)V", PackedFloat64ArrayBridge::engine_call_sort)
            INIT_NATIVE_METHOD("engine_call_to_byte_array", "(J)V", PackedFloat64ArrayBridge::engine_call_to_byte_array)
          )
        // clang-format on

    public:

        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);
        static uintptr_t engine_call_constructor_packed_array(JNIEnv* p_raw_env, jobject p_instance);
        static uintptr_t engine_call_constructor_array(JNIEnv* p_raw_env, jobject p_instance);
        static uintptr_t engine_convert_double_array(JNIEnv* p_raw_env, jobject p_instance, jdoubleArray p_double_array);

        static void engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_bsearch(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_fill(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_find(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_reverse(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_rfind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_pushback(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_remove_at(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_slice(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_sort(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_to_byte_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
    };
}// namespace bridge

#endif// GODOT_JVM_PACKED_FLOAT_64_ARRAY_BRIDGE_H
