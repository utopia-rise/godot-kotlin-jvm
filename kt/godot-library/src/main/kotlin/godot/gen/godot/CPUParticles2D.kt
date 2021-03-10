// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.PoolColorArray
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_COLOR_ARRAY
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * CPU-based 2D particle emitter.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/2d/particle_systems_2d.html](https://docs.godotengine.org/en/latest/tutorials/2d/particle_systems_2d.html)
 *
 * CPU-based 2D particle node used to create a variety of particle systems and effects.
 *
 * See also [godot.Particles2D], which provides the same functionality with hardware acceleration, but may not run on older devices.
 */
@GodotBaseType
open class CPUParticles2D : Node2D() {
  /**
   * Number of particles emitted in one emission cycle.
   */
  open var amount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_AMOUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_AMOUNT, NIL)
    }

  /**
   * Initial rotation applied to each particle, in degrees.
   */
  open var angle: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ANGLE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ANGLE, NIL)
    }

  /**
   * Each particle's rotation will be animated along this [godot.Curve].
   */
  open var angleCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ANGLE_CURVE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ANGLE_CURVE,
          NIL)
    }

  /**
   * Rotation randomness ratio.
   */
  open var angleRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ANGLE_RANDOM,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ANGLE_RANDOM,
          NIL)
    }

  /**
   * Initial angular velocity applied to each particle. Sets the speed of rotation of the particle.
   */
  open var angularVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ANGULAR_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ANGULAR_VELOCITY, NIL)
    }

  /**
   * Each particle's angular velocity will vary along this [godot.Curve].
   */
  open var angularVelocityCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ANGULAR_VELOCITY_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ANGULAR_VELOCITY_CURVE, NIL)
    }

  /**
   * Angular velocity randomness ratio.
   */
  open var angularVelocityRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ANGULAR_VELOCITY_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ANGULAR_VELOCITY_RANDOM, NIL)
    }

  /**
   * Particle animation offset.
   */
  open var animOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ANIM_OFFSET,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ANIM_OFFSET,
          NIL)
    }

  /**
   * Each particle's animation offset will vary along this [godot.Curve].
   */
  open var animOffsetCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ANIM_OFFSET_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ANIM_OFFSET_CURVE, NIL)
    }

  /**
   * Animation offset randomness ratio.
   */
  open var animOffsetRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ANIM_OFFSET_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ANIM_OFFSET_RANDOM, NIL)
    }

  /**
   * Particle animation speed.
   */
  open var animSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ANIM_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ANIM_SPEED,
          NIL)
    }

  /**
   * Each particle's animation speed will vary along this [godot.Curve].
   */
  open var animSpeedCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ANIM_SPEED_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ANIM_SPEED_CURVE, NIL)
    }

  /**
   * Animation speed randomness ratio.
   */
  open var animSpeedRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ANIM_SPEED_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ANIM_SPEED_RANDOM, NIL)
    }

  /**
   * Each particle's initial color. If [texture] is defined, it will be multiplied by this color.
   */
  open var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_COLOR, NIL)
    }

  /**
   * Each particle's color will vary along this [godot.Gradient].
   */
  open var colorRamp: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_COLOR_RAMP,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Gradient?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_COLOR_RAMP,
          NIL)
    }

  /**
   * The rate at which particles lose velocity.
   */
  open var damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_DAMPING,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_DAMPING, NIL)
    }

  /**
   * Damping will vary along this [godot.Curve].
   */
  open var dampingCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_DAMPING_CURVE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_DAMPING_CURVE,
          NIL)
    }

  /**
   * Damping randomness ratio.
   */
  open var dampingRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_DAMPING_RANDOM,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_DAMPING_RANDOM,
          NIL)
    }

  /**
   * Unit vector specifying the particles' emission direction.
   */
  open var direction: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_DIRECTION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_DIRECTION, NIL)
    }

  /**
   * Particle draw order. Uses [enum DrawOrder] values.
   */
  open var drawOrder: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_DRAW_ORDER,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_DRAW_ORDER,
          NIL)
    }

  /**
   * Sets the [godot.core.Color]s to modulate particles by when using [EMISSION_SHAPE_POINTS] or [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  open var emissionColors: PoolColorArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EMISSION_COLORS, POOL_COLOR_ARRAY)
      return TransferContext.readReturnValue(POOL_COLOR_ARRAY, false) as PoolColorArray
    }
    set(value) {
      TransferContext.writeArguments(POOL_COLOR_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EMISSION_COLORS, NIL)
    }

  /**
   * Sets the direction the particles will be emitted in when using [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  open var emissionNormals: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EMISSION_NORMALS, POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(value) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EMISSION_NORMALS, NIL)
    }

  /**
   * Sets the initial positions to spawn particles when using [EMISSION_SHAPE_POINTS] or [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  open var emissionPoints: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EMISSION_POINTS, POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(value) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EMISSION_POINTS, NIL)
    }

  /**
   * The rectangle's extents if [emissionShape] is set to [EMISSION_SHAPE_RECTANGLE].
   */
  open var emissionRectExtents: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EMISSION_RECT_EXTENTS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EMISSION_RECT_EXTENTS, NIL)
    }

  /**
   * Particles will be emitted inside this region. See [enum EmissionShape] for possible values.
   */
  open var emissionShape: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EMISSION_SHAPE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EMISSION_SHAPE,
          NIL)
    }

  /**
   * The sphere's radius if [emissionShape] is set to [EMISSION_SHAPE_SPHERE].
   */
  open var emissionSphereRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EMISSION_SPHERE_RADIUS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EMISSION_SPHERE_RADIUS, NIL)
    }

  /**
   * If `true`, particles are being emitted.
   */
  open var emitting: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EMITTING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EMITTING, NIL)
    }

  /**
   * How rapidly particles in an emission cycle are emitted. If greater than `0`, there will be a gap in emissions before the next cycle begins.
   */
  open var explosiveness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EXPLOSIVENESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EXPLOSIVENESS,
          NIL)
    }

  /**
   * The particle system's frame rate is fixed to a value. For instance, changing the value to 2 will make the particles render at 2 frames per second. Note this does not slow down the simulation of the particle system itself.
   */
  open var fixedFps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_FIXED_FPS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_FIXED_FPS, NIL)
    }

  /**
   * Align Y axis of particle with the direction of its velocity.
   */
  open var flagAlignY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_FLAG_ALIGN_Y,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_FLAG_ALIGN_Y,
          NIL)
    }

  /**
   * If `true`, results in fractional delta calculation which has a smoother particles display effect.
   */
  open var fractDelta: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_FRACT_DELTA,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_FRACT_DELTA,
          NIL)
    }

  /**
   * Gravity applied to every particle.
   */
  open var gravity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_GRAVITY,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_GRAVITY, NIL)
    }

  /**
   * Initial hue variation applied to each particle.
   */
  open var hueVariation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_HUE_VARIATION,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_HUE_VARIATION,
          NIL)
    }

  /**
   * Each particle's hue will vary along this [godot.Curve].
   */
  open var hueVariationCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_HUE_VARIATION_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_HUE_VARIATION_CURVE, NIL)
    }

  /**
   * Hue variation randomness ratio.
   */
  open var hueVariationRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_HUE_VARIATION_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_HUE_VARIATION_RANDOM, NIL)
    }

  /**
   * Initial velocity magnitude for each particle. Direction comes from [spread] and the node's orientation.
   */
  open var initialVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_INITIAL_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_INITIAL_VELOCITY, NIL)
    }

  /**
   * Initial velocity randomness ratio.
   */
  open var initialVelocityRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_INITIAL_VELOCITY_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_INITIAL_VELOCITY_RANDOM, NIL)
    }

  /**
   * Amount of time each particle will exist.
   */
  open var lifetime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_LIFETIME,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_LIFETIME, NIL)
    }

  /**
   * Particle lifetime randomness ratio.
   */
  open var lifetimeRandomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_LIFETIME_RANDOMNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_LIFETIME_RANDOMNESS, NIL)
    }

  /**
   * Linear acceleration applied to each particle in the direction of motion.
   */
  open var linearAccel: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_LINEAR_ACCEL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_LINEAR_ACCEL,
          NIL)
    }

  /**
   * Each particle's linear acceleration will vary along this [godot.Curve].
   */
  open var linearAccelCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_LINEAR_ACCEL_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_LINEAR_ACCEL_CURVE, NIL)
    }

  /**
   * Linear acceleration randomness ratio.
   */
  open var linearAccelRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_LINEAR_ACCEL_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_LINEAR_ACCEL_RANDOM, NIL)
    }

  /**
   * If `true`, particles use the parent node's coordinate space. If `false`, they use global coordinates.
   */
  open var localCoords: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_LOCAL_COORDS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_LOCAL_COORDS,
          NIL)
    }

  /**
   * Normal map to be used for the [texture] property.
   *
   * **Note:** Godot expects the normal map to use X+, Y-, and Z+ coordinates. See [this page](http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates) for a comparison of normal map coordinates expected by popular engines.
   */
  open var normalmap: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_NORMALMAP,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_NORMALMAP, NIL)
    }

  /**
   * If `true`, only one emission cycle occurs. If set `true` during a cycle, emission will stop at the cycle's end.
   */
  open var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ONE_SHOT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ONE_SHOT, NIL)
    }

  /**
   * Orbital velocity applied to each particle. Makes the particles circle around origin. Specified in number of full rotations around origin per second.
   */
  open var orbitVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ORBIT_VELOCITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ORBIT_VELOCITY,
          NIL)
    }

  /**
   * Each particle's orbital velocity will vary along this [godot.Curve].
   */
  open var orbitVelocityCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ORBIT_VELOCITY_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ORBIT_VELOCITY_CURVE, NIL)
    }

  /**
   * Orbital velocity randomness ratio.
   */
  open var orbitVelocityRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ORBIT_VELOCITY_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ORBIT_VELOCITY_RANDOM, NIL)
    }

  /**
   * Particle system starts as if it had already run for this many seconds.
   */
  open var preprocess: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_PREPROCESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_PREPROCESS,
          NIL)
    }

  /**
   * Radial acceleration applied to each particle. Makes particle accelerate away from origin.
   */
  open var radialAccel: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_RADIAL_ACCEL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_RADIAL_ACCEL,
          NIL)
    }

  /**
   * Each particle's radial acceleration will vary along this [godot.Curve].
   */
  open var radialAccelCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_RADIAL_ACCEL_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_RADIAL_ACCEL_CURVE, NIL)
    }

  /**
   * Radial acceleration randomness ratio.
   */
  open var radialAccelRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_RADIAL_ACCEL_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_RADIAL_ACCEL_RANDOM, NIL)
    }

  /**
   * Emission lifetime randomness ratio.
   */
  open var randomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_RANDOMNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_RANDOMNESS,
          NIL)
    }

  /**
   * Initial scale applied to each particle.
   */
  open var scaleAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_SCALE_AMOUNT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_SCALE_AMOUNT,
          NIL)
    }

  /**
   * Each particle's scale will vary along this [godot.Curve].
   */
  open var scaleAmountCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_SCALE_AMOUNT_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_SCALE_AMOUNT_CURVE, NIL)
    }

  /**
   * Scale randomness ratio.
   */
  open var scaleAmountRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_SCALE_AMOUNT_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_SCALE_AMOUNT_RANDOM, NIL)
    }

  /**
   * Particle system's running speed scaling ratio. A value of `0` can be used to pause the particles.
   */
  open var speedScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_SPEED_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_SPEED_SCALE,
          NIL)
    }

  /**
   * Each particle's initial direction range from `+spread` to `-spread` degrees.
   */
  open var spread: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_SPREAD, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_SPREAD, NIL)
    }

  /**
   * Tangential acceleration applied to each particle. Tangential acceleration is perpendicular to the particle's velocity giving the particles a swirling motion.
   */
  open var tangentialAccel: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_TANGENTIAL_ACCEL, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_TANGENTIAL_ACCEL, NIL)
    }

  /**
   * Each particle's tangential acceleration will vary along this [godot.Curve].
   */
  open var tangentialAccelCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_TANGENTIAL_ACCEL_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_TANGENTIAL_ACCEL_CURVE, NIL)
    }

  /**
   * Tangential acceleration randomness ratio.
   */
  open var tangentialAccelRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_TANGENTIAL_ACCEL_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_TANGENTIAL_ACCEL_RANDOM, NIL)
    }

  /**
   * Particle texture. If `null`, particles will be squares.
   */
  open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_TEXTURE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_CPUPARTICLES2D)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun direction(schedule: Vector2.() -> Unit): Vector2 = direction.apply{
      schedule(this)
      direction = this
  }


  open fun emissionRectExtents(schedule: Vector2.() -> Unit): Vector2 = emissionRectExtents.apply{
      schedule(this)
      emissionRectExtents = this
  }


  open fun gravity(schedule: Vector2.() -> Unit): Vector2 = gravity.apply{
      schedule(this)
      gravity = this
  }


  open fun _textureChanged() {
  }

  open fun _updateRenderThread() {
  }

  /**
   * Sets this node's properties to match a given [godot.Particles2D] node with an assigned [godot.ParticlesMaterial].
   */
  open fun convertFromParticles(particles: Node) {
    TransferContext.writeArguments(OBJECT to particles)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_CONVERT_FROM_PARTICLES, NIL)
  }

  /**
   * Restarts the particle emitter.
   */
  open fun restart() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_RESTART, NIL)
  }

  enum class Flags(
    id: Long
  ) {
    /**
     * Use with [setParticleFlag] to set [flagAlignY].
     */
    FLAG_ALIGN_Y_TO_VELOCITY(0),

    /**
     * Present for consistency with 3D particle nodes, not used in 2D.
     */
    FLAG_ROTATE_Y(1),

    /**
     * Present for consistency with 3D particle nodes, not used in 2D.
     */
    FLAG_DISABLE_Z(2),

    /**
     * Represents the size of the [enum Flags] enum.
     */
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
    /**
     * All particles will be emitted from a single point.
     */
    EMISSION_SHAPE_POINT(0),

    /**
     * Particles will be emitted on the surface of a sphere flattened to two dimensions.
     */
    EMISSION_SHAPE_SPHERE(1),

    /**
     * Particles will be emitted in the area of a rectangle.
     */
    EMISSION_SHAPE_RECTANGLE(2),

    /**
     * Particles will be emitted at a position chosen randomly among [emissionPoints]. Particle color will be modulated by [emissionColors].
     */
    EMISSION_SHAPE_POINTS(3),

    /**
     * Particles will be emitted at a position chosen randomly among [emissionPoints]. Particle velocity and rotation will be set based on [emissionNormals]. Particle color will be modulated by [emissionColors].
     */
    EMISSION_SHAPE_DIRECTED_POINTS(4),

    /**
     * Represents the size of the [enum EmissionShape] enum.
     */
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
    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set initial velocity properties.
     */
    PARAM_INITIAL_LINEAR_VELOCITY(0),

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set angular velocity properties.
     */
    PARAM_ANGULAR_VELOCITY(1),

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set orbital velocity properties.
     */
    PARAM_ORBIT_VELOCITY(2),

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set linear acceleration properties.
     */
    PARAM_LINEAR_ACCEL(3),

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set radial acceleration properties.
     */
    PARAM_RADIAL_ACCEL(4),

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set tangential acceleration properties.
     */
    PARAM_TANGENTIAL_ACCEL(5),

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set damping properties.
     */
    PARAM_DAMPING(6),

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set angle properties.
     */
    PARAM_ANGLE(7),

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set scale properties.
     */
    PARAM_SCALE(8),

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set hue variation properties.
     */
    PARAM_HUE_VARIATION(9),

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set animation speed properties.
     */
    PARAM_ANIM_SPEED(10),

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set animation offset properties.
     */
    PARAM_ANIM_OFFSET(11),

    /**
     * Represents the size of the [enum Parameter] enum.
     */
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
    /**
     * Particles are drawn in the order emitted.
     */
    DRAW_ORDER_INDEX(0),

    /**
     * Particles are drawn in order of remaining lifetime.
     */
    DRAW_ORDER_LIFETIME(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Particles are drawn in the order emitted.
     */
    final const val DRAW_ORDER_INDEX: Long = 0

    /**
     * Particles are drawn in order of remaining lifetime.
     */
    final const val DRAW_ORDER_LIFETIME: Long = 1

    /**
     * Particles will be emitted at a position chosen randomly among [emissionPoints]. Particle velocity and rotation will be set based on [emissionNormals]. Particle color will be modulated by [emissionColors].
     */
    final const val EMISSION_SHAPE_DIRECTED_POINTS: Long = 4

    /**
     * Represents the size of the [enum EmissionShape] enum.
     */
    final const val EMISSION_SHAPE_MAX: Long = 5

    /**
     * All particles will be emitted from a single point.
     */
    final const val EMISSION_SHAPE_POINT: Long = 0

    /**
     * Particles will be emitted at a position chosen randomly among [emissionPoints]. Particle color will be modulated by [emissionColors].
     */
    final const val EMISSION_SHAPE_POINTS: Long = 3

    /**
     * Particles will be emitted in the area of a rectangle.
     */
    final const val EMISSION_SHAPE_RECTANGLE: Long = 2

    /**
     * Particles will be emitted on the surface of a sphere flattened to two dimensions.
     */
    final const val EMISSION_SHAPE_SPHERE: Long = 1

    /**
     * Use with [setParticleFlag] to set [flagAlignY].
     */
    final const val FLAG_ALIGN_Y_TO_VELOCITY: Long = 0

    /**
     * Present for consistency with 3D particle nodes, not used in 2D.
     */
    final const val FLAG_DISABLE_Z: Long = 2

    /**
     * Represents the size of the [enum Flags] enum.
     */
    final const val FLAG_MAX: Long = 3

    /**
     * Present for consistency with 3D particle nodes, not used in 2D.
     */
    final const val FLAG_ROTATE_Y: Long = 1

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set angle properties.
     */
    final const val PARAM_ANGLE: Long = 7

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set angular velocity properties.
     */
    final const val PARAM_ANGULAR_VELOCITY: Long = 1

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set animation offset properties.
     */
    final const val PARAM_ANIM_OFFSET: Long = 11

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set animation speed properties.
     */
    final const val PARAM_ANIM_SPEED: Long = 10

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set damping properties.
     */
    final const val PARAM_DAMPING: Long = 6

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set hue variation properties.
     */
    final const val PARAM_HUE_VARIATION: Long = 9

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set initial velocity properties.
     */
    final const val PARAM_INITIAL_LINEAR_VELOCITY: Long = 0

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set linear acceleration properties.
     */
    final const val PARAM_LINEAR_ACCEL: Long = 3

    /**
     * Represents the size of the [enum Parameter] enum.
     */
    final const val PARAM_MAX: Long = 12

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set orbital velocity properties.
     */
    final const val PARAM_ORBIT_VELOCITY: Long = 2

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set radial acceleration properties.
     */
    final const val PARAM_RADIAL_ACCEL: Long = 4

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set scale properties.
     */
    final const val PARAM_SCALE: Long = 8

    /**
     * Use with [setParam], [setParamRandomness], and [setParamCurve] to set tangential acceleration properties.
     */
    final const val PARAM_TANGENTIAL_ACCEL: Long = 5
  }
}
