// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.RID
import godot.core.Transform3D
import godot.core.TypeManager
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
 * Provides direct access to a physics body in the [PhysicsServer3D], allowing safe changes to
 * physics properties. This object is passed via the direct state callback of [RigidBody3D], and is
 * intended for changing the direct state of that body. See [RigidBody3D.IntegrateForces].
 */
@GodotBaseType
public open class PhysicsDirectBodyState3D internal constructor() : Object() {
  /**
   * The timestep (delta) used for the simulation.
   */
  public final inline val step: Float
    @JvmName("stepProperty")
    get() = getStep()

  /**
   * The inverse of the mass of the body.
   */
  public final inline val inverseMass: Float
    @JvmName("inverseMassProperty")
    get() = getInverseMass()

  /**
   * The rate at which the body stops rotating, if there are not any other forces moving it.
   */
  public final inline val totalAngularDamp: Float
    @JvmName("totalAngularDampProperty")
    get() = getTotalAngularDamp()

  /**
   * The rate at which the body stops moving, if there are not any other forces moving it.
   */
  public final inline val totalLinearDamp: Float
    @JvmName("totalLinearDampProperty")
    get() = getTotalLinearDamp()

  /**
   * The inverse of the inertia of the body.
   */
  @CoreTypeLocalCopy
  public final inline val inverseInertia: Vector3
    @JvmName("inverseInertiaProperty")
    get() = getInverseInertia()

  /**
   * The inverse of the inertia tensor of the body.
   */
  @CoreTypeLocalCopy
  public final inline val inverseInertiaTensor: Basis
    @JvmName("inverseInertiaTensorProperty")
    get() = getInverseInertiaTensor()

  /**
   * The total gravity vector being currently applied to this body.
   */
  @CoreTypeLocalCopy
  public final inline val totalGravity: Vector3
    @JvmName("totalGravityProperty")
    get() = getTotalGravity()

  /**
   * The body's center of mass position relative to the body's center in the global coordinate
   * system.
   */
  @CoreTypeLocalCopy
  public final inline val centerOfMass: Vector3
    @JvmName("centerOfMassProperty")
    get() = getCenterOfMass()

  /**
   * The body's center of mass position in the body's local coordinate system.
   */
  @CoreTypeLocalCopy
  public final inline val centerOfMassLocal: Vector3
    @JvmName("centerOfMassLocalProperty")
    get() = getCenterOfMassLocal()

  @CoreTypeLocalCopy
  public final inline val principalInertiaAxes: Basis
    @JvmName("principalInertiaAxesProperty")
    get() = getPrincipalInertiaAxes()

  /**
   * The body's rotational velocity in *radians* per second.
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
   * The body's linear velocity in units per second.
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
   * If `true`, this body is currently sleeping (not active).
   */
  public final inline var sleeping: Boolean
    @JvmName("sleepingProperty")
    get() = isSleeping()
    @JvmName("sleepingProperty")
    set(`value`) {
      setSleepState(value)
    }

  /**
   * The body's transformation matrix.
   */
  @CoreTypeLocalCopy
  public final inline var transform: Transform3D
    @JvmName("transformProperty")
    get() = getTransform()
    @JvmName("transformProperty")
    set(`value`) {
      setTransform(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PHYSICSDIRECTBODYSTATE3D, scriptIndex)
  }

  /**
   * The body's rotational velocity in *radians* per second.
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
   * val myCoreType = physicsdirectbodystate3d.angularVelocity
   * //Your changes
   * physicsdirectbodystate3d.angularVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun angularVelocityMutate(block: Vector3.() -> Unit): Vector3 =
      angularVelocity.apply{
      block(this)
      angularVelocity = this
  }


  /**
   * The body's linear velocity in units per second.
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
   * val myCoreType = physicsdirectbodystate3d.linearVelocity
   * //Your changes
   * physicsdirectbodystate3d.linearVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun linearVelocityMutate(block: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
      block(this)
      linearVelocity = this
  }


  /**
   * The body's transformation matrix.
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
   * val myCoreType = physicsdirectbodystate3d.transform
   * //Your changes
   * physicsdirectbodystate3d.transform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun transformMutate(block: Transform3D.() -> Unit): Transform3D = transform.apply{
      block(this)
      transform = this
  }


  public final fun getTotalGravity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTotalGravityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun getTotalLinearDamp(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTotalLinearDampPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getTotalAngularDamp(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTotalAngularDampPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getCenterOfMass(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCenterOfMassPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun getCenterOfMassLocal(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCenterOfMassLocalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun getPrincipalInertiaAxes(): Basis {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPrincipalInertiaAxesPtr, BASIS)
    return (TransferContext.readReturnValue(BASIS) as Basis)
  }

  public final fun getInverseMass(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInverseMassPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getInverseInertia(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInverseInertiaPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun getInverseInertiaTensor(): Basis {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInverseInertiaTensorPtr, BASIS)
    return (TransferContext.readReturnValue(BASIS) as Basis)
  }

  public final fun setLinearVelocity(velocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.setLinearVelocityPtr, NIL)
  }

  public final fun getLinearVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLinearVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setAngularVelocity(velocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.setAngularVelocityPtr, NIL)
  }

  public final fun getAngularVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAngularVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setTransform(transform: Transform3D): Unit {
    TransferContext.writeArguments(TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
  }

  public final fun getTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Returns the body's velocity at the given relative position, including both translation and
   * rotation.
   */
  public final fun getVelocityAtLocalPosition(localPosition: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to localPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.getVelocityAtLocalPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Applies a directional impulse without affecting rotation.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   * This is equivalent to using [applyImpulse] at the body's center of mass.
   */
  @JvmOverloads
  public final fun applyCentralImpulse(impulse: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.applyCentralImpulsePtr, NIL)
  }

  /**
   * Applies a positioned impulse to the body.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public final fun applyImpulse(impulse: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.applyImpulsePtr, NIL)
  }

  /**
   * Applies a rotational impulse to the body without affecting the position.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   * **Note:** [inverseInertia] is required for this to work. To have [inverseInertia], an active
   * [CollisionShape3D] must be a child of the node, or you can manually set [inverseInertia].
   */
  public final fun applyTorqueImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.applyTorqueImpulsePtr, NIL)
  }

  /**
   * Applies a directional force without affecting rotation. A force is time dependent and meant to
   * be applied every physics update.
   * This is equivalent to using [applyForce] at the body's center of mass.
   */
  @JvmOverloads
  public final fun applyCentralForce(force: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.applyCentralForcePtr, NIL)
  }

  /**
   * Applies a positioned force to the body. A force is time dependent and meant to be applied every
   * physics update.
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public final fun applyForce(force: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.applyForcePtr, NIL)
  }

  /**
   * Applies a rotational force without affecting position. A force is time dependent and meant to
   * be applied every physics update.
   * **Note:** [inverseInertia] is required for this to work. To have [inverseInertia], an active
   * [CollisionShape3D] must be a child of the node, or you can manually set [inverseInertia].
   */
  public final fun applyTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, MethodBindings.applyTorquePtr, NIL)
  }

  /**
   * Adds a constant directional force without affecting rotation that keeps being applied over time
   * until cleared with `constant_force = Vector3(0, 0, 0)`.
   * This is equivalent to using [addConstantForce] at the body's center of mass.
   */
  @JvmOverloads
  public final fun addConstantCentralForce(force: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.addConstantCentralForcePtr, NIL)
  }

  /**
   * Adds a constant positioned force to the body that keeps being applied over time until cleared
   * with `constant_force = Vector3(0, 0, 0)`.
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public final fun addConstantForce(force: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.addConstantForcePtr, NIL)
  }

  /**
   * Adds a constant rotational force without affecting position that keeps being applied over time
   * until cleared with `constant_torque = Vector3(0, 0, 0)`.
   */
  public final fun addConstantTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, MethodBindings.addConstantTorquePtr, NIL)
  }

  /**
   * Sets the body's total constant positional forces applied during each physics update.
   * See [addConstantForce] and [addConstantCentralForce].
   */
  public final fun setConstantForce(force: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.setConstantForcePtr, NIL)
  }

  /**
   * Returns the body's total constant positional forces applied during each physics update.
   * See [addConstantForce] and [addConstantCentralForce].
   */
  public final fun getConstantForce(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantForcePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the body's total constant rotational forces applied during each physics update.
   * See [addConstantTorque].
   */
  public final fun setConstantTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, MethodBindings.setConstantTorquePtr, NIL)
  }

  /**
   * Returns the body's total constant rotational forces applied during each physics update.
   * See [addConstantTorque].
   */
  public final fun getConstantTorque(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantTorquePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setSleepState(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setSleepStatePtr, NIL)
  }

  public final fun isSleeping(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSleepingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of contacts this body has with other bodies.
   * **Note:** By default, this returns 0 unless bodies are configured to monitor contacts. See
   * [RigidBody3D.contactMonitor].
   */
  public final fun getContactCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getContactCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the position of the contact point on the body in the global coordinate system.
   */
  public final fun getContactLocalPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactLocalPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the local normal at the contact point.
   */
  public final fun getContactLocalNormal(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactLocalNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Impulse created by the contact.
   */
  public final fun getContactImpulse(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactImpulsePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the local shape index of the collision.
   */
  public final fun getContactLocalShape(contactIdx: Int): Int {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactLocalShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the linear velocity vector at the body's contact point.
   */
  public final fun getContactLocalVelocityAtPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactLocalVelocityAtPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the collider's [RID].
   */
  public final fun getContactCollider(contactIdx: Int): RID {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the position of the contact point on the collider in the global coordinate system.
   */
  public final fun getContactColliderPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the collider's object id.
   */
  public final fun getContactColliderId(contactIdx: Int): Long {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the collider object.
   */
  public final fun getContactColliderObject(contactIdx: Int): Object? {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderObjectPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the collider's shape index.
   */
  public final fun getContactColliderShape(contactIdx: Int): Int {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the linear velocity vector at the collider's contact point.
   */
  public final fun getContactColliderVelocityAtPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderVelocityAtPositionPtr,
        VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun getStep(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStepPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Updates the body's linear and angular velocity by applying gravity and damping for the
   * equivalent of one physics tick.
   */
  public final fun integrateForces(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.integrateForcesPtr, NIL)
  }

  /**
   * Returns the current state of the space, useful for queries.
   */
  public final fun getSpaceState(): PhysicsDirectSpaceState3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpaceStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PhysicsDirectSpaceState3D?)
  }

  public companion object

  internal object MethodBindings {
    public val getTotalGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_total_gravity", 3360562783)

    public val getTotalLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_total_linear_damp", 1740695150)

    public val getTotalAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_total_angular_damp", 1740695150)

    public val getCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_center_of_mass", 3360562783)

    public val getCenterOfMassLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_center_of_mass_local", 3360562783)

    public val getPrincipalInertiaAxesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_principal_inertia_axes", 2716978435)

    public val getInverseMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_inverse_mass", 1740695150)

    public val getInverseInertiaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_inverse_inertia", 3360562783)

    public val getInverseInertiaTensorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_inverse_inertia_tensor", 2716978435)

    public val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_linear_velocity", 3460891852)

    public val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_linear_velocity", 3360562783)

    public val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_angular_velocity", 3460891852)

    public val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_angular_velocity", 3360562783)

    public val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_transform", 2952846383)

    public val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_transform", 3229777777)

    public val getVelocityAtLocalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_velocity_at_local_position", 192990374)

    public val applyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_central_impulse", 2007698547)

    public val applyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_impulse", 2754756483)

    public val applyTorqueImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_torque_impulse", 3460891852)

    public val applyCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_central_force", 2007698547)

    public val applyForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_force", 2754756483)

    public val applyTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_torque", 3460891852)

    public val addConstantCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "add_constant_central_force", 2007698547)

    public val addConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "add_constant_force", 2754756483)

    public val addConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "add_constant_torque", 3460891852)

    public val setConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_constant_force", 3460891852)

    public val getConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_constant_force", 3360562783)

    public val setConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_constant_torque", 3460891852)

    public val getConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_constant_torque", 3360562783)

    public val setSleepStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_sleep_state", 2586408642)

    public val isSleepingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "is_sleeping", 36873697)

    public val getContactCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_count", 3905245786)

    public val getContactLocalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_local_position", 711720468)

    public val getContactLocalNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_local_normal", 711720468)

    public val getContactImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_impulse", 711720468)

    public val getContactLocalShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_local_shape", 923996154)

    public val getContactLocalVelocityAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_local_velocity_at_position", 711720468)

    public val getContactColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider", 495598643)

    public val getContactColliderPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_position", 711720468)

    public val getContactColliderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_id", 923996154)

    public val getContactColliderObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_object", 3332903315)

    public val getContactColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_shape", 923996154)

    public val getContactColliderVelocityAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_velocity_at_position", 711720468)

    public val getStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_step", 1740695150)

    public val integrateForcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "integrate_forces", 3218959716)

    public val getSpaceStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_space_state", 2069328350)
  }
}
