// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.PackedVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
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
 * [$DOCS_URL/tutorials/2d/particle_systems_2d.html]($DOCS_URL/tutorials/2d/particle_systems_2d.html)
 *
 * CPU-based 2D particle node used to create a variety of particle systems and effects.
 *
 * See also [godot.GPUParticles2D], which provides the same functionality with hardware acceleration, but may not run on older devices.
 */
@GodotBaseType
public open class CPUParticles2D : Node2D() {
  /**
   * If `true`, particles are being emitted.
   */
  public var emitting: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_IS_EMITTING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EMITTING, NIL)
    }

  /**
   * Number of particles emitted in one emission cycle.
   */
  public var amount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_AMOUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_AMOUNT, NIL)
    }

  /**
   * Amount of time each particle will exist.
   */
  public var lifetime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_LIFETIME,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_LIFETIME, NIL)
    }

  /**
   * If `true`, only one emission cycle occurs. If set `true` during a cycle, emission will stop at the cycle's end.
   */
  public var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_ONE_SHOT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_ONE_SHOT, NIL)
    }

  /**
   * Particle system starts as if it had already run for this many seconds.
   */
  public var preprocess: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_PRE_PROCESS_TIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_PRE_PROCESS_TIME, NIL)
    }

  /**
   * Particle system's running speed scaling ratio. A value of `0` can be used to pause the particles.
   */
  public var speedScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_SPEED_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_SPEED_SCALE,
          NIL)
    }

  /**
   * How rapidly particles in an emission cycle are emitted. If greater than `0`, there will be a gap in emissions before the next cycle begins.
   */
  public var explosiveness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EXPLOSIVENESS_RATIO, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EXPLOSIVENESS_RATIO, NIL)
    }

  /**
   * Emission lifetime randomness ratio.
   */
  public var randomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_RANDOMNESS_RATIO, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_RANDOMNESS_RATIO, NIL)
    }

  /**
   * Particle lifetime randomness ratio.
   */
  public var lifetimeRandomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_LIFETIME_RANDOMNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_LIFETIME_RANDOMNESS, NIL)
    }

  /**
   * The particle system's frame rate is fixed to a value. For example, changing the value to 2 will make the particles render at 2 frames per second. Note this does not slow down the simulation of the particle system itself.
   */
  public var fixedFps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_FIXED_FPS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_FIXED_FPS, NIL)
    }

  /**
   * If `true`, results in fractional delta calculation which has a smoother particles display effect.
   */
  public var fractDelta: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_FRACTIONAL_DELTA, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_FRACTIONAL_DELTA, NIL)
    }

  /**
   * If `true`, particles use the parent node's coordinate space (known as local coordinates). This will cause particles to move and rotate along the [godot.CPUParticles2D] node (and its parents) when it is moved or rotated. If `false`, particles use global coordinates; they will not move or rotate along the [godot.CPUParticles2D] node (and its parents) when it is moved or rotated.
   */
  public var localCoords: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_USE_LOCAL_COORDINATES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_USE_LOCAL_COORDINATES, NIL)
    }

  /**
   * Particle draw order. Uses [enum DrawOrder] values.
   */
  public var drawOrder: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_DRAW_ORDER,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_DRAW_ORDER,
          NIL)
    }

  /**
   * Particle texture. If `null`, particles will be squares.
   */
  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_TEXTURE, NIL)
    }

  /**
   * Particles will be emitted inside this region. See [enum EmissionShape] for possible values.
   */
  public var emissionShape: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EMISSION_SHAPE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EMISSION_SHAPE,
          NIL)
    }

  /**
   * The sphere's radius if [emissionShape] is set to [EMISSION_SHAPE_SPHERE].
   */
  public var emissionSphereRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EMISSION_SPHERE_RADIUS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EMISSION_SPHERE_RADIUS, NIL)
    }

  /**
   * The rectangle's extents if [emissionShape] is set to [EMISSION_SHAPE_RECTANGLE].
   */
  public var emissionRectExtents: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EMISSION_RECT_EXTENTS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EMISSION_RECT_EXTENTS, NIL)
    }

  /**
   * Sets the initial positions to spawn particles when using [EMISSION_SHAPE_POINTS] or [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public var emissionPoints: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EMISSION_POINTS, PACKED_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EMISSION_POINTS, NIL)
    }

  /**
   * Sets the direction the particles will be emitted in when using [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public var emissionNormals: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EMISSION_NORMALS, PACKED_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EMISSION_NORMALS, NIL)
    }

  /**
   * Sets the [godot.core.Color]s to modulate particles by when using [EMISSION_SHAPE_POINTS] or [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public var emissionColors: PackedColorArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_EMISSION_COLORS, PACKED_COLOR_ARRAY)
      return TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_COLOR_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_EMISSION_COLORS, NIL)
    }

  /**
   * Unit vector specifying the particles' emission direction.
   */
  public var direction: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_DIRECTION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_DIRECTION, NIL)
    }

  /**
   * Each particle's initial direction range from `+spread` to `-spread` degrees.
   */
  public var spread: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_SPREAD, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_SPREAD, NIL)
    }

  /**
   * Gravity applied to every particle.
   */
  public var gravity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_GRAVITY,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_GRAVITY, NIL)
    }

  /**
   * If `true`, the scale curve will be split into x and y components. See [scaleCurveX] and [scaleCurveY].
   */
  public var splitScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_SPLIT_SCALE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_SPLIT_SCALE,
          NIL)
    }

  /**
   * Each particle's horizontal scale will vary along this [godot.Curve].
   *
   * [splitScale] must be enabled.
   */
  public var scaleCurveX: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_SCALE_CURVE_X,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_SCALE_CURVE_X,
          NIL)
    }

  /**
   * Each particle's vertical scale will vary along this [godot.Curve].
   *
   * [splitScale] must be enabled.
   */
  public var scaleCurveY: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_SCALE_CURVE_Y,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_SCALE_CURVE_Y,
          NIL)
    }

  /**
   * Each particle's initial color. If [texture] is defined, it will be multiplied by this color.
   */
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_COLOR, NIL)
    }

  /**
   * Each particle's color will vary along this [godot.Gradient] (multiplied with [color]).
   */
  public var colorRamp: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_COLOR_RAMP,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Gradient?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_COLOR_RAMP,
          NIL)
    }

  /**
   * Each particle's initial color will vary along this [godot.GradientTexture1D] (multiplied with [color]).
   */
  public var colorInitialRamp: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_COLOR_INITIAL_RAMP, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Gradient?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_COLOR_INITIAL_RAMP, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CPUPARTICLES2D)
  }

  /**
   * Restarts the particle emitter.
   */
  public fun restart(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_RESTART, NIL)
  }

  /**
   * Sets the minimum value for the given parameter.
   */
  public fun setParamMin(`param`: CPUParticles2D.Parameter, `value`: Double): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_PARAM_MIN, NIL)
  }

  /**
   * Returns the minimum value range for the given parameter.
   */
  public fun getParamMin(`param`: CPUParticles2D.Parameter): Double {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_PARAM_MIN,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the maximum value for the given parameter.
   */
  public fun setParamMax(`param`: CPUParticles2D.Parameter, `value`: Double): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_PARAM_MAX, NIL)
  }

  /**
   * Returns the maximum value range for the given parameter.
   */
  public fun getParamMax(`param`: CPUParticles2D.Parameter): Double {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_PARAM_MAX,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the [godot.Curve] of the parameter specified by [enum Parameter].
   */
  public fun setParamCurve(`param`: CPUParticles2D.Parameter, curve: Curve): Unit {
    TransferContext.writeArguments(LONG to param.id, OBJECT to curve)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_PARAM_CURVE, NIL)
  }

  /**
   * Returns the [godot.Curve] of the parameter specified by [enum Parameter].
   */
  public fun getParamCurve(`param`: CPUParticles2D.Parameter): Curve? {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_PARAM_CURVE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Curve?
  }

  /**
   * Enables or disables the given flag (see [enum ParticleFlags] for options).
   */
  public fun setParticleFlag(particleFlag: CPUParticles2D.ParticleFlags, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to particleFlag.id, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_SET_PARTICLE_FLAG,
        NIL)
  }

  /**
   * Returns the enabled state of the given flag (see [enum ParticleFlags] for options).
   */
  public fun getParticleFlag(particleFlag: CPUParticles2D.ParticleFlags): Boolean {
    TransferContext.writeArguments(LONG to particleFlag.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_GET_PARTICLE_FLAG,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets this node's properties to match a given [godot.GPUParticles2D] node with an assigned [godot.ParticleProcessMaterial].
   */
  public fun convertFromParticles(particles: Node): Unit {
    TransferContext.writeArguments(OBJECT to particles)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CPUPARTICLES2D_CONVERT_FROM_PARTICLES, NIL)
  }

  public enum class EmissionShape(
    id: Long
  ) {
    /**
     * All particles will be emitted from a single point.
     */
    EMISSION_SHAPE_POINT(0),
    /**
     * Particles will be emitted in the volume of a sphere flattened to two dimensions.
     */
    EMISSION_SHAPE_SPHERE(1),
    /**
     * Particles will be emitted on the surface of a sphere flattened to two dimensions.
     */
    EMISSION_SHAPE_SPHERE_SURFACE(2),
    /**
     * Particles will be emitted in the area of a rectangle.
     */
    EMISSION_SHAPE_RECTANGLE(3),
    /**
     * Particles will be emitted at a position chosen randomly among [emissionPoints]. Particle color will be modulated by [emissionColors].
     */
    EMISSION_SHAPE_POINTS(4),
    /**
     * Particles will be emitted at a position chosen randomly among [emissionPoints]. Particle velocity and rotation will be set based on [emissionNormals]. Particle color will be modulated by [emissionColors].
     */
    EMISSION_SHAPE_DIRECTED_POINTS(5),
    /**
     * Represents the size of the [enum EmissionShape] enum.
     */
    EMISSION_SHAPE_MAX(6),
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
     * Present for consistency with 3D particle nodes, not used in 2D.
     */
    PARTICLE_FLAG_ROTATE_Y(1),
    /**
     * Present for consistency with 3D particle nodes, not used in 2D.
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
