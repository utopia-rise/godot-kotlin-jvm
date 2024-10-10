// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal4
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_RIGIDBODY2D_INDEX: Int = 555

/**
 * [RigidBody2D] implements full 2D physics. It cannot be controlled directly, instead, you must
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
 * **Note:** Changing the 2D transform or [linearVelocity] of a [RigidBody2D] very often may lead to
 * some unpredictable behaviors. If you need to directly affect the body, prefer [_integrateForces] as
 * it allows you to directly access the physics state.
 */
@GodotBaseType
public open class RigidBody2D : PhysicsBody2D() {
  /**
   * Emitted when one of this RigidBody2D's [Shape2D]s collides with another [PhysicsBody2D] or
   * [TileMap]'s [Shape2D]s. Requires [contactMonitor] to be set to `true` and [maxContactsReported] to
   * be set high enough to detect all the collisions. [TileMap]s are detected if the [TileSet] has
   * Collision [Shape2D]s.
   * [bodyRid] the [RID] of the other [PhysicsBody2D] or [TileSet]'s [CollisionObject2D] used by the
   * [PhysicsServer2D].
   * [body] the [Node], if it exists in the tree, of the other [PhysicsBody2D] or [TileMap].
   * [bodyShapeIndex] the index of the [Shape2D] of the other [PhysicsBody2D] or [TileMap] used by
   * the [PhysicsServer2D]. Get the [CollisionShape2D] node with
   * `body.shape_owner_get_owner(body.shape_find_owner(body_shape_index))`.
   * [localShapeIndex] the index of the [Shape2D] of this RigidBody2D used by the [PhysicsServer2D].
   * Get the [CollisionShape2D] node with
   * `self.shape_owner_get_owner(self.shape_find_owner(local_shape_index))`.
   */
  public val bodyShapeEntered: Signal4<RID, Node, Long, Long> by Signal4

  /**
   * Emitted when the collision between one of this RigidBody2D's [Shape2D]s and another
   * [PhysicsBody2D] or [TileMap]'s [Shape2D]s ends. Requires [contactMonitor] to be set to `true` and
   * [maxContactsReported] to be set high enough to detect all the collisions. [TileMap]s are detected
   * if the [TileSet] has Collision [Shape2D]s.
   * [bodyRid] the [RID] of the other [PhysicsBody2D] or [TileSet]'s [CollisionObject2D] used by the
   * [PhysicsServer2D].
   * [body] the [Node], if it exists in the tree, of the other [PhysicsBody2D] or [TileMap].
   * [bodyShapeIndex] the index of the [Shape2D] of the other [PhysicsBody2D] or [TileMap] used by
   * the [PhysicsServer2D]. Get the [CollisionShape2D] node with
   * `body.shape_owner_get_owner(body.shape_find_owner(body_shape_index))`.
   * [localShapeIndex] the index of the [Shape2D] of this RigidBody2D used by the [PhysicsServer2D].
   * Get the [CollisionShape2D] node with
   * `self.shape_owner_get_owner(self.shape_find_owner(local_shape_index))`.
   */
  public val bodyShapeExited: Signal4<RID, Node, Long, Long> by Signal4

  /**
   * Emitted when a collision with another [PhysicsBody2D] or [TileMap] occurs. Requires
   * [contactMonitor] to be set to `true` and [maxContactsReported] to be set high enough to detect all
   * the collisions. [TileMap]s are detected if the [TileSet] has Collision [Shape2D]s.
   * [body] the [Node], if it exists in the tree, of the other [PhysicsBody2D] or [TileMap].
   */
  public val bodyEntered: Signal1<Node> by Signal1

  /**
   * Emitted when the collision with another [PhysicsBody2D] or [TileMap] ends. Requires
   * [contactMonitor] to be set to `true` and [maxContactsReported] to be set high enough to detect all
   * the collisions. [TileMap]s are detected if the [TileSet] has Collision [Shape2D]s.
   * [body] the [Node], if it exists in the tree, of the other [PhysicsBody2D] or [TileMap].
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
   * Multiplies the gravity applied to the body. The body's gravity is calculated from the **Default
   * Gravity** value in **Project > Project Settings > Physics > 2d** and/or any additional gravity
   * vector applied by [Area2D]s.
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
  public final inline var centerOfMass: Vector2
    @JvmName("centerOfMassProperty")
    get() = getCenterOfMass()
    @JvmName("centerOfMassProperty")
    set(`value`) {
      setCenterOfMass(value)
    }

  /**
   * The body's moment of inertia. This is like mass, but for rotation: it determines how much
   * torque it takes to rotate the body. The moment of inertia is usually computed automatically from
   * the mass and the shapes, but this property allows you to set a custom value.
   * If set to `0`, inertia is automatically computed (default value).
   * **Note:** This value does not change when inertia is automatically computed. Use
   * [PhysicsServer2D] to get the computed inertia.
   *
   * gdscript:
   * ```gdscript
   * @onready var ball = $Ball
   *
   * func get_ball_inertia():
   *     return 1.0 / PhysicsServer2D.body_get_direct_state(ball.get_rid()).inverse_inertia
   * ```
   * csharp:
   * ```csharp
   * private RigidBody2D _ball;
   *
   * public override void _Ready()
   * {
   *     _ball = GetNode<RigidBody2D>("Ball");
   * }
   *
   * private float GetBallInertia()
   * {
   *     return 1.0f / PhysicsServer2D.BodyGetDirectState(_ball.GetRid()).InverseInertia;
   * }
   * ```
   */
  public final inline var inertia: Float
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
   * For a body that is always frozen, use [StaticBody2D] or [AnimatableBody2D] instead.
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
   * For a body that is always frozen, use [StaticBody2D] or [AnimatableBody2D] instead.
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
   * Setting this property will call the method [PhysicsServer2D.bodySetOmitForceIntegration]
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
   * Continuous collision detection mode.
   * Continuous collision detection tries to predict where a moving body will collide instead of
   * moving it and correcting its movement after collision. Continuous collision detection is slower,
   * but more precise and misses fewer collisions with small, fast-moving objects. Raycasting and
   * shapecasting methods are available. See [CCDMode] for details.
   */
  public final inline var continuousCd: CCDMode
    @JvmName("continuousCdProperty")
    get() = getContinuousCollisionDetectionMode()
    @JvmName("continuousCdProperty")
    set(`value`) {
      setContinuousCollisionDetectionMode(value)
    }

  /**
   * If `true`, the RigidBody2D will emit signals when it collides with another body.
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
   * The body's linear velocity in pixels per second. Can be used sporadically, but **don't set this
   * every frame**, because physics may run in another thread and runs at a different granularity. Use
   * [_integrateForces] as your process loop for precise control of the body state.
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
   * **Project > Project Settings > Physics > 2d** or any value override set by an [Area2D] the body is
   * in. Depending on [linearDampMode], you can set [linearDamp] to be added to or to replace the
   * body's damping value.
   * See [ProjectSettings.physics/2d/defaultLinearDamp] for more details about damping.
   */
  public final inline var linearDamp: Float
    @JvmName("linearDampProperty")
    get() = getLinearDamp()
    @JvmName("linearDampProperty")
    set(`value`) {
      setLinearDamp(value)
    }

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
   * **Project > Project Settings > Physics > 2d** or any value override set by an [Area2D] the body is
   * in. Depending on [angularDampMode], you can set [angularDamp] to be added to or to replace the
   * body's damping value.
   * See [ProjectSettings.physics/2d/defaultAngularDamp] for more details about damping.
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
  public final inline var constantForce: Vector2
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
  public final inline var constantTorque: Float
    @JvmName("constantTorqueProperty")
    get() = getConstantTorque()
    @JvmName("constantTorqueProperty")
    set(`value`) {
      setConstantTorque(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RIGIDBODY2D_INDEX, scriptIndex)
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
   * val myCoreType = rigidbody2d.centerOfMass
   * //Your changes
   * rigidbody2d.centerOfMass = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun centerOfMassMutate(block: Vector2.() -> Unit): Vector2 = centerOfMass.apply{
      block(this)
      centerOfMass = this
  }


  /**
   * The body's linear velocity in pixels per second. Can be used sporadically, but **don't set this
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
   * val myCoreType = rigidbody2d.linearVelocity
   * //Your changes
   * rigidbody2d.linearVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun linearVelocityMutate(block: Vector2.() -> Unit): Vector2 = linearVelocity.apply{
      block(this)
      linearVelocity = this
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
   * val myCoreType = rigidbody2d.constantForce
   * //Your changes
   * rigidbody2d.constantForce = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun constantForceMutate(block: Vector2.() -> Unit): Vector2 = constantForce.apply{
      block(this)
      constantForce = this
  }


  /**
   * Called during physics processing, allowing you to read and safely modify the simulation state
   * for the object. By default, it is called before the standard force integration, but the
   * [customIntegrator] property allows you to disable the standard force integration and do fully
   * custom force integration for a body.
   */
  public open fun _integrateForces(state: PhysicsDirectBodyState2D?): Unit {
  }

  public final fun setMass(mass: Float): Unit {
    Internals.writeArguments(DOUBLE to mass.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMassPtr, NIL)
  }

  public final fun getMass(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMassPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getInertia(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInertiaPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setInertia(inertia: Float): Unit {
    Internals.writeArguments(DOUBLE to inertia.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setInertiaPtr, NIL)
  }

  public final fun setCenterOfMassMode(mode: CenterOfMassMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setCenterOfMassModePtr, NIL)
  }

  public final fun getCenterOfMassMode(): CenterOfMassMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCenterOfMassModePtr, LONG)
    return RigidBody2D.CenterOfMassMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setCenterOfMass(centerOfMass: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to centerOfMass)
    Internals.callMethod(rawPtr, MethodBindings.setCenterOfMassPtr, NIL)
  }

  public final fun getCenterOfMass(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCenterOfMassPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial?): Unit {
    Internals.writeArguments(OBJECT to physicsMaterialOverride)
    Internals.callMethod(rawPtr, MethodBindings.setPhysicsMaterialOverridePtr, NIL)
  }

  public final fun getPhysicsMaterialOverride(): PhysicsMaterial? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPhysicsMaterialOverridePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as PhysicsMaterial?)
  }

  public final fun setGravityScale(gravityScale: Float): Unit {
    Internals.writeArguments(DOUBLE to gravityScale.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setGravityScalePtr, NIL)
  }

  public final fun getGravityScale(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGravityScalePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLinearDampMode(linearDampMode: DampMode): Unit {
    Internals.writeArguments(LONG to linearDampMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setLinearDampModePtr, NIL)
  }

  public final fun getLinearDampMode(): DampMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLinearDampModePtr, LONG)
    return RigidBody2D.DampMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setAngularDampMode(angularDampMode: DampMode): Unit {
    Internals.writeArguments(LONG to angularDampMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setAngularDampModePtr, NIL)
  }

  public final fun getAngularDampMode(): DampMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAngularDampModePtr, LONG)
    return RigidBody2D.DampMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setLinearDamp(linearDamp: Float): Unit {
    Internals.writeArguments(DOUBLE to linearDamp.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setLinearDampPtr, NIL)
  }

  public final fun getLinearDamp(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLinearDampPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAngularDamp(angularDamp: Float): Unit {
    Internals.writeArguments(DOUBLE to angularDamp.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAngularDampPtr, NIL)
  }

  public final fun getAngularDamp(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAngularDampPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLinearVelocity(linearVelocity: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to linearVelocity)
    Internals.callMethod(rawPtr, MethodBindings.setLinearVelocityPtr, NIL)
  }

  public final fun getLinearVelocity(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLinearVelocityPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setAngularVelocity(angularVelocity: Float): Unit {
    Internals.writeArguments(DOUBLE to angularVelocity.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAngularVelocityPtr, NIL)
  }

  public final fun getAngularVelocity(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAngularVelocityPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxContactsReported(amount: Int): Unit {
    Internals.writeArguments(LONG to amount.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMaxContactsReportedPtr, NIL)
  }

  public final fun getMaxContactsReported(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxContactsReportedPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of contacts this body has with other bodies. By default, this returns 0
   * unless bodies are configured to monitor contacts (see [contactMonitor]).
   * **Note:** To retrieve the colliding bodies, use [getCollidingBodies].
   */
  public final fun getContactCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getContactCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setUseCustomIntegrator(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setUseCustomIntegratorPtr, NIL)
  }

  public final fun isUsingCustomIntegrator(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUsingCustomIntegratorPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setContactMonitor(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setContactMonitorPtr, NIL)
  }

  public final fun isContactMonitorEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isContactMonitorEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setContinuousCollisionDetectionMode(mode: CCDMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setContinuousCollisionDetectionModePtr, NIL)
  }

  public final fun getContinuousCollisionDetectionMode(): CCDMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getContinuousCollisionDetectionModePtr, LONG)
    return RigidBody2D.CCDMode.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the body's velocity on the given axis. The velocity in the given vector axis will be set
   * as the given vector length. This is useful for jumping behavior.
   */
  public final fun setAxisVelocity(axisVelocity: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to axisVelocity)
    Internals.callMethod(rawPtr, MethodBindings.setAxisVelocityPtr, NIL)
  }

  /**
   * Applies a directional impulse without affecting rotation.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   * This is equivalent to using [applyImpulse] at the body's center of mass.
   */
  @JvmOverloads
  public final fun applyCentralImpulse(impulse: Vector2 = Vector2(0, 0)): Unit {
    Internals.writeArguments(VECTOR2 to impulse)
    Internals.callMethod(rawPtr, MethodBindings.applyCentralImpulsePtr, NIL)
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
    Internals.writeArguments(VECTOR2 to impulse, VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.applyImpulsePtr, NIL)
  }

  /**
   * Applies a rotational impulse to the body without affecting the position.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   * **Note:** [inertia] is required for this to work. To have [inertia], an active
   * [CollisionShape2D] must be a child of the node, or you can manually set [inertia].
   */
  public final fun applyTorqueImpulse(torque: Float): Unit {
    Internals.writeArguments(DOUBLE to torque.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.applyTorqueImpulsePtr, NIL)
  }

  /**
   * Applies a directional force without affecting rotation. A force is time dependent and meant to
   * be applied every physics update.
   * This is equivalent to using [applyForce] at the body's center of mass.
   */
  public final fun applyCentralForce(force: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to force)
    Internals.callMethod(rawPtr, MethodBindings.applyCentralForcePtr, NIL)
  }

  /**
   * Applies a positioned force to the body. A force is time dependent and meant to be applied every
   * physics update.
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public final fun applyForce(force: Vector2, position: Vector2 = Vector2(0, 0)): Unit {
    Internals.writeArguments(VECTOR2 to force, VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.applyForcePtr, NIL)
  }

  /**
   * Applies a rotational force without affecting position. A force is time dependent and meant to
   * be applied every physics update.
   * **Note:** [inertia] is required for this to work. To have [inertia], an active
   * [CollisionShape2D] must be a child of the node, or you can manually set [inertia].
   */
  public final fun applyTorque(torque: Float): Unit {
    Internals.writeArguments(DOUBLE to torque.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.applyTorquePtr, NIL)
  }

  /**
   * Adds a constant directional force without affecting rotation that keeps being applied over time
   * until cleared with `constant_force = Vector2(0, 0)`.
   * This is equivalent to using [addConstantForce] at the body's center of mass.
   */
  public final fun addConstantCentralForce(force: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to force)
    Internals.callMethod(rawPtr, MethodBindings.addConstantCentralForcePtr, NIL)
  }

  /**
   * Adds a constant positioned force to the body that keeps being applied over time until cleared
   * with `constant_force = Vector2(0, 0)`.
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public final fun addConstantForce(force: Vector2, position: Vector2 = Vector2(0, 0)): Unit {
    Internals.writeArguments(VECTOR2 to force, VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.addConstantForcePtr, NIL)
  }

  /**
   * Adds a constant rotational force without affecting position that keeps being applied over time
   * until cleared with `constant_torque = 0`.
   */
  public final fun addConstantTorque(torque: Float): Unit {
    Internals.writeArguments(DOUBLE to torque.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.addConstantTorquePtr, NIL)
  }

  public final fun setConstantForce(force: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to force)
    Internals.callMethod(rawPtr, MethodBindings.setConstantForcePtr, NIL)
  }

  public final fun getConstantForce(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConstantForcePtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setConstantTorque(torque: Float): Unit {
    Internals.writeArguments(DOUBLE to torque.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setConstantTorquePtr, NIL)
  }

  public final fun getConstantTorque(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConstantTorquePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSleeping(sleeping: Boolean): Unit {
    Internals.writeArguments(BOOL to sleeping)
    Internals.callMethod(rawPtr, MethodBindings.setSleepingPtr, NIL)
  }

  public final fun isSleeping(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isSleepingPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCanSleep(ableToSleep: Boolean): Unit {
    Internals.writeArguments(BOOL to ableToSleep)
    Internals.callMethod(rawPtr, MethodBindings.setCanSleepPtr, NIL)
  }

  public final fun isAbleToSleep(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isAbleToSleepPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLockRotationEnabled(lockRotation: Boolean): Unit {
    Internals.writeArguments(BOOL to lockRotation)
    Internals.callMethod(rawPtr, MethodBindings.setLockRotationEnabledPtr, NIL)
  }

  public final fun isLockRotationEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isLockRotationEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFreezeEnabled(freezeMode: Boolean): Unit {
    Internals.writeArguments(BOOL to freezeMode)
    Internals.callMethod(rawPtr, MethodBindings.setFreezeEnabledPtr, NIL)
  }

  public final fun isFreezeEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isFreezeEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFreezeMode(freezeMode: FreezeMode): Unit {
    Internals.writeArguments(LONG to freezeMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setFreezeModePtr, NIL)
  }

  public final fun getFreezeMode(): FreezeMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFreezeModePtr, LONG)
    return RigidBody2D.FreezeMode.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a list of the bodies colliding with this one. Requires [contactMonitor] to be set to
   * `true` and [maxContactsReported] to be set high enough to detect all the collisions.
   * **Note:** The result of this test is not immediate after moving objects. For performance, list
   * of collisions is updated once per frame and before the physics step. Consider using signals
   * instead.
   */
  public final fun getCollidingBodies(): VariantArray<Node2D> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollidingBodiesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Node2D>)
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

  public enum class CCDMode(
    id: Long,
  ) {
    /**
     * Continuous collision detection disabled. This is the fastest way to detect body collisions,
     * but can miss small, fast-moving objects.
     */
    CCD_MODE_DISABLED(0),
    /**
     * Continuous collision detection enabled using raycasting. This is faster than shapecasting but
     * less precise.
     */
    CCD_MODE_CAST_RAY(1),
    /**
     * Continuous collision detection enabled using shapecasting. This is the slowest CCD method and
     * the most precise.
     */
    CCD_MODE_CAST_SHAPE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CCDMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setMassPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_mass", 373806689)

    public val getMassPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_mass", 1740695150)

    public val getInertiaPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_inertia", 1740695150)

    public val setInertiaPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_inertia", 373806689)

    public val setCenterOfMassModePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_center_of_mass_mode", 1757235706)

    public val getCenterOfMassModePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_center_of_mass_mode", 3277132817)

    public val setCenterOfMassPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_center_of_mass", 743155724)

    public val getCenterOfMassPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_center_of_mass", 3341600327)

    public val setPhysicsMaterialOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_physics_material_override", 1784508650)

    public val getPhysicsMaterialOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_physics_material_override", 2521850424)

    public val setGravityScalePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_gravity_scale", 373806689)

    public val getGravityScalePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_gravity_scale", 1740695150)

    public val setLinearDampModePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_linear_damp_mode", 3406533708)

    public val getLinearDampModePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_linear_damp_mode", 2970511462)

    public val setAngularDampModePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_angular_damp_mode", 3406533708)

    public val getAngularDampModePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_angular_damp_mode", 2970511462)

    public val setLinearDampPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_linear_damp", 373806689)

    public val getLinearDampPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_linear_damp", 1740695150)

    public val setAngularDampPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_angular_damp", 373806689)

    public val getAngularDampPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_angular_damp", 1740695150)

    public val setLinearVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_linear_velocity", 743155724)

    public val getLinearVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_linear_velocity", 3341600327)

    public val setAngularVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_angular_velocity", 373806689)

    public val getAngularVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_angular_velocity", 1740695150)

    public val setMaxContactsReportedPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_max_contacts_reported", 1286410249)

    public val getMaxContactsReportedPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_max_contacts_reported", 3905245786)

    public val getContactCountPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_contact_count", 3905245786)

    public val setUseCustomIntegratorPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_use_custom_integrator", 2586408642)

    public val isUsingCustomIntegratorPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "is_using_custom_integrator", 2240911060)

    public val setContactMonitorPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_contact_monitor", 2586408642)

    public val isContactMonitorEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "is_contact_monitor_enabled", 36873697)

    public val setContinuousCollisionDetectionModePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_continuous_collision_detection_mode", 1000241384)

    public val getContinuousCollisionDetectionModePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_continuous_collision_detection_mode", 815214376)

    public val setAxisVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_axis_velocity", 743155724)

    public val applyCentralImpulsePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "apply_central_impulse", 3862383994)

    public val applyImpulsePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "apply_impulse", 4288681949)

    public val applyTorqueImpulsePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "apply_torque_impulse", 373806689)

    public val applyCentralForcePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "apply_central_force", 743155724)

    public val applyForcePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "apply_force", 4288681949)

    public val applyTorquePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "apply_torque", 373806689)

    public val addConstantCentralForcePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "add_constant_central_force", 743155724)

    public val addConstantForcePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "add_constant_force", 4288681949)

    public val addConstantTorquePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "add_constant_torque", 373806689)

    public val setConstantForcePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_constant_force", 743155724)

    public val getConstantForcePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_constant_force", 3341600327)

    public val setConstantTorquePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_constant_torque", 373806689)

    public val getConstantTorquePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_constant_torque", 1740695150)

    public val setSleepingPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_sleeping", 2586408642)

    public val isSleepingPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "is_sleeping", 36873697)

    public val setCanSleepPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_can_sleep", 2586408642)

    public val isAbleToSleepPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "is_able_to_sleep", 36873697)

    public val setLockRotationEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_lock_rotation_enabled", 2586408642)

    public val isLockRotationEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "is_lock_rotation_enabled", 36873697)

    public val setFreezeEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_freeze_enabled", 2586408642)

    public val isFreezeEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "is_freeze_enabled", 36873697)

    public val setFreezeModePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "set_freeze_mode", 1705112154)

    public val getFreezeModePtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_freeze_mode", 2016872314)

    public val getCollidingBodiesPtr: VoidPtr =
        Internals.getMethodBindPtr("RigidBody2D", "get_colliding_bodies", 3995934104)
  }
}
