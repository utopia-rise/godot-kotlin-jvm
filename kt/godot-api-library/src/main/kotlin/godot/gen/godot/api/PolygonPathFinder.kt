// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedInt32Array
import godot.core.PackedVector2Array
import godot.core.Rect2
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class PolygonPathFinder : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_POLYGONPATHFINDER, scriptIndex)
  }

  public final fun setup(points: PackedVector2Array, connections: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_INT_32_ARRAY to connections)
    TransferContext.callMethod(ptr, MethodBindings.setupPtr, NIL)
  }

  public final fun findPath(from: Vector2, to: Vector2): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to)
    TransferContext.callMethod(ptr, MethodBindings.findPathPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun getIntersections(from: Vector2, to: Vector2): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to)
    TransferContext.callMethod(ptr, MethodBindings.getIntersectionsPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun getClosestPoint(point: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(ptr, MethodBindings.getClosestPointPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun isPointInside(point: Vector2): Boolean {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(ptr, MethodBindings.isPointInsidePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPointPenalty(idx: Int, penalty: Float): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), DOUBLE to penalty.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPointPenaltyPtr, NIL)
  }

  public final fun getPointPenalty(idx: Int): Float {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPointPenaltyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getBounds(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBoundsPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  public companion object

  internal object MethodBindings {
    public val setupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonPathFinder", "setup", 3251786936)

    public val findPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonPathFinder", "find_path", 1562168077)

    public val getIntersectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonPathFinder", "get_intersections", 3932192302)

    public val getClosestPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonPathFinder", "get_closest_point", 2656412154)

    public val isPointInsidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonPathFinder", "is_point_inside", 556197845)

    public val setPointPenaltyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonPathFinder", "set_point_penalty", 1602489585)

    public val getPointPenaltyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonPathFinder", "get_point_penalty", 2339986948)

    public val getBoundsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonPathFinder", "get_bounds", 1639390495)
  }
}
