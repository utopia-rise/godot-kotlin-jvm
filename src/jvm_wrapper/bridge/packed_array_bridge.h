#ifndef GODOT_JVM_PACKED_ARRAY_BRIDGE_H
#define GODOT_JVM_PACKED_ARRAY_BRIDGE_H

#include "jvm_wrapper/jvm_singleton_wrapper.h"
#include "jvm_wrapper/memory/transfer_context.h"
#include "bridges_utils.h"

#define PACKED_ARRAY_BRIDGE(NAME, ELEMENT_TYPE, FQNAME)                \
    inline static constexpr const char NAME##QualifiedName[] = FQNAME; \
    class NAME : public PackedArrayBridge<NAME, ELEMENT_TYPE, NAME##QualifiedName>

#define PACKED_ARRAY_BRIDGE_CLASS(NAME, ELEMENT_TYPE) \
    friend class PackedArrayBridge<NAME, ELEMENT_TYPE, NAME##QualifiedName>;            \
    friend class JvmSingletonWrapper<NAME, NAME##QualifiedName>;                        \
    static inline constexpr const char* fq_name = NAME##QualifiedName;                  \
                                                                                        \
public:                                                                                 \
    NAME(const NAME&) = delete;                                                         \
    void operator=(const NAME&) = delete;                                               \
    NAME& operator=(NAME&&) noexcept = delete;                                          \
    NAME(NAME&&) noexcept = delete;                                                     \
                                                                                        \
protected:                                                                              \
    explicit NAME(jni::Env& p_env, jni::JObject p_wrapped) :                            \
      PackedArrayBridge<NAME, ELEMENT_TYPE, NAME##QualifiedName>(p_env, p_wrapped) {}   \
    ~NAME();


namespace bridges {
    
    template<class Derived, class T, const char* fq_name>
    class PackedArrayBridge : public JvmSingletonWrapper<Derived, fq_name> {
        friend class JvmSingletonWrapper<Derived, fq_name>;

    public:
        PackedArrayBridge(const PackedArrayBridge<Derived, T, fq_name>&) = delete;
        void operator=(const PackedArrayBridge<Derived, T, fq_name>&) = delete;
        PackedArrayBridge<Derived, T, fq_name>& operator=(PackedArrayBridge<Derived, T, fq_name>&&) noexcept = delete;
        PackedArrayBridge(PackedArrayBridge<Derived, T, fq_name>&&) noexcept = delete;

    protected:
        explicit PackedArrayBridge(jni::Env& p_env, jni::JObject p_wrapped);
        ~PackedArrayBridge() = default;

        // clang-format off
        INIT_JNI_BINDINGS_TEMPLATE(
            INIT_NATIVE_METHOD("engine_call_constructor", "()J", (PackedArrayBridge<Derived, T, fq_name>::engine_call_constructor))
            INIT_NATIVE_METHOD("engine_call_constructor_packed_array", "()J", (PackedArrayBridge<Derived, T, fq_name>::engine_call_constructor_packed_array))
            INIT_NATIVE_METHOD("engine_call_constructor_array", "()J", (PackedArrayBridge<Derived, T, fq_name>::engine_call_constructor_array))
            INIT_NATIVE_METHOD("engine_call_append", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_append))
            INIT_NATIVE_METHOD("engine_call_appendArray", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_appendArray))
            INIT_NATIVE_METHOD("engine_call_bsearch", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_bsearch))
            INIT_NATIVE_METHOD("engine_call_clear", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_clear))
            INIT_NATIVE_METHOD("engine_call_count", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_count))
            INIT_NATIVE_METHOD("engine_call_duplicate", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_duplicate))
            INIT_NATIVE_METHOD("engine_call_fill", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_fill))
            INIT_NATIVE_METHOD("engine_call_find", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_find))
            INIT_NATIVE_METHOD("engine_call_is_empty", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_is_empty))
            INIT_NATIVE_METHOD("engine_call_get", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_get))
            INIT_NATIVE_METHOD("engine_call_has", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_has))
            INIT_NATIVE_METHOD("engine_call_insert", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_insert))
            INIT_NATIVE_METHOD("engine_call_reverse", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_reverse))
            INIT_NATIVE_METHOD("engine_call_pushback", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_pushback))
            INIT_NATIVE_METHOD("engine_call_remove_at", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_remove_at))
            INIT_NATIVE_METHOD("engine_call_resize", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_resize))
            INIT_NATIVE_METHOD("engine_call_rfind", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_rfind))
            INIT_NATIVE_METHOD("engine_call_set", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_set))
            INIT_NATIVE_METHOD("engine_call_size", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_size))
            INIT_NATIVE_METHOD("engine_call_slice", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_slice))
            INIT_NATIVE_METHOD("engine_call_sort", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_sort))
            INIT_NATIVE_METHOD("engine_call_to_byte_array", "(J)V", (PackedArrayBridge<Derived, T, fq_name>::engine_call_to_byte_array))
        )
        // clang-format on

    public:
        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);
        static uintptr_t engine_call_constructor_packed_array(JNIEnv* p_raw_env, jobject p_instance);
        static uintptr_t engine_call_constructor_array(JNIEnv* p_raw_env, jobject p_instance);

        static void engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_bsearch(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_fill(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_find(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_reverse(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_rfind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_pushback(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_remove_at(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_slice(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_sort(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_to_byte_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
    };

    template<class Derived, class T, const char* fq_name>
    uintptr_t PackedArrayBridge<Derived, T, fq_name>::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
        return reinterpret_cast<uintptr_t>(memnew(Vector<T>));
    }

    template<class Derived, class T, const char* fq_name>
    uintptr_t
    PackedArrayBridge<Derived, T, fq_name>::engine_call_constructor_packed_array(JNIEnv* p_raw_env, jobject p_instance) {
        jni::Env env {p_raw_env};
        Variant args[1] = {};
        TransferContext::get_instance().read_args(env, args);
        return reinterpret_cast<uintptr_t>(memnew(Vector<T>(args[0].operator Vector<T>())));
    }

    template<class Derived, class T, const char* fq_name>
    uintptr_t PackedArrayBridge<Derived, T, fq_name>::engine_call_constructor_array(JNIEnv* p_raw_env, jobject p_instance) {
        jni::Env env {p_raw_env};
        Variant args[1] = {};
        TransferContext::get_instance().read_args(env, args);

        TypedArray<T> array {args[0].operator Array()};
        auto* ret {memnew(Vector<T>)};
        int size {array.size()};
        ret->resize(size);
        for (int i = 0; i < size; ++i) {
            ret->write[i] = array[i];
        }
        return reinterpret_cast<uintptr_t>(ret);
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[1] = {};
        TransferContext::get_instance().read_args(env, args);
        from_uint_to_ptr<Vector<T>>(p_raw_ptr)->append(args[0].operator T());
    }

    template<class Derived, class T, const char* fq_name>
    void
    PackedArrayBridge<Derived, T, fq_name>::engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[1] = {};
        TransferContext::get_instance().read_args(env, args);
        from_uint_to_ptr<Vector<T>>(p_raw_ptr)->append_array(args[0].operator Vector<T>());
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_bsearch(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[2] = {};
        TransferContext::get_instance().read_args(env, args);
        Variant ret {from_uint_to_ptr<Vector<T>>(p_raw_ptr)->bsearch(args[0].operator T(), args[1].operator bool())};
        TransferContext::get_instance().write_return_value(env, ret);
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        from_uint_to_ptr<Vector<T>>(p_raw_ptr)->clear();
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[1] = {};
        TransferContext::get_instance().read_args(env, args);

        Variant ret {from_uint_to_ptr<Vector<T>>(p_raw_ptr)->count(args[0].operator T())};
        TransferContext::get_instance().write_return_value(env, ret);
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant ret {from_uint_to_ptr<Vector<T>>(p_raw_ptr)->duplicate()};
        TransferContext::get_instance().write_return_value(env, ret);
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_fill(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[1] = {};
        TransferContext::get_instance().read_args(env, args);
        from_uint_to_ptr<Vector<T>>(p_raw_ptr)->fill(args[0].operator T());
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_find(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[1] = {};
        TransferContext::get_instance().read_args(env, args);
        Variant ret {from_uint_to_ptr<Vector<T>>(p_raw_ptr)->find(args[0].operator T())};
        TransferContext::get_instance().write_return_value(env, ret);
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[1] = {};
        TransferContext::get_instance().read_args(env, args);
        Variant variant {from_uint_to_ptr<Vector<T>>(p_raw_ptr)->operator[](args[0].operator unsigned int())};
        TransferContext::get_instance().write_return_value(env, variant);
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[1] = {};
        TransferContext::get_instance().read_args(env, args);
        Variant ret {from_uint_to_ptr<Vector<T>>(p_raw_ptr)->has(args[0].operator T())};
        TransferContext::get_instance().read_return_value(env, ret);
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[2] = {};
        TransferContext::get_instance().read_args(env, args);
        from_uint_to_ptr<Vector<T>>(p_raw_ptr)->insert(args[0].operator unsigned int(), args[1].operator T());
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant variant {from_uint_to_ptr<Vector<T>>(p_raw_ptr)->is_empty()};
        TransferContext::get_instance().write_return_value(env, variant);
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_reverse(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        from_uint_to_ptr<Vector<T>>(p_raw_ptr)->reverse();
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_rfind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[2] = {};
        TransferContext::get_instance().read_args(env, args);

        Variant ret {from_uint_to_ptr<Vector<T>>(p_raw_ptr)->rfind(args[0].operator T(), args->operator int())};
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_pushback(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[1] = {};
        TransferContext::get_instance().read_args(env, args);
        from_uint_to_ptr<Vector<T>>(p_raw_ptr)->push_back(args[0].operator T());
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_remove_at(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[1] = {};
        TransferContext::get_instance().read_args(env, args);
        from_uint_to_ptr<Vector<T>>(p_raw_ptr)->remove_at(args[0].operator unsigned int());
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[1] = {};
        TransferContext::get_instance().read_args(env, args);
        from_uint_to_ptr<Vector<T>>(p_raw_ptr)->resize(args[0].operator unsigned int());
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[2] = {};
        TransferContext::get_instance().read_args(env, args);
        from_uint_to_ptr<Vector<T>>(p_raw_ptr)->set(args[0].operator unsigned int(), args[1].operator T());
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant variant {from_uint_to_ptr<Vector<T>>(p_raw_ptr)->size()};
        TransferContext::get_instance().write_return_value(env, variant);
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_slice(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant args[2] = {};
        TransferContext::get_instance().read_args(env, args);

        Variant ret {from_uint_to_ptr<Vector<T>>(p_raw_ptr)->slice(args[0].operator int(), args[1].operator int())};
        TransferContext::get_instance().write_return_value(env, ret);
    }

    template<class Derived, class T, const char* fq_name>
    void PackedArrayBridge<Derived, T, fq_name>::engine_call_sort(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        from_uint_to_ptr<Vector<T>>(p_raw_ptr)->sort();
    }

    template<class Derived, class T, const char* fq_name>
    void
    PackedArrayBridge<Derived, T, fq_name>::engine_call_to_byte_array(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
        jni::Env env {p_raw_env};
        Variant ret {from_uint_to_ptr<Vector<T>>(p_raw_ptr)->to_byte_array()};
        TransferContext::get_instance().write_return_value(env, ret);
    }

    template<class Derived, class T, const char* fq_name>
    PackedArrayBridge<Derived, T, fq_name>::PackedArrayBridge(jni::Env& p_env, jni::JObject p_wrapped) : JvmSingletonWrapper<Derived, fq_name>(p_env, p_wrapped) {}
}

#endif //GODOT_JVM_PACKED_ARRAY_BRIDGE_H
