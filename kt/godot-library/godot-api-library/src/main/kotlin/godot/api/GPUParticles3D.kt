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
import godot.core.AABB
import godot.core.Color
import godot.core.NodePath
import godot.core.Signal0
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
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
 * 3D particle node used to create a variety of particle systems and effects. [GPUParticles3D]
 * features an emitter that generates some number of particles at a given rate.
 * Use [processMaterial] to add a [ParticleProcessMaterial] to configure particle appearance and
 * behavior. Alternatively, you can add a [ShaderMaterial] which will be applied to all particles.
 */
@GodotBaseType
public open class GPUParticles3D : GeometryInstance3D() {
  /**
   * Emitted when all active particles have finished processing. To immediately emit new particles,
   * call [restart].
   * Never emitted when [oneShot] is disabled, as particles will be emitted and processed
   * continuously.
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
   * Path to another [GPUParticles3D] node that will be used as a subemitter (see
   * [ParticleProcessMaterial.subEmitterMode]). Subemitters can be used to achieve effects such as
   * fireworks, sparks on collision, bubbles popping into water drops, and more.
   * **Note:** When [subEmitter] is set, the target [GPUParticles3D] node will no longer emit
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
   * If `true`, only the number of particles equal to [amount] will be emitted.
   */
  public final inline var oneShot: Boolean
    @JvmName("oneShotProperty")
    get() = getOneShot()
    @JvmName("oneShotProperty")
    set(`value`) {
      setOneShot(value)
    }

  /**
   * Amount of time to preprocess the particles before animation starts. Lets you start the
   * animation some time after particles have started emitting.
   */
  public final inline var preprocess: Double
    @JvmName("preprocessProperty")
    get() = getPreProcessTime()
    @JvmName("preprocessProperty")
    set(`value`) {
      setPreProcessTime(value)
    }

  /**
   * Speed scaling ratio. A value of `0` can be used to pause the particles.
   */
  public final inline var speedScale: Double
    @JvmName("speedScaleProperty")
    get() = getSpeedScale()
    @JvmName("speedScaleProperty")
    set(`value`) {
      setSpeedScale(value)
    }

  /**
   * Time ratio between each emission. If `0`, particles are emitted continuously. If `1`, all
   * particles are emitted simultaneously.
   */
  public final inline var explosiveness: Float
    @JvmName("explosivenessProperty")
    get() = getExplosivenessRatio()
    @JvmName("explosivenessProperty")
    set(`value`) {
      setExplosivenessRatio(value)
    }

  /**
   * Emission randomness ratio.
   */
  public final inline var randomness: Float
    @JvmName("randomnessProperty")
    get() = getRandomnessRatio()
    @JvmName("randomnessProperty")
    set(`value`) {
      setRandomnessRatio(value)
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
   * The base diameter for particle collision in meters. If particles appear to sink into the ground
   * when colliding, increase this value. If particles appear to float when colliding, decrease this
   * value. Only effective if [ParticleProcessMaterial.collisionMode] is
   * [ParticleProcessMaterial.COLLISION_RIGID] or [ParticleProcessMaterial.COLLISION_HIDE_ON_CONTACT].
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
   * The [AABB] that determines the node's region which needs to be visible on screen for the
   * particle system to be active. [GeometryInstance3D.extraCullMargin] is added on each of the AABB's
   * axes. Particle collisions and attraction will only occur within this area.
   * Grow the box if particles suddenly appear/disappear when the node enters/exits the screen. The
   * [AABB] can be grown via code or with the **Particles → Generate AABB** editor tool.
   * **Note:** [visibilityAabb] is overridden by [GeometryInstance3D.customAabb] if that property is
   * set to a non-default value.
   */
  @CoreTypeLocalCopy
  public final inline var visibilityAabb: AABB
    @JvmName("visibilityAabbProperty")
    get() = getVisibilityAabb()
    @JvmName("visibilityAabbProperty")
    set(`value`) {
      setVisibilityAabb(value)
    }

  /**
   * If `true`, particles use the parent node's coordinate space (known as local coordinates). This
   * will cause particles to move and rotate along the [GPUParticles3D] node (and its parents) when it
   * is moved or rotated. If `false`, particles use global coordinates; they will not move or rotate
   * along the [GPUParticles3D] node (and its parents) when it is moved or rotated.
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
   * **Note:** [DRAW_ORDER_INDEX] is the only option that supports motion vectors for effects like
   * TAA. It is suggested to use this draw order if the particles are opaque to fix ghosting artifacts.
   */
  public final inline var drawOrder: DrawOrder
    @JvmName("drawOrderProperty")
    get() = getDrawOrder()
    @JvmName("drawOrderProperty")
    set(`value`) {
      setDrawOrder(value)
    }

  public final inline var transformAlign: TransformAlign
    @JvmName("transformAlignProperty")
    get() = getTransformAlign()
    @JvmName("transformAlignProperty")
    set(`value`) {
      setTransformAlign(value)
    }

  /**
   * If `true`, enables particle trails using a mesh skinning system. Designed to work with
   * [RibbonTrailMesh] and [TubeTrailMesh].
   * **Note:** [BaseMaterial3D.useParticleTrails] must also be enabled on the particle mesh's
   * material. Otherwise, setting [trailEnabled] to `true` will have no effect.
   * **Note:** Unlike [GPUParticles2D], the number of trail sections and subdivisions is set in the
   * [RibbonTrailMesh] or the [TubeTrailMesh]'s properties.
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
   * [Material] for processing particles. Can be a [ParticleProcessMaterial] or a [ShaderMaterial].
   */
  public final inline var processMaterial: Material?
    @JvmName("processMaterialProperty")
    get() = getProcessMaterial()
    @JvmName("processMaterialProperty")
    set(`value`) {
      setProcessMaterial(value)
    }

  /**
   * The number of draw passes when rendering particles.
   */
  public final inline var drawPasses: Int
    @JvmName("drawPassesProperty")
    get() = getDrawPasses()
    @JvmName("drawPassesProperty")
    set(`value`) {
      setDrawPasses(value)
    }

  /**
   * [Mesh] that is drawn for the first draw pass.
   */
  public final inline var drawPass1: Mesh?
    @JvmName("drawPass1Property")
    get() = getDrawPassMesh(0)
    @JvmName("drawPass1Property")
    set(`value`) {
      setDrawPassMesh(0, value)
    }

  /**
   * [Mesh] that is drawn for the second draw pass.
   */
  public final inline var drawPass2: Mesh?
    @JvmName("drawPass2Property")
    get() = getDrawPassMesh(1)
    @JvmName("drawPass2Property")
    set(`value`) {
      setDrawPassMesh(1, value)
    }

  /**
   * [Mesh] that is drawn for the third draw pass.
   */
  public final inline var drawPass3: Mesh?
    @JvmName("drawPass3Property")
    get() = getDrawPassMesh(2)
    @JvmName("drawPass3Property")
    set(`value`) {
      setDrawPassMesh(2, value)
    }

  /**
   * [Mesh] that is drawn for the fourth draw pass.
   */
  public final inline var drawPass4: Mesh?
    @JvmName("drawPass4Property")
    get() = getDrawPassMesh(3)
    @JvmName("drawPass4Property")
    set(`value`) {
      setDrawPassMesh(3, value)
    }

  public final inline var drawSkin: Skin?
    @JvmName("drawSkinProperty")
    get() = getSkin()
    @JvmName("drawSkinProperty")
    set(`value`) {
      setSkin(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(269, scriptIndex)
  }

  /**
   * The [AABB] that determines the node's region which needs to be visible on screen for the
   * particle system to be active. [GeometryInstance3D.extraCullMargin] is added on each of the AABB's
   * axes. Particle collisions and attraction will only occur within this area.
   * Grow the box if particles suddenly appear/disappear when the node enters/exits the screen. The
   * [AABB] can be grown via code or with the **Particles → Generate AABB** editor tool.
   * **Note:** [visibilityAabb] is overridden by [GeometryInstance3D.customAabb] if that property is
   * set to a non-default value.
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
  public final fun visibilityAabbMutate(block: AABB.() -> Unit): AABB = visibilityAabb.apply{
      block(this)
      visibilityAabb = this
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

  public final fun setOneShot(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
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

  public final fun setVisibilityAabb(aabb: AABB): Unit {
    TransferContext.writeArguments(godot.core.VariantParser.AABB to aabb)
    TransferContext.callMethod(ptr, MethodBindings.setVisibilityAabbPtr, NIL)
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

  public final fun isEmitting(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEmittingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getAmount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAmountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getLifetime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLifetimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getOneShot(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOneShotPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getPreProcessTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPreProcessTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getExplosivenessRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getExplosivenessRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getRandomnessRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRandomnessRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getVisibilityAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibilityAabbPtr,
        godot.core.VariantParser.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantParser.AABB) as AABB)
  }

  public final fun getUseLocalCoordinates(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUseLocalCoordinatesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getFixedFps(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFixedFpsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getFractionalDelta(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFractionalDeltaPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getInterpolate(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInterpolatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getProcessMaterial(): Material? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProcessMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Material?)
  }

  public final fun getSpeedScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpeedScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getCollisionBaseSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionBaseSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getInterpToEnd(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInterpToEndPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDrawOrder(order: DrawOrder): Unit {
    TransferContext.writeArguments(LONG to order.id)
    TransferContext.callMethod(ptr, MethodBindings.setDrawOrderPtr, NIL)
  }

  public final fun getDrawOrder(): DrawOrder {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDrawOrderPtr, LONG)
    return GPUParticles3D.DrawOrder.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDrawPasses(passes: Int): Unit {
    TransferContext.writeArguments(LONG to passes.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDrawPassesPtr, NIL)
  }

  /**
   * Sets the [Mesh] that is drawn at index [pass].
   */
  public final fun setDrawPassMesh(pass: Int, mesh: Mesh?): Unit {
    TransferContext.writeArguments(LONG to pass.toLong(), OBJECT to mesh)
    TransferContext.callMethod(ptr, MethodBindings.setDrawPassMeshPtr, NIL)
  }

  public final fun getDrawPasses(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDrawPassesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [Mesh] that is drawn at index [pass].
   */
  public final fun getDrawPassMesh(pass: Int): Mesh? {
    TransferContext.writeArguments(LONG to pass.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getDrawPassMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Mesh?)
  }

  public final fun setSkin(skin: Skin?): Unit {
    TransferContext.writeArguments(OBJECT to skin)
    TransferContext.callMethod(ptr, MethodBindings.setSkinPtr, NIL)
  }

  public final fun getSkin(): Skin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkinPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Skin?)
  }

  /**
   * Restarts the particle emission cycle, clearing existing particles. To avoid particles vanishing
   * from the viewport, wait for the [signal finished] signal before calling.
   * **Note:** The [signal finished] signal is only emitted by [oneShot] emitters.
   */
  public final fun restart(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.restartPtr, NIL)
  }

  /**
   * Returns the axis-aligned bounding box that contains all the particles that are active in the
   * current frame.
   */
  public final fun captureAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.captureAabbPtr, godot.core.VariantParser.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantParser.AABB) as AABB)
  }

  public final fun setSubEmitter(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.setSubEmitterPtr, NIL)
  }

  public final fun getSubEmitter(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubEmitterPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Emits a single particle. Whether [xform], [velocity], [color] and [custom] are applied depends
   * on the value of [flags]. See [EmitFlags].
   * The default ParticleProcessMaterial will overwrite [color] and use the contents of [custom] as
   * `(rotation, age, animation, lifetime)`.
   */
  public final fun emitParticle(
    xform: Transform3D,
    velocity: Vector3,
    color: Color,
    custom: Color,
    flags: Long,
  ): Unit {
    TransferContext.writeArguments(TRANSFORM3D to xform, VECTOR3 to velocity, COLOR to color, COLOR to custom, LONG to flags)
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
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTrailEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getTrailLifetime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTrailLifetimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setTransformAlign(align: TransformAlign): Unit {
    TransferContext.writeArguments(LONG to align.id)
    TransferContext.callMethod(ptr, MethodBindings.setTransformAlignPtr, NIL)
  }

  public final fun getTransformAlign(): TransformAlign {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTransformAlignPtr, LONG)
    return GPUParticles3D.TransformAlign.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets this node's properties to match a given [CPUParticles3D] node.
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
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAmountRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
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

  public enum class TransformAlign(
    id: Long,
  ) {
    TRANSFORM_ALIGN_DISABLED(0),
    TRANSFORM_ALIGN_Z_BILLBOARD(1),
    TRANSFORM_ALIGN_Y_TO_VELOCITY(2),
    TRANSFORM_ALIGN_Z_BILLBOARD_Y_TO_VELOCITY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TransformAlign = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Maximum number of draw passes supported.
     */
    public final const val MAX_DRAW_PASSES: Long = 4
  }

  public object MethodBindings {
    internal val setEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_emitting", 2586408642)

    internal val setAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_amount", 1286410249)

    internal val setLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_lifetime", 373806689)

    internal val setOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_one_shot", 2586408642)

    internal val setPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_pre_process_time", 373806689)

    internal val setExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_explosiveness_ratio", 373806689)

    internal val setRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_randomness_ratio", 373806689)

    internal val setVisibilityAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_visibility_aabb", 259215842)

    internal val setUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_use_local_coordinates", 2586408642)

    internal val setFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_fixed_fps", 1286410249)

    internal val setFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_fractional_delta", 2586408642)

    internal val setInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_interpolate", 2586408642)

    internal val setProcessMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_process_material", 2757459619)

    internal val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_speed_scale", 373806689)

    internal val setCollisionBaseSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_collision_base_size", 373806689)

    internal val setInterpToEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_interp_to_end", 373806689)

    internal val isEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "is_emitting", 36873697)

    internal val getAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_amount", 3905245786)

    internal val getLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_lifetime", 1740695150)

    internal val getOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_one_shot", 36873697)

    internal val getPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_pre_process_time", 1740695150)

    internal val getExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_explosiveness_ratio", 1740695150)

    internal val getRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_randomness_ratio", 1740695150)

    internal val getVisibilityAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_visibility_aabb", 1068685055)

    internal val getUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_use_local_coordinates", 36873697)

    internal val getFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_fixed_fps", 3905245786)

    internal val getFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_fractional_delta", 36873697)

    internal val getInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_interpolate", 36873697)

    internal val getProcessMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_process_material", 5934680)

    internal val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_speed_scale", 1740695150)

    internal val getCollisionBaseSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_collision_base_size", 1740695150)

    internal val getInterpToEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_interp_to_end", 1740695150)

    internal val setDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_draw_order", 1208074815)

    internal val getDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_draw_order", 3770381780)

    internal val setDrawPassesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_draw_passes", 1286410249)

    internal val setDrawPassMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_draw_pass_mesh", 969122797)

    internal val getDrawPassesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_draw_passes", 3905245786)

    internal val getDrawPassMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_draw_pass_mesh", 1576363275)

    internal val setSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_skin", 3971435618)

    internal val getSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_skin", 2074563878)

    internal val restartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "restart", 3218959716)

    internal val captureAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "capture_aabb", 1068685055)

    internal val setSubEmitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_sub_emitter", 1348162250)

    internal val getSubEmitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_sub_emitter", 4075236667)

    internal val emitParticlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "emit_particle", 992173727)

    internal val setTrailEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_trail_enabled", 2586408642)

    internal val setTrailLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_trail_lifetime", 373806689)

    internal val isTrailEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "is_trail_enabled", 36873697)

    internal val getTrailLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_trail_lifetime", 1740695150)

    internal val setTransformAlignPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_transform_align", 3892425954)

    internal val getTransformAlignPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_transform_align", 2100992166)

    internal val convertFromParticlesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "convert_from_particles", 1078189570)

    internal val setAmountRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "set_amount_ratio", 373806689)

    internal val getAmountRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles3D", "get_amount_ratio", 1740695150)
  }
}
