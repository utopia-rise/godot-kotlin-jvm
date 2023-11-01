@file:Suppress("RemoveRedundantBackticks")

package godot.core

import godot.util.isEqualApprox
import org.junit.Test
import kotlin.math.sqrt

class Vector2iTest {

    @Test
    fun `Constructor methods`() {
        val vectorEmpty = Vector2i()
        val vectorZero = Vector2i(0, 0)
        checkTrue(vectorZero == vectorEmpty)
    }

    @Test
    fun `Axis methods`() {
        val vector = Vector2i(2, 3)
        checkTrue(Vector2i.Axis.Y == vector.maxAxis())
        checkTrue(Vector2i.Axis.X == vector.minAxis())
        checkTrue(2 == vector[vector.minAxis()])
        vector[Vector2i.Axis.Y] = 5
        checkTrue(5 == vector[Vector2i.Axis.Y])
    }

    @Test
    fun `Clamp method`() {
        val vector = Vector2i(10, 10)
        checkTrue(Vector2i(0, 10) == Vector2i(-5, 15).clamp(Vector2i(), vector))
        checkTrue(Vector2i(5, 15) == vector.clamp(Vector2i(0, 15), Vector2i(5, 20)))
    }

    @Test
    fun `Length methods`() {
        val vector1 = Vector2i(10, 10)
        val vector2 = Vector2i(20, 30)
        checkTrue(200 == vector1.lengthSquared())
        checkTrue((10 * sqrt(2.0)).isEqualApprox(vector1.length()))
        checkTrue(1300 == vector2.lengthSquared())
        checkTrue(36.05551275463989.isEqualApprox(vector2.length()))
    }

    @Test
    fun `Operators`() {
        val vector1 = Vector2i(5, 9)
        val vector2 = Vector2i(2, 3)
        checkTrue(Vector2i(7, 12) == vector1 + vector2)
        checkTrue(Vector2i(3, 6) == vector1 - vector2)
        checkTrue(Vector2i(10, 27) == vector1 * vector2)
        checkTrue(Vector2i(2, 3) == vector1 / vector2)
        checkTrue(Vector2i(10, 18) == vector1 * 2)
        checkTrue(Vector2i(2, 4) == vector1 / 2)
        checkTrue(Vector2(5, 9) == vector1.toVector2())
        checkTrue(Vector2(2, 3) == vector2.toVector2())
        checkTrue(Vector2i(1, 2) == Vector2i(Vector2(1.1, 2.9)))
    }

    @Test
    fun `Other methods`() {
        val vector = Vector2i(1, 3)
        checkTrue(1 / 3 == vector.aspect())
        checkTrue(Vector2i(0, 4) == vector.snapped(Vector2i(4, 2)))
    }

    @Test
    fun `Abs and sign methods`() {
        val vector1 = Vector2i(1, 3)
        val vector2 = Vector2i(1, -3)
        checkTrue(vector1 == vector1.abs())
        checkTrue(vector1 == vector2.abs())
        checkTrue(Vector2i(1, 1) == vector1.sign())
        checkTrue(Vector2i(1, -1) == vector2.sign())
    }
}
