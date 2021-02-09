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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class AStar2D : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_ASTAR2D)

  open fun _computeCost(fromId: Long, toId: Long): Double {
    throw NotImplementedError("_compute_cost is not implemented for AStar2D")
  }

  open fun _estimateCost(fromId: Long, toId: Long): Double {
    throw NotImplementedError("_estimate_cost is not implemented for AStar2D")
  }

  open fun addPoint(
    id: Long,
    position: Vector2,
    weightScale: Double = 1.0
  ) {
    TransferContext.writeArguments(LONG to id, VECTOR2 to position, DOUBLE to weightScale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_ADD_POINT, NIL)
  }

  open fun arePointsConnected(id: Long, toId: Long): Boolean {
    TransferContext.writeArguments(LONG to id, LONG to toId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_ARE_POINTS_CONNECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_CLEAR, NIL)
  }

  open fun connectPoints(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true
  ) {
    TransferContext.writeArguments(LONG to id, LONG to toId, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_CONNECT_POINTS, NIL)
  }

  open fun disconnectPoints(id: Long, toId: Long) {
    TransferContext.writeArguments(LONG to id, LONG to toId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_DISCONNECT_POINTS, NIL)
  }

  open fun getAvailablePointId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_AVAILABLE_POINT_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getClosestPoint(toPosition: Vector2, includeDisabled: Boolean = false): Long {
    TransferContext.writeArguments(VECTOR2 to toPosition, BOOL to includeDisabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_CLOSEST_POINT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getClosestPositionInSegment(toPosition: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to toPosition)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_CLOSEST_POSITION_IN_SEGMENT, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getIdPath(fromId: Long, toId: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to fromId, LONG to toId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_ID_PATH, POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  open fun getPointCapacity(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_POINT_CAPACITY, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getPointConnections(id: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_POINT_CONNECTIONS,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  open fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getPointPath(fromId: Long, toId: Long): PoolVector2Array {
    TransferContext.writeArguments(LONG to fromId, LONG to toId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_POINT_PATH,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }

  open fun getPointPosition(id: Long): Vector2 {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_POINT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getPointWeightScale(id: Long): Double {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_POINT_WEIGHT_SCALE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getPoints(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_GET_POINTS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun hasPoint(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_HAS_POINT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isPointDisabled(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_IS_POINT_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun removePoint(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_REMOVE_POINT, NIL)
  }

  open fun reserveSpace(numNodes: Long) {
    TransferContext.writeArguments(LONG to numNodes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_RESERVE_SPACE, NIL)
  }

  open fun setPointDisabled(id: Long, disabled: Boolean = true) {
    TransferContext.writeArguments(LONG to id, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_SET_POINT_DISABLED, NIL)
  }

  open fun setPointPosition(id: Long, position: Vector2) {
    TransferContext.writeArguments(LONG to id, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_SET_POINT_POSITION, NIL)
  }

  open fun setPointWeightScale(id: Long, weightScale: Double) {
    TransferContext.writeArguments(LONG to id, DOUBLE to weightScale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTAR2D_SET_POINT_WEIGHT_SCALE, NIL)
  }
}
