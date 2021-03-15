// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Long
import kotlin.Suppress

/**
 * A [godot.CubeMap] sampling node to be used within the visual shader graph.
 *
 * Translated to `texture(cubemap, vec3)` in the shader language. Returns a color vector and alpha channel as scalar.
 */
@GodotBaseType
open class VisualShaderNodeCubeMap : VisualShaderNode() {
  /**
   * The [godot.CubeMap] texture to sample when using [SOURCE_TEXTURE] as [source].
   */
  open var cubeMap: CubeMap?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_GET_CUBE_MAP, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as CubeMap?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_SET_CUBE_MAP, NIL)
    }

  /**
   * Defines which source should be used for the sampling. See [enum Source] for options.
   */
  open var source: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_GET_SOURCE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_SET_SOURCE, NIL)
    }

  /**
   * Defines the type of data provided by the source texture. See [enum TextureType] for options.
   */
  open var textureType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_GET_TEXTURE_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECUBEMAP_SET_TEXTURE_TYPE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODECUBEMAP,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  enum class TextureType(
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
    TYPE_NORMALMAP(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Source(
    id: Long
  ) {
    /**
     * Use the [godot.CubeMap] set via [cubeMap]. If this is set to [source], the `samplerCube` port is ignored.
     */
    SOURCE_TEXTURE(0),

    /**
     * Use the [godot.CubeMap] sampler reference passed via the `samplerCube` port. If this is set to [source], the [cubeMap] texture is ignored.
     */
    SOURCE_PORT(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Use the [godot.CubeMap] sampler reference passed via the `samplerCube` port. If this is set to [source], the [cubeMap] texture is ignored.
     */
    final const val SOURCE_PORT: Long = 1

    /**
     * Use the [godot.CubeMap] set via [cubeMap]. If this is set to [source], the `samplerCube` port is ignored.
     */
    final const val SOURCE_TEXTURE: Long = 0

    /**
     * Adds `hint_albedo` as hint to the uniform declaration for proper sRGB to linear conversion.
     */
    final const val TYPE_COLOR: Long = 1

    /**
     * No hints are added to the uniform declaration.
     */
    final const val TYPE_DATA: Long = 0

    /**
     * Adds `hint_normal` as hint to the uniform declaration, which internally converts the texture for proper usage as normal map.
     */
    final const val TYPE_NORMALMAP: Long = 2
  }
}
