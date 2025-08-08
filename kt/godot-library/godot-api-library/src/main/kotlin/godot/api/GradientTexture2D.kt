// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A 2D texture that obtains colors from a [Gradient] to fill the texture data. This texture is able to transform a color transition into different patterns such as a linear or a radial gradient. The gradient is sampled individually for each pixel so it does not necessarily represent an exact copy of the gradient(see [width] and [height]). See also [GradientTexture1D], [CurveTexture] and [CurveXYZTexture].
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
   * The number of horizontal color samples that will be obtained from the [Gradient], which also represents the texture's width.
   */
  public final inline var width: Int
    @JvmName("widthProperty")
    get() = getWidth()
    @JvmName("widthProperty")
    set(`value`) {
      setWidth(value)
    }

  /**
   * The number of vertical color samples that will be obtained from the [Gradient], which also represents the texture's height.
   */
  public final inline var height: Int
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  /**
   * If `true`, the generated texture will support high dynamic range ([Image.FORMAT_RGBAF] format). This allows for glow effects to work if [Environment.glowEnabled] is `true`. If `false`, the generated texture will use low dynamic range; overbright colors will be clamped ([Image.FORMAT_RGBA8] format).
   */
  public final inline var useHdr: Boolean
    @JvmName("useHdrProperty")
    get() = isUsingHdr()
    @JvmName("useHdrProperty")
    set(`value`) {
      setUseHdr(value)
    }

  /**
   * The gradient fill type, one of the [Fill] values. The texture is filled by interpolating colors starting from [fillFrom] to [fillTo] offsets.
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
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
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
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
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
   * The gradient repeat type, one of the [Repeat] values. The texture is filled starting from [fillFrom] to [fillTo] offsets by default, but the gradient fill can be repeated to cover the entire texture.
   */
  public final inline var repeat: Repeat
    @JvmName("repeatProperty")
    get() = getRepeat()
    @JvmName("repeatProperty")
    set(`value`) {
      setRepeat(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(261, scriptIndex)
  }

  /**
   * This is a helper function for [fillFrom] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gradienttexture2d.fillFrom
   * //Your changes
   * gradienttexture2d.fillFrom = myCoreType
   * ``````
   *
   * The initial offset used to fill the texture specified in UV coordinates.
   */
  @CoreTypeHelper
  public final fun fillFromMutate(block: Vector2.() -> Unit): Vector2 = fillFrom.apply {
     block(this)
     fillFrom = this
  }

  /**
   * This is a helper function for [fillTo] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gradienttexture2d.fillTo
   * //Your changes
   * gradienttexture2d.fillTo = myCoreType
   * ``````
   *
   * The final offset used to fill the texture specified in UV coordinates.
   */
  @CoreTypeHelper
  public final fun fillToMutate(block: Vector2.() -> Unit): Vector2 = fillTo.apply {
     block(this)
     fillTo = this
  }

  public final fun setGradient(gradient: Gradient?) {
    TransferContext.writeArguments(OBJECT to gradient)
    TransferContext.callMethod(ptr, MethodBindings.setGradientPtr, NIL)
  }

  public final fun getGradient(): Gradient? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGradientPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Gradient?)
  }

  public final fun setWidth(width: Int) {
    TransferContext.writeArguments(LONG to width.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun setHeight(height: Int) {
    TransferContext.writeArguments(LONG to height.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun setUseHdr(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUseHdrPtr, NIL)
  }

  public final fun isUsingHdr(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingHdrPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFill(fill: Fill) {
    TransferContext.writeArguments(LONG to fill.id)
    TransferContext.callMethod(ptr, MethodBindings.setFillPtr, NIL)
  }

  public final fun getFill(): Fill {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFillPtr, LONG)
    return Fill.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setFillFrom(fillFrom: Vector2) {
    TransferContext.writeArguments(VECTOR2 to fillFrom)
    TransferContext.callMethod(ptr, MethodBindings.setFillFromPtr, NIL)
  }

  public final fun getFillFrom(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFillFromPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setFillTo(fillTo: Vector2) {
    TransferContext.writeArguments(VECTOR2 to fillTo)
    TransferContext.callMethod(ptr, MethodBindings.setFillToPtr, NIL)
  }

  public final fun getFillTo(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFillToPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setRepeat(repeat: Repeat) {
    TransferContext.writeArguments(LONG to repeat.id)
    TransferContext.callMethod(ptr, MethodBindings.setRepeatPtr, NIL)
  }

  public final fun getRepeat(): Repeat {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRepeatPtr, LONG)
    return Repeat.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getWidth(): Int {
    throw NotImplementedError("GradientTexture2D::_getWidth can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getHeight(): Int {
    throw NotImplementedError("GradientTexture2D::_getHeight can't be called from the JVM.")
  }

  public enum class Fill(
    id: Long,
  ) {
    /**
     * The colors are linearly interpolated in a straight line.
     */
    LINEAR(0),
    /**
     * The colors are linearly interpolated in a circular pattern.
     */
    RADIAL(1),
    /**
     * The colors are linearly interpolated in a square pattern.
     */
    SQUARE(2),
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
    NONE(0),
    /**
     * The texture is filled starting from [fillFrom] to [fillTo] offsets, repeating the same pattern in both directions.
     */
    REPEAT(1),
    /**
     * The texture is filled starting from [fillFrom] to [fillTo] offsets, mirroring the pattern in both directions.
     */
    MIRROR(2),
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
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_gradient", 2_756_054_477)

    internal val getGradientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "get_gradient", 132_272_999)

    internal val setWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_width", 1_286_410_249)

    internal val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_height", 1_286_410_249)

    internal val setUseHdrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_use_hdr", 2_586_408_642)

    internal val isUsingHdrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "is_using_hdr", 36_873_697)

    internal val setFillPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_fill", 3_623_927_636)

    internal val getFillPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "get_fill", 1_876_227_217)

    internal val setFillFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_fill_from", 743_155_724)

    internal val getFillFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "get_fill_from", 3_341_600_327)

    internal val setFillToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_fill_to", 743_155_724)

    internal val getFillToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "get_fill_to", 3_341_600_327)

    internal val setRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_repeat", 1_357_597_002)

    internal val getRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "get_repeat", 3_351_758_665)
  }
}
