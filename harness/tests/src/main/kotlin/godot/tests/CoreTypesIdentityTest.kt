package godot.tests

import godot.Node
import godot.annotation.GodotMember
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

    @GodotMember
    var aabb = AABB(Vector3(1, 1, 1), Vector3(2, 2, 2))

    @GodotMember
    var basis = Basis(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8))

    @GodotMember
    var color = Color(0.1, 0.2, 0.3, 0.4)

    @GodotMember
    var plane = Plane(1, 2, 3, 4)

    @GodotMember
    var quaternion = Quaternion(1, 2, 3, 4)

    @GodotMember
    var rect2 = Rect2(1.0, 2.0, 3.0, 4.0)

    @GodotMember
    var transform3D =
        Transform3D(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8), Vector3(9, 10, 11))

    @GodotMember
    var transform2D = Transform2D(0, 1, 2, 3, 4, 5)

    @GodotMember
    var vector2 = Vector2(1, 2)

    @GodotMember
    var vector3 = Vector3(1, 2, 3)

    @GodotMember
    fun aabb(aabb: AABB) = aabb

    @GodotMember
    fun basis(basis: Basis) = basis

    @GodotMember
    fun color(color: Color) = color

    @GodotMember
    fun plane(plane: Plane) = plane

    @GodotMember
    fun quat(quaternion: Quaternion) = quaternion

    @GodotMember
    fun rect2(rect2: Rect2) = rect2

    @GodotMember
    fun transform(transform3D: Transform3D) = transform3D

    @GodotMember
    fun transform2D(transform2D: Transform2D) = transform2D

    @GodotMember
    fun vector2(vector2: Vector2) = vector2

    @GodotMember
    fun vector3(vector3: Vector3) = vector3
}
