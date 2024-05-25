// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * A 1D texture that uses colors obtained from a [godot.Gradient].
 *
 * A 1D texture that obtains colors from a [godot.Gradient] to fill the texture data. The texture is filled by sampling the gradient for each pixel. Therefore, the texture does not necessarily represent an exact copy of the gradient, as it may miss some colors if there are not enough pixels. See also [godot.GradientTexture2D], [godot.CurveTexture] and [godot.CurveXYZTexture].
 */
@GodotBaseType
public open class GradientTexture1D : Texture2D() {
  /**
   * The [godot.Gradient] used to fill the texture.
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
   * The number of color samples that will be obtained from the [godot.Gradient].
   */
  public var width: Int
    @JvmName("getWidth_prop")
    get() = super.getWidth()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
    }

  /**
   * If `true`, the generated texture will support high dynamic range ([godot.Image.FORMAT_RGBAF] format). This allows for glow effects to work if [godot.Environment.glowEnabled] is `true`. If `false`, the generated texture will use low dynamic range; overbright colors will be clamped ([godot.Image.FORMAT_RGBA8] format).
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRADIENTTEXTURE1D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setGradientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture1D", "set_gradient")

    public val getGradientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture1D", "get_gradient")

    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("GradientTexture1D", "set_width")

    public val setUseHdrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture1D", "set_use_hdr")

    public val isUsingHdrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture1D", "is_using_hdr")
  }
}
