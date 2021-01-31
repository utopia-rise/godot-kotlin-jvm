// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.Plane
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.PLANE
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
object Geometry : Object() {
  final const val END_BUTT: Long = 2

  final const val END_JOINED: Long = 1

  final const val END_POLYGON: Long = 0

  final const val END_ROUND: Long = 4

  final const val END_SQUARE: Long = 3

  final const val JOIN_MITER: Long = 2

  final const val JOIN_ROUND: Long = 1

  final const val JOIN_SQUARE: Long = 0

  final const val OPERATION_DIFFERENCE: Long = 1

  final const val OPERATION_INTERSECTION: Long = 2

  final const val OPERATION_UNION: Long = 0

  final const val OPERATION_XOR: Long = 3

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_GEOMETRY)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun buildBoxPlanes(extents: Vector3): VariantArray<Any?> {
    TransferContext.writeArguments(VECTOR3 to extents)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_BUILD_BOX_PLANES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun buildCapsulePlanes(
    radius: Double,
    height: Double,
    sides: Long,
    lats: Long,
    axis: Long = 2
  ): VariantArray<Any?> {
    TransferContext.writeArguments(DOUBLE to radius, DOUBLE to height, LONG to sides, LONG to lats,
        LONG to axis)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_BUILD_CAPSULE_PLANES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun buildCylinderPlanes(
    radius: Double,
    height: Double,
    sides: Long,
    axis: Long = 2
  ): VariantArray<Any?> {
    TransferContext.writeArguments(DOUBLE to radius, DOUBLE to height, LONG to sides, LONG to axis)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_BUILD_CYLINDER_PLANES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun clipPolygon(points: PoolVector3Array, plane: Plane): PoolVector3Array {
    TransferContext.writeArguments(POOL_VECTOR3_ARRAY to points, PLANE to plane)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_CLIP_POLYGON,
        POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  fun clipPolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polygonA, POOL_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_CLIP_POLYGONS_2D, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun clipPolylineWithPolygon2d(polyline: PoolVector2Array, polygon: PoolVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polyline, POOL_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_CLIP_POLYLINE_WITH_POLYGON_2D, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun convexHull2d(points: PoolVector2Array): PoolVector2Array {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_CONVEX_HULL_2D,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }

  fun excludePolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polygonA, POOL_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_EXCLUDE_POLYGONS_2D,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun getClosestPointToSegment(
    point: Vector3,
    s1: Vector3,
    s2: Vector3
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to point, VECTOR3 to s1, VECTOR3 to s2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_GET_CLOSEST_POINT_TO_SEGMENT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  fun getClosestPointToSegment2d(
    point: Vector2,
    s1: Vector2,
    s2: Vector2
  ): Vector2 {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to s1, VECTOR2 to s2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_GET_CLOSEST_POINT_TO_SEGMENT_2D, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  fun getClosestPointToSegmentUncapped(
    point: Vector3,
    s1: Vector3,
    s2: Vector3
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to point, VECTOR3 to s1, VECTOR3 to s2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_GET_CLOSEST_POINT_TO_SEGMENT_UNCAPPED, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  fun getClosestPointToSegmentUncapped2d(
    point: Vector2,
    s1: Vector2,
    s2: Vector2
  ): Vector2 {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to s1, VECTOR2 to s2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_GET_CLOSEST_POINT_TO_SEGMENT_UNCAPPED_2D, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  fun getClosestPointsBetweenSegments(
    p1: Vector3,
    p2: Vector3,
    q1: Vector3,
    q2: Vector3
  ): PoolVector3Array {
    TransferContext.writeArguments(VECTOR3 to p1, VECTOR3 to p2, VECTOR3 to q1, VECTOR3 to q2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_GET_CLOSEST_POINTS_BETWEEN_SEGMENTS, POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  fun getClosestPointsBetweenSegments2d(
    p1: Vector2,
    q1: Vector2,
    p2: Vector2,
    q2: Vector2
  ): PoolVector2Array {
    TransferContext.writeArguments(VECTOR2 to p1, VECTOR2 to q1, VECTOR2 to p2, VECTOR2 to q2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_GET_CLOSEST_POINTS_BETWEEN_SEGMENTS_2D,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }

  fun getUv84NormalBit(normal: Vector3): Long {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_GET_UV84_NORMAL_BIT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun intersectPolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polygonA, POOL_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_INTERSECT_POLYGONS_2D,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun intersectPolylineWithPolygon2d(polyline: PoolVector2Array, polygon: PoolVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polyline, POOL_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_INTERSECT_POLYLINE_WITH_POLYGON_2D, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun isPointInCircle(
    point: Vector2,
    circlePosition: Vector2,
    circleRadius: Double
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to circlePosition, DOUBLE to
        circleRadius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_IS_POINT_IN_CIRCLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isPointInPolygon(point: Vector2, polygon: PoolVector2Array): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, POOL_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_IS_POINT_IN_POLYGON, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isPolygonClockwise(polygon: PoolVector2Array): Boolean {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_IS_POLYGON_CLOCKWISE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun lineIntersectsLine2d(
    fromA: Vector2,
    dirA: Vector2,
    fromB: Vector2,
    dirB: Vector2
  ): Any? {
    TransferContext.writeArguments(VECTOR2 to fromA, VECTOR2 to dirA, VECTOR2 to fromB, VECTOR2 to
        dirB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_LINE_INTERSECTS_LINE_2D,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun makeAtlas(sizes: PoolVector2Array): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to sizes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_MAKE_ATLAS, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  fun mergePolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polygonA, POOL_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_MERGE_POLYGONS_2D, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun offsetPolygon2d(
    polygon: PoolVector2Array,
    delta: Double,
    joinType: Long = 0
  ): VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polygon, DOUBLE to delta, LONG to joinType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_OFFSET_POLYGON_2D, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun offsetPolyline2d(
    polyline: PoolVector2Array,
    delta: Double,
    joinType: Long = 0,
    endType: Long = 3
  ): VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polyline, DOUBLE to delta, LONG to
        joinType, LONG to endType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_OFFSET_POLYLINE_2D, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun pointIsInsideTriangle(
    point: Vector2,
    a: Vector2,
    b: Vector2,
    c: Vector2
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to a, VECTOR2 to b, VECTOR2 to c)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_POINT_IS_INSIDE_TRIANGLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun rayIntersectsTriangle(
    from: Vector3,
    dir: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3
  ): Any? {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to dir, VECTOR3 to a, VECTOR3 to b,
        VECTOR3 to c)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_RAY_INTERSECTS_TRIANGLE,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun segmentIntersectsCircle(
    segmentFrom: Vector2,
    segmentTo: Vector2,
    circlePosition: Vector2,
    circleRadius: Double
  ): Double {
    TransferContext.writeArguments(VECTOR2 to segmentFrom, VECTOR2 to segmentTo, VECTOR2 to
        circlePosition, DOUBLE to circleRadius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_SEGMENT_INTERSECTS_CIRCLE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun segmentIntersectsConvex(
    from: Vector3,
    to: Vector3,
    planes: VariantArray<Any?>
  ): PoolVector3Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, ARRAY to planes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_SEGMENT_INTERSECTS_CONVEX,
        POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  fun segmentIntersectsCylinder(
    from: Vector3,
    to: Vector3,
    height: Double,
    radius: Double
  ): PoolVector3Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, DOUBLE to height, DOUBLE to
        radius)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_SEGMENT_INTERSECTS_CYLINDER, POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  fun segmentIntersectsSegment2d(
    fromA: Vector2,
    toA: Vector2,
    fromB: Vector2,
    toB: Vector2
  ): Any? {
    TransferContext.writeArguments(VECTOR2 to fromA, VECTOR2 to toA, VECTOR2 to fromB, VECTOR2 to
        toB)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_SEGMENT_INTERSECTS_SEGMENT_2D, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun segmentIntersectsSphere(
    from: Vector3,
    to: Vector3,
    spherePosition: Vector3,
    sphereRadius: Double
  ): PoolVector3Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, VECTOR3 to spherePosition, DOUBLE
        to sphereRadius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_SEGMENT_INTERSECTS_SPHERE,
        POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  fun segmentIntersectsTriangle(
    from: Vector3,
    to: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3
  ): Any? {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, VECTOR3 to a, VECTOR3 to b,
        VECTOR3 to c)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_SEGMENT_INTERSECTS_TRIANGLE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun triangulateDelaunay2d(points: PoolVector2Array): PoolIntArray {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_TRIANGULATE_DELAUNAY_2D,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  fun triangulatePolygon(polygon: PoolVector2Array): PoolIntArray {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_TRIANGULATE_POLYGON,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  enum class PolyEndType(
    id: Long
  ) {
    END_POLYGON(0),

    END_JOINED(1),

    END_BUTT(2),

    END_SQUARE(3),

    END_ROUND(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class PolyBooleanOperation(
    id: Long
  ) {
    OPERATION_UNION(0),

    OPERATION_DIFFERENCE(1),

    OPERATION_INTERSECTION(2),

    OPERATION_XOR(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class PolyJoinType(
    id: Long
  ) {
    JOIN_SQUARE(0),

    JOIN_ROUND(1),

    JOIN_MITER(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
