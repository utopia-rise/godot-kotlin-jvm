// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * 2D particle emitter.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/2d/particle_systems_2d.html](https://docs.godotengine.org/en/latest/tutorials/2d/particle_systems_2d.html)
 *
 * 2D particle node used to create a variety of particle systems and effects. [godot.Particles2D] features an emitter that generates some number of particles at a given rate.
 *
 * Use the `process_material` property to add a [godot.ParticlesMaterial] to configure particle appearance and behavior. Alternatively, you can add a [godot.ShaderMaterial] which will be applied to all particles.
 */
@GodotBaseType
open class Particles2D : Node2D() {
  /**
   * Number of particles emitted in one emission cycle.
   */
  open var amount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_AMOUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_AMOUNT, NIL)
    }

  /**
   * Particle draw order. Uses [enum DrawOrder] values.
   */
  open var drawOrder: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_DRAW_ORDER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_DRAW_ORDER, NIL)
    }

  /**
   * If `true`, particles are being emitted.
   */
  open var emitting: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_EMITTING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_EMITTING, NIL)
    }

  /**
   * How rapidly particles in an emission cycle are emitted. If greater than `0`, there will be a gap in emissions before the next cycle begins.
   */
  open var explosiveness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_EXPLOSIVENESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_EXPLOSIVENESS,
          NIL)
    }

  /**
   * The particle system's frame rate is fixed to a value. For instance, changing the value to 2 will make the particles render at 2 frames per second. Note this does not slow down the simulation of the particle system itself.
   */
  open var fixedFps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_FIXED_FPS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_FIXED_FPS, NIL)
    }

  /**
   * If `true`, results in fractional delta calculation which has a smoother particles display effect.
   */
  open var fractDelta: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_FRACT_DELTA, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_FRACT_DELTA, NIL)
    }

  /**
   * Amount of time each particle will exist.
   */
  open var lifetime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_LIFETIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_LIFETIME, NIL)
    }

  /**
   * If `true`, particles use the parent node's coordinate space. If `false`, they use global coordinates.
   */
  open var localCoords: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_LOCAL_COORDS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_LOCAL_COORDS, NIL)
    }

  /**
   * Normal map to be used for the [texture] property.
   *
   * **Note:** Godot expects the normal map to use X+, Y-, and Z+ coordinates. See [this page](http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates) for a comparison of normal map coordinates expected by popular engines.
   */
  open var normalMap: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_NORMAL_MAP,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_NORMAL_MAP, NIL)
    }

  /**
   * If `true`, only one emission cycle occurs. If set `true` during a cycle, emission will stop at the cycle's end.
   */
  open var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_ONE_SHOT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_ONE_SHOT, NIL)
    }

  /**
   * Particle system starts as if it had already run for this many seconds.
   */
  open var preprocess: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_PREPROCESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_PREPROCESS, NIL)
    }

  /**
   * [godot.Material] for processing particles. Can be a [godot.ParticlesMaterial] or a [godot.ShaderMaterial].
   */
  open var processMaterial: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_PROCESS_MATERIAL,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_PROCESS_MATERIAL,
          NIL)
    }

  /**
   * Emission lifetime randomness ratio.
   */
  open var randomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_RANDOMNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_RANDOMNESS, NIL)
    }

  /**
   * Particle system's running speed scaling ratio. A value of `0` can be used to pause the particles.
   */
  open var speedScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_SPEED_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_SPEED_SCALE, NIL)
    }

  /**
   * Particle texture. If `null`, particles will be squares.
   */
  open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_TEXTURE, NIL)
    }

  /**
   * Editor visibility helper.
   */
  open var visibilityRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_GET_VISIBILITY_RECT,
          RECT2)
      return TransferContext.readReturnValue(RECT2, false) as Rect2
    }
    set(value) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_SET_VISIBILITY_RECT,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_PARTICLES2D)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun visibilityRect(schedule: Rect2.() -> Unit): Rect2 = visibilityRect.apply{
      schedule(this)
      visibilityRect = this
  }


  /**
   * Returns a rectangle containing the positions of all existing particles.
   */
  open fun captureRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_CAPTURE_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Restarts all the existing particles.
   */
  open fun restart() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARTICLES2D_RESTART, NIL)
  }

  enum class DrawOrder(
    id: Long
  ) {
    /**
     * Particles are drawn in the order emitted.
     */
    DRAW_ORDER_INDEX(0),

    /**
     * Particles are drawn in order of remaining lifetime.
     */
    DRAW_ORDER_LIFETIME(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Particles are drawn in the order emitted.
     */
    final const val DRAW_ORDER_INDEX: Long = 0

    /**
     * Particles are drawn in order of remaining lifetime.
     */
    final const val DRAW_ORDER_LIFETIME: Long = 1
  }
}
