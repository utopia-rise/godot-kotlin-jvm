// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.RID
import godot.core.Transform2D
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A server interface for low-level 2D physics access.
 *
 * PhysicsServer2D is the server responsible for all 2D physics. It can directly create and manipulate all physics objects:
 *
 * - A *space* is a self-contained world for a physics simulation. It contains bodies, areas, and joints. Its state can be queried for collision and intersection information, and several parameters of the simulation can be modified.
 *
 * - A *shape* is a geometric shape such as a circle, a rectangle, a capsule, or a polygon. It can be used for collision detection by adding it to a body/area, possibly with an extra transformation relative to the body/area's origin. Bodies/areas can have multiple (transformed) shapes added to them, and a single shape can be added to bodies/areas multiple times with different local transformations.
 *
 * - A *body* is a physical object which can be in static, kinematic, or rigid mode. Its state (such as position and velocity) can be queried and updated. A force integration callback can be set to customize the body's physics.
 *
 * - An *area* is a region in space which can be used to detect bodies and areas entering and exiting it. A body monitoring callback can be set to report entering/exiting body shapes, and similarly an area monitoring callback can be set. Gravity and damping can be overridden within the area by setting area parameters.
 *
 * - A *joint* is a constraint, either between two bodies or on one body relative to a point. Parameters such as the joint bias and the rest length of a spring joint can be adjusted.
 *
 * Physics objects in [godot.PhysicsServer2D] may be created and manipulated independently; they do not have to be tied to nodes in the scene tree.
 *
 * **Note:** All the 2D physics nodes use the physics server internally. Adding a physics node to the scene tree will cause a corresponding physics object to be created in the physics server. A rigid body node registers a callback that updates the node's transform with the transform of the respective body object in the physics server (every physics update). An area node registers a callback to inform the area node about overlaps with the respective area object in the physics server. The raycast node queries the direct state of the relevant space in the physics server.
 */
@GodotBaseType
public object PhysicsServer2D : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_PHYSICSSERVER2D)
    return false
  }

  /**
   * Creates a 2D world boundary shape in the physics server, and returns the [RID] that identifies it. Use [shapeSetData] to set the shape's normal direction and distance properties.
   */
  public fun worldBoundaryShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_WORLD_BOUNDARY_SHAPE_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a 2D separation ray shape in the physics server, and returns the [RID] that identifies it. Use [shapeSetData] to set the shape's `length` and `slide_on_slope` properties.
   */
  public fun separationRayShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SEPARATION_RAY_SHAPE_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a 2D segment shape in the physics server, and returns the [RID] that identifies it. Use [shapeSetData] to set the segment's start and end points.
   */
  public fun segmentShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SEGMENT_SHAPE_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a 2D circle shape in the physics server, and returns the [RID] that identifies it. Use [shapeSetData] to set the circle's radius.
   */
  public fun circleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_CIRCLE_SHAPE_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a 2D rectangle shape in the physics server, and returns the [RID] that identifies it. Use [shapeSetData] to set the rectangle's half-extents.
   */
  public fun rectangleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_RECTANGLE_SHAPE_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a 2D capsule shape in the physics server, and returns the [RID] that identifies it. Use [shapeSetData] to set the capsule's height and radius.
   */
  public fun capsuleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_CAPSULE_SHAPE_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a 2D convex polygon shape in the physics server, and returns the [RID] that identifies it. Use [shapeSetData] to set the convex polygon's points.
   */
  public fun convexPolygonShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_CONVEX_POLYGON_SHAPE_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a 2D concave polygon shape in the physics server, and returns the [RID] that identifies it. Use [shapeSetData] to set the concave polygon's segments.
   */
  public fun concavePolygonShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_CONCAVE_POLYGON_SHAPE_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the shape data that defines the configuration of the shape. The [data] to be passed depends on the shape's type (see [shapeGetType]):
   *
   * - [SHAPE_WORLD_BOUNDARY]: an array of length two containing a [godot.core.Vector2] `normal` direction and a `float` distance `d`,
   *
   * - [SHAPE_SEPARATION_RAY]: a dictionary containing the key `length` with a `float` value and the key `slide_on_slope` with a `bool` value,
   *
   * - [SHAPE_SEGMENT]: a [godot.core.Rect2] `rect` containing the first point of the segment in `rect.position` and the second point of the segment in `rect.size`,
   *
   * - [SHAPE_CIRCLE]: a `float` `radius`,
   *
   * - [SHAPE_RECTANGLE]: a [godot.core.Vector2] `half_extents`,
   *
   * - [SHAPE_CAPSULE]: an array of length two (or a [godot.core.Vector2]) containing a `float` `height` and a `float` `radius`,
   *
   * - [SHAPE_CONVEX_POLYGON]: either a [godot.PackedVector2Array] of points defining a convex polygon in counterclockwise order (the clockwise outward normal of each segment formed by consecutive points is calculated internally), or a [godot.PackedFloat32Array] of length divisible by four so that every 4-tuple of `float`s contains the coordinates of a point followed by the coordinates of the clockwise outward normal vector to the segment between the current point and the next point,
   *
   * - [SHAPE_CONCAVE_POLYGON]: a [godot.PackedVector2Array] of length divisible by two (each pair of points forms one segment).
   *
   * **Warning:** In the case of [SHAPE_CONVEX_POLYGON], this method does not check if the points supplied actually form a convex polygon (unlike the [godot.CollisionPolygon2D.polygon] property).
   */
  public fun shapeSetData(shape: RID, `data`: Any): Unit {
    TransferContext.writeArguments(_RID to shape, ANY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SHAPE_SET_DATA, NIL)
  }

  /**
   * Returns the shape's type (see [enum ShapeType]).
   */
  public fun shapeGetType(shape: RID): ShapeType {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SHAPE_GET_TYPE,
        LONG)
    return PhysicsServer2D.ShapeType.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Returns the shape data that defines the configuration of the shape, such as the half-extents of a rectangle or the segments of a concave shape. See [shapeSetData] for the precise format of this data in each case.
   */
  public fun shapeGetData(shape: RID): Any? {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SHAPE_GET_DATA, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Creates a 2D space in the physics server, and returns the [RID] that identifies it. A space contains bodies and areas, and controls the stepping of the physics simulation of the objects in it.
   */
  public fun spaceCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SPACE_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Activates or deactivates the space. If [active] is `false`, then the physics server will not do anything with this space in its physics step.
   */
  public fun spaceSetActive(space: RID, active: Boolean): Unit {
    TransferContext.writeArguments(_RID to space, BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SPACE_SET_ACTIVE,
        NIL)
  }

  /**
   * Returns `true` if the space is active.
   */
  public fun spaceIsActive(space: RID): Boolean {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SPACE_IS_ACTIVE,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the value of the given space parameter. See [enum SpaceParameter] for the list of available parameters.
   */
  public fun spaceSetParam(
    space: RID,
    `param`: SpaceParameter,
    `value`: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to space, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SPACE_SET_PARAM,
        NIL)
  }

  /**
   * Returns the value of the given space parameter. See [enum SpaceParameter] for the list of available parameters.
   */
  public fun spaceGetParam(space: RID, `param`: SpaceParameter): Float {
    TransferContext.writeArguments(_RID to space, LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SPACE_GET_PARAM,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the state of a space, a [godot.PhysicsDirectSpaceState2D]. This object can be used for collision/intersection queries.
   */
  public fun spaceGetDirectState(space: RID): PhysicsDirectSpaceState2D? {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SPACE_GET_DIRECT_STATE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState2D?)
  }

  /**
   * Creates a 2D area object in the physics server, and returns the [RID] that identifies it. Use [areaAddShape] to add shapes to it, use [areaSetTransform] to set its transform, and use [areaSetSpace] to add the area to a space.
   */
  public fun areaCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Adds the area to the given space, after removing the area from the previously assigned space (if any).
   *
   * **Note:** To remove an area from a space without immediately adding it back elsewhere, use `PhysicsServer2D.area_set_space(area, RID())`.
   */
  public fun areaSetSpace(area: RID, space: RID): Unit {
    TransferContext.writeArguments(_RID to area, _RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_SPACE, NIL)
  }

  /**
   * Returns the [RID] of the space assigned to the area. Returns `RID()` if no space is assigned.
   */
  public fun areaGetSpace(area: RID): RID {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_SPACE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Adds a shape to the area, with the given local transform. The shape (together with its [transform] and [disabled] properties) is added to an array of shapes, and the shapes of an area are usually referenced by their index in this array.
   */
  @JvmOverloads
  public fun areaAddShape(
    area: RID,
    shape: RID,
    transform: Transform2D = Transform2D(),
    disabled: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to area, _RID to shape, TRANSFORM2D to transform, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_ADD_SHAPE, NIL)
  }

  /**
   * Replaces the area's shape at the given index by another shape, while not affecting the `transform` and `disabled` properties at the same index.
   */
  public fun areaSetShape(
    area: RID,
    shapeIdx: Int,
    shape: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong(), _RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_SHAPE, NIL)
  }

  /**
   * Sets the local transform matrix of the area's shape with the given index.
   */
  public fun areaSetShapeTransform(
    area: RID,
    shapeIdx: Int,
    transform: Transform2D,
  ): Unit {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_SHAPE_TRANSFORM, NIL)
  }

  /**
   * Sets the disabled property of the area's shape with the given index. If [disabled] is `true`, then the shape will not detect any other shapes entering or exiting it.
   */
  public fun areaSetShapeDisabled(
    area: RID,
    shapeIdx: Int,
    disabled: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_SHAPE_DISABLED, NIL)
  }

  /**
   * Returns the number of shapes added to the area.
   */
  public fun areaGetShapeCount(area: RID): Int {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_SHAPE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [RID] of the shape with the given index in the area's array of shapes.
   */
  public fun areaGetShape(area: RID, shapeIdx: Int): RID {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_SHAPE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the local transform matrix of the shape with the given index in the area's array of shapes.
   */
  public fun areaGetShapeTransform(area: RID, shapeIdx: Int): Transform2D {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_SHAPE_TRANSFORM, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Removes the shape with the given index from the area's array of shapes. The shape itself is not deleted, so it can continue to be used elsewhere or added back later. As a result of this operation, the area's shapes which used to have indices higher than [shapeIdx] will have their index decreased by one.
   */
  public fun areaRemoveShape(area: RID, shapeIdx: Int): Unit {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_REMOVE_SHAPE,
        NIL)
  }

  /**
   * Removes all shapes from the area. This does not delete the shapes themselves, so they can continue to be used elsewhere or added back later.
   */
  public fun areaClearShapes(area: RID): Unit {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_CLEAR_SHAPES,
        NIL)
  }

  /**
   * Assigns the area to one or many physics layers, via a bitmask.
   */
  public fun areaSetCollisionLayer(area: RID, layer: Int): Unit {
    TransferContext.writeArguments(_RID to area, LONG to layer.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_COLLISION_LAYER, NIL)
  }

  /**
   * Returns the physics layer or layers the area belongs to, as a bitmask.
   */
  public fun areaGetCollisionLayer(area: RID): Int {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_COLLISION_LAYER, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets which physics layers the area will monitor, via a bitmask.
   */
  public fun areaSetCollisionMask(area: RID, mask: Int): Unit {
    TransferContext.writeArguments(_RID to area, LONG to mask.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_COLLISION_MASK, NIL)
  }

  /**
   * Returns the physics layer or layers the area can contact with, as a bitmask.
   */
  public fun areaGetCollisionMask(area: RID): Int {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_COLLISION_MASK, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the value of the given area parameter. See [enum AreaParameter] for the list of available parameters.
   */
  public fun areaSetParam(
    area: RID,
    `param`: AreaParameter,
    `value`: Any,
  ): Unit {
    TransferContext.writeArguments(_RID to area, LONG to param.id, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_PARAM, NIL)
  }

  /**
   * Sets the transform matrix of the area.
   */
  public fun areaSetTransform(area: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to area, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_TRANSFORM,
        NIL)
  }

  /**
   * Returns the value of the given area parameter. See [enum AreaParameter] for the list of available parameters.
   */
  public fun areaGetParam(area: RID, `param`: AreaParameter): Any? {
    TransferContext.writeArguments(_RID to area, LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_PARAM, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns the transform matrix of the area.
   */
  public fun areaGetTransform(area: RID): Transform2D {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_TRANSFORM,
        TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Attaches the `ObjectID` of an [godot.Object] to the area. Use [godot.Object.getInstanceId] to get the `ObjectID` of a [godot.CollisionObject2D].
   */
  public fun areaAttachObjectInstanceId(area: RID, id: Long): Unit {
    TransferContext.writeArguments(_RID to area, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  /**
   * Returns the `ObjectID` attached to the area. Use [@GlobalScope.instanceFromId] to retrieve an [godot.Object] from a nonzero `ObjectID`.
   */
  public fun areaGetObjectInstanceId(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_OBJECT_INSTANCE_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Attaches the `ObjectID` of a canvas to the area. Use [godot.Object.getInstanceId] to get the `ObjectID` of a [godot.CanvasLayer].
   */
  public fun areaAttachCanvasInstanceId(area: RID, id: Long): Unit {
    TransferContext.writeArguments(_RID to area, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_ATTACH_CANVAS_INSTANCE_ID, NIL)
  }

  /**
   * Returns the `ObjectID` of the canvas attached to the area. Use [@GlobalScope.instanceFromId] to retrieve a [godot.CanvasLayer] from a nonzero `ObjectID`.
   */
  public fun areaGetCanvasInstanceId(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_CANVAS_INSTANCE_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the area's body monitor callback. This callback will be called when any other (shape of a) body enters or exits (a shape of) the given area, and must take the following five parameters:
   *
   * 1. an integer `status`: either [AREA_BODY_ADDED] or [AREA_BODY_REMOVED] depending on whether the other body shape entered or exited the area,
   *
   * 2. an [RID] `body_rid`: the [RID] of the body that entered or exited the area,
   *
   * 3. an integer `instance_id`: the `ObjectID` attached to the body,
   *
   * 4. an integer `body_shape_idx`: the index of the shape of the body that entered or exited the area,
   *
   * 5. an integer `self_shape_idx`: the index of the shape of the area where the body entered or exited.
   *
   * By counting (or keeping track of) the shapes that enter and exit, it can be determined if a body (with all its shapes) is entering for the first time or exiting for the last time.
   */
  public fun areaSetMonitorCallback(area: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to area, CALLABLE to callback)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_MONITOR_CALLBACK, NIL)
  }

  /**
   * Sets the area's area monitor callback. This callback will be called when any other (shape of an) area enters or exits (a shape of) the given area, and must take the following five parameters:
   *
   * 1. an integer `status`: either [AREA_BODY_ADDED] or [AREA_BODY_REMOVED] depending on whether the other area's shape entered or exited the area,
   *
   * 2. an [RID] `area_rid`: the [RID] of the other area that entered or exited the area,
   *
   * 3. an integer `instance_id`: the `ObjectID` attached to the other area,
   *
   * 4. an integer `area_shape_idx`: the index of the shape of the other area that entered or exited the area,
   *
   * 5. an integer `self_shape_idx`: the index of the shape of the area where the other area entered or exited.
   *
   * By counting (or keeping track of) the shapes that enter and exit, it can be determined if an area (with all its shapes) is entering for the first time or exiting for the last time.
   */
  public fun areaSetAreaMonitorCallback(area: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to area, CALLABLE to callback)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_AREA_MONITOR_CALLBACK, NIL)
  }

  /**
   * Sets whether the area is monitorable or not. If [monitorable] is `true`, the area monitoring callback of other areas will be called when this area enters or exits them.
   */
  public fun areaSetMonitorable(area: RID, monitorable: Boolean): Unit {
    TransferContext.writeArguments(_RID to area, BOOL to monitorable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_MONITORABLE, NIL)
  }

  /**
   * Creates a 2D body object in the physics server, and returns the [RID] that identifies it. Use [bodyAddShape] to add shapes to it, use [bodySetState] to set its transform, and use [bodySetSpace] to add the body to a space.
   */
  public fun bodyCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Adds the body to the given space, after removing the body from the previously assigned space (if any). If the body's mode is set to [BODY_MODE_RIGID], then adding the body to a space will have the following additional effects:
   *
   * - If the parameter [BODY_PARAM_CENTER_OF_MASS] has never been set explicitly, then the value of that parameter will be recalculated based on the body's shapes.
   *
   * - If the parameter [BODY_PARAM_INERTIA] is set to a value `<= 0.0`, then the value of that parameter will be recalculated based on the body's shapes, mass, and center of mass.
   *
   * **Note:** To remove a body from a space without immediately adding it back elsewhere, use `PhysicsServer2D.body_set_space(body, RID())`.
   */
  public fun bodySetSpace(body: RID, space: RID): Unit {
    TransferContext.writeArguments(_RID to body, _RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_SPACE, NIL)
  }

  /**
   * Returns the [RID] of the space assigned to the body. Returns `RID()` if no space is assigned.
   */
  public fun bodyGetSpace(body: RID): RID {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_SPACE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the body's mode. See [enum BodyMode] for the list of available modes.
   */
  public fun bodySetMode(body: RID, mode: BodyMode): Unit {
    TransferContext.writeArguments(_RID to body, LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_MODE, NIL)
  }

  /**
   * Returns the body's mode (see [enum BodyMode]).
   */
  public fun bodyGetMode(body: RID): BodyMode {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_MODE, LONG)
    return PhysicsServer2D.BodyMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Adds a shape to the area, with the given local transform. The shape (together with its [transform] and [disabled] properties) is added to an array of shapes, and the shapes of a body are usually referenced by their index in this array.
   */
  @JvmOverloads
  public fun bodyAddShape(
    body: RID,
    shape: RID,
    transform: Transform2D = Transform2D(),
    disabled: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to body, _RID to shape, TRANSFORM2D to transform, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_ADD_SHAPE, NIL)
  }

  /**
   * Replaces the body's shape at the given index by another shape, while not affecting the `transform`, `disabled`, and one-way collision properties at the same index.
   */
  public fun bodySetShape(
    body: RID,
    shapeIdx: Int,
    shape: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong(), _RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_SHAPE, NIL)
  }

  /**
   * Sets the local transform matrix of the body's shape with the given index.
   */
  public fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Int,
    transform: Transform2D,
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_SHAPE_TRANSFORM, NIL)
  }

  /**
   * Returns the number of shapes added to the body.
   */
  public fun bodyGetShapeCount(body: RID): Int {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_SHAPE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [RID] of the shape with the given index in the body's array of shapes.
   */
  public fun bodyGetShape(body: RID, shapeIdx: Int): RID {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_SHAPE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the local transform matrix of the shape with the given index in the area's array of shapes.
   */
  public fun bodyGetShapeTransform(body: RID, shapeIdx: Int): Transform2D {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_SHAPE_TRANSFORM, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Removes the shape with the given index from the body's array of shapes. The shape itself is not deleted, so it can continue to be used elsewhere or added back later. As a result of this operation, the body's shapes which used to have indices higher than [shapeIdx] will have their index decreased by one.
   */
  public fun bodyRemoveShape(body: RID, shapeIdx: Int): Unit {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_REMOVE_SHAPE,
        NIL)
  }

  /**
   * Removes all shapes from the body. This does not delete the shapes themselves, so they can continue to be used elsewhere or added back later.
   */
  public fun bodyClearShapes(body: RID): Unit {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_CLEAR_SHAPES,
        NIL)
  }

  /**
   * Sets the disabled property of the body's shape with the given index. If [disabled] is `true`, then the shape will be ignored in all collision detection.
   */
  public fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Int,
    disabled: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_SHAPE_DISABLED, NIL)
  }

  /**
   * Sets the one-way collision properties of the body's shape with the given index. If [enable] is `true`, the one-way collision direction given by the shape's local upward axis `body_get_shape_transform(body, shape_idx).y` will be used to ignore collisions with the shape in the opposite direction, and to ensure depenetration of kinematic bodies happens in this direction.
   */
  public fun bodySetShapeAsOneWayCollision(
    body: RID,
    shapeIdx: Int,
    enable: Boolean,
    margin: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong(), BOOL to enable, DOUBLE to margin.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_SHAPE_AS_ONE_WAY_COLLISION, NIL)
  }

  /**
   * Attaches the `ObjectID` of an [godot.Object] to the body. Use [godot.Object.getInstanceId] to get the `ObjectID` of a [godot.CollisionObject2D].
   */
  public fun bodyAttachObjectInstanceId(body: RID, id: Long): Unit {
    TransferContext.writeArguments(_RID to body, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  /**
   * Returns the `ObjectID` attached to the body. Use [@GlobalScope.instanceFromId] to retrieve an [godot.Object] from a nonzero `ObjectID`.
   */
  public fun bodyGetObjectInstanceId(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_OBJECT_INSTANCE_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Attaches the `ObjectID` of a canvas to the body. Use [godot.Object.getInstanceId] to get the `ObjectID` of a [godot.CanvasLayer].
   */
  public fun bodyAttachCanvasInstanceId(body: RID, id: Long): Unit {
    TransferContext.writeArguments(_RID to body, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_ATTACH_CANVAS_INSTANCE_ID, NIL)
  }

  /**
   * Returns the `ObjectID` of the canvas attached to the body. Use [@GlobalScope.instanceFromId] to retrieve a [godot.CanvasLayer] from a nonzero `ObjectID`.
   */
  public fun bodyGetCanvasInstanceId(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_CANVAS_INSTANCE_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the continuous collision detection mode using one of the [enum CCDMode] constants.
   *
   * Continuous collision detection tries to predict where a moving body would collide in between physics updates, instead of moving it and correcting its movement if it collided.
   */
  public fun bodySetContinuousCollisionDetectionMode(body: RID, mode: CCDMode): Unit {
    TransferContext.writeArguments(_RID to body, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_CONTINUOUS_COLLISION_DETECTION_MODE, NIL)
  }

  /**
   * Returns the body's continuous collision detection mode (see [enum CCDMode]).
   */
  public fun bodyGetContinuousCollisionDetectionMode(body: RID): CCDMode {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_CONTINUOUS_COLLISION_DETECTION_MODE, LONG)
    return PhysicsServer2D.CCDMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Sets the physics layer or layers the body belongs to, via a bitmask.
   */
  public fun bodySetCollisionLayer(body: RID, layer: Int): Unit {
    TransferContext.writeArguments(_RID to body, LONG to layer.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_COLLISION_LAYER, NIL)
  }

  /**
   * Returns the physics layer or layers the body belongs to, as a bitmask.
   */
  public fun bodyGetCollisionLayer(body: RID): Int {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_COLLISION_LAYER, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the physics layer or layers the body can collide with, via a bitmask.
   */
  public fun bodySetCollisionMask(body: RID, mask: Int): Unit {
    TransferContext.writeArguments(_RID to body, LONG to mask.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_COLLISION_MASK, NIL)
  }

  /**
   * Returns the physics layer or layers the body can collide with, as a bitmask.
   */
  public fun bodyGetCollisionMask(body: RID): Int {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_COLLISION_MASK, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the body's collision priority. This is used in the depenetration phase of [bodyTestMotion]. The higher the priority is, the lower the penetration into the body will be.
   */
  public fun bodySetCollisionPriority(body: RID, priority: Float): Unit {
    TransferContext.writeArguments(_RID to body, DOUBLE to priority.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_COLLISION_PRIORITY, NIL)
  }

  /**
   * Returns the body's collision priority. This is used in the depenetration phase of [bodyTestMotion]. The higher the priority is, the lower the penetration into the body will be.
   */
  public fun bodyGetCollisionPriority(body: RID): Float {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_COLLISION_PRIORITY, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the value of the given body parameter. See [enum BodyParameter] for the list of available parameters.
   */
  public fun bodySetParam(
    body: RID,
    `param`: BodyParameter,
    `value`: Any,
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to param.id, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_PARAM, NIL)
  }

  /**
   * Returns the value of the given body parameter. See [enum BodyParameter] for the list of available parameters.
   */
  public fun bodyGetParam(body: RID, `param`: BodyParameter): Any? {
    TransferContext.writeArguments(_RID to body, LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_PARAM, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Restores the default inertia and center of mass of the body based on its shapes. This undoes any custom values previously set using [bodySetParam].
   */
  public fun bodyResetMassProperties(body: RID): Unit {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_RESET_MASS_PROPERTIES, NIL)
  }

  /**
   * Sets the value of a body's state. See [enum BodyState] for the list of available states.
   *
   * **Note:** The state change doesn't take effect immediately. The state will change on the next physics frame.
   */
  public fun bodySetState(
    body: RID,
    state: BodyState,
    `value`: Any,
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to state.id, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_STATE, NIL)
  }

  /**
   * Returns the value of the given state of the body. See [enum BodyState] for the list of available states.
   */
  public fun bodyGetState(body: RID, state: BodyState): Any? {
    TransferContext.writeArguments(_RID to body, LONG to state.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_STATE, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Applies a directional impulse to the body, at the body's center of mass. The impulse does not affect rotation.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * This is equivalent to using [bodyApplyImpulse] at the body's center of mass.
   */
  public fun bodyApplyCentralImpulse(body: RID, impulse: Vector2): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_APPLY_CENTRAL_IMPULSE, NIL)
  }

  /**
   * Applies a rotational impulse to the body. The impulse does not affect position.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   */
  public fun bodyApplyTorqueImpulse(body: RID, impulse: Float): Unit {
    TransferContext.writeArguments(_RID to body, DOUBLE to impulse.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_APPLY_TORQUE_IMPULSE, NIL)
  }

  /**
   * Applies a positioned impulse to the body. The impulse can affect rotation if [position] is different from the body's center of mass.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public fun bodyApplyImpulse(
    body: RID,
    impulse: Vector2,
    position: Vector2 = Vector2(0, 0),
  ): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to impulse, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_APPLY_IMPULSE,
        NIL)
  }

  /**
   * Applies a directional force to the body, at the body's center of mass. The force does not affect rotation. A force is time dependent and meant to be applied every physics update.
   *
   * This is equivalent to using [bodyApplyForce] at the body's center of mass.
   */
  public fun bodyApplyCentralForce(body: RID, force: Vector2): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_APPLY_CENTRAL_FORCE, NIL)
  }

  /**
   * Applies a positioned force to the body. The force can affect rotation if [position] is different from the body's center of mass. A force is time dependent and meant to be applied every physics update.
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public fun bodyApplyForce(
    body: RID,
    force: Vector2,
    position: Vector2 = Vector2(0, 0),
  ): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_APPLY_FORCE,
        NIL)
  }

  /**
   * Applies a rotational force to the body. The force does not affect position. A force is time dependent and meant to be applied every physics update.
   */
  public fun bodyApplyTorque(body: RID, torque: Float): Unit {
    TransferContext.writeArguments(_RID to body, DOUBLE to torque.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_APPLY_TORQUE,
        NIL)
  }

  /**
   * Adds a constant directional force to the body. The force does not affect rotation. The force remains applied over time until cleared with `PhysicsServer2D.body_set_constant_force(body, Vector2(0, 0))`.
   *
   * This is equivalent to using [bodyAddConstantForce] at the body's center of mass.
   */
  public fun bodyAddConstantCentralForce(body: RID, force: Vector2): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_ADD_CONSTANT_CENTRAL_FORCE, NIL)
  }

  /**
   * Adds a constant positioned force to the body. The force can affect rotation if [position] is different from the body's center of mass. The force remains applied over time until cleared with `PhysicsServer2D.body_set_constant_force(body, Vector2(0, 0))`.
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public fun bodyAddConstantForce(
    body: RID,
    force: Vector2,
    position: Vector2 = Vector2(0, 0),
  ): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_ADD_CONSTANT_FORCE, NIL)
  }

  /**
   * Adds a constant rotational force to the body. The force does not affect position. The force remains applied over time until cleared with `PhysicsServer2D.body_set_constant_torque(body, 0)`.
   */
  public fun bodyAddConstantTorque(body: RID, torque: Float): Unit {
    TransferContext.writeArguments(_RID to body, DOUBLE to torque.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_ADD_CONSTANT_TORQUE, NIL)
  }

  /**
   * Sets the body's total constant positional force applied during each physics update.
   *
   * See [bodyAddConstantForce] and [bodyAddConstantCentralForce].
   */
  public fun bodySetConstantForce(body: RID, force: Vector2): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_CONSTANT_FORCE, NIL)
  }

  /**
   * Returns the body's total constant positional force applied during each physics update.
   *
   * See [bodyAddConstantForce] and [bodyAddConstantCentralForce].
   */
  public fun bodyGetConstantForce(body: RID): Vector2 {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_CONSTANT_FORCE, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the body's total constant rotational force applied during each physics update.
   *
   * See [bodyAddConstantTorque].
   */
  public fun bodySetConstantTorque(body: RID, torque: Float): Unit {
    TransferContext.writeArguments(_RID to body, DOUBLE to torque.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_CONSTANT_TORQUE, NIL)
  }

  /**
   * Returns the body's total constant rotational force applied during each physics update.
   *
   * See [bodyAddConstantTorque].
   */
  public fun bodyGetConstantTorque(body: RID): Float {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_CONSTANT_TORQUE, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Modifies the body's linear velocity so that its projection to the axis `axis_velocity.normalized()` is exactly `axis_velocity.length()`. This is useful for jumping behavior.
   */
  public fun bodySetAxisVelocity(body: RID, axisVelocity: Vector2): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to axisVelocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_AXIS_VELOCITY, NIL)
  }

  /**
   * Adds [exceptedBody] to the body's list of collision exceptions, so that collisions with it are ignored.
   */
  public fun bodyAddCollisionException(body: RID, exceptedBody: RID): Unit {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_ADD_COLLISION_EXCEPTION, NIL)
  }

  /**
   * Removes [exceptedBody] from the body's list of collision exceptions, so that collisions with it are no longer ignored.
   */
  public fun bodyRemoveCollisionException(body: RID, exceptedBody: RID): Unit {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_REMOVE_COLLISION_EXCEPTION, NIL)
  }

  /**
   * Sets the maximum number of contacts that the body can report. If [amount] is greater than zero, then the body will keep track of at most this many contacts with other bodies.
   */
  public fun bodySetMaxContactsReported(body: RID, amount: Int): Unit {
    TransferContext.writeArguments(_RID to body, LONG to amount.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_MAX_CONTACTS_REPORTED, NIL)
  }

  /**
   * Returns the maximum number of contacts that the body can report. See [bodySetMaxContactsReported].
   */
  public fun bodyGetMaxContactsReported(body: RID): Int {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_MAX_CONTACTS_REPORTED, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets whether the body uses a callback function to calculate its own physics (see [bodySetForceIntegrationCallback]).
   */
  public fun bodySetOmitForceIntegration(body: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_OMIT_FORCE_INTEGRATION, NIL)
  }

  /**
   * Returns `true` if the body uses a callback function to calculate its own physics (see [bodySetForceIntegrationCallback]).
   */
  public fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_IS_OMITTING_FORCE_INTEGRATION, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the function used to calculate physics for the body, if that body allows it (see [bodySetOmitForceIntegration]).
   *
   * The force integration function takes the following two parameters:
   *
   * 1. a [godot.PhysicsDirectBodyState2D] `state`: used to retrieve and modify the body's state,
   *
   * 2. a [Variant] [userdata]: optional user data.
   *
   * **Note:** This callback is currently not called in Godot Physics.
   */
  @JvmOverloads
  public fun bodySetForceIntegrationCallback(
    body: RID,
    callable: Callable,
    userdata: Any? = null,
  ): Unit {
    TransferContext.writeArguments(_RID to body, CALLABLE to callable, ANY to userdata)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_FORCE_INTEGRATION_CALLBACK, NIL)
  }

  /**
   * Returns `true` if a collision would result from moving the body along a motion vector from a given point in space. See [godot.PhysicsTestMotionParameters2D] for the available motion parameters. Optionally a [godot.PhysicsTestMotionResult2D] object can be passed, which will be used to store the information about the resulting collision.
   */
  @JvmOverloads
  public fun bodyTestMotion(
    body: RID,
    parameters: PhysicsTestMotionParameters2D,
    result: PhysicsTestMotionResult2D? = null,
  ): Boolean {
    TransferContext.writeArguments(_RID to body, OBJECT to parameters, OBJECT to result)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_TEST_MOTION,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [godot.PhysicsDirectBodyState2D] of the body. Returns `null` if the body is destroyed or not assigned to a space.
   */
  public fun bodyGetDirectState(body: RID): PhysicsDirectBodyState2D? {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_DIRECT_STATE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectBodyState2D?)
  }

  /**
   * Creates a 2D joint in the physics server, and returns the [RID] that identifies it. To set the joint type, use [jointMakeDampedSpring], [jointMakeGroove] or [jointMakePin]. Use [jointSetParam] to set generic joint parameters.
   */
  public fun jointCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Destroys the joint with the given [RID], creates a new uninitialized joint, and makes the [RID] refer to this new joint.
   */
  public fun jointClear(joint: RID): Unit {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_CLEAR, NIL)
  }

  /**
   * Sets the value of the given joint parameter. See [enum JointParam] for the list of available parameters.
   */
  public fun jointSetParam(
    joint: RID,
    `param`: JointParam,
    `value`: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_SET_PARAM,
        NIL)
  }

  /**
   * Returns the value of the given joint parameter. See [enum JointParam] for the list of available parameters.
   */
  public fun jointGetParam(joint: RID, `param`: JointParam): Float {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_GET_PARAM,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets whether the bodies attached to the [godot.Joint2D] will collide with each other.
   */
  public fun jointDisableCollisionsBetweenBodies(joint: RID, disable: Boolean): Unit {
    TransferContext.writeArguments(_RID to joint, BOOL to disable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_DISABLE_COLLISIONS_BETWEEN_BODIES, NIL)
  }

  /**
   * Returns whether the bodies attached to the [godot.Joint2D] will collide with each other.
   */
  public fun jointIsDisabledCollisionsBetweenBodies(joint: RID): Boolean {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_IS_DISABLED_COLLISIONS_BETWEEN_BODIES, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Makes the joint a pin joint. If [bodyB] is `RID()`, then [bodyA] is pinned to the point [anchor] (given in global coordinates); otherwise, [bodyA] is pinned to [bodyB] at the point [anchor] (given in global coordinates). To set the parameters which are specific to the pin joint, see [pinJointSetParam].
   */
  @JvmOverloads
  public fun jointMakePin(
    joint: RID,
    anchor: Vector2,
    bodyA: RID,
    bodyB: RID = RID(),
  ): Unit {
    TransferContext.writeArguments(_RID to joint, VECTOR2 to anchor, _RID to bodyA, _RID to bodyB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_MAKE_PIN, NIL)
  }

  /**
   * Makes the joint a groove joint.
   */
  @JvmOverloads
  public fun jointMakeGroove(
    joint: RID,
    groove1A: Vector2,
    groove2A: Vector2,
    anchorB: Vector2,
    bodyA: RID = RID(),
    bodyB: RID = RID(),
  ): Unit {
    TransferContext.writeArguments(_RID to joint, VECTOR2 to groove1A, VECTOR2 to groove2A, VECTOR2 to anchorB, _RID to bodyA, _RID to bodyB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_MAKE_GROOVE,
        NIL)
  }

  /**
   * Makes the joint a damped spring joint, attached at the point [anchorA] (given in global coordinates) on the body [bodyA] and at the point [anchorB] (given in global coordinates) on the body [bodyB]. To set the parameters which are specific to the damped spring, see [dampedSpringJointSetParam].
   */
  @JvmOverloads
  public fun jointMakeDampedSpring(
    joint: RID,
    anchorA: Vector2,
    anchorB: Vector2,
    bodyA: RID,
    bodyB: RID = RID(),
  ): Unit {
    TransferContext.writeArguments(_RID to joint, VECTOR2 to anchorA, VECTOR2 to anchorB, _RID to bodyA, _RID to bodyB)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_MAKE_DAMPED_SPRING, NIL)
  }

  /**
   * Sets a pin joint parameter. See [enum PinJointParam] for a list of available parameters.
   */
  public fun pinJointSetParam(
    joint: RID,
    `param`: PinJointParam,
    `value`: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_PIN_JOINT_SET_PARAM,
        NIL)
  }

  /**
   * Returns the value of a pin joint parameter. See [enum PinJointParam] for a list of available parameters.
   */
  public fun pinJointGetParam(joint: RID, `param`: PinJointParam): Float {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_PIN_JOINT_GET_PARAM,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the value of the given damped spring joint parameter. See [enum DampedSpringParam] for the list of available parameters.
   */
  public fun dampedSpringJointSetParam(
    joint: RID,
    `param`: DampedSpringParam,
    `value`: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_DAMPED_SPRING_JOINT_SET_PARAM, NIL)
  }

  /**
   * Returns the value of the given damped spring joint parameter. See [enum DampedSpringParam] for the list of available parameters.
   */
  public fun dampedSpringJointGetParam(joint: RID, `param`: DampedSpringParam): Float {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_DAMPED_SPRING_JOINT_GET_PARAM, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the joint's type (see [enum JointType]).
   */
  public fun jointGetType(joint: RID): JointType {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_GET_TYPE,
        LONG)
    return PhysicsServer2D.JointType.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Destroys any of the objects created by PhysicsServer2D. If the [RID] passed is not one of the objects that can be created by PhysicsServer2D, an error will be printed to the console.
   */
  public fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_FREE_RID, NIL)
  }

  /**
   * Activates or deactivates the 2D physics server. If [active] is `false`, then the physics server will not do anything in its physics step.
   */
  public fun setActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SET_ACTIVE, NIL)
  }

  /**
   * Returns information about the current state of the 2D physics engine. See [enum ProcessInfo] for the list of available states.
   */
  public fun getProcessInfo(processInfo: ProcessInfo): Int {
    TransferContext.writeArguments(LONG to processInfo.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_GET_PROCESS_INFO,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class SpaceParameter(
    id: Long,
  ) {
    /**
     * Constant to set/get the maximum distance a pair of bodies has to move before their collision status has to be recalculated. The default value of this parameter is [godot.ProjectSettings.physics/2d/solver/contactRecycleRadius].
     */
    SPACE_PARAM_CONTACT_RECYCLE_RADIUS(0),
    /**
     * Constant to set/get the maximum distance a shape can be from another before they are considered separated and the contact is discarded. The default value of this parameter is [godot.ProjectSettings.physics/2d/solver/contactMaxSeparation].
     */
    SPACE_PARAM_CONTACT_MAX_SEPARATION(1),
    /**
     * Constant to set/get the maximum distance a shape can penetrate another shape before it is considered a collision. The default value of this parameter is [godot.ProjectSettings.physics/2d/solver/contactMaxAllowedPenetration].
     */
    SPACE_PARAM_CONTACT_MAX_ALLOWED_PENETRATION(2),
    /**
     * Constant to set/get the default solver bias for all physics contacts. A solver bias is a factor controlling how much two objects "rebound", after overlapping, to avoid leaving them in that state because of numerical imprecision. The default value of this parameter is [godot.ProjectSettings.physics/2d/solver/defaultContactBias].
     */
    SPACE_PARAM_CONTACT_DEFAULT_BIAS(3),
    /**
     * Constant to set/get the threshold linear velocity of activity. A body marked as potentially inactive for both linear and angular velocity will be put to sleep after the time given. The default value of this parameter is [godot.ProjectSettings.physics/2d/sleepThresholdLinear].
     */
    SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD(4),
    /**
     * Constant to set/get the threshold angular velocity of activity. A body marked as potentially inactive for both linear and angular velocity will be put to sleep after the time given. The default value of this parameter is [godot.ProjectSettings.physics/2d/sleepThresholdAngular].
     */
    SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD(5),
    /**
     * Constant to set/get the maximum time of activity. A body marked as potentially inactive for both linear and angular velocity will be put to sleep after this time. The default value of this parameter is [godot.ProjectSettings.physics/2d/timeBeforeSleep].
     */
    SPACE_PARAM_BODY_TIME_TO_SLEEP(6),
    /**
     * Constant to set/get the default solver bias for all physics constraints. A solver bias is a factor controlling how much two objects "rebound", after violating a constraint, to avoid leaving them in that state because of numerical imprecision. The default value of this parameter is [godot.ProjectSettings.physics/2d/solver/defaultConstraintBias].
     */
    SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS(7),
    /**
     * Constant to set/get the number of solver iterations for all contacts and constraints. The greater the number of iterations, the more accurate the collisions will be. However, a greater number of iterations requires more CPU power, which can decrease performance. The default value of this parameter is [godot.ProjectSettings.physics/2d/solver/solverIterations].
     */
    SPACE_PARAM_SOLVER_ITERATIONS(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ShapeType(
    id: Long,
  ) {
    /**
     * This is the constant for creating world boundary shapes. A world boundary shape is an *infinite* line with an origin point, and a normal. Thus, it can be used for front/behind checks.
     */
    SHAPE_WORLD_BOUNDARY(0),
    /**
     * This is the constant for creating separation ray shapes. A separation ray is defined by a length and separates itself from what is touching its far endpoint. Useful for character controllers.
     */
    SHAPE_SEPARATION_RAY(1),
    /**
     * This is the constant for creating segment shapes. A segment shape is a *finite* line from a point A to a point B. It can be checked for intersections.
     */
    SHAPE_SEGMENT(2),
    /**
     * This is the constant for creating circle shapes. A circle shape only has a radius. It can be used for intersections and inside/outside checks.
     */
    SHAPE_CIRCLE(3),
    /**
     * This is the constant for creating rectangle shapes. A rectangle shape is defined by a width and a height. It can be used for intersections and inside/outside checks.
     */
    SHAPE_RECTANGLE(4),
    /**
     * This is the constant for creating capsule shapes. A capsule shape is defined by a radius and a length. It can be used for intersections and inside/outside checks.
     */
    SHAPE_CAPSULE(5),
    /**
     * This is the constant for creating convex polygon shapes. A polygon is defined by a list of points. It can be used for intersections and inside/outside checks.
     */
    SHAPE_CONVEX_POLYGON(6),
    /**
     * This is the constant for creating concave polygon shapes. A polygon is defined by a list of points. It can be used for intersections checks, but not for inside/outside checks.
     */
    SHAPE_CONCAVE_POLYGON(7),
    /**
     * This constant is used internally by the engine. Any attempt to create this kind of shape results in an error.
     */
    SHAPE_CUSTOM(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class AreaParameter(
    id: Long,
  ) {
    /**
     * Constant to set/get gravity override mode in an area. See [enum AreaSpaceOverrideMode] for possible values. The default value of this parameter is [AREA_SPACE_OVERRIDE_DISABLED].
     */
    AREA_PARAM_GRAVITY_OVERRIDE_MODE(0),
    /**
     * Constant to set/get gravity strength in an area. The default value of this parameter is `9.80665`.
     */
    AREA_PARAM_GRAVITY(1),
    /**
     * Constant to set/get gravity vector/center in an area. The default value of this parameter is `Vector2(0, -1)`.
     */
    AREA_PARAM_GRAVITY_VECTOR(2),
    /**
     * Constant to set/get whether the gravity vector of an area is a direction, or a center point. The default value of this parameter is `false`.
     */
    AREA_PARAM_GRAVITY_IS_POINT(3),
    /**
     * Constant to set/get the distance at which the gravity strength is equal to the gravity controlled by [AREA_PARAM_GRAVITY]. For example, on a planet 100 pixels in radius with a surface gravity of 4.0 px/s², set the gravity to 4.0 and the unit distance to 100.0. The gravity will have falloff according to the inverse square law, so in the example, at 200 pixels from the center the gravity will be 1.0 px/s² (twice the distance, 1/4th the gravity), at 50 pixels it will be 16.0 px/s² (half the distance, 4x the gravity), and so on.
     *
     * The above is true only when the unit distance is a positive number. When the unit distance is set to 0.0, the gravity will be constant regardless of distance. The default value of this parameter is `0.0`.
     */
    AREA_PARAM_GRAVITY_POINT_UNIT_DISTANCE(4),
    /**
     * Constant to set/get linear damping override mode in an area. See [enum AreaSpaceOverrideMode] for possible values. The default value of this parameter is [AREA_SPACE_OVERRIDE_DISABLED].
     */
    AREA_PARAM_LINEAR_DAMP_OVERRIDE_MODE(5),
    /**
     * Constant to set/get the linear damping factor of an area. The default value of this parameter is `0.1`.
     */
    AREA_PARAM_LINEAR_DAMP(6),
    /**
     * Constant to set/get angular damping override mode in an area. See [enum AreaSpaceOverrideMode] for possible values. The default value of this parameter is [AREA_SPACE_OVERRIDE_DISABLED].
     */
    AREA_PARAM_ANGULAR_DAMP_OVERRIDE_MODE(7),
    /**
     * Constant to set/get the angular damping factor of an area. The default value of this parameter is `1.0`.
     */
    AREA_PARAM_ANGULAR_DAMP(8),
    /**
     * Constant to set/get the priority (order of processing) of an area. The default value of this parameter is `0`.
     */
    AREA_PARAM_PRIORITY(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class AreaSpaceOverrideMode(
    id: Long,
  ) {
    /**
     * This area does not affect gravity/damp. These are generally areas that exist only to detect collisions, and objects entering or exiting them.
     */
    AREA_SPACE_OVERRIDE_DISABLED(0),
    /**
     * This area adds its gravity/damp values to whatever has been calculated so far. This way, many overlapping areas can combine their physics to make interesting effects.
     */
    AREA_SPACE_OVERRIDE_COMBINE(1),
    /**
     * This area adds its gravity/damp values to whatever has been calculated so far. Then stops taking into account the rest of the areas, even the default one.
     */
    AREA_SPACE_OVERRIDE_COMBINE_REPLACE(2),
    /**
     * This area replaces any gravity/damp, even the default one, and stops taking into account the rest of the areas.
     */
    AREA_SPACE_OVERRIDE_REPLACE(3),
    /**
     * This area replaces any gravity/damp calculated so far, but keeps calculating the rest of the areas, down to the default one.
     */
    AREA_SPACE_OVERRIDE_REPLACE_COMBINE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BodyMode(
    id: Long,
  ) {
    /**
     * Constant for static bodies. In this mode, a body can be only moved by user code and doesn't collide with other bodies along its path when moved.
     */
    BODY_MODE_STATIC(0),
    /**
     * Constant for kinematic bodies. In this mode, a body can be only moved by user code and collides with other bodies along its path.
     */
    BODY_MODE_KINEMATIC(1),
    /**
     * Constant for rigid bodies. In this mode, a body can be pushed by other bodies and has forces applied.
     */
    BODY_MODE_RIGID(2),
    /**
     * Constant for linear rigid bodies. In this mode, a body can not rotate, and only its linear velocity is affected by external forces.
     */
    BODY_MODE_RIGID_LINEAR(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BodyParameter(
    id: Long,
  ) {
    /**
     * Constant to set/get a body's bounce factor. The default value of this parameter is `0.0`.
     */
    BODY_PARAM_BOUNCE(0),
    /**
     * Constant to set/get a body's friction. The default value of this parameter is `1.0`.
     */
    BODY_PARAM_FRICTION(1),
    /**
     * Constant to set/get a body's mass. The default value of this parameter is `1.0`. If the body's mode is set to [BODY_MODE_RIGID], then setting this parameter will have the following additional effects:
     *
     * - If the parameter [BODY_PARAM_CENTER_OF_MASS] has never been set explicitly, then the value of that parameter will be recalculated based on the body's shapes.
     *
     * - If the parameter [BODY_PARAM_INERTIA] is set to a value `<= 0.0`, then the value of that parameter will be recalculated based on the body's shapes, mass, and center of mass.
     */
    BODY_PARAM_MASS(2),
    /**
     * Constant to set/get a body's inertia. The default value of this parameter is `0.0`. If the body's inertia is set to a value `<= 0.0`, then the inertia will be recalculated based on the body's shapes, mass, and center of mass.
     */
    BODY_PARAM_INERTIA(3),
    /**
     * Constant to set/get a body's center of mass position in the body's local coordinate system. The default value of this parameter is `Vector2(0,0)`. If this parameter is never set explicitly, then it is recalculated based on the body's shapes when setting the parameter [BODY_PARAM_MASS] or when calling [bodySetSpace].
     */
    BODY_PARAM_CENTER_OF_MASS(4),
    /**
     * Constant to set/get a body's gravity multiplier. The default value of this parameter is `1.0`.
     */
    BODY_PARAM_GRAVITY_SCALE(5),
    /**
     * Constant to set/get a body's linear damping mode. See [enum BodyDampMode] for possible values. The default value of this parameter is [BODY_DAMP_MODE_COMBINE].
     */
    BODY_PARAM_LINEAR_DAMP_MODE(6),
    /**
     * Constant to set/get a body's angular damping mode. See [enum BodyDampMode] for possible values. The default value of this parameter is [BODY_DAMP_MODE_COMBINE].
     */
    BODY_PARAM_ANGULAR_DAMP_MODE(7),
    /**
     * Constant to set/get a body's linear damping factor. The default value of this parameter is `0.0`.
     */
    BODY_PARAM_LINEAR_DAMP(8),
    /**
     * Constant to set/get a body's angular damping factor. The default value of this parameter is `0.0`.
     */
    BODY_PARAM_ANGULAR_DAMP(9),
    /**
     * Represents the size of the [enum BodyParameter] enum.
     */
    BODY_PARAM_MAX(10),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BodyDampMode(
    id: Long,
  ) {
    /**
     * The body's damping value is added to any value set in areas or the default value.
     */
    BODY_DAMP_MODE_COMBINE(0),
    /**
     * The body's damping value replaces any value set in areas or the default value.
     */
    BODY_DAMP_MODE_REPLACE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BodyState(
    id: Long,
  ) {
    /**
     * Constant to set/get the current transform matrix of the body.
     */
    BODY_STATE_TRANSFORM(0),
    /**
     * Constant to set/get the current linear velocity of the body.
     */
    BODY_STATE_LINEAR_VELOCITY(1),
    /**
     * Constant to set/get the current angular velocity of the body.
     */
    BODY_STATE_ANGULAR_VELOCITY(2),
    /**
     * Constant to sleep/wake up a body, or to get whether it is sleeping.
     */
    BODY_STATE_SLEEPING(3),
    /**
     * Constant to set/get whether the body can sleep.
     */
    BODY_STATE_CAN_SLEEP(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class JointType(
    id: Long,
  ) {
    /**
     * Constant to create pin joints.
     */
    JOINT_TYPE_PIN(0),
    /**
     * Constant to create groove joints.
     */
    JOINT_TYPE_GROOVE(1),
    /**
     * Constant to create damped spring joints.
     */
    JOINT_TYPE_DAMPED_SPRING(2),
    /**
     * Represents the size of the [enum JointType] enum.
     */
    JOINT_TYPE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class JointParam(
    id: Long,
  ) {
    /**
     * Constant to set/get how fast the joint pulls the bodies back to satisfy the joint constraint. The lower the value, the more the two bodies can pull on the joint. The default value of this parameter is `0.0`.
     *
     * **Note:** In Godot Physics, this parameter is only used for pin joints and groove joints.
     */
    JOINT_PARAM_BIAS(0),
    /**
     * Constant to set/get the maximum speed with which the joint can apply corrections. The default value of this parameter is `3.40282e+38`.
     *
     * **Note:** In Godot Physics, this parameter is only used for groove joints.
     */
    JOINT_PARAM_MAX_BIAS(1),
    /**
     * Constant to set/get the maximum force that the joint can use to act on the two bodies. The default value of this parameter is `3.40282e+38`.
     *
     * **Note:** In Godot Physics, this parameter is only used for groove joints.
     */
    JOINT_PARAM_MAX_FORCE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class PinJointParam(
    id: Long,
  ) {
    /**
     * Constant to set/get a how much the bond of the pin joint can flex. The default value of this parameter is `0.0`.
     */
    PIN_JOINT_SOFTNESS(0),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DampedSpringParam(
    id: Long,
  ) {
    /**
     * Sets the resting length of the spring joint. The joint will always try to go to back this length when pulled apart. The default value of this parameter is the distance between the joint's anchor points.
     */
    DAMPED_SPRING_REST_LENGTH(0),
    /**
     * Sets the stiffness of the spring joint. The joint applies a force equal to the stiffness times the distance from its resting length. The default value of this parameter is `20.0`.
     */
    DAMPED_SPRING_STIFFNESS(1),
    /**
     * Sets the damping ratio of the spring joint. A value of 0 indicates an undamped spring, while 1 causes the system to reach equilibrium as fast as possible (critical damping). The default value of this parameter is `1.5`.
     */
    DAMPED_SPRING_DAMPING(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CCDMode(
    id: Long,
  ) {
    /**
     * Disables continuous collision detection. This is the fastest way to detect body collisions, but it can miss small and/or fast-moving objects.
     */
    CCD_MODE_DISABLED(0),
    /**
     * Enables continuous collision detection by raycasting. It is faster than shapecasting, but less precise.
     */
    CCD_MODE_CAST_RAY(1),
    /**
     * Enables continuous collision detection by shapecasting. It is the slowest CCD method, and the most precise.
     */
    CCD_MODE_CAST_SHAPE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class AreaBodyStatus(
    id: Long,
  ) {
    /**
     * The value of the first parameter and area callback function receives, when an object enters one of its shapes.
     */
    AREA_BODY_ADDED(0),
    /**
     * The value of the first parameter and area callback function receives, when an object exits one of its shapes.
     */
    AREA_BODY_REMOVED(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ProcessInfo(
    id: Long,
  ) {
    /**
     * Constant to get the number of objects that are not sleeping.
     */
    INFO_ACTIVE_OBJECTS(0),
    /**
     * Constant to get the number of possible collisions.
     */
    INFO_COLLISION_PAIRS(1),
    /**
     * Constant to get the number of space regions where a collision could occur.
     */
    INFO_ISLAND_COUNT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}
