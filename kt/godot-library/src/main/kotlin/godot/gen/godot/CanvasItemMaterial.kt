// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

/**
 * A material for [godot.CanvasItem]s.
 *
 * [godot.CanvasItemMaterial]s provide a means of modifying the textures associated with a CanvasItem. They specialize in describing blend and lighting behaviors for textures. Use a [godot.ShaderMaterial] to more fully customize a material's interactions with a [godot.CanvasItem].
 */
@GodotBaseType
open class CanvasItemMaterial : Material() {
  /**
   * The manner in which a material's rendering is applied to underlying textures.
   */
  open var blendMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_GET_BLEND_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_SET_BLEND_MODE,
          NIL)
    }

  /**
   * The manner in which material reacts to lighting.
   */
  open var lightMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_GET_LIGHT_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_SET_LIGHT_MODE,
          NIL)
    }

  /**
   * The number of columns in the spritesheet assigned as [godot.Texture] for a [godot.Particles2D] or [godot.CPUParticles2D].
   *
   * **Note:** This property is only used and visible in the editor if [particlesAnimation] is `true`.
   */
  open var particlesAnimHFrames: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_GET_PARTICLES_ANIM_H_FRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_SET_PARTICLES_ANIM_H_FRAMES, NIL)
    }

  /**
   * If `true`, the particles animation will loop.
   *
   * **Note:** This property is only used and visible in the editor if [particlesAnimation] is `true`.
   */
  open var particlesAnimLoop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_GET_PARTICLES_ANIM_LOOP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_SET_PARTICLES_ANIM_LOOP, NIL)
    }

  /**
   * The number of rows in the spritesheet assigned as [godot.Texture] for a [godot.Particles2D] or [godot.CPUParticles2D].
   *
   * **Note:** This property is only used and visible in the editor if [particlesAnimation] is `true`.
   */
  open var particlesAnimVFrames: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_GET_PARTICLES_ANIM_V_FRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_SET_PARTICLES_ANIM_V_FRAMES, NIL)
    }

  /**
   * If `true`, enable spritesheet-based animation features when assigned to [godot.Particles2D] and [godot.CPUParticles2D] nodes. The [godot.ParticlesMaterial.animSpeed] or [godot.CPUParticles2D.animSpeed] should also be set to a positive value for the animation to play.
   *
   * This property (and other `particles_anim_*` properties that depend on it) has no effect on other types of nodes.
   */
  open var particlesAnimation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_GET_PARTICLES_ANIMATION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_SET_PARTICLES_ANIMATION, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_CANVASITEMMATERIAL)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  enum class LightMode(
    id: Long
  ) {
    /**
     * Render the material using both light and non-light sensitive material properties.
     */
    LIGHT_MODE_NORMAL(0),

    /**
     * Render the material as if there were no light.
     */
    LIGHT_MODE_UNSHADED(1),

    /**
     * Render the material as if there were only light.
     */
    LIGHT_MODE_LIGHT_ONLY(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BlendMode(
    id: Long
  ) {
    /**
     * Mix blending mode. Colors are assumed to be independent of the alpha (opacity) value.
     */
    BLEND_MODE_MIX(0),

    /**
     * Additive blending mode.
     */
    BLEND_MODE_ADD(1),

    /**
     * Subtractive blending mode.
     */
    BLEND_MODE_SUB(2),

    /**
     * Multiplicative blending mode.
     */
    BLEND_MODE_MUL(3),

    /**
     * Mix blending mode. Colors are assumed to be premultiplied by the alpha (opacity) value.
     */
    BLEND_MODE_PREMULT_ALPHA(4);

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
     * Additive blending mode.
     */
    final const val BLEND_MODE_ADD: Long = 1

    /**
     * Mix blending mode. Colors are assumed to be independent of the alpha (opacity) value.
     */
    final const val BLEND_MODE_MIX: Long = 0

    /**
     * Multiplicative blending mode.
     */
    final const val BLEND_MODE_MUL: Long = 3

    /**
     * Mix blending mode. Colors are assumed to be premultiplied by the alpha (opacity) value.
     */
    final const val BLEND_MODE_PREMULT_ALPHA: Long = 4

    /**
     * Subtractive blending mode.
     */
    final const val BLEND_MODE_SUB: Long = 2

    /**
     * Render the material as if there were only light.
     */
    final const val LIGHT_MODE_LIGHT_ONLY: Long = 2

    /**
     * Render the material using both light and non-light sensitive material properties.
     */
    final const val LIGHT_MODE_NORMAL: Long = 0

    /**
     * Render the material as if there were no light.
     */
    final const val LIGHT_MODE_UNSHADED: Long = 1
  }
}
