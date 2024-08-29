#ifndef GODOT_JVM_PACKED_STRING_ARRAY_BRIDGE_H
#define GODOT_JVM_PACKED_STRING_ARRAY_BRIDGE_H

#include "packed_array_bridge.h"

namespace bridges {

    PACKED_ARRAY_BRIDGE(PackedStringArrayBridge, String, "godot.core.PackedStringArray$Bridge") {
        PACKED_ARRAY_BRIDGE_CLASS(PackedStringArrayBridge, String)
    };
}// namespace bridge

#endif
