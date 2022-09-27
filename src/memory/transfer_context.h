#ifndef GODOT_JVM_TRANSFER_CONTEXT_H
#define GODOT_JVM_TRANSFER_CONTEXT_H

#include "modules/kotlin_jvm/src/java_instance_wrapper.h"
#include "modules/kotlin_jvm/src/kt_variant.h"
#include "shared_buffer.h"

class TransferContext : public JavaInstanceWrapper<TransferContext> {
public:
    TransferContext(jni::JObject p_wrapped, jni::JObject p_class_loader);

    ~TransferContext();

    TransferContext(const TransferContext&) = delete;

    void operator=(const TransferContext&) = delete;

    void write_return_value(jni::Env& p_env, Variant& variant);

    void read_return_value(jni::Env& p_env, Variant& r_ret);

    void write_args(jni::Env& p_env, const Variant** p_args, int args_size);

    uint32_t read_args_size(jni::Env& p_env);

    Variant read_single_arg(jni::Env& p_env);

    void read_args(jni::Env& p_env, Variant* args);

    static void icall(JNIEnv* rawEnv,
                      jobject instance,
                      jlong j_ptr,
                      jint p_method_index,
                      jint expectedReturnType);

    static void icall_static(JNIEnv* rawEnv, jobject instance, jint p_method_index, jint expectedReturnType);

    static void invoke_constructor(JNIEnv* p_raw_env, jobject p_instance, jint p_class_index, jobject p_object,
                                   jboolean user_defined);

    static jlong get_singleton(JNIEnv* p_raw_env, jobject p_instance, jint p_class_index);

    static void set_script(JNIEnv* p_raw_env,
                           jobject p_instance,
                           jlong p_raw_ptr, jint p_class_index,
                           jobject p_object,
                           jobject p_class_loader);

    static void free_object(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

private:
    SharedBuffer* get_buffer(jni::Env& p_env);

    _FORCE_INLINE_ static uint32_t read_args_size(jni::Env& p_env, SharedBuffer* buffer) {
        uint32_t args_size{decode_uint32(buffer->get_cursor())};
        buffer->increment_position(4);
        return args_size;
    }

    _FORCE_INLINE_ static void read_args_to_array(SharedBuffer* buffer, Variant* p_args, uint32_t args_size) {
        for (uint32_t i = 0; i < args_size; ++i) {
            ktvariant::get_variant_from_buffer(buffer, p_args[i]);
        }

        buffer->rewind();
    }

    _FORCE_INLINE_ static void write_return_value(SharedBuffer* buffer, const Variant& r_ret) {
        ktvariant::send_variant_to_buffer(r_ret, buffer);
        buffer->rewind();
    }

    template<bool is_static>
    static void _icall(JNIEnv* rawEnv,
                       jobject instance,
                       jlong j_ptr,
                       jint p_method_index,
                       jint expectedReturnType);

DECLARE_JNI_METHODS(
        JNI_METHOD(GET_BUFFER, "getBuffer", "()Ljava/nio/ByteBuffer;"))
};

#endif //GODOT_JVM_TRANSFER_CONTEXT_H
