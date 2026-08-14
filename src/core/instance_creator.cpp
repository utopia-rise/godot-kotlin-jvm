#include "instance_creator.h"

#include "engine/utilities.h"

#include <godot.hpp>

using namespace godot;

GodotObject* InstanceCreator::instantiate(const StringName& class_name) {
    // classdb_construct_object2() maps to ClassDB::instantiate_without_postinitialization(), and its contract in
    // gdextension_interface.h is explicit: "NOTIFICATION_POSTINITIALIZE must be sent after construction." godot-cpp
    // honours that in memnew() via Wrapped::_postinitialize(); we construct raw objects instead, so we have to send it
    // ourselves. Skipping it leaves anything that sets itself up there half-initialized -- Control subclasses never
    // build their theme item cache (control.cpp even warns to prefer NOTIFICATION_POSTINITIALIZE for theme items), so
    // the first resize of a text-drawing control such as Label or Button dereferences that cache and crashes.
    GodotObject* object {internal::gdextension_interface_classdb_construct_object2(
      reinterpret_cast<GDExtensionConstStringNamePtr>(class_name._native_ptr())
    )};
    if (unlikely(!object)) { return nullptr; }

    // When migrating to classdb_construct_object3 (ClassDB::instantiate_without_postinitialization_with_refcount):
    //  - keep this notification. That variant also passes p_notify_postinitialize = false; the only thing it adds is
    //    returning RefCounted instances already at refcount 1.
    //  - drop the raw_ref_counted::init_ref() call in JvmBindingManager::set_instance_binding(), which exists purely
    //    because object2 hands back a genuinely-zero refcount. Keeping both would land the object at 2 and leak it.
    // It is not reachable yet: godot-cpp's vendored gdextension_interface.h does not declare object3 at all, even
    // though the engine implements it, so there is no gdextension_interface_classdb_construct_object3 to call.
    raw_object::notification(object, Object::NOTIFICATION_POSTINITIALIZE);
    return object;
}
