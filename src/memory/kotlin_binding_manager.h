#ifndef GODOT_JVM_KOTLIN_BINDING_MANAGER_H
#define GODOT_JVM_KOTLIN_BINDING_MANAGER_H

#include "core/object/ref_counted.h"
#include "core/os/mutex.h"
#include "kotlin_binding.h"
#include "modules/kotlin_jvm/src/jni/types.h"
#include "modules/kotlin_jvm/src/kotlin_instance.h"
#include "modules/kotlin_jvm/src/kt_object.h"
#include <cstdint>

class KotlinBindingManager {
private:
    KotlinBindingManager();

    ~KotlinBindingManager() = default;

    SpinLock spin;
    HashMap<Object*, KotlinBinding> binding_map;

    //Callbacks required by Godot for instance bindings.
    static GDNativeInstanceBindingCallbacks _instance_binding_callbacks;

    static void* _instance_binding_create_callback(void* p_token, void* p_instance);

    static void _instance_binding_free_callback(void* p_token, void* p_instance, void* p_binding);

    static GDNativeBool _instance_binding_reference_callback(void* p_token, void* p_binding, GDNativeBool p_reference);

public:
    KotlinBindingManager(KotlinBindingManager const& other) = delete;

    KotlinBindingManager& operator=(const KotlinBindingManager&) = delete;

    //For instance bindings, they are to bind native Godot objects to their JVM wrappers, not for the scripts.
    static void set_instance_binding(Object* p_object, KtObject* ktObject);

    static KotlinBinding* get_instance_binding(Object* p_object);

    //For script bindings, they are to bind user defined Godot objects to their JVM scripts, not for native objects.
    static KotlinBinding* create_script_binding(Object* p_object, KtObject* ktObject);

    static void delete_script_binding(KotlinInstance* instance);

    static KotlinBindingManager& get_instance();
};

#endif //GODOT_JVM_KOTLIN_BINDING_MANAGER_H
