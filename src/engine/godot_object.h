#ifndef GODOT_JVM_GODOT_OBJECT_H
#define GODOT_JVM_GODOT_OBJECT_H

#include "engine/utilities.h"

#include <classes/object.hpp>
#include <classes/ref_counted.hpp>
#include <variant/callable.hpp>
#include <variant/signal.hpp>
#include <variant/string_name.hpp>
#include <variant/variant.hpp>

namespace godot {

    // A raw engine object pointer, plus the operations that belong to it.
    //
    // This is deliberately *not* godot-cpp's Object: taking an `Object *` anywhere on the JVM path makes godot-cpp
    // decode it through PtrToArg<T *>::convert(), which calls get_object_instance_binding() and so builds -- and
    // permanently registers -- a C++ wrapper for an object the JVM already tracks itself. Every operation below issues
    // the engine call straight from the pointer instead, so nothing is allocated and nothing is registered.
    //
    // It stays pointer-sized and trivially copyable, and converts to and from GodotObject * implicitly, so it passes
    // through the GDExtension C boundary and godot-cpp's own raw entry points unchanged. Treat it as the pointer, not
    // as a wrapper around one: copying it copies a pointer, and destroying it does nothing.
    class RawObject {
        GodotObject* _ptr {nullptr};

    public:
        RawObject() = default;
        RawObject(GodotObject* p_ptr) : _ptr(p_ptr) {}

        operator GodotObject*() const { return _ptr; }
        _ALWAYS_INLINE_ GodotObject* ptr() const { return _ptr; }
        _ALWAYS_INLINE_ explicit operator bool() const { return _ptr != nullptr; }
        _ALWAYS_INLINE_ bool is_null() const { return _ptr == nullptr; }

        _ALWAYS_INLINE_ bool operator==(const RawObject& p_other) const { return _ptr == p_other._ptr; }
        _ALWAYS_INLINE_ bool operator!=(const RawObject& p_other) const { return _ptr != p_other._ptr; }

        // --- creation and lookup -------------------------------------------------------------------------------

        // GDExtension equivalent of the engine-internal ClassDB::instantiate().
        //
        // classdb_construct_object2() maps to ClassDB::instantiate_without_postinitialization(), and its contract in
        // gdextension_interface.h is explicit: "NOTIFICATION_POSTINITIALIZE must be sent after construction."
        // godot-cpp honours that in memnew() via Wrapped::_postinitialize(); we construct raw objects, so we send it
        // ourselves. Skipping it leaves anything that sets itself up there half-initialized -- Control subclasses
        // never build their theme item cache (control.cpp even warns to prefer NOTIFICATION_POSTINITIALIZE for theme
        // items), so the first resize of a text-drawing control such as Label or Button crashes on it.
        //
        // When migrating to classdb_construct_object3 (ClassDB::instantiate_without_postinitialization_with_refcount):
        //  - keep the notification. That variant also passes p_notify_postinitialize = false; the only thing it adds
        //    is returning RefCounted instances already at refcount 1.
        //  - drop the init_ref() call in JvmBindingManager::set_instance_binding(), which exists purely because
        //    object2 hands back a genuinely-zero refcount. Keeping both would land the object at 2 and leak it.
        // It is not reachable yet: godot-cpp's vendored gdextension_interface.h does not declare object3 at all, even
        // though the engine implements it, so there is no gdextension_interface_classdb_construct_object3 to call.
        _ALWAYS_INLINE_ static RawObject instantiate(const StringName& p_class_name) {
            RawObject object {internal::gdextension_interface_classdb_construct_object2(
              reinterpret_cast<GDExtensionConstStringNamePtr>(p_class_name._native_ptr())
            )};
            if (unlikely(object.is_null())) { return {}; }

            object.notification(Object::NOTIFICATION_POSTINITIALIZE);
            return object;
        }

        _ALWAYS_INLINE_ static RawObject from_instance_id(uint64_t p_instance_id) {
            return internal::gdextension_interface_object_get_instance_from_id(static_cast<GDObjectInstanceID>(p_instance_id));
        }

        // The first half of Variant::operator Object*(), without the wrapper it then builds.
        _ALWAYS_INLINE_ static RawObject from_variant(const Variant& p_variant) {
            GodotObject* raw_object {nullptr};
            raw_engine::object_from_variant(&raw_object, p_variant._native_ptr());
            return raw_object;
        }

        _ALWAYS_INLINE_ void destroy() const { internal::gdextension_interface_object_destroy(_ptr); }

        // --- identity ------------------------------------------------------------------------------------------

        _ALWAYS_INLINE_ uint64_t get_instance_id() const {
            return internal::gdextension_interface_object_get_instance_id(_ptr);
        }

        // An ObjectID's high bit flags a RefCounted.
        _ALWAYS_INLINE_ bool is_ref_counted() const {
            return (get_instance_id() & (uint64_t(1) << 63)) != 0;
        }

        // --- lifecycle -----------------------------------------------------------------------------------------

        _ALWAYS_INLINE_ void notification(int32_t p_what, bool p_reversed = false) const {
            int64_t what {p_what};
            int8_t reversed {static_cast<int8_t>(p_reversed)};
            internal::_call_native_mb_no_ret(raw_engine::notification_bind, _ptr, &what, &reversed);
        }

        _ALWAYS_INLINE_ void notify_property_list_changed() const {
            internal::_call_native_mb_no_ret(raw_engine::notify_property_list_changed_bind, _ptr);
        }

        _ALWAYS_INLINE_ void set_script_instance(GDExtensionScriptInstancePtr p_script_instance) const {
            internal::gdextension_interface_object_set_script_instance(_ptr, p_script_instance);
        }

        // --- refcounting ---------------------------------------------------------------------------------------
        // godot-cpp's RefCounted methods, minus the wrapper it reads `_owner` off. The GDExtension C API exposes no
        // refcount entry point at all, so the engine's own method binds are the API here, not a workaround.

        _ALWAYS_INLINE_ bool init_ref() const {
            return internal::_call_native_mb_ret<int8_t>(raw_engine::init_ref_bind, _ptr);
        }

        _ALWAYS_INLINE_ bool reference() const {
            return internal::_call_native_mb_ret<int8_t>(raw_engine::reference_bind, _ptr);
        }

        _ALWAYS_INLINE_ bool unreference() const {
            return internal::_call_native_mb_ret<int8_t>(raw_engine::unreference_bind, _ptr);
        }

        _ALWAYS_INLINE_ int32_t get_reference_count() const {
            return internal::_call_native_mb_ret<int64_t>(raw_engine::reference_count_bind, _ptr);
        }

        // Builds (and permanently registers) godot-cpp's wrapper for this object -- the very thing the rest of this
        // class exists to avoid. Only for the editor-only placeholder paths that need Object's C++ API (set_script(),
        // cast_to<Node>()); never call it on a runtime path.
        _ALWAYS_INLINE_ Object* to_wrapper() const {
            return reinterpret_cast<Object*>(internal::get_object_instance_binding(_ptr));
        }

        // --- conversions ---------------------------------------------------------------------------------------
        // godot-cpp's Variant(Object*), Signal(Object*, StringName) and Callable(Object*, StringName) only read
        // `_owner` off the wrapper, so these issue the identical engine constructors straight from the pointer. Each
        // writes over a freshly default-constructed value, which owns nothing, so there is nothing to destruct first.

        _ALWAYS_INLINE_ Variant to_variant() const {
            // These take the address of the pointer, so they need a mutable copy of it in a const method.
            GodotObject* ptr {_ptr};
            Variant variant;
            raw_engine::variant_from_object(variant._native_ptr(), &ptr);
            return variant;
        }

        _ALWAYS_INLINE_ Signal to_signal(const StringName& p_name) const {
            GodotObject* ptr {_ptr};
            Signal signal;
            internal::_call_builtin_constructor(raw_engine::signal_constructor, signal._native_ptr(), &ptr, &p_name);
            return signal;
        }

        _ALWAYS_INLINE_ Callable to_callable(const StringName& p_method) const {
            GodotObject* ptr {_ptr};
            Callable callable;
            internal::_call_builtin_constructor(raw_engine::callable_constructor, callable._native_ptr(), &ptr, &p_method);
            return callable;
        }
    };

    static_assert(sizeof(RawObject) == sizeof(GodotObject*), "RawObject must stay pointer-sized.");
    static_assert(std::is_trivially_copyable_v<RawObject>, "RawObject must stay trivially copyable.");
} // namespace godot

#endif // GODOT_JVM_GODOT_OBJECT_H
