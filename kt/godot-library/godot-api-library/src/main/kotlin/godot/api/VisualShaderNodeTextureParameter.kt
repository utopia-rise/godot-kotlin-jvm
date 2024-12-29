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
import godot.getColorDefaultPtr
import godot.getTextureFilterPtr
import godot.getTextureRepeatPtr
import godot.getTextureSourcePtr
import godot.getTextureTypePtr
import godot.setColorDefaultPtr
import godot.setTextureFilterPtr
import godot.setTextureRepeatPtr
import godot.setTextureSourcePtr
import godot.setTextureTypePtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_VISUALSHADERNODETEXTUREPARAMETER: Int = 782

/**
 * Performs a lookup operation on the texture provided as a uniform for the shader.
 */
@GodotBaseType
public open class VisualShaderNodeTextureParameter internal constructor() :
    VisualShaderNodeParameter() {
  /**
   * Defines the type of data provided by the source texture. See [TextureType] for options.
   */
  public final inline var textureType: TextureType
    @JvmName("textureTypeProperty")
    get() = getTextureType()
    @JvmName("textureTypeProperty")
    set(`value`) {
      setTextureType(value)
    }

  /**
   * Sets the default color if no texture is assigned to the uniform.
   */
  public final inline var colorDefault: ColorDefault
    @JvmName("colorDefaultProperty")
    get() = getColorDefault()
    @JvmName("colorDefaultProperty")
    set(`value`) {
      setColorDefault(value)
    }

  /**
   * Sets the texture filtering mode. See [TextureFilter] for options.
   */
  public final inline var textureFilter: TextureFilter
    @JvmName("textureFilterProperty")
    get() = getTextureFilter()
    @JvmName("textureFilterProperty")
    set(`value`) {
      setTextureFilter(value)
    }

  /**
   * Sets the texture repeating mode. See [TextureRepeat] for options.
   */
  public final inline var textureRepeat: TextureRepeat
    @JvmName("textureRepeatProperty")
    get() = getTextureRepeat()
    @JvmName("textureRepeatProperty")
    set(`value`) {
      setTextureRepeat(value)
    }

  /**
   * Sets the texture source mode. Used for reading from the screen, depth, or normal_roughness
   * texture. See [TextureSource] for options.
   */
  public final inline var textureSource: TextureSource
    @JvmName("textureSourceProperty")
    get() = getTextureSource()
    @JvmName("textureSourceProperty")
    set(`value`) {
      setTextureSource(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VISUALSHADERNODETEXTUREPARAMETER, scriptIndex)
  }

  public final fun setTextureType(type: TextureType): Unit {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextureTypePtr, NIL)
  }

  public final fun getTextureType(): TextureType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureTypePtr, LONG)
    return VisualShaderNodeTextureParameter.TextureType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setColorDefault(color: ColorDefault): Unit {
    TransferContext.writeArguments(LONG to color.id)
    TransferContext.callMethod(ptr, MethodBindings.setColorDefaultPtr, NIL)
  }

  public final fun getColorDefault(): ColorDefault {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorDefaultPtr, LONG)
    return VisualShaderNodeTextureParameter.ColorDefault.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTextureFilter(filter: TextureFilter): Unit {
    TransferContext.writeArguments(LONG to filter.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextureFilterPtr, NIL)
  }

  public final fun getTextureFilter(): TextureFilter {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureFilterPtr, LONG)
    return VisualShaderNodeTextureParameter.TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTextureRepeat(repeat: TextureRepeat): Unit {
    TransferContext.writeArguments(LONG to repeat.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextureRepeatPtr, NIL)
  }

  public final fun getTextureRepeat(): TextureRepeat {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureRepeatPtr, LONG)
    return VisualShaderNodeTextureParameter.TextureRepeat.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTextureSource(source: TextureSource): Unit {
    TransferContext.writeArguments(LONG to source.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextureSourcePtr, NIL)
  }

  public final fun getTextureSource(): TextureSource {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureSourcePtr, LONG)
    return VisualShaderNodeTextureParameter.TextureSource.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class TextureType(
    id: Long,
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
     * Adds `hint_normal` as hint to the uniform declaration, which internally converts the texture
     * for proper usage as normal map.
     */
    TYPE_NORMAL_MAP(2),
    /**
     * Adds `hint_anisotropy` as hint to the uniform declaration to use for a flowmap.
     */
    TYPE_ANISOTROPY(3),
    /**
     * Represents the size of the [TextureType] enum.
     */
    TYPE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureType = entries.single { it.id == `value` }
    }
  }

  public enum class ColorDefault(
    id: Long,
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
     * Represents the size of the [ColorDefault] enum.
     */
    COLOR_DEFAULT_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ColorDefault = entries.single { it.id == `value` }
    }
  }

  public enum class TextureFilter(
    id: Long,
  ) {
    /**
     * Sample the texture using the filter determined by the node this shader is attached to.
     */
    FILTER_DEFAULT(0),
    /**
     * The texture filter reads from the nearest pixel only. This makes the texture look pixelated
     * from up close, and grainy from a distance (due to mipmaps not being sampled).
     */
    FILTER_NEAREST(1),
    /**
     * The texture filter blends between the nearest 4 pixels. This makes the texture look smooth
     * from up close, and grainy from a distance (due to mipmaps not being sampled).
     */
    FILTER_LINEAR(2),
    /**
     * The texture filter reads from the nearest pixel and blends between the nearest 2 mipmaps (or
     * uses the nearest mipmap if
     * [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is `true`). This
     * makes the texture look pixelated from up close, and smooth from a distance.
     * Use this for non-pixel art textures that may be viewed at a low scale (e.g. due to [Camera2D]
     * zoom or sprite scaling), as mipmaps are important to smooth out pixels that are smaller than
     * on-screen pixels.
     */
    FILTER_NEAREST_MIPMAP(3),
    /**
     * The texture filter blends between the nearest 4 pixels and between the nearest 2 mipmaps (or
     * uses the nearest mipmap if
     * [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is `true`). This
     * makes the texture look smooth from up close, and smooth from a distance.
     * Use this for non-pixel art textures that may be viewed at a low scale (e.g. due to [Camera2D]
     * zoom or sprite scaling), as mipmaps are important to smooth out pixels that are smaller than
     * on-screen pixels.
     */
    FILTER_LINEAR_MIPMAP(4),
    /**
     * The texture filter reads from the nearest pixel and blends between 2 mipmaps (or uses the
     * nearest mipmap if [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is
     * `true`) based on the angle between the surface and the camera view. This makes the texture look
     * pixelated from up close, and smooth from a distance. Anisotropic filtering improves texture
     * quality on surfaces that are almost in line with the camera, but is slightly slower. The
     * anisotropic filtering level can be changed by adjusting
     * [ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     * **Note:** This texture filter is rarely useful in 2D projects. [FILTER_NEAREST_MIPMAP] is
     * usually more appropriate in this case.
     */
    FILTER_NEAREST_MIPMAP_ANISOTROPIC(5),
    /**
     * The texture filter blends between the nearest 4 pixels and blends between 2 mipmaps (or uses
     * the nearest mipmap if [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter]
     * is `true`) based on the angle between the surface and the camera view. This makes the texture
     * look smooth from up close, and smooth from a distance. Anisotropic filtering improves texture
     * quality on surfaces that are almost in line with the camera, but is slightly slower. The
     * anisotropic filtering level can be changed by adjusting
     * [ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     * **Note:** This texture filter is rarely useful in 2D projects. [FILTER_LINEAR_MIPMAP] is
     * usually more appropriate in this case.
     */
    FILTER_LINEAR_MIPMAP_ANISOTROPIC(6),
    /**
     * Represents the size of the [TextureFilter] enum.
     */
    FILTER_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureFilter = entries.single { it.id == `value` }
    }
  }

  public enum class TextureRepeat(
    id: Long,
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
     * Represents the size of the [TextureRepeat] enum.
     */
    REPEAT_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureRepeat = entries.single { it.id == `value` }
    }
  }

  public enum class TextureSource(
    id: Long,
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
     * Represents the size of the [TextureSource] enum.
     */
    SOURCE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureSource = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "set_texture_type", 2227296876)

    internal val getTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "get_texture_type", 367922070)

    internal val setColorDefaultPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "set_color_default", 4217624432)

    internal val getColorDefaultPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "get_color_default", 3837060134)

    internal val setTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "set_texture_filter", 2147684752)

    internal val getTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "get_texture_filter", 4184490817)

    internal val setTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "set_texture_repeat", 2036143070)

    internal val getTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "get_texture_repeat", 1690132794)

    internal val setTextureSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "set_texture_source", 1212687372)

    internal val getTextureSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "get_texture_source", 2039092262)
  }
}
