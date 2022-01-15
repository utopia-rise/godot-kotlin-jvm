// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.Mesh
import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import kotlin.Any
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

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
 * ```
 * 		var vertices = PoolVector3Array()
 * 		vertices.push_back(Vector3(0, 1, 0))
 * 		vertices.push_back(Vector3(1, 0, 0))
 * 		vertices.push_back(Vector3(0, 0, 1))
 * 		# Initialize the ArrayMesh.
 * 		var arr_mesh = ArrayMesh.new()
 * 		var arrays = []
 * 		arrays.resize(ArrayMesh.ARRAY_MAX)
 * 		arrays[godot.ArrayMesh.ARRAY_VERTEX] = vertices
 * 		# Create the Mesh.
 * 		arr_mesh.add_surface_from_arrays(Mesh.PRIMITIVE_TRIANGLES, arrays)
 * 		var m = MeshInstance.new()
 * 		m.mesh = arr_mesh
 * 		```
 *
 * The [godot.MeshInstance] is ready to be added to the [godot.SceneTree] to be shown.
 *
 * See also [godot.ImmediateGeometry], [godot.MeshDataTool] and [godot.SurfaceTool] for procedural geometry generation.
 *
 * **Note:** Godot uses clockwise [winding order](https://learnopengl.com/Advanced-OpenGL/Face-culling) for front faces of triangle primitive modes.
 */
@GodotBaseType
public open class ArrayMesh : Mesh() {
  /**
   * Sets the blend shape mode to one of [enum Mesh.BlendShapeMode].
   */
  public open var blendShapeMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_BLEND_SHAPE_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SET_BLEND_SHAPE_MODE,
          NIL)
    }

  /**
   * Overrides the [AABB] with one defined by user for use with frustum culling. Especially useful to avoid unexpected culling when using a shader to offset vertices.
   */
  public open var customAabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_CUSTOM_AABB,
          godot.core.VariantType.AABB)
      return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
    }
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SET_CUSTOM_AABB, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ARRAYMESH)
  }

  @CoreTypeHelper
  public open fun customAabb(schedule: AABB.() -> Unit): AABB = customAabb.apply{
      schedule(this)
      customAabb = this
  }


  /**
   * Adds name for a blend shape that will be added with [addSurfaceFromArrays]. Must be called before surface is added.
   */
  public open fun addBlendShape(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_ADD_BLEND_SHAPE, NIL)
  }

  /**
   * Creates a new surface.
   *
   * Surfaces are created to be rendered using a `primitive`, which may be any of the types defined in [enum Mesh.PrimitiveType]. (As a note, when using indices, it is recommended to only use points, lines, or triangles.) [godot.Mesh.getSurfaceCount] will become the `surf_idx` for this new surface.
   *
   * The `arrays` argument is an array of arrays. See [enum ArrayType] for the values used in this array. For example, `arrays[0]` is the array of vertices. That first vertex sub-array is always required; the others are optional. Adding an index array puts this function into "index mode" where the vertex and other arrays become the sources of data and the index array defines the vertex order. All sub-arrays must have the same length as the vertex array or be empty, except for [ARRAY_INDEX] if it is used.
   */
  public open fun addSurfaceFromArrays(
    primitive: Long,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<Any?> = VariantArray(),
    compressFlags: Long = 2194432
  ): Unit {
    TransferContext.writeArguments(LONG to primitive, ARRAY to arrays, ARRAY to blendShapes, LONG to
        compressFlags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_ADD_SURFACE_FROM_ARRAYS,
        NIL)
  }

  /**
   * Removes all blend shapes from this [godot.ArrayMesh].
   */
  public open fun clearBlendShapes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_CLEAR_BLEND_SHAPES, NIL)
  }

  /**
   * Removes all surfaces from this [godot.ArrayMesh].
   */
  public open fun clearSurfaces(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_CLEAR_SURFACES, NIL)
  }

  /**
   * Returns the number of blend shapes that the [godot.ArrayMesh] holds.
   */
  public open fun getBlendShapeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_BLEND_SHAPE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the blend shape at this index.
   */
  public open fun getBlendShapeName(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_BLEND_SHAPE_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Will perform a UV unwrap on the [godot.ArrayMesh] to prepare the mesh for lightmapping.
   */
  public open fun lightmapUnwrap(transform: Transform, texelSize: Double): GodotError {
    TransferContext.writeArguments(TRANSFORM to transform, DOUBLE to texelSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_LIGHTMAP_UNWRAP, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Will regenerate normal maps for the [godot.ArrayMesh].
   */
  public open fun regenNormalmaps(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_REGEN_NORMALMAPS, NIL)
  }

  /**
   *
   */
  public open fun setBlendShapeName(index: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to index, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SET_BLEND_SHAPE_NAME, NIL)
  }

  /**
   * Returns the index of the first surface with this name held within this [godot.ArrayMesh]. If none are found, -1 is returned.
   */
  public open fun surfaceFindByName(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_FIND_BY_NAME,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the length in indices of the index array in the requested surface (see [addSurfaceFromArrays]).
   */
  public open fun surfaceGetArrayIndexLen(surfIdx: Long): Long {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_ARRAY_INDEX_LEN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the length in vertices of the vertex array in the requested surface (see [addSurfaceFromArrays]).
   */
  public open fun surfaceGetArrayLen(surfIdx: Long): Long {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_ARRAY_LEN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the format mask of the requested surface (see [addSurfaceFromArrays]).
   */
  public open fun surfaceGetFormat(surfIdx: Long): Long {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_FORMAT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets the name assigned to this surface.
   */
  public open fun surfaceGetName(surfIdx: Long): String {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the primitive type of the requested surface (see [addSurfaceFromArrays]).
   */
  public open fun surfaceGetPrimitiveType(surfIdx: Long): Mesh.PrimitiveType {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_PRIMITIVE_TYPE, LONG)
    return Mesh.PrimitiveType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Removes a surface at position `surf_idx`, shifting greater surfaces one `surf_idx` slot down.
   */
  public open fun surfaceRemove(surfIdx: Long): Unit {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_REMOVE, NIL)
  }

  /**
   * Sets a name for a given surface.
   */
  public open fun surfaceSetName(surfIdx: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to surfIdx, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_SET_NAME, NIL)
  }

  /**
   * Updates a specified region of mesh arrays on the GPU.
   *
   * **Warning:** Only use if you know what you are doing. You can easily cause crashes by calling this function with improper arguments.
   */
  public open fun surfaceUpdateRegion(
    surfIdx: Long,
    offset: Long,
    `data`: PoolByteArray
  ): Unit {
    TransferContext.writeArguments(LONG to surfIdx, LONG to offset, POOL_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_UPDATE_REGION,
        NIL)
  }

  public enum class ArrayFormat(
    id: Long
  ) {
    /**
     * Array format will include vertices (mandatory).
     */
    ARRAY_FORMAT_VERTEX(1),
    /**
     * Array format will include normals.
     */
    ARRAY_FORMAT_NORMAL(2),
    /**
     * Array format will include tangents.
     */
    ARRAY_FORMAT_TANGENT(4),
    /**
     * Array format will include a color array.
     */
    ARRAY_FORMAT_COLOR(8),
    /**
     * Array format will include UVs.
     */
    ARRAY_FORMAT_TEX_UV(16),
    /**
     * Array format will include another set of UVs.
     */
    ARRAY_FORMAT_TEX_UV2(32),
    /**
     * Array format will include bone indices.
     */
    ARRAY_FORMAT_BONES(64),
    /**
     * Array format will include bone weights.
     */
    ARRAY_FORMAT_WEIGHTS(128),
    /**
     * Index array will be used.
     */
    ARRAY_FORMAT_INDEX(256),
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
     * [godot.core.PoolVector3Array], [godot.core.PoolVector2Array], or [godot.Array] of vertex positions.
     */
    ARRAY_VERTEX(0),
    /**
     * [godot.core.PoolVector3Array] of vertex normals.
     */
    ARRAY_NORMAL(1),
    /**
     * [godot.core.PoolRealArray] of vertex tangents. Each element in groups of 4 floats, first 3 floats determine the tangent, and the last the binormal direction as -1 or 1.
     */
    ARRAY_TANGENT(2),
    /**
     * [godot.core.PoolColorArray] of vertex colors.
     */
    ARRAY_COLOR(3),
    /**
     * [godot.core.PoolVector2Array] for UV coordinates.
     */
    ARRAY_TEX_UV(4),
    /**
     * [godot.core.PoolVector2Array] for second UV coordinates.
     */
    ARRAY_TEX_UV2(5),
    /**
     * [godot.core.PoolRealArray] or [godot.core.PoolIntArray] of bone indices. Each element in groups of 4 floats.
     */
    ARRAY_BONES(6),
    /**
     * [godot.core.PoolRealArray] of bone weights. Each element in groups of 4 floats.
     */
    ARRAY_WEIGHTS(7),
    /**
     * [godot.core.PoolIntArray] of integers used as indices referencing vertices, colors, normals, tangents, and textures. All of those arrays must have the same number of elements as the vertex array. No index can be beyond the vertex array size. When this index array is present, it puts the function into "index mode," where the index selects the *i*'th vertex, normal, tangent, color, UV, etc. This means if you want to have different normals or colors along an edge, you have to duplicate the vertices.
     *
     * For triangles, the index array is interpreted as triples, referring to the vertices of each triangle. For lines, the index array is in pairs indicating the start and end of each line.
     */
    ARRAY_INDEX(8),
    /**
     * Represents the size of the [enum ArrayType] enum.
     */
    ARRAY_MAX(9),
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
     * [godot.core.PoolRealArray] or [godot.core.PoolIntArray] of bone indices. Each element in groups of 4 floats.
     */
    public final const val ARRAY_BONES: Long = 6

    /**
     * [godot.core.PoolColorArray] of vertex colors.
     */
    public final const val ARRAY_COLOR: Long = 3

    /**
     * Array format will include bone indices.
     */
    public final const val ARRAY_FORMAT_BONES: Long = 64

    /**
     * Array format will include a color array.
     */
    public final const val ARRAY_FORMAT_COLOR: Long = 8

    /**
     * Index array will be used.
     */
    public final const val ARRAY_FORMAT_INDEX: Long = 256

    /**
     * Array format will include normals.
     */
    public final const val ARRAY_FORMAT_NORMAL: Long = 2

    /**
     * Array format will include tangents.
     */
    public final const val ARRAY_FORMAT_TANGENT: Long = 4

    /**
     * Array format will include UVs.
     */
    public final const val ARRAY_FORMAT_TEX_UV: Long = 16

    /**
     * Array format will include another set of UVs.
     */
    public final const val ARRAY_FORMAT_TEX_UV2: Long = 32

    /**
     * Array format will include vertices (mandatory).
     */
    public final const val ARRAY_FORMAT_VERTEX: Long = 1

    /**
     * Array format will include bone weights.
     */
    public final const val ARRAY_FORMAT_WEIGHTS: Long = 128

    /**
     * [godot.core.PoolIntArray] of integers used as indices referencing vertices, colors, normals, tangents, and textures. All of those arrays must have the same number of elements as the vertex array. No index can be beyond the vertex array size. When this index array is present, it puts the function into "index mode," where the index selects the *i*'th vertex, normal, tangent, color, UV, etc. This means if you want to have different normals or colors along an edge, you have to duplicate the vertices.
     *
     * For triangles, the index array is interpreted as triples, referring to the vertices of each triangle. For lines, the index array is in pairs indicating the start and end of each line.
     */
    public final const val ARRAY_INDEX: Long = 8

    /**
     * Represents the size of the [enum ArrayType] enum.
     */
    public final const val ARRAY_MAX: Long = 9

    /**
     * [godot.core.PoolVector3Array] of vertex normals.
     */
    public final const val ARRAY_NORMAL: Long = 1

    /**
     * [godot.core.PoolRealArray] of vertex tangents. Each element in groups of 4 floats, first 3 floats determine the tangent, and the last the binormal direction as -1 or 1.
     */
    public final const val ARRAY_TANGENT: Long = 2

    /**
     * [godot.core.PoolVector2Array] for UV coordinates.
     */
    public final const val ARRAY_TEX_UV: Long = 4

    /**
     * [godot.core.PoolVector2Array] for second UV coordinates.
     */
    public final const val ARRAY_TEX_UV2: Long = 5

    /**
     * [godot.core.PoolVector3Array], [godot.core.PoolVector2Array], or [godot.Array] of vertex positions.
     */
    public final const val ARRAY_VERTEX: Long = 0

    /**
     * [godot.core.PoolRealArray] of bone weights. Each element in groups of 4 floats.
     */
    public final const val ARRAY_WEIGHTS: Long = 7

    /**
     * Amount of weights/bone indices per vertex (always 4).
     */
    public final const val ARRAY_WEIGHTS_SIZE: Long = 4

    /**
     * Default value used for index_array_len when no indices are present.
     */
    public final const val NO_INDEX_ARRAY: Long = -1
  }
}
