package godot.tests.coretypes

import godot.api.Node
import godot.annotation.GodotScript
import godot.annotation.Register
import godot.core.Vector3
import godot.common.util.RealT

@GodotScript
class Vector3Test : Node() {

    @Register
    fun getFromVector3(vector3: Vector3, index: Int) = vector3[index]

    @Register
    fun setInVector3(vector3: Vector3, index: Int, realT: RealT): Vector3 {
        vector3[index] = realT
        return vector3
    }
}
