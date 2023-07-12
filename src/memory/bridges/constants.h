#ifndef GODOT_JVM_CONSTANTS_H
#define GODOT_JVM_CONSTANTS_H

namespace bridges {
    static const char* MEMORY_BRIDGE_CLASS_NAME = "godot.core.memory.MemoryManager$MemoryBridge";

    static const char* GD_PRINT_BRIDGE_CLASS_NAME = "godot.global.GDPrint$Bridge";

    static const char* VARIANT_ARRAY_BRIDGE_CLASS_NAME = "godot.core.VariantArray$Bridge";
    static const char* DICTIONARY_BRIDGE_CLASS_NAME = "godot.core.Dictionary$Bridge";
    static const char* RID_BRIDGE_CLASS_NAME = "godot.core.RID$Bridge";
    static const char* NODE_PATH_BRIDGE_CLASS_NAME = "godot.core.NodePath$Bridge";
    static const char* STRING_NAME_BRIDGE_CLASS_NAME = "godot.core.StringName$Bridge";
    static const char* CALLABLE_BRIDGE_CLASS_NAME = "godot.core.Callable$Bridge";

    static const char* PACKED_BYTE_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PackedByteArray$Bridge";
    static const char* PACKED_COLOR_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PackedColorArray$Bridge";
    static const char* PACKED_INT_32_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PackedInt32Array$Bridge";
    static const char* PACKED_INT_64_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PackedInt64Array$Bridge";
    static const char* PACKED_FLOAT_32_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PackedFloat32Array$Bridge";
    static const char* PACKED_FLOAT_64_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PackedFloat64Array$Bridge";
    static const char* PACKED_STRING_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PackedStringArray$Bridge";
    static const char* PACKED_VECTOR2_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PackedVector2Array$Bridge";
    static const char* PACKED_VECTOR3_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PackedVector3Array$Bridge";
}// namespace bridges

#endif// GODOT_JVM_CONSTANTS_H
