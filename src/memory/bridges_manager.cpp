#include "bridges_manager.h"

#include "bridges/constants.h"

BridgesManager& BridgesManager::get_instance() {
    static BridgesManager bridgesManager;
    return bridgesManager;
}

void BridgesManager::initialize_bridges(jni::Env& env, jni::JObject class_loader) {
    initialize_bridge(env, class_loader, bridges::MEMORY_BRIDGE_CLASS_NAME, memory_bridge);

    initialize_bridge(env, class_loader, bridges::GD_PRINT_BRIDGE_CLASS_NAME, gd_print_bridge);

    initialize_bridge(env, class_loader, bridges::CALLABLE_BRIDGE_CLASS_NAME, callable_bridge);
    initialize_bridge(env, class_loader, bridges::VARIANT_ARRAY_BRIDGE_CLASS_NAME, variant_array_bridge);
    initialize_bridge(env, class_loader, bridges::DICTIONARY_BRIDGE_CLASS_NAME, dictionary_bridge);
    initialize_bridge(env, class_loader, bridges::RID_BRIDGE_CLASS_NAME, rid_bridge);
    initialize_bridge(env, class_loader, bridges::STRING_NAME_BRIDGE_CLASS_NAME, string_name_bridge);
    initialize_bridge(env, class_loader, bridges::NODE_PATH_BRIDGE_CLASS_NAME, node_path_bridge);

    initialize_bridge(env, class_loader, bridges::PACKED_BYTE_ARRAY_BRIDGE_CLASS_NAME, packed_byte_array_bridge);
    initialize_bridge(env, class_loader, bridges::PACKED_COLOR_ARRAY_BRIDGE_CLASS_NAME, packed_color_array_bridge);
    initialize_bridge(env, class_loader, bridges::PACKED_INT_32_ARRAY_BRIDGE_CLASS_NAME, packed_int_32_array_bridge);
    initialize_bridge(env, class_loader, bridges::PACKED_INT_64_ARRAY_BRIDGE_CLASS_NAME, packed_int_64_array_bridge);
    initialize_bridge(env, class_loader, bridges::PACKED_FLOAT_32_ARRAY_BRIDGE_CLASS_NAME, packed_float_32_array_bridge);
    initialize_bridge(env, class_loader, bridges::PACKED_FLOAT_64_ARRAY_BRIDGE_CLASS_NAME, packed_float_64_array_bridge);
    initialize_bridge(env, class_loader, bridges::PACKED_STRING_ARRAY_BRIDGE_CLASS_NAME, packed_string_array_bridge);
    initialize_bridge(env, class_loader, bridges::PACKED_VECTOR2_ARRAY_BRIDGE_CLASS_NAME, packed_vector2_array_bridge);
    initialize_bridge(env, class_loader, bridges::PACKED_VECTOR3_ARRAY_BRIDGE_CLASS_NAME, packed_vector3_array_bridge);
}

BridgesManager::BridgesManager() :
  memory_bridge(nullptr),
  gd_print_bridge(nullptr),
  callable_bridge(nullptr),
  variant_array_bridge(nullptr),
  dictionary_bridge(nullptr),
  rid_bridge(nullptr),
  node_path_bridge(nullptr),
  string_name_bridge(nullptr),
  packed_byte_array_bridge(nullptr),
  packed_color_array_bridge(nullptr),
  packed_int_32_array_bridge(nullptr),
  packed_int_64_array_bridge(nullptr),
  packed_float_32_array_bridge(nullptr),
  packed_float_64_array_bridge(nullptr),
  packed_string_array_bridge(nullptr),
  packed_vector2_array_bridge(nullptr),
  packed_vector3_array_bridge(nullptr) {}

void BridgesManager::delete_bridges() {
    delete memory_bridge;
    memory_bridge = nullptr;

    delete gd_print_bridge;
    gd_print_bridge = nullptr;

    delete callable_bridge;
    callable_bridge = nullptr;

    delete variant_array_bridge;
    variant_array_bridge = nullptr;

    delete dictionary_bridge;
    dictionary_bridge = nullptr;

    delete rid_bridge;
    rid_bridge = nullptr;

    delete node_path_bridge;
    node_path_bridge = nullptr;

    delete node_path_bridge;
    node_path_bridge = nullptr;

    delete packed_byte_array_bridge;
    packed_byte_array_bridge = nullptr;

    delete packed_color_array_bridge;
    packed_color_array_bridge = nullptr;

    delete packed_int_32_array_bridge;
    packed_int_32_array_bridge = nullptr;

    delete packed_int_64_array_bridge;
    packed_int_64_array_bridge = nullptr;

    delete packed_float_32_array_bridge;
    packed_float_32_array_bridge = nullptr;

    delete packed_float_64_array_bridge;
    packed_float_64_array_bridge = nullptr;

    delete packed_string_array_bridge;
    packed_string_array_bridge = nullptr;

    delete packed_vector2_array_bridge;
    packed_vector2_array_bridge = nullptr;

    delete packed_vector3_array_bridge;
    packed_vector3_array_bridge = nullptr;
}
