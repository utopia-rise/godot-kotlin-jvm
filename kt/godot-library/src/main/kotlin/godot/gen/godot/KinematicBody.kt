// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * Kinematic body 3D node.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/physics/kinematic_character_2d.html](https://docs.godotengine.org/en/latest/tutorials/physics/kinematic_character_2d.html)
 *
 * Kinematic bodies are special types of bodies that are meant to be user-controlled. They are not affected by physics at all; to other types of bodies, such as a character or a rigid body, these are the same as a static body. However, they have two main uses:
 *
 * **Simulated motion:** When these bodies are moved manually, either from code or from an [godot.AnimationPlayer] (with [godot.AnimationPlayer.playbackProcessMode] set to "physics"), the physics will automatically compute an estimate of their linear and angular velocity. This makes them very useful for moving platforms or other AnimationPlayer-controlled objects (like a door, a bridge that opens, etc).
 *
 * **Kinematic characters:** KinematicBody also has an API for moving objects (the [moveAndCollide] and [moveAndSlide] methods) while performing collision tests. This makes them really useful to implement characters that collide against a world, but that don't require advanced physics.
 */
@GodotBaseType
open class KinematicBody : PhysicsBody() {
  open var collision_safeMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_COLLISION_SAFE_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_SET_COLLISION_SAFE_MARGIN, NIL)
    }

  /**
   * Lock the body's X axis movement.
   */
  open var moveLockX: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_MOVE_LOCK_X,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_SET_MOVE_LOCK_X,
          NIL)
    }

  /**
   * Lock the body's Y axis movement.
   */
  open var moveLockY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_MOVE_LOCK_Y,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_SET_MOVE_LOCK_Y,
          NIL)
    }

  /**
   * Lock the body's Z axis movement.
   */
  open var moveLockZ: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_MOVE_LOCK_Z,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_SET_MOVE_LOCK_Z,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_KINEMATICBODY)
  }

  /**
   * Returns the surface normal of the floor at the last collision point. Only valid after calling [moveAndSlide] or [moveAndSlideWithSnap] and when [isOnFloor] returns `true`.
   */
  open fun getFloorNormal(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_FLOOR_NORMAL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the linear velocity of the floor at the last collision point. Only valid after calling [moveAndSlide] or [moveAndSlideWithSnap] and when [isOnFloor] returns `true`.
   */
  open fun getFloorVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_FLOOR_VELOCITY,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns a [godot.KinematicCollision], which contains information about a collision that occurred during the last [moveAndSlide] call. Since the body can collide several times in a single call to [moveAndSlide], you must specify the index of the collision in the range 0 to ([getSlideCount] - 1).
   */
  open fun getSlideCollision(slideIdx: Long): KinematicCollision? {
    TransferContext.writeArguments(LONG to slideIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_SLIDE_COLLISION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as KinematicCollision?
  }

  /**
   * Returns the number of times the body collided and changed direction during the last call to [moveAndSlide].
   */
  open fun getSlideCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_SLIDE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the body is on the ceiling. Only updates when calling [moveAndSlide].
   */
  open fun isOnCeiling(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_IS_ON_CEILING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body is on the floor. Only updates when calling [moveAndSlide].
   */
  open fun isOnFloor(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_IS_ON_FLOOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body is on a wall. Only updates when calling [moveAndSlide].
   */
  open fun isOnWall(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_IS_ON_WALL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Moves the body along the vector `rel_vec`. The body will stop if it collides. Returns a [godot.KinematicCollision], which contains information about the collision.
   *
   * If `test_only` is `true`, the body does not move but the would-be collision information is given.
   */
  open fun moveAndCollide(
    relVec: Vector3,
    infiniteInertia: Boolean = true,
    excludeRaycastShapes: Boolean = true,
    testOnly: Boolean = false
  ): KinematicCollision? {
    TransferContext.writeArguments(VECTOR3 to relVec, BOOL to infiniteInertia, BOOL to
        excludeRaycastShapes, BOOL to testOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_MOVE_AND_COLLIDE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as KinematicCollision?
  }

  /**
   * Moves the body along a vector. If the body collides with another, it will slide along the other body rather than stop immediately. If the other body is a [godot.KinematicBody] or [godot.RigidBody], it will also be affected by the motion of the other body. You can use this to make moving or rotating platforms, or to make nodes push other nodes.
   *
   * This method should be used in [godot.Node.PhysicsProcess] (or in a method called by [godot.Node.PhysicsProcess]), as it uses the physics step's `delta` value automatically in calculations. Otherwise, the simulation will run at an incorrect speed.
   *
   * `linear_velocity` is the velocity vector (typically meters per second). Unlike in [moveAndCollide], you should *not* multiply it by `delta` — the physics engine handles applying the velocity.
   *
   * `up_direction` is the up direction, used to determine what is a wall and what is a floor or a ceiling. If set to the default value of `Vector3(0, 0, 0)`, everything is considered a wall.
   *
   * If `stop_on_slope` is `true`, body will not slide on slopes when you include gravity in `linear_velocity` and the body is standing still.
   *
   * If the body collides, it will change direction a maximum of `max_slides` times before it stops.
   *
   * `floor_max_angle` is the maximum angle (in radians) where a slope is still considered a floor (or a ceiling), rather than a wall. The default value equals 45 degrees.
   *
   * If `infinite_inertia` is `true`, body will be able to push [godot.RigidBody] nodes, but it won't also detect any collisions with them. If `false`, it will interact with [godot.RigidBody] nodes like with [godot.StaticBody].
   *
   * Returns the `linear_velocity` vector, rotated and/or scaled if a slide collision occurred. To get detailed information about collisions that occurred, use [getSlideCollision].
   */
  open fun moveAndSlide(
    linearVelocity: Vector3,
    upDirection: Vector3 = Vector3(0.0, 0.0, 0.0),
    stopOnSlope: Boolean = false,
    maxSlides: Long = 4,
    floorMaxAngle: Double = 0.785398,
    infiniteInertia: Boolean = true
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to linearVelocity, VECTOR3 to upDirection, BOOL to
        stopOnSlope, LONG to maxSlides, DOUBLE to floorMaxAngle, BOOL to infiniteInertia)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_MOVE_AND_SLIDE,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Moves the body while keeping it attached to slopes. Similar to [moveAndSlide].
   *
   * As long as the `snap` vector is in contact with the ground, the body will remain attached to the surface. This means you must disable snap in order to jump, for example. You can do this by setting `snap` to `(0, 0, 0)` or by using [moveAndSlide] instead.
   */
  open fun moveAndSlideWithSnap(
    linearVelocity: Vector3,
    snap: Vector3,
    upDirection: Vector3 = Vector3(0.0, 0.0, 0.0),
    stopOnSlope: Boolean = false,
    maxSlides: Long = 4,
    floorMaxAngle: Double = 0.785398,
    infiniteInertia: Boolean = true
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to linearVelocity, VECTOR3 to snap, VECTOR3 to
        upDirection, BOOL to stopOnSlope, LONG to maxSlides, DOUBLE to floorMaxAngle, BOOL to
        infiniteInertia)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_MOVE_AND_SLIDE_WITH_SNAP, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Checks for collisions without moving the body. Virtually sets the node's position, scale and rotation to that of the given [godot.core.Transform], then tries to move the body along the vector `rel_vec`. Returns `true` if a collision would occur.
   */
  open fun testMove(
    from: Transform,
    relVec: Vector3,
    infiniteInertia: Boolean = true
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM to from, VECTOR3 to relVec, BOOL to infiniteInertia)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_TEST_MOVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
