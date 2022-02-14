// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

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
 * Physics Body which is moved by 3D physics simulation. Useful for objects that have gravity and can be pushed by other objects.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/675](https://godotengine.org/asset-library/asset/675)
 *
 * This is the node that implements full 3D physics. This means that you do not control a RigidDynamicBody3D directly. Instead, you can apply forces to it (gravity, impulses, etc.), and the physics simulation will calculate the resulting movement, collision, bouncing, rotating, etc.
 *
 * You can switch the body's behavior using [lockRotation], [freeze], and [freezeMode].
 *
 * **Note:** Don't change a RigidDynamicBody3D's position every frame or very often. Sporadic changes work fine, but physics runs at a different granularity (fixed Hz) than usual rendering (process callback) and maybe even in a separate thread, so changing this from a process loop may result in strange behavior. If you need to directly affect the body's state, use [_integrateForces], which allows you to directly access the physics state.
 *
 * If you need to override the default physics behavior, you can write a custom force integration function. See [customIntegrator].
 */
@GodotBaseType
public open class RigidDynamicBody3D : PhysicsBody3D() {
  /**
   * Emitted when a collision with another [godot.PhysicsBody3D] or [godot.GridMap] occurs. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape3D]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody3D] or [godot.GridMap].
   */
  public val bodyEntered: Signal1<Node> by signal("body")

  /**
   * Emitted when one of this RigidDynamicBody3D's [godot.Shape3D]s collides with another [godot.PhysicsBody3D] or [godot.GridMap]'s [godot.Shape3D]s. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape3D]s.
   *
   * `body_rid` the [RID] of the other [godot.PhysicsBody3D] or [godot.MeshLibrary]'s [godot.CollisionObject3D] used by the [godot.PhysicsServer3D].
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody3D] or [godot.GridMap].
   *
   * `body_shape_index` the index of the [godot.Shape3D] of the other [godot.PhysicsBody3D] or [godot.GridMap] used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `body.shape_owner_get_owner(body_shape_index)`.
   *
   * `local_shape_index` the index of the [godot.Shape3D] of this RigidDynamicBody3D used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `self.shape_owner_get_owner(local_shape_index)`.
   *
   * **Note:** Bullet physics cannot identify the shape index when using a [godot.ConcavePolygonShape3D]. Don't use multiple [godot.CollisionShape3D]s when using a [godot.ConcavePolygonShape3D] with Bullet physics if you need shape indices.
   */
  public val bodyShapeEntered: Signal4<RID, Node, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  /**
   * Emitted when the physics engine changes the body's sleeping state.
   *
   * **Note:** Changing the value [sleeping] will not trigger this signal. It is only emitted if the sleeping state is changed by the physics engine or `emit_signal("sleeping_state_changed")` is used.
   */
  public val sleepingStateChanged: Signal0 by signal()

  /**
   * Emitted when the collision with another [godot.PhysicsBody3D] or [godot.GridMap] ends. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape3D]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody3D] or [godot.GridMap].
   */
  public val bodyExited: Signal1<Node> by signal("body")

  /**
   * Emitted when the collision between one of this RigidDynamicBody3D's [godot.Shape3D]s and another [godot.PhysicsBody3D] or [godot.GridMap]'s [godot.Shape3D]s ends. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape3D]s.
   *
   * `body_rid` the [RID] of the other [godot.PhysicsBody3D] or [godot.MeshLibrary]'s [godot.CollisionObject3D] used by the [godot.PhysicsServer3D]. [godot.GridMap]s are detected if the Meshes have [godot.Shape3D]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody3D] or [godot.GridMap].
   *
   * `body_shape_index` the index of the [godot.Shape3D] of the other [godot.PhysicsBody3D] or [godot.GridMap] used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `body.shape_owner_get_owner(body_shape_index)`.
   *
   * `local_shape_index` the index of the [godot.Shape3D] of this RigidDynamicBody3D used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `self.shape_owner_get_owner(local_shape_index)`.
   *
   * **Note:** Bullet physics cannot identify the shape index when using a [godot.ConcavePolygonShape3D]. Don't use multiple [godot.CollisionShape3D]s when using a [godot.ConcavePolygonShape3D] with Bullet physics if you need shape indices.
   */
  public val bodyShapeExited: Signal4<RID, Node, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  /**
   * The body's mass.
   */
  public open var mass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_MASS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_MASS, NIL)
    }

  /**
   * The body's moment of inertia. This is like mass, but for rotation: it determines how much torque it takes to rotate the body on each axis. The moment of inertia is usually computed automatically from the mass and the shapes, but this property allows you to set a custom value.
   *
   * If set to `Vector3.ZERO`, inertia is automatically computed (default value).
   */
  public open var inertia: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_INERTIA,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_INERTIA,
          NIL)
    }

  /**
   * Defines the way the body's center of mass is set. See [enum CenterOfMassMode] for possible values.
   */
  public open var centerOfMassMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_CENTER_OF_MASS_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_CENTER_OF_MASS_MODE, NIL)
    }

  /**
   * The body's custom center of mass, relative to the body's origin position, when [centerOfMassMode] is set to [CENTER_OF_MASS_MODE_CUSTOM]. This is the balanced point of the body, where applied forces only cause linear acceleration. Applying forces outside of the center of mass causes angular acceleration.
   *
   * When [centerOfMassMode] is set to [CENTER_OF_MASS_MODE_AUTO] (default value), the center of mass is automatically computed.
   */
  public open var centerOfMass: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_CENTER_OF_MASS, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_CENTER_OF_MASS, NIL)
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
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_PHYSICS_MATERIAL_OVERRIDE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_PHYSICS_MATERIAL_OVERRIDE, NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  /**
   * This is multiplied by the global 3D gravity setting found in **Project > Project Settings > Physics > 3d** to produce RigidDynamicBody3D's gravity. For example, a value of 1 will be normal gravity, 2 will apply double gravity, and 0.5 will apply half gravity to this object.
   */
  public open var gravityScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_GRAVITY_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_GRAVITY_SCALE, NIL)
    }

  /**
   * If `true`, internal force integration will be disabled (like gravity or air friction) for this body. Other than collision response, the body will only move as determined by the [_integrateForces] function, if defined.
   */
  public open var customIntegrator: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_CUSTOM_INTEGRATOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_CUSTOM_INTEGRATOR, NIL)
    }

  /**
   * If `true`, continuous collision detection is used.
   *
   * Continuous collision detection tries to predict where a moving body will collide, instead of moving it and correcting its movement if it collided. Continuous collision detection is more precise, and misses fewer impacts by small, fast-moving objects. Not using continuous collision detection is faster to compute, but can miss small, fast-moving objects.
   */
  public open var continuousCd: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_CONTINUOUS_CD, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_CONTINUOUS_CD, NIL)
    }

  /**
   * The maximum number of contacts that will be recorded. Requires [contactMonitor] to be set to `true`.
   *
   * **Note:** The number of contacts is different from the number of collisions. Collisions between parallel edges will result in two contacts (one at each end), and collisions between parallel faces will result in four contacts (one at each corner).
   */
  public open var contactsReported: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_CONTACTS_REPORTED, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_CONTACTS_REPORTED, NIL)
    }

  /**
   * If `true`, the RigidDynamicBody3D will emit signals when it collides with another RigidDynamicBody3D. See also [contactsReported].
   */
  public open var contactMonitor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_CONTACT_MONITOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_CONTACT_MONITOR, NIL)
    }

  /**
   * If `true`, the body will not move and will not calculate forces until woken up by another body through, for example, a collision, or by using the [applyImpulse] or [applyForce] methods.
   */
  public open var sleeping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_SLEEPING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_SLEEPING,
          NIL)
    }

  /**
   * If `true`, the body can enter sleep mode when there is no movement. See [sleeping].
   */
  public open var canSleep: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_CAN_SLEEP,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_CAN_SLEEP,
          NIL)
    }

  /**
   * If `true`, the body cannot rotate. Gravity and forces only apply linear movement.
   */
  public open var lockRotation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_LOCK_ROTATION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_LOCK_ROTATION, NIL)
    }

  /**
   * If `true`, the body is frozen. Gravity and forces are not applied anymore.
   *
   * See [freezeMode] to set the body's behavior when frozen.
   *
   * For a body that is always frozen, use [godot.StaticBody3D] or [godot.AnimatableBody3D] instead.
   */
  public open var freeze: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_FREEZE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_FREEZE,
          NIL)
    }

  /**
   * The body's freeze mode. Can be used to set the body's behavior when [freeze] is enabled. See [enum FreezeMode] for possible values.
   *
   * For a body that is always frozen, use [godot.StaticBody3D] or [godot.AnimatableBody3D] instead.
   */
  public open var freezeMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_FREEZE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_FREEZE_MODE, NIL)
    }

  /**
   * The body's linear velocity in units per second. Can be used sporadically, but **don't set this every frame**, because physics may run in another thread and runs at a different granularity. Use [_integrateForces] as your process loop for precise control of the body state.
   */
  public open var linearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_LINEAR_VELOCITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_LINEAR_VELOCITY, NIL)
    }

  /**
   * Defines how [linearDamp] is applied. See [enum DampMode] for possible values.
   */
  public open var linearDampMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_LINEAR_DAMP_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_LINEAR_DAMP_MODE, NIL)
    }

  /**
   * Damps the body's movement. By default, the body will use the **Default Linear Damp** in **Project > Project Settings > Physics > 3d** or any value override set by an [godot.Area3D] the body is in. Depending on [linearDampMode], you can set [linearDamp] to be added to or to replace the body's damping value.
   *
   * See [godot.ProjectSettings.physics/3d/defaultLinearDamp] for more details about damping.
   */
  public open var linearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_LINEAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_LINEAR_DAMP, NIL)
    }

  /**
   * The RigidDynamicBody3D's rotational velocity in *radians* per second.
   */
  public open var angularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_ANGULAR_VELOCITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_ANGULAR_VELOCITY, NIL)
    }

  /**
   * Defines how [angularDamp] is applied. See [enum DampMode] for possible values.
   */
  public open var angularDampMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_ANGULAR_DAMP_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_ANGULAR_DAMP_MODE, NIL)
    }

  /**
   * Damps the body's rotation. By default, the body will use the **Default Angular Damp** in **Project > Project Settings > Physics > 3d** or any value override set by an [godot.Area3D] the body is in. Depending on [angularDampMode], you can set [angularDamp] to be added to or to replace the body's damping value.
   *
   * See [godot.ProjectSettings.physics/3d/defaultAngularDamp] for more details about damping.
   */
  public open var angularDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_ANGULAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_ANGULAR_DAMP, NIL)
    }

  /**
   * The body's total constant positional forces applied during each physics update.
   *
   * See [addConstantForce] and [addConstantCentralForce].
   */
  public open var constantForce: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_CONSTANT_FORCE, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_CONSTANT_FORCE, NIL)
    }

  /**
   * The body's total constant rotational forces applied during each physics update.
   *
   * See [addConstantTorque].
   */
  public open var constantTorque: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_CONSTANT_TORQUE, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_CONSTANT_TORQUE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RIGIDDYNAMICBODY3D)
  }

  /**
   * Called during physics processing, allowing you to read and safely modify the simulation state for the object. By default, it works in addition to the usual physics behavior, but the [customIntegrator] property allows you to disable the default behavior and do fully custom force integration for a body.
   */
  public open fun _integrateForces(state: PhysicsDirectBodyState3D): Unit {
  }

  /**
   * Returns the inverse inertia tensor basis. This is used to calculate the angular acceleration resulting from a torque applied to the [godot.RigidDynamicBody3D].
   */
  public open fun getInverseInertiaTensor(): Basis {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_INVERSE_INERTIA_TENSOR, BASIS)
    return TransferContext.readReturnValue(BASIS, false) as Basis
  }

  /**
   * Sets an axis velocity. The velocity in the given vector axis will be set as the given vector length. This is useful for jumping behavior.
   */
  public open fun setAxisVelocity(axisVelocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to axisVelocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_SET_AXIS_VELOCITY, NIL)
  }

  /**
   * Applies a directional impulse without affecting rotation.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * This is equivalent to using [applyImpulse] at the body's center of mass.
   */
  public open fun applyCentralImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_APPLY_CENTRAL_IMPULSE, NIL)
  }

  /**
   * Applies a positioned impulse to the body.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * `position` is the offset from the body origin in global coordinates.
   */
  public open fun applyImpulse(impulse: Vector3, position: Vector3 = Vector3Vector3(0.0, 0.0, 0.0)):
      Unit {
    TransferContext.writeArguments(VECTOR3 to impulse, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_APPLY_IMPULSE,
        NIL)
  }

  /**
   * Applies a rotational impulse to the body without affecting the position.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   */
  public open fun applyTorqueImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_APPLY_TORQUE_IMPULSE, NIL)
  }

  /**
   * Applies a directional force without affecting rotation. A force is time dependent and meant to be applied every physics update.
   *
   * This is equivalent to using [applyForce] at the body's center of mass.
   */
  public open fun applyCentralForce(force: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_APPLY_CENTRAL_FORCE, NIL)
  }

  /**
   * Applies a positioned force to the body. A force is time dependent and meant to be applied every physics update.
   *
   * `position` is the offset from the body origin in global coordinates.
   */
  public open fun applyForce(force: Vector3, position: Vector3 = Vector3Vector3(0.0, 0.0, 0.0)):
      Unit {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_APPLY_FORCE, NIL)
  }

  /**
   * Applies a rotational force without affecting position. A force is time dependent and meant to be applied every physics update.
   */
  public open fun applyTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_APPLY_TORQUE,
        NIL)
  }

  /**
   * Adds a constant directional force without affecting rotation that keeps being applied over time until cleared with `constant_force = Vector3(0, 0, 0)`.
   *
   * This is equivalent to using [addConstantForce] at the body's center of mass.
   */
  public open fun addConstantCentralForce(force: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_ADD_CONSTANT_CENTRAL_FORCE, NIL)
  }

  /**
   * Adds a constant positioned force to the body that keeps being applied over time until cleared with `constant_force = Vector3(0, 0, 0)`.
   *
   * `position` is the offset from the body origin in global coordinates.
   */
  public open fun addConstantForce(force: Vector3, position: Vector3 = Vector3Vector3(0.0, 0.0,
      0.0)): Unit {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_ADD_CONSTANT_FORCE, NIL)
  }

  /**
   * Adds a constant rotational force without affecting position that keeps being applied over time until cleared with `constant_torque = Vector3(0, 0, 0)`.
   */
  public open fun addConstantTorque(torque: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_ADD_CONSTANT_TORQUE, NIL)
  }

  /**
   * Returns a list of the bodies colliding with this one. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, list of collisions is updated once per frame and before the physics step. Consider using signals instead.
   */
  public open fun getCollidingBodies(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY3D_GET_COLLIDING_BODIES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public enum class FreezeMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DampMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CenterOfMassMode(
    id: Long
  ) {
    /**
     * In this mode, the body's center of mass is calculated automatically based on its shapes.
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
