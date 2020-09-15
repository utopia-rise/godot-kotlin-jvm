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
    ~TransferContext();
    TransferContext(const TransferContext&) = delete;
    void operator=(const TransferContext&) = delete;

    void write_return_value(jni::Env& p_env, const KtVariant& p_value);
    KtVariant read_return_value(jni::Env& p_env, bool p_refresh_buffer);

    void write_args(jni::Env& p_env, const Vector<KtVariant>& p_args);
    Vector<KtVariant> read_args(jni::Env& p_env, bool p_refresh_buffer);

    static void initVariantArgsPtrs();

    static void icall(JNIEnv* rawEnv, jobject instance, jlong jPtr,
               jstring jClassName, jstring jMethod,
               jint expectedReturnType, bool p_refresh_buffer);

private:
    SharedBuffer* get_buffer(jni::Env& p_env, bool p_refresh_buffer);
    bool ensure_capacity(jni::Env& p_env, long p_capacity);
    SharedBuffer* shared_buffer;

    static Variant variantArgs[MAX_ARGS_SIZE];
    static const Variant* variantArgsPtr[MAX_ARGS_SIZE];

};

#endif //GODOT_JVM_TRANSFER_CONTEXT_H
