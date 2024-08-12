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
import godot.core.TypeManager
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
import godot.util.VoidPtr
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
 * The rendering server is the API backend for everything visible. The whole scene system mounts on
 * it to display. The rendering server is completely opaque: the internals are entirely
 * implementation-specific and cannot be accessed.
 * The rendering server can be used to bypass the scene/[Node] system entirely. This can improve
 * performance in cases where the scene system is the bottleneck, but won't improve performance
 * otherwise (for instance, if the GPU is already fully utilized).
 * Resources are created using the `*_create` functions. These functions return [RID]s which are not
 * references to the objects themselves, but opaque *pointers* towards these objects.
 * All objects are drawn to a viewport. You can use the [Viewport] attached to the [SceneTree] or
 * you can create one yourself with [viewportCreate]. When using a custom scenario or canvas, the
 * scenario or canvas needs to be attached to the viewport using [viewportSetScenario] or
 * [viewportAttachCanvas].
 * **Scenarios:** In 3D, all visual objects must be associated with a scenario. The scenario is a
 * visual representation of the world. If accessing the rendering server from a running game, the
 * scenario can be accessed from the scene tree from any [Node3D] node with [Node3D.getWorld3d].
 * Otherwise, a scenario can be created with [scenarioCreate].
 * Similarly, in 2D, a canvas is needed to draw all canvas items.
 * **3D:** In 3D, all visible objects are comprised of a resource and an instance. A resource can be
 * a mesh, a particle system, a light, or any other 3D object. In order to be visible resources must be
 * attached to an instance using [instanceSetBase]. The instance must also be attached to the scenario
 * using [instanceSetScenario] in order to be visible. RenderingServer methods that don't have a prefix
 * are usually 3D-specific (but not always).
 * **2D:** In 2D, all visible objects are some form of canvas item. In order to be visible, a canvas
 * item needs to be the child of a canvas attached to a viewport, or it needs to be the child of
 * another canvas item that is eventually attached to the canvas. 2D-specific RenderingServer methods
 * generally start with `canvas_*`.
 * **Headless mode:** Starting the engine with the `--headless`
 * [url=$DOCS_URL/tutorials/editor/command_line_tutorial.html]command line argument[/url] disables all
 * rendering and window management functions. Most functions from [RenderingServer] will return dummy
 * values in this case.
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
   * The number of custom data arrays available ([ARRAY_CUSTOM0], [ARRAY_CUSTOM1], [ARRAY_CUSTOM2],
   * [ARRAY_CUSTOM3]).
   */
  public final const val ARRAY_CUSTOM_COUNT: Long = 4

  public final const val PARTICLES_EMIT_FLAG_POSITION: Long = 1

  public final const val PARTICLES_EMIT_FLAG_ROTATION_SCALE: Long = 2

  public final const val PARTICLES_EMIT_FLAG_VELOCITY: Long = 4

  public final const val PARTICLES_EMIT_FLAG_COLOR: Long = 8

  public final const val PARTICLES_EMIT_FLAG_CUSTOM: Long = 16

  /**
   * Emitted at the beginning of the frame, before the RenderingServer updates all the Viewports.
   */
  public val framePreDraw: Signal0 by signal()

  /**
   * Emitted at the end of the frame, after the RenderingServer has finished updating all the
   * Viewports.
   */
  public val framePostDraw: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_RENDERINGSERVER)
    return false
  }

  /**
   * Creates a 2-dimensional texture and adds it to the RenderingServer. It can be accessed with the
   * RID that is returned. This RID will be used in all `texture_2d_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent resource is [Texture2D].
   * **Note:** Not to be confused with [RenderingDevice.textureCreate], which creates the graphics
   * API's own texture type as opposed to the Godot-specific [Texture2D] resource.
   */
  public fun texture2dCreate(image: Image): RID {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(rawPtr, MethodBindings.texture2dCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a 2-dimensional layered texture and adds it to the RenderingServer. It can be accessed
   * with the RID that is returned. This RID will be used in all `texture_2d_layered_*` RenderingServer
   * functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent resource is [TextureLayered].
   */
  public fun texture2dLayeredCreate(layers: VariantArray<Image>, layeredType: TextureLayeredType):
      RID {
    TransferContext.writeArguments(ARRAY to layers, LONG to layeredType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.texture2dLayeredCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * **Note:** The equivalent resource is [Texture3D].
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
    TransferContext.callMethod(rawPtr, MethodBindings.texture3dCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * *Deprecated.* ProxyTexture was removed in Godot 4, so this method does nothing when called and
   * always returns a null [RID].
   */
  public fun textureProxyCreate(base: RID): RID {
    TransferContext.writeArguments(_RID to base)
    TransferContext.callMethod(rawPtr, MethodBindings.textureProxyCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Updates the texture specified by the [texture] [RID] with the data in [image]. A [layer] must
   * also be specified, which should be `0` when updating a single-layer texture ([Texture2D]).
   * **Note:** The [image] must have the same width, height and format as the current [texture]
   * data. Otherwise, an error will be printed and the original texture won't be modified. If you need
   * to use different width, height or format, use [textureReplace] instead.
   */
  public fun texture2dUpdate(
    texture: RID,
    image: Image,
    layer: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to texture, OBJECT to image, LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.texture2dUpdatePtr, NIL)
  }

  /**
   * Updates the texture specified by the [texture] [RID]'s data with the data in [data]. All the
   * texture's layers must be replaced at once.
   * **Note:** The [texture] must have the same width, height, depth and format as the current
   * texture data. Otherwise, an error will be printed and the original texture won't be modified. If
   * you need to use different width, height, depth or format, use [textureReplace] instead.
   */
  public fun texture3dUpdate(texture: RID, `data`: VariantArray<Image>): Unit {
    TransferContext.writeArguments(_RID to texture, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.texture3dUpdatePtr, NIL)
  }

  /**
   * *Deprecated.* ProxyTexture was removed in Godot 4, so this method cannot be used anymore.
   */
  public fun textureProxyUpdate(texture: RID, proxyTo: RID): Unit {
    TransferContext.writeArguments(_RID to texture, _RID to proxyTo)
    TransferContext.callMethod(rawPtr, MethodBindings.textureProxyUpdatePtr, NIL)
  }

  /**
   * Creates a placeholder for a 2-dimensional layered texture and adds it to the RenderingServer.
   * It can be accessed with the RID that is returned. This RID will be used in all
   * `texture_2d_layered_*` RenderingServer functions, although it does nothing when used. See also
   * [texture2dLayeredPlaceholderCreate]
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent resource is [PlaceholderTexture2D].
   */
  public fun texture2dPlaceholderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.texture2dPlaceholderCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a placeholder for a 2-dimensional layered texture and adds it to the RenderingServer.
   * It can be accessed with the RID that is returned. This RID will be used in all
   * `texture_2d_layered_*` RenderingServer functions, although it does nothing when used. See also
   * [texture2dPlaceholderCreate].
   * **Note:** The equivalent resource is [PlaceholderTextureLayered].
   */
  public fun texture2dLayeredPlaceholderCreate(layeredType: TextureLayeredType): RID {
    TransferContext.writeArguments(LONG to layeredType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.texture2dLayeredPlaceholderCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a placeholder for a 3-dimensional texture and adds it to the RenderingServer. It can be
   * accessed with the RID that is returned. This RID will be used in all `texture_3d_*`
   * RenderingServer functions, although it does nothing when used.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent resource is [PlaceholderTexture3D].
   */
  public fun texture3dPlaceholderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.texture3dPlaceholderCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns an [Image] instance from the given [texture] [RID].
   * Example of getting the test texture from [getTestTexture] and applying it to a [Sprite2D] node:
   * [codeblock]
   * var texture_rid = RenderingServer.get_test_texture()
   * var texture = ImageTexture.create_from_image(RenderingServer.texture_2d_get(texture_rid))
   * $Sprite2D.texture = texture
   * [/codeblock]
   */
  public fun texture2dGet(texture: RID): Image? {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.texture2dGetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Returns an [Image] instance from the given [texture] [RID] and [layer].
   */
  public fun texture2dLayerGet(texture: RID, layer: Int): Image? {
    TransferContext.writeArguments(_RID to texture, LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.texture2dLayerGetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Returns 3D texture data as an array of [Image]s for the specified texture [RID].
   */
  public fun texture3dGet(texture: RID): VariantArray<Image> {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.texture3dGetPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Image>)
  }

  /**
   * Replaces [texture]'s texture data by the texture specified by the [byTexture] RID, without
   * changing [texture]'s RID.
   */
  public fun textureReplace(texture: RID, byTexture: RID): Unit {
    TransferContext.writeArguments(_RID to texture, _RID to byTexture)
    TransferContext.callMethod(rawPtr, MethodBindings.textureReplacePtr, NIL)
  }

  public fun textureSetSizeOverride(
    texture: RID,
    width: Int,
    height: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to texture, LONG to width.toLong(), LONG to height.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.textureSetSizeOverridePtr, NIL)
  }

  public fun textureSetPath(texture: RID, path: String): Unit {
    TransferContext.writeArguments(_RID to texture, STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.textureSetPathPtr, NIL)
  }

  public fun textureGetPath(texture: RID): String {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.textureGetPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the [Image.Format] for the texture.
   */
  public fun textureGetFormat(texture: RID): Image.Format {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.textureGetFormatPtr, LONG)
    return Image.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun textureSetForceRedrawIfVisible(texture: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to texture, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.textureSetForceRedrawIfVisiblePtr, NIL)
  }

  /**
   * Creates a new texture object based on a texture created directly on the [RenderingDevice]. If
   * the texture contains layers, [layerType] is used to define the layer type.
   */
  @JvmOverloads
  public fun textureRdCreate(rdTexture: RID, layerType: TextureLayeredType =
      RenderingServer.TextureLayeredType.TEXTURE_LAYERED_2D_ARRAY): RID {
    TransferContext.writeArguments(_RID to rdTexture, LONG to layerType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.textureRdCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns a texture [RID] that can be used with [RenderingDevice].
   */
  @JvmOverloads
  public fun textureGetRdTexture(texture: RID, srgb: Boolean = false): RID {
    TransferContext.writeArguments(_RID to texture, BOOL to srgb)
    TransferContext.callMethod(rawPtr, MethodBindings.textureGetRdTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the internal graphics handle for this texture object. For use when communicating with
   * third-party APIs mostly with GDExtension.
   * **Note:** This function returns a `uint64_t` which internally maps to a `GLuint` (OpenGL) or
   * `VkImage` (Vulkan).
   */
  @JvmOverloads
  public fun textureGetNativeHandle(texture: RID, srgb: Boolean = false): Long {
    TransferContext.writeArguments(_RID to texture, BOOL to srgb)
    TransferContext.callMethod(rawPtr, MethodBindings.textureGetNativeHandlePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Creates an empty shader and adds it to the RenderingServer. It can be accessed with the RID
   * that is returned. This RID will be used in all `shader_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent resource is [Shader].
   */
  public fun shaderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.shaderCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the shader's source code (which triggers recompilation after being changed).
   */
  public fun shaderSetCode(shader: RID, code: String): Unit {
    TransferContext.writeArguments(_RID to shader, STRING to code)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderSetCodePtr, NIL)
  }

  /**
   * Sets the path hint for the specified shader. This should generally match the [Shader]
   * resource's [Resource.resourcePath].
   */
  public fun shaderSetPathHint(shader: RID, path: String): Unit {
    TransferContext.writeArguments(_RID to shader, STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderSetPathHintPtr, NIL)
  }

  /**
   * Returns a shader's source code as a string.
   */
  public fun shaderGetCode(shader: RID): String {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderGetCodePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the parameters of a shader.
   */
  public fun getShaderParameterList(shader: RID): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr, MethodBindings.getShaderParameterListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns the default value for the specified shader uniform. This is usually the value written
   * in the shader source code.
   */
  public fun shaderGetParameterDefault(shader: RID, name: StringName): Any? {
    TransferContext.writeArguments(_RID to shader, STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderGetParameterDefaultPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets a shader's default texture. Overwrites the texture given by name.
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
    TransferContext.callMethod(rawPtr, MethodBindings.shaderSetDefaultTextureParameterPtr, NIL)
  }

  /**
   * Returns a default texture from a shader searched by name.
   * **Note:** If the sampler array is used use [index] to access the specified texture.
   */
  @JvmOverloads
  public fun shaderGetDefaultTextureParameter(
    shader: RID,
    name: StringName,
    index: Int = 0,
  ): RID {
    TransferContext.writeArguments(_RID to shader, STRING_NAME to name, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.shaderGetDefaultTextureParameterPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates an empty material and adds it to the RenderingServer. It can be accessed with the RID
   * that is returned. This RID will be used in all `material_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent resource is [Material].
   */
  public fun materialCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.materialCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets a shader material's shader.
   */
  public fun materialSetShader(shaderMaterial: RID, shader: RID): Unit {
    TransferContext.writeArguments(_RID to shaderMaterial, _RID to shader)
    TransferContext.callMethod(rawPtr, MethodBindings.materialSetShaderPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.materialSetParamPtr, NIL)
  }

  /**
   * Returns the value of a certain material's parameter.
   */
  public fun materialGetParam(material: RID, parameter: StringName): Any? {
    TransferContext.writeArguments(_RID to material, STRING_NAME to parameter)
    TransferContext.callMethod(rawPtr, MethodBindings.materialGetParamPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets a material's render priority.
   */
  public fun materialSetRenderPriority(material: RID, priority: Int): Unit {
    TransferContext.writeArguments(_RID to material, LONG to priority.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.materialSetRenderPriorityPtr, NIL)
  }

  /**
   * Sets an object's next material.
   */
  public fun materialSetNextPass(material: RID, nextMaterial: RID): Unit {
    TransferContext.writeArguments(_RID to material, _RID to nextMaterial)
    TransferContext.callMethod(rawPtr, MethodBindings.materialSetNextPassPtr, NIL)
  }

  @JvmOverloads
  public fun meshCreateFromSurfaces(surfaces: VariantArray<Dictionary<Any?, Any?>>,
      blendShapeCount: Int = 0): RID {
    TransferContext.writeArguments(ARRAY to surfaces, LONG to blendShapeCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshCreateFromSurfacesPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a new mesh and adds it to the RenderingServer. It can be accessed with the RID that is
   * returned. This RID will be used in all `mesh_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * To place in a scene, attach this mesh to an instance using [instanceSetBase] using the returned
   * RID.
   * **Note:** The equivalent resource is [Mesh].
   */
  public fun meshCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.meshCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the offset of a given attribute by [arrayIndex] in the start of its respective buffer.
   */
  public fun meshSurfaceGetFormatOffset(
    format: ArrayFormat,
    vertexCount: Int,
    arrayIndex: Int,
  ): Long {
    TransferContext.writeArguments(LONG to format.flag, LONG to vertexCount.toLong(), LONG to arrayIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetFormatOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the stride of the vertex positions for a mesh with given [format]. Note importantly
   * that vertex positions are stored consecutively and are not interleaved with the other attributes
   * in the vertex buffer (normals and tangents).
   */
  public fun meshSurfaceGetFormatVertexStride(format: ArrayFormat, vertexCount: Int): Long {
    TransferContext.writeArguments(LONG to format.flag, LONG to vertexCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetFormatVertexStridePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the stride of the combined normals and tangents for a mesh with given [format]. Note
   * importantly that, while normals and tangents are in the vertex buffer with vertices, they are only
   * interleaved with each other and so have a different stride than vertex positions.
   */
  public fun meshSurfaceGetFormatNormalTangentStride(format: ArrayFormat, vertexCount: Int): Long {
    TransferContext.writeArguments(LONG to format.flag, LONG to vertexCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetFormatNormalTangentStridePtr,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the stride of the attribute buffer for a mesh with given [format].
   */
  public fun meshSurfaceGetFormatAttributeStride(format: ArrayFormat, vertexCount: Int): Long {
    TransferContext.writeArguments(LONG to format.flag, LONG to vertexCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetFormatAttributeStridePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the stride of the skin buffer for a mesh with given [format].
   */
  public fun meshSurfaceGetFormatSkinStride(format: ArrayFormat, vertexCount: Int): Long {
    TransferContext.writeArguments(LONG to format.flag, LONG to vertexCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetFormatSkinStridePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun meshAddSurface(mesh: RID, surface: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(_RID to mesh, DICTIONARY to surface)
    TransferContext.callMethod(rawPtr, MethodBindings.meshAddSurfacePtr, NIL)
  }

  @JvmOverloads
  public fun meshAddSurfaceFromArrays(
    mesh: RID,
    primitive: PrimitiveType,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<Any?> = godot.core.variantArrayOf(),
    lods: Dictionary<Any?, Any?> = Dictionary(),
    compressFormat: ArrayFormat = RenderingServer.ArrayFormat.ARRAY_FLAG_FORMAT_VERSION_1,
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to primitive.id, ARRAY to arrays, ARRAY to blendShapes, DICTIONARY to lods, LONG to compressFormat.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.meshAddSurfaceFromArraysPtr, NIL)
  }

  /**
   * Returns a mesh's blend shape count.
   */
  public fun meshGetBlendShapeCount(mesh: RID): Int {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.meshGetBlendShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets a mesh's blend shape mode.
   */
  public fun meshSetBlendShapeMode(mesh: RID, mode: BlendShapeMode): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.meshSetBlendShapeModePtr, NIL)
  }

  /**
   * Returns a mesh's blend shape mode.
   */
  public fun meshGetBlendShapeMode(mesh: RID): BlendShapeMode {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.meshGetBlendShapeModePtr, LONG)
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
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceSetMaterialPtr, NIL)
  }

  /**
   * Returns a mesh's surface's material.
   */
  public fun meshSurfaceGetMaterial(mesh: RID, surface: Int): RID {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetMaterialPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun meshGetSurface(mesh: RID, surface: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshGetSurfacePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns a mesh's surface's buffer arrays.
   */
  public fun meshSurfaceGetArrays(mesh: RID, surface: Int): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns a mesh's surface's arrays for blend shapes.
   */
  public fun meshSurfaceGetBlendShapeArrays(mesh: RID, surface: Int):
      VariantArray<VariantArray<Any?>> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetBlendShapeArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<VariantArray<Any?>>)
  }

  /**
   * Returns a mesh's number of surfaces.
   */
  public fun meshGetSurfaceCount(mesh: RID): Int {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.meshGetSurfaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets a mesh's custom aabb.
   */
  public fun meshSetCustomAabb(mesh: RID, aabb: AABB): Unit {
    TransferContext.writeArguments(_RID to mesh, godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr, MethodBindings.meshSetCustomAabbPtr, NIL)
  }

  /**
   * Returns a mesh's custom aabb.
   */
  public fun meshGetCustomAabb(mesh: RID): AABB {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.meshGetCustomAabbPtr,
        godot.core.VariantType.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
  }

  /**
   * Removes all surfaces from a mesh.
   */
  public fun meshClear(mesh: RID): Unit {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.meshClearPtr, NIL)
  }

  public fun meshSurfaceUpdateVertexRegion(
    mesh: RID,
    surface: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceUpdateVertexRegionPtr, NIL)
  }

  public fun meshSurfaceUpdateAttributeRegion(
    mesh: RID,
    surface: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceUpdateAttributeRegionPtr, NIL)
  }

  public fun meshSurfaceUpdateSkinRegion(
    mesh: RID,
    surface: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceUpdateSkinRegionPtr, NIL)
  }

  public fun meshSetShadowMesh(mesh: RID, shadowMesh: RID): Unit {
    TransferContext.writeArguments(_RID to mesh, _RID to shadowMesh)
    TransferContext.callMethod(rawPtr, MethodBindings.meshSetShadowMeshPtr, NIL)
  }

  /**
   * Creates a new multimesh on the RenderingServer and returns an [RID] handle. This RID will be
   * used in all `multimesh_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * To place in a scene, attach this multimesh to an instance using [instanceSetBase] using the
   * returned RID.
   * **Note:** The equivalent resource is [MultiMesh].
   */
  public fun multimeshCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun multimeshAllocateData(
    multimesh: RID,
    instances: Int,
    transformFormat: MultimeshTransformFormat,
    colorFormat: Boolean = false,
    customDataFormat: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to instances.toLong(), LONG to transformFormat.id, BOOL to colorFormat, BOOL to customDataFormat)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshAllocateDataPtr, NIL)
  }

  /**
   * Returns the number of instances allocated for this multimesh.
   */
  public fun multimeshGetInstanceCount(multimesh: RID): Int {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshGetInstanceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the mesh to be drawn by the multimesh. Equivalent to [MultiMesh.mesh].
   */
  public fun multimeshSetMesh(multimesh: RID, mesh: RID): Unit {
    TransferContext.writeArguments(_RID to multimesh, _RID to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshSetMeshPtr, NIL)
  }

  /**
   * Sets the [Transform3D] for this instance. Equivalent to [MultiMesh.setInstanceTransform].
   */
  public fun multimeshInstanceSetTransform(
    multimesh: RID,
    index: Int,
    transform: Transform3D,
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceSetTransformPtr, NIL)
  }

  /**
   * Sets the [Transform2D] for this instance. For use when multimesh is used in 2D. Equivalent to
   * [MultiMesh.setInstanceTransform2d].
   */
  public fun multimeshInstanceSetTransform2d(
    multimesh: RID,
    index: Int,
    transform: Transform2D,
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceSetTransform2dPtr, NIL)
  }

  /**
   * Sets the color by which this instance will be modulated. Equivalent to
   * [MultiMesh.setInstanceColor].
   */
  public fun multimeshInstanceSetColor(
    multimesh: RID,
    index: Int,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceSetColorPtr, NIL)
  }

  /**
   * Sets the custom data for this instance. Custom data is passed as a [Color], but is interpreted
   * as a `vec4` in the shader. Equivalent to [MultiMesh.setInstanceCustomData].
   */
  public fun multimeshInstanceSetCustomData(
    multimesh: RID,
    index: Int,
    customData: Color,
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong(), COLOR to customData)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceSetCustomDataPtr, NIL)
  }

  /**
   * Returns the RID of the mesh that will be used in drawing this multimesh.
   */
  public fun multimeshGetMesh(multimesh: RID): RID {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshGetMeshPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Calculates and returns the axis-aligned bounding box that encloses all instances within the
   * multimesh.
   */
  public fun multimeshGetAabb(multimesh: RID): AABB {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshGetAabbPtr,
        godot.core.VariantType.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
  }

  /**
   * Returns the [Transform3D] of the specified instance.
   */
  public fun multimeshInstanceGetTransform(multimesh: RID, index: Int): Transform3D {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceGetTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Returns the [Transform2D] of the specified instance. For use when the multimesh is set to use
   * 2D transforms.
   */
  public fun multimeshInstanceGetTransform2d(multimesh: RID, index: Int): Transform2D {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceGetTransform2dPtr,
        TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Returns the color by which the specified instance will be modulated.
   */
  public fun multimeshInstanceGetColor(multimesh: RID, index: Int): Color {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceGetColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns the custom data associated with the specified instance.
   */
  public fun multimeshInstanceGetCustomData(multimesh: RID, index: Int): Color {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceGetCustomDataPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Sets the number of instances visible at a given time. If -1, all instances that have been
   * allocated are drawn. Equivalent to [MultiMesh.visibleInstanceCount].
   */
  public fun multimeshSetVisibleInstances(multimesh: RID, visible: Int): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to visible.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshSetVisibleInstancesPtr, NIL)
  }

  /**
   * Returns the number of visible instances for this multimesh.
   */
  public fun multimeshGetVisibleInstances(multimesh: RID): Int {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshGetVisibleInstancesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Set the entire data to use for drawing the [multimesh] at once to [buffer] (such as instance
   * transforms and colors). [buffer]'s size must match the number of instances multiplied by the
   * per-instance data size (which depends on the enabled MultiMesh fields). Otherwise, an error
   * message is printed and nothing is rendered. See also [multimeshGetBuffer].
   * The per-instance data size and expected data order is:
   * [codeblock]
   * 2D:
   *   - Position: 8 floats (8 floats for Transform2D)
   *   - Position + Vertex color: 12 floats (8 floats for Transform2D, 4 floats for Color)
   *   - Position + Custom data: 12 floats (8 floats for Transform2D, 4 floats of custom data)
   *   - Position + Vertex color + Custom data: 16 floats (8 floats for Transform2D, 4 floats for
   * Color, 4 floats of custom data)
   * 3D:
   *   - Position: 12 floats (12 floats for Transform3D)
   *   - Position + Vertex color: 16 floats (12 floats for Transform3D, 4 floats for Color)
   *   - Position + Custom data: 16 floats (12 floats for Transform3D, 4 floats of custom data)
   *   - Position + Vertex color + Custom data: 20 floats (12 floats for Transform3D, 4 floats for
   * Color, 4 floats of custom data)
   * [/codeblock]
   */
  public fun multimeshSetBuffer(multimesh: RID, buffer: PackedFloat32Array): Unit {
    TransferContext.writeArguments(_RID to multimesh, PACKED_FLOAT_32_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshSetBufferPtr, NIL)
  }

  /**
   * Returns the MultiMesh data (such as instance transforms, colors, etc). See [multimeshSetBuffer]
   * for a description of the returned data.
   * **Note:** If the buffer is in the engine's internal cache, it will have to be fetched from GPU
   * memory and possibly decompressed. This means [multimeshGetBuffer] is potentially a slow operation
   * and should be avoided whenever possible.
   */
  public fun multimeshGetBuffer(multimesh: RID): PackedFloat32Array {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshGetBufferPtr, PACKED_FLOAT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
  }

  /**
   * Creates a skeleton and adds it to the RenderingServer. It can be accessed with the RID that is
   * returned. This RID will be used in all `skeleton_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   */
  public fun skeletonCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun skeletonAllocateData(
    skeleton: RID,
    bones: Int,
    is2dSkeleton: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to skeleton, LONG to bones.toLong(), BOOL to is2dSkeleton)
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonAllocateDataPtr, NIL)
  }

  /**
   * Returns the number of bones allocated for this skeleton.
   */
  public fun skeletonGetBoneCount(skeleton: RID): Int {
    TransferContext.writeArguments(_RID to skeleton)
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonGetBoneCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the [Transform3D] for a specific bone of this skeleton.
   */
  public fun skeletonBoneSetTransform(
    skeleton: RID,
    bone: Int,
    transform: Transform3D,
  ): Unit {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonBoneSetTransformPtr, NIL)
  }

  /**
   * Returns the [Transform3D] set for a specific bone of this skeleton.
   */
  public fun skeletonBoneGetTransform(skeleton: RID, bone: Int): Transform3D {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonBoneGetTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Sets the [Transform2D] for a specific bone of this skeleton.
   */
  public fun skeletonBoneSetTransform2d(
    skeleton: RID,
    bone: Int,
    transform: Transform2D,
  ): Unit {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone.toLong(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonBoneSetTransform2dPtr, NIL)
  }

  /**
   * Returns the [Transform2D] set for a specific bone of this skeleton.
   */
  public fun skeletonBoneGetTransform2d(skeleton: RID, bone: Int): Transform2D {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonBoneGetTransform2dPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun skeletonSetBaseTransform2d(skeleton: RID, baseTransform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to skeleton, TRANSFORM2D to baseTransform)
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonSetBaseTransform2dPtr, NIL)
  }

  /**
   * Creates a directional light and adds it to the RenderingServer. It can be accessed with the RID
   * that is returned. This RID can be used in most `light_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * To place in a scene, attach this directional light to an instance using [instanceSetBase] using
   * the returned RID.
   * **Note:** The equivalent node is [DirectionalLight3D].
   */
  public fun directionalLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.directionalLightCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a new omni light and adds it to the RenderingServer. It can be accessed with the RID
   * that is returned. This RID can be used in most `light_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * To place in a scene, attach this omni light to an instance using [instanceSetBase] using the
   * returned RID.
   * **Note:** The equivalent node is [OmniLight3D].
   */
  public fun omniLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.omniLightCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a spot light and adds it to the RenderingServer. It can be accessed with the RID that
   * is returned. This RID can be used in most `light_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * To place in a scene, attach this spot light to an instance using [instanceSetBase] using the
   * returned RID.
   */
  public fun spotLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.spotLightCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the color of the light. Equivalent to [Light3D.lightColor].
   */
  public fun lightSetColor(light: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetColorPtr, NIL)
  }

  /**
   * Sets the specified 3D light parameter. See [LightParam] for options. Equivalent to
   * [Light3D.setParam].
   */
  public fun lightSetParam(
    light: RID,
    `param`: LightParam,
    `value`: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to light, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetParamPtr, NIL)
  }

  /**
   * If `true`, light will cast shadows. Equivalent to [Light3D.shadowEnabled].
   */
  public fun lightSetShadow(light: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetShadowPtr, NIL)
  }

  /**
   * Sets the projector texture to use for the specified 3D light. Equivalent to
   * [Light3D.lightProjector].
   */
  public fun lightSetProjector(light: RID, texture: RID): Unit {
    TransferContext.writeArguments(_RID to light, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetProjectorPtr, NIL)
  }

  /**
   * If `true`, the 3D light will subtract light instead of adding light. Equivalent to
   * [Light3D.lightNegative].
   */
  public fun lightSetNegative(light: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetNegativePtr, NIL)
  }

  /**
   * Sets the cull mask for this 3D light. Lights only affect objects in the selected layers.
   * Equivalent to [Light3D.lightCullMask].
   */
  public fun lightSetCullMask(light: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetCullMaskPtr, NIL)
  }

  /**
   * Sets the distance fade for this 3D light. This acts as a form of level of detail (LOD) and can
   * be used to improve performance. Equivalent to [Light3D.distanceFadeEnabled],
   * [Light3D.distanceFadeBegin], [Light3D.distanceFadeShadow], and [Light3D.distanceFadeLength].
   */
  public fun lightSetDistanceFade(
    decal: RID,
    enabled: Boolean,
    begin: Float,
    shadow: Float,
    length: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to decal, BOOL to enabled, DOUBLE to begin.toDouble(), DOUBLE to shadow.toDouble(), DOUBLE to length.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetDistanceFadePtr, NIL)
  }

  /**
   * If `true`, reverses the backface culling of the mesh. This can be useful when you have a flat
   * mesh that has a light behind it. If you need to cast a shadow on both sides of the mesh, set the
   * mesh to use double-sided shadows with [instanceGeometrySetCastShadowsSetting]. Equivalent to
   * [Light3D.shadowReverseCullFace].
   */
  public fun lightSetReverseCullFaceMode(light: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetReverseCullFaceModePtr, NIL)
  }

  /**
   * Sets the bake mode to use for the specified 3D light. Equivalent to [Light3D.lightBakeMode].
   */
  public fun lightSetBakeMode(light: RID, bakeMode: LightBakeMode): Unit {
    TransferContext.writeArguments(_RID to light, LONG to bakeMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetBakeModePtr, NIL)
  }

  /**
   * Sets the maximum SDFGI cascade in which the 3D light's indirect lighting is rendered. Higher
   * values allow the light to be rendered in SDFGI further away from the camera.
   */
  public fun lightSetMaxSdfgiCascade(light: RID, cascade: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to cascade)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetMaxSdfgiCascadePtr, NIL)
  }

  /**
   * Sets whether to use a dual paraboloid or a cubemap for the shadow map. Dual paraboloid is
   * faster but may suffer from artifacts. Equivalent to [OmniLight3D.omniShadowMode].
   */
  public fun lightOmniSetShadowMode(light: RID, mode: LightOmniShadowMode): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.lightOmniSetShadowModePtr, NIL)
  }

  /**
   * Sets the shadow mode for this directional light. Equivalent to
   * [DirectionalLight3D.directionalShadowMode]. See [LightDirectionalShadowMode] for options.
   */
  public fun lightDirectionalSetShadowMode(light: RID, mode: LightDirectionalShadowMode): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.lightDirectionalSetShadowModePtr, NIL)
  }

  /**
   * If `true`, this directional light will blend between shadow map splits resulting in a smoother
   * transition between them. Equivalent to [DirectionalLight3D.directionalShadowBlendSplits].
   */
  public fun lightDirectionalSetBlendSplits(light: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.lightDirectionalSetBlendSplitsPtr, NIL)
  }

  /**
   * If `true`, this light will not be used for anything except sky shaders. Use this for lights
   * that impact your sky shader that you may want to hide from affecting the rest of the scene. For
   * example, you may want to enable this when the sun in your sky shader falls below the horizon.
   */
  public fun lightDirectionalSetSkyMode(light: RID, mode: LightDirectionalSkyMode): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.lightDirectionalSetSkyModePtr, NIL)
  }

  /**
   * Sets the texture filter mode to use when rendering light projectors. This parameter is global
   * and cannot be set on a per-light basis.
   */
  public fun lightProjectorsSetFilter(filter: LightProjectorFilter): Unit {
    TransferContext.writeArguments(LONG to filter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.lightProjectorsSetFilterPtr, NIL)
  }

  /**
   * Sets the filter quality for omni and spot light shadows in 3D. See also
   * [ProjectSettings.rendering/lightsAndShadows/positionalShadow/softShadowFilterQuality]. This
   * parameter is global and cannot be set on a per-viewport basis.
   */
  public fun positionalSoftShadowFilterSetQuality(quality: ShadowQuality): Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr, MethodBindings.positionalSoftShadowFilterSetQualityPtr, NIL)
  }

  /**
   * Sets the filter [quality] for directional light shadows in 3D. See also
   * [ProjectSettings.rendering/lightsAndShadows/directionalShadow/softShadowFilterQuality]. This
   * parameter is global and cannot be set on a per-viewport basis.
   */
  public fun directionalSoftShadowFilterSetQuality(quality: ShadowQuality): Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr, MethodBindings.directionalSoftShadowFilterSetQualityPtr, NIL)
  }

  /**
   * Sets the [size] of the directional light shadows in 3D. See also
   * [ProjectSettings.rendering/lightsAndShadows/directionalShadow/size]. This parameter is global and
   * cannot be set on a per-viewport basis.
   */
  public fun directionalShadowAtlasSetSize(size: Int, is16bits: Boolean): Unit {
    TransferContext.writeArguments(LONG to size.toLong(), BOOL to is16bits)
    TransferContext.callMethod(rawPtr, MethodBindings.directionalShadowAtlasSetSizePtr, NIL)
  }

  /**
   * Creates a reflection probe and adds it to the RenderingServer. It can be accessed with the RID
   * that is returned. This RID will be used in all `reflection_probe_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * To place in a scene, attach this reflection probe to an instance using [instanceSetBase] using
   * the returned RID.
   * **Note:** The equivalent node is [ReflectionProbe].
   */
  public fun reflectionProbeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets how often the reflection probe updates. Can either be once or every frame. See
   * [ReflectionProbeUpdateMode] for options.
   */
  public fun reflectionProbeSetUpdateMode(probe: RID, mode: ReflectionProbeUpdateMode): Unit {
    TransferContext.writeArguments(_RID to probe, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetUpdateModePtr, NIL)
  }

  /**
   * Sets the intensity of the reflection probe. Intensity modulates the strength of the reflection.
   * Equivalent to [ReflectionProbe.intensity].
   */
  public fun reflectionProbeSetIntensity(probe: RID, intensity: Float): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to intensity.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetIntensityPtr, NIL)
  }

  /**
   * Sets the reflection probe's ambient light mode. Equivalent to [ReflectionProbe.ambientMode].
   */
  public fun reflectionProbeSetAmbientMode(probe: RID, mode: ReflectionProbeAmbientMode): Unit {
    TransferContext.writeArguments(_RID to probe, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetAmbientModePtr, NIL)
  }

  /**
   * Sets the reflection probe's custom ambient light color. Equivalent to
   * [ReflectionProbe.ambientColor].
   */
  public fun reflectionProbeSetAmbientColor(probe: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to probe, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetAmbientColorPtr, NIL)
  }

  /**
   * Sets the reflection probe's custom ambient light energy. Equivalent to
   * [ReflectionProbe.ambientColorEnergy].
   */
  public fun reflectionProbeSetAmbientEnergy(probe: RID, energy: Float): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to energy.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetAmbientEnergyPtr, NIL)
  }

  /**
   * Sets the max distance away from the probe an object can be before it is culled. Equivalent to
   * [ReflectionProbe.maxDistance].
   */
  public fun reflectionProbeSetMaxDistance(probe: RID, distance: Float): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to distance.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetMaxDistancePtr, NIL)
  }

  /**
   * Sets the size of the area that the reflection probe will capture. Equivalent to
   * [ReflectionProbe.size].
   */
  public fun reflectionProbeSetSize(probe: RID, size: Vector3): Unit {
    TransferContext.writeArguments(_RID to probe, VECTOR3 to size)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetSizePtr, NIL)
  }

  /**
   * Sets the origin offset to be used when this reflection probe is in box project mode. Equivalent
   * to [ReflectionProbe.originOffset].
   */
  public fun reflectionProbeSetOriginOffset(probe: RID, offset: Vector3): Unit {
    TransferContext.writeArguments(_RID to probe, VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetOriginOffsetPtr, NIL)
  }

  /**
   * If `true`, reflections will ignore sky contribution. Equivalent to [ReflectionProbe.interior].
   */
  public fun reflectionProbeSetAsInterior(probe: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetAsInteriorPtr, NIL)
  }

  /**
   * If `true`, uses box projection. This can make reflections look more correct in certain
   * situations. Equivalent to [ReflectionProbe.boxProjection].
   */
  public fun reflectionProbeSetEnableBoxProjection(probe: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetEnableBoxProjectionPtr, NIL)
  }

  /**
   * If `true`, computes shadows in the reflection probe. This makes the reflection much slower to
   * compute. Equivalent to [ReflectionProbe.enableShadows].
   */
  public fun reflectionProbeSetEnableShadows(probe: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetEnableShadowsPtr, NIL)
  }

  /**
   * Sets the render cull mask for this reflection probe. Only instances with a matching cull mask
   * will be rendered by this probe. Equivalent to [ReflectionProbe.cullMask].
   */
  public fun reflectionProbeSetCullMask(probe: RID, layers: Long): Unit {
    TransferContext.writeArguments(_RID to probe, LONG to layers)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetCullMaskPtr, NIL)
  }

  /**
   * Sets the resolution to use when rendering the specified reflection probe. The [resolution] is
   * specified for each cubemap face: for instance, specifying `512` will allocate 6 faces of 512×512
   * each (plus mipmaps for roughness levels).
   */
  public fun reflectionProbeSetResolution(probe: RID, resolution: Int): Unit {
    TransferContext.writeArguments(_RID to probe, LONG to resolution.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetResolutionPtr, NIL)
  }

  /**
   * Sets the mesh level of detail to use in the reflection probe rendering. Higher values will use
   * less detailed versions of meshes that have LOD variations generated, which can improve
   * performance. Equivalent to [ReflectionProbe.meshLodThreshold].
   */
  public fun reflectionProbeSetMeshLodThreshold(probe: RID, pixels: Float): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to pixels.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetMeshLodThresholdPtr, NIL)
  }

  /**
   * Creates a decal and adds it to the RenderingServer. It can be accessed with the RID that is
   * returned. This RID will be used in all `decal_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * To place in a scene, attach this decal to an instance using [instanceSetBase] using the
   * returned RID.
   * **Note:** The equivalent node is [Decal].
   */
  public fun decalCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.decalCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the [size] of the decal specified by the [decal] RID. Equivalent to [Decal.size].
   */
  public fun decalSetSize(decal: RID, size: Vector3): Unit {
    TransferContext.writeArguments(_RID to decal, VECTOR3 to size)
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetSizePtr, NIL)
  }

  /**
   * Sets the [texture] in the given texture [type] slot for the specified decal. Equivalent to
   * [Decal.setTexture].
   */
  public fun decalSetTexture(
    decal: RID,
    type: DecalTexture,
    texture: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to decal, LONG to type.id, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetTexturePtr, NIL)
  }

  /**
   * Sets the emission [energy] in the decal specified by the [decal] RID. Equivalent to
   * [Decal.emissionEnergy].
   */
  public fun decalSetEmissionEnergy(decal: RID, energy: Float): Unit {
    TransferContext.writeArguments(_RID to decal, DOUBLE to energy.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetEmissionEnergyPtr, NIL)
  }

  /**
   * Sets the [albedoMix] in the decal specified by the [decal] RID. Equivalent to
   * [Decal.albedoMix].
   */
  public fun decalSetAlbedoMix(decal: RID, albedoMix: Float): Unit {
    TransferContext.writeArguments(_RID to decal, DOUBLE to albedoMix.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetAlbedoMixPtr, NIL)
  }

  /**
   * Sets the color multiplier in the decal specified by the [decal] RID to [color]. Equivalent to
   * [Decal.modulate].
   */
  public fun decalSetModulate(decal: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to decal, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetModulatePtr, NIL)
  }

  /**
   * Sets the cull [mask] in the decal specified by the [decal] RID. Equivalent to [Decal.cullMask].
   */
  public fun decalSetCullMask(decal: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to decal, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetCullMaskPtr, NIL)
  }

  /**
   * Sets the distance fade parameters in the decal specified by the [decal] RID. Equivalent to
   * [Decal.distanceFadeEnabled], [Decal.distanceFadeBegin] and [Decal.distanceFadeLength].
   */
  public fun decalSetDistanceFade(
    decal: RID,
    enabled: Boolean,
    begin: Float,
    length: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to decal, BOOL to enabled, DOUBLE to begin.toDouble(), DOUBLE to length.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetDistanceFadePtr, NIL)
  }

  /**
   * Sets the upper fade ([above]) and lower fade ([below]) in the decal specified by the [decal]
   * RID. Equivalent to [Decal.upperFade] and [Decal.lowerFade].
   */
  public fun decalSetFade(
    decal: RID,
    above: Float,
    below: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to decal, DOUBLE to above.toDouble(), DOUBLE to below.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetFadePtr, NIL)
  }

  /**
   * Sets the normal [fade] in the decal specified by the [decal] RID. Equivalent to
   * [Decal.normalFade].
   */
  public fun decalSetNormalFade(decal: RID, fade: Float): Unit {
    TransferContext.writeArguments(_RID to decal, DOUBLE to fade.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetNormalFadePtr, NIL)
  }

  /**
   * Sets the texture [filter] mode to use when rendering decals. This parameter is global and
   * cannot be set on a per-decal basis.
   */
  public fun decalsSetFilter(filter: DecalFilter): Unit {
    TransferContext.writeArguments(LONG to filter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.decalsSetFilterPtr, NIL)
  }

  /**
   * If [halfResolution] is `true`, renders [VoxelGI] and SDFGI ([Environment.sdfgiEnabled]) buffers
   * at halved resolution on each axis (e.g. 960×540 when the viewport size is 1920×1080). This
   * improves performance significantly when VoxelGI or SDFGI is enabled, at the cost of artifacts that
   * may be visible on polygon edges. The loss in quality becomes less noticeable as the viewport
   * resolution increases. [LightmapGI] rendering is not affected by this setting. Equivalent to
   * [ProjectSettings.rendering/globalIllumination/gi/useHalfResolution].
   */
  public fun giSetUseHalfResolution(halfResolution: Boolean): Unit {
    TransferContext.writeArguments(BOOL to halfResolution)
    TransferContext.callMethod(rawPtr, MethodBindings.giSetUseHalfResolutionPtr, NIL)
  }

  /**
   * Creates a new voxel-based global illumination object and adds it to the RenderingServer. It can
   * be accessed with the RID that is returned. This RID will be used in all `voxel_gi_*`
   * RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent node is [VoxelGI].
   */
  public fun voxelGiCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

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
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiAllocateDataPtr, NIL)
  }

  public fun voxelGiGetOctreeSize(voxelGi: RID): Vector3i {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiGetOctreeSizePtr, VECTOR3I)
    return (TransferContext.readReturnValue(VECTOR3I, false) as Vector3i)
  }

  public fun voxelGiGetOctreeCells(voxelGi: RID): PackedByteArray {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiGetOctreeCellsPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun voxelGiGetDataCells(voxelGi: RID): PackedByteArray {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiGetDataCellsPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun voxelGiGetDistanceField(voxelGi: RID): PackedByteArray {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiGetDistanceFieldPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun voxelGiGetLevelCounts(voxelGi: RID): PackedInt32Array {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiGetLevelCountsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun voxelGiGetToCellXform(voxelGi: RID): Transform3D {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiGetToCellXformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Sets the [VoxelGIData.dynamicRange] value to use on the specified [voxelGi]'s [RID].
   */
  public fun voxelGiSetDynamicRange(voxelGi: RID, range: Float): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to range.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetDynamicRangePtr, NIL)
  }

  /**
   * Sets the [VoxelGIData.propagation] value to use on the specified [voxelGi]'s [RID].
   */
  public fun voxelGiSetPropagation(voxelGi: RID, amount: Float): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetPropagationPtr, NIL)
  }

  /**
   * Sets the [VoxelGIData.energy] value to use on the specified [voxelGi]'s [RID].
   */
  public fun voxelGiSetEnergy(voxelGi: RID, energy: Float): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to energy.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetEnergyPtr, NIL)
  }

  /**
   * Used to inform the renderer what exposure normalization value was used while baking the voxel
   * gi. This value will be used and modulated at run time to ensure that the voxel gi maintains a
   * consistent level of exposure even if the scene-wide exposure normalization is changed at run time.
   * For more information see [cameraAttributesSetExposure].
   */
  public fun voxelGiSetBakedExposureNormalization(voxelGi: RID, bakedExposure: Float): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to bakedExposure.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetBakedExposureNormalizationPtr, NIL)
  }

  /**
   * Sets the [VoxelGIData.bias] value to use on the specified [voxelGi]'s [RID].
   */
  public fun voxelGiSetBias(voxelGi: RID, bias: Float): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to bias.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetBiasPtr, NIL)
  }

  /**
   * Sets the [VoxelGIData.normalBias] value to use on the specified [voxelGi]'s [RID].
   */
  public fun voxelGiSetNormalBias(voxelGi: RID, bias: Float): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to bias.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetNormalBiasPtr, NIL)
  }

  /**
   * Sets the [VoxelGIData.interior] value to use on the specified [voxelGi]'s [RID].
   */
  public fun voxelGiSetInterior(voxelGi: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to voxelGi, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetInteriorPtr, NIL)
  }

  /**
   * Sets the [VoxelGIData.useTwoBounces] value to use on the specified [voxelGi]'s [RID].
   */
  public fun voxelGiSetUseTwoBounces(voxelGi: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to voxelGi, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetUseTwoBouncesPtr, NIL)
  }

  /**
   * Sets the [ProjectSettings.rendering/globalIllumination/voxelGi/quality] value to use when
   * rendering. This parameter is global and cannot be set on a per-VoxelGI basis.
   */
  public fun voxelGiSetQuality(quality: VoxelGIQuality): Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetQualityPtr, NIL)
  }

  /**
   * Creates a new lightmap global illumination instance and adds it to the RenderingServer. It can
   * be accessed with the RID that is returned. This RID will be used in all `lightmap_*`
   * RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent node is [LightmapGI].
   */
  public fun lightmapCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Set the textures on the given [lightmap] GI instance to the texture array pointed to by the
   * [light] RID. If the lightmap texture was baked with [LightmapGI.directional] set to `true`, then
   * [usesSh] must also be `true`.
   */
  public fun lightmapSetTextures(
    lightmap: RID,
    light: RID,
    usesSh: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to lightmap, _RID to light, BOOL to usesSh)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapSetTexturesPtr, NIL)
  }

  public fun lightmapSetProbeBounds(lightmap: RID, bounds: AABB): Unit {
    TransferContext.writeArguments(_RID to lightmap, godot.core.VariantType.AABB to bounds)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapSetProbeBoundsPtr, NIL)
  }

  public fun lightmapSetProbeInterior(lightmap: RID, interior: Boolean): Unit {
    TransferContext.writeArguments(_RID to lightmap, BOOL to interior)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapSetProbeInteriorPtr, NIL)
  }

  public fun lightmapSetProbeCaptureData(
    lightmap: RID,
    points: PackedVector3Array,
    pointSh: PackedColorArray,
    tetrahedra: PackedInt32Array,
    bspTree: PackedInt32Array,
  ): Unit {
    TransferContext.writeArguments(_RID to lightmap, PACKED_VECTOR3_ARRAY to points, PACKED_COLOR_ARRAY to pointSh, PACKED_INT_32_ARRAY to tetrahedra, PACKED_INT_32_ARRAY to bspTree)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapSetProbeCaptureDataPtr, NIL)
  }

  public fun lightmapGetProbeCapturePoints(lightmap: RID): PackedVector3Array {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapGetProbeCapturePointsPtr,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  public fun lightmapGetProbeCaptureSh(lightmap: RID): PackedColorArray {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapGetProbeCaptureShPtr,
        PACKED_COLOR_ARRAY)
    return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray)
  }

  public fun lightmapGetProbeCaptureTetrahedra(lightmap: RID): PackedInt32Array {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapGetProbeCaptureTetrahedraPtr,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun lightmapGetProbeCaptureBspTree(lightmap: RID): PackedInt32Array {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapGetProbeCaptureBspTreePtr,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Used to inform the renderer what exposure normalization value was used while baking the
   * lightmap. This value will be used and modulated at run time to ensure that the lightmap maintains
   * a consistent level of exposure even if the scene-wide exposure normalization is changed at run
   * time. For more information see [cameraAttributesSetExposure].
   */
  public fun lightmapSetBakedExposureNormalization(lightmap: RID, bakedExposure: Float): Unit {
    TransferContext.writeArguments(_RID to lightmap, DOUBLE to bakedExposure.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapSetBakedExposureNormalizationPtr, NIL)
  }

  public fun lightmapSetProbeCaptureUpdateSpeed(speed: Float): Unit {
    TransferContext.writeArguments(DOUBLE to speed.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapSetProbeCaptureUpdateSpeedPtr, NIL)
  }

  /**
   * Creates a GPU-based particle system and adds it to the RenderingServer. It can be accessed with
   * the RID that is returned. This RID will be used in all `particles_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * To place in a scene, attach these particles to an instance using [instanceSetBase] using the
   * returned RID.
   * **Note:** The equivalent nodes are [GPUParticles2D] and [GPUParticles3D].
   * **Note:** All `particles_*` methods only apply to GPU-based particles, not CPU-based particles.
   * [CPUParticles2D] and [CPUParticles3D] do not have equivalent RenderingServer functions available,
   * as these use [MultiMeshInstance2D] and [MultiMeshInstance3D] under the hood (see `multimesh_*`
   * methods).
   */
  public fun particlesCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets whether the GPU particles specified by the [particles] RID should be rendered in 2D or 3D
   * according to [mode].
   */
  public fun particlesSetMode(particles: RID, mode: ParticlesMode): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetModePtr, NIL)
  }

  /**
   * If `true`, particles will emit over time. Setting to false does not reset the particles, but
   * only stops their emission. Equivalent to [GPUParticles3D.emitting].
   */
  public fun particlesSetEmitting(particles: RID, emitting: Boolean): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to emitting)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetEmittingPtr, NIL)
  }

  /**
   * Returns `true` if particles are currently set to emitting.
   */
  public fun particlesGetEmitting(particles: RID): Boolean {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesGetEmittingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the number of particles to be drawn and allocates the memory for them. Equivalent to
   * [GPUParticles3D.amount].
   */
  public fun particlesSetAmount(particles: RID, amount: Int): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to amount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetAmountPtr, NIL)
  }

  /**
   * Sets the amount ratio for particles to be emitted. Equivalent to [GPUParticles3D.amountRatio].
   */
  public fun particlesSetAmountRatio(particles: RID, ratio: Float): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetAmountRatioPtr, NIL)
  }

  /**
   * Sets the lifetime of each particle in the system. Equivalent to [GPUParticles3D.lifetime].
   */
  public fun particlesSetLifetime(particles: RID, lifetime: Double): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to lifetime)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetLifetimePtr, NIL)
  }

  /**
   * If `true`, particles will emit once and then stop. Equivalent to [GPUParticles3D.oneShot].
   */
  public fun particlesSetOneShot(particles: RID, oneShot: Boolean): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to oneShot)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetOneShotPtr, NIL)
  }

  /**
   * Sets the preprocess time for the particles' animation. This lets you delay starting an
   * animation until after the particles have begun emitting. Equivalent to
   * [GPUParticles3D.preprocess].
   */
  public fun particlesSetPreProcessTime(particles: RID, time: Double): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to time)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetPreProcessTimePtr, NIL)
  }

  /**
   * Sets the explosiveness ratio. Equivalent to [GPUParticles3D.explosiveness].
   */
  public fun particlesSetExplosivenessRatio(particles: RID, ratio: Float): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetExplosivenessRatioPtr, NIL)
  }

  /**
   * Sets the emission randomness ratio. This randomizes the emission of particles within their
   * phase. Equivalent to [GPUParticles3D.randomness].
   */
  public fun particlesSetRandomnessRatio(particles: RID, ratio: Float): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetRandomnessRatioPtr, NIL)
  }

  /**
   * Sets the value that informs a [ParticleProcessMaterial] to rush all particles towards the end
   * of their lifetime.
   */
  public fun particlesSetInterpToEnd(particles: RID, factor: Float): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to factor.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetInterpToEndPtr, NIL)
  }

  /**
   * Sets the velocity of a particle node, that will be used by
   * [ParticleProcessMaterial.inheritVelocityRatio].
   */
  public fun particlesSetEmitterVelocity(particles: RID, velocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to particles, VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetEmitterVelocityPtr, NIL)
  }

  /**
   * Sets a custom axis-aligned bounding box for the particle system. Equivalent to
   * [GPUParticles3D.visibilityAabb].
   */
  public fun particlesSetCustomAabb(particles: RID, aabb: AABB): Unit {
    TransferContext.writeArguments(_RID to particles, godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetCustomAabbPtr, NIL)
  }

  /**
   * Sets the speed scale of the particle system. Equivalent to [GPUParticles3D.speedScale].
   */
  public fun particlesSetSpeedScale(particles: RID, scale: Double): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetSpeedScalePtr, NIL)
  }

  /**
   * If `true`, particles use local coordinates. If `false` they use global coordinates. Equivalent
   * to [GPUParticles3D.localCoords].
   */
  public fun particlesSetUseLocalCoordinates(particles: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetUseLocalCoordinatesPtr, NIL)
  }

  /**
   * Sets the material for processing the particles.
   * **Note:** This is not the material used to draw the materials. Equivalent to
   * [GPUParticles3D.processMaterial].
   */
  public fun particlesSetProcessMaterial(particles: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to particles, _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetProcessMaterialPtr, NIL)
  }

  /**
   * Sets the frame rate that the particle system rendering will be fixed to. Equivalent to
   * [GPUParticles3D.fixedFps].
   */
  public fun particlesSetFixedFps(particles: RID, fps: Int): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to fps.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetFixedFpsPtr, NIL)
  }

  public fun particlesSetInterpolate(particles: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetInterpolatePtr, NIL)
  }

  /**
   * If `true`, uses fractional delta which smooths the movement of the particles. Equivalent to
   * [GPUParticles3D.fractDelta].
   */
  public fun particlesSetFractionalDelta(particles: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetFractionalDeltaPtr, NIL)
  }

  public fun particlesSetCollisionBaseSize(particles: RID, size: Float): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to size.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetCollisionBaseSizePtr, NIL)
  }

  public fun particlesSetTransformAlign(particles: RID, align: ParticlesTransformAlign): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to align.id)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetTransformAlignPtr, NIL)
  }

  /**
   * If [enable] is `true`, enables trails for the [particles] with the specified [lengthSec] in
   * seconds. Equivalent to [GPUParticles3D.trailEnabled] and [GPUParticles3D.trailLifetime].
   */
  public fun particlesSetTrails(
    particles: RID,
    enable: Boolean,
    lengthSec: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to enable, DOUBLE to lengthSec.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetTrailsPtr, NIL)
  }

  public fun particlesSetTrailBindPoses(particles: RID, bindPoses: VariantArray<Transform3D>):
      Unit {
    TransferContext.writeArguments(_RID to particles, ARRAY to bindPoses)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetTrailBindPosesPtr, NIL)
  }

  /**
   * Returns `true` if particles are not emitting and particles are set to inactive.
   */
  public fun particlesIsInactive(particles: RID): Boolean {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesIsInactivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Add particle system to list of particle systems that need to be updated. Update will take place
   * on the next frame, or on the next call to [instancesCullAabb], [instancesCullConvex], or
   * [instancesCullRay].
   */
  public fun particlesRequestProcess(particles: RID): Unit {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesRequestProcessPtr, NIL)
  }

  /**
   * Reset the particles on the next update. Equivalent to [GPUParticles3D.restart].
   */
  public fun particlesRestart(particles: RID): Unit {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesRestartPtr, NIL)
  }

  public fun particlesSetSubemitter(particles: RID, subemitterParticles: RID): Unit {
    TransferContext.writeArguments(_RID to particles, _RID to subemitterParticles)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetSubemitterPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.particlesEmitPtr, NIL)
  }

  /**
   * Sets the draw order of the particles to one of the named enums from [ParticlesDrawOrder]. See
   * [ParticlesDrawOrder] for options. Equivalent to [GPUParticles3D.drawOrder].
   */
  public fun particlesSetDrawOrder(particles: RID, order: ParticlesDrawOrder): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to order.id)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetDrawOrderPtr, NIL)
  }

  /**
   * Sets the number of draw passes to use. Equivalent to [GPUParticles3D.drawPasses].
   */
  public fun particlesSetDrawPasses(particles: RID, count: Int): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to count.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetDrawPassesPtr, NIL)
  }

  /**
   * Sets the mesh to be used for the specified draw pass. Equivalent to [GPUParticles3D.drawPass1],
   * [GPUParticles3D.drawPass2], [GPUParticles3D.drawPass3], and [GPUParticles3D.drawPass4].
   */
  public fun particlesSetDrawPassMesh(
    particles: RID,
    pass: Int,
    mesh: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to pass.toLong(), _RID to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetDrawPassMeshPtr, NIL)
  }

  /**
   * Calculates and returns the axis-aligned bounding box that contains all the particles.
   * Equivalent to [GPUParticles3D.captureAabb].
   */
  public fun particlesGetCurrentAabb(particles: RID): AABB {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesGetCurrentAabbPtr,
        godot.core.VariantType.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
  }

  /**
   * Sets the [Transform3D] that will be used by the particles when they first emit.
   */
  public fun particlesSetEmissionTransform(particles: RID, transform: Transform3D): Unit {
    TransferContext.writeArguments(_RID to particles, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetEmissionTransformPtr, NIL)
  }

  /**
   * Creates a new 3D GPU particle collision or attractor and adds it to the RenderingServer. It can
   * be accessed with the RID that is returned. This RID can be used in most `particles_collision_*`
   * RenderingServer functions.
   * **Note:** The equivalent nodes are [GPUParticlesCollision3D] and [GPUParticlesAttractor3D].
   */
  public fun particlesCollisionCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the collision or attractor shape [type] for the 3D GPU particles collision or attractor
   * specified by the [particlesCollision] RID.
   */
  public fun particlesCollisionSetCollisionType(particlesCollision: RID,
      type: ParticlesCollisionType): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetCollisionTypePtr, NIL)
  }

  /**
   * Sets the cull [mask] for the 3D GPU particles collision or attractor specified by the
   * [particlesCollision] RID. Equivalent to [GPUParticlesCollision3D.cullMask] or
   * [GPUParticlesAttractor3D.cullMask] depending on the [particlesCollision] type.
   */
  public fun particlesCollisionSetCullMask(particlesCollision: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetCullMaskPtr, NIL)
  }

  /**
   * Sets the [radius] for the 3D GPU particles sphere collision or attractor specified by the
   * [particlesCollision] RID. Equivalent to [GPUParticlesCollisionSphere3D.radius] or
   * [GPUParticlesAttractorSphere3D.radius] depending on the [particlesCollision] type.
   */
  public fun particlesCollisionSetSphereRadius(particlesCollision: RID, radius: Float): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetSphereRadiusPtr, NIL)
  }

  /**
   * Sets the [extents] for the 3D GPU particles collision by the [particlesCollision] RID.
   * Equivalent to [GPUParticlesCollisionBox3D.size], [GPUParticlesCollisionSDF3D.size],
   * [GPUParticlesCollisionHeightField3D.size], [GPUParticlesAttractorBox3D.size] or
   * [GPUParticlesAttractorVectorField3D.size] depending on the [particlesCollision] type.
   */
  public fun particlesCollisionSetBoxExtents(particlesCollision: RID, extents: Vector3): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, VECTOR3 to extents)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetBoxExtentsPtr, NIL)
  }

  /**
   * Sets the [strength] for the 3D GPU particles attractor specified by the [particlesCollision]
   * RID. Only used for attractors, not colliders. Equivalent to [GPUParticlesAttractor3D.strength].
   */
  public fun particlesCollisionSetAttractorStrength(particlesCollision: RID, strength: Float):
      Unit {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to strength.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetAttractorStrengthPtr,
        NIL)
  }

  /**
   * Sets the directionality [amount] for the 3D GPU particles attractor specified by the
   * [particlesCollision] RID. Only used for attractors, not colliders. Equivalent to
   * [GPUParticlesAttractor3D.directionality].
   */
  public fun particlesCollisionSetAttractorDirectionality(particlesCollision: RID, amount: Float):
      Unit {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr,
        MethodBindings.particlesCollisionSetAttractorDirectionalityPtr, NIL)
  }

  /**
   * Sets the attenuation [curve] for the 3D GPU particles attractor specified by the
   * [particlesCollision] RID. Only used for attractors, not colliders. Equivalent to
   * [GPUParticlesAttractor3D.attenuation].
   */
  public fun particlesCollisionSetAttractorAttenuation(particlesCollision: RID, curve: Float):
      Unit {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to curve.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetAttractorAttenuationPtr,
        NIL)
  }

  /**
   * Sets the signed distance field [texture] for the 3D GPU particles collision specified by the
   * [particlesCollision] RID. Equivalent to [GPUParticlesCollisionSDF3D.texture] or
   * [GPUParticlesAttractorVectorField3D.texture] depending on the [particlesCollision] type.
   */
  public fun particlesCollisionSetFieldTexture(particlesCollision: RID, texture: RID): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetFieldTexturePtr, NIL)
  }

  /**
   * Requests an update for the 3D GPU particle collision heightfield. This may be automatically
   * called by the 3D GPU particle collision heightfield depending on its
   * [GPUParticlesCollisionHeightField3D.updateMode].
   */
  public fun particlesCollisionHeightFieldUpdate(particlesCollision: RID): Unit {
    TransferContext.writeArguments(_RID to particlesCollision)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionHeightFieldUpdatePtr, NIL)
  }

  /**
   * Sets the heightmap [resolution] for the 3D GPU particles heightfield collision specified by the
   * [particlesCollision] RID. Equivalent to [GPUParticlesCollisionHeightField3D.resolution].
   */
  public fun particlesCollisionSetHeightFieldResolution(particlesCollision: RID,
      resolution: ParticlesCollisionHeightfieldResolution): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, LONG to resolution.id)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetHeightFieldResolutionPtr,
        NIL)
  }

  /**
   * Creates a new fog volume and adds it to the RenderingServer. It can be accessed with the RID
   * that is returned. This RID will be used in all `fog_volume_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent node is [FogVolume].
   */
  public fun fogVolumeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.fogVolumeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the shape of the fog volume to either [RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID],
   * [RenderingServer.FOG_VOLUME_SHAPE_CONE], [RenderingServer.FOG_VOLUME_SHAPE_CYLINDER],
   * [RenderingServer.FOG_VOLUME_SHAPE_BOX] or [RenderingServer.FOG_VOLUME_SHAPE_WORLD].
   */
  public fun fogVolumeSetShape(fogVolume: RID, shape: FogVolumeShape): Unit {
    TransferContext.writeArguments(_RID to fogVolume, LONG to shape.id)
    TransferContext.callMethod(rawPtr, MethodBindings.fogVolumeSetShapePtr, NIL)
  }

  /**
   * Sets the size of the fog volume when shape is [RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID],
   * [RenderingServer.FOG_VOLUME_SHAPE_CONE], [RenderingServer.FOG_VOLUME_SHAPE_CYLINDER] or
   * [RenderingServer.FOG_VOLUME_SHAPE_BOX].
   */
  public fun fogVolumeSetSize(fogVolume: RID, size: Vector3): Unit {
    TransferContext.writeArguments(_RID to fogVolume, VECTOR3 to size)
    TransferContext.callMethod(rawPtr, MethodBindings.fogVolumeSetSizePtr, NIL)
  }

  /**
   * Sets the [Material] of the fog volume. Can be either a [FogMaterial] or a custom
   * [ShaderMaterial].
   */
  public fun fogVolumeSetMaterial(fogVolume: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to fogVolume, _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.fogVolumeSetMaterialPtr, NIL)
  }

  /**
   * Creates a new 3D visibility notifier object and adds it to the RenderingServer. It can be
   * accessed with the RID that is returned. This RID will be used in all `visibility_notifier_*`
   * RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * To place in a scene, attach this mesh to an instance using [instanceSetBase] using the returned
   * RID.
   * **Note:** The equivalent node is [VisibleOnScreenNotifier3D].
   */
  public fun visibilityNotifierCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.visibilityNotifierCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun visibilityNotifierSetAabb(notifier: RID, aabb: AABB): Unit {
    TransferContext.writeArguments(_RID to notifier, godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr, MethodBindings.visibilityNotifierSetAabbPtr, NIL)
  }

  public fun visibilityNotifierSetCallbacks(
    notifier: RID,
    enterCallable: Callable,
    exitCallable: Callable,
  ): Unit {
    TransferContext.writeArguments(_RID to notifier, CALLABLE to enterCallable, CALLABLE to exitCallable)
    TransferContext.callMethod(rawPtr, MethodBindings.visibilityNotifierSetCallbacksPtr, NIL)
  }

  /**
   * Creates an occluder instance and adds it to the RenderingServer. It can be accessed with the
   * RID that is returned. This RID will be used in all `occluder_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent resource is [Occluder3D] (not to be confused with the
   * [OccluderInstance3D] node).
   */
  public fun occluderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.occluderCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the mesh data for the given occluder RID, which controls the shape of the occlusion
   * culling that will be performed.
   */
  public fun occluderSetMesh(
    occluder: RID,
    vertices: PackedVector3Array,
    indices: PackedInt32Array,
  ): Unit {
    TransferContext.writeArguments(_RID to occluder, PACKED_VECTOR3_ARRAY to vertices, PACKED_INT_32_ARRAY to indices)
    TransferContext.callMethod(rawPtr, MethodBindings.occluderSetMeshPtr, NIL)
  }

  /**
   * Creates a 3D camera and adds it to the RenderingServer. It can be accessed with the RID that is
   * returned. This RID will be used in all `camera_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent node is [Camera3D].
   */
  public fun cameraCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cameraCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets camera to use perspective projection. Objects on the screen becomes smaller when they are
   * far away.
   */
  public fun cameraSetPerspective(
    camera: RID,
    fovyDegrees: Float,
    zNear: Float,
    zFar: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to camera, DOUBLE to fovyDegrees.toDouble(), DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetPerspectivePtr, NIL)
  }

  /**
   * Sets camera to use orthogonal projection, also known as orthographic projection. Objects remain
   * the same size on the screen no matter how far away they are.
   */
  public fun cameraSetOrthogonal(
    camera: RID,
    size: Float,
    zNear: Float,
    zFar: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to camera, DOUBLE to size.toDouble(), DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetOrthogonalPtr, NIL)
  }

  /**
   * Sets camera to use frustum projection. This mode allows adjusting the [offset] argument to
   * create "tilted frustum" effects.
   */
  public fun cameraSetFrustum(
    camera: RID,
    size: Float,
    offset: Vector2,
    zNear: Float,
    zFar: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to camera, DOUBLE to size.toDouble(), VECTOR2 to offset, DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetFrustumPtr, NIL)
  }

  /**
   * Sets [Transform3D] of camera.
   */
  public fun cameraSetTransform(camera: RID, transform: Transform3D): Unit {
    TransferContext.writeArguments(_RID to camera, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetTransformPtr, NIL)
  }

  /**
   * Sets the cull mask associated with this camera. The cull mask describes which 3D layers are
   * rendered by this camera. Equivalent to [Camera3D.cullMask].
   */
  public fun cameraSetCullMask(camera: RID, layers: Long): Unit {
    TransferContext.writeArguments(_RID to camera, LONG to layers)
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetCullMaskPtr, NIL)
  }

  /**
   * Sets the environment used by this camera. Equivalent to [Camera3D.environment].
   */
  public fun cameraSetEnvironment(camera: RID, env: RID): Unit {
    TransferContext.writeArguments(_RID to camera, _RID to env)
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetEnvironmentPtr, NIL)
  }

  /**
   * Sets the camera_attributes created with [cameraAttributesCreate] to the given camera.
   */
  public fun cameraSetCameraAttributes(camera: RID, effects: RID): Unit {
    TransferContext.writeArguments(_RID to camera, _RID to effects)
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetCameraAttributesPtr, NIL)
  }

  /**
   * If `true`, preserves the horizontal aspect ratio which is equivalent to [Camera3D.KEEP_WIDTH].
   * If `false`, preserves the vertical aspect ratio which is equivalent to [Camera3D.KEEP_HEIGHT].
   */
  public fun cameraSetUseVerticalAspect(camera: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to camera, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetUseVerticalAspectPtr, NIL)
  }

  /**
   * Creates an empty viewport and adds it to the RenderingServer. It can be accessed with the RID
   * that is returned. This RID will be used in all `viewport_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent node is [Viewport].
   */
  public fun viewportCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.viewportCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If `true`, the viewport uses augmented or virtual reality technologies. See [XRInterface].
   */
  public fun viewportSetUseXr(viewport: RID, useXr: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to useXr)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetUseXrPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetSizePtr, NIL)
  }

  /**
   * If `true`, sets the viewport active, else sets it inactive.
   */
  public fun viewportSetActive(viewport: RID, active: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetActivePtr, NIL)
  }

  /**
   * Sets the viewport's parent to the viewport specified by the [parentViewport] RID.
   */
  public fun viewportSetParentViewport(viewport: RID, parentViewport: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to parentViewport)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetParentViewportPtr, NIL)
  }

  /**
   * Copies the viewport to a region of the screen specified by [rect]. If
   * [viewportSetRenderDirectToScreen] is `true`, then the viewport does not use a framebuffer and the
   * contents of the viewport are rendered directly to screen. However, note that the root viewport is
   * drawn last, therefore it will draw over the screen. Accordingly, you must set the root viewport to
   * an area that does not cover the area that you have attached this viewport to.
   * For example, you can set the root viewport to not render at all with the following code:
   * FIXME: The method seems to be non-existent.
   *
   * gdscript:
   * ```gdscript
   * func _ready():
   *     get_viewport().set_attach_to_screen_rect(Rect2())
   *     $Viewport.set_attach_to_screen_rect(Rect2(0, 0, 600, 600))
   * ```
   *
   * Using this can result in significant optimization, especially on lower-end devices. However, it
   * comes at the cost of having to manage your viewports manually. For further optimization, see
   * [viewportSetRenderDirectToScreen].
   */
  @JvmOverloads
  public fun viewportAttachToScreen(
    viewport: RID,
    rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    screen: Int = 0,
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, RECT2 to rect, LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.viewportAttachToScreenPtr, NIL)
  }

  /**
   * If `true`, render the contents of the viewport directly to screen. This allows a low-level
   * optimization where you can skip drawing a viewport to the root viewport. While this optimization
   * can result in a significant increase in speed (especially on older devices), it comes at a cost of
   * usability. When this is enabled, you cannot read from the viewport or from the screen_texture. You
   * also lose the benefit of certain window settings, such as the various stretch modes. Another
   * consequence to be aware of is that in 2D the rendering happens in window coordinates, so if you
   * have a viewport that is double the size of the window, and you set this, then only the portion
   * that fits within the window will be drawn, no automatic scaling is possible, even if your game
   * scene is significantly larger than the window size.
   */
  public fun viewportSetRenderDirectToScreen(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetRenderDirectToScreenPtr, NIL)
  }

  /**
   * Sets the rendering mask associated with this [Viewport]. Only [CanvasItem] nodes with a
   * matching rendering visibility layer will be rendered by this [Viewport].
   */
  public fun viewportSetCanvasCullMask(viewport: RID, canvasCullMask: Long): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to canvasCullMask)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetCanvasCullMaskPtr, NIL)
  }

  /**
   * Sets the 3D resolution scaling mode. Bilinear scaling renders at different resolution to either
   * undersample or supersample the viewport. FidelityFX Super Resolution 1.0, abbreviated to FSR, is
   * an upscaling technology that produces high quality images at fast framerates by using a spatially
   * aware upscaling algorithm. FSR is slightly more expensive than bilinear, but it produces
   * significantly higher image quality. FSR should be used where possible.
   */
  public fun viewportSetScaling3dMode(viewport: RID, scaling3dMode: ViewportScaling3DMode): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to scaling3dMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetScaling3dModePtr, NIL)
  }

  /**
   * Scales the 3D render buffer based on the viewport size uses an image filter specified in
   * [ViewportScaling3DMode] to scale the output image to the full viewport size. Values lower than
   * `1.0` can be used to speed up 3D rendering at the cost of quality (undersampling). Values greater
   * than `1.0` are only valid for bilinear mode and can be used to improve 3D rendering quality at a
   * high performance cost (supersampling). See also [ViewportMSAA] for multi-sample antialiasing,
   * which is significantly cheaper but only smoothens the edges of polygons.
   * When using FSR upscaling, AMD recommends exposing the following values as preset options to
   * users "Ultra Quality: 0.77", "Quality: 0.67", "Balanced: 0.59", "Performance: 0.5" instead of
   * exposing the entire scale.
   */
  public fun viewportSetScaling3dScale(viewport: RID, scale: Float): Unit {
    TransferContext.writeArguments(_RID to viewport, DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetScaling3dScalePtr, NIL)
  }

  /**
   * Determines how sharp the upscaled image will be when using the FSR upscaling mode. Sharpness
   * halves with every whole number. Values go from 0.0 (sharpest) to 2.0. Values above 2.0 won't make
   * a visible difference.
   */
  public fun viewportSetFsrSharpness(viewport: RID, sharpness: Float): Unit {
    TransferContext.writeArguments(_RID to viewport, DOUBLE to sharpness.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetFsrSharpnessPtr, NIL)
  }

  /**
   * Affects the final texture sharpness by reading from a lower or higher mipmap (also called
   * "texture LOD bias"). Negative values make mipmapped textures sharper but grainier when viewed at a
   * distance, while positive values make mipmapped textures blurrier (even when up close). To get
   * sharper textures at a distance without introducing too much graininess, set this between `-0.75`
   * and `0.0`. Enabling temporal antialiasing
   * ([ProjectSettings.rendering/antiAliasing/quality/useTaa]) can help reduce the graininess visible
   * when using negative mipmap bias.
   * **Note:** When the 3D scaling mode is set to FSR 1.0, this value is used to adjust the
   * automatic mipmap bias which is calculated internally based on the scale factor. The formula for
   * this is `-log2(1.0 / scale) + mipmap_bias`.
   */
  public fun viewportSetTextureMipmapBias(viewport: RID, mipmapBias: Float): Unit {
    TransferContext.writeArguments(_RID to viewport, DOUBLE to mipmapBias.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetTextureMipmapBiasPtr, NIL)
  }

  /**
   * Sets when the viewport should be updated. See [ViewportUpdateMode] constants for options.
   */
  public fun viewportSetUpdateMode(viewport: RID, updateMode: ViewportUpdateMode): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to updateMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetUpdateModePtr, NIL)
  }

  /**
   * Sets the clear mode of a viewport. See [ViewportClearMode] for options.
   */
  public fun viewportSetClearMode(viewport: RID, clearMode: ViewportClearMode): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to clearMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetClearModePtr, NIL)
  }

  /**
   * Returns the render target for the viewport.
   */
  public fun viewportGetRenderTarget(viewport: RID): RID {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportGetRenderTargetPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the viewport's last rendered frame.
   */
  public fun viewportGetTexture(viewport: RID): RID {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportGetTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If `true`, the viewport's 3D elements are not rendered.
   */
  public fun viewportSetDisable3d(viewport: RID, disable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetDisable3dPtr, NIL)
  }

  /**
   * If `true`, the viewport's canvas (i.e. 2D and GUI elements) is not rendered.
   */
  public fun viewportSetDisable2d(viewport: RID, disable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetDisable2dPtr, NIL)
  }

  /**
   * Sets the viewport's environment mode which allows enabling or disabling rendering of 3D
   * environment over 2D canvas. When disabled, 2D will not be affected by the environment. When
   * enabled, 2D will be affected by the environment if the environment background mode is
   * [ENV_BG_CANVAS]. The default behavior is to inherit the setting from the viewport's parent. If the
   * topmost parent is also set to [VIEWPORT_ENVIRONMENT_INHERIT], then the behavior will be the same
   * as if it was set to [VIEWPORT_ENVIRONMENT_ENABLED].
   */
  public fun viewportSetEnvironmentMode(viewport: RID, mode: ViewportEnvironmentMode): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetEnvironmentModePtr, NIL)
  }

  /**
   * Sets a viewport's camera.
   */
  public fun viewportAttachCamera(viewport: RID, camera: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to camera)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportAttachCameraPtr, NIL)
  }

  /**
   * Sets a viewport's scenario. The scenario contains information about environment information,
   * reflection atlas, etc.
   */
  public fun viewportSetScenario(viewport: RID, scenario: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to scenario)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetScenarioPtr, NIL)
  }

  /**
   * Sets a viewport's canvas.
   */
  public fun viewportAttachCanvas(viewport: RID, canvas: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportAttachCanvasPtr, NIL)
  }

  /**
   * Detaches a viewport from a canvas and vice versa.
   */
  public fun viewportRemoveCanvas(viewport: RID, canvas: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportRemoveCanvasPtr, NIL)
  }

  /**
   * If `true`, canvas item transforms (i.e. origin position) are snapped to the nearest pixel when
   * rendering. This can lead to a crisper appearance at the cost of less smooth movement, especially
   * when [Camera2D] smoothing is enabled. Equivalent to
   * [ProjectSettings.rendering/2d/snap/snap2dTransformsToPixel].
   */
  public fun viewportSetSnap2dTransformsToPixel(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetSnap2dTransformsToPixelPtr, NIL)
  }

  /**
   * If `true`, canvas item vertices (i.e. polygon points) are snapped to the nearest pixel when
   * rendering. This can lead to a crisper appearance at the cost of less smooth movement, especially
   * when [Camera2D] smoothing is enabled. Equivalent to
   * [ProjectSettings.rendering/2d/snap/snap2dVerticesToPixel].
   */
  public fun viewportSetSnap2dVerticesToPixel(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetSnap2dVerticesToPixelPtr, NIL)
  }

  /**
   * Sets the default texture filtering mode for the specified [viewport] RID. See
   * [CanvasItemTextureFilter] for options.
   */
  public fun viewportSetDefaultCanvasItemTextureFilter(viewport: RID,
      filter: CanvasItemTextureFilter): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to filter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetDefaultCanvasItemTextureFilterPtr,
        NIL)
  }

  /**
   * Sets the default texture repeat mode for the specified [viewport] RID. See
   * [CanvasItemTextureRepeat] for options.
   */
  public fun viewportSetDefaultCanvasItemTextureRepeat(viewport: RID,
      repeat: CanvasItemTextureRepeat): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to repeat.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetDefaultCanvasItemTextureRepeatPtr,
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
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetCanvasTransformPtr, NIL)
  }

  /**
   * Sets the stacking order for a viewport's canvas.
   * [layer] is the actual canvas layer, while [sublayer] specifies the stacking order of the canvas
   * among those in the same layer.
   */
  public fun viewportSetCanvasStacking(
    viewport: RID,
    canvas: RID,
    layer: Int,
    sublayer: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas, LONG to layer.toLong(), LONG to sublayer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetCanvasStackingPtr, NIL)
  }

  /**
   * If `true`, the viewport renders its background as transparent.
   */
  public fun viewportSetTransparentBackground(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetTransparentBackgroundPtr, NIL)
  }

  /**
   * Sets the viewport's global transformation matrix.
   */
  public fun viewportSetGlobalCanvasTransform(viewport: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to viewport, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetGlobalCanvasTransformPtr, NIL)
  }

  /**
   * Sets the viewport's 2D signed distance field [ProjectSettings.rendering/2d/sdf/oversize] and
   * [ProjectSettings.rendering/2d/sdf/scale]. This is used when sampling the signed distance field in
   * [CanvasItem] shaders as well as [GPUParticles2D] collision. This is *not* used by SDFGI in 3D
   * rendering.
   */
  public fun viewportSetSdfOversizeAndScale(
    viewport: RID,
    oversize: ViewportSDFOversize,
    scale: ViewportSDFScale,
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to oversize.id, LONG to scale.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetSdfOversizeAndScalePtr, NIL)
  }

  /**
   * Sets the [size] of the shadow atlas's images (used for omni and spot lights) on the viewport
   * specified by the [viewport] RID. The value is rounded up to the nearest power of 2. If [use16Bits]
   * is `true`, use 16 bits for the omni/spot shadow depth map. Enabling this results in shadows having
   * less precision and may result in shadow acne, but can lead to performance improvements on some
   * devices.
   * **Note:** If this is set to `0`, no positional shadows will be visible at all. This can improve
   * performance significantly on low-end systems by reducing both the CPU and GPU load (as fewer draw
   * calls are needed to draw the scene without shadows).
   */
  @JvmOverloads
  public fun viewportSetPositionalShadowAtlasSize(
    viewport: RID,
    size: Int,
    use16Bits: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to size.toLong(), BOOL to use16Bits)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetPositionalShadowAtlasSizePtr, NIL)
  }

  /**
   * Sets the number of subdivisions to use in the specified shadow atlas [quadrant] for omni and
   * spot shadows. See also [Viewport.setPositionalShadowAtlasQuadrantSubdiv].
   */
  public fun viewportSetPositionalShadowAtlasQuadrantSubdivision(
    viewport: RID,
    quadrant: Int,
    subdivision: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to quadrant.toLong(), LONG to subdivision.toLong())
    TransferContext.callMethod(rawPtr,
        MethodBindings.viewportSetPositionalShadowAtlasQuadrantSubdivisionPtr, NIL)
  }

  /**
   * Sets the multisample anti-aliasing mode for 3D on the specified [viewport] RID. See
   * [ViewportMSAA] for options.
   */
  public fun viewportSetMsaa3d(viewport: RID, msaa: ViewportMSAA): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to msaa.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetMsaa3dPtr, NIL)
  }

  /**
   * Sets the multisample anti-aliasing mode for 2D/Canvas on the specified [viewport] RID. See
   * [ViewportMSAA] for options.
   */
  public fun viewportSetMsaa2d(viewport: RID, msaa: ViewportMSAA): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to msaa.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetMsaa2dPtr, NIL)
  }

  /**
   * If `true`, 2D rendering will use a high dynamic range (HDR) format framebuffer matching the bit
   * depth of the 3D framebuffer. When using the Forward+ renderer this will be a `RGBA16` framebuffer,
   * while when using the Mobile renderer it will be a `RGB10_A2` framebuffer. Additionally, 2D
   * rendering will take place in linear color space and will be converted to sRGB space immediately
   * before blitting to the screen (if the Viewport is attached to the screen). Practically speaking,
   * this means that the end result of the Viewport will not be clamped into the `0-1` range and can be
   * used in 3D rendering without color space adjustments. This allows 2D rendering to take advantage
   * of effects requiring high dynamic range (e.g. 2D glow) as well as substantially improves the
   * appearance of effects requiring highly detailed gradients. This setting has the same effect as
   * [Viewport.useHdr2d].
   * **Note:** This setting will have no effect when using the GL Compatibility renderer as the GL
   * Compatibility renderer always renders in low dynamic range for performance reasons.
   */
  public fun viewportSetUseHdr2d(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetUseHdr2dPtr, NIL)
  }

  /**
   * Sets the viewport's screen-space antialiasing mode.
   */
  public fun viewportSetScreenSpaceAa(viewport: RID, mode: ViewportScreenSpaceAA): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetScreenSpaceAaPtr, NIL)
  }

  /**
   * If `true`, use Temporal Anti-Aliasing. Equivalent to
   * [ProjectSettings.rendering/antiAliasing/quality/useTaa].
   */
  public fun viewportSetUseTaa(viewport: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetUseTaaPtr, NIL)
  }

  /**
   * If `true`, enables debanding on the specified viewport. Equivalent to
   * [ProjectSettings.rendering/antiAliasing/quality/useDebanding].
   */
  public fun viewportSetUseDebanding(viewport: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetUseDebandingPtr, NIL)
  }

  /**
   * If `true`, enables occlusion culling on the specified viewport. Equivalent to
   * [ProjectSettings.rendering/occlusionCulling/useOcclusionCulling].
   */
  public fun viewportSetUseOcclusionCulling(viewport: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetUseOcclusionCullingPtr, NIL)
  }

  /**
   * Sets the [ProjectSettings.rendering/occlusionCulling/occlusionRaysPerThread] to use for
   * occlusion culling. This parameter is global and cannot be set on a per-viewport basis.
   */
  public fun viewportSetOcclusionRaysPerThread(raysPerThread: Int): Unit {
    TransferContext.writeArguments(LONG to raysPerThread.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetOcclusionRaysPerThreadPtr, NIL)
  }

  /**
   * Sets the [ProjectSettings.rendering/occlusionCulling/bvhBuildQuality] to use for occlusion
   * culling. This parameter is global and cannot be set on a per-viewport basis.
   */
  public fun viewportSetOcclusionCullingBuildQuality(quality: ViewportOcclusionCullingBuildQuality):
      Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetOcclusionCullingBuildQualityPtr,
        NIL)
  }

  /**
   * Returns a statistic about the rendering engine which can be used for performance profiling.
   * This is separated into render pass [type]s, each of them having the same [info]s you can query
   * (different passes will return different values). See [RenderingServer.ViewportRenderInfoType] for
   * a list of render pass types and [RenderingServer.ViewportRenderInfo] for a list of information
   * that can be queried.
   * See also [getRenderingInfo], which returns global information across all viewports.
   * **Note:** Viewport rendering information is not available until at least 2 frames have been
   * rendered by the engine. If rendering information is not available, [viewportGetRenderInfo] returns
   * `0`. To print rendering information in `_ready()` successfully, use the following:
   * [codeblock]
   * func _ready():
   *     for _i in 2:
   *         await get_tree().process_frame
   *
   *     print(
   *             RenderingServer.viewport_get_render_info(get_viewport().get_viewport_rid(),
   *             RenderingServer.VIEWPORT_RENDER_INFO_TYPE_VISIBLE,
   *             RenderingServer.VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME)
   *     )
   * [/codeblock]
   */
  public fun viewportGetRenderInfo(
    viewport: RID,
    type: ViewportRenderInfoType,
    info: ViewportRenderInfo,
  ): Int {
    TransferContext.writeArguments(_RID to viewport, LONG to type.id, LONG to info.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportGetRenderInfoPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the debug draw mode of a viewport. See [ViewportDebugDraw] for options.
   */
  public fun viewportSetDebugDraw(viewport: RID, draw: ViewportDebugDraw): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to draw.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetDebugDrawPtr, NIL)
  }

  /**
   * Sets the measurement for the given [viewport] RID (obtained using [Viewport.getViewportRid]).
   * Once enabled, [viewportGetMeasuredRenderTimeCpu] and [viewportGetMeasuredRenderTimeGpu] will
   * return values greater than `0.0` when queried with the given [viewport].
   */
  public fun viewportSetMeasureRenderTime(viewport: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetMeasureRenderTimePtr, NIL)
  }

  /**
   * Returns the CPU time taken to render the last frame in milliseconds. This *only* includes time
   * spent in rendering-related operations; scripts' `_process` functions and other engine subsystems
   * are not included in this readout. To get a complete readout of CPU time spent to render the scene,
   * sum the render times of all viewports that are drawn every frame plus [getFrameSetupTimeCpu].
   * Unlike [Engine.getFramesPerSecond], this method will accurately reflect CPU utilization even if
   * framerate is capped via V-Sync or [Engine.maxFps]. See also [viewportGetMeasuredRenderTimeGpu].
   * **Note:** Requires measurements to be enabled on the specified [viewport] using
   * [viewportSetMeasureRenderTime]. Otherwise, this method returns `0.0`.
   */
  public fun viewportGetMeasuredRenderTimeCpu(viewport: RID): Double {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportGetMeasuredRenderTimeCpuPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the GPU time taken to render the last frame in milliseconds. To get a complete readout
   * of GPU time spent to render the scene, sum the render times of all viewports that are drawn every
   * frame. Unlike [Engine.getFramesPerSecond], this method accurately reflects GPU utilization even if
   * framerate is capped via V-Sync or [Engine.maxFps]. See also [viewportGetMeasuredRenderTimeGpu].
   * **Note:** Requires measurements to be enabled on the specified [viewport] using
   * [viewportSetMeasureRenderTime]. Otherwise, this method returns `0.0`.
   * **Note:** When GPU utilization is low enough during a certain period of time, GPUs will
   * decrease their power state (which in turn decreases core and memory clock speeds). This can cause
   * the reported GPU time to increase if GPU utilization is kept low enough by a framerate cap
   * (compared to what it would be at the GPU's highest power state). Keep this in mind when
   * benchmarking using [viewportGetMeasuredRenderTimeGpu]. This behavior can be overridden in the
   * graphics driver settings at the cost of higher power usage.
   */
  public fun viewportGetMeasuredRenderTimeGpu(viewport: RID): Double {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportGetMeasuredRenderTimeGpuPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Sets the Variable Rate Shading (VRS) mode for the viewport. If the GPU does not support VRS,
   * this property is ignored. Equivalent to [ProjectSettings.rendering/vrs/mode].
   */
  public fun viewportSetVrsMode(viewport: RID, mode: ViewportVRSMode): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetVrsModePtr, NIL)
  }

  /**
   * The texture to use when the VRS mode is set to [RenderingServer.VIEWPORT_VRS_TEXTURE].
   * Equivalent to [ProjectSettings.rendering/vrs/texture].
   */
  public fun viewportSetVrsTexture(viewport: RID, texture: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetVrsTexturePtr, NIL)
  }

  /**
   * Creates an empty sky and adds it to the RenderingServer. It can be accessed with the RID that
   * is returned. This RID will be used in all `sky_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   */
  public fun skyCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.skyCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the [radianceSize] of the sky specified by the [sky] RID (in pixels). Equivalent to
   * [Sky.radianceSize].
   */
  public fun skySetRadianceSize(sky: RID, radianceSize: Int): Unit {
    TransferContext.writeArguments(_RID to sky, LONG to radianceSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.skySetRadianceSizePtr, NIL)
  }

  /**
   * Sets the process [mode] of the sky specified by the [sky] RID. Equivalent to [Sky.processMode].
   */
  public fun skySetMode(sky: RID, mode: SkyMode): Unit {
    TransferContext.writeArguments(_RID to sky, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.skySetModePtr, NIL)
  }

  /**
   * Sets the material that the sky uses to render the background, ambient and reflection maps.
   */
  public fun skySetMaterial(sky: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to sky, _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.skySetMaterialPtr, NIL)
  }

  /**
   * Generates and returns an [Image] containing the radiance map for the specified [sky] RID. This
   * supports built-in sky material and custom sky shaders. If [bakeIrradiance] is `true`, the
   * irradiance map is saved instead of the radiance map. The radiance map is used to render reflected
   * light, while the irradiance map is used to render ambient light. See also
   * [environmentBakePanorama].
   * **Note:** The image is saved in linear color space without any tonemapping performed, which
   * means it will look too dark if viewed directly in an image editor. [energy] values above `1.0` can
   * be used to brighten the resulting image.
   * **Note:** [size] should be a 2:1 aspect ratio for the generated panorama to have square pixels.
   * For radiance maps, there is no point in using a height greater than [Sky.radianceSize], as it
   * won't increase detail. Irradiance maps only contain low-frequency data, so there is usually no
   * point in going past a size of 128×64 pixels when saving an irradiance map.
   */
  public fun skyBakePanorama(
    sky: RID,
    energy: Float,
    bakeIrradiance: Boolean,
    size: Vector2i,
  ): Image? {
    TransferContext.writeArguments(_RID to sky, DOUBLE to energy.toDouble(), BOOL to bakeIrradiance, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.skyBakePanoramaPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Creates an environment and adds it to the RenderingServer. It can be accessed with the RID that
   * is returned. This RID will be used in all `environment_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent resource is [Environment].
   */
  public fun environmentCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.environmentCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the environment's background mode. Equivalent to [Environment.backgroundMode].
   */
  public fun environmentSetBackground(env: RID, bg: EnvironmentBG): Unit {
    TransferContext.writeArguments(_RID to env, LONG to bg.id)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetBackgroundPtr, NIL)
  }

  /**
   * Sets the [Sky] to be used as the environment's background when using *BGMode* sky. Equivalent
   * to [Environment.sky].
   */
  public fun environmentSetSky(env: RID, sky: RID): Unit {
    TransferContext.writeArguments(_RID to env, _RID to sky)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSkyPtr, NIL)
  }

  /**
   * Sets a custom field of view for the background [Sky]. Equivalent to [Environment.skyCustomFov].
   */
  public fun environmentSetSkyCustomFov(env: RID, scale: Float): Unit {
    TransferContext.writeArguments(_RID to env, DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSkyCustomFovPtr, NIL)
  }

  /**
   * Sets the rotation of the background [Sky] expressed as a [Basis]. Equivalent to
   * [Environment.skyRotation], where the rotation vector is used to construct the [Basis].
   */
  public fun environmentSetSkyOrientation(env: RID, orientation: Basis): Unit {
    TransferContext.writeArguments(_RID to env, BASIS to orientation)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSkyOrientationPtr, NIL)
  }

  /**
   * Color displayed for clear areas of the scene. Only effective if using the [ENV_BG_COLOR]
   * background mode.
   */
  public fun environmentSetBgColor(env: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to env, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetBgColorPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetBgEnergyPtr, NIL)
  }

  /**
   * Sets the maximum layer to use if using Canvas background mode.
   */
  public fun environmentSetCanvasMaxLayer(env: RID, maxLayer: Int): Unit {
    TransferContext.writeArguments(_RID to env, LONG to maxLayer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetCanvasMaxLayerPtr, NIL)
  }

  /**
   * Sets the values to be used for ambient light rendering. See [Environment] for more details.
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
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetAmbientLightPtr, NIL)
  }

  /**
   * Configures glow for the specified environment RID. See `glow_*` properties in [Environment] for
   * more information.
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
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetGlowPtr, NIL)
  }

  /**
   * Sets the variables to be used with the "tonemap" post-process effect. See [Environment] for
   * more details.
   */
  public fun environmentSetTonemap(
    env: RID,
    toneMapper: EnvironmentToneMapper,
    exposure: Float,
    white: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to env, LONG to toneMapper.id, DOUBLE to exposure.toDouble(), DOUBLE to white.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetTonemapPtr, NIL)
  }

  /**
   * Sets the values to be used with the "adjustments" post-process effect. See [Environment] for
   * more details.
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
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetAdjustmentPtr, NIL)
  }

  /**
   * Sets the variables to be used with the screen-space reflections (SSR) post-process effect. See
   * [Environment] for more details.
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
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSsrPtr, NIL)
  }

  /**
   * Sets the variables to be used with the screen-space ambient occlusion (SSAO) post-process
   * effect. See [Environment] for more details.
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
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSsaoPtr, NIL)
  }

  /**
   * Configures fog for the specified environment RID. See `fog_*` properties in [Environment] for
   * more information.
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
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetFogPtr, NIL)
  }

  /**
   * Configures signed distance field global illumination for the specified environment RID. See
   * `sdfgi_*` properties in [Environment] for more information.
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
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSdfgiPtr, NIL)
  }

  /**
   * Sets the variables to be used with the volumetric fog post-process effect. See [Environment]
   * for more details.
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
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetVolumetricFogPtr, NIL)
  }

  /**
   * If [enable] is `true`, enables bicubic upscaling for glow which improves quality at the cost of
   * performance. Equivalent to [ProjectSettings.rendering/environment/glow/upscaleMode].
   */
  public fun environmentGlowSetUseBicubicUpscale(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentGlowSetUseBicubicUpscalePtr, NIL)
  }

  public fun environmentSetSsrRoughnessQuality(quality: EnvironmentSSRRoughnessQuality): Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSsrRoughnessQualityPtr, NIL)
  }

  /**
   * Sets the quality level of the screen-space ambient occlusion (SSAO) post-process effect. See
   * [Environment] for more details.
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
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSsaoQualityPtr, NIL)
  }

  /**
   * Sets the quality level of the screen-space indirect lighting (SSIL) post-process effect. See
   * [Environment] for more details.
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
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSsilQualityPtr, NIL)
  }

  /**
   * Sets the number of rays to throw per frame when computing signed distance field global
   * illumination. Equivalent to [ProjectSettings.rendering/globalIllumination/sdfgi/probeRayCount].
   */
  public fun environmentSetSdfgiRayCount(rayCount: EnvironmentSDFGIRayCount): Unit {
    TransferContext.writeArguments(LONG to rayCount.id)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSdfgiRayCountPtr, NIL)
  }

  /**
   * Sets the number of frames to use for converging signed distance field global illumination.
   * Equivalent to [ProjectSettings.rendering/globalIllumination/sdfgi/framesToConverge].
   */
  public fun environmentSetSdfgiFramesToConverge(frames: EnvironmentSDFGIFramesToConverge): Unit {
    TransferContext.writeArguments(LONG to frames.id)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSdfgiFramesToConvergePtr, NIL)
  }

  /**
   * Sets the update speed for dynamic lights' indirect lighting when computing signed distance
   * field global illumination. Equivalent to
   * [ProjectSettings.rendering/globalIllumination/sdfgi/framesToUpdateLights].
   */
  public fun environmentSetSdfgiFramesToUpdateLight(frames: EnvironmentSDFGIFramesToUpdateLight):
      Unit {
    TransferContext.writeArguments(LONG to frames.id)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSdfgiFramesToUpdateLightPtr,
        NIL)
  }

  /**
   * Sets the resolution of the volumetric fog's froxel buffer. [size] is modified by the screen's
   * aspect ratio and then used to set the width and height of the buffer. While [depth] is directly
   * used to set the depth of the buffer.
   */
  public fun environmentSetVolumetricFogVolumeSize(size: Int, depth: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong(), LONG to depth.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetVolumetricFogVolumeSizePtr, NIL)
  }

  /**
   * Enables filtering of the volumetric fog scattering buffer. This results in much smoother
   * volumes with very few under-sampling artifacts.
   */
  public fun environmentSetVolumetricFogFilterActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetVolumetricFogFilterActivePtr,
        NIL)
  }

  /**
   * Generates and returns an [Image] containing the radiance map for the specified [environment]
   * RID's sky. This supports built-in sky material and custom sky shaders. If [bakeIrradiance] is
   * `true`, the irradiance map is saved instead of the radiance map. The radiance map is used to
   * render reflected light, while the irradiance map is used to render ambient light. See also
   * [skyBakePanorama].
   * **Note:** The image is saved in linear color space without any tonemapping performed, which
   * means it will look too dark if viewed directly in an image editor.
   * **Note:** [size] should be a 2:1 aspect ratio for the generated panorama to have square pixels.
   * For radiance maps, there is no point in using a height greater than [Sky.radianceSize], as it
   * won't increase detail. Irradiance maps only contain low-frequency data, so there is usually no
   * point in going past a size of 128×64 pixels when saving an irradiance map.
   */
  public fun environmentBakePanorama(
    environment: RID,
    bakeIrradiance: Boolean,
    size: Vector2i,
  ): Image? {
    TransferContext.writeArguments(_RID to environment, BOOL to bakeIrradiance, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentBakePanoramaPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Sets the screen-space roughness limiter parameters, such as whether it should be enabled and
   * its thresholds. Equivalent to
   * [ProjectSettings.rendering/antiAliasing/screenSpaceRoughnessLimiter/enabled],
   * [ProjectSettings.rendering/antiAliasing/screenSpaceRoughnessLimiter/amount] and
   * [ProjectSettings.rendering/antiAliasing/screenSpaceRoughnessLimiter/limit].
   */
  public fun screenSpaceRoughnessLimiterSetActive(
    enable: Boolean,
    amount: Float,
    limit: Float,
  ): Unit {
    TransferContext.writeArguments(BOOL to enable, DOUBLE to amount.toDouble(), DOUBLE to limit.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.screenSpaceRoughnessLimiterSetActivePtr, NIL)
  }

  /**
   * Sets [ProjectSettings.rendering/environment/subsurfaceScattering/subsurfaceScatteringQuality]
   * to use when rendering materials that have subsurface scattering enabled.
   */
  public fun subSurfaceScatteringSetQuality(quality: SubSurfaceScatteringQuality): Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr, MethodBindings.subSurfaceScatteringSetQualityPtr, NIL)
  }

  /**
   * Sets the [ProjectSettings.rendering/environment/subsurfaceScattering/subsurfaceScatteringScale]
   * and [ProjectSettings.rendering/environment/subsurfaceScattering/subsurfaceScatteringDepthScale] to
   * use when rendering materials that have subsurface scattering enabled.
   */
  public fun subSurfaceScatteringSetScale(scale: Float, depthScale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to scale.toDouble(), DOUBLE to depthScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.subSurfaceScatteringSetScalePtr, NIL)
  }

  /**
   * Creates a camera attributes object and adds it to the RenderingServer. It can be accessed with
   * the RID that is returned. This RID will be used in all `camera_attributes_` RenderingServer
   * functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent resource is [CameraAttributes].
   */
  public fun cameraAttributesCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cameraAttributesCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the quality level of the DOF blur effect to one of the options in [DOFBlurQuality].
   * [useJitter] can be used to jitter samples taken during the blur pass to hide artifacts at the cost
   * of looking more fuzzy.
   */
  public fun cameraAttributesSetDofBlurQuality(quality: DOFBlurQuality, useJitter: Boolean): Unit {
    TransferContext.writeArguments(LONG to quality.id, BOOL to useJitter)
    TransferContext.callMethod(rawPtr, MethodBindings.cameraAttributesSetDofBlurQualityPtr, NIL)
  }

  /**
   * Sets the shape of the DOF bokeh pattern. Different shapes may be used to achieve artistic
   * effect, or to meet performance targets. For more detail on available options see [DOFBokehShape].
   */
  public fun cameraAttributesSetDofBlurBokehShape(shape: DOFBokehShape): Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(rawPtr, MethodBindings.cameraAttributesSetDofBlurBokehShapePtr, NIL)
  }

  /**
   * Sets the parameters to use with the DOF blur effect. These parameters take on the same meaning
   * as their counterparts in [CameraAttributesPractical].
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
    TransferContext.callMethod(rawPtr, MethodBindings.cameraAttributesSetDofBlurPtr, NIL)
  }

  /**
   * Sets the exposure values that will be used by the renderers. The normalization amount is used
   * to bake a given Exposure Value (EV) into rendering calculations to reduce the dynamic range of the
   * scene.
   * The normalization factor can be calculated from exposure value (EV100) as follows:
   * [codeblock]
   * func get_exposure_normalization(float ev100):
   *         return 1.0 / (pow(2.0, ev100) * 1.2)
   * [/codeblock]
   * The exposure value can be calculated from aperture (in f-stops), shutter speed (in seconds),
   * and sensitivity (in ISO) as follows:
   * [codeblock]
   * func get_exposure(float aperture, float shutter_speed, float sensitivity):
   *     return log2((aperture * aperture) / shutterSpeed * (100.0 / sensitivity))
   * [/codeblock]
   */
  public fun cameraAttributesSetExposure(
    cameraAttributes: RID,
    multiplier: Float,
    normalization: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to cameraAttributes, DOUBLE to multiplier.toDouble(), DOUBLE to normalization.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.cameraAttributesSetExposurePtr, NIL)
  }

  /**
   * Sets the parameters to use with the auto-exposure effect. These parameters take on the same
   * meaning as their counterparts in [CameraAttributes] and [CameraAttributesPractical].
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
    TransferContext.callMethod(rawPtr, MethodBindings.cameraAttributesSetAutoExposurePtr, NIL)
  }

  /**
   * Creates a scenario and adds it to the RenderingServer. It can be accessed with the RID that is
   * returned. This RID will be used in all `scenario_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * The scenario is the 3D world that all the visual instances exist in.
   */
  public fun scenarioCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.scenarioCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the environment that will be used with this scenario. See also [Environment].
   */
  public fun scenarioSetEnvironment(scenario: RID, environment: RID): Unit {
    TransferContext.writeArguments(_RID to scenario, _RID to environment)
    TransferContext.callMethod(rawPtr, MethodBindings.scenarioSetEnvironmentPtr, NIL)
  }

  /**
   * Sets the fallback environment to be used by this scenario. The fallback environment is used if
   * no environment is set. Internally, this is used by the editor to provide a default environment.
   */
  public fun scenarioSetFallbackEnvironment(scenario: RID, environment: RID): Unit {
    TransferContext.writeArguments(_RID to scenario, _RID to environment)
    TransferContext.callMethod(rawPtr, MethodBindings.scenarioSetFallbackEnvironmentPtr, NIL)
  }

  /**
   * Sets the camera attributes ([effects]) that will be used with this scenario. See also
   * [CameraAttributes].
   */
  public fun scenarioSetCameraAttributes(scenario: RID, effects: RID): Unit {
    TransferContext.writeArguments(_RID to scenario, _RID to effects)
    TransferContext.callMethod(rawPtr, MethodBindings.scenarioSetCameraAttributesPtr, NIL)
  }

  /**
   * Creates a visual instance, adds it to the RenderingServer, and sets both base and scenario. It
   * can be accessed with the RID that is returned. This RID will be used in all `instance_*`
   * RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method. This is a shorthand for using [instanceCreate] and setting the base and scenario
   * manually.
   */
  public fun instanceCreate2(base: RID, scenario: RID): RID {
    TransferContext.writeArguments(_RID to base, _RID to scenario)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceCreate2Ptr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a visual instance and adds it to the RenderingServer. It can be accessed with the RID
   * that is returned. This RID will be used in all `instance_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * An instance is a way of placing a 3D object in the scenario. Objects like particles, meshes,
   * reflection probes and decals need to be associated with an instance to be visible in the scenario
   * using [instanceSetBase].
   * **Note:** The equivalent node is [VisualInstance3D].
   */
  public fun instanceCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.instanceCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the base of the instance. A base can be any of the 3D objects that are created in the
   * RenderingServer that can be displayed. For example, any of the light types, mesh, multimesh,
   * particle system, reflection probe, decal, lightmap, voxel GI and visibility notifiers are all
   * types that can be set as the base of an instance in order to be displayed in the scenario.
   */
  public fun instanceSetBase(instance: RID, base: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to base)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetBasePtr, NIL)
  }

  /**
   * Sets the scenario that the instance is in. The scenario is the 3D world that the objects will
   * be displayed in.
   */
  public fun instanceSetScenario(instance: RID, scenario: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to scenario)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetScenarioPtr, NIL)
  }

  /**
   * Sets the render layers that this instance will be drawn to. Equivalent to
   * [VisualInstance3D.layers].
   */
  public fun instanceSetLayerMask(instance: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetLayerMaskPtr, NIL)
  }

  /**
   * Sets the sorting offset and switches between using the bounding box or instance origin for
   * depth sorting.
   */
  public fun instanceSetPivotData(
    instance: RID,
    sortingOffset: Float,
    useAabbCenter: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to sortingOffset.toDouble(), BOOL to useAabbCenter)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetPivotDataPtr, NIL)
  }

  /**
   * Sets the world space transform of the instance. Equivalent to [Node3D.globalTransform].
   */
  public fun instanceSetTransform(instance: RID, transform: Transform3D): Unit {
    TransferContext.writeArguments(_RID to instance, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetTransformPtr, NIL)
  }

  /**
   * Attaches a unique Object ID to instance. Object ID must be attached to instance for proper
   * culling with [instancesCullAabb], [instancesCullConvex], and [instancesCullRay].
   */
  public fun instanceAttachObjectInstanceId(instance: RID, id: Long): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceAttachObjectInstanceIdPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetBlendShapeWeightPtr, NIL)
  }

  /**
   * Sets the override material of a specific surface. Equivalent to
   * [MeshInstance3D.setSurfaceOverrideMaterial].
   */
  public fun instanceSetSurfaceOverrideMaterial(
    instance: RID,
    surface: Int,
    material: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to surface.toLong(), _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetSurfaceOverrideMaterialPtr, NIL)
  }

  /**
   * Sets whether an instance is drawn or not. Equivalent to [Node3D.visible].
   */
  public fun instanceSetVisible(instance: RID, visible: Boolean): Unit {
    TransferContext.writeArguments(_RID to instance, BOOL to visible)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetVisiblePtr, NIL)
  }

  /**
   * Sets the transparency for the given geometry instance. Equivalent to
   * [GeometryInstance3D.transparency].
   * A transparency of `0.0` is fully opaque, while `1.0` is fully transparent. Values greater than
   * `0.0` (exclusive) will force the geometry's materials to go through the transparent pipeline,
   * which is slower to render and can exhibit rendering issues due to incorrect transparency sorting.
   * However, unlike using a transparent material, setting [transparency] to a value greater than `0.0`
   * (exclusive) will *not* disable shadow rendering.
   * In spatial shaders, `1.0 - transparency` is set as the default value of the `ALPHA` built-in.
   * **Note:** [transparency] is clamped between `0.0` and `1.0`, so this property cannot be used to
   * make transparent materials more opaque than they originally are.
   */
  public fun instanceGeometrySetTransparency(instance: RID, transparency: Float): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to transparency.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetTransparencyPtr, NIL)
  }

  /**
   * Sets a custom AABB to use when culling objects from the view frustum. Equivalent to setting
   * [GeometryInstance3D.customAabb].
   */
  public fun instanceSetCustomAabb(instance: RID, aabb: AABB): Unit {
    TransferContext.writeArguments(_RID to instance, godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetCustomAabbPtr, NIL)
  }

  /**
   * Attaches a skeleton to an instance. Removes the previous skeleton from the instance.
   */
  public fun instanceAttachSkeleton(instance: RID, skeleton: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to skeleton)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceAttachSkeletonPtr, NIL)
  }

  /**
   * Sets a margin to increase the size of the AABB when culling objects from the view frustum. This
   * allows you to avoid culling objects that fall outside the view frustum. Equivalent to
   * [GeometryInstance3D.extraCullMargin].
   */
  public fun instanceSetExtraVisibilityMargin(instance: RID, margin: Float): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to margin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetExtraVisibilityMarginPtr, NIL)
  }

  /**
   * Sets the visibility parent for the given instance. Equivalent to [Node3D.visibilityParent].
   */
  public fun instanceSetVisibilityParent(instance: RID, parent: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to parent)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetVisibilityParentPtr, NIL)
  }

  /**
   * If `true`, ignores both frustum and occlusion culling on the specified 3D geometry instance.
   * This is not the same as [GeometryInstance3D.ignoreOcclusionCulling], which only ignores occlusion
   * culling and leaves frustum culling intact.
   */
  public fun instanceSetIgnoreCulling(instance: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to instance, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetIgnoreCullingPtr, NIL)
  }

  /**
   * Sets the flag for a given [InstanceFlags]. See [InstanceFlags] for more details.
   */
  public fun instanceGeometrySetFlag(
    instance: RID,
    flag: InstanceFlags,
    enabled: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to flag.id, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetFlagPtr, NIL)
  }

  /**
   * Sets the shadow casting setting to one of [ShadowCastingSetting]. Equivalent to
   * [GeometryInstance3D.castShadow].
   */
  public fun instanceGeometrySetCastShadowsSetting(instance: RID,
      shadowCastingSetting: ShadowCastingSetting): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to shadowCastingSetting.id)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetCastShadowsSettingPtr, NIL)
  }

  /**
   * Sets a material that will override the material for all surfaces on the mesh associated with
   * this instance. Equivalent to [GeometryInstance3D.materialOverride].
   */
  public fun instanceGeometrySetMaterialOverride(instance: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetMaterialOverridePtr, NIL)
  }

  /**
   * Sets a material that will be rendered for all surfaces on top of active materials for the mesh
   * associated with this instance. Equivalent to [GeometryInstance3D.materialOverlay].
   */
  public fun instanceGeometrySetMaterialOverlay(instance: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetMaterialOverlayPtr, NIL)
  }

  /**
   * Sets the visibility range values for the given geometry instance. Equivalent to
   * [GeometryInstance3D.visibilityRangeBegin] and related properties.
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
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetVisibilityRangePtr, NIL)
  }

  /**
   * Sets the lightmap GI instance to use for the specified 3D geometry instance. The lightmap UV
   * scale for the specified instance (equivalent to [GeometryInstance3D.giLightmapScale]) and lightmap
   * atlas slice must also be specified.
   */
  public fun instanceGeometrySetLightmap(
    instance: RID,
    lightmap: RID,
    lightmapUvScale: Rect2,
    lightmapSlice: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to lightmap, RECT2 to lightmapUvScale, LONG to lightmapSlice.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetLightmapPtr, NIL)
  }

  /**
   * Sets the level of detail bias to use when rendering the specified 3D geometry instance. Higher
   * values result in higher detail from further away. Equivalent to [GeometryInstance3D.lodBias].
   */
  public fun instanceGeometrySetLodBias(instance: RID, lodBias: Float): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to lodBias.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetLodBiasPtr, NIL)
  }

  /**
   * Sets the per-instance shader uniform on the specified 3D geometry instance. Equivalent to
   * [GeometryInstance3D.setInstanceShaderParameter].
   */
  public fun instanceGeometrySetShaderParameter(
    instance: RID,
    parameter: StringName,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(_RID to instance, STRING_NAME to parameter, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetShaderParameterPtr, NIL)
  }

  /**
   * Returns the value of the per-instance shader uniform from the specified 3D geometry instance.
   * Equivalent to [GeometryInstance3D.getInstanceShaderParameter].
   * **Note:** Per-instance shader parameter names are case-sensitive.
   */
  public fun instanceGeometryGetShaderParameter(instance: RID, parameter: StringName): Any? {
    TransferContext.writeArguments(_RID to instance, STRING_NAME to parameter)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometryGetShaderParameterPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns the default value of the per-instance shader uniform from the specified 3D geometry
   * instance. Equivalent to [GeometryInstance3D.getInstanceShaderParameter].
   */
  public fun instanceGeometryGetShaderParameterDefaultValue(instance: RID, parameter: StringName):
      Any? {
    TransferContext.writeArguments(_RID to instance, STRING_NAME to parameter)
    TransferContext.callMethod(rawPtr,
        MethodBindings.instanceGeometryGetShaderParameterDefaultValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns a dictionary of per-instance shader uniform names of the per-instance shader uniform
   * from the specified 3D geometry instance. The returned dictionary is in PropertyInfo format, with
   * the keys `name`, `class_name`, `type`, `hint`, `hint_string` and `usage`. Equivalent to
   * [GeometryInstance3D.getInstanceShaderParameter].
   */
  public fun instanceGeometryGetShaderParameterList(instance: RID):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(_RID to instance)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometryGetShaderParameterListPtr,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns an array of object IDs intersecting with the provided AABB. Only 3D nodes that inherit
   * from [VisualInstance3D] are considered, such as [MeshInstance3D] or [DirectionalLight3D]. Use
   * [@GlobalScope.instanceFromId] to obtain the actual nodes. A scenario RID must be provided, which
   * is available in the [World3D] you want to query. This forces an update for all resources queued to
   * update.
   * **Warning:** This function is primarily intended for editor usage. For in-game use cases,
   * prefer physics collision.
   */
  @JvmOverloads
  public fun instancesCullAabb(aabb: AABB, scenario: RID = RID()): PackedInt64Array {
    TransferContext.writeArguments(godot.core.VariantType.AABB to aabb, _RID to scenario)
    TransferContext.callMethod(rawPtr, MethodBindings.instancesCullAabbPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  /**
   * Returns an array of object IDs intersecting with the provided 3D ray. Only 3D nodes that
   * inherit from [VisualInstance3D] are considered, such as [MeshInstance3D] or [DirectionalLight3D].
   * Use [@GlobalScope.instanceFromId] to obtain the actual nodes. A scenario RID must be provided,
   * which is available in the [World3D] you want to query. This forces an update for all resources
   * queued to update.
   * **Warning:** This function is primarily intended for editor usage. For in-game use cases,
   * prefer physics collision.
   */
  @JvmOverloads
  public fun instancesCullRay(
    from: Vector3,
    to: Vector3,
    scenario: RID = RID(),
  ): PackedInt64Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, _RID to scenario)
    TransferContext.callMethod(rawPtr, MethodBindings.instancesCullRayPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  /**
   * Returns an array of object IDs intersecting with the provided convex shape. Only 3D nodes that
   * inherit from [VisualInstance3D] are considered, such as [MeshInstance3D] or [DirectionalLight3D].
   * Use [@GlobalScope.instanceFromId] to obtain the actual nodes. A scenario RID must be provided,
   * which is available in the [World3D] you want to query. This forces an update for all resources
   * queued to update.
   * **Warning:** This function is primarily intended for editor usage. For in-game use cases,
   * prefer physics collision.
   */
  @JvmOverloads
  public fun instancesCullConvex(convex: VariantArray<Plane>, scenario: RID = RID()):
      PackedInt64Array {
    TransferContext.writeArguments(ARRAY to convex, _RID to scenario)
    TransferContext.callMethod(rawPtr, MethodBindings.instancesCullConvexPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  /**
   * Bakes the material data of the Mesh passed in the [base] parameter with optional
   * [materialOverrides] to a set of [Image]s of size [imageSize]. Returns an array of [Image]s
   * containing material properties as specified in [BakeChannels].
   */
  public fun bakeRenderUv2(
    base: RID,
    materialOverrides: VariantArray<RID>,
    imageSize: Vector2i,
  ): VariantArray<Image> {
    TransferContext.writeArguments(_RID to base, ARRAY to materialOverrides, VECTOR2I to imageSize)
    TransferContext.callMethod(rawPtr, MethodBindings.bakeRenderUv2Ptr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Image>)
  }

  /**
   * Creates a canvas and returns the assigned [RID]. It can be accessed with the RID that is
   * returned. This RID will be used in all `canvas_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * Canvas has no [Resource] or [Node] equivalent.
   */
  public fun canvasCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canvasCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * A copy of the canvas item will be drawn with a local offset of the mirroring [Vector2].
   */
  public fun canvasSetItemMirroring(
    canvas: RID,
    item: RID,
    mirroring: Vector2,
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, _RID to item, VECTOR2 to mirroring)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasSetItemMirroringPtr, NIL)
  }

  /**
   * Modulates all colors in the given canvas.
   */
  public fun canvasSetModulate(canvas: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to canvas, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasSetModulatePtr, NIL)
  }

  public fun canvasSetDisableScale(disable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasSetDisableScalePtr, NIL)
  }

  /**
   * Creates a canvas texture and adds it to the RenderingServer. It can be accessed with the RID
   * that is returned. This RID will be used in all `canvas_texture_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method. See also [texture2dCreate].
   * **Note:** The equivalent resource is [CanvasTexture] and is only meant to be used in 2D
   * rendering, not 3D.
   */
  public fun canvasTextureCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canvasTextureCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the [channel]'s [texture] for the canvas texture specified by the [canvasTexture] RID.
   * Equivalent to [CanvasTexture.diffuseTexture], [CanvasTexture.normalTexture] and
   * [CanvasTexture.specularTexture].
   */
  public fun canvasTextureSetChannel(
    canvasTexture: RID,
    channel: CanvasTextureChannel,
    texture: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasTexture, LONG to channel.id, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasTextureSetChannelPtr, NIL)
  }

  /**
   * Sets the [baseColor] and [shininess] to use for the canvas texture specified by the
   * [canvasTexture] RID. Equivalent to [CanvasTexture.specularColor] and
   * [CanvasTexture.specularShininess].
   */
  public fun canvasTextureSetShadingParameters(
    canvasTexture: RID,
    baseColor: Color,
    shininess: Float,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasTexture, COLOR to baseColor, DOUBLE to shininess.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasTextureSetShadingParametersPtr, NIL)
  }

  /**
   * Sets the texture [filter] mode to use for the canvas texture specified by the [canvasTexture]
   * RID.
   */
  public fun canvasTextureSetTextureFilter(canvasTexture: RID, filter: CanvasItemTextureFilter):
      Unit {
    TransferContext.writeArguments(_RID to canvasTexture, LONG to filter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasTextureSetTextureFilterPtr, NIL)
  }

  /**
   * Sets the texture [repeat] mode to use for the canvas texture specified by the [canvasTexture]
   * RID.
   */
  public fun canvasTextureSetTextureRepeat(canvasTexture: RID, repeat: CanvasItemTextureRepeat):
      Unit {
    TransferContext.writeArguments(_RID to canvasTexture, LONG to repeat.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasTextureSetTextureRepeatPtr, NIL)
  }

  /**
   * Creates a new CanvasItem instance and returns its [RID]. It can be accessed with the RID that
   * is returned. This RID will be used in all `canvas_item_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent node is [CanvasItem].
   */
  public fun canvasItemCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets a parent [CanvasItem] to the [CanvasItem]. The item will inherit transform, modulation and
   * visibility from its parent, like [CanvasItem] nodes in the scene tree.
   */
  public fun canvasItemSetParent(item: RID, parent: RID): Unit {
    TransferContext.writeArguments(_RID to item, _RID to parent)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetParentPtr, NIL)
  }

  /**
   * Sets the default texture filter mode for the canvas item specified by the [item] RID.
   * Equivalent to [CanvasItem.textureFilter].
   */
  public fun canvasItemSetDefaultTextureFilter(item: RID, filter: CanvasItemTextureFilter): Unit {
    TransferContext.writeArguments(_RID to item, LONG to filter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetDefaultTextureFilterPtr, NIL)
  }

  /**
   * Sets the default texture repeat mode for the canvas item specified by the [item] RID.
   * Equivalent to [CanvasItem.textureRepeat].
   */
  public fun canvasItemSetDefaultTextureRepeat(item: RID, repeat: CanvasItemTextureRepeat): Unit {
    TransferContext.writeArguments(_RID to item, LONG to repeat.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetDefaultTextureRepeatPtr, NIL)
  }

  /**
   * Sets the visibility of the [CanvasItem].
   */
  public fun canvasItemSetVisible(item: RID, visible: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to visible)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetVisiblePtr, NIL)
  }

  /**
   * Sets the light [mask] for the canvas item specified by the [item] RID. Equivalent to
   * [CanvasItem.lightMask].
   */
  public fun canvasItemSetLightMask(item: RID, mask: Int): Unit {
    TransferContext.writeArguments(_RID to item, LONG to mask.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetLightMaskPtr, NIL)
  }

  /**
   * Sets the rendering visibility layer associated with this [CanvasItem]. Only [Viewport] nodes
   * with a matching rendering mask will render this [CanvasItem].
   */
  public fun canvasItemSetVisibilityLayer(item: RID, visibilityLayer: Long): Unit {
    TransferContext.writeArguments(_RID to item, LONG to visibilityLayer)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetVisibilityLayerPtr, NIL)
  }

  /**
   * Sets the [transform] of the canvas item specified by the [item] RID. This affects where and how
   * the item will be drawn. Child canvas items' transforms are multiplied by their parent's transform.
   * Equivalent to [Node2D.transform].
   */
  public fun canvasItemSetTransform(item: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to item, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetTransformPtr, NIL)
  }

  /**
   * If [clip] is `true`, makes the canvas item specified by the [item] RID not draw anything
   * outside of its rect's coordinates. This clipping is fast, but works only with axis-aligned
   * rectangles. This means that rotation is ignored by the clipping rectangle. For more advanced
   * clipping shapes, use [canvasItemSetCanvasGroupMode] instead.
   * **Note:** The equivalent node functionality is found in [Label.clipText], [RichTextLabel]
   * (always enabled) and more.
   */
  public fun canvasItemSetClip(item: RID, clip: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to clip)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetClipPtr, NIL)
  }

  /**
   * If [enabled] is `true`, enables multichannel signed distance field rendering mode for the
   * canvas item specified by the [item] RID. This is meant to be used for font rendering, or with
   * specially generated images using [url=https://github.com/Chlumsky/msdfgen]msdfgen[/url].
   */
  public fun canvasItemSetDistanceFieldMode(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetDistanceFieldModePtr, NIL)
  }

  /**
   * If [useCustomRect] is `true`, sets the custom visibility rectangle (used for culling) to [rect]
   * for the canvas item specified by [item]. Setting a custom visibility rect can reduce CPU load when
   * drawing lots of 2D instances. If [useCustomRect] is `false`, automatically computes a visibility
   * rectangle based on the canvas item's draw commands.
   */
  @JvmOverloads
  public fun canvasItemSetCustomRect(
    item: RID,
    useCustomRect: Boolean,
    rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
  ): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to useCustomRect, RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetCustomRectPtr, NIL)
  }

  /**
   * Multiplies the color of the canvas item specified by the [item] RID, while affecting its
   * children. See also [canvasItemSetSelfModulate]. Equivalent to [CanvasItem.modulate].
   */
  public fun canvasItemSetModulate(item: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to item, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetModulatePtr, NIL)
  }

  /**
   * Multiplies the color of the canvas item specified by the [item] RID, without affecting its
   * children. See also [canvasItemSetModulate]. Equivalent to [CanvasItem.selfModulate].
   */
  public fun canvasItemSetSelfModulate(item: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to item, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetSelfModulatePtr, NIL)
  }

  /**
   * If [enabled] is `true`, draws the canvas item specified by the [item] RID behind its parent.
   * Equivalent to [CanvasItem.showBehindParent].
   */
  public fun canvasItemSetDrawBehindParent(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetDrawBehindParentPtr, NIL)
  }

  /**
   * Draws a line on the [CanvasItem] pointed to by the [item] [RID]. See also
   * [CanvasItem.drawLine].
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
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddLinePtr, NIL)
  }

  /**
   * Draws a 2D polyline on the [CanvasItem] pointed to by the [item] [RID]. See also
   * [CanvasItem.drawPolyline] and [CanvasItem.drawPolylineColors].
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
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddPolylinePtr, NIL)
  }

  /**
   * Draws a 2D multiline on the [CanvasItem] pointed to by the [item] [RID]. See also
   * [CanvasItem.drawMultiline] and [CanvasItem.drawMultilineColors].
   */
  @JvmOverloads
  public fun canvasItemAddMultiline(
    item: RID,
    points: PackedVector2Array,
    colors: PackedColorArray,
    width: Float = -1.0f,
  ): Unit {
    TransferContext.writeArguments(_RID to item, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, DOUBLE to width.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddMultilinePtr, NIL)
  }

  /**
   * Draws a rectangle on the [CanvasItem] pointed to by the [item] [RID]. See also
   * [CanvasItem.drawRect].
   */
  public fun canvasItemAddRect(
    item: RID,
    rect: Rect2,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddRectPtr, NIL)
  }

  /**
   * Draws a circle on the [CanvasItem] pointed to by the [item] [RID]. See also
   * [CanvasItem.drawCircle].
   */
  public fun canvasItemAddCircle(
    item: RID,
    pos: Vector2,
    radius: Float,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(_RID to item, VECTOR2 to pos, DOUBLE to radius.toDouble(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddCirclePtr, NIL)
  }

  /**
   * Draws a 2D textured rectangle on the [CanvasItem] pointed to by the [item] [RID]. See also
   * [CanvasItem.drawTextureRect] and [Texture2D.drawRect].
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
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddTextureRectPtr, NIL)
  }

  /**
   * See also [CanvasItem.drawMsdfTextureRectRegion].
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
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddMsdfTextureRectRegionPtr, NIL)
  }

  /**
   * See also [CanvasItem.drawLcdTextureRectRegion].
   */
  public fun canvasItemAddLcdTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color,
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, RECT2 to srcRect, COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddLcdTextureRectRegionPtr, NIL)
  }

  /**
   * Draws the specified region of a 2D textured rectangle on the [CanvasItem] pointed to by the
   * [item] [RID]. See also [CanvasItem.drawTextureRectRegion] and [Texture2D.drawRectRegion].
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
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddTextureRectRegionPtr, NIL)
  }

  /**
   * Draws a nine-patch rectangle on the [CanvasItem] pointed to by the [item] [RID].
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
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddNinePatchPtr, NIL)
  }

  /**
   * Draws a 2D primitive on the [CanvasItem] pointed to by the [item] [RID]. See also
   * [CanvasItem.drawPrimitive].
   */
  public fun canvasItemAddPrimitive(
    item: RID,
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array,
    texture: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to item, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddPrimitivePtr, NIL)
  }

  /**
   * Draws a 2D polygon on the [CanvasItem] pointed to by the [item] [RID]. If you need more
   * flexibility (such as being able to use bones), use [canvasItemAddTriangleArray] instead. See also
   * [CanvasItem.drawPolygon].
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
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddPolygonPtr, NIL)
  }

  /**
   * Draws a triangle array on the [CanvasItem] pointed to by the [item] [RID]. This is internally
   * used by [Line2D] and [StyleBoxFlat] for rendering. [canvasItemAddTriangleArray] is highly
   * flexible, but more complex to use than [canvasItemAddPolygon].
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
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddTriangleArrayPtr, NIL)
  }

  /**
   * Draws a mesh created with [meshCreate] with given [transform], [modulate] color, and [texture].
   * This is used internally by [MeshInstance2D].
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
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddMeshPtr, NIL)
  }

  /**
   * Draws a 2D [MultiMesh] on the [CanvasItem] pointed to by the [item] [RID]. See also
   * [CanvasItem.drawMultimesh].
   */
  @JvmOverloads
  public fun canvasItemAddMultimesh(
    item: RID,
    mesh: RID,
    texture: RID = RID(),
  ): Unit {
    TransferContext.writeArguments(_RID to item, _RID to mesh, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddMultimeshPtr, NIL)
  }

  /**
   * Draws particles on the [CanvasItem] pointed to by the [item] [RID].
   */
  public fun canvasItemAddParticles(
    item: RID,
    particles: RID,
    texture: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to item, _RID to particles, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddParticlesPtr, NIL)
  }

  /**
   * Sets a [Transform2D] that will be used to transform subsequent canvas item commands.
   */
  public fun canvasItemAddSetTransform(item: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to item, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddSetTransformPtr, NIL)
  }

  /**
   * If [ignore] is `true`, ignore clipping on items drawn with this canvas item until this is
   * called again with [ignore] set to false.
   */
  public fun canvasItemAddClipIgnore(item: RID, ignore: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to ignore)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddClipIgnorePtr, NIL)
  }

  /**
   * Subsequent drawing commands will be ignored unless they fall within the specified animation
   * slice. This is a faster way to implement animations that loop on background rather than redrawing
   * constantly.
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
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddAnimationSlicePtr, NIL)
  }

  /**
   * If [enabled] is `true`, child nodes with the lowest Y position are drawn before those with a
   * higher Y position. Y-sorting only affects children that inherit from the canvas item specified by
   * the [item] RID, not the canvas item itself. Equivalent to [CanvasItem.ySortEnabled].
   */
  public fun canvasItemSetSortChildrenByY(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetSortChildrenByYPtr, NIL)
  }

  /**
   * Sets the [CanvasItem]'s Z index, i.e. its draw order (lower indexes are drawn first).
   */
  public fun canvasItemSetZIndex(item: RID, zIndex: Int): Unit {
    TransferContext.writeArguments(_RID to item, LONG to zIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetZIndexPtr, NIL)
  }

  /**
   * If this is enabled, the Z index of the parent will be added to the children's Z index.
   */
  public fun canvasItemSetZAsRelativeToParent(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetZAsRelativeToParentPtr, NIL)
  }

  /**
   * Sets the [CanvasItem] to copy a rect to the backbuffer.
   */
  public fun canvasItemSetCopyToBackbuffer(
    item: RID,
    enabled: Boolean,
    rect: Rect2,
  ): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled, RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetCopyToBackbufferPtr, NIL)
  }

  /**
   * Clears the [CanvasItem] and removes all commands in it.
   */
  public fun canvasItemClear(item: RID): Unit {
    TransferContext.writeArguments(_RID to item)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemClearPtr, NIL)
  }

  /**
   * Sets the index for the [CanvasItem].
   */
  public fun canvasItemSetDrawIndex(item: RID, index: Int): Unit {
    TransferContext.writeArguments(_RID to item, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetDrawIndexPtr, NIL)
  }

  /**
   * Sets a new [material] to the canvas item specified by the [item] RID. Equivalent to
   * [CanvasItem.material].
   */
  public fun canvasItemSetMaterial(item: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to item, _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetMaterialPtr, NIL)
  }

  /**
   * Sets if the [CanvasItem] uses its parent's material.
   */
  public fun canvasItemSetUseParentMaterial(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetUseParentMaterialPtr, NIL)
  }

  /**
   * Sets the given [CanvasItem] as visibility notifier. [area] defines the area of detecting
   * visibility. [enterCallable] is called when the [CanvasItem] enters the screen, [exitCallable] is
   * called when the [CanvasItem] exits the screen. If [enable] is `false`, the item will no longer
   * function as notifier.
   * This method can be used to manually mimic [VisibleOnScreenNotifier2D].
   */
  public fun canvasItemSetVisibilityNotifier(
    item: RID,
    enable: Boolean,
    area: Rect2,
    enterCallable: Callable,
    exitCallable: Callable,
  ): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enable, RECT2 to area, CALLABLE to enterCallable, CALLABLE to exitCallable)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetVisibilityNotifierPtr, NIL)
  }

  /**
   * Sets the canvas group mode used during 2D rendering for the canvas item specified by the [item]
   * RID. For faster but more limited clipping, use [canvasItemSetClip] instead.
   * **Note:** The equivalent node functionality is found in [CanvasGroup] and
   * [CanvasItem.clipChildren].
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
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetCanvasGroupModePtr, NIL)
  }

  /**
   * Returns the bounding rectangle for a canvas item in local space, as calculated by the renderer.
   * This bound is used internally for culling.
   * **Warning:** This function is intended for debugging in the editor, and will pass through and
   * return a zero [Rect2] in exported projects.
   */
  public fun debugCanvasItemGetRect(item: RID): Rect2 {
    TransferContext.writeArguments(_RID to item)
    TransferContext.callMethod(rawPtr, MethodBindings.debugCanvasItemGetRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Creates a canvas light and adds it to the RenderingServer. It can be accessed with the RID that
   * is returned. This RID will be used in all `canvas_light_*` RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent node is [Light2D].
   */
  public fun canvasLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Attaches the canvas light to the canvas. Removes it from its previous canvas.
   */
  public fun canvasLightAttachToCanvas(light: RID, canvas: RID): Unit {
    TransferContext.writeArguments(_RID to light, _RID to canvas)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightAttachToCanvasPtr, NIL)
  }

  /**
   * Enables or disables a canvas light.
   */
  public fun canvasLightSetEnabled(light: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetEnabledPtr, NIL)
  }

  /**
   * Sets the scale factor of a [PointLight2D]'s texture. Equivalent to [PointLight2D.textureScale].
   */
  public fun canvasLightSetTextureScale(light: RID, scale: Float): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetTextureScalePtr, NIL)
  }

  /**
   * Sets the canvas light's [Transform2D].
   */
  public fun canvasLightSetTransform(light: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to light, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetTransformPtr, NIL)
  }

  /**
   * Sets the texture to be used by a [PointLight2D]. Equivalent to [PointLight2D.texture].
   */
  public fun canvasLightSetTexture(light: RID, texture: RID): Unit {
    TransferContext.writeArguments(_RID to light, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetTexturePtr, NIL)
  }

  /**
   * Sets the offset of a [PointLight2D]'s texture. Equivalent to [PointLight2D.offset].
   */
  public fun canvasLightSetTextureOffset(light: RID, offset: Vector2): Unit {
    TransferContext.writeArguments(_RID to light, VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetTextureOffsetPtr, NIL)
  }

  /**
   * Sets the color for a light.
   */
  public fun canvasLightSetColor(light: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetColorPtr, NIL)
  }

  /**
   * Sets a canvas light's height.
   */
  public fun canvasLightSetHeight(light: RID, height: Float): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to height.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetHeightPtr, NIL)
  }

  /**
   * Sets a canvas light's energy.
   */
  public fun canvasLightSetEnergy(light: RID, energy: Float): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to energy.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetEnergyPtr, NIL)
  }

  /**
   * Sets the Z range of objects that will be affected by this light. Equivalent to
   * [Light2D.rangeZMin] and [Light2D.rangeZMax].
   */
  public fun canvasLightSetZRange(
    light: RID,
    minZ: Int,
    maxZ: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to light, LONG to minZ.toLong(), LONG to maxZ.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetZRangePtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetLayerRangePtr, NIL)
  }

  /**
   * The light mask. See [LightOccluder2D] for more information on light masks.
   */
  public fun canvasLightSetItemCullMask(light: RID, mask: Int): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mask.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetItemCullMaskPtr, NIL)
  }

  /**
   * The binary mask used to determine which layers this canvas light's shadows affects. See
   * [LightOccluder2D] for more information on light masks.
   */
  public fun canvasLightSetItemShadowCullMask(light: RID, mask: Int): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mask.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetItemShadowCullMaskPtr, NIL)
  }

  /**
   * The mode of the light, see [CanvasLightMode] constants.
   */
  public fun canvasLightSetMode(light: RID, mode: CanvasLightMode): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetModePtr, NIL)
  }

  /**
   * Enables or disables the canvas light's shadow.
   */
  public fun canvasLightSetShadowEnabled(light: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetShadowEnabledPtr, NIL)
  }

  /**
   * Sets the canvas light's shadow's filter, see [CanvasLightShadowFilter] constants.
   */
  public fun canvasLightSetShadowFilter(light: RID, filter: CanvasLightShadowFilter): Unit {
    TransferContext.writeArguments(_RID to light, LONG to filter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetShadowFilterPtr, NIL)
  }

  /**
   * Sets the color of the canvas light's shadow.
   */
  public fun canvasLightSetShadowColor(light: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetShadowColorPtr, NIL)
  }

  /**
   * Smoothens the shadow. The lower, the smoother.
   */
  public fun canvasLightSetShadowSmooth(light: RID, smooth: Float): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to smooth.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetShadowSmoothPtr, NIL)
  }

  /**
   * Sets the blend mode for the given canvas light. See [CanvasLightBlendMode] for options.
   * Equivalent to [Light2D.blendMode].
   */
  public fun canvasLightSetBlendMode(light: RID, mode: CanvasLightBlendMode): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetBlendModePtr, NIL)
  }

  /**
   * Creates a light occluder and adds it to the RenderingServer. It can be accessed with the RID
   * that is returned. This RID will be used in all `canvas_light_occluder_*` RenderingServer
   * functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent node is [LightOccluder2D].
   */
  public fun canvasLightOccluderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightOccluderCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Attaches a light occluder to the canvas. Removes it from its previous canvas.
   */
  public fun canvasLightOccluderAttachToCanvas(occluder: RID, canvas: RID): Unit {
    TransferContext.writeArguments(_RID to occluder, _RID to canvas)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightOccluderAttachToCanvasPtr, NIL)
  }

  /**
   * Enables or disables light occluder.
   */
  public fun canvasLightOccluderSetEnabled(occluder: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to occluder, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightOccluderSetEnabledPtr, NIL)
  }

  /**
   * Sets a light occluder's polygon.
   */
  public fun canvasLightOccluderSetPolygon(occluder: RID, polygon: RID): Unit {
    TransferContext.writeArguments(_RID to occluder, _RID to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightOccluderSetPolygonPtr, NIL)
  }

  public fun canvasLightOccluderSetAsSdfCollision(occluder: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to occluder, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightOccluderSetAsSdfCollisionPtr, NIL)
  }

  /**
   * Sets a light occluder's [Transform2D].
   */
  public fun canvasLightOccluderSetTransform(occluder: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to occluder, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightOccluderSetTransformPtr, NIL)
  }

  /**
   * The light mask. See [LightOccluder2D] for more information on light masks.
   */
  public fun canvasLightOccluderSetLightMask(occluder: RID, mask: Int): Unit {
    TransferContext.writeArguments(_RID to occluder, LONG to mask.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightOccluderSetLightMaskPtr, NIL)
  }

  /**
   * Creates a new light occluder polygon and adds it to the RenderingServer. It can be accessed
   * with the RID that is returned. This RID will be used in all `canvas_occluder_polygon_*`
   * RenderingServer functions.
   * Once finished with your RID, you will want to free the RID using the RenderingServer's
   * [freeRid] method.
   * **Note:** The equivalent resource is [OccluderPolygon2D].
   */
  public fun canvasOccluderPolygonCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canvasOccluderPolygonCreatePtr, _RID)
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
    TransferContext.callMethod(rawPtr, MethodBindings.canvasOccluderPolygonSetShapePtr, NIL)
  }

  /**
   * Sets an occluder polygons cull mode. See [CanvasOccluderPolygonCullMode] constants.
   */
  public fun canvasOccluderPolygonSetCullMode(occluderPolygon: RID,
      mode: CanvasOccluderPolygonCullMode): Unit {
    TransferContext.writeArguments(_RID to occluderPolygon, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasOccluderPolygonSetCullModePtr, NIL)
  }

  /**
   * Sets the [ProjectSettings.rendering/2d/shadowAtlas/size] to use for [Light2D] shadow rendering
   * (in pixels). The value is rounded up to the nearest power of 2.
   */
  public fun canvasSetShadowTextureSize(size: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasSetShadowTextureSizePtr, NIL)
  }

  /**
   * Creates a new global shader uniform.
   * **Note:** Global shader parameter names are case-sensitive.
   */
  public fun globalShaderParameterAdd(
    name: StringName,
    type: GlobalShaderParameterType,
    defaultValue: Any?,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to type.id, ANY to defaultValue)
    TransferContext.callMethod(rawPtr, MethodBindings.globalShaderParameterAddPtr, NIL)
  }

  /**
   * Removes the global shader uniform specified by [name].
   */
  public fun globalShaderParameterRemove(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.globalShaderParameterRemovePtr, NIL)
  }

  /**
   * Returns the list of global shader uniform names.
   * **Note:** [globalShaderParameterGet] has a large performance penalty as the rendering thread
   * needs to synchronize with the calling thread, which is slow. Do not use this method during
   * gameplay to avoid stuttering. If you need to read values in a script after setting them, consider
   * creating an autoload where you store the values you need to query at the same time you're setting
   * them as global parameters.
   */
  public fun globalShaderParameterGetList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.globalShaderParameterGetListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  /**
   * Sets the global shader uniform [name] to [value].
   */
  public fun globalShaderParameterSet(name: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.globalShaderParameterSetPtr, NIL)
  }

  /**
   * Overrides the global shader uniform [name] with [value]. Equivalent to the
   * [ShaderGlobalsOverride] node.
   */
  public fun globalShaderParameterSetOverride(name: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.globalShaderParameterSetOverridePtr, NIL)
  }

  /**
   * Returns the value of the global shader uniform specified by [name].
   * **Note:** [globalShaderParameterGet] has a large performance penalty as the rendering thread
   * needs to synchronize with the calling thread, which is slow. Do not use this method during
   * gameplay to avoid stuttering. If you need to read values in a script after setting them, consider
   * creating an autoload where you store the values you need to query at the same time you're setting
   * them as global parameters.
   */
  public fun globalShaderParameterGet(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.globalShaderParameterGetPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns the type associated to the global shader uniform specified by [name].
   * **Note:** [globalShaderParameterGet] has a large performance penalty as the rendering thread
   * needs to synchronize with the calling thread, which is slow. Do not use this method during
   * gameplay to avoid stuttering. If you need to read values in a script after setting them, consider
   * creating an autoload where you store the values you need to query at the same time you're setting
   * them as global parameters.
   */
  public fun globalShaderParameterGetType(name: StringName): GlobalShaderParameterType {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.globalShaderParameterGetTypePtr, LONG)
    return RenderingServer.GlobalShaderParameterType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Tries to free an object in the RenderingServer. To avoid memory leaks, this should be called
   * after using an object as memory management does not occur automatically when using RenderingServer
   * directly.
   */
  public fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.freeRidPtr, NIL)
  }

  /**
   * Schedules a callback to the given callable after a frame has been drawn.
   */
  public fun requestFrameDrawnCallback(callable: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.requestFrameDrawnCallbackPtr, NIL)
  }

  /**
   * Returns `true` if changes have been made to the RenderingServer's data. [forceDraw] is usually
   * called if this happens.
   */
  public fun hasChanged(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasChangedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns a statistic about the rendering engine which can be used for performance profiling. See
   * [RenderingServer.RenderingInfo] for a list of values that can be queried. See also
   * [viewportGetRenderInfo], which returns information specific to a viewport.
   * **Note:** Only 3D rendering is currently taken into account by some of these values, such as
   * the number of draw calls.
   * **Note:** Rendering information is not available until at least 2 frames have been rendered by
   * the engine. If rendering information is not available, [getRenderingInfo] returns `0`. To print
   * rendering information in `_ready()` successfully, use the following:
   * [codeblock]
   * func _ready():
   *     for _i in 2:
   *         await get_tree().process_frame
   *
   *     print(RenderingServer.get_rendering_info(RENDERING_INFO_TOTAL_DRAW_CALLS_IN_FRAME))
   * [/codeblock]
   */
  public fun getRenderingInfo(info: RenderingInfo): Long {
    TransferContext.writeArguments(LONG to info.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getRenderingInfoPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the name of the video adapter (e.g. "GeForce GTX 1080/PCIe/SSE2").
   * **Note:** When running a headless or server binary, this function returns an empty string.
   * **Note:** On the web platform, some browsers such as Firefox may report a different, fixed GPU
   * name such as "GeForce GTX 980" (regardless of the user's actual GPU model). This is done to make
   * fingerprinting more difficult.
   */
  public fun getVideoAdapterName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVideoAdapterNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the vendor of the video adapter (e.g. "NVIDIA Corporation").
   * **Note:** When running a headless or server binary, this function returns an empty string.
   */
  public fun getVideoAdapterVendor(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVideoAdapterVendorPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the type of the video adapter. Since dedicated graphics cards from a given generation
   * will *usually* be significantly faster than integrated graphics made in the same generation, the
   * device type can be used as a basis for automatic graphics settings adjustment. However, this is
   * not always true, so make sure to provide users with a way to manually override graphics settings.
   * **Note:** When using the OpenGL backend or when running in headless mode, this function always
   * returns [RenderingDevice.DEVICE_TYPE_OTHER].
   */
  public fun getVideoAdapterType(): RenderingDevice.DeviceType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVideoAdapterTypePtr, LONG)
    return RenderingDevice.DeviceType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the version of the graphics video adapter *currently in use* (e.g. "1.2.189" for
   * Vulkan, "3.3.0 NVIDIA 510.60.02" for OpenGL). This version may be different from the actual latest
   * version supported by the hardware, as Godot may not always request the latest version. See also
   * [OS.getVideoAdapterDriverInfo].
   * **Note:** When running a headless or server binary, this function returns an empty string.
   */
  public fun getVideoAdapterApiVersion(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVideoAdapterApiVersionPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a mesh of a sphere with the given number of horizontal subdivisions, vertical
   * subdivisions and radius. See also [getTestCube].
   */
  public fun makeSphereMesh(
    latitudes: Int,
    longitudes: Int,
    radius: Float,
  ): RID {
    TransferContext.writeArguments(LONG to latitudes.toLong(), LONG to longitudes.toLong(), DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.makeSphereMeshPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the RID of the test cube. This mesh will be created and returned on the first call to
   * [getTestCube], then it will be cached for subsequent calls. See also [makeSphereMesh].
   */
  public fun getTestCube(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTestCubePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the RID of a 256×256 texture with a testing pattern on it (in [Image.FORMAT_RGB8]
   * format). This texture will be created and returned on the first call to [getTestTexture], then it
   * will be cached for subsequent calls. See also [getWhiteTexture].
   * Example of getting the test texture and applying it to a [Sprite2D] node:
   * [codeblock]
   * var texture_rid = RenderingServer.get_test_texture()
   * var texture = ImageTexture.create_from_image(RenderingServer.texture_2d_get(texture_rid))
   * $Sprite2D.texture = texture
   * [/codeblock]
   */
  public fun getTestTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTestTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the ID of a 4×4 white texture (in [Image.FORMAT_RGB8] format). This texture will be
   * created and returned on the first call to [getWhiteTexture], then it will be cached for subsequent
   * calls. See also [getTestTexture].
   * Example of getting the white texture and applying it to a [Sprite2D] node:
   * [codeblock]
   * var texture_rid = RenderingServer.get_white_texture()
   * var texture = ImageTexture.create_from_image(RenderingServer.texture_2d_get(texture_rid))
   * $Sprite2D.texture = texture
   * [/codeblock]
   */
  public fun getWhiteTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWhiteTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets a boot image. The color defines the background color. If [scale] is `true`, the image will
   * be scaled to fit the screen size. If [useFilter] is `true`, the image will be scaled with linear
   * interpolation. If [useFilter] is `false`, the image will be scaled with nearest-neighbor
   * interpolation.
   */
  @JvmOverloads
  public fun setBootImage(
    image: Image,
    color: Color,
    scale: Boolean,
    useFilter: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, COLOR to color, BOOL to scale, BOOL to useFilter)
    TransferContext.callMethod(rawPtr, MethodBindings.setBootImagePtr, NIL)
  }

  /**
   * Returns the default clear color which is used when a specific clear color has not been
   * selected. See also [setDefaultClearColor].
   */
  public fun getDefaultClearColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDefaultClearColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Sets the default clear color which is used when a specific clear color has not been selected.
   * See also [getDefaultClearColor].
   */
  public fun setDefaultClearColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setDefaultClearColorPtr, NIL)
  }

  /**
   * Not yet implemented. Always returns `false`.
   */
  public fun hasFeature(feature: Features): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(rawPtr, MethodBindings.hasFeaturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the OS supports a certain [feature]. Features might be `s3tc`, `etc`, and
   * `etc2`.
   */
  public fun hasOsFeature(feature: String): Boolean {
    TransferContext.writeArguments(STRING to feature)
    TransferContext.callMethod(rawPtr, MethodBindings.hasOsFeaturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * This method is currently unimplemented and does nothing if called with [generate] set to
   * `true`.
   */
  public fun setDebugGenerateWireframes(generate: Boolean): Unit {
    TransferContext.writeArguments(BOOL to generate)
    TransferContext.callMethod(rawPtr, MethodBindings.setDebugGenerateWireframesPtr, NIL)
  }

  public fun isRenderLoopEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isRenderLoopEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setRenderLoopEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setRenderLoopEnabledPtr, NIL)
  }

  /**
   * Returns the time taken to setup rendering on the CPU in milliseconds. This value is shared
   * across all viewports and does *not* require [viewportSetMeasureRenderTime] to be enabled on a
   * viewport to be queried. See also [viewportGetMeasuredRenderTimeCpu].
   */
  public fun getFrameSetupTimeCpu(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFrameSetupTimeCpuPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Forces a synchronization between the CPU and GPU, which may be required in certain cases. Only
   * call this when needed, as CPU-GPU synchronization has a performance cost.
   */
  public fun forceSync(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceSyncPtr, NIL)
  }

  /**
   * Forces redrawing of all viewports at once. Must be called from the main thread.
   */
  @JvmOverloads
  public fun forceDraw(swapBuffers: Boolean = true, frameStep: Double = 0.0): Unit {
    TransferContext.writeArguments(BOOL to swapBuffers, DOUBLE to frameStep)
    TransferContext.callMethod(rawPtr, MethodBindings.forceDrawPtr, NIL)
  }

  /**
   * Returns the global RenderingDevice.
   * **Note:** When using the OpenGL backend or when running in headless mode, this function always
   * returns `null`.
   */
  public fun getRenderingDevice(): RenderingDevice? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRenderingDevicePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as RenderingDevice?)
  }

  /**
   * Creates a RenderingDevice that can be used to do draw and compute operations on a separate
   * thread. Cannot draw to the screen nor share data with the global RenderingDevice.
   * **Note:** When using the OpenGL backend or when running in headless mode, this function always
   * returns `null`.
   */
  public fun createLocalRenderingDevice(): RenderingDevice? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createLocalRenderingDevicePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as RenderingDevice?)
  }

  /**
   * As the RenderingServer actual logic may run on an separate thread, accessing its internals from
   * the main (or any other) thread will result in errors. To make it easier to run code that can
   * safely access the rendering internals (such as [RenderingDevice] and similar RD classes), push a
   * callable via this function so it will be executed on the render thread.
   */
  public fun callOnRenderThread(callable: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.callOnRenderThreadPtr, NIL)
  }

  public enum class TextureLayeredType(
    id: Long,
  ) {
    /**
     * Array of 2-dimensional textures (see [Texture2DArray]).
     */
    TEXTURE_LAYERED_2D_ARRAY(0),
    /**
     * Cubemap texture (see [Cubemap]).
     */
    TEXTURE_LAYERED_CUBEMAP(1),
    /**
     * Array of cubemap textures (see [CubemapArray]).
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
     * Left face of a [Cubemap].
     */
    CUBEMAP_LAYER_LEFT(0),
    /**
     * Right face of a [Cubemap].
     */
    CUBEMAP_LAYER_RIGHT(1),
    /**
     * Bottom face of a [Cubemap].
     */
    CUBEMAP_LAYER_BOTTOM(2),
    /**
     * Top face of a [Cubemap].
     */
    CUBEMAP_LAYER_TOP(3),
    /**
     * Front face of a [Cubemap].
     */
    CUBEMAP_LAYER_FRONT(4),
    /**
     * Back face of a [Cubemap].
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
     * Represents the size of the [ShaderMode] enum.
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
     * Represents the size of the [ArrayType] enum.
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
     * Custom data array contains 8-bit-per-channel red/green/blue/alpha color data. Values are
     * normalized, unsigned floating-point in the `[0.0, 1.0]` range.
     */
    ARRAY_CUSTOM_RGBA8_UNORM(0),
    /**
     * Custom data array contains 8-bit-per-channel red/green/blue/alpha color data. Values are
     * normalized, signed floating-point in the `[-1.0, 1.0]` range.
     */
    ARRAY_CUSTOM_RGBA8_SNORM(1),
    /**
     * Custom data array contains 16-bit-per-channel red/green color data. Values are floating-point
     * in half precision.
     */
    ARRAY_CUSTOM_RG_HALF(2),
    /**
     * Custom data array contains 16-bit-per-channel red/green/blue/alpha color data. Values are
     * floating-point in half precision.
     */
    ARRAY_CUSTOM_RGBA_HALF(3),
    /**
     * Custom data array contains 32-bit-per-channel red color data. Values are floating-point in
     * single precision.
     */
    ARRAY_CUSTOM_R_FLOAT(4),
    /**
     * Custom data array contains 32-bit-per-channel red/green color data. Values are floating-point
     * in single precision.
     */
    ARRAY_CUSTOM_RG_FLOAT(5),
    /**
     * Custom data array contains 32-bit-per-channel red/green/blue color data. Values are
     * floating-point in single precision.
     */
    ARRAY_CUSTOM_RGB_FLOAT(6),
    /**
     * Custom data array contains 32-bit-per-channel red/green/blue/alpha color data. Values are
     * floating-point in single precision.
     */
    ARRAY_CUSTOM_RGBA_FLOAT(7),
    /**
     * Represents the size of the [ArrayCustomFormat] enum.
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

      public val ARRAY_FLAG_COMPRESS_ATTRIBUTES: ArrayFormat = ArrayFormatValue(536870912)

      public val ARRAY_FLAG_FORMAT_VERSION_BASE: ArrayFormat = ArrayFormatValue(35)

      public val ARRAY_FLAG_FORMAT_VERSION_SHIFT: ArrayFormat = ArrayFormatValue(35)

      public val ARRAY_FLAG_FORMAT_VERSION_1: ArrayFormat = ArrayFormatValue(0)

      public val ARRAY_FLAG_FORMAT_VERSION_2: ArrayFormat = ArrayFormatValue(34359738368)

      public val ARRAY_FLAG_FORMAT_CURRENT_VERSION: ArrayFormat = ArrayFormatValue(34359738368)

      public val ARRAY_FLAG_FORMAT_VERSION_MASK: ArrayFormat = ArrayFormatValue(255)
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
     * Primitive to draw consists of a triangle strip (the last 3 vertices are always combined to
     * make a triangle).
     */
    PRIMITIVE_TRIANGLE_STRIP(4),
    /**
     * Represents the size of the [PrimitiveType] enum.
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
     * Use [Transform2D] to store MultiMesh transform.
     */
    MULTIMESH_TRANSFORM_2D(0),
    /**
     * Use [Transform3D] to store MultiMesh transform.
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
     * Nearest-neighbor filter for light projectors (use for pixel art light projectors). No mipmaps
     * are used for rendering, which means light projectors at a distance will look sharp but grainy.
     * This has roughly the same performance cost as using mipmaps.
     */
    LIGHT_PROJECTOR_FILTER_NEAREST(0),
    /**
     * Linear filter for light projectors (use for non-pixel art light projectors). No mipmaps are
     * used for rendering, which means light projectors at a distance will look smooth but blurry. This
     * has roughly the same performance cost as using mipmaps.
     */
    LIGHT_PROJECTOR_FILTER_LINEAR(1),
    /**
     * Nearest-neighbor filter for light projectors (use for pixel art light projectors). Isotropic
     * mipmaps are used for rendering, which means light projectors at a distance will look smooth but
     * blurry. This has roughly the same performance cost as not using mipmaps.
     */
    LIGHT_PROJECTOR_FILTER_NEAREST_MIPMAPS(2),
    /**
     * Linear filter for light projectors (use for non-pixel art light projectors). Isotropic
     * mipmaps are used for rendering, which means light projectors at a distance will look smooth but
     * blurry. This has roughly the same performance cost as not using mipmaps.
     */
    LIGHT_PROJECTOR_FILTER_LINEAR_MIPMAPS(3),
    /**
     * Nearest-neighbor filter for light projectors (use for pixel art light projectors).
     * Anisotropic mipmaps are used for rendering, which means light projectors at a distance will look
     * smooth and sharp when viewed from oblique angles. This looks better compared to isotropic
     * mipmaps, but is slower. The level of anisotropic filtering is defined by
     * [ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     */
    LIGHT_PROJECTOR_FILTER_NEAREST_MIPMAPS_ANISOTROPIC(4),
    /**
     * Linear filter for light projectors (use for non-pixel art light projectors). Anisotropic
     * mipmaps are used for rendering, which means light projectors at a distance will look smooth and
     * sharp when viewed from oblique angles. This looks better compared to isotropic mipmaps, but is
     * slower. The level of anisotropic filtering is defined by
     * [ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
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
     * Directional (sun/moon) light (see [DirectionalLight3D]).
     */
    LIGHT_DIRECTIONAL(0),
    /**
     * Omni light (see [OmniLight3D]).
     */
    LIGHT_OMNI(1),
    /**
     * Spot light (see [SpotLight3D]).
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
     * The light's indirect energy multiplier (final indirect energy is [LIGHT_PARAM_ENERGY] *
     * [LIGHT_PARAM_INDIRECT_ENERGY]).
     */
    LIGHT_PARAM_INDIRECT_ENERGY(1),
    /**
     * The light's volumetric fog energy multiplier (final volumetric fog energy is
     * [LIGHT_PARAM_ENERGY] * [LIGHT_PARAM_VOLUMETRIC_FOG_ENERGY]).
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
     * The size of the light when using spot light or omni light. The angular size of the light when
     * using directional light.
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
     * The maximum distance for shadow splits. Increasing this value will make directional shadows
     * visible from further away, at the cost of lower overall shadow detail and performance (since
     * more objects need to be included in the directional shadow rendering).
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
     * Normal bias used to offset shadow lookup by object normal. Can be used to fix self-shadowing
     * artifacts.
     */
    LIGHT_PARAM_SHADOW_NORMAL_BIAS(14),
    /**
     * Bias the shadow lookup to fix self-shadowing artifacts.
     */
    LIGHT_PARAM_SHADOW_BIAS(15),
    /**
     * Sets the size of the directional shadow pancake. The pancake offsets the start of the
     * shadow's camera frustum to provide a higher effective depth resolution for the shadow. However,
     * a high pancake size can cause artifacts in the shadows of large objects that are close to the
     * edge of the frustum. Reducing the pancake size can help. Setting the size to `0` turns off the
     * pancaking effect.
     */
    LIGHT_PARAM_SHADOW_PANCAKE_SIZE(16),
    /**
     * The light's shadow opacity. Values lower than `1.0` make the light appear through shadows.
     * This can be used to fake global illumination at a low performance cost.
     */
    LIGHT_PARAM_SHADOW_OPACITY(17),
    /**
     * Blurs the edges of the shadow. Can be used to hide pixel artifacts in low resolution shadow
     * maps. A high value can make shadows appear grainy and can cause other unwanted artifacts. Try to
     * keep as near default as possible.
     */
    LIGHT_PARAM_SHADOW_BLUR(18),
    LIGHT_PARAM_TRANSMITTANCE_BIAS(19),
    /**
     * Constant representing the intensity of the light, measured in Lumens when dealing with a
     * [SpotLight3D] or [OmniLight3D], or measured in Lux with a [DirectionalLight3D]. Only used when
     * [ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is `true`.
     */
    LIGHT_PARAM_INTENSITY(20),
    /**
     * Represents the size of the [LightParam] enum.
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
     * Light is ignored when baking. This is the fastest mode, but the light will be taken into
     * account when baking global illumination. This mode should generally be used for dynamic lights
     * that change quickly, as the effect of global illumination is less noticeable on those lights.
     */
    LIGHT_BAKE_DISABLED(0),
    /**
     * Light is taken into account in static baking ([VoxelGI], [LightmapGI], SDFGI
     * ([Environment.sdfgiEnabled])). The light can be moved around or modified, but its global
     * illumination will not update in real-time. This is suitable for subtle changes (such as
     * flickering torches), but generally not large changes such as toggling a light on and off.
     */
    LIGHT_BAKE_STATIC(1),
    /**
     * Light is taken into account in dynamic baking ([VoxelGI] and SDFGI
     * ([Environment.sdfgiEnabled]) only). The light can be moved around or modified with global
     * illumination updating in real-time. The light's global illumination appearance will be slightly
     * different compared to [LIGHT_BAKE_STATIC]. This has a greater performance cost compared to
     * [LIGHT_BAKE_STATIC]. When using SDFGI, the update speed of dynamic lights is affected by
     * [ProjectSettings.rendering/globalIllumination/sdfgi/framesToUpdateLights].
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
     * Lowest shadow filtering quality (fastest). Soft shadows are not available with this quality
     * setting, which means the [Light3D.shadowBlur] property is ignored if [Light3D.lightSize] and
     * [Light3D.lightAngularDistance] is `0.0`.
     * **Note:** The variable shadow blur performed by [Light3D.lightSize] and
     * [Light3D.lightAngularDistance] is still effective when using hard shadow filtering. In this
     * case, [Light3D.shadowBlur] *is* taken into account. However, the results will not be blurred,
     * instead the blur amount is treated as a maximum radius for the penumbra.
     */
    SHADOW_QUALITY_HARD(0),
    /**
     * Very low shadow filtering quality (faster). When using this quality setting,
     * [Light3D.shadowBlur] is automatically multiplied by 0.75× to avoid introducing too much noise.
     * This division only applies to lights whose [Light3D.lightSize] or [Light3D.lightAngularDistance]
     * is `0.0`).
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
     * High low shadow filtering quality (slow). When using this quality setting,
     * [Light3D.shadowBlur] is automatically multiplied by 1.5× to better make use of the high sample
     * count. This increased blur also improves the stability of dynamic object shadows. This
     * multiplier only applies to lights whose [Light3D.lightSize] or [Light3D.lightAngularDistance] is
     * `0.0`).
     */
    SHADOW_QUALITY_SOFT_HIGH(4),
    /**
     * Highest low shadow filtering quality (slowest). When using this quality setting,
     * [Light3D.shadowBlur] is automatically multiplied by 2× to better make use of the high sample
     * count. This increased blur also improves the stability of dynamic object shadows. This
     * multiplier only applies to lights whose [Light3D.lightSize] or [Light3D.lightAngularDistance] is
     * `0.0`).
     */
    SHADOW_QUALITY_SOFT_ULTRA(5),
    /**
     * Represents the size of the [ShadowQuality] enum.
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
     * Apply automatically-sourced environment lighting inside the reflection probe's box defined by
     * its size.
     */
    REFLECTION_PROBE_AMBIENT_ENVIRONMENT(1),
    /**
     * Apply custom ambient lighting inside the reflection probe's box defined by its size. See
     * [reflectionProbeSetAmbientColor] and [reflectionProbeSetAmbientEnergy].
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
     * Albedo texture slot in a decal ([Decal.textureAlbedo]).
     */
    DECAL_TEXTURE_ALBEDO(0),
    /**
     * Normal map texture slot in a decal ([Decal.textureNormal]).
     */
    DECAL_TEXTURE_NORMAL(1),
    /**
     * Occlusion/Roughness/Metallic texture slot in a decal ([Decal.textureOrm]).
     */
    DECAL_TEXTURE_ORM(2),
    /**
     * Emission texture slot in a decal ([Decal.textureEmission]).
     */
    DECAL_TEXTURE_EMISSION(3),
    /**
     * Represents the size of the [DecalTexture] enum.
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
     * Nearest-neighbor filter for decals (use for pixel art decals). No mipmaps are used for
     * rendering, which means decals at a distance will look sharp but grainy. This has roughly the
     * same performance cost as using mipmaps.
     */
    DECAL_FILTER_NEAREST(0),
    /**
     * Linear filter for decals (use for non-pixel art decals). No mipmaps are used for rendering,
     * which means decals at a distance will look smooth but blurry. This has roughly the same
     * performance cost as using mipmaps.
     */
    DECAL_FILTER_LINEAR(1),
    /**
     * Nearest-neighbor filter for decals (use for pixel art decals). Isotropic mipmaps are used for
     * rendering, which means decals at a distance will look smooth but blurry. This has roughly the
     * same performance cost as not using mipmaps.
     */
    DECAL_FILTER_NEAREST_MIPMAPS(2),
    /**
     * Linear filter for decals (use for non-pixel art decals). Isotropic mipmaps are used for
     * rendering, which means decals at a distance will look smooth but blurry. This has roughly the
     * same performance cost as not using mipmaps.
     */
    DECAL_FILTER_LINEAR_MIPMAPS(3),
    /**
     * Nearest-neighbor filter for decals (use for pixel art decals). Anisotropic mipmaps are used
     * for rendering, which means decals at a distance will look smooth and sharp when viewed from
     * oblique angles. This looks better compared to isotropic mipmaps, but is slower. The level of
     * anisotropic filtering is defined by
     * [ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     */
    DECAL_FILTER_NEAREST_MIPMAPS_ANISOTROPIC(4),
    /**
     * Linear filter for decals (use for non-pixel art decals). Anisotropic mipmaps are used for
     * rendering, which means decals at a distance will look smooth and sharp when viewed from oblique
     * angles. This looks better compared to isotropic mipmaps, but is slower. The level of anisotropic
     * filtering is defined by
     * [ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
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
     * Low [VoxelGI] rendering quality using 4 cones.
     */
    VOXEL_GI_QUALITY_LOW(0),
    /**
     * High [VoxelGI] rendering quality using 6 cones.
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
    PARTICLES_TRANSFORM_ALIGN_DISABLED(0),
    PARTICLES_TRANSFORM_ALIGN_Z_BILLBOARD(1),
    PARTICLES_TRANSFORM_ALIGN_Y_TO_VELOCITY(2),
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
     * Sort particles based on their lifetime. In other words, the particle with the highest
     * lifetime is drawn at the front.
     */
    PARTICLES_DRAW_ORDER_LIFETIME(1),
    /**
     * Sort particles based on the inverse of their lifetime. In other words, the particle with the
     * lowest lifetime is drawn at the front.
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
    PARTICLES_COLLISION_TYPE_SPHERE_ATTRACT(0),
    PARTICLES_COLLISION_TYPE_BOX_ATTRACT(1),
    PARTICLES_COLLISION_TYPE_VECTOR_FIELD_ATTRACT(2),
    PARTICLES_COLLISION_TYPE_SPHERE_COLLIDE(3),
    PARTICLES_COLLISION_TYPE_BOX_COLLIDE(4),
    PARTICLES_COLLISION_TYPE_SDF_COLLIDE(5),
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
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_256(0),
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_512(1),
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_1024(2),
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_2048(3),
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_4096(4),
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_8192(5),
    /**
     * Represents the size of the [ParticlesCollisionHeightfieldResolution] enum.
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
     * [FogVolume] will be shaped like an ellipsoid (stretched sphere).
     */
    FOG_VOLUME_SHAPE_ELLIPSOID(0),
    /**
     * [FogVolume] will be shaped like a cone pointing upwards (in local coordinates). The cone's
     * angle is set automatically to fill the size. The cone will be adjusted to fit within the size.
     * Rotate the [FogVolume] node to reorient the cone. Non-uniform scaling via size is not supported
     * (scale the [FogVolume] node instead).
     */
    FOG_VOLUME_SHAPE_CONE(1),
    /**
     * [FogVolume] will be shaped like an upright cylinder (in local coordinates). Rotate the
     * [FogVolume] node to reorient the cylinder. The cylinder will be adjusted to fit within the size.
     * Non-uniform scaling via size is not supported (scale the [FogVolume] node instead).
     */
    FOG_VOLUME_SHAPE_CYLINDER(2),
    /**
     * [FogVolume] will be shaped like a box.
     */
    FOG_VOLUME_SHAPE_BOX(3),
    /**
     * [FogVolume] will have no shape, will cover the whole world and will not be culled.
     */
    FOG_VOLUME_SHAPE_WORLD(4),
    /**
     * Represents the size of the [FogVolumeShape] enum.
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
     * Use bilinear scaling for the viewport's 3D buffer. The amount of scaling can be set using
     * [Viewport.scaling3dScale]. Values less than `1.0` will result in undersampling while values
     * greater than `1.0` will result in supersampling. A value of `1.0` disables scaling.
     */
    VIEWPORT_SCALING_3D_MODE_BILINEAR(0),
    /**
     * Use AMD FidelityFX Super Resolution 1.0 upscaling for the viewport's 3D buffer. The amount of
     * scaling can be set using [Viewport.scaling3dScale]. Values less than `1.0` will be result in the
     * viewport being upscaled using FSR. Values greater than `1.0` are not supported and bilinear
     * downsampling will be used instead. A value of `1.0` disables scaling.
     */
    VIEWPORT_SCALING_3D_MODE_FSR(1),
    /**
     * Use AMD FidelityFX Super Resolution 2.2 upscaling for the viewport's 3D buffer. The amount of
     * scaling can be set using [Viewport.scaling3dScale]. Values less than `1.0` will be result in the
     * viewport being upscaled using FSR2. Values greater than `1.0` are not supported and bilinear
     * downsampling will be used instead. A value of `1.0` will use FSR2 at native resolution as a TAA
     * solution.
     */
    VIEWPORT_SCALING_3D_MODE_FSR2(2),
    /**
     * Represents the size of the [ViewportScaling3DMode] enum.
     */
    VIEWPORT_SCALING_3D_MODE_MAX(3),
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
     * Inherit enable/disable value from parent. If the topmost parent is also set to
     * [VIEWPORT_ENVIRONMENT_INHERIT], then this has the same behavior as
     * [VIEWPORT_ENVIRONMENT_ENABLED].
     */
    VIEWPORT_ENVIRONMENT_INHERIT(2),
    /**
     * Represents the size of the [ViewportEnvironmentMode] enum.
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
     * Do not oversize the 2D signed distance field. Occluders may disappear when touching the
     * viewport's edges, and [GPUParticles3D] collision may stop working earlier than intended. This
     * has the lowest GPU requirements.
     */
    VIEWPORT_SDF_OVERSIZE_100_PERCENT(0),
    /**
     * 2D signed distance field covers 20&#37; of the viewport's size outside the viewport on each
     * side (top, right, bottom, left).
     */
    VIEWPORT_SDF_OVERSIZE_120_PERCENT(1),
    /**
     * 2D signed distance field covers 50&#37; of the viewport's size outside the viewport on each
     * side (top, right, bottom, left).
     */
    VIEWPORT_SDF_OVERSIZE_150_PERCENT(2),
    /**
     * 2D signed distance field covers 100&#37; of the viewport's size outside the viewport on each
     * side (top, right, bottom, left). This has the highest GPU requirements.
     */
    VIEWPORT_SDF_OVERSIZE_200_PERCENT(3),
    /**
     * Represents the size of the [ViewportSDFOversize] enum.
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
     * Half resolution 2D signed distance field scale on each axis (25&#37; of the viewport pixel
     * count).
     */
    VIEWPORT_SDF_SCALE_50_PERCENT(1),
    /**
     * Quarter resolution 2D signed distance field scale on each axis (6.25&#37; of the viewport
     * pixel count). This has the lowest GPU requirements.
     */
    VIEWPORT_SDF_SCALE_25_PERCENT(2),
    /**
     * Represents the size of the [ViewportSDFScale] enum.
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
     * Multisample antialiasing for 3D is disabled. This is the default value, and also the fastest
     * setting.
     */
    VIEWPORT_MSAA_DISABLED(0),
    /**
     * Multisample antialiasing uses 2 samples per pixel for 3D. This has a moderate impact on
     * performance.
     */
    VIEWPORT_MSAA_2X(1),
    /**
     * Multisample antialiasing uses 4 samples per pixel for 3D. This has a high impact on
     * performance.
     */
    VIEWPORT_MSAA_4X(2),
    /**
     * Multisample antialiasing uses 8 samples per pixel for 3D. This has a very high impact on
     * performance. Likely unsupported on low-end and older hardware.
     */
    VIEWPORT_MSAA_8X(3),
    /**
     * Represents the size of the [ViewportMSAA] enum.
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
     * Use fast approximate antialiasing. FXAA is a popular screen-space antialiasing method, which
     * is fast but will make the image look blurry, especially at lower resolutions. It can still work
     * relatively well at large resolutions such as 1440p and 4K.
     */
    VIEWPORT_SCREEN_SPACE_AA_FXAA(1),
    /**
     * Represents the size of the [ViewportScreenSpaceAA] enum.
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
     * Low occlusion culling BVH build quality (as defined by Embree). Results in the lowest CPU
     * usage, but least effective culling.
     */
    VIEWPORT_OCCLUSION_BUILD_QUALITY_LOW(0),
    /**
     * Medium occlusion culling BVH build quality (as defined by Embree).
     */
    VIEWPORT_OCCLUSION_BUILD_QUALITY_MEDIUM(1),
    /**
     * High occlusion culling BVH build quality (as defined by Embree). Results in the highest CPU
     * usage, but most effective culling.
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
     * Represents the size of the [ViewportRenderInfo] enum.
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
     * Shadow render pass. Objects will be rendered several times depending on the number of amounts
     * of lights with shadows and the number of directional shadow splits.
     */
    VIEWPORT_RENDER_INFO_TYPE_SHADOW(1),
    /**
     * Represents the size of the [ViewportRenderInfoType] enum.
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
     * Objects are displayed semi-transparent with additive blending so you can see where they are
     * drawing over top of one another. A higher overdraw (represented by brighter colors) means you
     * are wasting performance on drawing pixels that are being hidden behind others.
     * **Note:** When using this debug draw mode, custom shaders will be ignored. This means vertex
     * displacement won't be visible anymore.
     */
    VIEWPORT_DEBUG_DRAW_OVERDRAW(3),
    /**
     * Debug draw draws objects in wireframe.
     */
    VIEWPORT_DEBUG_DRAW_WIREFRAME(4),
    /**
     * Normal buffer is drawn instead of regular scene so you can see the per-pixel normals that
     * will be used by post-processing effects.
     */
    VIEWPORT_DEBUG_DRAW_NORMAL_BUFFER(5),
    /**
     * Objects are displayed with only the albedo value from [VoxelGI]s.
     */
    VIEWPORT_DEBUG_DRAW_VOXEL_GI_ALBEDO(6),
    /**
     * Objects are displayed with only the lighting value from [VoxelGI]s.
     */
    VIEWPORT_DEBUG_DRAW_VOXEL_GI_LIGHTING(7),
    /**
     * Objects are displayed with only the emission color from [VoxelGI]s.
     */
    VIEWPORT_DEBUG_DRAW_VOXEL_GI_EMISSION(8),
    /**
     * Draws the shadow atlas that stores shadows from [OmniLight3D]s and [SpotLight3D]s in the
     * upper left quadrant of the [Viewport].
     */
    VIEWPORT_DEBUG_DRAW_SHADOW_ATLAS(9),
    /**
     * Draws the shadow atlas that stores shadows from [DirectionalLight3D]s in the upper left
     * quadrant of the [Viewport].
     * The slice of the camera frustum related to the shadow map cascade is superimposed to
     * visualize coverage. The color of each slice matches the colors used for
     * [VIEWPORT_DEBUG_DRAW_PSSM_SPLITS]. When shadow cascades are blended the overlap is taken into
     * account when drawing the frustum slices.
     * The last cascade shows all frustum slices to illustrate the coverage of all slices.
     */
    VIEWPORT_DEBUG_DRAW_DIRECTIONAL_SHADOW_ATLAS(10),
    /**
     * Draws the estimated scene luminance. This is a 1×1 texture that is generated when
     * autoexposure is enabled to control the scene's exposure.
     */
    VIEWPORT_DEBUG_DRAW_SCENE_LUMINANCE(11),
    /**
     * Draws the screen space ambient occlusion texture instead of the scene so that you can clearly
     * see how it is affecting objects. In order for this display mode to work, you must have
     * [Environment.ssaoEnabled] set in your [WorldEnvironment].
     */
    VIEWPORT_DEBUG_DRAW_SSAO(12),
    /**
     * Draws the screen space indirect lighting texture instead of the scene so that you can clearly
     * see how it is affecting objects. In order for this display mode to work, you must have
     * [Environment.ssilEnabled] set in your [WorldEnvironment].
     */
    VIEWPORT_DEBUG_DRAW_SSIL(13),
    /**
     * Colors each PSSM split for the [DirectionalLight3D]s in the scene a different color so you
     * can see where the splits are. In order they will be colored red, green, blue, yellow.
     */
    VIEWPORT_DEBUG_DRAW_PSSM_SPLITS(14),
    /**
     * Draws the decal atlas that stores decal textures from [Decal]s.
     */
    VIEWPORT_DEBUG_DRAW_DECAL_ATLAS(15),
    /**
     * Draws SDFGI cascade data. This is the data structure that is used to bounce lighting against
     * and create reflections.
     */
    VIEWPORT_DEBUG_DRAW_SDFGI(16),
    /**
     * Draws SDFGI probe data. This is the data structure that is used to give indirect lighting
     * dynamic objects moving within the scene.
     */
    VIEWPORT_DEBUG_DRAW_SDFGI_PROBES(17),
    /**
     * Draws the global illumination buffer ([VoxelGI] or SDFGI).
     */
    VIEWPORT_DEBUG_DRAW_GI_BUFFER(18),
    /**
     * Disable mesh LOD. All meshes are drawn with full detail, which can be used to compare
     * performance.
     */
    VIEWPORT_DEBUG_DRAW_DISABLE_LOD(19),
    /**
     * Draws the [OmniLight3D] cluster. Clustering determines where lights are positioned in
     * screen-space, which allows the engine to only process these portions of the screen for lighting.
     */
    VIEWPORT_DEBUG_DRAW_CLUSTER_OMNI_LIGHTS(20),
    /**
     * Draws the [SpotLight3D] cluster. Clustering determines where lights are positioned in
     * screen-space, which allows the engine to only process these portions of the screen for lighting.
     */
    VIEWPORT_DEBUG_DRAW_CLUSTER_SPOT_LIGHTS(21),
    /**
     * Draws the [Decal] cluster. Clustering determines where decals are positioned in screen-space,
     * which allows the engine to only process these portions of the screen for decals.
     */
    VIEWPORT_DEBUG_DRAW_CLUSTER_DECALS(22),
    /**
     * Draws the [ReflectionProbe] cluster. Clustering determines where reflection probes are
     * positioned in screen-space, which allows the engine to only process these portions of the screen
     * for reflection probes.
     */
    VIEWPORT_DEBUG_DRAW_CLUSTER_REFLECTION_PROBES(23),
    /**
     * Draws the occlusion culling buffer. This low-resolution occlusion culling buffer is
     * rasterized on the CPU and is used to check whether instances are occluded by other objects.
     */
    VIEWPORT_DEBUG_DRAW_OCCLUDERS(24),
    /**
     * Draws the motion vectors buffer. This is used by temporal antialiasing to correct for motion
     * that occurs during gameplay.
     */
    VIEWPORT_DEBUG_DRAW_MOTION_VECTORS(25),
    /**
     * Internal buffer is drawn instead of regular scene so you can see the per-pixel output that
     * will be used by post-processing effects.
     */
    VIEWPORT_DEBUG_DRAW_INTERNAL_BUFFER(26),
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
     * Variable rate shading uses a texture. Note, for stereoscopic use a texture atlas with a
     * texture for each view.
     */
    VIEWPORT_VRS_TEXTURE(1),
    /**
     * Variable rate shading texture is supplied by the primary [XRInterface].
     */
    VIEWPORT_VRS_XR(2),
    /**
     * Represents the size of the [ViewportVRSMode] enum.
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
     * Automatically selects the appropriate process mode based on your sky shader. If your shader
     * uses `TIME` or `POSITION`, this will use [SKY_MODE_REALTIME]. If your shader uses any of the
     * `LIGHT_*` variables or any custom uniforms, this uses [SKY_MODE_INCREMENTAL]. Otherwise, this
     * defaults to [SKY_MODE_QUALITY].
     */
    SKY_MODE_AUTOMATIC(0),
    /**
     * Uses high quality importance sampling to process the radiance map. In general, this results
     * in much higher quality than [SKY_MODE_REALTIME] but takes much longer to generate. This should
     * not be used if you plan on changing the sky at runtime. If you are finding that the reflection
     * is not blurry enough and is showing sparkles or fireflies, try increasing
     * [ProjectSettings.rendering/reflections/skyReflections/ggxSamples].
     */
    SKY_MODE_QUALITY(1),
    /**
     * Uses the same high quality importance sampling to process the radiance map as
     * [SKY_MODE_QUALITY], but updates over several frames. The number of frames is determined by
     * [ProjectSettings.rendering/reflections/skyReflections/roughnessLayers]. Use this when you need
     * highest quality radiance maps, but have a sky that updates slowly.
     */
    SKY_MODE_INCREMENTAL(2),
    /**
     * Uses the fast filtering algorithm to process the radiance map. In general this results in
     * lower quality, but substantially faster run times. If you need better quality, but still need to
     * update the sky every frame, consider turning on
     * [ProjectSettings.rendering/reflections/skyReflections/fastFilterHighQuality].
     * **Note:** The fast filtering algorithm is limited to 256×256 cubemaps, so
     * [skySetRadianceSize] must be set to `256`. Otherwise, a warning is printed and the overridden
     * radiance size is ignored.
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
     * Use a specified canvas layer as the background. This can be useful for instantiating a 2D
     * scene in a 3D world.
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
     * Represents the size of the [EnvironmentBG] enum.
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
     * Specify a specific [Color] for ambient light.
     */
    ENV_AMBIENT_SOURCE_COLOR(2),
    /**
     * Gather ambient light from the [Sky] regardless of what the background is.
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
     * Use the [Sky] for reflections regardless of what the background is.
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
     * Additive glow blending mode. Mostly used for particles, glows (bloom), lens flare, bright
     * sources.
     */
    ENV_GLOW_BLEND_MODE_ADDITIVE(0),
    /**
     * Screen glow blending mode. Increases brightness, used frequently with bloom.
     */
    ENV_GLOW_BLEND_MODE_SCREEN(1),
    /**
     * Soft light glow blending mode. Modifies contrast, exposes shadows and highlights (vivid
     * bloom).
     */
    ENV_GLOW_BLEND_MODE_SOFTLIGHT(2),
    /**
     * Replace glow blending mode. Replaces all pixels' color by the glow value. This can be used to
     * simulate a full-screen blur effect by tweaking the glow parameters to match the original image's
     * brightness.
     */
    ENV_GLOW_BLEND_MODE_REPLACE(3),
    /**
     * Mixes the glow with the underlying color to avoid increasing brightness as much while still
     * maintaining a glow effect.
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
     * Output color as they came in. This can cause bright lighting to look blown out, with
     * noticeable clipping in the output colors.
     */
    ENV_TONE_MAPPER_LINEAR(0),
    /**
     * Use the Reinhard tonemapper. Performs a variation on rendered pixels' colors by this formula:
     * `color = color / (1 + color)`. This avoids clipping bright highlights, but the resulting image
     * can look a bit dull.
     */
    ENV_TONE_MAPPER_REINHARD(1),
    /**
     * Use the filmic tonemapper. This avoids clipping bright highlights, with a resulting image
     * that usually looks more vivid than [ENV_TONE_MAPPER_REINHARD].
     */
    ENV_TONE_MAPPER_FILMIC(2),
    /**
     * Use the Academy Color Encoding System tonemapper. ACES is slightly more expensive than other
     * options, but it handles bright lighting in a more realistic fashion by desaturating it as it
     * becomes brighter. ACES typically has a more contrasted output compared to
     * [ENV_TONE_MAPPER_REINHARD] and [ENV_TONE_MAPPER_FILMIC].
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
     * Lowest quality of roughness filter for screen-space reflections. Rough materials will not
     * have blurrier screen-space reflections compared to smooth (non-rough) materials. This is the
     * fastest option.
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
     * Highest quality screen-space ambient occlusion. Uses the adaptive target setting which can be
     * dynamically adjusted to smoothly balance performance and visual quality.
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
     * Highest quality screen-space indirect lighting. Uses the adaptive target setting which can be
     * dynamically adjusted to smoothly balance performance and visual quality.
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
     * Use 50&#37; scale for SDFGI on the Y (vertical) axis. SDFGI cells will be twice as short as
     * they are wide. This allows providing increased GI detail and reduced light leaking with thin
     * floors and ceilings. This is usually the best choice for scenes that don't feature much
     * verticality.
     */
    ENV_SDFGI_Y_SCALE_50_PERCENT(0),
    /**
     * Use 75&#37; scale for SDFGI on the Y (vertical) axis. This is a balance between the 50&#37;
     * and 100&#37; SDFGI Y scales.
     */
    ENV_SDFGI_Y_SCALE_75_PERCENT(1),
    /**
     * Use 100&#37; scale for SDFGI on the Y (vertical) axis. SDFGI cells will be as tall as they
     * are wide. This is usually the best choice for highly vertical scenes. The downside is that light
     * leaking may become more noticeable with thin floors and ceilings.
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
     * Throw 4 rays per frame when converging SDFGI. This has the lowest GPU requirements, but
     * creates the most noisy result.
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
     * Throw 128 rays per frame when converging SDFGI. This has very high GPU requirements, but
     * creates the least noisy result.
     */
    ENV_SDFGI_RAY_COUNT_128(6),
    /**
     * Represents the size of the [EnvironmentSDFGIRayCount] enum.
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
     * Converge SDFGI over 5 frames. This is the most responsive, but creates the most noisy result
     * with a given ray count.
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
     * Configure SDFGI to fully converge over 30 frames. This is the least responsive, but creates
     * the least noisy result with a given ray count.
     */
    ENV_SDFGI_CONVERGE_IN_30_FRAMES(5),
    /**
     * Represents the size of the [EnvironmentSDFGIFramesToConverge] enum.
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
     * Update indirect light from dynamic lights in SDFGI over 1 frame. This is the most responsive,
     * but has the highest GPU requirements.
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
     * Update indirect light from dynamic lights in SDFGI over 16 frames. This is the least
     * responsive, but has the lowest GPU requirements.
     */
    ENV_SDFGI_UPDATE_LIGHT_IN_16_FRAMES(4),
    /**
     * Represents the size of the [EnvironmentSDFGIFramesToUpdateLight] enum.
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
     * Disables subsurface scattering entirely, even on materials that have
     * [BaseMaterial3D.subsurfScatterEnabled] set to `true`. This has the lowest GPU requirements.
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
     * Calculate the DOF blur using a box filter. The fastest option, but results in obvious lines
     * in blur pattern.
     */
    DOF_BOKEH_BOX(0),
    /**
     * Calculates DOF blur using a hexagon shaped filter.
     */
    DOF_BOKEH_HEXAGON(1),
    /**
     * Calculates DOF blur using a circle shaped filter. Best quality and most realistic, but
     * slowest. Use only for areas where a lot of performance can be dedicated to post-processing (e.g.
     * cutscenes).
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
     * Lowest quality DOF blur. This is the fastest setting, but you may be able to see filtering
     * artifacts.
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
     * Highest quality DOF blur. Results in the smoothest looking blur by taking the most samples,
     * but is also significantly slower.
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
     * Represents the size of the [InstanceType] enum.
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
     * Always draw, even if the instance would be culled by occlusion culling. Does not affect view
     * frustum culling.
     */
    INSTANCE_FLAG_IGNORE_OCCLUSION_CULLING(3),
    /**
     * Represents the size of the [InstanceFlags] enum.
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
     * Disable backface culling when rendering the shadow of the object. This is slightly slower but
     * may result in more correct shadows.
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
     * Index of [Image] in array of [Image]s returned by [bakeRenderUv2]. Image uses
     * [Image.FORMAT_RGBA8] and contains albedo color in the `.rgb` channels and alpha in the `.a`
     * channel.
     */
    BAKE_CHANNEL_ALBEDO_ALPHA(0),
    /**
     * Index of [Image] in array of [Image]s returned by [bakeRenderUv2]. Image uses
     * [Image.FORMAT_RGBA8] and contains the per-pixel normal of the object in the `.rgb` channels and
     * nothing in the `.a` channel. The per-pixel normal is encoded as `normal * 0.5 + 0.5`.
     */
    BAKE_CHANNEL_NORMAL(1),
    /**
     * Index of [Image] in array of [Image]s returned by [bakeRenderUv2]. Image uses
     * [Image.FORMAT_RGBA8] and contains ambient occlusion (from material and decals only) in the `.r`
     * channel, roughness in the `.g` channel, metallic in the `.b` channel and sub surface scattering
     * amount in the `.a` channel.
     */
    BAKE_CHANNEL_ORM(2),
    /**
     * Index of [Image] in array of [Image]s returned by [bakeRenderUv2]. Image uses
     * [Image.FORMAT_RGBAH] and contains emission color in the `.rgb` channels and nothing in the `.a`
     * channel.
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
     * Diffuse canvas texture ([CanvasTexture.diffuseTexture]).
     */
    CANVAS_TEXTURE_CHANNEL_DIFFUSE(0),
    /**
     * Normal map canvas texture ([CanvasTexture.normalTexture]).
     */
    CANVAS_TEXTURE_CHANNEL_NORMAL(1),
    /**
     * Specular map canvas texture ([CanvasTexture.specularTexture]).
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
     * Uses the default filter mode for this [Viewport].
     */
    CANVAS_ITEM_TEXTURE_FILTER_DEFAULT(0),
    /**
     * The texture filter reads from the nearest pixel only. This makes the texture look pixelated
     * from up close, and grainy from a distance (due to mipmaps not being sampled).
     */
    CANVAS_ITEM_TEXTURE_FILTER_NEAREST(1),
    /**
     * The texture filter blends between the nearest 4 pixels. This makes the texture look smooth
     * from up close, and grainy from a distance (due to mipmaps not being sampled).
     */
    CANVAS_ITEM_TEXTURE_FILTER_LINEAR(2),
    /**
     * The texture filter reads from the nearest pixel and blends between the nearest 2 mipmaps (or
     * uses the nearest mipmap if
     * [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is `true`). This
     * makes the texture look pixelated from up close, and smooth from a distance.
     * Use this for non-pixel art textures that may be viewed at a low scale (e.g. due to [Camera2D]
     * zoom or sprite scaling), as mipmaps are important to smooth out pixels that are smaller than
     * on-screen pixels.
     */
    CANVAS_ITEM_TEXTURE_FILTER_NEAREST_WITH_MIPMAPS(3),
    /**
     * The texture filter blends between the nearest 4 pixels and between the nearest 2 mipmaps (or
     * uses the nearest mipmap if
     * [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is `true`). This
     * makes the texture look smooth from up close, and smooth from a distance.
     * Use this for non-pixel art textures that may be viewed at a low scale (e.g. due to [Camera2D]
     * zoom or sprite scaling), as mipmaps are important to smooth out pixels that are smaller than
     * on-screen pixels.
     */
    CANVAS_ITEM_TEXTURE_FILTER_LINEAR_WITH_MIPMAPS(4),
    /**
     * The texture filter reads from the nearest pixel and blends between 2 mipmaps (or uses the
     * nearest mipmap if [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is
     * `true`) based on the angle between the surface and the camera view. This makes the texture look
     * pixelated from up close, and smooth from a distance. Anisotropic filtering improves texture
     * quality on surfaces that are almost in line with the camera, but is slightly slower. The
     * anisotropic filtering level can be changed by adjusting
     * [ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     * **Note:** This texture filter is rarely useful in 2D projects.
     * [CANVAS_ITEM_TEXTURE_FILTER_NEAREST_WITH_MIPMAPS] is usually more appropriate in this case.
     */
    CANVAS_ITEM_TEXTURE_FILTER_NEAREST_WITH_MIPMAPS_ANISOTROPIC(5),
    /**
     * The texture filter blends between the nearest 4 pixels and blends between 2 mipmaps (or uses
     * the nearest mipmap if [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter]
     * is `true`) based on the angle between the surface and the camera view. This makes the texture
     * look smooth from up close, and smooth from a distance. Anisotropic filtering improves texture
     * quality on surfaces that are almost in line with the camera, but is slightly slower. The
     * anisotropic filtering level can be changed by adjusting
     * [ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     * **Note:** This texture filter is rarely useful in 2D projects.
     * [CANVAS_ITEM_TEXTURE_FILTER_LINEAR_WITH_MIPMAPS] is usually more appropriate in this case.
     */
    CANVAS_ITEM_TEXTURE_FILTER_LINEAR_WITH_MIPMAPS_ANISOTROPIC(6),
    /**
     * Max value for [CanvasItemTextureFilter] enum.
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
     * Uses the default repeat mode for this [Viewport].
     */
    CANVAS_ITEM_TEXTURE_REPEAT_DEFAULT(0),
    /**
     * Disables textures repeating. Instead, when reading UVs outside the 0-1 range, the value will
     * be clamped to the edge of the texture, resulting in a stretched out look at the borders of the
     * texture.
     */
    CANVAS_ITEM_TEXTURE_REPEAT_DISABLED(1),
    /**
     * Enables the texture to repeat when UV coordinates are outside the 0-1 range. If using one of
     * the linear filtering modes, this can result in artifacts at the edges of a texture when the
     * sampler filters across the edges of the texture.
     */
    CANVAS_ITEM_TEXTURE_REPEAT_ENABLED(2),
    /**
     * Flip the texture when repeating so that the edge lines up instead of abruptly changing.
     */
    CANVAS_ITEM_TEXTURE_REPEAT_MIRROR(3),
    /**
     * Max value for [CanvasItemTextureRepeat] enum.
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
     * Parent is used for the purposes of clipping only. Child is clipped to the parent's visible
     * area, parent is not drawn.
     */
    CANVAS_GROUP_MODE_CLIP_ONLY(1),
    /**
     * Parent is used for clipping child, but parent is also drawn underneath child as normal before
     * clipping child to its visible area.
     */
    CANVAS_GROUP_MODE_CLIP_AND_DRAW(2),
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
     * 2D point light (see [PointLight2D]).
     */
    CANVAS_LIGHT_MODE_POINT(0),
    /**
     * 2D directional (sun/moon) light (see [DirectionalLight2D]).
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
     * Max value of the [CanvasLightShadowFilter] enum.
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
     * 2-dimensional integer rectangle global shader parameter (`global uniform ivec4 ...`).
     * Equivalent to [GLOBAL_VAR_TYPE_IVEC4] in shader code, but exposed as a [Rect2i] in the editor
     * UI.
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
     * Color global shader parameter (`global uniform vec4 ...`). Equivalent to
     * [GLOBAL_VAR_TYPE_VEC4] in shader code, but exposed as a [Color] in the editor UI.
     */
    GLOBAL_VAR_TYPE_COLOR(17),
    /**
     * 2-dimensional floating-point rectangle global shader parameter (`global uniform vec4 ...`).
     * Equivalent to [GLOBAL_VAR_TYPE_VEC4] in shader code, but exposed as a [Rect2] in the editor UI.
     */
    GLOBAL_VAR_TYPE_RECT2(18),
    /**
     * 2×2 matrix global shader parameter (`global uniform mat2 ...`). Exposed as a
     * [PackedInt32Array] in the editor UI.
     */
    GLOBAL_VAR_TYPE_MAT2(19),
    /**
     * 3×3 matrix global shader parameter (`global uniform mat3 ...`). Exposed as a [Basis] in the
     * editor UI.
     */
    GLOBAL_VAR_TYPE_MAT3(20),
    /**
     * 4×4 matrix global shader parameter (`global uniform mat4 ...`). Exposed as a [Projection] in
     * the editor UI.
     */
    GLOBAL_VAR_TYPE_MAT4(21),
    /**
     * 2-dimensional transform global shader parameter (`global uniform mat2x3 ...`). Exposed as a
     * [Transform2D] in the editor UI.
     */
    GLOBAL_VAR_TYPE_TRANSFORM_2D(22),
    /**
     * 3-dimensional transform global shader parameter (`global uniform mat3x4 ...`). Exposed as a
     * [Transform3D] in the editor UI.
     */
    GLOBAL_VAR_TYPE_TRANSFORM(23),
    /**
     * 2D sampler global shader parameter (`global uniform sampler2D ...`). Exposed as a [Texture2D]
     * in the editor UI.
     */
    GLOBAL_VAR_TYPE_SAMPLER2D(24),
    /**
     * 2D sampler array global shader parameter (`global uniform sampler2DArray ...`). Exposed as a
     * [Texture2DArray] in the editor UI.
     */
    GLOBAL_VAR_TYPE_SAMPLER2DARRAY(25),
    /**
     * 3D sampler global shader parameter (`global uniform sampler3D ...`). Exposed as a [Texture3D]
     * in the editor UI.
     */
    GLOBAL_VAR_TYPE_SAMPLER3D(26),
    /**
     * Cubemap sampler global shader parameter (`global uniform samplerCube ...`). Exposed as a
     * [Cubemap] in the editor UI.
     */
    GLOBAL_VAR_TYPE_SAMPLERCUBE(27),
    /**
     * Represents the size of the [GlobalShaderParameterType] enum.
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
     * Number of objects rendered in the current 3D scene. This varies depending on camera position
     * and rotation.
     */
    RENDERING_INFO_TOTAL_OBJECTS_IN_FRAME(0),
    /**
     * Number of points, lines, or triangles rendered in the current 3D scene. This varies depending
     * on camera position and rotation.
     */
    RENDERING_INFO_TOTAL_PRIMITIVES_IN_FRAME(1),
    /**
     * Number of draw calls performed to render in the current 3D scene. This varies depending on
     * camera position and rotation.
     */
    RENDERING_INFO_TOTAL_DRAW_CALLS_IN_FRAME(2),
    /**
     * Texture memory used (in bytes).
     */
    RENDERING_INFO_TEXTURE_MEM_USED(3),
    /**
     * Buffer memory used (in bytes). This includes vertex data, uniform buffers, and many
     * miscellaneous buffer types used internally.
     */
    RENDERING_INFO_BUFFER_MEM_USED(4),
    /**
     * Video memory used (in bytes). When using the Forward+ or mobile rendering backends, this is
     * always greater than the sum of [RENDERING_INFO_TEXTURE_MEM_USED] and
     * [RENDERING_INFO_BUFFER_MEM_USED], since there is miscellaneous data not accounted for by those
     * two metrics. When using the GL Compatibility backend, this is equal to the sum of
     * [RENDERING_INFO_TEXTURE_MEM_USED] and [RENDERING_INFO_BUFFER_MEM_USED].
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

  internal object MethodBindings {
    public val texture2dCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_2d_create")

    public val texture2dLayeredCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_2d_layered_create")

    public val texture3dCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_3d_create")

    public val textureProxyCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_proxy_create")

    public val texture2dUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_2d_update")

    public val texture3dUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_3d_update")

    public val textureProxyUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_proxy_update")

    public val texture2dPlaceholderCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_2d_placeholder_create")

    public val texture2dLayeredPlaceholderCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_2d_layered_placeholder_create")

    public val texture3dPlaceholderCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_3d_placeholder_create")

    public val texture2dGetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_2d_get")

    public val texture2dLayerGetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_2d_layer_get")

    public val texture3dGetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_3d_get")

    public val textureReplacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_replace")

    public val textureSetSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_set_size_override")

    public val textureSetPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_set_path")

    public val textureGetPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_get_path")

    public val textureGetFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_get_format")

    public val textureSetForceRedrawIfVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_set_force_redraw_if_visible")

    public val textureRdCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_rd_create")

    public val textureGetRdTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_get_rd_texture")

    public val textureGetNativeHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_get_native_handle")

    public val shaderCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "shader_create")

    public val shaderSetCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "shader_set_code")

    public val shaderSetPathHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "shader_set_path_hint")

    public val shaderGetCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "shader_get_code")

    public val getShaderParameterListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_shader_parameter_list")

    public val shaderGetParameterDefaultPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "shader_get_parameter_default")

    public val shaderSetDefaultTextureParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "shader_set_default_texture_parameter")

    public val shaderGetDefaultTextureParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "shader_get_default_texture_parameter")

    public val materialCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "material_create")

    public val materialSetShaderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "material_set_shader")

    public val materialSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "material_set_param")

    public val materialGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "material_get_param")

    public val materialSetRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "material_set_render_priority")

    public val materialSetNextPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "material_set_next_pass")

    public val meshCreateFromSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_create_from_surfaces")

    public val meshCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_create")

    public val meshSurfaceGetFormatOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_format_offset")

    public val meshSurfaceGetFormatVertexStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_format_vertex_stride")

    public val meshSurfaceGetFormatNormalTangentStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_format_normal_tangent_stride")

    public val meshSurfaceGetFormatAttributeStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_format_attribute_stride")

    public val meshSurfaceGetFormatSkinStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_format_skin_stride")

    public val meshAddSurfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_add_surface")

    public val meshAddSurfaceFromArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_add_surface_from_arrays")

    public val meshGetBlendShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_get_blend_shape_count")

    public val meshSetBlendShapeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_set_blend_shape_mode")

    public val meshGetBlendShapeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_get_blend_shape_mode")

    public val meshSurfaceSetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_set_material")

    public val meshSurfaceGetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_material")

    public val meshGetSurfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_get_surface")

    public val meshSurfaceGetArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_arrays")

    public val meshSurfaceGetBlendShapeArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_blend_shape_arrays")

    public val meshGetSurfaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_get_surface_count")

    public val meshSetCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_set_custom_aabb")

    public val meshGetCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_get_custom_aabb")

    public val meshClearPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingServer", "mesh_clear")

    public val meshSurfaceUpdateVertexRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_update_vertex_region")

    public val meshSurfaceUpdateAttributeRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_update_attribute_region")

    public val meshSurfaceUpdateSkinRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_update_skin_region")

    public val meshSetShadowMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_set_shadow_mesh")

    public val multimeshCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_create")

    public val multimeshAllocateDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_allocate_data")

    public val multimeshGetInstanceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_get_instance_count")

    public val multimeshSetMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_set_mesh")

    public val multimeshInstanceSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_set_transform")

    public val multimeshInstanceSetTransform2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_set_transform_2d")

    public val multimeshInstanceSetColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_set_color")

    public val multimeshInstanceSetCustomDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_set_custom_data")

    public val multimeshGetMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_get_mesh")

    public val multimeshGetAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_get_aabb")

    public val multimeshInstanceGetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_get_transform")

    public val multimeshInstanceGetTransform2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_get_transform_2d")

    public val multimeshInstanceGetColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_get_color")

    public val multimeshInstanceGetCustomDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_get_custom_data")

    public val multimeshSetVisibleInstancesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_set_visible_instances")

    public val multimeshGetVisibleInstancesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_get_visible_instances")

    public val multimeshSetBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_set_buffer")

    public val multimeshGetBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_get_buffer")

    public val skeletonCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_create")

    public val skeletonAllocateDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_allocate_data")

    public val skeletonGetBoneCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_get_bone_count")

    public val skeletonBoneSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_bone_set_transform")

    public val skeletonBoneGetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_bone_get_transform")

    public val skeletonBoneSetTransform2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_bone_set_transform_2d")

    public val skeletonBoneGetTransform2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_bone_get_transform_2d")

    public val skeletonSetBaseTransform2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_set_base_transform_2d")

    public val directionalLightCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "directional_light_create")

    public val omniLightCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "omni_light_create")

    public val spotLightCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "spot_light_create")

    public val lightSetColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_color")

    public val lightSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_param")

    public val lightSetShadowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_shadow")

    public val lightSetProjectorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_projector")

    public val lightSetNegativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_negative")

    public val lightSetCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_cull_mask")

    public val lightSetDistanceFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_distance_fade")

    public val lightSetReverseCullFaceModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_reverse_cull_face_mode")

    public val lightSetBakeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_bake_mode")

    public val lightSetMaxSdfgiCascadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_max_sdfgi_cascade")

    public val lightOmniSetShadowModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_omni_set_shadow_mode")

    public val lightDirectionalSetShadowModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_directional_set_shadow_mode")

    public val lightDirectionalSetBlendSplitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_directional_set_blend_splits")

    public val lightDirectionalSetSkyModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_directional_set_sky_mode")

    public val lightProjectorsSetFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_projectors_set_filter")

    public val positionalSoftShadowFilterSetQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "positional_soft_shadow_filter_set_quality")

    public val directionalSoftShadowFilterSetQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "directional_soft_shadow_filter_set_quality")

    public val directionalShadowAtlasSetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "directional_shadow_atlas_set_size")

    public val reflectionProbeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_create")

    public val reflectionProbeSetUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_update_mode")

    public val reflectionProbeSetIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_intensity")

    public val reflectionProbeSetAmbientModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_ambient_mode")

    public val reflectionProbeSetAmbientColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_ambient_color")

    public val reflectionProbeSetAmbientEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_ambient_energy")

    public val reflectionProbeSetMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_max_distance")

    public val reflectionProbeSetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_size")

    public val reflectionProbeSetOriginOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_origin_offset")

    public val reflectionProbeSetAsInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_as_interior")

    public val reflectionProbeSetEnableBoxProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_enable_box_projection")

    public val reflectionProbeSetEnableShadowsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_enable_shadows")

    public val reflectionProbeSetCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_cull_mask")

    public val reflectionProbeSetResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_resolution")

    public val reflectionProbeSetMeshLodThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_mesh_lod_threshold")

    public val decalCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_create")

    public val decalSetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_size")

    public val decalSetTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_texture")

    public val decalSetEmissionEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_emission_energy")

    public val decalSetAlbedoMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_albedo_mix")

    public val decalSetModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_modulate")

    public val decalSetCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_cull_mask")

    public val decalSetDistanceFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_distance_fade")

    public val decalSetFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_fade")

    public val decalSetNormalFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_normal_fade")

    public val decalsSetFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decals_set_filter")

    public val giSetUseHalfResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "gi_set_use_half_resolution")

    public val voxelGiCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_create")

    public val voxelGiAllocateDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_allocate_data")

    public val voxelGiGetOctreeSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_get_octree_size")

    public val voxelGiGetOctreeCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_get_octree_cells")

    public val voxelGiGetDataCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_get_data_cells")

    public val voxelGiGetDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_get_distance_field")

    public val voxelGiGetLevelCountsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_get_level_counts")

    public val voxelGiGetToCellXformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_get_to_cell_xform")

    public val voxelGiSetDynamicRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_dynamic_range")

    public val voxelGiSetPropagationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_propagation")

    public val voxelGiSetEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_energy")

    public val voxelGiSetBakedExposureNormalizationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_baked_exposure_normalization")

    public val voxelGiSetBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_bias")

    public val voxelGiSetNormalBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_normal_bias")

    public val voxelGiSetInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_interior")

    public val voxelGiSetUseTwoBouncesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_use_two_bounces")

    public val voxelGiSetQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_quality")

    public val lightmapCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_create")

    public val lightmapSetTexturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_set_textures")

    public val lightmapSetProbeBoundsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_set_probe_bounds")

    public val lightmapSetProbeInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_set_probe_interior")

    public val lightmapSetProbeCaptureDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_set_probe_capture_data")

    public val lightmapGetProbeCapturePointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_get_probe_capture_points")

    public val lightmapGetProbeCaptureShPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_get_probe_capture_sh")

    public val lightmapGetProbeCaptureTetrahedraPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_get_probe_capture_tetrahedra")

    public val lightmapGetProbeCaptureBspTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_get_probe_capture_bsp_tree")

    public val lightmapSetBakedExposureNormalizationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_set_baked_exposure_normalization")

    public val lightmapSetProbeCaptureUpdateSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_set_probe_capture_update_speed")

    public val particlesCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_create")

    public val particlesSetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_mode")

    public val particlesSetEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_emitting")

    public val particlesGetEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_get_emitting")

    public val particlesSetAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_amount")

    public val particlesSetAmountRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_amount_ratio")

    public val particlesSetLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_lifetime")

    public val particlesSetOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_one_shot")

    public val particlesSetPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_pre_process_time")

    public val particlesSetExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_explosiveness_ratio")

    public val particlesSetRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_randomness_ratio")

    public val particlesSetInterpToEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_interp_to_end")

    public val particlesSetEmitterVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_emitter_velocity")

    public val particlesSetCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_custom_aabb")

    public val particlesSetSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_speed_scale")

    public val particlesSetUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_use_local_coordinates")

    public val particlesSetProcessMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_process_material")

    public val particlesSetFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_fixed_fps")

    public val particlesSetInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_interpolate")

    public val particlesSetFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_fractional_delta")

    public val particlesSetCollisionBaseSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_collision_base_size")

    public val particlesSetTransformAlignPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_transform_align")

    public val particlesSetTrailsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_trails")

    public val particlesSetTrailBindPosesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_trail_bind_poses")

    public val particlesIsInactivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_is_inactive")

    public val particlesRequestProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_request_process")

    public val particlesRestartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_restart")

    public val particlesSetSubemitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_subemitter")

    public val particlesEmitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_emit")

    public val particlesSetDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_draw_order")

    public val particlesSetDrawPassesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_draw_passes")

    public val particlesSetDrawPassMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_draw_pass_mesh")

    public val particlesGetCurrentAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_get_current_aabb")

    public val particlesSetEmissionTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_emission_transform")

    public val particlesCollisionCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_create")

    public val particlesCollisionSetCollisionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_collision_type")

    public val particlesCollisionSetCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_cull_mask")

    public val particlesCollisionSetSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_sphere_radius")

    public val particlesCollisionSetBoxExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_box_extents")

    public val particlesCollisionSetAttractorStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_attractor_strength")

    public val particlesCollisionSetAttractorDirectionalityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_attractor_directionality")

    public val particlesCollisionSetAttractorAttenuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_attractor_attenuation")

    public val particlesCollisionSetFieldTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_field_texture")

    public val particlesCollisionHeightFieldUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_height_field_update")

    public val particlesCollisionSetHeightFieldResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_height_field_resolution")

    public val fogVolumeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "fog_volume_create")

    public val fogVolumeSetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "fog_volume_set_shape")

    public val fogVolumeSetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "fog_volume_set_size")

    public val fogVolumeSetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "fog_volume_set_material")

    public val visibilityNotifierCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "visibility_notifier_create")

    public val visibilityNotifierSetAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "visibility_notifier_set_aabb")

    public val visibilityNotifierSetCallbacksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "visibility_notifier_set_callbacks")

    public val occluderCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "occluder_create")

    public val occluderSetMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "occluder_set_mesh")

    public val cameraCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_create")

    public val cameraSetPerspectivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_perspective")

    public val cameraSetOrthogonalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_orthogonal")

    public val cameraSetFrustumPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_frustum")

    public val cameraSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_transform")

    public val cameraSetCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_cull_mask")

    public val cameraSetEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_environment")

    public val cameraSetCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_camera_attributes")

    public val cameraSetUseVerticalAspectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_use_vertical_aspect")

    public val viewportCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_create")

    public val viewportSetUseXrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_use_xr")

    public val viewportSetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_size")

    public val viewportSetActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_active")

    public val viewportSetParentViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_parent_viewport")

    public val viewportAttachToScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_attach_to_screen")

    public val viewportSetRenderDirectToScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_render_direct_to_screen")

    public val viewportSetCanvasCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_canvas_cull_mask")

    public val viewportSetScaling3dModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_scaling_3d_mode")

    public val viewportSetScaling3dScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_scaling_3d_scale")

    public val viewportSetFsrSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_fsr_sharpness")

    public val viewportSetTextureMipmapBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_texture_mipmap_bias")

    public val viewportSetUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_update_mode")

    public val viewportSetClearModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_clear_mode")

    public val viewportGetRenderTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_get_render_target")

    public val viewportGetTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_get_texture")

    public val viewportSetDisable3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_disable_3d")

    public val viewportSetDisable2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_disable_2d")

    public val viewportSetEnvironmentModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_environment_mode")

    public val viewportAttachCameraPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_attach_camera")

    public val viewportSetScenarioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_scenario")

    public val viewportAttachCanvasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_attach_canvas")

    public val viewportRemoveCanvasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_remove_canvas")

    public val viewportSetSnap2dTransformsToPixelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_snap_2d_transforms_to_pixel")

    public val viewportSetSnap2dVerticesToPixelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_snap_2d_vertices_to_pixel")

    public val viewportSetDefaultCanvasItemTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_default_canvas_item_texture_filter")

    public val viewportSetDefaultCanvasItemTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_default_canvas_item_texture_repeat")

    public val viewportSetCanvasTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_canvas_transform")

    public val viewportSetCanvasStackingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_canvas_stacking")

    public val viewportSetTransparentBackgroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_transparent_background")

    public val viewportSetGlobalCanvasTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_global_canvas_transform")

    public val viewportSetSdfOversizeAndScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_sdf_oversize_and_scale")

    public val viewportSetPositionalShadowAtlasSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_positional_shadow_atlas_size")

    public val viewportSetPositionalShadowAtlasQuadrantSubdivisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_positional_shadow_atlas_quadrant_subdivision")

    public val viewportSetMsaa3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_msaa_3d")

    public val viewportSetMsaa2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_msaa_2d")

    public val viewportSetUseHdr2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_use_hdr_2d")

    public val viewportSetScreenSpaceAaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_screen_space_aa")

    public val viewportSetUseTaaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_use_taa")

    public val viewportSetUseDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_use_debanding")

    public val viewportSetUseOcclusionCullingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_use_occlusion_culling")

    public val viewportSetOcclusionRaysPerThreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_occlusion_rays_per_thread")

    public val viewportSetOcclusionCullingBuildQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_occlusion_culling_build_quality")

    public val viewportGetRenderInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_get_render_info")

    public val viewportSetDebugDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_debug_draw")

    public val viewportSetMeasureRenderTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_measure_render_time")

    public val viewportGetMeasuredRenderTimeCpuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_get_measured_render_time_cpu")

    public val viewportGetMeasuredRenderTimeGpuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_get_measured_render_time_gpu")

    public val viewportSetVrsModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_vrs_mode")

    public val viewportSetVrsTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_vrs_texture")

    public val skyCreatePtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingServer", "sky_create")

    public val skySetRadianceSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "sky_set_radiance_size")

    public val skySetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "sky_set_mode")

    public val skySetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "sky_set_material")

    public val skyBakePanoramaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "sky_bake_panorama")

    public val environmentCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_create")

    public val environmentSetBackgroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_background")

    public val environmentSetSkyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_sky")

    public val environmentSetSkyCustomFovPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_sky_custom_fov")

    public val environmentSetSkyOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_sky_orientation")

    public val environmentSetBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_bg_color")

    public val environmentSetBgEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_bg_energy")

    public val environmentSetCanvasMaxLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_canvas_max_layer")

    public val environmentSetAmbientLightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_ambient_light")

    public val environmentSetGlowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_glow")

    public val environmentSetTonemapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_tonemap")

    public val environmentSetAdjustmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_adjustment")

    public val environmentSetSsrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_ssr")

    public val environmentSetSsaoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_ssao")

    public val environmentSetFogPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_fog")

    public val environmentSetSdfgiPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_sdfgi")

    public val environmentSetVolumetricFogPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_volumetric_fog")

    public val environmentGlowSetUseBicubicUpscalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_glow_set_use_bicubic_upscale")

    public val environmentSetSsrRoughnessQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_ssr_roughness_quality")

    public val environmentSetSsaoQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_ssao_quality")

    public val environmentSetSsilQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_ssil_quality")

    public val environmentSetSdfgiRayCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_sdfgi_ray_count")

    public val environmentSetSdfgiFramesToConvergePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_sdfgi_frames_to_converge")

    public val environmentSetSdfgiFramesToUpdateLightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_sdfgi_frames_to_update_light")

    public val environmentSetVolumetricFogVolumeSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_volumetric_fog_volume_size")

    public val environmentSetVolumetricFogFilterActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_volumetric_fog_filter_active")

    public val environmentBakePanoramaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_bake_panorama")

    public val screenSpaceRoughnessLimiterSetActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "screen_space_roughness_limiter_set_active")

    public val subSurfaceScatteringSetQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "sub_surface_scattering_set_quality")

    public val subSurfaceScatteringSetScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "sub_surface_scattering_set_scale")

    public val cameraAttributesCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_attributes_create")

    public val cameraAttributesSetDofBlurQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_attributes_set_dof_blur_quality")

    public val cameraAttributesSetDofBlurBokehShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_attributes_set_dof_blur_bokeh_shape")

    public val cameraAttributesSetDofBlurPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_attributes_set_dof_blur")

    public val cameraAttributesSetExposurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_attributes_set_exposure")

    public val cameraAttributesSetAutoExposurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_attributes_set_auto_exposure")

    public val scenarioCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "scenario_create")

    public val scenarioSetEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "scenario_set_environment")

    public val scenarioSetFallbackEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "scenario_set_fallback_environment")

    public val scenarioSetCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "scenario_set_camera_attributes")

    public val instanceCreate2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_create2")

    public val instanceCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_create")

    public val instanceSetBasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_base")

    public val instanceSetScenarioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_scenario")

    public val instanceSetLayerMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_layer_mask")

    public val instanceSetPivotDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_pivot_data")

    public val instanceSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_transform")

    public val instanceAttachObjectInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_attach_object_instance_id")

    public val instanceSetBlendShapeWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_blend_shape_weight")

    public val instanceSetSurfaceOverrideMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_surface_override_material")

    public val instanceSetVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_visible")

    public val instanceGeometrySetTransparencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_transparency")

    public val instanceSetCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_custom_aabb")

    public val instanceAttachSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_attach_skeleton")

    public val instanceSetExtraVisibilityMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_extra_visibility_margin")

    public val instanceSetVisibilityParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_visibility_parent")

    public val instanceSetIgnoreCullingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_ignore_culling")

    public val instanceGeometrySetFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_flag")

    public val instanceGeometrySetCastShadowsSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_cast_shadows_setting")

    public val instanceGeometrySetMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_material_override")

    public val instanceGeometrySetMaterialOverlayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_material_overlay")

    public val instanceGeometrySetVisibilityRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_visibility_range")

    public val instanceGeometrySetLightmapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_lightmap")

    public val instanceGeometrySetLodBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_lod_bias")

    public val instanceGeometrySetShaderParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_shader_parameter")

    public val instanceGeometryGetShaderParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_get_shader_parameter")

    public val instanceGeometryGetShaderParameterDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_get_shader_parameter_default_value")

    public val instanceGeometryGetShaderParameterListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_get_shader_parameter_list")

    public val instancesCullAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instances_cull_aabb")

    public val instancesCullRayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instances_cull_ray")

    public val instancesCullConvexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instances_cull_convex")

    public val bakeRenderUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "bake_render_uv2")

    public val canvasCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_create")

    public val canvasSetItemMirroringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_set_item_mirroring")

    public val canvasSetModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_set_modulate")

    public val canvasSetDisableScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_set_disable_scale")

    public val canvasTextureCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_texture_create")

    public val canvasTextureSetChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_texture_set_channel")

    public val canvasTextureSetShadingParametersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_texture_set_shading_parameters")

    public val canvasTextureSetTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_texture_set_texture_filter")

    public val canvasTextureSetTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_texture_set_texture_repeat")

    public val canvasItemCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_create")

    public val canvasItemSetParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_parent")

    public val canvasItemSetDefaultTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_default_texture_filter")

    public val canvasItemSetDefaultTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_default_texture_repeat")

    public val canvasItemSetVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_visible")

    public val canvasItemSetLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_light_mask")

    public val canvasItemSetVisibilityLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_visibility_layer")

    public val canvasItemSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_transform")

    public val canvasItemSetClipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_clip")

    public val canvasItemSetDistanceFieldModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_distance_field_mode")

    public val canvasItemSetCustomRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_custom_rect")

    public val canvasItemSetModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_modulate")

    public val canvasItemSetSelfModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_self_modulate")

    public val canvasItemSetDrawBehindParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_draw_behind_parent")

    public val canvasItemAddLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_line")

    public val canvasItemAddPolylinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_polyline")

    public val canvasItemAddMultilinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_multiline")

    public val canvasItemAddRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_rect")

    public val canvasItemAddCirclePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_circle")

    public val canvasItemAddTextureRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_texture_rect")

    public val canvasItemAddMsdfTextureRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_msdf_texture_rect_region")

    public val canvasItemAddLcdTextureRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_lcd_texture_rect_region")

    public val canvasItemAddTextureRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_texture_rect_region")

    public val canvasItemAddNinePatchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_nine_patch")

    public val canvasItemAddPrimitivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_primitive")

    public val canvasItemAddPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_polygon")

    public val canvasItemAddTriangleArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_triangle_array")

    public val canvasItemAddMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_mesh")

    public val canvasItemAddMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_multimesh")

    public val canvasItemAddParticlesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_particles")

    public val canvasItemAddSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_set_transform")

    public val canvasItemAddClipIgnorePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_clip_ignore")

    public val canvasItemAddAnimationSlicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_animation_slice")

    public val canvasItemSetSortChildrenByYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_sort_children_by_y")

    public val canvasItemSetZIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_z_index")

    public val canvasItemSetZAsRelativeToParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_z_as_relative_to_parent")

    public val canvasItemSetCopyToBackbufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_copy_to_backbuffer")

    public val canvasItemClearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_clear")

    public val canvasItemSetDrawIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_draw_index")

    public val canvasItemSetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_material")

    public val canvasItemSetUseParentMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_use_parent_material")

    public val canvasItemSetVisibilityNotifierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_visibility_notifier")

    public val canvasItemSetCanvasGroupModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_canvas_group_mode")

    public val debugCanvasItemGetRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "debug_canvas_item_get_rect")

    public val canvasLightCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_create")

    public val canvasLightAttachToCanvasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_attach_to_canvas")

    public val canvasLightSetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_enabled")

    public val canvasLightSetTextureScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_texture_scale")

    public val canvasLightSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_transform")

    public val canvasLightSetTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_texture")

    public val canvasLightSetTextureOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_texture_offset")

    public val canvasLightSetColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_color")

    public val canvasLightSetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_height")

    public val canvasLightSetEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_energy")

    public val canvasLightSetZRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_z_range")

    public val canvasLightSetLayerRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_layer_range")

    public val canvasLightSetItemCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_item_cull_mask")

    public val canvasLightSetItemShadowCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_item_shadow_cull_mask")

    public val canvasLightSetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_mode")

    public val canvasLightSetShadowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_shadow_enabled")

    public val canvasLightSetShadowFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_shadow_filter")

    public val canvasLightSetShadowColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_shadow_color")

    public val canvasLightSetShadowSmoothPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_shadow_smooth")

    public val canvasLightSetBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_blend_mode")

    public val canvasLightOccluderCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_occluder_create")

    public val canvasLightOccluderAttachToCanvasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_occluder_attach_to_canvas")

    public val canvasLightOccluderSetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_occluder_set_enabled")

    public val canvasLightOccluderSetPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_occluder_set_polygon")

    public val canvasLightOccluderSetAsSdfCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_occluder_set_as_sdf_collision")

    public val canvasLightOccluderSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_occluder_set_transform")

    public val canvasLightOccluderSetLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_occluder_set_light_mask")

    public val canvasOccluderPolygonCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_occluder_polygon_create")

    public val canvasOccluderPolygonSetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_occluder_polygon_set_shape")

    public val canvasOccluderPolygonSetCullModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_occluder_polygon_set_cull_mode")

    public val canvasSetShadowTextureSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_set_shadow_texture_size")

    public val globalShaderParameterAddPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "global_shader_parameter_add")

    public val globalShaderParameterRemovePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "global_shader_parameter_remove")

    public val globalShaderParameterGetListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "global_shader_parameter_get_list")

    public val globalShaderParameterSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "global_shader_parameter_set")

    public val globalShaderParameterSetOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "global_shader_parameter_set_override")

    public val globalShaderParameterGetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "global_shader_parameter_get")

    public val globalShaderParameterGetTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "global_shader_parameter_get_type")

    public val freeRidPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingServer", "free_rid")

    public val requestFrameDrawnCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "request_frame_drawn_callback")

    public val hasChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "has_changed")

    public val getRenderingInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_rendering_info")

    public val getVideoAdapterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_video_adapter_name")

    public val getVideoAdapterVendorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_video_adapter_vendor")

    public val getVideoAdapterTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_video_adapter_type")

    public val getVideoAdapterApiVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_video_adapter_api_version")

    public val makeSphereMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "make_sphere_mesh")

    public val getTestCubePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_test_cube")

    public val getTestTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_test_texture")

    public val getWhiteTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_white_texture")

    public val setBootImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "set_boot_image")

    public val getDefaultClearColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_default_clear_color")

    public val setDefaultClearColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "set_default_clear_color")

    public val hasFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "has_feature")

    public val hasOsFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "has_os_feature")

    public val setDebugGenerateWireframesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "set_debug_generate_wireframes")

    public val isRenderLoopEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "is_render_loop_enabled")

    public val setRenderLoopEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "set_render_loop_enabled")

    public val getFrameSetupTimeCpuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_frame_setup_time_cpu")

    public val forceSyncPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingServer", "force_sync")

    public val forceDrawPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingServer", "force_draw")

    public val getRenderingDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_rendering_device")

    public val createLocalRenderingDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "create_local_rendering_device")

    public val callOnRenderThreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "call_on_render_thread")
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
