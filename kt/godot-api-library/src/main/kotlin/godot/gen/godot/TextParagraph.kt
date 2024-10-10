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
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.core.Vector2i
import godot.util.Internals
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

private const val ENGINE_CLASS_TEXTPARAGRAPH_INDEX: Int = 642

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
    Internals.callConstructor(this, ENGINE_CLASS_TEXTPARAGRAPH_INDEX, scriptIndex)
  }

  /**
   * Clears text paragraph (removes text and inline objects).
   */
  public final fun clear(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public final fun setDirection(direction: TextServer.Direction): Unit {
    Internals.writeArguments(LONG to direction.id)
    Internals.callMethod(rawPtr, MethodBindings.setDirectionPtr, NIL)
  }

  public final fun getDirection(): TextServer.Direction {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDirectionPtr, LONG)
    return TextServer.Direction.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setCustomPunctuation(customPunctuation: String): Unit {
    Internals.writeArguments(STRING to customPunctuation)
    Internals.callMethod(rawPtr, MethodBindings.setCustomPunctuationPtr, NIL)
  }

  public final fun getCustomPunctuation(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCustomPunctuationPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setOrientation(orientation: TextServer.Orientation): Unit {
    Internals.writeArguments(LONG to orientation.id)
    Internals.callMethod(rawPtr, MethodBindings.setOrientationPtr, NIL)
  }

  public final fun getOrientation(): TextServer.Orientation {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOrientationPtr, LONG)
    return TextServer.Orientation.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setPreserveInvalid(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setPreserveInvalidPtr, NIL)
  }

  public final fun getPreserveInvalid(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPreserveInvalidPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPreserveControl(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setPreserveControlPtr, NIL)
  }

  public final fun getPreserveControl(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPreserveControlPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Overrides BiDi for the structured text.
   * Override ranges should cover full source text without overlaps. BiDi algorithm will be used on
   * each range separately.
   */
  public final fun setBidiOverride(`override`: VariantArray<Any?>): Unit {
    Internals.writeArguments(ARRAY to override)
    Internals.callMethod(rawPtr, MethodBindings.setBidiOverridePtr, NIL)
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
    Internals.writeArguments(STRING to text, OBJECT to font, LONG to fontSize.toLong(), RECT2 to dropcapMargins, STRING to language)
    Internals.callMethod(rawPtr, MethodBindings.setDropcapPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes dropcap.
   */
  public final fun clearDropcap(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearDropcapPtr, NIL)
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
    Internals.writeArguments(STRING to text, OBJECT to font, LONG to fontSize.toLong(), STRING to language, ANY to meta)
    Internals.callMethod(rawPtr, MethodBindings.addStringPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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
    Internals.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.id, LONG to length.toLong(), DOUBLE to baseline.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.addObjectPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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
    Internals.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.id, DOUBLE to baseline.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.resizeObjectPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAlignment(alignment: HorizontalAlignment): Unit {
    Internals.writeArguments(LONG to alignment.id)
    Internals.callMethod(rawPtr, MethodBindings.setAlignmentPtr, NIL)
  }

  public final fun getAlignment(): HorizontalAlignment {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAlignmentPtr, LONG)
    return HorizontalAlignment.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Aligns paragraph to the given tab-stops.
   */
  public final fun tabAlign(tabStops: PackedFloat32Array): Unit {
    Internals.writeArguments(PACKED_FLOAT_32_ARRAY to tabStops)
    Internals.callMethod(rawPtr, MethodBindings.tabAlignPtr, NIL)
  }

  public final fun setBreakFlags(flags: TextServer.LineBreakFlag): Unit {
    Internals.writeArguments(LONG to flags.flag)
    Internals.callMethod(rawPtr, MethodBindings.setBreakFlagsPtr, NIL)
  }

  public final fun getBreakFlags(): TextServer.LineBreakFlag {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBreakFlagsPtr, LONG)
    return LineBreakFlagValue(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setJustificationFlags(flags: TextServer.JustificationFlag): Unit {
    Internals.writeArguments(LONG to flags.flag)
    Internals.callMethod(rawPtr, MethodBindings.setJustificationFlagsPtr, NIL)
  }

  public final fun getJustificationFlags(): TextServer.JustificationFlag {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJustificationFlagsPtr, LONG)
    return JustificationFlagValue(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setTextOverrunBehavior(overrunBehavior: TextServer.OverrunBehavior): Unit {
    Internals.writeArguments(LONG to overrunBehavior.id)
    Internals.callMethod(rawPtr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
  }

  public final fun getTextOverrunBehavior(): TextServer.OverrunBehavior {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
    return TextServer.OverrunBehavior.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setEllipsisChar(char: String): Unit {
    Internals.writeArguments(STRING to char)
    Internals.callMethod(rawPtr, MethodBindings.setEllipsisCharPtr, NIL)
  }

  public final fun getEllipsisChar(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEllipsisCharPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setWidth(width: Float): Unit {
    Internals.writeArguments(DOUBLE to width.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun getWidth(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getWidthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the size of the bounding box of the paragraph, without line breaks.
   */
  public final fun getNonWrappedSize(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNonWrappedSizePtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the size of the bounding box of the paragraph.
   */
  public final fun getSize(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns TextServer full string buffer RID.
   */
  public final fun getRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns TextServer line buffer RID.
   */
  public final fun getLineRid(line: Int): RID {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns drop cap text buffer RID.
   */
  public final fun getDropcapRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDropcapRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns number of lines in the paragraph.
   */
  public final fun getLineCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMaxLinesVisible(maxLinesVisible: Int): Unit {
    Internals.writeArguments(LONG to maxLinesVisible.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMaxLinesVisiblePtr, NIL)
  }

  public final fun getMaxLinesVisible(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxLinesVisiblePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns array of inline objects in the line.
   */
  public final fun getLineObjects(line: Int): VariantArray<Any?> {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineObjectsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns bounding rectangle of the inline object.
   */
  public final fun getLineObjectRect(line: Int, key: Any?): Rect2 {
    Internals.writeArguments(LONG to line.toLong(), ANY to key)
    Internals.callMethod(rawPtr, MethodBindings.getLineObjectRectPtr, RECT2)
    return (Internals.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Returns size of the bounding box of the line of text. Returned size is rounded up.
   */
  public final fun getLineSize(line: Int): Vector2 {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineSizePtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns character range of the line.
   */
  public final fun getLineRange(line: Int): Vector2i {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineRangePtr, VECTOR2I)
    return (Internals.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the text line ascent (number of pixels above the baseline for horizontal layout or to
   * the left of baseline for vertical).
   */
  public final fun getLineAscent(line: Int): Float {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineAscentPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the text line descent (number of pixels below the baseline for horizontal layout or to
   * the right of baseline for vertical).
   */
  public final fun getLineDescent(line: Int): Float {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineDescentPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns width (for horizontal layout) or height (for vertical) of the line of text.
   */
  public final fun getLineWidth(line: Int): Float {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineWidthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public final fun getLineUnderlinePosition(line: Int): Float {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineUnderlinePositionPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns thickness of the underline.
   */
  public final fun getLineUnderlineThickness(line: Int): Float {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineUnderlineThicknessPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns drop cap bounding box size.
   */
  public final fun getDropcapSize(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDropcapSizePtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns number of lines used by dropcap.
   */
  public final fun getDropcapLines(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDropcapLinesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(_RID to canvas, VECTOR2 to pos, COLOR to color, COLOR to dcColor)
    Internals.callMethod(rawPtr, MethodBindings.drawPtr, NIL)
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
    Internals.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to outlineSize.toLong(), COLOR to color, COLOR to dcColor)
    Internals.callMethod(rawPtr, MethodBindings.drawOutlinePtr, NIL)
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
    Internals.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to line.toLong(), COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.drawLinePtr, NIL)
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
    Internals.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to line.toLong(), LONG to outlineSize.toLong(), COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.drawLineOutlinePtr, NIL)
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
    Internals.writeArguments(_RID to canvas, VECTOR2 to pos, COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.drawDropcapPtr, NIL)
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
    Internals.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to outlineSize.toLong(), COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.drawDropcapOutlinePtr, NIL)
  }

  /**
   * Returns caret character offset at the specified coordinates. This function always returns a
   * valid position.
   */
  public final fun hitTest(coords: Vector2): Int {
    Internals.writeArguments(VECTOR2 to coords)
    Internals.callMethod(rawPtr, MethodBindings.hitTestPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr = Internals.getMethodBindPtr("TextParagraph", "clear", 3218959716)

    public val setDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "set_direction", 1418190634)

    public val getDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_direction", 2516697328)

    public val setCustomPunctuationPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "set_custom_punctuation", 83702148)

    public val getCustomPunctuationPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_custom_punctuation", 201670096)

    public val setOrientationPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "set_orientation", 42823726)

    public val getOrientationPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_orientation", 175768116)

    public val setPreserveInvalidPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "set_preserve_invalid", 2586408642)

    public val getPreserveInvalidPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_preserve_invalid", 36873697)

    public val setPreserveControlPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "set_preserve_control", 2586408642)

    public val getPreserveControlPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_preserve_control", 36873697)

    public val setBidiOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "set_bidi_override", 381264803)

    public val setDropcapPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "set_dropcap", 2498990330)

    public val clearDropcapPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "clear_dropcap", 3218959716)

    public val addStringPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "add_string", 621426851)

    public val addObjectPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "add_object", 1316529304)

    public val resizeObjectPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "resize_object", 2095776372)

    public val setAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "set_alignment", 2312603777)

    public val getAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_alignment", 341400642)

    public val tabAlignPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "tab_align", 2899603908)

    public val setBreakFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "set_break_flags", 2809697122)

    public val getBreakFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_break_flags", 2340632602)

    public val setJustificationFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "set_justification_flags", 2877345813)

    public val getJustificationFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_justification_flags", 1583363614)

    public val setTextOverrunBehaviorPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "set_text_overrun_behavior", 1008890932)

    public val getTextOverrunBehaviorPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_text_overrun_behavior", 3779142101)

    public val setEllipsisCharPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "set_ellipsis_char", 83702148)

    public val getEllipsisCharPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_ellipsis_char", 201670096)

    public val setWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "set_width", 373806689)

    public val getWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_width", 1740695150)

    public val getNonWrappedSizePtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_non_wrapped_size", 3341600327)

    public val getSizePtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_size", 3341600327)

    public val getRidPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_rid", 2944877500)

    public val getLineRidPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_line_rid", 495598643)

    public val getDropcapRidPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_dropcap_rid", 2944877500)

    public val getLineCountPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_line_count", 3905245786)

    public val setMaxLinesVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "set_max_lines_visible", 1286410249)

    public val getMaxLinesVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_max_lines_visible", 3905245786)

    public val getLineObjectsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_line_objects", 663333327)

    public val getLineObjectRectPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_line_object_rect", 204315017)

    public val getLineSizePtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_line_size", 2299179447)

    public val getLineRangePtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_line_range", 880721226)

    public val getLineAscentPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_line_ascent", 2339986948)

    public val getLineDescentPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_line_descent", 2339986948)

    public val getLineWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_line_width", 2339986948)

    public val getLineUnderlinePositionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_line_underline_position", 2339986948)

    public val getLineUnderlineThicknessPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_line_underline_thickness", 2339986948)

    public val getDropcapSizePtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_dropcap_size", 3341600327)

    public val getDropcapLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "get_dropcap_lines", 3905245786)

    public val drawPtr: VoidPtr = Internals.getMethodBindPtr("TextParagraph", "draw", 1567802413)

    public val drawOutlinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "draw_outline", 1893131224)

    public val drawLinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "draw_line", 1242169894)

    public val drawLineOutlinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "draw_line_outline", 2664926980)

    public val drawDropcapPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "draw_dropcap", 856975658)

    public val drawDropcapOutlinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "draw_dropcap_outline", 1343401456)

    public val hitTestPtr: VoidPtr =
        Internals.getMethodBindPtr("TextParagraph", "hit_test", 3820158470)
  }
}
