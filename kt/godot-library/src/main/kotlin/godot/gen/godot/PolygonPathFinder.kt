// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedVector2Array
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class PolygonPathFinder : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_POLYGONPATHFINDER, scriptIndex)
    return true
  }

  /**
   *
   */
  public fun setup(points: PackedVector2Array, connections: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_INT_32_ARRAY to connections)
    TransferContext.callMethod(rawPtr, MethodBindings.setupPtr, NIL)
  }

  /**
   *
   */
  public fun findPath(from: Vector2, to: Vector2): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to)
    TransferContext.callMethod(rawPtr, MethodBindings.findPathPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   *
   */
  public fun getIntersections(from: Vector2, to: Vector2): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to)
    TransferContext.callMethod(rawPtr, MethodBindings.getIntersectionsPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   *
   */
  public fun getClosestPoint(point: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   *
   */
  public fun isPointInside(point: Vector2): Boolean {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, MethodBindings.isPointInsidePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   *
   */
  public fun setPointPenalty(idx: Int, penalty: Float): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), DOUBLE to penalty.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointPenaltyPtr, NIL)
  }

  /**
   *
   */
  public fun getPointPenalty(idx: Int): Float {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPenaltyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   *
   */
  public fun getBounds(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBoundsPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public companion object

  internal object MethodBindings {
    public val setupPtr: VoidPtr = TypeManager.getMethodBindPtr("PolygonPathFinder", "setup")

    public val findPathPtr: VoidPtr = TypeManager.getMethodBindPtr("PolygonPathFinder", "find_path")

    public val getIntersectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonPathFinder", "get_intersections")

    public val getClosestPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonPathFinder", "get_closest_point")

    public val isPointInsidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonPathFinder", "is_point_inside")

    public val setPointPenaltyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonPathFinder", "set_point_penalty")

    public val getPointPenaltyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonPathFinder", "get_point_penalty")

    public val getBoundsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonPathFinder", "get_bounds")
  }
}
