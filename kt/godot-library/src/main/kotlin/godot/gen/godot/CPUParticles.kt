// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.PoolColorArray
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_COLOR_ARRAY
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class CPUParticles : GeometryInstance() {
  open var amount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_AMOUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_AMOUNT, NIL)
    }

  open var angle: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ANGLE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ANGLE, NIL)
    }

  open var angleCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ANGLE_CURVE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ANGLE_CURVE, NIL)
    }

  open var angleRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ANGLE_RANDOM,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ANGLE_RANDOM,
          NIL)
    }

  open var angularVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ANGULAR_VELOCITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ANGULAR_VELOCITY,
          NIL)
    }

  open var angularVelocityCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ANGULAR_VELOCITY_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ANGULAR_VELOCITY_CURVE, NIL)
    }

  open var angularVelocityRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ANGULAR_VELOCITY_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ANGULAR_VELOCITY_RANDOM, NIL)
    }

  open var animOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ANIM_OFFSET,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ANIM_OFFSET, NIL)
    }

  open var animOffsetCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ANIM_OFFSET_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ANIM_OFFSET_CURVE, NIL)
    }

  open var animOffsetRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ANIM_OFFSET_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ANIM_OFFSET_RANDOM, NIL)
    }

  open var animSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ANIM_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ANIM_SPEED, NIL)
    }

  open var animSpeedCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ANIM_SPEED_CURVE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ANIM_SPEED_CURVE,
          NIL)
    }

  open var animSpeedRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ANIM_SPEED_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ANIM_SPEED_RANDOM, NIL)
    }

  open var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_COLOR, NIL)
    }

  open var colorRamp: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_COLOR_RAMP,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Gradient?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_COLOR_RAMP, NIL)
    }

  open var damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_DAMPING, NIL)
    }

  open var dampingCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_DAMPING_CURVE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_DAMPING_CURVE,
          NIL)
    }

  open var dampingRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_DAMPING_RANDOM,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_DAMPING_RANDOM,
          NIL)
    }

  open var direction: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_DIRECTION,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_DIRECTION, NIL)
    }

  open var drawOrder: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_DRAW_ORDER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_DRAW_ORDER, NIL)
    }

  open var emissionBoxExtents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_EMISSION_BOX_EXTENTS, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_EMISSION_BOX_EXTENTS, NIL)
    }

  open var emissionColors: PoolColorArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_EMISSION_COLORS,
          POOL_COLOR_ARRAY)
      return TransferContext.readReturnValue(POOL_COLOR_ARRAY, false) as PoolColorArray
    }
    set(value) {
      TransferContext.writeArguments(POOL_COLOR_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_EMISSION_COLORS,
          NIL)
    }

  open var emissionNormals: PoolVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_EMISSION_NORMALS,
          POOL_VECTOR3_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
    }
    set(value) {
      TransferContext.writeArguments(POOL_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_EMISSION_NORMALS,
          NIL)
    }

  open var emissionPoints: PoolVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_EMISSION_POINTS,
          POOL_VECTOR3_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
    }
    set(value) {
      TransferContext.writeArguments(POOL_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_EMISSION_POINTS,
          NIL)
    }

  open var emissionShape: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_EMISSION_SHAPE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_EMISSION_SHAPE,
          NIL)
    }

  open var emissionSphereRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_EMISSION_SPHERE_RADIUS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_EMISSION_SPHERE_RADIUS, NIL)
    }

  open var emitting: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_EMITTING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_EMITTING, NIL)
    }

  open var explosiveness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_EXPLOSIVENESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_EXPLOSIVENESS,
          NIL)
    }

  open var fixedFps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_FIXED_FPS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_FIXED_FPS, NIL)
    }

  open var flagAlignY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_FLAG_ALIGN_Y,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_FLAG_ALIGN_Y,
          NIL)
    }

  open var flagDisableZ: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_FLAG_DISABLE_Z,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_FLAG_DISABLE_Z,
          NIL)
    }

  open var flagRotateY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_FLAG_ROTATE_Y,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_FLAG_ROTATE_Y,
          NIL)
    }

  open var flatness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_FLATNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_FLATNESS, NIL)
    }

  open var fractDelta: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_FRACT_DELTA,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_FRACT_DELTA, NIL)
    }

  open var gravity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_GRAVITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_GRAVITY, NIL)
    }

  open var hueVariation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_HUE_VARIATION,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_HUE_VARIATION,
          NIL)
    }

  open var hueVariationCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_HUE_VARIATION_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_HUE_VARIATION_CURVE, NIL)
    }

  open var hueVariationRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_HUE_VARIATION_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_HUE_VARIATION_RANDOM, NIL)
    }

  open var initialVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_INITIAL_VELOCITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_INITIAL_VELOCITY,
          NIL)
    }

  open var initialVelocityRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_INITIAL_VELOCITY_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_INITIAL_VELOCITY_RANDOM, NIL)
    }

  open var lifetime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_LIFETIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_LIFETIME, NIL)
    }

  open var lifetimeRandomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_LIFETIME_RANDOMNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_LIFETIME_RANDOMNESS, NIL)
    }

  open var linearAccel: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_LINEAR_ACCEL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_LINEAR_ACCEL,
          NIL)
    }

  open var linearAccelCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_LINEAR_ACCEL_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_LINEAR_ACCEL_CURVE, NIL)
    }

  open var linearAccelRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_LINEAR_ACCEL_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_LINEAR_ACCEL_RANDOM, NIL)
    }

  open var localCoords: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_LOCAL_COORDS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_LOCAL_COORDS,
          NIL)
    }

  open var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_MESH, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_MESH, NIL)
    }

  open var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ONE_SHOT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ONE_SHOT, NIL)
    }

  open var orbitVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ORBIT_VELOCITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ORBIT_VELOCITY,
          NIL)
    }

  open var orbitVelocityCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ORBIT_VELOCITY_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ORBIT_VELOCITY_CURVE, NIL)
    }

  open var orbitVelocityRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_ORBIT_VELOCITY_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_ORBIT_VELOCITY_RANDOM, NIL)
    }

  open var preprocess: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_PREPROCESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_PREPROCESS, NIL)
    }

  open var radialAccel: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_RADIAL_ACCEL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_RADIAL_ACCEL,
          NIL)
    }

  open var radialAccelCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_RADIAL_ACCEL_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_RADIAL_ACCEL_CURVE, NIL)
    }

  open var radialAccelRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_RADIAL_ACCEL_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_RADIAL_ACCEL_RANDOM, NIL)
    }

  open var randomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_RANDOMNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_RANDOMNESS, NIL)
    }

  open var scaleAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_SCALE_AMOUNT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_SCALE_AMOUNT,
          NIL)
    }

  open var scaleAmountCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_SCALE_AMOUNT_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_SCALE_AMOUNT_CURVE, NIL)
    }

  open var scaleAmountRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_SCALE_AMOUNT_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_SCALE_AMOUNT_RANDOM, NIL)
    }

  open var speedScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_SPEED_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_SPEED_SCALE, NIL)
    }

  open var spread: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_SPREAD, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_SPREAD, NIL)
    }

  open var tangentialAccel: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_TANGENTIAL_ACCEL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_TANGENTIAL_ACCEL,
          NIL)
    }

  open var tangentialAccelCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_TANGENTIAL_ACCEL_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_TANGENTIAL_ACCEL_CURVE, NIL)
    }

  open var tangentialAccelRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_GET_TANGENTIAL_ACCEL_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_SET_TANGENTIAL_ACCEL_RANDOM, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CPUPARTICLES)

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun direction(schedule: Vector3.() -> Unit): Vector3 = direction.apply{
      schedule(this)
      direction = this
  }


  open fun emissionBoxExtents(schedule: Vector3.() -> Unit): Vector3 = emissionBoxExtents.apply{
      schedule(this)
      emissionBoxExtents = this
  }


  open fun gravity(schedule: Vector3.() -> Unit): Vector3 = gravity.apply{
      schedule(this)
      gravity = this
  }


  open fun _updateRenderThread() {
  }

  open fun convertFromParticles(particles: Node) {
    TransferContext.writeArguments(OBJECT to particles)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_CONVERT_FROM_PARTICLES,
        NIL)
  }

  open fun restart() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES_RESTART, NIL)
  }

  enum class Flags(
    id: Long
  ) {
    FLAG_ALIGN_Y_TO_VELOCITY(0),

    FLAG_ROTATE_Y(1),

    FLAG_DISABLE_Z(2),

    FLAG_MAX(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EmissionShape(
    id: Long
  ) {
    EMISSION_SHAPE_POINT(0),

    EMISSION_SHAPE_SPHERE(1),

    EMISSION_SHAPE_BOX(2),

    EMISSION_SHAPE_POINTS(3),

    EMISSION_SHAPE_DIRECTED_POINTS(4),

    EMISSION_SHAPE_MAX(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Parameter(
    id: Long
  ) {
    PARAM_INITIAL_LINEAR_VELOCITY(0),

    PARAM_ANGULAR_VELOCITY(1),

    PARAM_ORBIT_VELOCITY(2),

    PARAM_LINEAR_ACCEL(3),

    PARAM_RADIAL_ACCEL(4),

    PARAM_TANGENTIAL_ACCEL(5),

    PARAM_DAMPING(6),

    PARAM_ANGLE(7),

    PARAM_SCALE(8),

    PARAM_HUE_VARIATION(9),

    PARAM_ANIM_SPEED(10),

    PARAM_ANIM_OFFSET(11),

    PARAM_MAX(12);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DrawOrder(
    id: Long
  ) {
    DRAW_ORDER_INDEX(0),

    DRAW_ORDER_LIFETIME(1),

    DRAW_ORDER_VIEW_DEPTH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val DRAW_ORDER_INDEX: Long = 0

    final const val DRAW_ORDER_LIFETIME: Long = 1

    final const val DRAW_ORDER_VIEW_DEPTH: Long = 2

    final const val EMISSION_SHAPE_BOX: Long = 2

    final const val EMISSION_SHAPE_DIRECTED_POINTS: Long = 4

    final const val EMISSION_SHAPE_MAX: Long = 5

    final const val EMISSION_SHAPE_POINT: Long = 0

    final const val EMISSION_SHAPE_POINTS: Long = 3

    final const val EMISSION_SHAPE_SPHERE: Long = 1

    final const val FLAG_ALIGN_Y_TO_VELOCITY: Long = 0

    final const val FLAG_DISABLE_Z: Long = 2

    final const val FLAG_MAX: Long = 3

    final const val FLAG_ROTATE_Y: Long = 1

    final const val PARAM_ANGLE: Long = 7

    final const val PARAM_ANGULAR_VELOCITY: Long = 1

    final const val PARAM_ANIM_OFFSET: Long = 11

    final const val PARAM_ANIM_SPEED: Long = 10

    final const val PARAM_DAMPING: Long = 6

    final const val PARAM_HUE_VARIATION: Long = 9

    final const val PARAM_INITIAL_LINEAR_VELOCITY: Long = 0

    final const val PARAM_LINEAR_ACCEL: Long = 3

    final const val PARAM_MAX: Long = 12

    final const val PARAM_ORBIT_VELOCITY: Long = 2

    final const val PARAM_RADIAL_ACCEL: Long = 4

    final const val PARAM_SCALE: Long = 8

    final const val PARAM_TANGENTIAL_ACCEL: Long = 5
  }
}
