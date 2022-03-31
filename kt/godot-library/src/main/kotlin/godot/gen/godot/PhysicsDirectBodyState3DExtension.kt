// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.RID
import godot.core.Transform3D
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class PhysicsDirectBodyState3DExtension : PhysicsDirectBodyState3D() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSDIRECTBODYSTATE3DEXTENSION)
  }

  /**
   *
   */
  public open fun _getTotalGravity(): Vector3 {
    throw
        NotImplementedError("_get_total_gravity is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getTotalLinearDamp(): Double {
    throw
        NotImplementedError("_get_total_linear_damp is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getTotalAngularDamp(): Double {
    throw
        NotImplementedError("_get_total_angular_damp is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getCenterOfMass(): Vector3 {
    throw
        NotImplementedError("_get_center_of_mass is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getCenterOfMassLocal(): Vector3 {
    throw
        NotImplementedError("_get_center_of_mass_local is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getPrincipalInertiaAxes(): Basis {
    throw
        NotImplementedError("_get_principal_inertia_axes is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getInverseMass(): Double {
    throw
        NotImplementedError("_get_inverse_mass is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getInverseInertia(): Vector3 {
    throw
        NotImplementedError("_get_inverse_inertia is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _setLinearVelocity(velocity: Vector3): Unit {
  }

  /**
   *
   */
  public open fun _getLinearVelocity(): Vector3 {
    throw
        NotImplementedError("_get_linear_velocity is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _setAngularVelocity(velocity: Vector3): Unit {
  }

  /**
   *
   */
  public open fun _getAngularVelocity(): Vector3 {
    throw
        NotImplementedError("_get_angular_velocity is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _setTransform(transform: Transform3D): Unit {
  }

  /**
   *
   */
  public open fun _getTransform(): Transform3D {
    throw
        NotImplementedError("_get_transform is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getVelocityAtLocalPosition(localPosition: Vector3): Vector3 {
    throw
        NotImplementedError("_get_velocity_at_local_position is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _applyCentralImpulse(impulse: Vector3): Unit {
  }

  /**
   *
   */
  public open fun _applyImpulse(impulse: Vector3, position: Vector3): Unit {
  }

  /**
   *
   */
  public open fun _applyTorqueImpulse(impulse: Vector3): Unit {
  }

  /**
   *
   */
  public open fun _applyCentralForce(force: Vector3): Unit {
  }

  /**
   *
   */
  public open fun _applyForce(force: Vector3, position: Vector3): Unit {
  }

  /**
   *
   */
  public open fun _applyTorque(torque: Vector3): Unit {
  }

  /**
   *
   */
  public open fun _addConstantCentralForce(force: Vector3): Unit {
  }

  /**
   *
   */
  public open fun _addConstantForce(force: Vector3, position: Vector3): Unit {
  }

  /**
   *
   */
  public open fun _addConstantTorque(torque: Vector3): Unit {
  }

  /**
   *
   */
  public open fun _setConstantForce(force: Vector3): Unit {
  }

  /**
   *
   */
  public open fun _getConstantForce(): Vector3 {
    throw
        NotImplementedError("_get_constant_force is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _setConstantTorque(torque: Vector3): Unit {
  }

  /**
   *
   */
  public open fun _getConstantTorque(): Vector3 {
    throw
        NotImplementedError("_get_constant_torque is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _setSleepState(enabled: Boolean): Unit {
  }

  /**
   *
   */
  public open fun _isSleeping(): Boolean {
    throw
        NotImplementedError("_is_sleeping is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getContactCount(): Long {
    throw
        NotImplementedError("_get_contact_count is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getContactLocalPosition(contactIdx: Long): Vector3 {
    throw
        NotImplementedError("_get_contact_local_position is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getContactLocalNormal(contactIdx: Long): Vector3 {
    throw
        NotImplementedError("_get_contact_local_normal is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getContactImpulse(contactIdx: Long): Double {
    throw
        NotImplementedError("_get_contact_impulse is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getContactLocalShape(contactIdx: Long): Long {
    throw
        NotImplementedError("_get_contact_local_shape is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getContactCollider(contactIdx: Long): RID {
    throw
        NotImplementedError("_get_contact_collider is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getContactColliderPosition(contactIdx: Long): Vector3 {
    throw
        NotImplementedError("_get_contact_collider_position is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getContactColliderId(contactIdx: Long): Long {
    throw
        NotImplementedError("_get_contact_collider_id is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getContactColliderObject(contactIdx: Long): Object? {
    throw
        NotImplementedError("_get_contact_collider_object is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getContactColliderShape(contactIdx: Long): Long {
    throw
        NotImplementedError("_get_contact_collider_shape is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getContactColliderVelocityAtPosition(contactIdx: Long): Vector3 {
    throw
        NotImplementedError("_get_contact_collider_velocity_at_position is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _getStep(): Double {
    throw NotImplementedError("_get_step is not implemented for PhysicsDirectBodyState3DExtension")
  }

  /**
   *
   */
  public open fun _integrateForces(): Unit {
  }

  /**
   *
   */
  public open fun _getSpaceState(): PhysicsDirectSpaceState3D? {
    throw
        NotImplementedError("_get_space_state is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public companion object
}
