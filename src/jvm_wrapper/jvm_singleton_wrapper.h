#ifndef GODOT_JVM_JVM_SINGLETON_WRAPPER_H
#define GODOT_JVM_JVM_SINGLETON_WRAPPER_H

#include "jvm_instance_wrapper.h"

#define JVM_SINGLETON_WRAPPER(NAME, FQNAME)        \
    constexpr char NAME##QualifiedName[] = FQNAME; \
    class NAME : public JvmSingletonWrapper<NAME, NAME##QualifiedName>

#define SINGLETON_CLASS(NAME)                                    \
    friend class JvmSingletonWrapper<NAME, NAME##QualifiedName>; \
                                                                 \
public:                                                          \
    NAME(const NAME&) = delete;                                  \
    void operator=(const NAME&) = delete;                        \
    NAME& operator=(NAME&&) noexcept = delete;                   \
    NAME(NAME&&) noexcept = delete;                              \
                                                                 \
protected:                                                       \
    explicit NAME(jni::JObject p_wrapped);                       \
    ~NAME();

/**
 * JvmSingletonWrapper CRTP. Inherits from JvmInstanceWrapper CRTP.
 * This implements singleton pattern in order to wrap jvm singletons to cpp singletons.
 * Each inheriting class Derived define a method called "initialize" that must be called at least once
 * This instance will be deleted when calling destroy method.
 *
 * @tparam Derived
 * @tparam FqName
 */
template<class Derived, const char* FqName>
class JvmSingletonWrapper : public JvmInstanceWrapper<FqName> {
    static Derived* instance;

public:
    static Derived& get_instance();

    static void initialize();
    static void destroy();

    JvmSingletonWrapper(const JvmSingletonWrapper<Derived, FqName>&) = delete;
    void operator=(const JvmSingletonWrapper<Derived, FqName>&) = delete;
    JvmSingletonWrapper<Derived, FqName>& operator=(JvmSingletonWrapper<Derived, FqName>&&) noexcept = delete;
    JvmSingletonWrapper(JvmSingletonWrapper<Derived, FqName>&& instance) noexcept = delete;

protected:
    explicit JvmSingletonWrapper(jni::JObject p_wrapped);
    ~JvmSingletonWrapper() = default;
};

template<class Derived, const char* FqName>
Derived* JvmSingletonWrapper<Derived, FqName>::instance {nullptr};

template<class Derived, const char* FqName>
Derived& JvmSingletonWrapper<Derived, FqName>::get_instance() {
    if (unlikely(!instance)) { Derived::initialize(); }
    return *instance;
}

template<class Derived, const char* FqName>
void JvmSingletonWrapper<Derived, FqName>::initialize() {
    jni::Env env {jni::Jvm::current_env()};
    jni::JObject class_loader = ClassLoader::get_default_loader();

    jni::JClass singleton_cls = env.load_class(FqName, class_loader);
    jni::FieldId singleton_instance_field =
      singleton_cls.get_static_field_id(env, "INSTANCE", vformat("L%s;", FqName).replace(".", "/").utf8().ptr());
    jni::JObject singleton_instance = singleton_cls.get_static_object_field(env, singleton_instance_field);
    JVM_CRASH_COND_MSG(singleton_instance.is_null(), "Failed to retrieve LongStringQueue instance");

    instance = new Derived(singleton_instance);

    Derived::initialize_jni_binding();
}

template<class Derived, const char* FqName>
void JvmSingletonWrapper<Derived, FqName>::destroy() {
    delete instance;
    instance = nullptr;
}

template<class Derived, const char* FqName>
JvmSingletonWrapper<Derived, FqName>::JvmSingletonWrapper(jni::JObject p_wrapped) :
  JvmInstanceWrapper<FqName>(p_wrapped) {}

#endif// GODOT_JVM_JVM_SINGLETON_WRAPPER_H
