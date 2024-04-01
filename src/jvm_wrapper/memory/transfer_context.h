#ifndef GODOT_JVM_TRANSFER_CONTEXT_H
#define GODOT_JVM_TRANSFER_CONTEXT_H

#include "jvm_wrapper/jvm_instance_wrapper.h"
#include "kt_variant.h"
#include "shared_buffer.h"

// clang-format off
JVM_SINGLETON_WRAPPER(TransferContext, "godot.core.memory.TransferContext") {
    SINGLETON_CLASS(TransferContext)

    JNI_METHOD(GET_BUFFER)
    JNI_METHOD(REMOVE_SCRIPT)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(GET_BUFFER, "getBuffer", "()Ljava/nio/ByteBuffer;")
        INIT_JNI_METHOD(REMOVE_SCRIPT, "removeScriptInstance", "(J)V")
        INIT_NATIVE_METHOD("icall", "(JJI)V", TransferContext::icall)
        INIT_NATIVE_METHOD("createNativeObject", "(ILgodot/core/KtObject;I)V", TransferContext::create_native_object)
        INIT_NATIVE_METHOD("getSingleton", "(I)V", TransferContext::get_singleton)
        INIT_NATIVE_METHOD("freeObject", "(J)V", TransferContext::free_object)
    )

public:

    void write_return_value(jni::Env& p_env, Variant& variant);

    void read_return_value(jni::Env& p_env, Variant& r_ret);

    void write_args(jni::Env& p_env, const Variant** p_args, int args_size);

    uint32_t read_args(jni::Env& p_env, Variant* args);

    void remove_script_instance(uint64_t id);

    static void icall(JNIEnv* rawEnv, jobject instance, jlong j_ptr, jlong j_method_ptr, jint expectedReturnType);

    static void create_native_object(JNIEnv* p_raw_env, jobject instance, jint p_class_index, jobject p_object, jint p_script_index);

    static void get_singleton(JNIEnv* p_raw_env, jobject p_instance, jint p_class_index);

    static void free_object(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

private:
    SharedBuffer* get_and_rewind_buffer(jni::Env& p_env);

    _FORCE_INLINE_ static uint32_t read_args_size(SharedBuffer* buffer) {
        uint32_t args_size {decode_uint32(buffer->get_cursor())};
        buffer->increment_position(4);
        return args_size;
    }

    _FORCE_INLINE_ static void read_args_to_array(SharedBuffer* buffer, Variant* p_args, uint32_t args_size) {
        for (uint32_t i = 0; i < args_size; ++i) {
            ktvariant::get_variant_from_buffer(buffer, p_args[i]);
        }
    }
};

// clang-format on
#endif// GODOT_JVM_TRANSFER_CONTEXT_H
