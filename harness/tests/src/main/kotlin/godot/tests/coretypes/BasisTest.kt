package godot.tests.coretypes

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.Basis
import godot.core.Vector3

@RegisterClass
class BasisTest : Node() {

    @RegisterFunction
    fun get(basis: Basis, index: Int) = basis[index]

    @RegisterFunction
    fun set(basis: Basis, index: Int, vector3: Vector3): Basis {
        basis[index] = vector3
        return basis
    }
}