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
import kotlin.Suppress

/**
 * This class extends [PhysicsDirectBodyState3D] by providing additional virtual methods that can be overridden. When these methods are overridden, they will be called instead of the internal methods of the physics server.
 *
 * Intended for use with GDExtension to create custom implementations of [PhysicsDirectBodyState3D].
 */
@GodotBaseType
public abstract class PhysicsDirectBodyState3DExtension : PhysicsDirectBodyState3D() {
  override fun new(scriptIndex: Int) {
    createNativeObject(464, scriptIndex)
  }

  public abstract fun _getTotalGravity(): Vector3

  public abstract fun _getTotalLinearDamp(): Float

  public abstract fun _getTotalAngularDamp(): Float

  public abstract fun _getCenterOfMass(): Vector3

  public abstract fun _getCenterOfMassLocal(): Vector3

  public abstract fun _getPrincipalInertiaAxes(): Basis

  public abstract fun _getInverseMass(): Float

  public abstract fun _getInverseInertia(): Vector3

  public abstract fun _getInverseInertiaTensor(): Basis

  public abstract fun _setLinearVelocity(velocity: Vector3)

  public abstract fun _getLinearVelocity(): Vector3

  public abstract fun _setAngularVelocity(velocity: Vector3)

  public abstract fun _getAngularVelocity(): Vector3

  public abstract fun _setTransform(transform: Transform3D)

  public abstract fun _getTransform(): Transform3D

  public abstract fun _getVelocityAtLocalPosition(localPosition: Vector3): Vector3

  public abstract fun _applyCentralImpulse(impulse: Vector3)

  public abstract fun _applyImpulse(impulse: Vector3, position: Vector3)

  public abstract fun _applyTorqueImpulse(impulse: Vector3)

  public abstract fun _applyCentralForce(force: Vector3)

  public abstract fun _applyForce(force: Vector3, position: Vector3)

  public abstract fun _applyTorque(torque: Vector3)

  public abstract fun _addConstantCentralForce(force: Vector3)

  public abstract fun _addConstantForce(force: Vector3, position: Vector3)

  public abstract fun _addConstantTorque(torque: Vector3)

  public abstract fun _setConstantForce(force: Vector3)

  public abstract fun _getConstantForce(): Vector3

  public abstract fun _setConstantTorque(torque: Vector3)

  public abstract fun _getConstantTorque(): Vector3

  public abstract fun _setSleepState(enabled: Boolean)

  public abstract fun _isSleeping(): Boolean

  public abstract fun _getContactCount(): Int

  public abstract fun _getContactLocalPosition(contactIdx: Int): Vector3

  public abstract fun _getContactLocalNormal(contactIdx: Int): Vector3

  public abstract fun _getContactImpulse(contactIdx: Int): Vector3

  public abstract fun _getContactLocalShape(contactIdx: Int): Int

  public abstract fun _getContactLocalVelocityAtPosition(contactIdx: Int): Vector3

  public abstract fun _getContactCollider(contactIdx: Int): RID

  public abstract fun _getContactColliderPosition(contactIdx: Int): Vector3

  public abstract fun _getContactColliderId(contactIdx: Int): Long

  public abstract fun _getContactColliderObject(contactIdx: Int): Object?

  public abstract fun _getContactColliderShape(contactIdx: Int): Int

  public abstract fun _getContactColliderVelocityAtPosition(contactIdx: Int): Vector3

  public abstract fun _getStep(): Float

  public abstract fun _integrateForces()

  public abstract fun _getSpaceState(): PhysicsDirectSpaceState3D?

  public companion object

  public object MethodBindings
}
