package godot.tests.coretypes

import godot.Node
import godot.annotation.Member
import godot.annotation.GodotScript
import godot.core.Basis
import godot.core.Quaternion
import godot.core.Vector3

@GodotScript
class BasisTest : Node() {

    @Member
    fun getFromBasis(basis: Basis, index: Int) = basis[index]

    @Member
    fun setInBasis(basis: Basis, index: Int, vector3: Vector3): Basis {
        basis[index] = vector3
        return basis
    }

    @Member
    fun getRotationQuat(basis: Basis): Quaternion {
        return basis.getRotationQuaternion()
    }

    @Member
    fun newJvmBasis(): Basis {
        return Basis()
    }

    @Member
    fun isEqualApproxJvm(a: Basis, b: Basis): Boolean {
        return a.isEqualApprox(b)
    }
}
