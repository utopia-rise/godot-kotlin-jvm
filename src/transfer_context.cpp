#include <core/io/marshalls.h>
#include "transfer_context.h"
#include "gd_kotlin.h"
#include "kotlin_instance.h"

JNI_INIT_STATICS_FOR_CLASS(TransferContext)

thread_local static Variant variant_args[MAX_ARGS_SIZE]; // NOLINT(cert-err58-cpp)
thread_local static const Variant* variant_args_ptr[MAX_ARGS_SIZE];
thread_local static bool icall_args_init = false;

TransferContext::TransferContext(jni::JObject p_wrapped, jni::JObject p_class_loader)
        : JavaInstanceWrapper("godot.core.TransferContext", p_wrapped, p_class_loader) {
    jni::JNativeMethod icall_method{
            "icall",
            "(JII)V",
            (void*) TransferContext::icall
    };

    jni::JNativeMethod invoke_ctor_method{
            "invokeConstructor",
            "(I)V",
            (void*) TransferContext::invoke_constructor
    };

    jni::JNativeMethod get_singleton_method{
            "getSingleton",
            "(I)J",
            (void*) TransferContext::get_singleton
    };

    jni::JNativeMethod set_script_method{
            "setScript",
            "(JILgodot/core/KtObject;Ljava/lang/ClassLoader;)V",
            (void*) TransferContext::set_script
    };

    jni::JNativeMethod free_object_method{
            "freeObject",
            "(J)V",
            (void*) TransferContext::free_object
    };


    Vector<jni::JNativeMethod> methods;
    methods.push_back(icall_method);
    methods.push_back(invoke_ctor_method);
    methods.push_back(get_singleton_method);
    methods.push_back(set_script_method);
    methods.push_back(free_object_method);
    jni::Env env{jni::Jvm::current_env()};
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
        assert(!buffer.is_null());
        auto* address{static_cast<uint8_t*>(p_env.get_direct_buffer_address(buffer))};
        shared_buffer = SharedBuffer{
                address,
                0,
                p_env.get_direct_buffer_capacity(buffer)
        };
    }

    return &shared_buffer;
}

void TransferContext::read_return_value(jni::Env& p_env, Variant& r_ret) {
    SharedBuffer* buffer{get_buffer(p_env)};
    ktvariant::get_variant_from_buffer(buffer, r_ret);
    buffer->rewind();
}

void TransferContext::write_args(jni::Env& p_env, const Variant** p_args, int args_size) {
    SharedBuffer* buffer{get_buffer(p_env)};
    buffer->increment_position(encode_uint32(args_size, buffer->get_cursor()));
    for (auto i = 0; i < args_size; ++i) {
        ktvariant::send_variant_to_buffer(*p_args[i], buffer);
    }
    buffer->rewind();
}

void TransferContext::read_args(jni::Env& p_env, Variant* args) {
    SharedBuffer* buffer{get_buffer(p_env)};
    uint32_t size{decode_uint32(buffer->get_cursor())};
    buffer->increment_position(4);
    for (int i = 0; i < size; ++i) {
        ktvariant::get_variant_from_buffer(buffer, args[i]);
    }
    buffer->rewind();
}


void TransferContext::icall(
        JNIEnv* rawEnv,
        jobject instance,
        jlong jPtr,
        jint p_method_index,
        jint expectedReturnType) {
    if (unlikely(!icall_args_init)) {
        for (int i = 0; i < MAX_ARGS_SIZE; i++) {
            variant_args_ptr[i] = &variant_args[i];
        }
        icall_args_init = true;
    }

    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    jni::Env env{rawEnv};

    SharedBuffer* buffer{transfer_context->get_buffer(env)};
    uint32_t args_size{read_args_size(env, buffer)};

#ifdef DEBUG_ENABLED
    JVM_CRASH_COND_MSG(args_size > MAX_ARGS_SIZE,
                       vformat("Cannot have more than %s arguments for method call.", MAX_ARGS_SIZE))
#endif

    read_args_to_array(buffer, variant_args, args_size);

    auto* ptr = reinterpret_cast<Object*>(jPtr);

    int method_index{static_cast<int>(p_method_index)};
    MethodBind* methodBind{GDKotlin::get_instance().engine_type_method[method_index]};

#ifdef DEBUG_ENABLED
    JVM_CRASH_COND_MSG(!methodBind, vformat("Cannot find method with id %s", method_index))
#endif

    Variant::CallError r_error{Variant::CallError::CALL_OK};
    const Variant& ret_value{methodBind->call(ptr, variant_args_ptr, args_size, r_error)};

#ifdef DEBUG_ENABLED
    JVM_CRASH_COND_MSG(r_error.error != Variant::CallError::CALL_OK,
                       vformat("Call to method with id %s failed.", method_index))
#endif

    write_return_value(buffer, ret_value);
}

void TransferContext::invoke_constructor(JNIEnv* p_raw_env, jobject p_instance, jint p_class_index) {
    const StringName& class_name{GDKotlin::get_instance().engine_type_names[static_cast<int>(p_class_index)]};
    Object* ptr = ClassDB::instance(class_name);

    auto raw_ptr = reinterpret_cast<uintptr_t>(ptr);
    int id;

#ifdef DEBUG_ENABLED
    JVM_ERR_FAIL_COND_MSG(!ptr, vformat("Failed to instantiate class %s", class_name))
#endif

    if (auto* ref = Object::cast_to<Reference>(ptr)) {
        id = RefDB::get_instance().get_ref_id(ref);
    } else {
        id = ptr->get_instance_id();
    }

    jni::Env env{p_raw_env};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    SharedBuffer* buffer{transfer_context->get_buffer(env)};

    buffer->increment_position(encode_uint64(raw_ptr, buffer->get_cursor()));
    buffer->increment_position(encode_uint64(id, buffer->get_cursor()));
    buffer->rewind();
}

jlong TransferContext::get_singleton(JNIEnv* p_raw_env, jobject p_instance, jint p_class_index) {
    return reinterpret_cast<uintptr_t>(
            Engine::get_singleton()->get_singleton_object(
                    GDKotlin::get_instance().engine_singleton_names[static_cast<int>(p_class_index)]
            )
    );
}

void TransferContext::set_script(
        JNIEnv* p_raw_env,
        jobject p_instance,
        jlong p_raw_ptr,
        jint p_class_index,
        jobject p_object,
        jobject p_class_loader) {
    Ref<KotlinScript> kotlin_script{GDKotlin::get_instance().user_scripts[static_cast<int>(p_class_index)]};
    auto* owner{reinterpret_cast<Object*>(p_raw_ptr)};
    auto* kt_object{new KtObject(jni::JObject(p_object), jni::JObject(p_class_loader))};
    auto* script{memnew(KotlinInstance(kt_object, owner, kotlin_script->get_kotlin_class(), kotlin_script.ptr()))};
    owner->set_script_instance(script);
}

void TransferContext::free_object(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    auto* owner = reinterpret_cast<Object*>(static_cast<uintptr_t>(p_raw_ptr));

#ifdef DEBUG_ENABLED
    JVM_CRASH_COND_MSG(Object::cast_to<Reference>(owner), "Can't 'free' a reference.")
#endif

    memdelete(owner);
}

void TransferContext::write_return_value(jni::Env& p_env, Variant& variant) {
    write_return_value(get_buffer(p_env), variant);
}
