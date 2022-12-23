#include "transfer_context.h"

#include "gd_kotlin.h"
#include "kotlin_instance.h"

JNI_INIT_STATICS_FOR_CLASS(TransferContext)
const int VARIANT_ARG_MAX {5};
const int MAX_STACK_SIZE = VARIANT_ARG_MAX * 8;

thread_local static Variant variant_args[MAX_STACK_SIZE];// NOLINT(cert-err58-cpp)
thread_local static const Variant* variant_args_ptr[MAX_STACK_SIZE];
thread_local static int stack_offset = -1;

TransferContext::TransferContext(jni::JObject p_wrapped, jni::JObject p_class_loader) :
  JavaInstanceWrapper("godot.core.memory.TransferContext", p_wrapped, p_class_loader) {
    jni::JNativeMethod icall_method {const_cast<char*>("icall"), const_cast<char*>("(JII)V"), (void*) TransferContext::icall};

    jni::JNativeMethod create_native_objectmethod {
      const_cast<char*>("createNativeObject"),
      const_cast<char*>("(ILgodot/core/KtObject;Ljava/lang/ClassLoader;I)V"),
      (void*) TransferContext::create_native_object};

    jni::JNativeMethod get_singleton_method {const_cast<char*>("getSingleton"), const_cast<char*>("(I)J"), (void*) TransferContext::get_singleton};

    jni::JNativeMethod free_object_method {const_cast<char*>("freeObject"), const_cast<char*>("(J)V"), (void*) TransferContext::free_object};

    Vector<jni::JNativeMethod> methods;
    methods.push_back(icall_method);
    methods.push_back(create_native_objectmethod);
    methods.push_back(get_singleton_method);
    methods.push_back(free_object_method);
    jni::Env env {jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
}

TransferContext::~TransferContext() {
    for (auto& variant_arg : variant_args) {
        variant_arg = Variant();
    }
}

SharedBuffer* TransferContext::get_buffer(jni::Env& p_env) {
    thread_local static SharedBuffer shared_buffer;

    if (unlikely(!shared_buffer.is_init())) {
        jni::MethodId method = get_method_id(p_env, jni_methods.GET_BUFFER);
        jni::JObject buffer = wrapped.call_object_method(p_env, method);
        JVM_CRASH_COND_MSG(buffer.is_null(), "Buffer is null");
        auto* address {static_cast<uint8_t*>(p_env.get_direct_buffer_address(buffer))};
#ifdef DEBUG_ENABLED
        shared_buffer = SharedBuffer {address, 0, p_env.get_direct_buffer_capacity(buffer)};
#else
        shared_buffer = SharedBuffer {address, 0};
#endif
    }

    return &shared_buffer;
}

void TransferContext::read_return_value(jni::Env& p_env, Variant& r_ret) {
    SharedBuffer* buffer {get_buffer(p_env)};
    ktvariant::get_variant_from_buffer(buffer, r_ret);
    buffer->rewind();
}

void TransferContext::write_args(jni::Env& p_env, const Variant** p_args, int args_size) {
    SharedBuffer* buffer {get_buffer(p_env)};
    buffer->increment_position(encode_uint32(args_size, buffer->get_cursor()));
    for (auto i = 0; i < args_size; ++i) {
        ktvariant::send_variant_to_buffer(*p_args[i], buffer);
    }
    buffer->rewind();
}

uint32_t TransferContext::read_args_size(jni::Env& p_env) {
    SharedBuffer* buffer {get_buffer(p_env)};
    uint32_t size {decode_uint32(buffer->get_cursor())};
    buffer->increment_position(4);
    return size;
}

Variant TransferContext::read_single_arg(jni::Env& p_env) {
    SharedBuffer* buffer {get_buffer(p_env)};
    Variant r_ret;
    ktvariant::get_variant_from_buffer(buffer, r_ret);
    return r_ret;
}

void TransferContext::read_args(jni::Env& p_env, Variant* args) {
    SharedBuffer* buffer {get_buffer(p_env)};
    uint32_t size {read_args_size(p_env)};
    for (uint32_t i = 0; i < size; ++i) {
        ktvariant::get_variant_from_buffer(buffer, args[i]);
    }
    buffer->rewind();
}

void TransferContext::icall(JNIEnv* rawEnv, jobject instance, jlong j_ptr, jint p_method_index, jint expectedReturnType) {
    if (unlikely(stack_offset == -1)) {
        for (int i = 0; i < MAX_STACK_SIZE; i++) {
            variant_args_ptr[i] = &variant_args[i];
        }
        stack_offset = 0;
    }

    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    jni::Env env {rawEnv};

    SharedBuffer* buffer {transfer_context->get_buffer(env)};
    uint32_t args_size {read_args_size(env, buffer)};

#ifdef DEBUG_ENABLED
    JVM_CRASH_COND_MSG(args_size > VARIANT_ARG_MAX, vformat("Cannot have more than %s arguments for method call.", VARIANT_ARG_MAX));
#endif

    auto* ptr {reinterpret_cast<Object*>(static_cast<uintptr_t>(j_ptr))};

    int method_index {static_cast<int>(p_method_index)};
    MethodBind* methodBind {GDKotlin::get_instance().engine_type_method[method_index]};

#ifdef DEBUG_ENABLED
    JVM_CRASH_COND_MSG(!methodBind, vformat("Cannot find method with id %s", method_index));
#endif

    Callable::CallError r_error {Callable::CallError::CALL_OK};

    if (unlikely(stack_offset + args_size > MAX_STACK_SIZE)) {
        Variant args[VARIANT_ARG_MAX];
        read_args_to_array(buffer, args, args_size);

        const Variant* args_ptr[VARIANT_ARG_MAX];
        for (uint32_t i = 0; i < args_size; i++) {
            args_ptr[i] = &args[i];
        }

        const Variant& ret_value {methodBind->call(ptr, args_ptr, args_size, r_error)};
        write_return_value(buffer, ret_value);
    } else {
        Variant* args {variant_args + stack_offset};
        read_args_to_array(buffer, args, args_size);

        const Variant** args_ptr {variant_args_ptr + stack_offset};

        stack_offset += args_size;
        const Variant& ret_value {methodBind->call(ptr, args_ptr, args_size, r_error)};
        stack_offset -= args_size;

        write_return_value(buffer, ret_value);
    }

#ifdef DEBUG_ENABLED
    JVM_CRASH_COND_MSG(r_error.error != Callable::CallError::CALL_OK, vformat("Call to method with id %s failed.", method_index));
#endif
}

void TransferContext::create_native_object(JNIEnv* p_raw_env, jobject instance, jint p_class_index, jobject p_object, jobject p_class_loader, jint p_script_index) {
    const StringName& class_name {GDKotlin::get_instance().engine_type_names[static_cast<int>(p_class_index)]};
    Object* ptr = ClassDB::instantiate(class_name);

    auto raw_ptr = reinterpret_cast<uintptr_t>(ptr);
    uint64_t id;

#ifdef DEBUG_ENABLED
    JVM_ERR_FAIL_COND_MSG(!ptr, vformat("Failed to instantiate class %s", class_name));
#endif

    KtObject* kt_object {new KtObject(jni::JObject(p_object), jni::JObject(p_class_loader))};
    int script_index {static_cast<int>(p_script_index)};
    if (script_index == -1) {
        KotlinBindingManager::set_instance_binding(ptr, kt_object);
    } else {
        Ref<KotlinScript> kotlin_script {GDKotlin::get_instance().user_scripts[script_index]};
        ScriptInstance* script {new KotlinInstance(kt_object, ptr, kotlin_script->get_kotlin_class(), kotlin_script.ptr())};
        ptr->set_script_instance(script);
    }

    if (ptr->is_ref_counted()) { reinterpret_cast<RefCounted*>(ptr)->init_ref(); }

    id = ptr->get_instance_id();

    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    SharedBuffer* buffer {transfer_context->get_buffer(env)};

    buffer->increment_position(encode_uint64(raw_ptr, buffer->get_cursor()));
    buffer->increment_position(encode_uint64(id, buffer->get_cursor()));
    buffer->rewind();
}

jlong TransferContext::get_singleton(JNIEnv* p_raw_env, jobject p_instance, jint p_class_index) {
    return reinterpret_cast<uintptr_t>(Engine::get_singleton()->get_singleton_object(
      GDKotlin::get_instance().engine_singleton_names[static_cast<int>(p_class_index)]
    ));
}

void TransferContext::free_object(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    auto* owner = reinterpret_cast<Object*>(static_cast<uintptr_t>(p_raw_ptr));

#ifdef DEBUG_ENABLED
    JVM_CRASH_COND_MSG(Object::cast_to<RefCounted>(owner), "Can't 'free' a reference.");
#endif

    memdelete(owner);
}

void TransferContext::write_return_value(jni::Env& p_env, Variant& variant) {
    write_return_value(get_buffer(p_env), variant);
}
