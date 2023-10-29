// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.StringName
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType._RID
import godot.core.Vector2i
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstract render scene buffer implementation for the RenderingDevice based renderers.
 *
 * This object manages all 3D rendering buffers for the rendering device based renderers. An instance of this object is created for every viewport that has 3D rendering enabled.
 *
 * All buffers are organized in **contexts**. The default context is called **render_buffers** and can contain amongst others the color buffer, depth buffer, velocity buffers, VRS density map and MSAA variants of these buffers.
 *
 * Buffers are only guaranteed to exist during rendering of the viewport.
 *
 * **Note:** this is an internal rendering server object only exposed for GDExtension plugins.
 */
@GodotBaseType
public open class RenderSceneBuffersRD internal constructor() : RenderSceneBuffers() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RENDERSCENEBUFFERSRD, scriptIndex)
    return true
  }

  /**
   * Returns `true` if a cached texture exists for this name.
   */
  public fun hasTexture(context: StringName, name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_HAS_TEXTURE,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Create a new texture with the given definition and cache this under the given name. Will return the existing texture if it already exists.
   */
  public fun createTexture(
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_CREATE_TEXTURE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Create a new texture using the given format and view and cache this under the given name. Will return the existing texture if it already exists.
   */
  public fun createTextureFromFormat(
    context: StringName,
    name: StringName,
    format: RDTextureFormat,
    view: RDTextureView,
    unique: Boolean,
  ): RID {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name, OBJECT to format, OBJECT to view, BOOL to unique)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_CREATE_TEXTURE_FROM_FORMAT, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Create a new texture view for an existing texture and cache this under the given view_name. Will return the existing teture view if it already exists. Will error if the source texture doesn't exist.
   */
  public fun createTextureView(
    context: StringName,
    name: StringName,
    viewName: StringName,
    view: RDTextureView,
  ): RID {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name, STRING_NAME to viewName, OBJECT to view)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_CREATE_TEXTURE_VIEW, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns a cached texture with this name.
   */
  public fun getTexture(context: StringName, name: StringName): RID {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_TEXTURE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the texture format information with which a cached texture was created.
   */
  public fun getTextureFormat(context: StringName, name: StringName): RDTextureFormat? {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_TEXTURE_FORMAT, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as RDTextureFormat?)
  }

  /**
   * Returns a specific slice (layer or mipmap) for a cached texture.
   */
  public fun getTextureSlice(
    context: StringName,
    name: StringName,
    layer: Long,
    mipmap: Long,
    layers: Long,
    mipmaps: Long,
  ): RID {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name, LONG to layer, LONG to mipmap, LONG to layers, LONG to mipmaps)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_TEXTURE_SLICE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns a specific view of a slice (layer or mipmap) for a cached texture.
   */
  public fun getTextureSliceView(
    context: StringName,
    name: StringName,
    layer: Long,
    mipmap: Long,
    layers: Long,
    mipmaps: Long,
    view: RDTextureView,
  ): RID {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name, LONG to layer, LONG to mipmap, LONG to layers, LONG to mipmaps, OBJECT to view)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_TEXTURE_SLICE_VIEW, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the texture size of a given slice of a cached texture.
   */
  public fun getTextureSliceSize(
    context: StringName,
    name: StringName,
    mipmap: Long,
  ): Vector2i {
    TransferContext.writeArguments(STRING_NAME to context, STRING_NAME to name, LONG to mipmap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_TEXTURE_SLICE_SIZE, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Frees all buffers related to this context.
   */
  public fun clearContext(context: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to context)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_CLEAR_CONTEXT,
        NIL)
  }

  /**
   * Returns the color texture we are rendering 3D content to. If multiview is used this will be a texture array with all views.
   */
  public fun getColorTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_COLOR_TEXTURE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the specified layer from the color texture we are rendering 3D content to.
   */
  public fun getColorLayer(layer: Long): RID {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_COLOR_LAYER, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the depth texture we are rendering 3D content to. If multiview is used this will be a texture array with all views.
   */
  public fun getDepthTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_DEPTH_TEXTURE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the specified layer from the depth texture we are rendering 3D content to.
   */
  public fun getDepthLayer(layer: Long): RID {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_DEPTH_LAYER, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the velocity texture we are rendering 3D content to. If multiview is used this will be a texture array with all views.
   */
  public fun getVelocityTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_VELOCITY_TEXTURE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the specified layer from the velocity texture we are rendering 3D content to.
   */
  public fun getVelocityLayer(layer: Long): RID {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_VELOCITY_LAYER, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the render target associated with this buffers object.
   */
  public fun getRenderTarget(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_RENDER_TARGET, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the view count for the associated viewport.
   */
  public fun getViewCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_VIEW_COUNT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the internal size of the render buffer (size before upscaling) with which textures are created by default.
   */
  public fun getInternalSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_INTERNAL_SIZE, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns `true` if TAA is enabled.
   */
  public fun getUseTaa(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSRD_GET_USE_TAA,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object
}
