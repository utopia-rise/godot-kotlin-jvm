@file:Suppress("RemoveRedundantBackticks")

package godot.core

import godot.common.util.isEqualApprox
import godot.common.util.isZeroApprox
import org.junit.Test

class TestRect2 {

    @Test
    fun `Constructor methods`() {
        val rect = Rect2(0.0, 100.0, 1280.0, 720.0)
        val rectVector = Rect2(Vector2(0.0, 100.0), Vector2(1280.0, 720.0))
        val rectCopyRect = Rect2(rect)
        val rectCopyRecti = Rect2(Rect2i(0, 100, 1280, 720))

        checkTrue(rect == rectVector)
        checkTrue(rect == rectCopyRect)
        checkTrue(rect == rectCopyRecti)
    }

    @Test
    fun `String conversion`() {
        val rect = Rect2(0.0, 100.0, 1280.0, 720.0)
        checkTrue(rect.toString() == "[P: (0.0, 100.0), S: (1280.0, 720.0)]")
    }

    @Test
    fun `Basic getters`() {
        val rect = Rect2(0.0, 100.0, 1280.0, 720.0)
        checkTrue(rect.position.isEqualApprox(Vector2(0.0, 100.0)))
        checkTrue(rect.size.isEqualApprox(Vector2(1280.0, 720.0)))
        checkTrue(rect.end.isEqualApprox(Vector2(1280.0, 820)))
        checkTrue(rect.getCenter().isEqualApprox(Vector2(640, 460)))
        checkTrue(Rect2(0.0, 100.0, 1281.0, 721.0).getCenter().isEqualApprox(Vector2(640.5, 460.5)))
    }

    @Test
    fun `Basic setters`() {
        var rect = Rect2(0.0, 100.0, 1280.0, 720.0)
        rect.end = Vector2(4000, 4000)
        checkTrue(rect == Rect2(0.0, 100.0, 4000.0, 3900.0))

        rect = Rect2(0.0, 100.0, 1280.0, 720.0)
        rect.position = Vector2(4000, 4000)
        checkTrue(rect == Rect2(4000.0, 4000.0, 1280.0, 720.0))

        rect = Rect2(0.0, 100.0, 1280.0, 720.0)
        rect.size = Vector2(4000, 4000)
        checkTrue(rect == Rect2(0.0, 100.0, 4000.0, 4000.0))
    }

    @Test
    fun `Area getters`() {
        checkTrue(Rect2(0.0, 100.0, 1280.0, 720.0).getArea().isEqualApprox(921600.0))
        checkTrue(Rect2(0.0, 100.0, -1280.0, -720.0).getArea().isEqualApprox(921600.0))
        checkTrue(Rect2(0.0, 100.0, 1280.0, -720.0).getArea().isEqualApprox(-921600.0))
        checkTrue(Rect2(0.0, 100.0, -1280.0, 720.0).getArea().isEqualApprox(-921600.0))
        checkTrue(Rect2(0.0, 100.0, 0.0, 720.0).getArea().isZeroApprox())

        checkTrue(Rect2(0.0, 100.0, 1280.0, 720.0).hasArea())
        checkFalse(Rect2(0.0, 100.0, 0.0, 500.0).hasArea())
        checkFalse(Rect2(0.0, 100.0, 500.0, 0.0).hasArea())
        checkFalse(Rect2(0.0, 100.0, 0.0, 0.0).hasArea())
    }

    @Test
    fun `Absolute coordinates`() {
        val rect = Rect2(0.0, 100.0, 1280.0, 720.0)
        checkTrue(rect.abs().isEqualApprox(Rect2(0.0, 100.0, 1280.0, 720.0)))

        val rect2 = Rect2(0.0, -100.0, 1280.0, 720.0)
        checkTrue(rect2.abs().isEqualApprox(Rect2(0.0, -100.0, 1280.0, 720.0)))

        val rect3 = Rect2(0.0, -100.0, -1280.0, -720.0)
        checkTrue(rect3.abs().isEqualApprox(Rect2(-1280.0, -820.0, 1280.0, 720.0)))

        val rect4 = Rect2(0.0, 100.0, -1280.0, 720.0)
        checkTrue(rect4.abs().isEqualApprox(Rect2(-1280.0, 100.0, 1280.0, 720.0)))
    }

    @Test
    fun `Intersection`() {
        val rect = Rect2(0.0, 100.0, 1280.0, 720.0)
        checkTrue(rect.intersection(Rect2(0.0, 300.0, 100.0, 100.0)) == Rect2(0.0, 300.0, 100.0, 100.0))
        checkTrue(rect.intersection(Rect2(1200.0, 700.0, 100.0, 100.0)) == Rect2(1200.0, 700.0, 80.0, 100.0))
        checkTrue(rect.intersection(Rect2(-4000.0, -4000.0, 100.0, 100.0)) == Rect2())
    }

    @Test
    fun `Enclosing`() {
        val rect = Rect2(0.0, 100.0, 1280.0, 720.0)
        checkTrue(rect.encloses(Rect2(0.0, 300.0, 100.0, 100.0)))
        checkFalse(rect.encloses(Rect2(1200.0, 700.0, 100.0, 100.0)))
        checkFalse(rect.encloses(Rect2(-4000.0, -4000.0, 100.0, 100.0)))
    }

    @Test
    fun `Expanding`() {
        val rect = Rect2(0.0, 100.0, 1280.0, 720.0)
        checkTrue(rect.expand(Vector2(500, 600)) == Rect2(0.0, 100.0, 1280.0, 720.0))
        checkTrue(rect.expand(Vector2(0.0, 0)) == Rect2(0.0, 0.0, 1280.0, 820.0))
    }

    @Test
    fun `Get support`() {
        val rect = Rect2(Vector2(-1.5, 2), Vector2(4, 5));
        checkMessage(
            rect.getSupport(Vector2(1, 0)) == Vector2(2.5, 2)
        )
        { "getSupport() should return the expected value." }
        checkMessage(
            rect.getSupport(Vector2(0.5, 1)) == Vector2(2.5, 7)
        )
        { "getSupport() should return the expected value." }
        checkMessage(
            rect.getSupport(Vector2(0.5, 1)) == Vector2(2.5, 7)
        )
        { "getSupport() should return the expected value." }
        checkMessage(
            rect.getSupport(Vector2(0, -1)) == Vector2(-1.5, 2)
        )
        { "getSupport() should return the expected value." }
        checkMessage(
            rect.getSupport(Vector2(0, -0.1)) == Vector2(-1.5, 2)
        )
        { "getSupport() should return the expected value." }
        checkMessage(
            rect.getSupport(Vector2()) == Vector2(-1.5, 2)
        )
        { "getSupport() should return the Rect2 position when given a zero vector." }
    }

    @Test
    fun `Growing`() {
        val rect = Rect2(0.0, 100.0, 1280.0, 720.0)
        checkTrue(rect.grow(100.0) == Rect2(-100.0, 0.0, 1480.0, 920.0))
        checkTrue(rect.grow(-100.0) == Rect2(100.0, 200.0, 1080.0, 520.0))
        checkTrue(rect.grow(-4000.0) == Rect2(4000.0, 4100.0, -6720.0, -7280.0))

        checkTrue(rect.growIndividual(100.0, 200.0, 300.0, 400.0) == Rect2(-100.0, -100.0, 1680.0, 1320.0))
        checkTrue(rect.growIndividual(-100.0, 200.0, 300.0, -400.0) == Rect2(100.0, -100.0, 1480.0, 520.0))

        checkTrue(rect.growSide(Side.SIDE_TOP, 500.0) == Rect2(0.0, -400.0, 1280.0, 1220.0))
        checkTrue(rect.growSide(Side.SIDE_TOP, -500.0) == Rect2(0.0, 600.0, 1280.0, 220.0))
    }

    @Test
    fun `Has point`() {
        var rect = Rect2(0.0, 100.0, 1280.0, 720.0)
        checkTrue(rect.hasPoint(Vector2(500, 600)))
        checkFalse(rect.hasPoint(Vector2(0.0, 0)))
        checkTrue(rect.hasPoint(rect.position))
        checkTrue(rect.hasPoint(rect.position + Vector2(1, 1)))
        checkFalse(rect.hasPoint(rect.position + Vector2(1, -1)))
        checkFalse(rect.hasPoint(rect.position + rect.size))
        checkFalse(rect.hasPoint(rect.position + rect.size + Vector2(1, 1)))
        checkTrue(rect.hasPoint(rect.position + rect.size + Vector2(-1, -1)))
        checkFalse(rect.hasPoint(rect.position + rect.size + Vector2(-1, 1)))
        checkTrue(rect.hasPoint(rect.position + Vector2(0.0, 10)))
        checkFalse(rect.hasPoint(rect.position + Vector2(rect.size.x, 10)))
        checkTrue(rect.hasPoint(rect.position + Vector2(10, 0)))
        checkFalse(rect.hasPoint(rect.position + Vector2(10, rect.size.y)))

        rect = Rect2(-4000.0, -200.0, 1280.0, 720.0);
        checkTrue(rect.hasPoint(rect.position + Vector2(0, 10)))
        checkFalse(rect.hasPoint(rect.position + Vector2(rect.size.x, 10)))
        checkTrue(rect.hasPoint(rect.position + Vector2(10, 0)))
        checkFalse(rect.hasPoint(rect.position + Vector2(10, rect.size.y)))
    }

    @Test
    fun `Intersect`() {
        val rect = Rect2(0.0, 100.0, 1280.0, 720.0)
        checkTrue(rect.intersects(Rect2(0.0, 300.0, 100.0, 100.0)))
        checkTrue(rect.intersects(Rect2(1200.0, 700.0, 100.0, 100.0)))
        checkFalse(rect.intersects(Rect2(-4000.0, -4000.0, 100.0, 100.0)))
    }

    @Test
    fun `Merging`() {
        val rect = Rect2(0.0, 100.0, 1280.0, 720.0)
        checkTrue(rect.merge(Rect2(0.0, 300.0, 100.0, 100.0)) == Rect2(0.0, 100.0, 1280.0, 720.0))
        checkTrue(rect.merge(Rect2(1200.0, 700.0, 100.0, 100.0)) == Rect2(0.0, 100.0, 1300.0, 720.0))
        checkTrue(rect.merge(Rect2(-4000.0, -4000.0, 100.0, 100.0)) == Rect2(-4000.0, -4000.0, 5280.0, 4820.0))
    }

    @Test
    fun `Finite number checks`() {
        val x = Vector2(0.0, 1)
        val infinite = Vector2(Double.NaN, Double.NaN)

        checkTrue(Rect2(x, x).isFinite())
        checkFalse(Rect2(infinite, x).isFinite())
        checkFalse(Rect2(x, infinite).isFinite())
        checkFalse(Rect2(infinite, infinite).isFinite())
    }
}

