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
 * A 3D physics body that can't be moved by external forces. When moved manually, it affects other bodies in its path.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
 *
 * An animatable 3D physics body. It can't be moved by external forces or contacts, but can be moved manually by other means such as code, [godot.AnimationPlayer]s (with [godot.AnimationPlayer.playbackProcessMode] set to `ANIMATION_PROCESS_PHYSICS`), and [godot.RemoteTransform3D].
 *
 * When [godot.AnimatableBody3D] is moved, its linear and angular velocity are estimated and used to affect other physics bodies in its path. This makes it useful for moving platforms, doors, and other moving objects.
 */
@GodotBaseType
public open class AnimatableBody3D : StaticBody3D() {
  /**
   * If `true`, the body's movement will be synchronized to the physics frame. This is useful when animating movement via [godot.AnimationPlayer], for example on moving platforms. Do **not** use together with [godot.PhysicsBody3D.moveAndCollide].
   */
  public var syncToPhysics: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATABLEBODY3D_IS_SYNC_TO_PHYSICS_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATABLEBODY3D_SET_SYNC_TO_PHYSICS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATABLEBODY3D, scriptIndex)
    return true
  }

  public companion object
}
