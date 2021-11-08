// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
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
 * Particle properties for [godot.Particles] and [godot.Particles2D] nodes.
 *
 * ParticlesMaterial defines particle properties and behavior. It is used in the `process_material` of [godot.Particles] and [godot.Particles2D] emitter nodes.
 *
 * Some of this material's properties are applied to each particle when emitted, while others can have a [godot.CurveTexture] applied to vary values over the lifetime of the particle.
 *
 * When a randomness ratio is applied to a property it is used to scale that property by a random amount. The random ratio is used to interpolate between `1.0` and a random number less than one, the result is multiplied by the property to obtain the randomized property. For example a random ratio of `0.4` would scale the original property between `0.4-1.0` of its original value.
 */
@GodotBaseType
public open class ParticlesMaterial : Material() {
  /**
   * Initial rotation applied to each particle, in degrees.
   *
   * Only applied when [flagDisableZ] or [flagRotateY] are `true` or the [godot.SpatialMaterial] being used to draw the particle is using [godot.SpatialMaterial.BILLBOARD_PARTICLES].
   */
  public open var angle: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ANGLE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ANGLE, NIL)
    }

  /**
   * Each particle's rotation will be animated along this [godot.CurveTexture].
   */
  public open var angleCurve: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ANGLE_CURVE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ANGLE_CURVE,
          NIL)
    }

  /**
   * Rotation randomness ratio.
   */
  public open var angleRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ANGLE_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ANGLE_RANDOM, NIL)
    }

  /**
   * Initial angular velocity applied to each particle. Sets the speed of rotation of the particle.
   *
   * Only applied when [flagDisableZ] or [flagRotateY] are `true` or the [godot.SpatialMaterial] being used to draw the particle is using [godot.SpatialMaterial.BILLBOARD_PARTICLES].
   */
  public open var angularVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ANGULAR_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ANGULAR_VELOCITY, NIL)
    }

  /**
   * Each particle's angular velocity will vary along this [godot.CurveTexture].
   */
  public open var angularVelocityCurve: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ANGULAR_VELOCITY_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ANGULAR_VELOCITY_CURVE, NIL)
    }

  /**
   * Angular velocity randomness ratio.
   */
  public open var angularVelocityRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ANGULAR_VELOCITY_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ANGULAR_VELOCITY_RANDOM, NIL)
    }

  /**
   * Particle animation offset.
   */
  public open var animOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ANIM_OFFSET,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ANIM_OFFSET,
          NIL)
    }

  /**
   * Each particle's animation offset will vary along this [godot.CurveTexture].
   */
  public open var animOffsetCurve: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ANIM_OFFSET_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ANIM_OFFSET_CURVE, NIL)
    }

  /**
   * Animation offset randomness ratio.
   */
  public open var animOffsetRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ANIM_OFFSET_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ANIM_OFFSET_RANDOM, NIL)
    }

  /**
   * Particle animation speed.
   */
  public open var animSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ANIM_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ANIM_SPEED,
          NIL)
    }

  /**
   * Each particle's animation speed will vary along this [godot.CurveTexture].
   */
  public open var animSpeedCurve: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ANIM_SPEED_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ANIM_SPEED_CURVE, NIL)
    }

  /**
   * Animation speed randomness ratio.
   */
  public open var animSpeedRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ANIM_SPEED_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ANIM_SPEED_RANDOM, NIL)
    }

  /**
   * Each particle's initial color. If the [godot.Particles2D]'s `texture` is defined, it will be multiplied by this color. To have particle display color in a [godot.SpatialMaterial] make sure to set [godot.SpatialMaterial.vertexColorUseAsAlbedo] to `true`.
   */
  public open var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_COLOR, NIL)
    }

  /**
   * Each particle's color will vary along this [godot.GradientTexture] over its lifetime (multiplied with [color]).
   */
  public open var colorRamp: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_COLOR_RAMP,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_COLOR_RAMP,
          NIL)
    }

  /**
   * The rate at which particles lose velocity.
   */
  public open var damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_DAMPING,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_DAMPING,
          NIL)
    }

  /**
   * Damping will vary along this [godot.CurveTexture].
   */
  public open var dampingCurve: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_DAMPING_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_DAMPING_CURVE, NIL)
    }

  /**
   * Damping randomness ratio.
   */
  public open var dampingRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_DAMPING_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_DAMPING_RANDOM, NIL)
    }

  /**
   * Unit vector specifying the particles' emission direction.
   */
  public open var direction: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_DIRECTION,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_DIRECTION,
          NIL)
    }

  /**
   * The box's extents if `emission_shape` is set to [EMISSION_SHAPE_BOX].
   */
  public open var emissionBoxExtents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_BOX_EXTENTS, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_BOX_EXTENTS, NIL)
    }

  /**
   * Particle color will be modulated by color determined by sampling this texture at the same point as the [emissionPointTexture].
   */
  public open var emissionColorTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_COLOR_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_COLOR_TEXTURE, NIL)
    }

  /**
   * Particle velocity and rotation will be set by sampling this texture at the same point as the [emissionPointTexture]. Used only in [EMISSION_SHAPE_DIRECTED_POINTS]. Can be created automatically from mesh or node by selecting "Create Emission Points from Mesh/Node" under the "Particles" tool in the toolbar.
   */
  public open var emissionNormalTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_NORMAL_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_NORMAL_TEXTURE, NIL)
    }

  /**
   * The number of emission points if `emission_shape` is set to [EMISSION_SHAPE_POINTS] or [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public open var emissionPointCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_POINT_COUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_POINT_COUNT, NIL)
    }

  /**
   * Particles will be emitted at positions determined by sampling this texture at a random position. Used with [EMISSION_SHAPE_POINTS] and [EMISSION_SHAPE_DIRECTED_POINTS]. Can be created automatically from mesh or node by selecting "Create Emission Points from Mesh/Node" under the "Particles" tool in the toolbar.
   */
  public open var emissionPointTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_POINT_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_POINT_TEXTURE, NIL)
    }

  /**
   * The axis of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public open var emissionRingAxis: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_RING_AXIS, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_RING_AXIS, NIL)
    }

  /**
   * The height of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public open var emissionRingHeight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_RING_HEIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_RING_HEIGHT, NIL)
    }

  /**
   * The inner radius of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public open var emissionRingInnerRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_RING_INNER_RADIUS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_RING_INNER_RADIUS, NIL)
    }

  /**
   * The radius of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public open var emissionRingRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_RING_RADIUS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_RING_RADIUS, NIL)
    }

  /**
   * Particles will be emitted inside this region. Use [enum EmissionShape] constants for values.
   */
  public open var emissionShape: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_SHAPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_SHAPE, NIL)
    }

  /**
   * The sphere's radius if `emission_shape` is set to [EMISSION_SHAPE_SPHERE].
   */
  public open var emissionSphereRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_EMISSION_SPHERE_RADIUS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_EMISSION_SPHERE_RADIUS, NIL)
    }

  /**
   * Align Y axis of particle with the direction of its velocity.
   */
  public open var flagAlignY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_FLAG_ALIGN_Y, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_FLAG_ALIGN_Y, NIL)
    }

  /**
   * If `true`, particles will not move on the z axis.
   */
  public open var flagDisableZ: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_FLAG_DISABLE_Z, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_FLAG_DISABLE_Z, NIL)
    }

  /**
   * If `true`, particles rotate around Y axis by [angle].
   */
  public open var flagRotateY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_FLAG_ROTATE_Y, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_FLAG_ROTATE_Y, NIL)
    }

  /**
   * Amount of [spread] along the Y axis.
   */
  public open var flatness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_FLATNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_FLATNESS,
          NIL)
    }

  /**
   * Gravity applied to every particle.
   */
  public open var gravity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_GRAVITY,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_GRAVITY,
          NIL)
    }

  /**
   * Initial hue variation applied to each particle.
   */
  public open var hueVariation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_HUE_VARIATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_HUE_VARIATION, NIL)
    }

  /**
   * Each particle's hue will vary along this [godot.CurveTexture].
   */
  public open var hueVariationCurve: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_HUE_VARIATION_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_HUE_VARIATION_CURVE, NIL)
    }

  /**
   * Hue variation randomness ratio.
   */
  public open var hueVariationRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_HUE_VARIATION_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_HUE_VARIATION_RANDOM, NIL)
    }

  /**
   * Initial velocity magnitude for each particle. Direction comes from [spread] and the node's orientation.
   */
  public open var initialVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_INITIAL_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_INITIAL_VELOCITY, NIL)
    }

  /**
   * Initial velocity randomness ratio.
   */
  public open var initialVelocityRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_INITIAL_VELOCITY_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_INITIAL_VELOCITY_RANDOM, NIL)
    }

  /**
   * Particle lifetime randomness ratio.
   */
  public open var lifetimeRandomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_LIFETIME_RANDOMNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_LIFETIME_RANDOMNESS, NIL)
    }

  /**
   * Linear acceleration applied to each particle in the direction of motion.
   */
  public open var linearAccel: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_LINEAR_ACCEL, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_LINEAR_ACCEL, NIL)
    }

  /**
   * Each particle's linear acceleration will vary along this [godot.CurveTexture].
   */
  public open var linearAccelCurve: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_LINEAR_ACCEL_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_LINEAR_ACCEL_CURVE, NIL)
    }

  /**
   * Linear acceleration randomness ratio.
   */
  public open var linearAccelRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_LINEAR_ACCEL_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_LINEAR_ACCEL_RANDOM, NIL)
    }

  /**
   * Orbital velocity applied to each particle. Makes the particles circle around origin. Specified in number of full rotations around origin per second.
   *
   * Only available when [flagDisableZ] is `true`.
   */
  public open var orbitVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ORBIT_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ORBIT_VELOCITY, NIL)
    }

  /**
   * Each particle's orbital velocity will vary along this [godot.CurveTexture].
   */
  public open var orbitVelocityCurve: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ORBIT_VELOCITY_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ORBIT_VELOCITY_CURVE, NIL)
    }

  /**
   * Orbital velocity randomness ratio.
   */
  public open var orbitVelocityRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_ORBIT_VELOCITY_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_ORBIT_VELOCITY_RANDOM, NIL)
    }

  /**
   * Radial acceleration applied to each particle. Makes particle accelerate away from origin.
   */
  public open var radialAccel: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_RADIAL_ACCEL, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_RADIAL_ACCEL, NIL)
    }

  /**
   * Each particle's radial acceleration will vary along this [godot.CurveTexture].
   */
  public open var radialAccelCurve: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_RADIAL_ACCEL_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_RADIAL_ACCEL_CURVE, NIL)
    }

  /**
   * Radial acceleration randomness ratio.
   */
  public open var radialAccelRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_RADIAL_ACCEL_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_RADIAL_ACCEL_RANDOM, NIL)
    }

  /**
   * Initial scale applied to each particle.
   */
  public open var scale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_SCALE, NIL)
    }

  /**
   * Each particle's scale will vary along this [godot.CurveTexture].
   */
  public open var scaleCurve: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_SCALE_CURVE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_SCALE_CURVE,
          NIL)
    }

  /**
   * Scale randomness ratio.
   */
  public open var scaleRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_SCALE_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_SCALE_RANDOM, NIL)
    }

  /**
   * Each particle's initial direction range from `+spread` to `-spread` degrees.
   */
  public open var spread: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_SPREAD,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_SPREAD, NIL)
    }

  /**
   * Tangential acceleration applied to each particle. Tangential acceleration is perpendicular to the particle's velocity giving the particles a swirling motion.
   */
  public open var tangentialAccel: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_TANGENTIAL_ACCEL, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_TANGENTIAL_ACCEL, NIL)
    }

  /**
   * Each particle's tangential acceleration will vary along this [godot.CurveTexture].
   */
  public open var tangentialAccelCurve: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_TANGENTIAL_ACCEL_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_TANGENTIAL_ACCEL_CURVE, NIL)
    }

  /**
   * Tangential acceleration randomness ratio.
   */
  public open var tangentialAccelRandom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_TANGENTIAL_ACCEL_RANDOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_TANGENTIAL_ACCEL_RANDOM, NIL)
    }

  /**
   * Trail particles' color will vary along this [godot.GradientTexture].
   */
  public open var trailColorModifier: GradientTexture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_TRAIL_COLOR_MODIFIER, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as GradientTexture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_TRAIL_COLOR_MODIFIER, NIL)
    }

  /**
   * Emitter will emit `amount` divided by `trail_divisor` particles. The remaining particles will be used as trail(s).
   */
  public open var trailDivisor: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_TRAIL_DIVISOR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_TRAIL_DIVISOR, NIL)
    }

  /**
   * Trail particles' size will vary along this [godot.CurveTexture].
   */
  public open var trailSizeModifier: CurveTexture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_GET_TRAIL_SIZE_MODIFIER, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as CurveTexture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARTICLESMATERIAL_SET_TRAIL_SIZE_MODIFIER, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PARTICLESMATERIAL)
  }

  @CoreTypeHelper
  public open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  @CoreTypeHelper
  public open fun direction(schedule: Vector3.() -> Unit): Vector3 = direction.apply{
      schedule(this)
      direction = this
  }


  @CoreTypeHelper
  public open fun emissionBoxExtents(schedule: Vector3.() -> Unit): Vector3 =
      emissionBoxExtents.apply{
      schedule(this)
      emissionBoxExtents = this
  }


  @CoreTypeHelper
  public open fun emissionRingAxis(schedule: Vector3.() -> Unit): Vector3 = emissionRingAxis.apply{
      schedule(this)
      emissionRingAxis = this
  }


  @CoreTypeHelper
  public open fun gravity(schedule: Vector3.() -> Unit): Vector3 = gravity.apply{
      schedule(this)
      gravity = this
  }


  public enum class Flags(
    id: Long
  ) {
    /**
     * Use with [setFlag] to set [flagAlignY].
     */
    FLAG_ALIGN_Y_TO_VELOCITY(0),
    /**
     * Use with [setFlag] to set [flagRotateY].
     */
    FLAG_ROTATE_Y(1),
    /**
     * Use with [setFlag] to set [flagDisableZ].
     */
    FLAG_DISABLE_Z(2),
    /**
     * Represents the size of the [enum Flags] enum.
     */
    FLAG_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
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
     * Particles will be emitted in the volume of a box.
     */
    EMISSION_SHAPE_BOX(2),
    /**
     * Particles will be emitted at a position determined by sampling a random point on the [emissionPointTexture]. Particle color will be modulated by [emissionColorTexture].
     */
    EMISSION_SHAPE_POINTS(3),
    /**
     * Particles will be emitted at a position determined by sampling a random point on the [emissionPointTexture]. Particle velocity and rotation will be set based on [emissionNormalTexture]. Particle color will be modulated by [emissionColorTexture].
     */
    EMISSION_SHAPE_DIRECTED_POINTS(4),
    /**
     * Particles will be emitted in a ring or cylinder.
     */
    EMISSION_SHAPE_RING(5),
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

  public enum class Parameter(
    id: Long
  ) {
    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set initial velocity properties.
     */
    PARAM_INITIAL_LINEAR_VELOCITY(0),
    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set angular velocity properties.
     */
    PARAM_ANGULAR_VELOCITY(1),
    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set orbital velocity properties.
     */
    PARAM_ORBIT_VELOCITY(2),
    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set linear acceleration properties.
     */
    PARAM_LINEAR_ACCEL(3),
    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set radial acceleration properties.
     */
    PARAM_RADIAL_ACCEL(4),
    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set tangential acceleration properties.
     */
    PARAM_TANGENTIAL_ACCEL(5),
    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set damping properties.
     */
    PARAM_DAMPING(6),
    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set angle properties.
     */
    PARAM_ANGLE(7),
    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set scale properties.
     */
    PARAM_SCALE(8),
    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set hue variation properties.
     */
    PARAM_HUE_VARIATION(9),
    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set animation speed properties.
     */
    PARAM_ANIM_SPEED(10),
    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set animation offset properties.
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

  public companion object {
    /**
     * Particles will be emitted in the volume of a box.
     */
    public final const val EMISSION_SHAPE_BOX: Long = 2

    /**
     * Particles will be emitted at a position determined by sampling a random point on the [emissionPointTexture]. Particle velocity and rotation will be set based on [emissionNormalTexture]. Particle color will be modulated by [emissionColorTexture].
     */
    public final const val EMISSION_SHAPE_DIRECTED_POINTS: Long = 4

    /**
     * Represents the size of the [enum EmissionShape] enum.
     */
    public final const val EMISSION_SHAPE_MAX: Long = 6

    /**
     * All particles will be emitted from a single point.
     */
    public final const val EMISSION_SHAPE_POINT: Long = 0

    /**
     * Particles will be emitted at a position determined by sampling a random point on the [emissionPointTexture]. Particle color will be modulated by [emissionColorTexture].
     */
    public final const val EMISSION_SHAPE_POINTS: Long = 3

    /**
     * Particles will be emitted in a ring or cylinder.
     */
    public final const val EMISSION_SHAPE_RING: Long = 5

    /**
     * Particles will be emitted in the volume of a sphere.
     */
    public final const val EMISSION_SHAPE_SPHERE: Long = 1

    /**
     * Use with [setFlag] to set [flagAlignY].
     */
    public final const val FLAG_ALIGN_Y_TO_VELOCITY: Long = 0

    /**
     * Use with [setFlag] to set [flagDisableZ].
     */
    public final const val FLAG_DISABLE_Z: Long = 2

    /**
     * Represents the size of the [enum Flags] enum.
     */
    public final const val FLAG_MAX: Long = 3

    /**
     * Use with [setFlag] to set [flagRotateY].
     */
    public final const val FLAG_ROTATE_Y: Long = 1

    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set angle properties.
     */
    public final const val PARAM_ANGLE: Long = 7

    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set angular velocity properties.
     */
    public final const val PARAM_ANGULAR_VELOCITY: Long = 1

    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set animation offset properties.
     */
    public final const val PARAM_ANIM_OFFSET: Long = 11

    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set animation speed properties.
     */
    public final const val PARAM_ANIM_SPEED: Long = 10

    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set damping properties.
     */
    public final const val PARAM_DAMPING: Long = 6

    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set hue variation properties.
     */
    public final const val PARAM_HUE_VARIATION: Long = 9

    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set initial velocity properties.
     */
    public final const val PARAM_INITIAL_LINEAR_VELOCITY: Long = 0

    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set linear acceleration properties.
     */
    public final const val PARAM_LINEAR_ACCEL: Long = 3

    /**
     * Represents the size of the [enum Parameter] enum.
     */
    public final const val PARAM_MAX: Long = 12

    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set orbital velocity properties.
     */
    public final const val PARAM_ORBIT_VELOCITY: Long = 2

    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set radial acceleration properties.
     */
    public final const val PARAM_RADIAL_ACCEL: Long = 4

    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set scale properties.
     */
    public final const val PARAM_SCALE: Long = 8

    /**
     * Use with [setParam], [setParamRandomness], and [setParamTexture] to set tangential acceleration properties.
     */
    public final const val PARAM_TANGENTIAL_ACCEL: Long = 5
  }
}
