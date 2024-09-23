// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.PackedVector2Array
import godot.core.Signal0
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_COLOR_ARRAY
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.core.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * CPU-based 2D particle node used to create a variety of particle systems and effects.
 * See also [GPUParticles2D], which provides the same functionality with hardware acceleration, but
 * may not run on older devices.
 */
@GodotBaseType
public open class CPUParticles2D : Node2D() {
  /**
   * Emitted when all active particles have finished processing. When [oneShot] is disabled,
   * particles will process continuously, so this is never emitted.
   */
  public val finished: Signal0 by signal()

  /**
   * If `true`, particles are being emitted. [emitting] can be used to start and stop particles from
   * emitting. However, if [oneShot] is `true` setting [emitting] to `true` will not restart the
   * emission cycle until after all active particles finish processing. You can use the [signal
   * finished] signal to be notified once all active particles finish processing.
   */
  public final inline var emitting: Boolean
    @JvmName("emittingProperty")
    get() = isEmitting()
    @JvmName("emittingProperty")
    set(`value`) {
      setEmitting(value)
    }

  /**
   * Number of particles emitted in one emission cycle.
   */
  public final inline var amount: Int
    @JvmName("amountProperty")
    get() = getAmount()
    @JvmName("amountProperty")
    set(`value`) {
      setAmount(value)
    }

  /**
   * Amount of time each particle will exist.
   */
  public final inline var lifetime: Double
    @JvmName("lifetimeProperty")
    get() = getLifetime()
    @JvmName("lifetimeProperty")
    set(`value`) {
      setLifetime(value)
    }

  /**
   * If `true`, only one emission cycle occurs. If set `true` during a cycle, emission will stop at
   * the cycle's end.
   */
  public final inline var oneShot: Boolean
    @JvmName("oneShotProperty")
    get() = getOneShot()
    @JvmName("oneShotProperty")
    set(`value`) {
      setOneShot(value)
    }

  /**
   * Particle system starts as if it had already run for this many seconds.
   */
  public final inline var preprocess: Double
    @JvmName("preprocessProperty")
    get() = getPreProcessTime()
    @JvmName("preprocessProperty")
    set(`value`) {
      setPreProcessTime(value)
    }

  /**
   * Particle system's running speed scaling ratio. A value of `0` can be used to pause the
   * particles.
   */
  public final inline var speedScale: Double
    @JvmName("speedScaleProperty")
    get() = getSpeedScale()
    @JvmName("speedScaleProperty")
    set(`value`) {
      setSpeedScale(value)
    }

  /**
   * How rapidly particles in an emission cycle are emitted. If greater than `0`, there will be a
   * gap in emissions before the next cycle begins.
   */
  public final inline var explosiveness: Float
    @JvmName("explosivenessProperty")
    get() = getExplosivenessRatio()
    @JvmName("explosivenessProperty")
    set(`value`) {
      setExplosivenessRatio(value)
    }

  /**
   * Emission lifetime randomness ratio.
   */
  public final inline var randomness: Float
    @JvmName("randomnessProperty")
    get() = getRandomnessRatio()
    @JvmName("randomnessProperty")
    set(`value`) {
      setRandomnessRatio(value)
    }

  /**
   * Particle lifetime randomness ratio.
   */
  public final inline var lifetimeRandomness: Double
    @JvmName("lifetimeRandomnessProperty")
    get() = getLifetimeRandomness()
    @JvmName("lifetimeRandomnessProperty")
    set(`value`) {
      setLifetimeRandomness(value)
    }

  /**
   * The particle system's frame rate is fixed to a value. For example, changing the value to 2 will
   * make the particles render at 2 frames per second. Note this does not slow down the simulation of
   * the particle system itself.
   */
  public final inline var fixedFps: Int
    @JvmName("fixedFpsProperty")
    get() = getFixedFps()
    @JvmName("fixedFpsProperty")
    set(`value`) {
      setFixedFps(value)
    }

  /**
   * If `true`, results in fractional delta calculation which has a smoother particles display
   * effect.
   */
  public final inline var fractDelta: Boolean
    @JvmName("fractDeltaProperty")
    get() = getFractionalDelta()
    @JvmName("fractDeltaProperty")
    set(`value`) {
      setFractionalDelta(value)
    }

  /**
   * If `true`, particles use the parent node's coordinate space (known as local coordinates). This
   * will cause particles to move and rotate along the [CPUParticles2D] node (and its parents) when it
   * is moved or rotated. If `false`, particles use global coordinates; they will not move or rotate
   * along the [CPUParticles2D] node (and its parents) when it is moved or rotated.
   */
  public final inline var localCoords: Boolean
    @JvmName("localCoordsProperty")
    get() = getUseLocalCoordinates()
    @JvmName("localCoordsProperty")
    set(`value`) {
      setUseLocalCoordinates(value)
    }

  /**
   * Particle draw order. Uses [DrawOrder] values.
   */
  public final inline var drawOrder: DrawOrder
    @JvmName("drawOrderProperty")
    get() = getDrawOrder()
    @JvmName("drawOrderProperty")
    set(`value`) {
      setDrawOrder(value)
    }

  /**
   * Particle texture. If `null`, particles will be squares.
   */
  public final inline var texture: Texture2D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  /**
   * Particles will be emitted inside this region. See [EmissionShape] for possible values.
   */
  public final inline var emissionShape: EmissionShape
    @JvmName("emissionShapeProperty")
    get() = getEmissionShape()
    @JvmName("emissionShapeProperty")
    set(`value`) {
      setEmissionShape(value)
    }

  /**
   * The sphere's radius if [emissionShape] is set to [EMISSION_SHAPE_SPHERE].
   */
  public final inline var emissionSphereRadius: Float
    @JvmName("emissionSphereRadiusProperty")
    get() = getEmissionSphereRadius()
    @JvmName("emissionSphereRadiusProperty")
    set(`value`) {
      setEmissionSphereRadius(value)
    }

  /**
   * The rectangle's extents if [emissionShape] is set to [EMISSION_SHAPE_RECTANGLE].
   */
  @CoreTypeLocalCopy
  public final inline var emissionRectExtents: Vector2
    @JvmName("emissionRectExtentsProperty")
    get() = getEmissionRectExtents()
    @JvmName("emissionRectExtentsProperty")
    set(`value`) {
      setEmissionRectExtents(value)
    }

  /**
   * Sets the initial positions to spawn particles when using [EMISSION_SHAPE_POINTS] or
   * [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public final inline var emissionPoints: PackedVector2Array
    @JvmName("emissionPointsProperty")
    get() = getEmissionPoints()
    @JvmName("emissionPointsProperty")
    set(`value`) {
      setEmissionPoints(value)
    }

  /**
   * Sets the direction the particles will be emitted in when using
   * [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public final inline var emissionNormals: PackedVector2Array
    @JvmName("emissionNormalsProperty")
    get() = getEmissionNormals()
    @JvmName("emissionNormalsProperty")
    set(`value`) {
      setEmissionNormals(value)
    }

  /**
   * Sets the [Color]s to modulate particles by when using [EMISSION_SHAPE_POINTS] or
   * [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public final inline var emissionColors: PackedColorArray
    @JvmName("emissionColorsProperty")
    get() = getEmissionColors()
    @JvmName("emissionColorsProperty")
    set(`value`) {
      setEmissionColors(value)
    }

  /**
   * Align Y axis of particle with the direction of its velocity.
   */
  public final inline var particleFlagAlignY: Boolean
    @JvmName("particleFlagAlignYProperty")
    get() = getParticleFlag(CPUParticles2D.ParticleFlags.PARTICLE_FLAG_ALIGN_Y_TO_VELOCITY)
    @JvmName("particleFlagAlignYProperty")
    set(`value`) {
      setParticleFlag(CPUParticles2D.ParticleFlags.PARTICLE_FLAG_ALIGN_Y_TO_VELOCITY, value)
    }

  /**
   * Unit vector specifying the particles' emission direction.
   */
  @CoreTypeLocalCopy
  public final inline var direction: Vector2
    @JvmName("directionProperty")
    get() = getDirection()
    @JvmName("directionProperty")
    set(`value`) {
      setDirection(value)
    }

  /**
   * Each particle's initial direction range from `+spread` to `-spread` degrees.
   */
  public final inline var spread: Float
    @JvmName("spreadProperty")
    get() = getSpread()
    @JvmName("spreadProperty")
    set(`value`) {
      setSpread(value)
    }

  /**
   * Gravity applied to every particle.
   */
  @CoreTypeLocalCopy
  public final inline var gravity: Vector2
    @JvmName("gravityProperty")
    get() = getGravity()
    @JvmName("gravityProperty")
    set(`value`) {
      setGravity(value)
    }

  /**
   * Minimum equivalent of [initialVelocityMax].
   */
  public final inline var initialVelocityMin: Float
    @JvmName("initialVelocityMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.PARAM_INITIAL_LINEAR_VELOCITY)
    @JvmName("initialVelocityMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.PARAM_INITIAL_LINEAR_VELOCITY, value)
    }

  /**
   * Maximum initial velocity magnitude for each particle. Direction comes from [direction] and
   * [spread].
   */
  public final inline var initialVelocityMax: Float
    @JvmName("initialVelocityMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.PARAM_INITIAL_LINEAR_VELOCITY)
    @JvmName("initialVelocityMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.PARAM_INITIAL_LINEAR_VELOCITY, value)
    }

  /**
   * Minimum equivalent of [angularVelocityMax].
   */
  public final inline var angularVelocityMin: Float
    @JvmName("angularVelocityMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.PARAM_ANGULAR_VELOCITY)
    @JvmName("angularVelocityMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.PARAM_ANGULAR_VELOCITY, value)
    }

  /**
   * Maximum initial angular velocity (rotation speed) applied to each particle in *degrees* per
   * second.
   */
  public final inline var angularVelocityMax: Float
    @JvmName("angularVelocityMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.PARAM_ANGULAR_VELOCITY)
    @JvmName("angularVelocityMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.PARAM_ANGULAR_VELOCITY, value)
    }

  /**
   * Each particle's angular velocity will vary along this [Curve].
   */
  public final inline var angularVelocityCurve: Curve?
    @JvmName("angularVelocityCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.PARAM_ANGULAR_VELOCITY)
    @JvmName("angularVelocityCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.PARAM_ANGULAR_VELOCITY, value)
    }

  /**
   * Minimum equivalent of [orbitVelocityMax].
   */
  public final inline var orbitVelocityMin: Float
    @JvmName("orbitVelocityMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.PARAM_ORBIT_VELOCITY)
    @JvmName("orbitVelocityMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.PARAM_ORBIT_VELOCITY, value)
    }

  /**
   * Maximum orbital velocity applied to each particle. Makes the particles circle around origin.
   * Specified in number of full rotations around origin per second.
   */
  public final inline var orbitVelocityMax: Float
    @JvmName("orbitVelocityMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.PARAM_ORBIT_VELOCITY)
    @JvmName("orbitVelocityMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.PARAM_ORBIT_VELOCITY, value)
    }

  /**
   * Each particle's orbital velocity will vary along this [Curve].
   */
  public final inline var orbitVelocityCurve: Curve?
    @JvmName("orbitVelocityCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.PARAM_ORBIT_VELOCITY)
    @JvmName("orbitVelocityCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.PARAM_ORBIT_VELOCITY, value)
    }

  /**
   * Minimum equivalent of [linearAccelMax].
   */
  public final inline var linearAccelMin: Float
    @JvmName("linearAccelMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.PARAM_LINEAR_ACCEL)
    @JvmName("linearAccelMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.PARAM_LINEAR_ACCEL, value)
    }

  /**
   * Maximum linear acceleration applied to each particle in the direction of motion.
   */
  public final inline var linearAccelMax: Float
    @JvmName("linearAccelMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.PARAM_LINEAR_ACCEL)
    @JvmName("linearAccelMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.PARAM_LINEAR_ACCEL, value)
    }

  /**
   * Each particle's linear acceleration will vary along this [Curve].
   */
  public final inline var linearAccelCurve: Curve?
    @JvmName("linearAccelCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.PARAM_LINEAR_ACCEL)
    @JvmName("linearAccelCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.PARAM_LINEAR_ACCEL, value)
    }

  /**
   * Minimum equivalent of [radialAccelMax].
   */
  public final inline var radialAccelMin: Float
    @JvmName("radialAccelMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.PARAM_RADIAL_ACCEL)
    @JvmName("radialAccelMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.PARAM_RADIAL_ACCEL, value)
    }

  /**
   * Maximum radial acceleration applied to each particle. Makes particle accelerate away from the
   * origin or towards it if negative.
   */
  public final inline var radialAccelMax: Float
    @JvmName("radialAccelMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.PARAM_RADIAL_ACCEL)
    @JvmName("radialAccelMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.PARAM_RADIAL_ACCEL, value)
    }

  /**
   * Each particle's radial acceleration will vary along this [Curve].
   */
  public final inline var radialAccelCurve: Curve?
    @JvmName("radialAccelCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.PARAM_RADIAL_ACCEL)
    @JvmName("radialAccelCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.PARAM_RADIAL_ACCEL, value)
    }

  /**
   * Minimum equivalent of [tangentialAccelMax].
   */
  public final inline var tangentialAccelMin: Float
    @JvmName("tangentialAccelMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.PARAM_TANGENTIAL_ACCEL)
    @JvmName("tangentialAccelMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.PARAM_TANGENTIAL_ACCEL, value)
    }

  /**
   * Maximum tangential acceleration applied to each particle. Tangential acceleration is
   * perpendicular to the particle's velocity giving the particles a swirling motion.
   */
  public final inline var tangentialAccelMax: Float
    @JvmName("tangentialAccelMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.PARAM_TANGENTIAL_ACCEL)
    @JvmName("tangentialAccelMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.PARAM_TANGENTIAL_ACCEL, value)
    }

  /**
   * Each particle's tangential acceleration will vary along this [Curve].
   */
  public final inline var tangentialAccelCurve: Curve?
    @JvmName("tangentialAccelCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.PARAM_TANGENTIAL_ACCEL)
    @JvmName("tangentialAccelCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.PARAM_TANGENTIAL_ACCEL, value)
    }

  /**
   * Minimum equivalent of [dampingMax].
   */
  public final inline var dampingMin: Float
    @JvmName("dampingMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.PARAM_DAMPING)
    @JvmName("dampingMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.PARAM_DAMPING, value)
    }

  /**
   * The maximum rate at which particles lose velocity. For example value of `100` means that the
   * particle will go from `100` velocity to `0` in `1` second.
   */
  public final inline var dampingMax: Float
    @JvmName("dampingMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.PARAM_DAMPING)
    @JvmName("dampingMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.PARAM_DAMPING, value)
    }

  /**
   * Damping will vary along this [Curve].
   */
  public final inline var dampingCurve: Curve?
    @JvmName("dampingCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.PARAM_DAMPING)
    @JvmName("dampingCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.PARAM_DAMPING, value)
    }

  /**
   * Minimum equivalent of [angleMax].
   */
  public final inline var angleMin: Float
    @JvmName("angleMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.PARAM_ANGLE)
    @JvmName("angleMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.PARAM_ANGLE, value)
    }

  /**
   * Maximum initial rotation applied to each particle, in degrees.
   */
  public final inline var angleMax: Float
    @JvmName("angleMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.PARAM_ANGLE)
    @JvmName("angleMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.PARAM_ANGLE, value)
    }

  /**
   * Each particle's rotation will be animated along this [Curve].
   */
  public final inline var angleCurve: Curve?
    @JvmName("angleCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.PARAM_ANGLE)
    @JvmName("angleCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.PARAM_ANGLE, value)
    }

  /**
   * Minimum equivalent of [scaleAmountMax].
   */
  public final inline var scaleAmountMin: Float
    @JvmName("scaleAmountMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.PARAM_SCALE)
    @JvmName("scaleAmountMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.PARAM_SCALE, value)
    }

  /**
   * Maximum initial scale applied to each particle.
   */
  public final inline var scaleAmountMax: Float
    @JvmName("scaleAmountMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.PARAM_SCALE)
    @JvmName("scaleAmountMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.PARAM_SCALE, value)
    }

  /**
   * Each particle's scale will vary along this [Curve].
   */
  public final inline var scaleAmountCurve: Curve?
    @JvmName("scaleAmountCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.PARAM_SCALE)
    @JvmName("scaleAmountCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.PARAM_SCALE, value)
    }

  /**
   * If `true`, the scale curve will be split into x and y components. See [scaleCurveX] and
   * [scaleCurveY].
   */
  public final inline var splitScale: Boolean
    @JvmName("splitScaleProperty")
    get() = getSplitScale()
    @JvmName("splitScaleProperty")
    set(`value`) {
      setSplitScale(value)
    }

  /**
   * Each particle's horizontal scale will vary along this [Curve].
   * [splitScale] must be enabled.
   */
  public final inline var scaleCurveX: Curve?
    @JvmName("scaleCurveXProperty")
    get() = getScaleCurveX()
    @JvmName("scaleCurveXProperty")
    set(`value`) {
      setScaleCurveX(value)
    }

  /**
   * Each particle's vertical scale will vary along this [Curve].
   * [splitScale] must be enabled.
   */
  public final inline var scaleCurveY: Curve?
    @JvmName("scaleCurveYProperty")
    get() = getScaleCurveY()
    @JvmName("scaleCurveYProperty")
    set(`value`) {
      setScaleCurveY(value)
    }

  /**
   * Each particle's initial color. If [texture] is defined, it will be multiplied by this color.
   */
  @CoreTypeLocalCopy
  public final inline var color: Color
    @JvmName("colorProperty")
    get() = getColor()
    @JvmName("colorProperty")
    set(`value`) {
      setColor(value)
    }

  /**
   * Each particle's color will vary along this [Gradient] (multiplied with [color]).
   */
  public final inline var colorRamp: Gradient?
    @JvmName("colorRampProperty")
    get() = getColorRamp()
    @JvmName("colorRampProperty")
    set(`value`) {
      setColorRamp(value)
    }

  /**
   * Each particle's initial color will vary along this [GradientTexture1D] (multiplied with
   * [color]).
   */
  public final inline var colorInitialRamp: Gradient?
    @JvmName("colorInitialRampProperty")
    get() = getColorInitialRamp()
    @JvmName("colorInitialRampProperty")
    set(`value`) {
      setColorInitialRamp(value)
    }

  /**
   * Minimum equivalent of [hueVariationMax].
   */
  public final inline var hueVariationMin: Float
    @JvmName("hueVariationMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.PARAM_HUE_VARIATION)
    @JvmName("hueVariationMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.PARAM_HUE_VARIATION, value)
    }

  /**
   * Maximum initial hue variation applied to each particle. It will shift the particle color's hue.
   */
  public final inline var hueVariationMax: Float
    @JvmName("hueVariationMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.PARAM_HUE_VARIATION)
    @JvmName("hueVariationMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.PARAM_HUE_VARIATION, value)
    }

  /**
   * Each particle's hue will vary along this [Curve].
   */
  public final inline var hueVariationCurve: Curve?
    @JvmName("hueVariationCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.PARAM_HUE_VARIATION)
    @JvmName("hueVariationCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.PARAM_HUE_VARIATION, value)
    }

  /**
   * Minimum equivalent of [animSpeedMax].
   */
  public final inline var animSpeedMin: Float
    @JvmName("animSpeedMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.PARAM_ANIM_SPEED)
    @JvmName("animSpeedMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.PARAM_ANIM_SPEED, value)
    }

  /**
   * Maximum particle animation speed. Animation speed of `1` means that the particles will make
   * full `0` to `1` offset cycle during lifetime, `2` means `2` cycles etc.
   * With animation speed greater than `1`, remember to enable
   * [CanvasItemMaterial.particlesAnimLoop] property if you want the animation to repeat.
   */
  public final inline var animSpeedMax: Float
    @JvmName("animSpeedMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.PARAM_ANIM_SPEED)
    @JvmName("animSpeedMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.PARAM_ANIM_SPEED, value)
    }

  /**
   * Each particle's animation speed will vary along this [Curve].
   */
  public final inline var animSpeedCurve: Curve?
    @JvmName("animSpeedCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.PARAM_ANIM_SPEED)
    @JvmName("animSpeedCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.PARAM_ANIM_SPEED, value)
    }

  /**
   * Minimum equivalent of [animOffsetMax].
   */
  public final inline var animOffsetMin: Float
    @JvmName("animOffsetMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.PARAM_ANIM_OFFSET)
    @JvmName("animOffsetMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.PARAM_ANIM_OFFSET, value)
    }

  /**
   * Maximum animation offset that corresponds to frame index in the texture. `0` is the first
   * frame, `1` is the last one. See [CanvasItemMaterial.particlesAnimation].
   */
  public final inline var animOffsetMax: Float
    @JvmName("animOffsetMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.PARAM_ANIM_OFFSET)
    @JvmName("animOffsetMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.PARAM_ANIM_OFFSET, value)
    }

  /**
   * Each particle's animation offset will vary along this [Curve].
   */
  public final inline var animOffsetCurve: Curve?
    @JvmName("animOffsetCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.PARAM_ANIM_OFFSET)
    @JvmName("animOffsetCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.PARAM_ANIM_OFFSET, value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CPUPARTICLES2D, scriptIndex)
  }

  /**
   * The rectangle's extents if [emissionShape] is set to [EMISSION_SHAPE_RECTANGLE].
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = cpuparticles2d.emissionRectExtents
   * //Your changes
   * cpuparticles2d.emissionRectExtents = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun emissionRectExtentsMutate(block: Vector2.() -> Unit): Vector2 =
      emissionRectExtents.apply{
      block(this)
      emissionRectExtents = this
  }


  /**
   * Unit vector specifying the particles' emission direction.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = cpuparticles2d.direction
   * //Your changes
   * cpuparticles2d.direction = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun directionMutate(block: Vector2.() -> Unit): Vector2 = direction.apply{
      block(this)
      direction = this
  }


  /**
   * Gravity applied to every particle.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = cpuparticles2d.gravity
   * //Your changes
   * cpuparticles2d.gravity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun gravityMutate(block: Vector2.() -> Unit): Vector2 = gravity.apply{
      block(this)
      gravity = this
  }


  /**
   * Each particle's initial color. If [texture] is defined, it will be multiplied by this color.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = cpuparticles2d.color
   * //Your changes
   * cpuparticles2d.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  public final fun setEmitting(emitting: Boolean): Unit {
    TransferContext.writeArguments(BOOL to emitting)
    TransferContext.callMethod(rawPtr, MethodBindings.setEmittingPtr, NIL)
  }

  public final fun setAmount(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setAmountPtr, NIL)
  }

  public final fun setLifetime(secs: Double): Unit {
    TransferContext.writeArguments(DOUBLE to secs)
    TransferContext.callMethod(rawPtr, MethodBindings.setLifetimePtr, NIL)
  }

  public final fun setOneShot(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setOneShotPtr, NIL)
  }

  public final fun setPreProcessTime(secs: Double): Unit {
    TransferContext.writeArguments(DOUBLE to secs)
    TransferContext.callMethod(rawPtr, MethodBindings.setPreProcessTimePtr, NIL)
  }

  public final fun setExplosivenessRatio(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setExplosivenessRatioPtr, NIL)
  }

  public final fun setRandomnessRatio(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setRandomnessRatioPtr, NIL)
  }

  public final fun setLifetimeRandomness(random: Double): Unit {
    TransferContext.writeArguments(DOUBLE to random)
    TransferContext.callMethod(rawPtr, MethodBindings.setLifetimeRandomnessPtr, NIL)
  }

  public final fun setUseLocalCoordinates(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseLocalCoordinatesPtr, NIL)
  }

  public final fun setFixedFps(fps: Int): Unit {
    TransferContext.writeArguments(LONG to fps.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setFixedFpsPtr, NIL)
  }

  public final fun setFractionalDelta(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setFractionalDeltaPtr, NIL)
  }

  public final fun setSpeedScale(scale: Double): Unit {
    TransferContext.writeArguments(DOUBLE to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.setSpeedScalePtr, NIL)
  }

  public final fun isEmitting(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEmittingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getAmount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAmountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getLifetime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLifetimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getOneShot(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOneShotPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getPreProcessTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPreProcessTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getExplosivenessRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getExplosivenessRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getRandomnessRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRandomnessRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getLifetimeRandomness(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLifetimeRandomnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getUseLocalCoordinates(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUseLocalCoordinatesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getFixedFps(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFixedFpsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getFractionalDelta(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFractionalDeltaPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getSpeedScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpeedScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setDrawOrder(order: DrawOrder): Unit {
    TransferContext.writeArguments(LONG to order.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setDrawOrderPtr, NIL)
  }

  public final fun getDrawOrder(): DrawOrder {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDrawOrderPtr, LONG)
    return CPUParticles2D.DrawOrder.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Restarts the particle emitter.
   */
  public final fun restart(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.restartPtr, NIL)
  }

  public final fun setDirection(direction: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to direction)
    TransferContext.callMethod(rawPtr, MethodBindings.setDirectionPtr, NIL)
  }

  public final fun getDirection(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDirectionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setSpread(spread: Float): Unit {
    TransferContext.writeArguments(DOUBLE to spread.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setSpreadPtr, NIL)
  }

  public final fun getSpread(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpreadPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the minimum value for the given parameter.
   */
  public final fun setParamMin(`param`: Parameter, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
  }

  /**
   * Returns the minimum value range for the given parameter.
   */
  public final fun getParamMin(`param`: Parameter): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the maximum value for the given parameter.
   */
  public final fun setParamMax(`param`: Parameter, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
  }

  /**
   * Returns the maximum value range for the given parameter.
   */
  public final fun getParamMax(`param`: Parameter): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the [Curve] of the parameter specified by [Parameter].
   */
  public final fun setParamCurve(`param`: Parameter, curve: Curve?): Unit {
    TransferContext.writeArguments(LONG to param.id, OBJECT to curve)
    TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
  }

  /**
   * Returns the [Curve] of the parameter specified by [Parameter].
   */
  public final fun getParamCurve(`param`: Parameter): Curve? {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
  }

  public final fun getColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setColorRamp(ramp: Gradient?): Unit {
    TransferContext.writeArguments(OBJECT to ramp)
    TransferContext.callMethod(rawPtr, MethodBindings.setColorRampPtr, NIL)
  }

  public final fun getColorRamp(): Gradient? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColorRampPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Gradient?)
  }

  public final fun setColorInitialRamp(ramp: Gradient?): Unit {
    TransferContext.writeArguments(OBJECT to ramp)
    TransferContext.callMethod(rawPtr, MethodBindings.setColorInitialRampPtr, NIL)
  }

  public final fun getColorInitialRamp(): Gradient? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColorInitialRampPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Gradient?)
  }

  /**
   * Enables or disables the given flag (see [ParticleFlags] for options).
   */
  public final fun setParticleFlag(particleFlag: ParticleFlags, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to particleFlag.id, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setParticleFlagPtr, NIL)
  }

  /**
   * Returns the enabled state of the given flag (see [ParticleFlags] for options).
   */
  public final fun getParticleFlag(particleFlag: ParticleFlags): Boolean {
    TransferContext.writeArguments(LONG to particleFlag.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getParticleFlagPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEmissionShape(shape: EmissionShape): Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setEmissionShapePtr, NIL)
  }

  public final fun getEmissionShape(): EmissionShape {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEmissionShapePtr, LONG)
    return CPUParticles2D.EmissionShape.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setEmissionSphereRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setEmissionSphereRadiusPtr, NIL)
  }

  public final fun getEmissionSphereRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEmissionSphereRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmissionRectExtents(extents: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to extents)
    TransferContext.callMethod(rawPtr, MethodBindings.setEmissionRectExtentsPtr, NIL)
  }

  public final fun getEmissionRectExtents(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEmissionRectExtentsPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setEmissionPoints(array: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to array)
    TransferContext.callMethod(rawPtr, MethodBindings.setEmissionPointsPtr, NIL)
  }

  public final fun getEmissionPoints(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEmissionPointsPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun setEmissionNormals(array: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to array)
    TransferContext.callMethod(rawPtr, MethodBindings.setEmissionNormalsPtr, NIL)
  }

  public final fun getEmissionNormals(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEmissionNormalsPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun setEmissionColors(array: PackedColorArray): Unit {
    TransferContext.writeArguments(PACKED_COLOR_ARRAY to array)
    TransferContext.callMethod(rawPtr, MethodBindings.setEmissionColorsPtr, NIL)
  }

  public final fun getEmissionColors(): PackedColorArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEmissionColorsPtr, PACKED_COLOR_ARRAY)
    return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY) as PackedColorArray)
  }

  public final fun getGravity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGravityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setGravity(accelVec: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to accelVec)
    TransferContext.callMethod(rawPtr, MethodBindings.setGravityPtr, NIL)
  }

  public final fun getSplitScale(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSplitScalePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSplitScale(splitScale: Boolean): Unit {
    TransferContext.writeArguments(BOOL to splitScale)
    TransferContext.callMethod(rawPtr, MethodBindings.setSplitScalePtr, NIL)
  }

  public final fun getScaleCurveX(): Curve? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScaleCurveXPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setScaleCurveX(scaleCurve: Curve?): Unit {
    TransferContext.writeArguments(OBJECT to scaleCurve)
    TransferContext.callMethod(rawPtr, MethodBindings.setScaleCurveXPtr, NIL)
  }

  public final fun getScaleCurveY(): Curve? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScaleCurveYPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setScaleCurveY(scaleCurve: Curve?): Unit {
    TransferContext.writeArguments(OBJECT to scaleCurve)
    TransferContext.callMethod(rawPtr, MethodBindings.setScaleCurveYPtr, NIL)
  }

  /**
   * Sets this node's properties to match a given [GPUParticles2D] node with an assigned
   * [ParticleProcessMaterial].
   */
  public final fun convertFromParticles(particles: Node?): Unit {
    TransferContext.writeArguments(OBJECT to particles)
    TransferContext.callMethod(rawPtr, MethodBindings.convertFromParticlesPtr, NIL)
  }

  public enum class DrawOrder(
    id: Long,
  ) {
    /**
     * Particles are drawn in the order emitted.
     */
    DRAW_ORDER_INDEX(0),
    /**
     * Particles are drawn in order of remaining lifetime. In other words, the particle with the
     * highest lifetime is drawn at the front.
     */
    DRAW_ORDER_LIFETIME(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DrawOrder = entries.single { it.id == `value` }
    }
  }

  public enum class Parameter(
    id: Long,
  ) {
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set initial velocity
     * properties.
     */
    PARAM_INITIAL_LINEAR_VELOCITY(0),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set angular velocity
     * properties.
     */
    PARAM_ANGULAR_VELOCITY(1),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set orbital velocity
     * properties.
     */
    PARAM_ORBIT_VELOCITY(2),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set linear acceleration
     * properties.
     */
    PARAM_LINEAR_ACCEL(3),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set radial acceleration
     * properties.
     */
    PARAM_RADIAL_ACCEL(4),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set tangential acceleration
     * properties.
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
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set animation offset
     * properties.
     */
    PARAM_ANIM_OFFSET(11),
    /**
     * Represents the size of the [Parameter] enum.
     */
    PARAM_MAX(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Parameter = entries.single { it.id == `value` }
    }
  }

  public enum class ParticleFlags(
    id: Long,
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
     * Represents the size of the [ParticleFlags] enum.
     */
    PARTICLE_FLAG_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ParticleFlags = entries.single { it.id == `value` }
    }
  }

  public enum class EmissionShape(
    id: Long,
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
     * Particles will be emitted at a position chosen randomly among [emissionPoints]. Particle
     * color will be modulated by [emissionColors].
     */
    EMISSION_SHAPE_POINTS(4),
    /**
     * Particles will be emitted at a position chosen randomly among [emissionPoints]. Particle
     * velocity and rotation will be set based on [emissionNormals]. Particle color will be modulated
     * by [emissionColors].
     */
    EMISSION_SHAPE_DIRECTED_POINTS(5),
    /**
     * Represents the size of the [EmissionShape] enum.
     */
    EMISSION_SHAPE_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EmissionShape = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emitting", 2586408642)

    public val setAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_amount", 1286410249)

    public val setLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_lifetime", 373806689)

    public val setOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_one_shot", 2586408642)

    public val setPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_pre_process_time", 373806689)

    public val setExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_explosiveness_ratio", 373806689)

    public val setRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_randomness_ratio", 373806689)

    public val setLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_lifetime_randomness", 373806689)

    public val setUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_use_local_coordinates", 2586408642)

    public val setFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_fixed_fps", 1286410249)

    public val setFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_fractional_delta", 2586408642)

    public val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_speed_scale", 373806689)

    public val isEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "is_emitting", 36873697)

    public val getAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_amount", 3905245786)

    public val getLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_lifetime", 1740695150)

    public val getOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_one_shot", 36873697)

    public val getPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_pre_process_time", 1740695150)

    public val getExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_explosiveness_ratio", 1740695150)

    public val getRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_randomness_ratio", 1740695150)

    public val getLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_lifetime_randomness", 1740695150)

    public val getUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_use_local_coordinates", 36873697)

    public val getFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_fixed_fps", 3905245786)

    public val getFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_fractional_delta", 36873697)

    public val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_speed_scale", 1740695150)

    public val setDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_draw_order", 4183193490)

    public val getDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_draw_order", 1668655735)

    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_texture", 4051416890)

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_texture", 3635182373)

    public val restartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "restart", 3218959716)

    public val setDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_direction", 743155724)

    public val getDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_direction", 3341600327)

    public val setSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_spread", 373806689)

    public val getSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_spread", 1740695150)

    public val setParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_param_min", 3320615296)

    public val getParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_param_min", 2038050600)

    public val setParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_param_max", 3320615296)

    public val getParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_param_max", 2038050600)

    public val setParamCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_param_curve", 2959350143)

    public val getParamCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_param_curve", 2603158474)

    public val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_color", 2920490490)

    public val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_color", 3444240500)

    public val setColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_color_ramp", 2756054477)

    public val getColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_color_ramp", 132272999)

    public val setColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_color_initial_ramp", 2756054477)

    public val getColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_color_initial_ramp", 132272999)

    public val setParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_particle_flag", 4178137949)

    public val getParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_particle_flag", 2829976507)

    public val setEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_shape", 393763892)

    public val getEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_shape", 1740246024)

    public val setEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_sphere_radius", 373806689)

    public val getEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_sphere_radius", 1740695150)

    public val setEmissionRectExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_rect_extents", 743155724)

    public val getEmissionRectExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_rect_extents", 3341600327)

    public val setEmissionPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_points", 1509147220)

    public val getEmissionPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_points", 2961356807)

    public val setEmissionNormalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_normals", 1509147220)

    public val getEmissionNormalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_normals", 2961356807)

    public val setEmissionColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_colors", 3546319833)

    public val getEmissionColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_colors", 1392750486)

    public val getGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_gravity", 3341600327)

    public val setGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_gravity", 743155724)

    public val getSplitScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_split_scale", 2240911060)

    public val setSplitScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_split_scale", 2586408642)

    public val getScaleCurveXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_scale_curve_x", 2460114913)

    public val setScaleCurveXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_scale_curve_x", 270443179)

    public val getScaleCurveYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_scale_curve_y", 2460114913)

    public val setScaleCurveYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_scale_curve_y", 270443179)

    public val convertFromParticlesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "convert_from_particles", 1078189570)
  }
}
