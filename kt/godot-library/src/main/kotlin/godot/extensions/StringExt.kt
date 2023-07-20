@file:JvmName("NodeUtils")
package godot.extensions

import godot.core.NodePath

@Suppress("NOTHING_TO_INLINE")
inline fun String.asNodePath() = NodePath(this)
