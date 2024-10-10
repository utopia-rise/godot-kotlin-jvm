@file:JvmName("PackedSceneExt")
package godot.extensions


import godot.Node
import godot.PackedScene

@Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")
inline fun <T : Node> PackedScene.instantiateAs(
    editState: PackedScene.GenEditState = PackedScene.GenEditState.GEN_EDIT_STATE_DISABLED
): T? {
    return instantiate(editState) as T?
}
