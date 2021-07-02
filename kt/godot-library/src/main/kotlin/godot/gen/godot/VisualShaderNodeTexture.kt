// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Performs a texture lookup within the visual shader graph.
 *
 * Performs a lookup operation on the provided texture, with support for multiple texture sources to choose from.
 */
@GodotBaseType
public open class VisualShaderNodeTexture : VisualShaderNode() {
  /**
   * Determines the source for the lookup. See [enum Source] for options.
   */
  public open var source: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTURE_GET_SOURCE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTURE_SET_SOURCE, NIL)
    }

  /**
   * The source texture, if needed for the selected [source].
   */
  public open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTURE_GET_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTURE_SET_TEXTURE, NIL)
    }

  /**
   * Specifies the type of the texture if [source] is set to [SOURCE_TEXTURE]. See [enum TextureType] for options.
   */
  public open var textureType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTURE_GET_TEXTURE_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTURE_SET_TEXTURE_TYPE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODETEXTURE)
  }

  public enum class TextureType(
    id: Long
  ) {
    /**
     * No hints are added to the uniform declaration.
     */
    TYPE_DATA(0),
    /**
     * Adds `hint_albedo` as hint to the uniform declaration for proper sRGB to linear conversion.
     */
    TYPE_COLOR(1),
    /**
     * Adds `hint_normal` as hint to the uniform declaration, which internally converts the texture for proper usage as normal map.
     */
    TYPE_NORMALMAP(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Source(
    id: Long
  ) {
    /**
     * Use the texture given as an argument for this function.
     */
    SOURCE_TEXTURE(0),
    /**
     * Use the current viewport's texture as the source.
     */
    SOURCE_SCREEN(1),
    /**
     * Use the texture from this shader's texture built-in (e.g. a texture of a [godot.Sprite]).
     */
    SOURCE_2D_TEXTURE(2),
    /**
     * Use the texture from this shader's normal map built-in.
     */
    SOURCE_2D_NORMAL(3),
    /**
     * Use the depth texture available for this shader.
     */
    SOURCE_DEPTH(4),
    /**
     * Use the texture provided in the input port for this function.
     */
    SOURCE_PORT(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Use the texture from this shader's normal map built-in.
     */
    public final const val SOURCE_2D_NORMAL: Long = 3

    /**
     * Use the texture from this shader's texture built-in (e.g. a texture of a [godot.Sprite]).
     */
    public final const val SOURCE_2D_TEXTURE: Long = 2

    /**
     * Use the depth texture available for this shader.
     */
    public final const val SOURCE_DEPTH: Long = 4

    /**
     * Use the texture provided in the input port for this function.
     */
    public final const val SOURCE_PORT: Long = 5

    /**
     * Use the current viewport's texture as the source.
     */
    public final const val SOURCE_SCREEN: Long = 1

    /**
     * Use the texture given as an argument for this function.
     */
    public final const val SOURCE_TEXTURE: Long = 0

    /**
     * Adds `hint_albedo` as hint to the uniform declaration for proper sRGB to linear conversion.
     */
    public final const val TYPE_COLOR: Long = 1

    /**
     * No hints are added to the uniform declaration.
     */
    public final const val TYPE_DATA: Long = 0

    /**
     * Adds `hint_normal` as hint to the uniform declaration, which internally converts the texture for proper usage as normal map.
     */
    public final const val TYPE_NORMALMAP: Long = 2
  }
}
