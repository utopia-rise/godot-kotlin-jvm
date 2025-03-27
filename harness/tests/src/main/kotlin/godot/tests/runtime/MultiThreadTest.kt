package godot.tests.runtime

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.api.Node
import godot.core.AABB
import godot.core.Vector3

@RegisterClass
class MultiThreadTest : Node() {

    @RegisterFunction
    fun readAabb(): AABB {
        return AABB(Vector3(1, 1, 1), Vector3(2, 2, 2))
    }
}
