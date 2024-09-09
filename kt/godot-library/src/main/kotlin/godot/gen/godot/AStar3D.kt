// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt64Array
import godot.core.PackedVector3Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_64_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A* (A star) is a computer algorithm used in pathfinding and graph traversal, the process of
 * plotting short paths among vertices (points), passing through a given set of edges (segments). It
 * enjoys widespread use due to its performance and accuracy. Godot's A* implementation uses points in
 * 3D space and Euclidean distances by default.
 * You must add points manually with [addPoint] and create segments manually with [connectPoints].
 * Once done, you can test if there is a path between two points with the [arePointsConnected]
 * function, get a path containing indices by [getIdPath], or one containing actual coordinates with
 * [getPointPath].
 * It is also possible to use non-Euclidean distances. To do so, create a class that extends
 * [AStar3D] and override methods [_computeCost] and [_estimateCost]. Both take two indices and return
 * a length, as is shown in the following example.
 *
 * gdscript:
 * ```gdscript
 * class MyAStar:
 *     extends AStar3D
 *
 *     func _compute_cost(u, v):
 *         return abs(u - v)
 *
 *     func _estimate_cost(u, v):
 *         return min(0, abs(u - v) - 1)
 * ```
 * csharp:
 * ```csharp
 * public partial class MyAStar : AStar3D
 * {
 *     public override float _ComputeCost(long fromId, long toId)
 *     {
 *         return Mathf.Abs((int)(fromId - toId));
 *     }
 *
 *     public override float _EstimateCost(long fromId, long toId)
 *     {
 *         return Mathf.Min(0, Mathf.Abs((int)(fromId - toId)) - 1);
 *     }
 * }
 * ```
 *
 * [_estimateCost] should return a lower bound of the distance, i.e. `_estimate_cost(u, v) <=
 * _compute_cost(u, v)`. This serves as a hint to the algorithm because the custom [_computeCost] might
 * be computation-heavy. If this is not the case, make [_estimateCost] return the same value as
 * [_computeCost] to provide the algorithm with the most accurate information.
 * If the default [_estimateCost] and [_computeCost] methods are used, or if the supplied
 * [_estimateCost] method returns a lower bound of the cost, then the paths returned by A* will be the
 * lowest-cost paths. Here, the cost of a path equals the sum of the [_computeCost] results of all
 * segments in the path multiplied by the `weight_scale`s of the endpoints of the respective segments.
 * If the default methods are used and the `weight_scale`s of all points are set to `1.0`, then this
 * equals the sum of Euclidean distances of all segments in the path.
 */
@GodotBaseType
public open class AStar3D : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ASTAR3D, scriptIndex)
  }

  /**
   * Called when estimating the cost between a point and the path's ending point.
   * Note that this function is hidden in the default [AStar3D] class.
   */
  public open fun _estimateCost(fromId: Long, toId: Long): Float {
    throw NotImplementedError("_estimate_cost is not implemented for AStar3D")
  }

  /**
   * Called when computing the cost between two connected points.
   * Note that this function is hidden in the default [AStar3D] class.
   */
  public open fun _computeCost(fromId: Long, toId: Long): Float {
    throw NotImplementedError("_compute_cost is not implemented for AStar3D")
  }

  /**
   * Returns the next available point ID with no point associated to it.
   */
  public fun getAvailablePointId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAvailablePointIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Adds a new point at the given position with the given identifier. The [id] must be 0 or larger,
   * and the [weightScale] must be 0.0 or greater.
   * The [weightScale] is multiplied by the result of [_computeCost] when determining the overall
   * cost of traveling across a segment from a neighboring point to this point. Thus, all else being
   * equal, the algorithm prefers points with lower [weightScale]s to form a path.
   *
   * gdscript:
   * ```gdscript
   * var astar = AStar3D.new()
   * astar.add_point(1, Vector3(1, 0, 0), 4) # Adds the point (1, 0, 0) with weight_scale 4 and id 1
   * ```
   * csharp:
   * ```csharp
   * var astar = new AStar3D();
   * astar.AddPoint(1, new Vector3(1, 0, 0), 4); // Adds the point (1, 0, 0) with weight_scale 4 and
   * id 1
   * ```
   *
   * If there already exists a point for the given [id], its position and weight scale are updated
   * to the given values.
   */
  @JvmOverloads
  public fun addPoint(
    id: Long,
    position: Vector3,
    weightScale: Float = 1.0f,
  ): Unit {
    TransferContext.writeArguments(LONG to id, VECTOR3 to position, DOUBLE to weightScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.addPointPtr, NIL)
  }

  /**
   * Returns the position of the point associated with the given [id].
   */
  public fun getPointPosition(id: Long): Vector3 {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the [position] for the point with the given [id].
   */
  public fun setPointPosition(id: Long, position: Vector3): Unit {
    TransferContext.writeArguments(LONG to id, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointPositionPtr, NIL)
  }

  /**
   * Returns the weight scale of the point associated with the given [id].
   */
  public fun getPointWeightScale(id: Long): Float {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointWeightScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the [weightScale] for the point with the given [id]. The [weightScale] is multiplied by
   * the result of [_computeCost] when determining the overall cost of traveling across a segment from
   * a neighboring point to this point.
   */
  public fun setPointWeightScale(id: Long, weightScale: Float): Unit {
    TransferContext.writeArguments(LONG to id, DOUBLE to weightScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointWeightScalePtr, NIL)
  }

  /**
   * Removes the point associated with the given [id] from the points pool.
   */
  public fun removePoint(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.removePointPtr, NIL)
  }

  /**
   * Returns whether a point associated with the given [id] exists.
   */
  public fun hasPoint(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.hasPointPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an array with the IDs of the points that form the connection with the given point.
   *
   * gdscript:
   * ```gdscript
   * var astar = AStar3D.new()
   * astar.add_point(1, Vector3(0, 0, 0))
   * astar.add_point(2, Vector3(0, 1, 0))
   * astar.add_point(3, Vector3(1, 1, 0))
   * astar.add_point(4, Vector3(2, 0, 0))
   *
   * astar.connect_points(1, 2, true)
   * astar.connect_points(1, 3, true)
   *
   * var neighbors = astar.get_point_connections(1) # Returns [2, 3]
   * ```
   * csharp:
   * ```csharp
   * var astar = new AStar3D();
   * astar.AddPoint(1, new Vector3(0, 0, 0));
   * astar.AddPoint(2, new Vector3(0, 1, 0));
   * astar.AddPoint(3, new Vector3(1, 1, 0));
   * astar.AddPoint(4, new Vector3(2, 0, 0));
   * astar.ConnectPoints(1, 2, true);
   * astar.ConnectPoints(1, 3, true);
   *
   * int[] neighbors = astar.GetPointConnections(1); // Returns [2, 3]
   * ```
   */
  public fun getPointConnections(id: Long): PackedInt64Array {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointConnectionsPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  /**
   * Returns an array of all point IDs.
   */
  public fun getPointIds(): PackedInt64Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPointIdsPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  /**
   * Disables or enables the specified point for pathfinding. Useful for making a temporary
   * obstacle.
   */
  @JvmOverloads
  public fun setPointDisabled(id: Long, disabled: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to id, BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointDisabledPtr, NIL)
  }

  /**
   * Returns whether a point is disabled or not for pathfinding. By default, all points are enabled.
   */
  public fun isPointDisabled(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.isPointDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Creates a segment between the given points. If [bidirectional] is `false`, only movement from
   * [id] to [toId] is allowed, not the reverse direction.
   *
   * gdscript:
   * ```gdscript
   * var astar = AStar3D.new()
   * astar.add_point(1, Vector3(1, 1, 0))
   * astar.add_point(2, Vector3(0, 5, 0))
   * astar.connect_points(1, 2, false)
   * ```
   * csharp:
   * ```csharp
   * var astar = new AStar3D();
   * astar.AddPoint(1, new Vector3(1, 1, 0));
   * astar.AddPoint(2, new Vector3(0, 5, 0));
   * astar.ConnectPoints(1, 2, false);
   * ```
   */
  @JvmOverloads
  public fun connectPoints(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(LONG to id, LONG to toId, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr, MethodBindings.connectPointsPtr, NIL)
  }

  /**
   * Deletes the segment between the given points. If [bidirectional] is `false`, only movement from
   * [id] to [toId] is prevented, and a unidirectional segment possibly remains.
   */
  @JvmOverloads
  public fun disconnectPoints(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(LONG to id, LONG to toId, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectPointsPtr, NIL)
  }

  /**
   * Returns whether the two given points are directly connected by a segment. If [bidirectional] is
   * `false`, returns whether movement from [id] to [toId] is possible through this segment.
   */
  @JvmOverloads
  public fun arePointsConnected(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true,
  ): Boolean {
    TransferContext.writeArguments(LONG to id, LONG to toId, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr, MethodBindings.arePointsConnectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the number of points currently in the points pool.
   */
  public fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the capacity of the structure backing the points, useful in conjunction with
   * [reserveSpace].
   */
  public fun getPointCapacity(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPointCapacityPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Reserves space internally for [numNodes] points. Useful if you're adding a known large number
   * of points at once, such as points on a grid. New capacity must be greater or equals to old
   * capacity.
   */
  public fun reserveSpace(numNodes: Long): Unit {
    TransferContext.writeArguments(LONG to numNodes)
    TransferContext.callMethod(rawPtr, MethodBindings.reserveSpacePtr, NIL)
  }

  /**
   * Clears all the points and segments.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns the ID of the closest point to [toPosition], optionally taking disabled points into
   * account. Returns `-1` if there are no points in the points pool.
   * **Note:** If several points are the closest to [toPosition], the one with the smallest ID will
   * be returned, ensuring a deterministic result.
   */
  @JvmOverloads
  public fun getClosestPoint(toPosition: Vector3, includeDisabled: Boolean = false): Long {
    TransferContext.writeArguments(VECTOR3 to toPosition, BOOL to includeDisabled)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the closest position to [toPosition] that resides inside a segment between two
   * connected points.
   *
   * gdscript:
   * ```gdscript
   * var astar = AStar3D.new()
   * astar.add_point(1, Vector3(0, 0, 0))
   * astar.add_point(2, Vector3(0, 5, 0))
   * astar.connect_points(1, 2)
   * var res = astar.get_closest_position_in_segment(Vector3(3, 3, 0)) # Returns (0, 3, 0)
   * ```
   * csharp:
   * ```csharp
   * var astar = new AStar3D();
   * astar.AddPoint(1, new Vector3(0, 0, 0));
   * astar.AddPoint(2, new Vector3(0, 5, 0));
   * astar.ConnectPoints(1, 2);
   * Vector3 res = astar.GetClosestPositionInSegment(new Vector3(3, 3, 0)); // Returns (0, 3, 0)
   * ```
   *
   * The result is in the segment that goes from `y = 0` to `y = 5`. It's the closest position in
   * the segment to the given point.
   */
  public fun getClosestPositionInSegment(toPosition: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to toPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPositionInSegmentPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns an array with the points that are in the path found by AStar3D between the given
   * points. The array is ordered from the starting point to the ending point of the path.
   * If there is no valid path to the target, and [allowPartialPath] is `true`, returns a path to
   * the point closest to the target that can be reached.
   * **Note:** This method is not thread-safe. If called from a [Thread], it will return an empty
   * array and will print an error message.
   */
  @JvmOverloads
  public fun getPointPath(
    fromId: Long,
    toId: Long,
    allowPartialPath: Boolean = false,
  ): PackedVector3Array {
    TransferContext.writeArguments(LONG to fromId, LONG to toId, BOOL to allowPartialPath)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPathPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  /**
   * Returns an array with the IDs of the points that form the path found by AStar3D between the
   * given points. The array is ordered from the starting point to the ending point of the path.
   * If there is no valid path to the target, and [allowPartialPath] is `true`, returns a path to
   * the point closest to the target that can be reached.
   *
   * gdscript:
   * ```gdscript
   * var astar = AStar3D.new()
   * astar.add_point(1, Vector3(0, 0, 0))
   * astar.add_point(2, Vector3(0, 1, 0), 1) # Default weight is 1
   * astar.add_point(3, Vector3(1, 1, 0))
   * astar.add_point(4, Vector3(2, 0, 0))
   *
   * astar.connect_points(1, 2, false)
   * astar.connect_points(2, 3, false)
   * astar.connect_points(4, 3, false)
   * astar.connect_points(1, 4, false)
   *
   * var res = astar.get_id_path(1, 3) # Returns [1, 2, 3]
   * ```
   * csharp:
   * ```csharp
   * var astar = new AStar3D();
   * astar.AddPoint(1, new Vector3(0, 0, 0));
   * astar.AddPoint(2, new Vector3(0, 1, 0), 1); // Default weight is 1
   * astar.AddPoint(3, new Vector3(1, 1, 0));
   * astar.AddPoint(4, new Vector3(2, 0, 0));
   * astar.ConnectPoints(1, 2, false);
   * astar.ConnectPoints(2, 3, false);
   * astar.ConnectPoints(4, 3, false);
   * astar.ConnectPoints(1, 4, false);
   * int[] res = astar.GetIdPath(1, 3); // Returns [1, 2, 3]
   * ```
   *
   * If you change the 2nd point's weight to 3, then the result will be `[1, 4, 3]` instead, because
   * now even though the distance is longer, it's "easier" to get through point 4 than through point 2.
   */
  @JvmOverloads
  public fun getIdPath(
    fromId: Long,
    toId: Long,
    allowPartialPath: Boolean = false,
  ): PackedInt64Array {
    TransferContext.writeArguments(LONG to fromId, LONG to toId, BOOL to allowPartialPath)
    TransferContext.callMethod(rawPtr, MethodBindings.getIdPathPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  public companion object

  internal object MethodBindings {
    public val getAvailablePointIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_available_point_id", 3905245786)

    public val addPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "add_point", 1038703438)

    public val getPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_point_position", 711720468)

    public val setPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "set_point_position", 1530502735)

    public val getPointWeightScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_point_weight_scale", 2339986948)

    public val setPointWeightScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "set_point_weight_scale", 1602489585)

    public val removePointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "remove_point", 1286410249)

    public val hasPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "has_point", 1116898809)

    public val getPointConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_point_connections", 2865087369)

    public val getPointIdsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_point_ids", 3851388692)

    public val setPointDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "set_point_disabled", 972357352)

    public val isPointDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "is_point_disabled", 1116898809)

    public val connectPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "connect_points", 3710494224)

    public val disconnectPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "disconnect_points", 3710494224)

    public val arePointsConnectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "are_points_connected", 2288175859)

    public val getPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_point_count", 3905245786)

    public val getPointCapacityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_point_capacity", 3905245786)

    public val reserveSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "reserve_space", 1286410249)

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar3D", "clear", 3218959716)

    public val getClosestPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_closest_point", 3241074317)

    public val getClosestPositionInSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_closest_position_in_segment", 192990374)

    public val getPointPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_point_path", 1562654675)

    public val getIdPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_id_path", 3136199648)
  }
}
