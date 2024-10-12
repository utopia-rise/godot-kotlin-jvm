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
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser._RID
import godot.core.Vector3
import godot.util.Internals
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
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_PHYSICSSERVER3D_INDEX: Int = 36

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
  public override fun new(scriptIndex: Int): Unit {
    Internals.getSingleton(this, ENGINE_CLASS_PHYSICSSERVER3D_INDEX)
  }

  @JvmStatic
  public final fun worldBoundaryShapeCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.worldBoundaryShapeCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  @JvmStatic
  public final fun separationRayShapeCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.separationRayShapeCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  @JvmStatic
  public final fun sphereShapeCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.sphereShapeCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  @JvmStatic
  public final fun boxShapeCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.boxShapeCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  @JvmStatic
  public final fun capsuleShapeCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.capsuleShapeCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  @JvmStatic
  public final fun cylinderShapeCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.cylinderShapeCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  @JvmStatic
  public final fun convexPolygonShapeCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.convexPolygonShapeCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  @JvmStatic
  public final fun concavePolygonShapeCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.concavePolygonShapeCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  @JvmStatic
  public final fun heightmapShapeCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.heightmapShapeCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  @JvmStatic
  public final fun customShapeCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.customShapeCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Sets the shape data that defines its shape and size. The data to be passed depends on the kind
   * of shape created [shapeGetType].
   */
  @JvmStatic
  public final fun shapeSetData(shape: RID, `data`: Any?): Unit {
    Internals.writeArguments(_RID to shape, ANY to data)
    Internals.callMethod(rawPtr, MethodBindings.shapeSetDataPtr, NIL)
  }

  /**
   * Sets the collision margin for the shape.
   * **Note:** This is not used in Godot Physics.
   */
  @JvmStatic
  public final fun shapeSetMargin(shape: RID, margin: Float): Unit {
    Internals.writeArguments(_RID to shape, DOUBLE to margin.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.shapeSetMarginPtr, NIL)
  }

  /**
   * Returns the type of shape (see [ShapeType] constants).
   */
  @JvmStatic
  public final fun shapeGetType(shape: RID): ShapeType {
    Internals.writeArguments(_RID to shape)
    Internals.callMethod(rawPtr, MethodBindings.shapeGetTypePtr, LONG)
    return PhysicsServer3D.ShapeType.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the shape data.
   */
  @JvmStatic
  public final fun shapeGetData(shape: RID): Any? {
    Internals.writeArguments(_RID to shape)
    Internals.callMethod(rawPtr, MethodBindings.shapeGetDataPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns the collision margin for the shape.
   * **Note:** This is not used in Godot Physics, so will always return `0`.
   */
  @JvmStatic
  public final fun shapeGetMargin(shape: RID): Float {
    Internals.writeArguments(_RID to shape)
    Internals.callMethod(rawPtr, MethodBindings.shapeGetMarginPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Creates a space. A space is a collection of parameters for the physics engine that can be
   * assigned to an area or a body. It can be assigned to an area with [areaSetSpace], or to a body
   * with [bodySetSpace].
   */
  @JvmStatic
  public final fun spaceCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.spaceCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Marks a space as active. It will not have an effect, unless it is assigned to an area or body.
   */
  @JvmStatic
  public final fun spaceSetActive(space: RID, active: Boolean): Unit {
    Internals.writeArguments(_RID to space, BOOL to active)
    Internals.callMethod(rawPtr, MethodBindings.spaceSetActivePtr, NIL)
  }

  /**
   * Returns whether the space is active.
   */
  @JvmStatic
  public final fun spaceIsActive(space: RID): Boolean {
    Internals.writeArguments(_RID to space)
    Internals.callMethod(rawPtr, MethodBindings.spaceIsActivePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the value for a space parameter. A list of available parameters is on the [SpaceParameter]
   * constants.
   */
  @JvmStatic
  public final fun spaceSetParam(
    space: RID,
    `param`: SpaceParameter,
    `value`: Float,
  ): Unit {
    Internals.writeArguments(_RID to space, LONG to param.id, DOUBLE to value.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.spaceSetParamPtr, NIL)
  }

  /**
   * Returns the value of a space parameter.
   */
  @JvmStatic
  public final fun spaceGetParam(space: RID, `param`: SpaceParameter): Float {
    Internals.writeArguments(_RID to space, LONG to param.id)
    Internals.callMethod(rawPtr, MethodBindings.spaceGetParamPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the state of a space, a [PhysicsDirectSpaceState3D]. This object can be used to make
   * collision/intersection queries.
   */
  @JvmStatic
  public final fun spaceGetDirectState(space: RID): PhysicsDirectSpaceState3D? {
    Internals.writeArguments(_RID to space)
    Internals.callMethod(rawPtr, MethodBindings.spaceGetDirectStatePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as PhysicsDirectSpaceState3D?)
  }

  /**
   * Creates a 3D area object in the physics server, and returns the [RID] that identifies it. The
   * default settings for the created area include a collision layer and mask set to `1`, and
   * `monitorable` set to `false`.
   * Use [areaAddShape] to add shapes to it, use [areaSetTransform] to set its transform, and use
   * [areaSetSpace] to add the area to a space. If you want the area to be detectable use
   * [areaSetMonitorable].
   */
  @JvmStatic
  public final fun areaCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.areaCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Assigns a space to the area.
   */
  @JvmStatic
  public final fun areaSetSpace(area: RID, space: RID): Unit {
    Internals.writeArguments(_RID to area, _RID to space)
    Internals.callMethod(rawPtr, MethodBindings.areaSetSpacePtr, NIL)
  }

  /**
   * Returns the space assigned to the area.
   */
  @JvmStatic
  public final fun areaGetSpace(area: RID): RID {
    Internals.writeArguments(_RID to area)
    Internals.callMethod(rawPtr, MethodBindings.areaGetSpacePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Adds a shape to the area, along with a transform matrix. Shapes are usually referenced by their
   * index, so you should track which shape has a given index.
   */
  @JvmOverloads
  @JvmStatic
  public final fun areaAddShape(
    area: RID,
    shape: RID,
    transform: Transform3D = Transform3D(),
    disabled: Boolean = false,
  ): Unit {
    Internals.writeArguments(_RID to area, _RID to shape, TRANSFORM3D to transform, BOOL to disabled)
    Internals.callMethod(rawPtr, MethodBindings.areaAddShapePtr, NIL)
  }

  /**
   * Substitutes a given area shape by another. The old shape is selected by its index, the new one
   * by its [RID].
   */
  @JvmStatic
  public final fun areaSetShape(
    area: RID,
    shapeIdx: Int,
    shape: RID,
  ): Unit {
    Internals.writeArguments(_RID to area, LONG to shapeIdx.toLong(), _RID to shape)
    Internals.callMethod(rawPtr, MethodBindings.areaSetShapePtr, NIL)
  }

  /**
   * Sets the transform matrix for an area shape.
   */
  @JvmStatic
  public final fun areaSetShapeTransform(
    area: RID,
    shapeIdx: Int,
    transform: Transform3D,
  ): Unit {
    Internals.writeArguments(_RID to area, LONG to shapeIdx.toLong(), TRANSFORM3D to transform)
    Internals.callMethod(rawPtr, MethodBindings.areaSetShapeTransformPtr, NIL)
  }

  @JvmStatic
  public final fun areaSetShapeDisabled(
    area: RID,
    shapeIdx: Int,
    disabled: Boolean,
  ): Unit {
    Internals.writeArguments(_RID to area, LONG to shapeIdx.toLong(), BOOL to disabled)
    Internals.callMethod(rawPtr, MethodBindings.areaSetShapeDisabledPtr, NIL)
  }

  /**
   * Returns the number of shapes assigned to an area.
   */
  @JvmStatic
  public final fun areaGetShapeCount(area: RID): Int {
    Internals.writeArguments(_RID to area)
    Internals.callMethod(rawPtr, MethodBindings.areaGetShapeCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [RID] of the nth shape of an area.
   */
  @JvmStatic
  public final fun areaGetShape(area: RID, shapeIdx: Int): RID {
    Internals.writeArguments(_RID to area, LONG to shapeIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.areaGetShapePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the transform matrix of a shape within an area.
   */
  @JvmStatic
  public final fun areaGetShapeTransform(area: RID, shapeIdx: Int): Transform3D {
    Internals.writeArguments(_RID to area, LONG to shapeIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.areaGetShapeTransformPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Removes a shape from an area. It does not delete the shape, so it can be reassigned later.
   */
  @JvmStatic
  public final fun areaRemoveShape(area: RID, shapeIdx: Int): Unit {
    Internals.writeArguments(_RID to area, LONG to shapeIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.areaRemoveShapePtr, NIL)
  }

  /**
   * Removes all shapes from an area. It does not delete the shapes, so they can be reassigned
   * later.
   */
  @JvmStatic
  public final fun areaClearShapes(area: RID): Unit {
    Internals.writeArguments(_RID to area)
    Internals.callMethod(rawPtr, MethodBindings.areaClearShapesPtr, NIL)
  }

  /**
   * Assigns the area to one or many physics layers.
   */
  @JvmStatic
  public final fun areaSetCollisionLayer(area: RID, layer: Long): Unit {
    Internals.writeArguments(_RID to area, LONG to layer)
    Internals.callMethod(rawPtr, MethodBindings.areaSetCollisionLayerPtr, NIL)
  }

  /**
   * Returns the physics layer or layers an area belongs to.
   */
  @JvmStatic
  public final fun areaGetCollisionLayer(area: RID): Long {
    Internals.writeArguments(_RID to area)
    Internals.callMethod(rawPtr, MethodBindings.areaGetCollisionLayerPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets which physics layers the area will monitor.
   */
  @JvmStatic
  public final fun areaSetCollisionMask(area: RID, mask: Long): Unit {
    Internals.writeArguments(_RID to area, LONG to mask)
    Internals.callMethod(rawPtr, MethodBindings.areaSetCollisionMaskPtr, NIL)
  }

  /**
   * Returns the physics layer or layers an area can contact with.
   */
  @JvmStatic
  public final fun areaGetCollisionMask(area: RID): Long {
    Internals.writeArguments(_RID to area)
    Internals.callMethod(rawPtr, MethodBindings.areaGetCollisionMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the value for an area parameter. A list of available parameters is on the [AreaParameter]
   * constants.
   */
  @JvmStatic
  public final fun areaSetParam(
    area: RID,
    `param`: AreaParameter,
    `value`: Any?,
  ): Unit {
    Internals.writeArguments(_RID to area, LONG to param.id, ANY to value)
    Internals.callMethod(rawPtr, MethodBindings.areaSetParamPtr, NIL)
  }

  /**
   * Sets the transform matrix for an area.
   */
  @JvmStatic
  public final fun areaSetTransform(area: RID, transform: Transform3D): Unit {
    Internals.writeArguments(_RID to area, TRANSFORM3D to transform)
    Internals.callMethod(rawPtr, MethodBindings.areaSetTransformPtr, NIL)
  }

  /**
   * Returns an area parameter value. A list of available parameters is on the [AreaParameter]
   * constants.
   */
  @JvmStatic
  public final fun areaGetParam(area: RID, `param`: AreaParameter): Any? {
    Internals.writeArguments(_RID to area, LONG to param.id)
    Internals.callMethod(rawPtr, MethodBindings.areaGetParamPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns the transform matrix for an area.
   */
  @JvmStatic
  public final fun areaGetTransform(area: RID): Transform3D {
    Internals.writeArguments(_RID to area)
    Internals.callMethod(rawPtr, MethodBindings.areaGetTransformPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Assigns the area to a descendant of [Object], so it can exist in the node tree.
   */
  @JvmStatic
  public final fun areaAttachObjectInstanceId(area: RID, id: Long): Unit {
    Internals.writeArguments(_RID to area, LONG to id)
    Internals.callMethod(rawPtr, MethodBindings.areaAttachObjectInstanceIdPtr, NIL)
  }

  /**
   * Gets the instance ID of the object the area is assigned to.
   */
  @JvmStatic
  public final fun areaGetObjectInstanceId(area: RID): Long {
    Internals.writeArguments(_RID to area)
    Internals.callMethod(rawPtr, MethodBindings.areaGetObjectInstanceIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the area's body monitor callback. This callback will be called when any other (shape of a)
   * body enters or exits (a shape of) the given area, and must take the following five parameters:
   * 1. an integer `status`: either [AREA_BODY_ADDED] or [AREA_BODY_REMOVED] depending on whether
   * the other body shape entered or exited the area,
   * 2. an [RID] `body_rid`: the [RID] of the body that entered or exited the area,
   * 3. an integer `instance_id`: the `ObjectID` attached to the body,
   * 4. an integer `body_shape_idx`: the index of the shape of the body that entered or exited the
   * area,
   * 5. an integer `self_shape_idx`: the index of the shape of the area where the body entered or
   * exited.
   * By counting (or keeping track of) the shapes that enter and exit, it can be determined if a
   * body (with all its shapes) is entering for the first time or exiting for the last time.
   */
  @JvmStatic
  public final fun areaSetMonitorCallback(area: RID, callback: Callable): Unit {
    Internals.writeArguments(_RID to area, CALLABLE to callback)
    Internals.callMethod(rawPtr, MethodBindings.areaSetMonitorCallbackPtr, NIL)
  }

  /**
   * Sets the area's area monitor callback. This callback will be called when any other (shape of
   * an) area enters or exits (a shape of) the given area, and must take the following five parameters:
   * 1. an integer `status`: either [AREA_BODY_ADDED] or [AREA_BODY_REMOVED] depending on whether
   * the other area's shape entered or exited the area,
   * 2. an [RID] `area_rid`: the [RID] of the other area that entered or exited the area,
   * 3. an integer `instance_id`: the `ObjectID` attached to the other area,
   * 4. an integer `area_shape_idx`: the index of the shape of the other area that entered or exited
   * the area,
   * 5. an integer `self_shape_idx`: the index of the shape of the area where the other area entered
   * or exited.
   * By counting (or keeping track of) the shapes that enter and exit, it can be determined if an
   * area (with all its shapes) is entering for the first time or exiting for the last time.
   */
  @JvmStatic
  public final fun areaSetAreaMonitorCallback(area: RID, callback: Callable): Unit {
    Internals.writeArguments(_RID to area, CALLABLE to callback)
    Internals.callMethod(rawPtr, MethodBindings.areaSetAreaMonitorCallbackPtr, NIL)
  }

  @JvmStatic
  public final fun areaSetMonitorable(area: RID, monitorable: Boolean): Unit {
    Internals.writeArguments(_RID to area, BOOL to monitorable)
    Internals.callMethod(rawPtr, MethodBindings.areaSetMonitorablePtr, NIL)
  }

  /**
   * Sets object pickable with rays.
   */
  @JvmStatic
  public final fun areaSetRayPickable(area: RID, enable: Boolean): Unit {
    Internals.writeArguments(_RID to area, BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.areaSetRayPickablePtr, NIL)
  }

  /**
   * Creates a 3D body object in the physics server, and returns the [RID] that identifies it. The
   * default settings for the created area include a collision layer and mask set to `1`, and body mode
   * set to [BODY_MODE_RIGID].
   * Use [bodyAddShape] to add shapes to it, use [bodySetState] to set its transform, and use
   * [bodySetSpace] to add the body to a space.
   */
  @JvmStatic
  public final fun bodyCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.bodyCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Assigns a space to the body (see [spaceCreate]).
   */
  @JvmStatic
  public final fun bodySetSpace(body: RID, space: RID): Unit {
    Internals.writeArguments(_RID to body, _RID to space)
    Internals.callMethod(rawPtr, MethodBindings.bodySetSpacePtr, NIL)
  }

  /**
   * Returns the [RID] of the space assigned to a body.
   */
  @JvmStatic
  public final fun bodyGetSpace(body: RID): RID {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyGetSpacePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Sets the body mode, from one of the [BodyMode] constants.
   */
  @JvmStatic
  public final fun bodySetMode(body: RID, mode: BodyMode): Unit {
    Internals.writeArguments(_RID to body, LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.bodySetModePtr, NIL)
  }

  /**
   * Returns the body mode.
   */
  @JvmStatic
  public final fun bodyGetMode(body: RID): BodyMode {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyGetModePtr, LONG)
    return PhysicsServer3D.BodyMode.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the physics layer or layers a body belongs to.
   */
  @JvmStatic
  public final fun bodySetCollisionLayer(body: RID, layer: Long): Unit {
    Internals.writeArguments(_RID to body, LONG to layer)
    Internals.callMethod(rawPtr, MethodBindings.bodySetCollisionLayerPtr, NIL)
  }

  /**
   * Returns the physics layer or layers a body belongs to.
   */
  @JvmStatic
  public final fun bodyGetCollisionLayer(body: RID): Long {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyGetCollisionLayerPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the physics layer or layers a body can collide with.
   */
  @JvmStatic
  public final fun bodySetCollisionMask(body: RID, mask: Long): Unit {
    Internals.writeArguments(_RID to body, LONG to mask)
    Internals.callMethod(rawPtr, MethodBindings.bodySetCollisionMaskPtr, NIL)
  }

  /**
   * Returns the physics layer or layers a body can collide with.
   */
  @JvmStatic
  public final fun bodyGetCollisionMask(body: RID): Long {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyGetCollisionMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the body's collision priority.
   */
  @JvmStatic
  public final fun bodySetCollisionPriority(body: RID, priority: Float): Unit {
    Internals.writeArguments(_RID to body, DOUBLE to priority.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.bodySetCollisionPriorityPtr, NIL)
  }

  /**
   * Returns the body's collision priority.
   */
  @JvmStatic
  public final fun bodyGetCollisionPriority(body: RID): Float {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyGetCollisionPriorityPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Adds a shape to the body, along with a transform matrix. Shapes are usually referenced by their
   * index, so you should track which shape has a given index.
   */
  @JvmOverloads
  @JvmStatic
  public final fun bodyAddShape(
    body: RID,
    shape: RID,
    transform: Transform3D = Transform3D(),
    disabled: Boolean = false,
  ): Unit {
    Internals.writeArguments(_RID to body, _RID to shape, TRANSFORM3D to transform, BOOL to disabled)
    Internals.callMethod(rawPtr, MethodBindings.bodyAddShapePtr, NIL)
  }

  /**
   * Substitutes a given body shape by another. The old shape is selected by its index, the new one
   * by its [RID].
   */
  @JvmStatic
  public final fun bodySetShape(
    body: RID,
    shapeIdx: Int,
    shape: RID,
  ): Unit {
    Internals.writeArguments(_RID to body, LONG to shapeIdx.toLong(), _RID to shape)
    Internals.callMethod(rawPtr, MethodBindings.bodySetShapePtr, NIL)
  }

  /**
   * Sets the transform matrix for a body shape.
   */
  @JvmStatic
  public final fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Int,
    transform: Transform3D,
  ): Unit {
    Internals.writeArguments(_RID to body, LONG to shapeIdx.toLong(), TRANSFORM3D to transform)
    Internals.callMethod(rawPtr, MethodBindings.bodySetShapeTransformPtr, NIL)
  }

  @JvmStatic
  public final fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Int,
    disabled: Boolean,
  ): Unit {
    Internals.writeArguments(_RID to body, LONG to shapeIdx.toLong(), BOOL to disabled)
    Internals.callMethod(rawPtr, MethodBindings.bodySetShapeDisabledPtr, NIL)
  }

  /**
   * Returns the number of shapes assigned to a body.
   */
  @JvmStatic
  public final fun bodyGetShapeCount(body: RID): Int {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyGetShapeCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [RID] of the nth shape of a body.
   */
  @JvmStatic
  public final fun bodyGetShape(body: RID, shapeIdx: Int): RID {
    Internals.writeArguments(_RID to body, LONG to shapeIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.bodyGetShapePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the transform matrix of a body shape.
   */
  @JvmStatic
  public final fun bodyGetShapeTransform(body: RID, shapeIdx: Int): Transform3D {
    Internals.writeArguments(_RID to body, LONG to shapeIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.bodyGetShapeTransformPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Removes a shape from a body. The shape is not deleted, so it can be reused afterwards.
   */
  @JvmStatic
  public final fun bodyRemoveShape(body: RID, shapeIdx: Int): Unit {
    Internals.writeArguments(_RID to body, LONG to shapeIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.bodyRemoveShapePtr, NIL)
  }

  /**
   * Removes all shapes from a body.
   */
  @JvmStatic
  public final fun bodyClearShapes(body: RID): Unit {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyClearShapesPtr, NIL)
  }

  /**
   * Assigns the area to a descendant of [Object], so it can exist in the node tree.
   */
  @JvmStatic
  public final fun bodyAttachObjectInstanceId(body: RID, id: Long): Unit {
    Internals.writeArguments(_RID to body, LONG to id)
    Internals.callMethod(rawPtr, MethodBindings.bodyAttachObjectInstanceIdPtr, NIL)
  }

  /**
   * Gets the instance ID of the object the area is assigned to.
   */
  @JvmStatic
  public final fun bodyGetObjectInstanceId(body: RID): Long {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyGetObjectInstanceIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * If `true`, the continuous collision detection mode is enabled.
   * Continuous collision detection tries to predict where a moving body will collide, instead of
   * moving it and correcting its movement if it collided.
   */
  @JvmStatic
  public final fun bodySetEnableContinuousCollisionDetection(body: RID, enable: Boolean): Unit {
    Internals.writeArguments(_RID to body, BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.bodySetEnableContinuousCollisionDetectionPtr, NIL)
  }

  /**
   * If `true`, the continuous collision detection mode is enabled.
   */
  @JvmStatic
  public final fun bodyIsContinuousCollisionDetectionEnabled(body: RID): Boolean {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyIsContinuousCollisionDetectionEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets a body parameter. A list of available parameters is on the [BodyParameter] constants.
   */
  @JvmStatic
  public final fun bodySetParam(
    body: RID,
    `param`: BodyParameter,
    `value`: Any?,
  ): Unit {
    Internals.writeArguments(_RID to body, LONG to param.id, ANY to value)
    Internals.callMethod(rawPtr, MethodBindings.bodySetParamPtr, NIL)
  }

  /**
   * Returns the value of a body parameter. A list of available parameters is on the [BodyParameter]
   * constants.
   */
  @JvmStatic
  public final fun bodyGetParam(body: RID, `param`: BodyParameter): Any? {
    Internals.writeArguments(_RID to body, LONG to param.id)
    Internals.callMethod(rawPtr, MethodBindings.bodyGetParamPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Restores the default inertia and center of mass based on shapes to cancel any custom values
   * previously set using [bodySetParam].
   */
  @JvmStatic
  public final fun bodyResetMassProperties(body: RID): Unit {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyResetMassPropertiesPtr, NIL)
  }

  /**
   * Sets a body state (see [BodyState] constants).
   */
  @JvmStatic
  public final fun bodySetState(
    body: RID,
    state: BodyState,
    `value`: Any?,
  ): Unit {
    Internals.writeArguments(_RID to body, LONG to state.id, ANY to value)
    Internals.callMethod(rawPtr, MethodBindings.bodySetStatePtr, NIL)
  }

  /**
   * Returns a body state.
   */
  @JvmStatic
  public final fun bodyGetState(body: RID, state: BodyState): Any? {
    Internals.writeArguments(_RID to body, LONG to state.id)
    Internals.callMethod(rawPtr, MethodBindings.bodyGetStatePtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Applies a directional impulse without affecting rotation.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   * This is equivalent to using [bodyApplyImpulse] at the body's center of mass.
   */
  @JvmStatic
  public final fun bodyApplyCentralImpulse(body: RID, impulse: Vector3): Unit {
    Internals.writeArguments(_RID to body, VECTOR3 to impulse)
    Internals.callMethod(rawPtr, MethodBindings.bodyApplyCentralImpulsePtr, NIL)
  }

  /**
   * Applies a positioned impulse to the body.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  @JvmStatic
  public final fun bodyApplyImpulse(
    body: RID,
    impulse: Vector3,
    position: Vector3 = Vector3(0, 0, 0),
  ): Unit {
    Internals.writeArguments(_RID to body, VECTOR3 to impulse, VECTOR3 to position)
    Internals.callMethod(rawPtr, MethodBindings.bodyApplyImpulsePtr, NIL)
  }

  /**
   * Applies a rotational impulse to the body without affecting the position.
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   */
  @JvmStatic
  public final fun bodyApplyTorqueImpulse(body: RID, impulse: Vector3): Unit {
    Internals.writeArguments(_RID to body, VECTOR3 to impulse)
    Internals.callMethod(rawPtr, MethodBindings.bodyApplyTorqueImpulsePtr, NIL)
  }

  /**
   * Applies a directional force without affecting rotation. A force is time dependent and meant to
   * be applied every physics update.
   * This is equivalent to using [bodyApplyForce] at the body's center of mass.
   */
  @JvmStatic
  public final fun bodyApplyCentralForce(body: RID, force: Vector3): Unit {
    Internals.writeArguments(_RID to body, VECTOR3 to force)
    Internals.callMethod(rawPtr, MethodBindings.bodyApplyCentralForcePtr, NIL)
  }

  /**
   * Applies a positioned force to the body. A force is time dependent and meant to be applied every
   * physics update.
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  @JvmStatic
  public final fun bodyApplyForce(
    body: RID,
    force: Vector3,
    position: Vector3 = Vector3(0, 0, 0),
  ): Unit {
    Internals.writeArguments(_RID to body, VECTOR3 to force, VECTOR3 to position)
    Internals.callMethod(rawPtr, MethodBindings.bodyApplyForcePtr, NIL)
  }

  /**
   * Applies a rotational force without affecting position. A force is time dependent and meant to
   * be applied every physics update.
   */
  @JvmStatic
  public final fun bodyApplyTorque(body: RID, torque: Vector3): Unit {
    Internals.writeArguments(_RID to body, VECTOR3 to torque)
    Internals.callMethod(rawPtr, MethodBindings.bodyApplyTorquePtr, NIL)
  }

  /**
   * Adds a constant directional force without affecting rotation that keeps being applied over time
   * until cleared with `body_set_constant_force(body, Vector3(0, 0, 0))`.
   * This is equivalent to using [bodyAddConstantForce] at the body's center of mass.
   */
  @JvmStatic
  public final fun bodyAddConstantCentralForce(body: RID, force: Vector3): Unit {
    Internals.writeArguments(_RID to body, VECTOR3 to force)
    Internals.callMethod(rawPtr, MethodBindings.bodyAddConstantCentralForcePtr, NIL)
  }

  /**
   * Adds a constant positioned force to the body that keeps being applied over time until cleared
   * with `body_set_constant_force(body, Vector3(0, 0, 0))`.
   * [position] is the offset from the body origin in global coordinates.
   */
  @JvmOverloads
  @JvmStatic
  public final fun bodyAddConstantForce(
    body: RID,
    force: Vector3,
    position: Vector3 = Vector3(0, 0, 0),
  ): Unit {
    Internals.writeArguments(_RID to body, VECTOR3 to force, VECTOR3 to position)
    Internals.callMethod(rawPtr, MethodBindings.bodyAddConstantForcePtr, NIL)
  }

  /**
   * Adds a constant rotational force without affecting position that keeps being applied over time
   * until cleared with `body_set_constant_torque(body, Vector3(0, 0, 0))`.
   */
  @JvmStatic
  public final fun bodyAddConstantTorque(body: RID, torque: Vector3): Unit {
    Internals.writeArguments(_RID to body, VECTOR3 to torque)
    Internals.callMethod(rawPtr, MethodBindings.bodyAddConstantTorquePtr, NIL)
  }

  /**
   * Sets the body's total constant positional forces applied during each physics update.
   * See [bodyAddConstantForce] and [bodyAddConstantCentralForce].
   */
  @JvmStatic
  public final fun bodySetConstantForce(body: RID, force: Vector3): Unit {
    Internals.writeArguments(_RID to body, VECTOR3 to force)
    Internals.callMethod(rawPtr, MethodBindings.bodySetConstantForcePtr, NIL)
  }

  /**
   * Returns the body's total constant positional forces applied during each physics update.
   * See [bodyAddConstantForce] and [bodyAddConstantCentralForce].
   */
  @JvmStatic
  public final fun bodyGetConstantForce(body: RID): Vector3 {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyGetConstantForcePtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the body's total constant rotational forces applied during each physics update.
   * See [bodyAddConstantTorque].
   */
  @JvmStatic
  public final fun bodySetConstantTorque(body: RID, torque: Vector3): Unit {
    Internals.writeArguments(_RID to body, VECTOR3 to torque)
    Internals.callMethod(rawPtr, MethodBindings.bodySetConstantTorquePtr, NIL)
  }

  /**
   * Returns the body's total constant rotational forces applied during each physics update.
   * See [bodyAddConstantTorque].
   */
  @JvmStatic
  public final fun bodyGetConstantTorque(body: RID): Vector3 {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyGetConstantTorquePtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets an axis velocity. The velocity in the given vector axis will be set as the given vector
   * length. This is useful for jumping behavior.
   */
  @JvmStatic
  public final fun bodySetAxisVelocity(body: RID, axisVelocity: Vector3): Unit {
    Internals.writeArguments(_RID to body, VECTOR3 to axisVelocity)
    Internals.callMethod(rawPtr, MethodBindings.bodySetAxisVelocityPtr, NIL)
  }

  @JvmStatic
  public final fun bodySetAxisLock(
    body: RID,
    axis: BodyAxis,
    lock: Boolean,
  ): Unit {
    Internals.writeArguments(_RID to body, LONG to axis.id, BOOL to lock)
    Internals.callMethod(rawPtr, MethodBindings.bodySetAxisLockPtr, NIL)
  }

  @JvmStatic
  public final fun bodyIsAxisLocked(body: RID, axis: BodyAxis): Boolean {
    Internals.writeArguments(_RID to body, LONG to axis.id)
    Internals.callMethod(rawPtr, MethodBindings.bodyIsAxisLockedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a body to the list of bodies exempt from collisions.
   */
  @JvmStatic
  public final fun bodyAddCollisionException(body: RID, exceptedBody: RID): Unit {
    Internals.writeArguments(_RID to body, _RID to exceptedBody)
    Internals.callMethod(rawPtr, MethodBindings.bodyAddCollisionExceptionPtr, NIL)
  }

  /**
   * Removes a body from the list of bodies exempt from collisions.
   * Continuous collision detection tries to predict where a moving body will collide, instead of
   * moving it and correcting its movement if it collided.
   */
  @JvmStatic
  public final fun bodyRemoveCollisionException(body: RID, exceptedBody: RID): Unit {
    Internals.writeArguments(_RID to body, _RID to exceptedBody)
    Internals.callMethod(rawPtr, MethodBindings.bodyRemoveCollisionExceptionPtr, NIL)
  }

  /**
   * Sets the maximum contacts to report. Bodies can keep a log of the contacts with other bodies.
   * This is enabled by setting the maximum number of contacts reported to a number greater than 0.
   */
  @JvmStatic
  public final fun bodySetMaxContactsReported(body: RID, amount: Int): Unit {
    Internals.writeArguments(_RID to body, LONG to amount.toLong())
    Internals.callMethod(rawPtr, MethodBindings.bodySetMaxContactsReportedPtr, NIL)
  }

  /**
   * Returns the maximum contacts that can be reported. See [bodySetMaxContactsReported].
   */
  @JvmStatic
  public final fun bodyGetMaxContactsReported(body: RID): Int {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyGetMaxContactsReportedPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets whether the body omits the standard force integration. If [enable] is `true`, the body
   * will not automatically use applied forces, torques, and damping to update the body's linear and
   * angular velocity. In this case, [bodySetForceIntegrationCallback] can be used to manually update
   * the linear and angular velocity instead.
   * This method is called when the property [RigidBody3D.customIntegrator] is set.
   */
  @JvmStatic
  public final fun bodySetOmitForceIntegration(body: RID, enable: Boolean): Unit {
    Internals.writeArguments(_RID to body, BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.bodySetOmitForceIntegrationPtr, NIL)
  }

  /**
   * Returns `true` if the body is omitting the standard force integration. See
   * [bodySetOmitForceIntegration].
   */
  @JvmStatic
  public final fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyIsOmittingForceIntegrationPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the body's state synchronization callback function to [callable]. Use an empty [Callable]
   * ([code skip-lint]Callable()[/code]) to clear the callback.
   * The function [callable] will be called every physics frame, assuming that the body was active
   * during the previous physics tick, and can be used to fetch the latest state from the physics
   * server.
   * The function [callable] must take the following parameters:
   * 1. `state`: a [PhysicsDirectBodyState3D], used to retrieve the body's state.
   */
  @JvmStatic
  public final fun bodySetStateSyncCallback(body: RID, callable: Callable): Unit {
    Internals.writeArguments(_RID to body, CALLABLE to callable)
    Internals.callMethod(rawPtr, MethodBindings.bodySetStateSyncCallbackPtr, NIL)
  }

  /**
   * Sets the body's custom force integration callback function to [callable]. Use an empty
   * [Callable] ([code skip-lint]Callable()[/code]) to clear the custom callback.
   * The function [callable] will be called every physics tick, before the standard force
   * integration (see [bodySetOmitForceIntegration]). It can be used for example to update the body's
   * linear and angular velocity based on contact with other bodies.
   * If [userdata] is not `null`, the function [callable] must take the following two parameters:
   * 1. `state`: a [PhysicsDirectBodyState3D], used to retrieve and modify the body's state,
   * 2. [code skip-lint]userdata[/code]: a [Variant]; its value will be the [userdata] passed into
   * this method.
   * If [userdata] is `null`, then [callable] must take only the `state` parameter.
   */
  @JvmOverloads
  @JvmStatic
  public final fun bodySetForceIntegrationCallback(
    body: RID,
    callable: Callable,
    userdata: Any? = null,
  ): Unit {
    Internals.writeArguments(_RID to body, CALLABLE to callable, ANY to userdata)
    Internals.callMethod(rawPtr, MethodBindings.bodySetForceIntegrationCallbackPtr, NIL)
  }

  /**
   * Sets the body pickable with rays if [enable] is set.
   */
  @JvmStatic
  public final fun bodySetRayPickable(body: RID, enable: Boolean): Unit {
    Internals.writeArguments(_RID to body, BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.bodySetRayPickablePtr, NIL)
  }

  /**
   * Returns `true` if a collision would result from moving along a motion vector from a given point
   * in space. [PhysicsTestMotionParameters3D] is passed to set motion parameters.
   * [PhysicsTestMotionResult3D] can be passed to return additional information.
   */
  @JvmOverloads
  @JvmStatic
  public final fun bodyTestMotion(
    body: RID,
    parameters: PhysicsTestMotionParameters3D?,
    result: PhysicsTestMotionResult3D? = null,
  ): Boolean {
    Internals.writeArguments(_RID to body, OBJECT to parameters, OBJECT to result)
    Internals.callMethod(rawPtr, MethodBindings.bodyTestMotionPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [PhysicsDirectBodyState3D] of the body. Returns `null` if the body is destroyed or
   * removed from the physics space.
   */
  @JvmStatic
  public final fun bodyGetDirectState(body: RID): PhysicsDirectBodyState3D? {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.bodyGetDirectStatePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as PhysicsDirectBodyState3D?)
  }

  /**
   * Creates a new soft body and returns its internal [RID].
   */
  @JvmStatic
  public final fun softBodyCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.softBodyCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Requests that the physics server updates the rendering server with the latest positions of the
   * given soft body's points through the [renderingServerHandler] interface.
   */
  @JvmStatic
  public final fun softBodyUpdateRenderingServer(body: RID,
      renderingServerHandler: PhysicsServer3DRenderingServerHandler?): Unit {
    Internals.writeArguments(_RID to body, OBJECT to renderingServerHandler)
    Internals.callMethod(rawPtr, MethodBindings.softBodyUpdateRenderingServerPtr, NIL)
  }

  /**
   * Assigns a space to the given soft body (see [spaceCreate]).
   */
  @JvmStatic
  public final fun softBodySetSpace(body: RID, space: RID): Unit {
    Internals.writeArguments(_RID to body, _RID to space)
    Internals.callMethod(rawPtr, MethodBindings.softBodySetSpacePtr, NIL)
  }

  /**
   * Returns the [RID] of the space assigned to the given soft body.
   */
  @JvmStatic
  public final fun softBodyGetSpace(body: RID): RID {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.softBodyGetSpacePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Sets the mesh of the given soft body.
   */
  @JvmStatic
  public final fun softBodySetMesh(body: RID, mesh: RID): Unit {
    Internals.writeArguments(_RID to body, _RID to mesh)
    Internals.callMethod(rawPtr, MethodBindings.softBodySetMeshPtr, NIL)
  }

  /**
   * Returns the bounds of the given soft body in global coordinates.
   */
  @JvmStatic
  public final fun softBodyGetBounds(body: RID): AABB {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.softBodyGetBoundsPtr, godot.core.VariantParser.AABB)
    return (Internals.readReturnValue(godot.core.VariantParser.AABB) as AABB)
  }

  /**
   * Sets the physics layer or layers the given soft body belongs to.
   */
  @JvmStatic
  public final fun softBodySetCollisionLayer(body: RID, layer: Long): Unit {
    Internals.writeArguments(_RID to body, LONG to layer)
    Internals.callMethod(rawPtr, MethodBindings.softBodySetCollisionLayerPtr, NIL)
  }

  /**
   * Returns the physics layer or layers that the given soft body belongs to.
   */
  @JvmStatic
  public final fun softBodyGetCollisionLayer(body: RID): Long {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.softBodyGetCollisionLayerPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the physics layer or layers the given soft body can collide with.
   */
  @JvmStatic
  public final fun softBodySetCollisionMask(body: RID, mask: Long): Unit {
    Internals.writeArguments(_RID to body, LONG to mask)
    Internals.callMethod(rawPtr, MethodBindings.softBodySetCollisionMaskPtr, NIL)
  }

  /**
   * Returns the physics layer or layers that the given soft body can collide with.
   */
  @JvmStatic
  public final fun softBodyGetCollisionMask(body: RID): Long {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.softBodyGetCollisionMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Adds the given body to the list of bodies exempt from collisions.
   */
  @JvmStatic
  public final fun softBodyAddCollisionException(body: RID, bodyB: RID): Unit {
    Internals.writeArguments(_RID to body, _RID to bodyB)
    Internals.callMethod(rawPtr, MethodBindings.softBodyAddCollisionExceptionPtr, NIL)
  }

  /**
   * Removes the given body from the list of bodies exempt from collisions.
   */
  @JvmStatic
  public final fun softBodyRemoveCollisionException(body: RID, bodyB: RID): Unit {
    Internals.writeArguments(_RID to body, _RID to bodyB)
    Internals.callMethod(rawPtr, MethodBindings.softBodyRemoveCollisionExceptionPtr, NIL)
  }

  /**
   * Sets the given body state for the given body (see [BodyState] constants).
   * **Note:** Godot's default physics implementation does not support [BODY_STATE_LINEAR_VELOCITY],
   * [BODY_STATE_ANGULAR_VELOCITY], [BODY_STATE_SLEEPING], or [BODY_STATE_CAN_SLEEP].
   */
  @JvmStatic
  public final fun softBodySetState(
    body: RID,
    state: BodyState,
    variant: Any?,
  ): Unit {
    Internals.writeArguments(_RID to body, LONG to state.id, ANY to variant)
    Internals.callMethod(rawPtr, MethodBindings.softBodySetStatePtr, NIL)
  }

  /**
   * Returns the given soft body state (see [BodyState] constants).
   * **Note:** Godot's default physics implementation does not support [BODY_STATE_LINEAR_VELOCITY],
   * [BODY_STATE_ANGULAR_VELOCITY], [BODY_STATE_SLEEPING], or [BODY_STATE_CAN_SLEEP].
   */
  @JvmStatic
  public final fun softBodyGetState(body: RID, state: BodyState): Any? {
    Internals.writeArguments(_RID to body, LONG to state.id)
    Internals.callMethod(rawPtr, MethodBindings.softBodyGetStatePtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Sets the global transform of the given soft body.
   */
  @JvmStatic
  public final fun softBodySetTransform(body: RID, transform: Transform3D): Unit {
    Internals.writeArguments(_RID to body, TRANSFORM3D to transform)
    Internals.callMethod(rawPtr, MethodBindings.softBodySetTransformPtr, NIL)
  }

  /**
   * Sets whether the given soft body will be pickable when using object picking.
   */
  @JvmStatic
  public final fun softBodySetRayPickable(body: RID, enable: Boolean): Unit {
    Internals.writeArguments(_RID to body, BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.softBodySetRayPickablePtr, NIL)
  }

  /**
   * Sets the simulation precision of the given soft body. Increasing this value will improve the
   * resulting simulation, but can affect performance. Use with care.
   */
  @JvmStatic
  public final fun softBodySetSimulationPrecision(body: RID, simulationPrecision: Int): Unit {
    Internals.writeArguments(_RID to body, LONG to simulationPrecision.toLong())
    Internals.callMethod(rawPtr, MethodBindings.softBodySetSimulationPrecisionPtr, NIL)
  }

  /**
   * Returns the simulation precision of the given soft body.
   */
  @JvmStatic
  public final fun softBodyGetSimulationPrecision(body: RID): Int {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.softBodyGetSimulationPrecisionPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the total mass for the given soft body.
   */
  @JvmStatic
  public final fun softBodySetTotalMass(body: RID, totalMass: Float): Unit {
    Internals.writeArguments(_RID to body, DOUBLE to totalMass.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.softBodySetTotalMassPtr, NIL)
  }

  /**
   * Returns the total mass assigned to the given soft body.
   */
  @JvmStatic
  public final fun softBodyGetTotalMass(body: RID): Float {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.softBodyGetTotalMassPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the linear stiffness of the given soft body. Higher values will result in a stiffer body,
   * while lower values will increase the body's ability to bend. The value can be between `0.0` and
   * `1.0` (inclusive).
   */
  @JvmStatic
  public final fun softBodySetLinearStiffness(body: RID, stiffness: Float): Unit {
    Internals.writeArguments(_RID to body, DOUBLE to stiffness.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.softBodySetLinearStiffnessPtr, NIL)
  }

  /**
   * Returns the linear stiffness of the given soft body.
   */
  @JvmStatic
  public final fun softBodyGetLinearStiffness(body: RID): Float {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.softBodyGetLinearStiffnessPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the pressure coefficient of the given soft body. Simulates pressure build-up from inside
   * this body. Higher values increase the strength of this effect.
   */
  @JvmStatic
  public final fun softBodySetPressureCoefficient(body: RID, pressureCoefficient: Float): Unit {
    Internals.writeArguments(_RID to body, DOUBLE to pressureCoefficient.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.softBodySetPressureCoefficientPtr, NIL)
  }

  /**
   * Returns the pressure coefficient of the given soft body.
   */
  @JvmStatic
  public final fun softBodyGetPressureCoefficient(body: RID): Float {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.softBodyGetPressureCoefficientPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the damping coefficient of the given soft body. Higher values will slow down the body more
   * noticeably when forces are applied.
   */
  @JvmStatic
  public final fun softBodySetDampingCoefficient(body: RID, dampingCoefficient: Float): Unit {
    Internals.writeArguments(_RID to body, DOUBLE to dampingCoefficient.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.softBodySetDampingCoefficientPtr, NIL)
  }

  /**
   * Returns the damping coefficient of the given soft body.
   */
  @JvmStatic
  public final fun softBodyGetDampingCoefficient(body: RID): Float {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.softBodyGetDampingCoefficientPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the drag coefficient of the given soft body. Higher values increase this body's air
   * resistance.
   * **Note:** This value is currently unused by Godot's default physics implementation.
   */
  @JvmStatic
  public final fun softBodySetDragCoefficient(body: RID, dragCoefficient: Float): Unit {
    Internals.writeArguments(_RID to body, DOUBLE to dragCoefficient.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.softBodySetDragCoefficientPtr, NIL)
  }

  /**
   * Returns the drag coefficient of the given soft body.
   */
  @JvmStatic
  public final fun softBodyGetDragCoefficient(body: RID): Float {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.softBodyGetDragCoefficientPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Moves the given soft body point to a position in global coordinates.
   */
  @JvmStatic
  public final fun softBodyMovePoint(
    body: RID,
    pointIndex: Int,
    globalPosition: Vector3,
  ): Unit {
    Internals.writeArguments(_RID to body, LONG to pointIndex.toLong(), VECTOR3 to globalPosition)
    Internals.callMethod(rawPtr, MethodBindings.softBodyMovePointPtr, NIL)
  }

  /**
   * Returns the current position of the given soft body point in global coordinates.
   */
  @JvmStatic
  public final fun softBodyGetPointGlobalPosition(body: RID, pointIndex: Int): Vector3 {
    Internals.writeArguments(_RID to body, LONG to pointIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.softBodyGetPointGlobalPositionPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Unpins all points of the given soft body.
   */
  @JvmStatic
  public final fun softBodyRemoveAllPinnedPoints(body: RID): Unit {
    Internals.writeArguments(_RID to body)
    Internals.callMethod(rawPtr, MethodBindings.softBodyRemoveAllPinnedPointsPtr, NIL)
  }

  /**
   * Pins or unpins the given soft body point based on the value of [pin].
   * **Note:** Pinning a point effectively makes it kinematic, preventing it from being affected by
   * forces, but you can still move it using [softBodyMovePoint].
   */
  @JvmStatic
  public final fun softBodyPinPoint(
    body: RID,
    pointIndex: Int,
    pin: Boolean,
  ): Unit {
    Internals.writeArguments(_RID to body, LONG to pointIndex.toLong(), BOOL to pin)
    Internals.callMethod(rawPtr, MethodBindings.softBodyPinPointPtr, NIL)
  }

  /**
   * Returns whether the given soft body point is pinned.
   */
  @JvmStatic
  public final fun softBodyIsPointPinned(body: RID, pointIndex: Int): Boolean {
    Internals.writeArguments(_RID to body, LONG to pointIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.softBodyIsPointPinnedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  @JvmStatic
  public final fun jointCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.jointCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  @JvmStatic
  public final fun jointClear(joint: RID): Unit {
    Internals.writeArguments(_RID to joint)
    Internals.callMethod(rawPtr, MethodBindings.jointClearPtr, NIL)
  }

  @JvmStatic
  public final fun jointMakePin(
    joint: RID,
    bodyA: RID,
    localA: Vector3,
    bodyB: RID,
    localB: Vector3,
  ): Unit {
    Internals.writeArguments(_RID to joint, _RID to bodyA, VECTOR3 to localA, _RID to bodyB, VECTOR3 to localB)
    Internals.callMethod(rawPtr, MethodBindings.jointMakePinPtr, NIL)
  }

  /**
   * Sets a pin_joint parameter (see [PinJointParam] constants).
   */
  @JvmStatic
  public final fun pinJointSetParam(
    joint: RID,
    `param`: PinJointParam,
    `value`: Float,
  ): Unit {
    Internals.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.pinJointSetParamPtr, NIL)
  }

  /**
   * Gets a pin_joint parameter (see [PinJointParam] constants).
   */
  @JvmStatic
  public final fun pinJointGetParam(joint: RID, `param`: PinJointParam): Float {
    Internals.writeArguments(_RID to joint, LONG to param.id)
    Internals.callMethod(rawPtr, MethodBindings.pinJointGetParamPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets position of the joint in the local space of body a of the joint.
   */
  @JvmStatic
  public final fun pinJointSetLocalA(joint: RID, localA: Vector3): Unit {
    Internals.writeArguments(_RID to joint, VECTOR3 to localA)
    Internals.callMethod(rawPtr, MethodBindings.pinJointSetLocalAPtr, NIL)
  }

  /**
   * Returns position of the joint in the local space of body a of the joint.
   */
  @JvmStatic
  public final fun pinJointGetLocalA(joint: RID): Vector3 {
    Internals.writeArguments(_RID to joint)
    Internals.callMethod(rawPtr, MethodBindings.pinJointGetLocalAPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets position of the joint in the local space of body b of the joint.
   */
  @JvmStatic
  public final fun pinJointSetLocalB(joint: RID, localB: Vector3): Unit {
    Internals.writeArguments(_RID to joint, VECTOR3 to localB)
    Internals.callMethod(rawPtr, MethodBindings.pinJointSetLocalBPtr, NIL)
  }

  /**
   * Returns position of the joint in the local space of body b of the joint.
   */
  @JvmStatic
  public final fun pinJointGetLocalB(joint: RID): Vector3 {
    Internals.writeArguments(_RID to joint)
    Internals.callMethod(rawPtr, MethodBindings.pinJointGetLocalBPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  @JvmStatic
  public final fun jointMakeHinge(
    joint: RID,
    bodyA: RID,
    hingeA: Transform3D,
    bodyB: RID,
    hingeB: Transform3D,
  ): Unit {
    Internals.writeArguments(_RID to joint, _RID to bodyA, TRANSFORM3D to hingeA, _RID to bodyB, TRANSFORM3D to hingeB)
    Internals.callMethod(rawPtr, MethodBindings.jointMakeHingePtr, NIL)
  }

  /**
   * Sets a hinge_joint parameter (see [HingeJointParam] constants).
   */
  @JvmStatic
  public final fun hingeJointSetParam(
    joint: RID,
    `param`: HingeJointParam,
    `value`: Float,
  ): Unit {
    Internals.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.hingeJointSetParamPtr, NIL)
  }

  /**
   * Gets a hinge_joint parameter (see [HingeJointParam]).
   */
  @JvmStatic
  public final fun hingeJointGetParam(joint: RID, `param`: HingeJointParam): Float {
    Internals.writeArguments(_RID to joint, LONG to param.id)
    Internals.callMethod(rawPtr, MethodBindings.hingeJointGetParamPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets a hinge_joint flag (see [HingeJointFlag] constants).
   */
  @JvmStatic
  public final fun hingeJointSetFlag(
    joint: RID,
    flag: HingeJointFlag,
    enabled: Boolean,
  ): Unit {
    Internals.writeArguments(_RID to joint, LONG to flag.id, BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.hingeJointSetFlagPtr, NIL)
  }

  /**
   * Gets a hinge_joint flag (see [HingeJointFlag] constants).
   */
  @JvmStatic
  public final fun hingeJointGetFlag(joint: RID, flag: HingeJointFlag): Boolean {
    Internals.writeArguments(_RID to joint, LONG to flag.id)
    Internals.callMethod(rawPtr, MethodBindings.hingeJointGetFlagPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  @JvmStatic
  public final fun jointMakeSlider(
    joint: RID,
    bodyA: RID,
    localRefA: Transform3D,
    bodyB: RID,
    localRefB: Transform3D,
  ): Unit {
    Internals.writeArguments(_RID to joint, _RID to bodyA, TRANSFORM3D to localRefA, _RID to bodyB, TRANSFORM3D to localRefB)
    Internals.callMethod(rawPtr, MethodBindings.jointMakeSliderPtr, NIL)
  }

  /**
   * Gets a slider_joint parameter (see [SliderJointParam] constants).
   */
  @JvmStatic
  public final fun sliderJointSetParam(
    joint: RID,
    `param`: SliderJointParam,
    `value`: Float,
  ): Unit {
    Internals.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.sliderJointSetParamPtr, NIL)
  }

  /**
   * Gets a slider_joint parameter (see [SliderJointParam] constants).
   */
  @JvmStatic
  public final fun sliderJointGetParam(joint: RID, `param`: SliderJointParam): Float {
    Internals.writeArguments(_RID to joint, LONG to param.id)
    Internals.callMethod(rawPtr, MethodBindings.sliderJointGetParamPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  @JvmStatic
  public final fun jointMakeConeTwist(
    joint: RID,
    bodyA: RID,
    localRefA: Transform3D,
    bodyB: RID,
    localRefB: Transform3D,
  ): Unit {
    Internals.writeArguments(_RID to joint, _RID to bodyA, TRANSFORM3D to localRefA, _RID to bodyB, TRANSFORM3D to localRefB)
    Internals.callMethod(rawPtr, MethodBindings.jointMakeConeTwistPtr, NIL)
  }

  /**
   * Sets a cone_twist_joint parameter (see [ConeTwistJointParam] constants).
   */
  @JvmStatic
  public final fun coneTwistJointSetParam(
    joint: RID,
    `param`: ConeTwistJointParam,
    `value`: Float,
  ): Unit {
    Internals.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.coneTwistJointSetParamPtr, NIL)
  }

  /**
   * Gets a cone_twist_joint parameter (see [ConeTwistJointParam] constants).
   */
  @JvmStatic
  public final fun coneTwistJointGetParam(joint: RID, `param`: ConeTwistJointParam): Float {
    Internals.writeArguments(_RID to joint, LONG to param.id)
    Internals.callMethod(rawPtr, MethodBindings.coneTwistJointGetParamPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the type of the Joint3D.
   */
  @JvmStatic
  public final fun jointGetType(joint: RID): JointType {
    Internals.writeArguments(_RID to joint)
    Internals.callMethod(rawPtr, MethodBindings.jointGetTypePtr, LONG)
    return PhysicsServer3D.JointType.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the priority value of the Joint3D.
   */
  @JvmStatic
  public final fun jointSetSolverPriority(joint: RID, priority: Int): Unit {
    Internals.writeArguments(_RID to joint, LONG to priority.toLong())
    Internals.callMethod(rawPtr, MethodBindings.jointSetSolverPriorityPtr, NIL)
  }

  /**
   * Gets the priority value of the Joint3D.
   */
  @JvmStatic
  public final fun jointGetSolverPriority(joint: RID): Int {
    Internals.writeArguments(_RID to joint)
    Internals.callMethod(rawPtr, MethodBindings.jointGetSolverPriorityPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets whether the bodies attached to the [Joint3D] will collide with each other.
   */
  @JvmStatic
  public final fun jointDisableCollisionsBetweenBodies(joint: RID, disable: Boolean): Unit {
    Internals.writeArguments(_RID to joint, BOOL to disable)
    Internals.callMethod(rawPtr, MethodBindings.jointDisableCollisionsBetweenBodiesPtr, NIL)
  }

  /**
   * Returns whether the bodies attached to the [Joint3D] will collide with each other.
   */
  @JvmStatic
  public final fun jointIsDisabledCollisionsBetweenBodies(joint: RID): Boolean {
    Internals.writeArguments(_RID to joint)
    Internals.callMethod(rawPtr, MethodBindings.jointIsDisabledCollisionsBetweenBodiesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Make the joint a generic six degrees of freedom (6DOF) joint. Use [generic6dofJointSetFlag] and
   * [generic6dofJointSetParam] to set the joint's flags and parameters respectively.
   */
  @JvmStatic
  public final fun jointMakeGeneric6dof(
    joint: RID,
    bodyA: RID,
    localRefA: Transform3D,
    bodyB: RID,
    localRefB: Transform3D,
  ): Unit {
    Internals.writeArguments(_RID to joint, _RID to bodyA, TRANSFORM3D to localRefA, _RID to bodyB, TRANSFORM3D to localRefB)
    Internals.callMethod(rawPtr, MethodBindings.jointMakeGeneric6dofPtr, NIL)
  }

  /**
   * Sets the value of a given generic 6DOF joint parameter. See [G6DOFJointAxisParam] for the list
   * of available parameters.
   */
  @JvmStatic
  public final fun generic6dofJointSetParam(
    joint: RID,
    axis: Vector3.Axis,
    `param`: G6DOFJointAxisParam,
    `value`: Float,
  ): Unit {
    Internals.writeArguments(_RID to joint, LONG to axis.id, LONG to param.id, DOUBLE to value.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.generic6dofJointSetParamPtr, NIL)
  }

  /**
   * Returns the value of a generic 6DOF joint parameter. See [G6DOFJointAxisParam] for the list of
   * available parameters.
   */
  @JvmStatic
  public final fun generic6dofJointGetParam(
    joint: RID,
    axis: Vector3.Axis,
    `param`: G6DOFJointAxisParam,
  ): Float {
    Internals.writeArguments(_RID to joint, LONG to axis.id, LONG to param.id)
    Internals.callMethod(rawPtr, MethodBindings.generic6dofJointGetParamPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the value of a given generic 6DOF joint flag. See [G6DOFJointAxisFlag] for the list of
   * available flags.
   */
  @JvmStatic
  public final fun generic6dofJointSetFlag(
    joint: RID,
    axis: Vector3.Axis,
    flag: G6DOFJointAxisFlag,
    enable: Boolean,
  ): Unit {
    Internals.writeArguments(_RID to joint, LONG to axis.id, LONG to flag.id, BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.generic6dofJointSetFlagPtr, NIL)
  }

  /**
   * Returns the value of a generic 6DOF joint flag. See [G6DOFJointAxisFlag] for the list of
   * available flags.
   */
  @JvmStatic
  public final fun generic6dofJointGetFlag(
    joint: RID,
    axis: Vector3.Axis,
    flag: G6DOFJointAxisFlag,
  ): Boolean {
    Internals.writeArguments(_RID to joint, LONG to axis.id, LONG to flag.id)
    Internals.callMethod(rawPtr, MethodBindings.generic6dofJointGetFlagPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Destroys any of the objects created by PhysicsServer3D. If the [RID] passed is not one of the
   * objects that can be created by PhysicsServer3D, an error will be sent to the console.
   */
  @JvmStatic
  public final fun freeRid(rid: RID): Unit {
    Internals.writeArguments(_RID to rid)
    Internals.callMethod(rawPtr, MethodBindings.freeRidPtr, NIL)
  }

  /**
   * Activates or deactivates the 3D physics engine.
   */
  @JvmStatic
  public final fun setActive(active: Boolean): Unit {
    Internals.writeArguments(BOOL to active)
    Internals.callMethod(rawPtr, MethodBindings.setActivePtr, NIL)
  }

  /**
   * Returns information about the current state of the 3D physics engine. See [ProcessInfo] for a
   * list of available states.
   */
  @JvmStatic
  public final fun getProcessInfo(processInfo: ProcessInfo): Int {
    Internals.writeArguments(LONG to processInfo.id)
    Internals.callMethod(rawPtr, MethodBindings.getProcessInfoPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
     * Represents the size of the [JointType] enum.
     */
    JOINT_TYPE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): JointType = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): PinJointParam = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): HingeJointParam = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): HingeJointFlag = entries.single { it.id == `value` }
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
     * Represents the size of the [SliderJointParam] enum.
     */
    SLIDER_JOINT_MAX(22),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SliderJointParam = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): ConeTwistJointParam = entries.single { it.id == `value` }
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
    G6DOF_JOINT_LINEAR_SPRING_STIFFNESS(7),
    G6DOF_JOINT_LINEAR_SPRING_DAMPING(8),
    G6DOF_JOINT_LINEAR_SPRING_EQUILIBRIUM_POINT(9),
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
    G6DOF_JOINT_ANGULAR_SPRING_STIFFNESS(19),
    G6DOF_JOINT_ANGULAR_SPRING_DAMPING(20),
    G6DOF_JOINT_ANGULAR_SPRING_EQUILIBRIUM_POINT(21),
    /**
     * Represents the size of the [G6DOFJointAxisParam] enum.
     */
    G6DOF_JOINT_MAX(22),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): G6DOFJointAxisParam = entries.single { it.id == `value` }
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
    G6DOF_JOINT_FLAG_ENABLE_ANGULAR_SPRING(2),
    G6DOF_JOINT_FLAG_ENABLE_LINEAR_SPRING(3),
    /**
     * If set, there is a rotational motor across these axes.
     */
    G6DOF_JOINT_FLAG_ENABLE_MOTOR(4),
    /**
     * If set, there is a linear motor on this axis that targets a specific velocity.
     */
    G6DOF_JOINT_FLAG_ENABLE_LINEAR_MOTOR(5),
    /**
     * Represents the size of the [G6DOFJointAxisFlag] enum.
     */
    G6DOF_JOINT_FLAG_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): G6DOFJointAxisFlag = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): ShapeType = entries.single { it.id == `value` }
    }
  }

  public enum class AreaParameter(
    id: Long,
  ) {
    /**
     * Constant to set/get gravity override mode in an area. See [AreaSpaceOverrideMode] for
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
     * controlled by [AREA_PARAM_GRAVITY]. For example, on a planet 100 meters in radius with a surface
     * gravity of 4.0 m/s², set the gravity to 4.0 and the unit distance to 100.0. The gravity will
     * have falloff according to the inverse square law, so in the example, at 200 meters from the
     * center the gravity will be 1.0 m/s² (twice the distance, 1/4th the gravity), at 50 meters it
     * will be 16.0 m/s² (half the distance, 4x the gravity), and so on.
     * The above is true only when the unit distance is a positive number. When this is set to 0.0,
     * the gravity will be constant regardless of distance.
     */
    AREA_PARAM_GRAVITY_POINT_UNIT_DISTANCE(4),
    /**
     * Constant to set/get linear damping override mode in an area. See [AreaSpaceOverrideMode] for
     * possible values.
     */
    AREA_PARAM_LINEAR_DAMP_OVERRIDE_MODE(5),
    /**
     * Constant to set/get the linear damping factor of an area.
     */
    AREA_PARAM_LINEAR_DAMP(6),
    /**
     * Constant to set/get angular damping override mode in an area. See [AreaSpaceOverrideMode] for
     * possible values.
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
     * Constant to set/get the magnitude of area-specific wind force. This wind force only applies
     * to [SoftBody3D] nodes. Other physics bodies are currently not affected by wind.
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
      public fun from(`value`: Long): AreaParameter = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): AreaSpaceOverrideMode = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): BodyMode = entries.single { it.id == `value` }
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
     * Constant to set/get a body's linear damping mode. See [BodyDampMode] for possible values.
     */
    BODY_PARAM_LINEAR_DAMP_MODE(6),
    /**
     * Constant to set/get a body's angular damping mode. See [BodyDampMode] for possible values.
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
     * Represents the size of the [BodyParameter] enum.
     */
    BODY_PARAM_MAX(10),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BodyParameter = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): BodyDampMode = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): BodyState = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): AreaBodyStatus = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): ProcessInfo = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): SpaceParameter = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): BodyAxis = entries.single { it.id == `value` }
    }
  }

  public object MethodBindings {
    internal val worldBoundaryShapeCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "world_boundary_shape_create", 529393457)

    internal val separationRayShapeCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "separation_ray_shape_create", 529393457)

    internal val sphereShapeCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "sphere_shape_create", 529393457)

    internal val boxShapeCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "box_shape_create", 529393457)

    internal val capsuleShapeCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "capsule_shape_create", 529393457)

    internal val cylinderShapeCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "cylinder_shape_create", 529393457)

    internal val convexPolygonShapeCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "convex_polygon_shape_create", 529393457)

    internal val concavePolygonShapeCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "concave_polygon_shape_create", 529393457)

    internal val heightmapShapeCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "heightmap_shape_create", 529393457)

    internal val customShapeCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "custom_shape_create", 529393457)

    internal val shapeSetDataPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "shape_set_data", 3175752987)

    internal val shapeSetMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "shape_set_margin", 1794382983)

    internal val shapeGetTypePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "shape_get_type", 3418923367)

    internal val shapeGetDataPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "shape_get_data", 4171304767)

    internal val shapeGetMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "shape_get_margin", 866169185)

    internal val spaceCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "space_create", 529393457)

    internal val spaceSetActivePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "space_set_active", 1265174801)

    internal val spaceIsActivePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "space_is_active", 4155700596)

    internal val spaceSetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "space_set_param", 2406017470)

    internal val spaceGetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "space_get_param", 1523206731)

    internal val spaceGetDirectStatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "space_get_direct_state", 2048616813)

    internal val areaCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_create", 529393457)

    internal val areaSetSpacePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_set_space", 395945892)

    internal val areaGetSpacePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_get_space", 3814569979)

    internal val areaAddShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_add_shape", 3711419014)

    internal val areaSetShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_set_shape", 2310537182)

    internal val areaSetShapeTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_set_shape_transform", 675327471)

    internal val areaSetShapeDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_set_shape_disabled", 2658558584)

    internal val areaGetShapeCountPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_get_shape_count", 2198884583)

    internal val areaGetShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_get_shape", 1066463050)

    internal val areaGetShapeTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_get_shape_transform", 1050775521)

    internal val areaRemoveShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_remove_shape", 3411492887)

    internal val areaClearShapesPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_clear_shapes", 2722037293)

    internal val areaSetCollisionLayerPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_set_collision_layer", 3411492887)

    internal val areaGetCollisionLayerPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_get_collision_layer", 2198884583)

    internal val areaSetCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_set_collision_mask", 3411492887)

    internal val areaGetCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_get_collision_mask", 2198884583)

    internal val areaSetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_set_param", 2980114638)

    internal val areaSetTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_set_transform", 3935195649)

    internal val areaGetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_get_param", 890056067)

    internal val areaGetTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_get_transform", 1128465797)

    internal val areaAttachObjectInstanceIdPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_attach_object_instance_id", 3411492887)

    internal val areaGetObjectInstanceIdPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_get_object_instance_id", 2198884583)

    internal val areaSetMonitorCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_set_monitor_callback", 3379118538)

    internal val areaSetAreaMonitorCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_set_area_monitor_callback", 3379118538)

    internal val areaSetMonitorablePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_set_monitorable", 1265174801)

    internal val areaSetRayPickablePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "area_set_ray_pickable", 1265174801)

    internal val bodyCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_create", 529393457)

    internal val bodySetSpacePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_space", 395945892)

    internal val bodyGetSpacePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_space", 3814569979)

    internal val bodySetModePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_mode", 606803466)

    internal val bodyGetModePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_mode", 2488819728)

    internal val bodySetCollisionLayerPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_collision_layer", 3411492887)

    internal val bodyGetCollisionLayerPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_collision_layer", 2198884583)

    internal val bodySetCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_collision_mask", 3411492887)

    internal val bodyGetCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_collision_mask", 2198884583)

    internal val bodySetCollisionPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_collision_priority", 1794382983)

    internal val bodyGetCollisionPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_collision_priority", 866169185)

    internal val bodyAddShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_add_shape", 3711419014)

    internal val bodySetShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_shape", 2310537182)

    internal val bodySetShapeTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_shape_transform", 675327471)

    internal val bodySetShapeDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_shape_disabled", 2658558584)

    internal val bodyGetShapeCountPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_shape_count", 2198884583)

    internal val bodyGetShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_shape", 1066463050)

    internal val bodyGetShapeTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_shape_transform", 1050775521)

    internal val bodyRemoveShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_remove_shape", 3411492887)

    internal val bodyClearShapesPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_clear_shapes", 2722037293)

    internal val bodyAttachObjectInstanceIdPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_attach_object_instance_id", 3411492887)

    internal val bodyGetObjectInstanceIdPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_object_instance_id", 2198884583)

    internal val bodySetEnableContinuousCollisionDetectionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_enable_continuous_collision_detection", 1265174801)

    internal val bodyIsContinuousCollisionDetectionEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_is_continuous_collision_detection_enabled", 4155700596)

    internal val bodySetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_param", 910941953)

    internal val bodyGetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_param", 3385027841)

    internal val bodyResetMassPropertiesPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_reset_mass_properties", 2722037293)

    internal val bodySetStatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_state", 599977762)

    internal val bodyGetStatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_state", 1850449534)

    internal val bodyApplyCentralImpulsePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_apply_central_impulse", 3227306858)

    internal val bodyApplyImpulsePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_apply_impulse", 390416203)

    internal val bodyApplyTorqueImpulsePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_apply_torque_impulse", 3227306858)

    internal val bodyApplyCentralForcePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_apply_central_force", 3227306858)

    internal val bodyApplyForcePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_apply_force", 390416203)

    internal val bodyApplyTorquePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_apply_torque", 3227306858)

    internal val bodyAddConstantCentralForcePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_add_constant_central_force", 3227306858)

    internal val bodyAddConstantForcePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_add_constant_force", 390416203)

    internal val bodyAddConstantTorquePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_add_constant_torque", 3227306858)

    internal val bodySetConstantForcePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_constant_force", 3227306858)

    internal val bodyGetConstantForcePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_constant_force", 531438156)

    internal val bodySetConstantTorquePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_constant_torque", 3227306858)

    internal val bodyGetConstantTorquePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_constant_torque", 531438156)

    internal val bodySetAxisVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_axis_velocity", 3227306858)

    internal val bodySetAxisLockPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_axis_lock", 2020836892)

    internal val bodyIsAxisLockedPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_is_axis_locked", 587853580)

    internal val bodyAddCollisionExceptionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_add_collision_exception", 395945892)

    internal val bodyRemoveCollisionExceptionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_remove_collision_exception", 395945892)

    internal val bodySetMaxContactsReportedPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_max_contacts_reported", 3411492887)

    internal val bodyGetMaxContactsReportedPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_max_contacts_reported", 2198884583)

    internal val bodySetOmitForceIntegrationPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_omit_force_integration", 1265174801)

    internal val bodyIsOmittingForceIntegrationPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_is_omitting_force_integration", 4155700596)

    internal val bodySetStateSyncCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_state_sync_callback", 3379118538)

    internal val bodySetForceIntegrationCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_force_integration_callback", 3059434249)

    internal val bodySetRayPickablePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_set_ray_pickable", 1265174801)

    internal val bodyTestMotionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_test_motion", 1944921792)

    internal val bodyGetDirectStatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "body_get_direct_state", 3029727957)

    internal val softBodyCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_create", 529393457)

    internal val softBodyUpdateRenderingServerPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_update_rendering_server", 2218179753)

    internal val softBodySetSpacePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_set_space", 395945892)

    internal val softBodyGetSpacePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_get_space", 3814569979)

    internal val softBodySetMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_set_mesh", 395945892)

    internal val softBodyGetBoundsPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_get_bounds", 974181306)

    internal val softBodySetCollisionLayerPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_set_collision_layer", 3411492887)

    internal val softBodyGetCollisionLayerPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_get_collision_layer", 2198884583)

    internal val softBodySetCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_set_collision_mask", 3411492887)

    internal val softBodyGetCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_get_collision_mask", 2198884583)

    internal val softBodyAddCollisionExceptionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_add_collision_exception", 395945892)

    internal val softBodyRemoveCollisionExceptionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_remove_collision_exception", 395945892)

    internal val softBodySetStatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_set_state", 599977762)

    internal val softBodyGetStatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_get_state", 1850449534)

    internal val softBodySetTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_set_transform", 3935195649)

    internal val softBodySetRayPickablePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_set_ray_pickable", 1265174801)

    internal val softBodySetSimulationPrecisionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_set_simulation_precision", 3411492887)

    internal val softBodyGetSimulationPrecisionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_get_simulation_precision", 2198884583)

    internal val softBodySetTotalMassPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_set_total_mass", 1794382983)

    internal val softBodyGetTotalMassPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_get_total_mass", 866169185)

    internal val softBodySetLinearStiffnessPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_set_linear_stiffness", 1794382983)

    internal val softBodyGetLinearStiffnessPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_get_linear_stiffness", 866169185)

    internal val softBodySetPressureCoefficientPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_set_pressure_coefficient", 1794382983)

    internal val softBodyGetPressureCoefficientPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_get_pressure_coefficient", 866169185)

    internal val softBodySetDampingCoefficientPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_set_damping_coefficient", 1794382983)

    internal val softBodyGetDampingCoefficientPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_get_damping_coefficient", 866169185)

    internal val softBodySetDragCoefficientPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_set_drag_coefficient", 1794382983)

    internal val softBodyGetDragCoefficientPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_get_drag_coefficient", 866169185)

    internal val softBodyMovePointPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_move_point", 831953689)

    internal val softBodyGetPointGlobalPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_get_point_global_position", 3440143363)

    internal val softBodyRemoveAllPinnedPointsPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_remove_all_pinned_points", 2722037293)

    internal val softBodyPinPointPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_pin_point", 2658558584)

    internal val softBodyIsPointPinnedPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "soft_body_is_point_pinned", 3120086654)

    internal val jointCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "joint_create", 529393457)

    internal val jointClearPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "joint_clear", 2722037293)

    internal val jointMakePinPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "joint_make_pin", 4280171926)

    internal val pinJointSetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "pin_joint_set_param", 810685294)

    internal val pinJointGetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "pin_joint_get_param", 2817972347)

    internal val pinJointSetLocalAPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "pin_joint_set_local_a", 3227306858)

    internal val pinJointGetLocalAPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "pin_joint_get_local_a", 531438156)

    internal val pinJointSetLocalBPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "pin_joint_set_local_b", 3227306858)

    internal val pinJointGetLocalBPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "pin_joint_get_local_b", 531438156)

    internal val jointMakeHingePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "joint_make_hinge", 1684107643)

    internal val hingeJointSetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "hinge_joint_set_param", 3165502333)

    internal val hingeJointGetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "hinge_joint_get_param", 2129207581)

    internal val hingeJointSetFlagPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "hinge_joint_set_flag", 1601626188)

    internal val hingeJointGetFlagPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "hinge_joint_get_flag", 4165147865)

    internal val jointMakeSliderPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "joint_make_slider", 1684107643)

    internal val sliderJointSetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "slider_joint_set_param", 2264833593)

    internal val sliderJointGetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "slider_joint_get_param", 3498644957)

    internal val jointMakeConeTwistPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "joint_make_cone_twist", 1684107643)

    internal val coneTwistJointSetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "cone_twist_joint_set_param", 808587618)

    internal val coneTwistJointGetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "cone_twist_joint_get_param", 1134789658)

    internal val jointGetTypePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "joint_get_type", 4290791900)

    internal val jointSetSolverPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "joint_set_solver_priority", 3411492887)

    internal val jointGetSolverPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "joint_get_solver_priority", 2198884583)

    internal val jointDisableCollisionsBetweenBodiesPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "joint_disable_collisions_between_bodies", 1265174801)

    internal val jointIsDisabledCollisionsBetweenBodiesPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "joint_is_disabled_collisions_between_bodies", 4155700596)

    internal val jointMakeGeneric6dofPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "joint_make_generic_6dof", 1684107643)

    internal val generic6dofJointSetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "generic_6dof_joint_set_param", 2600081391)

    internal val generic6dofJointGetParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "generic_6dof_joint_get_param", 467122058)

    internal val generic6dofJointSetFlagPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "generic_6dof_joint_set_flag", 3570926903)

    internal val generic6dofJointGetFlagPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "generic_6dof_joint_get_flag", 4158090196)

    internal val freeRidPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "free_rid", 2722037293)

    internal val setActivePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "set_active", 2586408642)

    internal val getProcessInfoPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3D", "get_process_info", 1332958745)
  }
}
