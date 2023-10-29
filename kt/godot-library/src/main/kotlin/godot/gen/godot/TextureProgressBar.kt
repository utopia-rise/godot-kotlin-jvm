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
import godot.core.VariantType.OBJECT
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
 * Texture-based progress bar. Useful for loading screens and life or stamina bars.
 *
 * TextureProgressBar works like [godot.ProgressBar], but uses up to 3 textures instead of Godot's [godot.Theme] resource. It can be used to create horizontal, vertical and radial progress bars.
 */
@GodotBaseType
public open class TextureProgressBar : Range() {
  /**
   * The fill direction. See [enum FillMode] for possible values.
   */
  public var fillMode: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFillModePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFillModePtr, NIL)
    }

  /**
   * If `true`, Godot treats the bar's textures like in [godot.NinePatchRect]. Use the `stretch_margin_*` properties like [stretchMarginBottom] to set up the nine patch's 3×3 grid. When using a radial [fillMode], this setting will enable stretching.
   */
  public var ninePatchStretch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNinePatchStretchPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNinePatchStretchPtr, NIL)
    }

  /**
   * The width of the 9-patch's left column.
   */
  public var stretchMarginLeft: Int
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchMarginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchMarginPtr, NIL)
    }

  /**
   * The height of the 9-patch's top row.
   */
  public var stretchMarginTop: Int
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchMarginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchMarginPtr, NIL)
    }

  /**
   * The width of the 9-patch's right column.
   */
  public var stretchMarginRight: Int
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchMarginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchMarginPtr, NIL)
    }

  /**
   * The height of the 9-patch's bottom row. A margin of 16 means the 9-slice's bottom corners and side will have a height of 16 pixels. You can set all 4 margin values individually to create panels with non-uniform borders.
   */
  public var stretchMarginBottom: Int
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchMarginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchMarginPtr, NIL)
    }

  /**
   * [godot.Texture2D] that draws under the progress bar. The bar's background.
   */
  public var textureUnder: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUnderTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUnderTexturePtr, NIL)
    }

  /**
   * [godot.Texture2D] that draws over the progress bar. Use it to add highlights or an upper-frame that hides part of [textureProgress].
   */
  public var textureOver: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOverTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOverTexturePtr, NIL)
    }

  /**
   * [godot.Texture2D] that clips based on the node's `value` and [fillMode]. As `value` increased, the texture fills up. It shows entirely when `value` reaches `max_value`. It doesn't show at all if `value` is equal to `min_value`.
   *
   * The `value` property comes from [godot.Range]. See [godot.Range.value], [godot.Range.minValue], [godot.Range.maxValue].
   */
  public var textureProgress: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProgressTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setProgressTexturePtr, NIL)
    }

  /**
   * The offset of [textureProgress]. Useful for [textureOver] and [textureUnder] with fancy borders, to avoid transparent margins in your progress texture.
   */
  @CoreTypeLocalCopy
  public var textureProgressOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureProgressOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureProgressOffsetPtr, NIL)
    }

  /**
   * Multiplies the color of the bar's [textureUnder] texture.
   */
  @CoreTypeLocalCopy
  public var tintUnder: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTintUnderPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTintUnderPtr, NIL)
    }

  /**
   * Multiplies the color of the bar's [textureOver] texture. The effect is similar to [godot.CanvasItem.modulate], except it only affects this specific texture instead of the entire node.
   */
  @CoreTypeLocalCopy
  public var tintOver: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTintOverPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTintOverPtr, NIL)
    }

  /**
   * Multiplies the color of the bar's [textureProgress] texture.
   */
  @CoreTypeLocalCopy
  public var tintProgress: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTintProgressPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTintProgressPtr, NIL)
    }

  /**
   * Starting angle for the fill of [textureProgress] if [fillMode] is [FILL_CLOCKWISE] or [FILL_COUNTER_CLOCKWISE]. When the node's `value` is equal to its `min_value`, the texture doesn't show up at all. When the `value` increases, the texture fills and tends towards [radialFillDegrees].
   */
  public var radialInitialAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadialInitialAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadialInitialAnglePtr, NIL)
    }

  /**
   * Upper limit for the fill of [textureProgress] if [fillMode] is [FILL_CLOCKWISE] or [FILL_COUNTER_CLOCKWISE]. When the node's `value` is equal to its `max_value`, the texture fills up to this angle.
   *
   * See [godot.Range.value], [godot.Range.maxValue].
   */
  public var radialFillDegrees: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFillDegreesPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFillDegreesPtr, NIL)
    }

  /**
   * Offsets [textureProgress] if [fillMode] is [FILL_CLOCKWISE] or [FILL_COUNTER_CLOCKWISE].
   */
  @CoreTypeLocalCopy
  public var radialCenterOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadialCenterOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRadialCenterOffsetPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTUREPROGRESSBAR, scriptIndex)
    return true
  }

  /**
   * The offset of [textureProgress]. Useful for [textureOver] and [textureUnder] with fancy borders, to avoid transparent margins in your progress texture.
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
   * val myCoreType = textureprogressbar.textureProgressOffset
   * //Your changes
   * textureprogressbar.textureProgressOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun textureProgressOffsetMutate(block: Vector2.() -> Unit): Vector2 =
      textureProgressOffset.apply{
      block(this)
      textureProgressOffset = this
  }


  /**
   * Multiplies the color of the bar's [textureUnder] texture.
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
   * val myCoreType = textureprogressbar.tintUnder
   * //Your changes
   * textureprogressbar.tintUnder = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun tintUnderMutate(block: Color.() -> Unit): Color = tintUnder.apply{
      block(this)
      tintUnder = this
  }


  /**
   * Multiplies the color of the bar's [textureOver] texture. The effect is similar to [godot.CanvasItem.modulate], except it only affects this specific texture instead of the entire node.
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
   * val myCoreType = textureprogressbar.tintOver
   * //Your changes
   * textureprogressbar.tintOver = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun tintOverMutate(block: Color.() -> Unit): Color = tintOver.apply{
      block(this)
      tintOver = this
  }


  /**
   * Multiplies the color of the bar's [textureProgress] texture.
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
   * val myCoreType = textureprogressbar.tintProgress
   * //Your changes
   * textureprogressbar.tintProgress = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun tintProgressMutate(block: Color.() -> Unit): Color = tintProgress.apply{
      block(this)
      tintProgress = this
  }


  /**
   * Offsets [textureProgress] if [fillMode] is [FILL_CLOCKWISE] or [FILL_COUNTER_CLOCKWISE].
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
   * val myCoreType = textureprogressbar.radialCenterOffset
   * //Your changes
   * textureprogressbar.radialCenterOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun radialCenterOffsetMutate(block: Vector2.() -> Unit): Vector2 =
      radialCenterOffset.apply{
      block(this)
      radialCenterOffset = this
  }


  public enum class FillMode(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setUnderTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_under_texture")

    public val getUnderTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_under_texture")

    public val setProgressTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_progress_texture")

    public val getProgressTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_progress_texture")

    public val setOverTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_over_texture")

    public val getOverTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_over_texture")

    public val setFillModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_fill_mode")

    public val getFillModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_fill_mode")

    public val setTintUnderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_tint_under")

    public val getTintUnderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_tint_under")

    public val setTintProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_tint_progress")

    public val getTintProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_tint_progress")

    public val setTintOverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_tint_over")

    public val getTintOverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_tint_over")

    public val setTextureProgressOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_texture_progress_offset")

    public val getTextureProgressOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_texture_progress_offset")

    public val setRadialInitialAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_radial_initial_angle")

    public val getRadialInitialAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_radial_initial_angle")

    public val setRadialCenterOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_radial_center_offset")

    public val getRadialCenterOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_radial_center_offset")

    public val setFillDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_fill_degrees")

    public val getFillDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_fill_degrees")

    public val setStretchMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_stretch_margin")

    public val getStretchMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_stretch_margin")

    public val setNinePatchStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_nine_patch_stretch")

    public val getNinePatchStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_nine_patch_stretch")
  }
}
