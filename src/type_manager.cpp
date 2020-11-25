#include "type_manager.h"

TypeManager& TypeManager::get_instance() {
    static TypeManager instance;
    return instance;
}
