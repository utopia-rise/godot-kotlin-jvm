// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * An animatable 2D physics body. It can't be moved by external forces or contacts, but can be moved
 * manually by other means such as code, [AnimationMixer]s (with [AnimationMixer.callbackModeProcess]
 * set to [AnimationMixer.ANIMATION_CALLBACK_MODE_PROCESS_PHYSICS]), and [RemoteTransform2D].
 * When [AnimatableBody2D] is moved, its linear and angular velocity are estimated and used to
 * affect other physics bodies in its path. This makes it useful for moving platforms, doors, and other
 * moving objects.
 */
@GodotBaseType
public open class AnimatableBody2D : StaticBody2D() {
  /**
   * If `true`, the body's movement will be synchronized to the physics frame. This is useful when
   * animating movement via [AnimationPlayer], for example on moving platforms. Do **not** use together
   * with [PhysicsBody2D.moveAndCollide].
   */
  public var syncToPhysics: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSyncToPhysicsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSyncToPhysicsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ANIMATABLEBODY2D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setSyncToPhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatableBody2D", "set_sync_to_physics")

    public val isSyncToPhysicsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatableBody2D", "is_sync_to_physics_enabled")
  }
}
