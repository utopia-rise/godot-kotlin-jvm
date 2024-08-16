#ifndef GODOT_JVM_PACKED_VECTOR4_ARRAY_BRIDGE_H
#define GODOT_JVM_PACKED_VECTOR4_ARRAY_BRIDGE_H

#include "packed_array_bridge.h"

namespace bridges {
    PACKED_ARRAY_BRIDGE(PackedVector4ArrayBridge, Vector4, "godot.core.PackedVector4Array$Bridge") {
        PACKED_ARRAY_BRIDGE_CLASS(PackedVector4ArrayBridge, Vector4)
    };
}


#endif //GODOT_JVM_PACKED_VECTOR4_ARRAY_BRIDGE_H
