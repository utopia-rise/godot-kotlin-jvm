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
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Server interface for low-level physics access.
 *
 * PhysicsServer is the server responsible for all 3D physics. It can create many kinds of physics objects, but does not insert them on the node tree.
 */
@GodotBaseType
object PhysicsServer : Object() {
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
   *
   */
  final const val BODY_AXIS_ANGULAR_X: Long = 8

  /**
   *
   */
  final const val BODY_AXIS_ANGULAR_Y: Long = 16

  /**
   *
   */
  final const val BODY_AXIS_ANGULAR_Z: Long = 32

  /**
   *
   */
  final const val BODY_AXIS_LINEAR_X: Long = 1

  /**
   *
   */
  final const val BODY_AXIS_LINEAR_Y: Long = 2

  /**
   *
   */
  final const val BODY_AXIS_LINEAR_Z: Long = 4

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
  final const val BODY_PARAM_ANGULAR_DAMP: Long = 5

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
  final const val BODY_PARAM_GRAVITY_SCALE: Long = 3

  /**
   * Constant to set/get a body's linear dampening factor.
   */
  final const val BODY_PARAM_LINEAR_DAMP: Long = 4

  /**
   * Constant to set/get a body's mass.
   */
  final const val BODY_PARAM_MASS: Long = 2

  /**
   * Represents the size of the [enum BodyParameter] enum.
   */
  final const val BODY_PARAM_MAX: Long = 6

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
   * The speed with which the swing or twist will take place.
   *
   * The higher, the faster.
   */
  final const val CONE_TWIST_JOINT_BIAS: Long = 2

  /**
   * Defines, how fast the swing- and twist-speed-difference on both sides gets synced.
   */
  final const val CONE_TWIST_JOINT_RELAXATION: Long = 4

  /**
   * The ease with which the Joint twists, if it's too low, it takes more force to twist the joint.
   */
  final const val CONE_TWIST_JOINT_SOFTNESS: Long = 3

  /**
   * Swing is rotation from side to side, around the axis perpendicular to the twist axis.
   *
   * The swing span defines, how much rotation will not get corrected allong the swing axis.
   *
   * Could be defined as looseness in the [godot.ConeTwistJoint].
   *
   * If below 0.05, this behavior is locked.
   */
  final const val CONE_TWIST_JOINT_SWING_SPAN: Long = 0

  /**
   * Twist is the rotation around the twist axis, this value defined how far the joint can twist.
   *
   * Twist is locked if below 0.05.
   */
  final const val CONE_TWIST_JOINT_TWIST_SPAN: Long = 1

  /**
   * The amount of rotational damping across the axes. The lower, the more dampening occurs.
   */
  final const val G6DOF_JOINT_ANGULAR_DAMPING: Long = 13

  /**
   * When correcting the crossing of limits in rotation across the axes, this error tolerance factor defines how much the correction gets slowed down. The lower, the slower.
   */
  final const val G6DOF_JOINT_ANGULAR_ERP: Long = 16

  /**
   * The maximum amount of force that can occur, when rotating around the axes.
   */
  final const val G6DOF_JOINT_ANGULAR_FORCE_LIMIT: Long = 15

  /**
   * A factor that gets multiplied onto all rotations across the axes.
   */
  final const val G6DOF_JOINT_ANGULAR_LIMIT_SOFTNESS: Long = 12

  /**
   * The minimum rotation in negative direction to break loose and rotate around the axes.
   */
  final const val G6DOF_JOINT_ANGULAR_LOWER_LIMIT: Long = 10

  /**
   * Maximum acceleration for the motor at the axes.
   */
  final const val G6DOF_JOINT_ANGULAR_MOTOR_FORCE_LIMIT: Long = 18

  /**
   * Target speed for the motor at the axes.
   */
  final const val G6DOF_JOINT_ANGULAR_MOTOR_TARGET_VELOCITY: Long = 17

  /**
   * The amount of rotational restitution across the axes. The lower, the more restitution occurs.
   */
  final const val G6DOF_JOINT_ANGULAR_RESTITUTION: Long = 14

  /**
   * The minimum rotation in positive direction to break loose and rotate around the axes.
   */
  final const val G6DOF_JOINT_ANGULAR_UPPER_LIMIT: Long = 11

  /**
   * If `set` there is rotational motion possible.
   */
  final const val G6DOF_JOINT_FLAG_ENABLE_ANGULAR_LIMIT: Long = 1

  /**
   * If `set` there is linear motion possible within the given limits.
   */
  final const val G6DOF_JOINT_FLAG_ENABLE_LINEAR_LIMIT: Long = 0

  /**
   * If `set` there is a linear motor on this axis that targets a specific velocity.
   */
  final const val G6DOF_JOINT_FLAG_ENABLE_LINEAR_MOTOR: Long = 5

  /**
   * If `set` there is a rotational motor across these axes.
   */
  final const val G6DOF_JOINT_FLAG_ENABLE_MOTOR: Long = 4

  /**
   * The amount of damping that happens at the linear motion across the axes.
   */
  final const val G6DOF_JOINT_LINEAR_DAMPING: Long = 4

  /**
   * A factor that gets applied to the movement across the axes. The lower, the slower the movement.
   */
  final const val G6DOF_JOINT_LINEAR_LIMIT_SOFTNESS: Long = 2

  /**
   * The minimum difference between the pivot points' axes.
   */
  final const val G6DOF_JOINT_LINEAR_LOWER_LIMIT: Long = 0

  /**
   * The maximum force that the linear motor can apply while trying to reach the target velocity.
   */
  final const val G6DOF_JOINT_LINEAR_MOTOR_FORCE_LIMIT: Long = 6

  /**
   * The velocity that the joint's linear motor will attempt to reach.
   */
  final const val G6DOF_JOINT_LINEAR_MOTOR_TARGET_VELOCITY: Long = 5

  /**
   * The amount of restitution on the axes movement. The lower, the more velocity-energy gets lost.
   */
  final const val G6DOF_JOINT_LINEAR_RESTITUTION: Long = 3

  /**
   * The maximum difference between the pivot points' axes.
   */
  final const val G6DOF_JOINT_LINEAR_UPPER_LIMIT: Long = 1

  /**
   * The speed with which the two bodies get pulled together when they move in different directions.
   */
  final const val HINGE_JOINT_BIAS: Long = 0

  /**
   * If `true`, a motor turns the Hinge.
   */
  final const val HINGE_JOINT_FLAG_ENABLE_MOTOR: Long = 1

  /**
   * If `true`, the Hinge has a maximum and a minimum rotation.
   */
  final const val HINGE_JOINT_FLAG_USE_LIMIT: Long = 0

  /**
   * The speed with which the rotation across the axis perpendicular to the hinge gets corrected.
   */
  final const val HINGE_JOINT_LIMIT_BIAS: Long = 3

  /**
   * The minimum rotation across the Hinge.
   */
  final const val HINGE_JOINT_LIMIT_LOWER: Long = 2

  /**
   * The lower this value, the more the rotation gets slowed down.
   */
  final const val HINGE_JOINT_LIMIT_RELAXATION: Long = 5

  /**
   *
   */
  final const val HINGE_JOINT_LIMIT_SOFTNESS: Long = 4

  /**
   * The maximum rotation across the Hinge.
   */
  final const val HINGE_JOINT_LIMIT_UPPER: Long = 1

  /**
   * Maximum acceleration for the motor.
   */
  final const val HINGE_JOINT_MOTOR_MAX_IMPULSE: Long = 7

  /**
   * Target speed for the motor.
   */
  final const val HINGE_JOINT_MOTOR_TARGET_VELOCITY: Long = 6

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
   * The [godot.Joint] is a [godot.Generic6DOFJoint].
   */
  final const val JOINT_6DOF: Long = 4

  /**
   * The [godot.Joint] is a [godot.ConeTwistJoint].
   */
  final const val JOINT_CONE_TWIST: Long = 3

  /**
   * The [godot.Joint] is a [godot.HingeJoint].
   */
  final const val JOINT_HINGE: Long = 1

  /**
   * The [godot.Joint] is a [godot.PinJoint].
   */
  final const val JOINT_PIN: Long = 0

  /**
   * The [godot.Joint] is a [godot.SliderJoint].
   */
  final const val JOINT_SLIDER: Long = 2

  /**
   * The strength with which the pinned objects try to stay in positional relation to each other.
   *
   * The higher, the stronger.
   */
  final const val PIN_JOINT_BIAS: Long = 0

  /**
   * The strength with which the pinned objects try to stay in velocity relation to each other.
   *
   * The higher, the stronger.
   */
  final const val PIN_JOINT_DAMPING: Long = 1

  /**
   * If above 0, this value is the maximum value for an impulse that this Joint puts on its ends.
   */
  final const val PIN_JOINT_IMPULSE_CLAMP: Long = 2

  /**
   * The [godot.Shape] is a [godot.BoxShape].
   */
  final const val SHAPE_BOX: Long = 3

  /**
   * The [godot.Shape] is a [godot.CapsuleShape].
   */
  final const val SHAPE_CAPSULE: Long = 4

  /**
   * The [godot.Shape] is a [godot.ConcavePolygonShape].
   */
  final const val SHAPE_CONCAVE_POLYGON: Long = 7

  /**
   * The [godot.Shape] is a [godot.ConvexPolygonShape].
   */
  final const val SHAPE_CONVEX_POLYGON: Long = 6

  /**
   * This constant is used internally by the engine. Any attempt to create this kind of shape results in an error.
   */
  final const val SHAPE_CUSTOM: Long = 9

  /**
   * The [godot.Shape] is a [godot.CylinderShape].
   */
  final const val SHAPE_CYLINDER: Long = 5

  /**
   * The [godot.Shape] is a [godot.HeightMapShape].
   */
  final const val SHAPE_HEIGHTMAP: Long = 8

  /**
   * The [godot.Shape] is a [godot.PlaneShape].
   */
  final const val SHAPE_PLANE: Long = 0

  /**
   * The [godot.Shape] is a [godot.RayShape].
   */
  final const val SHAPE_RAY: Long = 1

  /**
   * The [godot.Shape] is a [godot.SphereShape].
   */
  final const val SHAPE_SPHERE: Long = 2

  /**
   * The amount of damping of the rotation when the limit is surpassed.
   */
  final const val SLIDER_JOINT_ANGULAR_LIMIT_DAMPING: Long = 15

  /**
   * The lower limit of rotation in the slider.
   */
  final const val SLIDER_JOINT_ANGULAR_LIMIT_LOWER: Long = 12

  /**
   * The amount of restitution of the rotation when the limit is surpassed.
   */
  final const val SLIDER_JOINT_ANGULAR_LIMIT_RESTITUTION: Long = 14

  /**
   * A factor applied to the all rotation once the limit is surpassed.
   */
  final const val SLIDER_JOINT_ANGULAR_LIMIT_SOFTNESS: Long = 13

  /**
   * The upper limit of rotation in the slider.
   */
  final const val SLIDER_JOINT_ANGULAR_LIMIT_UPPER: Long = 11

  /**
   * The amount of damping of the rotation in the limits.
   */
  final const val SLIDER_JOINT_ANGULAR_MOTION_DAMPING: Long = 18

  /**
   * The amount of restitution of the rotation in the limits.
   */
  final const val SLIDER_JOINT_ANGULAR_MOTION_RESTITUTION: Long = 17

  /**
   * A factor that gets applied to the all rotation in the limits.
   */
  final const val SLIDER_JOINT_ANGULAR_MOTION_SOFTNESS: Long = 16

  /**
   * The amount of damping of the rotation across axes orthogonal to the slider.
   */
  final const val SLIDER_JOINT_ANGULAR_ORTHOGONAL_DAMPING: Long = 21

  /**
   * The amount of restitution of the rotation across axes orthogonal to the slider.
   */
  final const val SLIDER_JOINT_ANGULAR_ORTHOGONAL_RESTITUTION: Long = 20

  /**
   * A factor that gets applied to the all rotation across axes orthogonal to the slider.
   */
  final const val SLIDER_JOINT_ANGULAR_ORTHOGONAL_SOFTNESS: Long = 19

  /**
   * The amount of damping once the slider limits are surpassed.
   */
  final const val SLIDER_JOINT_LINEAR_LIMIT_DAMPING: Long = 4

  /**
   * The minimum difference between the pivot points on their X axis before damping happens.
   */
  final const val SLIDER_JOINT_LINEAR_LIMIT_LOWER: Long = 1

  /**
   * The amount of restitution once the limits are surpassed. The lower, the more velocityenergy gets lost.
   */
  final const val SLIDER_JOINT_LINEAR_LIMIT_RESTITUTION: Long = 3

  /**
   * A factor applied to the movement across the slider axis once the limits get surpassed. The lower, the slower the movement.
   */
  final const val SLIDER_JOINT_LINEAR_LIMIT_SOFTNESS: Long = 2

  /**
   * The maximum difference between the pivot points on their X axis before damping happens.
   */
  final const val SLIDER_JOINT_LINEAR_LIMIT_UPPER: Long = 0

  /**
   * The amount of damping inside the slider limits.
   */
  final const val SLIDER_JOINT_LINEAR_MOTION_DAMPING: Long = 7

  /**
   * The amount of restitution inside the slider limits.
   */
  final const val SLIDER_JOINT_LINEAR_MOTION_RESTITUTION: Long = 6

  /**
   * A factor applied to the movement across the slider axis as long as the slider is in the limits. The lower, the slower the movement.
   */
  final const val SLIDER_JOINT_LINEAR_MOTION_SOFTNESS: Long = 5

  /**
   * The amount of damping when movement is across axes orthogonal to the slider.
   */
  final const val SLIDER_JOINT_LINEAR_ORTHOGONAL_DAMPING: Long = 10

  /**
   * The amount of restitution when movement is across axes orthogonal to the slider.
   */
  final const val SLIDER_JOINT_LINEAR_ORTHOGONAL_RESTITUTION: Long = 9

  /**
   * A factor applied to the movement across axes orthogonal to the slider.
   */
  final const val SLIDER_JOINT_LINEAR_ORTHOGONAL_SOFTNESS: Long = 8

  /**
   * Represents the size of the [enum SliderJointParam] enum.
   */
  final const val SLIDER_JOINT_MAX: Long = 22

  /**
   *
   */
  final const val SPACE_PARAM_BODY_ANGULAR_VELOCITY_DAMP_RATIO: Long = 6

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
  final const val SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS: Long = 7

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
  final const val SPACE_PARAM_TEST_MOTION_MIN_CONTACT_DEPTH: Long = 8

  override fun __new() {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_PHYSICSSERVER)
  }

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Adds a shape to the area, along with a transform matrix. Shapes are usually referenced by their index, so you should track which shape has a given index.
   */
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

  /**
   * Assigns the area to a descendant of [godot.Object], so it can exist in the node tree.
   */
  fun areaAttachObjectInstanceId(area: RID, id: Long) {
    TransferContext.writeArguments(_RID to area, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  /**
   * Removes all shapes from an area. It does not delete the shapes, so they can be reassigned later.
   */
  fun areaClearShapes(area: RID) {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_CLEAR_SHAPES,
        NIL)
  }

  /**
   * Creates an [godot.Area].
   */
  fun areaCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Gets the instance ID of the object the area is assigned to.
   */
  fun areaGetObjectInstanceId(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_OBJECT_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an area parameter value. A list of available parameters is on the [enum AreaParameter] constants.
   */
  fun areaGetParam(area: RID, param: Long): Any? {
    TransferContext.writeArguments(_RID to area, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_PARAM, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the [RID] of the nth shape of an area.
   */
  fun areaGetShape(area: RID, shapeIdx: Long): RID {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_SHAPE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the number of shapes assigned to an area.
   */
  fun areaGetShapeCount(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_SHAPE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the transform matrix of a shape within an area.
   */
  fun areaGetShapeTransform(area: RID, shapeIdx: Long): Transform {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_SHAPE_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns the space assigned to the area.
   */
  fun areaGetSpace(area: RID): RID {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_SPACE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the space override mode for the area.
   */
  fun areaGetSpaceOverrideMode(area: RID): PhysicsServer.AreaSpaceOverrideMode {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_SPACE_OVERRIDE_MODE, LONG)
    return PhysicsServer.AreaSpaceOverrideMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the transform matrix for an area.
   */
  fun areaGetTransform(area: RID): Transform {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_GET_TRANSFORM,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * If `true`, area collides with rays.
   */
  fun areaIsRayPickable(area: RID): Boolean {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_IS_RAY_PICKABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes a shape from an area. It does not delete the shape, so it can be reassigned later.
   */
  fun areaRemoveShape(area: RID, shapeIdx: Long) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_REMOVE_SHAPE,
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
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_AREA_MONITOR_CALLBACK, NIL)
  }

  /**
   * Assigns the area to one or many physics layers.
   */
  fun areaSetCollisionLayer(area: RID, layer: Long) {
    TransferContext.writeArguments(_RID to area, LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_COLLISION_LAYER, NIL)
  }

  /**
   * Sets which physics layers the area will monitor.
   */
  fun areaSetCollisionMask(area: RID, mask: Long) {
    TransferContext.writeArguments(_RID to area, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_COLLISION_MASK, NIL)
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
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_MONITOR_CALLBACK, NIL)
  }

  /**
   *
   */
  fun areaSetMonitorable(area: RID, monitorable: Boolean) {
    TransferContext.writeArguments(_RID to area, BOOL to monitorable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_MONITORABLE,
        NIL)
  }

  /**
   * Sets the value for an area parameter. A list of available parameters is on the [enum AreaParameter] constants.
   */
  fun areaSetParam(
    area: RID,
    param: Long,
    value: Any?
  ) {
    TransferContext.writeArguments(_RID to area, LONG to param, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_PARAM, NIL)
  }

  /**
   * Sets object pickable with rays.
   */
  fun areaSetRayPickable(area: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to area, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_RAY_PICKABLE,
        NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_SHAPE, NIL)
  }

  /**
   *
   */
  fun areaSetShapeDisabled(
    area: RID,
    shapeIdx: Long,
    disabled: Boolean
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_SHAPE_DISABLED, NIL)
  }

  /**
   * Sets the transform matrix for an area shape.
   */
  fun areaSetShapeTransform(
    area: RID,
    shapeIdx: Long,
    transform: Transform
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_SHAPE_TRANSFORM, NIL)
  }

  /**
   * Assigns a space to the area.
   */
  fun areaSetSpace(area: RID, space: RID) {
    TransferContext.writeArguments(_RID to area, _RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_SPACE, NIL)
  }

  /**
   * Sets the space override mode for the area. The modes are described in the [enum AreaSpaceOverrideMode] constants.
   */
  fun areaSetSpaceOverrideMode(area: RID, mode: Long) {
    TransferContext.writeArguments(_RID to area, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_SPACE_OVERRIDE_MODE, NIL)
  }

  /**
   * Sets the transform matrix for an area.
   */
  fun areaSetTransform(area: RID, transform: Transform) {
    TransferContext.writeArguments(_RID to area, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_AREA_SET_TRANSFORM,
        NIL)
  }

  /**
   *
   */
  fun bodyAddCentralForce(body: RID, force: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_ADD_CENTRAL_FORCE, NIL)
  }

  /**
   * Adds a body to the list of bodies exempt from collisions.
   */
  fun bodyAddCollisionException(body: RID, exceptedBody: RID) {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_ADD_COLLISION_EXCEPTION, NIL)
  }

  /**
   *
   */
  fun bodyAddForce(
    body: RID,
    force: Vector3,
    position: Vector3
  ) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_ADD_FORCE, NIL)
  }

  /**
   * Adds a shape to the body, along with a transform matrix. Shapes are usually referenced by their index, so you should track which shape has a given index.
   */
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

  /**
   *
   */
  fun bodyAddTorque(body: RID, torque: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_ADD_TORQUE, NIL)
  }

  /**
   *
   */
  fun bodyApplyCentralImpulse(body: RID, impulse: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_APPLY_CENTRAL_IMPULSE, NIL)
  }

  /**
   * Gives the body a push at a `position` in the direction of the `impulse`.
   */
  fun bodyApplyImpulse(
    body: RID,
    position: Vector3,
    impulse: Vector3
  ) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to position, VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_APPLY_IMPULSE,
        NIL)
  }

  /**
   * Gives the body a push to rotate it.
   */
  fun bodyApplyTorqueImpulse(body: RID, impulse: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_APPLY_TORQUE_IMPULSE, NIL)
  }

  /**
   * Assigns the area to a descendant of [godot.Object], so it can exist in the node tree.
   */
  fun bodyAttachObjectInstanceId(body: RID, id: Long) {
    TransferContext.writeArguments(_RID to body, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  /**
   * Removes all shapes from a body.
   */
  fun bodyClearShapes(body: RID) {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_CLEAR_SHAPES,
        NIL)
  }

  /**
   * Creates a physics body. The first parameter can be any value from [enum BodyMode] constants, for the type of body created. Additionally, the body can be created in sleeping state to save processing time.
   */
  fun bodyCreate(mode: Long = 2, initSleeping: Boolean = false): RID {
    TransferContext.writeArguments(LONG to mode, BOOL to initSleeping)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the physics layer or layers a body belongs to.
   */
  fun bodyGetCollisionLayer(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_COLLISION_LAYER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the physics layer or layers a body can collide with.
   *
   * -
   */
  fun bodyGetCollisionMask(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_COLLISION_MASK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.PhysicsDirectBodyState] of the body.
   */
  fun bodyGetDirectState(body: RID): PhysicsDirectBodyState? {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_DIRECT_STATE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectBodyState?
  }

  /**
   *
   */
  fun bodyGetKinematicSafeMargin(body: RID): Double {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_KINEMATIC_SAFE_MARGIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the maximum contacts that can be reported. See [bodySetMaxContactsReported].
   */
  fun bodyGetMaxContactsReported(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_MAX_CONTACTS_REPORTED, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the body mode.
   */
  fun bodyGetMode(body: RID): PhysicsServer.BodyMode {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_MODE, LONG)
    return PhysicsServer.BodyMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Gets the instance ID of the object the area is assigned to.
   */
  fun bodyGetObjectInstanceId(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_OBJECT_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the value of a body parameter. A list of available parameters is on the [enum BodyParameter] constants.
   */
  fun bodyGetParam(body: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to body, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the [RID] of the nth shape of a body.
   */
  fun bodyGetShape(body: RID, shapeIdx: Long): RID {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_SHAPE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the number of shapes assigned to a body.
   */
  fun bodyGetShapeCount(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_SHAPE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the transform matrix of a body shape.
   */
  fun bodyGetShapeTransform(body: RID, shapeIdx: Long): Transform {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_SHAPE_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns the [RID] of the space assigned to a body.
   */
  fun bodyGetSpace(body: RID): RID {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_SPACE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns a body state.
   */
  fun bodyGetState(body: RID, state: Long): Any? {
    TransferContext.writeArguments(_RID to body, LONG to state)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_GET_STATE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   *
   */
  fun bodyIsAxisLocked(body: RID, axis: Long): Boolean {
    TransferContext.writeArguments(_RID to body, LONG to axis)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_IS_AXIS_LOCKED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, the continuous collision detection mode is enabled.
   */
  fun bodyIsContinuousCollisionDetectionEnabled(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_IS_CONTINUOUS_COLLISION_DETECTION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether a body uses a callback function to calculate its own physics (see [bodySetForceIntegrationCallback]).
   */
  fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_IS_OMITTING_FORCE_INTEGRATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, the body can be detected by rays.
   */
  fun bodyIsRayPickable(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_IS_RAY_PICKABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes a body from the list of bodies exempt from collisions.
   *
   * Continuous collision detection tries to predict where a moving body will collide, instead of moving it and correcting its movement if it collided.
   */
  fun bodyRemoveCollisionException(body: RID, exceptedBody: RID) {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_REMOVE_COLLISION_EXCEPTION, NIL)
  }

  /**
   * Removes a shape from a body. The shape is not deleted, so it can be reused afterwards.
   */
  fun bodyRemoveShape(body: RID, shapeIdx: Long) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_REMOVE_SHAPE,
        NIL)
  }

  /**
   *
   */
  fun bodySetAxisLock(
    body: RID,
    axis: Long,
    lock: Boolean
  ) {
    TransferContext.writeArguments(_RID to body, LONG to axis, BOOL to lock)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_AXIS_LOCK,
        NIL)
  }

  /**
   * Sets an axis velocity. The velocity in the given vector axis will be set as the given vector length. This is useful for jumping behavior.
   */
  fun bodySetAxisVelocity(body: RID, axisVelocity: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to axisVelocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_AXIS_VELOCITY, NIL)
  }

  /**
   * Sets the physics layer or layers a body belongs to.
   */
  fun bodySetCollisionLayer(body: RID, layer: Long) {
    TransferContext.writeArguments(_RID to body, LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_COLLISION_LAYER, NIL)
  }

  /**
   * Sets the physics layer or layers a body can collide with.
   */
  fun bodySetCollisionMask(body: RID, mask: Long) {
    TransferContext.writeArguments(_RID to body, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_COLLISION_MASK, NIL)
  }

  /**
   * If `true`, the continuous collision detection mode is enabled.
   *
   * Continuous collision detection tries to predict where a moving body will collide, instead of moving it and correcting its movement if it collided.
   */
  fun bodySetEnableContinuousCollisionDetection(body: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_ENABLE_CONTINUOUS_COLLISION_DETECTION, NIL)
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
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_FORCE_INTEGRATION_CALLBACK, NIL)
  }

  /**
   *
   */
  fun bodySetKinematicSafeMargin(body: RID, margin: Double) {
    TransferContext.writeArguments(_RID to body, DOUBLE to margin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_KINEMATIC_SAFE_MARGIN, NIL)
  }

  /**
   * Sets the maximum contacts to report. Bodies can keep a log of the contacts with other bodies, this is enabled by setting the maximum amount of contacts reported to a number greater than 0.
   */
  fun bodySetMaxContactsReported(body: RID, amount: Long) {
    TransferContext.writeArguments(_RID to body, LONG to amount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_MAX_CONTACTS_REPORTED, NIL)
  }

  /**
   * Sets the body mode, from one of the [enum BodyMode] constants.
   */
  fun bodySetMode(body: RID, mode: Long) {
    TransferContext.writeArguments(_RID to body, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_MODE, NIL)
  }

  /**
   * Sets whether a body uses a callback function to calculate its own physics (see [bodySetForceIntegrationCallback]).
   */
  fun bodySetOmitForceIntegration(body: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_OMIT_FORCE_INTEGRATION, NIL)
  }

  /**
   * Sets a body parameter. A list of available parameters is on the [enum BodyParameter] constants.
   */
  fun bodySetParam(
    body: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to body, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_PARAM, NIL)
  }

  /**
   * Sets the body pickable with rays if `enabled` is set.
   */
  fun bodySetRayPickable(body: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_RAY_PICKABLE,
        NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_SHAPE, NIL)
  }

  /**
   *
   */
  fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Long,
    disabled: Boolean
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_SHAPE_DISABLED, NIL)
  }

  /**
   * Sets the transform matrix for a body shape.
   */
  fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Long,
    transform: Transform
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_SHAPE_TRANSFORM, NIL)
  }

  /**
   * Assigns a space to the body (see [spaceCreate]).
   */
  fun bodySetSpace(body: RID, space: RID) {
    TransferContext.writeArguments(_RID to body, _RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_SPACE, NIL)
  }

  /**
   * Sets a body state (see [enum BodyState] constants).
   */
  fun bodySetState(
    body: RID,
    state: Long,
    value: Any?
  ) {
    TransferContext.writeArguments(_RID to body, LONG to state, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_BODY_SET_STATE, NIL)
  }

  /**
   * Gets a cone_twist_joint parameter (see [enum ConeTwistJointParam] constants).
   */
  fun coneTwistJointGetParam(joint: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to joint, LONG to param)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_CONE_TWIST_JOINT_GET_PARAM, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets a cone_twist_joint parameter (see [enum ConeTwistJointParam] constants).
   */
  fun coneTwistJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_CONE_TWIST_JOINT_SET_PARAM, NIL)
  }

  /**
   * Destroys any of the objects created by PhysicsServer. If the [RID] passed is not one of the objects that can be created by PhysicsServer, an error will be sent to the console.
   */
  fun freeRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_FREE_RID, NIL)
  }

  /**
   * Gets a generic_6_DOF_joint flag (see [enum G6DOFJointAxisFlag] constants).
   */
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

  /**
   * Gets a generic_6_DOF_joint parameter (see [enum G6DOFJointAxisParam] constants).
   */
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

  /**
   * Sets a generic_6_DOF_joint flag (see [enum G6DOFJointAxisFlag] constants).
   */
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

  /**
   * Sets a generic_6_DOF_joint parameter (see [enum G6DOFJointAxisParam] constants).
   */
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

  /**
   * Returns an Info defined by the [enum ProcessInfo] input given.
   */
  fun getProcessInfo(processInfo: Long): Long {
    TransferContext.writeArguments(LONG to processInfo)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_GET_PROCESS_INFO,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets a hinge_joint flag (see [enum HingeJointFlag] constants).
   */
  fun hingeJointGetFlag(joint: RID, flag: Long): Boolean {
    TransferContext.writeArguments(_RID to joint, LONG to flag)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_HINGE_JOINT_GET_FLAG,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Gets a hinge_joint parameter (see [enum HingeJointParam]).
   */
  fun hingeJointGetParam(joint: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to joint, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_HINGE_JOINT_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets a hinge_joint flag (see [enum HingeJointFlag] constants).
   */
  fun hingeJointSetFlag(
    joint: RID,
    flag: Long,
    enabled: Boolean
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to flag, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_HINGE_JOINT_SET_FLAG,
        NIL)
  }

  /**
   * Sets a hinge_joint parameter (see [enum HingeJointParam] constants).
   */
  fun hingeJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_HINGE_JOINT_SET_PARAM,
        NIL)
  }

  /**
   * Creates a [godot.ConeTwistJoint].
   */
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

  /**
   * Creates a [godot.Generic6DOFJoint].
   */
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

  /**
   * Creates a [godot.HingeJoint].
   */
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

  /**
   * Creates a [godot.PinJoint].
   */
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

  /**
   * Creates a [godot.SliderJoint].
   */
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

  /**
   * Gets the priority value of the Joint.
   */
  fun jointGetSolverPriority(joint: RID): Long {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_JOINT_GET_SOLVER_PRIORITY, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the type of the Joint.
   */
  fun jointGetType(joint: RID): PhysicsServer.JointType {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_JOINT_GET_TYPE, LONG)
    return PhysicsServer.JointType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the priority value of the Joint.
   */
  fun jointSetSolverPriority(joint: RID, priority: Long) {
    TransferContext.writeArguments(_RID to joint, LONG to priority)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_JOINT_SET_SOLVER_PRIORITY, NIL)
  }

  /**
   * Returns position of the joint in the local space of body a of the joint.
   */
  fun pinJointGetLocalA(joint: RID): Vector3 {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_PIN_JOINT_GET_LOCAL_A,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns position of the joint in the local space of body b of the joint.
   */
  fun pinJointGetLocalB(joint: RID): Vector3 {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_PIN_JOINT_GET_LOCAL_B,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Gets a pin_joint parameter (see [enum PinJointParam] constants).
   */
  fun pinJointGetParam(joint: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to joint, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_PIN_JOINT_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets position of the joint in the local space of body a of the joint.
   */
  fun pinJointSetLocalA(joint: RID, localA: Vector3) {
    TransferContext.writeArguments(_RID to joint, VECTOR3 to localA)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_PIN_JOINT_SET_LOCAL_A,
        NIL)
  }

  /**
   * Sets position of the joint in the local space of body b of the joint.
   */
  fun pinJointSetLocalB(joint: RID, localB: Vector3) {
    TransferContext.writeArguments(_RID to joint, VECTOR3 to localB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_PIN_JOINT_SET_LOCAL_B,
        NIL)
  }

  /**
   * Sets a pin_joint parameter (see [enum PinJointParam] constants).
   */
  fun pinJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_PIN_JOINT_SET_PARAM,
        NIL)
  }

  /**
   * Activates or deactivates the 3D physics engine.
   */
  fun setActive(active: Boolean) {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SET_ACTIVE, NIL)
  }

  /**
   * Creates a shape of a type from [enum ShapeType]. Does not assign it to a body or an area. To do so, you must use [areaSetShape] or [bodySetShape].
   */
  fun shapeCreate(type: Long): RID {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SHAPE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the shape data.
   */
  fun shapeGetData(shape: RID): Any? {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SHAPE_GET_DATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the type of shape (see [enum ShapeType] constants).
   */
  fun shapeGetType(shape: RID): PhysicsServer.ShapeType {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SHAPE_GET_TYPE, LONG)
    return PhysicsServer.ShapeType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the shape data that defines its shape and size. The data to be passed depends on the kind of shape created [shapeGetType].
   */
  fun shapeSetData(shape: RID, data: Any?) {
    TransferContext.writeArguments(_RID to shape, ANY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SHAPE_SET_DATA, NIL)
  }

  /**
   * Gets a slider_joint parameter (see [enum SliderJointParam] constants).
   */
  fun sliderJointGetParam(joint: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to joint, LONG to param)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SLIDER_JOINT_GET_PARAM, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Gets a slider_joint parameter (see [enum SliderJointParam] constants).
   */
  fun sliderJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SLIDER_JOINT_SET_PARAM, NIL)
  }

  /**
   * Creates a space. A space is a collection of parameters for the physics engine that can be assigned to an area or a body. It can be assigned to an area with [areaSetSpace], or to a body with [bodySetSpace].
   */
  fun spaceCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SPACE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the state of a space, a [godot.PhysicsDirectSpaceState]. This object can be used to make collision/intersection queries.
   */
  fun spaceGetDirectState(space: RID): PhysicsDirectSpaceState? {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SPACE_GET_DIRECT_STATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState?
  }

  /**
   * Returns the value of a space parameter.
   */
  fun spaceGetParam(space: RID, param: Long): Double {
    TransferContext.writeArguments(_RID to space, LONG to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SPACE_GET_PARAM,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns whether the space is active.
   */
  fun spaceIsActive(space: RID): Boolean {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SPACE_IS_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Marks a space as active. It will not have an effect, unless it is assigned to an area or body.
   */
  fun spaceSetActive(space: RID, active: Boolean) {
    TransferContext.writeArguments(_RID to space, BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER_SPACE_SET_ACTIVE, NIL)
  }

  /**
   * Sets the value for a space parameter. A list of available parameters is on the [enum SpaceParameter] constants.
   */
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
    /**
     *
     */
    BODY_AXIS_LINEAR_X(1),

    /**
     *
     */
    BODY_AXIS_LINEAR_Y(2),

    /**
     *
     */
    BODY_AXIS_LINEAR_Z(4),

    /**
     *
     */
    BODY_AXIS_ANGULAR_X(8),

    /**
     *
     */
    BODY_AXIS_ANGULAR_Y(16),

    /**
     *
     */
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
     * The [godot.Shape] is a [godot.PlaneShape].
     */
    SHAPE_PLANE(0),

    /**
     * The [godot.Shape] is a [godot.RayShape].
     */
    SHAPE_RAY(1),

    /**
     * The [godot.Shape] is a [godot.SphereShape].
     */
    SHAPE_SPHERE(2),

    /**
     * The [godot.Shape] is a [godot.BoxShape].
     */
    SHAPE_BOX(3),

    /**
     * The [godot.Shape] is a [godot.CapsuleShape].
     */
    SHAPE_CAPSULE(4),

    /**
     * The [godot.Shape] is a [godot.CylinderShape].
     */
    SHAPE_CYLINDER(5),

    /**
     * The [godot.Shape] is a [godot.ConvexPolygonShape].
     */
    SHAPE_CONVEX_POLYGON(6),

    /**
     * The [godot.Shape] is a [godot.ConcavePolygonShape].
     */
    SHAPE_CONCAVE_POLYGON(7),

    /**
     * The [godot.Shape] is a [godot.HeightMapShape].
     */
    SHAPE_HEIGHTMAP(8),

    /**
     * This constant is used internally by the engine. Any attempt to create this kind of shape results in an error.
     */
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
    /**
     * The strength with which the pinned objects try to stay in positional relation to each other.
     *
     * The higher, the stronger.
     */
    PIN_JOINT_BIAS(0),

    /**
     * The strength with which the pinned objects try to stay in velocity relation to each other.
     *
     * The higher, the stronger.
     */
    PIN_JOINT_DAMPING(1),

    /**
     * If above 0, this value is the maximum value for an impulse that this Joint puts on its ends.
     */
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
     *
     */
    SPACE_PARAM_BODY_ANGULAR_VELOCITY_DAMP_RATIO(6),

    /**
     * Constant to set/get the default solver bias for all physics constraints. A solver bias is a factor controlling how much two objects "rebound", after violating a constraint, to avoid leaving them in that state because of numerical imprecision.
     */
    SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS(7),

    /**
     *
     */
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
    /**
     * Swing is rotation from side to side, around the axis perpendicular to the twist axis.
     *
     * The swing span defines, how much rotation will not get corrected allong the swing axis.
     *
     * Could be defined as looseness in the [godot.ConeTwistJoint].
     *
     * If below 0.05, this behavior is locked.
     */
    CONE_TWIST_JOINT_SWING_SPAN(0),

    /**
     * Twist is the rotation around the twist axis, this value defined how far the joint can twist.
     *
     * Twist is locked if below 0.05.
     */
    CONE_TWIST_JOINT_TWIST_SPAN(1),

    /**
     * The speed with which the swing or twist will take place.
     *
     * The higher, the faster.
     */
    CONE_TWIST_JOINT_BIAS(2),

    /**
     * The ease with which the Joint twists, if it's too low, it takes more force to twist the joint.
     */
    CONE_TWIST_JOINT_SOFTNESS(3),

    /**
     * Defines, how fast the swing- and twist-speed-difference on both sides gets synced.
     */
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
    /**
     * The [godot.Joint] is a [godot.PinJoint].
     */
    JOINT_PIN(0),

    /**
     * The [godot.Joint] is a [godot.HingeJoint].
     */
    JOINT_HINGE(1),

    /**
     * The [godot.Joint] is a [godot.SliderJoint].
     */
    JOINT_SLIDER(2),

    /**
     * The [godot.Joint] is a [godot.ConeTwistJoint].
     */
    JOINT_CONE_TWIST(3),

    /**
     * The [godot.Joint] is a [godot.Generic6DOFJoint].
     */
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
     * Constant to set/get a body's gravity multiplier.
     */
    BODY_PARAM_GRAVITY_SCALE(3),

    /**
     * Constant to set/get a body's linear dampening factor.
     */
    BODY_PARAM_LINEAR_DAMP(4),

    /**
     * Constant to set/get a body's angular dampening factor.
     */
    BODY_PARAM_ANGULAR_DAMP(5),

    /**
     * Represents the size of the [enum BodyParameter] enum.
     */
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
    /**
     * The minimum difference between the pivot points' axes.
     */
    G6DOF_JOINT_LINEAR_LOWER_LIMIT(0),

    /**
     * The maximum difference between the pivot points' axes.
     */
    G6DOF_JOINT_LINEAR_UPPER_LIMIT(1),

    /**
     * A factor that gets applied to the movement across the axes. The lower, the slower the movement.
     */
    G6DOF_JOINT_LINEAR_LIMIT_SOFTNESS(2),

    /**
     * The amount of restitution on the axes movement. The lower, the more velocity-energy gets lost.
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
     * The amount of rotational damping across the axes. The lower, the more dampening occurs.
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
     * When correcting the crossing of limits in rotation across the axes, this error tolerance factor defines how much the correction gets slowed down. The lower, the slower.
     */
    G6DOF_JOINT_ANGULAR_ERP(16),

    /**
     * Target speed for the motor at the axes.
     */
    G6DOF_JOINT_ANGULAR_MOTOR_TARGET_VELOCITY(17),

    /**
     * Maximum acceleration for the motor at the axes.
     */
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
    /**
     * The maximum difference between the pivot points on their X axis before damping happens.
     */
    SLIDER_JOINT_LINEAR_LIMIT_UPPER(0),

    /**
     * The minimum difference between the pivot points on their X axis before damping happens.
     */
    SLIDER_JOINT_LINEAR_LIMIT_LOWER(1),

    /**
     * A factor applied to the movement across the slider axis once the limits get surpassed. The lower, the slower the movement.
     */
    SLIDER_JOINT_LINEAR_LIMIT_SOFTNESS(2),

    /**
     * The amount of restitution once the limits are surpassed. The lower, the more velocityenergy gets lost.
     */
    SLIDER_JOINT_LINEAR_LIMIT_RESTITUTION(3),

    /**
     * The amount of damping once the slider limits are surpassed.
     */
    SLIDER_JOINT_LINEAR_LIMIT_DAMPING(4),

    /**
     * A factor applied to the movement across the slider axis as long as the slider is in the limits. The lower, the slower the movement.
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
    /**
     * The speed with which the two bodies get pulled together when they move in different directions.
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

    /**
     *
     */
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
    /**
     * If `set` there is linear motion possible within the given limits.
     */
    G6DOF_JOINT_FLAG_ENABLE_LINEAR_LIMIT(0),

    /**
     * If `set` there is rotational motion possible.
     */
    G6DOF_JOINT_FLAG_ENABLE_ANGULAR_LIMIT(1),

    /**
     * If `set` there is a rotational motor across these axes.
     */
    G6DOF_JOINT_FLAG_ENABLE_MOTOR(4),

    /**
     * If `set` there is a linear motor on this axis that targets a specific velocity.
     */
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
    /**
     * If `true`, the Hinge has a maximum and a minimum rotation.
     */
    HINGE_JOINT_FLAG_USE_LIMIT(0),

    /**
     * If `true`, a motor turns the Hinge.
     */
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
