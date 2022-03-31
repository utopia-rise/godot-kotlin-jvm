// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

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
 * World boundary (infinite plane) shape resource for 2D physics.
 *
 * 2D world boundary shape to be added as a *direct* child of a [godot.PhysicsBody2D] or [godot.Area2D] using a [godot.CollisionShape2D] node. [godot.WorldBoundaryShape2D] works like an infinite plane and will not allow any physics body to go to the negative side. Note that the [normal] matters; anything "below" the plane will collide with it. If the [godot.WorldBoundaryShape2D] is used in a [godot.PhysicsBody2D], it will cause colliding objects placed "below" it to teleport "above" the plane.
 *
 * **Performance:** Being a primitive collision shape, [godot.WorldBoundaryShape2D] is fast to check collisions against.
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
