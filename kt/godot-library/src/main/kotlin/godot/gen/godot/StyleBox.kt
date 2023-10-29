// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Rect2
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstract base class for defining stylized boxes for UI elements.
 *
 * [godot.StyleBox] is an abstract base class for drawing stylized boxes for UI elements. It is used for panels, buttons, [godot.LineEdit] backgrounds, [godot.Tree] backgrounds, etc. and also for testing a transparency mask for pointer signals. If mask test fails on a [godot.StyleBox] assigned as mask to a control, clicks and motion signals will go through it to the one below.
 *
 * **Note:** For control nodes that have *Theme Properties*, the `focus` [godot.StyleBox] is displayed over the `normal`, `hover` or `pressed` [godot.StyleBox]. This makes the `focus` [godot.StyleBox] more reusable across different nodes.
 */
@GodotBaseType
public open class StyleBox : Resource() {
  /**
   * The left margin for the contents of this style box. Increasing this value reduces the space available to the contents from the left.
   *
   * Refer to [contentMarginBottom] for extra considerations.
   */
  public var contentMarginLeft: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_CONTENT_MARGIN,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_SET_CONTENT_MARGIN, NIL)
    }

  /**
   * The top margin for the contents of this style box. Increasing this value reduces the space available to the contents from the top.
   *
   * Refer to [contentMarginBottom] for extra considerations.
   */
  public var contentMarginTop: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_CONTENT_MARGIN,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_SET_CONTENT_MARGIN, NIL)
    }

  /**
   * The right margin for the contents of this style box. Increasing this value reduces the space available to the contents from the right.
   *
   * Refer to [contentMarginBottom] for extra considerations.
   */
  public var contentMarginRight: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_CONTENT_MARGIN,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_SET_CONTENT_MARGIN, NIL)
    }

  /**
   * The bottom margin for the contents of this style box. Increasing this value reduces the space available to the contents from the bottom.
   *
   * If this value is negative, it is ignored and a child-specific margin is used instead. For example, for [godot.StyleBoxFlat], the border thickness (if any) is used instead.
   *
   * It is up to the code using this style box to decide what these contents are: for example, a [godot.Button] respects this content margin for the textual contents of the button.
   *
   * [getMargin] should be used to fetch this value as consumer instead of reading these properties directly. This is because it correctly respects negative values and the fallback mentioned above.
   */
  public var contentMarginBottom: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_CONTENT_MARGIN,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_SET_CONTENT_MARGIN, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STYLEBOX, scriptIndex)
    return true
  }

  /**
   *
   */
  public open fun _draw(toCanvasItem: RID, rect: Rect2): Unit {
  }

  /**
   *
   */
  public open fun _getDrawRect(rect: Rect2): Rect2 {
    throw NotImplementedError("_get_draw_rect is not implemented for StyleBox")
  }

  /**
   * Virtual method to be implemented by the user. Returns a custom minimum size that the stylebox must respect when drawing. By default [getMinimumSize] only takes content margins into account. This method can be overridden to add another size restriction. A combination of the default behavior and the output of this method will be used, to account for both sizes.
   */
  public open fun _getMinimumSize(): Vector2 {
    throw NotImplementedError("_get_minimum_size is not implemented for StyleBox")
  }

  /**
   *
   */
  public open fun _testMask(point: Vector2, rect: Rect2): Boolean {
    throw NotImplementedError("_test_mask is not implemented for StyleBox")
  }

  /**
   * Returns the minimum size that this stylebox can be shrunk to.
   */
  public fun getMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_MINIMUM_SIZE, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the default margin to [offset] pixels for all sides.
   */
  public fun setContentMarginAll(offset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_SET_CONTENT_MARGIN_ALL,
        NIL)
  }

  /**
   * Returns the content margin offset for the specified [enum Side].
   *
   * Positive values reduce size inwards, unlike [godot.Control]'s margin values.
   */
  public fun getMargin(margin: Side): Float {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_MARGIN, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the "offset" of a stylebox. This helper function returns a value equivalent to `Vector2(style.get_margin(MARGIN_LEFT), style.get_margin(MARGIN_TOP))`.
   */
  public fun getOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_OFFSET, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Draws this stylebox using a canvas item identified by the given [RID].
   *
   * The [RID] value can either be the result of [godot.CanvasItem.getCanvasItem] called on an existing [godot.CanvasItem]-derived node, or directly from creating a canvas item in the [godot.RenderingServer] with [godot.RenderingServer.canvasItemCreate].
   */
  public fun draw(canvasItem: RID, rect: Rect2): Unit {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_DRAW, NIL)
  }

  /**
   * Returns the [godot.CanvasItem] that handles its [godot.CanvasItem.NOTIFICATION_DRAW] or [godot.CanvasItem.Draw] callback at this moment.
   */
  public fun getCurrentItemDrawn(): CanvasItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_CURRENT_ITEM_DRAWN,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as CanvasItem?)
  }

  /**
   * Test a position in a rectangle, return whether it passes the mask test.
   */
  public fun testMask(point: Vector2, rect: Rect2): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_TEST_MASK, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object
}
