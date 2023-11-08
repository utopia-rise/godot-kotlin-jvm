@file:JvmName("StringUtils")
package godot.extensions

import godot.core.memory.MemoryManager
import godot.core.NodePath
import godot.core.StringName

@Suppress("NOTHING_TO_INLINE")
inline fun String.asNodePath(): NodePath {
    return MemoryManager.getOrCreateNodePath(this)
}

@Suppress("NOTHING_TO_INLINE")
inline fun String.asStringName(): StringName {
    return MemoryManager.getOrCreateStringName(this)
}
