// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.TextServer.JustificationFlagValue
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
import godot.core.VariantParser._RID
import godot.core.Vector2
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

private const val ENGINE_CLASS_TEXTLINE_INDEX: Int = 640

/**
 * Abstraction over [TextServer] for handling a single line of text.
 */
@GodotBaseType
public open class TextLine : RefCounted() {
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
   * Text line width.
   */
  public final inline var width: Float
    @JvmName("widthProperty")
    get() = getWidth()
    @JvmName("widthProperty")
    set(`value`) {
      setWidth(value)
    }

  /**
   * Sets text alignment within the line as if the line was horizontal.
   */
  public final inline var alignment: HorizontalAlignment
    @JvmName("alignmentProperty")
    get() = getHorizontalAlignment()
    @JvmName("alignmentProperty")
    set(`value`) {
      setHorizontalAlignment(value)
    }

  /**
   * Line alignment rules. For more info see [TextServer].
   */
  public final inline var flags: TextServer.JustificationFlag
    @JvmName("flagsProperty")
    get() = getFlags()
    @JvmName("flagsProperty")
    set(`value`) {
      setFlags(value)
    }

  /**
   * Sets the clipping behavior when the text exceeds the text line's set width. See
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

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_TEXTLINE_INDEX, scriptIndex)
  }

  /**
   * Clears text line (removes text and inline objects).
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

  public final fun setWidth(width: Float): Unit {
    Internals.writeArguments(DOUBLE to width.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun getWidth(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getWidthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHorizontalAlignment(alignment: HorizontalAlignment): Unit {
    Internals.writeArguments(LONG to alignment.id)
    Internals.callMethod(rawPtr, MethodBindings.setHorizontalAlignmentPtr, NIL)
  }

  public final fun getHorizontalAlignment(): HorizontalAlignment {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHorizontalAlignmentPtr, LONG)
    return HorizontalAlignment.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Aligns text to the given tab-stops.
   */
  public final fun tabAlign(tabStops: PackedFloat32Array): Unit {
    Internals.writeArguments(PACKED_FLOAT_32_ARRAY to tabStops)
    Internals.callMethod(rawPtr, MethodBindings.tabAlignPtr, NIL)
  }

  public final fun setFlags(flags: TextServer.JustificationFlag): Unit {
    Internals.writeArguments(LONG to flags.flag)
    Internals.callMethod(rawPtr, MethodBindings.setFlagsPtr, NIL)
  }

  public final fun getFlags(): TextServer.JustificationFlag {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFlagsPtr, LONG)
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

  /**
   * Returns array of inline objects.
   */
  public final fun getObjects(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getObjectsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns bounding rectangle of the inline object.
   */
  public final fun getObjectRect(key: Any?): Rect2 {
    Internals.writeArguments(ANY to key)
    Internals.callMethod(rawPtr, MethodBindings.getObjectRectPtr, RECT2)
    return (Internals.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Returns size of the bounding box of the text.
   */
  public final fun getSize(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns TextServer buffer RID.
   */
  public final fun getRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the text ascent (number of pixels above the baseline for horizontal layout or to the
   * left of baseline for vertical).
   */
  public final fun getLineAscent(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineAscentPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the text descent (number of pixels below the baseline for horizontal layout or to the
   * right of baseline for vertical).
   */
  public final fun getLineDescent(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineDescentPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns width (for horizontal layout) or height (for vertical) of the text.
   */
  public final fun getLineWidth(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineWidthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public final fun getLineUnderlinePosition(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineUnderlinePositionPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns thickness of the underline.
   */
  public final fun getLineUnderlineThickness(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineUnderlineThicknessPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Draw text into a canvas item at a given position, with [color]. [pos] specifies the top left
   * corner of the bounding box.
   */
  @JvmOverloads
  public final fun draw(
    canvas: RID,
    pos: Vector2,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    Internals.writeArguments(_RID to canvas, VECTOR2 to pos, COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.drawPtr, NIL)
  }

  /**
   * Draw text into a canvas item at a given position, with [color]. [pos] specifies the top left
   * corner of the bounding box.
   */
  @JvmOverloads
  public final fun drawOutline(
    canvas: RID,
    pos: Vector2,
    outlineSize: Int = 1,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    Internals.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to outlineSize.toLong(), COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.drawOutlinePtr, NIL)
  }

  /**
   * Returns caret character offset at the specified pixel offset at the baseline. This function
   * always returns a valid position.
   */
  public final fun hitTest(coords: Float): Int {
    Internals.writeArguments(DOUBLE to coords.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.hitTestPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr = Internals.getMethodBindPtr("TextLine", "clear", 3218959716)

    public val setDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "set_direction", 1418190634)

    public val getDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_direction", 2516697328)

    public val setOrientationPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "set_orientation", 42823726)

    public val getOrientationPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_orientation", 175768116)

    public val setPreserveInvalidPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "set_preserve_invalid", 2586408642)

    public val getPreserveInvalidPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_preserve_invalid", 36873697)

    public val setPreserveControlPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "set_preserve_control", 2586408642)

    public val getPreserveControlPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_preserve_control", 36873697)

    public val setBidiOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "set_bidi_override", 381264803)

    public val addStringPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "add_string", 621426851)

    public val addObjectPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "add_object", 1316529304)

    public val resizeObjectPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "resize_object", 2095776372)

    public val setWidthPtr: VoidPtr = Internals.getMethodBindPtr("TextLine", "set_width", 373806689)

    public val getWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_width", 1740695150)

    public val setHorizontalAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "set_horizontal_alignment", 2312603777)

    public val getHorizontalAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_horizontal_alignment", 341400642)

    public val tabAlignPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "tab_align", 2899603908)

    public val setFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "set_flags", 2877345813)

    public val getFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_flags", 1583363614)

    public val setTextOverrunBehaviorPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "set_text_overrun_behavior", 1008890932)

    public val getTextOverrunBehaviorPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_text_overrun_behavior", 3779142101)

    public val setEllipsisCharPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "set_ellipsis_char", 83702148)

    public val getEllipsisCharPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_ellipsis_char", 201670096)

    public val getObjectsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_objects", 3995934104)

    public val getObjectRectPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_object_rect", 1742700391)

    public val getSizePtr: VoidPtr = Internals.getMethodBindPtr("TextLine", "get_size", 3341600327)

    public val getRidPtr: VoidPtr = Internals.getMethodBindPtr("TextLine", "get_rid", 2944877500)

    public val getLineAscentPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_line_ascent", 1740695150)

    public val getLineDescentPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_line_descent", 1740695150)

    public val getLineWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_line_width", 1740695150)

    public val getLineUnderlinePositionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_line_underline_position", 1740695150)

    public val getLineUnderlineThicknessPtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "get_line_underline_thickness", 1740695150)

    public val drawPtr: VoidPtr = Internals.getMethodBindPtr("TextLine", "draw", 856975658)

    public val drawOutlinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextLine", "draw_outline", 1343401456)

    public val hitTestPtr: VoidPtr = Internals.getMethodBindPtr("TextLine", "hit_test", 2401831903)
  }
}
