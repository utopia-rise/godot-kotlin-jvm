#include "kotlin_binding_manager.h"

#include "gd_kotlin.h"
#include "jvm_wrapper/memory/memory_manager.h"

static SpinLock spin;

GDExtensionInstanceBindingCallbacks KotlinBindingManager::_instance_binding_callbacks = {
  &_instance_binding_create_callback,
  &_instance_binding_free_callback,
  nullptr
};

void* KotlinBindingManager::_instance_binding_create_callback(void* p_token, void* p_instance) {
    KotlinBinding* binding = memnew(KotlinBinding);
    binding->init(reinterpret_cast<Object*>(p_instance));

    return binding;
}

void KotlinBindingManager::_instance_binding_free_callback(void* p_token, void* p_instance, void* p_binding) {
    // Called in the destructor of the Object.
    //  It's the very last action done in the destructor so assume variables local to the Object have been cleaned (including script and extension).
    // There are 2 cases, either an Object has been freed, and we have to release its reference OR it's a RefCounted and the JVM instance is already dead.

    memdelete(reinterpret_cast<KotlinBinding*>(p_binding));

    Object* object = reinterpret_cast<Object*>(p_instance);
    if (!object->is_ref_counted()) { MemoryManager::get_instance().queue_dead_object(object); }
}

KotlinBinding* KotlinBindingManager::set_instance_binding(Object* p_object) {
    // Godot being weird. Call this function only if the JVM is the creator of the object, otherwise it will crash in case the object has any other bindings.
    // If not the creator (When you want to bind an existing object to JVM), use get_instance_binding instead.

    KotlinBinding* binding = memnew(KotlinBinding);
    binding->init(p_object);

    if (p_object->is_ref_counted()) {
        reinterpret_cast<RefCounted*>(p_object)->init_ref();
        binding->test_and_set_incremented();
    }
    p_object->set_instance_binding(&GDKotlin::get_instance(), binding, &_instance_binding_callbacks);

    return binding;
}

KotlinBinding* KotlinBindingManager::get_instance_binding(Object* p_object) {
    // Godot being weird but this is how you create a binding if it doesn't exist already, otherwise just retrieve it.
    //  Use this function to bind an existing object to the JVM, the callbacks provided will handle the creation of the binding.
    KotlinBinding* binding =
      reinterpret_cast<KotlinBinding*>(p_object->get_instance_binding(&GDKotlin::get_instance(), &_instance_binding_callbacks));

    if (p_object->is_ref_counted() && !binding->test_and_set_incremented()) {
        reinterpret_cast<RefCounted*>(p_object)->reference();
    }
    return binding;
}

void KotlinBindingManager::free_binding(Object* p_ref) {
    p_ref->free_instance_binding(&GDKotlin::get_instance());
}
