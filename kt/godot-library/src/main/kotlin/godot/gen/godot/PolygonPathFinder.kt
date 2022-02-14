// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedVector2Array
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class PolygonPathFinder : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_POLYGONPATHFINDER)
  }

  /**
   *
   */
  public open fun setup(points: PackedVector2Array, connections: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_INT_32_ARRAY to
        connections)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_SETUP, NIL)
  }

  /**
   *
   */
  public open fun findPath(from: Vector2, to: Vector2): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_FIND_PATH,
        PACKED_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
  }

  /**
   *
   */
  public open fun getIntersections(from: Vector2, to: Vector2): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_GET_INTERSECTIONS,
        PACKED_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
  }

  /**
   *
   */
  public open fun getClosestPoint(point: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_GET_CLOSEST_POINT,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   *
   */
  public open fun isPointInside(point: Vector2): Boolean {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_IS_POINT_INSIDE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun setPointPenalty(idx: Long, penalty: Double): Unit {
    TransferContext.writeArguments(LONG to idx, DOUBLE to penalty)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_SET_POINT_PENALTY,
        NIL)
  }

  /**
   *
   */
  public open fun getPointPenalty(idx: Long): Double {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_GET_POINT_PENALTY,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   *
   */
  public open fun getBounds(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONPATHFINDER_GET_BOUNDS, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  public companion object
}
