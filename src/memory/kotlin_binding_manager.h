#ifndef GODOT_JVM_KOTLIN_BINDING_MANAGER_H
#define GODOT_JVM_KOTLIN_BINDING_MANAGER_H

#include "kotlin_binding.h"

#include <cstdint>

class KotlinBindingManager {
private:
    KotlinBindingManager();

    ~KotlinBindingManager() = default;

    SpinLock spin;
    HashMap<Object*, KotlinBinding> binding_map;

    // Callbacks required by Godot for instance bindings.
    static GDNativeInstanceBindingCallbacks _instance_binding_callbacks;

    static void* _instance_binding_create_callback(void* p_token, void* p_instance);

    static void _instance_binding_free_callback(void* p_token, void* p_instance, void* p_binding);

    static GDNativeBool _instance_binding_reference_callback(void* p_token, void* p_binding, GDNativeBool p_reference);

public:
    KotlinBindingManager(KotlinBindingManager const& other) = delete;

    KotlinBindingManager& operator=(const KotlinBindingManager&) = delete;

    // For instance bindings, they are to bind native Godot objects to their JVM wrappers, not for the scripts.
    static void set_instance_binding(Object* p_object, KtObject* ktObject);

    // Doesn't set the KtObject as it doesn't exist yet, bind_object has be used later.
    static KotlinBinding* get_instance_binding(Object* p_object);

    static bool bind_object(Object* p_object, KtObject* ktObject);

    // For script bindings, they are to bind user defined Godot objects to their JVM scripts, not for native objects.
    static KotlinBinding* create_script_binding(Object* p_object, KtObject* ktObject);

    static void delete_script_binding(KotlinBinding* binding);

    static KotlinBindingManager& get_instance();
};

#endif// GODOT_JVM_KOTLIN_BINDING_MANAGER_H
