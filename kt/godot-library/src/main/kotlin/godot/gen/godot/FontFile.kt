// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
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
 * Holds font source data and prerendered glyph cache, imported from a dynamic or a bitmap font.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/io/runtime_file_loading_and_saving.html]($DOCS_URL/tutorials/io/runtime_file_loading_and_saving.html)
 *
 * [godot.FontFile] contains a set of glyphs to represent Unicode characters imported from a font file, as well as a cache of rasterized glyphs, and a set of fallback [godot.Font]s to use.
 *
 * Use [godot.FontVariation] to access specific OpenType variation of the font, create simulated bold / slanted version, and draw lines of text.
 *
 * For more complex text processing, use [godot.FontVariation] in conjunction with [godot.TextLine] or [godot.TextParagraph].
 *
 * Supported font formats:
 *
 * - Dynamic font importer: TrueType (.ttf), TrueType collection (.ttc), OpenType (.otf), OpenType collection (.otc), WOFF (.woff), WOFF2 (.woff2), Type 1 (.pfb, .pfm).
 *
 * - Bitmap font importer: AngelCode BMFont (.fnt, .font), text and binary (version 3) format variants.
 *
 * - Monospace image font importer: All supported image formats.
 *
 * **Note:** A character is a symbol that represents an item (letter, digit etc.) in an abstract way.
 *
 * **Note:** A glyph is a bitmap or a shape used to draw one or more characters in a context-dependent manner. Glyph indices are bound to the specific font data source.
 *
 * **Note:** If none of the font data sources contain glyphs for a character used in a string, the character in question will be replaced with a box displaying its hexadecimal code.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var f = load("res://BarlowCondensed-Bold.ttf")
 *
 * $Label.add_theme_font_override("font", f)
 *
 * $Label.add_theme_font_size_override("font_size", 64)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var f = ResourceLoader.Load<FontFile>("res://BarlowCondensed-Bold.ttf");
 *
 * GetNode("Label").AddThemeFontOverride("font", f);
 *
 * GetNode("Label").AddThemeFontSizeOverride("font_size", 64);
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class FontFile : Font() {
  /**
   * Contents of the dynamic font source file.
   */
  public var `data`: PackedByteArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDataPtr, PACKED_BYTE_ARRAY)
      return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDataPtr, NIL)
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
   * Font family name.
   */
  public var fontName: String
    @JvmName("getFontName_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFontName()
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFontNamePtr, NIL)
    }

  /**
   * Font style name.
   */
  public var styleName: String
    @JvmName("getFontStyleName_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFontStyleName()
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFontStyleNamePtr, NIL)
    }

  /**
   * Font style flags, see [enum TextServer.FontStyle].
   */
  public var fontStyle: TextServer.FontStyle
    @JvmName("getFontStyle_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFontStyle()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setFontStylePtr, NIL)
    }

  /**
   * Weight (boldness) of the font. A value in the `100...999` range, normal font weight is `400`, bold font weight is `700`.
   */
  public var fontWeight: Int
    @JvmName("getFontWeight_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFontWeight()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFontWeightPtr, NIL)
    }

  /**
   * Font stretch amount, compared to a normal width. A percentage value between `50%` and `200%`.
   */
  public var fontStretch: Int
    @JvmName("getFontStretch_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFontStretch()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFontStretchPtr, NIL)
    }

  /**
   * Font glyph subpixel positioning mode. Subpixel positioning provides shaper text and better kerning for smaller font sizes, at the cost of higher memory usage and lower font rasterization speed. Use [godot.TextServer.SUBPIXEL_POSITIONING_AUTO] to automatically enable it based on the font size.
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
   * If set to `true`, glyphs of all sizes are rendered using single multichannel signed distance field (MSDF) generated from the dynamic font vector data. Since this approach does not rely on rasterizing the font every time its size changes, this allows for resizing the font in real-time without any performance penalty. Text will also not look grainy for [godot.Control]s that are scaled down (or for [godot.Label3D]s viewed from a long distance). As a downside, font hinting is not available with MSDF. The lack of font hinting may result in less crisp and less readable fonts at small sizes.
   *
   * **Note:** If using font outlines, [msdfPixelRange] must be set to at least *twice* the size of the largest font outline.
   *
   * **Note:** MSDF font rendering does not render glyphs with overlapping shapes correctly. Overlapping shapes are not valid per the OpenType standard, but are still commonly found in many font files, especially those converted by Google Fonts. To avoid issues with overlapping glyphs, consider downloading the font file directly from the type foundry instead of relying on Google Fonts.
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
   * The width of the range around the shape between the minimum and maximum representable signed distance. If using font outlines, [msdfPixelRange] must be set to at least *twice* the size of the largest font outline. The default [msdfPixelRange] value of `16` allows outline sizes up to `8` to look correct.
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
   * Source font size used to generate MSDF textures. Higher values allow for more precision, but are slower to render and require more memory. Only increase this value if you notice a visible lack of precision in glyph rendering.
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
   * If set to `true`, auto-hinting is supported and preferred over font built-in hinting. Used by dynamic fonts only (MSDF fonts don't support hinting).
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
   * Font hinting mode. Used by dynamic fonts only.
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
   * Font oversampling factor. If set to `0.0`, the global oversampling factor is used instead. Used by dynamic fonts only (MSDF fonts ignore oversampling).
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

  /**
   * Font size, used only for the bitmap fonts.
   */
  public var fixedSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFixedSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFixedSizePtr, NIL)
    }

  /**
   * Scaling mode, used only for the bitmap fonts with [fixedSize] greater than zero.
   */
  public var fixedSizeScaleMode: TextServer.FixedSizeScaleMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFixedSizeScaleModePtr, LONG)
      return TextServer.FixedSizeScaleMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFixedSizeScaleModePtr, NIL)
    }

  /**
   * Font OpenType feature set override.
   */
  public var opentypeFeatureOverrides: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOpentypeFeatureOverridesPtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOpentypeFeatureOverridesPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FONTFILE, scriptIndex)
    return true
  }

  /**
   * Loads an AngelCode BMFont (.fnt, .font) bitmap font from file [path].
   *
   * **Warning:** This method should only be used in the editor or in cases when you need to load external fonts at run-time, such as fonts located at the `user://` directory.
   */
  public fun loadBitmapFont(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadBitmapFontPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads a TrueType (.ttf), OpenType (.otf), WOFF (.woff), WOFF2 (.woff2) or Type 1 (.pfb, .pfm) dynamic font from file [path].
   *
   * **Warning:** This method should only be used in the editor or in cases when you need to load external fonts at run-time, such as fonts located at the `user://` directory.
   */
  public fun loadDynamicFont(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadDynamicFontPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns number of the font cache entries.
   */
  public fun getCacheCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes all font cache entries.
   */
  public fun clearCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearCachePtr, NIL)
  }

  /**
   * Removes specified font cache entry.
   */
  public fun removeCache(cacheIndex: Int): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeCachePtr, NIL)
  }

  /**
   * Returns list of the font sizes in the cache. Each size is [godot.Vector2i] with font size and outline size.
   */
  public fun getSizeCacheList(cacheIndex: Int): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSizeCacheListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  /**
   * Removes all font sizes from the cache entry
   */
  public fun clearSizeCache(cacheIndex: Int): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearSizeCachePtr, NIL)
  }

  /**
   * Removes specified font size from the cache entry.
   */
  public fun removeSizeCache(cacheIndex: Int, size: Vector2i): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.removeSizeCachePtr, NIL)
  }

  /**
   * Sets variation coordinates for the specified font cache entry. See [godot.Font.getSupportedVariationList] for more info.
   */
  public fun setVariationCoordinates(cacheIndex: Int, variationCoordinates: Dictionary<Any?, Any?>):
      Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), DICTIONARY to variationCoordinates)
    TransferContext.callMethod(rawPtr, MethodBindings.setVariationCoordinatesPtr, NIL)
  }

  /**
   * Returns variation coordinates for the specified font cache entry. See [godot.Font.getSupportedVariationList] for more info.
   */
  public fun getVariationCoordinates(cacheIndex: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVariationCoordinatesPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets embolden strength, if is not equal to zero, emboldens the font outlines. Negative values reduce the outline thickness.
   */
  public fun setEmbolden(cacheIndex: Int, strength: Float): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), DOUBLE to strength.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setEmboldenPtr, NIL)
  }

  /**
   * Returns embolden strength, if is not equal to zero, emboldens the font outlines. Negative values reduce the outline thickness.
   */
  public fun getEmbolden(cacheIndex: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getEmboldenPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets 2D transform, applied to the font outlines, can be used for slanting, flipping and rotating glyphs.
   */
  public fun setTransform(cacheIndex: Int, transform: Transform2D): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
  }

  /**
   * Returns 2D transform, applied to the font outlines, can be used for slanting, flipping and rotating glyphs.
   */
  public fun getTransform(cacheIndex: Int): Transform2D {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Sets the spacing for [spacing] (see [enum TextServer.SpacingType]) to [value] in pixels (not relative to the font size).
   */
  public fun setExtraSpacing(
    cacheIndex: Int,
    spacing: TextServer.SpacingType,
    `value`: Long,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to spacing.id, LONG to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setExtraSpacingPtr, NIL)
  }

  /**
   * Returns spacing for [spacing] (see [enum TextServer.SpacingType]) in pixels (not relative to the font size).
   */
  public fun getExtraSpacing(cacheIndex: Int, spacing: TextServer.SpacingType): Long {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to spacing.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getExtraSpacingPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets an active face index in the TrueType / OpenType collection.
   */
  public fun setFaceIndex(cacheIndex: Int, faceIndex: Long): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to faceIndex)
    TransferContext.callMethod(rawPtr, MethodBindings.setFaceIndexPtr, NIL)
  }

  /**
   * Returns an active face index in the TrueType / OpenType collection.
   */
  public fun getFaceIndex(cacheIndex: Int): Long {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the font ascent (number of pixels above the baseline).
   */
  public fun setCacheAscent(
    cacheIndex: Int,
    size: Int,
    ascent: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), DOUBLE to ascent.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCacheAscentPtr, NIL)
  }

  /**
   * Returns the font ascent (number of pixels above the baseline).
   */
  public fun getCacheAscent(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheAscentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the font descent (number of pixels below the baseline).
   */
  public fun setCacheDescent(
    cacheIndex: Int,
    size: Int,
    descent: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), DOUBLE to descent.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCacheDescentPtr, NIL)
  }

  /**
   * Returns the font descent (number of pixels below the baseline).
   */
  public fun getCacheDescent(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheDescentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets pixel offset of the underline below the baseline.
   */
  public fun setCacheUnderlinePosition(
    cacheIndex: Int,
    size: Int,
    underlinePosition: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), DOUBLE to underlinePosition.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCacheUnderlinePositionPtr, NIL)
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public fun getCacheUnderlinePosition(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheUnderlinePositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets thickness of the underline in pixels.
   */
  public fun setCacheUnderlineThickness(
    cacheIndex: Int,
    size: Int,
    underlineThickness: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), DOUBLE to underlineThickness.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCacheUnderlineThicknessPtr, NIL)
  }

  /**
   * Returns thickness of the underline in pixels.
   */
  public fun getCacheUnderlineThickness(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheUnderlineThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets scaling factor of the color bitmap font.
   */
  public fun setCacheScale(
    cacheIndex: Int,
    size: Int,
    scale: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCacheScalePtr, NIL)
  }

  /**
   * Returns scaling factor of the color bitmap font.
   */
  public fun getCacheScale(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns number of textures used by font cache entry.
   */
  public fun getTextureCount(cacheIndex: Int, size: Vector2i): Int {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes all textures from font cache entry.
   *
   * **Note:** This function will not remove glyphs associated with the texture, use [removeGlyph] to remove them manually.
   */
  public fun clearTextures(cacheIndex: Int, size: Vector2i): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.clearTexturesPtr, NIL)
  }

  /**
   * Removes specified texture from the cache entry.
   *
   * **Note:** This function will not remove glyphs associated with the texture. Remove them manually using [removeGlyph].
   */
  public fun removeTexture(
    cacheIndex: Int,
    size: Vector2i,
    textureIndex: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to textureIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeTexturePtr, NIL)
  }

  /**
   * Sets font cache texture image.
   */
  public fun setTextureImage(
    cacheIndex: Int,
    size: Vector2i,
    textureIndex: Int,
    image: Image,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to textureIndex.toLong(), OBJECT to image)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureImagePtr, NIL)
  }

  /**
   * Returns a copy of the font cache texture image.
   */
  public fun getTextureImage(
    cacheIndex: Int,
    size: Vector2i,
    textureIndex: Int,
  ): Image? {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to textureIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureImagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Sets array containing glyph packing data.
   */
  public fun setTextureOffsets(
    cacheIndex: Int,
    size: Vector2i,
    textureIndex: Int,
    offset: PackedInt32Array,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to textureIndex.toLong(), PACKED_INT_32_ARRAY to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureOffsetsPtr, NIL)
  }

  /**
   * Returns a copy of the array containing glyph packing data.
   */
  public fun getTextureOffsets(
    cacheIndex: Int,
    size: Vector2i,
    textureIndex: Int,
  ): PackedInt32Array {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to textureIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureOffsetsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns list of rendered glyphs in the cache entry.
   */
  public fun getGlyphList(cacheIndex: Int, size: Vector2i): PackedInt32Array {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphListPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Removes all rendered glyphs information from the cache entry.
   *
   * **Note:** This function will not remove textures associated with the glyphs, use [removeTexture] to remove them manually.
   */
  public fun clearGlyphs(cacheIndex: Int, size: Vector2i): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.clearGlyphsPtr, NIL)
  }

  /**
   * Removes specified rendered glyph information from the cache entry.
   *
   * **Note:** This function will not remove textures associated with the glyphs, use [removeTexture] to remove them manually.
   */
  public fun removeGlyph(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeGlyphPtr, NIL)
  }

  /**
   * Sets glyph advance (offset of the next glyph).
   *
   * **Note:** Advance for glyphs outlines is the same as the base glyph advance and is not saved.
   */
  public fun setGlyphAdvance(
    cacheIndex: Int,
    size: Int,
    glyph: Int,
    advance: Vector2,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), LONG to glyph.toLong(), VECTOR2 to advance)
    TransferContext.callMethod(rawPtr, MethodBindings.setGlyphAdvancePtr, NIL)
  }

  /**
   * Returns glyph advance (offset of the next glyph).
   *
   * **Note:** Advance for glyphs outlines is the same as the base glyph advance and is not saved.
   */
  public fun getGlyphAdvance(
    cacheIndex: Int,
    size: Int,
    glyph: Int,
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphAdvancePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets glyph offset from the baseline.
   */
  public fun setGlyphOffset(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
    offset: Vector2,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong(), VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setGlyphOffsetPtr, NIL)
  }

  /**
   * Returns glyph offset from the baseline.
   */
  public fun getGlyphOffset(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets glyph size.
   */
  public fun setGlyphSize(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
    glSize: Vector2,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong(), VECTOR2 to glSize)
    TransferContext.callMethod(rawPtr, MethodBindings.setGlyphSizePtr, NIL)
  }

  /**
   * Returns glyph size.
   */
  public fun getGlyphSize(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets rectangle in the cache texture containing the glyph.
   */
  public fun setGlyphUvRect(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
    uvRect: Rect2,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong(), RECT2 to uvRect)
    TransferContext.callMethod(rawPtr, MethodBindings.setGlyphUvRectPtr, NIL)
  }

  /**
   * Returns rectangle in the cache texture containing the glyph.
   */
  public fun getGlyphUvRect(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ): Rect2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphUvRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Sets index of the cache texture containing the glyph.
   */
  public fun setGlyphTextureIdx(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
    textureIdx: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong(), LONG to textureIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setGlyphTextureIdxPtr, NIL)
  }

  /**
   * Returns index of the cache texture containing the glyph.
   */
  public fun getGlyphTextureIdx(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ): Int {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphTextureIdxPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns list of the kerning overrides.
   */
  public fun getKerningList(cacheIndex: Int, size: Int): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getKerningListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  /**
   * Removes all kerning overrides.
   */
  public fun clearKerningMap(cacheIndex: Int, size: Int): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearKerningMapPtr, NIL)
  }

  /**
   * Removes kerning override for the pair of glyphs.
   */
  public fun removeKerning(
    cacheIndex: Int,
    size: Int,
    glyphPair: Vector2i,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), VECTOR2I to glyphPair)
    TransferContext.callMethod(rawPtr, MethodBindings.removeKerningPtr, NIL)
  }

  /**
   * Sets kerning for the pair of glyphs.
   */
  public fun setKerning(
    cacheIndex: Int,
    size: Int,
    glyphPair: Vector2i,
    kerning: Vector2,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), VECTOR2I to glyphPair, VECTOR2 to kerning)
    TransferContext.callMethod(rawPtr, MethodBindings.setKerningPtr, NIL)
  }

  /**
   * Returns kerning for the pair of glyphs.
   */
  public fun getKerning(
    cacheIndex: Int,
    size: Int,
    glyphPair: Vector2i,
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), VECTOR2I to glyphPair)
    TransferContext.callMethod(rawPtr, MethodBindings.getKerningPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Renders the range of characters to the font cache texture.
   */
  public fun renderRange(
    cacheIndex: Int,
    size: Vector2i,
    start: Long,
    end: Long,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to start, LONG to end)
    TransferContext.callMethod(rawPtr, MethodBindings.renderRangePtr, NIL)
  }

  /**
   * Renders specified glyph to the font cache texture.
   */
  public fun renderGlyph(
    cacheIndex: Int,
    size: Vector2i,
    index: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.renderGlyphPtr, NIL)
  }

  /**
   * Adds override for [godot.Font.isLanguageSupported].
   */
  public fun setLanguageSupportOverride(language: String, supported: Boolean): Unit {
    TransferContext.writeArguments(STRING to language, BOOL to supported)
    TransferContext.callMethod(rawPtr, MethodBindings.setLanguageSupportOverridePtr, NIL)
  }

  /**
   * Returns `true` if support override is enabled for the [language].
   */
  public fun getLanguageSupportOverride(language: String): Boolean {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.getLanguageSupportOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Remove language support override.
   */
  public fun removeLanguageSupportOverride(language: String): Unit {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.removeLanguageSupportOverridePtr, NIL)
  }

  /**
   * Returns list of language support overrides.
   */
  public fun getLanguageSupportOverrides(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLanguageSupportOverridesPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Adds override for [godot.Font.isScriptSupported].
   */
  public fun setScriptSupportOverride(script: String, supported: Boolean): Unit {
    TransferContext.writeArguments(STRING to script, BOOL to supported)
    TransferContext.callMethod(rawPtr, MethodBindings.setScriptSupportOverridePtr, NIL)
  }

  /**
   * Returns `true` if support override is enabled for the [script].
   */
  public fun getScriptSupportOverride(script: String): Boolean {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptSupportOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes script support override.
   */
  public fun removeScriptSupportOverride(script: String): Unit {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr, MethodBindings.removeScriptSupportOverridePtr, NIL)
  }

  /**
   * Returns list of script support overrides.
   */
  public fun getScriptSupportOverrides(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptSupportOverridesPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the glyph index of a [char], optionally modified by the [variationSelector].
   */
  public fun getGlyphIndex(
    size: Int,
    char: Long,
    variationSelector: Long,
  ): Int {
    TransferContext.writeArguments(LONG to size.toLong(), LONG to char, LONG to variationSelector)
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns character code associated with [glyphIndex], or `0` if [glyphIndex] is invalid. See [getGlyphIndex].
   */
  public fun getCharFromGlyphIndex(size: Int, glyphIndex: Int): Long {
    TransferContext.writeArguments(LONG to size.toLong(), LONG to glyphIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCharFromGlyphIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val loadBitmapFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "load_bitmap_font")

    public val loadDynamicFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "load_dynamic_font")

    public val setDataPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_data")

    public val getDataPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_data")

    public val setFontNamePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_font_name")

    public val setFontStyleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_font_style_name")

    public val setFontStylePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_font_style")

    public val setFontWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_font_weight")

    public val setFontStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_font_stretch")

    public val setAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_antialiasing")

    public val getAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_antialiasing")

    public val setGenerateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_generate_mipmaps")

    public val getGenerateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_generate_mipmaps")

    public val setMultichannelSignedDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_multichannel_signed_distance_field")

    public val isMultichannelSignedDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "is_multichannel_signed_distance_field")

    public val setMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_msdf_pixel_range")

    public val getMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_msdf_pixel_range")

    public val setMsdfSizePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_msdf_size")

    public val getMsdfSizePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_msdf_size")

    public val setFixedSizePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_fixed_size")

    public val getFixedSizePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_fixed_size")

    public val setFixedSizeScaleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_fixed_size_scale_mode")

    public val getFixedSizeScaleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_fixed_size_scale_mode")

    public val setAllowSystemFallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_allow_system_fallback")

    public val isAllowSystemFallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "is_allow_system_fallback")

    public val setForceAutohinterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_force_autohinter")

    public val isForceAutohinterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "is_force_autohinter")

    public val setHintingPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_hinting")

    public val getHintingPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_hinting")

    public val setSubpixelPositioningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_subpixel_positioning")

    public val getSubpixelPositioningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_subpixel_positioning")

    public val setOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_oversampling")

    public val getOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_oversampling")

    public val getCacheCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_count")

    public val clearCachePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "clear_cache")

    public val removeCachePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "remove_cache")

    public val getSizeCacheListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_size_cache_list")

    public val clearSizeCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "clear_size_cache")

    public val removeSizeCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_size_cache")

    public val setVariationCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_variation_coordinates")

    public val getVariationCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_variation_coordinates")

    public val setEmboldenPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_embolden")

    public val getEmboldenPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_embolden")

    public val setTransformPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_transform")

    public val getTransformPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_transform")

    public val setExtraSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_extra_spacing")

    public val getExtraSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_extra_spacing")

    public val setFaceIndexPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_face_index")

    public val getFaceIndexPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_face_index")

    public val setCacheAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_ascent")

    public val getCacheAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_ascent")

    public val setCacheDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_descent")

    public val getCacheDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_descent")

    public val setCacheUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_underline_position")

    public val getCacheUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_underline_position")

    public val setCacheUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_underline_thickness")

    public val getCacheUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_underline_thickness")

    public val setCacheScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_scale")

    public val getCacheScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_scale")

    public val getTextureCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_texture_count")

    public val clearTexturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "clear_textures")

    public val removeTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_texture")

    public val setTextureImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_texture_image")

    public val getTextureImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_texture_image")

    public val setTextureOffsetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_texture_offsets")

    public val getTextureOffsetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_texture_offsets")

    public val getGlyphListPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_glyph_list")

    public val clearGlyphsPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "clear_glyphs")

    public val removeGlyphPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "remove_glyph")

    public val setGlyphAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_glyph_advance")

    public val getGlyphAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_advance")

    public val setGlyphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_glyph_offset")

    public val getGlyphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_offset")

    public val setGlyphSizePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_glyph_size")

    public val getGlyphSizePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_glyph_size")

    public val setGlyphUvRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_glyph_uv_rect")

    public val getGlyphUvRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_uv_rect")

    public val setGlyphTextureIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_glyph_texture_idx")

    public val getGlyphTextureIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_texture_idx")

    public val getKerningListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_kerning_list")

    public val clearKerningMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "clear_kerning_map")

    public val removeKerningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_kerning")

    public val setKerningPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_kerning")

    public val getKerningPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_kerning")

    public val renderRangePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "render_range")

    public val renderGlyphPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "render_glyph")

    public val setLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_language_support_override")

    public val getLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_language_support_override")

    public val removeLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_language_support_override")

    public val getLanguageSupportOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_language_support_overrides")

    public val setScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_script_support_override")

    public val getScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_script_support_override")

    public val removeScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_script_support_override")

    public val getScriptSupportOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_script_support_overrides")

    public val setOpentypeFeatureOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_opentype_feature_overrides")

    public val getOpentypeFeatureOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_opentype_feature_overrides")

    public val getGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_index")

    public val getCharFromGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_char_from_glyph_index")
  }
}
