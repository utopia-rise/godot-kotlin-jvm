// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.NodePath
import godot.core.Rect2
import godot.core.Signal0
import godot.core.Transform2D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

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
   * This signal is never emitted when [oneShot] is disabled, as particles will be emitted and
   * processed continuously.
   * **Note:** For [oneShot] emitters, due to the particles being computed on the GPU, there may be
   * a short period after receiving the signal during which setting [emitting] to `true` will not
   * restart the emission cycle. This delay is avoided by instead calling [restart].
   */
  public val finished: Signal0 by Signal0

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
  public final inline var emitting: Boolean
    @JvmName("emittingProperty")
    get() = isEmitting()
    @JvmName("emittingProperty")
    set(`value`) {
      setEmitting(value)
    }

  /**
   * The number of particles to emit in one emission cycle. The effective emission rate is `(amount
   * * amount_ratio) / lifetime` particles per second. Higher values will increase GPU requirements,
   * even if not all particles are visible at a given time or if [amountRatio] is decreased.
   * **Note:** Changing this value will cause the particle system to restart. To avoid this, change
   * [amountRatio] instead.
   */
  public final inline var amount: Int
    @JvmName("amountProperty")
    get() = getAmount()
    @JvmName("amountProperty")
    set(`value`) {
      setAmount(value)
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
  public final inline var amountRatio: Float
    @JvmName("amountRatioProperty")
    get() = getAmountRatio()
    @JvmName("amountRatioProperty")
    set(`value`) {
      setAmountRatio(value)
    }

  /**
   * Path to another [GPUParticles2D] node that will be used as a subemitter (see
   * [ParticleProcessMaterial.subEmitterMode]). Subemitters can be used to achieve effects such as
   * fireworks, sparks on collision, bubbles popping into water drops, and more.
   * **Note:** When [subEmitter] is set, the target [GPUParticles2D] node will no longer emit
   * particles on its own.
   */
  public final inline var subEmitter: NodePath
    @JvmName("subEmitterProperty")
    get() = getSubEmitter()
    @JvmName("subEmitterProperty")
    set(`value`) {
      setSubEmitter(value)
    }

  /**
   * Particle texture. If `null`, particles will be squares with a size of 1×1 pixels.
   * **Note:** To use a flipbook texture, assign a new [CanvasItemMaterial] to the
   * [GPUParticles2D]'s [CanvasItem.material] property, then enable
   * [CanvasItemMaterial.particlesAnimation] and set [CanvasItemMaterial.particlesAnimHFrames],
   * [CanvasItemMaterial.particlesAnimVFrames], and [CanvasItemMaterial.particlesAnimLoop] to match the
   * flipbook texture.
   */
  public final inline var texture: Texture2D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  /**
   * The amount of time each particle will exist (in seconds). The effective emission rate is
   * `(amount * amount_ratio) / lifetime` particles per second.
   */
  public final inline var lifetime: Double
    @JvmName("lifetimeProperty")
    get() = getLifetime()
    @JvmName("lifetimeProperty")
    set(`value`) {
      setLifetime(value)
    }

  /**
   * Causes all the particles in this node to interpolate towards the end of their lifetime.
   * **Note:** This only works when used with a [ParticleProcessMaterial]. It needs to be manually
   * implemented for custom process shaders.
   */
  public final inline var interpToEnd: Float
    @JvmName("interpToEndProperty")
    get() = getInterpToEnd()
    @JvmName("interpToEndProperty")
    set(`value`) {
      setInterpToEnd(value)
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
   * **Note:** This can be very expensive if set to a high number as it requires running the
   * particle shader a number of times equal to the [fixedFps] (or 30, if [fixedFps] is 0) for every
   * second. In extreme cases it can even lead to a GPU crash due to the volume of work done in a
   * single frame.
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
   * If `true`, particles will use the same seed for every simulation using the seed defined in
   * [seed]. This is useful for situations where the visual outcome should be consistent across
   * replays, for example when using Movie Maker mode.
   */
  public final inline var useFixedSeed: Boolean
    @JvmName("useFixedSeedProperty")
    get() = getUseFixedSeed()
    @JvmName("useFixedSeedProperty")
    set(`value`) {
      setUseFixedSeed(value)
    }

  /**
   * Sets the random seed used by the particle system. Only effective if [useFixedSeed] is `true`.
   */
  public final inline var seed: Long
    @JvmName("seedProperty")
    get() = getSeed()
    @JvmName("seedProperty")
    set(`value`) {
      setSeed(value)
    }

  /**
   * The particle system's frame rate is fixed to a value. For example, changing the value to 2 will
   * make the particles render at 2 frames per second. Note this does not slow down the simulation of
   * the particle system itself.
   */
  public final inline var fixedFps: Int
    @JvmName("fixedFpsProperty")
    get() = getFixedFps()
    @JvmName("fixedFpsProperty")
    set(`value`) {
      setFixedFps(value)
    }

  /**
   * Enables particle interpolation, which makes the particle movement smoother when their
   * [fixedFps] is lower than the screen refresh rate.
   */
  public final inline var interpolate: Boolean
    @JvmName("interpolateProperty")
    get() = getInterpolate()
    @JvmName("interpolateProperty")
    set(`value`) {
      setInterpolate(value)
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
   * Multiplier for particle's collision radius. `1.0` corresponds to the size of the sprite. If
   * particles appear to sink into the ground when colliding, increase this value. If particles appear
   * to float when colliding, decrease this value. Only effective if
   * [ParticleProcessMaterial.collisionMode] is [ParticleProcessMaterial.COLLISION_RIGID] or
   * [ParticleProcessMaterial.COLLISION_HIDE_ON_CONTACT].
   * **Note:** Particles always have a spherical collision shape.
   */
  public final inline var collisionBaseSize: Float
    @JvmName("collisionBaseSizeProperty")
    get() = getCollisionBaseSize()
    @JvmName("collisionBaseSizeProperty")
    set(`value`) {
      setCollisionBaseSize(value)
    }

  /**
   * The [Rect2] that determines the node's region which needs to be visible on screen for the
   * particle system to be active.
   * Grow the rect if particles suddenly appear/disappear when the node enters/exits the screen. The
   * [Rect2] can be grown via code or with the **Particles → Generate Visibility Rect** editor tool.
   */
  @CoreTypeLocalCopy
  public final inline var visibilityRect: Rect2
    @JvmName("visibilityRectProperty")
    get() = getVisibilityRect()
    @JvmName("visibilityRectProperty")
    set(`value`) {
      setVisibilityRect(value)
    }

  /**
   * If `true`, particles use the parent node's coordinate space (known as local coordinates). This
   * will cause particles to move and rotate along the [GPUParticles2D] node (and its parents) when it
   * is moved or rotated. If `false`, particles use global coordinates; they will not move or rotate
   * along the [GPUParticles2D] node (and its parents) when it is moved or rotated.
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
   * If `true`, enables particle trails using a mesh skinning system.
   * **Note:** Unlike [GPUParticles3D], the number of trail sections and subdivisions is set with
   * the [trailSections] and [trailSectionSubdivisions] properties.
   */
  public final inline var trailEnabled: Boolean
    @JvmName("trailEnabledProperty")
    get() = isTrailEnabled()
    @JvmName("trailEnabledProperty")
    set(`value`) {
      setTrailEnabled(value)
    }

  /**
   * The amount of time the particle's trail should represent (in seconds). Only effective if
   * [trailEnabled] is `true`.
   */
  public final inline var trailLifetime: Double
    @JvmName("trailLifetimeProperty")
    get() = getTrailLifetime()
    @JvmName("trailLifetimeProperty")
    set(`value`) {
      setTrailLifetime(value)
    }

  /**
   * The number of sections to use for the particle trail rendering. Higher values can result in
   * smoother trail curves, at the cost of performance due to increased mesh complexity. See also
   * [trailSectionSubdivisions]. Only effective if [trailEnabled] is `true`.
   */
  public final inline var trailSections: Int
    @JvmName("trailSectionsProperty")
    get() = getTrailSections()
    @JvmName("trailSectionsProperty")
    set(`value`) {
      setTrailSections(value)
    }

  /**
   * The number of subdivisions to use for the particle trail rendering. Higher values can result in
   * smoother trail curves, at the cost of performance due to increased mesh complexity. See also
   * [trailSections]. Only effective if [trailEnabled] is `true`.
   */
  public final inline var trailSectionSubdivisions: Int
    @JvmName("trailSectionSubdivisionsProperty")
    get() = getTrailSectionSubdivisions()
    @JvmName("trailSectionSubdivisionsProperty")
    set(`value`) {
      setTrailSectionSubdivisions(value)
    }

  /**
   * [Material] for processing particles. Can be a [ParticleProcessMaterial] or a [ShaderMaterial].
   */
  public final inline var processMaterial: Material?
    @JvmName("processMaterialProperty")
    get() = getProcessMaterial()
    @JvmName("processMaterialProperty")
    set(`value`) {
      setProcessMaterial(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(243, scriptIndex)
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
  public final fun visibilityRectMutate(block: Rect2.() -> Unit): Rect2 = visibilityRect.apply{
      block(this)
      visibilityRect = this
  }


  public final fun setEmitting(emitting: Boolean): Unit {
    TransferContext.writeArguments(BOOL to emitting)
    TransferContext.callMethod(ptr, MethodBindings.setEmittingPtr, NIL)
  }

  public final fun setAmount(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setAmountPtr, NIL)
  }

  public final fun setLifetime(secs: Double): Unit {
    TransferContext.writeArguments(DOUBLE to secs)
    TransferContext.callMethod(ptr, MethodBindings.setLifetimePtr, NIL)
  }

  public final fun setOneShot(secs: Boolean): Unit {
    TransferContext.writeArguments(BOOL to secs)
    TransferContext.callMethod(ptr, MethodBindings.setOneShotPtr, NIL)
  }

  public final fun setPreProcessTime(secs: Double): Unit {
    TransferContext.writeArguments(DOUBLE to secs)
    TransferContext.callMethod(ptr, MethodBindings.setPreProcessTimePtr, NIL)
  }

  public final fun setExplosivenessRatio(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setExplosivenessRatioPtr, NIL)
  }

  public final fun setRandomnessRatio(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRandomnessRatioPtr, NIL)
  }

  public final fun setVisibilityRect(visibilityRect: Rect2): Unit {
    TransferContext.writeArguments(RECT2 to visibilityRect)
    TransferContext.callMethod(ptr, MethodBindings.setVisibilityRectPtr, NIL)
  }

  public final fun setUseLocalCoordinates(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseLocalCoordinatesPtr, NIL)
  }

  public final fun setFixedFps(fps: Int): Unit {
    TransferContext.writeArguments(LONG to fps.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFixedFpsPtr, NIL)
  }

  public final fun setFractionalDelta(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setFractionalDeltaPtr, NIL)
  }

  public final fun setInterpolate(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setInterpolatePtr, NIL)
  }

  public final fun setProcessMaterial(material: Material?): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(ptr, MethodBindings.setProcessMaterialPtr, NIL)
  }

  public final fun setSpeedScale(scale: Double): Unit {
    TransferContext.writeArguments(DOUBLE to scale)
    TransferContext.callMethod(ptr, MethodBindings.setSpeedScalePtr, NIL)
  }

  public final fun setCollisionBaseSize(size: Float): Unit {
    TransferContext.writeArguments(DOUBLE to size.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCollisionBaseSizePtr, NIL)
  }

  public final fun setInterpToEnd(interp: Float): Unit {
    TransferContext.writeArguments(DOUBLE to interp.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setInterpToEndPtr, NIL)
  }

  /**
   * Requests the particles to process for extra process time during a single frame.
   * Useful for particle playback, if used in combination with [useFixedSeed] or by calling
   * [restart] with parameter `keep_seed` set to `true`.
   */
  public final fun requestParticlesProcess(processTime: Float): Unit {
    TransferContext.writeArguments(DOUBLE to processTime.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.requestParticlesProcessPtr, NIL)
  }

  public final fun isEmitting(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.isEmittingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getAmount(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getAmountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getLifetime(): Double {
    TransferContext.callMethod(ptr, MethodBindings.getLifetimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getOneShot(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.getOneShotPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getPreProcessTime(): Double {
    TransferContext.callMethod(ptr, MethodBindings.getPreProcessTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getExplosivenessRatio(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getExplosivenessRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getRandomnessRatio(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getRandomnessRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getVisibilityRect(): Rect2 {
    TransferContext.callMethod(ptr, MethodBindings.getVisibilityRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  public final fun getUseLocalCoordinates(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.getUseLocalCoordinatesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getFixedFps(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getFixedFpsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getFractionalDelta(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.getFractionalDeltaPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getInterpolate(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.getInterpolatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getProcessMaterial(): Material? {
    TransferContext.callMethod(ptr, MethodBindings.getProcessMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Material?)
  }

  public final fun getSpeedScale(): Double {
    TransferContext.callMethod(ptr, MethodBindings.getSpeedScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getCollisionBaseSize(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getCollisionBaseSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getInterpToEnd(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getInterpToEndPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDrawOrder(order: DrawOrder): Unit {
    TransferContext.writeArguments(LONG to order.id)
    TransferContext.callMethod(ptr, MethodBindings.setDrawOrderPtr, NIL)
  }

  public final fun getDrawOrder(): DrawOrder {
    TransferContext.callMethod(ptr, MethodBindings.getDrawOrderPtr, LONG)
    return GPUParticles2D.DrawOrder.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture2D? {
    TransferContext.callMethod(ptr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Returns a rectangle containing the positions of all existing particles.
   * **Note:** When using threaded rendering this method synchronizes the rendering thread. Calling
   * it often may have a negative impact on performance.
   */
  public final fun captureRect(): Rect2 {
    TransferContext.callMethod(ptr, MethodBindings.captureRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Restarts the particle emission cycle, clearing existing particles. To avoid particles vanishing
   * from the viewport, wait for the [signal finished] signal before calling.
   * **Note:** The [signal finished] signal is only emitted by [oneShot] emitters.
   * If [keepSeed] is `true`, the current random seed will be preserved. Useful for seeking and
   * playback.
   */
  @JvmOverloads
  public final fun restart(keepSeed: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to keepSeed)
    TransferContext.callMethod(ptr, MethodBindings.restartPtr, NIL)
  }

  public final fun setSubEmitter(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.setSubEmitterPtr, NIL)
  }

  public final fun getSubEmitter(): NodePath {
    TransferContext.callMethod(ptr, MethodBindings.getSubEmitterPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Emits a single particle. Whether [xform], [velocity], [color] and [custom] are applied depends
   * on the value of [flags]. See [EmitFlags].
   * The default ParticleProcessMaterial will overwrite [color] and use the contents of [custom] as
   * `(rotation, age, animation, lifetime)`.
   * **Note:** [emitParticle] is only supported on the Forward+ and Mobile rendering methods, not
   * Compatibility.
   */
  public final fun emitParticle(
    xform: Transform2D,
    velocity: Vector2,
    color: Color,
    custom: Color,
    flags: Long,
  ): Unit {
    TransferContext.writeArguments(TRANSFORM2D to xform, VECTOR2 to velocity, COLOR to color, COLOR to custom, LONG to flags)
    TransferContext.callMethod(ptr, MethodBindings.emitParticlePtr, NIL)
  }

  public final fun setTrailEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setTrailEnabledPtr, NIL)
  }

  public final fun setTrailLifetime(secs: Double): Unit {
    TransferContext.writeArguments(DOUBLE to secs)
    TransferContext.callMethod(ptr, MethodBindings.setTrailLifetimePtr, NIL)
  }

  public final fun isTrailEnabled(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.isTrailEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getTrailLifetime(): Double {
    TransferContext.callMethod(ptr, MethodBindings.getTrailLifetimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setTrailSections(sections: Int): Unit {
    TransferContext.writeArguments(LONG to sections.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTrailSectionsPtr, NIL)
  }

  public final fun getTrailSections(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getTrailSectionsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTrailSectionSubdivisions(subdivisions: Int): Unit {
    TransferContext.writeArguments(LONG to subdivisions.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTrailSectionSubdivisionsPtr, NIL)
  }

  public final fun getTrailSectionSubdivisions(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getTrailSectionSubdivisionsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets this node's properties to match a given [CPUParticles2D] node.
   */
  public final fun convertFromParticles(particles: Node?): Unit {
    TransferContext.writeArguments(OBJECT to particles)
    TransferContext.callMethod(ptr, MethodBindings.convertFromParticlesPtr, NIL)
  }

  public final fun setAmountRatio(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAmountRatioPtr, NIL)
  }

  public final fun getAmountRatio(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getAmountRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setUseFixedSeed(useFixedSeed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useFixedSeed)
    TransferContext.callMethod(ptr, MethodBindings.setUseFixedSeedPtr, NIL)
  }

  public final fun getUseFixedSeed(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.getUseFixedSeedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSeed(seed: Long): Unit {
    TransferContext.writeArguments(LONG to seed)
    TransferContext.callMethod(ptr, MethodBindings.setSeedPtr, NIL)
  }

  public final fun getSeed(): Long {
    TransferContext.callMethod(ptr, MethodBindings.getSeedPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
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

  public object MethodBindings {
    internal val setEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_emitting", 2586408642)

    internal val setAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_amount", 1286410249)

    internal val setLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_lifetime", 373806689)

    internal val setOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_one_shot", 2586408642)

    internal val setPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_pre_process_time", 373806689)

    internal val setExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_explosiveness_ratio", 373806689)

    internal val setRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_randomness_ratio", 373806689)

    internal val setVisibilityRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_visibility_rect", 2046264180)

    internal val setUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_use_local_coordinates", 2586408642)

    internal val setFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_fixed_fps", 1286410249)

    internal val setFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_fractional_delta", 2586408642)

    internal val setInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_interpolate", 2586408642)

    internal val setProcessMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_process_material", 2757459619)

    internal val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_speed_scale", 373806689)

    internal val setCollisionBaseSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_collision_base_size", 373806689)

    internal val setInterpToEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_interp_to_end", 373806689)

    internal val requestParticlesProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "request_particles_process", 373806689)

    internal val isEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "is_emitting", 36873697)

    internal val getAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_amount", 3905245786)

    internal val getLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_lifetime", 1740695150)

    internal val getOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_one_shot", 36873697)

    internal val getPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_pre_process_time", 1740695150)

    internal val getExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_explosiveness_ratio", 1740695150)

    internal val getRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_randomness_ratio", 1740695150)

    internal val getVisibilityRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_visibility_rect", 1639390495)

    internal val getUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_use_local_coordinates", 36873697)

    internal val getFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_fixed_fps", 3905245786)

    internal val getFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_fractional_delta", 36873697)

    internal val getInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_interpolate", 36873697)

    internal val getProcessMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_process_material", 5934680)

    internal val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_speed_scale", 1740695150)

    internal val getCollisionBaseSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_collision_base_size", 1740695150)

    internal val getInterpToEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_interp_to_end", 1740695150)

    internal val setDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_draw_order", 1939677959)

    internal val getDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_draw_order", 941479095)

    internal val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_texture", 4051416890)

    internal val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_texture", 3635182373)

    internal val captureRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "capture_rect", 1639390495)

    internal val restartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "restart", 107499316)

    internal val setSubEmitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_sub_emitter", 1348162250)

    internal val getSubEmitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_sub_emitter", 4075236667)

    internal val emitParticlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "emit_particle", 2179202058)

    internal val setTrailEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_trail_enabled", 2586408642)

    internal val setTrailLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_trail_lifetime", 373806689)

    internal val isTrailEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "is_trail_enabled", 36873697)

    internal val getTrailLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_trail_lifetime", 1740695150)

    internal val setTrailSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_trail_sections", 1286410249)

    internal val getTrailSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_trail_sections", 3905245786)

    internal val setTrailSectionSubdivisionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_trail_section_subdivisions", 1286410249)

    internal val getTrailSectionSubdivisionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_trail_section_subdivisions", 3905245786)

    internal val convertFromParticlesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "convert_from_particles", 1078189570)

    internal val setAmountRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_amount_ratio", 373806689)

    internal val getAmountRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_amount_ratio", 1740695150)

    internal val setUseFixedSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_use_fixed_seed", 2586408642)

    internal val getUseFixedSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_use_fixed_seed", 36873697)

    internal val setSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_seed", 1286410249)

    internal val getSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_seed", 3905245786)
  }
}
