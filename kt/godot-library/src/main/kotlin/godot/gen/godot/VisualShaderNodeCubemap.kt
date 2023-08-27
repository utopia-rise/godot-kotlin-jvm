// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A [godot.Cubemap] sampling node to be used within the visual shader graph.
 *
 * Translated to `texture(cubemap, vec3)` in the shader language. Returns a color vector and alpha channel as scalar.
 */
@GodotBaseType
public open class VisualShaderNodeCubemap : VisualShaderNode() {
  /**
   * Defines which source should be used for the sampling. See [enum Source] for options.
   */
  public var source: Source
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_GET_SOURCE, LONG)
      return VisualShaderNodeCubemap.Source.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_SET_SOURCE, NIL)
    }

  /**
   * The [godot.Cubemap] texture to sample when using [SOURCE_TEXTURE] as [source].
   */
  public var cubeMap: Cubemap?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_GET_CUBE_MAP, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Cubemap?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_SET_CUBE_MAP, NIL)
    }

  /**
   * Defines the type of data provided by the source texture. See [enum TextureType] for options.
   */
  public var textureType: TextureType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_GET_TEXTURE_TYPE, LONG)
      return VisualShaderNodeCubemap.TextureType.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_SET_TEXTURE_TYPE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODECUBEMAP, scriptIndex)
    return true
  }

  public enum class Source(
    id: Long,
  ) {
    /**
     * Use the [godot.Cubemap] set via [cubeMap]. If this is set to [source], the `samplerCube` port is ignored.
     */
    SOURCE_TEXTURE(0),
    /**
     * Use the [godot.Cubemap] sampler reference passed via the `samplerCube` port. If this is set to [source], the [cubeMap] texture is ignored.
     */
    SOURCE_PORT(1),
    /**
     * Represents the size of the [enum Source] enum.
     */
    SOURCE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
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
     * Adds `hint_albedo` as hint to the uniform declaration for proper sRGB to linear conversion.
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
