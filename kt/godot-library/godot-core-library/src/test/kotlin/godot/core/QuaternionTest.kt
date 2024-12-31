@file:Suppress("RemoveRedundantBackticks")

package godot.core

import godot.common.util.TAU
import godot.common.util.isEqualApprox
import org.junit.Test

class TestQuaternion {

    private fun degToRad(s: Double) = s * TAU / 360

    @Test
    fun `Default Construct`() {
        val q = Quaternion()

        checkTrue(q.x == 0.0)
        checkTrue(q.y == 0.0)
        checkTrue(q.z == 0.0)
        checkTrue(q.w == 1.0)
    }

    @Test
    fun `Construct x,y,z,w`() {
        // Values are taken from actual use in another project & are valid (except roundoff error).
        val q = Quaternion(0.2391, 0.099, 0.3696, 0.8924)

        checkTrue(q.x.isEqualApprox(0.2391))
        checkTrue(q.y.isEqualApprox(0.099))
        checkTrue(q.z.isEqualApprox(0.3696))
        checkTrue(q.w.isEqualApprox(0.8924))
    }

    @Test
    fun `Construct AxisAngle 1`() {
        // Easy to visualize: 120 deg about X-axis.
        val q = Quaternion(Vector3(1.0, 0.0, 0.0), degToRad(120.0))

        checkTrue(q.x.isEqualApprox(0.866025)) // Sine of half the angle.
        checkTrue(q.y.isEqualApprox(0.0))
        checkTrue(q.z.isEqualApprox(0.0))
        checkTrue(q.w.isEqualApprox(0.5)) // Cosine of half the angle.
    }

    @Test
    fun `Construct AxisAngle 2`() {
        // Easy to visualize: 30 deg about Y-axis.
        val q = Quaternion(Vector3(0.0, 1.0, 0.0), degToRad(30.0))

        checkTrue(q.x.isEqualApprox(0.0))
        checkTrue(q.y.isEqualApprox(0.258819)) // Sine of half the angle.
        checkTrue(q.z.isEqualApprox(0.0))
        checkTrue(q.w.isEqualApprox(0.965926)) // Cosine of half the angle.
    }

    @Test
    fun `Construct AxisAngle 3`() {
        // Easy to visualize: 60 deg about Z-axis.
        val q = Quaternion(Vector3(0.0, 0.0, 1.0), degToRad(60.0))

        checkTrue(q.x.isEqualApprox(0.0))
        checkTrue(q.y.isEqualApprox(0.0))
        checkTrue(q.z.isEqualApprox(0.5)) // Sine of half the angle.
        checkTrue(q.w.isEqualApprox(0.866025)) // Cosine of half the angle.
    }

    @Test
    fun `Construct AxisAngle 4`() {
        // More complex & hard to visualize, so test w/ data from online calculator.
        val axis = Vector3(1.0, 2.0, 0.5)
        val q = Quaternion(axis.normalized(), degToRad(35.0))

        checkTrue(q.x.isEqualApprox(0.131239))
        checkTrue(q.y.isEqualApprox(0.262478))
        checkTrue(q.z.isEqualApprox(0.0656194))
        checkTrue(q.w.isEqualApprox(0.953717))
    }

    @Test
    fun `Construct from Quaternion`() {
        val axis = Vector3(1.0, 2.0, 0.5)
        val qSrc = Quaternion(axis.normalized(), degToRad(35.0))
        val q = Quaternion(qSrc)

        checkTrue(q.x.isEqualApprox(0.131239))
        checkTrue(q.y.isEqualApprox(0.262478))
        checkTrue(q.z.isEqualApprox(0.0656194))
        checkTrue(q.w.isEqualApprox(0.953717))
    }

    @Test
    fun `Construct Euler SingleAxis`() {
        val yaw = degToRad(45.0)
        val pitch = degToRad(30.0)
        val roll = degToRad(10.0)

        val eulerY = Vector3(0.0, yaw, 0.0)
        val qY = Quaternion.fromEuler(eulerY)
        checkTrue(qY.x.isEqualApprox(0.0))
        checkTrue(qY.y.isEqualApprox(0.382684))
        checkTrue(qY.z.isEqualApprox(0.0))
        checkTrue(qY.w.isEqualApprox(0.923879))

        val eulerP = Vector3(pitch, 0.0, 0.0)
        val qP = Quaternion.fromEuler(eulerP)
        checkTrue(qP.x.isEqualApprox(0.258819))
        checkTrue(qP.y.isEqualApprox(0.0))
        checkTrue(qP.z.isEqualApprox(0.0))
        checkTrue(qP.w.isEqualApprox(0.965926))

        val eulerR = Vector3(0.0, 0.0, roll)
        val qR = Quaternion.fromEuler(eulerR)
        checkTrue(qR.x.isEqualApprox(0.0))
        checkTrue(qR.y.isEqualApprox(0.0))
        checkTrue(qR.z.isEqualApprox(0.0871558))
        checkTrue(qR.w.isEqualApprox(0.996195))
    }

    @Test
    fun `Construct Euler YXZ dynamic axes`() {
        val yaw = degToRad(45.0)
        val pitch = degToRad(30.0)
        val roll = degToRad(10.0)

        // Generate YXZ comparison data (Z-then-X-then-Y) using single-axis Euler
        // constructor and quaternion product, both tested separately.
        val eulerY = Vector3(0.0, yaw, 0.0)
        val qY = Quaternion.fromEuler(eulerY)
        val eulerP = Vector3(pitch, 0.0, 0.0)
        val qP = Quaternion.fromEuler(eulerP)
        val eulerR = Vector3(0.0, 0.0, roll)
        val qR = Quaternion.fromEuler(eulerR)

        // Intrinsically, Yaw-Y then Pitch-X then Roll-Z.
        // Extrinsically, Roll-Z is followed by Pitch-X, then Yaw-Y.
        val checkYXZ = qY * qP * qR

        // Test construction from YXZ Euler angles.
        val eulerYXZ = Vector3(pitch, yaw, roll)
        val q = Quaternion.fromEuler(eulerYXZ)
        checkTrue(q.x.isEqualApprox(checkYXZ.x))
        checkTrue(q.y.isEqualApprox(checkYXZ.y))
        checkTrue(q.z.isEqualApprox(checkYXZ.z))
        checkTrue(q.w.isEqualApprox(checkYXZ.w))
        checkTrue(q.isEqualApprox(checkYXZ))
        checkTrue(q.getEuler().isEqualApprox(eulerYXZ))
        checkTrue(checkYXZ.getEuler().isEqualApprox(eulerYXZ))
    }

    @Test
    fun `Construct Basis Euler`() {
        val yaw = degToRad(45.0)
        val pitch = degToRad(30.0)
        val roll = degToRad(10.0)
        val eulerYXZ = Vector3(pitch, yaw, roll)
        val qYXZ = Quaternion.fromEuler(eulerYXZ)
        val basisAxes = Basis.fromEuler(eulerYXZ)
        val q = Quaternion(basisAxes)
        checkTrue(q.isEqualApprox(qYXZ))
    }

    private fun quatEulerYXZDeg(angle: Vector3): Quaternion {
        val yaw = degToRad(angle.y)
        val pitch = degToRad(angle.x)
        val roll = degToRad(angle.z)

        // Generate YXZ (Z-then-X-then-Y) Quaternion using single-axis Euler
        // constructor and quaternion product, both tested separately.
        val qy = Quaternion.fromEuler(Vector3(0.0, yaw, 0.0))
        val qp = Quaternion.fromEuler(Vector3(pitch, 0.0, 0.0))
        val qr = Quaternion.fromEuler(Vector3(0.0, 0.0, roll))
        // Roll-Z is followed by Pitch-X, then Yaw-Y.
        return qy * qp * qr
    }

    @Test
    fun `Construct Basis Axes`() {
        // Arbitrary Euler angles.
        val eulerYXZ = Vector3(degToRad(31.41), degToRad(-49.16), degToRad(12.34))
        // Basis vectors from online calculation of the rotation matrix.
        val iUnit = Vector3(0.5545787, 0.1823950, 0.8118957)
        val jUnit = Vector3(-0.5249245, 0.8337420, 0.1712555)
        val kUnit = Vector3(-0.6456754, -0.5211586, 0.5581192)
        // Quaternion from online calculation.
        val qCalc = Quaternion(0.2016913, -0.4245716, 0.206033, 0.8582598)
        // Quaternion from local calculation.
        val qLocal = quatEulerYXZDeg(Vector3(31.41, -49.16, 12.34))
        // Quaternion from Euler angles constructor.
        val qEuler = Quaternion.fromEuler(eulerYXZ)
        checkTrue(qCalc.isEqualApprox(qLocal))
        checkTrue(qLocal.isEqualApprox(qEuler))

        // Calculate Basis and construct Quaternion.
        // When this is written, the C++ Basis class does not construct from basis vectors.
        // This is by design, but may be subject to change.
        // Workaround by constructing Basis from Euler angles.
        // basisAxes = Basis(iUnit, jUnit, kUnit);
        val basisAxes = Basis.fromEuler(eulerYXZ)
        val q = Quaternion(basisAxes)

        checkTrue(basisAxes.getColumn(0).isEqualApprox(iUnit))
        checkTrue(basisAxes.getColumn(1).isEqualApprox(jUnit))
        checkTrue(basisAxes.getColumn(2).isEqualApprox(kUnit))

        checkTrue(q.isEqualApprox(qCalc))
        checkTrue(!q.inverse().isEqualApprox(qCalc))
        checkTrue(q.isEqualApprox(qLocal))
        checkTrue(q.isEqualApprox(qEuler))
        checkTrue(q.x.isEqualApprox(0.2016913))
        checkTrue(q.y.isEqualApprox(-0.4245716))
        checkTrue(q.z.isEqualApprox(0.206033))
        checkTrue(q.w.isEqualApprox(0.8582598))
    }

    @Test
    fun `Get Euler Orders`() {
        val x = degToRad(30.0)
        val y = degToRad(45.0)
        val z = degToRad(10.0)
        val euler = Vector3(x, y, z)
        for (i in 0 until 6) {
            val order = EulerOrder.entries[i]
            val basis = Basis.fromEuler(euler, order)
            val q = Quaternion(basis)
            val check = q.getEuler(order)
            checkMessage(check.isEqualApprox(euler)) { "Quaternion getEuler method should return the original angles." }
            checkMessage(check.isEqualApprox(basis.getEuler(order))) { "Quaternion getEuler method should behave the same as Basis getEuler." }
        }
    }

    @Test
    fun `Product (book)`() {
        // Example from "Quaternions and Rotation Sequences" by Jack Kuipers, p. 108.
        val p = Quaternion(1.0, -2.0, 1.0, 3.0)
        val q = Quaternion(-1.0, 2.0, 3.0, 2.0)

        val pq = p * q
        checkTrue(pq.x.isEqualApprox(-9.0))
        checkTrue(pq.y.isEqualApprox(-2.0))
        checkTrue(pq.z.isEqualApprox(11.0))
        checkTrue(pq.w.isEqualApprox(8.0))
    }

    @Test
    fun `Product`() {
        val yaw = degToRad(45.0)
        val pitch = degToRad(30.0)
        val roll = degToRad(10.0)

        val eulerY = Vector3(0.0, yaw, 0.0)
        val qY = Quaternion.fromEuler(eulerY)
        checkTrue(qY.x.isEqualApprox(0.0))
        checkTrue(qY.y.isEqualApprox(0.382684))
        checkTrue(qY.z.isEqualApprox(0.0))
        checkTrue(qY.w.isEqualApprox(0.923879))

        val eulerP = Vector3(pitch, 0.0, 0.0)
        val qP = Quaternion.fromEuler(eulerP)
        checkTrue(qP.x.isEqualApprox(0.258819))
        checkTrue(qP.y.isEqualApprox(0.0))
        checkTrue(qP.z.isEqualApprox(0.0))
        checkTrue(qP.w.isEqualApprox(0.965926))

        val eulerR = Vector3(0.0, 0.0, roll)
        val qR = Quaternion.fromEuler(eulerR)
        checkTrue(qR.x.isEqualApprox(0.0))
        checkTrue(qR.y.isEqualApprox(0.0))
        checkTrue(qR.z.isEqualApprox(0.0871558))
        checkTrue(qR.w.isEqualApprox(0.996195))

        // Test ZYX dynamic-axes since test data is available online.
        // Rotate first about the X-axis, then the new Y-axis, then the new Z-axis.
        // (Godot uses YXZ Yaw-Pitch-Roll order).
        val qYP = qY * qP
        checkTrue(qYP.x.isEqualApprox(0.239118))
        checkTrue(qYP.y.isEqualApprox(0.369644))
        checkTrue(qYP.z.isEqualApprox(-0.099046))
        checkTrue(qYP.w.isEqualApprox(0.892399))

        val qRYP = qR * qYP
        checkTrue(qRYP.x.isEqualApprox(0.205991))
        checkTrue(qRYP.y.isEqualApprox(0.389078))
        checkTrue(qRYP.z.isEqualApprox(-0.0208912))
        checkTrue(qRYP.w.isEqualApprox(0.897636))
    }

    @Test
    fun `Xform unit vectors`() {
        // Easy to visualize: 120 deg about X-axis.
        // Transform the i, j, & k unit vectors.
        val q = Quaternion(Vector3(1.0, 0.0, 0.0), degToRad(120.0))
        val iT = q.xform(Vector3(1.0, 0.0, 0.0))
        val jT = q.xform(Vector3(0.0, 1.0, 0.0))
        val kT = q.xform(Vector3(0.0, 0.0, 1.0))

        checkTrue(iT.isEqualApprox(Vector3(1.0, 0.0, 0.0)))
        checkTrue(jT.isEqualApprox(Vector3(0.0, -0.5, 0.866025)))
        checkTrue(kT.isEqualApprox(Vector3(0.0, -0.866025, -0.5)))
        checkTrue(iT.lengthSquared().isEqualApprox(1.0))
        checkTrue(jT.lengthSquared().isEqualApprox(1.0))
        checkTrue(kT.lengthSquared().isEqualApprox(1.0))

        // Easy to visualize: 30 deg about Y-axis.
        val q2 = Quaternion(Vector3(0.0, 1.0, 0.0), degToRad(30.0))
        val iT2 = q2.xform(Vector3(1.0, 0.0, 0.0))
        val jT2 = q2.xform(Vector3(0.0, 1.0, 0.0))
        val kT2 = q2.xform(Vector3(0.0, 0.0, 1.0))

        checkTrue(iT2.isEqualApprox(Vector3(0.866025, 0.0, -0.5)))
        checkTrue(jT2.isEqualApprox(Vector3(0.0, 1.0, 0.0)))
        checkTrue(kT2.isEqualApprox(Vector3(0.5, 0.0, 0.866025)))
        checkTrue(iT2.lengthSquared().isEqualApprox(1.0))
        checkTrue(jT2.lengthSquared().isEqualApprox(1.0))
        checkTrue(kT2.lengthSquared().isEqualApprox(1.0))

        // Easy to visualize: 60 deg about Z-axis.
        val q3 = Quaternion(Vector3(0.0, 0.0, 1.0), degToRad(60.0))
        val iT3 = q3.xform(Vector3(1.0, 0.0, 0.0))
        val jT3 = q3.xform(Vector3(0.0, 1.0, 0.0))
        val kT3 = q3.xform(Vector3(0.0, 0.0, 1.0))

        checkTrue(iT3.isEqualApprox(Vector3(0.5, 0.866025, 0.0)))
        checkTrue(jT3.isEqualApprox(Vector3(-0.866025, 0.5, 0.0)))
        checkTrue(kT3.isEqualApprox(Vector3(0.0, 0.0, 1.0)))
        checkTrue(iT3.lengthSquared().isEqualApprox(1.0))
        checkTrue(jT3.lengthSquared().isEqualApprox(1.0))
        checkTrue(kT3.lengthSquared().isEqualApprox(1.0))
    }

    @Test
    fun `Xform vector`() {
        // Arbitrary quaternion rotates an arbitrary vector.
        val eulerYZX = Vector3(degToRad(31.41), degToRad(-49.16), degToRad(12.34))
        val basisAxes = Basis.fromEuler(eulerYZX)
        val q = Quaternion(basisAxes)

        val vArb = Vector3(3.0, 4.0, 5.0)
        val vRot = q.xform(vArb)
        val vCompare = basisAxes.xform(vArb)

        checkTrue(vRot.lengthSquared().isEqualApprox(vArb.lengthSquared()))
        checkTrue(vRot.isEqualApprox(vCompare))
    }

    // Test vector xform for a single combination of Quaternion and Vector.
    private fun testQuatVecRotate(eulerYZX: Vector3, vIn: Vector3) {
        val basisAxes = Basis.fromEuler(eulerYZX)
        val q = Quaternion(basisAxes)

        val vRot = q.xform(vIn)
        val vCompare = basisAxes.xform(vIn)

        checkTrue(vRot.lengthSquared().isEqualApprox(vIn.lengthSquared()))
        checkTrue(vRot.isEqualApprox(vCompare))
    }

    @Test
    fun `Stress Many vector xforms`() {
        // Many arbitrary quaternions rotate many arbitrary vectors.
        // For each trial, check that rotation by Quaternion yields the same result as rotation by Basis.
        val STEPS = 100 // Number of test steps in each dimension
        val delta = 2.0 * Math.PI / STEPS // Angle increment per step
        val deltaVec = 20.0 / STEPS // Vector increment per step
        val vecArb = Vector3(1.0, 1.0, 1.0)
        for (i in 0 until STEPS) {
            vecArb.x = -10.0 + i * deltaVec
            val xAngle = i * delta - Math.PI
            for (j in 0 until STEPS) {
                vecArb.y = -10.0 + j * deltaVec
                val yAngle = j * delta - Math.PI
                for (k in 0 until STEPS) {
                    vecArb.z = -10.0 + k * deltaVec
                    val zAngle = k * delta - Math.PI
                    val eulerYZX = Vector3(xAngle, yAngle, zAngle)
                    testQuatVecRotate(eulerYZX, vecArb)
                }
            }
        }
    }

    @Test
    fun `Finite number checks`() {
        val x = Double.NaN

        checkMessage(Quaternion(0.0, 1.0, 2.0, 3.0).isFinite()) { "Quaternion with all components finite should be finite" }
        checkFalseMessage(Quaternion(x, 1.0, 2.0, 3.0).isFinite()) { "Quaternion with one component infinite should not be finite." }
        checkFalseMessage(Quaternion(0.0, x, 2.0, 3.0).isFinite()) { "Quaternion with one component infinite should not be finite." }
        checkFalseMessage(Quaternion(0.0, 1.0, x, 3.0).isFinite()) { "Quaternion with one component infinite should not be finite." }
        checkFalseMessage(Quaternion(0.0, 1.0, 2.0, x).isFinite()) { "Quaternion with one component infinite should not be finite." }
        checkFalseMessage(Quaternion(x, x, 2.0, 3.0).isFinite()) { "Quaternion with two components infinite should not be finite." }
        checkFalseMessage(Quaternion(x, 1.0, x, 3.0).isFinite()) { "Quaternion with two components infinite should not be finite." }
        checkFalseMessage(Quaternion(x, 1.0, 2.0, x).isFinite()) { "Quaternion with two components infinite should not be finite." }
        checkFalseMessage(Quaternion(0.0, x, x, 3.0).isFinite()) { "Quaternion with two components infinite should not be finite." }
        checkFalseMessage(Quaternion(0.0, x, 2.0, x).isFinite()) { "Quaternion with two components infinite should not be finite." }
        checkFalseMessage(Quaternion(0.0, 1.0, x, x).isFinite()) { "Quaternion with two components infinite should not be finite." }
        checkFalseMessage(Quaternion(0.0, x, x, x).isFinite()) { "Quaternion with three components infinite should not be finite." }
        checkFalseMessage(Quaternion(x, 1.0, x, x).isFinite()) { "Quaternion with three components infinite should not be finite." }
        checkFalseMessage(Quaternion(x, x, 2.0, x).isFinite()) { "Quaternion with three components infinite should not be finite." }
        checkFalseMessage(Quaternion(x, x, x, 3.0).isFinite()) { "Quaternion with three components infinite should not be finite." }
        checkFalseMessage(Quaternion(x, x, x, x).isFinite()) { "Quaternion with four components infinite should not be finite." }
    }
}
