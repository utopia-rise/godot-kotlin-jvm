// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.RID
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
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Direct access object to a physics body in the [godot.PhysicsServer3D].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/physics/ray-casting.html]($DOCS_URL/tutorials/physics/ray-casting.html)
 *
 * Provides direct access to a physics body in the [godot.PhysicsServer3D], allowing safe changes to physics properties. This object is passed via the direct state callback of rigid bodies, and is intended for changing the direct state of that body. See [godot.RigidBody3D.IntegrateForces].
 */
@GodotBaseType
public open class PhysicsDirectBodyState3D internal constructor() : Object() {
  /**
   * The timestep (delta) used for the simulation.
   */
  public val step: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_STEP,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }

  /**
   * The inverse of the mass of the body.
   */
  public val inverseMass: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_INVERSE_MASS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }

  /**
   * The rate at which the body stops rotating, if there are not any other forces moving it.
   */
  public val totalAngularDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_TOTAL_ANGULAR_DAMP, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }

  /**
   * The rate at which the body stops moving, if there are not any other forces moving it.
   */
  public val totalLinearDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_TOTAL_LINEAR_DAMP, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }

  /**
   * The inverse of the inertia of the body.
   */
  public val inverseInertia: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_INVERSE_INERTIA, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }

  /**
   * The inverse of the inertia tensor of the body.
   */
  public val inverseInertiaTensor: Basis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_INVERSE_INERTIA_TENSOR, BASIS)
      return (TransferContext.readReturnValue(BASIS, false) as Basis)
    }

  /**
   * The total gravity vector being currently applied to this body.
   */
  public val totalGravity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_TOTAL_GRAVITY, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }

  /**
   * The body's center of mass position relative to the body's center in the global coordinate system.
   */
  public val centerOfMass: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CENTER_OF_MASS, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }

  /**
   * The body's center of mass position in the body's local coordinate system.
   */
  public val centerOfMassLocal: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CENTER_OF_MASS_LOCAL, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }

  /**
   *
   */
  public val principalInertiaAxes: Basis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_PRINCIPAL_INERTIA_AXES, BASIS)
      return (TransferContext.readReturnValue(BASIS, false) as Basis)
    }

  /**
   * The body's rotational velocity in *radians* per second.
   */
  public var angularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_ANGULAR_VELOCITY, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_SET_ANGULAR_VELOCITY, NIL)
    }

  /**
   * The body's linear velocity in units per second.
   */
  public var linearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_LINEAR_VELOCITY, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_SET_LINEAR_VELOCITY, NIL)
    }

  /**
   * If `true`, this body is currently sleeping (not active).
   */
  public var sleeping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_IS_SLEEPING, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_SET_SLEEP_STATE, NIL)
    }

  /**
   * The body's transformation matrix.
   */
  public var transform: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_TRANSFORM, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_SET_TRANSFORM, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSDIRECTBODYSTATE3D, scriptIndex)
    return true
  }

  /**
   * Returns the body's velocity at the given relative position, including both translation and rotation.
   */
  public fun getVelocityAtLocalPosition(localPosition: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to localPosition)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_VELOCITY_AT_LOCAL_POSITION, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Applies a directional impulse without affecting rotation.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * This is equivalent to using [applyImpulse] at the body's center of mass.
   */
  @JvmOverloads
  public fun applyCentralImpulse(impulse: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_APPLY_CENTRAL_IMPULSE, NIL)
  }

  /**
   * Applies a positioned impulse to the body.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public fun applyImpulse(impulse: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse, VECTOR3 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_APPLY_IMPULSE, NIL)
  }

  /**
   * Applies a rotational impulse to the body without affecting the position.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * **Note:** [inverseInertia] is required for this to work. To have [inverseInertia], an active [godot.CollisionShape3D] must be a child of the node, or you can manually set [inverseInertia].
   */
  public fun applyTorqueImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_APPLY_TORQUE_IMPULSE, NIL)
  }

  /**
   * Applies a directional force without affecting rotation. A force is time dependent and meant to be applied every physics update.
   *
   * This is equivalent to using [applyForce] at the body's center of mass.
   */
  @JvmOverloads
  public fun applyCentralForce(force: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_APPLY_CENTRAL_FORCE, NIL)
  }

  /**
   * Applies a positioned force to the body. A force is time dependent and meant to be applied every physics update.
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public fun applyForce(force: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_APPLY_FORCE, NIL)
  }

  /**
   * Applies a rotational force without affecting position. A force is time dependent and meant to be applied every physics update.
   *
   * **Note:** [inverseInertia] is required for this to work. To have [inverseInertia], an active [godot.CollisionShape3D] must be a child of the node, or you can manually set [inverseInertia].
   */
  public fun applyTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_APPLY_TORQUE, NIL)
  }

  /**
   * Adds a constant directional force without affecting rotation that keeps being applied over time until cleared with `constant_force = Vector3(0, 0, 0)`.
   *
   * This is equivalent to using [addConstantForce] at the body's center of mass.
   */
  @JvmOverloads
  public fun addConstantCentralForce(force: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_ADD_CONSTANT_CENTRAL_FORCE, NIL)
  }

  /**
   * Adds a constant positioned force to the body that keeps being applied over time until cleared with `constant_force = Vector3(0, 0, 0)`.
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public fun addConstantForce(force: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_ADD_CONSTANT_FORCE, NIL)
  }

  /**
   * Adds a constant rotational force without affecting position that keeps being applied over time until cleared with `constant_torque = Vector3(0, 0, 0)`.
   */
  public fun addConstantTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_ADD_CONSTANT_TORQUE, NIL)
  }

  /**
   * Sets the body's total constant positional forces applied during each physics update.
   *
   * See [addConstantForce] and [addConstantCentralForce].
   */
  public fun setConstantForce(force: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_SET_CONSTANT_FORCE, NIL)
  }

  /**
   * Returns the body's total constant positional forces applied during each physics update.
   *
   * See [addConstantForce] and [addConstantCentralForce].
   */
  public fun getConstantForce(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONSTANT_FORCE, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the body's total constant rotational forces applied during each physics update.
   *
   * See [addConstantTorque].
   */
  public fun setConstantTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_SET_CONSTANT_TORQUE, NIL)
  }

  /**
   * Returns the body's total constant rotational forces applied during each physics update.
   *
   * See [addConstantTorque].
   */
  public fun getConstantTorque(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONSTANT_TORQUE, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the number of contacts this body has with other bodies.
   *
   * **Note:** By default, this returns 0 unless bodies are configured to monitor contacts. See [godot.RigidBody3D.contactMonitor].
   */
  public fun getContactCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the local position of the contact point.
   */
  public fun getContactLocalPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_LOCAL_POSITION, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the local normal at the contact point.
   */
  public fun getContactLocalNormal(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_LOCAL_NORMAL, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Impulse created by the contact.
   */
  public fun getContactImpulse(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_IMPULSE, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the local shape index of the collision.
   */
  public fun getContactLocalShape(contactIdx: Int): Int {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_LOCAL_SHAPE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getContactLocalVelocityAtPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_LOCAL_VELOCITY_AT_POSITION,
        VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the collider's [RID].
   */
  public fun getContactCollider(contactIdx: Int): RID {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_COLLIDER, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the contact position in the collider.
   */
  public fun getContactColliderPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_COLLIDER_POSITION, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the collider's object id.
   */
  public fun getContactColliderId(contactIdx: Int): Long {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_COLLIDER_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the collider object.
   */
  public fun getContactColliderObject(contactIdx: Int): Object? {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_COLLIDER_OBJECT, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  /**
   * Returns the collider's shape index.
   */
  public fun getContactColliderShape(contactIdx: Int): Int {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_COLLIDER_SHAPE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the linear velocity vector at the collider's contact point.
   */
  public fun getContactColliderVelocityAtPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_CONTACT_COLLIDER_VELOCITY_AT_POSITION,
        VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Calls the built-in force integration code.
   */
  public fun integrateForces(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_INTEGRATE_FORCES, NIL)
  }

  /**
   * Returns the current state of the space, useful for queries.
   */
  public fun getSpaceState(): PhysicsDirectSpaceState3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTBODYSTATE3D_GET_SPACE_STATE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState3D?)
  }

  public companion object
}
