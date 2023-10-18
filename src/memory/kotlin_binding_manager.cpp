#include "kotlin_binding_manager.h"

#include "gd_kotlin.h"
#include "kt_binding.h"

static SpinLock spin;

GDExtensionInstanceBindingCallbacks KotlinBindingManager::_instance_binding_callbacks = {
  &_instance_binding_create_callback,
  &_instance_binding_free_callback,
  &_instance_binding_reference_callback};

void* KotlinBindingManager::_instance_binding_create_callback(void* p_token, void* p_instance) {
    Object* owner = reinterpret_cast<Object*>(p_instance);
    KotlinBinding* binding = memnew(KotlinBinding());
    binding->owner = owner;

    return reinterpret_cast<void*>(binding);
}

void KotlinBindingManager::_instance_binding_free_callback(void* p_token, void* p_instance, void* p_binding) {
    // Called in the destructor of the Object.
    //  It's the very last action done in the destructor so assume variables local to the Object have been cleaned (including script and extension).
    // There are 2 cases, either an Object has been freed, and we have to release its reference OR it's a Refcounted and the JVM instance is already dead.
    spin.lock();
    KotlinBinding* binding = reinterpret_cast<KotlinBinding*>(p_binding);
    memdelete(binding);
    spin.unlock();
}

GDExtensionBool KotlinBindingManager::_instance_binding_reference_callback(void* p_token, void* p_binding, GDExtensionBool p_reference) {
    // Called when a RefCounted is referenced or unreferenced.
    // Also called in the context of a mutex lock specific to the Object.
    KotlinBinding* binding = reinterpret_cast<KotlinBinding*>(p_binding);

    // True ==> counter increased, False ==> counter decreased
    if (p_reference) {
        binding->refcount_incremented_unsafe();
        return false;
    } else {
        return binding->refcount_decremented_unsafe();
    }
}

KotlinBinding* KotlinBindingManager::set_instance_binding(Object* p_object) {
    // Godot being weird. Call this function only if the JVM is the creator of the object, otherwise it will crash in case the object has any other bindings.
    // If not the creator (When you want to bind an existing object to JVM), use get_instance_binding instead.

    KotlinBinding* binding = memnew(KotlinBinding());
    binding->owner = p_object;

    p_object->set_instance_binding(&GDKotlin::get_instance(), binding, &_instance_binding_callbacks);

    if (p_object->is_ref_counted()) { reinterpret_cast<RefCounted*>(p_object)->init_ref(); }
    binding->set_ready();

    return binding;
}

KotlinBinding* KotlinBindingManager::get_instance_binding(Object* p_object) {
    // Godot being weird but this is how you create a binding if it doesn't exist already, otherwise just retrieve it.
    //  Use this function to bind an existing object to the JVM, the callbacks provided will handle the creation of the binding.
    KotlinBinding* binding =
      reinterpret_cast<KotlinBinding*>(p_object->get_instance_binding(&GDKotlin::get_instance(), &_instance_binding_callbacks));

    if (!binding->is_ready()) {
        if (p_object->is_ref_counted()) { reinterpret_cast<RefCounted*>(p_object)->reference(); }
        binding->set_ready();
    }

    return binding;
}

void KotlinBindingManager::bind_object(ObjectID id, KtBinding* kt_binding) {
    spin.lock();
    Object* obj {ObjectDB::get_instance(id)};
    if (!obj) {
        spin.unlock();
        return;
    }

    KotlinBinding* binding =
      reinterpret_cast<KotlinBinding*>(obj->get_instance_binding(&GDKotlin::get_instance(), &_instance_binding_callbacks));
    binding->set_kt_binding(kt_binding);
    spin.unlock();
}

void KotlinBindingManager::unbind_object(ObjectID id) {
    spin.lock();
    Object* obj {ObjectDB::get_instance(id)};
    if (!obj) {
        spin.unlock();
        return;
    }

    KotlinBinding* binding =
      reinterpret_cast<KotlinBinding*>(obj->get_instance_binding(&GDKotlin::get_instance(), &_instance_binding_callbacks));
    binding->unset_kt_binding();
    spin.unlock();
}