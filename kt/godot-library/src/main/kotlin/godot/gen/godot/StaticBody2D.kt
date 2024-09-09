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
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A static 2D physics body. It can't be moved by external forces or contacts, but can be moved
 * manually by other means such as code, [AnimationMixer]s (with [AnimationMixer.callbackModeProcess]
 * set to [AnimationMixer.ANIMATION_CALLBACK_MODE_PROCESS_PHYSICS]), and [RemoteTransform2D].
 * When [StaticBody2D] is moved, it is teleported to its new position without affecting other
 * physics bodies in its path. If this is not desired, use [AnimatableBody2D] instead.
 * [StaticBody2D] is useful for completely static objects like floors and walls, as well as moving
 * surfaces like conveyor belts and circular revolving platforms (by using [constantLinearVelocity] and
 * [constantAngularVelocity]).
 */
@GodotBaseType
public open class StaticBody2D : PhysicsBody2D() {
  /**
   * The physics material override for the body.
   * If a material is assigned to this property, it will be used instead of any other physics
   * material, such as an inherited one.
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
   * The body's constant linear velocity. This does not move the body, but affects touching bodies,
   * as if it were moving.
   */
  @CoreTypeLocalCopy
  public var constantLinearVelocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantLinearVelocityPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantLinearVelocityPtr, NIL)
    }

  /**
   * The body's constant angular velocity. This does not rotate the body, but affects touching
   * bodies, as if it were rotating.
   */
  public var constantAngularVelocity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantAngularVelocityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantAngularVelocityPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_STATICBODY2D, scriptIndex)
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
   * val myCoreType = staticbody2d.constantLinearVelocity
   * //Your changes
   * staticbody2d.constantLinearVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun constantLinearVelocityMutate(block: Vector2.() -> Unit): Vector2 =
      constantLinearVelocity.apply{
      block(this)
      constantLinearVelocity = this
  }


  public companion object

  internal object MethodBindings {
    public val setConstantLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody2D", "set_constant_linear_velocity", 743155724)

    public val setConstantAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody2D", "set_constant_angular_velocity", 373806689)

    public val getConstantLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody2D", "get_constant_linear_velocity", 3341600327)

    public val getConstantAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody2D", "get_constant_angular_velocity", 1740695150)

    public val setPhysicsMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody2D", "set_physics_material_override", 1784508650)

    public val getPhysicsMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody2D", "get_physics_material_override", 2521850424)
  }
}
