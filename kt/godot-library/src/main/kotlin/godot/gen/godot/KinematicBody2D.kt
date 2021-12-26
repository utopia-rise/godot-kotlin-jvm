// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Kinematic body 2D node.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/120](https://godotengine.org/asset-library/asset/120)
 *
 * Kinematic bodies are special types of bodies that are meant to be user-controlled. They are not affected by physics at all; to other types of bodies, such as a character or a rigid body, these are the same as a static body. However, they have two main uses:
 *
 * **Simulated motion:** When these bodies are moved manually, either from code or from an [godot.AnimationPlayer] (with [godot.AnimationPlayer.playbackProcessMode] set to "physics"), the physics will automatically compute an estimate of their linear and angular velocity. This makes them very useful for moving platforms or other AnimationPlayer-controlled objects (like a door, a bridge that opens, etc).
 *
 * **Kinematic characters:** KinematicBody2D also has an API for moving objects (the [moveAndCollide] and [moveAndSlide] methods) while performing collision tests. This makes them really useful to implement characters that collide against a world, but don't require advanced physics.
 */
@GodotBaseType
public open class KinematicBody2D : PhysicsBody2D() {
  public open var collision_safeMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_GET_COLLISION_SAFE_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_SET_COLLISION_SAFE_MARGIN, NIL)
    }

  public open var motion_syncToPhysics: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_GET_MOTION_SYNC_TO_PHYSICS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_SET_MOTION_SYNC_TO_PHYSICS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_KINEMATICBODY2D)
  }

  public open fun _directStateChanged(arg0: Object): Unit {
  }

  /**
   * Returns the floor's collision angle at the last collision point according to `up_direction`, which is `Vector2.UP` by default. This value is always positive and only valid after calling [moveAndSlide] and when [isOnFloor] returns `true`.
   */
  public open fun getFloorAngle(upDirection: Vector2 = Vector2(0.0, -1.0)): Double {
    TransferContext.writeArguments(VECTOR2 to upDirection)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_GET_FLOOR_ANGLE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the surface normal of the floor at the last collision point. Only valid after calling [moveAndSlide] or [moveAndSlideWithSnap] and when [isOnFloor] returns `true`.
   */
  public open fun getFloorNormal(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_GET_FLOOR_NORMAL,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the linear velocity of the floor at the last collision point. Only valid after calling [moveAndSlide] or [moveAndSlideWithSnap] and when [isOnFloor] returns `true`.
   */
  public open fun getFloorVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_GET_FLOOR_VELOCITY,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns a [godot.KinematicCollision2D], which contains information about the latest collision that occurred during the last call to [moveAndSlide].
   */
  public open fun getLastSlideCollision(): KinematicCollision2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_GET_LAST_SLIDE_COLLISION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as KinematicCollision2D?
  }

  /**
   * Returns a [godot.KinematicCollision2D], which contains information about a collision that occurred during the last call to [moveAndSlide] or [moveAndSlideWithSnap]. Since the body can collide several times in a single call to [moveAndSlide], you must specify the index of the collision in the range 0 to ([getSlideCount] - 1).
   *
   * **Example usage:**
   *
   * ```
   * 				for i in get_slide_count():
   * 				    var collision = get_slide_collision(i)
   * 				    print("Collided with: ", collision.collider.name)
   * 				```
   */
  public open fun getSlideCollision(slideIdx: Long): KinematicCollision2D? {
    TransferContext.writeArguments(LONG to slideIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_GET_SLIDE_COLLISION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as KinematicCollision2D?
  }

  /**
   * Returns the number of times the body collided and changed direction during the last call to [moveAndSlide] or [moveAndSlideWithSnap].
   */
  public open fun getSlideCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_GET_SLIDE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the body collided with the ceiling on the last call of [moveAndSlide] or [moveAndSlideWithSnap]. Otherwise, returns `false`.
   */
  public open fun isOnCeiling(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_IS_ON_CEILING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body collided with the floor on the last call of [moveAndSlide] or [moveAndSlideWithSnap]. Otherwise, returns `false`.
   */
  public open fun isOnFloor(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_IS_ON_FLOOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body collided with a wall on the last call of [moveAndSlide] or [moveAndSlideWithSnap]. Otherwise, returns `false`.
   */
  public open fun isOnWall(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_IS_ON_WALL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Moves the body along the vector `rel_vec`. The body will stop if it collides. Returns a [godot.KinematicCollision2D], which contains information about the collision when stopped, or when touching another body along the motion.
   *
   * If `test_only` is `true`, the body does not move but the would-be collision information is given.
   */
  public open fun moveAndCollide(
    relVec: Vector2,
    infiniteInertia: Boolean = true,
    excludeRaycastShapes: Boolean = true,
    testOnly: Boolean = false
  ): KinematicCollision2D? {
    TransferContext.writeArguments(VECTOR2 to relVec, BOOL to infiniteInertia, BOOL to
        excludeRaycastShapes, BOOL to testOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_MOVE_AND_COLLIDE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as KinematicCollision2D?
  }

  /**
   * Moves the body along a vector. If the body collides with another, it will slide along the other body rather than stop immediately. If the other body is a [godot.KinematicBody2D] or [godot.RigidBody2D], it will also be affected by the motion of the other body. You can use this to make moving and rotating platforms, or to make nodes push other nodes.
   *
   * This method should be used in [godot.Node.PhysicsProcess] (or in a method called by [godot.Node.PhysicsProcess]), as it uses the physics step's `delta` value automatically in calculations. Otherwise, the simulation will run at an incorrect speed.
   *
   * `linear_velocity` is the velocity vector in pixels per second. Unlike in [moveAndCollide], you should *not* multiply it by `delta` — the physics engine handles applying the velocity.
   *
   * `up_direction` is the up direction, used to determine what is a wall and what is a floor or a ceiling. If set to the default value of `Vector2(0, 0)`, everything is considered a wall. This is useful for topdown games.
   *
   * If `stop_on_slope` is `true`, body will not slide on slopes when you include gravity in `linear_velocity` and the body is standing still.
   *
   * If the body collides, it will change direction a maximum of `max_slides` times before it stops.
   *
   * `floor_max_angle` is the maximum angle (in radians) where a slope is still considered a floor (or a ceiling), rather than a wall. The default value equals 45 degrees.
   *
   * If `infinite_inertia` is `true`, body will be able to push [godot.RigidBody2D] nodes, but it won't also detect any collisions with them. If `false`, it will interact with [godot.RigidBody2D] nodes like with [godot.StaticBody2D].
   *
   * Returns the `linear_velocity` vector, rotated and/or scaled if a slide collision occurred. To get detailed information about collisions that occurred, use [getSlideCollision].
   *
   * When the body touches a moving platform, the platform's velocity is automatically added to the body motion. If a collision occurs due to the platform's motion, it will always be first in the slide collisions.
   */
  public open fun moveAndSlide(
    linearVelocity: Vector2,
    upDirection: Vector2 = Vector2(0.0, 0.0),
    stopOnSlope: Boolean = false,
    maxSlides: Long = 4,
    floorMaxAngle: Double = 0.785398,
    infiniteInertia: Boolean = true
  ): Vector2 {
    TransferContext.writeArguments(VECTOR2 to linearVelocity, VECTOR2 to upDirection, BOOL to
        stopOnSlope, LONG to maxSlides, DOUBLE to floorMaxAngle, BOOL to infiniteInertia)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_MOVE_AND_SLIDE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Moves the body while keeping it attached to slopes. Similar to [moveAndSlide].
   *
   * As long as the `snap` vector is in contact with the ground, the body will remain attached to the surface. This means you must disable snap in order to jump, for example. You can do this by setting `snap` to `(0, 0)` or by using [moveAndSlide] instead.
   */
  public open fun moveAndSlideWithSnap(
    linearVelocity: Vector2,
    snap: Vector2,
    upDirection: Vector2 = Vector2(0.0, 0.0),
    stopOnSlope: Boolean = false,
    maxSlides: Long = 4,
    floorMaxAngle: Double = 0.785398,
    infiniteInertia: Boolean = true
  ): Vector2 {
    TransferContext.writeArguments(VECTOR2 to linearVelocity, VECTOR2 to snap, VECTOR2 to
        upDirection, BOOL to stopOnSlope, LONG to maxSlides, DOUBLE to floorMaxAngle, BOOL to
        infiniteInertia)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_MOVE_AND_SLIDE_WITH_SNAP, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Checks for collisions without moving the body. Virtually sets the node's position, scale and rotation to that of the given [godot.core.Transform2D], then tries to move the body along the vector `rel_vec`. Returns `true` if a collision would stop the body from moving along the whole path.
   *
   * Use [moveAndCollide] instead for detecting collision with touching bodies.
   */
  public open fun testMove(
    from: Transform2D,
    relVec: Vector2,
    infiniteInertia: Boolean = true
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM2D to from, VECTOR2 to relVec, BOOL to infiniteInertia)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY2D_TEST_MOVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
