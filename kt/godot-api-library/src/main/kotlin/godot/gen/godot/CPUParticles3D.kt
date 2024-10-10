// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.PackedVector3Array
import godot.core.Signal0
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_COLOR_ARRAY
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_CPUPARTICLES3D_INDEX: Int = 142

/**
 * CPU-based 3D particle node used to create a variety of particle systems and effects.
 * See also [GPUParticles3D], which provides the same functionality with hardware acceleration, but
 * may not run on older devices.
 */
@GodotBaseType
public open class CPUParticles3D : GeometryInstance3D() {
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
   * make the particles render at 2 frames per second. Note this does not slow down the particle system
   * itself.
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
   * The [AABB] that determines the node's region which needs to be visible on screen for the
   * particle system to be active.
   * Grow the box if particles suddenly appear/disappear when the node enters/exits the screen. The
   * [AABB] can be grown via code or with the **Particles → Generate AABB** editor tool.
   */
  @CoreTypeLocalCopy
  public final inline var visibilityAabb: AABB
    @JvmName("visibilityAabbProperty")
    get() = getVisibilityAabb()
    @JvmName("visibilityAabbProperty")
    set(`value`) {
      setVisibilityAabb(value)
    }

  /**
   * If `true`, particles use the parent node's coordinate space (known as local coordinates). This
   * will cause particles to move and rotate along the [CPUParticles3D] node (and its parents) when it
   * is moved or rotated. If `false`, particles use global coordinates; they will not move or rotate
   * along the [CPUParticles3D] node (and its parents) when it is moved or rotated.
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
   * The [Mesh] used for each particle. If `null`, particles will be spheres.
   */
  public final inline var mesh: Mesh?
    @JvmName("meshProperty")
    get() = getMesh()
    @JvmName("meshProperty")
    set(`value`) {
      setMesh(value)
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
   * The sphere's radius if [EmissionShape] is set to [EMISSION_SHAPE_SPHERE].
   */
  public final inline var emissionSphereRadius: Float
    @JvmName("emissionSphereRadiusProperty")
    get() = getEmissionSphereRadius()
    @JvmName("emissionSphereRadiusProperty")
    set(`value`) {
      setEmissionSphereRadius(value)
    }

  /**
   * The rectangle's extents if [emissionShape] is set to [EMISSION_SHAPE_BOX].
   */
  @CoreTypeLocalCopy
  public final inline var emissionBoxExtents: Vector3
    @JvmName("emissionBoxExtentsProperty")
    get() = getEmissionBoxExtents()
    @JvmName("emissionBoxExtentsProperty")
    set(`value`) {
      setEmissionBoxExtents(value)
    }

  /**
   * Sets the initial positions to spawn particles when using [EMISSION_SHAPE_POINTS] or
   * [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public final inline var emissionPoints: PackedVector3Array
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
  public final inline var emissionNormals: PackedVector3Array
    @JvmName("emissionNormalsProperty")
    get() = getEmissionNormals()
    @JvmName("emissionNormalsProperty")
    set(`value`) {
      setEmissionNormals(value)
    }

  /**
   * Sets the [Color]s to modulate particles by when using [EMISSION_SHAPE_POINTS] or
   * [EMISSION_SHAPE_DIRECTED_POINTS].
   * **Note:** [emissionColors] multiplies the particle mesh's vertex colors. To have a visible
   * effect on a [BaseMaterial3D], [BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a
   * [ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function.
   * Otherwise, [emissionColors] will have no visible effect.
   */
  public final inline var emissionColors: PackedColorArray
    @JvmName("emissionColorsProperty")
    get() = getEmissionColors()
    @JvmName("emissionColorsProperty")
    set(`value`) {
      setEmissionColors(value)
    }

  /**
   * The axis of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  @CoreTypeLocalCopy
  public final inline var emissionRingAxis: Vector3
    @JvmName("emissionRingAxisProperty")
    get() = getEmissionRingAxis()
    @JvmName("emissionRingAxisProperty")
    set(`value`) {
      setEmissionRingAxis(value)
    }

  /**
   * The height of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public final inline var emissionRingHeight: Float
    @JvmName("emissionRingHeightProperty")
    get() = getEmissionRingHeight()
    @JvmName("emissionRingHeightProperty")
    set(`value`) {
      setEmissionRingHeight(value)
    }

  /**
   * The radius of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public final inline var emissionRingRadius: Float
    @JvmName("emissionRingRadiusProperty")
    get() = getEmissionRingRadius()
    @JvmName("emissionRingRadiusProperty")
    set(`value`) {
      setEmissionRingRadius(value)
    }

  /**
   * The inner radius of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public final inline var emissionRingInnerRadius: Float
    @JvmName("emissionRingInnerRadiusProperty")
    get() = getEmissionRingInnerRadius()
    @JvmName("emissionRingInnerRadiusProperty")
    set(`value`) {
      setEmissionRingInnerRadius(value)
    }

  /**
   * Align Y axis of particle with the direction of its velocity.
   */
  public final inline var particleFlagAlignY: Boolean
    @JvmName("particleFlagAlignYProperty")
    get() = getParticleFlag(CPUParticles3D.ParticleFlags.PARTICLE_FLAG_ALIGN_Y_TO_VELOCITY)
    @JvmName("particleFlagAlignYProperty")
    set(`value`) {
      setParticleFlag(CPUParticles3D.ParticleFlags.PARTICLE_FLAG_ALIGN_Y_TO_VELOCITY, value)
    }

  /**
   * If `true`, particles rotate around Y axis by [angleMin].
   */
  public final inline var particleFlagRotateY: Boolean
    @JvmName("particleFlagRotateYProperty")
    get() = getParticleFlag(CPUParticles3D.ParticleFlags.PARTICLE_FLAG_ROTATE_Y)
    @JvmName("particleFlagRotateYProperty")
    set(`value`) {
      setParticleFlag(CPUParticles3D.ParticleFlags.PARTICLE_FLAG_ROTATE_Y, value)
    }

  /**
   * If `true`, particles will not move on the Z axis.
   */
  public final inline var particleFlagDisableZ: Boolean
    @JvmName("particleFlagDisableZProperty")
    get() = getParticleFlag(CPUParticles3D.ParticleFlags.PARTICLE_FLAG_DISABLE_Z)
    @JvmName("particleFlagDisableZProperty")
    set(`value`) {
      setParticleFlag(CPUParticles3D.ParticleFlags.PARTICLE_FLAG_DISABLE_Z, value)
    }

  /**
   * Unit vector specifying the particles' emission direction.
   */
  @CoreTypeLocalCopy
  public final inline var direction: Vector3
    @JvmName("directionProperty")
    get() = getDirection()
    @JvmName("directionProperty")
    set(`value`) {
      setDirection(value)
    }

  /**
   * Each particle's initial direction range from `+spread` to `-spread` degrees. Applied to X/Z
   * plane and Y/Z planes.
   */
  public final inline var spread: Float
    @JvmName("spreadProperty")
    get() = getSpread()
    @JvmName("spreadProperty")
    set(`value`) {
      setSpread(value)
    }

  /**
   * Amount of [spread] in Y/Z plane. A value of `1` restricts particles to X/Z plane.
   */
  public final inline var flatness: Float
    @JvmName("flatnessProperty")
    get() = getFlatness()
    @JvmName("flatnessProperty")
    set(`value`) {
      setFlatness(value)
    }

  /**
   * Gravity applied to every particle.
   */
  @CoreTypeLocalCopy
  public final inline var gravity: Vector3
    @JvmName("gravityProperty")
    get() = getGravity()
    @JvmName("gravityProperty")
    set(`value`) {
      setGravity(value)
    }

  /**
   * Minimum value of the initial velocity.
   */
  public final inline var initialVelocityMin: Float
    @JvmName("initialVelocityMinProperty")
    get() = getParamMin(CPUParticles3D.Parameter.PARAM_INITIAL_LINEAR_VELOCITY)
    @JvmName("initialVelocityMinProperty")
    set(`value`) {
      setParamMin(CPUParticles3D.Parameter.PARAM_INITIAL_LINEAR_VELOCITY, value)
    }

  /**
   * Maximum value of the initial velocity.
   */
  public final inline var initialVelocityMax: Float
    @JvmName("initialVelocityMaxProperty")
    get() = getParamMax(CPUParticles3D.Parameter.PARAM_INITIAL_LINEAR_VELOCITY)
    @JvmName("initialVelocityMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles3D.Parameter.PARAM_INITIAL_LINEAR_VELOCITY, value)
    }

  /**
   * Minimum initial angular velocity (rotation speed) applied to each particle in *degrees* per
   * second.
   */
  public final inline var angularVelocityMin: Float
    @JvmName("angularVelocityMinProperty")
    get() = getParamMin(CPUParticles3D.Parameter.PARAM_ANGULAR_VELOCITY)
    @JvmName("angularVelocityMinProperty")
    set(`value`) {
      setParamMin(CPUParticles3D.Parameter.PARAM_ANGULAR_VELOCITY, value)
    }

  /**
   * Maximum initial angular velocity (rotation speed) applied to each particle in *degrees* per
   * second.
   */
  public final inline var angularVelocityMax: Float
    @JvmName("angularVelocityMaxProperty")
    get() = getParamMax(CPUParticles3D.Parameter.PARAM_ANGULAR_VELOCITY)
    @JvmName("angularVelocityMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles3D.Parameter.PARAM_ANGULAR_VELOCITY, value)
    }

  /**
   * Each particle's angular velocity (rotation speed) will vary along this [Curve] over its
   * lifetime.
   */
  public final inline var angularVelocityCurve: Curve?
    @JvmName("angularVelocityCurveProperty")
    get() = getParamCurve(CPUParticles3D.Parameter.PARAM_ANGULAR_VELOCITY)
    @JvmName("angularVelocityCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles3D.Parameter.PARAM_ANGULAR_VELOCITY, value)
    }

  /**
   * Minimum orbit velocity.
   */
  public final inline var orbitVelocityMin: Float
    @JvmName("orbitVelocityMinProperty")
    get() = getParamMin(CPUParticles3D.Parameter.PARAM_ORBIT_VELOCITY)
    @JvmName("orbitVelocityMinProperty")
    set(`value`) {
      setParamMin(CPUParticles3D.Parameter.PARAM_ORBIT_VELOCITY, value)
    }

  /**
   * Maximum orbit velocity.
   */
  public final inline var orbitVelocityMax: Float
    @JvmName("orbitVelocityMaxProperty")
    get() = getParamMax(CPUParticles3D.Parameter.PARAM_ORBIT_VELOCITY)
    @JvmName("orbitVelocityMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles3D.Parameter.PARAM_ORBIT_VELOCITY, value)
    }

  /**
   * Each particle's orbital velocity will vary along this [Curve].
   */
  public final inline var orbitVelocityCurve: Curve?
    @JvmName("orbitVelocityCurveProperty")
    get() = getParamCurve(CPUParticles3D.Parameter.PARAM_ORBIT_VELOCITY)
    @JvmName("orbitVelocityCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles3D.Parameter.PARAM_ORBIT_VELOCITY, value)
    }

  /**
   * Minimum linear acceleration.
   */
  public final inline var linearAccelMin: Float
    @JvmName("linearAccelMinProperty")
    get() = getParamMin(CPUParticles3D.Parameter.PARAM_LINEAR_ACCEL)
    @JvmName("linearAccelMinProperty")
    set(`value`) {
      setParamMin(CPUParticles3D.Parameter.PARAM_LINEAR_ACCEL, value)
    }

  /**
   * Maximum linear acceleration.
   */
  public final inline var linearAccelMax: Float
    @JvmName("linearAccelMaxProperty")
    get() = getParamMax(CPUParticles3D.Parameter.PARAM_LINEAR_ACCEL)
    @JvmName("linearAccelMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles3D.Parameter.PARAM_LINEAR_ACCEL, value)
    }

  /**
   * Each particle's linear acceleration will vary along this [Curve].
   */
  public final inline var linearAccelCurve: Curve?
    @JvmName("linearAccelCurveProperty")
    get() = getParamCurve(CPUParticles3D.Parameter.PARAM_LINEAR_ACCEL)
    @JvmName("linearAccelCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles3D.Parameter.PARAM_LINEAR_ACCEL, value)
    }

  /**
   * Minimum radial acceleration.
   */
  public final inline var radialAccelMin: Float
    @JvmName("radialAccelMinProperty")
    get() = getParamMin(CPUParticles3D.Parameter.PARAM_RADIAL_ACCEL)
    @JvmName("radialAccelMinProperty")
    set(`value`) {
      setParamMin(CPUParticles3D.Parameter.PARAM_RADIAL_ACCEL, value)
    }

  /**
   * Maximum radial acceleration.
   */
  public final inline var radialAccelMax: Float
    @JvmName("radialAccelMaxProperty")
    get() = getParamMax(CPUParticles3D.Parameter.PARAM_RADIAL_ACCEL)
    @JvmName("radialAccelMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles3D.Parameter.PARAM_RADIAL_ACCEL, value)
    }

  /**
   * Each particle's radial acceleration will vary along this [Curve].
   */
  public final inline var radialAccelCurve: Curve?
    @JvmName("radialAccelCurveProperty")
    get() = getParamCurve(CPUParticles3D.Parameter.PARAM_RADIAL_ACCEL)
    @JvmName("radialAccelCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles3D.Parameter.PARAM_RADIAL_ACCEL, value)
    }

  /**
   * Minimum tangent acceleration.
   */
  public final inline var tangentialAccelMin: Float
    @JvmName("tangentialAccelMinProperty")
    get() = getParamMin(CPUParticles3D.Parameter.PARAM_TANGENTIAL_ACCEL)
    @JvmName("tangentialAccelMinProperty")
    set(`value`) {
      setParamMin(CPUParticles3D.Parameter.PARAM_TANGENTIAL_ACCEL, value)
    }

  /**
   * Maximum tangent acceleration.
   */
  public final inline var tangentialAccelMax: Float
    @JvmName("tangentialAccelMaxProperty")
    get() = getParamMax(CPUParticles3D.Parameter.PARAM_TANGENTIAL_ACCEL)
    @JvmName("tangentialAccelMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles3D.Parameter.PARAM_TANGENTIAL_ACCEL, value)
    }

  /**
   * Each particle's tangential acceleration will vary along this [Curve].
   */
  public final inline var tangentialAccelCurve: Curve?
    @JvmName("tangentialAccelCurveProperty")
    get() = getParamCurve(CPUParticles3D.Parameter.PARAM_TANGENTIAL_ACCEL)
    @JvmName("tangentialAccelCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles3D.Parameter.PARAM_TANGENTIAL_ACCEL, value)
    }

  /**
   * Minimum damping.
   */
  public final inline var dampingMin: Float
    @JvmName("dampingMinProperty")
    get() = getParamMin(CPUParticles3D.Parameter.PARAM_DAMPING)
    @JvmName("dampingMinProperty")
    set(`value`) {
      setParamMin(CPUParticles3D.Parameter.PARAM_DAMPING, value)
    }

  /**
   * Maximum damping.
   */
  public final inline var dampingMax: Float
    @JvmName("dampingMaxProperty")
    get() = getParamMax(CPUParticles3D.Parameter.PARAM_DAMPING)
    @JvmName("dampingMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles3D.Parameter.PARAM_DAMPING, value)
    }

  /**
   * Damping will vary along this [Curve].
   */
  public final inline var dampingCurve: Curve?
    @JvmName("dampingCurveProperty")
    get() = getParamCurve(CPUParticles3D.Parameter.PARAM_DAMPING)
    @JvmName("dampingCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles3D.Parameter.PARAM_DAMPING, value)
    }

  /**
   * Minimum angle.
   */
  public final inline var angleMin: Float
    @JvmName("angleMinProperty")
    get() = getParamMin(CPUParticles3D.Parameter.PARAM_ANGLE)
    @JvmName("angleMinProperty")
    set(`value`) {
      setParamMin(CPUParticles3D.Parameter.PARAM_ANGLE, value)
    }

  /**
   * Maximum angle.
   */
  public final inline var angleMax: Float
    @JvmName("angleMaxProperty")
    get() = getParamMax(CPUParticles3D.Parameter.PARAM_ANGLE)
    @JvmName("angleMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles3D.Parameter.PARAM_ANGLE, value)
    }

  /**
   * Each particle's rotation will be animated along this [Curve].
   */
  public final inline var angleCurve: Curve?
    @JvmName("angleCurveProperty")
    get() = getParamCurve(CPUParticles3D.Parameter.PARAM_ANGLE)
    @JvmName("angleCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles3D.Parameter.PARAM_ANGLE, value)
    }

  /**
   * Minimum scale.
   */
  public final inline var scaleAmountMin: Float
    @JvmName("scaleAmountMinProperty")
    get() = getParamMin(CPUParticles3D.Parameter.PARAM_SCALE)
    @JvmName("scaleAmountMinProperty")
    set(`value`) {
      setParamMin(CPUParticles3D.Parameter.PARAM_SCALE, value)
    }

  /**
   * Maximum scale.
   */
  public final inline var scaleAmountMax: Float
    @JvmName("scaleAmountMaxProperty")
    get() = getParamMax(CPUParticles3D.Parameter.PARAM_SCALE)
    @JvmName("scaleAmountMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles3D.Parameter.PARAM_SCALE, value)
    }

  /**
   * Each particle's scale will vary along this [Curve].
   */
  public final inline var scaleAmountCurve: Curve?
    @JvmName("scaleAmountCurveProperty")
    get() = getParamCurve(CPUParticles3D.Parameter.PARAM_SCALE)
    @JvmName("scaleAmountCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles3D.Parameter.PARAM_SCALE, value)
    }

  /**
   * If set to `true`, three different scale curves can be specified, one per scale axis.
   */
  public final inline var splitScale: Boolean
    @JvmName("splitScaleProperty")
    get() = getSplitScale()
    @JvmName("splitScaleProperty")
    set(`value`) {
      setSplitScale(value)
    }

  /**
   * Curve for the scale over life, along the x axis.
   */
  public final inline var scaleCurveX: Curve?
    @JvmName("scaleCurveXProperty")
    get() = getScaleCurveX()
    @JvmName("scaleCurveXProperty")
    set(`value`) {
      setScaleCurveX(value)
    }

  /**
   * Curve for the scale over life, along the y axis.
   */
  public final inline var scaleCurveY: Curve?
    @JvmName("scaleCurveYProperty")
    get() = getScaleCurveY()
    @JvmName("scaleCurveYProperty")
    set(`value`) {
      setScaleCurveY(value)
    }

  /**
   * Curve for the scale over life, along the z axis.
   */
  public final inline var scaleCurveZ: Curve?
    @JvmName("scaleCurveZProperty")
    get() = getScaleCurveZ()
    @JvmName("scaleCurveZProperty")
    set(`value`) {
      setScaleCurveZ(value)
    }

  /**
   * Each particle's initial color.
   * **Note:** [color] multiplies the particle mesh's vertex colors. To have a visible effect on a
   * [BaseMaterial3D], [BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a
   * [ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function.
   * Otherwise, [color] will have no visible effect.
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
   * Each particle's color will vary along this [GradientTexture1D] over its lifetime (multiplied
   * with [color]).
   * **Note:** [colorRamp] multiplies the particle mesh's vertex colors. To have a visible effect on
   * a [BaseMaterial3D], [BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a
   * [ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function.
   * Otherwise, [colorRamp] will have no visible effect.
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
   * **Note:** [colorInitialRamp] multiplies the particle mesh's vertex colors. To have a visible
   * effect on a [BaseMaterial3D], [BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a
   * [ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function.
   * Otherwise, [colorInitialRamp] will have no visible effect.
   */
  public final inline var colorInitialRamp: Gradient?
    @JvmName("colorInitialRampProperty")
    get() = getColorInitialRamp()
    @JvmName("colorInitialRampProperty")
    set(`value`) {
      setColorInitialRamp(value)
    }

  /**
   * Minimum hue variation.
   */
  public final inline var hueVariationMin: Float
    @JvmName("hueVariationMinProperty")
    get() = getParamMin(CPUParticles3D.Parameter.PARAM_HUE_VARIATION)
    @JvmName("hueVariationMinProperty")
    set(`value`) {
      setParamMin(CPUParticles3D.Parameter.PARAM_HUE_VARIATION, value)
    }

  /**
   * Maximum hue variation.
   */
  public final inline var hueVariationMax: Float
    @JvmName("hueVariationMaxProperty")
    get() = getParamMax(CPUParticles3D.Parameter.PARAM_HUE_VARIATION)
    @JvmName("hueVariationMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles3D.Parameter.PARAM_HUE_VARIATION, value)
    }

  /**
   * Each particle's hue will vary along this [Curve].
   */
  public final inline var hueVariationCurve: Curve?
    @JvmName("hueVariationCurveProperty")
    get() = getParamCurve(CPUParticles3D.Parameter.PARAM_HUE_VARIATION)
    @JvmName("hueVariationCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles3D.Parameter.PARAM_HUE_VARIATION, value)
    }

  /**
   * Minimum particle animation speed.
   */
  public final inline var animSpeedMin: Float
    @JvmName("animSpeedMinProperty")
    get() = getParamMin(CPUParticles3D.Parameter.PARAM_ANIM_SPEED)
    @JvmName("animSpeedMinProperty")
    set(`value`) {
      setParamMin(CPUParticles3D.Parameter.PARAM_ANIM_SPEED, value)
    }

  /**
   * Maximum particle animation speed.
   */
  public final inline var animSpeedMax: Float
    @JvmName("animSpeedMaxProperty")
    get() = getParamMax(CPUParticles3D.Parameter.PARAM_ANIM_SPEED)
    @JvmName("animSpeedMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles3D.Parameter.PARAM_ANIM_SPEED, value)
    }

  /**
   * Each particle's animation speed will vary along this [Curve].
   */
  public final inline var animSpeedCurve: Curve?
    @JvmName("animSpeedCurveProperty")
    get() = getParamCurve(CPUParticles3D.Parameter.PARAM_ANIM_SPEED)
    @JvmName("animSpeedCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles3D.Parameter.PARAM_ANIM_SPEED, value)
    }

  /**
   * Minimum animation offset.
   */
  public final inline var animOffsetMin: Float
    @JvmName("animOffsetMinProperty")
    get() = getParamMin(CPUParticles3D.Parameter.PARAM_ANIM_OFFSET)
    @JvmName("animOffsetMinProperty")
    set(`value`) {
      setParamMin(CPUParticles3D.Parameter.PARAM_ANIM_OFFSET, value)
    }

  /**
   * Maximum animation offset.
   */
  public final inline var animOffsetMax: Float
    @JvmName("animOffsetMaxProperty")
    get() = getParamMax(CPUParticles3D.Parameter.PARAM_ANIM_OFFSET)
    @JvmName("animOffsetMaxProperty")
    set(`value`) {
      setParamMax(CPUParticles3D.Parameter.PARAM_ANIM_OFFSET, value)
    }

  /**
   * Each particle's animation offset will vary along this [Curve].
   */
  public final inline var animOffsetCurve: Curve?
    @JvmName("animOffsetCurveProperty")
    get() = getParamCurve(CPUParticles3D.Parameter.PARAM_ANIM_OFFSET)
    @JvmName("animOffsetCurveProperty")
    set(`value`) {
      setParamCurve(CPUParticles3D.Parameter.PARAM_ANIM_OFFSET, value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_CPUPARTICLES3D_INDEX, scriptIndex)
  }

  /**
   * The [AABB] that determines the node's region which needs to be visible on screen for the
   * particle system to be active.
   * Grow the box if particles suddenly appear/disappear when the node enters/exits the screen. The
   * [AABB] can be grown via code or with the **Particles → Generate AABB** editor tool.
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
   * val myCoreType = cpuparticles3d.visibilityAabb
   * //Your changes
   * cpuparticles3d.visibilityAabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun visibilityAabbMutate(block: AABB.() -> Unit): AABB = visibilityAabb.apply{
      block(this)
      visibilityAabb = this
  }


  /**
   * The rectangle's extents if [emissionShape] is set to [EMISSION_SHAPE_BOX].
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
   * val myCoreType = cpuparticles3d.emissionBoxExtents
   * //Your changes
   * cpuparticles3d.emissionBoxExtents = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun emissionBoxExtentsMutate(block: Vector3.() -> Unit): Vector3 =
      emissionBoxExtents.apply{
      block(this)
      emissionBoxExtents = this
  }


  /**
   * The axis of the ring when using the emitter [EMISSION_SHAPE_RING].
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
   * val myCoreType = cpuparticles3d.emissionRingAxis
   * //Your changes
   * cpuparticles3d.emissionRingAxis = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun emissionRingAxisMutate(block: Vector3.() -> Unit): Vector3 =
      emissionRingAxis.apply{
      block(this)
      emissionRingAxis = this
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
   * val myCoreType = cpuparticles3d.direction
   * //Your changes
   * cpuparticles3d.direction = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun directionMutate(block: Vector3.() -> Unit): Vector3 = direction.apply{
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
   * val myCoreType = cpuparticles3d.gravity
   * //Your changes
   * cpuparticles3d.gravity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun gravityMutate(block: Vector3.() -> Unit): Vector3 = gravity.apply{
      block(this)
      gravity = this
  }


  /**
   * Each particle's initial color.
   * **Note:** [color] multiplies the particle mesh's vertex colors. To have a visible effect on a
   * [BaseMaterial3D], [BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a
   * [ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function.
   * Otherwise, [color] will have no visible effect.
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
   * val myCoreType = cpuparticles3d.color
   * //Your changes
   * cpuparticles3d.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  public final fun setEmitting(emitting: Boolean): Unit {
    Internals.writeArguments(BOOL to emitting)
    Internals.callMethod(rawPtr, MethodBindings.setEmittingPtr, NIL)
  }

  public final fun setAmount(amount: Int): Unit {
    Internals.writeArguments(LONG to amount.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setAmountPtr, NIL)
  }

  public final fun setLifetime(secs: Double): Unit {
    Internals.writeArguments(DOUBLE to secs)
    Internals.callMethod(rawPtr, MethodBindings.setLifetimePtr, NIL)
  }

  public final fun setOneShot(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setOneShotPtr, NIL)
  }

  public final fun setPreProcessTime(secs: Double): Unit {
    Internals.writeArguments(DOUBLE to secs)
    Internals.callMethod(rawPtr, MethodBindings.setPreProcessTimePtr, NIL)
  }

  public final fun setExplosivenessRatio(ratio: Float): Unit {
    Internals.writeArguments(DOUBLE to ratio.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setExplosivenessRatioPtr, NIL)
  }

  public final fun setRandomnessRatio(ratio: Float): Unit {
    Internals.writeArguments(DOUBLE to ratio.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRandomnessRatioPtr, NIL)
  }

  public final fun setVisibilityAabb(aabb: AABB): Unit {
    Internals.writeArguments(godot.core.VariantParser.AABB to aabb)
    Internals.callMethod(rawPtr, MethodBindings.setVisibilityAabbPtr, NIL)
  }

  public final fun setLifetimeRandomness(random: Double): Unit {
    Internals.writeArguments(DOUBLE to random)
    Internals.callMethod(rawPtr, MethodBindings.setLifetimeRandomnessPtr, NIL)
  }

  public final fun setUseLocalCoordinates(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setUseLocalCoordinatesPtr, NIL)
  }

  public final fun setFixedFps(fps: Int): Unit {
    Internals.writeArguments(LONG to fps.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setFixedFpsPtr, NIL)
  }

  public final fun setFractionalDelta(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setFractionalDeltaPtr, NIL)
  }

  public final fun setSpeedScale(scale: Double): Unit {
    Internals.writeArguments(DOUBLE to scale)
    Internals.callMethod(rawPtr, MethodBindings.setSpeedScalePtr, NIL)
  }

  public final fun isEmitting(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isEmittingPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun getAmount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAmountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getLifetime(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLifetimePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  public final fun getOneShot(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOneShotPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun getPreProcessTime(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPreProcessTimePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  public final fun getExplosivenessRatio(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getExplosivenessRatioPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getRandomnessRatio(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRandomnessRatioPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getVisibilityAabb(): AABB {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibilityAabbPtr, godot.core.VariantParser.AABB)
    return (Internals.readReturnValue(godot.core.VariantParser.AABB) as AABB)
  }

  public final fun getLifetimeRandomness(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLifetimeRandomnessPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  public final fun getUseLocalCoordinates(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUseLocalCoordinatesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun getFixedFps(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFixedFpsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getFractionalDelta(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFractionalDeltaPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun getSpeedScale(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSpeedScalePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  public final fun setDrawOrder(order: DrawOrder): Unit {
    Internals.writeArguments(LONG to order.id)
    Internals.callMethod(rawPtr, MethodBindings.setDrawOrderPtr, NIL)
  }

  public final fun getDrawOrder(): DrawOrder {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDrawOrderPtr, LONG)
    return CPUParticles3D.DrawOrder.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setMesh(mesh: Mesh?): Unit {
    Internals.writeArguments(OBJECT to mesh)
    Internals.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
  }

  public final fun getMesh(): Mesh? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Mesh?)
  }

  /**
   * Restarts the particle emitter.
   */
  public final fun restart(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.restartPtr, NIL)
  }

  public final fun setDirection(direction: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to direction)
    Internals.callMethod(rawPtr, MethodBindings.setDirectionPtr, NIL)
  }

  public final fun getDirection(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDirectionPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setSpread(degrees: Float): Unit {
    Internals.writeArguments(DOUBLE to degrees.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSpreadPtr, NIL)
  }

  public final fun getSpread(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSpreadPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFlatness(amount: Float): Unit {
    Internals.writeArguments(DOUBLE to amount.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setFlatnessPtr, NIL)
  }

  public final fun getFlatness(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFlatnessPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the minimum value for the given parameter.
   */
  public final fun setParamMin(`param`: Parameter, `value`: Float): Unit {
    Internals.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
  }

  /**
   * Returns the minimum value range for the given parameter.
   */
  public final fun getParamMin(`param`: Parameter): Float {
    Internals.writeArguments(LONG to param.id)
    Internals.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the maximum value for the given parameter.
   */
  public final fun setParamMax(`param`: Parameter, `value`: Float): Unit {
    Internals.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
  }

  /**
   * Returns the maximum value range for the given parameter.
   */
  public final fun getParamMax(`param`: Parameter): Float {
    Internals.writeArguments(LONG to param.id)
    Internals.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the [Curve] of the parameter specified by [Parameter].
   */
  public final fun setParamCurve(`param`: Parameter, curve: Curve?): Unit {
    Internals.writeArguments(LONG to param.id, OBJECT to curve)
    Internals.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
  }

  /**
   * Returns the [Curve] of the parameter specified by [Parameter].
   */
  public final fun getParamCurve(`param`: Parameter): Curve? {
    Internals.writeArguments(LONG to param.id)
    Internals.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setColor(color: Color): Unit {
    Internals.writeArguments(COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
  }

  public final fun getColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setColorRamp(ramp: Gradient?): Unit {
    Internals.writeArguments(OBJECT to ramp)
    Internals.callMethod(rawPtr, MethodBindings.setColorRampPtr, NIL)
  }

  public final fun getColorRamp(): Gradient? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColorRampPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Gradient?)
  }

  public final fun setColorInitialRamp(ramp: Gradient?): Unit {
    Internals.writeArguments(OBJECT to ramp)
    Internals.callMethod(rawPtr, MethodBindings.setColorInitialRampPtr, NIL)
  }

  public final fun getColorInitialRamp(): Gradient? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColorInitialRampPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Gradient?)
  }

  /**
   * Enables or disables the given particle flag (see [ParticleFlags] for options).
   */
  public final fun setParticleFlag(particleFlag: ParticleFlags, enable: Boolean): Unit {
    Internals.writeArguments(LONG to particleFlag.id, BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setParticleFlagPtr, NIL)
  }

  /**
   * Returns the enabled state of the given particle flag (see [ParticleFlags] for options).
   */
  public final fun getParticleFlag(particleFlag: ParticleFlags): Boolean {
    Internals.writeArguments(LONG to particleFlag.id)
    Internals.callMethod(rawPtr, MethodBindings.getParticleFlagPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEmissionShape(shape: EmissionShape): Unit {
    Internals.writeArguments(LONG to shape.id)
    Internals.callMethod(rawPtr, MethodBindings.setEmissionShapePtr, NIL)
  }

  public final fun getEmissionShape(): EmissionShape {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionShapePtr, LONG)
    return CPUParticles3D.EmissionShape.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setEmissionSphereRadius(radius: Float): Unit {
    Internals.writeArguments(DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setEmissionSphereRadiusPtr, NIL)
  }

  public final fun getEmissionSphereRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionSphereRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmissionBoxExtents(extents: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to extents)
    Internals.callMethod(rawPtr, MethodBindings.setEmissionBoxExtentsPtr, NIL)
  }

  public final fun getEmissionBoxExtents(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionBoxExtentsPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setEmissionPoints(array: PackedVector3Array): Unit {
    Internals.writeArguments(PACKED_VECTOR3_ARRAY to array)
    Internals.callMethod(rawPtr, MethodBindings.setEmissionPointsPtr, NIL)
  }

  public final fun getEmissionPoints(): PackedVector3Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionPointsPtr, PACKED_VECTOR3_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  public final fun setEmissionNormals(array: PackedVector3Array): Unit {
    Internals.writeArguments(PACKED_VECTOR3_ARRAY to array)
    Internals.callMethod(rawPtr, MethodBindings.setEmissionNormalsPtr, NIL)
  }

  public final fun getEmissionNormals(): PackedVector3Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionNormalsPtr, PACKED_VECTOR3_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  public final fun setEmissionColors(array: PackedColorArray): Unit {
    Internals.writeArguments(PACKED_COLOR_ARRAY to array)
    Internals.callMethod(rawPtr, MethodBindings.setEmissionColorsPtr, NIL)
  }

  public final fun getEmissionColors(): PackedColorArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionColorsPtr, PACKED_COLOR_ARRAY)
    return (Internals.readReturnValue(PACKED_COLOR_ARRAY) as PackedColorArray)
  }

  public final fun setEmissionRingAxis(axis: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to axis)
    Internals.callMethod(rawPtr, MethodBindings.setEmissionRingAxisPtr, NIL)
  }

  public final fun getEmissionRingAxis(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionRingAxisPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setEmissionRingHeight(height: Float): Unit {
    Internals.writeArguments(DOUBLE to height.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setEmissionRingHeightPtr, NIL)
  }

  public final fun getEmissionRingHeight(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionRingHeightPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmissionRingRadius(radius: Float): Unit {
    Internals.writeArguments(DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setEmissionRingRadiusPtr, NIL)
  }

  public final fun getEmissionRingRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionRingRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmissionRingInnerRadius(innerRadius: Float): Unit {
    Internals.writeArguments(DOUBLE to innerRadius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setEmissionRingInnerRadiusPtr, NIL)
  }

  public final fun getEmissionRingInnerRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionRingInnerRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getGravity(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGravityPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setGravity(accelVec: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to accelVec)
    Internals.callMethod(rawPtr, MethodBindings.setGravityPtr, NIL)
  }

  public final fun getSplitScale(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSplitScalePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSplitScale(splitScale: Boolean): Unit {
    Internals.writeArguments(BOOL to splitScale)
    Internals.callMethod(rawPtr, MethodBindings.setSplitScalePtr, NIL)
  }

  public final fun getScaleCurveX(): Curve? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getScaleCurveXPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setScaleCurveX(scaleCurve: Curve?): Unit {
    Internals.writeArguments(OBJECT to scaleCurve)
    Internals.callMethod(rawPtr, MethodBindings.setScaleCurveXPtr, NIL)
  }

  public final fun getScaleCurveY(): Curve? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getScaleCurveYPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setScaleCurveY(scaleCurve: Curve?): Unit {
    Internals.writeArguments(OBJECT to scaleCurve)
    Internals.callMethod(rawPtr, MethodBindings.setScaleCurveYPtr, NIL)
  }

  public final fun getScaleCurveZ(): Curve? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getScaleCurveZPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setScaleCurveZ(scaleCurve: Curve?): Unit {
    Internals.writeArguments(OBJECT to scaleCurve)
    Internals.callMethod(rawPtr, MethodBindings.setScaleCurveZPtr, NIL)
  }

  /**
   * Sets this node's properties to match a given [GPUParticles3D] node with an assigned
   * [ParticleProcessMaterial].
   */
  public final fun convertFromParticles(particles: Node?): Unit {
    Internals.writeArguments(OBJECT to particles)
    Internals.callMethod(rawPtr, MethodBindings.convertFromParticlesPtr, NIL)
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
     * Use with [setParticleFlag] to set [particleFlagRotateY].
     */
    PARTICLE_FLAG_ROTATE_Y(1),
    /**
     * Use with [setParticleFlag] to set [particleFlagDisableZ].
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
     * Particles will be emitted in a ring or cylinder.
     */
    EMISSION_SHAPE_RING(6),
    /**
     * Represents the size of the [EmissionShape] enum.
     */
    EMISSION_SHAPE_MAX(7),
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
        Internals.getMethodBindPtr("CPUParticles3D", "set_emitting", 2586408642)

    public val setAmountPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_amount", 1286410249)

    public val setLifetimePtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_lifetime", 373806689)

    public val setOneShotPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_one_shot", 2586408642)

    public val setPreProcessTimePtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_pre_process_time", 373806689)

    public val setExplosivenessRatioPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_explosiveness_ratio", 373806689)

    public val setRandomnessRatioPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_randomness_ratio", 373806689)

    public val setVisibilityAabbPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_visibility_aabb", 259215842)

    public val setLifetimeRandomnessPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_lifetime_randomness", 373806689)

    public val setUseLocalCoordinatesPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_use_local_coordinates", 2586408642)

    public val setFixedFpsPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_fixed_fps", 1286410249)

    public val setFractionalDeltaPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_fractional_delta", 2586408642)

    public val setSpeedScalePtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_speed_scale", 373806689)

    public val isEmittingPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "is_emitting", 36873697)

    public val getAmountPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_amount", 3905245786)

    public val getLifetimePtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_lifetime", 1740695150)

    public val getOneShotPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_one_shot", 36873697)

    public val getPreProcessTimePtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_pre_process_time", 1740695150)

    public val getExplosivenessRatioPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_explosiveness_ratio", 1740695150)

    public val getRandomnessRatioPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_randomness_ratio", 1740695150)

    public val getVisibilityAabbPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_visibility_aabb", 1068685055)

    public val getLifetimeRandomnessPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_lifetime_randomness", 1740695150)

    public val getUseLocalCoordinatesPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_use_local_coordinates", 36873697)

    public val getFixedFpsPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_fixed_fps", 3905245786)

    public val getFractionalDeltaPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_fractional_delta", 36873697)

    public val getSpeedScalePtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_speed_scale", 1740695150)

    public val setDrawOrderPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_draw_order", 1427401774)

    public val getDrawOrderPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_draw_order", 1321900776)

    public val setMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_mesh", 194775623)

    public val getMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_mesh", 1808005922)

    public val restartPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "restart", 3218959716)

    public val setDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_direction", 3460891852)

    public val getDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_direction", 3360562783)

    public val setSpreadPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_spread", 373806689)

    public val getSpreadPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_spread", 1740695150)

    public val setFlatnessPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_flatness", 373806689)

    public val getFlatnessPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_flatness", 1740695150)

    public val setParamMinPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_param_min", 557936109)

    public val getParamMinPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_param_min", 597646162)

    public val setParamMaxPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_param_max", 557936109)

    public val getParamMaxPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_param_max", 597646162)

    public val setParamCurvePtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_param_curve", 4044142537)

    public val getParamCurvePtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_param_curve", 4132790277)

    public val setColorPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_color", 2920490490)

    public val getColorPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_color", 3444240500)

    public val setColorRampPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_color_ramp", 2756054477)

    public val getColorRampPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_color_ramp", 132272999)

    public val setColorInitialRampPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_color_initial_ramp", 2756054477)

    public val getColorInitialRampPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_color_initial_ramp", 132272999)

    public val setParticleFlagPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_particle_flag", 3515406498)

    public val getParticleFlagPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_particle_flag", 2845201987)

    public val setEmissionShapePtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_emission_shape", 491823814)

    public val getEmissionShapePtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_emission_shape", 2961454842)

    public val setEmissionSphereRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_emission_sphere_radius", 373806689)

    public val getEmissionSphereRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_emission_sphere_radius", 1740695150)

    public val setEmissionBoxExtentsPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_emission_box_extents", 3460891852)

    public val getEmissionBoxExtentsPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_emission_box_extents", 3360562783)

    public val setEmissionPointsPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_emission_points", 334873810)

    public val getEmissionPointsPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_emission_points", 497664490)

    public val setEmissionNormalsPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_emission_normals", 334873810)

    public val getEmissionNormalsPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_emission_normals", 497664490)

    public val setEmissionColorsPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_emission_colors", 3546319833)

    public val getEmissionColorsPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_emission_colors", 1392750486)

    public val setEmissionRingAxisPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_emission_ring_axis", 3460891852)

    public val getEmissionRingAxisPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_emission_ring_axis", 3360562783)

    public val setEmissionRingHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_emission_ring_height", 373806689)

    public val getEmissionRingHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_emission_ring_height", 1740695150)

    public val setEmissionRingRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_emission_ring_radius", 373806689)

    public val getEmissionRingRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_emission_ring_radius", 1740695150)

    public val setEmissionRingInnerRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_emission_ring_inner_radius", 373806689)

    public val getEmissionRingInnerRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_emission_ring_inner_radius", 1740695150)

    public val getGravityPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_gravity", 3360562783)

    public val setGravityPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_gravity", 3460891852)

    public val getSplitScalePtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_split_scale", 2240911060)

    public val setSplitScalePtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_split_scale", 2586408642)

    public val getScaleCurveXPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_scale_curve_x", 2460114913)

    public val setScaleCurveXPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_scale_curve_x", 270443179)

    public val getScaleCurveYPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_scale_curve_y", 2460114913)

    public val setScaleCurveYPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_scale_curve_y", 270443179)

    public val getScaleCurveZPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "get_scale_curve_z", 2460114913)

    public val setScaleCurveZPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "set_scale_curve_z", 270443179)

    public val convertFromParticlesPtr: VoidPtr =
        Internals.getMethodBindPtr("CPUParticles3D", "convert_from_particles", 1078189570)
  }
}
