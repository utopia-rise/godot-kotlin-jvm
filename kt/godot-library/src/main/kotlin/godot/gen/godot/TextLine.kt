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
import godot.core.VariantType._RID
import godot.core.Vector2
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
 * Holds a line of text.
 *
 * Abstraction over [godot.TextServer] for handling a single line of text.
 */
@GodotBaseType
public open class TextLine : RefCounted() {
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
   * Text line width.
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
   * Sets text alignment within the line as if the line was horizontal.
   */
  public var alignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHorizontalAlignmentPtr, LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHorizontalAlignmentPtr, NIL)
    }

  /**
   * Line alignment rules. For more info see [godot.TextServer].
   */
  public var flags: TextServer.JustificationFlag
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagsPtr, LONG)
      return JustificationFlagValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagsPtr, NIL)
    }

  /**
   * Sets the clipping behavior when the text exceeds the text line's set width. See [enum TextServer.OverrunBehavior] for a description of all modes.
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTLINE, scriptIndex)
    return true
  }

  /**
   * Clears text line (removes text and inline objects).
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Overrides BiDi for the structured text.
   *
   * Override ranges should cover full source text without overlaps. BiDi algorithm will be used on each range separately.
   */
  public fun setBidiOverride(`override`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to override)
    TransferContext.callMethod(rawPtr, MethodBindings.setBidiOverridePtr, NIL)
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
   * Adds inline object to the text buffer, [key] must be unique. In the text, object is represented as [length] object replacement characters.
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
   * Aligns text to the given tab-stops.
   */
  public fun tabAlign(tabStops: PackedFloat32Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.callMethod(rawPtr, MethodBindings.tabAlignPtr, NIL)
  }

  /**
   * Returns array of inline objects.
   */
  public fun getObjects(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getObjectsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns bounding rectangle of the inline object.
   */
  public fun getObjectRect(key: Any?): Rect2 {
    TransferContext.writeArguments(ANY to key)
    TransferContext.callMethod(rawPtr, MethodBindings.getObjectRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Returns size of the bounding box of the text.
   */
  public fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns TextServer buffer RID.
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the text ascent (number of pixels above the baseline for horizontal layout or to the left of baseline for vertical).
   */
  public fun getLineAscent(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineAscentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the text descent (number of pixels below the baseline for horizontal layout or to the right of baseline for vertical).
   */
  public fun getLineDescent(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineDescentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns width (for horizontal layout) or height (for vertical) of the text.
   */
  public fun getLineWidth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public fun getLineUnderlinePosition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineUnderlinePositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns thickness of the underline.
   */
  public fun getLineUnderlineThickness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineUnderlineThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Draw text into a canvas item at a given position, with [color]. [pos] specifies the top left corner of the bounding box.
   */
  @JvmOverloads
  public fun draw(
    canvas: RID,
    pos: Vector2,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawPtr, NIL)
  }

  /**
   * Draw text into a canvas item at a given position, with [color]. [pos] specifies the top left corner of the bounding box.
   */
  @JvmOverloads
  public fun drawOutline(
    canvas: RID,
    pos: Vector2,
    outlineSize: Int = 1,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to outlineSize.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawOutlinePtr, NIL)
  }

  /**
   * Returns caret character offset at the specified pixel offset at the baseline. This function always returns a valid position.
   */
  public fun hitTest(coords: Float): Int {
    TransferContext.writeArguments(DOUBLE to coords.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.hitTestPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "clear")

    public val setDirectionPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "set_direction")

    public val getDirectionPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "get_direction")

    public val setOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_orientation")

    public val getOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_orientation")

    public val setPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_preserve_invalid")

    public val getPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_preserve_invalid")

    public val setPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_preserve_control")

    public val getPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_preserve_control")

    public val setBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_bidi_override")

    public val addStringPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "add_string")

    public val addObjectPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "add_object")

    public val resizeObjectPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "resize_object")

    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "set_width")

    public val getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "get_width")

    public val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_horizontal_alignment")

    public val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_horizontal_alignment")

    public val tabAlignPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "tab_align")

    public val setFlagsPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "set_flags")

    public val getFlagsPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "get_flags")

    public val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_text_overrun_behavior")

    public val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_text_overrun_behavior")

    public val getObjectsPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "get_objects")

    public val getObjectRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_object_rect")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "get_size")

    public val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "get_rid")

    public val getLineAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_line_ascent")

    public val getLineDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_line_descent")

    public val getLineWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "get_line_width")

    public val getLineUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_line_underline_position")

    public val getLineUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_line_underline_thickness")

    public val drawPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "draw")

    public val drawOutlinePtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "draw_outline")

    public val hitTestPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "hit_test")
  }
}
