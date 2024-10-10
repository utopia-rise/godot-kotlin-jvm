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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.util.Internals
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

private const val ENGINE_CLASS_PHYSICALBONE3D_INDEX: Int = 457

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
    Internals.callConstructor(this, ENGINE_CLASS_PHYSICALBONE3D_INDEX, scriptIndex)
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
    Internals.writeArguments(VECTOR3 to impulse)
    Internals.callMethod(rawPtr, MethodBindings.applyCentralImpulsePtr, NIL)
  }

  @JvmOverloads
  public final fun applyImpulse(impulse: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    Internals.writeArguments(VECTOR3 to impulse, VECTOR3 to position)
    Internals.callMethod(rawPtr, MethodBindings.applyImpulsePtr, NIL)
  }

  public final fun setJointType(jointType: JointType): Unit {
    Internals.writeArguments(LONG to jointType.id)
    Internals.callMethod(rawPtr, MethodBindings.setJointTypePtr, NIL)
  }

  public final fun getJointType(): JointType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJointTypePtr, LONG)
    return PhysicalBone3D.JointType.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setJointOffset(offset: Transform3D): Unit {
    Internals.writeArguments(TRANSFORM3D to offset)
    Internals.callMethod(rawPtr, MethodBindings.setJointOffsetPtr, NIL)
  }

  public final fun getJointOffset(): Transform3D {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJointOffsetPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun setJointRotation(euler: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to euler)
    Internals.callMethod(rawPtr, MethodBindings.setJointRotationPtr, NIL)
  }

  public final fun getJointRotation(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJointRotationPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setBodyOffset(offset: Transform3D): Unit {
    Internals.writeArguments(TRANSFORM3D to offset)
    Internals.callMethod(rawPtr, MethodBindings.setBodyOffsetPtr, NIL)
  }

  public final fun getBodyOffset(): Transform3D {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBodyOffsetPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun getSimulatePhysics(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSimulatePhysicsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun isSimulatingPhysics(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isSimulatingPhysicsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun getBoneId(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBoneIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMass(mass: Float): Unit {
    Internals.writeArguments(DOUBLE to mass.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMassPtr, NIL)
  }

  public final fun getMass(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMassPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFriction(friction: Float): Unit {
    Internals.writeArguments(DOUBLE to friction.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setFrictionPtr, NIL)
  }

  public final fun getFriction(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFrictionPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBounce(bounce: Float): Unit {
    Internals.writeArguments(DOUBLE to bounce.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setBouncePtr, NIL)
  }

  public final fun getBounce(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBouncePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGravityScale(gravityScale: Float): Unit {
    Internals.writeArguments(DOUBLE to gravityScale.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setGravityScalePtr, NIL)
  }

  public final fun getGravityScale(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGravityScalePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLinearDampMode(linearDampMode: DampMode): Unit {
    Internals.writeArguments(LONG to linearDampMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setLinearDampModePtr, NIL)
  }

  public final fun getLinearDampMode(): DampMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLinearDampModePtr, LONG)
    return PhysicalBone3D.DampMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setAngularDampMode(angularDampMode: DampMode): Unit {
    Internals.writeArguments(LONG to angularDampMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setAngularDampModePtr, NIL)
  }

  public final fun getAngularDampMode(): DampMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAngularDampModePtr, LONG)
    return PhysicalBone3D.DampMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setLinearDamp(linearDamp: Float): Unit {
    Internals.writeArguments(DOUBLE to linearDamp.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setLinearDampPtr, NIL)
  }

  public final fun getLinearDamp(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLinearDampPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAngularDamp(angularDamp: Float): Unit {
    Internals.writeArguments(DOUBLE to angularDamp.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAngularDampPtr, NIL)
  }

  public final fun getAngularDamp(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAngularDampPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLinearVelocity(linearVelocity: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to linearVelocity)
    Internals.callMethod(rawPtr, MethodBindings.setLinearVelocityPtr, NIL)
  }

  public final fun getLinearVelocity(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLinearVelocityPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setAngularVelocity(angularVelocity: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to angularVelocity)
    Internals.callMethod(rawPtr, MethodBindings.setAngularVelocityPtr, NIL)
  }

  public final fun getAngularVelocity(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAngularVelocityPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setUseCustomIntegrator(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setUseCustomIntegratorPtr, NIL)
  }

  public final fun isUsingCustomIntegrator(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUsingCustomIntegratorPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCanSleep(ableToSleep: Boolean): Unit {
    Internals.writeArguments(BOOL to ableToSleep)
    Internals.callMethod(rawPtr, MethodBindings.setCanSleepPtr, NIL)
  }

  public final fun isAbleToSleep(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isAbleToSleepPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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
        Internals.getMethodBindPtr("PhysicalBone3D", "apply_central_impulse", 3460891852)

    public val applyImpulsePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "apply_impulse", 2754756483)

    public val setJointTypePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_joint_type", 2289552604)

    public val getJointTypePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_joint_type", 931347320)

    public val setJointOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_joint_offset", 2952846383)

    public val getJointOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_joint_offset", 3229777777)

    public val setJointRotationPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_joint_rotation", 3460891852)

    public val getJointRotationPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_joint_rotation", 3360562783)

    public val setBodyOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_body_offset", 2952846383)

    public val getBodyOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_body_offset", 3229777777)

    public val getSimulatePhysicsPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_simulate_physics", 2240911060)

    public val isSimulatingPhysicsPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "is_simulating_physics", 2240911060)

    public val getBoneIdPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_bone_id", 3905245786)

    public val setMassPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_mass", 373806689)

    public val getMassPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_mass", 1740695150)

    public val setFrictionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_friction", 373806689)

    public val getFrictionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_friction", 1740695150)

    public val setBouncePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_bounce", 373806689)

    public val getBouncePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_bounce", 1740695150)

    public val setGravityScalePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_gravity_scale", 373806689)

    public val getGravityScalePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_gravity_scale", 1740695150)

    public val setLinearDampModePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_linear_damp_mode", 1244972221)

    public val getLinearDampModePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_linear_damp_mode", 205884699)

    public val setAngularDampModePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_angular_damp_mode", 1244972221)

    public val getAngularDampModePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_angular_damp_mode", 205884699)

    public val setLinearDampPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_linear_damp", 373806689)

    public val getLinearDampPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_linear_damp", 1740695150)

    public val setAngularDampPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_angular_damp", 373806689)

    public val getAngularDampPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_angular_damp", 1740695150)

    public val setLinearVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_linear_velocity", 3460891852)

    public val getLinearVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_linear_velocity", 3360562783)

    public val setAngularVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_angular_velocity", 3460891852)

    public val getAngularVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "get_angular_velocity", 3360562783)

    public val setUseCustomIntegratorPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_use_custom_integrator", 2586408642)

    public val isUsingCustomIntegratorPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "is_using_custom_integrator", 2240911060)

    public val setCanSleepPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "set_can_sleep", 2586408642)

    public val isAbleToSleepPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicalBone3D", "is_able_to_sleep", 36873697)
  }
}
