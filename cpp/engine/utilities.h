#ifndef GODOT_JVM_UTILITIES_H
#define GODOT_JVM_UTILITIES_H

#include <classes/object.hpp>
#include <classes/ref_counted.hpp>
#include <classes/wrapped.hpp>
#include <core/builtin_ptrcall.hpp>
#include <core/engine_ptrcall.hpp>
#include <core/error_macros.hpp>
#include <godot.hpp>
#include <variant/callable.hpp>
#include <variant/signal.hpp>
#include <variant/string_name.hpp>
#include <variant/variant.hpp>

// The engine's SNAME without its `p_static` flag: that flag promises the name outlives the process, which is false
// for a static inside an unloadable library and makes Godot report "Unreferenced static string" for it at exit.
#define SNAME(m_arg) ([]() -> const godot::StringName & { static godot::StringName sname = godot::StringName(m_arg); return sname; })()

// Engine entry points the JVM hot path uses, resolved once by configure() into plain globals. Function-local statics
// would cost a guard-variable check on every single call instead.
namespace raw_engine {
    inline GDExtensionMethodBindPtr init_ref_bind {nullptr};
    inline GDExtensionMethodBindPtr reference_bind {nullptr};
    inline GDExtensionMethodBindPtr unreference_bind {nullptr};
    inline GDExtensionMethodBindPtr reference_count_bind {nullptr};
    inline GDExtensionMethodBindPtr notification_bind {nullptr};
    inline GDExtensionMethodBindPtr notify_property_list_changed_bind {nullptr};
    inline GDExtensionMethodBindPtr is_class_bind {nullptr};
    inline GDExtensionMethodBindPtr call_thread_safe_bind {nullptr};
    inline GDExtensionVariantFromTypeConstructorFunc variant_from_object {nullptr};
    inline GDExtensionTypeFromVariantConstructorFunc object_from_variant {nullptr};
    inline GDExtensionPtrConstructor signal_constructor {nullptr};
    inline GDExtensionPtrConstructor callable_constructor {nullptr};

    // init_ref/reference/unreference all share the `() -> bool` signature, hence the one hash they pass in.
    inline GDExtensionMethodBindPtr ref_counted_bind(const char* p_method_name, GDExtensionInt p_hash) {
        return godot::internal::gdextension_interface_classdb_get_method_bind(
          godot::RefCounted::get_class_static()._native_ptr(),
          godot::StringName(p_method_name)._native_ptr(),
          p_hash
        );
    }

    inline void configure_core() {
        init_ref_bind = ref_counted_bind("init_ref", 2240911060);
        reference_bind = ref_counted_bind("reference", 2240911060);
        unreference_bind = ref_counted_bind("unreference", 2240911060);
        reference_count_bind = ref_counted_bind("get_reference_count", 3905245786);
        notification_bind = godot::internal::gdextension_interface_classdb_get_method_bind(
          godot::Object::get_class_static()._native_ptr(),
          godot::StringName("notification")._native_ptr(),
          4023243586
        );

        notify_property_list_changed_bind = godot::internal::gdextension_interface_classdb_get_method_bind(
          godot::Object::get_class_static()._native_ptr(),
          godot::StringName("notify_property_list_changed")._native_ptr(),
          3218959716
        );
        is_class_bind = godot::internal::gdextension_interface_classdb_get_method_bind(
          godot::Object::get_class_static()._native_ptr(),
          godot::StringName("is_class")._native_ptr(),
          3927539163
        );
        variant_from_object = godot::internal::gdextension_interface_get_variant_from_type_constructor(GDEXTENSION_VARIANT_TYPE_OBJECT);
        object_from_variant = godot::internal::gdextension_interface_get_variant_to_type_constructor(GDEXTENSION_VARIANT_TYPE_OBJECT);
        // Index 2 is the (Object, StringName) constructor of each — godot-cpp caches the same one as `constructor_2`.
        signal_constructor = godot::internal::gdextension_interface_variant_get_ptr_constructor(GDEXTENSION_VARIANT_TYPE_SIGNAL, 2);
        callable_constructor = godot::internal::gdextension_interface_variant_get_ptr_constructor(GDEXTENSION_VARIANT_TYPE_CALLABLE, 2);

        ERR_FAIL_NULL_MSG(init_ref_bind, "Failed to resolve RefCounted::init_ref.");
        ERR_FAIL_NULL_MSG(reference_bind, "Failed to resolve RefCounted::reference.");
        ERR_FAIL_NULL_MSG(unreference_bind, "Failed to resolve RefCounted::unreference.");
        ERR_FAIL_NULL_MSG(reference_count_bind, "Failed to resolve RefCounted::get_reference_count.");
        ERR_FAIL_NULL_MSG(notification_bind, "Failed to resolve Object::notification.");
        ERR_FAIL_NULL_MSG(notify_property_list_changed_bind, "Failed to resolve Object::notify_property_list_changed.");
        ERR_FAIL_NULL_MSG(is_class_bind, "Failed to resolve Object::is_class.");
        ERR_FAIL_NULL_MSG(variant_from_object, "Failed to resolve the Object-to-Variant constructor.");
        ERR_FAIL_NULL_MSG(object_from_variant, "Failed to resolve the Variant-to-Object constructor.");
        ERR_FAIL_NULL_MSG(signal_constructor, "Failed to resolve the Signal(Object, StringName) constructor.");
        ERR_FAIL_NULL_MSG(callable_constructor, "Failed to resolve the Callable(Object, StringName) constructor.");
    }

    inline void configure_scene() {
        call_thread_safe_bind = godot::internal::gdextension_interface_classdb_get_method_bind(
          godot::StringName("Node")._native_ptr(),
          godot::StringName("call_thread_safe")._native_ptr(),
          3400424181
        );
        ERR_FAIL_NULL_MSG(call_thread_safe_bind, "Failed to resolve Node::call_thread_safe.");
    }
}

#endif // GODOT_JVM_UTILITIES_H
