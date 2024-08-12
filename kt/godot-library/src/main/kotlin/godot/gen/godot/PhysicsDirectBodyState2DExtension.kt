// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * This class extends [PhysicsDirectBodyState2D] by providing additional virtual methods that can be
 * overridden. When these methods are overridden, they will be called instead of the internal methods
 * of the physics server.
 * Intended for use with GDExtension to create custom implementations of [PhysicsDirectBodyState2D].
 */
@GodotBaseType
public open class PhysicsDirectBodyState2DExtension : PhysicsDirectBodyState2D() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSDIRECTBODYSTATE2DEXTENSION, scriptIndex)
    return true
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.totalGravity] and its
   * respective getter.
   */
  public open fun _getTotalGravity(): Vector2 {
    throw NotImplementedError("_get_total_gravity is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.totalLinearDamp] and its
   * respective getter.
   */
  public open fun _getTotalLinearDamp(): Float {
    throw NotImplementedError("_get_total_linear_damp is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.totalAngularDamp] and its
   * respective getter.
   */
  public open fun _getTotalAngularDamp(): Float {
    throw NotImplementedError("_get_total_angular_damp is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.centerOfMass] and its
   * respective getter.
   */
  public open fun _getCenterOfMass(): Vector2 {
    throw NotImplementedError("_get_center_of_mass is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.centerOfMassLocal] and its
   * respective getter.
   */
  public open fun _getCenterOfMassLocal(): Vector2 {
    throw NotImplementedError("_get_center_of_mass_local is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.inverseMass] and its respective
   * getter.
   */
  public open fun _getInverseMass(): Float {
    throw NotImplementedError("_get_inverse_mass is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.inverseInertia] and its
   * respective getter.
   */
  public open fun _getInverseInertia(): Float {
    throw NotImplementedError("_get_inverse_inertia is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.linearVelocity] and its
   * respective setter.
   */
  public open fun _setLinearVelocity(velocity: Vector2): Unit {
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.linearVelocity] and its
   * respective getter.
   */
  public open fun _getLinearVelocity(): Vector2 {
    throw NotImplementedError("_get_linear_velocity is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.angularVelocity] and its
   * respective setter.
   */
  public open fun _setAngularVelocity(velocity: Float): Unit {
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.angularVelocity] and its
   * respective getter.
   */
  public open fun _getAngularVelocity(): Float {
    throw NotImplementedError("_get_angular_velocity is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.transform] and its respective
   * setter.
   */
  public open fun _setTransform(transform: Transform2D): Unit {
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.transform] and its respective
   * getter.
   */
  public open fun _getTransform(): Transform2D {
    throw NotImplementedError("_get_transform is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getVelocityAtLocalPosition].
   */
  public open fun _getVelocityAtLocalPosition(localPosition: Vector2): Vector2 {
    throw NotImplementedError("_get_velocity_at_local_position is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyCentralImpulse].
   */
  public open fun _applyCentralImpulse(impulse: Vector2): Unit {
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyImpulse].
   */
  public open fun _applyImpulse(impulse: Vector2, position: Vector2): Unit {
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyTorqueImpulse].
   */
  public open fun _applyTorqueImpulse(impulse: Float): Unit {
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyCentralForce].
   */
  public open fun _applyCentralForce(force: Vector2): Unit {
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyForce].
   */
  public open fun _applyForce(force: Vector2, position: Vector2): Unit {
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyTorque].
   */
  public open fun _applyTorque(torque: Float): Unit {
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.addConstantCentralForce].
   */
  public open fun _addConstantCentralForce(force: Vector2): Unit {
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.addConstantForce].
   */
  public open fun _addConstantForce(force: Vector2, position: Vector2): Unit {
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.addConstantTorque].
   */
  public open fun _addConstantTorque(torque: Float): Unit {
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.setConstantForce].
   */
  public open fun _setConstantForce(force: Vector2): Unit {
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getConstantForce].
   */
  public open fun _getConstantForce(): Vector2 {
    throw NotImplementedError("_get_constant_force is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.setConstantTorque].
   */
  public open fun _setConstantTorque(torque: Float): Unit {
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getConstantTorque].
   */
  public open fun _getConstantTorque(): Float {
    throw NotImplementedError("_get_constant_torque is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.sleeping] and its respective
   * setter.
   */
  public open fun _setSleepState(enabled: Boolean): Unit {
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.sleeping] and its respective
   * getter.
   */
  public open fun _isSleeping(): Boolean {
    throw NotImplementedError("_is_sleeping is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactCount].
   */
  public open fun _getContactCount(): Int {
    throw NotImplementedError("_get_contact_count is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactLocalPosition].
   */
  public open fun _getContactLocalPosition(contactIdx: Int): Vector2 {
    throw NotImplementedError("_get_contact_local_position is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactLocalNormal].
   */
  public open fun _getContactLocalNormal(contactIdx: Int): Vector2 {
    throw NotImplementedError("_get_contact_local_normal is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactLocalShape].
   */
  public open fun _getContactLocalShape(contactIdx: Int): Int {
    throw NotImplementedError("_get_contact_local_shape is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactLocalVelocityAtPosition].
   */
  public open fun _getContactLocalVelocityAtPosition(contactIdx: Int): Vector2 {
    throw NotImplementedError("_get_contact_local_velocity_at_position is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactCollider].
   */
  public open fun _getContactCollider(contactIdx: Int): RID {
    throw NotImplementedError("_get_contact_collider is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderPosition].
   */
  public open fun _getContactColliderPosition(contactIdx: Int): Vector2 {
    throw NotImplementedError("_get_contact_collider_position is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderId].
   */
  public open fun _getContactColliderId(contactIdx: Int): Long {
    throw NotImplementedError("_get_contact_collider_id is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderObject].
   */
  public open fun _getContactColliderObject(contactIdx: Int): Object? {
    throw NotImplementedError("_get_contact_collider_object is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderShape].
   */
  public open fun _getContactColliderShape(contactIdx: Int): Int {
    throw NotImplementedError("_get_contact_collider_shape is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderVelocityAtPosition].
   */
  public open fun _getContactColliderVelocityAtPosition(contactIdx: Int): Vector2 {
    throw NotImplementedError("_get_contact_collider_velocity_at_position is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactImpulse].
   */
  public open fun _getContactImpulse(contactIdx: Int): Vector2 {
    throw NotImplementedError("_get_contact_impulse is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.step] and its respective
   * getter.
   */
  public open fun _getStep(): Float {
    throw NotImplementedError("_get_step is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.integrateForces].
   */
  public open fun _integrateForces(): Unit {
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getSpaceState].
   */
  public open fun _getSpaceState(): PhysicsDirectSpaceState2D? {
    throw NotImplementedError("_get_space_state is not implemented for PhysicsDirectBodyState2DExtension")
  }

  public companion object

  internal object MethodBindings {
    public val _getTotalGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_total_gravity")

    public val _getTotalLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_total_linear_damp")

    public val _getTotalAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_total_angular_damp")

    public val _getCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_center_of_mass")

    public val _getCenterOfMassLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_center_of_mass_local")

    public val _getInverseMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_inverse_mass")

    public val _getInverseInertiaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_inverse_inertia")

    public val _setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_set_linear_velocity")

    public val _getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_linear_velocity")

    public val _setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_set_angular_velocity")

    public val _getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_angular_velocity")

    public val _setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_set_transform")

    public val _getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_transform")

    public val _getVelocityAtLocalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_velocity_at_local_position")

    public val _applyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_apply_central_impulse")

    public val _applyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_apply_impulse")

    public val _applyTorqueImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_apply_torque_impulse")

    public val _applyCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_apply_central_force")

    public val _applyForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_apply_force")

    public val _applyTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_apply_torque")

    public val _addConstantCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_add_constant_central_force")

    public val _addConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_add_constant_force")

    public val _addConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_add_constant_torque")

    public val _setConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_set_constant_force")

    public val _getConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_constant_force")

    public val _setConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_set_constant_torque")

    public val _getConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_constant_torque")

    public val _setSleepStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_set_sleep_state")

    public val _isSleepingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_is_sleeping")

    public val _getContactCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_contact_count")

    public val _getContactLocalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_contact_local_position")

    public val _getContactLocalNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_contact_local_normal")

    public val _getContactLocalShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_contact_local_shape")

    public val _getContactLocalVelocityAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_contact_local_velocity_at_position")

    public val _getContactColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_contact_collider")

    public val _getContactColliderPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_contact_collider_position")

    public val _getContactColliderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_contact_collider_id")

    public val _getContactColliderObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_contact_collider_object")

    public val _getContactColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_contact_collider_shape")

    public val _getContactColliderVelocityAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_contact_collider_velocity_at_position")

    public val _getContactImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_contact_impulse")

    public val _getStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_step")

    public val _integrateForcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_integrate_forces")

    public val _getSpaceStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2DExtension", "_get_space_state")
  }
}
