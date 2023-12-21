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
import godot.core.PackedVector3Array
import godot.core.TypeManager
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
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

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
  public val finished: Signal0 by signal()

  /**
   * If `true`, particles are being emitted. [emitting] can be used to start and stop particles from
   * emitting. However, if [oneShot] is `true` setting [emitting] to `true` will not restart the
   * emission cycle until after all active particles finish processing. You can use the [signal
   * finished] signal to be notified once all active particles finish processing.
   */
  public var emitting: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEmittingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmittingPtr, NIL)
    }

  /**
   * Number of particles emitted in one emission cycle.
   */
  public var amount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setAmountPtr, NIL)
    }

  /**
   * Amount of time each particle will exist.
   */
  public var lifetime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLifetimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLifetimePtr, NIL)
    }

  /**
   * If `true`, only one emission cycle occurs. If set `true` during a cycle, emission will stop at
   * the cycle's end.
   */
  public var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOneShotPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOneShotPtr, NIL)
    }

  /**
   * Particle system starts as if it had already run for this many seconds.
   */
  public var preprocess: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPreProcessTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPreProcessTimePtr, NIL)
    }

  /**
   * Particle system's running speed scaling ratio. A value of `0` can be used to pause the
   * particles.
   */
  public var speedScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpeedScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpeedScalePtr, NIL)
    }

  /**
   * How rapidly particles in an emission cycle are emitted. If greater than `0`, there will be a
   * gap in emissions before the next cycle begins.
   */
  public var explosiveness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExplosivenessRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExplosivenessRatioPtr, NIL)
    }

  /**
   * Emission lifetime randomness ratio.
   */
  public var randomness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRandomnessRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRandomnessRatioPtr, NIL)
    }

  /**
   * Particle lifetime randomness ratio.
   */
  public var lifetimeRandomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLifetimeRandomnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLifetimeRandomnessPtr, NIL)
    }

  /**
   * The particle system's frame rate is fixed to a value. For example, changing the value to 2 will
   * make the particles render at 2 frames per second. Note this does not slow down the particle system
   * itself.
   */
  public var fixedFps: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFixedFpsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFixedFpsPtr, NIL)
    }

  /**
   * If `true`, results in fractional delta calculation which has a smoother particles display
   * effect.
   */
  public var fractDelta: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFractionalDeltaPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFractionalDeltaPtr, NIL)
    }

  /**
   * If `true`, particles use the parent node's coordinate space (known as local coordinates). This
   * will cause particles to move and rotate along the [CPUParticles3D] node (and its parents) when it
   * is moved or rotated. If `false`, particles use global coordinates; they will not move or rotate
   * along the [CPUParticles3D] node (and its parents) when it is moved or rotated.
   */
  public var localCoords: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseLocalCoordinatesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseLocalCoordinatesPtr, NIL)
    }

  /**
   * Particle draw order. Uses [DrawOrder] values.
   */
  public var drawOrder: DrawOrder
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawOrderPtr, LONG)
      return CPUParticles3D.DrawOrder.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawOrderPtr, NIL)
    }

  /**
   * The [Mesh] used for each particle. If `null`, particles will be spheres.
   */
  public var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
    }

  /**
   * Particles will be emitted inside this region. See [EmissionShape] for possible values.
   */
  public var emissionShape: EmissionShape
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionShapePtr, LONG)
      return CPUParticles3D.EmissionShape.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionShapePtr, NIL)
    }

  /**
   * The sphere's radius if [EmissionShape] is set to [EMISSIONSHAPESPHERE].
   */
  public var emissionSphereRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionSphereRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionSphereRadiusPtr, NIL)
    }

  /**
   * The rectangle's extents if [emissionShape] is set to [EMISSIONSHAPEBOX].
   */
  @CoreTypeLocalCopy
  public var emissionBoxExtents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionBoxExtentsPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionBoxExtentsPtr, NIL)
    }

  /**
   * Sets the initial positions to spawn particles when using [EMISSIONSHAPEPOINTS] or
   * [EMISSIONSHAPEDIRECTEDPOINTS].
   */
  public var emissionPoints: PackedVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionPointsPtr, PACKED_VECTOR3_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionPointsPtr, NIL)
    }

  /**
   * Sets the direction the particles will be emitted in when using [EMISSIONSHAPEDIRECTEDPOINTS].
   */
  public var emissionNormals: PackedVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionNormalsPtr, PACKED_VECTOR3_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionNormalsPtr, NIL)
    }

  /**
   * Sets the [Color]s to modulate particles by when using [EMISSIONSHAPEPOINTS] or
   * [EMISSIONSHAPEDIRECTEDPOINTS].
   * **Note:** [emissionColors] multiplies the particle mesh's vertex colors. To have a visible
   * effect on a [BaseMaterial3D], [BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a
   * [ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function.
   * Otherwise, [emissionColors] will have no visible effect.
   */
  public var emissionColors: PackedColorArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionColorsPtr, PACKED_COLOR_ARRAY)
      return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_COLOR_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionColorsPtr, NIL)
    }

  /**
   * The axis of the ring when using the emitter [EMISSIONSHAPERING].
   */
  @CoreTypeLocalCopy
  public var emissionRingAxis: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionRingAxisPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionRingAxisPtr, NIL)
    }

  /**
   * The height of the ring when using the emitter [EMISSIONSHAPERING].
   */
  public var emissionRingHeight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionRingHeightPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionRingHeightPtr, NIL)
    }

  /**
   * The radius of the ring when using the emitter [EMISSIONSHAPERING].
   */
  public var emissionRingRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionRingRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionRingRadiusPtr, NIL)
    }

  /**
   * The inner radius of the ring when using the emitter [EMISSIONSHAPERING].
   */
  public var emissionRingInnerRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionRingInnerRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionRingInnerRadiusPtr, NIL)
    }

  /**
   * Align Y axis of particle with the direction of its velocity.
   */
  public var particleFlagAlignY: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParticleFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParticleFlagPtr, NIL)
    }

  /**
   * If `true`, particles rotate around Y axis by [angleMin].
   */
  public var particleFlagRotateY: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParticleFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParticleFlagPtr, NIL)
    }

  /**
   * If `true`, particles will not move on the Z axis.
   */
  public var particleFlagDisableZ: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParticleFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParticleFlagPtr, NIL)
    }

  /**
   * Unit vector specifying the particles' emission direction.
   */
  @CoreTypeLocalCopy
  public var direction: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDirectionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDirectionPtr, NIL)
    }

  /**
   * Each particle's initial direction range from `+spread` to `-spread` degrees. Applied to X/Z
   * plane and Y/Z planes.
   */
  public var spread: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpreadPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSpreadPtr, NIL)
    }

  /**
   * Amount of [spread] in Y/Z plane. A value of `1` restricts particles to X/Z plane.
   */
  public var flatness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFlatnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFlatnessPtr, NIL)
    }

  /**
   * Gravity applied to every particle.
   */
  @CoreTypeLocalCopy
  public var gravity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityPtr, NIL)
    }

  /**
   * Minimum value of the initial velocity.
   */
  public var initialVelocityMin: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum value of the initial velocity.
   */
  public var initialVelocityMax: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Minimum initial angular velocity (rotation speed) applied to each particle in *degrees* per
   * second.
   */
  public var angularVelocityMin: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum initial angular velocity (rotation speed) applied to each particle in *degrees* per
   * second.
   */
  public var angularVelocityMax: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's angular velocity (rotation speed) will vary along this [Curve] over its
   * lifetime.
   */
  public var angularVelocityCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
    }

  /**
   * Minimum orbit velocity.
   */
  public var orbitVelocityMin: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum orbit velocity.
   */
  public var orbitVelocityMax: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's orbital velocity will vary along this [Curve].
   */
  public var orbitVelocityCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
    }

  /**
   * Minimum linear acceleration.
   */
  public var linearAccelMin: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum linear acceleration.
   */
  public var linearAccelMax: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's linear acceleration will vary along this [Curve].
   */
  public var linearAccelCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
    }

  /**
   * Minimum radial acceleration.
   */
  public var radialAccelMin: Float
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum radial acceleration.
   */
  public var radialAccelMax: Float
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's radial acceleration will vary along this [Curve].
   */
  public var radialAccelCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
    }

  /**
   * Minimum tangent acceleration.
   */
  public var tangentialAccelMin: Float
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum tangent acceleration.
   */
  public var tangentialAccelMax: Float
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's tangential acceleration will vary along this [Curve].
   */
  public var tangentialAccelCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
    }

  /**
   * Minimum damping.
   */
  public var dampingMin: Float
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum damping.
   */
  public var dampingMax: Float
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Damping will vary along this [Curve].
   */
  public var dampingCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
    }

  /**
   * Minimum angle.
   */
  public var angleMin: Float
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum angle.
   */
  public var angleMax: Float
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's rotation will be animated along this [Curve].
   */
  public var angleCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
    }

  /**
   * Minimum scale.
   */
  public var scaleAmountMin: Float
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum scale.
   */
  public var scaleAmountMax: Float
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's scale will vary along this [Curve].
   */
  public var scaleAmountCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
    }

  /**
   * If set to `true`, three different scale curves can be specified, one per scale axis.
   */
  public var splitScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSplitScalePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSplitScalePtr, NIL)
    }

  /**
   * Curve for the scale over life, along the x axis.
   */
  public var scaleCurveX: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScaleCurveXPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScaleCurveXPtr, NIL)
    }

  /**
   * Curve for the scale over life, along the y axis.
   */
  public var scaleCurveY: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScaleCurveYPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScaleCurveYPtr, NIL)
    }

  /**
   * Curve for the scale over life, along the z axis.
   */
  public var scaleCurveZ: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScaleCurveZPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScaleCurveZPtr, NIL)
    }

  /**
   * Each particle's initial color.
   * **Note:** [color] multiplies the particle mesh's vertex colors. To have a visible effect on a
   * [BaseMaterial3D], [BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a
   * [ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function.
   * Otherwise, [color] will have no visible effect.
   */
  @CoreTypeLocalCopy
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
    }

  /**
   * Each particle's color will vary along this [GradientTexture1D] over its lifetime (multiplied
   * with [color]).
   * **Note:** [colorRamp] multiplies the particle mesh's vertex colors. To have a visible effect on
   * a [BaseMaterial3D], [BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a
   * [ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function.
   * Otherwise, [colorRamp] will have no visible effect.
   */
  public var colorRamp: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorRampPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Gradient?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorRampPtr, NIL)
    }

  /**
   * Each particle's initial color will vary along this [GradientTexture1D] (multiplied with
   * [color]).
   * **Note:** [colorInitialRamp] multiplies the particle mesh's vertex colors. To have a visible
   * effect on a [BaseMaterial3D], [BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a
   * [ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function.
   * Otherwise, [colorInitialRamp] will have no visible effect.
   */
  public var colorInitialRamp: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorInitialRampPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Gradient?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorInitialRampPtr, NIL)
    }

  /**
   * Minimum hue variation.
   */
  public var hueVariationMin: Float
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum hue variation.
   */
  public var hueVariationMax: Float
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's hue will vary along this [Curve].
   */
  public var hueVariationCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
    }

  /**
   * Minimum particle animation speed.
   */
  public var animSpeedMin: Float
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum particle animation speed.
   */
  public var animSpeedMax: Float
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's animation speed will vary along this [Curve].
   */
  public var animSpeedCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
    }

  /**
   * Minimum animation offset.
   */
  public var animOffsetMin: Float
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum animation offset.
   */
  public var animOffsetMax: Float
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's animation offset will vary along this [Curve].
   */
  public var animOffsetCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CPUPARTICLES3D, scriptIndex)
    return true
  }

  /**
   * The rectangle's extents if [emissionShape] is set to [EMISSIONSHAPEBOX].
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
  public open fun emissionBoxExtentsMutate(block: Vector3.() -> Unit): Vector3 =
      emissionBoxExtents.apply{
      block(this)
      emissionBoxExtents = this
  }


  /**
   * The axis of the ring when using the emitter [EMISSIONSHAPERING].
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
  public open fun emissionRingAxisMutate(block: Vector3.() -> Unit): Vector3 =
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
  public open fun directionMutate(block: Vector3.() -> Unit): Vector3 = direction.apply{
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
  public open fun gravityMutate(block: Vector3.() -> Unit): Vector3 = gravity.apply{
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
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  /**
   * Restarts the particle emitter.
   */
  public fun restart(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.restartPtr, NIL)
  }

  /**
   * Sets this node's properties to match a given [GPUParticles3D] node with an assigned
   * [ParticleProcessMaterial].
   */
  public fun convertFromParticles(particles: Node): Unit {
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_emitting")

    public val setAmountPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles3D", "set_amount")

    public val setLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_lifetime")

    public val setOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_one_shot")

    public val setPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_pre_process_time")

    public val setExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_explosiveness_ratio")

    public val setRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_randomness_ratio")

    public val setLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_lifetime_randomness")

    public val setUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_use_local_coordinates")

    public val setFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_fixed_fps")

    public val setFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_fractional_delta")

    public val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_speed_scale")

    public val isEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "is_emitting")

    public val getAmountPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles3D", "get_amount")

    public val getLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_lifetime")

    public val getOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_one_shot")

    public val getPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_pre_process_time")

    public val getExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_explosiveness_ratio")

    public val getRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_randomness_ratio")

    public val getLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_lifetime_randomness")

    public val getUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_use_local_coordinates")

    public val getFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_fixed_fps")

    public val getFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_fractional_delta")

    public val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_speed_scale")

    public val setDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_draw_order")

    public val getDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_draw_order")

    public val setMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles3D", "set_mesh")

    public val getMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles3D", "get_mesh")

    public val restartPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles3D", "restart")

    public val setDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_direction")

    public val getDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_direction")

    public val setSpreadPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles3D", "set_spread")

    public val getSpreadPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles3D", "get_spread")

    public val setFlatnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_flatness")

    public val getFlatnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_flatness")

    public val setParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_param_min")

    public val getParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_param_min")

    public val setParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_param_max")

    public val getParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_param_max")

    public val setParamCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_param_curve")

    public val getParamCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_param_curve")

    public val setColorPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles3D", "set_color")

    public val getColorPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles3D", "get_color")

    public val setColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_color_ramp")

    public val getColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_color_ramp")

    public val setColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_color_initial_ramp")

    public val getColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_color_initial_ramp")

    public val setParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_particle_flag")

    public val getParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_particle_flag")

    public val setEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_emission_shape")

    public val getEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_emission_shape")

    public val setEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_emission_sphere_radius")

    public val getEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_emission_sphere_radius")

    public val setEmissionBoxExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_emission_box_extents")

    public val getEmissionBoxExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_emission_box_extents")

    public val setEmissionPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_emission_points")

    public val getEmissionPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_emission_points")

    public val setEmissionNormalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_emission_normals")

    public val getEmissionNormalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_emission_normals")

    public val setEmissionColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_emission_colors")

    public val getEmissionColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_emission_colors")

    public val setEmissionRingAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_emission_ring_axis")

    public val getEmissionRingAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_emission_ring_axis")

    public val setEmissionRingHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_emission_ring_height")

    public val getEmissionRingHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_emission_ring_height")

    public val setEmissionRingRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_emission_ring_radius")

    public val getEmissionRingRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_emission_ring_radius")

    public val setEmissionRingInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_emission_ring_inner_radius")

    public val getEmissionRingInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_emission_ring_inner_radius")

    public val getGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_gravity")

    public val setGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_gravity")

    public val getSplitScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_split_scale")

    public val setSplitScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_split_scale")

    public val getScaleCurveXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_scale_curve_x")

    public val setScaleCurveXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_scale_curve_x")

    public val getScaleCurveYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_scale_curve_y")

    public val setScaleCurveYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_scale_curve_y")

    public val getScaleCurveZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "get_scale_curve_z")

    public val setScaleCurveZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "set_scale_curve_z")

    public val convertFromParticlesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles3D", "convert_from_particles")
  }
}
