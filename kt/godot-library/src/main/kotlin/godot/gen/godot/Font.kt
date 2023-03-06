// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.annotation.GodotBaseType
import godot.core.*
import godot.core.VariantType.*
import godot.core.memory.TransferContext

/**
 * Base class for fonts and font variations.
 *
 * Font is the abstract base class for font, so it shouldn't be used directly. Other types of fonts inherit from it.
 */
@GodotBaseType
public open class Font internal constructor() : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FONT, scriptIndex)
    return true
  }

  /**
   * Sets array of fallback [godot.Font]s.
   */
  public fun setFallbacks(fallbacks: VariantArray<Font>): Unit {
    TransferContext.writeArguments(ARRAY to fallbacks)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_SET_FALLBACKS, NIL)
  }

  /**
   * Returns array of fallback [godot.Font]s.
   */
  public fun getFallbacks(): VariantArray<Font> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_FALLBACKS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Font>
  }

  /**
   * Returns [godot.TextServer] RID of the font cache for specific variation.
   */
  public fun findVariation(
    variationCoordinates: Dictionary<Any?, Any?>,
    faceIndex: Long = 0,
    strength: Double = 0.0,
    transform: Transform2D = Transform2D(),
  ): RID {
    TransferContext.writeArguments(DICTIONARY to variationCoordinates, LONG to faceIndex, DOUBLE to strength, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_FIND_VARIATION, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns [godot.Array] of valid [godot.Font] [RID]s, which can be passed to the [godot.TextServer] methods.
   */
  public fun getRids(): VariantArray<RID> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_RIDS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>
  }

  /**
   * Returns the total average font height (ascent plus descent) in pixels.
   *
   * **Note:** Real height of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate (e.g. as the height of empty line).
   */
  public fun getHeight(fontSize: Long = 16): Double {
    TransferContext.writeArguments(LONG to fontSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_HEIGHT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the average font ascent (number of pixels above the baseline).
   *
   * **Note:** Real ascent of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate (e.g. as the ascent of empty line).
   */
  public fun getAscent(fontSize: Long = 16): Double {
    TransferContext.writeArguments(LONG to fontSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_ASCENT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the average font descent (number of pixels below the baseline).
   *
   * **Note:** Real descent of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate (e.g. as the descent of empty line).
   */
  public fun getDescent(fontSize: Long = 16): Double {
    TransferContext.writeArguments(LONG to fontSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_DESCENT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns average pixel offset of the underline below the baseline.
   *
   * **Note:** Real underline position of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate.
   */
  public fun getUnderlinePosition(fontSize: Long = 16): Double {
    TransferContext.writeArguments(LONG to fontSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_UNDERLINE_POSITION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns average thickness of the underline.
   *
   * **Note:** Real underline thickness of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate.
   */
  public fun getUnderlineThickness(fontSize: Long = 16): Double {
    TransferContext.writeArguments(LONG to fontSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_UNDERLINE_THICKNESS,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns font family name.
   */
  public fun getFontName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_FONT_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns font style name.
   */
  public fun getFontStyleName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_FONT_STYLE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns font style flags, see [enum TextServer.FontStyle].
   */
  public fun getFontStyle(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_FONT_STYLE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, false) as Long
  }

  /**
   * Returns weight (boldness) of the font. A value in the `100...999` range, normal font weight is `400`, bold font weight is `700`.
   */
  public fun getFontWeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_FONT_WEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns font stretch amount, compared to a normal width. A percentage value between `50%` and `200%`.
   */
  public fun getFontStretch(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_FONT_STRETCH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the spacing for the given `type` (see [enum TextServer.SpacingType]).
   */
  public fun getSpacing(spacing: TextServer.SpacingType): Long {
    TransferContext.writeArguments(LONG to spacing.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_SPACING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a set of OpenType feature tags. More info: [godot.OpenType feature tags](https://docs.microsoft.com/en-us/typography/opentype/spec/featuretags).
   */
  public fun getOpentypeFeatures(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_OPENTYPE_FEATURES,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Sets LRU cache capacity for `draw_*` methods.
   */
  public fun setCacheCapacity(singleLine: Long, multiLine: Long): Unit {
    TransferContext.writeArguments(LONG to singleLine, LONG to multiLine)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_SET_CACHE_CAPACITY, NIL)
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
  public fun getStringSize(
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Double = -1.0,
    fontSize: Long = 16,
    jstFlags: Long = 3,
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Vector2 {
    TransferContext.writeArguments(STRING to text, LONG to alignment.id, DOUBLE to width, LONG to fontSize, OBJECT to jstFlags, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_STRING_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the size of a bounding box of a string broken into the lines, taking kerning and advance into account.
   *
   * See also [drawMultilineString].
   */
  public fun getMultilineStringSize(
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Double = -1.0,
    fontSize: Long = 16,
    maxLines: Long = -1,
    brkFlags: Long = 3,
    jstFlags: Long = 3,
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Vector2 {
    TransferContext.writeArguments(STRING to text, LONG to alignment.id, DOUBLE to width, LONG to fontSize, LONG to maxLines, OBJECT to brkFlags, OBJECT to jstFlags, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_MULTILINE_STRING_SIZE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Draw [text] into a canvas item using the font, at a given position, with [modulate] color, optionally clipping the width and aligning horizontally. [pos] specifies the baseline, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * See also [godot.CanvasItem.drawString].
   */
  public fun drawString(
    canvasItem: RID,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Double = -1.0,
    fontSize: Long = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    jstFlags: Long = 3,
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width, LONG to fontSize, COLOR to modulate, OBJECT to jstFlags, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_DRAW_STRING, NIL)
  }

  /**
   * Breaks [text] into lines using rules specified by [brkFlags] and draws it into a canvas item using the font, at a given position, with [modulate] color, optionally clipping the width and aligning horizontally. [pos] specifies the baseline of the first line, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * See also [godot.CanvasItem.drawMultilineString].
   */
  public fun drawMultilineString(
    canvasItem: RID,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Double = -1.0,
    fontSize: Long = 16,
    maxLines: Long = -1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    brkFlags: Long = 3,
    jstFlags: Long = 3,
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width, LONG to fontSize, LONG to maxLines, COLOR to modulate, OBJECT to brkFlags, OBJECT to jstFlags, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_DRAW_MULTILINE_STRING, NIL)
  }

  /**
   * Draw [text] outline into a canvas item using the font, at a given position, with [modulate] color and [size] outline size, optionally clipping the width and aligning horizontally. [pos] specifies the baseline, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * See also [godot.CanvasItem.drawStringOutline].
   */
  public fun drawStringOutline(
    canvasItem: RID,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Double = -1.0,
    fontSize: Long = 16,
    size: Long = 1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    jstFlags: Long = 3,
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width, LONG to fontSize, LONG to size, COLOR to modulate, OBJECT to jstFlags, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_DRAW_STRING_OUTLINE, NIL)
  }

  /**
   * Breaks [text] to the lines using rules specified by [brkFlags] and draws text outline into a canvas item using the font, at a given position, with [modulate] color and [size] outline size, optionally clipping the width and aligning horizontally. [pos] specifies the baseline of the first line, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * See also [godot.CanvasItem.drawMultilineStringOutline].
   */
  public fun drawMultilineStringOutline(
    canvasItem: RID,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Double = -1.0,
    fontSize: Long = 16,
    maxLines: Long = -1,
    size: Long = 1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    brkFlags: Long = 3,
    jstFlags: Long = 3,
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width, LONG to fontSize, LONG to maxLines, LONG to size, COLOR to modulate, OBJECT to brkFlags, OBJECT to jstFlags, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_DRAW_MULTILINE_STRING_OUTLINE,
        NIL)
  }

  /**
   * Returns the size of a character, optionally taking kerning into account if the next character is provided.
   *
   * **Note:** Do not use this function to calculate width of the string character by character, use [getStringSize] or [godot.TextLine] instead. The height returned is the font height (see also [getHeight]) and has no relation to the glyph height.
   */
  public fun getCharSize(char: Long, fontSize: Long): Vector2 {
    TransferContext.writeArguments(LONG to char, LONG to fontSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_CHAR_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Draw a single Unicode character [char] into a canvas item using the font, at a given position, with [modulate] color. [pos] specifies the baseline, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * **Note:** Do not use this function to draw strings character by character, use [drawString] or [godot.TextLine] instead.
   */
  public fun drawChar(
    canvasItem: RID,
    pos: Vector2,
    char: Long,
    fontSize: Long,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Double {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, LONG to char, LONG to fontSize, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_DRAW_CHAR, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Draw a single Unicode character [char] outline into a canvas item using the font, at a given position, with [modulate] color and [size] outline size. [pos] specifies the baseline, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * **Note:** Do not use this function to draw strings character by character, use [drawString] or [godot.TextLine] instead.
   */
  public fun drawCharOutline(
    canvasItem: RID,
    pos: Vector2,
    char: Long,
    fontSize: Long,
    size: Long = -1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Double {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, LONG to char, LONG to fontSize, LONG to size, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_DRAW_CHAR_OUTLINE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns `true` if a Unicode [char] is available in the font.
   */
  public fun hasChar(char: Long): Boolean {
    TransferContext.writeArguments(LONG to char)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_HAS_CHAR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a string containing all the characters available in the font.
   *
   * If a given character is included in more than one font data source, it appears only once in the returned string.
   */
  public fun getSupportedChars(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_SUPPORTED_CHARS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true`, if font supports given language ([godot.ISO 639](https://en.wikipedia.org/wiki/ISO_639-1) code).
   */
  public fun isLanguageSupported(language: String): Boolean {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_IS_LANGUAGE_SUPPORTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true`, if font supports given script ([godot.ISO 15924](https://en.wikipedia.org/wiki/ISO_15924) code).
   */
  public fun isScriptSupported(script: String): Boolean {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_IS_SCRIPT_SUPPORTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns list of OpenType features supported by font.
   */
  public fun getSupportedFeatureList(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_SUPPORTED_FEATURE_LIST,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns list of supported [variation coordinates](https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg), each coordinate is returned as `tag: Vector3i(min_value,max_value,default_value)`.
   *
   * Font variations allow for continuous change of glyph characteristics along some given design axis, such as weight, width or slant.
   */
  public fun getSupportedVariationList(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_SUPPORTED_VARIATION_LIST,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns number of faces in the TrueType / OpenType collection.
   */
  public fun getFaceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_FACE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
