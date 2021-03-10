// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Customizable [godot.StyleBox] with a given set of parameters (no texture required).
 *
 * This [godot.StyleBox] can be used to achieve all kinds of looks without the need of a texture. Those properties are customizable:
 *
 * - Color
 *
 * - Border width (individual width for each border)
 *
 * - Rounded corners (individual radius for each corner)
 *
 * - Shadow (with blur and offset)
 *
 * Setting corner radius to high values is allowed. As soon as corners would overlap, the stylebox will switch to a relative system. Example:
 *
 * ```
 * 		height = 30
 * 		corner_radius_top_left = 50
 * 		corner_radius_bottom_left = 100
 * 		```
 *
 * The relative system now would take the 1:2 ratio of the two left corners to calculate the actual corner width. Both corners added will **never** be more than the height. Result:
 *
 * ```
 * 		corner_radius_top_left: 10
 * 		corner_radius_bottom_left: 20
 * 		```
 */
@GodotBaseType
open class StyleBoxFlat : StyleBox() {
  /**
   * Antialiasing draws a small ring around the edges, which fades to transparency. As a result, edges look much smoother. This is only noticeable when using rounded corners.
   */
  open var antiAliasing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_ANTI_ALIASING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_ANTI_ALIASING,
          NIL)
    }

  /**
   * This changes the size of the faded ring. Higher values can be used to achieve a "blurry" effect.
   */
  open var antiAliasingSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_ANTI_ALIASING_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_ANTI_ALIASING_SIZE, NIL)
    }

  /**
   * The background color of the stylebox.
   */
  open var bgColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BG_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BG_COLOR, NIL)
    }

  /**
   * If `true`, the border will fade into the background color.
   */
  open var borderBlend: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_BLEND,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_BLEND,
          NIL)
    }

  /**
   * Sets the color of the border.
   */
  open var borderColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_COLOR,
          NIL)
    }

  /**
   * Border width for the bottom border.
   */
  open var borderWidthBottom: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_WIDTH_BOTTOM, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_WIDTH_BOTTOM, NIL)
    }

  /**
   * Border width for the left border.
   */
  open var borderWidthLeft: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_WIDTH_LEFT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_WIDTH_LEFT, NIL)
    }

  /**
   * Border width for the right border.
   */
  open var borderWidthRight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_WIDTH_RIGHT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_WIDTH_RIGHT, NIL)
    }

  /**
   * Border width for the top border.
   */
  open var borderWidthTop: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_WIDTH_TOP,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_WIDTH_TOP,
          NIL)
    }

  /**
   * This sets the amount of vertices used for each corner. Higher values result in rounder corners but take more processing power to compute. When choosing a value, you should take the corner radius ([setCornerRadiusAll]) into account.
   *
   * For corner radii smaller than 10, `4` or `5` should be enough. For corner radii smaller than 30, values between `8` and `12` should be enough.
   *
   * A corner detail of `1` will result in chamfered corners instead of rounded corners, which is useful for some artistic effects.
   */
  open var cornerDetail: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_CORNER_DETAIL,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_DETAIL,
          NIL)
    }

  /**
   * The bottom-left corner's radius. If `0`, the corner is not rounded.
   */
  open var cornerRadiusBottomLeft: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_CORNER_RADIUS_BOTTOM_LEFT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_RADIUS_BOTTOM_LEFT, NIL)
    }

  /**
   * The bottom-right corner's radius. If `0`, the corner is not rounded.
   */
  open var cornerRadiusBottomRight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_CORNER_RADIUS_BOTTOM_RIGHT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_RADIUS_BOTTOM_RIGHT, NIL)
    }

  /**
   * The top-left corner's radius. If `0`, the corner is not rounded.
   */
  open var cornerRadiusTopLeft: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_CORNER_RADIUS_TOP_LEFT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_RADIUS_TOP_LEFT, NIL)
    }

  /**
   * The top-right corner's radius. If `0`, the corner is not rounded.
   */
  open var cornerRadiusTopRight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_CORNER_RADIUS_TOP_RIGHT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_RADIUS_TOP_RIGHT, NIL)
    }

  /**
   * Toggles drawing of the inner part of the stylebox.
   */
  open var drawCenter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_DRAW_CENTER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_DRAW_CENTER, NIL)
    }

  /**
   * Expands the stylebox outside of the control rect on the bottom edge. Useful in combination with [borderWidthBottom] to draw a border outside the control rect.
   */
  open var expandMarginBottom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_EXPAND_MARGIN_BOTTOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_EXPAND_MARGIN_BOTTOM, NIL)
    }

  /**
   * Expands the stylebox outside of the control rect on the left edge. Useful in combination with [borderWidthLeft] to draw a border outside the control rect.
   */
  open var expandMarginLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_EXPAND_MARGIN_LEFT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_EXPAND_MARGIN_LEFT, NIL)
    }

  /**
   * Expands the stylebox outside of the control rect on the right edge. Useful in combination with [borderWidthRight] to draw a border outside the control rect.
   */
  open var expandMarginRight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_EXPAND_MARGIN_RIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_EXPAND_MARGIN_RIGHT, NIL)
    }

  /**
   * Expands the stylebox outside of the control rect on the top edge. Useful in combination with [borderWidthTop] to draw a border outside the control rect.
   */
  open var expandMarginTop: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_EXPAND_MARGIN_TOP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_EXPAND_MARGIN_TOP, NIL)
    }

  /**
   * The color of the shadow. This has no effect if [shadowSize] is lower than 1.
   */
  open var shadowColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_SHADOW_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_SHADOW_COLOR,
          NIL)
    }

  /**
   * The shadow offset in pixels. Adjusts the position of the shadow relatively to the stylebox.
   */
  open var shadowOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_SHADOW_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_SHADOW_OFFSET,
          NIL)
    }

  /**
   * The shadow size in pixels.
   */
  open var shadowSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_SHADOW_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_SHADOW_SIZE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_STYLEBOXFLAT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun bgColor(schedule: Color.() -> Unit): Color = bgColor.apply{
      schedule(this)
      bgColor = this
  }


  open fun borderColor(schedule: Color.() -> Unit): Color = borderColor.apply{
      schedule(this)
      borderColor = this
  }


  open fun shadowColor(schedule: Color.() -> Unit): Color = shadowColor.apply{
      schedule(this)
      shadowColor = this
  }


  open fun shadowOffset(schedule: Vector2.() -> Unit): Vector2 = shadowOffset.apply{
      schedule(this)
      shadowOffset = this
  }


  /**
   * Returns the smallest border width out of all four borders.
   */
  open fun getBorderWidthMin(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_WIDTH_MIN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the border width to `width` pixels for all margins.
   */
  open fun setBorderWidthAll(width: Long) {
    TransferContext.writeArguments(LONG to width)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_WIDTH_ALL,
        NIL)
  }

  /**
   * Sets the corner radius to `radius` pixels for all corners.
   */
  open fun setCornerRadiusAll(radius: Long) {
    TransferContext.writeArguments(LONG to radius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_RADIUS_ALL,
        NIL)
  }

  /**
   * Sets the corner radius for each corner to `radius_top_left`, `radius_top_right`, `radius_bottom_right`, and `radius_bottom_left` pixels.
   */
  open fun setCornerRadiusIndividual(
    radiusTopLeft: Long,
    radiusTopRight: Long,
    radiusBottomRight: Long,
    radiusBottomLeft: Long
  ) {
    TransferContext.writeArguments(LONG to radiusTopLeft, LONG to radiusTopRight, LONG to
        radiusBottomRight, LONG to radiusBottomLeft)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_RADIUS_INDIVIDUAL, NIL)
  }

  /**
   * Sets the expand margin to `size` pixels for all margins.
   */
  open fun setExpandMarginAll(size: Double) {
    TransferContext.writeArguments(DOUBLE to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_EXPAND_MARGIN_ALL,
        NIL)
  }

  /**
   * Sets the expand margin for each margin to `size_left`, `size_top`, `size_right`, and `size_bottom` pixels.
   */
  open fun setExpandMarginIndividual(
    sizeLeft: Double,
    sizeTop: Double,
    sizeRight: Double,
    sizeBottom: Double
  ) {
    TransferContext.writeArguments(DOUBLE to sizeLeft, DOUBLE to sizeTop, DOUBLE to sizeRight,
        DOUBLE to sizeBottom)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_EXPAND_MARGIN_INDIVIDUAL, NIL)
  }
}
