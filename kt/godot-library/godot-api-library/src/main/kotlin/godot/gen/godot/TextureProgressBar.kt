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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_TEXTUREPROGRESSBAR_INDEX: Int = 659

/**
 * TextureProgressBar works like [ProgressBar], but uses up to 3 textures instead of Godot's [Theme]
 * resource. It can be used to create horizontal, vertical and radial progress bars.
 */
@GodotBaseType
public open class TextureProgressBar : Range() {
  /**
   * The fill direction. See [FillMode] for possible values.
   */
  public final inline var fillMode: Int
    @JvmName("fillModeProperty")
    get() = getFillMode()
    @JvmName("fillModeProperty")
    set(`value`) {
      setFillMode(value)
    }

  /**
   * Starting angle for the fill of [textureProgress] if [fillMode] is [FILL_CLOCKWISE],
   * [FILL_COUNTER_CLOCKWISE], or [FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE]. When the node's `value` is
   * equal to its `min_value`, the texture doesn't show up at all. When the `value` increases, the
   * texture fills and tends towards [radialFillDegrees].
   */
  public final inline var radialInitialAngle: Float
    @JvmName("radialInitialAngleProperty")
    get() = getRadialInitialAngle()
    @JvmName("radialInitialAngleProperty")
    set(`value`) {
      setRadialInitialAngle(value)
    }

  /**
   * Upper limit for the fill of [textureProgress] if [fillMode] is [FILL_CLOCKWISE],
   * [FILL_COUNTER_CLOCKWISE], or [FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE]. When the node's `value` is
   * equal to its `max_value`, the texture fills up to this angle.
   * See [Range.value], [Range.maxValue].
   */
  public final inline var radialFillDegrees: Float
    @JvmName("radialFillDegreesProperty")
    get() = getFillDegrees()
    @JvmName("radialFillDegreesProperty")
    set(`value`) {
      setFillDegrees(value)
    }

  /**
   * Offsets [textureProgress] if [fillMode] is [FILL_CLOCKWISE], [FILL_COUNTER_CLOCKWISE], or
   * [FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE].
   */
  @CoreTypeLocalCopy
  public final inline var radialCenterOffset: Vector2
    @JvmName("radialCenterOffsetProperty")
    get() = getRadialCenterOffset()
    @JvmName("radialCenterOffsetProperty")
    set(`value`) {
      setRadialCenterOffset(value)
    }

  /**
   * If `true`, Godot treats the bar's textures like in [NinePatchRect]. Use the `stretch_margin_*`
   * properties like [stretchMarginBottom] to set up the nine patch's 3×3 grid. When using a radial
   * [fillMode], this setting will enable stretching.
   */
  public final inline var ninePatchStretch: Boolean
    @JvmName("ninePatchStretchProperty")
    get() = getNinePatchStretch()
    @JvmName("ninePatchStretchProperty")
    set(`value`) {
      setNinePatchStretch(value)
    }

  /**
   * The width of the 9-patch's left column. Only effective if [ninePatchStretch] is `true`.
   */
  public final inline var stretchMarginLeft: Int
    @JvmName("stretchMarginLeftProperty")
    get() = getStretchMargin(Side.SIDE_LEFT)
    @JvmName("stretchMarginLeftProperty")
    set(`value`) {
      setStretchMargin(Side.SIDE_LEFT, value)
    }

  /**
   * The height of the 9-patch's top row. Only effective if [ninePatchStretch] is `true`.
   */
  public final inline var stretchMarginTop: Int
    @JvmName("stretchMarginTopProperty")
    get() = getStretchMargin(Side.SIDE_TOP)
    @JvmName("stretchMarginTopProperty")
    set(`value`) {
      setStretchMargin(Side.SIDE_TOP, value)
    }

  /**
   * The width of the 9-patch's right column. Only effective if [ninePatchStretch] is `true`.
   */
  public final inline var stretchMarginRight: Int
    @JvmName("stretchMarginRightProperty")
    get() = getStretchMargin(Side.SIDE_RIGHT)
    @JvmName("stretchMarginRightProperty")
    set(`value`) {
      setStretchMargin(Side.SIDE_RIGHT, value)
    }

  /**
   * The height of the 9-patch's bottom row. A margin of 16 means the 9-slice's bottom corners and
   * side will have a height of 16 pixels. You can set all 4 margin values individually to create
   * panels with non-uniform borders. Only effective if [ninePatchStretch] is `true`.
   */
  public final inline var stretchMarginBottom: Int
    @JvmName("stretchMarginBottomProperty")
    get() = getStretchMargin(Side.SIDE_BOTTOM)
    @JvmName("stretchMarginBottomProperty")
    set(`value`) {
      setStretchMargin(Side.SIDE_BOTTOM, value)
    }

  /**
   * [Texture2D] that draws under the progress bar. The bar's background.
   */
  public final inline var textureUnder: Texture2D?
    @JvmName("textureUnderProperty")
    get() = getUnderTexture()
    @JvmName("textureUnderProperty")
    set(`value`) {
      setUnderTexture(value)
    }

  /**
   * [Texture2D] that draws over the progress bar. Use it to add highlights or an upper-frame that
   * hides part of [textureProgress].
   */
  public final inline var textureOver: Texture2D?
    @JvmName("textureOverProperty")
    get() = getOverTexture()
    @JvmName("textureOverProperty")
    set(`value`) {
      setOverTexture(value)
    }

  /**
   * [Texture2D] that clips based on the node's `value` and [fillMode]. As `value` increased, the
   * texture fills up. It shows entirely when `value` reaches `max_value`. It doesn't show at all if
   * `value` is equal to `min_value`.
   * The `value` property comes from [Range]. See [Range.value], [Range.minValue], [Range.maxValue].
   */
  public final inline var textureProgress: Texture2D?
    @JvmName("textureProgressProperty")
    get() = getProgressTexture()
    @JvmName("textureProgressProperty")
    set(`value`) {
      setProgressTexture(value)
    }

  /**
   * The offset of [textureProgress]. Useful for [textureOver] and [textureUnder] with fancy
   * borders, to avoid transparent margins in your progress texture.
   */
  @CoreTypeLocalCopy
  public final inline var textureProgressOffset: Vector2
    @JvmName("textureProgressOffsetProperty")
    get() = getTextureProgressOffset()
    @JvmName("textureProgressOffsetProperty")
    set(`value`) {
      setTextureProgressOffset(value)
    }

  /**
   * Multiplies the color of the bar's [textureUnder] texture.
   */
  @CoreTypeLocalCopy
  public final inline var tintUnder: Color
    @JvmName("tintUnderProperty")
    get() = getTintUnder()
    @JvmName("tintUnderProperty")
    set(`value`) {
      setTintUnder(value)
    }

  /**
   * Multiplies the color of the bar's [textureOver] texture. The effect is similar to
   * [CanvasItem.modulate], except it only affects this specific texture instead of the entire node.
   */
  @CoreTypeLocalCopy
  public final inline var tintOver: Color
    @JvmName("tintOverProperty")
    get() = getTintOver()
    @JvmName("tintOverProperty")
    set(`value`) {
      setTintOver(value)
    }

  /**
   * Multiplies the color of the bar's [textureProgress] texture.
   */
  @CoreTypeLocalCopy
  public final inline var tintProgress: Color
    @JvmName("tintProgressProperty")
    get() = getTintProgress()
    @JvmName("tintProgressProperty")
    set(`value`) {
      setTintProgress(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_TEXTUREPROGRESSBAR_INDEX, scriptIndex)
  }

  /**
   * Offsets [textureProgress] if [fillMode] is [FILL_CLOCKWISE], [FILL_COUNTER_CLOCKWISE], or
   * [FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE].
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
  public final fun radialCenterOffsetMutate(block: Vector2.() -> Unit): Vector2 =
      radialCenterOffset.apply{
      block(this)
      radialCenterOffset = this
  }


  /**
   * The offset of [textureProgress]. Useful for [textureOver] and [textureUnder] with fancy
   * borders, to avoid transparent margins in your progress texture.
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
  public final fun textureProgressOffsetMutate(block: Vector2.() -> Unit): Vector2 =
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
  public final fun tintUnderMutate(block: Color.() -> Unit): Color = tintUnder.apply{
      block(this)
      tintUnder = this
  }


  /**
   * Multiplies the color of the bar's [textureOver] texture. The effect is similar to
   * [CanvasItem.modulate], except it only affects this specific texture instead of the entire node.
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
  public final fun tintOverMutate(block: Color.() -> Unit): Color = tintOver.apply{
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
  public final fun tintProgressMutate(block: Color.() -> Unit): Color = tintProgress.apply{
      block(this)
      tintProgress = this
  }


  public final fun setUnderTexture(tex: Texture2D?): Unit {
    Internals.writeArguments(OBJECT to tex)
    Internals.callMethod(rawPtr, MethodBindings.setUnderTexturePtr, NIL)
  }

  public final fun getUnderTexture(): Texture2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUnderTexturePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setProgressTexture(tex: Texture2D?): Unit {
    Internals.writeArguments(OBJECT to tex)
    Internals.callMethod(rawPtr, MethodBindings.setProgressTexturePtr, NIL)
  }

  public final fun getProgressTexture(): Texture2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getProgressTexturePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setOverTexture(tex: Texture2D?): Unit {
    Internals.writeArguments(OBJECT to tex)
    Internals.callMethod(rawPtr, MethodBindings.setOverTexturePtr, NIL)
  }

  public final fun getOverTexture(): Texture2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOverTexturePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setFillMode(mode: Int): Unit {
    Internals.writeArguments(LONG to mode.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setFillModePtr, NIL)
  }

  public final fun getFillMode(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFillModePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTintUnder(tint: Color): Unit {
    Internals.writeArguments(COLOR to tint)
    Internals.callMethod(rawPtr, MethodBindings.setTintUnderPtr, NIL)
  }

  public final fun getTintUnder(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTintUnderPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setTintProgress(tint: Color): Unit {
    Internals.writeArguments(COLOR to tint)
    Internals.callMethod(rawPtr, MethodBindings.setTintProgressPtr, NIL)
  }

  public final fun getTintProgress(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTintProgressPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setTintOver(tint: Color): Unit {
    Internals.writeArguments(COLOR to tint)
    Internals.callMethod(rawPtr, MethodBindings.setTintOverPtr, NIL)
  }

  public final fun getTintOver(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTintOverPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setTextureProgressOffset(offset: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to offset)
    Internals.callMethod(rawPtr, MethodBindings.setTextureProgressOffsetPtr, NIL)
  }

  public final fun getTextureProgressOffset(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextureProgressOffsetPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setRadialInitialAngle(mode: Float): Unit {
    Internals.writeArguments(DOUBLE to mode.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRadialInitialAnglePtr, NIL)
  }

  public final fun getRadialInitialAngle(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRadialInitialAnglePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRadialCenterOffset(mode: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to mode)
    Internals.callMethod(rawPtr, MethodBindings.setRadialCenterOffsetPtr, NIL)
  }

  public final fun getRadialCenterOffset(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRadialCenterOffsetPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setFillDegrees(mode: Float): Unit {
    Internals.writeArguments(DOUBLE to mode.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setFillDegreesPtr, NIL)
  }

  public final fun getFillDegrees(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFillDegreesPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the stretch margin with the specified index. See [stretchMarginBottom] and related
   * properties.
   */
  public final fun setStretchMargin(margin: Side, `value`: Int): Unit {
    Internals.writeArguments(LONG to margin.id, LONG to value.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setStretchMarginPtr, NIL)
  }

  /**
   * Returns the stretch margin with the specified index. See [stretchMarginBottom] and related
   * properties.
   */
  public final fun getStretchMargin(margin: Side): Int {
    Internals.writeArguments(LONG to margin.id)
    Internals.callMethod(rawPtr, MethodBindings.getStretchMarginPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setNinePatchStretch(stretch: Boolean): Unit {
    Internals.writeArguments(BOOL to stretch)
    Internals.callMethod(rawPtr, MethodBindings.setNinePatchStretchPtr, NIL)
  }

  public final fun getNinePatchStretch(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNinePatchStretchPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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
     * Turns the node into a radial bar. The [textureProgress] fills clockwise. See
     * [radialCenterOffset], [radialInitialAngle] and [radialFillDegrees] to control the way the bar
     * fills up.
     */
    FILL_CLOCKWISE(4),
    /**
     * Turns the node into a radial bar. The [textureProgress] fills counterclockwise. See
     * [radialCenterOffset], [radialInitialAngle] and [radialFillDegrees] to control the way the bar
     * fills up.
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
     * Turns the node into a radial bar. The [textureProgress] fills radially from the center,
     * expanding both clockwise and counterclockwise. See [radialCenterOffset], [radialInitialAngle]
     * and [radialFillDegrees] to control the way the bar fills up.
     */
    FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FillMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setUnderTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "set_under_texture", 4051416890)

    internal val getUnderTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "get_under_texture", 3635182373)

    internal val setProgressTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "set_progress_texture", 4051416890)

    internal val getProgressTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "get_progress_texture", 3635182373)

    internal val setOverTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "set_over_texture", 4051416890)

    internal val getOverTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "get_over_texture", 3635182373)

    internal val setFillModePtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "set_fill_mode", 1286410249)

    internal val getFillModePtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "get_fill_mode", 2455072627)

    internal val setTintUnderPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "set_tint_under", 2920490490)

    internal val getTintUnderPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "get_tint_under", 3444240500)

    internal val setTintProgressPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "set_tint_progress", 2920490490)

    internal val getTintProgressPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "get_tint_progress", 3444240500)

    internal val setTintOverPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "set_tint_over", 2920490490)

    internal val getTintOverPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "get_tint_over", 3444240500)

    internal val setTextureProgressOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "set_texture_progress_offset", 743155724)

    internal val getTextureProgressOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "get_texture_progress_offset", 3341600327)

    internal val setRadialInitialAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "set_radial_initial_angle", 373806689)

    internal val getRadialInitialAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "get_radial_initial_angle", 191475506)

    internal val setRadialCenterOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "set_radial_center_offset", 743155724)

    internal val getRadialCenterOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "get_radial_center_offset", 1497962370)

    internal val setFillDegreesPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "set_fill_degrees", 373806689)

    internal val getFillDegreesPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "get_fill_degrees", 191475506)

    internal val setStretchMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "set_stretch_margin", 437707142)

    internal val getStretchMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "get_stretch_margin", 1983885014)

    internal val setNinePatchStretchPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "set_nine_patch_stretch", 2586408642)

    internal val getNinePatchStretchPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureProgressBar", "get_nine_patch_stretch", 36873697)
  }
}
