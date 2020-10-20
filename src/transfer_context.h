#ifndef GODOT_JVM_TRANSFER_CONTEXT_H
#define GODOT_JVM_TRANSFER_CONTEXT_H
#include "java_instance_wrapper.h"
#include "kt_variant.h"

#define MAX_ARGS_SIZE 16

class TransferContext : public JavaInstanceWrapper {
public:
    struct SharedBuffer {
        void* ptr;
        int capacity;
    };

    TransferContext(jni::JObject p_wrapped, jni::JObject p_class_loader);
    ~TransferContext() = default;
    TransferContext(const TransferContext&) = delete;
    void operator=(const TransferContext&) = delete;

    void write_return_value(jni::Env& p_env, const KtVariant& p_value);
    KtVariant read_return_value(jni::Env& p_env, bool p_refresh_buffer);

    void write_args(jni::Env& p_env, const Vector<KtVariant>& p_args);
    Vector<KtVariant> read_args(jni::Env& p_env, bool p_refresh_buffer);

    static void icall(JNIEnv* rawEnv, jobject instance, jlong jPtr,
               jstring jClassName, jstring jMethod,
               jint expectedReturnType, bool p_refresh_buffer);
    static void update_ref_for_instance_and_method(JNIEnv* raw_env, jobject instance, jlong instance_ptr, jstring field,
                                                   jlong reference_ptr);

    static jlong invoke_constructor(JNIEnv* p_raw_env, jobject p_instance, jstring p_class_name);
    static void set_script(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr, jstring p_class_name, jobject p_object,
                           jobject p_class_loader);
    static void free_object(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

private:
    SharedBuffer* get_buffer(jni::Env& p_env, bool p_refresh_buffer);
    bool ensure_capacity(jni::Env& p_env, long p_capacity);

};

#endif //GODOT_JVM_TRANSFER_CONTEXT_H
