// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt64Array
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_64_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
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
 * An implementation of A* for finding the shortest path between two vertices on a connected graph in 2D space.
 *
 * An implementation of the A* algorithm, used to find the shortest path between two vertices on a connected graph in 2D space.
 *
 * See [godot.AStar3D] for a more thorough explanation on how to use this class. [godot.AStar2D] is a wrapper for [godot.AStar3D] that enforces 2D coordinates.
 */
@GodotBaseType
public open class AStar2D : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ASTAR2D, scriptIndex)
    return true
  }

  /**
   * Called when estimating the cost between a point and the path's ending point.
   *
   * Note that this function is hidden in the default [godot.AStar2D] class.
   */
  public open fun _estimateCost(fromId: Long, toId: Long): Float {
    throw NotImplementedError("_estimate_cost is not implemented for AStar2D")
  }

  /**
   * Called when computing the cost between two connected points.
   *
   * Note that this function is hidden in the default [godot.AStar2D] class.
   */
  public open fun _computeCost(fromId: Long, toId: Long): Float {
    throw NotImplementedError("_compute_cost is not implemented for AStar2D")
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
   * Adds a new point at the given position with the given identifier. The [id] must be 0 or larger, and the [weightScale] must be 0.0 or greater.
   *
   * The [weightScale] is multiplied by the result of [_computeCost] when determining the overall cost of traveling across a segment from a neighboring point to this point. Thus, all else being equal, the algorithm prefers points with lower [weightScale]s to form a path.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var astar = AStar2D.new()
   *
   * astar.add_point(1, Vector2(1, 0), 4) # Adds the point (1, 0) with weight_scale 4 and id 1
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var astar = new AStar2D();
   *
   * astar.AddPoint(1, new Vector2(1, 0), 4); // Adds the point (1, 0) with weight_scale 4 and id 1
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * If there already exists a point for the given [id], its position and weight scale are updated to the given values.
   */
  @JvmOverloads
  public fun addPoint(
    id: Long,
    position: Vector2,
    weightScale: Float = 1.0f,
  ): Unit {
    TransferContext.writeArguments(LONG to id, VECTOR2 to position, DOUBLE to weightScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.addPointPtr, NIL)
  }

  /**
   * Returns the position of the point associated with the given [id].
   */
  public fun getPointPosition(id: Long): Vector2 {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the [position] for the point with the given [id].
   */
  public fun setPointPosition(id: Long, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to id, VECTOR2 to position)
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
   * Sets the [weightScale] for the point with the given [id]. The [weightScale] is multiplied by the result of [_computeCost] when determining the overall cost of traveling across a segment from a neighboring point to this point.
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
   * [codeblocks]
   *
   * [gdscript]
   *
   * var astar = AStar2D.new()
   *
   * astar.add_point(1, Vector2(0, 0))
   *
   * astar.add_point(2, Vector2(0, 1))
   *
   * astar.add_point(3, Vector2(1, 1))
   *
   * astar.add_point(4, Vector2(2, 0))
   *
   *
   *
   * astar.connect_points(1, 2, true)
   *
   * astar.connect_points(1, 3, true)
   *
   *
   *
   * var neighbors = astar.get_point_connections(1) # Returns [2, 3]
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var astar = new AStar2D();
   *
   * astar.AddPoint(1, new Vector2(0, 0));
   *
   * astar.AddPoint(2, new Vector2(0, 1));
   *
   * astar.AddPoint(3, new Vector2(1, 1));
   *
   * astar.AddPoint(4, new Vector2(2, 0));
   *
   *
   *
   * astar.ConnectPoints(1, 2, true);
   *
   * astar.ConnectPoints(1, 3, true);
   *
   *
   *
   * int[] neighbors = astar.GetPointConnections(1); // Returns [2, 3]
   *
   * [/csharp]
   *
   * [/codeblocks]
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
   * Disables or enables the specified point for pathfinding. Useful for making a temporary obstacle.
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
   * Creates a segment between the given points. If [bidirectional] is `false`, only movement from [id] to [toId] is allowed, not the reverse direction.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var astar = AStar2D.new()
   *
   * astar.add_point(1, Vector2(1, 1))
   *
   * astar.add_point(2, Vector2(0, 5))
   *
   * astar.connect_points(1, 2, false)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var astar = new AStar2D();
   *
   * astar.AddPoint(1, new Vector2(1, 1));
   *
   * astar.AddPoint(2, new Vector2(0, 5));
   *
   * astar.ConnectPoints(1, 2, false);
   *
   * [/csharp]
   *
   * [/codeblocks]
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
   * Deletes the segment between the given points. If [bidirectional] is `false`, only movement from [id] to [toId] is prevented, and a unidirectional segment possibly remains.
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
   * Returns whether there is a connection/segment between the given points. If [bidirectional] is `false`, returns whether movement from [id] to [toId] is possible through this segment.
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
   * Returns the capacity of the structure backing the points, useful in conjunction with [reserveSpace].
   */
  public fun getPointCapacity(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPointCapacityPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Reserves space internally for [numNodes] points, useful if you're adding a known large number of points at once, such as points on a grid. New capacity must be greater or equals to old capacity.
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
   * Returns the ID of the closest point to [toPosition], optionally taking disabled points into account. Returns `-1` if there are no points in the points pool.
   *
   * **Note:** If several points are the closest to [toPosition], the one with the smallest ID will be returned, ensuring a deterministic result.
   */
  @JvmOverloads
  public fun getClosestPoint(toPosition: Vector2, includeDisabled: Boolean = false): Long {
    TransferContext.writeArguments(VECTOR2 to toPosition, BOOL to includeDisabled)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the closest position to [toPosition] that resides inside a segment between two connected points.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var astar = AStar2D.new()
   *
   * astar.add_point(1, Vector2(0, 0))
   *
   * astar.add_point(2, Vector2(0, 5))
   *
   * astar.connect_points(1, 2)
   *
   * var res = astar.get_closest_position_in_segment(Vector2(3, 3)) # Returns (0, 3)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var astar = new AStar2D();
   *
   * astar.AddPoint(1, new Vector2(0, 0));
   *
   * astar.AddPoint(2, new Vector2(0, 5));
   *
   * astar.ConnectPoints(1, 2);
   *
   * Vector2 res = astar.GetClosestPositionInSegment(new Vector2(3, 3)); // Returns (0, 3)
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * The result is in the segment that goes from `y = 0` to `y = 5`. It's the closest position in the segment to the given point.
   */
  public fun getClosestPositionInSegment(toPosition: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to toPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPositionInSegmentPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns an array with the points that are in the path found by AStar2D between the given points. The array is ordered from the starting point to the ending point of the path.
   *
   * **Note:** This method is not thread-safe. If called from a [godot.Thread], it will return an empty [godot.PackedVector2Array] and will print an error message.
   */
  public fun getPointPath(fromId: Long, toId: Long): PackedVector2Array {
    TransferContext.writeArguments(LONG to fromId, LONG to toId)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPathPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Returns an array with the IDs of the points that form the path found by AStar2D between the given points. The array is ordered from the starting point to the ending point of the path.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var astar = AStar2D.new()
   *
   * astar.add_point(1, Vector2(0, 0))
   *
   * astar.add_point(2, Vector2(0, 1), 1) # Default weight is 1
   *
   * astar.add_point(3, Vector2(1, 1))
   *
   * astar.add_point(4, Vector2(2, 0))
   *
   *
   *
   * astar.connect_points(1, 2, false)
   *
   * astar.connect_points(2, 3, false)
   *
   * astar.connect_points(4, 3, false)
   *
   * astar.connect_points(1, 4, false)
   *
   *
   *
   * var res = astar.get_id_path(1, 3) # Returns [1, 2, 3]
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var astar = new AStar2D();
   *
   * astar.AddPoint(1, new Vector2(0, 0));
   *
   * astar.AddPoint(2, new Vector2(0, 1), 1); // Default weight is 1
   *
   * astar.AddPoint(3, new Vector2(1, 1));
   *
   * astar.AddPoint(4, new Vector2(2, 0));
   *
   *
   *
   * astar.ConnectPoints(1, 2, false);
   *
   * astar.ConnectPoints(2, 3, false);
   *
   * astar.ConnectPoints(4, 3, false);
   *
   * astar.ConnectPoints(1, 4, false);
   *
   * int[] res = astar.GetIdPath(1, 3); // Returns [1, 2, 3]
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * If you change the 2nd point's weight to 3, then the result will be `[1, 4, 3]` instead, because now even though the distance is longer, it's "easier" to get through point 4 than through point 2.
   */
  public fun getIdPath(fromId: Long, toId: Long): PackedInt64Array {
    TransferContext.writeArguments(LONG to fromId, LONG to toId)
    TransferContext.callMethod(rawPtr, MethodBindings.getIdPathPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  public companion object

  internal object MethodBindings {
    public val _estimateCostPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar2D", "_estimate_cost")

    public val _computeCostPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar2D", "_compute_cost")

    public val getAvailablePointIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar2D", "get_available_point_id")

    public val addPointPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar2D", "add_point")

    public val getPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar2D", "get_point_position")

    public val setPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar2D", "set_point_position")

    public val getPointWeightScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar2D", "get_point_weight_scale")

    public val setPointWeightScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar2D", "set_point_weight_scale")

    public val removePointPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar2D", "remove_point")

    public val hasPointPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar2D", "has_point")

    public val getPointConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar2D", "get_point_connections")

    public val getPointIdsPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar2D", "get_point_ids")

    public val setPointDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar2D", "set_point_disabled")

    public val isPointDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar2D", "is_point_disabled")

    public val connectPointsPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar2D", "connect_points")

    public val disconnectPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar2D", "disconnect_points")

    public val arePointsConnectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar2D", "are_points_connected")

    public val getPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar2D", "get_point_count")

    public val getPointCapacityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar2D", "get_point_capacity")

    public val reserveSpacePtr: VoidPtr = TypeManager.getMethodBindPtr("AStar2D", "reserve_space")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar2D", "clear")

    public val getClosestPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar2D", "get_closest_point")

    public val getClosestPositionInSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar2D", "get_closest_position_in_segment")

    public val getPointPathPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar2D", "get_point_path")

    public val getIdPathPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar2D", "get_id_path")
  }
}
