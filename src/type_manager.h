#ifndef GODOT_JVM_TYPE_MANAGER_H
#define GODOT_JVM_TYPE_MANAGER_H


#include <core/string/string_name.h>
#include <core/templates/hash_map.h>

class TypeManager {
private:
    TypeManager() = default;
    ~TypeManager() = default;

public:
    HashMap<StringName, int> JAVA_ENGINE_TYPES_CONSTRUCTORS;

    TypeManager(const TypeManager&) = delete;

    static TypeManager& get_instance();

    TypeManager& operator=(const TypeManager&) = delete;
};


#endif //GODOT_JVM_TYPE_MANAGER_H
