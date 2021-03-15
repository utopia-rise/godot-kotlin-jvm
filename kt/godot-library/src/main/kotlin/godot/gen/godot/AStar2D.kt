// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * AStar class representation that uses 2D vectors as edges.
 *
 * This is a wrapper for the [godot.AStar] class which uses 2D vectors instead of 3D vectors.
 */
@GodotBaseType
open class AStar2D : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_ASTAR2D, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Called when computing the cost between two connected points.
   *
   * Note that this function is hidden in the default `AStar2D` class.
   */
  open fun _computeCost(fromId: Long, toId: Long): Double {
    throw NotImplementedError("_compute_cost is not implemented for AStar2D")
  }

  /**
   * Called when estimating the cost between a point and the path's ending point.
   *
   * Note that this function is hidden in the default `AStar2D` class.
   */
  open fun _estimateCost(fromId: Long, toId: Long): Double {
    throw NotImplementedError("_estimate_cost is not implemented for AStar2D")
  }

  /**
   * Adds a new point at the given position with the given identifier. The algorithm prefers points with lower `weight_scale` to form a path. The `id` must be 0 or larger, and the `weight_scale` must be 1 or larger.
   *
   * ```
   * 				var astar = AStar2D.new()
   * 				astar.add_point(1, Vector2(1, 0), 4) # Adds the point (1, 0) with weight_scale 4 and id 1
   * 				```
   *
   * If there already exists a point for the given `id`, its position and weight scale are updated to the given values.
   */
  open fun addPoint(
    id: Long,
    position: Vector2,
    weightScale: Double = 1.0
  ) {
    TransferContext.writeArguments(LONG to id, VECTOR2 to position, DOUBLE to weightScale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_ADD_POINT, NIL)
  }

  /**
   * Returns whether there is a connection/segment between the given points.
   */
  open fun arePointsConnected(id: Long, toId: Long): Boolean {
    TransferContext.writeArguments(LONG to id, LONG to toId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_ARE_POINTS_CONNECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Clears all the points and segments.
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_CLEAR, NIL)
  }

  /**
   * Creates a segment between the given points. If `bidirectional` is `false`, only movement from `id` to `to_id` is allowed, not the reverse direction.
   *
   * ```
   * 				var astar = AStar2D.new()
   * 				astar.add_point(1, Vector2(1, 1))
   * 				astar.add_point(2, Vector2(0, 5))
   * 				astar.connect_points(1, 2, false)
   * 				```
   */
  open fun connectPoints(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true
  ) {
    TransferContext.writeArguments(LONG to id, LONG to toId, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_CONNECT_POINTS, NIL)
  }

  /**
   * Deletes the segment between the given points.
   */
  open fun disconnectPoints(id: Long, toId: Long) {
    TransferContext.writeArguments(LONG to id, LONG to toId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_DISCONNECT_POINTS, NIL)
  }

  /**
   * Returns the next available point ID with no point associated to it.
   */
  open fun getAvailablePointId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_AVAILABLE_POINT_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the ID of the closest point to `to_position`, optionally taking disabled points into account. Returns `-1` if there are no points in the points pool.
   *
   * **Note:** If several points are the closest to `to_position`, the one with the smallest ID will be returned, ensuring a deterministic result.
   */
  open fun getClosestPoint(toPosition: Vector2, includeDisabled: Boolean = false): Long {
    TransferContext.writeArguments(VECTOR2 to toPosition, BOOL to includeDisabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_CLOSEST_POINT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the closest position to `to_position` that resides inside a segment between two connected points.
   *
   * ```
   * 				var astar = AStar2D.new()
   * 				astar.add_point(1, Vector2(0, 0))
   * 				astar.add_point(2, Vector2(0, 5))
   * 				astar.connect_points(1, 2)
   * 				var res = astar.get_closest_position_in_segment(Vector2(3, 3)) # Returns (0, 3)
   * 				```
   *
   * The result is in the segment that goes from `y = 0` to `y = 5`. It's the closest position in the segment to the given point.
   */
  open fun getClosestPositionInSegment(toPosition: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to toPosition)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_CLOSEST_POSITION_IN_SEGMENT, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns an array with the IDs of the points that form the path found by AStar2D between the given points. The array is ordered from the starting point to the ending point of the path.
   *
   * ```
   * 				var astar = AStar2D.new()
   * 				astar.add_point(1, Vector2(0, 0))
   * 				astar.add_point(2, Vector2(0, 1), 1) # Default weight is 1
   * 				astar.add_point(3, Vector2(1, 1))
   * 				astar.add_point(4, Vector2(2, 0))
   *
   * 				astar.connect_points(1, 2, false)
   * 				astar.connect_points(2, 3, false)
   * 				astar.connect_points(4, 3, false)
   * 				astar.connect_points(1, 4, false)
   *
   * 				var res = astar.get_id_path(1, 3) # Returns [1, 2, 3]
   * 				```
   *
   * If you change the 2nd point's weight to 3, then the result will be `[1, 4, 3]` instead, because now even though the distance is longer, it's "easier" to get through point 4 than through point 2.
   */
  open fun getIdPath(fromId: Long, toId: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to fromId, LONG to toId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_ID_PATH, POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the capacity of the structure backing the points, useful in conjunction with `reserve_space`.
   */
  open fun getPointCapacity(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_POINT_CAPACITY, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an array with the IDs of the points that form the connection with the given point.
   *
   * ```
   * 				var astar = AStar2D.new()
   * 				astar.add_point(1, Vector2(0, 0))
   * 				astar.add_point(2, Vector2(0, 1))
   * 				astar.add_point(3, Vector2(1, 1))
   * 				astar.add_point(4, Vector2(2, 0))
   *
   * 				astar.connect_points(1, 2, true)
   * 				astar.connect_points(1, 3, true)
   *
   * 				var neighbors = astar.get_point_connections(1) # Returns [2, 3]
   * 				```
   */
  open fun getPointConnections(id: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_POINT_CONNECTIONS,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the number of points currently in the points pool.
   */
  open fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an array with the points that are in the path found by AStar2D between the given points. The array is ordered from the starting point to the ending point of the path.
   */
  open fun getPointPath(fromId: Long, toId: Long): PoolVector2Array {
    TransferContext.writeArguments(LONG to fromId, LONG to toId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_POINT_PATH,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }

  /**
   * Returns the position of the point associated with the given `id`.
   */
  open fun getPointPosition(id: Long): Vector2 {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_POINT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the weight scale of the point associated with the given `id`.
   */
  open fun getPointWeightScale(id: Long): Double {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_POINT_WEIGHT_SCALE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns an array of all points.
   */
  open fun getPoints(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_POINTS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns whether a point associated with the given `id` exists.
   */
  open fun hasPoint(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_HAS_POINT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether a point is disabled or not for pathfinding. By default, all points are enabled.
   */
  open fun isPointDisabled(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_IS_POINT_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the point associated with the given `id` from the points pool.
   */
  open fun removePoint(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_REMOVE_POINT, NIL)
  }

  /**
   * Reserves space internally for `num_nodes` points, useful if you're adding a known large number of points at once, for a grid for instance. New capacity must be greater or equals to old capacity.
   */
  open fun reserveSpace(numNodes: Long) {
    TransferContext.writeArguments(LONG to numNodes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_RESERVE_SPACE, NIL)
  }

  /**
   * Disables or enables the specified point for pathfinding. Useful for making a temporary obstacle.
   */
  open fun setPointDisabled(id: Long, disabled: Boolean = true) {
    TransferContext.writeArguments(LONG to id, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_SET_POINT_DISABLED, NIL)
  }

  /**
   * Sets the `position` for the point with the given `id`.
   */
  open fun setPointPosition(id: Long, position: Vector2) {
    TransferContext.writeArguments(LONG to id, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_SET_POINT_POSITION, NIL)
  }

  /**
   * Sets the `weight_scale` for the point with the given `id`.
   */
  open fun setPointWeightScale(id: Long, weightScale: Double) {
    TransferContext.writeArguments(LONG to id, DOUBLE to weightScale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_SET_POINT_WEIGHT_SCALE, NIL)
  }
}
