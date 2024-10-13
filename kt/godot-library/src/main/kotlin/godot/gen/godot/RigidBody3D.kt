// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Basis
import godot.core.RID
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal4
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BASIS
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
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
 * [RigidBody3D] implements full 3D physics. It cannot be controlled directly, instead, you must
 * apply forces to it (gravity, impulses, etc.), and the physics simulation will calculate the
 * resulting movement, rotation, react to collisions, and affect other physics bodies in its path.
 * The body's behavior can be adjusted via [lockRotation], [freeze], and [freezeMode]. By changing
 * various properties of the object, such as [mass], you can control how the physics simulation acts on
 * it.
 * A rigid body will always maintain its shape and size, even when forces are applied to it. It is
 * useful for objects that can be interacted with in an environment, such as a tree that can be knocked
 * over or a stack of crates that can be pushed around.
 * If you need to override the default physics behavior, you can write a custom force integration
 * function. See [customIntegrator].
 * **Note:** Changing the 3D transform or [linearVelocity] of a [RigidBody3D] very often may lead to
 * some unpredictable behaviors. If you need to directly affect the body, prefer [_integrateForces] as
 * it allows you to directly access the physics state.
 */
@GodotBaseType
public open class RigidBody3D : PhysicsBody3D() {
  /**
   * Emitted when one of this RigidBody3D's [Shape3D]s collides with another [PhysicsBody3D] or
   * [GridMap]'s [Shape3D]s. Requires [contactMonitor] to be set to `true` and [maxContactsReported] to
   * be set high enough to detect all the collisions. [GridMap]s are detected if the [MeshLibrary] has
   * Collision [Shape3D]s.
   * [bodyRid] the [RID] of the other [PhysicsBody3D] or [MeshLibrary]'s [CollisionObject3D] used by
   * the [PhysicsServer3D].
   * [body] the [Node], if it exists in the tree, of the other [PhysicsBody3D] or [GridMap].
   * [bodyShapeIndex] the index of the [Shape3D] of the other [PhysicsBody3D] or [GridMap] used by
   * the [PhysicsServer3D]. Get the [CollisionShape3D] node with
   * `body.shape_owner_get_owner(body.shape_find_owner(body_shape_index))`.
   * [localShapeIndex] the index of the [Shape3D] of this RigidBody3D used by the [PhysicsServer3D].
   * Get the [CollisionShape3D] node with
   * `self.shape_owner_get_owner(self.shape_find_owner(local_shape_index))`.
   */
  public val bodyShapeEntered: Signal4<RID, Node, Long, Long> by Signal4

  /**
   * Emitted when the collision between one of this RigidBody3D's [Shape3D]s and another
   * [PhysicsBody3D] or [GridMap]'s [Shape3D]s ends. Requires [contactMonitor] to be set to `true` and
   * [maxContactsReported] to be set high enough to detect all the collisions. [GridMap]s are detected
   * if the [MeshLibrary] has Collision [Shape3D]s.
   * [bodyRid] the [RID] of the other [PhysicsBody3D] or [MeshLibrary]'s [CollisionObject3D] used by
   * the [PhysicsServer3D]. [GridMap]s are detected if the Meshes have [Shape3D]s.
   * [body] the [Node], if it exists in the tree, of the other [PhysicsBody3D] or [GridMap].
   * [bodyShapeIndex] the index of the [Shape3D] of the other [PhysicsBody3D] or [GridMap] used by
   * the [PhysicsServer3D]. Get the [CollisionShape3D] node with
   * `body.shape_owner_get_owner(body.shape_find_owner(body_shape_index))`.
   * [localShapeIndex] the index of the [Shape3D] of this RigidBody3D used by the [PhysicsServer3D].
   * Get the [CollisionShape3D] node with
   * `self.shape_owner_get_owner(self.shape_find_owner(local_shape_index))`.
   */
  public val bodyShapeExited: Signal4<RID, Node, Long, Long> by Signal4

  /**
   * Emitted when a collision with another [PhysicsBody3D] or [GridMap] occurs. Requires
   * [contactMonitor] to be set to `true` and [maxContactsReported] to be set high enough to detect all
   * the collisions. [GridMap]s are detected if the [MeshLibrary] has Collision [Shape3D]s.
   * [body] the [Node], if it exists in the tree, of the other [PhysicsBody3D] or [GridMap].
   */
  public val bodyEntered: Signal1<Node> by Signal1

  /**
   * Emitted when the collision with another [PhysicsBody3D] or [GridMap] ends. Requires
   * [contactMonitor] to be set to `true` and [maxContactsReported] to be set high enough to detect all
   * the collisions. [GridMap]s are detected if the [MeshLibrary] has Collision [Shape3D]s.
   * [body] the [Node], if it exists in the tree, of the other [PhysicsBody3D] or [GridMap].
   */
  public val bodyExited: Signal1<Node> by Signal1

  /**
   * Emitted when the physics engine changes the body's sleeping state.
   * **Note:** Changing the value [sleeping] will not trigger this signal. It is only emitted if the
   * sleeping state is changed by the physics engine or `emit_signal("sleeping_state_changed")` is
   * used.
   */
  public val sleepingStateChanged: Signal0 by Signal0

  /**
   * The body's mass.
   */
  public final inline var mass: Float
    @JvmName("massProperty")
    get() = getMass()
    @JvmName("massProperty")
    set(`value`) {
      setMass(value)
    }

  /**
   * The physics material override for the body.
   * If a material is assigned to this property, it will be used instead of any other physics
   * material, such as an inherited one.
   */
  public final inline var physicsMaterialOverride: PhysicsMaterial?
    @JvmName("physicsMaterialOverrideProperty")
    get() = getPhysicsMaterialOverride()
    @JvmName("physicsMaterialOverrideProperty")
    set(`value`) {
      setPhysicsMaterialOverride(value)
    }

  /**
   * This is multiplied by the global 3D gravity setting found in **Project > Project Settings >
   * Physics > 3d** to produce RigidBody3D's gravity. For example, a value of 1 will be normal gravity,
   * 2 will apply double gravity, and 0.5 will apply half gravity to this object.
   */
  public final inline var gravityScale: Float
    @JvmName("gravityScaleProperty")
    get() = getGravityScale()
    @JvmName("gravityScaleProperty")
    set(`value`) {
      setGravityScale(value)
    }

  /**
   * Defines the way the body's center of mass is set. See [CenterOfMassMode] for possible values.
   */
  public final inline var centerOfMassMode: CenterOfMassMode
    @JvmName("centerOfMassModeProperty")
    get() = getCenterOfMassMode()
    @JvmName("centerOfMassModeProperty")
    set(`value`) {
      setCenterOfMassMode(value)
    }

  /**
   * The body's custom center of mass, relative to the body's origin position, when
   * [centerOfMassMode] is set to [CENTER_OF_MASS_MODE_CUSTOM]. This is the balanced point of the body,
   * where applied forces only cause linear acceleration. Applying forces outside of the center of mass
   * causes angular acceleration.
   * When [centerOfMassMode] is set to [CENTER_OF_MASS_MODE_AUTO] (default value), the center of
   * mass is automatically computed.
   */
  @CoreTypeLocalCopy
  public final inline var centerOfMass: Vector3
    @JvmName("centerOfMassProperty")
    get() = getCenterOfMass()
    @JvmName("centerOfMassProperty")
    set(`value`) {
      setCenterOfMass(value)
    }

  /**
   * The body's moment of inertia. This is like mass, but for rotation: it determines how much
   * torque it takes to rotate the body on each axis. The moment of inertia is usually computed
   * automatically from the mass and the shapes, but this property allows you to set a custom value.
   * If set to [Vector3.ZERO], inertia is automatically computed (default value).
   * **Note:** This value does not change when inertia is automatically computed. Use
   * [PhysicsServer3D] to get the computed inertia.
   *
   * gdscript:
   * ```gdscript
   * @onready var ball = $Ball
   *
   * func get_ball_inertia():
   *     return PhysicsServer3D.body_get_direct_state(ball.get_rid()).inverse_inertia.inverse()
   * ```
   * csharp:
   * ```csharp
   * private RigidBody3D _ball;
   *
   * public override void _Ready()
   * {
   *     _ball = GetNode<RigidBody3D>("Ball");
   * }
   *
   * private Vector3 GetBallInertia()
   * {
   *     return PhysicsServer3D.BodyGetDirectState(_ball.GetRid()).InverseInertia.Inverse();
   * }
   * ```
   */
  @CoreTypeLocalCopy
  public final inline var inertia: Vector3
    @JvmName("inertiaProperty")
    get() = getInertia()
    @JvmName("inertiaProperty")
    set(`value`) {
      setInertia(value)
    }

  /**
   * If `true`, the body will not move and will not calculate forces until woken up by another body
   * through, for example, a collision, or by using the [applyImpulse] or [applyForce] methods.
   */
  public final inline var sleeping: Boolean
    @JvmName("sleepingProperty")
    get() = isSleeping()
    @JvmName("sleepingProperty")
    set(`value`) {
      setSleeping(value)
    }

  /**
   * If `true`, the body can enter sleep mode when there is no movement. See [sleeping].
   */
  public final inline var canSleep: Boolean
    @JvmName("canSleepProperty")
    get() = isAbleToSleep()
    @JvmName("canSleepProperty")
    set(`value`) {
      setCanSleep(value)
    }

  /**
   * If `true`, the body cannot rotate. Gravity and forces only apply linear movement.
   */
  public final inline var lockRotation: Boolean
    @JvmName("lockRotationProperty")
    get() = isLockRotationEnabled()
    @JvmName("lockRotationProperty")
    set(`value`) {
      setLockRotationEnabled(value)
    }

  /**
   * If `true`, the body is frozen. Gravity and forces are not applied anymore.
   * See [freezeMode] to set the body's behavior when frozen.
   * For a body that is always frozen, use [StaticBody3D] or [AnimatableBody3D] instead.
   */
  public final inline var freeze: Boolean
    @JvmName("freezeProperty")
    get() = isFreezeEnabled()
    @JvmName("freezeProperty")
    set(`value`) {
      setFreezeEnabled(value)
    }

  /**
   * The body's freeze mode. Can be used to set the body's behavior when [freeze] is enabled. See
   * [FreezeMode] for possible values.
   * For a body that is always frozen, use [StaticBody3D] or [AnimatableBody3D] instead.
   */
  public final inline var freezeMode: FreezeMode
    @JvmName("freezeModeProperty")
    get() = getFreezeMode()
    @JvmName("freezeModeProperty")
    set(`value`) {
      setFreezeMode(value)
    }

  /**
   * If `true`, the standard force integration (like gravity or damping) will be disabled for this
   * body. Other than collision response, the body will only move as determined by the
   * [_integrateForces] method, if that virtual method is overridden.
   * Setting this property will call the method [PhysicsServer3D.bodySetOmitForceIntegration]
   * internally.
   */
  public final inline var customIntegrator: Boolean
    @JvmName("customIntegratorProperty")
    get() = isUsingCustomIntegrator()
    @JvmName("customIntegratorProperty")
    set(`value`) {
      setUseCustomIntegrator(value)
    }

  /**
   * If `true`, continuous collision detection is used.
   * Continuous collision detection tries to predict where a moving body will collide, instead of
   * moving it and correcting its movement if it collided. Continuous collision detection is more
   * precise, and misses fewer impacts by small, fast-moving objects. Not using continuous collision
   * detection is faster to compute, but can miss small, fast-moving objects.
   */
  public final inline var continuousCd: Boolean
    @JvmName("continuousCdProperty")
    get() = isUsingContinuousCollisionDetection()
    @JvmName("continuousCdProperty")
    set(`value`) {
      setUseContinuousCollisionDetection(value)
    }

  /**
   * If `true`, the RigidBody3D will emit signals when it collides with another body.
   * **Note:** By default the maximum contacts reported is set to 0, meaning nothing will be
   * recorded, see [maxContactsReported].
   */
  public final inline var contactMonitor: Boolean
    @JvmName("contactMonitorProperty")
    get() = isContactMonitorEnabled()
    @JvmName("contactMonitorProperty")
    set(`value`) {
      setContactMonitor(value)
    }

  /**
   * The maximum number of contacts that will be recorded. Requires a value greater than 0 and
   * [contactMonitor] to be set to `true` to start to register contacts. Use [getContactCount] to
   * retrieve the count or [getCollidingBodies] to retrieve bodies that have been collided with.
   * **Note:** The number of contacts is different from the number of collisions. Collisions between
   * parallel edges will result in two contacts (one at each end), and collisions between parallel
   * faces will result in four contacts (one at each corner).
   */
  public final inline var maxContactsReported: Int
    @JvmName("maxContactsReportedProperty")
    get() = getMaxContactsReported()
    @JvmName("maxContactsReportedProperty")
    set(`value`) {
      setMaxContactsReported(value)
    }

  /**
   * The body's linear velocity in units per second. Can be used sporadically, but **don't set this
   * every frame**, because physics may run in another thread and runs at a different granularity. Use
   * [_integrateForces] as your process loop for precise control of the body state.
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
   * Defines how [linearDamp] is applied. See [DampMode] for possible values.
   */
  public final inline var linearDampMode: DampMode
    @JvmName("linearDampModeProperty")
    get() = getLinearDampMode()
    @JvmName("linearDampModeProperty")
    set(`value`) {
      setLinearDampMode(value)
    }

  /**
   * Damps the body's movement. By default, the body will use the **Default Linear Damp** in
   * **Project > Project Settings > Physics > 3d** or any value override set by an [Area3D] the body is
   * in. Depending on [linearDampMode], you can set [linearDamp] to be added to or to replace the
   * body's damping value.
   * See [ProjectSettings.physics/3d/defaultLinearDamp] for more details about damping.
   */
  public final inline var linearDamp: Float
    @JvmName("linearDampProperty")
    get() = getLinearDamp()
    @JvmName("linearDampProperty")
    set(`value`) {
      setLinearDamp(value)
    }

  /**
   * The RigidBody3D's rotational velocity in *radians* per second.
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
   * Defines how [angularDamp] is applied. See [DampMode] for possible values.
   */
  public final inline var angularDampMode: DampMode
    @JvmName("angularDampModeProperty")
    get() = getAngularDampMode()
    @JvmName("angularDampModeProperty")
    set(`value`) {
      setAngularDampMode(value)
    }

  /**
   * Damps the body's rotation. By default, the body will use the **Default Angular Damp** in
   * **Project > Project Settings > Physics > 3d** or any value override set by an [Area3D] the body is
   * in. Depending on [angularDampMode], you can set [angularDamp] to be added to or to replace the
   * body's damping value.
   * See [ProjectSettings.physics/3d/defaultAngularDamp] for more details about damping.
   */
  public final inline var angularDamp: Float
    @JvmName("angularDampProperty")
    get() = getAngularDamp()
    @JvmName("angularDampProperty")
    set(`value`) {
      setAngularDamp(value)
    }

  /**
   * The body's total constant positional forces applied during each physics update.
   * See [addConstantForce] and [addConstantCentralForce].
   */
  @CoreTypeLocalCopy
  public final inline var constantForce: Vector3
    @JvmName("constantForceProperty")
    get() = getConstantForce()
    @JvmName("constantForceProperty")
    set(`value`) {
      setConstantForce(value)
    }

  /**
   * The body's total constant rotational forces applied during each physics update.
   * See [addConstantTorque].
   */
  @CoreTypeLocalCopy
  public final inline var constantTorque: Vector3
    @JvmName("constantTorqueProperty")
    get() = getConstantTorque()
    @JvmName("constantTorqueProperty")
    set(`value`) {
      setConstantTorque(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RIGIDBODY3D, scriptIndex)
  }

  /**
   * The body's custom center of mass, relative to the body's origin position, when
   * [centerOfMassMode] is set to [CENTER_OF_MASS_MODE_CUSTOM]. This is the balanced point of the body,
   * where applied forces only cause linear acceleration. Applying forces outside of the center of mass
   * causes angular acceleration.
   * When [centerOfMassMode] is set to [CENTER_OF_MASS_MODE_AUTO] (default value), the center of
   * mass is automatically computed.
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
  public final fun centerOfMassMutate(block: Vector3.() -> Unit): Vector3 = centerOfMass.apply{
      block(this)
      centerOfMass = this
  }


  /**
   * The body's moment of inertia. This is like mass, but for rotation: it determines how much
   * torque it takes to rotate the body on each axis. The moment of inertia is usually computed
   * automatically from the mass and the shapes, but this property allows you to set a custom value.
   * If set to [Vector3.ZERO], inertia is automatically computed (default value).
   * **Note:** This value does not change when inertia is automatically computed. Use
   * [PhysicsServer3D] to get the computed inertia.
   *
   * gdscript:
   * ```gdscript
   * @onready var ball = $Ball
   *
   * func get_ball_inertia():
   *     return PhysicsServer3D.body_get_direct_state(ball.get_rid()).inverse_inertia.inverse()
   * ```
   * csharp:
   * ```csharp
   * private RigidBody3D _ball;
   *
   * public override void _Ready()
   * {
   *     _ball = GetNode<RigidBody3D>("Ball");
   * }
   *
   * private Vector3 GetBallInertia()
   * {
   *     return PhysicsServer3D.BodyGetDirectState(_ball.GetRid()).InverseInertia.Inverse();
   * }
   * ```
   *
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
  public final fun inertiaMutate(block: Vector3.() -> Unit): Vector3 = inertia.apply{
      block(this)
      inertia = this
  }


  /**
   * The body's linear velocity in units per second. Can be used sporadically, but **don't set this
   * every frame**, because physics may run in another thread and runs at a different granularity. Use
   * [_integrateForces] as your process loop for precise control of the body state.
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
  public final fun linearVelocityMutate(block: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
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
  public final fun angularVelocityMutate(block: Vector3.() -> Unit): Vector3 =
      angularVelocity.apply{
      block(this)
      angularVelocity = this
  }


  /**
   * The body's total constant positional forces applied during each physics update.
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
  public final fun constantForceMutate(block: Vector3.() -> Unit): Vector3 = constantForce.apply{
      block(this)
      constantForce = this
  }


  /**
   * The body's total constant rotational forces applied during each physics update.
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
  public final fun constantTorqueMutate(block: Vector3.() -> Unit): Vector3 = constantTorque.apply{
      block(this)
      constantTorque = this
  }


  /**
   * Called during physics processing, allowing you to read and safely modify the simulation state
   * for the object. By default, it is called before the standard force integration, but the
   * [customIntegrator] property allows you to disable the standard force integration and do fully
   * custom force integration for a body.
   */
  public open fun _integrateForces(state: PhysicsDirectBodyState3D?): Unit {
  }

  public final fun setMass(mass: Float): Unit {
    TransferContext.writeArguments(DOUBLE to mass.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMassPtr, NIL)
  }

  public final fun getMass(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMassPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setInertia(inertia: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to inertia)
    TransferContext.callMethod(ptr, MethodBindings.setInertiaPtr, NIL)
  }

  public final fun getInertia(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInertiaPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setCenterOfMassMode(mode: CenterOfMassMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setCenterOfMassModePtr, NIL)
  }

  public final fun getCenterOfMassMode(): CenterOfMassMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCenterOfMassModePtr, LONG)
    return RigidBody3D.CenterOfMassMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCenterOfMass(centerOfMass: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to centerOfMass)
    TransferContext.callMethod(ptr, MethodBindings.setCenterOfMassPtr, NIL)
  }

  public final fun getCenterOfMass(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCenterOfMassPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial?): Unit {
    TransferContext.writeArguments(OBJECT to physicsMaterialOverride)
    TransferContext.callMethod(ptr, MethodBindings.setPhysicsMaterialOverridePtr, NIL)
  }

  public final fun getPhysicsMaterialOverride(): PhysicsMaterial? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPhysicsMaterialOverridePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PhysicsMaterial?)
  }

  public final fun setLinearVelocity(linearVelocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to linearVelocity)
    TransferContext.callMethod(ptr, MethodBindings.setLinearVelocityPtr, NIL)
  }

  public final fun getLinearVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLinearVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setAngularVelocity(angularVelocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to angularVelocity)
    TransferContext.callMethod(ptr, MethodBindings.setAngularVelocityPtr, NIL)
  }

  public final fun getAngularVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAngularVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the inverse inertia tensor basis. This is used to calculate the angular acceleration
   * resulting from a torque applied to the [RigidBody3D].
   */
  public final fun getInverseInertiaTensor(): Basis {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInverseInertiaTensorPtr, BASIS)
    return (TransferContext.readReturnValue(BASIS) as Basis)
  }

  public final fun setGravityScale(gravityScale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to gravityScale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGravityScalePtr, NIL)
  }

  public final fun getGravityScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGravityScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLinearDampMode(linearDampMode: DampMode): Unit {
    TransferContext.writeArguments(LONG to linearDampMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setLinearDampModePtr, NIL)
  }

  public final fun getLinearDampMode(): DampMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLinearDampModePtr, LONG)
    return RigidBody3D.DampMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAngularDampMode(angularDampMode: DampMode): Unit {
    TransferContext.writeArguments(LONG to angularDampMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setAngularDampModePtr, NIL)
  }

  public final fun getAngularDampMode(): DampMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAngularDampModePtr, LONG)
    return RigidBody3D.DampMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setLinearDamp(linearDamp: Float): Unit {
    TransferContext.writeArguments(DOUBLE to linearDamp.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setLinearDampPtr, NIL)
  }

  public final fun getLinearDamp(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLinearDampPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAngularDamp(angularDamp: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angularDamp.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAngularDampPtr, NIL)
  }

  public final fun getAngularDamp(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAngularDampPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxContactsReported(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxContactsReportedPtr, NIL)
  }

  public final fun getMaxContactsReported(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxContactsReportedPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of contacts this body has with other bodies. By default, this returns 0
   * unless bodies are configured to monitor contacts (see [contactMonitor]).
   * **Note:** To retrieve the colliding bodies, use [getCollidingBodies].
   */
  public final fun getContactCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getContactCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setUseCustomIntegrator(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseCustomIntegratorPtr, NIL)
  }

  public final fun isUsingCustomIntegrator(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingCustomIntegratorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setContactMonitor(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setContactMonitorPtr, NIL)
  }

  public final fun isContactMonitorEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isContactMonitorEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseContinuousCollisionDetection(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseContinuousCollisionDetectionPtr, NIL)
  }

  public final fun isUsingContinuousCollisionDetection(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingContinuousCollisionDetectionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets an axis velocity. The velocity in the given vector axis will be set as the given vector
   * length. This is useful for jumping behavior.
   */
  public final fun setAxisVelocity(axisVelocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to axisVelocity)
    TransferContext.callMethod(ptr, MethodBindings.setAxisVelocityPtr, NIL)
  }

  /**
   * Applies a directional impulse without affecting rotation.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   * This is equivalent to using [applyImpulse] at the body's center of mass.
   */
  public final fun applyCentralImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(ptr, MethodBindings.applyCentralImpulsePtr, NIL)
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
    TransferContext.callMethod(ptr, MethodBindings.applyImpulsePtr, NIL)
  }

  /**
   * Applies a rotational impulse to the body without affecting the position.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   * **Note:** [inertia] is required for this to work. To have [inertia], an active
   * [CollisionShape3D] must be a child of the node, or you can manually set [inertia].
   */
  public final fun applyTorqueImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(ptr, MethodBindings.applyTorqueImpulsePtr, NIL)
  }

  /**
   * Applies a directional force without affecting rotation. A force is time dependent and meant to
   * be applied every physics update.
   * This is equivalent to using [applyForce] at the body's center of mass.
   */
  public final fun applyCentralForce(force: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(ptr, MethodBindings.applyCentralForcePtr, NIL)
  }

  /**
   * Applies a positioned force to the body. A force is time dependent and meant to be applied every
   * physics update.
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
   * **Note:** [inertia] is required for this to work. To have [inertia], an active
   * [CollisionShape3D] must be a child of the node, or you can manually set [inertia].
   */
  public final fun applyTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(ptr, MethodBindings.applyTorquePtr, NIL)
  }

  /**
   * Adds a constant directional force without affecting rotation that keeps being applied over time
   * until cleared with `constant_force = Vector3(0, 0, 0)`.
   * This is equivalent to using [addConstantForce] at the body's center of mass.
   */
  public final fun addConstantCentralForce(force: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(ptr, MethodBindings.addConstantCentralForcePtr, NIL)
  }

  /**
   * Adds a constant positioned force to the body that keeps being applied over time until cleared
   * with `constant_force = Vector3(0, 0, 0)`.
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

  public final fun setConstantForce(force: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(ptr, MethodBindings.setConstantForcePtr, NIL)
  }

  public final fun getConstantForce(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstantForcePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setConstantTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(ptr, MethodBindings.setConstantTorquePtr, NIL)
  }

  public final fun getConstantTorque(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstantTorquePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setSleeping(sleeping: Boolean): Unit {
    TransferContext.writeArguments(BOOL to sleeping)
    TransferContext.callMethod(ptr, MethodBindings.setSleepingPtr, NIL)
  }

  public final fun isSleeping(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSleepingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCanSleep(ableToSleep: Boolean): Unit {
    TransferContext.writeArguments(BOOL to ableToSleep)
    TransferContext.callMethod(ptr, MethodBindings.setCanSleepPtr, NIL)
  }

  public final fun isAbleToSleep(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAbleToSleepPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLockRotationEnabled(lockRotation: Boolean): Unit {
    TransferContext.writeArguments(BOOL to lockRotation)
    TransferContext.callMethod(ptr, MethodBindings.setLockRotationEnabledPtr, NIL)
  }

  public final fun isLockRotationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isLockRotationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFreezeEnabled(freezeMode: Boolean): Unit {
    TransferContext.writeArguments(BOOL to freezeMode)
    TransferContext.callMethod(ptr, MethodBindings.setFreezeEnabledPtr, NIL)
  }

  public final fun isFreezeEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFreezeEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFreezeMode(freezeMode: FreezeMode): Unit {
    TransferContext.writeArguments(LONG to freezeMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setFreezeModePtr, NIL)
  }

  public final fun getFreezeMode(): FreezeMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFreezeModePtr, LONG)
    return RigidBody3D.FreezeMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a list of the bodies colliding with this one. Requires [contactMonitor] to be set to
   * `true` and [maxContactsReported] to be set high enough to detect all the collisions.
   * **Note:** The result of this test is not immediate after moving objects. For performance, list
   * of collisions is updated once per frame and before the physics step. Consider using signals
   * instead.
   */
  public final fun getCollidingBodies(): VariantArray<Node3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollidingBodiesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Node3D>)
  }

  public enum class FreezeMode(
    id: Long,
  ) {
    /**
     * Static body freeze mode (default). The body is not affected by gravity and forces. It can be
     * only moved by user code and doesn't collide with other bodies along its path.
     */
    FREEZE_MODE_STATIC(0),
    /**
     * Kinematic body freeze mode. Similar to [FREEZE_MODE_STATIC], but collides with other bodies
     * along its path when moved. Useful for a frozen body that needs to be animated.
     */
    FREEZE_MODE_KINEMATIC(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FreezeMode = entries.single { it.id == `value` }
    }
  }

  public enum class CenterOfMassMode(
    id: Long,
  ) {
    /**
     * In this mode, the body's center of mass is calculated automatically based on its shapes. This
     * assumes that the shapes' origins are also their center of mass.
     */
    CENTER_OF_MASS_MODE_AUTO(0),
    /**
     * In this mode, the body's center of mass is set through [centerOfMass]. Defaults to the body's
     * origin position.
     */
    CENTER_OF_MASS_MODE_CUSTOM(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CenterOfMassMode = entries.single { it.id == `value` }
    }
  }

  public enum class DampMode(
    id: Long,
  ) {
    /**
     * In this mode, the body's damping value is added to any value set in areas or the default
     * value.
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
      public fun from(`value`: Long): DampMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_mass", 373806689)

    public val getMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_mass", 1740695150)

    public val setInertiaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_inertia", 3460891852)

    public val getInertiaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_inertia", 3360562783)

    public val setCenterOfMassModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_center_of_mass_mode", 3625866032)

    public val getCenterOfMassModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_center_of_mass_mode", 237405040)

    public val setCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_center_of_mass", 3460891852)

    public val getCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_center_of_mass", 3360562783)

    public val setPhysicsMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_physics_material_override", 1784508650)

    public val getPhysicsMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_physics_material_override", 2521850424)

    public val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_linear_velocity", 3460891852)

    public val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_linear_velocity", 3360562783)

    public val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_angular_velocity", 3460891852)

    public val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_angular_velocity", 3360562783)

    public val getInverseInertiaTensorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_inverse_inertia_tensor", 2716978435)

    public val setGravityScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_gravity_scale", 373806689)

    public val getGravityScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_gravity_scale", 1740695150)

    public val setLinearDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_linear_damp_mode", 1802035050)

    public val getLinearDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_linear_damp_mode", 1366206940)

    public val setAngularDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_angular_damp_mode", 1802035050)

    public val getAngularDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_angular_damp_mode", 1366206940)

    public val setLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_linear_damp", 373806689)

    public val getLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_linear_damp", 1740695150)

    public val setAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_angular_damp", 373806689)

    public val getAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_angular_damp", 1740695150)

    public val setMaxContactsReportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_max_contacts_reported", 1286410249)

    public val getMaxContactsReportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_max_contacts_reported", 3905245786)

    public val getContactCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_contact_count", 3905245786)

    public val setUseCustomIntegratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_use_custom_integrator", 2586408642)

    public val isUsingCustomIntegratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "is_using_custom_integrator", 2240911060)

    public val setContactMonitorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_contact_monitor", 2586408642)

    public val isContactMonitorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "is_contact_monitor_enabled", 36873697)

    public val setUseContinuousCollisionDetectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_use_continuous_collision_detection", 2586408642)

    public val isUsingContinuousCollisionDetectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "is_using_continuous_collision_detection", 36873697)

    public val setAxisVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_axis_velocity", 3460891852)

    public val applyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "apply_central_impulse", 3460891852)

    public val applyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "apply_impulse", 2754756483)

    public val applyTorqueImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "apply_torque_impulse", 3460891852)

    public val applyCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "apply_central_force", 3460891852)

    public val applyForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "apply_force", 2754756483)

    public val applyTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "apply_torque", 3460891852)

    public val addConstantCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "add_constant_central_force", 3460891852)

    public val addConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "add_constant_force", 2754756483)

    public val addConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "add_constant_torque", 3460891852)

    public val setConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_constant_force", 3460891852)

    public val getConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_constant_force", 3360562783)

    public val setConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_constant_torque", 3460891852)

    public val getConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_constant_torque", 3360562783)

    public val setSleepingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_sleeping", 2586408642)

    public val isSleepingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "is_sleeping", 36873697)

    public val setCanSleepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_can_sleep", 2586408642)

    public val isAbleToSleepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "is_able_to_sleep", 36873697)

    public val setLockRotationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_lock_rotation_enabled", 2586408642)

    public val isLockRotationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "is_lock_rotation_enabled", 36873697)

    public val setFreezeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_freeze_enabled", 2586408642)

    public val isFreezeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "is_freeze_enabled", 36873697)

    public val setFreezeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "set_freeze_mode", 1319914653)

    public val getFreezeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_freeze_mode", 2008423905)

    public val getCollidingBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody3D", "get_colliding_bodies", 3995934104)
  }
}
