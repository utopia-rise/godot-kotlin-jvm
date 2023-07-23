#ifndef GODOT_JVM_BRIDGES_MANAGER_H
#define GODOT_JVM_BRIDGES_MANAGER_H

#include "bridges/dictionary_bridge.h"
#include "bridges/gd_print_bridge.h"
#include "bridges/memory_bridge.h"
#include "bridges/node_path_bridge.h"
#include "bridges/packed_byte_array_bridge.h"
#include "bridges/packed_color_array_bridge.h"
#include "bridges/packed_float_32_array_bridge.h"
#include "bridges/packed_float_64_array_bridge.h"
#include "bridges/packed_int_32_array_bridge.h"
#include "bridges/packed_int_64_array_bridge.h"
#include "bridges/packed_string_array_bridge.h"
#include "bridges/packed_vector2_array_bridge.h"
#include "bridges/packed_vector3_array_bridge.h"
#include "bridges/rid_bridge.h"
#include "bridges/string_name_bridge.h"
#include "bridges/variant_array_bridge.h"
#include "memory/bridges/callable_bridge.h"

class BridgesManager {
    bridges::MemoryBridge* memory_bridge;

    bridges::GDPrintBridge* gd_print_bridge;

    bridges::CallableBridge* callable_bridge;
    bridges::VariantArrayBridge* variant_array_bridge;
    bridges::DictionaryBridge* dictionary_bridge;
    bridges::RidBridge* rid_bridge;
    bridges::NodePathBridge* node_path_bridge;
    bridges::StringNameBridge* string_name_bridge;

    bridges::PackedByteArrayBridge* packed_byte_array_bridge;
    bridges::PackedColorArrayBridge* packed_color_array_bridge;
    bridges::PackedInt32IntArrayBridge* packed_int_32_array_bridge;
    bridges::PackedInt64IntArrayBridge* packed_int_64_array_bridge;
    bridges::PackedFloat32ArrayBridge* packed_float_32_array_bridge;
    bridges::PackedFloat64ArrayBridge* packed_float_64_array_bridge;
    bridges::PackedStringArrayBridge* packed_string_array_bridge;
    bridges::PackedVector2ArrayBridge* packed_vector2_array_bridge;
    bridges::PackedVector3ArrayBridge* packed_vector3_array_bridge;

    BridgesManager();
    ~BridgesManager() = default;

    template<class T>
    void initialize_bridge(jni::Env& env, jni::JObject class_loader, const char* jvm_class_name, T*& fill) {
        T::initialize_class(jvm_class_name);
        jni::JClass bridge_class {env.load_class(jvm_class_name, class_loader)};
        jni::FieldId bridge_instance_field {
          bridge_class.get_static_field_id(env, "INSTANCE", vformat("L%s;", jvm_class_name).replace(".", "/").utf8().ptr())};
        jni::JObject bridge_instance {bridge_class.get_static_object_field(env, bridge_instance_field)};
        fill = new T(bridge_instance);
    }

public:
    BridgesManager(const BridgesManager&) = delete;
    static BridgesManager& get_instance();

    void initialize_bridges(jni::Env& env, jni::JObject class_loader);
    void delete_bridges();
};

#endif// GODOT_JVM_BRIDGES_MANAGER_H
