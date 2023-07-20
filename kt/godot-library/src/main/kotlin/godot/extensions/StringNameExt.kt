@file:JvmName("NodeUtils")
package godot.extensions

import godot.core.NodePath
import godot.core.StringName

@Suppress("NOTHING_TO_INLINE")
inline fun StringName.asNodePath() = NodePath(toString())
