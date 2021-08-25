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
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal1
import godot.signals.Signal4
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * 2D area for detection and 2D physics influence.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/120](https://godotengine.org/asset-library/asset/120)
 *
 * 2D area that detects [godot.CollisionObject2D] nodes overlapping, entering, or exiting. Can also alter or override local physics parameters (gravity, damping).
 */
@GodotBaseType
public open class Area2D : CollisionObject2D() {
  /**
   * Emitted when another Area2D enters this Area2D. Requires [monitoring] to be set to `true`.
   *
   * `area` the other Area2D.
   */
  public val areaEntered: Signal1<Area2D> by signal("area")

  /**
   * Emitted when another Area2D exits this Area2D. Requires [monitoring] to be set to `true`.
   *
   * `area` the other Area2D.
   */
  public val areaExited: Signal1<Area2D> by signal("area")

  /**
   * Emitted when one of another Area2D's [godot.Shape2D]s enters one of this Area2D's [godot.Shape2D]s. Requires [monitoring] to be set to `true`.
   *
   * `area_id` the [RID] of the other Area2D's [godot.CollisionObject2D] used by the [godot.Physics2DServer].
   *
   * `area` the other Area2D.
   *
   * `area_shape` the index of the [godot.Shape2D] of the other Area2D used by the [godot.Physics2DServer].
   *
   * `local_shape` the index of the [godot.Shape2D] of this Area2D used by the [godot.Physics2DServer].
   */
  public val areaShapeEntered: Signal4<Long, Area2D, Long, Long> by signal("area_id", "area",
      "area_shape", "local_shape")

  /**
   * Emitted when one of another Area2D's [godot.Shape2D]s exits one of this Area2D's [godot.Shape2D]s. Requires [monitoring] to be set to `true`.
   *
   * `area_id` the [RID] of the other Area2D's [godot.CollisionObject2D] used by the [godot.Physics2DServer].
   *
   * `area` the other Area2D.
   *
   * `area_shape` the index of the [godot.Shape2D] of the other Area2D used by the [godot.Physics2DServer].
   *
   * `local_shape` the index of the [godot.Shape2D] of this Area2D used by the [godot.Physics2DServer].
   */
  public val areaShapeExited: Signal4<Long, Area2D, Long, Long> by signal("area_id", "area",
      "area_shape", "local_shape")

  /**
   * Emitted when a [godot.PhysicsBody2D] or [godot.TileMap] enters this Area2D. Requires [monitoring] to be set to `true`. [godot.TileMap]s are detected if the [godot.TileSet] has Collision [godot.Shape2D]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody2D] or [godot.TileMap].
   */
  public val bodyEntered: Signal1<Node> by signal("body")

  /**
   * Emitted when a [godot.PhysicsBody2D] or [godot.TileMap] exits this Area2D. Requires [monitoring] to be set to `true`. [godot.TileMap]s are detected if the [godot.TileSet] has Collision [godot.Shape2D]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody2D] or [godot.TileMap].
   */
  public val bodyExited: Signal1<Node> by signal("body")

  /**
   * Emitted when one of a [godot.PhysicsBody2D] or [godot.TileMap]'s [godot.Shape2D]s enters one of this Area2D's [godot.Shape2D]s. Requires [monitoring] to be set to `true`. [godot.TileMap]s are detected if the [godot.TileSet] has Collision [godot.Shape2D]s.
   *
   * `body_id` the [RID] of the [godot.PhysicsBody2D] or [godot.TileSet]'s [godot.CollisionObject2D] used by the [godot.Physics2DServer].
   *
   * `body` the [godot.Node], if it exists in the tree, of the [godot.PhysicsBody2D] or [godot.TileMap].
   *
   * `body_shape` the index of the [godot.Shape2D] of the [godot.PhysicsBody2D] or [godot.TileMap] used by the [godot.Physics2DServer].
   *
   * `local_shape` the index of the [godot.Shape2D] of this Area2D used by the [godot.Physics2DServer].
   */
  public val bodyShapeEntered: Signal4<Long, Node, Long, Long> by signal("body_id", "body",
      "body_shape", "local_shape")

  /**
   * Emitted when one of a [godot.PhysicsBody2D] or [godot.TileMap]'s [godot.Shape2D]s exits one of this Area2D's [godot.Shape2D]s. Requires [monitoring] to be set to `true`. [godot.TileMap]s are detected if the [godot.TileSet] has Collision [godot.Shape2D]s.
   *
   * `body_id` the [RID] of the [godot.PhysicsBody2D] or [godot.TileSet]'s [godot.CollisionObject2D] used by the [godot.Physics2DServer].
   *
   * `body` the [godot.Node], if it exists in the tree, of the [godot.PhysicsBody2D] or [godot.TileMap].
   *
   * `body_shape` the index of the [godot.Shape2D] of the [godot.PhysicsBody2D] or [godot.TileMap] used by the [godot.Physics2DServer].
   *
   * `local_shape` the index of the [godot.Shape2D] of this Area2D used by the [godot.Physics2DServer].
   */
  public val bodyShapeExited: Signal4<Long, Node, Long, Long> by signal("body_id", "body",
      "body_shape", "local_shape")

  /**
   * The rate at which objects stop spinning in this area. Represents the angular velocity lost per second.
   *
   * See [godot.ProjectSettings.physics/2d/defaultAngularDamp] for more details about damping.
   */
  public open var angularDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_ANGULAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_ANGULAR_DAMP, NIL)
    }

  /**
   * The name of the area's audio bus.
   */
  public open var audioBusName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_AUDIO_BUS_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_AUDIO_BUS_NAME, NIL)
    }

  /**
   * If `true`, the area's audio bus overrides the default audio bus.
   */
  public open var audioBusOverride: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_AUDIO_BUS_OVERRIDE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_AUDIO_BUS_OVERRIDE,
          NIL)
    }

  /**
   * The area's physics layer(s). Collidable objects can exist in any of 32 different layers. A contact is detected if object A is in any of the layers that object B scans, or object B is in any layers that object A scans. See also [collisionMask]. See [godot.Collision layers and masks](https://docs.godotengine.org/en/3.3/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_COLLISION_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_COLLISION_LAYER, NIL)
    }

  /**
   * The physics layers this area scans to determine collision detection. See [godot.Collision layers and masks](https://docs.godotengine.org/en/3.3/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_COLLISION_MASK, NIL)
    }

  /**
   * The area's gravity intensity (in pixels per second squared). This value multiplies the gravity vector. This is useful to alter the force of gravity without altering its direction.
   */
  public open var gravity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_GRAVITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_GRAVITY, NIL)
    }

  /**
   * The falloff factor for point gravity. The greater the value, the faster gravity decreases with distance.
   */
  public open var gravityDistanceScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_GRAVITY_DISTANCE_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_GRAVITY_DISTANCE_SCALE,
          NIL)
    }

  /**
   * If `true`, gravity is calculated from a point (set via [gravityVec]). See also [spaceOverride].
   */
  public open var gravityPoint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_GRAVITY_POINT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_GRAVITY_POINT, NIL)
    }

  /**
   * The area's gravity vector (not normalized). If gravity is a point (see [gravityPoint]), this will be the point of attraction.
   */
  public open var gravityVec: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_GRAVITY_VEC, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_GRAVITY_VEC, NIL)
    }

  /**
   * The rate at which objects stop moving in this area. Represents the linear velocity lost per second.
   *
   * See [godot.ProjectSettings.physics/2d/defaultLinearDamp] for more details about damping.
   */
  public open var linearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_LINEAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_LINEAR_DAMP, NIL)
    }

  /**
   * If `true`, other monitoring areas can detect this area.
   */
  public open var monitorable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_MONITORABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_MONITORABLE, NIL)
    }

  /**
   * If `true`, the area detects bodies or areas entering and exiting it.
   */
  public open var monitoring: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_MONITORING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_MONITORING, NIL)
    }

  /**
   * The area's priority. Higher priority areas are processed first.
   */
  public open var priority: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_PRIORITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_PRIORITY, NIL)
    }

  /**
   * Override mode for gravity and damping calculations within this area. See [enum SpaceOverride] for possible values.
   */
  public open var spaceOverride: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_SPACE_OVERRIDE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_SPACE_OVERRIDE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AREA2D)
  }

  @CoreTypeHelper
  public open fun gravityVec(schedule: Vector2.() -> Unit): Vector2 = gravityVec.apply{
      schedule(this)
      gravityVec = this
  }


  public open fun _areaEnterTree(id: Long): Unit {
  }

  public open fun _areaExitTree(id: Long): Unit {
  }

  public open fun _areaInout(
    arg0: Long,
    arg1: RID,
    arg2: Long,
    arg3: Long,
    arg4: Long
  ): Unit {
  }

  public open fun _bodyEnterTree(id: Long): Unit {
  }

  public open fun _bodyExitTree(id: Long): Unit {
  }

  public open fun _bodyInout(
    arg0: Long,
    arg1: RID,
    arg2: Long,
    arg3: Long,
    arg4: Long
  ): Unit {
  }

  /**
   * Returns an individual bit on the layer mask. Describes whether other areas will collide with this one on the given layer.
   */
  public open fun getCollisionLayerBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_COLLISION_LAYER_BIT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an individual bit on the collision mask. Describes whether this area will collide with others on the given layer.
   */
  public open fun getCollisionMaskBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_COLLISION_MASK_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a list of intersecting [godot.Area2D]s. For performance reasons (collisions are all processed at the same time) this list is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  public open fun getOverlappingAreas(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_OVERLAPPING_AREAS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a list of intersecting [godot.PhysicsBody2D]s. For performance reasons (collisions are all processed at the same time) this list is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  public open fun getOverlappingBodies(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_GET_OVERLAPPING_BODIES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * If `true`, the given area overlaps the Area2D.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, the list of overlaps is updated once per frame and before the physics step. Consider using signals instead.
   */
  public open fun overlapsArea(area: Node): Boolean {
    TransferContext.writeArguments(OBJECT to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_OVERLAPS_AREA, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, the given physics body overlaps the Area2D.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, list of overlaps is updated once per frame and before the physics step. Consider using signals instead.
   *
   * The `body` argument can either be a [godot.PhysicsBody2D] or a [godot.TileMap] instance (while TileMaps are not physics bodies themselves, they register their tiles with collision shapes as a virtual physics body).
   */
  public open fun overlapsBody(body: Node): Boolean {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_OVERLAPS_BODY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Set/clear individual bits on the layer mask. This makes getting an area in/out of only one layer easier.
   */
  public open fun setCollisionLayerBit(bit: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_COLLISION_LAYER_BIT, NIL)
  }

  /**
   * Set/clear individual bits on the collision mask. This makes selecting the areas scanned easier.
   */
  public open fun setCollisionMaskBit(bit: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA2D_SET_COLLISION_MASK_BIT, NIL)
  }

  public enum class SpaceOverride(
    id: Long
  ) {
    /**
     * This area does not affect gravity/damping.
     */
    SPACE_OVERRIDE_DISABLED(0),
    /**
     * This area adds its gravity/damping values to whatever has been calculated so far (in [priority] order).
     */
    SPACE_OVERRIDE_COMBINE(1),
    /**
     * This area adds its gravity/damping values to whatever has been calculated so far (in [priority] order), ignoring any lower priority areas.
     */
    SPACE_OVERRIDE_COMBINE_REPLACE(2),
    /**
     * This area replaces any gravity/damping, even the defaults, ignoring any lower priority areas.
     */
    SPACE_OVERRIDE_REPLACE(3),
    /**
     * This area replaces any gravity/damping calculated so far (in [priority] order), but keeps calculating the rest of the areas.
     */
    SPACE_OVERRIDE_REPLACE_COMBINE(4),
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
     * This area adds its gravity/damping values to whatever has been calculated so far (in [priority] order).
     */
    public final const val SPACE_OVERRIDE_COMBINE: Long = 1

    /**
     * This area adds its gravity/damping values to whatever has been calculated so far (in [priority] order), ignoring any lower priority areas.
     */
    public final const val SPACE_OVERRIDE_COMBINE_REPLACE: Long = 2

    /**
     * This area does not affect gravity/damping.
     */
    public final const val SPACE_OVERRIDE_DISABLED: Long = 0

    /**
     * This area replaces any gravity/damping, even the defaults, ignoring any lower priority areas.
     */
    public final const val SPACE_OVERRIDE_REPLACE: Long = 3

    /**
     * This area replaces any gravity/damping calculated so far (in [priority] order), but keeps calculating the rest of the areas.
     */
    public final const val SPACE_OVERRIDE_REPLACE_COMBINE: Long = 4
  }
}
