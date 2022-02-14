// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * World boundary shape for 2D collisions.
 *
 * World boundary shape for 2D collisions. It works like a 2D plane and will not allow any physics body to go to the negative side. Not recommended for rigid bodies, and usually not recommended for static bodies either because it forces checks against it on every frame.
 */
@GodotBaseType
public open class WorldBoundaryShape2D : Shape2D() {
  /**
   * The line's normal. Defaults to `Vector2.UP`.
   */
  public open var normal: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLDBOUNDARYSHAPE2D_GET_NORMAL,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLDBOUNDARYSHAPE2D_SET_NORMAL,
          NIL)
    }

  /**
   * The line's distance from the origin.
   */
  public open var distance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLDBOUNDARYSHAPE2D_GET_DISTANCE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLDBOUNDARYSHAPE2D_SET_DISTANCE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WORLDBOUNDARYSHAPE2D)
  }

  public companion object
}
