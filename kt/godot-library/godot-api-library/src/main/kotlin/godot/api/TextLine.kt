// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.HorizontalAlignment
import godot.core.InlineAlignment
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
   * The clipping behavior when the text exceeds the text line's set width.
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
    createNativeObject(673, scriptIndex)
  }

  /**
   * Clears text line (removes text and inline objects).
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  public final fun setDirection(direction: TextServer.Direction): Unit {
    TransferContext.writeArguments(LONG to direction.value)
    TransferContext.callMethod(ptr, MethodBindings.setDirectionPtr, NIL)
  }

  public final fun getDirection(): TextServer.Direction {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDirectionPtr, LONG)
    return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the text writing direction inferred by the BiDi algorithm.
   */
  public final fun getInferredDirection(): TextServer.Direction {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInferredDirectionPtr, LONG)
    return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setOrientation(orientation: TextServer.Orientation): Unit {
    TransferContext.writeArguments(LONG to orientation.value)
    TransferContext.callMethod(ptr, MethodBindings.setOrientationPtr, NIL)
  }

  public final fun getOrientation(): TextServer.Orientation {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOrientationPtr, LONG)
    return TextServer.Orientation.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPreserveInvalid(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setPreserveInvalidPtr, NIL)
  }

  public final fun getPreserveInvalid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPreserveInvalidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPreserveControl(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setPreserveControlPtr, NIL)
  }

  public final fun getPreserveControl(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPreserveControlPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Overrides BiDi for the structured text.
   *
   * Override ranges should cover full source text without overlaps. BiDi algorithm will be used on
   * each range separately.
   */
  public final fun setBidiOverride(`override`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to override)
    TransferContext.callMethod(ptr, MethodBindings.setBidiOverridePtr, NIL)
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
    TransferContext.callMethod(ptr, MethodBindings.addStringPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds inline object to the text buffer, [key] must be unique. In the text, object is represented
   * as [length] object replacement characters.
   */
  @JvmOverloads
  public final fun addObject(
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.CENTER,
    length: Int = 1,
    baseline: Float = 0.0f,
  ): Boolean {
    TransferContext.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.value, LONG to length.toLong(), DOUBLE to baseline.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.addObjectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets new size and alignment of embedded object.
   */
  @JvmOverloads
  public final fun resizeObject(
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.CENTER,
    baseline: Float = 0.0f,
  ): Boolean {
    TransferContext.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.value, DOUBLE to baseline.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.resizeObjectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setWidth(width: Float): Unit {
    TransferContext.writeArguments(DOUBLE to width.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun getWidth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHorizontalAlignment(alignment: HorizontalAlignment): Unit {
    TransferContext.writeArguments(LONG to alignment.value)
    TransferContext.callMethod(ptr, MethodBindings.setHorizontalAlignmentPtr, NIL)
  }

  public final fun getHorizontalAlignment(): HorizontalAlignment {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHorizontalAlignmentPtr, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Aligns text to the given tab-stops.
   */
  public final fun tabAlign(tabStops: PackedFloat32Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.callMethod(ptr, MethodBindings.tabAlignPtr, NIL)
  }

  public final fun setFlags(flags: TextServer.JustificationFlag): Unit {
    TransferContext.writeArguments(LONG to flags.flag)
    TransferContext.callMethod(ptr, MethodBindings.setFlagsPtr, NIL)
  }

  public final fun getFlags(): TextServer.JustificationFlag {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFlagsPtr, LONG)
    return TextServer.JustificationFlag(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTextOverrunBehavior(overrunBehavior: TextServer.OverrunBehavior): Unit {
    TransferContext.writeArguments(LONG to overrunBehavior.value)
    TransferContext.callMethod(ptr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
  }

  public final fun getTextOverrunBehavior(): TextServer.OverrunBehavior {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
    return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setEllipsisChar(char: String): Unit {
    TransferContext.writeArguments(STRING to char)
    TransferContext.callMethod(ptr, MethodBindings.setEllipsisCharPtr, NIL)
  }

  public final fun getEllipsisChar(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEllipsisCharPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns array of inline objects.
   */
  public final fun getObjects(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getObjectsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns bounding rectangle of the inline object.
   */
  public final fun getObjectRect(key: Any?): Rect2 {
    TransferContext.writeArguments(ANY to key)
    TransferContext.callMethod(ptr, MethodBindings.getObjectRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Returns size of the bounding box of the text.
   */
  public final fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns TextServer buffer RID.
   */
  public final fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the text ascent (number of pixels above the baseline for horizontal layout or to the
   * left of baseline for vertical).
   */
  public final fun getLineAscent(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLineAscentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the text descent (number of pixels below the baseline for horizontal layout or to the
   * right of baseline for vertical).
   */
  public final fun getLineDescent(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLineDescentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns width (for horizontal layout) or height (for vertical) of the text.
   */
  public final fun getLineWidth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLineWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public final fun getLineUnderlinePosition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLineUnderlinePositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns thickness of the underline.
   */
  public final fun getLineUnderlineThickness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLineUnderlineThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Draw text into a canvas item at a given position, with [color]. [pos] specifies the top left
   * corner of the bounding box. If [oversampling] is greater than zero, it is used as font
   * oversampling factor, otherwise viewport oversampling settings are used.
   */
  @JvmOverloads
  public final fun draw(
    canvas: RID,
    pos: Vector2,
    color: Color = Color(Color(1, 1, 1, 1)),
    oversampling: Float = 0.0f,
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, COLOR to color, DOUBLE to oversampling.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.drawPtr, NIL)
  }

  /**
   * Draw text into a canvas item at a given position, with [color]. [pos] specifies the top left
   * corner of the bounding box. If [oversampling] is greater than zero, it is used as font
   * oversampling factor, otherwise viewport oversampling settings are used.
   */
  @JvmOverloads
  public final fun drawOutline(
    canvas: RID,
    pos: Vector2,
    outlineSize: Int = 1,
    color: Color = Color(Color(1, 1, 1, 1)),
    oversampling: Float = 0.0f,
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to outlineSize.toLong(), COLOR to color, DOUBLE to oversampling.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.drawOutlinePtr, NIL)
  }

  /**
   * Returns caret character offset at the specified pixel offset at the baseline. This function
   * always returns a valid position.
   */
  public final fun hitTest(coords: Float): Int {
    TransferContext.writeArguments(DOUBLE to coords.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.hitTestPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "clear", 3218959716)

    internal val setDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_direction", 1418190634)

    internal val getDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_direction", 2516697328)

    internal val getInferredDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_inferred_direction", 2516697328)

    internal val setOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_orientation", 42823726)

    internal val getOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_orientation", 175768116)

    internal val setPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_preserve_invalid", 2586408642)

    internal val getPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_preserve_invalid", 36873697)

    internal val setPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_preserve_control", 2586408642)

    internal val getPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_preserve_control", 36873697)

    internal val setBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_bidi_override", 381264803)

    internal val addStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "add_string", 621426851)

    internal val addObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "add_object", 1316529304)

    internal val resizeObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "resize_object", 2095776372)

    internal val setWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_width", 373806689)

    internal val getWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_width", 1740695150)

    internal val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_horizontal_alignment", 2312603777)

    internal val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_horizontal_alignment", 341400642)

    internal val tabAlignPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "tab_align", 2899603908)

    internal val setFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_flags", 2877345813)

    internal val getFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_flags", 1583363614)

    internal val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_text_overrun_behavior", 1008890932)

    internal val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_text_overrun_behavior", 3779142101)

    internal val setEllipsisCharPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_ellipsis_char", 83702148)

    internal val getEllipsisCharPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_ellipsis_char", 201670096)

    internal val getObjectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_objects", 3995934104)

    internal val getObjectRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_object_rect", 1742700391)

    internal val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_size", 3341600327)

    internal val getRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_rid", 2944877500)

    internal val getLineAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_line_ascent", 1740695150)

    internal val getLineDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_line_descent", 1740695150)

    internal val getLineWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_line_width", 1740695150)

    internal val getLineUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_line_underline_position", 1740695150)

    internal val getLineUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_line_underline_thickness", 1740695150)

    internal val drawPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "draw", 3625105422)

    internal val drawOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "draw_outline", 2592177763)

    internal val hitTestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "hit_test", 2401831903)
  }
}
