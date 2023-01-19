// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Specialized 3D physics body node for characters moved by script.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * Character bodies are special types of bodies that are meant to be user-controlled. They are not affected by physics at all; to other types of bodies, such as a rigid body, these are the same as a [godot.AnimatableBody3D]. However, they have two main uses:
 *
 * **Kinematic characters:** Character bodies have an API for moving objects with walls and slopes detection ([moveAndSlide] method), in addition to collision detection (also done with [godot.PhysicsBody3D.moveAndCollide]). This makes them really useful to implement characters that move in specific ways and collide with the world, but don't require advanced physics.
 *
 * **Kinematic motion:** Character bodies can also be used for kinematic motion (same functionality as [godot.AnimatableBody3D]), which allows them to be moved by code and push other bodies on their path.
 */
@GodotBaseType
public open class CharacterBody3D : PhysicsBody3D() {
  /**
   * Sets the motion mode which defines the behavior of [moveAndSlide]. See [enum MotionMode] constants for available modes.
   */
  public var motionMode: MotionMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_MOTION_MODE,
          LONG)
      return CharacterBody3D.MotionMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_MOTION_MODE,
          NIL)
    }

  /**
   * Vector pointing upwards, used to determine what is a wall and what is a floor (or a ceiling) when calling [moveAndSlide]. Defaults to `Vector3.UP`. As the vector will be normalized it can't be equal to [godot.Vector3.ZERO], if you want all collisions to be reported as walls, consider using [MOTION_MODE_FLOATING] as [motionMode].
   */
  public var upDirection: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_UP_DIRECTION,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_UP_DIRECTION,
          NIL)
    }

  /**
   * If `true`, during a jump against the ceiling, the body will slide, if `false` it will be stopped and will fall vertically.
   */
  public var slideOnCeiling: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_IS_SLIDE_ON_CEILING_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_SLIDE_ON_CEILING_ENABLED, NIL)
    }

  /**
   * Current velocity vector (typically meters per second), used and modified during calls to [moveAndSlide].
   */
  public var velocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_VELOCITY,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_VELOCITY, NIL)
    }

  /**
   * Maximum number of times the body can change direction before it stops when calling [moveAndSlide].
   */
  public var maxSlides: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_MAX_SLIDES,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_MAX_SLIDES,
          NIL)
    }

  /**
   * Minimum angle (in radians) where the body is allowed to slide when it encounters a slope. The default value equals 15 degrees. When [motionMode] is [MOTION_MODE_GROUNDED], it only affects movement if [floorBlockOnWall] is `true`.
   */
  public var wallMinSlideAngle: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_WALL_MIN_SLIDE_ANGLE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_WALL_MIN_SLIDE_ANGLE, NIL)
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
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_IS_FLOOR_STOP_ON_SLOPE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_FLOOR_STOP_ON_SLOPE_ENABLED, NIL)
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
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_IS_FLOOR_CONSTANT_SPEED_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_FLOOR_CONSTANT_SPEED_ENABLED, NIL)
    }

  /**
   * If `true`, the body will be able to move on the floor only. This option avoids to be able to walk on walls, it will however allow to slide down along them.
   */
  public var floorBlockOnWall: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_IS_FLOOR_BLOCK_ON_WALL_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_FLOOR_BLOCK_ON_WALL_ENABLED, NIL)
    }

  /**
   * Maximum angle (in radians) where a slope is still considered a floor (or a ceiling), rather than a wall, when calling [moveAndSlide]. The default value equals 45 degrees.
   */
  public var floorMaxAngle: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_FLOOR_MAX_ANGLE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_FLOOR_MAX_ANGLE, NIL)
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
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_FLOOR_SNAP_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_FLOOR_SNAP_LENGTH, NIL)
    }

  /**
   * Sets the behavior to apply when you leave a moving platform. By default, to be physically accurate, when you leave the last platform velocity is applied. See [enum PlatformOnLeave] constants for available behavior.
   */
  public var platformOnLeave: PlatformOnLeave
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_PLATFORM_ON_LEAVE, LONG)
      return CharacterBody3D.PlatformOnLeave.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_PLATFORM_ON_LEAVE, NIL)
    }

  /**
   * Collision layers that will be included for detecting floor bodies that will act as moving platforms to be followed by the [godot.CharacterBody3D]. By default, all floor bodies are detected and propagate their velocity.
   */
  public var platformFloorLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_PLATFORM_FLOOR_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_PLATFORM_FLOOR_LAYERS, NIL)
    }

  /**
   * Collision layers that will be included for detecting wall bodies that will act as moving platforms to be followed by the [godot.CharacterBody3D]. By default, all wall bodies are ignored.
   */
  public var platformWallLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_PLATFORM_WALL_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_PLATFORM_WALL_LAYERS, NIL)
    }

  /**
   * Extra margin used for collision recovery when calling [moveAndSlide].
   *
   * If the body is at least this close to another body, it will consider them to be colliding and will be pushed away before performing the actual motion.
   *
   * A higher value means it's more flexible for detecting collision, which helps with consistently detecting walls and floors.
   *
   * A lower value forces the collision algorithm to use more exact detection, so it can be used in cases that specifically require precision, e.g at very low scale to avoid visible jittering, or for stability with a stack of character bodies.
   */
  public var safeMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_SAFE_MARGIN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_SET_SAFE_MARGIN,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CHARACTERBODY3D, scriptIndex)
    return true
  }

  /**
   * Moves the body based on [velocity]. If the body collides with another, it will slide along the other body rather than stop immediately. If the other body is a [godot.CharacterBody3D] or [godot.RigidBody3D], it will also be affected by the motion of the other body. You can use this to make moving and rotating platforms, or to make nodes push other nodes.
   *
   * Modifies [velocity] if a slide collision occurred. To get the latest collision call [getLastSlideCollision], for more detailed information about collisions that occurred, use [getSlideCollision].
   *
   * When the body touches a moving platform, the platform's velocity is automatically added to the body motion. If a collision occurs due to the platform's motion, it will always be first in the slide collisions.
   *
   * Returns `true` if the body collided, otherwise, returns `false`.
   */
  public fun moveAndSlide(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_MOVE_AND_SLIDE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body collided with the floor on the last call of [moveAndSlide]. Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a surface is "floor" or not.
   */
  public fun isOnFloor(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_IS_ON_FLOOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body collided only with the floor on the last call of [moveAndSlide]. Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a surface is "floor" or not.
   */
  public fun isOnFloorOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_IS_ON_FLOOR_ONLY,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body collided with the ceiling on the last call of [moveAndSlide]. Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a surface is "ceiling" or not.
   */
  public fun isOnCeiling(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_IS_ON_CEILING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body collided only with the ceiling on the last call of [moveAndSlide]. Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a surface is "ceiling" or not.
   */
  public fun isOnCeilingOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_IS_ON_CEILING_ONLY,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body collided with a wall on the last call of [moveAndSlide]. Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a surface is "wall" or not.
   */
  public fun isOnWall(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_IS_ON_WALL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the body collided only with a wall on the last call of [moveAndSlide]. Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a surface is "wall" or not.
   */
  public fun isOnWallOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_IS_ON_WALL_ONLY,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the surface normal of the floor at the last collision point. Only valid after calling [moveAndSlide] and when [isOnFloor] returns `true`.
   */
  public fun getFloorNormal(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_FLOOR_NORMAL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the surface normal of the wall at the last collision point. Only valid after calling [moveAndSlide] and when [isOnWall] returns `true`.
   */
  public fun getWallNormal(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_WALL_NORMAL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the last motion applied to the [godot.CharacterBody3D] during the last call to [moveAndSlide]. The movement can be split into multiple motions when sliding occurs, and this method return the last one, which is useful to retrieve the current direction of the movement.
   */
  public fun getLastMotion(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_LAST_MOTION,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the travel (position delta) that occurred during the last call to [moveAndSlide].
   */
  public fun getPositionDelta(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_POSITION_DELTA,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the current real velocity since the last call to [moveAndSlide]. For example, when you climb a slope, you will move diagonally even though the velocity is horizontal. This method returns the diagonal movement, as opposed to [velocity] which returns the requested velocity.
   */
  public fun getRealVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_REAL_VELOCITY,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the floor's collision angle at the last collision point according to [upDirection], which is `Vector3.UP` by default. This value is always positive and only valid after calling [moveAndSlide] and when [isOnFloor] returns `true`.
   */
  public fun getFloorAngle(upDirection: Vector3 = Vector3(0, 1, 0)): Double {
    TransferContext.writeArguments(VECTOR3 to upDirection)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_FLOOR_ANGLE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the linear velocity of the platform at the last collision point. Only valid after calling [moveAndSlide].
   */
  public fun getPlatformVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_PLATFORM_VELOCITY, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the angular velocity of the platform at the last collision point. Only valid after calling [moveAndSlide].
   */
  public fun getPlatformAngularVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_PLATFORM_ANGULAR_VELOCITY, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the number of times the body collided and changed direction during the last call to [moveAndSlide].
   */
  public fun getSlideCollisionCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_SLIDE_COLLISION_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.KinematicCollision3D], which contains information about a collision that occurred during the last call to [moveAndSlide]. Since the body can collide several times in a single call to [moveAndSlide], you must specify the index of the collision in the range 0 to ([getSlideCollisionCount] - 1).
   */
  public fun getSlideCollision(slideIdx: Long): KinematicCollision3D? {
    TransferContext.writeArguments(LONG to slideIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_SLIDE_COLLISION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as KinematicCollision3D?
  }

  /**
   * Returns a [godot.KinematicCollision3D], which contains information about the latest collision that occurred during the last call to [moveAndSlide].
   */
  public fun getLastSlideCollision(): KinematicCollision3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CHARACTERBODY3D_GET_LAST_SLIDE_COLLISION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as KinematicCollision3D?
  }

  public enum class MotionMode(
    id: Long
  ) {
    /**
     * Apply when notions of walls, ceiling and floor are relevant. In this mode the body motion will react to slopes (acceleration/slowdown). This mode is suitable for grounded games like platformers.
     */
    MOTION_MODE_GROUNDED(0),
    /**
     * Apply when there is no notion of floor or ceiling. All collisions will be reported as `on_wall`. In this mode, when you slide, the speed will always be constant. This mode is suitable for games without ground like space games.
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

  public enum class PlatformOnLeave(
    id: Long
  ) {
    /**
     * Add the last platform velocity to the [velocity] when you leave a moving platform.
     */
    PLATFORM_ON_LEAVE_ADD_VELOCITY(0),
    /**
     * Add the last platform velocity to the [velocity] when you leave a moving platform, but any downward motion is ignored. It's useful to keep full jump height even when the platform is moving down.
     */
    PLATFORM_ON_LEAVE_ADD_UPWARD_VELOCITY(1),
    /**
     * Do nothing when leaving a platform.
     */
    PLATFORM_ON_LEAVE_DO_NOTHING(2),
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
