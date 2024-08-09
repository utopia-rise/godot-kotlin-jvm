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
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
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
import kotlin.jvm.JvmOverloads

/**
 * Abstract base class for fonts and font variations.
 *
 * Abstract base class for different font types. It has methods for drawing text and font character introspection.
 */
@GodotBaseType
public open class Font internal constructor() : Resource() {
  /**
   * Array of fallback [godot.Font]s to use as a substitute if a glyph is not found in this current [godot.Font].
   *
   * If this array is empty in a [godot.FontVariation], the [godot.FontVariation.baseFont]'s fallbacks are used instead.
   */
  public var fallbacks: VariantArray<Font>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFallbacksPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Font>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFallbacksPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FONT, scriptIndex)
    return true
  }

  /**
   * Returns [godot.TextServer] RID of the font cache for specific variation.
   */
  @JvmOverloads
  public fun findVariation(
    variationCoordinates: Dictionary<Any?, Any?>,
    faceIndex: Int = 0,
    strength: Float = 0.0f,
    transform: Transform2D = Transform2D(),
    spacingTop: Int = 0,
    spacingBottom: Int = 0,
    spacingSpace: Int = 0,
    spacingGlyph: Int = 0,
  ): RID {
    TransferContext.writeArguments(DICTIONARY to variationCoordinates, LONG to faceIndex.toLong(), DOUBLE to strength.toDouble(), TRANSFORM2D to transform, LONG to spacingTop.toLong(), LONG to spacingBottom.toLong(), LONG to spacingSpace.toLong(), LONG to spacingGlyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.findVariationPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns [godot.Array] of valid [godot.Font] [RID]s, which can be passed to the [godot.TextServer] methods.
   */
  public fun getRids(): VariantArray<RID> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  /**
   * Returns the total average font height (ascent plus descent) in pixels.
   *
   * **Note:** Real height of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate (e.g. as the height of empty line).
   */
  @JvmOverloads
  public fun getHeight(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the average font ascent (number of pixels above the baseline).
   *
   * **Note:** Real ascent of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate (e.g. as the ascent of empty line).
   */
  @JvmOverloads
  public fun getAscent(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAscentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the average font descent (number of pixels below the baseline).
   *
   * **Note:** Real descent of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate (e.g. as the descent of empty line).
   */
  @JvmOverloads
  public fun getDescent(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDescentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns average pixel offset of the underline below the baseline.
   *
   * **Note:** Real underline position of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate.
   */
  @JvmOverloads
  public fun getUnderlinePosition(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getUnderlinePositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns average thickness of the underline.
   *
   * **Note:** Real underline thickness of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate.
   */
  @JvmOverloads
  public fun getUnderlineThickness(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getUnderlineThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns font family name.
   */
  public fun getFontName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns font style name.
   */
  public fun getFontStyleName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontStyleNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns [godot.core.Dictionary] with OpenType font name strings (localized font names, version, description, license information, sample text, etc.).
   */
  public fun getOtNameStrings(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOtNameStringsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns font style flags, see [enum TextServer.FontStyle].
   */
  public fun getFontStyle(): TextServer.FontStyle {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontStylePtr, LONG)
    return FontStyleValue(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns weight (boldness) of the font. A value in the `100...999` range, normal font weight is `400`, bold font weight is `700`.
   */
  public fun getFontWeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontWeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns font stretch amount, compared to a normal width. A percentage value between `50%` and `200%`.
   */
  public fun getFontStretch(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontStretchPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the spacing for the given `type` (see [enum TextServer.SpacingType]).
   */
  public fun getSpacing(spacing: TextServer.SpacingType): Int {
    TransferContext.writeArguments(LONG to spacing.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getSpacingPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a set of OpenType feature tags. More info: [godot.OpenType feature tags](https://docs.microsoft.com/en-us/typography/opentype/spec/featuretags).
   */
  public fun getOpentypeFeatures(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOpentypeFeaturesPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets LRU cache capacity for `draw_*` methods.
   */
  public fun setCacheCapacity(singleLine: Int, multiLine: Int): Unit {
    TransferContext.writeArguments(LONG to singleLine.toLong(), LONG to multiLine.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCacheCapacityPtr, NIL)
  }

  /**
   * Returns the size of a bounding box of a single-line string, taking kerning, advance and subpixel positioning into account. See also [getMultilineStringSize] and [drawString].
   *
   * For example, to get the string size as displayed by a single-line Label, use:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var string_size = $Label.get_theme_font("font").get_string_size($Label.text, HORIZONTAL_ALIGNMENT_LEFT, -1, $Label.get_theme_font_size("font_size"))
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * Label label = GetNode<Label>("Label");
   *
   * Vector2 stringSize = label.GetThemeFont("font").GetStringSize(label.Text, HorizontalAlignment.Left, -1, label.GetThemeFontSize("font_size"));
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** Since kerning, advance and subpixel positioning are taken into account by [getStringSize], using separate [getStringSize] calls on substrings of a string then adding the results together will return a different result compared to using a single [getStringSize] call on the full string.
   *
   * **Note:** Real height of the string is context-dependent and can be significantly different from the value returned by [getHeight].
   */
  @JvmOverloads
  public fun getStringSize(
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
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the size of a bounding box of a string broken into the lines, taking kerning and advance into account.
   *
   * See also [drawMultilineString].
   */
  @JvmOverloads
  public fun getMultilineStringSize(
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
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Draw [text] into a canvas item using the font, at a given position, with [modulate] color, optionally clipping the width and aligning horizontally. [pos] specifies the baseline, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * See also [godot.CanvasItem.drawString].
   */
  @JvmOverloads
  public fun drawString(
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
   * Breaks [text] into lines using rules specified by [brkFlags] and draws it into a canvas item using the font, at a given position, with [modulate] color, optionally clipping the width and aligning horizontally. [pos] specifies the baseline of the first line, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * See also [godot.CanvasItem.drawMultilineString].
   */
  @JvmOverloads
  public fun drawMultilineString(
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
   * Draw [text] outline into a canvas item using the font, at a given position, with [modulate] color and [size] outline size, optionally clipping the width and aligning horizontally. [pos] specifies the baseline, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * See also [godot.CanvasItem.drawStringOutline].
   */
  @JvmOverloads
  public fun drawStringOutline(
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
   * Breaks [text] to the lines using rules specified by [brkFlags] and draws text outline into a canvas item using the font, at a given position, with [modulate] color and [size] outline size, optionally clipping the width and aligning horizontally. [pos] specifies the baseline of the first line, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * See also [godot.CanvasItem.drawMultilineStringOutline].
   */
  @JvmOverloads
  public fun drawMultilineStringOutline(
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
   * Returns the size of a character, optionally taking kerning into account if the next character is provided.
   *
   * **Note:** Do not use this function to calculate width of the string character by character, use [getStringSize] or [godot.TextLine] instead. The height returned is the font height (see also [getHeight]) and has no relation to the glyph height.
   */
  public fun getCharSize(char: Long, fontSize: Int): Vector2 {
    TransferContext.writeArguments(LONG to char, LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCharSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Draw a single Unicode character [char] into a canvas item using the font, at a given position, with [modulate] color. [pos] specifies the baseline, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * **Note:** Do not use this function to draw strings character by character, use [drawString] or [godot.TextLine] instead.
   */
  @JvmOverloads
  public fun drawChar(
    canvasItem: RID,
    pos: Vector2,
    char: Long,
    fontSize: Int,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Float {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, LONG to char, LONG to fontSize.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.drawCharPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Draw a single Unicode character [char] outline into a canvas item using the font, at a given position, with [modulate] color and [size] outline size. [pos] specifies the baseline, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * **Note:** Do not use this function to draw strings character by character, use [drawString] or [godot.TextLine] instead.
   */
  @JvmOverloads
  public fun drawCharOutline(
    canvasItem: RID,
    pos: Vector2,
    char: Long,
    fontSize: Int,
    size: Int = -1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Float {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, LONG to char, LONG to fontSize.toLong(), LONG to size.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.drawCharOutlinePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns `true` if a Unicode [char] is available in the font.
   */
  public fun hasChar(char: Long): Boolean {
    TransferContext.writeArguments(LONG to char)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCharPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns a string containing all the characters available in the font.
   *
   * If a given character is included in more than one font data source, it appears only once in the returned string.
   */
  public fun getSupportedChars(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSupportedCharsPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true`, if font supports given language ([godot.ISO 639](https://en.wikipedia.org/wiki/ISO_639-1) code).
   */
  public fun isLanguageSupported(language: String): Boolean {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.isLanguageSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true`, if font supports given script ([godot.ISO 15924](https://en.wikipedia.org/wiki/ISO_15924) code).
   */
  public fun isScriptSupported(script: String): Boolean {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr, MethodBindings.isScriptSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns list of OpenType features supported by font.
   */
  public fun getSupportedFeatureList(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSupportedFeatureListPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns list of supported [variation coordinates](https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg), each coordinate is returned as `tag: Vector3i(min_value,max_value,default_value)`.
   *
   * Font variations allow for continuous change of glyph characteristics along some given design axis, such as weight, width or slant.
   *
   * To print available variation axes of a variable font:
   *
   * ```
   * 				var fv = FontVariation.new()
   * 				fv.set_base_font = load("res://RobotoFlex.ttf")
   * 				var variation_list = fv.get_supported_variation_list()
   * 				for tag in variation_list:
   * 				    var name = TextServerManager.get_primary_interface().tag_to_name(tag)
   * 				    var values = variation_list[tag]
   * 				    print("variation axis: %s (%d)\n\tmin, max, default: %s" % [name, tag, values])
   * 				```
   *
   * **Note:** To set and get variation coordinates of a [godot.FontVariation], use [godot.FontVariation.variationOpentype].
   */
  public fun getSupportedVariationList(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSupportedVariationListPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns number of faces in the TrueType / OpenType collection.
   */
  public fun getFaceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setFallbacksPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "set_fallbacks")

    public val getFallbacksPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_fallbacks")

    public val findVariationPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "find_variation")

    public val getRidsPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_rids")

    public val getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_height")

    public val getAscentPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_ascent")

    public val getDescentPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_descent")

    public val getUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_underline_position")

    public val getUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_underline_thickness")

    public val getFontNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_font_name")

    public val getFontStyleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_font_style_name")

    public val getOtNameStringsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_ot_name_strings")

    public val getFontStylePtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_font_style")

    public val getFontWeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_font_weight")

    public val getFontStretchPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_font_stretch")

    public val getSpacingPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_spacing")

    public val getOpentypeFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_opentype_features")

    public val setCacheCapacityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "set_cache_capacity")

    public val getStringSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_string_size")

    public val getMultilineStringSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_multiline_string_size")

    public val drawStringPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "draw_string")

    public val drawMultilineStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "draw_multiline_string")

    public val drawStringOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "draw_string_outline")

    public val drawMultilineStringOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "draw_multiline_string_outline")

    public val getCharSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_char_size")

    public val drawCharPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "draw_char")

    public val drawCharOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "draw_char_outline")

    public val hasCharPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "has_char")

    public val getSupportedCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_supported_chars")

    public val isLanguageSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "is_language_supported")

    public val isScriptSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "is_script_supported")

    public val getSupportedFeatureListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_supported_feature_list")

    public val getSupportedVariationListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_supported_variation_list")

    public val getFaceCountPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_face_count")
  }
}
