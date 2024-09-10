// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Rect2
import godot.core.TypeManager
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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [StyleBox] is an abstract base class for drawing stylized boxes for UI elements. It is used for
 * panels, buttons, [LineEdit] backgrounds, [Tree] backgrounds, etc. and also for testing a
 * transparency mask for pointer signals. If mask test fails on a [StyleBox] assigned as mask to a
 * control, clicks and motion signals will go through it to the one below.
 * **Note:** For control nodes that have *Theme Properties*, the `focus` [StyleBox] is displayed
 * over the `normal`, `hover` or `pressed` [StyleBox]. This makes the `focus` [StyleBox] more reusable
 * across different nodes.
 */
@GodotBaseType
public open class StyleBox : Resource() {
  /**
   * The left margin for the contents of this style box. Increasing this value reduces the space
   * available to the contents from the left.
   * Refer to [contentMarginBottom] for extra considerations.
   */
  public var contentMarginLeft: Float
    @JvmName("contentMarginLeftProperty")
    get() = getContentMargin(Side.SIDE_LEFT)
    @JvmName("contentMarginLeftProperty")
    set(`value`) {
      setContentMargin(Side.SIDE_LEFT, value)
    }

  /**
   * The top margin for the contents of this style box. Increasing this value reduces the space
   * available to the contents from the top.
   * Refer to [contentMarginBottom] for extra considerations.
   */
  public var contentMarginTop: Float
    @JvmName("contentMarginTopProperty")
    get() = getContentMargin(Side.SIDE_TOP)
    @JvmName("contentMarginTopProperty")
    set(`value`) {
      setContentMargin(Side.SIDE_TOP, value)
    }

  /**
   * The right margin for the contents of this style box. Increasing this value reduces the space
   * available to the contents from the right.
   * Refer to [contentMarginBottom] for extra considerations.
   */
  public var contentMarginRight: Float
    @JvmName("contentMarginRightProperty")
    get() = getContentMargin(Side.SIDE_RIGHT)
    @JvmName("contentMarginRightProperty")
    set(`value`) {
      setContentMargin(Side.SIDE_RIGHT, value)
    }

  /**
   * The bottom margin for the contents of this style box. Increasing this value reduces the space
   * available to the contents from the bottom.
   * If this value is negative, it is ignored and a child-specific margin is used instead. For
   * example, for [StyleBoxFlat], the border thickness (if any) is used instead.
   * It is up to the code using this style box to decide what these contents are: for example, a
   * [Button] respects this content margin for the textual contents of the button.
   * [getMargin] should be used to fetch this value as consumer instead of reading these properties
   * directly. This is because it correctly respects negative values and the fallback mentioned above.
   */
  public var contentMarginBottom: Float
    @JvmName("contentMarginBottomProperty")
    get() = getContentMargin(Side.SIDE_BOTTOM)
    @JvmName("contentMarginBottomProperty")
    set(`value`) {
      setContentMargin(Side.SIDE_BOTTOM, value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_STYLEBOX, scriptIndex)
  }

  public open fun _draw(toCanvasItem: RID, rect: Rect2): Unit {
  }

  public open fun _getDrawRect(rect: Rect2): Rect2 {
    throw NotImplementedError("_get_draw_rect is not implemented for StyleBox")
  }

  /**
   * Virtual method to be implemented by the user. Returns a custom minimum size that the stylebox
   * must respect when drawing. By default [getMinimumSize] only takes content margins into account.
   * This method can be overridden to add another size restriction. A combination of the default
   * behavior and the output of this method will be used, to account for both sizes.
   */
  public open fun _getMinimumSize(): Vector2 {
    throw NotImplementedError("_get_minimum_size is not implemented for StyleBox")
  }

  public open fun _testMask(point: Vector2, rect: Rect2): Boolean {
    throw NotImplementedError("_test_mask is not implemented for StyleBox")
  }

  /**
   * Returns the minimum size that this stylebox can be shrunk to.
   */
  public fun getMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMinimumSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the default value of the specified [Side] to [offset] pixels.
   */
  public fun setContentMargin(margin: Side, offset: Float): Unit {
    TransferContext.writeArguments(LONG to margin.id, DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setContentMarginPtr, NIL)
  }

  /**
   * Sets the default margin to [offset] pixels for all sides.
   */
  public fun setContentMarginAll(offset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setContentMarginAllPtr, NIL)
  }

  /**
   * Returns the default margin of the specified [Side].
   */
  public fun getContentMargin(margin: Side): Float {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getContentMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the content margin offset for the specified [Side].
   * Positive values reduce size inwards, unlike [Control]'s margin values.
   */
  public fun getMargin(margin: Side): Float {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the "offset" of a stylebox. This helper function returns a value equivalent to
   * `Vector2(style.get_margin(MARGIN_LEFT), style.get_margin(MARGIN_TOP))`.
   */
  public fun getOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Draws this stylebox using a canvas item identified by the given [RID].
   * The [RID] value can either be the result of [CanvasItem.getCanvasItem] called on an existing
   * [CanvasItem]-derived node, or directly from creating a canvas item in the [RenderingServer] with
   * [RenderingServer.canvasItemCreate].
   */
  public fun draw(canvasItem: RID, rect: Rect2): Unit {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.drawPtr, NIL)
  }

  /**
   * Returns the [CanvasItem] that handles its [CanvasItem.NOTIFICATION_DRAW] or [CanvasItem.Draw]
   * callback at this moment.
   */
  public fun getCurrentItemDrawn(): CanvasItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentItemDrawnPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as CanvasItem?)
  }

  /**
   * Test a position in a rectangle, return whether it passes the mask test.
   */
  public fun testMask(point: Vector2, rect: Rect2): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.testMaskPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val getMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBox", "get_minimum_size", 3341600327)

    public val setContentMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBox", "set_content_margin", 4290182280)

    public val setContentMarginAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBox", "set_content_margin_all", 373806689)

    public val getContentMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBox", "get_content_margin", 2869120046)

    public val getMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBox", "get_margin", 2869120046)

    public val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBox", "get_offset", 3341600327)

    public val drawPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBox", "draw", 2275962004)

    public val getCurrentItemDrawnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBox", "get_current_item_drawn", 3213695180)

    public val testMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBox", "test_mask", 3735564539)
  }
}
