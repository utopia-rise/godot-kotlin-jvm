// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.TextServer.JustificationFlagValue
import godot.TextServer.LineBreakFlagValue
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedFloat32Array
import godot.core.RID
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
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
 * Abstraction over [TextServer] for handling a single paragraph of text.
 */
@GodotBaseType
public open class TextParagraph : RefCounted() {
  /**
   * Text writing direction.
   */
  public var direction: TextServer.Direction
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDirectionPtr, LONG)
      return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDirectionPtr, NIL)
    }

  /**
   * Custom punctuation character list, used for word breaking. If set to empty string, server
   * defaults are used.
   */
  public var customPunctuation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomPunctuationPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomPunctuationPtr, NIL)
    }

  /**
   * Text orientation.
   */
  public var orientation: TextServer.Orientation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOrientationPtr, LONG)
      return TextServer.Orientation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOrientationPtr, NIL)
    }

  /**
   * If set to `true` text will display invalid characters.
   */
  public var preserveInvalid: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPreserveInvalidPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPreserveInvalidPtr, NIL)
    }

  /**
   * If set to `true` text will display control characters.
   */
  public var preserveControl: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPreserveControlPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPreserveControlPtr, NIL)
    }

  /**
   * Paragraph horizontal alignment.
   */
  public var alignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlignmentPtr, LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlignmentPtr, NIL)
    }

  /**
   * Line breaking rules. For more info see [TextServer].
   */
  public var breakFlags: TextServer.LineBreakFlag
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBreakFlagsPtr, LONG)
      return LineBreakFlagValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setBreakFlagsPtr, NIL)
    }

  /**
   * Line fill alignment rules. For more info see [TextServer.JustificationFlag].
   */
  public var justificationFlags: TextServer.JustificationFlag
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJustificationFlagsPtr, LONG)
      return JustificationFlagValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setJustificationFlagsPtr, NIL)
    }

  /**
   * Sets the clipping behavior when the text exceeds the paragraph's set width. See
   * [TextServer.OverrunBehavior] for a description of all modes.
   */
  public var textOverrunBehavior: TextServer.OverrunBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
      return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
    }

  /**
   * Ellipsis character used for text clipping.
   */
  public var ellipsisChar: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEllipsisCharPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEllipsisCharPtr, NIL)
    }

  /**
   * Paragraph width.
   */
  public var width: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWidthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
    }

  /**
   * Limits the lines of text shown.
   */
  public var maxLinesVisible: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxLinesVisiblePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxLinesVisiblePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TEXTPARAGRAPH, scriptIndex)
  }

  /**
   * Clears text paragraph (removes text and inline objects).
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Overrides BiDi for the structured text.
   * Override ranges should cover full source text without overlaps. BiDi algorithm will be used on
   * each range separately.
   */
  public fun setBidiOverride(`override`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to override)
    TransferContext.callMethod(rawPtr, MethodBindings.setBidiOverridePtr, NIL)
  }

  /**
   * Sets drop cap, overrides previously set drop cap. Drop cap (dropped capital) is a decorative
   * element at the beginning of a paragraph that is larger than the rest of the text.
   */
  @JvmOverloads
  public fun setDropcap(
    text: String,
    font: Font,
    fontSize: Int,
    dropcapMargins: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    language: String = "",
  ): Boolean {
    TransferContext.writeArguments(STRING to text, OBJECT to font, LONG to fontSize.toLong(), RECT2 to dropcapMargins, STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.setDropcapPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes dropcap.
   */
  public fun clearDropcap(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearDropcapPtr, NIL)
  }

  /**
   * Adds text span and font to draw it.
   */
  @JvmOverloads
  public fun addString(
    text: String,
    font: Font,
    fontSize: Int,
    language: String = "",
    meta: Any? = null,
  ): Boolean {
    TransferContext.writeArguments(STRING to text, OBJECT to font, LONG to fontSize.toLong(), STRING to language, ANY to meta)
    TransferContext.callMethod(rawPtr, MethodBindings.addStringPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds inline object to the text buffer, [key] must be unique. In the text, object is represented
   * as [length] object replacement characters.
   */
  @JvmOverloads
  public fun addObject(
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    length: Int = 1,
    baseline: Float = 0.0f,
  ): Boolean {
    TransferContext.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.id, LONG to length.toLong(), DOUBLE to baseline.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.addObjectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets new size and alignment of embedded object.
   */
  @JvmOverloads
  public fun resizeObject(
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    baseline: Float = 0.0f,
  ): Boolean {
    TransferContext.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.id, DOUBLE to baseline.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.resizeObjectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Aligns paragraph to the given tab-stops.
   */
  public fun tabAlign(tabStops: PackedFloat32Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.callMethod(rawPtr, MethodBindings.tabAlignPtr, NIL)
  }

  /**
   * Returns the size of the bounding box of the paragraph, without line breaks.
   */
  public fun getNonWrappedSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNonWrappedSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the size of the bounding box of the paragraph.
   */
  public fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns TextServer full string buffer RID.
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns TextServer line buffer RID.
   */
  public fun getLineRid(line: Int): RID {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns drop cap text buffer RID.
   */
  public fun getDropcapRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDropcapRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns number of lines in the paragraph.
   */
  public fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns array of inline objects in the line.
   */
  public fun getLineObjects(line: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineObjectsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns bounding rectangle of the inline object.
   */
  public fun getLineObjectRect(line: Int, key: Any?): Rect2 {
    TransferContext.writeArguments(LONG to line.toLong(), ANY to key)
    TransferContext.callMethod(rawPtr, MethodBindings.getLineObjectRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Returns size of the bounding box of the line of text. Returned size is rounded up.
   */
  public fun getLineSize(line: Int): Vector2 {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns character range of the line.
   */
  public fun getLineRange(line: Int): Vector2i {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineRangePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns the text line ascent (number of pixels above the baseline for horizontal layout or to
   * the left of baseline for vertical).
   */
  public fun getLineAscent(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineAscentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the text line descent (number of pixels below the baseline for horizontal layout or to
   * the right of baseline for vertical).
   */
  public fun getLineDescent(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineDescentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns width (for horizontal layout) or height (for vertical) of the line of text.
   */
  public fun getLineWidth(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public fun getLineUnderlinePosition(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineUnderlinePositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns thickness of the underline.
   */
  public fun getLineUnderlineThickness(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineUnderlineThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns drop cap bounding box size.
   */
  public fun getDropcapSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDropcapSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns number of lines used by dropcap.
   */
  public fun getDropcapLines(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDropcapLinesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Draw all lines of the text and drop cap into a canvas item at a given position, with [color].
   * [pos] specifies the top left corner of the bounding box.
   */
  @JvmOverloads
  public fun draw(
    canvas: RID,
    pos: Vector2,
    color: Color = Color(Color(1, 1, 1, 1)),
    dcColor: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, COLOR to color, COLOR to dcColor)
    TransferContext.callMethod(rawPtr, MethodBindings.drawPtr, NIL)
  }

  /**
   * Draw outlines of all lines of the text and drop cap into a canvas item at a given position,
   * with [color]. [pos] specifies the top left corner of the bounding box.
   */
  @JvmOverloads
  public fun drawOutline(
    canvas: RID,
    pos: Vector2,
    outlineSize: Int = 1,
    color: Color = Color(Color(1, 1, 1, 1)),
    dcColor: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to outlineSize.toLong(), COLOR to color, COLOR to dcColor)
    TransferContext.callMethod(rawPtr, MethodBindings.drawOutlinePtr, NIL)
  }

  /**
   * Draw single line of text into a canvas item at a given position, with [color]. [pos] specifies
   * the top left corner of the bounding box.
   */
  @JvmOverloads
  public fun drawLine(
    canvas: RID,
    pos: Vector2,
    line: Int,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to line.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawLinePtr, NIL)
  }

  /**
   * Draw outline of the single line of text into a canvas item at a given position, with [color].
   * [pos] specifies the top left corner of the bounding box.
   */
  @JvmOverloads
  public fun drawLineOutline(
    canvas: RID,
    pos: Vector2,
    line: Int,
    outlineSize: Int = 1,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to line.toLong(), LONG to outlineSize.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawLineOutlinePtr, NIL)
  }

  /**
   * Draw drop cap into a canvas item at a given position, with [color]. [pos] specifies the top
   * left corner of the bounding box.
   */
  @JvmOverloads
  public fun drawDropcap(
    canvas: RID,
    pos: Vector2,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawDropcapPtr, NIL)
  }

  /**
   * Draw drop cap outline into a canvas item at a given position, with [color]. [pos] specifies the
   * top left corner of the bounding box.
   */
  @JvmOverloads
  public fun drawDropcapOutline(
    canvas: RID,
    pos: Vector2,
    outlineSize: Int = 1,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to outlineSize.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawDropcapOutlinePtr, NIL)
  }

  /**
   * Returns caret character offset at the specified coordinates. This function always returns a
   * valid position.
   */
  public fun hitTest(coords: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.hitTestPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "clear")

    public val setDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_direction")

    public val getDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_direction")

    public val setCustomPunctuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_custom_punctuation")

    public val getCustomPunctuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_custom_punctuation")

    public val setOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_orientation")

    public val getOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_orientation")

    public val setPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_preserve_invalid")

    public val getPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_preserve_invalid")

    public val setPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_preserve_control")

    public val getPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_preserve_control")

    public val setBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_bidi_override")

    public val setDropcapPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "set_dropcap")

    public val clearDropcapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "clear_dropcap")

    public val addStringPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "add_string")

    public val addObjectPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "add_object")

    public val resizeObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "resize_object")

    public val setAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_alignment")

    public val getAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_alignment")

    public val tabAlignPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "tab_align")

    public val setBreakFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_break_flags")

    public val getBreakFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_break_flags")

    public val setJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_justification_flags")

    public val getJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_justification_flags")

    public val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_text_overrun_behavior")

    public val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_text_overrun_behavior")

    public val setEllipsisCharPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_ellipsis_char")

    public val getEllipsisCharPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_ellipsis_char")

    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "set_width")

    public val getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "get_width")

    public val getNonWrappedSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_non_wrapped_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "get_size")

    public val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "get_rid")

    public val getLineRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_rid")

    public val getDropcapRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_dropcap_rid")

    public val getLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_count")

    public val setMaxLinesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_max_lines_visible")

    public val getMaxLinesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_max_lines_visible")

    public val getLineObjectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_objects")

    public val getLineObjectRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_object_rect")

    public val getLineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_size")

    public val getLineRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_range")

    public val getLineAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_ascent")

    public val getLineDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_descent")

    public val getLineWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_width")

    public val getLineUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_underline_position")

    public val getLineUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_underline_thickness")

    public val getDropcapSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_dropcap_size")

    public val getDropcapLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_dropcap_lines")

    public val drawPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "draw")

    public val drawOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "draw_outline")

    public val drawLinePtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "draw_line")

    public val drawLineOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "draw_line_outline")

    public val drawDropcapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "draw_dropcap")

    public val drawDropcapOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "draw_dropcap_outline")

    public val hitTestPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "hit_test")
  }
}
