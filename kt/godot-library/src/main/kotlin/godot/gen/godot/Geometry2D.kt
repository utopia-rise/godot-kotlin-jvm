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
import godot.core.TransferContext
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
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Helper node to calculate generic geometry operations in 2D space.
 *
 * Geometry2D provides users with a set of helper functions to create geometric shapes, compute intersections between shapes, and process various other geometric operations.
 */
@GodotBaseType
public object Geometry2D : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_GEOMETRY2D)
    return false
  }

  /**
   * Returns `true` if [point] is inside the circle or if it's located exactly *on* the circle's boundary, otherwise returns `false`.
   */
  public fun isPointInCircle(
    point: Vector2,
    circlePosition: Vector2,
    circleRadius: Double
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to circlePosition, DOUBLE to circleRadius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_IS_POINT_IN_CIRCLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Checks if the two segments ([fromA], [toA]) and ([fromB], [toB]) intersect. If yes, return the point of intersection as [godot.core.Vector2]. If no intersection takes place, returns `null`.
   */
  public fun segmentIntersectsSegment(
    fromA: Vector2,
    toA: Vector2,
    fromB: Vector2,
    toB: Vector2
  ): Any? {
    TransferContext.writeArguments(VECTOR2 to fromA, VECTOR2 to toA, VECTOR2 to fromB, VECTOR2 to toB)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_SEGMENT_INTERSECTS_SEGMENT, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Checks if the two lines ([fromA], [dirA]) and ([fromB], [dirB]) intersect. If yes, return the point of intersection as [godot.core.Vector2]. If no intersection takes place, returns `null`.
   *
   * **Note:** The lines are specified using direction vectors, not end points.
   */
  public fun lineIntersectsLine(
    fromA: Vector2,
    dirA: Vector2,
    fromB: Vector2,
    dirB: Vector2
  ): Any? {
    TransferContext.writeArguments(VECTOR2 to fromA, VECTOR2 to dirA, VECTOR2 to fromB, VECTOR2 to dirB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_LINE_INTERSECTS_LINE,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Given the two 2D segments ([p1], [q1]) and ([p2], [q2]), finds those two points on the two segments that are closest to each other. Returns a [godot.PackedVector2Array] that contains this point on ([p1], [q1]) as well the accompanying point on ([p2], [q2]).
   */
  public fun getClosestPointsBetweenSegments(
    p1: Vector2,
    q1: Vector2,
    p2: Vector2,
    q2: Vector2
  ): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to p1, VECTOR2 to q1, VECTOR2 to p2, VECTOR2 to q2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_GET_CLOSEST_POINTS_BETWEEN_SEGMENTS,
        PACKED_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
  }

  /**
   * Returns the 2D point on the 2D segment ([s1], [s2]) that is closest to [point]. The returned point will always be inside the specified segment.
   */
  public fun getClosestPointToSegment(
    point: Vector2,
    s1: Vector2,
    s2: Vector2
  ): Vector2 {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to s1, VECTOR2 to s2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_GET_CLOSEST_POINT_TO_SEGMENT, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the 2D point on the 2D line defined by ([s1], [s2]) that is closest to [point]. The returned point can be inside the segment ([s1], [s2]) or outside of it, i.e. somewhere on the line extending from the segment.
   */
  public fun getClosestPointToSegmentUncapped(
    point: Vector2,
    s1: Vector2,
    s2: Vector2
  ): Vector2 {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to s1, VECTOR2 to s2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_GET_CLOSEST_POINT_TO_SEGMENT_UNCAPPED, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns if [point] is inside the triangle specified by [a], [b] and [c].
   */
  public fun pointIsInsideTriangle(
    point: Vector2,
    a: Vector2,
    b: Vector2,
    c: Vector2
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to a, VECTOR2 to b, VECTOR2 to c)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_POINT_IS_INSIDE_TRIANGLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [polygon]'s vertices are ordered in clockwise order, otherwise returns `false`.
   */
  public fun isPolygonClockwise(polygon: PackedVector2Array): Boolean {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_IS_POLYGON_CLOCKWISE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [point] is inside [polygon] or if it's located exactly *on* polygon's boundary, otherwise returns `false`.
   */
  public fun isPointInPolygon(point: Vector2, polygon: PackedVector2Array): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_IS_POINT_IN_POLYGON,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Triangulates the polygon specified by the points in [polygon]. Returns a [godot.PackedInt32Array] where each triangle consists of three consecutive point indices into [polygon] (i.e. the returned array will have `n * 3` elements, with `n` being the number of found triangles). Output triangles will always be counter clockwise, and the contour will be flipped if it's clockwise. If the triangulation did not succeed, an empty [godot.PackedInt32Array] is returned.
   */
  public fun triangulatePolygon(polygon: PackedVector2Array): PackedInt32Array {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_TRIANGULATE_POLYGON,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Triangulates the area specified by discrete set of [points] such that no point is inside the circumcircle of any resulting triangle. Returns a [godot.PackedInt32Array] where each triangle consists of three consecutive point indices into [points] (i.e. the returned array will have `n * 3` elements, with `n` being the number of found triangles). If the triangulation did not succeed, an empty [godot.PackedInt32Array] is returned.
   */
  public fun triangulateDelaunay(points: PackedVector2Array): PackedInt32Array {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_TRIANGULATE_DELAUNAY,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Given an array of [godot.core.Vector2]s, returns the convex hull as a list of points in counterclockwise order. The last point is the same as the first one.
   */
  public fun convexHull(points: PackedVector2Array): PackedVector2Array {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_CONVEX_HULL,
        PACKED_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
  }

  /**
   * Merges (combines) [polygonA] and [polygonB] and returns an array of merged polygons. This performs [OPERATION_UNION] between polygons.
   *
   * The operation may result in an outer polygon (boundary) and multiple inner polygons (holes) produced which could be distinguished by calling [isPolygonClockwise].
   */
  public fun mergePolygons(polygonA: PackedVector2Array, polygonB: PackedVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygonA, PACKED_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_MERGE_POLYGONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Clips [polygonA] against [polygonB] and returns an array of clipped polygons. This performs [OPERATION_DIFFERENCE] between polygons. Returns an empty array if [polygonB] completely overlaps [polygonA].
   *
   * If [polygonB] is enclosed by [polygonA], returns an outer polygon (boundary) and inner polygon (hole) which could be distinguished by calling [isPolygonClockwise].
   */
  public fun clipPolygons(polygonA: PackedVector2Array, polygonB: PackedVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygonA, PACKED_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_CLIP_POLYGONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Intersects [polygonA] with [polygonB] and returns an array of intersected polygons. This performs [OPERATION_INTERSECTION] between polygons. In other words, returns common area shared by polygons. Returns an empty array if no intersection occurs.
   *
   * The operation may result in an outer polygon (boundary) and inner polygon (hole) produced which could be distinguished by calling [isPolygonClockwise].
   */
  public fun intersectPolygons(polygonA: PackedVector2Array, polygonB: PackedVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygonA, PACKED_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_INTERSECT_POLYGONS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Mutually excludes common area defined by intersection of [polygonA] and [polygonB] (see [intersectPolygons]) and returns an array of excluded polygons. This performs [OPERATION_XOR] between polygons. In other words, returns all but common area between polygons.
   *
   * The operation may result in an outer polygon (boundary) and inner polygon (hole) produced which could be distinguished by calling [isPolygonClockwise].
   */
  public fun excludePolygons(polygonA: PackedVector2Array, polygonB: PackedVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygonA, PACKED_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_EXCLUDE_POLYGONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Clips [polyline] against [polygon] and returns an array of clipped polylines. This performs [OPERATION_DIFFERENCE] between the polyline and the polygon. This operation can be thought of as cutting a line with a closed shape.
   */
  public fun clipPolylineWithPolygon(polyline: PackedVector2Array, polygon: PackedVector2Array):
      VariantArray<Any?> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polyline, PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_CLIP_POLYLINE_WITH_POLYGON, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Intersects [polyline] with [polygon] and returns an array of intersected polylines. This performs [OPERATION_INTERSECTION] between the polyline and the polygon. This operation can be thought of as chopping a line with a closed shape.
   */
  public fun intersectPolylineWithPolygon(polyline: PackedVector2Array,
      polygon: PackedVector2Array): VariantArray<Any?> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polyline, PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_INTERSECT_POLYLINE_WITH_POLYGON, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Inflates or deflates [polygon] by [delta] units (pixels). If [delta] is positive, makes the polygon grow outward. If [delta] is negative, shrinks the polygon inward. Returns an array of polygons because inflating/deflating may result in multiple discrete polygons. Returns an empty array if [delta] is negative and the absolute value of it approximately exceeds the minimum bounding rectangle dimensions of the polygon.
   *
   * Each polygon's vertices will be rounded as determined by [joinType], see [enum PolyJoinType].
   *
   * The operation may result in an outer polygon (boundary) and inner polygon (hole) produced which could be distinguished by calling [isPolygonClockwise].
   *
   * **Note:** To translate the polygon's vertices specifically, multiply them to a [godot.core.Transform2D]:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var polygon = PackedVector2Array([godot.Vector2(0, 0), Vector2(100, 0), Vector2(100, 100), Vector2(0, 100)])
   *
   * var offset = Vector2(50, 50)
   *
   * polygon = Transform2D(0, offset) * polygon
   *
   * print(polygon) # prints [godot.Vector2(50, 50), Vector2(150, 50), Vector2(150, 150), Vector2(50, 150)]
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var polygon = new Vector2[] { new Vector2(0, 0), new Vector2(100, 0), new Vector2(100, 100), new Vector2(0, 100) };
   *
   * var offset = new Vector2(50, 50);
   *
   * // TODO: This code is not valid right now. Ping @aaronfranke about it before Godot 4.0 is out.
   *
   * //polygon = (Vector2[]) new Transform2D(0, offset).Xform(polygon);
   *
   * //GD.Print(polygon); // prints [godot.Vector2(50, 50), Vector2(150, 50), Vector2(150, 150), Vector2(50, 150)]
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun offsetPolygon(
    polygon: PackedVector2Array,
    delta: Double,
    joinType: Geometry2D.PolyJoinType = Geometry2D.PolyJoinType.JOIN_SQUARE
  ): VariantArray<Any?> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon, DOUBLE to delta, LONG to joinType.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_OFFSET_POLYGON, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Inflates or deflates [polyline] by [delta] units (pixels), producing polygons. If [delta] is positive, makes the polyline grow outward. Returns an array of polygons because inflating/deflating may result in multiple discrete polygons. If [delta] is negative, returns an empty array.
   *
   * Each polygon's vertices will be rounded as determined by [joinType], see [enum PolyJoinType].
   *
   * Each polygon's endpoints will be rounded as determined by [endType], see [enum PolyEndType].
   *
   * The operation may result in an outer polygon (boundary) and inner polygon (hole) produced which could be distinguished by calling [isPolygonClockwise].
   */
  public fun offsetPolyline(
    polyline: PackedVector2Array,
    delta: Double,
    joinType: Geometry2D.PolyJoinType = Geometry2D.PolyJoinType.JOIN_SQUARE,
    endType: Geometry2D.PolyEndType = Geometry2D.PolyEndType.END_SQUARE
  ): VariantArray<Any?> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polyline, DOUBLE to delta, LONG to joinType.id, LONG to endType.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_OFFSET_POLYLINE, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Given an array of [godot.core.Vector2]s representing tiles, builds an atlas. The returned dictionary has two keys: `points` is a [godot.PackedVector2Array] that specifies the positions of each tile, `size` contains the overall size of the whole atlas as [godot.Vector2i].
   */
  public fun makeAtlas(sizes: PackedVector2Array): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to sizes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY2D_MAKE_ATLAS, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
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
