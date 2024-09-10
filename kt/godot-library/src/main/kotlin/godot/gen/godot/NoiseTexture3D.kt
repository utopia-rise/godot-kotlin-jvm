// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
  public var width: Int
    @JvmName("getWidth_prop")
    get() = super.getWidth()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
    }

  /**
   * Height of the generated texture (in pixels).
   */
  public var height: Int
    @JvmName("getHeight_prop")
    get() = super.getHeight()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
    }

  /**
   * Depth of the generated texture (in pixels).
   */
  public var depth: Int
    @JvmName("getDepth_prop")
    get() = super.getDepth()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
    }

  /**
   * If `true`, inverts the noise texture. White becomes black, black becomes white.
   */
  public var invert: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInvertPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInvertPtr, NIL)
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
  public var seamless: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSeamlessPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSeamlessPtr, NIL)
    }

  /**
   * Used for the default/fallback implementation of the seamless texture generation. It determines
   * the distance over which the seams are blended. High values may result in less details and
   * contrast. See [Noise] for further details.
   * **Note:** If using a [width], [height] or [depth] lower than the default, you may need to
   * increase [seamlessBlendSkirt] to make seamless blending more effective.
   */
  public var seamlessBlendSkirt: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSeamlessBlendSkirtPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSeamlessBlendSkirtPtr, NIL)
    }

  /**
   * If `true`, the noise image coming from the noise generator is normalized to the range `0.0` to
   * `1.0`.
   * Turning normalization off can affect the contrast and allows you to generate non repeating
   * tileable noise textures.
   */
  public var normalize: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isNormalizedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNormalizePtr, NIL)
    }

  /**
   * A [Gradient] which is used to map the luminance of each pixel to a color value.
   */
  public var colorRamp: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorRampPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Gradient?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorRampPtr, NIL)
    }

  /**
   * The instance of the [Noise] object.
   */
  public var noise: Noise?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNoisePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Noise?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNoisePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_NOISETEXTURE3D, scriptIndex)
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
