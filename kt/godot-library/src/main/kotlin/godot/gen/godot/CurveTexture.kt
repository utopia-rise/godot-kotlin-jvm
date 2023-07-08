// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * A texture that shows a curve.
 *
 * Renders a given [godot.Curve] provided to it. Simplifies the task of drawing curves and/or saving them as image files.
 *
 * If you need to store up to 3 curves within a single texture, use [godot.CurveXYZTexture] instead. See also [godot.GradientTexture1D] and [godot.GradientTexture2D].
 */
@GodotBaseType
public open class CurveTexture : Texture2D() {
  /**
   * The width of the texture (in pixels). Higher values make it possible to represent high-frequency data better (such as sudden direction changes), at the cost of increased generation time and memory usage.
   */
  public var width: Long
    @JvmName("getWidth_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getWidth()
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVETEXTURE_SET_WIDTH, NIL)
    }

  /**
   * The format the texture should be generated with. When passing a CurveTexture as an input to a [godot.Shader], this may need to be adjusted.
   */
  public var textureMode: TextureMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVETEXTURE_GET_TEXTURE_MODE,
          LONG)
      return CurveTexture.TextureMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVETEXTURE_SET_TEXTURE_MODE,
          NIL)
    }

  /**
   * The [godot.Curve] that is rendered onto the texture.
   */
  public var curve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVETEXTURE_GET_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVETEXTURE_SET_CURVE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CURVETEXTURE, scriptIndex)
    return true
  }

  public enum class TextureMode(
    id: Long,
  ) {
    /**
     * Store the curve equally across the red, green and blue channels. This uses more video memory, but is more compatible with shaders that only read the green and blue values.
     */
    TEXTURE_MODE_RGB(0),
    /**
     * Store the curve only in the red channel. This saves video memory, but some custom shaders may not be able to work with this.
     */
    TEXTURE_MODE_RED(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
