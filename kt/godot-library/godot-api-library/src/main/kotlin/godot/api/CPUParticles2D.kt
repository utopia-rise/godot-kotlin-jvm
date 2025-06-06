// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.PackedVector2Array
import godot.core.Signal0
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * CPU-based 2D particle node used to create a variety of particle systems and effects.
 *
 * See also [GPUParticles2D], which provides the same functionality with hardware acceleration, but
 * may not run on older devices.
 */
@GodotBaseType
public open class CPUParticles2D : Node2D() {
  /**
   * Emitted when all active particles have finished processing. When [oneShot] is disabled,
   * particles will process continuously, so this is never emitted.
   */
  public val finished: Signal0 by Signal0

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
   * If `true`, particles will use the same seed for every simulation using the seed defined in
   * [seed]. This is useful for situations where the visual outcome should be consistent across
   * replays, for example when using Movie Maker mode.
   */
  public final inline var useFixedSeed: Boolean
    @JvmName("useFixedSeedProperty")
    get() = getUseFixedSeed()
    @JvmName("useFixedSeedProperty")
    set(`value`) {
      setUseFixedSeed(value)
    }

  /**
   * Sets the random seed used by the particle system. Only effective if [useFixedSeed] is `true`.
   */
  public final inline var seed: Long
    @JvmName("seedProperty")
    get() = getSeed()
    @JvmName("seedProperty")
    set(`value`) {
      setSeed(value)
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
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
    get() = getParticleFlag(CPUParticles2D.ParticleFlags.ALIGN_Y_TO_VELOCITY)
    @JvmName("particleFlagAlignYProperty")
    set(`value`) {
      setParticleFlag(CPUParticles2D.ParticleFlags.ALIGN_Y_TO_VELOCITY, value)
    }

  /**
   * Unit vector specifying the particles' emission direction.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
    get() = getParamMin(CPUParticles2D.Parameter.INITIAL_LINEAR_VELOCITY)
    @JvmName("initialVelocityMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.INITIAL_LINEAR_VELOCITY, value)
    }

  /**
   * Maximum initial velocity magnitude for each particle. Direction comes from [direction] and
   * [spread].
   */
  public final inline var initialVelocityMax: Float
    @JvmName("initialVelocityMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.INITIAL_LINEAR_VELOCITY)
    @JvmName("initialVelocityMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.INITIAL_LINEAR_VELOCITY, value)
    }

  /**
   * Minimum equivalent of [angularVelocityMax].
   */
  public final inline var angularVelocityMin: Float
    @JvmName("angularVelocityMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.ANGULAR_VELOCITY)
    @JvmName("angularVelocityMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.ANGULAR_VELOCITY, value)
    }

  /**
   * Maximum initial angular velocity (rotation speed) applied to each particle in *degrees* per
   * second.
   */
  public final inline var angularVelocityMax: Float
    @JvmName("angularVelocityMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.ANGULAR_VELOCITY)
    @JvmName("angularVelocityMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.ANGULAR_VELOCITY, value)
    }

  /**
   * Each particle's angular velocity will vary along this [Curve]. Should be a unit [Curve].
   */
  public final inline var angularVelocityCurve: Curve?
    @JvmName("angularVelocityCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.ANGULAR_VELOCITY)
    @JvmName("angularVelocityCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.ANGULAR_VELOCITY, value)
    }

  /**
   * Minimum equivalent of [orbitVelocityMax].
   */
  public final inline var orbitVelocityMin: Float
    @JvmName("orbitVelocityMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.ORBIT_VELOCITY)
    @JvmName("orbitVelocityMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.ORBIT_VELOCITY, value)
    }

  /**
   * Maximum orbital velocity applied to each particle. Makes the particles circle around origin.
   * Specified in number of full rotations around origin per second.
   */
  public final inline var orbitVelocityMax: Float
    @JvmName("orbitVelocityMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.ORBIT_VELOCITY)
    @JvmName("orbitVelocityMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.ORBIT_VELOCITY, value)
    }

  /**
   * Each particle's orbital velocity will vary along this [Curve]. Should be a unit [Curve].
   */
  public final inline var orbitVelocityCurve: Curve?
    @JvmName("orbitVelocityCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.ORBIT_VELOCITY)
    @JvmName("orbitVelocityCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.ORBIT_VELOCITY, value)
    }

  /**
   * Minimum equivalent of [linearAccelMax].
   */
  public final inline var linearAccelMin: Float
    @JvmName("linearAccelMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.LINEAR_ACCEL)
    @JvmName("linearAccelMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.LINEAR_ACCEL, value)
    }

  /**
   * Maximum linear acceleration applied to each particle in the direction of motion.
   */
  public final inline var linearAccelMax: Float
    @JvmName("linearAccelMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.LINEAR_ACCEL)
    @JvmName("linearAccelMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.LINEAR_ACCEL, value)
    }

  /**
   * Each particle's linear acceleration will vary along this [Curve]. Should be a unit [Curve].
   */
  public final inline var linearAccelCurve: Curve?
    @JvmName("linearAccelCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.LINEAR_ACCEL)
    @JvmName("linearAccelCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.LINEAR_ACCEL, value)
    }

  /**
   * Minimum equivalent of [radialAccelMax].
   */
  public final inline var radialAccelMin: Float
    @JvmName("radialAccelMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.RADIAL_ACCEL)
    @JvmName("radialAccelMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.RADIAL_ACCEL, value)
    }

  /**
   * Maximum radial acceleration applied to each particle. Makes particle accelerate away from the
   * origin or towards it if negative.
   */
  public final inline var radialAccelMax: Float
    @JvmName("radialAccelMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.RADIAL_ACCEL)
    @JvmName("radialAccelMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.RADIAL_ACCEL, value)
    }

  /**
   * Each particle's radial acceleration will vary along this [Curve]. Should be a unit [Curve].
   */
  public final inline var radialAccelCurve: Curve?
    @JvmName("radialAccelCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.RADIAL_ACCEL)
    @JvmName("radialAccelCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.RADIAL_ACCEL, value)
    }

  /**
   * Minimum equivalent of [tangentialAccelMax].
   */
  public final inline var tangentialAccelMin: Float
    @JvmName("tangentialAccelMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.TANGENTIAL_ACCEL)
    @JvmName("tangentialAccelMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.TANGENTIAL_ACCEL, value)
    }

  /**
   * Maximum tangential acceleration applied to each particle. Tangential acceleration is
   * perpendicular to the particle's velocity giving the particles a swirling motion.
   */
  public final inline var tangentialAccelMax: Float
    @JvmName("tangentialAccelMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.TANGENTIAL_ACCEL)
    @JvmName("tangentialAccelMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.TANGENTIAL_ACCEL, value)
    }

  /**
   * Each particle's tangential acceleration will vary along this [Curve]. Should be a unit [Curve].
   */
  public final inline var tangentialAccelCurve: Curve?
    @JvmName("tangentialAccelCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.TANGENTIAL_ACCEL)
    @JvmName("tangentialAccelCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.TANGENTIAL_ACCEL, value)
    }

  /**
   * Minimum equivalent of [dampingMax].
   */
  public final inline var dampingMin: Float
    @JvmName("dampingMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.DAMPING)
    @JvmName("dampingMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.DAMPING, value)
    }

  /**
   * The maximum rate at which particles lose velocity. For example value of `100` means that the
   * particle will go from `100` velocity to `0` in `1` second.
   */
  public final inline var dampingMax: Float
    @JvmName("dampingMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.DAMPING)
    @JvmName("dampingMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.DAMPING, value)
    }

  /**
   * Damping will vary along this [Curve]. Should be a unit [Curve].
   */
  public final inline var dampingCurve: Curve?
    @JvmName("dampingCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.DAMPING)
    @JvmName("dampingCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.DAMPING, value)
    }

  /**
   * Minimum equivalent of [angleMax].
   */
  public final inline var angleMin: Float
    @JvmName("angleMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.ANGLE)
    @JvmName("angleMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.ANGLE, value)
    }

  /**
   * Maximum initial rotation applied to each particle, in degrees.
   */
  public final inline var angleMax: Float
    @JvmName("angleMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.ANGLE)
    @JvmName("angleMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.ANGLE, value)
    }

  /**
   * Each particle's rotation will be animated along this [Curve]. Should be a unit [Curve].
   */
  public final inline var angleCurve: Curve?
    @JvmName("angleCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.ANGLE)
    @JvmName("angleCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.ANGLE, value)
    }

  /**
   * Minimum equivalent of [scaleAmountMax].
   */
  public final inline var scaleAmountMin: Float
    @JvmName("scaleAmountMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.SCALE)
    @JvmName("scaleAmountMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.SCALE, value)
    }

  /**
   * Maximum initial scale applied to each particle.
   */
  public final inline var scaleAmountMax: Float
    @JvmName("scaleAmountMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.SCALE)
    @JvmName("scaleAmountMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.SCALE, value)
    }

  /**
   * Each particle's scale will vary along this [Curve]. Should be a unit [Curve].
   */
  public final inline var scaleAmountCurve: Curve?
    @JvmName("scaleAmountCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.SCALE)
    @JvmName("scaleAmountCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.SCALE, value)
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
   * Each particle's horizontal scale will vary along this [Curve]. Should be a unit [Curve].
   *
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
   * Each particle's vertical scale will vary along this [Curve]. Should be a unit [Curve].
   *
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
   * Each particle's color will vary along this [Gradient] over its lifetime (multiplied with
   * [color]).
   */
  public final inline var colorRamp: Gradient?
    @JvmName("colorRampProperty")
    get() = getColorRamp()
    @JvmName("colorRampProperty")
    set(`value`) {
      setColorRamp(value)
    }

  /**
   * Each particle's initial color will vary along this [Gradient] (multiplied with [color]).
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
    get() = getParamMin(CPUParticles2D.Parameter.HUE_VARIATION)
    @JvmName("hueVariationMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.HUE_VARIATION, value)
    }

  /**
   * Maximum initial hue variation applied to each particle. It will shift the particle color's hue.
   */
  public final inline var hueVariationMax: Float
    @JvmName("hueVariationMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.HUE_VARIATION)
    @JvmName("hueVariationMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.HUE_VARIATION, value)
    }

  /**
   * Each particle's hue will vary along this [Curve]. Should be a unit [Curve].
   */
  public final inline var hueVariationCurve: Curve?
    @JvmName("hueVariationCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.HUE_VARIATION)
    @JvmName("hueVariationCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.HUE_VARIATION, value)
    }

  /**
   * Minimum equivalent of [animSpeedMax].
   */
  public final inline var animSpeedMin: Float
    @JvmName("animSpeedMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.ANIM_SPEED)
    @JvmName("animSpeedMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.ANIM_SPEED, value)
    }

  /**
   * Maximum particle animation speed. Animation speed of `1` means that the particles will make
   * full `0` to `1` offset cycle during lifetime, `2` means `2` cycles etc.
   *
   * With animation speed greater than `1`, remember to enable
   * [CanvasItemMaterial.particlesAnimLoop] property if you want the animation to repeat.
   */
  public final inline var animSpeedMax: Float
    @JvmName("animSpeedMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.ANIM_SPEED)
    @JvmName("animSpeedMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.ANIM_SPEED, value)
    }

  /**
   * Each particle's animation speed will vary along this [Curve]. Should be a unit [Curve].
   */
  public final inline var animSpeedCurve: Curve?
    @JvmName("animSpeedCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.ANIM_SPEED)
    @JvmName("animSpeedCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.ANIM_SPEED, value)
    }

  /**
   * Minimum equivalent of [animOffsetMax].
   */
  public final inline var animOffsetMin: Float
    @JvmName("animOffsetMinProperty")
    get() = getParamMin(CPUParticles2D.Parameter.ANIM_OFFSET)
    @JvmName("animOffsetMinProperty")
    set(`value`) {
      setParamMin(CPUParticles2D.Parameter.ANIM_OFFSET, value)
    }

  /**
   * Maximum animation offset that corresponds to frame index in the texture. `0` is the first
   * frame, `1` is the last one. See [CanvasItemMaterial.particlesAnimation].
   */
  public final inline var animOffsetMax: Float
    @JvmName("animOffsetMaxProperty")
    get() = getParamMax(CPUParticles2D.Parameter.ANIM_OFFSET)
    @JvmName("animOffsetMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles2D.Parameter.ANIM_OFFSET, value)
    }

  /**
   * Each particle's animation offset will vary along this [Curve]. Should be a unit [Curve].
   */
  public final inline var animOffsetCurve: Curve?
    @JvmName("animOffsetCurveProperty")
    get() = getParamCurve(CPUParticles2D.Parameter.ANIM_OFFSET)
    @JvmName("animOffsetCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles2D.Parameter.ANIM_OFFSET, value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(115, scriptIndex)
  }

  /**
   * This is a helper function for [emissionRectExtents] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = cpuparticles2d.emissionRectExtents
   * //Your changes
   * cpuparticles2d.emissionRectExtents = myCoreType
   * ``````
   *
   * The rectangle's extents if [emissionShape] is set to [EMISSION_SHAPE_RECTANGLE].
   */
  @CoreTypeHelper
  public final fun emissionRectExtentsMutate(block: Vector2.() -> Unit): Vector2 =
      emissionRectExtents.apply {
     block(this)
     emissionRectExtents = this
  }

  /**
   * This is a helper function for [emissionPoints] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = cpuparticles2d.emissionPoints
   * //Your changes
   * cpuparticles2d.emissionPoints = myCoreType
   * ``````
   *
   * Sets the initial positions to spawn particles when using [EMISSION_SHAPE_POINTS] or
   * [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  @CoreTypeHelper
  public final fun emissionPointsMutate(block: PackedVector2Array.() -> Unit): PackedVector2Array =
      emissionPoints.apply {
     block(this)
     emissionPoints = this
  }

  /**
   * This is a helper function for [emissionPoints] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * Sets the initial positions to spawn particles when using [EMISSION_SHAPE_POINTS] or
   * [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  @CoreTypeHelper
  public final fun emissionPointsMutateEach(block: (index: Int, `value`: Vector2) -> Unit):
      PackedVector2Array = emissionPoints.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     emissionPoints = this
  }

  /**
   * This is a helper function for [emissionNormals] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = cpuparticles2d.emissionNormals
   * //Your changes
   * cpuparticles2d.emissionNormals = myCoreType
   * ``````
   *
   * Sets the direction the particles will be emitted in when using
   * [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  @CoreTypeHelper
  public final fun emissionNormalsMutate(block: PackedVector2Array.() -> Unit): PackedVector2Array =
      emissionNormals.apply {
     block(this)
     emissionNormals = this
  }

  /**
   * This is a helper function for [emissionNormals] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * Sets the direction the particles will be emitted in when using
   * [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  @CoreTypeHelper
  public final fun emissionNormalsMutateEach(block: (index: Int, `value`: Vector2) -> Unit):
      PackedVector2Array = emissionNormals.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     emissionNormals = this
  }

  /**
   * This is a helper function for [direction] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = cpuparticles2d.direction
   * //Your changes
   * cpuparticles2d.direction = myCoreType
   * ``````
   *
   * Unit vector specifying the particles' emission direction.
   */
  @CoreTypeHelper
  public final fun directionMutate(block: Vector2.() -> Unit): Vector2 = direction.apply {
     block(this)
     direction = this
  }

  /**
   * This is a helper function for [gravity] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = cpuparticles2d.gravity
   * //Your changes
   * cpuparticles2d.gravity = myCoreType
   * ``````
   *
   * Gravity applied to every particle.
   */
  @CoreTypeHelper
  public final fun gravityMutate(block: Vector2.() -> Unit): Vector2 = gravity.apply {
     block(this)
     gravity = this
  }

  /**
   * This is a helper function for [color] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = cpuparticles2d.color
   * //Your changes
   * cpuparticles2d.color = myCoreType
   * ``````
   *
   * Each particle's initial color. If [texture] is defined, it will be multiplied by this color.
   */
  @CoreTypeHelper
  public final fun colorMutate(block: Color.() -> Unit): Color = color.apply {
     block(this)
     color = this
  }

  public final fun setEmitting(emitting: Boolean): Unit {
    TransferContext.writeArguments(BOOL to emitting)
    TransferContext.callMethod(ptr, MethodBindings.setEmittingPtr, NIL)
  }

  public final fun setAmount(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setAmountPtr, NIL)
  }

  public final fun setLifetime(secs: Double): Unit {
    TransferContext.writeArguments(DOUBLE to secs)
    TransferContext.callMethod(ptr, MethodBindings.setLifetimePtr, NIL)
  }

  public final fun setOneShot(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setOneShotPtr, NIL)
  }

  public final fun setPreProcessTime(secs: Double): Unit {
    TransferContext.writeArguments(DOUBLE to secs)
    TransferContext.callMethod(ptr, MethodBindings.setPreProcessTimePtr, NIL)
  }

  public final fun setExplosivenessRatio(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setExplosivenessRatioPtr, NIL)
  }

  public final fun setRandomnessRatio(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRandomnessRatioPtr, NIL)
  }

  public final fun setLifetimeRandomness(random: Double): Unit {
    TransferContext.writeArguments(DOUBLE to random)
    TransferContext.callMethod(ptr, MethodBindings.setLifetimeRandomnessPtr, NIL)
  }

  public final fun setUseLocalCoordinates(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseLocalCoordinatesPtr, NIL)
  }

  public final fun setFixedFps(fps: Int): Unit {
    TransferContext.writeArguments(LONG to fps.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFixedFpsPtr, NIL)
  }

  public final fun setFractionalDelta(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setFractionalDeltaPtr, NIL)
  }

  public final fun setSpeedScale(scale: Double): Unit {
    TransferContext.writeArguments(DOUBLE to scale)
    TransferContext.callMethod(ptr, MethodBindings.setSpeedScalePtr, NIL)
  }

  /**
   * Requests the particles to process for extra process time during a single frame.
   *
   * Useful for particle playback, if used in combination with [useFixedSeed] or by calling
   * [restart] with parameter `keep_seed` set to `true`.
   */
  public final fun requestParticlesProcess(processTime: Float): Unit {
    TransferContext.writeArguments(DOUBLE to processTime.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.requestParticlesProcessPtr, NIL)
  }

  public final fun isEmitting(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEmittingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getAmount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAmountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getLifetime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLifetimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getOneShot(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOneShotPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getPreProcessTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPreProcessTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getExplosivenessRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getExplosivenessRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getRandomnessRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRandomnessRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getLifetimeRandomness(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLifetimeRandomnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getUseLocalCoordinates(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUseLocalCoordinatesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getFixedFps(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFixedFpsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getFractionalDelta(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFractionalDeltaPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getSpeedScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpeedScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setUseFixedSeed(useFixedSeed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useFixedSeed)
    TransferContext.callMethod(ptr, MethodBindings.setUseFixedSeedPtr, NIL)
  }

  public final fun getUseFixedSeed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUseFixedSeedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSeed(seed: Long): Unit {
    TransferContext.writeArguments(LONG to seed)
    TransferContext.callMethod(ptr, MethodBindings.setSeedPtr, NIL)
  }

  public final fun getSeed(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSeedPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDrawOrder(order: DrawOrder): Unit {
    TransferContext.writeArguments(LONG to order.id)
    TransferContext.callMethod(ptr, MethodBindings.setDrawOrderPtr, NIL)
  }

  public final fun getDrawOrder(): DrawOrder {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDrawOrderPtr, LONG)
    return DrawOrder.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Restarts the particle emitter.
   *
   * If [keepSeed] is `true`, the current random seed will be preserved. Useful for seeking and
   * playback.
   */
  @JvmOverloads
  public final fun restart(keepSeed: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to keepSeed)
    TransferContext.callMethod(ptr, MethodBindings.restartPtr, NIL)
  }

  public final fun setDirection(direction: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to direction)
    TransferContext.callMethod(ptr, MethodBindings.setDirectionPtr, NIL)
  }

  public final fun getDirection(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDirectionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setSpread(spread: Float): Unit {
    TransferContext.writeArguments(DOUBLE to spread.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSpreadPtr, NIL)
  }

  public final fun getSpread(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpreadPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the minimum value for the given parameter.
   */
  public final fun setParamMin(`param`: Parameter, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setParamMinPtr, NIL)
  }

  /**
   * Returns the minimum value range for the given parameter.
   */
  public final fun getParamMin(`param`: Parameter): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(ptr, MethodBindings.getParamMinPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the maximum value for the given parameter.
   */
  public final fun setParamMax(`param`: Parameter, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setParamMaxPtr, NIL)
  }

  /**
   * Returns the maximum value range for the given parameter.
   */
  public final fun getParamMax(`param`: Parameter): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(ptr, MethodBindings.getParamMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the [Curve] of the parameter specified by [Parameter]. Should be a unit [Curve].
   */
  public final fun setParamCurve(`param`: Parameter, curve: Curve?): Unit {
    TransferContext.writeArguments(LONG to param.id, OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setParamCurvePtr, NIL)
  }

  /**
   * Returns the [Curve] of the parameter specified by [Parameter].
   */
  public final fun getParamCurve(`param`: Parameter): Curve? {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(ptr, MethodBindings.getParamCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setColorPtr, NIL)
  }

  public final fun getColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setColorRamp(ramp: Gradient?): Unit {
    TransferContext.writeArguments(OBJECT to ramp)
    TransferContext.callMethod(ptr, MethodBindings.setColorRampPtr, NIL)
  }

  public final fun getColorRamp(): Gradient? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorRampPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Gradient?)
  }

  public final fun setColorInitialRamp(ramp: Gradient?): Unit {
    TransferContext.writeArguments(OBJECT to ramp)
    TransferContext.callMethod(ptr, MethodBindings.setColorInitialRampPtr, NIL)
  }

  public final fun getColorInitialRamp(): Gradient? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorInitialRampPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Gradient?)
  }

  /**
   * Enables or disables the given flag (see [ParticleFlags] for options).
   */
  public final fun setParticleFlag(particleFlag: ParticleFlags, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to particleFlag.id, BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setParticleFlagPtr, NIL)
  }

  /**
   * Returns the enabled state of the given particle flag (see [ParticleFlags] for options).
   */
  public final fun getParticleFlag(particleFlag: ParticleFlags): Boolean {
    TransferContext.writeArguments(LONG to particleFlag.id)
    TransferContext.callMethod(ptr, MethodBindings.getParticleFlagPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEmissionShape(shape: EmissionShape): Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionShapePtr, NIL)
  }

  public final fun getEmissionShape(): EmissionShape {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionShapePtr, LONG)
    return EmissionShape.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setEmissionSphereRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEmissionSphereRadiusPtr, NIL)
  }

  public final fun getEmissionSphereRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionSphereRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmissionRectExtents(extents: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to extents)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionRectExtentsPtr, NIL)
  }

  public final fun getEmissionRectExtents(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionRectExtentsPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setEmissionPoints(array: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to array)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionPointsPtr, NIL)
  }

  public final fun getEmissionPoints(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionPointsPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun setEmissionNormals(array: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to array)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionNormalsPtr, NIL)
  }

  public final fun getEmissionNormals(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionNormalsPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun setEmissionColors(array: PackedColorArray): Unit {
    TransferContext.writeArguments(PACKED_COLOR_ARRAY to array)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionColorsPtr, NIL)
  }

  public final fun getEmissionColors(): PackedColorArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionColorsPtr, PACKED_COLOR_ARRAY)
    return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY) as PackedColorArray)
  }

  public final fun getGravity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGravityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setGravity(accelVec: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to accelVec)
    TransferContext.callMethod(ptr, MethodBindings.setGravityPtr, NIL)
  }

  public final fun getSplitScale(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSplitScalePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSplitScale(splitScale: Boolean): Unit {
    TransferContext.writeArguments(BOOL to splitScale)
    TransferContext.callMethod(ptr, MethodBindings.setSplitScalePtr, NIL)
  }

  public final fun getScaleCurveX(): Curve? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScaleCurveXPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setScaleCurveX(scaleCurve: Curve?): Unit {
    TransferContext.writeArguments(OBJECT to scaleCurve)
    TransferContext.callMethod(ptr, MethodBindings.setScaleCurveXPtr, NIL)
  }

  public final fun getScaleCurveY(): Curve? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScaleCurveYPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setScaleCurveY(scaleCurve: Curve?): Unit {
    TransferContext.writeArguments(OBJECT to scaleCurve)
    TransferContext.callMethod(ptr, MethodBindings.setScaleCurveYPtr, NIL)
  }

  /**
   * Sets this node's properties to match a given [GPUParticles2D] node with an assigned
   * [ParticleProcessMaterial].
   */
  public final fun convertFromParticles(particles: Node?): Unit {
    TransferContext.writeArguments(OBJECT to particles)
    TransferContext.callMethod(ptr, MethodBindings.convertFromParticlesPtr, NIL)
  }

  public enum class DrawOrder(
    id: Long,
  ) {
    /**
     * Particles are drawn in the order emitted.
     */
    INDEX(0),
    /**
     * Particles are drawn in order of remaining lifetime. In other words, the particle with the
     * highest lifetime is drawn at the front.
     */
    LIFETIME(1),
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
    INITIAL_LINEAR_VELOCITY(0),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set angular velocity
     * properties.
     */
    ANGULAR_VELOCITY(1),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set orbital velocity
     * properties.
     */
    ORBIT_VELOCITY(2),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set linear acceleration
     * properties.
     */
    LINEAR_ACCEL(3),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set radial acceleration
     * properties.
     */
    RADIAL_ACCEL(4),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set tangential acceleration
     * properties.
     */
    TANGENTIAL_ACCEL(5),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set damping properties.
     */
    DAMPING(6),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set angle properties.
     */
    ANGLE(7),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set scale properties.
     */
    SCALE(8),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set hue variation properties.
     */
    HUE_VARIATION(9),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set animation speed properties.
     */
    ANIM_SPEED(10),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamCurve] to set animation offset
     * properties.
     */
    ANIM_OFFSET(11),
    /**
     * Represents the size of the [Parameter] enum.
     */
    MAX(12),
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
    ALIGN_Y_TO_VELOCITY(0),
    /**
     * Present for consistency with 3D particle nodes, not used in 2D.
     */
    ROTATE_Y(1),
    /**
     * Present for consistency with 3D particle nodes, not used in 2D.
     */
    DISABLE_Z(2),
    /**
     * Represents the size of the [ParticleFlags] enum.
     */
    MAX(3),
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
    POINT(0),
    /**
     * Particles will be emitted in the volume of a sphere flattened to two dimensions.
     */
    SPHERE(1),
    /**
     * Particles will be emitted on the surface of a sphere flattened to two dimensions.
     */
    SPHERE_SURFACE(2),
    /**
     * Particles will be emitted in the area of a rectangle.
     */
    RECTANGLE(3),
    /**
     * Particles will be emitted at a position chosen randomly among [emissionPoints]. Particle
     * color will be modulated by [emissionColors].
     */
    POINTS(4),
    /**
     * Particles will be emitted at a position chosen randomly among [emissionPoints]. Particle
     * velocity and rotation will be set based on [emissionNormals]. Particle color will be modulated
     * by [emissionColors].
     */
    DIRECTED_POINTS(5),
    /**
     * Represents the size of the [EmissionShape] enum.
     */
    MAX(6),
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

  public object MethodBindings {
    internal val setEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emitting", 2586408642)

    internal val setAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_amount", 1286410249)

    internal val setLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_lifetime", 373806689)

    internal val setOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_one_shot", 2586408642)

    internal val setPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_pre_process_time", 373806689)

    internal val setExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_explosiveness_ratio", 373806689)

    internal val setRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_randomness_ratio", 373806689)

    internal val setLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_lifetime_randomness", 373806689)

    internal val setUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_use_local_coordinates", 2586408642)

    internal val setFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_fixed_fps", 1286410249)

    internal val setFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_fractional_delta", 2586408642)

    internal val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_speed_scale", 373806689)

    internal val requestParticlesProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "request_particles_process", 373806689)

    internal val isEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "is_emitting", 36873697)

    internal val getAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_amount", 3905245786)

    internal val getLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_lifetime", 1740695150)

    internal val getOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_one_shot", 36873697)

    internal val getPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_pre_process_time", 1740695150)

    internal val getExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_explosiveness_ratio", 1740695150)

    internal val getRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_randomness_ratio", 1740695150)

    internal val getLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_lifetime_randomness", 1740695150)

    internal val getUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_use_local_coordinates", 36873697)

    internal val getFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_fixed_fps", 3905245786)

    internal val getFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_fractional_delta", 36873697)

    internal val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_speed_scale", 1740695150)

    internal val setUseFixedSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_use_fixed_seed", 2586408642)

    internal val getUseFixedSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_use_fixed_seed", 36873697)

    internal val setSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_seed", 1286410249)

    internal val getSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_seed", 3905245786)

    internal val setDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_draw_order", 4183193490)

    internal val getDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_draw_order", 1668655735)

    internal val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_texture", 4051416890)

    internal val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_texture", 3635182373)

    internal val restartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "restart", 107499316)

    internal val setDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_direction", 743155724)

    internal val getDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_direction", 3341600327)

    internal val setSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_spread", 373806689)

    internal val getSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_spread", 1740695150)

    internal val setParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_param_min", 3320615296)

    internal val getParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_param_min", 2038050600)

    internal val setParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_param_max", 3320615296)

    internal val getParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_param_max", 2038050600)

    internal val setParamCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_param_curve", 2959350143)

    internal val getParamCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_param_curve", 2603158474)

    internal val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_color", 2920490490)

    internal val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_color", 3444240500)

    internal val setColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_color_ramp", 2756054477)

    internal val getColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_color_ramp", 132272999)

    internal val setColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_color_initial_ramp", 2756054477)

    internal val getColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_color_initial_ramp", 132272999)

    internal val setParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_particle_flag", 4178137949)

    internal val getParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_particle_flag", 2829976507)

    internal val setEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_shape", 393763892)

    internal val getEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_shape", 1740246024)

    internal val setEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_sphere_radius", 373806689)

    internal val getEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_sphere_radius", 1740695150)

    internal val setEmissionRectExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_rect_extents", 743155724)

    internal val getEmissionRectExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_rect_extents", 3341600327)

    internal val setEmissionPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_points", 1509147220)

    internal val getEmissionPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_points", 2961356807)

    internal val setEmissionNormalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_normals", 1509147220)

    internal val getEmissionNormalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_normals", 2961356807)

    internal val setEmissionColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_colors", 3546319833)

    internal val getEmissionColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_colors", 1392750486)

    internal val getGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_gravity", 3341600327)

    internal val setGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_gravity", 743155724)

    internal val getSplitScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_split_scale", 2240911060)

    internal val setSplitScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_split_scale", 2586408642)

    internal val getScaleCurveXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_scale_curve_x", 2460114913)

    internal val setScaleCurveXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_scale_curve_x", 270443179)

    internal val getScaleCurveYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_scale_curve_y", 2460114913)

    internal val setScaleCurveYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_scale_curve_y", 270443179)

    internal val convertFromParticlesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "convert_from_particles", 1078189570)
  }
}
