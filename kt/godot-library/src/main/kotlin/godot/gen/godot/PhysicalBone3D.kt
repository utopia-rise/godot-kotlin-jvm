// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * The [PhysicalBone3D] node is a physics body that can be used to make bones in a [Skeleton3D]
 * react to physics.
 * **Note:** In order to detect physical bones with raycasts, the [SkeletonModifier3D.active]
 * property of the parent [PhysicalBoneSimulator3D] must be `true` and the [Skeleton3D]'s bone must be
 * assigned to [PhysicalBone3D] correctly; it means that [getBoneId] should return a valid id (`>= 0`).
 */
@GodotBaseType
public open class PhysicalBone3D : PhysicsBody3D() {
  /**
   * Sets the joint type. See [JointType] for possible values.
   */
  public var jointType: JointType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJointTypePtr, LONG)
      return PhysicalBone3D.JointType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setJointTypePtr, NIL)
    }

  /**
   * Sets the joint's transform.
   */
  @CoreTypeLocalCopy
  public var jointOffset: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJointOffsetPtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setJointOffsetPtr, NIL)
    }

  /**
   * Sets the joint's rotation in radians.
   */
  @CoreTypeLocalCopy
  public var jointRotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJointRotationPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setJointRotationPtr, NIL)
    }

  /**
   * Sets the body's transform.
   */
  @CoreTypeLocalCopy
  public var bodyOffset: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBodyOffsetPtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBodyOffsetPtr, NIL)
    }

  /**
   * The body's mass.
   */
  public var mass: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMassPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMassPtr, NIL)
    }

  /**
   * The body's friction, from `0` (frictionless) to `1` (max friction).
   */
  public var friction: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrictionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFrictionPtr, NIL)
    }

  /**
   * The body's bounciness. Values range from `0` (no bounce) to `1` (full bounciness).
   * **Note:** Even with [bounce] set to `1.0`, some energy will be lost over time due to linear and
   * angular damping. To have a [PhysicalBone3D] that preserves all its energy over time, set [bounce]
   * to `1.0`, [linearDampMode] to [DAMP_MODE_REPLACE], [linearDamp] to `0.0`, [angularDampMode] to
   * [DAMP_MODE_REPLACE], and [angularDamp] to `0.0`.
   */
  public var bounce: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBouncePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBouncePtr, NIL)
    }

  /**
   * This is multiplied by the global 3D gravity setting found in **Project > Project Settings >
   * Physics > 3d** to produce the body's gravity. For example, a value of 1 will be normal gravity, 2
   * will apply double gravity, and 0.5 will apply half gravity to this object.
   */
  public var gravityScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityScalePtr, NIL)
    }

  /**
   * If `true`, the standard force integration (like gravity or damping) will be disabled for this
   * body. Other than collision response, the body will only move as determined by the
   * [_integrateForces] method, if that virtual method is overridden.
   * Setting this property will call the method [PhysicsServer3D.bodySetOmitForceIntegration]
   * internally.
   */
  public var customIntegrator: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingCustomIntegratorPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseCustomIntegratorPtr, NIL)
    }

  /**
   * Defines how [linearDamp] is applied. See [DampMode] for possible values.
   */
  public var linearDampMode: DampMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampModePtr, LONG)
      return PhysicalBone3D.DampMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearDampModePtr, NIL)
    }

  /**
   * Damps the body's movement. By default, the body will use the **Default Linear Damp** in
   * **Project > Project Settings > Physics > 3d** or any value override set by an [Area3D] the body is
   * in. Depending on [linearDampMode], you can set [linearDamp] to be added to or to replace the
   * body's damping value.
   * See [ProjectSettings.physics/3d/defaultLinearDamp] for more details about damping.
   */
  public var linearDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearDampPtr, NIL)
    }

  /**
   * Defines how [angularDamp] is applied. See [DampMode] for possible values.
   */
  public var angularDampMode: DampMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampModePtr, LONG)
      return PhysicalBone3D.DampMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularDampModePtr, NIL)
    }

  /**
   * Damps the body's rotation. By default, the body will use the **Default Angular Damp** in
   * **Project > Project Settings > Physics > 3d** or any value override set by an [Area3D] the body is
   * in. Depending on [angularDampMode], you can set [angularDamp] to be added to or to replace the
   * body's damping value.
   * See [ProjectSettings.physics/3d/defaultAngularDamp] for more details about damping.
   */
  public var angularDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularDampPtr, NIL)
    }

  /**
   * The body's linear velocity in units per second. Can be used sporadically, but **don't set this
   * every frame**, because physics may run in another thread and runs at a different granularity. Use
   * [_integrateForces] as your process loop for precise control of the body state.
   */
  @CoreTypeLocalCopy
  public var linearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearVelocityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearVelocityPtr, NIL)
    }

  /**
   * The PhysicalBone3D's rotational velocity in *radians* per second.
   */
  @CoreTypeLocalCopy
  public var angularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularVelocityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularVelocityPtr, NIL)
    }

  /**
   * If `true`, the body is deactivated when there is no movement, so it will not take part in the
   * simulation until it is awakened by an external force.
   */
  public var canSleep: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAbleToSleepPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCanSleepPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PHYSICALBONE3D, scriptIndex)
  }

  /**
   * Sets the joint's transform.
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
   * val myCoreType = physicalbone3d.jointOffset
   * //Your changes
   * physicalbone3d.jointOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun jointOffsetMutate(block: Transform3D.() -> Unit): Transform3D = jointOffset.apply{
      block(this)
      jointOffset = this
  }


  /**
   * Sets the joint's rotation in radians.
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
   * val myCoreType = physicalbone3d.jointRotation
   * //Your changes
   * physicalbone3d.jointRotation = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun jointRotationMutate(block: Vector3.() -> Unit): Vector3 = jointRotation.apply{
      block(this)
      jointRotation = this
  }


  /**
   * Sets the body's transform.
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
   * val myCoreType = physicalbone3d.bodyOffset
   * //Your changes
   * physicalbone3d.bodyOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun bodyOffsetMutate(block: Transform3D.() -> Unit): Transform3D = bodyOffset.apply{
      block(this)
      bodyOffset = this
  }


  /**
   * The body's linear velocity in units per second. Can be used sporadically, but **don't set this
   * every frame**, because physics may run in another thread and runs at a different granularity. Use
   * [_integrateForces] as your process loop for precise control of the body state.
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
   * val myCoreType = physicalbone3d.linearVelocity
   * //Your changes
   * physicalbone3d.linearVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun linearVelocityMutate(block: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
      block(this)
      linearVelocity = this
  }


  /**
   * The PhysicalBone3D's rotational velocity in *radians* per second.
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
   * val myCoreType = physicalbone3d.angularVelocity
   * //Your changes
   * physicalbone3d.angularVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun angularVelocityMutate(block: Vector3.() -> Unit): Vector3 = angularVelocity.apply{
      block(this)
      angularVelocity = this
  }


  /**
   * Called during physics processing, allowing you to read and safely modify the simulation state
   * for the object. By default, it is called before the standard force integration, but the
   * [customIntegrator] property allows you to disable the standard force integration and do fully
   * custom force integration for a body.
   */
  public open fun _integrateForces(state: PhysicsDirectBodyState3D): Unit {
  }

  public fun applyCentralImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.applyCentralImpulsePtr, NIL)
  }

  @JvmOverloads
  public fun applyImpulse(impulse: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.applyImpulsePtr, NIL)
  }

  public fun getSimulatePhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSimulatePhysicsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isSimulatingPhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSimulatingPhysicsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getBoneId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class DampMode(
    id: Long,
  ) {
    /**
     * In this mode, the body's damping value is added to any value set in areas or the default
     * value.
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
      public fun from(`value`: Long): DampMode = entries.single { it.id == `value` }
    }
  }

  public enum class JointType(
    id: Long,
  ) {
    JOINT_TYPE_NONE(0),
    JOINT_TYPE_PIN(1),
    JOINT_TYPE_CONE(2),
    JOINT_TYPE_HINGE(3),
    JOINT_TYPE_SLIDER(4),
    JOINT_TYPE_6DOF(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): JointType = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _integrateForcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "_integrate_forces")

    public val applyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "apply_central_impulse")

    public val applyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "apply_impulse")

    public val setJointTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_joint_type")

    public val getJointTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_joint_type")

    public val setJointOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_joint_offset")

    public val getJointOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_joint_offset")

    public val setJointRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_joint_rotation")

    public val getJointRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_joint_rotation")

    public val setBodyOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_body_offset")

    public val getBodyOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_body_offset")

    public val getSimulatePhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_simulate_physics")

    public val isSimulatingPhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "is_simulating_physics")

    public val getBoneIdPtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicalBone3D", "get_bone_id")

    public val setMassPtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicalBone3D", "set_mass")

    public val getMassPtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicalBone3D", "get_mass")

    public val setFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_friction")

    public val getFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_friction")

    public val setBouncePtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicalBone3D", "set_bounce")

    public val getBouncePtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicalBone3D", "get_bounce")

    public val setGravityScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_gravity_scale")

    public val getGravityScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_gravity_scale")

    public val setLinearDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_linear_damp_mode")

    public val getLinearDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_linear_damp_mode")

    public val setAngularDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_angular_damp_mode")

    public val getAngularDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_angular_damp_mode")

    public val setLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_linear_damp")

    public val getLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_linear_damp")

    public val setAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_angular_damp")

    public val getAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_angular_damp")

    public val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_linear_velocity")

    public val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_linear_velocity")

    public val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_angular_velocity")

    public val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_angular_velocity")

    public val setUseCustomIntegratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_use_custom_integrator")

    public val isUsingCustomIntegratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "is_using_custom_integrator")

    public val setCanSleepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_can_sleep")

    public val isAbleToSleepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "is_able_to_sleep")
  }
}
