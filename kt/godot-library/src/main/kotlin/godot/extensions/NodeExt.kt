package godot.extensions

import godot.Node
import godot.core.NodePath

@Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")
inline fun <T : Node> Node.getNodeAs(path: String) = getNode(NodePath(path)) as T?

@Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")
inline fun <T : Node> Node.getNodeAs(nodePath: NodePath) = getNode(nodePath) as T?
