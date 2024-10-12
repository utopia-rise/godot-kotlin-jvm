package godot.tests.coretypes

import godot.Node
import godot.annotation.GodotMember
import godot.annotation.GodotScript
import godot.core.Vector3
import godot.common.util.RealT

@GodotScript
class Vector3Test : Node() {

    @GodotMember
    fun getFromVector3(vector3: Vector3, index: Int) = vector3[index]

    @GodotMember
    fun setInVector3(vector3: Vector3, index: Int, realT: RealT): Vector3 {
        vector3[index] = realT
        return vector3
    }
}
