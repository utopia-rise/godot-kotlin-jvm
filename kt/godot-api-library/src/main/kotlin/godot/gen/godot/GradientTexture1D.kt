// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GRADIENTTEXTURE1D_INDEX: Int = 283

/**
 * A 1D texture that obtains colors from a [Gradient] to fill the texture data. The texture is
 * filled by sampling the gradient for each pixel. Therefore, the texture does not necessarily
 * represent an exact copy of the gradient, as it may miss some colors if there are not enough pixels.
 * See also [GradientTexture2D], [CurveTexture] and [CurveXYZTexture].
 */
@GodotBaseType
public open class GradientTexture1D : Texture2D() {
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
   * The number of color samples that will be obtained from the [Gradient].
   */
  public final inline var width: Int
    @JvmName("widthProperty")
    get() = getWidth()
    @JvmName("widthProperty")
    set(`value`) {
      setWidth(value)
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

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_GRADIENTTEXTURE1D_INDEX, scriptIndex)
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

  public final fun setUseHdr(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setUseHdrPtr, NIL)
  }

  public final fun isUsingHdr(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUsingHdrPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setGradientPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture1D", "set_gradient", 2756054477)

    public val getGradientPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture1D", "get_gradient", 132272999)

    public val setWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture1D", "set_width", 1286410249)

    public val setUseHdrPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture1D", "set_use_hdr", 2586408642)

    public val isUsingHdrPtr: VoidPtr =
        Internals.getMethodBindPtr("GradientTexture1D", "is_using_hdr", 36873697)
  }
}
