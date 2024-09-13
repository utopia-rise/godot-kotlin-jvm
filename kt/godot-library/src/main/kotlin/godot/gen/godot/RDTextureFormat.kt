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
import kotlin.jvm.JvmName

/**
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDTextureFormat : RefCounted() {
  /**
   * The texture's pixel data format.
   */
  public final inline var format: RenderingDevice.DataFormat
    @JvmName("formatProperty")
    get() = getFormat()
    @JvmName("formatProperty")
    set(`value`) {
      setFormat(value)
    }

  /**
   * The texture's width (in pixels).
   */
  public final inline var width: Long
    @JvmName("widthProperty")
    get() = getWidth()
    @JvmName("widthProperty")
    set(`value`) {
      setWidth(value)
    }

  /**
   * The texture's height (in pixels).
   */
  public final inline var height: Long
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  /**
   * The texture's depth (in pixels). This is always `1` for 2D textures.
   */
  public final inline var depth: Long
    @JvmName("depthProperty")
    get() = getDepth()
    @JvmName("depthProperty")
    set(`value`) {
      setDepth(value)
    }

  /**
   * The number of layers in the texture. Only relevant for 2D texture arrays.
   */
  public final inline var arrayLayers: Long
    @JvmName("arrayLayersProperty")
    get() = getArrayLayers()
    @JvmName("arrayLayersProperty")
    set(`value`) {
      setArrayLayers(value)
    }

  /**
   * The number of mipmaps available in the texture.
   */
  public final inline var mipmaps: Long
    @JvmName("mipmapsProperty")
    get() = getMipmaps()
    @JvmName("mipmapsProperty")
    set(`value`) {
      setMipmaps(value)
    }

  /**
   * The texture type.
   */
  public final inline var textureType: RenderingDevice.TextureType
    @JvmName("textureTypeProperty")
    get() = getTextureType()
    @JvmName("textureTypeProperty")
    set(`value`) {
      setTextureType(value)
    }

  /**
   * The number of samples used when sampling the texture.
   */
  public final inline var samples: RenderingDevice.TextureSamples
    @JvmName("samplesProperty")
    get() = getSamples()
    @JvmName("samplesProperty")
    set(`value`) {
      setSamples(value)
    }

  /**
   * The texture's usage bits, which determine what can be done using the texture.
   */
  public final inline var usageBits: RenderingDevice.TextureUsageBits
    @JvmName("usageBitsProperty")
    get() = getUsageBits()
    @JvmName("usageBitsProperty")
    set(`value`) {
      setUsageBits(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RDTEXTUREFORMAT, scriptIndex)
  }

  public final fun setFormat(pMember: RenderingDevice.DataFormat): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setFormatPtr, NIL)
  }

  public final fun getFormat(): RenderingDevice.DataFormat {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return RenderingDevice.DataFormat.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setWidth(pMember: Long): Unit {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setHeight(pMember: Long): Unit {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDepth(pMember: Long): Unit {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
  }

  public final fun getDepth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDepthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setArrayLayers(pMember: Long): Unit {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(rawPtr, MethodBindings.setArrayLayersPtr, NIL)
  }

  public final fun getArrayLayers(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getArrayLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMipmaps(pMember: Long): Unit {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(rawPtr, MethodBindings.setMipmapsPtr, NIL)
  }

  public final fun getMipmaps(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMipmapsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTextureType(pMember: RenderingDevice.TextureType): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureTypePtr, NIL)
  }

  public final fun getTextureType(): RenderingDevice.TextureType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureTypePtr, LONG)
    return RenderingDevice.TextureType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSamples(pMember: RenderingDevice.TextureSamples): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setSamplesPtr, NIL)
  }

  public final fun getSamples(): RenderingDevice.TextureSamples {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSamplesPtr, LONG)
    return RenderingDevice.TextureSamples.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setUsageBits(pMember: RenderingDevice.TextureUsageBits): Unit {
    TransferContext.writeArguments(LONG to pMember.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.setUsageBitsPtr, NIL)
  }

  public final fun getUsageBits(): RenderingDevice.TextureUsageBits {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUsageBitsPtr, LONG)
    return TextureUsageBitsValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun addShareableFormat(format: RenderingDevice.DataFormat): Unit {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addShareableFormatPtr, NIL)
  }

  public final fun removeShareableFormat(format: RenderingDevice.DataFormat): Unit {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(rawPtr, MethodBindings.removeShareableFormatPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_format", 565531219)

    public val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_format", 2235804183)

    public val setWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_width", 1286410249)

    public val getWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_width", 3905245786)

    public val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_height", 1286410249)

    public val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_height", 3905245786)

    public val setDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_depth", 1286410249)

    public val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_depth", 3905245786)

    public val setArrayLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_array_layers", 1286410249)

    public val getArrayLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_array_layers", 3905245786)

    public val setMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_mipmaps", 1286410249)

    public val getMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_mipmaps", 3905245786)

    public val setTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_texture_type", 652343381)

    public val getTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_texture_type", 4036357416)

    public val setSamplesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_samples", 3774171498)

    public val getSamplesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_samples", 407791724)

    public val setUsageBitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_usage_bits", 245642367)

    public val getUsageBitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_usage_bits", 1313398998)

    public val addShareableFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "add_shareable_format", 565531219)

    public val removeShareableFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "remove_shareable_format", 565531219)
  }
}
