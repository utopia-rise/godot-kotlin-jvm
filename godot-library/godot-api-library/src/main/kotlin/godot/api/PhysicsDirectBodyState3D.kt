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
import godot.common.interop.VoidPtr
import godot.core.Basis
import godot.core.RID
import godot.core.Transform3D
import godot.core.VariantParser.BASIS
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser._RID
import godot.core.Vector3
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
  public final inline val inverseInertia: Vector3
    @JvmName("inverseInertiaProperty")
    get() = getInverseInertia()

  /**
   * The inverse of the inertia tensor of the body.
   */
  public final inline val inverseInertiaTensor: Basis
    @JvmName("inverseInertiaTensorProperty")
    get() = getInverseInertiaTensor()

  /**
   * The total gravity vector being currently applied to this body.
   */
  public final inline val totalGravity: Vector3
    @JvmName("totalGravityProperty")
    get() = getTotalGravity()

  /**
   * The body's center of mass position relative to the body's center in the global coordinate
   * system.
   */
  public final inline val centerOfMass: Vector3
    @JvmName("centerOfMassProperty")
    get() = getCenterOfMass()

  /**
   * The body's center of mass position in the body's local coordinate system.
   */
  public final inline val centerOfMassLocal: Vector3
    @JvmName("centerOfMassLocalProperty")
    get() = getCenterOfMassLocal()

  public final inline val principalInertiaAxes: Basis
    @JvmName("principalInertiaAxesProperty")
    get() = getPrincipalInertiaAxes()

  /**
   * The body's rotational velocity in *radians* per second.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
   * The body's collision layer.
   */
  public final inline var collisionLayer: Long
    @JvmName("collisionLayerProperty")
    get() = getCollisionLayer()
    @JvmName("collisionLayerProperty")
    set(`value`) {
      setCollisionLayer(value)
    }

  /**
   * The body's collision mask.
   */
  public final inline var collisionMask: Long
    @JvmName("collisionMaskProperty")
    get() = getCollisionMask()
    @JvmName("collisionMaskProperty")
    set(`value`) {
      setCollisionMask(value)
    }

  /**
   * The body's transformation matrix.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var transform: Transform3D
    @JvmName("transformProperty")
    get() = getTransform()
    @JvmName("transformProperty")
    set(`value`) {
      setTransform(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(478, scriptPtr)
  }

  /**
   * This is a helper function for [angularVelocity] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = physicsdirectbodystate3d.angularVelocity
   * //Your changes
   * physicsdirectbodystate3d.angularVelocity = myCoreType
   * ``````
   *
   * The body's rotational velocity in *radians* per second.
   */
  @CoreTypeHelper
  public final fun angularVelocityMutate(block: Vector3.() -> Unit): Vector3 =
      angularVelocity.apply {
     block(this)
     angularVelocity = this
  }

  /**
   * This is a helper function for [linearVelocity] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = physicsdirectbodystate3d.linearVelocity
   * //Your changes
   * physicsdirectbodystate3d.linearVelocity = myCoreType
   * ``````
   *
   * The body's linear velocity in units per second.
   */
  @CoreTypeHelper
  public final fun linearVelocityMutate(block: Vector3.() -> Unit): Vector3 = linearVelocity.apply {
     block(this)
     linearVelocity = this
  }

  /**
   * This is a helper function for [transform] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = physicsdirectbodystate3d.transform
   * //Your changes
   * physicsdirectbodystate3d.transform = myCoreType
   * ``````
   *
   * The body's transformation matrix.
   */
  @CoreTypeHelper
  public final fun transformMutate(block: Transform3D.() -> Unit): Transform3D = transform.apply {
     block(this)
     transform = this
  }

  public final fun getTotalGravity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTotalGravityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
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

  public final fun getCenterOfMass(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCenterOfMassPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun getCenterOfMassLocal(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCenterOfMassLocalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun getPrincipalInertiaAxes(): Basis {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrincipalInertiaAxesPtr, BASIS)
    return (TransferContext.readReturnValue(BASIS) as Basis)
  }

  public final fun getInverseMass(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInverseMassPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getInverseInertia(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInverseInertiaPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun getInverseInertiaTensor(): Basis {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInverseInertiaTensorPtr, BASIS)
    return (TransferContext.readReturnValue(BASIS) as Basis)
  }

  public final fun setLinearVelocity(velocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to velocity)
    TransferContext.callMethod(ptr, MethodBindings.setLinearVelocityPtr, NIL)
  }

  public final fun getLinearVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLinearVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setAngularVelocity(velocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to velocity)
    TransferContext.callMethod(ptr, MethodBindings.setAngularVelocityPtr, NIL)
  }

  public final fun getAngularVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAngularVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setTransform(transform: Transform3D): Unit {
    TransferContext.writeArguments(TRANSFORM3D to transform)
    TransferContext.callMethod(ptr, MethodBindings.setTransformPtr, NIL)
  }

  public final fun getTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Returns the body's velocity at the given relative position, including both translation and
   * rotation.
   */
  public final fun getVelocityAtLocalPosition(localPosition: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to localPosition)
    TransferContext.callMethod(ptr, MethodBindings.getVelocityAtLocalPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Applies a directional impulse without affecting rotation.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   *
   * This is equivalent to using [applyImpulse] at the body's center of mass.
   */
  @JvmOverloads
  public final fun applyCentralImpulse(impulse: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(ptr, MethodBindings.applyCentralImpulsePtr, NIL)
  }

  /**
   * Applies a positioned impulse to the body.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public final fun applyImpulse(impulse: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse, VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.applyImpulsePtr, NIL)
  }

  /**
   * Applies a rotational impulse to the body without affecting the position.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   *
   * **Note:** [inverseInertia] is required for this to work. To have [inverseInertia], an active
   * [CollisionShape3D] must be a child of the node, or you can manually set [inverseInertia].
   */
  public final fun applyTorqueImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(ptr, MethodBindings.applyTorqueImpulsePtr, NIL)
  }

  /**
   * Applies a directional force without affecting rotation. A force is time dependent and meant to
   * be applied every physics update.
   *
   * This is equivalent to using [applyForce] at the body's center of mass.
   */
  @JvmOverloads
  public final fun applyCentralForce(force: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(ptr, MethodBindings.applyCentralForcePtr, NIL)
  }

  /**
   * Applies a positioned force to the body. A force is time dependent and meant to be applied every
   * physics update.
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public final fun applyForce(force: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.applyForcePtr, NIL)
  }

  /**
   * Applies a rotational force without affecting position. A force is time dependent and meant to
   * be applied every physics update.
   *
   * **Note:** [inverseInertia] is required for this to work. To have [inverseInertia], an active
   * [CollisionShape3D] must be a child of the node, or you can manually set [inverseInertia].
   */
  public final fun applyTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(ptr, MethodBindings.applyTorquePtr, NIL)
  }

  /**
   * Adds a constant directional force without affecting rotation that keeps being applied over time
   * until cleared with `constant_force = Vector3(0, 0, 0)`.
   *
   * This is equivalent to using [addConstantForce] at the body's center of mass.
   */
  @JvmOverloads
  public final fun addConstantCentralForce(force: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(ptr, MethodBindings.addConstantCentralForcePtr, NIL)
  }

  /**
   * Adds a constant positioned force to the body that keeps being applied over time until cleared
   * with `constant_force = Vector3(0, 0, 0)`.
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public final fun addConstantForce(force: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.addConstantForcePtr, NIL)
  }

  /**
   * Adds a constant rotational force without affecting position that keeps being applied over time
   * until cleared with `constant_torque = Vector3(0, 0, 0)`.
   */
  public final fun addConstantTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(ptr, MethodBindings.addConstantTorquePtr, NIL)
  }

  /**
   * Sets the body's total constant positional forces applied during each physics update.
   *
   * See [addConstantForce] and [addConstantCentralForce].
   */
  public final fun setConstantForce(force: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(ptr, MethodBindings.setConstantForcePtr, NIL)
  }

  /**
   * Returns the body's total constant positional forces applied during each physics update.
   *
   * See [addConstantForce] and [addConstantCentralForce].
   */
  public final fun getConstantForce(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstantForcePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the body's total constant rotational forces applied during each physics update.
   *
   * See [addConstantTorque].
   */
  public final fun setConstantTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(ptr, MethodBindings.setConstantTorquePtr, NIL)
  }

  /**
   * Returns the body's total constant rotational forces applied during each physics update.
   *
   * See [addConstantTorque].
   */
  public final fun getConstantTorque(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstantTorquePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
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

  public final fun setCollisionLayer(layer: Long): Unit {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionLayerPtr, NIL)
  }

  public final fun getCollisionLayer(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCollisionMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public final fun getCollisionMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the number of contacts this body has with other bodies.
   *
   * **Note:** By default, this returns 0 unless bodies are configured to monitor contacts. See
   * [RigidBody3D.contactMonitor].
   */
  public final fun getContactCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getContactCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the position of the contact point on the body in the global coordinate system.
   */
  public final fun getContactLocalPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactLocalPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the local normal at the contact point.
   */
  public final fun getContactLocalNormal(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactLocalNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Impulse created by the contact.
   */
  public final fun getContactImpulse(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactImpulsePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
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
   * Returns the linear velocity vector at the body's contact point.
   */
  public final fun getContactLocalVelocityAtPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactLocalVelocityAtPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
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
  public final fun getContactColliderPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactColliderPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
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
   * Returns the collider object.
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
   * Returns the linear velocity vector at the collider's contact point.
   */
  public final fun getContactColliderVelocityAtPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getContactColliderVelocityAtPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
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
  public final fun getSpaceState(): PhysicsDirectSpaceState3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpaceStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PhysicsDirectSpaceState3D?)
  }

  public companion object

  public object MethodBindings {
    internal val getTotalGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_total_gravity", 3360562783)

    internal val getTotalLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_total_linear_damp", 1740695150)

    internal val getTotalAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_total_angular_damp", 1740695150)

    internal val getCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_center_of_mass", 3360562783)

    internal val getCenterOfMassLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_center_of_mass_local", 3360562783)

    internal val getPrincipalInertiaAxesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_principal_inertia_axes", 2716978435)

    internal val getInverseMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_inverse_mass", 1740695150)

    internal val getInverseInertiaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_inverse_inertia", 3360562783)

    internal val getInverseInertiaTensorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_inverse_inertia_tensor", 2716978435)

    internal val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_linear_velocity", 3460891852)

    internal val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_linear_velocity", 3360562783)

    internal val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_angular_velocity", 3460891852)

    internal val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_angular_velocity", 3360562783)

    internal val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_transform", 2952846383)

    internal val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_transform", 3229777777)

    internal val getVelocityAtLocalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_velocity_at_local_position", 192990374)

    internal val applyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_central_impulse", 2007698547)

    internal val applyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_impulse", 2754756483)

    internal val applyTorqueImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_torque_impulse", 3460891852)

    internal val applyCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_central_force", 2007698547)

    internal val applyForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_force", 2754756483)

    internal val applyTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_torque", 3460891852)

    internal val addConstantCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "add_constant_central_force", 2007698547)

    internal val addConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "add_constant_force", 2754756483)

    internal val addConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "add_constant_torque", 3460891852)

    internal val setConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_constant_force", 3460891852)

    internal val getConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_constant_force", 3360562783)

    internal val setConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_constant_torque", 3460891852)

    internal val getConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_constant_torque", 3360562783)

    internal val setSleepStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_sleep_state", 2586408642)

    internal val isSleepingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "is_sleeping", 36873697)

    internal val setCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_collision_layer", 1286410249)

    internal val getCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_collision_layer", 3905245786)

    internal val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_collision_mask", 1286410249)

    internal val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_collision_mask", 3905245786)

    internal val getContactCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_count", 3905245786)

    internal val getContactLocalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_local_position", 711720468)

    internal val getContactLocalNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_local_normal", 711720468)

    internal val getContactImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_impulse", 711720468)

    internal val getContactLocalShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_local_shape", 923996154)

    internal val getContactLocalVelocityAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_local_velocity_at_position", 711720468)

    internal val getContactColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider", 495598643)

    internal val getContactColliderPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_position", 711720468)

    internal val getContactColliderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_id", 923996154)

    internal val getContactColliderObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_object", 3332903315)

    internal val getContactColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_shape", 923996154)

    internal val getContactColliderVelocityAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_velocity_at_position", 711720468)

    internal val getStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_step", 1740695150)

    internal val integrateForcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "integrate_forces", 3218959716)

    internal val getSpaceStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_space_state", 2069328350)
  }
}
