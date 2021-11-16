// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal4
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A body that is controlled by the 2D physics engine.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/148](https://godotengine.org/asset-library/asset/148)
 *
 * This node implements simulated 2D physics. You do not control a RigidBody2D directly. Instead, you apply forces to it (gravity, impulses, etc.) and the physics simulation calculates the resulting movement based on its mass, friction, and other physical properties.
 *
 * A RigidBody2D has 4 behavior [mode]s: Rigid, Static, Character, and Kinematic.
 *
 * **Note:** You should not change a RigidBody2D's `position` or `linear_velocity` every frame or even very often. If you need to directly affect the body's state, use [_integrateForces], which allows you to directly access the physics state.
 *
 * Please also keep in mind that physics bodies manage their own transform which overwrites the ones you set. So any direct or indirect transformation (including scaling of the node or its parent) will be visible in the editor only, and immediately reset at runtime.
 *
 * If you need to override the default physics behavior or add a transformation at runtime, you can write a custom force integration. See [customIntegrator].
 *
 * The center of mass is always located at the node's origin without taking into account the [godot.CollisionShape2D] centroid offsets.
 */
@GodotBaseType
public open class RigidBody2D : PhysicsBody2D() {
  /**
   * Emitted when a collision with another [godot.PhysicsBody2D] or [godot.TileMap] occurs. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.TileMap]s are detected if the [godot.TileSet] has Collision [godot.Shape2D]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody2D] or [godot.TileMap].
   */
  public val bodyEntered: Signal1<Node> by signal("body")

  /**
   * Emitted when the collision with another [godot.PhysicsBody2D] or [godot.TileMap] ends. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.TileMap]s are detected if the [godot.TileSet] has Collision [godot.Shape2D]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody2D] or [godot.TileMap].
   */
  public val bodyExited: Signal1<Node> by signal("body")

  /**
   * Emitted when one of this RigidBody2D's [godot.Shape2D]s collides with another [godot.PhysicsBody2D] or [godot.TileMap]'s [godot.Shape2D]s. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.TileMap]s are detected if the [godot.TileSet] has Collision [godot.Shape2D]s.
   *
   * `body_rid` the [RID] of the other [godot.PhysicsBody2D] or [godot.TileSet]'s [godot.CollisionObject2D] used by the [godot.Physics2DServer].
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody2D] or [godot.TileMap].
   *
   * `body_shape_index` the index of the [godot.Shape2D] of the other [godot.PhysicsBody2D] or [godot.TileMap] used by the [godot.Physics2DServer]. Get the [godot.CollisionShape2D] node with `body.shape_owner_get_owner(body_shape_index)`.
   *
   * `local_shape_index` the index of the [godot.Shape2D] of this RigidBody2D used by the [godot.Physics2DServer]. Get the [godot.CollisionShape2D] node with `self.shape_owner_get_owner(local_shape_index)`.
   */
  public val bodyShapeEntered: Signal4<RID, Node, Long, Long> by signal("body_rid", "body",
      "body_shape_index", "local_shape_index")

  /**
   * Emitted when the collision between one of this RigidBody2D's [godot.Shape2D]s and another [godot.PhysicsBody2D] or [godot.TileMap]'s [godot.Shape2D]s ends. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.TileMap]s are detected if the [godot.TileSet] has Collision [godot.Shape2D]s.
   *
   * `body_rid` the [RID] of the other [godot.PhysicsBody2D] or [godot.TileSet]'s [godot.CollisionObject2D] used by the [godot.Physics2DServer].
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody2D] or [godot.TileMap].
   *
   * `body_shape_index` the index of the [godot.Shape2D] of the other [godot.PhysicsBody2D] or [godot.TileMap] used by the [godot.Physics2DServer]. Get the [godot.CollisionShape2D] node with `body.shape_owner_get_owner(body_shape_index)`.
   *
   * `local_shape_index` the index of the [godot.Shape2D] of this RigidBody2D used by the [godot.Physics2DServer]. Get the [godot.CollisionShape2D] node with `self.shape_owner_get_owner(local_shape_index)`.
   */
  public val bodyShapeExited: Signal4<RID, Node, Long, Long> by signal("body_rid", "body",
      "body_shape_index", "local_shape_index")

  /**
   * Emitted when the physics engine changes the body's sleeping state.
   *
   * **Note:** Changing the value [sleeping] will not trigger this signal. It is only emitted if the sleeping state is changed by the physics engine or `emit_signal("sleeping_state_changed")` is used.
   */
  public val sleepingStateChanged: Signal0 by signal()

  /**
   * Damps the body's [angularVelocity]. If `-1`, the body will use the **Default Angular Damp** defined in **Project > Project Settings > Physics > 2d**.
   *
   * See [godot.ProjectSettings.physics/2d/defaultAngularDamp] for more details about damping.
   */
  public open var angularDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_ANGULAR_DAMP,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_ANGULAR_DAMP, NIL)
    }

  /**
   * The body's rotational velocity.
   */
  public open var angularVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_ANGULAR_VELOCITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_ANGULAR_VELOCITY,
          NIL)
    }

  /**
   * The body's total applied force.
   */
  public open var appliedForce: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_APPLIED_FORCE,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_APPLIED_FORCE,
          NIL)
    }

  /**
   * The body's total applied torque.
   */
  public open var appliedTorque: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_APPLIED_TORQUE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_APPLIED_TORQUE,
          NIL)
    }

  /**
   * The body's bounciness. Values range from `0` (no bounce) to `1` (full bounciness).
   *
   * Deprecated, use [godot.PhysicsMaterial.bounce] instead via [physicsMaterialOverride].
   */
  public open var bounce: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_BOUNCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_BOUNCE, NIL)
    }

  /**
   * If `true`, the body can enter sleep mode when there is no movement. See [sleeping].
   *
   * **Note:** A RigidBody2D will never enter sleep mode automatically if its [mode] is [MODE_CHARACTER]. It can still be put to sleep manually by setting its [sleeping] property to `true`.
   */
  public open var canSleep: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_CAN_SLEEP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_CAN_SLEEP, NIL)
    }

  /**
   * If `true`, the body will emit signals when it collides with another RigidBody2D. See also [contactsReported].
   */
  public open var contactMonitor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_CONTACT_MONITOR,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_CONTACT_MONITOR,
          NIL)
    }

  /**
   * The maximum number of contacts that will be recorded. Requires [contactMonitor] to be set to `true`.
   *
   * **Note:** The number of contacts is different from the number of collisions. Collisions between parallel edges will result in two contacts (one at each end).
   */
  public open var contactsReported: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_CONTACTS_REPORTED,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_CONTACTS_REPORTED,
          NIL)
    }

  /**
   * Continuous collision detection mode.
   *
   * Continuous collision detection tries to predict where a moving body will collide instead of moving it and correcting its movement after collision. Continuous collision detection is slower, but more precise and misses fewer collisions with small, fast-moving objects. Raycasting and shapecasting methods are available. See [enum CCDMode] for details.
   */
  public open var continuousCd: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_CONTINUOUS_CD,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_CONTINUOUS_CD,
          NIL)
    }

  /**
   * If `true`, internal force integration is disabled for this body. Aside from collision response, the body will only move as determined by the [_integrateForces] function.
   */
  public open var customIntegrator: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_CUSTOM_INTEGRATOR,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_CUSTOM_INTEGRATOR,
          NIL)
    }

  /**
   * The body's friction. Values range from `0` (frictionless) to `1` (maximum friction).
   *
   * Deprecated, use [godot.PhysicsMaterial.friction] instead via [physicsMaterialOverride].
   */
  public open var friction: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_FRICTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_FRICTION, NIL)
    }

  /**
   * Multiplies the gravity applied to the body. The body's gravity is calculated from the **Default Gravity** value in **Project > Project Settings > Physics > 2d** and/or any additional gravity vector applied by [godot.Area2D]s.
   */
  public open var gravityScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_GRAVITY_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_GRAVITY_SCALE,
          NIL)
    }

  /**
   * The body's moment of inertia. This is like mass, but for rotation: it determines how much torque it takes to rotate the body. The moment of inertia is usually computed automatically from the mass and the shapes, but this function allows you to set a custom value. Set 0 inertia to return to automatically computing it.
   */
  public open var inertia: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_INERTIA, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_INERTIA, NIL)
    }

  /**
   * Damps the body's [linearVelocity]. If `-1`, the body will use the **Default Linear Damp** in **Project > Project Settings > Physics > 2d**.
   *
   * See [godot.ProjectSettings.physics/2d/defaultLinearDamp] for more details about damping.
   */
  public open var linearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_LINEAR_DAMP,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_LINEAR_DAMP, NIL)
    }

  /**
   * The body's linear velocity.
   */
  public open var linearVelocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_LINEAR_VELOCITY,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_LINEAR_VELOCITY,
          NIL)
    }

  /**
   * The body's mass.
   */
  public open var mass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_MASS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_MASS, NIL)
    }

  /**
   * The body's mode. See [enum Mode] for possible values.
   */
  public open var mode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_MODE, NIL)
    }

  /**
   * The physics material override for the body.
   *
   * If a material is assigned to this property, it will be used instead of any other physics material, such as an inherited one.
   */
  public open var physicsMaterialOverride: PhysicsMaterial?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_PHYSICS_MATERIAL_OVERRIDE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_PHYSICS_MATERIAL_OVERRIDE, NIL)
    }

  /**
   * If `true`, the body will not move and will not calculate forces until woken up by another body through, for example, a collision, or by using the [applyImpulse] or [addForce] methods.
   */
  public open var sleeping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_SLEEPING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_SLEEPING, NIL)
    }

  /**
   * The body's weight based on its mass and the **Default Gravity** value in **Project > Project Settings > Physics > 2d**.
   */
  public open var weight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_WEIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_WEIGHT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RIGIDBODY2D)
  }

  @CoreTypeHelper
  public open fun appliedForce(schedule: Vector2.() -> Unit): Vector2 = appliedForce.apply{
      schedule(this)
      appliedForce = this
  }


  @CoreTypeHelper
  public open fun linearVelocity(schedule: Vector2.() -> Unit): Vector2 = linearVelocity.apply{
      schedule(this)
      linearVelocity = this
  }


  public open fun _bodyEnterTree(arg0: Long): Unit {
  }

  public open fun _bodyExitTree(arg0: Long): Unit {
  }

  public open fun _directStateChanged(arg0: Object): Unit {
  }

  /**
   * Allows you to read and safely modify the simulation state for the object. Use this instead of [godot.Node.PhysicsProcess] if you need to directly change the body's `position` or other physics properties. By default, it works in addition to the usual physics behavior, but [customIntegrator] allows you to disable the default behavior and write custom force integration for a body.
   */
  public open fun _integrateForces(state: Physics2DDirectBodyState): Unit {
  }

  public open fun _reloadPhysicsCharacteristics(): Unit {
  }

  /**
   * Adds a constant directional force without affecting rotation.
   */
  public open fun addCentralForce(force: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_ADD_CENTRAL_FORCE, NIL)
  }

  /**
   * Adds a positioned force to the body. Both the force and the offset from the body origin are in global coordinates.
   */
  public open fun addForce(offset: Vector2, force: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset, VECTOR2 to force)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_ADD_FORCE, NIL)
  }

  /**
   * Adds a constant rotational force.
   */
  public open fun addTorque(torque: Double): Unit {
    TransferContext.writeArguments(DOUBLE to torque)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_ADD_TORQUE, NIL)
  }

  /**
   * Applies a directional impulse without affecting rotation.
   */
  public open fun applyCentralImpulse(impulse: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to impulse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_APPLY_CENTRAL_IMPULSE,
        NIL)
  }

  /**
   * Applies a positioned impulse to the body. An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason it should only be used when simulating one-time impacts (use the "_force" functions otherwise). The position uses the rotation of the global coordinate system, but is centered at the object's origin.
   */
  public open fun applyImpulse(offset: Vector2, impulse: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset, VECTOR2 to impulse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_APPLY_IMPULSE, NIL)
  }

  /**
   * Applies a rotational impulse to the body.
   */
  public open fun applyTorqueImpulse(torque: Double): Unit {
    TransferContext.writeArguments(DOUBLE to torque)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_APPLY_TORQUE_IMPULSE,
        NIL)
  }

  /**
   * Returns a list of the bodies colliding with this one. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, list of collisions is updated once per frame and before the physics step. Consider using signals instead.
   */
  public open fun getCollidingBodies(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_GET_COLLIDING_BODIES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Sets the body's velocity on the given axis. The velocity in the given vector axis will be set as the given vector length. This is useful for jumping behavior.
   */
  public open fun setAxisVelocity(axisVelocity: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to axisVelocity)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_SET_AXIS_VELOCITY, NIL)
  }

  /**
   * Returns `true` if a collision would result from moving in the given vector. `margin` increases the size of the shapes involved in the collision detection, and `result` is an object of type [godot.Physics2DTestMotionResult], which contains additional information about the collision (should there be one).
   */
  public open fun testMotion(
    motion: Vector2,
    infiniteInertia: Boolean = true,
    margin: Double = 0.08,
    result: Physics2DTestMotionResult? = null
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to motion, BOOL to infiniteInertia, DOUBLE to margin,
        OBJECT to result)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY2D_TEST_MOTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public enum class Mode(
    id: Long
  ) {
    /**
     * Rigid mode. The body behaves as a physical object. It collides with other bodies and responds to forces applied to it. This is the default mode.
     */
    MODE_RIGID(0),
    /**
     * Static mode. The body behaves like a [godot.StaticBody2D] and does not move.
     */
    MODE_STATIC(1),
    /**
     * Character mode. Similar to [MODE_RIGID], but the body can not rotate.
     */
    MODE_CHARACTER(2),
    /**
     * Kinematic mode. The body behaves like a [godot.KinematicBody2D], and must be moved by code.
     */
    MODE_KINEMATIC(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CCDMode(
    id: Long
  ) {
    /**
     * Continuous collision detection disabled. This is the fastest way to detect body collisions, but can miss small, fast-moving objects.
     */
    CCD_MODE_DISABLED(0),
    /**
     * Continuous collision detection enabled using raycasting. This is faster than shapecasting but less precise.
     */
    CCD_MODE_CAST_RAY(1),
    /**
     * Continuous collision detection enabled using shapecasting. This is the slowest CCD method and the most precise.
     */
    CCD_MODE_CAST_SHAPE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Continuous collision detection enabled using raycasting. This is faster than shapecasting but less precise.
     */
    public final const val CCD_MODE_CAST_RAY: Long = 1

    /**
     * Continuous collision detection enabled using shapecasting. This is the slowest CCD method and the most precise.
     */
    public final const val CCD_MODE_CAST_SHAPE: Long = 2

    /**
     * Continuous collision detection disabled. This is the fastest way to detect body collisions, but can miss small, fast-moving objects.
     */
    public final const val CCD_MODE_DISABLED: Long = 0

    /**
     * Character mode. Similar to [MODE_RIGID], but the body can not rotate.
     */
    public final const val MODE_CHARACTER: Long = 2

    /**
     * Kinematic mode. The body behaves like a [godot.KinematicBody2D], and must be moved by code.
     */
    public final const val MODE_KINEMATIC: Long = 3

    /**
     * Rigid mode. The body behaves as a physical object. It collides with other bodies and responds to forces applied to it. This is the default mode.
     */
    public final const val MODE_RIGID: Long = 0

    /**
     * Static mode. The body behaves like a [godot.StaticBody2D] and does not move.
     */
    public final const val MODE_STATIC: Long = 1
  }
}
