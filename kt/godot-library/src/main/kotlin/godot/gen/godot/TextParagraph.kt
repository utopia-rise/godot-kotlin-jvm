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
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * Abstraction over [TextServer] for handling a single paragraph of text.
 */
@GodotBaseType
public open class TextParagraph : RefCounted() {
  /**
   * Text writing direction.
   */
  public final inline var direction: TextServer.Direction
    @JvmName("directionProperty")
    get() = getDirection()
    @JvmName("directionProperty")
    set(`value`) {
      setDirection(value)
    }

  /**
   * Custom punctuation character list, used for word breaking. If set to empty string, server
   * defaults are used.
   */
  public final inline var customPunctuation: String
    @JvmName("customPunctuationProperty")
    get() = getCustomPunctuation()
    @JvmName("customPunctuationProperty")
    set(`value`) {
      setCustomPunctuation(value)
    }

  /**
   * Text orientation.
   */
  public final inline var orientation: TextServer.Orientation
    @JvmName("orientationProperty")
    get() = getOrientation()
    @JvmName("orientationProperty")
    set(`value`) {
      setOrientation(value)
    }

  /**
   * If set to `true` text will display invalid characters.
   */
  public final inline var preserveInvalid: Boolean
    @JvmName("preserveInvalidProperty")
    get() = getPreserveInvalid()
    @JvmName("preserveInvalidProperty")
    set(`value`) {
      setPreserveInvalid(value)
    }

  /**
   * If set to `true` text will display control characters.
   */
  public final inline var preserveControl: Boolean
    @JvmName("preserveControlProperty")
    get() = getPreserveControl()
    @JvmName("preserveControlProperty")
    set(`value`) {
      setPreserveControl(value)
    }

  /**
   * Paragraph horizontal alignment.
   */
  public final inline var alignment: HorizontalAlignment
    @JvmName("alignmentProperty")
    get() = getAlignment()
    @JvmName("alignmentProperty")
    set(`value`) {
      setAlignment(value)
    }

  /**
   * Line breaking rules. For more info see [TextServer].
   */
  public final inline var breakFlags: TextServer.LineBreakFlag
    @JvmName("breakFlagsProperty")
    get() = getBreakFlags()
    @JvmName("breakFlagsProperty")
    set(`value`) {
      setBreakFlags(value)
    }

  /**
   * Line fill alignment rules. For more info see [TextServer.JustificationFlag].
   */
  public final inline var justificationFlags: TextServer.JustificationFlag
    @JvmName("justificationFlagsProperty")
    get() = getJustificationFlags()
    @JvmName("justificationFlagsProperty")
    set(`value`) {
      setJustificationFlags(value)
    }

  /**
   * Sets the clipping behavior when the text exceeds the paragraph's set width. See
   * [TextServer.OverrunBehavior] for a description of all modes.
   */
  public final inline var textOverrunBehavior: TextServer.OverrunBehavior
    @JvmName("textOverrunBehaviorProperty")
    get() = getTextOverrunBehavior()
    @JvmName("textOverrunBehaviorProperty")
    set(`value`) {
      setTextOverrunBehavior(value)
    }

  /**
   * Ellipsis character used for text clipping.
   */
  public final inline var ellipsisChar: String
    @JvmName("ellipsisCharProperty")
    get() = getEllipsisChar()
    @JvmName("ellipsisCharProperty")
    set(`value`) {
      setEllipsisChar(value)
    }

  /**
   * Paragraph width.
   */
  public final inline var width: Float
    @JvmName("widthProperty")
    get() = getWidth()
    @JvmName("widthProperty")
    set(`value`) {
      setWidth(value)
    }

  /**
   * Limits the lines of text shown.
   */
  public final inline var maxLinesVisible: Int
    @JvmName("maxLinesVisibleProperty")
    get() = getMaxLinesVisible()
    @JvmName("maxLinesVisibleProperty")
    set(`value`) {
      setMaxLinesVisible(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TEXTPARAGRAPH, scriptIndex)
  }

  /**
   * Clears text paragraph (removes text and inline objects).
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public final fun setDirection(direction: TextServer.Direction): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setDirectionPtr, NIL)
  }

  public final fun getDirection(): TextServer.Direction {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDirectionPtr, LONG)
    return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCustomPunctuation(customPunctuation: String): Unit {
    TransferContext.writeArguments(STRING to customPunctuation)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomPunctuationPtr, NIL)
  }

  public final fun getCustomPunctuation(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomPunctuationPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public final fun setOrientation(orientation: TextServer.Orientation): Unit {
    TransferContext.writeArguments(LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setOrientationPtr, NIL)
  }

  public final fun getOrientation(): TextServer.Orientation {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOrientationPtr, LONG)
    return TextServer.Orientation.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPreserveInvalid(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setPreserveInvalidPtr, NIL)
  }

  public final fun getPreserveInvalid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPreserveInvalidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setPreserveControl(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setPreserveControlPtr, NIL)
  }

  public final fun getPreserveControl(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPreserveControlPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Overrides BiDi for the structured text.
   * Override ranges should cover full source text without overlaps. BiDi algorithm will be used on
   * each range separately.
   */
  public final fun setBidiOverride(`override`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to override)
    TransferContext.callMethod(rawPtr, MethodBindings.setBidiOverridePtr, NIL)
  }

  /**
   * Sets drop cap, overrides previously set drop cap. Drop cap (dropped capital) is a decorative
   * element at the beginning of a paragraph that is larger than the rest of the text.
   */
  @JvmOverloads
  public final fun setDropcap(
    text: String,
    font: Font?,
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
  public final fun clearDropcap(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearDropcapPtr, NIL)
  }

  /**
   * Adds text span and font to draw it.
   */
  @JvmOverloads
  public final fun addString(
    text: String,
    font: Font?,
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
  public final fun addObject(
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
  public final fun resizeObject(
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    baseline: Float = 0.0f,
  ): Boolean {
    TransferContext.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.id, DOUBLE to baseline.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.resizeObjectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setAlignment(alignment: HorizontalAlignment): Unit {
    TransferContext.writeArguments(LONG to alignment.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setAlignmentPtr, NIL)
  }

  public final fun getAlignment(): HorizontalAlignment {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAlignmentPtr, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Aligns paragraph to the given tab-stops.
   */
  public final fun tabAlign(tabStops: PackedFloat32Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.callMethod(rawPtr, MethodBindings.tabAlignPtr, NIL)
  }

  public final fun setBreakFlags(flags: TextServer.LineBreakFlag): Unit {
    TransferContext.writeArguments(LONG to flags.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.setBreakFlagsPtr, NIL)
  }

  public final fun getBreakFlags(): TextServer.LineBreakFlag {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBreakFlagsPtr, LONG)
    return LineBreakFlagValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setJustificationFlags(flags: TextServer.JustificationFlag): Unit {
    TransferContext.writeArguments(LONG to flags.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.setJustificationFlagsPtr, NIL)
  }

  public final fun getJustificationFlags(): TextServer.JustificationFlag {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJustificationFlagsPtr, LONG)
    return JustificationFlagValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTextOverrunBehavior(overrunBehavior: TextServer.OverrunBehavior): Unit {
    TransferContext.writeArguments(LONG to overrunBehavior.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
  }

  public final fun getTextOverrunBehavior(): TextServer.OverrunBehavior {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
    return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setEllipsisChar(char: String): Unit {
    TransferContext.writeArguments(STRING to char)
    TransferContext.callMethod(rawPtr, MethodBindings.setEllipsisCharPtr, NIL)
  }

  public final fun getEllipsisChar(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEllipsisCharPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public final fun setWidth(width: Float): Unit {
    TransferContext.writeArguments(DOUBLE to width.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun getWidth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the size of the bounding box of the paragraph, without line breaks.
   */
  public final fun getNonWrappedSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNonWrappedSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the size of the bounding box of the paragraph.
   */
  public final fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns TextServer full string buffer RID.
   */
  public final fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns TextServer line buffer RID.
   */
  public final fun getLineRid(line: Int): RID {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns drop cap text buffer RID.
   */
  public final fun getDropcapRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDropcapRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns number of lines in the paragraph.
   */
  public final fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public final fun setMaxLinesVisible(maxLinesVisible: Int): Unit {
    TransferContext.writeArguments(LONG to maxLinesVisible.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setMaxLinesVisiblePtr, NIL)
  }

  public final fun getMaxLinesVisible(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxLinesVisiblePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns array of inline objects in the line.
   */
  public final fun getLineObjects(line: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineObjectsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns bounding rectangle of the inline object.
   */
  public final fun getLineObjectRect(line: Int, key: Any?): Rect2 {
    TransferContext.writeArguments(LONG to line.toLong(), ANY to key)
    TransferContext.callMethod(rawPtr, MethodBindings.getLineObjectRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Returns size of the bounding box of the line of text. Returned size is rounded up.
   */
  public final fun getLineSize(line: Int): Vector2 {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns character range of the line.
   */
  public final fun getLineRange(line: Int): Vector2i {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineRangePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns the text line ascent (number of pixels above the baseline for horizontal layout or to
   * the left of baseline for vertical).
   */
  public final fun getLineAscent(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineAscentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the text line descent (number of pixels below the baseline for horizontal layout or to
   * the right of baseline for vertical).
   */
  public final fun getLineDescent(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineDescentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns width (for horizontal layout) or height (for vertical) of the line of text.
   */
  public final fun getLineWidth(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public final fun getLineUnderlinePosition(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineUnderlinePositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns thickness of the underline.
   */
  public final fun getLineUnderlineThickness(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineUnderlineThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns drop cap bounding box size.
   */
  public final fun getDropcapSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDropcapSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns number of lines used by dropcap.
   */
  public final fun getDropcapLines(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDropcapLinesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Draw all lines of the text and drop cap into a canvas item at a given position, with [color].
   * [pos] specifies the top left corner of the bounding box.
   */
  @JvmOverloads
  public final fun draw(
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
  public final fun drawOutline(
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
  public final fun drawLine(
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
  public final fun drawLineOutline(
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
  public final fun drawDropcap(
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
  public final fun drawDropcapOutline(
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
  public final fun hitTest(coords: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.hitTestPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "clear", 3218959716)

    public val setDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_direction", 1418190634)

    public val getDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_direction", 2516697328)

    public val setCustomPunctuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_custom_punctuation", 83702148)

    public val getCustomPunctuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_custom_punctuation", 201670096)

    public val setOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_orientation", 42823726)

    public val getOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_orientation", 175768116)

    public val setPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_preserve_invalid", 2586408642)

    public val getPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_preserve_invalid", 36873697)

    public val setPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_preserve_control", 2586408642)

    public val getPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_preserve_control", 36873697)

    public val setBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_bidi_override", 381264803)

    public val setDropcapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_dropcap", 2498990330)

    public val clearDropcapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "clear_dropcap", 3218959716)

    public val addStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "add_string", 621426851)

    public val addObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "add_object", 1316529304)

    public val resizeObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "resize_object", 2095776372)

    public val setAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_alignment", 2312603777)

    public val getAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_alignment", 341400642)

    public val tabAlignPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "tab_align", 2899603908)

    public val setBreakFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_break_flags", 2809697122)

    public val getBreakFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_break_flags", 2340632602)

    public val setJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_justification_flags", 2877345813)

    public val getJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_justification_flags", 1583363614)

    public val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_text_overrun_behavior", 1008890932)

    public val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_text_overrun_behavior", 3779142101)

    public val setEllipsisCharPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_ellipsis_char", 83702148)

    public val getEllipsisCharPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_ellipsis_char", 201670096)

    public val setWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_width", 373806689)

    public val getWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_width", 1740695150)

    public val getNonWrappedSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_non_wrapped_size", 3341600327)

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_size", 3341600327)

    public val getRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_rid", 2944877500)

    public val getLineRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_rid", 495598643)

    public val getDropcapRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_dropcap_rid", 2944877500)

    public val getLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_count", 3905245786)

    public val setMaxLinesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_max_lines_visible", 1286410249)

    public val getMaxLinesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_max_lines_visible", 3905245786)

    public val getLineObjectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_objects", 663333327)

    public val getLineObjectRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_object_rect", 204315017)

    public val getLineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_size", 2299179447)

    public val getLineRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_range", 880721226)

    public val getLineAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_ascent", 2339986948)

    public val getLineDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_descent", 2339986948)

    public val getLineWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_width", 2339986948)

    public val getLineUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_underline_position", 2339986948)

    public val getLineUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_underline_thickness", 2339986948)

    public val getDropcapSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_dropcap_size", 3341600327)

    public val getDropcapLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_dropcap_lines", 3905245786)

    public val drawPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "draw", 1567802413)

    public val drawOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "draw_outline", 1893131224)

    public val drawLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "draw_line", 1242169894)

    public val drawLineOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "draw_line_outline", 2664926980)

    public val drawDropcapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "draw_dropcap", 856975658)

    public val drawDropcapOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "draw_dropcap_outline", 1343401456)

    public val hitTestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "hit_test", 3820158470)
  }
}
