// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Mesh
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.StringName
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
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
 * var vertices = new Godot.Collections.Array<Vector3>();
 *
 * vertices.Add(new Vector3(0, 1, 0));
 *
 * vertices.Add(new Vector3(1, 0, 0));
 *
 * vertices.Add(new Vector3(0, 0, 1));
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
 * var m = new MeshInstance();
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
  public var blendShapeMode: Long
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
  public var customAabb: AABB
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

  /**
   *
   */
  public var shadowMesh: ArrayMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_SHADOW_MESH, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SET_SHADOW_MESH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ARRAYMESH)
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
  public fun getBlendShapeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_BLEND_SHAPE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the blend shape at this index.
   */
  public fun getBlendShapeName(index: Long): StringName {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_BLEND_SHAPE_NAME,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Sets the name of the blend shape at this index.
   */
  public fun setBlendShapeName(index: Long, name: StringName): Unit {
    TransferContext.writeArguments(LONG to index, STRING_NAME to name)
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
   * Creates a new surface.
   *
   * Surfaces are created to be rendered using a `primitive`, which may be any of the types defined in [enum Mesh.PrimitiveType]. (As a note, when using indices, it is recommended to only use points, lines, or triangles.) [godot.Mesh.getSurfaceCount] will become the `surf_idx` for this new surface.
   *
   * The `arrays` argument is an array of arrays. See [enum Mesh.ArrayType] for the values used in this array. For example, `arrays[0]` is the array of vertices. That first vertex sub-array is always required; the others are optional. Adding an index array puts this function into "index mode" where the vertex and other arrays become the sources of data and the index array defines the vertex order. All sub-arrays must have the same length as the vertex array or be empty, except for [godot.Mesh.ARRAY_INDEX] if it is used.
   */
  public fun addSurfaceFromArrays(
    primitive: Mesh.PrimitiveType,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<Any?> = godot.core.variantArrayOf(),
    lods: Dictionary<Any?, Any?> = Dictionary(),
    compressFlags: Long = 0
  ): Unit {
    TransferContext.writeArguments(LONG to primitive.id, ARRAY to arrays, ARRAY to blendShapes, DICTIONARY to lods, LONG to compressFlags)
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
    surfIdx: Long,
    offset: Long,
    `data`: PackedByteArray
  ): Unit {
    TransferContext.writeArguments(LONG to surfIdx, LONG to offset, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_UPDATE_VERTEX_REGION, NIL)
  }

  /**
   *
   */
  public fun surfaceUpdateAttributeRegion(
    surfIdx: Long,
    offset: Long,
    `data`: PackedByteArray
  ): Unit {
    TransferContext.writeArguments(LONG to surfIdx, LONG to offset, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_UPDATE_ATTRIBUTE_REGION, NIL)
  }

  /**
   *
   */
  public fun surfaceUpdateSkinRegion(
    surfIdx: Long,
    offset: Long,
    `data`: PackedByteArray
  ): Unit {
    TransferContext.writeArguments(LONG to surfIdx, LONG to offset, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_UPDATE_SKIN_REGION, NIL)
  }

  /**
   * Returns the length in vertices of the vertex array in the requested surface (see [addSurfaceFromArrays]).
   */
  public fun surfaceGetArrayLen(surfIdx: Long): Long {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_ARRAY_LEN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the length in indices of the index array in the requested surface (see [addSurfaceFromArrays]).
   */
  public fun surfaceGetArrayIndexLen(surfIdx: Long): Long {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_ARRAY_INDEX_LEN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the format mask of the requested surface (see [addSurfaceFromArrays]).
   */
  public fun surfaceGetFormat(surfIdx: Long): Long {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_FORMAT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the primitive type of the requested surface (see [addSurfaceFromArrays]).
   */
  public fun surfaceGetPrimitiveType(surfIdx: Long): Mesh.PrimitiveType {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_PRIMITIVE_TYPE, LONG)
    return Mesh.PrimitiveType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the index of the first surface with this name held within this [godot.ArrayMesh]. If none are found, -1 is returned.
   */
  public fun surfaceFindByName(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_FIND_BY_NAME,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets a name for a given surface.
   */
  public fun surfaceSetName(surfIdx: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to surfIdx, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_SET_NAME, NIL)
  }

  /**
   * Gets the name assigned to this surface.
   */
  public fun surfaceGetName(surfIdx: Long): String {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Will regenerate normal maps for the [godot.ArrayMesh].
   */
  public fun regenNormalMaps(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_REGEN_NORMAL_MAPS, NIL)
  }

  /**
   * Will perform a UV unwrap on the [godot.ArrayMesh] to prepare the mesh for lightmapping.
   */
  public fun lightmapUnwrap(transform: Transform3D, texelSize: Double): GodotError {
    TransferContext.writeArguments(TRANSFORM3D to transform, DOUBLE to texelSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_LIGHTMAP_UNWRAP, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public companion object
}
