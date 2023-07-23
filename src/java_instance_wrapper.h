#ifndef GODOT_JVM_JAVAINSTANCEWRAPPER_H
#define GODOT_JVM_JAVAINSTANCEWRAPPER_H

#include "jni/class_loader.h"
#include "jni/wrapper.h"

#define JNI_METHOD(var_name, name, signature) jni::JavaMethodSignature var_name {name, signature};

#define DECLARE_JNI_METHODS(...)                            \
                                                            \
public:                                                     \
    static void initialize_class(const char* p_class_name); \
                                                            \
private:                                                    \
    struct JNIMethods {                                     \
        __VA_ARGS__                                         \
    };                                                      \
    static JNIMethods jni_methods;

#define JNI_INIT_STATICS_FOR_CLASS(C, ...)                                                   \
    C::JNIMethods C::jni_methods {};                                                         \
    void C::initialize_class(const char* p_class_name) {                                     \
        jni::Env env {jni::Jvm::current_env()};                                              \
        Vector<jni::JNativeMethod> methods;                                                  \
        jni::JClass clazz {env.load_class(p_class_name, ClassLoader::get_default_loader())}; \
        __VA_ARGS__                                                                          \
        if (methods.size() > 0) { clazz.register_natives(env, methods); }                    \
        clazz.delete_local_ref(env);                                                         \
    }

#define INIT_JNI_METHOD(name) jni_methods.name.init(env, clazz);

#define INIT_NATIVE_METHOD(name, string_name, signature, function)                                            \
    jni::JNativeMethod name {const_cast<char*>(string_name), const_cast<char*>(signature), (void*) function}; \
    methods.push_back(name);

/**
 * JavaInstanceWrapper CRTP. It wraps a JObject representing a JVM instance.
 * This class is a base that allows to setup JavaToNative and NativeToJava call easily.
 * One implementation must be provided for every JVM class you wish to use.
 * Use JNI_INIT_STATICS_FOR_CLASS macro to create a static instance that will handle the JNI setup for that class.
 * Note that the jni::JObject p_wrapped argument in the constructor must be a local reference.
 * It will automatically be promoted to global and the local deleted.
 * @tparam Derived
 */
template<class Derived>
class JavaInstanceWrapper {
protected:
    bool is_weak;
    jni::JObject wrapped;
    jni::JObject class_loader;

    JavaInstanceWrapper(jni::JObject p_wrapped);

    ~JavaInstanceWrapper();

public:
    bool is_ref_weak() const;

    void swap_to_strong_unsafe();

    void swap_to_weak_unsafe();
};

template<class Derived>
JavaInstanceWrapper<Derived>::JavaInstanceWrapper(jni::JObject p_wrapped) {
    // When created, it's a strong reference by default
    jni::Env env {jni::Jvm::current_env()};
    wrapped = p_wrapped.new_global_ref<jni::JObject>(env);
    is_weak = false;
    p_wrapped.delete_local_ref(env);
}

template<class Derived>
JavaInstanceWrapper<Derived>::~JavaInstanceWrapper() {
    jni::Env env {jni::Jvm::current_env()};
    if (is_weak) {
        wrapped.delete_weak_ref(env);
    } else {
        wrapped.delete_global_ref(env);
    }
    class_loader.delete_global_ref(env);
}

template<class Derived>
bool JavaInstanceWrapper<Derived>::is_ref_weak() const {
    return is_weak;
}

template<class Derived>
void JavaInstanceWrapper<Derived>::swap_to_strong_unsafe() {
    // Assume the reference is currently weak
    jni::Env env {jni::Jvm::current_env()};
    jni::JObject new_ref = wrapped.new_global_ref<jni::JObject>(env);
    wrapped.delete_weak_ref(env);
    wrapped = new_ref;
    is_weak = false;
}

template<class Derived>
void JavaInstanceWrapper<Derived>::swap_to_weak_unsafe() {
    // Assume the reference is currently strong
    jni::Env env {jni::Jvm::current_env()};
    jni::JObject new_ref = wrapped.new_weak_ref<jni::JObject>(env);
    wrapped.delete_global_ref(env);
    wrapped = new_ref;
    is_weak = true;
}

#endif// GODOT_JVM_JAVAINSTANCEWRAPPER_H
