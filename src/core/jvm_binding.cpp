#include "jvm/wrapper/memory/type_manager.h"
#include "jvm_binding.h"

using namespace godot;

void JvmBinding::init(Object* p_object) {
    StringName class_name {p_object->get_class_static()};
    do {
        if (!TypeManager::get_instance().java_engine_type_constructor_for_type_exists(class_name)) {
            class_name = ClassDB::get_parent_class(class_name);
        } else {
            break;
        }
    } while (class_name != StringName());
    constructor_id = TypeManager::get_instance().get_java_engine_type_constructor_index_for_type(class_name);
}

int JvmBinding::get_constructor_id() const{
    return constructor_id;
}

bool JvmBinding::test_and_set_incremented() {
    // Set to true and return the previous value.
    return is_incremented.test_and_set(std::memory_order_acq_rel);
}

