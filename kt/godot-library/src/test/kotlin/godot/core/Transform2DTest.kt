@file:Suppress("RemoveRedundantBackticks")

package godot.core

import godot.util.SQRT12
import godot.util.TAU
import godot.util.isEqualApprox
import org.junit.Test

class TestTransform2D {
    private fun degToRad(s: Double) = s * TAU / 360

    private fun createDummyTransform(): Transform2D {
        return Transform2D(Vector2(1, 2), Vector2(3, 4), Vector2(5, 6))
    }

    private fun identity(): Transform2D {
        return Transform2D()
    }

    @Test
    fun `Translation`() {
        val offset = Vector2(1, 2)

        // Both versions should give the same result applied to identity.
        check(identity().translated(offset) == identity().translatedLocal(offset))

        // Check both versions against left and right multiplications.
        val orig = createDummyTransform()
        val T = identity().translated(offset)
        check(orig.translated(offset) == T * orig)
        check(orig.translatedLocal(offset) == orig * T)
    }

    @Test
    fun `Scaling`() {
        val scaling = Vector2(1, 2)

        // Both versions should give the same result applied to identity.
        check(identity().scaled(scaling) == identity().scaledLocal(scaling))

        // Check both versions against left and right multiplications.
        val orig = createDummyTransform()
        val S = identity().scaled(scaling)
        check(orig.scaled(scaling) == S * orig)
        check(orig.scaledLocal(scaling) == orig * S)
    }

    @Test
    fun `Rotation`() {
        val phi = 1.0

        // Both versions should give the same result applied to identity.
        check(identity().rotated(phi) == identity().rotatedLocal(phi))

        // Check both versions against left and right multiplications.
        val orig = createDummyTransform()
        val R = identity().rotated(phi)
        check(orig.rotated(phi) == R * orig)
        check(orig.rotatedLocal(phi) == orig * R)
    }

    @Test
    fun `Interpolation`() {
        val rotateScaleSkewPos = Transform2D(
            degToRad(170.0),
            Vector2(3.6, 8.0),
            degToRad(20.0),
            Vector2(2.4, 6.8)
        )
        val rotateScaleSkewPosHalfway = Transform2D(
            degToRad(85.0),
            Vector2(2.3, 4.5),
            degToRad(10.0),
            Vector2(1.2, 3.4)
        )
        val interpolated = Transform2D().interpolateWith(rotateScaleSkewPos, 0.5)
        check(interpolated.origin.isEqualApprox(rotateScaleSkewPosHalfway.origin))
        check(interpolated.getRotation().isEqualApprox(rotateScaleSkewPosHalfway.getRotation()))
        check(interpolated.getScale().isEqualApprox(rotateScaleSkewPosHalfway.getScale()))
        check(interpolated.getSkew().isEqualApprox(rotateScaleSkewPosHalfway.getSkew()))
        check(interpolated.isEqualApprox(rotateScaleSkewPosHalfway))
        val interpolated2 = rotateScaleSkewPos.interpolateWith(Transform2D(), 0.5)
        check(interpolated2.isEqualApprox(rotateScaleSkewPosHalfway))
    }

    @Test
    fun `Finite number checks`() {
        val x = Vector2(0, 1)
        val infinite = Vector2(Double.NaN, Double.NaN)

        check(Transform2D(x, x, x).isFinite())
        checkFalse(Transform2D(infinite, x, x).isFinite())
        checkFalse(Transform2D(x, infinite, x).isFinite())
        checkFalse(Transform2D(x, x, infinite).isFinite())
        checkFalse(Transform2D(infinite, infinite, x).isFinite())
        checkFalse(Transform2D(infinite, x, infinite).isFinite())
        checkFalse(Transform2D(x, infinite, infinite).isFinite())
        checkFalse(Transform2D(infinite, infinite, infinite).isFinite())
    }


    @Test
    fun `Is conformal checks`() {
        checkMessage(
            Transform2D().isConformal()
        )
        { "Identity Transform2D should be conformal." }

        checkMessage(
            Transform2D(1.2, Vector2()).isConformal()
        ) { "Transform2D with only rotation should be conformal." }

        checkMessage(
            Transform2D(Vector2(1, 0), Vector2(0, -1), Vector2()).isConformal()
        ) { "Transform2D with only a flip should be conformal." }

        checkMessage(
            Transform2D(Vector2(1.2, 0), Vector2(0, 1.2), Vector2()).isConformal()
        ) { "Transform2D with only uniform scale should be conformal." }

        checkMessage(
            Transform2D(Vector2(1.2, 3.4), Vector2(3.4, -1.2), Vector2()).isConformal()
        ) { "Transform2D with a flip, rotation, and uniform scale should be conformal." }

        checkFalseMessage(
            Transform2D(Vector2(1.2, 0), Vector2(0, 3.4), Vector2()).isConformal()
        ) { "Transform2D with non-uniform scale should not be conformal." }

        checkFalseMessage(
            Transform2D(Vector2(SQRT12, SQRT12), Vector2(0, 1), Vector2()).isConformal()
        ) { "Transform2D with the X axis skewed 45 degrees should not be conformal." }
    }
}

