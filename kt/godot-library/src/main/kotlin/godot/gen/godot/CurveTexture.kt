// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
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
  public var width: Int
    @JvmName("getWidth_prop")
    get() = super.getWidth()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
    }

  /**
   * The format the texture should be generated with. When passing a CurveTexture as an input to a
   * [Shader], this may need to be adjusted.
   */
  public var textureMode: TextureMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureModePtr, LONG)
      return CurveTexture.TextureMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureModePtr, NIL)
    }

  /**
   * The [Curve] that is rendered onto the texture.
   */
  public var curve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurvePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CURVETEXTURE, scriptIndex)
    return true
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("CurveTexture", "set_width")

    public val setCurvePtr: VoidPtr = TypeManager.getMethodBindPtr("CurveTexture", "set_curve")

    public val getCurvePtr: VoidPtr = TypeManager.getMethodBindPtr("CurveTexture", "get_curve")

    public val setTextureModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveTexture", "set_texture_mode")

    public val getTextureModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveTexture", "get_texture_mode")
  }
}
