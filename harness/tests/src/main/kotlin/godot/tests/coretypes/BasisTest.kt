package godot.tests.coretypes

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.Basis
import godot.core.Quaternion
import godot.core.Vector3

@RegisterClass
class BasisTest : Node() {

    @RegisterFunction
    fun getFromBasis(basis: Basis, index: Int) = basis[index]

    @RegisterFunction
    fun setInBasis(basis: Basis, index: Int, vector3: Vector3): Basis {
        basis[index] = vector3
        return basis
    }

    @RegisterFunction
    fun getRotationQuat(basis: Basis): Quaternion {
        return basis.getRotationQuat()
    }

    @RegisterFunction
    fun newJvmBasis(): Basis {
        return Basis()
    }

    @RegisterFunction
    fun isEqualApproxJvm(a: Basis, b: Basis): Boolean {
        return a.isEqualApprox(b)
    }
}
