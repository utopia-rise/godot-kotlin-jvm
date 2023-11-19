// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A customizable [godot.StyleBox] that doesn't use a texture.
 *
 * By configuring various properties of this style box, you can achieve many common looks without the need of a texture. This includes optionally rounded borders, antialiasing, shadows, and skew.
 *
 * Setting corner radius to high values is allowed. As soon as corners overlap, the stylebox will switch to a relative system.
 *
 * **Example:**
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
public open class StyleBoxFlat : StyleBox() {
  /**
   * The background color of the stylebox.
   */
  @CoreTypeLocalCopy
  public var bgColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBgColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBgColorPtr, NIL)
    }

  /**
   * Toggles drawing of the inner part of the stylebox.
   */
  public var drawCenter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawCenterEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawCenterPtr, NIL)
    }

  /**
   * If set to a non-zero value on either axis, [skew] distorts the StyleBox horizontally and/or vertically. This can be used for "futuristic"-style UIs. Positive values skew the StyleBox towards the right (X axis) and upwards (Y axis), while negative values skew the StyleBox towards the left (X axis) and downwards (Y axis).
   *
   * **Note:** To ensure text does not touch the StyleBox's edges, consider increasing the [godot.StyleBox]'s content margin (see [godot.StyleBox.contentMarginBottom]). It is preferable to increase the content margin instead of the expand margin (see [expandMarginBottom]), as increasing the expand margin does not increase the size of the clickable area for [godot.Control]s.
   */
  @CoreTypeLocalCopy
  public var skew: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkewPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkewPtr, NIL)
    }

  /**
   * Border width for the left border.
   */
  public var borderWidthLeft: Int
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderWidthPtr, NIL)
    }

  /**
   * Border width for the top border.
   */
  public var borderWidthTop: Int
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderWidthPtr, NIL)
    }

  /**
   * Border width for the right border.
   */
  public var borderWidthRight: Int
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderWidthPtr, NIL)
    }

  /**
   * Border width for the bottom border.
   */
  public var borderWidthBottom: Int
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderWidthPtr, NIL)
    }

  /**
   * Sets the color of the border.
   */
  @CoreTypeLocalCopy
  public var borderColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderColorPtr, NIL)
    }

  /**
   * If `true`, the border will fade into the background color.
   */
  public var borderBlend: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderBlendPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderBlendPtr, NIL)
    }

  /**
   * The top-left corner's radius. If `0`, the corner is not rounded.
   */
  public var cornerRadiusTopLeft: Int
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getCornerRadiusPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCornerRadiusPtr, NIL)
    }

  /**
   * The top-right corner's radius. If `0`, the corner is not rounded.
   */
  public var cornerRadiusTopRight: Int
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getCornerRadiusPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCornerRadiusPtr, NIL)
    }

  /**
   * The bottom-right corner's radius. If `0`, the corner is not rounded.
   */
  public var cornerRadiusBottomRight: Int
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getCornerRadiusPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCornerRadiusPtr, NIL)
    }

  /**
   * The bottom-left corner's radius. If `0`, the corner is not rounded.
   */
  public var cornerRadiusBottomLeft: Int
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getCornerRadiusPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCornerRadiusPtr, NIL)
    }

  /**
   * This sets the number of vertices used for each corner. Higher values result in rounder corners but take more processing power to compute. When choosing a value, you should take the corner radius ([setCornerRadiusAll]) into account.
   *
   * For corner radii less than 10, `4` or `5` should be enough. For corner radii less than 30, values between `8` and `12` should be enough.
   *
   * A corner detail of `1` will result in chamfered corners instead of rounded corners, which is useful for some artistic effects.
   */
  public var cornerDetail: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCornerDetailPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCornerDetailPtr, NIL)
    }

  /**
   * Expands the stylebox outside of the control rect on the left edge. Useful in combination with [borderWidthLeft] to draw a border outside the control rect.
   *
   * **Note:** Unlike [godot.StyleBox.contentMarginLeft], [expandMarginLeft] does *not* affect the size of the clickable area for [godot.Control]s. This can negatively impact usability if used wrong, as the user may try to click an area of the StyleBox that cannot actually receive clicks.
   */
  public var expandMarginLeft: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getExpandMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginPtr, NIL)
    }

  /**
   * Expands the stylebox outside of the control rect on the top edge. Useful in combination with [borderWidthTop] to draw a border outside the control rect.
   *
   * **Note:** Unlike [godot.StyleBox.contentMarginTop], [expandMarginTop] does *not* affect the size of the clickable area for [godot.Control]s. This can negatively impact usability if used wrong, as the user may try to click an area of the StyleBox that cannot actually receive clicks.
   */
  public var expandMarginTop: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getExpandMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginPtr, NIL)
    }

  /**
   * Expands the stylebox outside of the control rect on the right edge. Useful in combination with [borderWidthRight] to draw a border outside the control rect.
   *
   * **Note:** Unlike [godot.StyleBox.contentMarginRight], [expandMarginRight] does *not* affect the size of the clickable area for [godot.Control]s. This can negatively impact usability if used wrong, as the user may try to click an area of the StyleBox that cannot actually receive clicks.
   */
  public var expandMarginRight: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getExpandMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginPtr, NIL)
    }

  /**
   * Expands the stylebox outside of the control rect on the bottom edge. Useful in combination with [borderWidthBottom] to draw a border outside the control rect.
   *
   * **Note:** Unlike [godot.StyleBox.contentMarginBottom], [expandMarginBottom] does *not* affect the size of the clickable area for [godot.Control]s. This can negatively impact usability if used wrong, as the user may try to click an area of the StyleBox that cannot actually receive clicks.
   */
  public var expandMarginBottom: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getExpandMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginPtr, NIL)
    }

  /**
   * The color of the shadow. This has no effect if [shadowSize] is lower than 1.
   */
  @CoreTypeLocalCopy
  public var shadowColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShadowColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowColorPtr, NIL)
    }

  /**
   * The shadow size in pixels.
   */
  public var shadowSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShadowSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowSizePtr, NIL)
    }

  /**
   * The shadow offset in pixels. Adjusts the position of the shadow relatively to the stylebox.
   */
  @CoreTypeLocalCopy
  public var shadowOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShadowOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowOffsetPtr, NIL)
    }

  /**
   * Antialiasing draws a small ring around the edges, which fades to transparency. As a result, edges look much smoother. This is only noticeable when using rounded corners or [skew].
   *
   * **Note:** When using beveled corners with 45-degree angles ([cornerDetail] = 1), it is recommended to set [antiAliasing] to `false` to ensure crisp visuals and avoid possible visual glitches.
   */
  public var antiAliasing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAntiAliasedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAntiAliasedPtr, NIL)
    }

  /**
   * This changes the size of the antialiasing effect. `1.0` is recommended for an optimal result at 100% scale, identical to how rounded rectangles are rendered in web browsers and most vector drawing software.
   *
   * **Note:** Higher values may produce a blur effect but can also create undesired artifacts on small boxes with large-radius corners.
   */
  public var antiAliasingSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAaSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAaSizePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STYLEBOXFLAT, scriptIndex)
    return true
  }

  /**
   * The background color of the stylebox.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = styleboxflat.bgColor
   * //Your changes
   * styleboxflat.bgColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun bgColorMutate(block: Color.() -> Unit): Color = bgColor.apply{
      block(this)
      bgColor = this
  }


  /**
   * If set to a non-zero value on either axis, [skew] distorts the StyleBox horizontally and/or vertically. This can be used for "futuristic"-style UIs. Positive values skew the StyleBox towards the right (X axis) and upwards (Y axis), while negative values skew the StyleBox towards the left (X axis) and downwards (Y axis).
   *
   * **Note:** To ensure text does not touch the StyleBox's edges, consider increasing the [godot.StyleBox]'s content margin (see [godot.StyleBox.contentMarginBottom]). It is preferable to increase the content margin instead of the expand margin (see [expandMarginBottom]), as increasing the expand margin does not increase the size of the clickable area for [godot.Control]s.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = styleboxflat.skew
   * //Your changes
   * styleboxflat.skew = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun skewMutate(block: Vector2.() -> Unit): Vector2 = skew.apply{
      block(this)
      skew = this
  }


  /**
   * Sets the color of the border.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = styleboxflat.borderColor
   * //Your changes
   * styleboxflat.borderColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun borderColorMutate(block: Color.() -> Unit): Color = borderColor.apply{
      block(this)
      borderColor = this
  }


  /**
   * The color of the shadow. This has no effect if [shadowSize] is lower than 1.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = styleboxflat.shadowColor
   * //Your changes
   * styleboxflat.shadowColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun shadowColorMutate(block: Color.() -> Unit): Color = shadowColor.apply{
      block(this)
      shadowColor = this
  }


  /**
   * The shadow offset in pixels. Adjusts the position of the shadow relatively to the stylebox.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = styleboxflat.shadowOffset
   * //Your changes
   * styleboxflat.shadowOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun shadowOffsetMutate(block: Vector2.() -> Unit): Vector2 = shadowOffset.apply{
      block(this)
      shadowOffset = this
  }


  /**
   * Sets the border width to [width] pixels for all sides.
   */
  public fun setBorderWidthAll(width: Int): Unit {
    TransferContext.writeArguments(LONG to width.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setBorderWidthAllPtr, NIL)
  }

  /**
   * Returns the smallest border width out of all four borders.
   */
  public fun getBorderWidthMin(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBorderWidthMinPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the corner radius to [radius] pixels for all corners.
   */
  public fun setCornerRadiusAll(radius: Int): Unit {
    TransferContext.writeArguments(LONG to radius.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCornerRadiusAllPtr, NIL)
  }

  /**
   * Sets the expand margin to [size] pixels for all sides.
   */
  public fun setExpandMarginAll(size: Float): Unit {
    TransferContext.writeArguments(DOUBLE to size.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginAllPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setBgColorPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxFlat", "set_bg_color")

    public val getBgColorPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxFlat", "get_bg_color")

    public val setBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_border_color")

    public val getBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_border_color")

    public val setBorderWidthAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_border_width_all")

    public val getBorderWidthMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_border_width_min")

    public val setBorderWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_border_width")

    public val getBorderWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_border_width")

    public val setBorderBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_border_blend")

    public val getBorderBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_border_blend")

    public val setCornerRadiusAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_corner_radius_all")

    public val setCornerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_corner_radius")

    public val getCornerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_corner_radius")

    public val setExpandMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_expand_margin")

    public val setExpandMarginAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_expand_margin_all")

    public val getExpandMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_expand_margin")

    public val setDrawCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_draw_center")

    public val isDrawCenterEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "is_draw_center_enabled")

    public val setSkewPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxFlat", "set_skew")

    public val getSkewPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxFlat", "get_skew")

    public val setShadowColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_shadow_color")

    public val getShadowColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_shadow_color")

    public val setShadowSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_shadow_size")

    public val getShadowSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_shadow_size")

    public val setShadowOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_shadow_offset")

    public val getShadowOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_shadow_offset")

    public val setAntiAliasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_anti_aliased")

    public val isAntiAliasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "is_anti_aliased")

    public val setAaSizePtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxFlat", "set_aa_size")

    public val getAaSizePtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxFlat", "get_aa_size")

    public val setCornerDetailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_corner_detail")

    public val getCornerDetailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_corner_detail")
  }
}
