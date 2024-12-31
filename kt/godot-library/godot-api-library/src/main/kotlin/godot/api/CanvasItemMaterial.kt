// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_CANVASITEMMATERIAL: Int = 170

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
  public final inline var blendMode: BlendMode
    @JvmName("blendModeProperty")
    get() = getBlendMode()
    @JvmName("blendModeProperty")
    set(`value`) {
      setBlendMode(value)
    }

  /**
   * The manner in which material reacts to lighting.
   */
  public final inline var lightMode: LightMode
    @JvmName("lightModeProperty")
    get() = getLightMode()
    @JvmName("lightModeProperty")
    set(`value`) {
      setLightMode(value)
    }

  /**
   * If `true`, enable spritesheet-based animation features when assigned to [GPUParticles2D] and
   * [CPUParticles2D] nodes. The [ParticleProcessMaterial.animSpeedMax] or
   * [CPUParticles2D.animSpeedMax] should also be set to a positive value for the animation to play.
   * This property (and other `particles_anim_*` properties that depend on it) has no effect on
   * other types of nodes.
   */
  public final inline var particlesAnimation: Boolean
    @JvmName("particlesAnimationProperty")
    get() = getParticlesAnimation()
    @JvmName("particlesAnimationProperty")
    set(`value`) {
      setParticlesAnimation(value)
    }

  /**
   * The number of columns in the spritesheet assigned as [Texture2D] for a [GPUParticles2D] or
   * [CPUParticles2D].
   * **Note:** This property is only used and visible in the editor if [particlesAnimation] is
   * `true`.
   */
  public final inline var particlesAnimHFrames: Int
    @JvmName("particlesAnimHFramesProperty")
    get() = getParticlesAnimHFrames()
    @JvmName("particlesAnimHFramesProperty")
    set(`value`) {
      setParticlesAnimHFrames(value)
    }

  /**
   * The number of rows in the spritesheet assigned as [Texture2D] for a [GPUParticles2D] or
   * [CPUParticles2D].
   * **Note:** This property is only used and visible in the editor if [particlesAnimation] is
   * `true`.
   */
  public final inline var particlesAnimVFrames: Int
    @JvmName("particlesAnimVFramesProperty")
    get() = getParticlesAnimVFrames()
    @JvmName("particlesAnimVFramesProperty")
    set(`value`) {
      setParticlesAnimVFrames(value)
    }

  /**
   * If `true`, the particles animation will loop.
   * **Note:** This property is only used and visible in the editor if [particlesAnimation] is
   * `true`.
   */
  public final inline var particlesAnimLoop: Boolean
    @JvmName("particlesAnimLoopProperty")
    get() = getParticlesAnimLoop()
    @JvmName("particlesAnimLoopProperty")
    set(`value`) {
      setParticlesAnimLoop(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_CANVASITEMMATERIAL, scriptIndex)
  }

  public final fun setBlendMode(blendMode: BlendMode): Unit {
    TransferContext.writeArguments(LONG to blendMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setBlendModePtr, NIL)
  }

  public final fun getBlendMode(): BlendMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBlendModePtr, LONG)
    return CanvasItemMaterial.BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setLightMode(lightMode: LightMode): Unit {
    TransferContext.writeArguments(LONG to lightMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setLightModePtr, NIL)
  }

  public final fun getLightMode(): LightMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLightModePtr, LONG)
    return CanvasItemMaterial.LightMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setParticlesAnimation(particlesAnim: Boolean): Unit {
    TransferContext.writeArguments(BOOL to particlesAnim)
    TransferContext.callMethod(ptr, MethodBindings.setParticlesAnimationPtr, NIL)
  }

  public final fun getParticlesAnimation(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParticlesAnimationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setParticlesAnimHFrames(frames: Int): Unit {
    TransferContext.writeArguments(LONG to frames.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setParticlesAnimHFramesPtr, NIL)
  }

  public final fun getParticlesAnimHFrames(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParticlesAnimHFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setParticlesAnimVFrames(frames: Int): Unit {
    TransferContext.writeArguments(LONG to frames.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setParticlesAnimVFramesPtr, NIL)
  }

  public final fun getParticlesAnimVFrames(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParticlesAnimVFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setParticlesAnimLoop(loop: Boolean): Unit {
    TransferContext.writeArguments(BOOL to loop)
    TransferContext.callMethod(ptr, MethodBindings.setParticlesAnimLoopPtr, NIL)
  }

  public final fun getParticlesAnimLoop(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParticlesAnimLoopPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
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
      public fun from(`value`: Long): BlendMode = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): LightMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_blend_mode", 1786054936)

    internal val getBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_blend_mode", 3318684035)

    internal val setLightModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_light_mode", 628074070)

    internal val getLightModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_light_mode", 3863292382)

    internal val setParticlesAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_particles_animation", 2586408642)

    internal val getParticlesAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_particles_animation", 36873697)

    internal val setParticlesAnimHFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_particles_anim_h_frames", 1286410249)

    internal val getParticlesAnimHFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_particles_anim_h_frames", 3905245786)

    internal val setParticlesAnimVFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_particles_anim_v_frames", 1286410249)

    internal val getParticlesAnimVFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_particles_anim_v_frames", 3905245786)

    internal val setParticlesAnimLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_particles_anim_loop", 2586408642)

    internal val getParticlesAnimLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_particles_anim_loop", 36873697)
  }
}
