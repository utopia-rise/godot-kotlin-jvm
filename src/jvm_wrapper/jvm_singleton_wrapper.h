#ifndef GODOT_JVM_JVM_SINGLETON_WRAPPER_H
#define GODOT_JVM_JVM_SINGLETON_WRAPPER_H

#include "jvm_instance_wrapper.h"

/**
 * JvmSingletonWrapper CRTP. Inherits from JvmInstanceWrapper CRTP.
 * This implements singleton pattern in order to wrap jvm singletons to cpp singletons.
 * Each inheriting class Derived must define a Derived::init(). This method should return a heap allocated instance of
 * Derived type.
 * This instance will be deleted when calling destroy method.
 *
 * @tparam Derived
 */
template<class Derived>
class JvmSingletonWrapper : public JvmInstanceWrapper {
public:
    static Derived& get_instance();
    static void destroy();

    JvmSingletonWrapper(const JvmSingletonWrapper<Derived>&) = delete;
    void operator=(const JvmSingletonWrapper<Derived>&) = delete;
    JvmSingletonWrapper<Derived>& operator=(JvmSingletonWrapper<Derived>&&) noexcept = delete;
    JvmSingletonWrapper(JvmSingletonWrapper<Derived>&& instance) noexcept = delete;

protected:
    explicit JvmSingletonWrapper(jni::JObject p_wrapped);
    ~JvmSingletonWrapper() = default;

private:
    static Derived* instance;
};

template<class Derived>
Derived* JvmSingletonWrapper<Derived>::instance {nullptr};

template<class Derived>
Derived& JvmSingletonWrapper<Derived>::get_instance() {
    if (unlikely(!instance)) { instance = Derived::init(); }
    return *instance;
}

template<class Derived>
void JvmSingletonWrapper<Derived>::destroy() {
    delete instance;
    instance = nullptr;
}

template<class Derived>
JvmSingletonWrapper<Derived>::JvmSingletonWrapper(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {}

#endif// GODOT_JVM_JVM_SINGLETON_WRAPPER_H
