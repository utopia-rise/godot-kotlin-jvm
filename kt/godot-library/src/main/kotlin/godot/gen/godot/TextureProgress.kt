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
 * TextureProgress works like [godot.ProgressBar], but uses up to 3 textures instead of Godot's [godot.Theme] resource. It can be used to create horizontal, vertical and radial progress bars.
 */
@GodotBaseType
open class TextureProgress : Range() {
  /**
   * The fill direction. See [enum FillMode] for possible values.
   */
  open var fillMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_FILL_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_FILL_MODE,
          NIL)
    }

  /**
   * If `true`, Godot treats the bar's textures like in [godot.NinePatchRect]. Use the `stretch_margin_*` properties like [stretchMarginBottom] to set up the nine patch's 3×3 grid. When using a radial [fillMode], this setting will enable stretching.
   */
  open var ninePatchStretch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_NINE_PATCH_STRETCH, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_NINE_PATCH_STRETCH, NIL)
    }

  /**
   * Offsets [textureProgress] if [fillMode] is [FILL_CLOCKWISE] or [FILL_COUNTER_CLOCKWISE].
   */
  open var radialCenterOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_RADIAL_CENTER_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_RADIAL_CENTER_OFFSET, NIL)
    }

  /**
   * Upper limit for the fill of [textureProgress] if [fillMode] is [FILL_CLOCKWISE] or [FILL_COUNTER_CLOCKWISE]. When the node's `value` is equal to its `max_value`, the texture fills up to this angle.
   *
   * See [godot.Range.value], [godot.Range.maxValue].
   */
  open var radialFillDegrees: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_RADIAL_FILL_DEGREES, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_RADIAL_FILL_DEGREES, NIL)
    }

  /**
   * Starting angle for the fill of [textureProgress] if [fillMode] is [FILL_CLOCKWISE] or [FILL_COUNTER_CLOCKWISE]. When the node's `value` is equal to its `min_value`, the texture doesn't show up at all. When the `value` increases, the texture fills and tends towards [radialFillDegrees].
   */
  open var radialInitialAngle: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_RADIAL_INITIAL_ANGLE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_RADIAL_INITIAL_ANGLE, NIL)
    }

  /**
   * The height of the 9-patch's bottom row. A margin of 16 means the 9-slice's bottom corners and side will have a height of 16 pixels. You can set all 4 margin values individually to create panels with non-uniform borders.
   */
  open var stretchMarginBottom: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_STRETCH_MARGIN_BOTTOM, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_STRETCH_MARGIN_BOTTOM, NIL)
    }

  /**
   * The width of the 9-patch's left column.
   */
  open var stretchMarginLeft: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_STRETCH_MARGIN_LEFT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_STRETCH_MARGIN_LEFT, NIL)
    }

  /**
   * The width of the 9-patch's right column.
   */
  open var stretchMarginRight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_STRETCH_MARGIN_RIGHT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_STRETCH_MARGIN_RIGHT, NIL)
    }

  /**
   * The height of the 9-patch's top row.
   */
  open var stretchMarginTop: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_STRETCH_MARGIN_TOP, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_STRETCH_MARGIN_TOP, NIL)
    }

  /**
   * [godot.Texture] that draws over the progress bar. Use it to add highlights or an upper-frame that hides part of [textureProgress].
   */
  open var textureOver: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_TEXTURE_OVER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_TEXTURE_OVER,
          NIL)
    }

  /**
   * [godot.Texture] that clips based on the node's `value` and [fillMode]. As `value` increased, the texture fills up. It shows entirely when `value` reaches `max_value`. It doesn't show at all if `value` is equal to `min_value`.
   *
   * The `value` property comes from [godot.Range]. See [godot.Range.value], [godot.Range.minValue], [godot.Range.maxValue].
   */
  open var textureProgress: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_TEXTURE_PROGRESS, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_TEXTURE_PROGRESS, NIL)
    }

  /**
   * [godot.Texture] that draws under the progress bar. The bar's background.
   */
  open var textureUnder: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_TEXTURE_UNDER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_TEXTURE_UNDER,
          NIL)
    }

  /**
   * Multiplies the color of the bar's `texture_over` texture. The effect is similar to [godot.CanvasItem.modulate], except it only affects this specific texture instead of the entire node.
   */
  open var tintOver: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_TINT_OVER,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_TINT_OVER,
          NIL)
    }

  /**
   * Multiplies the color of the bar's `texture_progress` texture.
   */
  open var tintProgress: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_TINT_PROGRESS,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_TINT_PROGRESS,
          NIL)
    }

  /**
   * Multiplies the color of the bar's `texture_under` texture.
   */
  open var tintUnder: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_GET_TINT_UNDER,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREPROGRESS_SET_TINT_UNDER,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_TEXTUREPROGRESS,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun radialCenterOffset(schedule: Vector2.() -> Unit): Vector2 = radialCenterOffset.apply{
      schedule(this)
      radialCenterOffset = this
  }


  open fun tintOver(schedule: Color.() -> Unit): Color = tintOver.apply{
      schedule(this)
      tintOver = this
  }


  open fun tintProgress(schedule: Color.() -> Unit): Color = tintProgress.apply{
      schedule(this)
      tintProgress = this
  }


  open fun tintUnder(schedule: Color.() -> Unit): Color = tintUnder.apply{
      schedule(this)
      tintUnder = this
  }


  enum class FillMode(
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
    FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * The [textureProgress] fills from the center, expanding both towards the left and the right.
     */
    final const val FILL_BILINEAR_LEFT_AND_RIGHT: Long = 6

    /**
     * The [textureProgress] fills from the center, expanding both towards the top and the bottom.
     */
    final const val FILL_BILINEAR_TOP_AND_BOTTOM: Long = 7

    /**
     * The [textureProgress] fills from bottom to top.
     */
    final const val FILL_BOTTOM_TO_TOP: Long = 3

    /**
     * Turns the node into a radial bar. The [textureProgress] fills clockwise. See [radialCenterOffset], [radialInitialAngle] and [radialFillDegrees] to control the way the bar fills up.
     */
    final const val FILL_CLOCKWISE: Long = 4

    /**
     * Turns the node into a radial bar. The [textureProgress] fills radially from the center, expanding both clockwise and counterclockwise. See [radialCenterOffset], [radialInitialAngle] and [radialFillDegrees] to control the way the bar fills up.
     */
    final const val FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE: Long = 8

    /**
     * Turns the node into a radial bar. The [textureProgress] fills counterclockwise. See [radialCenterOffset], [radialInitialAngle] and [radialFillDegrees] to control the way the bar fills up.
     */
    final const val FILL_COUNTER_CLOCKWISE: Long = 5

    /**
     * The [textureProgress] fills from left to right.
     */
    final const val FILL_LEFT_TO_RIGHT: Long = 0

    /**
     * The [textureProgress] fills from right to left.
     */
    final const val FILL_RIGHT_TO_LEFT: Long = 1

    /**
     * The [textureProgress] fills from top to bottom.
     */
    final const val FILL_TOP_TO_BOTTOM: Long = 2
  }
}
