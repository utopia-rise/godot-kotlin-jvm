#ifndef GODOT_JVM_CONSTANTS_H
#define GODOT_JVM_CONSTANTS_H

namespace bridges {
    static const char* MEMORY_BRIDGE_CLASS_NAME = "godot.core.GarbageCollector$MemoryBridge";

    static const char* VARIANT_ARRAY_BRIDGE_CLASS_NAME = "godot.core.VariantArray$Bridge";
    static const char* DICTIONARY_BRIDGE_CLASS_NAME = "godot.core.Dictionary$Bridge";
    static const char* RID_BRIDGE_CLASS_NAME = "godot.core.RID$Bridge";
    static const char* NODE_PATH_BRIDGE_CLASS_NAME = "godot.core.NodePath$Bridge";
}

#endif //GODOT_JVM_CONSTANTS_H
