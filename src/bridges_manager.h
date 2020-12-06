#ifndef GODOT_JVM_BRIDGES_MANAGER_H
#define GODOT_JVM_BRIDGES_MANAGER_H


#include <modules/kotlin_jvm/src/bridges/memory_bridge.h>
#include <modules/kotlin_jvm/src/bridges/variant_array_bridge.h>
#include <core/variant.h>
#include <modules/kotlin_jvm/src/bridges/dictionary_bridge.h>
#include <modules/kotlin_jvm/src/bridges/rid_bridge.h>

class BridgesManager {
private:
    bridges::MemoryBridge* memory_bridge;

    bridges::VariantArrayBridge* variant_array_bridge;
    bridges::DictionaryBridge* dictionary_bridge;
    bridges::RidBridge* rid_bridge;

    BridgesManager();
    ~BridgesManager();

    template<class T>
    void initialize_bridge(jni::Env& env, jni::JObject class_loader, const char* jvm_class_name, T*& fill) {
        jni::JClass bridge_class{env.load_class(jvm_class_name, class_loader)};
        jni::FieldId bridge_instance_field{
                bridge_class.get_static_field_id(env, "INSTANCE", vformat("L%s;", jvm_class_name).replace(".", "/").utf8().ptr())
        };
        jni::JObject bridge_instance{
                bridge_class.get_static_object_field(env, bridge_instance_field)
        };
        fill = new T(bridge_instance, class_loader);
    }

public:
    BridgesManager(const BridgesManager&) = delete;
    static BridgesManager& get_instance();

    void initialize_bridges(jni::Env& env, jni::JObject class_loader);
};


#endif //GODOT_JVM_BRIDGES_MANAGER_H
