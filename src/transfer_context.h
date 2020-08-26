#ifndef GODOT_JVM_TRANSFER_CONTEXT_H
#define GODOT_JVM_TRANSFER_CONTEXT_H
#include "java_instance_wrapper.h"
#include "kt_variant.h"

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

    SharedBuffer get_buffer(jni::Env& p_env);
    bool ensure_capacity(jni::Env& p_env, int p_capacity);

    void write_return_value(jni::Env& p_env, const SharedBuffer& p_buffer, const KtVariant& p_value);
    KtVariant read_return_value(jni::Env& p_env, const SharedBuffer& p_buffer);

    void write_args(jni::Env& p_env, const SharedBuffer& p_buffer, const Vector<KtVariant>& p_args);
    Vector<KtVariant> read_args(jni::Env& p_env, const SharedBuffer& p_buffer);
};


#endif //GODOT_JVM_TRANSFER_CONTEXT_H
