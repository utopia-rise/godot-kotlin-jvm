package godot.tests

import godot.Node
import godot.annotation.Member
import godot.annotation.GodotScript
import godot.core.AABB
import godot.core.Basis
import godot.core.Color
import godot.core.Plane
import godot.core.Quaternion
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.Transform3D
import godot.core.Vector2
import godot.core.Vector3

@GodotScript
class CoreTypesIdentityTest : Node() {

    @Member
    var aabb = AABB(Vector3(1, 1, 1), Vector3(2, 2, 2))

    @Member
    var basis = Basis(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8))

    @Member
    var color = Color(0.1, 0.2, 0.3, 0.4)

    @Member
    var plane = Plane(1, 2, 3, 4)

    @Member
    var quaternion = Quaternion(1, 2, 3, 4)

    @Member
    var rect2 = Rect2(1.0, 2.0, 3.0, 4.0)

    @Member
    var transform3D =
        Transform3D(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8), Vector3(9, 10, 11))

    @Member
    var transform2D = Transform2D(0, 1, 2, 3, 4, 5)

    @Member
    var vector2 = Vector2(1, 2)

    @Member
    var vector3 = Vector3(1, 2, 3)

    @Member
    fun aabb(aabb: AABB) = aabb

    @Member
    fun basis(basis: Basis) = basis

    @Member
    fun color(color: Color) = color

    @Member
    fun plane(plane: Plane) = plane

    @Member
    fun quat(quaternion: Quaternion) = quaternion

    @Member
    fun rect2(rect2: Rect2) = rect2

    @Member
    fun transform(transform3D: Transform3D) = transform3D

    @Member
    fun transform2D(transform2D: Transform2D) = transform2D

    @Member
    fun vector2(vector2: Vector2) = vector2

    @Member
    fun vector3(vector3: Vector3) = vector3
}
