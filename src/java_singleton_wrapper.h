#ifndef GODOT_JVM_JAVA_SINGLETON_WRAPPER_H
#define GODOT_JVM_JAVA_SINGLETON_WRAPPER_H

#include "java_instance_wrapper.h"

/**
 * JavaSingletonWrapper CRTP. Inherits from JavaInstanceWrapper CRTP.
 * This implements singleton pattern in order to wrap jvm singletons to cpp singletons.
 * Each inheriting class Derived must define a Derived::init(). This method should return a heap allocated instance of
 * Derived type.
 * This instance will be deleted when calling destroy method.
 *
 * @tparam Derived
 */
template<class Derived>
class JavaSingletonWrapper : public JavaInstanceWrapper {
public:
    static Derived& get_instance();
    static void destroy();

    JavaSingletonWrapper(const JavaSingletonWrapper<Derived>&) = delete;
    void operator=(const JavaSingletonWrapper<Derived>&) = delete;
    JavaSingletonWrapper<Derived>& operator=(JavaSingletonWrapper<Derived>&&) noexcept = delete;
    JavaSingletonWrapper(JavaSingletonWrapper<Derived>&& instance) noexcept = delete;

protected:
    JavaSingletonWrapper(jni::JObject p_wrapped);
    ~JavaSingletonWrapper() = default;

private:
    static Derived* instance;
};

template<class Derived>
Derived* JavaSingletonWrapper<Derived>::instance {nullptr};

template<class Derived>
Derived& JavaSingletonWrapper<Derived>::get_instance() {
    if (unlikely(!instance)) { instance = Derived::init(); }
    return *instance;
}

template<class Derived>
void JavaSingletonWrapper<Derived>::destroy() {
    delete instance;
    instance = nullptr;
}

template<class Derived>
JavaSingletonWrapper<Derived>::JavaSingletonWrapper(jni::JObject p_wrapped) : JavaInstanceWrapper(p_wrapped) {}

#endif// GODOT_JVM_JAVA_SINGLETON_WRAPPER_H
