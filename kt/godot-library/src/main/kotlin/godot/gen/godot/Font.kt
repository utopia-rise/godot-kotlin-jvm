// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
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
 * Base class for fonts and font variations.
 *
 * Font is the abstract base class for font, so it shouldn't be used directly. Other types of fonts inherit from it.
 */
@GodotBaseType
public open class Font : Resource() {
  public var variationCoordinates: Dictionary<Any?, Any?>
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

  public fun addData(`data`: FontData): Unit {
    TransferContext.writeArguments(OBJECT to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_ADD_DATA, NIL)
  }

  public fun setData(idx: Long, `data`: FontData): Unit {
    TransferContext.writeArguments(LONG to idx, OBJECT to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_SET_DATA, NIL)
  }

  public fun getDataCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_DATA_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getData(idx: Long): FontData? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_DATA, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as FontData?
  }

  public fun getDataRid(idx: Long): RID {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_DATA_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  public fun clearData(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_CLEAR_DATA, NIL)
  }

  public fun removeData(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_REMOVE_DATA, NIL)
  }

  public fun setSpacing(spacing: TextServer.SpacingType, `value`: Long): Unit {
    TransferContext.writeArguments(LONG to spacing.id, LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_SET_SPACING, NIL)
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
   * Returns the total average font height (ascent plus descent) in pixels.
   *
   * **Note:** Real height of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate (e.g. as the height of empty line).
   */
  public fun getHeight(size: Long = 16): Double {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_HEIGHT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the average font ascent (number of pixels above the baseline).
   *
   * **Note:** Real ascent of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate (e.g. as the ascent of empty line).
   */
  public fun getAscent(size: Long = 16): Double {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_ASCENT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the average font descent (number of pixels below the baseline).
   *
   * **Note:** Real descent of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate (e.g. as the descent of empty line).
   */
  public fun getDescent(size: Long = 16): Double {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_DESCENT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns average pixel offset of the underline below the baseline.
   *
   * **Note:** Real underline position of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate.
   */
  public fun getUnderlinePosition(size: Long = 16): Double {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_UNDERLINE_POSITION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns average thickness of the underline.
   *
   * **Note:** Real underline thickness of the string is context-dependent and can be significantly different from the value returned by this function. Use it only as rough estimate.
   */
  public fun getUnderlineThickness(size: Long = 16): Double {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_UNDERLINE_THICKNESS,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the size of a bounding box of a single-line string, taking kerning and advance into account. See also [getMultilineStringSize] and [drawString].
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
   * **Note:** Real height of the string is context-dependent and can be significantly different from the value returned by [getHeight].
   */
  public fun getStringSize(
    text: String,
    size: Long = 16,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Double = -1.0,
    flags: Long = 3
  ): Vector2 {
    TransferContext.writeArguments(STRING to text, LONG to size, LONG to alignment.id, DOUBLE to width, LONG to flags)
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
    size: Long = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    outlineSize: Long = 0,
    outlineModulate: Color = Color(Color(1, 1, 1, 0)),
    flags: Long = 3
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width, LONG to size, COLOR to modulate, LONG to outlineSize, COLOR to outlineModulate, LONG to flags)
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
    maxLines: Long = -1,
    size: Long = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    outlineSize: Long = 0,
    outlineModulate: Color = Color(Color(1, 1, 1, 0)),
    flags: Long = 99
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width, LONG to maxLines, LONG to size, COLOR to modulate, LONG to outlineSize, COLOR to outlineModulate, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_DRAW_MULTILINE_STRING, NIL)
  }

  /**
   * Returns the size of a character, optionally taking kerning into account if the next character is provided.
   *
   * **Note:** Do not use this function to calculate width of the string character by character, use [getStringSize] or [godot.TextLine] instead. The height returned is the font height (see also [getHeight]) and has no relation to the glyph height.
   */
  public fun getCharSize(
    char: Long,
    next: Long = 0,
    size: Long = 16
  ): Vector2 {
    TransferContext.writeArguments(LONG to char, LONG to next, LONG to size)
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
    next: Long = 0,
    size: Long = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    outlineSize: Long = 0,
    outlineModulate: Color = Color(Color(1, 1, 1, 0))
  ): Double {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, LONG to char, LONG to next, LONG to size, COLOR to modulate, LONG to outlineSize, COLOR to outlineModulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_DRAW_CHAR, DOUBLE)
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

  public fun updateChanges(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_UPDATE_CHANGES, NIL)
  }

  /**
   * Returns [godot.Array] of valid [godot.Font] [RID]s, which can be passed to the [godot.TextServer] methods.
   */
  public fun getRids(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_RIDS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public companion object
}
