// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType._RID
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * This object manages all 3D rendering buffers for the rendering device based renderers. An
 * instance of this object is created for every viewport that has 3D rendering enabled.
 * All buffers are organized in **contexts**. The default context is called **render_buffers** and
 * can contain amongst others the color buffer, depth buffer, velocity buffers, VRS density map and
 * MSAA variants of these buffers.
 * Buffers are only guaranteed to exist during rendering of the viewport.
 * **Note:** This is an internal rendering server object, do not instantiate this from script.
 */
@GodotBaseType
public open class RenderSceneBuffersRD : RenderSceneBuffers() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RENDERSCENEBUFFERSRD, scriptIndex)
  }

  /**
   * Returns `true` if a cached texture exists for this name.
   */
  public final fun hasTexture(context: StringName, name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasTexturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Create a new texture with the given definition and cache this under the given name. Will return
   * the existing texture if it already exists.
   */
  public final fun createTexture(
    context: StringName,
    name: StringName,
    dataFormat: RenderingDevice.DataFormat,
    usageBits: Long,
    textureSamples: RenderingDevice.TextureSamples,
    size: Vector2i,
    layers: Long,
    mipmaps: Long,
    unique: Boolean,
  ): RID {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name, LONG to dataFormat.id, LONG to usageBits, LONG to textureSamples.id, VECTOR2I to size, LONG to layers, LONG to mipmaps, BOOL to unique)
    TransferContext.callMethod(rawPtr, MethodBindings.createTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Create a new texture using the given format and view and cache this under the given name. Will
   * return the existing texture if it already exists.
   */
  public final fun createTextureFromFormat(
    context: StringName,
    name: StringName,
    format: RDTextureFormat?,
    view: RDTextureView?,
    unique: Boolean,
  ): RID {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name, OBJECT to format, OBJECT to view, BOOL to unique)
    TransferContext.callMethod(rawPtr, MethodBindings.createTextureFromFormatPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Create a new texture view for an existing texture and cache this under the given view_name.
   * Will return the existing teture view if it already exists. Will error if the source texture
   * doesn't exist.
   */
  public final fun createTextureView(
    context: StringName,
    name: StringName,
    viewName: StringName,
    view: RDTextureView?,
  ): RID {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name, STRING_NAME to viewName, OBJECT to view)
    TransferContext.callMethod(rawPtr, MethodBindings.createTextureViewPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns a cached texture with this name.
   */
  public final fun getTexture(context: StringName, name: StringName): RID {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the texture format information with which a cached texture was created.
   */
  public final fun getTextureFormat(context: StringName, name: StringName): RDTextureFormat? {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureFormatPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as RDTextureFormat?)
  }

  /**
   * Returns a specific slice (layer or mipmap) for a cached texture.
   */
  public final fun getTextureSlice(
    context: StringName,
    name: StringName,
    layer: Long,
    mipmap: Long,
    layers: Long,
    mipmaps: Long,
  ): RID {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name, LONG to layer, LONG to mipmap, LONG to layers, LONG to mipmaps)
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureSlicePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns a specific view of a slice (layer or mipmap) for a cached texture.
   */
  public final fun getTextureSliceView(
    context: StringName,
    name: StringName,
    layer: Long,
    mipmap: Long,
    layers: Long,
    mipmaps: Long,
    view: RDTextureView?,
  ): RID {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name, LONG to layer, LONG to mipmap, LONG to layers, LONG to mipmaps, OBJECT to view)
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureSliceViewPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the texture size of a given slice of a cached texture.
   */
  public final fun getTextureSliceSize(
    context: StringName,
    name: StringName,
    mipmap: Long,
  ): Vector2i {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name, LONG to mipmap)
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureSliceSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Frees all buffers related to this context.
   */
  public final fun clearContext(context: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to context)
    TransferContext.callMethod(rawPtr, MethodBindings.clearContextPtr, NIL)
  }

  /**
   * Returns the color texture we are rendering 3D content to. If multiview is used this will be a
   * texture array with all views.
   * If [msaa] is **true** and MSAA is enabled, this returns the MSAA variant of the buffer.
   */
  @JvmOverloads
  public final fun getColorTexture(msaa: Boolean = false): RID {
    TransferContext.writeArguments(BOOL to msaa)
    TransferContext.callMethod(rawPtr, MethodBindings.getColorTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the specified layer from the color texture we are rendering 3D content to.
   * If [msaa] is **true** and MSAA is enabled, this returns the MSAA variant of the buffer.
   */
  @JvmOverloads
  public final fun getColorLayer(layer: Long, msaa: Boolean = false): RID {
    TransferContext.writeArguments(LONG to layer, BOOL to msaa)
    TransferContext.callMethod(rawPtr, MethodBindings.getColorLayerPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the depth texture we are rendering 3D content to. If multiview is used this will be a
   * texture array with all views.
   * If [msaa] is **true** and MSAA is enabled, this returns the MSAA variant of the buffer.
   */
  @JvmOverloads
  public final fun getDepthTexture(msaa: Boolean = false): RID {
    TransferContext.writeArguments(BOOL to msaa)
    TransferContext.callMethod(rawPtr, MethodBindings.getDepthTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the specified layer from the depth texture we are rendering 3D content to.
   * If [msaa] is **true** and MSAA is enabled, this returns the MSAA variant of the buffer.
   */
  @JvmOverloads
  public final fun getDepthLayer(layer: Long, msaa: Boolean = false): RID {
    TransferContext.writeArguments(LONG to layer, BOOL to msaa)
    TransferContext.callMethod(rawPtr, MethodBindings.getDepthLayerPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the velocity texture we are rendering 3D content to. If multiview is used this will be
   * a texture array with all views.
   * If [msaa] is **true** and MSAA is enabled, this returns the MSAA variant of the buffer.
   */
  @JvmOverloads
  public final fun getVelocityTexture(msaa: Boolean = false): RID {
    TransferContext.writeArguments(BOOL to msaa)
    TransferContext.callMethod(rawPtr, MethodBindings.getVelocityTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the specified layer from the velocity texture we are rendering 3D content to.
   */
  @JvmOverloads
  public final fun getVelocityLayer(layer: Long, msaa: Boolean = false): RID {
    TransferContext.writeArguments(LONG to layer, BOOL to msaa)
    TransferContext.callMethod(rawPtr, MethodBindings.getVelocityLayerPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the render target associated with this buffers object.
   */
  public final fun getRenderTarget(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRenderTargetPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the view count for the associated viewport.
   */
  public final fun getViewCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getViewCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the internal size of the render buffer (size before upscaling) with which textures are
   * created by default.
   */
  public final fun getInternalSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInternalSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the target size of the render buffer (size after upscaling).
   */
  public final fun getTargetSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTargetSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the scaling mode used for upscaling.
   */
  public final fun getScaling3dMode(): RenderingServer.ViewportScaling3DMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScaling3dModePtr, LONG)
    return RenderingServer.ViewportScaling3DMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the FSR sharpness value used while rendering the 3D content (if [getScaling3dMode] is
   * an FSR mode).
   */
  public final fun getFsrSharpness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFsrSharpnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the applied 3D MSAA mode for this viewport.
   */
  public final fun getMsaa3d(): RenderingServer.ViewportMSAA {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMsaa3dPtr, LONG)
    return RenderingServer.ViewportMSAA.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the number of MSAA samples used.
   */
  public final fun getTextureSamples(): RenderingDevice.TextureSamples {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureSamplesPtr, LONG)
    return RenderingDevice.TextureSamples.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the screen-space antialiasing method applied.
   */
  public final fun getScreenSpaceAa(): RenderingServer.ViewportScreenSpaceAA {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScreenSpaceAaPtr, LONG)
    return RenderingServer.ViewportScreenSpaceAA.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if TAA is enabled.
   */
  public final fun getUseTaa(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUseTaaPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if debanding is enabled.
   */
  public final fun getUseDebanding(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUseDebandingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val hasTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "has_texture", 471820014)

    public val createTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "create_texture", 3559915770)

    public val createTextureFromFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "create_texture_from_format", 3344669382)

    public val createTextureViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "create_texture_view", 283055834)

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_texture", 750006389)

    public val getTextureFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_texture_format", 371461758)

    public val getTextureSlicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_texture_slice", 588440706)

    public val getTextureSliceViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_texture_slice_view", 682451778)

    public val getTextureSliceSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_texture_slice_size", 2617625368)

    public val clearContextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "clear_context", 3304788590)

    public val getColorTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_color_texture", 3050822880)

    public val getColorLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_color_layer", 3087988589)

    public val getDepthTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_depth_texture", 3050822880)

    public val getDepthLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_depth_layer", 3087988589)

    public val getVelocityTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_velocity_texture", 3050822880)

    public val getVelocityLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_velocity_layer", 3087988589)

    public val getRenderTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_render_target", 2944877500)

    public val getViewCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_view_count", 3905245786)

    public val getInternalSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_internal_size", 3690982128)

    public val getTargetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_target_size", 3690982128)

    public val getScaling3dModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_scaling_3d_mode", 976778074)

    public val getFsrSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_fsr_sharpness", 1740695150)

    public val getMsaa3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_msaa_3d", 3109158617)

    public val getTextureSamplesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_texture_samples", 407791724)

    public val getScreenSpaceAaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_screen_space_aa", 641513172)

    public val getUseTaaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_use_taa", 36873697)

    public val getUseDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersRD", "get_use_debanding", 36873697)
  }
}
