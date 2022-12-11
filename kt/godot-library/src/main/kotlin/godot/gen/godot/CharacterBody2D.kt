// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Specialized 2D physics body node for characters moved by script.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/120](https://godotengine.org/asset-library/asset/120)
 *
 * Character bodies are special types of bodies that are meant to be user-controlled. They are not affected by physics at all; to other types of bodies, such as a rigid body, these are the same as a [godot.AnimatableBody2D]. However, they have two main uses:
 *
 * **Kinematic characters:** Character bodies have an API for moving objects with walls and slopes detection ([moveAndSlide] method), in addition to collision detection (also done with [godot.PhysicsBody2D.moveAndCollide]). This makes them really useful to implement characters that move in specific ways and collide with the world, but don't require advanced physics.
 *
 * **Kinematic motion:** Character bodies can also be used for kinematic motion (same functionality as [godot.AnimatableBody2D]), which allows them to be moved by code and push other bodies on their path.
 */
@GodotBaseType
public open class CharacterBody2D : PhysicsBody2D() {
  /**
   * Sets the motion mode which defines the behavior of [moveAndSlide]. See [enum MotionMode] constants for available modes.
   */
  public var motionMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_MOTION_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_MOTION_MODE,
          NIL)
    }

  /**
   * Vector pointing upwards, used to determine what is a wall and what is a floor (or a ceiling) when calling [moveAndSlide]. Defaults to `Vector2.UP`. As the vector will be normalized it can't be equal to [godot.Vector2.ZERO], if you want all collisions to be reported as walls, consider using [MOTION_MODE_FLOATING] as [motionMode].
   */
  public var upDirection: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_UP_DIRECTION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_UP_DIRECTION,
          NIL)
    }

  /**
   * Current velocity vector in pixels per second, used and modified during calls to [moveAndSlide].
   */
  public var velocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_VELOCITY,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_VELOCITY, NIL)
    }

  /**
   * If `true`, during a jump against the ceiling, the body will slide, if `false` it will be stopped and will fall vertically.
   */
  public var slideOnCeiling: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_IS_SLIDE_ON_CEILING_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_SLIDE_ON_CEILING_ENABLED, NIL)
    }

  /**
   * Maximum number of times the body can change direction before it stops when calling [moveAndSlide].
   */
  public var maxSlides: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_MAX_SLIDES,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_MAX_SLIDES,
          NIL)
    }

  /**
   * Minimum angle (in radians) where the body is allowed to slide when it encounters a slope. The default value equals 15 degrees. This property only affects movement when [motionMode] is [MOTION_MODE_FLOATING].
   */
  public var wallMinSlideAngle: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_WALL_MIN_SLIDE_ANGLE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_WALL_MIN_SLIDE_ANGLE, NIL)
    }

  /**
   * If `true`, the body will not slide on slopes when calling [moveAndSlide] when the body is standing still.
   *
   * If `false`, the body will slide on floor's slopes when [velocity] applies a downward force.
   */
  public var floorStopOnSlope: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_IS_FLOOR_STOP_ON_SLOPE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_FLOOR_STOP_ON_SLOPE_ENABLED, NIL)
    }

  /**
   * If `false` (by default), the body will move faster on downward slopes and slower on upward slopes.
   *
   * If `true`, the body will always move at the same speed on the ground no matter the slope. Note that you need to use [floorSnapLength] to stick along a downward slope at constant speed.
   */
  public var floorConstantSpeed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_IS_FLOOR_CONSTANT_SPEED_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_FLOOR_CONSTANT_SPEED_ENABLED, NIL)
    }

  /**
   * If `true`, the body will be able to move on the floor only. This option avoids to be able to walk on walls, it will however allow to slide down along them.
   */
  public var floorBlockOnWall: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_IS_FLOOR_BLOCK_ON_WALL_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_FLOOR_BLOCK_ON_WALL_ENABLED, NIL)
    }

  /**
   * Maximum angle (in radians) where a slope is still considered a floor (or a ceiling), rather than a wall, when calling [moveAndSlide]. The default value equals 45 degrees.
   */
  public var floorMaxAngle: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_FLOOR_MAX_ANGLE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_FLOOR_MAX_ANGLE, NIL)
    }

  /**
   * Sets a snapping distance. When set to a value different from `0.0`, the body is kept attached to slopes when calling [moveAndSlide]. The snapping vector is determined by the given distance along the opposite direction of the [upDirection].
   *
   * As long as the snapping vector is in contact with the ground and the body moves against [upDirection], the body will remain attached to the surface. Snapping is not applied if the body moves along [upDirection], so it will be able to detach from the ground when jumping.
   */
  public var floorSnapLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_FLOOR_SNAP_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_FLOOR_SNAP_LENGTH, NIL)
    }

  public var movingPlatformApplyVelocityOnLeave: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_MOVING_PLATFORM_APPLY_VELOCITY_ON_LEAVE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_MOVING_PLATFORM_APPLY_VELOCITY_ON_LEAVE, NIL)
    }

  public var movingPlatformFloorLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_MOVING_PLATFORM_FLOOR_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_MOVING_PLATFORM_FLOOR_LAYERS, NIL)
    }

  public var movingPlatformWallLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_MOVING_PLATFORM_WALL_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_MOVING_PLATFORM_WALL_LAYERS, NIL)
    }

  public var collision_safeMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_SAFE_MARGIN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_SET_SAFE_MARGIN,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CHARACTERBODY2D, scriptIndex)
    return true
  }

  /**
   * Moves the body based on [velocity]. If the body collides with another, it will slide along the other body (by default only on floor) rather than stop immediately. If the other body is a [godot.CharacterBody2D] or [godot.RigidBody2D], it will also be affected by the motion of the other body. You can use this to make moving and rotating platforms, or to make nodes push other nodes.
   *
   * Modifies [velocity] if a slide collision occurred. To get the latest collision call [getLastSlideCollision], for detailed information about collisions that occurred, use [getSlideCollision].
   *
   * When the body touches a moving platform, the platform's velocity is automatically added to the body motion. If a collision occurs due to the platform's motion, it will always be first in the slide collisions.
   *
   * The general behavior and available properties change according to the [motionMode].
   *
   * Returns `true` if the body collided, otherwise, returns `false`.
   */
  public fun moveAndSlide(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_MOVE_AND_SLIDE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body collided with the floor on the last call of [moveAndSlide]. Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a surface is "floor" or not.
   */
  public fun isOnFloor(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_IS_ON_FLOOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body collided only with the floor on the last call of [moveAndSlide]. Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a surface is "floor" or not.
   */
  public fun isOnFloorOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_IS_ON_FLOOR_ONLY,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body collided with the ceiling on the last call of [moveAndSlide]. Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a surface is "ceiling" or not.
   */
  public fun isOnCeiling(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_IS_ON_CEILING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body collided only with the ceiling on the last call of [moveAndSlide]. Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a surface is "ceiling" or not.
   */
  public fun isOnCeilingOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_IS_ON_CEILING_ONLY,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body collided with a wall on the last call of [moveAndSlide]. Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a surface is "wall" or not.
   */
  public fun isOnWall(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_IS_ON_WALL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body collided only with a wall on the last call of [moveAndSlide]. Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a surface is "wall" or not.
   */
  public fun isOnWallOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_IS_ON_WALL_ONLY,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the surface normal of the floor at the last collision point. Only valid after calling [moveAndSlide] and when [isOnFloor] returns `true`.
   */
  public fun getFloorNormal(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_FLOOR_NORMAL,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the surface normal of the wall at the last collision point. Only valid after calling [moveAndSlide] and when [isOnWall] returns `true`.
   */
  public fun getWallNormal(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_WALL_NORMAL,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the last motion applied to the [godot.CharacterBody2D] during the last call to [moveAndSlide]. The movement can be split into multiple motions when sliding occurs, and this method return the last one, which is useful to retrieve the current direction of the movement.
   */
  public fun getLastMotion(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_LAST_MOTION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the travel (position delta) that occurred during the last call to [moveAndSlide].
   */
  public fun getPositionDelta(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_POSITION_DELTA,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the current real velocity since the last call to [moveAndSlide]. For example, when you climb a slope, you will move diagonally even though the velocity is horizontal. This method returns the diagonal movement, as opposed to [velocity] which returns the requested velocity.
   */
  public fun getRealVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_REAL_VELOCITY,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the floor's collision angle at the last collision point according to [upDirection], which is `Vector2.UP` by default. This value is always positive and only valid after calling [moveAndSlide] and when [isOnFloor] returns `true`.
   */
  public fun getFloorAngle(upDirection: Vector2 = Vector2(0, -1)): Double {
    TransferContext.writeArguments(VECTOR2 to upDirection)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_FLOOR_ANGLE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the linear velocity of the platform at the last collision point. Only valid after calling [moveAndSlide].
   */
  public fun getPlatformVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_PLATFORM_VELOCITY, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the number of times the body collided and changed direction during the last call to [moveAndSlide].
   */
  public fun getSlideCollisionCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_SLIDE_COLLISION_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.KinematicCollision2D], which contains information about a collision that occurred during the last call to [moveAndSlide]. Since the body can collide several times in a single call to [moveAndSlide], you must specify the index of the collision in the range 0 to ([getSlideCollisionCount] - 1).
   *
   * **Example usage:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * for i in get_slide_collision_count():
   *
   * var collision = get_slide_collision(i)
   *
   * print("Collided with: ", collision.collider.name)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * for (int i = 0; i < GetSlideCount(); i++)
   *
   * {
   *
   *     KinematicCollision2D collision = GetSlideCollision(i);
   *
   *     GD.Print("Collided with: ", (collision.Collider as Node).Name);
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun getSlideCollision(slideIdx: Long): KinematicCollision2D? {
    TransferContext.writeArguments(LONG to slideIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_SLIDE_COLLISION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as KinematicCollision2D?
  }

  /**
   * Returns a [godot.KinematicCollision2D], which contains information about the latest collision that occurred during the last call to [moveAndSlide].
   */
  public fun getLastSlideCollision(): KinematicCollision2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CHARACTERBODY2D_GET_LAST_SLIDE_COLLISION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as KinematicCollision2D?
  }

  public enum class MotionMode(
    id: Long
  ) {
    /**
     * Apply when notions of walls, ceiling and floor are relevant. In this mode the body motion will react to slopes (acceleration/slowdown). This mode is suitable for sided games like platformers.
     */
    MOTION_MODE_GROUNDED(0),
    /**
     * Apply when there is no notion of floor or ceiling. All collisions will be reported as `on_wall`. In this mode, when you slide, the speed will always be constant. This mode is suitable for top-down games.
     */
    MOTION_MODE_FLOATING(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class MovingPlatformApplyVelocityOnLeave(
    id: Long
  ) {
    PLATFORM_VEL_ON_LEAVE_ALWAYS(0),
    PLATFORM_VEL_ON_LEAVE_UPWARD_ONLY(1),
    PLATFORM_VEL_ON_LEAVE_NEVER(2),
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
