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
import godot.core.NodePath
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
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
 * 2D particle node used to create a variety of particle systems and effects. [GPUParticles2D]
 * features an emitter that generates some number of particles at a given rate.
 * Use the [processMaterial] property to add a [ParticleProcessMaterial] to configure particle
 * appearance and behavior. Alternatively, you can add a [ShaderMaterial] which will be applied to all
 * particles.
 * 2D particles can optionally collide with [LightOccluder2D], but they don't collide with
 * [PhysicsBody2D] nodes.
 */
@GodotBaseType
public open class GPUParticles2D : Node2D() {
  /**
   * Emitted when all active particles have finished processing. To immediately restart the emission
   * cycle, call [restart].
   * Never emitted when [oneShot] is disabled, as particles will be emitted and processed
   * continuously.
   * **Note:** For [oneShot] emitters, due to the particles being computed on the GPU, there may be
   * a short period after receiving the signal during which setting [emitting] to `true` will not
   * restart the emission cycle. This delay is avoided by instead calling [restart].
   */
  public val finished: Signal0 by signal()

  /**
   * If `true`, particles are being emitted. [emitting] can be used to start and stop particles from
   * emitting. However, if [oneShot] is `true` setting [emitting] to `true` will not restart the
   * emission cycle unless all active particles have finished processing. Use the [signal finished]
   * signal to be notified once all active particles finish processing.
   * **Note:** For [oneShot] emitters, due to the particles being computed on the GPU, there may be
   * a short period after receiving the [signal finished] signal during which setting this to `true`
   * will not restart the emission cycle.
   * **Tip:** If your [oneShot] emitter needs to immediately restart emitting particles once [signal
   * finished] signal is received, consider calling [restart] instead of setting [emitting].
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
   * The number of particles to emit in one emission cycle. The effective emission rate is `(amount
   * * amount_ratio) / lifetime` particles per second. Higher values will increase GPU requirements,
   * even if not all particles are visible at a given time or if [amountRatio] is decreased.
   * **Note:** Changing this value will cause the particle system to restart. To avoid this, change
   * [amountRatio] instead.
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
   * The ratio of particles that should actually be emitted. If set to a value lower than `1.0`,
   * this will set the amount of emitted particles throughout the lifetime to `amount * amount_ratio`.
   * Unlike changing [amount], changing [amountRatio] while emitting does not affect already-emitted
   * particles and doesn't cause the particle system to restart. [amountRatio] can be used to create
   * effects that make the number of emitted particles vary over time.
   * **Note:** Reducing the [amountRatio] has no performance benefit, since resources need to be
   * allocated and processed for the total [amount] of particles regardless of the [amountRatio]. If
   * you don't intend to change the number of particles emitted while the particles are emitting, make
   * sure [amountRatio] is set to `1` and change [amount] to your liking instead.
   */
  public var amountRatio: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmountRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAmountRatioPtr, NIL)
    }

  /**
   * Path to another [GPUParticles2D] node that will be used as a subemitter (see
   * [ParticleProcessMaterial.subEmitterMode]). Subemitters can be used to achieve effects such as
   * fireworks, sparks on collision, bubbles popping into water drops, and more.
   * **Note:** When [subEmitter] is set, the target [GPUParticles2D] node will no longer emit
   * particles on its own.
   */
  public var subEmitter: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterPtr, NIL)
    }

  /**
   * [Material] for processing particles. Can be a [ParticleProcessMaterial] or a [ShaderMaterial].
   */
  public var processMaterial: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProcessMaterialPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setProcessMaterialPtr, NIL)
    }

  /**
   * Particle texture. If `null`, particles will be squares with a size of 1×1 pixels.
   * **Note:** To use a flipbook texture, assign a new [CanvasItemMaterial] to the
   * [GPUParticles2D]'s [CanvasItem.material] property, then enable
   * [CanvasItemMaterial.particlesAnimation] and set [CanvasItemMaterial.particlesAnimHFrames],
   * [CanvasItemMaterial.particlesAnimVFrames], and [CanvasItemMaterial.particlesAnimLoop] to match the
   * flipbook texture.
   */
  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  /**
   * The amount of time each particle will exist (in seconds). The effective emission rate is
   * `(amount * amount_ratio) / lifetime` particles per second.
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
   * The particle system's frame rate is fixed to a value. For example, changing the value to 2 will
   * make the particles render at 2 frames per second. Note this does not slow down the simulation of
   * the particle system itself.
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
   * Enables particle interpolation, which makes the particle movement smoother when their
   * [fixedFps] is lower than the screen refresh rate.
   */
  public var interpolate: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInterpolatePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInterpolatePtr, NIL)
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
   * Causes all the particles in this node to interpolate towards the end of their lifetime.
   * **Note:** This only works when used with a [ParticleProcessMaterial]. It needs to be manually
   * implemented for custom process shaders.
   */
  public var interpToEnd: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInterpToEndPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setInterpToEndPtr, NIL)
    }

  /**
   * Multiplier for particle's collision radius. `1.0` corresponds to the size of the sprite. If
   * particles appear to sink into the ground when colliding, increase this value. If particles appear
   * to float when colliding, decrease this value. Only effective if
   * [ParticleProcessMaterial.collisionMode] is [ParticleProcessMaterial.COLLISION_RIGID] or
   * [ParticleProcessMaterial.COLLISION_HIDE_ON_CONTACT].
   * **Note:** Particles always have a spherical collision shape.
   */
  public var collisionBaseSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionBaseSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionBaseSizePtr, NIL)
    }

  /**
   * The [Rect2] that determines the node's region which needs to be visible on screen for the
   * particle system to be active.
   * Grow the rect if particles suddenly appear/disappear when the node enters/exits the screen. The
   * [Rect2] can be grown via code or with the **Particles → Generate Visibility Rect** editor tool.
   */
  @CoreTypeLocalCopy
  public var visibilityRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityRectPtr, RECT2)
      return (TransferContext.readReturnValue(RECT2, false) as Rect2)
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityRectPtr, NIL)
    }

  /**
   * If `true`, particles use the parent node's coordinate space (known as local coordinates). This
   * will cause particles to move and rotate along the [GPUParticles2D] node (and its parents) when it
   * is moved or rotated. If `false`, particles use global coordinates; they will not move or rotate
   * along the [GPUParticles2D] node (and its parents) when it is moved or rotated.
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
      return GPUParticles2D.DrawOrder.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawOrderPtr, NIL)
    }

  /**
   * If `true`, enables particle trails using a mesh skinning system.
   * **Note:** Unlike [GPUParticles3D], the number of trail sections and subdivisions is set with
   * the [trailSections] and [trailSectionSubdivisions] properties.
   */
  public var trailEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isTrailEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrailEnabledPtr, NIL)
    }

  /**
   * The amount of time the particle's trail should represent (in seconds). Only effective if
   * [trailEnabled] is `true`.
   */
  public var trailLifetime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrailLifetimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrailLifetimePtr, NIL)
    }

  /**
   * The number of sections to use for the particle trail rendering. Higher values can result in
   * smoother trail curves, at the cost of performance due to increased mesh complexity. See also
   * [trailSectionSubdivisions]. Only effective if [trailEnabled] is `true`.
   */
  public var trailSections: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrailSectionsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTrailSectionsPtr, NIL)
    }

  /**
   * The number of subdivisions to use for the particle trail rendering. Higher values can result in
   * smoother trail curves, at the cost of performance due to increased mesh complexity. See also
   * [trailSections]. Only effective if [trailEnabled] is `true`.
   */
  public var trailSectionSubdivisions: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrailSectionSubdivisionsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTrailSectionSubdivisionsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GPUPARTICLES2D, scriptIndex)
  }

  /**
   * The [Rect2] that determines the node's region which needs to be visible on screen for the
   * particle system to be active.
   * Grow the rect if particles suddenly appear/disappear when the node enters/exits the screen. The
   * [Rect2] can be grown via code or with the **Particles → Generate Visibility Rect** editor tool.
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
   * val myCoreType = gpuparticles2d.visibilityRect
   * //Your changes
   * gpuparticles2d.visibilityRect = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun visibilityRectMutate(block: Rect2.() -> Unit): Rect2 = visibilityRect.apply{
      block(this)
      visibilityRect = this
  }


  /**
   * Returns a rectangle containing the positions of all existing particles.
   * **Note:** When using threaded rendering this method synchronizes the rendering thread. Calling
   * it often may have a negative impact on performance.
   */
  public fun captureRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.captureRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Restarts the particle emission cycle, clearing existing particles. To avoid particles vanishing
   * from the viewport, wait for the [signal finished] signal before calling.
   * **Note:** The [signal finished] signal is only emitted by [oneShot] emitters.
   */
  public fun restart(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.restartPtr, NIL)
  }

  /**
   * Emits a single particle. Whether [xform], [velocity], [color] and [custom] are applied depends
   * on the value of [flags]. See [EmitFlags].
   * The default ParticleProcessMaterial will overwrite [color] and use the contents of [custom] as
   * `(rotation, age, animation, lifetime)`.
   */
  public fun emitParticle(
    xform: Transform2D,
    velocity: Vector2,
    color: Color,
    custom: Color,
    flags: Long,
  ): Unit {
    TransferContext.writeArguments(TRANSFORM2D to xform, VECTOR2 to velocity, COLOR to color, COLOR to custom, LONG to flags)
    TransferContext.callMethod(rawPtr, MethodBindings.emitParticlePtr, NIL)
  }

  /**
   * Sets this node's properties to match a given [CPUParticles2D] node.
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
     * Particles are drawn in reverse order of remaining lifetime. In other words, the particle with
     * the lowest lifetime is drawn at the front.
     */
    DRAW_ORDER_REVERSE_LIFETIME(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DrawOrder = entries.single { it.id == `value` }
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
     * Particle starts with the specified velocity vector, which defines the emission direction and
     * speed.
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
      public fun from(`value`: Long): EmitFlags = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_emitting")

    public val setAmountPtr: VoidPtr = TypeManager.getMethodBindPtr("GPUParticles2D", "set_amount")

    public val setLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_lifetime")

    public val setOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_one_shot")

    public val setPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_pre_process_time")

    public val setExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_explosiveness_ratio")

    public val setRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_randomness_ratio")

    public val setVisibilityRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_visibility_rect")

    public val setUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_use_local_coordinates")

    public val setFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_fixed_fps")

    public val setFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_fractional_delta")

    public val setInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_interpolate")

    public val setProcessMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_process_material")

    public val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_speed_scale")

    public val setCollisionBaseSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_collision_base_size")

    public val setInterpToEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_interp_to_end")

    public val isEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "is_emitting")

    public val getAmountPtr: VoidPtr = TypeManager.getMethodBindPtr("GPUParticles2D", "get_amount")

    public val getLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_lifetime")

    public val getOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_one_shot")

    public val getPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_pre_process_time")

    public val getExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_explosiveness_ratio")

    public val getRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_randomness_ratio")

    public val getVisibilityRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_visibility_rect")

    public val getUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_use_local_coordinates")

    public val getFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_fixed_fps")

    public val getFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_fractional_delta")

    public val getInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_interpolate")

    public val getProcessMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_process_material")

    public val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_speed_scale")

    public val getCollisionBaseSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_collision_base_size")

    public val getInterpToEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_interp_to_end")

    public val setDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_draw_order")

    public val getDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_draw_order")

    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_texture")

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_texture")

    public val captureRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "capture_rect")

    public val restartPtr: VoidPtr = TypeManager.getMethodBindPtr("GPUParticles2D", "restart")

    public val setSubEmitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_sub_emitter")

    public val getSubEmitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_sub_emitter")

    public val emitParticlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "emit_particle")

    public val setTrailEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_trail_enabled")

    public val setTrailLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_trail_lifetime")

    public val isTrailEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "is_trail_enabled")

    public val getTrailLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_trail_lifetime")

    public val setTrailSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_trail_sections")

    public val getTrailSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_trail_sections")

    public val setTrailSectionSubdivisionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_trail_section_subdivisions")

    public val getTrailSectionSubdivisionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_trail_section_subdivisions")

    public val convertFromParticlesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "convert_from_particles")

    public val setAmountRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_amount_ratio")

    public val getAmountRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_amount_ratio")
  }
}
