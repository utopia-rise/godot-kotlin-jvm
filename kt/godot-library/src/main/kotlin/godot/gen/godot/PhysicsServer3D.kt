// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.Callable
import godot.core.RID
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
 * PhysicsServer3D is the server responsible for all 3D physics. It can directly create and
 * manipulate all physics objects:
 * - A *space* is a self-contained world for a physics simulation. It contains bodies, areas, and
 * joints. Its state can be queried for collision and intersection information, and several parameters
 * of the simulation can be modified.
 * - A *shape* is a geometric shape such as a sphere, a box, a cylinder, or a polygon. It can be
 * used for collision detection by adding it to a body/area, possibly with an extra transformation
 * relative to the body/area's origin. Bodies/areas can have multiple (transformed) shapes added to
 * them, and a single shape can be added to bodies/areas multiple times with different local
 * transformations.
 * - A *body* is a physical object which can be in static, kinematic, or rigid mode. Its state (such
 * as position and velocity) can be queried and updated. A force integration callback can be set to
 * customize the body's physics.
 * - An *area* is a region in space which can be used to detect bodies and areas entering and
 * exiting it. A body monitoring callback can be set to report entering/exiting body shapes, and
 * similarly an area monitoring callback can be set. Gravity and damping can be overridden within the
 * area by setting area parameters.
 * - A *joint* is a constraint, either between two bodies or on one body relative to a point.
 * Parameters such as the joint bias and the rest length of a spring joint can be adjusted.
 * Physics objects in [PhysicsServer3D] may be created and manipulated independently; they do not
 * have to be tied to nodes in the scene tree.
 * **Note:** All the 3D physics nodes use the physics server internally. Adding a physics node to
 * the scene tree will cause a corresponding physics object to be created in the physics server. A
 * rigid body node registers a callback that updates the node's transform with the transform of the
 * respective body object in the physics server (every physics update). An area node registers a
 * callback to inform the area node about overlaps with the respective area object in the physics
 * server. The raycast node queries the direct state of the relevant space in the physics server.
 */
@GodotBaseType
public object PhysicsServer3D : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_PHYSICSSERVER3D)
    return false
  }

  public fun worldBoundaryShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.worldBoundaryShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun separationRayShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.separationRayShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun sphereShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.sphereShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun boxShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.boxShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun capsuleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.capsuleShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun cylinderShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cylinderShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun convexPolygonShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.convexPolygonShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun concavePolygonShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.concavePolygonShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun heightmapShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.heightmapShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun customShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.customShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the shape data that defines its shape and size. The data to be passed depends on the kind
   * of shape created [shapeGetType].
   */
  public fun shapeSetData(shape: RID, `data`: Any?): Unit {
    TransferContext.writeArguments(_RID to shape, ANY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeSetDataPtr, NIL)
  }

  /**
   * Returns the type of shape (see [enum ShapeType] constants).
   */
  public fun shapeGetType(shape: RID): ShapeType {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeGetTypePtr, LONG)
    return PhysicsServer3D.ShapeType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the shape data.
   */
  public fun shapeGetData(shape: RID): Any? {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeGetDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Creates a space. A space is a collection of parameters for the physics engine that can be
   * assigned to an area or a body. It can be assigned to an area with [areaSetSpace], or to a body
   * with [bodySetSpace].
   */
  public fun spaceCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.spaceCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Marks a space as active. It will not have an effect, unless it is assigned to an area or body.
   */
  public fun spaceSetActive(space: RID, active: Boolean): Unit {
    TransferContext.writeArguments(_RID to space, BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.spaceSetActivePtr, NIL)
  }

  /**
   * Returns whether the space is active.
   */
  public fun spaceIsActive(space: RID): Boolean {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr, MethodBindings.spaceIsActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the value for a space parameter. A list of available parameters is on the [enum
   * SpaceParameter] constants.
   */
  public fun spaceSetParam(
    space: RID,
    `param`: SpaceParameter,
    `value`: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to space, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.spaceSetParamPtr, NIL)
  }

  /**
   * Returns the value of a space parameter.
   */
  public fun spaceGetParam(space: RID, `param`: SpaceParameter): Float {
    TransferContext.writeArguments(_RID to space, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.spaceGetParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the state of a space, a [PhysicsDirectSpaceState3D]. This object can be used to make
   * collision/intersection queries.
   */
  public fun spaceGetDirectState(space: RID): PhysicsDirectSpaceState3D? {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr, MethodBindings.spaceGetDirectStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState3D?)
  }

  /**
   * Creates an [Area3D].
   */
  public fun areaCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.areaCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Assigns a space to the area.
   */
  public fun areaSetSpace(area: RID, space: RID): Unit {
    TransferContext.writeArguments(_RID to area, _RID to space)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetSpacePtr, NIL)
  }

  /**
   * Returns the space assigned to the area.
   */
  public fun areaGetSpace(area: RID): RID {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetSpacePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Adds a shape to the area, along with a transform matrix. Shapes are usually referenced by their
   * index, so you should track which shape has a given index.
   */
  @JvmOverloads
  public fun areaAddShape(
    area: RID,
    shape: RID,
    transform: Transform3D = Transform3D(),
    disabled: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to area, _RID to shape, TRANSFORM3D to transform, BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.areaAddShapePtr, NIL)
  }

  /**
   * Substitutes a given area shape by another. The old shape is selected by its index, the new one
   * by its [RID].
   */
  public fun areaSetShape(
    area: RID,
    shapeIdx: Int,
    shape: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong(), _RID to shape)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetShapePtr, NIL)
  }

  /**
   * Sets the transform matrix for an area shape.
   */
  public fun areaSetShapeTransform(
    area: RID,
    shapeIdx: Int,
    transform: Transform3D,
  ): Unit {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetShapeTransformPtr, NIL)
  }

  public fun areaSetShapeDisabled(
    area: RID,
    shapeIdx: Int,
    disabled: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetShapeDisabledPtr, NIL)
  }

  /**
   * Returns the number of shapes assigned to an area.
   */
  public fun areaGetShapeCount(area: RID): Int {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [RID] of the nth shape of an area.
   */
  public fun areaGetShape(area: RID, shapeIdx: Int): RID {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetShapePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the transform matrix of a shape within an area.
   */
  public fun areaGetShapeTransform(area: RID, shapeIdx: Int): Transform3D {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetShapeTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Removes a shape from an area. It does not delete the shape, so it can be reassigned later.
   */
  public fun areaRemoveShape(area: RID, shapeIdx: Int): Unit {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.areaRemoveShapePtr, NIL)
  }

  /**
   * Removes all shapes from an area. It does not delete the shapes, so they can be reassigned
   * later.
   */
  public fun areaClearShapes(area: RID): Unit {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaClearShapesPtr, NIL)
  }

  /**
   * Assigns the area to one or many physics layers.
   */
  public fun areaSetCollisionLayer(area: RID, layer: Long): Unit {
    TransferContext.writeArguments(_RID to area, LONG to layer)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetCollisionLayerPtr, NIL)
  }

  /**
   * Returns the physics layer or layers an area belongs to.
   */
  public fun areaGetCollisionLayer(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetCollisionLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets which physics layers the area will monitor.
   */
  public fun areaSetCollisionMask(area: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to area, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetCollisionMaskPtr, NIL)
  }

  /**
   * Returns the physics layer or layers an area can contact with.
   */
  public fun areaGetCollisionMask(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the value for an area parameter. A list of available parameters is on the [enum
   * AreaParameter] constants.
   */
  public fun areaSetParam(
    area: RID,
    `param`: AreaParameter,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(_RID to area, LONG to param.id, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetParamPtr, NIL)
  }

  /**
   * Sets the transform matrix for an area.
   */
  public fun areaSetTransform(area: RID, transform: Transform3D): Unit {
    TransferContext.writeArguments(_RID to area, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetTransformPtr, NIL)
  }

  /**
   * Returns an area parameter value. A list of available parameters is on the [enum AreaParameter]
   * constants.
   */
  public fun areaGetParam(area: RID, `param`: AreaParameter): Any? {
    TransferContext.writeArguments(_RID to area, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetParamPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns the transform matrix for an area.
   */
  public fun areaGetTransform(area: RID): Transform3D {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Assigns the area to a descendant of [Object], so it can exist in the node tree.
   */
  public fun areaAttachObjectInstanceId(area: RID, id: Long): Unit {
    TransferContext.writeArguments(_RID to area, LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.areaAttachObjectInstanceIdPtr, NIL)
  }

  /**
   * Gets the instance ID of the object the area is assigned to.
   */
  public fun areaGetObjectInstanceId(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetObjectInstanceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the area's body monitor callback. This callback will be called when any other (shape of a)
   * body enters or exits (a shape of) the given area, and must take the following five parameters:
   * 1. an integer `status`: either [constant AREA_BODY_ADDED] or [constant AREA_BODY_REMOVED]
   * depending on whether the other body shape entered or exited the area,
   * 2. an [RID] `body_rid`: the [RID] of the body that entered or exited the area,
   * 3. an integer `instance_id`: the `ObjectID` attached to the body,
   * 4. an integer `body_shape_idx`: the index of the shape of the body that entered or exited the
   * area,
   * 5. an integer `self_shape_idx`: the index of the shape of the area where the body entered or
   * exited.
   * By counting (or keeping track of) the shapes that enter and exit, it can be determined if a
   * body (with all its shapes) is entering for the first time or exiting for the last time.
   */
  public fun areaSetMonitorCallback(area: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to area, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetMonitorCallbackPtr, NIL)
  }

  /**
   * Sets the area's area monitor callback. This callback will be called when any other (shape of
   * an) area enters or exits (a shape of) the given area, and must take the following five parameters:
   * 1. an integer `status`: either [constant AREA_BODY_ADDED] or [constant AREA_BODY_REMOVED]
   * depending on whether the other area's shape entered or exited the area,
   * 2. an [RID] `area_rid`: the [RID] of the other area that entered or exited the area,
   * 3. an integer `instance_id`: the `ObjectID` attached to the other area,
   * 4. an integer `area_shape_idx`: the index of the shape of the other area that entered or exited
   * the area,
   * 5. an integer `self_shape_idx`: the index of the shape of the area where the other area entered
   * or exited.
   * By counting (or keeping track of) the shapes that enter and exit, it can be determined if an
   * area (with all its shapes) is entering for the first time or exiting for the last time.
   */
  public fun areaSetAreaMonitorCallback(area: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to area, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetAreaMonitorCallbackPtr, NIL)
  }

  public fun areaSetMonitorable(area: RID, monitorable: Boolean): Unit {
    TransferContext.writeArguments(_RID to area, BOOL to monitorable)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetMonitorablePtr, NIL)
  }

  /**
   * Sets object pickable with rays.
   */
  public fun areaSetRayPickable(area: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to area, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetRayPickablePtr, NIL)
  }

  public fun bodyCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.bodyCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Assigns a space to the body (see [spaceCreate]).
   */
  public fun bodySetSpace(body: RID, space: RID): Unit {
    TransferContext.writeArguments(_RID to body, _RID to space)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetSpacePtr, NIL)
  }

  /**
   * Returns the [RID] of the space assigned to a body.
   */
  public fun bodyGetSpace(body: RID): RID {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetSpacePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the body mode, from one of the [enum BodyMode] constants.
   */
  public fun bodySetMode(body: RID, mode: BodyMode): Unit {
    TransferContext.writeArguments(_RID to body, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetModePtr, NIL)
  }

  /**
   * Returns the body mode.
   */
  public fun bodyGetMode(body: RID): BodyMode {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetModePtr, LONG)
    return PhysicsServer3D.BodyMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the physics layer or layers a body belongs to.
   */
  public fun bodySetCollisionLayer(body: RID, layer: Long): Unit {
    TransferContext.writeArguments(_RID to body, LONG to layer)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetCollisionLayerPtr, NIL)
  }

  /**
   * Returns the physics layer or layers a body belongs to.
   */
  public fun bodyGetCollisionLayer(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetCollisionLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the physics layer or layers a body can collide with.
   */
  public fun bodySetCollisionMask(body: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to body, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetCollisionMaskPtr, NIL)
  }

  /**
   * Returns the physics layer or layers a body can collide with.
   */
  public fun bodyGetCollisionMask(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the body's collision priority.
   */
  public fun bodySetCollisionPriority(body: RID, priority: Float): Unit {
    TransferContext.writeArguments(_RID to body, DOUBLE to priority.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetCollisionPriorityPtr, NIL)
  }

  /**
   * Returns the body's collision priority.
   */
  public fun bodyGetCollisionPriority(body: RID): Float {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetCollisionPriorityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Adds a shape to the body, along with a transform matrix. Shapes are usually referenced by their
   * index, so you should track which shape has a given index.
   */
  @JvmOverloads
  public fun bodyAddShape(
    body: RID,
    shape: RID,
    transform: Transform3D = Transform3D(),
    disabled: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to body, _RID to shape, TRANSFORM3D to transform, BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAddShapePtr, NIL)
  }

  /**
   * Substitutes a given body shape by another. The old shape is selected by its index, the new one
   * by its [RID].
   */
  public fun bodySetShape(
    body: RID,
    shapeIdx: Int,
    shape: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong(), _RID to shape)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetShapePtr, NIL)
  }

  /**
   * Sets the transform matrix for a body shape.
   */
  public fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Int,
    transform: Transform3D,
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetShapeTransformPtr, NIL)
  }

  public fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Int,
    disabled: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetShapeDisabledPtr, NIL)
  }

  /**
   * Returns the number of shapes assigned to a body.
   */
  public fun bodyGetShapeCount(body: RID): Int {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [RID] of the nth shape of a body.
   */
  public fun bodyGetShape(body: RID, shapeIdx: Int): RID {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetShapePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the transform matrix of a body shape.
   */
  public fun bodyGetShapeTransform(body: RID, shapeIdx: Int): Transform3D {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetShapeTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Removes a shape from a body. The shape is not deleted, so it can be reused afterwards.
   */
  public fun bodyRemoveShape(body: RID, shapeIdx: Int): Unit {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bodyRemoveShapePtr, NIL)
  }

  /**
   * Removes all shapes from a body.
   */
  public fun bodyClearShapes(body: RID): Unit {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyClearShapesPtr, NIL)
  }

  /**
   * Assigns the area to a descendant of [Object], so it can exist in the node tree.
   */
  public fun bodyAttachObjectInstanceId(body: RID, id: Long): Unit {
    TransferContext.writeArguments(_RID to body, LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAttachObjectInstanceIdPtr, NIL)
  }

  /**
   * Gets the instance ID of the object the area is assigned to.
   */
  public fun bodyGetObjectInstanceId(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetObjectInstanceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * If `true`, the continuous collision detection mode is enabled.
   * Continuous collision detection tries to predict where a moving body will collide, instead of
   * moving it and correcting its movement if it collided.
   */
  public fun bodySetEnableContinuousCollisionDetection(body: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetEnableContinuousCollisionDetectionPtr,
        NIL)
  }

  /**
   * If `true`, the continuous collision detection mode is enabled.
   */
  public fun bodyIsContinuousCollisionDetectionEnabled(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyIsContinuousCollisionDetectionEnabledPtr,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets a body parameter. A list of available parameters is on the [enum BodyParameter] constants.
   */
  public fun bodySetParam(
    body: RID,
    `param`: BodyParameter,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to param.id, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetParamPtr, NIL)
  }

  /**
   * Returns the value of a body parameter. A list of available parameters is on the [enum
   * BodyParameter] constants.
   */
  public fun bodyGetParam(body: RID, `param`: BodyParameter): Any? {
    TransferContext.writeArguments(_RID to body, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetParamPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Restores the default inertia and center of mass based on shapes to cancel any custom values
   * previously set using [bodySetParam].
   */
  public fun bodyResetMassProperties(body: RID): Unit {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyResetMassPropertiesPtr, NIL)
  }

  /**
   * Sets a body state (see [enum BodyState] constants).
   */
  public fun bodySetState(
    body: RID,
    state: BodyState,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to state.id, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetStatePtr, NIL)
  }

  /**
   * Returns a body state.
   */
  public fun bodyGetState(body: RID, state: BodyState): Any? {
    TransferContext.writeArguments(_RID to body, LONG to state.id)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetStatePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Applies a directional impulse without affecting rotation.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   * This is equivalent to using [bodyApplyImpulse] at the body's center of mass.
   */
  public fun bodyApplyCentralImpulse(body: RID, impulse: Vector3): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyCentralImpulsePtr, NIL)
  }

  /**
   * Applies a positioned impulse to the body.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   * [param position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public fun bodyApplyImpulse(
    body: RID,
    impulse: Vector3,
    position: Vector3 = Vector3(0, 0, 0),
  ): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR3 to impulse, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyImpulsePtr, NIL)
  }

  /**
   * Applies a rotational impulse to the body without affecting the position.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   */
  public fun bodyApplyTorqueImpulse(body: RID, impulse: Vector3): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyTorqueImpulsePtr, NIL)
  }

  /**
   * Applies a directional force without affecting rotation. A force is time dependent and meant to
   * be applied every physics update.
   * This is equivalent to using [bodyApplyForce] at the body's center of mass.
   */
  public fun bodyApplyCentralForce(body: RID, force: Vector3): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR3 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyCentralForcePtr, NIL)
  }

  /**
   * Applies a positioned force to the body. A force is time dependent and meant to be applied every
   * physics update.
   * [param position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public fun bodyApplyForce(
    body: RID,
    force: Vector3,
    position: Vector3 = Vector3(0, 0, 0),
  ): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyForcePtr, NIL)
  }

  /**
   * Applies a rotational force without affecting position. A force is time dependent and meant to
   * be applied every physics update.
   */
  public fun bodyApplyTorque(body: RID, torque: Vector3): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyTorquePtr, NIL)
  }

  /**
   * Adds a constant directional force without affecting rotation that keeps being applied over time
   * until cleared with `body_set_constant_force(body, Vector3(0, 0, 0))`.
   * This is equivalent to using [bodyAddConstantForce] at the body's center of mass.
   */
  public fun bodyAddConstantCentralForce(body: RID, force: Vector3): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR3 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAddConstantCentralForcePtr, NIL)
  }

  /**
   * Adds a constant positioned force to the body that keeps being applied over time until cleared
   * with `body_set_constant_force(body, Vector3(0, 0, 0))`.
   * [param position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  public fun bodyAddConstantForce(
    body: RID,
    force: Vector3,
    position: Vector3 = Vector3(0, 0, 0),
  ): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAddConstantForcePtr, NIL)
  }

  /**
   * Adds a constant rotational force without affecting position that keeps being applied over time
   * until cleared with `body_set_constant_torque(body, Vector3(0, 0, 0))`.
   */
  public fun bodyAddConstantTorque(body: RID, torque: Vector3): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAddConstantTorquePtr, NIL)
  }

  /**
   * Sets the body's total constant positional forces applied during each physics update.
   * See [bodyAddConstantForce] and [bodyAddConstantCentralForce].
   */
  public fun bodySetConstantForce(body: RID, force: Vector3): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR3 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetConstantForcePtr, NIL)
  }

  /**
   * Returns the body's total constant positional forces applied during each physics update.
   * See [bodyAddConstantForce] and [bodyAddConstantCentralForce].
   */
  public fun bodyGetConstantForce(body: RID): Vector3 {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetConstantForcePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the body's total constant rotational forces applied during each physics update.
   * See [bodyAddConstantTorque].
   */
  public fun bodySetConstantTorque(body: RID, torque: Vector3): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetConstantTorquePtr, NIL)
  }

  /**
   * Returns the body's total constant rotational forces applied during each physics update.
   * See [bodyAddConstantTorque].
   */
  public fun bodyGetConstantTorque(body: RID): Vector3 {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetConstantTorquePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets an axis velocity. The velocity in the given vector axis will be set as the given vector
   * length. This is useful for jumping behavior.
   */
  public fun bodySetAxisVelocity(body: RID, axisVelocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to body, VECTOR3 to axisVelocity)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetAxisVelocityPtr, NIL)
  }

  public fun bodySetAxisLock(
    body: RID,
    axis: BodyAxis,
    lock: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to body, LONG to axis.id, BOOL to lock)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetAxisLockPtr, NIL)
  }

  public fun bodyIsAxisLocked(body: RID, axis: BodyAxis): Boolean {
    TransferContext.writeArguments(_RID to body, LONG to axis.id)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyIsAxisLockedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds a body to the list of bodies exempt from collisions.
   */
  public fun bodyAddCollisionException(body: RID, exceptedBody: RID): Unit {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAddCollisionExceptionPtr, NIL)
  }

  /**
   * Removes a body from the list of bodies exempt from collisions.
   * Continuous collision detection tries to predict where a moving body will collide, instead of
   * moving it and correcting its movement if it collided.
   */
  public fun bodyRemoveCollisionException(body: RID, exceptedBody: RID): Unit {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyRemoveCollisionExceptionPtr, NIL)
  }

  /**
   * Sets the maximum contacts to report. Bodies can keep a log of the contacts with other bodies.
   * This is enabled by setting the maximum number of contacts reported to a number greater than 0.
   */
  public fun bodySetMaxContactsReported(body: RID, amount: Int): Unit {
    TransferContext.writeArguments(_RID to body, LONG to amount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetMaxContactsReportedPtr, NIL)
  }

  /**
   * Returns the maximum contacts that can be reported. See [bodySetMaxContactsReported].
   */
  public fun bodyGetMaxContactsReported(body: RID): Int {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetMaxContactsReportedPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets whether a body uses a callback function to calculate its own physics (see
   * [bodySetForceIntegrationCallback]).
   */
  public fun bodySetOmitForceIntegration(body: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetOmitForceIntegrationPtr, NIL)
  }

  /**
   * Returns whether a body uses a callback function to calculate its own physics (see
   * [bodySetForceIntegrationCallback]).
   */
  public fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyIsOmittingForceIntegrationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the function used to calculate physics for an object, if that object allows it (see
   * [bodySetOmitForceIntegration]). The force integration function takes 2 arguments:
   * - `state` — [PhysicsDirectBodyState3D] used to retrieve and modify the body's state.
   * - [code skip-lint]userdata[/code] — optional user data passed to
   * [bodySetForceIntegrationCallback].
   */
  @JvmOverloads
  public fun bodySetForceIntegrationCallback(
    body: RID,
    callable: Callable,
    userdata: Any? = null,
  ): Unit {
    TransferContext.writeArguments(_RID to body, CALLABLE to callable, ANY to userdata)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetForceIntegrationCallbackPtr, NIL)
  }

  /**
   * Sets the body pickable with rays if [param enable] is set.
   */
  public fun bodySetRayPickable(body: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetRayPickablePtr, NIL)
  }

  /**
   * Returns `true` if a collision would result from moving along a motion vector from a given point
   * in space. [PhysicsTestMotionParameters3D] is passed to set motion parameters.
   * [PhysicsTestMotionResult3D] can be passed to return additional information.
   */
  @JvmOverloads
  public fun bodyTestMotion(
    body: RID,
    parameters: PhysicsTestMotionParameters3D,
    result: PhysicsTestMotionResult3D? = null,
  ): Boolean {
    TransferContext.writeArguments(_RID to body, OBJECT to parameters, OBJECT to result)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyTestMotionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [PhysicsDirectBodyState3D] of the body. Returns `null` if the body is destroyed or
   * removed from the physics space.
   */
  public fun bodyGetDirectState(body: RID): PhysicsDirectBodyState3D? {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetDirectStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectBodyState3D?)
  }

  public fun softBodyGetBounds(body: RID): AABB {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.softBodyGetBoundsPtr,
        godot.core.VariantType.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
  }

  public fun jointCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.jointCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun jointClear(joint: RID): Unit {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, MethodBindings.jointClearPtr, NIL)
  }

  public fun jointMakePin(
    joint: RID,
    bodyA: RID,
    localA: Vector3,
    bodyB: RID,
    localB: Vector3,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, _RID to bodyA, VECTOR3 to localA, _RID to bodyB, VECTOR3 to localB)
    TransferContext.callMethod(rawPtr, MethodBindings.jointMakePinPtr, NIL)
  }

  /**
   * Sets a pin_joint parameter (see [enum PinJointParam] constants).
   */
  public fun pinJointSetParam(
    joint: RID,
    `param`: PinJointParam,
    `value`: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.pinJointSetParamPtr, NIL)
  }

  /**
   * Gets a pin_joint parameter (see [enum PinJointParam] constants).
   */
  public fun pinJointGetParam(joint: RID, `param`: PinJointParam): Float {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.pinJointGetParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets position of the joint in the local space of body a of the joint.
   */
  public fun pinJointSetLocalA(joint: RID, localA: Vector3): Unit {
    TransferContext.writeArguments(_RID to joint, VECTOR3 to localA)
    TransferContext.callMethod(rawPtr, MethodBindings.pinJointSetLocalAPtr, NIL)
  }

  /**
   * Returns position of the joint in the local space of body a of the joint.
   */
  public fun pinJointGetLocalA(joint: RID): Vector3 {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, MethodBindings.pinJointGetLocalAPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets position of the joint in the local space of body b of the joint.
   */
  public fun pinJointSetLocalB(joint: RID, localB: Vector3): Unit {
    TransferContext.writeArguments(_RID to joint, VECTOR3 to localB)
    TransferContext.callMethod(rawPtr, MethodBindings.pinJointSetLocalBPtr, NIL)
  }

  /**
   * Returns position of the joint in the local space of body b of the joint.
   */
  public fun pinJointGetLocalB(joint: RID): Vector3 {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, MethodBindings.pinJointGetLocalBPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun jointMakeHinge(
    joint: RID,
    bodyA: RID,
    hingeA: Transform3D,
    bodyB: RID,
    hingeB: Transform3D,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, _RID to bodyA, TRANSFORM3D to hingeA, _RID to bodyB, TRANSFORM3D to hingeB)
    TransferContext.callMethod(rawPtr, MethodBindings.jointMakeHingePtr, NIL)
  }

  /**
   * Sets a hinge_joint parameter (see [enum HingeJointParam] constants).
   */
  public fun hingeJointSetParam(
    joint: RID,
    `param`: HingeJointParam,
    `value`: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.hingeJointSetParamPtr, NIL)
  }

  /**
   * Gets a hinge_joint parameter (see [enum HingeJointParam]).
   */
  public fun hingeJointGetParam(joint: RID, `param`: HingeJointParam): Float {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.hingeJointGetParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets a hinge_joint flag (see [enum HingeJointFlag] constants).
   */
  public fun hingeJointSetFlag(
    joint: RID,
    flag: HingeJointFlag,
    enabled: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, LONG to flag.id, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.hingeJointSetFlagPtr, NIL)
  }

  /**
   * Gets a hinge_joint flag (see [enum HingeJointFlag] constants).
   */
  public fun hingeJointGetFlag(joint: RID, flag: HingeJointFlag): Boolean {
    TransferContext.writeArguments(_RID to joint, LONG to flag.id)
    TransferContext.callMethod(rawPtr, MethodBindings.hingeJointGetFlagPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun jointMakeSlider(
    joint: RID,
    bodyA: RID,
    localRefA: Transform3D,
    bodyB: RID,
    localRefB: Transform3D,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, _RID to bodyA, TRANSFORM3D to localRefA, _RID to bodyB, TRANSFORM3D to localRefB)
    TransferContext.callMethod(rawPtr, MethodBindings.jointMakeSliderPtr, NIL)
  }

  /**
   * Gets a slider_joint parameter (see [enum SliderJointParam] constants).
   */
  public fun sliderJointSetParam(
    joint: RID,
    `param`: SliderJointParam,
    `value`: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.sliderJointSetParamPtr, NIL)
  }

  /**
   * Gets a slider_joint parameter (see [enum SliderJointParam] constants).
   */
  public fun sliderJointGetParam(joint: RID, `param`: SliderJointParam): Float {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.sliderJointGetParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun jointMakeConeTwist(
    joint: RID,
    bodyA: RID,
    localRefA: Transform3D,
    bodyB: RID,
    localRefB: Transform3D,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, _RID to bodyA, TRANSFORM3D to localRefA, _RID to bodyB, TRANSFORM3D to localRefB)
    TransferContext.callMethod(rawPtr, MethodBindings.jointMakeConeTwistPtr, NIL)
  }

  /**
   * Sets a cone_twist_joint parameter (see [enum ConeTwistJointParam] constants).
   */
  public fun coneTwistJointSetParam(
    joint: RID,
    `param`: ConeTwistJointParam,
    `value`: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.coneTwistJointSetParamPtr, NIL)
  }

  /**
   * Gets a cone_twist_joint parameter (see [enum ConeTwistJointParam] constants).
   */
  public fun coneTwistJointGetParam(joint: RID, `param`: ConeTwistJointParam): Float {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.coneTwistJointGetParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the type of the Joint3D.
   */
  public fun jointGetType(joint: RID): JointType {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, MethodBindings.jointGetTypePtr, LONG)
    return PhysicsServer3D.JointType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the priority value of the Joint3D.
   */
  public fun jointSetSolverPriority(joint: RID, priority: Int): Unit {
    TransferContext.writeArguments(_RID to joint, LONG to priority.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.jointSetSolverPriorityPtr, NIL)
  }

  /**
   * Gets the priority value of the Joint3D.
   */
  public fun jointGetSolverPriority(joint: RID): Int {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, MethodBindings.jointGetSolverPriorityPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets whether the bodies attached to the [Joint3D] will collide with each other.
   */
  public fun jointDisableCollisionsBetweenBodies(joint: RID, disable: Boolean): Unit {
    TransferContext.writeArguments(_RID to joint, BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.jointDisableCollisionsBetweenBodiesPtr, NIL)
  }

  /**
   * Returns whether the bodies attached to the [Joint3D] will collide with each other.
   */
  public fun jointIsDisabledCollisionsBetweenBodies(joint: RID): Boolean {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, MethodBindings.jointIsDisabledCollisionsBetweenBodiesPtr,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun jointMakeGeneric6dof(
    joint: RID,
    bodyA: RID,
    localRefA: Transform3D,
    bodyB: RID,
    localRefB: Transform3D,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, _RID to bodyA, TRANSFORM3D to localRefA, _RID to bodyB, TRANSFORM3D to localRefB)
    TransferContext.callMethod(rawPtr, MethodBindings.jointMakeGeneric6dofPtr, NIL)
  }

  /**
   * Sets a generic_6_DOF_joint parameter (see [enum G6DOFJointAxisParam] constants).
   */
  public fun generic6dofJointSetParam(
    joint: RID,
    axis: Vector3.Axis,
    `param`: G6DOFJointAxisParam,
    `value`: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, LONG to axis.id, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.generic6dofJointSetParamPtr, NIL)
  }

  /**
   * Gets a generic_6_DOF_joint parameter (see [enum G6DOFJointAxisParam] constants).
   */
  public fun generic6dofJointGetParam(
    joint: RID,
    axis: Vector3.Axis,
    `param`: G6DOFJointAxisParam,
  ): Float {
    TransferContext.writeArguments(_RID to joint, LONG to axis.id, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.generic6dofJointGetParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets a generic_6_DOF_joint flag (see [enum G6DOFJointAxisFlag] constants).
   */
  public fun generic6dofJointSetFlag(
    joint: RID,
    axis: Vector3.Axis,
    flag: G6DOFJointAxisFlag,
    enable: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to joint, LONG to axis.id, LONG to flag.id, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.generic6dofJointSetFlagPtr, NIL)
  }

  /**
   * Gets a generic_6_DOF_joint flag (see [enum G6DOFJointAxisFlag] constants).
   */
  public fun generic6dofJointGetFlag(
    joint: RID,
    axis: Vector3.Axis,
    flag: G6DOFJointAxisFlag,
  ): Boolean {
    TransferContext.writeArguments(_RID to joint, LONG to axis.id, LONG to flag.id)
    TransferContext.callMethod(rawPtr, MethodBindings.generic6dofJointGetFlagPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Destroys any of the objects created by PhysicsServer3D. If the [RID] passed is not one of the
   * objects that can be created by PhysicsServer3D, an error will be sent to the console.
   */
  public fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.freeRidPtr, NIL)
  }

  /**
   * Activates or deactivates the 3D physics engine.
   */
  public fun setActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.setActivePtr, NIL)
  }

  /**
   * Returns information about the current state of the 3D physics engine. See [enum ProcessInfo]
   * for a list of available states.
   */
  public fun getProcessInfo(processInfo: ProcessInfo): Int {
    TransferContext.writeArguments(LONG to processInfo.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessInfoPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class JointType(
    id: Long,
  ) {
    /**
     * The [Joint3D] is a [PinJoint3D].
     */
    JOINT_TYPE_PIN(0),
    /**
     * The [Joint3D] is a [HingeJoint3D].
     */
    JOINT_TYPE_HINGE(1),
    /**
     * The [Joint3D] is a [SliderJoint3D].
     */
    JOINT_TYPE_SLIDER(2),
    /**
     * The [Joint3D] is a [ConeTwistJoint3D].
     */
    JOINT_TYPE_CONE_TWIST(3),
    /**
     * The [Joint3D] is a [Generic6DOFJoint3D].
     */
    JOINT_TYPE_6DOF(4),
    /**
     * Represents the size of the [enum JointType] enum.
     */
    JOINT_TYPE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class PinJointParam(
    id: Long,
  ) {
    /**
     * The strength with which the pinned objects try to stay in positional relation to each other.
     * The higher, the stronger.
     */
    PIN_JOINT_BIAS(0),
    /**
     * The strength with which the pinned objects try to stay in velocity relation to each other.
     * The higher, the stronger.
     */
    PIN_JOINT_DAMPING(1),
    /**
     * If above 0, this value is the maximum value for an impulse that this Joint3D puts on its
     * ends.
     */
    PIN_JOINT_IMPULSE_CLAMP(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class HingeJointParam(
    id: Long,
  ) {
    /**
     * The speed with which the two bodies get pulled together when they move in different
     * directions.
     */
    HINGE_JOINT_BIAS(0),
    /**
     * The maximum rotation across the Hinge.
     */
    HINGE_JOINT_LIMIT_UPPER(1),
    /**
     * The minimum rotation across the Hinge.
     */
    HINGE_JOINT_LIMIT_LOWER(2),
    /**
     * The speed with which the rotation across the axis perpendicular to the hinge gets corrected.
     */
    HINGE_JOINT_LIMIT_BIAS(3),
    HINGE_JOINT_LIMIT_SOFTNESS(4),
    /**
     * The lower this value, the more the rotation gets slowed down.
     */
    HINGE_JOINT_LIMIT_RELAXATION(5),
    /**
     * Target speed for the motor.
     */
    HINGE_JOINT_MOTOR_TARGET_VELOCITY(6),
    /**
     * Maximum acceleration for the motor.
     */
    HINGE_JOINT_MOTOR_MAX_IMPULSE(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class HingeJointFlag(
    id: Long,
  ) {
    /**
     * If `true`, the Hinge has a maximum and a minimum rotation.
     */
    HINGE_JOINT_FLAG_USE_LIMIT(0),
    /**
     * If `true`, a motor turns the Hinge.
     */
    HINGE_JOINT_FLAG_ENABLE_MOTOR(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SliderJointParam(
    id: Long,
  ) {
    /**
     * The maximum difference between the pivot points on their X axis before damping happens.
     */
    SLIDER_JOINT_LINEAR_LIMIT_UPPER(0),
    /**
     * The minimum difference between the pivot points on their X axis before damping happens.
     */
    SLIDER_JOINT_LINEAR_LIMIT_LOWER(1),
    /**
     * A factor applied to the movement across the slider axis once the limits get surpassed. The
     * lower, the slower the movement.
     */
    SLIDER_JOINT_LINEAR_LIMIT_SOFTNESS(2),
    /**
     * The amount of restitution once the limits are surpassed. The lower, the more velocity-energy
     * gets lost.
     */
    SLIDER_JOINT_LINEAR_LIMIT_RESTITUTION(3),
    /**
     * The amount of damping once the slider limits are surpassed.
     */
    SLIDER_JOINT_LINEAR_LIMIT_DAMPING(4),
    /**
     * A factor applied to the movement across the slider axis as long as the slider is in the
     * limits. The lower, the slower the movement.
     */
    SLIDER_JOINT_LINEAR_MOTION_SOFTNESS(5),
    /**
     * The amount of restitution inside the slider limits.
     */
    SLIDER_JOINT_LINEAR_MOTION_RESTITUTION(6),
    /**
     * The amount of damping inside the slider limits.
     */
    SLIDER_JOINT_LINEAR_MOTION_DAMPING(7),
    /**
     * A factor applied to the movement across axes orthogonal to the slider.
     */
    SLIDER_JOINT_LINEAR_ORTHOGONAL_SOFTNESS(8),
    /**
     * The amount of restitution when movement is across axes orthogonal to the slider.
     */
    SLIDER_JOINT_LINEAR_ORTHOGONAL_RESTITUTION(9),
    /**
     * The amount of damping when movement is across axes orthogonal to the slider.
     */
    SLIDER_JOINT_LINEAR_ORTHOGONAL_DAMPING(10),
    /**
     * The upper limit of rotation in the slider.
     */
    SLIDER_JOINT_ANGULAR_LIMIT_UPPER(11),
    /**
     * The lower limit of rotation in the slider.
     */
    SLIDER_JOINT_ANGULAR_LIMIT_LOWER(12),
    /**
     * A factor applied to the all rotation once the limit is surpassed.
     */
    SLIDER_JOINT_ANGULAR_LIMIT_SOFTNESS(13),
    /**
     * The amount of restitution of the rotation when the limit is surpassed.
     */
    SLIDER_JOINT_ANGULAR_LIMIT_RESTITUTION(14),
    /**
     * The amount of damping of the rotation when the limit is surpassed.
     */
    SLIDER_JOINT_ANGULAR_LIMIT_DAMPING(15),
    /**
     * A factor that gets applied to the all rotation in the limits.
     */
    SLIDER_JOINT_ANGULAR_MOTION_SOFTNESS(16),
    /**
     * The amount of restitution of the rotation in the limits.
     */
    SLIDER_JOINT_ANGULAR_MOTION_RESTITUTION(17),
    /**
     * The amount of damping of the rotation in the limits.
     */
    SLIDER_JOINT_ANGULAR_MOTION_DAMPING(18),
    /**
     * A factor that gets applied to the all rotation across axes orthogonal to the slider.
     */
    SLIDER_JOINT_ANGULAR_ORTHOGONAL_SOFTNESS(19),
    /**
     * The amount of restitution of the rotation across axes orthogonal to the slider.
     */
    SLIDER_JOINT_ANGULAR_ORTHOGONAL_RESTITUTION(20),
    /**
     * The amount of damping of the rotation across axes orthogonal to the slider.
     */
    SLIDER_JOINT_ANGULAR_ORTHOGONAL_DAMPING(21),
    /**
     * Represents the size of the [enum SliderJointParam] enum.
     */
    SLIDER_JOINT_MAX(22),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ConeTwistJointParam(
    id: Long,
  ) {
    /**
     * Swing is rotation from side to side, around the axis perpendicular to the twist axis.
     * The swing span defines, how much rotation will not get corrected along the swing axis.
     * Could be defined as looseness in the [ConeTwistJoint3D].
     * If below 0.05, this behavior is locked.
     */
    CONE_TWIST_JOINT_SWING_SPAN(0),
    /**
     * Twist is the rotation around the twist axis, this value defined how far the joint can twist.
     * Twist is locked if below 0.05.
     */
    CONE_TWIST_JOINT_TWIST_SPAN(1),
    /**
     * The speed with which the swing or twist will take place.
     * The higher, the faster.
     */
    CONE_TWIST_JOINT_BIAS(2),
    /**
     * The ease with which the Joint3D twists, if it's too low, it takes more force to twist the
     * joint.
     */
    CONE_TWIST_JOINT_SOFTNESS(3),
    /**
     * Defines, how fast the swing- and twist-speed-difference on both sides gets synced.
     */
    CONE_TWIST_JOINT_RELAXATION(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class G6DOFJointAxisParam(
    id: Long,
  ) {
    /**
     * The minimum difference between the pivot points' axes.
     */
    G6DOF_JOINT_LINEAR_LOWER_LIMIT(0),
    /**
     * The maximum difference between the pivot points' axes.
     */
    G6DOF_JOINT_LINEAR_UPPER_LIMIT(1),
    /**
     * A factor that gets applied to the movement across the axes. The lower, the slower the
     * movement.
     */
    G6DOF_JOINT_LINEAR_LIMIT_SOFTNESS(2),
    /**
     * The amount of restitution on the axes movement. The lower, the more velocity-energy gets
     * lost.
     */
    G6DOF_JOINT_LINEAR_RESTITUTION(3),
    /**
     * The amount of damping that happens at the linear motion across the axes.
     */
    G6DOF_JOINT_LINEAR_DAMPING(4),
    /**
     * The velocity that the joint's linear motor will attempt to reach.
     */
    G6DOF_JOINT_LINEAR_MOTOR_TARGET_VELOCITY(5),
    /**
     * The maximum force that the linear motor can apply while trying to reach the target velocity.
     */
    G6DOF_JOINT_LINEAR_MOTOR_FORCE_LIMIT(6),
    /**
     * The minimum rotation in negative direction to break loose and rotate around the axes.
     */
    G6DOF_JOINT_ANGULAR_LOWER_LIMIT(10),
    /**
     * The minimum rotation in positive direction to break loose and rotate around the axes.
     */
    G6DOF_JOINT_ANGULAR_UPPER_LIMIT(11),
    /**
     * A factor that gets multiplied onto all rotations across the axes.
     */
    G6DOF_JOINT_ANGULAR_LIMIT_SOFTNESS(12),
    /**
     * The amount of rotational damping across the axes. The lower, the more damping occurs.
     */
    G6DOF_JOINT_ANGULAR_DAMPING(13),
    /**
     * The amount of rotational restitution across the axes. The lower, the more restitution occurs.
     */
    G6DOF_JOINT_ANGULAR_RESTITUTION(14),
    /**
     * The maximum amount of force that can occur, when rotating around the axes.
     */
    G6DOF_JOINT_ANGULAR_FORCE_LIMIT(15),
    /**
     * When correcting the crossing of limits in rotation across the axes, this error tolerance
     * factor defines how much the correction gets slowed down. The lower, the slower.
     */
    G6DOF_JOINT_ANGULAR_ERP(16),
    /**
     * Target speed for the motor at the axes.
     */
    G6DOF_JOINT_ANGULAR_MOTOR_TARGET_VELOCITY(17),
    /**
     * Maximum acceleration for the motor at the axes.
     */
    G6DOF_JOINT_ANGULAR_MOTOR_FORCE_LIMIT(18),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class G6DOFJointAxisFlag(
    id: Long,
  ) {
    /**
     * If set, linear motion is possible within the given limits.
     */
    G6DOF_JOINT_FLAG_ENABLE_LINEAR_LIMIT(0),
    /**
     * If set, rotational motion is possible.
     */
    G6DOF_JOINT_FLAG_ENABLE_ANGULAR_LIMIT(1),
    /**
     * If set, there is a rotational motor across these axes.
     */
    G6DOF_JOINT_FLAG_ENABLE_MOTOR(4),
    /**
     * If set, there is a linear motor on this axis that targets a specific velocity.
     */
    G6DOF_JOINT_FLAG_ENABLE_LINEAR_MOTOR(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ShapeType(
    id: Long,
  ) {
    /**
     * The [Shape3D] is a [WorldBoundaryShape3D].
     */
    SHAPE_WORLD_BOUNDARY(0),
    /**
     * The [Shape3D] is a [SeparationRayShape3D].
     */
    SHAPE_SEPARATION_RAY(1),
    /**
     * The [Shape3D] is a [SphereShape3D].
     */
    SHAPE_SPHERE(2),
    /**
     * The [Shape3D] is a [BoxShape3D].
     */
    SHAPE_BOX(3),
    /**
     * The [Shape3D] is a [CapsuleShape3D].
     */
    SHAPE_CAPSULE(4),
    /**
     * The [Shape3D] is a [CylinderShape3D].
     */
    SHAPE_CYLINDER(5),
    /**
     * The [Shape3D] is a [ConvexPolygonShape3D].
     */
    SHAPE_CONVEX_POLYGON(6),
    /**
     * The [Shape3D] is a [ConcavePolygonShape3D].
     */
    SHAPE_CONCAVE_POLYGON(7),
    /**
     * The [Shape3D] is a [HeightMapShape3D].
     */
    SHAPE_HEIGHTMAP(8),
    /**
     * The [Shape3D] is used internally for a soft body. Any attempt to create this kind of shape
     * results in an error.
     */
    SHAPE_SOFT_BODY(9),
    /**
     * This constant is used internally by the engine. Any attempt to create this kind of shape
     * results in an error.
     */
    SHAPE_CUSTOM(10),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class AreaParameter(
    id: Long,
  ) {
    /**
     * Constant to set/get gravity override mode in an area. See [enum AreaSpaceOverrideMode] for
     * possible values.
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
     * Constant to set/get the distance at which the gravity strength is equal to the gravity
     * controlled by [constant AREA_PARAM_GRAVITY]. For example, on a planet 100 meters in radius with
     * a surface gravity of 4.0 m/s², set the gravity to 4.0 and the unit distance to 100.0. The
     * gravity will have falloff according to the inverse square law, so in the example, at 200 meters
     * from the center the gravity will be 1.0 m/s² (twice the distance, 1/4th the gravity), at 50
     * meters it will be 16.0 m/s² (half the distance, 4x the gravity), and so on.
     * The above is true only when the unit distance is a positive number. When this is set to 0.0,
     * the gravity will be constant regardless of distance.
     */
    AREA_PARAM_GRAVITY_POINT_UNIT_DISTANCE(4),
    /**
     * Constant to set/get linear damping override mode in an area. See [enum AreaSpaceOverrideMode]
     * for possible values.
     */
    AREA_PARAM_LINEAR_DAMP_OVERRIDE_MODE(5),
    /**
     * Constant to set/get the linear damping factor of an area.
     */
    AREA_PARAM_LINEAR_DAMP(6),
    /**
     * Constant to set/get angular damping override mode in an area. See [enum
     * AreaSpaceOverrideMode] for possible values.
     */
    AREA_PARAM_ANGULAR_DAMP_OVERRIDE_MODE(7),
    /**
     * Constant to set/get the angular damping factor of an area.
     */
    AREA_PARAM_ANGULAR_DAMP(8),
    /**
     * Constant to set/get the priority (order of processing) of an area.
     */
    AREA_PARAM_PRIORITY(9),
    /**
     * Constant to set/get the magnitude of area-specific wind force.
     */
    AREA_PARAM_WIND_FORCE_MAGNITUDE(10),
    /**
     * Constant to set/get the 3D vector that specifies the origin from which an area-specific wind
     * blows.
     */
    AREA_PARAM_WIND_SOURCE(11),
    /**
     * Constant to set/get the 3D vector that specifies the direction in which an area-specific wind
     * blows.
     */
    AREA_PARAM_WIND_DIRECTION(12),
    /**
     * Constant to set/get the exponential rate at which wind force decreases with distance from its
     * origin.
     */
    AREA_PARAM_WIND_ATTENUATION_FACTOR(13),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class AreaSpaceOverrideMode(
    id: Long,
  ) {
    /**
     * This area does not affect gravity/damp. These are generally areas that exist only to detect
     * collisions, and objects entering or exiting them.
     */
    AREA_SPACE_OVERRIDE_DISABLED(0),
    /**
     * This area adds its gravity/damp values to whatever has been calculated so far. This way, many
     * overlapping areas can combine their physics to make interesting effects.
     */
    AREA_SPACE_OVERRIDE_COMBINE(1),
    /**
     * This area adds its gravity/damp values to whatever has been calculated so far. Then stops
     * taking into account the rest of the areas, even the default one.
     */
    AREA_SPACE_OVERRIDE_COMBINE_REPLACE(2),
    /**
     * This area replaces any gravity/damp, even the default one, and stops taking into account the
     * rest of the areas.
     */
    AREA_SPACE_OVERRIDE_REPLACE(3),
    /**
     * This area replaces any gravity/damp calculated so far, but keeps calculating the rest of the
     * areas, down to the default one.
     */
    AREA_SPACE_OVERRIDE_REPLACE_COMBINE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class BodyMode(
    id: Long,
  ) {
    /**
     * Constant for static bodies. In this mode, a body can be only moved by user code and doesn't
     * collide with other bodies along its path when moved.
     */
    BODY_MODE_STATIC(0),
    /**
     * Constant for kinematic bodies. In this mode, a body can be only moved by user code and
     * collides with other bodies along its path.
     */
    BODY_MODE_KINEMATIC(1),
    /**
     * Constant for rigid bodies. In this mode, a body can be pushed by other bodies and has forces
     * applied.
     */
    BODY_MODE_RIGID(2),
    /**
     * Constant for linear rigid bodies. In this mode, a body can not rotate, and only its linear
     * velocity is affected by external forces.
     */
    BODY_MODE_RIGID_LINEAR(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class BodyParameter(
    id: Long,
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
     * Constant to set/get a body's linear damping mode. See [enum BodyDampMode] for possible
     * values.
     */
    BODY_PARAM_LINEAR_DAMP_MODE(6),
    /**
     * Constant to set/get a body's angular damping mode. See [enum BodyDampMode] for possible
     * values.
     */
    BODY_PARAM_ANGULAR_DAMP_MODE(7),
    /**
     * Constant to set/get a body's linear damping factor.
     */
    BODY_PARAM_LINEAR_DAMP(8),
    /**
     * Constant to set/get a body's angular damping factor.
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class AreaBodyStatus(
    id: Long,
  ) {
    /**
     * The value of the first parameter and area callback function receives, when an object enters
     * one of its shapes.
     */
    AREA_BODY_ADDED(0),
    /**
     * The value of the first parameter and area callback function receives, when an object exits
     * one of its shapes.
     */
    AREA_BODY_REMOVED(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SpaceParameter(
    id: Long,
  ) {
    /**
     * Constant to set/get the maximum distance a pair of bodies has to move before their collision
     * status has to be recalculated.
     */
    SPACE_PARAM_CONTACT_RECYCLE_RADIUS(0),
    /**
     * Constant to set/get the maximum distance a shape can be from another before they are
     * considered separated and the contact is discarded.
     */
    SPACE_PARAM_CONTACT_MAX_SEPARATION(1),
    /**
     * Constant to set/get the maximum distance a shape can penetrate another shape before it is
     * considered a collision.
     */
    SPACE_PARAM_CONTACT_MAX_ALLOWED_PENETRATION(2),
    /**
     * Constant to set/get the default solver bias for all physics contacts. A solver bias is a
     * factor controlling how much two objects "rebound", after overlapping, to avoid leaving them in
     * that state because of numerical imprecision.
     */
    SPACE_PARAM_CONTACT_DEFAULT_BIAS(3),
    /**
     * Constant to set/get the threshold linear velocity of activity. A body marked as potentially
     * inactive for both linear and angular velocity will be put to sleep after the time given.
     */
    SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD(4),
    /**
     * Constant to set/get the threshold angular velocity of activity. A body marked as potentially
     * inactive for both linear and angular velocity will be put to sleep after the time given.
     */
    SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD(5),
    /**
     * Constant to set/get the maximum time of activity. A body marked as potentially inactive for
     * both linear and angular velocity will be put to sleep after this time.
     */
    SPACE_PARAM_BODY_TIME_TO_SLEEP(6),
    /**
     * Constant to set/get the number of solver iterations for contacts and constraints. The greater
     * the number of iterations, the more accurate the collisions and constraints will be. However, a
     * greater number of iterations requires more CPU power, which can decrease performance.
     */
    SPACE_PARAM_SOLVER_ITERATIONS(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class BodyAxis(
    id: Long,
  ) {
    BODY_AXIS_LINEAR_X(1),
    BODY_AXIS_LINEAR_Y(2),
    BODY_AXIS_LINEAR_Z(4),
    BODY_AXIS_ANGULAR_X(8),
    BODY_AXIS_ANGULAR_Y(16),
    BODY_AXIS_ANGULAR_Z(32),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val worldBoundaryShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "world_boundary_shape_create")

    public val separationRayShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "separation_ray_shape_create")

    public val sphereShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "sphere_shape_create")

    public val boxShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "box_shape_create")

    public val capsuleShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "capsule_shape_create")

    public val cylinderShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "cylinder_shape_create")

    public val convexPolygonShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "convex_polygon_shape_create")

    public val concavePolygonShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "concave_polygon_shape_create")

    public val heightmapShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "heightmap_shape_create")

    public val customShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "custom_shape_create")

    public val shapeSetDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "shape_set_data")

    public val shapeGetTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "shape_get_type")

    public val shapeGetDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "shape_get_data")

    public val spaceCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "space_create")

    public val spaceSetActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "space_set_active")

    public val spaceIsActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "space_is_active")

    public val spaceSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "space_set_param")

    public val spaceGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "space_get_param")

    public val spaceGetDirectStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "space_get_direct_state")

    public val areaCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_create")

    public val areaSetSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_space")

    public val areaGetSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_space")

    public val areaAddShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_add_shape")

    public val areaSetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_shape")

    public val areaSetShapeTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_shape_transform")

    public val areaSetShapeDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_shape_disabled")

    public val areaGetShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_shape_count")

    public val areaGetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_shape")

    public val areaGetShapeTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_shape_transform")

    public val areaRemoveShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_remove_shape")

    public val areaClearShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_clear_shapes")

    public val areaSetCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_collision_layer")

    public val areaGetCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_collision_layer")

    public val areaSetCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_collision_mask")

    public val areaGetCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_collision_mask")

    public val areaSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_param")

    public val areaSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_transform")

    public val areaGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_param")

    public val areaGetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_transform")

    public val areaAttachObjectInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_attach_object_instance_id")

    public val areaGetObjectInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_object_instance_id")

    public val areaSetMonitorCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_monitor_callback")

    public val areaSetAreaMonitorCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_area_monitor_callback")

    public val areaSetMonitorablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_monitorable")

    public val areaSetRayPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_ray_pickable")

    public val bodyCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_create")

    public val bodySetSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_space")

    public val bodyGetSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_space")

    public val bodySetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_mode")

    public val bodyGetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_mode")

    public val bodySetCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_collision_layer")

    public val bodyGetCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_collision_layer")

    public val bodySetCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_collision_mask")

    public val bodyGetCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_collision_mask")

    public val bodySetCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_collision_priority")

    public val bodyGetCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_collision_priority")

    public val bodyAddShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_add_shape")

    public val bodySetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_shape")

    public val bodySetShapeTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_shape_transform")

    public val bodySetShapeDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_shape_disabled")

    public val bodyGetShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_shape_count")

    public val bodyGetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_shape")

    public val bodyGetShapeTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_shape_transform")

    public val bodyRemoveShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_remove_shape")

    public val bodyClearShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_clear_shapes")

    public val bodyAttachObjectInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_attach_object_instance_id")

    public val bodyGetObjectInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_object_instance_id")

    public val bodySetEnableContinuousCollisionDetectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_enable_continuous_collision_detection")

    public val bodyIsContinuousCollisionDetectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_is_continuous_collision_detection_enabled")

    public val bodySetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_param")

    public val bodyGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_param")

    public val bodyResetMassPropertiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_reset_mass_properties")

    public val bodySetStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_state")

    public val bodyGetStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_state")

    public val bodyApplyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_apply_central_impulse")

    public val bodyApplyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_apply_impulse")

    public val bodyApplyTorqueImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_apply_torque_impulse")

    public val bodyApplyCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_apply_central_force")

    public val bodyApplyForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_apply_force")

    public val bodyApplyTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_apply_torque")

    public val bodyAddConstantCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_add_constant_central_force")

    public val bodyAddConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_add_constant_force")

    public val bodyAddConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_add_constant_torque")

    public val bodySetConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_constant_force")

    public val bodyGetConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_constant_force")

    public val bodySetConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_constant_torque")

    public val bodyGetConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_constant_torque")

    public val bodySetAxisVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_axis_velocity")

    public val bodySetAxisLockPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_axis_lock")

    public val bodyIsAxisLockedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_is_axis_locked")

    public val bodyAddCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_add_collision_exception")

    public val bodyRemoveCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_remove_collision_exception")

    public val bodySetMaxContactsReportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_max_contacts_reported")

    public val bodyGetMaxContactsReportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_max_contacts_reported")

    public val bodySetOmitForceIntegrationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_omit_force_integration")

    public val bodyIsOmittingForceIntegrationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_is_omitting_force_integration")

    public val bodySetForceIntegrationCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_force_integration_callback")

    public val bodySetRayPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_ray_pickable")

    public val bodyTestMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_test_motion")

    public val bodyGetDirectStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_direct_state")

    public val softBodyGetBoundsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "soft_body_get_bounds")

    public val jointCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_create")

    public val jointClearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_clear")

    public val jointMakePinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_make_pin")

    public val pinJointSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "pin_joint_set_param")

    public val pinJointGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "pin_joint_get_param")

    public val pinJointSetLocalAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "pin_joint_set_local_a")

    public val pinJointGetLocalAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "pin_joint_get_local_a")

    public val pinJointSetLocalBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "pin_joint_set_local_b")

    public val pinJointGetLocalBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "pin_joint_get_local_b")

    public val jointMakeHingePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_make_hinge")

    public val hingeJointSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "hinge_joint_set_param")

    public val hingeJointGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "hinge_joint_get_param")

    public val hingeJointSetFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "hinge_joint_set_flag")

    public val hingeJointGetFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "hinge_joint_get_flag")

    public val jointMakeSliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_make_slider")

    public val sliderJointSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "slider_joint_set_param")

    public val sliderJointGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "slider_joint_get_param")

    public val jointMakeConeTwistPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_make_cone_twist")

    public val coneTwistJointSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "cone_twist_joint_set_param")

    public val coneTwistJointGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "cone_twist_joint_get_param")

    public val jointGetTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_get_type")

    public val jointSetSolverPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_set_solver_priority")

    public val jointGetSolverPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_get_solver_priority")

    public val jointDisableCollisionsBetweenBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_disable_collisions_between_bodies")

    public val jointIsDisabledCollisionsBetweenBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_is_disabled_collisions_between_bodies")

    public val jointMakeGeneric6dofPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_make_generic_6dof")

    public val generic6dofJointSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "generic_6dof_joint_set_param")

    public val generic6dofJointGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "generic_6dof_joint_get_param")

    public val generic6dofJointSetFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "generic_6dof_joint_set_flag")

    public val generic6dofJointGetFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "generic_6dof_joint_get_flag")

    public val freeRidPtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicsServer3D", "free_rid")

    public val setActivePtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicsServer3D", "set_active")

    public val getProcessInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "get_process_info")
  }
}
