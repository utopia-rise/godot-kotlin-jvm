// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Performs a uniform texture lookup within the visual shader graph.
 *
 * Performs a lookup operation on the texture provided as a uniform for the shader.
 */
@GodotBaseType
public open class VisualShaderNodeTextureUniform : VisualShaderNodeUniform() {
  /**
   * Sets the default color if no texture is assigned to the uniform.
   */
  public open var colorDefault: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREUNIFORM_GET_COLOR_DEFAULT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREUNIFORM_SET_COLOR_DEFAULT, NIL)
    }

  /**
   * Defines the type of data provided by the source texture. See [enum TextureType] for options.
   */
  public open var textureType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREUNIFORM_GET_TEXTURE_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREUNIFORM_SET_TEXTURE_TYPE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODETEXTUREUNIFORM)
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
    /**
     * Adds `hint_aniso` as hint to the uniform declaration to use for a flowmap.
     */
    TYPE_ANISO(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ColorDefault(
    id: Long
  ) {
    /**
     * Defaults to white color.
     */
    COLOR_DEFAULT_WHITE(0),
    /**
     * Defaults to black color.
     */
    COLOR_DEFAULT_BLACK(1),
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
     * Defaults to black color.
     */
    public final const val COLOR_DEFAULT_BLACK: Long = 1

    /**
     * Defaults to white color.
     */
    public final const val COLOR_DEFAULT_WHITE: Long = 0

    /**
     * Adds `hint_aniso` as hint to the uniform declaration to use for a flowmap.
     */
    public final const val TYPE_ANISO: Long = 3

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
