// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedInt32Array
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * Provides a set of helper functions to create geometric shapes, compute intersections between
 * shapes, and process various other geometric operations in 2D.
 */
@GodotBaseType
public object Geometry2D : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_GEOMETRY2D)
    return false
  }

  /**
   * Returns `true` if [point] is inside the circle or if it's located exactly *on* the circle's
   * boundary, otherwise returns `false`.
   */
  public fun isPointInCircle(
    point: Vector2,
    circlePosition: Vector2,
    circleRadius: Float,
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to circlePosition, DOUBLE to circleRadius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.isPointInCirclePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Given the 2D segment ([segmentFrom], [segmentTo]), returns the position on the segment (as a
   * number between 0 and 1) at which the segment hits the circle that is located at position
   * [circlePosition] and has radius [circleRadius]. If the segment does not intersect the circle, -1
   * is returned (this is also the case if the line extending the segment would intersect the circle,
   * but the segment does not).
   */
  public fun segmentIntersectsCircle(
    segmentFrom: Vector2,
    segmentTo: Vector2,
    circlePosition: Vector2,
    circleRadius: Float,
  ): Float {
    TransferContext.writeArguments(VECTOR2 to segmentFrom, VECTOR2 to segmentTo, VECTOR2 to circlePosition, DOUBLE to circleRadius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.segmentIntersectsCirclePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Checks if the two segments ([fromA], [toA]) and ([fromB], [toB]) intersect. If yes, return the
   * point of intersection as [Vector2]. If no intersection takes place, returns `null`.
   */
  public fun segmentIntersectsSegment(
    fromA: Vector2,
    toA: Vector2,
    fromB: Vector2,
    toB: Vector2,
  ): Any? {
    TransferContext.writeArguments(VECTOR2 to fromA, VECTOR2 to toA, VECTOR2 to fromB, VECTOR2 to toB)
    TransferContext.callMethod(rawPtr, MethodBindings.segmentIntersectsSegmentPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Checks if the two lines ([fromA], [dirA]) and ([fromB], [dirB]) intersect. If yes, return the
   * point of intersection as [Vector2]. If no intersection takes place, returns `null`.
   * **Note:** The lines are specified using direction vectors, not end points.
   */
  public fun lineIntersectsLine(
    fromA: Vector2,
    dirA: Vector2,
    fromB: Vector2,
    dirB: Vector2,
  ): Any? {
    TransferContext.writeArguments(VECTOR2 to fromA, VECTOR2 to dirA, VECTOR2 to fromB, VECTOR2 to dirB)
    TransferContext.callMethod(rawPtr, MethodBindings.lineIntersectsLinePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Given the two 2D segments ([p1], [q1]) and ([p2], [q2]), finds those two points on the two
   * segments that are closest to each other. Returns a [PackedVector2Array] that contains this point
   * on ([p1], [q1]) as well the accompanying point on ([p2], [q2]).
   */
  public fun getClosestPointsBetweenSegments(
    p1: Vector2,
    q1: Vector2,
    p2: Vector2,
    q2: Vector2,
  ): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to p1, VECTOR2 to q1, VECTOR2 to p2, VECTOR2 to q2)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointsBetweenSegmentsPtr,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Returns the 2D point on the 2D segment ([s1], [s2]) that is closest to [point]. The returned
   * point will always be inside the specified segment.
   */
  public fun getClosestPointToSegment(
    point: Vector2,
    s1: Vector2,
    s2: Vector2,
  ): Vector2 {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to s1, VECTOR2 to s2)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointToSegmentPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the 2D point on the 2D line defined by ([s1], [s2]) that is closest to [point]. The
   * returned point can be inside the segment ([s1], [s2]) or outside of it, i.e. somewhere on the line
   * extending from the segment.
   */
  public fun getClosestPointToSegmentUncapped(
    point: Vector2,
    s1: Vector2,
    s2: Vector2,
  ): Vector2 {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to s1, VECTOR2 to s2)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointToSegmentUncappedPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns if [point] is inside the triangle specified by [a], [b] and [c].
   */
  public fun pointIsInsideTriangle(
    point: Vector2,
    a: Vector2,
    b: Vector2,
    c: Vector2,
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to a, VECTOR2 to b, VECTOR2 to c)
    TransferContext.callMethod(rawPtr, MethodBindings.pointIsInsideTrianglePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if [polygon]'s vertices are ordered in clockwise order, otherwise returns
   * `false`.
   */
  public fun isPolygonClockwise(polygon: PackedVector2Array): Boolean {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.isPolygonClockwisePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if [point] is inside [polygon] or if it's located exactly *on* polygon's
   * boundary, otherwise returns `false`.
   */
  public fun isPointInPolygon(point: Vector2, polygon: PackedVector2Array): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.isPointInPolygonPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Triangulates the polygon specified by the points in [polygon]. Returns a [PackedInt32Array]
   * where each triangle consists of three consecutive point indices into [polygon] (i.e. the returned
   * array will have `n * 3` elements, with `n` being the number of found triangles). Output triangles
   * will always be counter clockwise, and the contour will be flipped if it's clockwise. If the
   * triangulation did not succeed, an empty [PackedInt32Array] is returned.
   */
  public fun triangulatePolygon(polygon: PackedVector2Array): PackedInt32Array {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.triangulatePolygonPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Triangulates the area specified by discrete set of [points] such that no point is inside the
   * circumcircle of any resulting triangle. Returns a [PackedInt32Array] where each triangle consists
   * of three consecutive point indices into [points] (i.e. the returned array will have `n * 3`
   * elements, with `n` being the number of found triangles). If the triangulation did not succeed, an
   * empty [PackedInt32Array] is returned.
   */
  public fun triangulateDelaunay(points: PackedVector2Array): PackedInt32Array {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points)
    TransferContext.callMethod(rawPtr, MethodBindings.triangulateDelaunayPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Given an array of [Vector2]s, returns the convex hull as a list of points in counterclockwise
   * order. The last point is the same as the first one.
   */
  public fun convexHull(points: PackedVector2Array): PackedVector2Array {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points)
    TransferContext.callMethod(rawPtr, MethodBindings.convexHullPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Decomposes the [polygon] into multiple convex hulls and returns an array of
   * [PackedVector2Array].
   */
  public fun decomposePolygonInConvex(polygon: PackedVector2Array):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.decomposePolygonInConvexPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  /**
   * Merges (combines) [polygonA] and [polygonB] and returns an array of merged polygons. This
   * performs [OPERATIONUNION] between polygons.
   * The operation may result in an outer polygon (boundary) and multiple inner polygons (holes)
   * produced which could be distinguished by calling [isPolygonClockwise].
   */
  public fun mergePolygons(polygonA: PackedVector2Array, polygonB: PackedVector2Array):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygonA, PACKED_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, MethodBindings.mergePolygonsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  /**
   * Clips [polygonA] against [polygonB] and returns an array of clipped polygons. This performs
   * [OPERATIONDIFFERENCE] between polygons. Returns an empty array if [polygonB] completely overlaps
   * [polygonA].
   * If [polygonB] is enclosed by [polygonA], returns an outer polygon (boundary) and inner polygon
   * (hole) which could be distinguished by calling [isPolygonClockwise].
   */
  public fun clipPolygons(polygonA: PackedVector2Array, polygonB: PackedVector2Array):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygonA, PACKED_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, MethodBindings.clipPolygonsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  /**
   * Intersects [polygonA] with [polygonB] and returns an array of intersected polygons. This
   * performs [OPERATIONINTERSECTION] between polygons. In other words, returns common area shared by
   * polygons. Returns an empty array if no intersection occurs.
   * The operation may result in an outer polygon (boundary) and inner polygon (hole) produced which
   * could be distinguished by calling [isPolygonClockwise].
   */
  public fun intersectPolygons(polygonA: PackedVector2Array, polygonB: PackedVector2Array):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygonA, PACKED_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, MethodBindings.intersectPolygonsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  /**
   * Mutually excludes common area defined by intersection of [polygonA] and [polygonB] (see
   * [intersectPolygons]) and returns an array of excluded polygons. This performs [OPERATIONXOR]
   * between polygons. In other words, returns all but common area between polygons.
   * The operation may result in an outer polygon (boundary) and inner polygon (hole) produced which
   * could be distinguished by calling [isPolygonClockwise].
   */
  public fun excludePolygons(polygonA: PackedVector2Array, polygonB: PackedVector2Array):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygonA, PACKED_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, MethodBindings.excludePolygonsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  /**
   * Clips [polyline] against [polygon] and returns an array of clipped polylines. This performs
   * [OPERATIONDIFFERENCE] between the polyline and the polygon. This operation can be thought of as
   * cutting a line with a closed shape.
   */
  public fun clipPolylineWithPolygon(polyline: PackedVector2Array, polygon: PackedVector2Array):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polyline, PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.clipPolylineWithPolygonPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  /**
   * Intersects [polyline] with [polygon] and returns an array of intersected polylines. This
   * performs [OPERATIONINTERSECTION] between the polyline and the polygon. This operation can be
   * thought of as chopping a line with a closed shape.
   */
  public fun intersectPolylineWithPolygon(polyline: PackedVector2Array,
      polygon: PackedVector2Array): VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polyline, PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.intersectPolylineWithPolygonPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  /**
   * Inflates or deflates [polygon] by [delta] units (pixels). If [delta] is positive, makes the
   * polygon grow outward. If [delta] is negative, shrinks the polygon inward. Returns an array of
   * polygons because inflating/deflating may result in multiple discrete polygons. Returns an empty
   * array if [delta] is negative and the absolute value of it approximately exceeds the minimum
   * bounding rectangle dimensions of the polygon.
   * Each polygon's vertices will be rounded as determined by [joinType], see [PolyJoinType].
   * The operation may result in an outer polygon (boundary) and inner polygon (hole) produced which
   * could be distinguished by calling [isPolygonClockwise].
   * **Note:** To translate the polygon's vertices specifically, multiply them to a [Transform2D]:
   *
   * gdscript:
   * ```gdscript
   * var polygon = PackedVector2Array([Vector2(0, 0), Vector2(100, 0), Vector2(100, 100), Vector2(0,
   * 100)])
   * var offset = Vector2(50, 50)
   * polygon = Transform2D(0, offset) * polygon
   * print(polygon) # prints [(50, 50), (150, 50), (150, 150), (50, 150)]
   * ```
   * csharp:
   * ```csharp
   * var polygon = new Vector2[] { new Vector2(0, 0), new Vector2(100, 0), new Vector2(100, 100),
   * new Vector2(0, 100) };
   * var offset = new Vector2(50, 50);
   * polygon = new Transform2D(0, offset) * polygon;
   * GD.Print((Variant)polygon); // prints [(50, 50), (150, 50), (150, 150), (50, 150)]
   * ```
   */
  @JvmOverloads
  public fun offsetPolygon(
    polygon: PackedVector2Array,
    delta: Float,
    joinType: PolyJoinType = Geometry2D.PolyJoinType.JOIN_SQUARE,
  ): VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon, DOUBLE to delta.toDouble(), LONG to joinType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.offsetPolygonPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  /**
   * Inflates or deflates [polyline] by [delta] units (pixels), producing polygons. If [delta] is
   * positive, makes the polyline grow outward. Returns an array of polygons because
   * inflating/deflating may result in multiple discrete polygons. If [delta] is negative, returns an
   * empty array.
   * Each polygon's vertices will be rounded as determined by [joinType], see [PolyJoinType].
   * Each polygon's endpoints will be rounded as determined by [endType], see [PolyEndType].
   * The operation may result in an outer polygon (boundary) and inner polygon (hole) produced which
   * could be distinguished by calling [isPolygonClockwise].
   */
  @JvmOverloads
  public fun offsetPolyline(
    polyline: PackedVector2Array,
    delta: Float,
    joinType: PolyJoinType = Geometry2D.PolyJoinType.JOIN_SQUARE,
    endType: PolyEndType = Geometry2D.PolyEndType.END_SQUARE,
  ): VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polyline, DOUBLE to delta.toDouble(), LONG to joinType.id, LONG to endType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.offsetPolylinePtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  /**
   * Given an array of [Vector2]s representing tiles, builds an atlas. The returned dictionary has
   * two keys: `points` is a [PackedVector2Array] that specifies the positions of each tile, `size`
   * contains the overall size of the whole atlas as [Vector2i].
   */
  public fun makeAtlas(sizes: PackedVector2Array): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to sizes)
    TransferContext.callMethod(rawPtr, MethodBindings.makeAtlasPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public enum class PolyBooleanOperation(
    id: Long,
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
     * Create regions where either subject or clip polygons are filled but not where both are
     * filled.
     */
    OPERATION_XOR(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class PolyJoinType(
    id: Long,
  ) {
    /**
     * Squaring is applied uniformally at all convex edge joins at `1 * delta`.
     */
    JOIN_SQUARE(0),
    /**
     * While flattened paths can never perfectly trace an arc, they are approximated by a series of
     * arc chords.
     */
    JOIN_ROUND(1),
    /**
     * There's a necessary limit to mitered joins since offsetting edges that join at very acute
     * angles will produce excessively long and narrow "spikes". For any given edge join, when miter
     * offsetting would exceed that maximum distance, "square" joining is applied.
     */
    JOIN_MITER(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class PolyEndType(
    id: Long,
  ) {
    /**
     * Endpoints are joined using the [PolyJoinType] value and the path filled as a polygon.
     */
    END_POLYGON(0),
    /**
     * Endpoints are joined using the [PolyJoinType] value and the path filled as a polyline.
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val isPointInCirclePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "is_point_in_circle")

    public val segmentIntersectsCirclePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "segment_intersects_circle")

    public val segmentIntersectsSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "segment_intersects_segment")

    public val lineIntersectsLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "line_intersects_line")

    public val getClosestPointsBetweenSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "get_closest_points_between_segments")

    public val getClosestPointToSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "get_closest_point_to_segment")

    public val getClosestPointToSegmentUncappedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "get_closest_point_to_segment_uncapped")

    public val pointIsInsideTrianglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "point_is_inside_triangle")

    public val isPolygonClockwisePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "is_polygon_clockwise")

    public val isPointInPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "is_point_in_polygon")

    public val triangulatePolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "triangulate_polygon")

    public val triangulateDelaunayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "triangulate_delaunay")

    public val convexHullPtr: VoidPtr = TypeManager.getMethodBindPtr("Geometry2D", "convex_hull")

    public val decomposePolygonInConvexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "decompose_polygon_in_convex")

    public val mergePolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "merge_polygons")

    public val clipPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "clip_polygons")

    public val intersectPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "intersect_polygons")

    public val excludePolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "exclude_polygons")

    public val clipPolylineWithPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "clip_polyline_with_polygon")

    public val intersectPolylineWithPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "intersect_polyline_with_polygon")

    public val offsetPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "offset_polygon")

    public val offsetPolylinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "offset_polyline")

    public val makeAtlasPtr: VoidPtr = TypeManager.getMethodBindPtr("Geometry2D", "make_atlas")
  }
}
