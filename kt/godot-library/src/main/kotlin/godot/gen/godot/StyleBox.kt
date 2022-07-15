// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for drawing stylized boxes for the UI.
 *
 * StyleBox is [godot.Resource] that provides an abstract base class for drawing stylized boxes for the UI. StyleBoxes are used for drawing the styles of buttons, line edit backgrounds, tree backgrounds, etc. and also for testing a transparency mask for pointer signals. If mask test fails on a StyleBox assigned as mask to a control, clicks and motion signals will go through it to the one below.
 *
 * **Note:** For children of [godot.Control] that have *Theme Properties*, the `focus` [godot.StyleBox] is displayed over the `normal`, `hover` or `pressed` [godot.StyleBox]. This makes the `focus` [godot.StyleBox] more reusable across different nodes.
 */
@GodotBaseType
public open class StyleBox : Resource() {
  /**
   * The bottom margin for the contents of this style box. Increasing this value reduces the space available to the contents from the bottom.
   *
   * If this value is negative, it is ignored and a child-specific margin is used instead. For example for [godot.StyleBoxFlat] the border thickness (if any) is used instead.
   *
   * It is up to the code using this style box to decide what these contents are: for example, a [godot.Button] respects this content margin for the textual contents of the button.
   *
   * [getMargin] should be used to fetch this value as consumer instead of reading these properties directly. This is because it correctly respects negative values and the fallback mentioned above.
   */
  public open var contentMarginBottom: Double
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_CONTENT_MARGIN_BOTTOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOX_SET_CONTENT_MARGIN_BOTTOM, NIL)
    }

  /**
   * The left margin for the contents of this style box.Increasing this value reduces the space available to the contents from the left.
   *
   * Refer to [contentMarginBottom] for extra considerations.
   */
  public open var contentMarginLeft: Double
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_CONTENT_MARGIN_LEFT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_SET_CONTENT_MARGIN_LEFT,
          NIL)
    }

  /**
   * The right margin for the contents of this style box. Increasing this value reduces the space available to the contents from the right.
   *
   * Refer to [contentMarginBottom] for extra considerations.
   */
  public open var contentMarginRight: Double
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_CONTENT_MARGIN_RIGHT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_SET_CONTENT_MARGIN_RIGHT,
          NIL)
    }

  /**
   * The top margin for the contents of this style box. Increasing this value reduces the space available to the contents from the top.
   *
   * Refer to [contentMarginBottom] for extra considerations.
   */
  public open var contentMarginTop: Double
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_CONTENT_MARGIN_TOP,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_SET_CONTENT_MARGIN_TOP,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_STYLEBOX)
  }

  /**
   * Draws this stylebox using a canvas item identified by the given [RID].
   *
   * The [RID] value can either be the result of [godot.CanvasItem.getCanvasItem] called on an existing [godot.CanvasItem]-derived node, or directly from creating a canvas item in the [godot.VisualServer] with [godot.VisualServer.canvasItemCreate].
   */
  public open fun draw(canvasItem: RID, rect: Rect2): Unit {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_DRAW, NIL)
  }

  /**
   * Returns the size of this [godot.StyleBox] without the margins.
   */
  public open fun getCenterSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_CENTER_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the [godot.CanvasItem] that handles its [godot.CanvasItem.NOTIFICATION_DRAW] or [godot.CanvasItem.Draw] callback at this moment.
   */
  public open fun getCurrentItemDrawn(): CanvasItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_CURRENT_ITEM_DRAWN,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as CanvasItem?
  }

  /**
   * Returns the content margin offset for the specified [enum Margin].
   *
   * Positive values reduce size inwards, unlike [godot.Control]'s margin values.
   */
  public open fun getMargin(margin: Long): Double {
    TransferContext.writeArguments(LONG to margin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_MARGIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the minimum size that this stylebox can be shrunk to.
   */
  public open fun getMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_MINIMUM_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the "offset" of a stylebox. This helper function returns a value equivalent to `Vector2(style.get_margin(MARGIN_LEFT), style.get_margin(MARGIN_TOP))`.
   */
  public open fun getOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_OFFSET, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Test a position in a rectangle, return whether it passes the mask test.
   */
  public open fun testMask(point: Vector2, rect: Rect2): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_TEST_MASK, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
