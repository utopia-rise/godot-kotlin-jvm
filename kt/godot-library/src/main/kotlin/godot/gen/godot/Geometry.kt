// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Helper node to calculate generic geometry operations.
 *
 * Geometry provides users with a set of helper functions to create geometric shapes, compute intersections between shapes, and process various other geometric operations.
 */
@GodotBaseType
public object Geometry : Object() {
  /**
   * Endpoints are squared off with no extension.
   */
  public final const val END_BUTT: Long = 2

  /**
   * Endpoints are joined using the [enum PolyJoinType] value and the path filled as a polyline.
   */
  public final const val END_JOINED: Long = 1

  /**
   * Endpoints are joined using the [enum PolyJoinType] value and the path filled as a polygon.
   */
  public final const val END_POLYGON: Long = 0

  /**
   * Endpoints are rounded off and extended by `delta` units.
   */
  public final const val END_ROUND: Long = 4

  /**
   * Endpoints are squared off and extended by `delta` units.
   */
  public final const val END_SQUARE: Long = 3

  /**
   * There's a necessary limit to mitered joins since offsetting edges that join at very acute angles will produce excessively long and narrow "spikes". For any given edge join, when miter offsetting would exceed that maximum distance, "square" joining is applied.
   */
  public final const val JOIN_MITER: Long = 2

  /**
   * While flattened paths can never perfectly trace an arc, they are approximated by a series of arc chords.
   */
  public final const val JOIN_ROUND: Long = 1

  /**
   * Squaring is applied uniformally at all convex edge joins at `1 * delta`.
   */
  public final const val JOIN_SQUARE: Long = 0

  /**
   * Create regions where subject polygons are filled except where clip polygons are filled.
   */
  public final const val OPERATION_DIFFERENCE: Long = 1

  /**
   * Create regions where both subject and clip polygons are filled.
   */
  public final const val OPERATION_INTERSECTION: Long = 2

  /**
   * Create regions where either subject or clip polygons (or both) are filled.
   */
  public final const val OPERATION_UNION: Long = 0

  /**
   * Create regions where either subject or clip polygons are filled but not where both are filled.
   */
  public final const val OPERATION_XOR: Long = 3

  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_GEOMETRY)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Returns an array with 6 [godot.core.Plane]s that describe the sides of a box centered at the origin. The box size is defined by `extents`, which represents one (positive) corner of the box (i.e. half its actual size).
   */
  public fun buildBoxPlanes(extents: Vector3): VariantArray<Any?> {
    TransferContext.writeArguments(VECTOR3 to extents)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_BUILD_BOX_PLANES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns an array of [godot.core.Plane]s closely bounding a faceted capsule centered at the origin with radius `radius` and height `height`. The parameter `sides` defines how many planes will be generated for the side part of the capsule, whereas `lats` gives the number of latitudinal steps at the bottom and top of the capsule. The parameter `axis` describes the axis along which the capsule is oriented (0 for X, 1 for Y, 2 for Z).
   */
  public fun buildCapsulePlanes(
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

  /**
   * Returns an array of [godot.core.Plane]s closely bounding a faceted cylinder centered at the origin with radius `radius` and height `height`. The parameter `sides` defines how many planes will be generated for the round part of the cylinder. The parameter `axis` describes the axis along which the cylinder is oriented (0 for X, 1 for Y, 2 for Z).
   */
  public fun buildCylinderPlanes(
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

  /**
   * Clips the polygon defined by the points in `points` against the `plane` and returns the points of the clipped polygon.
   */
  public fun clipPolygon(points: PoolVector3Array, plane: Plane): PoolVector3Array {
    TransferContext.writeArguments(POOL_VECTOR3_ARRAY to points, PLANE to plane)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_CLIP_POLYGON,
        POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  /**
   * Clips `polygon_a` against `polygon_b` and returns an array of clipped polygons. This performs [OPERATION_DIFFERENCE] between polygons. Returns an empty array if `polygon_b` completely overlaps `polygon_a`.
   *
   * If `polygon_b` is enclosed by `polygon_a`, returns an outer polygon (boundary) and inner polygon (hole) which could be distinguished by calling [isPolygonClockwise].
   */
  public fun clipPolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polygonA, POOL_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_CLIP_POLYGONS_2D, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Clips `polyline` against `polygon` and returns an array of clipped polylines. This performs [OPERATION_DIFFERENCE] between the polyline and the polygon. This operation can be thought of as cutting a line with a closed shape.
   */
  public fun clipPolylineWithPolygon2d(polyline: PoolVector2Array, polygon: PoolVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polyline, POOL_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_CLIP_POLYLINE_WITH_POLYGON_2D, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Given an array of [godot.core.Vector2]s, returns the convex hull as a list of points in counterclockwise order. The last point is the same as the first one.
   */
  public fun convexHull2d(points: PoolVector2Array): PoolVector2Array {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_CONVEX_HULL_2D,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }

  /**
   * Mutually excludes common area defined by intersection of `polygon_a` and `polygon_b` (see [intersectPolygons2d]) and returns an array of excluded polygons. This performs [OPERATION_XOR] between polygons. In other words, returns all but common area between polygons.
   *
   * The operation may result in an outer polygon (boundary) and inner polygon (hole) produced which could be distinguished by calling [isPolygonClockwise].
   */
  public fun excludePolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polygonA, POOL_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_EXCLUDE_POLYGONS_2D,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the 3D point on the 3D segment (`s1`, `s2`) that is closest to `point`. The returned point will always be inside the specified segment.
   */
  public fun getClosestPointToSegment(
    point: Vector3,
    s1: Vector3,
    s2: Vector3
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to point, VECTOR3 to s1, VECTOR3 to s2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_GET_CLOSEST_POINT_TO_SEGMENT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the 2D point on the 2D segment (`s1`, `s2`) that is closest to `point`. The returned point will always be inside the specified segment.
   */
  public fun getClosestPointToSegment2d(
    point: Vector2,
    s1: Vector2,
    s2: Vector2
  ): Vector2 {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to s1, VECTOR2 to s2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_GET_CLOSEST_POINT_TO_SEGMENT_2D, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the 3D point on the 3D line defined by (`s1`, `s2`) that is closest to `point`. The returned point can be inside the segment (`s1`, `s2`) or outside of it, i.e. somewhere on the line extending from the segment.
   */
  public fun getClosestPointToSegmentUncapped(
    point: Vector3,
    s1: Vector3,
    s2: Vector3
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to point, VECTOR3 to s1, VECTOR3 to s2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_GET_CLOSEST_POINT_TO_SEGMENT_UNCAPPED, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the 2D point on the 2D line defined by (`s1`, `s2`) that is closest to `point`. The returned point can be inside the segment (`s1`, `s2`) or outside of it, i.e. somewhere on the line extending from the segment.
   */
  public fun getClosestPointToSegmentUncapped2d(
    point: Vector2,
    s1: Vector2,
    s2: Vector2
  ): Vector2 {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to s1, VECTOR2 to s2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_GET_CLOSEST_POINT_TO_SEGMENT_UNCAPPED_2D, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Given the two 3D segments (`p1`, `p2`) and (`q1`, `q2`), finds those two points on the two segments that are closest to each other. Returns a [godot.core.PoolVector3Array] that contains this point on (`p1`, `p2`) as well the accompanying point on (`q1`, `q2`).
   */
  public fun getClosestPointsBetweenSegments(
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

  /**
   * Given the two 2D segments (`p1`, `q1`) and (`p2`, `q2`), finds those two points on the two segments that are closest to each other. Returns a [godot.core.PoolVector2Array] that contains this point on (`p1`, `q1`) as well the accompanying point on (`p2`, `q2`).
   */
  public fun getClosestPointsBetweenSegments2d(
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

  /**
   * Used internally by the engine.
   */
  public fun getUv84NormalBit(normal: Vector3): Long {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_GET_UV84_NORMAL_BIT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Intersects `polygon_a` with `polygon_b` and returns an array of intersected polygons. This performs [OPERATION_INTERSECTION] between polygons. In other words, returns common area shared by polygons. Returns an empty array if no intersection occurs.
   *
   * The operation may result in an outer polygon (boundary) and inner polygon (hole) produced which could be distinguished by calling [isPolygonClockwise].
   */
  public fun intersectPolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polygonA, POOL_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_INTERSECT_POLYGONS_2D,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Intersects `polyline` with `polygon` and returns an array of intersected polylines. This performs [OPERATION_INTERSECTION] between the polyline and the polygon. This operation can be thought of as chopping a line with a closed shape.
   */
  public fun intersectPolylineWithPolygon2d(polyline: PoolVector2Array, polygon: PoolVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polyline, POOL_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__GEOMETRY_INTERSECT_POLYLINE_WITH_POLYGON_2D, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns `true` if `point` is inside the circle or if it's located exactly *on* the circle's boundary, otherwise returns `false`.
   */
  public fun isPointInCircle(
    point: Vector2,
    circlePosition: Vector2,
    circleRadius: Double
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to circlePosition, DOUBLE to
        circleRadius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_IS_POINT_IN_CIRCLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if `point` is inside `polygon` or if it's located exactly *on* polygon's boundary, otherwise returns `false`.
   */
  public fun isPointInPolygon(point: Vector2, polygon: PoolVector2Array): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, POOL_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_IS_POINT_IN_POLYGON, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if `polygon`'s vertices are ordered in clockwise order, otherwise returns `false`.
   */
  public fun isPolygonClockwise(polygon: PoolVector2Array): Boolean {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_IS_POLYGON_CLOCKWISE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Checks if the two lines (`from_a`, `dir_a`) and (`from_b`, `dir_b`) intersect. If yes, return the point of intersection as [godot.core.Vector2]. If no intersection takes place, returns an empty [Variant].
   *
   * **Note:** The lines are specified using direction vectors, not end points.
   */
  public fun lineIntersectsLine2d(
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

  /**
   * Given an array of [godot.core.Vector2]s representing tiles, builds an atlas. The returned dictionary has two keys: `points` is a vector of [godot.core.Vector2] that specifies the positions of each tile, `size` contains the overall size of the whole atlas as [godot.core.Vector2].
   */
  public fun makeAtlas(sizes: PoolVector2Array): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to sizes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_MAKE_ATLAS, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Merges (combines) `polygon_a` and `polygon_b` and returns an array of merged polygons. This performs [OPERATION_UNION] between polygons.
   *
   * The operation may result in an outer polygon (boundary) and multiple inner polygons (holes) produced which could be distinguished by calling [isPolygonClockwise].
   */
  public fun mergePolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polygonA, POOL_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_MERGE_POLYGONS_2D, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Inflates or deflates `polygon` by `delta` units (pixels). If `delta` is positive, makes the polygon grow outward. If `delta` is negative, shrinks the polygon inward. Returns an array of polygons because inflating/deflating may result in multiple discrete polygons. Returns an empty array if `delta` is negative and the absolute value of it approximately exceeds the minimum bounding rectangle dimensions of the polygon.
   *
   * Each polygon's vertices will be rounded as determined by `join_type`, see [enum PolyJoinType].
   *
   * The operation may result in an outer polygon (boundary) and inner polygon (hole) produced which could be distinguished by calling [isPolygonClockwise].
   *
   * **Note:** To translate the polygon's vertices specifically, use the [godot.Transform2D.xform] method:
   *
   * ```
   * 				var polygon = PoolVector2Array([godot.Vector2(0, 0), Vector2(100, 0), Vector2(100, 100), Vector2(0, 100)])
   * 				var offset = Vector2(50, 50)
   * 				polygon = Transform2D(0, offset).xform(polygon)
   * 				print(polygon) # prints [godot.Vector2(50, 50), Vector2(150, 50), Vector2(150, 150), Vector2(50, 150)]
   * 				```
   */
  public fun offsetPolygon2d(
    polygon: PoolVector2Array,
    delta: Double,
    joinType: Long = 0
  ): VariantArray<Any?> {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polygon, DOUBLE to delta, LONG to joinType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_OFFSET_POLYGON_2D, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Inflates or deflates `polyline` by `delta` units (pixels), producing polygons. If `delta` is positive, makes the polyline grow outward. Returns an array of polygons because inflating/deflating may result in multiple discrete polygons. If `delta` is negative, returns an empty array.
   *
   * Each polygon's vertices will be rounded as determined by `join_type`, see [enum PolyJoinType].
   *
   * Each polygon's endpoints will be rounded as determined by `end_type`, see [enum PolyEndType].
   *
   * The operation may result in an outer polygon (boundary) and inner polygon (hole) produced which could be distinguished by calling [isPolygonClockwise].
   */
  public fun offsetPolyline2d(
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

  /**
   * Returns if `point` is inside the triangle specified by `a`, `b` and `c`.
   */
  public fun pointIsInsideTriangle(
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

  /**
   * Tests if the 3D ray starting at `from` with the direction of `dir` intersects the triangle specified by `a`, `b` and `c`. If yes, returns the point of intersection as [godot.core.Vector3]. If no intersection takes place, an empty [Variant] is returned.
   */
  public fun rayIntersectsTriangle(
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

  /**
   * Given the 2D segment (`segment_from`, `segment_to`), returns the position on the segment (as a number between 0 and 1) at which the segment hits the circle that is located at position `circle_position` and has radius `circle_radius`. If the segment does not intersect the circle, -1 is returned (this is also the case if the line extending the segment would intersect the circle, but the segment does not).
   */
  public fun segmentIntersectsCircle(
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

  /**
   * Given a convex hull defined though the [godot.core.Plane]s in the array `planes`, tests if the segment (`from`, `to`) intersects with that hull. If an intersection is found, returns a [godot.core.PoolVector3Array] containing the point the intersection and the hull's normal. If no intersecion is found, an the returned array is empty.
   */
  public fun segmentIntersectsConvex(
    from: Vector3,
    to: Vector3,
    planes: VariantArray<Any?>
  ): PoolVector3Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, ARRAY to planes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_SEGMENT_INTERSECTS_CONVEX,
        POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  /**
   * Checks if the segment (`from`, `to`) intersects the cylinder with height `height` that is centered at the origin and has radius `radius`. If no, returns an empty [godot.core.PoolVector3Array]. If an intersection takes place, the returned array contains the point of intersection and the cylinder's normal at the point of intersection.
   */
  public fun segmentIntersectsCylinder(
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

  /**
   * Checks if the two segments (`from_a`, `to_a`) and (`from_b`, `to_b`) intersect. If yes, return the point of intersection as [godot.core.Vector2]. If no intersection takes place, returns an empty [Variant].
   */
  public fun segmentIntersectsSegment2d(
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

  /**
   * Checks if the segment (`from`, `to`) intersects the sphere that is located at `sphere_position` and has radius `sphere_radius`. If no, returns an empty [godot.core.PoolVector3Array]. If yes, returns a [godot.core.PoolVector3Array] containing the point of intersection and the sphere's normal at the point of intersection.
   */
  public fun segmentIntersectsSphere(
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

  /**
   * Tests if the segment (`from`, `to`) intersects the triangle `a`, `b`, `c`. If yes, returns the point of intersection as [godot.core.Vector3]. If no intersection takes place, an empty [Variant] is returned.
   */
  public fun segmentIntersectsTriangle(
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

  /**
   * Triangulates the area specified by discrete set of `points` such that no point is inside the circumcircle of any resulting triangle. Returns a [godot.core.PoolIntArray] where each triangle consists of three consecutive point indices into `points` (i.e. the returned array will have `n * 3` elements, with `n` being the number of found triangles). If the triangulation did not succeed, an empty [godot.core.PoolIntArray] is returned.
   */
  public fun triangulateDelaunay2d(points: PoolVector2Array): PoolIntArray {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_TRIANGULATE_DELAUNAY_2D,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Triangulates the polygon specified by the points in `polygon`. Returns a [godot.core.PoolIntArray] where each triangle consists of three consecutive point indices into `polygon` (i.e. the returned array will have `n * 3` elements, with `n` being the number of found triangles). If the triangulation did not succeed, an empty [godot.core.PoolIntArray] is returned.
   */
  public fun triangulatePolygon(polygon: PoolVector2Array): PoolIntArray {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__GEOMETRY_TRIANGULATE_POLYGON,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  public enum class PolyEndType(
    id: Long
  ) {
    /**
     * Endpoints are joined using the [enum PolyJoinType] value and the path filled as a polygon.
     */
    END_POLYGON(0),
    /**
     * Endpoints are joined using the [enum PolyJoinType] value and the path filled as a polyline.
     */
    END_JOINED(1),
    /**
     * Endpoints are squared off with no extension.
     */
    END_BUTT(2),
    /**
     * Endpoints are squared off and extended by `delta` units.
     */
    END_SQUARE(3),
    /**
     * Endpoints are rounded off and extended by `delta` units.
     */
    END_ROUND(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class PolyBooleanOperation(
    id: Long
  ) {
    /**
     * Create regions where either subject or clip polygons (or both) are filled.
     */
    OPERATION_UNION(0),
    /**
     * Create regions where subject polygons are filled except where clip polygons are filled.
     */
    OPERATION_DIFFERENCE(1),
    /**
     * Create regions where both subject and clip polygons are filled.
     */
    OPERATION_INTERSECTION(2),
    /**
     * Create regions where either subject or clip polygons are filled but not where both are filled.
     */
    OPERATION_XOR(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class PolyJoinType(
    id: Long
  ) {
    /**
     * Squaring is applied uniformally at all convex edge joins at `1 * delta`.
     */
    JOIN_SQUARE(0),
    /**
     * While flattened paths can never perfectly trace an arc, they are approximated by a series of arc chords.
     */
    JOIN_ROUND(1),
    /**
     * There's a necessary limit to mitered joins since offsetting edges that join at very acute angles will produce excessively long and narrow "spikes". For any given edge join, when miter offsetting would exceed that maximum distance, "square" joining is applied.
     */
    JOIN_MITER(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}
