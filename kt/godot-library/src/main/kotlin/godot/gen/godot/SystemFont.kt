// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [SystemFont] loads a font from a system font with the first matching name from [fontNames].
 * It will attempt to match font style, but it's not guaranteed.
 * The returned font might be part of a font collection or be a variable font with OpenType
 * "weight", "width" and/or "italic" features set.
 * You can create [FontVariation] of the system font for precise control over its features.
 * **Note:** This class is implemented on iOS, Linux, macOS and Windows, on other platforms it will
 * fallback to default theme font.
 */
@GodotBaseType
public open class SystemFont : Font() {
  /**
   * Array of font family names to search, first matching font found is used.
   */
  public var fontNames: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFontNamesPtr, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFontNamesPtr, NIL)
    }

  /**
   * If set to `true`, italic or oblique font is preferred.
   */
  public var fontItalic: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFontItalicPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFontItalicPtr, NIL)
    }

  /**
   * Preferred weight (boldness) of the font. A value in the `100...999` range, normal font weight
   * is `400`, bold font weight is `700`.
   */
  public var fontWeight: Int
    @JvmName("getFontWeight_prop")
    get() = super.getFontWeight()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFontWeightPtr, NIL)
    }

  /**
   * Preferred font stretch amount, compared to a normal width. A percentage value between `50&#37;`
   * and `200&#37;`.
   */
  public var fontStretch: Int
    @JvmName("getFontStretch_prop")
    get() = super.getFontStretch()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFontStretchPtr, NIL)
    }

  /**
   * Font anti-aliasing mode.
   */
  public var antialiasing: TextServer.FontAntialiasing
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAntialiasingPtr, LONG)
      return TextServer.FontAntialiasing.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAntialiasingPtr, NIL)
    }

  /**
   * If set to `true`, generate mipmaps for the font textures.
   */
  public var generateMipmaps: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGenerateMipmapsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGenerateMipmapsPtr, NIL)
    }

  /**
   * If set to `true`, embedded font bitmap loading is disabled (bitmap-only and color fonts ignore
   * this property).
   */
  public var disableEmbeddedBitmaps: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDisableEmbeddedBitmapsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisableEmbeddedBitmapsPtr, NIL)
    }

  /**
   * If set to `true`, system fonts can be automatically used as fallbacks.
   */
  public var allowSystemFallback: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAllowSystemFallbackPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowSystemFallbackPtr, NIL)
    }

  /**
   * If set to `true`, auto-hinting is supported and preferred over font built-in hinting.
   */
  public var forceAutohinter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isForceAutohinterPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setForceAutohinterPtr, NIL)
    }

  /**
   * Font hinting mode.
   */
  public var hinting: TextServer.Hinting
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHintingPtr, LONG)
      return TextServer.Hinting.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHintingPtr, NIL)
    }

  /**
   * Font glyph subpixel positioning mode. Subpixel positioning provides shaper text and better
   * kerning for smaller font sizes, at the cost of memory usage and font rasterization speed. Use
   * [TextServer.SUBPIXEL_POSITIONING_AUTO] to automatically enable it based on the font size.
   */
  public var subpixelPositioning: TextServer.SubpixelPositioning
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubpixelPositioningPtr, LONG)
      return TextServer.SubpixelPositioning.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubpixelPositioningPtr, NIL)
    }

  /**
   * If set to `true`, glyphs of all sizes are rendered using single multichannel signed distance
   * field generated from the dynamic font vector data.
   */
  public var multichannelSignedDistanceField: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMultichannelSignedDistanceFieldPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMultichannelSignedDistanceFieldPtr, NIL)
    }

  /**
   * The width of the range around the shape between the minimum and maximum representable signed
   * distance. If using font outlines, [msdfPixelRange] must be set to at least *twice* the size of the
   * largest font outline. The default [msdfPixelRange] value of `16` allows outline sizes up to `8` to
   * look correct.
   */
  public var msdfPixelRange: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMsdfPixelRangePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMsdfPixelRangePtr, NIL)
    }

  /**
   * Source font size used to generate MSDF textures. Higher values allow for more precision, but
   * are slower to render and require more memory. Only increase this value if you notice a visible
   * lack of precision in glyph rendering.
   */
  public var msdfSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMsdfSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMsdfSizePtr, NIL)
    }

  /**
   * Font oversampling factor, if set to `0.0` global oversampling factor is used instead.
   */
  public var oversampling: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOversamplingPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setOversamplingPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SYSTEMFONT, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_antialiasing")

    public val getAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_antialiasing")

    public val setDisableEmbeddedBitmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_disable_embedded_bitmaps")

    public val getDisableEmbeddedBitmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_disable_embedded_bitmaps")

    public val setGenerateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_generate_mipmaps")

    public val getGenerateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_generate_mipmaps")

    public val setAllowSystemFallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_allow_system_fallback")

    public val isAllowSystemFallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "is_allow_system_fallback")

    public val setForceAutohinterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_force_autohinter")

    public val isForceAutohinterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "is_force_autohinter")

    public val setHintingPtr: VoidPtr = TypeManager.getMethodBindPtr("SystemFont", "set_hinting")

    public val getHintingPtr: VoidPtr = TypeManager.getMethodBindPtr("SystemFont", "get_hinting")

    public val setSubpixelPositioningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_subpixel_positioning")

    public val getSubpixelPositioningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_subpixel_positioning")

    public val setMultichannelSignedDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_multichannel_signed_distance_field")

    public val isMultichannelSignedDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "is_multichannel_signed_distance_field")

    public val setMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_msdf_pixel_range")

    public val getMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_msdf_pixel_range")

    public val setMsdfSizePtr: VoidPtr = TypeManager.getMethodBindPtr("SystemFont", "set_msdf_size")

    public val getMsdfSizePtr: VoidPtr = TypeManager.getMethodBindPtr("SystemFont", "get_msdf_size")

    public val setOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_oversampling")

    public val getOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_oversampling")

    public val getFontNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_font_names")

    public val setFontNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_font_names")

    public val getFontItalicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_font_italic")

    public val setFontItalicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_font_italic")

    public val setFontWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_font_weight")

    public val setFontStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_font_stretch")
  }
}
