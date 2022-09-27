#ifndef GODOT_JVM_KOTLIN_BINDING_H
#define GODOT_JVM_KOTLIN_BINDING_H

#include "modules/kotlin_jvm/src/kt_object.h"

class KotlinBindingManager;

class KotlinBinding {
    friend class KotlinBindingManager;

public:
    KtObject* kt_object;
    Object* owner;
    bool is_setup;

private:
    KotlinBinding();

    ~KotlinBinding();

public:
    void refcount_incremented_unsafe();

    bool refcount_decremented_unsafe();
};

#endif //GODOT_JVM_KOTLIN_BINDING_H
