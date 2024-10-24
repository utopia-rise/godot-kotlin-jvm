@file:Suppress("RemoveRedundantBackticks")

package godot.core

import org.junit.Test

class TestPlane {
    @Test
    fun `Constructor methods`() {
        val plane = Plane(32.0, 22.0, 16.0, 3.0)
        val planeVector = Plane(Vector3(32.0, 22.0, 16.0), 3.0)
        val planeCopy = Plane(plane)

        checkMessage(plane == planeVector) { "Planes created with same values but different methods should be equal." }
        checkMessage(plane == planeCopy) { "Planes created with same values but different methods should be equal." }
    }

    @Test
    fun `Basic getters`() {
        val plane = Plane(32.0, 22.0, 16.0, 3.0)
        val planeNormalized = Plane(32.0 / 42.0, 22.0 / 42.0, 16.0 / 42.0, 3.0 / 42.0)

        checkMessage(plane.normal.isEqualApprox(Vector3(32.0, 22.0, 16.0))) { "get_normal() should return the expected value." }
        checkMessage(plane.normalized().isEqualApprox(planeNormalized)) { "normalized() should return a copy of the normalized value." }
    }

    @Test
    fun `Basic setters`() {
        var plane = Plane(32.0, 22.0, 16.0, 3.0)
        plane.normal = Vector3(4.0, 2.0, 3.0)

        checkMessage(plane.isEqualApprox(Plane(4.0, 2.0, 3.0, 3.0))) { "set_normal() should result in the expected plane." }

        plane = Plane(32.0, 22.0, 16.0, 3.0)
        plane.normalize()

        checkMessage(plane.isEqualApprox(Plane(32.0 / 42.0, 22.0 / 42.0, 16.0 / 42.0, 3.0 / 42.0))) { "normalize() should result in the expected plane." }
    }


    @Test
    fun `Point operations`() {
        val plane = Plane(32, 22, 16, 3)
        val yFacingPlane = Plane(0, 1, 0, 4)

        checkMessage(
            plane.getCenter().isEqualApprox(Vector3(32 * 3, 22 * 3, 16 * 3))
        ) { "getCenter() should return a vector pointing to the center of the plane." }
        checkMessage(yFacingPlane.isPointOver(Vector3(0, 5, 0))) { "isPointOver() should return the expected result." }
    }

    @Test
    fun `Has point`() {
        val xFacingPlane = Plane(1.0, 0.0, 0.0, 0.0)
        val yFacingPlane = Plane(0.0, 1.0, 0.0, 0.0)
        val zFacingPlane = Plane(0.0, 0.0, 1.0, 0.0)
        val xAxisPoint = Vector3(10.0, 0.0, 0.0)
        val yAxisPoint = Vector3(0.0, 10.0, 0.0)
        val zAxisPoint = Vector3(0.0, 0.0, 10.0)
        val xFacingPlaneWithDOffset = Plane(1.0, 0.0, 0.0, 1.0)
        val yAxisPointWithDOffset = Vector3(1.0, 10.0, 0.0)

        checkMessage(xFacingPlane.hasPoint(yAxisPoint)) { "has_point() with contained Vector3 should return the expected result." }
        checkMessage(xFacingPlane.hasPoint(zAxisPoint)) { "has_point() with contained Vector3 should return the expected result." }
        checkMessage(yFacingPlane.hasPoint(xAxisPoint)) { "has_point() with contained Vector3 should return the expected result." }
        checkMessage(yFacingPlane.hasPoint(zAxisPoint)) { "has_point() with contained Vector3 should return the expected result." }
        checkMessage(zFacingPlane.hasPoint(yAxisPoint)) { "has_point() with contained Vector3 should return the expected result." }
        checkMessage(zFacingPlane.hasPoint(xAxisPoint)) { "has_point() with contained Vector3 should return the expected result." }
        checkMessage(xFacingPlaneWithDOffset.hasPoint(yAxisPointWithDOffset)) { "has_point() with passed Vector3 should return the expected result." }
    }

    @Test
    fun `Intersection`() {
        val xFacingPlane = Plane(1.0, 0.0, 0.0, 1.0)
        val yFacingPlane = Plane(0.0, 1.0, 0.0, 2.0)
        val zFacingPlane = Plane(0.0, 0.0, 1.0, 3.0)

        var vecOut = xFacingPlane.intersect3(yFacingPlane, zFacingPlane)
        checkMessage(vecOut != null) { "intersect_3() should return the expected result." }
        checkMessage(vecOut!!.isEqualApprox(Vector3(1.0, 2.0, 3.0))) { "intersect_3() should modify vecOut to the expected result." }

        vecOut = xFacingPlane.intersectsRay(Vector3(0.0, 1.0, 1.0), Vector3(2.0, 0.0, 0.0))
        checkMessage(vecOut != null) { "intersects_ray() should return the expected result." }
        checkMessage(
            vecOut!!.isEqualApprox(
                Vector3(
                    1.0,
                    1.0,
                    1.0
                )
            )
        ) { "intersects_ray() should modify vecOut to the expected result." }

        vecOut = xFacingPlane.intersectsSegment(Vector3(0.0, 1.0, 1.0), Vector3(2.0, 1.0, 1.0))
        checkMessage(vecOut != null) { "intersects_segment() should return the expected result." }
        checkMessage(
            vecOut!!.isEqualApprox(
                Vector3(
                    1.0,
                    1.0,
                    1.0
                )
            )
        ) { "intersects_segment() should modify vecOut to the expected result." }
    }

    @Test
    fun `Finite number checks`() {
        val x = Vector3(0.0, 1.0, 2.0)
        val infiniteVec = Vector3(Double.NaN, Double.NaN, Double.NaN)
        val y = 0.0
        val infiniteY = Double.NaN

        checkMessage(Plane(x, y).isFinite()) { "Plane with all components finite should be finite" }
        checkFalseMessage(Plane(x, infiniteY).isFinite()) { "Plane with one component infinite should not be finite." }
        checkFalseMessage(Plane(infiniteVec, y).isFinite()) { "Plane with one component infinite should not be finite." }
        checkFalseMessage(Plane(infiniteVec, infiniteY).isFinite()) { "Plane with two components infinite should not be finite." }
    }
}
