// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolIntArray
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * An implementation of A* to find the shortest paths among connected points in space.
 *
 * A* (A star) is a computer algorithm that is widely used in pathfinding and graph traversal, the process of plotting short paths among vertices (points), passing through a given set of edges (segments). It enjoys widespread use due to its performance and accuracy. Godot's A* implementation uses points in three-dimensional space and Euclidean distances by default.
 *
 * You must add points manually with [addPoint] and create segments manually with [connectPoints]. Then you can test if there is a path between two points with the [arePointsConnected] function, get a path containing indices by [getIdPath], or one containing actual coordinates with [getPointPath].
 *
 * It is also possible to use non-Euclidean distances. To do so, create a class that extends `AStar` and override methods [_computeCost] and [_estimateCost]. Both take two indices and return a length, as is shown in the following example.
 *
 * ```
 * 		class MyAStar:
 * 		    extends AStar
 *
 * 		    func _compute_cost(u, v):
 * 		        return abs(u - v)
 *
 * 		    func _estimate_cost(u, v):
 * 		        return min(0, abs(u - v) - 1)
 * 		```
 *
 * [_estimateCost] should return a lower bound of the distance, i.e. `_estimate_cost(u, v) <= _compute_cost(u, v)`. This serves as a hint to the algorithm because the custom `_compute_cost` might be computation-heavy. If this is not the case, make [_estimateCost] return the same value as [_computeCost] to provide the algorithm with the most accurate information.
 *
 * If the default [_estimateCost] and [_computeCost] methods are used, or if the supplied [_estimateCost] method returns a lower bound of the cost, then the paths returned by A* will be the lowest cost paths. Here, the cost of a path equals to the sum of the [_computeCost] results of all segments in the path multiplied by the `weight_scale`s of the end points of the respective segments. If the default methods are used and the `weight_scale`s of all points are set to `1.0`, then this equals to the sum of Euclidean distances of all segments in the path.
 */
@GodotBaseType
open class AStar : Reference() {
  override fun __new() {
    callConstructor(ENGINECLASS_ASTAR)
  }

  /**
   * Called when computing the cost between two connected points.
   *
   * Note that this function is hidden in the default `AStar` class.
   */
  open fun _computeCost(fromId: Long, toId: Long): Double {
    throw NotImplementedError("_compute_cost is not implemented for AStar")
  }

  /**
   * Called when estimating the cost between a point and the path's ending point.
   *
   * Note that this function is hidden in the default `AStar` class.
   */
  open fun _estimateCost(fromId: Long, toId: Long): Double {
    throw NotImplementedError("_estimate_cost is not implemented for AStar")
  }

  /**
   * Adds a new point at the given position with the given identifier. The `id` must be 0 or larger, and the `weight_scale` must be 1 or larger.
   *
   * The `weight_scale` is multiplied by the result of [_computeCost] when determining the overall cost of traveling across a segment from a neighboring point to this point. Thus, all else being equal, the algorithm prefers points with lower `weight_scale`s to form a path.
   *
   * ```
   * 				var astar = AStar.new()
   * 				astar.add_point(1, Vector3(1, 0, 0), 4) # Adds the point (1, 0, 0) with weight_scale 4 and id 1
   * 				```
   *
   * If there already exists a point for the given `id`, its position and weight scale are updated to the given values.
   */
  open fun addPoint(
    id: Long,
    position: Vector3,
    weightScale: Double = 1.0
  ) {
    TransferContext.writeArguments(LONG to id, VECTOR3 to position, DOUBLE to weightScale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_ADD_POINT, NIL)
  }

  /**
   * Returns whether the two given points are directly connected by a segment. If `bidirectional` is `false`, returns whether movement from `id` to `to_id` is possible through this segment.
   */
  open fun arePointsConnected(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true
  ): Boolean {
    TransferContext.writeArguments(LONG to id, LONG to toId, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_ARE_POINTS_CONNECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Clears all the points and segments.
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_CLEAR, NIL)
  }

  /**
   * Creates a segment between the given points. If `bidirectional` is `false`, only movement from `id` to `to_id` is allowed, not the reverse direction.
   *
   * ```
   * 				var astar = AStar.new()
   * 				astar.add_point(1, Vector3(1, 1, 0))
   * 				astar.add_point(2, Vector3(0, 5, 0))
   * 				astar.connect_points(1, 2, false)
   * 				```
   */
  open fun connectPoints(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true
  ) {
    TransferContext.writeArguments(LONG to id, LONG to toId, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_CONNECT_POINTS, NIL)
  }

  /**
   * Deletes the segment between the given points. If `bidirectional` is `false`, only movement from `id` to `to_id` is prevented, and a unidirectional segment possibly remains.
   */
  open fun disconnectPoints(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true
  ) {
    TransferContext.writeArguments(LONG to id, LONG to toId, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_DISCONNECT_POINTS, NIL)
  }

  /**
   * Returns the next available point ID with no point associated to it.
   */
  open fun getAvailablePointId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_GET_AVAILABLE_POINT_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the ID of the closest point to `to_position`, optionally taking disabled points into account. Returns `-1` if there are no points in the points pool.
   *
   * **Note:** If several points are the closest to `to_position`, the one with the smallest ID will be returned, ensuring a deterministic result.
   */
  open fun getClosestPoint(toPosition: Vector3, includeDisabled: Boolean = false): Long {
    TransferContext.writeArguments(VECTOR3 to toPosition, BOOL to includeDisabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_GET_CLOSEST_POINT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the closest position to `to_position` that resides inside a segment between two connected points.
   *
   * ```
   * 				var astar = AStar.new()
   * 				astar.add_point(1, Vector3(0, 0, 0))
   * 				astar.add_point(2, Vector3(0, 5, 0))
   * 				astar.connect_points(1, 2)
   * 				var res = astar.get_closest_position_in_segment(Vector3(3, 3, 0)) # Returns (0, 3, 0)
   * 				```
   *
   * The result is in the segment that goes from `y = 0` to `y = 5`. It's the closest position in the segment to the given point.
   */
  open fun getClosestPositionInSegment(toPosition: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to toPosition)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ASTAR_GET_CLOSEST_POSITION_IN_SEGMENT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns an array with the IDs of the points that form the path found by AStar between the given points. The array is ordered from the starting point to the ending point of the path.
   *
   * ```
   * 				var astar = AStar.new()
   * 				astar.add_point(1, Vector3(0, 0, 0))
   * 				astar.add_point(2, Vector3(0, 1, 0), 1) # Default weight is 1
   * 				astar.add_point(3, Vector3(1, 1, 0))
   * 				astar.add_point(4, Vector3(2, 0, 0))
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_GET_ID_PATH, POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the capacity of the structure backing the points, useful in conjunction with `reserve_space`.
   */
  open fun getPointCapacity(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_GET_POINT_CAPACITY, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an array with the IDs of the points that form the connection with the given point.
   *
   * ```
   * 				var astar = AStar.new()
   * 				astar.add_point(1, Vector3(0, 0, 0))
   * 				astar.add_point(2, Vector3(0, 1, 0))
   * 				astar.add_point(3, Vector3(1, 1, 0))
   * 				astar.add_point(4, Vector3(2, 0, 0))
   *
   * 				astar.connect_points(1, 2, true)
   * 				astar.connect_points(1, 3, true)
   *
   * 				var neighbors = astar.get_point_connections(1) # Returns [2, 3]
   * 				```
   */
  open fun getPointConnections(id: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_GET_POINT_CONNECTIONS,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the number of points currently in the points pool.
   */
  open fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_GET_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an array with the points that are in the path found by AStar between the given points. The array is ordered from the starting point to the ending point of the path.
   *
   * **Note:** This method is not thread-safe. If called from a [godot.Thread], it will return an empty [godot.core.PoolVector3Array] and will print an error message.
   */
  open fun getPointPath(fromId: Long, toId: Long): PoolVector3Array {
    TransferContext.writeArguments(LONG to fromId, LONG to toId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_GET_POINT_PATH,
        POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  /**
   * Returns the position of the point associated with the given `id`.
   */
  open fun getPointPosition(id: Long): Vector3 {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_GET_POINT_POSITION, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the weight scale of the point associated with the given `id`.
   */
  open fun getPointWeightScale(id: Long): Double {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_GET_POINT_WEIGHT_SCALE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns an array of all points.
   */
  open fun getPoints(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_GET_POINTS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns whether a point associated with the given `id` exists.
   */
  open fun hasPoint(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_HAS_POINT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether a point is disabled or not for pathfinding. By default, all points are enabled.
   */
  open fun isPointDisabled(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_IS_POINT_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the point associated with the given `id` from the points pool.
   */
  open fun removePoint(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_REMOVE_POINT, NIL)
  }

  /**
   * Reserves space internally for `num_nodes` points, useful if you're adding a known large number of points at once, for a grid for instance. New capacity must be greater or equals to old capacity.
   */
  open fun reserveSpace(numNodes: Long) {
    TransferContext.writeArguments(LONG to numNodes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_RESERVE_SPACE, NIL)
  }

  /**
   * Disables or enables the specified point for pathfinding. Useful for making a temporary obstacle.
   */
  open fun setPointDisabled(id: Long, disabled: Boolean = true) {
    TransferContext.writeArguments(LONG to id, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_SET_POINT_DISABLED, NIL)
  }

  /**
   * Sets the `position` for the point with the given `id`.
   */
  open fun setPointPosition(id: Long, position: Vector3) {
    TransferContext.writeArguments(LONG to id, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_SET_POINT_POSITION, NIL)
  }

  /**
   * Sets the `weight_scale` for the point with the given `id`. The `weight_scale` is multiplied by the result of [_computeCost] when determining the overall cost of traveling across a segment from a neighboring point to this point.
   */
  open fun setPointWeightScale(id: Long, weightScale: Double) {
    TransferContext.writeArguments(LONG to id, DOUBLE to weightScale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR_SET_POINT_WEIGHT_SCALE, NIL)
  }
}
