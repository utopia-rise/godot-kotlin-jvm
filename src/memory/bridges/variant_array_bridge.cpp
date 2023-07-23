#include "variant_array_bridge.h"

#include "bridges_utils.h"
#include "constants.h"
#include "gd_kotlin.h"

using namespace bridges;

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    VariantArrayBridge,
    INIT_NATIVE_METHOD(engine_call_constructor_method, "engine_call_constructor", "()J", VariantArrayBridge::engine_call_constructor)
    INIT_NATIVE_METHOD(engine_call_constructor_typed_method, "engine_call_constructor_typed","()J", VariantArrayBridge::engine_call_constructor_typed)
    INIT_NATIVE_METHOD(engine_call_size_method, "engine_call_size","(J)V", VariantArrayBridge::engine_call_size)
    INIT_NATIVE_METHOD(engine_call_clear_method, "engine_call_clear","(J)V", VariantArrayBridge::engine_call_clear)
    INIT_NATIVE_METHOD(engine_call_is_empty_method, "engine_call_isEmpty","(J)V", VariantArrayBridge::engine_call_is_empty)
    INIT_NATIVE_METHOD(engine_call_hash_method, "engine_call_hash","(J)V", VariantArrayBridge::engine_call_hash)
    INIT_NATIVE_METHOD(engine_call_reverse_method, "engine_call_reverse","(J)V", VariantArrayBridge::engine_call_reverse)
    INIT_NATIVE_METHOD(engine_call_remove_at_method, "engine_call_removeAt","(J)V", VariantArrayBridge::engine_call_remove_at)
    INIT_NATIVE_METHOD(engine_call_resize_method, "engine_call_resize","(J)V", VariantArrayBridge::engine_call_resize)
    INIT_NATIVE_METHOD(engine_call_shuffle_method, "engine_call_shuffle","(J)V", VariantArrayBridge::engine_call_shuffle)
    INIT_NATIVE_METHOD(engine_call_sort_method, "engine_call_sort","(J)V", VariantArrayBridge::engine_call_sort)
    INIT_NATIVE_METHOD(engine_call_sortCustom_method, "engine_call_sortCustom","(J)V", VariantArrayBridge::engine_call_sortCustom)
    INIT_NATIVE_METHOD(engine_call_append_method, "engine_call_append","(J)V", VariantArrayBridge::engine_call_append)
    INIT_NATIVE_METHOD(engine_call_bsearch_method, "engine_call_bsearch","(J)V", VariantArrayBridge::engine_call_bsearch)
    INIT_NATIVE_METHOD(engine_call_bsearchCustom_method, "engine_call_bsearchCustom","(J)V", VariantArrayBridge::engine_call_bsearchCustom)
    INIT_NATIVE_METHOD(engine_call_count_method, "engine_call_count","(J)V", VariantArrayBridge::engine_call_count)
    INIT_NATIVE_METHOD(engine_call_duplicate_method, "engine_call_duplicate","(J)V", VariantArrayBridge::engine_call_duplicate)
    INIT_NATIVE_METHOD(engine_call_erase_method, "engine_call_erase","(J)V", VariantArrayBridge::engine_call_erase)
    INIT_NATIVE_METHOD(engine_call_find_method, "engine_call_find","(J)V", VariantArrayBridge::engine_call_find)
    INIT_NATIVE_METHOD(engine_call_front_method, "engine_call_front","(J)V", VariantArrayBridge::engine_call_front)
    INIT_NATIVE_METHOD(engine_call_has_method, "engine_call_has","(J)V", VariantArrayBridge::engine_call_has)
    INIT_NATIVE_METHOD(engine_call_insert_method, "engine_call_insert","(J)V", VariantArrayBridge::engine_call_insert)
    INIT_NATIVE_METHOD(engine_call_max_method, "engine_call_max","(J)V", VariantArrayBridge::engine_call_max)
    INIT_NATIVE_METHOD(engine_call_min_method, "engine_call_min","(J)V", VariantArrayBridge::engine_call_min)
    INIT_NATIVE_METHOD(engine_call_popBack_method, "engine_call_popBack","(J)V", VariantArrayBridge::engine_call_popBack)
    INIT_NATIVE_METHOD(engine_call_popFront_method, "engine_call_popFront","(J)V", VariantArrayBridge::engine_call_popFront)
    INIT_NATIVE_METHOD(engine_call_pushBack_method, "engine_call_pushBack","(J)V", VariantArrayBridge::engine_call_pushBack)
    INIT_NATIVE_METHOD(engine_call_pushFront_method, "engine_call_pushFront","(J)V", VariantArrayBridge::engine_call_pushFront)
    INIT_NATIVE_METHOD(engine_call_rfind_method, "engine_call_rfind","(J)V", VariantArrayBridge::engine_call_rfind)
    INIT_NATIVE_METHOD(engine_call_slice_method, "engine_call_slice","(J)V", VariantArrayBridge::engine_call_slice)
    INIT_NATIVE_METHOD(engine_call_operator_set_method, "engine_call_operator_set","(J)V", VariantArrayBridge::engine_call_operator_set)
    INIT_NATIVE_METHOD(engine_call_operator_get_method, "engine_call_operator_get","(J)V", VariantArrayBridge::engine_call_operator_get)
    INIT_NATIVE_METHOD(engine_call_all, "engine_call_all","(J)V", VariantArrayBridge::engine_call_all)
    INIT_NATIVE_METHOD(engine_call_any, "engine_call_any","(J)V", VariantArrayBridge::engine_call_any)
    INIT_NATIVE_METHOD(engine_call_appendArray, "engine_call_appendArray","(J)V", VariantArrayBridge::engine_call_appendArray)
    INIT_NATIVE_METHOD(engine_call_back, "engine_call_back","(J)V", VariantArrayBridge::engine_call_back)
    INIT_NATIVE_METHOD(engine_call_fill, "engine_call_fill","(J)V", VariantArrayBridge::engine_call_fill)
    INIT_NATIVE_METHOD(engine_call_filter, "engine_call_filter","(J)V", VariantArrayBridge::engine_call_filter)
    INIT_NATIVE_METHOD(engine_call_getTypedClassName, "engine_call_getTypedClassName","(J)V", VariantArrayBridge::engine_call_getTypedClassName)
    INIT_NATIVE_METHOD(engine_call_getTypedScript, "engine_call_getTypedScript","(J)V", VariantArrayBridge::engine_call_getTypedScript)
    INIT_NATIVE_METHOD(engine_call_isReadOnly, "engine_call_isReadOnly","(J)V", VariantArrayBridge::engine_call_isReadOnly)
    INIT_NATIVE_METHOD(engine_call_isTyped, "engine_call_isTyped","(J)V", VariantArrayBridge::engine_call_isTyped)
    INIT_NATIVE_METHOD(engine_call_map, "engine_call_map","(J)V", VariantArrayBridge::engine_call_map)
    INIT_NATIVE_METHOD(engine_call_pickRandom, "engine_call_pickRandom","(J)V", VariantArrayBridge::engine_call_pickRandom)
    INIT_NATIVE_METHOD(engine_call_reduce, "engine_call_reduce","(J)V", VariantArrayBridge::engine_call_reduce)
  )

// clang-format on

VariantArrayBridge::VariantArrayBridge(jni::JObject p_wrapped) : JavaInstanceWrapper(p_wrapped) {}

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
