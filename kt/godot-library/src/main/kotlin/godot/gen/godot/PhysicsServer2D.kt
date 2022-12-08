// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.PhysicsServer2D
import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Server interface for low-level 2D physics access.
 *
 * PhysicsServer2D is the server responsible for all 2D physics. It can create many kinds of physics objects, but does not insert them on the node tree.
 */
@GodotBaseType
public object PhysicsServer2D : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_PHYSICSSERVER2D)
    return false
  }

  /**
   *
   */
  public fun worldBoundaryShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_WORLD_BOUNDARY_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun separationRayShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SEPARATION_RAY_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun segmentShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SEGMENT_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun circleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_CIRCLE_SHAPE_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun rectangleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_RECTANGLE_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun capsuleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_CAPSULE_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun convexPolygonShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_CONVEX_POLYGON_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun concavePolygonShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_CONCAVE_POLYGON_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the shape data that defines its shape and size. The data to be passed depends on the kind of shape created [shapeGetType].
   */
  public fun shapeSetData(shape: RID, `data`: Any): Unit {
    TransferContext.writeArguments(_RID to shape, ANY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SHAPE_SET_DATA, NIL)
  }

  /**
   * Returns a shape's type (see [enum ShapeType]).
   */
  public fun shapeGetType(shape: RID): PhysicsServer2D.ShapeType {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SHAPE_GET_TYPE,
        LONG)
    return PhysicsServer2D.ShapeType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the shape data.
   */
  public fun shapeGetData(shape: RID): Any? {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SHAPE_GET_DATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Creates a space. A space is a collection of parameters for the physics engine that can be assigned to an area or a body. It can be assigned to an area with [areaSetSpace], or to a body with [bodySetSpace].
   */
  public fun spaceCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SPACE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Marks a space as active. It will not have an effect, unless it is assigned to an area or body.
   */
  public fun spaceSetActive(space: RID, active: Boolean): Unit {
    TransferContext.writeArguments(_RID to space, BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SPACE_SET_ACTIVE,
        NIL)
  }

  /**
   * Returns whether the space is active.
   */
  public fun spaceIsActive(space: RID): Boolean {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SPACE_IS_ACTIVE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the value for a space parameter. See [enum SpaceParameter] for a list of available parameters.
   */
  public fun spaceSetParam(
    space: RID,
    `param`: PhysicsServer2D.SpaceParameter,
    `value`: Double
  ): Unit {
    TransferContext.writeArguments(_RID to space, LONG to param.id, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SPACE_SET_PARAM,
        NIL)
  }

  /**
   * Returns the value of a space parameter.
   */
  public fun spaceGetParam(space: RID, `param`: PhysicsServer2D.SpaceParameter): Double {
    TransferContext.writeArguments(_RID to space, LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SPACE_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the state of a space, a [godot.PhysicsDirectSpaceState2D]. This object can be used to make collision/intersection queries.
   */
  public fun spaceGetDirectState(space: RID): PhysicsDirectSpaceState2D? {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SPACE_GET_DIRECT_STATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState2D?
  }

  /**
   * Creates an [godot.Area2D]. After creating an [godot.Area2D] with this method, assign it to a space using [areaSetSpace] to use the created [godot.Area2D] in the physics world.
   */
  public fun areaCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Assigns a space to the area.
   */
  public fun areaSetSpace(area: RID, space: RID): Unit {
    TransferContext.writeArguments(_RID to area, _RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_SPACE, NIL)
  }

  /**
   * Returns the space assigned to the area.
   */
  public fun areaGetSpace(area: RID): RID {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_SPACE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Adds a shape to the area, along with a transform matrix. Shapes are usually referenced by their index, so you should track which shape has a given index.
   */
  public fun areaAddShape(
    area: RID,
    shape: RID,
    transform: Transform2D = Transform2D(),
    disabled: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to area, _RID to shape, TRANSFORM2D to transform, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_ADD_SHAPE, NIL)
  }

  /**
   * Substitutes a given area shape by another. The old shape is selected by its index, the new one by its [RID].
   */
  public fun areaSetShape(
    area: RID,
    shapeIdx: Long,
    shape: RID
  ): Unit {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx, _RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_SHAPE, NIL)
  }

  /**
   * Sets the transform matrix for an area shape.
   */
  public fun areaSetShapeTransform(
    area: RID,
    shapeIdx: Long,
    transform: Transform2D
  ): Unit {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_SHAPE_TRANSFORM, NIL)
  }

  /**
   * Disables a given shape in an area.
   */
  public fun areaSetShapeDisabled(
    area: RID,
    shapeIdx: Long,
    disabled: Boolean
  ): Unit {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_SHAPE_DISABLED, NIL)
  }

  /**
   * Returns the number of shapes assigned to an area.
   */
  public fun areaGetShapeCount(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [RID] of the nth shape of an area.
   */
  public fun areaGetShape(area: RID, shapeIdx: Long): RID {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_SHAPE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the transform matrix of a shape within an area.
   */
  public fun areaGetShapeTransform(area: RID, shapeIdx: Long): Transform2D {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_SHAPE_TRANSFORM, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Removes a shape from an area. It does not delete the shape, so it can be reassigned later.
   */
  public fun areaRemoveShape(area: RID, shapeIdx: Long): Unit {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_REMOVE_SHAPE,
        NIL)
  }

  /**
   * Removes all shapes from an area. It does not delete the shapes, so they can be reassigned later.
   */
  public fun areaClearShapes(area: RID): Unit {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_CLEAR_SHAPES,
        NIL)
  }

  /**
   * Assigns the area to one or many physics layers.
   */
  public fun areaSetCollisionLayer(area: RID, layer: Long): Unit {
    TransferContext.writeArguments(_RID to area, LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_COLLISION_LAYER, NIL)
  }

  /**
   * Sets which physics layers the area will monitor.
   */
  public fun areaSetCollisionMask(area: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to area, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_COLLISION_MASK, NIL)
  }

  /**
   * Sets the value for an area parameter. See [enum AreaParameter] for a list of available parameters.
   */
  public fun areaSetParam(
    area: RID,
    `param`: PhysicsServer2D.AreaParameter,
    `value`: Any
  ): Unit {
    TransferContext.writeArguments(_RID to area, LONG to param.id, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_PARAM, NIL)
  }

  /**
   * Sets the transform matrix for an area.
   */
  public fun areaSetTransform(area: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to area, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_TRANSFORM,
        NIL)
  }

  /**
   * Returns an area parameter value. See [enum AreaParameter] for a list of available parameters.
   */
  public fun areaGetParam(area: RID, `param`: PhysicsServer2D.AreaParameter): Any? {
    TransferContext.writeArguments(_RID to area, LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_PARAM, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the transform matrix for an area.
   */
  public fun areaGetTransform(area: RID): Transform2D {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Assigns the area to a descendant of [godot.Object], so it can exist in the node tree.
   */
  public fun areaAttachObjectInstanceId(area: RID, id: Long): Unit {
    TransferContext.writeArguments(_RID to area, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  /**
   * Gets the instance ID of the object the area is assigned to.
   */
  public fun areaGetObjectInstanceId(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_OBJECT_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun areaAttachCanvasInstanceId(area: RID, id: Long): Unit {
    TransferContext.writeArguments(_RID to area, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_ATTACH_CANVAS_INSTANCE_ID, NIL)
  }

  /**
   *
   */
  public fun areaGetCanvasInstanceId(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_GET_CANVAS_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the function to call when any body/area enters or exits the area. This callback will be called for any object interacting with the area, and takes five parameters:
   *
   * 1: [AREA_BODY_ADDED] or [AREA_BODY_REMOVED], depending on whether the object entered or exited the area.
   *
   * 2: [RID] of the object that entered/exited the area.
   *
   * 3: Instance ID of the object that entered/exited the area.
   *
   * 4: The shape index of the object that entered/exited the area.
   *
   * 5: The shape index of the area where the object entered/exited.
   */
  public fun areaSetMonitorCallback(area: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to area, CALLABLE to callback)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_MONITOR_CALLBACK, NIL)
  }

  /**
   *
   */
  public fun areaSetAreaMonitorCallback(area: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to area, CALLABLE to callback)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_AREA_MONITOR_CALLBACK, NIL)
  }

  /**
   *
   */
  public fun areaSetMonitorable(area: RID, monitorable: Boolean): Unit {
    TransferContext.writeArguments(_RID to area, BOOL to monitorable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_AREA_SET_MONITORABLE, NIL)
  }

  /**
   * Creates a physics body.
   */
  public fun bodyCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Assigns a space to the body (see [spaceCreate]).
   */
  public fun bodySetSpace(body: RID, space: RID): Unit {
    TransferContext.writeArguments(_RID to body, _RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_SPACE, NIL)
  }

  /**
   * Returns the [RID] of the space assigned to a body.
   */
  public fun bodyGetSpace(body: RID): RID {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_SPACE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the body mode using one of the [enum BodyMode] constants.
   */
  public fun bodySetMode(body: RID, mode: PhysicsServer2D.BodyMode): Unit {
    TransferContext.writeArguments(_RID to body, LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_MODE, NIL)
  }

  /**
   * Returns the body mode.
   */
  public fun bodyGetMode(body: RID): PhysicsServer2D.BodyMode {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_MODE, LONG)
    return PhysicsServer2D.BodyMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Adds a shape to the body, along with a transform matrix. Shapes are usually referenced by their index, so you should track which shape has a given index.
   */
  public fun bodyAddShape(
    body: RID,
    shape: RID,
    transform: Transform2D = Transform2D(),
    disabled: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to body, _RID to shape, TRANSFORM2D to transform, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_ADD_SHAPE, NIL)
  }

  /**
   * Substitutes a given body shape by another. The old shape is selected by its index, the new one by its [RID].
   */
  public fun bodySetShape(
    body: RID,
    shapeIdx: Long,
    shape: RID
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, _RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_SHAPE, NIL)
  }

  /**
   * Sets the transform matrix for a body shape.
   */
  public fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Long,
    transform: Transform2D
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_SHAPE_TRANSFORM, NIL)
  }

  /**
   * Returns the number of shapes assigned to a body.
   */
  public fun bodyGetShapeCount(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [RID] of the nth shape of a body.
   */
  public fun bodyGetShape(body: RID, shapeIdx: Long): RID {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_SHAPE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the transform matrix of a body shape.
   */
  public fun bodyGetShapeTransform(body: RID, shapeIdx: Long): Transform2D {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_SHAPE_TRANSFORM, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Removes a shape from a body. The shape is not deleted, so it can be reused afterwards.
   */
  public fun bodyRemoveShape(body: RID, shapeIdx: Long): Unit {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_REMOVE_SHAPE,
        NIL)
  }

  /**
   * Removes all shapes from a body.
   */
  public fun bodyClearShapes(body: RID): Unit {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_CLEAR_SHAPES,
        NIL)
  }

  /**
   * Disables shape in body if [disabled] is `true`.
   */
  public fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Long,
    disabled: Boolean
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_SHAPE_DISABLED, NIL)
  }

  /**
   * Enables one way collision on body if [enable] is `true`.
   */
  public fun bodySetShapeAsOneWayCollision(
    body: RID,
    shapeIdx: Long,
    enable: Boolean,
    margin: Double
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, BOOL to enable, DOUBLE to margin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_SHAPE_AS_ONE_WAY_COLLISION, NIL)
  }

  /**
   * Assigns the area to a descendant of [godot.Object], so it can exist in the node tree.
   */
  public fun bodyAttachObjectInstanceId(body: RID, id: Long): Unit {
    TransferContext.writeArguments(_RID to body, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  /**
   * Gets the instance ID of the object the area is assigned to.
   */
  public fun bodyGetObjectInstanceId(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_OBJECT_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun bodyAttachCanvasInstanceId(body: RID, id: Long): Unit {
    TransferContext.writeArguments(_RID to body, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_ATTACH_CANVAS_INSTANCE_ID, NIL)
  }

  /**
   *
   */
  public fun bodyGetCanvasInstanceId(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_CANVAS_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the continuous collision detection mode using one of the [enum CCDMode] constants.
   *
   * Continuous collision detection tries to predict where a moving body will collide, instead of moving it and correcting its movement if it collided.
   */
  public fun bodySetContinuousCollisionDetectionMode(body: RID, mode: PhysicsServer2D.CCDMode):
      Unit {
    TransferContext.writeArguments(_RID to body, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_CONTINUOUS_COLLISION_DETECTION_MODE, NIL)
  }

  /**
   * Returns the continuous collision detection mode.
   */
  public fun bodyGetContinuousCollisionDetectionMode(body: RID): PhysicsServer2D.CCDMode {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_CONTINUOUS_COLLISION_DETECTION_MODE, LONG)
    return PhysicsServer2D.CCDMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the physics layer or layers a body belongs to.
   */
  public fun bodySetCollisionLayer(body: RID, layer: Long): Unit {
    TransferContext.writeArguments(_RID to body, LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_COLLISION_LAYER, NIL)
  }

  /**
   * Returns the physics layer or layers a body belongs to.
   */
  public fun bodyGetCollisionLayer(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_COLLISION_LAYER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the physics layer or layers a body can collide with.
   */
  public fun bodySetCollisionMask(body: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to body, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_COLLISION_MASK, NIL)
  }

  /**
   * Returns the physics layer or layers a body can collide with.
   */
  public fun bodyGetCollisionMask(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_COLLISION_MASK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets a body parameter. See [enum BodyParameter] for a list of available parameters.
   */
  public fun bodySetParam(
    body: RID,
    `param`: PhysicsServer2D.BodyParameter,
    `value`: Any
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to param.id, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_PARAM, NIL)
  }

  /**
   * Returns the value of a body parameter. See [enum BodyParameter] for a list of available parameters.
   */
  public fun bodyGetParam(body: RID, `param`: PhysicsServer2D.BodyParameter): Any? {
    TransferContext.writeArguments(_RID to body, LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_PARAM, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Restores the default inertia and center of mass based on shapes to cancel any custom values previously set using [bodySetParam].
   */
  public fun bodyResetMassProperties(body: RID): Unit {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_RESET_MASS_PROPERTIES, NIL)
  }

  /**
   * Sets a body state using one of the [enum BodyState] constants.
   *
   * Note that the method doesn't take effect immediately. The state will change on the next physics frame.
   */
  public fun bodySetState(
    body: RID,
    state: PhysicsServer2D.BodyState,
    `value`: Any
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to state.id, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_STATE, NIL)
  }

  /**
   * Returns a body state.
   */
  public fun bodyGetState(body: RID, state: PhysicsServer2D.BodyState): Any? {
    TransferContext.writeArguments(_RID to body, LONG to state.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_STATE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Applies a directional impulse without affecting rotation.
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
   * Applies a rotational impulse to the body without affecting the position.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   */
  public fun bodyApplyTorqueImpulse(body: RID, impulse: Double): Unit {
    TransferContext.writeArguments(_RID to body, DOUBLE to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_APPLY_TORQUE_IMPULSE, NIL)
  }

  /**
   * Applies a positioned impulse to the body.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a framerate-dependent force. For this reason, it should only be used when simulating one-time impacts (use the "_force" functions otherwise).
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  public fun bodyApplyImpulse(
    body: RID,
    impulse: Vector2,
    position: Vector2 = Vector2(0, 0)
  ): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to impulse, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_APPLY_IMPULSE,
        NIL)
  }

  /**
   * Applies a directional force without affecting rotation. A force is time dependent and meant to be applied every physics update.
   *
   * This is equivalent to using [bodyApplyForce] at the body's center of mass.
   */
  public fun bodyApplyCentralForce(body: RID, force: Vector2): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_APPLY_CENTRAL_FORCE, NIL)
  }

  /**
   * Applies a positioned force to the body. A force is time dependent and meant to be applied every physics update.
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  public fun bodyApplyForce(
    body: RID,
    force: Vector2,
    position: Vector2 = Vector2(0, 0)
  ): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_APPLY_FORCE,
        NIL)
  }

  /**
   * Applies a rotational force without affecting position. A force is time dependent and meant to be applied every physics update.
   */
  public fun bodyApplyTorque(body: RID, torque: Double): Unit {
    TransferContext.writeArguments(_RID to body, DOUBLE to torque)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_APPLY_TORQUE,
        NIL)
  }

  /**
   * Adds a constant directional force without affecting rotation that keeps being applied over time until cleared with `body_set_constant_force(body, Vector2(0, 0))`.
   *
   * This is equivalent to using [bodyAddConstantForce] at the body's center of mass.
   */
  public fun bodyAddConstantCentralForce(body: RID, force: Vector2): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_ADD_CONSTANT_CENTRAL_FORCE, NIL)
  }

  /**
   * Adds a constant positioned force to the body that keeps being applied over time until cleared with `body_set_constant_force(body, Vector2(0, 0))`.
   *
   * [position] is the offset from the body origin in global coordinates.
   */
  public fun bodyAddConstantForce(
    body: RID,
    force: Vector2,
    position: Vector2 = Vector2(0, 0)
  ): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_ADD_CONSTANT_FORCE, NIL)
  }

  /**
   * Adds a constant rotational force without affecting position that keeps being applied over time until cleared with `body_set_constant_torque(body, 0)`.
   */
  public fun bodyAddConstantTorque(body: RID, torque: Double): Unit {
    TransferContext.writeArguments(_RID to body, DOUBLE to torque)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_ADD_CONSTANT_TORQUE, NIL)
  }

  /**
   * Sets the body's total constant positional forces applied during each physics update.
   *
   * See [bodyAddConstantForce] and [bodyAddConstantCentralForce].
   */
  public fun bodySetConstantForce(body: RID, force: Vector2): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_CONSTANT_FORCE, NIL)
  }

  /**
   * Returns the body's total constant positional forces applied during each physics update.
   *
   * See [bodyAddConstantForce] and [bodyAddConstantCentralForce].
   */
  public fun bodyGetConstantForce(body: RID): Vector2 {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_CONSTANT_FORCE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Sets the body's total constant rotational forces applied during each physics update.
   *
   * See [bodyAddConstantTorque].
   */
  public fun bodySetConstantTorque(body: RID, torque: Double): Unit {
    TransferContext.writeArguments(_RID to body, DOUBLE to torque)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_CONSTANT_TORQUE, NIL)
  }

  /**
   * Returns the body's total constant rotational forces applied during each physics update.
   *
   * See [bodyAddConstantTorque].
   */
  public fun bodyGetConstantTorque(body: RID): Double {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_CONSTANT_TORQUE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets an axis velocity. The velocity in the given vector axis will be set as the given vector length. This is useful for jumping behavior.
   */
  public fun bodySetAxisVelocity(body: RID, axisVelocity: Vector2): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR2 to axisVelocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_AXIS_VELOCITY, NIL)
  }

  /**
   * Adds a body to the list of bodies exempt from collisions.
   */
  public fun bodyAddCollisionException(body: RID, exceptedBody: RID): Unit {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_ADD_COLLISION_EXCEPTION, NIL)
  }

  /**
   * Removes a body from the list of bodies exempt from collisions.
   */
  public fun bodyRemoveCollisionException(body: RID, exceptedBody: RID): Unit {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_REMOVE_COLLISION_EXCEPTION, NIL)
  }

  /**
   * Sets the maximum contacts to report. Bodies can keep a log of the contacts with other bodies. This is enabled by setting the maximum number of contacts reported to a number greater than 0.
   */
  public fun bodySetMaxContactsReported(body: RID, amount: Long): Unit {
    TransferContext.writeArguments(_RID to body, LONG to amount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_MAX_CONTACTS_REPORTED, NIL)
  }

  /**
   * Returns the maximum contacts that can be reported. See [bodySetMaxContactsReported].
   */
  public fun bodyGetMaxContactsReported(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_MAX_CONTACTS_REPORTED, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets whether a body uses a callback function to calculate its own physics (see [bodySetForceIntegrationCallback]).
   */
  public fun bodySetOmitForceIntegration(body: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_OMIT_FORCE_INTEGRATION, NIL)
  }

  /**
   * Returns whether a body uses a callback function to calculate its own physics (see [bodySetForceIntegrationCallback]).
   */
  public fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_IS_OMITTING_FORCE_INTEGRATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the function used to calculate physics for an object, if that object allows it (see [bodySetOmitForceIntegration]).
   *
   * The force integration function takes 2 arguments:
   *
   * `state:` [godot.PhysicsDirectBodyState2D] used to retrieve and modify the body's state.
   *
   * `userdata:` Optional user data, if it was passed when calling `body_set_force_integration_callback`.
   */
  public fun bodySetForceIntegrationCallback(
    body: RID,
    callable: Callable,
    userdata: Any? = null
  ): Unit {
    TransferContext.writeArguments(_RID to body, CALLABLE to callable, ANY to userdata)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_SET_FORCE_INTEGRATION_CALLBACK, NIL)
  }

  /**
   * Returns `true` if a collision would result from moving along a motion vector from a given point in space. [godot.PhysicsTestMotionParameters2D] is passed to set motion parameters. [godot.PhysicsTestMotionResult2D] can be passed to return additional information.
   */
  public fun bodyTestMotion(
    body: RID,
    parameters: PhysicsTestMotionParameters2D,
    result: PhysicsTestMotionResult2D? = null
  ): Boolean {
    TransferContext.writeArguments(_RID to body, OBJECT to parameters, OBJECT to result)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_TEST_MOTION,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the [godot.PhysicsDirectBodyState2D] of the body. Returns `null` if the body is destroyed or removed from the physics space.
   */
  public fun bodyGetDirectState(body: RID): PhysicsDirectBodyState2D? {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_BODY_GET_DIRECT_STATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectBodyState2D?
  }

  /**
   *
   */
  public fun jointCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun jointClear(joint: RID): Unit {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_CLEAR, NIL)
  }

  /**
   * Sets a joint parameter. See [enum JointParam] for a list of available parameters.
   */
  public fun jointSetParam(
    joint: RID,
    `param`: PhysicsServer2D.JointParam,
    `value`: Double
  ): Unit {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_SET_PARAM,
        NIL)
  }

  /**
   * Returns the value of a joint parameter.
   */
  public fun jointGetParam(joint: RID, `param`: PhysicsServer2D.JointParam): Double {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   *
   */
  public fun jointMakePin(
    joint: RID,
    anchor: Vector2,
    bodyA: RID,
    bodyB: RID = RID()
  ): Unit {
    TransferContext.writeArguments(_RID to joint, VECTOR2 to anchor, _RID to bodyA, _RID to bodyB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_MAKE_PIN, NIL)
  }

  /**
   *
   */
  public fun jointMakeGroove(
    joint: RID,
    groove1A: Vector2,
    groove2A: Vector2,
    anchorB: Vector2,
    bodyA: RID = RID(),
    bodyB: RID = RID()
  ): Unit {
    TransferContext.writeArguments(_RID to joint, VECTOR2 to groove1A, VECTOR2 to groove2A, VECTOR2 to anchorB, _RID to bodyA, _RID to bodyB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_MAKE_GROOVE,
        NIL)
  }

  /**
   *
   */
  public fun jointMakeDampedSpring(
    joint: RID,
    anchorA: Vector2,
    anchorB: Vector2,
    bodyA: RID,
    bodyB: RID = RID()
  ): Unit {
    TransferContext.writeArguments(_RID to joint, VECTOR2 to anchorA, VECTOR2 to anchorB, _RID to bodyA, _RID to bodyB)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_MAKE_DAMPED_SPRING, NIL)
  }

  /**
   * Sets a damped spring joint parameter. See [enum DampedSpringParam] for a list of available parameters.
   */
  public fun dampedSpringJointSetParam(
    joint: RID,
    `param`: PhysicsServer2D.DampedSpringParam,
    `value`: Double
  ): Unit {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_DAMPED_SPRING_JOINT_SET_PARAM, NIL)
  }

  /**
   * Returns the value of a damped spring joint parameter. See [enum DampedSpringParam] for a list of available parameters.
   */
  public fun dampedSpringJointGetParam(joint: RID, `param`: PhysicsServer2D.DampedSpringParam):
      Double {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_DAMPED_SPRING_JOINT_GET_PARAM, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a joint's type (see [enum JointType]).
   */
  public fun jointGetType(joint: RID): PhysicsServer2D.JointType {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_JOINT_GET_TYPE,
        LONG)
    return PhysicsServer2D.JointType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Destroys any of the objects created by PhysicsServer2D. If the [RID] passed is not one of the objects that can be created by PhysicsServer2D, an error will be sent to the console.
   */
  public fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_FREE_RID, NIL)
  }

  /**
   * Activates or deactivates the 2D physics engine.
   */
  public fun setActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_SET_ACTIVE, NIL)
  }

  /**
   * Returns information about the current state of the 2D physics engine. See [enum ProcessInfo] for a list of available states.
   */
  public fun getProcessInfo(processInfo: PhysicsServer2D.ProcessInfo): Long {
    TransferContext.writeArguments(LONG to processInfo.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2D_GET_PROCESS_INFO,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class ProcessInfo(
    id: Long
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

  public enum class AreaBodyStatus(
    id: Long
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

  public enum class BodyMode(
    id: Long
  ) {
    /**
     * Constant for static bodies. In this mode, a body can be only moved by user code and doesn't collide with other bodies along its path when moved.
     */
    BODY_MODE_STATIC(0),
    /**
     * Constant for kinematic bodies. In this mode, a body can be only moved by user code and collides with other bodies along its path.
     */
    BODY_MODE_KINEMATIC(1),
    BODY_MODE_DYNAMIC(2),
    BODY_MODE_DYNAMIC_LINEAR(3),
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
    id: Long
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
     * This is the constant for creating convex polygon shapes. A polygon is defined by a list of points. It can be used for intersections and inside/outside checks. Unlike the [godot.CollisionPolygon2D.polygon] property, polygons modified with [shapeSetData] do not verify that the points supplied form is a convex polygon.
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

  public enum class JointParam(
    id: Long
  ) {
    /**
     *
     */
    JOINT_PARAM_BIAS(0),
    /**
     *
     */
    JOINT_PARAM_MAX_BIAS(1),
    /**
     *
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

  public enum class BodyDampMode(
    id: Long
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

  public enum class SpaceParameter(
    id: Long
  ) {
    /**
     * Constant to set/get the maximum distance a pair of bodies has to move before their collision status has to be recalculated.
     */
    SPACE_PARAM_CONTACT_RECYCLE_RADIUS(0),
    /**
     * Constant to set/get the maximum distance a shape can be from another before they are considered separated and the contact is discarded.
     */
    SPACE_PARAM_CONTACT_MAX_SEPARATION(1),
    /**
     * Constant to set/get the maximum distance a shape can penetrate another shape before it is considered a collision.
     */
    SPACE_PARAM_CONTACT_MAX_ALLOWED_PENETRATION(2),
    /**
     * Constant to set/get the default solver bias for all physics contacts. A solver bias is a factor controlling how much two objects "rebound", after overlapping, to avoid leaving them in that state because of numerical imprecision.
     */
    SPACE_PARAM_CONTACT_DEFAULT_BIAS(3),
    /**
     * Constant to set/get the threshold linear velocity of activity. A body marked as potentially inactive for both linear and angular velocity will be put to sleep after the time given.
     */
    SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD(4),
    /**
     * Constant to set/get the threshold angular velocity of activity. A body marked as potentially inactive for both linear and angular velocity will be put to sleep after the time given.
     */
    SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD(5),
    /**
     * Constant to set/get the maximum time of activity. A body marked as potentially inactive for both linear and angular velocity will be put to sleep after this time.
     */
    SPACE_PARAM_BODY_TIME_TO_SLEEP(6),
    /**
     * Constant to set/get the default solver bias for all physics constraints. A solver bias is a factor controlling how much two objects "rebound", after violating a constraint, to avoid leaving them in that state because of numerical imprecision.
     */
    SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS(7),
    /**
     * Constant to set/get the number of solver iterations for all contacts and constraints. The greater the number of iterations, the more accurate the collisions will be. However, a greater number of iterations requires more CPU power, which can decrease performance.
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

  public enum class JointType(
    id: Long
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

  public enum class CCDMode(
    id: Long
  ) {
    /**
     * Disables continuous collision detection. This is the fastest way to detect body collisions, but can miss small, fast-moving objects.
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

  public enum class DampedSpringParam(
    id: Long
  ) {
    /**
     * Sets the resting length of the spring joint. The joint will always try to go to back this length when pulled apart.
     */
    DAMPED_SPRING_REST_LENGTH(0),
    /**
     * Sets the stiffness of the spring joint. The joint applies a force equal to the stiffness times the distance from its resting length.
     */
    DAMPED_SPRING_STIFFNESS(1),
    /**
     * Sets the damping ratio of the spring joint. A value of 0 indicates an undamped spring, while 1 causes the system to reach equilibrium as fast as possible (critical damping).
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

  public enum class BodyState(
    id: Long
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

  public enum class BodyParameter(
    id: Long
  ) {
    /**
     * Constant to set/get a body's bounce factor.
     */
    BODY_PARAM_BOUNCE(0),
    /**
     * Constant to set/get a body's friction.
     */
    BODY_PARAM_FRICTION(1),
    /**
     * Constant to set/get a body's mass.
     */
    BODY_PARAM_MASS(2),
    /**
     * Constant to set/get a body's inertia.
     */
    BODY_PARAM_INERTIA(3),
    /**
     * Constant to set/get a body's center of mass position in the body's local coordinate system.
     */
    BODY_PARAM_CENTER_OF_MASS(4),
    /**
     * Constant to set/get a body's gravity multiplier.
     */
    BODY_PARAM_GRAVITY_SCALE(5),
    /**
     * Constant to set/get a body's linear dampening mode. See [enum BodyDampMode] for possible values.
     */
    BODY_PARAM_LINEAR_DAMP_MODE(6),
    /**
     * Constant to set/get a body's angular dampening mode. See [enum BodyDampMode] for possible values.
     */
    BODY_PARAM_ANGULAR_DAMP_MODE(7),
    /**
     * Constant to set/get a body's linear dampening factor.
     */
    BODY_PARAM_LINEAR_DAMP(8),
    /**
     * Constant to set/get a body's angular dampening factor.
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

  public enum class AreaSpaceOverrideMode(
    id: Long
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

  public enum class AreaParameter(
    id: Long
  ) {
    /**
     * Constant to set/get gravity override mode in an area. See [enum AreaSpaceOverrideMode] for possible values.
     */
    AREA_PARAM_GRAVITY_OVERRIDE_MODE(0),
    /**
     * Constant to set/get gravity strength in an area.
     */
    AREA_PARAM_GRAVITY(1),
    /**
     * Constant to set/get gravity vector/center in an area.
     */
    AREA_PARAM_GRAVITY_VECTOR(2),
    /**
     * Constant to set/get whether the gravity vector of an area is a direction, or a center point.
     */
    AREA_PARAM_GRAVITY_IS_POINT(3),
    /**
     * Constant to set/get the falloff factor for point gravity of an area. The greater this value is, the faster the strength of gravity decreases with the square of distance.
     */
    AREA_PARAM_GRAVITY_DISTANCE_SCALE(4),
    /**
     * This constant was used to set/get the falloff factor for point gravity. It has been superseded by [AREA_PARAM_GRAVITY_DISTANCE_SCALE].
     */
    AREA_PARAM_GRAVITY_POINT_ATTENUATION(5),
    /**
     * Constant to set/get linear damping override mode in an area. See [enum AreaSpaceOverrideMode] for possible values.
     */
    AREA_PARAM_LINEAR_DAMP_OVERRIDE_MODE(6),
    /**
     * Constant to set/get the linear damping factor of an area.
     */
    AREA_PARAM_LINEAR_DAMP(7),
    /**
     * Constant to set/get angular damping override mode in an area. See [enum AreaSpaceOverrideMode] for possible values.
     */
    AREA_PARAM_ANGULAR_DAMP_OVERRIDE_MODE(8),
    /**
     * Constant to set/get the angular damping factor of an area.
     */
    AREA_PARAM_ANGULAR_DAMP(9),
    /**
     * Constant to set/get the priority (order of processing) of an area.
     */
    AREA_PARAM_PRIORITY(10),
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
