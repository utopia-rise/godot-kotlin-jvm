package godot.tests.runtime

import godot.annotation.Register
import godot.annotation.Script
import godot.annotation.Visible
import godot.api.Node
import godot.core.asStringName
import godot.global.GD

@Script
class LifecycleTest : Node() {
    @Visible
    var trackedNode: Node? = null

    @Visible
    var replacementWasWritable = false

    @Register
    fun captureNode(node: Node) {
        trackedNode = node
    }

    @Register
    fun isTrackedNodeValid(): Boolean = GD.isInstanceValid(trackedNode)

    @Register
    fun replaceTrackedNode(node: Node) {
        trackedNode = node
    }

    @Register
    fun markTrackedNode(label: String): Boolean {
        val node = trackedNode ?: return false
        if (!GD.isInstanceValid(node)) {
            replacementWasWritable = false
            return false
        }
        node.name = label.asStringName()
        replacementWasWritable = true
        return true
    }
}
