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
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BASIS
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal4
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A 3D physics body that is moved by a physics simulation.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/675](https://godotengine.org/asset-library/asset/675)
 *
 * [godot.RigidBody3D] implements full 3D physics. It cannot be controlled directly, instead, you must apply forces to it (gravity, impulses, etc.), and the physics simulation will calculate the resulting movement, rotation, react to collisions, and affect other physics bodies in its path.
 *
 * The body's behavior can be adjusted via [lockRotation], [freeze], and [freezeMode]. By changing various properties of the object, such as [mass], you can control how the physics simulation acts on it.
 *
 * A rigid body will always maintain its shape and size, even when forces are applied to it. It is useful for objects that can be interacted with in an environment, such as a tree that can be knocked over or a stack of crates that can be pushed around.
 *
 * If you need to override the default physics behavior, you can write a custom force integration function. See [customIntegrator].
 *
 * **Note:** Changing the 3D transform or [linearVelocity] of a [godot.RigidBody3D] very often may lead to some unpredictable behaviors. If you need to directly affect the body, prefer [_integrateForces] as it allows you to directly access the physics state.
 */
@GodotBaseType
public open class RigidBody3D : PhysicsBody3D() {
  /**
   * Emitted when one of this RigidBody3D's [godot.Shape3D]s collides with another [godot.PhysicsBody3D] or [godot.GridMap]'s [godot.Shape3D]s. Requires [contactMonitor] to be set to `true` and [maxContactsReported] to be set high enough to detect all the collisions. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape3D]s.
   *
   * [bodyRid] the [RID] of the other [godot.PhysicsBody3D] or [godot.MeshLibrary]'s [godot.CollisionObject3D] used by the [godot.PhysicsServer3D].
   *
   * [body] the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody3D] or [godot.GridMap].
   *
   * [bodyShapeIndex] the index of the [godot.Shape3D] of the other [godot.PhysicsBody3D] or [godot.GridMap] used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `body.shape_owner_get_owner(body.shape_find_owner(body_shape_index))`.
   *
   * [localShapeIndex] the index of the [godot.Shape3D] of this RigidBody3D used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `self.shape_owner_get_owner(self.shape_find_owner(local_shape_index))`.
   */
  public val bodyShapeEntered: Signal4<RID, Node, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  /**
   * Emitted when the collision between one of this RigidBody3D's [godot.Shape3D]s and another [godot.PhysicsBody3D] or [godot.GridMap]'s [godot.Shape3D]s ends. Requires [contactMonitor] to be set to `true` and [maxContactsReported] to be set high enough to detect all the collisions. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape3D]s.
   *
   * [bodyRid] the [RID] of the other [godot.PhysicsBody3D] or [godot.MeshLibrary]'s [godot.CollisionObject3D] used by the [godot.PhysicsServer3D]. [godot.GridMap]s are detected if the Meshes have [godot.Shape3D]s.
   *
   * [body] the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody3D] or [godot.GridMap].
   *
   * [bodyShapeIndex] the index of the [godot.Shape3D] of the other [godot.PhysicsBody3D] or [godot.GridMap] used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `body.shape_owner_get_owner(body.shape_find_owner(body_shape_index))`.
   *
   * [localShapeIndex] the index of the [godot.Shape3D] of this RigidBody3D used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `self.shape_owner_get_owner(self.shape_find_owner(local_shape_index))`.
   */
  public val bodyShapeExited: Signal4<RID, Node, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  /**
   * Emitted when a collision with another [godot.PhysicsBody3D] or [godot.GridMap] occurs. Requires [contactMonitor] to be set to `true` and [maxContactsReported] to be set high enough to detect all the collisions. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape3D]s.
   *
   * [body] the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody3D] or [godot.GridMap].
   */
  public val bodyEntered: Signal1<Node> by signal("body")

  /**
   * Emitted when the collision with another [godot.PhysicsBody3D] or [godot.GridMap] ends. Requires [contactMonitor] to be set to `true` and [maxContactsReported] to be set high enough to detect all the collisions. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape3D]s.
   *
   * [body] the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody3D] or [godot.GridMap].
   */
  public val bodyExited: Signal1<Node> by signal("body")

  /**
   * Emitted when the physics engine changes the body's sleeping state.
   *
   * **Note:** Changing the value [sleeping] will not trigger this signal. It is only emitted if the sleeping state is changed by the physics engine or `emit_signal("sleeping_state_changed")` is used.
   */
  public val sleepingStateChanged: Signal0 by signal()

  /**
   * The body's mass.
   */
  public var mass: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMassPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMassPtr, NIL)
    }

  /**
   * The physics material override for the body.
   *
   * If a material is assigned to this property, it will be used instead of any other physics material, such as an inherited one.
   */
  public var physicsMaterialOverride: PhysicsMaterial?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsMaterialOverridePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsMaterialOverridePtr, NIL)
    }

  /**
   * This is multiplied by the global 3D gravity setting found in **Project > Project Settings > Physics > 3d** to produce RigidBody3D's gravity. For example, a value of 1 will be normal gravity, 2 will apply double gravity, and 0.5 will apply half gravity to this object.
   */
  public var gravityScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityScalePtr, NIL)
    }

  /**
   * Defines the way the body's center of mass is set. See [enum CenterOfMassMode] for possible values.
   */
  public var centerOfMassMode: CenterOfMassMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCenterOfMassModePtr, LONG)
      return RigidBody3D.CenterOfMassMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCenterOfMassModePtr, NIL)
    }

  /**
   * The body's custom center of mass, relative to the body's origin position, when [centerOfMassMode] is set to [CENTER_OF_MASS_MODE_CUSTOM]. This is the balanced point of the body, where applied forces only cause linear acceleration. Applying forces outside of the center of mass causes angular acceleration.
   *
   * When [centerOfMassMode] is set to [CENTER_OF_MASS_MODE_AUTO] (default value), the center of mass is automatically computed.
   */
  @CoreTypeLocalCopy
  public var centerOfMass: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCenterOfMassPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCenterOfMassPtr, NIL)
    }

  /**
   * The body's moment of inertia. This is like mass, but for rotation: it determines how much torque it takes to rotate the body on each axis. The moment of inertia is usually computed automatically from the mass and the shapes, but this property allows you to set a custom value.
   *
   * If set to [godot.Vector3.ZERO], inertia is automatically computed (default value).
   *
   * **Note:** This value does not change when inertia is automatically computed. Use [godot.PhysicsServer3D] to get the computed inertia.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * @onready var ball = $Ball
   *
   *
   *
   * func get_ball_inertia():
   *
   *     return PhysicsServer3D.body_get_direct_state(ball.get_rid()).inverse_inertia.inverse()
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * private RigidBody3D _ball;
   *
   *
   *
   * public override void _Ready()
   *
   * {
   *
   *     _ball = GetNode<RigidBody3D>("Ball");
   *
   * }
   *
   *
   *
   * private Vector3 GetBallInertia()
   *
   * {
   *
   *     return PhysicsServer3D.BodyGetDirectState(_ball.GetRid()).InverseInertia.Inverse();
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  @CoreTypeLocalCopy
  public var inertia: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInertiaPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInertiaPtr, NIL)
    }

  /**
   * If `true`, the body will not move and will not calculate forces until woken up by another body through, for example, a collision, or by using the [applyImpulse] or [applyForce] methods.
   */
  public var sleeping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSleepingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSleepingPtr, NIL)
    }

  /**
   * If `true`, the body can enter sleep mode when there is no movement. See [sleeping].
   */
  public var canSleep: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAbleToSleepPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCanSleepPtr, NIL)
    }

  /**
   * If `true`, the body cannot rotate. Gravity and forces only apply linear movement.
   */
  public var lockRotation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLockRotationEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLockRotationEnabledPtr, NIL)
    }

  /**
   * If `true`, the body is frozen. Gravity and forces are not applied anymore.
   *
   * See [freezeMode] to set the body's behavior when frozen.
   *
   * For a body that is always frozen, use [godot.StaticBody3D] or [godot.AnimatableBody3D] instead.
   */
  public var freeze: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFreezeEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFreezeEnabledPtr, NIL)
    }

  /**
   * The body's freeze mode. Can be used to set the body's behavior when [freeze] is enabled. See [enum FreezeMode] for possible values.
   *
   * For a body that is always frozen, use [godot.StaticBody3D] or [godot.AnimatableBody3D] instead.
   */
  public var freezeMode: FreezeMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFreezeModePtr, LONG)
      return RigidBody3D.FreezeMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFreezeModePtr, NIL)
    }

  /**
   * If `true`, internal force integration will be disabled (like gravity or air friction) for this body. Other than collision response, the body will only move as determined by the [_integrateForces] function, if defined.
   */
  public var customIntegrator: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingCustomIntegratorPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseCustomIntegratorPtr, NIL)
    }

  /**
   * If `true`, continuous collision detection is used.
   *
   * Continuous collision detection tries to predict where a moving body will collide, instead of moving it and correcting its movement if it collided. Continuous collision detection is more precise, and misses fewer impacts by small, fast-moving objects. Not using continuous collision detection is faster to compute, but can miss small, fast-moving objects.
   */
  public var continuousCd: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingContinuousCollisionDetectionPtr,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseContinuousCollisionDetectionPtr, NIL)
    }

  /**
   * The maximum number of contacts that will be recorded. Requires a value greater than 0 and [contactMonitor] to be set to `true` to start to register contacts. Use [getContactCount] to retrieve the count or [getCollidingBodies] to retrieve bodies that have been collided with.
   *
   * **Note:** The number of contacts is different from the number of collisions. Collisions between parallel edges will result in two contacts (one at each end), and collisions between parallel faces will result in four contacts (one at each corner).
   */
  public var maxContactsReported: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxContactsReportedPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxContactsReportedPtr, NIL)
    }

  /**
   * If `true`, the RigidBody3D will emit signals when it collides with another body.
   *
   * **Note:** By default the maximum contacts reported is set to 0, meaning nothing will be recorded, see [maxContactsReported].
   */
  public var contactMonitor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isContactMonitorEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setContactMonitorPtr, NIL)
    }

  /**
   * The body's linear velocity in units per second. Can be used sporadically, but **don't set this every frame**, because physics may run in another thread and runs at a different granularity. Use [_integrateForces] as your process loop for precise control of the body state.
   */
  @CoreTypeLocalCopy
  public var linearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearVelocityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearVelocityPtr, NIL)
    }

  /**
   * Defines how [linearDamp] is applied. See [enum DampMode] for possible values.
   */
  public var linearDampMode: DampMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampModePtr, LONG)
      return RigidBody3D.DampMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearDampModePtr, NIL)
    }

  /**
   * Damps the body's movement. By default, the body will use the **Default Linear Damp** in **Project > Project Settings > Physics > 3d** or any value override set by an [godot.Area3D] the body is in. Depending on [linearDampMode], you can set [linearDamp] to be added to or to replace the body's damping value.
   *
   * See [godot.ProjectSettings.physics/3d/defaultLinearDamp] for more details about damping.
   */
  public var linearDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearDampPtr, NIL)
    }

  /**
   * The RigidBody3D's rotational velocity in *radians* per second.
   */
  @CoreTypeLocalCopy
  public var angularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularVelocityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularVelocityPtr, NIL)
    }

  /**
   * Defines how [angularDamp] is applied. See [enum DampMode] for possible values.
   */
  public var angularDampMode: DampMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampModePtr, LONG)
      return RigidBody3D.DampMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularDampModePtr, NIL)
    }

  /**
   * Damps the body's rotation. By default, the body will use the **Default Angular Damp** in **Project > Project Settings > Physics > 3d** or any value override set by an [godot.Area3D] the body is in. Depending on [angularDampMode], you can set [angularDamp] to be added to or to replace the body's damping value.
   *
   * See [godot.ProjectSettings.physics/3d/defaultAngularDamp] for more details about damping.
   */
  public var angularDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularDampPtr, NIL)
    }

  /**
   * The body's total constant positional forces applied during each physics update.
   *
   * See [addConstantForce] and [addConstantCentralForce].
   */
  @CoreTypeLocalCopy
  public var constantForce: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantForcePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantForcePtr, NIL)
    }

  /**
   * The body's total constant rotational forces applied during each physics update.
   *
   * See [addConstantTorque].
   */
  @CoreTypeLocalCopy
  public var constantTorque: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantTorquePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantTorquePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RIGIDBODY3D, scriptIndex)
    return true
  }

  /**
   * The body's custom center of mass, relative to the body's origin position, when [centerOfMassMode] is set to [CENTER_OF_MASS_MODE_CUSTOM]. This is the balanced point of the body, where applied forces only cause linear acceleration. Applying forces outside of the center of mass causes angular acceleration.
   *
   * When [centerOfMassMode] is set to [CENTER_OF_MASS_MODE_AUTO] (default value), the center of mass is automatically computed.
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
   * val myCoreType = rigidbody3d.centerOfMass
   * //Your changes
   * rigidbody3d.centerOfMass = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun centerOfMassMutate(block: Vector3.() -> Unit): Vector3 = centerOfMass.apply{
      block(this)
      centerOfMass = this
  }


  /**
   * The body's moment of inertia. This is like mass, but for rotation: it determines how much torque it takes to rotate the body on each axis. The moment of inertia is usually computed automatically from the mass and the shapes, but this property allows you to set a custom value.
   *
   * If set to [godot.Vector3.ZERO], inertia is automatically computed (default value).
   *
   * **Note:** This value does not change when inertia is automatically computed. Use [godot.PhysicsServer3D] to get the computed inertia.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * @onready var ball = $Ball
   *
   *
   *
   * func get_ball_inertia():
   *
   *     return PhysicsServer3D.body_get_direct_state(ball.get_rid()).inverse_inertia.inverse()
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * private RigidBody3D _ball;
   *
   *
   *
   * public override void _Ready()
   *
   * {
   *
   *     _ball = GetNode<RigidBody3D>("Ball");
   *
   * }
   *
   *
   *
   * private Vector3 GetBallInertia()
   *
   * {
   *
   *     return PhysicsServer3D.BodyGetDirectState(_ball.GetRid()).InverseInertia.Inverse();
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
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
   * val myCoreType = rigidbody3d.inertia
   * //Your changes
   * rigidbody3d.inertia = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun inertiaMutate(block: Vector3.() -> Unit): Vector3 = inertia.apply{
      block(this)
      inertia = this
  }


  /**
   * The body's linear velocity in units per second. Can be used sporadically, but **don't set this every frame**, because physics may run in another thread and runs at a different granularity. Use [_integrateForces] as your process loop for precise control of the body state.
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
   * val myCoreType = rigidbody3d.linearVelocity
   * //Your changes
   * rigidbody3d.linearVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun linearVelocityMutate(block: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
      block(this)
      linearVelocity = this
  }


  /**
   * The RigidBody3D's rotational velocity in *radians* per second.
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
   * val myCoreType = rigidbody3d.angularVelocity
   * //Your changes
   * rigidbody3d.angularVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun angularVelocityMutate(block: Vector3.() -> Unit): Vector3 = angularVelocity.apply{
      block(this)
      angularVelocity = this
  }


  /**
   * The body's total constant positional forces applied during each physics update.
   *
   * See [addConstantForce] and [addConstantCentralForce].
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
   * val myCoreType = rigidbody3d.constantForce
   * //Your changes
   * rigidbody3d.constantForce = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun constantForceMutate(block: Vector3.() -> Unit): Vector3 = constantForce.apply{
      block(this)
      constantForce = this
  }


  /**
   * The body's total constant rotational forces applied during each physics update.
   *
   * See [addConstantTorque].
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
   * val myCoreType = rigidbody3d.constantTorque
   * //Your changes
   * rigidbody3d.constantTorque = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun constantTorqueMutate(block: Vector3.() -> Unit): Vector3 = constantTorque.apply{
      block(this)
      constantTorque = this
  }


  /**
   * Called during physics processing, allowing you to read and safely modify the simulation state for the object. By default, it works in addition to the usual physics behavior, but the [customIntegrator] property allows you to disable the default behavior and do fully custom force integration for a body.
   */
  public open fun _integrateForces(state: PhysicsDirectBodyState3D): Unit {
  }

  /**
   * Returns the inverse inertia tensor basis. This is used to calculate the angular acceleration resulting from a torque applied to the [godot.RigidBody3D].
   */
  public fun getInverseInertiaTensor(): Basis {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInverseInertiaTensorPtr, BASIS)
    return (TransferContext.readReturnValue(BASIS, false) as Basis)
  }

  /**
   * Returns the number of contacts this body has with other bodies. By default, this returns 0 unless bodies are configured to monitor contacts (see [contactMonitor]).
   *
   * **Note:** To retrieve the colliding bodies, use [getCollidingBodies].
   */
  public fun getContactCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getContactCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets an axis velocity. The velocity in the given vector axis will be set as the given vector length. This is useful for jumping behavior.
   */
  public fun setAxisVelocity(axisVelocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to axisVelocity)
    TransferContext.callMethod(rawPtr, MethodBindings.setAxisVelocityPtr, NIL)
  }

  /**
   * Applies a directional impulse without affecting rotation.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * This is equivalent to using [applyImpulse] at the body's center of mass.
   */
  public fun applyCentralImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.applyCentralImpulsePtr, NIL)
  }

  /**
   * Applies a positioned impulse to the body.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public fun applyImpulse(impulse: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.applyImpulsePtr, NIL)
  }

  /**
   * Applies a rotational impulse to the body without affecting the position.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * **Note:** [inertia] is required for this to work. To have [inertia], an active [godot.CollisionShape3D] must be a child of the node, or you can manually set [inertia].
   */
  public fun applyTorqueImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.applyTorqueImpulsePtr, NIL)
  }

  /**
   * Applies a directional force without affecting rotation. A force is time dependent and meant to be applied every physics update.
   *
   * This is equivalent to using [applyForce] at the body's center of mass.
   */
  public fun applyCentralForce(force: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.applyCentralForcePtr, NIL)
  }

  /**
   * Applies a positioned force to the body. A force is time dependent and meant to be applied every physics update.
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public fun applyForce(force: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.applyForcePtr, NIL)
  }

  /**
   * Applies a rotational force without affecting position. A force is time dependent and meant to be applied every physics update.
   *
   * **Note:** [inertia] is required for this to work. To have [inertia], an active [godot.CollisionShape3D] must be a child of the node, or you can manually set [inertia].
   */
  public fun applyTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, MethodBindings.applyTorquePtr, NIL)
  }

  /**
   * Adds a constant directional force without affecting rotation that keeps being applied over time until cleared with `constant_force = Vector3(0, 0, 0)`.
   *
   * This is equivalent to using [addConstantForce] at the body's center of mass.
   */
  public fun addConstantCentralForce(force: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.addConstantCentralForcePtr, NIL)
  }

  /**
   * Adds a constant positioned force to the body that keeps being applied over time until cleared with `constant_force = Vector3(0, 0, 0)`.
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public fun addConstantForce(force: Vector3, position: Vector3 = Vector3(0, 0, 0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.addConstantForcePtr, NIL)
  }

  /**
   * Adds a constant rotational force without affecting position that keeps being applied over time until cleared with `constant_torque = Vector3(0, 0, 0)`.
   */
  public fun addConstantTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, MethodBindings.addConstantTorquePtr, NIL)
  }

  /**
   * Returns a list of the bodies colliding with this one. Requires [contactMonitor] to be set to `true` and [maxContactsReported] to be set high enough to detect all the collisions.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, list of collisions is updated once per frame and before the physics step. Consider using signals instead.
   */
  public fun getCollidingBodies(): VariantArray<Node3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollidingBodiesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node3D>)
  }

  public enum class FreezeMode(
    id: Long,
  ) {
    /**
     * Static body freeze mode (default). The body is not affected by gravity and forces. It can be only moved by user code and doesn't collide with other bodies along its path.
     */
    FREEZE_MODE_STATIC(0),
    /**
     * Kinematic body freeze mode. Similar to [FREEZE_MODE_STATIC], but collides with other bodies along its path when moved. Useful for a frozen body that needs to be animated.
     */
    FREEZE_MODE_KINEMATIC(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CenterOfMassMode(
    id: Long,
  ) {
    /**
     * In this mode, the body's center of mass is calculated automatically based on its shapes. This assumes that the shapes' origins are also their center of mass.
     */
    CENTER_OF_MASS_MODE_AUTO(0),
    /**
     * In this mode, the body's center of mass is set through [centerOfMass]. Defaults to the body's origin position.
     */
    CENTER_OF_MASS_MODE_CUSTOM(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DampMode(
    id: Long,
  ) {
    /**
     * In this mode, the body's damping value is added to any value set in areas or the default value.
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _integrateForcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "_integrate_forces")

    public val setMassPtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody3D", "set_mass")

    public val getMassPtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody3D", "get_mass")

    public val setInertiaPtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody3D", "set_inertia")

    public val getInertiaPtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody3D", "get_inertia")

    public val setCenterOfMassModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_center_of_mass_mode")

    public val getCenterOfMassModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_center_of_mass_mode")

    public val setCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_center_of_mass")

    public val getCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_center_of_mass")

    public val setPhysicsMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_physics_material_override")

    public val getPhysicsMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_physics_material_override")

    public val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_linear_velocity")

    public val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_linear_velocity")

    public val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_angular_velocity")

    public val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_angular_velocity")

    public val getInverseInertiaTensorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_inverse_inertia_tensor")

    public val setGravityScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_gravity_scale")

    public val getGravityScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_gravity_scale")

    public val setLinearDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_linear_damp_mode")

    public val getLinearDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_linear_damp_mode")

    public val setAngularDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_angular_damp_mode")

    public val getAngularDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_angular_damp_mode")

    public val setLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_linear_damp")

    public val getLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_linear_damp")

    public val setAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_angular_damp")

    public val getAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_angular_damp")

    public val setMaxContactsReportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_max_contacts_reported")

    public val getMaxContactsReportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_max_contacts_reported")

    public val getContactCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_contact_count")

    public val setUseCustomIntegratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_use_custom_integrator")

    public val isUsingCustomIntegratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "is_using_custom_integrator")

    public val setContactMonitorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_contact_monitor")

    public val isContactMonitorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "is_contact_monitor_enabled")

    public val setUseContinuousCollisionDetectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_use_continuous_collision_detection")

    public val isUsingContinuousCollisionDetectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "is_using_continuous_collision_detection")

    public val setAxisVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_axis_velocity")

    public val applyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "apply_central_impulse")

    public val applyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "apply_impulse")

    public val applyTorqueImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "apply_torque_impulse")

    public val applyCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "apply_central_force")

    public val applyForcePtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody3D", "apply_force")

    public val applyTorquePtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody3D", "apply_torque")

    public val addConstantCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "add_constant_central_force")

    public val addConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "add_constant_force")

    public val addConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "add_constant_torque")

    public val setConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_constant_force")

    public val getConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_constant_force")

    public val setConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_constant_torque")

    public val getConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_constant_torque")

    public val setSleepingPtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody3D", "set_sleeping")

    public val isSleepingPtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody3D", "is_sleeping")

    public val setCanSleepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_can_sleep")

    public val isAbleToSleepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "is_able_to_sleep")

    public val setLockRotationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_lock_rotation_enabled")

    public val isLockRotationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "is_lock_rotation_enabled")

    public val setFreezeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_freeze_enabled")

    public val isFreezeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "is_freeze_enabled")

    public val setFreezeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_freeze_mode")

    public val getFreezeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_freeze_mode")

    public val getCollidingBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_colliding_bodies")
  }
}
