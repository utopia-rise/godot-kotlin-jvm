// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Mesh.ArrayFormatValue
import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * The [ArrayMesh] is used to construct a [Mesh] by specifying the attributes as arrays.
 * The most basic example is the creation of a single triangle:
 *
 * gdscript:
 * ```gdscript
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
 * csharp:
 * ```csharp
 * var vertices = new Vector3[]
 * {
 *     new Vector3(0, 1, 0),
 *     new Vector3(1, 0, 0),
 *     new Vector3(0, 0, 1),
 * };
 *
 * // Initialize the ArrayMesh.
 * var arrMesh = new ArrayMesh();
 * var arrays = new Godot.Collections.Array();
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
 * See also [ImmediateMesh], [MeshDataTool] and [SurfaceTool] for procedural geometry generation.
 * **Note:** Godot uses clockwise [url=https://learnopengl.com/Advanced-OpenGL/Face-culling]winding
 * order[/url] for front faces of triangle primitive modes.
 */
@GodotBaseType
public open class ArrayMesh : Mesh() {
  /**
   * Sets the blend shape mode to one of [Mesh.BlendShapeMode].
   */
  public var blendShapeMode: Mesh.BlendShapeMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBlendShapeModePtr, LONG)
      return Mesh.BlendShapeMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBlendShapeModePtr, NIL)
    }

  /**
   * Overrides the [AABB] with one defined by user for use with frustum culling. Especially useful
   * to avoid unexpected culling when using a shader to offset vertices.
   */
  @CoreTypeLocalCopy
  public var customAabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomAabbPtr,
          godot.core.VariantType.AABB)
      return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
    }
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomAabbPtr, NIL)
    }

  /**
   * An optional mesh which can be used for rendering shadows and the depth prepass. Can be used to
   * increase performance by supplying a mesh with fused vertices and only vertex position data
   * (without normals, UVs, colors, etc.).
   * **Note:** This mesh must have exactly the same vertex positions as the source mesh (including
   * the source mesh's LODs, if present). If vertex positions differ, then the mesh will not draw
   * correctly.
   */
  public var shadowMesh: ArrayMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShadowMeshPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowMeshPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ARRAYMESH, scriptIndex)
    return true
  }

  /**
   * Overrides the [AABB] with one defined by user for use with frustum culling. Especially useful
   * to avoid unexpected culling when using a shader to offset vertices.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = arraymesh.customAabb
   * //Your changes
   * arraymesh.customAabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun customAabbMutate(block: AABB.() -> Unit): AABB = customAabb.apply{
      block(this)
      customAabb = this
  }


  /**
   * Adds name for a blend shape that will be added with [addSurfaceFromArrays]. Must be called
   * before surface is added.
   */
  public fun addBlendShape(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.addBlendShapePtr, NIL)
  }

  /**
   * Returns the number of blend shapes that the [ArrayMesh] holds.
   */
  public fun getBlendShapeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the name of the blend shape at this index.
   */
  public fun getBlendShapeName(index: Int): StringName {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendShapeNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Sets the name of the blend shape at this index.
   */
  public fun setBlendShapeName(index: Int, name: StringName): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setBlendShapeNamePtr, NIL)
  }

  /**
   * Removes all blend shapes from this [ArrayMesh].
   */
  public fun clearBlendShapes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBlendShapesPtr, NIL)
  }

  /**
   * Creates a new surface. [Mesh.getSurfaceCount] will become the `surf_idx` for this new surface.
   * Surfaces are created to be rendered using a [primitive], which may be any of the values defined
   * in [Mesh.PrimitiveType].
   * The [arrays] argument is an array of arrays. Each of the [Mesh.ARRAY_MAX] elements contains an
   * array with some of the mesh data for this surface as described by the corresponding member of
   * [Mesh.ArrayType] or `null` if it is not used by the surface. For example, `arrays[0]` is the array
   * of vertices. That first vertex sub-array is always required; the others are optional. Adding an
   * index array puts this surface into "index mode" where the vertex and other arrays become the
   * sources of data and the index array defines the vertex order. All sub-arrays must have the same
   * length as the vertex array (or be an exact multiple of the vertex array's length, when multiple
   * elements of a sub-array correspond to a single vertex) or be empty, except for [Mesh.ARRAY_INDEX]
   * if it is used.
   * The [blendShapes] argument is an array of vertex data for each blend shape. Each element is an
   * array of the same structure as [arrays], but [Mesh.ARRAY_VERTEX], [Mesh.ARRAY_NORMAL], and
   * [Mesh.ARRAY_TANGENT] are set if and only if they are set in [arrays] and all other entries are
   * `null`.
   * The [lods] argument is a dictionary with [float] keys and [PackedInt32Array] values. Each entry
   * in the dictionary represents an LOD level of the surface, where the value is the
   * [Mesh.ARRAY_INDEX] array to use for the LOD level and the key is roughly proportional to the
   * distance at which the LOD stats being used. I.e., increasing the key of an LOD also increases the
   * distance that the objects has to be from the camera before the LOD is used.
   * The [flags] argument is the bitwise or of, as required: One value of [Mesh.ArrayCustomFormat]
   * left shifted by `ARRAY_FORMAT_CUSTOMn_SHIFT` for each custom channel in use,
   * [Mesh.ARRAY_FLAG_USE_DYNAMIC_UPDATE], [Mesh.ARRAY_FLAG_USE_8_BONE_WEIGHTS], or
   * [Mesh.ARRAY_FLAG_USES_EMPTY_VERTEX_ARRAY].
   * **Note:** When using indices, it is recommended to only use points, lines, or triangles.
   */
  @JvmOverloads
  public fun addSurfaceFromArrays(
    primitive: Mesh.PrimitiveType,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<VariantArray<Any?>> = godot.core.variantArrayOf(),
    lods: Dictionary<Any?, Any?> = Dictionary(),
    flags: Mesh.ArrayFormat = Mesh.ArrayFormatValue(0),
  ): Unit {
    TransferContext.writeArguments(LONG to primitive.id, ARRAY to arrays, ARRAY to blendShapes, DICTIONARY to lods, LONG to flags.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.addSurfaceFromArraysPtr, NIL)
  }

  /**
   * Removes all surfaces from this [ArrayMesh].
   */
  public fun clearSurfaces(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearSurfacesPtr, NIL)
  }

  public fun surfaceUpdateVertexRegion(
    surfIdx: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceUpdateVertexRegionPtr, NIL)
  }

  public fun surfaceUpdateAttributeRegion(
    surfIdx: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceUpdateAttributeRegionPtr, NIL)
  }

  public fun surfaceUpdateSkinRegion(
    surfIdx: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceUpdateSkinRegionPtr, NIL)
  }

  /**
   * Returns the length in vertices of the vertex array in the requested surface (see
   * [addSurfaceFromArrays]).
   */
  public fun surfaceGetArrayLen(surfIdx: Int): Int {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceGetArrayLenPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the length in indices of the index array in the requested surface (see
   * [addSurfaceFromArrays]).
   */
  public fun surfaceGetArrayIndexLen(surfIdx: Int): Int {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceGetArrayIndexLenPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the format mask of the requested surface (see [addSurfaceFromArrays]).
   */
  public fun surfaceGetFormat(surfIdx: Int): Mesh.ArrayFormat {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceGetFormatPtr, LONG)
    return ArrayFormatValue(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the primitive type of the requested surface (see [addSurfaceFromArrays]).
   */
  public fun surfaceGetPrimitiveType(surfIdx: Int): Mesh.PrimitiveType {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceGetPrimitiveTypePtr, LONG)
    return Mesh.PrimitiveType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the index of the first surface with this name held within this [ArrayMesh]. If none are
   * found, -1 is returned.
   */
  public fun surfaceFindByName(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceFindByNamePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets a name for a given surface.
   */
  public fun surfaceSetName(surfIdx: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceSetNamePtr, NIL)
  }

  /**
   * Gets the name assigned to this surface.
   */
  public fun surfaceGetName(surfIdx: Int): String {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceGetNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Regenerates tangents for each of the [ArrayMesh]'s surfaces.
   */
  public fun regenNormalMaps(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.regenNormalMapsPtr, NIL)
  }

  /**
   * Performs a UV unwrap on the [ArrayMesh] to prepare the mesh for lightmapping.
   */
  public fun lightmapUnwrap(transform: Transform3D, texelSize: Float): GodotError {
    TransferContext.writeArguments(TRANSFORM3D to transform, DOUBLE to texelSize.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapUnwrapPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val addBlendShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "add_blend_shape")

    public val getBlendShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_blend_shape_count")

    public val getBlendShapeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_blend_shape_name")

    public val setBlendShapeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "set_blend_shape_name")

    public val clearBlendShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "clear_blend_shapes")

    public val setBlendShapeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "set_blend_shape_mode")

    public val getBlendShapeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_blend_shape_mode")

    public val addSurfaceFromArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "add_surface_from_arrays")

    public val clearSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "clear_surfaces")

    public val surfaceUpdateVertexRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_update_vertex_region")

    public val surfaceUpdateAttributeRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_update_attribute_region")

    public val surfaceUpdateSkinRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_update_skin_region")

    public val surfaceGetArrayLenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_array_len")

    public val surfaceGetArrayIndexLenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_array_index_len")

    public val surfaceGetFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_format")

    public val surfaceGetPrimitiveTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_primitive_type")

    public val surfaceFindByNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_find_by_name")

    public val surfaceSetNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_set_name")

    public val surfaceGetNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_name")

    public val regenNormalMapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "regen_normal_maps")

    public val lightmapUnwrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "lightmap_unwrap")

    public val setCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "set_custom_aabb")

    public val getCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_custom_aabb")

    public val setShadowMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "set_shadow_mesh")

    public val getShadowMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_shadow_mesh")
  }
}
