// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedFloat32Array
import godot.core.RID
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector2i
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Holds a paragraph of text.
 *
 * Abstraction over [godot.TextServer] for handling paragraph of text.
 */
@GodotBaseType
public open class TextParagraph : RefCounted() {
  /**
   * Text writing direction.
   */
  public open var direction: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_DIRECTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_DIRECTION, NIL)
    }

  /**
   * Custom punctuation character list, used for word breaking. If set to empty string, server defaults are used.
   */
  public open var customPunctuation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_CUSTOM_PUNCTUATION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_CUSTOM_PUNCTUATION, NIL)
    }

  /**
   * Text orientation.
   */
  public open var orientation: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_ORIENTATION,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_ORIENTATION,
          NIL)
    }

  /**
   * If set to `true` text will display invalid characters.
   */
  public open var preserveInvalid: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_PRESERVE_INVALID, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_PRESERVE_INVALID, NIL)
    }

  /**
   * If set to `true` text will display control characters.
   */
  public open var preserveControl: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_PRESERVE_CONTROL, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_PRESERVE_CONTROL, NIL)
    }

  /**
   * Paragraph horizontal alignment.
   */
  public open var alignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_ALIGNMENT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_ALIGNMENT, NIL)
    }

  /**
   * Line breaking and alignment rules. For more info see [godot.TextServer].
   */
  public open var flags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_FLAGS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_FLAGS, NIL)
    }

  /**
   * Sets the clipping behavior when the text exceeds the paragraph's set width. See [enum OverrunBehavior] for a description of all modes.
   */
  public open var textOverrunBehavior: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_TEXT_OVERRUN_BEHAVIOR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_TEXT_OVERRUN_BEHAVIOR, NIL)
    }

  /**
   * Paragraph width.
   */
  public open var width: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_WIDTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_WIDTH, NIL)
    }

  /**
   * Limits the lines of text shown.
   */
  public open var maxLinesVisible: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_MAX_LINES_VISIBLE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_MAX_LINES_VISIBLE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TEXTPARAGRAPH)
  }

  /**
   * Clears text paragraph (removes text and inline objects).
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_CLEAR, NIL)
  }

  /**
   * Overrides BiDi for the structured text.
   *
   * Override ranges should cover full source text without overlaps. BiDi algorithm will be used on each range separately.
   */
  public open fun setBidiOverride(`override`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to override)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_BIDI_OVERRIDE,
        NIL)
  }

  /**
   * Sets drop cap, overrides previously set drop cap. Drop cap (dropped capital) is a decorative element at the beginning of a paragraph that is larger than the rest of the text.
   */
  public open fun setDropcap(
    text: String,
    fonts: Font,
    size: Long,
    dropcapMargins: Rect2 = Rect2Rect2(0.0, 0.0, 0.0, 0.0),
    opentypeFeatures: Dictionary<Any?, Any?> = Dictionary(),
    language: String = ""
  ): Boolean {
    TransferContext.writeArguments(STRING to text, OBJECT to fonts, LONG to size, RECT2 to
        dropcapMargins, DICTIONARY to opentypeFeatures, STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_DROPCAP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes dropcap.
   */
  public open fun clearDropcap(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_CLEAR_DROPCAP, NIL)
  }

  /**
   * Adds text span and font to draw it.
   */
  public open fun addString(
    text: String,
    fonts: Font,
    size: Long,
    opentypeFeatures: Dictionary<Any?, Any?> = Dictionary(),
    language: String = "",
    meta: Any? = null
  ): Boolean {
    TransferContext.writeArguments(STRING to text, OBJECT to fonts, LONG to size, DICTIONARY to
        opentypeFeatures, STRING to language, ANY to meta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_ADD_STRING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Adds inline object to the text buffer, `key` must be unique. In the text, object is represented as `length` object replacement characters.
   */
  public open fun addObject(
    key: Any,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    length: Long = 1
  ): Boolean {
    TransferContext.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.id, LONG to
        length)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_ADD_OBJECT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets new size and alignment of embedded object.
   */
  public open fun resizeObject(
    key: Any,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER
  ): Boolean {
    TransferContext.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_RESIZE_OBJECT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Aligns paragraph to the given tab-stops.
   */
  public open fun tabAlign(tabStops: PackedFloat32Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_TAB_ALIGN, NIL)
  }

  /**
   * Returns the size of the bounding box of the paragraph, without line breaks.
   */
  public open fun getNonWrappedSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_NON_WRAPPED_SIZE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the size of the bounding box of the paragraph.
   */
  public open fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns TextServer full string buffer RID.
   */
  public open fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns TextServer line buffer RID.
   */
  public open fun getLineRid(line: Long): RID {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns drop cap text buffer RID.
   */
  public open fun getDropcapRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_DROPCAP_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns number of lines in the paragraph.
   */
  public open fun getLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns array of inline objects in the line.
   */
  public open fun getLineObjects(line: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_OBJECTS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns bounding rectangle of the inline object.
   */
  public open fun getLineObjectRect(line: Long, key: Any): Rect2 {
    TransferContext.writeArguments(LONG to line, ANY to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_OBJECT_RECT,
        RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns size of the bounding box of the line of text.
   */
  public open fun getLineSize(line: Long): Vector2 {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_SIZE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns character range of the line.
   */
  public open fun getLineRange(line: Long): Vector2i {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_RANGE,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the text line ascent (number of pixels above the baseline for horizontal layout or to the left of baseline for vertical).
   */
  public open fun getLineAscent(line: Long): Double {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_ASCENT,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the text line descent (number of pixels below the baseline for horizontal layout or to the right of baseline for vertical).
   */
  public open fun getLineDescent(line: Long): Double {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_DESCENT,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns width (for horizontal layout) or height (for vertical) of the line of text.
   */
  public open fun getLineWidth(line: Long): Double {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_WIDTH,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public open fun getLineUnderlinePosition(line: Long): Double {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_UNDERLINE_POSITION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns thickness of the underline.
   */
  public open fun getLineUnderlineThickness(line: Long): Double {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_UNDERLINE_THICKNESS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns extra spacing at the top of the line. See [godot.Font.spacingTop].
   */
  public open fun getSpacingTop(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_SPACING_TOP, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns extra spacing at the bottom of the line. See [godot.Font.spacingBottom].
   */
  public open fun getSpacingBottom(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_SPACING_BOTTOM,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns drop cap bounding box size.
   */
  public open fun getDropcapSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_DROPCAP_SIZE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns number of lines used by dropcap.
   */
  public open fun getDropcapLines(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_DROPCAP_LINES,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Draw all lines of the text and drop cap into a canvas item at a given position, with `color`. `pos` specifies the top left corner of the bounding box.
   */
  public open fun draw(
    canvas: RID,
    pos: Vector2,
    color: Color = Color(Color(1, 1, 1, 1)),
    dcColor: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, COLOR to color, COLOR to dcColor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_DRAW, NIL)
  }

  /**
   * Draw outlines of all lines of the text and drop cap into a canvas item at a given position, with `color`. `pos` specifies the top left corner of the bounding box.
   */
  public open fun drawOutline(
    canvas: RID,
    pos: Vector2,
    outlineSize: Long = 1,
    color: Color = Color(Color(1, 1, 1, 1)),
    dcColor: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to outlineSize, COLOR to
        color, COLOR to dcColor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_DRAW_OUTLINE, NIL)
  }

  /**
   * Draw single line of text into a canvas item at a given position, with `color`. `pos` specifies the top left corner of the bounding box.
   */
  public open fun drawLine(
    canvas: RID,
    pos: Vector2,
    line: Long,
    color: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to line, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_DRAW_LINE, NIL)
  }

  /**
   * Draw outline of the single line of text into a canvas item at a given position, with `color`. `pos` specifies the top left corner of the bounding box.
   */
  public open fun drawLineOutline(
    canvas: RID,
    pos: Vector2,
    line: Long,
    outlineSize: Long = 1,
    color: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to line, LONG to
        outlineSize, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_DRAW_LINE_OUTLINE,
        NIL)
  }

  /**
   * Draw drop cap into a canvas item at a given position, with `color`. `pos` specifies the top left corner of the bounding box.
   */
  public open fun drawDropcap(
    canvas: RID,
    pos: Vector2,
    color: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_DRAW_DROPCAP, NIL)
  }

  /**
   * Draw drop cap outline into a canvas item at a given position, with `color`. `pos` specifies the top left corner of the bounding box.
   */
  public open fun drawDropcapOutline(
    canvas: RID,
    pos: Vector2,
    outlineSize: Long = 1,
    color: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to outlineSize, COLOR to
        color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_DRAW_DROPCAP_OUTLINE,
        NIL)
  }

  /**
   * Returns caret character offset at the specified coordinates. This function always returns a valid position.
   */
  public open fun hitTest(coords: Vector2): Long {
    TransferContext.writeArguments(VECTOR2 to coords)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_HIT_TEST, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class OverrunBehavior(
    id: Long
  ) {
    /**
     * No text trimming is performed.
     */
    OVERRUN_NO_TRIMMING(0),
    /**
     * Trims the text per character.
     */
    OVERRUN_TRIM_CHAR(1),
    /**
     * Trims the text per word.
     */
    OVERRUN_TRIM_WORD(2),
    /**
     * Trims the text per character and adds an ellipsis to indicate that parts are hidden.
     */
    OVERRUN_TRIM_ELLIPSIS(3),
    /**
     * Trims the text per word and adds an ellipsis to indicate that parts are hidden.
     */
    OVERRUN_TRIM_WORD_ELLIPSIS(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
