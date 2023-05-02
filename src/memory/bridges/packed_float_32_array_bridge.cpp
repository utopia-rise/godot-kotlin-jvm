#include "packed_float_32_array_bridge.h"

#include "bridges_utils.h"
#include "constants.h"
#include "gd_kotlin.h"

using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(PackedFloat32ArrayBridge)

PackedFloat32ArrayBridge::PackedFloat32ArrayBridge(jni::JObject p_wrapped, jni::JObject p_class_loader) :
  JavaInstanceWrapper(PACKED_FLOAT_32_ARRAY_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader) {
    jni::JNativeMethod engine_call_constructor_method {
      const_cast<char*>("engine_call_constructor"),
      const_cast<char*>("()J"),
      (void*) PackedFloat32ArrayBridge::engine_call_constructor};
    jni::JNativeMethod engine_call_constructor_packed_float_32_array_method {
      const_cast<char*>("engine_call_constructor_packed_array"),
      const_cast<char*>("()J"),
      (void*) PackedFloat32ArrayBridge::engine_call_constructor_packed_array};
    jni::JNativeMethod engine_call_constructor_array_method {
      const_cast<char*>("engine_call_constructor_array"),
      const_cast<char*>("()J"),
      (void*) PackedFloat32ArrayBridge::engine_call_constructor_array};

    jni::JNativeMethod engine_call_append_method {
      const_cast<char*>("engine_call_append"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_append};
    jni::JNativeMethod engine_call_appendArray_method {
      const_cast<char*>("engine_call_appendArray"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_appendArray};
    jni::JNativeMethod engine_call_bsearch_method {
      const_cast<char*>("engine_call_bsearch"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_bsearch};
    jni::JNativeMethod engine_call_clear_method {
      const_cast<char*>("engine_call_clear"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_clear};
    jni::JNativeMethod engine_call_count_method {
      const_cast<char*>("engine_call_count"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_count};
    jni::JNativeMethod engine_call_duplicate_method {
      const_cast<char*>("engine_call_duplicate"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_duplicate};
    jni::JNativeMethod engine_call_fill_method {
      const_cast<char*>("engine_call_fill"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_fill
    };
    jni::JNativeMethod engine_call_find_method {
      const_cast<char*>("engine_call_find"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_find
    };
    jni::JNativeMethod engine_call_is_empty_method {
      const_cast<char*>("engine_call_is_empty"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_is_empty};
    jni::JNativeMethod engine_call_get_method {
      const_cast<char*>("engine_call_get"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_get};
    jni::JNativeMethod engine_call_has_method {
      const_cast<char*>("engine_call_has"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_has};
    jni::JNativeMethod engine_call_insert_method {
      const_cast<char*>("engine_call_insert"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_insert};
    jni::JNativeMethod engine_call_reverse_method {
      const_cast<char*>("engine_call_reverse"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_reverse};
    jni::JNativeMethod engine_call_rfind_method {
      const_cast<char*>("engine_call_rfind"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_rfind};
    jni::JNativeMethod engine_call_pushback_method {
      const_cast<char*>("engine_call_pushback"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_pushback};
    jni::JNativeMethod engine_call_remove_at_method {
      const_cast<char*>("engine_call_remove_at"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_remove_at};
    jni::JNativeMethod engine_call_resize_method {
      const_cast<char*>("engine_call_resize"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_resize};
    jni::JNativeMethod engine_call_set_method {
      const_cast<char*>("engine_call_set"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_set};
    jni::JNativeMethod engine_call_size_method {
      const_cast<char*>("engine_call_size"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_size};
    jni::JNativeMethod engine_call_slice_method {
      const_cast<char*>("engine_call_slice"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_slice};
    jni::JNativeMethod engine_call_sort_method {
      const_cast<char*>("engine_call_sort"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_sort};
    jni::JNativeMethod engine_call_to_byte_array_method {
      const_cast<char*>("engine_call_to_byte_array"),
      const_cast<char*>("(J)V"),
      (void*) PackedFloat32ArrayBridge::engine_call_to_byte_array};

    Vector<jni::JNativeMethod> methods;
    methods.push_back(engine_call_constructor_method);
    methods.push_back(engine_call_constructor_packed_float_32_array_method);
    methods.push_back(engine_call_constructor_array_method);
    methods.push_back(engine_call_append_method);
    methods.push_back(engine_call_appendArray_method);
    methods.push_back(engine_call_bsearch_method);
    methods.push_back(engine_call_clear_method);
    methods.push_back(engine_call_count_method);
    methods.push_back(engine_call_duplicate_method);
    methods.push_back(engine_call_fill_method);
    methods.push_back(engine_call_find_method);
    methods.push_back(engine_call_get_method);
    methods.push_back(engine_call_has_method);
    methods.push_back(engine_call_insert_method);
    methods.push_back(engine_call_is_empty_method);
    methods.push_back(engine_call_reverse_method);
    methods.push_back(engine_call_pushback_method);
    methods.push_back(engine_call_remove_at_method);
    methods.push_back(engine_call_resize_method);
    methods.push_back(engine_call_rfind_method);
    methods.push_back(engine_call_set_method);
    methods.push_back(engine_call_size_method);
    methods.push_back(engine_call_slice_method);
    methods.push_back(engine_call_sort_method);
    methods.push_back(engine_call_to_byte_array_method);

    jni::Env env {jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}

uintptr_t PackedFloat32ArrayBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(PackedFloat32Array));
}

uintptr_t PackedFloat32ArrayBridge::engine_call_constructor_packed_array(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(PackedFloat32Array(args[0].operator PackedFloat32Array())));
}

uintptr_t PackedFloat32ArrayBridge::engine_call_constructor_array(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(PackedFloat32Array(args[0].operator Vector<float>())));
}

void PackedFloat32ArrayBridge::engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->append(args[0].operator real_t());
}

void PackedFloat32ArrayBridge::engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->append_array(args[0].operator PackedFloat32Array());
}

void PackedFloat32ArrayBridge::engine_call_bsearch(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant ret {
      from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->bsearch(
        args[0].operator float(),
        args[1].operator bool()
      )
    };
    transfer_context->write_return_value(env, ret);
}

void PackedFloat32ArrayBridge::engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->clear();
}

void PackedFloat32ArrayBridge::engine_call_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant ret {
      from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->count(args[0].operator float())
    };
    transfer_context->write_return_value(env, ret);
}

void PackedFloat32ArrayBridge::engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant ret {from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->duplicate()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, ret);
}

void PackedFloat32ArrayBridge::engine_call_fill(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->fill(args[0].operator float());
}

void PackedFloat32ArrayBridge::engine_call_find(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant ret {
      from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->find(args[0].operator float())
    };
    transfer_context->write_return_value(env, ret);
}

void PackedFloat32ArrayBridge::engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    Variant variant {from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->is_empty()};
    transfer_context->write_return_value(env, variant);
}

void PackedFloat32ArrayBridge::engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->operator[](args[0].operator unsigned int())};
    transfer_context->write_return_value(env, variant);
}

void PackedFloat32ArrayBridge::engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant ret {from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->has(args[0].operator float())};
    transfer_context->read_return_value(env, ret);
}

void PackedFloat32ArrayBridge::engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->insert(args[0].operator unsigned int(), args[1].operator real_t());
}

void PackedFloat32ArrayBridge::engine_call_reverse(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->reverse();
}

void PackedFloat32ArrayBridge::engine_call_rfind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant ret {
      from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->rfind(args[0].operator float(), args->operator int())
    };
}

void PackedFloat32ArrayBridge::engine_call_pushback(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->push_back(args[0].operator real_t());
}

void PackedFloat32ArrayBridge::engine_call_remove_at(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->remove_at(args[0].operator unsigned int());
}

void PackedFloat32ArrayBridge::engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->resize(args[0].operator unsigned int());
}

void PackedFloat32ArrayBridge::engine_call_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->set(args[0].operator unsigned int(), args[1].operator real_t());
}

void PackedFloat32ArrayBridge::engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->size()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void PackedFloat32ArrayBridge::engine_call_slice(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);

    Variant ret {
      from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->slice(args[0].operator int(), args[1].operator int())
    };
    transfer_context->write_return_value(env, ret);
}

void PackedFloat32ArrayBridge::engine_call_sort(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->sort();
}

void PackedFloat32ArrayBridge::engine_call_to_byte_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant ret {
        from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)->to_byte_array()
    };
    GDKotlin::get_instance().transfer_context->write_return_value(env, ret);
}
