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
import godot.core.NodePath
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
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
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
 * Use the `process_material` property to add a [godot.ParticleProcessMaterial] to configure particle appearance and behavior. Alternatively, you can add a [godot.ShaderMaterial] which will be applied to all particles.
 */
@GodotBaseType
public open class GPUParticles3D : GeometryInstance3D() {
  /**
   * If `true`, particles are being emitted.
   */
  public var emitting: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_IS_EMITTING, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_EMITTING, NIL)
    }

  /**
   * Number of particles to emit.
   */
  public var amount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_AMOUNT, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_AMOUNT, NIL)
    }

  /**
   *
   */
  public var subEmitter: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_SUB_EMITTER,
          NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_SUB_EMITTER,
          NIL)
    }

  /**
   * Amount of time each particle will exist.
   */
  public var lifetime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_LIFETIME,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_LIFETIME, NIL)
    }

  /**
   * If `true`, only `amount` particles will be emitted.
   */
  public var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_ONE_SHOT, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_ONE_SHOT, NIL)
    }

  /**
   * Amount of time to preprocess the particles before animation starts. Lets you start the animation some time after particles have started emitting.
   */
  public var preprocess: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_PRE_PROCESS_TIME, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_PRE_PROCESS_TIME, NIL)
    }

  /**
   * Speed scaling ratio. A value of `0` can be used to pause the particles.
   */
  public var speedScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_SPEED_SCALE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_SPEED_SCALE,
          NIL)
    }

  /**
   * Time ratio between each emission. If `0`, particles are emitted continuously. If `1`, all particles are emitted simultaneously.
   */
  public var explosiveness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_EXPLOSIVENESS_RATIO, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_EXPLOSIVENESS_RATIO, NIL)
    }

  /**
   * Emission randomness ratio.
   */
  public var randomness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_RANDOMNESS_RATIO, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_RANDOMNESS_RATIO, NIL)
    }

  /**
   * The particle system's frame rate is fixed to a value. For example, changing the value to 2 will make the particles render at 2 frames per second. Note this does not slow down the simulation of the particle system itself.
   */
  public var fixedFps: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_FIXED_FPS,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_FIXED_FPS, NIL)
    }

  /**
   * Enables particle interpolation, which makes the particle movement smoother when their [fixedFps] is lower than the screen refresh rate.
   */
  public var interpolate: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_INTERPOLATE,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_INTERPOLATE,
          NIL)
    }

  /**
   * If `true`, results in fractional delta calculation which has a smoother particles display effect.
   */
  public var fractDelta: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_FRACTIONAL_DELTA, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_FRACTIONAL_DELTA, NIL)
    }

  /**
   *
   */
  public var collisionBaseSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_COLLISION_BASE_SIZE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_COLLISION_BASE_SIZE, NIL)
    }

  /**
   * The [AABB] that determines the node's region which needs to be visible on screen for the particle system to be active.
   *
   * Grow the box if particles suddenly appear/disappear when the node enters/exits the screen. The [AABB] can be grown via code or with the **Particles → Generate AABB** editor tool.
   */
  @CoreTypeLocalCopy
  public var visibilityAabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_VISIBILITY_AABB, godot.core.VariantType.AABB)
      return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
    }
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_VISIBILITY_AABB, NIL)
    }

  /**
   * If `true`, particles use the parent node's coordinate space (known as local coordinates). This will cause particles to move and rotate along the [godot.GPUParticles3D] node (and its parents) when it is moved or rotated. If `false`, particles use global coordinates; they will not move or rotate along the [godot.GPUParticles3D] node (and its parents) when it is moved or rotated.
   */
  public var localCoords: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_USE_LOCAL_COORDINATES, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_USE_LOCAL_COORDINATES, NIL)
    }

  /**
   * Particle draw order. Uses [enum DrawOrder] values.
   *
   * **Note:** [DRAW_ORDER_INDEX] is the only option that supports motion vectors for effects like TAA. It is suggested to use this draw order if the particles are opaque to fix ghosting artifacts.
   */
  public var drawOrder: DrawOrder
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_DRAW_ORDER,
          LONG)
      return GPUParticles3D.DrawOrder.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_DRAW_ORDER,
          NIL)
    }

  /**
   *
   */
  public var transformAlign: TransformAlign
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_TRANSFORM_ALIGN, LONG)
      return GPUParticles3D.TransformAlign.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_TRANSFORM_ALIGN, NIL)
    }

  /**
   * If `true`, enables particle trails using a mesh skinning system. Designed to work with [godot.RibbonTrailMesh] and [godot.TubeTrailMesh].
   *
   * **Note:** [godot.BaseMaterial3D.useParticleTrails] must also be enabled on the particle mesh's material. Otherwise, setting [trailEnabled] to `true` will have no effect.
   *
   * **Note:** Unlike [godot.GPUParticles2D], the number of trail sections and subdivisions is set in the [godot.RibbonTrailMesh] or the [godot.TubeTrailMesh]'s properties.
   */
  public var trailEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_IS_TRAIL_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_TRAIL_ENABLED,
          NIL)
    }

  /**
   * The amount of time the particle's trail should represent (in seconds). Only effective if [trailEnabled] is `true`.
   */
  public var trailLifetime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_TRAIL_LIFETIME,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_TRAIL_LIFETIME,
          NIL)
    }

  /**
   * [godot.Material] for processing particles. Can be a [godot.ParticleProcessMaterial] or a [godot.ShaderMaterial].
   */
  public var processMaterial: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_PROCESS_MATERIAL, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_PROCESS_MATERIAL, NIL)
    }

  /**
   * The number of draw passes when rendering particles.
   */
  public var drawPasses: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_DRAW_PASSES,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_DRAW_PASSES,
          NIL)
    }

  /**
   * [godot.Mesh] that is drawn for the first draw pass.
   */
  public var drawPass1: Mesh?
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_DRAW_PASS_MESH,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_DRAW_PASS_MESH,
          NIL)
    }

  /**
   * [godot.Mesh] that is drawn for the second draw pass.
   */
  public var drawPass2: Mesh?
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_DRAW_PASS_MESH,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_DRAW_PASS_MESH,
          NIL)
    }

  /**
   * [godot.Mesh] that is drawn for the third draw pass.
   */
  public var drawPass3: Mesh?
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_DRAW_PASS_MESH,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_DRAW_PASS_MESH,
          NIL)
    }

  /**
   * [godot.Mesh] that is drawn for the fourth draw pass.
   */
  public var drawPass4: Mesh?
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_DRAW_PASS_MESH,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_DRAW_PASS_MESH,
          NIL)
    }

  /**
   *
   */
  public var drawSkin: Skin?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_GET_SKIN, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Skin?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_SET_SKIN, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GPUPARTICLES3D, scriptIndex)
    return true
  }

  /**
   * The [AABB] that determines the node's region which needs to be visible on screen for the particle system to be active.
   *
   * Grow the box if particles suddenly appear/disappear when the node enters/exits the screen. The [AABB] can be grown via code or with the **Particles → Generate AABB** editor tool.
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
   * val myCoreType = gpuparticles3d.visibilityAabb
   * //Your changes
   * gpuparticles3d.visibilityAabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun visibilityAabbMutate(block: AABB.() -> Unit): AABB = visibilityAabb.apply{
      block(this)
      visibilityAabb = this
  }


  /**
   * Restarts the particle emission, clearing existing particles.
   */
  public fun restart(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_RESTART, NIL)
  }

  /**
   * Returns the axis-aligned bounding box that contains all the particles that are active in the current frame.
   */
  public fun captureAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_CAPTURE_AABB,
        godot.core.VariantType.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
  }

  /**
   * Emits a single particle. Whether [xform], [velocity], [color] and [custom] are applied depends on the value of [flags]. See [enum EmitFlags].
   */
  public fun emitParticle(
    xform: Transform3D,
    velocity: Vector3,
    color: Color,
    custom: Color,
    flags: Long,
  ): Unit {
    TransferContext.writeArguments(TRANSFORM3D to xform, VECTOR3 to velocity, COLOR to color, COLOR to custom, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLES3D_EMIT_PARTICLE, NIL)
  }

  public enum class DrawOrder(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EmitFlags(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class TransformAlign(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Maximum number of draw passes supported.
     */
    public final const val MAX_DRAW_PASSES: Long = 4
  }
}
