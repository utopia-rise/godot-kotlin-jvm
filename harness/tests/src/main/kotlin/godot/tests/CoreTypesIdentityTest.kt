package godot.tests

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
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
    var quaternion = Quaternion(1, 2, 3, 4)

    @RegisterProperty
    var rect2 = Rect2(1.0, 2.0, 3.0, 4.0)

    @RegisterProperty
    var transform3D =
        Transform3D(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8), Vector3(9, 10, 11))

    @RegisterProperty
    var transform2D = Transform2D(0, 1, 2, 3, 4, 5)

    @RegisterProperty
    var vector2 = Vector2(1, 2)

    @RegisterProperty
    var vector3 = Vector3(1, 2, 3)

    @RegisterFunction
    fun aabb(aabb: AABB) = aabb

    @RegisterFunction
    fun basis(basis: Basis) = basis

    @RegisterFunction
    fun color(color: Color) = color

    @RegisterFunction
    fun plane(plane: Plane) = plane

    @RegisterFunction
    fun quat(quaternion: Quaternion) = quaternion

    @RegisterFunction
    fun rect2(rect2: Rect2) = rect2

    @RegisterFunction
    fun transform(transform3D: Transform3D) = transform3D

    @RegisterFunction
    fun transform2D(transform2D: Transform2D) = transform2D

    @RegisterFunction
    fun vector2(vector2: Vector2) = vector2

    @RegisterFunction
    fun vector3(vector3: Vector3) = vector3
}
