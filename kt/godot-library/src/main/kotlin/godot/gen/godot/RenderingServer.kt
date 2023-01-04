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
import godot.core.PackedStringArray
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
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_INT_64_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
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
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Server for anything visible.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/performance/using_servers.html]($DOCS_URL/tutorials/performance/using_servers.html)
 *
 * Server for anything visible. The rendering server is the API backend for everything visible. The whole scene system mounts on it to display.
 *
 * The rendering server is completely opaque, the internals are entirely implementation specific and cannot be accessed.
 *
 * The rendering server can be used to bypass the scene system entirely.
 *
 * Resources are created using the `*_create` functions.
 *
 * All objects are drawn to a viewport. You can use the [godot.Viewport] attached to the [godot.SceneTree] or you can create one yourself with [viewportCreate]. When using a custom scenario or canvas, the scenario or canvas needs to be attached to the viewport using [viewportSetScenario] or [viewportAttachCanvas].
 *
 * In 3D, all visual objects must be associated with a scenario. The scenario is a visual representation of the world. If accessing the rendering server from a running game, the scenario can be accessed from the scene tree from any [godot.Node3D] node with [godot.Node3D.getWorld3d]. Otherwise, a scenario can be created with [scenarioCreate].
 *
 * Similarly, in 2D, a canvas is needed to draw all canvas items.
 *
 * In 3D, all visible objects are comprised of a resource and an instance. A resource can be a mesh, a particle system, a light, or any other 3D object. In order to be visible resources must be attached to an instance using [instanceSetBase]. The instance must also be attached to the scenario using [instanceSetScenario] in order to be visible.
 *
 * In 2D, all visible objects are some form of canvas item. In order to be visible, a canvas item needs to be the child of a canvas attached to a viewport, or it needs to be the child of another canvas item that is eventually attached to the canvas.
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
   * Max number of glow levels that can be used with glow post-process effect.
   */
  public final const val MAX_GLOW_LEVELS: Long = 7

  /**
   * Unused enum in Godot 3.x.
   */
  public final const val MAX_CURSORS: Long = 8

  /**
   *
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
   *
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
    rawPtr = TransferContext.getSingleton(ENGINECLASS_RENDERINGSERVER)
    return false
  }

  /**
   *
   */
  public fun texture2dCreate(image: Image): RID {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_2D_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun texture2dLayeredCreate(layers: VariantArray<Image>, layeredType: TextureLayeredType):
      RID {
    TransferContext.writeArguments(ARRAY to layers, LONG to layeredType.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_2D_LAYERED_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun texture3dCreate(
    format: Image.Format,
    width: Long,
    height: Long,
    depth: Long,
    mipmaps: Boolean,
    `data`: VariantArray<Image>
  ): RID {
    TransferContext.writeArguments(LONG to format.id, LONG to width, LONG to height, LONG to depth, BOOL to mipmaps, ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_3D_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun textureProxyCreate(base: RID): RID {
    TransferContext.writeArguments(_RID to base)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_PROXY_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun texture2dUpdate(
    texture: RID,
    image: Image,
    layer: Long
  ): Unit {
    TransferContext.writeArguments(_RID to texture, OBJECT to image, LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_2D_UPDATE,
        NIL)
  }

  /**
   *
   */
  public fun texture3dUpdate(texture: RID, `data`: VariantArray<Image>): Unit {
    TransferContext.writeArguments(_RID to texture, ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_3D_UPDATE,
        NIL)
  }

  /**
   *
   */
  public fun textureProxyUpdate(texture: RID, proxyTo: RID): Unit {
    TransferContext.writeArguments(_RID to texture, _RID to proxyTo)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_PROXY_UPDATE, NIL)
  }

  /**
   *
   */
  public fun texture2dPlaceholderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_2D_PLACEHOLDER_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun texture2dLayeredPlaceholderCreate(layeredType: TextureLayeredType): RID {
    TransferContext.writeArguments(LONG to layeredType.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_2D_LAYERED_PLACEHOLDER_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun texture3dPlaceholderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_3D_PLACEHOLDER_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun texture2dGet(texture: RID): Image? {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_2D_GET,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   *
   */
  public fun texture2dLayerGet(texture: RID, layer: Long): Image? {
    TransferContext.writeArguments(_RID to texture, LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_2D_LAYER_GET, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   *
   */
  public fun texture3dGet(texture: RID): VariantArray<Image> {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_3D_GET,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Image>
  }

  /**
   *
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
    width: Long,
    height: Long
  ): Unit {
    TransferContext.writeArguments(_RID to texture, LONG to width, LONG to height)
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
    return TransferContext.readReturnValue(STRING, false) as String
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
  public fun textureGetRdTexture(texture: RID, srgb: Boolean = false): RID {
    TransferContext.writeArguments(_RID to texture, BOOL to srgb)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_TEXTURE_GET_RD_TEXTURE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Creates an empty shader and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `shader_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   */
  public fun shaderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SHADER_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun shaderSetCode(shader: RID, code: String): Unit {
    TransferContext.writeArguments(_RID to shader, STRING to code)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SHADER_SET_CODE,
        NIL)
  }

  /**
   *
   */
  public fun shaderSetPathHint(shader: RID, path: String): Unit {
    TransferContext.writeArguments(_RID to shader, STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SHADER_SET_PATH_HINT, NIL)
  }

  /**
   * Returns a shader's code.
   */
  public fun shaderGetCode(shader: RID): String {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SHADER_GET_CODE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the parameters of a shader.
   */
  public fun getShaderParameterList(shader: RID): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_SHADER_PARAMETER_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>
  }

  /**
   *
   */
  public fun shaderGetParameterDefault(shader: RID, name: StringName): Any? {
    TransferContext.writeArguments(_RID to shader, STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SHADER_GET_PARAMETER_DEFAULT, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Sets a shader's default texture. Overwrites the texture given by name.
   *
   * **Note:** If the sampler array is used use [index] to access the specified texture.
   */
  public fun shaderSetDefaultTextureParameter(
    shader: RID,
    name: StringName,
    texture: RID,
    index: Long = 0
  ): Unit {
    TransferContext.writeArguments(_RID to shader, STRING_NAME to name, _RID to texture, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SHADER_SET_DEFAULT_TEXTURE_PARAMETER, NIL)
  }

  /**
   * Returns a default texture from a shader searched by name.
   *
   * **Note:** If the sampler array is used use [index] to access the specified texture.
   */
  public fun shaderGetDefaultTextureParameter(
    shader: RID,
    name: StringName,
    index: Long = 0
  ): RID {
    TransferContext.writeArguments(_RID to shader, STRING_NAME to name, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SHADER_GET_DEFAULT_TEXTURE_PARAMETER, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Creates an empty material and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `material_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   */
  public fun materialCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MATERIAL_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
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
    `value`: Any
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
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Sets a material's render priority.
   */
  public fun materialSetRenderPriority(material: RID, priority: Long): Unit {
    TransferContext.writeArguments(_RID to material, LONG to priority)
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
  public fun meshCreateFromSurfaces(surfaces: VariantArray<Dictionary<Any?, Any?>>,
      blendShapeCount: Long = 0): RID {
    TransferContext.writeArguments(ARRAY to surfaces, LONG to blendShapeCount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_CREATE_FROM_SURFACES, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Creates a new mesh and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `mesh_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   *
   * To place in a scene, attach this mesh to an instance using [instanceSetBase] using the returned RID.
   */
  public fun meshCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun meshSurfaceGetFormatOffset(
    format: Long,
    vertexCount: Long,
    arrayIndex: Long
  ): Long {
    TransferContext.writeArguments(LONG to format, LONG to vertexCount, LONG to arrayIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_GET_FORMAT_OFFSET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun meshSurfaceGetFormatVertexStride(format: Long, vertexCount: Long): Long {
    TransferContext.writeArguments(LONG to format, LONG to vertexCount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_GET_FORMAT_VERTEX_STRIDE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun meshSurfaceGetFormatAttributeStride(format: Long, vertexCount: Long): Long {
    TransferContext.writeArguments(LONG to format, LONG to vertexCount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_GET_FORMAT_ATTRIBUTE_STRIDE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun meshSurfaceGetFormatSkinStride(format: Long, vertexCount: Long): Long {
    TransferContext.writeArguments(LONG to format, LONG to vertexCount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_GET_FORMAT_SKIN_STRIDE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
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
  public fun meshAddSurfaceFromArrays(
    mesh: RID,
    primitive: PrimitiveType,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<Any?> = godot.core.variantArrayOf(),
    lods: Dictionary<Any?, Any?> = Dictionary(),
    compressFormat: Long = 0
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to primitive.id, ARRAY to arrays, ARRAY to blendShapes, DICTIONARY to lods, LONG to compressFormat)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_ADD_SURFACE_FROM_ARRAYS, NIL)
  }

  /**
   * Returns a mesh's blend shape count.
   */
  public fun meshGetBlendShapeCount(mesh: RID): Long {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_GET_BLEND_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
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
    return RenderingServer.BlendShapeMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets a mesh's surface's material.
   */
  public fun meshSurfaceSetMaterial(
    mesh: RID,
    surface: Long,
    material: RID
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to surface, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_SET_MATERIAL, NIL)
  }

  /**
   * Returns a mesh's surface's material.
   */
  public fun meshSurfaceGetMaterial(mesh: RID, surface: Long): RID {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_GET_MATERIAL, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun meshGetSurface(mesh: RID, surface: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_GET_SURFACE,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns a mesh's surface's buffer arrays.
   */
  public fun meshSurfaceGetArrays(mesh: RID, surface: Long): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_GET_ARRAYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a mesh's surface's arrays for blend shapes.
   */
  public fun meshSurfaceGetBlendShapeArrays(mesh: RID, surface: Long):
      VariantArray<VariantArray<Any?>> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_GET_BLEND_SHAPE_ARRAYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<VariantArray<Any?>>
  }

  /**
   * Returns a mesh's number of surfaces.
   */
  public fun meshGetSurfaceCount(mesh: RID): Long {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_GET_SURFACE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
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
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
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
    surface: Long,
    offset: Long,
    `data`: PackedByteArray
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to surface, LONG to offset, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_UPDATE_VERTEX_REGION, NIL)
  }

  /**
   *
   */
  public fun meshSurfaceUpdateAttributeRegion(
    mesh: RID,
    surface: Long,
    offset: Long,
    `data`: PackedByteArray
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to surface, LONG to offset, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MESH_SURFACE_UPDATE_ATTRIBUTE_REGION, NIL)
  }

  /**
   *
   */
  public fun meshSurfaceUpdateSkinRegion(
    mesh: RID,
    surface: Long,
    offset: Long,
    `data`: PackedByteArray
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to surface, LONG to offset, PACKED_BYTE_ARRAY to data)
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
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   *
   * To place in a scene, attach this multimesh to an instance using [instanceSetBase] using the returned RID.
   */
  public fun multimeshCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun multimeshAllocateData(
    multimesh: RID,
    instances: Long,
    transformFormat: MultimeshTransformFormat,
    colorFormat: Boolean = false,
    customDataFormat: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to instances, LONG to transformFormat.id, BOOL to colorFormat, BOOL to customDataFormat)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_ALLOCATE_DATA, NIL)
  }

  /**
   * Returns the number of instances allocated for this multimesh.
   */
  public fun multimeshGetInstanceCount(multimesh: RID): Long {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_GET_INSTANCE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
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
    index: Long,
    transform: Transform3D
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_SET_TRANSFORM, NIL)
  }

  /**
   * Sets the [godot.core.Transform2D] for this instance. For use when multimesh is used in 2D. Equivalent to [godot.MultiMesh.setInstanceTransform2d].
   */
  public fun multimeshInstanceSetTransform2d(
    multimesh: RID,
    index: Long,
    transform: Transform2D
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_SET_TRANSFORM_2D, NIL)
  }

  /**
   * Sets the color by which this instance will be modulated. Equivalent to [godot.MultiMesh.setInstanceColor].
   */
  public fun multimeshInstanceSetColor(
    multimesh: RID,
    index: Long,
    color: Color
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_SET_COLOR, NIL)
  }

  /**
   * Sets the custom data for this instance. Custom data is passed as a [godot.core.Color], but is interpreted as a `vec4` in the shader. Equivalent to [godot.MultiMesh.setInstanceCustomData].
   */
  public fun multimeshInstanceSetCustomData(
    multimesh: RID,
    index: Long,
    customData: Color
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index, COLOR to customData)
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
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Calculates and returns the axis-aligned bounding box that encloses all instances within the multimesh.
   */
  public fun multimeshGetAabb(multimesh: RID): AABB {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_GET_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Returns the [godot.Transform3D] of the specified instance.
   */
  public fun multimeshInstanceGetTransform(multimesh: RID, index: Long): Transform3D {
    TransferContext.writeArguments(_RID to multimesh, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_GET_TRANSFORM, TRANSFORM3D)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Returns the [godot.core.Transform2D] of the specified instance. For use when the multimesh is set to use 2D transforms.
   */
  public fun multimeshInstanceGetTransform2d(multimesh: RID, index: Long): Transform2D {
    TransferContext.writeArguments(_RID to multimesh, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_GET_TRANSFORM_2D, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Returns the color by which the specified instance will be modulated.
   */
  public fun multimeshInstanceGetColor(multimesh: RID, index: Long): Color {
    TransferContext.writeArguments(_RID to multimesh, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_GET_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the custom data associated with the specified instance.
   */
  public fun multimeshInstanceGetCustomData(multimesh: RID, index: Long): Color {
    TransferContext.writeArguments(_RID to multimesh, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_INSTANCE_GET_CUSTOM_DATA, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Sets the number of instances visible at a given time. If -1, all instances that have been allocated are drawn. Equivalent to [godot.MultiMesh.visibleInstanceCount].
   */
  public fun multimeshSetVisibleInstances(multimesh: RID, visible: Long): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to visible)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_SET_VISIBLE_INSTANCES, NIL)
  }

  /**
   * Returns the number of visible instances for this multimesh.
   */
  public fun multimeshGetVisibleInstances(multimesh: RID): Long {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_GET_VISIBLE_INSTANCES, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun multimeshSetBuffer(multimesh: RID, buffer: PackedFloat32Array): Unit {
    TransferContext.writeArguments(_RID to multimesh, PACKED_FLOAT_32_ARRAY to buffer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_SET_BUFFER, NIL)
  }

  /**
   *
   */
  public fun multimeshGetBuffer(multimesh: RID): PackedFloat32Array {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MULTIMESH_GET_BUFFER, PACKED_FLOAT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array
  }

  /**
   * Creates a skeleton and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `skeleton_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   */
  public fun skeletonCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun skeletonAllocateData(
    skeleton: RID,
    bones: Long,
    is2dSkeleton: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to skeleton, LONG to bones, BOOL to is2dSkeleton)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_ALLOCATE_DATA, NIL)
  }

  /**
   * Returns the number of bones allocated for this skeleton.
   */
  public fun skeletonGetBoneCount(skeleton: RID): Long {
    TransferContext.writeArguments(_RID to skeleton)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_GET_BONE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the [godot.Transform3D] for a specific bone of this skeleton.
   */
  public fun skeletonBoneSetTransform(
    skeleton: RID,
    bone: Long,
    transform: Transform3D
  ): Unit {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_BONE_SET_TRANSFORM, NIL)
  }

  /**
   * Returns the [godot.Transform3D] set for a specific bone of this skeleton.
   */
  public fun skeletonBoneGetTransform(skeleton: RID, bone: Long): Transform3D {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_BONE_GET_TRANSFORM, TRANSFORM3D)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Sets the [godot.core.Transform2D] for a specific bone of this skeleton.
   */
  public fun skeletonBoneSetTransform2d(
    skeleton: RID,
    bone: Long,
    transform: Transform2D
  ): Unit {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_BONE_SET_TRANSFORM_2D, NIL)
  }

  /**
   * Returns the [godot.core.Transform2D] set for a specific bone of this skeleton.
   */
  public fun skeletonBoneGetTransform2d(skeleton: RID, bone: Long): Transform2D {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKELETON_BONE_GET_TRANSFORM_2D, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
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
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   *
   * To place in a scene, attach this directional light to an instance using [instanceSetBase] using the returned RID.
   */
  public fun directionalLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DIRECTIONAL_LIGHT_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Creates a new omni light and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID can be used in most `light_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   *
   * To place in a scene, attach this omni light to an instance using [instanceSetBase] using the returned RID.
   */
  public fun omniLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_OMNI_LIGHT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Creates a spot light and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID can be used in most `light_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   *
   * To place in a scene, attach this spot light to an instance using [instanceSetBase] using the returned RID.
   */
  public fun spotLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SPOT_LIGHT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
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
   * Sets the specified light parameter. See [enum LightParam] for options. Equivalent to [godot.Light3D.setParam].
   */
  public fun lightSetParam(
    light: RID,
    `param`: LightParam,
    `value`: Double
  ): Unit {
    TransferContext.writeArguments(_RID to light, LONG to param.id, DOUBLE to value)
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
   * Not implemented in Godot 3.x.
   */
  public fun lightSetProjector(light: RID, texture: RID): Unit {
    TransferContext.writeArguments(_RID to light, _RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_SET_PROJECTOR,
        NIL)
  }

  /**
   * If `true`, light will subtract light instead of adding light. Equivalent to [godot.Light3D.lightNegative].
   */
  public fun lightSetNegative(light: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_SET_NEGATIVE,
        NIL)
  }

  /**
   * Sets the cull mask for this Light3D. Lights only affect objects in the selected layers. Equivalent to [godot.Light3D.lightCullMask].
   */
  public fun lightSetCullMask(light: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mask)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_SET_CULL_MASK,
        NIL)
  }

  /**
   * Sets the distance fade for this Light3D. This acts as a form of level of detail (LOD) and can be used to improve performance. Equivalent to [godot.Light3D.distanceFadeEnabled], [godot.Light3D.distanceFadeBegin], [godot.Light3D.distanceFadeShadow], and [godot.Light3D.distanceFadeLength].
   */
  public fun lightSetDistanceFade(
    decal: RID,
    enabled: Boolean,
    begin: Double,
    shadow: Double,
    length: Double
  ): Unit {
    TransferContext.writeArguments(_RID to decal, BOOL to enabled, DOUBLE to begin, DOUBLE to shadow, DOUBLE to length)
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
   *
   */
  public fun lightSetBakeMode(light: RID, bakeMode: LightBakeMode): Unit {
    TransferContext.writeArguments(_RID to light, LONG to bakeMode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_SET_BAKE_MODE,
        NIL)
  }

  /**
   *
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
   *
   */
  public fun lightProjectorsSetFilter(filter: LightProjectorFilter): Unit {
    TransferContext.writeArguments(LONG to filter.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHT_PROJECTORS_SET_FILTER, NIL)
  }

  /**
   *
   */
  public fun positionalSoftShadowFilterSetQuality(quality: ShadowQuality): Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_POSITIONAL_SOFT_SHADOW_FILTER_SET_QUALITY, NIL)
  }

  /**
   *
   */
  public fun directionalSoftShadowFilterSetQuality(quality: ShadowQuality): Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DIRECTIONAL_SOFT_SHADOW_FILTER_SET_QUALITY, NIL)
  }

  /**
   *
   */
  public fun directionalShadowAtlasSetSize(size: Long, is16bits: Boolean): Unit {
    TransferContext.writeArguments(LONG to size, BOOL to is16bits)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DIRECTIONAL_SHADOW_ATLAS_SET_SIZE, NIL)
  }

  /**
   * Creates a reflection probe and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `reflection_probe_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   *
   * To place in a scene, attach this reflection probe to an instance using [instanceSetBase] using the returned RID.
   */
  public fun reflectionProbeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
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
  public fun reflectionProbeSetIntensity(probe: RID, intensity: Double): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to intensity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_INTENSITY, NIL)
  }

  /**
   *
   */
  public fun reflectionProbeSetAmbientMode(probe: RID, mode: ReflectionProbeAmbientMode): Unit {
    TransferContext.writeArguments(_RID to probe, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_AMBIENT_MODE, NIL)
  }

  /**
   *
   */
  public fun reflectionProbeSetAmbientColor(probe: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to probe, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_AMBIENT_COLOR, NIL)
  }

  /**
   *
   */
  public fun reflectionProbeSetAmbientEnergy(probe: RID, energy: Double): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to energy)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_AMBIENT_ENERGY, NIL)
  }

  /**
   * Sets the max distance away from the probe an object can be before it is culled. Equivalent to [godot.ReflectionProbe.maxDistance].
   */
  public fun reflectionProbeSetMaxDistance(probe: RID, distance: Double): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to distance)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_MAX_DISTANCE, NIL)
  }

  /**
   * Sets the size of the area that the reflection probe will capture. Equivalent to [godot.ReflectionProbe.extents].
   */
  public fun reflectionProbeSetExtents(probe: RID, extents: Vector3): Unit {
    TransferContext.writeArguments(_RID to probe, VECTOR3 to extents)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_EXTENTS, NIL)
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
   *
   */
  public fun reflectionProbeSetResolution(probe: RID, resolution: Long): Unit {
    TransferContext.writeArguments(_RID to probe, LONG to resolution)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_RESOLUTION, NIL)
  }

  /**
   *
   */
  public fun reflectionProbeSetMeshLodThreshold(probe: RID, pixels: Double): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to pixels)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_REFLECTION_PROBE_SET_MESH_LOD_THRESHOLD, NIL)
  }

  /**
   *
   */
  public fun decalCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun decalSetExtents(decal: RID, extents: Vector3): Unit {
    TransferContext.writeArguments(_RID to decal, VECTOR3 to extents)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_EXTENTS,
        NIL)
  }

  /**
   *
   */
  public fun decalSetTexture(
    decal: RID,
    type: DecalTexture,
    texture: RID
  ): Unit {
    TransferContext.writeArguments(_RID to decal, LONG to type.id, _RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_TEXTURE,
        NIL)
  }

  /**
   *
   */
  public fun decalSetEmissionEnergy(decal: RID, energy: Double): Unit {
    TransferContext.writeArguments(_RID to decal, DOUBLE to energy)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_EMISSION_ENERGY, NIL)
  }

  /**
   *
   */
  public fun decalSetAlbedoMix(decal: RID, albedoMix: Double): Unit {
    TransferContext.writeArguments(_RID to decal, DOUBLE to albedoMix)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_ALBEDO_MIX, NIL)
  }

  /**
   *
   */
  public fun decalSetModulate(decal: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to decal, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_MODULATE,
        NIL)
  }

  /**
   *
   */
  public fun decalSetCullMask(decal: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to decal, LONG to mask)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_CULL_MASK,
        NIL)
  }

  /**
   *
   */
  public fun decalSetDistanceFade(
    decal: RID,
    enabled: Boolean,
    begin: Double,
    length: Double
  ): Unit {
    TransferContext.writeArguments(_RID to decal, BOOL to enabled, DOUBLE to begin, DOUBLE to length)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_DISTANCE_FADE, NIL)
  }

  /**
   *
   */
  public fun decalSetFade(
    decal: RID,
    above: Double,
    below: Double
  ): Unit {
    TransferContext.writeArguments(_RID to decal, DOUBLE to above, DOUBLE to below)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_FADE, NIL)
  }

  /**
   *
   */
  public fun decalSetNormalFade(decal: RID, fade: Double): Unit {
    TransferContext.writeArguments(_RID to decal, DOUBLE to fade)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECAL_SET_NORMAL_FADE, NIL)
  }

  /**
   *
   */
  public fun decalsSetFilter(filter: DecalFilter): Unit {
    TransferContext.writeArguments(LONG to filter.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_DECALS_SET_FILTER,
        NIL)
  }

  /**
   * If [halfResolution] is `true`, renders [godot.VoxelGI] and SDFGI ([godot.Environment.sdfgiEnabled]) buffers at halved resolution (e.g. 960×540 when the viewport size is 1920×1080). This improves performance significantly when VoxelGI or SDFGI is enabled, at the cost of artifacts that may be visible on polygon edges. The loss in quality becomes less noticeable as the viewport resolution increases. [godot.LightmapGI] rendering is not affected by this setting. See also [godot.ProjectSettings.rendering/globalIllumination/gi/useHalfResolution].
   */
  public fun giSetUseHalfResolution(halfResolution: Boolean): Unit {
    TransferContext.writeArguments(BOOL to halfResolution)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GI_SET_USE_HALF_RESOLUTION, NIL)
  }

  /**
   *
   */
  public fun voxelGiCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
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
    levelCounts: PackedInt32Array
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
    return TransferContext.readReturnValue(VECTOR3I, false) as Vector3i
  }

  /**
   *
   */
  public fun voxelGiGetOctreeCells(voxelGi: RID): PackedByteArray {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_GET_OCTREE_CELLS, PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   *
   */
  public fun voxelGiGetDataCells(voxelGi: RID): PackedByteArray {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_GET_DATA_CELLS, PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   *
   */
  public fun voxelGiGetDistanceField(voxelGi: RID): PackedByteArray {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_GET_DISTANCE_FIELD, PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   *
   */
  public fun voxelGiGetLevelCounts(voxelGi: RID): PackedInt32Array {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_GET_LEVEL_COUNTS, PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   *
   */
  public fun voxelGiGetToCellXform(voxelGi: RID): Transform3D {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_GET_TO_CELL_XFORM, TRANSFORM3D)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   *
   */
  public fun voxelGiSetDynamicRange(voxelGi: RID, range: Double): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to range)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_DYNAMIC_RANGE, NIL)
  }

  /**
   *
   */
  public fun voxelGiSetPropagation(voxelGi: RID, amount: Double): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to amount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_PROPAGATION, NIL)
  }

  /**
   *
   */
  public fun voxelGiSetEnergy(voxelGi: RID, energy: Double): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to energy)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_ENERGY,
        NIL)
  }

  /**
   * Used to inform the renderer what exposure normalization value was used while baking the voxel gi. This value will be used and modulated at run time to ensure that the voxel gi maintains a consistent level of exposure even if the scene-wide exposure normalization is changed at run time. For more information see [cameraAttributesSetExposure].
   */
  public fun voxelGiSetBakedExposureNormalization(voxelGi: RID, bakedExposure: Double): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to bakedExposure)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_BAKED_EXPOSURE_NORMALIZATION, NIL)
  }

  /**
   *
   */
  public fun voxelGiSetBias(voxelGi: RID, bias: Double): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to bias)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_BIAS,
        NIL)
  }

  /**
   *
   */
  public fun voxelGiSetNormalBias(voxelGi: RID, bias: Double): Unit {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to bias)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_NORMAL_BIAS, NIL)
  }

  /**
   *
   */
  public fun voxelGiSetInterior(voxelGi: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to voxelGi, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_INTERIOR, NIL)
  }

  /**
   *
   */
  public fun voxelGiSetUseTwoBounces(voxelGi: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to voxelGi, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_USE_TWO_BOUNCES, NIL)
  }

  /**
   *
   */
  public fun voxelGiSetQuality(quality: VoxelGIQuality): Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VOXEL_GI_SET_QUALITY, NIL)
  }

  /**
   *
   */
  public fun lightmapCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun lightmapSetTextures(
    lightmap: RID,
    light: RID,
    usesSh: Boolean
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
    bspTree: PackedInt32Array
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
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  /**
   *
   */
  public fun lightmapGetProbeCaptureSh(lightmap: RID): PackedColorArray {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_GET_PROBE_CAPTURE_SH, PACKED_COLOR_ARRAY)
    return TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray
  }

  /**
   *
   */
  public fun lightmapGetProbeCaptureTetrahedra(lightmap: RID): PackedInt32Array {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_GET_PROBE_CAPTURE_TETRAHEDRA,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   *
   */
  public fun lightmapGetProbeCaptureBspTree(lightmap: RID): PackedInt32Array {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_GET_PROBE_CAPTURE_BSP_TREE,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Used to inform the renderer what exposure normalization value was used while baking the lightmap. This value will be used and modulated at run time to ensure that the lightmap maintains a consistent level of exposure even if the scene-wide exposure normalization is changed at run time. For more information see [cameraAttributesSetExposure].
   */
  public fun lightmapSetBakedExposureNormalization(lightmap: RID, bakedExposure: Double): Unit {
    TransferContext.writeArguments(_RID to lightmap, DOUBLE to bakedExposure)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_SET_BAKED_EXPOSURE_NORMALIZATION, NIL)
  }

  /**
   *
   */
  public fun lightmapSetProbeCaptureUpdateSpeed(speed: Double): Unit {
    TransferContext.writeArguments(DOUBLE to speed)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_LIGHTMAP_SET_PROBE_CAPTURE_UPDATE_SPEED, NIL)
  }

  /**
   * Creates a particle system and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `particles_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   *
   * To place in a scene, attach these particles to an instance using [instanceSetBase] using the returned RID.
   */
  public fun particlesCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
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
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the number of particles to be drawn and allocates the memory for them. Equivalent to [godot.GPUParticles3D.amount].
   */
  public fun particlesSetAmount(particles: RID, amount: Long): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to amount)
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
  public fun particlesSetExplosivenessRatio(particles: RID, ratio: Double): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to ratio)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_EXPLOSIVENESS_RATIO, NIL)
  }

  /**
   * Sets the emission randomness ratio. This randomizes the emission of particles within their phase. Equivalent to [godot.GPUParticles3D.randomness].
   */
  public fun particlesSetRandomnessRatio(particles: RID, ratio: Double): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to ratio)
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
  public fun particlesSetFixedFps(particles: RID, fps: Long): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to fps)
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
  public fun particlesSetCollisionBaseSize(particles: RID, size: Double): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to size)
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
   *
   */
  public fun particlesSetTrails(
    particles: RID,
    enable: Boolean,
    lengthSec: Double
  ): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to enable, DOUBLE to lengthSec)
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
    return TransferContext.readReturnValue(BOOL, false) as Boolean
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
   *
   */
  public fun particlesEmit(
    particles: RID,
    transform: Transform3D,
    velocity: Vector3,
    color: Color,
    custom: Color,
    emitFlags: Long
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
  public fun particlesSetDrawPasses(particles: RID, count: Long): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to count)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_SET_DRAW_PASSES, NIL)
  }

  /**
   * Sets the mesh to be used for the specified draw pass. Equivalent to [godot.GPUParticles3D.drawPass1], [godot.GPUParticles3D.drawPass2], [godot.GPUParticles3D.drawPass3], and [godot.GPUParticles3D.drawPass4].
   */
  public fun particlesSetDrawPassMesh(
    particles: RID,
    pass: Long,
    mesh: RID
  ): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to pass, _RID to mesh)
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
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
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
   *
   */
  public fun particlesCollisionCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun particlesCollisionSetCollisionType(particlesCollision: RID,
      type: ParticlesCollisionType): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, LONG to type.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_COLLISION_TYPE, NIL)
  }

  /**
   *
   */
  public fun particlesCollisionSetCullMask(particlesCollision: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_CULL_MASK, NIL)
  }

  /**
   *
   */
  public fun particlesCollisionSetSphereRadius(particlesCollision: RID, radius: Double): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to radius)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_SPHERE_RADIUS, NIL)
  }

  /**
   *
   */
  public fun particlesCollisionSetBoxExtents(particlesCollision: RID, extents: Vector3): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, VECTOR3 to extents)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_BOX_EXTENTS, NIL)
  }

  /**
   *
   */
  public fun particlesCollisionSetAttractorStrength(particlesCollision: RID, setrngth: Double):
      Unit {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to setrngth)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_ATTRACTOR_STRENGTH, NIL)
  }

  /**
   *
   */
  public fun particlesCollisionSetAttractorDirectionality(particlesCollision: RID, amount: Double):
      Unit {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to amount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_ATTRACTOR_DIRECTIONALITY,
        NIL)
  }

  /**
   *
   */
  public fun particlesCollisionSetAttractorAttenuation(particlesCollision: RID, curve: Double):
      Unit {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to curve)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_ATTRACTOR_ATTENUATION, NIL)
  }

  /**
   *
   */
  public fun particlesCollisionSetFieldTexture(particlesCollision: RID, texture: RID): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_FIELD_TEXTURE, NIL)
  }

  /**
   *
   */
  public fun particlesCollisionHeightFieldUpdate(particlesCollision: RID): Unit {
    TransferContext.writeArguments(_RID to particlesCollision)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_HEIGHT_FIELD_UPDATE, NIL)
  }

  /**
   *
   */
  public fun particlesCollisionSetHeightFieldResolution(particlesCollision: RID,
      resolution: ParticlesCollisionHeightfieldResolution): Unit {
    TransferContext.writeArguments(_RID to particlesCollision, LONG to resolution.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_PARTICLES_COLLISION_SET_HEIGHT_FIELD_RESOLUTION,
        NIL)
  }

  /**
   * Creates a new fog volume and allocates an RID.
   */
  public fun fogVolumeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_FOG_VOLUME_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
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
  public fun fogVolumeSetExtents(fogVolume: RID, extents: Vector3): Unit {
    TransferContext.writeArguments(_RID to fogVolume, VECTOR3 to extents)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_FOG_VOLUME_SET_EXTENTS, NIL)
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
   *
   */
  public fun visibilityNotifierCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VISIBILITY_NOTIFIER_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
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
    exitCallable: Callable
  ): Unit {
    TransferContext.writeArguments(_RID to notifier, CALLABLE to enterCallable, CALLABLE to exitCallable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VISIBILITY_NOTIFIER_SET_CALLBACKS, NIL)
  }

  /**
   *
   */
  public fun occluderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_OCCLUDER_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun occluderSetMesh(
    occluder: RID,
    vertices: PackedVector3Array,
    indices: PackedInt32Array
  ): Unit {
    TransferContext.writeArguments(_RID to occluder, PACKED_VECTOR3_ARRAY to vertices, PACKED_INT_32_ARRAY to indices)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_OCCLUDER_SET_MESH,
        NIL)
  }

  /**
   * Creates a camera and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `camera_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   */
  public fun cameraCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets camera to use perspective projection. Objects on the screen becomes smaller when they are far away.
   */
  public fun cameraSetPerspective(
    camera: RID,
    fovyDegrees: Double,
    zNear: Double,
    zFar: Double
  ): Unit {
    TransferContext.writeArguments(_RID to camera, DOUBLE to fovyDegrees, DOUBLE to zNear, DOUBLE to zFar)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_SET_PERSPECTIVE, NIL)
  }

  /**
   * Sets camera to use orthogonal projection, also known as orthographic projection. Objects remain the same size on the screen no matter how far away they are.
   */
  public fun cameraSetOrthogonal(
    camera: RID,
    size: Double,
    zNear: Double,
    zFar: Double
  ): Unit {
    TransferContext.writeArguments(_RID to camera, DOUBLE to size, DOUBLE to zNear, DOUBLE to zFar)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_SET_ORTHOGONAL, NIL)
  }

  /**
   * Sets camera to use frustum projection. This mode allows adjusting the [offset] argument to create "tilted frustum" effects.
   */
  public fun cameraSetFrustum(
    camera: RID,
    size: Double,
    offset: Vector2,
    zNear: Double,
    zFar: Double
  ): Unit {
    TransferContext.writeArguments(_RID to camera, DOUBLE to size, VECTOR2 to offset, DOUBLE to zNear, DOUBLE to zFar)
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
   *
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
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   */
  public fun viewportCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
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
   * Sets the viewport's width and height.
   */
  public fun viewportSetSize(
    viewport: RID,
    width: Long,
    height: Long
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to width, LONG to height)
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
   * Sets the viewport's parent to another viewport.
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
  public fun viewportAttachToScreen(
    viewport: RID,
    rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    screen: Long = 0
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, RECT2 to rect, LONG to screen)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_ATTACH_TO_SCREEN, NIL)
  }

  /**
   * If `true`, render the contents of the viewport directly to screen. This allows a low-level optimization where you can skip drawing a viewport to the root viewport. While this optimization can result in a significant increase in speed (especially on older devices), it comes at a cost of usability. When this is enabled, you cannot read from the viewport or from the `SCREEN_TEXTURE`. You also lose the benefit of certain window settings, such as the various stretch modes. Another consequence to be aware of is that in 2D the rendering happens in window coordinates, so if you have a viewport that is double the size of the window, and you set this, then only the portion that fits within the window will be drawn, no automatic scaling is possible, even if your game scene is significantly larger than the window size.
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
   * Sets scaling 3d mode. Bilinear scaling renders at different resolution to either undersample or supersample the viewport. FidelityFX Super Resolution 1.0, abbreviated to FSR, is an upscaling technology that produces high quality images at fast framerates by using a spatially aware upscaling algorithm. FSR is slightly more expensive than bilinear, but it produces significantly higher image quality. FSR should be used where possible.
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
  public fun viewportSetScaling3dScale(viewport: RID, scale: Double): Unit {
    TransferContext.writeArguments(_RID to viewport, DOUBLE to scale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_SCALING_3D_SCALE, NIL)
  }

  /**
   * Determines how sharp the upscaled image will be when using the FSR upscaling mode. Sharpness halves with every whole number. Values go from 0.0 (sharpest) to 2.0. Values above 2.0 won't make a visible difference.
   */
  public fun viewportSetFsrSharpness(viewport: RID, sharpness: Double): Unit {
    TransferContext.writeArguments(_RID to viewport, DOUBLE to sharpness)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_FSR_SHARPNESS, NIL)
  }

  /**
   * Affects the final texture sharpness by reading from a lower or higher mipmap (also called "texture LOD bias"). Negative values make mipmapped textures sharper but grainier when viewed at a distance, while positive values make mipmapped textures blurrier (even when up close). To get sharper textures at a distance without introducing too much graininess, set this between `-0.75` and `0.0`. Enabling temporal antialiasing ([godot.ProjectSettings.rendering/antiAliasing/quality/useTaa]) can help reduce the graininess visible when using negative mipmap bias.
   *
   * **Note:** When the 3D scaling mode is set to FSR 1.0, this value is used to adjust the automatic mipmap bias which is calculated internally based on the scale factor. The formula for this is `-log2(1.0 / scale) + mipmap_bias`.
   */
  public fun viewportSetTextureMipmapBias(viewport: RID, mipmapBias: Double): Unit {
    TransferContext.writeArguments(_RID to viewport, DOUBLE to mipmapBias)
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
   * Returns the viewport's last rendered frame.
   */
  public fun viewportGetTexture(viewport: RID): RID {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_GET_TEXTURE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun viewportSetDisable3d(viewport: RID, disable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to disable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_DISABLE_3D, NIL)
  }

  /**
   * If `true`, the viewport's canvas is not rendered.
   */
  public fun viewportSetDisable2d(viewport: RID, disable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to disable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_DISABLE_2D, NIL)
  }

  /**
   * If `true`, rendering of a viewport's environment is disabled.
   */
  public fun viewportSetDisableEnvironment(viewport: RID, disabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_DISABLE_ENVIRONMENT, NIL)
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
   * Sets a viewport's scenario.
   *
   * The scenario contains information about environment information, reflection atlas etc.
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
   *
   */
  public fun viewportSetSnap2dTransformsToPixel(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_SNAP_2D_TRANSFORMS_TO_PIXEL, NIL)
  }

  /**
   *
   */
  public fun viewportSetSnap2dVerticesToPixel(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_SNAP_2D_VERTICES_TO_PIXEL, NIL)
  }

  /**
   *
   */
  public fun viewportSetDefaultCanvasItemTextureFilter(viewport: RID,
      filter: CanvasItemTextureFilter): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to filter.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_DEFAULT_CANVAS_ITEM_TEXTURE_FILTER,
        NIL)
  }

  /**
   *
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
    offset: Transform2D
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
    layer: Long,
    sublayer: Long
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas, LONG to layer, LONG to sublayer)
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
   *
   */
  public fun viewportSetSdfOversizeAndScale(
    viewport: RID,
    oversize: ViewportSDFOversize,
    scale: ViewportSDFScale
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to oversize.id, LONG to scale.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_SDF_OVERSIZE_AND_SCALE, NIL)
  }

  /**
   * Sets the size of the shadow atlas's images (used for omni and spot lights). The value will be rounded up to the nearest power of 2.
   *
   * **Note:** If this is set to `0`, no shadows will be visible at all (including directional shadows).
   */
  public fun viewportSetPositionalShadowAtlasSize(
    viewport: RID,
    size: Long,
    use16Bits: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to size, BOOL to use16Bits)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_POSITIONAL_SHADOW_ATLAS_SIZE, NIL)
  }

  /**
   * Sets the shadow atlas quadrant's subdivision.
   */
  public fun viewportSetPositionalShadowAtlasQuadrantSubdivision(
    viewport: RID,
    quadrant: Long,
    subdivision: Long
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to quadrant, LONG to subdivision)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_POSITIONAL_SHADOW_ATLAS_QUADRANT_SUBDIVISION,
        NIL)
  }

  /**
   * Sets the multisample anti-aliasing mode for 3D. See [enum ViewportMSAA] for options.
   */
  public fun viewportSetMsaa3d(viewport: RID, msaa: ViewportMSAA): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to msaa.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_MSAA_3D, NIL)
  }

  /**
   * Sets the multisample anti-aliasing mode for 2D/Canvas. See [enum ViewportMSAA] for options.
   */
  public fun viewportSetMsaa2d(viewport: RID, msaa: ViewportMSAA): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to msaa.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_MSAA_2D, NIL)
  }

  /**
   *
   */
  public fun viewportSetScreenSpaceAa(viewport: RID, mode: ViewportScreenSpaceAA): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_SCREEN_SPACE_AA, NIL)
  }

  /**
   * If `true`, use Temporal Anti-Aliasing.
   */
  public fun viewportSetUseTaa(viewport: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_USE_TAA, NIL)
  }

  /**
   *
   */
  public fun viewportSetUseDebanding(viewport: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_USE_DEBANDING, NIL)
  }

  /**
   *
   */
  public fun viewportSetUseOcclusionCulling(viewport: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_USE_OCCLUSION_CULLING, NIL)
  }

  /**
   *
   */
  public fun viewportSetOcclusionRaysPerThread(raysPerThread: Long): Unit {
    TransferContext.writeArguments(LONG to raysPerThread)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_OCCLUSION_RAYS_PER_THREAD, NIL)
  }

  /**
   *
   */
  public fun viewportSetOcclusionCullingBuildQuality(quality: ViewportOcclusionCullingBuildQuality):
      Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_OCCLUSION_CULLING_BUILD_QUALITY, NIL)
  }

  /**
   *
   */
  public fun viewportGetRenderInfo(
    viewport: RID,
    type: ViewportRenderInfoType,
    info: ViewportRenderInfo
  ): Long {
    TransferContext.writeArguments(_RID to viewport, LONG to type.id, LONG to info.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_GET_RENDER_INFO, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
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
   *
   */
  public fun viewportSetMeasureRenderTime(viewport: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_MEASURE_RENDER_TIME, NIL)
  }

  /**
   *
   */
  public fun viewportGetMeasuredRenderTimeCpu(viewport: RID): Double {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_GET_MEASURED_RENDER_TIME_CPU, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   *
   */
  public fun viewportGetMeasuredRenderTimeGpu(viewport: RID): Double {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_GET_MEASURED_RENDER_TIME_GPU, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the Variable Rate Shading (VRS) mode for the viewport. Note, if hardware does not support VRS this property is ignored.
   */
  public fun viewportSetVrsMode(viewport: RID, mode: ViewportVRSMode): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_VRS_MODE, NIL)
  }

  /**
   * Texture to use when the VRS mode is set to [godot.RenderingServer.VIEWPORT_VRS_TEXTURE].
   */
  public fun viewportSetVrsTexture(viewport: RID, texture: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_VIEWPORT_SET_VRS_TEXTURE, NIL)
  }

  /**
   * Creates an empty sky and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `sky_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   */
  public fun skyCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKY_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun skySetRadianceSize(sky: RID, radianceSize: Long): Unit {
    TransferContext.writeArguments(_RID to sky, LONG to radianceSize)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKY_SET_RADIANCE_SIZE, NIL)
  }

  /**
   *
   */
  public fun skySetMode(sky: RID, mode: SkyMode): Unit {
    TransferContext.writeArguments(_RID to sky, LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKY_SET_MODE, NIL)
  }

  /**
   * Sets the material that the sky uses to render the background and reflection maps.
   */
  public fun skySetMaterial(sky: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to sky, _RID to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKY_SET_MATERIAL,
        NIL)
  }

  /**
   *
   */
  public fun skyBakePanorama(
    sky: RID,
    energy: Double,
    bakeIrradiance: Boolean,
    size: Vector2i
  ): Image? {
    TransferContext.writeArguments(_RID to sky, DOUBLE to energy, BOOL to bakeIrradiance, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SKY_BAKE_PANORAMA,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   * Creates an environment and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `environment_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   */
  public fun environmentCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the *BGMode* of the environment. Equivalent to [godot.Environment.backgroundMode].
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
  public fun environmentSetSkyCustomFov(env: RID, scale: Double): Unit {
    TransferContext.writeArguments(_RID to env, DOUBLE to scale)
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
   * Color displayed for clear areas of the scene (if using Custom color or Color+Sky background modes).
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
    multiplier: Double,
    exposureValue: Double
  ): Unit {
    TransferContext.writeArguments(_RID to env, DOUBLE to multiplier, DOUBLE to exposureValue)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_BG_ENERGY, NIL)
  }

  /**
   * Sets the maximum layer to use if using Canvas background mode.
   */
  public fun environmentSetCanvasMaxLayer(env: RID, maxLayer: Long): Unit {
    TransferContext.writeArguments(_RID to env, LONG to maxLayer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_CANVAS_MAX_LAYER, NIL)
  }

  /**
   *
   */
  public fun environmentSetAmbientLight(
    env: RID,
    color: Color,
    ambient: EnvironmentAmbientSource =
        RenderingServer.EnvironmentAmbientSource.ENV_AMBIENT_SOURCE_BG,
    energy: Double = 1.0,
    skyContibution: Double = 0.0,
    reflectionSource: EnvironmentReflectionSource =
        RenderingServer.EnvironmentReflectionSource.ENV_REFLECTION_SOURCE_BG
  ): Unit {
    TransferContext.writeArguments(_RID to env, COLOR to color, LONG to ambient.id, DOUBLE to energy, DOUBLE to skyContibution, LONG to reflectionSource.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_AMBIENT_LIGHT, NIL)
  }

  /**
   *
   */
  public fun environmentSetGlow(
    env: RID,
    enable: Boolean,
    levels: PackedFloat32Array,
    intensity: Double,
    strength: Double,
    mix: Double,
    bloomThreshold: Double,
    blendMode: EnvironmentGlowBlendMode,
    hdrBleedThreshold: Double,
    hdrBleedScale: Double,
    hdrLuminanceCap: Double,
    glowMapStrength: Double,
    glowMap: RID
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, PACKED_FLOAT_32_ARRAY to levels, DOUBLE to intensity, DOUBLE to strength, DOUBLE to mix, DOUBLE to bloomThreshold, LONG to blendMode.id, DOUBLE to hdrBleedThreshold, DOUBLE to hdrBleedScale, DOUBLE to hdrLuminanceCap, DOUBLE to glowMapStrength, _RID to glowMap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_GLOW, NIL)
  }

  /**
   * Sets the variables to be used with the "tonemap" post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetTonemap(
    env: RID,
    toneMapper: EnvironmentToneMapper,
    exposure: Double,
    white: Double
  ): Unit {
    TransferContext.writeArguments(_RID to env, LONG to toneMapper.id, DOUBLE to exposure, DOUBLE to white)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_TONEMAP, NIL)
  }

  /**
   * Sets the values to be used with the "Adjustment" post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetAdjustment(
    env: RID,
    enable: Boolean,
    brightness: Double,
    contrast: Double,
    saturation: Double,
    use1dColorCorrection: Boolean,
    colorCorrection: RID
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to brightness, DOUBLE to contrast, DOUBLE to saturation, BOOL to use1dColorCorrection, _RID to colorCorrection)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_ADJUSTMENT, NIL)
  }

  /**
   * Sets the variables to be used with the "screen space reflections" post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetSsr(
    env: RID,
    enable: Boolean,
    maxSteps: Long,
    fadeIn: Double,
    fadeOut: Double,
    depthTolerance: Double
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, LONG to maxSteps, DOUBLE to fadeIn, DOUBLE to fadeOut, DOUBLE to depthTolerance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SSR,
        NIL)
  }

  /**
   * Sets the variables to be used with the screen-space ambient occlusion (SSAO) post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetSsao(
    env: RID,
    enable: Boolean,
    radius: Double,
    intensity: Double,
    power: Double,
    detail: Double,
    horizon: Double,
    sharpness: Double,
    lightAffect: Double,
    aoChannelAffect: Double
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to radius, DOUBLE to intensity, DOUBLE to power, DOUBLE to detail, DOUBLE to horizon, DOUBLE to sharpness, DOUBLE to lightAffect, DOUBLE to aoChannelAffect)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SSAO, NIL)
  }

  /**
   *
   */
  public fun environmentSetFog(
    env: RID,
    enable: Boolean,
    lightColor: Color,
    lightEnergy: Double,
    sunScatter: Double,
    density: Double,
    height: Double,
    heightDensity: Double,
    aerialPerspective: Double,
    skyAffect: Double
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, COLOR to lightColor, DOUBLE to lightEnergy, DOUBLE to sunScatter, DOUBLE to density, DOUBLE to height, DOUBLE to heightDensity, DOUBLE to aerialPerspective, DOUBLE to skyAffect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_FOG,
        NIL)
  }

  /**
   *
   */
  public fun environmentSetSdfgi(
    env: RID,
    enable: Boolean,
    cascades: Long,
    minCellSize: Double,
    yScale: EnvironmentSDFGIYScale,
    useOcclusion: Boolean,
    bounceFeedback: Double,
    readSky: Boolean,
    energy: Double,
    normalBias: Double,
    probeBias: Double
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, LONG to cascades, DOUBLE to minCellSize, LONG to yScale.id, BOOL to useOcclusion, DOUBLE to bounceFeedback, BOOL to readSky, DOUBLE to energy, DOUBLE to normalBias, DOUBLE to probeBias)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SDFGI, NIL)
  }

  /**
   *
   */
  public fun environmentSetVolumetricFog(
    env: RID,
    enable: Boolean,
    density: Double,
    albedo: Color,
    emission: Color,
    emissionEnergy: Double,
    anisotropy: Double,
    length: Double,
    pDetailSpread: Double,
    giInject: Double,
    temporalReprojection: Boolean,
    temporalReprojectionAmount: Double,
    ambientInject: Double,
    skyAffect: Double
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to density, COLOR to albedo, COLOR to emission, DOUBLE to emissionEnergy, DOUBLE to anisotropy, DOUBLE to length, DOUBLE to pDetailSpread, DOUBLE to giInject, BOOL to temporalReprojection, DOUBLE to temporalReprojectionAmount, DOUBLE to ambientInject, DOUBLE to skyAffect)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_VOLUMETRIC_FOG, NIL)
  }

  /**
   *
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
    adaptiveTarget: Double,
    blurPasses: Long,
    fadeoutFrom: Double,
    fadeoutTo: Double
  ): Unit {
    TransferContext.writeArguments(LONG to quality.id, BOOL to halfSize, DOUBLE to adaptiveTarget, LONG to blurPasses, DOUBLE to fadeoutFrom, DOUBLE to fadeoutTo)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SSAO_QUALITY, NIL)
  }

  /**
   * Sets the quality level of the screen-space indirect lighting (SSIL) post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetSsilQuality(
    quality: EnvironmentSSILQuality,
    halfSize: Boolean,
    adaptiveTarget: Double,
    blurPasses: Long,
    fadeoutFrom: Double,
    fadeoutTo: Double
  ): Unit {
    TransferContext.writeArguments(LONG to quality.id, BOOL to halfSize, DOUBLE to adaptiveTarget, LONG to blurPasses, DOUBLE to fadeoutFrom, DOUBLE to fadeoutTo)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SSIL_QUALITY, NIL)
  }

  /**
   *
   */
  public fun environmentSetSdfgiRayCount(rayCount: EnvironmentSDFGIRayCount): Unit {
    TransferContext.writeArguments(LONG to rayCount.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SDFGI_RAY_COUNT, NIL)
  }

  /**
   *
   */
  public fun environmentSetSdfgiFramesToConverge(frames: EnvironmentSDFGIFramesToConverge): Unit {
    TransferContext.writeArguments(LONG to frames.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_SET_SDFGI_FRAMES_TO_CONVERGE, NIL)
  }

  /**
   *
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
  public fun environmentSetVolumetricFogVolumeSize(size: Long, depth: Long): Unit {
    TransferContext.writeArguments(LONG to size, LONG to depth)
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
   *
   */
  public fun environmentBakePanorama(
    environment: RID,
    bakeIrradiance: Boolean,
    size: Vector2i
  ): Image? {
    TransferContext.writeArguments(_RID to environment, BOOL to bakeIrradiance, VECTOR2I to size)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_ENVIRONMENT_BAKE_PANORAMA, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   *
   */
  public fun screenSpaceRoughnessLimiterSetActive(
    enable: Boolean,
    amount: Double,
    limit: Double
  ): Unit {
    TransferContext.writeArguments(BOOL to enable, DOUBLE to amount, DOUBLE to limit)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SCREEN_SPACE_ROUGHNESS_LIMITER_SET_ACTIVE, NIL)
  }

  /**
   *
   */
  public fun subSurfaceScatteringSetQuality(quality: SubSurfaceScatteringQuality): Unit {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SUB_SURFACE_SCATTERING_SET_QUALITY, NIL)
  }

  /**
   *
   */
  public fun subSurfaceScatteringSetScale(scale: Double, depthScale: Double): Unit {
    TransferContext.writeArguments(DOUBLE to scale, DOUBLE to depthScale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SUB_SURFACE_SCATTERING_SET_SCALE, NIL)
  }

  /**
   * Creates a camera attributes object and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `camera_attributes_` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   */
  public fun cameraAttributesCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_ATTRIBUTES_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun cameraAttributesSetDofBlurQuality(quality: DOFBlurQuality, useJitter: Boolean): Unit {
    TransferContext.writeArguments(LONG to quality.id, BOOL to useJitter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_ATTRIBUTES_SET_DOF_BLUR_QUALITY, NIL)
  }

  /**
   *
   */
  public fun cameraAttributesSetDofBlurBokehShape(shape: DOFBokehShape): Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_ATTRIBUTES_SET_DOF_BLUR_BOKEH_SHAPE, NIL)
  }

  /**
   *
   */
  public fun cameraAttributesSetDofBlur(
    cameraAttributes: RID,
    farEnable: Boolean,
    farDistance: Double,
    farTransition: Double,
    nearEnable: Boolean,
    nearDistance: Double,
    nearTransition: Double,
    amount: Double
  ): Unit {
    TransferContext.writeArguments(_RID to cameraAttributes, BOOL to farEnable, DOUBLE to farDistance, DOUBLE to farTransition, BOOL to nearEnable, DOUBLE to nearDistance, DOUBLE to nearTransition, DOUBLE to amount)
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
    multiplier: Double,
    normalization: Double
  ): Unit {
    TransferContext.writeArguments(_RID to cameraAttributes, DOUBLE to multiplier, DOUBLE to normalization)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_ATTRIBUTES_SET_EXPOSURE, NIL)
  }

  /**
   *
   */
  public fun cameraAttributesSetAutoExposure(
    cameraAttributes: RID,
    enable: Boolean,
    minSensitivity: Double,
    maxSensitivity: Double,
    speed: Double,
    scale: Double
  ): Unit {
    TransferContext.writeArguments(_RID to cameraAttributes, BOOL to enable, DOUBLE to minSensitivity, DOUBLE to maxSensitivity, DOUBLE to speed, DOUBLE to scale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CAMERA_ATTRIBUTES_SET_AUTO_EXPOSURE, NIL)
  }

  /**
   * Creates a scenario and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `scenario_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   *
   * The scenario is the 3D world that all the visual instances exist in.
   */
  public fun scenarioCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SCENARIO_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the environment that will be used with this scenario.
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
   *
   */
  public fun scenarioSetCameraAttributes(scenario: RID, effects: RID): Unit {
    TransferContext.writeArguments(_RID to scenario, _RID to effects)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SCENARIO_SET_CAMERA_ATTRIBUTES, NIL)
  }

  /**
   * Creates a visual instance, adds it to the RenderingServer, and sets both base and scenario. It can be accessed with the RID that is returned. This RID will be used in all `instance_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   */
  public fun instanceCreate2(base: RID, scenario: RID): RID {
    TransferContext.writeArguments(_RID to base, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_CREATE2,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Creates a visual instance and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `instance_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   *
   * An instance is a way of placing a 3D object in the scenario. Objects like particles, meshes, and reflection probes need to be associated with an instance to be visible in the scenario using [instanceSetBase].
   */
  public fun instanceCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the base of the instance. A base can be any of the 3D objects that are created in the RenderingServer that can be displayed. For example, any of the light types, mesh, multimesh, immediate geometry, particle system, reflection probe, lightmap, and the GI probe are all types that can be set as the base of an instance in order to be displayed in the scenario.
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
    sortingOffset: Double,
    useAabbCenter: Boolean
  ): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to sortingOffset, BOOL to useAabbCenter)
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
    shape: Long,
    weight: Double
  ): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to shape, DOUBLE to weight)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_SET_BLEND_SHAPE_WEIGHT, NIL)
  }

  /**
   * Sets the override material of a specific surface. Equivalent to [godot.MeshInstance3D.setSurfaceOverrideMaterial].
   */
  public fun instanceSetSurfaceOverrideMaterial(
    instance: RID,
    surface: Long,
    material: RID
  ): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to surface, _RID to material)
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
  public fun instanceGeometrySetTransparency(instance: RID, transparency: Double): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to transparency)
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
  public fun instanceSetExtraVisibilityMargin(instance: RID, margin: Double): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to margin)
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
   *
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
    enabled: Boolean
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
    min: Double,
    max: Double,
    minMargin: Double,
    maxMargin: Double,
    fadeMode: VisibilityRangeFadeMode
  ): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to min, DOUBLE to max, DOUBLE to minMargin, DOUBLE to maxMargin, LONG to fadeMode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_SET_VISIBILITY_RANGE, NIL)
  }

  /**
   *
   */
  public fun instanceGeometrySetLightmap(
    instance: RID,
    lightmap: RID,
    lightmapUvScale: Rect2,
    lightmapSlice: Long
  ): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to lightmap, RECT2 to lightmapUvScale, LONG to lightmapSlice)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_SET_LIGHTMAP, NIL)
  }

  /**
   *
   */
  public fun instanceGeometrySetLodBias(instance: RID, lodBias: Double): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to lodBias)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_SET_LOD_BIAS, NIL)
  }

  /**
   *
   */
  public fun instanceGeometrySetShaderParameter(
    instance: RID,
    parameter: StringName,
    `value`: Any
  ): Unit {
    TransferContext.writeArguments(_RID to instance, STRING_NAME to parameter, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_SET_SHADER_PARAMETER, NIL)
  }

  /**
   *
   */
  public fun instanceGeometryGetShaderParameter(instance: RID, parameter: StringName): Any? {
    TransferContext.writeArguments(_RID to instance, STRING_NAME to parameter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_GET_SHADER_PARAMETER, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   *
   */
  public fun instanceGeometryGetShaderParameterDefaultValue(instance: RID, parameter: StringName):
      Any? {
    TransferContext.writeArguments(_RID to instance, STRING_NAME to parameter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_GET_SHADER_PARAMETER_DEFAULT_VALUE,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   *
   */
  public fun instanceGeometryGetShaderParameterList(instance: RID):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(_RID to instance)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCE_GEOMETRY_GET_SHADER_PARAMETER_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>
  }

  /**
   * Returns an array of object IDs intersecting with the provided AABB. Only visual 3D nodes are considered, such as [godot.MeshInstance3D] or [godot.DirectionalLight3D]. Use [@GlobalScope.instanceFromId] to obtain the actual nodes. A scenario RID must be provided, which is available in the [godot.World3D] you want to query. This forces an update for all resources queued to update.
   *
   * **Warning:** This function is primarily intended for editor usage. For in-game use cases, prefer physics collision.
   */
  public fun instancesCullAabb(aabb: AABB, scenario: RID = RID()): PackedInt64Array {
    TransferContext.writeArguments(godot.core.VariantType.AABB to aabb, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCES_CULL_AABB,
        PACKED_INT_64_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array
  }

  /**
   * Returns an array of object IDs intersecting with the provided 3D ray. Only visual 3D nodes are considered, such as [godot.MeshInstance3D] or [godot.DirectionalLight3D]. Use [@GlobalScope.instanceFromId] to obtain the actual nodes. A scenario RID must be provided, which is available in the [godot.World3D] you want to query. This forces an update for all resources queued to update.
   *
   * **Warning:** This function is primarily intended for editor usage. For in-game use cases, prefer physics collision.
   */
  public fun instancesCullRay(
    from: Vector3,
    to: Vector3,
    scenario: RID = RID()
  ): PackedInt64Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCES_CULL_RAY,
        PACKED_INT_64_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array
  }

  /**
   * Returns an array of object IDs intersecting with the provided convex shape. Only visual 3D nodes are considered, such as [godot.MeshInstance3D] or [godot.DirectionalLight3D]. Use [@GlobalScope.instanceFromId] to obtain the actual nodes. A scenario RID must be provided, which is available in the [godot.World3D] you want to query. This forces an update for all resources queued to update.
   *
   * **Warning:** This function is primarily intended for editor usage. For in-game use cases, prefer physics collision.
   */
  public fun instancesCullConvex(convex: VariantArray<Plane>, scenario: RID = RID()):
      PackedInt64Array {
    TransferContext.writeArguments(ARRAY to convex, _RID to scenario)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_INSTANCES_CULL_CONVEX, PACKED_INT_64_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array
  }

  /**
   *
   */
  public fun bakeRenderUv2(
    base: RID,
    materialOverrides: VariantArray<RID>,
    imageSize: Vector2i
  ): VariantArray<Image> {
    TransferContext.writeArguments(_RID to base, ARRAY to materialOverrides, VECTOR2I to imageSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_BAKE_RENDER_UV2,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Image>
  }

  /**
   * Creates a canvas and returns the assigned [RID]. It can be accessed with the RID that is returned. This RID will be used in all `canvas_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   */
  public fun canvasCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * A copy of the canvas item will be drawn with a local offset of the mirroring [godot.core.Vector2].
   */
  public fun canvasSetItemMirroring(
    canvas: RID,
    item: RID,
    mirroring: Vector2
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
   *
   */
  public fun canvasTextureCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_TEXTURE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun canvasTextureSetChannel(
    canvasTexture: RID,
    channel: CanvasTextureChannel,
    texture: RID
  ): Unit {
    TransferContext.writeArguments(_RID to canvasTexture, LONG to channel.id, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_TEXTURE_SET_CHANNEL, NIL)
  }

  /**
   *
   */
  public fun canvasTextureSetShadingParameters(
    canvasTexture: RID,
    baseColor: Color,
    shininess: Double
  ): Unit {
    TransferContext.writeArguments(_RID to canvasTexture, COLOR to baseColor, DOUBLE to shininess)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_TEXTURE_SET_SHADING_PARAMETERS, NIL)
  }

  /**
   *
   */
  public fun canvasTextureSetTextureFilter(canvasTexture: RID, filter: CanvasItemTextureFilter):
      Unit {
    TransferContext.writeArguments(_RID to canvasTexture, LONG to filter.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_TEXTURE_SET_TEXTURE_FILTER, NIL)
  }

  /**
   *
   */
  public fun canvasTextureSetTextureRepeat(canvasTexture: RID, repeat: CanvasItemTextureRepeat):
      Unit {
    TransferContext.writeArguments(_RID to canvasTexture, LONG to repeat.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_TEXTURE_SET_TEXTURE_REPEAT, NIL)
  }

  /**
   *
   */
  public fun canvasItemCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun canvasItemSetParent(item: RID, parent: RID): Unit {
    TransferContext.writeArguments(_RID to item, _RID to parent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_PARENT, NIL)
  }

  /**
   *
   */
  public fun canvasItemSetDefaultTextureFilter(item: RID, filter: CanvasItemTextureFilter): Unit {
    TransferContext.writeArguments(_RID to item, LONG to filter.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_DEFAULT_TEXTURE_FILTER, NIL)
  }

  /**
   *
   */
  public fun canvasItemSetDefaultTextureRepeat(item: RID, repeat: CanvasItemTextureRepeat): Unit {
    TransferContext.writeArguments(_RID to item, LONG to repeat.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_DEFAULT_TEXTURE_REPEAT, NIL)
  }

  /**
   *
   */
  public fun canvasItemSetVisible(item: RID, visible: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to visible)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_VISIBLE, NIL)
  }

  /**
   *
   */
  public fun canvasItemSetLightMask(item: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to item, LONG to mask)
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
   *
   */
  public fun canvasItemSetTransform(item: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to item, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_TRANSFORM, NIL)
  }

  /**
   *
   */
  public fun canvasItemSetClip(item: RID, clip: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to clip)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_CLIP, NIL)
  }

  /**
   *
   */
  public fun canvasItemSetDistanceFieldMode(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_DISTANCE_FIELD_MODE, NIL)
  }

  /**
   *
   */
  public fun canvasItemSetCustomRect(
    item: RID,
    useCustomRect: Boolean,
    rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0)
  ): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to useCustomRect, RECT2 to rect)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_CUSTOM_RECT, NIL)
  }

  /**
   *
   */
  public fun canvasItemSetModulate(item: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to item, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_MODULATE, NIL)
  }

  /**
   *
   */
  public fun canvasItemSetSelfModulate(item: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to item, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_SELF_MODULATE, NIL)
  }

  /**
   *
   */
  public fun canvasItemSetDrawBehindParent(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_DRAW_BEHIND_PARENT, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddLine(
    item: RID,
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to item, VECTOR2 to from, VECTOR2 to to, COLOR to color, DOUBLE to width, BOOL to antialiased)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_LINE, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddPolyline(
    item: RID,
    points: PackedVector2Array,
    colors: PackedColorArray,
    width: Double = 1.0,
    antialiased: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to item, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, DOUBLE to width, BOOL to antialiased)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_POLYLINE, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddRect(
    item: RID,
    rect: Rect2,
    color: Color
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_RECT, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddCircle(
    item: RID,
    pos: Vector2,
    radius: Double,
    color: Color
  ): Unit {
    TransferContext.writeArguments(_RID to item, VECTOR2 to pos, DOUBLE to radius, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_CIRCLE, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddTextureRect(
    item: RID,
    rect: Rect2,
    texture: RID,
    tile: Boolean = false,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, BOOL to tile, COLOR to modulate, BOOL to transpose)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_TEXTURE_RECT, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddMsdfTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    outlineSize: Long = 0,
    pxRange: Double = 1.0,
    scale: Double = 1.0
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, RECT2 to srcRect, COLOR to modulate, LONG to outlineSize, DOUBLE to pxRange, DOUBLE to scale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_MSDF_TEXTURE_RECT_REGION, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddLcdTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, RECT2 to srcRect, COLOR to modulate)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_LCD_TEXTURE_RECT_REGION, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
    clipUv: Boolean = true
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, RECT2 to srcRect, COLOR to modulate, BOOL to transpose, BOOL to clipUv)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_TEXTURE_RECT_REGION, NIL)
  }

  /**
   *
   */
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
    modulate: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, RECT2 to source, _RID to texture, VECTOR2 to topleft, VECTOR2 to bottomright, LONG to xAxisMode.id, LONG to yAxisMode.id, BOOL to drawCenter, COLOR to modulate)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_NINE_PATCH, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddPrimitive(
    item: RID,
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array,
    texture: RID,
    width: Double = 1.0
  ): Unit {
    TransferContext.writeArguments(_RID to item, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, _RID to texture, DOUBLE to width)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_PRIMITIVE, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddPolygon(
    item: RID,
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array = PackedVector2Array(),
    texture: RID = RID()
  ): Unit {
    TransferContext.writeArguments(_RID to item, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_POLYGON, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddTriangleArray(
    item: RID,
    indices: PackedInt32Array,
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array = PackedVector2Array(),
    bones: PackedInt32Array = PackedInt32Array(),
    weights: PackedFloat32Array = PackedFloat32Array(),
    texture: RID = RID(),
    count: Long = -1
  ): Unit {
    TransferContext.writeArguments(_RID to item, PACKED_INT_32_ARRAY to indices, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, PACKED_INT_32_ARRAY to bones, PACKED_FLOAT_32_ARRAY to weights, _RID to texture, LONG to count)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_TRIANGLE_ARRAY, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddMesh(
    item: RID,
    mesh: RID,
    transform: Transform2D = Transform2D(),
    modulate: Color = Color(Color(1, 1, 1, 1)),
    texture: RID = RID()
  ): Unit {
    TransferContext.writeArguments(_RID to item, _RID to mesh, TRANSFORM2D to transform, COLOR to modulate, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_MESH, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddMultimesh(
    item: RID,
    mesh: RID,
    texture: RID = RID()
  ): Unit {
    TransferContext.writeArguments(_RID to item, _RID to mesh, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_MULTIMESH, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddParticles(
    item: RID,
    particles: RID,
    texture: RID
  ): Unit {
    TransferContext.writeArguments(_RID to item, _RID to particles, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_PARTICLES, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddSetTransform(item: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to item, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_SET_TRANSFORM, NIL)
  }

  /**
   *
   */
  public fun canvasItemAddClipIgnore(item: RID, ignore: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to ignore)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_CLIP_IGNORE, NIL)
  }

  /**
   * Subsequent drawing commands will be ignored unless they fall within the specified animation slice. This is a faster way to implement animations that loop on background rather than redrawing constantly.
   */
  public fun canvasItemAddAnimationSlice(
    item: RID,
    animationLength: Double,
    sliceBegin: Double,
    sliceEnd: Double,
    offset: Double = 0.0
  ): Unit {
    TransferContext.writeArguments(_RID to item, DOUBLE to animationLength, DOUBLE to sliceBegin, DOUBLE to sliceEnd, DOUBLE to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_ADD_ANIMATION_SLICE, NIL)
  }

  /**
   *
   */
  public fun canvasItemSetSortChildrenByY(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_SORT_CHILDREN_BY_Y, NIL)
  }

  /**
   * Sets the [godot.CanvasItem]'s Z index, i.e. its draw order (lower indexes are drawn first).
   */
  public fun canvasItemSetZIndex(item: RID, zIndex: Long): Unit {
    TransferContext.writeArguments(_RID to item, LONG to zIndex)
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
    rect: Rect2
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
  public fun canvasItemSetDrawIndex(item: RID, index: Long): Unit {
    TransferContext.writeArguments(_RID to item, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_DRAW_INDEX, NIL)
  }

  /**
   * Sets a new material to the [godot.CanvasItem].
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
   *
   */
  public fun canvasItemSetVisibilityNotifier(
    item: RID,
    enable: Boolean,
    area: Rect2,
    enterCallable: Callable,
    exitCallable: Callable
  ): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enable, RECT2 to area, CALLABLE to enterCallable, CALLABLE to exitCallable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_VISIBILITY_NOTIFIER, NIL)
  }

  /**
   *
   */
  public fun canvasItemSetCanvasGroupMode(
    item: RID,
    mode: CanvasGroupMode,
    clearMargin: Double = 5.0,
    fitEmpty: Boolean = false,
    fitMargin: Double = 0.0,
    blurMipmaps: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to item, LONG to mode.id, DOUBLE to clearMargin, BOOL to fitEmpty, DOUBLE to fitMargin, BOOL to blurMipmaps)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_ITEM_SET_CANVAS_GROUP_MODE, NIL)
  }

  /**
   * Creates a canvas light and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `canvas_light_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   */
  public fun canvasLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
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
  public fun canvasLightSetTextureScale(light: RID, scale: Double): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to scale)
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
  public fun canvasLightSetHeight(light: RID, height: Double): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to height)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_HEIGHT, NIL)
  }

  /**
   * Sets a canvas light's energy.
   */
  public fun canvasLightSetEnergy(light: RID, energy: Double): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to energy)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_ENERGY, NIL)
  }

  /**
   * Sets the Z range of objects that will be affected by this light. Equivalent to [godot.Light2D.rangeZMin] and [godot.Light2D.rangeZMax].
   */
  public fun canvasLightSetZRange(
    light: RID,
    minZ: Long,
    maxZ: Long
  ): Unit {
    TransferContext.writeArguments(_RID to light, LONG to minZ, LONG to maxZ)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_Z_RANGE, NIL)
  }

  /**
   * The layer range that gets rendered with this light.
   */
  public fun canvasLightSetLayerRange(
    light: RID,
    minLayer: Long,
    maxLayer: Long
  ): Unit {
    TransferContext.writeArguments(_RID to light, LONG to minLayer, LONG to maxLayer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_LAYER_RANGE, NIL)
  }

  /**
   * The light mask. See [godot.LightOccluder2D] for more information on light masks.
   */
  public fun canvasLightSetItemCullMask(light: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_ITEM_CULL_MASK, NIL)
  }

  /**
   * The binary mask used to determine which layers this canvas light's shadows affects. See [godot.LightOccluder2D] for more information on light masks.
   */
  public fun canvasLightSetItemShadowCullMask(light: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mask)
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
  public fun canvasLightSetShadowSmooth(light: RID, smooth: Double): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to smooth)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_SET_SHADOW_SMOOTH, NIL)
  }

  /**
   * Creates a light occluder and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `canvas_light_ocluder_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   */
  public fun canvasLightOccluderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_OCCLUDER_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
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
  public fun canvasLightOccluderSetLightMask(occluder: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to occluder, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_LIGHT_OCCLUDER_SET_LIGHT_MASK, NIL)
  }

  /**
   * Creates a new light occluder polygon and adds it to the RenderingServer. It can be accessed with the RID that is returned. This RID will be used in all `canvas_occluder_polygon_*` RenderingServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the RenderingServer's [freeRid] static method.
   */
  public fun canvasOccluderPolygonCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_OCCLUDER_POLYGON_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the shape of the occluder polygon.
   */
  public fun canvasOccluderPolygonSetShape(
    occluderPolygon: RID,
    shape: PackedVector2Array,
    closed: Boolean
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
   *
   */
  public fun canvasSetShadowTextureSize(size: Long): Unit {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_CANVAS_SET_SHADOW_TEXTURE_SIZE, NIL)
  }

  /**
   *
   */
  public fun globalShaderParameterAdd(
    name: StringName,
    type: GlobalShaderParameterType,
    defaultValue: Any
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to type.id, ANY to defaultValue)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GLOBAL_SHADER_PARAMETER_ADD, NIL)
  }

  /**
   *
   */
  public fun globalShaderParameterRemove(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GLOBAL_SHADER_PARAMETER_REMOVE, NIL)
  }

  /**
   *
   */
  public fun globalShaderParameterGetList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GLOBAL_SHADER_PARAMETER_GET_LIST,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   *
   */
  public fun globalShaderParameterSet(name: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GLOBAL_SHADER_PARAMETER_SET, NIL)
  }

  /**
   *
   */
  public fun globalShaderParameterSetOverride(name: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GLOBAL_SHADER_PARAMETER_SET_OVERRIDE, NIL)
  }

  /**
   *
   */
  public fun globalShaderParameterGet(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GLOBAL_SHADER_PARAMETER_GET, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   *
   */
  public fun globalShaderParameterGetType(name: StringName): GlobalShaderParameterType {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GLOBAL_SHADER_PARAMETER_GET_TYPE, LONG)
    return RenderingServer.GlobalShaderParameterType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Tries to free an object in the RenderingServer.
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
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun getRenderingInfo(info: RenderingInfo): Long {
    TransferContext.writeArguments(LONG to info.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_RENDERING_INFO,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the video adapter (e.g. "GeForce GTX 1080/PCIe/SSE2").
   *
   * **Note:** When running a headless or server binary, this function returns an empty string.
   */
  public fun getVideoAdapterName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_VIDEO_ADAPTER_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
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
    return TransferContext.readReturnValue(STRING, false) as String
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
    return RenderingDevice.DeviceType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the version of the graphics video adapter *currently in use* (e.g. "1.2.189" for Vulkan, "3.3.0 NVIDIA 510.60.02" for OpenGL). This version may be different from the actual latest version supported by the hardware, as Godot may not always request the latest version.
   *
   * **Note:** When running a headless or server binary, this function returns an empty string.
   */
  public fun getVideoAdapterApiVersion(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_VIDEO_ADAPTER_API_VERSION, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a mesh of a sphere with the given number of horizontal and vertical subdivisions.
   */
  public fun makeSphereMesh(
    latitudes: Long,
    longitudes: Long,
    radius: Double
  ): RID {
    TransferContext.writeArguments(LONG to latitudes, LONG to longitudes, DOUBLE to radius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_MAKE_SPHERE_MESH,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the ID of the test cube. Creates one if none exists.
   */
  public fun getTestCube(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_TEST_CUBE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the ID of the test texture. Creates one if none exists.
   */
  public fun getTestTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_TEST_TEXTURE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the ID of a white texture. Creates one if none exists.
   */
  public fun getWhiteTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_WHITE_TEXTURE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets a boot image. The color defines the background color. If [scale] is `true`, the image will be scaled to fit the screen size. If [useFilter] is `true`, the image will be scaled with linear interpolation. If [useFilter] is `false`, the image will be scaled with nearest-neighbor interpolation.
   */
  public fun setBootImage(
    image: Image,
    color: Color,
    scale: Boolean,
    useFilter: Boolean = true
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, COLOR to color, BOOL to scale, BOOL to useFilter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SET_BOOT_IMAGE, NIL)
  }

  /**
   * Sets the default clear color which is used when a specific clear color has not been selected.
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
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the OS supports a certain [feature]. Features might be `s3tc`, `etc`, and `etc2`.
   */
  public fun hasOsFeature(feature: String): Boolean {
    TransferContext.writeArguments(STRING to feature)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_HAS_OS_FEATURE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, the engine will generate wireframes for use with the wireframe debug mode.
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
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun setRenderLoopEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_SET_RENDER_LOOP_ENABLED, NIL)
  }

  /**
   *
   */
  public fun getFrameSetupTimeCpu(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_GET_FRAME_SETUP_TIME_CPU, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   *
   */
  public fun forceSync(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RENDERINGSERVER_FORCE_SYNC, NIL)
  }

  /**
   *
   */
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
    return TransferContext.readReturnValue(OBJECT, true) as RenderingDevice?
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
    return TransferContext.readReturnValue(OBJECT, true) as RenderingDevice?
  }

  public enum class TextureLayeredType(
    id: Long
  ) {
    /**
     *
     */
    TEXTURE_LAYERED_2D_ARRAY(0),
    /**
     *
     */
    TEXTURE_LAYERED_CUBEMAP(1),
    /**
     *
     */
    TEXTURE_LAYERED_CUBEMAP_ARRAY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CubeMapLayer(
    id: Long
  ) {
    /**
     *
     */
    CUBEMAP_LAYER_LEFT(0),
    /**
     *
     */
    CUBEMAP_LAYER_RIGHT(1),
    /**
     *
     */
    CUBEMAP_LAYER_BOTTOM(2),
    /**
     *
     */
    CUBEMAP_LAYER_TOP(3),
    /**
     *
     */
    CUBEMAP_LAYER_FRONT(4),
    /**
     *
     */
    CUBEMAP_LAYER_BACK(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ShaderMode(
    id: Long
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
     * Shader is a particle shader.
     */
    SHADER_PARTICLES(2),
    /**
     * Shader is a sky shader.
     */
    SHADER_SKY(3),
    /**
     * Shader is a fog shader.
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ArrayType(
    id: Long
  ) {
    /**
     * Array is a vertex array.
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
     * Array is a color array.
     */
    ARRAY_COLOR(3),
    /**
     * Array is an UV coordinates array.
     */
    ARRAY_TEX_UV(4),
    /**
     * Array is an UV coordinates array for the second UV coordinates.
     */
    ARRAY_TEX_UV2(5),
    /**
     *
     */
    ARRAY_CUSTOM0(6),
    /**
     *
     */
    ARRAY_CUSTOM1(7),
    /**
     *
     */
    ARRAY_CUSTOM2(8),
    /**
     *
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
     * Array is index array.
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ArrayCustomFormat(
    id: Long
  ) {
    /**
     *
     */
    ARRAY_CUSTOM_RGBA8_UNORM(0),
    /**
     *
     */
    ARRAY_CUSTOM_RGBA8_SNORM(1),
    /**
     *
     */
    ARRAY_CUSTOM_RG_HALF(2),
    /**
     *
     */
    ARRAY_CUSTOM_RGBA_HALF(3),
    /**
     *
     */
    ARRAY_CUSTOM_R_FLOAT(4),
    /**
     *
     */
    ARRAY_CUSTOM_RG_FLOAT(5),
    /**
     *
     */
    ARRAY_CUSTOM_RGB_FLOAT(6),
    /**
     *
     */
    ARRAY_CUSTOM_RGBA_FLOAT(7),
    /**
     *
     */
    ARRAY_CUSTOM_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ArrayFormat(
    id: Long
  ) {
    /**
     * Flag used to mark a vertex array.
     */
    ARRAY_FORMAT_VERTEX(1),
    /**
     * Flag used to mark a normal array.
     */
    ARRAY_FORMAT_NORMAL(2),
    /**
     * Flag used to mark a tangent array.
     */
    ARRAY_FORMAT_TANGENT(4),
    /**
     * Flag used to mark a color array.
     */
    ARRAY_FORMAT_COLOR(8),
    /**
     * Flag used to mark an UV coordinates array.
     */
    ARRAY_FORMAT_TEX_UV(16),
    /**
     * Flag used to mark an UV coordinates array for the second UV coordinates.
     */
    ARRAY_FORMAT_TEX_UV2(32),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM0(64),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM1(128),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM2(256),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM3(512),
    /**
     * Flag used to mark a bone information array.
     */
    ARRAY_FORMAT_BONES(1024),
    /**
     * Flag used to mark a weights array.
     */
    ARRAY_FORMAT_WEIGHTS(2048),
    /**
     * Flag used to mark an index array.
     */
    ARRAY_FORMAT_INDEX(4096),
    /**
     *
     */
    ARRAY_FORMAT_BLEND_SHAPE_MASK(7),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM_BASE(13),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM_BITS(3),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM0_SHIFT(13),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM1_SHIFT(16),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM2_SHIFT(19),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM3_SHIFT(22),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM_MASK(7),
    /**
     *
     */
    ARRAY_COMPRESS_FLAGS_BASE(25),
    /**
     * Flag used to mark that the array contains 2D vertices.
     */
    ARRAY_FLAG_USE_2D_VERTICES(33554432),
    /**
     *
     */
    ARRAY_FLAG_USE_DYNAMIC_UPDATE(67108864),
    /**
     *
     */
    ARRAY_FLAG_USE_8_BONE_WEIGHTS(134217728),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class PrimitiveType(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BlendShapeMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class MultimeshTransformFormat(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LightProjectorFilter(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LightType(
    id: Long
  ) {
    /**
     * Is a directional (sun) light.
     */
    LIGHT_DIRECTIONAL(0),
    /**
     * Is an omni light.
     */
    LIGHT_OMNI(1),
    /**
     * Is a spot light.
     */
    LIGHT_SPOT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LightParam(
    id: Long
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
     * Max distance that shadows will be rendered.
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
     * Represents the size of the [enum LightParam] enum.
     */
    LIGHT_PARAM_MAX(21),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LightBakeMode(
    id: Long
  ) {
    /**
     *
     */
    LIGHT_BAKE_DISABLED(0),
    /**
     *
     */
    LIGHT_BAKE_STATIC(1),
    /**
     *
     */
    LIGHT_BAKE_DYNAMIC(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LightOmniShadowMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LightDirectionalShadowMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LightDirectionalSkyMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ShadowQuality(
    id: Long
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
     *
     */
    SHADOW_QUALITY_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ReflectionProbeUpdateMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ReflectionProbeAmbientMode(
    id: Long
  ) {
    /**
     *
     */
    REFLECTION_PROBE_AMBIENT_DISABLED(0),
    /**
     *
     */
    REFLECTION_PROBE_AMBIENT_ENVIRONMENT(1),
    /**
     *
     */
    REFLECTION_PROBE_AMBIENT_COLOR(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DecalTexture(
    id: Long
  ) {
    /**
     *
     */
    DECAL_TEXTURE_ALBEDO(0),
    /**
     *
     */
    DECAL_TEXTURE_NORMAL(1),
    /**
     *
     */
    DECAL_TEXTURE_ORM(2),
    /**
     *
     */
    DECAL_TEXTURE_EMISSION(3),
    /**
     *
     */
    DECAL_TEXTURE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DecalFilter(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class VoxelGIQuality(
    id: Long
  ) {
    /**
     *
     */
    VOXEL_GI_QUALITY_LOW(0),
    /**
     *
     */
    VOXEL_GI_QUALITY_HIGH(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ParticlesMode(
    id: Long
  ) {
    /**
     *
     */
    PARTICLES_MODE_2D(0),
    /**
     *
     */
    PARTICLES_MODE_3D(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ParticlesTransformAlign(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ParticlesDrawOrder(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ParticlesCollisionType(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ParticlesCollisionHeightfieldResolution(
    id: Long
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
     *
     */
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class FogVolumeShape(
    id: Long
  ) {
    /**
     * [godot.FogVolume] will be shaped like an ellipsoid (stretched sphere).
     */
    FOG_VOLUME_SHAPE_ELLIPSOID(0),
    /**
     * [godot.FogVolume] will be shaped like a cone pointing upwards (in local coordinates). The cone's angle is set automatically to fill the extents. The cone will be adjusted to fit within the extents. Rotate the [godot.FogVolume] node to reorient the cone. Non-uniform scaling via extents is not supported (scale the [godot.FogVolume] node instead).
     */
    FOG_VOLUME_SHAPE_CONE(1),
    /**
     * [godot.FogVolume] will be shaped like an upright cylinder (in local coordinates). Rotate the [godot.FogVolume] node to reorient the cylinder. The cylinder will be adjusted to fit within the extents. Non-uniform scaling via extents is not supported (scale the [godot.FogVolume] node instead).
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
     *
     */
    FOG_VOLUME_SHAPE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportScaling3DMode(
    id: Long
  ) {
    /**
     * Use bilinear scaling for the viewport's 3D buffer. The amount of scaling can be set using [godot.Viewport.scaling3dScale]. Values less then `1.0` will result in undersampling while values greater than `1.0` will result in supersampling. A value of `1.0` disables scaling.
     */
    VIEWPORT_SCALING_3D_MODE_BILINEAR(0),
    /**
     * Use AMD FidelityFX Super Resolution 1.0 upscaling for the viewport's 3D buffer. The amount of scaling can be set using [godot.Viewport.scaling3dScale]. Values less then `1.0` will be result in the viewport being upscaled using FSR. Values greater than `1.0` are not supported and bilinear downsampling will be used instead. A value of `1.0` disables scaling.
     */
    VIEWPORT_SCALING_3D_MODE_FSR(1),
    /**
     *
     */
    VIEWPORT_SCALING_3D_MODE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportUpdateMode(
    id: Long
  ) {
    /**
     * Do not update the viewport.
     */
    VIEWPORT_UPDATE_DISABLED(0),
    /**
     * Update the viewport once then set to disabled.
     */
    VIEWPORT_UPDATE_ONCE(1),
    /**
     * Update the viewport whenever it is visible.
     */
    VIEWPORT_UPDATE_WHEN_VISIBLE(2),
    /**
     *
     */
    VIEWPORT_UPDATE_WHEN_PARENT_VISIBLE(3),
    /**
     * Always update the viewport.
     */
    VIEWPORT_UPDATE_ALWAYS(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportClearMode(
    id: Long
  ) {
    /**
     * The viewport is always cleared before drawing.
     */
    VIEWPORT_CLEAR_ALWAYS(0),
    /**
     * The viewport is never cleared before drawing.
     */
    VIEWPORT_CLEAR_NEVER(1),
    /**
     * The viewport is cleared once, then the clear mode is set to [VIEWPORT_CLEAR_NEVER].
     */
    VIEWPORT_CLEAR_ONLY_NEXT_FRAME(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportSDFOversize(
    id: Long
  ) {
    /**
     *
     */
    VIEWPORT_SDF_OVERSIZE_100_PERCENT(0),
    /**
     *
     */
    VIEWPORT_SDF_OVERSIZE_120_PERCENT(1),
    /**
     *
     */
    VIEWPORT_SDF_OVERSIZE_150_PERCENT(2),
    /**
     *
     */
    VIEWPORT_SDF_OVERSIZE_200_PERCENT(3),
    /**
     *
     */
    VIEWPORT_SDF_OVERSIZE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportSDFScale(
    id: Long
  ) {
    /**
     *
     */
    VIEWPORT_SDF_SCALE_100_PERCENT(0),
    /**
     *
     */
    VIEWPORT_SDF_SCALE_50_PERCENT(1),
    /**
     *
     */
    VIEWPORT_SDF_SCALE_25_PERCENT(2),
    /**
     *
     */
    VIEWPORT_SDF_SCALE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportMSAA(
    id: Long
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
     *
     */
    VIEWPORT_MSAA_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportScreenSpaceAA(
    id: Long
  ) {
    /**
     *
     */
    VIEWPORT_SCREEN_SPACE_AA_DISABLED(0),
    /**
     *
     */
    VIEWPORT_SCREEN_SPACE_AA_FXAA(1),
    /**
     *
     */
    VIEWPORT_SCREEN_SPACE_AA_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportOcclusionCullingBuildQuality(
    id: Long
  ) {
    /**
     *
     */
    VIEWPORT_OCCLUSION_BUILD_QUALITY_LOW(0),
    /**
     *
     */
    VIEWPORT_OCCLUSION_BUILD_QUALITY_MEDIUM(1),
    /**
     *
     */
    VIEWPORT_OCCLUSION_BUILD_QUALITY_HIGH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportRenderInfo(
    id: Long
  ) {
    /**
     * Number of objects drawn in a single frame.
     */
    VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME(0),
    /**
     * Number of vertices drawn in a single frame.
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportRenderInfoType(
    id: Long
  ) {
    /**
     *
     */
    VIEWPORT_RENDER_INFO_TYPE_VISIBLE(0),
    /**
     *
     */
    VIEWPORT_RENDER_INFO_TYPE_SHADOW(1),
    /**
     *
     */
    VIEWPORT_RENDER_INFO_TYPE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportDebugDraw(
    id: Long
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
     *
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
     *
     */
    VIEWPORT_DEBUG_DRAW_DECAL_ATLAS(15),
    /**
     *
     */
    VIEWPORT_DEBUG_DRAW_SDFGI(16),
    /**
     *
     */
    VIEWPORT_DEBUG_DRAW_SDFGI_PROBES(17),
    /**
     *
     */
    VIEWPORT_DEBUG_DRAW_GI_BUFFER(18),
    /**
     *
     */
    VIEWPORT_DEBUG_DRAW_DISABLE_LOD(19),
    /**
     *
     */
    VIEWPORT_DEBUG_DRAW_CLUSTER_OMNI_LIGHTS(20),
    /**
     *
     */
    VIEWPORT_DEBUG_DRAW_CLUSTER_SPOT_LIGHTS(21),
    /**
     *
     */
    VIEWPORT_DEBUG_DRAW_CLUSTER_DECALS(22),
    /**
     *
     */
    VIEWPORT_DEBUG_DRAW_CLUSTER_REFLECTION_PROBES(23),
    /**
     *
     */
    VIEWPORT_DEBUG_DRAW_OCCLUDERS(24),
    /**
     *
     */
    VIEWPORT_DEBUG_DRAW_MOTION_VECTORS(25),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportVRSMode(
    id: Long
  ) {
    /**
     * VRS is disabled.
     */
    VIEWPORT_VRS_DISABLED(0),
    /**
     * VRS uses a texture. Note, for stereoscopic use a texture atlas with a texture for each view.
     */
    VIEWPORT_VRS_TEXTURE(1),
    /**
     * VRS texture is supplied by the primary [godot.XRInterface].
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SkyMode(
    id: Long
  ) {
    /**
     *
     */
    SKY_MODE_AUTOMATIC(0),
    /**
     * Uses high quality importance sampling to process the radiance map. In general, this results in much higher quality than [godot.Sky.PROCESS_MODE_REALTIME] but takes much longer to generate. This should not be used if you plan on changing the sky at runtime. If you are finding that the reflection is not blurry enough and is showing sparkles or fireflies, try increasing [godot.ProjectSettings.rendering/reflections/skyReflections/ggxSamples].
     */
    SKY_MODE_QUALITY(1),
    /**
     *
     */
    SKY_MODE_INCREMENTAL(2),
    /**
     * Uses the fast filtering algorithm to process the radiance map. In general this results in lower quality, but substantially faster run times.
     *
     * **Note:** The fast filtering algorithm is limited to 256x256 cubemaps, so [godot.Sky.radianceSize] must be set to [godot.Sky.RADIANCE_SIZE_256].
     */
    SKY_MODE_REALTIME(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentBG(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentAmbientSource(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentReflectionSource(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentGlowBlendMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentToneMapper(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentSSRRoughnessQuality(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentSSAOQuality(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentSSILQuality(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentSDFGIYScale(
    id: Long
  ) {
    /**
     *
     */
    ENV_SDFGI_Y_SCALE_50_PERCENT(0),
    /**
     *
     */
    ENV_SDFGI_Y_SCALE_75_PERCENT(1),
    /**
     *
     */
    ENV_SDFGI_Y_SCALE_100_PERCENT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentSDFGIRayCount(
    id: Long
  ) {
    /**
     *
     */
    ENV_SDFGI_RAY_COUNT_4(0),
    /**
     *
     */
    ENV_SDFGI_RAY_COUNT_8(1),
    /**
     *
     */
    ENV_SDFGI_RAY_COUNT_16(2),
    /**
     *
     */
    ENV_SDFGI_RAY_COUNT_32(3),
    /**
     *
     */
    ENV_SDFGI_RAY_COUNT_64(4),
    /**
     *
     */
    ENV_SDFGI_RAY_COUNT_96(5),
    /**
     *
     */
    ENV_SDFGI_RAY_COUNT_128(6),
    /**
     *
     */
    ENV_SDFGI_RAY_COUNT_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentSDFGIFramesToConverge(
    id: Long
  ) {
    /**
     *
     */
    ENV_SDFGI_CONVERGE_IN_5_FRAMES(0),
    /**
     *
     */
    ENV_SDFGI_CONVERGE_IN_10_FRAMES(1),
    /**
     *
     */
    ENV_SDFGI_CONVERGE_IN_15_FRAMES(2),
    /**
     *
     */
    ENV_SDFGI_CONVERGE_IN_20_FRAMES(3),
    /**
     *
     */
    ENV_SDFGI_CONVERGE_IN_25_FRAMES(4),
    /**
     *
     */
    ENV_SDFGI_CONVERGE_IN_30_FRAMES(5),
    /**
     *
     */
    ENV_SDFGI_CONVERGE_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentSDFGIFramesToUpdateLight(
    id: Long
  ) {
    /**
     *
     */
    ENV_SDFGI_UPDATE_LIGHT_IN_1_FRAME(0),
    /**
     *
     */
    ENV_SDFGI_UPDATE_LIGHT_IN_2_FRAMES(1),
    /**
     *
     */
    ENV_SDFGI_UPDATE_LIGHT_IN_4_FRAMES(2),
    /**
     *
     */
    ENV_SDFGI_UPDATE_LIGHT_IN_8_FRAMES(3),
    /**
     *
     */
    ENV_SDFGI_UPDATE_LIGHT_IN_16_FRAMES(4),
    /**
     *
     */
    ENV_SDFGI_UPDATE_LIGHT_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SubSurfaceScatteringQuality(
    id: Long
  ) {
    /**
     *
     */
    SUB_SURFACE_SCATTERING_QUALITY_DISABLED(0),
    /**
     *
     */
    SUB_SURFACE_SCATTERING_QUALITY_LOW(1),
    /**
     *
     */
    SUB_SURFACE_SCATTERING_QUALITY_MEDIUM(2),
    /**
     *
     */
    SUB_SURFACE_SCATTERING_QUALITY_HIGH(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DOFBokehShape(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DOFBlurQuality(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class InstanceType(
    id: Long
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
     *
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
     *
     */
    INSTANCE_OCCLUDER(10),
    /**
     *
     */
    INSTANCE_VISIBLITY_NOTIFIER(11),
    /**
     *
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class InstanceFlags(
    id: Long
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
     *
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ShadowCastingSetting(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class VisibilityRangeFadeMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BakeChannels(
    id: Long
  ) {
    /**
     *
     */
    BAKE_CHANNEL_ALBEDO_ALPHA(0),
    /**
     *
     */
    BAKE_CHANNEL_NORMAL(1),
    /**
     *
     */
    BAKE_CHANNEL_ORM(2),
    /**
     *
     */
    BAKE_CHANNEL_EMISSION(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CanvasTextureChannel(
    id: Long
  ) {
    /**
     *
     */
    CANVAS_TEXTURE_CHANNEL_DIFFUSE(0),
    /**
     *
     */
    CANVAS_TEXTURE_CHANNEL_NORMAL(1),
    /**
     *
     */
    CANVAS_TEXTURE_CHANNEL_SPECULAR(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class NinePatchAxisMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CanvasItemTextureFilter(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CanvasItemTextureRepeat(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CanvasGroupMode(
    id: Long
  ) {
    /**
     *
     */
    CANVAS_GROUP_MODE_DISABLED(0),
    /**
     *
     */
    CANVAS_GROUP_MODE_CLIP_ONLY(1),
    /**
     *
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CanvasLightMode(
    id: Long
  ) {
    /**
     *
     */
    CANVAS_LIGHT_MODE_POINT(0),
    /**
     *
     */
    CANVAS_LIGHT_MODE_DIRECTIONAL(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CanvasLightBlendMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CanvasLightShadowFilter(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CanvasOccluderPolygonCullMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class GlobalShaderParameterType(
    id: Long
  ) {
    /**
     *
     */
    GLOBAL_VAR_TYPE_BOOL(0),
    /**
     *
     */
    GLOBAL_VAR_TYPE_BVEC2(1),
    /**
     *
     */
    GLOBAL_VAR_TYPE_BVEC3(2),
    /**
     *
     */
    GLOBAL_VAR_TYPE_BVEC4(3),
    /**
     *
     */
    GLOBAL_VAR_TYPE_INT(4),
    /**
     *
     */
    GLOBAL_VAR_TYPE_IVEC2(5),
    /**
     *
     */
    GLOBAL_VAR_TYPE_IVEC3(6),
    /**
     *
     */
    GLOBAL_VAR_TYPE_IVEC4(7),
    /**
     *
     */
    GLOBAL_VAR_TYPE_RECT2I(8),
    /**
     *
     */
    GLOBAL_VAR_TYPE_UINT(9),
    /**
     *
     */
    GLOBAL_VAR_TYPE_UVEC2(10),
    /**
     *
     */
    GLOBAL_VAR_TYPE_UVEC3(11),
    /**
     *
     */
    GLOBAL_VAR_TYPE_UVEC4(12),
    /**
     *
     */
    GLOBAL_VAR_TYPE_FLOAT(13),
    /**
     *
     */
    GLOBAL_VAR_TYPE_VEC2(14),
    /**
     *
     */
    GLOBAL_VAR_TYPE_VEC3(15),
    /**
     *
     */
    GLOBAL_VAR_TYPE_VEC4(16),
    /**
     *
     */
    GLOBAL_VAR_TYPE_COLOR(17),
    /**
     *
     */
    GLOBAL_VAR_TYPE_RECT2(18),
    /**
     *
     */
    GLOBAL_VAR_TYPE_MAT2(19),
    /**
     *
     */
    GLOBAL_VAR_TYPE_MAT3(20),
    /**
     *
     */
    GLOBAL_VAR_TYPE_MAT4(21),
    /**
     *
     */
    GLOBAL_VAR_TYPE_TRANSFORM_2D(22),
    /**
     *
     */
    GLOBAL_VAR_TYPE_TRANSFORM(23),
    /**
     *
     */
    GLOBAL_VAR_TYPE_SAMPLER2D(24),
    /**
     *
     */
    GLOBAL_VAR_TYPE_SAMPLER2DARRAY(25),
    /**
     *
     */
    GLOBAL_VAR_TYPE_SAMPLER3D(26),
    /**
     *
     */
    GLOBAL_VAR_TYPE_SAMPLERCUBE(27),
    /**
     *
     */
    GLOBAL_VAR_TYPE_MAX(28),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class RenderingInfo(
    id: Long
  ) {
    /**
     *
     */
    RENDERING_INFO_TOTAL_OBJECTS_IN_FRAME(0),
    /**
     *
     */
    RENDERING_INFO_TOTAL_PRIMITIVES_IN_FRAME(1),
    /**
     *
     */
    RENDERING_INFO_TOTAL_DRAW_CALLS_IN_FRAME(2),
    /**
     *
     */
    RENDERING_INFO_TEXTURE_MEM_USED(3),
    /**
     *
     */
    RENDERING_INFO_BUFFER_MEM_USED(4),
    /**
     *
     */
    RENDERING_INFO_VIDEO_MEM_USED(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Features(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}
