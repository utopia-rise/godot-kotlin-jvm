// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * [CanvasItemMaterial]s provide a means of modifying the textures associated with a CanvasItem.
 * They specialize in describing blend and lighting behaviors for textures. Use a [ShaderMaterial] to
 * more fully customize a material's interactions with a [CanvasItem].
 */
@GodotBaseType
public open class CanvasItemMaterial : Material() {
  /**
   * The manner in which a material's rendering is applied to underlying textures.
   */
  public var blendMode: BlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBlendModePtr, LONG)
      return CanvasItemMaterial.BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBlendModePtr, NIL)
    }

  /**
   * The manner in which material reacts to lighting.
   */
  public var lightMode: LightMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLightModePtr, LONG)
      return CanvasItemMaterial.LightMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLightModePtr, NIL)
    }

  /**
   * If `true`, enable spritesheet-based animation features when assigned to [GPUParticles2D] and
   * [CPUParticles2D] nodes. The [ParticleProcessMaterial.animSpeedMax] or
   * [CPUParticles2D.animSpeedMax] should also be set to a positive value for the animation to play.
   * This property (and other `particles_anim_*` properties that depend on it) has no effect on
   * other types of nodes.
   */
  public var particlesAnimation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParticlesAnimationPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParticlesAnimationPtr, NIL)
    }

  /**
   * The number of columns in the spritesheet assigned as [Texture2D] for a [GPUParticles2D] or
   * [CPUParticles2D].
   * **Note:** This property is only used and visible in the editor if [particlesAnimation] is
   * `true`.
   */
  public var particlesAnimHFrames: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParticlesAnimHFramesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setParticlesAnimHFramesPtr, NIL)
    }

  /**
   * The number of rows in the spritesheet assigned as [Texture2D] for a [GPUParticles2D] or
   * [CPUParticles2D].
   * **Note:** This property is only used and visible in the editor if [particlesAnimation] is
   * `true`.
   */
  public var particlesAnimVFrames: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParticlesAnimVFramesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setParticlesAnimVFramesPtr, NIL)
    }

  /**
   * If `true`, the particles animation will loop.
   * **Note:** This property is only used and visible in the editor if [particlesAnimation] is
   * `true`.
   */
  public var particlesAnimLoop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParticlesAnimLoopPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParticlesAnimLoopPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CANVASITEMMATERIAL, scriptIndex)
    return true
  }

  public enum class BlendMode(
    id: Long,
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
    BLEND_MODE_PREMULT_ALPHA(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LightMode(
    id: Long,
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
    LIGHT_MODE_LIGHT_ONLY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_blend_mode")

    public val getBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_blend_mode")

    public val setLightModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_light_mode")

    public val getLightModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_light_mode")

    public val setParticlesAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_particles_animation")

    public val getParticlesAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_particles_animation")

    public val setParticlesAnimHFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_particles_anim_h_frames")

    public val getParticlesAnimHFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_particles_anim_h_frames")

    public val setParticlesAnimVFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_particles_anim_v_frames")

    public val getParticlesAnimVFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_particles_anim_v_frames")

    public val setParticlesAnimLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_particles_anim_loop")

    public val getParticlesAnimLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_particles_anim_loop")
  }
}
