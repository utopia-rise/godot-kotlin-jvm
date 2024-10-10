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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_POLYGONPATHFINDER_INDEX: Int = 447

@GodotBaseType
public open class PolygonPathFinder : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_POLYGONPATHFINDER_INDEX, scriptIndex)
  }

  public final fun setup(points: PackedVector2Array, connections: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_INT_32_ARRAY to connections)
    Internals.callMethod(rawPtr, MethodBindings.setupPtr, NIL)
  }

  public final fun findPath(from: Vector2, to: Vector2): PackedVector2Array {
    Internals.writeArguments(VECTOR2 to from, VECTOR2 to to)
    Internals.callMethod(rawPtr, MethodBindings.findPathPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun getIntersections(from: Vector2, to: Vector2): PackedVector2Array {
    Internals.writeArguments(VECTOR2 to from, VECTOR2 to to)
    Internals.callMethod(rawPtr, MethodBindings.getIntersectionsPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun getClosestPoint(point: Vector2): Vector2 {
    Internals.writeArguments(VECTOR2 to point)
    Internals.callMethod(rawPtr, MethodBindings.getClosestPointPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun isPointInside(point: Vector2): Boolean {
    Internals.writeArguments(VECTOR2 to point)
    Internals.callMethod(rawPtr, MethodBindings.isPointInsidePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPointPenalty(idx: Int, penalty: Float): Unit {
    Internals.writeArguments(LONG to idx.toLong(), DOUBLE to penalty.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPointPenaltyPtr, NIL)
  }

  public final fun getPointPenalty(idx: Int): Float {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getPointPenaltyPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getBounds(): Rect2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBoundsPtr, RECT2)
    return (Internals.readReturnValue(RECT2) as Rect2)
  }

  public companion object

  internal object MethodBindings {
    public val setupPtr: VoidPtr =
        Internals.getMethodBindPtr("PolygonPathFinder", "setup", 3251786936)

    public val findPathPtr: VoidPtr =
        Internals.getMethodBindPtr("PolygonPathFinder", "find_path", 1562168077)

    public val getIntersectionsPtr: VoidPtr =
        Internals.getMethodBindPtr("PolygonPathFinder", "get_intersections", 3932192302)

    public val getClosestPointPtr: VoidPtr =
        Internals.getMethodBindPtr("PolygonPathFinder", "get_closest_point", 2656412154)

    public val isPointInsidePtr: VoidPtr =
        Internals.getMethodBindPtr("PolygonPathFinder", "is_point_inside", 556197845)

    public val setPointPenaltyPtr: VoidPtr =
        Internals.getMethodBindPtr("PolygonPathFinder", "set_point_penalty", 1602489585)

    public val getPointPenaltyPtr: VoidPtr =
        Internals.getMethodBindPtr("PolygonPathFinder", "get_point_penalty", 2339986948)

    public val getBoundsPtr: VoidPtr =
        Internals.getMethodBindPtr("PolygonPathFinder", "get_bounds", 1639390495)
  }
}
