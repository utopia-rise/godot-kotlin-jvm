package godot.tests.coretypes

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.Basis
import godot.core.Quat
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

    @RegisterFunction
    fun getRotationQuat(basis: Basis): Quat {
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
