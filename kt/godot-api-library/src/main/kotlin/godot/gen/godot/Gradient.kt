// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_COLOR_ARRAY
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GRADIENT_INDEX: Int = 262

/**
 * This resource describes a color transition by defining a set of colored points and how to
 * interpolate between them.
 * See also [Curve] which supports more complex easing methods, but does not support colors.
 */
@GodotBaseType
public open class Gradient : Resource() {
  /**
   * The algorithm used to interpolate between points of the gradient. See [InterpolationMode] for
   * available modes.
   */
  public final inline var interpolationMode: InterpolationMode
    @JvmName("interpolationModeProperty")
    get() = getInterpolationMode()
    @JvmName("interpolationModeProperty")
    set(`value`) {
      setInterpolationMode(value)
    }

  /**
   * The color space used to interpolate between points of the gradient. It does not affect the
   * returned colors, which will always be in sRGB space. See [ColorSpace] for available modes.
   * **Note:** This setting has no effect when [interpolationMode] is set to
   * [GRADIENT_INTERPOLATE_CONSTANT].
   */
  public final inline var interpolationColorSpace: ColorSpace
    @JvmName("interpolationColorSpaceProperty")
    get() = getInterpolationColorSpace()
    @JvmName("interpolationColorSpaceProperty")
    set(`value`) {
      setInterpolationColorSpace(value)
    }

  /**
   * Gradient's offsets as a [PackedFloat32Array].
   * **Note:** Setting this property updates all offsets at once. To update any offset individually
   * use [setOffset].
   */
  public final inline var offsets: PackedFloat32Array
    @JvmName("offsetsProperty")
    get() = getOffsets()
    @JvmName("offsetsProperty")
    set(`value`) {
      setOffsets(value)
    }

  /**
   * Gradient's colors as a [PackedColorArray].
   * **Note:** Setting this property updates all colors at once. To update any color individually
   * use [setColor].
   */
  public final inline var colors: PackedColorArray
    @JvmName("colorsProperty")
    get() = getColors()
    @JvmName("colorsProperty")
    set(`value`) {
      setColors(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_GRADIENT_INDEX, scriptIndex)
  }

  /**
   * Adds the specified color to the gradient, with the specified offset.
   */
  public final fun addPoint(offset: Float, color: Color): Unit {
    Internals.writeArguments(DOUBLE to offset.toDouble(), COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.addPointPtr, NIL)
  }

  /**
   * Removes the color at index [point].
   */
  public final fun removePoint(point: Int): Unit {
    Internals.writeArguments(LONG to point.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removePointPtr, NIL)
  }

  /**
   * Sets the offset for the gradient color at index [point].
   */
  public final fun setOffset(point: Int, offset: Float): Unit {
    Internals.writeArguments(LONG to point.toLong(), DOUBLE to offset.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
  }

  /**
   * Returns the offset of the gradient color at index [point].
   */
  public final fun getOffset(point: Int): Float {
    Internals.writeArguments(LONG to point.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getOffsetPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Reverses/mirrors the gradient.
   * **Note:** This method mirrors all points around the middle of the gradient, which may produce
   * unexpected results when [interpolationMode] is set to [GRADIENT_INTERPOLATE_CONSTANT].
   */
  public final fun reverse(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.reversePtr, NIL)
  }

  /**
   * Sets the color of the gradient color at index [point].
   */
  public final fun setColor(point: Int, color: Color): Unit {
    Internals.writeArguments(LONG to point.toLong(), COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
  }

  /**
   * Returns the color of the gradient color at index [point].
   */
  public final fun getColor(point: Int): Color {
    Internals.writeArguments(LONG to point.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  /**
   * Returns the interpolated color specified by [offset].
   */
  public final fun sample(offset: Float): Color {
    Internals.writeArguments(DOUBLE to offset.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.samplePtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  /**
   * Returns the number of colors in the gradient.
   */
  public final fun getPointCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPointCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setOffsets(offsets: PackedFloat32Array): Unit {
    Internals.writeArguments(PACKED_FLOAT_32_ARRAY to offsets)
    Internals.callMethod(rawPtr, MethodBindings.setOffsetsPtr, NIL)
  }

  public final fun getOffsets(): PackedFloat32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOffsetsPtr, PACKED_FLOAT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_FLOAT_32_ARRAY) as PackedFloat32Array)
  }

  public final fun setColors(colors: PackedColorArray): Unit {
    Internals.writeArguments(PACKED_COLOR_ARRAY to colors)
    Internals.callMethod(rawPtr, MethodBindings.setColorsPtr, NIL)
  }

  public final fun getColors(): PackedColorArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColorsPtr, PACKED_COLOR_ARRAY)
    return (Internals.readReturnValue(PACKED_COLOR_ARRAY) as PackedColorArray)
  }

  public final fun setInterpolationMode(interpolationMode: InterpolationMode): Unit {
    Internals.writeArguments(LONG to interpolationMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setInterpolationModePtr, NIL)
  }

  public final fun getInterpolationMode(): InterpolationMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInterpolationModePtr, LONG)
    return Gradient.InterpolationMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setInterpolationColorSpace(interpolationColorSpace: ColorSpace): Unit {
    Internals.writeArguments(LONG to interpolationColorSpace.id)
    Internals.callMethod(rawPtr, MethodBindings.setInterpolationColorSpacePtr, NIL)
  }

  public final fun getInterpolationColorSpace(): ColorSpace {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInterpolationColorSpacePtr, LONG)
    return Gradient.ColorSpace.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class InterpolationMode(
    id: Long,
  ) {
    /**
     * Linear interpolation.
     */
    GRADIENT_INTERPOLATE_LINEAR(0),
    /**
     * Constant interpolation, color changes abruptly at each point and stays uniform between. This
     * might cause visible aliasing when used for a gradient texture in some cases.
     */
    GRADIENT_INTERPOLATE_CONSTANT(1),
    /**
     * Cubic interpolation.
     */
    GRADIENT_INTERPOLATE_CUBIC(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): InterpolationMode = entries.single { it.id == `value` }
    }
  }

  public enum class ColorSpace(
    id: Long,
  ) {
    /**
     * sRGB color space.
     */
    GRADIENT_COLOR_SPACE_SRGB(0),
    /**
     * Linear sRGB color space.
     */
    GRADIENT_COLOR_SPACE_LINEAR_SRGB(1),
    /**
     * [url=https://bottosson.github.io/posts/oklab/]Oklab[/url] color space. This color space
     * provides a smooth and uniform-looking transition between colors.
     */
    GRADIENT_COLOR_SPACE_OKLAB(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ColorSpace = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val addPointPtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "add_point", 3629403827)

    public val removePointPtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "remove_point", 1286410249)

    public val setOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "set_offset", 1602489585)

    public val getOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "get_offset", 4025615559)

    public val reversePtr: VoidPtr = Internals.getMethodBindPtr("Gradient", "reverse", 3218959716)

    public val setColorPtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "set_color", 2878471219)

    public val getColorPtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "get_color", 2624840992)

    public val samplePtr: VoidPtr = Internals.getMethodBindPtr("Gradient", "sample", 1250405064)

    public val getPointCountPtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "get_point_count", 3905245786)

    public val setOffsetsPtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "set_offsets", 2899603908)

    public val getOffsetsPtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "get_offsets", 675695659)

    public val setColorsPtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "set_colors", 3546319833)

    public val getColorsPtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "get_colors", 1392750486)

    public val setInterpolationModePtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "set_interpolation_mode", 1971444490)

    public val getInterpolationModePtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "get_interpolation_mode", 3674172981)

    public val setInterpolationColorSpacePtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "set_interpolation_color_space", 3685995981)

    public val getInterpolationColorSpacePtr: VoidPtr =
        Internals.getMethodBindPtr("Gradient", "get_interpolation_color_space", 1538296000)
  }
}
