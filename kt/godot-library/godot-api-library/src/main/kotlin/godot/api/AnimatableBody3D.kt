// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
import kotlin.jvm.JvmName

/**
 * An animatable 3D physics body. It can't be moved by external forces or contacts, but can be moved manually by other means such as code, [AnimationMixer]s (with [AnimationMixer.callbackModeProcess] set to [AnimationMixer.ANIMATION_CALLBACK_MODE_PROCESS_PHYSICS]), and [RemoteTransform3D].
 *
 * When [AnimatableBody3D] is moved, its linear and angular velocity are estimated and used to affect other physics bodies in its path. This makes it useful for moving platforms, doors, and other moving objects.
 */
@GodotBaseType
public open class AnimatableBody3D : StaticBody3D() {
  /**
   * If `true`, the body's movement will be synchronized to the physics frame. This is useful when animating movement via [AnimationPlayer], for example on moving platforms. Do **not** use together with [PhysicsBody3D.moveAndCollide].
   */
  public final inline var syncToPhysics: Boolean
    @JvmName("syncToPhysicsProperty")
    get() = isSyncToPhysicsEnabled()
    @JvmName("syncToPhysicsProperty")
    set(`value`) {
      setSyncToPhysics(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(8, scriptIndex)
  }

  public final fun setSyncToPhysics(enable: Boolean) {
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
        TypeManager.getMethodBindPtr("AnimatableBody3D", "set_sync_to_physics", 2_586_408_642)

    internal val isSyncToPhysicsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatableBody3D", "is_sync_to_physics_enabled", 36_873_697)
  }
}
