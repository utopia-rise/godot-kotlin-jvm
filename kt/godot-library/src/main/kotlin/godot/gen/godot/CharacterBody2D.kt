// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * [CharacterBody2D] is a specialized class for physics bodies that are meant to be user-controlled.
 * They are not affected by physics at all, but they affect other physics bodies in their path. They
 * are mainly used to provide high-level API to move objects with wall and slope detection
 * ([moveAndSlide] method) in addition to the general collision detection provided by
 * [PhysicsBody2D.moveAndCollide]. This makes it useful for highly configurable physics bodies that
 * must move in specific ways and collide with the world, as is often the case with user-controlled
 * characters.
 * For game objects that don't require complex movement or collision detection, such as moving
 * platforms, [AnimatableBody2D] is simpler to configure.
 */
@GodotBaseType
public open class CharacterBody2D : PhysicsBody2D() {
  /**
   * Sets the motion mode which defines the behavior of [moveAndSlide]. See [MotionMode] constants
   * for available modes.
   */
  public var motionMode: MotionMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMotionModePtr, LONG)
      return CharacterBody2D.MotionMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMotionModePtr, NIL)
    }

  /**
   * Vector pointing upwards, used to determine what is a wall and what is a floor (or a ceiling)
   * when calling [moveAndSlide]. Defaults to [Vector2.UP]. As the vector will be normalized it can't
   * be equal to [Vector2.ZERO], if you want all collisions to be reported as walls, consider using
   * [MOTION_MODE_FLOATING] as [motionMode].
   */
  @CoreTypeLocalCopy
  public var upDirection: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpDirectionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUpDirectionPtr, NIL)
    }

  /**
   * Current velocity vector in pixels per second, used and modified during calls to [moveAndSlide].
   */
  @CoreTypeLocalCopy
  public var velocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVelocityPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVelocityPtr, NIL)
    }

  /**
   * If `true`, during a jump against the ceiling, the body will slide, if `false` it will be
   * stopped and will fall vertically.
   */
  public var slideOnCeiling: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSlideOnCeilingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSlideOnCeilingEnabledPtr, NIL)
    }

  /**
   * Maximum number of times the body can change direction before it stops when calling
   * [moveAndSlide].
   */
  public var maxSlides: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxSlidesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxSlidesPtr, NIL)
    }

  /**
   * Minimum angle (in radians) where the body is allowed to slide when it encounters a slope. The
   * default value equals 15 degrees. This property only affects movement when [motionMode] is
   * [MOTION_MODE_FLOATING].
   */
  public var wallMinSlideAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWallMinSlideAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setWallMinSlideAnglePtr, NIL)
    }

  /**
   * If `true`, the body will not slide on slopes when calling [moveAndSlide] when the body is
   * standing still.
   * If `false`, the body will slide on floor's slopes when [velocity] applies a downward force.
   */
  public var floorStopOnSlope: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFloorStopOnSlopeEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFloorStopOnSlopeEnabledPtr, NIL)
    }

  /**
   * If `false` (by default), the body will move faster on downward slopes and slower on upward
   * slopes.
   * If `true`, the body will always move at the same speed on the ground no matter the slope. Note
   * that you need to use [floorSnapLength] to stick along a downward slope at constant speed.
   */
  public var floorConstantSpeed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFloorConstantSpeedEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFloorConstantSpeedEnabledPtr, NIL)
    }

  /**
   * If `true`, the body will be able to move on the floor only. This option avoids to be able to
   * walk on walls, it will however allow to slide down along them.
   */
  public var floorBlockOnWall: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFloorBlockOnWallEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFloorBlockOnWallEnabledPtr, NIL)
    }

  /**
   * Maximum angle (in radians) where a slope is still considered a floor (or a ceiling), rather
   * than a wall, when calling [moveAndSlide]. The default value equals 45 degrees.
   */
  public var floorMaxAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFloorMaxAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFloorMaxAnglePtr, NIL)
    }

  /**
   * Sets a snapping distance. When set to a value different from `0.0`, the body is kept attached
   * to slopes when calling [moveAndSlide]. The snapping vector is determined by the given distance
   * along the opposite direction of the [upDirection].
   * As long as the snapping vector is in contact with the ground and the body moves against
   * [upDirection], the body will remain attached to the surface. Snapping is not applied if the body
   * moves along [upDirection], meaning it contains vertical rising velocity, so it will be able to
   * detach from the ground when jumping or when the body is pushed up by something. If you want to
   * apply a snap without taking into account the velocity, use [applyFloorSnap].
   */
  public var floorSnapLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFloorSnapLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFloorSnapLengthPtr, NIL)
    }

  /**
   * Sets the behavior to apply when you leave a moving platform. By default, to be physically
   * accurate, when you leave the last platform velocity is applied. See [PlatformOnLeave] constants
   * for available behavior.
   */
  public var platformOnLeave: PlatformOnLeave
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPlatformOnLeavePtr, LONG)
      return CharacterBody2D.PlatformOnLeave.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPlatformOnLeavePtr, NIL)
    }

  /**
   * Collision layers that will be included for detecting floor bodies that will act as moving
   * platforms to be followed by the [CharacterBody2D]. By default, all floor bodies are detected and
   * propagate their velocity.
   */
  public var platformFloorLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPlatformFloorLayersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPlatformFloorLayersPtr, NIL)
    }

  /**
   * Collision layers that will be included for detecting wall bodies that will act as moving
   * platforms to be followed by the [CharacterBody2D]. By default, all wall bodies are ignored.
   */
  public var platformWallLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPlatformWallLayersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPlatformWallLayersPtr, NIL)
    }

  /**
   * Extra margin used for collision recovery when calling [moveAndSlide].
   * If the body is at least this close to another body, it will consider them to be colliding and
   * will be pushed away before performing the actual motion.
   * A higher value means it's more flexible for detecting collision, which helps with consistently
   * detecting walls and floors.
   * A lower value forces the collision algorithm to use more exact detection, so it can be used in
   * cases that specifically require precision, e.g at very low scale to avoid visible jittering, or
   * for stability with a stack of character bodies.
   */
  public var safeMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSafeMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSafeMarginPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CHARACTERBODY2D, scriptIndex)
    return true
  }

  /**
   * Vector pointing upwards, used to determine what is a wall and what is a floor (or a ceiling)
   * when calling [moveAndSlide]. Defaults to [Vector2.UP]. As the vector will be normalized it can't
   * be equal to [Vector2.ZERO], if you want all collisions to be reported as walls, consider using
   * [MOTION_MODE_FLOATING] as [motionMode].
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
   * val myCoreType = characterbody2d.upDirection
   * //Your changes
   * characterbody2d.upDirection = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun upDirectionMutate(block: Vector2.() -> Unit): Vector2 = upDirection.apply{
      block(this)
      upDirection = this
  }


  /**
   * Current velocity vector in pixels per second, used and modified during calls to [moveAndSlide].
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
   * val myCoreType = characterbody2d.velocity
   * //Your changes
   * characterbody2d.velocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun velocityMutate(block: Vector2.() -> Unit): Vector2 = velocity.apply{
      block(this)
      velocity = this
  }


  /**
   * Moves the body based on [velocity]. If the body collides with another, it will slide along the
   * other body (by default only on floor) rather than stop immediately. If the other body is a
   * [CharacterBody2D] or [RigidBody2D], it will also be affected by the motion of the other body. You
   * can use this to make moving and rotating platforms, or to make nodes push other nodes.
   * Modifies [velocity] if a slide collision occurred. To get the latest collision call
   * [getLastSlideCollision], for detailed information about collisions that occurred, use
   * [getSlideCollision].
   * When the body touches a moving platform, the platform's velocity is automatically added to the
   * body motion. If a collision occurs due to the platform's motion, it will always be first in the
   * slide collisions.
   * The general behavior and available properties change according to the [motionMode].
   * Returns `true` if the body collided, otherwise, returns `false`.
   */
  public fun moveAndSlide(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.moveAndSlidePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Allows to manually apply a snap to the floor regardless of the body's velocity. This function
   * does nothing when [isOnFloor] returns `true`.
   */
  public fun applyFloorSnap(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.applyFloorSnapPtr, NIL)
  }

  /**
   * Returns `true` if the body collided with the floor on the last call of [moveAndSlide].
   * Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a
   * surface is "floor" or not.
   */
  public fun isOnFloor(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnFloorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the body collided only with the floor on the last call of [moveAndSlide].
   * Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a
   * surface is "floor" or not.
   */
  public fun isOnFloorOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnFloorOnlyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the body collided with the ceiling on the last call of [moveAndSlide].
   * Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a
   * surface is "ceiling" or not.
   */
  public fun isOnCeiling(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnCeilingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the body collided only with the ceiling on the last call of [moveAndSlide].
   * Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a
   * surface is "ceiling" or not.
   */
  public fun isOnCeilingOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnCeilingOnlyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the body collided with a wall on the last call of [moveAndSlide]. Otherwise,
   * returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a surface is
   * "wall" or not.
   */
  public fun isOnWall(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnWallPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the body collided only with a wall on the last call of [moveAndSlide].
   * Otherwise, returns `false`. The [upDirection] and [floorMaxAngle] are used to determine whether a
   * surface is "wall" or not.
   */
  public fun isOnWallOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnWallOnlyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the collision normal of the floor at the last collision point. Only valid after calling
   * [moveAndSlide] and when [isOnFloor] returns `true`.
   * **Warning:** The collision normal is not always the same as the surface normal.
   */
  public fun getFloorNormal(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFloorNormalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the collision normal of the wall at the last collision point. Only valid after calling
   * [moveAndSlide] and when [isOnWall] returns `true`.
   * **Warning:** The collision normal is not always the same as the surface normal.
   */
  public fun getWallNormal(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWallNormalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the last motion applied to the [CharacterBody2D] during the last call to
   * [moveAndSlide]. The movement can be split into multiple motions when sliding occurs, and this
   * method return the last one, which is useful to retrieve the current direction of the movement.
   */
  public fun getLastMotion(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastMotionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the travel (position delta) that occurred during the last call to [moveAndSlide].
   */
  public fun getPositionDelta(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionDeltaPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the current real velocity since the last call to [moveAndSlide]. For example, when you
   * climb a slope, you will move diagonally even though the velocity is horizontal. This method
   * returns the diagonal movement, as opposed to [velocity] which returns the requested velocity.
   */
  public fun getRealVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRealVelocityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the floor's collision angle at the last collision point according to [upDirection],
   * which is [Vector2.UP] by default. This value is always positive and only valid after calling
   * [moveAndSlide] and when [isOnFloor] returns `true`.
   */
  @JvmOverloads
  public fun getFloorAngle(upDirection: Vector2 = Vector2(0, -1)): Float {
    TransferContext.writeArguments(VECTOR2 to upDirection)
    TransferContext.callMethod(rawPtr, MethodBindings.getFloorAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the linear velocity of the platform at the last collision point. Only valid after
   * calling [moveAndSlide].
   */
  public fun getPlatformVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlatformVelocityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the number of times the body collided and changed direction during the last call to
   * [moveAndSlide].
   */
  public fun getSlideCollisionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSlideCollisionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a [KinematicCollision2D], which contains information about a collision that occurred
   * during the last call to [moveAndSlide]. Since the body can collide several times in a single call
   * to [moveAndSlide], you must specify the index of the collision in the range 0 to
   * ([getSlideCollisionCount] - 1).
   * **Example usage:**
   *
   * gdscript:
   * ```gdscript
   * for i in get_slide_collision_count():
   *     var collision = get_slide_collision(i)
   *     print("Collided with: ", collision.get_collider().name)
   * ```
   * csharp:
   * ```csharp
   * for (int i = 0; i < GetSlideCollisionCount(); i++)
   * {
   *     KinematicCollision2D collision = GetSlideCollision(i);
   *     GD.Print("Collided with: ", (collision.GetCollider() as Node).Name);
   * }
   * ```
   */
  public fun getSlideCollision(slideIdx: Int): KinematicCollision2D? {
    TransferContext.writeArguments(LONG to slideIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlideCollisionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as KinematicCollision2D?)
  }

  /**
   * Returns a [KinematicCollision2D], which contains information about the latest collision that
   * occurred during the last call to [moveAndSlide].
   */
  public fun getLastSlideCollision(): KinematicCollision2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastSlideCollisionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as KinematicCollision2D?)
  }

  public enum class MotionMode(
    id: Long,
  ) {
    /**
     * Apply when notions of walls, ceiling and floor are relevant. In this mode the body motion
     * will react to slopes (acceleration/slowdown). This mode is suitable for sided games like
     * platformers.
     */
    MOTION_MODE_GROUNDED(0),
    /**
     * Apply when there is no notion of floor or ceiling. All collisions will be reported as
     * `on_wall`. In this mode, when you slide, the speed will always be constant. This mode is
     * suitable for top-down games.
     */
    MOTION_MODE_FLOATING(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MotionMode = entries.single { it.id == `value` }
    }
  }

  public enum class PlatformOnLeave(
    id: Long,
  ) {
    /**
     * Add the last platform velocity to the [velocity] when you leave a moving platform.
     */
    PLATFORM_ON_LEAVE_ADD_VELOCITY(0),
    /**
     * Add the last platform velocity to the [velocity] when you leave a moving platform, but any
     * downward motion is ignored. It's useful to keep full jump height even when the platform is
     * moving down.
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
      public fun from(`value`: Long): PlatformOnLeave = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val moveAndSlidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "move_and_slide")

    public val applyFloorSnapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "apply_floor_snap")

    public val setVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_velocity")

    public val getVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_velocity")

    public val setSafeMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_safe_margin")

    public val getSafeMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_safe_margin")

    public val isFloorStopOnSlopeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "is_floor_stop_on_slope_enabled")

    public val setFloorStopOnSlopeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_floor_stop_on_slope_enabled")

    public val setFloorConstantSpeedEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_floor_constant_speed_enabled")

    public val isFloorConstantSpeedEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "is_floor_constant_speed_enabled")

    public val setFloorBlockOnWallEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_floor_block_on_wall_enabled")

    public val isFloorBlockOnWallEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "is_floor_block_on_wall_enabled")

    public val setSlideOnCeilingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_slide_on_ceiling_enabled")

    public val isSlideOnCeilingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "is_slide_on_ceiling_enabled")

    public val setPlatformFloorLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_platform_floor_layers")

    public val getPlatformFloorLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_platform_floor_layers")

    public val setPlatformWallLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_platform_wall_layers")

    public val getPlatformWallLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_platform_wall_layers")

    public val getMaxSlidesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_max_slides")

    public val setMaxSlidesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_max_slides")

    public val getFloorMaxAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_floor_max_angle")

    public val setFloorMaxAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_floor_max_angle")

    public val getFloorSnapLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_floor_snap_length")

    public val setFloorSnapLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_floor_snap_length")

    public val getWallMinSlideAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_wall_min_slide_angle")

    public val setWallMinSlideAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_wall_min_slide_angle")

    public val getUpDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_up_direction")

    public val setUpDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_up_direction")

    public val setMotionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_motion_mode")

    public val getMotionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_motion_mode")

    public val setPlatformOnLeavePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "set_platform_on_leave")

    public val getPlatformOnLeavePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_platform_on_leave")

    public val isOnFloorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "is_on_floor")

    public val isOnFloorOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "is_on_floor_only")

    public val isOnCeilingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "is_on_ceiling")

    public val isOnCeilingOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "is_on_ceiling_only")

    public val isOnWallPtr: VoidPtr = TypeManager.getMethodBindPtr("CharacterBody2D", "is_on_wall")

    public val isOnWallOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "is_on_wall_only")

    public val getFloorNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_floor_normal")

    public val getWallNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_wall_normal")

    public val getLastMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_last_motion")

    public val getPositionDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_position_delta")

    public val getRealVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_real_velocity")

    public val getFloorAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_floor_angle")

    public val getPlatformVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_platform_velocity")

    public val getSlideCollisionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_slide_collision_count")

    public val getSlideCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_slide_collision")

    public val getLastSlideCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody2D", "get_last_slide_collision")
  }
}
