// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.Basis
import godot.core.Callable
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedByteArray
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.PackedInt32Array
import godot.core.PackedInt64Array
import godot.core.PackedVector2Array
import godot.core.PackedVector3Array
import godot.core.Plane
import godot.core.RID
import godot.core.Rect2
import godot.core.StringName
import godot.core.Transform2D
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BASIS
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_INT_64_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType.VECTOR3
import godot.core.VariantType.VECTOR3I
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.Vector3
import godot.core.Vector3i
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmOverloads

/**
 * Server for anything visible.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/performance/using_servers.html]($DOCS_URL/tutorials/performance/using_servers.html)
 *
 * The rendering server is the API backend for everything visible. The whole scene system mounts on it to display. The rendering server is completely opaque: the internals are entirely implementation-specific and cannot be accessed.
 *
 * The rendering server can be used to bypass the scene/[godot.Node] system entirely. This can improve performance in cases where the scene system is the bottleneck, but won't improve performance otherwise (for instance, if the GPU is already fully utilized).
 *
 * Resources are created using the `*_create` functions. These functions return [RID]s which are not references to the objects themselves, but opaque *pointers* towards these objects.
 *
 * All objects are drawn to a viewport. You can use the [godot.Viewport] attached to the [godot.SceneTree] or you can create one yourself with [viewportCreate]. When using a custom scenario or canvas, the scenario or canvas needs to be attached to the viewport using [viewportSetScenario] or [viewportAttachCanvas].
 *
 * **Scenarios:** In 3D, all visual objects must be associated with a scenario. The scenario is a visual representation of the world. If accessing the rendering server from a running game, the scenario can be accessed from the scene tree from any [godot.Node3D] node with [godot.Node3D.getWorld3d]. Otherwise, a scenario can be created with [scenarioCreate].
 *
 * Similarly, in 2D, a canvas is needed to draw all canvas items.
 *
 * **3D:** In 3D, all visible objects are comprised of a resource and an instance. A resource can be a mesh, a particle system, a light, or any other 3D object. In order to be visible resources must be attached to an instance using [instanceSetBase]. The instance must also be attached to the scenario using [instanceSetScenario] in order to be visible. RenderingServer methods that don't have a prefix are usually 3D-specific (but not always).
 *
 * **2D:** In 2D, all visible objects are some form of canvas item. In order to be visible, a canvas item needs to be the child of a canvas attached to a viewport, or it needs to be the child of another canvas item that is eventually attached to the canvas. 2D-specific RenderingServer methods generally start with `canvas_*`.
 *
 * **Headless mode:** Starting the engine with the `--headless` [command line argument]($DOCS_URL/tutorials/editor/command_line_tutorial.html) disables all rendering and window management functions. Most functions from [godot.RenderingServer] will return dummy values in this case.
 */
@GodotBaseType
public object RenderingServer : Object() {
  /**
   * Marks an error that shows that the index array is empty.
   */
  public final const val NO_INDEX_ARRAY: Long = -1

  /**
   * Number of weights/bones per vertex.
   */
  public final const val ARRAY_WEIGHTS_SIZE: Long = 4

  /**
   * The minimum Z-layer for canvas items.
   */
  public final const val CANVAS_ITEM_Z_MIN: Long = -4096

  /**
   * The maximum Z-layer for canvas items.
   */
  public final const val CANVAS_ITEM_Z_MAX: Long = 4096

  /**
   * The maximum number of glow levels that can be used with the glow post-processing effect.
   */
  public final const val MAX_GLOW_LEVELS: Long = 7

  /**
   * *Deprecated.* This constant is unused internally.
   */
  public final const val MAX_CURSORS: Long = 8

  /**
   * The maximum number of directional lights that can be rendered at a given time in 2D.
   */
  public final const val MAX_2D_DIRECTIONAL_LIGHTS: Long = 8

  /**
   * The minimum renderpriority of all materials.
   */
  public final const val MATERIAL_RENDER_PRIORITY_MIN: Long = -128

  /**
   * The maximum renderpriority of all materials.
   */
  public final const val MATERIAL_RENDER_PRIORITY_MAX: Long = 127

  /**
   * The number of custom data arrays available ([godot.ARRAY_CUSTOM0], [godot.ARRAY_CUSTOM1], [godot.ARRAY_CUSTOM2], [godot.ARRAY_CUSTOM3]).
   */
  public final const val ARRAY_CUSTOM_COUNT: Long = 4

  /**
   *
   */
  public final const val PARTICLES_EMIT_FLAG_POSITION: Long = 1

  /**
   *
   */
  public final const val PARTICLES_EMIT_FLAG_ROTATION_SCALE: Long = 2

  /**
   *
   */
  public final const val PARTICLES_EMIT_FLAG_VELOCITY: Long = 4

  /**
   *
   */
  public final const val PARTICLES_EMIT_FLAG_COLOR: Long = 8

  /**
   *
   */
  public final const val PARTICLES_EMIT_FLAG_CUSTOM: Long = 16

  /**
   * Emitted at the beginning of the frame, before the RenderingServer updates all the Viewports.
   */
  public val framePreDraw: Signal0 by signal()

  /**
   * Emitted at the end of the frame, after the RenderingServer has finished updating all the Viewports.
   */
  public val framePostDraw: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_RENDERINGSERVER)
    return false
  }

  /**
   * Creates a 2-dimensional texture and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `texture_2d_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent resource is [godot.Texture2D].
   *
   * **Note:** Not to be confused with [godot.RenderingDevice.textureCreate], which creates the graphics API's own texture type as opposed to the Godot-specific [godot.Texture2D] resource.
   */
  public fun texture2dCreate(image: Image): RID {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_2D_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a 2-dimensional layered texture and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `texture_2d_layered_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent resource is [godot.TextureLayered].
   */
  public fun texture2dLayeredCreate(layers: VariantArray<Image>, layeredType: TextureLayeredType):
      RID {
    TransferContext.writeArguments(ARRAY to layers, LONG to layeredType.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_2D_LAYERED_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * **Note:** The equivalent resource is [godot.Texture3D].
   */
  public fun texture3dCreate(
    format: Image.Format,
    width: Int,
    height: Int,
    depth: Int,
    mipmaps: Boolean,
    `data`: VariantArray<Image>,
  ): RID {
    TransferContext.writeArguments(LONG to format.id, LONG to width.toLong(), LONG to height.toLong(), LONG to depth.toLong(), BOOL to mipmaps, ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_3D_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * *Deprecated.* ProxyTexture was removed in Godot 4, so this method does nothing when called and always returns a null [RID].
   */
  public fun textureProxyCreate(base: RID): RID {
    TransferContext.writeArguments(_RID to base)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_PROXY_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Updates the texture specified by the [texture] [RID] with the data in [image]. A [layer] must also be specified, which should be `0` when updating a single-layer texture ([godot.Texture2D]).
   *
   * **Note:** The [image] must have the same width, height and format as the current [texture] data. Otherwise, an error will be printed and the original texture won't be modified. If you need to use different width, height or format, use [textureReplace] instead.
   */
  public fun texture2dUpdate(
    texture: RID,
    image: Image,
    layer: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to texture, OBJECT to image, LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_2D_UPDATE,
        NIL)
  }

  /**
   * Updates the texture specified by the [texture] [RID]'s data with the data in [data]. All the texture's layers must be replaced at once.
   *
   * **Note:** The [texture] must have the same width, height, depth and format as the current texture data. Otherwise, an error will be printed and the original texture won't be modified. If you need to use different width, height, depth or format, use [textureReplace] instead.
   */
  public fun texture3dUpdate(texture: RID, `data`: VariantArray<Image>): Unit {
    TransferContext.writeArguments(_RID to texture, ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_3D_UPDATE,
        NIL)
  }

  /**
   * *Deprecated.* ProxyTexture was removed in Godot 4, so this method cannot be used anymore.
   */
  public fun textureProxyUpdate(texture: RID, proxyTo: RID): Unit {
    TransferContext.writeArguments(_RID to texture, _RID to proxyTo)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_PROXY_UPDATE, NIL)
  }

  /**
   * Creates a placeholder for a 2-dimensional layered texture and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `texture_2d_layered_*` RenderingServer functions, although it does nothing when used. See also [texture2dLayeredPlaceholderCreate]
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent resource is [godot.PlaceholderTexture2D].
   */
  public fun texture2dPlaceholderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_2D_PLACEHOLDER_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a placeholder for a 2-dimensional layered texture and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `texture_2d_layered_*` RenderingServer functions, although it does nothing when used. See also [texture2dPlaceholderCreate].
   *
   * **Note:** The equivalent resource is [godot.PlaceholderTextureLayered].
   */
  public fun texture2dLayeredPlaceholderCreate(layeredType: TextureLayeredType): RID {
    TransferContext.writeArguments(LONG to layeredType.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_2D_LAYERED_PLACEHOLDER_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a placeholder for a 3-dimensional texture and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `texture_3d_*` RenderingServer functions, although it does nothing when used.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent resource is [godot.PlaceholderTexture3D].
   */
  public fun texture3dPlaceholderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_3D_PLACEHOLDER_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns an [godot.Image] instance from the given [texture] [RID].
   *
   * Example of getting the test texture from [getTestTexture] and applying it to a [godot.Sprite2D] node:
   *
   * ```
   * 				var texture_rid = RenderingServer.get_test_texture()
   * 				var texture = ImageTexture.create_from_image(RenderingServer.texture_2d_get(texture_rid))
   * 				$Sprite2D.texture = texture
   * 				```
   */
  public fun texture2dGet(texture: RID): Image? {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_2D_GET,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Returns an [godot.Image] instance from the given [texture] [RID] and [layer].
   */
  public fun texture2dLayerGet(texture: RID, layer: Int): Image? {
    TransferContext.writeArguments(_RID to texture, LONG to layer.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_2D_LAYER_GET, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Returns 3D texture data as an array of [godot.Image]s for the specified texture [RID].
   */
  public fun texture3dGet(texture: RID): VariantArray<Image> {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_3D_GET,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Image>)
  }

  /**
   * Replaces [texture]'s texture data by the texture specified by the [byTexture] RID, without changing [texture]'s RID.
   */
  public fun textureReplace(texture: RID, byTexture: RID): Unit {
    TransferContext.writeArguments(_RID to texture, _RID to byTexture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_REPLACE,
        NIL)
  }

  /**
   *
   */
  public fun textureSetSizeOverride(
    texture: RID,
    width: Int,
    height: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to texture, LONG to width.toLong(), LONG to height.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_SET_SIZE_OVERRIDE, NIL)
  }

  /**
   *
   */
  public fun textureSetPath(texture: RID, path: String): Unit {
    TransferContext.writeArguments(_RID to texture, STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_SET_PATH,
        NIL)
  }

  /**
   *
   */
  public fun textureGetPath(texture: RID): String {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_GET_PATH,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   *
   */
  public fun textureSetForceRedrawIfVisible(texture: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to texture, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_SET_FORCE_REDRAW_IF_VISIBLE, NIL)
  }

  /**
   * Returns a texture [RID] that can be used with [godot.RenderingDevice].
   */
  @JvmOverloads
  public fun textureGetRdTexture(texture: RID, srgb: Boolean = false): RID {
    TransferContext.writeArguments(_RID to texture, BOOL to srgb)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_GET_RD_TEXTURE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the internal graphics handle for this texture object. For use when communicating with third-party APIs mostly with GDExtension.
   *
   * **Note:** This function returns a `uint64_t` which internally maps to a `GLuint` (OpenGL) or `VkImage` (Vulkan).
   */
  @JvmOverloads
  public fun textureGetNativeHandle(texture: RID, srgb: Boolean = false): Long {
    TransferContext.writeArguments(_RID to texture, BOOL to srgb)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_GET_NATIVE_HANDLE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Creates an empty shader and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `shader_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent resource is [godot.Shader].
   */
  public fun shaderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SHADER_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the shader's source code (which triggers recompilation after being changed).
   */
  public fun shaderSetCode(shader: RID, code: String): Unit {
    TransferContext.writeArguments(_RID to shader, STRING to code)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SHADER_SET_CODE,
        NIL)
  }

  /**
   * Sets the path hint for the specified shader. This should generally match the [godot.Shader] resource's [godot.Resource.resourcePath].
   */
  public fun shaderSetPathHint(shader: RID, path: String): Unit {
    TransferContext.writeArguments(_RID to shader, STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SHADER_SET_PATH_HINT, NIL)
  }

  /**
   * Returns a shader's source code as a string.
   */
  public fun shaderGetCode(shader: RID): String {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SHADER_GET_CODE,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the parameters of a shader.
   */
  public fun getShaderParameterList(shader: RID): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_SHADER_PARAMETER_LIST, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns the default value for the specified shader uniform. This is usually the value written in the shader source code.
   */
  public fun shaderGetParameterDefault(shader: RID, name: StringName): Any? {
    TransferContext.writeArguments(_RID to shader, STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SHADER_GET_PARAMETER_DEFAULT, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets a shader's default texture. Overwrites the texture given by name.
   *
   * **Note:** If the sampler array is used use [index] to access the specified texture.
   */
  @JvmOverloads
  public fun shaderSetDefaultTextureParameter(
    shader: RID,
    name: StringName,
    texture: RID,
    index: Int = 0,
  ): Unit {
    TransferContext.writeArguments(_RID to shader, STRING_NAME to name, _RID to texture, LONG to index.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SHADER_SET_DEFAULT_TEXTURE_PARAMETER, NIL)
  }

  /**
   * Returns a default texture from a shader searched by name.
   *
   * **Note:** If the sampler array is used use [index] to access the specified texture.
   */
  @JvmOverloads
  public fun shaderGetDefaultTextureParameter(
    shader: RID,
    name: StringName,
    index: Int = 0,
  ): RID {
    TransferContext.writeArguments(_RID to shader, STRING_NAME to name, LONG to index.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SHADER_GET_DEFAULT_TEXTURE_PARAMETER, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates an empty material and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `material_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent resource is [godot.Material].
   */
  public fun materialCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MATERIAL_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets a shader material's shader.
   */
  public fun materialSetShader(shaderMaterial: RID, shader: RID): Unit {
    TransferContext.writeArguments(_RID to shaderMaterial, _RID to shader)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MATERIAL_SET_SHADER,
        NIL)
  }

  /**
   * Sets a material's parameter.
   */
  public fun materialSetParam(
    material: RID,
    parameter: StringName,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(_RID to material, STRING_NAME to parameter, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MATERIAL_SET_PARAM,
        NIL)
  }

  /**
   * Returns the value of a certain material's parameter.
   */
  public fun materialGetParam(material: RID, parameter: StringName): Any? {
    TransferContext.writeArguments(_RID to material, STRING_NAME to parameter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MATERIAL_GET_PARAM,
        ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets a material's render priority.
   */
  public fun materialSetRenderPriority(material: RID, priority: Int): Unit {
    TransferContext.writeArguments(_RID to material, LONG to priority.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MATERIAL_SET_RENDER_PRIORITY, NIL)
  }

  /**
   * Sets an object's next material.
   */
  public fun materialSetNextPass(material: RID, nextMaterial: RID): Unit {
    TransferContext.writeArguments(_RID to material, _RID to nextMaterial)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MATERIAL_SET_NEXT_PASS, NIL)
  }

  /**
   *
   */
  @JvmOverloads
  public fun meshCreateFromSurfaces(surfaces: VariantArray<Dictionary<Any?, Any?>>,
      blendShapeCount: Int = 0): RID {
    TransferContext.writeArguments(ARRAY to surfaces, LONG to blendShapeCount.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_CREATE_FROM_SURFACES, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a new mesh and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `mesh_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * To place in a scene, attach this mesh to an instance using [instanceSetBase] using the returned RID.
   *
   * **Note:** The equivalent resource is [godot.Mesh].
   */
  public fun meshCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   *
   */
  public fun meshSurfaceGetFormatOffset(
    format: ArrayFormat,
    vertexCount: Int,
    arrayIndex: Int,
  ): Long {
    TransferContext.writeArguments(LONG to format.flag, LONG to vertexCount.toLong(), LONG to arrayIndex.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_GET_FORMAT_OFFSET, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   *
   */
  public fun meshSurfaceGetFormatVertexStride(format: ArrayFormat, vertexCount: Int): Long {
    TransferContext.writeArguments(LONG to format.flag, LONG to vertexCount.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_GET_FORMAT_VERTEX_STRIDE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   *
   */
  public fun meshSurfaceGetFormatAttributeStride(format: ArrayFormat, vertexCount: Int): Long {
    TransferContext.writeArguments(LONG to format.flag, LONG to vertexCount.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_GET_FORMAT_ATTRIBUTE_STRIDE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   *
   */
  public fun meshSurfaceGetFormatSkinStride(format: ArrayFormat, vertexCount: Int): Long {
    TransferContext.writeArguments(LONG to format.flag, LONG to vertexCount.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_GET_FORMAT_SKIN_STRIDE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   *
   */
  public fun meshAddSurface(mesh: RID, surface: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(_RID to mesh, DICTIONARY to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_ADD_SURFACE,
        NIL)
  }

  /**
   *
   */
  @JvmOverloads
  public fun meshAddSurfaceFromArrays(
    mesh: RID,
    primitive: PrimitiveType,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<Any?> = godot.core.variantArrayOf(),
    lods: Dictionary<Any?, Any?> = Dictionary(),
    compressFormat: ArrayFormat = RenderingServer.ArrayFormatValue(0),
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to primitive.id, ARRAY to arrays, ARRAY to blendShapes, DICTIONARY to lods, LONG to compressFormat.flag)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_ADD_SURFACE_FROM_ARRAYS, NIL)
  }

  /**
   * Returns a mesh's blend shape count.
   */
  public fun meshGetBlendShapeCount(mesh: RID): Int {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_GET_BLEND_SHAPE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets a mesh's blend shape mode.
   */
  public fun meshSetBlendShapeMode(mesh: RID, mode: BlendShapeMode): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SET_BLEND_SHAPE_MODE, NIL)
  }

  /**
   * Returns a mesh's blend shape mode.
   */
  public fun meshGetBlendShapeMode(mesh: RID): BlendShapeMode {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_GET_BLEND_SHAPE_MODE, LONG)
    return RenderingServer.BlendShapeMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets a mesh's surface's material.
   */
  public fun meshSurfaceSetMaterial(
    mesh: RID,
    surface: Int,
    material: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong(), _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_SET_MATERIAL, NIL)
  }

  /**
   * Returns a mesh's surface's material.
   */
  public fun meshSurfaceGetMaterial(mesh: RID, surface: Int): RID {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_GET_MATERIAL, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   *
   */
  public fun meshGetSurface(mesh: RID, surface: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_GET_SURFACE,
        DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns a mesh's surface's buffer arrays.
   */
  public fun meshSurfaceGetArrays(mesh: RID, surface: Int): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_GET_ARRAYS, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns a mesh's surface's arrays for blend shapes.
   */
  public fun meshSurfaceGetBlendShapeArrays(mesh: RID, surface: Int):
      VariantArray<VariantArray<Any?>> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_GET_BLEND_SHAPE_ARRAYS, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<VariantArray<Any?>>)
  }

  /**
   * Returns a mesh's number of surfaces.
   */
  public fun meshGetSurfaceCount(mesh: RID): Int {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_GET_SURFACE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets a mesh's custom aabb.
   */
  public fun meshSetCustomAabb(mesh: RID, aabb: AABB): Unit {
    TransferContext.writeArguments(_RID to mesh, godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SET_CUSTOM_AABB, NIL)
  }

  /**
   * Returns a mesh's custom aabb.
   */
  public fun meshGetCustomAabb(mesh: RID): AABB {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_GET_CUSTOM_AABB, godot.core.VariantType.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
  }

  /**
   * Removes all surfaces from a mesh.
   */
  public fun meshClear(mesh: RID): Unit {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_CLEAR, NIL)
  }

  /**
   *
   */
  public fun meshSurfaceUpdateVertexRegion(
    mesh: RID,
    surface: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_UPDATE_VERTEX_REGION, NIL)
  }

  /**
   *
   */
  public fun meshSurfaceUpdateAttributeRegion(
    mesh: RID,
    surface: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_UPDATE_ATTRIBUTE_REGION, NIL)
  }

  /**
   *
   */
  public fun meshSurfaceUpdateSkinRegion(
    mesh: RID,
    surface: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_UPDATE_SKIN_REGION, NIL)
  }

  /**
   *
   */
  public fun meshSetShadowMesh(mesh: RID, shadowMesh: RID): Unit {
    TransferContext.writeArguments(_RID to mesh, _RID to shadowMesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SET_SHADOW_MESH, NIL)
  }

  /**
   * Creates a new multimesh on the RenderingServer and returns an [RID] handle. This RID will be used in all `multimesh_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * To place in a scene, attach this multimesh to an instance using [instanceSetBase] using the returned RID.
   *
   * **Note:** The equivalent resource is [godot.MultiMesh].
   */
  public fun multimeshCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   *
   */
  @JvmOverloads
  public fun multimeshAllocateData(
    multimesh: RID,
    instances: Int,
    transformFormat: MultimeshTransformFormat,
    colorFormat: Boolean = false,
    customDataFormat: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to instances.toLong(), LONG to transformFormat.id, BOOL to colorFormat, BOOL to customDataFormat)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_ALLOCATE_DATA, NIL)
  }

  /**
   * Returns the number of instances allocated for this multimesh.
   */
  public fun multimeshGetInstanceCount(multimesh: RID): Int {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_GET_INSTANCE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the mesh to be drawn by the multimesh. Equivalent to [godot.MultiMesh.mesh].
   */
  public fun multimeshSetMesh(multimesh: RID, mesh: RID): Unit {
    TransferContext.writeArguments(_RID to multimesh, _RID to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_SET_MESH,
        NIL)
  }

  /**
   * Sets the [godot.Transform3D] for this instance. Equivalent to [godot.MultiMesh.setInstanceTransform].
   */
  public fun multimeshInstanceSetTransform(
    multimesh: RID,
    index: Int,
    transform: Transform3D,
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_SET_TRANSFORM, NIL)
  }

  /**
   * Sets the [godot.core.Transform2D] for this instance. For use when multimesh is used in 2D. Equivalent to [godot.MultiMesh.setInstanceTransform2d].
   */
  public fun multimeshInstanceSetTransform2d(
    multimesh: RID,
    index: Int,
    transform: Transform2D,
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_SET_TRANSFORM_2D, NIL)
  }

  /**
   * Sets the color by which this instance will be modulated. Equivalent to [godot.MultiMesh.setInstanceColor].
   */
  public fun multimeshInstanceSetColor(
    multimesh: RID,
    index: Int,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_SET_COLOR, NIL)
  }

  /**
   * Sets the custom data for this instance. Custom data is passed as a [godot.core.Color], but is interpreted as a `vec4` in the shader. Equivalent to [godot.MultiMesh.setInstanceCustomData].
   */
  public fun multimeshInstanceSetCustomData(
    multimesh: RID,
    index: Int,
    customData: Color,
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong(), COLOR to customData)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_SET_CUSTOM_DATA, NIL)
  }

  /**
   * Returns the RID of the mesh that will be used in drawing this multimesh.
   */
  public fun multimeshGetMesh(multimesh: RID): RID {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_GET_MESH,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Calculates and returns the axis-aligned bounding box that encloses all instances within the multimesh.
   */
  public fun multimeshGetAabb(multimesh: RID): AABB {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_GET_AABB,
        godot.core.VariantType.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
  }

  /**
   * Returns the [godot.Transform3D] of the specified instance.
   */
  public fun multimeshInstanceGetTransform(multimesh: RID, index: Int): Transform3D {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_GET_TRANSFORM, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Returns the [godot.core.Transform2D] of the specified instance. For use when the multimesh is set to use 2D transforms.
   */
  public fun multimeshInstanceGetTransform2d(multimesh: RID, index: Int): Transform2D {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_GET_TRANSFORM_2D, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Returns the color by which the specified instance will be modulated.
   */
  public fun multimeshInstanceGetColor(multimesh: RID, index: Int): Color {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_GET_COLOR, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns the custom data associated with the specified instance.
   */
  public fun multimeshInstanceGetCustomData(multimesh: RID, index: Int): Color {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_GET_CUSTOM_DATA, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Sets the number of instances visible at a given time. If -1, all instances that have been allocated are drawn. Equivalent to [godot.MultiMesh.visibleInstanceCount].
   */
  public fun multimeshSetVisibleInstances(multimesh: RID, visible: Int): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to visible.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_SET_VISIBLE_INSTANCES, NIL)
  }

  /**
   * Returns the number of visible instances for this multimesh.
   */
  public fun multimeshGetVisibleInstances(multimesh: RID): Int {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_GET_VISIBLE_INSTANCES, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Set the entire data to use for drawing the [multimesh] at once to [buffer] (such as instance transforms and colors). [buffer]'s size must match the number of instances multiplied by the per-instance data size (which depends on the enabled MultiMesh fields). Otherwise, an error message is printed and nothing is rendered. See also [multimeshGetBuffer].
   *
   * The per-instance data size and expected data order is:
   *
   * ```
   * 				2D:
   * 				  - Position: 8 floats (8 floats for Transform2D)
   * 				  - Position + Vertex color: 12 floats (8 floats for Transform2D, 4 floats for Color)
   * 				  - Position + Custom data: 12 floats (8 floats for Transform2D, 4 floats of custom data)
   * 				  - Position + Vertex color + Custom data: 16 floats (8 floats for Transform2D, 4 floats for Color, 4 floats of custom data)
   * 				3D:
   * 				  - Position: 12 floats (12 floats for Transform3D)
   * 				  - Position + Vertex color: 16 floats (12 floats for Transform3D, 4 floats for Color)
   * 				  - Position + Custom data: 16 floats (12 floats for Transform3D, 4 floats of custom data)
   * 				  - Position + Vertex color + Custom data: 20 floats (12 floats for Transform3D, 4 floats for Color, 4 floats of custom data)
   * 				```
   */
  public fun multimeshSetBuffer(multimesh: RID, buffer: PackedFloat32Array): Unit {
    TransferContext.writeArguments(_RID to multimesh, PACKED_FLOAT_32_ARRAY to buffer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_SET_BUFFER, NIL)
  }

  /**
   * Returns the MultiMesh data (such as instance transforms, colors, etc). See [multimeshSetBuffer] for a description of the returned data.
   *
   * **Note:** If the buffer is in the engine's internal cache, it will have to be fetched from GPU memory and possibly decompressed. This means [multimeshGetBuffer] is potentially a slow operation and should be avoided whenever possible.
   */
  public fun multimeshGetBuffer(multimesh: RID): PackedFloat32Array {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_GET_BUFFER, PACKED_FLOAT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
  }

  /**
   * Creates a skeleton and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `skeleton_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   */
  public fun skeletonCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   *
   */
  @JvmOverloads
  public fun skeletonAllocateData(
    skeleton: RID,
    bones: Int,
    is2dSkeleton: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to skeleton, LONG to bones.toLong(), BOOL to is2dSkeleton)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_ALLOCATE_DATA, NIL)
  }

  /**
   * Returns the number of bones allocated for this skeleton.
   */
  public fun skeletonGetBoneCount(skeleton: RID): Int {
    TransferContext.writeArguments(_RID to skeleton)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_GET_BONE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the [godot.Transform3D] for a specific bone of this skeleton.
   */
  public fun skeletonBoneSetTransform(
    skeleton: RID,
    bone: Int,
    transform: Transform3D,
  ): Unit {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_BONE_SET_TRANSFORM, NIL)
  }

  /**
   * Returns the [godot.Transform3D] set for a specific bone of this skeleton.
   */
  public fun skeletonBoneGetTransform(skeleton: RID, bone: Int): Transform3D {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_BONE_GET_TRANSFORM, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Sets the [godot.core.Transform2D] for a specific bone of this skeleton.
   */
  public fun skeletonBoneSetTransform2d(
    skeleton: RID,
    bone: Int,
    transform: Transform2D,
  ): Unit {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone.toLong(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_BONE_SET_TRANSFORM_2D, NIL)
  }

  /**
   * Returns the [godot.core.Transform2D] set for a specific bone of this skeleton.
   */
  public fun skeletonBoneGetTransform2d(skeleton: RID, bone: Int): Transform2D {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_BONE_GET_TRANSFORM_2D, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   *
   */
  public fun skeletonSetBaseTransform2d(skeleton: RID, baseTransform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to skeleton, TRANSFORM2D to baseTransform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_SET_BASE_TRANSFORM_2D, NIL)
  }

  /**
   * Creates a directional light and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID can be used in most `light_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * To place in a scene, attach this directional light to an instance using [instanceSetBase] using the returned RID.
   *
   * **Note:** The equivalent node is [godot.DirectionalLight3D].
   */
  public fun directionalLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DIRECTIONAL_LIGHT_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a new omni light and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID can be used in most `light_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * To place in a scene, attach this omni light to an instance using [instanceSetBase] using the returned RID.
   *
   * **Note:** The equivalent node is [godot.OmniLight3D].
   */
  public fun omniLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_OMNI_LIGHT_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a spot light and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID can be used in most `light_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * To place in a scene, attach this spot light to an instance using [instanceSetBase] using the returned RID.
   */
  public fun spotLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SPOT_LIGHT_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the color of the light. Equivalent to [godot.Light3D.lightColor].
   */
  public fun lightSetColor(light: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_SET_COLOR,
        NIL)
  }

  /**
   * Sets the specified 3D light parameter. See [enum LightParam] for options. Equivalent to [godot.Light3D.setParam].
   */
  public fun lightSetParam(
    light: RID,
    `param`: LightParam,
    `value`: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to light, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_SET_PARAM,
        NIL)
  }

  /**
   * If `true`, light will cast shadows. Equivalent to [godot.Light3D.shadowEnabled].
   */
  public fun lightSetShadow(light: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_SET_SHADOW,
        NIL)
  }

  /**
   * Sets the projector texture to use for the specified 3D light. Equivalent to [godot.Light3D.lightProjector].
   */
  public fun lightSetProjector(light: RID, texture: RID): Unit {
    TransferContext.writeArguments(_RID to light, _RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_SET_PROJECTOR,
        NIL)
  }

  /**
   * If `true`, the 3D light will subtract light instead of adding light. Equivalent to [godot.Light3D.lightNegative].
   */
  public fun lightSetNegative(light: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_SET_NEGATIVE,
        NIL)
  }

  /**
   * Sets the cull mask for this 3D light. Lights only affect objects in the selected layers. Equivalent to [godot.Light3D.lightCullMask].
   */
  public fun lightSetCullMask(light: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mask)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_SET_CULL_MASK,
        NIL)
  }

  /**
   * Sets the distance fade for this 3D light. This acts as a form of level of detail (LOD) and can be used to improve performance. Equivalent to [godot.Light3D.distanceFadeEnabled], [godot.Light3D.distanceFadeBegin], [godot.Light3D.distanceFadeShadow], and [godot.Light3D.distanceFadeLength].
   */
  public fun lightSetDistanceFade(
    decal: RID,
    enabled: Boolean,
    begin: Float,
    shadow: Float,
    length: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to decal, BOOL to enabled, DOUBLE to begin.toDouble(), DOUBLE to shadow.toDouble(), DOUBLE to length.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_SET_DISTANCE_FADE, NIL)
  }

  /**
   * If `true`, reverses the backface culling of the mesh. This can be useful when you have a flat mesh that has a light behind it. If you need to cast a shadow on both sides of the mesh, set the mesh to use double-sided shadows with [instanceGeometrySetCastShadowsSetting]. Equivalent to [godot.Light3D.shadowReverseCullFace].
   */
  public fun lightSetReverseCullFaceMode(light: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_SET_REVERSE_CULL_FACE_MODE, NIL)
  }

  /**
   * Sets the bake mode to use for the specified 3D light. Equivalent to [godot.Light3D.lightBakeMode].
   */
  public fun lightSetBakeMode(light: RID, bakeMode: LightBakeMode): Unit {
    TransferContext.writeArguments(_RID to light, LONG to bakeMode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_SET_BAKE_MODE,
        NIL)
  }

  /**
   * Sets the maximum SDFGI cascade in which the 3D light's indirect lighting is rendered. Higher values allow the light to be rendered in SDFGI further away from the camera.
   */
  public fun lightSetMaxSdfgiCascade(light: RID, cascade: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to cascade)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_SET_MAX_SDFGI_CASCADE, NIL)
  }

  /**
   * Sets whether to use a dual paraboloid or a cubemap for the shadow map. Dual paraboloid is faster but may suffer from artifacts. Equivalent to [godot.OmniLight3D.omniShadowMode].
   */
  public fun lightOmniSetShadowMode(light: RID, mode: LightOmniShadowMode): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_OMNI_SET_SHADOW_MODE, NIL)
  }

  /**
   * Sets the shadow mode for this directional light. Equivalent to [godot.DirectionalLight3D.directionalShadowMode]. See [enum LightDirectionalShadowMode] for options.
   */
  public fun lightDirectionalSetShadowMode(light: RID, mode: LightDirectionalShadowMode): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_DIRECTIONAL_SET_SHADOW_MODE, NIL)
  }

  /**
   * If `true`, this directional light will blend between shadow map splits resulting in a smoother transition between them. Equivalent to [godot.DirectionalLight3D.directionalShadowBlendSplits].
   */
  public fun lightDirectionalSetBlendSplits(light: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_DIRECTIONAL_SET_BLEND_SPLITS, NIL)
  }

  /**
   * If `true`, this light will not be used for anything except sky shaders. Use this for lights that impact your sky shader that you may want to hide from affecting the rest of the scene. For example, you may want to enable this when the sun in your sky shader falls below the horizon.
   */
  public fun lightDirectionalSetSkyMode(light: RID, mode: LightDirectionalSkyMode): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_DIRECTIONAL_SET_SKY_MODE, NIL)
  }

  /**
   * Sets the texture filter mode to use when rendering light projectors. This parameter is global and cannot be set on a per-light basis.
   */
  public fun lightProjectorsSetFilter(filter: LightProjectorFilter): Unit {
    TransferContext.writeArguments(LONG to filter.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_PROJECTORS_SET_FILTER, NIL)
  }

  /**
   * Sets the filter quality for omni and spot light shadows in 3D. See also [godot.ProjectSettings.rendering/lightsAndShadows/positionalShadow/softShadowFilterQuality]. This parameter is global and cannot be set on a per-viewport basis.
   */
  public fun positionalSoftShadowFilterSetQuality(quality: ShadowQuality): Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_POSITIONAL_SOFT_SHADOW_FILTER_SET_QUALITY, NIL)
  }

  /**
   * Sets the filter [quality] for directional light shadows in 3D. See also [godot.ProjectSettings.rendering/lightsAndShadows/directionalShadow/softShadowFilterQuality]. This parameter is global and cannot be set on a per-viewport basis.
   */
  public fun directionalSoftShadowFilterSetQuality(quality: ShadowQuality): Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DIRECTIONAL_SOFT_SHADOW_FILTER_SET_QUALITY, NIL)
  }

  /**
   * Sets the [size] of the directional light shadows in 3D. See also [godot.ProjectSettings.rendering/lightsAndShadows/directionalShadow/size]. This parameter is global and cannot be set on a per-viewport basis.
   */
  public fun directionalShadowAtlasSetSize(size: Int, is16bits: Boolean): Unit {
    TransferContext.writeArguments(LONG to size.toLong(), BOOL to is16bits)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DIRECTIONAL_SHADOW_ATLAS_SET_SIZE, NIL)
  }

  /**
   * Creates a reflection probe and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `reflection_probe_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * To place in a scene, attach this reflection probe to an instance using [instanceSetBase] using the returned RID.
   *
   * **Note:** The equivalent node is [godot.ReflectionProbe].
   */
  public fun reflectionProbeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets how often the reflection probe updates. Can either be once or every frame. See [enum ReflectionProbeUpdateMode] for options.
   */
  public fun reflectionProbeSetUpdateMode(probe: RID, mode: ReflectionProbeUpdateMode): Unit {
    TransferContext.writeArguments(_RID to probe, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_UPDATE_MODE, NIL)
  }

  /**
   * Sets the intensity of the reflection probe. Intensity modulates the strength of the reflection. Equivalent to [godot.ReflectionProbe.intensity].
   */
  public fun reflectionProbeSetIntensity(probe: RID, intensity: Float): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to intensity.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_INTENSITY, NIL)
  }

  /**
   * Sets the reflection probe's ambient light mode. Equivalent to [godot.ReflectionProbe.ambientMode].
   */
  public fun reflectionProbeSetAmbientMode(probe: RID, mode: ReflectionProbeAmbientMode): Unit {
    TransferContext.writeArguments(_RID to probe, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_AMBIENT_MODE, NIL)
  }

  /**
   * Sets the reflection probe's custom ambient light color. Equivalent to [godot.ReflectionProbe.ambientColor].
   */
  public fun reflectionProbeSetAmbientColor(probe: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to probe, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_AMBIENT_COLOR, NIL)
  }

  /**
   * Sets the reflection probe's custom ambient light energy. Equivalent to [godot.ReflectionProbe.ambientColorEnergy].
   */
  public fun reflectionProbeSetAmbientEnergy(probe: RID, energy: Float): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to energy.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_AMBIENT_ENERGY, NIL)
  }

  /**
   * Sets the max distance away from the probe an object can be before it is culled. Equivalent to [godot.ReflectionProbe.maxDistance].
   */
  public fun reflectionProbeSetMaxDistance(probe: RID, distance: Float): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to distance.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_MAX_DISTANCE, NIL)
  }

  /**
   * Sets the size of the area that the reflection probe will capture. Equivalent to [godot.ReflectionProbe.size].
   */
  public fun reflectionProbeSetSize(probe: RID, size: Vector3): Unit {
    TransferContext.writeArguments(_RID to probe, VECTOR3 to size)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_SIZE, NIL)
  }

  /**
   * Sets the origin offset to be used when this reflection probe is in box project mode. Equivalent to [godot.ReflectionProbe.originOffset].
   */
  public fun reflectionProbeSetOriginOffset(probe: RID, offset: Vector3): Unit {
    TransferContext.writeArguments(_RID to probe, VECTOR3 to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_ORIGIN_OFFSET, NIL)
  }

  /**
   * If `true`, reflections will ignore sky contribution. Equivalent to [godot.ReflectionProbe.interior].
   */
  public fun reflectionProbeSetAsInterior(probe: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_AS_INTERIOR, NIL)
  }

  /**
   * If `true`, uses box projection. This can make reflections look more correct in certain situations. Equivalent to [godot.ReflectionProbe.boxProjection].
   */
  public fun reflectionProbeSetEnableBoxProjection(probe: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_ENABLE_BOX_PROJECTION, NIL)
  }

  /**
   * If `true`, computes shadows in the reflection probe. This makes the reflection much slower to compute. Equivalent to [godot.ReflectionProbe.enableShadows].
   */
  public fun reflectionProbeSetEnableShadows(probe: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_ENABLE_SHADOWS, NIL)
  }

  /**
   * Sets the render cull mask for this reflection probe. Only instances with a matching cull mask will be rendered by this probe. Equivalent to [godot.ReflectionProbe.cullMask].
   */
  public fun reflectionProbeSetCullMask(probe: RID, layers: Long): Unit {
    TransferContext.writeArguments(_RID to probe, LONG to layers)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_CULL_MASK, NIL)
  }

  /**
   * Sets the resolution to use when rendering the specified reflection probe. The [resolution] is specified for each cubemap face: for instance, specifying `512` will allocate 6 faces of 512×512 each (plus mipmaps for roughness levels).
   */
  public fun reflectionProbeSetResolution(probe: RID, resolution: Int): Unit {
    TransferContext.writeArguments(_RID to probe, LONG to resolution.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_RESOLUTION, NIL)
  }

  /**
   * Sets the mesh level of detail to use in the reflection probe rendering. Higher values will use less detailed versions of meshes that have LOD variations generated, which can improve performance. Equivalent to [godot.ReflectionProbe.meshLodThreshold].
   */
  public fun reflectionProbeSetMeshLodThreshold(probe: RID, pixels: Float): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to pixels.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_MESH_LOD_THRESHOLD, NIL)
  }

  /**
   * Creates a decal and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `decal_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * To place in a scene, attach this decal to an instance using [instanceSetBase] using the returned RID.
   *
   * **Note:** The equivalent node is [godot.Decal].
   */
  public fun decalCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the [size] of the decal specified by the [decal] RID. Equivalent to [godot.Decal.size].
   */
  public fun decalSetSize(decal: RID, size: Vector3): Unit {
    TransferContext.writeArguments(_RID to decal, VECTOR3 to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_SIZE, NIL)
  }

  /**
   * Sets the [texture] in the given texture [type] slot for the specified decal. Equivalent to [godot.Decal.setTexture].
   */
  public fun decalSetTexture(
    decal: RID,
    type: DecalTexture,
    texture: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to decal, LONG to type.id, _RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_TEXTURE,
        NIL)
  }

  /**
   * Sets the emission [energy] in the decal specified by the [decal] RID. Equivalent to [godot.Decal.emissionEnergy].
   */
  public fun decalSetEmissionEnergy(decal: RID, energy: Float): Unit {
    TransferContext.writeArguments(_RID to decal, DOUBLE to energy.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_EMISSION_ENERGY, NIL)
  }

  /**
   * Sets the [albedoMix] in the decal specified by the [decal] RID. Equivalent to [godot.Decal.albedoMix].
   */
  public fun decalSetAlbedoMix(decal: RID, albedoMix: Float): Unit {
    TransferContext.writeArguments(_RID to decal, DOUBLE to albedoMix.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_ALBEDO_MIX, NIL)
  }

  /**
   * Sets the color multiplier in the decal specified by the [decal] RID to [color]. Equivalent to [godot.Decal.modulate].
   */
  public fun decalSetModulate(decal: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to decal, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_MODULATE,
        NIL)
  }

  /**
   * Sets the cull [mask] in the decal specified by the [decal] RID. Equivalent to [godot.Decal.cullMask].
   */
  public fun decalSetCullMask(decal: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to decal, LONG to mask)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_CULL_MASK,
        NIL)
  }

  /**
   * Sets the distance fade parameters in the decal specified by the [decal] RID. Equivalent to [godot.Decal.distanceFadeEnabled], [godot.Decal.distanceFadeBegin] and [godot.Decal.distanceFadeLength].
   */
  public fun decalSetDistanceFade(
    decal: RID,
    enabled: Boolean,
    begin: Float,
    length: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to decal, BOOL to enabled, DOUBLE to begin.toDouble(), DOUBLE to length.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_DISTANCE_FADE, NIL)
  }

  /**
   * Sets the upper fade ([above]) and lower fade ([below]) in the decal specified by the [decal] RID. Equivalent to [godot.Decal.upperFade] and [godot.Decal.lowerFade].
   */
  public fun decalSetFade(
    decal: RID,
    above: Float,
    below: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to decal, DOUBLE to above.toDouble(), DOUBLE to below.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_FADE, NIL)
  }

  /**
   * Sets the normal [fade] in the decal specified by the [decal] RID. Equivalent to [godot.Decal.normalFade].
   */
  public fun decalSetNormalFade(decal: RID, fade: Float): Unit {
    TransferContext.writeArguments(_RID to decal, DOUBLE to fade.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_NORMAL_FADE, NIL)
  }

  /**
   * Sets the texture [filter] mode to use when rendering decals. This parameter is global and cannot be set on a per-decal basis.
   */
  public fun decalsSetFilter(filter: DecalFilter): Unit {
    TransferContext.writeArguments(LONG to filter.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECALS_SET_FILTER,
        NIL)
  }

  /**
   * If [halfResolution] is `true`, renders [godot.VoxelGI] and SDFGI ([godot.Environment.sdfgiEnabled]) buffers at halved resolution on each axis (e.g. 960×540 when the viewport size is 1920×1080). This improves performance significantly when VoxelGI or SDFGI is enabled, at the cost of artifacts that may be visible on polygon edges. The loss in quality becomes less noticeable as the viewport resolution increases. [godot.LightmapGI] rendering is not affected by this setting. Equivalent to [godot.ProjectSettings.rendering/globalIllumination/gi/useHalfResolution].
   */
  public fun giSetUseHalfResolution(halfResolution: Boolean): Unit {
    TransferContext.writeArguments(BOOL to halfResolution)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GI_SET_USE_HALF_RESOLUTION, NIL)
  }

  /**
   * Creates a new voxel-based global illumination object and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `voxel_gi_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent node is [godot.VoxelGI].
   */
  public fun voxelGiCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   *
   */
  public fun voxelGiAllocateData(
    voxelGi: RID,
    toCellXform: Transform3D,
    aabb: AABB,
    octreeSize: Vector3i,
    octreeCells: PackedByteArray,
    dataCells: PackedByteArray,
    distanceField: PackedByteArray,
    levelCounts: PackedInt32Array,
  ): Unit {
    TransferContext.writeArguments(_RID to voxelGi, TRANSFORM3D to toCellXform, godot.core.VariantType.AABB to aabb, VECTOR3I to octreeSize, PACKED_BYTE_ARRAY to octreeCells, PACKED_BYTE_ARRAY to dataCells, PACKED_BYTE_ARRAY to distanceField, PACKED_INT_32_ARRAY to levelCounts)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_ALLOCATE_DATA, NIL)
  }

  /**
   *
   */
  public fun voxelGiGetOctreeSize(voxelGi: RID): Vector3i {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_GET_OCTREE_SIZE, VECTOR3I)
    return (TransferContext.readReturnValue(VECTOR3I, false) as Vector3i)
  }

  /**
   *
   */
  public fun voxelGiGetOctreeCells(voxelGi: RID): PackedByteArray {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_GET_OCTREE_CELLS, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   *
   */
  public fun voxelGiGetDataCells(voxelGi: RID): PackedByteArray {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_GET_DATA_CELLS, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   *
   */
  public fun voxelGiGetDistanceField(voxelGi: RID): PackedByteArray {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_GET_DISTANCE_FIELD, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   *
   */
  public fun voxelGiGetLevelCounts(voxelGi: RID): PackedInt32Array {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_GET_LEVEL_COUNTS, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   *
   */
  public fun voxelGiGetToCellXform(voxelGi: RID): Transform3D {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_GET_TO_CELL_XFORM, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Sets the [godot.VoxelGIData.dynamicRange] value to use on the specified [voxelGi]'s [RID].
   */
  public fun voxelGiSetDynamicRange(voxelGi: RID, range: Float): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to range.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_DYNAMIC_RANGE, NIL)
  }

  /**
   * Sets the [godot.VoxelGIData.propagation] value to use on the specified [voxelGi]'s [RID].
   */
  public fun voxelGiSetPropagation(voxelGi: RID, amount: Float): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_PROPAGATION, NIL)
  }

  /**
   * Sets the [godot.VoxelGIData.energy] value to use on the specified [voxelGi]'s [RID].
   */
  public fun voxelGiSetEnergy(voxelGi: RID, energy: Float): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to energy.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_ENERGY,
        NIL)
  }

  /**
   * Used to inform the renderer what exposure normalization value was used while baking the voxel gi. This value will be used and modulated at run time to ensure that the voxel gi maintains a consistent level of exposure even if the scene-wide exposure normalization is changed at run time. For more information see [cameraAttributesSetExposure].
   */
  public fun voxelGiSetBakedExposureNormalization(voxelGi: RID, bakedExposure: Float): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to bakedExposure.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_BAKED_EXPOSURE_NORMALIZATION, NIL)
  }

  /**
   * Sets the [godot.VoxelGIData.bias] value to use on the specified [voxelGi]'s [RID].
   */
  public fun voxelGiSetBias(voxelGi: RID, bias: Float): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to bias.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_BIAS,
        NIL)
  }

  /**
   * Sets the [godot.VoxelGIData.normalBias] value to use on the specified [voxelGi]'s [RID].
   */
  public fun voxelGiSetNormalBias(voxelGi: RID, bias: Float): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to bias.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_NORMAL_BIAS, NIL)
  }

  /**
   * Sets the [godot.VoxelGIData.interior] value to use on the specified [voxelGi]'s [RID].
   */
  public fun voxelGiSetInterior(voxelGi: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to voxelGi, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_INTERIOR, NIL)
  }

  /**
   * Sets the [godot.VoxelGIData.useTwoBounces] value to use on the specified [voxelGi]'s [RID].
   */
  public fun voxelGiSetUseTwoBounces(voxelGi: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to voxelGi, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_USE_TWO_BOUNCES, NIL)
  }

  /**
   * Sets the [godot.ProjectSettings.rendering/globalIllumination/voxelGi/quality] value to use when rendering. This parameter is global and cannot be set on a per-VoxelGI basis.
   */
  public fun voxelGiSetQuality(quality: VoxelGIQuality): Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_QUALITY, NIL)
  }

  /**
   * Creates a new lightmap global illumination instance and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `lightmap_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent node is [godot.LightmapGI].
   */
  public fun lightmapCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Set the textures on the given [lightmap] GI instance to the texture array pointed to by the [light] RID. If the lightmap texture was baked with [godot.LightmapGI.directional] set to `true`, then [usesSh] must also be `true`.
   */
  public fun lightmapSetTextures(
    lightmap: RID,
    light: RID,
    usesSh: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to lightmap, _RID to light, BOOL to usesSh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_SET_TEXTURES, NIL)
  }

  /**
   *
   */
  public fun lightmapSetProbeBounds(lightmap: RID, bounds: AABB): Unit {
    TransferContext.writeArguments(_RID to lightmap, godot.core.VariantType.AABB to bounds)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_SET_PROBE_BOUNDS, NIL)
  }

  /**
   *
   */
  public fun lightmapSetProbeInterior(lightmap: RID, interior: Boolean): Unit {
    TransferContext.writeArguments(_RID to lightmap, BOOL to interior)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_SET_PROBE_INTERIOR, NIL)
  }

  /**
   *
   */
  public fun lightmapSetProbeCaptureData(
    lightmap: RID,
    points: PackedVector3Array,
    pointSh: PackedColorArray,
    tetrahedra: PackedInt32Array,
    bspTree: PackedInt32Array,
  ): Unit {
    TransferContext.writeArguments(_RID to lightmap, PACKED_VECTOR3_ARRAY to points, PACKED_COLOR_ARRAY to pointSh, PACKED_INT_32_ARRAY to tetrahedra, PACKED_INT_32_ARRAY to bspTree)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_SET_PROBE_CAPTURE_DATA, NIL)
  }

  /**
   *
   */
  public fun lightmapGetProbeCapturePoints(lightmap: RID): PackedVector3Array {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_GET_PROBE_CAPTURE_POINTS,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  /**
   *
   */
  public fun lightmapGetProbeCaptureSh(lightmap: RID): PackedColorArray {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_GET_PROBE_CAPTURE_SH, PACKED_COLOR_ARRAY)
    return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray)
  }

  /**
   *
   */
  public fun lightmapGetProbeCaptureTetrahedra(lightmap: RID): PackedInt32Array {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_GET_PROBE_CAPTURE_TETRAHEDRA,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   *
   */
  public fun lightmapGetProbeCaptureBspTree(lightmap: RID): PackedInt32Array {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_GET_PROBE_CAPTURE_BSP_TREE,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Used to inform the renderer what exposure normalization value was used while baking the lightmap. This value will be used and modulated at run time to ensure that the lightmap maintains a consistent level of exposure even if the scene-wide exposure normalization is changed at run time. For more information see [cameraAttributesSetExposure].
   */
  public fun lightmapSetBakedExposureNormalization(lightmap: RID, bakedExposure: Float): Unit {
    TransferContext.writeArguments(_RID to lightmap, DOUBLE to bakedExposure.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_SET_BAKED_EXPOSURE_NORMALIZATION, NIL)
  }

  /**
   *
   */
  public fun lightmapSetProbeCaptureUpdateSpeed(speed: Float): Unit {
    TransferContext.writeArguments(DOUBLE to speed.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_SET_PROBE_CAPTURE_UPDATE_SPEED, NIL)
  }

  /**
   * Creates a GPU-based particle system and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `particles_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * To place in a scene, attach these particles to an instance using [instanceSetBase] using the returned RID.
   *
   * **Note:** The equivalent nodes are [godot.GPUParticles2D] and [godot.GPUParticles3D].
   *
   * **Note:** All `particles_*` methods only apply to GPU-based particles, not CPU-based particles. [godot.CPUParticles2D] and [godot.CPUParticles3D] do not have equivalent RenderingServer functions available, as these use [godot.MultiMeshInstance2D] and [godot.MultiMeshInstance3D] under the hood (see `multimesh_*` methods).
   */
  public fun particlesCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets whether the GPU particles specified by the [particles] RID should be rendered in 2D or 3D according to [mode].
   */
  public fun particlesSetMode(particles: RID, mode: ParticlesMode): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_MODE,
        NIL)
  }

  /**
   * If `true`, particles will emit over time. Setting to false does not reset the particles, but only stops their emission. Equivalent to [godot.GPUParticles3D.emitting].
   */
  public fun particlesSetEmitting(particles: RID, emitting: Boolean): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to emitting)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_EMITTING, NIL)
  }

  /**
   * Returns `true` if particles are currently set to emitting.
   */
  public fun particlesGetEmitting(particles: RID): Boolean {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_GET_EMITTING, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the number of particles to be drawn and allocates the memory for them. Equivalent to [godot.GPUParticles3D.amount].
   */
  public fun particlesSetAmount(particles: RID, amount: Int): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to amount.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_AMOUNT, NIL)
  }

  /**
   * Sets the lifetime of each particle in the system. Equivalent to [godot.GPUParticles3D.lifetime].
   */
  public fun particlesSetLifetime(particles: RID, lifetime: Double): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to lifetime)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_LIFETIME, NIL)
  }

  /**
   * If `true`, particles will emit once and then stop. Equivalent to [godot.GPUParticles3D.oneShot].
   */
  public fun particlesSetOneShot(particles: RID, oneShot: Boolean): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to oneShot)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_ONE_SHOT, NIL)
  }

  /**
   * Sets the preprocess time for the particles' animation. This lets you delay starting an animation until after the particles have begun emitting. Equivalent to [godot.GPUParticles3D.preprocess].
   */
  public fun particlesSetPreProcessTime(particles: RID, time: Double): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to time)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_PRE_PROCESS_TIME, NIL)
  }

  /**
   * Sets the explosiveness ratio. Equivalent to [godot.GPUParticles3D.explosiveness].
   */
  public fun particlesSetExplosivenessRatio(particles: RID, ratio: Float): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_EXPLOSIVENESS_RATIO, NIL)
  }

  /**
   * Sets the emission randomness ratio. This randomizes the emission of particles within their phase. Equivalent to [godot.GPUParticles3D.randomness].
   */
  public fun particlesSetRandomnessRatio(particles: RID, ratio: Float): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_RANDOMNESS_RATIO, NIL)
  }

  /**
   * Sets a custom axis-aligned bounding box for the particle system. Equivalent to [godot.GPUParticles3D.visibilityAabb].
   */
  public fun particlesSetCustomAabb(particles: RID, aabb: AABB): Unit {
    TransferContext.writeArguments(_RID to particles, godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_CUSTOM_AABB, NIL)
  }

  /**
   * Sets the speed scale of the particle system. Equivalent to [godot.GPUParticles3D.speedScale].
   */
  public fun particlesSetSpeedScale(particles: RID, scale: Double): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to scale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_SPEED_SCALE, NIL)
  }

  /**
   * If `true`, particles use local coordinates. If `false` they use global coordinates. Equivalent to [godot.GPUParticles3D.localCoords].
   */
  public fun particlesSetUseLocalCoordinates(particles: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_USE_LOCAL_COORDINATES, NIL)
  }

  /**
   * Sets the material for processing the particles.
   *
   * **Note:** This is not the material used to draw the materials. Equivalent to [godot.GPUParticles3D.processMaterial].
   */
  public fun particlesSetProcessMaterial(particles: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to particles, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_PROCESS_MATERIAL, NIL)
  }

  /**
   * Sets the frame rate that the particle system rendering will be fixed to. Equivalent to [godot.GPUParticles3D.fixedFps].
   */
  public fun particlesSetFixedFps(particles: RID, fps: Int): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to fps.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_FIXED_FPS, NIL)
  }

  /**
   *
   */
  public fun particlesSetInterpolate(particles: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_INTERPOLATE, NIL)
  }

  /**
   * If `true`, uses fractional delta which smooths the movement of the particles. Equivalent to [godot.GPUParticles3D.fractDelta].
   */
  public fun particlesSetFractionalDelta(particles: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_FRACTIONAL_DELTA, NIL)
  }

  /**
   *
   */
  public fun particlesSetCollisionBaseSize(particles: RID, size: Float): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to size.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_COLLISION_BASE_SIZE, NIL)
  }

  /**
   *
   */
  public fun particlesSetTransformAlign(particles: RID, align: ParticlesTransformAlign): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to align.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_TRANSFORM_ALIGN, NIL)
  }

  /**
   * If [enable] is `true`, enables trails for the [particles] with the specified [lengthSec] in seconds. Equivalent to [godot.GPUParticles3D.trailEnabled] and [godot.GPUParticles3D.trailLifetime].
   */
  public fun particlesSetTrails(
    particles: RID,
    enable: Boolean,
    lengthSec: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to enable, DOUBLE to lengthSec.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_TRAILS, NIL)
  }

  /**
   *
   */
  public fun particlesSetTrailBindPoses(particles: RID, bindPoses: VariantArray<Transform3D>):
      Unit {
    TransferContext.writeArguments(_RID to particles, ARRAY to bindPoses)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_TRAIL_BIND_POSES, NIL)
  }

  /**
   * Returns `true` if particles are not emitting and particles are set to inactive.
   */
  public fun particlesIsInactive(particles: RID): Boolean {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_IS_INACTIVE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Add particle system to list of particle systems that need to be updated. Update will take place on the next frame, or on the next call to [instancesCullAabb], [instancesCullConvex], or [instancesCullRay].
   */
  public fun particlesRequestProcess(particles: RID): Unit {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_REQUEST_PROCESS, NIL)
  }

  /**
   * Reset the particles on the next update. Equivalent to [godot.GPUParticles3D.restart].
   */
  public fun particlesRestart(particles: RID): Unit {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_RESTART,
        NIL)
  }

  /**
   *
   */
  public fun particlesSetSubemitter(particles: RID, subemitterParticles: RID): Unit {
    TransferContext.writeArguments(_RID to particles, _RID to subemitterParticles)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_SUBEMITTER, NIL)
  }

  /**
   * Manually emits particles from the [particles] instance.
   */
  public fun particlesEmit(
    particles: RID,
    transform: Transform3D,
    velocity: Vector3,
    color: Color,
    custom: Color,
    emitFlags: Long,
  ): Unit {
    TransferContext.writeArguments(_RID to particles, TRANSFORM3D to transform, VECTOR3 to velocity, COLOR to color, COLOR to custom, LONG to emitFlags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_EMIT, NIL)
  }

  /**
   * Sets the draw order of the particles to one of the named enums from [enum ParticlesDrawOrder]. See [enum ParticlesDrawOrder] for options. Equivalent to [godot.GPUParticles3D.drawOrder].
   */
  public fun particlesSetDrawOrder(particles: RID, order: ParticlesDrawOrder): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to order.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_DRAW_ORDER, NIL)
  }

  /**
   * Sets the number of draw passes to use. Equivalent to [godot.GPUParticles3D.drawPasses].
   */
  public fun particlesSetDrawPasses(particles: RID, count: Int): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to count.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_DRAW_PASSES, NIL)
  }

  /**
   * Sets the mesh to be used for the specified draw pass. Equivalent to [godot.GPUParticles3D.drawPass1], [godot.GPUParticles3D.drawPass2], [godot.GPUParticles3D.drawPass3], and [godot.GPUParticles3D.drawPass4].
   */
  public fun particlesSetDrawPassMesh(
    particles: RID,
    pass: Int,
    mesh: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to pass.toLong(), _RID to mesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_DRAW_PASS_MESH, NIL)
  }

  /**
   * Calculates and returns the axis-aligned bounding box that contains all the particles. Equivalent to [godot.GPUParticles3D.captureAabb].
   */
  public fun particlesGetCurrentAabb(particles: RID): AABB {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_GET_CURRENT_AABB,
        godot.core.VariantType.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
  }

  /**
   * Sets the [godot.Transform3D] that will be used by the particles when they first emit.
   */
  public fun particlesSetEmissionTransform(particles: RID, transform: Transform3D): Unit {
    TransferContext.writeArguments(_RID to particles, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_EMISSION_TRANSFORM, NIL)
  }

  /**
   * Creates a new 3D GPU particle collision or attractor and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID can be used in most `particles_collision_*` RenderingServer functions.
   *
   * **Note:** The equivalent nodes are [godot.GPUParticlesCollision3D] and [godot.GPUParticlesAttractor3D].
   */
  public fun particlesCollisionCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the collision or attractor shape [type] for the 3D GPU particles collision or attractor specified by the [particlesCollision] RID.
   */
  public fun particlesCollisionSetCollisionType(particlesCollision: RID,
      type: ParticlesCollisionType): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, LONG to type.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_COLLISION_TYPE, NIL)
  }

  /**
   * Sets the cull [mask] for the 3D GPU particles collision or attractor specified by the [particlesCollision] RID. Equivalent to [godot.GPUParticlesCollision3D.cullMask] or [godot.GPUParticlesAttractor3D.cullMask] depending on the [particlesCollision] type.
   */
  public fun particlesCollisionSetCullMask(particlesCollision: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_CULL_MASK, NIL)
  }

  /**
   * Sets the [radius] for the 3D GPU particles sphere collision or attractor specified by the [particlesCollision] RID. Equivalent to [godot.GPUParticlesCollisionSphere3D.radius] or [godot.GPUParticlesAttractorSphere3D.radius] depending on the [particlesCollision] type.
   */
  public fun particlesCollisionSetSphereRadius(particlesCollision: RID, radius: Float): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_SPHERE_RADIUS, NIL)
  }

  /**
   * Sets the [extents] for the 3D GPU particles collision by the [particlesCollision] RID. Equivalent to [godot.GPUParticlesCollisionBox3D.size], [godot.GPUParticlesCollisionSDF3D.size], [godot.GPUParticlesCollisionHeightField3D.size], [godot.GPUParticlesAttractorBox3D.size] or [godot.GPUParticlesAttractorVectorField3D.size] depending on the [particlesCollision] type.
   */
  public fun particlesCollisionSetBoxExtents(particlesCollision: RID, extents: Vector3): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, VECTOR3 to extents)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_BOX_EXTENTS, NIL)
  }

  /**
   * Sets the [strength] for the 3D GPU particles attractor specified by the [particlesCollision] RID. Only used for attractors, not colliders. Equivalent to [godot.GPUParticlesAttractor3D.strength].
   */
  public fun particlesCollisionSetAttractorStrength(particlesCollision: RID, strength: Float):
      Unit {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to strength.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_ATTRACTOR_STRENGTH, NIL)
  }

  /**
   * Sets the directionality [amount] for the 3D GPU particles attractor specified by the [particlesCollision] RID. Only used for attractors, not colliders. Equivalent to [godot.GPUParticlesAttractor3D.directionality].
   */
  public fun particlesCollisionSetAttractorDirectionality(particlesCollision: RID, amount: Float):
      Unit {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_ATTRACTOR_DIRECTIONALITY,
        NIL)
  }

  /**
   * Sets the attenuation [curve] for the 3D GPU particles attractor specified by the [particlesCollision] RID. Only used for attractors, not colliders. Equivalent to [godot.GPUParticlesAttractor3D.attenuation].
   */
  public fun particlesCollisionSetAttractorAttenuation(particlesCollision: RID, curve: Float):
      Unit {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to curve.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_ATTRACTOR_ATTENUATION, NIL)
  }

  /**
   * Sets the signed distance field [texture] for the 3D GPU particles collision specified by the [particlesCollision] RID. Equivalent to [godot.GPUParticlesCollisionSDF3D.texture] or [godot.GPUParticlesAttractorVectorField3D.texture] depending on the [particlesCollision] type.
   */
  public fun particlesCollisionSetFieldTexture(particlesCollision: RID, texture: RID): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_FIELD_TEXTURE, NIL)
  }

  /**
   * Requests an update for the 3D GPU particle collision heightfield. This may be automatically called by the 3D GPU particle collision heightfield depending on its [godot.GPUParticlesCollisionHeightField3D.updateMode].
   */
  public fun particlesCollisionHeightFieldUpdate(particlesCollision: RID): Unit {
    TransferContext.writeArguments(_RID to particlesCollision)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_HEIGHT_FIELD_UPDATE, NIL)
  }

  /**
   * Sets the heightmap [resolution] for the 3D GPU particles heightfield collision specified by the [particlesCollision] RID. Equivalent to [godot.GPUParticlesCollisionHeightField3D.resolution].
   */
  public fun particlesCollisionSetHeightFieldResolution(particlesCollision: RID,
      resolution: ParticlesCollisionHeightfieldResolution): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, LONG to resolution.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_HEIGHT_FIELD_RESOLUTION,
        NIL)
  }

  /**
   * Creates a new fog volume and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `fog_volume_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent node is [godot.FogVolume].
   */
  public fun fogVolumeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_FOG_VOLUME_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the shape of the fog volume to either [godot.RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID], [godot.RenderingServer.FOG_VOLUME_SHAPE_CONE], [godot.RenderingServer.FOG_VOLUME_SHAPE_CYLINDER], [godot.RenderingServer.FOG_VOLUME_SHAPE_BOX] or [godot.RenderingServer.FOG_VOLUME_SHAPE_WORLD].
   */
  public fun fogVolumeSetShape(fogVolume: RID, shape: FogVolumeShape): Unit {
    TransferContext.writeArguments(_RID to fogVolume, LONG to shape.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_FOG_VOLUME_SET_SHAPE, NIL)
  }

  /**
   * Sets the size of the fog volume when shape is [godot.RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID], [godot.RenderingServer.FOG_VOLUME_SHAPE_CONE], [godot.RenderingServer.FOG_VOLUME_SHAPE_CYLINDER] or [godot.RenderingServer.FOG_VOLUME_SHAPE_BOX].
   */
  public fun fogVolumeSetSize(fogVolume: RID, size: Vector3): Unit {
    TransferContext.writeArguments(_RID to fogVolume, VECTOR3 to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_FOG_VOLUME_SET_SIZE,
        NIL)
  }

  /**
   * Sets the [godot.Material] of the fog volume. Can be either a [godot.FogMaterial] or a custom [godot.ShaderMaterial].
   */
  public fun fogVolumeSetMaterial(fogVolume: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to fogVolume, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_FOG_VOLUME_SET_MATERIAL, NIL)
  }

  /**
   * Creates a new 3D visibility notifier object and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `visibility_notifier_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * To place in a scene, attach this mesh to an instance using [instanceSetBase] using the returned RID.
   *
   * **Note:** The equivalent node is [godot.VisibleOnScreenNotifier3D].
   */
  public fun visibilityNotifierCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VISIBILITY_NOTIFIER_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   *
   */
  public fun visibilityNotifierSetAabb(notifier: RID, aabb: AABB): Unit {
    TransferContext.writeArguments(_RID to notifier, godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VISIBILITY_NOTIFIER_SET_AABB, NIL)
  }

  /**
   *
   */
  public fun visibilityNotifierSetCallbacks(
    notifier: RID,
    enterCallable: Callable,
    exitCallable: Callable,
  ): Unit {
    TransferContext.writeArguments(_RID to notifier, CALLABLE to enterCallable, CALLABLE to exitCallable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VISIBILITY_NOTIFIER_SET_CALLBACKS, NIL)
  }

  /**
   * Creates an occluder instance and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `occluder_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent resource is [godot.Occluder3D] (not to be confused with the [godot.OccluderInstance3D] node).
   */
  public fun occluderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_OCCLUDER_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the mesh data for the given occluder RID, which controls the shape of the occlusion culling that will be performed.
   */
  public fun occluderSetMesh(
    occluder: RID,
    vertices: PackedVector3Array,
    indices: PackedInt32Array,
  ): Unit {
    TransferContext.writeArguments(_RID to occluder, PACKED_VECTOR3_ARRAY to vertices, PACKED_INT_32_ARRAY to indices)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_OCCLUDER_SET_MESH,
        NIL)
  }

  /**
   * Creates a 3D camera and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `camera_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent node is [godot.Camera3D].
   */
  public fun cameraCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets camera to use perspective projection. Objects on the screen becomes smaller when they are far away.
   */
  public fun cameraSetPerspective(
    camera: RID,
    fovyDegrees: Float,
    zNear: Float,
    zFar: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to camera, DOUBLE to fovyDegrees.toDouble(), DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_SET_PERSPECTIVE, NIL)
  }

  /**
   * Sets camera to use orthogonal projection, also known as orthographic projection. Objects remain the same size on the screen no matter how far away they are.
   */
  public fun cameraSetOrthogonal(
    camera: RID,
    size: Float,
    zNear: Float,
    zFar: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to camera, DOUBLE to size.toDouble(), DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_SET_ORTHOGONAL, NIL)
  }

  /**
   * Sets camera to use frustum projection. This mode allows adjusting the [offset] argument to create "tilted frustum" effects.
   */
  public fun cameraSetFrustum(
    camera: RID,
    size: Float,
    offset: Vector2,
    zNear: Float,
    zFar: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to camera, DOUBLE to size.toDouble(), VECTOR2 to offset, DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_SET_FRUSTUM,
        NIL)
  }

  /**
   * Sets [godot.Transform3D] of camera.
   */
  public fun cameraSetTransform(camera: RID, transform: Transform3D): Unit {
    TransferContext.writeArguments(_RID to camera, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_SET_TRANSFORM, NIL)
  }

  /**
   * Sets the cull mask associated with this camera. The cull mask describes which 3D layers are rendered by this camera. Equivalent to [godot.Camera3D.cullMask].
   */
  public fun cameraSetCullMask(camera: RID, layers: Long): Unit {
    TransferContext.writeArguments(_RID to camera, LONG to layers)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_SET_CULL_MASK, NIL)
  }

  /**
   * Sets the environment used by this camera. Equivalent to [godot.Camera3D.environment].
   */
  public fun cameraSetEnvironment(camera: RID, env: RID): Unit {
    TransferContext.writeArguments(_RID to camera, _RID to env)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_SET_ENVIRONMENT, NIL)
  }

  /**
   * Sets the camera_attributes created with [cameraAttributesCreate] to the given camera.
   */
  public fun cameraSetCameraAttributes(camera: RID, effects: RID): Unit {
    TransferContext.writeArguments(_RID to camera, _RID to effects)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_SET_CAMERA_ATTRIBUTES, NIL)
  }

  /**
   * If `true`, preserves the horizontal aspect ratio which is equivalent to [godot.Camera3D.KEEP_WIDTH]. If `false`, preserves the vertical aspect ratio which is equivalent to [godot.Camera3D.KEEP_HEIGHT].
   */
  public fun cameraSetUseVerticalAspect(camera: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to camera, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_SET_USE_VERTICAL_ASPECT, NIL)
  }

  /**
   * Creates an empty viewport and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `viewport_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent node is [godot.Viewport].
   */
  public fun viewportCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If `true`, the viewport uses augmented or virtual reality technologies. See [godot.XRInterface].
   */
  public fun viewportSetUseXr(viewport: RID, useXr: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to useXr)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_USE_XR,
        NIL)
  }

  /**
   * Sets the viewport's width and height in pixels.
   */
  public fun viewportSetSize(
    viewport: RID,
    width: Int,
    height: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to width.toLong(), LONG to height.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_SIZE,
        NIL)
  }

  /**
   * If `true`, sets the viewport active, else sets it inactive.
   */
  public fun viewportSetActive(viewport: RID, active: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_ACTIVE,
        NIL)
  }

  /**
   * Sets the viewport's parent to the viewport specified by the [parentViewport] RID.
   */
  public fun viewportSetParentViewport(viewport: RID, parentViewport: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to parentViewport)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_PARENT_VIEWPORT, NIL)
  }

  /**
   * Copies the viewport to a region of the screen specified by [rect]. If [viewportSetRenderDirectToScreen] is `true`, then the viewport does not use a framebuffer and the contents of the viewport are rendered directly to screen. However, note that the root viewport is drawn last, therefore it will draw over the screen. Accordingly, you must set the root viewport to an area that does not cover the area that you have attached this viewport to.
   *
   * For example, you can set the root viewport to not render at all with the following code:
   *
   * FIXME: The method seems to be non-existent.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _ready():
   *
   *     get_viewport().set_attach_to_screen_rect(Rect2())
   *
   *     $Viewport.set_attach_to_screen_rect(Rect2(0, 0, 600, 600))
   *
   * [/gdscript]
   *
   * [/codeblocks]
   *
   * Using this can result in significant optimization, especially on lower-end devices. However, it comes at the cost of having to manage your viewports manually. For further optimization, see [viewportSetRenderDirectToScreen].
   */
  @JvmOverloads
  public fun viewportAttachToScreen(
    viewport: RID,
    rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    screen: Int = 0,
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, RECT2 to rect, LONG to screen.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_ATTACH_TO_SCREEN, NIL)
  }

  /**
   * If `true`, render the contents of the viewport directly to screen. This allows a low-level optimization where you can skip drawing a viewport to the root viewport. While this optimization can result in a significant increase in speed (especially on older devices), it comes at a cost of usability. When this is enabled, you cannot read from the viewport or from the screen_texture. You also lose the benefit of certain window settings, such as the various stretch modes. Another consequence to be aware of is that in 2D the rendering happens in window coordinates, so if you have a viewport that is double the size of the window, and you set this, then only the portion that fits within the window will be drawn, no automatic scaling is possible, even if your game scene is significantly larger than the window size.
   */
  public fun viewportSetRenderDirectToScreen(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_RENDER_DIRECT_TO_SCREEN, NIL)
  }

  /**
   * Sets the rendering mask associated with this [godot.Viewport]. Only [godot.CanvasItem] nodes with a matching rendering visibility layer will be rendered by this [godot.Viewport].
   */
  public fun viewportSetCanvasCullMask(viewport: RID, canvasCullMask: Long): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to canvasCullMask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_CANVAS_CULL_MASK, NIL)
  }

  /**
   * Sets the 3D resolution scaling mode. Bilinear scaling renders at different resolution to either undersample or supersample the viewport. FidelityFX Super Resolution 1.0, abbreviated to FSR, is an upscaling technology that produces high quality images at fast framerates by using a spatially aware upscaling algorithm. FSR is slightly more expensive than bilinear, but it produces significantly higher image quality. FSR should be used where possible.
   */
  public fun viewportSetScaling3dMode(viewport: RID, scaling3dMode: ViewportScaling3DMode): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to scaling3dMode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_SCALING_3D_MODE, NIL)
  }

  /**
   * Scales the 3D render buffer based on the viewport size uses an image filter specified in [enum ViewportScaling3DMode] to scale the output image to the full viewport size. Values lower than `1.0` can be used to speed up 3D rendering at the cost of quality (undersampling). Values greater than `1.0` are only valid for bilinear mode and can be used to improve 3D rendering quality at a high performance cost (supersampling). See also [enum ViewportMSAA] for multi-sample antialiasing, which is significantly cheaper but only smoothens the edges of polygons.
   *
   * When using FSR upscaling, AMD recommends exposing the following values as preset options to users "Ultra Quality: 0.77", "Quality: 0.67", "Balanced: 0.59", "Performance: 0.5" instead of exposing the entire scale.
   */
  public fun viewportSetScaling3dScale(viewport: RID, scale: Float): Unit {
    TransferContext.writeArguments(_RID to viewport, DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_SCALING_3D_SCALE, NIL)
  }

  /**
   * Determines how sharp the upscaled image will be when using the FSR upscaling mode. Sharpness halves with every whole number. Values go from 0.0 (sharpest) to 2.0. Values above 2.0 won't make a visible difference.
   */
  public fun viewportSetFsrSharpness(viewport: RID, sharpness: Float): Unit {
    TransferContext.writeArguments(_RID to viewport, DOUBLE to sharpness.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_FSR_SHARPNESS, NIL)
  }

  /**
   * Affects the final texture sharpness by reading from a lower or higher mipmap (also called "texture LOD bias"). Negative values make mipmapped textures sharper but grainier when viewed at a distance, while positive values make mipmapped textures blurrier (even when up close). To get sharper textures at a distance without introducing too much graininess, set this between `-0.75` and `0.0`. Enabling temporal antialiasing ([godot.ProjectSettings.rendering/antiAliasing/quality/useTaa]) can help reduce the graininess visible when using negative mipmap bias.
   *
   * **Note:** When the 3D scaling mode is set to FSR 1.0, this value is used to adjust the automatic mipmap bias which is calculated internally based on the scale factor. The formula for this is `-log2(1.0 / scale) + mipmap_bias`.
   */
  public fun viewportSetTextureMipmapBias(viewport: RID, mipmapBias: Float): Unit {
    TransferContext.writeArguments(_RID to viewport, DOUBLE to mipmapBias.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_TEXTURE_MIPMAP_BIAS, NIL)
  }

  /**
   * Sets when the viewport should be updated. See [enum ViewportUpdateMode] constants for options.
   */
  public fun viewportSetUpdateMode(viewport: RID, updateMode: ViewportUpdateMode): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to updateMode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_UPDATE_MODE, NIL)
  }

  /**
   * Sets the clear mode of a viewport. See [enum ViewportClearMode] for options.
   */
  public fun viewportSetClearMode(viewport: RID, clearMode: ViewportClearMode): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to clearMode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_CLEAR_MODE, NIL)
  }

  /**
   * Returns the render target for the viewport.
   */
  public fun viewportGetRenderTarget(viewport: RID): RID {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_GET_RENDER_TARGET, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the viewport's last rendered frame.
   */
  public fun viewportGetTexture(viewport: RID): RID {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_GET_TEXTURE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If `true`, the viewport's 3D elements are not rendered.
   */
  public fun viewportSetDisable3d(viewport: RID, disable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to disable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_DISABLE_3D, NIL)
  }

  /**
   * If `true`, the viewport's canvas (i.e. 2D and GUI elements) is not rendered.
   */
  public fun viewportSetDisable2d(viewport: RID, disable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to disable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_DISABLE_2D, NIL)
  }

  /**
   * Sets the viewport's environment mode which allows enabling or disabling rendering of 3D environment over 2D canvas. When disabled, 2D will not be affected by the environment. When enabled, 2D will be affected by the environment if the environment background mode is [ENV_BG_CANVAS]. The default behavior is to inherit the setting from the viewport's parent. If the topmost parent is also set to [VIEWPORT_ENVIRONMENT_INHERIT], then the behavior will be the same as if it was set to [VIEWPORT_ENVIRONMENT_ENABLED].
   */
  public fun viewportSetEnvironmentMode(viewport: RID, mode: ViewportEnvironmentMode): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_ENVIRONMENT_MODE, NIL)
  }

  /**
   * Sets a viewport's camera.
   */
  public fun viewportAttachCamera(viewport: RID, camera: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to camera)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_ATTACH_CAMERA, NIL)
  }

  /**
   * Sets a viewport's scenario. The scenario contains information about environment information, reflection atlas, etc.
   */
  public fun viewportSetScenario(viewport: RID, scenario: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to scenario)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_SCENARIO, NIL)
  }

  /**
   * Sets a viewport's canvas.
   */
  public fun viewportAttachCanvas(viewport: RID, canvas: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_ATTACH_CANVAS, NIL)
  }

  /**
   * Detaches a viewport from a canvas and vice versa.
   */
  public fun viewportRemoveCanvas(viewport: RID, canvas: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_REMOVE_CANVAS, NIL)
  }

  /**
   * If `true`, canvas item transforms (i.e. origin position) are snapped to the nearest pixel when rendering. This can lead to a crisper appearance at the cost of less smooth movement, especially when [godot.Camera2D] smoothing is enabled. Equivalent to [godot.ProjectSettings.rendering/2d/snap/snap2dTransformsToPixel].
   */
  public fun viewportSetSnap2dTransformsToPixel(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_SNAP_2D_TRANSFORMS_TO_PIXEL, NIL)
  }

  /**
   * If `true`, canvas item vertices (i.e. polygon points) are snapped to the nearest pixel when rendering. This can lead to a crisper appearance at the cost of less smooth movement, especially when [godot.Camera2D] smoothing is enabled. Equivalent to [godot.ProjectSettings.rendering/2d/snap/snap2dVerticesToPixel].
   */
  public fun viewportSetSnap2dVerticesToPixel(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_SNAP_2D_VERTICES_TO_PIXEL, NIL)
  }

  /**
   * Sets the default texture filtering mode for the specified [viewport] RID. See [enum CanvasItemTextureFilter] for options.
   */
  public fun viewportSetDefaultCanvasItemTextureFilter(viewport: RID,
      filter: CanvasItemTextureFilter): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to filter.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_DEFAULT_CANVAS_ITEM_TEXTURE_FILTER,
        NIL)
  }

  /**
   * Sets the default texture repeat mode for the specified [viewport] RID. See [enum CanvasItemTextureRepeat] for options.
   */
  public fun viewportSetDefaultCanvasItemTextureRepeat(viewport: RID,
      repeat: CanvasItemTextureRepeat): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to repeat.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT,
        NIL)
  }

  /**
   * Sets the transformation of a viewport's canvas.
   */
  public fun viewportSetCanvasTransform(
    viewport: RID,
    canvas: RID,
    offset: Transform2D,
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas, TRANSFORM2D to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_CANVAS_TRANSFORM, NIL)
  }

  /**
   * Sets the stacking order for a viewport's canvas.
   *
   * [layer] is the actual canvas layer, while [sublayer] specifies the stacking order of the canvas among those in the same layer.
   */
  public fun viewportSetCanvasStacking(
    viewport: RID,
    canvas: RID,
    layer: Int,
    sublayer: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas, LONG to layer.toLong(), LONG to sublayer.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_CANVAS_STACKING, NIL)
  }

  /**
   * If `true`, the viewport renders its background as transparent.
   */
  public fun viewportSetTransparentBackground(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_TRANSPARENT_BACKGROUND, NIL)
  }

  /**
   * Sets the viewport's global transformation matrix.
   */
  public fun viewportSetGlobalCanvasTransform(viewport: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to viewport, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_GLOBAL_CANVAS_TRANSFORM, NIL)
  }

  /**
   * Sets the viewport's 2D signed distance field [godot.ProjectSettings.rendering/2d/sdf/oversize] and [godot.ProjectSettings.rendering/2d/sdf/scale]. This is used when sampling the signed distance field in [godot.CanvasItem] shaders as well as [godot.GPUParticles2D] collision. This is *not* used by SDFGI in 3D rendering.
   */
  public fun viewportSetSdfOversizeAndScale(
    viewport: RID,
    oversize: ViewportSDFOversize,
    scale: ViewportSDFScale,
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to oversize.id, LONG to scale.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_SDF_OVERSIZE_AND_SCALE, NIL)
  }

  /**
   * Sets the [size] of the shadow atlas's images (used for omni and spot lights) on the viewport specified by the [viewport] RID. The value is rounded up to the nearest power of 2. If [use16Bits] is `true`, use 16 bits for the omni/spot shadow depth map. Enabling this results in shadows having less precision and may result in shadow acne, but can lead to performance improvements on some devices.
   *
   * **Note:** If this is set to `0`, no positional shadows will be visible at all. This can improve performance significantly on low-end systems by reducing both the CPU and GPU load (as fewer draw calls are needed to draw the scene without shadows).
   */
  @JvmOverloads
  public fun viewportSetPositionalShadowAtlasSize(
    viewport: RID,
    size: Int,
    use16Bits: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to size.toLong(), BOOL to use16Bits)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_POSITIONAL_SHADOW_ATLAS_SIZE, NIL)
  }

  /**
   * Sets the number of subdivisions to use in the specified shadow atlas [quadrant] for omni and spot shadows. See also [godot.Viewport.setPositionalShadowAtlasQuadrantSubdiv].
   */
  public fun viewportSetPositionalShadowAtlasQuadrantSubdivision(
    viewport: RID,
    quadrant: Int,
    subdivision: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to quadrant.toLong(), LONG to subdivision.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_POSITIONAL_SHADOW_ATLAS_QUADRANT_SUBDIVISION,
        NIL)
  }

  /**
   * Sets the multisample anti-aliasing mode for 3D on the specified [viewport] RID. See [enum ViewportMSAA] for options.
   */
  public fun viewportSetMsaa3d(viewport: RID, msaa: ViewportMSAA): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to msaa.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_MSAA_3D, NIL)
  }

  /**
   * Sets the multisample anti-aliasing mode for 2D/Canvas on the specified [viewport] RID. See [enum ViewportMSAA] for options.
   */
  public fun viewportSetMsaa2d(viewport: RID, msaa: ViewportMSAA): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to msaa.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_MSAA_2D, NIL)
  }

  /**
   * Sets the viewport's screen-space antialiasing mode.
   */
  public fun viewportSetScreenSpaceAa(viewport: RID, mode: ViewportScreenSpaceAA): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_SCREEN_SPACE_AA, NIL)
  }

  /**
   * If `true`, use Temporal Anti-Aliasing. Equivalent to [godot.ProjectSettings.rendering/antiAliasing/quality/useTaa].
   */
  public fun viewportSetUseTaa(viewport: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_USE_TAA, NIL)
  }

  /**
   * If `true`, enables debanding on the specified viewport. Equivalent to [godot.ProjectSettings.rendering/antiAliasing/quality/useDebanding].
   */
  public fun viewportSetUseDebanding(viewport: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_USE_DEBANDING, NIL)
  }

  /**
   * If `true`, enables occlusion culling on the specified viewport. Equivalent to [godot.ProjectSettings.rendering/occlusionCulling/useOcclusionCulling].
   */
  public fun viewportSetUseOcclusionCulling(viewport: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_USE_OCCLUSION_CULLING, NIL)
  }

  /**
   * Sets the [godot.ProjectSettings.rendering/occlusionCulling/occlusionRaysPerThread] to use for occlusion culling. This parameter is global and cannot be set on a per-viewport basis.
   */
  public fun viewportSetOcclusionRaysPerThread(raysPerThread: Int): Unit {
    TransferContext.writeArguments(LONG to raysPerThread.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_OCCLUSION_RAYS_PER_THREAD, NIL)
  }

  /**
   * Sets the [godot.ProjectSettings.rendering/occlusionCulling/bvhBuildQuality] to use for occlusion culling. This parameter is global and cannot be set on a per-viewport basis.
   */
  public fun viewportSetOcclusionCullingBuildQuality(quality: ViewportOcclusionCullingBuildQuality):
      Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_OCCLUSION_CULLING_BUILD_QUALITY, NIL)
  }

  /**
   * Returns a statistic about the rendering engine which can be used for performance profiling. This is separated into render pass [type]s, each of them having the same [info]s you can query (different passes will return different values). See [enum RenderingServer.ViewportRenderInfoType] for a list of render pass types and [enum RenderingServer.ViewportRenderInfo] for a list of information that can be queried.
   *
   * See also [getRenderingInfo], which returns global information across all viewports.
   *
   * **Note:** Viewport rendering information is not available until at least 2 frames have been rendered by the engine. If rendering information is not available, [viewportGetRenderInfo] returns `0`. To print rendering information in `_ready()` successfully, use the following:
   *
   * ```
   * 				func _ready():
   * 				    for _i in 2:
   * 				        await get_tree().process_frame
   *
   * 				    print(
   * 				            RenderingServer.viewport_get_render_info(get_viewport().get_viewport_rid(),
   * 				            RenderingServer.VIEWPORT_RENDER_INFO_TYPE_VISIBLE,
   * 				            RenderingServer.VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME)
   * 				    )
   * 				```
   */
  public fun viewportGetRenderInfo(
    viewport: RID,
    type: ViewportRenderInfoType,
    info: ViewportRenderInfo,
  ): Int {
    TransferContext.writeArguments(_RID to viewport, LONG to type.id, LONG to info.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_GET_RENDER_INFO, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the debug draw mode of a viewport. See [enum ViewportDebugDraw] for options.
   */
  public fun viewportSetDebugDraw(viewport: RID, draw: ViewportDebugDraw): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to draw.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_DEBUG_DRAW, NIL)
  }

  /**
   * Sets the measurement for the given [viewport] RID (obtained using [godot.Viewport.getViewportRid]). Once enabled, [viewportGetMeasuredRenderTimeCpu] and [viewportGetMeasuredRenderTimeGpu] will return values greater than `0.0` when queried with the given [viewport].
   */
  public fun viewportSetMeasureRenderTime(viewport: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_MEASURE_RENDER_TIME, NIL)
  }

  /**
   * Returns the CPU time taken to render the last frame in milliseconds. This *only* includes time spent in rendering-related operations; scripts' `_process` functions and other engine subsystems are not included in this readout. To get a complete readout of CPU time spent to render the scene, sum the render times of all viewports that are drawn every frame plus [getFrameSetupTimeCpu]. Unlike [godot.Engine.getFramesPerSecond], this method will accurately reflect CPU utilization even if framerate is capped via V-Sync or [godot.Engine.maxFps]. See also [viewportGetMeasuredRenderTimeGpu].
   *
   * **Note:** Requires measurements to be enabled on the specified [viewport] using [viewportSetMeasureRenderTime]. Otherwise, this method returns `0.0`.
   */
  public fun viewportGetMeasuredRenderTimeCpu(viewport: RID): Double {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_GET_MEASURED_RENDER_TIME_CPU, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the GPU time taken to render the last frame in milliseconds. To get a complete readout of GPU time spent to render the scene, sum the render times of all viewports that are drawn every frame. Unlike [godot.Engine.getFramesPerSecond], this method accurately reflects GPU utilization even if framerate is capped via V-Sync or [godot.Engine.maxFps]. See also [viewportGetMeasuredRenderTimeGpu].
   *
   * **Note:** Requires measurements to be enabled on the specified [viewport] using [viewportSetMeasureRenderTime]. Otherwise, this method returns `0.0`.
   *
   * **Note:** When GPU utilization is low enough during a certain period of time, GPUs will decrease their power state (which in turn decreases core and memory clock speeds). This can cause the reported GPU time to increase if GPU utilization is kept low enough by a framerate cap (compared to what it would be at the GPU's highest power state). Keep this in mind when benchmarking using [viewportGetMeasuredRenderTimeGpu]. This behavior can be overridden in the graphics driver settings at the cost of higher power usage.
   */
  public fun viewportGetMeasuredRenderTimeGpu(viewport: RID): Double {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_GET_MEASURED_RENDER_TIME_GPU, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Sets the Variable Rate Shading (VRS) mode for the viewport. If the GPU does not support VRS, this property is ignored. Equivalent to [godot.ProjectSettings.rendering/vrs/mode].
   */
  public fun viewportSetVrsMode(viewport: RID, mode: ViewportVRSMode): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_VRS_MODE, NIL)
  }

  /**
   * The texture to use when the VRS mode is set to [godot.RenderingServer.VIEWPORT_VRS_TEXTURE]. Equivalent to [godot.ProjectSettings.rendering/vrs/texture].
   */
  public fun viewportSetVrsTexture(viewport: RID, texture: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_VRS_TEXTURE, NIL)
  }

  /**
   * Creates an empty sky and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `sky_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   */
  public fun skyCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKY_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the [radianceSize] of the sky specified by the [sky] RID (in pixels). Equivalent to [godot.Sky.radianceSize].
   */
  public fun skySetRadianceSize(sky: RID, radianceSize: Int): Unit {
    TransferContext.writeArguments(_RID to sky, LONG to radianceSize.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKY_SET_RADIANCE_SIZE, NIL)
  }

  /**
   * Sets the process [mode] of the sky specified by the [sky] RID. Equivalent to [godot.Sky.processMode].
   */
  public fun skySetMode(sky: RID, mode: SkyMode): Unit {
    TransferContext.writeArguments(_RID to sky, LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKY_SET_MODE, NIL)
  }

  /**
   * Sets the material that the sky uses to render the background, ambient and reflection maps.
   */
  public fun skySetMaterial(sky: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to sky, _RID to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKY_SET_MATERIAL,
        NIL)
  }

  /**
   * Generates and returns an [godot.Image] containing the radiance map for the specified [sky] RID. This supports built-in sky material and custom sky shaders. If [bakeIrradiance] is `true`, the irradiance map is saved instead of the radiance map. The radiance map is used to render reflected light, while the irradiance map is used to render ambient light. See also [environmentBakePanorama].
   *
   * **Note:** The image is saved in linear color space without any tonemapping performed, which means it will look too dark if viewed directly in an image editor. [energy] values above `1.0` can be used to brighten the resulting image.
   *
   * **Note:** [size] should be a 2:1 aspect ratio for the generated panorama to have square pixels. For radiance maps, there is no point in using a height greater than [godot.Sky.radianceSize], as it won't increase detail. Irradiance maps only contain low-frequency data, so there is usually no point in going past a size of 128×64 pixels when saving an irradiance map.
   */
  public fun skyBakePanorama(
    sky: RID,
    energy: Float,
    bakeIrradiance: Boolean,
    size: Vector2i,
  ): Image? {
    TransferContext.writeArguments(_RID to sky, DOUBLE to energy.toDouble(), BOOL to bakeIrradiance, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKY_BAKE_PANORAMA,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Creates an environment and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `environment_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent resource is [godot.Environment].
   */
  public fun environmentCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the environment's background mode. Equivalent to [godot.Environment.backgroundMode].
   */
  public fun environmentSetBackground(env: RID, bg: EnvironmentBG): Unit {
    TransferContext.writeArguments(_RID to env, LONG to bg.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_BACKGROUND, NIL)
  }

  /**
   * Sets the [godot.Sky] to be used as the environment's background when using *BGMode* sky. Equivalent to [godot.Environment.sky].
   */
  public fun environmentSetSky(env: RID, sky: RID): Unit {
    TransferContext.writeArguments(_RID to env, _RID to sky)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SKY,
        NIL)
  }

  /**
   * Sets a custom field of view for the background [godot.Sky]. Equivalent to [godot.Environment.skyCustomFov].
   */
  public fun environmentSetSkyCustomFov(env: RID, scale: Float): Unit {
    TransferContext.writeArguments(_RID to env, DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SKY_CUSTOM_FOV, NIL)
  }

  /**
   * Sets the rotation of the background [godot.Sky] expressed as a [godot.core.Basis]. Equivalent to [godot.Environment.skyRotation], where the rotation vector is used to construct the [godot.core.Basis].
   */
  public fun environmentSetSkyOrientation(env: RID, orientation: Basis): Unit {
    TransferContext.writeArguments(_RID to env, BASIS to orientation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SKY_ORIENTATION, NIL)
  }

  /**
   * Color displayed for clear areas of the scene. Only effective if using the [ENV_BG_COLOR] background mode.
   */
  public fun environmentSetBgColor(env: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to env, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_BG_COLOR, NIL)
  }

  /**
   * Sets the intensity of the background color.
   */
  public fun environmentSetBgEnergy(
    env: RID,
    multiplier: Float,
    exposureValue: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to env, DOUBLE to multiplier.toDouble(), DOUBLE to exposureValue.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_BG_ENERGY, NIL)
  }

  /**
   * Sets the maximum layer to use if using Canvas background mode.
   */
  public fun environmentSetCanvasMaxLayer(env: RID, maxLayer: Int): Unit {
    TransferContext.writeArguments(_RID to env, LONG to maxLayer.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_CANVAS_MAX_LAYER, NIL)
  }

  /**
   * Sets the values to be used for ambient light rendering. See [godot.Environment] for more details.
   */
  @JvmOverloads
  public fun environmentSetAmbientLight(
    env: RID,
    color: Color,
    ambient: EnvironmentAmbientSource =
        RenderingServer.EnvironmentAmbientSource.ENV_AMBIENT_SOURCE_BG,
    energy: Float = 1.0f,
    skyContibution: Float = 0.0f,
    reflectionSource: EnvironmentReflectionSource =
        RenderingServer.EnvironmentReflectionSource.ENV_REFLECTION_SOURCE_BG,
  ): Unit {
    TransferContext.writeArguments(_RID to env, COLOR to color, LONG to ambient.id, DOUBLE to energy.toDouble(), DOUBLE to skyContibution.toDouble(), LONG to reflectionSource.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_AMBIENT_LIGHT, NIL)
  }

  /**
   * Configures glow for the specified environment RID. See `glow_*` properties in [godot.Environment] for more information.
   */
  public fun environmentSetGlow(
    env: RID,
    enable: Boolean,
    levels: PackedFloat32Array,
    intensity: Float,
    strength: Float,
    mix: Float,
    bloomThreshold: Float,
    blendMode: EnvironmentGlowBlendMode,
    hdrBleedThreshold: Float,
    hdrBleedScale: Float,
    hdrLuminanceCap: Float,
    glowMapStrength: Float,
    glowMap: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, PACKED_FLOAT_32_ARRAY to levels, DOUBLE to intensity.toDouble(), DOUBLE to strength.toDouble(), DOUBLE to mix.toDouble(), DOUBLE to bloomThreshold.toDouble(), LONG to blendMode.id, DOUBLE to hdrBleedThreshold.toDouble(), DOUBLE to hdrBleedScale.toDouble(), DOUBLE to hdrLuminanceCap.toDouble(), DOUBLE to glowMapStrength.toDouble(), _RID to glowMap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_GLOW, NIL)
  }

  /**
   * Sets the variables to be used with the "tonemap" post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetTonemap(
    env: RID,
    toneMapper: EnvironmentToneMapper,
    exposure: Float,
    white: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to env, LONG to toneMapper.id, DOUBLE to exposure.toDouble(), DOUBLE to white.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_TONEMAP, NIL)
  }

  /**
   * Sets the values to be used with the "adjustments" post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetAdjustment(
    env: RID,
    enable: Boolean,
    brightness: Float,
    contrast: Float,
    saturation: Float,
    use1dColorCorrection: Boolean,
    colorCorrection: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to brightness.toDouble(), DOUBLE to contrast.toDouble(), DOUBLE to saturation.toDouble(), BOOL to use1dColorCorrection, _RID to colorCorrection)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_ADJUSTMENT, NIL)
  }

  /**
   * Sets the variables to be used with the screen-space reflections (SSR) post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetSsr(
    env: RID,
    enable: Boolean,
    maxSteps: Int,
    fadeIn: Float,
    fadeOut: Float,
    depthTolerance: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, LONG to maxSteps.toLong(), DOUBLE to fadeIn.toDouble(), DOUBLE to fadeOut.toDouble(), DOUBLE to depthTolerance.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SSR,
        NIL)
  }

  /**
   * Sets the variables to be used with the screen-space ambient occlusion (SSAO) post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetSsao(
    env: RID,
    enable: Boolean,
    radius: Float,
    intensity: Float,
    power: Float,
    detail: Float,
    horizon: Float,
    sharpness: Float,
    lightAffect: Float,
    aoChannelAffect: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to radius.toDouble(), DOUBLE to intensity.toDouble(), DOUBLE to power.toDouble(), DOUBLE to detail.toDouble(), DOUBLE to horizon.toDouble(), DOUBLE to sharpness.toDouble(), DOUBLE to lightAffect.toDouble(), DOUBLE to aoChannelAffect.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SSAO, NIL)
  }

  /**
   * Configures fog for the specified environment RID. See `fog_*` properties in [godot.Environment] for more information.
   */
  public fun environmentSetFog(
    env: RID,
    enable: Boolean,
    lightColor: Color,
    lightEnergy: Float,
    sunScatter: Float,
    density: Float,
    height: Float,
    heightDensity: Float,
    aerialPerspective: Float,
    skyAffect: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, COLOR to lightColor, DOUBLE to lightEnergy.toDouble(), DOUBLE to sunScatter.toDouble(), DOUBLE to density.toDouble(), DOUBLE to height.toDouble(), DOUBLE to heightDensity.toDouble(), DOUBLE to aerialPerspective.toDouble(), DOUBLE to skyAffect.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_FOG,
        NIL)
  }

  /**
   * Configures signed distance field global illumination for the specified environment RID. See `sdfgi_*` properties in [godot.Environment] for more information.
   */
  public fun environmentSetSdfgi(
    env: RID,
    enable: Boolean,
    cascades: Int,
    minCellSize: Float,
    yScale: EnvironmentSDFGIYScale,
    useOcclusion: Boolean,
    bounceFeedback: Float,
    readSky: Boolean,
    energy: Float,
    normalBias: Float,
    probeBias: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, LONG to cascades.toLong(), DOUBLE to minCellSize.toDouble(), LONG to yScale.id, BOOL to useOcclusion, DOUBLE to bounceFeedback.toDouble(), BOOL to readSky, DOUBLE to energy.toDouble(), DOUBLE to normalBias.toDouble(), DOUBLE to probeBias.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SDFGI, NIL)
  }

  /**
   * Sets the variables to be used with the volumetric fog post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetVolumetricFog(
    env: RID,
    enable: Boolean,
    density: Float,
    albedo: Color,
    emission: Color,
    emissionEnergy: Float,
    anisotropy: Float,
    length: Float,
    pDetailSpread: Float,
    giInject: Float,
    temporalReprojection: Boolean,
    temporalReprojectionAmount: Float,
    ambientInject: Float,
    skyAffect: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to density.toDouble(), COLOR to albedo, COLOR to emission, DOUBLE to emissionEnergy.toDouble(), DOUBLE to anisotropy.toDouble(), DOUBLE to length.toDouble(), DOUBLE to pDetailSpread.toDouble(), DOUBLE to giInject.toDouble(), BOOL to temporalReprojection, DOUBLE to temporalReprojectionAmount.toDouble(), DOUBLE to ambientInject.toDouble(), DOUBLE to skyAffect.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_VOLUMETRIC_FOG, NIL)
  }

  /**
   * If [enable] is `true`, enables bicubic upscaling for glow which improves quality at the cost of performance. Equivalent to [godot.ProjectSettings.rendering/environment/glow/upscaleMode].
   */
  public fun environmentGlowSetUseBicubicUpscale(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_GLOW_SET_USE_BICUBIC_UPSCALE, NIL)
  }

  /**
   *
   */
  public fun environmentSetSsrRoughnessQuality(quality: EnvironmentSSRRoughnessQuality): Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SSR_ROUGHNESS_QUALITY, NIL)
  }

  /**
   * Sets the quality level of the screen-space ambient occlusion (SSAO) post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetSsaoQuality(
    quality: EnvironmentSSAOQuality,
    halfSize: Boolean,
    adaptiveTarget: Float,
    blurPasses: Int,
    fadeoutFrom: Float,
    fadeoutTo: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to quality.id, BOOL to halfSize, DOUBLE to adaptiveTarget.toDouble(), LONG to blurPasses.toLong(), DOUBLE to fadeoutFrom.toDouble(), DOUBLE to fadeoutTo.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SSAO_QUALITY, NIL)
  }

  /**
   * Sets the quality level of the screen-space indirect lighting (SSIL) post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetSsilQuality(
    quality: EnvironmentSSILQuality,
    halfSize: Boolean,
    adaptiveTarget: Float,
    blurPasses: Int,
    fadeoutFrom: Float,
    fadeoutTo: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to quality.id, BOOL to halfSize, DOUBLE to adaptiveTarget.toDouble(), LONG to blurPasses.toLong(), DOUBLE to fadeoutFrom.toDouble(), DOUBLE to fadeoutTo.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SSIL_QUALITY, NIL)
  }

  /**
   * Sets the number of rays to throw per frame when computing signed distance field global illumination. Equivalent to [godot.ProjectSettings.rendering/globalIllumination/sdfgi/probeRayCount].
   */
  public fun environmentSetSdfgiRayCount(rayCount: EnvironmentSDFGIRayCount): Unit {
    TransferContext.writeArguments(LONG to rayCount.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SDFGI_RAY_COUNT, NIL)
  }

  /**
   * Sets the number of frames to use for converging signed distance field global illumination. Equivalent to [godot.ProjectSettings.rendering/globalIllumination/sdfgi/framesToConverge].
   */
  public fun environmentSetSdfgiFramesToConverge(frames: EnvironmentSDFGIFramesToConverge): Unit {
    TransferContext.writeArguments(LONG to frames.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SDFGI_FRAMES_TO_CONVERGE, NIL)
  }

  /**
   * Sets the update speed for dynamic lights' indirect lighting when computing signed distance field global illumination. Equivalent to [godot.ProjectSettings.rendering/globalIllumination/sdfgi/framesToUpdateLights].
   */
  public fun environmentSetSdfgiFramesToUpdateLight(frames: EnvironmentSDFGIFramesToUpdateLight):
      Unit {
    TransferContext.writeArguments(LONG to frames.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SDFGI_FRAMES_TO_UPDATE_LIGHT, NIL)
  }

  /**
   * Sets the resolution of the volumetric fog's froxel buffer. [size] is modified by the screen's aspect ratio and then used to set the width and height of the buffer. While [depth] is directly used to set the depth of the buffer.
   */
  public fun environmentSetVolumetricFogVolumeSize(size: Int, depth: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong(), LONG to depth.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_VOLUMETRIC_FOG_VOLUME_SIZE, NIL)
  }

  /**
   * Enables filtering of the volumetric fog scattering buffer. This results in much smoother volumes with very few under-sampling artifacts.
   */
  public fun environmentSetVolumetricFogFilterActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_VOLUMETRIC_FOG_FILTER_ACTIVE, NIL)
  }

  /**
   * Generates and returns an [godot.Image] containing the radiance map for the specified [environment] RID's sky. This supports built-in sky material and custom sky shaders. If [bakeIrradiance] is `true`, the irradiance map is saved instead of the radiance map. The radiance map is used to render reflected light, while the irradiance map is used to render ambient light. See also [skyBakePanorama].
   *
   * **Note:** The image is saved in linear color space without any tonemapping performed, which means it will look too dark if viewed directly in an image editor.
   *
   * **Note:** [size] should be a 2:1 aspect ratio for the generated panorama to have square pixels. For radiance maps, there is no point in using a height greater than [godot.Sky.radianceSize], as it won't increase detail. Irradiance maps only contain low-frequency data, so there is usually no point in going past a size of 128×64 pixels when saving an irradiance map.
   */
  public fun environmentBakePanorama(
    environment: RID,
    bakeIrradiance: Boolean,
    size: Vector2i,
  ): Image? {
    TransferContext.writeArguments(_RID to environment, BOOL to bakeIrradiance, VECTOR2I to size)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_BAKE_PANORAMA, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Sets the screen-space roughness limiter parameters, such as whether it should be enabled and its thresholds. Equivalent to [godot.ProjectSettings.rendering/antiAliasing/screenSpaceRoughnessLimiter/enabled], [godot.ProjectSettings.rendering/antiAliasing/screenSpaceRoughnessLimiter/amount] and [godot.ProjectSettings.rendering/antiAliasing/screenSpaceRoughnessLimiter/limit].
   */
  public fun screenSpaceRoughnessLimiterSetActive(
    enable: Boolean,
    amount: Float,
    limit: Float,
  ): Unit {
    TransferContext.writeArguments(BOOL to enable, DOUBLE to amount.toDouble(), DOUBLE to limit.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SCREEN_SPACE_ROUGHNESS_LIMITER_SET_ACTIVE, NIL)
  }

  /**
   * Sets [godot.ProjectSettings.rendering/environment/subsurfaceScattering/subsurfaceScatteringQuality] to use when rendering materials that have subsurface scattering enabled.
   */
  public fun subSurfaceScatteringSetQuality(quality: SubSurfaceScatteringQuality): Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SUB_SURFACE_SCATTERING_SET_QUALITY, NIL)
  }

  /**
   * Sets the [godot.ProjectSettings.rendering/environment/subsurfaceScattering/subsurfaceScatteringScale] and [godot.ProjectSettings.rendering/environment/subsurfaceScattering/subsurfaceScatteringDepthScale] to use when rendering materials that have subsurface scattering enabled.
   */
  public fun subSurfaceScatteringSetScale(scale: Float, depthScale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to scale.toDouble(), DOUBLE to depthScale.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SUB_SURFACE_SCATTERING_SET_SCALE, NIL)
  }

  /**
   * Creates a camera attributes object and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `camera_attributes_` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent resource is [godot.CameraAttributes].
   */
  public fun cameraAttributesCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_ATTRIBUTES_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the quality level of the DOF blur effect to one of the options in [enum DOFBlurQuality]. [useJitter] can be used to jitter samples taken during the blur pass to hide artifacts at the cost of looking more fuzzy.
   */
  public fun cameraAttributesSetDofBlurQuality(quality: DOFBlurQuality, useJitter: Boolean): Unit {
    TransferContext.writeArguments(LONG to quality.id, BOOL to useJitter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_ATTRIBUTES_SET_DOF_BLUR_QUALITY, NIL)
  }

  /**
   * Sets the shape of the DOF bokeh pattern. Different shapes may be used to achieve artistic effect, or to meet performance targets. For more detail on available options see [enum DOFBokehShape].
   */
  public fun cameraAttributesSetDofBlurBokehShape(shape: DOFBokehShape): Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_ATTRIBUTES_SET_DOF_BLUR_BOKEH_SHAPE, NIL)
  }

  /**
   * Sets the parameters to use with the DOF blur effect. These parameters take on the same meaning as their counterparts in [godot.CameraAttributesPractical].
   */
  public fun cameraAttributesSetDofBlur(
    cameraAttributes: RID,
    farEnable: Boolean,
    farDistance: Float,
    farTransition: Float,
    nearEnable: Boolean,
    nearDistance: Float,
    nearTransition: Float,
    amount: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to cameraAttributes, BOOL to farEnable, DOUBLE to farDistance.toDouble(), DOUBLE to farTransition.toDouble(), BOOL to nearEnable, DOUBLE to nearDistance.toDouble(), DOUBLE to nearTransition.toDouble(), DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_ATTRIBUTES_SET_DOF_BLUR, NIL)
  }

  /**
   * Sets the exposure values that will be used by the renderers. The normalization amount is used to bake a given Exposure Value (EV) into rendering calculations to reduce the dynamic range of the scene.
   *
   * The normalization factor can be calculated from exposure value (EV100) as follows:
   *
   * ```
   * 				func get_exposure_normalization(float ev100):
   * 				    			    return 1.0 / (pow(2.0, ev100) * 1.2)
   * 				```
   *
   * The exposure value can be calculated from aperture (in f-stops), shutter speed (in seconds), and sensitivity (in ISO) as follows:
   *
   * ```
   * 				func get_exposure(float aperture, float shutter_speed, float sensitivity):
   * 				    return log2((aperture * aperture) / shutterSpeed * (100.0 / sensitivity))
   * 				```
   */
  public fun cameraAttributesSetExposure(
    cameraAttributes: RID,
    multiplier: Float,
    normalization: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to cameraAttributes, DOUBLE to multiplier.toDouble(), DOUBLE to normalization.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_ATTRIBUTES_SET_EXPOSURE, NIL)
  }

  /**
   * Sets the parameters to use with the auto-exposure effect. These parameters take on the same meaning as their counterparts in [godot.CameraAttributes] and [godot.CameraAttributesPractical].
   */
  public fun cameraAttributesSetAutoExposure(
    cameraAttributes: RID,
    enable: Boolean,
    minSensitivity: Float,
    maxSensitivity: Float,
    speed: Float,
    scale: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to cameraAttributes, BOOL to enable, DOUBLE to minSensitivity.toDouble(), DOUBLE to maxSensitivity.toDouble(), DOUBLE to speed.toDouble(), DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_ATTRIBUTES_SET_AUTO_EXPOSURE, NIL)
  }

  /**
   * Creates a scenario and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `scenario_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * The scenario is the 3D world that all the visual instances exist in.
   */
  public fun scenarioCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SCENARIO_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the environment that will be used with this scenario. See also [godot.Environment].
   */
  public fun scenarioSetEnvironment(scenario: RID, environment: RID): Unit {
    TransferContext.writeArguments(_RID to scenario, _RID to environment)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SCENARIO_SET_ENVIRONMENT, NIL)
  }

  /**
   * Sets the fallback environment to be used by this scenario. The fallback environment is used if no environment is set. Internally, this is used by the editor to provide a default environment.
   */
  public fun scenarioSetFallbackEnvironment(scenario: RID, environment: RID): Unit {
    TransferContext.writeArguments(_RID to scenario, _RID to environment)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SCENARIO_SET_FALLBACK_ENVIRONMENT, NIL)
  }

  /**
   * Sets the camera attributes ([effects]) that will be used with this scenario. See also [godot.CameraAttributes].
   */
  public fun scenarioSetCameraAttributes(scenario: RID, effects: RID): Unit {
    TransferContext.writeArguments(_RID to scenario, _RID to effects)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SCENARIO_SET_CAMERA_ATTRIBUTES, NIL)
  }

  /**
   * Creates a visual instance, adds it to the RenderingServer, and sets both base and scenario. It can be accessed with the RID that is returned. This RID will be used in all `instance_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method. This is a shorthand for using [instanceCreate] and setting the base and scenario manually.
   */
  public fun instanceCreate2(base: RID, scenario: RID): RID {
    TransferContext.writeArguments(_RID to base, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_CREATE2,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a visual instance and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `instance_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * An instance is a way of placing a 3D object in the scenario. Objects like particles, meshes, reflection probes and decals need to be associated with an instance to be visible in the scenario using [instanceSetBase].
   *
   * **Note:** The equivalent node is [godot.VisualInstance3D].
   */
  public fun instanceCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the base of the instance. A base can be any of the 3D objects that are created in the RenderingServer that can be displayed. For example, any of the light types, mesh, multimesh, particle system, reflection probe, decal, lightmap, voxel GI and visibility notifiers are all types that can be set as the base of an instance in order to be displayed in the scenario.
   */
  public fun instanceSetBase(instance: RID, base: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to base)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_SET_BASE,
        NIL)
  }

  /**
   * Sets the scenario that the instance is in. The scenario is the 3D world that the objects will be displayed in.
   */
  public fun instanceSetScenario(instance: RID, scenario: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to scenario)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_SET_SCENARIO, NIL)
  }

  /**
   * Sets the render layers that this instance will be drawn to. Equivalent to [godot.VisualInstance3D.layers].
   */
  public fun instanceSetLayerMask(instance: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_SET_LAYER_MASK, NIL)
  }

  /**
   * Sets the sorting offset and switches between using the bounding box or instance origin for depth sorting.
   */
  public fun instanceSetPivotData(
    instance: RID,
    sortingOffset: Float,
    useAabbCenter: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to sortingOffset.toDouble(), BOOL to useAabbCenter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_SET_PIVOT_DATA, NIL)
  }

  /**
   * Sets the world space transform of the instance. Equivalent to [godot.Node3D.transform].
   */
  public fun instanceSetTransform(instance: RID, transform: Transform3D): Unit {
    TransferContext.writeArguments(_RID to instance, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_SET_TRANSFORM, NIL)
  }

  /**
   * Attaches a unique Object ID to instance. Object ID must be attached to instance for proper culling with [instancesCullAabb], [instancesCullConvex], and [instancesCullRay].
   */
  public fun instanceAttachObjectInstanceId(instance: RID, id: Long): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  /**
   * Sets the weight for a given blend shape associated with this instance.
   */
  public fun instanceSetBlendShapeWeight(
    instance: RID,
    shape: Int,
    weight: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to shape.toLong(), DOUBLE to weight.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_SET_BLEND_SHAPE_WEIGHT, NIL)
  }

  /**
   * Sets the override material of a specific surface. Equivalent to [godot.MeshInstance3D.setSurfaceOverrideMaterial].
   */
  public fun instanceSetSurfaceOverrideMaterial(
    instance: RID,
    surface: Int,
    material: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to surface.toLong(), _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_SET_SURFACE_OVERRIDE_MATERIAL, NIL)
  }

  /**
   * Sets whether an instance is drawn or not. Equivalent to [godot.Node3D.visible].
   */
  public fun instanceSetVisible(instance: RID, visible: Boolean): Unit {
    TransferContext.writeArguments(_RID to instance, BOOL to visible)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_SET_VISIBLE, NIL)
  }

  /**
   * Sets the transparency for the given geometry instance. Equivalent to [godot.GeometryInstance3D.transparency].
   *
   * A transparency of `0.0` is fully opaque, while `1.0` is fully transparent. Values greater than `0.0` (exclusive) will force the geometry's materials to go through the transparent pipeline, which is slower to render and can exhibit rendering issues due to incorrect transparency sorting. However, unlike using a transparent material, setting [transparency] to a value greater than `0.0` (exclusive) will *not* disable shadow rendering.
   *
   * In spatial shaders, `1.0 - transparency` is set as the default value of the `ALPHA` built-in.
   *
   * **Note:** [transparency] is clamped between `0.0` and `1.0`, so this property cannot be used to make transparent materials more opaque than they originally are.
   */
  public fun instanceGeometrySetTransparency(instance: RID, transparency: Float): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to transparency.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_SET_TRANSPARENCY, NIL)
  }

  /**
   * Sets a custom AABB to use when culling objects from the view frustum. Equivalent to setting [godot.GeometryInstance3D.customAabb].
   */
  public fun instanceSetCustomAabb(instance: RID, aabb: AABB): Unit {
    TransferContext.writeArguments(_RID to instance, godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_SET_CUSTOM_AABB, NIL)
  }

  /**
   * Attaches a skeleton to an instance. Removes the previous skeleton from the instance.
   */
  public fun instanceAttachSkeleton(instance: RID, skeleton: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to skeleton)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_ATTACH_SKELETON, NIL)
  }

  /**
   * Sets a margin to increase the size of the AABB when culling objects from the view frustum. This allows you to avoid culling objects that fall outside the view frustum. Equivalent to [godot.GeometryInstance3D.extraCullMargin].
   */
  public fun instanceSetExtraVisibilityMargin(instance: RID, margin: Float): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to margin.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_SET_EXTRA_VISIBILITY_MARGIN, NIL)
  }

  /**
   * Sets the visibility parent for the given instance. Equivalent to [godot.Node3D.visibilityParent].
   */
  public fun instanceSetVisibilityParent(instance: RID, parent: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to parent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_SET_VISIBILITY_PARENT, NIL)
  }

  /**
   * If `true`, ignores both frustum and occlusion culling on the specified 3D geometry instance. This is not the same as [godot.GeometryInstance3D.ignoreOcclusionCulling], which only ignores occlusion culling and leaves frustum culling intact.
   */
  public fun instanceSetIgnoreCulling(instance: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to instance, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_SET_IGNORE_CULLING, NIL)
  }

  /**
   * Sets the flag for a given [enum InstanceFlags]. See [enum InstanceFlags] for more details.
   */
  public fun instanceGeometrySetFlag(
    instance: RID,
    flag: InstanceFlags,
    enabled: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to flag.id, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_SET_FLAG, NIL)
  }

  /**
   * Sets the shadow casting setting to one of [enum ShadowCastingSetting]. Equivalent to [godot.GeometryInstance3D.castShadow].
   */
  public fun instanceGeometrySetCastShadowsSetting(instance: RID,
      shadowCastingSetting: ShadowCastingSetting): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to shadowCastingSetting.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_SET_CAST_SHADOWS_SETTING, NIL)
  }

  /**
   * Sets a material that will override the material for all surfaces on the mesh associated with this instance. Equivalent to [godot.GeometryInstance3D.materialOverride].
   */
  public fun instanceGeometrySetMaterialOverride(instance: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_SET_MATERIAL_OVERRIDE, NIL)
  }

  /**
   * Sets a material that will be rendered for all surfaces on top of active materials for the mesh associated with this instance. Equivalent to [godot.GeometryInstance3D.materialOverlay].
   */
  public fun instanceGeometrySetMaterialOverlay(instance: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_SET_MATERIAL_OVERLAY, NIL)
  }

  /**
   * Sets the visibility range values for the given geometry instance. Equivalent to [godot.GeometryInstance3D.visibilityRangeBegin] and related properties.
   */
  public fun instanceGeometrySetVisibilityRange(
    instance: RID,
    min: Float,
    max: Float,
    minMargin: Float,
    maxMargin: Float,
    fadeMode: VisibilityRangeFadeMode,
  ): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to min.toDouble(), DOUBLE to max.toDouble(), DOUBLE to minMargin.toDouble(), DOUBLE to maxMargin.toDouble(), LONG to fadeMode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_SET_VISIBILITY_RANGE, NIL)
  }

  /**
   * Sets the lightmap GI instance to use for the specified 3D geometry instance. The lightmap UV scale for the specified instance (equivalent to [godot.GeometryInstance3D.giLightmapScale]) and lightmap atlas slice must also be specified.
   */
  public fun instanceGeometrySetLightmap(
    instance: RID,
    lightmap: RID,
    lightmapUvScale: Rect2,
    lightmapSlice: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to lightmap, RECT2 to lightmapUvScale, LONG to lightmapSlice.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_SET_LIGHTMAP, NIL)
  }

  /**
   * Sets the level of detail bias to use when rendering the specified 3D geometry instance. Higher values result in higher detail from further away. Equivalent to [godot.GeometryInstance3D.lodBias].
   */
  public fun instanceGeometrySetLodBias(instance: RID, lodBias: Float): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to lodBias.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_SET_LOD_BIAS, NIL)
  }

  /**
   * Sets the per-instance shader uniform on the specified 3D geometry instance. Equivalent to [godot.GeometryInstance3D.setInstanceShaderParameter].
   */
  public fun instanceGeometrySetShaderParameter(
    instance: RID,
    parameter: StringName,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(_RID to instance, STRING_NAME to parameter, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_SET_SHADER_PARAMETER, NIL)
  }

  /**
   * Returns the value of the per-instance shader uniform from the specified 3D geometry instance. Equivalent to [godot.GeometryInstance3D.getInstanceShaderParameter].
   *
   * **Note:** Per-instance shader parameter names are case-sensitive.
   */
  public fun instanceGeometryGetShaderParameter(instance: RID, parameter: StringName): Any? {
    TransferContext.writeArguments(_RID to instance, STRING_NAME to parameter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_GET_SHADER_PARAMETER, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns the default value of the per-instance shader uniform from the specified 3D geometry instance. Equivalent to [godot.GeometryInstance3D.getInstanceShaderParameter].
   */
  public fun instanceGeometryGetShaderParameterDefaultValue(instance: RID, parameter: StringName):
      Any? {
    TransferContext.writeArguments(_RID to instance, STRING_NAME to parameter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_GET_SHADER_PARAMETER_DEFAULT_VALUE,
        ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns a dictionary of per-instance shader uniform names of the per-instance shader uniform from the specified 3D geometry instance. The returned dictionary is in PropertyInfo format, with the keys `name`, `class_name`, `type`, `hint`, `hint_string` and `usage`. Equivalent to [godot.GeometryInstance3D.getInstanceShaderParameter].
   */
  public fun instanceGeometryGetShaderParameterList(instance: RID):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(_RID to instance)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_GET_SHADER_PARAMETER_LIST, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns an array of object IDs intersecting with the provided AABB. Only 3D nodes that inherit from [godot.VisualInstance3D] are considered, such as [godot.MeshInstance3D] or [godot.DirectionalLight3D]. Use [@GlobalScope.instanceFromId] to obtain the actual nodes. A scenario RID must be provided, which is available in the [godot.World3D] you want to query. This forces an update for all resources queued to update.
   *
   * **Warning:** This function is primarily intended for editor usage. For in-game use cases, prefer physics collision.
   */
  @JvmOverloads
  public fun instancesCullAabb(aabb: AABB, scenario: RID = RID()): PackedInt64Array {
    TransferContext.writeArguments(godot.core.VariantType.AABB to aabb, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCES_CULL_AABB,
        PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  /**
   * Returns an array of object IDs intersecting with the provided 3D ray. Only 3D nodes that inherit from [godot.VisualInstance3D] are considered, such as [godot.MeshInstance3D] or [godot.DirectionalLight3D]. Use [@GlobalScope.instanceFromId] to obtain the actual nodes. A scenario RID must be provided, which is available in the [godot.World3D] you want to query. This forces an update for all resources queued to update.
   *
   * **Warning:** This function is primarily intended for editor usage. For in-game use cases, prefer physics collision.
   */
  @JvmOverloads
  public fun instancesCullRay(
    from: Vector3,
    to: Vector3,
    scenario: RID = RID(),
  ): PackedInt64Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCES_CULL_RAY,
        PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  /**
   * Returns an array of object IDs intersecting with the provided convex shape. Only 3D nodes that inherit from [godot.VisualInstance3D] are considered, such as [godot.MeshInstance3D] or [godot.DirectionalLight3D]. Use [@GlobalScope.instanceFromId] to obtain the actual nodes. A scenario RID must be provided, which is available in the [godot.World3D] you want to query. This forces an update for all resources queued to update.
   *
   * **Warning:** This function is primarily intended for editor usage. For in-game use cases, prefer physics collision.
   */
  @JvmOverloads
  public fun instancesCullConvex(convex: VariantArray<Plane>, scenario: RID = RID()):
      PackedInt64Array {
    TransferContext.writeArguments(ARRAY to convex, _RID to scenario)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCES_CULL_CONVEX, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  /**
   * Bakes the material data of the Mesh passed in the [base] parameter with optional [materialOverrides] to a set of [godot.Image]s of size [imageSize]. Returns an array of [godot.Image]s containing material properties as specified in [enum BakeChannels].
   */
  public fun bakeRenderUv2(
    base: RID,
    materialOverrides: VariantArray<RID>,
    imageSize: Vector2i,
  ): VariantArray<Image> {
    TransferContext.writeArguments(_RID to base, ARRAY to materialOverrides, VECTOR2I to imageSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_BAKE_RENDER_UV2,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Image>)
  }

  /**
   * Creates a canvas and returns the assigned [RID]. It can be accessed with the RID that is returned. This RID will be used in all `canvas_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * Canvas has no [godot.Resource] or [godot.Node] equivalent.
   */
  public fun canvasCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * A copy of the canvas item will be drawn with a local offset of the mirroring [godot.core.Vector2].
   */
  public fun canvasSetItemMirroring(
    canvas: RID,
    item: RID,
    mirroring: Vector2,
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, _RID to item, VECTOR2 to mirroring)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_SET_ITEM_MIRRORING, NIL)
  }

  /**
   * Modulates all colors in the given canvas.
   */
  public fun canvasSetModulate(canvas: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to canvas, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_SET_MODULATE,
        NIL)
  }

  /**
   *
   */
  public fun canvasSetDisableScale(disable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_SET_DISABLE_SCALE, NIL)
  }

  /**
   * Creates a canvas texture and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `canvas_texture_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method. See also [texture2dCreate].
   *
   * **Note:** The equivalent resource is [godot.CanvasTexture] and is only meant to be used in 2D rendering, not 3D.
   */
  public fun canvasTextureCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_TEXTURE_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the [channel]'s [texture] for the canvas texture specified by the [canvasTexture] RID. Equivalent to [godot.CanvasTexture.diffuseTexture], [godot.CanvasTexture.normalTexture] and [godot.CanvasTexture.specularTexture].
   */
  public fun canvasTextureSetChannel(
    canvasTexture: RID,
    channel: CanvasTextureChannel,
    texture: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasTexture, LONG to channel.id, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_TEXTURE_SET_CHANNEL, NIL)
  }

  /**
   * Sets the [baseColor] and [shininess] to use for the canvas texture specified by the [canvasTexture] RID. Equivalent to [godot.CanvasTexture.specularColor] and [godot.CanvasTexture.specularShininess].
   */
  public fun canvasTextureSetShadingParameters(
    canvasTexture: RID,
    baseColor: Color,
    shininess: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasTexture, COLOR to baseColor, DOUBLE to shininess.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_TEXTURE_SET_SHADING_PARAMETERS, NIL)
  }

  /**
   * Sets the texture [filter] mode to use for the canvas texture specified by the [canvasTexture] RID.
   */
  public fun canvasTextureSetTextureFilter(canvasTexture: RID, filter: CanvasItemTextureFilter):
      Unit {
    TransferContext.writeArguments(_RID to canvasTexture, LONG to filter.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_TEXTURE_SET_TEXTURE_FILTER, NIL)
  }

  /**
   * Sets the texture [repeat] mode to use for the canvas texture specified by the [canvasTexture] RID.
   */
  public fun canvasTextureSetTextureRepeat(canvasTexture: RID, repeat: CanvasItemTextureRepeat):
      Unit {
    TransferContext.writeArguments(_RID to canvasTexture, LONG to repeat.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_TEXTURE_SET_TEXTURE_REPEAT, NIL)
  }

  /**
   * Creates a new CanvasItem instance and returns its [RID]. It can be accessed with the RID that is returned. This RID will be used in all `canvas_item_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent node is [godot.CanvasItem].
   */
  public fun canvasItemCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets a parent [godot.CanvasItem] to the [godot.CanvasItem]. The item will inherit transform, modulation and visibility from its parent, like [godot.CanvasItem] nodes in the scene tree.
   */
  public fun canvasItemSetParent(item: RID, parent: RID): Unit {
    TransferContext.writeArguments(_RID to item, _RID to parent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_PARENT, NIL)
  }

  /**
   * Sets the default texture filter mode for the canvas item specified by the [item] RID. Equivalent to [godot.CanvasItem.textureFilter].
   */
  public fun canvasItemSetDefaultTextureFilter(item: RID, filter: CanvasItemTextureFilter): Unit {
    TransferContext.writeArguments(_RID to item, LONG to filter.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_DEFAULT_TEXTURE_FILTER, NIL)
  }

  /**
   * Sets the default texture repeat mode for the canvas item specified by the [item] RID. Equivalent to [godot.CanvasItem.textureRepeat].
   */
  public fun canvasItemSetDefaultTextureRepeat(item: RID, repeat: CanvasItemTextureRepeat): Unit {
    TransferContext.writeArguments(_RID to item, LONG to repeat.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_DEFAULT_TEXTURE_REPEAT, NIL)
  }

  /**
   * Sets the visibility of the [godot.CanvasItem].
   */
  public fun canvasItemSetVisible(item: RID, visible: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to visible)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_VISIBLE, NIL)
  }

  /**
   * Sets the light [mask] for the canvas item specified by the [item] RID. Equivalent to [godot.CanvasItem.lightMask].
   */
  public fun canvasItemSetLightMask(item: RID, mask: Int): Unit {
    TransferContext.writeArguments(_RID to item, LONG to mask.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_LIGHT_MASK, NIL)
  }

  /**
   * Sets the rendering visibility layer associated with this [godot.CanvasItem]. Only [godot.Viewport] nodes with a matching rendering mask will render this [godot.CanvasItem].
   */
  public fun canvasItemSetVisibilityLayer(item: RID, visibilityLayer: Long): Unit {
    TransferContext.writeArguments(_RID to item, LONG to visibilityLayer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_VISIBILITY_LAYER, NIL)
  }

  /**
   * Sets the [transform] of the canvas item specified by the [item] RID. This affects where and how the item will be drawn. Child canvas items' transforms are multiplied by their parent's transform. Equivalent to [godot.Node2D.transform].
   */
  public fun canvasItemSetTransform(item: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to item, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_TRANSFORM, NIL)
  }

  /**
   * If [clip] is `true`, makes the canvas item specified by the [item] RID not draw anything outside of its rect's coordinates. This clipping is fast, but works only with axis-aligned rectangles. This means that rotation is ignored by the clipping rectangle. For more advanced clipping shapes, use [canvasItemSetCanvasGroupMode] instead.
   *
   * **Note:** The equivalent node functionality is found in [godot.Label.clipText], [godot.RichTextLabel] (always enabled) and more.
   */
  public fun canvasItemSetClip(item: RID, clip: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to clip)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_CLIP, NIL)
  }

  /**
   * If [enabled] is `true`, enables multichannel signed distance field rendering mode for the canvas item specified by the [item] RID. This is meant to be used for font rendering, or with specially generated images using [msdfgen](https://github.com/Chlumsky/msdfgen).
   */
  public fun canvasItemSetDistanceFieldMode(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_DISTANCE_FIELD_MODE, NIL)
  }

  /**
   * If [useCustomRect] is `true`, sets the custom visibility rectangle (used for culling) to [rect] for the canvas item specified by [item]. Setting a custom visibility rect can reduce CPU load when drawing lots of 2D instances. If [useCustomRect] is `false`, automatically computes a visibility rectangle based on the canvas item's draw commands.
   */
  @JvmOverloads
  public fun canvasItemSetCustomRect(
    item: RID,
    useCustomRect: Boolean,
    rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
  ): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to useCustomRect, RECT2 to rect)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_CUSTOM_RECT, NIL)
  }

  /**
   * Multiplies the color of the canvas item specified by the [item] RID, while affecting its children. See also [canvasItemSetSelfModulate]. Equivalent to [godot.CanvasItem.modulate].
   */
  public fun canvasItemSetModulate(item: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to item, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_MODULATE, NIL)
  }

  /**
   * Multiplies the color of the canvas item specified by the [item] RID, without affecting its children. See also [canvasItemSetModulate]. Equivalent to [godot.CanvasItem.selfModulate].
   */
  public fun canvasItemSetSelfModulate(item: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to item, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_SELF_MODULATE, NIL)
  }

  /**
   * If [enabled] is `true`, draws the canvas item specified by the [item] RID behind its parent. Equivalent to [godot.CanvasItem.showBehindParent].
   */
  public fun canvasItemSetDrawBehindParent(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_DRAW_BEHIND_PARENT, NIL)
  }

  /**
   * Draws a line on the [godot.CanvasItem] pointed to by the [item] [RID]. See also [godot.CanvasItem.drawLine].
   */
  @JvmOverloads
  public fun canvasItemAddLine(
    item: RID,
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to item, VECTOR2 to from, VECTOR2 to to, COLOR to color, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_LINE, NIL)
  }

  /**
   * Draws a 2D polyline on the [godot.CanvasItem] pointed to by the [item] [RID]. See also [godot.CanvasItem.drawPolyline] and [godot.CanvasItem.drawPolylineColors].
   */
  @JvmOverloads
  public fun canvasItemAddPolyline(
    item: RID,
    points: PackedVector2Array,
    colors: PackedColorArray,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to item, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_POLYLINE, NIL)
  }

  /**
   * Draws a 2D multiline on the [godot.CanvasItem] pointed to by the [item] [RID]. See also [godot.CanvasItem.drawMultiline] and [godot.CanvasItem.drawMultilineColors].
   */
  @JvmOverloads
  public fun canvasItemAddMultiline(
    item: RID,
    points: PackedVector2Array,
    colors: PackedColorArray,
    width: Float = -1.0f,
  ): Unit {
    TransferContext.writeArguments(_RID to item, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, DOUBLE to width.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_MULTILINE, NIL)
  }

  /**
   * Draws a rectangle on the [godot.CanvasItem] pointed to by the [item] [RID]. See also [godot.CanvasItem.drawRect].
   */
  public fun canvasItemAddRect(
    item: RID,
    rect: Rect2,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_RECT, NIL)
  }

  /**
   * Draws a circle on the [godot.CanvasItem] pointed to by the [item] [RID]. See also [godot.CanvasItem.drawCircle].
   */
  public fun canvasItemAddCircle(
    item: RID,
    pos: Vector2,
    radius: Float,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(_RID to item, VECTOR2 to pos, DOUBLE to radius.toDouble(), COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_CIRCLE, NIL)
  }

  /**
   * Draws a 2D textured rectangle on the [godot.CanvasItem] pointed to by the [item] [RID]. See also [godot.CanvasItem.drawTextureRect] and [godot.Texture2D.drawRect].
   */
  @JvmOverloads
  public fun canvasItemAddTextureRect(
    item: RID,
    rect: Rect2,
    texture: RID,
    tile: Boolean = false,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, BOOL to tile, COLOR to modulate, BOOL to transpose)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_TEXTURE_RECT, NIL)
  }

  /**
   * See also [godot.CanvasItem.drawMsdfTextureRectRegion].
   */
  @JvmOverloads
  public fun canvasItemAddMsdfTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    outlineSize: Int = 0,
    pxRange: Float = 1.0f,
    scale: Float = 1.0f,
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, RECT2 to srcRect, COLOR to modulate, LONG to outlineSize.toLong(), DOUBLE to pxRange.toDouble(), DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_MSDF_TEXTURE_RECT_REGION, NIL)
  }

  /**
   * See also [godot.CanvasItem.drawLcdTextureRectRegion].
   */
  public fun canvasItemAddLcdTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color,
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, RECT2 to srcRect, COLOR to modulate)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_LCD_TEXTURE_RECT_REGION, NIL)
  }

  /**
   * Draws the specified region of a 2D textured rectangle on the [godot.CanvasItem] pointed to by the [item] [RID]. See also [godot.CanvasItem.drawTextureRectRegion] and [godot.Texture2D.drawRectRegion].
   */
  @JvmOverloads
  public fun canvasItemAddTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
    clipUv: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, RECT2 to srcRect, COLOR to modulate, BOOL to transpose, BOOL to clipUv)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_TEXTURE_RECT_REGION, NIL)
  }

  /**
   * Draws a nine-patch rectangle on the [godot.CanvasItem] pointed to by the [item] [RID].
   */
  @JvmOverloads
  public fun canvasItemAddNinePatch(
    item: RID,
    rect: Rect2,
    source: Rect2,
    texture: RID,
    topleft: Vector2,
    bottomright: Vector2,
    xAxisMode: NinePatchAxisMode = RenderingServer.NinePatchAxisMode.NINE_PATCH_STRETCH,
    yAxisMode: NinePatchAxisMode = RenderingServer.NinePatchAxisMode.NINE_PATCH_STRETCH,
    drawCenter: Boolean = true,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, RECT2 to source, _RID to texture, VECTOR2 to topleft, VECTOR2 to bottomright, LONG to xAxisMode.id, LONG to yAxisMode.id, BOOL to drawCenter, COLOR to modulate)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_NINE_PATCH, NIL)
  }

  /**
   * Draws a 2D primitive on the [godot.CanvasItem] pointed to by the [item] [RID]. See also [godot.CanvasItem.drawPrimitive].
   */
  public fun canvasItemAddPrimitive(
    item: RID,
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array,
    texture: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to item, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_PRIMITIVE, NIL)
  }

  /**
   * Draws a 2D polygon on the [godot.CanvasItem] pointed to by the [item] [RID]. If you need more flexibility (such as being able to use bones), use [canvasItemAddTriangleArray] instead. See also [godot.CanvasItem.drawPolygon].
   */
  @JvmOverloads
  public fun canvasItemAddPolygon(
    item: RID,
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array = PackedVector2Array(),
    texture: RID = RID(),
  ): Unit {
    TransferContext.writeArguments(_RID to item, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_POLYGON, NIL)
  }

  /**
   * Draws a triangle array on the [godot.CanvasItem] pointed to by the [item] [RID]. This is internally used by [godot.Line2D] and [godot.StyleBoxFlat] for rendering. [canvasItemAddTriangleArray] is highly flexible, but more complex to use than [canvasItemAddPolygon].
   *
   * **Note:** [count] is unused and can be left unspecified.
   */
  @JvmOverloads
  public fun canvasItemAddTriangleArray(
    item: RID,
    indices: PackedInt32Array,
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array = PackedVector2Array(),
    bones: PackedInt32Array = PackedInt32Array(),
    weights: PackedFloat32Array = PackedFloat32Array(),
    texture: RID = RID(),
    count: Int = -1,
  ): Unit {
    TransferContext.writeArguments(_RID to item, PACKED_INT_32_ARRAY to indices, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, PACKED_INT_32_ARRAY to bones, PACKED_FLOAT_32_ARRAY to weights, _RID to texture, LONG to count.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_TRIANGLE_ARRAY, NIL)
  }

  /**
   * Draws a mesh created with [meshCreate] with given [transform], [modulate] color, and [texture]. This is used internally by [godot.MeshInstance2D].
   */
  @JvmOverloads
  public fun canvasItemAddMesh(
    item: RID,
    mesh: RID,
    transform: Transform2D = Transform2D(),
    modulate: Color = Color(Color(1, 1, 1, 1)),
    texture: RID = RID(),
  ): Unit {
    TransferContext.writeArguments(_RID to item, _RID to mesh, TRANSFORM2D to transform, COLOR to modulate, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_MESH, NIL)
  }

  /**
   * Draws a 2D [godot.MultiMesh] on the [godot.CanvasItem] pointed to by the [item] [RID]. See also [godot.CanvasItem.drawMultimesh].
   */
  @JvmOverloads
  public fun canvasItemAddMultimesh(
    item: RID,
    mesh: RID,
    texture: RID = RID(),
  ): Unit {
    TransferContext.writeArguments(_RID to item, _RID to mesh, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_MULTIMESH, NIL)
  }

  /**
   * Draws particles on the [godot.CanvasItem] pointed to by the [item] [RID].
   */
  public fun canvasItemAddParticles(
    item: RID,
    particles: RID,
    texture: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to item, _RID to particles, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_PARTICLES, NIL)
  }

  /**
   * Sets a [godot.core.Transform2D] that will be used to transform subsequent canvas item commands.
   */
  public fun canvasItemAddSetTransform(item: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to item, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_SET_TRANSFORM, NIL)
  }

  /**
   * If [ignore] is `true`, ignore clipping on items drawn with this canvas item until this is called again with [ignore] set to false.
   */
  public fun canvasItemAddClipIgnore(item: RID, ignore: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to ignore)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_CLIP_IGNORE, NIL)
  }

  /**
   * Subsequent drawing commands will be ignored unless they fall within the specified animation slice. This is a faster way to implement animations that loop on background rather than redrawing constantly.
   */
  @JvmOverloads
  public fun canvasItemAddAnimationSlice(
    item: RID,
    animationLength: Double,
    sliceBegin: Double,
    sliceEnd: Double,
    offset: Double = 0.0,
  ): Unit {
    TransferContext.writeArguments(_RID to item, DOUBLE to animationLength, DOUBLE to sliceBegin, DOUBLE to sliceEnd, DOUBLE to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_ANIMATION_SLICE, NIL)
  }

  /**
   * If [enabled] is `true`, child nodes with the lowest Y position are drawn before those with a higher Y position. Y-sorting only affects children that inherit from the canvas item specified by the [item] RID, not the canvas item itself. Equivalent to [godot.CanvasItem.ySortEnabled].
   */
  public fun canvasItemSetSortChildrenByY(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_SORT_CHILDREN_BY_Y, NIL)
  }

  /**
   * Sets the [godot.CanvasItem]'s Z index, i.e. its draw order (lower indexes are drawn first).
   */
  public fun canvasItemSetZIndex(item: RID, zIndex: Int): Unit {
    TransferContext.writeArguments(_RID to item, LONG to zIndex.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_Z_INDEX, NIL)
  }

  /**
   * If this is enabled, the Z index of the parent will be added to the children's Z index.
   */
  public fun canvasItemSetZAsRelativeToParent(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_Z_AS_RELATIVE_TO_PARENT, NIL)
  }

  /**
   * Sets the [godot.CanvasItem] to copy a rect to the backbuffer.
   */
  public fun canvasItemSetCopyToBackbuffer(
    item: RID,
    enabled: Boolean,
    rect: Rect2,
  ): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled, RECT2 to rect)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_COPY_TO_BACKBUFFER, NIL)
  }

  /**
   * Clears the [godot.CanvasItem] and removes all commands in it.
   */
  public fun canvasItemClear(item: RID): Unit {
    TransferContext.writeArguments(_RID to item)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_CLEAR,
        NIL)
  }

  /**
   * Sets the index for the [godot.CanvasItem].
   */
  public fun canvasItemSetDrawIndex(item: RID, index: Int): Unit {
    TransferContext.writeArguments(_RID to item, LONG to index.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_DRAW_INDEX, NIL)
  }

  /**
   * Sets a new [material] to the canvas item specified by the [item] RID. Equivalent to [godot.CanvasItem.material].
   */
  public fun canvasItemSetMaterial(item: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to item, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_MATERIAL, NIL)
  }

  /**
   * Sets if the [godot.CanvasItem] uses its parent's material.
   */
  public fun canvasItemSetUseParentMaterial(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_USE_PARENT_MATERIAL, NIL)
  }

  /**
   * Sets the given [godot.CanvasItem] as visibility notifier. [area] defines the area of detecting visibility. [enterCallable] is called when the [godot.CanvasItem] enters the screen, [exitCallable] is called when the [godot.CanvasItem] exits the screen. If [enable] is `false`, the item will no longer function as notifier.
   *
   * This method can be used to manually mimic [godot.VisibleOnScreenNotifier2D].
   */
  public fun canvasItemSetVisibilityNotifier(
    item: RID,
    enable: Boolean,
    area: Rect2,
    enterCallable: Callable,
    exitCallable: Callable,
  ): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enable, RECT2 to area, CALLABLE to enterCallable, CALLABLE to exitCallable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_VISIBILITY_NOTIFIER, NIL)
  }

  /**
   * Sets the canvas group mode used during 2D rendering for the canvas item specified by the [item] RID. For faster but more limited clipping, use [canvasItemSetClip] instead.
   *
   * **Note:** The equivalent node functionality is found in [godot.CanvasGroup] and [godot.CanvasItem.clipChildren].
   */
  @JvmOverloads
  public fun canvasItemSetCanvasGroupMode(
    item: RID,
    mode: CanvasGroupMode,
    clearMargin: Float = 5.0f,
    fitEmpty: Boolean = false,
    fitMargin: Float = 0.0f,
    blurMipmaps: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to item, LONG to mode.id, DOUBLE to clearMargin.toDouble(), BOOL to fitEmpty, DOUBLE to fitMargin.toDouble(), BOOL to blurMipmaps)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_CANVAS_GROUP_MODE, NIL)
  }

  /**
   * Creates a canvas light and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `canvas_light_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent node is [godot.Light2D].
   */
  public fun canvasLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Attaches the canvas light to the canvas. Removes it from its previous canvas.
   */
  public fun canvasLightAttachToCanvas(light: RID, canvas: RID): Unit {
    TransferContext.writeArguments(_RID to light, _RID to canvas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_ATTACH_TO_CANVAS, NIL)
  }

  /**
   * Enables or disables a canvas light.
   */
  public fun canvasLightSetEnabled(light: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_ENABLED, NIL)
  }

  /**
   * Sets the scale factor of a [godot.PointLight2D]'s texture. Equivalent to [godot.PointLight2D.textureScale].
   */
  public fun canvasLightSetTextureScale(light: RID, scale: Float): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_TEXTURE_SCALE, NIL)
  }

  /**
   * Sets the canvas light's [godot.core.Transform2D].
   */
  public fun canvasLightSetTransform(light: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to light, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_TRANSFORM, NIL)
  }

  /**
   * Sets the texture to be used by a [godot.PointLight2D]. Equivalent to [godot.PointLight2D.texture].
   */
  public fun canvasLightSetTexture(light: RID, texture: RID): Unit {
    TransferContext.writeArguments(_RID to light, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_TEXTURE, NIL)
  }

  /**
   * Sets the offset of a [godot.PointLight2D]'s texture. Equivalent to [godot.PointLight2D.offset].
   */
  public fun canvasLightSetTextureOffset(light: RID, offset: Vector2): Unit {
    TransferContext.writeArguments(_RID to light, VECTOR2 to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_TEXTURE_OFFSET, NIL)
  }

  /**
   * Sets the color for a light.
   */
  public fun canvasLightSetColor(light: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_COLOR, NIL)
  }

  /**
   * Sets a canvas light's height.
   */
  public fun canvasLightSetHeight(light: RID, height: Float): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to height.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_HEIGHT, NIL)
  }

  /**
   * Sets a canvas light's energy.
   */
  public fun canvasLightSetEnergy(light: RID, energy: Float): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to energy.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_ENERGY, NIL)
  }

  /**
   * Sets the Z range of objects that will be affected by this light. Equivalent to [godot.Light2D.rangeZMin] and [godot.Light2D.rangeZMax].
   */
  public fun canvasLightSetZRange(
    light: RID,
    minZ: Int,
    maxZ: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to light, LONG to minZ.toLong(), LONG to maxZ.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_Z_RANGE, NIL)
  }

  /**
   * The layer range that gets rendered with this light.
   */
  public fun canvasLightSetLayerRange(
    light: RID,
    minLayer: Int,
    maxLayer: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to light, LONG to minLayer.toLong(), LONG to maxLayer.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_LAYER_RANGE, NIL)
  }

  /**
   * The light mask. See [godot.LightOccluder2D] for more information on light masks.
   */
  public fun canvasLightSetItemCullMask(light: RID, mask: Int): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mask.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_ITEM_CULL_MASK, NIL)
  }

  /**
   * The binary mask used to determine which layers this canvas light's shadows affects. See [godot.LightOccluder2D] for more information on light masks.
   */
  public fun canvasLightSetItemShadowCullMask(light: RID, mask: Int): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mask.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_ITEM_SHADOW_CULL_MASK, NIL)
  }

  /**
   * The mode of the light, see [enum CanvasLightMode] constants.
   */
  public fun canvasLightSetMode(light: RID, mode: CanvasLightMode): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_MODE, NIL)
  }

  /**
   * Enables or disables the canvas light's shadow.
   */
  public fun canvasLightSetShadowEnabled(light: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_SHADOW_ENABLED, NIL)
  }

  /**
   * Sets the canvas light's shadow's filter, see [enum CanvasLightShadowFilter] constants.
   */
  public fun canvasLightSetShadowFilter(light: RID, filter: CanvasLightShadowFilter): Unit {
    TransferContext.writeArguments(_RID to light, LONG to filter.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_SHADOW_FILTER, NIL)
  }

  /**
   * Sets the color of the canvas light's shadow.
   */
  public fun canvasLightSetShadowColor(light: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_SHADOW_COLOR, NIL)
  }

  /**
   * Smoothens the shadow. The lower, the smoother.
   */
  public fun canvasLightSetShadowSmooth(light: RID, smooth: Float): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to smooth.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_SHADOW_SMOOTH, NIL)
  }

  /**
   * Sets the blend mode for the given canvas light. See [enum CanvasLightBlendMode] for options. Equivalent to [godot.Light2D.blendMode].
   */
  public fun canvasLightSetBlendMode(light: RID, mode: CanvasLightBlendMode): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_BLEND_MODE, NIL)
  }

  /**
   * Creates a light occluder and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `canvas_light_occluder_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent node is [godot.LightOccluder2D].
   */
  public fun canvasLightOccluderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_OCCLUDER_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Attaches a light occluder to the canvas. Removes it from its previous canvas.
   */
  public fun canvasLightOccluderAttachToCanvas(occluder: RID, canvas: RID): Unit {
    TransferContext.writeArguments(_RID to occluder, _RID to canvas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_OCCLUDER_ATTACH_TO_CANVAS, NIL)
  }

  /**
   * Enables or disables light occluder.
   */
  public fun canvasLightOccluderSetEnabled(occluder: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to occluder, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_OCCLUDER_SET_ENABLED, NIL)
  }

  /**
   * Sets a light occluder's polygon.
   */
  public fun canvasLightOccluderSetPolygon(occluder: RID, polygon: RID): Unit {
    TransferContext.writeArguments(_RID to occluder, _RID to polygon)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_OCCLUDER_SET_POLYGON, NIL)
  }

  /**
   *
   */
  public fun canvasLightOccluderSetAsSdfCollision(occluder: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to occluder, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_OCCLUDER_SET_AS_SDF_COLLISION, NIL)
  }

  /**
   * Sets a light occluder's [godot.core.Transform2D].
   */
  public fun canvasLightOccluderSetTransform(occluder: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to occluder, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_OCCLUDER_SET_TRANSFORM, NIL)
  }

  /**
   * The light mask. See [godot.LightOccluder2D] for more information on light masks.
   */
  public fun canvasLightOccluderSetLightMask(occluder: RID, mask: Int): Unit {
    TransferContext.writeArguments(_RID to occluder, LONG to mask.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_OCCLUDER_SET_LIGHT_MASK, NIL)
  }

  /**
   * Creates a new light occluder polygon and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `canvas_occluder_polygon_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] method.
   *
   * **Note:** The equivalent resource is [godot.OccluderPolygon2D].
   */
  public fun canvasOccluderPolygonCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_OCCLUDER_POLYGON_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the shape of the occluder polygon.
   */
  public fun canvasOccluderPolygonSetShape(
    occluderPolygon: RID,
    shape: PackedVector2Array,
    closed: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to occluderPolygon, PACKED_VECTOR2_ARRAY to shape, BOOL to closed)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_OCCLUDER_POLYGON_SET_SHAPE, NIL)
  }

  /**
   * Sets an occluder polygons cull mode. See [enum CanvasOccluderPolygonCullMode] constants.
   */
  public fun canvasOccluderPolygonSetCullMode(occluderPolygon: RID,
      mode: CanvasOccluderPolygonCullMode): Unit {
    TransferContext.writeArguments(_RID to occluderPolygon, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_OCCLUDER_POLYGON_SET_CULL_MODE, NIL)
  }

  /**
   * Sets the [godot.ProjectSettings.rendering/2d/shadowAtlas/size] to use for [godot.Light2D] shadow rendering (in pixels). The value is rounded up to the nearest power of 2.
   */
  public fun canvasSetShadowTextureSize(size: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_SET_SHADOW_TEXTURE_SIZE, NIL)
  }

  /**
   * Creates a new global shader uniform.
   *
   * **Note:** Global shader parameter names are case-sensitive.
   */
  public fun globalShaderParameterAdd(
    name: StringName,
    type: GlobalShaderParameterType,
    defaultValue: Any?,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to type.id, ANY to defaultValue)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GLOBAL_SHADER_PARAMETER_ADD, NIL)
  }

  /**
   * Removes the global shader uniform specified by [name].
   */
  public fun globalShaderParameterRemove(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GLOBAL_SHADER_PARAMETER_REMOVE, NIL)
  }

  /**
   * Returns the list of global shader uniform names.
   *
   * **Note:** [globalShaderParameterGet] has a large performance penalty as the rendering thread needs to synchronize with the calling thread, which is slow. Do not use this method during gameplay to avoid stuttering. If you need to read values in a script after setting them, consider creating an autoload where you store the values you need to query at the same time you're setting them as global parameters.
   */
  public fun globalShaderParameterGetList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GLOBAL_SHADER_PARAMETER_GET_LIST, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  /**
   * Sets the global shader uniform [name] to [value].
   */
  public fun globalShaderParameterSet(name: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GLOBAL_SHADER_PARAMETER_SET, NIL)
  }

  /**
   * Overrides the global shader uniform [name] with [value]. Equivalent to the [godot.ShaderGlobalsOverride] node.
   */
  public fun globalShaderParameterSetOverride(name: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GLOBAL_SHADER_PARAMETER_SET_OVERRIDE, NIL)
  }

  /**
   * Returns the value of the global shader uniform specified by [name].
   *
   * **Note:** [globalShaderParameterGet] has a large performance penalty as the rendering thread needs to synchronize with the calling thread, which is slow. Do not use this method during gameplay to avoid stuttering. If you need to read values in a script after setting them, consider creating an autoload where you store the values you need to query at the same time you're setting them as global parameters.
   */
  public fun globalShaderParameterGet(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GLOBAL_SHADER_PARAMETER_GET, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns the type associated to the global shader uniform specified by [name].
   *
   * **Note:** [globalShaderParameterGet] has a large performance penalty as the rendering thread needs to synchronize with the calling thread, which is slow. Do not use this method during gameplay to avoid stuttering. If you need to read values in a script after setting them, consider creating an autoload where you store the values you need to query at the same time you're setting them as global parameters.
   */
  public fun globalShaderParameterGetType(name: StringName): GlobalShaderParameterType {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GLOBAL_SHADER_PARAMETER_GET_TYPE, LONG)
    return RenderingServer.GlobalShaderParameterType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Tries to free an object in the RenderingServer. To avoid memory leaks, this should be called after using an object as memory management does not occur automatically when using RendeeringServer directly.
   */
  public fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_FREE_RID, NIL)
  }

  /**
   * Schedules a callback to the given callable after a frame has been drawn.
   */
  public fun requestFrameDrawnCallback(callable: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REQUEST_FRAME_DRAWN_CALLBACK, NIL)
  }

  /**
   * Returns `true` if changes have been made to the RenderingServer's data. [forceDraw] is usually called if this happens.
   */
  public fun hasChanged(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_HAS_CHANGED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns a statistic about the rendering engine which can be used for performance profiling. See [enum RenderingServer.RenderingInfo] for a list of values that can be queried. See also [viewportGetRenderInfo], which returns information specific to a viewport.
   *
   * **Note:** Only 3D rendering is currently taken into account by some of these values, such as the number of draw calls.
   *
   * **Note:** Rendering information is not available until at least 2 frames have been rendered by the engine. If rendering information is not available, [getRenderingInfo] returns `0`. To print rendering information in `_ready()` successfully, use the following:
   *
   * ```
   * 				func _ready():
   * 				    for _i in 2:
   * 				        await get_tree().process_frame
   *
   * 				    print(RenderingServer.get_rendering_info(RENDERING_INFO_TOTAL_DRAW_CALLS_IN_FRAME))
   * 				```
   */
  public fun getRenderingInfo(info: RenderingInfo): Long {
    TransferContext.writeArguments(LONG to info.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_RENDERING_INFO,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the name of the video adapter (e.g. "GeForce GTX 1080/PCIe/SSE2").
   *
   * **Note:** When running a headless or server binary, this function returns an empty string.
   *
   * **Note:** On the web platform, some browsers such as Firefox may report a different, fixed GPU name such as "GeForce GTX 980" (regardless of the user's actual GPU model). This is done to make fingerprinting more difficult.
   */
  public fun getVideoAdapterName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_VIDEO_ADAPTER_NAME, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the vendor of the video adapter (e.g. "NVIDIA Corporation").
   *
   * **Note:** When running a headless or server binary, this function returns an empty string.
   */
  public fun getVideoAdapterVendor(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_VIDEO_ADAPTER_VENDOR, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the type of the video adapter. Since dedicated graphics cards from a given generation will *usually* be significantly faster than integrated graphics made in the same generation, the device type can be used as a basis for automatic graphics settings adjustment. However, this is not always true, so make sure to provide users with a way to manually override graphics settings.
   *
   * **Note:** When using the OpenGL backend or when running in headless mode, this function always returns [godot.RenderingDevice.DEVICE_TYPE_OTHER].
   */
  public fun getVideoAdapterType(): RenderingDevice.DeviceType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_VIDEO_ADAPTER_TYPE, LONG)
    return RenderingDevice.DeviceType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the version of the graphics video adapter *currently in use* (e.g. "1.2.189" for Vulkan, "3.3.0 NVIDIA 510.60.02" for OpenGL). This version may be different from the actual latest version supported by the hardware, as Godot may not always request the latest version. See also [godot.OS.getVideoAdapterDriverInfo].
   *
   * **Note:** When running a headless or server binary, this function returns an empty string.
   */
  public fun getVideoAdapterApiVersion(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_VIDEO_ADAPTER_API_VERSION, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a mesh of a sphere with the given number of horizontal subdivisions, vertical subdivisions and radius. See also [getTestCube].
   */
  public fun makeSphereMesh(
    latitudes: Int,
    longitudes: Int,
    radius: Float,
  ): RID {
    TransferContext.writeArguments(LONG to latitudes.toLong(), LONG to longitudes.toLong(), DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MAKE_SPHERE_MESH,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the RID of the test cube. This mesh will be created and returned on the first call to [getTestCube], then it will be cached for subsequent calls. See also [makeSphereMesh].
   */
  public fun getTestCube(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_TEST_CUBE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the RID of a 256×256 texture with a testing pattern on it (in [godot.Image.FORMAT_RGB8] format). This texture will be created and returned on the first call to [getTestTexture], then it will be cached for subsequent calls. See also [getWhiteTexture].
   *
   * Example of getting the test texture and applying it to a [godot.Sprite2D] node:
   *
   * ```
   * 				var texture_rid = RenderingServer.get_test_texture()
   * 				var texture = ImageTexture.create_from_image(RenderingServer.texture_2d_get(texture_rid))
   * 				$Sprite2D.texture = texture
   * 				```
   */
  public fun getTestTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_TEST_TEXTURE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the ID of a 4×4 white texture (in [godot.Image.FORMAT_RGB8] format). This texture will be created and returned on the first call to [getWhiteTexture], then it will be cached for subsequent calls. See also [getTestTexture].
   *
   * Example of getting the white texture and applying it to a [godot.Sprite2D] node:
   *
   * ```
   * 				var texture_rid = RenderingServer.get_white_texture()
   * 				var texture = ImageTexture.create_from_image(RenderingServer.texture_2d_get(texture_rid))
   * 				$Sprite2D.texture = texture
   * 				```
   */
  public fun getWhiteTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_WHITE_TEXTURE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets a boot image. The color defines the background color. If [scale] is `true`, the image will be scaled to fit the screen size. If [useFilter] is `true`, the image will be scaled with linear interpolation. If [useFilter] is `false`, the image will be scaled with nearest-neighbor interpolation.
   */
  @JvmOverloads
  public fun setBootImage(
    image: Image,
    color: Color,
    scale: Boolean,
    useFilter: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, COLOR to color, BOOL to scale, BOOL to useFilter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SET_BOOT_IMAGE, NIL)
  }

  /**
   * Returns the default clear color which is used when a specific clear color has not been selected. See also [setDefaultClearColor].
   */
  public fun getDefaultClearColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_DEFAULT_CLEAR_COLOR, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Sets the default clear color which is used when a specific clear color has not been selected. See also [getDefaultClearColor].
   */
  public fun setDefaultClearColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SET_DEFAULT_CLEAR_COLOR, NIL)
  }

  /**
   * Not yet implemented. Always returns `false`.
   */
  public fun hasFeature(feature: Features): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_HAS_FEATURE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the OS supports a certain [feature]. Features might be `s3tc`, `etc`, and `etc2`.
   */
  public fun hasOsFeature(feature: String): Boolean {
    TransferContext.writeArguments(STRING to feature)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_HAS_OS_FEATURE,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * This method is currently unimplemented and does nothing if called with [generate] set to `true`.
   */
  public fun setDebugGenerateWireframes(generate: Boolean): Unit {
    TransferContext.writeArguments(BOOL to generate)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SET_DEBUG_GENERATE_WIREFRAMES, NIL)
  }

  public fun isRenderLoopEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_IS_RENDER_LOOP_ENABLED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setRenderLoopEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SET_RENDER_LOOP_ENABLED, NIL)
  }

  /**
   * Returns the time taken to setup rendering on the CPU in milliseconds. This value is shared across all viewports and does *not* require [viewportSetMeasureRenderTime] to be enabled on a viewport to be queried. See also [viewportGetMeasuredRenderTimeCpu].
   */
  public fun getFrameSetupTimeCpu(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_FRAME_SETUP_TIME_CPU, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Forces a synchronization between the CPU and GPU, which may be required in certain cases. Only call this when needed, as CPU-GPU synchronization has a performance cost.
   */
  public fun forceSync(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_FORCE_SYNC, NIL)
  }

  /**
   * Forces redrawing of all viewports at once.
   */
  @JvmOverloads
  public fun forceDraw(swapBuffers: Boolean = true, frameStep: Double = 0.0): Unit {
    TransferContext.writeArguments(BOOL to swapBuffers, DOUBLE to frameStep)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_FORCE_DRAW, NIL)
  }

  /**
   * Returns the global RenderingDevice.
   *
   * **Note:** When using the OpenGL backend or when running in headless mode, this function always returns `null`.
   */
  public fun getRenderingDevice(): RenderingDevice? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_RENDERING_DEVICE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as RenderingDevice?)
  }

  /**
   * Creates a RenderingDevice that can be used to do draw and compute operations on a separate thread. Cannot draw to the screen nor share data with the global RenderingDevice.
   *
   * **Note:** When using the OpenGL backend or when running in headless mode, this function always returns `null`.
   */
  public fun createLocalRenderingDevice(): RenderingDevice? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CREATE_LOCAL_RENDERING_DEVICE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as RenderingDevice?)
  }

  public enum class TextureLayeredType(
    id: Long,
  ) {
    /**
     * Array of 2-dimensional textures (see [godot.Texture2DArray]).
     */
    TEXTURE_LAYERED_2D_ARRAY(0),
    /**
     * Cubemap texture (see [godot.Cubemap]).
     */
    TEXTURE_LAYERED_CUBEMAP(1),
    /**
     * Array of cubemap textures (see [godot.CubemapArray]).
     */
    TEXTURE_LAYERED_CUBEMAP_ARRAY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CubeMapLayer(
    id: Long,
  ) {
    /**
     * Left face of a [godot.Cubemap].
     */
    CUBEMAP_LAYER_LEFT(0),
    /**
     * Right face of a [godot.Cubemap].
     */
    CUBEMAP_LAYER_RIGHT(1),
    /**
     * Bottom face of a [godot.Cubemap].
     */
    CUBEMAP_LAYER_BOTTOM(2),
    /**
     * Top face of a [godot.Cubemap].
     */
    CUBEMAP_LAYER_TOP(3),
    /**
     * Front face of a [godot.Cubemap].
     */
    CUBEMAP_LAYER_FRONT(4),
    /**
     * Back face of a [godot.Cubemap].
     */
    CUBEMAP_LAYER_BACK(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ShaderMode(
    id: Long,
  ) {
    /**
     * Shader is a 3D shader.
     */
    SHADER_SPATIAL(0),
    /**
     * Shader is a 2D shader.
     */
    SHADER_CANVAS_ITEM(1),
    /**
     * Shader is a particle shader (can be used in both 2D and 3D).
     */
    SHADER_PARTICLES(2),
    /**
     * Shader is a 3D sky shader.
     */
    SHADER_SKY(3),
    /**
     * Shader is a 3D fog shader.
     */
    SHADER_FOG(4),
    /**
     * Represents the size of the [enum ShaderMode] enum.
     */
    SHADER_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ArrayType(
    id: Long,
  ) {
    /**
     * Array is a vertex position array.
     */
    ARRAY_VERTEX(0),
    /**
     * Array is a normal array.
     */
    ARRAY_NORMAL(1),
    /**
     * Array is a tangent array.
     */
    ARRAY_TANGENT(2),
    /**
     * Array is a vertex color array.
     */
    ARRAY_COLOR(3),
    /**
     * Array is a UV coordinates array.
     */
    ARRAY_TEX_UV(4),
    /**
     * Array is a UV coordinates array for the second set of UV coordinates.
     */
    ARRAY_TEX_UV2(5),
    /**
     * Array is a custom data array for the first set of custom data.
     */
    ARRAY_CUSTOM0(6),
    /**
     * Array is a custom data array for the second set of custom data.
     */
    ARRAY_CUSTOM1(7),
    /**
     * Array is a custom data array for the third set of custom data.
     */
    ARRAY_CUSTOM2(8),
    /**
     * Array is a custom data array for the fourth set of custom data.
     */
    ARRAY_CUSTOM3(9),
    /**
     * Array contains bone information.
     */
    ARRAY_BONES(10),
    /**
     * Array is weight information.
     */
    ARRAY_WEIGHTS(11),
    /**
     * Array is an index array.
     */
    ARRAY_INDEX(12),
    /**
     * Represents the size of the [enum ArrayType] enum.
     */
    ARRAY_MAX(13),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ArrayCustomFormat(
    id: Long,
  ) {
    /**
     * Custom data array contains 8-bit-per-channel red/green/blue/alpha color data. Values are normalized, unsigned floating-point in the `[0.0, 1.0]` range.
     */
    ARRAY_CUSTOM_RGBA8_UNORM(0),
    /**
     * Custom data array contains 8-bit-per-channel red/green/blue/alpha color data. Values are normalized, signed floating-point in the `[-1.0, 1.0]` range.
     */
    ARRAY_CUSTOM_RGBA8_SNORM(1),
    /**
     * Custom data array contains 16-bit-per-channel red/green color data. Values are floating-point in half precision.
     */
    ARRAY_CUSTOM_RG_HALF(2),
    /**
     * Custom data array contains 16-bit-per-channel red/green/blue/alpha color data. Values are floating-point in half precision.
     */
    ARRAY_CUSTOM_RGBA_HALF(3),
    /**
     * Custom data array contains 32-bit-per-channel red color data. Values are floating-point in single precision.
     */
    ARRAY_CUSTOM_R_FLOAT(4),
    /**
     * Custom data array contains 32-bit-per-channel red/green color data. Values are floating-point in single precision.
     */
    ARRAY_CUSTOM_RG_FLOAT(5),
    /**
     * Custom data array contains 32-bit-per-channel red/green/blue color data. Values are floating-point in single precision.
     */
    ARRAY_CUSTOM_RGB_FLOAT(6),
    /**
     * Custom data array contains 32-bit-per-channel red/green/blue/alpha color data. Values are floating-point in single precision.
     */
    ARRAY_CUSTOM_RGBA_FLOAT(7),
    /**
     * Represents the size of the [enum ArrayCustomFormat] enum.
     */
    ARRAY_CUSTOM_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public sealed interface ArrayFormat {
    public val flag: Long

    public infix fun or(other: ArrayFormat): ArrayFormat = ArrayFormatValue(flag.or(other.flag))

    public infix fun or(other: Long): ArrayFormat = ArrayFormatValue(flag.or(other))

    public infix fun xor(other: ArrayFormat): ArrayFormat = ArrayFormatValue(flag.xor(other.flag))

    public infix fun xor(other: Long): ArrayFormat = ArrayFormatValue(flag.xor(other))

    public infix fun and(other: ArrayFormat): ArrayFormat = ArrayFormatValue(flag.and(other.flag))

    public infix fun and(other: Long): ArrayFormat = ArrayFormatValue(flag.and(other))

    public operator fun plus(other: ArrayFormat): ArrayFormat =
        ArrayFormatValue(flag.plus(other.flag))

    public operator fun plus(other: Long): ArrayFormat = ArrayFormatValue(flag.plus(other))

    public operator fun minus(other: ArrayFormat): ArrayFormat =
        ArrayFormatValue(flag.minus(other.flag))

    public operator fun minus(other: Long): ArrayFormat = ArrayFormatValue(flag.minus(other))

    public operator fun times(other: ArrayFormat): ArrayFormat =
        ArrayFormatValue(flag.times(other.flag))

    public operator fun times(other: Long): ArrayFormat = ArrayFormatValue(flag.times(other))

    public operator fun div(other: ArrayFormat): ArrayFormat =
        ArrayFormatValue(flag.div(other.flag))

    public operator fun div(other: Long): ArrayFormat = ArrayFormatValue(flag.div(other))

    public operator fun rem(other: ArrayFormat): ArrayFormat =
        ArrayFormatValue(flag.rem(other.flag))

    public operator fun rem(other: Long): ArrayFormat = ArrayFormatValue(flag.rem(other))

    public fun unaryPlus(): ArrayFormat = ArrayFormatValue(flag.unaryPlus())

    public fun unaryMinus(): ArrayFormat = ArrayFormatValue(flag.unaryMinus())

    public fun inv(): ArrayFormat = ArrayFormatValue(flag.inv())

    public infix fun shl(bits: Int): ArrayFormat = ArrayFormatValue(flag shl bits)

    public infix fun shr(bits: Int): ArrayFormat = ArrayFormatValue(flag shr bits)

    public infix fun ushr(bits: Int): ArrayFormat = ArrayFormatValue(flag ushr bits)

    public companion object {
      public val ARRAY_FORMAT_VERTEX: ArrayFormat = ArrayFormatValue(1)

      public val ARRAY_FORMAT_NORMAL: ArrayFormat = ArrayFormatValue(2)

      public val ARRAY_FORMAT_TANGENT: ArrayFormat = ArrayFormatValue(4)

      public val ARRAY_FORMAT_COLOR: ArrayFormat = ArrayFormatValue(8)

      public val ARRAY_FORMAT_TEX_UV: ArrayFormat = ArrayFormatValue(16)

      public val ARRAY_FORMAT_TEX_UV2: ArrayFormat = ArrayFormatValue(32)

      public val ARRAY_FORMAT_CUSTOM0: ArrayFormat = ArrayFormatValue(64)

      public val ARRAY_FORMAT_CUSTOM1: ArrayFormat = ArrayFormatValue(128)

      public val ARRAY_FORMAT_CUSTOM2: ArrayFormat = ArrayFormatValue(256)

      public val ARRAY_FORMAT_CUSTOM3: ArrayFormat = ArrayFormatValue(512)

      public val ARRAY_FORMAT_BONES: ArrayFormat = ArrayFormatValue(1024)

      public val ARRAY_FORMAT_WEIGHTS: ArrayFormat = ArrayFormatValue(2048)

      public val ARRAY_FORMAT_INDEX: ArrayFormat = ArrayFormatValue(4096)

      public val ARRAY_FORMAT_BLEND_SHAPE_MASK: ArrayFormat = ArrayFormatValue(7)

      public val ARRAY_FORMAT_CUSTOM_BASE: ArrayFormat = ArrayFormatValue(13)

      public val ARRAY_FORMAT_CUSTOM_BITS: ArrayFormat = ArrayFormatValue(3)

      public val ARRAY_FORMAT_CUSTOM0_SHIFT: ArrayFormat = ArrayFormatValue(13)

      public val ARRAY_FORMAT_CUSTOM1_SHIFT: ArrayFormat = ArrayFormatValue(16)

      public val ARRAY_FORMAT_CUSTOM2_SHIFT: ArrayFormat = ArrayFormatValue(19)

      public val ARRAY_FORMAT_CUSTOM3_SHIFT: ArrayFormat = ArrayFormatValue(22)

      public val ARRAY_FORMAT_CUSTOM_MASK: ArrayFormat = ArrayFormatValue(7)

      public val ARRAY_COMPRESS_FLAGS_BASE: ArrayFormat = ArrayFormatValue(25)

      public val ARRAY_FLAG_USE_2D_VERTICES: ArrayFormat = ArrayFormatValue(33554432)

      public val ARRAY_FLAG_USE_DYNAMIC_UPDATE: ArrayFormat = ArrayFormatValue(67108864)

      public val ARRAY_FLAG_USE_8_BONE_WEIGHTS: ArrayFormat = ArrayFormatValue(134217728)

      public val ARRAY_FLAG_USES_EMPTY_VERTEX_ARRAY: ArrayFormat = ArrayFormatValue(268435456)
    }
  }

  @JvmInline
  internal value class ArrayFormatValue internal constructor(
    public override val flag: Long,
  ) : ArrayFormat

  public enum class PrimitiveType(
    id: Long,
  ) {
    /**
     * Primitive to draw consists of points.
     */
    PRIMITIVE_POINTS(0),
    /**
     * Primitive to draw consists of lines.
     */
    PRIMITIVE_LINES(1),
    /**
     * Primitive to draw consists of a line strip from start to end.
     */
    PRIMITIVE_LINE_STRIP(2),
    /**
     * Primitive to draw consists of triangles.
     */
    PRIMITIVE_TRIANGLES(3),
    /**
     * Primitive to draw consists of a triangle strip (the last 3 vertices are always combined to make a triangle).
     */
    PRIMITIVE_TRIANGLE_STRIP(4),
    /**
     * Represents the size of the [enum PrimitiveType] enum.
     */
    PRIMITIVE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class BlendShapeMode(
    id: Long,
  ) {
    /**
     * Blend shapes are normalized.
     */
    BLEND_SHAPE_MODE_NORMALIZED(0),
    /**
     * Blend shapes are relative to base weight.
     */
    BLEND_SHAPE_MODE_RELATIVE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class MultimeshTransformFormat(
    id: Long,
  ) {
    /**
     * Use [godot.core.Transform2D] to store MultiMesh transform.
     */
    MULTIMESH_TRANSFORM_2D(0),
    /**
     * Use [godot.Transform3D] to store MultiMesh transform.
     */
    MULTIMESH_TRANSFORM_3D(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LightProjectorFilter(
    id: Long,
  ) {
    /**
     * Nearest-neighbor filter for light projectors (use for pixel art light projectors). No mipmaps are used for rendering, which means light projectors at a distance will look sharp but grainy. This has roughly the same performance cost as using mipmaps.
     */
    LIGHT_PROJECTOR_FILTER_NEAREST(0),
    /**
     * Linear filter for light projectors (use for non-pixel art light projectors). No mipmaps are used for rendering, which means light projectors at a distance will look smooth but blurry. This has roughly the same performance cost as using mipmaps.
     */
    LIGHT_PROJECTOR_FILTER_LINEAR(1),
    /**
     * Nearest-neighbor filter for light projectors (use for pixel art light projectors). Isotropic mipmaps are used for rendering, which means light projectors at a distance will look smooth but blurry. This has roughly the same performance cost as not using mipmaps.
     */
    LIGHT_PROJECTOR_FILTER_NEAREST_MIPMAPS(2),
    /**
     * Linear filter for light projectors (use for non-pixel art light projectors). Isotropic mipmaps are used for rendering, which means light projectors at a distance will look smooth but blurry. This has roughly the same performance cost as not using mipmaps.
     */
    LIGHT_PROJECTOR_FILTER_LINEAR_MIPMAPS(3),
    /**
     * Nearest-neighbor filter for light projectors (use for pixel art light projectors). Anisotropic mipmaps are used for rendering, which means light projectors at a distance will look smooth and sharp when viewed from oblique angles. This looks better compared to isotropic mipmaps, but is slower. The level of anisotropic filtering is defined by [godot.ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     */
    LIGHT_PROJECTOR_FILTER_NEAREST_MIPMAPS_ANISOTROPIC(4),
    /**
     * Linear filter for light projectors (use for non-pixel art light projectors). Anisotropic mipmaps are used for rendering, which means light projectors at a distance will look smooth and sharp when viewed from oblique angles. This looks better compared to isotropic mipmaps, but is slower. The level of anisotropic filtering is defined by [godot.ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     */
    LIGHT_PROJECTOR_FILTER_LINEAR_MIPMAPS_ANISOTROPIC(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LightType(
    id: Long,
  ) {
    /**
     * Directional (sun/moon) light (see [godot.DirectionalLight3D]).
     */
    LIGHT_DIRECTIONAL(0),
    /**
     * Omni light (see [godot.OmniLight3D]).
     */
    LIGHT_OMNI(1),
    /**
     * Spot light (see [godot.SpotLight3D]).
     */
    LIGHT_SPOT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LightParam(
    id: Long,
  ) {
    /**
     * The light's energy multiplier.
     */
    LIGHT_PARAM_ENERGY(0),
    /**
     * The light's indirect energy multiplier (final indirect energy is [LIGHT_PARAM_ENERGY] * [LIGHT_PARAM_INDIRECT_ENERGY]).
     */
    LIGHT_PARAM_INDIRECT_ENERGY(1),
    /**
     * The light's volumetric fog energy multiplier (final volumetric fog energy is [LIGHT_PARAM_ENERGY] * [LIGHT_PARAM_VOLUMETRIC_FOG_ENERGY]).
     */
    LIGHT_PARAM_VOLUMETRIC_FOG_ENERGY(2),
    /**
     * The light's influence on specularity.
     */
    LIGHT_PARAM_SPECULAR(3),
    /**
     * The light's range.
     */
    LIGHT_PARAM_RANGE(4),
    /**
     * The size of the light when using spot light or omni light. The angular size of the light when using directional light.
     */
    LIGHT_PARAM_SIZE(5),
    /**
     * The light's attenuation.
     */
    LIGHT_PARAM_ATTENUATION(6),
    /**
     * The spotlight's angle.
     */
    LIGHT_PARAM_SPOT_ANGLE(7),
    /**
     * The spotlight's attenuation.
     */
    LIGHT_PARAM_SPOT_ATTENUATION(8),
    /**
     * The maximum distance for shadow splits. Increasing this value will make directional shadows visible from further away, at the cost of lower overall shadow detail and performance (since more objects need to be included in the directional shadow rendering).
     */
    LIGHT_PARAM_SHADOW_MAX_DISTANCE(9),
    /**
     * Proportion of shadow atlas occupied by the first split.
     */
    LIGHT_PARAM_SHADOW_SPLIT_1_OFFSET(10),
    /**
     * Proportion of shadow atlas occupied by the second split.
     */
    LIGHT_PARAM_SHADOW_SPLIT_2_OFFSET(11),
    /**
     * Proportion of shadow atlas occupied by the third split. The fourth split occupies the rest.
     */
    LIGHT_PARAM_SHADOW_SPLIT_3_OFFSET(12),
    /**
     * Proportion of shadow max distance where the shadow will start to fade out.
     */
    LIGHT_PARAM_SHADOW_FADE_START(13),
    /**
     * Normal bias used to offset shadow lookup by object normal. Can be used to fix self-shadowing artifacts.
     */
    LIGHT_PARAM_SHADOW_NORMAL_BIAS(14),
    /**
     * Bias the shadow lookup to fix self-shadowing artifacts.
     */
    LIGHT_PARAM_SHADOW_BIAS(15),
    /**
     * Sets the size of the directional shadow pancake. The pancake offsets the start of the shadow's camera frustum to provide a higher effective depth resolution for the shadow. However, a high pancake size can cause artifacts in the shadows of large objects that are close to the edge of the frustum. Reducing the pancake size can help. Setting the size to `0` turns off the pancaking effect.
     */
    LIGHT_PARAM_SHADOW_PANCAKE_SIZE(16),
    /**
     * The light's shadow opacity. Values lower than `1.0` make the light appear through shadows. This can be used to fake global illumination at a low performance cost.
     */
    LIGHT_PARAM_SHADOW_OPACITY(17),
    /**
     * Blurs the edges of the shadow. Can be used to hide pixel artifacts in low resolution shadow maps. A high value can make shadows appear grainy and can cause other unwanted artifacts. Try to keep as near default as possible.
     */
    LIGHT_PARAM_SHADOW_BLUR(18),
    /**
     *
     */
    LIGHT_PARAM_TRANSMITTANCE_BIAS(19),
    /**
     * Constant representing the intensity of the light, measured in Lumens when dealing with a [godot.SpotLight3D] or [godot.OmniLight3D], or measured in Lux with a [godot.DirectionalLight3D]. Only used when [godot.ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is `true`.
     */
    LIGHT_PARAM_INTENSITY(20),
    /**
     * Represents the size of the [enum LightParam] enum.
     */
    LIGHT_PARAM_MAX(21),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LightBakeMode(
    id: Long,
  ) {
    /**
     * Light is ignored when baking. This is the fastest mode, but the light will be taken into account when baking global illumination. This mode should generally be used for dynamic lights that change quickly, as the effect of global illumination is less noticeable on those lights.
     */
    LIGHT_BAKE_DISABLED(0),
    /**
     * Light is taken into account in static baking ([godot.VoxelGI], [godot.LightmapGI], SDFGI ([godot.Environment.sdfgiEnabled])). The light can be moved around or modified, but its global illumination will not update in real-time. This is suitable for subtle changes (such as flickering torches), but generally not large changes such as toggling a light on and off.
     */
    LIGHT_BAKE_STATIC(1),
    /**
     * Light is taken into account in dynamic baking ([godot.VoxelGI] and SDFGI ([godot.Environment.sdfgiEnabled]) only). The light can be moved around or modified with global illumination updating in real-time. The light's global illumination appearance will be slightly different compared to [LIGHT_BAKE_STATIC]. This has a greater performance cost compared to [LIGHT_BAKE_STATIC]. When using SDFGI, the update speed of dynamic lights is affected by [godot.ProjectSettings.rendering/globalIllumination/sdfgi/framesToUpdateLights].
     */
    LIGHT_BAKE_DYNAMIC(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LightOmniShadowMode(
    id: Long,
  ) {
    /**
     * Use a dual paraboloid shadow map for omni lights.
     */
    LIGHT_OMNI_SHADOW_DUAL_PARABOLOID(0),
    /**
     * Use a cubemap shadow map for omni lights. Slower but better quality than dual paraboloid.
     */
    LIGHT_OMNI_SHADOW_CUBE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LightDirectionalShadowMode(
    id: Long,
  ) {
    /**
     * Use orthogonal shadow projection for directional light.
     */
    LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL(0),
    /**
     * Use 2 splits for shadow projection when using directional light.
     */
    LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS(1),
    /**
     * Use 4 splits for shadow projection when using directional light.
     */
    LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LightDirectionalSkyMode(
    id: Long,
  ) {
    /**
     * Use DirectionalLight3D in both sky rendering and scene lighting.
     */
    LIGHT_DIRECTIONAL_SKY_MODE_LIGHT_AND_SKY(0),
    /**
     * Only use DirectionalLight3D in scene lighting.
     */
    LIGHT_DIRECTIONAL_SKY_MODE_LIGHT_ONLY(1),
    /**
     * Only use DirectionalLight3D in sky rendering.
     */
    LIGHT_DIRECTIONAL_SKY_MODE_SKY_ONLY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ShadowQuality(
    id: Long,
  ) {
    /**
     * Lowest shadow filtering quality (fastest). Soft shadows are not available with this quality setting, which means the [godot.Light3D.shadowBlur] property is ignored if [godot.Light3D.lightSize] and [godot.Light3D.lightAngularDistance] is `0.0`.
     *
     * **Note:** The variable shadow blur performed by [godot.Light3D.lightSize] and [godot.Light3D.lightAngularDistance] is still effective when using hard shadow filtering. In this case, [godot.Light3D.shadowBlur] *is* taken into account. However, the results will not be blurred, instead the blur amount is treated as a maximum radius for the penumbra.
     */
    SHADOW_QUALITY_HARD(0),
    /**
     * Very low shadow filtering quality (faster). When using this quality setting, [godot.Light3D.shadowBlur] is automatically multiplied by 0.75× to avoid introducing too much noise. This division only applies to lights whose [godot.Light3D.lightSize] or [godot.Light3D.lightAngularDistance] is `0.0`).
     */
    SHADOW_QUALITY_SOFT_VERY_LOW(1),
    /**
     * Low shadow filtering quality (fast).
     */
    SHADOW_QUALITY_SOFT_LOW(2),
    /**
     * Medium low shadow filtering quality (average).
     */
    SHADOW_QUALITY_SOFT_MEDIUM(3),
    /**
     * High low shadow filtering quality (slow). When using this quality setting, [godot.Light3D.shadowBlur] is automatically multiplied by 1.5× to better make use of the high sample count. This increased blur also improves the stability of dynamic object shadows. This multiplier only applies to lights whose [godot.Light3D.lightSize] or [godot.Light3D.lightAngularDistance] is `0.0`).
     */
    SHADOW_QUALITY_SOFT_HIGH(4),
    /**
     * Highest low shadow filtering quality (slowest). When using this quality setting, [godot.Light3D.shadowBlur] is automatically multiplied by 2× to better make use of the high sample count. This increased blur also improves the stability of dynamic object shadows. This multiplier only applies to lights whose [godot.Light3D.lightSize] or [godot.Light3D.lightAngularDistance] is `0.0`).
     */
    SHADOW_QUALITY_SOFT_ULTRA(5),
    /**
     * Represents the size of the [enum ShadowQuality] enum.
     */
    SHADOW_QUALITY_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ReflectionProbeUpdateMode(
    id: Long,
  ) {
    /**
     * Reflection probe will update reflections once and then stop.
     */
    REFLECTION_PROBE_UPDATE_ONCE(0),
    /**
     * Reflection probe will update each frame. This mode is necessary to capture moving objects.
     */
    REFLECTION_PROBE_UPDATE_ALWAYS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ReflectionProbeAmbientMode(
    id: Long,
  ) {
    /**
     * Do not apply any ambient lighting inside the reflection probe's box defined by its size.
     */
    REFLECTION_PROBE_AMBIENT_DISABLED(0),
    /**
     * Apply automatically-sourced environment lighting inside the reflection probe's box defined by its size.
     */
    REFLECTION_PROBE_AMBIENT_ENVIRONMENT(1),
    /**
     * Apply custom ambient lighting inside the reflection probe's box defined by its size. See [reflectionProbeSetAmbientColor] and [reflectionProbeSetAmbientEnergy].
     */
    REFLECTION_PROBE_AMBIENT_COLOR(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DecalTexture(
    id: Long,
  ) {
    /**
     * Albedo texture slot in a decal ([godot.Decal.textureAlbedo]).
     */
    DECAL_TEXTURE_ALBEDO(0),
    /**
     * Normal map texture slot in a decal ([godot.Decal.textureNormal]).
     */
    DECAL_TEXTURE_NORMAL(1),
    /**
     * Occlusion/Roughness/Metallic texture slot in a decal ([godot.Decal.textureOrm]).
     */
    DECAL_TEXTURE_ORM(2),
    /**
     * Emission texture slot in a decal ([godot.Decal.textureEmission]).
     */
    DECAL_TEXTURE_EMISSION(3),
    /**
     * Represents the size of the [enum DecalTexture] enum.
     */
    DECAL_TEXTURE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DecalFilter(
    id: Long,
  ) {
    /**
     * Nearest-neighbor filter for decals (use for pixel art decals). No mipmaps are used for rendering, which means decals at a distance will look sharp but grainy. This has roughly the same performance cost as using mipmaps.
     */
    DECAL_FILTER_NEAREST(0),
    /**
     * Linear filter for decals (use for non-pixel art decals). No mipmaps are used for rendering, which means decals at a distance will look smooth but blurry. This has roughly the same performance cost as using mipmaps.
     */
    DECAL_FILTER_LINEAR(1),
    /**
     * Nearest-neighbor filter for decals (use for pixel art decals). Isotropic mipmaps are used for rendering, which means decals at a distance will look smooth but blurry. This has roughly the same performance cost as not using mipmaps.
     */
    DECAL_FILTER_NEAREST_MIPMAPS(2),
    /**
     * Linear filter for decals (use for non-pixel art decals). Isotropic mipmaps are used for rendering, which means decals at a distance will look smooth but blurry. This has roughly the same performance cost as not using mipmaps.
     */
    DECAL_FILTER_LINEAR_MIPMAPS(3),
    /**
     * Nearest-neighbor filter for decals (use for pixel art decals). Anisotropic mipmaps are used for rendering, which means decals at a distance will look smooth and sharp when viewed from oblique angles. This looks better compared to isotropic mipmaps, but is slower. The level of anisotropic filtering is defined by [godot.ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     */
    DECAL_FILTER_NEAREST_MIPMAPS_ANISOTROPIC(4),
    /**
     * Linear filter for decals (use for non-pixel art decals). Anisotropic mipmaps are used for rendering, which means decals at a distance will look smooth and sharp when viewed from oblique angles. This looks better compared to isotropic mipmaps, but is slower. The level of anisotropic filtering is defined by [godot.ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     */
    DECAL_FILTER_LINEAR_MIPMAPS_ANISOTROPIC(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class VoxelGIQuality(
    id: Long,
  ) {
    /**
     * Low [godot.VoxelGI] rendering quality using 4 cones.
     */
    VOXEL_GI_QUALITY_LOW(0),
    /**
     * High [godot.VoxelGI] rendering quality using 6 cones.
     */
    VOXEL_GI_QUALITY_HIGH(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ParticlesMode(
    id: Long,
  ) {
    /**
     * 2D particles.
     */
    PARTICLES_MODE_2D(0),
    /**
     * 3D particles.
     */
    PARTICLES_MODE_3D(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ParticlesTransformAlign(
    id: Long,
  ) {
    /**
     *
     */
    PARTICLES_TRANSFORM_ALIGN_DISABLED(0),
    /**
     *
     */
    PARTICLES_TRANSFORM_ALIGN_Z_BILLBOARD(1),
    /**
     *
     */
    PARTICLES_TRANSFORM_ALIGN_Y_TO_VELOCITY(2),
    /**
     *
     */
    PARTICLES_TRANSFORM_ALIGN_Z_BILLBOARD_Y_TO_VELOCITY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ParticlesDrawOrder(
    id: Long,
  ) {
    /**
     * Draw particles in the order that they appear in the particles array.
     */
    PARTICLES_DRAW_ORDER_INDEX(0),
    /**
     * Sort particles based on their lifetime.
     */
    PARTICLES_DRAW_ORDER_LIFETIME(1),
    /**
     *
     */
    PARTICLES_DRAW_ORDER_REVERSE_LIFETIME(2),
    /**
     * Sort particles based on their distance to the camera.
     */
    PARTICLES_DRAW_ORDER_VIEW_DEPTH(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ParticlesCollisionType(
    id: Long,
  ) {
    /**
     *
     */
    PARTICLES_COLLISION_TYPE_SPHERE_ATTRACT(0),
    /**
     *
     */
    PARTICLES_COLLISION_TYPE_BOX_ATTRACT(1),
    /**
     *
     */
    PARTICLES_COLLISION_TYPE_VECTOR_FIELD_ATTRACT(2),
    /**
     *
     */
    PARTICLES_COLLISION_TYPE_SPHERE_COLLIDE(3),
    /**
     *
     */
    PARTICLES_COLLISION_TYPE_BOX_COLLIDE(4),
    /**
     *
     */
    PARTICLES_COLLISION_TYPE_SDF_COLLIDE(5),
    /**
     *
     */
    PARTICLES_COLLISION_TYPE_HEIGHTFIELD_COLLIDE(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ParticlesCollisionHeightfieldResolution(
    id: Long,
  ) {
    /**
     *
     */
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_256(0),
    /**
     *
     */
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_512(1),
    /**
     *
     */
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_1024(2),
    /**
     *
     */
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_2048(3),
    /**
     *
     */
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_4096(4),
    /**
     *
     */
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_8192(5),
    /**
     * Represents the size of the [enum ParticlesCollisionHeightfieldResolution] enum.
     */
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class FogVolumeShape(
    id: Long,
  ) {
    /**
     * [godot.FogVolume] will be shaped like an ellipsoid (stretched sphere).
     */
    FOG_VOLUME_SHAPE_ELLIPSOID(0),
    /**
     * [godot.FogVolume] will be shaped like a cone pointing upwards (in local coordinates). The cone's angle is set automatically to fill the size. The cone will be adjusted to fit within the size. Rotate the [godot.FogVolume] node to reorient the cone. Non-uniform scaling via size is not supported (scale the [godot.FogVolume] node instead).
     */
    FOG_VOLUME_SHAPE_CONE(1),
    /**
     * [godot.FogVolume] will be shaped like an upright cylinder (in local coordinates). Rotate the [godot.FogVolume] node to reorient the cylinder. The cylinder will be adjusted to fit within the size. Non-uniform scaling via size is not supported (scale the [godot.FogVolume] node instead).
     */
    FOG_VOLUME_SHAPE_CYLINDER(2),
    /**
     * [godot.FogVolume] will be shaped like a box.
     */
    FOG_VOLUME_SHAPE_BOX(3),
    /**
     * [godot.FogVolume] will have no shape, will cover the whole world and will not be culled.
     */
    FOG_VOLUME_SHAPE_WORLD(4),
    /**
     * Represents the size of the [enum FogVolumeShape] enum.
     */
    FOG_VOLUME_SHAPE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ViewportScaling3DMode(
    id: Long,
  ) {
    /**
     * Use bilinear scaling for the viewport's 3D buffer. The amount of scaling can be set using [godot.Viewport.scaling3dScale]. Values less than `1.0` will result in undersampling while values greater than `1.0` will result in supersampling. A value of `1.0` disables scaling.
     */
    VIEWPORT_SCALING_3D_MODE_BILINEAR(0),
    /**
     * Use AMD FidelityFX Super Resolution 1.0 upscaling for the viewport's 3D buffer. The amount of scaling can be set using [godot.Viewport.scaling3dScale]. Values less than `1.0` will be result in the viewport being upscaled using FSR. Values greater than `1.0` are not supported and bilinear downsampling will be used instead. A value of `1.0` disables scaling.
     */
    VIEWPORT_SCALING_3D_MODE_FSR(1),
    /**
     * Represents the size of the [enum ViewportScaling3DMode] enum.
     */
    VIEWPORT_SCALING_3D_MODE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ViewportUpdateMode(
    id: Long,
  ) {
    /**
     * Do not update the viewport's render target.
     */
    VIEWPORT_UPDATE_DISABLED(0),
    /**
     * Update the viewport's render target once, then switch to [VIEWPORT_UPDATE_DISABLED].
     */
    VIEWPORT_UPDATE_ONCE(1),
    /**
     * Update the viewport's render target only when it is visible. This is the default value.
     */
    VIEWPORT_UPDATE_WHEN_VISIBLE(2),
    /**
     * Update the viewport's render target only when its parent is visible.
     */
    VIEWPORT_UPDATE_WHEN_PARENT_VISIBLE(3),
    /**
     * Always update the viewport's render target.
     */
    VIEWPORT_UPDATE_ALWAYS(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ViewportClearMode(
    id: Long,
  ) {
    /**
     * Always clear the viewport's render target before drawing.
     */
    VIEWPORT_CLEAR_ALWAYS(0),
    /**
     * Never clear the viewport's render target.
     */
    VIEWPORT_CLEAR_NEVER(1),
    /**
     * Clear the viewport's render target on the next frame, then switch to [VIEWPORT_CLEAR_NEVER].
     */
    VIEWPORT_CLEAR_ONLY_NEXT_FRAME(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ViewportEnvironmentMode(
    id: Long,
  ) {
    /**
     * Disable rendering of 3D environment over 2D canvas.
     */
    VIEWPORT_ENVIRONMENT_DISABLED(0),
    /**
     * Enable rendering of 3D environment over 2D canvas.
     */
    VIEWPORT_ENVIRONMENT_ENABLED(1),
    /**
     * Inherit enable/disable value from parent. If the topmost parent is also set to [VIEWPORT_ENVIRONMENT_INHERIT], then this has the same behavior as [VIEWPORT_ENVIRONMENT_ENABLED].
     */
    VIEWPORT_ENVIRONMENT_INHERIT(2),
    /**
     * Represents the size of the [enum ViewportEnvironmentMode] enum.
     */
    VIEWPORT_ENVIRONMENT_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ViewportSDFOversize(
    id: Long,
  ) {
    /**
     * Do not oversize the 2D signed distance field. Occluders may disappear when touching the viewport's edges, and [godot.GPUParticles3D] collision may stop working earlier than intended. This has the lowest GPU requirements.
     */
    VIEWPORT_SDF_OVERSIZE_100_PERCENT(0),
    /**
     * 2D signed distance field covers 20% of the viewport's size outside the viewport on each side (top, right, bottom, left).
     */
    VIEWPORT_SDF_OVERSIZE_120_PERCENT(1),
    /**
     * 2D signed distance field covers 50% of the viewport's size outside the viewport on each side (top, right, bottom, left).
     */
    VIEWPORT_SDF_OVERSIZE_150_PERCENT(2),
    /**
     * 2D signed distance field covers 100% of the viewport's size outside the viewport on each side (top, right, bottom, left). This has the highest GPU requirements.
     */
    VIEWPORT_SDF_OVERSIZE_200_PERCENT(3),
    /**
     * Represents the size of the [enum ViewportSDFOversize] enum.
     */
    VIEWPORT_SDF_OVERSIZE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ViewportSDFScale(
    id: Long,
  ) {
    /**
     * Full resolution 2D signed distance field scale. This has the highest GPU requirements.
     */
    VIEWPORT_SDF_SCALE_100_PERCENT(0),
    /**
     * Half resolution 2D signed distance field scale on each axis (25% of the viewport pixel count).
     */
    VIEWPORT_SDF_SCALE_50_PERCENT(1),
    /**
     * Quarter resolution 2D signed distance field scale on each axis (6.25% of the viewport pixel count). This has the lowest GPU requirements.
     */
    VIEWPORT_SDF_SCALE_25_PERCENT(2),
    /**
     * Represents the size of the [enum ViewportSDFScale] enum.
     */
    VIEWPORT_SDF_SCALE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ViewportMSAA(
    id: Long,
  ) {
    /**
     * Multisample antialiasing for 3D is disabled. This is the default value, and also the fastest setting.
     */
    VIEWPORT_MSAA_DISABLED(0),
    /**
     * Multisample antialiasing uses 2 samples per pixel for 3D. This has a moderate impact on performance.
     */
    VIEWPORT_MSAA_2X(1),
    /**
     * Multisample antialiasing uses 4 samples per pixel for 3D. This has a high impact on performance.
     */
    VIEWPORT_MSAA_4X(2),
    /**
     * Multisample antialiasing uses 8 samples per pixel for 3D. This has a very high impact on performance. Likely unsupported on low-end and older hardware.
     */
    VIEWPORT_MSAA_8X(3),
    /**
     * Represents the size of the [enum ViewportMSAA] enum.
     */
    VIEWPORT_MSAA_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ViewportScreenSpaceAA(
    id: Long,
  ) {
    /**
     * Do not perform any antialiasing in the full screen post-process.
     */
    VIEWPORT_SCREEN_SPACE_AA_DISABLED(0),
    /**
     * Use fast approximate antialiasing. FXAA is a popular screen-space antialiasing method, which is fast but will make the image look blurry, especially at lower resolutions. It can still work relatively well at large resolutions such as 1440p and 4K.
     */
    VIEWPORT_SCREEN_SPACE_AA_FXAA(1),
    /**
     * Represents the size of the [enum ViewportScreenSpaceAA] enum.
     */
    VIEWPORT_SCREEN_SPACE_AA_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ViewportOcclusionCullingBuildQuality(
    id: Long,
  ) {
    /**
     * Low occlusion culling BVH build quality (as defined by Embree). Results in the lowest CPU usage, but least effective culling.
     */
    VIEWPORT_OCCLUSION_BUILD_QUALITY_LOW(0),
    /**
     * Medium occlusion culling BVH build quality (as defined by Embree).
     */
    VIEWPORT_OCCLUSION_BUILD_QUALITY_MEDIUM(1),
    /**
     * High occlusion culling BVH build quality (as defined by Embree). Results in the highest CPU usage, but most effective culling.
     */
    VIEWPORT_OCCLUSION_BUILD_QUALITY_HIGH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ViewportRenderInfo(
    id: Long,
  ) {
    /**
     * Number of objects drawn in a single frame.
     */
    VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME(0),
    /**
     * Number of points, lines, or triangles drawn in a single frame.
     */
    VIEWPORT_RENDER_INFO_PRIMITIVES_IN_FRAME(1),
    /**
     * Number of draw calls during this frame.
     */
    VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME(2),
    /**
     * Represents the size of the [enum ViewportRenderInfo] enum.
     */
    VIEWPORT_RENDER_INFO_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ViewportRenderInfoType(
    id: Long,
  ) {
    /**
     * Visible render pass (excluding shadows).
     */
    VIEWPORT_RENDER_INFO_TYPE_VISIBLE(0),
    /**
     * Shadow render pass. Objects will be rendered several times depending on the number of amounts of lights with shadows and the number of directional shadow splits.
     */
    VIEWPORT_RENDER_INFO_TYPE_SHADOW(1),
    /**
     * Represents the size of the [enum ViewportRenderInfoType] enum.
     */
    VIEWPORT_RENDER_INFO_TYPE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ViewportDebugDraw(
    id: Long,
  ) {
    /**
     * Debug draw is disabled. Default setting.
     */
    VIEWPORT_DEBUG_DRAW_DISABLED(0),
    /**
     * Objects are displayed without light information.
     */
    VIEWPORT_DEBUG_DRAW_UNSHADED(1),
    /**
     * Objects are displayed with only light information.
     */
    VIEWPORT_DEBUG_DRAW_LIGHTING(2),
    /**
     * Objects are displayed semi-transparent with additive blending so you can see where they are drawing over top of one another. A higher overdraw (represented by brighter colors) means you are wasting performance on drawing pixels that are being hidden behind others.
     *
     * **Note:** When using this debug draw mode, custom shaders will be ignored. This means vertex displacement won't be visible anymore.
     */
    VIEWPORT_DEBUG_DRAW_OVERDRAW(3),
    /**
     * Debug draw draws objects in wireframe.
     */
    VIEWPORT_DEBUG_DRAW_WIREFRAME(4),
    /**
     * Normal buffer is drawn instead of regular scene so you can see the per-pixel normals that will be used by post-processing effects.
     */
    VIEWPORT_DEBUG_DRAW_NORMAL_BUFFER(5),
    /**
     * Objects are displayed with only the albedo value from [godot.VoxelGI]s.
     */
    VIEWPORT_DEBUG_DRAW_VOXEL_GI_ALBEDO(6),
    /**
     * Objects are displayed with only the lighting value from [godot.VoxelGI]s.
     */
    VIEWPORT_DEBUG_DRAW_VOXEL_GI_LIGHTING(7),
    /**
     * Objects are displayed with only the emission color from [godot.VoxelGI]s.
     */
    VIEWPORT_DEBUG_DRAW_VOXEL_GI_EMISSION(8),
    /**
     * Draws the shadow atlas that stores shadows from [godot.OmniLight3D]s and [godot.SpotLight3D]s in the upper left quadrant of the [godot.Viewport].
     */
    VIEWPORT_DEBUG_DRAW_SHADOW_ATLAS(9),
    /**
     * Draws the shadow atlas that stores shadows from [godot.DirectionalLight3D]s in the upper left quadrant of the [godot.Viewport].
     */
    VIEWPORT_DEBUG_DRAW_DIRECTIONAL_SHADOW_ATLAS(10),
    /**
     * Draws the estimated scene luminance. This is a 1×1 texture that is generated when autoexposure is enabled to control the scene's exposure.
     */
    VIEWPORT_DEBUG_DRAW_SCENE_LUMINANCE(11),
    /**
     * Draws the screen space ambient occlusion texture instead of the scene so that you can clearly see how it is affecting objects. In order for this display mode to work, you must have [godot.Environment.ssaoEnabled] set in your [godot.WorldEnvironment].
     */
    VIEWPORT_DEBUG_DRAW_SSAO(12),
    /**
     * Draws the screen space indirect lighting texture instead of the scene so that you can clearly see how it is affecting objects. In order for this display mode to work, you must have [godot.Environment.ssilEnabled] set in your [godot.WorldEnvironment].
     */
    VIEWPORT_DEBUG_DRAW_SSIL(13),
    /**
     * Colors each PSSM split for the [godot.DirectionalLight3D]s in the scene a different color so you can see where the splits are. In order they will be colored red, green, blue, yellow.
     */
    VIEWPORT_DEBUG_DRAW_PSSM_SPLITS(14),
    /**
     * Draws the decal atlas that stores decal textures from [godot.Decal]s.
     */
    VIEWPORT_DEBUG_DRAW_DECAL_ATLAS(15),
    /**
     * Draws SDFGI cascade data. This is the data structure that is used to bounce lighting against and create reflections.
     */
    VIEWPORT_DEBUG_DRAW_SDFGI(16),
    /**
     * Draws SDFGI probe data. This is the data structure that is used to give indirect lighting dynamic objects moving within the scene.
     */
    VIEWPORT_DEBUG_DRAW_SDFGI_PROBES(17),
    /**
     * Draws the global illumination buffer ([godot.VoxelGI] or SDFGI).
     */
    VIEWPORT_DEBUG_DRAW_GI_BUFFER(18),
    /**
     * Disable mesh LOD. All meshes are drawn with full detail, which can be used to compare performance.
     */
    VIEWPORT_DEBUG_DRAW_DISABLE_LOD(19),
    /**
     * Draws the [godot.OmniLight3D] cluster. Clustering determines where lights are positioned in screen-space, which allows the engine to only process these portions of the screen for lighting.
     */
    VIEWPORT_DEBUG_DRAW_CLUSTER_OMNI_LIGHTS(20),
    /**
     * Draws the [godot.SpotLight3D] cluster. Clustering determines where lights are positioned in screen-space, which allows the engine to only process these portions of the screen for lighting.
     */
    VIEWPORT_DEBUG_DRAW_CLUSTER_SPOT_LIGHTS(21),
    /**
     * Draws the [godot.Decal] cluster. Clustering determines where decals are positioned in screen-space, which allows the engine to only process these portions of the screen for decals.
     */
    VIEWPORT_DEBUG_DRAW_CLUSTER_DECALS(22),
    /**
     * Draws the [godot.ReflectionProbe] cluster. Clustering determines where reflection probes are positioned in screen-space, which allows the engine to only process these portions of the screen for reflection probes.
     */
    VIEWPORT_DEBUG_DRAW_CLUSTER_REFLECTION_PROBES(23),
    /**
     * Draws the occlusion culling buffer. This low-resolution occlusion culling buffer is rasterized on the CPU and is used to check whether instances are occluded by other objects.
     */
    VIEWPORT_DEBUG_DRAW_OCCLUDERS(24),
    /**
     * Draws the motion vectors buffer. This is used by temporal antialiasing to correct for motion that occurs during gameplay.
     */
    VIEWPORT_DEBUG_DRAW_MOTION_VECTORS(25),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ViewportVRSMode(
    id: Long,
  ) {
    /**
     * Variable rate shading is disabled.
     */
    VIEWPORT_VRS_DISABLED(0),
    /**
     * Variable rate shading uses a texture. Note, for stereoscopic use a texture atlas with a texture for each view.
     */
    VIEWPORT_VRS_TEXTURE(1),
    /**
     * Variable rate shading texture is supplied by the primary [godot.XRInterface].
     */
    VIEWPORT_VRS_XR(2),
    /**
     * Represents the size of the [enum ViewportVRSMode] enum.
     */
    VIEWPORT_VRS_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SkyMode(
    id: Long,
  ) {
    /**
     * Automatically selects the appropriate process mode based on your sky shader. If your shader uses `TIME` or `POSITION`, this will use [SKY_MODE_REALTIME]. If your shader uses any of the `LIGHT_*` variables or any custom uniforms, this uses [SKY_MODE_INCREMENTAL]. Otherwise, this defaults to [SKY_MODE_QUALITY].
     */
    SKY_MODE_AUTOMATIC(0),
    /**
     * Uses high quality importance sampling to process the radiance map. In general, this results in much higher quality than [SKY_MODE_REALTIME] but takes much longer to generate. This should not be used if you plan on changing the sky at runtime. If you are finding that the reflection is not blurry enough and is showing sparkles or fireflies, try increasing [godot.ProjectSettings.rendering/reflections/skyReflections/ggxSamples].
     */
    SKY_MODE_QUALITY(1),
    /**
     * Uses the same high quality importance sampling to process the radiance map as [SKY_MODE_QUALITY], but updates over several frames. The number of frames is determined by [godot.ProjectSettings.rendering/reflections/skyReflections/roughnessLayers]. Use this when you need highest quality radiance maps, but have a sky that updates slowly.
     */
    SKY_MODE_INCREMENTAL(2),
    /**
     * Uses the fast filtering algorithm to process the radiance map. In general this results in lower quality, but substantially faster run times. If you need better quality, but still need to update the sky every frame, consider turning on [godot.ProjectSettings.rendering/reflections/skyReflections/fastFilterHighQuality].
     *
     * **Note:** The fast filtering algorithm is limited to 256×256 cubemaps, so [skySetRadianceSize] must be set to `256`. Otherwise, a warning is printed and the overridden radiance size is ignored.
     */
    SKY_MODE_REALTIME(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EnvironmentBG(
    id: Long,
  ) {
    /**
     * Use the clear color as background.
     */
    ENV_BG_CLEAR_COLOR(0),
    /**
     * Use a specified color as the background.
     */
    ENV_BG_COLOR(1),
    /**
     * Use a sky resource for the background.
     */
    ENV_BG_SKY(2),
    /**
     * Use a specified canvas layer as the background. This can be useful for instantiating a 2D scene in a 3D world.
     */
    ENV_BG_CANVAS(3),
    /**
     * Do not clear the background, use whatever was rendered last frame as the background.
     */
    ENV_BG_KEEP(4),
    /**
     * Displays a camera feed in the background.
     */
    ENV_BG_CAMERA_FEED(5),
    /**
     * Represents the size of the [enum EnvironmentBG] enum.
     */
    ENV_BG_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EnvironmentAmbientSource(
    id: Long,
  ) {
    /**
     * Gather ambient light from whichever source is specified as the background.
     */
    ENV_AMBIENT_SOURCE_BG(0),
    /**
     * Disable ambient light.
     */
    ENV_AMBIENT_SOURCE_DISABLED(1),
    /**
     * Specify a specific [godot.core.Color] for ambient light.
     */
    ENV_AMBIENT_SOURCE_COLOR(2),
    /**
     * Gather ambient light from the [godot.Sky] regardless of what the background is.
     */
    ENV_AMBIENT_SOURCE_SKY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EnvironmentReflectionSource(
    id: Long,
  ) {
    /**
     * Use the background for reflections.
     */
    ENV_REFLECTION_SOURCE_BG(0),
    /**
     * Disable reflections.
     */
    ENV_REFLECTION_SOURCE_DISABLED(1),
    /**
     * Use the [godot.Sky] for reflections regardless of what the background is.
     */
    ENV_REFLECTION_SOURCE_SKY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EnvironmentGlowBlendMode(
    id: Long,
  ) {
    /**
     * Additive glow blending mode. Mostly used for particles, glows (bloom), lens flare, bright sources.
     */
    ENV_GLOW_BLEND_MODE_ADDITIVE(0),
    /**
     * Screen glow blending mode. Increases brightness, used frequently with bloom.
     */
    ENV_GLOW_BLEND_MODE_SCREEN(1),
    /**
     * Soft light glow blending mode. Modifies contrast, exposes shadows and highlights (vivid bloom).
     */
    ENV_GLOW_BLEND_MODE_SOFTLIGHT(2),
    /**
     * Replace glow blending mode. Replaces all pixels' color by the glow value. This can be used to simulate a full-screen blur effect by tweaking the glow parameters to match the original image's brightness.
     */
    ENV_GLOW_BLEND_MODE_REPLACE(3),
    /**
     * Mixes the glow with the underlying color to avoid increasing brightness as much while still maintaining a glow effect.
     */
    ENV_GLOW_BLEND_MODE_MIX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EnvironmentToneMapper(
    id: Long,
  ) {
    /**
     * Output color as they came in. This can cause bright lighting to look blown out, with noticeable clipping in the output colors.
     */
    ENV_TONE_MAPPER_LINEAR(0),
    /**
     * Use the Reinhard tonemapper. Performs a variation on rendered pixels' colors by this formula: `color = color / (1 + color)`. This avoids clipping bright highlights, but the resulting image can look a bit dull.
     */
    ENV_TONE_MAPPER_REINHARD(1),
    /**
     * Use the filmic tonemapper. This avoids clipping bright highlights, with a resulting image that usually looks more vivid than [ENV_TONE_MAPPER_REINHARD].
     */
    ENV_TONE_MAPPER_FILMIC(2),
    /**
     * Use the Academy Color Encoding System tonemapper. ACES is slightly more expensive than other options, but it handles bright lighting in a more realistic fashion by desaturating it as it becomes brighter. ACES typically has a more contrasted output compared to [ENV_TONE_MAPPER_REINHARD] and [ENV_TONE_MAPPER_FILMIC].
     *
     * **Note:** This tonemapping operator is called "ACES Fitted" in Godot 3.x.
     */
    ENV_TONE_MAPPER_ACES(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EnvironmentSSRRoughnessQuality(
    id: Long,
  ) {
    /**
     * Lowest quality of roughness filter for screen-space reflections. Rough materials will not have blurrier screen-space reflections compared to smooth (non-rough) materials. This is the fastest option.
     */
    ENV_SSR_ROUGHNESS_QUALITY_DISABLED(0),
    /**
     * Low quality of roughness filter for screen-space reflections.
     */
    ENV_SSR_ROUGHNESS_QUALITY_LOW(1),
    /**
     * Medium quality of roughness filter for screen-space reflections.
     */
    ENV_SSR_ROUGHNESS_QUALITY_MEDIUM(2),
    /**
     * High quality of roughness filter for screen-space reflections. This is the slowest option.
     */
    ENV_SSR_ROUGHNESS_QUALITY_HIGH(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EnvironmentSSAOQuality(
    id: Long,
  ) {
    /**
     * Lowest quality of screen-space ambient occlusion.
     */
    ENV_SSAO_QUALITY_VERY_LOW(0),
    /**
     * Low quality screen-space ambient occlusion.
     */
    ENV_SSAO_QUALITY_LOW(1),
    /**
     * Medium quality screen-space ambient occlusion.
     */
    ENV_SSAO_QUALITY_MEDIUM(2),
    /**
     * High quality screen-space ambient occlusion.
     */
    ENV_SSAO_QUALITY_HIGH(3),
    /**
     * Highest quality screen-space ambient occlusion. Uses the adaptive target setting which can be dynamically adjusted to smoothly balance performance and visual quality.
     */
    ENV_SSAO_QUALITY_ULTRA(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EnvironmentSSILQuality(
    id: Long,
  ) {
    /**
     * Lowest quality of screen-space indirect lighting.
     */
    ENV_SSIL_QUALITY_VERY_LOW(0),
    /**
     * Low quality screen-space indirect lighting.
     */
    ENV_SSIL_QUALITY_LOW(1),
    /**
     * High quality screen-space indirect lighting.
     */
    ENV_SSIL_QUALITY_MEDIUM(2),
    /**
     * High quality screen-space indirect lighting.
     */
    ENV_SSIL_QUALITY_HIGH(3),
    /**
     * Highest quality screen-space indirect lighting. Uses the adaptive target setting which can be dynamically adjusted to smoothly balance performance and visual quality.
     */
    ENV_SSIL_QUALITY_ULTRA(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EnvironmentSDFGIYScale(
    id: Long,
  ) {
    /**
     * Use 50% scale for SDFGI on the Y (vertical) axis. SDFGI cells will be twice as short as they are wide. This allows providing increased GI detail and reduced light leaking with thin floors and ceilings. This is usually the best choice for scenes that don't feature much verticality.
     */
    ENV_SDFGI_Y_SCALE_50_PERCENT(0),
    /**
     * Use 75% scale for SDFGI on the Y (vertical) axis. This is a balance between the 50% and 100% SDFGI Y scales.
     */
    ENV_SDFGI_Y_SCALE_75_PERCENT(1),
    /**
     * Use 100% scale for SDFGI on the Y (vertical) axis. SDFGI cells will be as tall as they are wide. This is usually the best choice for highly vertical scenes. The downside is that light leaking may become more noticeable with thin floors and ceilings.
     */
    ENV_SDFGI_Y_SCALE_100_PERCENT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EnvironmentSDFGIRayCount(
    id: Long,
  ) {
    /**
     * Throw 4 rays per frame when converging SDFGI. This has the lowest GPU requirements, but creates the most noisy result.
     */
    ENV_SDFGI_RAY_COUNT_4(0),
    /**
     * Throw 8 rays per frame when converging SDFGI.
     */
    ENV_SDFGI_RAY_COUNT_8(1),
    /**
     * Throw 16 rays per frame when converging SDFGI.
     */
    ENV_SDFGI_RAY_COUNT_16(2),
    /**
     * Throw 32 rays per frame when converging SDFGI.
     */
    ENV_SDFGI_RAY_COUNT_32(3),
    /**
     * Throw 64 rays per frame when converging SDFGI.
     */
    ENV_SDFGI_RAY_COUNT_64(4),
    /**
     * Throw 96 rays per frame when converging SDFGI. This has high GPU requirements.
     */
    ENV_SDFGI_RAY_COUNT_96(5),
    /**
     * Throw 128 rays per frame when converging SDFGI. This has very high GPU requirements, but creates the least noisy result.
     */
    ENV_SDFGI_RAY_COUNT_128(6),
    /**
     * Represents the size of the [enum EnvironmentSDFGIRayCount] enum.
     */
    ENV_SDFGI_RAY_COUNT_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EnvironmentSDFGIFramesToConverge(
    id: Long,
  ) {
    /**
     * Converge SDFGI over 5 frames. This is the most responsive, but creates the most noisy result with a given ray count.
     */
    ENV_SDFGI_CONVERGE_IN_5_FRAMES(0),
    /**
     * Configure SDFGI to fully converge over 10 frames.
     */
    ENV_SDFGI_CONVERGE_IN_10_FRAMES(1),
    /**
     * Configure SDFGI to fully converge over 15 frames.
     */
    ENV_SDFGI_CONVERGE_IN_15_FRAMES(2),
    /**
     * Configure SDFGI to fully converge over 20 frames.
     */
    ENV_SDFGI_CONVERGE_IN_20_FRAMES(3),
    /**
     * Configure SDFGI to fully converge over 25 frames.
     */
    ENV_SDFGI_CONVERGE_IN_25_FRAMES(4),
    /**
     * Configure SDFGI to fully converge over 30 frames. This is the least responsive, but creates the least noisy result with a given ray count.
     */
    ENV_SDFGI_CONVERGE_IN_30_FRAMES(5),
    /**
     * Represents the size of the [enum EnvironmentSDFGIFramesToConverge] enum.
     */
    ENV_SDFGI_CONVERGE_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EnvironmentSDFGIFramesToUpdateLight(
    id: Long,
  ) {
    /**
     * Update indirect light from dynamic lights in SDFGI over 1 frame. This is the most responsive, but has the highest GPU requirements.
     */
    ENV_SDFGI_UPDATE_LIGHT_IN_1_FRAME(0),
    /**
     * Update indirect light from dynamic lights in SDFGI over 2 frames.
     */
    ENV_SDFGI_UPDATE_LIGHT_IN_2_FRAMES(1),
    /**
     * Update indirect light from dynamic lights in SDFGI over 4 frames.
     */
    ENV_SDFGI_UPDATE_LIGHT_IN_4_FRAMES(2),
    /**
     * Update indirect light from dynamic lights in SDFGI over 8 frames.
     */
    ENV_SDFGI_UPDATE_LIGHT_IN_8_FRAMES(3),
    /**
     * Update indirect light from dynamic lights in SDFGI over 16 frames. This is the least responsive, but has the lowest GPU requirements.
     */
    ENV_SDFGI_UPDATE_LIGHT_IN_16_FRAMES(4),
    /**
     * Represents the size of the [enum EnvironmentSDFGIFramesToUpdateLight] enum.
     */
    ENV_SDFGI_UPDATE_LIGHT_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SubSurfaceScatteringQuality(
    id: Long,
  ) {
    /**
     * Disables subsurface scattering entirely, even on materials that have [godot.BaseMaterial3D.subsurfScatterEnabled] set to `true`. This has the lowest GPU requirements.
     */
    SUB_SURFACE_SCATTERING_QUALITY_DISABLED(0),
    /**
     * Low subsurface scattering quality.
     */
    SUB_SURFACE_SCATTERING_QUALITY_LOW(1),
    /**
     * Medium subsurface scattering quality.
     */
    SUB_SURFACE_SCATTERING_QUALITY_MEDIUM(2),
    /**
     * High subsurface scattering quality. This has the highest GPU requirements.
     */
    SUB_SURFACE_SCATTERING_QUALITY_HIGH(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DOFBokehShape(
    id: Long,
  ) {
    /**
     * Calculate the DOF blur using a box filter. The fastest option, but results in obvious lines in blur pattern.
     */
    DOF_BOKEH_BOX(0),
    /**
     * Calculates DOF blur using a hexagon shaped filter.
     */
    DOF_BOKEH_HEXAGON(1),
    /**
     * Calculates DOF blur using a circle shaped filter. Best quality and most realistic, but slowest. Use only for areas where a lot of performance can be dedicated to post-processing (e.g. cutscenes).
     */
    DOF_BOKEH_CIRCLE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DOFBlurQuality(
    id: Long,
  ) {
    /**
     * Lowest quality DOF blur. This is the fastest setting, but you may be able to see filtering artifacts.
     */
    DOF_BLUR_QUALITY_VERY_LOW(0),
    /**
     * Low quality DOF blur.
     */
    DOF_BLUR_QUALITY_LOW(1),
    /**
     * Medium quality DOF blur.
     */
    DOF_BLUR_QUALITY_MEDIUM(2),
    /**
     * Highest quality DOF blur. Results in the smoothest looking blur by taking the most samples, but is also significantly slower.
     */
    DOF_BLUR_QUALITY_HIGH(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class InstanceType(
    id: Long,
  ) {
    /**
     * The instance does not have a type.
     */
    INSTANCE_NONE(0),
    /**
     * The instance is a mesh.
     */
    INSTANCE_MESH(1),
    /**
     * The instance is a multimesh.
     */
    INSTANCE_MULTIMESH(2),
    /**
     * The instance is a particle emitter.
     */
    INSTANCE_PARTICLES(3),
    /**
     * The instance is a GPUParticles collision shape.
     */
    INSTANCE_PARTICLES_COLLISION(4),
    /**
     * The instance is a light.
     */
    INSTANCE_LIGHT(5),
    /**
     * The instance is a reflection probe.
     */
    INSTANCE_REFLECTION_PROBE(6),
    /**
     * The instance is a decal.
     */
    INSTANCE_DECAL(7),
    /**
     * The instance is a VoxelGI.
     */
    INSTANCE_VOXEL_GI(8),
    /**
     * The instance is a lightmap.
     */
    INSTANCE_LIGHTMAP(9),
    /**
     * The instance is an occlusion culling occluder.
     */
    INSTANCE_OCCLUDER(10),
    /**
     * The instance is a visible on-screen notifier.
     */
    INSTANCE_VISIBLITY_NOTIFIER(11),
    /**
     * The instance is a fog volume.
     */
    INSTANCE_FOG_VOLUME(12),
    /**
     * Represents the size of the [enum InstanceType] enum.
     */
    INSTANCE_MAX(13),
    /**
     * A combination of the flags of geometry instances (mesh, multimesh, immediate and particles).
     */
    INSTANCE_GEOMETRY_MASK(14),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class InstanceFlags(
    id: Long,
  ) {
    /**
     * Allows the instance to be used in baked lighting.
     */
    INSTANCE_FLAG_USE_BAKED_LIGHT(0),
    /**
     * Allows the instance to be used with dynamic global illumination.
     */
    INSTANCE_FLAG_USE_DYNAMIC_GI(1),
    /**
     * When set, manually requests to draw geometry on next frame.
     */
    INSTANCE_FLAG_DRAW_NEXT_FRAME_IF_VISIBLE(2),
    /**
     * Always draw, even if the instance would be culled by occlusion culling. Does not affect view frustum culling.
     */
    INSTANCE_FLAG_IGNORE_OCCLUSION_CULLING(3),
    /**
     * Represents the size of the [enum InstanceFlags] enum.
     */
    INSTANCE_FLAG_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ShadowCastingSetting(
    id: Long,
  ) {
    /**
     * Disable shadows from this instance.
     */
    SHADOW_CASTING_SETTING_OFF(0),
    /**
     * Cast shadows from this instance.
     */
    SHADOW_CASTING_SETTING_ON(1),
    /**
     * Disable backface culling when rendering the shadow of the object. This is slightly slower but may result in more correct shadows.
     */
    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),
    /**
     * Only render the shadows from the object. The object itself will not be drawn.
     */
    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class VisibilityRangeFadeMode(
    id: Long,
  ) {
    /**
     * Disable visibility range fading for the given instance.
     */
    VISIBILITY_RANGE_FADE_DISABLED(0),
    /**
     * Fade-out the given instance when it approaches its visibility range limits.
     */
    VISIBILITY_RANGE_FADE_SELF(1),
    /**
     * Fade-in the given instance's dependencies when reaching its visibility range limits.
     */
    VISIBILITY_RANGE_FADE_DEPENDENCIES(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class BakeChannels(
    id: Long,
  ) {
    /**
     * Index of [godot.Image] in array of [godot.Image]s returned by [bakeRenderUv2]. Image uses [godot.Image.FORMAT_RGBA8] and contains albedo color in the `.rgb` channels and alpha in the `.a` channel.
     */
    BAKE_CHANNEL_ALBEDO_ALPHA(0),
    /**
     * Index of [godot.Image] in array of [godot.Image]s returned by [bakeRenderUv2]. Image uses [godot.Image.FORMAT_RGBA8] and contains the per-pixel normal of the object in the `.rgb` channels and nothing in the `.a` channel. The per-pixel normal is encoded as `normal * 0.5 + 0.5`.
     */
    BAKE_CHANNEL_NORMAL(1),
    /**
     * Index of [godot.Image] in array of [godot.Image]s returned by [bakeRenderUv2]. Image uses [godot.Image.FORMAT_RGBA8] and contains ambient occlusion (from material and decals only) in the `.r` channel, roughness in the `.g` channel, metallic in the `.b` channel and sub surface scattering amount in the `.a` channel.
     */
    BAKE_CHANNEL_ORM(2),
    /**
     * Index of [godot.Image] in array of [godot.Image]s returned by [bakeRenderUv2]. Image uses [godot.Image.FORMAT_RGBAH] and contains emission color in the `.rgb` channels and nothing in the `.a` channel.
     */
    BAKE_CHANNEL_EMISSION(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CanvasTextureChannel(
    id: Long,
  ) {
    /**
     * Diffuse canvas texture ([godot.CanvasTexture.diffuseTexture]).
     */
    CANVAS_TEXTURE_CHANNEL_DIFFUSE(0),
    /**
     * Normal map canvas texture ([godot.CanvasTexture.normalTexture]).
     */
    CANVAS_TEXTURE_CHANNEL_NORMAL(1),
    /**
     * Specular map canvas texture ([godot.CanvasTexture.specularTexture]).
     */
    CANVAS_TEXTURE_CHANNEL_SPECULAR(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class NinePatchAxisMode(
    id: Long,
  ) {
    /**
     * The nine patch gets stretched where needed.
     */
    NINE_PATCH_STRETCH(0),
    /**
     * The nine patch gets filled with tiles where needed.
     */
    NINE_PATCH_TILE(1),
    /**
     * The nine patch gets filled with tiles where needed and stretches them a bit if needed.
     */
    NINE_PATCH_TILE_FIT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CanvasItemTextureFilter(
    id: Long,
  ) {
    /**
     * Uses the default filter mode for this [godot.Viewport].
     */
    CANVAS_ITEM_TEXTURE_FILTER_DEFAULT(0),
    /**
     * The texture filter reads from the nearest pixel only. The simplest and fastest method of filtering, but the texture will look pixelized.
     */
    CANVAS_ITEM_TEXTURE_FILTER_NEAREST(1),
    /**
     * The texture filter blends between the nearest 4 pixels. Use this when you want to avoid a pixelated style, but do not want mipmaps.
     */
    CANVAS_ITEM_TEXTURE_FILTER_LINEAR(2),
    /**
     * The texture filter reads from the nearest pixel in the nearest mipmap. The fastest way to read from textures with mipmaps.
     */
    CANVAS_ITEM_TEXTURE_FILTER_NEAREST_WITH_MIPMAPS(3),
    /**
     * The texture filter blends between the nearest 4 pixels and between the nearest 2 mipmaps.
     */
    CANVAS_ITEM_TEXTURE_FILTER_LINEAR_WITH_MIPMAPS(4),
    /**
     * The texture filter reads from the nearest pixel, but selects a mipmap based on the angle between the surface and the camera view. This reduces artifacts on surfaces that are almost in line with the camera.
     */
    CANVAS_ITEM_TEXTURE_FILTER_NEAREST_WITH_MIPMAPS_ANISOTROPIC(5),
    /**
     * The texture filter blends between the nearest 4 pixels and selects a mipmap based on the angle between the surface and the camera view. This reduces artifacts on surfaces that are almost in line with the camera. This is the slowest of the filtering options, but results in the highest quality texturing.
     */
    CANVAS_ITEM_TEXTURE_FILTER_LINEAR_WITH_MIPMAPS_ANISOTROPIC(6),
    /**
     * Max value for [enum CanvasItemTextureFilter] enum.
     */
    CANVAS_ITEM_TEXTURE_FILTER_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CanvasItemTextureRepeat(
    id: Long,
  ) {
    /**
     * Uses the default repeat mode for this [godot.Viewport].
     */
    CANVAS_ITEM_TEXTURE_REPEAT_DEFAULT(0),
    /**
     * Disables textures repeating. Instead, when reading UVs outside the 0-1 range, the value will be clamped to the edge of the texture, resulting in a stretched out look at the borders of the texture.
     */
    CANVAS_ITEM_TEXTURE_REPEAT_DISABLED(1),
    /**
     * Enables the texture to repeat when UV coordinates are outside the 0-1 range. If using one of the linear filtering modes, this can result in artifacts at the edges of a texture when the sampler filters across the edges of the texture.
     */
    CANVAS_ITEM_TEXTURE_REPEAT_ENABLED(2),
    /**
     * Flip the texture when repeating so that the edge lines up instead of abruptly changing.
     */
    CANVAS_ITEM_TEXTURE_REPEAT_MIRROR(3),
    /**
     * Max value for [enum CanvasItemTextureRepeat] enum.
     */
    CANVAS_ITEM_TEXTURE_REPEAT_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CanvasGroupMode(
    id: Long,
  ) {
    /**
     * Child draws over parent and is not clipped.
     */
    CANVAS_GROUP_MODE_DISABLED(0),
    /**
     * Parent is used for the purposes of clipping only. Child is clipped to the parent's visible area, parent is not drawn.
     */
    CANVAS_GROUP_MODE_CLIP_ONLY(1),
    /**
     * Parent is used for clipping child, but parent is also drawn underneath child as normal before clipping child to its visible area.
     */
    CANVAS_GROUP_MODE_CLIP_AND_DRAW(2),
    /**
     *
     */
    CANVAS_GROUP_MODE_TRANSPARENT(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CanvasLightMode(
    id: Long,
  ) {
    /**
     * 2D point light (see [godot.PointLight2D]).
     */
    CANVAS_LIGHT_MODE_POINT(0),
    /**
     * 2D directional (sun/moon) light (see [godot.DirectionalLight2D]).
     */
    CANVAS_LIGHT_MODE_DIRECTIONAL(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CanvasLightBlendMode(
    id: Long,
  ) {
    /**
     * Adds light color additive to the canvas.
     */
    CANVAS_LIGHT_BLEND_MODE_ADD(0),
    /**
     * Adds light color subtractive to the canvas.
     */
    CANVAS_LIGHT_BLEND_MODE_SUB(1),
    /**
     * The light adds color depending on transparency.
     */
    CANVAS_LIGHT_BLEND_MODE_MIX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CanvasLightShadowFilter(
    id: Long,
  ) {
    /**
     * Do not apply a filter to canvas light shadows.
     */
    CANVAS_LIGHT_FILTER_NONE(0),
    /**
     * Use PCF5 filtering to filter canvas light shadows.
     */
    CANVAS_LIGHT_FILTER_PCF5(1),
    /**
     * Use PCF13 filtering to filter canvas light shadows.
     */
    CANVAS_LIGHT_FILTER_PCF13(2),
    /**
     * Max value of the [enum CanvasLightShadowFilter] enum.
     */
    CANVAS_LIGHT_FILTER_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CanvasOccluderPolygonCullMode(
    id: Long,
  ) {
    /**
     * Culling of the canvas occluder is disabled.
     */
    CANVAS_OCCLUDER_POLYGON_CULL_DISABLED(0),
    /**
     * Culling of the canvas occluder is clockwise.
     */
    CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE(1),
    /**
     * Culling of the canvas occluder is counterclockwise.
     */
    CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class GlobalShaderParameterType(
    id: Long,
  ) {
    /**
     * Boolean global shader parameter (`global uniform bool ...`).
     */
    GLOBAL_VAR_TYPE_BOOL(0),
    /**
     * 2-dimensional boolean vector global shader parameter (`global uniform bvec2 ...`).
     */
    GLOBAL_VAR_TYPE_BVEC2(1),
    /**
     * 3-dimensional boolean vector global shader parameter (`global uniform bvec3 ...`).
     */
    GLOBAL_VAR_TYPE_BVEC3(2),
    /**
     * 4-dimensional boolean vector global shader parameter (`global uniform bvec4 ...`).
     */
    GLOBAL_VAR_TYPE_BVEC4(3),
    /**
     * Integer global shader parameter (`global uniform int ...`).
     */
    GLOBAL_VAR_TYPE_INT(4),
    /**
     * 2-dimensional integer vector global shader parameter (`global uniform ivec2 ...`).
     */
    GLOBAL_VAR_TYPE_IVEC2(5),
    /**
     * 3-dimensional integer vector global shader parameter (`global uniform ivec3 ...`).
     */
    GLOBAL_VAR_TYPE_IVEC3(6),
    /**
     * 4-dimensional integer vector global shader parameter (`global uniform ivec4 ...`).
     */
    GLOBAL_VAR_TYPE_IVEC4(7),
    /**
     * 2-dimensional integer rectangle global shader parameter (`global uniform ivec4 ...`). Equivalent to [godot.GLOBAL_VAR_TYPE_IVEC4] in shader code, but exposed as a [godot.Rect2i] in the editor UI.
     */
    GLOBAL_VAR_TYPE_RECT2I(8),
    /**
     * Unsigned integer global shader parameter (`global uniform uint ...`).
     */
    GLOBAL_VAR_TYPE_UINT(9),
    /**
     * 2-dimensional unsigned integer vector global shader parameter (`global uniform uvec2 ...`).
     */
    GLOBAL_VAR_TYPE_UVEC2(10),
    /**
     * 3-dimensional unsigned integer vector global shader parameter (`global uniform uvec3 ...`).
     */
    GLOBAL_VAR_TYPE_UVEC3(11),
    /**
     * 4-dimensional unsigned integer vector global shader parameter (`global uniform uvec4 ...`).
     */
    GLOBAL_VAR_TYPE_UVEC4(12),
    /**
     * Single-precision floating-point global shader parameter (`global uniform float ...`).
     */
    GLOBAL_VAR_TYPE_FLOAT(13),
    /**
     * 2-dimensional floating-point vector global shader parameter (`global uniform vec2 ...`).
     */
    GLOBAL_VAR_TYPE_VEC2(14),
    /**
     * 3-dimensional floating-point vector global shader parameter (`global uniform vec3 ...`).
     */
    GLOBAL_VAR_TYPE_VEC3(15),
    /**
     * 4-dimensional floating-point vector global shader parameter (`global uniform vec4 ...`).
     */
    GLOBAL_VAR_TYPE_VEC4(16),
    /**
     * Color global shader parameter (`global uniform vec4 ...`). Equivalent to [godot.GLOBAL_VAR_TYPE_VEC4] in shader code, but exposed as a [godot.core.Color] in the editor UI.
     */
    GLOBAL_VAR_TYPE_COLOR(17),
    /**
     * 2-dimensional floating-point rectangle global shader parameter (`global uniform vec4 ...`). Equivalent to [godot.GLOBAL_VAR_TYPE_VEC4] in shader code, but exposed as a [godot.core.Rect2] in the editor UI.
     */
    GLOBAL_VAR_TYPE_RECT2(18),
    /**
     * 2×2 matrix global shader parameter (`global uniform mat2 ...`). Exposed as a [godot.PackedInt32Array] in the editor UI.
     */
    GLOBAL_VAR_TYPE_MAT2(19),
    /**
     * 3×3 matrix global shader parameter (`global uniform mat3 ...`). Exposed as a [godot.core.Basis] in the editor UI.
     */
    GLOBAL_VAR_TYPE_MAT3(20),
    /**
     * 4×4 matrix global shader parameter (`global uniform mat4 ...`). Exposed as a [godot.Projection] in the editor UI.
     */
    GLOBAL_VAR_TYPE_MAT4(21),
    /**
     * 2-dimensional transform global shader parameter (`global uniform mat2x3 ...`). Exposed as a [godot.core.Transform2D] in the editor UI.
     */
    GLOBAL_VAR_TYPE_TRANSFORM_2D(22),
    /**
     * 3-dimensional transform global shader parameter (`global uniform mat3x4 ...`). Exposed as a [godot.Transform3D] in the editor UI.
     */
    GLOBAL_VAR_TYPE_TRANSFORM(23),
    /**
     * 2D sampler global shader parameter (`global uniform sampler2D ...`). Exposed as a [godot.Texture2D] in the editor UI.
     */
    GLOBAL_VAR_TYPE_SAMPLER2D(24),
    /**
     * 2D sampler array global shader parameter (`global uniform sampler2DArray ...`). Exposed as a [godot.Texture2DArray] in the editor UI.
     */
    GLOBAL_VAR_TYPE_SAMPLER2DARRAY(25),
    /**
     * 3D sampler global shader parameter (`global uniform sampler3D ...`). Exposed as a [godot.Texture3D] in the editor UI.
     */
    GLOBAL_VAR_TYPE_SAMPLER3D(26),
    /**
     * Cubemap sampler global shader parameter (`global uniform samplerCube ...`). Exposed as a [godot.Cubemap] in the editor UI.
     */
    GLOBAL_VAR_TYPE_SAMPLERCUBE(27),
    /**
     * Represents the size of the [enum GlobalShaderParameterType] enum.
     */
    GLOBAL_VAR_TYPE_MAX(28),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class RenderingInfo(
    id: Long,
  ) {
    /**
     * Number of objects rendered in the current 3D scene. This varies depending on camera position and rotation.
     */
    RENDERING_INFO_TOTAL_OBJECTS_IN_FRAME(0),
    /**
     * Number of points, lines, or triangles rendered in the current 3D scene. This varies depending on camera position and rotation.
     */
    RENDERING_INFO_TOTAL_PRIMITIVES_IN_FRAME(1),
    /**
     * Number of draw calls performed to render in the current 3D scene. This varies depending on camera position and rotation.
     */
    RENDERING_INFO_TOTAL_DRAW_CALLS_IN_FRAME(2),
    /**
     * Texture memory used (in bytes).
     */
    RENDERING_INFO_TEXTURE_MEM_USED(3),
    /**
     * Buffer memory used (in bytes). This includes vertex data, uniform buffers, and many miscellaneous buffer types used internally.
     */
    RENDERING_INFO_BUFFER_MEM_USED(4),
    /**
     * Video memory used (in bytes). When using the Forward+ or mobile rendering backends, this is always greater than the sum of [RENDERING_INFO_TEXTURE_MEM_USED] and [RENDERING_INFO_BUFFER_MEM_USED], since there is miscellaneous data not accounted for by those two metrics. When using the GL Compatibility backend, this is equal to the sum of [RENDERING_INFO_TEXTURE_MEM_USED] and [RENDERING_INFO_BUFFER_MEM_USED].
     */
    RENDERING_INFO_VIDEO_MEM_USED(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class Features(
    id: Long,
  ) {
    /**
     * Hardware supports shaders. This enum is currently unused in Godot 3.x.
     */
    FEATURE_SHADERS(0),
    /**
     * Hardware supports multithreading. This enum is currently unused in Godot 3.x.
     */
    FEATURE_MULTITHREADED(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }
}

public infix fun Long.or(other: godot.RenderingServer.ArrayFormat): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.RenderingServer.ArrayFormat): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.RenderingServer.ArrayFormat): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.RenderingServer.ArrayFormat): Long =
    this.plus(other.flag)

public operator fun Long.minus(other: godot.RenderingServer.ArrayFormat): Long =
    this.minus(other.flag)

public operator fun Long.times(other: godot.RenderingServer.ArrayFormat): Long =
    this.times(other.flag)

public operator fun Long.div(other: godot.RenderingServer.ArrayFormat): Long = this.div(other.flag)

public operator fun Long.rem(other: godot.RenderingServer.ArrayFormat): Long = this.rem(other.flag)
