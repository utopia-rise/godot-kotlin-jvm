// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A 1D texture where pixel brightness corresponds to points on a [Curve] resource, either in
 * grayscale or in red. This visual representation simplifies the task of saving curves as image files.
 * If you need to store up to 3 curves within a single texture, use [CurveXYZTexture] instead. See
 * also [GradientTexture1D] and [GradientTexture2D].
 */
@GodotBaseType
public open class CurveTexture : Texture2D() {
  /**
   * The width of the texture (in pixels). Higher values make it possible to represent
   * high-frequency data better (such as sudden direction changes), at the cost of increased generation
   * time and memory usage.
   */
  public final inline var width: Int
    @JvmName("widthProperty")
    get() = getWidth()
    @JvmName("widthProperty")
    set(`value`) {
      setWidth(value)
    }

  /**
   * The format the texture should be generated with. When passing a CurveTexture as an input to a
   * [Shader], this may need to be adjusted.
   */
  public final inline var textureMode: TextureMode
    @JvmName("textureModeProperty")
    get() = getTextureMode()
    @JvmName("textureModeProperty")
    set(`value`) {
      setTextureMode(value)
    }

  /**
   * The [Curve] that is rendered onto the texture.
   */
  public final inline var curve: Curve?
    @JvmName("curveProperty")
    get() = getCurve()
    @JvmName("curveProperty")
    set(`value`) {
      setCurve(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(219, scriptIndex)
  }

  public final fun setWidth(width: Int): Unit {
    TransferContext.writeArguments(LONG to width.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun setCurve(curve: Curve?): Unit {
    TransferContext.writeArguments(OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setCurvePtr, NIL)
  }

  public final fun getCurve(): Curve? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setTextureMode(textureMode: TextureMode): Unit {
    TransferContext.writeArguments(LONG to textureMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextureModePtr, NIL)
  }

  public final fun getTextureMode(): TextureMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureModePtr, LONG)
    return CurveTexture.TextureMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class TextureMode(
    id: Long,
  ) {
    /**
     * Store the curve equally across the red, green and blue channels. This uses more video memory,
     * but is more compatible with shaders that only read the green and blue values.
     */
    TEXTURE_MODE_RGB(0),
    /**
     * Store the curve only in the red channel. This saves video memory, but some custom shaders may
     * not be able to work with this.
     */
    TEXTURE_MODE_RED(1),
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
        TypeManager.getMethodBindPtr("CurveTexture", "set_width", 1286410249)

    internal val setCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveTexture", "set_curve", 270443179)

    internal val getCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveTexture", "get_curve", 2460114913)

    internal val setTextureModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveTexture", "set_texture_mode", 1321955367)

    internal val getTextureModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveTexture", "get_texture_mode", 715756376)
  }
}
