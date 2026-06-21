package godot.tests.registration

import godot.annotation.Script
import godot.annotation.Register
import godot.annotation.Visible
import godot.api.Node
import godot.api.Object
import godot.api.RefCounted
import godot.global.GD

@Script
class ObjectInstance : Object()

@Script
class RefCountedInstance : RefCounted()

@Script
class NodeInstance : Node() {
    @Visible
    var trackedNode: Node? = null

    @Register
    fun captureNode(node: Node) {
        trackedNode = node
    }

    @Register
    fun isTrackedNodeValid(): Boolean = GD.isInstanceValid(trackedNode)
}

