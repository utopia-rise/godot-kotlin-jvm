// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.PhysicsServer
import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
object PhysicsServer : Object() {
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

  final const val BODY_AXIS_ANGULAR_X: Long = 8

  final const val BODY_AXIS_ANGULAR_Y: Long = 16

  final const val BODY_AXIS_ANGULAR_Z: Long = 32

  final const val BODY_AXIS_LINEAR_X: Long = 1

  final const val BODY_AXIS_LINEAR_Y: Long = 2

  final const val BODY_AXIS_LINEAR_Z: Long = 4

  final const val BODY_MODE_CHARACTER: Long = 3

  final const val BODY_MODE_KINEMATIC: Long = 1

  final const val BODY_MODE_RIGID: Long = 2

  final const val BODY_MODE_STATIC: Long = 0

  final const val BODY_PARAM_ANGULAR_DAMP: Long = 5

  final const val BODY_PARAM_BOUNCE: Long = 0

  final const val BODY_PARAM_FRICTION: Long = 1

  final const val BODY_PARAM_GRAVITY_SCALE: Long = 3

  final const val BODY_PARAM_LINEAR_DAMP: Long = 4

  final const val BODY_PARAM_MASS: Long = 2

  final const val BODY_PARAM_MAX: Long = 6

  final const val BODY_STATE_ANGULAR_VELOCITY: Long = 2

  final const val BODY_STATE_CAN_SLEEP: Long = 4

  final const val BODY_STATE_LINEAR_VELOCITY: Long = 1

  final const val BODY_STATE_SLEEPING: Long = 3

  final const val BODY_STATE_TRANSFORM: Long = 0

  final const val CONE_TWIST_JOINT_BIAS: Long = 2

  final const val CONE_TWIST_JOINT_RELAXATION: Long = 4

  final const val CONE_TWIST_JOINT_SOFTNESS: Long = 3

  final const val CONE_TWIST_JOINT_SWING_SPAN: Long = 0

  final const val CONE_TWIST_JOINT_TWIST_SPAN: Long = 1

  final const val G6DOF_JOINT_ANGULAR_DAMPING: Long = 13

  final const val G6DOF_JOINT_ANGULAR_ERP: Long = 16

  final const val G6DOF_JOINT_ANGULAR_FORCE_LIMIT: Long = 15

  final const val G6DOF_JOINT_ANGULAR_LIMIT_SOFTNESS: Long = 12

  final const val G6DOF_JOINT_ANGULAR_LOWER_LIMIT: Long = 10

  final const val G6DOF_JOINT_ANGULAR_MOTOR_FORCE_LIMIT: Long = 18

  final const val G6DOF_JOINT_ANGULAR_MOTOR_TARGET_VELOCITY: Long = 17

  final const val G6DOF_JOINT_ANGULAR_RESTITUTION: Long = 14

  final const val G6DOF_JOINT_ANGULAR_UPPER_LIMIT: Long = 11

  final const val G6DOF_JOINT_FLAG_ENABLE_ANGULAR_LIMIT: Long = 1

  final const val G6DOF_JOINT_FLAG_ENABLE_LINEAR_LIMIT: Long = 0

  final const val G6DOF_JOINT_FLAG_ENABLE_LINEAR_MOTOR: Long = 5

  final const val G6DOF_JOINT_FLAG_ENABLE_MOTOR: Long = 4

  final const val G6DOF_JOINT_LINEAR_DAMPING: Long = 4

  final const val G6DOF_JOINT_LINEAR_LIMIT_SOFTNESS: Long = 2

  final const val G6DOF_JOINT_LINEAR_LOWER_LIMIT: Long = 0

  final const val G6DOF_JOINT_LINEAR_MOTOR_FORCE_LIMIT: Long = 6

  final const val G6DOF_JOINT_LINEAR_MOTOR_TARGET_VELOCITY: Long = 5

  final const val G6DOF_JOINT_LINEAR_RESTITUTION: Long = 3

  final const val G6DOF_JOINT_LINEAR_UPPER_LIMIT: Long = 1

  final const val HINGE_JOINT_BIAS: Long = 0

  final const val HINGE_JOINT_FLAG_ENABLE_MOTOR: Long = 1

  final const val HINGE_JOINT_FLAG_USE_LIMIT: Long = 0

  final const val HINGE_JOINT_LIMIT_BIAS: Long = 3

  final const val HINGE_JOINT_LIMIT_LOWER: Long = 2

  final const val HINGE_JOINT_LIMIT_RELAXATION: Long = 5

  final const val HINGE_JOINT_LIMIT_SOFTNESS: Long = 4

  final const val HINGE_JOINT_LIMIT_UPPER: Long = 1

  final const val HINGE_JOINT_MOTOR_MAX_IMPULSE: Long = 7

  final const val HINGE_JOINT_MOTOR_TARGET_VELOCITY: Long = 6

  final const val INFO_ACTIVE_OBJECTS: Long = 0

  final const val INFO_COLLISION_PAIRS: Long = 1

  final const val INFO_ISLAND_COUNT: Long = 2

  final const val JOINT_6DOF: Long = 4

  final const val JOINT_CONE_TWIST: Long = 3

  final const val JOINT_HINGE: Long = 1

  final const val JOINT_PIN: Long = 0

  final const val JOINT_SLIDER: Long = 2

  final const val PIN_JOINT_BIAS: Long = 0

  final const val PIN_JOINT_DAMPING: Long = 1

  final const val PIN_JOINT_IMPULSE_CLAMP: Long = 2

  final const val SHAPE_BOX: Long = 3

  final const val SHAPE_CAPSULE: Long = 4

  final const val SHAPE_CONCAVE_POLYGON: Long = 7

  final const val SHAPE_CONVEX_POLYGON: Long = 6

  final const val SHAPE_CUSTOM: Long = 9

  final const val SHAPE_CYLINDER: Long = 5

  final const val SHAPE_HEIGHTMAP: Long = 8

  final const val SHAPE_PLANE: Long = 0

  final const val SHAPE_RAY: Long = 1

  final const val SHAPE_SPHERE: Long = 2

  final const val SLIDER_JOINT_ANGULAR_LIMIT_DAMPING: Long = 15

  final const val SLIDER_JOINT_ANGULAR_LIMIT_LOWER: Long = 12

  final const val SLIDER_JOINT_ANGULAR_LIMIT_RESTITUTION: Long = 14

  final const val SLIDER_JOINT_ANGULAR_LIMIT_SOFTNESS: Long = 13

  final const val SLIDER_JOINT_ANGULAR_LIMIT_UPPER: Long = 11

  final const val SLIDER_JOINT_ANGULAR_MOTION_DAMPING: Long = 18

  final const val SLIDER_JOINT_ANGULAR_MOTION_RESTITUTION: Long = 17

  final const val SLIDER_JOINT_ANGULAR_MOTION_SOFTNESS: Long = 16

  final const val SLIDER_JOINT_ANGULAR_ORTHOGONAL_DAMPING: Long = 21

  final const val SLIDER_JOINT_ANGULAR_ORTHOGONAL_RESTITUTION: Long = 20

  final const val SLIDER_JOINT_ANGULAR_ORTHOGONAL_SOFTNESS: Long = 19

  final const val SLIDER_JOINT_LINEAR_LIMIT_DAMPING: Long = 4

  final const val SLIDER_JOINT_LINEAR_LIMIT_LOWER: Long = 1

  final const val SLIDER_JOINT_LINEAR_LIMIT_RESTITUTION: Long = 3

  final const val SLIDER_JOINT_LINEAR_LIMIT_SOFTNESS: Long = 2

  final const val SLIDER_JOINT_LINEAR_LIMIT_UPPER: Long = 0

  final const val SLIDER_JOINT_LINEAR_MOTION_DAMPING: Long = 7

  final const val SLIDER_JOINT_LINEAR_MOTION_RESTITUTION: Long = 6

  final const val SLIDER_JOINT_LINEAR_MOTION_SOFTNESS: Long = 5

  final const val SLIDER_JOINT_LINEAR_ORTHOGONAL_DAMPING: Long = 10

  final const val SLIDER_JOINT_LINEAR_ORTHOGONAL_RESTITUTION: Long = 9

  final const val SLIDER_JOINT_LINEAR_ORTHOGONAL_SOFTNESS: Long = 8

  final const val SLIDER_JOINT_MAX: Long = 22

  final const val SPACE_PARAM_BODY_ANGULAR_VELOCITY_DAMP_RATIO: Long = 6

  final const val SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD: Long = 4

  final const val SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD: Long = 3

  final const val SPACE_PARAM_BODY_MAX_ALLOWED_PENETRATION: Long = 2

  final const val SPACE_PARAM_BODY_TIME_TO_SLEEP: Long = 5

  final const val SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS: Long = 7

  final const val SPACE_PARAM_CONTACT_MAX_SEPARATION: Long = 1

  final const val SPACE_PARAM_CONTACT_RECYCLE_RADIUS: Long = 0

  final const val SPACE_PARAM_TEST_MOTION_MIN_CONTACT_DEPTH: Long = 8

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_PHYSICSSERVER)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun areaAddShape(
    area: RID,
    shape: RID,
    transform: Transform = Transform(),
    disabled: Boolean = false
  ) {
    TransferContext.writeArguments(_RID to area, _RID to shape, TRANSFORM to transform, BOOL to
        disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_ADD_SHAPE, NIL)
  }

  fun areaAttachObjectInstanceId(area: RID, id: Long) {
    TransferContext.writeArguments(_RID to area, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  fun areaClearShapes(area: RID) {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_CLEAR_SHAPES,
        NIL)
  }

  fun areaCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun areaGetObjectInstanceId(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_OBJECT_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun areaGetParam(area: RID, param: Long): Any? {
    TransferContext.writeArguments(_RID to area, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_PARAM, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun areaGetShape(area: RID, shapeIdx: Long): RID {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_SHAPE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun areaGetShapeCount(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_SHAPE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun areaGetShapeTransform(area: RID, shapeIdx: Long): Transform {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_SHAPE_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  fun areaGetSpace(area: RID): RID {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_SPACE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun areaGetSpaceOverrideMode(area: RID): PhysicsServer.AreaSpaceOverrideMode {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_SPACE_OVERRIDE_MODE, LONG)
    return PhysicsServer.AreaSpaceOverrideMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun areaGetTransform(area: RID): Transform {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_TRANSFORM,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  fun areaIsRayPickable(area: RID): Boolean {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_IS_RAY_PICKABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun areaRemoveShape(area: RID, shapeIdx: Long) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_REMOVE_SHAPE,
        NIL)
  }

  fun areaSetAreaMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    TransferContext.writeArguments(_RID to area, OBJECT to receiver, STRING to method)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_AREA_MONITOR_CALLBACK, NIL)
  }

  fun areaSetCollisionLayer(area: RID, layer: Long) {
    TransferContext.writeArguments(_RID to area, LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_COLLISION_LAYER, NIL)
  }

  fun areaSetCollisionMask(area: RID, mask: Long) {
    TransferContext.writeArguments(_RID to area, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_COLLISION_MASK, NIL)
  }

  fun areaSetMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    TransferContext.writeArguments(_RID to area, OBJECT to receiver, STRING to method)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_MONITOR_CALLBACK, NIL)
  }

  fun areaSetMonitorable(area: RID, monitorable: Boolean) {
    TransferContext.writeArguments(_RID to area, BOOL to monitorable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_MONITORABLE,
        NIL)
  }

  fun areaSetParam(
    area: RID,
    param: Long,
    value: Any?
  ) {
    TransferContext.writeArguments(_RID to area, LONG to param, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_PARAM, NIL)
  }

  fun areaSetRayPickable(area: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to area, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_RAY_PICKABLE,
        NIL)
  }

  fun areaSetShape(
    area: RID,
    shapeIdx: Long,
    shape: RID
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx, _RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_SHAPE, NIL)
  }

  fun areaSetShapeDisabled(
    area: RID,
    shapeIdx: Long,
    disabled: Boolean
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_SHAPE_DISABLED, NIL)
  }

  fun areaSetShapeTransform(
    area: RID,
    shapeIdx: Long,
    transform: Transform
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_SHAPE_TRANSFORM, NIL)
  }

  fun areaSetSpace(area: RID, space: RID) {
    TransferContext.writeArguments(_RID to area, _RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_SPACE, NIL)
  }

  fun areaSetSpaceOverrideMode(area: RID, mode: Long) {
    TransferContext.writeArguments(_RID to area, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_SPACE_OVERRIDE_MODE, NIL)
  }

  fun areaSetTransform(area: RID, transform: Transform) {
    TransferContext.writeArguments(_RID to area, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_TRANSFORM,
        NIL)
  }

  fun bodyAddCentralForce(body: RID, force: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_ADD_CENTRAL_FORCE, NIL)
  }

  fun bodyAddCollisionException(body: RID, exceptedBody: RID) {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_ADD_COLLISION_EXCEPTION, NIL)
  }

  fun bodyAddForce(
    body: RID,
    force: Vector3,
    position: Vector3
  ) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_ADD_FORCE, NIL)
  }

  fun bodyAddShape(
    body: RID,
    shape: RID,
    transform: Transform = Transform(),
    disabled: Boolean = false
  ) {
    TransferContext.writeArguments(_RID to body, _RID to shape, TRANSFORM to transform, BOOL to
        disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_ADD_SHAPE, NIL)
  }

  fun bodyAddTorque(body: RID, torque: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_ADD_TORQUE, NIL)
  }

  fun bodyApplyCentralImpulse(body: RID, impulse: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_APPLY_CENTRAL_IMPULSE, NIL)
  }

  fun bodyApplyImpulse(
    body: RID,
    position: Vector3,
    impulse: Vector3
  ) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to position, VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_APPLY_IMPULSE,
        NIL)
  }

  fun bodyApplyTorqueImpulse(body: RID, impulse: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_APPLY_TORQUE_IMPULSE, NIL)
  }

  fun bodyAttachObjectInstanceId(body: RID, id: Long) {
    TransferContext.writeArguments(_RID to body, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  fun bodyClearShapes(body: RID) {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_CLEAR_SHAPES,
        NIL)
  }

  fun bodyCreate(mode: Long = 2, initSleeping: Boolean = false): RID {
    TransferContext.writeArguments(LONG to mode, BOOL to initSleeping)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun bodyGetCollisionLayer(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_COLLISION_LAYER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun bodyGetCollisionMask(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_COLLISION_MASK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun bodyGetDirectState(body: RID): PhysicsDirectBodyState? {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_DIRECT_STATE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectBodyState?
  }

  fun bodyGetKinematicSafeMargin(body: RID): Double {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_KINEMATIC_SAFE_MARGIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun bodyGetMaxContactsReported(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_MAX_CONTACTS_REPORTED, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun bodyGetMode(body: RID): PhysicsServer.BodyMode {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_MODE, LONG)
    return PhysicsServer.BodyMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun bodyGetObjectInstanceId(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_OBJECT_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun bodyGetParam(body: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to body, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun bodyGetShape(body: RID, shapeIdx: Long): RID {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_SHAPE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun bodyGetShapeCount(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_SHAPE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun bodyGetShapeTransform(body: RID, shapeIdx: Long): Transform {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_SHAPE_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  fun bodyGetSpace(body: RID): RID {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_SPACE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun bodyGetState(body: RID, state: Long): Any? {
    TransferContext.writeArguments(_RID to body, LONG to state)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_STATE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun bodyIsAxisLocked(body: RID, axis: Long): Boolean {
    TransferContext.writeArguments(_RID to body, LONG to axis)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_IS_AXIS_LOCKED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun bodyIsContinuousCollisionDetectionEnabled(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_IS_CONTINUOUS_COLLISION_DETECTION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_IS_OMITTING_FORCE_INTEGRATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun bodyIsRayPickable(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_IS_RAY_PICKABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun bodyRemoveCollisionException(body: RID, exceptedBody: RID) {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_REMOVE_COLLISION_EXCEPTION, NIL)
  }

  fun bodyRemoveShape(body: RID, shapeIdx: Long) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_REMOVE_SHAPE,
        NIL)
  }

  fun bodySetAxisLock(
    body: RID,
    axis: Long,
    lock: Boolean
  ) {
    TransferContext.writeArguments(_RID to body, LONG to axis, BOOL to lock)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_AXIS_LOCK,
        NIL)
  }

  fun bodySetAxisVelocity(body: RID, axisVelocity: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to axisVelocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_AXIS_VELOCITY, NIL)
  }

  fun bodySetCollisionLayer(body: RID, layer: Long) {
    TransferContext.writeArguments(_RID to body, LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_COLLISION_LAYER, NIL)
  }

  fun bodySetCollisionMask(body: RID, mask: Long) {
    TransferContext.writeArguments(_RID to body, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_COLLISION_MASK, NIL)
  }

  fun bodySetEnableContinuousCollisionDetection(body: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_ENABLE_CONTINUOUS_COLLISION_DETECTION, NIL)
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
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_FORCE_INTEGRATION_CALLBACK, NIL)
  }

  fun bodySetKinematicSafeMargin(body: RID, margin: Double) {
    TransferContext.writeArguments(_RID to body, DOUBLE to margin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_KINEMATIC_SAFE_MARGIN, NIL)
  }

  fun bodySetMaxContactsReported(body: RID, amount: Long) {
    TransferContext.writeArguments(_RID to body, LONG to amount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_MAX_CONTACTS_REPORTED, NIL)
  }

  fun bodySetMode(body: RID, mode: Long) {
    TransferContext.writeArguments(_RID to body, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_MODE, NIL)
  }

  fun bodySetOmitForceIntegration(body: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_OMIT_FORCE_INTEGRATION, NIL)
  }

  fun bodySetParam(
    body: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to body, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_PARAM, NIL)
  }

  fun bodySetRayPickable(body: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_RAY_PICKABLE,
        NIL)
  }

  fun bodySetShape(
    body: RID,
    shapeIdx: Long,
    shape: RID
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, _RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_SHAPE, NIL)
  }

  fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Long,
    disabled: Boolean
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_SHAPE_DISABLED, NIL)
  }

  fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Long,
    transform: Transform
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_SHAPE_TRANSFORM, NIL)
  }

  fun bodySetSpace(body: RID, space: RID) {
    TransferContext.writeArguments(_RID to body, _RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_SPACE, NIL)
  }

  fun bodySetState(
    body: RID,
    state: Long,
    value: Any?
  ) {
    TransferContext.writeArguments(_RID to body, LONG to state, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_STATE, NIL)
  }

  fun coneTwistJointGetParam(joint: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to joint, LONG to param)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_CONE_TWIST_JOINT_GET_PARAM, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun coneTwistJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_CONE_TWIST_JOINT_SET_PARAM, NIL)
  }

  fun freeRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_FREE_RID, NIL)
  }

  fun generic6dofJointGetFlag(
    joint: RID,
    axis: Long,
    flag: Long
  ): Boolean {
    TransferContext.writeArguments(_RID to joint, LONG to axis, LONG to flag)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_GENERIC_6DOF_JOINT_GET_FLAG, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun generic6dofJointGetParam(
    joint: RID,
    axis: Long,
    param: Long
  ): Double {
    TransferContext.writeArguments(_RID to joint, LONG to axis, LONG to param)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_GENERIC_6DOF_JOINT_GET_PARAM, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun generic6dofJointSetFlag(
    joint: RID,
    axis: Long,
    flag: Long,
    enable: Boolean
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to axis, LONG to flag, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_GENERIC_6DOF_JOINT_SET_FLAG, NIL)
  }

  fun generic6dofJointSetParam(
    joint: RID,
    axis: Long,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to axis, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_GENERIC_6DOF_JOINT_SET_PARAM, NIL)
  }

  fun getProcessInfo(processInfo: Long): Long {
    TransferContext.writeArguments(LONG to processInfo)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_GET_PROCESS_INFO,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun hingeJointGetFlag(joint: RID, flag: Long): Boolean {
    TransferContext.writeArguments(_RID to joint, LONG to flag)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_HINGE_JOINT_GET_FLAG,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun hingeJointGetParam(joint: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to joint, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_HINGE_JOINT_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun hingeJointSetFlag(
    joint: RID,
    flag: Long,
    enabled: Boolean
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to flag, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_HINGE_JOINT_SET_FLAG,
        NIL)
  }

  fun hingeJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_HINGE_JOINT_SET_PARAM,
        NIL)
  }

  fun jointCreateConeTwist(
    bodyA: RID,
    localRefA: Transform,
    bodyB: RID,
    localRefB: Transform
  ): RID {
    TransferContext.writeArguments(_RID to bodyA, TRANSFORM to localRefA, _RID to bodyB, TRANSFORM
        to localRefB)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_JOINT_CREATE_CONE_TWIST, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun jointCreateGeneric6dof(
    bodyA: RID,
    localRefA: Transform,
    bodyB: RID,
    localRefB: Transform
  ): RID {
    TransferContext.writeArguments(_RID to bodyA, TRANSFORM to localRefA, _RID to bodyB, TRANSFORM
        to localRefB)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_JOINT_CREATE_GENERIC_6DOF, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun jointCreateHinge(
    bodyA: RID,
    hingeA: Transform,
    bodyB: RID,
    hingeB: Transform
  ): RID {
    TransferContext.writeArguments(_RID to bodyA, TRANSFORM to hingeA, _RID to bodyB, TRANSFORM to
        hingeB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_JOINT_CREATE_HINGE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun jointCreatePin(
    bodyA: RID,
    localA: Vector3,
    bodyB: RID,
    localB: Vector3
  ): RID {
    TransferContext.writeArguments(_RID to bodyA, VECTOR3 to localA, _RID to bodyB, VECTOR3 to
        localB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_JOINT_CREATE_PIN,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun jointCreateSlider(
    bodyA: RID,
    localRefA: Transform,
    bodyB: RID,
    localRefB: Transform
  ): RID {
    TransferContext.writeArguments(_RID to bodyA, TRANSFORM to localRefA, _RID to bodyB, TRANSFORM
        to localRefB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_JOINT_CREATE_SLIDER,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun jointGetSolverPriority(joint: RID): Long {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_JOINT_GET_SOLVER_PRIORITY, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun jointGetType(joint: RID): PhysicsServer.JointType {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_JOINT_GET_TYPE, LONG)
    return PhysicsServer.JointType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun jointSetSolverPriority(joint: RID, priority: Long) {
    TransferContext.writeArguments(_RID to joint, LONG to priority)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_JOINT_SET_SOLVER_PRIORITY, NIL)
  }

  fun pinJointGetLocalA(joint: RID): Vector3 {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_PIN_JOINT_GET_LOCAL_A,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  fun pinJointGetLocalB(joint: RID): Vector3 {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_PIN_JOINT_GET_LOCAL_B,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  fun pinJointGetParam(joint: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to joint, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_PIN_JOINT_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun pinJointSetLocalA(joint: RID, localA: Vector3) {
    TransferContext.writeArguments(_RID to joint, VECTOR3 to localA)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_PIN_JOINT_SET_LOCAL_A,
        NIL)
  }

  fun pinJointSetLocalB(joint: RID, localB: Vector3) {
    TransferContext.writeArguments(_RID to joint, VECTOR3 to localB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_PIN_JOINT_SET_LOCAL_B,
        NIL)
  }

  fun pinJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_PIN_JOINT_SET_PARAM,
        NIL)
  }

  fun setActive(active: Boolean) {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SET_ACTIVE, NIL)
  }

  fun shapeCreate(type: Long): RID {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun shapeGetData(shape: RID): Any? {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SHAPE_GET_DATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun shapeGetType(shape: RID): PhysicsServer.ShapeType {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SHAPE_GET_TYPE, LONG)
    return PhysicsServer.ShapeType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun shapeSetData(shape: RID, data: Any?) {
    TransferContext.writeArguments(_RID to shape, ANY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SHAPE_SET_DATA, NIL)
  }

  fun sliderJointGetParam(joint: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to joint, LONG to param)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SLIDER_JOINT_GET_PARAM, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun sliderJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SLIDER_JOINT_SET_PARAM, NIL)
  }

  fun spaceCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SPACE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun spaceGetDirectState(space: RID): PhysicsDirectSpaceState? {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SPACE_GET_DIRECT_STATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState?
  }

  fun spaceGetParam(space: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to space, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SPACE_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun spaceIsActive(space: RID): Boolean {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SPACE_IS_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun spaceSetActive(space: RID, active: Boolean) {
    TransferContext.writeArguments(_RID to space, BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SPACE_SET_ACTIVE, NIL)
  }

  fun spaceSetParam(
    space: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to space, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SPACE_SET_PARAM, NIL)
  }

  enum class BodyAxis(
    id: Long
  ) {
    BODY_AXIS_LINEAR_X(1),

    BODY_AXIS_LINEAR_Y(2),

    BODY_AXIS_LINEAR_Z(4),

    BODY_AXIS_ANGULAR_X(8),

    BODY_AXIS_ANGULAR_Y(16),

    BODY_AXIS_ANGULAR_Z(32);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
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
    SHAPE_PLANE(0),

    SHAPE_RAY(1),

    SHAPE_SPHERE(2),

    SHAPE_BOX(3),

    SHAPE_CAPSULE(4),

    SHAPE_CYLINDER(5),

    SHAPE_CONVEX_POLYGON(6),

    SHAPE_CONCAVE_POLYGON(7),

    SHAPE_HEIGHTMAP(8),

    SHAPE_CUSTOM(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class PinJointParam(
    id: Long
  ) {
    PIN_JOINT_BIAS(0),

    PIN_JOINT_DAMPING(1),

    PIN_JOINT_IMPULSE_CLAMP(2);

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

    SPACE_PARAM_BODY_ANGULAR_VELOCITY_DAMP_RATIO(6),

    SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS(7),

    SPACE_PARAM_TEST_MOTION_MIN_CONTACT_DEPTH(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ConeTwistJointParam(
    id: Long
  ) {
    CONE_TWIST_JOINT_SWING_SPAN(0),

    CONE_TWIST_JOINT_TWIST_SPAN(1),

    CONE_TWIST_JOINT_BIAS(2),

    CONE_TWIST_JOINT_SOFTNESS(3),

    CONE_TWIST_JOINT_RELAXATION(4);

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

    JOINT_HINGE(1),

    JOINT_SLIDER(2),

    JOINT_CONE_TWIST(3),

    JOINT_6DOF(4);

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

    BODY_PARAM_GRAVITY_SCALE(3),

    BODY_PARAM_LINEAR_DAMP(4),

    BODY_PARAM_ANGULAR_DAMP(5),

    BODY_PARAM_MAX(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class G6DOFJointAxisParam(
    id: Long
  ) {
    G6DOF_JOINT_LINEAR_LOWER_LIMIT(0),

    G6DOF_JOINT_LINEAR_UPPER_LIMIT(1),

    G6DOF_JOINT_LINEAR_LIMIT_SOFTNESS(2),

    G6DOF_JOINT_LINEAR_RESTITUTION(3),

    G6DOF_JOINT_LINEAR_DAMPING(4),

    G6DOF_JOINT_LINEAR_MOTOR_TARGET_VELOCITY(5),

    G6DOF_JOINT_LINEAR_MOTOR_FORCE_LIMIT(6),

    G6DOF_JOINT_ANGULAR_LOWER_LIMIT(10),

    G6DOF_JOINT_ANGULAR_UPPER_LIMIT(11),

    G6DOF_JOINT_ANGULAR_LIMIT_SOFTNESS(12),

    G6DOF_JOINT_ANGULAR_DAMPING(13),

    G6DOF_JOINT_ANGULAR_RESTITUTION(14),

    G6DOF_JOINT_ANGULAR_FORCE_LIMIT(15),

    G6DOF_JOINT_ANGULAR_ERP(16),

    G6DOF_JOINT_ANGULAR_MOTOR_TARGET_VELOCITY(17),

    G6DOF_JOINT_ANGULAR_MOTOR_FORCE_LIMIT(18);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SliderJointParam(
    id: Long
  ) {
    SLIDER_JOINT_LINEAR_LIMIT_UPPER(0),

    SLIDER_JOINT_LINEAR_LIMIT_LOWER(1),

    SLIDER_JOINT_LINEAR_LIMIT_SOFTNESS(2),

    SLIDER_JOINT_LINEAR_LIMIT_RESTITUTION(3),

    SLIDER_JOINT_LINEAR_LIMIT_DAMPING(4),

    SLIDER_JOINT_LINEAR_MOTION_SOFTNESS(5),

    SLIDER_JOINT_LINEAR_MOTION_RESTITUTION(6),

    SLIDER_JOINT_LINEAR_MOTION_DAMPING(7),

    SLIDER_JOINT_LINEAR_ORTHOGONAL_SOFTNESS(8),

    SLIDER_JOINT_LINEAR_ORTHOGONAL_RESTITUTION(9),

    SLIDER_JOINT_LINEAR_ORTHOGONAL_DAMPING(10),

    SLIDER_JOINT_ANGULAR_LIMIT_UPPER(11),

    SLIDER_JOINT_ANGULAR_LIMIT_LOWER(12),

    SLIDER_JOINT_ANGULAR_LIMIT_SOFTNESS(13),

    SLIDER_JOINT_ANGULAR_LIMIT_RESTITUTION(14),

    SLIDER_JOINT_ANGULAR_LIMIT_DAMPING(15),

    SLIDER_JOINT_ANGULAR_MOTION_SOFTNESS(16),

    SLIDER_JOINT_ANGULAR_MOTION_RESTITUTION(17),

    SLIDER_JOINT_ANGULAR_MOTION_DAMPING(18),

    SLIDER_JOINT_ANGULAR_ORTHOGONAL_SOFTNESS(19),

    SLIDER_JOINT_ANGULAR_ORTHOGONAL_RESTITUTION(20),

    SLIDER_JOINT_ANGULAR_ORTHOGONAL_DAMPING(21),

    SLIDER_JOINT_MAX(22);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class HingeJointParam(
    id: Long
  ) {
    HINGE_JOINT_BIAS(0),

    HINGE_JOINT_LIMIT_UPPER(1),

    HINGE_JOINT_LIMIT_LOWER(2),

    HINGE_JOINT_LIMIT_BIAS(3),

    HINGE_JOINT_LIMIT_SOFTNESS(4),

    HINGE_JOINT_LIMIT_RELAXATION(5),

    HINGE_JOINT_MOTOR_TARGET_VELOCITY(6),

    HINGE_JOINT_MOTOR_MAX_IMPULSE(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class G6DOFJointAxisFlag(
    id: Long
  ) {
    G6DOF_JOINT_FLAG_ENABLE_LINEAR_LIMIT(0),

    G6DOF_JOINT_FLAG_ENABLE_ANGULAR_LIMIT(1),

    G6DOF_JOINT_FLAG_ENABLE_MOTOR(4),

    G6DOF_JOINT_FLAG_ENABLE_LINEAR_MOTOR(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class HingeJointFlag(
    id: Long
  ) {
    HINGE_JOINT_FLAG_USE_LIMIT(0),

    HINGE_JOINT_FLAG_ENABLE_MOTOR(1);

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
