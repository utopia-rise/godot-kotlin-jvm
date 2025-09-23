// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An animatable 2D physics body. It can't be moved by external forces or contacts, but can be moved
 * manually by other means such as code, [AnimationMixer]s (with [AnimationMixer.callbackModeProcess]
 * set to [AnimationMixer.ANIMATION_CALLBACK_MODE_PROCESS_PHYSICS]), and [RemoteTransform2D].
 *
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
  public final inline var syncToPhysics: Boolean
    @JvmName("syncToPhysicsProperty")
    get() = isSyncToPhysicsEnabled()
    @JvmName("syncToPhysicsProperty")
    set(`value`) {
      setSyncToPhysics(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(8, scriptIndex)
  }

  public final fun setSyncToPhysics(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setSyncToPhysicsPtr, NIL)
  }

  public final fun isSyncToPhysicsEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSyncToPhysicsEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setSyncToPhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatableBody2D", "set_sync_to_physics", 2586408642)

    internal val isSyncToPhysicsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatableBody2D", "is_sync_to_physics_enabled", 36873697)
  }
}
