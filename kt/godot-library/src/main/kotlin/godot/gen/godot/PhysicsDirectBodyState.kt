// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantType.BASIS
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Direct access object to a physics body in the [godot.PhysicsServer].
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/physics/ray-casting.html](https://docs.godotengine.org/en/3.3/tutorials/physics/ray-casting.html)
 *
 * Provides direct access to a physics body in the [godot.PhysicsServer], allowing safe changes to physics properties. This object is passed via the direct state callback of rigid/character bodies, and is intended for changing the direct state of that body. See [godot.RigidBody.IntegrateForces].
 */
@GodotBaseType
public open class PhysicsDirectBodyState : Object() {
  /**
   * The body's rotational velocity.
   */
  public open var angularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_ANGULAR_VELOCITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_SET_ANGULAR_VELOCITY, NIL)
    }

  /**
   *
   */
  public open val centerOfMass: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_CENTER_OF_MASS, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   * The inverse of the inertia of the body.
   */
  public open val inverseInertia: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_INVERSE_INERTIA, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   * The inverse of the mass of the body.
   */
  public open val inverseMass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_INVERSE_MASS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The body's linear velocity.
   */
  public open var linearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_LINEAR_VELOCITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_SET_LINEAR_VELOCITY, NIL)
    }

  /**
   *
   */
  public open val principalInertiaAxes: Basis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_PRINCIPAL_INERTIA_AXES, BASIS)
      return TransferContext.readReturnValue(BASIS, false) as Basis
    }

  /**
   * If `true`, this body is currently sleeping (not active).
   */
  public open var sleeping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_SLEEPING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_SET_SLEEPING, NIL)
    }

  /**
   * The timestep (delta) used for the simulation.
   */
  public open val step: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_STEP,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The rate at which the body stops rotating, if there are not any other forces moving it.
   */
  public open val totalAngularDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_TOTAL_ANGULAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The total gravity vector being currently applied to this body.
   */
  public open val totalGravity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_TOTAL_GRAVITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   * The rate at which the body stops moving, if there are not any other forces moving it.
   */
  public open val totalLinearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_TOTAL_LINEAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The body's transformation matrix.
   */
  public open var transform: Transform
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_TRANSFORM, TRANSFORM)
      return TransferContext.readReturnValue(TRANSFORM, false) as Transform
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_SET_TRANSFORM, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSDIRECTBODYSTATE)
  }

  @CoreTypeHelper
  public open fun angularVelocity(schedule: Vector3.() -> Unit): Vector3 = angularVelocity.apply{
      schedule(this)
      angularVelocity = this
  }


  @CoreTypeHelper
  public open fun linearVelocity(schedule: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
      schedule(this)
      linearVelocity = this
  }


  @CoreTypeHelper
  public open fun transform(schedule: Transform.() -> Unit): Transform = transform.apply{
      schedule(this)
      transform = this
  }


  /**
   * Adds a constant directional force without affecting rotation.
   *
   * This is equivalent to `add_force(force, Vector3(0,0,0))`.
   */
  public open fun addCentralForce(force: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_ADD_CENTRAL_FORCE, NIL)
  }

  /**
   * Adds a positioned force to the body. Both the force and the offset from the body origin are in global coordinates.
   */
  public open fun addForce(force: Vector3, position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_ADD_FORCE,
        NIL)
  }

  /**
   * Adds a constant rotational force without affecting position.
   */
  public open fun addTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_ADD_TORQUE,
        NIL)
  }

  /**
   * Applies a single directional impulse without affecting rotation.
   *
   * This is equivalent to `apply_impulse(Vector3(0, 0, 0), impulse)`.
   */
  public open fun applyCentralImpulse(j: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to j)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_APPLY_CENTRAL_IMPULSE, NIL)
  }

  /**
   * Applies a positioned impulse to the body. An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason it should only be used when simulating one-time impacts. The position uses the rotation of the global coordinate system, but is centered at the object's origin.
   */
  public open fun applyImpulse(position: Vector3, j: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position, VECTOR3 to j)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_APPLY_IMPULSE, NIL)
  }

  /**
   * Apply a torque impulse (which will be affected by the body mass and shape). This will rotate the body around the vector `j` passed as parameter.
   */
  public open fun applyTorqueImpulse(j: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to j)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_APPLY_TORQUE_IMPULSE, NIL)
  }

  /**
   * Returns the collider's [RID].
   */
  public open fun getContactCollider(contactIdx: Long): RID {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_CONTACT_COLLIDER, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the collider's object id.
   */
  public open fun getContactColliderId(contactIdx: Long): Long {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_CONTACT_COLLIDER_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the collider object.
   */
  public open fun getContactColliderObject(contactIdx: Long): Object? {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_CONTACT_COLLIDER_OBJECT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the contact position in the collider.
   */
  public open fun getContactColliderPosition(contactIdx: Long): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_CONTACT_COLLIDER_POSITION, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the collider's shape index.
   */
  public open fun getContactColliderShape(contactIdx: Long): Long {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_CONTACT_COLLIDER_SHAPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the linear velocity vector at the collider's contact point.
   */
  public open fun getContactColliderVelocityAtPosition(contactIdx: Long): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_CONTACT_COLLIDER_VELOCITY_AT_POSITION,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the number of contacts this body has with other bodies.
   *
   * **Note:** By default, this returns 0 unless bodies are configured to monitor contacts. See [godot.RigidBody.contactMonitor].
   */
  public open fun getContactCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_CONTACT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Impulse created by the contact. Only implemented for Bullet physics.
   */
  public open fun getContactImpulse(contactIdx: Long): Double {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_CONTACT_IMPULSE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the local normal at the contact point.
   */
  public open fun getContactLocalNormal(contactIdx: Long): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_CONTACT_LOCAL_NORMAL, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the local position of the contact point.
   */
  public open fun getContactLocalPosition(contactIdx: Long): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_CONTACT_LOCAL_POSITION, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the local shape index of the collision.
   */
  public open fun getContactLocalShape(contactIdx: Long): Long {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_CONTACT_LOCAL_SHAPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the current state of the space, useful for queries.
   */
  public open fun getSpaceState(): PhysicsDirectSpaceState? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_GET_SPACE_STATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState?
  }

  /**
   * Calls the built-in force integration code.
   */
  public open fun integrateForces(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE_INTEGRATE_FORCES, NIL)
  }
}
