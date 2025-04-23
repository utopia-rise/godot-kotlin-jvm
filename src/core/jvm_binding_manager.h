#ifndef GODOT_JVM_JVM_BINDING_MANAGER_H
#define GODOT_JVM_JVM_BINDING_MANAGER_H

#include "jvm_binding.h"

#include <gdextension_interface.h>

#include <classes/object.hpp>
#include <cstdint>

class JvmBindingManager {
    JvmBindingManager() = default;

    ~JvmBindingManager() = default;

    // Callbacks required by Godot for instance bindings.
    static GDExtensionInstanceBindingCallbacks _instance_binding_callbacks;

    static void* _instance_binding_create_callback(void* p_token, void* p_instance);

    static void _instance_binding_free_callback(void* p_token, void* p_instance, void* p_binding);

public:
    JvmBindingManager(JvmBindingManager const& other) = delete;

    JvmBindingManager& operator=(const JvmBindingManager&) = delete;

    // For instance bindings, they are to bind native Godot objects to their JVM wrappers, not for the scripts.
    static JvmBinding* set_instance_binding(godot::Object* p_object);

    // Doesn't set the KtObject as it doesn't exist yet, bind_object has be used later.
    static JvmBinding* get_instance_binding(godot::Object* p_object);

    static void free_binding(godot::Object* p_ref);
};

#endif // GODOT_JVM_JVM_BINDING_MANAGER_H
