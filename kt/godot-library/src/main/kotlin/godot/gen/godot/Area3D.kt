// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.RID
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
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
 * 3D area for detection and physics and audio influence.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/127](https://godotengine.org/asset-library/asset/127)
 *
 * 3D area that detects [godot.CollisionObject3D] nodes overlapping, entering, or exiting. Can also alter or override local physics parameters (gravity, damping) and route audio to custom audio buses.
 */
@GodotBaseType
public open class Area3D : CollisionObject3D() {
  /**
   * Emitted when another Area3D exits this Area3D. Requires [monitoring] to be set to `true`.
   *
   * `area` the other Area3D.
   */
  public val areaExited: Signal1<Area3D> by signal("area")

  /**
   * Emitted when one of another Area3D's [godot.Shape3D]s exits one of this Area3D's [godot.Shape3D]s. Requires [monitoring] to be set to `true`.
   *
   * `area_rid` the [RID] of the other Area3D's [godot.CollisionObject3D] used by the [godot.PhysicsServer3D].
   *
   * `area` the other Area3D.
   *
   * `area_shape_index` the index of the [godot.Shape3D] of the other Area3D used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `area.shape_owner_get_owner(area.shape_find_owner(area_shape_index))`.
   *
   * `local_shape_index` the index of the [godot.Shape3D] of this Area3D used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `self.shape_owner_get_owner(self.shape_find_owner(local_shape_index))`.
   */
  public val areaShapeExited: Signal4<RID, Area3D, Long, Long> by signal("areaRid", "area",
      "areaShapeIndex", "localShapeIndex")

  /**
   * Emitted when a [godot.PhysicsBody3D] or [godot.GridMap] enters this Area3D. Requires [monitoring] to be set to `true`. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape3D]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody3D] or [godot.GridMap].
   */
  public val bodyEntered: Signal1<Node3D> by signal("body")

  /**
   * Emitted when one of a [godot.PhysicsBody3D] or [godot.GridMap]'s [godot.Shape3D]s enters one of this Area3D's [godot.Shape3D]s. Requires [monitoring] to be set to `true`. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape3D]s.
   *
   * `body_rid` the [RID] of the [godot.PhysicsBody3D] or [godot.MeshLibrary]'s [godot.CollisionObject3D] used by the [godot.PhysicsServer3D].
   *
   * `body` the [godot.Node], if it exists in the tree, of the [godot.PhysicsBody3D] or [godot.GridMap].
   *
   * `body_shape_index` the index of the [godot.Shape3D] of the [godot.PhysicsBody3D] or [godot.GridMap] used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `body.shape_owner_get_owner(body.shape_find_owner(body_shape_index))`.
   *
   * `local_shape_index` the index of the [godot.Shape3D] of this Area3D used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `self.shape_owner_get_owner(self.shape_find_owner(local_shape_index))`.
   */
  public val bodyShapeEntered: Signal4<RID, Node3D, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  /**
   * Emitted when another Area3D enters this Area3D. Requires [monitoring] to be set to `true`.
   *
   * `area` the other Area3D.
   */
  public val areaEntered: Signal1<Area3D> by signal("area")

  /**
   * Emitted when one of another Area3D's [godot.Shape3D]s enters one of this Area3D's [godot.Shape3D]s. Requires [monitoring] to be set to `true`.
   *
   * `area_rid` the [RID] of the other Area3D's [godot.CollisionObject3D] used by the [godot.PhysicsServer3D].
   *
   * `area` the other Area3D.
   *
   * `area_shape_index` the index of the [godot.Shape3D] of the other Area3D used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `area.shape_owner_get_owner(area.shape_find_owner(area_shape_index))`.
   *
   * `local_shape_index` the index of the [godot.Shape3D] of this Area3D used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `self.shape_owner_get_owner(self.shape_find_owner(local_shape_index))`.
   */
  public val areaShapeEntered: Signal4<RID, Area3D, Long, Long> by signal("areaRid", "area",
      "areaShapeIndex", "localShapeIndex")

  /**
   * Emitted when a [godot.PhysicsBody3D] or [godot.GridMap] exits this Area3D. Requires [monitoring] to be set to `true`. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape3D]s.
   *
   * `body` the [godot.Node], if it exists in the tree, of the other [godot.PhysicsBody3D] or [godot.GridMap].
   */
  public val bodyExited: Signal1<Node3D> by signal("body")

  /**
   * Emitted when one of a [godot.PhysicsBody3D] or [godot.GridMap]'s [godot.Shape3D]s enters one of this Area3D's [godot.Shape3D]s. Requires [monitoring] to be set to `true`. [godot.GridMap]s are detected if the [godot.MeshLibrary] has Collision [godot.Shape3D]s.
   *
   * `body_rid` the [RID] of the [godot.PhysicsBody3D] or [godot.MeshLibrary]'s [godot.CollisionObject3D] used by the [godot.PhysicsServer3D].
   *
   * `body` the [godot.Node], if it exists in the tree, of the [godot.PhysicsBody3D] or [godot.GridMap].
   *
   * `body_shape_index` the index of the [godot.Shape3D] of the [godot.PhysicsBody3D] or [godot.GridMap] used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `body.shape_owner_get_owner(body.shape_find_owner(body_shape_index))`.
   *
   * `local_shape_index` the index of the [godot.Shape3D] of this Area3D used by the [godot.PhysicsServer3D]. Get the [godot.CollisionShape3D] node with `self.shape_owner_get_owner(self.shape_find_owner(local_shape_index))`.
   */
  public val bodyShapeExited: Signal4<RID, Node3D, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  /**
   * If `true`, the area detects bodies or areas entering and exiting it.
   */
  public var monitoring: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_IS_MONITORING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_MONITORING, NIL)
    }

  /**
   * If `true`, other monitoring areas can detect this area.
   */
  public var monitorable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_IS_MONITORABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_MONITORABLE, NIL)
    }

  /**
   * The area's priority. Higher priority areas are processed first.
   */
  public var priority: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_PRIORITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_PRIORITY, NIL)
    }

  /**
   * Override mode for gravity calculations within this area. See [enum SpaceOverride] for possible values.
   */
  public var gravitySpaceOverride: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_GET_GRAVITY_SPACE_OVERRIDE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_SET_GRAVITY_SPACE_OVERRIDE_MODE, NIL)
    }

  /**
   * If `true`, gravity is calculated from a point (set via [gravityPointCenter]). See also [gravitySpaceOverride].
   */
  public var gravityPoint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_IS_GRAVITY_A_POINT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_GRAVITY_IS_POINT, NIL)
    }

  /**
   * The falloff factor for point gravity. The greater the value, the faster gravity decreases with distance.
   */
  public var gravityPointDistanceScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_GET_GRAVITY_POINT_DISTANCE_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_SET_GRAVITY_POINT_DISTANCE_SCALE, NIL)
    }

  /**
   * If gravity is a point (see [gravityPoint]), this will be the point of attraction.
   */
  public var gravityPointCenter: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_GRAVITY_POINT_CENTER,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_GRAVITY_POINT_CENTER,
          NIL)
    }

  /**
   * The area's gravity vector (not normalized).
   */
  public var gravityDirection: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_GRAVITY_DIRECTION,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_GRAVITY_DIRECTION, NIL)
    }

  /**
   * The area's gravity intensity (in meters per second squared). This value multiplies the gravity direction. This is useful to alter the force of gravity without altering its direction.
   */
  public var gravity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_GRAVITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_GRAVITY, NIL)
    }

  /**
   * Override mode for linear damping calculations within this area. See [enum SpaceOverride] for possible values.
   */
  public var linearDampSpaceOverride: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_GET_LINEAR_DAMP_SPACE_OVERRIDE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_SET_LINEAR_DAMP_SPACE_OVERRIDE_MODE, NIL)
    }

  /**
   * The rate at which objects stop moving in this area. Represents the linear velocity lost per second.
   *
   * See [godot.ProjectSettings.physics/3d/defaultLinearDamp] for more details about damping.
   */
  public var linearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_LINEAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_LINEAR_DAMP, NIL)
    }

  /**
   * Override mode for angular damping calculations within this area. See [enum SpaceOverride] for possible values.
   */
  public var angularDampSpaceOverride: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_GET_ANGULAR_DAMP_SPACE_OVERRIDE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_SET_ANGULAR_DAMP_SPACE_OVERRIDE_MODE, NIL)
    }

  /**
   * The rate at which objects stop spinning in this area. Represents the angular velocity lost per second.
   *
   * See [godot.ProjectSettings.physics/3d/defaultAngularDamp] for more details about damping.
   */
  public var angularDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_ANGULAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_ANGULAR_DAMP, NIL)
    }

  /**
   * The magnitude of area-specific wind force.
   */
  public var windForceMagnitude: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_WIND_FORCE_MAGNITUDE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_WIND_FORCE_MAGNITUDE,
          NIL)
    }

  /**
   * The exponential rate at which wind force decreases with distance from its origin.
   */
  public var windAttenuationFactor: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_GET_WIND_ATTENUATION_FACTOR, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_SET_WIND_ATTENUATION_FACTOR, NIL)
    }

  /**
   * The [godot.Node3D] which is used to specify the the direction and origin of an area-specific wind force. The direction is opposite to the z-axis of the [godot.Node3D]'s local transform, and its origin is the origin of the [godot.Node3D]'s local transform.
   */
  public var windSourcePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_WIND_SOURCE_PATH,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_WIND_SOURCE_PATH, NIL)
    }

  /**
   * If `true`, the area's audio bus overrides the default audio bus.
   */
  public var audioBusOverride: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_IS_OVERRIDING_AUDIO_BUS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_AUDIO_BUS_OVERRIDE,
          NIL)
    }

  /**
   * The name of the area's audio bus.
   */
  public var audioBusName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_AUDIO_BUS_NAME,
          STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_AUDIO_BUS_NAME, NIL)
    }

  /**
   * If `true`, the area applies reverb to its associated audio.
   */
  public var reverbBusEnable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_IS_USING_REVERB_BUS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_USE_REVERB_BUS, NIL)
    }

  /**
   * The reverb bus name to use for this area's associated audio.
   */
  public var reverbBusName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_REVERB_BUS,
          STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_REVERB_BUS, NIL)
    }

  /**
   * The degree to which this area applies reverb to its associated audio. Ranges from `0` to `1` with `0.1` precision.
   */
  public var reverbBusAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_REVERB_AMOUNT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_REVERB_AMOUNT, NIL)
    }

  /**
   * The degree to which this area's reverb is a uniform effect. Ranges from `0` to `1` with `0.1` precision.
   */
  public var reverbBusUniformity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_REVERB_UNIFORMITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_REVERB_UNIFORMITY, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AREA3D)
  }

  /**
   * Returns a list of intersecting [godot.PhysicsBody3D]s. The overlapping body's [godot.CollisionObject3D.collisionLayer] must be part of this area's [godot.CollisionObject3D.collisionMask] in order to be detected.
   *
   * For performance reasons (collisions are all processed at the same time) this list is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  public fun getOverlappingBodies(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_OVERLAPPING_BODIES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a list of intersecting [godot.Area3D]s. The overlapping area's [godot.CollisionObject3D.collisionLayer] must be part of this area's [godot.CollisionObject3D.collisionMask] in order to be detected.
   *
   * For performance reasons (collisions are all processed at the same time) this list is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  public fun getOverlappingAreas(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_OVERLAPPING_AREAS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns `true` if the given physics body intersects or overlaps this [godot.Area3D], `false` otherwise.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, list of overlaps is updated once per frame and before the physics step. Consider using signals instead.
   *
   * The `body` argument can either be a [godot.PhysicsBody3D] or a [godot.GridMap] instance. While GridMaps are not physics body themselves, they register their tiles with collision shapes as a virtual physics body.
   */
  public fun overlapsBody(body: Node): Boolean {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_OVERLAPS_BODY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given [godot.Area3D] intersects or overlaps this [godot.Area3D], `false` otherwise.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, list of overlaps is updated once per frame and before the physics step. Consider using signals instead.
   */
  public fun overlapsArea(area: Node): Boolean {
    TransferContext.writeArguments(OBJECT to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_OVERLAPS_AREA, BOOL)
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

  public companion object
}
