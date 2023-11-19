// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A 3D physics body that can't be moved by external forces. When moved manually, it doesn't affect other bodies in its path.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
 *
 * A static 3D physics body. It can't be moved by external forces or contacts, but can be moved manually by other means such as code, [godot.AnimationPlayer]s (with [godot.AnimationPlayer.playbackProcessMode] set to `ANIMATION_PROCESS_PHYSICS`), and [godot.RemoteTransform3D].
 *
 * When [godot.StaticBody3D] is moved, it is teleported to its new position without affecting other physics bodies in its path. If this is not desired, use [godot.AnimatableBody3D] instead.
 *
 * [godot.StaticBody3D] is useful for completely static objects like floors and walls, as well as moving surfaces like conveyor belts and circular revolving platforms (by using [constantLinearVelocity] and [constantAngularVelocity]).
 */
@GodotBaseType
public open class StaticBody3D : PhysicsBody3D() {
  /**
   * The physics material override for the body.
   *
   * If a material is assigned to this property, it will be used instead of any other physics material, such as an inherited one.
   */
  public var physicsMaterialOverride: PhysicsMaterial?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsMaterialOverridePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsMaterialOverridePtr, NIL)
    }

  /**
   * The body's constant linear velocity. This does not move the body, but affects touching bodies, as if it were moving.
   */
  @CoreTypeLocalCopy
  public var constantLinearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantLinearVelocityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantLinearVelocityPtr, NIL)
    }

  /**
   * The body's constant angular velocity. This does not rotate the body, but affects touching bodies, as if it were rotating.
   */
  @CoreTypeLocalCopy
  public var constantAngularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantAngularVelocityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantAngularVelocityPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STATICBODY3D, scriptIndex)
    return true
  }

  /**
   * The body's constant linear velocity. This does not move the body, but affects touching bodies, as if it were moving.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = staticbody3d.constantLinearVelocity
   * //Your changes
   * staticbody3d.constantLinearVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun constantLinearVelocityMutate(block: Vector3.() -> Unit): Vector3 =
      constantLinearVelocity.apply{
      block(this)
      constantLinearVelocity = this
  }


  /**
   * The body's constant angular velocity. This does not rotate the body, but affects touching bodies, as if it were rotating.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = staticbody3d.constantAngularVelocity
   * //Your changes
   * staticbody3d.constantAngularVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun constantAngularVelocityMutate(block: Vector3.() -> Unit): Vector3 =
      constantAngularVelocity.apply{
      block(this)
      constantAngularVelocity = this
  }


  public companion object

  internal object MethodBindings {
    public val setConstantLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody3D", "set_constant_linear_velocity")

    public val setConstantAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody3D", "set_constant_angular_velocity")

    public val getConstantLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody3D", "get_constant_linear_velocity")

    public val getConstantAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody3D", "get_constant_angular_velocity")

    public val setPhysicsMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody3D", "set_physics_material_override")

    public val getPhysicsMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody3D", "get_physics_material_override")
  }
}
