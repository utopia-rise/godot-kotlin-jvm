#ifndef GODOT_JVM_PACKED_VECTOR4_ARRAY_BRIDGE_H
#define GODOT_JVM_PACKED_VECTOR4_ARRAY_BRIDGE_H

#include "packed_array_bridge.h"

namespace bridges {
    PACKED_ARRAY_BRIDGE(PackedVector4ArrayBridge, Vector4, "godot.core.PackedVector4Array$Bridge") {
        PACKED_ARRAY_BRIDGE_CLASS(PackedVector4ArrayBridge, Vector4)

        // clang-format off
      INIT_JNI_BINDINGS(
          PackedArrayBridge<PackedVector4ArrayBridge, Vector4, PackedVector4ArrayBridgeQualifiedName>::initialize_jni_binding(p_env, class_loader);
      )
        // clang-format on
    };
}

#endif //GODOT_JVM_PACKED_VECTOR4_ARRAY_BRIDGE_H
