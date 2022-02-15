// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Font class is set of font data sources used to draw text.
 *
 * Font contains a set of glyphs to represent Unicode characters, as well as the ability to draw it with variable width, ascent, descent and kerning.
 *
 * **Note:** A character is a symbol that represents an item (letter, digit etc.) in an abstract way.
 *
 * **Note:** A glyph is a bitmap or shape used to draw a one or more characters in a context-dependent manner. Glyph indices are bound to the specific font data source.
 *
 * **Note:** If a non of the font data sources contain glyphs for a character used in a string, the character in question will be replaced with a box displaying its hexadecimal code.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var font = Font.new()
 *
 * font.add_data(load("res://BarlowCondensed-Bold.ttf"))
 *
 * $"Label".set("custom_fonts/font", font)
 *
 * $"Label".set("custom_fonts/font_size", 64)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var font = new Font();
 *
 * font.AddData(ResourceLoader.Load<FontData>("res://BarlowCondensed-Bold.ttf"));
 *
 * GetNode("Label").Set("custom_fonts/font", font);
 *
 * GetNode("Label").Set("custom_font_sizes/font_size", 64);
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * To control font substitution priority use [godot.FontData] language and script support.
 *
 * Use language overrides to use same [godot.Font] stack for multiple languages:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # Use Naskh font for Persian and Nastaʼlīq font for Urdu text.
 *
 * var font_data_fa = load("res://NotoNaskhArabicUI_Regular.ttf");
 *
 * font_data_fa.set_language_support_override("fa", true);
 *
 * font_data_fa.set_language_support_override("ur", false);
 *
 *
 *
 * var font_data_ur = load("res://NotoNastaliqUrdu_Regular.ttf");
 *
 * font_data_ur.set_language_support_override("fa", false);
 *
 * font_data_ur.set_language_support_override("ur", true);
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // Use Naskh font for Persian and Nastaʼlīq font for Urdu text.
 *
 * var fontDataFA = ResourceLoader.Load<FontData>("res://NotoNaskhArabicUI_Regular.ttf");
 *
 * fontDataFA.SetLanguageSupportOverride("fa", true);
 *
 * fontDataFA.SetLanguageSupportOverride("ur", false);
 *
 *
 *
 * var fontDataUR = ResourceLoader.Load<FontData>("res://NotoNastaliqUrdu_Regular.ttf");
 *
 * fontDataUR.SetLanguageSupportOverride("fa", false);
 *
 * fontDataUR.SetLanguageSupportOverride("ur", true);
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * Use script overrides to specify supported scripts for bitmap font or for less common scripts not directly supported by TrueType format:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # Use specified font for Egyptian hieroglyphs.
 *
 * var font_data = load("res://unifont.ttf");
 *
 * font_data.set_script_support_override("Egyp", true);
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // Use specified font for Egyptian hieroglyphs.
 *
 * var fontData = ResourceLoader.Load<FontData>("res://unifont.ttf");
 *
 * fontData.SetScriptSupportOverride("Egyp", true);
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class Font : Resource() {
  /**
   * Default font [variation coordinates](https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg).
   */
  public open var variationCoordinates: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_VARIATION_COORDINATES,
          DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_SET_VARIATION_COORDINATES,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_FONT)
  }

  /**
   * Add font data source to the set.
   */
  public open fun addData(`data`: FontData): Unit {
    TransferContext.writeArguments(OBJECT to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_ADD_DATA, NIL)
  }

  /**
   * Sets the font data source at index `idx`. If the index does not exist, nothing happens.
   */
  public open fun setData(idx: Long, `data`: FontData): Unit {
    TransferContext.writeArguments(LONG to idx, OBJECT to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_SET_DATA, NIL)
  }

  /**
   * Returns the number of font data sources.
   */
  public open fun getDataCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_DATA_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the font data source at index `idx`. If the index does not exist, returns `null`.
   */
  public open fun getData(idx: Long): FontData? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_DATA, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as FontData?
  }

  /**
   * Returns TextServer RID of the font data resources.
   */
  public open fun getDataRid(idx: Long): RID {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_DATA_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Removes all font data sourcers for the set.
   */
  public open fun clearData(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_CLEAR_DATA, NIL)
  }

  /**
   * Removes the font data source at index `idx`. If the index does not exist, nothing happens.
   */
  public open fun removeData(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_REMOVE_DATA, NIL)
  }

  /**
   * Sets the spacing for `type` (see [enum TextServer.SpacingType]) to `value` in pixels (not relative to the font size).
   */
  public open fun setSpacing(spacing: TextServer.SpacingType, `value`: Long): Unit {
    TransferContext.writeArguments(LONG to spacing.id, LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_SET_SPACING, NIL)
  }

  /**
   * Returns the spacing for the given `type` (see [enum TextServer.SpacingType]).
   */
  public open fun getSpacing(spacing: TextServer.SpacingType): Long {
    TransferContext.writeArguments(LONG to spacing.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_SPACING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total average font height (ascent plus descent) in pixels.
   *
   * **Note:** Real height of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate (e.g. as the height of empty line).
   */
  public open fun getHeight(size: Long = 16): Double {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_HEIGHT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the average font ascent (number of pixels above the baseline).
   *
   * **Note:** Real ascent of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate (e.g. as the ascent of empty line).
   */
  public open fun getAscent(size: Long = 16): Double {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_ASCENT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the average font descent (number of pixels below the baseline).
   *
   * **Note:** Real descent of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate (e.g. as the descent of empty line).
   */
  public open fun getDescent(size: Long = 16): Double {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_DESCENT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns average pixel offset of the underline below the baseline.
   *
   * **Note:** Real underline position of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate.
   */
  public open fun getUnderlinePosition(size: Long = 16): Double {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_UNDERLINE_POSITION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns average thickness of the underline.
   *
   * **Note:** Real underline thickness of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate.
   */
  public open fun getUnderlineThickness(size: Long = 16): Double {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_UNDERLINE_THICKNESS,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the size of a bounding box of a string, taking kerning and advance into account.
   *
   * **Note:** Real height of the string is context-dependent and can be significantly different from the value returned by [getHeight].
   *
   * See also [drawString].
   */
  public open fun getStringSize(
    text: String,
    size: Long = 16,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Double = -1.0,
    flags: Long = 3
  ): Vector2 {
    TransferContext.writeArguments(STRING to text, LONG to size, LONG to alignment.id, DOUBLE to
        width, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_STRING_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the size of a bounding box of a string broken into the lines, taking kerning and advance into account.
   *
   * See also [drawMultilineString].
   */
  public open fun getMultilineStringSize(
    text: String,
    width: Double = -1.0,
    size: Long = 16,
    flags: Long = 96
  ): Vector2 {
    TransferContext.writeArguments(STRING to text, DOUBLE to width, LONG to size, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_MULTILINE_STRING_SIZE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Draw `text` into a canvas item using the font, at a given position, with `modulate` color, optionally clipping the width and aligning horizontally. `position` specifies the baseline, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * See also [godot.CanvasItem.drawString].
   */
  public open fun drawString(
    canvasItem: RID,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Double = -1.0,
    size: Long = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    outlineSize: Long = 0,
    outlineModulate: Color = Color(Color(1, 1, 1, 0)),
    flags: Long = 3
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to
        alignment.id, DOUBLE to width, LONG to size, COLOR to modulate, LONG to outlineSize, COLOR
        to outlineModulate, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_DRAW_STRING, NIL)
  }

  /**
   * Breaks `text` to the lines using rules specified by `flags` and draws it into a canvas item using the font, at a given position, with `modulate` color, optionally clipping the width and aligning horizontally. `position` specifies the baseline of the first line, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * See also [godot.CanvasItem.drawMultilineString].
   */
  public open fun drawMultilineString(
    canvasItem: RID,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Double = -1.0,
    maxLines: Long = -1,
    size: Long = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    outlineSize: Long = 0,
    outlineModulate: Color = Color(Color(1, 1, 1, 0)),
    flags: Long = 99
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to
        alignment.id, DOUBLE to width, LONG to maxLines, LONG to size, COLOR to modulate, LONG to
        outlineSize, COLOR to outlineModulate, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_DRAW_MULTILINE_STRING, NIL)
  }

  /**
   * Returns the size of a character, optionally taking kerning into account if the next character is provided.
   *
   * **Note:** Do not use this function to calculate width of the string character by character, use [getStringSize] or [godot.TextLine] instead. The height returned is the font height (see also [getHeight]) and has no relation to the glyph height.
   */
  public open fun getCharSize(
    char: Long,
    next: Long = 0,
    size: Long = 16
  ): Vector2 {
    TransferContext.writeArguments(LONG to char, LONG to next, LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_CHAR_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Draw a single Unicode character `char` into a canvas item using the font, at a given position, with `modulate` color, and optionally kerning if `next` is passed. `position` specifies the baseline, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * **Note:** Do not use this function to draw strings character by character, use [drawString] or [godot.TextLine] instead.
   */
  public open fun drawChar(
    canvasItem: RID,
    pos: Vector2,
    char: Long,
    next: Long = 0,
    size: Long = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    outlineSize: Long = 0,
    outlineModulate: Color = Color(Color(1, 1, 1, 0))
  ): Double {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, LONG to char, LONG to next,
        LONG to size, COLOR to modulate, LONG to outlineSize, COLOR to outlineModulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_DRAW_CHAR, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns `true` if a Unicode `char` is available in the font.
   */
  public open fun hasChar(char: Long): Boolean {
    TransferContext.writeArguments(LONG to char)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_HAS_CHAR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a string containing all the characters available in the font.
   *
   * If a given character is included in more than one font data source, it appears only once in the returned string.
   */
  public open fun getSupportedChars(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_SUPPORTED_CHARS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * After editing a font (changing data sources, etc.). Call this function to propagate changes to controls that might use it.
   */
  public open fun updateChanges(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_UPDATE_CHANGES, NIL)
  }

  public companion object
}
