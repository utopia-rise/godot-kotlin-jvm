// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
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
open class PolygonPathFinder : Resource() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_POLYGONPATHFINDER)

  open fun _get_data(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_data is not implemented for PolygonPathFinder")
  }

  open fun _set_data(arg0: Dictionary<Any?, Any?>) {
  }

  open fun findPath(from: Vector2, to: Vector2): PoolVector2Array {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_FIND_PATH,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }

  open fun getBounds(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_GET_BOUNDS, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  open fun getClosestPoint(point: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_GET_CLOSEST_POINT,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getIntersections(from: Vector2, to: Vector2): PoolVector2Array {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_GET_INTERSECTIONS,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }

  open fun getPointPenalty(idx: Long): Double {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_GET_POINT_PENALTY,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun isPointInside(point: Vector2): Boolean {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_IS_POINT_INSIDE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun setPointPenalty(idx: Long, penalty: Double) {
    TransferContext.writeArguments(LONG to idx, DOUBLE to penalty)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_SET_POINT_PENALTY,
        NIL)
  }

  open fun setup(points: PoolVector2Array, connections: PoolIntArray) {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, POOL_INT_ARRAY to connections)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_SETUP, NIL)
  }

  companion object
}
