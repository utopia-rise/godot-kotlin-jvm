// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Physics body for 2D physics which moves only by script or animation. Useful for moving platforms and doors.
 *
 * Animatable body for 2D physics.
 *
 * An animatable body can't be moved by external forces or contacts, but can be moved by script or animation to affect other bodies in its path. It is ideal for implementing moving objects in the environment, such as moving platforms or doors.
 *
 * When the body is moved manually, either from code or from an [godot.AnimationPlayer] (with [godot.AnimationPlayer.playbackProcessMode] set to `physics`), the physics will automatically compute an estimate of their linear and angular velocity. This makes them very useful for moving platforms or other AnimationPlayer-controlled objects (like a door, a bridge that opens, etc).
 */
@GodotBaseType
public open class AnimatableBody2D : StaticBody2D() {
  /**
   * If `true`, the body's movement will be synchronized to the physics frame. This is useful when animating movement via [godot.AnimationPlayer], for example on moving platforms. Do **not** use together with [godot.PhysicsBody2D.moveAndCollide].
   */
  public var syncToPhysics: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATABLEBODY2D_IS_SYNC_TO_PHYSICS_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATABLEBODY2D_SET_SYNC_TO_PHYSICS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATABLEBODY2D, scriptIndex)
    return true
  }

  public companion object
}
