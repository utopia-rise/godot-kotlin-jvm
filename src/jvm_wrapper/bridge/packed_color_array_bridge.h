#ifndef GODOT_JVM_PACKED_COLOR_ARRAY_BRIDGE_H
#define GODOT_JVM_PACKED_COLOR_ARRAY_BRIDGE_H

#include "packed_array_bridge.h"

namespace bridges {
    PACKED_ARRAY_BRIDGE(PackedColorArrayBridge, Color, "godot.core.PackedColorArray$Bridge") {
        PACKED_ARRAY_BRIDGE_CLASS(PackedColorArrayBridge, Color)
    };
}// namespace bridge

#endif
