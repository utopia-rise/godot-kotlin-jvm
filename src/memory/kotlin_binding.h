#ifndef GODOT_JVM_KOTLIN_BINDING_H
#define GODOT_JVM_KOTLIN_BINDING_H

#include "modules/kotlin_jvm/src/kt_object.h"

//forward declaration
class KotlinBindingManager;

class KotlinBinding {
    friend class KotlinBindingManager;
    friend class KotlinInstance;
    //The pair structure in HashMap contains values of KotlinBinding.
    //It has to be able to call its private destructor when removing bindings.
    friend struct KeyValue<Object*, KotlinBinding>;

private:
    KtObject* kt_object;
    Object* owner;

    KotlinBinding();

    ~KotlinBinding();

public:
    void refcount_incremented_unsafe();

    bool refcount_decremented_unsafe();

    void set_kt_object(KtObject* p_kt_object);

    bool is_ready();
};

#endif //GODOT_JVM_KOTLIN_BINDING_H
