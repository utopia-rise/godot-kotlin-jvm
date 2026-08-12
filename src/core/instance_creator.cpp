#include "instance_creator.h"

#include <godot.hpp>

using namespace godot;

GodotObject* InstanceCreator::instantiate(const StringName& class_name) {
    return internal::gdextension_interface_classdb_construct_object2(
      reinterpret_cast<GDExtensionConstStringNamePtr>(class_name._native_ptr())
    );
}
