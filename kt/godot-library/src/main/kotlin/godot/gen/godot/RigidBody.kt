// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.RID
import godot.core.TransferContext
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
 * Physics Body whose position is determined through physics simulation in 3D space.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/675](https://godotengine.org/asset-library/asset/675)
 *
 * This is the node that implements full 3D physics. This means that you do not control a RigidBody directly. Instead, you can apply forces to it (gravity, impulses, etc.), and the physics simulation will calculate the resulting movement, collision, bouncing, rotating, etc.
 *
 * A RigidBody has 4 behavior [mode]s: Rigid, Static, Character, and Kinematic.
 *
 * **Note:** Don't change a RigidBody's position every frame or very often. Sporadic changes work fine, but physics runs at a different granularity (fixed Hz) than usual rendering (process callback) and maybe even in a separate thread, so changing this from a process loop may result in strange behavior. If you need to directly affect the body's state, use [_integrateForces], which allows you to directly access the physics state.
 *
 * If you need to override the default physics behavior, you can write a custom force integration function. See [customIntegrator].
 *
 * With Bullet physics (the default), the center of mass is the RigidBody3D center. With GodotPhysics, the center of mass is the average of the [godot.CollisionShape] centers.
 */
@GodotBaseType
public open class RigidBody : PhysicsBody() {
  /**
   * Emitted when a collision with another [godot.PhysicsBody] or [godot.GridMap] occurs. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody] or [godot.GridMap].
   */
  public val bodyEntered: Signal1<Node> by signal("body")

  /**
   * Emitted when the collision with another [godot.PhysicsBody] or [godot.GridMap] ends. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody] or [godot.GridMap].
   */
  public val bodyExited: Signal1<Node> by signal("body")

  /**
   * Emitted when one of this RigidBody's [godot.Shape]s collides with another [godot.PhysicsBody] or [godot.GridMap]'s [godot.Shape]s. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape]s.
   *
   * `body_rid` the [RID] of the other [godot.PhysicsBody] or [godot.MeshLibrary]'s [godot.CollisionObject] used by the [godot.PhysicsServer].
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody] or [godot.GridMap].
   *
   * `body_shape_index` the index of the [godot.Shape] of the other [godot.PhysicsBody] or [godot.GridMap] used by the [godot.PhysicsServer]. Get the [godot.CollisionShape] node with `body.shape_owner_get_owner(body_shape_index)`.
   *
   * `local_shape_index` the index of the [godot.Shape] of this RigidBody used by the [godot.PhysicsServer]. Get the [godot.CollisionShape] node with `self.shape_owner_get_owner(local_shape_index)`.
   *
   * **Note:** Bullet physics cannot identify the shape index when using a [godot.ConcavePolygonShape]. Don't use multiple [godot.CollisionShape]s when using a [godot.ConcavePolygonShape] with Bullet physics if you need shape indices.
   */
  public val bodyShapeEntered: Signal4<RID, Node, Long, Long> by signal("body_rid", "body",
      "body_shape_index", "local_shape_index")

  /**
   * Emitted when the collision between one of this RigidBody's [godot.Shape]s and another [godot.PhysicsBody] or [godot.GridMap]'s [godot.Shape]s ends. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape]s.
   *
   * `body_rid` the [RID] of the other [godot.PhysicsBody] or [godot.MeshLibrary]'s [godot.CollisionObject] used by the [godot.PhysicsServer]. [godot.GridMap]s are detected if the Meshes have [godot.Shape]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody] or [godot.GridMap].
   *
   * `body_shape_index` the index of the [godot.Shape] of the other [godot.PhysicsBody] or [godot.GridMap] used by the [godot.PhysicsServer]. Get the [godot.CollisionShape] node with `body.shape_owner_get_owner(body_shape_index)`.
   *
   * `local_shape_index` the index of the [godot.Shape] of this RigidBody used by the [godot.PhysicsServer]. Get the [godot.CollisionShape] node with `self.shape_owner_get_owner(local_shape_index)`.
   *
   * **Note:** Bullet physics cannot identify the shape index when using a [godot.ConcavePolygonShape]. Don't use multiple [godot.CollisionShape]s when using a [godot.ConcavePolygonShape] with Bullet physics if you need shape indices.
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
   * Damps RigidBody's rotational forces.
   *
   * See [godot.ProjectSettings.physics/3d/defaultAngularDamp] for more details about damping.
   */
  public open var angularDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_ANGULAR_DAMP,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_ANGULAR_DAMP, NIL)
    }

  /**
   * The body's rotational velocity in axis-angle format. The magnitude of the vector is the rotation rate in *radians* per second.
   */
  public open var angularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_ANGULAR_VELOCITY,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_ANGULAR_VELOCITY,
          NIL)
    }

  /**
   * Lock the body's rotation in the X axis.
   */
  public open var axisLockAngularX: Boolean
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_AXIS_LOCK_ANGULAR_X,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_AXIS_LOCK_ANGULAR_X,
          NIL)
    }

  /**
   * Lock the body's rotation in the Y axis.
   */
  public open var axisLockAngularY: Boolean
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_AXIS_LOCK_ANGULAR_Y,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_AXIS_LOCK_ANGULAR_Y,
          NIL)
    }

  /**
   * Lock the body's rotation in the Z axis.
   */
  public open var axisLockAngularZ: Boolean
    get() {
      TransferContext.writeArguments(LONG to 32L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_AXIS_LOCK_ANGULAR_Z,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 32L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_AXIS_LOCK_ANGULAR_Z,
          NIL)
    }

  /**
   * Lock the body's movement in the X axis.
   */
  public open var axisLockLinearX: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_AXIS_LOCK_LINEAR_X,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_AXIS_LOCK_LINEAR_X,
          NIL)
    }

  /**
   * Lock the body's movement in the Y axis.
   */
  public open var axisLockLinearY: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_AXIS_LOCK_LINEAR_Y,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_AXIS_LOCK_LINEAR_Y,
          NIL)
    }

  /**
   * Lock the body's movement in the Z axis.
   */
  public open var axisLockLinearZ: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_AXIS_LOCK_LINEAR_Z,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_AXIS_LOCK_LINEAR_Z,
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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_BOUNCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_BOUNCE, NIL)
    }

  /**
   * If `true`, the body can enter sleep mode when there is no movement. See [sleeping].
   *
   * **Note:** A RigidBody3D will never enter sleep mode automatically if its [mode] is [MODE_CHARACTER]. It can still be put to sleep manually by setting its [sleeping] property to `true`.
   */
  public open var canSleep: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_CAN_SLEEP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_CAN_SLEEP, NIL)
    }

  /**
   * If `true`, the RigidBody will emit signals when it collides with another RigidBody. See also [contactsReported].
   */
  public open var contactMonitor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_CONTACT_MONITOR,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_CONTACT_MONITOR,
          NIL)
    }

  /**
   * The maximum number of contacts that will be recorded. Requires [contactMonitor] to be set to `true`.
   *
   * **Note:** The number of contacts is different from the number of collisions. Collisions between parallel edges will result in two contacts (one at each end), and collisions between parallel faces will result in four contacts (one at each corner).
   */
  public open var contactsReported: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_CONTACTS_REPORTED,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_CONTACTS_REPORTED,
          NIL)
    }

  /**
   * If `true`, continuous collision detection is used.
   *
   * Continuous collision detection tries to predict where a moving body will collide, instead of moving it and correcting its movement if it collided. Continuous collision detection is more precise, and misses fewer impacts by small, fast-moving objects. Not using continuous collision detection is faster to compute, but can miss small, fast-moving objects.
   */
  public open var continuousCd: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_CONTINUOUS_CD, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_CONTINUOUS_CD, NIL)
    }

  /**
   * If `true`, internal force integration will be disabled (like gravity or air friction) for this body. Other than collision response, the body will only move as determined by the [_integrateForces] function, if defined.
   */
  public open var customIntegrator: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_CUSTOM_INTEGRATOR,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_CUSTOM_INTEGRATOR,
          NIL)
    }

  /**
   * The body's friction, from 0 (frictionless) to 1 (max friction).
   *
   * Deprecated, use [godot.PhysicsMaterial.friction] instead via [physicsMaterialOverride].
   */
  public open var friction: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_FRICTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_FRICTION, NIL)
    }

  /**
   * This is multiplied by the global 3D gravity setting found in **Project > Project Settings > Physics > 3d** to produce RigidBody's gravity. For example, a value of 1 will be normal gravity, 2 will apply double gravity, and 0.5 will apply half gravity to this object.
   */
  public open var gravityScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_GRAVITY_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_GRAVITY_SCALE, NIL)
    }

  /**
   * The body's linear damp. Cannot be less than -1.0. If this value is different from -1.0, any linear damp derived from the world or areas will be overridden.
   *
   * See [godot.ProjectSettings.physics/3d/defaultLinearDamp] for more details about damping.
   */
  public open var linearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_LINEAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_LINEAR_DAMP, NIL)
    }

  /**
   * The body's linear velocity in units per second. Can be used sporadically, but **don't set this every frame**, because physics may run in another thread and runs at a different granularity. Use [_integrateForces] as your process loop for precise control of the body state.
   */
  public open var linearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_LINEAR_VELOCITY,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_LINEAR_VELOCITY,
          NIL)
    }

  /**
   * The body's mass.
   */
  public open var mass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_MASS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_MASS, NIL)
    }

  /**
   * The body mode. See [enum Mode] for possible values.
   */
  public open var mode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_MODE, NIL)
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
          ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_PHYSICS_MATERIAL_OVERRIDE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_PHYSICS_MATERIAL_OVERRIDE, NIL)
    }

  /**
   * If `true`, the body will not move and will not calculate forces until woken up by another body through, for example, a collision, or by using the [applyImpulse] or [addForce] methods.
   */
  public open var sleeping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_SLEEPING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_SLEEPING, NIL)
    }

  /**
   * The body's weight based on its mass and the global 3D gravity. Global values are set in **Project > Project Settings > Physics > 3d**.
   */
  public open var weight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_WEIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_WEIGHT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RIGIDBODY)
  }

  @CoreTypeHelper
  public open fun angularVelocity(schedule: Vector3.() -> Unit): Vector3 = angularVelocity.apply{
      schedule(this)
      angularVelocity = this
  }


  @CoreTypeHelper
  public open fun linearVelocity(schedule: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
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
   * Called during physics processing, allowing you to read and safely modify the simulation state for the object. By default, it works in addition to the usual physics behavior, but the [customIntegrator] property allows you to disable the default behavior and do fully custom force integration for a body.
   */
  public open fun _integrateForces(state: PhysicsDirectBodyState): Unit {
  }

  public open fun _reloadPhysicsCharacteristics(): Unit {
  }

  /**
   * Adds a constant directional force (i.e. acceleration) without affecting rotation.
   *
   * This is equivalent to `add_force(force, Vector3(0,0,0))`.
   */
  public open fun addCentralForce(force: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_ADD_CENTRAL_FORCE, NIL)
  }

  /**
   * Adds a constant directional force (i.e. acceleration).
   *
   * The position uses the rotation of the global coordinate system, but is centered at the object's origin.
   */
  public open fun addForce(force: Vector3, position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_ADD_FORCE, NIL)
  }

  /**
   * Adds a constant rotational force (i.e. a motor) without affecting position.
   */
  public open fun addTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_ADD_TORQUE, NIL)
  }

  /**
   * Applies a directional impulse without affecting rotation.
   *
   * This is equivalent to `apply_impulse(Vector3(0,0,0), impulse)`.
   */
  public open fun applyCentralImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_APPLY_CENTRAL_IMPULSE,
        NIL)
  }

  /**
   * Applies a positioned impulse to the body. An impulse is time independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason it should only be used when simulating one-time impacts. The position uses the rotation of the global coordinate system, but is centered at the object's origin.
   */
  public open fun applyImpulse(position: Vector3, impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position, VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_APPLY_IMPULSE, NIL)
  }

  /**
   * Applies a torque impulse which will be affected by the body mass and shape. This will rotate the body around the `impulse` vector passed.
   */
  public open fun applyTorqueImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_APPLY_TORQUE_IMPULSE, NIL)
  }

  /**
   * Returns a list of the bodies colliding with this one. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, list of collisions is updated once per frame and before the physics step. Consider using signals instead.
   */
  public open fun getCollidingBodies(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_COLLIDING_BODIES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the inverse inertia tensor basis. This is used to calculate the angular acceleration resulting from a torque applied to the RigidBody.
   */
  public open fun getInverseInertiaTensor(): Basis {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_INVERSE_INERTIA_TENSOR, BASIS)
    return TransferContext.readReturnValue(BASIS, false) as Basis
  }

  /**
   * Sets an axis velocity. The velocity in the given vector axis will be set as the given vector length. This is useful for jumping behavior.
   */
  public open fun setAxisVelocity(axisVelocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to axisVelocity)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_AXIS_VELOCITY, NIL)
  }

  public enum class Mode(
    id: Long
  ) {
    /**
     * Rigid body mode. This is the "natural" state of a rigid body. It is affected by forces, and can move, rotate, and be affected by user code.
     */
    MODE_RIGID(0),
    /**
     * Static mode. The body behaves like a [godot.StaticBody], and can only move by user code.
     */
    MODE_STATIC(1),
    /**
     * Character body mode. This behaves like a rigid body, but can not rotate.
     */
    MODE_CHARACTER(2),
    /**
     * Kinematic body mode. The body behaves like a [godot.KinematicBody], and can only move by user code.
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

  public companion object {
    /**
     * Character body mode. This behaves like a rigid body, but can not rotate.
     */
    public final const val MODE_CHARACTER: Long = 2

    /**
     * Kinematic body mode. The body behaves like a [godot.KinematicBody], and can only move by user code.
     */
    public final const val MODE_KINEMATIC: Long = 3

    /**
     * Rigid body mode. This is the "natural" state of a rigid body. It is affected by forces, and can move, rotate, and be affected by user code.
     */
    public final const val MODE_RIGID: Long = 0

    /**
     * Static mode. The body behaves like a [godot.StaticBody], and can only move by user code.
     */
    public final const val MODE_STATIC: Long = 1
  }
}
