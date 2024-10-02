#ifndef GODOT_JVM_PACKED_VECTOR2_ARRAY_BRIDGE_H
#define GODOT_JVM_PACKED_VECTOR2_ARRAY_BRIDGE_H

#include "packed_array_bridge.h"

namespace bridges {
    PACKED_ARRAY_BRIDGE(PackedVector2ArrayBridge, Vector2, "godot.core.PackedVector2Array$Bridge") {
        PACKED_ARRAY_BRIDGE_CLASS(PackedVector2ArrayBridge, Vector2)

    // clang-format off
      INIT_JNI_BINDINGS(
          PackedArrayBridge<PackedVector2ArrayBridge, Vector2, PackedVector2ArrayBridgeQualifiedName>::initialize_jni_binding(p_env, class_loader);
      )
    // clang-format on
    };
}// namespace bridge

#endif
