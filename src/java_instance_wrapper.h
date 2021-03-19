#ifndef GODOT_JVM_JAVAINSTANCEWRAPPER_H
#define GODOT_JVM_JAVAINSTANCEWRAPPER_H


#include "jni/wrapper.h"

#define JNI_INIT_STATICS_FOR_CLASS(C) \
    C::JNIMethods C::jni_methods{}; \
    template<> jni::JClass JavaInstanceWrapper<C>::j_class(static_cast<jclass>(nullptr));

#define JNI_METHOD(var_name, name, signature) \
    jni::JavaMethodSignature var_name{name, signature};

#define DECLARE_JNI_METHODS(...) \
private: \
    struct JNIMethods { \
        __VA_ARGS__ \
    }; \
    static JNIMethods jni_methods;

template<class Derived>
class JavaInstanceWrapper {
protected:
    jni::JObject wrapped;
    jni::JObject class_loader;

    static jni::JClass j_class;

    JavaInstanceWrapper(const char* p_class_name, jni::JObject p_wrapped, jni::JObject& p_class_loader);

    ~JavaInstanceWrapper();

    jni::MethodId get_method_id(jni::Env& env, jni::JavaMethodSignature& method_signature);

    jni::MethodId get_static_method_id(jni::Env& env, jni::JavaMethodSignature& method_signature);
};

template<class Derived>
JavaInstanceWrapper<Derived>::JavaInstanceWrapper(const char* p_class_name, jni::JObject p_wrapped,
                                                  jni::JObject& p_class_loader) {
    jni::Env env{jni::Jvm::current_env()};
    wrapped = p_wrapped.new_global_ref<jni::JObject>(env);
    class_loader = p_class_loader.new_global_ref<jni::JObject>(env);
    if (unlikely(!j_class.obj)) {
        jni::JObject local_j_class = env.load_class(p_class_name, class_loader);
        j_class = local_j_class.template new_global_ref<jni::JClass>(env);
        local_j_class.delete_local_ref(env);
    }
}

template<class Derived>
JavaInstanceWrapper<Derived>::~JavaInstanceWrapper() {
    jni::Env env{jni::Jvm::current_env()};
    wrapped.delete_global_ref(env);
    class_loader.delete_global_ref(env);
}

template<class Derived>
jni::MethodId JavaInstanceWrapper<Derived>::get_method_id(jni::Env& env, jni::JavaMethodSignature& method_signature) {
    if (unlikely(!method_signature.method_id)) {
        method_signature.init(env, j_class);
    }
    return method_signature.method_id;
}

template<class Derived>
jni::MethodId
JavaInstanceWrapper<Derived>::get_static_method_id(jni::Env& env, jni::JavaMethodSignature& method_signature) {
    if (unlikely(method_signature.method_id)) {
        method_signature.init(env, j_class);
    }
    return method_signature.method_id;
}

#endif //GODOT_JVM_JAVAINSTANCEWRAPPER_H
