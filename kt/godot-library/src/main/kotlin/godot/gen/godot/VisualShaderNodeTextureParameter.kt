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
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Performs a uniform texture lookup within the visual shader graph.
 *
 * Performs a lookup operation on the texture provided as a uniform for the shader.
 */
@GodotBaseType
public open class VisualShaderNodeTextureParameter internal constructor() :
    VisualShaderNodeParameter() {
  /**
   * Defines the type of data provided by the source texture. See [enum TextureType] for options.
   */
  public var textureType: TextureType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREPARAMETER_GET_TEXTURE_TYPE, LONG)
      return VisualShaderNodeTextureParameter.TextureType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREPARAMETER_SET_TEXTURE_TYPE, NIL)
    }

  /**
   * Sets the default color if no texture is assigned to the uniform.
   */
  public var colorDefault: ColorDefault
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREPARAMETER_GET_COLOR_DEFAULT, LONG)
      return VisualShaderNodeTextureParameter.ColorDefault.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREPARAMETER_SET_COLOR_DEFAULT, NIL)
    }

  /**
   * Sets the texture filtering mode. See [enum TextureFilter] for options.
   */
  public var textureFilter: TextureFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREPARAMETER_GET_TEXTURE_FILTER, LONG)
      return VisualShaderNodeTextureParameter.TextureFilter.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREPARAMETER_SET_TEXTURE_FILTER, NIL)
    }

  /**
   * Sets the texture repeating mode. See [enum TextureRepeat] for options.
   */
  public var textureRepeat: TextureRepeat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREPARAMETER_GET_TEXTURE_REPEAT, LONG)
      return VisualShaderNodeTextureParameter.TextureRepeat.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREPARAMETER_SET_TEXTURE_REPEAT, NIL)
    }

  /**
   * Sets the texture source mode. Used for reading from the screen, depth, or normal_roughness texture. see [enum TextureSource] for options.
   */
  public var textureSource: TextureSource
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREPARAMETER_GET_TEXTURE_SOURCE, LONG)
      return VisualShaderNodeTextureParameter.TextureSource.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTUREPARAMETER_SET_TEXTURE_SOURCE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODETEXTUREPARAMETER, scriptIndex)
    return true
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
     * Defaults to fully opaque white color.
     */
    COLOR_DEFAULT_WHITE(0),
    /**
     * Defaults to fully opaque black color.
     */
    COLOR_DEFAULT_BLACK(1),
    /**
     * Defaults to fully transparent black color.
     */
    COLOR_DEFAULT_TRANSPARENT(2),
    /**
     * Represents the size of the [enum ColorDefault] enum.
     */
    COLOR_DEFAULT_MAX(3),
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
     * Sample the texture using the filter determined by the node this shader is attached to.
     */
    FILTER_DEFAULT(0),
    /**
     * The texture filter reads from the nearest pixel only. The simplest and fastest method of filtering, but the texture will look pixelized.
     */
    FILTER_NEAREST(1),
    /**
     * The texture filter blends between the nearest four pixels. Use this for most cases where you want to avoid a pixelated style.
     */
    FILTER_LINEAR(2),
    /**
     * The texture filter reads from the nearest pixel in the nearest mipmap. This is the fastest way to read from textures with mipmaps.
     */
    FILTER_NEAREST_MIPMAP(3),
    /**
     * The texture filter blends between the nearest 4 pixels and between the nearest 2 mipmaps. Use this for non-pixel art textures that may be viewed at a low scale (e.g. due to [godot.Camera2D] zoom), as mipmaps are important to smooth out pixels that are smaller than on-screen pixels.
     */
    FILTER_LINEAR_MIPMAP(4),
    /**
     * The texture filter reads from the nearest pixel, but selects a mipmap based on the angle between the surface and the camera view. This reduces artifacts on surfaces that are almost in line with the camera. The anisotropic filtering level can be changed by adjusting [godot.ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     *
     * **Note:** This texture filter is rarely useful in 2D projects. [FILTER_LINEAR_MIPMAP] is usually more appropriate.
     */
    FILTER_NEAREST_MIPMAP_ANISOTROPIC(5),
    /**
     * The texture filter blends between the nearest 4 pixels and selects a mipmap based on the angle between the surface and the camera view. This reduces artifacts on surfaces that are almost in line with the camera. This is the slowest of the filtering options, but results in the highest quality texturing. The anisotropic filtering level can be changed by adjusting [godot.ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     *
     * **Note:** This texture filter is rarely useful in 2D projects. [FILTER_LINEAR_MIPMAP] is usually more appropriate.
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
     * Sample the texture using the repeat mode determined by the node this shader is attached to.
     */
    REPEAT_DEFAULT(0),
    /**
     * Texture will repeat normally.
     */
    REPEAT_ENABLED(1),
    /**
     * Texture will not repeat.
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

  public enum class TextureSource(
    id: Long
  ) {
    /**
     * The texture source is not specified in the shader.
     */
    SOURCE_NONE(0),
    /**
     * The texture source is the screen texture which captures all opaque objects drawn this frame.
     */
    SOURCE_SCREEN(1),
    /**
     * The texture source is the depth texture from the depth prepass.
     */
    SOURCE_DEPTH(2),
    /**
     * The texture source is the normal-roughness buffer from the depth prepass.
     */
    SOURCE_NORMAL_ROUGHNESS(3),
    /**
     * Represents the size of the [enum TextureSource] enum.
     */
    SOURCE_MAX(4),
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
