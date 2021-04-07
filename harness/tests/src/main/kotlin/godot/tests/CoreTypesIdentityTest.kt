package godot.tests

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty
import godot.core.*

@RegisterClass
class CoreTypesIdentityTest : Node() {

    @RegisterProperty
    var aabb = AABB(Vector3(1, 1, 1), Vector3(2, 2, 2))

    @RegisterProperty
    var basis = Basis(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8))

    @RegisterProperty
    var color = Color(0.1, 0.2, 0.3, 0.4)

    @RegisterProperty
    var plane = Plane(1, 2, 3, 4)

    @RegisterProperty
    var quat = Quat(1, 2, 3, 4)

    @RegisterProperty
    var rect2 = Rect2(1.0, 2.0, 3.0, 4.0)

    @RegisterProperty
    var transform =
        Transform(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8), Vector3(9, 10, 11))

    @RegisterProperty
    var transform2D = Transform2D(0, 1, 2, 3, 4, 5)

    @RegisterProperty
    var vector2 = Vector2(1, 2)

    @RegisterProperty
    var vector3 = Vector3(1, 2, 3)
}