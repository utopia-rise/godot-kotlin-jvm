// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.PackedColorArray
import godot.core.PackedInt64Array
import godot.core.RID
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_INT_64_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector2i
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmOverloads

/**
 * Abstraction for working with modern low-level graphics APIs.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/shaders/compute_shaders.html]($DOCS_URL/tutorials/shaders/compute_shaders.html)
 *
 * [godot.RenderingDevice] is an abstraction for working with modern low-level graphics APIs such as Vulkan. Compared to [godot.RenderingServer] (which works with Godot's own rendering subsystems), [godot.RenderingDevice] is much lower-level and allows working more directly with the underlying graphics APIs. [godot.RenderingDevice] is used in Godot to provide support for several modern low-level graphics APIs while reducing the amount of code duplication required. [godot.RenderingDevice] can also be used in your own projects to perform things that are not exposed by [godot.RenderingServer] or high-level nodes, such as using compute shaders.
 *
 * On startup, Godot creates a global [godot.RenderingDevice] which can be retrieved using [godot.RenderingServer.getRenderingDevice]. This global [godot.RenderingDevice] performs drawing to the screen.
 *
 * **Local RenderingDevices:** Using [godot.RenderingServer.createLocalRenderingDevice], you can create "secondary" rendering devices to perform drawing and GPU compute operations on separate threads.
 *
 * **Note:** [godot.RenderingDevice] assumes intermediate knowledge of modern graphics APIs such as Vulkan, Direct3D 12, Metal or WebGPU. These graphics APIs are lower-level than OpenGL or Direct3D 11, requiring you to perform what was previously done by the graphics driver itself. If you have difficulty understanding the concepts used in this class, follow the [godot.Vulkan Tutorial](https://vulkan-tutorial.com/) or [godot.Vulkan Guide](https://vkguide.dev/). It's recommended to have existing modern OpenGL or Direct3D 11 knowledge before attempting to learn a low-level graphics API.
 *
 * **Note:** [godot.RenderingDevice] is not available when running in headless mode or when using the Compatibility rendering method.
 */
@GodotBaseType
public open class RenderingDevice internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RENDERINGDEVICE, scriptIndex)
    return true
  }

  /**
   * Creates a new texture. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method.
   *
   * **Note:** Not to be confused with [godot.RenderingServer.texture2dCreate], which creates the Godot-specific [godot.Texture2D] resource as opposed to the graphics API's own texture type.
   */
  @JvmOverloads
  public fun textureCreate(
    format: RDTextureFormat,
    view: RDTextureView,
    `data`: VariantArray<PackedByteArray> = godot.core.variantArrayOf(),
  ): RID {
    TransferContext.writeArguments(OBJECT to format, OBJECT to view, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.textureCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a shared texture using the specified [view] and the texture information from [withTexture].
   */
  public fun textureCreateShared(view: RDTextureView, withTexture: RID): RID {
    TransferContext.writeArguments(OBJECT to view, _RID to withTexture)
    TransferContext.callMethod(rawPtr, MethodBindings.textureCreateSharedPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a shared texture using the specified [view] and the texture information from [withTexture]'s [layer] and [mipmap]. The number of included mipmaps from the original texture can be controlled using the [mipmaps] parameter. Only relevant for textures with multiple layers, such as 3D textures, texture arrays and cubemaps. For single-layer textures, use [textureCreateShared]
   *
   * For 2D textures (which only have one layer), [layer] must be `0`.
   *
   * **Note:** Layer slicing is only supported for 2D texture arrays, not 3D textures or cubemaps.
   */
  @JvmOverloads
  public fun textureCreateSharedFromSlice(
    view: RDTextureView,
    withTexture: RID,
    layer: Long,
    mipmap: Long,
    mipmaps: Long = 1,
    sliceType: TextureSliceType = RenderingDevice.TextureSliceType.TEXTURE_SLICE_2D,
  ): RID {
    TransferContext.writeArguments(OBJECT to view, _RID to withTexture, LONG to layer, LONG to mipmap, LONG to mipmaps, LONG to sliceType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.textureCreateSharedFromSlicePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns an RID for an existing [image] (`VkImage`) with the given [type], [format], [samples], [usageFlags], [width], [height], [depth], and [layers]. This can be used to allow Godot to render onto foreign images.
   */
  public fun textureCreateFromExtension(
    type: TextureType,
    format: DataFormat,
    samples: TextureSamples,
    usageFlags: TextureUsageBits,
    image: Long,
    width: Long,
    height: Long,
    depth: Long,
    layers: Long,
  ): RID {
    TransferContext.writeArguments(LONG to type.id, LONG to format.id, LONG to samples.id, LONG to usageFlags.flag, LONG to image, LONG to width, LONG to height, LONG to depth, LONG to layers)
    TransferContext.callMethod(rawPtr, MethodBindings.textureCreateFromExtensionPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Updates texture data with new data, replacing the previous data in place. The updated texture data must have the same dimensions and format. For 2D textures (which only have one layer), [layer] must be `0`. Returns [@GlobalScope.OK] if the update was successful, [@GlobalScope.ERR_INVALID_PARAMETER] otherwise.
   *
   * **Note:** Updating textures is forbidden during creation of a draw or compute list.
   *
   * **Note:** The existing [texture] can't be updated while a draw list that uses it as part of a framebuffer is being created. Ensure the draw list is finalized (and that the color/depth texture using it is not set to [FINAL_ACTION_CONTINUE]) to update this texture.
   *
   * **Note:** The existing [texture] requires the [TEXTURE_USAGE_CAN_UPDATE_BIT] to be updatable.
   */
  @JvmOverloads
  public fun textureUpdate(
    texture: RID,
    layer: Long,
    `data`: PackedByteArray,
    postBarrier: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS,
  ): GodotError {
    TransferContext.writeArguments(_RID to texture, LONG to layer, PACKED_BYTE_ARRAY to data, LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.textureUpdatePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the [texture] data for the specified [layer] as raw binary data. For 2D textures (which only have one layer), [layer] must be `0`.
   *
   * **Note:** [texture] can't be retrieved while a draw list that uses it as part of a framebuffer is being created. Ensure the draw list is finalized (and that the color/depth texture using it is not set to [FINAL_ACTION_CONTINUE]) to retrieve this texture. Otherwise, an error is printed and a empty [godot.PackedByteArray] is returned.
   *
   * **Note:** [texture] requires the [TEXTURE_USAGE_CAN_COPY_FROM_BIT] to be retrieved. Otherwise, an error is printed and a empty [godot.PackedByteArray] is returned.
   */
  public fun textureGetData(texture: RID, layer: Long): PackedByteArray {
    TransferContext.writeArguments(_RID to texture, LONG to layer)
    TransferContext.callMethod(rawPtr, MethodBindings.textureGetDataPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   * Returns `true` if the specified [format] is supported for the given [usageFlags], `false` otherwise.
   */
  public fun textureIsFormatSupportedForUsage(format: DataFormat, usageFlags: TextureUsageBits):
      Boolean {
    TransferContext.writeArguments(LONG to format.id, LONG to usageFlags.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.textureIsFormatSupportedForUsagePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the [texture] is shared, `false` otherwise. See [godot.RDTextureView].
   */
  public fun textureIsShared(texture: RID): Boolean {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.textureIsSharedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the [texture] is valid, `false` otherwise.
   */
  public fun textureIsValid(texture: RID): Boolean {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.textureIsValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Copies the [fromTexture] to [toTexture] with the specified [fromPos], [toPos] and [size] coordinates. The Z axis of the [fromPos], [toPos] and [size] must be `0` for 2-dimensional textures. Source and destination mipmaps/layers must also be specified, with these parameters being `0` for textures without mipmaps or single-layer textures. Returns [@GlobalScope.OK] if the texture copy was successful or [@GlobalScope.ERR_INVALID_PARAMETER] otherwise.
   *
   * **Note:** [fromTexture] texture can't be copied while a draw list that uses it as part of a framebuffer is being created. Ensure the draw list is finalized (and that the color/depth texture using it is not set to [FINAL_ACTION_CONTINUE]) to copy this texture.
   *
   * **Note:** [fromTexture] texture requires the [TEXTURE_USAGE_CAN_COPY_FROM_BIT] to be retrieved.
   *
   * **Note:** [toTexture] can't be copied while a draw list that uses it as part of a framebuffer is being created. Ensure the draw list is finalized (and that the color/depth texture using it is not set to [FINAL_ACTION_CONTINUE]) to copy this texture.
   *
   * **Note:** [toTexture] requires the [TEXTURE_USAGE_CAN_COPY_TO_BIT] to be retrieved.
   *
   * **Note:** [fromTexture] and [toTexture] must be of the same type (color or depth).
   */
  @JvmOverloads
  public fun textureCopy(
    fromTexture: RID,
    toTexture: RID,
    fromPos: Vector3,
    toPos: Vector3,
    size: Vector3,
    srcMipmap: Long,
    dstMipmap: Long,
    srcLayer: Long,
    dstLayer: Long,
    postBarrier: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS,
  ): GodotError {
    TransferContext.writeArguments(_RID to fromTexture, _RID to toTexture, VECTOR3 to fromPos, VECTOR3 to toPos, VECTOR3 to size, LONG to srcMipmap, LONG to dstMipmap, LONG to srcLayer, LONG to dstLayer, LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.textureCopyPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Clears the specified [texture] by replacing all of its pixels with the specified [color]. [baseMipmap] and [mipmapCount] determine which mipmaps of the texture are affected by this clear operation, while [baseLayer] and [layerCount] determine which layers of a 3D texture (or texture array) are affected by this clear operation. For 2D textures (which only have one layer by design), [baseLayer] must be `0` and [layerCount] must be `1`.
   *
   * **Note:** [texture] can't be cleared while a draw list that uses it as part of a framebuffer is being created. Ensure the draw list is finalized (and that the color/depth texture using it is not set to [FINAL_ACTION_CONTINUE]) to clear this texture.
   */
  @JvmOverloads
  public fun textureClear(
    texture: RID,
    color: Color,
    baseMipmap: Long,
    mipmapCount: Long,
    baseLayer: Long,
    layerCount: Long,
    postBarrier: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS,
  ): GodotError {
    TransferContext.writeArguments(_RID to texture, COLOR to color, LONG to baseMipmap, LONG to mipmapCount, LONG to baseLayer, LONG to layerCount, LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.textureClearPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Resolves the [fromTexture] texture onto [toTexture] with multisample antialiasing enabled. This must be used when rendering a framebuffer for MSAA to work. Returns [@GlobalScope.OK] if successful, [@GlobalScope.ERR_INVALID_PARAMETER] otherwise.
   *
   * **Note:** [fromTexture] and [toTexture] textures must have the same dimension, format and type (color or depth).
   *
   * **Note:** [fromTexture] can't be copied while a draw list that uses it as part of a framebuffer is being created. Ensure the draw list is finalized (and that the color/depth texture using it is not set to [FINAL_ACTION_CONTINUE]) to resolve this texture.
   *
   * **Note:** [fromTexture] requires the [TEXTURE_USAGE_CAN_COPY_FROM_BIT] to be retrieved.
   *
   * **Note:** [fromTexture] must be multisampled and must also be 2D (or a slice of a 3D/cubemap texture).
   *
   * **Note:** [toTexture] can't be copied while a draw list that uses it as part of a framebuffer is being created. Ensure the draw list is finalized (and that the color/depth texture using it is not set to [FINAL_ACTION_CONTINUE]) to resolve this texture.
   *
   * **Note:** [toTexture] texture requires the [TEXTURE_USAGE_CAN_COPY_TO_BIT] to be retrieved.
   *
   * **Note:** [toTexture] texture must **not** be multisampled and must also be 2D (or a slice of a 3D/cubemap texture).
   */
  @JvmOverloads
  public fun textureResolveMultisample(
    fromTexture: RID,
    toTexture: RID,
    postBarrier: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS,
  ): GodotError {
    TransferContext.writeArguments(_RID to fromTexture, _RID to toTexture, LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.textureResolveMultisamplePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the data format used to create this texture.
   */
  public fun textureGetFormat(texture: RID): RDTextureFormat? {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.textureGetFormatPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as RDTextureFormat?)
  }

  /**
   * Returns the internal graphics handle for this texture object. For use when communicating with third-party APIs mostly with GDExtension.
   *
   * **Note:** This function returns a `uint64_t` which internally maps to a `GLuint` (OpenGL) or `VkImage` (Vulkan).
   */
  public fun textureGetNativeHandle(texture: RID): Long {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.textureGetNativeHandlePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Creates a new framebuffer format with the specified [attachments] and [viewCount]. Returns the new framebuffer's unique framebuffer format ID.
   *
   * If [viewCount] is greater than or equal to `2`, enables multiview which is used for VR rendering. This requires support for the Vulkan multiview extension.
   */
  @JvmOverloads
  public fun framebufferFormatCreate(attachments: VariantArray<RDAttachmentFormat>, viewCount: Long
      = 1): Long {
    TransferContext.writeArguments(ARRAY to attachments, LONG to viewCount)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferFormatCreatePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Creates a multipass framebuffer format with the specified [attachments], [passes] and [viewCount] and returns its ID. If [viewCount] is greater than or equal to `2`, enables multiview which is used for VR rendering. This requires support for the Vulkan multiview extension.
   */
  @JvmOverloads
  public fun framebufferFormatCreateMultipass(
    attachments: VariantArray<RDAttachmentFormat>,
    passes: VariantArray<RDFramebufferPass>,
    viewCount: Long = 1,
  ): Long {
    TransferContext.writeArguments(ARRAY to attachments, ARRAY to passes, LONG to viewCount)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferFormatCreateMultipassPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Creates a new empty framebuffer format with the specified number of [samples] and returns its ID.
   */
  @JvmOverloads
  public fun framebufferFormatCreateEmpty(samples: TextureSamples =
      RenderingDevice.TextureSamples.TEXTURE_SAMPLES_1): Long {
    TransferContext.writeArguments(LONG to samples.id)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferFormatCreateEmptyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the number of texture samples used for the given framebuffer [format] ID (returned by [framebufferGetFormat]).
   */
  @JvmOverloads
  public fun framebufferFormatGetTextureSamples(format: Long, renderPass: Long = 0):
      TextureSamples {
    TransferContext.writeArguments(LONG to format, LONG to renderPass)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferFormatGetTextureSamplesPtr, LONG)
    return RenderingDevice.TextureSamples.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Creates a new framebuffer. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method.
   */
  @JvmOverloads
  public fun framebufferCreate(
    textures: VariantArray<RID>,
    validateWithFormat: Long = -1,
    viewCount: Long = 1,
  ): RID {
    TransferContext.writeArguments(ARRAY to textures, LONG to validateWithFormat, LONG to viewCount)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a new multipass framebuffer. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method.
   */
  @JvmOverloads
  public fun framebufferCreateMultipass(
    textures: VariantArray<RID>,
    passes: VariantArray<RDFramebufferPass>,
    validateWithFormat: Long = -1,
    viewCount: Long = 1,
  ): RID {
    TransferContext.writeArguments(ARRAY to textures, ARRAY to passes, LONG to validateWithFormat, LONG to viewCount)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferCreateMultipassPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a new empty framebuffer. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method.
   */
  @JvmOverloads
  public fun framebufferCreateEmpty(
    size: Vector2i,
    samples: TextureSamples = RenderingDevice.TextureSamples.TEXTURE_SAMPLES_1,
    validateWithFormat: Long = -1,
  ): RID {
    TransferContext.writeArguments(VECTOR2I to size, LONG to samples.id, LONG to validateWithFormat)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferCreateEmptyPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the format ID of the framebuffer specified by the [framebuffer] RID. This ID is guaranteed to be unique for the same formats and does not need to be freed.
   */
  public fun framebufferGetFormat(framebuffer: RID): Long {
    TransferContext.writeArguments(_RID to framebuffer)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferGetFormatPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns `true` if the framebuffer specified by the [framebuffer] RID is valid, `false` otherwise.
   */
  public fun framebufferIsValid(framebuffer: RID): Boolean {
    TransferContext.writeArguments(_RID to framebuffer)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferIsValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Creates a new sampler. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method.
   */
  public fun samplerCreate(state: RDSamplerState): RID {
    TransferContext.writeArguments(OBJECT to state)
    TransferContext.callMethod(rawPtr, MethodBindings.samplerCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns `true` if implementation supports using a texture of [format] with the given [samplerFilter].
   */
  public fun samplerIsFormatSupportedForFilter(format: DataFormat, samplerFilter: SamplerFilter):
      Boolean {
    TransferContext.writeArguments(LONG to format.id, LONG to samplerFilter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.samplerIsFormatSupportedForFilterPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method.
   */
  @JvmOverloads
  public fun vertexBufferCreate(
    sizeBytes: Long,
    `data`: PackedByteArray = PackedByteArray(),
    useAsStorage: Boolean = false,
  ): RID {
    TransferContext.writeArguments(LONG to sizeBytes, PACKED_BYTE_ARRAY to data, BOOL to useAsStorage)
    TransferContext.callMethod(rawPtr, MethodBindings.vertexBufferCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a new vertex format with the specified [vertexDescriptions]. Returns a unique vertex format ID corresponding to the newly created vertex format.
   */
  public fun vertexFormatCreate(vertexDescriptions: VariantArray<RDVertexAttribute>): Long {
    TransferContext.writeArguments(ARRAY to vertexDescriptions)
    TransferContext.callMethod(rawPtr, MethodBindings.vertexFormatCreatePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Creates a vertex array based on the specified buffers. Optionally, [offsets] (in bytes) may be defined for each buffer.
   */
  @JvmOverloads
  public fun vertexArrayCreate(
    vertexCount: Long,
    vertexFormat: Long,
    srcBuffers: VariantArray<RID>,
    offsets: PackedInt64Array = PackedInt64Array(),
  ): RID {
    TransferContext.writeArguments(LONG to vertexCount, LONG to vertexFormat, ARRAY to srcBuffers, PACKED_INT_64_ARRAY to offsets)
    TransferContext.callMethod(rawPtr, MethodBindings.vertexArrayCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a new index buffer. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method.
   */
  @JvmOverloads
  public fun indexBufferCreate(
    sizeIndices: Long,
    format: IndexBufferFormat,
    `data`: PackedByteArray = PackedByteArray(),
    useRestartIndices: Boolean = false,
  ): RID {
    TransferContext.writeArguments(LONG to sizeIndices, LONG to format.id, PACKED_BYTE_ARRAY to data, BOOL to useRestartIndices)
    TransferContext.callMethod(rawPtr, MethodBindings.indexBufferCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a new index array. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method.
   */
  public fun indexArrayCreate(
    indexBuffer: RID,
    indexOffset: Long,
    indexCount: Long,
  ): RID {
    TransferContext.writeArguments(_RID to indexBuffer, LONG to indexOffset, LONG to indexCount)
    TransferContext.callMethod(rawPtr, MethodBindings.indexArrayCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Compiles a SPIR-V from the shader source code in [shaderSource] and returns the SPIR-V as a [godot.RDShaderSPIRV]. This intermediate language shader is portable across different GPU models and driver versions, but cannot be run directly by GPUs until compiled into a binary shader using [shaderCompileBinaryFromSpirv].
   *
   * If [allowCache] is `true`, make use of the shader cache generated by Godot. This avoids a potentially lengthy shader compilation step if the shader is already in cache. If [allowCache] is `false`, Godot's shader cache is ignored and the shader will always be recompiled.
   */
  @JvmOverloads
  public fun shaderCompileSpirvFromSource(shaderSource: RDShaderSource, allowCache: Boolean = true):
      RDShaderSPIRV? {
    TransferContext.writeArguments(OBJECT to shaderSource, BOOL to allowCache)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderCompileSpirvFromSourcePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as RDShaderSPIRV?)
  }

  /**
   * Compiles a binary shader from [spirvData] and returns the compiled binary data as a [godot.PackedByteArray]. This compiled shader is specific to the GPU model and driver version used; it will not work on different GPU models or even different driver versions. See also [shaderCompileSpirvFromSource].
   *
   * [name] is an optional human-readable name that can be given to the compiled shader for organizational purposes.
   */
  @JvmOverloads
  public fun shaderCompileBinaryFromSpirv(spirvData: RDShaderSPIRV, name: String = ""):
      PackedByteArray {
    TransferContext.writeArguments(OBJECT to spirvData, STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderCompileBinaryFromSpirvPtr,
        PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   * Creates a new shader instance from SPIR-V intermediate code. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method. See also [shaderCompileSpirvFromSource] and [shaderCreateFromBytecode].
   */
  @JvmOverloads
  public fun shaderCreateFromSpirv(spirvData: RDShaderSPIRV, name: String = ""): RID {
    TransferContext.writeArguments(OBJECT to spirvData, STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderCreateFromSpirvPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a new shader instance from a binary compiled shader. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method. See also [shaderCompileBinaryFromSpirv] and [shaderCreateFromSpirv].
   */
  @JvmOverloads
  public fun shaderCreateFromBytecode(binaryData: PackedByteArray, placeholderRid: RID = RID()):
      RID {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to binaryData, _RID to placeholderRid)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderCreateFromBytecodePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Create a placeholder RID by allocating an RID without initializing it for use in [shaderCreateFromBytecode]. This allows you to create an RID for a shader and pass it around, but defer compiling the shader to a later time.
   */
  public fun shaderCreatePlaceholder(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.shaderCreatePlaceholderPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the internal vertex input mask. Internally, the vertex input mask is an unsigned integer consisting of the locations (specified in GLSL via. `layout(location = ...)`) of the input variables (specified in GLSL by the `in` keyword).
   */
  public fun shaderGetVertexInputAttributeMask(shader: RID): Long {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderGetVertexInputAttributeMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Creates a new uniform buffer. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method.
   */
  @JvmOverloads
  public fun uniformBufferCreate(sizeBytes: Long, `data`: PackedByteArray = PackedByteArray()):
      RID {
    TransferContext.writeArguments(LONG to sizeBytes, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.uniformBufferCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a [storage buffer](https://vkguide.dev/docs/chapter-4/storage_buffers/) with the specified [data] and [usage]. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method.
   */
  @JvmOverloads
  public fun storageBufferCreate(
    sizeBytes: Long,
    `data`: PackedByteArray = PackedByteArray(),
    usage: StorageBufferUsage = RenderingDevice.StorageBufferUsageValue(0),
  ): RID {
    TransferContext.writeArguments(LONG to sizeBytes, PACKED_BYTE_ARRAY to data, LONG to usage.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.storageBufferCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a new texture buffer. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method.
   */
  @JvmOverloads
  public fun textureBufferCreate(
    sizeBytes: Long,
    format: DataFormat,
    `data`: PackedByteArray = PackedByteArray(),
  ): RID {
    TransferContext.writeArguments(LONG to sizeBytes, LONG to format.id, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.textureBufferCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a new uniform set. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method.
   */
  public fun uniformSetCreate(
    uniforms: VariantArray<RDUniform>,
    shader: RID,
    shaderSet: Long,
  ): RID {
    TransferContext.writeArguments(ARRAY to uniforms, _RID to shader, LONG to shaderSet)
    TransferContext.callMethod(rawPtr, MethodBindings.uniformSetCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Checks if the [uniformSet] is valid, i.e. is owned.
   */
  public fun uniformSetIsValid(uniformSet: RID): Boolean {
    TransferContext.writeArguments(_RID to uniformSet)
    TransferContext.callMethod(rawPtr, MethodBindings.uniformSetIsValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Updates a region of [sizeBytes] bytes, starting at [offset], in the buffer, with the specified [data]. Raises a memory barrier except when [postBarrier] is set to [BARRIER_MASK_NO_BARRIER].
   *
   * Prints an error if:
   *
   * - the region specified by [offset] + [sizeBytes] exceeds the buffer
   *
   * - a draw list is currently active (created by [drawListBegin])
   *
   * - a compute list is currently active (created by [computeListBegin])
   */
  @JvmOverloads
  public fun bufferUpdate(
    buffer: RID,
    offset: Long,
    sizeBytes: Long,
    `data`: PackedByteArray,
    postBarrier: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS,
  ): GodotError {
    TransferContext.writeArguments(_RID to buffer, LONG to offset, LONG to sizeBytes, PACKED_BYTE_ARRAY to data, LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.bufferUpdatePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Clears the contents of the [buffer], clearing [sizeBytes] bytes, starting at [offset]. Always raises a memory barrier.
   *
   * Prints an error if:
   *
   * - the size isn't a multiple of four
   *
   * - the region specified by [offset] + [sizeBytes] exceeds the buffer
   *
   * - a draw list is currently active (created by [drawListBegin])
   *
   * - a compute list is currently active (created by [computeListBegin])
   */
  @JvmOverloads
  public fun bufferClear(
    buffer: RID,
    offset: Long,
    sizeBytes: Long,
    postBarrier: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS,
  ): GodotError {
    TransferContext.writeArguments(_RID to buffer, LONG to offset, LONG to sizeBytes, LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.bufferClearPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a copy of the data of the specified [buffer], optionally [offsetBytes] and [sizeBytes] can be set to copy only a portion of the buffer.
   */
  @JvmOverloads
  public fun bufferGetData(
    buffer: RID,
    offsetBytes: Long = 0,
    sizeBytes: Long = 0,
  ): PackedByteArray {
    TransferContext.writeArguments(_RID to buffer, LONG to offsetBytes, LONG to sizeBytes)
    TransferContext.callMethod(rawPtr, MethodBindings.bufferGetDataPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   * Creates a new render pipeline. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method.
   */
  @JvmOverloads
  public fun renderPipelineCreate(
    shader: RID,
    framebufferFormat: Long,
    vertexFormat: Long,
    primitive: RenderPrimitive,
    rasterizationState: RDPipelineRasterizationState,
    multisampleState: RDPipelineMultisampleState,
    stencilState: RDPipelineDepthStencilState,
    colorBlendState: RDPipelineColorBlendState,
    dynamicStateFlags: PipelineDynamicStateFlags =
        RenderingDevice.PipelineDynamicStateFlagsValue(0),
    forRenderPass: Long = 0,
    specializationConstants: VariantArray<RDPipelineSpecializationConstant> =
        godot.core.variantArrayOf(),
  ): RID {
    TransferContext.writeArguments(_RID to shader, LONG to framebufferFormat, LONG to vertexFormat, LONG to primitive.id, OBJECT to rasterizationState, OBJECT to multisampleState, OBJECT to stencilState, OBJECT to colorBlendState, LONG to dynamicStateFlags.flag, LONG to forRenderPass, ARRAY to specializationConstants)
    TransferContext.callMethod(rawPtr, MethodBindings.renderPipelineCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns `true` if the render pipeline specified by the [renderPipeline] RID is valid, `false` otherwise.
   */
  public fun renderPipelineIsValid(renderPipeline: RID): Boolean {
    TransferContext.writeArguments(_RID to renderPipeline)
    TransferContext.callMethod(rawPtr, MethodBindings.renderPipelineIsValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Creates a new compute pipeline. It can be accessed with the RID that is returned.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingDevice's [freeRid] method.
   */
  @JvmOverloads
  public fun computePipelineCreate(shader: RID,
      specializationConstants: VariantArray<RDPipelineSpecializationConstant> =
      godot.core.variantArrayOf()): RID {
    TransferContext.writeArguments(_RID to shader, ARRAY to specializationConstants)
    TransferContext.callMethod(rawPtr, MethodBindings.computePipelineCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns `true` if the compute pipeline specified by the [computePipeline] RID is valid, `false` otherwise.
   */
  public fun computePipelineIsValid(computePipeline: RID): Boolean {
    TransferContext.writeArguments(_RID to computePipeline)
    TransferContext.callMethod(rawPtr, MethodBindings.computePipelineIsValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the window width matching the graphics API context for the given window ID (in pixels). Despite the parameter being named [screen], this returns the *window* size. See also [screenGetHeight].
   *
   * **Note:** Only the main [godot.RenderingDevice] returned by [godot.RenderingServer.getRenderingDevice] has a width. If called on a local [godot.RenderingDevice], this method prints an error and returns [INVALID_ID].
   */
  @JvmOverloads
  public fun screenGetWidth(screen: Int = 0): Int {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the window height matching the graphics API context for the given window ID (in pixels). Despite the parameter being named [screen], this returns the *window* size. See also [screenGetWidth].
   *
   * **Note:** Only the main [godot.RenderingDevice] returned by [godot.RenderingServer.getRenderingDevice] has a height. If called on a local [godot.RenderingDevice], this method prints an error and returns [INVALID_ID].
   */
  @JvmOverloads
  public fun screenGetHeight(screen: Int = 0): Int {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the screen's framebuffer format.
   *
   * **Note:** Only the main [godot.RenderingDevice] returned by [godot.RenderingServer.getRenderingDevice] has a format. If called on a local [godot.RenderingDevice], this method prints an error and returns [INVALID_ID].
   */
  public fun screenGetFramebufferFormat(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetFramebufferFormatPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * High-level variant of [drawListBegin], with the parameters automatically being adjusted for drawing onto the window specified by the [screen] ID.
   *
   * **Note:** Cannot be used with local RenderingDevices, as these don't have a screen. If called on a local RenderingDevice, [drawListBeginForScreen] returns [INVALID_ID].
   */
  @JvmOverloads
  public fun drawListBeginForScreen(screen: Int = 0, clearColor: Color = Color(Color(0, 0, 0, 1))):
      Long {
    TransferContext.writeArguments(LONG to screen.toLong(), COLOR to clearColor)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListBeginForScreenPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Starts a list of raster drawing commands created with the `draw_*` methods. The returned value should be passed to other `draw_list_*` functions.
   *
   * Multiple draw lists cannot be created at the same time; you must finish the previous draw list first using [drawListEnd].
   *
   * A simple drawing operation might look like this (code is not a complete example):
   *
   * ```
   * 				var rd = RenderingDevice.new()
   * 				var clear_colors = PackedColorArray([godot.Color(0, 0, 0, 0), Color(0, 0, 0, 0), Color(0, 0, 0, 0)]
   * 				var draw_list = rd.draw_list_begin(framebuffers*, RenderingDevice.INITIAL_ACTION_CLEAR, RenderingDevice.FINAL_ACTION_READ, RenderingDevice.INITIAL_ACTION_CLEAR, RenderingDevice.FINAL_ACTION_DISCARD, clear_colors)
   *
   * 				# Draw opaque.
   * 				rd.draw_list_bind_render_pipeline(draw_list, raster_pipeline)
   * 				rd.draw_list_bind_uniform_set(draw_list, raster_base_uniform, 0)
   * 				rd.draw_list_set_push_constant(draw_list, raster_push_constant, raster_push_constant.size())
   * 				rd.draw_list_draw(draw_list, false, 1, slice_triangle_count* * 3)
   * 				# Draw wire.
   * 				rd.draw_list_bind_render_pipeline(draw_list, raster_pipeline_wire)
   * 				rd.draw_list_bind_uniform_set(draw_list, raster_base_uniform, 0)
   * 				rd.draw_list_set_push_constant(draw_list, raster_push_constant, raster_push_constant.size())
   * 				rd.draw_list_draw(draw_list, false, 1, slice_triangle_count* * 3)
   *
   * 				rd.draw_list_end()
   * 				```
   */
  @JvmOverloads
  public fun drawListBegin(
    framebuffer: RID,
    initialColorAction: InitialAction,
    finalColorAction: FinalAction,
    initialDepthAction: InitialAction,
    finalDepthAction: FinalAction,
    clearColorValues: PackedColorArray = PackedColorArray(),
    clearDepth: Float = 1.0f,
    clearStencil: Long = 0,
    region: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    storageTextures: VariantArray<RID> = godot.core.variantArrayOf(),
  ): Long {
    TransferContext.writeArguments(_RID to framebuffer, LONG to initialColorAction.id, LONG to finalColorAction.id, LONG to initialDepthAction.id, LONG to finalDepthAction.id, PACKED_COLOR_ARRAY to clearColorValues, DOUBLE to clearDepth.toDouble(), LONG to clearStencil, RECT2 to region, ARRAY to storageTextures)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListBeginPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Variant of [drawListBegin] with support for multiple splits. The [splits] parameter determines how many splits are created.
   */
  @JvmOverloads
  public fun drawListBeginSplit(
    framebuffer: RID,
    splits: Long,
    initialColorAction: InitialAction,
    finalColorAction: FinalAction,
    initialDepthAction: InitialAction,
    finalDepthAction: FinalAction,
    clearColorValues: PackedColorArray = PackedColorArray(),
    clearDepth: Float = 1.0f,
    clearStencil: Long = 0,
    region: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    storageTextures: VariantArray<RID> = godot.core.variantArrayOf(),
  ): PackedInt64Array {
    TransferContext.writeArguments(_RID to framebuffer, LONG to splits, LONG to initialColorAction.id, LONG to finalColorAction.id, LONG to initialDepthAction.id, LONG to finalDepthAction.id, PACKED_COLOR_ARRAY to clearColorValues, DOUBLE to clearDepth.toDouble(), LONG to clearStencil, RECT2 to region, ARRAY to storageTextures)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListBeginSplitPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  /**
   * Sets blend constants for the specified [drawList] to [color]. Blend constants are used only if the graphics pipeline is created with [DYNAMIC_STATE_BLEND_CONSTANTS] flag set.
   */
  public fun drawListSetBlendConstants(drawList: Long, color: Color): Unit {
    TransferContext.writeArguments(LONG to drawList, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListSetBlendConstantsPtr, NIL)
  }

  /**
   * Binds [renderPipeline] to the specified [drawList].
   */
  public fun drawListBindRenderPipeline(drawList: Long, renderPipeline: RID): Unit {
    TransferContext.writeArguments(LONG to drawList, _RID to renderPipeline)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListBindRenderPipelinePtr, NIL)
  }

  /**
   * Binds [uniformSet] to the specified [drawList]. A [setIndex] must also be specified, which is an identifier starting from `0` that must match the one expected by the draw list.
   */
  public fun drawListBindUniformSet(
    drawList: Long,
    uniformSet: RID,
    setIndex: Long,
  ): Unit {
    TransferContext.writeArguments(LONG to drawList, _RID to uniformSet, LONG to setIndex)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListBindUniformSetPtr, NIL)
  }

  /**
   * Binds [vertexArray] to the specified [drawList].
   */
  public fun drawListBindVertexArray(drawList: Long, vertexArray: RID): Unit {
    TransferContext.writeArguments(LONG to drawList, _RID to vertexArray)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListBindVertexArrayPtr, NIL)
  }

  /**
   * Binds [indexArray] to the specified [drawList].
   */
  public fun drawListBindIndexArray(drawList: Long, indexArray: RID): Unit {
    TransferContext.writeArguments(LONG to drawList, _RID to indexArray)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListBindIndexArrayPtr, NIL)
  }

  /**
   * Sets the push constant data to [buffer] for the specified [drawList]. The shader determines how this binary data is used. The buffer's size in bytes must also be specified in [sizeBytes] (this can be obtained by calling the [godot.PackedByteArray.size] method on the passed [buffer]).
   */
  public fun drawListSetPushConstant(
    drawList: Long,
    buffer: PackedByteArray,
    sizeBytes: Long,
  ): Unit {
    TransferContext.writeArguments(LONG to drawList, PACKED_BYTE_ARRAY to buffer, LONG to sizeBytes)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListSetPushConstantPtr, NIL)
  }

  /**
   * Submits [drawList] for rendering on the GPU. This is the raster equivalent to [computeListDispatch].
   */
  @JvmOverloads
  public fun drawListDraw(
    drawList: Long,
    useIndices: Boolean,
    instances: Long,
    proceduralVertexCount: Long = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to drawList, BOOL to useIndices, LONG to instances, LONG to proceduralVertexCount)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListDrawPtr, NIL)
  }

  /**
   * Creates a scissor rectangle and enables it for the specified [drawList]. Scissor rectangles are used for clipping by discarding fragments that fall outside a specified rectangular portion of the screen. See also [drawListDisableScissor].
   *
   * **Note:** The specified [rect] is automatically intersected with the screen's dimensions, which means it cannot exceed the screen's dimensions.
   */
  @JvmOverloads
  public fun drawListEnableScissor(drawList: Long, rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0)): Unit {
    TransferContext.writeArguments(LONG to drawList, RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListEnableScissorPtr, NIL)
  }

  /**
   * Removes and disables the scissor rectangle for the specified [drawList]. See also [drawListEnableScissor].
   */
  public fun drawListDisableScissor(drawList: Long): Unit {
    TransferContext.writeArguments(LONG to drawList)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListDisableScissorPtr, NIL)
  }

  /**
   * Switches to the next draw pass and returns the split's ID. Equivalent to [drawListSwitchToNextPassSplit] with `splits` set to `1`.
   */
  public fun drawListSwitchToNextPass(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.drawListSwitchToNextPassPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Switches to the next draw pass, with the number of splits allocated specified in [splits]. The return value is an array containing the ID of each split. For single-split usage, see [drawListSwitchToNextPass].
   */
  public fun drawListSwitchToNextPassSplit(splits: Long): PackedInt64Array {
    TransferContext.writeArguments(LONG to splits)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListSwitchToNextPassSplitPtr,
        PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  /**
   * Finishes a list of raster drawing commands created with the `draw_*` methods.
   */
  @JvmOverloads
  public fun drawListEnd(postBarrier: BarrierMask =
      RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS): Unit {
    TransferContext.writeArguments(LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListEndPtr, NIL)
  }

  /**
   * Starts a list of compute commands created with the `compute_*` methods. The returned value should be passed to other `compute_list_*` functions.
   *
   * If [allowDrawOverlap] is `true`, you may have one draw list running at the same time as one compute list. Multiple compute lists cannot be created at the same time; you must finish the previous compute list first using [computeListEnd].
   *
   * A simple compute operation might look like this (code is not a complete example):
   *
   * ```
   * 				var rd = RenderingDevice.new()
   * 				var compute_list = rd.compute_list_begin()
   *
   * 				rd.compute_list_bind_compute_pipeline(compute_list, compute_shader_dilate_pipeline)
   * 				rd.compute_list_bind_uniform_set(compute_list, compute_base_uniform_set, 0)
   * 				rd.compute_list_bind_uniform_set(compute_list, dilate_uniform_set, 1)
   *
   * 				for i in atlas_slices:
   * 				    rd.compute_list_set_push_constant(compute_list, push_constant, push_constant.size())
   * 				    rd.compute_list_dispatch(compute_list, group_size.x, group_size.y, group_size.z)
   * 				    # No barrier, let them run all together.
   *
   * 				rd.compute_list_end()
   * 				```
   */
  @JvmOverloads
  public fun computeListBegin(allowDrawOverlap: Boolean = false): Long {
    TransferContext.writeArguments(BOOL to allowDrawOverlap)
    TransferContext.callMethod(rawPtr, MethodBindings.computeListBeginPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Tells the GPU what compute pipeline to use when processing the compute list. If the shader has changed since the last time this function was called, Godot will unbind all descriptor sets and will re-bind them inside [computeListDispatch].
   */
  public fun computeListBindComputePipeline(computeList: Long, computePipeline: RID): Unit {
    TransferContext.writeArguments(LONG to computeList, _RID to computePipeline)
    TransferContext.callMethod(rawPtr, MethodBindings.computeListBindComputePipelinePtr, NIL)
  }

  /**
   * Sets the push constant data to [buffer] for the specified [computeList]. The shader determines how this binary data is used. The buffer's size in bytes must also be specified in [sizeBytes] (this can be obtained by calling the [godot.PackedByteArray.size] method on the passed [buffer]).
   */
  public fun computeListSetPushConstant(
    computeList: Long,
    buffer: PackedByteArray,
    sizeBytes: Long,
  ): Unit {
    TransferContext.writeArguments(LONG to computeList, PACKED_BYTE_ARRAY to buffer, LONG to sizeBytes)
    TransferContext.callMethod(rawPtr, MethodBindings.computeListSetPushConstantPtr, NIL)
  }

  /**
   * Binds the [uniformSet] to this [computeList]. Godot ensures that all textures in the uniform set have the correct Vulkan access masks. If Godot had to change access masks of textures, it will raise a Vulkan image memory barrier.
   */
  public fun computeListBindUniformSet(
    computeList: Long,
    uniformSet: RID,
    setIndex: Long,
  ): Unit {
    TransferContext.writeArguments(LONG to computeList, _RID to uniformSet, LONG to setIndex)
    TransferContext.callMethod(rawPtr, MethodBindings.computeListBindUniformSetPtr, NIL)
  }

  /**
   * Submits the compute list for processing on the GPU. This is the compute equivalent to [drawListDraw].
   */
  public fun computeListDispatch(
    computeList: Long,
    xGroups: Long,
    yGroups: Long,
    zGroups: Long,
  ): Unit {
    TransferContext.writeArguments(LONG to computeList, LONG to xGroups, LONG to yGroups, LONG to zGroups)
    TransferContext.callMethod(rawPtr, MethodBindings.computeListDispatchPtr, NIL)
  }

  /**
   * Raises a Vulkan compute barrier in the specified [computeList].
   */
  public fun computeListAddBarrier(computeList: Long): Unit {
    TransferContext.writeArguments(LONG to computeList)
    TransferContext.callMethod(rawPtr, MethodBindings.computeListAddBarrierPtr, NIL)
  }

  /**
   * Finishes a list of compute commands created with the `compute_*` methods.
   */
  @JvmOverloads
  public fun computeListEnd(postBarrier: BarrierMask =
      RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS): Unit {
    TransferContext.writeArguments(LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.computeListEndPtr, NIL)
  }

  /**
   * Tries to free an object in the RenderingDevice. To avoid memory leaks, this should be called after using an object as memory management does not occur automatically when using RenderingDevice directly.
   */
  public fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.freeRidPtr, NIL)
  }

  /**
   * Creates a timestamp marker with the specified [name]. This is used for performance reporting with the [getCapturedTimestampCpuTime], [getCapturedTimestampGpuTime] and [getCapturedTimestampName] methods.
   */
  public fun captureTimestamp(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.captureTimestampPtr, NIL)
  }

  /**
   * Returns the total number of timestamps (rendering steps) available for profiling.
   */
  public fun getCapturedTimestampsCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCapturedTimestampsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the index of the last frame rendered that has rendering timestamps available for querying.
   */
  public fun getCapturedTimestampsFrame(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCapturedTimestampsFramePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the timestamp in GPU time for the rendering step specified by [index] (in microseconds since the engine started). See also [getCapturedTimestampCpuTime] and [captureTimestamp].
   */
  public fun getCapturedTimestampGpuTime(index: Long): Long {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, MethodBindings.getCapturedTimestampGpuTimePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the timestamp in CPU time for the rendering step specified by [index] (in microseconds since the engine started). See also [getCapturedTimestampGpuTime] and [captureTimestamp].
   */
  public fun getCapturedTimestampCpuTime(index: Long): Long {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, MethodBindings.getCapturedTimestampCpuTimePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the timestamp's name for the rendering step specified by [index]. See also [captureTimestamp].
   */
  public fun getCapturedTimestampName(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, MethodBindings.getCapturedTimestampNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the value of the specified [limit]. This limit varies depending on the current graphics hardware (and sometimes the driver version). If the given limit is exceeded, rendering errors will occur.
   *
   * Limits for various graphics hardware can be found in the [godot.Vulkan Hardware Database](https://vulkan.gpuinfo.org/).
   */
  public fun limitGet(limit: Limit): Long {
    TransferContext.writeArguments(LONG to limit.id)
    TransferContext.callMethod(rawPtr, MethodBindings.limitGetPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the frame count kept by the graphics API. Higher values result in higher input lag, but with more consistent throughput. For the main [godot.RenderingDevice], frames are cycled (usually 3 with triple-buffered V-Sync enabled). However, local [godot.RenderingDevice]s only have 1 frame.
   */
  public fun getFrameDelay(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFrameDelayPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Pushes the frame setup and draw command buffers then marks the local device as currently processing (which allows calling [sync]).
   *
   * **Note:** Only available in local RenderingDevices.
   */
  public fun submit(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.submitPtr, NIL)
  }

  /**
   * Forces a synchronization between the CPU and GPU, which may be required in certain cases. Only call this when needed, as CPU-GPU synchronization has a performance cost.
   *
   * **Note:** Only available in local RenderingDevices.
   *
   * **Note:** [sync] can only be called after a [submit].
   */
  public fun sync(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.syncPtr, NIL)
  }

  /**
   * Puts a memory barrier in place. This is used for synchronization to avoid data races. See also [fullBarrier], which may be useful for debugging.
   */
  @JvmOverloads
  public fun barrier(from: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS,
      to: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS): Unit {
    TransferContext.writeArguments(LONG to from.flag, LONG to to.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.barrierPtr, NIL)
  }

  /**
   * Puts a *full* memory barrier in place. This is a memory [barrier] with all flags enabled. [fullBarrier] it should only be used for debugging as it can severely impact performance.
   */
  public fun fullBarrier(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.fullBarrierPtr, NIL)
  }

  /**
   * Create a new local [godot.RenderingDevice]. This is most useful for performing compute operations on the GPU independently from the rest of the engine.
   */
  public fun createLocalDevice(): RenderingDevice? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createLocalDevicePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as RenderingDevice?)
  }

  /**
   * Sets the resource name for [id] to [name]. This is used for debugging with third-party tools such as [godot.RenderDoc](https://renderdoc.org/).
   *
   * The following types of resources can be named: texture, sampler, vertex buffer, index buffer, uniform buffer, texture buffer, storage buffer, uniform set buffer, shader, render pipeline and compute pipeline. Framebuffers cannot be named. Attempting to name an incompatible resource type will print an error.
   *
   * **Note:** Resource names are only set when the engine runs in verbose mode ([godot.OS.isStdoutVerbose] = `true`), or when using an engine build compiled with the `dev_mode=yes` SCons option. The graphics driver must also support the `VK_EXT_DEBUG_UTILS_EXTENSION_NAME` Vulkan extension for named resources to work.
   */
  public fun setResourceName(id: RID, name: String): Unit {
    TransferContext.writeArguments(_RID to id, STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setResourceNamePtr, NIL)
  }

  /**
   * Create a command buffer debug label region that can be displayed in third-party tools such as [godot.RenderDoc](https://renderdoc.org/). All regions must be ended with a [drawCommandEndLabel] call. When viewed from the linear series of submissions to a single queue, calls to [drawCommandBeginLabel] and [drawCommandEndLabel] must be matched and balanced.
   *
   * The `VK_EXT_DEBUG_UTILS_EXTENSION_NAME` Vulkan extension must be available and enabled for command buffer debug label region to work. See also [drawCommandInsertLabel] and [drawCommandEndLabel].
   */
  public fun drawCommandBeginLabel(name: String, color: Color): Unit {
    TransferContext.writeArguments(STRING to name, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawCommandBeginLabelPtr, NIL)
  }

  /**
   * Inserts a command buffer debug label region in the current command buffer. Unlike [drawCommandBeginLabel], this region should not be ended with a [drawCommandEndLabel] call.
   */
  public fun drawCommandInsertLabel(name: String, color: Color): Unit {
    TransferContext.writeArguments(STRING to name, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawCommandInsertLabelPtr, NIL)
  }

  /**
   * Ends the command buffer debug label region started by a [drawCommandBeginLabel] call.
   */
  public fun drawCommandEndLabel(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.drawCommandEndLabelPtr, NIL)
  }

  /**
   * Returns the vendor of the video adapter (e.g. "NVIDIA Corporation"). Equivalent to [godot.RenderingServer.getVideoAdapterVendor]. See also [getDeviceName].
   */
  public fun getDeviceVendorName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDeviceVendorNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the name of the video adapter (e.g. "GeForce GTX 1080/PCIe/SSE2"). Equivalent to [godot.RenderingServer.getVideoAdapterName]. See also [getDeviceVendorName].
   */
  public fun getDeviceName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDeviceNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the universally unique identifier for the pipeline cache. This is used to cache shader files on disk, which avoids shader recompilations on subsequent engine runs. This UUID varies depending on the graphics card model, but also the driver version. Therefore, updating graphics drivers will invalidate the shader cache.
   */
  public fun getDevicePipelineCacheUuid(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDevicePipelineCacheUuidPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the memory usage in bytes corresponding to the given [type]. When using Vulkan, these statistics are calculated by [godot.Vulkan Memory Allocator](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator).
   */
  public fun getMemoryUsage(type: MemoryType): Long {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getMemoryUsagePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the unique identifier of the driver [resource] for the specified [rid]. Some driver resource types ignore the specified [rid] (see [enum DriverResource] descriptions). [index] is always ignored but must be specified anyway.
   */
  public fun getDriverResource(
    resource: DriverResource,
    rid: RID,
    index: Long,
  ): Long {
    TransferContext.writeArguments(LONG to resource.id, _RID to rid, LONG to index)
    TransferContext.callMethod(rawPtr, MethodBindings.getDriverResourcePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public enum class DeviceType(
    id: Long,
  ) {
    /**
     * Rendering device type does not match any of the other enum values or is unknown.
     */
    DEVICE_TYPE_OTHER(0),
    /**
     * Rendering device is an integrated GPU, which is typically *(but not always)* slower than dedicated GPUs ([DEVICE_TYPE_DISCRETE_GPU]). On Android and iOS, the rendering device type is always considered to be [DEVICE_TYPE_INTEGRATED_GPU].
     */
    DEVICE_TYPE_INTEGRATED_GPU(1),
    /**
     * Rendering device is a dedicated GPU, which is typically *(but not always)* faster than integrated GPUs ([DEVICE_TYPE_INTEGRATED_GPU]).
     */
    DEVICE_TYPE_DISCRETE_GPU(2),
    /**
     * Rendering device is an emulated GPU in a virtual environment. This is typically much slower than the host GPU, which means the expected performance level on a dedicated GPU will be roughly equivalent to [DEVICE_TYPE_INTEGRATED_GPU]. Virtual machine GPU passthrough (such as VFIO) will not report the device type as [DEVICE_TYPE_VIRTUAL_GPU]. Instead, the host GPU's device type will be reported as if the GPU was not emulated.
     */
    DEVICE_TYPE_VIRTUAL_GPU(3),
    /**
     * Rendering device is provided by software emulation (such as Lavapipe or [godot.SwiftShader](https://github.com/google/swiftshader)). This is the slowest kind of rendering device available; it's typically much slower than [DEVICE_TYPE_INTEGRATED_GPU].
     */
    DEVICE_TYPE_CPU(4),
    /**
     * Represents the size of the [enum DeviceType] enum.
     */
    DEVICE_TYPE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DriverResource(
    id: Long,
  ) {
    /**
     * Vulkan device driver resource. This is a "global" resource and ignores the RID passed in
     */
    DRIVER_RESOURCE_VULKAN_DEVICE(0),
    /**
     * Physical device (graphics card) driver resource.
     */
    DRIVER_RESOURCE_VULKAN_PHYSICAL_DEVICE(1),
    /**
     * Vulkan instance driver resource.
     */
    DRIVER_RESOURCE_VULKAN_INSTANCE(2),
    /**
     * Vulkan queue driver resource.
     */
    DRIVER_RESOURCE_VULKAN_QUEUE(3),
    /**
     * Vulkan queue family index driver resource.
     */
    DRIVER_RESOURCE_VULKAN_QUEUE_FAMILY_INDEX(4),
    /**
     * Vulkan image driver resource.
     */
    DRIVER_RESOURCE_VULKAN_IMAGE(5),
    /**
     * Vulkan image view driver resource.
     */
    DRIVER_RESOURCE_VULKAN_IMAGE_VIEW(6),
    /**
     * Vulkan image native texture format driver resource.
     */
    DRIVER_RESOURCE_VULKAN_IMAGE_NATIVE_TEXTURE_FORMAT(7),
    /**
     * Vulkan sampler driver resource.
     */
    DRIVER_RESOURCE_VULKAN_SAMPLER(8),
    /**
     * Vulkan [descriptor set](https://vkguide.dev/docs/chapter-4/descriptors/) driver resource.
     */
    DRIVER_RESOURCE_VULKAN_DESCRIPTOR_SET(9),
    /**
     * Vulkan buffer driver resource.
     */
    DRIVER_RESOURCE_VULKAN_BUFFER(10),
    /**
     * Vulkan compute pipeline driver resource.
     */
    DRIVER_RESOURCE_VULKAN_COMPUTE_PIPELINE(11),
    /**
     * Vulkan render pipeline driver resource.
     */
    DRIVER_RESOURCE_VULKAN_RENDER_PIPELINE(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DataFormat(
    id: Long,
  ) {
    /**
     * 4-bit-per-channel red/green channel data format, packed into 8 bits. Values are in the `[0.0, 1.0]` range.
     *
     * **Note:** More information on all data formats can be found on the [godot.Identification of formats](https://registry.khronos.org/vulkan/specs/1.1/html/vkspec.html#_identification_of_formats) section of the Vulkan specification, as well as the [godot.VkFormat](https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkFormat.html) enum.
     */
    DATA_FORMAT_R4G4_UNORM_PACK8(0),
    /**
     * 4-bit-per-channel red/green/blue/alpha channel data format, packed into 16 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R4G4B4A4_UNORM_PACK16(1),
    /**
     * 4-bit-per-channel blue/green/red/alpha channel data format, packed into 16 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_B4G4R4A4_UNORM_PACK16(2),
    /**
     * Red/green/blue channel data format with 5 bits of red, 6 bits of green and 5 bits of blue, packed into 16 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R5G6B5_UNORM_PACK16(3),
    /**
     * Blue/green/red channel data format with 5 bits of blue, 6 bits of green and 5 bits of red, packed into 16 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_B5G6R5_UNORM_PACK16(4),
    /**
     * Red/green/blue/alpha channel data format with 5 bits of red, 6 bits of green, 5 bits of blue and 1 bit of alpha, packed into 16 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R5G5B5A1_UNORM_PACK16(5),
    /**
     * Blue/green/red/alpha channel data format with 5 bits of blue, 6 bits of green, 5 bits of red and 1 bit of alpha, packed into 16 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_B5G5R5A1_UNORM_PACK16(6),
    /**
     * Alpha/red/green/blue channel data format with 1 bit of alpha, 5 bits of red, 6 bits of green and 5 bits of blue, packed into 16 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_A1R5G5B5_UNORM_PACK16(7),
    /**
     * 8-bit-per-channel unsigned floating-point red channel data format with normalized value. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R8_UNORM(8),
    /**
     * 8-bit-per-channel signed floating-point red channel data format with normalized value. Values are in the `[-1.0, 1.0]` range.
     */
    DATA_FORMAT_R8_SNORM(9),
    /**
     * 8-bit-per-channel unsigned floating-point red channel data format with scaled value (value is converted from integer to float). Values are in the `[0.0, 255.0]` range.
     */
    DATA_FORMAT_R8_USCALED(10),
    /**
     * 8-bit-per-channel signed floating-point red channel data format with scaled value (value is converted from integer to float). Values are in the `[-127.0, 127.0]` range.
     */
    DATA_FORMAT_R8_SSCALED(11),
    /**
     * 8-bit-per-channel unsigned integer red channel data format. Values are in the `[0, 255]` range.
     */
    DATA_FORMAT_R8_UINT(12),
    /**
     * 8-bit-per-channel signed integer red channel data format. Values are in the `[-127, 127]` range.
     */
    DATA_FORMAT_R8_SINT(13),
    /**
     * 8-bit-per-channel unsigned floating-point red channel data format with normalized value and non-linear sRGB encoding. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R8_SRGB(14),
    /**
     * 8-bit-per-channel unsigned floating-point red/green channel data format with normalized value. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R8G8_UNORM(15),
    /**
     * 8-bit-per-channel signed floating-point red/green channel data format with normalized value. Values are in the `[-1.0, 1.0]` range.
     */
    DATA_FORMAT_R8G8_SNORM(16),
    /**
     * 8-bit-per-channel unsigned floating-point red/green channel data format with scaled value (value is converted from integer to float). Values are in the `[0.0, 255.0]` range.
     */
    DATA_FORMAT_R8G8_USCALED(17),
    /**
     * 8-bit-per-channel signed floating-point red/green channel data format with scaled value (value is converted from integer to float). Values are in the `[-127.0, 127.0]` range.
     */
    DATA_FORMAT_R8G8_SSCALED(18),
    /**
     * 8-bit-per-channel unsigned integer red/green channel data format. Values are in the `[0, 255]` range.
     */
    DATA_FORMAT_R8G8_UINT(19),
    /**
     * 8-bit-per-channel signed integer red/green channel data format. Values are in the `[-127, 127]` range.
     */
    DATA_FORMAT_R8G8_SINT(20),
    /**
     * 8-bit-per-channel unsigned floating-point red/green channel data format with normalized value and non-linear sRGB encoding. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R8G8_SRGB(21),
    /**
     * 8-bit-per-channel unsigned floating-point red/green/blue channel data format with normalized value. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R8G8B8_UNORM(22),
    /**
     * 8-bit-per-channel signed floating-point red/green/blue channel data format with normalized value. Values are in the `[-1.0, 1.0]` range.
     */
    DATA_FORMAT_R8G8B8_SNORM(23),
    /**
     * 8-bit-per-channel unsigned floating-point red/green/blue channel data format with scaled value (value is converted from integer to float). Values are in the `[0.0, 255.0]` range.
     */
    DATA_FORMAT_R8G8B8_USCALED(24),
    /**
     * 8-bit-per-channel signed floating-point red/green/blue channel data format with scaled value (value is converted from integer to float). Values are in the `[-127.0, 127.0]` range.
     */
    DATA_FORMAT_R8G8B8_SSCALED(25),
    /**
     * 8-bit-per-channel unsigned integer red/green/blue channel data format. Values are in the `[0, 255]` range.
     */
    DATA_FORMAT_R8G8B8_UINT(26),
    /**
     * 8-bit-per-channel signed integer red/green/blue channel data format. Values are in the `[-127, 127]` range.
     */
    DATA_FORMAT_R8G8B8_SINT(27),
    /**
     * 8-bit-per-channel unsigned floating-point red/green/blue/blue channel data format with normalized value and non-linear sRGB encoding. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R8G8B8_SRGB(28),
    /**
     * 8-bit-per-channel unsigned floating-point blue/green/red channel data format with normalized value. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_B8G8R8_UNORM(29),
    /**
     * 8-bit-per-channel signed floating-point blue/green/red channel data format with normalized value. Values are in the `[-1.0, 1.0]` range.
     */
    DATA_FORMAT_B8G8R8_SNORM(30),
    /**
     * 8-bit-per-channel unsigned floating-point blue/green/red channel data format with scaled value (value is converted from integer to float). Values are in the `[0.0, 255.0]` range.
     */
    DATA_FORMAT_B8G8R8_USCALED(31),
    /**
     * 8-bit-per-channel signed floating-point blue/green/red channel data format with scaled value (value is converted from integer to float). Values are in the `[-127.0, 127.0]` range.
     */
    DATA_FORMAT_B8G8R8_SSCALED(32),
    /**
     * 8-bit-per-channel unsigned integer blue/green/red channel data format. Values are in the `[0, 255]` range.
     */
    DATA_FORMAT_B8G8R8_UINT(33),
    /**
     * 8-bit-per-channel signed integer blue/green/red channel data format. Values are in the `[-127, 127]` range.
     */
    DATA_FORMAT_B8G8R8_SINT(34),
    /**
     * 8-bit-per-channel unsigned floating-point blue/green/red data format with normalized value and non-linear sRGB encoding. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_B8G8R8_SRGB(35),
    /**
     * 8-bit-per-channel unsigned floating-point red/green/blue/alpha channel data format with normalized value. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R8G8B8A8_UNORM(36),
    /**
     * 8-bit-per-channel signed floating-point red/green/blue/alpha channel data format with normalized value. Values are in the `[-1.0, 1.0]` range.
     */
    DATA_FORMAT_R8G8B8A8_SNORM(37),
    /**
     * 8-bit-per-channel unsigned floating-point red/green/blue/alpha channel data format with scaled value (value is converted from integer to float). Values are in the `[0.0, 255.0]` range.
     */
    DATA_FORMAT_R8G8B8A8_USCALED(38),
    /**
     * 8-bit-per-channel signed floating-point red/green/blue/alpha channel data format with scaled value (value is converted from integer to float). Values are in the `[-127.0, 127.0]` range.
     */
    DATA_FORMAT_R8G8B8A8_SSCALED(39),
    /**
     * 8-bit-per-channel unsigned integer red/green/blue/alpha channel data format. Values are in the `[0, 255]` range.
     */
    DATA_FORMAT_R8G8B8A8_UINT(40),
    /**
     * 8-bit-per-channel signed integer red/green/blue/alpha channel data format. Values are in the `[-127, 127]` range.
     */
    DATA_FORMAT_R8G8B8A8_SINT(41),
    /**
     * 8-bit-per-channel unsigned floating-point red/green/blue/alpha channel data format with normalized value and non-linear sRGB encoding. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R8G8B8A8_SRGB(42),
    /**
     * 8-bit-per-channel unsigned floating-point blue/green/red/alpha channel data format with normalized value. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_B8G8R8A8_UNORM(43),
    /**
     * 8-bit-per-channel signed floating-point blue/green/red/alpha channel data format with normalized value. Values are in the `[-1.0, 1.0]` range.
     */
    DATA_FORMAT_B8G8R8A8_SNORM(44),
    /**
     * 8-bit-per-channel unsigned floating-point blue/green/red/alpha channel data format with scaled value (value is converted from integer to float). Values are in the `[0.0, 255.0]` range.
     */
    DATA_FORMAT_B8G8R8A8_USCALED(45),
    /**
     * 8-bit-per-channel signed floating-point blue/green/red/alpha channel data format with scaled value (value is converted from integer to float). Values are in the `[-127.0, 127.0]` range.
     */
    DATA_FORMAT_B8G8R8A8_SSCALED(46),
    /**
     * 8-bit-per-channel unsigned integer blue/green/red/alpha channel data format. Values are in the `[0, 255]` range.
     */
    DATA_FORMAT_B8G8R8A8_UINT(47),
    /**
     * 8-bit-per-channel signed integer blue/green/red/alpha channel data format. Values are in the `[-127, 127]` range.
     */
    DATA_FORMAT_B8G8R8A8_SINT(48),
    /**
     * 8-bit-per-channel unsigned floating-point blue/green/red/alpha channel data format with normalized value and non-linear sRGB encoding. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_B8G8R8A8_SRGB(49),
    /**
     * 8-bit-per-channel unsigned floating-point alpha/red/green/blue channel data format with normalized value, packed in 32 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_A8B8G8R8_UNORM_PACK32(50),
    /**
     * 8-bit-per-channel signed floating-point alpha/red/green/blue channel data format with normalized value, packed in 32 bits. Values are in the `[-1.0, 1.0]` range.
     */
    DATA_FORMAT_A8B8G8R8_SNORM_PACK32(51),
    /**
     * 8-bit-per-channel unsigned floating-point alpha/red/green/blue channel data format with scaled value (value is converted from integer to float), packed in 32 bits. Values are in the `[0.0, 255.0]` range.
     */
    DATA_FORMAT_A8B8G8R8_USCALED_PACK32(52),
    /**
     * 8-bit-per-channel signed floating-point alpha/red/green/blue channel data format with scaled value (value is converted from integer to float), packed in 32 bits. Values are in the `[-127.0, 127.0]` range.
     */
    DATA_FORMAT_A8B8G8R8_SSCALED_PACK32(53),
    /**
     * 8-bit-per-channel unsigned integer alpha/red/green/blue channel data format, packed in 32 bits. Values are in the `[0, 255]` range.
     */
    DATA_FORMAT_A8B8G8R8_UINT_PACK32(54),
    /**
     * 8-bit-per-channel signed integer alpha/red/green/blue channel data format, packed in 32 bits. Values are in the `[-127, 127]` range.
     */
    DATA_FORMAT_A8B8G8R8_SINT_PACK32(55),
    /**
     * 8-bit-per-channel unsigned floating-point alpha/red/green/blue channel data format with normalized value and non-linear sRGB encoding, packed in 32 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_A8B8G8R8_SRGB_PACK32(56),
    /**
     * Unsigned floating-point alpha/red/green/blue channel data format with normalized value, packed in 32 bits. Format contains 2 bits of alpha, 10 bits of red, 10 bits of green and 10 bits of blue. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_A2R10G10B10_UNORM_PACK32(57),
    /**
     * Signed floating-point alpha/red/green/blue channel data format with normalized value, packed in 32 bits. Format contains 2 bits of alpha, 10 bits of red, 10 bits of green and 10 bits of blue. Values are in the `[-1.0, 1.0]` range.
     */
    DATA_FORMAT_A2R10G10B10_SNORM_PACK32(58),
    /**
     * Unsigned floating-point alpha/red/green/blue channel data format with normalized value, packed in 32 bits. Format contains 2 bits of alpha, 10 bits of red, 10 bits of green and 10 bits of blue. Values are in the `[0.0, 1023.0]` range for red/green/blue and `[0.0, 3.0]` for alpha.
     */
    DATA_FORMAT_A2R10G10B10_USCALED_PACK32(59),
    /**
     * Signed floating-point alpha/red/green/blue channel data format with normalized value, packed in 32 bits. Format contains 2 bits of alpha, 10 bits of red, 10 bits of green and 10 bits of blue. Values are in the `[-511.0, 511.0]` range for red/green/blue and `[-1.0, 1.0]` for alpha.
     */
    DATA_FORMAT_A2R10G10B10_SSCALED_PACK32(60),
    /**
     * Unsigned integer alpha/red/green/blue channel data format with normalized value, packed in 32 bits. Format contains 2 bits of alpha, 10 bits of red, 10 bits of green and 10 bits of blue. Values are in the `[0, 1023]` range for red/green/blue and `[0, 3]` for alpha.
     */
    DATA_FORMAT_A2R10G10B10_UINT_PACK32(61),
    /**
     * Signed integer alpha/red/green/blue channel data format with normalized value, packed in 32 bits. Format contains 2 bits of alpha, 10 bits of red, 10 bits of green and 10 bits of blue. Values are in the `[-511, 511]` range for red/green/blue and `[-1, 1]` for alpha.
     */
    DATA_FORMAT_A2R10G10B10_SINT_PACK32(62),
    /**
     * Unsigned floating-point alpha/blue/green/red channel data format with normalized value, packed in 32 bits. Format contains 2 bits of alpha, 10 bits of blue, 10 bits of green and 10 bits of red. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_A2B10G10R10_UNORM_PACK32(63),
    /**
     * Signed floating-point alpha/blue/green/red channel data format with normalized value, packed in 32 bits. Format contains 2 bits of alpha, 10 bits of blue, 10 bits of green and 10 bits of red. Values are in the `[-1.0, 1.0]` range.
     */
    DATA_FORMAT_A2B10G10R10_SNORM_PACK32(64),
    /**
     * Unsigned floating-point alpha/blue/green/red channel data format with normalized value, packed in 32 bits. Format contains 2 bits of alpha, 10 bits of blue, 10 bits of green and 10 bits of red. Values are in the `[0.0, 1023.0]` range for blue/green/red and `[0.0, 3.0]` for alpha.
     */
    DATA_FORMAT_A2B10G10R10_USCALED_PACK32(65),
    /**
     * Signed floating-point alpha/blue/green/red channel data format with normalized value, packed in 32 bits. Format contains 2 bits of alpha, 10 bits of blue, 10 bits of green and 10 bits of red. Values are in the `[-511.0, 511.0]` range for blue/green/red and `[-1.0, 1.0]` for alpha.
     */
    DATA_FORMAT_A2B10G10R10_SSCALED_PACK32(66),
    /**
     * Unsigned integer alpha/blue/green/red channel data format with normalized value, packed in 32 bits. Format contains 2 bits of alpha, 10 bits of blue, 10 bits of green and 10 bits of red. Values are in the `[0, 1023]` range for blue/green/red and `[0, 3]` for alpha.
     */
    DATA_FORMAT_A2B10G10R10_UINT_PACK32(67),
    /**
     * Signed integer alpha/blue/green/red channel data format with normalized value, packed in 32 bits. Format contains 2 bits of alpha, 10 bits of blue, 10 bits of green and 10 bits of red. Values are in the `[-511, 511]` range for blue/green/red and `[-1, 1]` for alpha.
     */
    DATA_FORMAT_A2B10G10R10_SINT_PACK32(68),
    /**
     * 16-bit-per-channel unsigned floating-point red channel data format with normalized value. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R16_UNORM(69),
    /**
     * 16-bit-per-channel signed floating-point red channel data format with normalized value. Values are in the `[-1.0, 1.0]` range.
     */
    DATA_FORMAT_R16_SNORM(70),
    /**
     * 16-bit-per-channel unsigned floating-point red channel data format with scaled value (value is converted from integer to float). Values are in the `[0.0, 65535.0]` range.
     */
    DATA_FORMAT_R16_USCALED(71),
    /**
     * 16-bit-per-channel signed floating-point red channel data format with scaled value (value is converted from integer to float). Values are in the `[-32767.0, 32767.0]` range.
     */
    DATA_FORMAT_R16_SSCALED(72),
    /**
     * 16-bit-per-channel unsigned integer red channel data format. Values are in the `[0.0, 65535]` range.
     */
    DATA_FORMAT_R16_UINT(73),
    /**
     * 16-bit-per-channel signed integer red channel data format. Values are in the `[-32767, 32767]` range.
     */
    DATA_FORMAT_R16_SINT(74),
    /**
     * 16-bit-per-channel signed floating-point red channel data format with the value stored as-is.
     */
    DATA_FORMAT_R16_SFLOAT(75),
    /**
     * 16-bit-per-channel unsigned floating-point red/green channel data format with normalized value. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R16G16_UNORM(76),
    /**
     * 16-bit-per-channel signed floating-point red/green channel data format with normalized value. Values are in the `[-1.0, 1.0]` range.
     */
    DATA_FORMAT_R16G16_SNORM(77),
    /**
     * 16-bit-per-channel unsigned floating-point red/green channel data format with scaled value (value is converted from integer to float). Values are in the `[0.0, 65535.0]` range.
     */
    DATA_FORMAT_R16G16_USCALED(78),
    /**
     * 16-bit-per-channel signed floating-point red/green channel data format with scaled value (value is converted from integer to float). Values are in the `[-32767.0, 32767.0]` range.
     */
    DATA_FORMAT_R16G16_SSCALED(79),
    /**
     * 16-bit-per-channel unsigned integer red/green channel data format. Values are in the `[0.0, 65535]` range.
     */
    DATA_FORMAT_R16G16_UINT(80),
    /**
     * 16-bit-per-channel signed integer red/green channel data format. Values are in the `[-32767, 32767]` range.
     */
    DATA_FORMAT_R16G16_SINT(81),
    /**
     * 16-bit-per-channel signed floating-point red/green channel data format with the value stored as-is.
     */
    DATA_FORMAT_R16G16_SFLOAT(82),
    /**
     * 16-bit-per-channel unsigned floating-point red/green/blue channel data format with normalized value. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R16G16B16_UNORM(83),
    /**
     * 16-bit-per-channel signed floating-point red/green/blue channel data format with normalized value. Values are in the `[-1.0, 1.0]` range.
     */
    DATA_FORMAT_R16G16B16_SNORM(84),
    /**
     * 16-bit-per-channel unsigned floating-point red/green/blue channel data format with scaled value (value is converted from integer to float). Values are in the `[0.0, 65535.0]` range.
     */
    DATA_FORMAT_R16G16B16_USCALED(85),
    /**
     * 16-bit-per-channel signed floating-point red/green/blue channel data format with scaled value (value is converted from integer to float). Values are in the `[-32767.0, 32767.0]` range.
     */
    DATA_FORMAT_R16G16B16_SSCALED(86),
    /**
     * 16-bit-per-channel unsigned integer red/green/blue channel data format. Values are in the `[0.0, 65535]` range.
     */
    DATA_FORMAT_R16G16B16_UINT(87),
    /**
     * 16-bit-per-channel signed integer red/green/blue channel data format. Values are in the `[-32767, 32767]` range.
     */
    DATA_FORMAT_R16G16B16_SINT(88),
    /**
     * 16-bit-per-channel signed floating-point red/green/blue channel data format with the value stored as-is.
     */
    DATA_FORMAT_R16G16B16_SFLOAT(89),
    /**
     * 16-bit-per-channel unsigned floating-point red/green/blue/alpha channel data format with normalized value. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R16G16B16A16_UNORM(90),
    /**
     * 16-bit-per-channel signed floating-point red/green/blue/alpha channel data format with normalized value. Values are in the `[-1.0, 1.0]` range.
     */
    DATA_FORMAT_R16G16B16A16_SNORM(91),
    /**
     * 16-bit-per-channel unsigned floating-point red/green/blue/alpha channel data format with scaled value (value is converted from integer to float). Values are in the `[0.0, 65535.0]` range.
     */
    DATA_FORMAT_R16G16B16A16_USCALED(92),
    /**
     * 16-bit-per-channel signed floating-point red/green/blue/alpha channel data format with scaled value (value is converted from integer to float). Values are in the `[-32767.0, 32767.0]` range.
     */
    DATA_FORMAT_R16G16B16A16_SSCALED(93),
    /**
     * 16-bit-per-channel unsigned integer red/green/blue/alpha channel data format. Values are in the `[0.0, 65535]` range.
     */
    DATA_FORMAT_R16G16B16A16_UINT(94),
    /**
     * 16-bit-per-channel signed integer red/green/blue/alpha channel data format. Values are in the `[-32767, 32767]` range.
     */
    DATA_FORMAT_R16G16B16A16_SINT(95),
    /**
     * 16-bit-per-channel signed floating-point red/green/blue/alpha channel data format with the value stored as-is.
     */
    DATA_FORMAT_R16G16B16A16_SFLOAT(96),
    /**
     * 32-bit-per-channel unsigned integer red channel data format. Values are in the `[0, 2^32 - 1]` range.
     */
    DATA_FORMAT_R32_UINT(97),
    /**
     * 32-bit-per-channel signed integer red channel data format. Values are in the `[2^31 + 1, 2^31 - 1]` range.
     */
    DATA_FORMAT_R32_SINT(98),
    /**
     * 32-bit-per-channel signed floating-point red channel data format with the value stored as-is.
     */
    DATA_FORMAT_R32_SFLOAT(99),
    /**
     * 32-bit-per-channel unsigned integer red/green channel data format. Values are in the `[0, 2^32 - 1]` range.
     */
    DATA_FORMAT_R32G32_UINT(100),
    /**
     * 32-bit-per-channel signed integer red/green channel data format. Values are in the `[2^31 + 1, 2^31 - 1]` range.
     */
    DATA_FORMAT_R32G32_SINT(101),
    /**
     * 32-bit-per-channel signed floating-point red/green channel data format with the value stored as-is.
     */
    DATA_FORMAT_R32G32_SFLOAT(102),
    /**
     * 32-bit-per-channel unsigned integer red/green/blue channel data format. Values are in the `[0, 2^32 - 1]` range.
     */
    DATA_FORMAT_R32G32B32_UINT(103),
    /**
     * 32-bit-per-channel signed integer red/green/blue channel data format. Values are in the `[2^31 + 1, 2^31 - 1]` range.
     */
    DATA_FORMAT_R32G32B32_SINT(104),
    /**
     * 32-bit-per-channel signed floating-point red/green/blue channel data format with the value stored as-is.
     */
    DATA_FORMAT_R32G32B32_SFLOAT(105),
    /**
     * 32-bit-per-channel unsigned integer red/green/blue/alpha channel data format. Values are in the `[0, 2^32 - 1]` range.
     */
    DATA_FORMAT_R32G32B32A32_UINT(106),
    /**
     * 32-bit-per-channel signed integer red/green/blue/alpha channel data format. Values are in the `[2^31 + 1, 2^31 - 1]` range.
     */
    DATA_FORMAT_R32G32B32A32_SINT(107),
    /**
     * 32-bit-per-channel signed floating-point red/green/blue/alpha channel data format with the value stored as-is.
     */
    DATA_FORMAT_R32G32B32A32_SFLOAT(108),
    /**
     * 64-bit-per-channel unsigned integer red channel data format. Values are in the `[0, 2^64 - 1]` range.
     */
    DATA_FORMAT_R64_UINT(109),
    /**
     * 64-bit-per-channel signed integer red channel data format. Values are in the `[2^63 + 1, 2^63 - 1]` range.
     */
    DATA_FORMAT_R64_SINT(110),
    /**
     * 64-bit-per-channel signed floating-point red channel data format with the value stored as-is.
     */
    DATA_FORMAT_R64_SFLOAT(111),
    /**
     * 64-bit-per-channel unsigned integer red/green channel data format. Values are in the `[0, 2^64 - 1]` range.
     */
    DATA_FORMAT_R64G64_UINT(112),
    /**
     * 64-bit-per-channel signed integer red/green channel data format. Values are in the `[2^63 + 1, 2^63 - 1]` range.
     */
    DATA_FORMAT_R64G64_SINT(113),
    /**
     * 64-bit-per-channel signed floating-point red/green channel data format with the value stored as-is.
     */
    DATA_FORMAT_R64G64_SFLOAT(114),
    /**
     * 64-bit-per-channel unsigned integer red/green/blue channel data format. Values are in the `[0, 2^64 - 1]` range.
     */
    DATA_FORMAT_R64G64B64_UINT(115),
    /**
     * 64-bit-per-channel signed integer red/green/blue channel data format. Values are in the `[2^63 + 1, 2^63 - 1]` range.
     */
    DATA_FORMAT_R64G64B64_SINT(116),
    /**
     * 64-bit-per-channel signed floating-point red/green/blue channel data format with the value stored as-is.
     */
    DATA_FORMAT_R64G64B64_SFLOAT(117),
    /**
     * 64-bit-per-channel unsigned integer red/green/blue/alpha channel data format. Values are in the `[0, 2^64 - 1]` range.
     */
    DATA_FORMAT_R64G64B64A64_UINT(118),
    /**
     * 64-bit-per-channel signed integer red/green/blue/alpha channel data format. Values are in the `[2^63 + 1, 2^63 - 1]` range.
     */
    DATA_FORMAT_R64G64B64A64_SINT(119),
    /**
     * 64-bit-per-channel signed floating-point red/green/blue/alpha channel data format with the value stored as-is.
     */
    DATA_FORMAT_R64G64B64A64_SFLOAT(120),
    /**
     * Unsigned floating-point blue/green/red data format with the value stored as-is, packed in 32 bits. The format's precision is 10 bits of blue channel, 11 bits of green channel and 11 bits of red channel.
     */
    DATA_FORMAT_B10G11R11_UFLOAT_PACK32(121),
    /**
     * Unsigned floating-point exposure/blue/green/red data format with the value stored as-is, packed in 32 bits. The format's precision is 5 bits of exposure, 9 bits of blue channel, 9 bits of green channel and 9 bits of red channel.
     */
    DATA_FORMAT_E5B9G9R9_UFLOAT_PACK32(122),
    /**
     * 16-bit unsigned floating-point depth data format with normalized value. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_D16_UNORM(123),
    /**
     * 24-bit unsigned floating-point depth data format with normalized value, plus 8 unused bits, packed in 32 bits. Values for depth are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_X8_D24_UNORM_PACK32(124),
    /**
     * 32-bit signed floating-point depth data format with the value stored as-is.
     */
    DATA_FORMAT_D32_SFLOAT(125),
    /**
     * 8-bit unsigned integer stencil data format.
     */
    DATA_FORMAT_S8_UINT(126),
    /**
     * 16-bit unsigned floating-point depth data format with normalized value, plus 8 bits of stencil in unsigned integer format. Values for depth are in the `[0.0, 1.0]` range. Values for stencil are in the `[0, 255]` range.
     */
    DATA_FORMAT_D16_UNORM_S8_UINT(127),
    /**
     * 24-bit unsigned floating-point depth data format with normalized value, plus 8 bits of stencil in unsigned integer format. Values for depth are in the `[0.0, 1.0]` range. Values for stencil are in the `[0, 255]` range.
     */
    DATA_FORMAT_D24_UNORM_S8_UINT(128),
    /**
     * 32-bit signed floating-point depth data format with the value stored as-is, plus 8 bits of stencil in unsigned integer format. Values for stencil are in the `[0, 255]` range.
     */
    DATA_FORMAT_D32_SFLOAT_S8_UINT(129),
    /**
     * VRAM-compressed unsigned red/green/blue channel data format with normalized value. Values are in the `[0.0, 1.0]` range. The format's precision is 5 bits of red channel, 6 bits of green channel and 5 bits of blue channel. Using BC1 texture compression (also known as S3TC DXT1).
     */
    DATA_FORMAT_BC1_RGB_UNORM_BLOCK(130),
    /**
     * VRAM-compressed unsigned red/green/blue channel data format with normalized value and non-linear sRGB encoding. Values are in the `[0.0, 1.0]` range. The format's precision is 5 bits of red channel, 6 bits of green channel and 5 bits of blue channel. Using BC1 texture compression (also known as S3TC DXT1).
     */
    DATA_FORMAT_BC1_RGB_SRGB_BLOCK(131),
    /**
     * VRAM-compressed unsigned red/green/blue/alpha channel data format with normalized value. Values are in the `[0.0, 1.0]` range. The format's precision is 5 bits of red channel, 6 bits of green channel, 5 bits of blue channel and 1 bit of alpha channel. Using BC1 texture compression (also known as S3TC DXT1).
     */
    DATA_FORMAT_BC1_RGBA_UNORM_BLOCK(132),
    /**
     * VRAM-compressed unsigned red/green/blue/alpha channel data format with normalized value and non-linear sRGB encoding. Values are in the `[0.0, 1.0]` range. The format's precision is 5 bits of red channel, 6 bits of green channel, 5 bits of blue channel and 1 bit of alpha channel. Using BC1 texture compression (also known as S3TC DXT1).
     */
    DATA_FORMAT_BC1_RGBA_SRGB_BLOCK(133),
    /**
     * VRAM-compressed unsigned red/green/blue/alpha channel data format with normalized value. Values are in the `[0.0, 1.0]` range. The format's precision is 5 bits of red channel, 6 bits of green channel, 5 bits of blue channel and 4 bits of alpha channel. Using BC2 texture compression (also known as S3TC DXT3).
     */
    DATA_FORMAT_BC2_UNORM_BLOCK(134),
    /**
     * VRAM-compressed unsigned red/green/blue/alpha channel data format with normalized value and non-linear sRGB encoding. Values are in the `[0.0, 1.0]` range. The format's precision is 5 bits of red channel, 6 bits of green channel, 5 bits of blue channel and 4 bits of alpha channel. Using BC2 texture compression (also known as S3TC DXT3).
     */
    DATA_FORMAT_BC2_SRGB_BLOCK(135),
    /**
     * VRAM-compressed unsigned red/green/blue/alpha channel data format with normalized value. Values are in the `[0.0, 1.0]` range. The format's precision is 5 bits of red channel, 6 bits of green channel, 5 bits of blue channel and 8 bits of alpha channel. Using BC3 texture compression (also known as S3TC DXT5).
     */
    DATA_FORMAT_BC3_UNORM_BLOCK(136),
    /**
     * VRAM-compressed unsigned red/green/blue/alpha channel data format with normalized value and non-linear sRGB encoding. Values are in the `[0.0, 1.0]` range. The format's precision is 5 bits of red channel, 6 bits of green channel, 5 bits of blue channel and 8 bits of alpha channel. Using BC3 texture compression (also known as S3TC DXT5).
     */
    DATA_FORMAT_BC3_SRGB_BLOCK(137),
    /**
     * VRAM-compressed unsigned red channel data format with normalized value. Values are in the `[0.0, 1.0]` range. The format's precision is 8 bits of red channel. Using BC4 texture compression.
     */
    DATA_FORMAT_BC4_UNORM_BLOCK(138),
    /**
     * VRAM-compressed signed red channel data format with normalized value. Values are in the `[-1.0, 1.0]` range. The format's precision is 8 bits of red channel. Using BC4 texture compression.
     */
    DATA_FORMAT_BC4_SNORM_BLOCK(139),
    /**
     * VRAM-compressed unsigned red/green channel data format with normalized value. Values are in the `[0.0, 1.0]` range. The format's precision is 8 bits of red channel and 8 bits of green channel. Using BC5 texture compression (also known as S3TC RGTC).
     */
    DATA_FORMAT_BC5_UNORM_BLOCK(140),
    /**
     * VRAM-compressed signed red/green channel data format with normalized value. Values are in the `[-1.0, 1.0]` range. The format's precision is 8 bits of red channel and 8 bits of green channel. Using BC5 texture compression (also known as S3TC RGTC).
     */
    DATA_FORMAT_BC5_SNORM_BLOCK(141),
    /**
     * VRAM-compressed unsigned red/green/blue channel data format with the floating-point value stored as-is. The format's precision is 8 bits of red channel and 8 bits of green channel. Using BC6H texture compression (also known as BPTC HDR).
     */
    DATA_FORMAT_BC6H_UFLOAT_BLOCK(142),
    /**
     * VRAM-compressed signed red/green/blue channel data format with the floating-point value stored as-is. The format's precision is between 4 and 7 bits for the red/green/blue channels and between 0 and 8 bits for the alpha channel. Using BC7 texture compression (also known as BPTC HDR).
     */
    DATA_FORMAT_BC6H_SFLOAT_BLOCK(143),
    /**
     * VRAM-compressed unsigned red/green/blue/alpha channel data format with normalized value. Values are in the `[0.0, 1.0]` range. The format's precision is between 4 and 7 bits for the red/green/blue channels and between 0 and 8 bits for the alpha channel. Also known as BPTC LDR.
     */
    DATA_FORMAT_BC7_UNORM_BLOCK(144),
    /**
     * VRAM-compressed unsigned red/green/blue/alpha channel data format with normalized value and non-linear sRGB encoding. Values are in the `[0.0, 1.0]` range. The format's precision is between 4 and 7 bits for the red/green/blue channels and between 0 and 8 bits for the alpha channel. Also known as BPTC LDR.
     */
    DATA_FORMAT_BC7_SRGB_BLOCK(145),
    /**
     * VRAM-compressed unsigned red/green/blue channel data format with normalized value. Values are in the `[0.0, 1.0]` range. Using ETC2 texture compression.
     */
    DATA_FORMAT_ETC2_R8G8B8_UNORM_BLOCK(146),
    /**
     * VRAM-compressed unsigned red/green/blue channel data format with normalized value and non-linear sRGB encoding. Values are in the `[0.0, 1.0]` range. Using ETC2 texture compression.
     */
    DATA_FORMAT_ETC2_R8G8B8_SRGB_BLOCK(147),
    /**
     * VRAM-compressed unsigned red/green/blue/alpha channel data format with normalized value. Values are in the `[0.0, 1.0]` range. Red/green/blue use 8 bit of precision each, with alpha using 1 bit of precision. Using ETC2 texture compression.
     */
    DATA_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK(148),
    /**
     * VRAM-compressed unsigned red/green/blue/alpha channel data format with normalized value and non-linear sRGB encoding. Values are in the `[0.0, 1.0]` range. Red/green/blue use 8 bit of precision each, with alpha using 1 bit of precision. Using ETC2 texture compression.
     */
    DATA_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK(149),
    /**
     * VRAM-compressed unsigned red/green/blue/alpha channel data format with normalized value. Values are in the `[0.0, 1.0]` range. Red/green/blue use 8 bits of precision each, with alpha using 8 bits of precision. Using ETC2 texture compression.
     */
    DATA_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK(150),
    /**
     * VRAM-compressed unsigned red/green/blue/alpha channel data format with normalized value and non-linear sRGB encoding. Values are in the `[0.0, 1.0]` range. Red/green/blue use 8 bits of precision each, with alpha using 8 bits of precision. Using ETC2 texture compression.
     */
    DATA_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK(151),
    /**
     * 11-bit VRAM-compressed unsigned red channel data format with normalized value. Values are in the `[0.0, 1.0]` range. Using ETC2 texture compression.
     */
    DATA_FORMAT_EAC_R11_UNORM_BLOCK(152),
    /**
     * 11-bit VRAM-compressed signed red channel data format with normalized value. Values are in the `[0.0, 1.0]` range. Using ETC2 texture compression.
     */
    DATA_FORMAT_EAC_R11_SNORM_BLOCK(153),
    /**
     * 11-bit VRAM-compressed unsigned red/green channel data format with normalized value. Values are in the `[0.0, 1.0]` range. Using ETC2 texture compression.
     */
    DATA_FORMAT_EAC_R11G11_UNORM_BLOCK(154),
    /**
     * 11-bit VRAM-compressed signed red/green channel data format with normalized value. Values are in the `[0.0, 1.0]` range. Using ETC2 texture compression.
     */
    DATA_FORMAT_EAC_R11G11_SNORM_BLOCK(155),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value, packed in 4×4 blocks (highest quality). Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_4x4_UNORM_BLOCK(156),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value and non-linear sRGB encoding, packed in 4×4 blocks (highest quality). Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_4x4_SRGB_BLOCK(157),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value, packed in 5×4 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_5x4_UNORM_BLOCK(158),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value and non-linear sRGB encoding, packed in 5×4 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_5x4_SRGB_BLOCK(159),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value, packed in 5×5 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_5x5_UNORM_BLOCK(160),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value and non-linear sRGB encoding, packed in 5×5 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_5x5_SRGB_BLOCK(161),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value, packed in 6×5 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_6x5_UNORM_BLOCK(162),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value and non-linear sRGB encoding, packed in 6×5 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_6x5_SRGB_BLOCK(163),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value, packed in 6×6 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_6x6_UNORM_BLOCK(164),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value and non-linear sRGB encoding, packed in 6×6 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_6x6_SRGB_BLOCK(165),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value, packed in 8×5 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_8x5_UNORM_BLOCK(166),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value and non-linear sRGB encoding, packed in 8×5 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_8x5_SRGB_BLOCK(167),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value, packed in 8×6 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_8x6_UNORM_BLOCK(168),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value and non-linear sRGB encoding, packed in 8×6 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_8x6_SRGB_BLOCK(169),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value, packed in 8×8 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_8x8_UNORM_BLOCK(170),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value and non-linear sRGB encoding, packed in 8×8 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_8x8_SRGB_BLOCK(171),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value, packed in 10×5 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_10x5_UNORM_BLOCK(172),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value and non-linear sRGB encoding, packed in 10×5 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_10x5_SRGB_BLOCK(173),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value, packed in 10×6 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_10x6_UNORM_BLOCK(174),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value and non-linear sRGB encoding, packed in 10×6 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_10x6_SRGB_BLOCK(175),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value, packed in 10×8 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_10x8_UNORM_BLOCK(176),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value and non-linear sRGB encoding, packed in 10×8 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_10x8_SRGB_BLOCK(177),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value, packed in 10×10 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_10x10_UNORM_BLOCK(178),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value and non-linear sRGB encoding, packed in 10×10 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_10x10_SRGB_BLOCK(179),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value, packed in 12×10 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_12x10_UNORM_BLOCK(180),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value and non-linear sRGB encoding, packed in 12×10 blocks. Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_12x10_SRGB_BLOCK(181),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value, packed in 12 blocks (lowest quality). Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_12x12_UNORM_BLOCK(182),
    /**
     * VRAM-compressed unsigned floating-point data format with normalized value and non-linear sRGB encoding, packed in 12 blocks (lowest quality). Values are in the `[0.0, 1.0]` range. Using ASTC compression.
     */
    DATA_FORMAT_ASTC_12x12_SRGB_BLOCK(183),
    /**
     * 8-bit-per-channel unsigned floating-point green/blue/red channel data format with normalized value. Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G8B8G8R8_422_UNORM(184),
    /**
     * 8-bit-per-channel unsigned floating-point blue/green/red channel data format with normalized value. Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_B8G8R8G8_422_UNORM(185),
    /**
     * 8-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, stored across 3 separate planes (green + blue + red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal and vertical resolution (i.e. 2×2 adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G8_B8_R8_3PLANE_420_UNORM(186),
    /**
     * 8-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, stored across 2 separate planes (green + blue/red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal and vertical resolution (i.e. 2×2 adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G8_B8R8_2PLANE_420_UNORM(187),
    /**
     * 8-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, stored across 2 separate planes (green + blue + red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G8_B8_R8_3PLANE_422_UNORM(188),
    /**
     * 8-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, stored across 2 separate planes (green + blue/red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G8_B8R8_2PLANE_422_UNORM(189),
    /**
     * 8-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, stored across 3 separate planes. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_G8_B8_R8_3PLANE_444_UNORM(190),
    /**
     * 10-bit-per-channel unsigned floating-point red channel data with normalized value, plus 6 unused bits, packed in 16 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R10X6_UNORM_PACK16(191),
    /**
     * 10-bit-per-channel unsigned floating-point red/green channel data with normalized value, plus 6 unused bits after each channel, packed in 2×16 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R10X6G10X6_UNORM_2PACK16(192),
    /**
     * 10-bit-per-channel unsigned floating-point red/green/blue/alpha channel data with normalized value, plus 6 unused bits after each channel, packed in 4×16 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16(193),
    /**
     * 10-bit-per-channel unsigned floating-point green/blue/green/red channel data with normalized value, plus 6 unused bits after each channel, packed in 4×16 bits. Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel). The green channel is listed twice, but contains different values to allow it to be represented at full resolution.
     */
    DATA_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16(194),
    /**
     * 10-bit-per-channel unsigned floating-point blue/green/red/green channel data with normalized value, plus 6 unused bits after each channel, packed in 4×16 bits. Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel). The green channel is listed twice, but contains different values to allow it to be represented at full resolution.
     */
    DATA_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16(195),
    /**
     * 10-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Packed in 3×16 bits and stored across 2 separate planes (green + blue + red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal and vertical resolution (i.e. 2×2 adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16(196),
    /**
     * 10-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Packed in 3×16 bits and stored across 2 separate planes (green + blue/red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal and vertical resolution (i.e. 2×2 adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16(197),
    /**
     * 10-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Packed in 3×16 bits and stored across 3 separate planes (green + blue + red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16(198),
    /**
     * 10-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Packed in 3×16 bits and stored across 3 separate planes (green + blue/red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16(199),
    /**
     * 10-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Packed in 3×16 bits and stored across 3 separate planes (green + blue + red). Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16(200),
    /**
     * 12-bit-per-channel unsigned floating-point red channel data with normalized value, plus 6 unused bits, packed in 16 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R12X4_UNORM_PACK16(201),
    /**
     * 12-bit-per-channel unsigned floating-point red/green channel data with normalized value, plus 6 unused bits after each channel, packed in 2×16 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R12X4G12X4_UNORM_2PACK16(202),
    /**
     * 12-bit-per-channel unsigned floating-point red/green/blue/alpha channel data with normalized value, plus 6 unused bits after each channel, packed in 4×16 bits. Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16(203),
    /**
     * 12-bit-per-channel unsigned floating-point green/blue/green/red channel data with normalized value, plus 6 unused bits after each channel, packed in 4×16 bits. Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel). The green channel is listed twice, but contains different values to allow it to be represented at full resolution.
     */
    DATA_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16(204),
    /**
     * 12-bit-per-channel unsigned floating-point blue/green/red/green channel data with normalized value, plus 6 unused bits after each channel, packed in 4×16 bits. Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel). The green channel is listed twice, but contains different values to allow it to be represented at full resolution.
     */
    DATA_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16(205),
    /**
     * 12-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Packed in 3×16 bits and stored across 2 separate planes (green + blue + red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal and vertical resolution (i.e. 2×2 adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16(206),
    /**
     * 12-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Packed in 3×16 bits and stored across 2 separate planes (green + blue/red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal and vertical resolution (i.e. 2×2 adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16(207),
    /**
     * 12-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Packed in 3×16 bits and stored across 3 separate planes (green + blue + red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16(208),
    /**
     * 12-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Packed in 3×16 bits and stored across 3 separate planes (green + blue/red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16(209),
    /**
     * 12-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Packed in 3×16 bits and stored across 3 separate planes (green + blue + red). Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16(210),
    /**
     * 16-bit-per-channel unsigned floating-point green/blue/red channel data format with normalized value. Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G16B16G16R16_422_UNORM(211),
    /**
     * 16-bit-per-channel unsigned floating-point blue/green/red channel data format with normalized value. Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_B16G16R16G16_422_UNORM(212),
    /**
     * 16-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Stored across 2 separate planes (green + blue + red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal and vertical resolution (i.e. 2×2 adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G16_B16_R16_3PLANE_420_UNORM(213),
    /**
     * 16-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Stored across 2 separate planes (green + blue/red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal and vertical resolution (i.e. 2×2 adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G16_B16R16_2PLANE_420_UNORM(214),
    /**
     * 16-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Stored across 3 separate planes (green + blue + red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G16_B16_R16_3PLANE_422_UNORM(215),
    /**
     * 16-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Stored across 3 separate planes (green + blue/red). Values are in the `[0.0, 1.0]` range. Blue and red channel data is stored at halved horizontal resolution (i.e. 2 horizontally adjacent pixels will share the same value for the blue/red channel).
     */
    DATA_FORMAT_G16_B16R16_2PLANE_422_UNORM(216),
    /**
     * 16-bit-per-channel unsigned floating-point green/blue/red channel data with normalized value, plus 6 unused bits after each channel. Stored across 3 separate planes (green + blue + red). Values are in the `[0.0, 1.0]` range.
     */
    DATA_FORMAT_G16_B16_R16_3PLANE_444_UNORM(217),
    /**
     * Represents the size of the [enum DataFormat] enum.
     */
    DATA_FORMAT_MAX(218),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public sealed interface BarrierMask {
    public val flag: Long

    public infix fun or(other: BarrierMask): BarrierMask = BarrierMaskValue(flag.or(other.flag))

    public infix fun or(other: Long): BarrierMask = BarrierMaskValue(flag.or(other))

    public infix fun xor(other: BarrierMask): BarrierMask = BarrierMaskValue(flag.xor(other.flag))

    public infix fun xor(other: Long): BarrierMask = BarrierMaskValue(flag.xor(other))

    public infix fun and(other: BarrierMask): BarrierMask = BarrierMaskValue(flag.and(other.flag))

    public infix fun and(other: Long): BarrierMask = BarrierMaskValue(flag.and(other))

    public operator fun plus(other: BarrierMask): BarrierMask =
        BarrierMaskValue(flag.plus(other.flag))

    public operator fun plus(other: Long): BarrierMask = BarrierMaskValue(flag.plus(other))

    public operator fun minus(other: BarrierMask): BarrierMask =
        BarrierMaskValue(flag.minus(other.flag))

    public operator fun minus(other: Long): BarrierMask = BarrierMaskValue(flag.minus(other))

    public operator fun times(other: BarrierMask): BarrierMask =
        BarrierMaskValue(flag.times(other.flag))

    public operator fun times(other: Long): BarrierMask = BarrierMaskValue(flag.times(other))

    public operator fun div(other: BarrierMask): BarrierMask =
        BarrierMaskValue(flag.div(other.flag))

    public operator fun div(other: Long): BarrierMask = BarrierMaskValue(flag.div(other))

    public operator fun rem(other: BarrierMask): BarrierMask =
        BarrierMaskValue(flag.rem(other.flag))

    public operator fun rem(other: Long): BarrierMask = BarrierMaskValue(flag.rem(other))

    public fun unaryPlus(): BarrierMask = BarrierMaskValue(flag.unaryPlus())

    public fun unaryMinus(): BarrierMask = BarrierMaskValue(flag.unaryMinus())

    public fun inv(): BarrierMask = BarrierMaskValue(flag.inv())

    public infix fun shl(bits: Int): BarrierMask = BarrierMaskValue(flag shl bits)

    public infix fun shr(bits: Int): BarrierMask = BarrierMaskValue(flag shr bits)

    public infix fun ushr(bits: Int): BarrierMask = BarrierMaskValue(flag ushr bits)

    public companion object {
      public val BARRIER_MASK_VERTEX: BarrierMask = BarrierMaskValue(1)

      public val BARRIER_MASK_FRAGMENT: BarrierMask = BarrierMaskValue(8)

      public val BARRIER_MASK_COMPUTE: BarrierMask = BarrierMaskValue(2)

      public val BARRIER_MASK_TRANSFER: BarrierMask = BarrierMaskValue(4)

      public val BARRIER_MASK_RASTER: BarrierMask = BarrierMaskValue(9)

      public val BARRIER_MASK_ALL_BARRIERS: BarrierMask = BarrierMaskValue(32767)

      public val BARRIER_MASK_NO_BARRIER: BarrierMask = BarrierMaskValue(32768)
    }
  }

  @JvmInline
  internal value class BarrierMaskValue internal constructor(
    public override val flag: Long,
  ) : BarrierMask

  public enum class TextureType(
    id: Long,
  ) {
    /**
     * 1-dimensional texture.
     */
    TEXTURE_TYPE_1D(0),
    /**
     * 2-dimensional texture.
     */
    TEXTURE_TYPE_2D(1),
    /**
     * 3-dimensional texture.
     */
    TEXTURE_TYPE_3D(2),
    /**
     * [godot.Cubemap] texture.
     */
    TEXTURE_TYPE_CUBE(3),
    /**
     * Array of 1-dimensional textures.
     */
    TEXTURE_TYPE_1D_ARRAY(4),
    /**
     * Array of 2-dimensional textures.
     */
    TEXTURE_TYPE_2D_ARRAY(5),
    /**
     * Array of [godot.Cubemap] textures.
     */
    TEXTURE_TYPE_CUBE_ARRAY(6),
    /**
     * Represents the size of the [enum TextureType] enum.
     */
    TEXTURE_TYPE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class TextureSamples(
    id: Long,
  ) {
    /**
     * Perform 1 texture sample (this is the fastest but lowest-quality for antialiasing).
     */
    TEXTURE_SAMPLES_1(0),
    /**
     * Perform 2 texture samples.
     */
    TEXTURE_SAMPLES_2(1),
    /**
     * Perform 4 texture samples.
     */
    TEXTURE_SAMPLES_4(2),
    /**
     * Perform 8 texture samples. Not supported on mobile GPUs (including Apple Silicon).
     */
    TEXTURE_SAMPLES_8(3),
    /**
     * Perform 16 texture samples. Not supported on mobile GPUs and many desktop GPUs.
     */
    TEXTURE_SAMPLES_16(4),
    /**
     * Perform 32 texture samples. Not supported on most GPUs.
     */
    TEXTURE_SAMPLES_32(5),
    /**
     * Perform 64 texture samples (this is the slowest but highest-quality for antialiasing). Not supported on most GPUs.
     */
    TEXTURE_SAMPLES_64(6),
    /**
     * Represents the size of the [enum TextureSamples] enum.
     */
    TEXTURE_SAMPLES_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public sealed interface TextureUsageBits {
    public val flag: Long

    public infix fun or(other: TextureUsageBits): TextureUsageBits =
        TextureUsageBitsValue(flag.or(other.flag))

    public infix fun or(other: Long): TextureUsageBits = TextureUsageBitsValue(flag.or(other))

    public infix fun xor(other: TextureUsageBits): TextureUsageBits =
        TextureUsageBitsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): TextureUsageBits = TextureUsageBitsValue(flag.xor(other))

    public infix fun and(other: TextureUsageBits): TextureUsageBits =
        TextureUsageBitsValue(flag.and(other.flag))

    public infix fun and(other: Long): TextureUsageBits = TextureUsageBitsValue(flag.and(other))

    public operator fun plus(other: TextureUsageBits): TextureUsageBits =
        TextureUsageBitsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): TextureUsageBits =
        TextureUsageBitsValue(flag.plus(other))

    public operator fun minus(other: TextureUsageBits): TextureUsageBits =
        TextureUsageBitsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): TextureUsageBits =
        TextureUsageBitsValue(flag.minus(other))

    public operator fun times(other: TextureUsageBits): TextureUsageBits =
        TextureUsageBitsValue(flag.times(other.flag))

    public operator fun times(other: Long): TextureUsageBits =
        TextureUsageBitsValue(flag.times(other))

    public operator fun div(other: TextureUsageBits): TextureUsageBits =
        TextureUsageBitsValue(flag.div(other.flag))

    public operator fun div(other: Long): TextureUsageBits = TextureUsageBitsValue(flag.div(other))

    public operator fun rem(other: TextureUsageBits): TextureUsageBits =
        TextureUsageBitsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): TextureUsageBits = TextureUsageBitsValue(flag.rem(other))

    public fun unaryPlus(): TextureUsageBits = TextureUsageBitsValue(flag.unaryPlus())

    public fun unaryMinus(): TextureUsageBits = TextureUsageBitsValue(flag.unaryMinus())

    public fun inv(): TextureUsageBits = TextureUsageBitsValue(flag.inv())

    public infix fun shl(bits: Int): TextureUsageBits = TextureUsageBitsValue(flag shl bits)

    public infix fun shr(bits: Int): TextureUsageBits = TextureUsageBitsValue(flag shr bits)

    public infix fun ushr(bits: Int): TextureUsageBits = TextureUsageBitsValue(flag ushr bits)

    public companion object {
      public val TEXTURE_USAGE_SAMPLING_BIT: TextureUsageBits = TextureUsageBitsValue(1)

      public val TEXTURE_USAGE_COLOR_ATTACHMENT_BIT: TextureUsageBits = TextureUsageBitsValue(2)

      public val TEXTURE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT: TextureUsageBits =
          TextureUsageBitsValue(4)

      public val TEXTURE_USAGE_STORAGE_BIT: TextureUsageBits = TextureUsageBitsValue(8)

      public val TEXTURE_USAGE_STORAGE_ATOMIC_BIT: TextureUsageBits = TextureUsageBitsValue(16)

      public val TEXTURE_USAGE_CPU_READ_BIT: TextureUsageBits = TextureUsageBitsValue(32)

      public val TEXTURE_USAGE_CAN_UPDATE_BIT: TextureUsageBits = TextureUsageBitsValue(64)

      public val TEXTURE_USAGE_CAN_COPY_FROM_BIT: TextureUsageBits = TextureUsageBitsValue(128)

      public val TEXTURE_USAGE_CAN_COPY_TO_BIT: TextureUsageBits = TextureUsageBitsValue(256)

      public val TEXTURE_USAGE_INPUT_ATTACHMENT_BIT: TextureUsageBits = TextureUsageBitsValue(512)
    }
  }

  @JvmInline
  internal value class TextureUsageBitsValue internal constructor(
    public override val flag: Long,
  ) : TextureUsageBits

  public enum class TextureSwizzle(
    id: Long,
  ) {
    /**
     * Return the sampled value as-is.
     */
    TEXTURE_SWIZZLE_IDENTITY(0),
    /**
     * Always return `0.0` when sampling.
     */
    TEXTURE_SWIZZLE_ZERO(1),
    /**
     * Always return `1.0` when sampling.
     */
    TEXTURE_SWIZZLE_ONE(2),
    /**
     * Sample the red color channel.
     */
    TEXTURE_SWIZZLE_R(3),
    /**
     * Sample the green color channel.
     */
    TEXTURE_SWIZZLE_G(4),
    /**
     * Sample the blue color channel.
     */
    TEXTURE_SWIZZLE_B(5),
    /**
     * Sample the alpha channel.
     */
    TEXTURE_SWIZZLE_A(6),
    /**
     * Represents the size of the [enum TextureSwizzle] enum.
     */
    TEXTURE_SWIZZLE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class TextureSliceType(
    id: Long,
  ) {
    /**
     * 2-dimensional texture slice.
     */
    TEXTURE_SLICE_2D(0),
    /**
     * Cubemap texture slice.
     */
    TEXTURE_SLICE_CUBEMAP(1),
    /**
     * 3-dimensional texture slice.
     */
    TEXTURE_SLICE_3D(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SamplerFilter(
    id: Long,
  ) {
    /**
     * Nearest-neighbor sampler filtering. Sampling at higher resolutions than the source will result in a pixelated look.
     */
    SAMPLER_FILTER_NEAREST(0),
    /**
     * Bilinear sampler filtering. Sampling at higher resolutions than the source will result in a blurry look.
     */
    SAMPLER_FILTER_LINEAR(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SamplerRepeatMode(
    id: Long,
  ) {
    /**
     * Sample with repeating enabled.
     */
    SAMPLER_REPEAT_MODE_REPEAT(0),
    /**
     * Sample with mirrored repeating enabled. When sampling outside the `[0.0, 1.0]` range, return a mirrored version of the sampler. This mirrored version is mirrored again if sampling further away, with the pattern repeating indefinitely.
     */
    SAMPLER_REPEAT_MODE_MIRRORED_REPEAT(1),
    /**
     * Sample with repeating disabled. When sampling outside the `[0.0, 1.0]` range, return the color of the last pixel on the edge.
     */
    SAMPLER_REPEAT_MODE_CLAMP_TO_EDGE(2),
    /**
     * Sample with repeating disabled. When sampling outside the `[0.0, 1.0]` range, return the specified [godot.RDSamplerState.borderColor].
     */
    SAMPLER_REPEAT_MODE_CLAMP_TO_BORDER(3),
    /**
     * Sample with mirrored repeating enabled, but only once. When sampling in the `[-1.0, 0.0]` range, return a mirrored version of the sampler. When sampling outside the `[-1.0, 1.0]` range, return the color of the last pixel on the edge.
     */
    SAMPLER_REPEAT_MODE_MIRROR_CLAMP_TO_EDGE(4),
    /**
     * Represents the size of the [enum SamplerRepeatMode] enum.
     */
    SAMPLER_REPEAT_MODE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SamplerBorderColor(
    id: Long,
  ) {
    /**
     * Return a floating-point transparent black color when sampling outside the `[0.0, 1.0]` range. Only effective if the sampler repeat mode is [SAMPLER_REPEAT_MODE_CLAMP_TO_BORDER].
     */
    SAMPLER_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK(0),
    /**
     * Return a integer transparent black color when sampling outside the `[0.0, 1.0]` range. Only effective if the sampler repeat mode is [SAMPLER_REPEAT_MODE_CLAMP_TO_BORDER].
     */
    SAMPLER_BORDER_COLOR_INT_TRANSPARENT_BLACK(1),
    /**
     * Return a floating-point opaque black color when sampling outside the `[0.0, 1.0]` range. Only effective if the sampler repeat mode is [SAMPLER_REPEAT_MODE_CLAMP_TO_BORDER].
     */
    SAMPLER_BORDER_COLOR_FLOAT_OPAQUE_BLACK(2),
    /**
     * Return a integer opaque black color when sampling outside the `[0.0, 1.0]` range. Only effective if the sampler repeat mode is [SAMPLER_REPEAT_MODE_CLAMP_TO_BORDER].
     */
    SAMPLER_BORDER_COLOR_INT_OPAQUE_BLACK(3),
    /**
     * Return a floating-point opaque white color when sampling outside the `[0.0, 1.0]` range. Only effective if the sampler repeat mode is [SAMPLER_REPEAT_MODE_CLAMP_TO_BORDER].
     */
    SAMPLER_BORDER_COLOR_FLOAT_OPAQUE_WHITE(4),
    /**
     * Return a integer opaque white color when sampling outside the `[0.0, 1.0]` range. Only effective if the sampler repeat mode is [SAMPLER_REPEAT_MODE_CLAMP_TO_BORDER].
     */
    SAMPLER_BORDER_COLOR_INT_OPAQUE_WHITE(5),
    /**
     * Represents the size of the [enum SamplerBorderColor] enum.
     */
    SAMPLER_BORDER_COLOR_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class VertexFrequency(
    id: Long,
  ) {
    /**
     * Vertex attribute addressing is a function of the vertex. This is used to specify the rate at which vertex attributes are pulled from buffers.
     */
    VERTEX_FREQUENCY_VERTEX(0),
    /**
     * Vertex attribute addressing is a function of the instance index. This is used to specify the rate at which vertex attributes are pulled from buffers.
     */
    VERTEX_FREQUENCY_INSTANCE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class IndexBufferFormat(
    id: Long,
  ) {
    /**
     * Index buffer in 16-bit unsigned integer format. This limits the maximum index that can be specified to `65535`.
     */
    INDEX_BUFFER_FORMAT_UINT16(0),
    /**
     * Index buffer in 32-bit unsigned integer format. This limits the maximum index that can be specified to `4294967295`.
     */
    INDEX_BUFFER_FORMAT_UINT32(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public sealed interface StorageBufferUsage {
    public val flag: Long

    public infix fun or(other: StorageBufferUsage): StorageBufferUsage =
        StorageBufferUsageValue(flag.or(other.flag))

    public infix fun or(other: Long): StorageBufferUsage = StorageBufferUsageValue(flag.or(other))

    public infix fun xor(other: StorageBufferUsage): StorageBufferUsage =
        StorageBufferUsageValue(flag.xor(other.flag))

    public infix fun xor(other: Long): StorageBufferUsage = StorageBufferUsageValue(flag.xor(other))

    public infix fun and(other: StorageBufferUsage): StorageBufferUsage =
        StorageBufferUsageValue(flag.and(other.flag))

    public infix fun and(other: Long): StorageBufferUsage = StorageBufferUsageValue(flag.and(other))

    public operator fun plus(other: StorageBufferUsage): StorageBufferUsage =
        StorageBufferUsageValue(flag.plus(other.flag))

    public operator fun plus(other: Long): StorageBufferUsage =
        StorageBufferUsageValue(flag.plus(other))

    public operator fun minus(other: StorageBufferUsage): StorageBufferUsage =
        StorageBufferUsageValue(flag.minus(other.flag))

    public operator fun minus(other: Long): StorageBufferUsage =
        StorageBufferUsageValue(flag.minus(other))

    public operator fun times(other: StorageBufferUsage): StorageBufferUsage =
        StorageBufferUsageValue(flag.times(other.flag))

    public operator fun times(other: Long): StorageBufferUsage =
        StorageBufferUsageValue(flag.times(other))

    public operator fun div(other: StorageBufferUsage): StorageBufferUsage =
        StorageBufferUsageValue(flag.div(other.flag))

    public operator fun div(other: Long): StorageBufferUsage =
        StorageBufferUsageValue(flag.div(other))

    public operator fun rem(other: StorageBufferUsage): StorageBufferUsage =
        StorageBufferUsageValue(flag.rem(other.flag))

    public operator fun rem(other: Long): StorageBufferUsage =
        StorageBufferUsageValue(flag.rem(other))

    public fun unaryPlus(): StorageBufferUsage = StorageBufferUsageValue(flag.unaryPlus())

    public fun unaryMinus(): StorageBufferUsage = StorageBufferUsageValue(flag.unaryMinus())

    public fun inv(): StorageBufferUsage = StorageBufferUsageValue(flag.inv())

    public infix fun shl(bits: Int): StorageBufferUsage = StorageBufferUsageValue(flag shl bits)

    public infix fun shr(bits: Int): StorageBufferUsage = StorageBufferUsageValue(flag shr bits)

    public infix fun ushr(bits: Int): StorageBufferUsage = StorageBufferUsageValue(flag ushr bits)

    public companion object {
      public val STORAGE_BUFFER_USAGE_DISPATCH_INDIRECT: StorageBufferUsage =
          StorageBufferUsageValue(1)
    }
  }

  @JvmInline
  internal value class StorageBufferUsageValue internal constructor(
    public override val flag: Long,
  ) : StorageBufferUsage

  public enum class UniformType(
    id: Long,
  ) {
    /**
     * Sampler uniform.
     */
    UNIFORM_TYPE_SAMPLER(0),
    /**
     * Sampler uniform with a texture.
     */
    UNIFORM_TYPE_SAMPLER_WITH_TEXTURE(1),
    /**
     * Texture uniform.
     */
    UNIFORM_TYPE_TEXTURE(2),
    /**
     * Image uniform.
     */
    UNIFORM_TYPE_IMAGE(3),
    /**
     * Texture buffer uniform.
     */
    UNIFORM_TYPE_TEXTURE_BUFFER(4),
    /**
     * Sampler uniform with a texture buffer.
     */
    UNIFORM_TYPE_SAMPLER_WITH_TEXTURE_BUFFER(5),
    /**
     * Image buffer uniform.
     */
    UNIFORM_TYPE_IMAGE_BUFFER(6),
    /**
     * Uniform buffer uniform.
     */
    UNIFORM_TYPE_UNIFORM_BUFFER(7),
    /**
     * [godot.Storage buffer](https://vkguide.dev/docs/chapter-4/storage_buffers/) uniform.
     */
    UNIFORM_TYPE_STORAGE_BUFFER(8),
    /**
     * Input attachment uniform.
     */
    UNIFORM_TYPE_INPUT_ATTACHMENT(9),
    /**
     * Represents the size of the [enum UniformType] enum.
     */
    UNIFORM_TYPE_MAX(10),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class RenderPrimitive(
    id: Long,
  ) {
    /**
     * Point rendering primitive (with constant size, regardless of distance from camera).
     */
    RENDER_PRIMITIVE_POINTS(0),
    /**
     * Line list rendering primitive. Lines are drawn separated from each other.
     */
    RENDER_PRIMITIVE_LINES(1),
    /**
     * [godot.Line list rendering primitive with adjacency.](https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#drawing-line-lists-with-adjacency)
     *
     * **Note:** Adjacency is only useful with geometry shaders, which Godot does not expose.
     */
    RENDER_PRIMITIVE_LINES_WITH_ADJACENCY(2),
    /**
     * Line strip rendering primitive. Lines drawn are connected to the previous vertex.
     */
    RENDER_PRIMITIVE_LINESTRIPS(3),
    /**
     * [godot.Line strip rendering primitive with adjacency.](https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#drawing-line-strips-with-adjacency)
     *
     * **Note:** Adjacency is only useful with geometry shaders, which Godot does not expose.
     */
    RENDER_PRIMITIVE_LINESTRIPS_WITH_ADJACENCY(4),
    /**
     * Triangle list rendering primitive. Triangles are drawn separated from each other.
     */
    RENDER_PRIMITIVE_TRIANGLES(5),
    /**
     * [godot.Triangle list rendering primitive with adjacency.](https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#drawing-triangle-lists-with-adjacency)
     *
     *  **Note:** Adjacency is only useful with geometry shaders, which Godot does not expose.
     */
    RENDER_PRIMITIVE_TRIANGLES_WITH_ADJACENCY(6),
    /**
     * Triangle strip rendering primitive. Triangles drawn are connected to the previous triangle.
     */
    RENDER_PRIMITIVE_TRIANGLE_STRIPS(7),
    /**
     * [godot.Triangle strip rendering primitive with adjacency.](https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#drawing-triangle-strips-with-adjacency)
     *
     * **Note:** Adjacency is only useful with geometry shaders, which Godot does not expose.
     */
    RENDER_PRIMITIVE_TRIANGLE_STRIPS_WITH_AJACENCY(8),
    /**
     * Triangle strip rendering primitive with *primitive restart* enabled. Triangles drawn are connected to the previous triangle, but a primitive restart index can be specified before drawing to create a second triangle strip after the specified index.
     *
     * **Note:** Only compatible with indexed draws.
     */
    RENDER_PRIMITIVE_TRIANGLE_STRIPS_WITH_RESTART_INDEX(9),
    /**
     * Tessellation patch rendering primitive. Only useful with tessellation shaders, which can be used to deform these patches.
     */
    RENDER_PRIMITIVE_TESSELATION_PATCH(10),
    /**
     * Represents the size of the [enum RenderPrimitive] enum.
     */
    RENDER_PRIMITIVE_MAX(11),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class PolygonCullMode(
    id: Long,
  ) {
    /**
     * Do not use polygon front face or backface culling.
     */
    POLYGON_CULL_DISABLED(0),
    /**
     * Use polygon frontface culling (faces pointing towards the camera are hidden).
     */
    POLYGON_CULL_FRONT(1),
    /**
     * Use polygon backface culling (faces pointing away from the camera are hidden).
     */
    POLYGON_CULL_BACK(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class PolygonFrontFace(
    id: Long,
  ) {
    /**
     * Clockwise winding order to determine which face of a polygon is its front face.
     */
    POLYGON_FRONT_FACE_CLOCKWISE(0),
    /**
     * Counter-clockwise winding order to determine which face of a polygon is its front face.
     */
    POLYGON_FRONT_FACE_COUNTER_CLOCKWISE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class StencilOperation(
    id: Long,
  ) {
    /**
     * Keep the current stencil value.
     */
    STENCIL_OP_KEEP(0),
    /**
     * Set the stencil value to `0`.
     */
    STENCIL_OP_ZERO(1),
    /**
     * Replace the existing stencil value with the new one.
     */
    STENCIL_OP_REPLACE(2),
    /**
     * Increment the existing stencil value and clamp to the maximum representable unsigned value if reached. Stencil bits are considered as an unsigned integer.
     */
    STENCIL_OP_INCREMENT_AND_CLAMP(3),
    /**
     * Decrement the existing stencil value and clamp to the minimum value if reached. Stencil bits are considered as an unsigned integer.
     */
    STENCIL_OP_DECREMENT_AND_CLAMP(4),
    /**
     * Bitwise-invert the existing stencil value.
     */
    STENCIL_OP_INVERT(5),
    /**
     * Increment the stencil value and wrap around to `0` if reaching the maximum representable unsigned. Stencil bits are considered as an unsigned integer.
     */
    STENCIL_OP_INCREMENT_AND_WRAP(6),
    /**
     * Decrement the stencil value and wrap around to the maximum representable unsigned if reaching the minimum. Stencil bits are considered as an unsigned integer.
     */
    STENCIL_OP_DECREMENT_AND_WRAP(7),
    /**
     * Represents the size of the [enum StencilOperation] enum.
     */
    STENCIL_OP_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CompareOperator(
    id: Long,
  ) {
    /**
     * "Never" comparison (opposite of [COMPARE_OP_ALWAYS]).
     */
    COMPARE_OP_NEVER(0),
    /**
     * "Less than" comparison.
     */
    COMPARE_OP_LESS(1),
    /**
     * "Equal" comparison.
     */
    COMPARE_OP_EQUAL(2),
    /**
     * "Less than or equal" comparison.
     */
    COMPARE_OP_LESS_OR_EQUAL(3),
    /**
     * "Greater than" comparison.
     */
    COMPARE_OP_GREATER(4),
    /**
     * "Not equal" comparison.
     */
    COMPARE_OP_NOT_EQUAL(5),
    /**
     * "Greater than or equal" comparison.
     */
    COMPARE_OP_GREATER_OR_EQUAL(6),
    /**
     * "Always" comparison (opposite of [COMPARE_OP_NEVER]).
     */
    COMPARE_OP_ALWAYS(7),
    /**
     * Represents the size of the [enum CompareOperator] enum.
     */
    COMPARE_OP_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LogicOperation(
    id: Long,
  ) {
    /**
     * Clear logic operation (result is always `0`). See also [LOGIC_OP_SET].
     */
    LOGIC_OP_CLEAR(0),
    /**
     * AND logic operation.
     */
    LOGIC_OP_AND(1),
    /**
     * AND logic operation with the *destination* operand being inverted. See also [LOGIC_OP_AND_INVERTED].
     */
    LOGIC_OP_AND_REVERSE(2),
    /**
     * Copy logic operation (keeps the *source* value as-is). See also [LOGIC_OP_COPY_INVERTED] and [LOGIC_OP_NO_OP].
     */
    LOGIC_OP_COPY(3),
    /**
     * AND logic operation with the *source* operand being inverted. See also [LOGIC_OP_AND_REVERSE].
     */
    LOGIC_OP_AND_INVERTED(4),
    /**
     * No-op logic operation (keeps the *destination* value as-is). See also [LOGIC_OP_COPY].
     */
    LOGIC_OP_NO_OP(5),
    /**
     * Exclusive or (XOR) logic operation.
     */
    LOGIC_OP_XOR(6),
    /**
     * OR logic operation.
     */
    LOGIC_OP_OR(7),
    /**
     * Not-OR (NOR) logic operation.
     */
    LOGIC_OP_NOR(8),
    /**
     * Not-XOR (XNOR) logic operation.
     */
    LOGIC_OP_EQUIVALENT(9),
    /**
     * Invert logic operation.
     */
    LOGIC_OP_INVERT(10),
    /**
     * OR logic operation with the *destination* operand being inverted. See also [LOGIC_OP_OR_REVERSE].
     */
    LOGIC_OP_OR_REVERSE(11),
    /**
     * NOT logic operation (inverts the value). See also [LOGIC_OP_COPY].
     */
    LOGIC_OP_COPY_INVERTED(12),
    /**
     * OR logic operation with the *source* operand being inverted. See also [LOGIC_OP_OR_REVERSE].
     */
    LOGIC_OP_OR_INVERTED(13),
    /**
     * Not-AND (NAND) logic operation.
     */
    LOGIC_OP_NAND(14),
    /**
     * SET logic operation (result is always `1`). See also [LOGIC_OP_CLEAR].
     */
    LOGIC_OP_SET(15),
    /**
     * Represents the size of the [enum LogicOperation] enum.
     */
    LOGIC_OP_MAX(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class BlendFactor(
    id: Long,
  ) {
    /**
     * Constant `0.0` blend factor.
     */
    BLEND_FACTOR_ZERO(0),
    /**
     * Constant `1.0` blend factor.
     */
    BLEND_FACTOR_ONE(1),
    /**
     * Color blend factor is `source color`. Alpha blend factor is `source alpha`.
     */
    BLEND_FACTOR_SRC_COLOR(2),
    /**
     * Color blend factor is `1.0 - source color`. Alpha blend factor is `1.0 - source alpha`.
     */
    BLEND_FACTOR_ONE_MINUS_SRC_COLOR(3),
    /**
     * Color blend factor is `destination color`. Alpha blend factor is `destination alpha`.
     */
    BLEND_FACTOR_DST_COLOR(4),
    /**
     * Color blend factor is `1.0 - destination color`. Alpha blend factor is `1.0 - destination alpha`.
     */
    BLEND_FACTOR_ONE_MINUS_DST_COLOR(5),
    /**
     * Color and alpha blend factor is `source alpha`.
     */
    BLEND_FACTOR_SRC_ALPHA(6),
    /**
     * Color and alpha blend factor is `1.0 - source alpha`.
     */
    BLEND_FACTOR_ONE_MINUS_SRC_ALPHA(7),
    /**
     * Color and alpha blend factor is `destination alpha`.
     */
    BLEND_FACTOR_DST_ALPHA(8),
    /**
     * Color and alpha blend factor is `1.0 - destination alpha`.
     */
    BLEND_FACTOR_ONE_MINUS_DST_ALPHA(9),
    /**
     * Color blend factor is `blend constant color`. Alpha blend factor is `blend constant alpha` (see [drawListSetBlendConstants]).
     */
    BLEND_FACTOR_CONSTANT_COLOR(10),
    /**
     * Color blend factor is `1.0 - blend constant color`. Alpha blend factor is `1.0 - blend constant alpha` (see [drawListSetBlendConstants]).
     */
    BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR(11),
    /**
     * Color and alpha blend factor is `blend constant alpha` (see [drawListSetBlendConstants]).
     */
    BLEND_FACTOR_CONSTANT_ALPHA(12),
    /**
     * Color and alpha blend factor is `1.0 - blend constant alpha` (see [drawListSetBlendConstants]).
     */
    BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA(13),
    /**
     * Color blend factor is `min(source alpha, 1.0 - destination alpha)`. Alpha blend factor is `1.0`.
     */
    BLEND_FACTOR_SRC_ALPHA_SATURATE(14),
    /**
     * Color blend factor is `second source color`. Alpha blend factor is `second source alpha`. Only relevant for dual-source blending.
     */
    BLEND_FACTOR_SRC1_COLOR(15),
    /**
     * Color blend factor is `1.0 - second source color`. Alpha blend factor is `1.0 - second source alpha`. Only relevant for dual-source blending.
     */
    BLEND_FACTOR_ONE_MINUS_SRC1_COLOR(16),
    /**
     * Color and alpha blend factor is `second source alpha`. Only relevant for dual-source blending.
     */
    BLEND_FACTOR_SRC1_ALPHA(17),
    /**
     * Color and alpha blend factor is `1.0 - second source alpha`. Only relevant for dual-source blending.
     */
    BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA(18),
    /**
     * Represents the size of the [enum BlendFactor] enum.
     */
    BLEND_FACTOR_MAX(19),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class BlendOperation(
    id: Long,
  ) {
    /**
     * Additive blending operation (`source + destination`).
     */
    BLEND_OP_ADD(0),
    /**
     * Subtractive blending operation (`source - destination`).
     */
    BLEND_OP_SUBTRACT(1),
    /**
     * Reverse subtractive blending operation (`destination - source`).
     */
    BLEND_OP_REVERSE_SUBTRACT(2),
    /**
     * Minimum blending operation (keep the lowest value of the two).
     */
    BLEND_OP_MINIMUM(3),
    /**
     * Maximum blending operation (keep the highest value of the two).
     */
    BLEND_OP_MAXIMUM(4),
    /**
     * Represents the size of the [enum BlendOperation] enum.
     */
    BLEND_OP_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public sealed interface PipelineDynamicStateFlags {
    public val flag: Long

    public infix fun or(other: PipelineDynamicStateFlags): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.or(other.flag))

    public infix fun or(other: Long): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.or(other))

    public infix fun xor(other: PipelineDynamicStateFlags): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.xor(other))

    public infix fun and(other: PipelineDynamicStateFlags): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.and(other.flag))

    public infix fun and(other: Long): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.and(other))

    public operator fun plus(other: PipelineDynamicStateFlags): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.plus(other))

    public operator fun minus(other: PipelineDynamicStateFlags): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.minus(other))

    public operator fun times(other: PipelineDynamicStateFlags): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.times(other.flag))

    public operator fun times(other: Long): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.times(other))

    public operator fun div(other: PipelineDynamicStateFlags): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.div(other.flag))

    public operator fun div(other: Long): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.div(other))

    public operator fun rem(other: PipelineDynamicStateFlags): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.rem(other))

    public fun unaryPlus(): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.unaryPlus())

    public fun unaryMinus(): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.unaryMinus())

    public fun inv(): PipelineDynamicStateFlags = PipelineDynamicStateFlagsValue(flag.inv())

    public infix fun shl(bits: Int): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag shl bits)

    public infix fun shr(bits: Int): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag shr bits)

    public infix fun ushr(bits: Int): PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag ushr bits)

    public companion object {
      public val DYNAMIC_STATE_LINE_WIDTH: PipelineDynamicStateFlags =
          PipelineDynamicStateFlagsValue(1)

      public val DYNAMIC_STATE_DEPTH_BIAS: PipelineDynamicStateFlags =
          PipelineDynamicStateFlagsValue(2)

      public val DYNAMIC_STATE_BLEND_CONSTANTS: PipelineDynamicStateFlags =
          PipelineDynamicStateFlagsValue(4)

      public val DYNAMIC_STATE_DEPTH_BOUNDS: PipelineDynamicStateFlags =
          PipelineDynamicStateFlagsValue(8)

      public val DYNAMIC_STATE_STENCIL_COMPARE_MASK: PipelineDynamicStateFlags =
          PipelineDynamicStateFlagsValue(16)

      public val DYNAMIC_STATE_STENCIL_WRITE_MASK: PipelineDynamicStateFlags =
          PipelineDynamicStateFlagsValue(32)

      public val DYNAMIC_STATE_STENCIL_REFERENCE: PipelineDynamicStateFlags =
          PipelineDynamicStateFlagsValue(64)
    }
  }

  @JvmInline
  internal value class PipelineDynamicStateFlagsValue internal constructor(
    public override val flag: Long,
  ) : PipelineDynamicStateFlags

  public enum class InitialAction(
    id: Long,
  ) {
    /**
     * Start rendering and clear the whole framebuffer.
     */
    INITIAL_ACTION_CLEAR(0),
    /**
     * Start rendering and clear the framebuffer in the specified region.
     */
    INITIAL_ACTION_CLEAR_REGION(1),
    /**
     * Continue rendering and clear the framebuffer in the specified region. Framebuffer must have been left in [FINAL_ACTION_CONTINUE] state as the final action previously.
     */
    INITIAL_ACTION_CLEAR_REGION_CONTINUE(2),
    /**
     * Start rendering, but keep attached color texture contents. If the framebuffer was previously used to read in a shader, this will automatically insert a layout transition.
     */
    INITIAL_ACTION_KEEP(3),
    /**
     * Start rendering, ignore what is there; write above it. In general, this is the fastest option when you will be writing every single pixel and you don't need a clear color.
     */
    INITIAL_ACTION_DROP(4),
    /**
     * Continue rendering. Framebuffer must have been left in [FINAL_ACTION_CONTINUE] state as the final action previously.
     */
    INITIAL_ACTION_CONTINUE(5),
    /**
     * Represents the size of the [enum InitialAction] enum.
     */
    INITIAL_ACTION_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class FinalAction(
    id: Long,
  ) {
    /**
     * Store the texture for reading and make it read-only if it has the [TEXTURE_USAGE_SAMPLING_BIT] bit (only applies to color, depth and stencil attachments).
     */
    FINAL_ACTION_READ(0),
    /**
     * Discard the texture data and make it read-only if it has the [TEXTURE_USAGE_SAMPLING_BIT] bit (only applies to color, depth and stencil attachments).
     */
    FINAL_ACTION_DISCARD(1),
    /**
     * Store the texture and continue for further processing. Similar to [FINAL_ACTION_READ], but does not make the texture read-only if it has the [TEXTURE_USAGE_SAMPLING_BIT] bit.
     */
    FINAL_ACTION_CONTINUE(2),
    /**
     * Represents the size of the [enum FinalAction] enum.
     */
    FINAL_ACTION_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ShaderStage(
    id: Long,
  ) {
    /**
     * Vertex shader stage. This can be used to manipulate vertices from a shader (but not create new vertices).
     */
    SHADER_STAGE_VERTEX(0),
    /**
     * Fragment shader stage (called "pixel shader" in Direct3D). This can be used to manipulate pixels from a shader.
     */
    SHADER_STAGE_FRAGMENT(1),
    /**
     * Tessellation control shader stage. This can be used to create additional geometry from a shader.
     */
    SHADER_STAGE_TESSELATION_CONTROL(2),
    /**
     * Tessellation evaluation shader stage. This can be used to create additional geometry from a shader.
     */
    SHADER_STAGE_TESSELATION_EVALUATION(3),
    /**
     * Compute shader stage. This can be used to run arbitrary computing tasks in a shader, performing them on the GPU instead of the CPU.
     */
    SHADER_STAGE_COMPUTE(4),
    /**
     * Represents the size of the [enum ShaderStage] enum.
     */
    SHADER_STAGE_MAX(5),
    /**
     * Vertex shader stage bit (see also [SHADER_STAGE_VERTEX]).
     */
    SHADER_STAGE_VERTEX_BIT(1),
    /**
     * Fragment shader stage bit (see also [SHADER_STAGE_FRAGMENT]).
     */
    SHADER_STAGE_FRAGMENT_BIT(2),
    /**
     * Tessellation control shader stage bit (see also [SHADER_STAGE_TESSELATION_CONTROL]).
     */
    SHADER_STAGE_TESSELATION_CONTROL_BIT(4),
    /**
     * Tessellation evaluation shader stage bit (see also [SHADER_STAGE_TESSELATION_EVALUATION]).
     */
    SHADER_STAGE_TESSELATION_EVALUATION_BIT(8),
    /**
     * Compute shader stage bit (see also [SHADER_STAGE_COMPUTE]).
     */
    SHADER_STAGE_COMPUTE_BIT(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ShaderLanguage(
    id: Long,
  ) {
    /**
     * Khronos' GLSL shading language (used natively by OpenGL and Vulkan). This is the language used for core Godot shaders.
     */
    SHADER_LANGUAGE_GLSL(0),
    /**
     * Microsoft's High-Level Shading Language (used natively by Direct3D, but can also be used in Vulkan).
     */
    SHADER_LANGUAGE_HLSL(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class PipelineSpecializationConstantType(
    id: Long,
  ) {
    /**
     * Boolean specialization constant.
     */
    PIPELINE_SPECIALIZATION_CONSTANT_TYPE_BOOL(0),
    /**
     * Integer specialization constant.
     */
    PIPELINE_SPECIALIZATION_CONSTANT_TYPE_INT(1),
    /**
     * Floating-point specialization constant.
     */
    PIPELINE_SPECIALIZATION_CONSTANT_TYPE_FLOAT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class Limit(
    id: Long,
  ) {
    /**
     * Maximum number of uniform sets that can be bound at a given time.
     */
    LIMIT_MAX_BOUND_UNIFORM_SETS(0),
    /**
     * Maximum number of color framebuffer attachments that can be used at a given time.
     */
    LIMIT_MAX_FRAMEBUFFER_COLOR_ATTACHMENTS(1),
    /**
     * Maximum number of textures that can be used per uniform set.
     */
    LIMIT_MAX_TEXTURES_PER_UNIFORM_SET(2),
    /**
     * Maximum number of samplers that can be used per uniform set.
     */
    LIMIT_MAX_SAMPLERS_PER_UNIFORM_SET(3),
    /**
     * Maximum number of [storage buffers](https://vkguide.dev/docs/chapter-4/storage_buffers/) per uniform set.
     */
    LIMIT_MAX_STORAGE_BUFFERS_PER_UNIFORM_SET(4),
    /**
     * Maximum number of storage images per uniform set.
     */
    LIMIT_MAX_STORAGE_IMAGES_PER_UNIFORM_SET(5),
    /**
     * Maximum number of uniform buffers per uniform set.
     */
    LIMIT_MAX_UNIFORM_BUFFERS_PER_UNIFORM_SET(6),
    /**
     * Maximum index for an indexed draw command.
     */
    LIMIT_MAX_DRAW_INDEXED_INDEX(7),
    /**
     * Maximum height of a framebuffer (in pixels).
     */
    LIMIT_MAX_FRAMEBUFFER_HEIGHT(8),
    /**
     * Maximum width of a framebuffer (in pixels).
     */
    LIMIT_MAX_FRAMEBUFFER_WIDTH(9),
    /**
     * Maximum number of texture array layers.
     */
    LIMIT_MAX_TEXTURE_ARRAY_LAYERS(10),
    /**
     * Maximum supported 1-dimensional texture size (in pixels on a single axis).
     */
    LIMIT_MAX_TEXTURE_SIZE_1D(11),
    /**
     * Maximum supported 2-dimensional texture size (in pixels on a single axis).
     */
    LIMIT_MAX_TEXTURE_SIZE_2D(12),
    /**
     * Maximum supported 3-dimensional texture size (in pixels on a single axis).
     */
    LIMIT_MAX_TEXTURE_SIZE_3D(13),
    /**
     * Maximum supported cubemap texture size (in pixels on a single axis of a single face).
     */
    LIMIT_MAX_TEXTURE_SIZE_CUBE(14),
    /**
     * Maximum number of textures per shader stage.
     */
    LIMIT_MAX_TEXTURES_PER_SHADER_STAGE(15),
    /**
     * Maximum number of samplers per shader stage.
     */
    LIMIT_MAX_SAMPLERS_PER_SHADER_STAGE(16),
    /**
     * Maximum number of [storage buffers](https://vkguide.dev/docs/chapter-4/storage_buffers/) per shader stage.
     */
    LIMIT_MAX_STORAGE_BUFFERS_PER_SHADER_STAGE(17),
    /**
     * Maximum number of storage images per shader stage.
     */
    LIMIT_MAX_STORAGE_IMAGES_PER_SHADER_STAGE(18),
    /**
     * Maximum number of uniform buffers per uniform set.
     */
    LIMIT_MAX_UNIFORM_BUFFERS_PER_SHADER_STAGE(19),
    /**
     * Maximum size of a push constant. A lot of devices are limited to 128 bytes, so try to avoid exceeding 128 bytes in push constants to ensure compatibility even if your GPU is reporting a higher value.
     */
    LIMIT_MAX_PUSH_CONSTANT_SIZE(20),
    /**
     * Maximum size of a uniform buffer.
     */
    LIMIT_MAX_UNIFORM_BUFFER_SIZE(21),
    /**
     * Maximum vertex input attribute offset.
     */
    LIMIT_MAX_VERTEX_INPUT_ATTRIBUTE_OFFSET(22),
    /**
     * Maximum number of vertex input attributes.
     */
    LIMIT_MAX_VERTEX_INPUT_ATTRIBUTES(23),
    /**
     * Maximum number of vertex input bindings.
     */
    LIMIT_MAX_VERTEX_INPUT_BINDINGS(24),
    /**
     * Maximum vertex input binding stride.
     */
    LIMIT_MAX_VERTEX_INPUT_BINDING_STRIDE(25),
    /**
     * Minimum uniform buffer offset alignment.
     */
    LIMIT_MIN_UNIFORM_BUFFER_OFFSET_ALIGNMENT(26),
    /**
     * Maximum shared memory size for compute shaders.
     */
    LIMIT_MAX_COMPUTE_SHARED_MEMORY_SIZE(27),
    /**
     * Maximum number of workgroups for compute shaders on the X axis.
     */
    LIMIT_MAX_COMPUTE_WORKGROUP_COUNT_X(28),
    /**
     * Maximum number of workgroups for compute shaders on the Y axis.
     */
    LIMIT_MAX_COMPUTE_WORKGROUP_COUNT_Y(29),
    /**
     * Maximum number of workgroups for compute shaders on the Z axis.
     */
    LIMIT_MAX_COMPUTE_WORKGROUP_COUNT_Z(30),
    /**
     * Maximum number of workgroup invocations for compute shaders.
     */
    LIMIT_MAX_COMPUTE_WORKGROUP_INVOCATIONS(31),
    /**
     * Maximum workgroup size for compute shaders on the X axis.
     */
    LIMIT_MAX_COMPUTE_WORKGROUP_SIZE_X(32),
    /**
     * Maximum workgroup size for compute shaders on the Y axis.
     */
    LIMIT_MAX_COMPUTE_WORKGROUP_SIZE_Y(33),
    /**
     * Maximum workgroup size for compute shaders on the Z axis.
     */
    LIMIT_MAX_COMPUTE_WORKGROUP_SIZE_Z(34),
    /**
     * Maximum viewport width (in pixels).
     */
    LIMIT_MAX_VIEWPORT_DIMENSIONS_X(35),
    /**
     * Maximum viewport height (in pixels).
     */
    LIMIT_MAX_VIEWPORT_DIMENSIONS_Y(36),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class MemoryType(
    id: Long,
  ) {
    /**
     * Memory taken by textures.
     */
    MEMORY_TEXTURES(0),
    /**
     * Memory taken by buffers.
     */
    MEMORY_BUFFERS(1),
    /**
     * Total memory taken. This is greater than the sum of [MEMORY_TEXTURES] and [MEMORY_BUFFERS], as it also includes miscellaneous memory usage.
     */
    MEMORY_TOTAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Returned by functions that return an ID if a value is invalid.
     */
    public final const val INVALID_ID: Long = -1

    /**
     * Returned by functions that return a format ID if a value is invalid.
     */
    public final const val INVALID_FORMAT_ID: Long = -1
  }

  internal object MethodBindings {
    public val textureCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_create")

    public val textureCreateSharedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_create_shared")

    public val textureCreateSharedFromSlicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_create_shared_from_slice")

    public val textureCreateFromExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_create_from_extension")

    public val textureUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_update")

    public val textureGetDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_get_data")

    public val textureIsFormatSupportedForUsagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_is_format_supported_for_usage")

    public val textureIsSharedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_is_shared")

    public val textureIsValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_is_valid")

    public val textureCopyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_copy")

    public val textureClearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_clear")

    public val textureResolveMultisamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_resolve_multisample")

    public val textureGetFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_get_format")

    public val textureGetNativeHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_get_native_handle")

    public val framebufferFormatCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_format_create")

    public val framebufferFormatCreateMultipassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_format_create_multipass")

    public val framebufferFormatCreateEmptyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_format_create_empty")

    public val framebufferFormatGetTextureSamplesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_format_get_texture_samples")

    public val framebufferCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_create")

    public val framebufferCreateMultipassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_create_multipass")

    public val framebufferCreateEmptyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_create_empty")

    public val framebufferGetFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_get_format")

    public val framebufferIsValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_is_valid")

    public val samplerCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "sampler_create")

    public val samplerIsFormatSupportedForFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "sampler_is_format_supported_for_filter")

    public val vertexBufferCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "vertex_buffer_create")

    public val vertexFormatCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "vertex_format_create")

    public val vertexArrayCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "vertex_array_create")

    public val indexBufferCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "index_buffer_create")

    public val indexArrayCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "index_array_create")

    public val shaderCompileSpirvFromSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "shader_compile_spirv_from_source")

    public val shaderCompileBinaryFromSpirvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "shader_compile_binary_from_spirv")

    public val shaderCreateFromSpirvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "shader_create_from_spirv")

    public val shaderCreateFromBytecodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "shader_create_from_bytecode")

    public val shaderCreatePlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "shader_create_placeholder")

    public val shaderGetVertexInputAttributeMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "shader_get_vertex_input_attribute_mask")

    public val uniformBufferCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "uniform_buffer_create")

    public val storageBufferCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "storage_buffer_create")

    public val textureBufferCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_buffer_create")

    public val uniformSetCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "uniform_set_create")

    public val uniformSetIsValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "uniform_set_is_valid")

    public val bufferUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "buffer_update")

    public val bufferClearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "buffer_clear")

    public val bufferGetDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "buffer_get_data")

    public val renderPipelineCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "render_pipeline_create")

    public val renderPipelineIsValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "render_pipeline_is_valid")

    public val computePipelineCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_pipeline_create")

    public val computePipelineIsValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_pipeline_is_valid")

    public val screenGetWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "screen_get_width")

    public val screenGetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "screen_get_height")

    public val screenGetFramebufferFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "screen_get_framebuffer_format")

    public val drawListBeginForScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_begin_for_screen")

    public val drawListBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_begin")

    public val drawListBeginSplitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_begin_split")

    public val drawListSetBlendConstantsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_set_blend_constants")

    public val drawListBindRenderPipelinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_bind_render_pipeline")

    public val drawListBindUniformSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_bind_uniform_set")

    public val drawListBindVertexArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_bind_vertex_array")

    public val drawListBindIndexArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_bind_index_array")

    public val drawListSetPushConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_set_push_constant")

    public val drawListDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_draw")

    public val drawListEnableScissorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_enable_scissor")

    public val drawListDisableScissorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_disable_scissor")

    public val drawListSwitchToNextPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_switch_to_next_pass")

    public val drawListSwitchToNextPassSplitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_switch_to_next_pass_split")

    public val drawListEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_end")

    public val computeListBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_list_begin")

    public val computeListBindComputePipelinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_list_bind_compute_pipeline")

    public val computeListSetPushConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_list_set_push_constant")

    public val computeListBindUniformSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_list_bind_uniform_set")

    public val computeListDispatchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_list_dispatch")

    public val computeListAddBarrierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_list_add_barrier")

    public val computeListEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_list_end")

    public val freeRidPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingDevice", "free_rid")

    public val captureTimestampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "capture_timestamp")

    public val getCapturedTimestampsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_captured_timestamps_count")

    public val getCapturedTimestampsFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_captured_timestamps_frame")

    public val getCapturedTimestampGpuTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_captured_timestamp_gpu_time")

    public val getCapturedTimestampCpuTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_captured_timestamp_cpu_time")

    public val getCapturedTimestampNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_captured_timestamp_name")

    public val limitGetPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingDevice", "limit_get")

    public val getFrameDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_frame_delay")

    public val submitPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingDevice", "submit")

    public val syncPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingDevice", "sync")

    public val barrierPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingDevice", "barrier")

    public val fullBarrierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "full_barrier")

    public val createLocalDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "create_local_device")

    public val setResourceNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "set_resource_name")

    public val drawCommandBeginLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_command_begin_label")

    public val drawCommandInsertLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_command_insert_label")

    public val drawCommandEndLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_command_end_label")

    public val getDeviceVendorNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_device_vendor_name")

    public val getDeviceNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_device_name")

    public val getDevicePipelineCacheUuidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_device_pipeline_cache_uuid")

    public val getMemoryUsagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_memory_usage")

    public val getDriverResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_driver_resource")
  }
}

public infix fun Long.or(other: godot.RenderingDevice.BarrierMask): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.RenderingDevice.BarrierMask): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.RenderingDevice.BarrierMask): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.RenderingDevice.BarrierMask): Long =
    this.plus(other.flag)

public operator fun Long.minus(other: godot.RenderingDevice.BarrierMask): Long =
    this.minus(other.flag)

public operator fun Long.times(other: godot.RenderingDevice.BarrierMask): Long =
    this.times(other.flag)

public operator fun Long.div(other: godot.RenderingDevice.BarrierMask): Long = this.div(other.flag)

public operator fun Long.rem(other: godot.RenderingDevice.BarrierMask): Long = this.rem(other.flag)

public infix fun Long.or(other: godot.RenderingDevice.TextureUsageBits): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.RenderingDevice.TextureUsageBits): Long =
    this.xor(other.flag)

public infix fun Long.and(other: godot.RenderingDevice.TextureUsageBits): Long =
    this.and(other.flag)

public operator fun Long.plus(other: godot.RenderingDevice.TextureUsageBits): Long =
    this.plus(other.flag)

public operator fun Long.minus(other: godot.RenderingDevice.TextureUsageBits): Long =
    this.minus(other.flag)

public operator fun Long.times(other: godot.RenderingDevice.TextureUsageBits): Long =
    this.times(other.flag)

public operator fun Long.div(other: godot.RenderingDevice.TextureUsageBits): Long =
    this.div(other.flag)

public operator fun Long.rem(other: godot.RenderingDevice.TextureUsageBits): Long =
    this.rem(other.flag)

public infix fun Long.or(other: godot.RenderingDevice.StorageBufferUsage): Long =
    this.or(other.flag)

public infix fun Long.xor(other: godot.RenderingDevice.StorageBufferUsage): Long =
    this.xor(other.flag)

public infix fun Long.and(other: godot.RenderingDevice.StorageBufferUsage): Long =
    this.and(other.flag)

public operator fun Long.plus(other: godot.RenderingDevice.StorageBufferUsage): Long =
    this.plus(other.flag)

public operator fun Long.minus(other: godot.RenderingDevice.StorageBufferUsage): Long =
    this.minus(other.flag)

public operator fun Long.times(other: godot.RenderingDevice.StorageBufferUsage): Long =
    this.times(other.flag)

public operator fun Long.div(other: godot.RenderingDevice.StorageBufferUsage): Long =
    this.div(other.flag)

public operator fun Long.rem(other: godot.RenderingDevice.StorageBufferUsage): Long =
    this.rem(other.flag)

public infix fun Long.or(other: godot.RenderingDevice.PipelineDynamicStateFlags): Long =
    this.or(other.flag)

public infix fun Long.xor(other: godot.RenderingDevice.PipelineDynamicStateFlags): Long =
    this.xor(other.flag)

public infix fun Long.and(other: godot.RenderingDevice.PipelineDynamicStateFlags): Long =
    this.and(other.flag)

public operator fun Long.plus(other: godot.RenderingDevice.PipelineDynamicStateFlags): Long =
    this.plus(other.flag)

public operator fun Long.minus(other: godot.RenderingDevice.PipelineDynamicStateFlags): Long =
    this.minus(other.flag)

public operator fun Long.times(other: godot.RenderingDevice.PipelineDynamicStateFlags): Long =
    this.times(other.flag)

public operator fun Long.div(other: godot.RenderingDevice.PipelineDynamicStateFlags): Long =
    this.div(other.flag)

public operator fun Long.rem(other: godot.RenderingDevice.PipelineDynamicStateFlags): Long =
    this.rem(other.flag)
