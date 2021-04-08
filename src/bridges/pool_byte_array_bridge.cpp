#include <modules/kotlin_jvm/src/gd_kotlin.h>
#include <modules/kotlin_jvm/src/bridges/bridges_utils.h>
#include <modules/kotlin_jvm/src/bridges/constants.h>
#include "pool_byte_array_bridge.h"


using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(PoolByteArrayBridge)

PoolByteArrayBridge::PoolByteArrayBridge(jni::JObject p_wrapped, jni::JObject p_class_loader)
        : JavaInstanceWrapper(POOL_BYTE_ARRAY_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader) {
    jni::JNativeMethod engine_call_constructor_method{
            "engine_call_constructor",
            "()J",
            (void*) PoolByteArrayBridge::engine_call_constructor
    };
    jni::JNativeMethod engine_call_append_method{
            "engine_call_append",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_append
    };
    jni::JNativeMethod engine_call_appendArray_method{
            "engine_call_appendArray",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_appendArray
    };
    jni::JNativeMethod engine_call_compress_method{
            "engine_call_compress",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_compress
    };
    jni::JNativeMethod engine_call_decompress_method{
            "engine_call_decompress",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_decompress
    };
    jni::JNativeMethod engine_call_empty_method{
            "engine_call_empty",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_empty
    };
    jni::JNativeMethod engine_call_get_string_from_ascii_method{
            "engine_call_get_string_from_ascii",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_get_string_from_ascii
    };
    jni::JNativeMethod engine_call_get_string_from_utf8_method{
            "engine_call_get_string_from_utf8",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_get_string_from_utf8
    };
    jni::JNativeMethod engine_call_hex_encode_method{
            "engine_call_hex_encode",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_hex_encode
    };
    jni::JNativeMethod engine_call_get_method{
            "engine_call_get",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_get
    };
    jni::JNativeMethod engine_call_insert_method{
            "engine_call_insert",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_insert
    };
    jni::JNativeMethod engine_call_invert_method{
            "engine_call_invert",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_invert
    };
    jni::JNativeMethod engine_call_pushback_method{
            "engine_call_pushback",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_pushback
    };
    jni::JNativeMethod engine_call_remove_method{
            "engine_call_remove",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_remove
    };
    jni::JNativeMethod engine_call_resize_method{
            "engine_call_resize",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_resize
    };
    jni::JNativeMethod engine_call_set_method{
            "engine_call_set",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_set
    };
    jni::JNativeMethod engine_call_size_method{
            "engine_call_size",
            "(J)V",
            (void*) PoolByteArrayBridge::engine_call_size
    };

    Vector<jni::JNativeMethod> methods;
    methods.push_back(engine_call_constructor_method);
    methods.push_back(engine_call_append_method);
    methods.push_back(engine_call_appendArray_method);
    methods.push_back(engine_call_compress_method);
    methods.push_back(engine_call_decompress_method);
    methods.push_back(engine_call_empty_method);
    methods.push_back(engine_call_get_string_from_ascii_method);
    methods.push_back(engine_call_get_string_from_utf8_method);
    methods.push_back(engine_call_hex_encode_method);
    methods.push_back(engine_call_get_method);
    methods.push_back(engine_call_insert_method);
    methods.push_back(engine_call_invert_method);
    methods.push_back(engine_call_pushback_method);
    methods.push_back(engine_call_remove_method);
    methods.push_back(engine_call_resize_method);
    methods.push_back(engine_call_set_method);
    methods.push_back(engine_call_size_method);

    string_names.func_compress_name = _scs_create("compress");
    string_names.func_decompress_name = _scs_create("decompress");
    string_names.func_get_string_from_ascii_name = _scs_create("get_string_from_ascii");
    string_names.func_get_string_from_utf8_name = _scs_create("get_string_from_utf8");
    string_names.func_hex_encode_name = _scs_create("hex_encode");

    jni::Env env{jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}

uintptr_t PoolByteArrayBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(PoolByteArray));
}

void PoolByteArrayBridge::engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PoolByteArray>(p_raw_ptr)->append(args[0].operator uint8_t());
}

void PoolByteArrayBridge::engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PoolByteArray>(p_raw_ptr)->append_array(args[0].operator PoolByteArray());
}

void PoolByteArrayBridge::engine_call_compress(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant pool{*from_uint_to_ptr<PoolByteArray>(p_raw_ptr)};

    Variant ret = pool.call(
            string_names.func_compress_name,
            &args[0]);

    transfer_context->write_return_value(env, ret);
}

void PoolByteArrayBridge::engine_call_decompress(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant pool{*from_uint_to_ptr<PoolByteArray>(p_raw_ptr)};
    static StringName func_name{_scs_create("decompress")};

    Variant ret = pool.call(
            string_names.func_decompress_name,
            &args[0],
            &args[1]);

    transfer_context->write_return_value(env, ret);
}

void PoolByteArrayBridge::engine_call_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    Variant variant{from_uint_to_ptr<PoolByteArray>(p_raw_ptr)->empty()};
    transfer_context->write_return_value(env, variant);
}

void PoolByteArrayBridge::engine_call_get_string_from_ascii(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};

    Variant pool{*from_uint_to_ptr<PoolByteArray>(p_raw_ptr)};

    Variant ret = pool.call(string_names.func_get_string_from_ascii_name);

    transfer_context->write_return_value(env, ret);
}

void PoolByteArrayBridge::engine_call_get_string_from_utf8(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};

    Variant pool{*from_uint_to_ptr<PoolByteArray>(p_raw_ptr)};

    Variant ret = pool.call(string_names.func_get_string_from_utf8_name);

    transfer_context->write_return_value(env, ret);
}

void PoolByteArrayBridge::engine_call_hex_encode(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};

    Variant pool{*from_uint_to_ptr<PoolByteArray>(p_raw_ptr)};

    Variant ret = pool.call(string_names.func_hex_encode_name);

    transfer_context->write_return_value(env, ret);
}

void PoolByteArrayBridge::engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<PoolByteArray>(p_raw_ptr)->operator[](args[0].operator unsigned int())};
    transfer_context->write_return_value(env, variant);
}

void PoolByteArrayBridge::engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PoolByteArray>(p_raw_ptr)->insert(args[0].operator unsigned int(), args[1].operator uint8_t());
}

void PoolByteArrayBridge::engine_call_invert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    from_uint_to_ptr<PoolByteArray>(p_raw_ptr)->invert();
}

void PoolByteArrayBridge::engine_call_pushback(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PoolByteArray>(p_raw_ptr)->push_back(args[0].operator uint8_t());
}

void PoolByteArrayBridge::engine_call_remove(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PoolByteArray>(p_raw_ptr)->remove(args[0].operator unsigned int());
}

void PoolByteArrayBridge::engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PoolByteArray>(p_raw_ptr)->remove(args[0].operator unsigned int());
}

void PoolByteArrayBridge::engine_call_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PoolByteArray>(p_raw_ptr)->set(args[0].operator unsigned int(), args[1].operator uint8_t());
}

void PoolByteArrayBridge::engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<PoolByteArray>(p_raw_ptr)->size()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

PoolByteArrayBridge::~PoolByteArrayBridge() {
    string_names.func_compress_name = StringName();
    string_names.func_decompress_name = StringName();
    string_names.func_get_string_from_ascii_name = StringName();
    string_names.func_get_string_from_utf8_name = StringName();
    string_names.func_hex_encode_name = StringName();
}
