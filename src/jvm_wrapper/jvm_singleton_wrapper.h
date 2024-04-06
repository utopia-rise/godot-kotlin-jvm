#ifndef GODOT_JVM_JVM_SINGLETON_WRAPPER_H
#define GODOT_JVM_JVM_SINGLETON_WRAPPER_H

#include "jvm_instance_wrapper.h"
#include "lifecycle/jni_lifecycle_manager.h"

#define JVM_SINGLETON_WRAPPER(NAME, FQNAME)               \
    inline constexpr char NAME##QualifiedName[] = FQNAME; \
    class NAME : public JvmSingletonWrapper<NAME, NAME##QualifiedName>

#define SINGLETON_CLASS(NAME)                                             \
    friend class JvmSingletonWrapper<NAME, NAME##QualifiedName>;          \
                                                                          \
public:                                                                   \
    NAME(const NAME&) = delete;                                           \
    void operator=(const NAME&) = delete;                                 \
    NAME& operator=(NAME&&) noexcept = delete;                            \
    NAME(NAME&&) noexcept = delete;                                       \
                                                                          \
protected:                                                                \
    explicit NAME(jni::Env& p_env, jni::JObject p_wrapped) :              \
      JvmSingletonWrapper<NAME, NAME##QualifiedName>(p_env, p_wrapped) {} \
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
class JvmSingletonWrapper : public JvmInstanceWrapper<Derived, FqName> {
    friend class JniLifecycleManager;

    static Derived* _instance;

    static void initialize(jni::Env& p_env);
    static void destroy();

protected:
    JvmSingletonWrapper(jni::Env& p_env, jni::JObject p_wrapped);
    ~JvmSingletonWrapper() = default;

public:
    static Derived& get_instance();

    JvmSingletonWrapper(const JvmSingletonWrapper<Derived, FqName>&) = delete;
    void operator=(const JvmSingletonWrapper<Derived, FqName>&) = delete;
    JvmSingletonWrapper<Derived, FqName>& operator=(JvmSingletonWrapper<Derived, FqName>&&) noexcept = delete;
    JvmSingletonWrapper(JvmSingletonWrapper<Derived, FqName>&& instance) noexcept = delete;

    static Derived* create_instance(jni::Env& p_env);
};

template<class Derived, const char* FqName>
Derived* JvmSingletonWrapper<Derived, FqName>::create_instance(jni::Env& p_env) {
    LOG_ERROR("Can't create a new instance of a this class. Returning the singleton instead");
    return _instance;
}

template<class Derived, const char* FqName>
Derived* JvmSingletonWrapper<Derived, FqName>::_instance {nullptr};

template<class Derived, const char* FqName>
Derived& JvmSingletonWrapper<Derived, FqName>::get_instance() {
    JVM_CRASH_COND_MSG(!_instance, String(FqName) + " singleton is not initialized.");
    return *_instance;
}

template<class Derived, const char* FqName>
void JvmSingletonWrapper<Derived, FqName>::initialize(jni::Env& p_env) {
    JVM_CRASH_COND_MSG(_instance, String(FqName) + " singleton is already initialized.");

    jni::JObject class_loader = ClassLoader::get_default_loader();

    jni::JClass singleton_cls = p_env.load_class(FqName, class_loader);
    jni::FieldId singleton_instance_field =
      singleton_cls.get_static_field_id(p_env, "INSTANCE", vformat("L%s;", FqName).replace(".", "/").utf8().ptr());
    jni::JObject singleton_instance = singleton_cls.get_static_object_field(p_env, singleton_instance_field);

    JVM_CRASH_COND_MSG(singleton_instance.is_null(), "Failed to retrieve " + String(FqName) + " singleton");

    _instance = new Derived(p_env, singleton_instance);

    Derived::initialize_jni_binding(p_env);
}

template<class Derived, const char* FqName>
void JvmSingletonWrapper<Derived, FqName>::destroy() {
    delete _instance;
    _instance = nullptr;
}

template<class Derived, const char* FqName>
JvmSingletonWrapper<Derived, FqName>::JvmSingletonWrapper(jni::Env& p_env, jni::JObject p_wrapped) :
  JvmInstanceWrapper<Derived, FqName>(p_env, p_wrapped) {}

#endif// GODOT_JVM_JVM_SINGLETON_WRAPPER_H
