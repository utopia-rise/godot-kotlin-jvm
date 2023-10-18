#ifndef GODOT_JVM_KOTLIN_BINDING_MANAGER_H
#define GODOT_JVM_KOTLIN_BINDING_MANAGER_H

#include "core/extension/gdextension_interface.h"
#include "kotlin_binding.h"
#include "kt_binding.h"

#include <cstdint>

class KotlinBindingManager {
private:
    KotlinBindingManager() = default;

    ~KotlinBindingManager() = default;

    KotlinBindingManager(KotlinBindingManager const& other) = delete;

    KotlinBindingManager& operator=(const KotlinBindingManager&) = delete;

    // Callbacks required by Godot for instance bindings.
    static GDExtensionInstanceBindingCallbacks _instance_binding_callbacks;

    static void* _instance_binding_create_callback(void* p_token, void* p_instance);

    static void _instance_binding_free_callback(void* p_token, void* p_instance, void* p_binding);

    static GDExtensionBool _instance_binding_reference_callback(void* p_token, void* p_binding, GDExtensionBool p_reference);

public:
    // For instance bindings, they are to bind native Godot objects to their JVM wrappers, not for the scripts.
    static KotlinBinding* set_instance_binding(Object* p_object);

    // Doesn't set the KtObject as it doesn't exist yet, bind_object has be used later.
    static KotlinBinding* get_instance_binding(Object* p_object);

    static void bind_object(ObjectID id, KtBinding* kt_binding);
    static void unbind_object(ObjectID id);
};

#endif// GODOT_JVM_KOTLIN_BINDING_MANAGER_H
