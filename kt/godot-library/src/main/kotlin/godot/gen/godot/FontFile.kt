// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
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
 * [FontFile] contains a set of glyphs to represent Unicode characters imported from a font file, as
 * well as a cache of rasterized glyphs, and a set of fallback [Font]s to use.
 * Use [FontVariation] to access specific OpenType variation of the font, create simulated bold /
 * slanted version, and draw lines of text.
 * For more complex text processing, use [FontVariation] in conjunction with [TextLine] or
 * [TextParagraph].
 * Supported font formats:
 * - Dynamic font importer: TrueType (.ttf), TrueType collection (.ttc), OpenType (.otf), OpenType
 * collection (.otc), WOFF (.woff), WOFF2 (.woff2), Type 1 (.pfb, .pfm).
 * - Bitmap font importer: AngelCode BMFont (.fnt, .font), text and binary (version 3) format
 * variants.
 * - Monospace image font importer: All supported image formats.
 * **Note:** A character is a symbol that represents an item (letter, digit etc.) in an abstract
 * way.
 * **Note:** A glyph is a bitmap or a shape used to draw one or more characters in a
 * context-dependent manner. Glyph indices are bound to the specific font data source.
 * **Note:** If none of the font data sources contain glyphs for a character used in a string, the
 * character in question will be replaced with a box displaying its hexadecimal code.
 *
 * gdscript:
 * ```gdscript
 * var f = load("res://BarlowCondensed-Bold.ttf")
 * $Label.add_theme_font_override("font", f)
 * $Label.add_theme_font_size_override("font_size", 64)
 * ```
 * csharp:
 * ```csharp
 * var f = ResourceLoader.Load<FontFile>("res://BarlowCondensed-Bold.ttf");
 * GetNode("Label").AddThemeFontOverride("font", f);
 * GetNode("Label").AddThemeFontSizeOverride("font_size", 64);
 * ```
 */
@GodotBaseType
public open class FontFile : Font() {
  /**
   * Contents of the dynamic font source file.
   */
  public final inline var `data`: PackedByteArray
    @JvmName("dataProperty")
    get() = getData()
    @JvmName("dataProperty")
    set(`value`) {
      setData(value)
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
   * Font family name.
   */
  public final inline var fontName: String
    @JvmName("fontNameProperty")
    get() = getFontName()
    @JvmName("fontNameProperty")
    set(`value`) {
      setFontName(value)
    }

  /**
   * Font style name.
   */
  public final inline var styleName: String
    @JvmName("styleNameProperty")
    get() = getFontStyleName()
    @JvmName("styleNameProperty")
    set(`value`) {
      setFontStyleName(value)
    }

  /**
   * Font style flags, see [TextServer.FontStyle].
   */
  public final inline var fontStyle: TextServer.FontStyle
    @JvmName("fontStyleProperty")
    get() = getFontStyle()
    @JvmName("fontStyleProperty")
    set(`value`) {
      setFontStyle(value)
    }

  /**
   * Weight (boldness) of the font. A value in the `100...999` range, normal font weight is `400`,
   * bold font weight is `700`.
   */
  public final inline var fontWeight: Int
    @JvmName("fontWeightProperty")
    get() = getFontWeight()
    @JvmName("fontWeightProperty")
    set(`value`) {
      setFontWeight(value)
    }

  /**
   * Font stretch amount, compared to a normal width. A percentage value between `50&#37;` and
   * `200&#37;`.
   */
  public final inline var fontStretch: Int
    @JvmName("fontStretchProperty")
    get() = getFontStretch()
    @JvmName("fontStretchProperty")
    set(`value`) {
      setFontStretch(value)
    }

  /**
   * Font glyph subpixel positioning mode. Subpixel positioning provides shaper text and better
   * kerning for smaller font sizes, at the cost of higher memory usage and lower font rasterization
   * speed. Use [TextServer.SUBPIXEL_POSITIONING_AUTO] to automatically enable it based on the font
   * size.
   */
  public final inline var subpixelPositioning: TextServer.SubpixelPositioning
    @JvmName("subpixelPositioningProperty")
    get() = getSubpixelPositioning()
    @JvmName("subpixelPositioningProperty")
    set(`value`) {
      setSubpixelPositioning(value)
    }

  /**
   * If set to `true`, glyphs of all sizes are rendered using single multichannel signed distance
   * field (MSDF) generated from the dynamic font vector data. Since this approach does not rely on
   * rasterizing the font every time its size changes, this allows for resizing the font in real-time
   * without any performance penalty. Text will also not look grainy for [Control]s that are scaled
   * down (or for [Label3D]s viewed from a long distance). As a downside, font hinting is not available
   * with MSDF. The lack of font hinting may result in less crisp and less readable fonts at small
   * sizes.
   * **Note:** If using font outlines, [msdfPixelRange] must be set to at least *twice* the size of
   * the largest font outline.
   * **Note:** MSDF font rendering does not render glyphs with overlapping shapes correctly.
   * Overlapping shapes are not valid per the OpenType standard, but are still commonly found in many
   * font files, especially those converted by Google Fonts. To avoid issues with overlapping glyphs,
   * consider downloading the font file directly from the type foundry instead of relying on Google
   * Fonts.
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
   * If set to `true`, auto-hinting is supported and preferred over font built-in hinting. Used by
   * dynamic fonts only (MSDF fonts don't support hinting).
   */
  public final inline var forceAutohinter: Boolean
    @JvmName("forceAutohinterProperty")
    get() = isForceAutohinter()
    @JvmName("forceAutohinterProperty")
    set(`value`) {
      setForceAutohinter(value)
    }

  /**
   * Font hinting mode. Used by dynamic fonts only.
   */
  public final inline var hinting: TextServer.Hinting
    @JvmName("hintingProperty")
    get() = getHinting()
    @JvmName("hintingProperty")
    set(`value`) {
      setHinting(value)
    }

  /**
   * Font oversampling factor. If set to `0.0`, the global oversampling factor is used instead. Used
   * by dynamic fonts only (MSDF fonts ignore oversampling).
   */
  public final inline var oversampling: Float
    @JvmName("oversamplingProperty")
    get() = getOversampling()
    @JvmName("oversamplingProperty")
    set(`value`) {
      setOversampling(value)
    }

  /**
   * Font size, used only for the bitmap fonts.
   */
  public final inline var fixedSize: Int
    @JvmName("fixedSizeProperty")
    get() = getFixedSize()
    @JvmName("fixedSizeProperty")
    set(`value`) {
      setFixedSize(value)
    }

  /**
   * Scaling mode, used only for the bitmap fonts with [fixedSize] greater than zero.
   */
  public final inline var fixedSizeScaleMode: TextServer.FixedSizeScaleMode
    @JvmName("fixedSizeScaleModeProperty")
    get() = getFixedSizeScaleMode()
    @JvmName("fixedSizeScaleModeProperty")
    set(`value`) {
      setFixedSizeScaleMode(value)
    }

  /**
   * Font OpenType feature set override.
   */
  public final inline var opentypeFeatureOverrides: Dictionary<Any?, Any?>
    @JvmName("opentypeFeatureOverridesProperty")
    get() = getOpentypeFeatureOverrides()
    @JvmName("opentypeFeatureOverridesProperty")
    set(`value`) {
      setOpentypeFeatureOverrides(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_FONTFILE, scriptIndex)
  }

  /**
   * Loads an AngelCode BMFont (.fnt, .font) bitmap font from file [path].
   * **Warning:** This method should only be used in the editor or in cases when you need to load
   * external fonts at run-time, such as fonts located at the `user://` directory.
   */
  public final fun loadBitmapFont(path: String): Error {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadBitmapFontPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads a TrueType (.ttf), OpenType (.otf), WOFF (.woff), WOFF2 (.woff2) or Type 1 (.pfb, .pfm)
   * dynamic font from file [path].
   * **Warning:** This method should only be used in the editor or in cases when you need to load
   * external fonts at run-time, such as fonts located at the `user://` directory.
   */
  public final fun loadDynamicFont(path: String): Error {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadDynamicFontPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setData(`data`: PackedByteArray): Unit {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.setDataPtr, NIL)
  }

  public final fun getData(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDataPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  public final fun setFontName(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setFontNamePtr, NIL)
  }

  public final fun setFontStyleName(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setFontStyleNamePtr, NIL)
  }

  public final fun setFontStyle(style: TextServer.FontStyle): Unit {
    TransferContext.writeArguments(LONG to style.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.setFontStylePtr, NIL)
  }

  public final fun setFontWeight(weight: Int): Unit {
    TransferContext.writeArguments(LONG to weight.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setFontWeightPtr, NIL)
  }

  public final fun setFontStretch(stretch: Int): Unit {
    TransferContext.writeArguments(LONG to stretch.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setFontStretchPtr, NIL)
  }

  public final fun setAntialiasing(antialiasing: TextServer.FontAntialiasing): Unit {
    TransferContext.writeArguments(LONG to antialiasing.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setAntialiasingPtr, NIL)
  }

  public final fun getAntialiasing(): TextServer.FontAntialiasing {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAntialiasingPtr, LONG)
    return TextServer.FontAntialiasing.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDisableEmbeddedBitmaps(disableEmbeddedBitmaps: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disableEmbeddedBitmaps)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisableEmbeddedBitmapsPtr, NIL)
  }

  public final fun getDisableEmbeddedBitmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDisableEmbeddedBitmapsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setGenerateMipmaps(generateMipmaps: Boolean): Unit {
    TransferContext.writeArguments(BOOL to generateMipmaps)
    TransferContext.callMethod(rawPtr, MethodBindings.setGenerateMipmapsPtr, NIL)
  }

  public final fun getGenerateMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGenerateMipmapsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMultichannelSignedDistanceField(msdf: Boolean): Unit {
    TransferContext.writeArguments(BOOL to msdf)
    TransferContext.callMethod(rawPtr, MethodBindings.setMultichannelSignedDistanceFieldPtr, NIL)
  }

  public final fun isMultichannelSignedDistanceField(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isMultichannelSignedDistanceFieldPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMsdfPixelRange(msdfPixelRange: Int): Unit {
    TransferContext.writeArguments(LONG to msdfPixelRange.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setMsdfPixelRangePtr, NIL)
  }

  public final fun getMsdfPixelRange(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMsdfPixelRangePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMsdfSize(msdfSize: Int): Unit {
    TransferContext.writeArguments(LONG to msdfSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setMsdfSizePtr, NIL)
  }

  public final fun getMsdfSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMsdfSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFixedSize(fixedSize: Int): Unit {
    TransferContext.writeArguments(LONG to fixedSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setFixedSizePtr, NIL)
  }

  public final fun getFixedSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFixedSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFixedSizeScaleMode(fixedSizeScaleMode: TextServer.FixedSizeScaleMode): Unit {
    TransferContext.writeArguments(LONG to fixedSizeScaleMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setFixedSizeScaleModePtr, NIL)
  }

  public final fun getFixedSizeScaleMode(): TextServer.FixedSizeScaleMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFixedSizeScaleModePtr, LONG)
    return TextServer.FixedSizeScaleMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAllowSystemFallback(allowSystemFallback: Boolean): Unit {
    TransferContext.writeArguments(BOOL to allowSystemFallback)
    TransferContext.callMethod(rawPtr, MethodBindings.setAllowSystemFallbackPtr, NIL)
  }

  public final fun isAllowSystemFallback(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAllowSystemFallbackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setForceAutohinter(forceAutohinter: Boolean): Unit {
    TransferContext.writeArguments(BOOL to forceAutohinter)
    TransferContext.callMethod(rawPtr, MethodBindings.setForceAutohinterPtr, NIL)
  }

  public final fun isForceAutohinter(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isForceAutohinterPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHinting(hinting: TextServer.Hinting): Unit {
    TransferContext.writeArguments(LONG to hinting.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setHintingPtr, NIL)
  }

  public final fun getHinting(): TextServer.Hinting {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHintingPtr, LONG)
    return TextServer.Hinting.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSubpixelPositioning(subpixelPositioning: TextServer.SubpixelPositioning):
      Unit {
    TransferContext.writeArguments(LONG to subpixelPositioning.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setSubpixelPositioningPtr, NIL)
  }

  public final fun getSubpixelPositioning(): TextServer.SubpixelPositioning {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSubpixelPositioningPtr, LONG)
    return TextServer.SubpixelPositioning.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setOversampling(oversampling: Float): Unit {
    TransferContext.writeArguments(DOUBLE to oversampling.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setOversamplingPtr, NIL)
  }

  public final fun getOversampling(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOversamplingPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns number of the font cache entries.
   */
  public final fun getCacheCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes all font cache entries.
   */
  public final fun clearCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearCachePtr, NIL)
  }

  /**
   * Removes specified font cache entry.
   */
  public final fun removeCache(cacheIndex: Int): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeCachePtr, NIL)
  }

  /**
   * Returns list of the font sizes in the cache. Each size is [Vector2i] with font size and outline
   * size.
   */
  public final fun getSizeCacheList(cacheIndex: Int): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSizeCacheListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Removes all font sizes from the cache entry
   */
  public final fun clearSizeCache(cacheIndex: Int): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearSizeCachePtr, NIL)
  }

  /**
   * Removes specified font size from the cache entry.
   */
  public final fun removeSizeCache(cacheIndex: Int, size: Vector2i): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.removeSizeCachePtr, NIL)
  }

  /**
   * Sets variation coordinates for the specified font cache entry. See
   * [Font.getSupportedVariationList] for more info.
   */
  public final fun setVariationCoordinates(cacheIndex: Int,
      variationCoordinates: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), DICTIONARY to variationCoordinates)
    TransferContext.callMethod(rawPtr, MethodBindings.setVariationCoordinatesPtr, NIL)
  }

  /**
   * Returns variation coordinates for the specified font cache entry. See
   * [Font.getSupportedVariationList] for more info.
   */
  public final fun getVariationCoordinates(cacheIndex: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVariationCoordinatesPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets embolden strength, if is not equal to zero, emboldens the font outlines. Negative values
   * reduce the outline thickness.
   */
  public final fun setEmbolden(cacheIndex: Int, strength: Float): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), DOUBLE to strength.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setEmboldenPtr, NIL)
  }

  /**
   * Returns embolden strength, if is not equal to zero, emboldens the font outlines. Negative
   * values reduce the outline thickness.
   */
  public final fun getEmbolden(cacheIndex: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getEmboldenPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets 2D transform, applied to the font outlines, can be used for slanting, flipping, and
   * rotating glyphs.
   */
  public final fun setTransform(cacheIndex: Int, transform: Transform2D): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
  }

  /**
   * Returns 2D transform, applied to the font outlines, can be used for slanting, flipping and
   * rotating glyphs.
   */
  public final fun getTransform(cacheIndex: Int): Transform2D {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Sets the spacing for [spacing] (see [TextServer.SpacingType]) to [value] in pixels (not
   * relative to the font size).
   */
  public final fun setExtraSpacing(
    cacheIndex: Int,
    spacing: TextServer.SpacingType,
    `value`: Long,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to spacing.id, LONG to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setExtraSpacingPtr, NIL)
  }

  /**
   * Returns spacing for [spacing] (see [TextServer.SpacingType]) in pixels (not relative to the
   * font size).
   */
  public final fun getExtraSpacing(cacheIndex: Int, spacing: TextServer.SpacingType): Long {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to spacing.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getExtraSpacingPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets extra baseline offset (as a fraction of font height).
   */
  public final fun setExtraBaselineOffset(cacheIndex: Int, baselineOffset: Float): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), DOUBLE to baselineOffset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setExtraBaselineOffsetPtr, NIL)
  }

  /**
   * Returns extra baseline offset (as a fraction of font height).
   */
  public final fun getExtraBaselineOffset(cacheIndex: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getExtraBaselineOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets an active face index in the TrueType / OpenType collection.
   */
  public final fun setFaceIndex(cacheIndex: Int, faceIndex: Long): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to faceIndex)
    TransferContext.callMethod(rawPtr, MethodBindings.setFaceIndexPtr, NIL)
  }

  /**
   * Returns an active face index in the TrueType / OpenType collection.
   */
  public final fun getFaceIndex(cacheIndex: Int): Long {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the font ascent (number of pixels above the baseline).
   */
  public final fun setCacheAscent(
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
  public final fun getCacheAscent(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheAscentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the font descent (number of pixels below the baseline).
   */
  public final fun setCacheDescent(
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
  public final fun getCacheDescent(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheDescentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets pixel offset of the underline below the baseline.
   */
  public final fun setCacheUnderlinePosition(
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
  public final fun getCacheUnderlinePosition(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheUnderlinePositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets thickness of the underline in pixels.
   */
  public final fun setCacheUnderlineThickness(
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
  public final fun getCacheUnderlineThickness(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheUnderlineThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets scaling factor of the color bitmap font.
   */
  public final fun setCacheScale(
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
  public final fun getCacheScale(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns number of textures used by font cache entry.
   */
  public final fun getTextureCount(cacheIndex: Int, size: Vector2i): Int {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes all textures from font cache entry.
   * **Note:** This function will not remove glyphs associated with the texture, use [removeGlyph]
   * to remove them manually.
   */
  public final fun clearTextures(cacheIndex: Int, size: Vector2i): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.clearTexturesPtr, NIL)
  }

  /**
   * Removes specified texture from the cache entry.
   * **Note:** This function will not remove glyphs associated with the texture. Remove them
   * manually using [removeGlyph].
   */
  public final fun removeTexture(
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
  public final fun setTextureImage(
    cacheIndex: Int,
    size: Vector2i,
    textureIndex: Int,
    image: Image?,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to textureIndex.toLong(), OBJECT to image)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureImagePtr, NIL)
  }

  /**
   * Returns a copy of the font cache texture image.
   */
  public final fun getTextureImage(
    cacheIndex: Int,
    size: Vector2i,
    textureIndex: Int,
  ): Image? {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to textureIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureImagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Image?)
  }

  /**
   * Sets array containing glyph packing data.
   */
  public final fun setTextureOffsets(
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
  public final fun getTextureOffsets(
    cacheIndex: Int,
    size: Vector2i,
    textureIndex: Int,
  ): PackedInt32Array {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to textureIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureOffsetsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Returns list of rendered glyphs in the cache entry.
   */
  public final fun getGlyphList(cacheIndex: Int, size: Vector2i): PackedInt32Array {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphListPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Removes all rendered glyph information from the cache entry.
   * **Note:** This function will not remove textures associated with the glyphs, use
   * [removeTexture] to remove them manually.
   */
  public final fun clearGlyphs(cacheIndex: Int, size: Vector2i): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.clearGlyphsPtr, NIL)
  }

  /**
   * Removes specified rendered glyph information from the cache entry.
   * **Note:** This function will not remove textures associated with the glyphs, use
   * [removeTexture] to remove them manually.
   */
  public final fun removeGlyph(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeGlyphPtr, NIL)
  }

  /**
   * Sets glyph advance (offset of the next glyph).
   * **Note:** Advance for glyphs outlines is the same as the base glyph advance and is not saved.
   */
  public final fun setGlyphAdvance(
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
   * **Note:** Advance for glyphs outlines is the same as the base glyph advance and is not saved.
   */
  public final fun getGlyphAdvance(
    cacheIndex: Int,
    size: Int,
    glyph: Int,
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphAdvancePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets glyph offset from the baseline.
   */
  public final fun setGlyphOffset(
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
  public final fun getGlyphOffset(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets glyph size.
   */
  public final fun setGlyphSize(
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
  public final fun getGlyphSize(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets rectangle in the cache texture containing the glyph.
   */
  public final fun setGlyphUvRect(
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
  public final fun getGlyphUvRect(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ): Rect2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphUvRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Sets index of the cache texture containing the glyph.
   */
  public final fun setGlyphTextureIdx(
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
  public final fun getGlyphTextureIdx(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ): Int {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphTextureIdxPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns list of the kerning overrides.
   */
  public final fun getKerningList(cacheIndex: Int, size: Int): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getKerningListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Removes all kerning overrides.
   */
  public final fun clearKerningMap(cacheIndex: Int, size: Int): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearKerningMapPtr, NIL)
  }

  /**
   * Removes kerning override for the pair of glyphs.
   */
  public final fun removeKerning(
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
  public final fun setKerning(
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
  public final fun getKerning(
    cacheIndex: Int,
    size: Int,
    glyphPair: Vector2i,
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), VECTOR2I to glyphPair)
    TransferContext.callMethod(rawPtr, MethodBindings.getKerningPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Renders the range of characters to the font cache texture.
   */
  public final fun renderRange(
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
  public final fun renderGlyph(
    cacheIndex: Int,
    size: Vector2i,
    index: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.renderGlyphPtr, NIL)
  }

  /**
   * Adds override for [Font.isLanguageSupported].
   */
  public final fun setLanguageSupportOverride(language: String, supported: Boolean): Unit {
    TransferContext.writeArguments(STRING to language, BOOL to supported)
    TransferContext.callMethod(rawPtr, MethodBindings.setLanguageSupportOverridePtr, NIL)
  }

  /**
   * Returns `true` if support override is enabled for the [language].
   */
  public final fun getLanguageSupportOverride(language: String): Boolean {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.getLanguageSupportOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Remove language support override.
   */
  public final fun removeLanguageSupportOverride(language: String): Unit {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.removeLanguageSupportOverridePtr, NIL)
  }

  /**
   * Returns list of language support overrides.
   */
  public final fun getLanguageSupportOverrides(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLanguageSupportOverridesPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Adds override for [Font.isScriptSupported].
   */
  public final fun setScriptSupportOverride(script: String, supported: Boolean): Unit {
    TransferContext.writeArguments(STRING to script, BOOL to supported)
    TransferContext.callMethod(rawPtr, MethodBindings.setScriptSupportOverridePtr, NIL)
  }

  /**
   * Returns `true` if support override is enabled for the [script].
   */
  public final fun getScriptSupportOverride(script: String): Boolean {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptSupportOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes script support override.
   */
  public final fun removeScriptSupportOverride(script: String): Unit {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr, MethodBindings.removeScriptSupportOverridePtr, NIL)
  }

  /**
   * Returns list of script support overrides.
   */
  public final fun getScriptSupportOverrides(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptSupportOverridesPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public final fun setOpentypeFeatureOverrides(overrides: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to overrides)
    TransferContext.callMethod(rawPtr, MethodBindings.setOpentypeFeatureOverridesPtr, NIL)
  }

  public final fun getOpentypeFeatureOverrides(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOpentypeFeatureOverridesPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the glyph index of a [char], optionally modified by the [variationSelector].
   */
  public final fun getGlyphIndex(
    size: Int,
    char: Long,
    variationSelector: Long,
  ): Int {
    TransferContext.writeArguments(LONG to size.toLong(), LONG to char, LONG to variationSelector)
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns character code associated with [glyphIndex], or `0` if [glyphIndex] is invalid. See
   * [getGlyphIndex].
   */
  public final fun getCharFromGlyphIndex(size: Int, glyphIndex: Int): Long {
    TransferContext.writeArguments(LONG to size.toLong(), LONG to glyphIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCharFromGlyphIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val loadBitmapFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "load_bitmap_font", 166001499)

    public val loadDynamicFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "load_dynamic_font", 166001499)

    public val setDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_data", 2971499966)

    public val getDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_data", 2362200018)

    public val setFontNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_font_name", 83702148)

    public val setFontStyleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_font_style_name", 83702148)

    public val setFontStylePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_font_style", 918070724)

    public val setFontWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_font_weight", 1286410249)

    public val setFontStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_font_stretch", 1286410249)

    public val setAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_antialiasing", 1669900)

    public val getAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_antialiasing", 4262718649)

    public val setDisableEmbeddedBitmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_disable_embedded_bitmaps", 2586408642)

    public val getDisableEmbeddedBitmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_disable_embedded_bitmaps", 36873697)

    public val setGenerateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_generate_mipmaps", 2586408642)

    public val getGenerateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_generate_mipmaps", 36873697)

    public val setMultichannelSignedDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_multichannel_signed_distance_field", 2586408642)

    public val isMultichannelSignedDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "is_multichannel_signed_distance_field", 36873697)

    public val setMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_msdf_pixel_range", 1286410249)

    public val getMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_msdf_pixel_range", 3905245786)

    public val setMsdfSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_msdf_size", 1286410249)

    public val getMsdfSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_msdf_size", 3905245786)

    public val setFixedSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_fixed_size", 1286410249)

    public val getFixedSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_fixed_size", 3905245786)

    public val setFixedSizeScaleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_fixed_size_scale_mode", 1660989956)

    public val getFixedSizeScaleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_fixed_size_scale_mode", 753873478)

    public val setAllowSystemFallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_allow_system_fallback", 2586408642)

    public val isAllowSystemFallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "is_allow_system_fallback", 36873697)

    public val setForceAutohinterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_force_autohinter", 2586408642)

    public val isForceAutohinterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "is_force_autohinter", 36873697)

    public val setHintingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_hinting", 1827459492)

    public val getHintingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_hinting", 3683214614)

    public val setSubpixelPositioningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_subpixel_positioning", 4225742182)

    public val getSubpixelPositioningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_subpixel_positioning", 1069238588)

    public val setOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_oversampling", 373806689)

    public val getOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_oversampling", 1740695150)

    public val getCacheCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_count", 3905245786)

    public val clearCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "clear_cache", 3218959716)

    public val removeCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_cache", 1286410249)

    public val getSizeCacheListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_size_cache_list", 663333327)

    public val clearSizeCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "clear_size_cache", 1286410249)

    public val removeSizeCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_size_cache", 2311374912)

    public val setVariationCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_variation_coordinates", 64545446)

    public val getVariationCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_variation_coordinates", 3485342025)

    public val setEmboldenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_embolden", 1602489585)

    public val getEmboldenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_embolden", 2339986948)

    public val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_transform", 30160968)

    public val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_transform", 3836996910)

    public val setExtraSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_extra_spacing", 62942285)

    public val getExtraSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_extra_spacing", 1924257185)

    public val setExtraBaselineOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_extra_baseline_offset", 1602489585)

    public val getExtraBaselineOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_extra_baseline_offset", 2339986948)

    public val setFaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_face_index", 3937882851)

    public val getFaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_face_index", 923996154)

    public val setCacheAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_ascent", 3506521499)

    public val getCacheAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_ascent", 3085491603)

    public val setCacheDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_descent", 3506521499)

    public val getCacheDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_descent", 3085491603)

    public val setCacheUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_underline_position", 3506521499)

    public val getCacheUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_underline_position", 3085491603)

    public val setCacheUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_underline_thickness", 3506521499)

    public val getCacheUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_underline_thickness", 3085491603)

    public val setCacheScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_scale", 3506521499)

    public val getCacheScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_scale", 3085491603)

    public val getTextureCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_texture_count", 1987661582)

    public val clearTexturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "clear_textures", 2311374912)

    public val removeTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_texture", 2328951467)

    public val setTextureImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_texture_image", 4157974066)

    public val getTextureImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_texture_image", 3878418953)

    public val setTextureOffsetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_texture_offsets", 2849993437)

    public val getTextureOffsetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_texture_offsets", 3703444828)

    public val getGlyphListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_list", 681709689)

    public val clearGlyphsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "clear_glyphs", 2311374912)

    public val removeGlyphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_glyph", 2328951467)

    public val setGlyphAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_glyph_advance", 947991729)

    public val getGlyphAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_advance", 1601573536)

    public val setGlyphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_glyph_offset", 921719850)

    public val getGlyphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_offset", 3205412300)

    public val setGlyphSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_glyph_size", 921719850)

    public val getGlyphSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_size", 3205412300)

    public val setGlyphUvRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_glyph_uv_rect", 3821620992)

    public val getGlyphUvRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_uv_rect", 3927917900)

    public val setGlyphTextureIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_glyph_texture_idx", 355564111)

    public val getGlyphTextureIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_texture_idx", 1629411054)

    public val getKerningListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_kerning_list", 2345056839)

    public val clearKerningMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "clear_kerning_map", 3937882851)

    public val removeKerningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_kerning", 3930204747)

    public val setKerningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_kerning", 3182200918)

    public val getKerningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_kerning", 1611912865)

    public val renderRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "render_range", 355564111)

    public val renderGlyphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "render_glyph", 2328951467)

    public val setLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_language_support_override", 2678287736)

    public val getLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_language_support_override", 3927539163)

    public val removeLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_language_support_override", 83702148)

    public val getLanguageSupportOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_language_support_overrides", 1139954409)

    public val setScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_script_support_override", 2678287736)

    public val getScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_script_support_override", 3927539163)

    public val removeScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_script_support_override", 83702148)

    public val getScriptSupportOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_script_support_overrides", 1139954409)

    public val setOpentypeFeatureOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_opentype_feature_overrides", 4155329257)

    public val getOpentypeFeatureOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_opentype_feature_overrides", 3102165223)

    public val getGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_index", 864943070)

    public val getCharFromGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_char_from_glyph_index", 3175239445)
  }
}
