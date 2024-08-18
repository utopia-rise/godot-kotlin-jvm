// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.RenderingDevice.TextureUsageBitsValue
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDTextureFormat : RefCounted() {
  /**
   * The texture's pixel data format.
   */
  public var format: RenderingDevice.DataFormat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
      return RenderingDevice.DataFormat.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFormatPtr, NIL)
    }

  /**
   * The texture's width (in pixels).
   */
  public var width: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
    }

  /**
   * The texture's height (in pixels).
   */
  public var height: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
    }

  /**
   * The texture's depth (in pixels). This is always `1` for 2D textures.
   */
  public var depth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
    }

  /**
   * The number of layers in the texture. Only relevant for 2D texture arrays.
   */
  public var arrayLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getArrayLayersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setArrayLayersPtr, NIL)
    }

  /**
   * The number of mipmaps available in the texture.
   */
  public var mipmaps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMipmapsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMipmapsPtr, NIL)
    }

  /**
   * The texture type.
   */
  public var textureType: RenderingDevice.TextureType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureTypePtr, LONG)
      return RenderingDevice.TextureType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureTypePtr, NIL)
    }

  /**
   * The number of samples used when sampling the texture.
   */
  public var samples: RenderingDevice.TextureSamples
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSamplesPtr, LONG)
      return RenderingDevice.TextureSamples.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSamplesPtr, NIL)
    }

  /**
   * The texture's usage bits, which determine what can be done using the texture.
   */
  public var usageBits: RenderingDevice.TextureUsageBits
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUsageBitsPtr, LONG)
      return TextureUsageBitsValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setUsageBitsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RDTEXTUREFORMAT, scriptIndex)
  }

  public fun addShareableFormat(format: RenderingDevice.DataFormat): Unit {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addShareableFormatPtr, NIL)
  }

  public fun removeShareableFormat(format: RenderingDevice.DataFormat): Unit {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(rawPtr, MethodBindings.removeShareableFormatPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setFormatPtr: VoidPtr = TypeManager.getMethodBindPtr("RDTextureFormat", "set_format")

    public val getFormatPtr: VoidPtr = TypeManager.getMethodBindPtr("RDTextureFormat", "get_format")

    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("RDTextureFormat", "set_width")

    public val getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("RDTextureFormat", "get_width")

    public val setHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("RDTextureFormat", "set_height")

    public val getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("RDTextureFormat", "get_height")

    public val setDepthPtr: VoidPtr = TypeManager.getMethodBindPtr("RDTextureFormat", "set_depth")

    public val getDepthPtr: VoidPtr = TypeManager.getMethodBindPtr("RDTextureFormat", "get_depth")

    public val setArrayLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_array_layers")

    public val getArrayLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_array_layers")

    public val setMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_mipmaps")

    public val getMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_mipmaps")

    public val setTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_texture_type")

    public val getTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_texture_type")

    public val setSamplesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_samples")

    public val getSamplesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_samples")

    public val setUsageBitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_usage_bits")

    public val getUsageBitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_usage_bits")

    public val addShareableFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "add_shareable_format")

    public val removeShareableFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "remove_shareable_format")
  }
}
