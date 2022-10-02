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
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
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
 * 3D area for detection and physics and audio influence.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/127](https://godotengine.org/asset-library/asset/127)
 *
 * 3D area that detects [godot.CollisionObject] nodes overlapping, entering, or exiting. Can also alter or override local physics parameters (gravity, damping) and route audio to a custom audio bus.
 *
 * To give the area its shape, add a [godot.CollisionShape] or a [godot.CollisionPolygon] node as a *direct* child (or add multiple such nodes as direct children) of the area.
 *
 * **Warning:** See [godot.ConcavePolygonShape] (also called "trimesh") for a warning about possibly unexpected behavior when using that shape for an area.
 */
@GodotBaseType
public open class Area : CollisionObject() {
  /**
   * Emitted when another Area enters this Area. Requires [monitoring] to be set to `true`.
   *
   * `area` the other Area.
   */
  public val areaEntered: Signal1<Area> by signal("area")

  /**
   * Emitted when another Area exits this Area. Requires [monitoring] to be set to `true`.
   *
   * `area` the other Area.
   */
  public val areaExited: Signal1<Area> by signal("area")

  /**
   * Emitted when one of another Area's [godot.Shape]s enters one of this Area's [godot.Shape]s. Requires [monitoring] to be set to `true`.
   *
   * `area_rid` the [RID] of the other Area's [godot.CollisionObject] used by the [godot.PhysicsServer].
   *
   * `area` the other Area.
   *
   * `area_shape_index` the index of the [godot.Shape] of the other Area used by the [godot.PhysicsServer]. Get the [godot.CollisionShape] node with `area.shape_owner_get_owner(area_shape_index)`.
   *
   * `local_shape_index` the index of the [godot.Shape] of this Area used by the [godot.PhysicsServer]. Get the [godot.CollisionShape] node with `self.shape_owner_get_owner(local_shape_index)`.
   */
  public val areaShapeEntered: Signal4<RID, Area, Long, Long> by signal("area_rid", "area",
      "area_shape_index", "local_shape_index")

  /**
   * Emitted when one of another Area's [godot.Shape]s enters one of this Area's [godot.Shape]s. Requires [monitoring] to be set to `true`.
   *
   * `area_rid` the [RID] of the other Area's [godot.CollisionObject] used by the [godot.PhysicsServer].
   *
   * `area` the other Area.
   *
   * `area_shape_index` the index of the [godot.Shape] of the other Area used by the [godot.PhysicsServer]. Get the [godot.CollisionShape] node with `area.shape_owner_get_owner(area_shape_index)`.
   *
   * `local_shape_index` the index of the [godot.Shape] of this Area used by the [godot.PhysicsServer]. Get the [godot.CollisionShape] node with `self.shape_owner_get_owner(local_shape_index)`.
   */
  public val areaShapeExited: Signal4<RID, Area, Long, Long> by signal("area_rid", "area",
      "area_shape_index", "local_shape_index")

  /**
   * Emitted when a [godot.PhysicsBody] or [godot.GridMap] enters this Area. Requires [monitoring] to be set to `true`. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody] or [godot.GridMap].
   */
  public val bodyEntered: Signal1<Node> by signal("body")

  /**
   * Emitted when a [godot.PhysicsBody] or [godot.GridMap] exits this Area. Requires [monitoring] to be set to `true`. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody] or [godot.GridMap].
   */
  public val bodyExited: Signal1<Node> by signal("body")

  /**
   * Emitted when one of a [godot.PhysicsBody] or [godot.GridMap]'s [godot.Shape]s enters one of this Area's [godot.Shape]s. Requires [monitoring] to be set to `true`. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape]s.
   *
   * `body_rid` the [RID] of the [godot.PhysicsBody] or [godot.MeshLibrary]'s [godot.CollisionObject] used by the [godot.PhysicsServer].
   *
   * `body` the [godot.Node], if it exists in the tree, of the [godot.PhysicsBody] or [godot.GridMap].
   *
   * `body_shape_index` the index of the [godot.Shape] of the [godot.PhysicsBody] or [godot.GridMap] used by the [godot.PhysicsServer]. Get the [godot.CollisionShape] node with `body.shape_owner_get_owner(body_shape_index)`.
   *
   * `local_shape_index` the index of the [godot.Shape] of this Area used by the [godot.PhysicsServer]. Get the [godot.CollisionShape] node with `self.shape_owner_get_owner(local_shape_index)`.
   */
  public val bodyShapeEntered: Signal4<RID, Node, Long, Long> by signal("body_rid", "body",
      "body_shape_index", "local_shape_index")

  /**
   * Emitted when one of a [godot.PhysicsBody] or [godot.GridMap]'s [godot.Shape]s enters one of this Area's [godot.Shape]s. Requires [monitoring] to be set to `true`. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape]s.
   *
   * `body_rid` the [RID] of the [godot.PhysicsBody] or [godot.MeshLibrary]'s [godot.CollisionObject] used by the [godot.PhysicsServer].
   *
   * `body` the [godot.Node], if it exists in the tree, of the [godot.PhysicsBody] or [godot.GridMap].
   *
   * `body_shape_index` the index of the [godot.Shape] of the [godot.PhysicsBody] or [godot.GridMap] used by the [godot.PhysicsServer]. Get the [godot.CollisionShape] node with `body.shape_owner_get_owner(body_shape_index)`.
   *
   * `local_shape_index` the index of the [godot.Shape] of this Area used by the [godot.PhysicsServer]. Get the [godot.CollisionShape] node with `self.shape_owner_get_owner(local_shape_index)`.
   */
  public val bodyShapeExited: Signal4<RID, Node, Long, Long> by signal("body_rid", "body",
      "body_shape_index", "local_shape_index")

  /**
   * The rate at which objects stop spinning in this area. Represents the angular velocity lost per second.
   *
   * See [godot.ProjectSettings.physics/3d/defaultAngularDamp] for more details about damping.
   */
  public open var angularDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_ANGULAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_ANGULAR_DAMP, NIL)
    }

  /**
   * The name of the area's audio bus.
   */
  public open var audioBusName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_AUDIO_BUS_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_AUDIO_BUS_NAME, NIL)
    }

  /**
   * If `true`, the area's audio bus overrides the default audio bus.
   */
  public open var audioBusOverride: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_AUDIO_BUS_OVERRIDE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_AUDIO_BUS_OVERRIDE, NIL)
    }

  /**
   * The area's gravity intensity (in meters per second squared). This value multiplies the gravity vector. This is useful to alter the force of gravity without altering its direction.
   */
  public open var gravity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_GRAVITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_GRAVITY, NIL)
    }

  /**
   * The falloff factor for point gravity. The greater the value, the faster gravity decreases with distance.
   */
  public open var gravityDistanceScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_GRAVITY_DISTANCE_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_GRAVITY_DISTANCE_SCALE,
          NIL)
    }

  /**
   * If `true`, gravity is calculated from a point (set via [gravityVec]). See also [spaceOverride].
   */
  public open var gravityPoint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_GRAVITY_POINT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_GRAVITY_POINT, NIL)
    }

  /**
   * The area's gravity vector (not normalized). If gravity is a point (see [gravityPoint]), this will be the point of attraction.
   */
  public open var gravityVec: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_GRAVITY_VEC, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_GRAVITY_VEC, NIL)
    }

  /**
   * The rate at which objects stop moving in this area. Represents the linear velocity lost per second.
   *
   * See [godot.ProjectSettings.physics/3d/defaultLinearDamp] for more details about damping.
   */
  public open var linearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_LINEAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_LINEAR_DAMP, NIL)
    }

  /**
   * If `true`, other monitoring areas can detect this area.
   */
  public open var monitorable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_MONITORABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_MONITORABLE, NIL)
    }

  /**
   * If `true`, the area detects bodies or areas entering and exiting it.
   */
  public open var monitoring: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_MONITORING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_MONITORING, NIL)
    }

  /**
   * The area's priority. Higher priority areas are processed first.
   */
  public open var priority: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_PRIORITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_PRIORITY, NIL)
    }

  /**
   * The degree to which this area applies reverb to its associated audio. Ranges from `0` to `1` with `0.1` precision.
   */
  public open var reverbBusAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_REVERB_BUS_AMOUNT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_REVERB_BUS_AMOUNT, NIL)
    }

  /**
   * If `true`, the area applies reverb to its associated audio.
   */
  public open var reverbBusEnable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_REVERB_BUS_ENABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_REVERB_BUS_ENABLE, NIL)
    }

  /**
   * The reverb bus name to use for this area's associated audio.
   */
  public open var reverbBusName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_REVERB_BUS_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_REVERB_BUS_NAME, NIL)
    }

  /**
   * The degree to which this area's reverb is a uniform effect. Ranges from `0` to `1` with `0.1` precision.
   */
  public open var reverbBusUniformity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_REVERB_BUS_UNIFORMITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_REVERB_BUS_UNIFORMITY,
          NIL)
    }

  /**
   * Override mode for gravity and damping calculations within this area. See [enum SpaceOverride] for possible values.
   */
  public open var spaceOverride: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_SPACE_OVERRIDE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_SPACE_OVERRIDE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AREA)
  }

  @CoreTypeHelper
  public open fun gravityVec(schedule: Vector3.() -> Unit): Vector3 = gravityVec.apply{
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
   * Returns a list of intersecting [godot.Area]s. The overlapping area's [godot.CollisionObject.collisionLayer] must be part of this area's [godot.CollisionObject.collisionMask] in order to be detected.
   *
   * For performance reasons (collisions are all processed at the same time) this list is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  public open fun getOverlappingAreas(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_OVERLAPPING_AREAS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a list of intersecting [godot.PhysicsBody]s. The overlapping body's [godot.CollisionObject.collisionLayer] must be part of this area's [godot.CollisionObject.collisionMask] in order to be detected.
   *
   * For performance reasons (collisions are all processed at the same time) this list is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  public open fun getOverlappingBodies(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_OVERLAPPING_BODIES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * If `true`, the given area overlaps the Area.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, list of overlaps is updated once per frame and before the physics step. Consider using signals instead.
   */
  public open fun overlapsArea(area: Node): Boolean {
    TransferContext.writeArguments(OBJECT to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_OVERLAPS_AREA, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, the given physics body overlaps the Area.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, list of overlaps is updated once per frame and before the physics step. Consider using signals instead.
   *
   * The `body` argument can either be a [godot.PhysicsBody] or a [godot.GridMap] instance (while GridMaps are not physics body themselves, they register their tiles with collision shapes as a virtual physics body).
   */
  public open fun overlapsBody(body: Node): Boolean {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_OVERLAPS_BODY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
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
