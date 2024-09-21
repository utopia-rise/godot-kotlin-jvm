#include "transfer_context.h"

#include "script/jvm_script_manager.h"
#include "script/jvm_instance.h"

const int MAX_STACK_SIZE = MAX_FUNCTION_ARG_COUNT * 8;

thread_local static Variant variant_args[MAX_STACK_SIZE];// NOLINT(cert-err58-cpp)
thread_local static const Variant* variant_args_ptr[MAX_STACK_SIZE];
thread_local static int stack_offset = -1;

TransferContext::~TransferContext() = default;

SharedBuffer* TransferContext::get_and_rewind_buffer(jni::Env& p_env) {
    thread_local static SharedBuffer shared_buffer;

    if (unlikely(!shared_buffer.is_init())) {
        jni::JObject buffer = wrapped.call_object_method(p_env, GET_BUFFER);
        JVM_DEV_ASSERT(!buffer.is_null(), "Buffer is null");
        auto* address {static_cast<uint8_t*>(p_env.get_direct_buffer_address(buffer))};
#ifdef DEBUG_ENABLED
        shared_buffer = SharedBuffer {address, 0, p_env.get_direct_buffer_capacity(buffer)};
#else
        shared_buffer = SharedBuffer {address, 0};
#endif
    }
    shared_buffer.rewind();
    return &shared_buffer;
}

void TransferContext::read_return_value(jni::Env& p_env, Variant& r_ret) {
    SharedBuffer* buffer {get_and_rewind_buffer(p_env)};
    ktvariant::get_variant_from_buffer(buffer, r_ret);
}

void TransferContext::write_args(jni::Env& p_env, const Variant** p_args, int args_size) {
    SharedBuffer* buffer {get_and_rewind_buffer(p_env)};
    buffer->increment_position(encode_uint32(args_size, buffer->get_cursor()));
    for (auto i = 0; i < args_size; ++i) {
        ktvariant::send_variant_to_buffer(*p_args[i], buffer);
    }
}

uint32_t TransferContext::read_args(jni::Env& p_env, Variant* args) {
    SharedBuffer* buffer {get_and_rewind_buffer(p_env)};
    uint32_t size {read_args_size(buffer)};
    for (uint32_t i = 0; i < size; ++i) {
        ktvariant::get_variant_from_buffer(buffer, args[i]);
    }
    return size;
}

void TransferContext::write_return_value(jni::Env& p_env, Variant& variant) {
    ktvariant::send_variant_to_buffer(variant, get_and_rewind_buffer(p_env));
}

void TransferContext::write_object_data(jni::Env& p_env, uintptr_t ptr, ObjectID id) {
    SharedBuffer* buffer {get_and_rewind_buffer(p_env)};
    buffer->increment_position(encode_uint64(ptr, buffer->get_cursor()));
    buffer->increment_position(encode_uint64(id, buffer->get_cursor()));
}

void TransferContext::icall(JNIEnv* rawEnv, jobject instance, jlong j_ptr, jlong j_method_ptr, jint expectedReturnType) {
    if (unlikely(stack_offset == -1)) {
        for (int i = 0; i < MAX_STACK_SIZE; i++) {
            variant_args_ptr[i] = &variant_args[i];
        }
        stack_offset = 0;
    }

    jni::Env env {rawEnv};

    SharedBuffer* buffer {get_instance().get_and_rewind_buffer(env)};
    uint32_t args_size {read_args_size(buffer)};

    auto* ptr {reinterpret_cast<Object*>(static_cast<uintptr_t>(j_ptr))};

    MethodBind* method_bind {reinterpret_cast<MethodBind*>(static_cast<uintptr_t>(j_method_ptr))};

    JVM_DEV_ASSERT(args_size <= MAX_FUNCTION_ARG_COUNT, "Cannot have more than %s arguments for method call but tried to call method \"%s::%s\" with %s args", MAX_FUNCTION_ARG_COUNT, method_bind->get_instance_class(), method_bind->get_name(), args_size);

    Callable::CallError r_error {Callable::CallError::CALL_OK};

    if (unlikely(stack_offset + args_size > MAX_STACK_SIZE)) {
        Variant args[MAX_FUNCTION_ARG_COUNT];
        read_args_to_array(buffer, args, args_size);

        const Variant* args_ptr[MAX_FUNCTION_ARG_COUNT];
        for (uint32_t i = 0; i < args_size; i++) {
            args_ptr[i] = &args[i];
        }

        const Variant& ret_value {method_bind->call(ptr, args_ptr, args_size, r_error)};

        buffer->rewind();
        ktvariant::send_variant_to_buffer(ret_value, buffer);
    } else {
        Variant* args {variant_args + stack_offset};
        read_args_to_array(buffer, args, args_size);

        const Variant** args_ptr {variant_args_ptr + stack_offset};

        stack_offset += args_size;
        const Variant& ret_value {method_bind->call(ptr, args_ptr, args_size, r_error)};
        // Remove Variants so memory can be freed immediately after method call.
        for (uint32_t i = 0; i < args_size; i++) {
            args[i] = Variant();
        }
        stack_offset -= args_size;

        buffer->rewind();
        ktvariant::send_variant_to_buffer(ret_value, buffer);
    }

#ifdef DEBUG_ENABLED
    JVM_ERR_FAIL_COND_MSG(r_error.error != Callable::CallError::CALL_OK, "Call to method %s failed.", method_bind->get_name());
#endif
}
