#include "jvm_binding_manager.h"

#include "engine/utilities.h"
#include "godot_jvm.h"
#include "jvm/wrapper/memory/memory_manager.h"

using namespace godot;

GDExtensionInstanceBindingCallbacks JvmBindingManager::_instance_binding_callbacks = {
  &_instance_binding_create_callback,
  &_instance_binding_free_callback,
  nullptr
};

void* JvmBindingManager::_instance_binding_create_callback(void* p_token, void* p_instance) {
    JvmBinding* binding = memnew(JvmBinding);
    binding->init(reinterpret_cast<godot::Object*>(p_instance));

    return binding;
}

void JvmBindingManager::_instance_binding_free_callback(void* p_token, void* p_instance, void* p_binding) {
    // Called in the destructor of the Object.
    //  It's the very last action done in the destructor so assume variables local to the Object have been cleaned (including script and extension).
    // There are 2 cases, either an Object has been freed, and we have to release its reference OR it's a RefCounted and the JVM instance is already dead.

    godot::memdelete(reinterpret_cast<JvmBinding*>(p_binding));

    godot::Object* object = reinterpret_cast<godot::Object*>(p_instance);
    if (!is_ref_counted(object)) { MemoryManager::get_instance().queue_dead_object(object); }
}

JvmBinding* JvmBindingManager::set_instance_binding(godot::Object* p_object) {
    // Godot being weird. Call this function only if the JVM is the creator of the object, otherwise it will crash in case the object has any other bindings.
    // If not the creator (When you want to bind an existing object to JVM), use get_instance_binding instead.

    JvmBinding* binding = memnew(JvmBinding);
    binding->init(p_object);

    if (is_ref_counted(p_object)) {
        reinterpret_cast<godot::RefCounted*>(p_object)->init_ref();
        binding->test_and_set_incremented();
    }


    internal::gdextension_interface_object_set_instance_binding(p_object,&GodotJvm::get_instance(), binding, &_instance_binding_callbacks);

    return binding;
}

JvmBinding* JvmBindingManager::get_instance_binding(godot::Object* p_object) {
    // Godot being weird but this is how you create a binding if it doesn't exist already, otherwise just retrieve it.
    //  Use this function to bind an existing object to the JVM, the callbacks provided will handle the creation of the binding.
    JvmBinding* binding =
      reinterpret_cast<JvmBinding*>(internal::gdextension_interface_object_get_instance_binding(p_object, &GodotJvm::get_instance(), &_instance_binding_callbacks));

    if (is_ref_counted(p_object) && !binding->test_and_set_incremented()) {
        reinterpret_cast<godot::RefCounted*>(p_object)->reference();
    }
    return binding;
}

void JvmBindingManager::free_binding(godot::Object* p_ref) {
    internal::gdextension_interface_object_free_instance_binding(p_ref, &GodotJvm::get_instance());
}
