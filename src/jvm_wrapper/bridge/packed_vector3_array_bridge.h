#ifndef GODOT_JVM_PACKED_VECTOR3_ARRAY_BRIDGE_H
#define GODOT_JVM_PACKED_VECTOR3_ARRAY_BRIDGE_H

#include "packed_array_bridge.h"

namespace bridges {
    PACKED_ARRAY_BRIDGE(PackedVector3ArrayBridge, Vector3, "godot.core.PackedVector3Array$Bridge") {
        PACKED_ARRAY_BRIDGE_CLASS(PackedVector3ArrayBridge, Vector3)

        // clang-format off
      INIT_JNI_BINDINGS(
          PackedArrayBridge<PackedVector3ArrayBridge, Vector3, PackedVector3ArrayBridgeQualifiedName>::initialize_jni_binding(p_env, class_loader);
      )
        // clang-format on
    };
}// namespace bridge

#endif
