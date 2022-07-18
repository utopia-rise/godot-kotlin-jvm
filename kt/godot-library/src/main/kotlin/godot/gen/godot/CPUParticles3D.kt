// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.PackedVector3Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * CPU-based 3D particle emitter.
 *
 * CPU-based 3D particle node used to create a variety of particle systems and effects.
 *
 * See also [godot.GPUParticles3D], which provides the same functionality with hardware acceleration, but may not run on older devices.
 */
@GodotBaseType
public open class CPUParticles3D : GeometryInstance3D() {
  /**
   * If `true`, particles are being emitted.
   */
  public var emitting: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_IS_EMITTING,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_EMITTING,
          NIL.ordinal)
    }

  /**
   * Number of particles emitted in one emission cycle.
   */
  public var amount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_AMOUNT,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_AMOUNT, NIL.ordinal)
    }

  /**
   * Amount of time each particle will exist.
   */
  public var lifetime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_LIFETIME,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_LIFETIME,
          NIL.ordinal)
    }

  /**
   * If `true`, only one emission cycle occurs. If set `true` during a cycle, emission will stop at the cycle's end.
   */
  public var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_ONE_SHOT,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_ONE_SHOT,
          NIL.ordinal)
    }

  /**
   * Particle system starts as if it had already run for this many seconds.
   */
  public var preprocess: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_PRE_PROCESS_TIME,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_PRE_PROCESS_TIME,
          NIL.ordinal)
    }

  /**
   * Particle system's running speed scaling ratio. A value of `0` can be used to pause the particles.
   */
  public var speedScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_SPEED_SCALE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_SPEED_SCALE,
          NIL.ordinal)
    }

  /**
   * How rapidly particles in an emission cycle are emitted. If greater than `0`, there will be a gap in emissions before the next cycle begins.
   */
  public var explosiveness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_EXPLOSIVENESS_RATIO,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_EXPLOSIVENESS_RATIO,
          NIL.ordinal)
    }

  /**
   * Emission lifetime randomness ratio.
   */
  public var randomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_RANDOMNESS_RATIO,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_RANDOMNESS_RATIO,
          NIL.ordinal)
    }

  /**
   * Particle lifetime randomness ratio.
   */
  public var lifetimeRandomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_LIFETIME_RANDOMNESS,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_LIFETIME_RANDOMNESS,
          NIL.ordinal)
    }

  /**
   * The particle system's frame rate is fixed to a value. For instance, changing the value to 2 will make the particles render at 2 frames per second. Note this does not slow down the particle system itself.
   */
  public var fixedFps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_FIXED_FPS,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_FIXED_FPS,
          NIL.ordinal)
    }

  /**
   * If `true`, results in fractional delta calculation which has a smoother particles display effect.
   */
  public var fractDelta: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_FRACTIONAL_DELTA,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_FRACTIONAL_DELTA,
          NIL.ordinal)
    }

  /**
   * If `true`, particles use the parent node's coordinate space. If `false`, they use global coordinates.
   */
  public var localCoords: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_USE_LOCAL_COORDINATES, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_USE_LOCAL_COORDINATES, NIL.ordinal)
    }

  /**
   * Particle draw order. Uses [enum DrawOrder] values.
   */
  public var drawOrder: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_DRAW_ORDER,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_DRAW_ORDER,
          NIL.ordinal)
    }

  /**
   * The [godot.Mesh] used for each particle. If `null`, particles will be spheres.
   */
  public var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_MESH,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_MESH, NIL.ordinal)
    }

  /**
   * Particles will be emitted inside this region. See [enum EmissionShape] for possible values.
   */
  public var emissionShape: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_EMISSION_SHAPE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_EMISSION_SHAPE,
          NIL.ordinal)
    }

  /**
   * The sphere's radius if [enum EmissionShape] is set to [EMISSION_SHAPE_SPHERE].
   */
  public var emissionSphereRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_EMISSION_SPHERE_RADIUS, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_EMISSION_SPHERE_RADIUS, NIL.ordinal)
    }

  /**
   * The rectangle's extents if [emissionShape] is set to [EMISSION_SHAPE_BOX].
   */
  public var emissionBoxExtents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_EMISSION_BOX_EXTENTS, VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_EMISSION_BOX_EXTENTS, NIL.ordinal)
    }

  /**
   * Sets the initial positions to spawn particles when using [EMISSION_SHAPE_POINTS] or [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public var emissionPoints: PackedVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_EMISSION_POINTS,
          PACKED_VECTOR3_ARRAY.ordinal)
      return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_EMISSION_POINTS,
          NIL.ordinal)
    }

  /**
   * Sets the direction the particles will be emitted in when using [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public var emissionNormals: PackedVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_EMISSION_NORMALS,
          PACKED_VECTOR3_ARRAY.ordinal)
      return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_EMISSION_NORMALS,
          NIL.ordinal)
    }

  /**
   * Sets the [godot.core.Color]s to modulate particles by when using [EMISSION_SHAPE_POINTS] or [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public var emissionColors: PackedColorArray
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_EMISSION_COLORS,
          PACKED_COLOR_ARRAY.ordinal)
      return TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_COLOR_ARRAY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_EMISSION_COLORS,
          NIL.ordinal)
    }

  /**
   * The axis of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingAxis: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_EMISSION_RING_AXIS,
          VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_EMISSION_RING_AXIS,
          NIL.ordinal)
    }

  /**
   * The height of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingHeight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_EMISSION_RING_HEIGHT, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_EMISSION_RING_HEIGHT, NIL.ordinal)
    }

  /**
   * The radius of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_EMISSION_RING_RADIUS, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_EMISSION_RING_RADIUS, NIL.ordinal)
    }

  /**
   * The inner radius of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingInnerRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_EMISSION_RING_INNER_RADIUS, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_EMISSION_RING_INNER_RADIUS, NIL.ordinal)
    }

  /**
   * Unit vector specifying the particles' emission direction.
   */
  public var direction: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_DIRECTION,
          VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_DIRECTION,
          NIL.ordinal)
    }

  /**
   * Each particle's initial direction range from `+spread` to `-spread` degrees. Applied to X/Z plane and Y/Z planes.
   */
  public var spread: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_SPREAD,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_SPREAD, NIL.ordinal)
    }

  /**
   * Amount of [spread] in Y/Z plane. A value of `1` restricts particles to X/Z plane.
   */
  public var flatness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_FLATNESS,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_FLATNESS,
          NIL.ordinal)
    }

  /**
   * Gravity applied to every particle.
   */
  public var gravity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_GRAVITY,
          VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_GRAVITY,
          NIL.ordinal)
    }

  /**
   * If set to true, three different scale curves can be specified, one per scale axis.
   */
  public var splitScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_SPLIT_SCALE,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_SPLIT_SCALE,
          NIL.ordinal)
    }

  /**
   * Curve for the scale over life, along the x axis.
   */
  public var scaleCurveX: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_SCALE_CURVE_X,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_SCALE_CURVE_X,
          NIL.ordinal)
    }

  /**
   * Curve for the scale over life, along the y axis.
   */
  public var scaleCurveY: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_SCALE_CURVE_Y,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_SCALE_CURVE_Y,
          NIL.ordinal)
    }

  /**
   * Curve for the scale over life, along the z axis.
   */
  public var scaleCurveZ: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_SCALE_CURVE_Z,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_SCALE_CURVE_Z,
          NIL.ordinal)
    }

  /**
   * Each particle's initial color. To have particle display color in a [godot.BaseMaterial3D] make sure to set [godot.BaseMaterial3D.vertexColorUseAsAlbedo] to `true`.
   */
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_COLOR,
          COLOR.ordinal)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_COLOR, NIL.ordinal)
    }

  /**
   * Each particle's color will vary along this [godot.GradientTexture1D] over its lifetime (multiplied with [color]).
   */
  public var colorRamp: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_COLOR_RAMP,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Gradient?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_COLOR_RAMP,
          NIL.ordinal)
    }

  /**
   * Each particle's initial color will vary along this [godot.GradientTexture1D] (multiplied with [color]).
   */
  public var colorInitialRamp: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_COLOR_INITIAL_RAMP,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Gradient?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_COLOR_INITIAL_RAMP,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CPUPARTICLES3D)
  }

  /**
   * Restarts the particle emitter.
   */
  public fun restart(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_RESTART, NIL.ordinal)
  }

  /**
   * Sets the minimum value for the given parameter
   */
  public fun setParamMin(`param`: CPUParticles3D.Parameter, `value`: Double): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_PARAM_MIN,
        NIL.ordinal)
  }

  /**
   *
   */
  public fun getParamMin(`param`: CPUParticles3D.Parameter): Double {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_PARAM_MIN,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the maximum value for the given parameter
   */
  public fun setParamMax(`param`: CPUParticles3D.Parameter, `value`: Double): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_PARAM_MAX,
        NIL.ordinal)
  }

  /**
   *
   */
  public fun getParamMax(`param`: CPUParticles3D.Parameter): Double {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_PARAM_MAX,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the [godot.Curve] of the parameter specified by [enum Parameter].
   */
  public fun setParamCurve(`param`: CPUParticles3D.Parameter, curve: Curve): Unit {
    TransferContext.writeArguments(LONG to param.id, OBJECT to curve)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_PARAM_CURVE,
        NIL.ordinal)
  }

  /**
   * Returns the [godot.Curve] of the parameter specified by [enum Parameter].
   */
  public fun getParamCurve(`param`: CPUParticles3D.Parameter): Curve? {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_PARAM_CURVE,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Curve?
  }

  /**
   * Enables or disables the given particle flag (see [enum ParticleFlags] for options).
   */
  public fun setParticleFlag(particleFlag: CPUParticles3D.ParticleFlags, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to particleFlag.id, BOOL to enable)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_SET_PARTICLE_FLAG,
        NIL.ordinal)
  }

  /**
   * Returns the enabled state of the given particle flag (see [enum ParticleFlags] for options).
   */
  public fun getParticleFlag(particleFlag: CPUParticles3D.ParticleFlags): Boolean {
    TransferContext.writeArguments(LONG to particleFlag.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_GET_PARTICLE_FLAG,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets this node's properties to match a given [godot.GPUParticles3D] node with an assigned [godot.ParticlesMaterial].
   */
  public fun convertFromParticles(particles: Node): Unit {
    TransferContext.writeArguments(OBJECT to particles)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES3D_CONVERT_FROM_PARTICLES,
        NIL.ordinal)
  }

  public enum class EmissionShape(
    id: Long
  ) {
    /**
     * All particles will be emitted from a single point.
     */
    EMISSION_SHAPE_POINT(0),
    /**
     * Particles will be emitted in the volume of a sphere.
     */
    EMISSION_SHAPE_SPHERE(1),
    /**
     * Particles will be emitted on the surface of a sphere.
     */
    EMISSION_SHAPE_SPHERE_SURFACE(2),
    /**
     * Particles will be emitted in the volume of a box.
     */
    EMISSION_SHAPE_BOX(3),
    /**
     * Particles will be emitted at a position chosen randomly among [emissionPoints]. Particle color will be modulated by [emissionColors].
     */
    EMISSION_SHAPE_POINTS(4),
    /**
     * Particles will be emitted at a position chosen randomly among [emissionPoints]. Particle velocity and rotation will be set based on [emissionNormals]. Particle color will be modulated by [emissionColors].
     */
    EMISSION_SHAPE_DIRECTED_POINTS(5),
    /**
     * Particles will be emitted in a ring or cylinder.
     */
    EMISSION_SHAPE_RING(6),
    /**
     * Represents the size of the [enum EmissionShape] enum.
     */
    EMISSION_SHAPE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ParticleFlags(
    id: Long
  ) {
    /**
     * Use with [setParticleFlag] to set [particleFlagAlignY].
     */
    PARTICLE_FLAG_ALIGN_Y_TO_VELOCITY(0),
    /**
     * Use with [setParticleFlag] to set [particleFlagRotateY].
     */
    PARTICLE_FLAG_ROTATE_Y(1),
    /**
     * Use with [setParticleFlag] to set [particleFlagDisableZ].
     */
    PARTICLE_FLAG_DISABLE_Z(2),
    /**
     * Represents the size of the [enum ParticleFlags] enum.
     */
    PARTICLE_FLAG_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Parameter(
    id: Long
  ) {
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set initial velocity properties.
     */
    PARAM_INITIAL_LINEAR_VELOCITY(0),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set angular velocity properties.
     */
    PARAM_ANGULAR_VELOCITY(1),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set orbital velocity properties.
     */
    PARAM_ORBIT_VELOCITY(2),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set linear acceleration properties.
     */
    PARAM_LINEAR_ACCEL(3),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set radial acceleration properties.
     */
    PARAM_RADIAL_ACCEL(4),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set tangential acceleration properties.
     */
    PARAM_TANGENTIAL_ACCEL(5),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set damping properties.
     */
    PARAM_DAMPING(6),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set angle properties.
     */
    PARAM_ANGLE(7),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set scale properties.
     */
    PARAM_SCALE(8),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set hue variation properties.
     */
    PARAM_HUE_VARIATION(9),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set animation speed properties.
     */
    PARAM_ANIM_SPEED(10),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set animation offset properties.
     */
    PARAM_ANIM_OFFSET(11),
    /**
     * Represents the size of the [enum Parameter] enum.
     */
    PARAM_MAX(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DrawOrder(
    id: Long
  ) {
    /**
     * Particles are drawn in the order emitted.
     */
    DRAW_ORDER_INDEX(0),
    /**
     * Particles are drawn in order of remaining lifetime.
     */
    DRAW_ORDER_LIFETIME(1),
    /**
     * Particles are drawn in order of depth.
     */
    DRAW_ORDER_VIEW_DEPTH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
