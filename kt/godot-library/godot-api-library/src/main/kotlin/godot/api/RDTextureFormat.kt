// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.api.RenderingDevice.TextureUsageBitsValue
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Boolean
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

  /**
   * The texture will be used as the destination of a resolve operation.
   */
  public final inline var isResolveBuffer: Boolean
    @JvmName("isResolveBufferProperty")
    get() = getIsResolveBuffer()
    @JvmName("isResolveBufferProperty")
    set(`value`) {
      setIsResolveBuffer(value)
    }

  /**
   * If a texture is discardable, its contents do not need to be preserved between frames. This flag
   * is only relevant when the texture is used as target in a draw list.
   *
   * This information is used by [RenderingDevice] to figure out if a texture's contents can be
   * discarded, eliminating unnecessary writes to memory and boosting performance.
   */
  public final inline var isDiscardable: Boolean
    @JvmName("isDiscardableProperty")
    get() = getIsDiscardable()
    @JvmName("isDiscardableProperty")
    set(`value`) {
      setIsDiscardable(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(535, scriptIndex)
  }

  public final fun setFormat(pMember: RenderingDevice.DataFormat): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setFormatPtr, NIL)
  }

  public final fun getFormat(): RenderingDevice.DataFormat {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFormatPtr, LONG)
    return RenderingDevice.DataFormat.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setWidth(pMember: Long): Unit {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setHeight(pMember: Long): Unit {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDepth(pMember: Long): Unit {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setDepthPtr, NIL)
  }

  public final fun getDepth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDepthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setArrayLayers(pMember: Long): Unit {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setArrayLayersPtr, NIL)
  }

  public final fun getArrayLayers(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getArrayLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMipmaps(pMember: Long): Unit {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setMipmapsPtr, NIL)
  }

  public final fun getMipmaps(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMipmapsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTextureType(pMember: RenderingDevice.TextureType): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextureTypePtr, NIL)
  }

  public final fun getTextureType(): RenderingDevice.TextureType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureTypePtr, LONG)
    return RenderingDevice.TextureType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSamples(pMember: RenderingDevice.TextureSamples): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setSamplesPtr, NIL)
  }

  public final fun getSamples(): RenderingDevice.TextureSamples {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSamplesPtr, LONG)
    return RenderingDevice.TextureSamples.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setUsageBits(pMember: RenderingDevice.TextureUsageBits): Unit {
    TransferContext.writeArguments(LONG to pMember.flag)
    TransferContext.callMethod(ptr, MethodBindings.setUsageBitsPtr, NIL)
  }

  public final fun getUsageBits(): RenderingDevice.TextureUsageBits {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUsageBitsPtr, LONG)
    return TextureUsageBitsValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setIsResolveBuffer(pMember: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setIsResolveBufferPtr, NIL)
  }

  public final fun getIsResolveBuffer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIsResolveBufferPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setIsDiscardable(pMember: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setIsDiscardablePtr, NIL)
  }

  public final fun getIsDiscardable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIsDiscardablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds [format] as a valid format for the corresponding [RDTextureView]'s
   * [RDTextureView.formatOverride] property. If any format is added as shareable, then the main
   * [format] must also be added.
   */
  public final fun addShareableFormat(format: RenderingDevice.DataFormat): Unit {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(ptr, MethodBindings.addShareableFormatPtr, NIL)
  }

  /**
   * Removes [format] from the list of valid formats that the corresponding [RDTextureView]'s
   * [RDTextureView.formatOverride] property can be set to.
   */
  public final fun removeShareableFormat(format: RenderingDevice.DataFormat): Unit {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(ptr, MethodBindings.removeShareableFormatPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_format", 565531219)

    internal val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_format", 2235804183)

    internal val setWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_width", 1286410249)

    internal val getWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_width", 3905245786)

    internal val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_height", 1286410249)

    internal val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_height", 3905245786)

    internal val setDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_depth", 1286410249)

    internal val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_depth", 3905245786)

    internal val setArrayLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_array_layers", 1286410249)

    internal val getArrayLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_array_layers", 3905245786)

    internal val setMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_mipmaps", 1286410249)

    internal val getMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_mipmaps", 3905245786)

    internal val setTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_texture_type", 652343381)

    internal val getTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_texture_type", 4036357416)

    internal val setSamplesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_samples", 3774171498)

    internal val getSamplesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_samples", 407791724)

    internal val setUsageBitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_usage_bits", 245642367)

    internal val getUsageBitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_usage_bits", 1313398998)

    internal val setIsResolveBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_is_resolve_buffer", 2586408642)

    internal val getIsResolveBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_is_resolve_buffer", 36873697)

    internal val setIsDiscardablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "set_is_discardable", 2586408642)

    internal val getIsDiscardablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "get_is_discardable", 36873697)

    internal val addShareableFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "add_shareable_format", 565531219)

    internal val removeShareableFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureFormat", "remove_shareable_format", 565531219)
  }
}
