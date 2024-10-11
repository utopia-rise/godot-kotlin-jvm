// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GRADIENTTEXTURE2D_INDEX: Int = 284

/**
 * A 2D texture that obtains colors from a [Gradient] to fill the texture data. This texture is able
 * to transform a color transition into different patterns such as a linear or a radial gradient. The
 * gradient is sampled individually for each pixel so it does not necessarily represent an exact copy
 * of the gradient(see [width] and [height]). See also [GradientTexture1D], [CurveTexture] and
 * [CurveXYZTexture].
 */
@GodotBaseType
public open class GradientTexture2D : Texture2D() {
  /**
   * The [Gradient] used to fill the texture.
   */
  public final inline var gradient: Gradient?
    @JvmName("gradientProperty")
    get() = getGradient()
    @JvmName("gradientProperty")
    set(`value`) {
      setGradient(value)
    }

  /**
   * The number of horizontal color samples that will be obtained from the [Gradient], which also
   * represents the texture's width.
   */
  public final inline var width: Int
    @JvmName("widthProperty")
    get() = getWidth()
    @JvmName("widthProperty")
    set(`value`) {
      setWidth(value)
    }

  /**
   * The number of vertical color samples that will be obtained from the [Gradient], which also
   * represents the texture's height.
   */
  public final inline var height: Int
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  /**
   * If `true`, the generated texture will support high dynamic range ([Image.FORMAT_RGBAF] format).
   * This allows for glow effects to work if [Environment.glowEnabled] is `true`. If `false`, the
   * generated texture will use low dynamic range; overbright colors will be clamped
   * ([Image.FORMAT_RGBA8] format).
   */
  public final inline var useHdr: Boolean
    @JvmName("useHdrProperty")
    get() = isUsingHdr()
    @JvmName("useHdrProperty")
    set(`value`) {
      setUseHdr(value)
    }

  /**
   * The gradient fill type, one of the [Fill] values. The texture is filled by interpolating colors
   * starting from [fillFrom] to [fillTo] offsets.
   */
  public final inline var fill: Fill
    @JvmName("fillProperty")
    get() = getFill()
    @JvmName("fillProperty")
    set(`value`) {
      setFill(value)
    }

  /**
   * The initial offset used to fill the texture specified in UV coordinates.
   */
  @CoreTypeLocalCopy
  public final inline var fillFrom: Vector2
    @JvmName("fillFromProperty")
    get() = getFillFrom()
    @JvmName("fillFromProperty")
    set(`value`) {
      setFillFrom(value)
    }

  /**
   * The final offset used to fill the texture specified in UV coordinates.
   */
  @CoreTypeLocalCopy
  public final inline var fillTo: Vector2
    @JvmName("fillToProperty")
    get() = getFillTo()
    @JvmName("fillToProperty")
    set(`value`) {
      setFillTo(value)
    }

  /**
   * The gradient repeat type, one of the [Repeat] values. The texture is filled starting from
   * [fillFrom] to [fillTo] offsets by default, but the gradient fill can be repeated to cover the
   * entire texture.
   */
  public final inline var repeat: Repeat
    @JvmName("repeatProperty")
    get() = getRepeat()
    @JvmName("repeatProperty")
    set(`value`) {
      setRepeat(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_GRADIENTTEXTURE2D_INDEX, scriptIndex)
  }

  /**
   * The initial offset used to fill the texture specified in UV coordinates.
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
   * val myCoreType = gradienttexture2d.fillFrom
   * //Your changes
   * gradienttexture2d.fillFrom = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun fillFromMutate(block: Vector2.() -> Unit): Vector2 = fillFrom.apply{
      block(this)
      fillFrom = this
  }


  /**
   * The final offset used to fill the texture specified in UV coordinates.
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
   * val myCoreType = gradienttexture2d.fillTo
   * //Your changes
   * gradienttexture2d.fillTo = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun fillToMutate(block: Vector2.() -> Unit): Vector2 = fillTo.apply{
      block(this)
      fillTo = this
  }


  public final fun setGradient(gradient: Gradient?): Unit {
    Internals.writeArguments(OBJECT to gradient)
    Internals.callMethod(rawPtr, MethodBindings.setGradientPtr, NIL)
  }

  public final fun getGradient(): Gradient? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGradientPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Gradient?)
  }

  public final fun setWidth(width: Int): Unit {
    Internals.writeArguments(LONG to width.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun setHeight(height: Int): Unit {
    Internals.writeArguments(LONG to height.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun setUseHdr(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setUseHdrPtr, NIL)
  }

  public final fun isUsingHdr(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUsingHdrPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFill(fill: Fill): Unit {
    Internals.writeArguments(LONG to fill.id)
    Internals.callMethod(rawPtr, MethodBindings.setFillPtr, NIL)
  }

  public final fun getFill(): Fill {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFillPtr, LONG)
    return GradientTexture2D.Fill.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setFillFrom(fillFrom: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to fillFrom)
    Internals.callMethod(rawPtr, MethodBindings.setFillFromPtr, NIL)
  }

  public final fun getFillFrom(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFillFromPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setFillTo(fillTo: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to fillTo)
    Internals.callMethod(rawPtr, MethodBindings.setFillToPtr, NIL)
  }

  public final fun getFillTo(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFillToPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setRepeat(repeat: Repeat): Unit {
    Internals.writeArguments(LONG to repeat.id)
    Internals.callMethod(rawPtr, MethodBindings.setRepeatPtr, NIL)
  }

  public final fun getRepeat(): Repeat {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRepeatPtr, LONG)
    return GradientTexture2D.Repeat.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class Fill(
    id: Long,
  ) {
    /**
     * The colors are linearly interpolated in a straight line.
     */
    FILL_LINEAR(0),
    /**
     * The colors are linearly interpolated in a circular pattern.
     */
    FILL_RADIAL(1),
    /**
     * The colors are linearly interpolated in a square pattern.
     */
    FILL_SQUARE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Fill = entries.single { it.id == `value` }
    }
  }

  public enum class Repeat(
    id: Long,
  ) {
    /**
     * The gradient fill is restricted to the range defined by [fillFrom] to [fillTo] offsets.
     */
    REPEAT_NONE(0),
    /**
     * The texture is filled starting from [fillFrom] to [fillTo] offsets, repeating the same
     * pattern in both directions.
     */
    REPEAT(1),
    /**
     * The texture is filled starting from [fillFrom] to [fillTo] offsets, mirroring the pattern in
     * both directions.
     */
    REPEAT_MIRROR(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Repeat = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setGradientPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture2D", "set_gradient", 2756054477)

    internal val getGradientPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture2D", "get_gradient", 132272999)

    internal val setWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture2D", "set_width", 1286410249)

    internal val setHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture2D", "set_height", 1286410249)

    internal val setUseHdrPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture2D", "set_use_hdr", 2586408642)

    internal val isUsingHdrPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture2D", "is_using_hdr", 36873697)

    internal val setFillPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture2D", "set_fill", 3623927636)

    internal val getFillPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture2D", "get_fill", 1876227217)

    internal val setFillFromPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture2D", "set_fill_from", 743155724)

    internal val getFillFromPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture2D", "get_fill_from", 3341600327)

    internal val setFillToPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture2D", "set_fill_to", 743155724)

    internal val getFillToPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture2D", "get_fill_to", 3341600327)

    internal val setRepeatPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture2D", "set_repeat", 1357597002)

    internal val getRepeatPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture2D", "get_repeat", 3351758665)
  }
}
