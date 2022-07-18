// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
   * Defines the type of data provided by the source texture. See [enum TextureType] for options.
   */
  public var textureType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREUNIFORM_GET_TEXTURE_TYPE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREUNIFORM_SET_TEXTURE_TYPE, NIL.ordinal)
    }

  /**
   * Sets the default color if no texture is assigned to the uniform.
   */
  public var colorDefault: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREUNIFORM_GET_COLOR_DEFAULT, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREUNIFORM_SET_COLOR_DEFAULT, NIL.ordinal)
    }

  /**
   * Sets the texture filtering mode. See [enum TextureFilter] for options.
   */
  public var textureFilter: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREUNIFORM_GET_TEXTURE_FILTER, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREUNIFORM_SET_TEXTURE_FILTER, NIL.ordinal)
    }

  /**
   * Sets the texture repeating mode. See [enum TextureRepeat] for options.
   */
  public var textureRepeat: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREUNIFORM_GET_TEXTURE_REPEAT, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREUNIFORM_SET_TEXTURE_REPEAT, NIL.ordinal)
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
     * Adds `source_color` as hint to the uniform declaration for proper sRGB to linear conversion.
     */
    TYPE_COLOR(1),
    /**
     * Adds `hint_normal` as hint to the uniform declaration, which internally converts the texture for proper usage as normal map.
     */
    TYPE_NORMAL_MAP(2),
    /**
     * Adds `hint_anisotropy` as hint to the uniform declaration to use for a flowmap.
     */
    TYPE_ANISOTROPY(3),
    /**
     * Represents the size of the [enum TextureType] enum.
     */
    TYPE_MAX(4),
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
    /**
     * Represents the size of the [enum ColorDefault] enum.
     */
    COLOR_DEFAULT_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TextureFilter(
    id: Long
  ) {
    /**
     *
     */
    FILTER_DEFAULT(0),
    /**
     *
     */
    FILTER_NEAREST(1),
    /**
     *
     */
    FILTER_LINEAR(2),
    /**
     *
     */
    FILTER_NEAREST_MIPMAP(3),
    /**
     *
     */
    FILTER_LINEAR_MIPMAP(4),
    /**
     *
     */
    FILTER_NEAREST_MIPMAP_ANISOTROPIC(5),
    /**
     *
     */
    FILTER_LINEAR_MIPMAP_ANISOTROPIC(6),
    /**
     * Represents the size of the [enum TextureFilter] enum.
     */
    FILTER_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TextureRepeat(
    id: Long
  ) {
    /**
     *
     */
    REPEAT_DEFAULT(0),
    /**
     *
     */
    REPEAT_ENABLED(1),
    /**
     *
     */
    REPEAT_DISABLED(2),
    /**
     * Represents the size of the [enum TextureRepeat] enum.
     */
    REPEAT_MAX(3),
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
