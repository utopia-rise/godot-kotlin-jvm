#ifndef GODOT_JVM_JVM_BINDING_H
#define GODOT_JVM_JVM_BINDING_H

#include "jvm_wrapper/registration/kt_object.h"
#include <atomic>

class JvmBinding {
    int constructor_id = -1;
    // Using std directly because Godot SafeFlag doesn't provide the right methods (despite wrapping the same std atomic).
    std::atomic_flag is_incremented = ATOMIC_FLAG_INIT;
public:
    JvmBinding() = default;
    ~JvmBinding() = default;

    void init(Object* obj);
    int get_constructor_id() const;
    bool test_and_set_incremented();
};

#endif // GODOT_JVM_JVM_BINDING_H
