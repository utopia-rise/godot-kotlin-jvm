// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.TextServer.FontStyleValue
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.RID
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
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
import kotlin.jvm.JvmOverloads

/**
 * Abstract base class for different font types. It has methods for drawing text and font character
 * introspection.
 */
@GodotBaseType
public open class Font internal constructor() : Resource() {
  /**
   * Array of fallback [Font]s to use as a substitute if a glyph is not found in this current
   * [Font].
   * If this array is empty in a [FontVariation], the [FontVariation.baseFont]'s fallbacks are used
   * instead.
   */
  public final inline var fallbacks: VariantArray<Font>
    @JvmName("fallbacksProperty")
    get() = getFallbacks()
    @JvmName("fallbacksProperty")
    set(`value`) {
      setFallbacks(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_FONT_INDEX, scriptIndex)
  }

  public final fun setFallbacks(fallbacks: VariantArray<Font>): Unit {
    TransferContext.writeArguments(ARRAY to fallbacks)
    TransferContext.callMethod(rawPtr, MethodBindings.setFallbacksPtr, NIL)
  }

  public final fun getFallbacks(): VariantArray<Font> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFallbacksPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Font>)
  }

  /**
   * Returns [TextServer] RID of the font cache for specific variation.
   */
  @JvmOverloads
  public final fun findVariation(
    variationCoordinates: Dictionary<Any?, Any?>,
    faceIndex: Int = 0,
    strength: Float = 0.0f,
    transform: Transform2D = Transform2D(),
    spacingTop: Int = 0,
    spacingBottom: Int = 0,
    spacingSpace: Int = 0,
    spacingGlyph: Int = 0,
    baselineOffset: Float = 0.0f,
  ): RID {
    TransferContext.writeArguments(DICTIONARY to variationCoordinates, LONG to faceIndex.toLong(), DOUBLE to strength.toDouble(), TRANSFORM2D to transform, LONG to spacingTop.toLong(), LONG to spacingBottom.toLong(), LONG to spacingSpace.toLong(), LONG to spacingGlyph.toLong(), DOUBLE to baselineOffset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.findVariationPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns [Array] of valid [Font] [RID]s, which can be passed to the [TextServer] methods.
   */
  public final fun getRids(): VariantArray<RID> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * Returns the total average font height (ascent plus descent) in pixels.
   * **Note:** Real height of the string is context-dependent and can be significantly different
   * from the value returned by this function. Use it only as rough estimate (e.g. as the height of
   * empty line).
   */
  @JvmOverloads
  public final fun getHeight(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the average font ascent (number of pixels above the baseline).
   * **Note:** Real ascent of the string is context-dependent and can be significantly different
   * from the value returned by this function. Use it only as rough estimate (e.g. as the ascent of
   * empty line).
   */
  @JvmOverloads
  public final fun getAscent(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAscentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the average font descent (number of pixels below the baseline).
   * **Note:** Real descent of the string is context-dependent and can be significantly different
   * from the value returned by this function. Use it only as rough estimate (e.g. as the descent of
   * empty line).
   */
  @JvmOverloads
  public final fun getDescent(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDescentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns average pixel offset of the underline below the baseline.
   * **Note:** Real underline position of the string is context-dependent and can be significantly
   * different from the value returned by this function. Use it only as rough estimate.
   */
  @JvmOverloads
  public final fun getUnderlinePosition(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getUnderlinePositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns average thickness of the underline.
   * **Note:** Real underline thickness of the string is context-dependent and can be significantly
   * different from the value returned by this function. Use it only as rough estimate.
   */
  @JvmOverloads
  public final fun getUnderlineThickness(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getUnderlineThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns font family name.
   */
  public final fun getFontName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns font style name.
   */
  public final fun getFontStyleName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontStyleNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns [Dictionary] with OpenType font name strings (localized font names, version,
   * description, license information, sample text, etc.).
   */
  public final fun getOtNameStrings(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOtNameStringsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns font style flags, see [TextServer.FontStyle].
   */
  public final fun getFontStyle(): TextServer.FontStyle {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontStylePtr, LONG)
    return FontStyleValue(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns weight (boldness) of the font. A value in the `100...999` range, normal font weight is
   * `400`, bold font weight is `700`.
   */
  public final fun getFontWeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontWeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns font stretch amount, compared to a normal width. A percentage value between `50&#37;`
   * and `200&#37;`.
   */
  public final fun getFontStretch(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontStretchPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the spacing for the given `type` (see [TextServer.SpacingType]).
   */
  public final fun getSpacing(spacing: TextServer.SpacingType): Int {
    TransferContext.writeArguments(LONG to spacing.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getSpacingPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a set of OpenType feature tags. More info:
   * [url=https://docs.microsoft.com/en-us/typography/opentype/spec/featuretags]OpenType feature
   * tags[/url].
   */
  public final fun getOpentypeFeatures(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOpentypeFeaturesPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets LRU cache capacity for `draw_*` methods.
   */
  public final fun setCacheCapacity(singleLine: Int, multiLine: Int): Unit {
    TransferContext.writeArguments(LONG to singleLine.toLong(), LONG to multiLine.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCacheCapacityPtr, NIL)
  }

  /**
   * Returns the size of a bounding box of a single-line string, taking kerning, advance and
   * subpixel positioning into account. See also [getMultilineStringSize] and [drawString].
   * For example, to get the string size as displayed by a single-line Label, use:
   *
   * gdscript:
   * ```gdscript
   * var string_size = $Label.get_theme_font("font").get_string_size($Label.text,
   * HORIZONTAL_ALIGNMENT_LEFT, -1, $Label.get_theme_font_size("font_size"))
   * ```
   * csharp:
   * ```csharp
   * Label label = GetNode<Label>("Label");
   * Vector2 stringSize = label.GetThemeFont("font").GetStringSize(label.Text,
   * HorizontalAlignment.Left, -1, label.GetThemeFontSize("font_size"));
   * ```
   *
   * **Note:** Since kerning, advance and subpixel positioning are taken into account by
   * [getStringSize], using separate [getStringSize] calls on substrings of a string then adding the
   * results together will return a different result compared to using a single [getStringSize] call on
   * the full string.
   * **Note:** Real height of the string is context-dependent and can be significantly different
   * from the value returned by [getHeight].
   */
  @JvmOverloads
  public final fun getStringSize(
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Vector2 {
    TransferContext.writeArguments(STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getStringSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the size of a bounding box of a string broken into the lines, taking kerning and
   * advance into account.
   * See also [drawMultilineString].
   */
  @JvmOverloads
  public final fun getMultilineStringSize(
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    maxLines: Int = -1,
    brkFlags: TextServer.LineBreakFlag = TextServer.LineBreakFlagValue(3),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Vector2 {
    TransferContext.writeArguments(STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to maxLines.toLong(), LONG to brkFlags.flag, LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getMultilineStringSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Draw [text] into a canvas item using the font, at a given position, with [modulate] color,
   * optionally clipping the width and aligning horizontally. [pos] specifies the baseline, not the
   * top. To draw from the top, *ascent* must be added to the Y axis.
   * See also [CanvasItem.drawString].
   */
  @JvmOverloads
  public final fun drawString(
    canvasItem: RID,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), COLOR to modulate, LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.drawStringPtr, NIL)
  }

  /**
   * Breaks [text] into lines using rules specified by [brkFlags] and draws it into a canvas item
   * using the font, at a given position, with [modulate] color, optionally clipping the width and
   * aligning horizontally. [pos] specifies the baseline of the first line, not the top. To draw from
   * the top, *ascent* must be added to the Y axis.
   * See also [CanvasItem.drawMultilineString].
   */
  @JvmOverloads
  public final fun drawMultilineString(
    canvasItem: RID,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    maxLines: Int = -1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    brkFlags: TextServer.LineBreakFlag = TextServer.LineBreakFlagValue(3),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to maxLines.toLong(), COLOR to modulate, LONG to brkFlags.flag, LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.drawMultilineStringPtr, NIL)
  }

  /**
   * Draw [text] outline into a canvas item using the font, at a given position, with [modulate]
   * color and [size] outline size, optionally clipping the width and aligning horizontally. [pos]
   * specifies the baseline, not the top. To draw from the top, *ascent* must be added to the Y axis.
   * See also [CanvasItem.drawStringOutline].
   */
  @JvmOverloads
  public final fun drawStringOutline(
    canvasItem: RID,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    size: Int = 1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to size.toLong(), COLOR to modulate, LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.drawStringOutlinePtr, NIL)
  }

  /**
   * Breaks [text] to the lines using rules specified by [brkFlags] and draws text outline into a
   * canvas item using the font, at a given position, with [modulate] color and [size] outline size,
   * optionally clipping the width and aligning horizontally. [pos] specifies the baseline of the first
   * line, not the top. To draw from the top, *ascent* must be added to the Y axis.
   * See also [CanvasItem.drawMultilineStringOutline].
   */
  @JvmOverloads
  public final fun drawMultilineStringOutline(
    canvasItem: RID,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    maxLines: Int = -1,
    size: Int = 1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    brkFlags: TextServer.LineBreakFlag = TextServer.LineBreakFlagValue(3),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to maxLines.toLong(), LONG to size.toLong(), COLOR to modulate, LONG to brkFlags.flag, LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.drawMultilineStringOutlinePtr, NIL)
  }

  /**
   * Returns the size of a character. Does not take kerning into account.
   * **Note:** Do not use this function to calculate width of the string character by character, use
   * [getStringSize] or [TextLine] instead. The height returned is the font height (see also
   * [getHeight]) and has no relation to the glyph height.
   */
  public final fun getCharSize(char: Long, fontSize: Int): Vector2 {
    TransferContext.writeArguments(LONG to char, LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCharSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Draw a single Unicode character [char] into a canvas item using the font, at a given position,
   * with [modulate] color. [pos] specifies the baseline, not the top. To draw from the top, *ascent*
   * must be added to the Y axis.
   * **Note:** Do not use this function to draw strings character by character, use [drawString] or
   * [TextLine] instead.
   */
  @JvmOverloads
  public final fun drawChar(
    canvasItem: RID,
    pos: Vector2,
    char: Long,
    fontSize: Int,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Float {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, LONG to char, LONG to fontSize.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.drawCharPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Draw a single Unicode character [char] outline into a canvas item using the font, at a given
   * position, with [modulate] color and [size] outline size. [pos] specifies the baseline, not the
   * top. To draw from the top, *ascent* must be added to the Y axis.
   * **Note:** Do not use this function to draw strings character by character, use [drawString] or
   * [TextLine] instead.
   */
  @JvmOverloads
  public final fun drawCharOutline(
    canvasItem: RID,
    pos: Vector2,
    char: Long,
    fontSize: Int,
    size: Int = -1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Float {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, LONG to char, LONG to fontSize.toLong(), LONG to size.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.drawCharOutlinePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns `true` if a Unicode [char] is available in the font.
   */
  public final fun hasChar(char: Long): Boolean {
    TransferContext.writeArguments(LONG to char)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCharPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a string containing all the characters available in the font.
   * If a given character is included in more than one font data source, it appears only once in the
   * returned string.
   */
  public final fun getSupportedChars(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSupportedCharsPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true`, if font supports given language
   * ([url=https://en.wikipedia.org/wiki/ISO_639-1]ISO 639[/url] code).
   */
  public final fun isLanguageSupported(language: String): Boolean {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.isLanguageSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true`, if font supports given script ([url=https://en.wikipedia.org/wiki/ISO_15924]ISO
   * 15924[/url] code).
   */
  public final fun isScriptSupported(script: String): Boolean {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr, MethodBindings.isScriptSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns list of OpenType features supported by font.
   */
  public final fun getSupportedFeatureList(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSupportedFeatureListPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns list of supported
   * [url=https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg]variation
   * coordinates[/url], each coordinate is returned as `tag:
   * Vector3i(min_value,max_value,default_value)`.
   * Font variations allow for continuous change of glyph characteristics along some given design
   * axis, such as weight, width or slant.
   * To print available variation axes of a variable font:
   * [codeblock]
   * var fv = FontVariation.new()
   * fv.base_font = load("res://RobotoFlex.ttf")
   * var variation_list = fv.get_supported_variation_list()
   * for tag in variation_list:
   *     var name = TextServerManager.get_primary_interface().tag_to_name(tag)
   *     var values = variation_list[tag]
   *     print("variation axis: &#37;s (&#37;d)\n\tmin, max, default: &#37;s" &#37; [name, tag,
   * values])
   * [/codeblock]
   * **Note:** To set and get variation coordinates of a [FontVariation], use
   * [FontVariation.variationOpentype].
   */
  public final fun getSupportedVariationList(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSupportedVariationListPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns number of faces in the TrueType / OpenType collection.
   */
  public final fun getFaceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setFallbacksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "set_fallbacks", 381264803)

    public val getFallbacksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_fallbacks", 3995934104)

    public val findVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "find_variation", 2553855095)

    public val getRidsPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_rids", 3995934104)

    public val getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_height", 378113874)

    public val getAscentPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_ascent", 378113874)

    public val getDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_descent", 378113874)

    public val getUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_underline_position", 378113874)

    public val getUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_underline_thickness", 378113874)

    public val getFontNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_font_name", 201670096)

    public val getFontStyleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_font_style_name", 201670096)

    public val getOtNameStringsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_ot_name_strings", 3102165223)

    public val getFontStylePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_font_style", 2520224254)

    public val getFontWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_font_weight", 3905245786)

    public val getFontStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_font_stretch", 3905245786)

    public val getSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_spacing", 1310880908)

    public val getOpentypeFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_opentype_features", 3102165223)

    public val setCacheCapacityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "set_cache_capacity", 3937882851)

    public val getStringSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_string_size", 1868866121)

    public val getMultilineStringSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_multiline_string_size", 519636710)

    public val drawStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "draw_string", 1983721962)

    public val drawMultilineStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "draw_multiline_string", 1171506176)

    public val drawStringOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "draw_string_outline", 623754045)

    public val drawMultilineStringOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "draw_multiline_string_outline", 3206388178)

    public val getCharSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_char_size", 3016396712)

    public val drawCharPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "draw_char", 3815617597)

    public val drawCharOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "draw_char_outline", 209525354)

    public val hasCharPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "has_char", 1116898809)

    public val getSupportedCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_supported_chars", 201670096)

    public val isLanguageSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "is_language_supported", 3927539163)

    public val isScriptSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "is_script_supported", 3927539163)

    public val getSupportedFeatureListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_supported_feature_list", 3102165223)

    public val getSupportedVariationListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_supported_variation_list", 3102165223)

    public val getFaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_face_count", 3905245786)
  }
}
