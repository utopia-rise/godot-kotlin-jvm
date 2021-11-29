package godot.extensions

import godot.Node
import godot.PackedScene

@Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")
inline fun <T : Node> PackedScene.instanceAs(editState: Long = 0): T? {
    return instance(editState) as T?
}
