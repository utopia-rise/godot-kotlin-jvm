// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_STATICBODY3D_INDEX: Int = 551

/**
 * A static 3D physics body. It can't be moved by external forces or contacts, but can be moved
 * manually by other means such as code, [AnimationMixer]s (with [AnimationMixer.callbackModeProcess]
 * set to [AnimationMixer.ANIMATION_CALLBACK_MODE_PROCESS_PHYSICS]), and [RemoteTransform3D].
 * When [StaticBody3D] is moved, it is teleported to its new position without affecting other
 * physics bodies in its path. If this is not desired, use [AnimatableBody3D] instead.
 * [StaticBody3D] is useful for completely static objects like floors and walls, as well as moving
 * surfaces like conveyor belts and circular revolving platforms (by using [constantLinearVelocity] and
 * [constantAngularVelocity]).
 */
@GodotBaseType
public open class StaticBody3D : PhysicsBody3D() {
  /**
   * The physics material override for the body.
   * If a material is assigned to this property, it will be used instead of any other physics
   * material, such as an inherited one.
   */
  public final inline var physicsMaterialOverride: PhysicsMaterial?
    @JvmName("physicsMaterialOverrideProperty")
    get() = getPhysicsMaterialOverride()
    @JvmName("physicsMaterialOverrideProperty")
    set(`value`) {
      setPhysicsMaterialOverride(value)
    }

  /**
   * The body's constant linear velocity. This does not move the body, but affects touching bodies,
   * as if it were moving.
   */
  @CoreTypeLocalCopy
  public final inline var constantLinearVelocity: Vector3
    @JvmName("constantLinearVelocityProperty")
    get() = getConstantLinearVelocity()
    @JvmName("constantLinearVelocityProperty")
    set(`value`) {
      setConstantLinearVelocity(value)
    }

  /**
   * The body's constant angular velocity. This does not rotate the body, but affects touching
   * bodies, as if it were rotating.
   */
  @CoreTypeLocalCopy
  public final inline var constantAngularVelocity: Vector3
    @JvmName("constantAngularVelocityProperty")
    get() = getConstantAngularVelocity()
    @JvmName("constantAngularVelocityProperty")
    set(`value`) {
      setConstantAngularVelocity(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_STATICBODY3D_INDEX, scriptIndex)
  }

  /**
   * The body's constant linear velocity. This does not move the body, but affects touching bodies,
   * as if it were moving.
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
  public final fun constantLinearVelocityMutate(block: Vector3.() -> Unit): Vector3 =
      constantLinearVelocity.apply{
      block(this)
      constantLinearVelocity = this
  }


  /**
   * The body's constant angular velocity. This does not rotate the body, but affects touching
   * bodies, as if it were rotating.
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
  public final fun constantAngularVelocityMutate(block: Vector3.() -> Unit): Vector3 =
      constantAngularVelocity.apply{
      block(this)
      constantAngularVelocity = this
  }


  public final fun setConstantLinearVelocity(vel: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to vel)
    Internals.callMethod(rawPtr, MethodBindings.setConstantLinearVelocityPtr, NIL)
  }

  public final fun setConstantAngularVelocity(vel: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to vel)
    Internals.callMethod(rawPtr, MethodBindings.setConstantAngularVelocityPtr, NIL)
  }

  public final fun getConstantLinearVelocity(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConstantLinearVelocityPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun getConstantAngularVelocity(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConstantAngularVelocityPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial?): Unit {
    Internals.writeArguments(OBJECT to physicsMaterialOverride)
    Internals.callMethod(rawPtr, MethodBindings.setPhysicsMaterialOverridePtr, NIL)
  }

  public final fun getPhysicsMaterialOverride(): PhysicsMaterial? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPhysicsMaterialOverridePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as PhysicsMaterial?)
  }

  public companion object

  internal object MethodBindings {
    public val setConstantLinearVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("StaticBody3D", "set_constant_linear_velocity", 3460891852)

    public val setConstantAngularVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("StaticBody3D", "set_constant_angular_velocity", 3460891852)

    public val getConstantLinearVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("StaticBody3D", "get_constant_linear_velocity", 3360562783)

    public val getConstantAngularVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("StaticBody3D", "get_constant_angular_velocity", 3360562783)

    public val setPhysicsMaterialOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("StaticBody3D", "set_physics_material_override", 1784508650)

    public val getPhysicsMaterialOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("StaticBody3D", "get_physics_material_override", 2521850424)
  }
}
