// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Particle properties for [godot.GPUParticles3D] and [godot.GPUParticles2D] nodes.
 *
 * ParticlesMaterial defines particle properties and behavior. It is used in the `process_material` of [godot.GPUParticles3D] and [godot.GPUParticles2D] emitter nodes.
 *
 * Some of this material's properties are applied to each particle when emitted, while others can have a [godot.CurveTexture] applied to vary values over the lifetime of the particle.
 *
 * Particle animation is available only in [godot.GPUParticles2D]. To use it, attach a [godot.CanvasItemMaterial], with [godot.CanvasItemMaterial.particlesAnimation] enabled, to the particles node.
 */
@GodotBaseType
public open class ParticlesMaterial : Material() {
  /**
   * Particle lifetime randomness ratio. The lifetime will be multiplied by a value interpolated between `1.0` and a random number less than one. For example a random ratio of `0.4` would scale the original lifetime between `0.4-1.0` of its original value.
   */
  public var lifetimeRandomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_LIFETIME_RANDOMNESS, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_LIFETIME_RANDOMNESS, NIL.ordinal)
    }

  /**
   * Particles will be emitted inside this region. Use [enum EmissionShape] constants for values.
   */
  public var emissionShape: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_SHAPE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_SHAPE,
          NIL.ordinal)
    }

  /**
   * The sphere's radius if `emission_shape` is set to [EMISSION_SHAPE_SPHERE].
   */
  public var emissionSphereRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_SPHERE_RADIUS, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_SPHERE_RADIUS, NIL.ordinal)
    }

  /**
   * The box's extents if `emission_shape` is set to [EMISSION_SHAPE_BOX].
   */
  public var emissionBoxExtents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_BOX_EXTENTS, VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_BOX_EXTENTS, NIL.ordinal)
    }

  /**
   * Particles will be emitted at positions determined by sampling this texture at a random position. Used with [EMISSION_SHAPE_POINTS] and [EMISSION_SHAPE_DIRECTED_POINTS]. Can be created automatically from mesh or node by selecting "Create Emission Points from Mesh/Node" under the "Particles" tool in the toolbar.
   */
  public var emissionPointTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_POINT_TEXTURE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_POINT_TEXTURE, NIL.ordinal)
    }

  /**
   * Particle velocity and rotation will be set by sampling this texture at the same point as the [emissionPointTexture]. Used only in [EMISSION_SHAPE_DIRECTED_POINTS]. Can be created automatically from mesh or node by selecting "Create Emission Points from Mesh/Node" under the "Particles" tool in the toolbar.
   */
  public var emissionNormalTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_NORMAL_TEXTURE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_NORMAL_TEXTURE, NIL.ordinal)
    }

  /**
   * Particle color will be modulated by color determined by sampling this texture at the same point as the [emissionPointTexture].
   */
  public var emissionColorTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_COLOR_TEXTURE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_COLOR_TEXTURE, NIL.ordinal)
    }

  /**
   * The number of emission points if `emission_shape` is set to [EMISSION_SHAPE_POINTS] or [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public var emissionPointCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_POINT_COUNT, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_POINT_COUNT, NIL.ordinal)
    }

  /**
   * The axis of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingAxis: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_RING_AXIS, VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_RING_AXIS, NIL.ordinal)
    }

  /**
   * The height of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingHeight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_RING_HEIGHT, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_RING_HEIGHT, NIL.ordinal)
    }

  /**
   * The radius of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_RING_RADIUS, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_RING_RADIUS, NIL.ordinal)
    }

  /**
   * The inner radius of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingInnerRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_RING_INNER_RADIUS, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_RING_INNER_RADIUS, NIL.ordinal)
    }

  /**
   * Unit vector specifying the particles' emission direction.
   */
  public var direction: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_DIRECTION,
          VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_DIRECTION,
          NIL.ordinal)
    }

  /**
   * Each particle's initial direction range from `+spread` to `-spread` degrees.
   */
  public var spread: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_SPREAD,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_SPREAD,
          NIL.ordinal)
    }

  /**
   * Amount of [spread] along the Y axis.
   */
  public var flatness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_FLATNESS,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_FLATNESS,
          NIL.ordinal)
    }

  /**
   * Gravity applied to every particle.
   */
  public var gravity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_GRAVITY,
          VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_GRAVITY,
          NIL.ordinal)
    }

  /**
   * Each particle's initial color. If the [godot.GPUParticles2D]'s `texture` is defined, it will be multiplied by this color. To have particle display color in a [godot.BaseMaterial3D] make sure to set [godot.BaseMaterial3D.vertexColorUseAsAlbedo] to `true`.
   */
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_COLOR,
          COLOR.ordinal)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_COLOR,
          NIL.ordinal)
    }

  /**
   * Each particle's color will vary along this [godot.GradientTexture1D] over its lifetime (multiplied with [color]).
   */
  public var colorRamp: GradientTexture1D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_COLOR_RAMP,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as GradientTexture1D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_COLOR_RAMP,
          NIL.ordinal)
    }

  /**
   * Each particle's initial color will vary along this [godot.GradientTexture1D] (multiplied with [color]).
   */
  public var colorInitialRamp: GradientTexture1D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_COLOR_INITIAL_RAMP, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as GradientTexture1D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_COLOR_INITIAL_RAMP, NIL.ordinal)
    }

  /**
   *
   */
  public var subEmitterMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_SUB_EMITTER_MODE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_SUB_EMITTER_MODE,
          NIL.ordinal)
    }

  /**
   *
   */
  public var subEmitterFrequency: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_SUB_EMITTER_FREQUENCY, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_SUB_EMITTER_FREQUENCY, NIL.ordinal)
    }

  /**
   *
   */
  public var subEmitterAmountAtEnd: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_SUB_EMITTER_AMOUNT_AT_END, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_SUB_EMITTER_AMOUNT_AT_END, NIL.ordinal)
    }

  /**
   *
   */
  public var subEmitterKeepVelocity: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_SUB_EMITTER_KEEP_VELOCITY, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_SUB_EMITTER_KEEP_VELOCITY, NIL.ordinal)
    }

  /**
   * True if the interaction with particle attractors is enabled.
   */
  public var attractorInteractionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_IS_ATTRACTOR_INTERACTION_ENABLED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ATTRACTOR_INTERACTION_ENABLED, NIL.ordinal)
    }

  /**
   * True if collisions are enabled for this particle system.
   */
  public var collisionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_IS_COLLISION_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_COLLISION_ENABLED, NIL.ordinal)
    }

  /**
   * Collision friction.
   */
  public var collisionFriction: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_COLLISION_FRICTION, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_COLLISION_FRICTION, NIL.ordinal)
    }

  /**
   * Collision bounciness.
   */
  public var collisionBounce: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_COLLISION_BOUNCE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_COLLISION_BOUNCE,
          NIL.ordinal)
    }

  /**
   * Should collision take scale into account.
   */
  public var collisionUseScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_IS_COLLISION_USING_SCALE, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_COLLISION_USE_SCALE, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PARTICLESMATERIAL)
  }

  /**
   * Sets the minimum value range for the given parameter.
   */
  public fun setParamMin(`param`: ParticlesMaterial.Parameter, `value`: Double): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_PARAM_MIN,
        NIL.ordinal)
  }

  /**
   * Returns the minimum value range for the given parameter.
   */
  public fun getParamMin(`param`: ParticlesMaterial.Parameter): Double {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_PARAM_MIN,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the maximum value range for the given parameter.
   */
  public fun setParamMax(`param`: ParticlesMaterial.Parameter, `value`: Double): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_PARAM_MAX,
        NIL.ordinal)
  }

  /**
   * Returns the maximum value range for the given parameter.
   */
  public fun getParamMax(`param`: ParticlesMaterial.Parameter): Double {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_PARAM_MAX,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the [godot.Texture2D] for the specified [enum Parameter].
   */
  public fun setParamTexture(`param`: ParticlesMaterial.Parameter, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to param.id, OBJECT to texture)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_PARAM_TEXTURE,
        NIL.ordinal)
  }

  /**
   * Returns the [godot.Texture2D] used by the specified parameter.
   */
  public fun getParamTexture(`param`: ParticlesMaterial.Parameter): Texture2D? {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_PARAM_TEXTURE,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * If `true`, enables the specified particle flag. See [enum ParticleFlags] for options.
   */
  public fun setParticleFlag(particleFlag: ParticlesMaterial.ParticleFlags, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to particleFlag.id, BOOL to enable)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_PARTICLE_FLAG,
        NIL.ordinal)
  }

  /**
   * Returns `true` if the specified particle flag is enabled. See [enum ParticleFlags] for options.
   */
  public fun getParticleFlag(particleFlag: ParticlesMaterial.ParticleFlags): Boolean {
    TransferContext.writeArguments(LONG to particleFlag.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_PARTICLE_FLAG,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SubEmitterMode(
    id: Long
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
     *
     */
    SUB_EMITTER_MAX(4),
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

  public companion object
}
