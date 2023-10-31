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

#define INIT_NATIVE_METHOD(string_name, signature, function) \
    methods.push_back({const_cast<char*>(string_name), const_cast<char*>(signature), (void*) function});

/**
 * This class wraps a JObject representing a JVM instance.
 * This class is a base that allows to setup JavaToNative and NativeToJava call easily.
 * One implementation must be provided for every JVM class you wish to use.
 * Use JNI_INIT_STATICS_FOR_CLASS macro to create a static instance that will handle the JNI setup for that class.
 * Note that the jni::JObject p_wrapped argument in the constructor must be a local reference.
 * It will automatically be promoted to global and the local deleted.
 */
class JavaInstanceWrapper {
protected:
    bool is_weak;
    jni::JObject wrapped;

    JavaInstanceWrapper(jni::JObject p_wrapped);

    ~JavaInstanceWrapper();

public:
    bool is_ref_weak() const;

    void swap_to_strong_unsafe();

    void swap_to_weak_unsafe();
};

#endif// GODOT_JVM_JAVAINSTANCEWRAPPER_H
