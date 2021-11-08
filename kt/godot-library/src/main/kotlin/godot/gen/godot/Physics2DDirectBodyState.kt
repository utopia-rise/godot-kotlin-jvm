// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Direct access object to a physics body in the [godot.Physics2DServer].
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.4/tutorials/physics/ray-casting.html](https://docs.godotengine.org/en/3.4/tutorials/physics/ray-casting.html)
 *
 * Provides direct access to a physics body in the [godot.Physics2DServer], allowing safe changes to physics properties. This object is passed via the direct state callback of rigid/character bodies, and is intended for changing the direct state of that body. See [godot.RigidBody2D.IntegrateForces].
 */
@GodotBaseType
public open class Physics2DDirectBodyState : Object() {
  /**
   * The body's rotational velocity.
   */
  public open var angularVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_ANGULAR_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_SET_ANGULAR_VELOCITY, NIL)
    }

  /**
   * The inverse of the inertia of the body.
   */
  public open val inverseInertia: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_INVERSE_INERTIA, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The inverse of the mass of the body.
   */
  public open val inverseMass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_INVERSE_MASS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The body's linear velocity.
   */
  public open var linearVelocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_LINEAR_VELOCITY, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_SET_LINEAR_VELOCITY, NIL)
    }

  /**
   * If `true`, this body is currently sleeping (not active).
   */
  public open var sleeping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_SLEEPING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_SET_SLEEPING, NIL)
    }

  /**
   * The timestep (delta) used for the simulation.
   */
  public open val step: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_STEP,
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
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_TOTAL_ANGULAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The total gravity vector being currently applied to this body.
   */
  public open val totalGravity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_TOTAL_GRAVITY, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  /**
   * The rate at which the body stops moving, if there are not any other forces moving it.
   */
  public open val totalLinearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_TOTAL_LINEAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The body's transformation matrix.
   */
  public open var transform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_TRANSFORM, TRANSFORM2D)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_SET_TRANSFORM, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICS2DDIRECTBODYSTATE)
  }

  @CoreTypeHelper
  public open fun linearVelocity(schedule: Vector2.() -> Unit): Vector2 = linearVelocity.apply{
      schedule(this)
      linearVelocity = this
  }


  @CoreTypeHelper
  public open fun transform(schedule: Transform2D.() -> Unit): Transform2D = transform.apply{
      schedule(this)
      transform = this
  }


  /**
   * Adds a constant directional force without affecting rotation.
   */
  public open fun addCentralForce(force: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_ADD_CENTRAL_FORCE, NIL)
  }

  /**
   * Adds a positioned force to the body. Both the force and the offset from the body origin are in global coordinates.
   */
  public open fun addForce(offset: Vector2, force: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset, VECTOR2 to force)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_ADD_FORCE,
        NIL)
  }

  /**
   * Adds a constant rotational force.
   */
  public open fun addTorque(torque: Double): Unit {
    TransferContext.writeArguments(DOUBLE to torque)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_ADD_TORQUE,
        NIL)
  }

  /**
   * Applies a directional impulse without affecting rotation.
   */
  public open fun applyCentralImpulse(impulse: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_APPLY_CENTRAL_IMPULSE, NIL)
  }

  /**
   * Applies a positioned impulse to the body. An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise). The offset uses the rotation of the global coordinate system, but is centered at the object's origin.
   */
  public open fun applyImpulse(offset: Vector2, impulse: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset, VECTOR2 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_APPLY_IMPULSE, NIL)
  }

  /**
   * Applies a rotational impulse to the body.
   */
  public open fun applyTorqueImpulse(impulse: Double): Unit {
    TransferContext.writeArguments(DOUBLE to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_APPLY_TORQUE_IMPULSE, NIL)
  }

  /**
   * Returns the collider's [RID].
   */
  public open fun getContactCollider(contactIdx: Long): RID {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_CONTACT_COLLIDER, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the collider's object id.
   */
  public open fun getContactColliderId(contactIdx: Long): Long {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_CONTACT_COLLIDER_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the collider object. This depends on how it was created (will return a scene node if such was used to create it).
   */
  public open fun getContactColliderObject(contactIdx: Long): Object? {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_CONTACT_COLLIDER_OBJECT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the contact position in the collider.
   */
  public open fun getContactColliderPosition(contactIdx: Long): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_CONTACT_COLLIDER_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the collider's shape index.
   */
  public open fun getContactColliderShape(contactIdx: Long): Long {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_CONTACT_COLLIDER_SHAPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the collided shape's metadata. This metadata is different from [godot.Object.getMeta], and is set with [godot.Physics2DServer.shapeSetData].
   */
  public open fun getContactColliderShapeMetadata(contactIdx: Long): Any? {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_CONTACT_COLLIDER_SHAPE_METADATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the linear velocity vector at the collider's contact point.
   */
  public open fun getContactColliderVelocityAtPosition(contactIdx: Long): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_CONTACT_COLLIDER_VELOCITY_AT_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the number of contacts this body has with other bodies.
   *
   * **Note:** By default, this returns 0 unless bodies are configured to monitor contacts. See [godot.RigidBody2D.contactMonitor].
   */
  public open fun getContactCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_CONTACT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the local normal at the contact point.
   */
  public open fun getContactLocalNormal(contactIdx: Long): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_CONTACT_LOCAL_NORMAL, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the local position of the contact point.
   */
  public open fun getContactLocalPosition(contactIdx: Long): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_CONTACT_LOCAL_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the local shape index of the collision.
   */
  public open fun getContactLocalShape(contactIdx: Long): Long {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_CONTACT_LOCAL_SHAPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the current state of the space, useful for queries.
   */
  public open fun getSpaceState(): Physics2DDirectSpaceState? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_SPACE_STATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Physics2DDirectSpaceState?
  }

  /**
   * Returns the body's velocity at the given relative position, including both translation and rotation.
   */
  public open fun getVelocityAtLocalPosition(localPosition: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to localPosition)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_GET_VELOCITY_AT_LOCAL_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Calls the built-in force integration code.
   */
  public open fun integrateForces(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTBODYSTATE_INTEGRATE_FORCES, NIL)
  }
}
