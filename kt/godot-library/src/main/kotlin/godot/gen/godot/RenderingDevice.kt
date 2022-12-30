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
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
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
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class RenderingDevice internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RENDERINGDEVICE, scriptIndex)
    return true
  }

  /**
   *
   */
  public fun textureCreate(
    format: RDTextureFormat,
    view: RDTextureView,
    `data`: VariantArray<PackedByteArray> = godot.core.variantArrayOf()
  ): RID {
    TransferContext.writeArguments(OBJECT to format, OBJECT to view, ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_TEXTURE_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun textureCreateShared(view: RDTextureView, withTexture: RID): RID {
    TransferContext.writeArguments(OBJECT to view, _RID to withTexture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_TEXTURE_CREATE_SHARED, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun textureCreateSharedFromSlice(
    view: RDTextureView,
    withTexture: RID,
    layer: Long,
    mipmap: Long,
    mipmaps: Long = 1,
    sliceType: TextureSliceType = RenderingDevice.TextureSliceType.TEXTURE_SLICE_2D
  ): RID {
    TransferContext.writeArguments(OBJECT to view, _RID to withTexture, LONG to layer, LONG to mipmap, LONG to mipmaps, LONG to sliceType.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_TEXTURE_CREATE_SHARED_FROM_SLICE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun textureUpdate(
    texture: RID,
    layer: Long,
    `data`: PackedByteArray,
    postBarrier: Long = 7
  ): GodotError {
    TransferContext.writeArguments(_RID to texture, LONG to layer, PACKED_BYTE_ARRAY to data, OBJECT to postBarrier)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_TEXTURE_UPDATE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun textureGetData(texture: RID, layer: Long): PackedByteArray {
    TransferContext.writeArguments(_RID to texture, LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_TEXTURE_GET_DATA,
        PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   *
   */
  public fun textureIsFormatSupportedForUsage(format: DataFormat, usageFlags: Long): Boolean {
    TransferContext.writeArguments(LONG to format.id, OBJECT to usageFlags)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_TEXTURE_IS_FORMAT_SUPPORTED_FOR_USAGE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun textureIsShared(texture: RID): Boolean {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_TEXTURE_IS_SHARED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun textureIsValid(texture: RID): Boolean {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_TEXTURE_IS_VALID,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
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
    postBarrier: Long = 7
  ): GodotError {
    TransferContext.writeArguments(_RID to fromTexture, _RID to toTexture, VECTOR3 to fromPos, VECTOR3 to toPos, VECTOR3 to size, LONG to srcMipmap, LONG to dstMipmap, LONG to srcLayer, LONG to dstLayer, OBJECT to postBarrier)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_TEXTURE_COPY, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun textureClear(
    texture: RID,
    color: Color,
    baseMipmap: Long,
    mipmapCount: Long,
    baseLayer: Long,
    layerCount: Long,
    postBarrier: Long = 7
  ): GodotError {
    TransferContext.writeArguments(_RID to texture, COLOR to color, LONG to baseMipmap, LONG to mipmapCount, LONG to baseLayer, LONG to layerCount, OBJECT to postBarrier)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_TEXTURE_CLEAR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun textureResolveMultisample(
    fromTexture: RID,
    toTexture: RID,
    postBarrier: Long = 7
  ): GodotError {
    TransferContext.writeArguments(_RID to fromTexture, _RID to toTexture, OBJECT to postBarrier)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_TEXTURE_RESOLVE_MULTISAMPLE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun framebufferFormatCreate(attachments: VariantArray<RDAttachmentFormat>, viewCount: Long
      = 1): Long {
    TransferContext.writeArguments(ARRAY to attachments, LONG to viewCount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_FRAMEBUFFER_FORMAT_CREATE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun framebufferFormatCreateMultipass(
    attachments: VariantArray<RDAttachmentFormat>,
    passes: VariantArray<RDFramebufferPass>,
    viewCount: Long = 1
  ): Long {
    TransferContext.writeArguments(ARRAY to attachments, ARRAY to passes, LONG to viewCount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_FRAMEBUFFER_FORMAT_CREATE_MULTIPASS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun framebufferFormatCreateEmpty(samples: TextureSamples =
      RenderingDevice.TextureSamples.TEXTURE_SAMPLES_1): Long {
    TransferContext.writeArguments(LONG to samples.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_FRAMEBUFFER_FORMAT_CREATE_EMPTY, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun framebufferFormatGetTextureSamples(format: Long, renderPass: Long = 0):
      TextureSamples {
    TransferContext.writeArguments(LONG to format, LONG to renderPass)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_FRAMEBUFFER_FORMAT_GET_TEXTURE_SAMPLES, LONG)
    return RenderingDevice.TextureSamples.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun framebufferCreate(
    textures: VariantArray<RID>,
    validateWithFormat: Long = -1,
    viewCount: Long = 1
  ): RID {
    TransferContext.writeArguments(ARRAY to textures, LONG to validateWithFormat, LONG to viewCount)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_FRAMEBUFFER_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun framebufferCreateMultipass(
    textures: VariantArray<RID>,
    passes: VariantArray<RDFramebufferPass>,
    validateWithFormat: Long = -1,
    viewCount: Long = 1
  ): RID {
    TransferContext.writeArguments(ARRAY to textures, ARRAY to passes, LONG to validateWithFormat, LONG to viewCount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_FRAMEBUFFER_CREATE_MULTIPASS, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun framebufferCreateEmpty(
    size: Vector2i,
    samples: TextureSamples = RenderingDevice.TextureSamples.TEXTURE_SAMPLES_1,
    validateWithFormat: Long = -1
  ): RID {
    TransferContext.writeArguments(VECTOR2I to size, LONG to samples.id, LONG to validateWithFormat)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_FRAMEBUFFER_CREATE_EMPTY, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun framebufferGetFormat(framebuffer: RID): Long {
    TransferContext.writeArguments(_RID to framebuffer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_FRAMEBUFFER_GET_FORMAT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun framebufferIsValid(framebuffer: RID): Boolean {
    TransferContext.writeArguments(_RID to framebuffer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_FRAMEBUFFER_IS_VALID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun samplerCreate(state: RDSamplerState): RID {
    TransferContext.writeArguments(OBJECT to state)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_SAMPLER_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun vertexBufferCreate(
    sizeBytes: Long,
    `data`: PackedByteArray = PackedByteArray(),
    useAsStorage: Boolean = false
  ): RID {
    TransferContext.writeArguments(LONG to sizeBytes, PACKED_BYTE_ARRAY to data, BOOL to useAsStorage)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_VERTEX_BUFFER_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun vertexFormatCreate(vertexDescriptions: VariantArray<RDVertexAttribute>): Long {
    TransferContext.writeArguments(ARRAY to vertexDescriptions)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_VERTEX_FORMAT_CREATE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Creates a vertex array based on the specified buffers. Optionally, [offsets] (in bytes) may be defined for each buffer.
   */
  public fun vertexArrayCreate(
    vertexCount: Long,
    vertexFormat: Long,
    srcBuffers: VariantArray<RID>,
    offsets: PackedInt64Array = PackedInt64Array()
  ): RID {
    TransferContext.writeArguments(LONG to vertexCount, LONG to vertexFormat, ARRAY to srcBuffers, PACKED_INT_64_ARRAY to offsets)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_VERTEX_ARRAY_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun indexBufferCreate(
    sizeIndices: Long,
    format: IndexBufferFormat,
    `data`: PackedByteArray = PackedByteArray(),
    useRestartIndices: Boolean = false
  ): RID {
    TransferContext.writeArguments(LONG to sizeIndices, LONG to format.id, PACKED_BYTE_ARRAY to data, BOOL to useRestartIndices)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_INDEX_BUFFER_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun indexArrayCreate(
    indexBuffer: RID,
    indexOffset: Long,
    indexCount: Long
  ): RID {
    TransferContext.writeArguments(_RID to indexBuffer, LONG to indexOffset, LONG to indexCount)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_INDEX_ARRAY_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun shaderCompileSpirvFromSource(shaderSource: RDShaderSource, allowCache: Boolean = true):
      RDShaderSPIRV? {
    TransferContext.writeArguments(OBJECT to shaderSource, BOOL to allowCache)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_SHADER_COMPILE_SPIRV_FROM_SOURCE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as RDShaderSPIRV?
  }

  /**
   *
   */
  public fun shaderCompileBinaryFromSpirv(spirvData: RDShaderSPIRV, name: String = ""):
      PackedByteArray {
    TransferContext.writeArguments(OBJECT to spirvData, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_SHADER_COMPILE_BINARY_FROM_SPIRV,
        PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   *
   */
  public fun shaderCreateFromSpirv(spirvData: RDShaderSPIRV, name: String = ""): RID {
    TransferContext.writeArguments(OBJECT to spirvData, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_SHADER_CREATE_FROM_SPIRV, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun shaderCreateFromBytecode(binaryData: PackedByteArray): RID {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to binaryData)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_SHADER_CREATE_FROM_BYTECODE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun shaderGetVertexInputAttributeMask(shader: RID): Long {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_SHADER_GET_VERTEX_INPUT_ATTRIBUTE_MASK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun uniformBufferCreate(sizeBytes: Long, `data`: PackedByteArray = PackedByteArray()):
      RID {
    TransferContext.writeArguments(LONG to sizeBytes, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_UNIFORM_BUFFER_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun storageBufferCreate(
    sizeBytes: Long,
    `data`: PackedByteArray = PackedByteArray(),
    usage: Long = 0
  ): RID {
    TransferContext.writeArguments(LONG to sizeBytes, PACKED_BYTE_ARRAY to data, OBJECT to usage)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_STORAGE_BUFFER_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun textureBufferCreate(
    sizeBytes: Long,
    format: DataFormat,
    `data`: PackedByteArray = PackedByteArray()
  ): RID {
    TransferContext.writeArguments(LONG to sizeBytes, LONG to format.id, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_TEXTURE_BUFFER_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun uniformSetCreate(
    uniforms: VariantArray<RDUniform>,
    shader: RID,
    shaderSet: Long
  ): RID {
    TransferContext.writeArguments(ARRAY to uniforms, _RID to shader, LONG to shaderSet)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_UNIFORM_SET_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun uniformSetIsValid(uniformSet: RID): Boolean {
    TransferContext.writeArguments(_RID to uniformSet)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_UNIFORM_SET_IS_VALID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun bufferUpdate(
    buffer: RID,
    offset: Long,
    sizeBytes: Long,
    `data`: PackedByteArray,
    postBarrier: Long = 7
  ): GodotError {
    TransferContext.writeArguments(_RID to buffer, LONG to offset, LONG to sizeBytes, PACKED_BYTE_ARRAY to data, OBJECT to postBarrier)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_BUFFER_UPDATE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun bufferClear(
    buffer: RID,
    offset: Long,
    sizeBytes: Long,
    postBarrier: Long = 7
  ): GodotError {
    TransferContext.writeArguments(_RID to buffer, LONG to offset, LONG to sizeBytes, OBJECT to postBarrier)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_BUFFER_CLEAR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun bufferGetData(buffer: RID): PackedByteArray {
    TransferContext.writeArguments(_RID to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_BUFFER_GET_DATA,
        PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   *
   */
  public fun renderPipelineCreate(
    shader: RID,
    framebufferFormat: Long,
    vertexFormat: Long,
    primitive: RenderPrimitive,
    rasterizationState: RDPipelineRasterizationState,
    multisampleState: RDPipelineMultisampleState,
    stencilState: RDPipelineDepthStencilState,
    colorBlendState: RDPipelineColorBlendState,
    dynamicStateFlags: Long = 0,
    forRenderPass: Long = 0,
    specializationConstants: VariantArray<RDPipelineSpecializationConstant> =
        godot.core.variantArrayOf()
  ): RID {
    TransferContext.writeArguments(_RID to shader, LONG to framebufferFormat, LONG to vertexFormat, LONG to primitive.id, OBJECT to rasterizationState, OBJECT to multisampleState, OBJECT to stencilState, OBJECT to colorBlendState, OBJECT to dynamicStateFlags, LONG to forRenderPass, ARRAY to specializationConstants)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_RENDER_PIPELINE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun renderPipelineIsValid(renderPipeline: RID): Boolean {
    TransferContext.writeArguments(_RID to renderPipeline)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_RENDER_PIPELINE_IS_VALID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun computePipelineCreate(shader: RID,
      specializationConstants: VariantArray<RDPipelineSpecializationConstant> =
      godot.core.variantArrayOf()): RID {
    TransferContext.writeArguments(_RID to shader, ARRAY to specializationConstants)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_COMPUTE_PIPELINE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun computePipelineIsValid(computePieline: RID): Boolean {
    TransferContext.writeArguments(_RID to computePieline)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_COMPUTE_PIPELINE_IS_VALID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun screenGetWidth(screen: Long = 0): Long {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_SCREEN_GET_WIDTH,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun screenGetHeight(screen: Long = 0): Long {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_SCREEN_GET_HEIGHT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun screenGetFramebufferFormat(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_SCREEN_GET_FRAMEBUFFER_FORMAT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun drawListBeginForScreen(screen: Long = 0, clearColor: Color = Color(Color(0, 0, 0, 1))):
      Long {
    TransferContext.writeArguments(LONG to screen, COLOR to clearColor)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_BEGIN_FOR_SCREEN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun drawListBegin(
    framebuffer: RID,
    initialColorAction: InitialAction,
    finalColorAction: FinalAction,
    initialDepthAction: InitialAction,
    finalDepthAction: FinalAction,
    clearColorValues: PackedColorArray = PackedColorArray(),
    clearDepth: Double = 1.0,
    clearStencil: Long = 0,
    region: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    storageTextures: VariantArray<Any?> = godot.core.variantArrayOf()
  ): Long {
    TransferContext.writeArguments(_RID to framebuffer, LONG to initialColorAction.id, LONG to finalColorAction.id, LONG to initialDepthAction.id, LONG to finalDepthAction.id, PACKED_COLOR_ARRAY to clearColorValues, DOUBLE to clearDepth, LONG to clearStencil, RECT2 to region, ARRAY to storageTextures)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_BEGIN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun drawListBeginSplit(
    framebuffer: RID,
    splits: Long,
    initialColorAction: InitialAction,
    finalColorAction: FinalAction,
    initialDepthAction: InitialAction,
    finalDepthAction: FinalAction,
    clearColorValues: PackedColorArray = PackedColorArray(),
    clearDepth: Double = 1.0,
    clearStencil: Long = 0,
    region: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    storageTextures: VariantArray<RID> = godot.core.variantArrayOf()
  ): PackedInt64Array {
    TransferContext.writeArguments(_RID to framebuffer, LONG to splits, LONG to initialColorAction.id, LONG to finalColorAction.id, LONG to initialDepthAction.id, LONG to finalDepthAction.id, PACKED_COLOR_ARRAY to clearColorValues, DOUBLE to clearDepth, LONG to clearStencil, RECT2 to region, ARRAY to storageTextures)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_BEGIN_SPLIT, PACKED_INT_64_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array
  }

  /**
   * Sets blend constants for draw list, blend constants are used only if the graphics pipeline is created with [DYNAMIC_STATE_BLEND_CONSTANTS] flag set.
   */
  public fun drawListSetBlendConstants(drawList: Long, color: Color): Unit {
    TransferContext.writeArguments(LONG to drawList, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_SET_BLEND_CONSTANTS, NIL)
  }

  /**
   *
   */
  public fun drawListBindRenderPipeline(drawList: Long, renderPipeline: RID): Unit {
    TransferContext.writeArguments(LONG to drawList, _RID to renderPipeline)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_BIND_RENDER_PIPELINE, NIL)
  }

  /**
   *
   */
  public fun drawListBindUniformSet(
    drawList: Long,
    uniformSet: RID,
    setIndex: Long
  ): Unit {
    TransferContext.writeArguments(LONG to drawList, _RID to uniformSet, LONG to setIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_BIND_UNIFORM_SET, NIL)
  }

  /**
   *
   */
  public fun drawListBindVertexArray(drawList: Long, vertexArray: RID): Unit {
    TransferContext.writeArguments(LONG to drawList, _RID to vertexArray)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_BIND_VERTEX_ARRAY, NIL)
  }

  /**
   *
   */
  public fun drawListBindIndexArray(drawList: Long, indexArray: RID): Unit {
    TransferContext.writeArguments(LONG to drawList, _RID to indexArray)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_BIND_INDEX_ARRAY, NIL)
  }

  /**
   *
   */
  public fun drawListSetPushConstant(
    drawList: Long,
    buffer: PackedByteArray,
    sizeBytes: Long
  ): Unit {
    TransferContext.writeArguments(LONG to drawList, PACKED_BYTE_ARRAY to buffer, LONG to sizeBytes)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_SET_PUSH_CONSTANT, NIL)
  }

  /**
   *
   */
  public fun drawListDraw(
    drawList: Long,
    useIndices: Boolean,
    instances: Long,
    proceduralVertexCount: Long = 0
  ): Unit {
    TransferContext.writeArguments(LONG to drawList, BOOL to useIndices, LONG to instances, LONG to proceduralVertexCount)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_DRAW, NIL)
  }

  /**
   *
   */
  public fun drawListEnableScissor(drawList: Long, rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0)): Unit {
    TransferContext.writeArguments(LONG to drawList, RECT2 to rect)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_ENABLE_SCISSOR, NIL)
  }

  /**
   *
   */
  public fun drawListDisableScissor(drawList: Long): Unit {
    TransferContext.writeArguments(LONG to drawList)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_DISABLE_SCISSOR, NIL)
  }

  /**
   *
   */
  public fun drawListSwitchToNextPass(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_SWITCH_TO_NEXT_PASS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun drawListSwitchToNextPassSplit(splits: Long): PackedInt64Array {
    TransferContext.writeArguments(LONG to splits)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_SWITCH_TO_NEXT_PASS_SPLIT,
        PACKED_INT_64_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array
  }

  /**
   *
   */
  public fun drawListEnd(postBarrier: Long = 7): Unit {
    TransferContext.writeArguments(OBJECT to postBarrier)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_LIST_END, NIL)
  }

  /**
   *
   */
  public fun computeListBegin(allowDrawOverlap: Boolean = false): Long {
    TransferContext.writeArguments(BOOL to allowDrawOverlap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_COMPUTE_LIST_BEGIN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun computeListBindComputePipeline(computeList: Long, computePipeline: RID): Unit {
    TransferContext.writeArguments(LONG to computeList, _RID to computePipeline)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_COMPUTE_LIST_BIND_COMPUTE_PIPELINE, NIL)
  }

  /**
   *
   */
  public fun computeListSetPushConstant(
    computeList: Long,
    buffer: PackedByteArray,
    sizeBytes: Long
  ): Unit {
    TransferContext.writeArguments(LONG to computeList, PACKED_BYTE_ARRAY to buffer, LONG to sizeBytes)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_COMPUTE_LIST_SET_PUSH_CONSTANT, NIL)
  }

  /**
   *
   */
  public fun computeListBindUniformSet(
    computeList: Long,
    uniformSet: RID,
    setIndex: Long
  ): Unit {
    TransferContext.writeArguments(LONG to computeList, _RID to uniformSet, LONG to setIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_COMPUTE_LIST_BIND_UNIFORM_SET, NIL)
  }

  /**
   *
   */
  public fun computeListDispatch(
    computeList: Long,
    xGroups: Long,
    yGroups: Long,
    zGroups: Long
  ): Unit {
    TransferContext.writeArguments(LONG to computeList, LONG to xGroups, LONG to yGroups, LONG to zGroups)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_COMPUTE_LIST_DISPATCH, NIL)
  }

  /**
   *
   */
  public fun computeListAddBarrier(computeList: Long): Unit {
    TransferContext.writeArguments(LONG to computeList)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_COMPUTE_LIST_ADD_BARRIER, NIL)
  }

  /**
   *
   */
  public fun computeListEnd(postBarrier: Long = 7): Unit {
    TransferContext.writeArguments(OBJECT to postBarrier)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_COMPUTE_LIST_END,
        NIL)
  }

  /**
   *
   */
  public fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_FREE_RID, NIL)
  }

  /**
   *
   */
  public fun captureTimestamp(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_CAPTURE_TIMESTAMP,
        NIL)
  }

  /**
   *
   */
  public fun getCapturedTimestampsCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_GET_CAPTURED_TIMESTAMPS_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun getCapturedTimestampsFrame(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_GET_CAPTURED_TIMESTAMPS_FRAME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun getCapturedTimestampGpuTime(index: Long): Long {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_GET_CAPTURED_TIMESTAMP_GPU_TIME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun getCapturedTimestampCpuTime(index: Long): Long {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_GET_CAPTURED_TIMESTAMP_CPU_TIME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun getCapturedTimestampName(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_GET_CAPTURED_TIMESTAMP_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   *
   */
  public fun limitGet(limit: Limit): Long {
    TransferContext.writeArguments(LONG to limit.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_LIMIT_GET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun getFrameDelay(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_GET_FRAME_DELAY,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun submit(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_SUBMIT, NIL)
  }

  /**
   *
   */
  public fun sync(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_SYNC, NIL)
  }

  /**
   *
   */
  public fun barrier(from: Long = 7, to: Long = 7): Unit {
    TransferContext.writeArguments(OBJECT to from, OBJECT to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_BARRIER, NIL)
  }

  /**
   *
   */
  public fun fullBarrier(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_FULL_BARRIER, NIL)
  }

  /**
   *
   */
  public fun createLocalDevice(): RenderingDevice? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_CREATE_LOCAL_DEVICE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as RenderingDevice?
  }

  /**
   *
   */
  public fun setResourceName(id: RID, name: String): Unit {
    TransferContext.writeArguments(_RID to id, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_SET_RESOURCE_NAME,
        NIL)
  }

  /**
   *
   */
  public fun drawCommandBeginLabel(name: String, color: Color): Unit {
    TransferContext.writeArguments(STRING to name, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_COMMAND_BEGIN_LABEL, NIL)
  }

  /**
   *
   */
  public fun drawCommandInsertLabel(name: String, color: Color): Unit {
    TransferContext.writeArguments(STRING to name, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_COMMAND_INSERT_LABEL, NIL)
  }

  /**
   *
   */
  public fun drawCommandEndLabel(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_DRAW_COMMAND_END_LABEL, NIL)
  }

  /**
   *
   */
  public fun getDeviceVendorName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_GET_DEVICE_VENDOR_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   *
   */
  public fun getDeviceName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_GET_DEVICE_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   *
   */
  public fun getDevicePipelineCacheUuid(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_GET_DEVICE_PIPELINE_CACHE_UUID, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   *
   */
  public fun getMemoryUsage(type: MemoryType): Long {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_GET_MEMORY_USAGE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun getDriverResource(
    resource: DriverResource,
    rid: RID,
    index: Long
  ): Long {
    TransferContext.writeArguments(LONG to resource.id, _RID to rid, LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGDEVICE_GET_DRIVER_RESOURCE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class DeviceType(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DriverResource(
    id: Long
  ) {
    /**
     *
     */
    DRIVER_RESOURCE_VULKAN_DEVICE(0),
    /**
     *
     */
    DRIVER_RESOURCE_VULKAN_PHYSICAL_DEVICE(1),
    /**
     *
     */
    DRIVER_RESOURCE_VULKAN_INSTANCE(2),
    /**
     *
     */
    DRIVER_RESOURCE_VULKAN_QUEUE(3),
    /**
     *
     */
    DRIVER_RESOURCE_VULKAN_QUEUE_FAMILY_INDEX(4),
    /**
     *
     */
    DRIVER_RESOURCE_VULKAN_IMAGE(5),
    /**
     *
     */
    DRIVER_RESOURCE_VULKAN_IMAGE_VIEW(6),
    /**
     *
     */
    DRIVER_RESOURCE_VULKAN_IMAGE_NATIVE_TEXTURE_FORMAT(7),
    /**
     *
     */
    DRIVER_RESOURCE_VULKAN_SAMPLER(8),
    /**
     *
     */
    DRIVER_RESOURCE_VULKAN_DESCRIPTOR_SET(9),
    /**
     *
     */
    DRIVER_RESOURCE_VULKAN_BUFFER(10),
    /**
     *
     */
    DRIVER_RESOURCE_VULKAN_COMPUTE_PIPELINE(11),
    /**
     *
     */
    DRIVER_RESOURCE_VULKAN_RENDER_PIPELINE(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DataFormat(
    id: Long
  ) {
    /**
     *
     */
    DATA_FORMAT_R4G4_UNORM_PACK8(0),
    /**
     *
     */
    DATA_FORMAT_R4G4B4A4_UNORM_PACK16(1),
    /**
     *
     */
    DATA_FORMAT_B4G4R4A4_UNORM_PACK16(2),
    /**
     *
     */
    DATA_FORMAT_R5G6B5_UNORM_PACK16(3),
    /**
     *
     */
    DATA_FORMAT_B5G6R5_UNORM_PACK16(4),
    /**
     *
     */
    DATA_FORMAT_R5G5B5A1_UNORM_PACK16(5),
    /**
     *
     */
    DATA_FORMAT_B5G5R5A1_UNORM_PACK16(6),
    /**
     *
     */
    DATA_FORMAT_A1R5G5B5_UNORM_PACK16(7),
    /**
     *
     */
    DATA_FORMAT_R8_UNORM(8),
    /**
     *
     */
    DATA_FORMAT_R8_SNORM(9),
    /**
     *
     */
    DATA_FORMAT_R8_USCALED(10),
    /**
     *
     */
    DATA_FORMAT_R8_SSCALED(11),
    /**
     *
     */
    DATA_FORMAT_R8_UINT(12),
    /**
     *
     */
    DATA_FORMAT_R8_SINT(13),
    /**
     *
     */
    DATA_FORMAT_R8_SRGB(14),
    /**
     *
     */
    DATA_FORMAT_R8G8_UNORM(15),
    /**
     *
     */
    DATA_FORMAT_R8G8_SNORM(16),
    /**
     *
     */
    DATA_FORMAT_R8G8_USCALED(17),
    /**
     *
     */
    DATA_FORMAT_R8G8_SSCALED(18),
    /**
     *
     */
    DATA_FORMAT_R8G8_UINT(19),
    /**
     *
     */
    DATA_FORMAT_R8G8_SINT(20),
    /**
     *
     */
    DATA_FORMAT_R8G8_SRGB(21),
    /**
     *
     */
    DATA_FORMAT_R8G8B8_UNORM(22),
    /**
     *
     */
    DATA_FORMAT_R8G8B8_SNORM(23),
    /**
     *
     */
    DATA_FORMAT_R8G8B8_USCALED(24),
    /**
     *
     */
    DATA_FORMAT_R8G8B8_SSCALED(25),
    /**
     *
     */
    DATA_FORMAT_R8G8B8_UINT(26),
    /**
     *
     */
    DATA_FORMAT_R8G8B8_SINT(27),
    /**
     *
     */
    DATA_FORMAT_R8G8B8_SRGB(28),
    /**
     *
     */
    DATA_FORMAT_B8G8R8_UNORM(29),
    /**
     *
     */
    DATA_FORMAT_B8G8R8_SNORM(30),
    /**
     *
     */
    DATA_FORMAT_B8G8R8_USCALED(31),
    /**
     *
     */
    DATA_FORMAT_B8G8R8_SSCALED(32),
    /**
     *
     */
    DATA_FORMAT_B8G8R8_UINT(33),
    /**
     *
     */
    DATA_FORMAT_B8G8R8_SINT(34),
    /**
     *
     */
    DATA_FORMAT_B8G8R8_SRGB(35),
    /**
     *
     */
    DATA_FORMAT_R8G8B8A8_UNORM(36),
    /**
     *
     */
    DATA_FORMAT_R8G8B8A8_SNORM(37),
    /**
     *
     */
    DATA_FORMAT_R8G8B8A8_USCALED(38),
    /**
     *
     */
    DATA_FORMAT_R8G8B8A8_SSCALED(39),
    /**
     *
     */
    DATA_FORMAT_R8G8B8A8_UINT(40),
    /**
     *
     */
    DATA_FORMAT_R8G8B8A8_SINT(41),
    /**
     *
     */
    DATA_FORMAT_R8G8B8A8_SRGB(42),
    /**
     *
     */
    DATA_FORMAT_B8G8R8A8_UNORM(43),
    /**
     *
     */
    DATA_FORMAT_B8G8R8A8_SNORM(44),
    /**
     *
     */
    DATA_FORMAT_B8G8R8A8_USCALED(45),
    /**
     *
     */
    DATA_FORMAT_B8G8R8A8_SSCALED(46),
    /**
     *
     */
    DATA_FORMAT_B8G8R8A8_UINT(47),
    /**
     *
     */
    DATA_FORMAT_B8G8R8A8_SINT(48),
    /**
     *
     */
    DATA_FORMAT_B8G8R8A8_SRGB(49),
    /**
     *
     */
    DATA_FORMAT_A8B8G8R8_UNORM_PACK32(50),
    /**
     *
     */
    DATA_FORMAT_A8B8G8R8_SNORM_PACK32(51),
    /**
     *
     */
    DATA_FORMAT_A8B8G8R8_USCALED_PACK32(52),
    /**
     *
     */
    DATA_FORMAT_A8B8G8R8_SSCALED_PACK32(53),
    /**
     *
     */
    DATA_FORMAT_A8B8G8R8_UINT_PACK32(54),
    /**
     *
     */
    DATA_FORMAT_A8B8G8R8_SINT_PACK32(55),
    /**
     *
     */
    DATA_FORMAT_A8B8G8R8_SRGB_PACK32(56),
    /**
     *
     */
    DATA_FORMAT_A2R10G10B10_UNORM_PACK32(57),
    /**
     *
     */
    DATA_FORMAT_A2R10G10B10_SNORM_PACK32(58),
    /**
     *
     */
    DATA_FORMAT_A2R10G10B10_USCALED_PACK32(59),
    /**
     *
     */
    DATA_FORMAT_A2R10G10B10_SSCALED_PACK32(60),
    /**
     *
     */
    DATA_FORMAT_A2R10G10B10_UINT_PACK32(61),
    /**
     *
     */
    DATA_FORMAT_A2R10G10B10_SINT_PACK32(62),
    /**
     *
     */
    DATA_FORMAT_A2B10G10R10_UNORM_PACK32(63),
    /**
     *
     */
    DATA_FORMAT_A2B10G10R10_SNORM_PACK32(64),
    /**
     *
     */
    DATA_FORMAT_A2B10G10R10_USCALED_PACK32(65),
    /**
     *
     */
    DATA_FORMAT_A2B10G10R10_SSCALED_PACK32(66),
    /**
     *
     */
    DATA_FORMAT_A2B10G10R10_UINT_PACK32(67),
    /**
     *
     */
    DATA_FORMAT_A2B10G10R10_SINT_PACK32(68),
    /**
     *
     */
    DATA_FORMAT_R16_UNORM(69),
    /**
     *
     */
    DATA_FORMAT_R16_SNORM(70),
    /**
     *
     */
    DATA_FORMAT_R16_USCALED(71),
    /**
     *
     */
    DATA_FORMAT_R16_SSCALED(72),
    /**
     *
     */
    DATA_FORMAT_R16_UINT(73),
    /**
     *
     */
    DATA_FORMAT_R16_SINT(74),
    /**
     *
     */
    DATA_FORMAT_R16_SFLOAT(75),
    /**
     *
     */
    DATA_FORMAT_R16G16_UNORM(76),
    /**
     *
     */
    DATA_FORMAT_R16G16_SNORM(77),
    /**
     *
     */
    DATA_FORMAT_R16G16_USCALED(78),
    /**
     *
     */
    DATA_FORMAT_R16G16_SSCALED(79),
    /**
     *
     */
    DATA_FORMAT_R16G16_UINT(80),
    /**
     *
     */
    DATA_FORMAT_R16G16_SINT(81),
    /**
     *
     */
    DATA_FORMAT_R16G16_SFLOAT(82),
    /**
     *
     */
    DATA_FORMAT_R16G16B16_UNORM(83),
    /**
     *
     */
    DATA_FORMAT_R16G16B16_SNORM(84),
    /**
     *
     */
    DATA_FORMAT_R16G16B16_USCALED(85),
    /**
     *
     */
    DATA_FORMAT_R16G16B16_SSCALED(86),
    /**
     *
     */
    DATA_FORMAT_R16G16B16_UINT(87),
    /**
     *
     */
    DATA_FORMAT_R16G16B16_SINT(88),
    /**
     *
     */
    DATA_FORMAT_R16G16B16_SFLOAT(89),
    /**
     *
     */
    DATA_FORMAT_R16G16B16A16_UNORM(90),
    /**
     *
     */
    DATA_FORMAT_R16G16B16A16_SNORM(91),
    /**
     *
     */
    DATA_FORMAT_R16G16B16A16_USCALED(92),
    /**
     *
     */
    DATA_FORMAT_R16G16B16A16_SSCALED(93),
    /**
     *
     */
    DATA_FORMAT_R16G16B16A16_UINT(94),
    /**
     *
     */
    DATA_FORMAT_R16G16B16A16_SINT(95),
    /**
     *
     */
    DATA_FORMAT_R16G16B16A16_SFLOAT(96),
    /**
     *
     */
    DATA_FORMAT_R32_UINT(97),
    /**
     *
     */
    DATA_FORMAT_R32_SINT(98),
    /**
     *
     */
    DATA_FORMAT_R32_SFLOAT(99),
    /**
     *
     */
    DATA_FORMAT_R32G32_UINT(100),
    /**
     *
     */
    DATA_FORMAT_R32G32_SINT(101),
    /**
     *
     */
    DATA_FORMAT_R32G32_SFLOAT(102),
    /**
     *
     */
    DATA_FORMAT_R32G32B32_UINT(103),
    /**
     *
     */
    DATA_FORMAT_R32G32B32_SINT(104),
    /**
     *
     */
    DATA_FORMAT_R32G32B32_SFLOAT(105),
    /**
     *
     */
    DATA_FORMAT_R32G32B32A32_UINT(106),
    /**
     *
     */
    DATA_FORMAT_R32G32B32A32_SINT(107),
    /**
     *
     */
    DATA_FORMAT_R32G32B32A32_SFLOAT(108),
    /**
     *
     */
    DATA_FORMAT_R64_UINT(109),
    /**
     *
     */
    DATA_FORMAT_R64_SINT(110),
    /**
     *
     */
    DATA_FORMAT_R64_SFLOAT(111),
    /**
     *
     */
    DATA_FORMAT_R64G64_UINT(112),
    /**
     *
     */
    DATA_FORMAT_R64G64_SINT(113),
    /**
     *
     */
    DATA_FORMAT_R64G64_SFLOAT(114),
    /**
     *
     */
    DATA_FORMAT_R64G64B64_UINT(115),
    /**
     *
     */
    DATA_FORMAT_R64G64B64_SINT(116),
    /**
     *
     */
    DATA_FORMAT_R64G64B64_SFLOAT(117),
    /**
     *
     */
    DATA_FORMAT_R64G64B64A64_UINT(118),
    /**
     *
     */
    DATA_FORMAT_R64G64B64A64_SINT(119),
    /**
     *
     */
    DATA_FORMAT_R64G64B64A64_SFLOAT(120),
    /**
     *
     */
    DATA_FORMAT_B10G11R11_UFLOAT_PACK32(121),
    /**
     *
     */
    DATA_FORMAT_E5B9G9R9_UFLOAT_PACK32(122),
    /**
     *
     */
    DATA_FORMAT_D16_UNORM(123),
    /**
     *
     */
    DATA_FORMAT_X8_D24_UNORM_PACK32(124),
    /**
     *
     */
    DATA_FORMAT_D32_SFLOAT(125),
    /**
     *
     */
    DATA_FORMAT_S8_UINT(126),
    /**
     *
     */
    DATA_FORMAT_D16_UNORM_S8_UINT(127),
    /**
     *
     */
    DATA_FORMAT_D24_UNORM_S8_UINT(128),
    /**
     *
     */
    DATA_FORMAT_D32_SFLOAT_S8_UINT(129),
    /**
     *
     */
    DATA_FORMAT_BC1_RGB_UNORM_BLOCK(130),
    /**
     *
     */
    DATA_FORMAT_BC1_RGB_SRGB_BLOCK(131),
    /**
     *
     */
    DATA_FORMAT_BC1_RGBA_UNORM_BLOCK(132),
    /**
     *
     */
    DATA_FORMAT_BC1_RGBA_SRGB_BLOCK(133),
    /**
     *
     */
    DATA_FORMAT_BC2_UNORM_BLOCK(134),
    /**
     *
     */
    DATA_FORMAT_BC2_SRGB_BLOCK(135),
    /**
     *
     */
    DATA_FORMAT_BC3_UNORM_BLOCK(136),
    /**
     *
     */
    DATA_FORMAT_BC3_SRGB_BLOCK(137),
    /**
     *
     */
    DATA_FORMAT_BC4_UNORM_BLOCK(138),
    /**
     *
     */
    DATA_FORMAT_BC4_SNORM_BLOCK(139),
    /**
     *
     */
    DATA_FORMAT_BC5_UNORM_BLOCK(140),
    /**
     *
     */
    DATA_FORMAT_BC5_SNORM_BLOCK(141),
    /**
     *
     */
    DATA_FORMAT_BC6H_UFLOAT_BLOCK(142),
    /**
     *
     */
    DATA_FORMAT_BC6H_SFLOAT_BLOCK(143),
    /**
     *
     */
    DATA_FORMAT_BC7_UNORM_BLOCK(144),
    /**
     *
     */
    DATA_FORMAT_BC7_SRGB_BLOCK(145),
    /**
     *
     */
    DATA_FORMAT_ETC2_R8G8B8_UNORM_BLOCK(146),
    /**
     *
     */
    DATA_FORMAT_ETC2_R8G8B8_SRGB_BLOCK(147),
    /**
     *
     */
    DATA_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK(148),
    /**
     *
     */
    DATA_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK(149),
    /**
     *
     */
    DATA_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK(150),
    /**
     *
     */
    DATA_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK(151),
    /**
     *
     */
    DATA_FORMAT_EAC_R11_UNORM_BLOCK(152),
    /**
     *
     */
    DATA_FORMAT_EAC_R11_SNORM_BLOCK(153),
    /**
     *
     */
    DATA_FORMAT_EAC_R11G11_UNORM_BLOCK(154),
    /**
     *
     */
    DATA_FORMAT_EAC_R11G11_SNORM_BLOCK(155),
    /**
     *
     */
    DATA_FORMAT_ASTC_4x4_UNORM_BLOCK(156),
    /**
     *
     */
    DATA_FORMAT_ASTC_4x4_SRGB_BLOCK(157),
    /**
     *
     */
    DATA_FORMAT_ASTC_5x4_UNORM_BLOCK(158),
    /**
     *
     */
    DATA_FORMAT_ASTC_5x4_SRGB_BLOCK(159),
    /**
     *
     */
    DATA_FORMAT_ASTC_5x5_UNORM_BLOCK(160),
    /**
     *
     */
    DATA_FORMAT_ASTC_5x5_SRGB_BLOCK(161),
    /**
     *
     */
    DATA_FORMAT_ASTC_6x5_UNORM_BLOCK(162),
    /**
     *
     */
    DATA_FORMAT_ASTC_6x5_SRGB_BLOCK(163),
    /**
     *
     */
    DATA_FORMAT_ASTC_6x6_UNORM_BLOCK(164),
    /**
     *
     */
    DATA_FORMAT_ASTC_6x6_SRGB_BLOCK(165),
    /**
     *
     */
    DATA_FORMAT_ASTC_8x5_UNORM_BLOCK(166),
    /**
     *
     */
    DATA_FORMAT_ASTC_8x5_SRGB_BLOCK(167),
    /**
     *
     */
    DATA_FORMAT_ASTC_8x6_UNORM_BLOCK(168),
    /**
     *
     */
    DATA_FORMAT_ASTC_8x6_SRGB_BLOCK(169),
    /**
     *
     */
    DATA_FORMAT_ASTC_8x8_UNORM_BLOCK(170),
    /**
     *
     */
    DATA_FORMAT_ASTC_8x8_SRGB_BLOCK(171),
    /**
     *
     */
    DATA_FORMAT_ASTC_10x5_UNORM_BLOCK(172),
    /**
     *
     */
    DATA_FORMAT_ASTC_10x5_SRGB_BLOCK(173),
    /**
     *
     */
    DATA_FORMAT_ASTC_10x6_UNORM_BLOCK(174),
    /**
     *
     */
    DATA_FORMAT_ASTC_10x6_SRGB_BLOCK(175),
    /**
     *
     */
    DATA_FORMAT_ASTC_10x8_UNORM_BLOCK(176),
    /**
     *
     */
    DATA_FORMAT_ASTC_10x8_SRGB_BLOCK(177),
    /**
     *
     */
    DATA_FORMAT_ASTC_10x10_UNORM_BLOCK(178),
    /**
     *
     */
    DATA_FORMAT_ASTC_10x10_SRGB_BLOCK(179),
    /**
     *
     */
    DATA_FORMAT_ASTC_12x10_UNORM_BLOCK(180),
    /**
     *
     */
    DATA_FORMAT_ASTC_12x10_SRGB_BLOCK(181),
    /**
     *
     */
    DATA_FORMAT_ASTC_12x12_UNORM_BLOCK(182),
    /**
     *
     */
    DATA_FORMAT_ASTC_12x12_SRGB_BLOCK(183),
    /**
     *
     */
    DATA_FORMAT_G8B8G8R8_422_UNORM(184),
    /**
     *
     */
    DATA_FORMAT_B8G8R8G8_422_UNORM(185),
    /**
     *
     */
    DATA_FORMAT_G8_B8_R8_3PLANE_420_UNORM(186),
    /**
     *
     */
    DATA_FORMAT_G8_B8R8_2PLANE_420_UNORM(187),
    /**
     *
     */
    DATA_FORMAT_G8_B8_R8_3PLANE_422_UNORM(188),
    /**
     *
     */
    DATA_FORMAT_G8_B8R8_2PLANE_422_UNORM(189),
    /**
     *
     */
    DATA_FORMAT_G8_B8_R8_3PLANE_444_UNORM(190),
    /**
     *
     */
    DATA_FORMAT_R10X6_UNORM_PACK16(191),
    /**
     *
     */
    DATA_FORMAT_R10X6G10X6_UNORM_2PACK16(192),
    /**
     *
     */
    DATA_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16(193),
    /**
     *
     */
    DATA_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16(194),
    /**
     *
     */
    DATA_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16(195),
    /**
     *
     */
    DATA_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16(196),
    /**
     *
     */
    DATA_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16(197),
    /**
     *
     */
    DATA_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16(198),
    /**
     *
     */
    DATA_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16(199),
    /**
     *
     */
    DATA_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16(200),
    /**
     *
     */
    DATA_FORMAT_R12X4_UNORM_PACK16(201),
    /**
     *
     */
    DATA_FORMAT_R12X4G12X4_UNORM_2PACK16(202),
    /**
     *
     */
    DATA_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16(203),
    /**
     *
     */
    DATA_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16(204),
    /**
     *
     */
    DATA_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16(205),
    /**
     *
     */
    DATA_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16(206),
    /**
     *
     */
    DATA_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16(207),
    /**
     *
     */
    DATA_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16(208),
    /**
     *
     */
    DATA_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16(209),
    /**
     *
     */
    DATA_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16(210),
    /**
     *
     */
    DATA_FORMAT_G16B16G16R16_422_UNORM(211),
    /**
     *
     */
    DATA_FORMAT_B16G16R16G16_422_UNORM(212),
    /**
     *
     */
    DATA_FORMAT_G16_B16_R16_3PLANE_420_UNORM(213),
    /**
     *
     */
    DATA_FORMAT_G16_B16R16_2PLANE_420_UNORM(214),
    /**
     *
     */
    DATA_FORMAT_G16_B16_R16_3PLANE_422_UNORM(215),
    /**
     *
     */
    DATA_FORMAT_G16_B16R16_2PLANE_422_UNORM(216),
    /**
     *
     */
    DATA_FORMAT_G16_B16_R16_3PLANE_444_UNORM(217),
    /**
     *
     */
    DATA_FORMAT_MAX(218),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BarrierMask(
    id: Long
  ) {
    /**
     *
     */
    BARRIER_MASK_RASTER(1),
    /**
     *
     */
    BARRIER_MASK_COMPUTE(2),
    /**
     *
     */
    BARRIER_MASK_TRANSFER(4),
    /**
     *
     */
    BARRIER_MASK_ALL_BARRIERS(7),
    /**
     *
     */
    BARRIER_MASK_NO_BARRIER(8),
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
    id: Long
  ) {
    /**
     *
     */
    TEXTURE_TYPE_1D(0),
    /**
     *
     */
    TEXTURE_TYPE_2D(1),
    /**
     *
     */
    TEXTURE_TYPE_3D(2),
    /**
     *
     */
    TEXTURE_TYPE_CUBE(3),
    /**
     *
     */
    TEXTURE_TYPE_1D_ARRAY(4),
    /**
     *
     */
    TEXTURE_TYPE_2D_ARRAY(5),
    /**
     *
     */
    TEXTURE_TYPE_CUBE_ARRAY(6),
    /**
     *
     */
    TEXTURE_TYPE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TextureSamples(
    id: Long
  ) {
    /**
     *
     */
    TEXTURE_SAMPLES_1(0),
    /**
     *
     */
    TEXTURE_SAMPLES_2(1),
    /**
     *
     */
    TEXTURE_SAMPLES_4(2),
    /**
     *
     */
    TEXTURE_SAMPLES_8(3),
    /**
     *
     */
    TEXTURE_SAMPLES_16(4),
    /**
     *
     */
    TEXTURE_SAMPLES_32(5),
    /**
     *
     */
    TEXTURE_SAMPLES_64(6),
    /**
     *
     */
    TEXTURE_SAMPLES_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TextureUsageBits(
    id: Long
  ) {
    /**
     *
     */
    TEXTURE_USAGE_SAMPLING_BIT(1),
    /**
     *
     */
    TEXTURE_USAGE_COLOR_ATTACHMENT_BIT(2),
    /**
     *
     */
    TEXTURE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT(4),
    /**
     *
     */
    TEXTURE_USAGE_STORAGE_BIT(8),
    /**
     *
     */
    TEXTURE_USAGE_STORAGE_ATOMIC_BIT(16),
    /**
     *
     */
    TEXTURE_USAGE_CPU_READ_BIT(32),
    /**
     *
     */
    TEXTURE_USAGE_CAN_UPDATE_BIT(64),
    /**
     *
     */
    TEXTURE_USAGE_CAN_COPY_FROM_BIT(128),
    /**
     *
     */
    TEXTURE_USAGE_CAN_COPY_TO_BIT(256),
    /**
     *
     */
    TEXTURE_USAGE_INPUT_ATTACHMENT_BIT(512),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TextureSwizzle(
    id: Long
  ) {
    /**
     *
     */
    TEXTURE_SWIZZLE_IDENTITY(0),
    /**
     *
     */
    TEXTURE_SWIZZLE_ZERO(1),
    /**
     *
     */
    TEXTURE_SWIZZLE_ONE(2),
    /**
     *
     */
    TEXTURE_SWIZZLE_R(3),
    /**
     *
     */
    TEXTURE_SWIZZLE_G(4),
    /**
     *
     */
    TEXTURE_SWIZZLE_B(5),
    /**
     *
     */
    TEXTURE_SWIZZLE_A(6),
    /**
     *
     */
    TEXTURE_SWIZZLE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TextureSliceType(
    id: Long
  ) {
    /**
     *
     */
    TEXTURE_SLICE_2D(0),
    /**
     *
     */
    TEXTURE_SLICE_CUBEMAP(1),
    /**
     *
     */
    TEXTURE_SLICE_3D(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SamplerFilter(
    id: Long
  ) {
    /**
     *
     */
    SAMPLER_FILTER_NEAREST(0),
    /**
     *
     */
    SAMPLER_FILTER_LINEAR(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SamplerRepeatMode(
    id: Long
  ) {
    /**
     *
     */
    SAMPLER_REPEAT_MODE_REPEAT(0),
    /**
     *
     */
    SAMPLER_REPEAT_MODE_MIRRORED_REPEAT(1),
    /**
     *
     */
    SAMPLER_REPEAT_MODE_CLAMP_TO_EDGE(2),
    /**
     *
     */
    SAMPLER_REPEAT_MODE_CLAMP_TO_BORDER(3),
    /**
     *
     */
    SAMPLER_REPEAT_MODE_MIRROR_CLAMP_TO_EDGE(4),
    /**
     *
     */
    SAMPLER_REPEAT_MODE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SamplerBorderColor(
    id: Long
  ) {
    /**
     *
     */
    SAMPLER_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK(0),
    /**
     *
     */
    SAMPLER_BORDER_COLOR_INT_TRANSPARENT_BLACK(1),
    /**
     *
     */
    SAMPLER_BORDER_COLOR_FLOAT_OPAQUE_BLACK(2),
    /**
     *
     */
    SAMPLER_BORDER_COLOR_INT_OPAQUE_BLACK(3),
    /**
     *
     */
    SAMPLER_BORDER_COLOR_FLOAT_OPAQUE_WHITE(4),
    /**
     *
     */
    SAMPLER_BORDER_COLOR_INT_OPAQUE_WHITE(5),
    /**
     *
     */
    SAMPLER_BORDER_COLOR_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class VertexFrequency(
    id: Long
  ) {
    /**
     *
     */
    VERTEX_FREQUENCY_VERTEX(0),
    /**
     *
     */
    VERTEX_FREQUENCY_INSTANCE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class IndexBufferFormat(
    id: Long
  ) {
    /**
     *
     */
    INDEX_BUFFER_FORMAT_UINT16(0),
    /**
     *
     */
    INDEX_BUFFER_FORMAT_UINT32(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class StorageBufferUsage(
    id: Long
  ) {
    /**
     *
     */
    STORAGE_BUFFER_USAGE_DISPATCH_INDIRECT(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class UniformType(
    id: Long
  ) {
    /**
     *
     */
    UNIFORM_TYPE_SAMPLER(0),
    /**
     *
     */
    UNIFORM_TYPE_SAMPLER_WITH_TEXTURE(1),
    /**
     *
     */
    UNIFORM_TYPE_TEXTURE(2),
    /**
     *
     */
    UNIFORM_TYPE_IMAGE(3),
    /**
     *
     */
    UNIFORM_TYPE_TEXTURE_BUFFER(4),
    /**
     *
     */
    UNIFORM_TYPE_SAMPLER_WITH_TEXTURE_BUFFER(5),
    /**
     *
     */
    UNIFORM_TYPE_IMAGE_BUFFER(6),
    /**
     *
     */
    UNIFORM_TYPE_UNIFORM_BUFFER(7),
    /**
     *
     */
    UNIFORM_TYPE_STORAGE_BUFFER(8),
    /**
     *
     */
    UNIFORM_TYPE_INPUT_ATTACHMENT(9),
    /**
     *
     */
    UNIFORM_TYPE_MAX(10),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class RenderPrimitive(
    id: Long
  ) {
    /**
     *
     */
    RENDER_PRIMITIVE_POINTS(0),
    /**
     *
     */
    RENDER_PRIMITIVE_LINES(1),
    /**
     *
     */
    RENDER_PRIMITIVE_LINES_WITH_ADJACENCY(2),
    /**
     *
     */
    RENDER_PRIMITIVE_LINESTRIPS(3),
    /**
     *
     */
    RENDER_PRIMITIVE_LINESTRIPS_WITH_ADJACENCY(4),
    /**
     *
     */
    RENDER_PRIMITIVE_TRIANGLES(5),
    /**
     *
     */
    RENDER_PRIMITIVE_TRIANGLES_WITH_ADJACENCY(6),
    /**
     *
     */
    RENDER_PRIMITIVE_TRIANGLE_STRIPS(7),
    /**
     *
     */
    RENDER_PRIMITIVE_TRIANGLE_STRIPS_WITH_AJACENCY(8),
    /**
     *
     */
    RENDER_PRIMITIVE_TRIANGLE_STRIPS_WITH_RESTART_INDEX(9),
    /**
     *
     */
    RENDER_PRIMITIVE_TESSELATION_PATCH(10),
    /**
     *
     */
    RENDER_PRIMITIVE_MAX(11),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class PolygonCullMode(
    id: Long
  ) {
    /**
     *
     */
    POLYGON_CULL_DISABLED(0),
    /**
     *
     */
    POLYGON_CULL_FRONT(1),
    /**
     *
     */
    POLYGON_CULL_BACK(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class PolygonFrontFace(
    id: Long
  ) {
    /**
     *
     */
    POLYGON_FRONT_FACE_CLOCKWISE(0),
    /**
     *
     */
    POLYGON_FRONT_FACE_COUNTER_CLOCKWISE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class StencilOperation(
    id: Long
  ) {
    /**
     *
     */
    STENCIL_OP_KEEP(0),
    /**
     *
     */
    STENCIL_OP_ZERO(1),
    /**
     *
     */
    STENCIL_OP_REPLACE(2),
    /**
     *
     */
    STENCIL_OP_INCREMENT_AND_CLAMP(3),
    /**
     *
     */
    STENCIL_OP_DECREMENT_AND_CLAMP(4),
    /**
     *
     */
    STENCIL_OP_INVERT(5),
    /**
     *
     */
    STENCIL_OP_INCREMENT_AND_WRAP(6),
    /**
     *
     */
    STENCIL_OP_DECREMENT_AND_WRAP(7),
    /**
     *
     */
    STENCIL_OP_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CompareOperator(
    id: Long
  ) {
    /**
     *
     */
    COMPARE_OP_NEVER(0),
    /**
     *
     */
    COMPARE_OP_LESS(1),
    /**
     *
     */
    COMPARE_OP_EQUAL(2),
    /**
     *
     */
    COMPARE_OP_LESS_OR_EQUAL(3),
    /**
     *
     */
    COMPARE_OP_GREATER(4),
    /**
     *
     */
    COMPARE_OP_NOT_EQUAL(5),
    /**
     *
     */
    COMPARE_OP_GREATER_OR_EQUAL(6),
    /**
     *
     */
    COMPARE_OP_ALWAYS(7),
    /**
     *
     */
    COMPARE_OP_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LogicOperation(
    id: Long
  ) {
    /**
     *
     */
    LOGIC_OP_CLEAR(0),
    /**
     *
     */
    LOGIC_OP_AND(1),
    /**
     *
     */
    LOGIC_OP_AND_REVERSE(2),
    /**
     *
     */
    LOGIC_OP_COPY(3),
    /**
     *
     */
    LOGIC_OP_AND_INVERTED(4),
    /**
     *
     */
    LOGIC_OP_NO_OP(5),
    /**
     *
     */
    LOGIC_OP_XOR(6),
    /**
     *
     */
    LOGIC_OP_OR(7),
    /**
     *
     */
    LOGIC_OP_NOR(8),
    /**
     *
     */
    LOGIC_OP_EQUIVALENT(9),
    /**
     *
     */
    LOGIC_OP_INVERT(10),
    /**
     *
     */
    LOGIC_OP_OR_REVERSE(11),
    /**
     *
     */
    LOGIC_OP_COPY_INVERTED(12),
    /**
     *
     */
    LOGIC_OP_OR_INVERTED(13),
    /**
     *
     */
    LOGIC_OP_NAND(14),
    /**
     *
     */
    LOGIC_OP_SET(15),
    /**
     *
     */
    LOGIC_OP_MAX(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BlendFactor(
    id: Long
  ) {
    /**
     *
     */
    BLEND_FACTOR_ZERO(0),
    /**
     *
     */
    BLEND_FACTOR_ONE(1),
    /**
     *
     */
    BLEND_FACTOR_SRC_COLOR(2),
    /**
     *
     */
    BLEND_FACTOR_ONE_MINUS_SRC_COLOR(3),
    /**
     *
     */
    BLEND_FACTOR_DST_COLOR(4),
    /**
     *
     */
    BLEND_FACTOR_ONE_MINUS_DST_COLOR(5),
    /**
     *
     */
    BLEND_FACTOR_SRC_ALPHA(6),
    /**
     *
     */
    BLEND_FACTOR_ONE_MINUS_SRC_ALPHA(7),
    /**
     *
     */
    BLEND_FACTOR_DST_ALPHA(8),
    /**
     *
     */
    BLEND_FACTOR_ONE_MINUS_DST_ALPHA(9),
    /**
     *
     */
    BLEND_FACTOR_CONSTANT_COLOR(10),
    /**
     *
     */
    BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR(11),
    /**
     *
     */
    BLEND_FACTOR_CONSTANT_ALPHA(12),
    /**
     *
     */
    BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA(13),
    /**
     *
     */
    BLEND_FACTOR_SRC_ALPHA_SATURATE(14),
    /**
     *
     */
    BLEND_FACTOR_SRC1_COLOR(15),
    /**
     *
     */
    BLEND_FACTOR_ONE_MINUS_SRC1_COLOR(16),
    /**
     *
     */
    BLEND_FACTOR_SRC1_ALPHA(17),
    /**
     *
     */
    BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA(18),
    /**
     *
     */
    BLEND_FACTOR_MAX(19),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BlendOperation(
    id: Long
  ) {
    /**
     *
     */
    BLEND_OP_ADD(0),
    /**
     *
     */
    BLEND_OP_SUBTRACT(1),
    /**
     *
     */
    BLEND_OP_REVERSE_SUBTRACT(2),
    /**
     *
     */
    BLEND_OP_MINIMUM(3),
    /**
     *
     */
    BLEND_OP_MAXIMUM(4),
    /**
     *
     */
    BLEND_OP_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class PipelineDynamicStateFlags(
    id: Long
  ) {
    /**
     *
     */
    DYNAMIC_STATE_LINE_WIDTH(1),
    /**
     *
     */
    DYNAMIC_STATE_DEPTH_BIAS(2),
    /**
     *
     */
    DYNAMIC_STATE_BLEND_CONSTANTS(4),
    /**
     *
     */
    DYNAMIC_STATE_DEPTH_BOUNDS(8),
    /**
     *
     */
    DYNAMIC_STATE_STENCIL_COMPARE_MASK(16),
    /**
     *
     */
    DYNAMIC_STATE_STENCIL_WRITE_MASK(32),
    /**
     *
     */
    DYNAMIC_STATE_STENCIL_REFERENCE(64),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class InitialAction(
    id: Long
  ) {
    /**
     *
     */
    INITIAL_ACTION_CLEAR(0),
    /**
     *
     */
    INITIAL_ACTION_CLEAR_REGION(1),
    /**
     *
     */
    INITIAL_ACTION_CLEAR_REGION_CONTINUE(2),
    /**
     *
     */
    INITIAL_ACTION_KEEP(3),
    /**
     *
     */
    INITIAL_ACTION_DROP(4),
    /**
     *
     */
    INITIAL_ACTION_CONTINUE(5),
    /**
     *
     */
    INITIAL_ACTION_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class FinalAction(
    id: Long
  ) {
    /**
     *
     */
    FINAL_ACTION_READ(0),
    /**
     *
     */
    FINAL_ACTION_DISCARD(1),
    /**
     *
     */
    FINAL_ACTION_CONTINUE(2),
    /**
     *
     */
    FINAL_ACTION_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ShaderStage(
    id: Long
  ) {
    /**
     *
     */
    SHADER_STAGE_VERTEX(0),
    /**
     *
     */
    SHADER_STAGE_FRAGMENT(1),
    /**
     *
     */
    SHADER_STAGE_TESSELATION_CONTROL(2),
    /**
     *
     */
    SHADER_STAGE_TESSELATION_EVALUATION(3),
    /**
     *
     */
    SHADER_STAGE_COMPUTE(4),
    /**
     *
     */
    SHADER_STAGE_MAX(5),
    /**
     *
     */
    SHADER_STAGE_VERTEX_BIT(1),
    /**
     *
     */
    SHADER_STAGE_FRAGMENT_BIT(2),
    /**
     *
     */
    SHADER_STAGE_TESSELATION_CONTROL_BIT(4),
    /**
     *
     */
    SHADER_STAGE_TESSELATION_EVALUATION_BIT(8),
    /**
     *
     */
    SHADER_STAGE_COMPUTE_BIT(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ShaderLanguage(
    id: Long
  ) {
    /**
     *
     */
    SHADER_LANGUAGE_GLSL(0),
    /**
     *
     */
    SHADER_LANGUAGE_HLSL(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class PipelineSpecializationConstantType(
    id: Long
  ) {
    /**
     *
     */
    PIPELINE_SPECIALIZATION_CONSTANT_TYPE_BOOL(0),
    /**
     *
     */
    PIPELINE_SPECIALIZATION_CONSTANT_TYPE_INT(1),
    /**
     *
     */
    PIPELINE_SPECIALIZATION_CONSTANT_TYPE_FLOAT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Limit(
    id: Long
  ) {
    /**
     *
     */
    LIMIT_MAX_BOUND_UNIFORM_SETS(0),
    /**
     *
     */
    LIMIT_MAX_FRAMEBUFFER_COLOR_ATTACHMENTS(1),
    /**
     *
     */
    LIMIT_MAX_TEXTURES_PER_UNIFORM_SET(2),
    /**
     *
     */
    LIMIT_MAX_SAMPLERS_PER_UNIFORM_SET(3),
    /**
     *
     */
    LIMIT_MAX_STORAGE_BUFFERS_PER_UNIFORM_SET(4),
    /**
     *
     */
    LIMIT_MAX_STORAGE_IMAGES_PER_UNIFORM_SET(5),
    /**
     *
     */
    LIMIT_MAX_UNIFORM_BUFFERS_PER_UNIFORM_SET(6),
    /**
     *
     */
    LIMIT_MAX_DRAW_INDEXED_INDEX(7),
    /**
     *
     */
    LIMIT_MAX_FRAMEBUFFER_HEIGHT(8),
    /**
     *
     */
    LIMIT_MAX_FRAMEBUFFER_WIDTH(9),
    /**
     *
     */
    LIMIT_MAX_TEXTURE_ARRAY_LAYERS(10),
    /**
     *
     */
    LIMIT_MAX_TEXTURE_SIZE_1D(11),
    /**
     *
     */
    LIMIT_MAX_TEXTURE_SIZE_2D(12),
    /**
     *
     */
    LIMIT_MAX_TEXTURE_SIZE_3D(13),
    /**
     *
     */
    LIMIT_MAX_TEXTURE_SIZE_CUBE(14),
    /**
     *
     */
    LIMIT_MAX_TEXTURES_PER_SHADER_STAGE(15),
    /**
     *
     */
    LIMIT_MAX_SAMPLERS_PER_SHADER_STAGE(16),
    /**
     *
     */
    LIMIT_MAX_STORAGE_BUFFERS_PER_SHADER_STAGE(17),
    /**
     *
     */
    LIMIT_MAX_STORAGE_IMAGES_PER_SHADER_STAGE(18),
    /**
     *
     */
    LIMIT_MAX_UNIFORM_BUFFERS_PER_SHADER_STAGE(19),
    /**
     *
     */
    LIMIT_MAX_PUSH_CONSTANT_SIZE(20),
    /**
     *
     */
    LIMIT_MAX_UNIFORM_BUFFER_SIZE(21),
    /**
     *
     */
    LIMIT_MAX_VERTEX_INPUT_ATTRIBUTE_OFFSET(22),
    /**
     *
     */
    LIMIT_MAX_VERTEX_INPUT_ATTRIBUTES(23),
    /**
     *
     */
    LIMIT_MAX_VERTEX_INPUT_BINDINGS(24),
    /**
     *
     */
    LIMIT_MAX_VERTEX_INPUT_BINDING_STRIDE(25),
    /**
     *
     */
    LIMIT_MIN_UNIFORM_BUFFER_OFFSET_ALIGNMENT(26),
    /**
     *
     */
    LIMIT_MAX_COMPUTE_SHARED_MEMORY_SIZE(27),
    /**
     *
     */
    LIMIT_MAX_COMPUTE_WORKGROUP_COUNT_X(28),
    /**
     *
     */
    LIMIT_MAX_COMPUTE_WORKGROUP_COUNT_Y(29),
    /**
     *
     */
    LIMIT_MAX_COMPUTE_WORKGROUP_COUNT_Z(30),
    /**
     *
     */
    LIMIT_MAX_COMPUTE_WORKGROUP_INVOCATIONS(31),
    /**
     *
     */
    LIMIT_MAX_COMPUTE_WORKGROUP_SIZE_X(32),
    /**
     *
     */
    LIMIT_MAX_COMPUTE_WORKGROUP_SIZE_Y(33),
    /**
     *
     */
    LIMIT_MAX_COMPUTE_WORKGROUP_SIZE_Z(34),
    /**
     *
     */
    LIMIT_MAX_VIEWPORT_DIMENSIONS_X(35),
    /**
     *
     */
    LIMIT_MAX_VIEWPORT_DIMENSIONS_Y(36),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class MemoryType(
    id: Long
  ) {
    /**
     *
     */
    MEMORY_TEXTURES(0),
    /**
     *
     */
    MEMORY_BUFFERS(1),
    /**
     *
     */
    MEMORY_TOTAL(2),
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
     *
     */
    public final const val INVALID_ID: Long = -1

    /**
     *
     */
    public final const val INVALID_FORMAT_ID: Long = -1
  }
}
