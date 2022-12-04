package godot.core

import godot.global.GD
import godot.global.GD.acos
import godot.global.GD.atan
import godot.global.GD.cos
import godot.global.GD.sin
import godot.global.GD.tan
import godot.util.RealT
import kotlin.math.abs


@Suppress("unused")
class Projection private constructor(val columns: Array<Vector4>) {

    private val _leftPlane: Plane
        get() = Plane(
            columns[0].w + columns[0].x,
            columns[1].w + columns[1].x,
            columns[2].w + columns[2].x,
            columns[3].w + columns[3].x
        )

    private val _rightPlane: Plane
        get() = Plane(
            columns[0].w - columns[0].x,
            columns[1].w - columns[1].x,
            columns[2].w - columns[2].x,
            -columns[3].w + columns[3].x
        )

    private val _topPlane: Plane
        get() = Plane(
            columns[0].w - columns[0].y,
            columns[1].w - columns[1].y,
            columns[2].w - columns[2].y,
            columns[3].w - columns[3].y
        )

    private val _bottomPlane: Plane
        get() = Plane(
            columns[0].w + columns[0].y,
            columns[1].w + columns[1].y,
            columns[2].w + columns[2].y,
            columns[3].w + columns[3].y
        )

    private val _farPlane: Plane
        get() = Plane(
            columns[0].w - columns[0].z,
            columns[1].w - columns[1].z,
            columns[2].w - columns[2].z,
            columns[3].w - columns[3].z
        )

    enum class Planes {
        PLANE_NEAR,
        PLANE_FAR,
        PLANE_LEFT,
        PLANE_TOP,
        PLANE_RIGHT,
        PLANE_BOTTOM
    }

    constructor() : this(
        arrayOf(
            Vector4(1, 0, 0, 0),
            Vector4(0, 1, 0, 0),
            Vector4(0, 0, 1, 0),
            Vector4(0, 0, 0, 1)
        )
    )

    constructor(x: Vector4, y: Vector4, z: Vector4, w: Vector4) : this(arrayOf(x, y, z, w))

    constructor(tranform: Transform3D) : this(
        arrayOf(
            Vector4(
                tranform.basis.x.x,
                tranform.basis.y.x,
                tranform.basis.z.x,
                0
            ),
            Vector4(
                tranform.basis.x.y,
                tranform.basis.y.y,
                tranform.basis.z.y,
                0
            ),
            Vector4(
                tranform.basis.x.z,
                tranform.basis.y.z,
                tranform.basis.z.z,
                0
            ),
            Vector4(
                tranform.origin.x,
                tranform.origin.y,
                tranform.origin.z,
                1
            )
        )
    )

    constructor(projection: Projection) : this(projection.columns)

    operator fun get(n: Int): Vector4 {
        if (n > 3 || n < 0) throw IndexOutOfBoundsException()
        return columns[n]
    }

    operator fun set(n: Int, vector: Vector4) {
        if (n > 3 || n < 0) throw IndexOutOfBoundsException()
        columns[n] = vector
    }

    fun determinant() = (
            columns[0][3] * columns[1][2] * columns[2][1] * columns[3][0] - columns[0][2] * columns[1][3] * columns[2][1] * columns[3][0] -
                    columns[0][3] * columns[1][1] * columns[2][2] * columns[3][0] + columns[0][1] * columns[1][3] * columns[2][2] * columns[3][0] +
                    columns[0][2] * columns[1][1] * columns[2][3] * columns[3][0] - columns[0][1] * columns[1][2] * columns[2][3] * columns[3][0] -
                    columns[0][3] * columns[1][2] * columns[2][0] * columns[3][1] + columns[0][2] * columns[1][3] * columns[2][0] * columns[3][1] +
                    columns[0][3] * columns[1][0] * columns[2][2] * columns[3][1] - columns[0][0] * columns[1][3] * columns[2][2] * columns[3][1] -
                    columns[0][2] * columns[1][0] * columns[2][3] * columns[3][1] + columns[0][0] * columns[1][2] * columns[2][3] * columns[3][1] +
                    columns[0][3] * columns[1][1] * columns[2][0] * columns[3][2] - columns[0][1] * columns[1][3] * columns[2][0] * columns[3][2] -
                    columns[0][3] * columns[1][0] * columns[2][1] * columns[3][2] + columns[0][0] * columns[1][3] * columns[2][1] * columns[3][2] +
                    columns[0][1] * columns[1][0] * columns[2][3] * columns[3][2] - columns[0][0] * columns[1][1] * columns[2][3] * columns[3][2] -
                    columns[0][2] * columns[1][1] * columns[2][0] * columns[3][3] + columns[0][1] * columns[1][2] * columns[2][0] * columns[3][3] +
                    columns[0][2] * columns[1][0] * columns[2][1] * columns[3][3] - columns[0][0] * columns[1][2] * columns[2][1] * columns[3][3] -
                    columns[0][1] * columns[1][0] * columns[2][2] * columns[3][3] + columns[0][0] * columns[1][1] * columns[2][2] * columns[3][3]
            ).toFloat()

    @Suppress("MemberVisibilityCanBePrivate")
    fun setIdentity() {
        for (i in 0..3) {
            for (j in 0..3) {
                columns[i][j] = if (i == j) 1.0 else 0.0
            }
        }
    }

    fun setZero() {
        for (i in 0..3) {
            for (j in 0..3) {
                columns[i][j] = 0.0
            }
        }
    }

    fun setLightBias() {
        columns[0].x = 0.5
        columns[0].y = 0.0
        columns[0].z = 0.0
        columns[0].w = 0.0
        columns[1].x = 0.0
        columns[1].y = 0.5
        columns[1].z = 0.0
        columns[1].w = 0.0
        columns[2].x = 0.0
        columns[2].y = 0.0
        columns[2].z = 0.5
        columns[2].w = 0.0
        columns[3].x = 0.5
        columns[3].y = 0.5
        columns[3].z = 0.5
        columns[3].w = 1.0
    }

    fun setDepthCorrection(flipY: Boolean) {
        columns[0].x = 1.0
        columns[0].y = 0.0
        columns[0].z = 0.0
        columns[0].w = 0.0
        columns[1].x = 0.0
        columns[1].y = if (flipY) -1.0 else 1.0
        columns[1].z = 0.0
        columns[1].w = 0.0
        columns[2].x = 0.0
        columns[2].y = 0.0
        columns[2].z = 0.5
        columns[2].w = 0.0
        columns[3].x = 0.0
        columns[3].y = 0.0
        columns[3].z = 0.5
        columns[3].w = 1.0
    }

    fun setLightAtlasRect(p_rect: Rect2) {
        columns[0].x = p_rect.size.x
        columns[0].y = 0.0
        columns[0].z = 0.0
        columns[0].w = 0.0
        columns[1].x = 0.0
        columns[1].y = p_rect.size.y
        columns[1].z = 0.0
        columns[1].w = 0.0
        columns[2].x = 0.0
        columns[2].y = 0.0
        columns[2].z = 1.0
        columns[2].w = 0.0
        columns[3].x = p_rect.position.x
        columns[3].y = p_rect.position.y
        columns[3].z = 0.0
        columns[3].w = 1.0
    }

    fun setPerspective(pFovyDegrees: RealT, aspect: RealT, zNear: RealT, zFar: RealT, flipFov: Boolean) {
        val fovyDegrees = if (flipFov) getFovy(pFovyDegrees, 1.0 / aspect) else pFovyDegrees

        val radians = Math.toRadians(fovyDegrees / 2.0)
        val sine: RealT = sin(radians)
        val deltaZ = zFar - zNear

        if (deltaZ == 0.0 || sine == 0.0 || aspect == 0.0) {
            return
        }

        val cotangent = cos(radians) / sine

        setIdentity()

        columns[0][0] = cotangent / aspect
        columns[1][1] = cotangent
        columns[2][2] = -(zFar + zNear) / deltaZ
        columns[2][3] = -1.0
        columns[3][2] = -2 * zNear * zFar / deltaZ
        columns[3][3] = 0.0
    }

    fun setPerspective(
        pFovyDegrees: RealT,
        aspect: RealT,
        zNear: RealT,
        zFar: RealT,
        flipFov: Boolean,
        eye: Int,
        intraocularDist: RealT,
        convergenceDist: RealT
    ) {
        val fovyDegrees = if (flipFov) getFovy(pFovyDegrees, 1.0 / aspect) else pFovyDegrees

        val ymax = zNear * tan(Math.toRadians(fovyDegrees / 2.0))
        val xmax = ymax * aspect
        val frustumshift = (intraocularDist / 2.0) * zNear / convergenceDist

        val left: RealT
        val right: RealT
        val modelTranslation: RealT
        when (eye) {
            1 -> {
                left = -xmax + frustumshift
                right = xmax + frustumshift
                modelTranslation = intraocularDist / 2.0
            }

            2 -> {
                left = -xmax - frustumshift
                right = xmax - frustumshift
                modelTranslation = -intraocularDist / 2.0
            }

            else -> {
                left = -xmax
                right = xmax
                modelTranslation = 0.0
            }
        }

        setFrustrum(left, right, -ymax, ymax, zNear, zFar)

        val cm = Projection()
        cm.columns[3].x = modelTranslation
        set(this * cm)
    }

    fun setForHmd(
        pEye: Int,
        pAspect: RealT,
        pIntraocularDist: RealT,
        pDisplayWidth: RealT,
        pDisplayToLens: RealT,
        pOversample: RealT,
        pZNear: RealT,
        pZFar: RealT
    ) {
        // we first calculate our base frustum on our values without taking our lens magnification into account.
        // we first calculate our base frustum on our values without taking our lens magnification into account.
        var f1: RealT = pIntraocularDist * 0.5 / pDisplayToLens
        var f2: RealT = (pDisplayWidth - pIntraocularDist) * 0.5 / pDisplayToLens
        var f3: RealT = pDisplayWidth / 4.0 / pDisplayToLens

        // now we apply our oversample factor to increase our FOV. how much we oversample is always a balance we strike between performance and how much
        // we're willing to sacrifice in FOV.

        // now we apply our oversample factor to increase our FOV. how much we oversample is always a balance we strike between performance and how much
        // we're willing to sacrifice in FOV.
        val add: RealT = (f1 + f2) * (pOversample - 1.0) / 2.0
        f1 += add
        f2 += add
        f3 *= pOversample

        // always apply KEEP_WIDTH aspect ratio

        // always apply KEEP_WIDTH aspect ratio
        f3 /= pAspect

        when (pEye) {
            1 -> {
                // left eye
                setFrustrum(-f2 * pZNear, f1 * pZNear, -f3 * pZNear, f3 * pZNear, pZNear, pZFar)
            }

            2 -> {
                // right eye
                setFrustrum(-f1 * pZNear, f2 * pZNear, -f3 * pZNear, f3 * pZNear, pZNear, pZFar)
            }

            else -> {}
        }
    }

    fun setOrthogonal(pLeft: RealT, pRight: RealT, pBottom: RealT, pTop: RealT, pZnear: RealT, pZfar: RealT) {
        setIdentity()

        columns[0][0] = 2.0 / (pRight - pLeft)
        columns[3][0] = -((pRight + pLeft) / (pRight - pLeft))
        columns[1][1] = 2.0 / (pTop - pBottom)
        columns[3][1] = -((pTop + pBottom) / (pTop - pBottom))
        columns[2][2] = -2.0 / (pZfar - pZnear)
        columns[3][2] = -((pZfar + pZnear) / (pZfar - pZnear))
        columns[3][3] = 1.0
    }

    fun setOrthogonal(pSize: RealT, pAspect: RealT, pZnear: RealT, pZfar: RealT, pFlipFov: Boolean) {
        val size = if (!pFlipFov) {
            pSize * pAspect
        } else {
            pSize
        }

        setOrthogonal(-size / 2, +size / 2, -size / pAspect / 2, +size / pAspect / 2, pZnear, pZfar)
    }

    fun setFrustrum(left: RealT, right: RealT, bottom: RealT, top: RealT, near: RealT, far: RealT) {
        if (right <= left) throw IllegalArgumentException("right <= left")
        if (top <= bottom) throw IllegalArgumentException("top <= bottom")
        if (far <= near) throw IllegalArgumentException("far <= near")

        val x = 2 * near / (right - left)
        val y = 2 * near / (top - bottom)
        val a = (right + left) / (right - left)
        val b = (top + bottom) / (top - bottom)
        val c = -(far + near) / (far - near)
        val d = -2 * far * near / (far - near)
        columns[0].x = x
        columns[0].y = 0.0
        columns[0].z = 0.0
        columns[0].w = 0.0
        columns[1].x = 0.0
        columns[1].y = y
        columns[1].z = 0.0
        columns[1].w = 0.0
        columns[2].x = a
        columns[2].y = b
        columns[2].z = c
        columns[2].w = -1.0
        columns[3].x = 0.0
        columns[3].y = 0.0
        columns[3].z = d
        columns[3].w = 0.0
    }

    fun setFrustrum(pSize: RealT, aspect: RealT, offset: Vector2, near: RealT, far: RealT, flipFov: Boolean) {
        val size = if (!flipFov) {
            pSize * aspect
        } else {
            pSize
        }

        setFrustrum(
            -size / 2 + offset.x,
            size / 2 + offset.x,
            -size / aspect / 2 + offset.y,
            size / aspect / 2 + offset.y,
            near,
            far
        )
    }

    @Suppress("MemberVisibilityCanBePrivate")
    fun adjustPerspectiveZnear(p_new_znear: RealT) {
        val zfar: RealT = getZFar()
        val znear: RealT = p_new_znear

        val deltaZ: RealT = zfar - znear
        columns[2][2] = -(zfar + znear) / deltaZ
        columns[3][2] = -2 * znear * zfar / deltaZ
    }

    fun perspectiveZnearAdjusted(pNewZnear: RealT) = Projection(this).also {
        it.adjustPerspectiveZnear(pNewZnear)
    }

    @Suppress("DuplicatedCode")
    fun getProjectionPlane(pPlane: Planes): Plane {
        val newPlane = when (pPlane) {
            Planes.PLANE_NEAR -> Plane(
                columns[0].w + columns[0].z,
                columns[1].w + columns[1].z,
                columns[2].w + columns[2].z,
                columns[3].w + columns[3].z
            )

            Planes.PLANE_FAR -> _farPlane

            Planes.PLANE_LEFT -> _leftPlane

            Planes.PLANE_TOP -> _topPlane

            //TODO: is there a godot bug on last member of plane here ?
            Planes.PLANE_RIGHT -> Plane(
                columns[0].w - columns[0].x,
                columns[1].w - columns[1].x,
                columns[2].w - columns[2].x,
                columns[3].w - columns[3].x
            )

            Planes.PLANE_BOTTOM -> _bottomPlane
        }

        newPlane.normal = -newPlane.normal
        newPlane.normalize()
        return newPlane
    }

    fun flippedY() = Projection(this).also {
        it.flipY()
    }

    fun jitterOffseted(pOffset: Vector2) = Projection(this).also {
        it.addJitterOffset(pOffset)
    }

    @Suppress("MemberVisibilityCanBePrivate")
    fun getZFar(): RealT {
        val newPlane = _farPlane

        newPlane.normal = -newPlane.normal
        newPlane.normalize()

        return newPlane.d
    }

    @Suppress("MemberVisibilityCanBePrivate")
    fun getZNear(): RealT {
        val newPlane = Plane(
            columns[0].w + columns[0].z,
            columns[1].w + columns[1].z,
            columns[2].w + columns[2].z,
            -columns[3].w - columns[3].z
        )

        newPlane.normalize()
        return newPlane.d
    }

    fun getAspect(): RealT {
        val vpHe = getViewportHalfExtents()
        return vpHe.x / vpHe.y
    }

    fun getFov(): RealT {
        val rightPlane = _rightPlane
        rightPlane.normalize()

        return if (columns[2].x == 0.0 && columns[2].y == 0.0) {
            Math.toDegrees(acos(abs(rightPlane.normal.x))) * 2.0
        } else {
            val leftPlane = _leftPlane
            leftPlane.normalize()

            Math.toDegrees(acos(abs(leftPlane.normal.x))) + Math.toDegrees(acos(abs(rightPlane.normal.x)))
        }
    }

    @Suppress("MemberVisibilityCanBePrivate")
    fun isOrthogonal() = columns[3][3] == 1.0

    @Suppress("MemberVisibilityCanBePrivate")
    fun getProjectionPlanes(pTransform: Transform3D): Array<Plane> {
        val nearPlane = Plane(
            columns[0].w + columns[0].z,
            columns[1].w + columns[1].z,
            columns[2].w + columns[2].z,
            columns[3].w + columns[3].z
        )

        nearPlane.normal = -nearPlane._normal
        nearPlane.normalize()

        val farPlane = _farPlane

        farPlane.normal = -farPlane.normal
        farPlane.normalize()

        val leftPlane = _leftPlane

        leftPlane.normal = -leftPlane.normal
        leftPlane.normalize()

        val topPlane = _topPlane

        topPlane.normal = -topPlane.normal
        topPlane.normalize()

        val rightPlane = Plane(
            columns[0].w - columns[0].x,
            columns[1].w - columns[1].x,
            columns[2].w - columns[2].x,
            columns[3].w - columns[3].x
        )

        rightPlane.normal = -rightPlane.normal
        rightPlane.normalize()

        val bottomPlane = _bottomPlane

        bottomPlane.normal = -bottomPlane.normal
        bottomPlane.normalize()

        return arrayOf(
            pTransform.xform(nearPlane),
            pTransform.xform(farPlane),
            pTransform.xform(leftPlane),
            pTransform.xform(topPlane),
            pTransform.xform(rightPlane),
            pTransform.xform(bottomPlane)
        )
    }

    fun getEndpoints(pTransform: Transform3D): Array<Vector3>? {
        val planes = getProjectionPlanes(Transform3D())
        val intersections = arrayOf(
            arrayOf(Planes.PLANE_FAR, Planes.PLANE_LEFT, Planes.PLANE_TOP),
            arrayOf(Planes.PLANE_FAR, Planes.PLANE_LEFT, Planes.PLANE_BOTTOM),
            arrayOf(Planes.PLANE_FAR, Planes.PLANE_RIGHT, Planes.PLANE_TOP),
            arrayOf(Planes.PLANE_FAR, Planes.PLANE_RIGHT, Planes.PLANE_BOTTOM),
            arrayOf(Planes.PLANE_NEAR, Planes.PLANE_LEFT, Planes.PLANE_TOP),
            arrayOf(Planes.PLANE_NEAR, Planes.PLANE_LEFT, Planes.PLANE_BOTTOM),
            arrayOf(Planes.PLANE_NEAR, Planes.PLANE_RIGHT, Planes.PLANE_TOP),
            arrayOf(Planes.PLANE_NEAR, Planes.PLANE_RIGHT, Planes.PLANE_BOTTOM)
        )

        return Array(8) { i: Int ->
            val a = planes[intersections[i][0].ordinal]
            val b = planes[intersections[i][1].ordinal]
            val c = planes[intersections[i][2].ordinal]

            val point = a.intersect3(b, c) ?: return null

            pTransform.xform(point)
        }
    }

    @Suppress("MemberVisibilityCanBePrivate", "DuplicatedCode")
    fun getViewportHalfExtents(): Vector2 {

        ////--- Near Plane ---///////
        val nearPlane = Plane(
            columns[0].w + columns[0].z,
            columns[1].w + columns[1].z,
            columns[2].w + columns[2].z,
            -columns[3].w - columns[3].z
        )
        nearPlane.normalize()

        ///////--- Right Plane ---///////
        val rightPlane = _rightPlane
        rightPlane.normalize()

        val topPlane = _topPlane
        topPlane.normalize()

        val res = nearPlane.intersect3(rightPlane, topPlane)

        return if (res == null) Vector2() else Vector2(res.x, res.y)
    }

    @Suppress("DuplicatedCode")
    fun getFarPlaneHalfExtents(): Vector2 {

        ////--- Far Plane ---///////
        val farPlane = Plane(
            columns[0].w - columns[0].z,
            columns[1].w - columns[1].z,
            columns[2].w - columns[2].z,
            -columns[3].w + columns[3].z
        )
        farPlane.normalize()

        ///////--- Right Plane ---///////
        val rightPlane = _rightPlane
        rightPlane.normalize()

        val topPlane = _topPlane
        topPlane.normalize()

        val res = farPlane.intersect3(rightPlane, topPlane)

        return if (res == null) Vector2() else Vector2(res.x, res.y)
    }

    @Suppress("DuplicatedCode")
    fun invert() {
        var i: Int
        var j: Int
        var k = 0

        /* Locations of pivot matrix */
        val pivotRows = arrayOf(0, 1, 2, 3)
        val pivotColumns = arrayOf(0, 1, 2, 3)

        /* Value of current pivot element */
        var pivotValue: RealT
        var hold: RealT
        var determinant: RealT = 1.0

        while (k < 4) {
            /** Locate k'th pivot element  */
            pivotValue = columns[k][k]
            /** Initialize for search  */
            pivotRows[k] = k
            pivotColumns[k] = k
            i = k
            while (i < 4) {
                j = k
                while (j < 4) {
                    if (abs(columns[i][j]) > abs(pivotValue)) {
                        pivotRows[k] = i
                        pivotColumns[k] = j
                        pivotValue = columns[i][j]
                    }
                    j++
                }
                i++
            }

            /** Product of pivots, gives determinant when finished  */
            determinant *= pivotValue
            if (GD.isZeroApprox(determinant)) {
                return
                /** Matrix is singular (zero determinant).  */
            }

            /** "Interchange" rows (with sign change stuff)  */
            i = pivotRows[k]
            if (i != k) {
                /** If rows are different  */
                j = 0
                while (j < 4) {
                    hold = -columns[k][j]
                    columns[k][j] = columns[i][j]
                    columns[i][j] = hold
                    j++
                }
            }

            /** "Interchange" columns  */
            j = pivotColumns[k]
            if (j != k) {
                /** If columns are different  */
                i = 0
                while (i < 4) {
                    hold = -columns[i][k]
                    columns[i][k] = columns[i][j]
                    columns[i][j] = hold
                    i++
                }
            }

            /** Divide column by minus pivot value  */
            i = 0
            while (i < 4) {
                if (i != k) {
                    columns[i][k] /= -pivotValue
                }
                i++
            }

            /** Reduce the matrix  */
            i = 0
            while (i < 4) {
                hold = columns[i][k]
                j = 0
                while (j < 4) {
                    if (i != k && j != k) {
                        columns[i][j] += hold * columns[k][j]
                    }
                    j++
                }
                i++
            }

            /** Divide row by pivot  */
            j = 0
            while (j < 4) {
                if (j != k) {
                    columns[k][j] /= pivotValue
                }
                j++
            }

            /** Replace pivot by reciprocal (at last we can touch it).  */
            columns[k][k] = 1.0 / pivotValue
            k++
        }

        /* That was most of the work, one final pass of row/column interchange */
        /* to finish */
        /* Don't need to work with 1 by 1 corner*/
        k = 4 - 2
        while (k >= 0) {
            /* Rows to swap correspond to pivot COLUMN */
            i = pivotColumns[k]
            if (i != k) { /* If rows are different */
                j = 0
                while (j < 4) {
                    hold = columns[k][j]
                    columns[k][j] = -columns[i][j]
                    columns[i][j] = hold
                    j++
                }
            }

            /* Columns to swap correspond to pivot ROW */
            j = pivotRows[k]
            if (j != k) { /* If columns are different */
                i = 0
                while (i < 4) {
                    hold = columns[i][k]
                    columns[i][k] = -columns[i][j]
                    columns[i][j] = hold
                    i++
                }
            }
            k--
        }
    }

    fun inverse() = Projection(this).also {
        it.invert()
    }

    fun xform4(plane: Plane) = Plane(
        Vector3(
            columns[0][0] * plane.normal.x + columns[1][0] * plane.normal.y + columns[2][0] * plane.normal.z + columns[3][0] * plane.d,
            columns[0][1] * plane.normal.x + columns[1][1] * plane.normal.y + columns[2][1] * plane.normal.z + columns[3][1] * plane.d,
            columns[0][2] * plane.normal.x + columns[1][2] * plane.normal.y + columns[2][2] * plane.normal.z + columns[3][2] * plane.d
        ),
        columns[0][3] * plane.normal.x + columns[1][3] * plane.normal.y + columns[2][3] * plane.normal.z + columns[3][3] * plane.d
    )

    fun xform(vec3: Vector3): Vector3 {
        val ret = Vector3(
            columns[0][0] * vec3.x + columns[1][0] * vec3.y + columns[2][0] * vec3.z + columns[3][0],
            columns[0][1] * vec3.x + columns[1][1] * vec3.y + columns[2][1] * vec3.z + columns[3][1],
            columns[0][2] * vec3.x + columns[1][2] * vec3.y + columns[2][2] * vec3.z + columns[3][2]
        )
        val w: RealT = columns[0][3] * vec3.x + columns[1][3] * vec3.y + columns[2][3] * vec3.z + columns[3][3]
        return ret / w
    }

    @Suppress("DuplicatedCode")
    fun xform(vec4: Vector4) = Vector4(
        columns[0][0] * vec4.x + columns[1][0] * vec4.y + columns[2][0] * vec4.z + columns[3][0] * vec4.w,
        columns[0][1] * vec4.x + columns[1][1] * vec4.y + columns[2][1] * vec4.z + columns[3][1] * vec4.w,
        columns[0][2] * vec4.x + columns[1][2] * vec4.y + columns[2][2] * vec4.z + columns[3][2] * vec4.w,
        columns[0][3] * vec4.x + columns[1][3] * vec4.y + columns[2][3] * vec4.z + columns[3][3] * vec4.w
    )

    @Suppress("DuplicatedCode")
    fun xformInv(vec4: Vector4) = Vector4(
        columns[0][0] * vec4.x + columns[0][1] * vec4.y + columns[0][2] * vec4.z + columns[0][3] * vec4.w,
        columns[1][0] * vec4.x + columns[1][1] * vec4.y + columns[1][2] * vec4.z + columns[1][3] * vec4.w,
        columns[2][0] * vec4.x + columns[2][1] * vec4.y + columns[2][2] * vec4.z + columns[2][3] * vec4.w,
        columns[3][0] * vec4.x + columns[3][1] * vec4.y + columns[3][2] * vec4.z + columns[3][3] * vec4.w
    )

    fun scaleTranslateToFit(pAabb: AABB) {
        val min: Vector3 = pAabb.position
        val max: Vector3 = pAabb.position + pAabb.size

        columns[0][0] = 2 / (max.x - min.x)
        columns[1][0] = 0.0
        columns[2][0] = 0.0
        columns[3][0] = -(max.x + min.x) / (max.x - min.x)

        columns[0][1] = 0.0
        columns[1][1] = 2 / (max.y - min.y)
        columns[2][1] = 0.0
        columns[3][1] = -(max.y + min.y) / (max.y - min.y)

        columns[0][2] = 0.0
        columns[1][2] = 0.0
        columns[2][2] = 2 / (max.z - min.z)
        columns[3][2] = -(max.z + min.z) / (max.z - min.z)

        columns[0][3] = 0.0
        columns[1][3] = 0.0
        columns[2][3] = 0.0
        columns[3][3] = 1.0
    }

    @Suppress("MemberVisibilityCanBePrivate")
    fun addJitterOffset(pOffset: Vector2) {
        columns[3][0] += pOffset.x
        columns[3][1] += pOffset.y
    }

    fun makeScale(scale: Vector3) {
        setIdentity()
        columns[0][0] = scale.x
        columns[1][1] = scale.y
        columns[2][2] = scale.z
    }

    fun getPixelPerMeter(pixelWidth: Int): Int {
        val result = xform(Vector3(1, 0, -1))
        return ((result.x * 0.5 + 0.5) * pixelWidth).toInt()
    }

    @Suppress("MemberVisibilityCanBePrivate")
    fun flipY() {
        for (i in 0..3) {
            columns[1][i] = -columns[1][i]
        }
    }

    fun getLodMultiplier() = if (isOrthogonal()) {
        getViewportHalfExtents().x
    } else {
        val zNear = getZNear()
        val width = getViewportHalfExtents().x * 2.0
        1.0 / (zNear / width)
    }

    operator fun times(matrix: Projection): Projection {
        val newMatrix = Projection()

        for (j in 0..3) {
            for (i in 0..3) {
                var ab: RealT = 0.0
                for (k in 0..3) {
                    ab += columns[k][i] * matrix.columns[j][k]
                }
                newMatrix.columns[j][i] = ab
            }
        }

        return newMatrix
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Projection

        if (!columns.contentEquals(other.columns)) return false

        return true
    }

    override fun hashCode(): Int {
        return columns.contentHashCode()
    }

    fun toTransform3D(): Transform3D {
        val transform = Transform3D()

        transform.basis._x[0] = columns[0].x
        transform.basis._y[0] = columns[0].y
        transform.basis._z[0] = columns[0].z

        transform.basis._x[1] = columns[1].x
        transform.basis._y[1] = columns[1].y
        transform.basis._z[1] = columns[1].z

        transform.basis._x[2] = columns[2].x
        transform.basis._y[2] = columns[2].y
        transform.basis._z[2] = columns[2].z

        transform.origin.x = columns[3].x
        transform.origin.y = columns[3].y
        transform.origin.z = columns[3].z

        return transform
    }

    override fun toString() = buildString {
        for (i in 0..3) {
            for (j in 0..3) {
                append(if (j > 0) ", " else "\n")
                append(columns[i][j])
            }
        }
    }

    private fun set(projection: Projection) {
        this.columns[0] = projection.columns[0]
        this.columns[1] = projection.columns[1]
        this.columns[2] = projection.columns[2]
        this.columns[3] = projection.columns[3]
    }

    companion object {
        fun createDepthCorrection(pFlipY: Boolean) = Projection().also {
            it.setDepthCorrection(pFlipY)
        }

        fun createLightAtlasRect(pRect: Rect2) = Projection().also {
            it.setLightAtlasRect(pRect)
        }

        fun createPerspective(pFovyDegrees: RealT, aspect: RealT, zNear: RealT, zFar: RealT, flipFov: Boolean) =
            Projection().also {
                it.setPerspective(pFovyDegrees, aspect, zNear, zFar, flipFov)
            }

        fun createPerspectiveHmd(
            pFovyDegrees: RealT,
            aspect: RealT,
            zNear: RealT,
            zFar: RealT,
            flipFov: Boolean,
            eye: Int,
            intraocularDist: RealT,
            convergenceDist: RealT
        ) = Projection().also {
            it.setPerspective(
                pFovyDegrees,
                aspect,
                zNear,
                zFar,
                flipFov,
                eye,
                intraocularDist,
                convergenceDist
            )
        }

        fun createForHmd(
            pEye: Int,
            pAspect: RealT,
            pIntraocularDist: RealT,
            pDisplayWidth: RealT,
            pDisplayToLens: RealT,
            pOversample: RealT,
            pZNear: RealT,
            pZFar: RealT
        ) = Projection().also {
            it.setForHmd(pEye, pAspect, pIntraocularDist, pDisplayWidth, pDisplayToLens, pOversample, pZNear, pZFar)
        }

        fun createOrthogonal(pLeft: RealT, pRight: RealT, pBottom: RealT, pTop: RealT, pZnear: RealT, pZfar: RealT) =
            Projection().also {
                it.setOrthogonal(pLeft, pRight, pBottom, pTop, pZnear, pZfar)
            }

        fun createOrthogonalAspect(pSize: RealT, pAspect: RealT, pZnear: RealT, pZfar: RealT, pFlipFov: Boolean) =
            Projection().also {
                it.setOrthogonal(pSize, pAspect, pZnear, pZfar, pFlipFov)
            }

        fun createFrustrum(left: RealT, right: RealT, bottom: RealT, top: RealT, near: RealT, far: RealT) =
            Projection().also {
                it.setFrustrum(left, right, bottom, top, near, far)
            }

        fun createFrustrumAspect(
            pSize: RealT,
            aspect: RealT,
            offset: Vector2,
            near: RealT,
            far: RealT,
            flipFov: Boolean
        ) = Projection().also {
            it.setFrustrum(pSize, aspect, offset, near, far, flipFov)
        }

        fun createFitAabb(pAabb: AABB) = Projection().also {
            it.scaleTranslateToFit(pAabb)
        }


        fun getFovy(fovx: RealT, aspect: RealT): RealT = Math.toDegrees(
            atan(
                aspect * tan(Math.toRadians(fovx) * 0.5)
            ) * 2.0
        )
    }
}