#ifndef GODOT_JVM_KOTLIN_BINDING_H
#define GODOT_JVM_KOTLIN_BINDING_H

#include "kt_object.h"

// forward declaration
class KotlinBindingManager;

class KotlinBinding {
    friend class KotlinBindingManager;
    friend class KotlinInstance;

    KtObject* kt_object;
    Object* owner;
    KtObject* kt_object;

    KotlinBinding();

    ~KotlinBinding() = default;

    void set_kt_object(KtObject* p_kt_object);

    void unset_kt_object();

public:
    void refcount_incremented_unsafe();

    bool refcount_decremented_unsafe();

    bool is_bound();
};

#endif// GODOT_JVM_KOTLIN_BINDING_H
