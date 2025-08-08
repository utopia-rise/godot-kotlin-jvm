// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * A 1D texture where pixel brightness corresponds to points on a unit [Curve] resource, either in grayscale or in red. This visual representation simplifies the task of saving curves as image files.
 *
 * If you need to store up to 3 curves within a single texture, use [CurveXYZTexture] instead. See also [GradientTexture1D] and [GradientTexture2D].
 */
@GodotBaseType
public open class CurveTexture : Texture2D() {
  /**
   * The width of the texture (in pixels). Higher values make it possible to represent high-frequency data better (such as sudden direction changes), at the cost of increased generation time and memory usage.
   */
  public final inline var width: Int
    @JvmName("widthProperty")
    get() = getWidth()
    @JvmName("widthProperty")
    set(`value`) {
      setWidth(value)
    }

  /**
   * The format the texture should be generated with. When passing a CurveTexture as an input to a [Shader], this may need to be adjusted.
   */
  public final inline var textureMode: TextureMode
    @JvmName("textureModeProperty")
    get() = getTextureMode()
    @JvmName("textureModeProperty")
    set(`value`) {
      setTextureMode(value)
    }

  /**
   * The [Curve] that is rendered onto the texture. Should be a unit [Curve].
   */
  public final inline var curve: Curve?
    @JvmName("curveProperty")
    get() = getCurve()
    @JvmName("curveProperty")
    set(`value`) {
      setCurve(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(188, scriptIndex)
  }

  public final fun setWidth(width: Int) {
    TransferContext.writeArguments(LONG to width.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun setCurve(curve: Curve?) {
    TransferContext.writeArguments(OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setCurvePtr, NIL)
  }

  public final fun getCurve(): Curve? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setTextureMode(textureMode: TextureMode) {
    TransferContext.writeArguments(LONG to textureMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextureModePtr, NIL)
  }

  public final fun getTextureMode(): TextureMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureModePtr, LONG)
    return TextureMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getWidth(): Int {
    throw NotImplementedError("CurveTexture::_getWidth can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getHeight(): Int {
    throw NotImplementedError("CurveTexture::_getHeight can't be called from the JVM.")
  }

  public enum class TextureMode(
    id: Long,
  ) {
    /**
     * Store the curve equally across the red, green and blue channels. This uses more video memory, but is more compatible with shaders that only read the green and blue values.
     */
    RGB(0),
    /**
     * Store the curve only in the red channel. This saves video memory, but some custom shaders may not be able to work with this.
     */
    RED(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveTexture", "set_width", 1_286_410_249)

    internal val setCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveTexture", "set_curve", 270_443_179)

    internal val getCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveTexture", "get_curve", 2_460_114_913)

    internal val setTextureModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveTexture", "set_texture_mode", 1_321_955_367)

    internal val getTextureModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveTexture", "get_texture_mode", 715_756_376)
  }
}
