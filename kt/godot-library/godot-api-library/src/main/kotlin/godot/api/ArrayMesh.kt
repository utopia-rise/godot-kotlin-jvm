// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.AABB
import godot.core.Dictionary
import godot.core.Error
import godot.core.PackedByteArray
import godot.core.StringName
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.TRANSFORM3D
import godot.core.asCachedStringName
import kotlin.Any
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * The [ArrayMesh] is used to construct a [Mesh] by specifying the attributes as arrays.
 *
 * The most basic example is the creation of a single triangle:
 *
 * ```gdscript
 * //gdscript
 * var vertices = PackedVector3Array()
 * vertices.push_back(Vector3(0, 1, 0))
 * vertices.push_back(Vector3(1, 0, 0))
 * vertices.push_back(Vector3(0, 0, 1))
 *
 * # Initialize the ArrayMesh.
 * var arr_mesh = ArrayMesh.new()
 * var arrays = []
 * arrays.resize(Mesh.ARRAY_MAX)
 * arrays[Mesh.ARRAY_VERTEX] = vertices
 *
 * # Create the Mesh.
 * arr_mesh.add_surface_from_arrays(Mesh.PRIMITIVE_TRIANGLES, arrays)
 * var m = MeshInstance3D.new()
 * m.mesh = arr_mesh
 * ```
 *
 * ```csharp
 * //csharp
 * Vector3[] vertices =
 * [
 *     new Vector3(0, 1, 0),
 *     new Vector3(1, 0, 0),
 *     new Vector3(0, 0, 1),
 * ];
 *
 * // Initialize the ArrayMesh.
 * var arrMesh = new ArrayMesh();
 * Godot.Collections.Array arrays = [];
 * arrays.Resize((int)Mesh.ArrayType.Max);
 * arrays[(int)Mesh.ArrayType.Vertex] = vertices;
 *
 * // Create the Mesh.
 * arrMesh.AddSurfaceFromArrays(Mesh.PrimitiveType.Triangles, arrays);
 * var m = new MeshInstance3D();
 * m.Mesh = arrMesh;
 * ```
 *
 * The [MeshInstance3D] is ready to be added to the [SceneTree] to be shown.
 *
 * See also [ImmediateMesh], [MeshDataTool] and [SurfaceTool] for procedural geometry generation.
 *
 * **Note:** Godot uses clockwise [url=https://learnopengl.com/Advanced-OpenGL/Face-culling]winding
 * order[/url] for front faces of triangle primitive modes.
 */
@GodotBaseType
public open class ArrayMesh : Mesh() {
  /**
   * Sets the blend shape mode to one of [Mesh.BlendShapeMode].
   */
  public final inline var blendShapeMode: Mesh.BlendShapeMode
    @JvmName("blendShapeModeProperty")
    get() = getBlendShapeMode()
    @JvmName("blendShapeModeProperty")
    set(`value`) {
      setBlendShapeMode(value)
    }

  /**
   * Overrides the [AABB] with one defined by user for use with frustum culling. Especially useful
   * to avoid unexpected culling when using a shader to offset vertices.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var customAabb: AABB
    @JvmName("customAabbProperty")
    get() = getCustomAabb()
    @JvmName("customAabbProperty")
    set(`value`) {
      setCustomAabb(value)
    }

  /**
   * An optional mesh which can be used for rendering shadows and the depth prepass. Can be used to
   * increase performance by supplying a mesh with fused vertices and only vertex position data
   * (without normals, UVs, colors, etc.).
   *
   * **Note:** This mesh must have exactly the same vertex positions as the source mesh (including
   * the source mesh's LODs, if present). If vertex positions differ, then the mesh will not draw
   * correctly.
   */
  public final inline var shadowMesh: ArrayMesh?
    @JvmName("shadowMeshProperty")
    get() = getShadowMesh()
    @JvmName("shadowMeshProperty")
    set(`value`) {
      setShadowMesh(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(40, scriptIndex)
  }

  /**
   * This is a helper function for [customAabb] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = arraymesh.customAabb
   * //Your changes
   * arraymesh.customAabb = myCoreType
   * ``````
   *
   * Overrides the [AABB] with one defined by user for use with frustum culling. Especially useful
   * to avoid unexpected culling when using a shader to offset vertices.
   */
  @CoreTypeHelper
  public final fun customAabbMutate(block: AABB.() -> Unit): AABB = customAabb.apply {
     block(this)
     customAabb = this
  }

  /**
   * Adds name for a blend shape that will be added with [addSurfaceFromArrays]. Must be called
   * before surface is added.
   */
  public final fun addBlendShape(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.addBlendShapePtr, NIL)
  }

  /**
   * Returns the number of blend shapes that the [ArrayMesh] holds.
   */
  public final fun getBlendShapeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBlendShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the name of the blend shape at this index.
   */
  public final fun getBlendShapeName(index: Int): StringName {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBlendShapeNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Sets the name of the blend shape at this index.
   */
  public final fun setBlendShapeName(index: Int, name: StringName): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.setBlendShapeNamePtr, NIL)
  }

  /**
   * Removes all blend shapes from this [ArrayMesh].
   */
  public final fun clearBlendShapes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearBlendShapesPtr, NIL)
  }

  public final fun setBlendShapeMode(mode: Mesh.BlendShapeMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setBlendShapeModePtr, NIL)
  }

  public final fun getBlendShapeMode(): Mesh.BlendShapeMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBlendShapeModePtr, LONG)
    return Mesh.BlendShapeMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Creates a new surface. [Mesh.getSurfaceCount] will become the `surf_idx` for this new surface.
   *
   * Surfaces are created to be rendered using a [primitive], which may be any of the values defined
   * in [Mesh.PrimitiveType].
   *
   * The [arrays] argument is an array of arrays. Each of the [Mesh.ARRAY_MAX] elements contains an
   * array with some of the mesh data for this surface as described by the corresponding member of
   * [Mesh.ArrayType] or `null` if it is not used by the surface. For example, `arrays[0]` is the array
   * of vertices. That first vertex sub-array is always required; the others are optional. Adding an
   * index array puts this surface into "index mode" where the vertex and other arrays become the
   * sources of data and the index array defines the vertex order. All sub-arrays must have the same
   * length as the vertex array (or be an exact multiple of the vertex array's length, when multiple
   * elements of a sub-array correspond to a single vertex) or be empty, except for [Mesh.ARRAY_INDEX]
   * if it is used.
   *
   * The [blendShapes] argument is an array of vertex data for each blend shape. Each element is an
   * array of the same structure as [arrays], but [Mesh.ARRAY_VERTEX], [Mesh.ARRAY_NORMAL], and
   * [Mesh.ARRAY_TANGENT] are set if and only if they are set in [arrays] and all other entries are
   * `null`.
   *
   * The [lods] argument is a dictionary with [float] keys and [PackedInt32Array] values. Each entry
   * in the dictionary represents an LOD level of the surface, where the value is the
   * [Mesh.ARRAY_INDEX] array to use for the LOD level and the key is roughly proportional to the
   * distance at which the LOD stats being used. I.e., increasing the key of an LOD also increases the
   * distance that the objects has to be from the camera before the LOD is used.
   *
   * The [flags] argument is the bitwise OR of, as required: One value of [Mesh.ArrayCustomFormat]
   * left shifted by `ARRAY_FORMAT_CUSTOMn_SHIFT` for each custom channel in use,
   * [Mesh.ARRAY_FLAG_USE_DYNAMIC_UPDATE], [Mesh.ARRAY_FLAG_USE_8_BONE_WEIGHTS], or
   * [Mesh.ARRAY_FLAG_USES_EMPTY_VERTEX_ARRAY].
   *
   * **Note:** When using indices, it is recommended to only use points, lines, or triangles.
   */
  @JvmOverloads
  public final fun addSurfaceFromArrays(
    primitive: Mesh.PrimitiveType,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<VariantArray<Any?>> = godot.core.variantArrayOf(),
    lods: Dictionary<Any?, Any?> = Dictionary(),
    flags: Mesh.ArrayFormat = Mesh.ArrayFormat(0),
  ): Unit {
    TransferContext.writeArguments(LONG to primitive.id, ARRAY to arrays, ARRAY to blendShapes, DICTIONARY to lods, LONG to flags.flag)
    TransferContext.callMethod(ptr, MethodBindings.addSurfaceFromArraysPtr, NIL)
  }

  /**
   * Removes all surfaces from this [ArrayMesh].
   */
  public final fun clearSurfaces(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearSurfacesPtr, NIL)
  }

  /**
   * Removes the surface at the given index from the Mesh, shifting surfaces with higher index down
   * by one.
   */
  public final fun surfaceRemove(surfIdx: Int): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.surfaceRemovePtr, NIL)
  }

  public final fun surfaceUpdateVertexRegion(
    surfIdx: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(ptr, MethodBindings.surfaceUpdateVertexRegionPtr, NIL)
  }

  public final fun surfaceUpdateAttributeRegion(
    surfIdx: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(ptr, MethodBindings.surfaceUpdateAttributeRegionPtr, NIL)
  }

  public final fun surfaceUpdateSkinRegion(
    surfIdx: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(ptr, MethodBindings.surfaceUpdateSkinRegionPtr, NIL)
  }

  /**
   * Returns the length in vertices of the vertex array in the requested surface (see
   * [addSurfaceFromArrays]).
   */
  public final fun surfaceGetArrayLen(surfIdx: Int): Int {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.surfaceGetArrayLenPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the length in indices of the index array in the requested surface (see
   * [addSurfaceFromArrays]).
   */
  public final fun surfaceGetArrayIndexLen(surfIdx: Int): Int {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.surfaceGetArrayIndexLenPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the format mask of the requested surface (see [addSurfaceFromArrays]).
   */
  public final fun surfaceGetFormat(surfIdx: Int): Mesh.ArrayFormat {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.surfaceGetFormatPtr, LONG)
    return Mesh.ArrayFormat(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the primitive type of the requested surface (see [addSurfaceFromArrays]).
   */
  public final fun surfaceGetPrimitiveType(surfIdx: Int): Mesh.PrimitiveType {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.surfaceGetPrimitiveTypePtr, LONG)
    return Mesh.PrimitiveType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the index of the first surface with this name held within this [ArrayMesh]. If none are
   * found, -1 is returned.
   */
  public final fun surfaceFindByName(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.surfaceFindByNamePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets a name for a given surface.
   */
  public final fun surfaceSetName(surfIdx: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.surfaceSetNamePtr, NIL)
  }

  /**
   * Gets the name assigned to this surface.
   */
  public final fun surfaceGetName(surfIdx: Int): String {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.surfaceGetNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Regenerates tangents for each of the [ArrayMesh]'s surfaces.
   */
  public final fun regenNormalMaps(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.regenNormalMapsPtr, NIL)
  }

  /**
   * Performs a UV unwrap on the [ArrayMesh] to prepare the mesh for lightmapping.
   */
  public final fun lightmapUnwrap(transform: Transform3D, texelSize: Float): Error {
    TransferContext.writeArguments(TRANSFORM3D to transform, DOUBLE to texelSize.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.lightmapUnwrapPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCustomAabb(aabb: AABB): Unit {
    TransferContext.writeArguments(godot.core.VariantParser.AABB to aabb)
    TransferContext.callMethod(ptr, MethodBindings.setCustomAabbPtr, NIL)
  }

  public final fun getCustomAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCustomAabbPtr, godot.core.VariantParser.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantParser.AABB) as AABB)
  }

  public final fun setShadowMesh(mesh: ArrayMesh?): Unit {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(ptr, MethodBindings.setShadowMeshPtr, NIL)
  }

  public final fun getShadowMesh(): ArrayMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShadowMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ArrayMesh?)
  }

  /**
   * Adds name for a blend shape that will be added with [addSurfaceFromArrays]. Must be called
   * before surface is added.
   */
  public final fun addBlendShape(name: String) = addBlendShape(name.asCachedStringName())

  /**
   * Sets the name of the blend shape at this index.
   */
  public final fun setBlendShapeName(index: Int, name: String) =
      setBlendShapeName(index, name.asCachedStringName())

  public companion object

  public object MethodBindings {
    internal val addBlendShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "add_blend_shape", 3304788590)

    internal val getBlendShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_blend_shape_count", 3905245786)

    internal val getBlendShapeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_blend_shape_name", 659327637)

    internal val setBlendShapeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "set_blend_shape_name", 3780747571)

    internal val clearBlendShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "clear_blend_shapes", 3218959716)

    internal val setBlendShapeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "set_blend_shape_mode", 227983991)

    internal val getBlendShapeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_blend_shape_mode", 836485024)

    internal val addSurfaceFromArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "add_surface_from_arrays", 1796411378)

    internal val clearSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "clear_surfaces", 3218959716)

    internal val surfaceRemovePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_remove", 1286410249)

    internal val surfaceUpdateVertexRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_update_vertex_region", 3837166854)

    internal val surfaceUpdateAttributeRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_update_attribute_region", 3837166854)

    internal val surfaceUpdateSkinRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_update_skin_region", 3837166854)

    internal val surfaceGetArrayLenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_array_len", 923996154)

    internal val surfaceGetArrayIndexLenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_array_index_len", 923996154)

    internal val surfaceGetFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_format", 3718287884)

    internal val surfaceGetPrimitiveTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_primitive_type", 4141943888)

    internal val surfaceFindByNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_find_by_name", 1321353865)

    internal val surfaceSetNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_set_name", 501894301)

    internal val surfaceGetNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_name", 844755477)

    internal val regenNormalMapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "regen_normal_maps", 3218959716)

    internal val lightmapUnwrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "lightmap_unwrap", 1476641071)

    internal val setCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "set_custom_aabb", 259215842)

    internal val getCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_custom_aabb", 1068685055)

    internal val setShadowMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "set_shadow_mesh", 3377897901)

    internal val getShadowMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_shadow_mesh", 3206942465)
  }
}
