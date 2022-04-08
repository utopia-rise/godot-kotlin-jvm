// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class PhysicalBone3D : PhysicsBody3D() {
  /**
   * Sets the joint type. See [enum JointType] for possible values.
   */
  public var jointType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_JOINT_TYPE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_JOINT_TYPE,
          NIL)
    }

  /**
   * Sets the joint's transform.
   */
  public var jointOffset: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_JOINT_OFFSET,
          TRANSFORM3D)
      return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_JOINT_OFFSET,
          NIL)
    }

  /**
   * Sets the joint's rotation in radians.
   */
  public var jointRotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_JOINT_ROTATION,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_JOINT_ROTATION,
          NIL)
    }

  /**
   * Sets the body's transform.
   */
  public var bodyOffset: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_BODY_OFFSET,
          TRANSFORM3D)
      return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_BODY_OFFSET,
          NIL)
    }

  /**
   * The body's mass.
   */
  public var mass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_MASS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_MASS, NIL)
    }

  /**
   * The body's friction, from `0` (frictionless) to `1` (max friction).
   */
  public var friction: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_FRICTION,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_FRICTION, NIL)
    }

  /**
   * The body's bounciness. Values range from `0` (no bounce) to `1` (full bounciness).
   */
  public var bounce: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_BOUNCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_BOUNCE, NIL)
    }

  /**
   * This is multiplied by the global 3D gravity setting found in **Project > Project Settings > Physics > 3d** to produce the body's gravity. For example, a value of 1 will be normal gravity, 2 will apply double gravity, and 0.5 will apply half gravity to this object.
   */
  public var gravityScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_GRAVITY_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_GRAVITY_SCALE,
          NIL)
    }

  /**
   * If `true`, internal force integration will be disabled (like gravity or air friction) for this body. Other than collision response, the body will only move as determined by the [_integrateForces] function, if defined.
   */
  public var customIntegrator: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_IS_USING_CUSTOM_INTEGRATOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_USE_CUSTOM_INTEGRATOR, NIL)
    }

  /**
   * Defines how [linearDamp] is applied. See [enum DampMode] for possible values.
   */
  public var linearDampMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_LINEAR_DAMP_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_LINEAR_DAMP_MODE, NIL)
    }

  /**
   * Damps the body's movement. By default, the body will use the **Default Linear Damp** in **Project > Project Settings > Physics > 3d** or any value override set by an [godot.Area3D] the body is in. Depending on [linearDampMode], you can set [linearDamp] to be added to or to replace the body's damping value.
   *
   * See [godot.ProjectSettings.physics/3d/defaultLinearDamp] for more details about damping.
   */
  public var linearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_LINEAR_DAMP,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_LINEAR_DAMP,
          NIL)
    }

  /**
   * Defines how [angularDamp] is applied. See [enum DampMode] for possible values.
   */
  public var angularDampMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_ANGULAR_DAMP_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_ANGULAR_DAMP_MODE, NIL)
    }

  /**
   * Damps the body's rotation. By default, the body will use the **Default Angular Damp** in **Project > Project Settings > Physics > 3d** or any value override set by an [godot.Area3D] the body is in. Depending on [angularDampMode], you can set [angularDamp] to be added to or to replace the body's damping value.
   *
   * See [godot.ProjectSettings.physics/3d/defaultAngularDamp] for more details about damping.
   */
  public var angularDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_ANGULAR_DAMP,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_ANGULAR_DAMP,
          NIL)
    }

  /**
   * The body's linear velocity in units per second. Can be used sporadically, but **don't set this every frame**, because physics may run in another thread and runs at a different granularity. Use [_integrateForces] as your process loop for precise control of the body state.
   */
  public var linearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_LINEAR_VELOCITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_LINEAR_VELOCITY, NIL)
    }

  /**
   * The PhysicalBone3D's rotational velocity in *radians* per second.
   */
  public var angularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_ANGULAR_VELOCITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_ANGULAR_VELOCITY, NIL)
    }

  /**
   * If `true`, the body is deactivated when there is no movement, so it will not take part in the simulation until it is awakened by an external force.
   */
  public var canSleep: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_IS_ABLE_TO_SLEEP,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_SET_CAN_SLEEP, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICALBONE3D)
  }

  /**
   * Called during physics processing, allowing you to read and safely modify the simulation state for the object. By default, it works in addition to the usual physics behavior, but the [customIntegrator] property allows you to disable the default behavior and do fully custom force integration for a body.
   */
  public open fun _integrateForces(state: PhysicsDirectBodyState3D): Unit {
  }

  /**
   *
   */
  public fun applyCentralImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_APPLY_CENTRAL_IMPULSE, NIL)
  }

  /**
   *
   */
  public fun applyImpulse(impulse: Vector3, position: Vector3 = Vector3(0.0, 0.0, 0.0)): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_APPLY_IMPULSE, NIL)
  }

  /**
   *
   */
  public fun getSimulatePhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_SIMULATE_PHYSICS,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun isSimulatingPhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_IS_SIMULATING_PHYSICS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun getBoneId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE3D_GET_BONE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class JointType(
    id: Long
  ) {
    /**
     *
     */
    JOINT_TYPE_NONE(0),
    /**
     *
     */
    JOINT_TYPE_PIN(1),
    /**
     *
     */
    JOINT_TYPE_CONE(2),
    /**
     *
     */
    JOINT_TYPE_HINGE(3),
    /**
     *
     */
    JOINT_TYPE_SLIDER(4),
    /**
     *
     */
    JOINT_TYPE_6DOF(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DampMode(
    id: Long
  ) {
    /**
     * In this mode, the body's damping value is added to any value set in areas or the default value.
     */
    DAMP_MODE_COMBINE(0),
    /**
     * In this mode, the body's damping value replaces any value set in areas or the default value.
     */
    DAMP_MODE_REPLACE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
