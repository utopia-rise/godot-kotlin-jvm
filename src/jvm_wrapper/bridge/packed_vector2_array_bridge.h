#ifndef GODOT_JVM_PACKED_VECTOR2_ARRAY_BRIDGE_H
#define GODOT_JVM_PACKED_VECTOR2_ARRAY_BRIDGE_H

#include "packed_array_bridge.h"

namespace bridges {
    PACKED_ARRAY_BRIDGE(PackedVector2ArrayBridge, Vector2, "godot.core.PackedVector2Array$Bridge") {
        PACKED_ARRAY_BRIDGE_CLASS(PackedVector2ArrayBridge, Vector2)
    };
}// namespace bridge

#endif
