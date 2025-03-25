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
import godot.core.PackedStringArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_STRING_ARRAY
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [SystemFont] loads a font from a system font with the first matching name from [fontNames].
 *
 * It will attempt to match font style, but it's not guaranteed.
 *
 * The returned font might be part of a font collection or be a variable font with OpenType
 * "weight", "width" and/or "italic" features set.
 *
 * You can create [FontVariation] of the system font for precise control over its features.
 *
 * **Note:** This class is implemented on iOS, Linux, macOS and Windows, on other platforms it will
 * fallback to default theme font.
 */
@GodotBaseType
public open class SystemFont : Font() {
  /**
   * Array of font family names to search, first matching font found is used.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var fontNames: PackedStringArray
    @JvmName("fontNamesProperty")
    get() = getFontNames()
    @JvmName("fontNamesProperty")
    set(`value`) {
      setFontNames(value)
    }

  /**
   * If set to `true`, italic or oblique font is preferred.
   */
  public final inline var fontItalic: Boolean
    @JvmName("fontItalicProperty")
    get() = getFontItalic()
    @JvmName("fontItalicProperty")
    set(`value`) {
      setFontItalic(value)
    }

  /**
   * Preferred weight (boldness) of the font. A value in the `100...999` range, normal font weight
   * is `400`, bold font weight is `700`.
   */
  public final inline var fontWeight: Int
    @JvmName("fontWeightProperty")
    get() = getFontWeight()
    @JvmName("fontWeightProperty")
    set(`value`) {
      setFontWeight(value)
    }

  /**
   * Preferred font stretch amount, compared to a normal width. A percentage value between `50&#37;`
   * and `200&#37;`.
   */
  public final inline var fontStretch: Int
    @JvmName("fontStretchProperty")
    get() = getFontStretch()
    @JvmName("fontStretchProperty")
    set(`value`) {
      setFontStretch(value)
    }

  /**
   * Font anti-aliasing mode.
   */
  public final inline var antialiasing: TextServer.FontAntialiasing
    @JvmName("antialiasingProperty")
    get() = getAntialiasing()
    @JvmName("antialiasingProperty")
    set(`value`) {
      setAntialiasing(value)
    }

  /**
   * If set to `true`, generate mipmaps for the font textures.
   */
  public final inline var generateMipmaps: Boolean
    @JvmName("generateMipmapsProperty")
    get() = getGenerateMipmaps()
    @JvmName("generateMipmapsProperty")
    set(`value`) {
      setGenerateMipmaps(value)
    }

  /**
   * If set to `true`, embedded font bitmap loading is disabled (bitmap-only and color fonts ignore
   * this property).
   */
  public final inline var disableEmbeddedBitmaps: Boolean
    @JvmName("disableEmbeddedBitmapsProperty")
    get() = getDisableEmbeddedBitmaps()
    @JvmName("disableEmbeddedBitmapsProperty")
    set(`value`) {
      setDisableEmbeddedBitmaps(value)
    }

  /**
   * If set to `true`, system fonts can be automatically used as fallbacks.
   */
  public final inline var allowSystemFallback: Boolean
    @JvmName("allowSystemFallbackProperty")
    get() = isAllowSystemFallback()
    @JvmName("allowSystemFallbackProperty")
    set(`value`) {
      setAllowSystemFallback(value)
    }

  /**
   * If set to `true`, auto-hinting is supported and preferred over font built-in hinting.
   */
  public final inline var forceAutohinter: Boolean
    @JvmName("forceAutohinterProperty")
    get() = isForceAutohinter()
    @JvmName("forceAutohinterProperty")
    set(`value`) {
      setForceAutohinter(value)
    }

  /**
   * Font hinting mode.
   */
  public final inline var hinting: TextServer.Hinting
    @JvmName("hintingProperty")
    get() = getHinting()
    @JvmName("hintingProperty")
    set(`value`) {
      setHinting(value)
    }

  /**
   * Font glyph subpixel positioning mode. Subpixel positioning provides shaper text and better
   * kerning for smaller font sizes, at the cost of memory usage and font rasterization speed. Use
   * [TextServer.SUBPIXEL_POSITIONING_AUTO] to automatically enable it based on the font size.
   */
  public final inline var subpixelPositioning: TextServer.SubpixelPositioning
    @JvmName("subpixelPositioningProperty")
    get() = getSubpixelPositioning()
    @JvmName("subpixelPositioningProperty")
    set(`value`) {
      setSubpixelPositioning(value)
    }

  /**
   * If set to `true`, when aligning glyphs to the pixel boundaries rounding remainders are
   * accumulated to ensure more uniform glyph distribution. This setting has no effect if subpixel
   * positioning is enabled.
   */
  public final inline var keepRoundingRemainders: Boolean
    @JvmName("keepRoundingRemaindersProperty")
    get() = getKeepRoundingRemainders()
    @JvmName("keepRoundingRemaindersProperty")
    set(`value`) {
      setKeepRoundingRemainders(value)
    }

  /**
   * If set to `true`, glyphs of all sizes are rendered using single multichannel signed distance
   * field generated from the dynamic font vector data.
   */
  public final inline var multichannelSignedDistanceField: Boolean
    @JvmName("multichannelSignedDistanceFieldProperty")
    get() = isMultichannelSignedDistanceField()
    @JvmName("multichannelSignedDistanceFieldProperty")
    set(`value`) {
      setMultichannelSignedDistanceField(value)
    }

  /**
   * The width of the range around the shape between the minimum and maximum representable signed
   * distance. If using font outlines, [msdfPixelRange] must be set to at least *twice* the size of the
   * largest font outline. The default [msdfPixelRange] value of `16` allows outline sizes up to `8` to
   * look correct.
   */
  public final inline var msdfPixelRange: Int
    @JvmName("msdfPixelRangeProperty")
    get() = getMsdfPixelRange()
    @JvmName("msdfPixelRangeProperty")
    set(`value`) {
      setMsdfPixelRange(value)
    }

  /**
   * Source font size used to generate MSDF textures. Higher values allow for more precision, but
   * are slower to render and require more memory. Only increase this value if you notice a visible
   * lack of precision in glyph rendering.
   */
  public final inline var msdfSize: Int
    @JvmName("msdfSizeProperty")
    get() = getMsdfSize()
    @JvmName("msdfSizeProperty")
    set(`value`) {
      setMsdfSize(value)
    }

  /**
   * Font oversampling factor, if set to `0.0` global oversampling factor is used instead.
   */
  public final inline var oversampling: Float
    @JvmName("oversamplingProperty")
    get() = getOversampling()
    @JvmName("oversamplingProperty")
    set(`value`) {
      setOversampling(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(656, scriptIndex)
  }

  /**
   * This is a helper function for [fontNames] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = systemfont.fontNames
   * //Your changes
   * systemfont.fontNames = myCoreType
   * ``````
   *
   * Array of font family names to search, first matching font found is used.
   */
  @CoreTypeHelper
  public final fun fontNamesMutate(block: PackedStringArray.() -> Unit): PackedStringArray =
      fontNames.apply {
     block(this)
     fontNames = this
  }

  /**
   * This is a helper function for [fontNames] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * Array of font family names to search, first matching font found is used.
   */
  @CoreTypeHelper
  public final fun fontNamesMutateEach(block: (index: Int, `value`: String) -> Unit):
      PackedStringArray = fontNames.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     fontNames = this
  }

  public final fun setAntialiasing(antialiasing: TextServer.FontAntialiasing): Unit {
    TransferContext.writeArguments(LONG to antialiasing.id)
    TransferContext.callMethod(ptr, MethodBindings.setAntialiasingPtr, NIL)
  }

  public final fun getAntialiasing(): TextServer.FontAntialiasing {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAntialiasingPtr, LONG)
    return TextServer.FontAntialiasing.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDisableEmbeddedBitmaps(disableEmbeddedBitmaps: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disableEmbeddedBitmaps)
    TransferContext.callMethod(ptr, MethodBindings.setDisableEmbeddedBitmapsPtr, NIL)
  }

  public final fun getDisableEmbeddedBitmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDisableEmbeddedBitmapsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setGenerateMipmaps(generateMipmaps: Boolean): Unit {
    TransferContext.writeArguments(BOOL to generateMipmaps)
    TransferContext.callMethod(ptr, MethodBindings.setGenerateMipmapsPtr, NIL)
  }

  public final fun getGenerateMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGenerateMipmapsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAllowSystemFallback(allowSystemFallback: Boolean): Unit {
    TransferContext.writeArguments(BOOL to allowSystemFallback)
    TransferContext.callMethod(ptr, MethodBindings.setAllowSystemFallbackPtr, NIL)
  }

  public final fun isAllowSystemFallback(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAllowSystemFallbackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setForceAutohinter(forceAutohinter: Boolean): Unit {
    TransferContext.writeArguments(BOOL to forceAutohinter)
    TransferContext.callMethod(ptr, MethodBindings.setForceAutohinterPtr, NIL)
  }

  public final fun isForceAutohinter(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isForceAutohinterPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHinting(hinting: TextServer.Hinting): Unit {
    TransferContext.writeArguments(LONG to hinting.id)
    TransferContext.callMethod(ptr, MethodBindings.setHintingPtr, NIL)
  }

  public final fun getHinting(): TextServer.Hinting {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHintingPtr, LONG)
    return TextServer.Hinting.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSubpixelPositioning(subpixelPositioning: TextServer.SubpixelPositioning):
      Unit {
    TransferContext.writeArguments(LONG to subpixelPositioning.id)
    TransferContext.callMethod(ptr, MethodBindings.setSubpixelPositioningPtr, NIL)
  }

  public final fun getSubpixelPositioning(): TextServer.SubpixelPositioning {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubpixelPositioningPtr, LONG)
    return TextServer.SubpixelPositioning.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setKeepRoundingRemainders(keepRoundingRemainders: Boolean): Unit {
    TransferContext.writeArguments(BOOL to keepRoundingRemainders)
    TransferContext.callMethod(ptr, MethodBindings.setKeepRoundingRemaindersPtr, NIL)
  }

  public final fun getKeepRoundingRemainders(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getKeepRoundingRemaindersPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMultichannelSignedDistanceField(msdf: Boolean): Unit {
    TransferContext.writeArguments(BOOL to msdf)
    TransferContext.callMethod(ptr, MethodBindings.setMultichannelSignedDistanceFieldPtr, NIL)
  }

  public final fun isMultichannelSignedDistanceField(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMultichannelSignedDistanceFieldPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMsdfPixelRange(msdfPixelRange: Int): Unit {
    TransferContext.writeArguments(LONG to msdfPixelRange.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMsdfPixelRangePtr, NIL)
  }

  public final fun getMsdfPixelRange(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMsdfPixelRangePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMsdfSize(msdfSize: Int): Unit {
    TransferContext.writeArguments(LONG to msdfSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMsdfSizePtr, NIL)
  }

  public final fun getMsdfSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMsdfSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setOversampling(oversampling: Float): Unit {
    TransferContext.writeArguments(DOUBLE to oversampling.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setOversamplingPtr, NIL)
  }

  public final fun getOversampling(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOversamplingPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getFontNames(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFontNamesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public final fun setFontNames(names: PackedStringArray): Unit {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to names)
    TransferContext.callMethod(ptr, MethodBindings.setFontNamesPtr, NIL)
  }

  public final fun getFontItalic(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFontItalicPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFontItalic(italic: Boolean): Unit {
    TransferContext.writeArguments(BOOL to italic)
    TransferContext.callMethod(ptr, MethodBindings.setFontItalicPtr, NIL)
  }

  public final fun setFontWeight(weight: Int): Unit {
    TransferContext.writeArguments(LONG to weight.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFontWeightPtr, NIL)
  }

  public final fun setFontStretch(stretch: Int): Unit {
    TransferContext.writeArguments(LONG to stretch.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFontStretchPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_antialiasing", 1669900)

    internal val getAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_antialiasing", 4262718649)

    internal val setDisableEmbeddedBitmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_disable_embedded_bitmaps", 2586408642)

    internal val getDisableEmbeddedBitmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_disable_embedded_bitmaps", 36873697)

    internal val setGenerateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_generate_mipmaps", 2586408642)

    internal val getGenerateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_generate_mipmaps", 36873697)

    internal val setAllowSystemFallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_allow_system_fallback", 2586408642)

    internal val isAllowSystemFallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "is_allow_system_fallback", 36873697)

    internal val setForceAutohinterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_force_autohinter", 2586408642)

    internal val isForceAutohinterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "is_force_autohinter", 36873697)

    internal val setHintingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_hinting", 1827459492)

    internal val getHintingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_hinting", 3683214614)

    internal val setSubpixelPositioningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_subpixel_positioning", 4225742182)

    internal val getSubpixelPositioningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_subpixel_positioning", 1069238588)

    internal val setKeepRoundingRemaindersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_keep_rounding_remainders", 2586408642)

    internal val getKeepRoundingRemaindersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_keep_rounding_remainders", 36873697)

    internal val setMultichannelSignedDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_multichannel_signed_distance_field", 2586408642)

    internal val isMultichannelSignedDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "is_multichannel_signed_distance_field", 36873697)

    internal val setMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_msdf_pixel_range", 1286410249)

    internal val getMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_msdf_pixel_range", 3905245786)

    internal val setMsdfSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_msdf_size", 1286410249)

    internal val getMsdfSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_msdf_size", 3905245786)

    internal val setOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_oversampling", 373806689)

    internal val getOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_oversampling", 1740695150)

    internal val getFontNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_font_names", 1139954409)

    internal val setFontNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_font_names", 4015028928)

    internal val getFontItalicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "get_font_italic", 36873697)

    internal val setFontItalicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_font_italic", 2586408642)

    internal val setFontWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_font_weight", 1286410249)

    internal val setFontStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SystemFont", "set_font_stretch", 1286410249)
  }
}
