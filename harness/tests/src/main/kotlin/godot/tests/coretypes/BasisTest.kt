package godot.tests.coretypes

import godot.api.Node
import godot.annotation.script
import godot.annotation.Register
import godot.core.Basis
import godot.core.Quaternion
import godot.core.Vector3

@script
class BasisTest : Node() {

    @Register
    fun getFromBasis(basis: Basis, index: Int) = basis[index]

    @Register
    fun setInBasis(basis: Basis, index: Int, vector3: Vector3): Basis {
        basis[index] = vector3
        return basis
    }

    @Register
    fun getRotationQuat(basis: Basis): Quaternion {
        return basis.getRotationQuaternion()
    }

    @Register
    fun newJvmBasis(): Basis {
        return Basis()
    }

    @Register
    fun isEqualApproxJvm(a: Basis, b: Basis): Boolean {
        return a.isEqualApprox(b)
    }
}
