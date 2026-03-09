@file:Suppress("RemoveRedundantBackticks")

package godot.core

import godot.common.util.isEqualApprox
import org.junit.Test

class ProjectionTest {

    @Test
    fun `Default construct`() {
        val p = Projection()
        check(p._x.x == 1.0)
        check(p._x.y == 0.0)
        check(p._x.z == 0.0)
        check(p._x.w == 0.0)
        check(p._y.x == 0.0)
        check(p._y.y == 1.0)
        check(p._y.z == 0.0)
        check(p._y.w == 0.0)
        check(p._z.x == 0.0)
        check(p._z.y == 0.0)
        check(p._z.z == 1.0)
        check(p._z.w == 0.0)
        check(p._w.x == 0.0)
        check(p._w.y == 0.0)
        check(p._w.z == 0.0)
        check(p._w.w == 1.0)
    }

    private fun projectionIsEqualApprox(p_a: Projection, p_b: Projection): Boolean {
        for (i in 0..3) {
            for (j in 0..3) {
            if (!(p_a[i][j]).isEqualApprox(p_b[i][j])) {
                return false
            }
        }
        }
        return true
    }

    @Test
    fun `Orthogonal projection matrix inversion`() {
        val p = Projection.createOrthogonal(-125.0, 125.0, -125.0, 125.0, 0.01, 25.0)
        check(projectionIsEqualApprox(p.inverse() * p, Projection()))
    }

    @Test
    fun `Perspective projection matrix inversion`() {
        val p = Projection.createPerspective(90.0, 1.77777, 0.05, 4000.0)
        check(projectionIsEqualApprox(p.inverse() * p, Projection()))
    }
    
}
