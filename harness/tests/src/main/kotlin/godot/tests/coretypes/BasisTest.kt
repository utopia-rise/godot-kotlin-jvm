package godot.tests.coretypes

import godot.Node
import godot.annotation.GodotMember
import godot.annotation.GodotScript
import godot.core.Basis
import godot.core.Quaternion
import godot.core.Vector3

@GodotScript
class BasisTest : Node() {

    @GodotMember
    fun getFromBasis(basis: Basis, index: Int) = basis[index]

    @GodotMember
    fun setInBasis(basis: Basis, index: Int, vector3: Vector3): Basis {
        basis[index] = vector3
        return basis
    }

    @GodotMember
    fun getRotationQuat(basis: Basis): Quaternion {
        return basis.getRotationQuaternion()
    }

    @GodotMember
    fun newJvmBasis(): Basis {
        return Basis()
    }

    @GodotMember
    fun isEqualApproxJvm(a: Basis, b: Basis): Boolean {
        return a.isEqualApprox(b)
    }
}
