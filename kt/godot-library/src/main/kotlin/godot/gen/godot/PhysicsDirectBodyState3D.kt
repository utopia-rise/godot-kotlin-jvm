// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantType.BASIS
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Direct access object to a physics body in the [godot.PhysicsServer3D].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/physics/ray-casting.html]($DOCS_URL/tutorials/physics/ray-casting.html)
 *
 * Provides direct access to a physics body in the [godot.PhysicsServer3D], allowing safe changes to physics properties. This object is passed via the direct state callback of dynamic bodies, and is intended for changing the direct state of that body. See [godot.RigidDynamicBody3D.IntegrateForces].
 */
@GodotBaseType
public open class PhysicsDirectBodyState3D internal constructor() : Object() {
  /**
   * The timestep (delta) used for the simulation.
   */
  public val step: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_STEP,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The inverse of the mass of the body.
   */
  public val inverseMass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_INVERSE_MASS, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The rate at which the body stops rotating, if there are not any other forces moving it.
   */
  public val totalAngularDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_TOTAL_ANGULAR_DAMP, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The rate at which the body stops moving, if there are not any other forces moving it.
   */
  public val totalLinearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_TOTAL_LINEAR_DAMP, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The inverse of the inertia of the body.
   */
  public val inverseInertia: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_INVERSE_INERTIA, VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   * The total gravity vector being currently applied to this body.
   */
  public val totalGravity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_TOTAL_GRAVITY, VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   * The body's center of mass position relative to the body's center in the global coordinate system.
   */
  public val centerOfMass: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CENTER_OF_MASS, VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   * The body's center of mass position in the body's local coordinate system.
   */
  public val centerOfMassLocal: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CENTER_OF_MASS_LOCAL,
          VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   *
   */
  public val principalInertiaAxes: Basis
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_PRINCIPAL_INERTIA_AXES,
          BASIS.ordinal)
      return TransferContext.readReturnValue(BASIS, false) as Basis
    }

  /**
   * The body's rotational velocity in *radians* per second.
   */
  public var angularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_ANGULAR_VELOCITY, VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_SET_ANGULAR_VELOCITY, NIL.ordinal)
    }

  /**
   * The body's linear velocity in units per second.
   */
  public var linearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_LINEAR_VELOCITY, VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_SET_LINEAR_VELOCITY, NIL.ordinal)
    }

  /**
   * If `true`, this body is currently sleeping (not active).
   */
  public var sleeping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_IS_SLEEPING,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_SET_SLEEP_STATE, NIL.ordinal)
    }

  /**
   * The body's transformation matrix.
   */
  public var transform: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_TRANSFORM,
          TRANSFORM3D.ordinal)
      return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_SET_TRANSFORM,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSDIRECTBODYSTATE3D)
  }

  /**
   * Returns the body's velocity at the given relative position, including both translation and rotation.
   */
  public fun getVelocityAtLocalPosition(localPosition: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to localPosition)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_VELOCITY_AT_LOCAL_POSITION,
        VECTOR3.ordinal)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Applies a directional impulse without affecting rotation.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * This is equivalent to using [applyImpulse] at the body's center of mass.
   */
  public fun applyCentralImpulse(impulse: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_APPLY_CENTRAL_IMPULSE, NIL.ordinal)
  }

  /**
   * Applies a positioned impulse to the body.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * `position` is the offset from the body origin in global coordinates.
   */
  public fun applyImpulse(impulse: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse, VECTOR3 to position)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_APPLY_IMPULSE,
        NIL.ordinal)
  }

  /**
   * Applies a rotational impulse to the body without affecting the position.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   */
  public fun applyTorqueImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_APPLY_TORQUE_IMPULSE, NIL.ordinal)
  }

  /**
   * Applies a directional force without affecting rotation. A force is time dependent and meant to be applied every physics update.
   *
   * This is equivalent to using [applyForce] at the body's center of mass.
   */
  public fun applyCentralForce(force: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_APPLY_CENTRAL_FORCE, NIL.ordinal)
  }

  /**
   * Applies a positioned force to the body. A force is time dependent and meant to be applied every physics update.
   *
   * `position` is the offset from the body origin in global coordinates.
   */
  public fun applyForce(force: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_APPLY_FORCE,
        NIL.ordinal)
  }

  /**
   * Applies a rotational force without affecting position. A force is time dependent and meant to be applied every physics update.
   */
  public fun applyTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_APPLY_TORQUE,
        NIL.ordinal)
  }

  /**
   * Adds a constant directional force without affecting rotation that keeps being applied over time until cleared with `constant_force = Vector3(0, 0, 0)`.
   *
   * This is equivalent to using [addConstantForce] at the body's center of mass.
   */
  public fun addConstantCentralForce(force: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_ADD_CONSTANT_CENTRAL_FORCE, NIL.ordinal)
  }

  /**
   * Adds a constant positioned force to the body that keeps being applied over time until cleared with `constant_force = Vector3(0, 0, 0)`.
   *
   * `position` is the offset from the body origin in global coordinates.
   */
  public fun addConstantForce(force: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_ADD_CONSTANT_FORCE, NIL.ordinal)
  }

  /**
   * Adds a constant rotational force without affecting position that keeps being applied over time until cleared with `constant_torque = Vector3(0, 0, 0)`.
   */
  public fun addConstantTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_ADD_CONSTANT_TORQUE, NIL.ordinal)
  }

  /**
   * Sets the body's total constant positional forces applied during each physics update.
   *
   * See [addConstantForce] and [addConstantCentralForce].
   */
  public fun setConstantForce(force: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_SET_CONSTANT_FORCE, NIL.ordinal)
  }

  /**
   * Returns the body's total constant positional forces applied during each physics update.
   *
   * See [addConstantForce] and [addConstantCentralForce].
   */
  public fun getConstantForce(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONSTANT_FORCE, VECTOR3.ordinal)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Sets the body's total constant rotational forces applied during each physics update.
   *
   * See [addConstantTorque].
   */
  public fun setConstantTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_SET_CONSTANT_TORQUE, NIL.ordinal)
  }

  /**
   * Returns the body's total constant rotational forces applied during each physics update.
   *
   * See [addConstantTorque].
   */
  public fun getConstantTorque(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONSTANT_TORQUE, VECTOR3.ordinal)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the number of contacts this body has with other bodies.
   *
   * **Note:** By default, this returns 0 unless bodies are configured to monitor contacts. See [godot.RigidDynamicBody3D.contactMonitor].
   */
  public fun getContactCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_COUNT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the local position of the contact point.
   */
  public fun getContactLocalPosition(contactIdx: Long): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_LOCAL_POSITION,
        VECTOR3.ordinal)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the local normal at the contact point.
   */
  public fun getContactLocalNormal(contactIdx: Long): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_LOCAL_NORMAL, VECTOR3.ordinal)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Impulse created by the contact. Only implemented for Bullet physics.
   */
  public fun getContactImpulse(contactIdx: Long): Double {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_IMPULSE, DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the local shape index of the collision.
   */
  public fun getContactLocalShape(contactIdx: Long): Long {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_LOCAL_SHAPE, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the collider's [RID].
   */
  public fun getContactCollider(contactIdx: Long): RID {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_COLLIDER, _RID.ordinal)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the contact position in the collider.
   */
  public fun getContactColliderPosition(contactIdx: Long): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_COLLIDER_POSITION,
        VECTOR3.ordinal)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the collider's object id.
   */
  public fun getContactColliderId(contactIdx: Long): Long {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_COLLIDER_ID, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the collider object.
   */
  public fun getContactColliderObject(contactIdx: Long): Object? {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_COLLIDER_OBJECT,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the collider's shape index.
   */
  public fun getContactColliderShape(contactIdx: Long): Long {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_COLLIDER_SHAPE, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the linear velocity vector at the collider's contact point.
   */
  public fun getContactColliderVelocityAtPosition(contactIdx: Long): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_COLLIDER_VELOCITY_AT_POSITION,
        VECTOR3.ordinal)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Calls the built-in force integration code.
   */
  public fun integrateForces(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_INTEGRATE_FORCES, NIL.ordinal)
  }

  /**
   * Returns the current state of the space, useful for queries.
   */
  public fun getSpaceState(): PhysicsDirectSpaceState3D? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_SPACE_STATE,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState3D?
  }

  public companion object
}
