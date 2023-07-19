#include "variant_array_bridge.h"

#include "bridges_utils.h"
#include "constants.h"
#include "gd_kotlin.h"

using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(VariantArrayBridge)

// TODO/4.0: Implement all missing methods
VariantArrayBridge::VariantArrayBridge(jni::JObject p_wrapped, jni::JObject p_class_loader) :
  JavaInstanceWrapper(VARIANT_ARRAY_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader) {
    jni::JNativeMethod engine_call_constructor_method {
      const_cast<char*>("engine_call_constructor"),
      const_cast<char*>("()J"),
      (void*) VariantArrayBridge::engine_call_constructor};
    jni::JNativeMethod engine_call_constructor_typed_method {
      const_cast<char*>("engine_call_constructor_typed"),
      const_cast<char*>("()J"),
      (void*) VariantArrayBridge::engine_call_constructor_typed};
    jni::JNativeMethod engine_call_size_method {
      const_cast<char*>("engine_call_size"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_size};
    jni::JNativeMethod engine_call_clear_method {
      const_cast<char*>("engine_call_clear"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_clear};
    jni::JNativeMethod engine_call_is_empty_method {
      const_cast<char*>("engine_call_isEmpty"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_is_empty};
    jni::JNativeMethod engine_call_hash_method {
      const_cast<char*>("engine_call_hash"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_hash};
    jni::JNativeMethod engine_call_reverse_method {
      const_cast<char*>("engine_call_reverse"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_reverse};
    jni::JNativeMethod engine_call_remove_at_method {
      const_cast<char*>("engine_call_removeAt"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_remove_at};
    jni::JNativeMethod engine_call_resize_method {
      const_cast<char*>("engine_call_resize"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_resize};
    jni::JNativeMethod engine_call_shuffle_method {
      const_cast<char*>("engine_call_shuffle"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_shuffle};
    jni::JNativeMethod engine_call_sort_method {
      const_cast<char*>("engine_call_sort"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_sort};
    jni::JNativeMethod engine_call_sortCustom_method {
      const_cast<char*>("engine_call_sortCustom"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_sortCustom};
    jni::JNativeMethod engine_call_append_method {
      const_cast<char*>("engine_call_append"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_append};
    jni::JNativeMethod engine_call_bsearch_method {
      const_cast<char*>("engine_call_bsearch"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_bsearch};
    jni::JNativeMethod engine_call_bsearchCustom_method {
      const_cast<char*>("engine_call_bsearchCustom"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_bsearchCustom};
    jni::JNativeMethod engine_call_count_method {
      const_cast<char*>("engine_call_count"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_count};
    jni::JNativeMethod engine_call_duplicate_method {
      const_cast<char*>("engine_call_duplicate"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_duplicate};
    jni::JNativeMethod engine_call_erase_method {
      const_cast<char*>("engine_call_erase"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_erase};
    jni::JNativeMethod engine_call_find_method {
      const_cast<char*>("engine_call_find"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_find};
    jni::JNativeMethod engine_call_front_method {
      const_cast<char*>("engine_call_front"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_front};
    jni::JNativeMethod engine_call_has_method {const_cast<char*>("engine_call_has"), const_cast<char*>("(J)V"), (void*) VariantArrayBridge::engine_call_has};
    jni::JNativeMethod engine_call_insert_method {
      const_cast<char*>("engine_call_insert"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_insert};
    jni::JNativeMethod engine_call_max_method {const_cast<char*>("engine_call_max"), const_cast<char*>("(J)V"), (void*) VariantArrayBridge::engine_call_max};
    jni::JNativeMethod engine_call_min_method {const_cast<char*>("engine_call_min"), const_cast<char*>("(J)V"), (void*) VariantArrayBridge::engine_call_min};
    jni::JNativeMethod engine_call_popBack_method {
      const_cast<char*>("engine_call_popBack"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_popBack};
    jni::JNativeMethod engine_call_popFront_method {
      const_cast<char*>("engine_call_popFront"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_popFront};
    jni::JNativeMethod engine_call_pushBack_method {
      const_cast<char*>("engine_call_pushBack"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_pushBack};
    jni::JNativeMethod engine_call_pushFront_method {
      const_cast<char*>("engine_call_pushFront"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_pushFront};
    jni::JNativeMethod engine_call_rfind_method {
      const_cast<char*>("engine_call_rfind"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_rfind};
    jni::JNativeMethod engine_call_slice_method {
      const_cast<char*>("engine_call_slice"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_slice};
    jni::JNativeMethod engine_call_operator_set_method {
      const_cast<char*>("engine_call_operator_set"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_operator_set};
    jni::JNativeMethod engine_call_operator_get_method {
      const_cast<char*>("engine_call_operator_get"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_operator_get};
    jni::JNativeMethod engine_call_all {const_cast<char*>("engine_call_all"), const_cast<char*>("(J)V"), (void*) VariantArrayBridge::engine_call_all};
    jni::JNativeMethod engine_call_any {const_cast<char*>("engine_call_any"), const_cast<char*>("(J)V"), (void*) VariantArrayBridge::engine_call_any};
    jni::JNativeMethod engine_call_appendArray {
      const_cast<char*>("engine_call_appendArray"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_appendArray};
    jni::JNativeMethod engine_call_back {const_cast<char*>("engine_call_back"), const_cast<char*>("(J)V"), (void*) VariantArrayBridge::engine_call_back};
    jni::JNativeMethod engine_call_fill {const_cast<char*>("engine_call_fill"), const_cast<char*>("(J)V"), (void*) VariantArrayBridge::engine_call_fill};
    jni::JNativeMethod engine_call_filter {const_cast<char*>("engine_call_filter"), const_cast<char*>("(J)V"), (void*) VariantArrayBridge::engine_call_filter};
    jni::JNativeMethod engine_call_getTypedClassName {
      const_cast<char*>("engine_call_getTypedClassName"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_getTypedClassName};
    jni::JNativeMethod engine_call_getTypedScript {
      const_cast<char*>("engine_call_getTypedScript"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_getTypedScript};
    jni::JNativeMethod engine_call_isReadOnly {
      const_cast<char*>("engine_call_isReadOnly"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_isReadOnly};
    jni::JNativeMethod engine_call_isTyped {
      const_cast<char*>("engine_call_isTyped"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_isTyped};
    jni::JNativeMethod engine_call_map {const_cast<char*>("engine_call_map"), const_cast<char*>("(J)V"), (void*) VariantArrayBridge::engine_call_map};
    jni::JNativeMethod engine_call_pickRandom {
      const_cast<char*>("engine_call_pickRandom"),
      const_cast<char*>("(J)V"),
      (void*) VariantArrayBridge::engine_call_pickRandom};
    jni::JNativeMethod engine_call_reduce {const_cast<char*>("engine_call_reduce"), const_cast<char*>("(J)V"), (void*) VariantArrayBridge::engine_call_reduce};

    Vector<jni::JNativeMethod> methods;
    methods.push_back(engine_call_constructor_method);
    methods.push_back(engine_call_constructor_typed_method);

    methods.push_back(engine_call_size_method);
    methods.push_back(engine_call_clear_method);
    methods.push_back(engine_call_is_empty_method);
    methods.push_back(engine_call_hash_method);
    methods.push_back(engine_call_reverse_method);
    methods.push_back(engine_call_remove_at_method);
    methods.push_back(engine_call_resize_method);
    methods.push_back(engine_call_shuffle_method);
    methods.push_back(engine_call_sort_method);
    methods.push_back(engine_call_sortCustom_method);
    methods.push_back(engine_call_append_method);
    methods.push_back(engine_call_bsearch_method);
    methods.push_back(engine_call_bsearchCustom_method);
    methods.push_back(engine_call_count_method);
    methods.push_back(engine_call_duplicate_method);
    methods.push_back(engine_call_erase_method);
    methods.push_back(engine_call_find_method);
    methods.push_back(engine_call_front_method);
    methods.push_back(engine_call_has_method);
    methods.push_back(engine_call_insert_method);
    methods.push_back(engine_call_max_method);
    methods.push_back(engine_call_min_method);
    methods.push_back(engine_call_popBack_method);
    methods.push_back(engine_call_popFront_method);
    methods.push_back(engine_call_pushBack_method);
    methods.push_back(engine_call_pushFront_method);
    methods.push_back(engine_call_rfind_method);
    methods.push_back(engine_call_slice_method);
    methods.push_back(engine_call_operator_set_method);
    methods.push_back(engine_call_operator_get_method);
    methods.push_back(engine_call_all);
    methods.push_back(engine_call_any);
    methods.push_back(engine_call_appendArray);
    methods.push_back(engine_call_back);
    methods.push_back(engine_call_fill);
    methods.push_back(engine_call_filter);
    methods.push_back(engine_call_getTypedClassName);
    methods.push_back(engine_call_getTypedScript);
    methods.push_back(engine_call_isReadOnly);
    methods.push_back(engine_call_isTyped);
    methods.push_back(engine_call_map);
    methods.push_back(engine_call_pickRandom);
    methods.push_back(engine_call_reduce);

    jni::Env env {jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}

uintptr_t VariantArrayBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(Array));
}

uintptr_t VariantArrayBridge::engine_call_constructor_typed(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[3] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);

    auto ret {memnew(Array)};

    auto engineTypeIndex {args[1].operator int64_t()};
    auto userTypeIndex {args[2].operator int64_t()};

    StringName base_class_name;
    Variant script;
    if (userTypeIndex != -1) {
        const Ref<KotlinScript>& kotlin_script {TypeManager::get_instance().get_user_script_for_index(userTypeIndex)};
        base_class_name = kotlin_script->get_instance_base_type();
        script = kotlin_script;
    } else if (engineTypeIndex != -1) {
        base_class_name = TypeManager::get_instance().get_engine_type_for_index(engineTypeIndex);
    }
    ret->set_typed(static_cast<uint32_t>(args[0].operator int64_t()), base_class_name, script);
    return reinterpret_cast<uintptr_t>(ret);
}

void VariantArrayBridge::engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->size()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<Array>(p_raw_ptr)->clear();
}

// TODO/4.0: modify naming in jvm code
void VariantArrayBridge::engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->is_empty()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_hash(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->hash()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

// TODO/4.0: modify naming in jvm code
void VariantArrayBridge::engine_call_reverse(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<Array>(p_raw_ptr)->reverse();
}

// TODO/4.0: modify naming in jvm code
void VariantArrayBridge::engine_call_remove_at(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->remove_at(args[0].operator int64_t());
}

void VariantArrayBridge::engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->resize(args[0].operator int64_t());
}

void VariantArrayBridge::engine_call_shuffle(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<Array>(p_raw_ptr)->shuffle();
}

void VariantArrayBridge::engine_call_sort(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<Array>(p_raw_ptr)->sort();
}

// TODO/4.0: modify method signature in jvm code (from object + method name to callable)
void VariantArrayBridge::engine_call_sortCustom(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->sort_custom(args[0].operator Callable());
}

void VariantArrayBridge::engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->append(args[0]);
}

void VariantArrayBridge::engine_call_bsearch(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->bsearch(args[0], args[1].operator bool())};
    transfer_context->write_return_value(env, variant);
}

// TODO/4.0: modify method signature in jvm code (from object + method name to callable)
void VariantArrayBridge::engine_call_bsearchCustom(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[3] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant {
      from_uint_to_ptr<Array>(p_raw_ptr)->bsearch_custom(args[0], args[1].operator Callable(), args[2].operator bool())};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->count(args[0])};
}

void VariantArrayBridge::engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context = GDKotlin::get_instance().transfer_context;
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->duplicate(args[0].operator bool())};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_erase(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->erase(args[0]);
}

void VariantArrayBridge::engine_call_find(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context = GDKotlin::get_instance().transfer_context;
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->find(args[0], args[1].operator int64_t())};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_front(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->front()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context = GDKotlin::get_instance().transfer_context;
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->has(args[0])};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->insert(args[0].operator int64_t(), args[1]);
}

void VariantArrayBridge::engine_call_max(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->max()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_min(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->min()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_popBack(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->pop_back()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_popFront(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->pop_front()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_pushBack(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->push_back(args[0]);
}

void VariantArrayBridge::engine_call_pushFront(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->push_front(args[0]);
}

void VariantArrayBridge::engine_call_rfind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context = GDKotlin::get_instance().transfer_context;
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->rfind(args[0], args[1].operator int64_t())};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_slice(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[4] = {};
    TransferContext* transfer_context = GDKotlin::get_instance().transfer_context;
    transfer_context->read_args(env, args);
    Variant variant {
      from_uint_to_ptr<Array>(p_raw_ptr)
        ->slice(args[0].operator int64_t(), args[1].operator int64_t(), args[2].operator int64_t(), args[3].operator bool())};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_operator_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->operator[](args[0].operator int64_t()) = args[1];
}

void VariantArrayBridge::engine_call_operator_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context = GDKotlin::get_instance().transfer_context;
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->get(args[0])};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_all(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->all(args[0])};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_any(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->any(args[0])};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->append_array(args[0]);
}

void VariantArrayBridge::engine_call_back(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<Array>(p_raw_ptr)->back()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_fill(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->fill(args[0]);
}

void VariantArrayBridge::engine_call_filter(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    Variant args[1] = {};
    transfer_context->read_args(env, args);
    Variant result {from_uint_to_ptr<Array>(p_raw_ptr)->filter(args[0])};
    transfer_context->write_return_value(env, result);
}

void VariantArrayBridge::engine_call_getTypedClassName(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant result {from_uint_to_ptr<Array>(p_raw_ptr)->get_typed_class_name()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void VariantArrayBridge::engine_call_getTypedScript(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant result {from_uint_to_ptr<Array>(p_raw_ptr)->get_typed_script()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void VariantArrayBridge::engine_call_isReadOnly(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant result {from_uint_to_ptr<Array>(p_raw_ptr)->is_read_only()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void VariantArrayBridge::engine_call_isTyped(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant result {from_uint_to_ptr<Array>(p_raw_ptr)->is_typed()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void VariantArrayBridge::engine_call_map(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    Variant args[1] = {};
    transfer_context->read_args(env, args);
    Variant result {from_uint_to_ptr<Array>(p_raw_ptr)->map(args[0])};
    transfer_context->write_return_value(env, result);
}

void VariantArrayBridge::engine_call_pickRandom(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant result {from_uint_to_ptr<Array>(p_raw_ptr)->pick_random()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}

void VariantArrayBridge::engine_call_reduce(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    Variant args[2] = {};
    transfer_context->read_args(env, args);
    Variant result {from_uint_to_ptr<Array>(p_raw_ptr)->reduce(args[0], args[1])};
    transfer_context->write_return_value(env, result);
}
