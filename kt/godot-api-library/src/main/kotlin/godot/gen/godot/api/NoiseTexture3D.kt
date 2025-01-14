// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Uses the [FastNoiseLite] library or other noise generators to fill the texture data of your
 * desired size.
 * The class uses [Thread]s to generate the texture data internally, so [Texture3D.getData] may
 * return `null` if the generation process has not completed yet. In that case, you need to wait for
 * the texture to be generated before accessing the image:
 * [codeblock]
 * var texture = NoiseTexture3D.new()
 * texture.noise = FastNoiseLite.new()
 * await texture.changed
 * var data = texture.get_data()
 * [/codeblock]
 */
@GodotBaseType
public open class NoiseTexture3D : Texture3D() {
  /**
   * Width of the generated texture (in pixels).
   */
  public final inline var width: Int
    @JvmName("widthProperty")
    get() = getWidth()
    @JvmName("widthProperty")
    set(`value`) {
      setWidth(value)
    }

  /**
   * Height of the generated texture (in pixels).
   */
  public final inline var height: Int
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  /**
   * Depth of the generated texture (in pixels).
   */
  public final inline var depth: Int
    @JvmName("depthProperty")
    get() = getDepth()
    @JvmName("depthProperty")
    set(`value`) {
      setDepth(value)
    }

  /**
   * If `true`, inverts the noise texture. White becomes black, black becomes white.
   */
  public final inline var invert: Boolean
    @JvmName("invertProperty")
    get() = getInvert()
    @JvmName("invertProperty")
    set(`value`) {
      setInvert(value)
    }

  /**
   * If `true`, a seamless texture is requested from the [Noise] resource.
   * **Note:** Seamless noise textures may take longer to generate and/or can have a lower contrast
   * compared to non-seamless noise depending on the used [Noise] resource. This is because some
   * implementations use higher dimensions for generating seamless noise.
   * **Note:** The default [FastNoiseLite] implementation uses the fallback path for seamless
   * generation. If using a [width], [height] or [depth] lower than the default, you may need to
   * increase [seamlessBlendSkirt] to make seamless blending more effective.
   */
  public final inline var seamless: Boolean
    @JvmName("seamlessProperty")
    get() = getSeamless()
    @JvmName("seamlessProperty")
    set(`value`) {
      setSeamless(value)
    }

  /**
   * Used for the default/fallback implementation of the seamless texture generation. It determines
   * the distance over which the seams are blended. High values may result in less details and
   * contrast. See [Noise] for further details.
   * **Note:** If using a [width], [height] or [depth] lower than the default, you may need to
   * increase [seamlessBlendSkirt] to make seamless blending more effective.
   */
  public final inline var seamlessBlendSkirt: Float
    @JvmName("seamlessBlendSkirtProperty")
    get() = getSeamlessBlendSkirt()
    @JvmName("seamlessBlendSkirtProperty")
    set(`value`) {
      setSeamlessBlendSkirt(value)
    }

  /**
   * If `true`, the noise image coming from the noise generator is normalized to the range `0.0` to
   * `1.0`.
   * Turning normalization off can affect the contrast and allows you to generate non repeating
   * tileable noise textures.
   */
  public final inline var normalize: Boolean
    @JvmName("normalizeProperty")
    get() = isNormalized()
    @JvmName("normalizeProperty")
    set(`value`) {
      setNormalize(value)
    }

  /**
   * A [Gradient] which is used to map the luminance of each pixel to a color value.
   */
  public final inline var colorRamp: Gradient?
    @JvmName("colorRampProperty")
    get() = getColorRamp()
    @JvmName("colorRampProperty")
    set(`value`) {
      setColorRamp(value)
    }

  /**
   * The instance of the [Noise] object.
   */
  public final inline var noise: Noise?
    @JvmName("noiseProperty")
    get() = getNoise()
    @JvmName("noiseProperty")
    set(`value`) {
      setNoise(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_NOISETEXTURE3D, scriptIndex)
  }

  public final fun setWidth(width: Int): Unit {
    TransferContext.writeArguments(LONG to width.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun setHeight(height: Int): Unit {
    TransferContext.writeArguments(LONG to height.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun setDepth(depth: Int): Unit {
    TransferContext.writeArguments(LONG to depth.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDepthPtr, NIL)
  }

  public final fun setInvert(invert: Boolean): Unit {
    TransferContext.writeArguments(BOOL to invert)
    TransferContext.callMethod(ptr, MethodBindings.setInvertPtr, NIL)
  }

  public final fun getInvert(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInvertPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSeamless(seamless: Boolean): Unit {
    TransferContext.writeArguments(BOOL to seamless)
    TransferContext.callMethod(ptr, MethodBindings.setSeamlessPtr, NIL)
  }

  public final fun getSeamless(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSeamlessPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSeamlessBlendSkirt(seamlessBlendSkirt: Float): Unit {
    TransferContext.writeArguments(DOUBLE to seamlessBlendSkirt.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSeamlessBlendSkirtPtr, NIL)
  }

  public final fun getSeamlessBlendSkirt(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSeamlessBlendSkirtPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setNormalize(normalize: Boolean): Unit {
    TransferContext.writeArguments(BOOL to normalize)
    TransferContext.callMethod(ptr, MethodBindings.setNormalizePtr, NIL)
  }

  public final fun isNormalized(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isNormalizedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setColorRamp(gradient: Gradient?): Unit {
    TransferContext.writeArguments(OBJECT to gradient)
    TransferContext.callMethod(ptr, MethodBindings.setColorRampPtr, NIL)
  }

  public final fun getColorRamp(): Gradient? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorRampPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Gradient?)
  }

  public final fun setNoise(noise: Noise?): Unit {
    TransferContext.writeArguments(OBJECT to noise)
    TransferContext.callMethod(ptr, MethodBindings.setNoisePtr, NIL)
  }

  public final fun getNoise(): Noise? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNoisePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Noise?)
  }

  public companion object

  internal object MethodBindings {
    public val setWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "set_width", 1286410249)

    public val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "set_height", 1286410249)

    public val setDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "set_depth", 1286410249)

    public val setInvertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "set_invert", 2586408642)

    public val getInvertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "get_invert", 36873697)

    public val setSeamlessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "set_seamless", 2586408642)

    public val getSeamlessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "get_seamless", 2240911060)

    public val setSeamlessBlendSkirtPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "set_seamless_blend_skirt", 373806689)

    public val getSeamlessBlendSkirtPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "get_seamless_blend_skirt", 191475506)

    public val setNormalizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "set_normalize", 2586408642)

    public val isNormalizedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "is_normalized", 36873697)

    public val setColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "set_color_ramp", 2756054477)

    public val getColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "get_color_ramp", 132272999)

    public val setNoisePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "set_noise", 4135492439)

    public val getNoisePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "get_noise", 185851837)
  }
}
