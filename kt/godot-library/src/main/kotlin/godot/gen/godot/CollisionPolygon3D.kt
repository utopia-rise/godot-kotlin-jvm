// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

/**
 * A node that provides a thickened polygon shape (a prism) to a [godot.CollisionObject3D] parent.
 *
 * A node that provides a thickened polygon shape (a prism) to a [godot.CollisionObject3D] parent and allows to edit it. The polygon can be concave or convex. This can give a detection shape to an [godot.Area3D] or turn [godot.PhysicsBody3D] into a solid object.
 *
 * **Warning:** A non-uniformly scaled [godot.CollisionShape3D] will likely not behave as expected. Make sure to keep its scale the same on all axes and adjust its shape resource instead.
 */
@GodotBaseType
public open class CollisionPolygon3D : Node3D() {
  /**
   * Length that the resulting collision extends in either direction perpendicular to its 2D polygon.
   */
  public var depth: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON3D_GET_DEPTH,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON3D_SET_DEPTH, NIL)
    }

  /**
   * If `true`, no collision will be produced.
   */
  public var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON3D_IS_DISABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON3D_SET_DISABLED,
          NIL)
    }

  /**
   * Array of vertices which define the 2D polygon in the local XY plane.
   *
   * **Note:** The returned value is a copy of the original. Methods which mutate the size or properties of the return value will not impact the original polygon. To change properties of the polygon, assign it to a temporary variable and make changes before reassigning the `polygon` member.
   */
  public var polygon: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON3D_GET_POLYGON,
          PACKED_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON3D_SET_POLYGON,
          NIL)
    }

  /**
   * The collision margin for the generated [godot.Shape3D]. See [godot.Shape3D.margin] for more details.
   */
  public var margin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON3D_GET_MARGIN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON3D_SET_MARGIN,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COLLISIONPOLYGON3D, scriptIndex)
    return true
  }

  public companion object
}
