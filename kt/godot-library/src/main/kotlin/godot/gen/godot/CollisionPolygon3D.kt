// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A node that provides a thickened polygon shape (a prism) to a [CollisionObject3D] parent and
 * allows to edit it. The polygon can be concave or convex. This can give a detection shape to an
 * [Area3D] or turn [PhysicsBody3D] into a solid object.
 * **Warning:** A non-uniformly scaled [CollisionShape3D] will likely not behave as expected. Make
 * sure to keep its scale the same on all axes and adjust its shape resource instead.
 */
@GodotBaseType
public open class CollisionPolygon3D : Node3D() {
  /**
   * Length that the resulting collision extends in either direction perpendicular to its 2D
   * polygon.
   */
  public var depth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
    }

  /**
   * If `true`, no collision will be produced.
   */
  public var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisabledPtr, NIL)
    }

  /**
   * Array of vertices which define the 2D polygon in the local XY plane.
   */
  public var polygon: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPolygonPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPolygonPtr, NIL)
    }

  /**
   * The collision margin for the generated [Shape3D]. See [Shape3D.margin] for more details.
   */
  public var margin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMarginPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_COLLISIONPOLYGON3D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "set_depth", 373806689)

    public val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "get_depth", 1740695150)

    public val setPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "set_polygon", 1509147220)

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "get_polygon", 2961356807)

    public val setDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "set_disabled", 2586408642)

    public val isDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "is_disabled", 36873697)

    public val setMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "set_margin", 373806689)

    public val getMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "get_margin", 1740695150)
  }
}
