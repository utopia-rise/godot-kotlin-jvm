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
import kotlin.jvm.JvmName
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
  public final inline var jointType: JointType
    @JvmName("jointTypeProperty")
    get() = getJointType()
    @JvmName("jointTypeProperty")
    set(`value`) {
      setJointType(value)
    }

  /**
   * Sets the joint's transform.
   */
  @CoreTypeLocalCopy
  public final inline var jointOffset: Transform3D
    @JvmName("jointOffsetProperty")
    get() = getJointOffset()
    @JvmName("jointOffsetProperty")
    set(`value`) {
      setJointOffset(value)
    }

  /**
   * Sets the joint's rotation in radians.
   */
  @CoreTypeLocalCopy
  public final inline var jointRotation: Vector3
    @JvmName("jointRotationProperty")
    get() = getJointRotation()
    @JvmName("jointRotationProperty")
    set(`value`) {
      setJointRotation(value)
    }

  /**
   * Sets the body's transform.
   */
  @CoreTypeLocalCopy
  public final inline var bodyOffset: Transform3D
    @JvmName("bodyOffsetProperty")
    get() = getBodyOffset()
    @JvmName("bodyOffsetProperty")
    set(`value`) {
      setBodyOffset(value)
    }

  /**
   * The body's mass.
   */
  public final inline var mass: Float
    @JvmName("massProperty")
    get() = getMass()
    @JvmName("massProperty")
    set(`value`) {
      setMass(value)
    }

  /**
   * The body's friction, from `0` (frictionless) to `1` (max friction).
   */
  public final inline var friction: Float
    @JvmName("frictionProperty")
    get() = getFriction()
    @JvmName("frictionProperty")
    set(`value`) {
      setFriction(value)
    }

  /**
   * The body's bounciness. Values range from `0` (no bounce) to `1` (full bounciness).
   * **Note:** Even with [bounce] set to `1.0`, some energy will be lost over time due to linear and
   * angular damping. To have a [PhysicalBone3D] that preserves all its energy over time, set [bounce]
   * to `1.0`, [linearDampMode] to [DAMP_MODE_REPLACE], [linearDamp] to `0.0`, [angularDampMode] to
   * [DAMP_MODE_REPLACE], and [angularDamp] to `0.0`.
   */
  public final inline var bounce: Float
    @JvmName("bounceProperty")
    get() = getBounce()
    @JvmName("bounceProperty")
    set(`value`) {
      setBounce(value)
    }

  /**
   * This is multiplied by the global 3D gravity setting found in **Project > Project Settings >
   * Physics > 3d** to produce the body's gravity. For example, a value of 1 will be normal gravity, 2
   * will apply double gravity, and 0.5 will apply half gravity to this object.
   */
  public final inline var gravityScale: Float
    @JvmName("gravityScaleProperty")
    get() = getGravityScale()
    @JvmName("gravityScaleProperty")
    set(`value`) {
      setGravityScale(value)
    }

  /**
   * If `true`, the standard force integration (like gravity or damping) will be disabled for this
   * body. Other than collision response, the body will only move as determined by the
   * [_integrateForces] method, if that virtual method is overridden.
   * Setting this property will call the method [PhysicsServer3D.bodySetOmitForceIntegration]
   * internally.
   */
  public final inline var customIntegrator: Boolean
    @JvmName("customIntegratorProperty")
    get() = isUsingCustomIntegrator()
    @JvmName("customIntegratorProperty")
    set(`value`) {
      setUseCustomIntegrator(value)
    }

  /**
   * Defines how [linearDamp] is applied. See [DampMode] for possible values.
   */
  public final inline var linearDampMode: DampMode
    @JvmName("linearDampModeProperty")
    get() = getLinearDampMode()
    @JvmName("linearDampModeProperty")
    set(`value`) {
      setLinearDampMode(value)
    }

  /**
   * Damps the body's movement. By default, the body will use the **Default Linear Damp** in
   * **Project > Project Settings > Physics > 3d** or any value override set by an [Area3D] the body is
   * in. Depending on [linearDampMode], you can set [linearDamp] to be added to or to replace the
   * body's damping value.
   * See [ProjectSettings.physics/3d/defaultLinearDamp] for more details about damping.
   */
  public final inline var linearDamp: Float
    @JvmName("linearDampProperty")
    get() = getLinearDamp()
    @JvmName("linearDampProperty")
    set(`value`) {
      setLinearDamp(value)
    }

  /**
   * Defines how [angularDamp] is applied. See [DampMode] for possible values.
   */
  public final inline var angularDampMode: DampMode
    @JvmName("angularDampModeProperty")
    get() = getAngularDampMode()
    @JvmName("angularDampModeProperty")
    set(`value`) {
      setAngularDampMode(value)
    }

  /**
   * Damps the body's rotation. By default, the body will use the **Default Angular Damp** in
   * **Project > Project Settings > Physics > 3d** or any value override set by an [Area3D] the body is
   * in. Depending on [angularDampMode], you can set [angularDamp] to be added to or to replace the
   * body's damping value.
   * See [ProjectSettings.physics/3d/defaultAngularDamp] for more details about damping.
   */
  public final inline var angularDamp: Float
    @JvmName("angularDampProperty")
    get() = getAngularDamp()
    @JvmName("angularDampProperty")
    set(`value`) {
      setAngularDamp(value)
    }

  /**
   * The body's linear velocity in units per second. Can be used sporadically, but **don't set this
   * every frame**, because physics may run in another thread and runs at a different granularity. Use
   * [_integrateForces] as your process loop for precise control of the body state.
   */
  @CoreTypeLocalCopy
  public final inline var linearVelocity: Vector3
    @JvmName("linearVelocityProperty")
    get() = getLinearVelocity()
    @JvmName("linearVelocityProperty")
    set(`value`) {
      setLinearVelocity(value)
    }

  /**
   * The PhysicalBone3D's rotational velocity in *radians* per second.
   */
  @CoreTypeLocalCopy
  public final inline var angularVelocity: Vector3
    @JvmName("angularVelocityProperty")
    get() = getAngularVelocity()
    @JvmName("angularVelocityProperty")
    set(`value`) {
      setAngularVelocity(value)
    }

  /**
   * If `true`, the body is deactivated when there is no movement, so it will not take part in the
   * simulation until it is awakened by an external force.
   */
  public final inline var canSleep: Boolean
    @JvmName("canSleepProperty")
    get() = isAbleToSleep()
    @JvmName("canSleepProperty")
    set(`value`) {
      setCanSleep(value)
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
  public final fun jointOffsetMutate(block: Transform3D.() -> Unit): Transform3D =
      jointOffset.apply{
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
  public final fun jointRotationMutate(block: Vector3.() -> Unit): Vector3 = jointRotation.apply{
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
  public final fun bodyOffsetMutate(block: Transform3D.() -> Unit): Transform3D = bodyOffset.apply{
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
  public final fun linearVelocityMutate(block: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
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
  public final fun angularVelocityMutate(block: Vector3.() -> Unit): Vector3 =
      angularVelocity.apply{
      block(this)
      angularVelocity = this
  }


  /**
   * Called during physics processing, allowing you to read and safely modify the simulation state
   * for the object. By default, it is called before the standard force integration, but the
   * [customIntegrator] property allows you to disable the standard force integration and do fully
   * custom force integration for a body.
   */
  public open fun _integrateForces(state: PhysicsDirectBodyState3D?): Unit {
  }

  public final fun applyCentralImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.applyCentralImpulsePtr, NIL)
  }

  @JvmOverloads
  public final fun applyImpulse(impulse: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.applyImpulsePtr, NIL)
  }

  public final fun setJointType(jointType: JointType): Unit {
    TransferContext.writeArguments(LONG to jointType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setJointTypePtr, NIL)
  }

  public final fun getJointType(): JointType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointTypePtr, LONG)
    return PhysicalBone3D.JointType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setJointOffset(offset: Transform3D): Unit {
    TransferContext.writeArguments(TRANSFORM3D to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setJointOffsetPtr, NIL)
  }

  public final fun getJointOffset(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointOffsetPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun setJointRotation(euler: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to euler)
    TransferContext.callMethod(rawPtr, MethodBindings.setJointRotationPtr, NIL)
  }

  public final fun getJointRotation(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointRotationPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setBodyOffset(offset: Transform3D): Unit {
    TransferContext.writeArguments(TRANSFORM3D to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setBodyOffsetPtr, NIL)
  }

  public final fun getBodyOffset(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBodyOffsetPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun getSimulatePhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSimulatePhysicsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun isSimulatingPhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSimulatingPhysicsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getBoneId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMass(mass: Float): Unit {
    TransferContext.writeArguments(DOUBLE to mass.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setMassPtr, NIL)
  }

  public final fun getMass(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMassPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFriction(friction: Float): Unit {
    TransferContext.writeArguments(DOUBLE to friction.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFrictionPtr, NIL)
  }

  public final fun getFriction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFrictionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBounce(bounce: Float): Unit {
    TransferContext.writeArguments(DOUBLE to bounce.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBouncePtr, NIL)
  }

  public final fun getBounce(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBouncePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGravityScale(gravityScale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to gravityScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setGravityScalePtr, NIL)
  }

  public final fun getGravityScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGravityScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLinearDampMode(linearDampMode: DampMode): Unit {
    TransferContext.writeArguments(LONG to linearDampMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setLinearDampModePtr, NIL)
  }

  public final fun getLinearDampMode(): DampMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampModePtr, LONG)
    return PhysicalBone3D.DampMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAngularDampMode(angularDampMode: DampMode): Unit {
    TransferContext.writeArguments(LONG to angularDampMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setAngularDampModePtr, NIL)
  }

  public final fun getAngularDampMode(): DampMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampModePtr, LONG)
    return PhysicalBone3D.DampMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setLinearDamp(linearDamp: Float): Unit {
    TransferContext.writeArguments(DOUBLE to linearDamp.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setLinearDampPtr, NIL)
  }

  public final fun getLinearDamp(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAngularDamp(angularDamp: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angularDamp.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAngularDampPtr, NIL)
  }

  public final fun getAngularDamp(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLinearVelocity(linearVelocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to linearVelocity)
    TransferContext.callMethod(rawPtr, MethodBindings.setLinearVelocityPtr, NIL)
  }

  public final fun getLinearVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLinearVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setAngularVelocity(angularVelocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to angularVelocity)
    TransferContext.callMethod(rawPtr, MethodBindings.setAngularVelocityPtr, NIL)
  }

  public final fun getAngularVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAngularVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setUseCustomIntegrator(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseCustomIntegratorPtr, NIL)
  }

  public final fun isUsingCustomIntegrator(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isUsingCustomIntegratorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCanSleep(ableToSleep: Boolean): Unit {
    TransferContext.writeArguments(BOOL to ableToSleep)
    TransferContext.callMethod(rawPtr, MethodBindings.setCanSleepPtr, NIL)
  }

  public final fun isAbleToSleep(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAbleToSleepPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
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
    public val applyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "apply_central_impulse", 3460891852)

    public val applyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "apply_impulse", 2754756483)

    public val setJointTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_joint_type", 2289552604)

    public val getJointTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_joint_type", 931347320)

    public val setJointOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_joint_offset", 2952846383)

    public val getJointOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_joint_offset", 3229777777)

    public val setJointRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_joint_rotation", 3460891852)

    public val getJointRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_joint_rotation", 3360562783)

    public val setBodyOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_body_offset", 2952846383)

    public val getBodyOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_body_offset", 3229777777)

    public val getSimulatePhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_simulate_physics", 2240911060)

    public val isSimulatingPhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "is_simulating_physics", 2240911060)

    public val getBoneIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_bone_id", 3905245786)

    public val setMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_mass", 373806689)

    public val getMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_mass", 1740695150)

    public val setFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_friction", 373806689)

    public val getFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_friction", 1740695150)

    public val setBouncePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_bounce", 373806689)

    public val getBouncePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_bounce", 1740695150)

    public val setGravityScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_gravity_scale", 373806689)

    public val getGravityScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_gravity_scale", 1740695150)

    public val setLinearDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_linear_damp_mode", 1244972221)

    public val getLinearDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_linear_damp_mode", 205884699)

    public val setAngularDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_angular_damp_mode", 1244972221)

    public val getAngularDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_angular_damp_mode", 205884699)

    public val setLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_linear_damp", 373806689)

    public val getLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_linear_damp", 1740695150)

    public val setAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_angular_damp", 373806689)

    public val getAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_angular_damp", 1740695150)

    public val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_linear_velocity", 3460891852)

    public val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_linear_velocity", 3360562783)

    public val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_angular_velocity", 3460891852)

    public val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_angular_velocity", 3360562783)

    public val setUseCustomIntegratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_use_custom_integrator", 2586408642)

    public val isUsingCustomIntegratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "is_using_custom_integrator", 2240911060)

    public val setCanSleepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_can_sleep", 2586408642)

    public val isAbleToSleepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "is_able_to_sleep", 36873697)
  }
}
