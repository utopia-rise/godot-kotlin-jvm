#include "jvm_binding_manager.h"

#include "engine/utilities.h"
#include "godot_jvm.h"
#include "jvm/wrapper/memory/memory_manager.h"

#include <core/engine_ptrcall.hpp>
#include <core/error_macros.hpp>
#include <core/object.hpp>
#include <variant/string_name.hpp>

using namespace godot;

namespace {
    // RefCounted::init_ref()/reference() (see godot-cpp's generated ref_counted.cpp) only ever use _owner internally — the wrapper object itself is never touched — so there's no need to materialize a godot-cpp wrapper here at all; call the sam...
    bool call_ref_counted_bool_method(GodotObject* p_object, GDExtensionMethodBindPtr p_method_bind) {
        CHECK_METHOD_BIND_RET(p_method_bind, false);
        return internal::_call_native_mb_ret<int8_t>(p_method_bind, p_object);
    }

    GDExtensionMethodBindPtr ref_counted_method_bind(const char* p_method_name) {
        return internal::gdextension_interface_classdb_get_method_bind(
          StringName("RefCounted")._native_ptr(),
          StringName(p_method_name)._native_ptr(),
          2240911060
        );
    }

    bool init_ref(GodotObject* p_object) {
        static GDExtensionMethodBindPtr bind = ref_counted_method_bind("init_ref");
        return call_ref_counted_bool_method(p_object, bind);
    }

    bool reference(GodotObject* p_object) {
        static GDExtensionMethodBindPtr bind = ref_counted_method_bind("reference");
        return call_ref_counted_bool_method(p_object, bind);
    }
} // namespace

GDExtensionInstanceBindingCallbacks JvmBindingManager::_instance_binding_callbacks = {
  &_instance_binding_create_callback,
  &_instance_binding_free_callback,
  nullptr
};

void* JvmBindingManager::_instance_binding_create_callback(void* p_token, void* p_instance) {
    JvmBinding* binding = memnew(JvmBinding);
    // p_instance is the raw engine object pointer. Pass it straight through — JvmBinding::init() uses only the raw GDExtension calls, precisely because we're called here while the engine still holds this object's instance-binding mutex (see Jv...
    binding->init(reinterpret_cast<GodotObject*>(p_instance));

    return binding;
}

void JvmBindingManager::_instance_binding_free_callback(void* p_token, void* p_instance, void* p_binding) {
    // Called in the destructor of the Object. It's the very last action done in the destructor so assume variables local to the Object have been cleaned (including script and extension).

    JvmBinding* binding = reinterpret_cast<JvmBinding*>(p_binding);
    // p_instance is the raw engine object pointer (possibly already mid-teardown at this point, per the comment above) — use the ObjectID cached in the binding at init() time instead of wrapping p_instance and calling get_instance_id() on it a...
    if (!binding->get_object_id().is_ref_counted()) { MemoryManager::get_instance().queue_dead_object(binding->get_object_id()); }
    godot::memdelete(binding);
}

JvmBinding* JvmBindingManager::set_instance_binding(GodotObject* p_object) {
    // Godot being weird. Call this function only if the JVM is the creator of the object, otherwise it will crash in case the object has any other bindings.

    bool is_rc = is_ref_counted(p_object);
    if (is_rc) {
        // p_object was just constructed via InstanceCreator, so its refcount is genuinely 0 here — init_ref() (not reference()) is required: reference() refuses to increment a true-zero, never-initialized count (it's meant for objects that already...
        init_ref(p_object);
    }

    // Attach via the growable get_instance_binding mechanism, not the engine's raw one-shot object_set_instance_binding: that one asserts if binding slot 0 is already occupied, which it always is once godot-cpp's own wrapper binding exists for...
    JvmBinding* binding =
      reinterpret_cast<JvmBinding*>(internal::gdextension_interface_object_get_instance_binding(p_object, &GodotJvm::get_instance(), &_instance_binding_callbacks));

    if (is_rc) { binding->test_and_set_incremented(); }

    return binding;
}

JvmBinding* JvmBindingManager::get_instance_binding(GodotObject* p_object) {
    // Godot being weird but this is how you create a binding if it doesn't exist already, otherwise just retrieve it. Use this function to bind an existing object to the JVM, the callbacks provided will handle the creation of the binding.
    JvmBinding* binding =
      reinterpret_cast<JvmBinding*>(internal::gdextension_interface_object_get_instance_binding(p_object, &GodotJvm::get_instance(), &_instance_binding_callbacks));

    if (is_ref_counted(p_object) && !binding->test_and_set_incremented()) {
        reference(p_object);
    }
    return binding;
}

void JvmBindingManager::free_binding(GodotObject* p_ref) {
    internal::gdextension_interface_object_free_instance_binding(p_ref, &GodotJvm::get_instance());
}
