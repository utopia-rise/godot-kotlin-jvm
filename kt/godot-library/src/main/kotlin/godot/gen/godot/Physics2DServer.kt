// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.Physics2DServer
import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Server interface for low-level 2D physics access.
 *
 * Physics2DServer is the server responsible for all 2D physics. It can create many kinds of physics objects, but does not insert them on the node tree.
 */
@GodotBaseType
object Physics2DServer : Object() {
  /**
   * The value of the first parameter and area callback function receives, when an object enters one of its shapes.
   */
  final const val AREA_BODY_ADDED: Long = 0

  /**
   * The value of the first parameter and area callback function receives, when an object exits one of its shapes.
   */
  final const val AREA_BODY_REMOVED: Long = 1

  /**
   * Constant to set/get the angular dampening factor of an area.
   */
  final const val AREA_PARAM_ANGULAR_DAMP: Long = 6

  /**
   * Constant to set/get gravity strength in an area.
   */
  final const val AREA_PARAM_GRAVITY: Long = 0

  /**
   * Constant to set/get the falloff factor for point gravity of an area. The greater this value is, the faster the strength of gravity decreases with the square of distance.
   */
  final const val AREA_PARAM_GRAVITY_DISTANCE_SCALE: Long = 3

  /**
   * Constant to set/get whether the gravity vector of an area is a direction, or a center point.
   */
  final const val AREA_PARAM_GRAVITY_IS_POINT: Long = 2

  /**
   * This constant was used to set/get the falloff factor for point gravity. It has been superseded by [AREA_PARAM_GRAVITY_DISTANCE_SCALE].
   */
  final const val AREA_PARAM_GRAVITY_POINT_ATTENUATION: Long = 4

  /**
   * Constant to set/get gravity vector/center in an area.
   */
  final const val AREA_PARAM_GRAVITY_VECTOR: Long = 1

  /**
   * Constant to set/get the linear dampening factor of an area.
   */
  final const val AREA_PARAM_LINEAR_DAMP: Long = 5

  /**
   * Constant to set/get the priority (order of processing) of an area.
   */
  final const val AREA_PARAM_PRIORITY: Long = 7

  /**
   * This area adds its gravity/damp values to whatever has been calculated so far. This way, many overlapping areas can combine their physics to make interesting effects.
   */
  final const val AREA_SPACE_OVERRIDE_COMBINE: Long = 1

  /**
   * This area adds its gravity/damp values to whatever has been calculated so far. Then stops taking into account the rest of the areas, even the default one.
   */
  final const val AREA_SPACE_OVERRIDE_COMBINE_REPLACE: Long = 2

  /**
   * This area does not affect gravity/damp. These are generally areas that exist only to detect collisions, and objects entering or exiting them.
   */
  final const val AREA_SPACE_OVERRIDE_DISABLED: Long = 0

  /**
   * This area replaces any gravity/damp, even the default one, and stops taking into account the rest of the areas.
   */
  final const val AREA_SPACE_OVERRIDE_REPLACE: Long = 3

  /**
   * This area replaces any gravity/damp calculated so far, but keeps calculating the rest of the areas, down to the default one.
   */
  final const val AREA_SPACE_OVERRIDE_REPLACE_COMBINE: Long = 4

  /**
   * Constant for rigid bodies in character mode. In this mode, a body can not rotate, and only its linear velocity is affected by physics.
   */
  final const val BODY_MODE_CHARACTER: Long = 3

  /**
   * Constant for kinematic bodies.
   */
  final const val BODY_MODE_KINEMATIC: Long = 1

  /**
   * Constant for rigid bodies.
   */
  final const val BODY_MODE_RIGID: Long = 2

  /**
   * Constant for static bodies.
   */
  final const val BODY_MODE_STATIC: Long = 0

  /**
   * Constant to set/get a body's angular dampening factor.
   */
  final const val BODY_PARAM_ANGULAR_DAMP: Long = 6

  /**
   * Constant to set/get a body's bounce factor.
   */
  final const val BODY_PARAM_BOUNCE: Long = 0

  /**
   * Constant to set/get a body's friction.
   */
  final const val BODY_PARAM_FRICTION: Long = 1

  /**
   * Constant to set/get a body's gravity multiplier.
   */
  final const val BODY_PARAM_GRAVITY_SCALE: Long = 4

  /**
   * Constant to set/get a body's inertia.
   */
  final const val BODY_PARAM_INERTIA: Long = 3

  /**
   * Constant to set/get a body's linear dampening factor.
   */
  final const val BODY_PARAM_LINEAR_DAMP: Long = 5

  /**
   * Constant to set/get a body's mass.
   */
  final const val BODY_PARAM_MASS: Long = 2

  /**
   * Represents the size of the [enum BodyParameter] enum.
   */
  final const val BODY_PARAM_MAX: Long = 7

  /**
   * Constant to set/get the current angular velocity of the body.
   */
  final const val BODY_STATE_ANGULAR_VELOCITY: Long = 2

  /**
   * Constant to set/get whether the body can sleep.
   */
  final const val BODY_STATE_CAN_SLEEP: Long = 4

  /**
   * Constant to set/get the current linear velocity of the body.
   */
  final const val BODY_STATE_LINEAR_VELOCITY: Long = 1

  /**
   * Constant to sleep/wake up a body, or to get whether it is sleeping.
   */
  final const val BODY_STATE_SLEEPING: Long = 3

  /**
   * Constant to set/get the current transform matrix of the body.
   */
  final const val BODY_STATE_TRANSFORM: Long = 0

  /**
   * Enables continuous collision detection by raycasting. It is faster than shapecasting, but less precise.
   */
  final const val CCD_MODE_CAST_RAY: Long = 1

  /**
   * Enables continuous collision detection by shapecasting. It is the slowest CCD method, and the most precise.
   */
  final const val CCD_MODE_CAST_SHAPE: Long = 2

  /**
   * Disables continuous collision detection. This is the fastest way to detect body collisions, but can miss small, fast-moving objects.
   */
  final const val CCD_MODE_DISABLED: Long = 0

  /**
   * Sets the damping ratio of the spring joint. A value of 0 indicates an undamped spring, while 1 causes the system to reach equilibrium as fast as possible (critical damping).
   */
  final const val DAMPED_STRING_DAMPING: Long = 2

  /**
   * Sets the resting length of the spring joint. The joint will always try to go to back this length when pulled apart.
   */
  final const val DAMPED_STRING_REST_LENGTH: Long = 0

  /**
   * Sets the stiffness of the spring joint. The joint applies a force equal to the stiffness times the distance from its resting length.
   */
  final const val DAMPED_STRING_STIFFNESS: Long = 1

  /**
   * Constant to get the number of objects that are not sleeping.
   */
  final const val INFO_ACTIVE_OBJECTS: Long = 0

  /**
   * Constant to get the number of possible collisions.
   */
  final const val INFO_COLLISION_PAIRS: Long = 1

  /**
   * Constant to get the number of space regions where a collision could occur.
   */
  final const val INFO_ISLAND_COUNT: Long = 2

  /**
   * Constant to create damped spring joints.
   */
  final const val JOINT_DAMPED_SPRING: Long = 2

  /**
   * Constant to create groove joints.
   */
  final const val JOINT_GROOVE: Long = 1

  /**
   *
   */
  final const val JOINT_PARAM_BIAS: Long = 0

  /**
   *
   */
  final const val JOINT_PARAM_MAX_BIAS: Long = 1

  /**
   *
   */
  final const val JOINT_PARAM_MAX_FORCE: Long = 2

  /**
   * Constant to create pin joints.
   */
  final const val JOINT_PIN: Long = 0

  /**
   * This is the constant for creating capsule shapes. A capsule shape is defined by a radius and a length. It can be used for intersections and inside/outside checks.
   */
  final const val SHAPE_CAPSULE: Long = 5

  /**
   * This is the constant for creating circle shapes. A circle shape only has a radius. It can be used for intersections and inside/outside checks.
   */
  final const val SHAPE_CIRCLE: Long = 3

  /**
   * This is the constant for creating concave polygon shapes. A polygon is defined by a list of points. It can be used for intersections checks, but not for inside/outside checks.
   */
  final const val SHAPE_CONCAVE_POLYGON: Long = 7

  /**
   * This is the constant for creating convex polygon shapes. A polygon is defined by a list of points. It can be used for intersections and inside/outside checks. Unlike the [godot.CollisionPolygon2D.polygon] property, polygons modified with [shapeSetData] do not verify that the points supplied form is a convex polygon.
   */
  final const val SHAPE_CONVEX_POLYGON: Long = 6

  /**
   * This constant is used internally by the engine. Any attempt to create this kind of shape results in an error.
   */
  final const val SHAPE_CUSTOM: Long = 8

  /**
   * This is the constant for creating line shapes. A line shape is an infinite line with an origin point, and a normal. Thus, it can be used for front/behind checks.
   */
  final const val SHAPE_LINE: Long = 0

  /**
   *
   */
  final const val SHAPE_RAY: Long = 1

  /**
   * This is the constant for creating rectangle shapes. A rectangle shape is defined by a width and a height. It can be used for intersections and inside/outside checks.
   */
  final const val SHAPE_RECTANGLE: Long = 4

  /**
   * This is the constant for creating segment shapes. A segment shape is a line from a point A to a point B. It can be checked for intersections.
   */
  final const val SHAPE_SEGMENT: Long = 2

  /**
   * Constant to set/get the threshold angular velocity of activity. A body marked as potentially inactive for both linear and angular velocity will be put to sleep after the time given.
   */
  final const val SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD: Long = 4

  /**
   * Constant to set/get the threshold linear velocity of activity. A body marked as potentially inactive for both linear and angular velocity will be put to sleep after the time given.
   */
  final const val SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD: Long = 3

  /**
   * Constant to set/get the maximum distance a shape can penetrate another shape before it is considered a collision.
   */
  final const val SPACE_PARAM_BODY_MAX_ALLOWED_PENETRATION: Long = 2

  /**
   * Constant to set/get the maximum time of activity. A body marked as potentially inactive for both linear and angular velocity will be put to sleep after this time.
   */
  final const val SPACE_PARAM_BODY_TIME_TO_SLEEP: Long = 5

  /**
   * Constant to set/get the default solver bias for all physics constraints. A solver bias is a factor controlling how much two objects "rebound", after violating a constraint, to avoid leaving them in that state because of numerical imprecision.
   */
  final const val SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS: Long = 6

  /**
   * Constant to set/get the maximum distance a shape can be from another before they are considered separated.
   */
  final const val SPACE_PARAM_CONTACT_MAX_SEPARATION: Long = 1

  /**
   * Constant to set/get the maximum distance a pair of bodies has to move before their collision status has to be recalculated.
   */
  final const val SPACE_PARAM_CONTACT_RECYCLE_RADIUS: Long = 0

  /**
   *
   */
  final const val SPACE_PARAM_TEST_MOTION_MIN_CONTACT_DEPTH: Long = 7

  override fun __new() {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_PHYSICS2DSERVER)
  }

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Adds a shape to the area, along with a transform matrix. Shapes are usually referenced by their index, so you should track which shape has a given index.
   */
  fun areaAddShape(
    area: RID,
    shape: RID,
    transform: Transform2D = Transform2D(),
    disabled: Boolean = false
  ) {
    TransferContext.writeArguments(_RID to area, _RID to shape, TRANSFORM2D to transform, BOOL to
        disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_ADD_SHAPE, NIL)
  }

  /**
   *
   */
  fun areaAttachCanvasInstanceId(area: RID, id: Long) {
    TransferContext.writeArguments(_RID to area, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_ATTACH_CANVAS_INSTANCE_ID, NIL)
  }

  /**
   * Assigns the area to a descendant of [godot.Object], so it can exist in the node tree.
   */
  fun areaAttachObjectInstanceId(area: RID, id: Long) {
    TransferContext.writeArguments(_RID to area, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  /**
   * Removes all shapes from an area. It does not delete the shapes, so they can be reassigned later.
   */
  fun areaClearShapes(area: RID) {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_CLEAR_SHAPES,
        NIL)
  }

  /**
   * Creates an [godot.Area2D].
   */
  fun areaCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  fun areaGetCanvasInstanceId(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_CANVAS_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets the instance ID of the object the area is assigned to.
   */
  fun areaGetObjectInstanceId(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_OBJECT_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an area parameter value. See [enum AreaParameter] for a list of available parameters.
   */
  fun areaGetParam(area: RID, param: Long): Any? {
    TransferContext.writeArguments(_RID to area, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_PARAM, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the [RID] of the nth shape of an area.
   */
  fun areaGetShape(area: RID, shapeIdx: Long): RID {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_SHAPE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the number of shapes assigned to an area.
   */
  fun areaGetShapeCount(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the transform matrix of a shape within an area.
   */
  fun areaGetShapeTransform(area: RID, shapeIdx: Long): Transform2D {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_SHAPE_TRANSFORM, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Returns the space assigned to the area.
   */
  fun areaGetSpace(area: RID): RID {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_SPACE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the space override mode for the area.
   */
  fun areaGetSpaceOverrideMode(area: RID): Physics2DServer.AreaSpaceOverrideMode {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_SPACE_OVERRIDE_MODE, LONG)
    return Physics2DServer.AreaSpaceOverrideMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the transform matrix for an area.
   */
  fun areaGetTransform(area: RID): Transform2D {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Removes a shape from an area. It does not delete the shape, so it can be reassigned later.
   */
  fun areaRemoveShape(area: RID, shapeIdx: Long) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_REMOVE_SHAPE,
        NIL)
  }

  /**
   *
   */
  fun areaSetAreaMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    TransferContext.writeArguments(_RID to area, OBJECT to receiver, STRING to method)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_AREA_MONITOR_CALLBACK, NIL)
  }

  /**
   * Assigns the area to one or many physics layers.
   */
  fun areaSetCollisionLayer(area: RID, layer: Long) {
    TransferContext.writeArguments(_RID to area, LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_COLLISION_LAYER, NIL)
  }

  /**
   * Sets which physics layers the area will monitor.
   */
  fun areaSetCollisionMask(area: RID, mask: Long) {
    TransferContext.writeArguments(_RID to area, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_COLLISION_MASK, NIL)
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
  fun areaSetMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    TransferContext.writeArguments(_RID to area, OBJECT to receiver, STRING to method)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_MONITOR_CALLBACK, NIL)
  }

  /**
   *
   */
  fun areaSetMonitorable(area: RID, monitorable: Boolean) {
    TransferContext.writeArguments(_RID to area, BOOL to monitorable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_MONITORABLE, NIL)
  }

  /**
   * Sets the value for an area parameter. See [enum AreaParameter] for a list of available parameters.
   */
  fun areaSetParam(
    area: RID,
    param: Long,
    value: Any?
  ) {
    TransferContext.writeArguments(_RID to area, LONG to param, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_PARAM, NIL)
  }

  /**
   * Substitutes a given area shape by another. The old shape is selected by its index, the new one by its [RID].
   */
  fun areaSetShape(
    area: RID,
    shapeIdx: Long,
    shape: RID
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx, _RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_SHAPE, NIL)
  }

  /**
   * Disables a given shape in an area.
   */
  fun areaSetShapeDisabled(
    area: RID,
    shapeIdx: Long,
    disabled: Boolean
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_SHAPE_DISABLED, NIL)
  }

  /**
   * Sets the transform matrix for an area shape.
   */
  fun areaSetShapeTransform(
    area: RID,
    shapeIdx: Long,
    transform: Transform2D
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_SHAPE_TRANSFORM, NIL)
  }

  /**
   * Assigns a space to the area.
   */
  fun areaSetSpace(area: RID, space: RID) {
    TransferContext.writeArguments(_RID to area, _RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_SPACE, NIL)
  }

  /**
   * Sets the space override mode for the area. See [enum AreaSpaceOverrideMode] for a list of available modes.
   */
  fun areaSetSpaceOverrideMode(area: RID, mode: Long) {
    TransferContext.writeArguments(_RID to area, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_SPACE_OVERRIDE_MODE, NIL)
  }

  /**
   * Sets the transform matrix for an area.
   */
  fun areaSetTransform(area: RID, transform: Transform2D) {
    TransferContext.writeArguments(_RID to area, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_TRANSFORM,
        NIL)
  }

  /**
   *
   */
  fun bodyAddCentralForce(body: RID, force: Vector2) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_ADD_CENTRAL_FORCE, NIL)
  }

  /**
   * Adds a body to the list of bodies exempt from collisions.
   */
  fun bodyAddCollisionException(body: RID, exceptedBody: RID) {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_ADD_COLLISION_EXCEPTION, NIL)
  }

  /**
   * Adds a positioned force to the applied force and torque. As with [bodyApplyImpulse], both the force and the offset from the body origin are in global coordinates. A force differs from an impulse in that, while the two are forces, the impulse clears itself after being applied.
   */
  fun bodyAddForce(
    body: RID,
    offset: Vector2,
    force: Vector2
  ) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to offset, VECTOR2 to force)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_ADD_FORCE, NIL)
  }

  /**
   * Adds a shape to the body, along with a transform matrix. Shapes are usually referenced by their index, so you should track which shape has a given index.
   */
  fun bodyAddShape(
    body: RID,
    shape: RID,
    transform: Transform2D = Transform2D(),
    disabled: Boolean = false
  ) {
    TransferContext.writeArguments(_RID to body, _RID to shape, TRANSFORM2D to transform, BOOL to
        disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_ADD_SHAPE, NIL)
  }

  /**
   *
   */
  fun bodyAddTorque(body: RID, torque: Double) {
    TransferContext.writeArguments(_RID to body, DOUBLE to torque)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_ADD_TORQUE,
        NIL)
  }

  /**
   *
   */
  fun bodyApplyCentralImpulse(body: RID, impulse: Vector2) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_APPLY_CENTRAL_IMPULSE, NIL)
  }

  /**
   * Adds a positioned impulse to the applied force and torque. Both the force and the offset from the body origin are in global coordinates.
   */
  fun bodyApplyImpulse(
    body: RID,
    position: Vector2,
    impulse: Vector2
  ) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to position, VECTOR2 to impulse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_APPLY_IMPULSE,
        NIL)
  }

  /**
   *
   */
  fun bodyApplyTorqueImpulse(body: RID, impulse: Double) {
    TransferContext.writeArguments(_RID to body, DOUBLE to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_APPLY_TORQUE_IMPULSE, NIL)
  }

  /**
   *
   */
  fun bodyAttachCanvasInstanceId(body: RID, id: Long) {
    TransferContext.writeArguments(_RID to body, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_ATTACH_CANVAS_INSTANCE_ID, NIL)
  }

  /**
   * Assigns the area to a descendant of [godot.Object], so it can exist in the node tree.
   */
  fun bodyAttachObjectInstanceId(body: RID, id: Long) {
    TransferContext.writeArguments(_RID to body, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  /**
   * Removes all shapes from a body.
   */
  fun bodyClearShapes(body: RID) {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_CLEAR_SHAPES,
        NIL)
  }

  /**
   * Creates a physics body.
   */
  fun bodyCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  fun bodyGetCanvasInstanceId(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_CANVAS_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the physics layer or layers a body belongs to.
   */
  fun bodyGetCollisionLayer(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_COLLISION_LAYER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the physics layer or layers a body can collide with.
   */
  fun bodyGetCollisionMask(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_COLLISION_MASK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the continuous collision detection mode.
   */
  fun bodyGetContinuousCollisionDetectionMode(body: RID): Physics2DServer.CCDMode {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_CONTINUOUS_COLLISION_DETECTION_MODE, LONG)
    return Physics2DServer.CCDMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the [godot.Physics2DDirectBodyState] of the body.
   */
  fun bodyGetDirectState(body: RID): Physics2DDirectBodyState? {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_DIRECT_STATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Physics2DDirectBodyState?
  }

  /**
   * Returns the maximum contacts that can be reported. See [bodySetMaxContactsReported].
   */
  fun bodyGetMaxContactsReported(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_MAX_CONTACTS_REPORTED, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the body mode.
   */
  fun bodyGetMode(body: RID): Physics2DServer.BodyMode {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_MODE, LONG)
    return Physics2DServer.BodyMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Gets the instance ID of the object the area is assigned to.
   */
  fun bodyGetObjectInstanceId(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_OBJECT_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the value of a body parameter. See [enum BodyParameter] for a list of available parameters.
   */
  fun bodyGetParam(body: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to body, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the [RID] of the nth shape of a body.
   */
  fun bodyGetShape(body: RID, shapeIdx: Long): RID {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_SHAPE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the number of shapes assigned to a body.
   */
  fun bodyGetShapeCount(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the metadata of a shape of a body.
   */
  fun bodyGetShapeMetadata(body: RID, shapeIdx: Long): Any? {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_SHAPE_METADATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the transform matrix of a body shape.
   */
  fun bodyGetShapeTransform(body: RID, shapeIdx: Long): Transform2D {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_SHAPE_TRANSFORM, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Returns the [RID] of the space assigned to a body.
   */
  fun bodyGetSpace(body: RID): RID {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_SPACE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns a body state.
   */
  fun bodyGetState(body: RID, state: Long): Any? {
    TransferContext.writeArguments(_RID to body, LONG to state)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_STATE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns whether a body uses a callback function to calculate its own physics (see [bodySetForceIntegrationCallback]).
   */
  fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_IS_OMITTING_FORCE_INTEGRATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes a body from the list of bodies exempt from collisions.
   */
  fun bodyRemoveCollisionException(body: RID, exceptedBody: RID) {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_REMOVE_COLLISION_EXCEPTION, NIL)
  }

  /**
   * Removes a shape from a body. The shape is not deleted, so it can be reused afterwards.
   */
  fun bodyRemoveShape(body: RID, shapeIdx: Long) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_REMOVE_SHAPE,
        NIL)
  }

  /**
   * Sets an axis velocity. The velocity in the given vector axis will be set as the given vector length. This is useful for jumping behavior.
   */
  fun bodySetAxisVelocity(body: RID, axisVelocity: Vector2) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to axisVelocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_AXIS_VELOCITY, NIL)
  }

  /**
   * Sets the physics layer or layers a body belongs to.
   */
  fun bodySetCollisionLayer(body: RID, layer: Long) {
    TransferContext.writeArguments(_RID to body, LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_COLLISION_LAYER, NIL)
  }

  /**
   * Sets the physics layer or layers a body can collide with.
   */
  fun bodySetCollisionMask(body: RID, mask: Long) {
    TransferContext.writeArguments(_RID to body, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_COLLISION_MASK, NIL)
  }

  /**
   * Sets the continuous collision detection mode using one of the [enum CCDMode] constants.
   *
   * Continuous collision detection tries to predict where a moving body will collide, instead of moving it and correcting its movement if it collided.
   */
  fun bodySetContinuousCollisionDetectionMode(body: RID, mode: Long) {
    TransferContext.writeArguments(_RID to body, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_CONTINUOUS_COLLISION_DETECTION_MODE, NIL)
  }

  /**
   * Sets the function used to calculate physics for an object, if that object allows it (see [bodySetOmitForceIntegration]).
   */
  fun bodySetForceIntegrationCallback(
    body: RID,
    receiver: Object,
    method: String,
    userdata: Any? = null
  ) {
    TransferContext.writeArguments(_RID to body, OBJECT to receiver, STRING to method, ANY to
        userdata)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_FORCE_INTEGRATION_CALLBACK, NIL)
  }

  /**
   * Sets the maximum contacts to report. Bodies can keep a log of the contacts with other bodies, this is enabled by setting the maximum amount of contacts reported to a number greater than 0.
   */
  fun bodySetMaxContactsReported(body: RID, amount: Long) {
    TransferContext.writeArguments(_RID to body, LONG to amount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_MAX_CONTACTS_REPORTED, NIL)
  }

  /**
   * Sets the body mode using one of the [enum BodyMode] constants.
   */
  fun bodySetMode(body: RID, mode: Long) {
    TransferContext.writeArguments(_RID to body, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_MODE, NIL)
  }

  /**
   * Sets whether a body uses a callback function to calculate its own physics (see [bodySetForceIntegrationCallback]).
   */
  fun bodySetOmitForceIntegration(body: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_OMIT_FORCE_INTEGRATION, NIL)
  }

  /**
   * Sets a body parameter. See [enum BodyParameter] for a list of available parameters.
   */
  fun bodySetParam(
    body: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to body, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_PARAM, NIL)
  }

  /**
   * Substitutes a given body shape by another. The old shape is selected by its index, the new one by its [RID].
   */
  fun bodySetShape(
    body: RID,
    shapeIdx: Long,
    shape: RID
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, _RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_SHAPE, NIL)
  }

  /**
   * Enables one way collision on body if `enable` is `true`.
   */
  fun bodySetShapeAsOneWayCollision(
    body: RID,
    shapeIdx: Long,
    enable: Boolean,
    margin: Double
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, BOOL to enable, DOUBLE to margin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_SHAPE_AS_ONE_WAY_COLLISION, NIL)
  }

  /**
   * Disables shape in body if `disable` is `true`.
   */
  fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Long,
    disabled: Boolean
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_SHAPE_DISABLED, NIL)
  }

  /**
   * Sets metadata of a shape within a body. This metadata is different from [godot.Object.setMeta], and can be retrieved on shape queries.
   */
  fun bodySetShapeMetadata(
    body: RID,
    shapeIdx: Long,
    metadata: Any?
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, ANY to metadata)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_SHAPE_METADATA, NIL)
  }

  /**
   * Sets the transform matrix for a body shape.
   */
  fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Long,
    transform: Transform2D
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_SHAPE_TRANSFORM, NIL)
  }

  /**
   * Assigns a space to the body (see [spaceCreate]).
   */
  fun bodySetSpace(body: RID, space: RID) {
    TransferContext.writeArguments(_RID to body, _RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_SPACE, NIL)
  }

  /**
   * Sets a body state using one of the [enum BodyState] constants.
   *
   * Note that the method doesn't take effect immediately. The state will change on the next physics frame.
   */
  fun bodySetState(
    body: RID,
    state: Long,
    value: Any?
  ) {
    TransferContext.writeArguments(_RID to body, LONG to state, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_STATE, NIL)
  }

  /**
   * Returns `true` if a collision would result from moving in the given direction from a given point in space. Margin increases the size of the shapes involved in the collision detection. [godot.Physics2DTestMotionResult] can be passed to return additional information in.
   */
  fun bodyTestMotion(
    body: RID,
    from: Transform2D,
    motion: Vector2,
    infiniteInertia: Boolean,
    margin: Double = 0.08,
    result: Physics2DTestMotionResult? = null
  ): Boolean {
    TransferContext.writeArguments(_RID to body, TRANSFORM2D to from, VECTOR2 to motion, BOOL to
        infiniteInertia, DOUBLE to margin, OBJECT to result)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_TEST_MOTION,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  fun capsuleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_CAPSULE_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  fun circleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_CIRCLE_SHAPE_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  fun concavePolygonShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_CONCAVE_POLYGON_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  fun convexPolygonShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_CONVEX_POLYGON_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Creates a damped spring joint between two bodies. If not specified, the second body is assumed to be the joint itself.
   */
  fun dampedSpringJointCreate(
    anchorA: Vector2,
    anchorB: Vector2,
    bodyA: RID,
    bodyB: RID = RID()
  ): RID {
    TransferContext.writeArguments(VECTOR2 to anchorA, VECTOR2 to anchorB, _RID to bodyA, _RID to
        bodyB)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_DAMPED_SPRING_JOINT_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the value of a damped spring joint parameter.
   */
  fun dampedStringJointGetParam(joint: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to joint, LONG to param)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_DAMPED_STRING_JOINT_GET_PARAM, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets a damped spring joint parameter. See [enum DampedStringParam] for a list of available parameters.
   */
  fun dampedStringJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_DAMPED_STRING_JOINT_SET_PARAM, NIL)
  }

  /**
   * Destroys any of the objects created by Physics2DServer. If the [RID] passed is not one of the objects that can be created by Physics2DServer, an error will be sent to the console.
   */
  fun freeRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_FREE_RID, NIL)
  }

  /**
   * Returns information about the current state of the 2D physics engine. See [enum ProcessInfo] for a list of available states.
   */
  fun getProcessInfo(processInfo: Long): Long {
    TransferContext.writeArguments(LONG to processInfo)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_GET_PROCESS_INFO,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Creates a groove joint between two bodies. If not specified, the bodies are assumed to be the joint itself.
   */
  fun grooveJointCreate(
    groove1A: Vector2,
    groove2A: Vector2,
    anchorB: Vector2,
    bodyA: RID = RID(),
    bodyB: RID = RID()
  ): RID {
    TransferContext.writeArguments(VECTOR2 to groove1A, VECTOR2 to groove2A, VECTOR2 to anchorB,
        _RID to bodyA, _RID to bodyB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_GROOVE_JOINT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the value of a joint parameter.
   */
  fun jointGetParam(joint: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to joint, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_JOINT_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a joint's type (see [enum JointType]).
   */
  fun jointGetType(joint: RID): Physics2DServer.JointType {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_JOINT_GET_TYPE,
        LONG)
    return Physics2DServer.JointType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets a joint parameter. See [enum JointParam] for a list of available parameters.
   */
  fun jointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_JOINT_SET_PARAM,
        NIL)
  }

  /**
   *
   */
  fun lineShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_LINE_SHAPE_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Creates a pin joint between two bodies. If not specified, the second body is assumed to be the joint itself.
   */
  fun pinJointCreate(
    anchor: Vector2,
    bodyA: RID,
    bodyB: RID = RID()
  ): RID {
    TransferContext.writeArguments(VECTOR2 to anchor, _RID to bodyA, _RID to bodyB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_PIN_JOINT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  fun rayShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_RAY_SHAPE_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  fun rectangleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_RECTANGLE_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  fun segmentShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SEGMENT_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Activates or deactivates the 2D physics engine.
   */
  fun setActive(active: Boolean) {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SET_ACTIVE, NIL)
  }

  /**
   * Returns the shape data.
   */
  fun shapeGetData(shape: RID): Any? {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SHAPE_GET_DATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns a shape's type (see [enum ShapeType]).
   */
  fun shapeGetType(shape: RID): Physics2DServer.ShapeType {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SHAPE_GET_TYPE,
        LONG)
    return Physics2DServer.ShapeType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the shape data that defines its shape and size. The data to be passed depends on the kind of shape created [shapeGetType].
   */
  fun shapeSetData(shape: RID, data: Any?) {
    TransferContext.writeArguments(_RID to shape, ANY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SHAPE_SET_DATA, NIL)
  }

  /**
   * Creates a space. A space is a collection of parameters for the physics engine that can be assigned to an area or a body. It can be assigned to an area with [areaSetSpace], or to a body with [bodySetSpace].
   */
  fun spaceCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SPACE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the state of a space, a [godot.Physics2DDirectSpaceState]. This object can be used to make collision/intersection queries.
   */
  fun spaceGetDirectState(space: RID): Physics2DDirectSpaceState? {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SPACE_GET_DIRECT_STATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Physics2DDirectSpaceState?
  }

  /**
   * Returns the value of a space parameter.
   */
  fun spaceGetParam(space: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to space, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SPACE_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns whether the space is active.
   */
  fun spaceIsActive(space: RID): Boolean {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SPACE_IS_ACTIVE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Marks a space as active. It will not have an effect, unless it is assigned to an area or body.
   */
  fun spaceSetActive(space: RID, active: Boolean) {
    TransferContext.writeArguments(_RID to space, BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SPACE_SET_ACTIVE,
        NIL)
  }

  /**
   * Sets the value for a space parameter. See [enum SpaceParameter] for a list of available parameters.
   */
  fun spaceSetParam(
    space: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to space, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SPACE_SET_PARAM,
        NIL)
  }

  enum class ProcessInfo(
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
    INFO_ISLAND_COUNT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class AreaBodyStatus(
    id: Long
  ) {
    /**
     * The value of the first parameter and area callback function receives, when an object enters one of its shapes.
     */
    AREA_BODY_ADDED(0),

    /**
     * The value of the first parameter and area callback function receives, when an object exits one of its shapes.
     */
    AREA_BODY_REMOVED(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DampedStringParam(
    id: Long
  ) {
    /**
     * Sets the resting length of the spring joint. The joint will always try to go to back this length when pulled apart.
     */
    DAMPED_STRING_REST_LENGTH(0),

    /**
     * Sets the stiffness of the spring joint. The joint applies a force equal to the stiffness times the distance from its resting length.
     */
    DAMPED_STRING_STIFFNESS(1),

    /**
     * Sets the damping ratio of the spring joint. A value of 0 indicates an undamped spring, while 1 causes the system to reach equilibrium as fast as possible (critical damping).
     */
    DAMPED_STRING_DAMPING(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BodyMode(
    id: Long
  ) {
    /**
     * Constant for static bodies.
     */
    BODY_MODE_STATIC(0),

    /**
     * Constant for kinematic bodies.
     */
    BODY_MODE_KINEMATIC(1),

    /**
     * Constant for rigid bodies.
     */
    BODY_MODE_RIGID(2),

    /**
     * Constant for rigid bodies in character mode. In this mode, a body can not rotate, and only its linear velocity is affected by physics.
     */
    BODY_MODE_CHARACTER(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShapeType(
    id: Long
  ) {
    /**
     * This is the constant for creating line shapes. A line shape is an infinite line with an origin point, and a normal. Thus, it can be used for front/behind checks.
     */
    SHAPE_LINE(0),

    /**
     *
     */
    SHAPE_RAY(1),

    /**
     * This is the constant for creating segment shapes. A segment shape is a line from a point A to a point B. It can be checked for intersections.
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
    SHAPE_CUSTOM(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class JointParam(
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
    JOINT_PARAM_MAX_FORCE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SpaceParameter(
    id: Long
  ) {
    /**
     * Constant to set/get the maximum distance a pair of bodies has to move before their collision status has to be recalculated.
     */
    SPACE_PARAM_CONTACT_RECYCLE_RADIUS(0),

    /**
     * Constant to set/get the maximum distance a shape can be from another before they are considered separated.
     */
    SPACE_PARAM_CONTACT_MAX_SEPARATION(1),

    /**
     * Constant to set/get the maximum distance a shape can penetrate another shape before it is considered a collision.
     */
    SPACE_PARAM_BODY_MAX_ALLOWED_PENETRATION(2),

    /**
     * Constant to set/get the threshold linear velocity of activity. A body marked as potentially inactive for both linear and angular velocity will be put to sleep after the time given.
     */
    SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD(3),

    /**
     * Constant to set/get the threshold angular velocity of activity. A body marked as potentially inactive for both linear and angular velocity will be put to sleep after the time given.
     */
    SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD(4),

    /**
     * Constant to set/get the maximum time of activity. A body marked as potentially inactive for both linear and angular velocity will be put to sleep after this time.
     */
    SPACE_PARAM_BODY_TIME_TO_SLEEP(5),

    /**
     * Constant to set/get the default solver bias for all physics constraints. A solver bias is a factor controlling how much two objects "rebound", after violating a constraint, to avoid leaving them in that state because of numerical imprecision.
     */
    SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS(6),

    /**
     *
     */
    SPACE_PARAM_TEST_MOTION_MIN_CONTACT_DEPTH(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class JointType(
    id: Long
  ) {
    /**
     * Constant to create pin joints.
     */
    JOINT_PIN(0),

    /**
     * Constant to create groove joints.
     */
    JOINT_GROOVE(1),

    /**
     * Constant to create damped spring joints.
     */
    JOINT_DAMPED_SPRING(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CCDMode(
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
    CCD_MODE_CAST_SHAPE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BodyState(
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
    BODY_STATE_CAN_SLEEP(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BodyParameter(
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
     * Constant to set/get a body's gravity multiplier.
     */
    BODY_PARAM_GRAVITY_SCALE(4),

    /**
     * Constant to set/get a body's linear dampening factor.
     */
    BODY_PARAM_LINEAR_DAMP(5),

    /**
     * Constant to set/get a body's angular dampening factor.
     */
    BODY_PARAM_ANGULAR_DAMP(6),

    /**
     * Represents the size of the [enum BodyParameter] enum.
     */
    BODY_PARAM_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class AreaSpaceOverrideMode(
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
    AREA_SPACE_OVERRIDE_REPLACE_COMBINE(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class AreaParameter(
    id: Long
  ) {
    /**
     * Constant to set/get gravity strength in an area.
     */
    AREA_PARAM_GRAVITY(0),

    /**
     * Constant to set/get gravity vector/center in an area.
     */
    AREA_PARAM_GRAVITY_VECTOR(1),

    /**
     * Constant to set/get whether the gravity vector of an area is a direction, or a center point.
     */
    AREA_PARAM_GRAVITY_IS_POINT(2),

    /**
     * Constant to set/get the falloff factor for point gravity of an area. The greater this value is, the faster the strength of gravity decreases with the square of distance.
     */
    AREA_PARAM_GRAVITY_DISTANCE_SCALE(3),

    /**
     * This constant was used to set/get the falloff factor for point gravity. It has been superseded by [AREA_PARAM_GRAVITY_DISTANCE_SCALE].
     */
    AREA_PARAM_GRAVITY_POINT_ATTENUATION(4),

    /**
     * Constant to set/get the linear dampening factor of an area.
     */
    AREA_PARAM_LINEAR_DAMP(5),

    /**
     * Constant to set/get the angular dampening factor of an area.
     */
    AREA_PARAM_ANGULAR_DAMP(6),

    /**
     * Constant to set/get the priority (order of processing) of an area.
     */
    AREA_PARAM_PRIORITY(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
