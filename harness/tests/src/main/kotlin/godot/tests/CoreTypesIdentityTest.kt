package godot.tests

import godot.api.Node
import godot.annotation.GodotScript
import godot.annotation.Register
import godot.annotation.Visible
import godot.core.*

@GodotScript
class CoreTypesIdentityTest : Node() {

    @Visible
    var aabb = AABB(Vector3(1, 1, 1), Vector3(2, 2, 2))

    @Visible
    var basis = Basis(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8))

    @Visible
    var color = Color(0.1, 0.2, 0.3, 0.4)

    @Visible
    var plane = Plane(1, 2, 3, 4)

    @Visible
    var quaternion = Quaternion(1, 2, 3, 4)

    @Visible
    var rect2 = Rect2(1.0, 2.0, 3.0, 4.0)

    @Visible
    var transform3D =
        Transform3D(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8), Vector3(9, 10, 11))

    @Visible
    var transform2D = Transform2D(0, 1, 2, 3, 4, 5)

    @Visible
    var vector2 = Vector2(1, 2)

    @Visible
    var vector3 = Vector3(1, 2, 3)

    @Register
    fun aabb(aabb: AABB) = aabb

    @Register
    fun basis(basis: Basis) = basis

    @Register
    fun color(color: Color) = color

    @Register
    fun plane(plane: Plane) = plane

    @Register
    fun quat(quaternion: Quaternion) = quaternion

    @Register
    fun rect2(rect2: Rect2) = rect2

    @Register
    fun transform(transform3D: Transform3D) = transform3D

    @Register
    fun transform2D(transform2D: Transform2D) = transform2D

    @Register
    fun vector2(vector2: Vector2) = vector2

    @Register
    fun vector3(vector3: Vector3) = vector3
}
