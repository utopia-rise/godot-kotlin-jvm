// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
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
  public final inline var cubeMap: Cubemap?
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
    MemoryManager.createNativeObject(ENGINECLASS_VISUALSHADERNODECUBEMAP, this, scriptIndex)
  }

  public final fun setSource(`value`: Source): Unit {
    TransferContext.writeArguments(LONG to value.id)
    TransferContext.callMethod(ptr, MethodBindings.setSourcePtr, NIL)
  }

  public final fun getSource(): Source {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSourcePtr, LONG)
    return VisualShaderNodeCubemap.Source.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCubeMap(`value`: Cubemap?): Unit {
    TransferContext.writeArguments(OBJECT to value)
    TransferContext.callMethod(ptr, MethodBindings.setCubeMapPtr, NIL)
  }

  public final fun getCubeMap(): Cubemap? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCubeMapPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Cubemap?)
  }

  public final fun setTextureType(`value`: TextureType): Unit {
    TransferContext.writeArguments(LONG to value.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextureTypePtr, NIL)
  }

  public final fun getTextureType(): TextureType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureTypePtr, LONG)
    return VisualShaderNodeCubemap.TextureType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Source(
    id: Long,
  ) {
    /**
     * Use the [Cubemap] set via [cubeMap]. If this is set to [source], the `samplerCube` port is
     * ignored.
     */
    SOURCE_TEXTURE(0),
    /**
     * Use the [Cubemap] sampler reference passed via the `samplerCube` port. If this is set to
     * [source], the [cubeMap] texture is ignored.
     */
    SOURCE_PORT(1),
    /**
     * Represents the size of the [Source] enum.
     */
    SOURCE_MAX(2),
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

  internal object MethodBindings {
    public val setSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCubemap", "set_source", 1625400621)

    public val getSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCubemap", "get_source", 2222048781)

    public val setCubeMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCubemap", "set_cube_map", 2219800736)

    public val getCubeMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCubemap", "get_cube_map", 1772111058)

    public val setTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCubemap", "set_texture_type", 1899718876)

    public val getTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCubemap", "get_texture_type", 3356498888)
  }
}
