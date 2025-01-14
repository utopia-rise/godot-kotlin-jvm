// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [ParticleProcessMaterial] defines particle properties and behavior. It is used in the
 * `process_material` of the [GPUParticles2D] and [GPUParticles3D] nodes. Some of this material's
 * properties are applied to each particle when emitted, while others can have a [CurveTexture] or a
 * [GradientTexture1D] applied to vary numerical or color values over the lifetime of the particle.
 */
@GodotBaseType
public open class ParticleProcessMaterial : Material() {
  /**
   * Particle lifetime randomness ratio. The equation for the lifetime of a particle is `lifetime *
   * (1.0 - randf() * lifetime_randomness)`. For example, a [lifetimeRandomness] of `0.4` scales the
   * lifetime between `0.6` to `1.0` of its original value.
   */
  public final inline var lifetimeRandomness: Double
    @JvmName("lifetimeRandomnessProperty")
    get() = getLifetimeRandomness()
    @JvmName("lifetimeRandomnessProperty")
    set(`value`) {
      setLifetimeRandomness(value)
    }

  /**
   * Align Y axis of particle with the direction of its velocity.
   */
  public final inline var particleFlagAlignY: Boolean
    @JvmName("particleFlagAlignYProperty")
    get() = getParticleFlag(ParticleProcessMaterial.ParticleFlags.PARTICLE_FLAG_ALIGN_Y_TO_VELOCITY)
    @JvmName("particleFlagAlignYProperty")
    set(`value`) {
      setParticleFlag(ParticleProcessMaterial.ParticleFlags.PARTICLE_FLAG_ALIGN_Y_TO_VELOCITY,
          value)
    }

  /**
   * If `true`, particles rotate around Y axis by [angleMin].
   */
  public final inline var particleFlagRotateY: Boolean
    @JvmName("particleFlagRotateYProperty")
    get() = getParticleFlag(ParticleProcessMaterial.ParticleFlags.PARTICLE_FLAG_ROTATE_Y)
    @JvmName("particleFlagRotateYProperty")
    set(`value`) {
      setParticleFlag(ParticleProcessMaterial.ParticleFlags.PARTICLE_FLAG_ROTATE_Y, value)
    }

  /**
   * If `true`, particles will not move on the z axis.
   */
  public final inline var particleFlagDisableZ: Boolean
    @JvmName("particleFlagDisableZProperty")
    get() = getParticleFlag(ParticleProcessMaterial.ParticleFlags.PARTICLE_FLAG_DISABLE_Z)
    @JvmName("particleFlagDisableZProperty")
    set(`value`) {
      setParticleFlag(ParticleProcessMaterial.ParticleFlags.PARTICLE_FLAG_DISABLE_Z, value)
    }

  /**
   * Changes the behavior of the damping properties from a linear deceleration to a deceleration
   * based on speed percentage.
   */
  public final inline var particleFlagDampingAsFriction: Boolean
    @JvmName("particleFlagDampingAsFrictionProperty")
    get() = getParticleFlag(ParticleProcessMaterial.ParticleFlags.PARTICLE_FLAG_DAMPING_AS_FRICTION)
    @JvmName("particleFlagDampingAsFrictionProperty")
    set(`value`) {
      setParticleFlag(ParticleProcessMaterial.ParticleFlags.PARTICLE_FLAG_DAMPING_AS_FRICTION,
          value)
    }

  /**
   * The offset for the [emissionShape], in local space.
   */
  @CoreTypeLocalCopy
  public final inline var emissionShapeOffset: Vector3
    @JvmName("emissionShapeOffsetProperty")
    get() = getEmissionShapeOffset()
    @JvmName("emissionShapeOffsetProperty")
    set(`value`) {
      setEmissionShapeOffset(value)
    }

  /**
   * The scale of the [emissionShape], in local space.
   */
  @CoreTypeLocalCopy
  public final inline var emissionShapeScale: Vector3
    @JvmName("emissionShapeScaleProperty")
    get() = getEmissionShapeScale()
    @JvmName("emissionShapeScaleProperty")
    set(`value`) {
      setEmissionShapeScale(value)
    }

  /**
   * Particles will be emitted inside this region. Use [EmissionShape] constants for values.
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
   * The box's extents if [emissionShape] is set to [EMISSION_SHAPE_BOX].
   * **Note:** [emissionBoxExtents] starts from the center point and applies the X, Y, and Z values
   * in both directions. The size is twice the area of the extents.
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
   * Particles will be emitted at positions determined by sampling this texture at a random
   * position. Used with [EMISSION_SHAPE_POINTS] and [EMISSION_SHAPE_DIRECTED_POINTS]. Can be created
   * automatically from mesh or node by selecting "Create Emission Points from Mesh/Node" under the
   * "Particles" tool in the toolbar.
   */
  public final inline var emissionPointTexture: Texture2D?
    @JvmName("emissionPointTextureProperty")
    get() = getEmissionPointTexture()
    @JvmName("emissionPointTextureProperty")
    set(`value`) {
      setEmissionPointTexture(value)
    }

  /**
   * Particle velocity and rotation will be set by sampling this texture at the same point as the
   * [emissionPointTexture]. Used only in [EMISSION_SHAPE_DIRECTED_POINTS]. Can be created
   * automatically from mesh or node by selecting "Create Emission Points from Mesh/Node" under the
   * "Particles" tool in the toolbar.
   */
  public final inline var emissionNormalTexture: Texture2D?
    @JvmName("emissionNormalTextureProperty")
    get() = getEmissionNormalTexture()
    @JvmName("emissionNormalTextureProperty")
    set(`value`) {
      setEmissionNormalTexture(value)
    }

  /**
   * Particle color will be modulated by color determined by sampling this texture at the same point
   * as the [emissionPointTexture].
   * **Note:** [emissionColorTexture] multiplies the particle mesh's vertex colors. To have a
   * visible effect on a [BaseMaterial3D], [BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`.
   * For a [ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()`
   * function. Otherwise, [emissionColorTexture] will have no visible effect.
   */
  public final inline var emissionColorTexture: Texture2D?
    @JvmName("emissionColorTextureProperty")
    get() = getEmissionColorTexture()
    @JvmName("emissionColorTextureProperty")
    set(`value`) {
      setEmissionColorTexture(value)
    }

  /**
   * The number of emission points if [emissionShape] is set to [EMISSION_SHAPE_POINTS] or
   * [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public final inline var emissionPointCount: Int
    @JvmName("emissionPointCountProperty")
    get() = getEmissionPointCount()
    @JvmName("emissionPointCountProperty")
    set(`value`) {
      setEmissionPointCount(value)
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

  @CoreTypeLocalCopy
  public final inline var angle: Vector2
    @JvmName("angleProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_ANGLE)
    @JvmName("angleProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_ANGLE, value)
    }

  /**
   * Minimum equivalent of [angleMax].
   */
  public final inline var angleMin: Float
    @JvmName("angleMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_ANGLE)
    @JvmName("angleMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_ANGLE, value)
    }

  /**
   * Maximum initial rotation applied to each particle, in degrees.
   * Only applied when [particleFlagDisableZ] or [particleFlagRotateY] are `true` or the
   * [BaseMaterial3D] being used to draw the particle is using [BaseMaterial3D.BILLBOARD_PARTICLES].
   */
  public final inline var angleMax: Float
    @JvmName("angleMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_ANGLE)
    @JvmName("angleMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_ANGLE, value)
    }

  /**
   * Each particle's rotation will be animated along this [CurveTexture].
   */
  public final inline var angleCurve: Texture2D?
    @JvmName("angleCurveProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_ANGLE)
    @JvmName("angleCurveProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_ANGLE, value)
    }

  /**
   * Percentage of the velocity of the respective [GPUParticles2D] or [GPUParticles3D] inherited by
   * each particle when spawning.
   */
  public final inline var inheritVelocityRatio: Double
    @JvmName("inheritVelocityRatioProperty")
    get() = getInheritVelocityRatio()
    @JvmName("inheritVelocityRatioProperty")
    set(`value`) {
      setInheritVelocityRatio(value)
    }

  /**
   * A pivot point used to calculate radial and orbital velocity of particles.
   */
  @CoreTypeLocalCopy
  public final inline var velocityPivot: Vector3
    @JvmName("velocityPivotProperty")
    get() = getVelocityPivot()
    @JvmName("velocityPivotProperty")
    set(`value`) {
      setVelocityPivot(value)
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
   * Amount of [spread] along the Y axis.
   */
  public final inline var flatness: Float
    @JvmName("flatnessProperty")
    get() = getFlatness()
    @JvmName("flatnessProperty")
    set(`value`) {
      setFlatness(value)
    }

  @CoreTypeLocalCopy
  public final inline var initialVelocity: Vector2
    @JvmName("initialVelocityProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_INITIAL_LINEAR_VELOCITY)
    @JvmName("initialVelocityProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_INITIAL_LINEAR_VELOCITY, value)
    }

  /**
   * Minimum equivalent of [initialVelocityMax].
   */
  public final inline var initialVelocityMin: Float
    @JvmName("initialVelocityMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_INITIAL_LINEAR_VELOCITY)
    @JvmName("initialVelocityMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_INITIAL_LINEAR_VELOCITY, value)
    }

  /**
   * Maximum initial velocity magnitude for each particle. Direction comes from [direction] and
   * [spread].
   */
  public final inline var initialVelocityMax: Float
    @JvmName("initialVelocityMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_INITIAL_LINEAR_VELOCITY)
    @JvmName("initialVelocityMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_INITIAL_LINEAR_VELOCITY, value)
    }

  @CoreTypeLocalCopy
  public final inline var angularVelocity: Vector2
    @JvmName("angularVelocityProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_ANGULAR_VELOCITY)
    @JvmName("angularVelocityProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_ANGULAR_VELOCITY, value)
    }

  /**
   * Minimum equivalent of [angularVelocityMax].
   */
  public final inline var angularVelocityMin: Float
    @JvmName("angularVelocityMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_ANGULAR_VELOCITY)
    @JvmName("angularVelocityMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_ANGULAR_VELOCITY, value)
    }

  /**
   * Maximum initial angular velocity (rotation speed) applied to each particle in *degrees* per
   * second.
   * Only applied when [particleFlagDisableZ] or [particleFlagRotateY] are `true` or the
   * [BaseMaterial3D] being used to draw the particle is using [BaseMaterial3D.BILLBOARD_PARTICLES].
   */
  public final inline var angularVelocityMax: Float
    @JvmName("angularVelocityMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_ANGULAR_VELOCITY)
    @JvmName("angularVelocityMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_ANGULAR_VELOCITY, value)
    }

  /**
   * Each particle's angular velocity (rotation speed) will vary along this [CurveTexture] over its
   * lifetime.
   */
  public final inline var angularVelocityCurve: Texture2D?
    @JvmName("angularVelocityCurveProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_ANGULAR_VELOCITY)
    @JvmName("angularVelocityCurveProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_ANGULAR_VELOCITY, value)
    }

  @CoreTypeLocalCopy
  public final inline var directionalVelocity: Vector2
    @JvmName("directionalVelocityProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_DIRECTIONAL_VELOCITY)
    @JvmName("directionalVelocityProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_DIRECTIONAL_VELOCITY, value)
    }

  /**
   * Minimum directional velocity value, which is multiplied by [directionalVelocityCurve].
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public final inline var directionalVelocityMin: Float
    @JvmName("directionalVelocityMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_DIRECTIONAL_VELOCITY)
    @JvmName("directionalVelocityMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_DIRECTIONAL_VELOCITY, value)
    }

  /**
   * Maximum directional velocity value, which is multiplied by [directionalVelocityCurve].
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public final inline var directionalVelocityMax: Float
    @JvmName("directionalVelocityMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_DIRECTIONAL_VELOCITY)
    @JvmName("directionalVelocityMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_DIRECTIONAL_VELOCITY, value)
    }

  /**
   * A curve that specifies the velocity along each of the axes of the particle system along its
   * lifetime.
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public final inline var directionalVelocityCurve: Texture2D?
    @JvmName("directionalVelocityCurveProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_DIRECTIONAL_VELOCITY)
    @JvmName("directionalVelocityCurveProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_DIRECTIONAL_VELOCITY, value)
    }

  @CoreTypeLocalCopy
  public final inline var orbitVelocity: Vector2
    @JvmName("orbitVelocityProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_ORBIT_VELOCITY)
    @JvmName("orbitVelocityProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_ORBIT_VELOCITY, value)
    }

  /**
   * Minimum equivalent of [orbitVelocityMax].
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public final inline var orbitVelocityMin: Float
    @JvmName("orbitVelocityMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_ORBIT_VELOCITY)
    @JvmName("orbitVelocityMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_ORBIT_VELOCITY, value)
    }

  /**
   * Maximum orbital velocity applied to each particle. Makes the particles circle around origin.
   * Specified in number of full rotations around origin per second.
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public final inline var orbitVelocityMax: Float
    @JvmName("orbitVelocityMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_ORBIT_VELOCITY)
    @JvmName("orbitVelocityMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_ORBIT_VELOCITY, value)
    }

  /**
   * Each particle's orbital velocity will vary along this [CurveTexture].
   * **Note:** For 3D orbital velocity, use a [CurveXYZTexture].
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public final inline var orbitVelocityCurve: Texture2D?
    @JvmName("orbitVelocityCurveProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_ORBIT_VELOCITY)
    @JvmName("orbitVelocityCurveProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_ORBIT_VELOCITY, value)
    }

  @CoreTypeLocalCopy
  public final inline var radialVelocity: Vector2
    @JvmName("radialVelocityProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_RADIAL_VELOCITY)
    @JvmName("radialVelocityProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_RADIAL_VELOCITY, value)
    }

  /**
   * Minimum radial velocity applied to each particle. Makes particles move away from the
   * [velocityPivot], or toward it if negative.
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public final inline var radialVelocityMin: Float
    @JvmName("radialVelocityMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_RADIAL_VELOCITY)
    @JvmName("radialVelocityMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_RADIAL_VELOCITY, value)
    }

  /**
   * Maximum radial velocity applied to each particle. Makes particles move away from the
   * [velocityPivot], or toward it if negative.
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public final inline var radialVelocityMax: Float
    @JvmName("radialVelocityMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_RADIAL_VELOCITY)
    @JvmName("radialVelocityMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_RADIAL_VELOCITY, value)
    }

  /**
   * A [CurveTexture] that defines the velocity over the particle's lifetime away (or toward) the
   * [velocityPivot].
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public final inline var radialVelocityCurve: Texture2D?
    @JvmName("radialVelocityCurveProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_RADIAL_VELOCITY)
    @JvmName("radialVelocityCurveProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_RADIAL_VELOCITY, value)
    }

  /**
   * A [CurveTexture] that defines the maximum velocity of a particle during its lifetime.
   */
  public final inline var velocityLimitCurve: Texture2D?
    @JvmName("velocityLimitCurveProperty")
    get() = getVelocityLimitCurve()
    @JvmName("velocityLimitCurveProperty")
    set(`value`) {
      setVelocityLimitCurve(value)
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

  @CoreTypeLocalCopy
  public final inline var linearAccel: Vector2
    @JvmName("linearAccelProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_LINEAR_ACCEL)
    @JvmName("linearAccelProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_LINEAR_ACCEL, value)
    }

  /**
   * Minimum equivalent of [linearAccelMax].
   */
  public final inline var linearAccelMin: Float
    @JvmName("linearAccelMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_LINEAR_ACCEL)
    @JvmName("linearAccelMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_LINEAR_ACCEL, value)
    }

  /**
   * Maximum linear acceleration applied to each particle in the direction of motion.
   */
  public final inline var linearAccelMax: Float
    @JvmName("linearAccelMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_LINEAR_ACCEL)
    @JvmName("linearAccelMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_LINEAR_ACCEL, value)
    }

  /**
   * Each particle's linear acceleration will vary along this [CurveTexture].
   */
  public final inline var linearAccelCurve: Texture2D?
    @JvmName("linearAccelCurveProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_LINEAR_ACCEL)
    @JvmName("linearAccelCurveProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_LINEAR_ACCEL, value)
    }

  @CoreTypeLocalCopy
  public final inline var radialAccel: Vector2
    @JvmName("radialAccelProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_RADIAL_ACCEL)
    @JvmName("radialAccelProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_RADIAL_ACCEL, value)
    }

  /**
   * Minimum equivalent of [radialAccelMax].
   */
  public final inline var radialAccelMin: Float
    @JvmName("radialAccelMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_RADIAL_ACCEL)
    @JvmName("radialAccelMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_RADIAL_ACCEL, value)
    }

  /**
   * Maximum radial acceleration applied to each particle. Makes particle accelerate away from the
   * origin or towards it if negative.
   */
  public final inline var radialAccelMax: Float
    @JvmName("radialAccelMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_RADIAL_ACCEL)
    @JvmName("radialAccelMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_RADIAL_ACCEL, value)
    }

  /**
   * Each particle's radial acceleration will vary along this [CurveTexture].
   */
  public final inline var radialAccelCurve: Texture2D?
    @JvmName("radialAccelCurveProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_RADIAL_ACCEL)
    @JvmName("radialAccelCurveProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_RADIAL_ACCEL, value)
    }

  @CoreTypeLocalCopy
  public final inline var tangentialAccel: Vector2
    @JvmName("tangentialAccelProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_TANGENTIAL_ACCEL)
    @JvmName("tangentialAccelProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_TANGENTIAL_ACCEL, value)
    }

  /**
   * Minimum equivalent of [tangentialAccelMax].
   */
  public final inline var tangentialAccelMin: Float
    @JvmName("tangentialAccelMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_TANGENTIAL_ACCEL)
    @JvmName("tangentialAccelMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_TANGENTIAL_ACCEL, value)
    }

  /**
   * Maximum tangential acceleration applied to each particle. Tangential acceleration is
   * perpendicular to the particle's velocity giving the particles a swirling motion.
   */
  public final inline var tangentialAccelMax: Float
    @JvmName("tangentialAccelMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_TANGENTIAL_ACCEL)
    @JvmName("tangentialAccelMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_TANGENTIAL_ACCEL, value)
    }

  /**
   * Each particle's tangential acceleration will vary along this [CurveTexture].
   */
  public final inline var tangentialAccelCurve: Texture2D?
    @JvmName("tangentialAccelCurveProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_TANGENTIAL_ACCEL)
    @JvmName("tangentialAccelCurveProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_TANGENTIAL_ACCEL, value)
    }

  @CoreTypeLocalCopy
  public final inline var damping: Vector2
    @JvmName("dampingProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_DAMPING)
    @JvmName("dampingProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_DAMPING, value)
    }

  /**
   * Minimum equivalent of [dampingMax].
   */
  public final inline var dampingMin: Float
    @JvmName("dampingMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_DAMPING)
    @JvmName("dampingMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_DAMPING, value)
    }

  /**
   * The maximum rate at which particles lose velocity. For example value of `100` means that the
   * particle will go from `100` velocity to `0` in `1` second.
   */
  public final inline var dampingMax: Float
    @JvmName("dampingMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_DAMPING)
    @JvmName("dampingMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_DAMPING, value)
    }

  /**
   * Damping will vary along this [CurveTexture].
   */
  public final inline var dampingCurve: Texture2D?
    @JvmName("dampingCurveProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_DAMPING)
    @JvmName("dampingCurveProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_DAMPING, value)
    }

  /**
   * If `true`, interaction with particle attractors is enabled. In 3D, attraction only occurs
   * within the area defined by the [GPUParticles3D] node's [GPUParticles3D.visibilityAabb].
   */
  public final inline var attractorInteractionEnabled: Boolean
    @JvmName("attractorInteractionEnabledProperty")
    get() = isAttractorInteractionEnabled()
    @JvmName("attractorInteractionEnabledProperty")
    set(`value`) {
      setAttractorInteractionEnabled(value)
    }

  @CoreTypeLocalCopy
  public final inline var scale: Vector2
    @JvmName("scaleProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_SCALE)
    @JvmName("scaleProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_SCALE, value)
    }

  /**
   * Minimum equivalent of [scaleMax].
   */
  public final inline var scaleMin: Float
    @JvmName("scaleMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_SCALE)
    @JvmName("scaleMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_SCALE, value)
    }

  /**
   * Maximum initial scale applied to each particle.
   */
  public final inline var scaleMax: Float
    @JvmName("scaleMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_SCALE)
    @JvmName("scaleMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_SCALE, value)
    }

  /**
   * Each particle's scale will vary along this [CurveTexture] over its lifetime. If a
   * [CurveXYZTexture] is supplied instead, the scale will be separated per-axis.
   */
  public final inline var scaleCurve: Texture2D?
    @JvmName("scaleCurveProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_SCALE)
    @JvmName("scaleCurveProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_SCALE, value)
    }

  @CoreTypeLocalCopy
  public final inline var scaleOverVelocity: Vector2
    @JvmName("scaleOverVelocityProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_SCALE_OVER_VELOCITY)
    @JvmName("scaleOverVelocityProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_SCALE_OVER_VELOCITY, value)
    }

  /**
   * Minimum velocity value reference for [scaleOverVelocityCurve].
   * [scaleOverVelocityCurve] will be interpolated between [scaleOverVelocityMin] and
   * [scaleOverVelocityMax].
   */
  public final inline var scaleOverVelocityMin: Float
    @JvmName("scaleOverVelocityMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_SCALE_OVER_VELOCITY)
    @JvmName("scaleOverVelocityMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_SCALE_OVER_VELOCITY, value)
    }

  /**
   * Maximum velocity value reference for [scaleOverVelocityCurve].
   * [scaleOverVelocityCurve] will be interpolated between [scaleOverVelocityMin] and
   * [scaleOverVelocityMax].
   */
  public final inline var scaleOverVelocityMax: Float
    @JvmName("scaleOverVelocityMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_SCALE_OVER_VELOCITY)
    @JvmName("scaleOverVelocityMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_SCALE_OVER_VELOCITY, value)
    }

  /**
   * Either a [CurveTexture] or a [CurveXYZTexture] that scales each particle based on its velocity.
   */
  public final inline var scaleOverVelocityCurve: Texture2D?
    @JvmName("scaleOverVelocityCurveProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_SCALE_OVER_VELOCITY)
    @JvmName("scaleOverVelocityCurveProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_SCALE_OVER_VELOCITY, value)
    }

  /**
   * Each particle's initial color. If the [GPUParticles2D]'s `texture` is defined, it will be
   * multiplied by this color.
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
  public final inline var colorRamp: Texture2D?
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
  public final inline var colorInitialRamp: Texture2D?
    @JvmName("colorInitialRampProperty")
    get() = getColorInitialRamp()
    @JvmName("colorInitialRampProperty")
    set(`value`) {
      setColorInitialRamp(value)
    }

  /**
   * The alpha value of each particle's color will be multiplied by this [CurveTexture] over its
   * lifetime.
   */
  public final inline var alphaCurve: Texture2D?
    @JvmName("alphaCurveProperty")
    get() = getAlphaCurve()
    @JvmName("alphaCurveProperty")
    set(`value`) {
      setAlphaCurve(value)
    }

  /**
   * Each particle's color will be multiplied by this [CurveTexture] over its lifetime.
   * **Note:** This property won't have a visible effect unless the render material is marked as
   * unshaded.
   */
  public final inline var emissionCurve: Texture2D?
    @JvmName("emissionCurveProperty")
    get() = getEmissionCurve()
    @JvmName("emissionCurveProperty")
    set(`value`) {
      setEmissionCurve(value)
    }

  @CoreTypeLocalCopy
  public final inline var hueVariation: Vector2
    @JvmName("hueVariationProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_HUE_VARIATION)
    @JvmName("hueVariationProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_HUE_VARIATION, value)
    }

  /**
   * Minimum equivalent of [hueVariationMax].
   */
  public final inline var hueVariationMin: Float
    @JvmName("hueVariationMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_HUE_VARIATION)
    @JvmName("hueVariationMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_HUE_VARIATION, value)
    }

  /**
   * Maximum initial hue variation applied to each particle. It will shift the particle color's hue.
   */
  public final inline var hueVariationMax: Float
    @JvmName("hueVariationMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_HUE_VARIATION)
    @JvmName("hueVariationMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_HUE_VARIATION, value)
    }

  /**
   * Each particle's hue will vary along this [CurveTexture].
   */
  public final inline var hueVariationCurve: Texture2D?
    @JvmName("hueVariationCurveProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_HUE_VARIATION)
    @JvmName("hueVariationCurveProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_HUE_VARIATION, value)
    }

  @CoreTypeLocalCopy
  public final inline var animSpeed: Vector2
    @JvmName("animSpeedProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_ANIM_SPEED)
    @JvmName("animSpeedProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_ANIM_SPEED, value)
    }

  /**
   * Minimum equivalent of [animSpeedMax].
   */
  public final inline var animSpeedMin: Float
    @JvmName("animSpeedMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_ANIM_SPEED)
    @JvmName("animSpeedMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_ANIM_SPEED, value)
    }

  /**
   * Maximum particle animation speed. Animation speed of `1` means that the particles will make
   * full `0` to `1` offset cycle during lifetime, `2` means `2` cycles etc.
   * With animation speed greater than `1`, remember to enable
   * [CanvasItemMaterial.particlesAnimLoop] property if you want the animation to repeat.
   */
  public final inline var animSpeedMax: Float
    @JvmName("animSpeedMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_ANIM_SPEED)
    @JvmName("animSpeedMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_ANIM_SPEED, value)
    }

  /**
   * Each particle's animation speed will vary along this [CurveTexture].
   */
  public final inline var animSpeedCurve: Texture2D?
    @JvmName("animSpeedCurveProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_ANIM_SPEED)
    @JvmName("animSpeedCurveProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_ANIM_SPEED, value)
    }

  @CoreTypeLocalCopy
  public final inline var animOffset: Vector2
    @JvmName("animOffsetProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_ANIM_OFFSET)
    @JvmName("animOffsetProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_ANIM_OFFSET, value)
    }

  /**
   * Minimum equivalent of [animOffsetMax].
   */
  public final inline var animOffsetMin: Float
    @JvmName("animOffsetMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_ANIM_OFFSET)
    @JvmName("animOffsetMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_ANIM_OFFSET, value)
    }

  /**
   * Maximum animation offset that corresponds to frame index in the texture. `0` is the first
   * frame, `1` is the last one. See [CanvasItemMaterial.particlesAnimation].
   */
  public final inline var animOffsetMax: Float
    @JvmName("animOffsetMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_ANIM_OFFSET)
    @JvmName("animOffsetMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_ANIM_OFFSET, value)
    }

  /**
   * Each particle's animation offset will vary along this [CurveTexture].
   */
  public final inline var animOffsetCurve: Texture2D?
    @JvmName("animOffsetCurveProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_ANIM_OFFSET)
    @JvmName("animOffsetCurveProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_ANIM_OFFSET, value)
    }

  /**
   * If `true`, enables turbulence for the particle system. Turbulence can be used to vary particle
   * movement according to its position (based on a 3D noise pattern). In 3D,
   * [GPUParticlesAttractorVectorField3D] with [NoiseTexture3D] can be used as an alternative to
   * turbulence that works in world space and with multiple particle systems reacting in the same way.
   * **Note:** Enabling turbulence has a high performance cost on the GPU. Only enable turbulence on
   * a few particle systems at once at most, and consider disabling it when targeting mobile/web
   * platforms.
   */
  public final inline var turbulenceEnabled: Boolean
    @JvmName("turbulenceEnabledProperty")
    get() = getTurbulenceEnabled()
    @JvmName("turbulenceEnabledProperty")
    set(`value`) {
      setTurbulenceEnabled(value)
    }

  /**
   * The turbulence noise strength. Increasing this will result in a stronger, more contrasting,
   * flow pattern.
   */
  public final inline var turbulenceNoiseStrength: Float
    @JvmName("turbulenceNoiseStrengthProperty")
    get() = getTurbulenceNoiseStrength()
    @JvmName("turbulenceNoiseStrengthProperty")
    set(`value`) {
      setTurbulenceNoiseStrength(value)
    }

  /**
   * This value controls the overall scale/frequency of the turbulence noise pattern.
   * A small scale will result in smaller features with more detail while a high scale will result
   * in smoother noise with larger features.
   */
  public final inline var turbulenceNoiseScale: Float
    @JvmName("turbulenceNoiseScaleProperty")
    get() = getTurbulenceNoiseScale()
    @JvmName("turbulenceNoiseScaleProperty")
    set(`value`) {
      setTurbulenceNoiseScale(value)
    }

  /**
   * A scrolling velocity for the turbulence field. This sets a directional trend for the pattern to
   * move in over time.
   * The default value of `Vector3(0, 0, 0)` turns off the scrolling.
   */
  @CoreTypeLocalCopy
  public final inline var turbulenceNoiseSpeed: Vector3
    @JvmName("turbulenceNoiseSpeedProperty")
    get() = getTurbulenceNoiseSpeed()
    @JvmName("turbulenceNoiseSpeedProperty")
    set(`value`) {
      setTurbulenceNoiseSpeed(value)
    }

  /**
   * The in-place rate of change of the turbulence field. This defines how quickly the noise pattern
   * varies over time.
   * A value of 0.0 will result in a fixed pattern.
   */
  public final inline var turbulenceNoiseSpeedRandom: Float
    @JvmName("turbulenceNoiseSpeedRandomProperty")
    get() = getTurbulenceNoiseSpeedRandom()
    @JvmName("turbulenceNoiseSpeedRandomProperty")
    set(`value`) {
      setTurbulenceNoiseSpeedRandom(value)
    }

  @CoreTypeLocalCopy
  public final inline var turbulenceInfluence: Vector2
    @JvmName("turbulenceInfluenceProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_TURB_VEL_INFLUENCE)
    @JvmName("turbulenceInfluenceProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_TURB_VEL_INFLUENCE, value)
    }

  /**
   * Minimum turbulence influence on each particle.
   * The actual amount of turbulence influence on each particle is calculated as a random value
   * between [turbulenceInfluenceMin] and [turbulenceInfluenceMax] and multiplied by the amount of
   * turbulence influence from [turbulenceInfluenceOverLife].
   */
  public final inline var turbulenceInfluenceMin: Float
    @JvmName("turbulenceInfluenceMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_TURB_VEL_INFLUENCE)
    @JvmName("turbulenceInfluenceMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_TURB_VEL_INFLUENCE, value)
    }

  /**
   * Maximum turbulence influence on each particle.
   * The actual amount of turbulence influence on each particle is calculated as a random value
   * between [turbulenceInfluenceMin] and [turbulenceInfluenceMax] and multiplied by the amount of
   * turbulence influence from [turbulenceInfluenceOverLife].
   */
  public final inline var turbulenceInfluenceMax: Float
    @JvmName("turbulenceInfluenceMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_TURB_VEL_INFLUENCE)
    @JvmName("turbulenceInfluenceMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_TURB_VEL_INFLUENCE, value)
    }

  @CoreTypeLocalCopy
  public final inline var turbulenceInitialDisplacement: Vector2
    @JvmName("turbulenceInitialDisplacementProperty")
    get() = getParam(ParticleProcessMaterial.Parameter.PARAM_TURB_INIT_DISPLACEMENT)
    @JvmName("turbulenceInitialDisplacementProperty")
    set(`value`) {
      setParam(ParticleProcessMaterial.Parameter.PARAM_TURB_INIT_DISPLACEMENT, value)
    }

  /**
   * Minimum displacement of each particle's spawn position by the turbulence.
   * The actual amount of displacement will be a factor of the underlying turbulence multiplied by a
   * random value between [turbulenceInitialDisplacementMin] and [turbulenceInitialDisplacementMax].
   */
  public final inline var turbulenceInitialDisplacementMin: Float
    @JvmName("turbulenceInitialDisplacementMinProperty")
    get() = getParamMin(ParticleProcessMaterial.Parameter.PARAM_TURB_INIT_DISPLACEMENT)
    @JvmName("turbulenceInitialDisplacementMinProperty")
    set(`value`) {
      setParamMin(ParticleProcessMaterial.Parameter.PARAM_TURB_INIT_DISPLACEMENT, value)
    }

  /**
   * Maximum displacement of each particle's spawn position by the turbulence.
   * The actual amount of displacement will be a factor of the underlying turbulence multiplied by a
   * random value between [turbulenceInitialDisplacementMin] and [turbulenceInitialDisplacementMax].
   */
  public final inline var turbulenceInitialDisplacementMax: Float
    @JvmName("turbulenceInitialDisplacementMaxProperty")
    get() = getParamMax(ParticleProcessMaterial.Parameter.PARAM_TURB_INIT_DISPLACEMENT)
    @JvmName("turbulenceInitialDisplacementMaxProperty")
    set(`value`) {
      setParamMax(ParticleProcessMaterial.Parameter.PARAM_TURB_INIT_DISPLACEMENT, value)
    }

  /**
   * Each particle's amount of turbulence will be influenced along this [CurveTexture] over its life
   * time.
   */
  public final inline var turbulenceInfluenceOverLife: Texture2D?
    @JvmName("turbulenceInfluenceOverLifeProperty")
    get() = getParamTexture(ParticleProcessMaterial.Parameter.PARAM_TURB_INFLUENCE_OVER_LIFE)
    @JvmName("turbulenceInfluenceOverLifeProperty")
    set(`value`) {
      setParamTexture(ParticleProcessMaterial.Parameter.PARAM_TURB_INFLUENCE_OVER_LIFE, value)
    }

  /**
   * The particles' collision mode.
   * **Note:** 3D Particles can only collide with [GPUParticlesCollision3D] nodes, not
   * [PhysicsBody3D] nodes. To make particles collide with various objects, you can add
   * [GPUParticlesCollision3D] nodes as children of [PhysicsBody3D] nodes. In 3D, collisions only occur
   * within the area defined by the [GPUParticles3D] node's [GPUParticles3D.visibilityAabb].
   * **Note:** 2D Particles can only collide with [LightOccluder2D] nodes, not [PhysicsBody2D]
   * nodes.
   */
  public final inline var collisionMode: CollisionMode
    @JvmName("collisionModeProperty")
    get() = getCollisionMode()
    @JvmName("collisionModeProperty")
    set(`value`) {
      setCollisionMode(value)
    }

  /**
   * The particles' friction. Values range from `0` (frictionless) to `1` (maximum friction). Only
   * effective if [collisionMode] is [COLLISION_RIGID].
   */
  public final inline var collisionFriction: Float
    @JvmName("collisionFrictionProperty")
    get() = getCollisionFriction()
    @JvmName("collisionFrictionProperty")
    set(`value`) {
      setCollisionFriction(value)
    }

  /**
   * The particles' bounciness. Values range from `0` (no bounce) to `1` (full bounciness). Only
   * effective if [collisionMode] is [COLLISION_RIGID].
   */
  public final inline var collisionBounce: Float
    @JvmName("collisionBounceProperty")
    get() = getCollisionBounce()
    @JvmName("collisionBounceProperty")
    set(`value`) {
      setCollisionBounce(value)
    }

  /**
   * If `true`, [GPUParticles3D.collisionBaseSize] is multiplied by the particle's effective scale
   * (see [scaleMin], [scaleMax], [scaleCurve], and [scaleOverVelocityCurve]).
   */
  public final inline var collisionUseScale: Boolean
    @JvmName("collisionUseScaleProperty")
    get() = isCollisionUsingScale()
    @JvmName("collisionUseScaleProperty")
    set(`value`) {
      setCollisionUseScale(value)
    }

  /**
   * The particle subemitter mode (see [GPUParticles2D.subEmitter] and [GPUParticles3D.subEmitter]).
   */
  public final inline var subEmitterMode: SubEmitterMode
    @JvmName("subEmitterModeProperty")
    get() = getSubEmitterMode()
    @JvmName("subEmitterModeProperty")
    set(`value`) {
      setSubEmitterMode(value)
    }

  /**
   * The frequency at which particles should be emitted from the subemitter node. One particle will
   * be spawned every [subEmitterFrequency] seconds.
   * **Note:** This value shouldn't exceed [GPUParticles2D.amount] or [GPUParticles3D.amount]
   * defined on the *subemitter node* (not the main node), relative to the subemitter's particle
   * lifetime. If the number of particles is exceeded, no new particles will spawn from the subemitter
   * until enough particles have expired.
   */
  public final inline var subEmitterFrequency: Double
    @JvmName("subEmitterFrequencyProperty")
    get() = getSubEmitterFrequency()
    @JvmName("subEmitterFrequencyProperty")
    set(`value`) {
      setSubEmitterFrequency(value)
    }

  /**
   * The amount of particles to spawn from the subemitter node when the particle expires.
   * **Note:** This value shouldn't exceed [GPUParticles2D.amount] or [GPUParticles3D.amount]
   * defined on the *subemitter node* (not the main node), relative to the subemitter's particle
   * lifetime. If the number of particles is exceeded, no new particles will spawn from the subemitter
   * until enough particles have expired.
   */
  public final inline var subEmitterAmountAtEnd: Int
    @JvmName("subEmitterAmountAtEndProperty")
    get() = getSubEmitterAmountAtEnd()
    @JvmName("subEmitterAmountAtEndProperty")
    set(`value`) {
      setSubEmitterAmountAtEnd(value)
    }

  /**
   * The amount of particles to spawn from the subemitter node when a collision occurs. When
   * combined with [COLLISION_HIDE_ON_CONTACT] on the main particles material, this can be used to
   * achieve effects such as raindrops hitting the ground.
   * **Note:** This value shouldn't exceed [GPUParticles2D.amount] or [GPUParticles3D.amount]
   * defined on the *subemitter node* (not the main node), relative to the subemitter's particle
   * lifetime. If the number of particles is exceeded, no new particles will spawn from the subemitter
   * until enough particles have expired.
   */
  public final inline var subEmitterAmountAtCollision: Int
    @JvmName("subEmitterAmountAtCollisionProperty")
    get() = getSubEmitterAmountAtCollision()
    @JvmName("subEmitterAmountAtCollisionProperty")
    set(`value`) {
      setSubEmitterAmountAtCollision(value)
    }

  /**
   * If `true`, the subemitter inherits the parent particle's velocity when it spawns.
   */
  public final inline var subEmitterKeepVelocity: Boolean
    @JvmName("subEmitterKeepVelocityProperty")
    get() = getSubEmitterKeepVelocity()
    @JvmName("subEmitterKeepVelocityProperty")
    set(`value`) {
      setSubEmitterKeepVelocity(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_PARTICLEPROCESSMATERIAL, scriptIndex)
  }

  /**
   * The offset for the [emissionShape], in local space.
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
   * val myCoreType = particleprocessmaterial.emissionShapeOffset
   * //Your changes
   * particleprocessmaterial.emissionShapeOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun emissionShapeOffsetMutate(block: Vector3.() -> Unit): Vector3 =
      emissionShapeOffset.apply{
      block(this)
      emissionShapeOffset = this
  }


  /**
   * The scale of the [emissionShape], in local space.
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
   * val myCoreType = particleprocessmaterial.emissionShapeScale
   * //Your changes
   * particleprocessmaterial.emissionShapeScale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun emissionShapeScaleMutate(block: Vector3.() -> Unit): Vector3 =
      emissionShapeScale.apply{
      block(this)
      emissionShapeScale = this
  }


  /**
   * The box's extents if [emissionShape] is set to [EMISSION_SHAPE_BOX].
   * **Note:** [emissionBoxExtents] starts from the center point and applies the X, Y, and Z values
   * in both directions. The size is twice the area of the extents.
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
   * val myCoreType = particleprocessmaterial.emissionBoxExtents
   * //Your changes
   * particleprocessmaterial.emissionBoxExtents = myCoreType
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
   * val myCoreType = particleprocessmaterial.emissionRingAxis
   * //Your changes
   * particleprocessmaterial.emissionRingAxis = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun emissionRingAxisMutate(block: Vector3.() -> Unit): Vector3 =
      emissionRingAxis.apply{
      block(this)
      emissionRingAxis = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.angle
   * //Your changes
   * particleprocessmaterial.angle = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun angleMutate(block: Vector2.() -> Unit): Vector2 = angle.apply{
      block(this)
      angle = this
  }


  /**
   * A pivot point used to calculate radial and orbital velocity of particles.
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
   * val myCoreType = particleprocessmaterial.velocityPivot
   * //Your changes
   * particleprocessmaterial.velocityPivot = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun velocityPivotMutate(block: Vector3.() -> Unit): Vector3 = velocityPivot.apply{
      block(this)
      velocityPivot = this
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
   * val myCoreType = particleprocessmaterial.direction
   * //Your changes
   * particleprocessmaterial.direction = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun directionMutate(block: Vector3.() -> Unit): Vector3 = direction.apply{
      block(this)
      direction = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.initialVelocity
   * //Your changes
   * particleprocessmaterial.initialVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun initialVelocityMutate(block: Vector2.() -> Unit): Vector2 =
      initialVelocity.apply{
      block(this)
      initialVelocity = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.angularVelocity
   * //Your changes
   * particleprocessmaterial.angularVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun angularVelocityMutate(block: Vector2.() -> Unit): Vector2 =
      angularVelocity.apply{
      block(this)
      angularVelocity = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.directionalVelocity
   * //Your changes
   * particleprocessmaterial.directionalVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun directionalVelocityMutate(block: Vector2.() -> Unit): Vector2 =
      directionalVelocity.apply{
      block(this)
      directionalVelocity = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.orbitVelocity
   * //Your changes
   * particleprocessmaterial.orbitVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun orbitVelocityMutate(block: Vector2.() -> Unit): Vector2 = orbitVelocity.apply{
      block(this)
      orbitVelocity = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.radialVelocity
   * //Your changes
   * particleprocessmaterial.radialVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun radialVelocityMutate(block: Vector2.() -> Unit): Vector2 = radialVelocity.apply{
      block(this)
      radialVelocity = this
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
   * val myCoreType = particleprocessmaterial.gravity
   * //Your changes
   * particleprocessmaterial.gravity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun gravityMutate(block: Vector3.() -> Unit): Vector3 = gravity.apply{
      block(this)
      gravity = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.linearAccel
   * //Your changes
   * particleprocessmaterial.linearAccel = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun linearAccelMutate(block: Vector2.() -> Unit): Vector2 = linearAccel.apply{
      block(this)
      linearAccel = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.radialAccel
   * //Your changes
   * particleprocessmaterial.radialAccel = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun radialAccelMutate(block: Vector2.() -> Unit): Vector2 = radialAccel.apply{
      block(this)
      radialAccel = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.tangentialAccel
   * //Your changes
   * particleprocessmaterial.tangentialAccel = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun tangentialAccelMutate(block: Vector2.() -> Unit): Vector2 =
      tangentialAccel.apply{
      block(this)
      tangentialAccel = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.damping
   * //Your changes
   * particleprocessmaterial.damping = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun dampingMutate(block: Vector2.() -> Unit): Vector2 = damping.apply{
      block(this)
      damping = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.scale
   * //Your changes
   * particleprocessmaterial.scale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun scaleMutate(block: Vector2.() -> Unit): Vector2 = scale.apply{
      block(this)
      scale = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.scaleOverVelocity
   * //Your changes
   * particleprocessmaterial.scaleOverVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun scaleOverVelocityMutate(block: Vector2.() -> Unit): Vector2 =
      scaleOverVelocity.apply{
      block(this)
      scaleOverVelocity = this
  }


  /**
   * Each particle's initial color. If the [GPUParticles2D]'s `texture` is defined, it will be
   * multiplied by this color.
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
   * val myCoreType = particleprocessmaterial.color
   * //Your changes
   * particleprocessmaterial.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.hueVariation
   * //Your changes
   * particleprocessmaterial.hueVariation = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun hueVariationMutate(block: Vector2.() -> Unit): Vector2 = hueVariation.apply{
      block(this)
      hueVariation = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.animSpeed
   * //Your changes
   * particleprocessmaterial.animSpeed = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun animSpeedMutate(block: Vector2.() -> Unit): Vector2 = animSpeed.apply{
      block(this)
      animSpeed = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.animOffset
   * //Your changes
   * particleprocessmaterial.animOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun animOffsetMutate(block: Vector2.() -> Unit): Vector2 = animOffset.apply{
      block(this)
      animOffset = this
  }


  /**
   * A scrolling velocity for the turbulence field. This sets a directional trend for the pattern to
   * move in over time.
   * The default value of `Vector3(0, 0, 0)` turns off the scrolling.
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
   * val myCoreType = particleprocessmaterial.turbulenceNoiseSpeed
   * //Your changes
   * particleprocessmaterial.turbulenceNoiseSpeed = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun turbulenceNoiseSpeedMutate(block: Vector3.() -> Unit): Vector3 =
      turbulenceNoiseSpeed.apply{
      block(this)
      turbulenceNoiseSpeed = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.turbulenceInfluence
   * //Your changes
   * particleprocessmaterial.turbulenceInfluence = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun turbulenceInfluenceMutate(block: Vector2.() -> Unit): Vector2 =
      turbulenceInfluence.apply{
      block(this)
      turbulenceInfluence = this
  }


  /**
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.turbulenceInitialDisplacement
   * //Your changes
   * particleprocessmaterial.turbulenceInitialDisplacement = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun turbulenceInitialDisplacementMutate(block: Vector2.() -> Unit): Vector2 =
      turbulenceInitialDisplacement.apply{
      block(this)
      turbulenceInitialDisplacement = this
  }


  public final fun setDirection(degrees: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to degrees)
    TransferContext.callMethod(ptr, MethodBindings.setDirectionPtr, NIL)
  }

  public final fun getDirection(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDirectionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setInheritVelocityRatio(ratio: Double): Unit {
    TransferContext.writeArguments(DOUBLE to ratio)
    TransferContext.callMethod(ptr, MethodBindings.setInheritVelocityRatioPtr, NIL)
  }

  public final fun getInheritVelocityRatio(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInheritVelocityRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setSpread(degrees: Float): Unit {
    TransferContext.writeArguments(DOUBLE to degrees.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSpreadPtr, NIL)
  }

  public final fun getSpread(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpreadPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFlatness(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFlatnessPtr, NIL)
  }

  public final fun getFlatness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFlatnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the minimum and maximum values of the given [param].
   * The `x` component of the argument vector corresponds to minimum and the `y` component
   * corresponds to maximum.
   */
  public final fun setParam(`param`: Parameter, `value`: Vector2): Unit {
    TransferContext.writeArguments(LONG to param.id, VECTOR2 to value)
    TransferContext.callMethod(ptr, MethodBindings.setParamPtr, NIL)
  }

  /**
   * Returns the minimum and maximum values of the given [param] as a vector.
   * The `x` component of the returned vector corresponds to minimum and the `y` component
   * corresponds to maximum.
   */
  public final fun getParam(`param`: Parameter): Vector2 {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(ptr, MethodBindings.getParamPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the minimum value range for the given parameter.
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
   * Sets the maximum value range for the given parameter.
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
   * Sets the [Texture2D] for the specified [Parameter].
   */
  public final fun setParamTexture(`param`: Parameter, texture: Texture2D?): Unit {
    TransferContext.writeArguments(LONG to param.id, OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setParamTexturePtr, NIL)
  }

  /**
   * Returns the [Texture2D] used by the specified parameter.
   */
  public final fun getParamTexture(`param`: Parameter): Texture2D? {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(ptr, MethodBindings.getParamTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
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

  public final fun setColorRamp(ramp: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to ramp)
    TransferContext.callMethod(ptr, MethodBindings.setColorRampPtr, NIL)
  }

  public final fun getColorRamp(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorRampPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setAlphaCurve(curve: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setAlphaCurvePtr, NIL)
  }

  public final fun getAlphaCurve(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlphaCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setEmissionCurve(curve: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionCurvePtr, NIL)
  }

  public final fun getEmissionCurve(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setColorInitialRamp(ramp: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to ramp)
    TransferContext.callMethod(ptr, MethodBindings.setColorInitialRampPtr, NIL)
  }

  public final fun getColorInitialRamp(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorInitialRampPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setVelocityLimitCurve(curve: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setVelocityLimitCurvePtr, NIL)
  }

  public final fun getVelocityLimitCurve(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVelocityLimitCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * If `true`, enables the specified particle flag. See [ParticleFlags] for options.
   */
  public final fun setParticleFlag(particleFlag: ParticleFlags, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to particleFlag.id, BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setParticleFlagPtr, NIL)
  }

  /**
   * Returns `true` if the specified particle flag is enabled. See [ParticleFlags] for options.
   */
  public final fun getParticleFlag(particleFlag: ParticleFlags): Boolean {
    TransferContext.writeArguments(LONG to particleFlag.id)
    TransferContext.callMethod(ptr, MethodBindings.getParticleFlagPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setVelocityPivot(pivot: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to pivot)
    TransferContext.callMethod(ptr, MethodBindings.setVelocityPivotPtr, NIL)
  }

  public final fun getVelocityPivot(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVelocityPivotPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setEmissionShape(shape: EmissionShape): Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionShapePtr, NIL)
  }

  public final fun getEmissionShape(): EmissionShape {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionShapePtr, LONG)
    return ParticleProcessMaterial.EmissionShape.from(TransferContext.readReturnValue(LONG) as Long)
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

  public final fun setEmissionBoxExtents(extents: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to extents)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionBoxExtentsPtr, NIL)
  }

  public final fun getEmissionBoxExtents(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionBoxExtentsPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setEmissionPointTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionPointTexturePtr, NIL)
  }

  public final fun getEmissionPointTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionPointTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setEmissionNormalTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionNormalTexturePtr, NIL)
  }

  public final fun getEmissionNormalTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionNormalTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setEmissionColorTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionColorTexturePtr, NIL)
  }

  public final fun getEmissionColorTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionColorTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setEmissionPointCount(pointCount: Int): Unit {
    TransferContext.writeArguments(LONG to pointCount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setEmissionPointCountPtr, NIL)
  }

  public final fun getEmissionPointCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionPointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setEmissionRingAxis(axis: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to axis)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionRingAxisPtr, NIL)
  }

  public final fun getEmissionRingAxis(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionRingAxisPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setEmissionRingHeight(height: Float): Unit {
    TransferContext.writeArguments(DOUBLE to height.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEmissionRingHeightPtr, NIL)
  }

  public final fun getEmissionRingHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionRingHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmissionRingRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEmissionRingRadiusPtr, NIL)
  }

  public final fun getEmissionRingRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionRingRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmissionRingInnerRadius(innerRadius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to innerRadius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEmissionRingInnerRadiusPtr, NIL)
  }

  public final fun getEmissionRingInnerRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionRingInnerRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmissionShapeOffset(emissionShapeOffset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to emissionShapeOffset)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionShapeOffsetPtr, NIL)
  }

  public final fun getEmissionShapeOffset(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionShapeOffsetPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setEmissionShapeScale(emissionShapeScale: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to emissionShapeScale)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionShapeScalePtr, NIL)
  }

  public final fun getEmissionShapeScale(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionShapeScalePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun getTurbulenceEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTurbulenceEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTurbulenceEnabled(turbulenceEnabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to turbulenceEnabled)
    TransferContext.callMethod(ptr, MethodBindings.setTurbulenceEnabledPtr, NIL)
  }

  public final fun getTurbulenceNoiseStrength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTurbulenceNoiseStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTurbulenceNoiseStrength(turbulenceNoiseStrength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to turbulenceNoiseStrength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTurbulenceNoiseStrengthPtr, NIL)
  }

  public final fun getTurbulenceNoiseScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTurbulenceNoiseScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTurbulenceNoiseScale(turbulenceNoiseScale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to turbulenceNoiseScale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTurbulenceNoiseScalePtr, NIL)
  }

  public final fun getTurbulenceNoiseSpeedRandom(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTurbulenceNoiseSpeedRandomPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTurbulenceNoiseSpeedRandom(turbulenceNoiseSpeedRandom: Float): Unit {
    TransferContext.writeArguments(DOUBLE to turbulenceNoiseSpeedRandom.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTurbulenceNoiseSpeedRandomPtr, NIL)
  }

  public final fun getTurbulenceNoiseSpeed(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTurbulenceNoiseSpeedPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setTurbulenceNoiseSpeed(turbulenceNoiseSpeed: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to turbulenceNoiseSpeed)
    TransferContext.callMethod(ptr, MethodBindings.setTurbulenceNoiseSpeedPtr, NIL)
  }

  public final fun getGravity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGravityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setGravity(accelVec: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to accelVec)
    TransferContext.callMethod(ptr, MethodBindings.setGravityPtr, NIL)
  }

  public final fun setLifetimeRandomness(randomness: Double): Unit {
    TransferContext.writeArguments(DOUBLE to randomness)
    TransferContext.callMethod(ptr, MethodBindings.setLifetimeRandomnessPtr, NIL)
  }

  public final fun getLifetimeRandomness(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLifetimeRandomnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getSubEmitterMode(): SubEmitterMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubEmitterModePtr, LONG)
    return ParticleProcessMaterial.SubEmitterMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSubEmitterMode(mode: SubEmitterMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setSubEmitterModePtr, NIL)
  }

  public final fun getSubEmitterFrequency(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubEmitterFrequencyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setSubEmitterFrequency(hz: Double): Unit {
    TransferContext.writeArguments(DOUBLE to hz)
    TransferContext.callMethod(ptr, MethodBindings.setSubEmitterFrequencyPtr, NIL)
  }

  public final fun getSubEmitterAmountAtEnd(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubEmitterAmountAtEndPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSubEmitterAmountAtEnd(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSubEmitterAmountAtEndPtr, NIL)
  }

  public final fun getSubEmitterAmountAtCollision(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubEmitterAmountAtCollisionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSubEmitterAmountAtCollision(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSubEmitterAmountAtCollisionPtr, NIL)
  }

  public final fun getSubEmitterKeepVelocity(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubEmitterKeepVelocityPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSubEmitterKeepVelocity(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setSubEmitterKeepVelocityPtr, NIL)
  }

  public final fun setAttractorInteractionEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAttractorInteractionEnabledPtr, NIL)
  }

  public final fun isAttractorInteractionEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAttractorInteractionEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollisionMode(mode: CollisionMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionModePtr, NIL)
  }

  public final fun getCollisionMode(): CollisionMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionModePtr, LONG)
    return ParticleProcessMaterial.CollisionMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCollisionUseScale(radius: Boolean): Unit {
    TransferContext.writeArguments(BOOL to radius)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionUseScalePtr, NIL)
  }

  public final fun isCollisionUsingScale(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCollisionUsingScalePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollisionFriction(friction: Float): Unit {
    TransferContext.writeArguments(DOUBLE to friction.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCollisionFrictionPtr, NIL)
  }

  public final fun getCollisionFriction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionFrictionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCollisionBounce(bounce: Float): Unit {
    TransferContext.writeArguments(DOUBLE to bounce.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCollisionBouncePtr, NIL)
  }

  public final fun getCollisionBounce(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionBouncePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public enum class Parameter(
    id: Long,
  ) {
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set initial velocity
     * properties.
     */
    PARAM_INITIAL_LINEAR_VELOCITY(0),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set angular velocity
     * properties.
     */
    PARAM_ANGULAR_VELOCITY(1),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set orbital velocity
     * properties.
     */
    PARAM_ORBIT_VELOCITY(2),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set linear acceleration
     * properties.
     */
    PARAM_LINEAR_ACCEL(3),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set radial acceleration
     * properties.
     */
    PARAM_RADIAL_ACCEL(4),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set tangential acceleration
     * properties.
     */
    PARAM_TANGENTIAL_ACCEL(5),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set damping properties.
     */
    PARAM_DAMPING(6),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set angle properties.
     */
    PARAM_ANGLE(7),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set scale properties.
     */
    PARAM_SCALE(8),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set hue variation properties.
     */
    PARAM_HUE_VARIATION(9),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set animation speed
     * properties.
     */
    PARAM_ANIM_SPEED(10),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set animation offset
     * properties.
     */
    PARAM_ANIM_OFFSET(11),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set radial velocity
     * properties.
     */
    PARAM_RADIAL_VELOCITY(15),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set directional velocity
     * properties.
     */
    PARAM_DIRECTIONAL_VELOCITY(16),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set scale over velocity
     * properties.
     */
    PARAM_SCALE_OVER_VELOCITY(17),
    /**
     * Represents the size of the [Parameter] enum.
     */
    PARAM_MAX(18),
    /**
     * Use with [setParamMin] and [setParamMax] to set the turbulence minimum und maximum influence
     * on each particles velocity.
     */
    PARAM_TURB_VEL_INFLUENCE(13),
    /**
     * Use with [setParamMin] and [setParamMax] to set the turbulence minimum and maximum
     * displacement of the particles spawn position.
     */
    PARAM_TURB_INIT_DISPLACEMENT(14),
    /**
     * Use with [setParamTexture] to set the turbulence influence over the particles life time.
     */
    PARAM_TURB_INFLUENCE_OVER_LIFE(12),
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
    PARTICLE_FLAG_DAMPING_AS_FRICTION(3),
    /**
     * Represents the size of the [ParticleFlags] enum.
     */
    PARTICLE_FLAG_MAX(4),
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
     * Particles will be emitted at a position determined by sampling a random point on the
     * [emissionPointTexture]. Particle color will be modulated by [emissionColorTexture].
     */
    EMISSION_SHAPE_POINTS(4),
    /**
     * Particles will be emitted at a position determined by sampling a random point on the
     * [emissionPointTexture]. Particle velocity and rotation will be set based on
     * [emissionNormalTexture]. Particle color will be modulated by [emissionColorTexture].
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

  public enum class SubEmitterMode(
    id: Long,
  ) {
    SUB_EMITTER_DISABLED(0),
    SUB_EMITTER_CONSTANT(1),
    SUB_EMITTER_AT_END(2),
    SUB_EMITTER_AT_COLLISION(3),
    /**
     * Represents the size of the [SubEmitterMode] enum.
     */
    SUB_EMITTER_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SubEmitterMode = entries.single { it.id == `value` }
    }
  }

  public enum class CollisionMode(
    id: Long,
  ) {
    /**
     * No collision for particles. Particles will go through [GPUParticlesCollision3D] nodes.
     */
    COLLISION_DISABLED(0),
    /**
     * [RigidBody3D]-style collision for particles using [GPUParticlesCollision3D] nodes.
     */
    COLLISION_RIGID(1),
    /**
     * Hide particles instantly when colliding with a [GPUParticlesCollision3D] node. This can be
     * combined with a subemitter that uses the [COLLISION_RIGID] collision mode to "replace" the
     * parent particle with the subemitter on impact.
     */
    COLLISION_HIDE_ON_CONTACT(2),
    /**
     * Represents the size of the [CollisionMode] enum.
     */
    COLLISION_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CollisionMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_direction", 3460891852)

    public val getDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_direction", 3360562783)

    public val setInheritVelocityRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_inherit_velocity_ratio", 373806689)

    public val getInheritVelocityRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_inherit_velocity_ratio", 191475506)

    public val setSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_spread", 373806689)

    public val getSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_spread", 1740695150)

    public val setFlatnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_flatness", 373806689)

    public val getFlatnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_flatness", 1740695150)

    public val setParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_param", 676779352)

    public val getParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_param", 2623708480)

    public val setParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_param_min", 2295964248)

    public val getParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_param_min", 3903786503)

    public val setParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_param_max", 2295964248)

    public val getParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_param_max", 3903786503)

    public val setParamTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_param_texture", 526976089)

    public val getParamTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_param_texture", 3489372978)

    public val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_color", 2920490490)

    public val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_color", 3444240500)

    public val setColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_color_ramp", 4051416890)

    public val getColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_color_ramp", 3635182373)

    public val setAlphaCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_alpha_curve", 4051416890)

    public val getAlphaCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_alpha_curve", 3635182373)

    public val setEmissionCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_curve", 4051416890)

    public val getEmissionCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_curve", 3635182373)

    public val setColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_color_initial_ramp", 4051416890)

    public val getColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_color_initial_ramp", 3635182373)

    public val setVelocityLimitCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_velocity_limit_curve", 4051416890)

    public val getVelocityLimitCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_velocity_limit_curve", 3635182373)

    public val setParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_particle_flag", 1711815571)

    public val getParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_particle_flag", 3895316907)

    public val setVelocityPivotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_velocity_pivot", 3460891852)

    public val getVelocityPivotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_velocity_pivot", 3783033775)

    public val setEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_shape", 461501442)

    public val getEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_shape", 3719733018)

    public val setEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_sphere_radius", 373806689)

    public val getEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_sphere_radius", 1740695150)

    public val setEmissionBoxExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_box_extents", 3460891852)

    public val getEmissionBoxExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_box_extents", 3360562783)

    public val setEmissionPointTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_point_texture", 4051416890)

    public val getEmissionPointTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_point_texture", 3635182373)

    public val setEmissionNormalTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_normal_texture", 4051416890)

    public val getEmissionNormalTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_normal_texture", 3635182373)

    public val setEmissionColorTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_color_texture", 4051416890)

    public val getEmissionColorTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_color_texture", 3635182373)

    public val setEmissionPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_point_count", 1286410249)

    public val getEmissionPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_point_count", 3905245786)

    public val setEmissionRingAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_axis", 3460891852)

    public val getEmissionRingAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_axis", 3360562783)

    public val setEmissionRingHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_height", 373806689)

    public val getEmissionRingHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_height", 1740695150)

    public val setEmissionRingRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_radius", 373806689)

    public val getEmissionRingRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_radius", 1740695150)

    public val setEmissionRingInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_inner_radius", 373806689)

    public val getEmissionRingInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_inner_radius", 1740695150)

    public val setEmissionShapeOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_shape_offset", 3460891852)

    public val getEmissionShapeOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_shape_offset", 3360562783)

    public val setEmissionShapeScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_shape_scale", 3460891852)

    public val getEmissionShapeScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_shape_scale", 3360562783)

    public val getTurbulenceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_enabled", 36873697)

    public val setTurbulenceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_enabled", 2586408642)

    public val getTurbulenceNoiseStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_strength", 1740695150)

    public val setTurbulenceNoiseStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_strength", 373806689)

    public val getTurbulenceNoiseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_scale", 1740695150)

    public val setTurbulenceNoiseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_scale", 373806689)

    public val getTurbulenceNoiseSpeedRandomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_speed_random", 1740695150)

    public val setTurbulenceNoiseSpeedRandomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_speed_random", 373806689)

    public val getTurbulenceNoiseSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_speed", 3360562783)

    public val setTurbulenceNoiseSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_speed", 3460891852)

    public val getGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_gravity", 3360562783)

    public val setGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_gravity", 3460891852)

    public val setLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_lifetime_randomness", 373806689)

    public val getLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_lifetime_randomness", 1740695150)

    public val getSubEmitterModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_mode", 2399052877)

    public val setSubEmitterModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_mode", 2161806672)

    public val getSubEmitterFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_frequency", 1740695150)

    public val setSubEmitterFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_frequency", 373806689)

    public val getSubEmitterAmountAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_amount_at_end", 3905245786)

    public val setSubEmitterAmountAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_amount_at_end", 1286410249)

    public val getSubEmitterAmountAtCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_amount_at_collision", 3905245786)

    public val setSubEmitterAmountAtCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_amount_at_collision", 1286410249)

    public val getSubEmitterKeepVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_keep_velocity", 36873697)

    public val setSubEmitterKeepVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_keep_velocity", 2586408642)

    public val setAttractorInteractionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_attractor_interaction_enabled", 2586408642)

    public val isAttractorInteractionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "is_attractor_interaction_enabled", 36873697)

    public val setCollisionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_mode", 653804659)

    public val getCollisionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_collision_mode", 139371864)

    public val setCollisionUseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_use_scale", 2586408642)

    public val isCollisionUsingScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "is_collision_using_scale", 36873697)

    public val setCollisionFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_friction", 373806689)

    public val getCollisionFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_collision_friction", 1740695150)

    public val setCollisionBouncePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_bounce", 373806689)

    public val getCollisionBouncePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_collision_bounce", 1740695150)
  }
}
