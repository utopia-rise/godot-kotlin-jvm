// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
import kotlin.Int
import kotlin.NotImplementedError
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
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STYLEBOX, scriptIndex)
    return true
  }

  /**
   *
   */
  public open fun _getStyleMargin(side: Side): Double {
    throw NotImplementedError("_get_style_margin is not implemented for StyleBox")
  }

  /**
   *
   */
  public open fun _testMask(point: Vector2, rect: Rect2): Boolean {
    throw NotImplementedError("_test_mask is not implemented for StyleBox")
  }

  /**
   *
   */
  public open fun _getCenterSize(): Vector2 {
    throw NotImplementedError("_get_center_size is not implemented for StyleBox")
  }

  /**
   *
   */
  public open fun _getDrawRect(rect: Rect2): Rect2 {
    throw NotImplementedError("_get_draw_rect is not implemented for StyleBox")
  }

  /**
   *
   */
  public open fun _draw(toCanvasItem: RID, rect: Rect2): Unit {
  }

  /**
   * Test a position in a rectangle, return whether it passes the mask test.
   */
  public fun testMask(point: Vector2, rect: Rect2): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_TEST_MASK, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the default value of the specified [enum Side] to [offset] pixels.
   */
  public fun setDefaultMargin(margin: Side, offset: Double): Unit {
    TransferContext.writeArguments(LONG to margin.id, DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_SET_DEFAULT_MARGIN, NIL)
  }

  /**
   * Returns the default margin of the specified [enum Side].
   */
  public fun getDefaultMargin(margin: Side): Double {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_DEFAULT_MARGIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the content margin offset for the specified [enum Side].
   *
   * Positive values reduce size inwards, unlike [godot.Control]'s margin values.
   */
  public fun getMargin(margin: Side): Double {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_MARGIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the minimum size that this stylebox can be shrunk to.
   */
  public fun getMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_MINIMUM_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the size of this [godot.StyleBox] without the margins.
   */
  public fun getCenterSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_CENTER_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the "offset" of a stylebox. This helper function returns a value equivalent to `Vector2(style.get_margin(MARGIN_LEFT), style.get_margin(MARGIN_TOP))`.
   */
  public fun getOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_OFFSET, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the [godot.CanvasItem] that handles its [godot.CanvasItem.NOTIFICATION_DRAW] or [godot.CanvasItem.Draw] callback at this moment.
   */
  public fun getCurrentItemDrawn(): CanvasItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOX_GET_CURRENT_ITEM_DRAWN,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as CanvasItem?
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

  public companion object
}
