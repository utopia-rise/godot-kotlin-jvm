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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

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
   * If `true`, particles will not move on the z axis.
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
   * Changes the behavior of the damping properties from a linear deceleration to a deceleration
   * based on speed percentage.
   */
  public var particleFlagDampingAsFriction: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParticleFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParticleFlagPtr, NIL)
    }

  /**
   * The offset for the [emissionShape], in local space.
   */
  @CoreTypeLocalCopy
  public var emissionShapeOffset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionShapeOffsetPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionShapeOffsetPtr, NIL)
    }

  /**
   * The scale of the [emissionShape], in local space.
   */
  @CoreTypeLocalCopy
  public var emissionShapeScale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionShapeScalePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionShapeScalePtr, NIL)
    }

  /**
   * Particles will be emitted inside this region. Use [EmissionShape] constants for values.
   */
  public var emissionShape: EmissionShape
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionShapePtr, LONG)
      return ParticleProcessMaterial.EmissionShape.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionShapePtr, NIL)
    }

  /**
   * The sphere's radius if [emissionShape] is set to [EMISSION_SHAPE_SPHERE].
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
   * The box's extents if [emissionShape] is set to [EMISSION_SHAPE_BOX].
   * **Note:** [emissionBoxExtents] starts from the center point and applies the X, Y, and Z values
   * in both directions. The size is twice the area of the extents.
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
   * Particles will be emitted at positions determined by sampling this texture at a random
   * position. Used with [EMISSION_SHAPE_POINTS] and [EMISSION_SHAPE_DIRECTED_POINTS]. Can be created
   * automatically from mesh or node by selecting "Create Emission Points from Mesh/Node" under the
   * "Particles" tool in the toolbar.
   */
  public var emissionPointTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionPointTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionPointTexturePtr, NIL)
    }

  /**
   * Particle velocity and rotation will be set by sampling this texture at the same point as the
   * [emissionPointTexture]. Used only in [EMISSION_SHAPE_DIRECTED_POINTS]. Can be created
   * automatically from mesh or node by selecting "Create Emission Points from Mesh/Node" under the
   * "Particles" tool in the toolbar.
   */
  public var emissionNormalTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionNormalTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionNormalTexturePtr, NIL)
    }

  /**
   * Particle color will be modulated by color determined by sampling this texture at the same point
   * as the [emissionPointTexture].
   * **Note:** [emissionColorTexture] multiplies the particle mesh's vertex colors. To have a
   * visible effect on a [BaseMaterial3D], [BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`.
   * For a [ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()`
   * function. Otherwise, [emissionColorTexture] will have no visible effect.
   */
  public var emissionColorTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionColorTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionColorTexturePtr, NIL)
    }

  /**
   * The number of emission points if [emissionShape] is set to [EMISSION_SHAPE_POINTS] or
   * [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public var emissionPointCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionPointCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionPointCountPtr, NIL)
    }

  /**
   * The axis of the ring when using the emitter [EMISSION_SHAPE_RING].
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
   * The height of the ring when using the emitter [EMISSION_SHAPE_RING].
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
   * The radius of the ring when using the emitter [EMISSION_SHAPE_RING].
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
   * The inner radius of the ring when using the emitter [EMISSION_SHAPE_RING].
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

  @CoreTypeLocalCopy
  public var angle: Vector2
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum equivalent of [angleMax].
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
   * Maximum initial rotation applied to each particle, in degrees.
   * Only applied when [particleFlagDisableZ] or [particleFlagRotateY] are `true` or the
   * [BaseMaterial3D] being used to draw the particle is using [BaseMaterial3D.BILLBOARD_PARTICLES].
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
   * Each particle's rotation will be animated along this [CurveTexture].
   */
  public var angleCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   * Percentage of the velocity of the respective [GPUParticles2D] or [GPUParticles3D] inherited by
   * each particle when spawning.
   */
  public var inheritVelocityRatio: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInheritVelocityRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInheritVelocityRatioPtr, NIL)
    }

  /**
   * A pivot point used to calculate radial and orbital velocity of particles.
   */
  @CoreTypeLocalCopy
  public var velocityPivot: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVelocityPivotPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVelocityPivotPtr, NIL)
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
   * Each particle's initial direction range from `+spread` to `-spread` degrees.
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
   * Amount of [spread] along the Y axis.
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

  @CoreTypeLocalCopy
  public var initialVelocity: Vector2
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum equivalent of [initialVelocityMax].
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
   * Maximum initial velocity magnitude for each particle. Direction comes from [direction] and
   * [spread].
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

  @CoreTypeLocalCopy
  public var angularVelocity: Vector2
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum equivalent of [angularVelocityMax].
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
   * Only applied when [particleFlagDisableZ] or [particleFlagRotateY] are `true` or the
   * [BaseMaterial3D] being used to draw the particle is using [BaseMaterial3D.BILLBOARD_PARTICLES].
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
   * Each particle's angular velocity (rotation speed) will vary along this [CurveTexture] over its
   * lifetime.
   */
  public var angularVelocityCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var directionalVelocity: Vector2
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum directional velocity value, which is multiplied by [directionalVelocityCurve].
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public var directionalVelocityMin: Float
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum directional velocity value, which is multiplied by [directionalVelocityCurve].
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public var directionalVelocityMax: Float
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * A curve that specifies the velocity along each of the axes of the particle system along its
   * lifetime.
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public var directionalVelocityCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var orbitVelocity: Vector2
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum equivalent of [orbitVelocityMax].
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
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
   * Maximum orbital velocity applied to each particle. Makes the particles circle around origin.
   * Specified in number of full rotations around origin per second.
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
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
   * Each particle's orbital velocity will vary along this [CurveTexture].
   * **Note:** For 3D orbital velocity, use a [CurveXYZTexture].
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public var orbitVelocityCurve: Material?
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var radialVelocity: Vector2
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum radial velocity applied to each particle. Makes particles move away from the
   * [velocityPivot], or toward it if negative.
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public var radialVelocityMin: Float
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum radial velocity applied to each particle. Makes particles move away from the
   * [velocityPivot], or toward it if negative.
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public var radialVelocityMax: Float
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * A [CurveTexture] that defines the velocity over the particle's lifetime away (or toward) the
   * [velocityPivot].
   * **Note:** Animated velocities will not be affected by damping, use [velocityLimitCurve]
   * instead.
   */
  public var radialVelocityCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   * A [CurveTexture] that defines the maximum velocity of a particle during its lifetime.
   */
  public var velocityLimitCurve: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVelocityLimitCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVelocityLimitCurvePtr, NIL)
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

  @CoreTypeLocalCopy
  public var linearAccel: Vector2
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum equivalent of [linearAccelMax].
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
   * Maximum linear acceleration applied to each particle in the direction of motion.
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
   * Each particle's linear acceleration will vary along this [CurveTexture].
   */
  public var linearAccelCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var radialAccel: Vector2
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum equivalent of [radialAccelMax].
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
   * Maximum radial acceleration applied to each particle. Makes particle accelerate away from the
   * origin or towards it if negative.
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
   * Each particle's radial acceleration will vary along this [CurveTexture].
   */
  public var radialAccelCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var tangentialAccel: Vector2
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum equivalent of [tangentialAccelMax].
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
   * Maximum tangential acceleration applied to each particle. Tangential acceleration is
   * perpendicular to the particle's velocity giving the particles a swirling motion.
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
   * Each particle's tangential acceleration will vary along this [CurveTexture].
   */
  public var tangentialAccelCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var damping: Vector2
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum equivalent of [dampingMax].
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
   * The maximum rate at which particles lose velocity. For example value of `100` means that the
   * particle will go from `100` velocity to `0` in `1` second.
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
   * Damping will vary along this [CurveTexture].
   */
  public var dampingCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   * If `true`, interaction with particle attractors is enabled. In 3D, attraction only occurs
   * within the area defined by the [GPUParticles3D] node's [GPUParticles3D.visibilityAabb].
   */
  public var attractorInteractionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAttractorInteractionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAttractorInteractionEnabledPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var scale: Vector2
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum equivalent of [scaleMax].
   */
  public var scaleMin: Float
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
   * Maximum initial scale applied to each particle.
   */
  public var scaleMax: Float
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
   * Each particle's scale will vary along this [CurveTexture] over its lifetime. If a
   * [CurveXYZTexture] is supplied instead, the scale will be separated per-axis.
   */
  public var scaleCurve: Material?
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var scaleOverVelocity: Vector2
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum velocity value reference for [scaleOverVelocityCurve].
   * [scaleOverVelocityCurve] will be interpolated between [scaleOverVelocityMin] and
   * [scaleOverVelocityMax].
   */
  public var scaleOverVelocityMin: Float
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum velocity value reference for [scaleOverVelocityCurve].
   * [scaleOverVelocityCurve] will be interpolated between [scaleOverVelocityMin] and
   * [scaleOverVelocityMax].
   */
  public var scaleOverVelocityMax: Float
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Either a [CurveTexture] or a [CurveXYZTexture] that scales each particle based on its velocity.
   */
  public var scaleOverVelocityCurve: Material?
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
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
  public var colorRamp: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorRampPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
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
  public var colorInitialRamp: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorInitialRampPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorInitialRampPtr, NIL)
    }

  /**
   * The alpha value of each particle's color will be multiplied by this [CurveTexture] over its
   * lifetime.
   */
  public var alphaCurve: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaCurvePtr, NIL)
    }

  /**
   * Each particle's color will be multiplied by this [CurveTexture] over its lifetime.
   * **Note:** This property won't have a visible effect unless the render material is marked as
   * unshaded.
   */
  public var emissionCurve: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionCurvePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var hueVariation: Vector2
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum equivalent of [hueVariationMax].
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
   * Maximum initial hue variation applied to each particle. It will shift the particle color's hue.
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
   * Each particle's hue will vary along this [CurveTexture].
   */
  public var hueVariationCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var animSpeed: Vector2
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum equivalent of [animSpeedMax].
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
   * Maximum particle animation speed. Animation speed of `1` means that the particles will make
   * full `0` to `1` offset cycle during lifetime, `2` means `2` cycles etc.
   * With animation speed greater than `1`, remember to enable
   * [CanvasItemMaterial.particlesAnimLoop] property if you want the animation to repeat.
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
   * Each particle's animation speed will vary along this [CurveTexture].
   */
  public var animSpeedCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var animOffset: Vector2
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum equivalent of [animOffsetMax].
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
   * Maximum animation offset that corresponds to frame index in the texture. `0` is the first
   * frame, `1` is the last one. See [CanvasItemMaterial.particlesAnimation].
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
   * Each particle's animation offset will vary along this [CurveTexture].
   */
  public var animOffsetCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
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
  public var turbulenceEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceEnabledPtr, NIL)
    }

  /**
   * The turbulence noise strength. Increasing this will result in a stronger, more contrasting,
   * flow pattern.
   */
  public var turbulenceNoiseStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceNoiseStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceNoiseStrengthPtr, NIL)
    }

  /**
   * This value controls the overall scale/frequency of the turbulence noise pattern.
   * A small scale will result in smaller features with more detail while a high scale will result
   * in smoother noise with larger features.
   */
  public var turbulenceNoiseScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceNoiseScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceNoiseScalePtr, NIL)
    }

  /**
   * A scrolling velocity for the turbulence field. This sets a directional trend for the pattern to
   * move in over time.
   * The default value of `Vector3(0, 0, 0)` turns off the scrolling.
   */
  @CoreTypeLocalCopy
  public var turbulenceNoiseSpeed: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceNoiseSpeedPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceNoiseSpeedPtr, NIL)
    }

  /**
   * The in-place rate of change of the turbulence field. This defines how quickly the noise pattern
   * varies over time.
   * A value of 0.0 will result in a fixed pattern.
   */
  public var turbulenceNoiseSpeedRandom: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceNoiseSpeedRandomPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceNoiseSpeedRandomPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var turbulenceInfluence: Vector2
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum turbulence influence on each particle.
   * The actual amount of turbulence influence on each particle is calculated as a random value
   * between [turbulenceInfluenceMin] and [turbulenceInfluenceMax] and multiplied by the amount of
   * turbulence influence from [turbulenceInfluenceOverLife].
   */
  public var turbulenceInfluenceMin: Float
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum turbulence influence on each particle.
   * The actual amount of turbulence influence on each particle is calculated as a random value
   * between [turbulenceInfluenceMin] and [turbulenceInfluenceMax] and multiplied by the amount of
   * turbulence influence from [turbulenceInfluenceOverLife].
   */
  public var turbulenceInfluenceMax: Float
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var turbulenceInitialDisplacement: Vector2
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Minimum displacement of each particle's spawn position by the turbulence.
   * The actual amount of displacement will be a factor of the underlying turbulence multiplied by a
   * random value between [turbulenceInitialDisplacementMin] and [turbulenceInitialDisplacementMax].
   */
  public var turbulenceInitialDisplacementMin: Float
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum displacement of each particle's spawn position by the turbulence.
   * The actual amount of displacement will be a factor of the underlying turbulence multiplied by a
   * random value between [turbulenceInitialDisplacementMin] and [turbulenceInitialDisplacementMax].
   */
  public var turbulenceInitialDisplacementMax: Float
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's amount of turbulence will be influenced along this [CurveTexture] over its life
   * time.
   */
  public var turbulenceInfluenceOverLife: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 12L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 12L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
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
  public var collisionMode: CollisionMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionModePtr, LONG)
      return ParticleProcessMaterial.CollisionMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionModePtr, NIL)
    }

  /**
   * The particles' friction. Values range from `0` (frictionless) to `1` (maximum friction). Only
   * effective if [collisionMode] is [COLLISION_RIGID].
   */
  public var collisionFriction: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionFrictionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionFrictionPtr, NIL)
    }

  /**
   * The particles' bounciness. Values range from `0` (no bounce) to `1` (full bounciness). Only
   * effective if [collisionMode] is [COLLISION_RIGID].
   */
  public var collisionBounce: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionBouncePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionBouncePtr, NIL)
    }

  /**
   * If `true`, [GPUParticles3D.collisionBaseSize] is multiplied by the particle's effective scale
   * (see [scaleMin], [scaleMax], [scaleCurve], and [scaleOverVelocityCurve]).
   */
  public var collisionUseScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollisionUsingScalePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionUseScalePtr, NIL)
    }

  /**
   * The particle subemitter mode (see [GPUParticles2D.subEmitter] and [GPUParticles3D.subEmitter]).
   */
  public var subEmitterMode: SubEmitterMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterModePtr, LONG)
      return ParticleProcessMaterial.SubEmitterMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterModePtr, NIL)
    }

  /**
   * The frequency at which particles should be emitted from the subemitter node. One particle will
   * be spawned every [subEmitterFrequency] seconds.
   * **Note:** This value shouldn't exceed [GPUParticles2D.amount] or [GPUParticles3D.amount]
   * defined on the *subemitter node* (not the main node), relative to the subemitter's particle
   * lifetime. If the number of particles is exceeded, no new particles will spawn from the subemitter
   * until enough particles have expired.
   */
  public var subEmitterFrequency: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterFrequencyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterFrequencyPtr, NIL)
    }

  /**
   * The amount of particles to spawn from the subemitter node when the particle expires.
   * **Note:** This value shouldn't exceed [GPUParticles2D.amount] or [GPUParticles3D.amount]
   * defined on the *subemitter node* (not the main node), relative to the subemitter's particle
   * lifetime. If the number of particles is exceeded, no new particles will spawn from the subemitter
   * until enough particles have expired.
   */
  public var subEmitterAmountAtEnd: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterAmountAtEndPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterAmountAtEndPtr, NIL)
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
  public var subEmitterAmountAtCollision: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterAmountAtCollisionPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterAmountAtCollisionPtr, NIL)
    }

  /**
   * If `true`, the subemitter inherits the parent particle's velocity when it spawns.
   */
  public var subEmitterKeepVelocity: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterKeepVelocityPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterKeepVelocityPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PARTICLEPROCESSMATERIAL, scriptIndex)
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
  public open fun emissionShapeOffsetMutate(block: Vector3.() -> Unit): Vector3 =
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
  public open fun emissionShapeScaleMutate(block: Vector3.() -> Unit): Vector3 =
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
  public open fun emissionBoxExtentsMutate(block: Vector3.() -> Unit): Vector3 =
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
  public open fun emissionRingAxisMutate(block: Vector3.() -> Unit): Vector3 =
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
  public open fun angleMutate(block: Vector2.() -> Unit): Vector2 = angle.apply{
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
  public open fun velocityPivotMutate(block: Vector3.() -> Unit): Vector3 = velocityPivot.apply{
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
  public open fun directionMutate(block: Vector3.() -> Unit): Vector3 = direction.apply{
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
  public open fun initialVelocityMutate(block: Vector2.() -> Unit): Vector2 = initialVelocity.apply{
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
  public open fun angularVelocityMutate(block: Vector2.() -> Unit): Vector2 = angularVelocity.apply{
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
  public open fun directionalVelocityMutate(block: Vector2.() -> Unit): Vector2 =
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
  public open fun orbitVelocityMutate(block: Vector2.() -> Unit): Vector2 = orbitVelocity.apply{
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
  public open fun radialVelocityMutate(block: Vector2.() -> Unit): Vector2 = radialVelocity.apply{
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
  public open fun gravityMutate(block: Vector3.() -> Unit): Vector3 = gravity.apply{
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
  public open fun linearAccelMutate(block: Vector2.() -> Unit): Vector2 = linearAccel.apply{
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
  public open fun radialAccelMutate(block: Vector2.() -> Unit): Vector2 = radialAccel.apply{
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
  public open fun tangentialAccelMutate(block: Vector2.() -> Unit): Vector2 = tangentialAccel.apply{
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
  public open fun dampingMutate(block: Vector2.() -> Unit): Vector2 = damping.apply{
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
  public open fun scaleMutate(block: Vector2.() -> Unit): Vector2 = scale.apply{
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
  public open fun scaleOverVelocityMutate(block: Vector2.() -> Unit): Vector2 =
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
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
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
  public open fun hueVariationMutate(block: Vector2.() -> Unit): Vector2 = hueVariation.apply{
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
  public open fun animSpeedMutate(block: Vector2.() -> Unit): Vector2 = animSpeed.apply{
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
  public open fun animOffsetMutate(block: Vector2.() -> Unit): Vector2 = animOffset.apply{
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
  public open fun turbulenceNoiseSpeedMutate(block: Vector3.() -> Unit): Vector3 =
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
  public open fun turbulenceInfluenceMutate(block: Vector2.() -> Unit): Vector2 =
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
  public open fun turbulenceInitialDisplacementMutate(block: Vector2.() -> Unit): Vector2 =
      turbulenceInitialDisplacement.apply{
      block(this)
      turbulenceInitialDisplacement = this
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_direction")

    public val getDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_direction")

    public val setInheritVelocityRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_inherit_velocity_ratio")

    public val getInheritVelocityRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_inherit_velocity_ratio")

    public val setSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_spread")

    public val getSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_spread")

    public val setFlatnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_flatness")

    public val getFlatnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_flatness")

    public val setParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_param")

    public val getParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_param")

    public val setParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_param_min")

    public val getParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_param_min")

    public val setParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_param_max")

    public val getParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_param_max")

    public val setParamTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_param_texture")

    public val getParamTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_param_texture")

    public val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_color")

    public val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_color")

    public val setColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_color_ramp")

    public val getColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_color_ramp")

    public val setAlphaCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_alpha_curve")

    public val getAlphaCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_alpha_curve")

    public val setEmissionCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_curve")

    public val getEmissionCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_curve")

    public val setColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_color_initial_ramp")

    public val getColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_color_initial_ramp")

    public val setVelocityLimitCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_velocity_limit_curve")

    public val getVelocityLimitCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_velocity_limit_curve")

    public val setParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_particle_flag")

    public val getParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_particle_flag")

    public val setVelocityPivotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_velocity_pivot")

    public val getVelocityPivotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_velocity_pivot")

    public val setEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_shape")

    public val getEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_shape")

    public val setEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_sphere_radius")

    public val getEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_sphere_radius")

    public val setEmissionBoxExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_box_extents")

    public val getEmissionBoxExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_box_extents")

    public val setEmissionPointTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_point_texture")

    public val getEmissionPointTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_point_texture")

    public val setEmissionNormalTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_normal_texture")

    public val getEmissionNormalTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_normal_texture")

    public val setEmissionColorTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_color_texture")

    public val getEmissionColorTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_color_texture")

    public val setEmissionPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_point_count")

    public val getEmissionPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_point_count")

    public val setEmissionRingAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_axis")

    public val getEmissionRingAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_axis")

    public val setEmissionRingHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_height")

    public val getEmissionRingHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_height")

    public val setEmissionRingRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_radius")

    public val getEmissionRingRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_radius")

    public val setEmissionRingInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_inner_radius")

    public val getEmissionRingInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_inner_radius")

    public val setEmissionShapeOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_shape_offset")

    public val getEmissionShapeOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_shape_offset")

    public val setEmissionShapeScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_shape_scale")

    public val getEmissionShapeScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_shape_scale")

    public val getTurbulenceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_enabled")

    public val setTurbulenceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_enabled")

    public val getTurbulenceNoiseStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_strength")

    public val setTurbulenceNoiseStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_strength")

    public val getTurbulenceNoiseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_scale")

    public val setTurbulenceNoiseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_scale")

    public val getTurbulenceNoiseSpeedRandomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_speed_random")

    public val setTurbulenceNoiseSpeedRandomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_speed_random")

    public val getTurbulenceNoiseSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_speed")

    public val setTurbulenceNoiseSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_speed")

    public val getGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_gravity")

    public val setGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_gravity")

    public val setLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_lifetime_randomness")

    public val getLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_lifetime_randomness")

    public val getSubEmitterModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_mode")

    public val setSubEmitterModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_mode")

    public val getSubEmitterFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_frequency")

    public val setSubEmitterFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_frequency")

    public val getSubEmitterAmountAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_amount_at_end")

    public val setSubEmitterAmountAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_amount_at_end")

    public val getSubEmitterAmountAtCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_amount_at_collision")

    public val setSubEmitterAmountAtCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_amount_at_collision")

    public val getSubEmitterKeepVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_keep_velocity")

    public val setSubEmitterKeepVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_keep_velocity")

    public val setAttractorInteractionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_attractor_interaction_enabled")

    public val isAttractorInteractionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "is_attractor_interaction_enabled")

    public val setCollisionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_mode")

    public val getCollisionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_collision_mode")

    public val setCollisionUseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_use_scale")

    public val isCollisionUsingScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "is_collision_using_scale")

    public val setCollisionFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_friction")

    public val getCollisionFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_collision_friction")

    public val setCollisionBouncePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_bounce")

    public val getCollisionBouncePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_collision_bounce")
  }
}
