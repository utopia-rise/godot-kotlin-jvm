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

    // Call once from the extension initializer, like VariantAllocator::configure(). Validates every pointer here so
    // nothing below has to re-check on the hot path; a null means the engine's ABI moved.
    inline void configure() {
        init_ref_bind = ref_counted_bind("init_ref", 2240911060);
        reference_bind = ref_counted_bind("reference", 2240911060);
        unreference_bind = ref_counted_bind("unreference", 2240911060);
        reference_count_bind = ref_counted_bind("get_reference_count", 3905245786);
        notification_bind = godot::internal::gdextension_interface_classdb_get_method_bind(
          godot::Object::get_class_static()._native_ptr(),
          godot::StringName("notification")._native_ptr(),
          4023243586
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
        ERR_FAIL_NULL_MSG(variant_from_object, "Failed to resolve the Object-to-Variant constructor.");
        ERR_FAIL_NULL_MSG(object_from_variant, "Failed to resolve the Variant-to-Object constructor.");
        ERR_FAIL_NULL_MSG(signal_constructor, "Failed to resolve the Signal(Object, StringName) constructor.");
        ERR_FAIL_NULL_MSG(callable_constructor, "Failed to resolve the Callable(Object, StringName) constructor.");
    }
}

// An ObjectID's high bit flags a RefCounted. Raw pointer only on purpose: an `Object*` overload would let a Variant
// convert implicitly and silently attach a godot-cpp instance binding.
_ALWAYS_INLINE_ bool is_ref_counted(godot::GodotObject* p_object) {
    return (godot::internal::gdextension_interface_object_get_instance_id(p_object) & (uint64_t(1) << 63)) != 0;
}

// godot-cpp's RefCounted methods, minus the wrapper it reads `_owner` off. The GDExtension C API exposes no refcount
// entry point at all, so the engine's own method binds are the API here, not a workaround.
namespace raw_ref_counted {
    _ALWAYS_INLINE_ bool init_ref(godot::GodotObject* p_object) {
        return godot::internal::_call_native_mb_ret<int8_t>(raw_engine::init_ref_bind, p_object);
    }

    _ALWAYS_INLINE_ bool reference(godot::GodotObject* p_object) {
        return godot::internal::_call_native_mb_ret<int8_t>(raw_engine::reference_bind, p_object);
    }

    _ALWAYS_INLINE_ bool unreference(godot::GodotObject* p_object) {
        return godot::internal::_call_native_mb_ret<int8_t>(raw_engine::unreference_bind, p_object);
    }

    _ALWAYS_INLINE_ int32_t get_reference_count(godot::GodotObject* p_object) {
        return godot::internal::_call_native_mb_ret<int64_t>(raw_engine::reference_count_bind, p_object);
    }
}

// The engine creates objects unpostinitialized (see InstanceCreator::instantiate) and expects whoever
// constructed them to deliver NOTIFICATION_POSTINITIALIZE, which is what godot-cpp's memnew() does via
// Wrapped::_postinitialize(). Issued from the raw pointer here for the same reason as the refcount calls
// above: taking an Object* would attach a godot-cpp instance binding we do not want.
namespace raw_object {
    _ALWAYS_INLINE_ void notification(godot::GodotObject* p_object, int32_t p_what, bool p_reversed = false) {
        int64_t what {p_what};
        int8_t reversed {static_cast<int8_t>(p_reversed)};
        godot::internal::_call_native_mb_no_ret(raw_engine::notification_bind, p_object, &what, &reversed);
    }
}

// godot-cpp's Variant(Object*), Signal(Object*, StringName) and Callable(Object*, StringName) only read `_owner` off
// the wrapper, so these issue the identical engine constructors straight from the raw pointer. Each writes over a
// freshly default-constructed value, which owns nothing, so there is nothing to destruct first.
_ALWAYS_INLINE_ godot::Variant make_object_variant(godot::GodotObject* p_object) {
    godot::Variant variant;
    raw_engine::variant_from_object(variant._native_ptr(), &p_object);
    return variant;
}

_ALWAYS_INLINE_ godot::Signal make_signal(godot::GodotObject* p_object, const godot::StringName& p_name) {
    godot::Signal signal;
    godot::internal::_call_builtin_constructor(raw_engine::signal_constructor, signal._native_ptr(), &p_object, &p_name);
    return signal;
}

_ALWAYS_INLINE_ godot::Callable make_callable(godot::GodotObject* p_object, const godot::StringName& p_method) {
    godot::Callable callable;
    godot::internal::_call_builtin_constructor(raw_engine::callable_constructor, callable._native_ptr(), &p_object, &p_method);
    return callable;
}

// The first half of Variant::operator Object*(), without the wrapper it then builds. Never declare an `Object*`
// parameter on the JVM path: that operator is a godot-cpp member, so it can only be avoided, never replaced.
_ALWAYS_INLINE_ godot::GodotObject* variant_to_raw_object(const godot::Variant& p_variant) {
    godot::GodotObject* raw_object {nullptr};
    raw_engine::object_from_variant(&raw_object, p_variant._native_ptr());
    return raw_object;
}

#endif // GODOT_JVM_UTILITIES_H
