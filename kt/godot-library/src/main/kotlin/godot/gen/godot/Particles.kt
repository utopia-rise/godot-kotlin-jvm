// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * GPU-based 3D particle emitter.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * 3D particle node used to create a variety of particle systems and effects. [godot.Particles] features an emitter that generates some number of particles at a given rate.
 *
 * Use the `process_material` property to add a [godot.ParticlesMaterial] to configure particle appearance and behavior. Alternatively, you can add a [godot.ShaderMaterial] which will be applied to all particles.
 *
 * **Note:** [godot.Particles] only work when using the GLES3 renderer. If using the GLES2 renderer, use [godot.CPUParticles] instead. You can convert [godot.Particles] to [godot.CPUParticles] by selecting the node, clicking the **Particles** menu at the top of the 3D editor viewport then choosing **Convert to CPUParticles**.
 *
 * **Note:** On macOS, [godot.Particles] rendering is much slower than [godot.CPUParticles] due to transform feedback being implemented on the CPU instead of the GPU. Consider using [godot.CPUParticles] instead when targeting macOS.
 *
 * **Note:** After working on a Particles node, remember to update its [visibilityAabb] by selecting it, clicking the **Particles** menu at the top of the 3D editor viewport then choose **Generate Visibility AABB**. Otherwise, particles may suddenly disappear depending on the camera position and angle.
 */
@GodotBaseType
public open class Particles : GeometryInstance() {
  /**
   * The number of particles emitted in one emission cycle (corresponding to the [lifetime]).
   *
   * **Note:** Changing [amount] will reset the particle emission, therefore removing all particles that were already emitted before changing [amount].
   */
  public open var amount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_AMOUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_AMOUNT, NIL)
    }

  /**
   * Particle draw order. Uses [enum DrawOrder] values.
   */
  public open var drawOrder: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_DRAW_ORDER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_DRAW_ORDER, NIL)
    }

  /**
   * [godot.Mesh] that is drawn for the first draw pass.
   */
  public open var drawPass1: Mesh?
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_DRAW_PASS_1, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_DRAW_PASS_1, NIL)
    }

  /**
   * [godot.Mesh] that is drawn for the second draw pass.
   */
  public open var drawPass2: Mesh?
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_DRAW_PASS_2, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_DRAW_PASS_2, NIL)
    }

  /**
   * [godot.Mesh] that is drawn for the third draw pass.
   */
  public open var drawPass3: Mesh?
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_DRAW_PASS_3, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_DRAW_PASS_3, NIL)
    }

  /**
   * [godot.Mesh] that is drawn for the fourth draw pass.
   */
  public open var drawPass4: Mesh?
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_DRAW_PASS_4, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_DRAW_PASS_4, NIL)
    }

  /**
   * The number of draw passes when rendering particles.
   */
  public open var drawPasses: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_DRAW_PASSES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_DRAW_PASSES, NIL)
    }

  /**
   * If `true`, particles are being emitted.
   */
  public open var emitting: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_EMITTING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_EMITTING, NIL)
    }

  /**
   * Time ratio between each emission. If `0`, particles are emitted continuously. If `1`, all particles are emitted simultaneously.
   */
  public open var explosiveness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_EXPLOSIVENESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_EXPLOSIVENESS, NIL)
    }

  /**
   * The particle system's frame rate is fixed to a value. For instance, changing the value to 2 will make the particles render at 2 frames per second. Note this does not slow down the simulation of the particle system itself.
   */
  public open var fixedFps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_FIXED_FPS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_FIXED_FPS, NIL)
    }

  /**
   * If `true`, results in fractional delta calculation which has a smoother particles display effect.
   */
  public open var fractDelta: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_FRACT_DELTA, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_FRACT_DELTA, NIL)
    }

  /**
   * The amount of time each particle will exist (in seconds).
   */
  public open var lifetime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_LIFETIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_LIFETIME, NIL)
    }

  /**
   * If `true`, particles use the parent node's coordinate space. If `false`, they use global coordinates.
   */
  public open var localCoords: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_LOCAL_COORDS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_LOCAL_COORDS, NIL)
    }

  /**
   * If `true`, only `amount` particles will be emitted.
   */
  public open var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_ONE_SHOT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_ONE_SHOT, NIL)
    }

  /**
   * Amount of time to preprocess the particles before animation starts. Lets you start the animation some time after particles have started emitting.
   */
  public open var preprocess: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_PREPROCESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_PREPROCESS, NIL)
    }

  /**
   * [godot.Material] for processing particles. Can be a [godot.ParticlesMaterial] or a [godot.ShaderMaterial].
   */
  public open var processMaterial: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_PROCESS_MATERIAL,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_PROCESS_MATERIAL,
          NIL)
    }

  /**
   * Emission randomness ratio.
   */
  public open var randomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_RANDOMNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_RANDOMNESS, NIL)
    }

  /**
   * Speed scaling ratio. A value of `0` can be used to pause the particles.
   */
  public open var speedScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_SPEED_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_SPEED_SCALE, NIL)
    }

  /**
   * The [AABB] that determines the node's region which needs to be visible on screen for the particle system to be active.
   *
   * Grow the box if particles suddenly appear/disappear when the node enters/exits the screen. The [AABB] can be grown via code or with the **Particles → Generate AABB** editor tool.
   *
   * **Note:** If the [godot.ParticlesMaterial] in use is configured to cast shadows, you may want to enlarge this AABB to ensure the shadow is updated when particles are off-screen.
   */
  public open var visibilityAabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_GET_VISIBILITY_AABB,
          godot.core.VariantType.AABB)
      return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
    }
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_SET_VISIBILITY_AABB,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PARTICLES)
  }

  @CoreTypeHelper
  public open fun visibilityAabb(schedule: AABB.() -> Unit): AABB = visibilityAabb.apply{
      schedule(this)
      visibilityAabb = this
  }


  /**
   * Returns the axis-aligned bounding box that contains all the particles that are active in the current frame.
   */
  public open fun captureAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_CAPTURE_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Restarts the particle emission, clearing existing particles.
   */
  public open fun restart(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES_RESTART, NIL)
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
     * Particles are drawn in order of depth.
     */
    DRAW_ORDER_VIEW_DEPTH(2),
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
     * Particles are drawn in the order emitted.
     */
    public final const val DRAW_ORDER_INDEX: Long = 0

    /**
     * Particles are drawn in order of remaining lifetime.
     */
    public final const val DRAW_ORDER_LIFETIME: Long = 1

    /**
     * Particles are drawn in order of depth.
     */
    public final const val DRAW_ORDER_VIEW_DEPTH: Long = 2

    /**
     * Maximum number of draw passes supported.
     */
    public final const val MAX_DRAW_PASSES: Long = 4
  }
}
