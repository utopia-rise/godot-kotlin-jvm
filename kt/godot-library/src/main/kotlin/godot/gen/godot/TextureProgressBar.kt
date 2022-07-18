// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Texture-based progress bar. Useful for loading screens and life or stamina bars.
 *
 * TextureProgressBar works like [godot.ProgressBar], but uses up to 3 textures instead of Godot's [godot.Theme] resource. It can be used to create horizontal, vertical and radial progress bars.
 */
@GodotBaseType
public open class TextureProgressBar : Range() {
  /**
   * The fill direction. See [enum FillMode] for possible values.
   */
  public var fillMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_GET_FILL_MODE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_SET_FILL_MODE,
          NIL.ordinal)
    }

  /**
   * If `true`, Godot treats the bar's textures like in [godot.NinePatchRect]. Use the `stretch_margin_*` properties like [stretchMarginBottom] to set up the nine patch's 3×3 grid. When using a radial [fillMode], this setting will enable stretching.
   */
  public var ninePatchStretch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_GET_NINE_PATCH_STRETCH, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_SET_NINE_PATCH_STRETCH, NIL.ordinal)
    }

  /**
   * [godot.Texture2D] that draws under the progress bar. The bar's background.
   */
  public var textureUnder: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_GET_UNDER_TEXTURE,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_SET_UNDER_TEXTURE,
          NIL.ordinal)
    }

  /**
   * [godot.Texture2D] that draws over the progress bar. Use it to add highlights or an upper-frame that hides part of [textureProgress].
   */
  public var textureOver: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_GET_OVER_TEXTURE,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_SET_OVER_TEXTURE,
          NIL.ordinal)
    }

  /**
   * [godot.Texture2D] that clips based on the node's `value` and [fillMode]. As `value` increased, the texture fills up. It shows entirely when `value` reaches `max_value`. It doesn't show at all if `value` is equal to `min_value`.
   *
   * The `value` property comes from [godot.Range]. See [godot.Range.value], [godot.Range.minValue], [godot.Range.maxValue].
   */
  public var textureProgress: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_GET_PROGRESS_TEXTURE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_SET_PROGRESS_TEXTURE, NIL.ordinal)
    }

  /**
   * The offset of [textureProgress]. Useful for [textureOver] and [textureUnder] with fancy borders, to avoid transparent margins in your progress texture.
   */
  public var textureProgressOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_GET_TEXTURE_PROGRESS_OFFSET, VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_SET_TEXTURE_PROGRESS_OFFSET, NIL.ordinal)
    }

  /**
   * Multiplies the color of the bar's `texture_under` texture.
   */
  public var tintUnder: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_GET_TINT_UNDER,
          COLOR.ordinal)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_SET_TINT_UNDER,
          NIL.ordinal)
    }

  /**
   * Multiplies the color of the bar's `texture_over` texture. The effect is similar to [godot.CanvasItem.modulate], except it only affects this specific texture instead of the entire node.
   */
  public var tintOver: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_GET_TINT_OVER,
          COLOR.ordinal)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_SET_TINT_OVER,
          NIL.ordinal)
    }

  /**
   * Multiplies the color of the bar's `texture_progress` texture.
   */
  public var tintProgress: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_GET_TINT_PROGRESS,
          COLOR.ordinal)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_SET_TINT_PROGRESS,
          NIL.ordinal)
    }

  /**
   * Starting angle for the fill of [textureProgress] if [fillMode] is [FILL_CLOCKWISE] or [FILL_COUNTER_CLOCKWISE]. When the node's `value` is equal to its `min_value`, the texture doesn't show up at all. When the `value` increases, the texture fills and tends towards [radialFillDegrees].
   */
  public var radialInitialAngle: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_GET_RADIAL_INITIAL_ANGLE, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_SET_RADIAL_INITIAL_ANGLE, NIL.ordinal)
    }

  /**
   * Upper limit for the fill of [textureProgress] if [fillMode] is [FILL_CLOCKWISE] or [FILL_COUNTER_CLOCKWISE]. When the node's `value` is equal to its `max_value`, the texture fills up to this angle.
   *
   * See [godot.Range.value], [godot.Range.maxValue].
   */
  public var radialFillDegrees: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_GET_FILL_DEGREES,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_SET_FILL_DEGREES,
          NIL.ordinal)
    }

  /**
   * Offsets [textureProgress] if [fillMode] is [FILL_CLOCKWISE] or [FILL_COUNTER_CLOCKWISE].
   */
  public var radialCenterOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_GET_RADIAL_CENTER_OFFSET, VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_SET_RADIAL_CENTER_OFFSET, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TEXTUREPROGRESSBAR)
  }

  /**
   *
   */
  public fun setStretchMargin(margin: Side, `value`: Long): Unit {
    TransferContext.writeArguments(LONG to margin.id, LONG to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_SET_STRETCH_MARGIN,
        NIL.ordinal)
  }

  /**
   *
   */
  public fun getStretchMargin(margin: Side): Long {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESSBAR_GET_STRETCH_MARGIN,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class FillMode(
    id: Long
  ) {
    /**
     * The [textureProgress] fills from left to right.
     */
    FILL_LEFT_TO_RIGHT(0),
    /**
     * The [textureProgress] fills from right to left.
     */
    FILL_RIGHT_TO_LEFT(1),
    /**
     * The [textureProgress] fills from top to bottom.
     */
    FILL_TOP_TO_BOTTOM(2),
    /**
     * The [textureProgress] fills from bottom to top.
     */
    FILL_BOTTOM_TO_TOP(3),
    /**
     * Turns the node into a radial bar. The [textureProgress] fills clockwise. See [radialCenterOffset], [radialInitialAngle] and [radialFillDegrees] to control the way the bar fills up.
     */
    FILL_CLOCKWISE(4),
    /**
     * Turns the node into a radial bar. The [textureProgress] fills counterclockwise. See [radialCenterOffset], [radialInitialAngle] and [radialFillDegrees] to control the way the bar fills up.
     */
    FILL_COUNTER_CLOCKWISE(5),
    /**
     * The [textureProgress] fills from the center, expanding both towards the left and the right.
     */
    FILL_BILINEAR_LEFT_AND_RIGHT(6),
    /**
     * The [textureProgress] fills from the center, expanding both towards the top and the bottom.
     */
    FILL_BILINEAR_TOP_AND_BOTTOM(7),
    /**
     * Turns the node into a radial bar. The [textureProgress] fills radially from the center, expanding both clockwise and counterclockwise. See [radialCenterOffset], [radialInitialAngle] and [radialFillDegrees] to control the way the bar fills up.
     */
    FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
