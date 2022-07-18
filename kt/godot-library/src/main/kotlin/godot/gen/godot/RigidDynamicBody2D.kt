// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

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
 * Physics Body which is moved by 2D physics simulation. Useful for objects that have gravity and can be pushed by other objects.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/148](https://godotengine.org/asset-library/asset/148)
 *
 * This node implements simulated 2D physics. You do not control a RigidDynamicBody2D directly. Instead, you apply forces to it (gravity, impulses, etc.) and the physics simulation calculates the resulting movement based on its mass, friction, and other physical properties.
 *
 * You can switch the body's behavior using [lockRotation], [freeze], and [freezeMode].
 *
 * **Note:** You should not change a RigidDynamicBody2D's `position` or `linear_velocity` every frame or even very often. If you need to directly affect the body's state, use [_integrateForces], which allows you to directly access the physics state.
 *
 * Please also keep in mind that physics bodies manage their own transform which overwrites the ones you set. So any direct or indirect transformation (including scaling of the node or its parent) will be visible in the editor only, and immediately reset at runtime.
 *
 * If you need to override the default physics behavior or add a transformation at runtime, you can write a custom force integration. See [customIntegrator].
 */
@GodotBaseType
public open class RigidDynamicBody2D : PhysicsBody2D() {
  /**
   * Emitted when a collision with another [godot.PhysicsBody2D] or [godot.TileMap] occurs. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.TileMap]s are detected if the [godot.TileSet] has Collision [godot.Shape2D]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody2D] or [godot.TileMap].
   */
  public val bodyEntered: Signal1<Node> by signal("body")

  /**
   * Emitted when one of this RigidDynamicBody2D's [godot.Shape2D]s collides with another [godot.PhysicsBody2D] or [godot.TileMap]'s [godot.Shape2D]s. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.TileMap]s are detected if the [godot.TileSet] has Collision [godot.Shape2D]s.
   *
   * `body_rid` the [RID] of the other [godot.PhysicsBody2D] or [godot.TileSet]'s [godot.CollisionObject2D] used by the [godot.PhysicsServer2D].
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody2D] or [godot.TileMap].
   *
   * `body_shape_index` the index of the [godot.Shape2D] of the other [godot.PhysicsBody2D] or [godot.TileMap] used by the [godot.PhysicsServer2D]. Get the [godot.CollisionShape2D] node with `body.shape_owner_get_owner(body.shape_find_owner(body_shape_index))`.
   *
   * `local_shape_index` the index of the [godot.Shape2D] of this RigidDynamicBody2D used by the [godot.PhysicsServer2D]. Get the [godot.CollisionShape2D] node with `self.shape_owner_get_owner(self.shape_find_owner(local_shape_index))`.
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
   * Emitted when the collision with another [godot.PhysicsBody2D] or [godot.TileMap] ends. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.TileMap]s are detected if the [godot.TileSet] has Collision [godot.Shape2D]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody2D] or [godot.TileMap].
   */
  public val bodyExited: Signal1<Node> by signal("body")

  /**
   * Emitted when the collision between one of this RigidDynamicBody2D's [godot.Shape2D]s and another [godot.PhysicsBody2D] or [godot.TileMap]'s [godot.Shape2D]s ends. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions. [godot.TileMap]s are detected if the [godot.TileSet] has Collision [godot.Shape2D]s.
   *
   * `body_rid` the [RID] of the other [godot.PhysicsBody2D] or [godot.TileSet]'s [godot.CollisionObject2D] used by the [godot.PhysicsServer2D].
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody2D] or [godot.TileMap].
   *
   * `body_shape_index` the index of the [godot.Shape2D] of the other [godot.PhysicsBody2D] or [godot.TileMap] used by the [godot.PhysicsServer2D]. Get the [godot.CollisionShape2D] node with `body.shape_owner_get_owner(body.shape_find_owner(body_shape_index))`.
   *
   * `local_shape_index` the index of the [godot.Shape2D] of this RigidDynamicBody2D used by the [godot.PhysicsServer2D]. Get the [godot.CollisionShape2D] node with `self.shape_owner_get_owner(self.shape_find_owner(local_shape_index))`.
   */
  public val bodyShapeExited: Signal4<RID, Node, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  /**
   * The body's mass.
   */
  public var mass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_MASS,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_MASS,
          NIL.ordinal)
    }

  /**
   * The body's moment of inertia. This is like mass, but for rotation: it determines how much torque it takes to rotate the body. The moment of inertia is usually computed automatically from the mass and the shapes, but this property allows you to set a custom value.
   *
   * If set to `0`, inertia is automatically computed (default value).
   */
  public var inertia: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_INERTIA,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_INERTIA,
          NIL.ordinal)
    }

  /**
   * Defines the way the body's center of mass is set. See [enum CenterOfMassMode] for possible values.
   */
  public var centerOfMassMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_CENTER_OF_MASS_MODE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_CENTER_OF_MASS_MODE, NIL.ordinal)
    }

  /**
   * The body's custom center of mass, relative to the body's origin position, when [centerOfMassMode] is set to [CENTER_OF_MASS_MODE_CUSTOM]. This is the balanced point of the body, where applied forces only cause linear acceleration. Applying forces outside of the center of mass causes angular acceleration.
   *
   * When [centerOfMassMode] is set to [CENTER_OF_MASS_MODE_AUTO] (default value), the center of mass is automatically computed.
   */
  public var centerOfMass: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_CENTER_OF_MASS,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_CENTER_OF_MASS,
          NIL.ordinal)
    }

  /**
   * The physics material override for the body.
   *
   * If a material is assigned to this property, it will be used instead of any other physics material, such as an inherited one.
   */
  public var physicsMaterialOverride: PhysicsMaterial?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_PHYSICS_MATERIAL_OVERRIDE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_PHYSICS_MATERIAL_OVERRIDE, NIL.ordinal)
    }

  /**
   * Multiplies the gravity applied to the body. The body's gravity is calculated from the **Default Gravity** value in **Project > Project Settings > Physics > 2d** and/or any additional gravity vector applied by [godot.Area2D]s.
   */
  public var gravityScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_GRAVITY_SCALE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_GRAVITY_SCALE,
          NIL.ordinal)
    }

  /**
   * If `true`, internal force integration is disabled for this body. Aside from collision response, the body will only move as determined by the [_integrateForces] function.
   */
  public var customIntegrator: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_IS_USING_CUSTOM_INTEGRATOR, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_USE_CUSTOM_INTEGRATOR, NIL.ordinal)
    }

  /**
   * Continuous collision detection mode.
   *
   * Continuous collision detection tries to predict where a moving body will collide instead of moving it and correcting its movement after collision. Continuous collision detection is slower, but more precise and misses fewer collisions with small, fast-moving objects. Raycasting and shapecasting methods are available. See [enum CCDMode] for details.
   */
  public var continuousCd: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_CONTINUOUS_COLLISION_DETECTION_MODE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_CONTINUOUS_COLLISION_DETECTION_MODE,
          NIL.ordinal)
    }

  /**
   * The maximum number of contacts that will be recorded. Requires [contactMonitor] to be set to `true`.
   *
   * **Note:** The number of contacts is different from the number of collisions. Collisions between parallel edges will result in two contacts (one at each end).
   */
  public var contactsReported: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_MAX_CONTACTS_REPORTED, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_MAX_CONTACTS_REPORTED, NIL.ordinal)
    }

  /**
   * If `true`, the body will emit signals when it collides with another RigidDynamicBody2D. See also [contactsReported].
   */
  public var contactMonitor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_IS_CONTACT_MONITOR_ENABLED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_CONTACT_MONITOR,
          NIL.ordinal)
    }

  /**
   * If `true`, the body will not move and will not calculate forces until woken up by another body through, for example, a collision, or by using the [applyImpulse] or [applyForce] methods.
   */
  public var sleeping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_IS_SLEEPING,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_SLEEPING,
          NIL.ordinal)
    }

  /**
   * If `true`, the body can enter sleep mode when there is no movement. See [sleeping].
   */
  public var canSleep: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_IS_ABLE_TO_SLEEP,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_CAN_SLEEP,
          NIL.ordinal)
    }

  /**
   * If `true`, the body cannot rotate. Gravity and forces only apply linear movement.
   */
  public var lockRotation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_IS_LOCK_ROTATION_ENABLED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_LOCK_ROTATION_ENABLED, NIL.ordinal)
    }

  /**
   * If `true`, the body is frozen. Gravity and forces are not applied anymore.
   *
   * See [freezeMode] to set the body's behavior when frozen.
   *
   * For a body that is always frozen, use [godot.StaticBody2D] or [godot.AnimatableBody2D] instead.
   */
  public var freeze: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_IS_FREEZE_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_FREEZE_ENABLED,
          NIL.ordinal)
    }

  /**
   * The body's freeze mode. Can be used to set the body's behavior when [freeze] is enabled. See [enum FreezeMode] for possible values.
   *
   * For a body that is always frozen, use [godot.StaticBody2D] or [godot.AnimatableBody2D] instead.
   */
  public var freezeMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_FREEZE_MODE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_FREEZE_MODE,
          NIL.ordinal)
    }

  /**
   * The body's linear velocity in pixels per second. Can be used sporadically, but **don't set this every frame**, because physics may run in another thread and runs at a different granularity. Use [_integrateForces] as your process loop for precise control of the body state.
   */
  public var linearVelocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_LINEAR_VELOCITY,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_LINEAR_VELOCITY,
          NIL.ordinal)
    }

  /**
   * Defines how [linearDamp] is applied. See [enum DampMode] for possible values.
   */
  public var linearDampMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_LINEAR_DAMP_MODE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_LINEAR_DAMP_MODE, NIL.ordinal)
    }

  /**
   * Damps the body's movement. By default, the body will use the **Default Linear Damp** in **Project > Project Settings > Physics > 2d** or any value override set by an [godot.Area2D] the body is in. Depending on [linearDampMode], you can set [linearDamp] to be added to or to replace the body's damping value.
   *
   * See [godot.ProjectSettings.physics/2d/defaultLinearDamp] for more details about damping.
   */
  public var linearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_LINEAR_DAMP,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_LINEAR_DAMP,
          NIL.ordinal)
    }

  /**
   * The body's rotational velocity in *radians* per second.
   */
  public var angularVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_ANGULAR_VELOCITY, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_ANGULAR_VELOCITY, NIL.ordinal)
    }

  /**
   * Defines how [angularDamp] is applied. See [enum DampMode] for possible values.
   */
  public var angularDampMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_ANGULAR_DAMP_MODE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_ANGULAR_DAMP_MODE, NIL.ordinal)
    }

  /**
   * Damps the body's rotation. By default, the body will use the **Default Angular Damp** in **Project > Project Settings > Physics > 2d** or any value override set by an [godot.Area2D] the body is in. Depending on [angularDampMode], you can set [angularDamp] to be added to or to replace the body's damping value.
   *
   * See [godot.ProjectSettings.physics/2d/defaultAngularDamp] for more details about damping.
   */
  public var angularDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_ANGULAR_DAMP,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_ANGULAR_DAMP,
          NIL.ordinal)
    }

  /**
   * The body's total constant positional forces applied during each physics update.
   *
   * See [addConstantForce] and [addConstantCentralForce].
   */
  public var constantForce: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_CONSTANT_FORCE,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_CONSTANT_FORCE,
          NIL.ordinal)
    }

  /**
   * The body's total constant rotational forces applied during each physics update.
   *
   * See [addConstantTorque].
   */
  public var constantTorque: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_CONSTANT_TORQUE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_CONSTANT_TORQUE,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RIGIDDYNAMICBODY2D)
  }

  /**
   * Allows you to read and safely modify the simulation state for the object. Use this instead of [godot.Node.PhysicsProcess] if you need to directly change the body's `position` or other physics properties. By default, it works in addition to the usual physics behavior, but [customIntegrator] allows you to disable the default behavior and write custom force integration for a body.
   */
  public open fun _integrateForces(state: PhysicsDirectBodyState2D): Unit {
  }

  /**
   * Sets the body's velocity on the given axis. The velocity in the given vector axis will be set as the given vector length. This is useful for jumping behavior.
   */
  public fun setAxisVelocity(axisVelocity: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to axisVelocity)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_AXIS_VELOCITY,
        NIL.ordinal)
  }

  /**
   * Applies a directional impulse without affecting rotation.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * This is equivalent to using [applyImpulse] at the body's center of mass.
   */
  public fun applyCentralImpulse(impulse: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to impulse)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_APPLY_CENTRAL_IMPULSE,
        NIL.ordinal)
  }

  /**
   * Applies a positioned impulse to the body.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * `position` is the offset from the body origin in global coordinates.
   */
  public fun applyImpulse(impulse: Vector2, position: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to impulse, VECTOR2 to position)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_APPLY_IMPULSE,
        NIL.ordinal)
  }

  /**
   * Applies a rotational impulse to the body without affecting the position.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   */
  public fun applyTorqueImpulse(torque: Double): Unit {
    TransferContext.writeArguments(DOUBLE to torque)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_APPLY_TORQUE_IMPULSE,
        NIL.ordinal)
  }

  /**
   * Applies a directional force without affecting rotation. A force is time dependent and meant to be applied every physics update.
   *
   * This is equivalent to using [applyForce] at the body's center of mass.
   */
  public fun applyCentralForce(force: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_APPLY_CENTRAL_FORCE,
        NIL.ordinal)
  }

  /**
   * Applies a positioned force to the body. A force is time dependent and meant to be applied every physics update.
   *
   * `position` is the offset from the body origin in global coordinates.
   */
  public fun applyForce(force: Vector2, position: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to force, VECTOR2 to position)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_APPLY_FORCE,
        NIL.ordinal)
  }

  /**
   * Applies a rotational force without affecting position. A force is time dependent and meant to be applied every physics update.
   */
  public fun applyTorque(torque: Double): Unit {
    TransferContext.writeArguments(DOUBLE to torque)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_APPLY_TORQUE,
        NIL.ordinal)
  }

  /**
   * Adds a constant directional force without affecting rotation that keeps being applied over time until cleared with `constant_force = Vector2(0, 0)`.
   *
   * This is equivalent to using [addConstantForce] at the body's center of mass.
   */
  public fun addConstantCentralForce(force: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_ADD_CONSTANT_CENTRAL_FORCE, NIL.ordinal)
  }

  /**
   * Adds a constant positioned force to the body that keeps being applied over time until cleared with `constant_force = Vector2(0, 0)`.
   *
   * `position` is the offset from the body origin in global coordinates.
   */
  public fun addConstantForce(force: Vector2, position: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to force, VECTOR2 to position)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_ADD_CONSTANT_FORCE,
        NIL.ordinal)
  }

  /**
   * Adds a constant rotational force without affecting position that keeps being applied over time until cleared with `constant_torque = 0`.
   */
  public fun addConstantTorque(torque: Double): Unit {
    TransferContext.writeArguments(DOUBLE to torque)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_ADD_CONSTANT_TORQUE,
        NIL.ordinal)
  }

  /**
   * Returns a list of the bodies colliding with this one. Requires [contactMonitor] to be set to `true` and [contactsReported] to be set high enough to detect all the collisions.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, list of collisions is updated once per frame and before the physics step. Consider using signals instead.
   */
  public fun getCollidingBodies(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_COLLIDING_BODIES,
        ARRAY.ordinal)
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
