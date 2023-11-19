// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal4
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A region of 2D space that detects other [godot.CollisionObject2D]s entering or exiting it.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/120](https://godotengine.org/asset-library/asset/120)
 *
 * [godot.Area2D] is a region of 2D space defined by one or multiple [godot.CollisionShape2D] or [godot.CollisionPolygon2D] child nodes. It detects when other [godot.CollisionObject2D]s enter or exit it, and it also keeps track of which collision objects haven't exited it yet (i.e. which one are overlapping it).
 *
 * This node can also locally alter or override physics parameters (gravity, damping) and route audio to custom audio buses.
 */
@GodotBaseType
public open class Area2D : CollisionObject2D() {
  /**
   * Emitted when a [godot.Shape2D] of the received [body] enters a shape of this area. [body] can be a [godot.PhysicsBody2D] or a [godot.TileMap]. [godot.TileMap]s are detected if their [godot.TileSet] has collision shapes configured. Requires [monitoring] to be set to `true`.
   *
   * [localShapeIndex] and [bodyShapeIndex] contain indices of the interacting shapes from this area and the interacting body, respectively. [bodyRid] contains the [RID] of the body. These values can be used with the [godot.PhysicsServer2D].
   *
   * **Example of getting the** [godot.CollisionShape2D] **node from the shape index:**
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
  public val bodyShapeEntered: Signal4<RID, Node2D, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  /**
   * Emitted when a [godot.Shape2D] of the received [body] exits a shape of this area. [body] can be a [godot.PhysicsBody2D] or a [godot.TileMap]. [godot.TileMap]s are detected if their [godot.TileSet] has collision shapes configured. Requires [monitoring] to be set to `true`.
   *
   * See also [bodyShapeEntered].
   */
  public val bodyShapeExited: Signal4<RID, Node2D, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  /**
   * Emitted when the received [body] enters this area. [body] can be a [godot.PhysicsBody2D] or a [godot.TileMap]. [godot.TileMap]s are detected if their [godot.TileSet] has collision shapes configured. Requires [monitoring] to be set to `true`.
   */
  public val bodyEntered: Signal1<Node2D> by signal("body")

  /**
   * Emitted when the received [body] exits this area. [body] can be a [godot.PhysicsBody2D] or a [godot.TileMap]. [godot.TileMap]s are detected if their [godot.TileSet] has collision shapes configured. Requires [monitoring] to be set to `true`.
   */
  public val bodyExited: Signal1<Node2D> by signal("body")

  /**
   * Emitted when a [godot.Shape2D] of the received [area] enters a shape of this area. Requires [monitoring] to be set to `true`.
   *
   * [localShapeIndex] and [areaShapeIndex] contain indices of the interacting shapes from this area and the other area, respectively. [areaRid] contains the [RID] of the other area. These values can be used with the [godot.PhysicsServer2D].
   *
   * **Example of getting the** [godot.CollisionShape2D] **node from the shape index:**
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
  public val areaShapeEntered: Signal4<RID, Area2D, Long, Long> by signal("areaRid", "area",
      "areaShapeIndex", "localShapeIndex")

  /**
   * Emitted when a [godot.Shape2D] of the received [area] exits a shape of this area. Requires [monitoring] to be set to `true`.
   *
   * See also [areaShapeEntered].
   */
  public val areaShapeExited: Signal4<RID, Area2D, Long, Long> by signal("areaRid", "area",
      "areaShapeIndex", "localShapeIndex")

  /**
   * Emitted when the received [area] enters this area. Requires [monitoring] to be set to `true`.
   */
  public val areaEntered: Signal1<Area2D> by signal("area")

  /**
   * Emitted when the received [area] exits this area. Requires [monitoring] to be set to `true`.
   */
  public val areaExited: Signal1<Area2D> by signal("area")

  /**
   * If `true`, the area detects bodies or areas entering and exiting it.
   */
  public var monitoring: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMonitoringPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMonitoringPtr, NIL)
    }

  /**
   * If `true`, other monitoring areas can detect this area.
   */
  public var monitorable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMonitorablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMonitorablePtr, NIL)
    }

  /**
   * The area's priority. Higher priority areas are processed first. The [godot.World2D]'s physics is always processed last, after all areas.
   */
  public var priority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPriorityPtr, NIL)
    }

  /**
   * Override mode for gravity calculations within this area. See [enum SpaceOverride] for possible values.
   */
  public var gravitySpaceOverride: SpaceOverride
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravitySpaceOverrideModePtr, LONG)
      return Area2D.SpaceOverride.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravitySpaceOverrideModePtr, NIL)
    }

  /**
   * If `true`, gravity is calculated from a point (set via [gravityPointCenter]). See also [gravitySpaceOverride].
   */
  public var gravityPoint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isGravityAPointPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityIsPointPtr, NIL)
    }

  /**
   * The distance at which the gravity strength is equal to [gravity]. For example, on a planet 100 pixels in radius with a surface gravity of 4.0 px/s², set the [gravity] to 4.0 and the unit distance to 100.0. The gravity will have falloff according to the inverse square law, so in the example, at 200 pixels from the center the gravity will be 1.0 px/s² (twice the distance, 1/4th the gravity), at 50 pixels it will be 16.0 px/s² (half the distance, 4x the gravity), and so on.
   *
   * The above is true only when the unit distance is a positive number. When this is set to 0.0, the gravity will be constant regardless of distance.
   */
  public var gravityPointUnitDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityPointUnitDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityPointUnitDistancePtr, NIL)
    }

  /**
   * If gravity is a point (see [gravityPoint]), this will be the point of attraction.
   */
  @CoreTypeLocalCopy
  public var gravityPointCenter: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityPointCenterPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityPointCenterPtr, NIL)
    }

  /**
   * The area's gravity vector (not normalized).
   */
  @CoreTypeLocalCopy
  public var gravityDirection: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityDirectionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityDirectionPtr, NIL)
    }

  /**
   * The area's gravity intensity (in pixels per second squared). This value multiplies the gravity direction. This is useful to alter the force of gravity without altering its direction.
   */
  public var gravity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityPtr, NIL)
    }

  /**
   * Override mode for linear damping calculations within this area. See [enum SpaceOverride] for possible values.
   */
  public var linearDampSpaceOverride: SpaceOverride
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampSpaceOverrideModePtr, LONG)
      return Area2D.SpaceOverride.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearDampSpaceOverrideModePtr, NIL)
    }

  /**
   * The rate at which objects stop moving in this area. Represents the linear velocity lost per second.
   *
   * See [godot.ProjectSettings.physics/2d/defaultLinearDamp] for more details about damping.
   */
  public var linearDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearDampPtr, NIL)
    }

  /**
   * Override mode for angular damping calculations within this area. See [enum SpaceOverride] for possible values.
   */
  public var angularDampSpaceOverride: SpaceOverride
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampSpaceOverrideModePtr, LONG)
      return Area2D.SpaceOverride.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularDampSpaceOverrideModePtr, NIL)
    }

  /**
   * The rate at which objects stop spinning in this area. Represents the angular velocity lost per second.
   *
   * See [godot.ProjectSettings.physics/2d/defaultAngularDamp] for more details about damping.
   */
  public var angularDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularDampPtr, NIL)
    }

  /**
   * If `true`, the area's audio bus overrides the default audio bus.
   */
  public var audioBusOverride: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isOverridingAudioBusPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAudioBusOverridePtr, NIL)
    }

  /**
   * The name of the area's audio bus.
   */
  public var audioBusName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAudioBusNamePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAudioBusNamePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AREA2D, scriptIndex)
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
   * val myCoreType = area2d.gravityPointCenter
   * //Your changes
   * area2d.gravityPointCenter = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun gravityPointCenterMutate(block: Vector2.() -> Unit): Vector2 =
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
   * val myCoreType = area2d.gravityDirection
   * //Your changes
   * area2d.gravityDirection = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun gravityDirectionMutate(block: Vector2.() -> Unit): Vector2 =
      gravityDirection.apply{
      block(this)
      gravityDirection = this
  }


  /**
   * Returns a list of intersecting [godot.PhysicsBody2D]s and [godot.TileMap]s. The overlapping body's [godot.CollisionObject2D.collisionLayer] must be part of this area's [godot.CollisionObject2D.collisionMask] in order to be detected.
   *
   * For performance reasons (collisions are all processed at the same time) this list is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  public fun getOverlappingBodies(): VariantArray<Node2D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOverlappingBodiesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node2D>)
  }

  /**
   * Returns a list of intersecting [godot.Area2D]s. The overlapping area's [godot.CollisionObject2D.collisionLayer] must be part of this area's [godot.CollisionObject2D.collisionMask] in order to be detected.
   *
   * For performance reasons (collisions are all processed at the same time) this list is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  public fun getOverlappingAreas(): VariantArray<Area2D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOverlappingAreasPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Area2D>)
  }

  /**
   * Returns `true` if intersecting any [godot.PhysicsBody2D]s or [godot.TileMap]s, otherwise returns `false`. The overlapping body's [godot.CollisionObject2D.collisionLayer] must be part of this area's [godot.CollisionObject2D.collisionMask] in order to be detected.
   *
   * For performance reasons (collisions are all processed at the same time) the list of overlapping bodies is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  public fun hasOverlappingBodies(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasOverlappingBodiesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if intersecting any [godot.Area2D]s, otherwise returns `false`. The overlapping area's [godot.CollisionObject2D.collisionLayer] must be part of this area's [godot.CollisionObject2D.collisionMask] in order to be detected.
   *
   * For performance reasons (collisions are all processed at the same time) the list of overlapping areas is modified once during the physics step, not immediately after objects are moved. Consider using signals instead.
   */
  public fun hasOverlappingAreas(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasOverlappingAreasPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the given physics body intersects or overlaps this [godot.Area2D], `false` otherwise.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, list of overlaps is updated once per frame and before the physics step. Consider using signals instead.
   *
   * The [body] argument can either be a [godot.PhysicsBody2D] or a [godot.TileMap] instance. While TileMaps are not physics bodies themselves, they register their tiles with collision shapes as a virtual physics body.
   */
  public fun overlapsBody(body: Node): Boolean {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, MethodBindings.overlapsBodyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the given [godot.Area2D] intersects or overlaps this [godot.Area2D], `false` otherwise.
   *
   * **Note:** The result of this test is not immediate after moving objects. For performance, the list of overlaps is updated once per frame and before the physics step. Consider using signals instead.
   */
  public fun overlapsArea(area: Node): Boolean {
    TransferContext.writeArguments(OBJECT to area)
    TransferContext.callMethod(rawPtr, MethodBindings.overlapsAreaPtr, BOOL)
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

  internal object MethodBindings {
    public val setGravitySpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "set_gravity_space_override_mode")

    public val getGravitySpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "get_gravity_space_override_mode")

    public val setGravityIsPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "set_gravity_is_point")

    public val isGravityAPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "is_gravity_a_point")

    public val setGravityPointUnitDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "set_gravity_point_unit_distance")

    public val getGravityPointUnitDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "get_gravity_point_unit_distance")

    public val setGravityPointCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "set_gravity_point_center")

    public val getGravityPointCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "get_gravity_point_center")

    public val setGravityDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "set_gravity_direction")

    public val getGravityDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "get_gravity_direction")

    public val setGravityPtr: VoidPtr = TypeManager.getMethodBindPtr("Area2D", "set_gravity")

    public val getGravityPtr: VoidPtr = TypeManager.getMethodBindPtr("Area2D", "get_gravity")

    public val setLinearDampSpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "set_linear_damp_space_override_mode")

    public val getLinearDampSpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "get_linear_damp_space_override_mode")

    public val setAngularDampSpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "set_angular_damp_space_override_mode")

    public val getAngularDampSpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "get_angular_damp_space_override_mode")

    public val setLinearDampPtr: VoidPtr = TypeManager.getMethodBindPtr("Area2D", "set_linear_damp")

    public val getLinearDampPtr: VoidPtr = TypeManager.getMethodBindPtr("Area2D", "get_linear_damp")

    public val setAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "set_angular_damp")

    public val getAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "get_angular_damp")

    public val setPriorityPtr: VoidPtr = TypeManager.getMethodBindPtr("Area2D", "set_priority")

    public val getPriorityPtr: VoidPtr = TypeManager.getMethodBindPtr("Area2D", "get_priority")

    public val setMonitoringPtr: VoidPtr = TypeManager.getMethodBindPtr("Area2D", "set_monitoring")

    public val isMonitoringPtr: VoidPtr = TypeManager.getMethodBindPtr("Area2D", "is_monitoring")

    public val setMonitorablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "set_monitorable")

    public val isMonitorablePtr: VoidPtr = TypeManager.getMethodBindPtr("Area2D", "is_monitorable")

    public val getOverlappingBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "get_overlapping_bodies")

    public val getOverlappingAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "get_overlapping_areas")

    public val hasOverlappingBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "has_overlapping_bodies")

    public val hasOverlappingAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "has_overlapping_areas")

    public val overlapsBodyPtr: VoidPtr = TypeManager.getMethodBindPtr("Area2D", "overlaps_body")

    public val overlapsAreaPtr: VoidPtr = TypeManager.getMethodBindPtr("Area2D", "overlaps_area")

    public val setAudioBusNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "set_audio_bus_name")

    public val getAudioBusNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "get_audio_bus_name")

    public val setAudioBusOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "set_audio_bus_override")

    public val isOverridingAudioBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area2D", "is_overriding_audio_bus")
  }
}
