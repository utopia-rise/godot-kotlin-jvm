// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.StringName
import godot.core.Transform3D
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
 * [godot.Mesh] type that provides utility for constructing a surface from arrays.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/3d/procedural_geometry/arraymesh.html]($DOCS_URL/tutorials/3d/procedural_geometry/arraymesh.html)
 *
 * The [godot.ArrayMesh] is used to construct a [godot.Mesh] by specifying the attributes as arrays.
 *
 * The most basic example is the creation of a single triangle:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var vertices = PackedVector3Array()
 *
 * vertices.push_back(Vector3(0, 1, 0))
 *
 * vertices.push_back(Vector3(1, 0, 0))
 *
 * vertices.push_back(Vector3(0, 0, 1))
 *
 *
 *
 * # Initialize the ArrayMesh.
 *
 * var arr_mesh = ArrayMesh.new()
 *
 * var arrays = []
 *
 * arrays.resize(Mesh.ARRAY_MAX)
 *
 * arrays[godot.Mesh.ARRAY_VERTEX] = vertices
 *
 *
 *
 * # Create the Mesh.
 *
 * arr_mesh.add_surface_from_arrays(Mesh.PRIMITIVE_TRIANGLES, arrays)
 *
 * var m = MeshInstance3D.new()
 *
 * m.mesh = arr_mesh
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var vertices = new Vector3[]
 *
 * {
 *
 *     new Vector3(0, 1, 0),
 *
 *     new Vector3(1, 0, 0),
 *
 *     new Vector3(0, 0, 1),
 *
 * };
 *
 *
 *
 * // Initialize the ArrayMesh.
 *
 * var arrMesh = new ArrayMesh();
 *
 * var arrays = new Godot.Collections.Array();
 *
 * arrays.Resize((int)Mesh.ArrayType.Max);
 *
 * arrays[(int)Mesh.ArrayType.Vertex] = vertices;
 *
 *
 *
 * // Create the Mesh.
 *
 * arrMesh.AddSurfaceFromArrays(Mesh.PrimitiveType.Triangles, arrays);
 *
 * var m = new MeshInstance3D();
 *
 * m.Mesh = arrMesh;
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * The [godot.MeshInstance3D] is ready to be added to the [godot.SceneTree] to be shown.
 *
 * See also [godot.ImmediateMesh], [godot.MeshDataTool] and [godot.SurfaceTool] for procedural geometry generation.
 *
 * **Note:** Godot uses clockwise [winding order](https://learnopengl.com/Advanced-OpenGL/Face-culling) for front faces of triangle primitive modes.
 */
@GodotBaseType
public open class ArrayMesh : Mesh() {
  /**
   * Sets the blend shape mode to one of [enum Mesh.BlendShapeMode].
   */
  public var blendShapeMode: Mesh.BlendShapeMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_BLEND_SHAPE_MODE,
          LONG)
      return Mesh.BlendShapeMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SET_BLEND_SHAPE_MODE,
          NIL)
    }

  /**
   * Overrides the [AABB] with one defined by user for use with frustum culling. Especially useful to avoid unexpected culling when using a shader to offset vertices.
   */
  public var customAabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_CUSTOM_AABB,
          godot.core.VariantType.AABB)
      return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
    }
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SET_CUSTOM_AABB, NIL)
    }

  /**
   * An optional mesh which is used for rendering shadows and can be used for the depth prepass. Can be used to increase performance of shadow rendering by using a mesh that only contains vertex position data (without normals, UVs, colors, etc.).
   */
  public var shadowMesh: ArrayMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_SHADOW_MESH, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SET_SHADOW_MESH, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ARRAYMESH, scriptIndex)
    return true
  }

  /**
   * Adds name for a blend shape that will be added with [addSurfaceFromArrays]. Must be called before surface is added.
   */
  public fun addBlendShape(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_ADD_BLEND_SHAPE, NIL)
  }

  /**
   * Returns the number of blend shapes that the [godot.ArrayMesh] holds.
   */
  public fun getBlendShapeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_BLEND_SHAPE_COUNT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the name of the blend shape at this index.
   */
  public fun getBlendShapeName(index: Int): StringName {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_BLEND_SHAPE_NAME,
        STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Sets the name of the blend shape at this index.
   */
  public fun setBlendShapeName(index: Int, name: StringName): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SET_BLEND_SHAPE_NAME, NIL)
  }

  /**
   * Removes all blend shapes from this [godot.ArrayMesh].
   */
  public fun clearBlendShapes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_CLEAR_BLEND_SHAPES, NIL)
  }

  /**
   * Creates a new surface. [godot.Mesh.getSurfaceCount] will become the `surf_idx` for this new surface.
   *
   * Surfaces are created to be rendered using a [primitive], which may be any of the values defined in [enum Mesh.PrimitiveType].
   *
   * The [arrays] argument is an array of arrays. Each of the [godot.Mesh.ARRAY_MAX] elements contains an array with some of the mesh data for this surface as described by the corresponding member of [enum Mesh.ArrayType] or `null` if it is not used by the surface. For example, `arrays[0]` is the array of vertices. That first vertex sub-array is always required; the others are optional. Adding an index array puts this surface into "index mode" where the vertex and other arrays become the sources of data and the index array defines the vertex order. All sub-arrays must have the same length as the vertex array (or be an exact multiple of the vertex array's length, when multiple elements of a sub-array correspond to a single vertex) or be empty, except for [godot.Mesh.ARRAY_INDEX] if it is used.
   *
   * The [blendShapes] argument is an array of vertex data for each blend shape. Each element is an array of the same structure as [arrays], but [godot.Mesh.ARRAY_VERTEX], [godot.Mesh.ARRAY_NORMAL], and [godot.Mesh.ARRAY_TANGENT] are set if and only if they are set in [arrays] and all other entries are `null`.
   *
   * The [lods] argument is a dictionary with [float] keys and [godot.PackedInt32Array] values. Each entry in the dictionary represents a LOD level of the surface, where the value is the [godot.Mesh.ARRAY_INDEX] array to use for the LOD level and the key is roughly proportional to the distance at which the LOD stats being used. I.e., increasing the key of a LOD also increases the distance that the objects has to be from the camera before the LOD is used.
   *
   * The [flags] argument is the bitwise or of, as required: One value of [enum Mesh.ArrayCustomFormat] left shifted by `ARRAY_FORMAT_CUSTOMn_SHIFT` for each custom channel in use, [godot.Mesh.ARRAY_FLAG_USE_DYNAMIC_UPDATE], [godot.Mesh.ARRAY_FLAG_USE_8_BONE_WEIGHTS], or [godot.Mesh.ARRAY_FLAG_USES_EMPTY_VERTEX_ARRAY].
   *
   * **Note:** When using indices, it is recommended to only use points, lines, or triangles.
   */
  @JvmOverloads
  public fun addSurfaceFromArrays(
    primitive: Mesh.PrimitiveType,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<VariantArray<Any?>> = godot.core.variantArrayOf(),
    lods: Dictionary<Any?, Any?> = Dictionary(),
    flags: Long = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to primitive.id, ARRAY to arrays, ARRAY to blendShapes, DICTIONARY to lods, OBJECT to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_ADD_SURFACE_FROM_ARRAYS,
        NIL)
  }

  /**
   * Removes all surfaces from this [godot.ArrayMesh].
   */
  public fun clearSurfaces(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_CLEAR_SURFACES, NIL)
  }

  /**
   *
   */
  public fun surfaceUpdateVertexRegion(
    surfIdx: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_UPDATE_VERTEX_REGION, NIL)
  }

  /**
   *
   */
  public fun surfaceUpdateAttributeRegion(
    surfIdx: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_UPDATE_ATTRIBUTE_REGION, NIL)
  }

  /**
   *
   */
  public fun surfaceUpdateSkinRegion(
    surfIdx: Int,
    offset: Int,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_UPDATE_SKIN_REGION, NIL)
  }

  /**
   * Returns the length in vertices of the vertex array in the requested surface (see [addSurfaceFromArrays]).
   */
  public fun surfaceGetArrayLen(surfIdx: Int): Int {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_ARRAY_LEN,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the length in indices of the index array in the requested surface (see [addSurfaceFromArrays]).
   */
  public fun surfaceGetArrayIndexLen(surfIdx: Int): Int {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_ARRAY_INDEX_LEN, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the format mask of the requested surface (see [addSurfaceFromArrays]).
   */
  public fun surfaceGetFormat(surfIdx: Int): Long {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_FORMAT,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, false) as Long)
  }

  /**
   * Returns the primitive type of the requested surface (see [addSurfaceFromArrays]).
   */
  public fun surfaceGetPrimitiveType(surfIdx: Int): Mesh.PrimitiveType {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_PRIMITIVE_TYPE, LONG)
    return Mesh.PrimitiveType.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Returns the index of the first surface with this name held within this [godot.ArrayMesh]. If none are found, -1 is returned.
   */
  public fun surfaceFindByName(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_FIND_BY_NAME,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets a name for a given surface.
   */
  public fun surfaceSetName(surfIdx: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_SET_NAME, NIL)
  }

  /**
   * Gets the name assigned to this surface.
   */
  public fun surfaceGetName(surfIdx: Int): String {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_NAME, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Regenerates tangents for each of the [godot.ArrayMesh]'s surfaces.
   */
  public fun regenNormalMaps(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_REGEN_NORMAL_MAPS, NIL)
  }

  /**
   * Performs a UV unwrap on the [godot.ArrayMesh] to prepare the mesh for lightmapping.
   */
  public fun lightmapUnwrap(transform: Transform3D, texelSize: Float): GodotError {
    TransferContext.writeArguments(TRANSFORM3D to transform, DOUBLE to texelSize.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_LIGHTMAP_UNWRAP, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public companion object
}
