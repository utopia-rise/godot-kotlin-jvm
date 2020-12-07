#include <modules/kotlin_jvm/src/bridges/constants.h>
#include "bridges_manager.h"

BridgesManager& BridgesManager::get_instance() {
    static BridgesManager bridgesManager;
    return bridgesManager;
}

void BridgesManager::initialize_bridges(jni::Env& env, jni::JObject class_loader) {
    initialize_bridge(env, class_loader, bridges::MEMORY_BRIDGE_CLASS_NAME, memory_bridge);

    initialize_bridge(env, class_loader, bridges::VARIANT_ARRAY_BRIDGE_CLASS_NAME, variant_array_bridge);
    initialize_bridge(env, class_loader, bridges::DICTIONARY_BRIDGE_CLASS_NAME, dictionary_bridge);
    initialize_bridge(env, class_loader, bridges::RID_BRIDGE_CLASS_NAME, rid_bridge);
    initialize_bridge(env, class_loader, bridges::NODE_PATH_BRIDGE_CLASS_NAME, node_path_bridge);
}

BridgesManager::BridgesManager() : memory_bridge(nullptr), variant_array_bridge(nullptr), dictionary_bridge(nullptr),
                                   rid_bridge(nullptr), node_path_bridge(nullptr) {

}

BridgesManager::~BridgesManager() {
    delete memory_bridge;
    memory_bridge = nullptr;

    delete variant_array_bridge;
    variant_array_bridge = nullptr;

    delete rid_bridge;
    rid_bridge = nullptr;
}
