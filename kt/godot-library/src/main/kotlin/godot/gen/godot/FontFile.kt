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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_DATA,
          PACKED_BYTE_ARRAY)
      return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_DATA, NIL)
    }

  /**
   * If set to `true`, generate mipmaps for the font textures.
   */
  public var generateMipmaps: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_GENERATE_MIPMAPS,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_GENERATE_MIPMAPS,
          NIL)
    }

  /**
   * Font anti-aliasing mode.
   */
  public var antialiasing: TextServer.FontAntialiasing
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_ANTIALIASING, LONG)
      return TextServer.FontAntialiasing.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_ANTIALIASING, NIL)
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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_FONT_NAME, NIL)
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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_FONT_STYLE_NAME, NIL)
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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_FONT_STYLE, NIL)
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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_FONT_WEIGHT, NIL)
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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_FONT_STRETCH, NIL)
    }

  /**
   * Font glyph subpixel positioning mode. Subpixel positioning provides shaper text and better kerning for smaller font sizes, at the cost of higher memory usage and lower font rasterization speed. Use [godot.TextServer.SUBPIXEL_POSITIONING_AUTO] to automatically enable it based on the font size.
   */
  public var subpixelPositioning: TextServer.SubpixelPositioning
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_SUBPIXEL_POSITIONING,
          LONG)
      return TextServer.SubpixelPositioning.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_SUBPIXEL_POSITIONING,
          NIL)
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
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTFILE_IS_MULTICHANNEL_SIGNED_DISTANCE_FIELD, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_MULTICHANNEL_SIGNED_DISTANCE_FIELD, NIL)
    }

  /**
   * The width of the range around the shape between the minimum and maximum representable signed distance. If using font outlines, [msdfPixelRange] must be set to at least *twice* the size of the largest font outline. The default [msdfPixelRange] value of `16` allows outline sizes up to `8` to look correct.
   */
  public var msdfPixelRange: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_MSDF_PIXEL_RANGE,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_MSDF_PIXEL_RANGE,
          NIL)
    }

  /**
   * Source font size used to generate MSDF textures. Higher values allow for more precision, but are slower to render and require more memory. Only increase this value if you notice a visible lack of precision in glyph rendering.
   */
  public var msdfSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_MSDF_SIZE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_MSDF_SIZE, NIL)
    }

  /**
   * If set to `true`, system fonts can be automatically used as fallbacks.
   */
  public var allowSystemFallback: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_IS_ALLOW_SYSTEM_FALLBACK,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_ALLOW_SYSTEM_FALLBACK, NIL)
    }

  /**
   * If set to `true`, auto-hinting is supported and preferred over font built-in hinting. Used by dynamic fonts only (MSDF fonts don't support hinting).
   */
  public var forceAutohinter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_IS_FORCE_AUTOHINTER,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_FORCE_AUTOHINTER,
          NIL)
    }

  /**
   * Font hinting mode. Used by dynamic fonts only.
   */
  public var hinting: TextServer.Hinting
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_HINTING, LONG)
      return TextServer.Hinting.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_HINTING, NIL)
    }

  /**
   * Font oversampling factor. If set to `0.0`, the global oversampling factor is used instead. Used by dynamic fonts only (MSDF fonts ignore oversampling).
   */
  public var oversampling: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_OVERSAMPLING, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_OVERSAMPLING, NIL)
    }

  /**
   * Font size, used only for the bitmap fonts.
   */
  public var fixedSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_FIXED_SIZE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_FIXED_SIZE, NIL)
    }

  /**
   * Scaling mode, used only for the bitmap fonts with [fixedSize] greater than zero.
   */
  public var fixedSizeScaleMode: TextServer.FixedSizeScaleMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_FIXED_SIZE_SCALE_MODE, LONG)
      return TextServer.FixedSizeScaleMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_FIXED_SIZE_SCALE_MODE, NIL)
    }

  /**
   * Font OpenType feature set override.
   */
  public var opentypeFeatureOverrides: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_OPENTYPE_FEATURE_OVERRIDES, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_OPENTYPE_FEATURE_OVERRIDES, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_LOAD_BITMAP_FONT, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads a TrueType (.ttf), OpenType (.otf), WOFF (.woff), WOFF2 (.woff2) or Type 1 (.pfb, .pfm) dynamic font from file [path].
   *
   * **Warning:** This method should only be used in the editor or in cases when you need to load external fonts at run-time, such as fonts located at the `user://` directory.
   */
  public fun loadDynamicFont(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_LOAD_DYNAMIC_FONT, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns number of the font cache entries.
   */
  public fun getCacheCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_CACHE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes all font cache entries.
   */
  public fun clearCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_CLEAR_CACHE, NIL)
  }

  /**
   * Removes specified font cache entry.
   */
  public fun removeCache(cacheIndex: Int): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_REMOVE_CACHE, NIL)
  }

  /**
   * Returns list of the font sizes in the cache. Each size is [godot.Vector2i] with font size and outline size.
   */
  public fun getSizeCacheList(cacheIndex: Int): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_SIZE_CACHE_LIST, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  /**
   * Removes all font sizes from the cache entry
   */
  public fun clearSizeCache(cacheIndex: Int): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_CLEAR_SIZE_CACHE, NIL)
  }

  /**
   * Removes specified font size from the cache entry.
   */
  public fun removeSizeCache(cacheIndex: Int, size: Vector2i): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_REMOVE_SIZE_CACHE, NIL)
  }

  /**
   * Sets variation coordinates for the specified font cache entry. See [godot.Font.getSupportedVariationList] for more info.
   */
  public fun setVariationCoordinates(cacheIndex: Int, variationCoordinates: Dictionary<Any?, Any?>):
      Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), DICTIONARY to variationCoordinates)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_VARIATION_COORDINATES,
        NIL)
  }

  /**
   * Returns variation coordinates for the specified font cache entry. See [godot.Font.getSupportedVariationList] for more info.
   */
  public fun getVariationCoordinates(cacheIndex: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_VARIATION_COORDINATES,
        DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets embolden strength, if is not equal to zero, emboldens the font outlines. Negative values reduce the outline thickness.
   */
  public fun setEmbolden(cacheIndex: Int, strength: Float): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), DOUBLE to strength.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_EMBOLDEN, NIL)
  }

  /**
   * Returns embolden strength, if is not equal to zero, emboldens the font outlines. Negative values reduce the outline thickness.
   */
  public fun getEmbolden(cacheIndex: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_EMBOLDEN, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets 2D transform, applied to the font outlines, can be used for slanting, flipping and rotating glyphs.
   */
  public fun setTransform(cacheIndex: Int, transform: Transform2D): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_TRANSFORM, NIL)
  }

  /**
   * Returns 2D transform, applied to the font outlines, can be used for slanting, flipping and rotating glyphs.
   */
  public fun getTransform(cacheIndex: Int): Transform2D {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_TRANSFORM, TRANSFORM2D)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_EXTRA_SPACING, NIL)
  }

  /**
   * Returns spacing for [spacing] (see [enum TextServer.SpacingType]) in pixels (not relative to the font size).
   */
  public fun getExtraSpacing(cacheIndex: Int, spacing: TextServer.SpacingType): Long {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to spacing.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_EXTRA_SPACING, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets an active face index in the TrueType / OpenType collection.
   */
  public fun setFaceIndex(cacheIndex: Int, faceIndex: Long): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to faceIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_FACE_INDEX, NIL)
  }

  /**
   * Returns an active face index in the TrueType / OpenType collection.
   */
  public fun getFaceIndex(cacheIndex: Int): Long {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_FACE_INDEX, LONG)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_CACHE_ASCENT, NIL)
  }

  /**
   * Returns the font ascent (number of pixels above the baseline).
   */
  public fun getCacheAscent(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_CACHE_ASCENT, DOUBLE)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_CACHE_DESCENT, NIL)
  }

  /**
   * Returns the font descent (number of pixels below the baseline).
   */
  public fun getCacheDescent(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_CACHE_DESCENT, DOUBLE)
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
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_CACHE_UNDERLINE_POSITION, NIL)
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public fun getCacheUnderlinePosition(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_CACHE_UNDERLINE_POSITION, DOUBLE)
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
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_CACHE_UNDERLINE_THICKNESS, NIL)
  }

  /**
   * Returns thickness of the underline in pixels.
   */
  public fun getCacheUnderlineThickness(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_CACHE_UNDERLINE_THICKNESS, DOUBLE)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_CACHE_SCALE, NIL)
  }

  /**
   * Returns scaling factor of the color bitmap font.
   */
  public fun getCacheScale(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_CACHE_SCALE, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns number of textures used by font cache entry.
   */
  public fun getTextureCount(cacheIndex: Int, size: Vector2i): Int {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_TEXTURE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes all textures from font cache entry.
   *
   * **Note:** This function will not remove glyphs associated with the texture, use [removeGlyph] to remove them manually.
   */
  public fun clearTextures(cacheIndex: Int, size: Vector2i): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_CLEAR_TEXTURES, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_REMOVE_TEXTURE, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_TEXTURE_IMAGE, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_TEXTURE_IMAGE, OBJECT)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_TEXTURE_OFFSETS, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_TEXTURE_OFFSETS,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns list of rendered glyphs in the cache entry.
   */
  public fun getGlyphList(cacheIndex: Int, size: Vector2i): PackedInt32Array {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_GLYPH_LIST,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Removes all rendered glyphs information from the cache entry.
   *
   * **Note:** This function will not remove textures associated with the glyphs, use [removeTexture] to remove them manually.
   */
  public fun clearGlyphs(cacheIndex: Int, size: Vector2i): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_CLEAR_GLYPHS, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_REMOVE_GLYPH, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_GLYPH_ADVANCE, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_GLYPH_ADVANCE, VECTOR2)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_GLYPH_OFFSET, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_GLYPH_OFFSET, VECTOR2)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_GLYPH_SIZE, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_GLYPH_SIZE, VECTOR2)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_GLYPH_UV_RECT, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_GLYPH_UV_RECT, RECT2)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_GLYPH_TEXTURE_IDX, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_GLYPH_TEXTURE_IDX,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns list of the kerning overrides.
   */
  public fun getKerningList(cacheIndex: Int, size: Int): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_KERNING_LIST, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  /**
   * Removes all kerning overrides.
   */
  public fun clearKerningMap(cacheIndex: Int, size: Int): Unit {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_CLEAR_KERNING_MAP, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_REMOVE_KERNING, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_KERNING, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_KERNING, VECTOR2)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_RENDER_RANGE, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_RENDER_GLYPH, NIL)
  }

  /**
   * Adds override for [godot.Font.isLanguageSupported].
   */
  public fun setLanguageSupportOverride(language: String, supported: Boolean): Unit {
    TransferContext.writeArguments(STRING to language, BOOL to supported)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_LANGUAGE_SUPPORT_OVERRIDE, NIL)
  }

  /**
   * Returns `true` if support override is enabled for the [language].
   */
  public fun getLanguageSupportOverride(language: String): Boolean {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_LANGUAGE_SUPPORT_OVERRIDE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Remove language support override.
   */
  public fun removeLanguageSupportOverride(language: String): Unit {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTFILE_REMOVE_LANGUAGE_SUPPORT_OVERRIDE, NIL)
  }

  /**
   * Returns list of language support overrides.
   */
  public fun getLanguageSupportOverrides(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_LANGUAGE_SUPPORT_OVERRIDES, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Adds override for [godot.Font.isScriptSupported].
   */
  public fun setScriptSupportOverride(script: String, supported: Boolean): Unit {
    TransferContext.writeArguments(STRING to script, BOOL to supported)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTFILE_SET_SCRIPT_SUPPORT_OVERRIDE, NIL)
  }

  /**
   * Returns `true` if support override is enabled for the [script].
   */
  public fun getScriptSupportOverride(script: String): Boolean {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_SCRIPT_SUPPORT_OVERRIDE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes script support override.
   */
  public fun removeScriptSupportOverride(script: String): Unit {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTFILE_REMOVE_SCRIPT_SUPPORT_OVERRIDE, NIL)
  }

  /**
   * Returns list of script support overrides.
   */
  public fun getScriptSupportOverrides(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_SCRIPT_SUPPORT_OVERRIDES, PACKED_STRING_ARRAY)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_GLYPH_INDEX, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns character code associated with [glyphIndex], or `0` if [glyphIndex] is invalid. See [getGlyphIndex].
   */
  public fun getCharFromGlyphIndex(size: Int, glyphIndex: Int): Long {
    TransferContext.writeArguments(LONG to size.toLong(), LONG to glyphIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTFILE_GET_CHAR_FROM_GLYPH_INDEX,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public companion object
}
