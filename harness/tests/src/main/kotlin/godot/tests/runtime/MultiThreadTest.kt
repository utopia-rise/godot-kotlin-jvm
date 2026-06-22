package godot.tests.runtime

import godot.annotation.Script
import godot.annotation.Register
import godot.api.Node
import godot.core.AABB
import godot.core.Vector3

@Script
class MultiThreadTest : Node() {

    @Register
    fun readAabb(): AABB {
        return AABB(Vector3(1, 1, 1), Vector3(2, 2, 2))
    }
}

