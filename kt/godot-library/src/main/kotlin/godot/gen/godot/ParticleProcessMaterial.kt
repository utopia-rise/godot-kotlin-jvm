// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Particle properties for [godot.GPUParticles3D] and [godot.GPUParticles2D] nodes.
 *
 * ParticleProcessMaterial defines particle properties and behavior. It is used in the `process_material` of [godot.GPUParticles3D] and [godot.GPUParticles2D] emitter nodes.
 *
 * Some of this material's properties are applied to each particle when emitted, while others can have a [godot.CurveTexture] applied to vary values over the lifetime of the particle.
 *
 * Particle animation is available only in [godot.GPUParticles2D]. To use it, attach a [godot.CanvasItemMaterial], with [godot.CanvasItemMaterial.particlesAnimation] enabled, to the particles node.
 */
@GodotBaseType
public open class ParticleProcessMaterial : Material() {
  /**
   * Particle lifetime randomness ratio. The equation for the lifetime of a particle is `lifetime * (1.0 - randf() * lifetime_randomness)`. For example, a [lifetimeRandomness] of `0.4` scales the lifetime between `0.6` to `1.0` of its original value.
   */
  public var lifetimeRandomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_LIFETIME_RANDOMNESS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_LIFETIME_RANDOMNESS, NIL)
    }

  /**
   * Particles will be emitted inside this region. Use [enum EmissionShape] constants for values.
   */
  public var emissionShape: EmissionShape
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_EMISSION_SHAPE, LONG)
      return ParticleProcessMaterial.EmissionShape.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_EMISSION_SHAPE, NIL)
    }

  /**
   * The sphere's radius if `emission_shape` is set to [EMISSION_SHAPE_SPHERE].
   */
  public var emissionSphereRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_EMISSION_SPHERE_RADIUS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_EMISSION_SPHERE_RADIUS, NIL)
    }

  /**
   * The box's extents if `emission_shape` is set to [EMISSION_SHAPE_BOX].
   */
  public var emissionBoxExtents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_EMISSION_BOX_EXTENTS, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_EMISSION_BOX_EXTENTS, NIL)
    }

  /**
   * Particles will be emitted at positions determined by sampling this texture at a random position. Used with [EMISSION_SHAPE_POINTS] and [EMISSION_SHAPE_DIRECTED_POINTS]. Can be created automatically from mesh or node by selecting "Create Emission Points from Mesh/Node" under the "Particles" tool in the toolbar.
   */
  public var emissionPointTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_EMISSION_POINT_TEXTURE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_EMISSION_POINT_TEXTURE, NIL)
    }

  /**
   * Particle velocity and rotation will be set by sampling this texture at the same point as the [emissionPointTexture]. Used only in [EMISSION_SHAPE_DIRECTED_POINTS]. Can be created automatically from mesh or node by selecting "Create Emission Points from Mesh/Node" under the "Particles" tool in the toolbar.
   */
  public var emissionNormalTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_EMISSION_NORMAL_TEXTURE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_EMISSION_NORMAL_TEXTURE, NIL)
    }

  /**
   * Particle color will be modulated by color determined by sampling this texture at the same point as the [emissionPointTexture].
   *
   * **Note:** [emissionColorTexture] multiplies the particle mesh's vertex colors. To have a visible effect on a [godot.BaseMaterial3D], [godot.BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a [godot.ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function. Otherwise, [emissionColorTexture] will have no visible effect.
   */
  public var emissionColorTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_EMISSION_COLOR_TEXTURE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_EMISSION_COLOR_TEXTURE, NIL)
    }

  /**
   * The number of emission points if `emission_shape` is set to [EMISSION_SHAPE_POINTS] or [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public var emissionPointCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_EMISSION_POINT_COUNT, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_EMISSION_POINT_COUNT, NIL)
    }

  /**
   * The axis of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingAxis: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_EMISSION_RING_AXIS, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_EMISSION_RING_AXIS, NIL)
    }

  /**
   * The height of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingHeight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_EMISSION_RING_HEIGHT, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_EMISSION_RING_HEIGHT, NIL)
    }

  /**
   * The radius of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_EMISSION_RING_RADIUS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_EMISSION_RING_RADIUS, NIL)
    }

  /**
   * The inner radius of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingInnerRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_EMISSION_RING_INNER_RADIUS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_EMISSION_RING_INNER_RADIUS, NIL)
    }

  /**
   * Unit vector specifying the particles' emission direction.
   */
  public var direction: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_DIRECTION, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_DIRECTION, NIL)
    }

  /**
   * Each particle's initial direction range from `+spread` to `-spread` degrees.
   */
  public var spread: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_SPREAD, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_SPREAD, NIL)
    }

  /**
   * Amount of [spread] along the Y axis.
   */
  public var flatness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_FLATNESS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_FLATNESS, NIL)
    }

  /**
   * Gravity applied to every particle.
   */
  public var gravity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_GRAVITY, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_GRAVITY, NIL)
    }

  /**
   * Each particle's initial color. If the [godot.GPUParticles2D]'s `texture` is defined, it will be multiplied by this color.
   *
   * **Note:** [color] multiplies the particle mesh's vertex colors. To have a visible effect on a [godot.BaseMaterial3D], [godot.BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a [godot.ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function. Otherwise, [color] will have no visible effect.
   */
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_COLOR,
          COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_COLOR,
          NIL)
    }

  /**
   * Each particle's color will vary along this [godot.GradientTexture1D] over its lifetime (multiplied with [color]).
   *
   * **Note:** [colorRamp] multiplies the particle mesh's vertex colors. To have a visible effect on a [godot.BaseMaterial3D], [godot.BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a [godot.ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function. Otherwise, [colorRamp] will have no visible effect.
   */
  public var colorRamp: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_COLOR_RAMP, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_COLOR_RAMP, NIL)
    }

  /**
   * Each particle's initial color will vary along this [godot.GradientTexture1D] (multiplied with [color]).
   *
   * **Note:** [colorInitialRamp] multiplies the particle mesh's vertex colors. To have a visible effect on a [godot.BaseMaterial3D], [godot.BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a [godot.ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function. Otherwise, [colorInitialRamp] will have no visible effect.
   */
  public var colorInitialRamp: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_COLOR_INITIAL_RAMP, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_COLOR_INITIAL_RAMP, NIL)
    }

  /**
   * If `true`, enables turbulence for the particle system. Turbulence can be used to vary particle movement according to its position (based on a 3D noise pattern). In 3D, [godot.GPUParticlesAttractorVectorField3D] with [godot.NoiseTexture3D] can be used as an alternative to turbulence that works in world space and with multiple particle systems reacting in the same way.
   *
   * **Note:** Enabling turbulence has a high performance cost on the GPU. Only enable turbulence on a few particle systems at once at most, and consider disabling it when targeting mobile/web platforms.
   */
  public var turbulenceEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_TURBULENCE_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_TURBULENCE_ENABLED, NIL)
    }

  /**
   * The turbulence noise strength. Increasing this will result in a stronger, more contrasting, flow pattern.
   */
  public var turbulenceNoiseStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_TURBULENCE_NOISE_STRENGTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_TURBULENCE_NOISE_STRENGTH, NIL)
    }

  /**
   * This value controls the overall scale/frequency of the turbulence noise pattern.
   *
   * A small scale will result in smaller features with more detail while a high scale will result in smoother noise with larger features.
   */
  public var turbulenceNoiseScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_TURBULENCE_NOISE_SCALE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_TURBULENCE_NOISE_SCALE, NIL)
    }

  /**
   * A scrolling velocity for the turbulence field. This sets a directional trend for the pattern to move in over time.
   *
   * The default value of `Vector3(0, 0, 0)` turns off the scrolling.
   */
  public var turbulenceNoiseSpeed: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_TURBULENCE_NOISE_SPEED, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_TURBULENCE_NOISE_SPEED, NIL)
    }

  /**
   * The in-place rate of change of the turbulence field. This defines how quickly the noise pattern varies over time.
   *
   * A value of 0.0 will result in a fixed pattern.
   */
  public var turbulenceNoiseSpeedRandom: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_TURBULENCE_NOISE_SPEED_RANDOM,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_TURBULENCE_NOISE_SPEED_RANDOM, NIL)
    }

  /**
   *
   */
  public var subEmitterMode: SubEmitterMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_SUB_EMITTER_MODE, LONG)
      return ParticleProcessMaterial.SubEmitterMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_SUB_EMITTER_MODE, NIL)
    }

  /**
   *
   */
  public var subEmitterFrequency: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_SUB_EMITTER_FREQUENCY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_SUB_EMITTER_FREQUENCY, NIL)
    }

  /**
   *
   */
  public var subEmitterAmountAtEnd: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_SUB_EMITTER_AMOUNT_AT_END, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_SUB_EMITTER_AMOUNT_AT_END, NIL)
    }

  /**
   * Sub particle amount on collision.
   *
   * Maximum amount set in the sub particles emitter.
   */
  public var subEmitterAmountAtCollision: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_SUB_EMITTER_AMOUNT_AT_COLLISION,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_SUB_EMITTER_AMOUNT_AT_COLLISION, NIL)
    }

  /**
   *
   */
  public var subEmitterKeepVelocity: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_SUB_EMITTER_KEEP_VELOCITY, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_SUB_EMITTER_KEEP_VELOCITY, NIL)
    }

  /**
   * True if the interaction with particle attractors is enabled.
   */
  public var attractorInteractionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_IS_ATTRACTOR_INTERACTION_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_ATTRACTOR_INTERACTION_ENABLED, NIL)
    }

  /**
   * The particles' collision mode.
   *
   * **Note:** 3D Particles can only collide with [godot.GPUParticlesCollision3D] nodes, not [godot.PhysicsBody3D] nodes. To make particles collide with various objects, you can add [godot.GPUParticlesCollision3D] nodes as children of [godot.PhysicsBody3D] nodes.
   *
   * **Note:** 2D Particles can only collide with [godot.LightOccluder2D] nodes, not [godot.PhysicsBody2D] nodes.
   */
  public var collisionMode: CollisionMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_COLLISION_MODE, LONG)
      return ParticleProcessMaterial.CollisionMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_COLLISION_MODE, NIL)
    }

  /**
   * The particles' friction. Values range from `0` (frictionless) to `1` (maximum friction). Only effective if [collisionMode] is [COLLISION_RIGID].
   */
  public var collisionFriction: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_COLLISION_FRICTION, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_COLLISION_FRICTION, NIL)
    }

  /**
   * The particles' bounciness. Values range from `0` (no bounce) to `1` (full bounciness). Only effective if [collisionMode] is [COLLISION_RIGID].
   */
  public var collisionBounce: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_COLLISION_BOUNCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_COLLISION_BOUNCE, NIL)
    }

  /**
   * Should collision take scale into account.
   */
  public var collisionUseScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_IS_COLLISION_USING_SCALE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_COLLISION_USE_SCALE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PARTICLEPROCESSMATERIAL, scriptIndex)
    return true
  }

  /**
   * Sets the minimum value range for the given parameter.
   */
  public fun setParamMin(`param`: Parameter, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_PARAM_MIN, NIL)
  }

  /**
   * Returns the minimum value range for the given parameter.
   */
  public fun getParamMin(`param`: Parameter): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_PARAM_MIN, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the maximum value range for the given parameter.
   */
  public fun setParamMax(`param`: Parameter, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_PARAM_MAX, NIL)
  }

  /**
   * Returns the maximum value range for the given parameter.
   */
  public fun getParamMax(`param`: Parameter): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_PARAM_MAX, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the [godot.Texture2D] for the specified [enum Parameter].
   */
  public fun setParamTexture(`param`: Parameter, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to param.id, OBJECT to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_PARAM_TEXTURE, NIL)
  }

  /**
   * Returns the [godot.Texture2D] used by the specified parameter.
   */
  public fun getParamTexture(`param`: Parameter): Texture2D? {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_PARAM_TEXTURE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * If `true`, enables the specified particle flag. See [enum ParticleFlags] for options.
   */
  public fun setParticleFlag(particleFlag: ParticleFlags, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to particleFlag.id, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_SET_PARTICLE_FLAG, NIL)
  }

  /**
   * Returns `true` if the specified particle flag is enabled. See [enum ParticleFlags] for options.
   */
  public fun getParticleFlag(particleFlag: ParticleFlags): Boolean {
    TransferContext.writeArguments(LONG to particleFlag.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PARTICLEPROCESSMATERIAL_GET_PARTICLE_FLAG, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class Parameter(
    id: Long,
  ) {
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set initial velocity properties.
     */
    PARAM_INITIAL_LINEAR_VELOCITY(0),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set angular velocity properties.
     */
    PARAM_ANGULAR_VELOCITY(1),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set orbital velocity properties.
     */
    PARAM_ORBIT_VELOCITY(2),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set linear acceleration properties.
     */
    PARAM_LINEAR_ACCEL(3),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set radial acceleration properties.
     */
    PARAM_RADIAL_ACCEL(4),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set tangential acceleration properties.
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
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set animation speed properties.
     */
    PARAM_ANIM_SPEED(10),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set animation offset properties.
     */
    PARAM_ANIM_OFFSET(11),
    /**
     * Represents the size of the [enum Parameter] enum.
     */
    PARAM_MAX(15),
    /**
     * Use with [setParamMin] and [setParamMax] to set the turbulence minimum und maximum influence on each particles velocity.
     */
    PARAM_TURB_VEL_INFLUENCE(13),
    /**
     * Use with [setParamMin] and [setParamMax] to set the turbulence minimum and maximum displacement of the particles spawn position.
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
     * Particles will be emitted at a position determined by sampling a random point on the [emissionPointTexture]. Particle color will be modulated by [emissionColorTexture].
     */
    EMISSION_SHAPE_POINTS(4),
    /**
     * Particles will be emitted at a position determined by sampling a random point on the [emissionPointTexture]. Particle velocity and rotation will be set based on [emissionNormalTexture]. Particle color will be modulated by [emissionColorTexture].
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SubEmitterMode(
    id: Long,
  ) {
    /**
     *
     */
    SUB_EMITTER_DISABLED(0),
    /**
     *
     */
    SUB_EMITTER_CONSTANT(1),
    /**
     *
     */
    SUB_EMITTER_AT_END(2),
    /**
     *
     */
    SUB_EMITTER_AT_COLLISION(3),
    /**
     * Represents the size of the [enum SubEmitterMode] enum.
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
     * No collision for particles. Particles will go through [godot.GPUParticlesCollision3D] nodes.
     */
    COLLISION_DISABLED(0),
    /**
     * [godot.RigidBody3D]-style collision for particles using [godot.GPUParticlesCollision3D] nodes.
     */
    COLLISION_RIGID(1),
    /**
     * Hide particles instantly when colliding with a [godot.GPUParticlesCollision3D] node. This can be combined with a subemitter that uses the [COLLISION_RIGID] collision mode to "replace" the parent particle with the subemitter on impact.
     */
    COLLISION_HIDE_ON_CONTACT(2),
    /**
     * Represents the size of the [enum CollisionMode] enum.
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
}
