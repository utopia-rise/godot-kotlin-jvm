// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.RenderingDevice.TextureUsageBitsValue
import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_RDTEXTUREFORMAT_INDEX: Int = 521

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
    Internals.callConstructor(this, ENGINE_CLASS_RDTEXTUREFORMAT_INDEX, scriptIndex)
  }

  public final fun setFormat(pMember: RenderingDevice.DataFormat): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setFormatPtr, NIL)
  }

  public final fun getFormat(): RenderingDevice.DataFormat {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return RenderingDevice.DataFormat.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setWidth(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun getWidth(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getWidthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setHeight(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getHeight(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHeightPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setDepth(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
  }

  public final fun getDepth(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setArrayLayers(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setArrayLayersPtr, NIL)
  }

  public final fun getArrayLayers(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getArrayLayersPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setMipmaps(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setMipmapsPtr, NIL)
  }

  public final fun getMipmaps(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMipmapsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setTextureType(pMember: RenderingDevice.TextureType): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setTextureTypePtr, NIL)
  }

  public final fun getTextureType(): RenderingDevice.TextureType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextureTypePtr, LONG)
    return RenderingDevice.TextureType.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setSamples(pMember: RenderingDevice.TextureSamples): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setSamplesPtr, NIL)
  }

  public final fun getSamples(): RenderingDevice.TextureSamples {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSamplesPtr, LONG)
    return RenderingDevice.TextureSamples.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setUsageBits(pMember: RenderingDevice.TextureUsageBits): Unit {
    Internals.writeArguments(LONG to pMember.flag)
    Internals.callMethod(rawPtr, MethodBindings.setUsageBitsPtr, NIL)
  }

  public final fun getUsageBits(): RenderingDevice.TextureUsageBits {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUsageBitsPtr, LONG)
    return TextureUsageBitsValue(Internals.readReturnValue(LONG) as Long)
  }

  public final fun addShareableFormat(format: RenderingDevice.DataFormat): Unit {
    Internals.writeArguments(LONG to format.id)
    Internals.callMethod(rawPtr, MethodBindings.addShareableFormatPtr, NIL)
  }

  public final fun removeShareableFormat(format: RenderingDevice.DataFormat): Unit {
    Internals.writeArguments(LONG to format.id)
    Internals.callMethod(rawPtr, MethodBindings.removeShareableFormatPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "set_format", 565531219)

    internal val getFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "get_format", 2235804183)

    internal val setWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "set_width", 1286410249)

    internal val getWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "get_width", 3905245786)

    internal val setHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "set_height", 1286410249)

    internal val getHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "get_height", 3905245786)

    internal val setDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "set_depth", 1286410249)

    internal val getDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "get_depth", 3905245786)

    internal val setArrayLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "set_array_layers", 1286410249)

    internal val getArrayLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "get_array_layers", 3905245786)

    internal val setMipmapsPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "set_mipmaps", 1286410249)

    internal val getMipmapsPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "get_mipmaps", 3905245786)

    internal val setTextureTypePtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "set_texture_type", 652343381)

    internal val getTextureTypePtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "get_texture_type", 4036357416)

    internal val setSamplesPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "set_samples", 3774171498)

    internal val getSamplesPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "get_samples", 407791724)

    internal val setUsageBitsPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "set_usage_bits", 245642367)

    internal val getUsageBitsPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "get_usage_bits", 1313398998)

    internal val addShareableFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "add_shareable_format", 565531219)

    internal val removeShareableFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("RDTextureFormat", "remove_shareable_format", 565531219)
  }
}
