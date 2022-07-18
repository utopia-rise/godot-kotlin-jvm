// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Direct access object to a physics body in the [godot.PhysicsServer2D].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/physics/ray-casting.html]($DOCS_URL/tutorials/physics/ray-casting.html)
 *
 * Provides direct access to a physics body in the [godot.PhysicsServer2D], allowing safe changes to physics properties. This object is passed via the direct state callback of dynamic bodies, and is intended for changing the direct state of that body. See [godot.RigidDynamicBody2D.IntegrateForces].
 */
@GodotBaseType
public open class PhysicsDirectBodyState2D internal constructor() : Object() {
  /**
   * The timestep (delta) used for the simulation.
   */
  public val step: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_STEP,
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
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_INVERSE_MASS, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The inverse of the inertia of the body.
   */
  public val inverseInertia: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_INVERSE_INERTIA, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The rate at which the body stops rotating, if there are not any other forces moving it.
   */
  public val totalAngularDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_TOTAL_ANGULAR_DAMP, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The rate at which the body stops moving, if there are not any other forces moving it.
   */
  public val totalLinearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_TOTAL_LINEAR_DAMP, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The total gravity vector being currently applied to this body.
   */
  public val totalGravity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_TOTAL_GRAVITY, VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  /**
   * The body's center of mass position relative to the body's center in the global coordinate system.
   */
  public val centerOfMass: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_CENTER_OF_MASS, VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  /**
   * The body's center of mass position in the body's local coordinate system.
   */
  public val centerOfMassLocal: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_CENTER_OF_MASS_LOCAL,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  /**
   * The body's rotational velocity in *radians* per second.
   */
  public var angularVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_ANGULAR_VELOCITY, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_SET_ANGULAR_VELOCITY, NIL.ordinal)
    }

  /**
   * The body's linear velocity in pixels per second.
   */
  public var linearVelocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_LINEAR_VELOCITY, VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_SET_LINEAR_VELOCITY, NIL.ordinal)
    }

  /**
   * If `true`, this body is currently sleeping (not active).
   */
  public var sleeping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_IS_SLEEPING,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_SET_SLEEP_STATE, NIL.ordinal)
    }

  /**
   * The body's transformation matrix.
   */
  public var transform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_TRANSFORM,
          TRANSFORM2D.ordinal)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_SET_TRANSFORM,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSDIRECTBODYSTATE2D)
  }

  /**
   * Returns the body's velocity at the given relative position, including both translation and rotation.
   */
  public fun getVelocityAtLocalPosition(localPosition: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to localPosition)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_VELOCITY_AT_LOCAL_POSITION,
        VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Applies a directional impulse without affecting rotation.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * This is equivalent to using [applyImpulse] at the body's center of mass.
   */
  public fun applyCentralImpulse(impulse: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to impulse)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_APPLY_CENTRAL_IMPULSE, NIL.ordinal)
  }

  /**
   * Applies a rotational impulse to the body without affecting the position.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   */
  public fun applyTorqueImpulse(impulse: Double): Unit {
    TransferContext.writeArguments(DOUBLE to impulse)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_APPLY_TORQUE_IMPULSE, NIL.ordinal)
  }

  /**
   * Applies a positioned impulse to the body.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * `position` is the offset from the body origin in global coordinates.
   */
  public fun applyImpulse(impulse: Vector2, position: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to impulse, VECTOR2 to position)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_APPLY_IMPULSE,
        NIL.ordinal)
  }

  /**
   * Applies a directional force without affecting rotation. A force is time dependent and meant to be applied every physics update.
   *
   * This is equivalent to using [applyForce] at the body's center of mass.
   */
  public fun applyCentralForce(force: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_APPLY_CENTRAL_FORCE, NIL.ordinal)
  }

  /**
   * Applies a positioned force to the body. A force is time dependent and meant to be applied every physics update.
   *
   * `position` is the offset from the body origin in global coordinates.
   */
  public fun applyForce(force: Vector2, position: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to force, VECTOR2 to position)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_APPLY_FORCE,
        NIL.ordinal)
  }

  /**
   * Applies a rotational force without affecting position. A force is time dependent and meant to be applied every physics update.
   */
  public fun applyTorque(torque: Double): Unit {
    TransferContext.writeArguments(DOUBLE to torque)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_APPLY_TORQUE,
        NIL.ordinal)
  }

  /**
   * Adds a constant directional force without affecting rotation that keeps being applied over time until cleared with `constant_force = Vector2(0, 0)`.
   *
   * This is equivalent to using [addConstantForce] at the body's center of mass.
   */
  public fun addConstantCentralForce(force: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_ADD_CONSTANT_CENTRAL_FORCE, NIL.ordinal)
  }

  /**
   * Adds a constant positioned force to the body that keeps being applied over time until cleared with `constant_force = Vector2(0, 0)`.
   *
   * `position` is the offset from the body origin in global coordinates.
   */
  public fun addConstantForce(force: Vector2, position: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to force, VECTOR2 to position)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_ADD_CONSTANT_FORCE, NIL.ordinal)
  }

  /**
   * Adds a constant rotational force without affecting position that keeps being applied over time until cleared with `constant_torque = 0`.
   */
  public fun addConstantTorque(torque: Double): Unit {
    TransferContext.writeArguments(DOUBLE to torque)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_ADD_CONSTANT_TORQUE, NIL.ordinal)
  }

  /**
   * Sets the body's total constant positional forces applied during each physics update.
   *
   * See [addConstantForce] and [addConstantCentralForce].
   */
  public fun setConstantForce(force: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_SET_CONSTANT_FORCE, NIL.ordinal)
  }

  /**
   * Returns the body's total constant positional forces applied during each physics update.
   *
   * See [addConstantForce] and [addConstantCentralForce].
   */
  public fun getConstantForce(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_CONSTANT_FORCE, VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Sets the body's total constant rotational forces applied during each physics update.
   *
   * See [addConstantTorque].
   */
  public fun setConstantTorque(torque: Double): Unit {
    TransferContext.writeArguments(DOUBLE to torque)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_SET_CONSTANT_TORQUE, NIL.ordinal)
  }

  /**
   * Returns the body's total constant rotational forces applied during each physics update.
   *
   * See [addConstantTorque].
   */
  public fun getConstantTorque(): Double {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_CONSTANT_TORQUE, DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the number of contacts this body has with other bodies.
   *
   * **Note:** By default, this returns 0 unless bodies are configured to monitor contacts. See [godot.RigidDynamicBody2D.contactMonitor].
   */
  public fun getContactCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_CONTACT_COUNT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the local position of the contact point.
   */
  public fun getContactLocalPosition(contactIdx: Long): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_CONTACT_LOCAL_POSITION,
        VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the local normal at the contact point.
   */
  public fun getContactLocalNormal(contactIdx: Long): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_CONTACT_LOCAL_NORMAL, VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the local shape index of the collision.
   */
  public fun getContactLocalShape(contactIdx: Long): Long {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_CONTACT_LOCAL_SHAPE, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the collider's [RID].
   */
  public fun getContactCollider(contactIdx: Long): RID {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_CONTACT_COLLIDER, _RID.ordinal)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the contact position in the collider.
   */
  public fun getContactColliderPosition(contactIdx: Long): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_CONTACT_COLLIDER_POSITION,
        VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the collider's object id.
   */
  public fun getContactColliderId(contactIdx: Long): Long {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_CONTACT_COLLIDER_ID, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the collider object. This depends on how it was created (will return a scene node if such was used to create it).
   */
  public fun getContactColliderObject(contactIdx: Long): Object? {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_CONTACT_COLLIDER_OBJECT,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the collider's shape index.
   */
  public fun getContactColliderShape(contactIdx: Long): Long {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_CONTACT_COLLIDER_SHAPE, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the linear velocity vector at the collider's contact point.
   */
  public fun getContactColliderVelocityAtPosition(contactIdx: Long): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_CONTACT_COLLIDER_VELOCITY_AT_POSITION,
        VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Calls the built-in force integration code.
   */
  public fun integrateForces(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_INTEGRATE_FORCES, NIL.ordinal)
  }

  /**
   * Returns the current state of the space, useful for queries.
   */
  public fun getSpaceState(): PhysicsDirectSpaceState2D? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE2D_GET_SPACE_STATE,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState2D?
  }

  public companion object
}
