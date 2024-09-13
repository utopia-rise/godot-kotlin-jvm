package godot.util

@PublishedApi
internal inline fun <reified T> isNullable(): Boolean = null is T
