// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_NOISETEXTURE3D_INDEX: Int = 372

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
    Internals.callConstructor(this, ENGINE_CLASS_NOISETEXTURE3D_INDEX, scriptIndex)
  }

  public final fun setWidth(width: Int): Unit {
    Internals.writeArguments(LONG to width.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun setHeight(height: Int): Unit {
    Internals.writeArguments(LONG to height.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun setDepth(depth: Int): Unit {
    Internals.writeArguments(LONG to depth.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
  }

  public final fun setInvert(invert: Boolean): Unit {
    Internals.writeArguments(BOOL to invert)
    Internals.callMethod(rawPtr, MethodBindings.setInvertPtr, NIL)
  }

  public final fun getInvert(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInvertPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSeamless(seamless: Boolean): Unit {
    Internals.writeArguments(BOOL to seamless)
    Internals.callMethod(rawPtr, MethodBindings.setSeamlessPtr, NIL)
  }

  public final fun getSeamless(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSeamlessPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSeamlessBlendSkirt(seamlessBlendSkirt: Float): Unit {
    Internals.writeArguments(DOUBLE to seamlessBlendSkirt.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSeamlessBlendSkirtPtr, NIL)
  }

  public final fun getSeamlessBlendSkirt(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSeamlessBlendSkirtPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setNormalize(normalize: Boolean): Unit {
    Internals.writeArguments(BOOL to normalize)
    Internals.callMethod(rawPtr, MethodBindings.setNormalizePtr, NIL)
  }

  public final fun isNormalized(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isNormalizedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setColorRamp(gradient: Gradient?): Unit {
    Internals.writeArguments(OBJECT to gradient)
    Internals.callMethod(rawPtr, MethodBindings.setColorRampPtr, NIL)
  }

  public final fun getColorRamp(): Gradient? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColorRampPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Gradient?)
  }

  public final fun setNoise(noise: Noise?): Unit {
    Internals.writeArguments(OBJECT to noise)
    Internals.callMethod(rawPtr, MethodBindings.setNoisePtr, NIL)
  }

  public final fun getNoise(): Noise? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNoisePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Noise?)
  }

  public companion object

  internal object MethodBindings {
    public val setWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "set_width", 1286410249)

    public val setHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "set_height", 1286410249)

    public val setDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "set_depth", 1286410249)

    public val setInvertPtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "set_invert", 2586408642)

    public val getInvertPtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "get_invert", 36873697)

    public val setSeamlessPtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "set_seamless", 2586408642)

    public val getSeamlessPtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "get_seamless", 2240911060)

    public val setSeamlessBlendSkirtPtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "set_seamless_blend_skirt", 373806689)

    public val getSeamlessBlendSkirtPtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "get_seamless_blend_skirt", 191475506)

    public val setNormalizePtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "set_normalize", 2586408642)

    public val isNormalizedPtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "is_normalized", 36873697)

    public val setColorRampPtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "set_color_ramp", 2756054477)

    public val getColorRampPtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "get_color_ramp", 132272999)

    public val setNoisePtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "set_noise", 4135492439)

    public val getNoisePtr: VoidPtr =
        Internals.getMethodBindPtr("NoiseTexture3D", "get_noise", 185851837)
  }
}
