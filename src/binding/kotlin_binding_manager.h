#ifndef GODOT_JVM_KOTLIN_BINDING_MANAGER_H
#define GODOT_JVM_KOTLIN_BINDING_MANAGER_H

#include <core/extension/gdextension_interface.h>
#include <core/object/object.h>
#include "kotlin_binding.h"

#include <cstdint>

class KotlinBindingManager {
    KotlinBindingManager() = default;

    ~KotlinBindingManager() = default;

    // Callbacks required by Godot for instance bindings.
    static GDExtensionInstanceBindingCallbacks _instance_binding_callbacks;

    static void* _instance_binding_create_callback(void* p_token, void* p_instance);

    static void _instance_binding_free_callback(void* p_token, void* p_instance, void* p_binding);

public:
    KotlinBindingManager(KotlinBindingManager const& other) = delete;

    KotlinBindingManager& operator=(const KotlinBindingManager&) = delete;

    // For instance bindings, they are to bind native Godot objects to their JVM wrappers, not for the scripts.
    static KotlinBinding* set_instance_binding(Object* p_object);

    // Doesn't set the KtObject as it doesn't exist yet, bind_object has be used later.
    static KotlinBinding* get_instance_binding(Object* p_object);

    static void free_binding(Object* p_ref);
};

#endif// GODOT_JVM_KOTLIN_BINDING_MANAGER_H
