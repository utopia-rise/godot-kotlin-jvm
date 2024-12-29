// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.addConstantCentralForcePtr
import godot.addConstantForcePtr
import godot.addConstantTorquePtr
import godot.applyCentralForcePtr
import godot.applyCentralImpulsePtr
import godot.applyForcePtr
import godot.applyImpulsePtr
import godot.applyTorqueImpulsePtr
import godot.applyTorquePtr
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.Transform2D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.getAngularVelocityPtr
import godot.getCenterOfMassLocalPtr
import godot.getCenterOfMassPtr
import godot.getConstantForcePtr
import godot.getConstantTorquePtr
import godot.getContactColliderIdPtr
import godot.getContactColliderObjectPtr
import godot.getContactColliderPositionPtr
import godot.getContactColliderPtr
import godot.getContactColliderShapePtr
import godot.getContactColliderVelocityAtPositionPtr
import godot.getContactCountPtr
import godot.getContactImpulsePtr
import godot.getContactLocalNormalPtr
import godot.getContactLocalPositionPtr
import godot.getContactLocalShapePtr
import godot.getContactLocalVelocityAtPositionPtr
import godot.getInverseInertiaPtr
import godot.getInverseMassPtr
import godot.getLinearVelocityPtr
import godot.getSpaceStatePtr
import godot.getStepPtr
import godot.getTotalAngularDampPtr
import godot.getTotalGravityPtr
import godot.getTotalLinearDampPtr
import godot.getTransformPtr
import godot.getVelocityAtLocalPositionPtr
import godot.integrateForcesPtr
import godot.isSleepingPtr
import godot.setAngularVelocityPtr
import godot.setConstantForcePtr
import godot.setConstantTorquePtr
import godot.setLinearVelocityPtr
import godot.setSleepStatePtr
import godot.setTransformPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINECLASS_PHYSICSDIRECTBODYSTATE2D: Int = 462

/**
 * Provides direct access to a physics body in the [PhysicsServer2D], allowing safe changes to
 * physics properties. This object is passed via the direct state callback of [RigidBody2D], and is
 * intended for changing the direct state of that body. See [RigidBody2D.IntegrateForces].
 */
@GodotBaseType
public open class PhysicsDirectBodyState2D internal constructor() : Object() {
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
   * The inverse of the inertia of the body.
   */
  public final inline val inverseInertia: Float
    @JvmName("inverseInertiaProperty")
    get() = getInverseInertia()

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
   * The total gravity vector being currently applied to this body.
   */
  @CoreTypeLocalCopy
  public final inline val totalGravity: Vector2
    @JvmName("totalGravityProperty")
    get() = getTotalGravity()

  /**
   * The body's center of mass position relative to the body's center in the global coordinate
   * system.
   */
  @CoreTypeLocalCopy
  public final inline val centerOfMass: Vector2
    @JvmName("centerOfMassProperty")
    get() = getCenterOfMass()

  /**
   * The body's center of mass position in the body's local coordinate system.
   */
  @CoreTypeLocalCopy
  public final inline val centerOfMassLocal: Vector2
    @JvmName("centerOfMassLocalProperty")
    get() = getCenterOfMassLocal()

  /**
   * The body's rotational velocity in *radians* per second.
   */
  public final inline var angularVelocity: Float
    @JvmName("angularVelocityProperty")
    get() = getAngularVelocity()
    @JvmName("angularVelocityProperty")
    set(`value`) {
      setAngularVelocity(value)
    }

  /**
   * The body's linear velocity in pixels per second.
   */
  @CoreTypeLocalCopy
  public final inline var linearVelocity: Vector2
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
  public final inline var transform: Transform2D
    @JvmName("transformProperty")
    get() = getTransform()
    @JvmName("transformProperty")
    set(`value`) {
      setTransform(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_PHYSICSDIRECTBODYSTATE2D, scriptIndex)
  }

  /**
   * The body's linear velocity in pixels per second.
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
   * val myCoreType = physicsdirectbodystate2d.linearVelocity
   * //Your changes
   * physicsdirectbodystate2d.linearVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun linearVelocityMutate(block: Vector2.() -> Unit): Vector2 = linearVelocity.apply{
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
   * val myCoreType = physicsdirectbodystate2d.transform
   * //Your changes
   * physicsdirectbodystate2d.transform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun transformMutate(block: Transform2D.() -> Unit): Transform2D = transform.apply{
      block(this)
      transform = this
  }


  public final fun getTotalGravity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTotalGravityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun getTotalLinearDamp(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTotalLinearDampPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getTotalAngularDamp(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTotalAngularDampPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getCenterOfMass(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCenterOfMassPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun getCenterOfMassLocal(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCenterOfMassLocalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun getInverseMass(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInverseMassPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getInverseInertia(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInverseInertiaPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLinearVelocity(velocity: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to velocity)
    TransferContext.callMethod(ptr, MethodBindings.setLinearVelocityPtr, NIL)
  }

  public final fun getLinearVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLinearVelocityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setAngularVelocity(velocity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to velocity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAngularVelocityPtr, NIL)
  }

  public final fun getAngularVelocity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAngularVelocityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTransform(transform: Transform2D): Unit {
    TransferContext.writeArguments(TRANSFORM2D to transform)
    TransferContext.callMethod(ptr, MethodBindings.setTransformPtr, NIL)
  }

  public final fun getTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Returns the body's velocity at the given relative position, including both translation and
   * rotation.
   */
  public final fun getVelocityAtLocalPosition(localPosition: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to localPosition)
    TransferContext.callMethod(ptr, MethodBindings.getVelocityAtLocalPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Applies a directional impulse without affecting rotation.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   * This is equivalent to using [applyImpulse] at the body's center of mass.
   */
  public final fun applyCentralImpulse(impulse: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to impulse)
    TransferContext.callMethod(ptr, MethodBindings.applyCentralImpulsePtr, NIL)
  }

  /**
   * Applies a rotational impulse to the body without affecting the position.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   * **Note:** [inverseInertia] is required for this to work. To have [inverseInertia], an active
   * [CollisionShape2D] must be a child of the node, or you can manually set [inverseInertia].
   */
  public final fun applyTorqueImpulse(impulse: Float): Unit {
    TransferContext.writeArguments(DOUBLE to impulse.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.applyTorqueImpulsePtr, NIL)
  }

  /**
   * Applies a positioned impulse to the body.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public final fun applyImpulse(impulse: Vector2, position: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to impulse, VECTOR2 to position)
    TransferContext.callMethod(ptr, MethodBindings.applyImpulsePtr, NIL)
  }

  /**
   * Applies a directional force without affecting rotation. A force is time dependent and meant to
   * be applied every physics update.
   * This is equivalent to using [applyForce] at the body's center of mass.
   */
  @JvmOverloads
  public final fun applyCentralForce(force: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.callMethod(ptr, MethodBindings.applyCentralForcePtr, NIL)
  }

  /**
   * Applies a positioned force to the body. A force is time dependent and meant to be applied every
   * physics update.
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public final fun applyForce(force: Vector2, position: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to force, VECTOR2 to position)
    TransferContext.callMethod(ptr, MethodBindings.applyForcePtr, NIL)
  }

  /**
   * Applies a rotational force without affecting position. A force is time dependent and meant to
   * be applied every physics update.
   * **Note:** [inverseInertia] is required for this to work. To have [inverseInertia], an active
   * [CollisionShape2D] must be a child of the node, or you can manually set [inverseInertia].
   */
  public final fun applyTorque(torque: Float): Unit {
    TransferContext.writeArguments(DOUBLE to torque.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.applyTorquePtr, NIL)
  }

  /**
   * Adds a constant directional force without affecting rotation that keeps being applied over time
   * until cleared with `constant_force = Vector2(0, 0)`.
   * This is equivalent to using [addConstantForce] at the body's center of mass.
   */
  @JvmOverloads
  public final fun addConstantCentralForce(force: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.callMethod(ptr, MethodBindings.addConstantCentralForcePtr, NIL)
  }

  /**
   * Adds a constant positioned force to the body that keeps being applied over time until cleared
   * with `constant_force = Vector2(0, 0)`.
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public final fun addConstantForce(force: Vector2, position: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to force, VECTOR2 to position)
    TransferContext.callMethod(ptr, MethodBindings.addConstantForcePtr, NIL)
  }

  /**
   * Adds a constant rotational force without affecting position that keeps being applied over time
   * until cleared with `constant_torque = 0`.
   */
  public final fun addConstantTorque(torque: Float): Unit {
    TransferContext.writeArguments(DOUBLE to torque.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.addConstantTorquePtr, NIL)
  }

  /**
   * Sets the body's total constant positional forces applied during each physics update.
   * See [addConstantForce] and [addConstantCentralForce].
   */
  public final fun setConstantForce(force: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.callMethod(ptr, MethodBindings.setConstantForcePtr, NIL)
  }

  /**
   * Returns the body's total constant positional forces applied during each physics update.
   * See [addConstantForce] and [addConstantCentralForce].
   */
  public final fun getConstantForce(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstantForcePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the body's total constant rotational forces applied during each physics update.
   * See [addConstantTorque].
   */
  public final fun setConstantTorque(torque: Float): Unit {
    TransferContext.writeArguments(DOUBLE to torque.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setConstantTorquePtr, NIL)
  }

  /**
   * Returns the body's total constant rotational forces applied during each physics update.
   * See [addConstantTorque].
   */
  public final fun getConstantTorque(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstantTorquePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSleepState(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setSleepStatePtr, NIL)
  }

  public final fun isSleeping(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSleepingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of contacts this body has with other bodies.
   * **Note:** By default, this returns 0 unless bodies are configured to monitor contacts. See
   * [RigidBody2D.contactMonitor].
   */
  public final fun getContactCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getContactCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the position of the contact point on the body in the global coordinate system.
   */
  public final fun getContactLocalPosition(contactIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactLocalPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the local normal at the contact point.
   */
  public final fun getContactLocalNormal(contactIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactLocalNormalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the local shape index of the collision.
   */
  public final fun getContactLocalShape(contactIdx: Int): Int {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactLocalShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the velocity vector at the body's contact point.
   */
  public final fun getContactLocalVelocityAtPosition(contactIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactLocalVelocityAtPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the collider's [RID].
   */
  public final fun getContactCollider(contactIdx: Int): RID {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactColliderPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the position of the contact point on the collider in the global coordinate system.
   */
  public final fun getContactColliderPosition(contactIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactColliderPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the collider's object id.
   */
  public final fun getContactColliderId(contactIdx: Int): Long {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactColliderIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the collider object. This depends on how it was created (will return a scene node if
   * such was used to create it).
   */
  public final fun getContactColliderObject(contactIdx: Int): Object? {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactColliderObjectPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the collider's shape index.
   */
  public final fun getContactColliderShape(contactIdx: Int): Int {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactColliderShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the velocity vector at the collider's contact point.
   */
  public final fun getContactColliderVelocityAtPosition(contactIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactColliderVelocityAtPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the impulse created by the contact.
   */
  public final fun getContactImpulse(contactIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactImpulsePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun getStep(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStepPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Updates the body's linear and angular velocity by applying gravity and damping for the
   * equivalent of one physics tick.
   */
  public final fun integrateForces(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.integrateForcesPtr, NIL)
  }

  /**
   * Returns the current state of the space, useful for queries.
   */
  public final fun getSpaceState(): PhysicsDirectSpaceState2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpaceStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PhysicsDirectSpaceState2D?)
  }

  public companion object

  public object MethodBindings {
    internal val getTotalGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_total_gravity", 3341600327)

    internal val getTotalLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_total_linear_damp", 1740695150)

    internal val getTotalAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_total_angular_damp", 1740695150)

    internal val getCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_center_of_mass", 3341600327)

    internal val getCenterOfMassLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_center_of_mass_local", 3341600327)

    internal val getInverseMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_inverse_mass", 1740695150)

    internal val getInverseInertiaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_inverse_inertia", 1740695150)

    internal val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "set_linear_velocity", 743155724)

    internal val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_linear_velocity", 3341600327)

    internal val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "set_angular_velocity", 373806689)

    internal val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_angular_velocity", 1740695150)

    internal val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "set_transform", 2761652528)

    internal val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_transform", 3814499831)

    internal val getVelocityAtLocalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_velocity_at_local_position", 2656412154)

    internal val applyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "apply_central_impulse", 743155724)

    internal val applyTorqueImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "apply_torque_impulse", 373806689)

    internal val applyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "apply_impulse", 4288681949)

    internal val applyCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "apply_central_force", 3862383994)

    internal val applyForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "apply_force", 4288681949)

    internal val applyTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "apply_torque", 373806689)

    internal val addConstantCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "add_constant_central_force", 3862383994)

    internal val addConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "add_constant_force", 4288681949)

    internal val addConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "add_constant_torque", 373806689)

    internal val setConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "set_constant_force", 743155724)

    internal val getConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_constant_force", 3341600327)

    internal val setConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "set_constant_torque", 373806689)

    internal val getConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_constant_torque", 1740695150)

    internal val setSleepStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "set_sleep_state", 2586408642)

    internal val isSleepingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "is_sleeping", 36873697)

    internal val getContactCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_count", 3905245786)

    internal val getContactLocalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_local_position", 2299179447)

    internal val getContactLocalNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_local_normal", 2299179447)

    internal val getContactLocalShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_local_shape", 923996154)

    internal val getContactLocalVelocityAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_local_velocity_at_position", 2299179447)

    internal val getContactColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_collider", 495598643)

    internal val getContactColliderPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_collider_position", 2299179447)

    internal val getContactColliderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_collider_id", 923996154)

    internal val getContactColliderObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_collider_object", 3332903315)

    internal val getContactColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_collider_shape", 923996154)

    internal val getContactColliderVelocityAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_collider_velocity_at_position", 2299179447)

    internal val getContactImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_impulse", 2299179447)

    internal val getStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_step", 1740695150)

    internal val integrateForcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "integrate_forces", 3218959716)

    internal val getSpaceStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_space_state", 2506717822)
  }
}
