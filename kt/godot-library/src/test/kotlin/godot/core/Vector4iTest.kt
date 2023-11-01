@file:Suppress("RemoveRedundantBackticks")

package godot.core

import godot.util.isEqualApprox
import org.junit.Test

class TestVector4i {

    @Test
    fun `Constructor methods`() {
        val vectorEmpty = Vector4i()
        val vectorZero = Vector4i(0, 0, 0, 0)
        checkMessage(vectorEmpty == vectorZero) { "Vector4i Constructor with no inputs should return a zero Vector4i." }
    }

    @Test
    fun `Axis methods`() {
        val vector = Vector4i(1, 2, 3, 4)
        checkMessage(vector.maxAxis() == Vector4i.Axis.W) { "Vector4i maxAxisIndex should work as expected." }
        checkMessage(vector.minAxis() == Vector4i.Axis.X) { "Vector4i minAxisIndex should work as expected." }
        checkMessage(vector[vector.maxAxis()] == 4) { "Vector4i array operator should work as expected." }
        checkMessage(vector[vector.minAxis()] == 1) { "Vector4i array operator should work as expected." }

        vector[Vector4i.Axis.Y] = 5
        checkMessage(vector[Vector4i.Axis.Y] == 5) { "Vector4i array operator setter should work as expected." }
    }

    @Test
    fun `Clamp method`() {
        val vector = Vector4i(10, 10, 10, 10)
        checkMessage(Vector4i(-5, 5, 15, Int.MAX_VALUE).clamp(Vector4i(), vector) == Vector4i(0, 5, 10, 10)) { "Vector4i clamp should work as expected." }
        checkMessage(vector.clamp(Vector4i(0, 10, 15, -10), Vector4i(5, 10, 20, -5)) == Vector4i(5, 10, 15, -5)) { "Vector4i clamp should work as expected." }
    }

    @Test
    fun `Length methods`() {
        val vector1 = Vector4i(10, 10, 10, 10)
        val vector2 = Vector4i(20, 30, 40, 50)
        checkMessage(vector1.lengthSquared() == 400) { "Vector4i lengthSquared should work as expected and return exact result." }
        checkMessage(vector1.length().isEqualApprox(20.0)) { "Vector4i length  should work as expected and return exact result." }
        checkMessage(vector2.lengthSquared() == 5400) { "Vector4i length_squared  should work as expected and return exact result." }
        checkMessage(vector2.length().isEqualApprox(73.4846922835)) { "Vector4i length  should work as expected and return exact result." }
    }

    @Test
    fun `Operators`() {
        val vector1 = Vector4i(4, 5, 9, 2)
        val vector2 = Vector4i(1, 2, 3, 4)
        checkMessage(-vector1 == Vector4i(-4, -5, -9, -2)) { "Vector4i change of sign should work as expected." }
        checkMessage((vector1 + vector2) == Vector4i(5, 7, 12, 6)) { "Vector4i addition with integers should give exact results." }
        checkMessage((vector1 - vector2) == Vector4i(3, 3, 6, -2)) { "Vector4i subtraction with integers should give exact results." }
        checkMessage((vector1 * vector2) == Vector4i(4, 10, 27, 8)) { "Vector4i multiplication with integers should give exact results." }
        checkMessage((vector1 / vector2) == Vector4i(4, 2, 3, 0)) { "Vector4i division with integers should give exact results." }
        checkMessage((vector1 * 2) == Vector4i(8, 10, 18, 4)) { "Vector4i multiplication with integers should give exact results." }
        checkMessage((vector1 / 2) == Vector4i(2, 2, 4, 1)) { "Vector4i division with integers should give exact results." }
        checkMessage(Vector4(vector1) == Vector4(4, 5, 9, 2)) { "Vector4i cast to Vector4 should work as expected." }
        checkMessage(Vector4(vector2) == Vector4(1, 2, 3, 4)) { "Vector4i cast to Vector4 should work as expected." }
        checkMessage(
            Vector4i(Vector4(1.1, 2.9, 3.9, 100.5)) == Vector4i(1.1, 2.9, 3.9, 100.5)
        ) { "Vector4i constructed from Vector4 should work as expected." }
    }

    @Test
    fun `Other methods`() {
        val vector = Vector4i(1, 3, -7, 13)
        checkMessage(vector.snapped(Vector4i(4, 2, 5, 8)) == Vector4i(0, 4, -5, 16)) { "Vector4i snapped should work as expected." }
    }

    @Test
    fun `Abs and Sign methods`() {
        val vector1 = Vector4i(1, 3, 5, 7)
        val vector2 = Vector4i(1, -3, -5, 7)
        checkMessage(vector1.abs() == vector1) { "Vector4i abs should work as expected." }
        checkMessage(vector2.abs() == vector1) { "Vector4i abs should work as expected." }
        checkMessage(vector1.sign() == Vector4i(1, 1, 1, 1)) { "Vector4i sign should work as expected." }
        checkMessage(vector2.sign() == Vector4i(1, -1, -1, 1)) { "Vector4i sign should work as expected." }
    }
}
