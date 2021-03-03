#ifndef GODOT_JVM_CONSTANTS_H
#define GODOT_JVM_CONSTANTS_H

namespace bridges {
    static const char* MEMORY_BRIDGE_CLASS_NAME = "godot.core.GarbageCollector$MemoryBridge";

    static const char* GD_PRINT_BRIDGE_CLASS_NAME = "godot.global.GDPrint$Bridge";

    static const char* VARIANT_ARRAY_BRIDGE_CLASS_NAME = "godot.core.VariantArray$Bridge";
    static const char* DICTIONARY_BRIDGE_CLASS_NAME = "godot.core.Dictionary$Bridge";
    static const char* RID_BRIDGE_CLASS_NAME = "godot.core.RID$Bridge";
    static const char* NODE_PATH_BRIDGE_CLASS_NAME = "godot.core.NodePath$Bridge";

    static const char* POOL_BYTE_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PoolByteArray$Bridge";
    static const char* POOL_COLOR_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PoolColorArray$Bridge";
    static const char* POOL_INT_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PoolIntArray$Bridge";
    static const char* POOL_REAL_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PoolRealArray$Bridge";
    static const char* POOL_STRING_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PoolStringArray$Bridge";
    static const char* POOL_VECTOR2_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PoolVector2Array$Bridge";
    static const char* POOL_VECTOR3_ARRAY_BRIDGE_CLASS_NAME = "godot.core.PoolVector3Array$Bridge";
}

#endif //GODOT_JVM_CONSTANTS_H
