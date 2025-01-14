package godot.tests.coretypes

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.Vector3
import godot.common.util.RealT

@RegisterClass
class Vector3Test : Node() {

    @RegisterFunction
    fun getFromVector3(vector3: Vector3, index: Int) = vector3[index]

    @RegisterFunction
    fun setInVector3(vector3: Vector3, index: Int, realT: RealT): Vector3 {
        vector3[index] = realT
        return vector3
    }
}
