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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
object Physics2DServer : Object() {
  final const val AREA_BODY_ADDED: Long = 0

  final const val AREA_BODY_REMOVED: Long = 1

  final const val AREA_PARAM_ANGULAR_DAMP: Long = 6

  final const val AREA_PARAM_GRAVITY: Long = 0

  final const val AREA_PARAM_GRAVITY_DISTANCE_SCALE: Long = 3

  final const val AREA_PARAM_GRAVITY_IS_POINT: Long = 2

  final const val AREA_PARAM_GRAVITY_POINT_ATTENUATION: Long = 4

  final const val AREA_PARAM_GRAVITY_VECTOR: Long = 1

  final const val AREA_PARAM_LINEAR_DAMP: Long = 5

  final const val AREA_PARAM_PRIORITY: Long = 7

  final const val AREA_SPACE_OVERRIDE_COMBINE: Long = 1

  final const val AREA_SPACE_OVERRIDE_COMBINE_REPLACE: Long = 2

  final const val AREA_SPACE_OVERRIDE_DISABLED: Long = 0

  final const val AREA_SPACE_OVERRIDE_REPLACE: Long = 3

  final const val AREA_SPACE_OVERRIDE_REPLACE_COMBINE: Long = 4

  final const val BODY_MODE_CHARACTER: Long = 3

  final const val BODY_MODE_KINEMATIC: Long = 1

  final const val BODY_MODE_RIGID: Long = 2

  final const val BODY_MODE_STATIC: Long = 0

  final const val BODY_PARAM_ANGULAR_DAMP: Long = 6

  final const val BODY_PARAM_BOUNCE: Long = 0

  final const val BODY_PARAM_FRICTION: Long = 1

  final const val BODY_PARAM_GRAVITY_SCALE: Long = 4

  final const val BODY_PARAM_INERTIA: Long = 3

  final const val BODY_PARAM_LINEAR_DAMP: Long = 5

  final const val BODY_PARAM_MASS: Long = 2

  final const val BODY_PARAM_MAX: Long = 7

  final const val BODY_STATE_ANGULAR_VELOCITY: Long = 2

  final const val BODY_STATE_CAN_SLEEP: Long = 4

  final const val BODY_STATE_LINEAR_VELOCITY: Long = 1

  final const val BODY_STATE_SLEEPING: Long = 3

  final const val BODY_STATE_TRANSFORM: Long = 0

  final const val CCD_MODE_CAST_RAY: Long = 1

  final const val CCD_MODE_CAST_SHAPE: Long = 2

  final const val CCD_MODE_DISABLED: Long = 0

  final const val DAMPED_STRING_DAMPING: Long = 2

  final const val DAMPED_STRING_REST_LENGTH: Long = 0

  final const val DAMPED_STRING_STIFFNESS: Long = 1

  final const val INFO_ACTIVE_OBJECTS: Long = 0

  final const val INFO_COLLISION_PAIRS: Long = 1

  final const val INFO_ISLAND_COUNT: Long = 2

  final const val JOINT_DAMPED_SPRING: Long = 2

  final const val JOINT_GROOVE: Long = 1

  final const val JOINT_PARAM_BIAS: Long = 0

  final const val JOINT_PARAM_MAX_BIAS: Long = 1

  final const val JOINT_PARAM_MAX_FORCE: Long = 2

  final const val JOINT_PIN: Long = 0

  final const val SHAPE_CAPSULE: Long = 5

  final const val SHAPE_CIRCLE: Long = 3

  final const val SHAPE_CONCAVE_POLYGON: Long = 7

  final const val SHAPE_CONVEX_POLYGON: Long = 6

  final const val SHAPE_CUSTOM: Long = 8

  final const val SHAPE_LINE: Long = 0

  final const val SHAPE_RAY: Long = 1

  final const val SHAPE_RECTANGLE: Long = 4

  final const val SHAPE_SEGMENT: Long = 2

  final const val SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD: Long = 4

  final const val SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD: Long = 3

  final const val SPACE_PARAM_BODY_MAX_ALLOWED_PENETRATION: Long = 2

  final const val SPACE_PARAM_BODY_TIME_TO_SLEEP: Long = 5

  final const val SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS: Long = 6

  final const val SPACE_PARAM_CONTACT_MAX_SEPARATION: Long = 1

  final const val SPACE_PARAM_CONTACT_RECYCLE_RADIUS: Long = 0

  final const val SPACE_PARAM_TEST_MOTION_MIN_CONTACT_DEPTH: Long = 7

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_PHYSICS2DSERVER)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

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

  fun areaAttachCanvasInstanceId(area: RID, id: Long) {
    TransferContext.writeArguments(_RID to area, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_ATTACH_CANVAS_INSTANCE_ID, NIL)
  }

  fun areaAttachObjectInstanceId(area: RID, id: Long) {
    TransferContext.writeArguments(_RID to area, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  fun areaClearShapes(area: RID) {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_CLEAR_SHAPES,
        NIL)
  }

  fun areaCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun areaGetCanvasInstanceId(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_CANVAS_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun areaGetObjectInstanceId(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_OBJECT_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun areaGetParam(area: RID, param: Long): Any? {
    TransferContext.writeArguments(_RID to area, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_PARAM, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun areaGetShape(area: RID, shapeIdx: Long): RID {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_SHAPE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun areaGetShapeCount(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun areaGetShapeTransform(area: RID, shapeIdx: Long): Transform2D {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_SHAPE_TRANSFORM, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  fun areaGetSpace(area: RID): RID {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_SPACE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun areaGetSpaceOverrideMode(area: RID): Physics2DServer.AreaSpaceOverrideMode {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_SPACE_OVERRIDE_MODE, LONG)
    return Physics2DServer.AreaSpaceOverrideMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun areaGetTransform(area: RID): Transform2D {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_GET_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  fun areaRemoveShape(area: RID, shapeIdx: Long) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_REMOVE_SHAPE,
        NIL)
  }

  fun areaSetAreaMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    TransferContext.writeArguments(_RID to area, OBJECT to receiver, STRING to method)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_AREA_MONITOR_CALLBACK, NIL)
  }

  fun areaSetCollisionLayer(area: RID, layer: Long) {
    TransferContext.writeArguments(_RID to area, LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_COLLISION_LAYER, NIL)
  }

  fun areaSetCollisionMask(area: RID, mask: Long) {
    TransferContext.writeArguments(_RID to area, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_COLLISION_MASK, NIL)
  }

  fun areaSetMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    TransferContext.writeArguments(_RID to area, OBJECT to receiver, STRING to method)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_MONITOR_CALLBACK, NIL)
  }

  fun areaSetMonitorable(area: RID, monitorable: Boolean) {
    TransferContext.writeArguments(_RID to area, BOOL to monitorable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_MONITORABLE, NIL)
  }

  fun areaSetParam(
    area: RID,
    param: Long,
    value: Any?
  ) {
    TransferContext.writeArguments(_RID to area, LONG to param, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_PARAM, NIL)
  }

  fun areaSetShape(
    area: RID,
    shapeIdx: Long,
    shape: RID
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx, _RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_SHAPE, NIL)
  }

  fun areaSetShapeDisabled(
    area: RID,
    shapeIdx: Long,
    disabled: Boolean
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_SHAPE_DISABLED, NIL)
  }

  fun areaSetShapeTransform(
    area: RID,
    shapeIdx: Long,
    transform: Transform2D
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_SHAPE_TRANSFORM, NIL)
  }

  fun areaSetSpace(area: RID, space: RID) {
    TransferContext.writeArguments(_RID to area, _RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_SPACE, NIL)
  }

  fun areaSetSpaceOverrideMode(area: RID, mode: Long) {
    TransferContext.writeArguments(_RID to area, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_SPACE_OVERRIDE_MODE, NIL)
  }

  fun areaSetTransform(area: RID, transform: Transform2D) {
    TransferContext.writeArguments(_RID to area, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_AREA_SET_TRANSFORM,
        NIL)
  }

  fun bodyAddCentralForce(body: RID, force: Vector2) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_ADD_CENTRAL_FORCE, NIL)
  }

  fun bodyAddCollisionException(body: RID, exceptedBody: RID) {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_ADD_COLLISION_EXCEPTION, NIL)
  }

  fun bodyAddForce(
    body: RID,
    offset: Vector2,
    force: Vector2
  ) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to offset, VECTOR2 to force)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_ADD_FORCE, NIL)
  }

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

  fun bodyAddTorque(body: RID, torque: Double) {
    TransferContext.writeArguments(_RID to body, DOUBLE to torque)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_ADD_TORQUE,
        NIL)
  }

  fun bodyApplyCentralImpulse(body: RID, impulse: Vector2) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_APPLY_CENTRAL_IMPULSE, NIL)
  }

  fun bodyApplyImpulse(
    body: RID,
    position: Vector2,
    impulse: Vector2
  ) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to position, VECTOR2 to impulse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_APPLY_IMPULSE,
        NIL)
  }

  fun bodyApplyTorqueImpulse(body: RID, impulse: Double) {
    TransferContext.writeArguments(_RID to body, DOUBLE to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_APPLY_TORQUE_IMPULSE, NIL)
  }

  fun bodyAttachCanvasInstanceId(body: RID, id: Long) {
    TransferContext.writeArguments(_RID to body, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_ATTACH_CANVAS_INSTANCE_ID, NIL)
  }

  fun bodyAttachObjectInstanceId(body: RID, id: Long) {
    TransferContext.writeArguments(_RID to body, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  fun bodyClearShapes(body: RID) {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_CLEAR_SHAPES,
        NIL)
  }

  fun bodyCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun bodyGetCanvasInstanceId(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_CANVAS_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun bodyGetCollisionLayer(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_COLLISION_LAYER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun bodyGetCollisionMask(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_COLLISION_MASK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun bodyGetContinuousCollisionDetectionMode(body: RID): Physics2DServer.CCDMode {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_CONTINUOUS_COLLISION_DETECTION_MODE, LONG)
    return Physics2DServer.CCDMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun bodyGetDirectState(body: RID): Physics2DDirectBodyState? {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_DIRECT_STATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Physics2DDirectBodyState?
  }

  fun bodyGetMaxContactsReported(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_MAX_CONTACTS_REPORTED, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun bodyGetMode(body: RID): Physics2DServer.BodyMode {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_MODE, LONG)
    return Physics2DServer.BodyMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun bodyGetObjectInstanceId(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_OBJECT_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun bodyGetParam(body: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to body, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun bodyGetShape(body: RID, shapeIdx: Long): RID {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_SHAPE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun bodyGetShapeCount(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun bodyGetShapeMetadata(body: RID, shapeIdx: Long): Any? {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_SHAPE_METADATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun bodyGetShapeTransform(body: RID, shapeIdx: Long): Transform2D {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_SHAPE_TRANSFORM, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  fun bodyGetSpace(body: RID): RID {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_SPACE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun bodyGetState(body: RID, state: Long): Any? {
    TransferContext.writeArguments(_RID to body, LONG to state)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_GET_STATE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_IS_OMITTING_FORCE_INTEGRATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun bodyRemoveCollisionException(body: RID, exceptedBody: RID) {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_REMOVE_COLLISION_EXCEPTION, NIL)
  }

  fun bodyRemoveShape(body: RID, shapeIdx: Long) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_REMOVE_SHAPE,
        NIL)
  }

  fun bodySetAxisVelocity(body: RID, axisVelocity: Vector2) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to axisVelocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_AXIS_VELOCITY, NIL)
  }

  fun bodySetCollisionLayer(body: RID, layer: Long) {
    TransferContext.writeArguments(_RID to body, LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_COLLISION_LAYER, NIL)
  }

  fun bodySetCollisionMask(body: RID, mask: Long) {
    TransferContext.writeArguments(_RID to body, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_COLLISION_MASK, NIL)
  }

  fun bodySetContinuousCollisionDetectionMode(body: RID, mode: Long) {
    TransferContext.writeArguments(_RID to body, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_CONTINUOUS_COLLISION_DETECTION_MODE, NIL)
  }

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

  fun bodySetMaxContactsReported(body: RID, amount: Long) {
    TransferContext.writeArguments(_RID to body, LONG to amount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_MAX_CONTACTS_REPORTED, NIL)
  }

  fun bodySetMode(body: RID, mode: Long) {
    TransferContext.writeArguments(_RID to body, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_MODE, NIL)
  }

  fun bodySetOmitForceIntegration(body: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_OMIT_FORCE_INTEGRATION, NIL)
  }

  fun bodySetParam(
    body: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to body, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_PARAM, NIL)
  }

  fun bodySetShape(
    body: RID,
    shapeIdx: Long,
    shape: RID
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, _RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_SHAPE, NIL)
  }

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

  fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Long,
    disabled: Boolean
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_SHAPE_DISABLED, NIL)
  }

  fun bodySetShapeMetadata(
    body: RID,
    shapeIdx: Long,
    metadata: Any?
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, ANY to metadata)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_SHAPE_METADATA, NIL)
  }

  fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Long,
    transform: Transform2D
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_SHAPE_TRANSFORM, NIL)
  }

  fun bodySetSpace(body: RID, space: RID) {
    TransferContext.writeArguments(_RID to body, _RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_SPACE, NIL)
  }

  fun bodySetState(
    body: RID,
    state: Long,
    value: Any?
  ) {
    TransferContext.writeArguments(_RID to body, LONG to state, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_BODY_SET_STATE, NIL)
  }

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

  fun capsuleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_CAPSULE_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun circleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_CIRCLE_SHAPE_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun concavePolygonShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_CONCAVE_POLYGON_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun convexPolygonShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_CONVEX_POLYGON_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

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

  fun dampedStringJointGetParam(joint: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to joint, LONG to param)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_DAMPED_STRING_JOINT_GET_PARAM, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun dampedStringJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_DAMPED_STRING_JOINT_SET_PARAM, NIL)
  }

  fun freeRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_FREE_RID, NIL)
  }

  fun getProcessInfo(processInfo: Long): Long {
    TransferContext.writeArguments(LONG to processInfo)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_GET_PROCESS_INFO,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

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

  fun jointGetParam(joint: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to joint, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_JOINT_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun jointGetType(joint: RID): Physics2DServer.JointType {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_JOINT_GET_TYPE,
        LONG)
    return Physics2DServer.JointType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun jointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_JOINT_SET_PARAM,
        NIL)
  }

  fun lineShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_LINE_SHAPE_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

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

  fun rayShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_RAY_SHAPE_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun rectangleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_RECTANGLE_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun segmentShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SEGMENT_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun setActive(active: Boolean) {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SET_ACTIVE, NIL)
  }

  fun shapeGetData(shape: RID): Any? {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SHAPE_GET_DATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun shapeGetType(shape: RID): Physics2DServer.ShapeType {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SHAPE_GET_TYPE,
        LONG)
    return Physics2DServer.ShapeType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun shapeSetData(shape: RID, data: Any?) {
    TransferContext.writeArguments(_RID to shape, ANY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SHAPE_SET_DATA, NIL)
  }

  fun spaceCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SPACE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun spaceGetDirectState(space: RID): Physics2DDirectSpaceState? {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SPACE_GET_DIRECT_STATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Physics2DDirectSpaceState?
  }

  fun spaceGetParam(space: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to space, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SPACE_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun spaceIsActive(space: RID): Boolean {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SPACE_IS_ACTIVE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun spaceSetActive(space: RID, active: Boolean) {
    TransferContext.writeArguments(_RID to space, BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICS2DSERVER_SPACE_SET_ACTIVE,
        NIL)
  }

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
    INFO_ACTIVE_OBJECTS(0),

    INFO_COLLISION_PAIRS(1),

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
    AREA_BODY_ADDED(0),

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
    DAMPED_STRING_REST_LENGTH(0),

    DAMPED_STRING_STIFFNESS(1),

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
    BODY_MODE_STATIC(0),

    BODY_MODE_KINEMATIC(1),

    BODY_MODE_RIGID(2),

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
    SHAPE_LINE(0),

    SHAPE_RAY(1),

    SHAPE_SEGMENT(2),

    SHAPE_CIRCLE(3),

    SHAPE_RECTANGLE(4),

    SHAPE_CAPSULE(5),

    SHAPE_CONVEX_POLYGON(6),

    SHAPE_CONCAVE_POLYGON(7),

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
    JOINT_PARAM_BIAS(0),

    JOINT_PARAM_MAX_BIAS(1),

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
    SPACE_PARAM_CONTACT_RECYCLE_RADIUS(0),

    SPACE_PARAM_CONTACT_MAX_SEPARATION(1),

    SPACE_PARAM_BODY_MAX_ALLOWED_PENETRATION(2),

    SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD(3),

    SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD(4),

    SPACE_PARAM_BODY_TIME_TO_SLEEP(5),

    SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS(6),

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
    JOINT_PIN(0),

    JOINT_GROOVE(1),

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
    CCD_MODE_DISABLED(0),

    CCD_MODE_CAST_RAY(1),

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
    BODY_STATE_TRANSFORM(0),

    BODY_STATE_LINEAR_VELOCITY(1),

    BODY_STATE_ANGULAR_VELOCITY(2),

    BODY_STATE_SLEEPING(3),

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
    BODY_PARAM_BOUNCE(0),

    BODY_PARAM_FRICTION(1),

    BODY_PARAM_MASS(2),

    BODY_PARAM_INERTIA(3),

    BODY_PARAM_GRAVITY_SCALE(4),

    BODY_PARAM_LINEAR_DAMP(5),

    BODY_PARAM_ANGULAR_DAMP(6),

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
    AREA_SPACE_OVERRIDE_DISABLED(0),

    AREA_SPACE_OVERRIDE_COMBINE(1),

    AREA_SPACE_OVERRIDE_COMBINE_REPLACE(2),

    AREA_SPACE_OVERRIDE_REPLACE(3),

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
    AREA_PARAM_GRAVITY(0),

    AREA_PARAM_GRAVITY_VECTOR(1),

    AREA_PARAM_GRAVITY_IS_POINT(2),

    AREA_PARAM_GRAVITY_DISTANCE_SCALE(3),

    AREA_PARAM_GRAVITY_POINT_ATTENUATION(4),

    AREA_PARAM_LINEAR_DAMP(5),

    AREA_PARAM_ANGULAR_DAMP(6),

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
