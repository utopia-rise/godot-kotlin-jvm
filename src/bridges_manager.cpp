#include <modules/kotlin_jvm/src/bridges/constants.h>
#include "bridges_manager.h"

BridgesManager& BridgesManager::get_instance() {
    static BridgesManager bridgesManager;
    return bridgesManager;
}

void BridgesManager::initialize_bridges(jni::Env& env, jni::JObject class_loader) {
    initialize_bridge(env, class_loader, bridges::MEMORY_BRIDGE_CLASS_NAME, memory_bridge);

    initialize_bridge(env, class_loader, bridges::VARIANT_ARRAY_BRIDGE_CLASS_NAME, variant_array_bridge);
}

BridgesManager::BridgesManager() : memory_bridge(nullptr), variant_array_bridge(nullptr) {

}

BridgesManager::~BridgesManager() {
    delete memory_bridge;
    memory_bridge = nullptr;

    delete variant_array_bridge;
    variant_array_bridge = nullptr;
}
