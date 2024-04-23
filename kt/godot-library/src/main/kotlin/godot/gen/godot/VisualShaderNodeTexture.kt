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

/**
 * Performs a 2D texture lookup within the visual shader graph.
 *
 * Performs a lookup operation on the provided texture, with support for multiple texture sources to choose from.
 */
@GodotBaseType
public open class VisualShaderNodeTexture : VisualShaderNode() {
  /**
   * Determines the source for the lookup. See [enum Source] for options.
   */
  public var source: Source
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSourcePtr, LONG)
      return VisualShaderNodeTexture.Source.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSourcePtr, NIL)
    }

  /**
   * The source texture, if needed for the selected [source].
   */
  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  /**
   * Specifies the type of the texture if [source] is set to [SOURCE_TEXTURE]. See [enum TextureType] for options.
   */
  public var textureType: TextureType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureTypePtr, LONG)
      return VisualShaderNodeTexture.TextureType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureTypePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODETEXTURE, scriptIndex)
    return true
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
     * Use the texture from this shader's texture built-in (e.g. a texture of a [godot.Sprite2D]).
     */
    SOURCE_2D_TEXTURE(2),
    /**
     * Use the texture from this shader's normal map built-in.
     */
    SOURCE_2D_NORMAL(3),
    /**
     * Use the depth texture captured during the depth prepass. Only available when the depth prepass is used (i.e. in spatial shaders and in the forward_plus or gl_compatibility renderers).
     */
    SOURCE_DEPTH(4),
    /**
     * Use the texture provided in the input port for this function.
     */
    SOURCE_PORT(5),
    /**
     * Use the normal buffer captured during the depth prepass. Only available when the normal-roughness buffer is available (i.e. in spatial shaders and in the forward_plus renderer).
     */
    SOURCE_3D_NORMAL(6),
    /**
     * Use the roughness buffer captured during the depth prepass. Only available when the normal-roughness buffer is available (i.e. in spatial shaders and in the forward_plus renderer).
     */
    SOURCE_ROUGHNESS(7),
    /**
     * Represents the size of the [enum Source] enum.
     */
    SOURCE_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
     * Adds `hint_normal` as hint to the uniform declaration, which internally converts the texture for proper usage as normal map.
     */
    TYPE_NORMAL_MAP(2),
    /**
     * Represents the size of the [enum TextureType] enum.
     */
    TYPE_MAX(3),
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
    public val setSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "set_source")

    public val getSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "get_source")

    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "set_texture")

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "get_texture")

    public val setTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "set_texture_type")

    public val getTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "get_texture_type")
  }
}
