// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
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
 * General-purpose area node for detection and 3D physics influence.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/127](https://godotengine.org/asset-library/asset/127)
 *
 * 3D area that detects [godot.CollisionObject] nodes overlapping, entering, or exiting. Can also alter or override local physics parameters (gravity, damping).
 */
@GodotBaseType
open class Area : CollisionObject() {
  /**
   * Emitted when another Area enters this Area. Requires [monitoring] to be set to `true`.
   *
   * `area` the other Area.
   */
  val areaEntered: Signal1<Area> by signal("area")

  /**
   * Emitted when another Area exits this Area. Requires [monitoring] to be set to `true`.
   *
   * `area` the other Area.
   */
  val areaExited: Signal1<Area> by signal("area")

  /**
   * Emitted when one of another Area's [godot.Shape]s enters one of this Area's [godot.Shape]s. Requires [monitoring] to be set to `true`.
   *
   * `area_id` the [RID] of the other Area's [godot.CollisionObject] used by the [godot.PhysicsServer].
   *
   * `area` the other Area.
   *
   * `area_shape` the index of the [godot.Shape] of the other Area used by the [godot.PhysicsServer].
   *
   * `local_shape` the index of the [godot.Shape] of this Area used by the [godot.PhysicsServer].
   */
  val areaShapeEntered: Signal4<Long, Area, Long, Long> by signal("area_id", "area", "area_shape",
      "local_shape")

  /**
   * Emitted when one of another Area's [godot.Shape]s enters one of this Area's [godot.Shape]s. Requires [monitoring] to be set to `true`.
   *
   * `area_id` the [RID] of the other Area's [godot.CollisionObject] used by the [godot.PhysicsServer].
   *
   * `area` the other Area.
   *
   * `area_shape` the index of the [godot.Shape] of the other Area used by the [godot.PhysicsServer].
   *
   * `local_shape` the index of the [godot.Shape] of this Area used by the [godot.PhysicsServer].
   */
  val areaShapeExited: Signal4<Long, Area, Long, Long> by signal("area_id", "area", "area_shape",
      "local_shape")

  /**
   * Emitted when a [godot.PhysicsBody] or [godot.GridMap] enters this Area. Requires [monitoring] to be set to `true`. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody] or [godot.GridMap].
   */
  val bodyEntered: Signal1<Node> by signal("body")

  /**
   * Emitted when a [godot.PhysicsBody] or [godot.GridMap] exits this Area. Requires [monitoring] to be set to `true`. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody] or [godot.GridMap].
   */
  val bodyExited: Signal1<Node> by signal("body")

  /**
   * Emitted when one of a [godot.PhysicsBody] or [godot.GridMap]'s [godot.Shape]s enters one of this Area's [godot.Shape]s. Requires [monitoring] to be set to `true`. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape]s.
   *
   * `body_id` the [RID] of the [godot.PhysicsBody] or [godot.MeshLibrary]'s [godot.CollisionObject] used by the [godot.PhysicsServer].
   *
   * `body` the [godot.Node], if it exists in the tree, of the [godot.PhysicsBody] or [godot.GridMap].
   *
   * `body_shape` the index of the [godot.Shape] of the [godot.PhysicsBody] or [godot.GridMap] used by the [godot.PhysicsServer].
   *
   * `local_shape` the index of the [godot.Shape] of this Area used by the [godot.PhysicsServer].
   */
  val bodyShapeEntered: Signal4<Long, Node, Long, Long> by signal("body_id", "body", "body_shape",
      "local_shape")

  /**
   * Emitted when one of a [godot.PhysicsBody] or [godot.GridMap]'s [godot.Shape]s enters one of this Area's [godot.Shape]s. Requires [monitoring] to be set to `true`. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape]s.
   *
   * `body_id` the [RID] of the [godot.PhysicsBody] or [godot.MeshLibrary]'s [godot.CollisionObject] used by the [godot.PhysicsServer].
   *
   * `body` the [godot.Node], if it exists in the tree, of the [godot.PhysicsBody] or [godot.GridMap].
   *
   * `body_shape` the index of the [godot.Shape] of the [godot.PhysicsBody] or [godot.GridMap] used by the [godot.PhysicsServer].
   *
   * `local_shape` the index of the [godot.Shape] of this Area used by the [godot.PhysicsServer].
   */
  val bodyShapeExited: Signal4<Long, Node, Long, Long> by signal("body_id", "body", "body_shape",
      "local_shape")

  /**
   * The rate at which objects stop spinning in this area. Represents the angular velocity lost per second.
   *
   * See [godot.ProjectSettings.physics/3d/defaultAngularDamp] for more details about damping.
   */
  open var angularDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_ANGULAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_ANGULAR_DAMP, NIL)
    }

  /**
   * The name of the area's audio bus.
   */
  open var audioBusName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_AUDIO_BUS_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_AUDIO_BUS_NAME, NIL)
    }

  /**
   * If `true`, the area's audio bus overrides the default audio bus.
   */
  open var audioBusOverride: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_AUDIO_BUS_OVERRIDE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_AUDIO_BUS_OVERRIDE, NIL)
    }

  /**
   * The area's physics layer(s). Collidable objects can exist in any of 32 different layers. A contact is detected if object A is in any of the layers that object B scans, or object B is in any layers that object A scans. See also [collisionMask]. See [godot.Collision layers and masks](https://docs.godotengine.org/en/3.3/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  open var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_COLLISION_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_COLLISION_LAYER, NIL)
    }

  /**
   * The physics layers this area scans to determine collision detection. See [godot.Collision layers and masks](https://docs.godotengine.org/en/3.3/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_COLLISION_MASK, NIL)
    }

  /**
   * The area's gravity intensity (ranges from -1024 to 1024). This value multiplies the gravity vector. This is useful to alter the force of gravity without altering its direction.
   */
  open var gravity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_GRAVITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_GRAVITY, NIL)
    }

  /**
   * The falloff factor for point gravity. The greater the value, the faster gravity decreases with distance.
   */
  open var gravityDistanceScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_GRAVITY_DISTANCE_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_GRAVITY_DISTANCE_SCALE,
          NIL)
    }

  /**
   * If `true`, gravity is calculated from a point (set via [gravityVec]). See also [spaceOverride].
   */
  open var gravityPoint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_GRAVITY_POINT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_GRAVITY_POINT, NIL)
    }

  /**
   * The area's gravity vector (not normalized). If gravity is a point (see [gravityPoint]), this will be the point of attraction.
   */
  open var gravityVec: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_GRAVITY_VEC, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_GRAVITY_VEC, NIL)
    }

  /**
   * The rate at which objects stop moving in this area. Represents the linear velocity lost per second.
   *
   * See [godot.ProjectSettings.physics/3d/defaultLinearDamp] for more details about damping.
   */
  open var linearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_LINEAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_LINEAR_DAMP, NIL)
    }

  /**
   * If `true`, other monitoring areas can detect this area.
   */
  open var monitorable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_MONITORABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_MONITORABLE, NIL)
    }

  /**
   * If `true`, the area detects bodies or areas entering and exiting it.
   */
  open var monitoring: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_MONITORING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_MONITORING, NIL)
    }

  /**
   * The area's priority. Higher priority areas are processed first.
   */
  open var priority: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_PRIORITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_PRIORITY, NIL)
    }

  /**
   * The degree to which this area applies reverb to its associated audio. Ranges from `0` to `1` with `0.1` precision.
   */
  open var reverbBusAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_REVERB_BUS_AMOUNT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_REVERB_BUS_AMOUNT, NIL)
    }

  /**
   * If `true`, the area applies reverb to its associated audio.
   */
  open var reverbBusEnable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_REVERB_BUS_ENABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_REVERB_BUS_ENABLE, NIL)
    }

  /**
   * The reverb bus name to use for this area's associated audio.
   */
  open var reverbBusName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_REVERB_BUS_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_REVERB_BUS_NAME, NIL)
    }

  /**
   * The degree to which this area's reverb is a uniform effect. Ranges from `0` to `1` with `0.1` precision.
   */
  open var reverbBusUniformity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_REVERB_BUS_UNIFORMITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_REVERB_BUS_UNIFORMITY,
          NIL)
    }

  /**
   * Override mode for gravity and damping calculations within this area. See [enum SpaceOverride] for possible values.
   */
  open var spaceOverride: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_SPACE_OVERRIDE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_SPACE_OVERRIDE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_AREA)
  }

  open fun gravityVec(schedule: Vector3.() -> Unit): Vector3 = gravityVec.apply{
      schedule(this)
      gravityVec = this
  }


  open fun _areaEnterTree(id: Long) {
  }

  open fun _areaExitTree(id: Long) {
  }

  open fun _areaInout(
    arg0: Long,
    arg1: RID,
    arg2: Long,
    arg3: Long,
    arg4: Long
  ) {
  }

  open fun _bodyEnterTree(id: Long) {
  }

  open fun _bodyExitTree(id: Long) {
  }

  open fun _bodyInout(
    arg0: Long,
    arg1: RID,
    arg2: Long,
    arg3: Long,
    arg4: Long
  ) {
  }

  /**
   * Returns an individual bit on the layer mask.
   */
  open fun getCollisionLayerBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_COLLISION_LAYER_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an individual bit on the collision mask.
   */
  open fun getCollisionMaskBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_COLLISION_MASK_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a list of intersecting [godot.Area]s. For performance reasons (collisions are all processed at the same time) this list is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  open fun getOverlappingAreas(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_OVERLAPPING_AREAS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a list of intersecting [godot.PhysicsBody]s. For performance reasons (collisions are all processed at the same time) this list is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  open fun getOverlappingBodies(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_GET_OVERLAPPING_BODIES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * If `true`, the given area overlaps the Area.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, list of overlaps is updated once per frame and before the physics step. Consider using signals instead.
   */
  open fun overlapsArea(area: Node): Boolean {
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
  open fun overlapsBody(body: Node): Boolean {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_OVERLAPS_BODY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Set/clear individual bits on the layer mask. This simplifies editing this [godot.Area]'s layers.
   */
  open fun setCollisionLayerBit(bit: Long, value: Boolean) {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_COLLISION_LAYER_BIT, NIL)
  }

  /**
   * Set/clear individual bits on the collision mask. This simplifies editing which [godot.Area] layers this [godot.Area] scans.
   */
  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA_SET_COLLISION_MASK_BIT, NIL)
  }

  enum class SpaceOverride(
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
    SPACE_OVERRIDE_REPLACE_COMBINE(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * This area adds its gravity/damping values to whatever has been calculated so far (in [priority] order).
     */
    final const val SPACE_OVERRIDE_COMBINE: Long = 1

    /**
     * This area adds its gravity/damping values to whatever has been calculated so far (in [priority] order), ignoring any lower priority areas.
     */
    final const val SPACE_OVERRIDE_COMBINE_REPLACE: Long = 2

    /**
     * This area does not affect gravity/damping.
     */
    final const val SPACE_OVERRIDE_DISABLED: Long = 0

    /**
     * This area replaces any gravity/damping, even the defaults, ignoring any lower priority areas.
     */
    final const val SPACE_OVERRIDE_REPLACE: Long = 3

    /**
     * This area replaces any gravity/damping calculated so far (in [priority] order), but keeps calculating the rest of the areas.
     */
    final const val SPACE_OVERRIDE_REPLACE_COMBINE: Long = 4
  }
}
