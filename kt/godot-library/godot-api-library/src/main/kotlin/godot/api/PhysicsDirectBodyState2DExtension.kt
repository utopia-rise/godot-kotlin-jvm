// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Transform2D
import godot.core.Vector2
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
 *
 * Intended for use with GDExtension to create custom implementations of [PhysicsDirectBodyState2D].
 */
@GodotBaseType
public open class PhysicsDirectBodyState2DExtension : PhysicsDirectBodyState2D() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(462, scriptIndex)
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.totalGravity] and its
   * respective getter.
   */
  public open fun _getTotalGravity(): Vector2 {
    throw NotImplementedError("_getTotalGravity is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.totalLinearDamp] and its
   * respective getter.
   */
  public open fun _getTotalLinearDamp(): Float {
    throw NotImplementedError("_getTotalLinearDamp is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.totalAngularDamp] and its
   * respective getter.
   */
  public open fun _getTotalAngularDamp(): Float {
    throw NotImplementedError("_getTotalAngularDamp is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.centerOfMass] and its
   * respective getter.
   */
  public open fun _getCenterOfMass(): Vector2 {
    throw NotImplementedError("_getCenterOfMass is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.centerOfMassLocal] and its
   * respective getter.
   */
  public open fun _getCenterOfMassLocal(): Vector2 {
    throw NotImplementedError("_getCenterOfMassLocal is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.inverseMass] and its respective
   * getter.
   */
  public open fun _getInverseMass(): Float {
    throw NotImplementedError("_getInverseMass is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.inverseInertia] and its
   * respective getter.
   */
  public open fun _getInverseInertia(): Float {
    throw NotImplementedError("_getInverseInertia is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.linearVelocity] and its
   * respective setter.
   */
  public open fun _setLinearVelocity(velocity: Vector2): Unit {
    throw NotImplementedError("_setLinearVelocity is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.linearVelocity] and its
   * respective getter.
   */
  public open fun _getLinearVelocity(): Vector2 {
    throw NotImplementedError("_getLinearVelocity is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.angularVelocity] and its
   * respective setter.
   */
  public open fun _setAngularVelocity(velocity: Float): Unit {
    throw NotImplementedError("_setAngularVelocity is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.angularVelocity] and its
   * respective getter.
   */
  public open fun _getAngularVelocity(): Float {
    throw NotImplementedError("_getAngularVelocity is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.transform] and its respective
   * setter.
   */
  public open fun _setTransform(transform: Transform2D): Unit {
    throw NotImplementedError("_setTransform is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.transform] and its respective
   * getter.
   */
  public open fun _getTransform(): Transform2D {
    throw NotImplementedError("_getTransform is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getVelocityAtLocalPosition].
   */
  public open fun _getVelocityAtLocalPosition(localPosition: Vector2): Vector2 {
    throw NotImplementedError("_getVelocityAtLocalPosition is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyCentralImpulse].
   */
  public open fun _applyCentralImpulse(impulse: Vector2): Unit {
    throw NotImplementedError("_applyCentralImpulse is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyImpulse].
   */
  public open fun _applyImpulse(impulse: Vector2, position: Vector2): Unit {
    throw NotImplementedError("_applyImpulse is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyTorqueImpulse].
   */
  public open fun _applyTorqueImpulse(impulse: Float): Unit {
    throw NotImplementedError("_applyTorqueImpulse is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyCentralForce].
   */
  public open fun _applyCentralForce(force: Vector2): Unit {
    throw NotImplementedError("_applyCentralForce is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyForce].
   */
  public open fun _applyForce(force: Vector2, position: Vector2): Unit {
    throw NotImplementedError("_applyForce is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyTorque].
   */
  public open fun _applyTorque(torque: Float): Unit {
    throw NotImplementedError("_applyTorque is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.addConstantCentralForce].
   */
  public open fun _addConstantCentralForce(force: Vector2): Unit {
    throw NotImplementedError("_addConstantCentralForce is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.addConstantForce].
   */
  public open fun _addConstantForce(force: Vector2, position: Vector2): Unit {
    throw NotImplementedError("_addConstantForce is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.addConstantTorque].
   */
  public open fun _addConstantTorque(torque: Float): Unit {
    throw NotImplementedError("_addConstantTorque is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.setConstantForce].
   */
  public open fun _setConstantForce(force: Vector2): Unit {
    throw NotImplementedError("_setConstantForce is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getConstantForce].
   */
  public open fun _getConstantForce(): Vector2 {
    throw NotImplementedError("_getConstantForce is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.setConstantTorque].
   */
  public open fun _setConstantTorque(torque: Float): Unit {
    throw NotImplementedError("_setConstantTorque is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getConstantTorque].
   */
  public open fun _getConstantTorque(): Float {
    throw NotImplementedError("_getConstantTorque is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.sleeping] and its respective
   * setter.
   */
  public open fun _setSleepState(enabled: Boolean): Unit {
    throw NotImplementedError("_setSleepState is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.sleeping] and its respective
   * getter.
   */
  public open fun _isSleeping(): Boolean {
    throw NotImplementedError("_isSleeping is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactCount].
   */
  public open fun _getContactCount(): Int {
    throw NotImplementedError("_getContactCount is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactLocalPosition].
   */
  public open fun _getContactLocalPosition(contactIdx: Int): Vector2 {
    throw NotImplementedError("_getContactLocalPosition is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactLocalNormal].
   */
  public open fun _getContactLocalNormal(contactIdx: Int): Vector2 {
    throw NotImplementedError("_getContactLocalNormal is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactLocalShape].
   */
  public open fun _getContactLocalShape(contactIdx: Int): Int {
    throw NotImplementedError("_getContactLocalShape is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactLocalVelocityAtPosition].
   */
  public open fun _getContactLocalVelocityAtPosition(contactIdx: Int): Vector2 {
    throw NotImplementedError("_getContactLocalVelocityAtPosition is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactCollider].
   */
  public open fun _getContactCollider(contactIdx: Int): RID {
    throw NotImplementedError("_getContactCollider is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderPosition].
   */
  public open fun _getContactColliderPosition(contactIdx: Int): Vector2 {
    throw NotImplementedError("_getContactColliderPosition is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderId].
   */
  public open fun _getContactColliderId(contactIdx: Int): Long {
    throw NotImplementedError("_getContactColliderId is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderObject].
   */
  public open fun _getContactColliderObject(contactIdx: Int): Object? {
    throw NotImplementedError("_getContactColliderObject is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderShape].
   */
  public open fun _getContactColliderShape(contactIdx: Int): Int {
    throw NotImplementedError("_getContactColliderShape is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderVelocityAtPosition].
   */
  public open fun _getContactColliderVelocityAtPosition(contactIdx: Int): Vector2 {
    throw NotImplementedError("_getContactColliderVelocityAtPosition is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactImpulse].
   */
  public open fun _getContactImpulse(contactIdx: Int): Vector2 {
    throw NotImplementedError("_getContactImpulse is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.step] and its respective
   * getter.
   */
  public open fun _getStep(): Float {
    throw NotImplementedError("_getStep is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.integrateForces].
   */
  public open fun _integrateForces(): Unit {
    throw NotImplementedError("_integrateForces is not implemented for PhysicsDirectBodyState2DExtension")
  }

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getSpaceState].
   */
  public open fun _getSpaceState(): PhysicsDirectSpaceState2D? {
    throw NotImplementedError("_getSpaceState is not implemented for PhysicsDirectBodyState2DExtension")
  }

  public companion object

  public object MethodBindings
}
