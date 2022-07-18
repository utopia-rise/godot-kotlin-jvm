// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
  public var direction: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_DIRECTION,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_DIRECTION,
          NIL.ordinal)
    }

  /**
   * Custom punctuation character list, used for word breaking. If set to empty string, server defaults are used.
   */
  public var customPunctuation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_CUSTOM_PUNCTUATION,
          STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_CUSTOM_PUNCTUATION,
          NIL.ordinal)
    }

  /**
   * Text orientation.
   */
  public var orientation: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_ORIENTATION,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_ORIENTATION,
          NIL.ordinal)
    }

  /**
   * If set to `true` text will display invalid characters.
   */
  public var preserveInvalid: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_PRESERVE_INVALID,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_PRESERVE_INVALID,
          NIL.ordinal)
    }

  /**
   * If set to `true` text will display control characters.
   */
  public var preserveControl: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_PRESERVE_CONTROL,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_PRESERVE_CONTROL,
          NIL.ordinal)
    }

  /**
   * Paragraph horizontal alignment.
   */
  public var alignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_ALIGNMENT,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_ALIGNMENT,
          NIL.ordinal)
    }

  public var flags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_FLAGS, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_FLAGS, NIL.ordinal)
    }

  /**
   * Sets the clipping behavior when the text exceeds the paragraph's set width. See [enum TextServer.OverrunBehavior] for a description of all modes.
   */
  public var textOverrunBehavior: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_TEXT_OVERRUN_BEHAVIOR, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_TEXT_OVERRUN_BEHAVIOR, NIL.ordinal)
    }

  /**
   * Paragraph width.
   */
  public var width: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_WIDTH,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_WIDTH, NIL.ordinal)
    }

  /**
   * Limits the lines of text shown.
   */
  public var maxLinesVisible: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_MAX_LINES_VISIBLE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_MAX_LINES_VISIBLE,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TEXTPARAGRAPH)
  }

  /**
   * Clears text paragraph (removes text and inline objects).
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_CLEAR, NIL.ordinal)
  }

  /**
   * Overrides BiDi for the structured text.
   *
   * Override ranges should cover full source text without overlaps. BiDi algorithm will be used on each range separately.
   */
  public fun setBidiOverride(`override`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to override)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_BIDI_OVERRIDE,
        NIL.ordinal)
  }

  /**
   * Sets drop cap, overrides previously set drop cap. Drop cap (dropped capital) is a decorative element at the beginning of a paragraph that is larger than the rest of the text.
   */
  public fun setDropcap(
    text: String,
    fonts: Font,
    size: Long,
    dropcapMargins: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    opentypeFeatures: Dictionary<Any?, Any?> = Dictionary(),
    language: String = ""
  ): Boolean {
    TransferContext.writeArguments(STRING to text, OBJECT to fonts, LONG to size, RECT2 to dropcapMargins, DICTIONARY to opentypeFeatures, STRING to language)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_SET_DROPCAP, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes dropcap.
   */
  public fun clearDropcap(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_CLEAR_DROPCAP, NIL.ordinal)
  }

  /**
   * Adds text span and font to draw it.
   */
  public fun addString(
    text: String,
    fonts: Font,
    size: Long,
    opentypeFeatures: Dictionary<Any?, Any?> = Dictionary(),
    language: String = "",
    meta: Any? = null
  ): Boolean {
    TransferContext.writeArguments(STRING to text, OBJECT to fonts, LONG to size, DICTIONARY to opentypeFeatures, STRING to language, ANY to meta)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_ADD_STRING, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Adds inline object to the text buffer, `key` must be unique. In the text, object is represented as `length` object replacement characters.
   */
  public fun addObject(
    key: Any,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    length: Long = 1
  ): Boolean {
    TransferContext.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.id, LONG to length)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_ADD_OBJECT, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets new size and alignment of embedded object.
   */
  public fun resizeObject(
    key: Any,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER
  ): Boolean {
    TransferContext.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_RESIZE_OBJECT,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Aligns paragraph to the given tab-stops.
   */
  public fun tabAlign(tabStops: PackedFloat32Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_TAB_ALIGN, NIL.ordinal)
  }

  /**
   * Returns the size of the bounding box of the paragraph, without line breaks.
   */
  public fun getNonWrappedSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_NON_WRAPPED_SIZE,
        VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the size of the bounding box of the paragraph.
   */
  public fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_SIZE, VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns TextServer full string buffer RID.
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_RID, _RID.ordinal)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns TextServer line buffer RID.
   */
  public fun getLineRid(line: Long): RID {
    TransferContext.writeArguments(LONG to line)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_RID, _RID.ordinal)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns drop cap text buffer RID.
   */
  public fun getDropcapRid(): RID {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_DROPCAP_RID,
        _RID.ordinal)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns number of lines in the paragraph.
   */
  public fun getLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_COUNT,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns array of inline objects in the line.
   */
  public fun getLineObjects(line: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to line)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_OBJECTS,
        ARRAY.ordinal)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns bounding rectangle of the inline object.
   */
  public fun getLineObjectRect(line: Long, key: Any): Rect2 {
    TransferContext.writeArguments(LONG to line, ANY to key)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_OBJECT_RECT,
        RECT2.ordinal)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns size of the bounding box of the line of text.
   */
  public fun getLineSize(line: Long): Vector2 {
    TransferContext.writeArguments(LONG to line)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_SIZE,
        VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns character range of the line.
   */
  public fun getLineRange(line: Long): Vector2i {
    TransferContext.writeArguments(LONG to line)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_RANGE,
        VECTOR2I.ordinal)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the text line ascent (number of pixels above the baseline for horizontal layout or to the left of baseline for vertical).
   */
  public fun getLineAscent(line: Long): Double {
    TransferContext.writeArguments(LONG to line)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_ASCENT,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the text line descent (number of pixels below the baseline for horizontal layout or to the right of baseline for vertical).
   */
  public fun getLineDescent(line: Long): Double {
    TransferContext.writeArguments(LONG to line)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_DESCENT,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns width (for horizontal layout) or height (for vertical) of the line of text.
   */
  public fun getLineWidth(line: Long): Double {
    TransferContext.writeArguments(LONG to line)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_WIDTH,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public fun getLineUnderlinePosition(line: Long): Double {
    TransferContext.writeArguments(LONG to line)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_UNDERLINE_POSITION, DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns thickness of the underline.
   */
  public fun getLineUnderlineThickness(line: Long): Double {
    TransferContext.writeArguments(LONG to line)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_LINE_UNDERLINE_THICKNESS, DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getSpacingTop(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_SPACING_TOP,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getSpacingBottom(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_SPACING_BOTTOM,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns drop cap bounding box size.
   */
  public fun getDropcapSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_DROPCAP_SIZE,
        VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns number of lines used by dropcap.
   */
  public fun getDropcapLines(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_GET_DROPCAP_LINES,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Draw all lines of the text and drop cap into a canvas item at a given position, with `color`. `pos` specifies the top left corner of the bounding box.
   */
  public fun draw(
    canvas: RID,
    pos: Vector2,
    color: Color = Color(Color(1, 1, 1, 1)),
    dcColor: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, COLOR to color, COLOR to dcColor)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_DRAW, NIL.ordinal)
  }

  /**
   * Draw outlines of all lines of the text and drop cap into a canvas item at a given position, with `color`. `pos` specifies the top left corner of the bounding box.
   */
  public fun drawOutline(
    canvas: RID,
    pos: Vector2,
    outlineSize: Long = 1,
    color: Color = Color(Color(1, 1, 1, 1)),
    dcColor: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to outlineSize, COLOR to color, COLOR to dcColor)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_DRAW_OUTLINE, NIL.ordinal)
  }

  /**
   * Draw single line of text into a canvas item at a given position, with `color`. `pos` specifies the top left corner of the bounding box.
   */
  public fun drawLine(
    canvas: RID,
    pos: Vector2,
    line: Long,
    color: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to line, COLOR to color)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_DRAW_LINE, NIL.ordinal)
  }

  /**
   * Draw outline of the single line of text into a canvas item at a given position, with `color`. `pos` specifies the top left corner of the bounding box.
   */
  public fun drawLineOutline(
    canvas: RID,
    pos: Vector2,
    line: Long,
    outlineSize: Long = 1,
    color: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to line, LONG to outlineSize, COLOR to color)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_DRAW_LINE_OUTLINE,
        NIL.ordinal)
  }

  /**
   * Draw drop cap into a canvas item at a given position, with `color`. `pos` specifies the top left corner of the bounding box.
   */
  public fun drawDropcap(
    canvas: RID,
    pos: Vector2,
    color: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, COLOR to color)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_DRAW_DROPCAP, NIL.ordinal)
  }

  /**
   * Draw drop cap outline into a canvas item at a given position, with `color`. `pos` specifies the top left corner of the bounding box.
   */
  public fun drawDropcapOutline(
    canvas: RID,
    pos: Vector2,
    outlineSize: Long = 1,
    color: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to outlineSize, COLOR to color)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_DRAW_DROPCAP_OUTLINE,
        NIL.ordinal)
  }

  /**
   * Returns caret character offset at the specified coordinates. This function always returns a valid position.
   */
  public fun hitTest(coords: Vector2): Long {
    TransferContext.writeArguments(VECTOR2 to coords)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTPARAGRAPH_HIT_TEST, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class OverrunBehavior(
    id: Long
  ) {
    OVERRUN_NO_TRIMMING(0),
    OVERRUN_TRIM_CHAR(1),
    OVERRUN_TRIM_WORD(2),
    OVERRUN_TRIM_ELLIPSIS(3),
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
