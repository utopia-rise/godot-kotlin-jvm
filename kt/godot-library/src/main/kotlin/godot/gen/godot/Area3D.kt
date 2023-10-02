// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.RID
import godot.core.StringName
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
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal4
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A region of 3D space that detects other [godot.CollisionObject3D]s entering or exiting it.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/127](https://godotengine.org/asset-library/asset/127)
 *
 * [godot.Area3D] is a region of 3D space defined by one or multiple [godot.CollisionShape3D] or [godot.CollisionPolygon3D] child nodes. It detects when other [godot.CollisionObject3D]s enter or exit it, and it also keeps track of which collision objects haven't exited it yet (i.e. which one are overlapping it).
 *
 * This node can also locally alter or override physics parameters (gravity, damping) and route audio to custom audio buses.
 *
 * **Warning:** Using a [godot.ConcavePolygonShape3D] inside a [godot.CollisionShape3D] child of this node (created e.g. by using the *Create Trimesh Collision Sibling* option in the *Mesh* menu that appears when selecting a [godot.MeshInstance3D] node) may give unexpected results, since this collision shape is hollow. If this is not desired, it has to be split into multiple [godot.ConvexPolygonShape3D]s or primitive shapes like [godot.BoxShape3D], or in some cases it may be replaceable by a [godot.CollisionPolygon3D].
 */
@GodotBaseType
public open class Area3D : CollisionObject3D() {
  /**
   * Emitted when a [godot.Shape3D] of the received [body] enters a shape of this area. [body] can be a [godot.PhysicsBody3D] or a [godot.GridMap]. [godot.GridMap]s are detected if their [godot.MeshLibrary] has collision shapes configured. Requires [monitoring] to be set to `true`.
   *
   * [localShapeIndex] and [bodyShapeIndex] contain indices of the interacting shapes from this area and the interacting body, respectively. [bodyRid] contains the [RID] of the body. These values can be used with the [godot.PhysicsServer3D].
   *
   * **Example of getting the** [godot.CollisionShape3D] **node from the shape index:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var body_shape_owner = body.shape_find_owner(body_shape_index)
   *
   * var body_shape_node = body.shape_owner_get_owner(body_shape_owner)
   *
   *
   *
   * var local_shape_owner = shape_find_owner(local_shape_index)
   *
   * var local_shape_node = shape_owner_get_owner(local_shape_owner)
   *
   * [/gdscript]
   *
   * [/codeblocks]
   */
  public val bodyShapeEntered: Signal4<RID, Node3D, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  /**
   * Emitted when a [godot.Shape3D] of the received [body] exits a shape of this area. [body] can be a [godot.PhysicsBody3D] or a [godot.GridMap]. [godot.GridMap]s are detected if their [godot.MeshLibrary] has collision shapes configured. Requires [monitoring] to be set to `true`.
   *
   * See also [bodyShapeEntered].
   */
  public val bodyShapeExited: Signal4<RID, Node3D, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  /**
   * Emitted when the received [body] enters this area. [body] can be a [godot.PhysicsBody3D] or a [godot.GridMap]. [godot.GridMap]s are detected if their [godot.MeshLibrary] has collision shapes configured. Requires [monitoring] to be set to `true`.
   */
  public val bodyEntered: Signal1<Node3D> by signal("body")

  /**
   * Emitted when the received [body] exits this area. [body] can be a [godot.PhysicsBody3D] or a [godot.GridMap]. [godot.GridMap]s are detected if their [godot.MeshLibrary] has collision shapes configured. Requires [monitoring] to be set to `true`.
   */
  public val bodyExited: Signal1<Node3D> by signal("body")

  /**
   * Emitted when a [godot.Shape3D] of the received [area] enters a shape of this area. Requires [monitoring] to be set to `true`.
   *
   * [localShapeIndex] and [areaShapeIndex] contain indices of the interacting shapes from this area and the other area, respectively. [areaRid] contains the [RID] of the other area. These values can be used with the [godot.PhysicsServer3D].
   *
   * **Example of getting the** [godot.CollisionShape3D] **node from the shape index:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var other_shape_owner = area.shape_find_owner(area_shape_index)
   *
   * var other_shape_node = area.shape_owner_get_owner(other_shape_owner)
   *
   *
   *
   * var local_shape_owner = shape_find_owner(local_shape_index)
   *
   * var local_shape_node = shape_owner_get_owner(local_shape_owner)
   *
   * [/gdscript]
   *
   * [/codeblocks]
   */
  public val areaShapeEntered: Signal4<RID, Area3D, Long, Long> by signal("areaRid", "area",
      "areaShapeIndex", "localShapeIndex")

  /**
   * Emitted when a [godot.Shape3D] of the received [area] exits a shape of this area. Requires [monitoring] to be set to `true`.
   *
   * See also [areaShapeEntered].
   */
  public val areaShapeExited: Signal4<RID, Area3D, Long, Long> by signal("areaRid", "area",
      "areaShapeIndex", "localShapeIndex")

  /**
   * Emitted when the received [area] enters this area. Requires [monitoring] to be set to `true`.
   */
  public val areaEntered: Signal1<Area3D> by signal("area")

  /**
   * Emitted when the received [area] exits this area. Requires [monitoring] to be set to `true`.
   */
  public val areaExited: Signal1<Area3D> by signal("area")

  /**
   * If `true`, the area detects bodies or areas entering and exiting it.
   */
  public var monitoring: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_IS_MONITORING, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
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
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_MONITORABLE, NIL)
    }

  /**
   * The area's priority. Higher priority areas are processed first. The [godot.World3D]'s physics is always processed last, after all areas.
   */
  public var priority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_PRIORITY, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_PRIORITY, NIL)
    }

  /**
   * Override mode for gravity calculations within this area. See [enum SpaceOverride] for possible values.
   */
  public var gravitySpaceOverride: SpaceOverride
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_GET_GRAVITY_SPACE_OVERRIDE_MODE, LONG)
      return Area3D.SpaceOverride.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
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
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_GRAVITY_IS_POINT, NIL)
    }

  /**
   * The distance at which the gravity strength is equal to [gravity]. For example, on a planet 100 meters in radius with a surface gravity of 4.0 m/s², set the [gravity] to 4.0 and the unit distance to 100.0. The gravity will have falloff according to the inverse square law, so in the example, at 200 meters from the center the gravity will be 1.0 m/s² (twice the distance, 1/4th the gravity), at 50 meters it will be 16.0 m/s² (half the distance, 4x the gravity), and so on.
   *
   * The above is true only when the unit distance is a positive number. When this is set to 0.0, the gravity will be constant regardless of distance.
   */
  public var gravityPointUnitDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_GET_GRAVITY_POINT_UNIT_DISTANCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_SET_GRAVITY_POINT_UNIT_DISTANCE, NIL)
    }

  /**
   * If gravity is a point (see [gravityPoint]), this will be the point of attraction.
   */
  public var gravityPointCenter: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_GRAVITY_POINT_CENTER,
          VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
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
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_GRAVITY_DIRECTION, NIL)
    }

  /**
   * The area's gravity intensity (in meters per second squared). This value multiplies the gravity direction. This is useful to alter the force of gravity without altering its direction.
   */
  public var gravity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_GRAVITY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_GRAVITY, NIL)
    }

  /**
   * Override mode for linear damping calculations within this area. See [enum SpaceOverride] for possible values.
   */
  public var linearDampSpaceOverride: SpaceOverride
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_GET_LINEAR_DAMP_SPACE_OVERRIDE_MODE, LONG)
      return Area3D.SpaceOverride.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_SET_LINEAR_DAMP_SPACE_OVERRIDE_MODE, NIL)
    }

  /**
   * The rate at which objects stop moving in this area. Represents the linear velocity lost per second.
   *
   * See [godot.ProjectSettings.physics/3d/defaultLinearDamp] for more details about damping.
   */
  public var linearDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_LINEAR_DAMP, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_LINEAR_DAMP, NIL)
    }

  /**
   * Override mode for angular damping calculations within this area. See [enum SpaceOverride] for possible values.
   */
  public var angularDampSpaceOverride: SpaceOverride
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_GET_ANGULAR_DAMP_SPACE_OVERRIDE_MODE, LONG)
      return Area3D.SpaceOverride.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_SET_ANGULAR_DAMP_SPACE_OVERRIDE_MODE, NIL)
    }

  /**
   * The rate at which objects stop spinning in this area. Represents the angular velocity lost per second.
   *
   * See [godot.ProjectSettings.physics/3d/defaultAngularDamp] for more details about damping.
   */
  public var angularDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_ANGULAR_DAMP, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_ANGULAR_DAMP, NIL)
    }

  /**
   * The magnitude of area-specific wind force.
   */
  public var windForceMagnitude: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_WIND_FORCE_MAGNITUDE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_WIND_FORCE_MAGNITUDE,
          NIL)
    }

  /**
   * The exponential rate at which wind force decreases with distance from its origin.
   */
  public var windAttenuationFactor: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_GET_WIND_ATTENUATION_FACTOR, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AREA3D_SET_WIND_ATTENUATION_FACTOR, NIL)
    }

  /**
   * The [godot.Node3D] which is used to specify the direction and origin of an area-specific wind force. The direction is opposite to the z-axis of the [godot.Node3D]'s local transform, and its origin is the origin of the [godot.Node3D]'s local transform.
   */
  public var windSourcePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_WIND_SOURCE_PATH,
          NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
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
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
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
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_AUDIO_BUS_NAME, NIL)
    }

  /**
   * If `true`, the area applies reverb to its associated audio.
   */
  public var reverbBusEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_IS_USING_REVERB_BUS, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_USE_REVERB_BUS, NIL)
    }

  /**
   * The name of the reverb bus to use for this area's associated audio.
   */
  public var reverbBusName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_REVERB_BUS_NAME,
          STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_REVERB_BUS_NAME, NIL)
    }

  /**
   * The degree to which this area applies reverb to its associated audio. Ranges from `0` to `1` with `0.1` precision.
   */
  public var reverbBusAmount: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_REVERB_AMOUNT, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_REVERB_AMOUNT, NIL)
    }

  /**
   * The degree to which this area's reverb is a uniform effect. Ranges from `0` to `1` with `0.1` precision.
   */
  public var reverbBusUniformity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_REVERB_UNIFORMITY,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_SET_REVERB_UNIFORMITY, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AREA3D, scriptIndex)
    return true
  }

  /**
   * If gravity is a point (see [gravityPoint]), this will be the point of attraction.
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
   * val myCoreType = area3d.gravityPointCenter
   * //Your changes
   * area3d.gravityPointCenter = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun gravityPointCenterMutate(block: Vector3.() -> Unit): Vector3 =
      gravityPointCenter.apply{
      block(this)
      gravityPointCenter = this
  }


  /**
   * The area's gravity vector (not normalized).
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
   * val myCoreType = area3d.gravityDirection
   * //Your changes
   * area3d.gravityDirection = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun gravityDirectionMutate(block: Vector3.() -> Unit): Vector3 =
      gravityDirection.apply{
      block(this)
      gravityDirection = this
  }


  /**
   * Returns a list of intersecting [godot.PhysicsBody3D]s and [godot.GridMap]s. The overlapping body's [godot.CollisionObject3D.collisionLayer] must be part of this area's [godot.CollisionObject3D.collisionMask] in order to be detected.
   *
   * For performance reasons (collisions are all processed at the same time) this list is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  public fun getOverlappingBodies(): VariantArray<Node3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_OVERLAPPING_BODIES,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node3D>)
  }

  /**
   * Returns a list of intersecting [godot.Area3D]s. The overlapping area's [godot.CollisionObject3D.collisionLayer] must be part of this area's [godot.CollisionObject3D.collisionMask] in order to be detected.
   *
   * For performance reasons (collisions are all processed at the same time) this list is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  public fun getOverlappingAreas(): VariantArray<Area3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_GET_OVERLAPPING_AREAS, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Area3D>)
  }

  /**
   * Returns `true` if intersecting any [godot.PhysicsBody3D]s or [godot.GridMap]s, otherwise returns `false`. The overlapping body's [godot.CollisionObject3D.collisionLayer] must be part of this area's [godot.CollisionObject3D.collisionMask] in order to be detected.
   *
   * For performance reasons (collisions are all processed at the same time) the list of overlapping bodies is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  public fun hasOverlappingBodies(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_HAS_OVERLAPPING_BODIES, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if intersecting any [godot.Area3D]s, otherwise returns `false`. The overlapping area's [godot.CollisionObject3D.collisionLayer] must be part of this area's [godot.CollisionObject3D.collisionMask] in order to be detected.
   *
   * For performance reasons (collisions are all processed at the same time) the list of overlapping areas is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  public fun hasOverlappingAreas(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_HAS_OVERLAPPING_AREAS, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the given physics body intersects or overlaps this [godot.Area3D], `false` otherwise.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, list of overlaps is updated once per frame and before the physics step. Consider using signals instead.
   *
   * The [body] argument can either be a [godot.PhysicsBody3D] or a [godot.GridMap] instance. While GridMaps are not physics body themselves, they register their tiles with collision shapes as a virtual physics body.
   */
  public fun overlapsBody(body: Node): Boolean {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_OVERLAPS_BODY, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the given [godot.Area3D] intersects or overlaps this [godot.Area3D], `false` otherwise.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, list of overlaps is updated once per frame and before the physics step. Consider using signals instead.
   */
  public fun overlapsArea(area: Node): Boolean {
    TransferContext.writeArguments(OBJECT to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AREA3D_OVERLAPS_AREA, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class SpaceOverride(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
