// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.RID
import godot.core.Transform3D
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * This class extends [PhysicsDirectBodyState3D] by providing additional virtual methods that can be overridden. When these methods are overridden, they will be called instead of the internal methods of the physics server.
 *
 * Intended for use with GDExtension to create custom implementations of [PhysicsDirectBodyState3D].
 */
@GodotBaseType
public open class PhysicsDirectBodyState3DExtension : PhysicsDirectBodyState3D() {
  override fun new(scriptIndex: Int) {
    createNativeObject(464, scriptIndex)
  }

  public open fun _getTotalGravity(): Vector3 {
    throw NotImplementedError("_getTotalGravity is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getTotalLinearDamp(): Float {
    throw NotImplementedError("_getTotalLinearDamp is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getTotalAngularDamp(): Float {
    throw NotImplementedError("_getTotalAngularDamp is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getCenterOfMass(): Vector3 {
    throw NotImplementedError("_getCenterOfMass is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getCenterOfMassLocal(): Vector3 {
    throw NotImplementedError("_getCenterOfMassLocal is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getPrincipalInertiaAxes(): Basis {
    throw NotImplementedError("_getPrincipalInertiaAxes is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getInverseMass(): Float {
    throw NotImplementedError("_getInverseMass is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getInverseInertia(): Vector3 {
    throw NotImplementedError("_getInverseInertia is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getInverseInertiaTensor(): Basis {
    throw NotImplementedError("_getInverseInertiaTensor is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _setLinearVelocity(velocity: Vector3) {
    throw NotImplementedError("_setLinearVelocity is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getLinearVelocity(): Vector3 {
    throw NotImplementedError("_getLinearVelocity is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _setAngularVelocity(velocity: Vector3) {
    throw NotImplementedError("_setAngularVelocity is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getAngularVelocity(): Vector3 {
    throw NotImplementedError("_getAngularVelocity is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _setTransform(transform: Transform3D) {
    throw NotImplementedError("_setTransform is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getTransform(): Transform3D {
    throw NotImplementedError("_getTransform is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getVelocityAtLocalPosition(localPosition: Vector3): Vector3 {
    throw NotImplementedError("_getVelocityAtLocalPosition is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _applyCentralImpulse(impulse: Vector3) {
    throw NotImplementedError("_applyCentralImpulse is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _applyImpulse(impulse: Vector3, position: Vector3) {
    throw NotImplementedError("_applyImpulse is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _applyTorqueImpulse(impulse: Vector3) {
    throw NotImplementedError("_applyTorqueImpulse is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _applyCentralForce(force: Vector3) {
    throw NotImplementedError("_applyCentralForce is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _applyForce(force: Vector3, position: Vector3) {
    throw NotImplementedError("_applyForce is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _applyTorque(torque: Vector3) {
    throw NotImplementedError("_applyTorque is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _addConstantCentralForce(force: Vector3) {
    throw NotImplementedError("_addConstantCentralForce is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _addConstantForce(force: Vector3, position: Vector3) {
    throw NotImplementedError("_addConstantForce is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _addConstantTorque(torque: Vector3) {
    throw NotImplementedError("_addConstantTorque is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _setConstantForce(force: Vector3) {
    throw NotImplementedError("_setConstantForce is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getConstantForce(): Vector3 {
    throw NotImplementedError("_getConstantForce is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _setConstantTorque(torque: Vector3) {
    throw NotImplementedError("_setConstantTorque is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getConstantTorque(): Vector3 {
    throw NotImplementedError("_getConstantTorque is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _setSleepState(enabled: Boolean) {
    throw NotImplementedError("_setSleepState is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _isSleeping(): Boolean {
    throw NotImplementedError("_isSleeping is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getContactCount(): Int {
    throw NotImplementedError("_getContactCount is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getContactLocalPosition(contactIdx: Int): Vector3 {
    throw NotImplementedError("_getContactLocalPosition is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getContactLocalNormal(contactIdx: Int): Vector3 {
    throw NotImplementedError("_getContactLocalNormal is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getContactImpulse(contactIdx: Int): Vector3 {
    throw NotImplementedError("_getContactImpulse is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getContactLocalShape(contactIdx: Int): Int {
    throw NotImplementedError("_getContactLocalShape is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getContactLocalVelocityAtPosition(contactIdx: Int): Vector3 {
    throw NotImplementedError("_getContactLocalVelocityAtPosition is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getContactCollider(contactIdx: Int): RID {
    throw NotImplementedError("_getContactCollider is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getContactColliderPosition(contactIdx: Int): Vector3 {
    throw NotImplementedError("_getContactColliderPosition is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getContactColliderId(contactIdx: Int): Long {
    throw NotImplementedError("_getContactColliderId is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getContactColliderObject(contactIdx: Int): Object? {
    throw NotImplementedError("_getContactColliderObject is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getContactColliderShape(contactIdx: Int): Int {
    throw NotImplementedError("_getContactColliderShape is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getContactColliderVelocityAtPosition(contactIdx: Int): Vector3 {
    throw NotImplementedError("_getContactColliderVelocityAtPosition is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getStep(): Float {
    throw NotImplementedError("_getStep is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _integrateForces() {
    throw NotImplementedError("_integrateForces is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public open fun _getSpaceState(): PhysicsDirectSpaceState3D? {
    throw NotImplementedError("_getSpaceState is not implemented for PhysicsDirectBodyState3DExtension")
  }

  public companion object

  public object MethodBindings
}
