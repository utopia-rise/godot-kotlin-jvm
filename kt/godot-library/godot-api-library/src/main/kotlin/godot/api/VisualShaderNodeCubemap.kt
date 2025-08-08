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
import godot.core.GodotEnum
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Translated to `texture(cubemap, vec3)` in the shader language. Returns a color vector and alpha
 * channel as scalar.
 */
@GodotBaseType
public open class VisualShaderNodeCubemap : VisualShaderNode() {
  /**
   * Defines which source should be used for the sampling. See [Source] for options.
   */
  public final inline var source: Source
    @JvmName("sourceProperty")
    get() = getSource()
    @JvmName("sourceProperty")
    set(`value`) {
      setSource(value)
    }

  /**
   * The [Cubemap] texture to sample when using [SOURCE_TEXTURE] as [source].
   */
  public final inline var cubeMap: TextureLayered?
    @JvmName("cubeMapProperty")
    get() = getCubeMap()
    @JvmName("cubeMapProperty")
    set(`value`) {
      setCubeMap(value)
    }

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

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(739, scriptIndex)
  }

  public final fun setSource(`value`: Source): Unit {
    TransferContext.writeArguments(LONG to value.id)
    TransferContext.callMethod(ptr, MethodBindings.setSourcePtr, NIL)
  }

  public final fun getSource(): Source {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSourcePtr, LONG)
    return Source.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCubeMap(`value`: TextureLayered?): Unit {
    TransferContext.writeArguments(OBJECT to value)
    TransferContext.callMethod(ptr, MethodBindings.setCubeMapPtr, NIL)
  }

  public final fun getCubeMap(): TextureLayered? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCubeMapPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TextureLayered?)
  }

  public final fun setTextureType(`value`: TextureType): Unit {
    TransferContext.writeArguments(LONG to value.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextureTypePtr, NIL)
  }

  public final fun getTextureType(): TextureType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureTypePtr, LONG)
    return TextureType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Source(
    id: Long,
  ) : GodotEnum {
    /**
     * Use the [Cubemap] set via [cubeMap]. If this is set to [source], the `samplerCube` port is
     * ignored.
     */
    TEXTURE(0),
    /**
     * Use the [Cubemap] sampler reference passed via the `samplerCube` port. If this is set to
     * [source], the [cubeMap] texture is ignored.
     */
    PORT(1),
    /**
     * Represents the size of the [Source] enum.
     */
    MAX(2),
    ;

    public override val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Source = entries.single { it.id == `value` }
    }
  }

  public enum class TextureType(
    id: Long,
  ) : GodotEnum {
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

    public override val id: Long
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
        TypeManager.getMethodBindPtr("VisualShaderNodeCubemap", "set_source", 1625400621)

    internal val getSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCubemap", "get_source", 2222048781)

    internal val setCubeMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCubemap", "set_cube_map", 1278366092)

    internal val getCubeMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCubemap", "get_cube_map", 3984243839)

    internal val setTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCubemap", "set_texture_type", 1899718876)

    internal val getTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCubemap", "get_texture_type", 3356498888)
  }
}
