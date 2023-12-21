// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public var gradient: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGradientPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Gradient?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGradientPtr, NIL)
    }

  /**
   * The number of horizontal color samples that will be obtained from the [Gradient], which also
   * represents the texture's width.
   */
  public var width: Int
    @JvmName("getWidth_prop")
    get() = super.getWidth()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
    }

  /**
   * The number of vertical color samples that will be obtained from the [Gradient], which also
   * represents the texture's height.
   */
  public var height: Int
    @JvmName("getHeight_prop")
    get() = super.getHeight()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
    }

  /**
   * If `true`, the generated texture will support high dynamic range ([Image.FORMATRGBAF] format).
   * This allows for glow effects to work if [Environment.glowEnabled] is `true`. If `false`, the
   * generated texture will use low dynamic range; overbright colors will be clamped
   * ([Image.FORMATRGBA8] format).
   */
  public var useHdr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingHdrPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseHdrPtr, NIL)
    }

  /**
   * The gradient fill type, one of the [Fill] values. The texture is filled by interpolating colors
   * starting from [fillFrom] to [fillTo] offsets.
   */
  public var fill: Fill
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFillPtr, LONG)
      return GradientTexture2D.Fill.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFillPtr, NIL)
    }

  /**
   * The initial offset used to fill the texture specified in UV coordinates.
   */
  @CoreTypeLocalCopy
  public var fillFrom: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFillFromPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFillFromPtr, NIL)
    }

  /**
   * The final offset used to fill the texture specified in UV coordinates.
   */
  @CoreTypeLocalCopy
  public var fillTo: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFillToPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFillToPtr, NIL)
    }

  /**
   * The gradient repeat type, one of the [Repeat] values. The texture is filled starting from
   * [fillFrom] to [fillTo] offsets by default, but the gradient fill can be repeated to cover the
   * entire texture.
   */
  public var repeat: Repeat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRepeatPtr, LONG)
      return GradientTexture2D.Repeat.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRepeatPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRADIENTTEXTURE2D, scriptIndex)
    return true
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
  public open fun fillFromMutate(block: Vector2.() -> Unit): Vector2 = fillFrom.apply{
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
  public open fun fillToMutate(block: Vector2.() -> Unit): Vector2 = fillTo.apply{
      block(this)
      fillTo = this
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setGradientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_gradient")

    public val getGradientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "get_gradient")

    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("GradientTexture2D", "set_width")

    public val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_height")

    public val setUseHdrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_use_hdr")

    public val isUsingHdrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "is_using_hdr")

    public val setFillPtr: VoidPtr = TypeManager.getMethodBindPtr("GradientTexture2D", "set_fill")

    public val getFillPtr: VoidPtr = TypeManager.getMethodBindPtr("GradientTexture2D", "get_fill")

    public val setFillFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_fill_from")

    public val getFillFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "get_fill_from")

    public val setFillToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_fill_to")

    public val getFillToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "get_fill_to")

    public val setRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_repeat")

    public val getRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "get_repeat")
  }
}
