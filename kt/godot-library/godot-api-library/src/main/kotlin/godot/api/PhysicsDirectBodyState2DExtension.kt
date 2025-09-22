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
public abstract class PhysicsDirectBodyState2DExtension : PhysicsDirectBodyState2D() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(478, scriptIndex)
  }

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.totalGravity] and its
   * respective getter.
   */
  public abstract fun _getTotalGravity(): Vector2

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.totalLinearDamp] and its
   * respective getter.
   */
  public abstract fun _getTotalLinearDamp(): Float

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.totalAngularDamp] and its
   * respective getter.
   */
  public abstract fun _getTotalAngularDamp(): Float

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.centerOfMass] and its
   * respective getter.
   */
  public abstract fun _getCenterOfMass(): Vector2

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.centerOfMassLocal] and its
   * respective getter.
   */
  public abstract fun _getCenterOfMassLocal(): Vector2

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.inverseMass] and its respective
   * getter.
   */
  public abstract fun _getInverseMass(): Float

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.inverseInertia] and its
   * respective getter.
   */
  public abstract fun _getInverseInertia(): Float

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.linearVelocity] and its
   * respective setter.
   */
  public abstract fun _setLinearVelocity(velocity: Vector2): Unit

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.linearVelocity] and its
   * respective getter.
   */
  public abstract fun _getLinearVelocity(): Vector2

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.angularVelocity] and its
   * respective setter.
   */
  public abstract fun _setAngularVelocity(velocity: Float): Unit

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.angularVelocity] and its
   * respective getter.
   */
  public abstract fun _getAngularVelocity(): Float

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.transform] and its respective
   * setter.
   */
  public abstract fun _setTransform(transform: Transform2D): Unit

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.transform] and its respective
   * getter.
   */
  public abstract fun _getTransform(): Transform2D

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getVelocityAtLocalPosition].
   */
  public abstract fun _getVelocityAtLocalPosition(localPosition: Vector2): Vector2

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyCentralImpulse].
   */
  public abstract fun _applyCentralImpulse(impulse: Vector2): Unit

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyImpulse].
   */
  public abstract fun _applyImpulse(impulse: Vector2, position: Vector2): Unit

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyTorqueImpulse].
   */
  public abstract fun _applyTorqueImpulse(impulse: Float): Unit

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyCentralForce].
   */
  public abstract fun _applyCentralForce(force: Vector2): Unit

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyForce].
   */
  public abstract fun _applyForce(force: Vector2, position: Vector2): Unit

  /**
   * Overridable version of [PhysicsDirectBodyState2D.applyTorque].
   */
  public abstract fun _applyTorque(torque: Float): Unit

  /**
   * Overridable version of [PhysicsDirectBodyState2D.addConstantCentralForce].
   */
  public abstract fun _addConstantCentralForce(force: Vector2): Unit

  /**
   * Overridable version of [PhysicsDirectBodyState2D.addConstantForce].
   */
  public abstract fun _addConstantForce(force: Vector2, position: Vector2): Unit

  /**
   * Overridable version of [PhysicsDirectBodyState2D.addConstantTorque].
   */
  public abstract fun _addConstantTorque(torque: Float): Unit

  /**
   * Overridable version of [PhysicsDirectBodyState2D.setConstantForce].
   */
  public abstract fun _setConstantForce(force: Vector2): Unit

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getConstantForce].
   */
  public abstract fun _getConstantForce(): Vector2

  /**
   * Overridable version of [PhysicsDirectBodyState2D.setConstantTorque].
   */
  public abstract fun _setConstantTorque(torque: Float): Unit

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getConstantTorque].
   */
  public abstract fun _getConstantTorque(): Float

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.sleeping] and its respective
   * setter.
   */
  public abstract fun _setSleepState(enabled: Boolean): Unit

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.sleeping] and its respective
   * getter.
   */
  public abstract fun _isSleeping(): Boolean

  public abstract fun _setCollisionLayer(layer: Long): Unit

  public abstract fun _getCollisionLayer(): Long

  public abstract fun _setCollisionMask(mask: Long): Unit

  public abstract fun _getCollisionMask(): Long

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactCount].
   */
  public abstract fun _getContactCount(): Int

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactLocalPosition].
   */
  public abstract fun _getContactLocalPosition(contactIdx: Int): Vector2

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactLocalNormal].
   */
  public abstract fun _getContactLocalNormal(contactIdx: Int): Vector2

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactLocalShape].
   */
  public abstract fun _getContactLocalShape(contactIdx: Int): Int

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactLocalVelocityAtPosition].
   */
  public abstract fun _getContactLocalVelocityAtPosition(contactIdx: Int): Vector2

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactCollider].
   */
  public abstract fun _getContactCollider(contactIdx: Int): RID

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderPosition].
   */
  public abstract fun _getContactColliderPosition(contactIdx: Int): Vector2

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderId].
   */
  public abstract fun _getContactColliderId(contactIdx: Int): Long

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderObject].
   */
  public abstract fun _getContactColliderObject(contactIdx: Int): Object?

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderShape].
   */
  public abstract fun _getContactColliderShape(contactIdx: Int): Int

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactColliderVelocityAtPosition].
   */
  public abstract fun _getContactColliderVelocityAtPosition(contactIdx: Int): Vector2

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getContactImpulse].
   */
  public abstract fun _getContactImpulse(contactIdx: Int): Vector2

  /**
   * Implement to override the behavior of [PhysicsDirectBodyState2D.step] and its respective
   * getter.
   */
  public abstract fun _getStep(): Float

  /**
   * Overridable version of [PhysicsDirectBodyState2D.integrateForces].
   */
  public abstract fun _integrateForces(): Unit

  /**
   * Overridable version of [PhysicsDirectBodyState2D.getSpaceState].
   */
  public abstract fun _getSpaceState(): PhysicsDirectSpaceState2D?

  public companion object

  public object MethodBindings
}
