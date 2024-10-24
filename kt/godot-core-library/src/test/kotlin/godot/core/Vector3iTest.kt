@file:Suppress("RemoveRedundantBackticks", "FloatingPointLiteralPrecision")

package godot.core

import godot.common.util.isEqualApprox
import org.junit.Test

private const val SQRT3 = 1.7320508075688772935274463415059

class TestVector3i {

    @Test
    fun `Constructor methods`() {
        val vectorEmpty = Vector3i()
        val vectorZero = Vector3i(0, 0, 0)
        checkMessage(vectorEmpty == vectorZero) { "Vector3i Constructor with no inputs should return a zero Vector3i." }
    }

    @Test
    fun `Axis methods`() {
        val vector = Vector3i(1, 2, 3)
        checkMessage(vector.maxAxis() == Vector3i.Axis.Z) { "Vector3i maxAxisIndex should work as expected." }
        checkMessage(vector.minAxis() == Vector3i.Axis.X) { "Vector3i minAxisIndex should work as expected." }
        checkMessage(vector[vector.maxAxis()] == 3) { "Vector3i array operator should work as expected." }
        checkMessage(vector[vector.minAxis()] == 1) { "Vector3i array operator should work as expected." }

        vector[Vector3i.Axis.Y] = 5
        checkMessage(vector[Vector3i.Axis.Y] == 5) { "Vector3i array operator setter should work as expected." }
    }

    @Test
    fun `Clamp`() {
        val vector = Vector3i(10, 10, 10)
        val result1 = Vector3i(-5, 5, 15).clamp(Vector3i(), vector)
        checkMessage(result1 == Vector3i(0, 5, 10)) { "Vector3i clamp should work as expected." }

        val result2 = vector.clamp(Vector3i(0, 10, 15), Vector3i(5, 10, 20))
        checkMessage(result2 == Vector3i(5, 10, 15)) { "Vector3i clamp should work as expected." }
    }

    @Test
    fun `Length methods`() {
        val vector1 = Vector3i(10, 10, 10)
        val vector2 = Vector3i(20, 30, 40)

        checkMessage(vector1.lengthSquared() == 300.0) { "Vector3i lengthSquared should work as expected and return exact result." }
        checkMessage(vector1.length().isEqualApprox(10 * SQRT3)) { "Vector3i length should work as expected." }

        checkMessage(vector2.lengthSquared() == 2900.0) { "Vector3i lengthSquared should work as expected and return exact result." }
        checkMessage(vector2.length().isEqualApprox(53.8516480713450403125)) { "Vector3i length should work as expected." }
    }

    @Test
    fun `Operators`() {
        val vector1 = Vector3i(4, 5, 9)
        val vector2 = Vector3i(1, 2, 3)

        checkMessage((vector1 + vector2) == Vector3i(5, 7, 12)) { "Vector3i addition with integers should give exact results." }
        checkMessage((vector1 - vector2) == Vector3i(3, 3, 6)) { "Vector3i subtraction with integers should give exact results." }
        checkMessage((vector1 * vector2) == Vector3i(4, 10, 27)) { "Vector3i multiplication with integers should give exact results." }
        checkMessage((vector1 / vector2) == Vector3i(4, 2, 3)) { "Vector3i division with integers should give exact results." }

        checkMessage((vector1 * 2) == Vector3i(8, 10, 18)) { "Vector3i multiplication with integers should give exact results." }
        checkMessage((vector1 / 2) == Vector3i(2, 2, 4)) { "Vector3i division with integers should give exact results." }

        checkMessage(vector1.toVector3() == Vector3(4.0, 5.0, 9.0)) { "Vector3i cast to Vector3 should work as expected." }
        checkMessage(vector2.toVector3() == Vector3(1.0, 2.0, 3.0)) { "Vector3i cast to Vector3 should work as expected." }
        checkMessage(Vector3i(Vector3(1.1, 2.9, 3.9)) == Vector3i(1, 2, 3)) { "Vector3i constructed from Vector3 should work as expected." }
    }

    @Test
    fun ` Other methods`() {
        val vector = Vector3i(1, 3, -7)
        val gridVector = Vector3i(4, 2, 5)

        checkMessage(vector.snapped(gridVector) == Vector3i(0, 4, -5)) { "Vector3i snapped should work as expected." }
    }

    @Test
    fun `Abs and Sign methods`() {
        val vector1 = Vector3i(1, 3, 5)
        val vector2 = Vector3i(1, -3, -5)

        checkMessage(vector1.abs() == vector1) { "Vector3i abs should work as expected." }
        checkMessage(vector2.abs() == vector1) { "Vector3i abs should work as expected." }

        checkMessage(vector1.sign() == Vector3i(1, 1, 1)) { "Vector3i sign should work as expected." }
        checkMessage(vector2.sign() == Vector3i(1, -1, -1)) { "Vector3i sign should work as expected." }
    }
}

