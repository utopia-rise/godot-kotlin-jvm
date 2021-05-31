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
 * A [godot.CubeMap] sampling node to be used within the visual shader graph.
 *
 * Translated to `texture(cubemap, vec3)` in the shader language. Returns a color vector and alpha channel as scalar.
 */
@GodotBaseType
public open class VisualShaderNodeCubeMap : VisualShaderNode() {
  /**
   * The [godot.CubeMap] texture to sample when using [SOURCE_TEXTURE] as [source].
   */
  public open var cubeMap: CubeMap?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_GET_CUBE_MAP, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as CubeMap?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_SET_CUBE_MAP, NIL)
    }

  /**
   * Defines which source should be used for the sampling. See [enum Source] for options.
   */
  public open var source: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_GET_SOURCE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_SET_SOURCE, NIL)
    }

  /**
   * Defines the type of data provided by the source texture. See [enum TextureType] for options.
   */
  public open var textureType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_GET_TEXTURE_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_SET_TEXTURE_TYPE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODECUBEMAP)
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
     * Use the [godot.CubeMap] set via [cubeMap]. If this is set to [source], the `samplerCube` port is ignored.
     */
    SOURCE_TEXTURE(0),
    /**
     * Use the [godot.CubeMap] sampler reference passed via the `samplerCube` port. If this is set to [source], the [cubeMap] texture is ignored.
     */
    SOURCE_PORT(1),
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
     * Use the [godot.CubeMap] sampler reference passed via the `samplerCube` port. If this is set to [source], the [cubeMap] texture is ignored.
     */
    public final const val SOURCE_PORT: Long = 1

    /**
     * Use the [godot.CubeMap] set via [cubeMap]. If this is set to [source], the `samplerCube` port is ignored.
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
