#include <core/reference.h>
#include <modules/kotlin_jvm/src/gd_kotlin.h>
#include "variant_array_bridge.h"
#include "constants.h"
#include "bridges_utils.h"

using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(VariantArrayBridge)

VariantArrayBridge::VariantArrayBridge(jni::JObject p_wrapped, jni::JObject p_class_loader)
    : JavaInstanceWrapper(VARIANT_ARRAY_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader) {
    jni::JNativeMethod engine_call_constructor_method {
        "engine_call_constructor",
        "()J",
        (void*) VariantArrayBridge::engine_call_constructor
    };
    jni::JNativeMethod engine_call_get_size_method {
        "engine_call_get_size",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_get_size
    };
    jni::JNativeMethod engine_call_clear_method {
        "engine_call_clear",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_clear
    };
    jni::JNativeMethod engine_call_empty_method {
        "engine_call_empty",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_empty
    };
    jni::JNativeMethod engine_call_hash_method {
        "engine_call_hash",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_hash
    };
    jni::JNativeMethod engine_call_invert_method {
        "engine_call_invert",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_invert
    };
    jni::JNativeMethod engine_call_remove_method {
        "engine_call_remove",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_remove
    };
    jni::JNativeMethod engine_call_resize_method {
        "engine_call_resize",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_resize
    };
    jni::JNativeMethod engine_call_shuffle_method {
        "engine_call_shuffle",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_shuffle
    };
    jni::JNativeMethod engine_call_sort_method {
        "engine_call_sort",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_sort
    };
    jni::JNativeMethod engine_call_sortCustom_method {
        "engine_call_sortCustom",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_sortCustom
    };
    jni::JNativeMethod engine_call_append_method {
        "engine_call_append",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_append
    };
    jni::JNativeMethod engine_call_bsearch_method {
        "engine_call_bsearch",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_bsearch
    };
    jni::JNativeMethod engine_call_bsearchCustom_method {
        "engine_call_bsearchCustom",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_bsearchCustom
    };
    jni::JNativeMethod engine_call_count_method {
        "engine_call_count",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_count
    };
    jni::JNativeMethod engine_call_duplicate_method {
        "engine_call_duplicate",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_duplicate
    };
    jni::JNativeMethod engine_call_erase_method {
        "engine_call_erase",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_erase
    };
    jni::JNativeMethod engine_call_find_method {
        "engine_call_find",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_find
    };
    jni::JNativeMethod engine_call_findLast_method {
        "engine_call_findLast",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_findLast
    };
    jni::JNativeMethod engine_call_front_method {
        "engine_call_front",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_front
    };
    jni::JNativeMethod engine_call_has_method {
        "engine_call_has",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_has
    };
    jni::JNativeMethod engine_call_insert_method {
        "engine_call_insert",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_insert
    };
    jni::JNativeMethod engine_call_max_method {
        "engine_call_max",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_max
    };
    jni::JNativeMethod engine_call_min_method {
        "engine_call_min",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_min
    };
    jni::JNativeMethod engine_call_popBack_method {
        "engine_call_popBack",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_popBack
    };
    jni::JNativeMethod engine_call_popFront_method {
        "engine_call_popFront",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_popFront
    };
    jni::JNativeMethod engine_call_pushBack_method {
        "engine_call_pushBack",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_pushBack
    };
    jni::JNativeMethod engine_call_pushFront_method {
        "engine_call_pushFront",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_pushFront
    };
    jni::JNativeMethod engine_call_rfind_method {
        "engine_call_rfind",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_rfind
    };
    jni::JNativeMethod engine_call_slice_method {
        "engine_call_slice",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_slice
    };
    jni::JNativeMethod engine_call_operator_set_method {
        "engine_call_operator_set",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_operator_set
    };
    jni::JNativeMethod engine_call_operator_get_method {
        "engine_call_operator_get",
        "(J)V",
        (void*) VariantArrayBridge::engine_call_operator_get
    };

    Vector<jni::JNativeMethod> methods;
    methods.push_back(engine_call_constructor_method);

    methods.push_back(engine_call_get_size_method);
    methods.push_back(engine_call_clear_method);
    methods.push_back(engine_call_empty_method);
    methods.push_back(engine_call_hash_method);
    methods.push_back(engine_call_invert_method);
    methods.push_back(engine_call_remove_method);
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
    methods.push_back(engine_call_findLast_method);
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

    jni::Env env{jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}

uintptr_t VariantArrayBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(new Array());
}

void VariantArrayBridge::engine_call_get_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->size()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<Array>(p_raw_ptr)->clear();
}

void VariantArrayBridge::engine_call_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->empty()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_hash(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->hash()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_invert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    from_uint_to_ptr<Array>(p_raw_ptr)->invert();
}

void VariantArrayBridge::engine_call_remove(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->remove(args[0].operator int64_t());
}

void VariantArrayBridge::engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
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

void VariantArrayBridge::engine_call_sortCustom(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->sort_custom(args[0].operator Object *(), args[1].operator String());
}

void VariantArrayBridge::engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->append(args[0]);
}

void VariantArrayBridge::engine_call_bsearch(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->bsearch(args[0], args[1].operator bool())};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_bsearchCustom(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[4] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->bsearch_custom(
            args[0], args[1].operator Object *(), args[2].operator String(), args[3].operator bool()
    )};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->count(args[0].operator Object *())};
}

void VariantArrayBridge::engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context = GDKotlin::get_instance().transfer_context;
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->duplicate(args[0].operator bool())};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_erase(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->erase(args[0]);
}

void VariantArrayBridge::engine_call_find(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context = GDKotlin::get_instance().transfer_context;
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->find(args[0], args[1].operator int64_t())};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_findLast(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context = GDKotlin::get_instance().transfer_context;
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->find_last(args[0].operator Object *())};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_front(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->front()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context = GDKotlin::get_instance().transfer_context;
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->has(args[0])};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->insert(args[0].operator int64_t(), args[1].operator Object *());
}

void VariantArrayBridge::engine_call_max(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->max()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_min(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->min()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_popBack(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->pop_back()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_popFront(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->pop_front()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_pushBack(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->push_back(args[0]);
}

void VariantArrayBridge::engine_call_pushFront(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->push_front(args[0]);
}

void VariantArrayBridge::engine_call_rfind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[2] = {};
    TransferContext* transfer_context = GDKotlin::get_instance().transfer_context;
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->rfind(args[0], args[1].operator int64_t())};
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_slice(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[4] = {};
    TransferContext* transfer_context = GDKotlin::get_instance().transfer_context;
    transfer_context->read_args(env, args);
    Variant variant{
            from_uint_to_ptr<Array>(p_raw_ptr)->slice(
                args[0].operator int64_t(),
                args[1].operator int64_t(),
                args[2].operator int64_t(),
                args[3].operator bool()
        )
    };
    transfer_context->write_return_value(env, variant);
}

void VariantArrayBridge::engine_call_operator_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[2] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    from_uint_to_ptr<Array>(p_raw_ptr)->set(args[0].operator int64_t(), args[1].operator Object *());
}

void VariantArrayBridge::engine_call_operator_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context = GDKotlin::get_instance().transfer_context;
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<Array>(p_raw_ptr)->get(args[0])};
    transfer_context->write_return_value(env, variant);
}
