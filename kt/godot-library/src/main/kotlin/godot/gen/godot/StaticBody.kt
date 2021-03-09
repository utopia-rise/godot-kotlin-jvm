// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Static body for 3D physics.
 *
 * Static body for 3D physics. A static body is a simple body that is not intended to move. In contrast to [godot.RigidBody], they don't consume any CPU resources as long as they don't move.
 *
 * Additionally, a constant linear or angular velocity can be set for the static body, so even if it doesn't move, it affects other bodies as if it was moving (this is useful for simulating conveyor belts or conveyor wheels).
 */
@GodotBaseType
open class StaticBody : PhysicsBody() {
  /**
   * The body's bounciness. Values range from `0` (no bounce) to `1` (full bounciness).
   *
   * Deprecated, use [godot.PhysicsMaterial.bounce] instead via [physicsMaterialOverride].
   */
  open var bounce: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STATICBODY_GET_BOUNCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STATICBODY_SET_BOUNCE, NIL)
    }

  /**
   * The body's constant angular velocity. This does not rotate the body, but affects other bodies that touch it, as if it was in a state of rotation.
   */
  open var constantAngularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STATICBODY_GET_CONSTANT_ANGULAR_VELOCITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STATICBODY_SET_CONSTANT_ANGULAR_VELOCITY, NIL)
    }

  /**
   * The body's constant linear velocity. This does not move the body, but affects other bodies that touch it, as if it was in a state of movement.
   */
  open var constantLinearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STATICBODY_GET_CONSTANT_LINEAR_VELOCITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STATICBODY_SET_CONSTANT_LINEAR_VELOCITY, NIL)
    }

  /**
   * The body's friction, from 0 (frictionless) to 1 (full friction).
   *
   * Deprecated, use [godot.PhysicsMaterial.friction] instead via [physicsMaterialOverride].
   */
  open var friction: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STATICBODY_GET_FRICTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STATICBODY_SET_FRICTION, NIL)
    }

  /**
   * The physics material override for the body.
   *
   * If a material is assigned to this property, it will be used instead of any other physics material, such as an inherited one.
   */
  open var physicsMaterialOverride: PhysicsMaterial?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STATICBODY_GET_PHYSICS_MATERIAL_OVERRIDE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STATICBODY_SET_PHYSICS_MATERIAL_OVERRIDE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_STATICBODY)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun constantAngularVelocity(schedule: Vector3.() -> Unit): Vector3 =
      constantAngularVelocity.apply{
      schedule(this)
      constantAngularVelocity = this
  }


  open fun constantLinearVelocity(schedule: Vector3.() -> Unit): Vector3 =
      constantLinearVelocity.apply{
      schedule(this)
      constantLinearVelocity = this
  }


  open fun _reloadPhysicsCharacteristics() {
  }
}
