// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Capsule shape resource for 2D physics.
 *
 * 2D capsule shape to be added as a *direct* child of a [godot.PhysicsBody2D] or [godot.Area2D] using a [godot.CollisionShape2D] node. In 2D, a capsule is a rectangle shape with half-circles at both ends.
 *
 * **Performance:** Being a primitive collision shape, [godot.CapsuleShape2D] is fast to check collisions against (though not as fast as [godot.CircleShape2D]).
 */
@GodotBaseType
public open class CapsuleShape2D : Shape2D() {
  /**
   * The capsule's radius.
   */
  public var radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAPSULESHAPE2D_GET_RADIUS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAPSULESHAPE2D_SET_RADIUS, NIL)
    }

  /**
   * The capsule's height.
   */
  public var height: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAPSULESHAPE2D_GET_HEIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAPSULESHAPE2D_SET_HEIGHT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CAPSULESHAPE2D)
  }

  public companion object
}
