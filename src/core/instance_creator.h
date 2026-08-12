#ifndef GODOT_JVM_INSTANCE_CREATOR_H
#define GODOT_JVM_INSTANCE_CREATOR_H

#include <classes/wrapped.hpp>
#include <variant/string_name.hpp>

namespace godot {
    // GDExtension equivalent of master's engine-internal ClassDB::instantiate().
    class InstanceCreator {
    public:
        static GodotObject* instantiate(const StringName& class_name);
    };
}

#endif // GODOT_JVM_INSTANCE_CREATOR_H
