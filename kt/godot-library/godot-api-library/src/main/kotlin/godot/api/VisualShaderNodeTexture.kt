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
import godot.getSourcePtr
import godot.getTexturePtr
import godot.getTextureTypePtr
import godot.setSourcePtr
import godot.setTexturePtr
import godot.setTextureTypePtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_VISUALSHADERNODETEXTURE: Int = 776

/**
 * Performs a lookup operation on the provided texture, with support for multiple texture sources to
 * choose from.
 */
@GodotBaseType
public open class VisualShaderNodeTexture : VisualShaderNode() {
  /**
   * Determines the source for the lookup. See [Source] for options.
   */
  public final inline var source: Source
    @JvmName("sourceProperty")
    get() = getSource()
    @JvmName("sourceProperty")
    set(`value`) {
      setSource(value)
    }

  /**
   * The source texture, if needed for the selected [source].
   */
  public final inline var texture: Texture2D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  /**
   * Specifies the type of the texture if [source] is set to [SOURCE_TEXTURE]. See [TextureType] for
   * options.
   */
  public final inline var textureType: TextureType
    @JvmName("textureTypeProperty")
    get() = getTextureType()
    @JvmName("textureTypeProperty")
    set(`value`) {
      setTextureType(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VISUALSHADERNODETEXTURE, scriptIndex)
  }

  public final fun setSource(`value`: Source): Unit {
    TransferContext.writeArguments(LONG to value.id)
    TransferContext.callMethod(ptr, MethodBindings.setSourcePtr, NIL)
  }

  public final fun getSource(): Source {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSourcePtr, LONG)
    return VisualShaderNodeTexture.Source.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTexture(`value`: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to value)
    TransferContext.callMethod(ptr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setTextureType(`value`: TextureType): Unit {
    TransferContext.writeArguments(LONG to value.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextureTypePtr, NIL)
  }

  public final fun getTextureType(): TextureType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureTypePtr, LONG)
    return VisualShaderNodeTexture.TextureType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Source(
    id: Long,
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
     * Use the texture from this shader's texture built-in (e.g. a texture of a [Sprite2D]).
     */
    SOURCE_2D_TEXTURE(2),
    /**
     * Use the texture from this shader's normal map built-in.
     */
    SOURCE_2D_NORMAL(3),
    /**
     * Use the depth texture captured during the depth prepass. Only available when the depth
     * prepass is used (i.e. in spatial shaders and in the forward_plus or gl_compatibility renderers).
     */
    SOURCE_DEPTH(4),
    /**
     * Use the texture provided in the input port for this function.
     */
    SOURCE_PORT(5),
    /**
     * Use the normal buffer captured during the depth prepass. Only available when the
     * normal-roughness buffer is available (i.e. in spatial shaders and in the forward_plus renderer).
     */
    SOURCE_3D_NORMAL(6),
    /**
     * Use the roughness buffer captured during the depth prepass. Only available when the
     * normal-roughness buffer is available (i.e. in spatial shaders and in the forward_plus renderer).
     */
    SOURCE_ROUGHNESS(7),
    /**
     * Represents the size of the [Source] enum.
     */
    SOURCE_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Source = entries.single { it.id == `value` }
    }
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
     * Represents the size of the [TextureType] enum.
     */
    TYPE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureType = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "set_source", 905262939)

    internal val getSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "get_source", 2896297444)

    internal val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "set_texture", 4051416890)

    internal val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "get_texture", 3635182373)

    internal val setTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "set_texture_type", 986314081)

    internal val getTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "get_texture_type", 3290430153)
  }
}
