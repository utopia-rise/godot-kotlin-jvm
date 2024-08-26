#ifndef GODOT_JVM_KOTLIN_BINDING_H
#define GODOT_JVM_KOTLIN_BINDING_H

#include "jvm_wrapper/registration/kt_object.h"

class KotlinBinding {
    int constructor_id;

public:
    KotlinBinding() = default;
    ~KotlinBinding() = default;

    void init(Object* obj);
    int get_constructor_id() const;
};

#endif// GODOT_JVM_KOTLIN_BINDING_H
