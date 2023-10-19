#ifndef GODOT_JVM_KOTLIN_BINDING_H
#define GODOT_JVM_KOTLIN_BINDING_H

#include "kt_binding.h"
#include "kt_object.h"

// forward declaration
class KotlinBindingManager;

class KotlinBinding {
    friend class KotlinBindingManager;
    friend class KotlinInstance;

    enum class BindingStatus {
        CREATED,
        READY,
        BOUND
    };

    KtBinding* kt_binding;
    Object* owner;
    BindingStatus status = BindingStatus::CREATED;

    KotlinBinding();

    void set_ready();
    void set_kt_binding(jni::JObject j_object);
    void unset_kt_binding();

public:
    ~KotlinBinding();

    void refcount_incremented_unsafe();

    bool refcount_decremented_unsafe();

    bool is_ready();
    bool is_bound();
};

#endif// GODOT_JVM_KOTLIN_BINDING_H
