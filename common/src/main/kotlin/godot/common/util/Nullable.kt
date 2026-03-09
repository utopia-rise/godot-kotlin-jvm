package godot.common.util

inline fun <reified T> isNullable(): Boolean = null is T
