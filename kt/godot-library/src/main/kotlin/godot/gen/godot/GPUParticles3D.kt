// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.Color
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * 3D particle emitter.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * 3D particle node used to create a variety of particle systems and effects. [godot.GPUParticles3D] features an emitter that generates some number of particles at a given rate.
 *
 * Use the `process_material` property to add a [godot.ParticlesMaterial] to configure particle appearance and behavior. Alternatively, you can add a [godot.ShaderMaterial] which will be applied to all particles.
 */
@GodotBaseType
public open class GPUParticles3D : GeometryInstance3D() {
  /**
   * If `true`, particles are being emitted.
   */
  public var emitting: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_IS_EMITTING,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_EMITTING,
          NIL.ordinal)
    }

  /**
   * Number of particles to emit.
   */
  public var amount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_AMOUNT,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_AMOUNT, NIL.ordinal)
    }

  /**
   *
   */
  public var subEmitter: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_SUB_EMITTER,
          NODE_PATH.ordinal)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_SUB_EMITTER,
          NIL.ordinal)
    }

  /**
   * Amount of time each particle will exist.
   */
  public var lifetime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_LIFETIME,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_LIFETIME,
          NIL.ordinal)
    }

  /**
   * If `true`, only `amount` particles will be emitted.
   */
  public var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_ONE_SHOT,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_ONE_SHOT,
          NIL.ordinal)
    }

  /**
   * Amount of time to preprocess the particles before animation starts. Lets you start the animation some time after particles have started emitting.
   */
  public var preprocess: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_PRE_PROCESS_TIME,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_PRE_PROCESS_TIME,
          NIL.ordinal)
    }

  /**
   * Speed scaling ratio. A value of `0` can be used to pause the particles.
   */
  public var speedScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_SPEED_SCALE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_SPEED_SCALE,
          NIL.ordinal)
    }

  /**
   * Time ratio between each emission. If `0`, particles are emitted continuously. If `1`, all particles are emitted simultaneously.
   */
  public var explosiveness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_EXPLOSIVENESS_RATIO,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_EXPLOSIVENESS_RATIO,
          NIL.ordinal)
    }

  /**
   * Emission randomness ratio.
   */
  public var randomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_RANDOMNESS_RATIO,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_RANDOMNESS_RATIO,
          NIL.ordinal)
    }

  /**
   * The particle system's frame rate is fixed to a value. For instance, changing the value to 2 will make the particles render at 2 frames per second. Note this does not slow down the simulation of the particle system itself.
   */
  public var fixedFps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_FIXED_FPS,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_FIXED_FPS,
          NIL.ordinal)
    }

  /**
   * Enables particle interpolation, which makes the particle movement smoother when their [fixedFps] is lower than the screen refresh rate.
   */
  public var interpolate: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_INTERPOLATE,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_INTERPOLATE,
          NIL.ordinal)
    }

  /**
   * If `true`, results in fractional delta calculation which has a smoother particles display effect.
   */
  public var fractDelta: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_FRACTIONAL_DELTA,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_FRACTIONAL_DELTA,
          NIL.ordinal)
    }

  /**
   *
   */
  public var collisionBaseSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_COLLISION_BASE_SIZE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_COLLISION_BASE_SIZE,
          NIL.ordinal)
    }

  /**
   * The [AABB] that determines the node's region which needs to be visible on screen for the particle system to be active.
   *
   * Grow the box if particles suddenly appear/disappear when the node enters/exits the screen. The [AABB] can be grown via code or with the **Particles → Generate AABB** editor tool.
   */
  public var visibilityAabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_VISIBILITY_AABB,
          godot.core.VariantType.AABB.ordinal)
      return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
    }
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_VISIBILITY_AABB,
          NIL.ordinal)
    }

  /**
   * If `true`, particles use the parent node's coordinate space. If `false`, they use global coordinates.
   */
  public var localCoords: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_USE_LOCAL_COORDINATES, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_USE_LOCAL_COORDINATES, NIL.ordinal)
    }

  /**
   * Particle draw order. Uses [enum DrawOrder] values.
   */
  public var drawOrder: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_DRAW_ORDER,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_DRAW_ORDER,
          NIL.ordinal)
    }

  /**
   *
   */
  public var transformAlign: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_TRANSFORM_ALIGN,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_TRANSFORM_ALIGN,
          NIL.ordinal)
    }

  /**
   *
   */
  public var trailEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_IS_TRAIL_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_TRAIL_ENABLED,
          NIL.ordinal)
    }

  /**
   *
   */
  public var trailLengthSecs: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_TRAIL_LENGTH,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_TRAIL_LENGTH,
          NIL.ordinal)
    }

  /**
   * [godot.Material] for processing particles. Can be a [godot.ParticlesMaterial] or a [godot.ShaderMaterial].
   */
  public var processMaterial: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_PROCESS_MATERIAL,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_PROCESS_MATERIAL,
          NIL.ordinal)
    }

  /**
   * The number of draw passes when rendering particles.
   */
  public var drawPasses: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_DRAW_PASSES,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_DRAW_PASSES,
          NIL.ordinal)
    }

  /**
   * [godot.Mesh] that is drawn for the first draw pass.
   */
  public val drawPass1: Mesh?
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_DRAW_PASS_MESH,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }

  /**
   * [godot.Mesh] that is drawn for the second draw pass.
   */
  public val drawPass2: Mesh?
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_DRAW_PASS_MESH,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }

  /**
   * [godot.Mesh] that is drawn for the third draw pass.
   */
  public val drawPass3: Mesh?
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_DRAW_PASS_MESH,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }

  /**
   * [godot.Mesh] that is drawn for the fourth draw pass.
   */
  public val drawPass4: Mesh?
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_DRAW_PASS_MESH,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }

  /**
   *
   */
  public var drawSkin: Skin?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_SKIN,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Skin?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_SKIN, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GPUPARTICLES3D)
  }

  /**
   * Sets the [godot.Mesh] that is drawn at index `pass`.
   */
  public fun setDrawPassMesh(pass: Long, mesh: Mesh): Unit {
    TransferContext.writeArguments(LONG to pass, OBJECT to mesh)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_DRAW_PASS_MESH,
        NIL.ordinal)
  }

  /**
   * Restarts the particle emission, clearing existing particles.
   */
  public fun restart(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_RESTART, NIL.ordinal)
  }

  /**
   * Returns the axis-aligned bounding box that contains all the particles that are active in the current frame.
   */
  public fun captureAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_CAPTURE_AABB,
        godot.core.VariantType.AABB.ordinal)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Emits a single particle. Whether `xform`, `velocity`, `color` and `custom` are applied depends on the value of `flags`. See [enum EmitFlags].
   */
  public fun emitParticle(
    xform: Transform3D,
    velocity: Vector3,
    color: Color,
    custom: Color,
    flags: Long
  ): Unit {
    TransferContext.writeArguments(TRANSFORM3D to xform, VECTOR3 to velocity, COLOR to color, COLOR to custom, LONG to flags)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_EMIT_PARTICLE,
        NIL.ordinal)
  }

  public enum class EmitFlags(
    id: Long
  ) {
    /**
     * Particle starts at the specified position.
     */
    EMIT_FLAG_POSITION(1),
    /**
     * Particle starts with specified rotation and scale.
     */
    EMIT_FLAG_ROTATION_SCALE(2),
    /**
     * Particle starts with the specified velocity vector, which defines the emission direction and speed.
     */
    EMIT_FLAG_VELOCITY(4),
    /**
     * Particle starts with specified color.
     */
    EMIT_FLAG_COLOR(8),
    /**
     * Particle starts with specified `CUSTOM` data.
     */
    EMIT_FLAG_CUSTOM(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TransformAlign(
    id: Long
  ) {
    /**
     *
     */
    TRANSFORM_ALIGN_DISABLED(0),
    /**
     *
     */
    TRANSFORM_ALIGN_Z_BILLBOARD(1),
    /**
     *
     */
    TRANSFORM_ALIGN_Y_TO_VELOCITY(2),
    /**
     *
     */
    TRANSFORM_ALIGN_Z_BILLBOARD_Y_TO_VELOCITY(3),
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
    /**
     *
     */
    DRAW_ORDER_REVERSE_LIFETIME(2),
    /**
     * Particles are drawn in order of depth.
     */
    DRAW_ORDER_VIEW_DEPTH(3),
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
     * Maximum number of draw passes supported.
     */
    public final const val MAX_DRAW_PASSES: Long = 4
  }
}
