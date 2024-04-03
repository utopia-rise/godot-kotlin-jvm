#ifndef GODOT_JVM_JVM_INSTANCE_WRAPPER_H
#define GODOT_JVM_JVM_INSTANCE_WRAPPER_H

#include "jni/class_loader.h"
#include "jni/wrapper.h"

#define JVM_INSTANCE_WRAPPER(NAME, FQNAME)         \
    inline constexpr char NAME##QualifiedName[] = FQNAME; \
    class NAME : public JvmInstanceWrapper<NAME, NAME##QualifiedName>

#define JNI_METHOD(var_name) inline static jni::MethodId var_name {nullptr};

#define INIT_JNI_METHOD(var_name, name, signature) var_name = clazz.get_method_id(env, name, signature);

#define INIT_NATIVE_METHOD(string_name, signature, function) \
    methods.push_back({const_cast<char*>(string_name), const_cast<char*>(signature), (void*) function});

#define INIT_JNI_BINDINGS(...)                                                                             \
                                                                                                           \
public:                                                                                                    \
    static void initialize_jni_binding() {                                                                 \
        jni::Env env {jni::Jvm::current_env()};                                                            \
        Vector<jni::JNativeMethod> methods;                                                                \
        jni::JClass clazz {env.load_class(get_fully_qualified_name(), ClassLoader::get_default_loader())}; \
                                                                                                           \
        __VA_ARGS__                                                                                        \
        if (methods.size() > 0) { clazz.register_natives(env, methods); }                                  \
        clazz.delete_local_ref(env);                                                                       \
    }                                                                                                      \
                                                                                                           \
private:

/**
 * This class wraps a JObject representing a JVM instance.
 * This class is a base that allows to setup JavaToNative and NativeToJava call easily.
 * One implementation must be provided for every JVM class you wish to use.
 * Use INIT_JNI_BINDINGS macro to create a static instance that will handle the JNI setup for that class.
 * Note that the jni::JObject p_wrapped argument in the constructor must be a local reference.
 * It will automatically be promoted to global and the local deleted.
 */
template<class Derived, const char* FqName>
class JvmInstanceWrapper {
protected:
    bool is_weak;
    jni::JObject wrapped;
    
    explicit JvmInstanceWrapper(jni::JObject p_wrapped);
    ~JvmInstanceWrapper();

public:
    bool is_ref_weak() const;

    const jni::JObject& get_wrapped() const;

    void swap_to_strong_unsafe();

    void swap_to_weak_unsafe();

    static const char* get_fully_qualified_name();
    
    static Derived* create_instance();
};

template<class Derived, const char* FqName>
JvmInstanceWrapper<Derived, FqName>::JvmInstanceWrapper(jni::JObject p_wrapped) : is_weak(false) {
    // When created, it's a strong reference by default
    jni::Env env {jni::Jvm::current_env()};
    wrapped = p_wrapped.new_global_ref<jni::JObject>(env);
    p_wrapped.delete_local_ref(env);
}

template<class Derived, const char* FqName>
Derived* JvmInstanceWrapper<Derived, FqName>::create_instance() {
    jni::Env env {jni::Jvm::current_env()};
    jni::JClass bootstrap_cls = env.load_class(FqName, ClassLoader::get_default_loader());
    jni::MethodId ctor = bootstrap_cls.get_constructor_method_id(env, "()V");
    jni::JObject instance = bootstrap_cls.new_instance(env, ctor);
    return new Derived(instance);
}

template<class Derived, const char* FqName>
JvmInstanceWrapper<Derived, FqName>::~JvmInstanceWrapper() {
    jni::Env env {jni::Jvm::current_env()};
    if (is_weak) {
        wrapped.delete_weak_ref(env);
    } else {
        wrapped.delete_global_ref(env);
    }
}

template<class Derived, const char* FqName>
bool JvmInstanceWrapper<Derived, FqName>::is_ref_weak() const {
    return is_weak;
}

template<class Derived, const char* FqName>
void JvmInstanceWrapper<Derived, FqName>::swap_to_strong_unsafe() {
    // Assume the reference is currently weak
    jni::Env env {jni::Jvm::current_env()};
    jni::JObject new_ref = wrapped.new_global_ref<jni::JObject>(env);
    wrapped.delete_weak_ref(env);
    wrapped = new_ref;
    is_weak = false;
}

template<class Derived, const char* FqName>
void JvmInstanceWrapper<Derived, FqName>::swap_to_weak_unsafe() {
    // Assume the reference is currently strong
    jni::Env env {jni::Jvm::current_env()};
    jni::JObject new_ref = wrapped.new_weak_ref<jni::JObject>(env);
    wrapped.delete_global_ref(env);
    wrapped = new_ref;
    is_weak = true;
}

template<class Derived, const char* FqName>
const char* JvmInstanceWrapper<Derived, FqName>::get_fully_qualified_name() {
    return FqName;
}

template<class Derived, const char* FqName>
const jni::JObject& JvmInstanceWrapper<Derived, FqName>::get_wrapped() const {
    return wrapped;
}

#endif// GODOT_JVM_JVM_INSTANCE_WRAPPER_H
