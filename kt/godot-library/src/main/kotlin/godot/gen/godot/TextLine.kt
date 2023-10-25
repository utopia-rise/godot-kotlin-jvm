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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_DIRECTION, LONG)
      return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_SET_DIRECTION, NIL)
    }

  /**
   * Text orientation.
   */
  public var orientation: TextServer.Orientation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_ORIENTATION, LONG)
      return TextServer.Orientation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_SET_ORIENTATION, NIL)
    }

  /**
   * If set to `true` text will display invalid characters.
   */
  public var preserveInvalid: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_PRESERVE_INVALID,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_SET_PRESERVE_INVALID,
          NIL)
    }

  /**
   * If set to `true` text will display control characters.
   */
  public var preserveControl: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_PRESERVE_CONTROL,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_SET_PRESERVE_CONTROL,
          NIL)
    }

  /**
   * Text line width.
   */
  public var width: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_WIDTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_SET_WIDTH, NIL)
    }

  /**
   * Sets text alignment within the line as if the line was horizontal.
   */
  public var alignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_HORIZONTAL_ALIGNMENT,
          LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_SET_HORIZONTAL_ALIGNMENT,
          NIL)
    }

  /**
   * Line alignment rules. For more info see [godot.TextServer].
   */
  public var flags: TextServer.JustificationFlag
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_FLAGS, LONG)
      return JustificationFlagValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_SET_FLAGS, NIL)
    }

  /**
   * Sets the clipping behavior when the text exceeds the text line's set width. See [enum TextServer.OverrunBehavior] for a description of all modes.
   */
  public var textOverrunBehavior: TextServer.OverrunBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_TEXT_OVERRUN_BEHAVIOR, LONG)
      return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTLINE_SET_TEXT_OVERRUN_BEHAVIOR, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_CLEAR, NIL)
  }

  /**
   * Overrides BiDi for the structured text.
   *
   * Override ranges should cover full source text without overlaps. BiDi algorithm will be used on each range separately.
   */
  public fun setBidiOverride(`override`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to override)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_SET_BIDI_OVERRIDE, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_ADD_STRING, BOOL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_ADD_OBJECT, BOOL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_RESIZE_OBJECT, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Aligns text to the given tab-stops.
   */
  public fun tabAlign(tabStops: PackedFloat32Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_TAB_ALIGN, NIL)
  }

  /**
   * Returns array of inline objects.
   */
  public fun getObjects(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_OBJECTS, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns bounding rectangle of the inline object.
   */
  public fun getObjectRect(key: Any?): Rect2 {
    TransferContext.writeArguments(ANY to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_OBJECT_RECT, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Returns size of the bounding box of the text.
   */
  public fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_SIZE, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns TextServer buffer RID.
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_RID, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the text ascent (number of pixels above the baseline for horizontal layout or to the left of baseline for vertical).
   */
  public fun getLineAscent(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_LINE_ASCENT, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the text descent (number of pixels below the baseline for horizontal layout or to the right of baseline for vertical).
   */
  public fun getLineDescent(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_LINE_DESCENT, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns width (for horizontal layout) or height (for vertical) of the text.
   */
  public fun getLineWidth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_LINE_WIDTH, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public fun getLineUnderlinePosition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_LINE_UNDERLINE_POSITION, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns thickness of the underline.
   */
  public fun getLineUnderlineThickness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTLINE_GET_LINE_UNDERLINE_THICKNESS, DOUBLE)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_DRAW, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_DRAW_OUTLINE, NIL)
  }

  /**
   * Returns caret character offset at the specified pixel offset at the baseline. This function always returns a valid position.
   */
  public fun hitTest(coords: Float): Int {
    TransferContext.writeArguments(DOUBLE to coords.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTLINE_HIT_TEST, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object
}
