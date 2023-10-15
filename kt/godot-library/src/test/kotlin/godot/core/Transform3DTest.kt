@file:Suppress("RemoveRedundantBackticks")

package godot.core

import org.junit.Test

class TestTransform3D {

    private fun createDummyTransform(): Transform3D {
        return Transform3D(Basis(Vector3(1, 2, 3), Vector3(4, 5, 6), Vector3(7, 8, 9)), Vector3(10, 11, 12))
    }

    private fun identity(): Transform3D {
        return Transform3D()
    }

    @Test
    fun `Translation`() {
        val offset = Vector3(1, 2, 3)

        // Both versions should give the same result applied to identity.
        checkTrue(identity().translated(offset) == identity().apply { translate(offset) })

        // Check both versions against left and right multiplications.
        val orig = createDummyTransform()
        val T = identity().translated(offset)
        checkTrue(orig.translated(offset) == T * orig)
        checkTrue(orig.apply { translate(offset) } == orig * T)
    }

    @Test
    fun `Scaling`() {
        val scaling = Vector3(1, 2, 3)

        // Both versions should give the same result applied to identity.
        checkTrue(identity().scaled(scaling) == identity().apply { scale(scaling) })

        // Check both versions against left and right multiplications.
        val orig = createDummyTransform()
        val S = identity().scaled(scaling)
        checkTrue(orig.scaled(scaling) == S * orig)
        checkTrue(orig.apply { scale(scaling) } == orig * S)
    }

    @Test
    fun `Rotation`() {
        val axis = Vector3(1, 2, 3).normalized()
        val phi = 1.0

        // Both versions should give the same result applied to identity.
        checkTrue(identity().rotated(axis, phi) == identity().apply { rotate(axis, phi) })

        // Check both versions against left and right multiplications.
        val orig = createDummyTransform()
        val R = identity().rotated(axis, phi)
        checkTrue(orig.rotated(axis, phi) == R * orig)
        checkTrue(orig.apply { rotate(axis, phi) } == orig * R)
    }

    @Test
    fun `Finite number checks`() {
        val y = Vector3(0, 1, 2)
        val infiniteVec = Vector3(Double.NaN, Double.NaN, Double.NaN)
        val x = Basis(y, y, y)
        val infiniteBasis = Basis(infiniteVec, infiniteVec, infiniteVec)

        checkMessage(Transform3D(x, y).isFinite()) { "Transform3D with all components finite should be finite" }

        checkFalseMessage(Transform3D(x, infiniteVec).isFinite()) { "Transform3D with one component infinite should not be finite." }
        checkFalseMessage(Transform3D(infiniteBasis, y).isFinite()) { "Transform3D with one component infinite should not be finite." }
        checkFalseMessage(Transform3D(infiniteBasis, infiniteVec).isFinite()) { "Transform3D with two components infinite should not be finite." }
    }
}

